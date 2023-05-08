# jmeter 
 
# Bad smells
I found 1276 bad smells with 170 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 163 | false |
| DuplicatedCode | 135 | false |
| UnusedAssignment | 108 | false |
| DataFlowIssue | 67 | false |
| UnnecessaryToStringCall | 62 | true |
| FieldCanBeLocal | 47 | false |
| ConstantValue | 42 | false |
| ToArrayCallWithZeroLengthArrayArgument | 37 | true |
| FinalMethodInFinalClass | 35 | false |
| ArraysAsListWithZeroOrOneArgument | 35 | false |
| UnstableApiUsage | 32 | false |
| JavadocLinkAsPlainText | 29 | false |
| UnnecessaryCallToStringValueOf | 27 | false |
| TrivialIf | 23 | false |
| UnnecessaryLocalVariable | 22 | true |
| IOStreamConstructor | 21 | false |
| UnnecessaryModifier | 20 | true |
| FinalStaticMethod | 20 | false |
| StringBufferReplaceableByString | 20 | false |
| HasPlatformType | 17 | false |
| DeprecatedIsStillUsed | 16 | false |
| RedundantCast | 15 | false |
| NullableProblems | 14 | false |
| SuspiciousMethodCalls | 13 | false |
| DuplicateThrows | 12 | false |
| StringConcatenationInsideStringBufferAppend | 12 | false |
| StringOperationCanBeSimplified | 11 | false |
| RedundantArrayCreation | 11 | true |
| DanglingJavadoc | 9 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 8 | false |
| MagicConstant | 7 | false |
| IgnoreResultOfCall | 7 | false |
| NonStrictComparisonCanBeEquality | 7 | true |
| AutoCloseableResource | 7 | false |
| KotlinUnusedImport | 7 | false |
| RefusedBequest | 6 | false |
| UnnecessaryReturn | 6 | true |
| SimplifiableConditionalExpression | 6 | false |
| FinalPrivateMethod | 5 | false |
| JUnitMixedFramework | 5 | false |
| SuspiciousNameCombination | 5 | false |
| JavadocReference | 5 | false |
| UnnecessaryStringEscape | 5 | true |
| SpringXmlModelInspection | 5 | false |
| MismatchedJavadocCode | 5 | false |
| SimplifyStreamApiCallChains | 4 | false |
| PlaceholderCountMatchesArgumentCount | 4 | false |
| LeakingThis | 4 | false |
| CharsetObjectCanBeUsed | 4 | false |
| NewClassNamingConvention | 4 | false |
| RedundantFileCreation | 4 | false |
| DuplicateExpressions | 4 | false |
| RegExpSuspiciousBackref | 4 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 4 | false |
| WrapperTypeMayBePrimitive | 3 | false |
| RedundantTypeArguments | 3 | false |
| AccessStaticViaInstance | 3 | false |
| UnnecessarySemicolon | 3 | false |
| RegExpSimplifiable | 3 | false |
| UNCHECKED_WARNING | 3 | false |
| CommentedOutCode | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| ManualMinMaxCalculation | 2 | false |
| InfiniteLoopStatement | 2 | false |
| JUnitMalformedDeclaration | 2 | false |
| DivideByZero | 2 | false |
| RedundantCollectionOperation | 2 | false |
| CatchMayIgnoreException | 2 | false |
| RegExpSingleCharAlternation | 2 | false |
| NumericOverflow | 2 | false |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| EqualsWithItself | 1 | false |
| PointlessArithmeticExpression | 1 | false |
| RegExpRedundantEscape | 1 | false |
| RedundantMethodOverride | 1 | false |
| ListRemoveInLoop | 1 | false |
| UnaryPlus | 1 | false |
| InstantiatingObjectToGetClassObject | 1 | false |
| ReassignedToPlainText | 1 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| UseBulkOperation | 1 | false |
| UsePropertyAccessSyntax | 1 | false |
| ConditionalBreakInInfiniteLoop | 1 | false |
| MoveLambdaOutsideParentheses | 1 | false |
| MismatchedStringBuilderQueryUpdate | 1 | false |
| ThrowablePrintedToSystemOut | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| MemberVisibilityCanBePrivate | 1 | false |
| FuseStreamOperations | 1 | false |
| PointlessNullCheck | 1 | false |
| OptionalIsPresent | 1 | false |
| RedundantLengthCheck | 1 | false |
| InjectedReferences | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| RemoveEmptyParenthesesFromLambdaCall | 1 | false |
| CloneDeclaresCloneNotSupported | 1 | false |
| CopyConstructorMissesField | 1 | false |
| UnusedSymbol | 1 | false |
## RuleId[id=EqualsWithItself]
### EqualsWithItself
`assertEquals()` called on itself
in `src/protocol/junit-sample/src/main/java/test/DummyAnnotatedTest.java`
#### Snippet
```java
    @Test
    public void objectCompareFail(){
        assertEquals(new Object(),new Object());
    }
}
```

## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[lang.size()\]'
in `src/core/src/main/java/org/apache/jmeter/gui/util/JMeterMenuBar.java`
#### Snippet
```java
                    .forEachOrdered(lang::add);
        }
        return lang.toArray(new String[lang.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new JMeterTreeNode\[nodes.size()\]'
in `src/core/src/main/java/org/apache/jmeter/gui/action/Copy.java`
#### Snippet
```java
        }

        return nodes.toArray(new JMeterTreeNode[nodes.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new AbstractThreadGroup\[nodes.size()\]'
in `src/core/src/main/java/org/apache/jmeter/gui/action/Start.java`
#### Snippet
```java
            }
        }
        return nodes.toArray(new AbstractThreadGroup[nodes.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new ActionListener\[listenerSet.size()\]'
in `src/core/src/main/java/org/apache/jmeter/gui/action/ActionRouter.java`
#### Snippet
```java
            Set<ActionListener> listenerSet = actionListeners.get(action.getName());
            if (listenerSet != null && !listenerSet.isEmpty()) {
                ActionListener[] listeners = listenerSet.toArray(new ActionListener[listenerSet.size()]);
                for (ActionListener listener : listeners) {
                    listener.actionPerformed(e);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[allTemplates.size()\]'
in `src/core/src/main/java/org/apache/jmeter/gui/action/template/TemplateManager.java`
#### Snippet
```java
     */
    public String[] getTemplateNames() {
        return allTemplates.keySet().toArray(new String[allTemplates.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[nameMap.size()\]'
in `src/core/src/main/java/org/apache/jmeter/util/JSR223BeanInfoSupport.java`
#### Snippet
```java
            }
        }
        LANGUAGE_TAGS = nameMap.keySet().toArray(new String[nameMap.size()]);
        Arrays.sort(LANGUAGE_TAGS);
        CONSTANT_LANGUAGE_NAMES = new String[nameMap.size()][2];
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[list.size()\]'
in `src/core/src/main/java/org/apache/jmeter/save/CSVSaveService.java`
#### Snippet
```java
            }
        }
        return list.toArray(new String[list.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[aliasesList.size()\]'
in `src/core/src/main/java/org/apache/jmeter/util/keystore/JmeterKeyStore.java`
#### Snippet
```java
         * Note: if is == null and no pkcs11 store is configured, the arrays will be empty
         */
        this.names = aliasesList.toArray(new String[aliasesList.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[functions.size()\]'
in `src/core/src/main/java/org/apache/jmeter/engine/util/CompoundVariable.java`
#### Snippet
```java
    // For use by FunctionHelper
    public static String[] getFunctionNames() {
        return functions.keySet().toArray(new String[functions.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[paths.size()\]'
in `src/core/src/main/java/org/apache/jmeter/testbeans/gui/TestBeanGUI.java`
#### Snippet
```java
            paths.addAll(Arrays.asList(JOrphanUtils.split(s, ",", "")));// $NON-NLS-1$ // $NON-NLS-2$
        }
        PropertyEditorManager.setEditorSearchPath(paths.toArray(new String[paths.size()]));
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new AssertionResult\[assertionResults.size()\]'
in `src/core/src/main/java/org/apache/jmeter/samplers/SampleResult.java`
#### Snippet
```java
            return EMPTY_AR;
        }
        return assertionResults.toArray(new AssertionResult[assertionResults.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new SampleResult\[subResults.size()\]'
in `src/core/src/main/java/org/apache/jmeter/samplers/SampleResult.java`
#### Snippet
```java
            return EMPTY_SR;
        }
        return subResults.toArray(new SampleResult[subResults.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[strList.size()\]'
in `src/jorphan/src/main/java/org/apache/jorphan/util/JOrphanUtils.java`
#### Snippet
```java
            strList.add(def);
        }
        return strList.toArray(new String[strList.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[returns.size()\]'
in `src/jorphan/src/main/java/org/apache/jorphan/util/JOrphanUtils.java`
#### Snippet
```java
            returns.add(EMPTY_ELEMENT);
        }
        return returns.toArray(new String[returns.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new URL\[jars.size()\]'
in `src/launcher/src/main/java/org/apache/jmeter/NewDriver.java`
#### Snippet
```java
        return java.security.AccessController.doPrivileged(
                (java.security.PrivilegedAction<DynamicClassLoader>) () ->
                        new DynamicClassLoader(jars.toArray(new URL[jars.size()]))
        );
    }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new HTTPFileArg\[httpFileArgs.size()\]'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/action/ParseCurlCommandAction.java`
#### Snippet
```java
        }
        if (!httpFileArgs.isEmpty()) {
            httpSampler.setHTTPFiles(httpFileArgs.toArray(new HTTPFileArg[httpFileArgs.size()]));
        }
    }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[result.size()\]'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
            throw new IllegalArgumentException("unbalanced quotes in " + toProcess);
        }
        return result.toArray(new String[result.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new TestElement\[children.size()\]'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/Proxy.java`
#### Snippet
```java
                target.deliverSampler(sampler,
                         children
                                .toArray(new TestElement[children.size()]),
                        result);
            }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[validMethodList.size()\]'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/gui/UrlConfigDefaults.java`
#### Snippet
```java
    public String[] getValidMethods() {
        if (validMethodList != null) {
            return validMethodList.toArray(new String[validMethodList.size()]);
        }
        return HTTPSamplerBase.getValidMethodsAsArray();
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new InetAddress\[addresses.size()\]'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/DNSCacheManager.java`
#### Snippet
```java
                }
            }
            return addresses.toArray(new InetAddress[addresses.size()]);
        }
        return new InetAddress[0];
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[LOG_PARSER_CLASSES.size()\]'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/AccessLogSamplerBeanInfo.java`
#### Snippet
```java

            log.debug("found parsers: {}", LOG_PARSER_CLASSES);
            p.setValue(TAGS, LOG_PARSER_CLASSES.toArray(new String[LOG_PARSER_CLASSES.size()]));

            p = property("filterClassName"); // $NON-NLS-1$
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[classes.size()\]'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/AccessLogSamplerBeanInfo.java`
#### Snippet
```java
            List<String> classes = ClassFinder.findClassesThatExtend(JMeterUtils.getSearchPaths(),
                    new Class[] { Filter.class }, false);
            p.setValue(TAGS, classes.toArray(new String[classes.size()]));

            p = property("logFile"); // $NON-NLS-1$
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Header\[allHeaders.size()\]'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPJavaImpl.java`
#### Snippet
```java
                    allHeaders.add((Header) jMeterProperty.getObjectValue());
                }
                return allHeaders.toArray(new Header[allHeaders.size()]);
            }
        }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Header\[result.size()\]'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/CacheManager.java`
#### Snippet
```java
            result.add(new HeaderAdapter(header));
        }
        return result.toArray(new Header[result.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Header\[result.size()\]'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/CacheManager.java`
#### Snippet
```java
            }
        }
        return result.toArray(new Header[result.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[modesSet.size()\]'
in `src/protocol/jdbc/src/main/java/org/apache/jmeter/protocol/jdbc/config/DataSourceElementBeanInfo.java`
#### Snippet
```java
        p.setValue(NOT_EXPRESSION, Boolean.TRUE);
        Set<String> modesSet = TRANSACTION_ISOLATION_MAP.keySet();
        String[] modes = modesSet.toArray(new String[modesSet.size()]);
        p.setValue(TAGS, modes);
        p = property("poolPreparedStatements");
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[METHODLIST.size()\]'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java`
#### Snippet
```java

    public static String[] getValidMethodsAsArray() {
        return METHODLIST.toArray(new String[METHODLIST.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[list.size()\]'
in `src/protocol/junit/src/main/java/org/apache/jmeter/protocol/java/control/gui/JUnitTestSamplerGui.java`
#### Snippet
```java
        }
        if (!list.isEmpty()){
            return list.toArray(new String[list.size()]);
        }
        return new String[0];
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CompoundVariable\[parameters.size()\]'
in `src/functions/src/main/java/org/apache/jmeter/functions/ChangeCase.java`
#### Snippet
```java
    public void setParameters(Collection<CompoundVariable> parameters) throws InvalidVariableException {
        checkParameterCount(parameters, MIN_PARAMETER_COUNT, MAX_PARAMETER_COUNT);
        values = parameters.toArray(new CompoundVariable[parameters.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CompoundVariable\[parameters.size()\]'
in `src/functions/src/main/java/org/apache/jmeter/functions/IsPropDefined.java`
#### Snippet
```java
        checkParameterCount(parameters, MIN_PARAMETER_COUNT,
                MAX_PARAMETER_COUNT);
        values = parameters.toArray(new CompoundVariable[parameters.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CompoundVariable\[parameters.size()\]'
in `src/functions/src/main/java/org/apache/jmeter/functions/DigestEncodeFunction.java`
#### Snippet
```java
    public void setParameters(Collection<CompoundVariable> parameters) throws InvalidVariableException {
        checkParameterCount(parameters, MIN_PARAMETER_COUNT, MAX_PARAMETER_COUNT);
        values = parameters.toArray(new CompoundVariable[parameters.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CompoundVariable\[parameters.size()\]'
in `src/functions/src/main/java/org/apache/jmeter/functions/IsVarDefined.java`
#### Snippet
```java
        checkParameterCount(parameters, MIN_PARAMETER_COUNT,
                MAX_PARAMETER_COUNT);
        values = parameters.toArray(new CompoundVariable[parameters.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CompoundVariable\[parameters.size()\]'
in `src/functions/src/main/java/org/apache/jmeter/functions/RandomString.java`
#### Snippet
```java
    public void setParameters(Collection<CompoundVariable> parameters) throws InvalidVariableException {
        checkParameterCount(parameters, MIN_PARAM_COUNT, MAX_PARAM_COUNT);
        values = parameters.toArray(new CompoundVariable[parameters.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CompoundVariable\[parameters.size()\]'
in `src/functions/src/main/java/org/apache/jmeter/functions/EscapeOroRegexpChars.java`
#### Snippet
```java
    public void setParameters(Collection<CompoundVariable> parameters) throws InvalidVariableException {
        checkParameterCount(parameters, MIN_PARAM_COUNT, MAX_PARAM_COUNT);
        values = parameters.toArray(new CompoundVariable[parameters.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CompoundVariable\[parameters.size()\]'
in `src/functions/src/main/java/org/apache/jmeter/functions/DateTimeConvertFunction.java`
#### Snippet
```java
    public void setParameters(Collection<CompoundVariable> parameters) throws InvalidVariableException {
        checkParameterCount(parameters, MIN_PARAMETER_COUNT, MAX_PARAMETER_COUNT);
        values = parameters.toArray(new CompoundVariable[parameters.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CompoundVariable\[parameters.size()\]'
in `src/functions/src/main/java/org/apache/jmeter/functions/RandomDate.java`
#### Snippet
```java

        checkParameterCount(parameters, MIN_PARAMETER_COUNT, MAX_PARAMETER_COUNT);
        values = parameters.toArray(new CompoundVariable[parameters.size()]);
        // Create the cache
        if (dateRandomFormatterCache == null) {
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new TreeNode\[newPath.size()\]'
in `src/components/src/main/java/org/apache/jmeter/visualizers/ViewResultsFullVisualizer.java`
#### Snippet
```java

    private static TreePath toTreePath(List<TreeNode> newPath) {
        return new TreePath(newPath.toArray(new TreeNode[newPath.size()]));
    }

```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `src/core/src/main/java/org/apache/jmeter/report/config/ReportGeneratorConfiguration.java`
#### Snippet
```java
                }
                String key = chunk.substring(0, colonSeparator).trim();
                Long satisfied = Long.valueOf(chunk.substring(colonSeparator + 1, pipeSeparator).trim());
                Long tolerated = Long.valueOf(chunk.substring(pipeSeparator + 1).trim());
                specificApdexes.put(key, new Long[] {satisfied, tolerated});
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/core/src/main/java/org/apache/jmeter/report/config/ReportGeneratorConfiguration.java`
#### Snippet
```java
                String key = chunk.substring(0, colonSeparator).trim();
                Long satisfied = Long.valueOf(chunk.substring(colonSeparator + 1, pipeSeparator).trim());
                Long tolerated = Long.valueOf(chunk.substring(pipeSeparator + 1).trim());
                specificApdexes.put(key, new Long[] {satisfied, tolerated});
            }
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/core/src/main/java/org/apache/jmeter/report/processor/graph/AbstractVersusRequestsGraphConsumer.java`
#### Snippet
```java
                        // Ask parent to consume the altered sample
                        Long requestsPerGranularity = counts.get(getTimeInterval(sample));
                        Long requestsPerSecond = requestsPerGranularity * 1000 / parent.getGranularity();
                        parent.consumeBase(
                                createIndexedSample(sample, i, requestsPerSecond), i);
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/core/src/main/java/org/apache/jmeter/gui/TreeState.java`
#### Snippet
```java
    }

    static final class TreeStateImpl implements TreeState {

        // GUI tree expansion state
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/core/src/main/java/org/apache/jmeter/gui/TreeState.java`
#### Snippet
```java
    void restore(GuiPackage guiInstance);

    static final TreeState NOTHING = (GuiPackage guiInstance) -> {};

    /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/core/src/main/java/org/apache/jmeter/gui/TreeState.java`
#### Snippet
```java
    void restore(GuiPackage guiInstance);

    static final TreeState NOTHING = (GuiPackage guiInstance) -> {};

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/core/src/main/java/org/apache/jmeter/gui/TreeState.java`
#### Snippet
```java
     * @return {@link TreeState}
     */
    public static TreeState from(GuiPackage guiPackage) {
        if (guiPackage == null) {
            return NOTHING;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/core/src/main/java/org/apache/jmeter/gui/logging/GuiLogEventListener.java`
#### Snippet
```java
     * @param logEventObject log event object
     */
    public void processLogEvent(LogEventObject logEventObject);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/core/src/main/java/org/apache/jmeter/control/IteratingController.java`
#### Snippet
```java
     * Start next iteration ("continue" keyword equivalent in loops)
     */
    public void startNextLoop();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/core/src/main/java/org/apache/jmeter/control/IteratingController.java`
#### Snippet
```java
     * Break loop ("break" keyword equivalent)
     */
    public void breakLoop();

    /**
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `src/core/src/main/java/org/apache/jmeter/samplers/AsynchSampleSender.java`
#### Snippet
```java

    // Create unique object as marker for end of queue
    private static transient final SampleEvent FINAL_EVENT = new SampleEvent();

    private static final int DEFAULT_QUEUE_SIZE = 100;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/render/Renderers.java`
#### Snippet
```java
    }

    public static <T> MessageRenderer<T> getInstance(Class<T> type) {
        return RendererFactory.getInstance().getInstance(type);
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/render/Renderers.java`
#### Snippet
```java
    }

    public static MessageRenderer<Serializable> getObject() {
        return RendererFactory.getInstance().getObject();
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/render/Renderers.java`
#### Snippet
```java
    }

    public static MessageRenderer<Map<String,Object>> getMap() {
        return RendererFactory.getInstance().getMap();
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/render/Renderers.java`
#### Snippet
```java
    }

    public static MessageRenderer<byte[]> getBinary() {
        return RendererFactory.getInstance().getBinary();
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/render/Renderers.java`
#### Snippet
```java
public interface Renderers {

    public static MessageRenderer<String> getText() {
        return RendererFactory.getInstance().getText();
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/functions/src/main/java/org/apache/jmeter/functions/ChangeCase.java`
#### Snippet
```java
        private final String mode;

        private ChangeCaseMode(String mode) {
            this.mode = mode;
        }
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/BackendListener.java`
#### Snippet
```java

    // Create unique object as marker for end of queue
    private static final transient SampleResult FINAL_SAMPLE_RESULT = new SampleResult();

    /*
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/InfluxdbMetricsSender.java`
#### Snippet
```java
     * Write metrics to InfluxDB with HTTP API with InfluxDB's Line Protocol
     */
    public void writeAndSendMetrics();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/InfluxdbMetricsSender.java`
#### Snippet
```java
     * @param field       field set for InfluxDB
     */
    public void addMetric(String measurement, String tag, String field);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/InfluxdbMetricsSender.java`
#### Snippet
```java
     * @param timestamp   timestamp for InfluxDB
     */
    public void addMetric(String measurement, String tag, String field, long timestamp);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/InfluxdbMetricsSender.java`
#### Snippet
```java
     * Destroy sender
     */
    public void destroy();

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/InfluxdbMetricsSender.java`
#### Snippet
```java
     * @throws Exception when setup fails
     */
    public void setup(String influxDBUrl, String influxDBToken) throws Exception; // NOSONAR

    /**
```

## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: ItemEvent.SELECTED, ItemEvent.DESELECTED
in `src/core/src/main/java/org/apache/jmeter/gui/util/TristateCheckBox.java`
#### Snippet
```java
                fireItemStateChanged(new ItemEvent(
                        this, ItemEvent.ITEM_STATE_CHANGED, this,
                        indeterminate));
            }
        }
```

### MagicConstant
Should be one of: Calendar.ERA, Calendar.YEAR, Calendar.MONTH, Calendar.WEEK_OF_YEAR, Calendar.WEEK_OF_MONTH, ...
in `src/core/src/main/java/org/apache/jmeter/gui/util/JDateField.java`
#### Snippet
```java
        int field = posToField(pos);
        if (shifted) {
            c.roll(field, true);
        } else {
            c.add(field, addend);
```

### MagicConstant
Should be one of: Calendar.ERA, Calendar.YEAR, Calendar.MONTH, Calendar.WEEK_OF_YEAR, Calendar.WEEK_OF_MONTH, ...
in `src/core/src/main/java/org/apache/jmeter/gui/util/JDateField.java`
#### Snippet
```java
            c.roll(field, true);
        } else {
            c.add(field, addend);
        }
        String newDate = dateFormat.format(c.getTime());
```

### MagicConstant
Should be one of: InputEvent.SHIFT_MASK, InputEvent.CTRL_MASK, InputEvent.META_MASK, InputEvent.ALT_MASK, ... or their combination
in `src/core/src/main/java/org/apache/jmeter/gui/action/KeyStrokes.java`
#### Snippet
```java
        @SuppressWarnings("deprecation")
        final int modifiersEx = e.getModifiersEx()  | e.getModifiers();// Hack to get full modifier value
        return e.getKeyCode() == k.getKeyCode() && modifiersEx == k.getModifiers();
    }
}
```

### MagicConstant
Should be one of: Connection.TRANSACTION_NONE, Connection.TRANSACTION_READ_UNCOMMITTED, ...
in `src/protocol/jdbc/src/main/java/org/apache/jmeter/protocol/jdbc/config/DataSourceElement.java`
#### Snippet
```java
            Connection conn=dsc.getConnection();
            int isolation = DataSourceElementBeanInfo.getTransactionIsolationMode(getTransactionIsolation());
            if (isolation >= 0 && conn.getTransactionIsolation() != isolation) {
                try {
                    // make sure setting the new isolation mode is done in an auto committed transaction
```

### MagicConstant
Should be one of: Connection.TRANSACTION_NONE, Connection.TRANSACTION_READ_UNCOMMITTED, ...
in `src/protocol/jdbc/src/main/java/org/apache/jmeter/protocol/jdbc/config/DataSourceElement.java`
#### Snippet
```java
                try {
                    // make sure setting the new isolation mode is done in an auto committed transaction
                    conn.setTransactionIsolation(isolation);
                    log.debug("Setting transaction isolation: {}@{}",
                            isolation, System.identityHashCode(dsc));
```

### MagicConstant
Should be one of: BasicStroke.JOIN_BEVEL, BasicStroke.JOIN_MITER, BasicStroke.JOIN_ROUND
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphChart.java`
#### Snippet
```java
            legendProperties.setPlacement(legendPlacement);
            legendProperties.setIconBorderPaint(Color.WHITE);
            legendProperties.setIconBorderStroke(new BasicStroke(0f, BasicStroke.CAP_SQUARE, BasicStroke.CAP_SQUARE));
            // Manage legend placement
            legendProperties.setNumColumns(LegendAreaProperties.COLUMNS_FIT_TO_IMAGE);
```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`1L * BACKUP_MAX_HOURS * MS_PER_HOUR` can be replaced with 'BACKUP_MAX_HOURS \* MS_PER_HOUR'
in `src/core/src/main/java/org/apache/jmeter/gui/action/Save.java`
#### Snippet
```java
    private static List<File> expiredBackupFiles(List<File> backupFiles) {
        if (BACKUP_MAX_HOURS > 0) {
            final long expiryMillis = System.currentTimeMillis() - (1L * BACKUP_MAX_HOURS * MS_PER_HOUR);
            return backupFiles.stream().filter(file -> file.lastModified() < expiryMillis).collect(Collectors.toList());
        } else {
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (4 lines)
in `src/core/src/main/java/org/apache/jmeter/testelement/AbstractTestElement.java`
#### Snippet
```java
     */
    // This would be sensible, but does not work:
    // public int hashCode()
    // {
    // return propMap.hashCode();
```

### CommentedOutCode
Commented out code (4 lines)
in `src/jorphan/src/main/java/org/apache/log/ContextMap.java`
#### Snippet
```java
     * @return the keys of items in context
     */
    /*
    public String[] getKeys()
    {
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/HTTPArgumentsPanel.java`
#### Snippet
```java
                name = name.replaceAll("\\$", "_");
                name = name.replaceAll("\\{", "_");
                name = name.replaceAll("\\}", "_");
                tableModel.setValueAt("${" + name + "}", selectedRow, 1);
            }
```

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/log/LogEvent.java`
#### Snippet
```java
     * @return the message
     */
    public final String getMessage()
    {
        return m_message;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/log/LogEvent.java`
#### Snippet
```java
     * @return the ContextMap
     */
    public final ContextMap getContextMap()
    {
        return m_contextMap;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/log/LogEvent.java`
#### Snippet
```java
     * @return the LogEvent Priority
     */
    public final Priority getPriority()
    {
        return m_priority;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/log/LogEvent.java`
#### Snippet
```java
     * @param time the time
     */
    public final void setTime( final long time )
    {
        m_time = time;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/log/LogEvent.java`
#### Snippet
```java
     * @param throwable the instance of Throwable
     */
    public final void setThrowable( final Throwable throwable )
    {
        m_throwable = throwable;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/log/LogEvent.java`
#### Snippet
```java
     * @return the absolute time
     */
    public final long getTime()
    {
        return m_time;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/log/LogEvent.java`
#### Snippet
```java
     * @param category the category
     */
    public final void setCategory( final String category )
    {
        m_category = category;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/log/LogEvent.java`
#### Snippet
```java
     * @return the Throwable
     */
    public final Throwable getThrowable()
    {
        return m_throwable;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/log/LogEvent.java`
#### Snippet
```java
     * @return the name of category
     */
    public final String getCategory()
    {
        return m_category;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/log/LogEvent.java`
#### Snippet
```java
     * @param contextMap the context map
     */
    public final void setContextMap( final ContextMap contextMap )
    {
        m_contextMap = contextMap;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/log/LogEvent.java`
#### Snippet
```java
     * @param message the message
     */
    public final void setMessage( final String message )
    {
        m_message = message;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/log/LogEvent.java`
#### Snippet
```java
     * @return the time
     */
    public final long getRelativeTime()
    {
        return m_time - START_TIME;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/log/LogEvent.java`
#### Snippet
```java
     * @param priority the new LogEvent priority
     */
    public final void setPriority( final Priority priority )
    {
        m_priority = priority;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/log/ContextMap.java`
#### Snippet
```java
     * @return the current ContextMap
     */
    public static final ContextMap getCurrentContext( final boolean autocreate )
    {
        //Check security permission here???
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/log/ContextMap.java`
#### Snippet
```java
     * @param context the context map (may be null)
     */
    public static final void bind( final ContextMap context )
    {
        //Check security permission here??
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/log/ContextMap.java`
#### Snippet
```java
     * @return the current ContextMap
     */
    public static final ContextMap getCurrentContext()
    {
        return getCurrentContext( true );
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/commons/cli/avalon/CLOption.java`
#### Snippet
```java
     */
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/commons/cli/avalon/CLOption.java`
#### Snippet
```java
     * @return the (first) argument
     */
    public final String getArgument() {
        return getArgument(0);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/commons/cli/avalon/CLOption.java`
#### Snippet
```java
     * @return the number of arguments
     */
    public final int getArgumentCount() {
        if (null == this.arguments) {
            return 0;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/commons/cli/avalon/CLOption.java`
#### Snippet
```java
    }

    public final CLOptionDescriptor getDescriptor() {
        return this.descriptor;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/commons/cli/avalon/CLOption.java`
#### Snippet
```java
     * @return the argument
     */
    public final String getArgument(final int index) {
        if (this.arguments == null || index < 0 || index >= this.arguments.length) {
            return null;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/commons/cli/avalon/CLOption.java`
#### Snippet
```java
     * @return the string value
     */
    final String toShortString() {
        final StringBuilder sb = new StringBuilder();
        final char id = (char) this.descriptor.getId();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/commons/cli/avalon/CLOption.java`
#### Snippet
```java
     *            the argument
     */
    public final void addArgument(final String argument) {
        if (null == this.arguments) {
            this.arguments = new String[] { argument };
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/commons/cli/avalon/CLOptionDescriptor.java`
#### Snippet
```java
     * @return the flags
     */
    public final int getFlags() {
        return this.flags;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/commons/cli/avalon/CLOptionDescriptor.java`
#### Snippet
```java
     * @return the array of incompatible option ids
     */
    final int[] getIncompatible() {
        return this.incompatible;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/commons/cli/avalon/CLOptionDescriptor.java`
#### Snippet
```java
     * @return name/long option
     */
    public final String getName() {
        return this.name;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/commons/cli/avalon/CLOptionDescriptor.java`
#### Snippet
```java
     * @return the id
     */
    public final int getId() {
        return this.id;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/commons/cli/avalon/CLOptionDescriptor.java`
#### Snippet
```java

    @Override
    public final String toString() {
        return "[OptionDescriptor " + name + ", " + id + ", " + flags + ", " + description + "]";
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/commons/cli/avalon/CLOptionDescriptor.java`
#### Snippet
```java
     * @return the description
     */
    public final String getDescription() {
        return this.description;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/commons/cli/avalon/CLArgsParser.java`
#### Snippet
```java
     * @return the list of options
     */
    public final List<CLOption> getArguments() {
        return this.options;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/commons/cli/avalon/CLArgsParser.java`
#### Snippet
```java
     * @return the error string
     */
    public final String getErrorString() {
        return this.errorMessage;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/commons/cli/avalon/CLArgsParser.java`
#### Snippet
```java
     * @see CLOption
     */
    public final CLOption getArgumentById(final int id) {
        return this.optionIndex.get(id);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/commons/cli/avalon/CLArgsParser.java`
#### Snippet
```java
     * @see CLOption
     */
    public final CLOption getArgumentByName(final String name) {
        return this.optionIndex.get(name);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/commons/cli/avalon/CLArgsParser.java`
#### Snippet
```java
     * @return an array of unparsed args
     */
    public final String[] getUnparsedArgs() {
        return this.unparsedArgs;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/jorphan/src/main/java/org/apache/jorphan/gui/GuiUtils.java`
#### Snippet
```java
     * @param text Text to copy
     */
    public static final void copyTextToClipboard(String text) {
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection(text);
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `src/core/src/main/java/org/apache/jmeter/gui/action/OpenLinkAction.java`
#### Snippet
```java
    }

    private static final Map<String, String> initLinkMap() {
        Map<String, String> map = new HashMap<>(5);
        map.put(ActionNames.LINK_BUG_TRACKER, "https://jmeter.apache.org/issues.html");
```

### FinalPrivateMethod
'private' method declared `final`
in `src/core/src/main/java/org/apache/jmeter/engine/ClientJMeterEngine.java`
#### Snippet
```java
    }

    private static final HashMap<String, String> toHashMapOfString(Properties properties) {
        return new HashMap<>(
                properties.entrySet().stream().collect(Collectors.toMap(
```

### FinalPrivateMethod
'private' method declared `final`
in `src/core/src/main/java/org/apache/jmeter/functions/gui/FunctionHelper.java`
#### Snippet
```java
     * @return String function name with __ prefix
     */
    private static final String getFunctionName(String text) {
        return FUNCTION_PREFIX+text;
    }
```

### FinalPrivateMethod
'private' method declared `final`
in `src/core/src/main/java/org/apache/jmeter/testbeans/gui/TextAreaEditor.java`
#### Snippet
```java
    }

    private final void init() {// called from ctor, so must not be overridable
        textUI.discardAllEdits();
        textUI.addFocusListener(this);
```

### FinalPrivateMethod
'private' method declared `final`
in `src/protocol/java/src/main/java/org/apache/jmeter/protocol/java/config/gui/JavaConfigGui.java`
#### Snippet
```java
     * Initialize the GUI components and layout.
     */
    private final void init() {// called from ctor, so must not be overridable
        setLayout(new BorderLayout(0, 5));

```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `src/core/src/main/java/org/apache/jmeter/gui/action/OpenLinkAction.java`
#### Snippet
```java
    }

    private static final Map<String, String> initLinkMap() {
        Map<String, String> map = new HashMap<>(5);
        map.put(ActionNames.LINK_BUG_TRACKER, "https://jmeter.apache.org/issues.html");
```

### FinalStaticMethod
'static' method declared `final`
in `src/core/src/main/java/org/apache/jmeter/util/JSR223BeanInfoSupport.java`
#### Snippet
```java
     * @return String array of 2 columns array containing Script engine short name / Script Language details
     */
    public static final String[][] getLanguageNames() {
        return CONSTANT_LANGUAGE_NAMES.clone();
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/core/src/main/java/org/apache/jmeter/util/JMeterUtils.java`
#### Snippet
```java
     * @return {@link XStream} XStream instance following JMeter security policy
     */
    public static final XStream createXStream() {
        XStream xstream = new XStream();
        JMeterUtils.setupXStreamSecurityPolicy(xstream);
```

### FinalStaticMethod
'static' method declared `final`
in `src/core/src/main/java/org/apache/jmeter/engine/ClientJMeterEngine.java`
#### Snippet
```java
    }

    private static final HashMap<String, String> toHashMapOfString(Properties properties) {
        return new HashMap<>(
                properties.entrySet().stream().collect(Collectors.toMap(
```

### FinalStaticMethod
'static' method declared `final`
in `src/core/src/main/java/org/apache/jmeter/functions/gui/FunctionHelper.java`
#### Snippet
```java
     * @return String function name with __ prefix
     */
    private static final String getFunctionName(String text) {
        return FUNCTION_PREFIX+text;
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/core/src/main/java/org/apache/jmeter/samplers/SampleSaveConfiguration.java`
#### Snippet
```java
     * @return the getter method name
     */
    public static final String getterName(String configName) {
        return CONFIG_GETTER_PREFIX + configName;
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/core/src/main/java/org/apache/jmeter/samplers/SampleSaveConfiguration.java`
#### Snippet
```java
     * @return the setter method name
     */
    public static final String setterName(String configName) {
        return CONFIG_SETTER_PREFIX + configName;
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/jorphan/src/main/java/org/apache/log/ContextMap.java`
#### Snippet
```java
     * @return the current ContextMap
     */
    public static final ContextMap getCurrentContext( final boolean autocreate )
    {
        //Check security permission here???
```

### FinalStaticMethod
'static' method declared `final`
in `src/jorphan/src/main/java/org/apache/log/ContextMap.java`
#### Snippet
```java
     * @param context the context map (may be null)
     */
    public static final void bind( final ContextMap context )
    {
        //Check security permission here??
```

### FinalStaticMethod
'static' method declared `final`
in `src/jorphan/src/main/java/org/apache/log/ContextMap.java`
#### Snippet
```java
     * @return the current ContextMap
     */
    public static final ContextMap getCurrentContext()
    {
        return getCurrentContext( true );
```

### FinalStaticMethod
'static' method declared `final`
in `src/jorphan/src/main/java/org/apache/jorphan/gui/GuiUtils.java`
#### Snippet
```java
     * @param text Text to copy
     */
    public static final void copyTextToClipboard(String text) {
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection(text);
```

### FinalStaticMethod
'static' method declared `final`
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphProperties.java`
#### Snippet
```java
     * @return array of String containing font sizes
     */
    public static final String[] getFontSize() {
        String[] fontSize = new String[FONT_SIZE.length];
        System.arraycopy(FONT_SIZE, 0, fontSize, 0, FONT_SIZE.length);
```

### FinalStaticMethod
'static' method declared `final`
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphProperties.java`
#### Snippet
```java
     * @return array of String containing stroke widths
     */
    public static final String[] getStrokeWidth() {
        String[] strokeWidth = new String[STROKE_WIDTH.length];
        System.arraycopy(STROKE_WIDTH, 0, strokeWidth, 0, STROKE_WIDTH.length);
```

### FinalStaticMethod
'static' method declared `final`
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/AbstractInfluxdbMetricsSender.java`
#### Snippet
```java
     * \ to escape " character
     */
    static final String fieldToStringValue(String s) {
        return s.trim()
                .replace("\"", "\\\"");
```

### FinalStaticMethod
'static' method declared `final`
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/AbstractInfluxdbMetricsSender.java`
#### Snippet
```java
     * \ to escape List of special characters : commas , equal sign = spaces
     */
    static final String tagToStringValue(String s) {
        return s.trim()
                .replace(" ", "\\ ")
```

### FinalStaticMethod
'static' method declared `final`
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java
     * @return array of String containing column names
     */
    public static final String[] getColumns() {
        String[] columns = new String[COLUMNS.length];
        System.arraycopy(COLUMNS, 0, columns, 0, COLUMNS.length);
```

### FinalStaticMethod
'static' method declared `final`
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java

    // Column formats
    static final Format[] getFormatters() {
        return new Format[]{
            null, // Label
```

### FinalStaticMethod
'static' method declared `final`
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java

    // Column renderers
    static final TableCellRenderer[] getRenderers() {
        return new TableCellRenderer[]{
            null, // Label
```

### FinalStaticMethod
'static' method declared `final`
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java
    }

    static final Object[][] getGraphColumnsMsgParameters() {
        return new Object[][] {
            null,
```

### FinalStaticMethod
'static' method declared `final`
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java
    }

    static final Object[][] getColumnsMsgParameters() {
        return new Object[][] { null,
            null,
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/jorphan/src/main/java/org/apache/jorphan/gui/ObjectTableSorter.java`
#### Snippet
```java
            comparator = Stream.concat(
                    Stream.concat(
                            getPrimaryComparator() != null ? Stream.of(getPrimaryComparator()) : Stream.<Comparator<Row>>empty(),
                            getSortKeys().stream().filter(sk -> sk != null && sk.getSortOrder() != SortOrder.UNSORTED).map(this::getComparatorFromSortKey)
                    ),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/components/src/main/java/org/apache/jmeter/visualizers/RequestPanel.java`
#### Snippet
```java
    public RequestPanel() {
        listRequestView = new ArrayDeque<>();
        List<String> classesToAdd = Collections.<String> emptyList();
        try {
            classesToAdd = JMeterUtils.findClassesThatExtend(RequestView.class);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/components/src/main/java/org/apache/jmeter/visualizers/ViewResultsFullVisualizer.java`
#### Snippet
```java

        // if no results render in jmeter.properties, load Standard (default)
        List<String> classesToAdd = Collections.<String>emptyList();
        try {
            classesToAdd = JMeterUtils.findClassesThatExtend(ResultRenderer.class);
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/core/src/main/java/org/apache/jmeter/util/SlowOutputStream.java`
#### Snippet
```java
    // Also handles write(byte[])
    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        pauser.pause(len);
        out.write(b, off, len);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/core/src/main/java/org/apache/jmeter/util/SlowInputStream.java`
#### Snippet
```java
    // Also handles read(byte[])
    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        pauser.pause(len);
        return in.read(b, off, len);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/core/src/main/java/org/apache/jmeter/util/JMeterUtils.java`
#### Snippet
```java

        @Override
        protected Object handleGetObject(String key) {
            return "[" + key + "]";
        }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/core/src/main/java/org/apache/jmeter/util/JMeterUtils.java`
#### Snippet
```java

        @Override
        public Enumeration<String> getKeys() {
            return Collections.emptyEnumeration();
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/core/src/main/java/org/apache/jmeter/visualizers/TableSample.java`
#### Snippet
```java

    @Override
    public int compareTo(TableSample o) {
        TableSample oo = o;
        return (totalSamples - oo.totalSamples) < 0 ? -1 : (totalSamples == oo.totalSamples ? 0 : 1);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/jorphan/src/main/java/org/apache/jorphan/collections/HashTree.java`
#### Snippet
```java
     */
    @Override
    public void putAll(Map<?, ? extends HashTree> map) {
        if (map instanceof HashTree) {
            this.add((HashTree) map);
```

### NullableProblems
Not annotated parameter overrides @Nonnull parameter
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/CSSParseExceptionCallback.java`
#### Snippet
```java

    @Override
    public void onException(ParseException ex) {
        final String message = "Failed to parse CSS: " + baseUrl + ", "
                + LoggingCSSParseErrorHandler.createLoggingStringParseError(ex);
```

### NullableProblems
Not annotated parameter overrides @NonnullByDefault parameter
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/JsoupBasedHtmlParser.java`
#### Snippet
```java

        @Override
        public void tail(Node arg0, int arg1) {
            // Noop
        }
```

### NullableProblems
Not annotated parameter overrides @NonnullByDefault parameter
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/JsoupBasedHtmlParser.java`
#### Snippet
```java

        @Override
        public void head(Node node, int depth) {
            if (!(node instanceof Element)) {
                return;
```

### NullableProblems
Not annotated parameter overrides @Nonnull parameter
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/CssParserCacheLoader.java`
#### Snippet
```java
            @Override
            public void onUrlDeclaration(final ICSSTopLevelRule aTopLevelRule,
                    final CSSDeclaration aDeclaration,
                    final CSSExpressionMemberTermURI aURITerm) {
                // NOOP
```

### NullableProblems
Not annotated parameter overrides @Nonnull parameter
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/CssParserCacheLoader.java`
#### Snippet
```java
            public void onUrlDeclaration(final ICSSTopLevelRule aTopLevelRule,
                    final CSSDeclaration aDeclaration,
                    final CSSExpressionMemberTermURI aURITerm) {
                // NOOP
                // Browser fetch such urls only when CSS rule matches
```

### NullableProblems
Not annotated parameter overrides @Nonnull parameter
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/CssParserCacheLoader.java`
#### Snippet
```java
        CSSVisitor.visitCSSUrl(aCSS, new DefaultCSSUrlVisitor() {
            @Override
            public void onImport(CSSImportRule rule) {
                final String location = rule.getLocationString();
                if (!StringUtils.isEmpty(location)) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/hc/LaxGZIPInputStream.java`
#### Snippet
```java

    @Override
    public int read(byte[] b) throws IOException {
        try {
            return super.read(b);
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `src/components/src/main/java/org/apache/jmeter/extractor/json/jmespath/JMESPathCache.java`
#### Snippet
```java

        @Override
        public Expression<JsonNode> load(String jmesPathExpression) throws Exception {
            return runtime.compile(jmesPathExpression);
        }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/core/src/main/java/org/apache/jmeter/gui/action/Save.java`
#### Snippet
```java
        // get a file to the backup directory
        File backupDir = new File(BACKUP_DIRECTORY);
        backupDir.mkdirs();
        if (!backupDir.isDirectory()) {
            log.error(
```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `src/core/src/main/java/org/apache/jmeter/report/processor/SampleWriterConsumer.java`
#### Snippet
```java
        if (outputFile == null) {
            File wd = getWorkingDirectory();
            wd.mkdir();
            if (LOG.isInfoEnabled()) {
                LOG.info("startConsuming(): No output file set, writing to work directory :"
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/core/src/main/java/org/apache/jmeter/report/processor/SampleWriterConsumer.java`
#### Snippet
```java
            outputFile = new File(wd, "samples.csv");
        }
        outputFile.getParentFile().mkdirs();
        channelsCount = getConsumedChannelCount();
        csvWriters = new CsvSampleWriter[channelsCount];
```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `src/core/src/main/java/org/apache/jmeter/report/processor/ExternalSampleSorter.java`
#### Snippet
```java

        File workDir = getWorkingDirectory();
        workDir.mkdir();
        this.pool.prestartAllCoreThreads();
        inputSampleCount.set(0);
```

### IgnoreResultOfCall
Result of `ByteArrayInputStream.skip()` is ignored
in `src/components/src/main/java/org/apache/jmeter/visualizers/RenderAsXML.java`
#### Snippet
```java
        for (int i = 0; i < source.length - XML_PFX.length; i++) {
            if (JOrphanUtils.startsWith(source, XML_PFX, i)) {
                baIS.skip(i);// NOSONAR Skip the leading bytes (if any)
                break;
            }
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/graphite/GraphiteBackendListenerClient.java`
#### Snippet
```java
        scheduler.shutdown();
        try {
            scheduler.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            log.error("Error waiting for end of scheduler");
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/InfluxdbBackendListenerClient.java`
#### Snippet
```java
        scheduler.shutdown();
        try {
            scheduler.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            log.error("Error waiting for end of scheduler");
```

## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'org.apache.jmeter.protocol.http.proxy.HttpRequestHdr.getMultipartConfig(java.lang.String)' accessed via instance reference
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/DefaultSamplerCreator.java`
#### Snippet
```java
            // Check if it was a multipart http post request
            final String contentType = request.getContentType();
            MultipartUrlConfig urlConfig = request.getMultipartConfig(contentType);
            String contentEncoding = sampler.getContentEncoding();
            // Get the post data using the content encoding of the request
```

### AccessStaticViaInstance
Static member 'org.apache.jmeter.protocol.http.control.AuthManager.setupCredentials(org.apache.jmeter.protocol.http.control.Authorization, java.net.URL, org.apache.http.client.protocol.HttpClientContext, org.apache.http.client.CredentialsProvider, java.lang.String)' accessed via instance reference
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java`
#### Snippet
```java
                        localContext.setAuthCache(authCache);
                    }
                    authManager.setupCredentials(authorization, url, localContext, credentialsProvider, LOCALHOST);
                    AuthState authState = (AuthState) context.getAttribute(HttpClientContext.TARGET_AUTH_STATE);
                    if (authState.getAuthScheme() == null) {
```

### AccessStaticViaInstance
Static member 'org.apache.jmeter.extractor.BoundaryExtractor.extractAll(java.lang.String, java.lang.String, java.lang.String)' accessed via instance reference
in `src/components/src/main/java/org/apache/jmeter/visualizers/RenderAsBoundaryExtractor.java`
#### Snippet
```java
        BoundaryExtractor extractor = new BoundaryExtractor();

        List<String> matches = extractor.extractAll(
                boundaryExtractorFieldLeft.getText(),
                boundaryExtractorFieldRight.getText(),
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `expectsModification()` is identical to its super method
in `src/protocol/mongodb/src/main/java/org/apache/jmeter/protocol/mongodb/config/MongoSourceElement.java`
#### Snippet
```java

    @Override
    public boolean expectsModification() {
        return false;
    }
```

## RuleId[id=ListRemoveInLoop]
### ListRemoveInLoop
Can be replaced with 'List.subList().clear()'
in `src/core/src/main/java/org/apache/jmeter/gui/util/PowerTableModel.java`
#### Snippet
```java

        List<Object[]> subList = new ArrayList<>(rows.subList(start, end));
        for (int x = end - 1; x >= start; x--) {
            rows.remove(x);
        }
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `commands` are updated, but never queried
in `src/core/src/main/java/org/apache/jmeter/gui/HtmlReportUI.java`
#### Snippet
```java

public class HtmlReportUI implements ActionListener {
    private static final Set<String> commands = new HashSet<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(HtmlReportUI.class);

```

### MismatchedCollectionQueryUpdate
Contents of collection `threadGroups` are updated, but never queried
in `src/core/src/main/java/org/apache/jmeter/testelement/TestPlan.java`
#### Snippet
```java
    private static final String BASEDIR = "basedir";

    private transient List<AbstractThreadGroup> threadGroups = new ArrayList<>();

    // There's only 1 test plan, so can cache the mode here
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/core/src/main/java/org/apache/jmeter/util/HttpSSLProtocolSocketFactory.java`
#### Snippet
```java
     */
    @Override
    public Socket createSocket() throws IOException, UnknownHostException {
        SSLSocketFactory sslfac = getSSLSocketFactory();
        Socket sock = sslfac.createSocket();
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/core/src/main/java/org/apache/jmeter/util/HttpSSLProtocolSocketFactory.java`
#### Snippet
```java
    @Override
    public Socket createSocket(String host, int port, InetAddress inetAddress, int localPort)
            throws IOException, UnknownHostException {
        SSLSocketFactory sslfac = getSSLSocketFactory();
        Socket sock=sslfac.createSocket(host, port, inetAddress, localPort);
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/core/src/main/java/org/apache/jmeter/util/HttpSSLProtocolSocketFactory.java`
#### Snippet
```java

    @Override
    public Socket createSocket(String host, int port) throws IOException, UnknownHostException {
        SSLSocketFactory sslfac = getSSLSocketFactory();
        Socket sock=sslfac.createSocket(host,port);
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/LoopbackHTTPSocket.java`
#### Snippet
```java
    }

    public LoopbackHTTPSocket(String host, int port) throws UnknownHostException, IOException {
        this();
    }
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/PostWriter.java`
#### Snippet
```java

    private static void writeln(OutputStream out, String value)
    throws UnsupportedEncodingException, IOException
    {
        out.write(value.getBytes(ENCODING));
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/PostWriter.java`
#### Snippet
```java

    private static void write(OutputStream out, String value)
    throws UnsupportedEncodingException, IOException
    {
        out.write(value.getBytes(ENCODING));
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/functions/src/main/java/org/apache/jmeter/functions/XPathFileContainer.java`
#### Snippet
```java
    }

    private NodeList load(String xpath) throws IOException, FileNotFoundException, ParserConfigurationException, SAXException,
            TransformerException {
        NodeList nl = null;
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/functions/src/main/java/org/apache/jmeter/functions/XPathFileContainer.java`
#### Snippet
```java
    }

    public XPathFileContainer(String file, String xpath) throws FileNotFoundException, IOException,
            ParserConfigurationException, SAXException, TransformerException {
        log.debug("XPath({}) xpath {}", file, xpath);
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/functions/src/main/java/org/apache/jmeter/functions/FileRowColContainer.java`
#### Snippet
```java
    }

    public FileRowColContainer(String file) throws IOException, FileNotFoundException {
        log.debug("FRCC({})[{}]", file, DELIMITER);
        fileName = file;
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/functions/src/main/java/org/apache/jmeter/functions/FileRowColContainer.java`
#### Snippet
```java
    private final String delimiter;

    public FileRowColContainer(String file, String delim) throws IOException, FileNotFoundException {
        log.debug("FRCC({},{})", file, delim);
        fileName = file;
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/functions/src/main/java/org/apache/jmeter/functions/FileRowColContainer.java`
#### Snippet
```java
    }

    private void load() throws IOException, FileNotFoundException {
        try (BufferedReader myBread =
                Files.newBufferedReader(FileServer.getFileServer().getResolvedFile(fileName).toPath(),
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/functions/src/main/java/org/apache/jmeter/functions/FileWrapper.java`
#### Snippet
```java
    }

    private static FileRowColContainer getFile(String file, String alias) throws FileNotFoundException, IOException {
        FileRowColContainer frcc;
        if ((frcc = fileContainers.get(alias)) == null) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `clickCountToStart` initializer `1` is redundant
in `src/core/src/main/java/org/apache/jmeter/gui/util/TextAreaTableCellEditor.java`
#### Snippet
```java
     * initiate until a click occurs.
     */
    protected int clickCountToStart = 1;

    //
```

### UnusedAssignment
Variable `onlyDirectories` initializer `false` is redundant
in `src/core/src/main/java/org/apache/jmeter/gui/util/FilePanelEntry.java`
#### Snippet
```java
    private final String[] filetypes;

    private boolean onlyDirectories = false;

    // Mainly needed for unit test Serializable tests
```

### UnusedAssignment
Variable `table` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/gui/util/TextBoxDialoger.java`
#### Snippet
```java
    public static class TextBoxDoubleClickPressed extends MouseAdapter {

        private JTable table = null;

        public TextBoxDoubleClickPressed(JTable table) {
```

### UnusedAssignment
Variable `table` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/gui/util/TextBoxDialoger.java`
#### Snippet
```java
    public static class TextBoxDoubleClick extends MouseAdapter {

        private JTable table = null;

        public TextBoxDoubleClick(JTable table) {
```

### UnusedAssignment
Variable `i` initializer `-1` is redundant
in `src/core/src/main/java/org/apache/jmeter/gui/util/FileDialoger.java`
#### Snippet
```java
                    new File(filename) :
                    new File(lastJFCDirectory, filename));
            int i = -1;
            if ((i = filename.lastIndexOf('.')) > -1) {//$NON-NLS-1$
                ext = filename.substring(i);
```

### UnusedAssignment
Variable `runMode` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/gui/action/Start.java`
#### Snippet
```java
            boolean noTimers = e.getActionCommand().equals(ActionNames.RUN_TG_NO_TIMERS);
            boolean isValidation = e.getActionCommand().equals(ActionNames.VALIDATE_TG);
            RunMode runMode = null;
            if(isValidation) {
                runMode = RunMode.VALIDATION;
```

### UnusedAssignment
Variable `numberOfMatches` initializer `0` is redundant
in `src/core/src/main/java/org/apache/jmeter/gui/action/SearchTreeDialog.java`
#### Snippet
```java
        GuiPackage guiPackage = GuiPackage.getInstance();
        guiPackage.beginUndoTransaction();
        int numberOfMatches = 0;
        try {
            Pair<Integer, Set<JMeterTreeNode>> result = searchInTree(guiPackage, searcher, wordToSearch);
```

### UnusedAssignment
Variable `localHost` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/rmi/RmiUtils.java`
#### Snippet
```java
     */
    public static InetAddress getRmiHost() throws RemoteException {
        InetAddress localHost=null;
        // Bug 47980 - allow override of local hostname
        String host = System.getProperties().getProperty("java.rmi.server.hostname"); // $NON-NLS-1$
```

### UnusedAssignment
Variable `wrapper` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/save/SaveService.java`
#### Snippet
```java
    private static HashTree readTree(InputStream inputStream, File file)
            throws IOException {
        ScriptWrapper wrapper = null;
        try {
            // Get the InputReader to use
```

### UnusedAssignment
Variable `sslcontext` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/util/TrustAllSSLSocketFactory.java`
#### Snippet
```java
     */
    public TrustAllSSLSocketFactory(){
        SSLContext sslcontext = null;
        try {
            sslcontext = SSLContext.getInstance("TLS"); // $NON-NLS-1$
```

### UnusedAssignment
Variable `r` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/util/BeanShellInterpreter.java`
#### Snippet
```java

    private Object bshInvoke(Method m, Object[] o, boolean shouldLog) throws JMeterException {
        Object r = null;
        final String errorString = "Error invoking bsh method: ";
        try {
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/save/CSVSaveService.java`
#### Snippet
```java
            final long lineNumber) {

        SampleResult result = null;
        String hostname = "";// $NON-NLS-1$
        long timeStamp = 0;
```

### UnusedAssignment
Variable `text` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/save/CSVSaveService.java`
#### Snippet
```java
        long timeStamp = 0;
        long elapsed = 0;
        String text = null;
        String field = null; // Save the name for error reporting
        int i = 0;
```

### UnusedAssignment
Variable `index` initializer `-1` is redundant
in `src/core/src/main/java/org/apache/jmeter/util/StringUtilities.java`
#### Snippet
```java
        StringBuilder ret = new StringBuilder(input.length());
        int start = 0;
        int index = -1;
        final int length = pattern.length();
        while ((index = input.indexOf(pattern, start)) >= start) {
```

### UnusedAssignment
Variable `displayName` initializer `true` is redundant
in `src/core/src/main/java/org/apache/jmeter/config/gui/LoginConfigGui.java`
#### Snippet
```java
     * intended to be used as a subpanel for another component.
     */
    private boolean displayName = true;

    /**
```

### UnusedAssignment
Variable `val` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/util/XPathUtil.java`
#### Snippet
```java
    public static void putValuesForXPathInList(Document document, String xPathQuery, List<String> matchStrings, boolean fragment, int matchNumber)
            throws TransformerException {
        String val = null;
        XObject xObject = XPathAPI.eval(document, xPathQuery, getPrefixResolver(document));
        final int objectType = xObject.getType();
```

### UnusedAssignment
Variable `localHost` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/util/JMeterUtils.java`
#### Snippet
```java

    private static void getLocalHostDetails(){
        InetAddress localHost=null;
        try {
            localHost = InetAddress.getLocalHost();
```

### UnusedAssignment
Variable `resString` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/util/JMeterUtils.java`
#### Snippet
```java
        String resKey = key.replace(' ', '_'); // $NON-NLS-1$ // $NON-NLS-2$
        resKey = resKey.toLowerCase(java.util.Locale.ENGLISH);
        String resString = null;
        try {
            ResourceBundle bundle = resources;
```

### UnusedAssignment
Variable `fos` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/report/core/AbstractSampleWriter.java`
#### Snippet
```java
     */
    public void setOutputFile(File output) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(output); // NOSONAR
```

### UnusedAssignment
Variable `row` initializer `0` is redundant
in `src/core/src/main/java/org/apache/jmeter/report/core/SampleBuilder.java`
#### Snippet
```java
    private int k = 0;

    private long row = 0;

    /**
```

### UnusedAssignment
Variable `k` initializer `0` is redundant
in `src/core/src/main/java/org/apache/jmeter/report/core/SampleBuilder.java`
#### Snippet
```java
    private final NumberFormat floatFormatter;

    private int k = 0;

    private long row = 0;
```

### UnusedAssignment
Variable `newAggregator` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/report/processor/PercentileAggregatorFactory.java`
#### Snippet
```java
    @Override
    protected Aggregator createAggregator() {
        Aggregator newAggregator = null;
        if(lastAggregator != null) {
            newAggregator = new PercentileAggregator((PercentileAggregator)lastAggregator);
```

### UnusedAssignment
Variable `date` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/report/processor/NormalizerSampleConsumer.java`
#### Snippet
```java
    @SuppressWarnings("JavaUtilDate")
    public void consume(Sample s, int channel) {
        Date date = null;
        try {
            String tStr = s.getData(timestamp);
```

### UnusedAssignment
Variable `ext` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/report/processor/SampleWriterConsumer.java`
#### Snippet
```java

    public File getOutputFile(int channel) {
        String ext = null;
        String fName = getOutputFile().getName();
        int idx = fName.lastIndexOf('.');
```

### UnusedAssignment
Variable `reportStartDate` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/report/config/ReportGeneratorConfiguration.java`
#### Snippet
```java
        configuration.setReportTitle(reportTitle);

        Date reportStartDate = null;
        Date reportEndDate = null;
        final String startDateValue = getOptionalProperty(props,
```

### UnusedAssignment
Variable `reportEndDate` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/report/config/ReportGeneratorConfiguration.java`
#### Snippet
```java

        Date reportStartDate = null;
        Date reportEndDate = null;
        final String startDateValue = getOptionalProperty(props,
                REPORT_GENERATOR_KEY_START_DATE, String.class);
```

### UnusedAssignment
Variable `chunkSize` initializer `DEFAULT_CHUNK_SIZE` is redundant
in `src/core/src/main/java/org/apache/jmeter/report/processor/ExternalSampleSorter.java`
#### Snippet
```java
    private static final int DEFAULT_CHUNK_SIZE = 50000;

    private long chunkSize = DEFAULT_CHUNK_SIZE;

    private SampleComparator sampleComparator;
```

### UnusedAssignment
Variable `s` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/report/processor/ExternalSampleSorter.java`
#### Snippet
```java
            super.setConsumedMetadata(readSampleMetadata, 0);
            startConsuming();
            Sample s = null;
            while ((s = csvReader.readSample()) != null) {
                consume(s, 0);
```

### UnusedAssignment
Variable `s` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/report/processor/CsvFileSampleSource.java`
#### Snippet
```java
            producer.startProducing();
            try {
                Sample s = null;
                while ((s = csvReader.readSample()) != null) {
                    producer.produce(s, i);
```

### UnusedAssignment
Variable `secondaryInputs` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/report/processor/CsvFileSampleSource.java`
#### Snippet
```java

        // Find secondary inputs by regex match
        File[] secondaryInputs = null;
        try {
            final Pattern pattern = Pattern.compile(inputRootName
```

### UnusedAssignment
Variable `displayName` initializer `true` is redundant
in `src/core/src/main/java/org/apache/jmeter/control/gui/IfControllerPanel.java`
#### Snippet
```java
     * intended to be used as a subpanel for another component.
     */
    private boolean displayName = true;

    private JButton useLastSampleStatusButton;
```

### UnusedAssignment
Variable `displayName` initializer `true` is redundant
in `src/core/src/main/java/org/apache/jmeter/control/gui/RunTimeGui.java`
#### Snippet
```java
     * intended to be used as a subpanel for another component.
     */
    private boolean displayName = true;

    /**
```

### UnusedAssignment
Variable `displayName` initializer `true` is redundant
in `src/core/src/main/java/org/apache/jmeter/control/gui/LoopControlPanel.java`
#### Snippet
```java
     * intended to be used as a subpanel for another component.
     */
    private boolean displayName = true;

    /** The name of the infinite checkbox component. */
```

### UnusedAssignment
Variable `isr` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/services/FileServer.java`
#### Snippet
```java
        }
        BOMInputStream fis = new BOMInputStream(Files.newInputStream(fileEntry.file.toPath())); //NOSONAR
        InputStreamReader isr = null;
        // If file encoding is specified, read using that encoding, otherwise use default platform encoding
        String charsetName = fileEntry.charSetEncoding;
```

### UnusedAssignment
Variable `writer` initializer `null` is redundant
in `src/core/src/main/java/org/apache/jmeter/reporters/ResultCollector.java`
#### Snippet
```java
        filename = new File(filename).getCanonicalPath(); // try to ensure uniqueness (Bug 60822)
        FileEntry fe = files.get(filename);
        PrintWriter writer = null;
        boolean trimmed = true;

```

### UnusedAssignment
Variable `elapsedTime` initializer `0` is redundant
in `src/core/src/main/java/org/apache/jmeter/samplers/SampleResult.java`
#### Snippet
```java

    /** elapsed time */
    private long elapsedTime = 0;

    /** time to first response */
```

### UnusedAssignment
Variable `message` initializer `null` is redundant
in `src/jorphan/src/main/java/org/apache/commons/cli/avalon/CLArgsParser.java`
#### Snippet
```java
                    final int originalId = originalOption.getDescriptor().getId();

                    String message = null;

                    if (id == originalId) {
```

### UnusedAssignment
Variable `writeFunctors` initializer `new ArrayList<>()` is redundant
in `src/jorphan/src/main/java/org/apache/jorphan/gui/ObjectTableModel.java`
#### Snippet
```java
    private transient ArrayList<Functor> readFunctors = new ArrayList<>();

    private transient ArrayList<Functor> writeFunctors = new ArrayList<>();

    private transient Class<?> objectClass = null; // if provided
```

### UnusedAssignment
Variable `readFunctors` initializer `new ArrayList<>()` is redundant
in `src/jorphan/src/main/java/org/apache/jorphan/gui/ObjectTableModel.java`
#### Snippet
```java
    private transient ArrayList<Class<?>> classes = new ArrayList<>();

    private transient ArrayList<Functor> readFunctors = new ArrayList<>();

    private transient ArrayList<Functor> writeFunctors = new ArrayList<>();
```

### UnusedAssignment
Variable `on` initializer `null` is redundant
in `src/jorphan/src/main/java/org/apache/jorphan/util/HeapDumper.java`
#### Snippet
```java
    private HeapDumper() {
        server = ManagementFactory.getPlatformMBeanServer(); // get the platform beans
        ObjectName on = null;
        Exception ex = null;
        try {
```

### UnusedAssignment
Variable `instance` initializer `null` is redundant
in `src/jorphan/src/main/java/org/apache/jorphan/reflect/ClassTools.java`
#### Snippet
```java
     */
    public static Object construct(String className) throws JMeterException {
        Object instance = null;
        try {
            instance = ClassUtils.getClass(className).getDeclaredConstructor().newInstance();
```

### UnusedAssignment
Variable `instance` initializer `null` is redundant
in `src/jorphan/src/main/java/org/apache/jorphan/reflect/ClassTools.java`
#### Snippet
```java
    public static Object construct(String className, String parameter)
            throws JMeterException {
        Object instance = null;
        try {
            Class<?> clazz = Class.forName(className);
```

### UnusedAssignment
Variable `instance` initializer `null` is redundant
in `src/jorphan/src/main/java/org/apache/jorphan/reflect/ClassTools.java`
#### Snippet
```java
    public static Object construct(String className, int parameter) throws JMeterException
    {
        Object instance = null;
        try {
            Class<?> clazz = ClassUtils.getClass(className);
```

### UnusedAssignment
Variable `index` initializer `-1` is redundant
in `src/jorphan/src/main/java/org/apache/jorphan/util/JOrphanUtils.java`
#### Snippet
```java
        StringBuilder ret = new StringBuilder(input.length());
        int start = 0;
        int index = -1;
        final int length = pattern.length();
        while ((index = input.indexOf(pattern, start)) >= start) {
```

### UnusedAssignment
Variable `response` initializer `null` is redundant
in `src/examples/src/main/java/org/apache/jmeter/examples/sampler/ExampleSampler.java`
#### Snippet
```java
        boolean isOK = false; // Did sample succeed?
        String data = getData(); // Sampler data
        String response = null;

        res.setSampleLabel(getTitle());
```

### UnusedAssignment
Variable `displayName` initializer `true` is redundant
in `src/protocol/ftp/src/main/java/org/apache/jmeter/protocol/ftp/config/gui/FtpConfigGui.java`
#### Snippet
```java
    private JCheckBox saveResponseData;

    private boolean displayName = true;

    private JRadioButton getBox;
```

### UnusedAssignment
Variable `objfac` initializer `null` is redundant
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/Utils.java`
#### Snippet
```java
     */
    public static Connection getConnection(Context ctx, String factoryName) throws JMSException, NamingException {
        Object objfac = null;
        try {
            objfac = ctx.lookup(factoryName);
```

### UnusedAssignment
The value `null` assigned to `reply` is never used
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/Receiver.java`
#### Snippet
```java

        while (active) {
            reply = null;
            try {
                reply = consumer.receive(5000);
```

### UnusedAssignment
Variable `jmsProperties` initializer `null` is redundant
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/PublisherSampler.java`
#### Snippet
```java
    public JMSProperties getJMSProperties() {
        Object o = getProperty(JMS_PROPERTIES).getObjectValue();
        JMSProperties jmsProperties = null;
        // Backward compatibility with versions <= 2.10
        if (o instanceof Arguments) {
```

### UnusedAssignment
Variable `displayName` initializer `true` is redundant
in `src/protocol/tcp/src/main/java/org/apache/jmeter/protocol/tcp/config/gui/TCPConfigGui.java`
#### Snippet
```java
    private JSyntaxTextArea requestData;

    private boolean displayName = true;

    public TCPConfigGui() {
```

### UnusedAssignment
Variable `x` initializer `0` is redundant
in `src/protocol/tcp/src/main/java/org/apache/jmeter/protocol/tcp/sampler/BinaryTCPClientImpl.java`
#### Snippet
```java
        try {
            byte[] buffer = new byte[4096];
            int x = 0;
            boolean first = true;
            while ((x = is.read(buffer)) > -1) {
```

### UnusedAssignment
Variable `retVal` initializer `null` is redundant
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/JMSSampler.java`
#### Snippet
```java

    private String clearQueue(Queue queue, SampleResult res) {
        String retVal = null;
        QueueReceiver consumer = null;
        String queueName = null;
```

### UnusedAssignment
Variable `deletedMsg` initializer `null` is redundant
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/JMSSampler.java`
#### Snippet
```java
            queueName = queue.getQueueName();
            consumer = session.createReceiver(queue);
            Message deletedMsg = null;
            long deletedMsgCount = 0;
            do {
```

### UnusedAssignment
Variable `val` initializer `1` is redundant
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/JMSSampler.java`
#### Snippet
```java

    private int getNumberOfSamplesToAggregateAsInt() {
        int val = 1;
        try {
            val = getPropertyAsInt(JMS_NUMBEROFSAMPLES);
```

### UnusedAssignment
Variable `jmsProperties` initializer `null` is redundant
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/JMSSampler.java`
#### Snippet
```java
    public JMSProperties getJMSProperties() {
        Object o = getProperty(JMS_PROPERTIES).getObjectValue();
        JMSProperties jmsProperties = null;
        // Backward compatibility with versions <= 2.10
        if (o instanceof Arguments) {
```

### UnusedAssignment
Variable `reply` initializer `null` is redundant
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/JMSSampler.java`
#### Snippet
```java
        String retVal = null;
        QueueReceiver consumer = null;
        Message reply = null;
        String queueName = null;
        try {
```

### UnusedAssignment
Variable `line` initializer `null` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/accesslog/SharedTCLogParser.java`
#### Snippet
```java
    protected int parse(FileServer breader, TestElement el, int parseCount) {
        int actualCount = 0;
        String line = null;
        try {
            // read one line at a time using
```

### UnusedAssignment
Variable `line` initializer `null` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/accesslog/TCLogParser.java`
#### Snippet
```java
    protected int parse(BufferedReader breader, TestElement el, int parseCount) {
        int actualCount = 0;
        String line = null;
        try {
            // read one line at a time using
```

### UnusedAssignment
Variable `contentFile` initializer `null` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
    private String encodePostdata(String postdata) {
        if (postdata.contains("@")) {
            String contentFile = null;
            String[] arr = postdata.split("@", 2);
            String dataToEncode = readFromFile(unquote(arr[1]));
```

### UnusedAssignment
Variable `postData` initializer `null` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/DefaultSamplerCreator.java`
#### Snippet
```java
            String contentEncoding = sampler.getContentEncoding();
            // Get the post data using the content encoding of the request
            String postData = null;
            if (log.isDebugEnabled()) {
                if(!StringUtils.isEmpty(contentEncoding)) {
```

### UnusedAssignment
Variable `length` initializer `0` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/HttpMirrorThread.java`
#### Snippet
```java
            byte[] buffer = new byte[1024];
            StringBuilder headers = new StringBuilder();
            int length = 0;
            int positionOfBody = 0;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
```

### UnusedAssignment
The value `0` assigned to `length` is never used
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/HttpMirrorThread.java`
#### Snippet
```java
            // block, because we do not know when to stop reading, because
            // the chunked transfer is not properly supported yet
            length = 0;
            if(contentLength > 0) {
                // Check how much of the body we have already read as part of reading
```

### UnusedAssignment
Variable `res` initializer `null` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/AccessLogSampler.java`
#### Snippet
```java
        initFilter();
        instantiateParser();
        SampleResult res = null;
        try {

```

### UnusedAssignment
Variable `bytesReadInBuffer` initializer `0` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPFileImpl.java`
#### Snippet
```java
            is = conn.getInputStream();
            byte[] readBuffer = new byte[bufferSize];
            int bytesReadInBuffer = 0;
            long totalBytes = 0;
            boolean storeInBOS = true;
```

### UnusedAssignment
Variable `contentLength` initializer `0L` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/PostWriter.java`
#### Snippet
```java
            contentEncoding = ENCODING;
        }
        long contentLength = 0L;
        HTTPFileArg[] files = sampler.getHTTPFiles();

```

### UnusedAssignment
Variable `postBody` initializer `null` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/PostWriter.java`
#### Snippet
```java
                // If none of the arguments have a name specified, we
                // just send all the values as the post body
                String postBody = null;
                if(!sampler.getSendParameterValuesAsPostBody()) {
                    // Set the content type
```

### UnusedAssignment
Variable `cl` initializer `-1` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/AjpSampler.java`
#### Snippet
```java
        }
        if(method.equals(HTTPConstants.POST)) {
            int cl = -1;
            HTTPFileArg[] hfa = getHTTPFiles();
            if(hfa.length > 0) {
```

### UnusedAssignment
Variable `i` initializer `0` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/ResourcesDownloader.java`
#### Snippet
```java
        try {
            // push the task in the threadpool until <maxConcurrentDownloads> is reached
            int i = 0;
            for (i = 0; i < Math.min(maxConcurrentDownloads, list.size()); i++) {
                Callable<AsynSamplerResultHolder> task = list.get(i);
```

### UnusedAssignment
Variable `headersModel` initializer `null` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/visualizers/RequestViewHTTP.java`
#### Snippet
```java
    private ObjectTableModel paramsModel = null;

    private ObjectTableModel headersModel = null;

    private static final String[] COLUMNS_REQUEST = new String[] {
```

### UnusedAssignment
Variable `paramsModel` initializer `null` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/visualizers/RequestViewHTTP.java`
#### Snippet
```java
    private ObjectTableModel requestModel = null;

    private ObjectTableModel paramsModel = null;

    private ObjectTableModel headersModel = null;
```

### UnusedAssignment
Variable `requestModel` initializer `null` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/visualizers/RequestViewHTTP.java`
#### Snippet
```java
    private JPanel paneParsed;

    private ObjectTableModel requestModel = null;

    private ObjectTableModel paramsModel = null;
```

### UnusedAssignment
Variable `displayName` initializer `true` is redundant
in `src/protocol/java/src/main/java/org/apache/jmeter/protocol/java/config/gui/JavaConfigGui.java`
#### Snippet
```java
     * is embedded in some other component.
     */
    private boolean displayName = true;

    /** A panel allowing the user to set arguments for this test. */
```

### UnusedAssignment
Variable `bsfEngine` initializer `null` is redundant
in `src/protocol/java/src/main/java/org/apache/jmeter/protocol/java/sampler/BSFSampler.java`
#### Snippet
```java
        res.setSampleLabel(label);

        BSFEngine bsfEngine = null;
        // There's little point saving the manager between invocations
        // as we need to reset most of the beans anyway
```

### UnusedAssignment
Variable `bsfOut` initializer `null` is redundant
in `src/protocol/java/src/main/java/org/apache/jmeter/protocol/java/sampler/BSFSampler.java`
#### Snippet
```java
            bsfEngine = mgr.loadScriptingEngine(getScriptLanguage());

            Object bsfOut = null;
            if (fileName.length()>0) {
                res.setSamplerData("File: "+fileName);
```

### UnusedAssignment
Variable `displayName` initializer `true` is redundant
in `src/protocol/ldap/src/main/java/org/apache/jmeter/protocol/ldap/config/gui/LdapConfigGui.java`
#### Snippet
```java
    private final ButtonGroup bGroup = new ButtonGroup();

    private boolean displayName = true;

    private final ArgumentsPanel tableAddPanel = new ArgumentsPanel(JMeterUtils.getResString("add_test")); // $NON-NLS-1$
```

### UnusedAssignment
Variable `httpClient` initializer `null` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java`
#### Snippet
```java
        HTTPSampleResult res = createSampleResult(url, method);

        CloseableHttpClient httpClient = null;
        HttpRequestBase httpRequest = null;
        HttpContext localContext = new BasicHttpContext();
```

### UnusedAssignment
Variable `httpRequest` initializer `null` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java`
#### Snippet
```java

        CloseableHttpClient httpClient = null;
        HttpRequestBase httpRequest = null;
        HttpContext localContext = new BasicHttpContext();
        HttpClientContext clientContext = HttpClientContext.adapt(localContext);
```

### UnusedAssignment
Variable `isSuccessful` initializer `false` is redundant
in `src/protocol/ldap/src/main/java/org/apache/jmeter/protocol/ldap/sampler/LDAPSampler.java`
#### Snippet
```java
    public SampleResult sample(Entry e) {
        SampleResult res = new SampleResult();
        boolean isSuccessful = false;
        res.setSampleLabel(getName());
        res.setSamplerData(getPropertyAsString(TEST));// TODO improve this
```

### UnusedAssignment
Variable `displayName` initializer `true` is redundant
in `src/protocol/ldap/src/main/java/org/apache/jmeter/protocol/ldap/config/gui/LdapExtConfigGui.java`
#### Snippet
```java
    private final ButtonGroup bGroup = new ButtonGroup();

    private boolean displayName = true;

    private final ArgumentsPanel tableAddPanel = new ArgumentsPanel(JMeterUtils.getResString("addtest")); // $NON-NLS-1$
```

### UnusedAssignment
Variable `sslcontext` initializer `null` is redundant
in `src/protocol/mail/src/main/java/org/apache/jmeter/protocol/smtp/sampler/protocol/LocalTrustStoreSSLSocketFactory.java`
#### Snippet
```java

    public LocalTrustStoreSSLSocketFactory(File truststore){
        SSLContext sslcontext = null;
        try {
            KeyStore ks = KeyStore.getInstance("JKS"); // $NON-NLS-1$
```

### UnusedAssignment
Variable `sslcontext` initializer `null` is redundant
in `src/protocol/mail/src/main/java/org/apache/jmeter/protocol/smtp/sampler/protocol/TrustAllSSLSocketFactory.java`
#### Snippet
```java
     */
    public TrustAllSSLSocketFactory(){
        SSLContext sslcontext = null;
        try {
            sslcontext = SSLContext.getInstance("TLS"); // $NON-NLS-1$
```

### UnusedAssignment
Variable `res` initializer `null` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java`
#### Snippet
```java
     */
    public SampleResult sample() {
        SampleResult res = null;
        try {
            res = sample(getUrl(), getMethod(), false, 0);
```

### UnusedAssignment
Variable `bytesReadInBuffer` initializer `0` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java`
#### Snippet
```java


            int bytesReadInBuffer = 0;
            long totalBytes = 0;
            boolean first = true;
```

### UnusedAssignment
Variable `item` initializer `null` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java`
#### Snippet
```java
        boolean first = true;
        while (iter.hasNext()) {
            HTTPArgument item = null;
            /*
             * N.B. Revision 323346 introduced the ClassCast check, but then used iter.next()
```

### UnusedAssignment
Variable `mongo` initializer `null` is redundant
in `src/protocol/mongodb/src/main/java/org/apache/jmeter/protocol/mongodb/mongo/MongoDB.java`
#### Snippet
```java

    // Mongo is Thread Safe
    private Mongo mongo = null;

    public MongoDB(
```

### UnusedAssignment
Variable `decodeString` initializer `""` is redundant
in `src/functions/src/main/java/org/apache/jmeter/functions/UrlDecode.java`
#### Snippet
```java
    public String execute(SampleResult previousResult, Sampler currentSampler)
            throws InvalidVariableException {
        String decodeString = ""; //$NON-NLS-1$
        try {
            String rawString = ((CompoundVariable) values[0]).execute();
```

### UnusedAssignment
Variable `x` initializer `0` is redundant
in `src/bshclient/src/main/java/org/apache/jmeter/util/BeanShellClient.java`
#### Snippet
```java
        public void run(){
            System.out.println("Reading responses from server ...");
            int x = 0;
            try {
                while ((x = is.read()) > -1) {
```

### UnusedAssignment
Variable `nl` initializer `null` is redundant
in `src/functions/src/main/java/org/apache/jmeter/functions/XPathFileContainer.java`
#### Snippet
```java
    private NodeList load(String xpath) throws IOException, FileNotFoundException, ParserConfigurationException, SAXException,
            TransformerException {
        NodeList nl = null;
        try ( FileInputStream fis = new FileInputStream(fileName);
                BufferedInputStream bis = new BufferedInputStream(fis) ){
```

### UnusedAssignment
Variable `decodeString` initializer `""` is redundant
in `src/functions/src/main/java/org/apache/jmeter/functions/UrlEncode.java`
#### Snippet
```java
    public String execute(SampleResult previousResult, Sampler currentSampler)
            throws InvalidVariableException {
        String decodeString = ""; //$NON-NLS-1$
        try {
            String encodedString = ((CompoundVariable) values[0]).execute();
```

### UnusedAssignment
Variable `resultStr` initializer `null` is redundant
in `src/functions/src/main/java/org/apache/jmeter/functions/JavaScript.java`
#### Snippet
```java
            throws InvalidVariableException {
        Context cx = Context.enter();
        String resultStr = null;
        try {

```

### UnusedAssignment
Variable `resultStr` initializer `""` is redundant
in `src/functions/src/main/java/org/apache/jmeter/functions/JavaScript.java`
#### Snippet
```java
        // Allow variable to be omitted
        String varName = values.length < 2 ? null : ((CompoundVariable) values[1]).execute().trim();
        String resultStr = "";

        if(useRhinoEngine) {
```

### UnusedAssignment
Variable `resultStr` initializer `null` is redundant
in `src/functions/src/main/java/org/apache/jmeter/functions/JavaScript.java`
#### Snippet
```java
            String script, String varName)
            throws InvalidVariableException {
        String resultStr = null;
        try {
            ScriptContext newContext = new SimpleScriptContext();
```

### UnusedAssignment
Variable `myValue` initializer `null` is redundant
in `src/functions/src/main/java/org/apache/jmeter/functions/RandomString.java`
#### Snippet
```java
        }

        String myValue = null;
        if(StringUtils.isEmpty(charsToUse)) {
            myValue = RandomStringUtils.random(length);
```

### UnusedAssignment
Variable `counterString` initializer `""` is redundant
in `src/functions/src/main/java/org/apache/jmeter/functions/IterationCounter.java`
#### Snippet
```java
        }

        String counterString = ""; //$NON-NLS-1$

        if (perThread) {
```

### UnusedAssignment
Variable `displayName` initializer `true` is redundant
in `src/components/src/main/java/org/apache/jmeter/control/gui/CriticalSectionControllerGui.java`
#### Snippet
```java
     * intended to be used as a subpanel for another component.
     */
    private boolean displayName = true;

    /**
```

### UnusedAssignment
Variable `displayName` initializer `true` is redundant
in `src/components/src/main/java/org/apache/jmeter/control/gui/ForeachControlPanel.java`
#### Snippet
```java
     * intended to be used as a sub-panel for another component.
     */
    private boolean displayName = true;

    /** The name of the infinite checkbox component. */
```

### UnusedAssignment
Variable `pattern` initializer `null` is redundant
in `src/components/src/main/java/org/apache/jmeter/extractor/RegexExtractor.java`
#### Snippet
```java
    private void extractWithJavaRegex(SampleResult previousResult, JMeterVariables vars, String refName, int matchNumber) {
        String regex = getRegex();
        java.util.regex.Pattern pattern = null;
        try {
            pattern = JMeterUtils.compilePattern(regex);
```

### UnusedAssignment
Variable `doc` initializer `null` is redundant
in `src/components/src/main/java/org/apache/jmeter/assertions/XPathAssertion.java`
#### Snippet
```java

        byte[] responseData = null;
        Document doc = null;

        try {
```

### UnusedAssignment
Variable `testDoc` initializer `null` is redundant
in `src/components/src/main/java/org/apache/jmeter/assertions/gui/XPathPanel.java`
#### Snippet
```java
        String ret = null;
        boolean success = true;
        Document testDoc = null;
        try {
            testDoc = XPathUtil.makeDocumentBuilder(false, false, false, false).newDocument();
```

### UnusedAssignment
Variable `testDoc` initializer `null` is redundant
in `src/components/src/main/java/org/apache/jmeter/assertions/gui/XPath2Panel.java`
#### Snippet
```java
        String ret = null;
        boolean success = true;
        Document testDoc = null;
        try {
            testDoc = XPathUtil.makeDocumentBuilder(false, false, false, false).newDocument();
```

### UnusedAssignment
Variable `errorThreshold` initializer `0` is redundant
in `src/components/src/main/java/org/apache/jmeter/assertions/gui/HTMLAssertionGui.java`
#### Snippet
```java

        String errorThresholdString = errorThresholdField.getText();
        long errorThreshold = 0;

        try {
```

### UnusedAssignment
Variable `warningThreshold` initializer `0` is redundant
in `src/components/src/main/java/org/apache/jmeter/assertions/gui/HTMLAssertionGui.java`
#### Snippet
```java

        String warningThresholdString = warningThresholdField.getText();
        long warningThreshold = 0;
        try {
            warningThreshold = Long.parseLong(warningThresholdString);
```

### UnusedAssignment
Variable `indentString` initializer `TAB_SEPARATOR` is redundant
in `src/components/src/main/java/org/apache/jmeter/visualizers/RenderAsJSON.java`
#### Snippet
```java
    private static class PrettyJSONStyle extends JSONStyle {
        private int level = 0;
        private String indentString = TAB_SEPARATOR;

        public PrettyJSONStyle(String indentString) {
```

### UnusedAssignment
Variable `model` initializer `null` is redundant
in `src/components/src/main/java/org/apache/jmeter/visualizers/TableVisualizer.java`
#### Snippet
```java
            "table_visualizer_connect"};    // $NON-NLS-1$

    private ObjectTableModel model = null;

    private JTable table = null;
```

### UnusedAssignment
Variable `matcher` initializer `null` is redundant
in `src/components/src/main/java/org/apache/jmeter/visualizers/SearchTextExtension.java`
#### Snippet
```java
                log.debug("lastPosition={}", lastPosition);

                Matcher matcher = null;
                try {
                    Document contentDoc = results.getDocument();
```

### UnusedAssignment
Variable `pattern` initializer `null` is redundant
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java
            textToFindQ = textToFind;
        }
        Pattern pattern = null;
        try {
            if (caseChkBox.isSelected()) {
```

### UnusedAssignment
The value `null` assigned to `statsBuff` is never used
in `src/components/src/main/java/org/apache/jmeter/visualizers/SamplerResultTab.java`
#### Snippet
```java
                        .append(NL);
                statsDoc.insertString(statsDoc.getLength(), statsBuff.toString(), null);
                statsBuff = null; // NOSONAR Help gc

                // Tabbed results: fill table
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java
            textToFindQ = textToFind;
        }
        Pattern result = null;
        try {
            if (caseChkBox.isSelected()) {
```

## RuleId[id=JUnitMixedFramework]
### JUnitMixedFramework
Method `setUp()` annotated with '@Before' inside class extending JUnit 3 TestCase
in `src/protocol/junit-sample/src/main/java/test/SetupTestFail.java`
#### Snippet
```java
    @Override
    @Before
    public void setUp(){
        fail("setUp()");
    }
```

### JUnitMixedFramework
Method `testSetUpFail()` annotated with '@Test' inside class extending JUnit 3 TestCase
in `src/protocol/junit-sample/src/main/java/test/SetupTestFail.java`
#### Snippet
```java

    @Test
    public void testSetUpFail(){
        // Dummy to ensure there is a test to run
    }
```

### JUnitMixedFramework
Method `setUp()` annotated with '@Before' inside class extending JUnit 3 TestCase
in `src/protocol/junit-sample/src/main/java/test/SetupTestError.java`
#### Snippet
```java
    @Override
    @Before
    public void setUp(){
        throw new Error("setUp()");
    }
```

### JUnitMixedFramework
Method `testSetUpError()` annotated with '@Test' inside class extending JUnit 3 TestCase
in `src/protocol/junit-sample/src/main/java/test/SetupTestError.java`
#### Snippet
```java

    @Test
    public void testSetUpError(){
        // Dummy to ensure there is a test to run
    }
```

### JUnitMixedFramework
Method `testRerun()` annotated with '@Test' inside class extending JUnit 3 TestCase
in `src/protocol/junit-sample/src/main/java/test/RerunTest.java`
#### Snippet
```java
    private int i = 123;
    @Test
    public void testRerun(){
        assertEquals(123,i);
        i++;
```

## RuleId[id=SuspiciousNameCombination]
### SuspiciousNameCombination
'TOP_ALIGNMENT' should probably not be passed as parameter 'alignmentX'
in `src/core/src/main/java/org/apache/jmeter/gui/action/SearchTreeDialog.java`
#### Snippet
```java

        replaceTF = new JTextField(20);
        replaceTF.setAlignmentX(TOP_ALIGNMENT);
        statusLabel = new JLabel(" ");
        statusLabel.setPreferredSize(new Dimension(100, 20));
```

### SuspiciousNameCombination
'topSplit' should probably not be passed as parameter 'newRightComponent'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/visualizers/RequestViewHTTP.java`
#### Snippet
```java

        JSplitPane paneParsed = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                GuiUtils.makeScrollPane(tableRequest), topSplit);
        paneParsed.setOneTouchExpandable(true);
        paneParsed.setResizeWeight(0.25); // set split ratio (only 5 lines to display)
```

### SuspiciousNameCombination
'height' should probably not be passed as parameter 'width'
in `src/protocol/native/src/main/java/org/apache/jmeter/protocol/system/gui/SystemSamplerGui.java`
#### Snippet
```java
                JMeterUtils.getResString("timeout_config_box_title"))); // $NON-NLS-1$
        timeout = new JLabeledTextField(JMeterUtils.getResString("timeout_title")); // $NON-NLS-1$
        timeout.setSize(timeout.getSize().height, 30);
        panel.add(timeout);
        return panel;
```

### SuspiciousNameCombination
'height' should probably not be passed as parameter 'width'
in `src/protocol/native/src/main/java/org/apache/jmeter/protocol/system/gui/SystemSamplerGui.java`
#### Snippet
```java
        checkReturnCode.addItemListener(this);
        desiredReturnCode = new JLabeledTextField(JMeterUtils.getResString("expected_return_code_title")); // $NON-NLS-1$
        desiredReturnCode.setSize(desiredReturnCode.getSize().height, 30);
        panel.add(checkReturnCode);
        panel.add(Box.createHorizontalStrut(5));
```

### SuspiciousNameCombination
'topSplit' should probably not be passed as parameter 'newRightComponent'
in `src/components/src/main/java/org/apache/jmeter/visualizers/SamplerResultTab.java`
#### Snippet
```java

        paneParsed = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                GuiUtils.makeScrollPane(tableResult), topSplit);
        paneParsed.setOneTouchExpandable(true);
        paneParsed.setResizeWeight(0.40); // set split ratio
```

## RuleId[id=JavadocReference]
### JavadocReference
@value tag must reference a field with a constant initializer
in `src/core/src/main/java/org/apache/jmeter/gui/action/AddThinkTimeBetweenEachStep.java`
#### Snippet
```java
     * @param parentNode {@link JMeterTreeNode}
     * @return array of {@link JMeterTreeNode}
     * @throws ReflectiveOperationException when class instantiation for {@value #DEFAULT_IMPLEMENTATION} fails
     * @throws IllegalUserActionException when {@link ThinkTimeCreator#createThinkTime(GuiPackage, JMeterTreeNode)} throws this
     */
```

### JavadocReference
Symbol `checkClasses()` is inaccessible from here
in `src/core/src/main/java/org/apache/jmeter/util/NameUpdater.java`
#### Snippet
```java
    /**
     * Check if a key is in the map; intended for use by
     * {@link org.apache.jmeter.save.SaveService#checkClasses() SaveService#checkClasses()}
     * only.
     *
```

### JavadocReference
Symbol `configureWithConfigElements` is inaccessible from here
in `src/core/src/main/java/org/apache/jmeter/engine/util/ConfigMergabilityIndicator.java`
#### Snippet
```java
/**
 * Interface that gives a hint about the merge policy to apply between Samplers and Config elements
 * @see TestCompiler#configureWithConfigElements
 * @since 2.7
 */
```

### JavadocReference
Symbol `DEFAULT_POLICY` is inaccessible from here
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/CookieManager.java`
#### Snippet
```java
     * <p>
     * The default policy for new CookieManager elements is defined by
     * {@link org.apache.jmeter.protocol.http.gui.CookiePanel#DEFAULT_POLICY CookiePanel#DEFAULT_POLICY}
     *
     */
```

### JavadocReference
Cannot resolve symbol `DEFAULT_IMPLEMENTATION`
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/CookieManager.java`
#### Snippet
```java
     * <p>
     * The default implementation for new CookieManager elements is defined by
     * {@link org.apache.jmeter.protocol.http.gui.CookiePanel#DEFAULT_IMPLEMENTATION CookiePanel#DEFAULT_IMPLEMENTATION}
     *
     */
```

## RuleId[id=UnaryPlus]
### UnaryPlus
Unary `+` operator
in `src/protocol/ldap/src/main/java/org/apache/jmeter/protocol/ldap/sampler/LDAPSampler.java`
#### Snippet
```java
            attr = getBasicAttribute(item.getName(), item.getValue());
            mods[count] = new ModificationItem(DirContext.REPLACE_ATTRIBUTE, attr);
            count = +1;
        }
        return mods;
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/core/src/main/java/org/apache/jmeter/util/JMeterUtils.java`
#### Snippet
```java
            return Collections.emptyEnumeration();
        }
    };

    /**
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/core/src/main/java/org/apache/jmeter/reporters/ResultCollector.java`
#### Snippet
```java
                    } else { // We are processing XML
                        try (InputStream fis = Files.newInputStream(file.toPath());
                             BufferedInputStream bufferedInputStream = new BufferedInputStream(fis); ){ // Assume XStream
                            SaveService.loadTestResults(bufferedInputStream,
                                    new ResultCollectorHelper(this, visualizer));
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/HeaderManager.java`
#### Snippet
```java
        }
        try (BufferedWriter fw = Files.newBufferedWriter(file.toPath());
             PrintWriter writer = new PrintWriter(fw);) { // TODO Charset ?
            writer.println("# JMeter generated Header file");// $NON-NLS-1$
            final CollectionProperty hdrs = getHeaders();
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/core/src/main/java/org/apache/jmeter/gui/GuiPackage.java`
#### Snippet
```java
            log.error("Failure setting file server's base dir", e1);
        }
        testPlanListeners.stream().forEach(TestPlanListener::testPlanLoaded);
    }

```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/core/src/main/java/org/apache/jmeter/gui/GuiPackage.java`
#### Snippet
```java
     */
    public void clearTestPlan() {
        testPlanListeners.stream().forEach(TestPlanListener::beforeTestPlanCleared);
        getTreeModel().clearTestPlan();
        nodesToGui.clear();
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/core/src/main/java/org/apache/jmeter/gui/GuiPackage.java`
#### Snippet
```java
        nodesToGui.clear();
        setTestPlanFile(null);
        testPlanListeners.stream().forEach(TestPlanListener::afterTestPlanCleared);
        undoHistory.clear();
        undoHistory.add(this.treeModel, "Initial Tree");
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/components/src/main/java/org/apache/jmeter/visualizers/ViewResultsFullVisualizer.java`
#### Snippet
```java
            jTree.expandPath(new TreePath(root));
        }
        newExpandedPaths.stream().forEach(jTree::expandPath);
        if (selectedPath != null) {
            jTree.setSelectionPath(selectedPath);
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `src/core/src/main/java/org/apache/jmeter/gui/action/LoadRecentProject.java`
#### Snippet
```java
        String menuText = file.getName();
        if (menuText.length() > maxLength) {
            menuText = "..." + menuText.substring(menuText.length() - maxLength, menuText.length()); //$NON-NLS-1$
        }
        return menuText;
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/core/src/main/java/org/apache/jmeter/util/StringUtilities.java`
#### Snippet
```java
        final int length = pattern.length();
        while ((index = input.indexOf(pattern, start)) >= start) {
            ret.append(input.substring(start, index));
            ret.append(sub);
            start = index + length;
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/core/src/main/java/org/apache/jmeter/reporters/ResultSaver.java`
#### Snippet
```java
                    int j = contentType.indexOf(';'); // $NON-NLS-1$
                    if (j != -1) {
                        sb.append(contentType.substring(i + 1, j));
                    } else {
                        sb.append(contentType.substring(i + 1));
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/jorphan/src/main/java/org/apache/jorphan/util/JOrphanUtils.java`
#### Snippet
```java
        final int length = pattern.length();
        while ((index = input.indexOf(pattern, start)) >= start) {
            ret.append(input.substring(start, index));
            ret.append(sub);
            start = index + length;
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `src/jorphan/src/main/java/org/apache/jorphan/util/JOrphanUtils.java`
#### Snippet
```java
            while ((spot = splittee.indexOf(adjacentSplit)) != -1) {
                splittee = splittee.substring(0, spot + splitLength)
                        + splittee.substring(spot + adjacentSplitLength, splittee.length());
            }
            if (splittee.startsWith(splitChar)) {
```

### StringOperationCanBeSimplified
Unnecessary empty string argument
in `src/jorphan/src/main/java/org/apache/jorphan/collections/Data.java`
#### Snippet
```java
     */
    public String[] getDataAsText() {
        StringBuilder temp = new StringBuilder("");
        String[] line = new String[size + 1];
        String[] elements = getHeaders();
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/launcher/src/main/java/org/apache/jmeter/NewDriver.java`
#### Snippet
```java

            while (begin != -1) {
                builder.append(fileName.substring(fromIndex, begin));

                fromIndex = begin + 1;
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
                try {
                    return postdata.substring(0, index + 1) + URLEncoder
                            .encode(postdata.substring(index + 1, postdata.length()), StandardCharsets.UTF_8.name());
                } catch (UnsupportedEncodingException e) {
                    throw new IllegalArgumentException(
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
                } catch (UnsupportedEncodingException e) {
                    throw new IllegalArgumentException(
                            postdata.substring(index + 1, postdata.length()) + " cannot be encoded", e);
                }
            }
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
       } else {
           if (postdata.charAt(0) == '@' && !"data-raw".equals(dataOptionName)) {
               postdata = unquote(postdata.substring(1, postdata.length()));
               postdata = readFromFile(postdata);
               if (!"data-binary".equals(dataOptionName)) {
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
         */
        public void setLimitRate(String limitRate) {
            String unit = limitRate.substring(limitRate.length() - 1, limitRate.length()).toLowerCase();
            int value = Integer.parseInt(limitRate.substring(0, limitRate.length() - 1).toLowerCase());
            switch (unit) {
```

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (1)
in `src/protocol/tcp/src/main/java/org/apache/jmeter/protocol/tcp/sampler/TCPSampler.java`
#### Snippet
```java
                con.close();
            } catch (IOException e) {
                log.warn("Error closing socket {}", e); //$NON-NLS-1$
            }
        }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (1)
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/DefaultSamplerCreator.java`
#### Snippet
```java
                        sampler.setHTTPFiles(files);
                    } catch (IOException e) {
                        log.warn("Could not create binary file: {}", e);
                    }
                } else {
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (2) than placeholders specified (1)
in `src/protocol/java/src/main/java/org/apache/jmeter/protocol/java/sampler/JavaSampler.java`
#### Snippet
```java
            Method method = javaClass.getMethod("teardownTest", JavaSamplerContext.class);
            isToBeRegistered = !method.getDeclaringClass().equals(AbstractJavaSamplerClient.class);
            log.info("Created class: {}. Uses tearDownTest: ", name, isToBeRegistered);
        } catch (Exception e) {
            log.error("{}\tException initialising: ", whoAmI(), name, e);
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (2) than placeholders specified (1)
in `src/protocol/java/src/main/java/org/apache/jmeter/protocol/java/sampler/JavaSampler.java`
#### Snippet
```java
            log.info("Created class: {}. Uses tearDownTest: ", name, isToBeRegistered);
        } catch (Exception e) {
            log.error("{}\tException initialising: ", whoAmI(), name, e);
        }

```

## RuleId[id=HasPlatformType]
### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `src/config/build.gradle.kts`
#### Snippet
```java
}

val srcLicense by configurations.creating

dependencies {
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `src/licenses/build.gradle.kts`
#### Snippet
```java
    attribute(attr, objects.named<T>(value))

val binaryDependencies by configurations.creating {
    isCanBeConsumed = false
    attributes {
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `src/licenses/build.gradle.kts`
#### Snippet
```java
    }
}
val binLicense by configurations.creating {
    isCanBeResolved = false
}
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `src/licenses/build.gradle.kts`
#### Snippet
```java
    isCanBeResolved = false
}
val srcLicense by configurations.creating {
    isCanBeResolved = false
}
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `src/dist/build.gradle.kts`
#### Snippet
```java

// isCanBeConsumed = false ==> other modules must not use the configuration as a dependency
val buildDocs by configurations.creating {
    isCanBeConsumed = false
}
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `src/dist/build.gradle.kts`
#### Snippet
```java
    isCanBeConsumed = false
}
val generatorJar by configurations.creating {
    isCanBeConsumed = false
}
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `src/dist/build.gradle.kts`
#### Snippet
```java
    isCanBeConsumed = false
}
val junitSampleJar by configurations.creating {
    isCanBeConsumed = false
    isTransitive = false
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `src/dist/build.gradle.kts`
#### Snippet
```java
    }
}
val binLicense by configurations.creating {
    isCanBeConsumed = false
}
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `src/dist/build.gradle.kts`
#### Snippet
```java
    isCanBeConsumed = false
}
val srcLicense by configurations.creating {
    isCanBeConsumed = false
}
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `src/dist/build.gradle.kts`
#### Snippet
```java
}

val allTestClasses by configurations.creating {
    isCanBeConsumed = true
    isCanBeResolved = false
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `src/dist-check/build.gradle.kts`
#### Snippet
```java
}

val extraTestDependencies by configurations.creating
val loggingClasspath by configurations.creating

```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `src/dist-check/build.gradle.kts`
#### Snippet
```java

val extraTestDependencies by configurations.creating
val loggingClasspath by configurations.creating

dependencies {
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `build-logic/publishing/src/main/kotlin/build-logic.publish-to-tmp-maven-repo.gradle.kts`
#### Snippet
```java
}

val localRepoElements by configurations.creating {
    isCanBeConsumed = true
    isCanBeResolved = false
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `build-logic/verification/src/main/kotlin/build-logic.jacoco.gradle.kts`
#### Snippet
```java

val jacocoReport by rootProject.tasks.existing(JacocoReport::class)
val mainCode = sourceSets["main"]

// TODO: rework with provide-consume configurations
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `build-logic/verification/src/main/kotlin/build-logic.jacoco-aggregate.gradle.kts`
#### Snippet
```java
}

val jacocoAggregation by configurations.creating {
    description = "Collects project dependencies for JaCoCo coverage report aggregation"
    isVisible = false
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `build-logic/verification/src/main/kotlin/build-logic.jacoco-aggregate.gradle.kts`
#### Snippet
```java
}

val jacocoAggregationCodeCoverageReportResults by configurations.creating {
    description = "Actual dependencies for JaCoCo coverage aggregation"
    isCanBeConsumed = false
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `build-logic/jvm/src/main/kotlin/build-logic.java.gradle.kts`
#### Snippet
```java

// <editor-fold defaultstate="collapsed" desc="TODO: remove dependencies between testClasses of the different projects">
val testClasses by configurations.creating {
}

```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/core/src/main/java/org/apache/jmeter/gui/MainFrame.java`
#### Snippet
```java
                KeyStrokes.CTRL_7, KeyStrokes.CTRL_8, KeyStrokes.CTRL_9,};
        for (int n = 0; n < keyStrokes.length; n++) {
            treevar.getActionMap().put(ActionNames.QUICK_COMPONENT + String.valueOf(n), quickComponent);
            inputMap.put(keyStrokes[n], ActionNames.QUICK_COMPONENT + String.valueOf(n));
        }
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/core/src/main/java/org/apache/jmeter/gui/MainFrame.java`
#### Snippet
```java
        for (int n = 0; n < keyStrokes.length; n++) {
            treevar.getActionMap().put(ActionNames.QUICK_COMPONENT + String.valueOf(n), quickComponent);
            inputMap.put(keyStrokes[n], ActionNames.QUICK_COMPONENT + String.valueOf(n));
        }
    }
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/core/src/main/java/org/apache/jmeter/gui/action/LoadRecentProject.java`
#### Snippet
```java
            if (recentFilePath != null) {
                File file = new File(recentFilePath);
                String sb = String.valueOf(i + 1) + " " + //$NON-NLS-1$
                        getMenuItemDisplayName(file);
                // Index before file name
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/Base64Encoder.java`
#### Snippet
```java
            byte b1 = b[strt];
            int k = 0;
            out.append(String.valueOf(pem_array[b1 >>> 2 & 63]));
            out.append(String.valueOf(pem_array[(b1 << 4 & 48) + (k >>> 4 & 15)]));
            out.append(String.valueOf(EQ));
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/Base64Encoder.java`
#### Snippet
```java
            int k = 0;
            out.append(String.valueOf(pem_array[b1 >>> 2 & 63]));
            out.append(String.valueOf(pem_array[(b1 << 4 & 48) + (k >>> 4 & 15)]));
            out.append(String.valueOf(EQ));
            out.append(String.valueOf(EQ));
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/Base64Encoder.java`
#### Snippet
```java
            out.append(String.valueOf(pem_array[b1 >>> 2 & 63]));
            out.append(String.valueOf(pem_array[(b1 << 4 & 48) + (k >>> 4 & 15)]));
            out.append(String.valueOf(EQ));
            out.append(String.valueOf(EQ));
            return out.toString();
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/Base64Encoder.java`
#### Snippet
```java
            out.append(String.valueOf(pem_array[(b1 << 4 & 48) + (k >>> 4 & 15)]));
            out.append(String.valueOf(EQ));
            out.append(String.valueOf(EQ));
            return out.toString();
        }
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/Base64Encoder.java`
#### Snippet
```java
            byte b4 = b[strt + 1];
            int l = 0;
            out.append(String.valueOf(pem_array[b2 >>> 2 & 63]));
            out.append(String.valueOf(pem_array[(b2 << 4 & 48) + (b4 >>> 4 & 15)]));
            out.append(String.valueOf(pem_array[(b4 << 2 & 60) + (l >>> 6 & 3)]));
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/Base64Encoder.java`
#### Snippet
```java
            int l = 0;
            out.append(String.valueOf(pem_array[b2 >>> 2 & 63]));
            out.append(String.valueOf(pem_array[(b2 << 4 & 48) + (b4 >>> 4 & 15)]));
            out.append(String.valueOf(pem_array[(b4 << 2 & 60) + (l >>> 6 & 3)]));
            out.append(String.valueOf(EQ));
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/Base64Encoder.java`
#### Snippet
```java
            out.append(String.valueOf(pem_array[b2 >>> 2 & 63]));
            out.append(String.valueOf(pem_array[(b2 << 4 & 48) + (b4 >>> 4 & 15)]));
            out.append(String.valueOf(pem_array[(b4 << 2 & 60) + (l >>> 6 & 3)]));
            out.append(String.valueOf(EQ));
            return out.toString();
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/Base64Encoder.java`
#### Snippet
```java
            out.append(String.valueOf(pem_array[(b2 << 4 & 48) + (b4 >>> 4 & 15)]));
            out.append(String.valueOf(pem_array[(b4 << 2 & 60) + (l >>> 6 & 3)]));
            out.append(String.valueOf(EQ));
            return out.toString();
        }
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/Base64Encoder.java`
#### Snippet
```java
        byte b5 = b[strt + 1];
        byte b6 = b[strt + 2];
        out.append(String.valueOf(pem_array[b3 >>> 2 & 63]));
        out.append(String.valueOf(pem_array[(b3 << 4 & 48) + (b5 >>> 4 & 15)]));
        out.append(String.valueOf(pem_array[(b5 << 2 & 60) + (b6 >>> 6 & 3)]));
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/Base64Encoder.java`
#### Snippet
```java
        byte b6 = b[strt + 2];
        out.append(String.valueOf(pem_array[b3 >>> 2 & 63]));
        out.append(String.valueOf(pem_array[(b3 << 4 & 48) + (b5 >>> 4 & 15)]));
        out.append(String.valueOf(pem_array[(b5 << 2 & 60) + (b6 >>> 6 & 3)]));
        out.append(String.valueOf(pem_array[b6 & 63]));
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/Base64Encoder.java`
#### Snippet
```java
        out.append(String.valueOf(pem_array[b3 >>> 2 & 63]));
        out.append(String.valueOf(pem_array[(b3 << 4 & 48) + (b5 >>> 4 & 15)]));
        out.append(String.valueOf(pem_array[(b5 << 2 & 60) + (b6 >>> 6 & 3)]));
        out.append(String.valueOf(pem_array[b6 & 63]));
        return out.toString();
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/Base64Encoder.java`
#### Snippet
```java
        out.append(String.valueOf(pem_array[(b3 << 4 & 48) + (b5 >>> 4 & 15)]));
        out.append(String.valueOf(pem_array[(b5 << 2 & 60) + (b6 >>> 6 & 3)]));
        out.append(String.valueOf(pem_array[b6 & 63]));
        return out.toString();
    }
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/DefaultSamplerCreator.java`
#### Snippet
```java
        sampler.setPort(request.serverPort());
        if (log.isDebugEnabled()) {
            log.debug("Proxy: setting port: {}", Integer.toString(sampler.getPort()));
        }
    }
```

### UnnecessaryCallToStringValueOf
Unnecessary `Long.toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/ProxyControl.java`
#### Snippet
```java
                        TestElement timer = (TestElement) template.clone();
                        try {
                            timer.setComment("Recorded:"+Long.toString(deltaT)+"ms");
                            replacer.undoReverseReplace(timer);
                            model.addComponent(timer, node);
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/AjpSampler.java`
#### Snippet
```java
                body = new ByteArrayInputStream(sbody);
            }
            hbuf.append(HTTPConstants.HEADER_CONTENT_LENGTH).append(COLON_SPACE).append(String.valueOf(cl)).append(NEWLINE);
            setInt(0xA008); // Content-length
            setString(String.valueOf(cl));
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/functions/src/main/java/org/apache/jmeter/functions/XPath.java`
#### Snippet
```java
    public synchronized void setParameters(Collection<CompoundVariable> parameters) throws InvalidVariableException {
        if (log.isDebugEnabled()) {
            log.debug("setParameter - Collection.size={}", Integer.toString(parameters.size()));
        }

```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/functions/src/main/java/org/apache/jmeter/functions/XPathWrapper.java`
#### Snippet
```java
        int currentRow = xpfc.nextRow();
        if (log.isDebugEnabled()) {
            log.debug("getting match number {}", Integer.toString(currentRow));
        }
        return xpfc.getXPathString(currentRow);
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/components/src/main/java/org/apache/jmeter/control/ForeachController.java`
#### Snippet
```java
                builder.append(getInputVal())
                .append(getSeparator())
                .append(Integer.toString(loopCount+1)).toString();
        if (context.getVariables().getObject(inputVariable) != null) {
            return false;
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/components/src/main/java/org/apache/jmeter/control/ForeachController.java`
#### Snippet
```java
                builder.append(getInputVal())
                .append(getSeparator())
                .append(Integer.toString(loopCount+1)).toString();
        final JMeterVariables variables = context.getVariables();
        final Object currentVariable = variables.getObject(inputVariable);
```

### UnnecessaryCallToStringValueOf
Unnecessary `Double.toString()` call
in `src/components/src/main/java/org/apache/jmeter/modifiers/SampleTimeout.java`
#### Snippet
```java
            long start = System.nanoTime();
            boolean interrupted = sampler.interrupt();
            String elapsed = Double.toString((double)(System.nanoTime()-start)/ 1000000000)+" secs";
            if (interrupted) {
                if (log.isWarnEnabled()) {
```

### UnnecessaryCallToStringValueOf
Unnecessary `Double.toString()` call
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/InfluxdbBackendListenerClient.java`
#### Snippet
```java

        if (!Double.isNaN(metric.getOkMean())) {
            field.append(',').append(METRIC_AVG).append(Double.toString(metric.getOkMean()));
        }
        if (!Double.isNaN(metric.getOkMinTime())) {
```

### UnnecessaryCallToStringValueOf
Unnecessary `Double.toString()` call
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/InfluxdbBackendListenerClient.java`
#### Snippet
```java
        }
        if (!Double.isNaN(metric.getOkMinTime())) {
            field.append(',').append(METRIC_MIN).append(Double.toString(metric.getOkMinTime()));
        }
        if (!Double.isNaN(metric.getOkMaxTime())) {
```

### UnnecessaryCallToStringValueOf
Unnecessary `Double.toString()` call
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/InfluxdbBackendListenerClient.java`
#### Snippet
```java
        }
        if (!Double.isNaN(metric.getOkMaxTime())) {
            field.append(',').append(METRIC_MAX).append(Double.toString(metric.getOkMaxTime()));
        }

```

### UnnecessaryCallToStringValueOf
Unnecessary `Double.toString()` call
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/InfluxdbBackendListenerClient.java`
#### Snippet
```java
        field.append(',').append(METRIC_RECEIVED_BYTES).append(metric.getReceivedBytes());
        for (Float pct : pcts) {
            field.append(',').append(METRIC_PCT_PREFIX).append(pct).append('=').append(Double.toString(metric.getAllPercentile(pct)));
        }
        influxdbMetricsManager.addMetric(measurement, tag.toString(), field.toString());
```

## RuleId[id=InstantiatingObjectToGetClassObject]
### InstantiatingObjectToGetClassObject
Instantiating object to get Class object
in `src/launcher/src/main/java/org/apache/jmeter/NewDriver.java`
#### Snippet
```java
                Class<?> initialClass = loader.loadClass("org.apache.jmeter.JMeter");// $NON-NLS-1$
                Object instance = initialClass.getDeclaredConstructor().newInstance();
                Method startup = initialClass.getMethod("start", new Class[] { new String[0].getClass() });// $NON-NLS-1$
                startup.invoke(instance, new Object[] { args });
            } catch(Throwable e){ // NOSONAR We want to log home directory in case of exception
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/assertions/gui/AssertionGui.java`
#### Snippet
```java
        ButtonGroup group = new ButtonGroup();
        group.add(responseStringButton);
        group.add(responseAsDocumentButton);
        group.add(urlButton);
        group.add(responseCodeButton);
        group.add(responseMessageButton);
        group.add(requestHeadersButton);
        group.add(responseHeadersButton);
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/assertions/gui/AssertionGui.java`
#### Snippet
```java
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/assertions/gui/BeanShellAssertionGui.java`
#### Snippet
```java
        setLayout(new BorderLayout(0, 5));
        setBorder(makeBorder());

        Box box = Box.createVerticalBox();
        box.add(makeTitlePanel());
        box.add(createResetPanel());
        box.add(createParameterPanel());
        box.add(createFilenamePanel());
        add(box, BorderLayout.NORTH);

        JPanel panel = createScriptPanel();
        add(panel, BorderLayout.CENTER);
        // Don't let the input field shrink too much
        add(Box.createVerticalStrut(panel.getPreferredSize().height), BorderLayout.WEST);
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/assertions/gui/JSONPathAssertionGui.java`
#### Snippet
```java
        JPanel panel = new JPanel(new MigLayout("fillx, wrap 2, insets 0", "[][fill,grow]"));

        jsonPath =  new JTextField();
        panel.add(JMeterUtils.labelFor(jsonPath, JSON_ASSERTION_PATH));
        panel.add(jsonPath, "span, growx");

        jsonValidation = new JCheckBox();
        panel.add(JMeterUtils.labelFor(jsonValidation, JSON_ASSERTION_VALIDATION));
        panel.add(jsonValidation, "span");

        isRegex = new JCheckBox();
        panel.add(JMeterUtils.labelFor(isRegex, JSON_ASSERTION_REGEX));
        panel.add(isRegex, "span");

        jsonValue =  JSyntaxTextArea.getInstance(5, 60);
        panel.add(JMeterUtils.labelFor(jsonValue, JSON_ASSERTION_EXPECTED_VALUE));
        panel.add(JTextScrollPane.getInstance(jsonValue));

        expectNull = new JCheckBox();
        panel.add(JMeterUtils.labelFor(expectNull, JSON_ASSERTION_NULL));
        panel.add(expectNull, "span");

        invert = new JCheckBox();
        panel.add(JMeterUtils.labelFor(invert, JSON_ASSERTION_INVERT));
        panel.add(invert, "span");
        return panel;
```

### DuplicatedCode
Duplicated code
in `src/protocol/ldap/src/main/java/org/apache/jmeter/protocol/ldap/config/gui/LdapExtConfigGui.java`
#### Snippet
```java
        row2Panel.add(addTest);
        bGroup.add(addTest);
        row2Panel.add(deleteTest);
        bGroup.add(deleteTest);
        row2Panel.add(searchTest);
        bGroup.add(searchTest);
        row2Panel.add(compare);
        bGroup.add(compare);
        row2Panel.add(modifyTest);
        bGroup.add(modifyTest);
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/assertions/gui/SizeAssertionGui.java`
#### Snippet
```java
        checkPanel.add(compareLabel);
        checkPanel.add(equalButton);
        checkPanel.add(notequalButton);
        checkPanel.add(greaterthanButton);
        checkPanel.add(lessthanButton);
        checkPanel.add(greaterthanequalButton);
        checkPanel.add(lessthanequalButton);
        return checkPanel;
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/assertions/gui/XPath2Panel.java`
#### Snippet
```java
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        gbc.weighty = 0;
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/control/ModuleController.java`
#### Snippet
```java
        Enumeration<?> enumr = from.children();
        while (enumr.hasMoreElements()) {
            JMeterTreeNode child = (JMeterTreeNode) enumr.nextElement();
            JMeterTreeNode childClone = (JMeterTreeNode) child.clone();
            childClone.setUserObject(((TestElement) child.getUserObject()).clone());
            to.add(childClone);
            cloneChildren((JMeterTreeNode) to.getLastChild(), child);
        }
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/control/gui/ForeachControlPanel.java`
#### Snippet
```java
        if (displayName) {
            setLayout(new BorderLayout(0, 5));
            setBorder(makeBorder());
            add(makeTitlePanel(), BorderLayout.NORTH);

            JPanel mainPanel = new JPanel(new BorderLayout());
            mainPanel.add(createLoopCountPanel(), BorderLayout.NORTH);
            add(mainPanel, BorderLayout.CENTER);
        } else {
            // Embedded
            setLayout(new BorderLayout());
            add(createLoopCountPanel(), BorderLayout.NORTH);
        }
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/extractor/BoundaryExtractor.java`
#### Snippet
```java
        int prevCount = 0;
        String prevString = vars.get(refName + REF_MATCH_NR);
        if (prevString != null) {
            // ensure old value is not left defined
            vars.remove(refName + REF_MATCH_NR);
            try {
                prevCount = Integer.parseInt(prevString);
            } catch (NumberFormatException nfe) {
                if (log.isWarnEnabled()) {
                    log.warn("{}: Could not parse number: '{}'.", getName(), prevString);
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/extractor/DebugPostProcessor.java`
#### Snippet
```java
        if (isDisplayJMeterProperties()){
            rd.append("JMeterProperties\n");
            sb.append("JMeterProperties:\n");
            formatSet(sb, JMeterUtils.getJMeterProperties().entrySet());
            sb.append("\n");
        }

        if (isDisplaySystemProperties()){
            rd.append("SystemProperties\n");
            sb.append("SystemProperties:\n");
            formatSet(sb, System.getProperties().entrySet());
            sb.append("\n");
        }
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/extractor/DebugPostProcessor.java`
#### Snippet
```java
        @SuppressWarnings("unchecked")
        List<Map.Entry<Object, Object>> al = new ArrayList<>(s);
        al.sort(AlphaNumericKeyComparator.INSTANCE);
        al.forEach(me -> sb.append(me.getKey()).append("=").append(me.getValue()).append("\n"));
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/extractor/HtmlExtractor.java`
#### Snippet
```java
        int matchSize = matches.size();

        if (matchSize <= 0 || entry > matchSize){
            return null;
        }

        if (entry == 0) { // Random match
            return matches.get(JMeterUtils.getRandomInt(matchSize));
        }

        return matches.get(entry - 1);
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/extractor/RegexExtractor.java`
#### Snippet
```java
            int prevCount = 0;
            String prevString = vars.get(refName + REF_MATCH_NR);
            if (prevString != null) {
                vars.remove(refName + REF_MATCH_NR);// ensure old value is not left defined
                try {
                    prevCount = Integer.parseInt(prevString);
                } catch (NumberFormatException nfe) {
                    log.warn("Could not parse number: '{}'", prevString);
                }
            }
            int matchCount=0;// Number of refName_n variable sets to keep
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/extractor/RegexExtractor.java`
#### Snippet
```java
        StringBuilder buf = new StringBuilder();
        buf.append(basename);
        buf.append("_g"); // $NON-NLS-1$
        int pfxlen=buf.length();
        String prevString=vars.get(buf.toString());
        int previous=0;
        if (prevString!=null){
            try {
                previous=Integer.parseInt(prevString);
            } catch (NumberFormatException nfe) {
                log.warn("Could not parse number: '{}'.", prevString);
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/extractor/RegexExtractor.java`
#### Snippet
```java
        for (int x = 0; x < groups; x++) {
            buf.append(x);
            vars.put(buf.toString(), match.group(x));
            buf.setLength(pfxlen);
        }
        vars.put(buf.toString(), Integer.toString(groups-1));
        for (int i = groups; i <= previous; i++){
            buf.append(i);
            vars.remove(buf.toString());// remove the remaining _gn vars
            buf.setLength(pfxlen);
        }
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/extractor/RegexExtractor.java`
#### Snippet
```java
        StringBuilder result = new StringBuilder();
        for (Object obj : template) {
            if(log.isDebugEnabled()) {
                log.debug("RegexExtractor: Template piece {} ({})", obj, obj.getClass());
            }
            if (obj instanceof Integer) {
                result.append(match.group((Integer) obj));
            } else {
                result.append(obj);
            }
        }
        log.debug("Regex Extractor result = '{}'", result);
        return result.toString();
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/extractor/XPath2Extractor.java`
#### Snippet
```java
        JMeterContext context = getThreadContext();
        final SampleResult previousResult = context.getPreviousResult();
        if (previousResult == null){
            return;
        }
        JMeterVariables vars = context.getVariables();
        String refName = getRefName();
        vars.put(refName, getDefaultValue());
        final String matchNR = concat(refName,REF_MATCH_NR);
        int prevCount=0; // number of previous matches
        try {
            prevCount=Integer.parseInt(vars.get(matchNR));
        } catch (NumberFormatException e) {
            // ignored
        }

        vars.put(matchNR, "0"); // In case parse fails // $NON-NLS-1$
        vars.remove(concat(refName,"1")); // In case parse fails // $NON-NLS-1$

        int matchNumber = getMatchNumber();
        List<String> matches = new ArrayList<>();
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/extractor/XPath2Extractor.java`
#### Snippet
```java
            final int matchCount = matches.size();
            vars.put(matchNR, String.valueOf(matchCount));
            if (matchCount > 0){
                String value = matches.get(0);
                if (value != null) {
                    vars.put(refName, value);
                }
                for(int i=0; i < matchCount; i++){
                    value = matches.get(i);
                    if (value != null) {
                        vars.put(concat(refName,i+1),matches.get(i));
                    }
                }
            }
            vars.remove(concat(refName,matchCount+1)); // Just in case
            // Clear any other remaining variables
            for(int i=matchCount+2; i <= prevCount; i++) {
                vars.remove(concat(refName,i));
            }
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/extractor/gui/BoundaryExtractorGui.java`
#### Snippet
```java
            showScopeSettings(boundary, true);
            useHeaders.setSelected(boundary.useHeaders());
            useRequestHeaders.setSelected(boundary.useRequestHeaders());
            useBody.setSelected(boundary.useBody());
            useUnescapedBody.setSelected(boundary.useUnescapedBody());
            useBodyAsDocument.setSelected(boundary.useBodyAsDocument());
            useURL.setSelected(boundary.useUrl());
            useCode.setSelected(boundary.useCode());
            useMessage.setSelected(boundary.useMessage());
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/extractor/gui/BoundaryExtractorGui.java`
#### Snippet
```java
        setLayout(new BorderLayout());
        setBorder(makeBorder());

        Box box = Box.createVerticalBox();
        box.add(makeTitlePanel());
        box.add(createScopePanel(true));
        box.add(makeSourcePanel());
        add(box, BorderLayout.NORTH);
        add(makeParameterPanel(), BorderLayout.CENTER);
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/extractor/gui/BoundaryExtractorGui.java`
#### Snippet
```java
JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(JMeterUtils.getResString("regex_source"))); //$NON-NLS-1$

        useBody = new JRadioButton(JMeterUtils.getResString("regex_src_body")); //$NON-NLS-1$
        useUnescapedBody = new JRadioButton(JMeterUtils.getResString("regex_src_body_unescaped")); //$NON-NLS-1$
        useBodyAsDocument = new JRadioButton(JMeterUtils.getResString("regex_src_body_as_document")); //$NON-NLS-1$
        useHeaders = new JRadioButton(JMeterUtils.getResString("regex_src_hdrs")); //$NON-NLS-1$
        useRequestHeaders = new JRadioButton(JMeterUtils.getResString("regex_src_hdrs_req")); //$NON-NLS-1$
        useURL = new JRadioButton(JMeterUtils.getResString("regex_src_url")); //$NON-NLS-1$
        useCode = new JRadioButton(JMeterUtils.getResString("assertion_code_resp")); //$NON-NLS-1$
        useMessage = new JRadioButton(JMeterUtils.getResString("assertion_message_resp")); //$NON-NLS-1$

        group = new ButtonGroup();
        group.add(useBody);
        group.add(useUnescapedBody);
        group.add(useBodyAsDocument);
        group.add(useHeaders);
        group.add(useRequestHeaders);
        group.add(useURL);
        group.add(useCode);
        group.add(useMessage);

        panel.add(useBody);
        panel.add(useUnescapedBody);
        panel.add(useBodyAsDocument);
        panel.add(useHeaders);
        panel.add(useRequestHeaders);
        panel.add(useURL);
        panel.add(useCode);
        panel.add(useMessage);

        useBody.setSelected(true);

        // So we know which button is selected
        useBody.setActionCommand(RegexExtractor.USE_BODY);
        useUnescapedBody.setActionCommand(RegexExtractor.USE_BODY_UNESCAPED);
        useBodyAsDocument.setActionCommand(RegexExtractor.USE_BODY_AS_DOCUMENT);
        useHeaders.setActionCommand(RegexExtractor.USE_HDRS);
        useRequestHeaders.setActionCommand(RegexExtractor.USE_REQUEST_HDRS);
        useURL.setActionCommand(RegexExtractor.USE_URL);
        useCode.setActionCommand(RegexExtractor.USE_CODE);
        useMessage.setActionCommand(RegexExtractor.USE_MESSAGE);

        return panel;
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/extractor/gui/BoundaryExtractorGui.java`
#### Snippet
```java
        refNameField = new JLabeledTextField(JMeterUtils.getResString("ref_name_field")); //$NON-NLS-1$
        matchNumberField = new JLabeledTextField(JMeterUtils.getResString("match_num_field")); //$NON-NLS-1$

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        initConstraints(gbc);
        addField(panel, refNameField, gbc);
        resetContraints(gbc);
        addField(panel, leftBoundaryField, gbc);
        resetContraints(gbc);
        addField(panel, rightBoundaryField, gbc);
        resetContraints(gbc);
        addField(panel, matchNumberField, gbc);
        resetContraints(gbc);
        gbc.weighty = 1;

        defaultField = new JLabeledTextField(JMeterUtils.getResString("default_value_field")); //$NON-NLS-1$
        List<JComponent> item = defaultField.getComponentList();
        panel.add(item.get(0), gbc.clone());
        JPanel p = new JPanel(new BorderLayout());
        p.add(item.get(1), BorderLayout.WEST);
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/extractor/gui/XPathExtractorGui.java`
#### Snippet
```java
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        initConstraints(gbc);
        addField(panel, refNameField, gbc);
        resetContraints(gbc);
        addField(panel, xpathQueryField, gbc);
        resetContraints(gbc);
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/reporters/gui/ResultSaverGui.java`
#### Snippet
```java
        GridBagConstraints gbc = new GridBagConstraints();
        initConstraints(gbc);

        addField(panel, variableName, gbc);
        resetContraints(gbc);
        addField(panel, filename, gbc);
        resetContraints(gbc);
        addField(panel, skipAutoNumber, gbc);
        resetContraints(gbc);
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/extractor/gui/BoundaryExtractorGui.java`
#### Snippet
```java
        emptyDefaultValue.addItemListener(evt -> {
            if(emptyDefaultValue.isSelected()) {
                defaultField.setText("");
            }
            defaultField.setEnabled(!emptyDefaultValue.isSelected());
        });
        p.add(emptyDefaultValue, BorderLayout.CENTER);
        gbc.gridx++;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(p, gbc.clone());

        return panel;
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/extractor/gui/BoundaryExtractorGui.java`
#### Snippet
```java
        List<JComponent> item = field.getComponentList();
        panel.add(item.get(0), gbc.clone());
        gbc.gridx++;
        gbc.weightx = 1;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        panel.add(item.get(1), gbc.clone());
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/extractor/json/jmespath/gui/JMESPathExtractorGui.java`
#### Snippet
```java
        setLayout(new BorderLayout());
        setBorder(makeBorder());

        Box box = Box.createVerticalBox();
        box.add(makeTitlePanel());
        box.add(createScopePanel(true));
        add(box, BorderLayout.NORTH);
        add(makeParameterPanel(), BorderLayout.CENTER);
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/extractor/json/jmespath/gui/JMESPathExtractorGui.java`
#### Snippet
```java
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        initConstraints(gbc);
        addField(panel, refNameField, gbc);
        nextLine(gbc);
        addField(panel, jmesPathExpressionField, gbc);
        nextLine(gbc);
        addField(panel, matchNumberField, gbc);
        nextLine(gbc);
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/modifiers/gui/UserParametersGui.java`
#### Snippet
```java
                for (int i = rowsSelected.length - 1; i >= 0; i--) {
                    int rowSelected = rowsSelected[i];
                    tableModel.moveRow(rowSelected, rowSelected + 1, rowSelected + 1);
                }
                for (int rowSelected : rowsSelected) {
                    paramTable.addRowSelectionInterval(rowSelected + 1, rowSelected + 1);
                }
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/AxisGraph.java`
#### Snippet
```java
            dataSeries.addIAxisPlotDataSet( axisChartDataSet );

            ChartProperties chartProperties= new ChartProperties();
            LabelAxisProperties xaxis = new LabelAxisProperties();
            DataAxisProperties yaxis = new DataAxisProperties();
            yaxis.setUseCommas(showGrouping);

            if (legendFont != null) {
                yaxis.setAxisTitleChartFont(new ChartFont(legendFont, new Color(20)));
                yaxis.setScaleChartFont(new ChartFont(legendFont, new Color(20)));
                xaxis.setAxisTitleChartFont(new ChartFont(legendFont, new Color(20)));
                xaxis.setScaleChartFont(new ChartFont(legendFont, new Color(20)));
            }
            if (titleFont != null) {
                chartProperties.setTitleFont(new ChartFont(titleFont, new Color(0)));
            }
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphChart.java`
#### Snippet
```java
            LabelAxisProperties xaxis = new LabelAxisProperties();
            DataAxisProperties yaxis = new DataAxisProperties();
            yaxis.setUseCommas(showGrouping);

            if (legendFont != null) {
                yaxis.setAxisTitleChartFont(new ChartFont(legendFont, new Color(20)));
                yaxis.setScaleChartFont(new ChartFont(legendFont, new Color(20)));
                xaxis.setAxisTitleChartFont(new ChartFont(legendFont, new Color(20)));
                xaxis.setScaleChartFont(new ChartFont(legendFont, new Color(20)));
            }
            if (titleFont != null) {
                chartProperties.setTitleFont(new ChartFont(titleFont, new Color(0)));
            }
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/AxisGraph.java`
#### Snippet
```java
            if (legendPlacement == LegendAreaProperties.RIGHT || legendPlacement == LegendAreaProperties.LEFT) {
                legendProperties.setNumColumns(1);
            }
            if (legendFont != null) {
                legendProperties.setFont(legendFont); //new Font("SansSerif", Font.PLAIN, 10)
            }
            AxisChart axisChart = new AxisChart(
                    dataSeries, chartProperties, axisProperties,
                    legendProperties, _width, _height );
            axisChart.setGraphics2D((Graphics2D) g);
            axisChart.render();
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/MailerVisualizer.java`
#### Snippet
```java
        successSubjectField = new JTextField(10);
        successSubjectField.setEditable(true);
        succesSubjectPane.add(successSubjectField, BorderLayout.CENTER);
        succesSubjectPane.add(Box.createRigidArea(new Dimension(5,0)), BorderLayout.EAST);
        successPane.add(succesSubjectPane, BorderLayout.CENTER);
        JPanel successLimitPane = new JPanel(new BorderLayout());
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/RenderAsBoundaryExtractor.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder();
        sb.append("Match count: ").append(nbFound).append("\n");
        for (int j = 0; j < nbFound; j++) {
            String match = matches.get(j);
            sb.append("Match[").append(j+1).append("]=").append(match).append("\n");
        }
        return sb.toString();
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/RenderAsBoundaryExtractor.java`
#### Snippet
```java
        boundaryExtractorDataField = new JTextArea();
        boundaryExtractorDataField.setEditable(true);
        boundaryExtractorDataField.setLineWrap(true);
        boundaryExtractorDataField.setWrapStyleWord(true);

        JScrollPane boundaryExtractorDataPane = GuiUtils.makeScrollPane(boundaryExtractorDataField);
        boundaryExtractorDataPane.setPreferredSize(new Dimension(0, 200));

        JPanel pane = new JPanel(new BorderLayout(0, 5));
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/RenderAsBoundaryExtractor.java`
#### Snippet
```java
        boundaryExtractorTester.setActionCommand(BOUNDARY_EXTRACTOR_TESTER_COMMAND);
        boundaryExtractorTester.addActionListener(this);
        boundaryExtractorActionPanel.add(boundaryExtractorTester, BorderLayout.EAST);

        boundaryExtractorResultField = new JTextArea();
        boundaryExtractorResultField.setEditable(false);
        boundaryExtractorResultField.setLineWrap(true);
        boundaryExtractorResultField.setWrapStyleWord(true);

        JPanel boundaryExtractorTasksPanel = new JPanel(new BorderLayout(0, 5));
        boundaryExtractorTasksPanel.add(boundaryExtractorActionPanel, BorderLayout.NORTH);
        boundaryExtractorTasksPanel.add(GuiUtils.makeScrollPane(boundaryExtractorResultField), BorderLayout.CENTER);

        return boundaryExtractorTasksPanel;
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/RenderAsCssJQuery.java`
#### Snippet
```java
        cssJqueryResultField = new JTextArea();
        cssJqueryResultField.setEditable(false);
        cssJqueryResultField.setLineWrap(true);
        cssJqueryResultField.setWrapStyleWord(true);

        JPanel cssJqueryTasksPanel = new JPanel(new BorderLayout(0, 5));
        cssJqueryTasksPanel.add(cssJqueryActionPanel, BorderLayout.NORTH);
        cssJqueryTasksPanel.add(GuiUtils.makeScrollPane(cssJqueryResultField), BorderLayout.CENTER);

        return cssJqueryTasksPanel;
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/RenderAsHTML.java`
#### Snippet
```java
        if (response == null) {
            results.setText("");
            return;
        }

        int htmlIndex = response.indexOf("<HTML"); // could be <HTML lang=""> // $NON-NLS-1$

        // Look for a case variation
        if (htmlIndex < 0) {
            htmlIndex = response.indexOf("<html"); // ditto // $NON-NLS-1$
        }

        // If we still can't find it, just try using all of the text
        if (htmlIndex < 0) {
            htmlIndex = 0;
        }
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/RenderAsXPath.java`
#### Snippet
```java
            StringBuilder builder = new StringBuilder();
            int nbFound = matchStrings.size();
            builder.append("Match count: ").append(nbFound).append("\n");
            for (int i = 0; i < nbFound; i++) {
                builder.append("Match[").append(i+1).append("]=").append(matchStrings.get(i)).append("\n");
            }
            return builder.toString();
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/RenderAsXPath.java`
#### Snippet
```java
        String response = ViewResultsFullVisualizer.getResponseAsString(sampleResult);
        response = ViewResultsFullVisualizer.wrapLongLines(response);
        try {
            xmlDataField.setText(response == null ? "" : response);
            xmlDataField.setCaretPosition(0);
        } catch (Exception e) {
            log.error("Exception converting to XML: {}, message: {}", response, e.getMessage(), e);
            xmlDataField.setText("Exception converting to XML:"+response+ ", message:"+e.getMessage());
            xmlDataField.setCaretPosition(0);
        }
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/RenderAsXPath.java`
#### Snippet
```java
        xmlDataField = JSyntaxTextArea.getInstance(50, 80, true);
        xmlDataField.setCodeFoldingEnabled(true);
        xmlDataField.setEditable(true);
        xmlDataField.setBracketMatchingEnabled(false);
        xmlDataField.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_XML);
        xmlDataField.setLanguage(SyntaxConstants.SYNTAX_STYLE_XML);
        xmlDataField.setLineWrap(true);
        xmlDataField.setWrapStyleWord(true);

        JScrollPane xmlDataPane = JTextScrollPane.getInstance(xmlDataField, true);
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/RequestViewRaw.java`
#### Snippet
```java
        sampleDataField = JSyntaxTextArea.getInstance(20, 80, true);
        sampleDataField.setEditable(false);
        sampleDataField.setLineWrap(true);
        sampleDataField.setWrapStyleWord(true);
        JPanel requestAndSearchPanel = new JPanel(new BorderLayout());
        requestAndSearchPanel.add(new JSyntaxSearchToolBar(sampleDataField).getToolBar(), BorderLayout.NORTH);
        requestAndSearchPanel.add(JTextScrollPane.getInstance(sampleDataField), BorderLayout.CENTER);
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java
        int width = (int) size.getWidth();
        int height = (int) size.getHeight();
        if (!dynamicGraphSize.isSelected()) {
            String wstr = graphWidth.getText();
            String hstr = graphHeight.getText();
            if (wstr.length() != 0) {
                width = Integer.parseInt(wstr);
            }
            if (hstr.length() != 0) {
                height = Integer.parseInt(hstr);
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java
        this.setLayout(new BorderLayout());

        // MAIN PANEL
        JPanel mainPanel = new JPanel();
        Border margin = new EmptyBorder(10, 10, 5, 10);
        Border margin2 = new EmptyBorder(10, 10, 5, 10);

        mainPanel.setBorder(margin);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(makeTitlePanel());
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java
        settingsPane.add(createGraphDimensionPane());
        JPanel axisPane = new JPanel(new BorderLayout());
        axisPane.add(createGraphXAxisPane(), BorderLayout.WEST);
        axisPane.add(createGraphYAxisPane(), BorderLayout.CENTER);
        settingsPane.add(axisPane);
        settingsPane.add(createLegendPane());

        tabbedGraph.addTab(JMeterUtils.getResString("aggregate_graph_tab_settings"), settingsPane); //$NON-NLS-1$
        tabbedGraph.addTab(JMeterUtils.getResString("aggregate_graph_tab_graph"), graphPanel); //$NON-NLS-1$
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java
        JPanel buttonPanel = new JPanel(new BorderLayout());
        JPanel displayPane = new JPanel();
        displayPane.add(displayButton);
        displayButton.addActionListener(this);
        buttonPanel.add(displayPane, BorderLayout.WEST);

        JPanel savePane = new JPanel();
        savePane.add(saveGraph);
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java
        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new BoxLayout(searchPanel, BoxLayout.X_AXIS));
        searchPanel.setBorder(BorderFactory.createEmptyBorder(3, 0, 3, 0));

        searchPanel.add(samplerSelection);
        samplerMatchLabel.setEnabled(false);
        applyFilterBtn.setEnabled(false);
        caseChkBox.setEnabled(false);
        regexpChkBox.setEnabled(false);
        samplerSelection.addActionListener(this);

        searchPanel.add(samplerMatchLabel);
        searchPanel.add(Box.createRigidArea(new Dimension(5,0)));

        // Button
        JFactory.small(applyFilterBtn);
        applyFilterBtn.addActionListener(this);
        searchPanel.add(applyFilterBtn);

        // checkboxes
        JFactory.small(caseChkBox);
        searchPanel.add(caseChkBox);
        JFactory.small(regexpChkBox);
        searchPanel.add(regexpChkBox);

        return searchPanel;
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java
        titleNamePane.add(graphTitle, BorderLayout.CENTER);
        titleNamePane.add(syncWithName, BorderLayout.EAST);

        JPanel titleStylePane = new JPanel();
        titleStylePane.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 5));
        titleStylePane.add(GuiUtils.createLabelCombo(JMeterUtils.getResString("aggregate_graph_font"), //$NON-NLS-1$
                titleFontNameList));
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java
        legendPanel.add(GuiUtils.createLabelCombo(JMeterUtils.getResString("aggregate_graph_font"), //$NON-NLS-1$
                fontNameList));
        fontNameList.setSelectedIndex(DEFAULT_LEGEND_FONT);
        legendPanel.add(GuiUtils.createLabelCombo(JMeterUtils.getResString("aggregate_graph_size"), //$NON-NLS-1$
                fontSizeList));
        fontSizeList.setSelectedItem(StatGraphProperties.getFontSize()[DEFAULT_LEGEND_SIZE]);
        legendPanel.add(GuiUtils.createLabelCombo(JMeterUtils.getResString("aggregate_graph_style"), //$NON-NLS-1$
                fontStyleList));
        fontStyleList.setSelectedIndex(DEFAULT_LEGEND_STYLE);
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java
        graphWidth.setEnabled(false);
        graphHeight.setEnabled(false);
        dynamicGraphSize.addActionListener(this);
        dimensionPane.add(Box.createRigidArea(new Dimension(10,0)));
        dimensionPane.add(graphWidth);
        dimensionPane.add(Box.createRigidArea(new Dimension(5,0)));
        dimensionPane.add(graphHeight);
        return dimensionPane;
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java
        String textToFindQ = Pattern.quote(textToFind);
        if (regexpChkBox.isSelected()) {
            textToFindQ = textToFind;
        }
        Pattern pattern = null;
        try {
            if (caseChkBox.isSelected()) {
                pattern = Pattern.compile(textToFindQ);
            } else {
                pattern = Pattern.compile(textToFindQ, Pattern.CASE_INSENSITIVE);
            }
        } catch (PatternSyntaxException pse) {
            return null;
        }
        return pattern;
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/SamplerResultTab.java`
#### Snippet
```java
        RendererUtils.applyRenderers(tableResult, RENDERERS_RESULT);

        // Set up the 2nd table
        tableResHeaders = new JTable(resHeadersModel);
        JMeterUtils.applyHiDPI(tableResHeaders);
        tableResHeaders.setToolTipText(JMeterUtils.getResString("textbox_tooltip_cell")); // $NON-NLS-1$
        tableResHeaders.addMouseListener(new TextBoxDoubleClick(tableResHeaders));
        setFirstColumnPreferredSize(tableResHeaders);
        tableResHeaders.getTableHeader().setDefaultRenderer(
                new HeaderAsPropertyRenderer());
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java
        valueFontNameList.setSelectedIndex(0); // default: sans serif
        fontValueStylePane.add(GuiUtils.createLabelCombo(JMeterUtils.getResString("aggregate_graph_size"), //$NON-NLS-1$
                valueFontSizeList));
        valueFontSizeList.setSelectedItem(StatGraphProperties.getFontSize()[2]); // default: 10
        fontValueStylePane.add(GuiUtils.createLabelCombo(JMeterUtils.getResString("aggregate_graph_style"), //$NON-NLS-1$
                valueFontStyleList));
        valueFontStyleList.setSelectedItem(JMeterUtils.getResString("fontstyle.normal")); // default: normal //$NON-NLS-1$

        return fontValueStylePane;
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatVisualizer.java`
#### Snippet
```java
        this.setLayout(new BorderLayout());

        // MAIN PANEL
        JPanel mainPanel = new JPanel();
        Border margin = new EmptyBorder(10, 10, 5, 10);

        mainPanel.setBorder(margin);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        mainPanel.add(makeTitlePanel());
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatVisualizer.java`
#### Snippet
```java
        this.add(mainPanel, BorderLayout.NORTH);
        this.add(myScrollPane, BorderLayout.CENTER);
        saveTable.addActionListener(this);
        JPanel opts = new JPanel();
        opts.add(useGroupName, BorderLayout.WEST);
        opts.add(saveTable, BorderLayout.CENTER);
        opts.add(saveHeaders, BorderLayout.EAST);
        this.add(opts,BorderLayout.SOUTH);
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/TableVisualizer.java`
#### Snippet
```java
        noSamplesField.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        noSamplesField.setEditable(false);
        noSamplesField.setForeground(Color.black);
        noSamplesField.setBackground(getBackground());
        noSamplesPanel.add(noSamplesLabel);
        noSamplesPanel.add(noSamplesField);

        JPanel tableInfoPanel = new JPanel();
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/ViewResultsFullVisualizer.java`
#### Snippet
```java
                AssertionResult[] assertionResults = res.getAssertionResults();
                int assertionIndex = currNode.getChildCount();
                for (AssertionResult assertionResult : assertionResults) {
                    if (assertionResult.isFailure() || assertionResult.isError()) {
                        DefaultMutableTreeNode assertionNode = new SearchableTreeNode(assertionResult, treeModel);
                        treeModel.insertNodeInto(assertionNode, currNode, assertionIndex++);
                        selectedPath = checkExpandedOrSelected(path,
                                assertionResult, oldSelectedElement,
                                oldExpandedElements, newExpandedPaths, selectedPath,
                                assertionNode);
                    }
                }
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/graphite/GraphiteBackendListenerClient.java`
#### Snippet
```java
        boolean cancelState = timerHandle.cancel(false);
        log.debug("Canceled state: {}", cancelState);
        scheduler.shutdown();
        try {
            scheduler.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            log.error("Error waiting for end of scheduler");
            Thread.currentThread().interrupt();
        }
```

### DuplicatedCode
Duplicated code
in `src/components/src/main/java/org/apache/jmeter/visualizers/utils/Colors.java`
#### Snippet
```java
        Properties defaultProps = JMeterUtils.loadProperties(DEFAULT_COLORS_PROPERTY_FILE);
        if (defaultProps == null) {
            JOptionPane.showMessageDialog(null,
                    JMeterUtils.getResString("toolbar_icon_set_not_found"), // $NON-NLS-1$
                    JMeterUtils.getResString("toolbar_icon_set_not_found"), // $NON-NLS-1$
                    JOptionPane.WARNING_MESSAGE);
            return null;
        }
        Properties p;
        String userProp = JMeterUtils.getProperty(USER_DEFINED_COLORS_PROPERTY_FILE);
        if (userProp != null){
            p = JMeterUtils.loadProperties(userProp, defaultProps);
        } else {
            p=defaultProps;
        }

        String order = JMeterUtils.getPropDefault(COLORS_ORDER, p.getProperty(ORDER_PROP_NAME));
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
                        ReplaceableController rc = ensureReplaceableControllerIsLoaded(item);

                        HashTree subTree = tree.getTree(item);
                        if (subTree != null) {
                            HashTree replacementTree = rc.getReplacementSubTree();
                            if (replacementTree != null) {
                                pConvertSubTree(replacementTree);
                                tree.replaceKey(item, rc);
                                tree.set(rc, replacementTree);
                            }
                        }
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/config/gui/ArgumentsPanel.java`
#### Snippet
```java
        int[] rowsSelected = table.getSelectedRows();
        GuiUtils.stopTableEditing(table);

        if (rowsSelected.length > 0 && rowsSelected[rowsSelected.length - 1] < table.getRowCount() - 1) {
            table.clearSelection();
            for (int i = rowsSelected.length - 1; i >= 0; i--) {
                int rowSelected = rowsSelected[i];
                tableModel.moveRow(rowSelected, rowSelected + 1, rowSelected + 1);
            }
            for (int rowSelected : rowsSelected) {
                table.addRowSelectionInterval(rowSelected + 1, rowSelected + 1);
            }

            scrollToRowIfNotVisible(rowsSelected[0]+1);
        }
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/testbeans/gui/TableEditor.java`
#### Snippet
```java
                table.clearSelection();
                for (int i = rowsSelected.length - 1; i >= 0; i--) {
                    int rowSelected = rowsSelected[i];
                    model.moveRow(rowSelected, rowSelected + 1, rowSelected + 1);
                }
                for (int rowSelected : rowsSelected) {
                    table.addRowSelectionInterval(rowSelected + 1, rowSelected + 1);
                }
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/config/gui/ArgumentsPanel.java`
#### Snippet
```java
        if(table.getParent() instanceof JViewport) {
            Rectangle visibleRect = table.getVisibleRect();
            final int cellIndex = 0;
            Rectangle cellRect = table.getCellRect(rowIndex, cellIndex, false);
            if (visibleRect.y > cellRect.y) {
                table.scrollRectToVisible(cellRect);
            } else {
                Rectangle rect2 = table.getCellRect(rowIndex + getNumberOfVisibleRows(table), cellIndex, true);
                int width = rect2.y - cellRect.y;
                table.scrollRectToVisible(new Rectangle(cellRect.x, cellRect.y, cellRect.width, cellRect.height + width));
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/config/gui/ArgumentsPanel.java`
#### Snippet
```java
        int[] rowsSelected = table.getSelectedRows();
        GuiUtils.stopTableEditing(table);

        if (rowsSelected.length > 0 && rowsSelected[0] > 0) {
            table.clearSelection();
            for (int rowSelected : rowsSelected) {
                tableModel.moveRow(rowSelected, rowSelected + 1, rowSelected - 1);
            }

            for (int rowSelected : rowsSelected) {
                table.addRowSelectionInterval(rowSelected - 1, rowSelected - 1);
            }

            scrollToRowIfNotVisible(rowsSelected[0]-1);
        }
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/config/gui/ArgumentsPanel.java`
#### Snippet
```java
        showDetail.addActionListener(this);
        add.addActionListener(this);
        addFromClipboard.addActionListener(this);
        delete.addActionListener(this);
        buttonPanel.add(showDetail);
        buttonPanel.add(add);
        buttonPanel.add(addFromClipboard);
        buttonPanel.add(delete);
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/config/gui/RowDetailDialog.java`
#### Snippet
```java
        ActionMap actionMap = rootPane.getActionMap();
        actionMap.put(escapeAction.getValue(Action.NAME), escapeAction);
        actionMap.put(enterAction.getValue(Action.NAME), enterAction);
        InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStrokes.ESC, escapeAction.getValue(Action.NAME));
        inputMap.put(KeyStrokes.ENTER, enterAction.getValue(Action.NAME));
        return rootPane;
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/config/gui/SimpleConfigGui.java`
#### Snippet
```java
        GuiUtils.cancelEditing(table);

        int rowSelected = table.getSelectedRow();

        if (rowSelected >= 0) {
            tableModel.removeRow(rowSelected);
            tableModel.fireTableDataChanged();

            // Disable DELETE if there are no rows in the table to delete.
            if (tableModel.getRowCount() == 0) {
                delete.setEnabled(false);
            } else {
                // Table still contains one or more rows, so highlight (select)
                // the appropriate one.
                int rowToSelect = rowSelected;

                if (rowSelected >= tableModel.getRowCount()) {
                    rowToSelect = rowSelected - 1;
                }

                table.setRowSelectionInterval(rowToSelect, rowToSelect);
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/control/gui/JMSPropertiesPanel.java`
#### Snippet
```java
                    tableModel.removeRow(rowSelected);
                    tableModel.fireTableDataChanged();

                    // Disable the DELETE and SAVE buttons if no rows remaining
                    // after delete.
                    if (tableModel.getRowCount() == 0) {
                        deleteButton.setEnabled(false);
                    }

                    // Table still contains one or more rows, so highlight
                    // (select) the appropriate one.
                    else {
                        int rowToSelect = rowSelected;

                        if (rowSelected >= tableModel.getRowCount()) {
                            rowToSelect = rowSelected - 1;
                        }

                        jmsPropertiesTable.setRowSelectionInterval(rowToSelect, rowToSelect);
                    }
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/gui/SavePropertyDialog.java`
#### Snippet
```java
        JRootPane rootPane = new JRootPane();
        Action escapeAction = new AbstractAction("ESCAPE") {
            private static final long serialVersionUID = 2208129319916921772L;

            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        };
        InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStrokes.ESC, escapeAction.getValue(Action.NAME));
        rootPane.getActionMap().put(escapeAction.getValue(Action.NAME), escapeAction);
        return rootPane;
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/gui/ServerPanel.java`
#### Snippet
```java
        port = new JTextField(4);

        JLabel label = new JLabel(JMeterUtils.getResString("web_server_port")); // $NON-NLS-1$
        label.setLabelFor(port);

        JPanel panel = new JPanel(new BorderLayout(5, 0));
        panel.add(label, BorderLayout.WEST);
        panel.add(port, BorderLayout.CENTER);

        return panel;
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/gui/ServerPanel.java`
#### Snippet
```java
        JLabel label = new JLabel(JMeterUtils.getResString("web_server_timeout_connect")); // $NON-NLS-1$
        label.setLabelFor(connectTimeOut);

        JPanel panel = new JPanel(new BorderLayout(5, 0));
        panel.add(label, BorderLayout.WEST);
        panel.add(connectTimeOut, BorderLayout.CENTER);

        return panel;
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/gui/ServerPanel.java`
#### Snippet
```java
        JLabel label = new JLabel(JMeterUtils.getResString("web_server_timeout_response")); // $NON-NLS-1$
        label.setLabelFor(responseTimeOut);

        JPanel panel = new JPanel(new BorderLayout(5, 0));
        panel.add(label, BorderLayout.WEST);
        panel.add(responseTimeOut, BorderLayout.CENTER);

        return panel;
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/gui/util/MenuFactory.java`
#### Snippet
```java
        String addAction = ActionNames.ADD;
        JMenu addMenu = new JMenu(JMeterUtils.getResString("add")); // $NON-NLS-1$
        addMenu.add(MenuFactory.makeMenu(MenuFactory.SAMPLERS, addAction));
        addMenu.addSeparator();
        addMenu.add(MenuFactory.makeMenu(MenuFactory.CONTROLLERS, addAction));
        addMenu.addSeparator();
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/report/processor/ExternalSampleSorter.java`
#### Snippet
```java
        if (parallelize) {
            workQueue.add(jobLeft);
            workQueue.add(jobRight);
            try {
                newLeft = jobLeft.getResult();
                newRight = jobRight.getResult();
            } catch (InterruptedException ie) { // NOSONAR we throw another exception
                throw new SampleException("Unexpected interruption !", ie);
            }
        } else {
            newLeft = jobLeft.exec();
            newRight = jobRight.exec();
        }
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/report/processor/TaggerConsumer.java`
#### Snippet
```java
            SampleMetadata consumedMetadata = getConsumedMetadata(i);

            // Copy metadata to an array
            int colCount = consumedMetadata.getColumnCount();
            String[] names = new String[colCount + 1];
            for (int j = 0; j < colCount; j++) {
                names[j] = consumedMetadata.getColumnName(j);
            }

            // Add the new field
            names[colCount] = tagLabel;

            // Build the produced metadata from the array
            SampleMetadata producedMetadata = new SampleMetadata(
                    consumedMetadata.getSeparator(), names);

            // Add a sample builder for the current channel
            builders.add(new SampleBuilder(producedMetadata));
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/report/processor/TaggerConsumer.java`
#### Snippet
```java
        SampleBuilder builder = builders.get(channel);
        SampleMetadata metadata = builder.getMetadata();
        int colCount = metadata.getColumnCount();
        for (int i = 0; i < colCount - 1; i++) {
            builder.add(sample.getData(i));
        }
        builder.add(String.valueOf(index));
        return builder.build();
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/report/processor/graph/AbstractGraphConsumer.java`
#### Snippet
```java
                for (Map.Entry<Double, Aggregator> entry : sortedInfo
                        .entrySet()) {
                    Double value = entry.getKey();
                    percent += (double) 100 * entry.getValue().getCount()
                            / count;
                    double percentile = (double) rank / 10;
                    while (percentile < percent) {
                        ListResultData coordResult = new ListResultData();
                        coordResult.addResult(new ValueResultData(
                                percentile));
                        coordResult.addResult(new ValueResultData(value));
                        dataResult.addResult(coordResult);
                        percentile = (double) ++rank / 10;
                    }
                    setMinResult(result, RESULT_MIN_Y, value);
                    setMaxResult(result, RESULT_MAX_Y, value);
                }
                setMinResult(result, RESULT_MIN_X, 0d);
                setMaxResult(result, RESULT_MAX_X, 100d);
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/rmi/SSLRMIClientSocketFactory.java`
#### Snippet
```java
        char[] passphrase = null;
        if (keyStorePassword != null) {
            passphrase = keyStorePassword.toCharArray();
        }

        KeyStore keyStore = null;
        if (keyStoreLocation != null) {
            keyStore = loadStore(keyStoreLocation, passphrase, keyStoreType);
        }

        KeyStore trustStore;
        if (trustStoreLocation != null) {
            trustStore = loadStore(trustStoreLocation, trustStorePassword.toCharArray(), trustStoreType);
        } else {
            trustStore = keyStore;
        }

        if (alias == null) {
            throw new IOException(
                    "SSL certificate alias cannot be null; MUST be set for SSLServerSocketFactory!");
        }
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/save/converters/SampleResultConverter.java`
#### Snippet
```java
        SampleSaveConfiguration save = res.getSaveConfig();
        setAttributes(writer, context, res, save);
        saveAssertions(writer, context, res, save);
        saveSubResults(writer, context, res, save);
        saveResponseHeaders(writer, context, res, save);
        saveRequestHeaders(writer, context, res, save);
        saveResponseData(writer, context, res, save);
        saveSamplerData(writer, context, res, save);
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/threads/TestCompiler.java`
#### Snippet
```java
        List<ConfigTestElement> configs = new ArrayList<>();
        List<Controller> controllers = new ArrayList<>();
        List<SampleListener> listeners = new ArrayList<>();
        List<Timer> timers = new ArrayList<>();
        List<Assertion> assertions = new ArrayList<>();
        List<PostProcessor> posts = new ArrayList<>();
        List<PreProcessor> pres = new ArrayList<>();
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/util/JSR223TestElement.java`
#### Snippet
```java
        JMeterContext jmctx = JMeterContextService.getContext();
        bindings.put("ctx", jmctx); // $NON-NLS-1$ (this name is fixed)
        JMeterVariables vars = jmctx.getVariables();
        bindings.put("vars", vars); // $NON-NLS-1$ (this name is fixed)
        Properties props = JMeterUtils.getJMeterProperties();
        bindings.put("props", props); // $NON-NLS-1$ (this name is fixed)
        // For use in debugging:
        bindings.put("OUT", System.out); // NOSONAR $NON-NLS-1$ (this name is fixed)
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/util/StringUtilities.java`
#### Snippet
```java
        StringBuilder ret = new StringBuilder(input.length());
        int start = 0;
        int index = -1;
        final int length = pattern.length();
        while ((index = input.indexOf(pattern, start)) >= start) {
            ret.append(input.substring(start, index));
            ret.append(sub);
            start = index + length;
        }
        ret.append(input.substring(start));
        return ret.toString();
```

### DuplicatedCode
Duplicated code
in `src/core/src/main/java/org/apache/jmeter/util/XPathUtil.java`
#### Snippet
```java
        final ImmutablePair<String, String> key = ImmutablePair.of(xPathQuery, namespaces);

        //check the cache
        XPathExecutable xPathExecutable;
        if(StringUtils.isNotEmpty(xPathQuery)) {
            xPathExecutable = XPATH_CACHE.get(key);
        }
        else {
            log.warn("Error : {}", JMeterUtils.getResString("xpath2_extractor_empty_query"));
            return;
        }
```

### DuplicatedCode
Duplicated code
in `src/functions/src/main/java/org/apache/jmeter/functions/Jexl2Function.java`
#### Snippet
```java
        String str = ""; //$NON-NLS-1$

        CompoundVariable var = (CompoundVariable) values[0];
        String exp = var.execute();

        String varName = ""; //$NON-NLS-1$
        if (values.length > 1) {
            varName = ((CompoundVariable) values[1]).execute().trim();
        }

        JMeterContext jmctx = JMeterContextService.getContext();
        JMeterVariables vars = jmctx.getVariables();
```

### DuplicatedCode
Duplicated code
in `src/functions/src/main/java/org/apache/jmeter/functions/Jexl2Function.java`
#### Snippet
```java
            JexlContext jc = new MapContext();
            jc.set("log", log); //$NON-NLS-1$
            jc.set("ctx", jmctx); //$NON-NLS-1$
            jc.set("vars", vars); //$NON-NLS-1$
            jc.set("props", JMeterUtils.getJMeterProperties()); //$NON-NLS-1$
            // Previously mis-spelt as theadName
            jc.set("threadName", Thread.currentThread().getName()); //$NON-NLS-1$
            jc.set("sampler", currentSampler); //$NON-NLS-1$ (may be null)
            jc.set("sampleResult", previousResult); //$NON-NLS-1$ (may be null)
            jc.set("OUT", System.out);//$NON-NLS-1$
```

### DuplicatedCode
Duplicated code
in `src/functions/src/main/java/org/apache/jmeter/functions/LogFunction.java`
#### Snippet
```java
        String stringToLog = ((CompoundVariable) values[0]).execute();

        String priorityString;
        if (values.length > 1) { // We have a default
            priorityString = ((CompoundVariable) values[1]).execute();
            if (priorityString.length() == 0) {
                priorityString = DEFAULT_PRIORITY;
            }
        } else {
            priorityString = DEFAULT_PRIORITY;
        }

        Throwable t = null;
```

### DuplicatedCode
Duplicated code
in `src/functions/src/main/java/org/apache/jmeter/functions/RandomString.java`
#### Snippet
```java
        if (myName.length() > 0) {
            JMeterVariables vars = getVariables();
            if (vars != null) {// Can be null if called from Config item testEnded() method
                vars.put(myName, myValue);
            }
        }

        if (log.isDebugEnabled()) {
            log.debug("{} name:{} value:{}", Thread.currentThread().getName(), myName, myValue); //$NON-NLS-1$
        }

        return myValue;
```

### DuplicatedCode
Duplicated code
in `src/functions/src/main/java/org/apache/jmeter/functions/RegexFunction.java`
#### Snippet
```java
            boolean first = true;
            while (it.hasNext()) {
                if (!first) {
                    value.append(between);
                } else {
                    first = false;
                }
                value.append(generateResult(it.next(), name, tmplt, vars));
            }
            return value.toString();
```

### DuplicatedCode
Duplicated code
in `src/functions/src/main/java/org/apache/jmeter/functions/RegexFunction.java`
#### Snippet
```java
        saveGroups(match, namep, vars);
        StringBuilder result = new StringBuilder();
        for (Object t : template) {
            if (t instanceof String) {
                result.append(t);
            } else {
                result.append(match.group((Integer) t));
            }
        }
        if (!namep.isEmpty()){
            vars.put(namep, result.toString());
        }
        return result.toString();
```

### DuplicatedCode
Duplicated code
in `src/protocol/ftp/src/main/java/org/apache/jmeter/protocol/ftp/config/gui/FtpConfigGui.java`
#### Snippet
```java
        server = new JTextField(10);
        label.setLabelFor(server);

        JPanel serverPanel = new JPanel(new BorderLayout(5, 0));
        serverPanel.add(label, BorderLayout.WEST);
        serverPanel.add(server, BorderLayout.CENTER);
        return serverPanel;
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java`
#### Snippet
```java
        config.setProperty(HTTPSamplerBase.PROXYSCHEME, proxyScheme.getText(),"");
        config.setProperty(HTTPSamplerBase.PROXYHOST, proxyHost.getText(),"");
        config.setProperty(HTTPSamplerBase.PROXYPORT, proxyPort.getText(),"");
        config.setProperty(HTTPSamplerBase.PROXYUSER, proxyUser.getText(),"");
        config.setProperty(HTTPSamplerBase.PROXYPASS, String.valueOf(proxyPass.getPassword()),"");
        config.setProperty(HTTPSamplerBase.IMPLEMENTATION, httpImplementation.getSelectedItem().toString(),"");
        config.setProperty(HTTPSamplerBase.CONNECT_TIMEOUT, connectTimeOut.getText());
        config.setProperty(HTTPSamplerBase.RESPONSE_TIMEOUT, responseTimeOut.getText());
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java`
#### Snippet
```java
        super.clearGui();
        retrieveEmbeddedResources.setSelected(false);
        concurrentDwn.setSelected(false);
        concurrentPool.setText(String.valueOf(HTTPSamplerBase.CONCURRENT_POOL_SIZE));
        enableConcurrentDwn(false);
        useMD5.setSelected(false);
        urlConfigGui.clear();
        embeddedAllowRE.setText(""); // $NON-NLS-1$
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java`
#### Snippet
```java
        sourceIpAddr.setText(""); // $NON-NLS-1$
        sourceIpType.setSelectedIndex(HTTPSamplerBase.SourceType.HOSTNAME.ordinal()); //default: IP/Hostname
        proxyScheme.setText(""); // $NON-NLS-1$
        proxyHost.setText(""); // $NON-NLS-1$
        proxyPort.setText(""); // $NON-NLS-1$
        proxyUser.setText(""); // $NON-NLS-1$
        proxyPass.setText(""); // $NON-NLS-1$
        httpImplementation.setSelectedItem(""); // $NON-NLS-1$
        connectTimeOut.setText(""); // $NON-NLS-1$
        responseTimeOut.setText(""); // $NON-NLS-1$
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java`
#### Snippet
```java
        proxyScheme.setText(samplerBase.getPropertyAsString(HTTPSamplerBase.PROXYSCHEME));
        proxyHost.setText(samplerBase.getPropertyAsString(HTTPSamplerBase.PROXYHOST));
        proxyPort.setText(samplerBase.getPropertyAsString(HTTPSamplerBase.PROXYPORT));
        proxyUser.setText(samplerBase.getPropertyAsString(HTTPSamplerBase.PROXYUSER));
        proxyPass.setText(samplerBase.getPropertyAsString(HTTPSamplerBase.PROXYPASS));
        httpImplementation.setSelectedItem(samplerBase.getPropertyAsString(HTTPSamplerBase.IMPLEMENTATION));
        connectTimeOut.setText(samplerBase.getPropertyAsString(HTTPSamplerBase.CONNECT_TIMEOUT));
        responseTimeOut.setText(samplerBase.getPropertyAsString(HTTPSamplerBase.RESPONSE_TIMEOUT));
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java`
#### Snippet
```java
        JPanel timeOut = new HorizontalPanel();
        timeOut.setBorder(BorderFactory.createTitledBorder(
                JMeterUtils.getResString("web_server_timeout_title"))); // $NON-NLS-1$
        final JPanel connPanel = getConnectTimeOutPanel();
        final JPanel reqPanel = getResponseTimeOutPanel();
        timeOut.add(connPanel);
        timeOut.add(reqPanel);
        return timeOut;
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java`
#### Snippet
```java
        connectTimeOut = new JTextField(10);

        JLabel label = new JLabel(JMeterUtils.getResString("web_server_timeout_connect")); // $NON-NLS-1$
        label.setLabelFor(connectTimeOut);

        JPanel panel = new JPanel(new BorderLayout(5, 0));
        panel.add(label, BorderLayout.WEST);
        panel.add(connectTimeOut, BorderLayout.CENTER);

        return panel;
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java`
#### Snippet
```java
        responseTimeOut = new JTextField(10);

        JLabel label = new JLabel(JMeterUtils.getResString("web_server_timeout_response")); // $NON-NLS-1$
        label.setLabelFor(responseTimeOut);

        JPanel panel = new JPanel(new BorderLayout(5, 0));
        panel.add(label, BorderLayout.WEST);
        panel.add(responseTimeOut, BorderLayout.CENTER);

        return panel;
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java`
#### Snippet
```java
retrieveEmbeddedResources = new JCheckBox(JMeterUtils.getResString("web_testing_retrieve_images")); // $NON-NLS-1$
        // add a listener to activate or not concurrent dwn.
        retrieveEmbeddedResources.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) { enableConcurrentDwn(true); }
            else { enableConcurrentDwn(false); }
        });
        // Download concurrent resources
        concurrentDwn = new JCheckBox(JMeterUtils.getResString("web_testing_concurrent_download")); // $NON-NLS-1$
        concurrentDwn.addItemListener(e -> {
            if (retrieveEmbeddedResources.isSelected() && e.getStateChange() == ItemEvent.SELECTED) { concurrentPool.setEnabled(true); }
            else { concurrentPool.setEnabled(false); }
        });
        concurrentPool = new JTextField(2); // 2 columns size
        concurrentPool.setMinimumSize(new Dimension(10, (int) concurrentPool.getPreferredSize().getHeight()));
        concurrentPool.setMaximumSize(new Dimension(60, (int) concurrentPool.getPreferredSize().getHeight()));

        final JPanel embeddedRsrcPanel = new JPanel(new MigLayout());
        embeddedRsrcPanel.setBorder(BorderFactory.createTitledBorder(
                JMeterUtils.getResString("web_testing_retrieve_title"))); // $NON-NLS-1$
        embeddedRsrcPanel.add(retrieveEmbeddedResources);
        embeddedRsrcPanel.add(concurrentDwn);
        embeddedRsrcPanel.add(concurrentPool, "wrap");

        // Embedded URL match regex to allow
        embeddedAllowRE = addTextFieldWithLabel(embeddedRsrcPanel, JMeterUtils.getResString("web_testing_embedded_url_pattern")); // $NON-NLS-1$

        // Embedded URL match regex to exclude
        embeddedExcludeRE = addTextFieldWithLabel(embeddedRsrcPanel, JMeterUtils.getResString("web_testing_embedded_url_exclude_pattern")); // $NON-NLS-1$

        return embeddedRsrcPanel;
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java`
#### Snippet
```java
        final JPanel sourceAddrPanel = new HorizontalPanel();
        sourceAddrPanel.setBorder(BorderFactory.createTitledBorder(
                JMeterUtils.getResString("web_testing_source_ip"))); // $NON-NLS-1$

        sourceIpType.setSelectedIndex(HTTPSamplerBase.SourceType.HOSTNAME.ordinal()); //default: IP/Hostname
        sourceAddrPanel.add(sourceIpType);

        sourceIpAddr = new JTextField();
        sourceAddrPanel.add(sourceIpAddr);
        return sourceAddrPanel;
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java`
#### Snippet
```java
        JPanel proxyServer = new HorizontalPanel();
        proxyServer.add(getProxySchemePanel(), BorderLayout.WEST);
        proxyServer.add(getProxyHostPanel(), BorderLayout.CENTER);
        proxyServer.add(getProxyPortPanel(), BorderLayout.EAST);

        JPanel proxyLogin = new HorizontalPanel();
        proxyLogin.add(getProxyUserPanel());
        proxyLogin.add(getProxyPassPanel());

        JPanel proxyServerPanel = new HorizontalPanel();
        proxyServerPanel.setBorder(BorderFactory.createTitledBorder(
                JMeterUtils.getResString("web_proxy_server_title"))); // $NON-NLS-1$
        proxyServerPanel.add(proxyServer);
        proxyServerPanel.add(proxyLogin);

        return proxyServerPanel;
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java`
#### Snippet
```java
        proxyScheme = new JTextField(5);

        JLabel label = new JLabel(JMeterUtils.getResString("web_proxy_scheme")); // $NON-NLS-1$
        label.setLabelFor(proxyScheme);
        JFactory.small(label);

        JPanel panel = new JPanel(new BorderLayout(5, 0));
        panel.add(label, BorderLayout.WEST);
        panel.add(proxyScheme, BorderLayout.CENTER);
        return panel;
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java`
#### Snippet
```java
        proxyHost = new JTextField(10);

        JLabel label = new JLabel(JMeterUtils.getResString("web_server_domain")); // $NON-NLS-1$
        label.setLabelFor(proxyHost);
        JFactory.small(label);

        JPanel panel = new JPanel(new BorderLayout(5, 0));
        panel.add(label, BorderLayout.WEST);
        panel.add(proxyHost, BorderLayout.CENTER);
        return panel;
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java`
#### Snippet
```java
        proxyPort = new JTextField(10);

        JLabel label = new JLabel(JMeterUtils.getResString("web_server_port")); // $NON-NLS-1$
        label.setLabelFor(proxyPort);
        JFactory.small(label);

        JPanel panel = new JPanel(new BorderLayout(5, 0));
        panel.add(label, BorderLayout.WEST);
        panel.add(proxyPort, BorderLayout.CENTER);

        return panel;
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java`
#### Snippet
```java
        proxyUser = new JTextField(5);

        JLabel label = new JLabel(JMeterUtils.getResString("username")); // $NON-NLS-1$
        label.setLabelFor(proxyUser);
        JFactory.small(label);

        JPanel panel = new JPanel(new BorderLayout(5, 0));
        panel.add(label, BorderLayout.WEST);
        panel.add(proxyUser, BorderLayout.CENTER);
        return panel;
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java`
#### Snippet
```java
        proxyPass = new JPasswordField(5);

        JLabel label = new JLabel(JMeterUtils.getResString("password")); // $NON-NLS-1$
        label.setLabelFor(proxyPass);
        JFactory.small(label);

        JPanel panel = new JPanel(new BorderLayout(5, 0));
        panel.add(label, BorderLayout.WEST);
        panel.add(proxyPass, BorderLayout.CENTER);
        return panel;
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/DelegatingKerberosScheme.java`
#### Snippet
```java
        final GSSManager manager = getManager();
        final GSSName serverName = manager.createName("HTTP@" + authServer, GSSName.NT_HOSTBASED_SERVICE);

        final GSSCredential gssCredential;
        if (credentials instanceof KerberosCredentials) {
            gssCredential = ((KerberosCredentials) credentials).getGSSCredential();
        } else {
            gssCredential = null;
        }

        final GSSContext gssContext = createDelegatingGSSContext(manager, oid, serverName, gssCredential);
        try {
            if (input != null) {
                return gssContext.initSecContext(input, 0, input.length);
            } else {
                return gssContext.initSecContext(new byte[] {}, 0, 0);
            }
        } finally {
            gssContext.dispose();
        }
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/AuthPanel.java`
#### Snippet
```java
            for (int i = rowsSelected.length - 1; i >= 0; i--) {
                tableModel.removeRow(rowsSelected[i]);
            }
            tableModel.fireTableDataChanged();

            // Table still contains one or more rows, so highlight (select)
            // the appropriate one.
            if (tableModel.getRowCount() > 0) {
                if (anchorSelection >= tableModel.getRowCount()) {
                    anchorSelection = tableModel.getRowCount() - 1;
                }
                authTable.setRowSelectionInterval(anchorSelection, anchorSelection);
            }

            checkButtonsStatus();
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/AuthPanel.java`
#### Snippet
```java
        boolean tableEmpty = tableModel.getRowCount() == 0;

        addButton = createButton("add", 'A', ADD_COMMAND, true); //$NON-NLS-1$
        deleteButton = createButton("delete", 'D', DELETE_COMMAND, !tableEmpty); //$NON-NLS-1$
        loadButton = createButton("load", 'L', LOAD_COMMAND, true); //$NON-NLS-1$
        saveButton = createButton("save", 'S', SAVE_COMMAND, !tableEmpty); //$NON-NLS-1$

        // Button Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(loadButton);
        buttonPanel.add(saveButton);
        return buttonPanel;
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/DNSCachePanel.java`
#### Snippet
```java
        GuiUtils.stopTableEditing(table);

        model.addNewRow();
        model.fireTableDataChanged();

        if (!button.isEnabled()) {
            button.setEnabled(true);
        }

        // Highlight (select) the appropriate row.
        int rowToSelect = model.getRowCount() - 1;
        table.setRowSelectionInterval(rowToSelect, rowToSelect);
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/JsoupBasedHtmlParser.java`
#### Snippet
```java
                if (StringUtils.isNotBlank(codebase)) {
                    String result;
                    if (StringUtils.isNotBlank(archive)) {
                        result = codebase.toString() + "/" + archive;
                    } else {
                        result = codebase.toString() + "/" + code;
                    }
                    urls.addURL(normalizeUrlValue(result), baseUrl.url);
                } else {
                    extractAttribute(tag, ATT_CODE);
                }
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/RegexpHTMLParser.java`
#### Snippet
```java
                    s = match.group(g);
                    if (s != null) {
                        log.debug("new baseUrl: {} - {}", s, baseUrl);
                        try {
                            baseUrl = ConversionUtils.makeRelativeURL(baseUrl, s);
                        } catch (MalformedURLException e) {
                            // Doesn't even look like a URL?
                            // Maybe it isn't: Ignore the exception.
                            log.debug("Can't build base URL from URL {} in page {}", s, baseUrl, e);
                        }
                    }
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/HttpRequestHdr.java`
#### Snippet
```java
        String str = url;
        int i = str.indexOf("//"); // $NON-NLS-1$
        if (i > 0) {
            str = str.substring(i + 2);
        }
        // chop to server.name:xx
        i = str.indexOf('/'); // $NON-NLS-1$
        if (0 < i) {
            str = str.substring(0, i);
        }
        // chop to server.name
        i = str.lastIndexOf(':'); // $NON-NLS-1$
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/HttpRequestHdr.java`
#### Snippet
```java
        String fullUrl = url.toString();
        String urlWithoutQuery = fullUrl;
        String query = url.getQuery();
        if(query != null) {
            // Get rid of the query and the ?
            urlWithoutQuery = urlWithoutQuery.substring(0, urlWithoutQuery.length() - query.length() - 1);
        }
        return urlWithoutQuery;
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java`
#### Snippet
```java
            try {
                Long.parseLong(proxyPauseHTTPSample.getText());
            } catch (NumberFormatException nfe) {
                int length = proxyPauseHTTPSample.getText().length();
                if (length > 0) {
                    JOptionPane.showMessageDialog(this, JMeterUtils.getResString("proxy_settings_pause_error_digits"), // $NON-NLS-1$
                            JMeterUtils.getResString("proxy_settings_pause_error_invalid_data"), // $NON-NLS-1$
                            JOptionPane.WARNING_MESSAGE);
                    // Drop the last character:
                    proxyPauseHTTPSample.setText(proxyPauseHTTPSample.getText().substring(0, length - 1));
                }
            }
            model.setProxyPauseHTTPSample(proxyPauseHTTPSample.getText());
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java`
#### Snippet
```java
        DefaultComboBoxModel<String> choice = new DefaultComboBoxModel<>();
        choice.addElement(JMeterUtils.getResString("sample_name_prefix")); // $NON-NLS-1$
        choice.addElement(JMeterUtils.getResString("sample_name_transaction")); // $NON-NLS-1$
        choice.addElement(JMeterUtils.getResString("sample_name_suffix")); // $NON-NLS-1$
        choice.addElement(JMeterUtils.getResString("sample_name_formatter")); // $NON-NLS-1$
        httpSampleNamingMode = new JComboBox<>(choice);
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java`
#### Snippet
```java
        labelDefaultEncoding.setLabelFor(defaultEncoding);

        JPanel panel = new JPanel(new MigLayout("fillx, wrap 3"));
        panel.setBorder(BorderFactory.createTitledBorder(
                JMeterUtils.getResString("proxy_sampler_settings"))); // $NON-NLS-1$
        JLabel labelSampleTransactionName = new JLabel(JMeterUtils.getResString("sample_name_transaction"));
        labelSampleTransactionName.setLabelFor(prefixHTTPSampleName);
        panel.add(labelSampleTransactionName);
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java`
#### Snippet
```java
        JLabel labelSetCounter = new JLabel(JMeterUtils.getResString("sample_creator_counter_value"));
        JTextField counterValue = new JTextField(10);
        labelSetCounter.setLabelFor(counterValue);
        JButton buttonSetCounter = new JButton(JMeterUtils.getResString("sample_creator_set_counter"));
        buttonSetCounter.addActionListener(e -> Proxy.setCounter(Integer.parseInt(counterValue.getText())));
        panel.add(labelSetCounter);
        panel.add(counterValue);
        panel.add(buttonSetCounter);

        panel.add(labelProxyPause);
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java`
#### Snippet
```java
        includeModel = new PowerTableModel(new String[] { INCLUDE_COL }, new Class[] { String.class });
        includeTable = new JTable(includeModel);
        JMeterUtils.applyHiDPI(includeTable);
        includeTable.getTableHeader().setDefaultRenderer(new HeaderAsPropertyRenderer());
        includeTable.setPreferredScrollableViewportSize(new Dimension(80, 80));

        JPanel panel = new JPanel(new BorderLayout());
```

### DuplicatedCode
Duplicated code
in `src/protocol/jdbc/src/main/java/org/apache/jmeter/protocol/jdbc/AbstractJDBCTestElement.java`
#### Snippet
```java
            JMeterVariables jmvars = getThreadContext().getVariables();
                for(int i = 0; i < varnames.length && i < outputValues.size(); i++) {
                    String name = varnames[i].trim();
                    if (name.length()>0){ // Save the value in the variable if present
                        Object o = outputValues.get(i);
                        if( o instanceof java.sql.ResultSet ) {
                            putIntoVar(jmvars, name, (java.sql.ResultSet) o);
                        } else if (o instanceof java.sql.Clob) {
                            putIntoVar(jmvars, name, (java.sql.Clob) o);
                        } else if (o instanceof java.sql.Blob) {
                            putIntoVar(jmvars, name, (java.sql.Blob) o);
                        }
                        else {
                            jmvars.put(name, o == null ? null : o.toString());
                        }
                    }
                }
```

### DuplicatedCode
Duplicated code
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/Base64Encoder.java`
#### Snippet
```java
        out.append(String.valueOf(pem_array[b3 >>> 2 & 63]));
        out.append(String.valueOf(pem_array[(b3 << 4 & 48) + (b5 >>> 4 & 15)]));
        out.append(String.valueOf(pem_array[(b5 << 2 & 60) + (b6 >>> 6 & 3)]));
```

### DuplicatedCode
Duplicated code
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/control/gui/JMSPublisherGui.java`
#### Snippet
```java
        mainPanel.add(useProperties, "span");

        mainPanel.add(JMeterUtils.labelFor(jndiICF, "jms_initial_context_factory"));
        mainPanel.add(jndiICF, "span, growx");

        mainPanel.add(JMeterUtils.labelFor(urlField, "jms_provider_url"));
        mainPanel.add(urlField, "span, growx");

        mainPanel.add(useAuth);
        mainPanel.add(jmsUser);
        mainPanel.add(jmsPwd);

        mainPanel.add(JMeterUtils.labelFor(jndiConnFac, "jms_connection_factory"));
        mainPanel.add(jndiConnFac, "span, growx");

        mainPanel.add(JMeterUtils.labelFor(jmsDestination, "jms_topic"));
        mainPanel.add(jmsDestination);
        mainPanel.add(destSetup);
```

### DuplicatedCode
Duplicated code
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/control/gui/JMSPublisherGui.java`
#### Snippet
```java
        super.clearGui();
        useProperties.setSelected(false);
        jndiICF.setText(""); // $NON-NLS-1$
        urlField.setText(""); // $NON-NLS-1$
        jndiConnFac.setText(""); // $NON-NLS-1$
        jmsDestination.setText(""); // $NON-NLS-1$
        expiration.setText(""); // $NON-NLS-1$
        jmsErrorReconnectOnCodes.setText("");
        priority.setText(""); // $NON-NLS-1$
        jmsUser.setText(""); // $NON-NLS-1$
        jmsPwd.setText(""); // $NON-NLS-1$
```

### DuplicatedCode
Duplicated code
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/control/gui/JMSPublisherGui.java`
#### Snippet
```java
        } else if (event.getSource() == useProperties) {
            final boolean isUseProperties = useProperties.isSelected();
            jndiICF.setEnabled(!isUseProperties);
            urlField.setEnabled(!isUseProperties);
            useAuth.setEnabled(!isUseProperties);
        } else if (event.getSource() == useAuth) {
            jmsUser.setEnabled(useAuth.isSelected() && useAuth.isEnabled());
            jmsPwd.setEnabled(useAuth.isSelected()  && useAuth.isEnabled());
        }
```

### DuplicatedCode
Duplicated code
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/JMSSampler.java`
#### Snippet
```java
                if (msg instanceof TextMessage) {
                    buffer.append(((TextMessage) msg).getText());
                } else if (msg instanceof ObjectMessage) {
                    ObjectMessage objectMessage = (ObjectMessage) msg;
                    if (objectMessage.getObject() != null) {
                        buffer.append(objectMessage.getObject().getClass());
                    } else {
                        buffer.append("object is null");
                    }
                } else if (msg instanceof BytesMessage) {
                    BytesMessage bytesMessage = (BytesMessage) msg;
                    buffer.append(bytesMessage.getBodyLength() + " bytes received in BytesMessage");
                } else if (msg instanceof MapMessage) {
                    MapMessage mapm = (MapMessage) msg;
                    @SuppressWarnings("unchecked") // MapNames are Strings
                    Enumeration<String> enumb = mapm.getMapNames();
                    while (enumb.hasMoreElements()) {
                        String name = enumb.nextElement();
                        Object obj = mapm.getObject(name);
                        buffer.append(name);
                        buffer.append(",");
                        buffer.append(obj.getClass().getCanonicalName());
                        buffer.append(",");
                        buffer.append(obj);
                        buffer.append("\n");
                    }
                }
                Utils.messageProperties(propBuffer, msg);
```

### DuplicatedCode
Duplicated code
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/JMSSampler.java`
#### Snippet
```java
        Object o = getProperty(JMS_PROPERTIES).getObjectValue();
        JMSProperties jmsProperties = null;
        // Backward compatibility with versions <= 2.10
        if (o instanceof Arguments) {
            jmsProperties = Utils.convertArgumentsToJmsProperties((Arguments) o);
        } else {
            jmsProperties = (JMSProperties) o;
        }
        if (jmsProperties == null) {
            jmsProperties = new JMSProperties();
            setJMSProperties(jmsProperties);
        }
        return jmsProperties;
```

### DuplicatedCode
Duplicated code
in `src/protocol/ldap/src/main/java/org/apache/jmeter/protocol/ldap/config/gui/LdapConfigGui.java`
#### Snippet
```java
        super.clearGui();

        rootdn.setText(""); //$NON-NLS-1$
        searchbase.setText(""); //$NON-NLS-1$
        searchfilter.setText(""); //$NON-NLS-1$
        delete.setText(""); //$NON-NLS-1$
        add.setText(""); //$NON-NLS-1$
        modify.setText(""); //$NON-NLS-1$
        servername.setText(""); //$NON-NLS-1$
        port.setText(""); //$NON-NLS-1$
```

### DuplicatedCode
Duplicated code
in `src/protocol/ldap/src/main/java/org/apache/jmeter/protocol/ldap/config/gui/LdapConfigGui.java`
#### Snippet
```java
        JPanel addInnerPanel = new JPanel(new BorderLayout(5, 0));
        JLabel label = new JLabel(JMeterUtils.getResString(key)); // $NON-NLS-1$
        label.setLabelFor(field);
        addInnerPanel.add(label, BorderLayout.WEST);
        addInnerPanel.add(field, BorderLayout.CENTER);
        return addInnerPanel;
```

### DuplicatedCode
Duplicated code
in `src/protocol/ldap/src/main/java/org/apache/jmeter/protocol/ldap/config/gui/LdapConfigGui.java`
#### Snippet
```java
        JPanel rowPanel = new JPanel();

        rowPanel.add(addTest);
        bGroup.add(addTest);
        rowPanel.add(deleteTest);
        bGroup.add(deleteTest);
        rowPanel.add(searchTest);
        bGroup.add(searchTest);
        rowPanel.add(modifyTest);
        bGroup.add(modifyTest);
```

### DuplicatedCode
Duplicated code
in `src/protocol/ldap/src/main/java/org/apache/jmeter/protocol/ldap/config/gui/LdapConfigGui.java`
#### Snippet
```java
        mainPanel.add(createTestPanel());
        mainPanel.add(testPanel());
        add(mainPanel, BorderLayout.CENTER);

        userDefined.addItemListener(this);
        addTest.addItemListener(this);
        modifyTest.addItemListener(this);
        deleteTest.addItemListener(this);
        searchTest.addItemListener(this);
```

### DuplicatedCode
Duplicated code
in `src/protocol/ldap/src/main/java/org/apache/jmeter/protocol/ldap/config/gui/LdapExtConfigGui.java`
#### Snippet
```java
        countlim.setText(""); //$NON-NLS-1$
        timelim.setText(""); //$NON-NLS-1$
        attribs.setText(""); //$NON-NLS-1$
        userdn.setText(""); //$NON-NLS-1$
        userpw.setText(""); //$NON-NLS-1$
        comparedn.setText(""); //$NON-NLS-1$
        comparefilt.setText(""); //$NON-NLS-1$
        modddn.setText(""); //$NON-NLS-1$
        newdn.setText(""); //$NON-NLS-1$
        connto.setText(""); //$NON-NLS-1$
```

### DuplicatedCode
Duplicated code
in `src/protocol/mail/src/main/java/org/apache/jmeter/protocol/mail/sampler/MailReaderSampler.java`
#### Snippet
```java
        for (int j = 0; recips != null && j < recips.length; j++) {
            cdata.append(recips[j].toString());
            if (j < recips.length - 1) {
                cdata.append("; "); // $NON-NLS-1$
            }
        }
        cdata.append(NEW_LINE);
```

### DuplicatedCode
Duplicated code
in `src/protocol/mail/src/main/java/org/apache/jmeter/protocol/smtp/sampler/gui/SmtpPanel.java`
#### Snippet
```java
        JPanel panelMailServer = new JPanel(new BorderLayout(5, 0));
        panelMailServer.add(jlMailServer, BorderLayout.WEST);
        panelMailServer.add(tfMailServer, BorderLayout.CENTER);
        JPanel panelMailServerPort = new JPanel(new BorderLayout(5, 0));
        panelMailServerPort.add(jlMailServerPort, BorderLayout.WEST);
        panelMailServerPort.add(tfMailServerPort, BorderLayout.CENTER);
```

### DuplicatedCode
Duplicated code
in `src/protocol/mail/src/main/java/org/apache/jmeter/protocol/smtp/sampler/gui/SmtpPanel.java`
#### Snippet
```java
        panelMailSettings.add(jlAddressToCC, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        panelMailSettings.add(tfMailToCC, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        panelMailSettings.add(jlAddressToBCC, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
```

### DuplicatedCode
Duplicated code
in `src/protocol/tcp/src/main/java/org/apache/jmeter/protocol/tcp/sampler/BinaryTCPClientImpl.java`
#### Snippet
```java
            boolean first = true;
            while ((x = is.read(buffer)) > -1) {
                if (first) {
                    sampleResult.latencyEnd();
                    first = false;
                }
                w.write(buffer, 0, x);
                if (useEolByte && (buffer[x - 1] == eolByte)) {
                    break;
                }
            }
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/core/src/main/java/org/apache/jmeter/config/gui/SimpleConfigGui.java`
#### Snippet
```java
     */
    private JPanel createButtonPanel() {
        /** A button for adding new parameters to the table. */
        JButton add = new JButton(JMeterUtils.getResString("add")); //$NON-NLS-1$
        add.setActionCommand(ADD);
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/core/src/main/java/org/apache/jmeter/engine/StandardJMeterEngine.java`
#### Snippet
```java
            return; // no point continuing
        }
        /**
         * Notification of test listeners needs to happen after function
         * replacement, but before setting RunningVersion to true.
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/core/src/main/java/org/apache/jmeter/control/IfController.java`
#### Snippet
```java
                Scriptable scope = cx.initStandardObjects(null);
                Object cxResultObject = cx.evaluateString(scope, condition
                /** * conditionString ** */
                , "<cmd>", 1, null);
                result = computeResultFromString(condition, Context.toString(cxResultObject));
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/jorphan/src/main/java/org/apache/log/ContextMap.java`
#### Snippet
```java
    }

    /**
     * Retrieve keys of entries into context map.
     *
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/ConversionUtils.java`
#### Snippet
```java
        }

        /**
         * http://auth@host:port/path1/path2/path3/?query#anchor
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java`
#### Snippet
```java
        buttonPanel.add(deleteButton);

        /** A button for adding new excludes/includes to the table from the clipboard. */
        JButton addFromClipboard = new JButton(JMeterUtils.getResString("add_from_clipboard")); // $NON-NLS-1$
        addFromClipboard.setActionCommand(copyFromClipboard);
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java`
#### Snippet
```java

        if(addSuggestedExcludes != null) {
            /** A button for adding suggested excludes. */
            JButton addFromSuggestedExcludes = new JButton(JMeterUtils.getResString("add_from_suggested_excludes")); // $NON-NLS-1$
            addFromSuggestedExcludes.setActionCommand(addSuggestedExcludes);
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/protocol/java/src/main/java/org/apache/jmeter/protocol/java/sampler/JavaSampler.java`
#### Snippet
```java
    }

    /**
     * Retrieves reference to JavaSamplerClient.
     *
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/functions/src/main/java/org/apache/jmeter/functions/ThreadGroupName.java`
#### Snippet
```java

    @Override
    /**
     * Get current thread group using sampler's context
     */
```

## RuleId[id=ReassignedToPlainText]
### ReassignedToPlainText
This file was explicitly re-assigned to plain text
in `xdocs/extending/HTML_REPORT_README.TXT`
#### Snippet
```java
Summary
-------

I  - Default template directory content

```

## RuleId[id=LeakingThis]
### LeakingThis
Calling non-final function classpath in constructor
in `build-logic/batchtest/src/main/kotlin/org/apache/jmeter/buildtools/batchtest/BatchTest.kt`
#### Snippet
```java
        workingDir = File(project.rootDir, "bin")
        mainClass.set("org.apache.jmeter.NewDriver")
        classpath(jmeterJar)

        // This does not depend on the task configuration, so the properties are initialized early
```

### LeakingThis
Calling non-final function jvmArgs in constructor
in `build-logic/batchtest/src/main/kotlin/org/apache/jmeter/buildtools/batchtest/BatchTest.kt`
#### Snippet
```java
        // It enables to override the properties later (e.g. in the build script)
        maxHeapSize = "128m"
        jvmArgs("-Xss256k", "-XX:MaxMetaspaceSize=128m")
        systemProperty("java.rmi.server.hostname", InetAddress.getLocalHost().canonicalHostName)
        systemProperty("java.awt.headless", "true")
```

### LeakingThis
Calling non-final function systemProperty in constructor
in `build-logic/batchtest/src/main/kotlin/org/apache/jmeter/buildtools/batchtest/BatchTest.kt`
#### Snippet
```java
        maxHeapSize = "128m"
        jvmArgs("-Xss256k", "-XX:MaxMetaspaceSize=128m")
        systemProperty("java.rmi.server.hostname", InetAddress.getLocalHost().canonicalHostName)
        systemProperty("java.awt.headless", "true")
    }
```

### LeakingThis
Calling non-final function systemProperty in constructor
in `build-logic/batchtest/src/main/kotlin/org/apache/jmeter/buildtools/batchtest/BatchTest.kt`
#### Snippet
```java
        jvmArgs("-Xss256k", "-XX:MaxMetaspaceSize=128m")
        systemProperty("java.rmi.server.hostname", InetAddress.getLocalHost().canonicalHostName)
        systemProperty("java.awt.headless", "true")
    }

```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/core/src/main/java/org/apache/jmeter/gui/util/JLabeledRadioI18N.java`
#### Snippet
```java
        while (en.hasMoreElements()) {
            ButtonModel model = en.nextElement().getModel();
            if (model.getActionCommand().equals(resourceName)) {
                this.bGroup.setSelected(model, true);
            } else {
```

### TrivialIf
`if` statement can be simplified
in `src/core/src/main/java/org/apache/jmeter/gui/util/JMeterMenuBar.java`
#### Snippet
```java
            return false;
        }
        if (actionCommand != null && actionCommand.startsWith(ActionNames.LAF_PREFIX)){
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/core/src/main/java/org/apache/jmeter/gui/action/SelectTemplatesDialog.java`
#### Snippet
```java
                return true;
            }
            if (response == JOptionPane.CLOSED_OPTION || response == JOptionPane.CANCEL_OPTION) {
                return false; // Don't clear the plan
            }
```

### TrivialIf
`if` statement can be simplified
in `src/core/src/main/java/org/apache/jmeter/rmi/RMIServerSocketFactoryImpl.java`
#### Snippet
```java
        RMIServerSocketFactoryImpl other = (RMIServerSocketFactoryImpl) obj;
        if (localAddress == null) {
            if (other.localAddress != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/core/src/main/java/org/apache/jmeter/rmi/RMIServerSocketFactoryImpl.java`
#### Snippet
```java
                return false;
            }
        } else if (!localAddress.equals(other.localAddress)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/core/src/main/java/org/apache/jmeter/config/Argument.java`
#### Snippet
```java
        }
        // TODO: improve this test
        if (parameterName.trim().startsWith("${") && parameterName.endsWith("}")){// $NON-NLS-1$ $NON-NLS-2$
            return true; // Missing variable name
        }
```

### TrivialIf
`if` statement can be simplified
in `src/core/src/main/java/org/apache/jmeter/config/gui/SimpleConfigGui.java`
#### Snippet
```java
    protected void checkDeleteStatus() {
        // Disable DELETE if there are no rows in the table to delete.
        if (tableModel.getRowCount() == 0) {
            delete.setEnabled(false);
        } else {
```

### TrivialIf
`if` statement can be simplified
in `src/core/src/main/java/org/apache/jmeter/threads/UnmodifiableJMeterVariables.java`
#### Snippet
```java
        UnmodifiableJMeterVariables other = (UnmodifiableJMeterVariables) obj;
        if (variables == null) {
            if (other.variables != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/core/src/main/java/org/apache/jmeter/threads/UnmodifiableJMeterVariables.java`
#### Snippet
```java
                return false;
            }
        } else if (!variables.equals(other.variables)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/core/src/main/java/org/apache/jmeter/testbeans/gui/GenericTestBeanCustomizer.java`
#### Snippet
```java

            boolean multiLineEditor = false;
            if (customEditor.getPreferredSize().height > 50 || customEditor instanceof JScrollPane
                    || descriptors[i].getValue(MULTILINE) != null) {
                // TODO: the above works in the current situation, but it's
```

### TrivialIf
`if` statement can be simplified
in `src/protocol/tcp/src/main/java/org/apache/jmeter/protocol/tcp/config/gui/TCPConfigGui.java`
#### Snippet
```java
        reUseConnection = new JCheckBox("", true);
        reUseConnection.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                closeConnection.setEnabled(true);
            } else {
```

### TrivialIf
`if` statement can be simplified
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/DNSCachePanel.java`
#### Snippet
```java
            }
            dnsCacheManager.setClearEachIteration(clearEachIteration.isSelected());
            if (providerDNSradioGroup.isSelected(custResButton.getModel())) {
                dnsCacheManager.setCustomResolver(true);
            } else {
```

### TrivialIf
`if` statement can be simplified
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/action/ParseCurlCommandAction.java`
#### Snippet
```java
            String address = resolveParameters[2];
            StaticHost statichost = (StaticHost) dnsCacheManager.getHosts().get(0).getObjectValue();
            if (statichost.getAddress().equals(address) && statichost.getName().equals(host)) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java`
#### Snippet
```java
        // add a listener to activate or not concurrent dwn.
        retrieveEmbeddedResources.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) { enableConcurrentDwn(true); }
            else { enableConcurrentDwn(false); }
        });
```

### TrivialIf
`if` statement can be simplified
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java`
#### Snippet
```java
        concurrentDwn = new JCheckBox(JMeterUtils.getResString("web_testing_concurrent_download")); // $NON-NLS-1$
        concurrentDwn.addItemListener(e -> {
            if (retrieveEmbeddedResources.isSelected() && e.getStateChange() == ItemEvent.SELECTED) { concurrentPool.setEnabled(true); }
            else { concurrentPool.setEnabled(false); }
        });
```

### TrivialIf
`if` statement can be simplified
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/ProxyControl.java`
#### Snippet
```java

        CollectionProperty excludePatterns = getExcludePatterns();
        if (!excludePatterns.isEmpty() && matchesPatterns(url, excludePatterns)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/ProxyControl.java`
#### Snippet
```java
        // Check if the exclude pattern is matched
        matched = testPattern(excludeExp, sampleContentType, false);
        if(!matched) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/gui/HttpTestSampleGui.java`
#### Snippet
```java
        // add a listener to activate or not concurrent dwn.
        retrieveEmbeddedResources.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) { enableConcurrentDwn(true); }
            else { enableConcurrentDwn(false); }
        });
```

### TrivialIf
`if` statement can be simplified
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/gui/HttpTestSampleGui.java`
#### Snippet
```java
        concurrentDwn = new JCheckBox(JMeterUtils.getResString("web_testing_concurrent_download")); // $NON-NLS-1$
        concurrentDwn.addItemListener(e -> {
            if (retrieveEmbeddedResources.isSelected() && e.getStateChange() == ItemEvent.SELECTED) { concurrentPool.setEnabled(true); }
            else { concurrentPool.setEnabled(false); }
        });
```

### TrivialIf
`if` statement can be simplified
in `src/protocol/ldap/src/main/java/org/apache/jmeter/protocol/ldap/config/gui/LDAPArgumentsPanel.java`
#### Snippet
```java
    private void checkDeleteStatus() {
        // Disable DELETE if there are no rows in the table to delete.
        if (tableModel.getRowCount() == 0) {
            delete.setEnabled(false);
        } else {
```

### TrivialIf
`if` statement can be simplified
in `src/components/src/main/java/org/apache/jmeter/control/gui/RandomControlGui.java`
#### Snippet
```java
    public void configure(TestElement el) {
        super.configure(el);
        if (((RandomController) el).getStyle() == InterleaveControl.IGNORE_SUB_CONTROLLERS) {
            style.setSelected(true);
        } else {
```

### TrivialIf
`if` statement can be simplified
in `src/components/src/main/java/org/apache/jmeter/control/gui/InterleaveControlGui.java`
#### Snippet
```java
        super.configure(el);
        InterleaveControl controller = (InterleaveControl) el;
        if (controller.getStyle() == InterleaveControl.IGNORE_SUB_CONTROLLERS) {
            style.setSelected(true);
        } else {
```

### TrivialIf
`if` statement can be simplified
in `src/components/src/main/java/org/apache/jmeter/control/gui/ThroughputControllerGui.java`
#### Snippet
```java
        perthread = new JCheckBox(PERTHREAD_LABEL, isPerThread);
        perthread.addItemListener(evt -> {
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                isPerThread = true;
            } else {
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
    private static void updatePath(String property, String sep, boolean cp) throws MalformedURLException {
        String userpath= JMeterUtils.getPropDefault(property,"");// $NON-NLS-1$
        if (userpath.length() <= 0) {
            return;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/functions/src/main/java/org/apache/jmeter/functions/FileToString.java`
#### Snippet
```java
        if (values.length >= ENCODING) {
            encoding = ((CompoundVariable) values[ENCODING - 1]).execute().trim();
            if (encoding.length() <= 0) { // empty encoding, return to platform default
                encoding = null;
            }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/functions/src/main/java/org/apache/jmeter/functions/RandomString.java`
#### Snippet
```java
        if (values.length >= CHARS) {
            charsToUse = values[CHARS - 1].execute().trim();
            if (charsToUse.length() <= 0) { // empty chars, return to null
                charsToUse = null;
            }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/components/src/main/java/org/apache/jmeter/extractor/HtmlExtractor.java`
#### Snippet
```java
        int matchSize = matches.size();

        if (matchSize <= 0 || entry > matchSize){
            return null;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/components/src/main/java/org/apache/jmeter/extractor/RegexExtractor.java`
#### Snippet
```java
        int matchSize = matches.size();

        if (matchSize <= 0 || entry > matchSize){
            return null;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/components/src/main/java/org/apache/jmeter/extractor/RegexExtractor.java`
#### Snippet
```java
        int matchSize = matches.size();

        if (matchSize <= 0 || entry > matchSize){
            return null;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java
        // Calculate the test duration. Needs to xAxis Labels and getData.
        durationTest = maxStartTime - minStartTime;
        if (seriesNames.size() <= 0) {
            msgErr = JMeterUtils.getResString("aggregate_graph_no_values_to_graph"); // $NON-NLS-1$
        } else   if (durationTest < 1) {
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'treeModel'
in `src/core/src/main/java/org/apache/jmeter/gui/tree/JMeterTreeNode.java`
#### Snippet
```java

    // See Bug 54648
    private final transient Optional<JMeterTreeModel> treeModel;

    private boolean markedBySearch;
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.US_ASCII can be used instead
in `src/launcher/src/main/java/org/apache/jmeter/util/ShutdownClient.java`
#### Snippet
```java
        System.out.println("Sending "+command+" request to port "+port);
        try (DatagramSocket socket = new DatagramSocket()) {
            byte[] buf = command.getBytes("ASCII");
            InetAddress address = InetAddress.getByName("localhost");
            DatagramPacket packet = new DatagramPacket(buf, buf.length, address,
```

### CharsetObjectCanBeUsed
StandardCharsets.ISO_8859_1 can be used instead
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/AjpSampler.java`
#### Snippet
```java
    private String getString() throws IOException {
        int len = getInt();
        String s = new String(inbuf, inpos, len, "iso-8859-1");//$NON-NLS-1$
        inpos+= len+1;
        return s;
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/components/src/main/java/org/apache/jmeter/visualizers/SummaryReport.java`
#### Snippet
```java
            }
            try (FileOutputStream fo = new FileOutputStream(chooser.getSelectedFile());
                    OutputStreamWriter writer = new OutputStreamWriter(fo, Charset.forName("UTF-8"))) {
                CSVSaveService.saveCSVStats(StatGraphVisualizer.getAllTableData(model, FORMATS),writer,
                        saveHeaders.isSelected() ? StatGraphVisualizer.getLabels(COLUMNS, COLUMNS_PARAMS) : null);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java
            }
            try (FileOutputStream fo = new FileOutputStream(chooser.getSelectedFile());
                    OutputStreamWriter writer = new OutputStreamWriter(fo, Charset.forName("UTF-8"))){
                CSVSaveService.saveCSVStats(getAllTableData(model, getFormatters()),
                        writer,
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Context' used without 'try'-with-resources statement
in `src/core/src/main/java/org/apache/jmeter/util/BSFJavaScriptEngine.java`
#### Snippet
```java

        try {
            cx = Context.enter();

            cx.setOptimizationLevel(-1);
```

### AutoCloseableResource
'CsvSampleWriter' used without 'try'-with-resources statement
in `src/core/src/main/java/org/apache/jmeter/report/processor/SampleWriterConsumer.java`
#### Snippet
```java
        csvWriters = new CsvSampleWriter[channelsCount];
        for (int i = 0; i < channelsCount; i++) {
            csvWriters[i] = new CsvSampleWriter(getOutputFile(i),getConsumedMetadata(i));
            if (shouldWriteHeader) {
                csvWriters[i].writeHeader();
```

### AutoCloseableResource
'CsvSampleReader' used without 'try'-with-resources statement
in `src/core/src/main/java/org/apache/jmeter/report/processor/CsvFileSampleSource.java`
#### Snippet
```java
        int k = 0;
        // primary input file (ex. input.csv)
        csvReaders[k] = new CsvSampleReader(inputFile, separator, true);
        inputFiles[k] = inputFile;
        // secondary input files (ex. input-1.csv, input-2.csv, input-3.csv)
```

### AutoCloseableResource
'CsvSampleReader' used without 'try'-with-resources statement
in `src/core/src/main/java/org/apache/jmeter/report/processor/CsvFileSampleSource.java`
#### Snippet
```java
        for (File input : secondaryInputs) {
            k++;
            csvReaders[k] = new CsvSampleReader(input, separator, true);
            inputFiles[k] = secondaryInputs[k - 1];
        }
```

### AutoCloseableResource
'Context' used without 'try'-with-resources statement
in `src/core/src/main/java/org/apache/jmeter/control/IfController.java`
#### Snippet
```java
            boolean result = false;
            // now evaluate the condition using JavaScript
            Context cx = Context.enter();
            try {
                Scriptable scope = cx.initStandardObjects(null);
```

### AutoCloseableResource
'Closeable' used without 'try'-with-resources statement
in `src/jorphan/src/main/java/org/apache/jorphan/gui/JMeterUIDefaults.java`
#### Snippet
```java
    @API(since = "5.3", status = API.Status.INTERNAL)
    public void install() {
        DynamicStyle.onLaFChange(() -> {
            // We put JMeter-specific properties into getLookAndFeelDefaults,
            // so the properties are removed when LaF is changed
```

### AutoCloseableResource
'Context' used without 'try'-with-resources statement
in `src/functions/src/main/java/org/apache/jmeter/functions/JavaScript.java`
#### Snippet
```java
            String script, String varName)
            throws InvalidVariableException {
        Context cx = Context.enter();
        String resultStr = null;
        try {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `null` to `String` is redundant
in `src/core/src/main/java/org/apache/jmeter/gui/util/FilePanel.java`
#### Snippet
```java

    public FilePanel(String title, boolean onlyDirectories) {
        this(title, (String) null, onlyDirectories);
    }

```

### RedundantCast
Casting `null` to `ChangeListener` is redundant
in `src/core/src/main/java/org/apache/jmeter/gui/util/FilePanelEntry.java`
#### Snippet
```java

    public FilePanelEntry(String label, boolean onlyDirectories, String ... exts) {
        this(label, onlyDirectories, (ChangeListener) null, exts);
    }

```

### RedundantCast
Casting `null` to `ChangeListener` is redundant
in `src/core/src/main/java/org/apache/jmeter/gui/util/FilePanelEntry.java`
#### Snippet
```java

    public FilePanelEntry(String label, String ... exts) {
        this(label, (ChangeListener) null, exts);
    }

```

### RedundantCast
Casting `comp` to `Component` is redundant
in `src/core/src/main/java/org/apache/jmeter/gui/action/AbstractAction.java`
#### Snippet
```java
                JPopupMenu popup = (JPopupMenu) comp;
                comp = popup.getInvoker();
                Window window = SwingUtilities.windowForComponent((Component) comp);
                if (window instanceof JFrame) {
                    parent = (JFrame) window;
```

### RedundantCast
Casting `item` to `SimpleVariable` is redundant
in `src/core/src/main/java/org/apache/jmeter/engine/util/CompoundVariable.java`
#### Snippet
```java
                }
            } else if (item instanceof SimpleVariable) {
                results.append(((SimpleVariable) item).toString());
            } else {
                results.append(item);
```

### RedundantCast
Casting `null` to `InputStream` is redundant
in `src/jorphan/src/main/java/org/apache/jorphan/exec/SystemCommand.java`
#### Snippet
```java
     */
    public SystemCommand(File directory, Map<String, String> env) {
        this(directory, 0L, 0, env, (InputStream) null, (OutputStream) null, (OutputStream) null);
    }

```

### RedundantCast
Casting `null` to `OutputStream` is redundant
in `src/jorphan/src/main/java/org/apache/jorphan/exec/SystemCommand.java`
#### Snippet
```java
     */
    public SystemCommand(File directory, Map<String, String> env) {
        this(directory, 0L, 0, env, (InputStream) null, (OutputStream) null, (OutputStream) null);
    }

```

### RedundantCast
Casting `bytes.length` to `long` is redundant
in `src/protocol/ftp/src/main/java/org/apache/jmeter/protocol/ftp/sampler/FTPSampler.java`
#### Snippet
```java
                            byte[] bytes = contents.getBytes(); // TODO - charset?
                            input = new ByteArrayInputStream(bytes);
                            res.setSentBytes((long)bytes.length);
                        } else {
                            File infile = new File(local);
```

### RedundantCast
Casting `oneWay` to `BooleanProperty` is redundant
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/control/gui/JMSSamplerGui.java`
#### Snippet
```java
        } else {
            jmsCommunicationStyle.setSelectedIndex(
                    ((BooleanProperty)oneWay).getBooleanValue() ?
                            JMSSampler.COMMUNICATION_STYLE.ONE_WAY.getValue()
                            : JMSSampler.COMMUNICATION_STYLE.REQUEST_REPLY.getValue());
```

### RedundantCast
Casting `key` to `LocaleFormatObject` is redundant
in `src/functions/src/main/java/org/apache/jmeter/functions/RandomDate.java`
#### Snippet
```java
            try {
                LocaleFormatObject lfo = new LocaleFormatObject(format, locale);
                formatter = dateRandomFormatterCache.get(lfo, key -> createFormatter((LocaleFormatObject) key));
            } catch (IllegalArgumentException ex) {
                log.error(
```

### RedundantCast
Casting `key` to `LocaleFormatObject` is redundant
in `src/functions/src/main/java/org/apache/jmeter/functions/RandomDate.java`
#### Snippet
```java
            try {
                LocaleFormatObject lfo = new LocaleFormatObject("yyyy-MM-dd", locale);
                formatter = dateRandomFormatterCache.get(lfo, key -> createFormatter((LocaleFormatObject) key));
            } catch (IllegalArgumentException ex) {
                log.error(
```

### RedundantCast
Casting `styleBox.getSelectedItem()` to `String` is redundant
in `src/components/src/main/java/org/apache/jmeter/control/gui/ThroughputControllerGui.java`
#### Snippet
```java
        styleBox = new JComboBox<>(styleModel);
        styleBox.addActionListener(evt -> {
            if (((String) styleBox.getSelectedItem()).equals(BYNUMBER_LABEL)) {
                style = ThroughputController.BYNUMBER;
            } else {
```

### RedundantCast
Casting `targetBox.getSelectedItem()` to `String` is redundant
in `src/components/src/main/java/org/apache/jmeter/sampler/gui/TestActionGui.java`
#### Snippet
```java
        targetBox = new JComboBox<>(targetModel);
        targetBox.addActionListener(evt -> {
            if (((String) targetBox.getSelectedItem()).equals(THREAD_TARGET_LABEL)) {
                target = TestAction.THREAD;
            } else {
```

### RedundantCast
Casting `result` to `ArrayNode` is redundant
in `src/components/src/main/java/org/apache/jmeter/extractor/json/render/RenderAsJmesPathRenderer.java`
#### Snippet
```java
                StringBuilder builder = new StringBuilder();
                int i = 0;
                for (JsonNode element : (ArrayNode) result) {
                    builder.append("Result[").append(i++).append("]=").append(writeJsonNode(OBJECT_MAPPER, element)).append("\n");
                }
```

### RedundantCast
Casting `jsonNode` to `ArrayNode` is redundant
in `src/components/src/main/java/org/apache/jmeter/extractor/json/jmespath/JMESPathExtractor.java`
#### Snippet
```java
        List<String> splittedJsonElements = new ArrayList<>();
        if (jsonNode.isArray()) {
            for (JsonNode element : (ArrayNode) jsonNode) {
                splittedJsonElements.add(writeJsonNode(OBJECT_MAPPER, element));
            }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param node` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/gui/tree/JMeterTreeModel.java`
#### Snippet
```java
     *  <li>Property Display</li>
     * </ul>
     * @param node
     */
    private static boolean isNonTestElement(Object node) {
```

### JavadocDeclaration
`@param jSyntaxTextArea` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/gui/util/JSyntaxTextArea.java`
#### Snippet
```java
    /**
     * Apply XML Theme to syntax text area
     * @param jSyntaxTextArea
     */
    private static void applyTheme(JSyntaxTextArea jSyntaxTextArea) {
```

### JavadocDeclaration
`@param remoteStop` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
         * Listener for remote test
         * @param runMode RunMode
         * @param remoteStop
         * @param reportGenerator {@link ReportGenerator}
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
     * @param parser {@link CLArgsParser}
     * @param deleteReportFolder true means delete report folder
     * @throws IllegalArgumentException
     */
    private static void extractAndSetReportOutputFolder(CLArgsParser parser, boolean deleteReportFolder) {
```

### JavadocDeclaration
`@param resource` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/gui/util/JMeterMenuBar.java`
#### Snippet
```java
     * Make a menu from a resource string and set its mnemonic.
     *
     * @param resource
     * @param mnemonic
     * @return the menu
```

### JavadocDeclaration
`@param mnemonic` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/gui/util/JMeterMenuBar.java`
#### Snippet
```java
     *
     * @param resource
     * @param mnemonic
     * @return the menu
     */
```

### JavadocDeclaration
`@param actionCommand` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/gui/util/JMeterMenuBar.java`
#### Snippet
```java
     * This is used for items such as recent files and hostnames which are not resources
     * @param label (this is not used as a resource key)
     * @param actionCommand
     * @return the menu item
     */
```

### JavadocDeclaration
`@param menuCreators` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/gui/util/JMeterMenuBar.java`
#### Snippet
```java
     *
     * @param menu the menu to mutate
     * @param menuCreators
     * @param location
     */
```

### JavadocDeclaration
`@param location` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/gui/util/JMeterMenuBar.java`
#### Snippet
```java
     * @param menu the menu to mutate
     * @param menuCreators
     * @param location
     */
    private static void addPluginsMenuItems(JMenu menu, List<MenuCreator> menuCreators, MENU_LOCATION location) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/gui/action/AddThinkTimeBetweenEachStep.java`
#### Snippet
```java
     * @param guiPackage {@link GuiPackage}
     * @param parentNode Parent node of elements on which we add think times
     * @throws IllegalUserActionException
     */
    private static void addThinkTimeToChildren(GuiPackage guiPackage,
```

### JavadocDeclaration
`@param wordToSearch` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/gui/action/SearchTreeDialog.java`
#### Snippet
```java

    /**
     * @param wordToSearch
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/gui/action/SearchTreeDialog.java`
#### Snippet
```java
    /**
     * @param wordToSearch
     * @return
     */
    private Searcher createSearcher(String wordToSearch) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/gui/action/Save.java`
#### Snippet
```java
     * @param fullSave Partial or full save
     * @param newFile File to save
     * @throws IllegalUserActionException
     */
    void backupAndSave(ActionEvent e, HashTree subTree, boolean fullSave, String newFile)
```

### JavadocDeclaration
`@param filename` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/save/SaveGraphicsService.java`
#### Snippet
```java
     * we shouldn't get a FNFE.
     *
     * @param filename
     * @return output stream created from the filename
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/save/SaveService.java`
#### Snippet
```java
    /**
     * Register converter.
     * @param key
     * @param jmxsaver
     * @param useMapper
```

### JavadocDeclaration
`@param jmxsaver` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/save/SaveService.java`
#### Snippet
```java
     * Register converter.
     * @param key
     * @param jmxsaver
     * @param useMapper
     *
```

### JavadocDeclaration
`@param useMapper` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/save/SaveService.java`
#### Snippet
```java
     * @param key
     * @param jmxsaver
     * @param useMapper
     *
     * @throws InstantiationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/save/SaveService.java`
#### Snippet
```java
     * @param useMapper
     *
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/save/SaveService.java`
#### Snippet
```java
     *
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/save/SaveService.java`
#### Snippet
```java
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     * @throws ClassNotFoundException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/save/SaveService.java`
#### Snippet
```java
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     * @throws ClassNotFoundException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/save/SaveService.java`
#### Snippet
```java
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     * @throws ClassNotFoundException
     */
    private static void registerConverter(String key, XStream jmxsaver, boolean useMapper)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/util/BSFJavaScriptEngine.java`
#### Snippet
```java
    /**
     * @param t {@link Throwable}
     * @throws BSFException
     */
    private static void handleError(Throwable t) throws BSFException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/save/CSVSaveService.java`
#### Snippet
```java
     * @return the sample result
     *
     * @throws JMeterError
     */
    @SuppressWarnings("JavaUtilDate")
```

### JavadocDeclaration
`@param standardJMeterEngine` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/engine/StandardJMeterEngine.java`
#### Snippet
```java
    /**
     * Set the shared engine
     * @param standardJMeterEngine
     */
    private static void initSingletonEngine(StandardJMeterEngine standardJMeterEngine) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/report/dashboard/JsonExporter.java`
#### Snippet
```java
     * @param reportGeneratorConfiguration {@link ReportGeneratorConfiguration}
     * @return {@link File} output folder
     * @throws ExportException
     */
    private File checkAndGetOutputFolder(ReportGeneratorConfiguration reportGeneratorConfiguration)
```

### JavadocDeclaration
`@param group` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/report/processor/graph/AbstractGraphConsumer.java`
#### Snippet
```java
     *
     * @param result     {@link MapResultData}
     * @param group
     * @param series
     * @param seriesData
```

### JavadocDeclaration
`@param series` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/report/processor/graph/AbstractGraphConsumer.java`
#### Snippet
```java
     * @param result     {@link MapResultData}
     * @param group
     * @param series
     * @param seriesData
     * @param aggregated
```

### JavadocDeclaration
`@param seriesData` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/report/processor/graph/AbstractGraphConsumer.java`
#### Snippet
```java
     * @param group
     * @param series
     * @param seriesData
     * @param aggregated
     */
```

### JavadocDeclaration
`@param aggregated` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/report/processor/graph/AbstractGraphConsumer.java`
#### Snippet
```java
     * @param series
     * @param seriesData
     * @param aggregated
     */
    private void addKeyData(MapResultData result, @SuppressWarnings("unused") String group,
```

### JavadocDeclaration
`@param condition` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/control/IfController.java`
#### Snippet
```java

    /**
     * @param condition
     * @param resultStr
     * @return boolean
```

### JavadocDeclaration
`@param resultStr` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/control/IfController.java`
#### Snippet
```java
    /**
     * @param condition
     * @param resultStr
     * @return boolean
     * @throws Exception
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/control/IfController.java`
#### Snippet
```java
     * @param resultStr
     * @return boolean
     * @throws Exception
     */
    private static boolean computeResultFromString(
```

### JavadocDeclaration
`@param controllers` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/threads/TestCompiler.java`
#### Snippet
```java

    /**
     * @param controllers
     * @param maybeController
     */
```

### JavadocDeclaration
`@param maybeController` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/threads/TestCompiler.java`
#### Snippet
```java
    /**
     * @param controllers
     * @param maybeController
     */
    private static void addDirectParentControllers(List<Controller> controllers, TestElement maybeController) {
```

### JavadocDeclaration
`@param threadContext` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/threads/JMeterThread.java`
#### Snippet
```java
     * Trigger break/continue/switch to next thread Loop  depending on consumer implementation
     * @param sampler Sampler Base sampler
     * @param threadContext
     * @param consumer Consumer that will process the tree of elements up to root node
     */
```

### JavadocDeclaration
`@param samplePack` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/threads/JMeterThread.java`
#### Snippet
```java
     * will not be in this list.
     *
     * @param samplePack
     * @param transactionPack
     * @param transactionSampler
```

### JavadocDeclaration
`@param transactionPack` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/threads/JMeterThread.java`
#### Snippet
```java
     *
     * @param samplePack
     * @param transactionPack
     * @param transactionSampler
     * @return the listeners who should receive the sample result
```

### JavadocDeclaration
`@param transactionSampler` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/threads/JMeterThread.java`
#### Snippet
```java
     * @param samplePack
     * @param transactionPack
     * @param transactionSampler
     * @return the listeners who should receive the sample result
     */
```

### JavadocDeclaration
`@param threadContext` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/threads/JMeterThread.java`
#### Snippet
```java
     * @param current sampler
     * @param parent sampler
     * @param threadContext
     * @return SampleResult if a transaction was processed
     */
```

### JavadocDeclaration
`@param threadContext` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/threads/JMeterThread.java`
#### Snippet
```java

    /**
     * @param threadContext
     * @return the iteration listener
     */
```

### JavadocDeclaration
`@param parentFile` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/reporters/ResultSaver.java`
#### Snippet
```java
    /**
     * Create path hierarchy to parentFile
     * @param parentFile
     */
    private static void createFoldersIfNeeded(File parentFile) {
```

### JavadocDeclaration
`@param text` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/testbeans/gui/WrapperEditor.java`
#### Snippet
```java
     * Same as isExpression(String).
     *
     * @param text
     * @return true if text is a String and isExpression(text).
     */
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/testbeans/gui/TestBeanGUI.java`
#### Snippet
```java

    /**
     * @param element
     * @param name
     */
```

### JavadocDeclaration
`@param name` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/testbeans/gui/TestBeanGUI.java`
#### Snippet
```java
    /**
     * @param element
     * @param name
     */
    private static void setPropertyInElement(TestElement element, String name, Object value) {
```

### JavadocDeclaration
`@param pd` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/testbeans/gui/GenericTestBeanCustomizer.java`
#### Snippet
```java
     * Identify the property from the descriptor.
     *
     * @param pd
     * @return the property details
     */
```

### JavadocDeclaration
`@param descriptor` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/testbeans/gui/GenericTestBeanCustomizer.java`
#### Snippet
```java
     * Obtain a property descriptor's group.
     *
     * @param descriptor
     * @return the group String.
     */
```

### JavadocDeclaration
`@param d` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/testbeans/gui/GenericTestBeanCustomizer.java`
#### Snippet
```java
         * Obtain a property's order.
         *
         * @param d
         * @return the property's order attribute (zero by default)
         */
```

### JavadocDeclaration
`@param typeEditor` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/testbeans/gui/GenericTestBeanCustomizer.java`
#### Snippet
```java
     * property descriptor, and combine them in a WrapperEditor.
     *
     * @param typeEditor
     * @param descriptor
     * @return the wrapper editor
```

### JavadocDeclaration
`@param descriptor` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/testbeans/gui/GenericTestBeanCustomizer.java`
#### Snippet
```java
     *
     * @param typeEditor
     * @param descriptor
     * @return the wrapper editor
     */
```

### JavadocDeclaration
`@param res` tag description is missing
in `src/core/src/main/java/org/apache/jmeter/visualizers/SamplingStatCalculator.java`
#### Snippet
```java

    /**
     * @param res
     */
    private void setStartTime(SampleResult res) {
```

### JavadocDeclaration
`@param initialContextFactory` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/client/InitialContextFactory.java`
#### Snippet
```java
     * Create cache key
     * @param threadId Thread Id
     * @param initialContextFactory
     * @param providerUrl
     * @param securityPrincipal
```

### JavadocDeclaration
`@param providerUrl` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/client/InitialContextFactory.java`
#### Snippet
```java
     * @param threadId Thread Id
     * @param initialContextFactory
     * @param providerUrl
     * @param securityPrincipal
     * @param securityCredentials
```

### JavadocDeclaration
`@param securityPrincipal` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/client/InitialContextFactory.java`
#### Snippet
```java
     * @param initialContextFactory
     * @param providerUrl
     * @param securityPrincipal
     * @param securityCredentials
     * @return the cache key
```

### JavadocDeclaration
`@param securityCredentials` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/client/InitialContextFactory.java`
#### Snippet
```java
     * @param providerUrl
     * @param securityPrincipal
     * @param securityCredentials
     * @return the cache key
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/client/ReceiveSubscriber.java`
#### Snippet
```java
     * @param jmsSelector JMS Selector
     * @return the message consumer
     * @throws JMSException
     */
    private static MessageConsumer createSubscriber(Session session,
```

### JavadocDeclaration
`@param s1` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/client/ReceiveSubscriber.java`
#### Snippet
```java
     * Checks whether string is empty
     *
     * @param s1
     * @return True if input is null, an empty string, or a white space-only string
     */
```

### JavadocDeclaration
`@param destinationName` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/client/Publisher.java`
#### Snippet
```java

    /**
     * @param destinationName
     * @param properties {@code Map<String, String>}
     * @param msg Message
```

### JavadocDeclaration
`@param deliveryMode` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/client/Publisher.java`
#### Snippet
```java
     * @param properties {@code Map<String, String>}
     * @param msg Message
     * @param deliveryMode
     * @param priority
     * @param expiration
```

### JavadocDeclaration
`@param priority` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/client/Publisher.java`
#### Snippet
```java
     * @param msg Message
     * @param deliveryMode
     * @param priority
     * @param expiration
     * @return Message
```

### JavadocDeclaration
`@param expiration` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/client/Publisher.java`
#### Snippet
```java
     * @param deliveryMode
     * @param priority
     * @param expiration
     * @return Message
     * @throws JMSException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/client/Publisher.java`
#### Snippet
```java
     * @param expiration
     * @return Message
     * @throws JMSException
     * @throws NamingException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/client/Publisher.java`
#### Snippet
```java
     * @return Message
     * @throws JMSException
     * @throws NamingException
     */
    private Message setPropertiesAndSend(String destinationName,
```

### JavadocDeclaration
`@param command` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/control/gui/JMSPublisherGui.java`
#### Snippet
```java
     * is selected
     *
     * @param command
     * @since 2.9
     */
```

### JavadocDeclaration
`@param command` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/control/gui/JMSPublisherGui.java`
#### Snippet
```java
     * message, file or random path.
     *
     * @param command
     */
    private void updateConfig(String command) {
```

### JavadocDeclaration
`@param factory` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/Receiver.java`
#### Snippet
```java
    /**
     * Constructor
     * @param factory
     * @param receiveQueue Receive Queue
     * @param principal Username
```

### JavadocDeclaration
`@param useResMsgIdAsCorrelId` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/Receiver.java`
#### Snippet
```java
     * @param principal Username
     * @param credentials Password
     * @param useResMsgIdAsCorrelId
     * @param jmsSelector JMS Selector
     * @throws JMSException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/Receiver.java`
#### Snippet
```java
     * @param useResMsgIdAsCorrelId
     * @param jmsSelector JMS Selector
     * @throws JMSException
     */
    private Receiver(ConnectionFactory factory, Destination receiveQueue, String principal,
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/PublisherSampler.java`
#### Snippet
```java
     * initialize the Publisher client.
     *
     * @throws JMSException
     * @throws NamingException
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/PublisherSampler.java`
#### Snippet
```java
     *
     * @throws JMSException
     * @throws NamingException
     *
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/SubscriberSampler.java`
#### Snippet
```java
    /**
     * Create the ReceiveSubscriber client for the sampler.
     * @throws NamingException
     * @throws JMSException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/SubscriberSampler.java`
#### Snippet
```java
     * Create the ReceiveSubscriber client for the sampler.
     * @throws NamingException
     * @throws JMSException
     */
    private void initReceiveClient() throws NamingException, JMSException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/SubscriberSampler.java`
#### Snippet
```java
     * Create the OnMessageSubscriber client and set the sampler as the message
     * listener.
     * @throws JMSException
     * @throws NamingException
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/SubscriberSampler.java`
#### Snippet
```java
     * listener.
     * @throws JMSException
     * @throws NamingException
     *
     */
```

### JavadocDeclaration
`@param reconnect` tag description is missing
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/SubscriberSampler.java`
#### Snippet
```java
    /**
     * Try to reconnect if configured to or temporize if not or an exception occurred
     * @param reconnect
     */
    private void handleErrorAndAddTemporize(boolean reconnect) {
```

### JavadocDeclaration
`@param commentText` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/action/ParseCurlCommandAction.java`
#### Snippet
```java
    /**
     * @param request    {@link Request}
     * @param commentText
     * @return {@link HTTPSamplerProxy}
     * @throws MalformedURLException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/action/ParseCurlCommandAction.java`
#### Snippet
```java
     * @param commentText
     * @return {@link HTTPSamplerProxy}
     * @throws MalformedURLException
     */
    private HTTPSamplerProxy createSampler(Request request, String commentText) throws MalformedURLException {
```

### JavadocDeclaration
`@param filePath` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
    * Read the postdata from file
    *
    * @param filePath
    * @return the content of file
    */
```

### JavadocDeclaration
`@param host` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/Proxy.java`
#### Snippet
```java
     * Get SSL connection from hashmap, creating it if necessary.
     *
     * @param host
     * @return a ssl socket factory, or null if keystore could not be opened/processed
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/Proxy.java`
#### Snippet
```java
     * @param host the hostname to match
     * @return the keystore entry or {@code null} if no match found
     * @throws KeyStoreException
     */
    private static String getDomainMatch(KeyStore keyStore, String host) throws KeyStoreException {
```

### JavadocDeclaration
`@param host` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/Proxy.java`
#### Snippet
```java
     *
     * @param sock socket in
     * @param host
     * @return a new client socket over ssl
     * @throws IOException if negotiation failed
```

### JavadocDeclaration
`@param iconSize` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java`
#### Snippet
```java

    /**
     * @param iconSize
     */
    JButton createStopButton(String iconSize) {
```

### JavadocDeclaration
`@param a` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/CookieManager.java`
#### Snippet
```java
     * <br/>
     * TODO - should we compare secure too?
     * @param a
     * @param b
     * @return true if cookies match
```

### JavadocDeclaration
`@param b` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/CookieManager.java`
#### Snippet
```java
     * TODO - should we compare secure too?
     * @param a
     * @param b
     * @return true if cookies match
     */
```

### JavadocDeclaration
`@param name` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/MultipartUrlConfig.java`
#### Snippet
```java
     * the request is sent.
     *
     * @param name
     * @param value
     * @param contentType can include charset or not, for example:  "application/json; charset=UTF-8" or  "application/json"
```

### JavadocDeclaration
`@param value` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/MultipartUrlConfig.java`
#### Snippet
```java
     *
     * @param name
     * @param value
     * @param contentType can include charset or not, for example:  "application/json; charset=UTF-8" or  "application/json"
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/PostWriter.java`
#### Snippet
```java
     *
     * @return the bytes used to separate multiparts
     * @throws IOException
     */
    private byte[] getMultipartDivider() throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/PostWriter.java`
#### Snippet
```java
     *
     * @return the bytes used to end a file multipart
     * @throws IOException
     */
    private byte[] getFileMultipartEndDivider() throws IOException{
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/PostWriter.java`
#### Snippet
```java
     * @param filename the filename of the file to write to the stream
     * @param out the stream to write to
     * @throws IOException
     */
    private static void writeFileToStream(String filename, OutputStream out) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/hc/LaxDeflateInputStream.java`
#### Snippet
```java
     * @param relaxMode relax mode enabled
     * @return -1 if relax
     * @throws EOFException
     */
    private static int handleRelaxMode(final EOFException ex, final boolean relaxMode) throws EOFException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/hc/LaxGZIPInputStream.java`
#### Snippet
```java
     * @param relaxMode relax mode enabled
     * @return -1 if relax
     * @throws EOFException
     */
    private static int handleRelaxMode(final EOFException ex, final boolean relaxMode) throws EOFException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/hc/LazyLayeredConnectionSocketFactory.java`
#### Snippet
```java

        /**
         * @throws SSLInitializationException
         */
        private static LayeredConnectionSocketFactory checkAndInit() throws SSLInitializationException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/jdbc/src/main/java/org/apache/jmeter/protocol/jdbc/AbstractJDBCTestElement.java`
#### Snippet
```java
     *            ResultSet passed in from a database query
     * @return a Data object
     * @throws java.sql.SQLException
     * @throws UnsupportedEncodingException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/jdbc/src/main/java/org/apache/jmeter/protocol/jdbc/AbstractJDBCTestElement.java`
#### Snippet
```java
     * @return a Data object
     * @throws java.sql.SQLException
     * @throws UnsupportedEncodingException
     */
    private String getStringFromResultSet(ResultSet rs) throws SQLException, UnsupportedEncodingException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/jdbc/src/main/java/org/apache/jmeter/protocol/jdbc/AbstractJDBCTestElement.java`
#### Snippet
```java
     * @param stmt {@link Statement} Statement for which we want to set timeout
     * @param timeout int timeout value in seconds, if < 0 setQueryTimeout will not be called
     * @throws SQLException
     */
    private static void setQueryTimeout(Statement stmt, int timeout) throws SQLException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/jdbc/src/main/java/org/apache/jmeter/protocol/jdbc/AbstractJDBCTestElement.java`
#### Snippet
```java
     * @param resultSet {@link ResultSet}
     * @return number of rows in resultSet
     * @throws SQLException
     */
    private int countRows(ResultSet resultSet) throws SQLException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java`
#### Snippet
```java
     * @param contentEncoding Content encoding may be null or empty
     * @return {@link UrlEncodedFormEntity}
     * @throws UnsupportedEncodingException
     */
    private UrlEncodedFormEntity createUrlEncodedFormEntity(final String contentEncoding) throws UnsupportedEncodingException {
```

### JavadocDeclaration
`@param postedBody` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java`
#### Snippet
```java

    /**
     * @param postedBody
     * @param entity
     * @param fileBodies Array of {@link ViewableFileBody}
```

### JavadocDeclaration
`@param entity` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java`
#### Snippet
```java
    /**
     * @param postedBody
     * @param entity
     * @param fileBodies Array of {@link ViewableFileBody}
     * @param contentEncoding
```

### JavadocDeclaration
`@param contentEncoding` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java`
#### Snippet
```java
     * @param entity
     * @param fileBodies Array of {@link ViewableFileBody}
     * @param contentEncoding
     * @throws IOException
     * @throws UnsupportedEncodingException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java`
#### Snippet
```java
     * @param fileBodies Array of {@link ViewableFileBody}
     * @param contentEncoding
     * @throws IOException
     * @throws UnsupportedEncodingException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java`
#### Snippet
```java
     * @param contentEncoding
     * @throws IOException
     * @throws UnsupportedEncodingException
     */
    private static void writeEntityToSB(final StringBuilder postedBody, final HttpEntity entity,
```

### JavadocDeclaration
`@param mapHttpClientPerHttpClientKey` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java`
#### Snippet
```java

    /**
     * @param mapHttpClientPerHttpClientKey
     */
    private static void closeCurrentConnections(
```

### JavadocDeclaration
`@param targetHost` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java`
#### Snippet
```java

        /**
         * @param targetHost
         * @param authorization
         * @param authCache
```

### JavadocDeclaration
`@param authorization` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java`
#### Snippet
```java
        /**
         * @param targetHost
         * @param authorization
         * @param authCache
         * @param authScope
```

### JavadocDeclaration
`@param authCache` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java`
#### Snippet
```java
         * @param targetHost
         * @param authorization
         * @param authCache
         * @param authScope
         */
```

### JavadocDeclaration
`@param authScope` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java`
#### Snippet
```java
         * @param authorization
         * @param authCache
         * @param authScope
         */
        private static void fillAuthCache(HttpHost targetHost, Authorization authorization, AuthCache authCache,
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java`
#### Snippet
```java
     * @param url the target url (will be used to look up a possible subject for the execution)
     * @return the result of the execution of the httpRequest
     * @throws IOException
     */
    private CloseableHttpResponse executeRequest(final CloseableHttpClient httpClient,
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java`
#### Snippet
```java
     * @param res {@link HTTPSampleResult}
     * @return {@link LinkExtractorParser}
     * @throws LinkExtractorParseException
     */
    private static LinkExtractorParser getParser(HTTPSampleResult res)
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java`
#### Snippet
```java

    /**
     * @deprecated use {@link HTTPSamplerBase#setDoMultipartPost(boolean)}
     * @param value flag whether multiparts should be used
     */
```

### JavadocDeclaration
`@param testObject` tag description is missing
in `src/protocol/junit/src/main/java/org/apache/jmeter/protocol/java/sampler/JUnitSampler.java`
#### Snippet
```java
    /**
     * Method tries to get the setUp and tearDown method for the class
     * @param testObject
     */
    private void initMethodObjects(Object testObject){
```

### JavadocDeclaration
`@return` tag description is missing
in `src/protocol/mail/src/main/java/org/apache/jmeter/protocol/smtp/sampler/protocol/SendMailCommand.java`
#### Snippet
```java

    /**
     * @return
     * @throws MessagingException
     * @throws FileNotFoundException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/mail/src/main/java/org/apache/jmeter/protocol/smtp/sampler/protocol/SendMailCommand.java`
#### Snippet
```java
    /**
     * @return
     * @throws MessagingException
     * @throws FileNotFoundException
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/mail/src/main/java/org/apache/jmeter/protocol/smtp/sampler/protocol/SendMailCommand.java`
#### Snippet
```java
     * @return
     * @throws MessagingException
     * @throws FileNotFoundException
     * @throws IOException
     * @throws AddressException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/mail/src/main/java/org/apache/jmeter/protocol/smtp/sampler/protocol/SendMailCommand.java`
#### Snippet
```java
     * @throws MessagingException
     * @throws FileNotFoundException
     * @throws IOException
     * @throws AddressException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/protocol/mail/src/main/java/org/apache/jmeter/protocol/smtp/sampler/protocol/SendMailCommand.java`
#### Snippet
```java
     * @throws FileNotFoundException
     * @throws IOException
     * @throws AddressException
     */
    private Message buildMessage() throws MessagingException, IOException {
```

### JavadocDeclaration
`@param encodedString` tag description is missing
in `src/functions/src/main/java/org/apache/jmeter/functions/DigestEncodeFunction.java`
#### Snippet
```java
     * Upper case value if optional parameter value is true
     *
     * @param encodedString
     * @param index
     * @return
```

### JavadocDeclaration
`@param index` tag description is missing
in `src/functions/src/main/java/org/apache/jmeter/functions/DigestEncodeFunction.java`
#### Snippet
```java
     *
     * @param encodedString
     * @param index
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/functions/src/main/java/org/apache/jmeter/functions/DigestEncodeFunction.java`
#### Snippet
```java
     * @param encodedString
     * @param index
     * @return
     */
    private static String uppercase(String encodedString, CompoundVariable[] values, int index) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/functions/src/main/java/org/apache/jmeter/functions/JavaScript.java`
#### Snippet
```java
     * @param varName variable name
     * @return result as String
     * @throws InvalidVariableException
     */
    private static String executeWithRhino(SampleResult previousResult,
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/functions/src/main/java/org/apache/jmeter/functions/JavaScript.java`
#### Snippet
```java
     * @param varName variable name
     * @return result as String
     * @throws InvalidVariableException
     */
    private static String executeWithNashorn(SampleResult previousResult,
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/functions/src/main/java/org/apache/jmeter/functions/StringToFile.java`
#### Snippet
```java
     * Write to file
     * @return boolean true if success , false otherwise
     * @throws IOException
     */
    private boolean writeToFile() throws IOException {
```

### JavadocDeclaration
`@param varsNames` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/config/CSVDataSet.java`
#### Snippet
```java
    /**
     * trim content of array varNames
     * @param varsNames
     */
    private static void trimVarNames(String[] varsNames) {
```

### JavadocDeclaration
`@param parent` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/control/gui/ModuleControllerGui.java`
#### Snippet
```java
     * @param node - element of test plan tree
     * @param level - level of element in a tree
     * @param parent
     */
    private void buildTreeNodeModel(JMeterTreeNode node, int level,
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/extractor/XPath2Extractor.java`
#### Snippet
```java
     * @param matchNumber int Match Number
     * @param responseData String that contains the entire Document
     * @throws SaxonApiException
     * @throws FactoryConfigurationError
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/extractor/XPath2Extractor.java`
#### Snippet
```java
     * @param responseData String that contains the entire Document
     * @throws SaxonApiException
     * @throws FactoryConfigurationError
     */
    private void getValuesForXPath(String query, List<String> matchStrings, int matchNumber, String responseData)
```

### JavadocDeclaration
`@param unicodeData` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/extractor/XPathExtractor.java`
#### Snippet
```java
     * Converts (X)HTML response to DOM object Tree.
     * This version cares of charset of response.
     * @param unicodeData
     * @return the parsed document
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/extractor/XPathExtractor.java`
#### Snippet
```java
     * @param matchNumber int Match Number
     *
     * @throws TransformerException
     */
    private void getValuesForXPath(Document d,String query, List<String> matchStrings, int matchNumber)
```

### JavadocDeclaration
`@param stringPattern` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/assertions/ResponseAssertion.java`
#### Snippet
```java
     * Generate the failure reason from the TestType
     *
     * @param stringPattern
     * @return the message for the assertion report
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/assertions/jmespath/JMESPathAssertion.java`
#### Snippet
```java
     * @param assertionResult          {@link AssertionResult}
     * @param responseDataAsJsonString the response data from the sender
     * @throws Exception
     */
    private void doAssert(AssertionResult assertionResult, String responseDataAsJsonString, boolean invert)
```

### JavadocDeclaration
`@param unicodeData` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/RenderAsXPath.java`
#### Snippet
```java
     * Converts (X)HTML response to DOM object Tree.
     * This version cares of charset of response.
     * @param unicodeData
     * @param extractor
     * @return Document
```

### JavadocDeclaration
`@param extractor` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/RenderAsXPath.java`
#### Snippet
```java
     * This version cares of charset of response.
     * @param unicodeData
     * @param extractor
     * @return Document
     *
```

### JavadocDeclaration
`@param textToParse` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/RenderAsXPath.java`
#### Snippet
```java
    /**
     * Launch xpath engine to parse a input text
     * @param textToParse
     */
    private void executeAndShowXPathTester(String textToParse, XPathExtractor extractor) {
```

### JavadocDeclaration
`@param textToParse` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/RenderAsBoundaryExtractor.java`
#### Snippet
```java
    /**
     * Launch boundaryExtractor engine to parse a input text
     * @param textToParse
     */
    private void executeAndShowBoundaryExtractorTester(String textToParse) {
```

### JavadocDeclaration
`@param textToParse` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/RenderAsXPath2.java`
#### Snippet
```java
    /**
     * Launch xpath engine to parse a input text
     * @param textToParse
     */
    private void executeAndShowXPathTester(String textToParse, XPath2Extractor extractor) {
```

### JavadocDeclaration
`@param node` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/XMLDefaultMutableTreeNode.java`
#### Snippet
```java
     * init comment Node
     *
     * @param node
     * @param mTreeNode
     * @throws SAXException
```

### JavadocDeclaration
`@param mTreeNode` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/XMLDefaultMutableTreeNode.java`
#### Snippet
```java
     *
     * @param node
     * @param mTreeNode
     * @throws SAXException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/XMLDefaultMutableTreeNode.java`
#### Snippet
```java
     * @param node
     * @param mTreeNode
     * @throws SAXException
     */
    private static void initCommentNode(Comment node, DefaultMutableTreeNode mTreeNode) throws SAXException {
```

### JavadocDeclaration
`@param node` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/XMLDefaultMutableTreeNode.java`
#### Snippet
```java
     * init the TextNode
     *
     * @param node
     * @param mTreeNode
     * @throws SAXException
```

### JavadocDeclaration
`@param mTreeNode` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/XMLDefaultMutableTreeNode.java`
#### Snippet
```java
     *
     * @param node
     * @param mTreeNode
     * @throws SAXException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/XMLDefaultMutableTreeNode.java`
#### Snippet
```java
     * @param node
     * @param mTreeNode
     * @throws SAXException
     */
    private static void initTextNode(Text node, DefaultMutableTreeNode mTreeNode) throws SAXException {
```

### JavadocDeclaration
`@param node` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/XMLDefaultMutableTreeNode.java`
#### Snippet
```java
     * init node
     *
     * @param node
     * @param mTreeNode
     * @throws SAXException
```

### JavadocDeclaration
`@param mTreeNode` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/XMLDefaultMutableTreeNode.java`
#### Snippet
```java
     *
     * @param node
     * @param mTreeNode
     * @throws SAXException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/XMLDefaultMutableTreeNode.java`
#### Snippet
```java
     * @param node
     * @param mTreeNode
     * @throws SAXException
     */
    private static void initNode(Node node, XMLDefaultMutableTreeNode mTreeNode) throws SAXException {
```

### JavadocDeclaration
`@param xmlRoot` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/XMLDefaultMutableTreeNode.java`
#### Snippet
```java
     * init root
     *
     * @param xmlRoot
     * @throws SAXException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/XMLDefaultMutableTreeNode.java`
#### Snippet
```java
     *
     * @param xmlRoot
     * @throws SAXException
     */
    private void initRoot(Node xmlRoot) throws SAXException {
```

### JavadocDeclaration
`@param node` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/XMLDefaultMutableTreeNode.java`
#### Snippet
```java
     * init CDATASection Node
     *
     * @param node
     * @param mTreeNode
     * @throws SAXException
```

### JavadocDeclaration
`@param mTreeNode` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/XMLDefaultMutableTreeNode.java`
#### Snippet
```java
     *
     * @param node
     * @param mTreeNode
     * @throws SAXException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/XMLDefaultMutableTreeNode.java`
#### Snippet
```java
     * @param node
     * @param mTreeNode
     * @throws SAXException
     */
    private static void initCDATASectionNode(CDATASection node, DefaultMutableTreeNode mTreeNode) throws SAXException {
```

### JavadocDeclaration
`@param node` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/XMLDefaultMutableTreeNode.java`
#### Snippet
```java
     * init attribute node
     *
     * @param node
     * @param mTreeNode
     * @throws SAXException
```

### JavadocDeclaration
`@param mTreeNode` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/XMLDefaultMutableTreeNode.java`
#### Snippet
```java
     *
     * @param node
     * @param mTreeNode
     * @throws SAXException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/XMLDefaultMutableTreeNode.java`
#### Snippet
```java
     * @param node
     * @param mTreeNode
     * @throws SAXException
     */
    private static void initAttributeNode(Node node, DefaultMutableTreeNode mTreeNode) throws SAXException {
```

### JavadocDeclaration
`@param node` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/XMLDefaultMutableTreeNode.java`
#### Snippet
```java
     * init element node
     *
     * @param node
     * @param mTreeNode
     * @throws SAXException
```

### JavadocDeclaration
`@param mTreeNode` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/XMLDefaultMutableTreeNode.java`
#### Snippet
```java
     *
     * @param node
     * @param mTreeNode
     * @throws SAXException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/XMLDefaultMutableTreeNode.java`
#### Snippet
```java
     * @param node
     * @param mTreeNode
     * @throws SAXException
     */
    private static void initElementNode(Node node, DefaultMutableTreeNode mTreeNode) throws SAXException {
```

### JavadocDeclaration
`@param textToParse` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/RenderAsRegexp.java`
#### Snippet
```java
    /**
     * Launch regexp engine to parse a input text
     * @param textToParse
     */
    private void executeAndShowRegexpTester(String textToParse) {
```

### JavadocDeclaration
`@param textToParse` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/RenderAsCssJQuery.java`
#### Snippet
```java
    /**
     * Launch cssJquery engine to parse a input text
     * @param textToParse
     */
    private void executeAndShowCssJqueryTester(String textToParse) {
```

### JavadocDeclaration
`@param searcher` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/SearchTreePanel.java`
#### Snippet
```java

    /**
     * @param searcher
     * @param node
     */
```

### JavadocDeclaration
`@param node` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/SearchTreePanel.java`
#### Snippet
```java
    /**
     * @param searcher
     * @param node
     */
    private static boolean searchInNode(Searcher searcher, SearchableTreeNode node) {
```

### JavadocDeclaration
`@param searchableTreeNode` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/SearchTreePanel.java`
#### Snippet
```java

    /**
     * @param searchableTreeNode
     */
    private static void doResetSearch(SearchableTreeNode searchableTreeNode) {
```

### JavadocDeclaration
`@param textToFind` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java

    /**
     * @param textToFind
     * @return pattern ready to search
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/HttpMetricsSender.java`
#### Snippet
```java
     * @param token InfluxDB 2.0 authorization token
     * @return {@link HttpPost}
     * @throws URISyntaxException
     */
    private static HttpPost createRequest(URL url, String token) throws URISyntaxException {
```

### JavadocDeclaration
`@param textToFind` tag description is missing
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java

    /**
     * @param textToFind
     * @return pattern ready to search
     */
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `src/core/src/main/java/org/apache/jmeter/threads/JMeterThread.java`
#### Snippet
```java
        } catch (Exception | JMeterError e) {
            log.error("Test failed!", e);
        } catch (ThreadDeath e) {
            throw e; // Must not ignore this one
        } finally {
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `admin`
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/FixedQueueExecutor.java`
#### Snippet
```java
        if(useReqMsgIdAsCorrelId) {// msgId not available until after send() is called
            // Note: there is only one admin object which is shared between all threads
            synchronized (admin) {// interlock with Receiver
                producer.send(request, deliveryMode, priority, expiration);
                id=request.getJMSMessageID();
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `admin`
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/Receiver.java`
#### Snippet
```java
                    if (useResMsgIdAsCorrelId){
                        messageKey = reply.getJMSMessageID();
                        synchronized (admin) {// synchronize with FixedQueueExecutor
                            admin.putReply(messageKey, reply);
                        }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `admin`
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/Receiver.java`
#### Snippet
```java
                            log.warn("Received message with correlation id null. Discarding message ...");
                        } else {
                            synchronized (admin) {
                                admin.putReply(messageKey, reply);
                            }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `events`
in `src/components/src/main/java/org/apache/jmeter/timers/poissonarrivals/PreciseThroughputTimer.java`
#### Snippet
```java
        double nextEvent;
        EventProducer events = getEventProducer();
        synchronized (events) {
            nextEvent = events.next();
        }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `row`
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatVisualizer.java`
#### Snippet
```java
                    return newRow;
                });
        synchronized (row) {
            /*
             * Synch is needed because multiple threads can update the counts.
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `row`
in `src/components/src/main/java/org/apache/jmeter/visualizers/SummaryReport.java`
#### Snippet
```java
         * Synch is needed because multiple threads can update the counts.
         */
        synchronized (row) {
            row.addSample(res);
        }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `samples`
in `src/components/src/main/java/org/apache/jmeter/visualizers/Graph.java`
#### Snippet
```java

        List<Sample> samples = model.getSamples();
        synchronized (samples ) {
            Iterator<Sample> e = samples.iterator();

```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `row`
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java
                return newRow;
            });
            synchronized (row) {
                row.addSample(res);
            }
```

## RuleId[id=NewClassNamingConvention]
### NewClassNamingConvention
Test class name `TearDownTestFail` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `src/protocol/junit-sample/src/main/java/test/TearDownTestFail.java`
#### Snippet
```java
 * Test to demonstrate how tearDown failures are handled
 */
public class TearDownTestFail extends TestCase {

    @Override
```

### NewClassNamingConvention
Test class name `SetupTestFail` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `src/protocol/junit-sample/src/main/java/test/SetupTestFail.java`
#### Snippet
```java
 */
@SuppressWarnings("JUnitAmbiguousTestClass")
public class SetupTestFail extends TestCase {

    @Override
```

### NewClassNamingConvention
Test class name `SetupTestError` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `src/protocol/junit-sample/src/main/java/test/SetupTestError.java`
#### Snippet
```java
 */
@SuppressWarnings("JUnitAmbiguousTestClass")
public class SetupTestError extends TestCase {

    @Override
```

### NewClassNamingConvention
Test class name `SubDummyTest2` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `src/protocol/junit-sample/src/main/java/woolfel/SubDummyTest2.java`
#### Snippet
```java
package woolfel;

public class SubDummyTest2 extends DummyTestCase {

    @SuppressWarnings("unused")
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `initialTestFile` is redundant
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
                } else if (parser.getArgumentById(NONGUI_OPT) == null) { // not non-GUI => GUI
                    PluginManager.install(this, true);
                    String initialTestFile = testFile;
                    JMeterGuiLauncher.startGui(initialTestFile);
                    startOptionalServers();
```

### UnnecessaryLocalVariable
Local variable `prop` is redundant
in `src/core/src/main/java/org/apache/jmeter/save/converters/IntegerPropertyConverter.java`
#### Snippet
```java
            return null;
        }
        IntegerProperty prop = new IntegerProperty(name, Integer.parseInt(reader.getValue()));
        return prop;
    }
```

### UnnecessaryLocalVariable
Local variable `prop` is redundant
in `src/core/src/main/java/org/apache/jmeter/save/converters/LongPropertyConverter.java`
#### Snippet
```java
            return null;
        }
        LongProperty prop = new LongProperty(name, Long.parseLong(reader.getValue()));
        return prop;
    }
```

### UnnecessaryLocalVariable
Local variable `prop` is redundant
in `src/core/src/main/java/org/apache/jmeter/save/converters/StringPropertyConverter.java`
#### Snippet
```java
        }
        final String value = ConversionHelp.getPropertyValue(reader, context, name);
        StringProperty prop = new StringProperty(name, value);
        return prop;
    }
```

### UnnecessaryLocalVariable
Local variable `evt` is redundant
in `src/core/src/main/java/org/apache/jmeter/save/converters/SampleEventConverter.java`
#### Snippet
```java
    public Object unmarshal(HierarchicalStreamReader reader,
            UnmarshallingContext context) {
        SampleEvent evt = new SampleEvent();
        return evt;
    }
```

### UnnecessaryLocalVariable
Local variable `prop` is redundant
in `src/core/src/main/java/org/apache/jmeter/save/converters/BooleanPropertyConverter.java`
#### Snippet
```java
            return null;
        }
        BooleanProperty prop = new BooleanProperty(name, Boolean.valueOf(reader.getValue()));
        return prop;
    }
```

### UnnecessaryLocalVariable
Local variable `currentVal` is redundant
in `src/core/src/main/java/org/apache/jmeter/util/Calculator.java`
#### Snippet
```java
    private void addValue(long newValue, int sampleCount) {
        count += sampleCount;
        double currentVal = newValue;
        sum += currentVal;
        if (sampleCount > 1){
```

### UnnecessaryLocalVariable
Local variable `nodes` is redundant
in `src/core/src/main/java/org/apache/jmeter/util/JMeterTreeNodeTransferable.java`
#### Snippet
```java
            try {
                ois = new ObjectInputStream(new ByteArrayInputStream(data));
                JMeterTreeNode[] nodes = (JMeterTreeNode[]) ois.readObject();
                return nodes;
            } catch (ClassNotFoundException cnfe) {
```

### UnnecessaryLocalVariable
Local variable `rval` is redundant
in `src/core/src/main/java/org/apache/jmeter/reporters/SummariserRunningSample.java`
#### Snippet
```java
            return 0.0;
        }
        double rval = (double) errorCount / (double) counter;
        return rval;
    }
```

### UnnecessaryLocalVariable
Local variable `oo` is redundant
in `src/core/src/main/java/org/apache/jmeter/visualizers/TableSample.java`
#### Snippet
```java
    @Override
    public int compareTo(TableSample o) {
        TableSample oo = o;
        return (totalSamples - oo.totalSamples) < 0 ? -1 : (totalSamples == oo.totalSamples ? 0 : 1);
    }
```

### UnnecessaryLocalVariable
Local variable `index` is redundant
in `src/jorphan/src/main/java/org/apache/jorphan/gui/MenuScroller.java`
#### Snippet
```java
            keepVisibleIndex = -1;
        } else {
            int index = menu.getComponentIndex(item);
            keepVisibleIndex = index;
        }
```

### UnnecessaryLocalVariable
Local variable `cookie` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/CookiePanel.java`
#### Snippet
```java

    private static Cookie createCookie(Object[] rowData) {
        Cookie cookie = new Cookie(
                (String) rowData[0],
                (String) rowData[1],
```

### UnnecessaryLocalVariable
Local variable `fullUrl` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/HttpRequestHdr.java`
#### Snippet
```java

    public String getUrlWithoutQuery(URL url) {
        String fullUrl = url.toString();
        String urlWithoutQuery = fullUrl;
        String query = url.getQuery();
```

### UnnecessaryLocalVariable
Local variable `fullUrl` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/Proxy.java`
#### Snippet
```java

    private static String getUrlWithoutQuery(URL url) {
        String fullUrl = url.toString();
        String urlWithoutQuery = fullUrl;
        String query = url.getQuery();
```

### UnnecessaryLocalVariable
Local variable `len` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/AjpSampler.java`
#### Snippet
```java
        }
        getInt();
        int len = getInt();
        int toRead = len;
        int cpos = inpos;
```

### UnnecessaryLocalVariable
Local variable `up` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/modifier/RegExUserParameters.java`
#### Snippet
```java
    @Override
    public Object clone() {
        RegExUserParameters up = (RegExUserParameters) super.clone();
        return up;
    }
```

### UnnecessaryLocalVariable
Local variable `urlContentEncoding` is redundant
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java`
#### Snippet
```java
                        entityEnclosingRequest.setHeader(HTTPConstants.HEADER_CONTENT_TYPE, HTTPConstants.APPLICATION_X_WWW_FORM_URLENCODED);
                    }
                    String urlContentEncoding = contentEncoding;
                    UrlEncodedFormEntity entity = createUrlEncodedFormEntity(urlContentEncoding);
                    entityEnclosingRequest.setEntity(entity);
```

### UnnecessaryLocalVariable
Local variable `attr` is redundant
in `src/protocol/ldap/src/main/java/org/apache/jmeter/protocol/ldap/sampler/LDAPSampler.java`
#### Snippet
```java
     */
    private static BasicAttribute getBasicAttribute(String name, String value) {
        BasicAttribute attr = new BasicAttribute(name, value);
        return attr;
    }
```

### UnnecessaryLocalVariable
Local variable `propertyValue` is redundant
in `src/functions/src/main/java/org/apache/jmeter/functions/Property2.java`
#### Snippet
```java
        }

        String propertyValue = JMeterUtils.getPropDefault(propertyName, propertyDefault);

        return propertyValue;
```

### UnnecessaryLocalVariable
Local variable `comparator` is redundant
in `src/components/src/main/java/org/apache/jmeter/assertions/gui/SizeAssertionGui.java`
#### Snippet
```java
    @Override
    public void actionPerformed(ActionEvent e) {
        int comparator = Integer.parseInt(e.getActionCommand());
        execState = comparator;
    }
```

### UnnecessaryLocalVariable
Local variable `topValue` is redundant
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphChart.java`
#### Snippet
```java
        BigDecimal round = BigDecimal.valueOf(value / divValueInt);
        round = round.setScale(0, roundingMode);
        int topValue = round.intValue() * divValueInt;
        return topValue;
    }
```

### UnnecessaryLocalVariable
Local variable `res` is redundant
in `src/components/src/main/java/org/apache/jmeter/visualizers/ViewResultsFullVisualizer.java`
#### Snippet
```java
            root.removeAllChildren();
            for (SampleResult sampler: buffer) {
                SampleResult res = sampler;
                // Add sample
                DefaultMutableTreeNode currNode = new SearchableTreeNode(res, treeModel);
```

## RuleId[id=RedundantFileCreation]
### RedundantFileCreation
`new File` is redundant
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
            case PROPFILE2_OPT: // Bug 33920 - allow multiple props
                log.info("Loading additional properties from: {}", name);
                try (FileInputStream fis = new FileInputStream(new File(name))){
                    Properties tmp = new Properties();
                    tmp.load(fis);
```

### RedundantFileCreation
`new File` is redundant
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
            case SYSTEM_PROPFILE:
                log.info("Setting System properties from file: {}", name);
                try (FileInputStream fis = new FileInputStream(new File(name))){
                    System.getProperties().load(fis);
                } catch (IOException e) { // NOSONAR
```

### RedundantFileCreation
`new File` is redundant
in `src/core/src/main/java/org/apache/jmeter/util/JMeterUtils.java`
#### Snippet
```java
    public static void loadJMeterProperties(String file) {
        Properties p = new Properties(System.getProperties());
        try (InputStream is = new FileInputStream(new File(file))) {
            p.load(is);
        } catch (IOException e) {
```

### RedundantFileCreation
`new File` is redundant
in `src/core/src/main/java/org/apache/jmeter/util/JMeterUtils.java`
#### Snippet
```java
    public static Properties loadProperties(String file, Properties defaultProps) {
        Properties p = new Properties(defaultProps);
        try (InputStream is = new FileInputStream(new File(file))) {
            p.load(is);
        } catch (IOException e) {
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/core/src/main/java/org/apache/jmeter/gui/HtmlReportUI.java`
#### Snippet
```java
                    LOGGER.error("Error during html report generation: {}", exception.getMessage(), exception);
                }
                reportToUser(Arrays.asList(exception.getMessage()));
            }
        }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/core/src/main/java/org/apache/jmeter/gui/action/RemoteStart.java`
#### Snippet
```java
        if (action.equals(ActionNames.REMOTE_STOP)) {
            GuiPackage.getInstance().getMainFrame().showStoppingMessage(name);
            distributedRunner.stop(Arrays.asList(name));
        } else if (action.equals(ActionNames.REMOTE_SHUT)) {
            GuiPackage.getInstance().getMainFrame().showStoppingMessage(name);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/core/src/main/java/org/apache/jmeter/gui/action/RemoteStart.java`
#### Snippet
```java
        } else if (action.equals(ActionNames.REMOTE_SHUT)) {
            GuiPackage.getInstance().getMainFrame().showStoppingMessage(name);
            distributedRunner.shutdown(Arrays.asList(name));
        } else if (action.equals(ActionNames.REMOTE_START)) {
            popupShouldSave(e);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/core/src/main/java/org/apache/jmeter/gui/action/RemoteStart.java`
#### Snippet
```java
            HashTree testTree = getTestTree();
            if ( popupCheckExistingFileListener(testTree) ) {
                distributedRunner.init(Arrays.asList(name), testTree);
                distributedRunner.start(Arrays.asList(name));
            }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/core/src/main/java/org/apache/jmeter/gui/action/RemoteStart.java`
#### Snippet
```java
            if ( popupCheckExistingFileListener(testTree) ) {
                distributedRunner.init(Arrays.asList(name), testTree);
                distributedRunner.start(Arrays.asList(name));
            }
        } else if (action.equals(ActionNames.REMOTE_START_ALL)) {
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/core/src/main/java/org/apache/jmeter/gui/action/RemoteStart.java`
#### Snippet
```java
            distributedRunner.shutdown(getRemoteHosts());
        } else if (action.equals(ActionNames.REMOTE_EXIT)) {
            distributedRunner.exit(Arrays.asList(name));
        } else if (action.equals(ActionNames.REMOTE_EXIT_ALL)) {
            distributedRunner.exit(getRemoteHosts());
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/core/src/main/java/org/apache/jmeter/config/gui/AbstractConfigGui.java`
#### Snippet
```java
    @Override
    public Collection<String> getMenuCategories() {
        return Arrays.asList(MenuFactory.CONFIG_ELEMENTS);
    }
}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/core/src/main/java/org/apache/jmeter/report/processor/graph/AbstractSeriesSelector.java`
#### Snippet
```java
     */
    protected Iterable<String> withDefaultIfEmpty(String value, String defaultValue) {
        return Arrays.asList(StringUtils.defaultIfBlank(value, defaultValue));
    }
}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/core/src/main/java/org/apache/jmeter/timers/gui/AbstractTimerGui.java`
#### Snippet
```java
    @Override
    public Collection<String> getMenuCategories() {
        return Arrays.asList(MenuFactory.TIMERS);
    }
}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/core/src/main/java/org/apache/jmeter/report/processor/graph/impl/TransactionsPerSecondGraphConsumer.java`
#### Snippet
```java
                String success = sample.getSuccess() ? SUCCESS_SERIES_SUFFIX : FAILURE_SERIES_SUFFIX;
                String label = sample.getName() + "-" + success;
                return Arrays.asList(label);
            }
        };
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/core/src/main/java/org/apache/jmeter/control/gui/AbstractControllerGui.java`
#### Snippet
```java
    @Override
    public Collection<String> getMenuCategories() {
        return Arrays.asList(MenuFactory.CONTROLLERS);
    }
}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/core/src/main/java/org/apache/jmeter/control/TransactionSampler.java`
#### Snippet
```java

    private static final Set<String> APPLIABLE_CONFIG_CLASSES = new HashSet<>(
            Arrays.asList("org.apache.jmeter.config.gui.SimpleConfigGui"));

    private boolean transactionDone = false;
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/core/src/main/java/org/apache/jmeter/control/gui/TestFragmentControllerGui.java`
#### Snippet
```java
    @Override
    public Collection<String> getMenuCategories() {
        return Arrays.asList(MenuFactory.FRAGMENTS);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/core/src/main/java/org/apache/jmeter/threads/gui/AbstractThreadGroupGui.java`
#### Snippet
```java
    @Override
    public Collection<String> getMenuCategories() {
        return Arrays.asList(MenuFactory.THREADS);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/core/src/main/java/org/apache/jmeter/samplers/gui/AbstractSamplerGui.java`
#### Snippet
```java
    @Override
    public Collection<String> getMenuCategories() {
        return Arrays.asList(MenuFactory.SAMPLERS);
    }
}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/core/src/main/java/org/apache/jmeter/processor/gui/AbstractPostProcessorGui.java`
#### Snippet
```java
    @Override
    public Collection<String> getMenuCategories() {
        return Arrays.asList(MenuFactory.POST_PROCESSORS);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/core/src/main/java/org/apache/jmeter/processor/gui/AbstractPreProcessorGui.java`
#### Snippet
```java
    @Override
    public Collection<String> getMenuCategories() {
        return Arrays.asList(MenuFactory.PRE_PROCESSORS);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/core/src/main/java/org/apache/jmeter/assertions/gui/AbstractAssertionGui.java`
#### Snippet
```java
    @Override
    public Collection<String> getMenuCategories() {
        return Arrays.asList(MenuFactory.ASSERTIONS);
    }
}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/core/src/main/java/org/apache/jmeter/visualizers/gui/AbstractListenerGui.java`
#### Snippet
```java
    @Override
    public Collection<String> getMenuCategories() {
        return Arrays.asList(MenuFactory.LISTENERS);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
            INCLUDE_OPT, KEEPALIVETILE_OPT, VERBOSE_OPT, SILENT_OPT);
    private static final List<Integer> NOSUPPORT_OPTIONS_OPT = Arrays.asList(PROXY_NTLM_OPT, PROXY_NEGOTIATE_OPT);
    private static final List<Integer> PROPERTIES_OPT        = Arrays.asList(MAX_REDIRS_OPT);
    private static final List<String> DYNAMIC_COOKIES        = Arrays.asList("PHPSESSID", "JSESSIONID", "ASPSESSIONID",
            "connect.sid");// $NON-NLS-1$
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
        private String noproxy;
        private static final List<String> HEADERS_TO_IGNORE = Arrays.asList("Connection", "Host");// $NON-NLS-1$
        private static final List<String> UNIQUE_HEADERS = Arrays.asList("user-agent"); // $NON-NLS-1$
        private static final int ONE_KILOBYTE_IN_CPS = 1024;
        public Request() {
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java`
#### Snippet
```java
    @Override
    public Collection<String> getMenuCategories() {
        return Arrays.asList(MenuFactory.NON_TEST_ELEMENTS);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/gui/HttpMirrorControlGui.java`
#### Snippet
```java
    @Override
    public Collection<String> getMenuCategories() {
        return Arrays.asList(MenuFactory.NON_TEST_ELEMENTS);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/protocol/java/src/main/java/org/apache/jmeter/protocol/java/sampler/BSFSampler.java`
#### Snippet
```java

    private static final Set<String> APPLIABLE_CONFIG_CLASSES = new HashSet<>(
            Arrays.asList("org.apache.jmeter.config.gui.SimpleConfigGui"));

    private static final long serialVersionUID = 241L;
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/protocol/java/src/main/java/org/apache/jmeter/protocol/java/sampler/BeanShellSampler.java`
#### Snippet
```java
{
    private static final Set<String> APPLIABLE_CONFIG_CLASSES = new HashSet<>(
            Arrays.asList("org.apache.jmeter.config.gui.SimpleConfigGui"));

    private static final Logger log = LoggerFactory.getLogger(BeanShellSampler.class);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/protocol/jdbc/src/main/java/org/apache/jmeter/protocol/jdbc/sampler/JDBCSampler.java`
#### Snippet
```java
public class JDBCSampler extends AbstractJDBCTestElement implements Sampler, TestBean, ConfigMergabilityIndicator {
    private static final Set<String> APPLIABLE_CONFIG_CLASSES = new HashSet<>(
            Arrays.asList("org.apache.jmeter.config.gui.SimpleConfigGui"));

    private static final long serialVersionUID = 234L;
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/protocol/mail/src/main/java/org/apache/jmeter/protocol/mail/sampler/MailReaderSampler.java`
#### Snippet
```java

    private static final Set<String> APPLIABLE_CONFIG_CLASSES = new HashSet<>(
            Arrays.asList("org.apache.jmeter.config.gui.SimpleConfigGui"));

    //+ JMX attributes - do not change the values
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/protocol/native/src/main/java/org/apache/jmeter/protocol/system/SystemSampler.java`
#### Snippet
```java

    private static final Set<String> APPLIABLE_CONFIG_CLASSES = new HashSet<>(
            Arrays.asList("org.apache.jmeter.config.gui.SimpleConfigGui"));

    public static final int DEFAULT_RETURN_CODE = 0;
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/protocol/mail/src/main/java/org/apache/jmeter/protocol/smtp/sampler/SmtpSampler.java`
#### Snippet
```java

    private static final Set<String> APPLIABLE_CONFIG_CLASSES = new HashSet<>(
            Arrays.asList("org.apache.jmeter.config.gui.SimpleConfigGui"));

    private static final Logger log = LoggerFactory.getLogger(SmtpSampler.class);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/generator/src/main/java/org/apache/jmeter/visualizers/GenerateTreeGui.java`
#### Snippet
```java
    @Override
    public Collection<String> getMenuCategories() {
        return Arrays.asList(MenuFactory.NON_TEST_ELEMENTS);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/components/src/main/java/org/apache/jmeter/sampler/TestAction.java`
#### Snippet
```java

    private static final Set<String> APPLIABLE_CONFIG_CLASSES = new HashSet<>(
            Arrays.asList("org.apache.jmeter.config.gui.SimpleConfigGui"));

    // Actions
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/components/src/main/java/org/apache/jmeter/sampler/DebugSampler.java`
#### Snippet
```java

    private static final Set<String> APPLIABLE_CONFIG_CLASSES = new HashSet<>(
            Arrays.asList("org.apache.jmeter.config.gui.SimpleConfigGui"));

    private boolean displayJMeterVariables;
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/components/src/main/java/org/apache/jmeter/extractor/json/jmespath/JMESPathExtractor.java`
#### Snippet
```java
                log.debug("JMESExtractor is using variable: {}, which content is: {}", getVariableName(), jsonResponse);
            }
            return Arrays.asList(jsonResponse);
        } else {
            SampleResult previousResult = context.getPreviousResult();
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/components/src/main/java/org/apache/jmeter/extractor/json/jsonpath/JSONPostProcessor.java`
#### Snippet
```java
                log.debug("JSON Extractor is using variable: {}, which content is: {}", getVariableName(), jsonResponse);
            }
            return Arrays.asList(vars.get(getVariableName()));
        } else {
            SampleResult previousResult = context.getPreviousResult();
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/components/src/main/java/org/apache/jmeter/visualizers/PropertyControlGui.java`
#### Snippet
```java
    @Override
    public Collection<String> getMenuCategories() {
        return Arrays.asList(MenuFactory.NON_TEST_ELEMENTS);
    }

```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/JMSSampler.java`
#### Snippet
```java
        }
        for (Map.Entry<String, String> me : map.entrySet()) {
            table.put(me.getKey(), me.getValue());
        }

```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'getRepositoriesMode()' is marked unstable with @Incubating
in `settings.gradle.kts`
#### Snippet
```java

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // TODO: support enableMavenLocal
```

### UnstableApiUsage
'org.gradle.api.initialization.resolve.RepositoriesMode' is marked unstable with @Incubating
in `settings.gradle.kts`
#### Snippet
```java

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // TODO: support enableMavenLocal
```

### UnstableApiUsage
'FAIL_ON_PROJECT_REPOS' is declared in unstable enum 'org.gradle.api.initialization.resolve.RepositoriesMode' marked with @Incubating
in `settings.gradle.kts`
#### Snippet
```java

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // TODO: support enableMavenLocal
```

### UnstableApiUsage
'repositories(org.gradle.api.Action)' is marked unstable with @Incubating
in `settings.gradle.kts`
#### Snippet
```java
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // TODO: support enableMavenLocal
        mavenCentral()
```

### UnstableApiUsage
'org.gradle.language.jvm.tasks.ProcessResources' is declared in unstable package 'org.gradle.language.jvm.tasks' marked with @Incubating
in `src/launcher/build.gradle.kts`
#### Snippet
```java
val lastEditYear: String by rootProject.extra

tasks.withType<ProcessResources>().configureEach {
    val version = rootProject.version.toString()
    inputs.property("@VERSION@", version)
```

### UnstableApiUsage
'getRepositoriesMode()' is marked unstable with @Incubating
in `build-logic/settings.gradle.kts`
#### Snippet
```java

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // TODO: support enableMavenLocal
```

### UnstableApiUsage
'org.gradle.api.initialization.resolve.RepositoriesMode' is marked unstable with @Incubating
in `build-logic/settings.gradle.kts`
#### Snippet
```java

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // TODO: support enableMavenLocal
```

### UnstableApiUsage
'FAIL_ON_PROJECT_REPOS' is declared in unstable enum 'org.gradle.api.initialization.resolve.RepositoriesMode' marked with @Incubating
in `build-logic/settings.gradle.kts`
#### Snippet
```java

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // TODO: support enableMavenLocal
```

### UnstableApiUsage
'repositories(org.gradle.api.Action)' is marked unstable with @Incubating
in `build-logic/settings.gradle.kts`
#### Snippet
```java
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // TODO: support enableMavenLocal
        gradlePluginPortal()
```

### UnstableApiUsage
'org.gradle.api.reporting.ReportSpec' is marked unstable with @Incubating
in `build-logic/verification/src/main/kotlin/jacoco/JacocoAggregateReportSpec.kt`
#### Snippet
```java
import org.gradle.testing.jacoco.tasks.JacocoReport

interface JacocoAggregateReportSpec : ReportSpec {
    companion object {
        const val CODE_COVERAGE_REPORT_NAME = "jacocoReport"
```

### UnstableApiUsage
'repositories(org.gradle.api.Action)' is marked unstable with @Incubating
in `build-logic-commons/settings.gradle.kts`
#### Snippet
```java

dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
    }
```

### UnstableApiUsage
'withVariantReselection()' is marked unstable with @Incubating
in `build-logic/verification/src/main/kotlin/build-logic.jacoco-aggregate.gradle.kts`
#### Snippet
```java

var allSourceDirectories = jacocoAggregationCodeCoverageReportResults.incoming.artifactView {
    withVariantReselection()
    componentFilter { it is ProjectComponentIdentifier }
    attributes {
```

### UnstableApiUsage
'VERIFICATION' is marked unstable with @Incubating
in `build-logic/verification/src/main/kotlin/build-logic.jacoco-aggregate.gradle.kts`
#### Snippet
```java
    componentFilter { it is ProjectComponentIdentifier }
    attributes {
        attribute(Category.CATEGORY_ATTRIBUTE, Category.VERIFICATION)
        attribute(Bundling.BUNDLING_ATTRIBUTE, Bundling.EXTERNAL)
        attribute(VerificationType.VERIFICATION_TYPE_ATTRIBUTE, VerificationType.MAIN_SOURCES)
```

### UnstableApiUsage
'org.gradle.api.attributes.VerificationType' is marked unstable with @Incubating
in `build-logic/verification/src/main/kotlin/build-logic.jacoco-aggregate.gradle.kts`
#### Snippet
```java
        attribute(Category.CATEGORY_ATTRIBUTE, Category.VERIFICATION)
        attribute(Bundling.BUNDLING_ATTRIBUTE, Bundling.EXTERNAL)
        attribute(VerificationType.VERIFICATION_TYPE_ATTRIBUTE, VerificationType.MAIN_SOURCES)
    }
}
```

### UnstableApiUsage
'VERIFICATION_TYPE_ATTRIBUTE' is declared in unstable interface 'org.gradle.api.attributes.VerificationType' marked with @Incubating
in `build-logic/verification/src/main/kotlin/build-logic.jacoco-aggregate.gradle.kts`
#### Snippet
```java
        attribute(Category.CATEGORY_ATTRIBUTE, Category.VERIFICATION)
        attribute(Bundling.BUNDLING_ATTRIBUTE, Bundling.EXTERNAL)
        attribute(VerificationType.VERIFICATION_TYPE_ATTRIBUTE, VerificationType.MAIN_SOURCES)
    }
}
```

### UnstableApiUsage
'org.gradle.api.attributes.VerificationType' is marked unstable with @Incubating
in `build-logic/verification/src/main/kotlin/build-logic.jacoco-aggregate.gradle.kts`
#### Snippet
```java
        attribute(Category.CATEGORY_ATTRIBUTE, Category.VERIFICATION)
        attribute(Bundling.BUNDLING_ATTRIBUTE, Bundling.EXTERNAL)
        attribute(VerificationType.VERIFICATION_TYPE_ATTRIBUTE, VerificationType.MAIN_SOURCES)
    }
}
```

### UnstableApiUsage
'MAIN_SOURCES' is declared in unstable interface 'org.gradle.api.attributes.VerificationType' marked with @Incubating
in `build-logic/verification/src/main/kotlin/build-logic.jacoco-aggregate.gradle.kts`
#### Snippet
```java
        attribute(Category.CATEGORY_ATTRIBUTE, Category.VERIFICATION)
        attribute(Bundling.BUNDLING_ATTRIBUTE, Bundling.EXTERNAL)
        attribute(VerificationType.VERIFICATION_TYPE_ATTRIBUTE, VerificationType.MAIN_SOURCES)
    }
}
```

### UnstableApiUsage
'withVariantReselection()' is marked unstable with @Incubating
in `build-logic/verification/src/main/kotlin/build-logic.jacoco-aggregate.gradle.kts`
#### Snippet
```java

var allClassDirectories = jacocoAggregationCodeCoverageReportResults.incoming.artifactView {
    withVariantReselection()
    componentFilter { it is ProjectComponentIdentifier }
    attributes {
```

### UnstableApiUsage
'getReports()' is marked unstable with @Incubating
in `build-logic/verification/src/main/kotlin/build-logic.jacoco-aggregate.gradle.kts`
#### Snippet
```java

reporting {
    reports.registerBinding(JacocoAggregateReportSpec::class, DefaultJacocoAggregateReportSpec::class)
    reports.withType<JacocoAggregateReportSpec>().configureEach {
        reportTask.configure {
```

### UnstableApiUsage
'getReports()' is marked unstable with @Incubating
in `build-logic/verification/src/main/kotlin/build-logic.jacoco-aggregate.gradle.kts`
#### Snippet
```java
reporting {
    reports.registerBinding(JacocoAggregateReportSpec::class, DefaultJacocoAggregateReportSpec::class)
    reports.withType<JacocoAggregateReportSpec>().configureEach {
        reportTask.configure {
            val execData = jacocoAggregationCodeCoverageReportResults.incoming.artifactView {
```

### UnstableApiUsage
'withVariantReselection()' is marked unstable with @Incubating
in `build-logic/verification/src/main/kotlin/build-logic.jacoco-aggregate.gradle.kts`
#### Snippet
```java
        reportTask.configure {
            val execData = jacocoAggregationCodeCoverageReportResults.incoming.artifactView {
                withVariantReselection()
                componentFilter { it is ProjectComponentIdentifier }
                attributes {
```

### UnstableApiUsage
'VERIFICATION' is marked unstable with @Incubating
in `build-logic/verification/src/main/kotlin/build-logic.jacoco-aggregate.gradle.kts`
#### Snippet
```java
                componentFilter { it is ProjectComponentIdentifier }
                attributes {
                    attribute(Category.CATEGORY_ATTRIBUTE, Category.VERIFICATION)
                    attribute(VerificationType.VERIFICATION_TYPE_ATTRIBUTE, VerificationType.JACOCO_RESULTS)
                    attribute(ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE, ArtifactTypeDefinition.BINARY_DATA_TYPE)
```

### UnstableApiUsage
'org.gradle.api.attributes.VerificationType' is marked unstable with @Incubating
in `build-logic/verification/src/main/kotlin/build-logic.jacoco-aggregate.gradle.kts`
#### Snippet
```java
                attributes {
                    attribute(Category.CATEGORY_ATTRIBUTE, Category.VERIFICATION)
                    attribute(VerificationType.VERIFICATION_TYPE_ATTRIBUTE, VerificationType.JACOCO_RESULTS)
                    attribute(ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE, ArtifactTypeDefinition.BINARY_DATA_TYPE)
                }
```

### UnstableApiUsage
'VERIFICATION_TYPE_ATTRIBUTE' is declared in unstable interface 'org.gradle.api.attributes.VerificationType' marked with @Incubating
in `build-logic/verification/src/main/kotlin/build-logic.jacoco-aggregate.gradle.kts`
#### Snippet
```java
                attributes {
                    attribute(Category.CATEGORY_ATTRIBUTE, Category.VERIFICATION)
                    attribute(VerificationType.VERIFICATION_TYPE_ATTRIBUTE, VerificationType.JACOCO_RESULTS)
                    attribute(ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE, ArtifactTypeDefinition.BINARY_DATA_TYPE)
                }
```

### UnstableApiUsage
'org.gradle.api.attributes.VerificationType' is marked unstable with @Incubating
in `build-logic/verification/src/main/kotlin/build-logic.jacoco-aggregate.gradle.kts`
#### Snippet
```java
                attributes {
                    attribute(Category.CATEGORY_ATTRIBUTE, Category.VERIFICATION)
                    attribute(VerificationType.VERIFICATION_TYPE_ATTRIBUTE, VerificationType.JACOCO_RESULTS)
                    attribute(ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE, ArtifactTypeDefinition.BINARY_DATA_TYPE)
                }
```

### UnstableApiUsage
'JACOCO_RESULTS' is declared in unstable interface 'org.gradle.api.attributes.VerificationType' marked with @Incubating
in `build-logic/verification/src/main/kotlin/build-logic.jacoco-aggregate.gradle.kts`
#### Snippet
```java
                attributes {
                    attribute(Category.CATEGORY_ATTRIBUTE, Category.VERIFICATION)
                    attribute(VerificationType.VERIFICATION_TYPE_ATTRIBUTE, VerificationType.JACOCO_RESULTS)
                    attribute(ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE, ArtifactTypeDefinition.BINARY_DATA_TYPE)
                }
```

### UnstableApiUsage
'BINARY_DATA_TYPE' is marked unstable with @Incubating
in `build-logic/verification/src/main/kotlin/build-logic.jacoco-aggregate.gradle.kts`
#### Snippet
```java
                    attribute(Category.CATEGORY_ATTRIBUTE, Category.VERIFICATION)
                    attribute(VerificationType.VERIFICATION_TYPE_ATTRIBUTE, VerificationType.JACOCO_RESULTS)
                    attribute(ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE, ArtifactTypeDefinition.BINARY_DATA_TYPE)
                }
            }
```

### UnstableApiUsage
'getReports()' is marked unstable with @Incubating
in `build-logic/verification/src/main/kotlin/build-logic.jacoco-aggregate.gradle.kts`
#### Snippet
```java
        }
    }
    reports.create<JacocoAggregateReportSpec>(JacocoAggregateReportSpec.CODE_COVERAGE_REPORT_NAME)
}

```

### UnstableApiUsage
'getReports()' is marked unstable with @Incubating
in `build-logic/verification/src/main/kotlin/build-logic.sonarqube-aggregate.gradle.kts`
#### Snippet
```java
plugins.withId("build-params.jacoco-aggregation") {
    val coverageReportTask =
        reporting.reports.named<JacocoAggregateReportSpec>(JacocoAggregateReportSpec.CODE_COVERAGE_REPORT_NAME)
            .flatMap { it.reportTask }
    val mergedCoverage =
```

### UnstableApiUsage
'consistentResolution(org.gradle.api.Action)' is marked unstable with @Incubating
in `build-logic/jvm/src/main/kotlin/build-logic.java.gradle.kts`
#### Snippet
```java
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
    consistentResolution {
        useCompileClasspathVersions()
    }
```

### UnstableApiUsage
'useCompileClasspathVersions()' is declared in unstable interface 'org.gradle.api.plugins.JavaResolutionConsistency' marked with @Incubating
in `build-logic/jvm/src/main/kotlin/build-logic.java.gradle.kts`
#### Snippet
```java
    targetCompatibility = JavaVersion.VERSION_1_8
    consistentResolution {
        useCompileClasspathVersions()
    }
}
```

### UnstableApiUsage
'org.gradle.language.jvm.tasks.ProcessResources' is declared in unstable package 'org.gradle.language.jvm.tasks' marked with @Incubating
in `build-logic/jvm/src/main/kotlin/build-logic.java.gradle.kts`
#### Snippet
```java
}

tasks.configureEach<ProcessResources> {
    filteringCharset = "UTF-8"
    eachFile {
```

## RuleId[id=UsePropertyAccessSyntax]
### UsePropertyAccessSyntax
Use of setter method instead of property access syntax
in `src/dist/build.gradle.kts`
#### Snippet
```java
    // So we use delay computation of source files
    setSource(sourceSets.map { set -> set.map { it.allJava } })
    setDestinationDir(file("$buildDir/docs/javadocAggregate"))
}

```

## RuleId[id=ConditionalBreakInInfiniteLoop]
### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `src/core/src/main/java/org/apache/jmeter/gui/action/AddThinkTimeBetweenEachStep.java`
#### Snippet
```java
        try {
            int index = 0;
            while(true) {
                if(index == parentNode.getChildCount()) {
                    break;
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/core/src/main/java/org/apache/jmeter/samplers/SampleResult.java`
#### Snippet
```java
                }
                // Check for quoted string
                if (charSet.startsWith("\"")||charSet.startsWith("\'")){ // $NON-NLS-1$
                    setDataEncoding(charSet.substring(1, charSet.length()-1)); // remove quotes
                } else {
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/ConversionUtils.java`
#### Snippet
```java
                if (charSet != null) {
                    // Remove quotes from charset name, see bug 55852
                    charSet = StringUtils.replaceChars(charSet, "\'\"", null);
                    charSet = charSet.trim();
                    if (charSet.length() > 0) {
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
        final int inDoubleQuote = 2;
        int state = normal;
        final StringTokenizer tok = new StringTokenizer(toProcess, "\"\' ", true);
        final ArrayList<String> result = new ArrayList<>();
        final StringBuilder current = new StringBuilder();
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
            switch (state) {
            case inQuote:
                if ("\'".equals(nextTok)) {
                    lastTokenHasBeenQuoted = true;
                    state = normal;
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
                break;
            default:
                if ("\'".equals(nextTok)) {
                    state = inQuote;
                } else if ("\"".equals(nextTok)) {
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/core/src/main/java/org/apache/jmeter/testelement/property/NullProperty.java`
#### Snippet
```java

    @Override
    public NullProperty clone() {
        return this;
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/core/src/main/java/org/apache/jmeter/testelement/AbstractTestElement.java`
#### Snippet
```java

    @Override
    public Object clone() {
        try {
            TestElement clonedElement = this.getClass().getDeclaredConstructor().newInstance();
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/jorphan/src/main/java/org/apache/jorphan/collections/ListedHashTree.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override
    public Object clone() {
        ListedHashTree newTree = new ListedHashTree();
        cloneTree(newTree);
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/jorphan/src/main/java/org/apache/jorphan/collections/HashTree.java`
#### Snippet
```java
     */
    @Override
    public Object clone() {
        HashTree newTree = new HashTree();
        cloneTree(newTree);
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/accesslog/SharedTCLogParser.java`
#### Snippet
```java
     */
    @Override
    public Object clone() {
        SharedTCLogParser parser = new SharedTCLogParser();
        parser.FILENAME = FILENAME;
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/accesslog/SessionFilter.java`
#### Snippet
```java
     */
    @Override
    public Object clone() {
        return new SessionFilter(cookieManagers, managersInUse);
    }
```

## RuleId[id=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/core/src/main/java/org/apache/jmeter/report/processor/graph/StatusSeriesSelector.java`
#### Snippet
```java
    public Iterable<String> select(Sample sample) {
        String label = sample.getSuccess() ? successLabel : failureLabel;
        return Arrays.asList(new String[] { label });
    }

```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/core/src/main/java/org/apache/jmeter/samplers/SampleSaveConfiguration.java`
#### Snippet
```java
    // The current order is derived from http://jmeter.apache.org/usermanual/listeners.html#csvlogformat
    // TODO this may not be the ideal order; fix further and update the screenshot(s)
    public static final List<String> SAVE_CONFIG_NAMES = Collections.unmodifiableList(Arrays.asList(new String[]{
        "AsXml",
        "FieldNames", // CSV
        "Timestamp",
        "Time", // elapsed
        "Label",
        "Code", // Response Code
        "Message", // Response Message
        "ThreadName",
        "DataType",
        "Success",
        "AssertionResultsFailureMessage",
        "Bytes",
        "SentBytes",
        "ThreadCounts", // grpThreads and allThreads
        "Url",
        "FileName",
        "Latency",
        "ConnectTime",
        "Encoding",
        "SampleCount", // Sample and Error Count
        "Hostname",
        "IdleTime",
        "RequestHeaders", // XML
        "SamplerData", // XML
        "ResponseHeaders", // XML
        "ResponseData", // XML
        "Subresults", // XML
        "Assertions", // XML
    }));
    // N.B. Remember to update the equals and hashCode methods when adding new variables.

```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/jorphan/src/main/java/org/apache/jorphan/reflect/ClassTools.java`
#### Snippet
```java
        Method m;
        try {
            m = ClassUtils.getPublicMethod(instance.getClass(), methodName, new Class [] {});
            m.invoke(instance, (Object [])null);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/launcher/src/main/java/org/apache/jmeter/NewDriver.java`
#### Snippet
```java
                Class<?> initialClass = loader.loadClass("org.apache.jmeter.JMeter");// $NON-NLS-1$
                Object instance = initialClass.getDeclaredConstructor().newInstance();
                Method startup = initialClass.getMethod("start", new Class[] { new String[0].getClass() });// $NON-NLS-1$
                startup.invoke(instance, new Object[] { args });
            } catch(Throwable e){ // NOSONAR We want to log home directory in case of exception
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/protocol/junit/src/main/java/org/apache/jmeter/protocol/java/sampler/JUnitSampler.java`
#### Snippet
```java
                try {
                    strCon = theclazz.getDeclaredConstructor(
                            new Class[] {String.class});
                    // we have to check and make sure the constructor is
                    // accessible. if we didn't it would throw an exception
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/protocol/junit/src/main/java/org/apache/jmeter/protocol/java/sampler/JUnitSampler.java`
#### Snippet
```java
                }
                try {
                    con = theclazz.getDeclaredConstructor(new Class[0]);
                    if (con != null){
                        params = new Object[]{};
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/protocol/junit/src/main/java/org/apache/jmeter/protocol/java/sampler/JUnitSampler.java`
#### Snippet
```java
                protectable = () -> {
                    try {
                        m.invoke(theClazz, new Object[0]);
                    } catch (InvocationTargetException e) {
                        /*
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/protocol/junit/src/main/java/org/apache/jmeter/protocol/java/sampler/JUnitSampler.java`
#### Snippet
```java
        if (clazz != null && method != null){
            try {
                return clazz.getClass().getMethod(method,new Class[0]);
            } catch (NoSuchMethodException e) {
                log.warn(e.getMessage());
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/protocol/junit/src/main/java/org/apache/jmeter/protocol/java/sampler/JUnitSampler.java`
#### Snippet
```java
            try {
                if (setUpMethod != null){
                    setUpMethod.invoke(this.testObject,new Object[0]);
                }
                sresult.sampleStart();
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/protocol/junit/src/main/java/org/apache/jmeter/protocol/java/sampler/JUnitSampler.java`
#### Snippet
```java
                sresult.sampleEnd();
                if (tearDownMethod != null){
                    tearDownMethod.invoke(testObject,new Object[0]);
                }
            } catch (InvocationTargetException e) {
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/components/src/main/java/org/apache/jmeter/visualizers/RenderAsCssJQuery.java`
#### Snippet
```java
            String message = MessageFormat.format(
                    JMeterUtils.getResString("cssjquery_tester_error") // $NON-NLS-1$
                    , new Object[]{cssJqueryField.getText(), ex.getMessage()});
            sb.append(message);
            return sb.toString();
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\\d]` can be simplified to '\\d'
in `src/core/src/main/java/org/apache/jmeter/gui/action/Save.java`
#### Snippet
```java
        // where {version} is a 6 digit number
        String backupPatternRegex = Pattern.quote(baseName + versionSeparator)
                + "([\\d]{6})" //$NON-NLS-1$
                + Pattern.quote(JMX_FILE_EXTENSION);
        Pattern backupPattern = Pattern.compile(backupPatternRegex);
```

### RegExpSimplifiable
`[;]` can be simplified to ';'
in `src/core/src/main/java/org/apache/jmeter/report/config/ReportGeneratorConfiguration.java`
#### Snippet
```java
        } else {
            // data looks like : sample(\d+):1000|2000;samples12:3000|4000;scenar01-12:5000|6000
            String[] parts = apdexPerTransaction.split("[;]");
            for (String chunk : parts) {
                int colonSeparator = chunk.lastIndexOf(':');
```

### RegExpSimplifiable
`\\p{Space}` can be simplified to '\\s'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/GraphQLRequestParamUtils.java`
#### Snippet
```java
    public static final String QUERY_FIELD = "query";

    private static final Pattern WHITESPACES_PATTERN = Pattern.compile("\\p{Space}+");

    private static final JsonFactory jsonFactory = new JsonFactory();
```

## RuleId[id=MoveLambdaOutsideParentheses]
### MoveLambdaOutsideParentheses
Lambda argument should be moved out of parentheses
in `src/dist/build.gradle.kts`
#### Snippet
```java
    outputs.file(actualLibs)
    doLast {
        val caseInsensitive: Comparator<String> = compareBy(String.CASE_INSENSITIVE_ORDER, { it })

        val deps = configurations.runtimeClasspath.get().resolvedConfiguration.resolvedArtifacts
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `postdata.substring(index + 1, postdata.length())`
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
                try {
                    return postdata.substring(0, index + 1) + URLEncoder
                            .encode(postdata.substring(index + 1, postdata.length()), StandardCharsets.UTF_8.name());
                } catch (UnsupportedEncodingException e) {
                    throw new IllegalArgumentException(
```

### DuplicateExpressions
Multiple occurrences of `postdata.substring(index + 1, postdata.length())`
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
                } catch (UnsupportedEncodingException e) {
                    throw new IllegalArgumentException(
                            postdata.substring(index + 1, postdata.length()) + " cannot be encoded", e);
                }
            }
```

### DuplicateExpressions
Multiple occurrences of `inputString.substring(startIndex + leftBoundaryLen, endIndex)`
in `src/components/src/main/java/org/apache/jmeter/extractor/BoundaryExtractor.java`
#### Snippet
```java
                found++;
                if (collectAll) {
                    matches.add(inputString.substring(startIndex + leftBoundaryLen, endIndex));
                } else if (found == matchNumber) {
                    return Collections.singletonList(inputString.substring(startIndex + leftBoundaryLen, endIndex));
```

### DuplicateExpressions
Multiple occurrences of `inputString.substring(startIndex + leftBoundaryLen, endIndex)`
in `src/components/src/main/java/org/apache/jmeter/extractor/BoundaryExtractor.java`
#### Snippet
```java
                    matches.add(inputString.substring(startIndex + leftBoundaryLen, endIndex));
                } else if (found == matchNumber) {
                    return Collections.singletonList(inputString.substring(startIndex + leftBoundaryLen, endIndex));
                }
            } else {
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder request` can be replaced with 'String'
in `src/protocol/bolt/src/main/java/org/apache/jmeter/protocol/bolt/sampler/BoltSampler.java`
#### Snippet
```java

    private String request() {
        StringBuilder request = new StringBuilder();
        request.append("Query: \n")
                .append(getCypher())
```

### StringBufferReplaceableByString
`StringBuilder out` can be replaced with 'String'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/HttpReplyHdr.java`
#### Snippet
```java
     */
    private static String formErrorBody(String error, String description) {
        StringBuilder out = new StringBuilder();
        // Generate Error Body
        out.append("<HTML><HEAD><TITLE>");
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("Request [compressed=");
            builder.append(compressed);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/Cookie.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder(80);
        sb.append(getDomain());
        // flag - if all machines within a given domain can access the variable.
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/CookieManager.java`
#### Snippet
```java

    private static String cookieToString(Cookie c){
        StringBuilder sb=new StringBuilder(80);
        sb.append(c.getDomain());
        //flag - if all machines within a given domain can access the variable.
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/protocol/jdbc/src/main/java/org/apache/jmeter/protocol/jdbc/config/DataSourceElement.java`
#### Snippet
```java

        if (log.isDebugEnabled()) {
            StringBuilder sb = new StringBuilder(40);
            sb.append("KeepAlive: ");
            sb.append(isKeepAlive());
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/protocol/jdbc/src/main/java/org/apache/jmeter/protocol/jdbc/config/DataSourceElement.java`
#### Snippet
```java
        String _username = getUsername();
        if (log.isDebugEnabled()) {
            StringBuilder sb = new StringBuilder(40);
            sb.append("Driver: ");
            sb.append(getDriver());
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/protocol/jdbc/src/main/java/org/apache/jmeter/protocol/jdbc/config/DataSourceElement.java`
#### Snippet
```java
        public String getConnectionInfo() {
            BasicDataSource dsc = getConfiguredDataSource();
            StringBuilder builder = new StringBuilder(100);
            builder.append("shared:").append(sharedDSC != null)
                .append(", driver:").append(dsc.getDriverClassName())
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/protocol/jdbc/src/main/java/org/apache/jmeter/protocol/jdbc/AbstractJDBCTestElement.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(80);
        sb.append("["); // $NON-NLS-1$
        sb.append(getQueryType());
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/components/src/main/java/org/apache/jmeter/control/ForeachController.java`
#### Snippet
```java
        JMeterContext context = getThreadContext();

        StringBuilder builder = new StringBuilder(
                getInputVal().length()+getSeparator().length()+3);
        String inputVariable =
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/components/src/main/java/org/apache/jmeter/control/ForeachController.java`
#### Snippet
```java
        }
        JMeterContext context = getThreadContext();
        StringBuilder builder = new StringBuilder(
                getInputVal().length()+getSeparator().length()+3);
        String inputVariable =
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/components/src/main/java/org/apache/jmeter/visualizers/ViewResultsFullVisualizer.java`
#### Snippet
```java
            int len = res.getResponseDataAsString().length();
            if (MAX_DISPLAY_SIZE > 0 && len > MAX_DISPLAY_SIZE) {
                StringBuilder builder = new StringBuilder(MAX_DISPLAY_SIZE + 100);
                builder.append(JMeterUtils.getResString("view_results_response_too_large_message")) //$NON-NLS-1$
                    .append(len).append(" > Max: ").append(MAX_DISPLAY_SIZE)
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/graphite/PickleGraphiteMetricsSender.java`
#### Snippet
```java
    @Override
    public void addMetric(long timestamp, String contextName, String metricName, String metricValue) {
        String name = new StringBuilder(50)
                .append(prefix)
                .append(contextName)
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/graphite/TextGraphiteMetricsSender.java`
#### Snippet
```java
    @Override
    public void addMetric(long timestamp, String contextName, String metricName, String metricValue) {
        String name = new StringBuilder(50)
                .append(prefix)
                .append(contextName)
```

### StringBufferReplaceableByString
`StringBuilder statsBuff` can be replaced with 'String'
in `src/components/src/main/java/org/apache/jmeter/visualizers/SamplerResultTab.java`
#### Snippet
```java
                setupTabPaneForAssertionResult();

                StringBuilder statsBuff = new StringBuilder(100);
                statsBuff
                        .append(JMeterUtils
```

### StringBufferReplaceableByString
`StringBuilder tag` can be replaced with 'String'
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/InfluxdbBackendListenerClient.java`
#### Snippet
```java
        UserMetric userMetrics = getUserMetrics();
        // For JMETER context
        StringBuilder tag = new StringBuilder(80);
        tag.append(TAG_APPLICATION).append(applicationName);
        tag.append(TAG_TRANSACTION).append("internal");
```

### StringBufferReplaceableByString
`StringBuilder field` can be replaced with 'String'
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/InfluxdbBackendListenerClient.java`
#### Snippet
```java
        tag.append(TAG_TRANSACTION).append("internal");
        tag.append(userTag);
        StringBuilder field = new StringBuilder(80);
        field.append(METRIC_MIN_ACTIVE_THREADS).append(userMetrics.getMinActiveThreads()).append(',');
        field.append(METRIC_MAX_ACTIVE_THREADS).append(userMetrics.getMaxActiveThreads()).append(',');
```

### StringBufferReplaceableByString
`StringBuilder tag` can be replaced with 'String'
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/InfluxdbBackendListenerClient.java`
#### Snippet
```java
            return;
        }
        StringBuilder tag = new StringBuilder(95);
        tag.append(TAG_APPLICATION).append(applicationName);
        tag.append(TAG_TRANSACTION).append(transaction);
```

### StringBufferReplaceableByString
`StringBuilder tag` can be replaced with 'String'
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/InfluxdbBackendListenerClient.java`
#### Snippet
```java
            return;
        }
        StringBuilder tag = new StringBuilder(70);
        tag.append(TAG_APPLICATION).append(applicationName);
        tag.append(TAG_TRANSACTION).append(transaction);
```

### StringBufferReplaceableByString
`StringBuilder field` can be replaced with 'String'
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/InfluxdbBackendListenerClient.java`
#### Snippet
```java
        tag.append(userTag);

        StringBuilder field = new StringBuilder(30);
        field.append(METRIC_COUNT).append(count);
        influxdbMetricsManager.addMetric(measurement, tag.toString(), field.toString());
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/core/src/main/java/org/apache/jmeter/util/XPathUtil.java`
#### Snippet
```java
                result.setFailure(true);
                result.setFailureMessage("Cannot understand: " + xPathExpression);
                return;
            }
        } catch (TransformerException e) {
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/core/src/main/java/org/apache/jmeter/engine/StandardJMeterEngine.java`
#### Snippet
```java
            JMeterUtils.reportErrorToUser("Error occurred starting thread group :" + group.getName()+ ", error message:"+ex.getMessage()
                +", \r\nsee log file for more details", ex);
            return; // no point continuing
        }
    }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
                this.cookieInHeaders = value;
            } else if (HEADERS_TO_IGNORE.contains(name)) {
                return;
            } else {
                if (UNIQUE_HEADERS.contains(name.toLowerCase(Locale.US))) {
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/components/src/main/java/org/apache/jmeter/visualizers/PropertyControlGui.java`
#### Snippet
```java
        if (SYSTEM.equals(command)){
            setUpData();
            return;
        }
        else if (JMETER.equals(command)){
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/components/src/main/java/org/apache/jmeter/visualizers/PropertyControlGui.java`
#### Snippet
```java
        else if (JMETER.equals(command)){
            setUpData();
            return;
        }

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/UdpMetricsSender.java`
#### Snippet
```java
            } catch (SocketException e) {
                log.error("Cannot open udp port!", e);
                return;
            } catch (IOException e) {
                log.error("Error in transferring udp package", e);
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `src/core/src/main/java/org/apache/jmeter/util/JsseSSLManager.java`
#### Snippet
```java
            String[] dCiphers = context.getSocketFactory().getDefaultCipherSuites();
            String[] sCiphers = context.getSocketFactory().getSupportedCipherSuites();
            int len = (dCiphers.length > sCiphers.length) ? dCiphers.length : sCiphers.length;
            for (int i = 0; i < len; i++) {
                if (i < dCiphers.length) {
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/SubscriberSampler.java`
#### Snippet
```java
        }
        long wait = until - now; // How much left
        return wait > DEFAULT_WAIT ? DEFAULT_WAIT : wait;
    }

```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`guiPackage != null ? guiPackage.isDirty() : false` can be simplified to 'guiPackage != null \&\& guiPackage.isDirty()'
in `src/core/src/main/java/org/apache/jmeter/gui/UndoHistory.java`
#### Snippet
```java
        GuiPackage guiPackage = GuiPackage.getInstance();
        //or maybe a Boolean?
        boolean dirty = guiPackage != null ? guiPackage.isDirty() : false;
        addEdit(new UndoHistoryItem(copy, comment, TreeState.from(guiPackage), dirty));

```

### SimplifiableConditionalExpression
`isNegated ? resultOfEval : !resultOfEval` can be simplified to 'isNegated == resultOfEval'
in `src/core/src/main/java/org/apache/jmeter/util/XPathUtil.java`
#### Snippet
```java
            case XObject.CLASS_BOOLEAN:
                boolean resultOfEval = xObject.bool();
                result.setFailure(isNegated ? resultOfEval : !resultOfEval);
                result.setFailureMessage(isNegated ?
                        "Nodes Matched for " + xPathExpression
```

### SimplifiableConditionalExpression
`isNegated ? resultOfEval : !resultOfEval` can be simplified to 'isNegated == resultOfEval'
in `src/core/src/main/java/org/apache/jmeter/util/XPathUtil.java`
#### Snippet
```java
                       resultOfEval = Boolean.parseBoolean(nodes.itemAt(0).getStringValue());
                   }
                   result.setFailure(isNegated ? resultOfEval : !resultOfEval);
                   result.setFailureMessage(
                           isNegated ? "Nodes Matched for " + xPathQuery : "No Nodes Matched for " + xPathQuery);
```

### SimplifiableConditionalExpression
`i < (tokens.size() - 1) ? true : endsWithSlash` can be simplified to 'i \< (tokens.size() - 1) \|\| endsWithSlash'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/ConversionUtils.java`
#### Snippet
```java
            // append '/' if this isn't the last token or it is but the original
            // path terminated w/ a '/'
            boolean appendSlash = i < (tokens.size() - 1) ? true : endsWithSlash;
            if (appendSlash) {
                newPath.append(SLASH);
```

### SimplifiableConditionalExpression
`binRes.getResult() != null ? binRes.getResult().isSuccessful():true` can be simplified to 'binRes.getResult()==null \|\| binRes.getResult().isSuccessful()'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java`
#### Snippet
```java
                        }
                        res.addSubResult(binRes.getResult());
                        setParentSampleSuccess(res, res.isSuccessful() && (binRes.getResult() != null ? binRes.getResult().isSuccessful():true));
                    }
                } catch (InterruptedException ie) {
```

### SimplifiableConditionalExpression
`notTest ? !found : found` can be simplified to 'notTest != found'
in `src/components/src/main/java/org/apache/jmeter/assertions/ResponseAssertion.java`
#### Snippet
```java
                    }
                }
                boolean pass = notTest ? !found : found;
                if (orTest) {
                    if (!pass) {
```

## RuleId[id=MismatchedStringBuilderQueryUpdate]
### MismatchedStringBuilderQueryUpdate
Contents of `StringBuilder sb` are updated, but never queried
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/JMSSampler.java`
#### Snippet
```java
    private void handleRead(JMeterContext context, SampleResult res) {
        LOGGER.debug("isRead");
        StringBuilder sb = new StringBuilder(75);
        res.setSuccessful(true);
        Sampler sampler = context.getPreviousSampler();
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/core/src/main/java/org/apache/jmeter/gui/util/TristateCheckBox.java`
#### Snippet
```java

/**
 * derived from: http://www.javaspecialists.eu/archive/Issue145.html
 */
public final class TristateCheckBox extends JCheckBox {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/core/src/main/java/org/apache/jmeter/gui/util/TristateCheckBox.java`
#### Snippet
```java

    /**
     * derived from: http://www.coderanch.com/t/342563/GUI/java/TriState-CheckBox
     */
    private static class TristateCheckBoxIcon implements Icon, UIResource, Serializable {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/core/src/main/java/org/apache/jmeter/gui/action/Restart.java`
#### Snippet
```java
/**
 * Restart JMeter
 * Based on https://dzone.com/articles/programmatically-restart-java
 * @since 5.0
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/core/src/main/java/org/apache/jmeter/samplers/SampleResult.java`
#### Snippet
```java

    /**
     * see https://bz.apache.org/bugzilla/show_bug.cgi?id=63055
     * @return true if TestPlan is in functional mode or property subresults.disable_renaming is true
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/jorphan/src/main/java/org/apache/jorphan/gui/MenuScroller.java`
#### Snippet
```java
 * Class is slightly changed as per comments on the webpage
 * @version 1.5.0 04/05/12
 * @author Darryl Burke (http://tips4java.wordpress.com/2009/02/01/menu-scroller/)
 */
public class MenuScroller {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/jorphan/src/main/java/org/apache/jorphan/util/AlphaNumericKeyComparator.java`
#### Snippet
```java
 * will be compared in a human readable fashion by trying to parse numbers that appear in
 * the keys as integers and compare those, too.<p>
 * Heavily influenced by https://codereview.stackexchange.com/questions/37192/number-aware-string-sorting-with-comparator
 */
public class AlphaNumericKeyComparator implements Comparator<Map.Entry<Object, Object>> {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/jorphan/src/main/java/org/apache/jorphan/util/AlphaNumericComparator.java`
#### Snippet
```java
 * will be compared in a human readable fashion by trying to parse numbers that appear in
 * the keys as integers and compare those, too.<p>
 * Heavily influenced by https://codereview.stackexchange.com/questions/37192/number-aware-string-sorting-with-comparator
 */
public class AlphaNumericComparator<T> implements Comparator<T> {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/jorphan/src/main/java/org/apache/jorphan/documentation/VisibleForTesting.java`
#### Snippet
```java
 *
 * Copy of this class under ASL license:
 * https://github.com/aosp-mirror/platform_frameworks_base/blob/master/core/java/com/android/internal/annotations/VisibleForTesting.java
 */
@Documented
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/api/auth/DigestParameters.java`
#### Snippet
```java
/**
 * Allows digest customization as per:
 * https://en.wikipedia.org/wiki/Digest_access_authentication
 *
 * @since 5.0
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/ConversionUtils.java`
#### Snippet
```java
    /**
     * collapses absolute or relative URLs containing '/..' converting
     * <code>http://host/path1/../path2</code> to <code>http://host/path2</code>
     * or <code>/one/two/../three</code> to
     * <code>/one/three</code>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/ConversionUtils.java`
#### Snippet
```java
    /**
     * collapses absolute or relative URLs containing '/..' converting
     * <code>http://host/path1/../path2</code> to <code>http://host/path2</code>
     * or <code>/one/two/../three</code> to
     * <code>/one/three</code>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/HttpRequestHdr.java`
#### Snippet
```java

    /**
     * Find the :PORT from http://server.ect:PORT/some/file.xxx
     *
     * @return server's port (or UNSPECIFIED if not found)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/HttpRequestHdr.java`
#### Snippet
```java

    /**
     * Find the /some/file.xxxx from http://server.ect:PORT/some/file.xxx
     *
     * @return the path
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/protocol/jdbc/src/main/java/org/apache/jmeter/protocol/jdbc/config/DataSourceElementBeanInfo.java`
#### Snippet
```java
    /**
     * Get the check queries for the main databases
     * Based in https://stackoverflow.com/questions/10684244/dbcp-validationquery-for-different-databases
     * @return a String[] with the list of check queries
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/functions/src/main/java/org/apache/jmeter/functions/TimeShift.java`
#### Snippet
```java
 * <ul>
 * <li>format date @see
 * https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
 * (optional - defaults to epoch time in millisecond)</li>
 * <li>date to shift formatted
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/components/src/main/java/org/apache/jmeter/config/CSVDataSetBeanInfo.java`
#### Snippet
```java
    /**
     * Get the mains file encoding
     * list from https://docs.oracle.com/javase/8/docs/technotes/guides/intl/encoding.doc.html
     * @return a String[] with the list of file encoding
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/components/src/main/java/org/apache/jmeter/timers/PoissonRandomTimer.java`
#### Snippet
```java
    }
    /**
     * see http://en.wikipedia.org/wiki/Poisson_distribution
     * @param lambda Lambda in Poisson
     * @return random
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/components/src/main/java/org/apache/jmeter/timers/PoissonRandomTimer.java`
#### Snippet
```java
    /**
     * Compute log factorial
     * http://www.johndcook.com/blog/2010/08/16/how-to-compute-log-factorial/
     * @param n Number for which we want log(n!)
     * @return Log factorial
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/components/src/main/java/org/apache/jmeter/timers/PoissonRandomTimer.java`
#### Snippet
```java

    /**
     * http://www.johndcook.com/blog/2010/06/14/generating-poisson-random-values/
     * @param lambda Lambda in Poisson
     * @return random
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/components/src/main/java/org/apache/jmeter/extractor/JSoupExtractor.java`
#### Snippet
```java
/**
 * JSoup based CSS/JQuery extractor
 * see http://jsoup.org/cookbook/extracting-data/selector-syntax
 * @since 2.9
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/components/src/main/java/org/apache/jmeter/extractor/JoddExtractor.java`
#### Snippet
```java
/**
 * Jodd-Lagerto based CSS/JQuery extractor
 * see http://jodd.org/doc/csselly/
 * @since 2.9
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/components/src/main/java/org/apache/jmeter/extractor/json/jsonpath/JSONManager.java`
#### Snippet
```java
/**
 * Handles the extractions
 * https://github.com/jayway/JsonPath/blob/master/json-path/src/test/java/com/jayway/jsonpath/ComplianceTest.java
 * @since 3.0
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/graphite/PickleGraphiteMetricsSender.java`
#### Snippet
```java
    }

    /** See: https://graphite.readthedocs.io/en/1.0.0/feeding-carbon.html */
    private static String convertMetricsToPickleFormat(List<MetricTuple> metrics) {
        StringBuilder pickled = new StringBuilder(metrics.size() * 75);
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/graphite/PickleGraphiteMetricsSender.java`
#### Snippet
```java
/**
 * Pickle Graphite format Partly based on
 * https://github.com/BrightcoveOS/metrics-graphite-pickle/blob/master/src/main/java/com/brightcove/metrics/reporting/GraphitePickleReporter.java
 * as per license
 * https://github.com/BrightcoveOS/metrics-graphite-pickle/blob/master/LICENSE.txt
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/graphite/PickleGraphiteMetricsSender.java`
#### Snippet
```java
 * https://github.com/BrightcoveOS/metrics-graphite-pickle/blob/master/src/main/java/com/brightcove/metrics/reporting/GraphitePickleReporter.java
 * as per license
 * https://github.com/BrightcoveOS/metrics-graphite-pickle/blob/master/LICENSE.txt
 *
 * @since 2.13
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/components/src/main/java/org/apache/jmeter/visualizers/SamplerResultTab.java`
#### Snippet
```java
    /**
     * Optimized way to set text based on :
     * http://javatechniques.com/blog/faster-jtextpane-text-insertion-part-i/
     * @param data String data
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/HttpMetricsSender.java`
#### Snippet
```java
     * client with a HttpPost request from influxdb url
     *
     * @param influxdbUrl   example : http://localhost:8086/write?db=myd&rp=one_week
     * @param influxDBToken example: my-token
     * @see InfluxdbMetricsSender#setup(String, String)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/HttpMetricsSender.java`
#### Snippet
```java
 * The Line Protocol is whitespace sensitive.
 * <p>
 * See https://docs.influxdata.com/influxdb/v1.7/write_protocols/line_protocol_tutorial/
 *
 * @since 3.2
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/InfluxdbBackendListenerClient.java`
#### Snippet
```java
     * Tags is put as InfluxdbTag for better query performance on it
     * Never double or single quotes in InfluxDB except for string field
     * see : https://docs.influxdata.com/influxdb/v1.7/write_protocols/line_protocol_reference/#quoting-special-characters-and-additional-naming-guidelines
     *
     * @param isStartOfTest boolean true for start, false for end
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/core/src/main/java/org/apache/jmeter/gui/MainFrame.java`
#### Snippet
```java

    /** An image which is displayed to indicate FATAL, ERROR or WARNING. */
    private final ImageIcon warningIcon = JMeterUtils.getImage("status/" + iconSize +"/pictogram-din-w000-general.png");// $NON-NLS-1$

    /** The button used to display the running/stopped image. */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/core/src/main/java/org/apache/jmeter/gui/MainFrame.java`
#### Snippet
```java

    /** The panel where the test tree is shown. */
    private JScrollPane treePanel;

    /** The LOG panel. */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/core/src/main/java/org/apache/jmeter/report/processor/ExternalSampleSorter.java`
#### Snippet
```java
    private final ThreadPoolExecutor pool;

    private final int nbProcessors;

    private boolean parallelize;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/core/src/main/java/org/apache/jmeter/testbeans/gui/EnumEditor.java`
#### Snippet
```java
    private final JComboBox<String> combo;

    private final DefaultComboBoxModel<String> model;

    private final int defaultIndex;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/core/src/main/java/org/apache/jmeter/testbeans/gui/GenericTestBeanCustomizer.java`
#### Snippet
```java

    @SuppressWarnings("unused") // TODO - use or remove
    private int scrollerCount = 0;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/core/src/main/java/org/apache/jmeter/testbeans/gui/ComboStringEditor.java`
#### Snippet
```java
    private final JComboBox<Object> combo;

    private final DefaultComboBoxModel<Object> model;

    /*
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/jorphan/src/main/java/org/apache/jorphan/gui/JLabeledChoice.java`
#### Snippet
```java

    private JButton delete;
    private JButton add;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/jorphan/src/main/java/org/apache/jorphan/gui/JLabeledChoice.java`
#### Snippet
```java
    private final ArrayList<ChangeListener> mChangeListeners = new ArrayList<>(3);

    private JButton delete;
    private JButton add;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/control/gui/JMSPropertiesPanel.java`
#### Snippet
```java
    private JTable jmsPropertiesTable;

    private JButton addButton;

    private JButton deleteButton;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/HTTPFileArgsPanel.java`
#### Snippet
```java

    /** A button for adding new files to the table. */
    private JButton add;

    /** A button for browsing file system to set path of selected row in table. */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/CookiePanel.java`
#### Snippet
```java
    private JCheckBox clearEachIteration;
    private JCheckBox controlledByThreadGroup;
    private JButton addButton;
    private JButton deleteButton;
    private JButton loadButton;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/CookiePanel.java`
#### Snippet
```java
    private JButton addButton;
    private JButton deleteButton;
    private JButton loadButton;
    private JButton saveButton;
    private JLabeledChoice policy;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/DNSCachePanel.java`
#### Snippet
```java

    private JPanel dnsHostsPanel;
    private JPanel dnsHostsButPanel;

    private JTable dnsServersTable;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/DNSCachePanel.java`
#### Snippet
```java
    private JPanel dnsServersPanel;

    private JPanel dnsServButPanel;

    private PowerTableModel dnsServersTableModel;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/DNSCachePanel.java`
#### Snippet
```java
    private JTable dnsHostsTable;

    private JPanel dnsHostsPanel;
    private JPanel dnsHostsButPanel;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/DNSCachePanel.java`
#### Snippet
```java
    private JTable dnsServersTable;

    private JPanel dnsServersPanel;

    private JPanel dnsServButPanel;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/AuthPanel.java`
#### Snippet
```java
    private JButton deleteButton;

    private JButton loadButton;

    private JButton saveButton;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/AuthPanel.java`
#### Snippet
```java
    private static class PasswordCellRenderer extends JPasswordField implements TableCellRenderer {
        private static final long serialVersionUID = 5169856333827579927L;
        private final Border myBorder;

        public PasswordCellRenderer() {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/AuthPanel.java`
#### Snippet
```java
    private JTable authTable;

    private JButton addButton;

    private JButton deleteButton;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/Daemon.java`
#### Snippet
```java

    /** The port to listen on. */
    private final int daemonPort;

    private final ServerSocket mainSocket;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/visualizers/RequestViewHTTP.java`
#### Snippet
```java
    private JTable tableParams = null;

    private JTable tableHeaders = null;

    // Request headers column renderers
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/visualizers/RequestViewHTTP.java`
#### Snippet
```java
            "view_results_table_request_headers_value" }; // $NON-NLS-1$

    private JTable tableRequest = null;

    private JTable tableParams = null;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/protocol/mail/src/main/java/org/apache/jmeter/protocol/smtp/sampler/gui/SecuritySettingsPanel.java`
#### Snippet
```java
    private JTextField tfTlsProtocolsToUse;

    private JLabel jlTlsProtocolsToUse;


```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/protocol/mail/src/main/java/org/apache/jmeter/protocol/smtp/sampler/gui/SecuritySettingsPanel.java`
#### Snippet
```java
    private JCheckBox cbUseLocalTrustStore;

    private JLabel jlTrustStoreToUse;

    private JTextField tfTrustStoreToUse;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/protocol/mail/src/main/java/org/apache/jmeter/protocol/smtp/sampler/gui/SecuritySettingsPanel.java`
#### Snippet
```java
    //--JMX attribute names

    private ButtonGroup bgSecuritySettings;

    private JRadioButton rbUseNone;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/protocol/mail/src/main/java/org/apache/jmeter/protocol/smtp/sampler/gui/SmtpPanel.java`
#### Snippet
```java

    private JPanel headerFieldsPanel;
    private JButton addHeaderFieldButton;
    private JLabel headerFieldName;
    private JLabel headerFieldValue;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/components/src/main/java/org/apache/jmeter/timers/poissonarrivals/ConstantPoissonProcessGenerator.java`
#### Snippet
```java
    // TODO: implement
    @SuppressWarnings("unused")
    private final int batchThreadDelay;
    private final DurationProvider durationProvider;
    private final boolean logFirstSamples;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/components/src/main/java/org/apache/jmeter/modifiers/gui/UserParametersGui.java`
#### Snippet
```java
    private JButton deleteColumnButton;
    private JButton moveRowUpButton;
    private JButton moveRowDownButton;

    private JCheckBox perIterationCheck;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/components/src/main/java/org/apache/jmeter/modifiers/gui/UserParametersGui.java`
#### Snippet
```java

    private JButton addParameterButton;
    private JButton addUserButton;
    private JButton deleteRowButton;
    private JButton deleteColumnButton;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/components/src/main/java/org/apache/jmeter/modifiers/gui/UserParametersGui.java`
#### Snippet
```java
    private static final int numUserColumns = 1;

    private JButton addParameterButton;
    private JButton addUserButton;
    private JButton deleteRowButton;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/components/src/main/java/org/apache/jmeter/modifiers/gui/UserParametersGui.java`
#### Snippet
```java
    private JButton deleteRowButton;
    private JButton deleteColumnButton;
    private JButton moveRowUpButton;
    private JButton moveRowDownButton;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/components/src/main/java/org/apache/jmeter/modifiers/gui/UserParametersGui.java`
#### Snippet
```java
    private JCheckBox perIterationCheck;

    private JPanel paramPanel;

    public UserParametersGui() {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/components/src/main/java/org/apache/jmeter/visualizers/TableVisualizer.java`
#### Snippet
```java
    private JTextField noSamplesField = null;

    private JScrollPane tableScrollPanel = null;

    private JCheckBox autoscroll = null;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/components/src/main/java/org/apache/jmeter/visualizers/TableVisualizer.java`
#### Snippet
```java
    private final transient Calculator calc = new Calculator();

    private final Format format = new SimpleDateFormat("HH:mm:ss.SSS"); //$NON-NLS-1$

    private final Deque<SampleResult> newRows = new ConcurrentLinkedDeque<>();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/components/src/main/java/org/apache/jmeter/visualizers/SummaryReport.java`
#### Snippet
```java
    private JTable myJTable;

    private JScrollPane myScrollPane;

    private final JButton saveTable =
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/components/src/main/java/org/apache/jmeter/visualizers/SummaryReport.java`
#### Snippet
```java
    private static final int REFRESH_PERIOD = JMeterUtils.getPropDefault("jmeter.gui.refresh_period", 500); // $NON-NLS-1$

    private JTable myJTable;

    private JScrollPane myScrollPane;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/components/src/main/java/org/apache/jmeter/visualizers/RenderAsXML.java`
#### Snippet
```java
        private static final long serialVersionUID = 6871690021183779153L;

        private JTree domJTree;
        private ExpandPopupMenu popupMenu;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/components/src/main/java/org/apache/jmeter/visualizers/ViewResultsFullVisualizer.java`
#### Snippet
```java
    private DefaultTreeModel treeModel;
    private JTree jTree;
    private Component leftSide;
    private JTabbedPane rightSide;
    private JComboBox<ResultRenderer> selectRenderPanel;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/components/src/main/java/org/apache/jmeter/visualizers/SamplerResultTab.java`
#### Snippet
```java
    private final ObjectTableModel resFieldsModel;

    private JTable tableResult = null;

    private JTable tableResHeaders = null;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/components/src/main/java/org/apache/jmeter/visualizers/SamplerResultTab.java`
#### Snippet
```java
    private JTable tableResHeaders = null;

    private JTable tableResFields = null;

    private JTabbedPane tabbedResult = null;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/components/src/main/java/org/apache/jmeter/visualizers/SamplerResultTab.java`
#### Snippet
```java
    private Object userObject = null; // Could be SampleResult or AssertionResult

    private SampleResult sampleResult = null;

    private AssertionResult assertionResult = null;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/components/src/main/java/org/apache/jmeter/visualizers/SamplerResultTab.java`
#### Snippet
```java
    private JTable tableResult = null;

    private JTable tableResHeaders = null;

    private JTable tableResFields = null;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/components/src/main/java/org/apache/jmeter/visualizers/SamplerResultTab.java`
#### Snippet
```java
    private JTabbedPane tabbedResult = null;

    private JScrollPane paneRaw = null;

    private JSplitPane paneParsed = null;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/components/src/main/java/org/apache/jmeter/visualizers/SamplerResultTab.java`
#### Snippet
```java
    private SampleResult sampleResult = null;

    private AssertionResult assertionResult = null;

    protected SearchTextExtension searchTextExtension;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java
    private AxisGraph graphPanel = null;

    private JPanel settingsPane = null;

    private JSplitPane spane = null;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java
    private static final int REFRESH_PERIOD = JMeterUtils.getPropDefault("jmeter.gui.refresh_period", 500);

    private JTable myJTable;

    private JScrollPane myScrollPane;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java
    private JTable myJTable;

    private JScrollPane myScrollPane;

    private final transient ObjectTableModel model;
```

## RuleId[id=ThrowablePrintedToSystemOut]
### ThrowablePrintedToSystemOut
'Throwable' argument `e` to 'System.out.println()' call
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
            }
        } catch (Exception e) {
            System.out.println(e);//NOSONAR
        } finally {
            socket.close();
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common parts with variables can be extracted from 'if'
in `src/components/src/main/java/org/apache/jmeter/assertions/CompareAssertion.java`
#### Snippet
```java
        }

        if (USE_JAVA_REGEX) {
            String result = content;
            for (SubstitutionElement element: stringsToSkip) {
```

## RuleId[id=InfiniteLoopStatement]
### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
        DatagramPacket request = new DatagramPacket(buf, buf.length);
        try {
            while(true) {
                socket.receive(request);
                InetAddress address = request.getAddress();
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `src/core/src/main/java/org/apache/jmeter/samplers/SampleResult.java`
#### Snippet
```java
            // Wait longer than a clock pulse (generally 10-15ms)
            getOffset(30L); // Catch an early clock pulse to reduce slop.
            while(true) {
                getOffset(NANOTHREAD_SLEEP); // Can now afford to wait a bit longer between checks
            }
```

## RuleId[id=JUnitMalformedDeclaration]
### JUnitMalformedDeclaration
Test class `AnnotatedTestCase` is not constructable because it does not have a 'public' no-arg or single 'String' parameter constructor
in `src/protocol/junit/src/main/java/org/apache/jmeter/protocol/java/sampler/JUnitSampler.java`
#### Snippet
```java
     *  TODO - work out how to convert JUnit4 assertions so they are treated as failures rather than errors
     */
    private class AnnotatedTestCase extends TestCase {
        private final Method method;
        private final Class<? extends Throwable> expectedException;
```

### JUnitMalformedDeclaration
Test class `AnnotatedTestCase` is not constructable because it is not 'public'
in `src/protocol/junit/src/main/java/org/apache/jmeter/protocol/java/sampler/JUnitSampler.java`
#### Snippet
```java
     *  TODO - work out how to convert JUnit4 assertions so they are treated as failures rather than errors
     */
    private class AnnotatedTestCase extends TestCase {
        private final Method method;
        private final Class<? extends Throwable> expectedException;
```

## RuleId[id=MemberVisibilityCanBePrivate]
### MemberVisibilityCanBePrivate
Function 'compareFiles' could be private
in `build-logic/batchtest/src/main/kotlin/org/apache/jmeter/buildtools/batchtest/BatchTest.kt`
#### Snippet
```java
        inputStream().use { AutoCRLFInputStream(it, false).readBytes() }

    fun compareFiles(summary: MutableList<String>, actualFile: File): Boolean {
        val actual = actualFile.readAsCrLf()
        val fileName = actualFile.name
```

## RuleId[id=KotlinUnusedImport]
### KotlinUnusedImport
Unused import directive
in `src/licenses/build.gradle.kts`
#### Snippet
```java
import com.github.vlsi.gradle.license.api.SpdxLicense
import com.github.vlsi.gradle.license.api.SpdxLicenseException
import com.github.vlsi.gradle.license.api.and
import com.github.vlsi.gradle.license.api.asExpression
import com.github.vlsi.gradle.license.api.with
```

### KotlinUnusedImport
Unused import directive
in `src/licenses/build.gradle.kts`
#### Snippet
```java
import com.github.vlsi.gradle.license.api.SpdxLicenseException
import com.github.vlsi.gradle.license.api.and
import com.github.vlsi.gradle.license.api.asExpression
import com.github.vlsi.gradle.license.api.with
import com.github.vlsi.gradle.release.Apache2LicenseRenderer
```

### KotlinUnusedImport
Unused import directive
in `src/licenses/build.gradle.kts`
#### Snippet
```java
import com.github.vlsi.gradle.license.api.and
import com.github.vlsi.gradle.license.api.asExpression
import com.github.vlsi.gradle.license.api.with
import com.github.vlsi.gradle.release.Apache2LicenseRenderer
import com.github.vlsi.gradle.release.ArtifactType
```

### KotlinUnusedImport
Unused import directive
in `src/licenses/build.gradle.kts`
#### Snippet
```java
import com.github.vlsi.gradle.release.ArtifactType
import com.github.vlsi.gradle.release.AsfLicenseCategory
import com.github.vlsi.gradle.release.ExtraLicense
import com.github.vlsi.gradle.release.dsl.dependencyLicenses
import com.github.vlsi.gradle.release.dsl.licensesCopySpec
```

### KotlinUnusedImport
Unused import directive
in `build-logic/jvm/src/main/kotlin/build-logic.test-base.gradle.kts`
#### Snippet
```java
import org.gradle.api.tasks.testing.Test
import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.kotlin.dsl.project

plugins {
```

### KotlinUnusedImport
Unused import directive
in `build-logic/verification/src/main/kotlin/build-logic.forbidden-apis.gradle.kts`
#### Snippet
```java
 */

import com.github.vlsi.gradle.dsl.configureEach
import de.thetaphi.forbiddenapis.gradle.CheckForbiddenApis

```

### KotlinUnusedImport
Unused import directive
in `build-logic/verification/src/main/kotlin/build-logic.forbidden-apis.gradle.kts`
#### Snippet
```java

import com.github.vlsi.gradle.dsl.configureEach
import de.thetaphi.forbiddenapis.gradle.CheckForbiddenApis

plugins {
```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing 'toArray'
in `src/core/src/main/java/org/apache/jmeter/functions/gui/FunctionHelper.java`
#### Snippet
```java
        functionList = new JLabeledChoice(JMeterUtils.getResString("choose_function"), //$NON-NLS-1$
                Arrays.stream(functionNames).map(
                        e -> e.substring(FUNCTION_PREFIX.length())).collect(Collectors.toList()).toArray(new String[0]));
        functionList.addChangeListener(this);
    }
```

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'equals()' call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java`
#### Snippet
```java
        public Credentials getCredentials(AuthScope authScope) {
            log.info("Get creds for {}", authScope);
            if (this.proxyAuthScope != null && authScope.equals(proxyAuthScope)) {
                return proxyCredentials;
            }
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `nameField != null` is always `true`
in `src/core/src/main/java/org/apache/jmeter/gui/NamePanel.java`
#### Snippet
```java
         * https://dev.eclipse.org/sonar/coding_rules#rule_key=squid%3AS1699
         */
        if (nameField != null) { // NOSONAR suppress warning as the null check is needed as per above
            return nameField.getText();
        }
```

### ConstantValue
Condition `pauseToCheckForRemainingThreads<=0` is always `true`
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
                daemon.setDaemon(true);
                daemon.start();
            } else if (pauseToCheckForRemainingThreads<=0) {
                log.debug("jmeter.exit.check.pause is <= 0, JMeter won't check for unterminated non-daemon threads");
            }
```

### ConstantValue
Condition `filename != null` is always `true`
in `src/core/src/main/java/org/apache/jmeter/gui/action/SaveGraphics.java`
#### Snippet
```java
        // the file extension.
        filename = chooser.getSelectedFile().getAbsolutePath();
        if (filename != null) {
            File f = new File(filename);
            if (f.exists()) {
```

### ConstantValue
Value `SSL_DISABLED` is always 'false'
in `src/core/src/main/java/org/apache/jmeter/rmi/RmiUtils.java`
#### Snippet
```java
        }
        if (StringUtils.isBlank(KEYSTORE_FILE)) {
            Validate.validState(SSL_DISABLED,
                    "No keystore for RMI over SSL specified. Set 'server.rmi.ssl.disable' to true, if this is intentional.");
            return new RMIServerSocketFactoryImpl(getRmiHost());
```

### ConstantValue
Value `SSL_DISABLED` is always 'false'
in `src/core/src/main/java/org/apache/jmeter/rmi/RmiUtils.java`
#### Snippet
```java
        }
        if (StringUtils.isBlank(KEYSTORE_FILE)) {
            Validate.validState(SSL_DISABLED,
                    "No keystore for RMI over SSL specified. Set 'server.rmi.ssl.disable' to true, if this is intentional,"
                    + "if not run create-rmi-keystore.bat/create-rmi-keystore.sh to create a keystore and distribute it on client and servers"
```

### ConstantValue
Condition `blue == temp2` is always `true`
in `src/core/src/main/java/org/apache/jmeter/util/ColorHelper.java`
#### Snippet
```java
            green += inc;
            green %= 256;
        } else if (blue == temp2) {
            blue += inc;
            blue %= 256;
```

### ConstantValue
Condition `event != null` is always `true`
in `src/core/src/main/java/org/apache/jmeter/save/CSVSaveService.java`
#### Snippet
```java
                lineNumber++;
                SampleEvent event = CSVSaveService.makeResultFromDelimitedString(parts, saveConfig, lineNumber);
                if (event != null) {
                    final SampleResult result = event.getResult();
                    if (ResultCollector.isSampleWanted(result.isSuccessful(),
```

### ConstantValue
Condition `r.hasNext()` is always `true`
in `src/core/src/main/java/org/apache/jmeter/report/processor/ExternalSampleSorter.java`
#### Snippet
```java
            } else if (l.hasNext()) {
                out.add(l.next());
            } else if (r.hasNext()) {
                out.add(r.next());
            }
```

### ConstantValue
Condition `sampleCount > 0` is always `true` when reached
in `src/core/src/main/java/org/apache/jmeter/samplers/BatchSampleSender.java`
#### Snippet
```java
                    this.batchSendTime = now + timeThresholdMs;
                }
                if (batchSendTime < now && sampleCount > 0) {
                    sendNow = true;
                }
```

### ConstantValue
Condition `myTotal != null` is always `true`
in `src/core/src/main/java/org/apache/jmeter/reporters/Summariser.java`
#### Snippet
```java

            // Only if we have updated them
            if (myTotal != null && myDelta != null &&myTotal.getNumSamples() != myDelta.getNumSamples()) { // NOSONAR
                formatAndWriteToLog(myName, myTotal, "=");
            }
```

### ConstantValue
Condition `myDelta != null` is always `true`
in `src/core/src/main/java/org/apache/jmeter/reporters/Summariser.java`
#### Snippet
```java

            // Only if we have updated them
            if (myTotal != null && myDelta != null &&myTotal.getNumSamples() != myDelta.getNumSamples()) { // NOSONAR
                formatAndWriteToLog(myName, myTotal, "=");
            }
```

### ConstantValue
Condition `javaHome != null` is always `true`
in `src/jorphan/src/main/java/org/apache/jorphan/exec/KeyToolUtils.java`
#### Snippet
```java
            if (!checkKeytool(keytoolPath)) { // Not found on PATH, check Java Home
                File javaHome = SystemUtils.getJavaHome();
                if (javaHome != null) {
                    keytoolPath = new File(new File(javaHome, "bin"), KEYTOOL).getPath(); // $NON-NLS-1$
                    if (!checkKeytool(keytoolPath)) {
```

### ConstantValue
Result of `currentPos + 1` is always '0'
in `src/jorphan/src/main/java/org/apache/jorphan/collections/Data.java`
#### Snippet
```java
        data = new HashMap<>();
        currentPos = -1;
        size = currentPos + 1;
    }

```

### ConstantValue
Condition `x == y` is always `false`
in `src/jorphan/src/main/java/org/apache/jorphan/collections/Data.java`
#### Snippet
```java
        }

        if (x == y) {
            x++;
        }
```

### ConstantValue
Value `readObject` is always 'null'
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/render/ObjectMessageRenderer.java`
#### Snippet
```java
      try {
          XStream xstream = JMeterUtils.createXStream();
          readObject = (Serializable) xstream.fromXML(xmlMessage, readObject);
      } catch (Exception e) {
          throw new IllegalStateException("Unable to load object instance from text", e);
```

### ConstantValue
Value `hasVariable` is always 'true'
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/render/ObjectMessageRenderer.java`
#### Snippet
```java
        Serializable value;
        if (hasVariable) {
            value = getInterpretedContent(filename, encoding, hasVariable, cache);
        } else {
            value = (Serializable) cache.get(filename, p -> getContent(filename));
```

### ConstantValue
Value `hasVariable` is always 'true'
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/render/BinaryMessageRenderer.java`
#### Snippet
```java

        if (hasVariable) {
            String stringValue = delegate.getValueFromFile(filename, encoding, hasVariable, cache);
            try {
                bytes = stringValue.getBytes(encoding);
```

### ConstantValue
Condition `charSet != null` is always `true`
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/ConversionUtils.java`
#### Snippet
```java
            if (charSetStartPos >= 0) {
                charSet = contentType.substring(charSetStartPos + CHARSET_EQ_LEN);
                if (charSet != null) {
                    // Remove quotes from charset name, see bug 55852
                    charSet = StringUtils.replaceChars(charSet, "\'\"", null);
```

### ConstantValue
Value `charSet` is always 'null'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/ConversionUtils.java`
#### Snippet
```java
            }
        }
        return charSet;
    }

```

### ConstantValue
Value `url` is always 'null'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/ConversionUtils.java`
#### Snippet
```java
    {
        if (url == null) {
            return url;
        }

```

### ConstantValue
Result of `k >>> 4` is always '0'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/Base64Encoder.java`
#### Snippet
```java
            int k = 0;
            out.append(String.valueOf(pem_array[b1 >>> 2 & 63]));
            out.append(String.valueOf(pem_array[(b1 << 4 & 48) + (k >>> 4 & 15)]));
            out.append(String.valueOf(EQ));
            out.append(String.valueOf(EQ));
```

### ConstantValue
Result of `k >>> 4 & 15` is always '0'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/Base64Encoder.java`
#### Snippet
```java
            int k = 0;
            out.append(String.valueOf(pem_array[b1 >>> 2 & 63]));
            out.append(String.valueOf(pem_array[(b1 << 4 & 48) + (k >>> 4 & 15)]));
            out.append(String.valueOf(EQ));
            out.append(String.valueOf(EQ));
```

### ConstantValue
Result of `l >>> 6` is always '0'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/Base64Encoder.java`
#### Snippet
```java
            out.append(String.valueOf(pem_array[b2 >>> 2 & 63]));
            out.append(String.valueOf(pem_array[(b2 << 4 & 48) + (b4 >>> 4 & 15)]));
            out.append(String.valueOf(pem_array[(b4 << 2 & 60) + (l >>> 6 & 3)]));
            out.append(String.valueOf(EQ));
            return out.toString();
```

### ConstantValue
Result of `l >>> 6 & 3` is always '0'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/Base64Encoder.java`
#### Snippet
```java
            out.append(String.valueOf(pem_array[b2 >>> 2 & 63]));
            out.append(String.valueOf(pem_array[(b2 << 4 & 48) + (b4 >>> 4 & 15)]));
            out.append(String.valueOf(pem_array[(b4 << 2 & 60) + (l >>> 6 & 3)]));
            out.append(String.valueOf(EQ));
            return out.toString();
```

### ConstantValue
Condition `acceptCharSet != null` is always `true`
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/FormCharSetFinder.java`
#### Snippet
```java
                String acceptCharSet = element.attr("accept-charset");
                // Check if we found an accept-charset attribute on the form
                if (acceptCharSet != null) {
                    String[] charSets = JOrphanUtils.split(acceptCharSet, ",");
                    // Just use the first one of the possible many charsets
```

### ConstantValue
Value `result` is always 'null'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/Proxy.java`
#### Snippet
```java
                            port, url,ioe.getMessage());
                    // Generate result (if nec.) and populate it
                    result = generateErrorResult(result, request, ioe, "\n**ensure browser is set to accept the JMeter proxy certificate**");
                    throw new JMeterException(); // hack to skip processing
                }
```

### ConstantValue
Condition `children != null` is always `true`
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/JTidyHTMLParser.java`
#### Snippet
```java

            NodeList children = node.getChildNodes();
            if (children != null) {
                int len = children.getLength();
                for (int i = 0; i < len; i++) {
```

### ConstantValue
Condition `styleTagStr != null` is always `true`
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/JsoupBasedHtmlParser.java`
#### Snippet
```java
            // Now look for URLs in the STYLE attribute
            String styleTagStr = tag.attr(ATT_STYLE);
            if(styleTagStr != null) {
                HtmlParsingUtils.extractStyleURLs(baseUrl.url, urls, styleTagStr);
            }
```

### ConstantValue
Value `selectName` is always 'null'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/HtmlParsingUtils.java`
#### Snippet
```java
        // TODO: migrate to ArrayDequeue
        LinkedList<HTTPSamplerBase> urlConfigs = new LinkedList<>();
        recurseForm(doc, urlConfigs, context, selectName, false);
        return urlConfigs;
    }
```

### ConstantValue
Condition `retry >= MAX_CONN_RETRIES` is always `false`
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPJavaImpl.java`
#### Snippet
```java
                    break;
                } catch (BindException e) {
                    if (retry >= MAX_CONN_RETRIES) {
                        log.error("Can't connect after {} retries, message: {}", retry, e.toString());
                        throw e;
```

### ConstantValue
Value `expires` is always 'null'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/CacheManager.java`
#### Snippet
```java

        } else if (expires == null) { // No max-age && No expires
            return calcExpiresDate(lastModified, cacheControl, expires, etag,
                    url, date);
        }
```

### ConstantValue
Condition `client != null` is always `true`
in `src/protocol/java/src/main/java/org/apache/jmeter/protocol/java/config/gui/JavaConfigGui.java`
#### Snippet
```java
                    .getDeclaredConstructor().newInstance();
            // Just to use client
            return client != null;
        } catch (Exception ex) {
            log.error("Error creating class:'{}' in JavaSampler {}"
```

### ConstantValue
Value `this.hasProxy` is always 'true'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java`
#### Snippet
```java
                }
                return
                this.hasProxy == other.hasProxy &&
                this.proxyPort == other.proxyPort &&
                this.proxyHost.equals(other.proxyHost) &&
```

### ConstantValue
Value `this.hasProxy` is always 'false'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java`
#### Snippet
```java
            // No proxy, so don't check proxy fields
            return
                this.hasProxy == other.hasProxy &&
                this.target.equals(other.target);
        }
```

### ConstantValue
Condition `con != null` is always `true`
in `src/protocol/junit/src/main/java/org/apache/jmeter/protocol/java/sampler/JUnitSampler.java`
#### Snippet
```java
                try {
                    con = theclazz.getDeclaredConstructor(new Class[0]);
                    if (con != null){
                        params = new Object[]{};
                    }
```

### ConstantValue
Condition `4 == four` is always `true`
in `src/protocol/junit-sample/src/main/java/test/DummyAnnotatedTest.java`
#### Snippet
```java
        }
        //or if you have assertions enabled
        assert 4 == four;
    }

```

### ConstantValue
Condition `te instanceof Controller` is always `true`
in `src/components/src/main/java/org/apache/jmeter/control/gui/ModuleControllerGui.java`
#### Snippet
```java
                    parent.add(newNode);
                    buildTreeNodeModel(cur, level + 1, newNode);
                    final boolean isController = te instanceof Controller
                            && !(te instanceof ModuleController
                                    || te instanceof AbstractThreadGroup);
```

### ConstantValue
Condition `te instanceof ModuleController` is always `false` when reached
in `src/components/src/main/java/org/apache/jmeter/control/gui/ModuleControllerGui.java`
#### Snippet
```java
                    buildTreeNodeModel(cur, level + 1, newNode);
                    final boolean isController = te instanceof Controller
                            && !(te instanceof ModuleController
                                    || te instanceof AbstractThreadGroup);
                    hasAtLeastOneController =
```

### ConstantValue
Value `invert` is always 'false'
in `src/components/src/main/java/org/apache/jmeter/assertions/jmespath/JMESPathAssertion.java`
#### Snippet
```java
        if (!invert) {
            if (!success) {
                failAssertion(invert, assertionResult);
            }
        } else {
```

### ConstantValue
Value `invert` is always 'true'
in `src/components/src/main/java/org/apache/jmeter/assertions/jmespath/JMESPathAssertion.java`
#### Snippet
```java
        } else {
            if (success) {
                failAssertion(invert, assertionResult);
            }
        }
```

### ConstantValue
Condition `text != null` is always `true`
in `src/components/src/main/java/org/apache/jmeter/visualizers/XMLDefaultMutableTreeNode.java`
#### Snippet
```java
    private static void initTextNode(Text node, DefaultMutableTreeNode mTreeNode) throws SAXException {
        String text = node.getNodeValue().trim();
        if (text != null && text.length() > 0) {
            XMLDefaultMutableTreeNode textNode = new XMLDefaultMutableTreeNode(text, node);
            mTreeNode.add(textNode);
```

### ConstantValue
Condition `!copyMetrics.isEmpty()` is always `true`
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/UdpMetricsSender.java`
#### Snippet
```java
        final List<MetricTuple> copyMetrics = tempMetrics;

        if (!copyMetrics.isEmpty()) {
            StringBuilder sb = new StringBuilder(copyMetrics.size() * 35);
            for (MetricTuple metric : copyMetrics) {
```

## RuleId[id=DivideByZero]
### DivideByZero
Division by zero
in `src/protocol/junit-sample/src/main/java/test/DummyAnnotatedTest.java`
#### Snippet
```java
    public void divideByZero() {
        @SuppressWarnings("unused")
        int i = 27 / 0; // will generate Divide by zero error
    }

```

### DivideByZero
Division by zero
in `src/protocol/junit-sample/src/main/java/woolfel/DummyTestCase.java`
#### Snippet
```java
    public void testException() {
        @SuppressWarnings("unused")
        int i = 27 / 0; // will generate Divide by zero error
    }

```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/jorphan/src/main/java/org/apache/jorphan/collections/HashTree.java`
#### Snippet
```java
        @Override
        public void subtractNode() {
            string.append("\n" + getSpaces() + "}");
            depth--;
        }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/Utils.java`
#### Snippet
```java
            sb.append("JMSDestination   ").append(msg.getJMSDestination()).append('\n');
        } catch (JMSException e) {
            sb.append("\nError: "+e.toString());
        }
        return sb;
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/Utils.java`
#### Snippet
```java
            }
        } catch (JMSException e) {
            sb.append("\nError: "+e.toString());
        }
        return sb;
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/SubscriberSampler.java`
#### Snippet
```java
                } else if (msg instanceof BytesMessage){
                    BytesMessage bytesMessage = (BytesMessage) msg;
                    buffer.append(bytesMessage.getBodyLength() + " bytes received in BytesMessage");
                } else if (msg instanceof MapMessage){
                    MapMessage mapm = (MapMessage) msg;
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/JMSSampler.java`
#### Snippet
```java
                } else if (msg instanceof BytesMessage) {
                    BytesMessage bytesMessage = (BytesMessage) msg;
                    buffer.append(bytesMessage.getBodyLength() + " bytes received in BytesMessage");
                } else if (msg instanceof MapMessage) {
                    MapMessage mapm = (MapMessage) msg;
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/JMSSampler.java`
#### Snippet
```java
                Utils.messageProperties(propBuffer, msg);
            } catch (JMSException e) {
                buffer.append("Error extracting content from message:"+e.getMessage());
                LOGGER.error("Error extracting content from message", e);
            }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/action/ParseCurlCommandAction.java`
#### Snippet
```java
        if (!request.getOptionsIgnored().isEmpty()) {
            for (String s : request.getOptionsIgnored()) {
                commentText.append("--"+s + " ");
            }
            commentText.append("ignoring; ");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/action/ParseCurlCommandAction.java`
#### Snippet
```java
        if (!request.getOptionsInProperties().isEmpty()) {
            for (String s : request.getOptionsInProperties()) {
                commentText.append(s + " ");
            }
            commentText.append("configure in jmeter.properties ");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/action/ParseCurlCommandAction.java`
#### Snippet
```java
        }
        if (request.getLimitRate() != 0) {
            commentText.append(
                    "Please configure the limit rate in 'httpclient.socket.http.cps' of 'jmeter.properties(374 line), the value is "
                            + request.getLimitRate() + ";");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/action/ParseCurlCommandAction.java`
#### Snippet
```java
        if (!request.getOptionsNoSupport().isEmpty()) {
            for (String s : request.getOptionsNoSupport()) {
                commentText.append("--"+s + " ");
            }
            commentText.append("not supported; ");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/components/src/main/java/org/apache/jmeter/visualizers/SamplerResultTab.java`
#### Snippet
```java
                statsBuff.append(NL);
                statsBuff
                        .append(typeResult + " " //$NON-NLS-1$
                                + JMeterUtils
                                        .getResString("view_results_fields"))
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/influxdb/UdpMetricsSender.java`
#### Snippet
```java
                // )
                sb.append(metric.measurement).append(metric.tag).append(" ") //$NON-NLS-1$
                    .append(metric.field).append(" ").append(metric.timestamp + "000000").append("\n"); //$NON-NLS-3$
            }

```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/core/src/main/java/org/apache/jmeter/gui/tree/JMeterTreeNode.java`
#### Snippet
```java
     */
    public List<JMeterTreeNode> getPathToThreadGroup() {
        if (!treeModel.isPresent()) {
            return new ArrayList<>();
        }
```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java`
#### Snippet
```java
        HTTPFileArgs fileArgs = new HTTPFileArgs();
        // Weed out the empty files
        if (files.length > 0) {
            for (HTTPFileArg file : files) {
                if (file.isNotEmpty()) {
```

## RuleId[id=InjectedReferences]
### InjectedReferences
Unknown encoding: ''
in `src/core/src/main/java/org/apache/jmeter/save/SaveService.java`
#### Snippet
```java
    private static String fileVersion = ""; // computed from saveservice.properties file// $NON-NLS-1$

    private static String fileEncoding = ""; // read from properties file// $NON-NLS-1$

    static {
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'getDeclaredConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `src/core/src/main/java/org/apache/jmeter/save/converters/TestElementPropertyConverter.java`
#### Snippet
```java
            String element = reader.getAttribute(ConversionHelp.ATT_ELEMENT_TYPE);
            boolean isHeader = HEADER_CLASSNAME.equals(element);
            prop.setObjectValue(mapper().realClass(element).getDeclaredConstructor().newInstance());// Always decode
            TestElement te = (TestElement)prop.getObjectValue();
            // No need to check version, just process the attributes if present
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.apache.commons.lang3.tuple.MutableTriple'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java`
#### Snippet
```java
        Map<String, Object> samplerContext = JMeterContextService.getContext().getSamplerContext();
        if(concurrentDwn) {
            triple = (MutableTriple<CloseableHttpClient, AuthState, PoolingHttpClientConnectionManager>)
                    samplerContext.get(CONTEXT_ATTRIBUTE_PARENT_SAMPLE_CLIENT_STATE);
        }
        if (triple == null) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.bouncycastle.cms.SignerId' to 'org.bouncycastle.util.Selector'
in `src/components/src/main/java/org/apache/jmeter/assertions/SMIMEAssertion.java`
#### Snippet
```java

                SignerInformation signer = (SignerInformation) signerIt.next();
                Iterator<?> certIt = certs.getMatches(signer.getSID()).iterator();

                if (certIt.hasNext()) {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `addEdit` may produce `NullPointerException`
in `src/core/src/main/java/org/apache/jmeter/gui/UndoHistory.java`
#### Snippet
```java
    private void addEdit(UndoableEdit edit) {
        if (isTransaction()) {
            transactions.peek().addEdit(edit);
            //XXX: Add sanity checks for transactions depth and number of edits?
        } else {
```

### DataFlowIssue
Method invocation `getImage` may produce `NullPointerException`
in `src/core/src/main/java/org/apache/jmeter/gui/MainFrame.java`
#### Snippet
```java
        GuiPackage.getInstance().registerAsListener();
        setTitle(DEFAULT_TITLE);
        setIconImage(JMeterUtils.getImage("icon-apache.png").getImage());// $NON-NLS-1$
        setWindowTitle(); // define AWT WM_CLASS string
        refreshErrorsTimer.start();
```

### DataFlowIssue
Method invocation `clearGui` may produce `NullPointerException`
in `src/core/src/main/java/org/apache/jmeter/gui/tree/JMeterTreeModel.java`
#### Snippet
```java
            guiPackage.updateCurrentNode();
            JMeterGUIComponent guicomp = guiPackage.getGui(component);
            guicomp.clearGui();
            guicomp.configure(component);
            guicomp.modifyTestElement(component);
```

### DataFlowIssue
Method invocation `getDocAnchor` may produce `NullPointerException`
in `src/core/src/main/java/org/apache/jmeter/gui/tree/JMeterTreeNode.java`
#### Snippet
```java

    public String getDocAnchor() {
        return GuiPackage.getInstance().getGui((TestElement) getUserObject()).getDocAnchor();
    }

```

### DataFlowIssue
Method invocation `createPopupMenu` may produce `NullPointerException`
in `src/core/src/main/java/org/apache/jmeter/gui/tree/JMeterTreeNode.java`
#### Snippet
```java
    public JPopupMenu createPopupMenu() {
        try {
            return GuiPackage.getInstance().getGui(getTestElement()).createPopupMenu();
        } catch (Exception e) {
            log.error("Can't get popup menu for gui", e);
```

### DataFlowIssue
Method invocation `getMenuCategories` may produce `NullPointerException`
in `src/core/src/main/java/org/apache/jmeter/gui/tree/JMeterTreeNode.java`
#### Snippet
```java
    public Collection<String> getMenuCategories() {
        try {
            return GuiPackage.getInstance().getGui(getTestElement()).getMenuCategories();
        } catch (Exception e) {
            log.error("Can't get popup menu for gui", e);
```

### DataFlowIssue
Method invocation `getStaticLabel` may produce `NullPointerException`
in `src/core/src/main/java/org/apache/jmeter/gui/tree/JMeterTreeNode.java`
#### Snippet
```java

    public String getStaticLabel() {
        return GuiPackage.getInstance().getGui((TestElement) getUserObject()).getStaticLabel();
    }

```

### DataFlowIssue
Argument `name` might be null
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
            case PROPFILE2_OPT: // Bug 33920 - allow multiple props
                log.info("Loading additional properties from: {}", name);
                try (FileInputStream fis = new FileInputStream(new File(name))){
                    Properties tmp = new Properties();
                    tmp.load(fis);
```

### DataFlowIssue
Argument `name` might be null
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
            case SYSTEM_PROPFILE:
                log.info("Setting System properties from file: {}", name);
                try (FileInputStream fis = new FileInputStream(new File(name))){
                    System.getProperties().load(fis);
                } catch (IOException e) { // NOSONAR
```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
                break;
            case SYSTEM_PROPERTY:
                if (value.length() > 0) { // Set it
                    log.info("Setting System property: {}={}", name, value);
                    System.getProperties().setProperty(name, value);
```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
                break;
            case JMETER_PROPERTY:
                if (value.length() > 0) { // Set it
                    log.info("Setting JMeter property: {}={}", name, value);
                    jmeterProps.setProperty(name, value);
```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
                break;
            case JMETER_GLOBAL_PROP:
                if (value.length() > 0) { // Set it
                    log.info("Setting Global property: {}={}", name, value);
                    remoteProps.setProperty(name, value);
```

### DataFlowIssue
Argument `name` might be null
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
                    remoteProps.setProperty(name, value);
                } else {
                    File propFile = new File(name);
                    if (propFile.canRead()) {
                        log.info("Setting Global properties from the file {}", name);
```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
                break;
            case LOGLEVEL:
                if (value.length() > 0) { // Set category
                    log.info("LogLevel: {}={}", name, value);
                    final Level logLevel = Level.getLevel(value);
```

### DataFlowIssue
Method invocation `startsWith` may produce `NullPointerException`
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
                    if (logLevel != null) {
                        String loggerName = name;
                        if (name.startsWith("jmeter") || name.startsWith("jorphan")) {
                            loggerName = PACKAGE_PREFIX + name;
                        }
```

### DataFlowIssue
Argument `name` might be null
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
                } else { // Set root level
                    log.warn("LogLevel: {}", name);
                    final Level logLevel = Level.getLevel(name);
                    if (logLevel != null) {
                        Configurator.setRootLevel(logLevel);
```

### DataFlowIssue
Method invocation `setEnabled` may produce `NullPointerException`
in `src/core/src/main/java/org/apache/jmeter/gui/action/EnableComponent.java`
#### Snippet
```java
        for (JMeterTreeNode node : nodes) {
            node.setEnabled(enable);
            pack.getGui(node.getTestElement()).setEnabled(enable);
        }
    }
```

### DataFlowIssue
Method invocation `setEnabled` may produce `NullPointerException`
in `src/core/src/main/java/org/apache/jmeter/gui/action/EnableComponent.java`
#### Snippet
```java
            boolean enable = !node.isEnabled();
            node.setEnabled(enable);
            pack.getGui(node.getTestElement()).setEnabled(enable);
        }
    }
```

### DataFlowIssue
Method invocation `getLabelResource` may produce `NullPointerException`
in `src/core/src/main/java/org/apache/jmeter/gui/action/ChangeParent.java`
#### Snippet
```java
        Controller currentController = (Controller) currentNode.getUserObject();
        JMeterGUIComponent currentGui = guiPackage.getCurrentGui();
        String defaultName = JMeterUtils.getResString(currentGui.getLabelResource());
        if(StringUtils.isNotBlank(currentController.getName())
                && !currentController.getName().equals(defaultName)){
```

### DataFlowIssue
Method invocation `getRootPane` may produce `NullPointerException`
in `src/core/src/main/java/org/apache/jmeter/gui/action/SaveGraphics.java`
#### Snippet
```java
        if (e.getActionCommand().equals(ActionNames.SAVE_GRAPHICS_ALL)) {
            JMeterGUIComponent component = GuiPackage.getInstance().getCurrentGui();
            JComponent comp = ((JComponent) component).getRootPane();
            saveImage(comp);
        }
```

### DataFlowIssue
The call to 'validState' always fails, according to its method contracts
in `src/core/src/main/java/org/apache/jmeter/rmi/RmiUtils.java`
#### Snippet
```java
        }
        if (StringUtils.isBlank(KEYSTORE_FILE)) {
            Validate.validState(SSL_DISABLED,
                    "No keystore for RMI over SSL specified. Set 'server.rmi.ssl.disable' to true, if this is intentional.");
            return new RMIServerSocketFactoryImpl(getRmiHost());
```

### DataFlowIssue
The call to 'validState' always fails, according to its method contracts
in `src/core/src/main/java/org/apache/jmeter/rmi/RmiUtils.java`
#### Snippet
```java
        }
        if (StringUtils.isBlank(KEYSTORE_FILE)) {
            Validate.validState(SSL_DISABLED,
                    "No keystore for RMI over SSL specified. Set 'server.rmi.ssl.disable' to true, if this is intentional,"
                    + "if not run create-rmi-keystore.bat/create-rmi-keystore.sh to create a keystore and distribute it on client and servers"
```

### DataFlowIssue
`null` is returned by the method declared as @NotNull
in `src/core/src/main/java/org/apache/jmeter/util/JMeterTreeNodeTransferable.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `src/jorphan/src/main/java/org/apache/jorphan/gui/JLabeledChoice.java`
#### Snippet
```java
            String item = (String) choiceList.getSelectedItem();
            int index = choiceList.getSelectedIndex();
            if (!item.equals(choiceList.getItemAt(index))) {
                choiceList.addItem(item);
            }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/jorphan/src/main/java/org/apache/jorphan/util/Converter.java`
#### Snippet
```java
            convertedValue = ""; // TODO should we allow null for non-primitive types?
        } else if (toType.isAssignableFrom(value.getClass())) {
            convertedValue = value;
        } else if (toType.equals(float.class) || toType.equals(Float.class)) {
            convertedValue = getFloat(value);
```

### DataFlowIssue
Method invocation `getClass` may produce `NullPointerException`
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/control/gui/JMSPropertiesPanel.java`
#### Snippet
```java
        @Override
        public Class<?> getColumnClass(int column) {
            return getValueAt(0, column).getClass();
        }

```

### DataFlowIssue
Variable is already assigned to this value
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/JMSSampler.java`
#### Snippet
```java
                LOGGER.debug("Failed parsing number of samples to aggregate");
            }
            val = 1;
        }
        if (val < 1) {
```

### DataFlowIssue
Variable is already assigned to this value
in `src/protocol/bolt/src/main/java/org/apache/jmeter/protocol/bolt/sampler/BoltSampler.java`
#### Snippet
```java
                    StandardCharsets.UTF_8.name());
        } catch (Exception ex) {
            res = handleException(res, ex);
        } finally {
            res.sampleEnd();
```

### DataFlowIssue
Method invocation `getClass` may produce `NullPointerException`
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/HeaderPanel.java`
#### Snippet
```java
        @Override
        public Class<?> getColumnClass(int column) {
            return getValueAt(0, column).getClass();
        }

```

### DataFlowIssue
Method invocation `getClass` may produce `NullPointerException`
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/gui/AuthPanel.java`
#### Snippet
```java
        @Override
        public Class<?> getColumnClass(int column) {
            return getValueAt(0, column).getClass();
        }

```

### DataFlowIssue
Method invocation `indexOf` may produce `NullPointerException`
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
                } else if (option.getDescriptor().getId() == HEADER_OPT) {
                    String nameAndValue = option.getArgument(0);
                    int indexOfColon = nameAndValue.indexOf(':');
                    if (indexOfColon >= 0) {
                        String name = nameAndValue.substring(0, indexOfColon).trim();
```

### DataFlowIssue
Method invocation `indexOf` may produce `NullPointerException`
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
                } else if (FORMS_OPT.contains(option.getDescriptor().getId())) {
                    String nameAndValue = option.getArgument(0);
                    int indexOfEqual = nameAndValue.indexOf('=');
                    String key = nameAndValue.substring(0, indexOfEqual).trim();
                    String value = nameAndValue.substring(indexOfEqual + 1).trim();
```

### DataFlowIssue
Argument `value` might be null
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
                } else if (option.getDescriptor().getId() == CONNECT_TIMEOUT_OPT) {
                    String value = option.getArgument(0);
                    request.setConnectTimeout(Double.parseDouble(value) * 1000);
                } else if (option.getDescriptor().getId() == COOKIE_OPT) {
                    String value = option.getArgument(0);
```

### DataFlowIssue
Argument `value` might be null
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
                } else if (option.getDescriptor().getId() == COOKIE_OPT) {
                    String value = option.getArgument(0);
                    if (isValidCookie(value)) {
                        request.setCookies(value);
                    } else {
```

### DataFlowIssue
Argument `value` might be null
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
                } else if (option.getDescriptor().getId() == USER_OPT) {
                    String value = option.getArgument(0);
                    setAuthUserPasswd(value, request.getUrl(), request.getAuthorization());
                } else if (AUTH_OPT.contains(option.getDescriptor().getId())) {
                    String authOption = option.getDescriptor().getName();
```

### DataFlowIssue
Method invocation `split` may produce `NullPointerException`
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
                } else if (option.getDescriptor().getId() == DNS_OPT) {
                    String value = option.getArgument(0);
                    String[] dnsServer = value.split(",");
                    for (String s : dnsServer) {
                        request.addDnsServers(s);
```

### DataFlowIssue
Argument `value` might be null
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
                } else if (option.getDescriptor().getId() == PROXY_USER_OPT) {
                    String value = option.getArgument(0);
                    setProxyServerUserInfo(request, value);
                } else if (option.getDescriptor().getId() == MAX_TIME_OPT) {
                    String value = option.getArgument(0);
```

### DataFlowIssue
Argument `value` might be null
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
                } else if (option.getDescriptor().getId() == MAX_TIME_OPT) {
                    String value = option.getArgument(0);
                    request.setMaxTime(Double.parseDouble(value) * 1000);
                } else if (option.getDescriptor().getId() == HEAD_OPT) {
                    request.setMethod("HEAD");
```

### DataFlowIssue
Argument `value` might be null
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java
                } else if (option.getDescriptor().getId() == LIMIT_RATE_OPT) {
                    String value = option.getArgument(0);
                    request.setLimitRate(value);
                } else if (option.getDescriptor().getId() == NOPROXY_OPT) {
                    String value = option.getArgument(0);
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java`
#### Snippet
```java
        config.setProperty(HTTPSamplerBase.PROXYUSER, proxyUser.getText(),"");
        config.setProperty(HTTPSamplerBase.PROXYPASS, String.valueOf(proxyPass.getPassword()),"");
        config.setProperty(HTTPSamplerBase.IMPLEMENTATION, httpImplementation.getSelectedItem().toString(),"");
        config.setProperty(HTTPSamplerBase.CONNECT_TIMEOUT, connectTimeOut.getText());
        config.setProperty(HTTPSamplerBase.RESPONSE_TIMEOUT, responseTimeOut.getText());
```

### DataFlowIssue
Unboxing of `enabled.peek()` may produce `NullPointerException`
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/LagartoBasedHtmlParser.java`
#### Snippet
```java
        @Override
        public void tag(Tag tag) {
            if (!enabled.peek()) {
                return;
            }
```

### DataFlowIssue
Unboxing of `enabled.peek()` may produce `NullPointerException`
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/LagartoBasedHtmlParser.java`
#### Snippet
```java
        @Override
        public void script(Tag tag, CharSequence body) {
            if (!enabled.peek()) {
                return;
            }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/HtmlParsingUtils.java`
#### Snippet
```java
                    inForm = true;
                } catch (MalformedURLException e) {
                    inForm = false;
                }
            }
```

### DataFlowIssue
Method invocation `getTreeNode` may produce `NullPointerException`
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java`
#### Snippet
```java
            log.debug("Change target {} in model {}", targetNodes.getSelectedItem(), model);
            TreeNodeWrapper nw = (TreeNodeWrapper) targetNodes.getSelectedItem();
            model.setTarget(nw.getTreeNode());
            enableRestart();
        } else if (command.equals(ADD_TO_INCLUDE_FROM_CLIPBOARD)) {
```

### DataFlowIssue
Argument `name` might be null
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/HttpMirrorServer.java`
#### Snippet
```java

        String name = logLevelOption.getArgument(0);
        final Level logLevel = Level.getLevel(name);

        if (logLevel == null) {
```

### DataFlowIssue
Argument `value` might be null
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/HttpMirrorServer.java`
#### Snippet
```java
            String value = option.getArgument(0);
            try {
                port = Integer.parseInt(value);
            } catch (NumberFormatException ignored) {
                // Intentionally left blank
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/gui/HttpTestSampleGui.java`
#### Snippet
```java
            samplerBase.setProperty(HTTPSamplerBase.PROXYUSER, proxyUser.getText(),"");
            samplerBase.setProperty(HTTPSamplerBase.PROXYPASS, String.valueOf(proxyPass.getPassword()),"");
            samplerBase.setProperty(HTTPSamplerBase.IMPLEMENTATION, httpImplementation.getSelectedItem().toString(),"");
            samplerBase.setProperty(HTTPSamplerBase.CONNECT_TIMEOUT, connectTimeOut.getText());
            samplerBase.setProperty(HTTPSamplerBase.RESPONSE_TIMEOUT, responseTimeOut.getText());
```

### DataFlowIssue
Argument `conn` might be null
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPJavaImpl.java`
#### Snippet
```java
            }
            // Request sent. Now get the response:
            byte[] responseData = readResponse(conn, res);

            res.sampleEnd();
```

### DataFlowIssue
Variable is already assigned to this value
in `src/protocol/ldap/src/main/java/org/apache/jmeter/protocol/ldap/sampler/LDAPSampler.java`
#### Snippet
```java
            res.setResponseCode("500");// TODO distinguish errors better //$NON-NLS-1$
            res.setResponseMessage(ex.toString());
            isSuccessful = false;
        } finally {
            ldap.disconnect();
```

### DataFlowIssue
Argument `formatter` might be null
in `src/functions/src/main/java/org/apache/jmeter/functions/RandomDate.java`
#### Snippet
```java
        if (!dateStart.isEmpty()) {
            try {
                localStartDate = LocalDate.parse(dateStart, formatter).toEpochDay();
            } catch (DateTimeParseException | NumberFormatException ex) {
                log.error("Failed to parse Start Date '{}'", dateStart, ex); // $NON-NLS-1$
```

### DataFlowIssue
Argument `formatter` might be null
in `src/functions/src/main/java/org/apache/jmeter/functions/RandomDate.java`
#### Snippet
```java
        String dateEnd = values[2].execute().trim();
        try {
            localEndDate = LocalDate.parse(dateEnd, formatter).toEpochDay();
        } catch (DateTimeParseException | NumberFormatException ex) {
            log.error("Failed to parse End date '{}'", dateEnd, ex); // $NON-NLS-1$
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `src/components/src/main/java/org/apache/jmeter/control/gui/ThroughputControllerGui.java`
#### Snippet
```java
        styleBox = new JComboBox<>(styleModel);
        styleBox.addActionListener(evt -> {
            if (((String) styleBox.getSelectedItem()).equals(BYNUMBER_LABEL)) {
                style = ThroughputController.BYNUMBER;
            } else {
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `src/components/src/main/java/org/apache/jmeter/sampler/gui/TestActionGui.java`
#### Snippet
```java
        targetBox = new JComboBox<>(targetModel);
        targetBox.addActionListener(evt -> {
            if (((String) targetBox.getSelectedItem()).equals(THREAD_TARGET_LABEL)) {
                target = TestAction.THREAD;
            } else {
```

### DataFlowIssue
Variable is already assigned to this value
in `src/components/src/main/java/org/apache/jmeter/assertions/gui/HTMLAssertionGui.java`
#### Snippet
```java
            errorThreshold = Long.parseLong(errorThresholdString);
        } catch (NumberFormatException e) {
            errorThreshold = 0;
        }
        ((HTMLAssertion) inElement).setErrorThreshold(errorThreshold);
```

### DataFlowIssue
Variable is already assigned to this value
in `src/components/src/main/java/org/apache/jmeter/assertions/gui/HTMLAssertionGui.java`
#### Snippet
```java
            warningThreshold = Long.parseLong(warningThresholdString);
        } catch (NumberFormatException e) {
            warningThreshold = 0;
        }
        ((HTMLAssertion) inElement).setWarningThreshold(warningThreshold);
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `src/components/src/main/java/org/apache/jmeter/assertions/gui/HTMLAssertionGui.java`
#### Snippet
```java
        ((HTMLAssertion) inElement).setWarningThreshold(warningThreshold);

        String docTypeString = docTypeBox.getSelectedItem().toString();
        ((HTMLAssertion) inElement).setDoctype(docTypeString);

```

### DataFlowIssue
Argument `strokeWidthList.getSelectedItem()` might be null
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java
                .get(legendPlacementList.getSelectedItem()));
        graphPanel.setPointShape(StatGraphProperties.getPointShapeMap().get(pointShapeLine.getSelectedItem()));
        graphPanel.setStrokeWidth(Float.parseFloat((String) strokeWidthList.getSelectedItem()));

        graphPanel.setTitleFont(JMeterUIDefaults.createFont(
```

### DataFlowIssue
Argument `titleFontSizeList.getSelectedItem()` might be null
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java
                StatGraphProperties.getFontNameMap().get(titleFontNameList.getSelectedItem()),
                StatGraphProperties.getFontStyleMap().get(titleFontStyleList.getSelectedItem()),
                Integer.parseInt((String) titleFontSizeList.getSelectedItem())));
        graphPanel.setLegendFont(JMeterUIDefaults.createFont(
                StatGraphProperties.getFontNameMap().get(fontNameList.getSelectedItem()),
```

### DataFlowIssue
Argument `fontSizeList.getSelectedItem()` might be null
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java
                StatGraphProperties.getFontNameMap().get(fontNameList.getSelectedItem()),
                StatGraphProperties.getFontStyleMap().get(fontStyleList.getSelectedItem()),
                Integer.parseInt((String) fontSizeList.getSelectedItem())));

        graphPanel.setHeight(height);
```

### DataFlowIssue
Method invocation `doAction` may produce `NullPointerException`
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java
            try {
                ActionRouter.getInstance().getAction(
                        ActionNames.SAVE_GRAPHICS,SaveGraphics.class.getName()).doAction(
                        new ActionEvent(this,event.getID(),ActionNames.SAVE_GRAPHICS));
            } catch (Exception e) {
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `src/components/src/main/java/org/apache/jmeter/visualizers/MailerVisualizer.java`
#### Snippet
```java
        mailerModel.setPassword(smtpPasswordField.getText());
        mailerModel.setMailAuthType(
                authTypeCombo.getSelectedItem().toString());
        mailerModel.setSuccessLimit(successLimitField.getText());
        mailerModel.setSuccessSubject(successSubjectField.getText());
```

### DataFlowIssue
Method invocation `trim` may produce `NullPointerException`
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/BackendListenerGui.java`
#### Snippet
```java

        add(classnameRequestPanel, BorderLayout.CENTER);
        className = ((String) classnameCombo.getSelectedItem()).trim();
    }

```

### DataFlowIssue
Method invocation `trim` may produce `NullPointerException`
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/BackendListenerGui.java`
#### Snippet
```java
        if (event.getSource() == classnameCombo) {

            String newClassName = ((String) classnameCombo.getSelectedItem()).trim();
            try {
                BackendListenerClient client = createBackendListenerClient(newClassName);
```

### DataFlowIssue
Method invocation `doAction` may produce `NullPointerException`
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java
            try {
                ActionRouter.getInstance().getAction(
                        ActionNames.SAVE_GRAPHICS,SaveGraphics.class.getName()).doAction(
                                new ActionEvent(this,event.getID(),ActionNames.SAVE_GRAPHICS));
            } catch (Exception e) {
```

### DataFlowIssue
Argument `titleFontSizeList.getSelectedItem()` might be null
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java
                StatGraphProperties.getFontNameMap().get(titleFontNameList.getSelectedItem()),
                StatGraphProperties.getFontStyleMap().get(titleFontStyleList.getSelectedItem()),
                Integer.parseInt((String) titleFontSizeList.getSelectedItem())));
        graphPanel.setLegendFont(JMeterUIDefaults.createFont(
                StatGraphProperties.getFontNameMap().get(fontNameList.getSelectedItem()),
```

### DataFlowIssue
Argument `fontSizeList.getSelectedItem()` might be null
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java
                StatGraphProperties.getFontNameMap().get(fontNameList.getSelectedItem()),
                StatGraphProperties.getFontStyleMap().get(fontStyleList.getSelectedItem()),
                Integer.parseInt((String) fontSizeList.getSelectedItem())));
        graphPanel.setValueFont(JMeterUIDefaults.createFont(
                StatGraphProperties.getFontNameMap().get(valueFontNameList.getSelectedItem()),
```

### DataFlowIssue
Argument `valueFontSizeList.getSelectedItem()` might be null
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java
                StatGraphProperties.getFontNameMap().get(valueFontNameList.getSelectedItem()),
                StatGraphProperties.getFontStyleMap().get(valueFontStyleList.getSelectedItem()),
                Integer.parseInt((String) valueFontSizeList.getSelectedItem())));

        graphPanel.setHeight(height);
```

## RuleId[id=RegExpSuspiciousBackref]
### RegExpSuspiciousBackref
Group `2` and this back reference are in different branches
in `src/core/src/main/java/org/apache/jmeter/save/CSVSaveService.java`
#### Snippet
```java
            // where the non-word char (\2) is the same
            // e.g. abc|def|ghi but not abd|def~ghi
            .compile("\\w+((\\W)\\w+)?(\\2\\w+)*(\\2\"\\w+\")*" // $NON-NLS-1$
                    // last entries may be quoted strings
            );
```

### RegExpSuspiciousBackref
Group `2` and this back reference are in different branches
in `src/core/src/main/java/org/apache/jmeter/save/CSVSaveService.java`
#### Snippet
```java
            // where the non-word char (\2) is the same
            // e.g. abc|def|ghi but not abd|def~ghi
            .compile("\\w+((\\W)\\w+)?(\\2\\w+)*(\\2\"\\w+\")*" // $NON-NLS-1$
                    // last entries may be quoted strings
            );
```

### RegExpSuspiciousBackref
Group `2` and this back reference are in different branches
in `src/core/src/main/java/org/apache/jmeter/report/core/SampleMetaDataParser.java`
#### Snippet
```java
            // where the non-word char (\2) is the same
            // e.g. abc|def|ghi but not abd|def~ghi
            .compile("\\w+((\\W)[\\w ]+)?(\\2[\\w ]+)*(\\2\"[\\w ]+\")*" // $NON-NLS-1$
                    // last entries may be quoted strings
            );
```

### RegExpSuspiciousBackref
Group `2` and this back reference are in different branches
in `src/core/src/main/java/org/apache/jmeter/report/core/SampleMetaDataParser.java`
#### Snippet
```java
            // where the non-word char (\2) is the same
            // e.g. abc|def|ghi but not abd|def~ghi
            .compile("\\w+((\\W)[\\w ]+)?(\\2[\\w ]+)*(\\2\"[\\w ]+\")*" // $NON-NLS-1$
                    // last entries may be quoted strings
            );
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'getNamePanel' is still used
in `src/core/src/main/java/org/apache/jmeter/gui/AbstractJMeterGuiComponent.java`
#### Snippet
```java
    @API(status = DEPRECATED, since = "5.2.0")
    @Deprecated
    protected NamePanel getNamePanel() {
        return namePanel;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getJMeterLaf' is still used
in `src/core/src/main/java/org/apache/jmeter/gui/action/LookAndFeelCommand.java`
#### Snippet
```java
     */
    @Deprecated
    public static String getJMeterLaf(){
        String laf = PREFS.get(USER_PREFS_KEY, null);
        if (laf != null) {
```

### DeprecatedIsStillUsed
Deprecated member 'LANGUAGE_NAMES' is still used
in `src/core/src/main/java/org/apache/jmeter/util/JSR223BeanInfoSupport.java`
#### Snippet
```java
     */
    @Deprecated
    public static final String[][] LANGUAGE_NAMES; // NOSONAR Kept for backward compatibility

    private static final String[][] CONSTANT_LANGUAGE_NAMES;
```

### DeprecatedIsStillUsed
Deprecated member 'StatisticalSampleResult' is still used
in `src/core/src/main/java/org/apache/jmeter/samplers/StatisticalSampleResult.java`
#### Snippet
```java
     */
    @Deprecated
    public StatisticalSampleResult(long stamp, long elapsed) {
        super(stamp, elapsed);
        this.elapsed = elapsed;
```

### DeprecatedIsStillUsed
Deprecated member 'isStartNextThreadLoop' is still used
in `src/core/src/main/java/org/apache/jmeter/samplers/SampleResult.java`
#### Snippet
```java
     */
    @Deprecated
    public boolean isStartNextThreadLoop() {
        return testLogicalAction == TestLogicalAction.START_NEXT_ITERATION_OF_THREAD;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'ComboStringEditor' is still used
in `src/core/src/main/java/org/apache/jmeter/testbeans/gui/ComboStringEditor.java`
#### Snippet
```java

    @Deprecated // only for use from test code
    ComboStringEditor() {
        this(null, false, false);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'checkMethod' is still used
in `src/jorphan/src/main/java/org/apache/jorphan/reflect/Functor.java`
#### Snippet
```java
     */
    @Deprecated
    public boolean checkMethod(Object _invokee){
        Method m = null;
        try {
```

### DeprecatedIsStillUsed
Deprecated member 'checkMethod' is still used
in `src/jorphan/src/main/java/org/apache/jorphan/reflect/Functor.java`
#### Snippet
```java
     */
    @Deprecated
    public boolean checkMethod(Object _invokee, Class<?> c){
        Method m = null;
        try {
```

### DeprecatedIsStillUsed
Deprecated member 'IS_ONE_WAY' is still used
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/JMSSampler.java`
#### Snippet
```java
     */
    @Deprecated
    public static final String IS_ONE_WAY = "JMSSampler.isFireAndForget"; // $NON-NLS-1$ // NOSONAR

    private static final String JMS_NUMBEROFSAMPLES = "JMSSampler.jmsNumberOfSamplesToAggregate"; // $NON-NLS-1$
```

### DeprecatedIsStillUsed
Deprecated member 'WorkBench' is still used
in `src/core/src/main/java/org/apache/jmeter/testelement/WorkBench.java`
#### Snippet
```java
 */
@Deprecated
public class WorkBench extends AbstractTestElement {

    private static final long serialVersionUID = 240L;
```

### DeprecatedIsStillUsed
Deprecated member 'BASIC_DIGEST' is still used
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/AuthManager.java`
#### Snippet
```java
         */
        @Deprecated
        BASIC_DIGEST,
        /**
         * Basic Auth
```

### DeprecatedIsStillUsed
Deprecated member 'MultipartUrlConfig' is still used
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/config/MultipartUrlConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public MultipartUrlConfig(){
        this(null);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'inCache' is still used
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/CacheManager.java`
#### Snippet
```java
     */
    @Deprecated
    public boolean inCache(URL url) {
        return entryStillValid(url, getEntry(url.toString(), null));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'testFunctors' is still used
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatVisualizer.java`
#### Snippet
```java
     * */
    @Deprecated
    public static boolean testFunctors(){
        StatVisualizer instance = new StatVisualizer();
        return instance.model.checkFunctors(null,instance.getClass());
```

### DeprecatedIsStillUsed
Deprecated member 'testFunctors' is still used
in `src/components/src/main/java/org/apache/jmeter/visualizers/SummaryReport.java`
#### Snippet
```java
     * */
    @Deprecated
    public static boolean testFunctors(){
        SummaryReport instance = new SummaryReport();
        return instance.model.checkFunctors(null,instance.getClass());
```

### DeprecatedIsStillUsed
Deprecated member 'setDefaultWindowMode' is still used
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/SamplerMetric.java`
#### Snippet
```java
    @Deprecated
    @VisibleForTesting(visibility = VisibleForTesting.Visibility.PRIVATE)
    public static void setDefaultWindowMode(WindowMode windowMode) {
        globalWindowMode = windowMode;
    }
```

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve class or package 'springframework'
in `bin/testfiles/activemq.xml`
#### Snippet
```java
  http://activemq.apache.org/schema/core http://activemq.apache.org/schema/core/activemq-core.xsd">

<bean class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer"/> 
<broker xmlns="http://activemq.apache.org/schema/core" useJmx="false" persistent="false">
    <transportConnectors>
```

### SpringXmlModelInspection
Cannot resolve class or package 'beans'
in `bin/testfiles/activemq.xml`
#### Snippet
```java
  http://activemq.apache.org/schema/core http://activemq.apache.org/schema/core/activemq-core.xsd">

<bean class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer"/> 
<broker xmlns="http://activemq.apache.org/schema/core" useJmx="false" persistent="false">
    <transportConnectors>
```

### SpringXmlModelInspection
Cannot resolve class or package 'factory'
in `bin/testfiles/activemq.xml`
#### Snippet
```java
  http://activemq.apache.org/schema/core http://activemq.apache.org/schema/core/activemq-core.xsd">

<bean class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer"/> 
<broker xmlns="http://activemq.apache.org/schema/core" useJmx="false" persistent="false">
    <transportConnectors>
```

### SpringXmlModelInspection
Cannot resolve class or package 'config'
in `bin/testfiles/activemq.xml`
#### Snippet
```java
  http://activemq.apache.org/schema/core http://activemq.apache.org/schema/core/activemq-core.xsd">

<bean class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer"/> 
<broker xmlns="http://activemq.apache.org/schema/core" useJmx="false" persistent="false">
    <transportConnectors>
```

### SpringXmlModelInspection
Cannot resolve class 'PropertyPlaceholderConfigurer'
in `bin/testfiles/activemq.xml`
#### Snippet
```java
  http://activemq.apache.org/schema/core http://activemq.apache.org/schema/core/activemq-core.xsd">

<bean class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer"/> 
<broker xmlns="http://activemq.apache.org/schema/core" useJmx="false" persistent="false">
    <transportConnectors>
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`iterator` can be replaced with 'Collections.emptyIterator()'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/LagartoBasedHtmlParser.java`
#### Snippet
```java
                        baseUrl, e.getMessage());
            }
            return Collections.<URL>emptyList().iterator();
        } catch (Exception e) {
            throw new HTMLParseException(e);
```

### RedundantCollectionOperation
Unnecessary 'Arrays.asList()' call
in `src/protocol/mongodb/src/main/java/org/apache/jmeter/protocol/mongodb/mongo/MongoUtils.java`
#### Snippet
```java

        List<ServerAddress> addresses = new ArrayList<>();
        for(String connection : Arrays.asList(connections.split(","))) {
            int port = DEFAULT_PORT;
            String[] hostPort = connection.split(":");
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/PublisherSampler.java`
#### Snippet
```java
    protected static Cache<Object, Object> buildCache(String configChoice) {
        Caffeine<Object, Object> cacheBuilder = Caffeine.newBuilder();
        switch (configChoice) {
        case JMSPublisherGui.USE_FILE_RSC:
            cacheBuilder.maximumSize(1);
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return array but the return type is list
in `src/jorphan/src/main/java/org/apache/jorphan/collections/Data.java`
#### Snippet
```java
     * @param columnName
     *            name of the column.
     * @return array of Objects representing the data.
     */
    public List<Object> getColumnAsObjectArray(String columnName) {
```

### MismatchedJavadocCode
Method is specified to return map but the return type is list
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java

        /**
         * @return the map of form data
         */
        public List<Pair<String,String>> getFormStringData() {
```

### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java

        /**
         * @return the list of DNS server
         */
        public Set<String> getDnsServers() {
```

### MismatchedJavadocCode
Method is specified to return map but the return type is list
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/curl/BasicCurlParser.java`
#### Snippet
```java

        /**
         * @return the map of form data
         */
        public List<Pair<String,ArgumentHolder>> getFormData() {
```

### MismatchedJavadocCode
Method is specified to return array but the return type is list
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/HC4CookieHandler.java`
#### Snippet
```java
     * @param url the target URL
     * @param allowVariableCookie flag whether cookies may contain jmeter variables
     * @return array of HttpClient cookies
     *
     */
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `src/jorphan/src/main/java/org/apache/jorphan/reflect/ClassFinder.java`
#### Snippet
```java
                return Arrays.stream(c.getMethods())
                        .anyMatch(method -> Arrays.stream(annotations).anyMatch(method::isAnnotationPresent));
            } catch (NoClassDefFoundError | ClassNotFoundException | UnsupportedClassVersionError | VerifyError ignored) {
                log.debug(ignored.getLocalizedMessage(), ignored);
            }
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `src/protocol/java/src/main/java/org/apache/jmeter/protocol/java/sampler/BeanShellSampler.java`
#### Snippet
```java
            try {
                savedBsh.evalNoLog("interrupt()"); // $NON-NLS-1$
            } catch (JMeterException ignored) {
                if (log.isDebugEnabled()) {
                    log.debug("{} : {}", getClass(), ignored.getLocalizedMessage()); // $NON-NLS-1$
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/core/src/main/java/org/apache/jmeter/save/SaveService.java`
#### Snippet
```java
    public static HashTree loadTree(File file) throws IOException {
        log.info("Loading file: {}", file);
        try (InputStream inputStream = new FileInputStream(file);
                BufferedInputStream bufferedInputStream =
                    new BufferedInputStream(inputStream)){
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/core/src/main/java/org/apache/jmeter/save/CSVSaveService.java`
#### Snippet
```java
        final boolean errorsOnly = resultCollector.isErrorLogging();
        final boolean successOnly = resultCollector.isSuccessOnlyLogging();
        try (InputStream inStream = new FileInputStream(filename);
                Reader inReader = new InputStreamReader(inStream,
                        SaveService.getFileEncoding(StandardCharsets.UTF_8.name()));
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/core/src/main/java/org/apache/jmeter/util/PropertiesBasedPrefixResolver.java`
#### Snippet
```java
                                XPATH_NAMESPACE_CONFIG);
                    } else {
                        inputStream = new BufferedInputStream(new FileInputStream(pathToNamespaceConfigFile));
                        properties.load(inputStream);
                        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/core/src/main/java/org/apache/jmeter/util/SSLManager.java`
#### Snippet
```java

                if (initStore.exists()) {
                    try (InputStream fis = new FileInputStream(initStore)) {
                        this.trustStore.load(fis, null);
                        log.info("Truststore loaded OK from file");
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/core/src/main/java/org/apache/jmeter/util/SSLManager.java`
#### Snippet
```java
                    this.keyStore.load(null, password);
                } else {
                    try (InputStream fis = new FileInputStream(initStore)) {
                        this.keyStore.load(fis, password);
                    }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/core/src/main/java/org/apache/jmeter/util/JMeterUtils.java`
#### Snippet
```java
    public static void loadJMeterProperties(String file) {
        Properties p = new Properties(System.getProperties());
        try (InputStream is = new FileInputStream(new File(file))) {
            p.load(is);
        } catch (IOException e) {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/core/src/main/java/org/apache/jmeter/util/JMeterUtils.java`
#### Snippet
```java
    public static Properties loadProperties(String file, Properties defaultProps) {
        Properties p = new Properties(defaultProps);
        try (InputStream is = new FileInputStream(new File(file))) {
            p.load(is);
        } catch (IOException e) {
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/core/src/main/java/org/apache/jmeter/samplers/DiskStoreSampleSender.java`
#### Snippet
```java
                OutputStream anOutputStream;
                try {
                    anOutputStream = new FileOutputStream(temporaryFile);
                    oos = new ObjectOutputStream(anOutputStream);
                } catch (IOException e) {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/core/src/main/java/org/apache/jmeter/samplers/DiskStoreSampleSender.java`
#### Snippet
```java
            Thread.currentThread().interrupt();
        }
        try (InputStream fis = new FileInputStream(temporaryFile);
                ObjectInputStream ois = new ObjectInputStream(fis)){
            Object obj;
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/jorphan/src/main/java/org/apache/jorphan/exec/SystemCommand.java`
#### Snippet
```java
            return null;
        } else {
            return new FileInputStream(in);
        }
    }
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/jorphan/src/main/java/org/apache/jorphan/exec/SystemCommand.java`
#### Snippet
```java
            return null;
        } else {
            return new FileOutputStream(path);
        }
    }
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/protocol/ftp/src/main/java/org/apache/jmeter/protocol/ftp/sampler/FTPSampler.java`
#### Snippet
```java
                            }
                            if (local.length()>0){
                                output=new FileOutputStream(local); // NOSONAR False positive, the output is closed in finally and not overwritten
                                if (target==null) {
                                    target=output;
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/accesslog/StandardGenerator.java`
#### Snippet
```java
    protected void initStream() {
        try {
            this.OUTPUT = new FileOutputStream(FILE);
        } catch (IOException exception) {
            log.error(exception.getMessage());
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/accesslog/TCLogParser.java`
#### Snippet
```java
            return new BufferedReader(new FileReader(file));
        }
        GZIPInputStream in = new GZIPInputStream(new FileInputStream(file));
        return new BufferedReader(new InputStreamReader(in));
    }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/ProxyControl.java`
#### Snippet
```java

    private static KeyStore getKeyStore(char[] password) throws GeneralSecurityException, IOException {
        try (InputStream in = new BufferedInputStream(new FileInputStream(CERT_PATH))) {
            log.debug("Opened Keystore file: {}", CERT_PATH_ABS);
            KeyStore ks = KeyStore.getInstance(KEYSTORE_TYPE);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/PostWriter.java`
#### Snippet
```java
        // ratio in bin/jmeter[.bat], but this is better.
        int read;
        try (InputStream in = new BufferedInputStream(new FileInputStream(filename))) {
            while ((read = in.read(buf)) > 0) {
                out.write(buf, 0, read);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/AjpSampler.java`
#### Snippet
```java
                    body = null;
                }
                body = new BufferedInputStream(new FileInputStream(input));
                setString(HTTPConstants.HEADER_CONTENT_DISPOSITION);
                setString("form-data; name=\""+encode(fa.getParamName())+
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HttpClientDefaultParameters.java`
#### Snippet
```java
        log.info("Reading httpclient parameters from "+f.getAbsolutePath());
        Properties props = new Properties();
        try ( InputStream is = new FileInputStream(f) ){
            props.load(is);
            for (Map.Entry<Object, Object> me : props.entrySet()){
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/protocol/mail/src/main/java/org/apache/jmeter/protocol/mail/sampler/MailFileFolder.java`
#### Snippet
```java
            f = new File(folderPath,String.format("%d.msg", index));
        }
        try (InputStream fis = new FileInputStream(f);
                InputStream bis = new BufferedInputStream(fis)) {
            return new MailFileMessage(this, bis, index);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/protocol/mail/src/main/java/org/apache/jmeter/protocol/smtp/sampler/protocol/SendMailCommand.java`
#### Snippet
```java
        Message message;
        if (sendEmlMessage) {
            message = new MimeMessage(session, new BufferedInputStream(new FileInputStream(emlMessage)));
        } else {
            message = new MimeMessage(session);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/components/src/main/java/org/apache/jmeter/assertions/SMIMEAssertion.java`
#### Snippet
```java
        CertificateFactory cf = CertificateFactory
                .getInstance("X.509");
        try (InputStream fis = new FileInputStream(testElement.getSignerCertFile());
                InputStream bis = new BufferedInputStream(fis)){
            X509CertificateHolder certFromFile = new JcaX509CertificateHolder((X509Certificate) cf.generateCertificate(bis));
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/core/src/main/java/org/apache/jmeter/gui/GuiPackage.java`
#### Snippet
```java
    public List<Stoppable> getStoppables() {
        List<Stoppable> list = new ArrayList<>();
        list.addAll(stoppables);
        return list;
    }
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/core/src/main/java/org/apache/jmeter/gui/action/HtmlReportGenerator.java`
#### Snippet
```java
    public List<String> run() {
        List<String> errorMessageList = new ArrayList<>();
        errorMessageList.addAll(checkArguments());
        if (!errorMessageList.isEmpty()) {
            return errorMessageList;
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java
                    if (internalList.size() >= 2) {
                        List<RespTimeGraphDataBean> tempList = new ArrayList<>();
                        tempList.addAll(internalList);
                        this.clearData();
                        for (RespTimeGraphDataBean data : tempList) {
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `src/components/src/main/java/org/apache/jmeter/visualizers/backend/BackendListenerGui.java`
#### Snippet
```java
                Map<String, String> currArgsMap = currArgs.getArgumentsAsMap();
                Map<String, String> userArgMap = new HashMap<>();
                userArgMap.putAll(currArgsMap);
                Arguments defaultArgs = extractDefaultArguments(client, userArgMap, oldClient.getDefaultParameters());
                Arguments newArgs = copyDefaultArguments(currArgsMap, defaultArgs);
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/core/src/main/java/org/apache/jmeter/gui/JMeterFileFilter.java`
#### Snippet
```java
    @Override
    public String getDescription() {
        return "JMeter " + Arrays.asList(exts).toString();
    }
}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/core/src/main/java/org/apache/jmeter/gui/action/Help.java`
#### Snippet
```java
                        + "<h1>Problem loading help page</h1>"
                        + "<div>Can't load url: &quot;<em>"
                        + url.toString() + "</em>&quot;</div>"
                        + "<div>See log for more info</div>"
                        + "</body>");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
            System.err.println("Error: " + error);//NOSONAR
            System.out.println("Usage");//NOSONAR
            System.out.println(CLUtil.describeOptions(options).toString());//NOSONAR
            // repeat the error so no need to scroll back past the usage to see it
            System.out.println("Error: " + error);//NOSONAR
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
            } else if (parser.getArgumentById(OPTIONS_OPT) != null) {
                displayAsciiArt();
                System.out.println(CLUtil.describeOptions(options).toString());//NOSONAR
            } else if (parser.getArgumentById(SERVER_OPT) != null) {
                // Start the server
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
        } catch (IllegalUserActionException e) {// NOSONAR
            System.out.println("Incorrect Usage:"+e.getMessage());//NOSONAR
            System.out.println(CLUtil.describeOptions(options).toString());//NOSONAR
        } catch (Throwable e) { // NOSONAR
            log.error("An error occurred: ", e);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/core/src/main/java/org/apache/jmeter/JMeter.java`
#### Snippet
```java
            throw e;
        } catch (Exception e) {
            System.out.println("Error in NonGUIDriver " + e.toString());//NOSONAR
            log.error("Error in NonGUIDriver", e);
            throw new ConfigurationException("Error in NonGUIDriver " + e.getMessage(), e);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/core/src/main/java/org/apache/jmeter/util/BSFJavaScriptEngine.java`
#### Snippet
```java
        }
        else if (target instanceof RuntimeException) {
            message = "Internal Error: " + target.toString();
        }
        else if (target instanceof StackOverflowError) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/core/src/main/java/org/apache/jmeter/save/CSVSaveService.java`
#### Snippet
```java
                    throw new IOException(
                            "Cannot have quote-char in plain field:["
                                    + baos.toString() + "]");
                } else if (isDelimOrEOL(delim, ch)) {
                    push = true;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/core/src/main/java/org/apache/jmeter/save/CSVSaveService.java`
#### Snippet
```java
                    throw new IOException(
                            "Cannot have single quote-char in quoted field:["
                                    + baos.toString() + "]");
                }
                break;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/core/src/main/java/org/apache/jmeter/save/CSVSaveService.java`
#### Snippet
```java
            if (state == ParserState.QUOTED) {
                throw new IOException("Missing trailing quote-char in quoted field:[\""
                        + baos.toString() + "]");
            }
            // Do we have some data, or a trailing empty field?
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/core/src/main/java/org/apache/jmeter/report/core/CsvSampleWriter.java`
#### Snippet
```java
            }
        }
        writer.println(row.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/core/src/main/java/org/apache/jmeter/report/core/CsvSampleWriter.java`
#### Snippet
```java
        }
        row.setLength(row.length() - 1);
        writer.println(row.toString());
        sampleCount++;

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/core/src/main/java/org/apache/jmeter/engine/util/CompoundVariable.java`
#### Snippet
```java
                }
            } else if (item instanceof SimpleVariable) {
                results.append(((SimpleVariable) item).toString());
            } else {
                results.append(item);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/core/src/main/java/org/apache/jmeter/engine/ClientJMeterEngine.java`
#### Snippet
```java
            remote.rexit();
        } catch (RemoteException e) {
            log.warn("Could not perform remote exit: " + e.toString());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/core/src/main/java/org/apache/jmeter/report/core/SampleMetadata.java`
#### Snippet
```java
            throw new SampleException(
                    String.format("No column <%s> found in sample metadata <%s>,"
                            + " check #jmeter.save.saveservice.* properties to add the missing column", col, toString()));
        }
        return index;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/core/src/main/java/org/apache/jmeter/report/processor/NormalizerSampleConsumer.java`
#### Snippet
```java
                            " jmeter.save.saveservice.timestamp_format=%s on sample %s ",
                    s.getData(timestamp),
                    TIMESTAMP_FORMAT, s.toString()), e);
        }
        long time = date.getTime();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jorphan/src/main/java/org/apache/jorphan/reflect/Functor.java`
#### Snippet
```java
    private synchronized Method doCreateMethod(Class<?> p_class, Class<?>[] p_types) {
        if (log.isDebugEnabled()){
            log.debug("doCreateMethod() using "+this.toString()
                +"class="
                + p_class.getName()
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/examples/src/main/java/org/apache/jmeter/examples/sampler/ExampleSampler.java`
#### Snippet
```java
        if (log.isDebugEnabled()) {
            log.debug("{} ({}) {} {} {}", Thread.currentThread().getName(), classCount.get(),
                    getTitle(), s, this.toString());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/examples/src/main/java/org/apache/jmeter/examples/testbeans/example3/Example3.java`
#### Snippet
```java
                }
            } catch (IllegalAccessException e) {
                bld.append(e.toString());
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/launcher/src/main/java/org/apache/jmeter/NewDriver.java`
#### Snippet
```java
            PrintWriter printWriter = new PrintWriter(stringWriter);
            exception.printStackTrace(printWriter); // NOSONAR
            builder.append(stringWriter.toString())
                .append("\r\n");
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/launcher/src/main/java/org/apache/jmeter/NewDriver.java`
#### Snippet
```java

        // ClassFinder needs the classpath
        System.setProperty(JAVA_CLASS_PATH, initiaClasspath + classpath.toString());
        loader = createClassLoader(jars);
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/Utils.java`
#### Snippet
```java
            sb.append("JMSDestination   ").append(msg.getJMSDestination()).append('\n');
        } catch (JMSException e) {
            sb.append("\nError: "+e.toString());
        }
        return sb;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/Utils.java`
#### Snippet
```java
            objfac = ctx.lookup(factoryName);
        } catch (NoClassDefFoundError e) {
            throw new NamingException("Lookup failed: "+e.toString());
        }
        if (objfac instanceof javax.jms.ConnectionFactory) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/Utils.java`
#### Snippet
```java
            }
        } catch (JMSException e) {
            sb.append("\nError: "+e.toString());
        }
        return sb;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/SubscriberSampler.java`
#### Snippet
```java
            } catch (JMSException e) {
                String errorCode = Optional.ofNullable(e.getErrorCode()).orElse("");
                log.warn("Error [{}] {}", errorCode, e.toString(), e);

                handleErrorAndAddTemporize(getIsReconnectErrorCode().test(errorCode));
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/jms/src/main/java/org/apache/jmeter/protocol/jms/sampler/SubscriberSampler.java`
#### Snippet
```java
                }
            } catch (InterruptedException ie) {
                log.warn("Interrupted {}", ie.toString(), ie);
                Thread.currentThread().interrupt();
                interrupted = true;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/EncoderCache.java`
#### Snippet
```java
            // This can't happen (how should utf8 not be supported!?!),
            // so just throw an Error:
            throw new Error("Should not happen: " + e.toString());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/HTTPArgument.java`
#### Snippet
```java
            // This can't happen (how should utf8 not be supported!?!),
            // so just throw an Error:
            throw new Error("Should not happen: " + e.toString());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/proxy/HttpRequestHdr.java`
#### Snippet
```java
            URI testCleanUri = new URI(url);
            if(log.isDebugEnabled()) {
                log.debug("Successfully built URI from url:{} => {}", url, testCleanUri.toString());
            }
        } catch (URISyntaxException e) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/JsoupBasedHtmlParser.java`
#### Snippet
```java
                    String result;
                    if (StringUtils.isNotBlank(archive)) {
                        result = codebase.toString() + "/" + archive;
                    } else {
                        result = codebase.toString() + "/" + code;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/JsoupBasedHtmlParser.java`
#### Snippet
```java
                        result = codebase.toString() + "/" + archive;
                    } else {
                        result = codebase.toString() + "/" + code;
                    }
                    urls.addURL(normalizeUrlValue(result), baseUrl.url);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/LagartoBasedHtmlParser.java`
#### Snippet
```java
                        String result;
                        if (StringUtils.isNotBlank(archive)) {
                            result = codebase.toString() + "/" + archive;
                        } else {
                            result = codebase.toString() + "/" + code;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/LagartoBasedHtmlParser.java`
#### Snippet
```java
                            result = codebase.toString() + "/" + archive;
                        } else {
                            result = codebase.toString() + "/" + code;
                        }
                        urls.addURL(normalizeUrlValue(result), baseUrl.url);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/HtmlParsingUtils.java`
#### Snippet
```java
            // UTF-8 unsupported? You must be joking!
            log.error("UTF-8 encoding not supported!");
            throw new Error("Should not happen: " + e.toString(), e);
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/HttpMirrorServer.java`
#### Snippet
```java
            System.err.println("Error: " + error);//NOSONAR
            System.out.println("Usage");//NOSONAR
            System.out.println(CLUtil.describeOptions(options).toString());//NOSONAR
            // repeat the error so no need to scroll back past the usage to see it
            System.out.println("Error: " + error);//NOSONAR
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/HttpMirrorServer.java`
#### Snippet
```java

        if (clArgsParser.getArgumentById(HELP_OPT_ID) != null) {
            System.out.println(CLUtil.describeOptions(options).toString());//NOSONAR
            return;
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/CookieManager.java`
#### Snippet
```java
        if (DELETE_NULL_COOKIES && (null == cv || cv.length()==0)) {
            if (log.isDebugEnabled()) {
                log.debug("Dropping cookie with null value {}", c.toString());
            }
        } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/CookieManager.java`
#### Snippet
```java
        } else {
            if (log.isDebugEnabled()) {
                log.debug("Add cookie to store {}", c.toString());
            }
            getCookies().addItem(c);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/CookieManager.java`
#### Snippet
```java
                if (log.isDebugEnabled()) {
                    log.debug("New Cookie = {} removing matching Cookie {}",
                            newCookie.toString(), cookie.toString());
                }
                iter.remove();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/CookieManager.java`
#### Snippet
```java
                if (log.isDebugEnabled()) {
                    log.debug("New Cookie = {} removing matching Cookie {}",
                            newCookie.toString(), cookie.toString());
                }
                iter.remove();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/AuthManager.java`
#### Snippet
```java
            if (match(authorization,newAuthorization)) {
                if (log.isDebugEnabled()) {
                    log.debug("Found the same Authorization object:{}", newAuthorization.toString());
                }
                //set true, if found the same one
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPSampleResult.java`
#### Snippet
```java
        if (u != null) {
            sb.append(' ');
            sb.append(u.toString());
            sb.append('\n');
            // Include request body if it can have one
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/CacheManager.java`
#### Snippet
```java
                headers != null ? asHeaders(headers) : new Header[0]);
        if (log.isDebugEnabled()){
            log.debug("setHeaders HTTP Method{}(Java) url:{} entry:{}", conn.getRequestMethod(), url.toString(), entry);
        }
        if (entry != null){
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/CacheManager.java`
#### Snippet
```java
        CacheEntry entry = getEntry(url.toString(), request.getAllHeaders());
        if (log.isDebugEnabled()){
            log.debug("setHeaders for HTTP Method:{}(OAH) URL:{} Entry:{}", request.getMethod(), url.toString(), entry);
        }
        if (entry != null){
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HttpClientDefaultParameters.java`
#### Snippet
```java
                    }
                } catch (Exception e) {
                    log.error("Error in property: "+key+"="+value+" "+e.toString());
                }
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HttpClientDefaultParameters.java`
#### Snippet
```java
            }
        } catch (IOException e) {
            log.error("Problem loading properties "+e.toString());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/modifier/AnchorModifier.java`
#### Snippet
```java
            newUrl.setMethod(HTTPConstants.POST);
            if (log.isDebugEnabled()) {
                log.debug("Potential Form match: " + newUrl.toString());
            }
            if (HtmlParsingUtils.isAnchorMatched(newUrl, config)) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/modifier/AnchorModifier.java`
#### Snippet
```java
        }
        if (log.isDebugEnabled()) {
            log.debug("Check for matches against: "+sampler.toString());
        }
        Document html = (Document) HtmlParsingUtils.getDOM(responseText.substring(index));
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/java/src/main/java/org/apache/jmeter/protocol/java/test/SleepTest.java`
#### Snippet
```java
     */
    private String whoAmI() {
        return Thread.currentThread().toString() +
                "@" +
                Integer.toHexString(hashCode());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/java/src/main/java/org/apache/jmeter/protocol/java/test/JavaTest.java`
#### Snippet
```java
     */
    private String whoAmI() {
        return Thread.currentThread().toString() + "@" + Integer.toHexString(hashCode());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java`
#### Snippet
```java
                    StringEntity requestEntity = new StringEntity(postBody.toString(), contentEncoding);
                    entityEnclosingRequest.setEntity(requestEntity);
                    postedBody.append(postBody.toString());
                } else {
                    // It is a normal post request, with parameter names and values
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/mail/src/main/java/org/apache/jmeter/protocol/mail/sampler/MailReaderSampler.java`
#### Snippet
```java
            log.debug("", ex);// No need to log normally, as we set the status
            parent.setResponseCode("500"); // $NON-NLS-1$
            parent.setResponseMessage(ex.toString() + "\n" + samplerString); // $NON-NLS-1$
        } finally {
            busy = false;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java`
#### Snippet
```java
                            url = escapeIllegalURLCharacters(url);
                        } catch (Exception e) { // NOSONAR
                            res.addSubResult(errorResult(new Exception(url.toString() + " is not a correct URI", e), new HTTPSampleResult(res)));
                            setParentSampleSuccess(res, false);
                            continue;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java`
#### Snippet
```java
                            url = url.toURI().normalize().toURL();
                        } catch (MalformedURLException | URISyntaxException e) {
                            res.addSubResult(errorResult(new Exception(url.toString() + " URI can not be normalized", e), new HTTPSampleResult(res)));
                            setParentSampleSuccess(res, false);
                            continue;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/native/src/main/java/org/apache/jmeter/protocol/system/SystemSampler.java`
#### Snippet
```java
        results.setSamplerData("Working Directory: "+directory.getAbsolutePath()+
                "\nEnvironment: "+env+
                "\nExecuting: " + cmdLine.toString());

        SystemCommand nativeCommand = null;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/junit/src/main/java/org/apache/jmeter/protocol/java/sampler/JUnitSampler.java`
#### Snippet
```java
                        buf.append("\n");
                        buftrace.append( "Failure -- ");
                        buftrace.append( item.toString() );
                        buftrace.append("\n");
                        buftrace.append( "Trace -- ");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/junit/src/main/java/org/apache/jmeter/protocol/java/sampler/JUnitSampler.java`
#### Snippet
```java
                        buf.append("\n");
                        buftrace.append( "Error -- ");
                        buftrace.append( item.toString() );
                        buftrace.append("\n");
                        buftrace.append( "Trace -- ");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/protocol/mongodb/src/main/java/org/apache/jmeter/protocol/mongodb/sampler/MongoScriptSampler.java`
#### Snippet
```java
    private void trace(String s) {
        if(log.isDebugEnabled()) {
            log.debug(Thread.currentThread().getName() + " (" + getTitle() + " " + s + " " + this.toString());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/functions/src/main/java/org/apache/jmeter/functions/LogFunction.java`
#### Snippet
```java
        if (t != null) {
            sb.append(' ');
            ps.print(sb.toString());
            t.printStackTrace(ps); // NOSONAR we're printing stack trace to log
        } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/functions/src/main/java/org/apache/jmeter/functions/LogFunction.java`
#### Snippet
```java
            t.printStackTrace(ps); // NOSONAR we're printing stack trace to log
        } else {
            ps.println(sb.toString());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/functions/src/main/java/org/apache/jmeter/functions/StringFromFile.java`
#### Snippet
```java
            myBread.close();
        } catch (IOException e) {
            log.error("closeFile() error: {}", e.toString(), e);//$NON-NLS-1$
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/components/src/main/java/org/apache/jmeter/assertions/BeanShellAssertion.java`
#### Snippet
```java
            log.error("BeanShell Jar missing?", ex);
            result.setError(true);
            result.setFailureMessage("BeanShell Jar missing? " + ex.toString());
            response.setStopThread(true); // No point continuing
        } catch (Exception ex) // Mainly for bsh.EvalError
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java
        graphPanel.setShowGrouping(numberShowGrouping.isSelected());
        graphPanel.setLegendPlacement(StatGraphProperties.getPlacementNameMap()
                .get(legendPlacementList.getSelectedItem()));
        graphPanel.setPointShape(StatGraphProperties.getPointShapeMap().get(pointShapeLine.getSelectedItem()));
        graphPanel.setStrokeWidth(Float.parseFloat((String) strokeWidthList.getSelectedItem()));
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java
        graphPanel.setLegendPlacement(StatGraphProperties.getPlacementNameMap()
                .get(legendPlacementList.getSelectedItem()));
        graphPanel.setPointShape(StatGraphProperties.getPointShapeMap().get(pointShapeLine.getSelectedItem()));
        graphPanel.setStrokeWidth(Float.parseFloat((String) strokeWidthList.getSelectedItem()));

```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java

        graphPanel.setTitleFont(JMeterUIDefaults.createFont(
                StatGraphProperties.getFontNameMap().get(titleFontNameList.getSelectedItem()),
                StatGraphProperties.getFontStyleMap().get(titleFontStyleList.getSelectedItem()),
                Integer.parseInt((String) titleFontSizeList.getSelectedItem())));
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java
        graphPanel.setTitleFont(JMeterUIDefaults.createFont(
                StatGraphProperties.getFontNameMap().get(titleFontNameList.getSelectedItem()),
                StatGraphProperties.getFontStyleMap().get(titleFontStyleList.getSelectedItem()),
                Integer.parseInt((String) titleFontSizeList.getSelectedItem())));
        graphPanel.setLegendFont(JMeterUIDefaults.createFont(
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java
                Integer.parseInt((String) titleFontSizeList.getSelectedItem())));
        graphPanel.setLegendFont(JMeterUIDefaults.createFont(
                StatGraphProperties.getFontNameMap().get(fontNameList.getSelectedItem()),
                StatGraphProperties.getFontStyleMap().get(fontStyleList.getSelectedItem()),
                Integer.parseInt((String) fontSizeList.getSelectedItem())));
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/components/src/main/java/org/apache/jmeter/visualizers/RespTimeGraphVisualizer.java`
#### Snippet
```java
        graphPanel.setLegendFont(JMeterUIDefaults.createFont(
                StatGraphProperties.getFontNameMap().get(fontNameList.getSelectedItem()),
                StatGraphProperties.getFontStyleMap().get(fontStyleList.getSelectedItem()),
                Integer.parseInt((String) fontSizeList.getSelectedItem())));

```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java
        graphPanel.setValueOrientation(valueLabelsVertical.isSelected());
        graphPanel.setLegendPlacement(StatGraphProperties.getPlacementNameMap()
                .get(legendPlacementList.getSelectedItem()));

        graphPanel.setTitleFont(JMeterUIDefaults.createFont(
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java

        graphPanel.setTitleFont(JMeterUIDefaults.createFont(
                StatGraphProperties.getFontNameMap().get(titleFontNameList.getSelectedItem()),
                StatGraphProperties.getFontStyleMap().get(titleFontStyleList.getSelectedItem()),
                Integer.parseInt((String) titleFontSizeList.getSelectedItem())));
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java
        graphPanel.setTitleFont(JMeterUIDefaults.createFont(
                StatGraphProperties.getFontNameMap().get(titleFontNameList.getSelectedItem()),
                StatGraphProperties.getFontStyleMap().get(titleFontStyleList.getSelectedItem()),
                Integer.parseInt((String) titleFontSizeList.getSelectedItem())));
        graphPanel.setLegendFont(JMeterUIDefaults.createFont(
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java
                Integer.parseInt((String) titleFontSizeList.getSelectedItem())));
        graphPanel.setLegendFont(JMeterUIDefaults.createFont(
                StatGraphProperties.getFontNameMap().get(fontNameList.getSelectedItem()),
                StatGraphProperties.getFontStyleMap().get(fontStyleList.getSelectedItem()),
                Integer.parseInt((String) fontSizeList.getSelectedItem())));
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java
        graphPanel.setLegendFont(JMeterUIDefaults.createFont(
                StatGraphProperties.getFontNameMap().get(fontNameList.getSelectedItem()),
                StatGraphProperties.getFontStyleMap().get(fontStyleList.getSelectedItem()),
                Integer.parseInt((String) fontSizeList.getSelectedItem())));
        graphPanel.setValueFont(JMeterUIDefaults.createFont(
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java
                Integer.parseInt((String) fontSizeList.getSelectedItem())));
        graphPanel.setValueFont(JMeterUIDefaults.createFont(
                StatGraphProperties.getFontNameMap().get(valueFontNameList.getSelectedItem()),
                StatGraphProperties.getFontStyleMap().get(valueFontStyleList.getSelectedItem()),
                Integer.parseInt((String) valueFontSizeList.getSelectedItem())));
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/components/src/main/java/org/apache/jmeter/visualizers/StatGraphVisualizer.java`
#### Snippet
```java
        graphPanel.setValueFont(JMeterUIDefaults.createFont(
                StatGraphProperties.getFontNameMap().get(valueFontNameList.getSelectedItem()),
                StatGraphProperties.getFontStyleMap().get(valueFontStyleList.getSelectedItem()),
                Integer.parseInt((String) valueFontSizeList.getSelectedItem())));

```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'headerString.isEmpty()' covered by subsequent condition 'headerString.indexOf(...) \< 0'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/control/HttpMirrorThread.java`
#### Snippet
```java
            baos.close();
            final String headerString = headers.toString();
            if(headerString.isEmpty() || headerString.indexOf('\r') < 0) {
                log.error("Invalid request received:'{}'", headerString);
                return;
```

## RuleId[id=RemoveEmptyParenthesesFromLambdaCall]
### RemoveEmptyParenthesesFromLambdaCall
Unnecessary parentheses in function call with lambda
in `src/dist-check/build.gradle.kts`
#### Snippet
```java
val detailBatchTasks = findProperty("allBatch") is String

val batchTests by tasks.registering() {
    group = LifecycleBasePlugin.VERIFICATION_GROUP
    description = "Executes all the batch tests" +
```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/HtmlParsingUtils.java`
#### Snippet
```java
public final class HtmlParsingUtils {
    private static final java.util.regex.Pattern EXTRACT_STYLE_PATTERN = java.util.regex.Pattern.compile(
            "URL\\(\\s*('|\")(.*)('|\")\\s*\\)", // $NON-NLS-1$
            java.util.regex.Pattern.CASE_INSENSITIVE);
    private static final Logger log = LoggerFactory.getLogger(HtmlParsingUtils.class);
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/parser/HtmlParsingUtils.java`
#### Snippet
```java
public final class HtmlParsingUtils {
    private static final java.util.regex.Pattern EXTRACT_STYLE_PATTERN = java.util.regex.Pattern.compile(
            "URL\\(\\s*('|\")(.*)('|\")\\s*\\)", // $NON-NLS-1$
            java.util.regex.Pattern.CASE_INSENSITIVE);
    private static final Logger log = LoggerFactory.getLogger(HtmlParsingUtils.class);
```

## RuleId[id=CloneDeclaresCloneNotSupported]
### CloneDeclaresCloneNotSupported
`clone()` does not declare 'CloneNotSupportedException'
in `src/components/src/main/java/org/apache/jmeter/timers/SyncTimer.java`
#### Snippet
```java
         */
        @Override
        protected Object clone()  {
            BarrierWrapper barrierWrapper=  null;
            try {
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy field 'header'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/util/HTTPFileArg.java`
#### Snippet
```java
     *             if any of those retrieved information is <code>null</code>
     */
    public HTTPFileArg(HTTPFileArg file) {
        this(file.getPath(), file.getParamName(), file.getMimeType());
    }
```

## RuleId[id=UnusedSymbol]
### UnusedSymbol
Property "MIN_TICKS_FOR_TIME_AXIS" is never used
in `src/core/src/main/kotlin/org/apache/jmeter/threads/openmodel/gui/TargetRateChart.kt`
#### Snippet
```java
    private companion object {
        private val log = LoggerFactory.getLogger(TargetRateChart::class.java)
        private const val MIN_TICKS_FOR_TIME_AXIS = 2.5
    }

```

## RuleId[id=NumericOverflow]
### NumericOverflow
Numeric overflow in expression
in `src/protocol/junit-sample/src/main/java/test/DummyAnnotatedTest.java`
#### Snippet
```java
    public void divideByZero() {
        @SuppressWarnings("unused")
        int i = 27 / 0; // will generate Divide by zero error
    }

```

### NumericOverflow
Numeric overflow in expression
in `src/protocol/junit-sample/src/main/java/woolfel/DummyTestCase.java`
#### Snippet
```java
    public void testException() {
        @SuppressWarnings("unused")
        int i = 27 / 0; // will generate Divide by zero error
    }

```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'binURL' to 'URL'
in `src/protocol/http/src/main/java/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java`
#### Snippet
```java
                Object binURL = urls.next(); // See catch clause below
                try {
                    URL url = (URL) binURL;
                    if (url == null) {
                        log.warn("Null URL detected (should not happen)");
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'rawObject' to 'RequestView'
in `src/components/src/main/java/org/apache/jmeter/visualizers/RequestPanel.java`
#### Snippet
```java
        // place raw tab in first position (first tab)
        if (rawObject != null) {
            listRequestView.addFirst((RequestView) rawObject);
        }

```

