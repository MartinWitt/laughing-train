# jkube 
 
# Bad smells
I found 524 bad smells with 91 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NonFinalFieldInEnum | 71 | false |
| ProtectedMemberInFinalClass | 70 | true |
| Deprecation | 45 | false |
| UNCHECKED_WARNING | 38 | false |
| FieldMayBeFinal | 30 | false |
| RegExpRepeatedSpace | 27 | false |
| DeprecatedIsStillUsed | 23 | false |
| JavadocDeclaration | 19 | false |
| CdiInjectionPointsInspection | 18 | false |
| AutoCloseableResource | 17 | false |
| JavadocLinkAsPlainText | 13 | false |
| DuplicatedCode | 12 | false |
| IOStreamConstructor | 12 | false |
| IgnoreResultOfCall | 10 | false |
| UnusedAssignment | 9 | false |
| ConstantValue | 9 | false |
| UnnecessaryToStringCall | 8 | true |
| DataFlowIssue | 6 | false |
| WebProperties | 6 | false |
| ToArrayCallWithZeroLengthArrayArgument | 5 | true |
| RegExpSimplifiable | 5 | false |
| RedundantTypeArguments | 5 | false |
| UnstableApiUsage | 5 | false |
| RegExpRedundantEscape | 4 | false |
| RedundantStringFormatCall | 4 | false |
| UnnecessarySemicolon | 4 | false |
| InnerClassMayBeStatic | 4 | true |
| UnnecessaryStringEscape | 3 | true |
| NullableProblems | 3 | false |
| RedundantMethodOverride | 3 | false |
| CatchMayIgnoreException | 3 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| WrapperTypeMayBePrimitive | 2 | false |
| TrivialStringConcatenation | 2 | false |
| RegExpUnexpectedAnchor | 2 | false |
| DanglingJavadoc | 2 | false |
| TrivialIf | 2 | false |
| UnnecessaryModifier | 1 | true |
| ConditionalBreakInInfiniteLoop | 1 | false |
| EmptyTryBlock | 1 | false |
| CloneableImplementsClone | 1 | false |
| UnnecessaryLabelOnContinueStatement | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| FieldCanBeLocal | 1 | false |
| UNUSED_IMPORT | 1 | false |
| InfiniteLoopStatement | 1 | false |
| PointlessNullCheck | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
| ShiftOutOfRange | 1 | false |
| RedundantCollectionOperation | 1 | false |
| MismatchedJavadocCode | 1 | false |
| ImplicitArrayToString | 1 | false |
| RedundantCast | 1 | false |
| RegExpUnnecessaryNonCapturingGroup | 1 | false |
| BusyWait | 1 | false |
| UseBulkOperation | 1 | false |
| BigDecimalMethodWithoutRoundingCalled | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new ClassLoader\[additionalClassLoaders.size()\]'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/ClassUtil.java`
#### Snippet
```java

        if (additionalClassLoaders != null && !additionalClassLoaders.isEmpty()) {
            classLoaders = ArrayUtils.addAll(getClassLoaders(), additionalClassLoaders.toArray(new ClassLoader[additionalClassLoaders.size()]));
        }
        else {
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new URL\[compileJars.size()\]'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/ClassUtil.java`
#### Snippet
```java
            }

            return new URLClassLoader(compileJars.toArray(new URL[compileJars.size()]),
                    PluginServiceFactory.class.getClassLoader());

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new URL\[jars.size()\]'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/ClassUtil.java`
#### Snippet
```java

    private static URLClassLoader createURLClassLoader(Collection<URL> jars) {
        return new URLClassLoader(jars.toArray(new URL[jars.size()]));
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[values.size()\]'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
                    continue;
                }
                String[] valuesArray = values.toArray(new String[values.size()]);
                String operator = expression.getOperator();
                switch (operator) {
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Certificate\[certs.size()\]'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/KeyStoreUtil.java`
#### Snippet
```java
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X509");
            Collection<? extends Certificate> certs = certificateFactory.generateCertificates(is);
            return certs.toArray(new Certificate[certs.size()]);
        }
    }
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/SecretEnricher.java`
#### Snippet
```java
        }

        for(Integer index = 0; index < builder.buildItems().size(); index++) {
            if(builder.buildItems().get(index) instanceof Secret) {
                secretToIndexMap.put(builder.buildItems().get(index).getMetadata().getName(), index);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java
        Integer targetPort = Integer.parseInt(targetPortFromImageLabel != null ? targetPortFromImageLabel : portMatcher.group(1));
        String protocol = getProtocol(portMatcher.group(2));
        Integer port = checkForLegacyMapping(targetPort);

        // With a port override you can override the detected ports
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/resource/BuildRecreateMode.java`
#### Snippet
```java
    }

    private BuildRecreateMode(boolean bc, boolean is) {
        this.isBuildConfig = bc;
        this.isImageStream = is;
```

## RuleId[id=ConditionalBreakInInfiniteLoop]
### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
                if (file.exists()) {
                    int idx = 1;
                    while (true) {
                        fileName = name + "-" + idx++ + ".json";
                        file = new File(namespaceDir, fileName);
```

## RuleId[id=EmptyTryBlock]
### EmptyTryBlock
Empty `try` block
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/IoUtil.java`
#### Snippet
```java
        for (int i=0; i < attempts; i++) {
            int port = min + RANDOM.nextInt(max - min + 1);
            try (Socket ignored = new Socket("localhost", port)) { // NOSONAR
                // Port is open for communication, meaning it's used up, try again
            } catch (ConnectException e) {
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/CommandLine.java`
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
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/CommandLine.java`
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
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/CommandLine.java`
#### Snippet
```java
                    break;
                default:
                    if ("\'".equals(nextTok)) {
                        state = inQuote;
                    } else if ("\"".equals(nextTok)) {
```

## RuleId[id=CloneableImplementsClone]
### CloneableImplementsClone
`CommandLine` is 'Cloneable' but does not define 'clone()' method
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/CommandLine.java`
#### Snippet
```java
// Inspired from org.apache.maven.shared.utils.cli.CommandLineUtils#translateCommandline()
// including a fixed for quoting
public class CommandLine implements Cloneable {

    private CommandLine() { }
```

## RuleId[id=UnnecessaryLabelOnContinueStatement]
### UnnecessaryLabelOnContinueStatement
Unnecessary label `TAG_EVENT_LIST` on continue statement
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/openshift/ImageStreamService.java`
#### Snippet
```java
                List<TagEvent> items = list.getItems();
                if (items == null || items.isEmpty()) {
                    continue TAG_EVENT_LIST;
                }

```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/AbstractPortsExtractor.java`
#### Snippet
```java
	private static final String NUMBER_REGEX = "\\d+";

	private static final String PORT_REGEX = "([a-zA-Z0-9_]+)(([\\.-_]+p)|([P]))ort";
	private static final Pattern PORT_PATTERN = Pattern.compile(PORT_REGEX);

```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/DockerFileUtil.java`
#### Snippet
```java
 */
public class DockerFileUtil {
    private static final String ARG_PATTERN_REGEX = "\\$([\\w|\\-\\.]+)|\\$\\{([\\w\\-|\\.]+)\\}";

    private static final Pattern argPattern = Pattern.compile(ARG_PATTERN_REGEX);
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/DockerFileUtil.java`
#### Snippet
```java
 */
public class DockerFileUtil {
    private static final String ARG_PATTERN_REGEX = "\\$([\\w|\\-\\.]+)|\\$\\{([\\w\\-|\\.]+)\\}";

    private static final Pattern argPattern = Pattern.compile(ARG_PATTERN_REGEX);
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/DockerFileUtil.java`
#### Snippet
```java
 */
public class DockerFileUtil {
    private static final String ARG_PATTERN_REGEX = "\\$([\\w|\\-\\.]+)|\\$\\{([\\w\\-|\\.]+)\\}";

    private static final Pattern argPattern = Pattern.compile(ARG_PATTERN_REGEX);
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/RevisionHistoryEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/RevisionHistoryEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/PersistentVolumeClaimStorageClassEnricher.java`
#### Snippet
```java
    protected String key;
    @Getter
    protected String defaultValue;
  }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/PersistentVolumeClaimStorageClassEnricher.java`
#### Snippet
```java

    @Getter
    protected String key;
    @Getter
    protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/TriggersAnnotationEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
    }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ImageEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
    }

```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ControllerViaPluginConfigurationEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ControllerViaPluginConfigurationEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultControllerEnricher.java`
#### Snippet
```java
    protected String key;
    @Getter
    protected String defaultValue;
  }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultControllerEnricher.java`
#### Snippet
```java

    @Getter
    protected String key;
    @Getter
    protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/IngressEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/IngressEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/NameEnricher.java`
#### Snippet
```java

    @Getter
    protected String key;
  }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/BaseGenerator.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/BaseGenerator.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DependencyEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DependencyEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ContainerEnvJavaOptionsMergeEnricher.java`
#### Snippet
```java

    @Getter
    protected String key;
    @Getter
    protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ContainerEnvJavaOptionsMergeEnricher.java`
#### Snippet
```java
    protected String key;
    @Getter
    protected String defaultValue;
  }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DebugEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DebugEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ServiceAccountEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ServiceAccountEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/VolumePermissionEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/VolumePermissionEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultNamespaceEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultNamespaceEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ProjectLabelEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ProjectLabelEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/openshift/ImageChangeTriggerEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/openshift/ImageChangeTriggerEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/openshift/AutoTLSEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/openshift/AutoTLSEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/openshift/RouteEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/openshift/RouteEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `label` in enum 'RuntimeMode'
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/resource/RuntimeMode.java`
#### Snippet
```java
    public static final String JKUBE_EFFECTIVE_PLATFORM_MODE = "jkube.internal.effective.platform.mode";

    private String label;

    RuntimeMode(String label) {
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/AbstractHealthCheckEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/AbstractHealthCheckEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/WebAppHealthCheckEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/WebAppHealthCheckEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/ServiceDiscoveryEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/ServiceDiscoveryEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/PrometheusEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/PrometheusEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/KarafHealthCheckEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/KarafHealthCheckEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/jkube-kit-microprofile/src/main/java/org/eclipse/jkube/microprofile/enricher/AbstractMicroprofileHealthCheckEnricher.java`
#### Snippet
```java
    protected String key;
    @Getter
    protected String defaultValue;
  }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/jkube-kit-microprofile/src/main/java/org/eclipse/jkube/microprofile/enricher/AbstractMicroprofileHealthCheckEnricher.java`
#### Snippet
```java

    @Getter
    protected String key;
    @Getter
    protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/generator/webapp/src/main/java/org/eclipse/jkube/generator/webapp/WebAppGenerator.java`
#### Snippet
```java

    @Getter
    protected String key;
    @Getter
    protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/generator/webapp/src/main/java/org/eclipse/jkube/generator/webapp/WebAppGenerator.java`
#### Snippet
```java
    protected String key;
    @Getter
    protected String defaultValue;
  }

```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/jkube-kit-quarkus/src/main/java/org/eclipse/jkube/quarkus/enricher/QuarkusHealthCheckEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/jkube-kit-quarkus/src/main/java/org/eclipse/jkube/quarkus/enricher/QuarkusHealthCheckEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/jkube-kit-quarkus/src/main/java/org/eclipse/jkube/quarkus/generator/QuarkusGenerator.java`
#### Snippet
```java
    protected String key;
    @Getter
    protected String defaultValue;
  }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/jkube-kit-quarkus/src/main/java/org/eclipse/jkube/quarkus/generator/QuarkusGenerator.java`
#### Snippet
```java

    @Getter
    protected String key;
    @Getter
    protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/jkube-kit-wildfly-jar/src/main/java/org/eclipse/jkube/wildfly/jar/enricher/WildflyJARHealthCheckEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/jkube-kit-wildfly-jar/src/main/java/org/eclipse/jkube/wildfly/jar/enricher/WildflyJARHealthCheckEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/jkube-kit-micronaut/src/main/java/org/eclipse/jkube/micronaut/enricher/MicronautHealthCheckEnricher.java`
#### Snippet
```java
    protected String key;
    @Getter
    protected String defaultValue;
  }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/jkube-kit-micronaut/src/main/java/org/eclipse/jkube/micronaut/enricher/MicronautHealthCheckEnricher.java`
#### Snippet
```java

    @Getter
    protected String key;
    @Getter
    protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/generator/karaf/src/main/java/org/eclipse/jkube/generator/karaf/KarafGenerator.java`
#### Snippet
```java

    @Getter
    protected String key;
    @Getter(AccessLevel.PUBLIC)
    protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/generator/karaf/src/main/java/org/eclipse/jkube/generator/karaf/KarafGenerator.java`
#### Snippet
```java
    protected String key;
    @Getter(AccessLevel.PUBLIC)
    protected String defaultValue;
  }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/jkube-kit-thorntail-v2/src/main/java/org/eclipse/jkube/thorntail/v2/enricher/ThorntailV2HealthCheckEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/jkube-kit-thorntail-v2/src/main/java/org/eclipse/jkube/thorntail/v2/enricher/ThorntailV2HealthCheckEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
    }

```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/enricher/SpringBootHealthCheckEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/enricher/SpringBootHealthCheckEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/generator/java-exec/src/main/java/org/eclipse/jkube/generator/javaexec/JavaExecGenerator.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter(AccessLevel.PUBLIC)
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/generator/java-exec/src/main/java/org/eclipse/jkube/generator/javaexec/JavaExecGenerator.java`
#### Snippet
```java
        protected String key;
        @Getter(AccessLevel.PUBLIC)
        protected String defaultValue;
    }

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'Config'
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/generator/SpringBootGenerator.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'Config'
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/generator/SpringBootGenerator.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[P]` can be simplified to 'P'
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/AbstractPortsExtractor.java`
#### Snippet
```java
	private static final String NUMBER_REGEX = "\\d+";

	private static final String PORT_REGEX = "([a-zA-Z0-9_]+)(([\\.-_]+p)|([P]))ort";
	private static final Pattern PORT_PATTERN = Pattern.compile(PORT_REGEX);

```

### RegExpSimplifiable
`[-]` can be simplified to '-'
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/ImageName.java`
#### Snippet
```java
    // ---------------------------------------------------------------------
    // https://github.com/docker/docker/blob/04da4041757370fb6f85510c8977c5a18ddae380/vendor/github.com/docker/distribution/reference/regexp.go#L18
    private static final String nameComponentRegexp = "[a-z0-9]+(?:(?:(?:[._]|__|[-]*)[a-z0-9]+)+)?";

    // https://github.com/docker/docker/blob/04da4041757370fb6f85510c8977c5a18ddae380/vendor/github.com/docker/distribution/reference/regexp.go#L25
```

### RegExpSimplifiable
`[\\w]` can be simplified to '\\w'
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/ImageName.java`
#### Snippet
```java

    // https://github.com/docker/docker/blob/04da4041757370fb6f85510c8977c5a18ddae380/vendor/github.com/docker/distribution/reference/regexp.go#L37
    private static final Pattern TAG_REGEXP = Pattern.compile("^[\\w][\\w.-]{0,127}$");

    private static final Pattern DIGEST_REGEXP = Pattern.compile("^sha256:[a-z0-9]{32,}$");
```

### RegExpSimplifiable
`[-]` can be simplified to '-'
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/ImageName.java`
#### Snippet
```java

    // https://github.com/docker/docker/blob/04da4041757370fb6f85510c8977c5a18ddae380/vendor/github.com/docker/distribution/reference/regexp.go#L53
    private static final Pattern IMAGE_NAME_REGEXP = Pattern.compile(nameComponentRegexp + "(?:(?:/" + nameComponentRegexp + ")+)?");

    // https://github.com/docker/docker/blob/04da4041757370fb6f85510c8977c5a18ddae380/vendor/github.com/docker/distribution/reference/regexp.go#L31
```

### RegExpSimplifiable
`[-]` can be simplified to '-'
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/ImageName.java`
#### Snippet
```java

    // https://github.com/docker/docker/blob/04da4041757370fb6f85510c8977c5a18ddae380/vendor/github.com/docker/distribution/reference/regexp.go#L53
    private static final Pattern IMAGE_NAME_REGEXP = Pattern.compile(nameComponentRegexp + "(?:(?:/" + nameComponentRegexp + ")+)?");

    // https://github.com/docker/docker/blob/04da4041757370fb6f85510c8977c5a18ddae380/vendor/github.com/docker/distribution/reference/regexp.go#L31
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/AbstractPortsExtractor.java`
#### Snippet
```java
			} else if (value instanceof Map) {
				for (Map.Entry<String, String> entry : flatten((Map) value).entrySet()) {
					flat.put(new StringBuilder(stringKey).append(DOT).append(entry.getKey()).toString(),
							entry.getValue());
				}
```

## RuleId[id=Deprecation]
### Deprecation
'scale(int, boolean)' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/kubernetes/KubernetesClientUtil.java`
#### Snippet
```java
            if (scalable != null) {
                log.info("Scaling " + KubernetesHelper.getKind(entity) + " " + kubernetes.getNamespace() + "/" + name + " to replicas: " + replicas);
                scalable.scale(replicas, true);
            }
        }
```

### Deprecation
'createOrReplace()' is deprecated
in `jkube-kit/remote-dev/src/main/java/org/eclipse/jkube/kit/remotedev/LocalServiceManager.java`
#### Snippet
```java
        .endSpec()
        .build();
      kubernetesClient.services().resource(newService).createOrReplace();
      context.getManagedServices().put(localService, newService);
    }
```

### Deprecation
'createOrReplace()' is deprecated
in `jkube-kit/remote-dev/src/main/java/org/eclipse/jkube/kit/remotedev/LocalServiceManager.java`
#### Snippet
```java
        final Service previousService = Serialization.unmarshal(
          service.getMetadata().getAnnotations().get(PREVIOUS_SERVICE_ANNOTATION), Service.class);
        kubernetesClient.services().resource(previousService).createOrReplace();
      } else if (service != null) {
        kubernetesClient.services().resource(service).delete();
```

### Deprecation
'createOrReplace()' is deprecated
in `jkube-kit/remote-dev/src/main/java/org/eclipse/jkube/kit/remotedev/KubernetesSshServiceForwarder.java`
#### Snippet
```java
        .endContainer().endSpec();
    }
    return kubernetesClient.pods().resource(pod.build()).createOrReplace();
      // Using createOrReplace instead of SSA because MockServer doesn't support this PATCH
      // unless the resource already exists
```

### Deprecation
'createOrReplace()' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/openshift/OpenshiftBuildService.java`
#### Snippet
```java
            ImageStreamTag imageStreamTag = client.imageStreamTags().inNamespace(applicableOpenShiftNamespace).withName(resolveImageStreamTagName(imageName)).get();
            List<ImageStreamTag> imageStreamTags = createAdditionalTagsIfPresent(imageConfig, applicableOpenShiftNamespace, imageStreamTag);
            client.resourceList(imageStreamTags.toArray(new ImageStreamTag[0])).inNamespace(applicableOpenShiftNamespace).createOrReplace();
            log.info("Tags [%s] set to %s", String.join(",", additionalTagsToCreate), imageName.getNameWithoutTag());
        }
```

### Deprecation
'replace(T)' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
                    log.info("Updating a ServiceAccount from " + sourceName);
                    try {
                        Object answer = kubernetesClient.serviceAccounts().inNamespace(currentNamespace).withName(id).replace(serviceAccount);
                        logGeneratedEntity("Updated ServiceAccount: ", currentNamespace, serviceAccount, answer);
                    } catch (Exception e) {
```

### Deprecation
'replace(T)' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
                        log.info("Updating a Template from %s", sourceName);
                        try {
                            Object answer = openShiftClient.templates().inNamespace(currentNamespace).withName(id).replace(entity);
                            log.info("Updated Template: " + answer);
                        } catch (Exception e) {
```

### Deprecation
'createOrReplace()' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
            try {
                log.info("Applying %s %s from %s", getKind(entity), getName(entity), sourceName);
                kubernetesClient.resource(entity).inNamespace(applicableNamespace((HasMetadata) dto, namespace, fallbackNamespace)).createOrReplace();
            } catch (Exception e) {
                onApplyError("Failed to create " + getKind(entity) + " from " + sourceName + ". " + e, e);
```

### Deprecation
'create(T)' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
                if (old == null) {
                    log.info("Creating " + kind + " " + name + " from " + sourceName);
                    resource.create(entity);
                } else {
                    log.info("Updating " + kind + " " + name + " from " + sourceName);
```

### Deprecation
'createOrReplace()' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
                    copyAllImageStreamTags(entity, old);
                    entity = patchService.compareAndPatchEntity(currentNamespace, entity, old);
                    openShiftClient.resource(entity).inNamespace(currentNamespace).createOrReplace();
                }
            } catch (Exception e) {
```

### Deprecation
'create(T)' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
        log.info("Creating a ReplicationController from " + sourceName + " namespace " + namespace + " name " + getName(replicationController));
        try {
            Object answer = kubernetesClient.replicationControllers().inNamespace(namespace).create(replicationController);
            logGeneratedEntity("Created ReplicationController: ", namespace, replicationController, answer);
        } catch (Exception e) {
```

### Deprecation
'create(T)' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
        log.info("Creating a Pod from " + sourceName + " namespace " + namespace + " name " + getName(pod));
        try {
            Object answer = kubernetesClient.pods().inNamespace(namespace).create(pod);
            log.info("Created Pod result: " + answer);
        } catch (Exception e) {
```

### Deprecation
'create(T)' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
        if (!isRunning(old)) {
            try {
                Object answer = kubernetesClient.namespaces().create(entity);
                logGeneratedEntity("Created Namespace: ", currentNamespace, entity, answer);
                return true;
```

### Deprecation
'create(T)' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
        log.info("Creating a " + kind + " from " + sourceName + " namespace " + namespace + " name " + getName(resource));
        try {
            Object answer = resources.inNamespace(namespace).create(resource);
            logGeneratedEntity("Created " + kind + ": ", namespace, resource, answer);
        } catch (Exception e) {
```

### Deprecation
'replace(T)' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
                    log.info("Updating " + kind + " from " + sourceName);
                    try {
                        Object answer = resources.inNamespace(currentNamespace).withName(id).replace(resource);
                        logGeneratedEntity("Updated " + kind + ": ", currentNamespace, resource, answer);
                    } catch (Exception e) {
```

### Deprecation
'create(T)' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
        try {
            log.info("Creating RoleBinding from " + sourceName + " namespace " + namespace + " name " + getName(entity));
            kubernetesClient.rbac().roleBindings().inNamespace(namespace).create(entity);
        } catch (Exception e) {
            onApplyError("Failed to create RoleBinding from " + sourceName + ". " + e, e);
```

### Deprecation
'create(T)' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
        try {
            Object answer;
            answer = kubernetesClient.persistentVolumeClaims().inNamespace(namespace).create(entity);
            logGeneratedEntity("Created PersistentVolumeClaim: ", namespace, entity, answer);
        } catch (Exception e) {
```

### Deprecation
'replace(T)' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
                    } else {
                        try {
                            Object answer = openShiftClient.oAuthClients().withName(id).replace(entity);
                            log.info("Updated OAuthClient result: %s", answer);
                        } catch (Exception e) {
```

### Deprecation
'createOrReplace(T)' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
        }
        kubernetesClient.genericKubernetesResources(genericKubernetesResource.getApiVersion(), genericKubernetesResource.getKind()).inNamespace(applyNamespace).withName(name)
            .createOrReplace(genericKubernetesResource);
        log.info("Created Custom Resource: %s %s/%s", apiGroupWithKind, applyNamespace, name);
    }
```

### Deprecation
'create(T)' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
            log.info("Creating a Template from " + sourceName + " namespace " + namespace + " name " + getName(entity));
            try {
                final Template answer = asOpenShiftClient().templates().inNamespace(namespace).create(entity);
                logGeneratedEntity("Created Template: ", namespace, entity, answer);
            } catch (Exception e) {
```

### Deprecation
'create(T)' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
        log.info("Creating a Custom Resource Definition from " + sourceName + " name " + getName(entity));
        try {
            CustomResourceDefinition answer = kubernetesClient.apiextensions().v1().customResourceDefinitions().create(entity);
            log.info("Created Custom Resource Definition result: %s", answer.getMetadata().getName());
        } catch (Exception e) {
```

### Deprecation
'create(T)' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java

    public void doCreateJob(Job job, String namespace, String sourceName) {
        kubernetesClient.batch().v1().jobs().inNamespace(namespace).create(job);
        log.info("Creating a Job from " + sourceName + " namespace " + namespace + " name " + getName(job));
    }
```

### Deprecation
'create(T)' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
                (serviceAccount));
        try {
            Object answer = kubernetesClient.serviceAccounts().inNamespace(namespace).create(serviceAccount);
            logGeneratedEntity("Created ServiceAccount: ", namespace, serviceAccount, answer);
        } catch (Exception e) {
```

### Deprecation
'create(T)' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
        log.info("Creating a Secret from " + sourceName + " namespace " + namespace + " name " + getName(secret));
        try {
            Object answer = kubernetesClient.secrets().inNamespace(namespace).create(secret);
            logGeneratedEntity("Created Secret: ", namespace, secret, answer);
        } catch (Exception e) {
```

### Deprecation
'replace(T)' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
                        metadata.setNamespace(currentNamespace);
                        metadata.setResourceVersion(resourceVersion);
                        Object answer = kubernetesClient.rbac().roleBindings().inNamespace(currentNamespace).withName(id).replace(entity);
                        logGeneratedEntity("Updated RoleBinding: ", currentNamespace, entity, answer);
                    } catch (Exception e) {
```

### Deprecation
'create(T)' is deprecated
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
        log.info("Creating a Service from " + sourceName + " namespace " + namespace + " name " + getName(service));
        try {
            Object answer = kubernetesClient.services().inNamespace(namespace).create(service);
            logGeneratedEntity("Created Service: ", namespace, service, answer);
        } catch (Exception e) {
```

### Deprecation
'createConfigMapEntry(java.lang.String, java.nio.file.Path)' is deprecated
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ConfigMapEnricher.java`
#### Snippet
```java
                        name = filePath.getFileName().toString();
                    }
                    Map.Entry<String, String> fileEntry = createConfigMapEntry(name, filePath);
                    addNewEntryToExistingConfigMap(configMapBuilder, fileEntry, filePath);
                }
```

### Deprecation
'addNewEntryToExistingConfigMap(io.fabric8.kubernetes.api.model.ConfigMapBuilder, java.util.Map.Entry, java.nio.file.Path)' is deprecated
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ConfigMapEnricher.java`
#### Snippet
```java
                    }
                    Map.Entry<String, String> fileEntry = createConfigMapEntry(name, filePath);
                    addNewEntryToExistingConfigMap(configMapBuilder, fileEntry, filePath);
                }
            }
```

### Deprecation
'addNewEntryToExistingConfigMap(io.fabric8.kubernetes.api.model.ConfigMapBuilder, java.util.Map.Entry, java.nio.file.Path)' is deprecated
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ConfigMapEnricher.java`
#### Snippet
```java

import static org.eclipse.jkube.kit.enricher.api.util.KubernetesResourceUtil.addNewConfigMapEntriesToExistingConfigMap;
import static org.eclipse.jkube.kit.enricher.api.util.KubernetesResourceUtil.addNewEntryToExistingConfigMap;
import static org.eclipse.jkube.kit.enricher.api.util.KubernetesResourceUtil.createConfigMapEntry;

```

### Deprecation
'createConfigMapEntry(java.lang.String, java.nio.file.Path)' is deprecated
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ConfigMapEnricher.java`
#### Snippet
```java
import static org.eclipse.jkube.kit.enricher.api.util.KubernetesResourceUtil.addNewConfigMapEntriesToExistingConfigMap;
import static org.eclipse.jkube.kit.enricher.api.util.KubernetesResourceUtil.addNewEntryToExistingConfigMap;
import static org.eclipse.jkube.kit.enricher.api.util.KubernetesResourceUtil.createConfigMapEntry;

import java.io.IOException;
```

### Deprecation
'WRITE_EMPTY_JSON_ARRAYS' is deprecated
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/Serialization.java`
#### Snippet
```java
    for (ObjectMapper mapper : new ObjectMapper[]{JSON_MAPPER, YAML_MAPPER}) {
      mapper.enable(SerializationFeature.INDENT_OUTPUT)
        .disable(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS)
        .disable(SerializationFeature.WRITE_NULL_MAP_VALUES);
    }
```

### Deprecation
'WRITE_NULL_MAP_VALUES' is deprecated
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/Serialization.java`
#### Snippet
```java
      mapper.enable(SerializationFeature.INDENT_OUTPUT)
        .disable(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS)
        .disable(SerializationFeature.WRITE_NULL_MAP_VALUES);
    }
    YAML_MAPPER.registerModules(new JavaTimeModule(), KUBERNETES_SERIALIZATION.getUnmatchedFieldTypeModule());
```

### Deprecation
'createHttpClient(io.fabric8.kubernetes.client.Config)' is deprecated
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/IoUtil.java`
#### Snippet
```java
    public static void download(KitLogger log, URL downloadUrl, File target) throws IOException {
        log.progressStart();
        try (HttpClient client = HttpClientUtils.createHttpClient(Config.empty()).newBuilder().build()) {
            final HttpResponse<InputStream> response = client.sendAsync(
                client.newHttpRequestBuilder().timeout(30, TimeUnit.MINUTES).url(downloadUrl).build(), InputStream.class)
```

### Deprecation
'JsonParser()' is deprecated
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/validator/ResourceValidator.java`
#### Snippet
```java
        ObjectMapper objectMapper = new ObjectMapper();
        String rootNode = objectMapper.readValue(schemaUrl, JsonNode.class).toString();
        JsonObject jsonObject = new JsonParser().parse(rootNode).getAsJsonObject();
        jsonObject.remove("id");
        return jsonObject;
```

### Deprecation
'parse(java.lang.String)' is deprecated
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/validator/ResourceValidator.java`
#### Snippet
```java
        ObjectMapper objectMapper = new ObjectMapper();
        String rootNode = objectMapper.readValue(schemaUrl, JsonNode.class).toString();
        JsonObject jsonObject = new JsonParser().parse(rootNode).getAsJsonObject();
        jsonObject.remove("id");
        return jsonObject;
```

### Deprecation
'replace()' is deprecated
in `jkube-kit/watcher/standard/src/main/java/org/eclipse/jkube/watcher/standard/DockerImageWatcher.java`
#### Snippet
```java
            DeploymentSpec spec = resource.getSpec();
            if (spec != null && updateImageName(entity, spec.getTemplate(), imagePrefix, imageName)) {
                kubernetes.apps().deployments().inNamespace(namespace).resource(resource).replace();
                kubernetes.apps().deployments().inNamespace(namespace).withName(name).rolling().restart();
            }
```

### Deprecation
'replace()' is deprecated
in `jkube-kit/watcher/standard/src/main/java/org/eclipse/jkube/watcher/standard/DockerImageWatcher.java`
#### Snippet
```java
            ReplicaSetSpec spec = resource.getSpec();
            if (spec != null && updateImageName(entity, spec.getTemplate(), imagePrefix, imageName)) {
                kubernetes.apps().replicaSets().inNamespace(namespace).resource(resource).replace();
                kubernetes.apps().replicaSets().inNamespace(namespace).withName(name).rolling().restart();
            }
```

### Deprecation
'replace()' is deprecated
in `jkube-kit/watcher/standard/src/main/java/org/eclipse/jkube/watcher/standard/DockerImageWatcher.java`
#### Snippet
```java
            ReplicationControllerSpec spec = resource.getSpec();
            if (spec != null && updateImageName(entity, spec.getTemplate(), imagePrefix, imageName)) {
                kubernetes.replicationControllers().inNamespace(namespace).resource(resource).replace();
                kubernetes.replicationControllers().inNamespace(namespace).withName(name).rolling().restart();
            }
```

### Deprecation
'replace()' is deprecated
in `jkube-kit/watcher/standard/src/main/java/org/eclipse/jkube/watcher/standard/DockerImageWatcher.java`
#### Snippet
```java
                    log.warn("Ignoring DeploymentConfig %s as not connected to an OpenShift cluster", name);
                } else {
                    openshiftClient.deploymentConfigs().inNamespace(namespace).resource(resource).replace();
                }
            }
```

### Deprecation
'inline(org.eclipse.jkube.kit.common.Assembly)' is deprecated
in `jkube-kit/generator/webapp/src/main/java/org/eclipse/jkube/generator/webapp/WebAppGenerator.java`
#### Snippet
```java
        .targetDir(getDeploymentDir(handler))
        .excludeFinalOutputArtifact(true)
        .inline(Assembly.builder()
            .file(AssemblyFile.builder()
                .source(sourceFile)
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `jkube-kit/jkube-kit-quarkus/src/main/java/org/eclipse/jkube/quarkus/generator/QuarkusNestedGenerator.java`
#### Snippet
```java
  static QuarkusNestedGenerator from(GeneratorContext context, GeneratorConfig config) {
    // Legacy (Quarkus 1.0) settings support
    if (Boolean.parseBoolean(config.get(QuarkusGenerator.Config.NATIVE_IMAGE))) {
      return new NativeGenerator(context, config);
    }
```

### Deprecation
'inline(org.eclipse.jkube.kit.common.Assembly)' is deprecated
in `jkube-kit/generator/karaf/src/main/java/org/eclipse/jkube/generator/karaf/KarafGenerator.java`
#### Snippet
```java
        .targetDir(getConfig(Config.BASE_DIR))
        .name("deployments")
        .inline(Assembly.builder()
            .fileSet(AssemblyFileSet.builder()
                .directory(new File(getProject().getBuildDirectory(), "assembly"))
```

### Deprecation
'com.google.cloud.tools.jib.api.LayerConfiguration' is deprecated
in `jkube-kit/build/service/jib/src/main/java/org/eclipse/jkube/kit/service/jib/JibServiceUtil.java`
#### Snippet
```java
import javax.annotation.Nonnull;

import static com.google.cloud.tools.jib.api.LayerConfiguration.DEFAULT_FILE_PERMISSIONS_PROVIDER;
import static org.fusesource.jansi.Ansi.ansi;

```

### Deprecation
'getExecutionProperties()' is deprecated
in `jkube-kit/common-maven/src/main/java/org/eclipse/jkube/kit/common/util/MavenUtil.java`
#### Snippet
```java
                properties.putAll(mavenSession.getSystemProperties());
            }
            if (mavenSession.getExecutionProperties() != null) {
                properties.putAll(mavenSession.getExecutionProperties());
            }
```

### Deprecation
'getExecutionProperties()' is deprecated
in `jkube-kit/common-maven/src/main/java/org/eclipse/jkube/kit/common/util/MavenUtil.java`
#### Snippet
```java
            }
            if (mavenSession.getExecutionProperties() != null) {
                properties.putAll(mavenSession.getExecutionProperties());
            }
        }
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/ValidationUtil.java`
#### Snippet
```java
                ObjectMeta metadata = hasMetadata.getMetadata();
                if (metadata != null) {
                    leafBean = "" + hasMetadata.getKind() + ": " + metadata;
                }
            }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/task/KubernetesDebugTask.java`
#### Snippet
```java
      jKubeServiceHub.getDebugService().debug(
          kubernetesExtension.getNamespaceOrNull(), manifest.getName(), entities,
          "" + kubernetesExtension.getLocalDebugPortOrDefault(), kubernetesExtension.getDebugSuspendOrDefault(),
          createLogger("[[Y]][W][[Y]] [[s]]"));
    } catch (IOException ex) {
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/KubernetesResourceUtil.java`
#### Snippet
```java
    // we could also use an annotation?
    private static boolean isLocalCustomisation(PodSpec podSpec) {
        List<Container> containers = podSpec.getContainers() != null ? podSpec.getContainers() : Collections.<Container>emptyList();
        for (Container container : containers) {
            if (StringUtils.isNotBlank(container.getImage())) {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/PropertyConfigHandler.java`
#### Snippet
```java
                .env(MapUtil.mergeMaps(
                        valueProvider.getMap(ENV_RUN, config == null ? null : config.getEnv()),
                        valueProvider.getMap(ENV, Collections.<String, String>emptyMap())
                ))
                .labels(valueProvider.getMap(LABELS, config == null ? null : config.getLabels()))
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java
        Optional<Integer> successThreshold = getIntegerValue(Config.SUCCESS_THRESHOLD, readiness);
        Optional<Integer> failureThreshold = getIntegerValue(Config.FAILURE_THRESHOLD, readiness);
        List<String> command = getListValue(Config.COMMAND, readiness).orElse(Collections.<String>emptyList());
        Map<String, String> headers = getMapValue(Config.HEADERS, readiness).orElse(Collections.<String, String>emptyMap());

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java
        Optional<Integer> failureThreshold = getIntegerValue(Config.FAILURE_THRESHOLD, readiness);
        List<String> command = getListValue(Config.COMMAND, readiness).orElse(Collections.<String>emptyList());
        Map<String, String> headers = getMapValue(Config.HEADERS, readiness).orElse(Collections.<String, String>emptyMap());


```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ContainerDetails.java`
#### Snippet
```java
        return config.has(LABELS) ?
                mapLabels(config.getAsJsonObject(LABELS)) :
                Collections.<String, String>emptyMap();
    }

```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/win/NamedPipe.java`
#### Snippet
```java
        return new FilterOutputStream(Channels.newOutputStream(channel)) {
            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                if(log.isDebugEnabled()){
                    String request = new String(b, off, len, StandardCharsets.UTF_8);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/win/NamedPipe.java`
#### Snippet
```java

            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                int readed = super.read(b, off, len);
                log.debug("RESPONSE %s", new String(b, off, len, StandardCharsets.UTF_8));
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/unix/UnixSocket.java`
#### Snippet
```java
        return new FilterOutputStream(Channels.newOutputStream(channel)) {
            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                out.write(b, off, len);
            }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/GoTimeUtil.java`
#### Snippet
```java

/**
 * Utility methods for using durations according to Docker/Go format (https://golang.org/pkg/time/#ParseDuration).
 */
public class GoTimeUtil {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/TimeUtil.java`
#### Snippet
```java
     * Calculate the duration between now and the given time
     *
     * Taken mostly from http://stackoverflow.com/a/5062810/207604 . Kudos to @dblevins
     *
     * @param start starting time (in milliseconds)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/FileUtil.java`
#### Snippet
```java

    /**
     * <b>Adapted from https://github.com/sonatype/plexus-utils/blob/5ba6cfcca911200b5b9d2b313bb939e6d7cbbac6/src/main/java/org/codehaus/plexus/util/PathTool.java#L302</b>
     *
     * <p>This method can calculate the relative path between two paths on a file system.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/TemplateUtil.java`
#### Snippet
```java

  /**
   * Ported from https://github.com/fabric8io/fabric8-maven-plugin/commit/d6bdaa37e06863677bc01cefa31f7d23c6d5f0f9
   *
   * @param template String to escape
```

### JavadocLinkAsPlainText
Link specified as plain text
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/JKubeProjectUtil.java`
#### Snippet
```java
   * <p> In case no artifacts are found or configured, this method returns null.
   *
   * <p> TODO: https://github.com/eclipse/jkube/issues/817
   * <br> This method prioritizes artifact inference instead of configuration. This is done to handle case of maven
   * where value of artifact varies depending upon the maven phase in which goal was executed.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/EnvUtil.java`
#### Snippet
```java
     * Calculate the duration between now and the given time
     *
     * <p> Taken mostly from http://stackoverflow.com/a/5062810/207604 . Kudos to @dblevins
     *
     * @param start starting time (in milliseconds)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/CreateImageOptions.java`
#### Snippet
```java

/**
 * https://docs.docker.com/engine/api/v1.41/#operation/ImageCreate
 */
public class CreateImageOptions {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/BuildOptions.java`
#### Snippet
```java

/**
 * https://docs.docker.com/engine/api/v1.41/#operation/ImageBuild
 * @author roland
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
    /**
     * Try using the AWS credentials provided via ENV variables.
     * See https://docs.aws.amazon.com/cli/latest/userguide/cli-configure-envvars.html
     */
    private static AuthConfig getAuthConfigFromAwsEnvironmentVariables(AwsSdkHelper awsSdkHelper, KitLogger log) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
   * Validate that the provided filename is a valid Windows filename.
   *
   * The validation of the Windows filename is copied from stackoverflow: https://stackoverflow.com/a/6804755
   *
   * @param filename the filename
```

### JavadocLinkAsPlainText
Link specified as plain text
in `jkube-kit/common-maven/src/main/java/org/eclipse/jkube/kit/common/util/MojoExecutionService.java`
#### Snippet
```java
 *
 * Inspired by and partly reused from
 * https://github.com/TimMoore/mojo-executor but adapted to newer Maven versions.
 *
 * @author roland
```

### JavadocLinkAsPlainText
Link specified as plain text
in `jkube-kit/build/service/jib/src/main/java/org/eclipse/jkube/kit/service/jib/JibServiceUtil.java`
#### Snippet
```java
     * Generates the progress bar line.
     *
     * Taken from https://github.com/GoogleContainerTools/jib/blob/master/jib-plugins-common/src/main/java/com/google/cloud/tools/jib/plugins/common/logging/ProgressDisplayGenerator.java#L66
     *
     * @param progress the overall progress, with {@code 1.0} meaning fully complete
```

### JavadocLinkAsPlainText
Link specified as plain text
in `jkube-kit/build/service/jib/src/main/java/org/eclipse/jkube/kit/service/jib/JibServiceUtil.java`
#### Snippet
```java
     * Generates a progress display.
     *
     * Taken from https://github.com/GoogleContainerTools/jib/blob/master/jib-plugins-common/src/main/java/com/google/cloud/tools/jib/plugins/common/logging/ProgressDisplayGenerator.java#L47
     *
     * @param progress the overall progress, with {@code 1.0} meaning fully complete
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/validator/ResourceValidator.java`
#### Snippet
```java
    private KitLogger log;
    private final File[] resources;
    private ResourceClassifier target = ResourceClassifier.KUBERNETES;
    private final List<ValidationRule> ignoreValidationRules = new ArrayList<>();

```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `CountDownLatch.await()` is ignored
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/openshift/OpenshiftBuildService.java`
#### Snippet
```java
            }
        })) {
            readyLatch.await(nAwaitTimeout, TimeUnit.SECONDS);
        } catch (KubernetesClientException e) {
            log.error("Could not watch pod", e);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
        if (logJsonDir != null) {
            File namespaceDir = new File(logJsonDir, namespace);
            namespaceDir.mkdirs();
            String kind = getKind(entity);
            String name = getName(entity);
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/ExternalCommand.java`
#### Snippet
```java
            statusCode = process.waitFor();
            executor.shutdown();
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (IllegalThreadStateException e) {
            process.destroy();
```

### IgnoreResultOfCall
Result of `Matcher.matches()` is ignored
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/DockerFileBuilder.java`
#### Snippet
```java
            // Matches always.  If there is a tcp/udp protocol, should end up in the second group
            // and get factored out.  If it's something invalid, it should get stuck to the first group.
            matcher.matches();
            Integer.valueOf(matcher.group(1));
            return input.toLowerCase();
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `jkube-kit/build/service/jib/src/main/java/org/eclipse/jkube/kit/service/jib/JibServiceUtil.java`
#### Snippet
```java
        } finally {
            jibBuildExecutor.shutdown();
            jibBuildExecutor.awaitTermination(JIB_EXECUTOR_SHUTDOWN_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        }
    }
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `jkube-kit/build/service/jib/src/main/java/org/eclipse/jkube/kit/service/jib/JibServiceUtil.java`
#### Snippet
```java
        } finally {
            jibBuildExecutor.shutdown();
            jibBuildExecutor.awaitTermination(JIB_EXECUTOR_SHUTDOWN_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        }
    }
```

### IgnoreResultOfCall
Result of `Matcher.matches()` is ignored
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/PortMapping.java`
#### Snippet
```java
            Matcher matcher = PROTOCOL_SPLIT_PATTERN.matcher(input);
            // Matches always
            matcher.matches();
            String mapping = matcher.group(1);
            String protocol = matcher.group(2);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/generator/SpringBootGenerator.java`
#### Snippet
```java
    private void appendSecretTokenToFile(String path, String token) {
        File file = new File(getProject().getBaseDirectory(), path);
        file.getParentFile().mkdirs();
        String text = String.format("%s" +
                        "# Remote secret added by jkube-kit-plugin\n" +
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/generator/SpringBootGenerator.java`
#### Snippet
```java
    private void copyFilesToFatJar(List<File> libs, List<File> classes, File target) throws IOException {
        File tmpZip = File.createTempFile(target.getName(), null);
        tmpZip.delete();

        // Using Apache commons rename, because renameTo has issues across file systems
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/generator/SpringBootGenerator.java`
#### Snippet
```java
            }
        }
        tmpZip.delete();
    }

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getRuntimeMode()` is identical to its super method
in `kubernetes-maven-plugin/plugin/src/main/java/org/eclipse/jkube/maven/plugin/mojo/build/ResourceMojo.java`
#### Snippet
```java

    @Override
    protected RuntimeMode getRuntimeMode() {
        return RuntimeMode.KUBERNETES;
    }
```

### RedundantMethodOverride
Method `getChannel()` is identical to its super method
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/win/NamedPipe.java`
#### Snippet
```java

    @Override
    public SocketChannel getChannel() {
        return null;
    }
```

### RedundantMethodOverride
Method `getChannel()` is identical to its super method
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/unix/UnixSocket.java`
#### Snippet
```java

    @Override
    public SocketChannel getChannel() {
        return null;
    }
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import lombok.Singular;`
in `jkube-kit/resource/helm/src/main/java/org/eclipse/jkube/kit/resource/helm/HelmConfig.java`
#### Snippet
```java
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Singular;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.jkube.kit.common.Maintainer;
```

## RuleId[id=InfiniteLoopStatement]
### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/PortForwardService.java`
#### Snippet
```java
                    monitor.lock();

                    while (true) {
                        if (podEquals(currentPod, nextForwardedPod[0])) {
                            podChanged.await();
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/KitLogger.java`
#### Snippet
```java
        @Override
        public void warn(String format, Object... params) {
            System.out.println(String.format(format,params));
        }

```

### RedundantStringFormatCall
Redundant call to `format()`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/KitLogger.java`
#### Snippet
```java
        @Override
        public void error(String format, Object... params) {
            System.out.println(String.format(format,params));
        }

```

### RedundantStringFormatCall
Redundant call to `format()`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/KitLogger.java`
#### Snippet
```java
        @Override
        public void info(String format, Object... params) {
            System.out.println(String.format(format,params));
        }

```

### RedundantStringFormatCall
Redundant call to `format()`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/KitLogger.java`
#### Snippet
```java
        @Override
        public void debug(String format, Object... params) {
            System.out.println(String.format(format,params));
        }

```

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'equals()' call
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/KubernetesResourceUtil.java`
#### Snippet
```java
            String n1 = cp.getName();
            String n2 = port.getName();
            if (n1 != null && n2 != null && n1.equals(n2)) {
                return;
            }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `tag` initializer `null` is redundant
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/openshift/ImageStreamService.java`
#### Snippet
```java
            spec.setTags(tags);
        }
        TagReference tag = null;
        if (tags.isEmpty()) {
            tag = new TagReference();
```

### UnusedAssignment
Variable `specBuilder` initializer `null` is redundant
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/openshift/OpenshiftBuildService.java`
#### Snippet
```java

    private BuildConfigSpec getBuildConfigSpec(BuildStrategy buildStrategyResource, BuildOutput buildOutput) {
        BuildConfigSpecBuilder specBuilder = null;

        // Check for BuildConfig resource fragment
```

### UnusedAssignment
Variable `recreateMode` initializer `isRecreateMode()` is redundant
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
                    log.info("Template has not changed so not doing anything");
                } else {
                    boolean recreateMode = isRecreateMode();
                    // TODO seems you can't update templates right now
                    recreateMode = true;
```

### UnusedAssignment
Variable `withMethod` initializer `null` is redundant
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/KubernetesResourceUtil.java`
#### Snippet
```java

            String fieldName = targetGetMethod.getName().substring(3);
            Method withMethod = null;
            try {
                withMethod = tc.getMethod("with" + fieldName, fieldType);
```

### UnusedAssignment
Variable `sourceGetMethod` initializer `null` is redundant
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/KubernetesResourceUtil.java`
#### Snippet
```java
            }

            Method sourceGetMethod = null;
            try {
                sourceGetMethod = sc.getMethod("get" + fieldName);
```

### UnusedAssignment
Variable `beanInfo` initializer `null` is redundant
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/UserConfigurationCompare.java`
#### Snippet
```java
    protected static boolean configEqualKubernetesDTO(@NotNull Object entity1, @NotNull Object entity2, @NotNull Class<?> clazz) {
        // let's iterate through the objects making sure we've not
        BeanInfo beanInfo = null;
        try {
            beanInfo = Introspector.getBeanInfo(clazz);
```

### UnusedAssignment
Variable `skipExtendedAuthentication` initializer `false` is redundant
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/auth/RegistryAuthConfig.java`
#### Snippet
```java
    private final Map<String, String> defaultConfig;

    private boolean skipExtendedAuthentication = false;

    private final String propertyPrefix;
```

### UnusedAssignment
Variable `mainClass` initializer `null` is redundant
in `jkube-kit/generator/java-exec/src/main/java/org/eclipse/jkube/generator/javaexec/MainClassDetector.java`
#### Snippet
```java
class MainClassDetector {

    private String mainClass = null;
    private final File classesDir;
    private final KitLogger log;
```

### UnusedAssignment
Variable `bytesRead` initializer `-1` is redundant
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/generator/SpringBootGenerator.java`
#### Snippet
```java

        byte[] buffer = new byte[8192];
        int bytesRead = -1;
        try (InputStream is = new FileInputStream(file)) {
            CRC32 crc = new CRC32();
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `alwaysRecreate` is always `true`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
                log.info("PersistentVolumeClaim has not changed so not doing anything");
            } else {
                if (alwaysRecreate || isRecreateMode()) {
                    if (!isRecreateMode() && isIgnoreBoundPersistentVolumeClaims() && isBound(old)) {
                        log.warn("PersistentVolumeClaim " + id + " in namespace " + currentNamespace + " is already bound and will not be replaced with the new one from " + sourceName);
```

### ConstantValue
Condition `alwaysRecreate || isRecreateMode()` is always `true`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
                log.info("PersistentVolumeClaim has not changed so not doing anything");
            } else {
                if (alwaysRecreate || isRecreateMode()) {
                    if (!isRecreateMode() && isIgnoreBoundPersistentVolumeClaims() && isBound(old)) {
                        log.warn("PersistentVolumeClaim " + id + " in namespace " + currentNamespace + " is already bound and will not be replaced with the new one from " + sourceName);
```

### ConstantValue
Condition `recreateMode` is always `true`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
                    // TODO seems you can't update templates right now
                    recreateMode = true;
                    if (recreateMode) {
                        openShiftClient.templates().inNamespace(currentNamespace).withName(id).delete();
                        doCreateTemplate(entity, currentNamespace, sourceName);
```

### ConstantValue
Condition `path != null` is always `true`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
                    if (basedir != null) {
                        String path = FileUtil.getRelativePath(basedir, file).getPath();
                        if (path != null) {
                            fileLocation = FileUtil.stripPrefix(path, "/");
                        }
```

### ConstantValue
Condition `portsFromImageLabels == null` is always `false`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java

            // Extract first port and remove first element
            if(portsFromImageLabels == null || portsFromImageLabels.isEmpty()) {
                addPortIfNotNull(ret, extractPortsFromImageSpec(image.getName(), podPorts.remove(0), shiftOrNull(configuredPorts), null));
            } else {
```

### ConstantValue
Value `getUrl` is always 'null'
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/handler/ProbeHandler.java`
#### Snippet
```java
            }
            if(getUrl==null)
                return new TCPSocketAction(getUrl, portObj);
            String validurl = getUrl.replaceFirst("(([a-zA-Z])+)://","http://");
            try{
```

### ConstantValue
Value `defaultName` is always 'null'
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/KubernetesResourceUtil.java`
#### Snippet
```java
                        } else {
                            PodSpecBuilder podSpecBuilder = new PodSpecBuilder(podSpec1);
                            mergePodSpec(podSpecBuilder, podSpec2, defaultName);
                            updateTemplate.setSpec(podSpecBuilder.build());
                        }
```

### ConstantValue
Condition `runCmds != null` is always `true`
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/DockerFileBuilder.java`
#### Snippet
```java

    private void addOptimisation() {
        if (runCmds != null && !runCmds.isEmpty() && shouldOptimise) {
            String optimisedRunCmd = StringUtils.join(runCmds.iterator(), " && ");
            runCmds.clear();
```

### ConstantValue
Condition `config == null` is always `false`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/PropertyConfigHandler.java`
#### Snippet
```java
        }

        if (valueProvider.getMap(FROM_EXT, config == null ? null : config.getFromExt()) != null) {
            return true;
        }
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/ValidationUtil.java`
#### Snippet
```java
                }
            }
            builder.append(violation.getPropertyPath() + " " + violation.getMessage() + " on bean: " + leafBean);
        }
        return builder.toString();
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.jkube.kit.config.service.PatchService.EntityPatcher\>' to 'org.eclipse.jkube.kit.config.service.PatchService.EntityPatcher'
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/PatchService.java`
#### Snippet
```java

    public <T extends HasMetadata> T compareAndPatchEntity(String namespace, T newDto, T oldDto) {
        EntityPatcher<T> dispatcher = (EntityPatcher<T>) patchers.get(newDto.getKind());
        if (dispatcher == null) {
            throw new IllegalArgumentException("Internal: No patcher for " + newDto.getKind() + " found");
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'. Reason: 'map' has raw type, so result of entrySet is erased
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/AbstractPortsExtractor.java`
#### Snippet
```java
	private Map<String, String> flatten(Map map) {
		Map<String, String> flat = new HashMap<>();
		Set<Entry> mapEntrySet = map.entrySet();
		for (Entry mapEntry : mapEntrySet) {
			String stringKey = String.valueOf(mapEntry.getKey());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
    public void apply(Object dto, String sourceName) {
        if (dto instanceof List) {
            List<Object> list = (List<Object>) dto;
            for (Object element : list) {
                if (dto == element) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `kubernetes-maven-plugin/plugin/src/main/java/org/eclipse/jkube/maven/plugin/mojo/build/ResourceMojo.java`
#### Snippet
```java
        throws IOException {
      return ConfigHelper.initImageConfiguration(
          getBuildTimestamp(getPluginContext(), CONTEXT_KEY_BUILD_TIMESTAMP, project.getBuild().getDirectory(),
              DOCKER_BUILD_TIMESTAMP),
          images, imageConfigResolver,
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `kubernetes-maven-plugin/plugin/src/main/java/org/eclipse/jkube/maven/plugin/mojo/develop/WatchMojo.java`
#### Snippet
```java
                .removeVolumes(removeVolumes)
                .containerNamePattern(containerNamePattern)
                .buildTimestamp(getBuildTimestamp(getPluginContext(), CONTEXT_KEY_BUILD_TIMESTAMP, project.getBuild().getDirectory(), DOCKER_BUILD_TIMESTAMP))
                .gavLabel(getGavLabel())
                .buildContext(initJKubeConfiguration())
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `kubernetes-maven-plugin/plugin/src/main/java/org/eclipse/jkube/maven/plugin/mojo/build/AbstractDockerMojo.java`
#### Snippet
```java
                    .offline(offline)
                    .build();
                resolvedImages = ConfigHelper.initImageConfiguration(getBuildTimestamp(getPluginContext(), CONTEXT_KEY_BUILD_TIMESTAMP, project.getBuild().getDirectory(), DOCKER_BUILD_TIMESTAMP), images, imageConfigResolver, log, filter, this, jkubeServiceHub.getConfiguration());
                executeInternal();
            } catch (IOException | DependencyResolutionRequiredException exp) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `kubernetes-maven-plugin/plugin/src/main/java/org/eclipse/jkube/maven/plugin/mojo/build/AbstractDockerMojo.java`
#### Snippet
```java
            // TODO need to refactor d-m-p to avoid this call
            EnvUtil.storeTimestamp(getBuildTimestampFile(project.getBuild().getDirectory(), DOCKER_BUILD_TIMESTAMP),
                    getBuildTimestamp(getPluginContext(), CONTEXT_KEY_BUILD_TIMESTAMP, project.getBuild().getDirectory(), DOCKER_BUILD_TIMESTAMP));

            jkubeServiceHub.getBuildService().build(imageConfigs.toArray(new ImageConfiguration[0]));
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `kubernetes-maven-plugin/plugin/src/main/java/org/eclipse/jkube/maven/plugin/mojo/build/AbstractDockerMojo.java`
#### Snippet
```java
        if (dispatcher == null) {
            dispatcher = new LogDispatcher(hub.getDockerAccess());
            getPluginContext().put(CONTEXT_KEY_LOG_DISPATCHER, dispatcher);
        }
        return dispatcher;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/KubernetesResourceUtil.java`
#### Snippet
```java
            return meta;
        } else if (mo instanceof Map) {
            return (Map<String, Object>) mo;
        } else {
            throw new IllegalArgumentException("Metadata is expected to be a Map, not a " + mo.getClass());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/ClassUtil.java`
#### Snippet
```java
                try {
                    if (!tried.contains(loader)) {
                        return (Class<T>) Class.forName(className, true, loader);
                    }
                } catch (ClassNotFoundException ignored) {}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/MapUtil.java`
#### Snippet
```java
                            nodes[it] + "> overlaps with key)");
                    }
                    currentNode = (Map<String, Object>) tempNode;
                }
                final Object previousNodeValue = currentNode.put(nodes[nodes.length -1], v);
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/UserConfigurationCompare.java`
#### Snippet
```java
        if (left.equals(right)) {
            return left;
        } else if (left.isAssignableFrom(right)) {
            return getCommonDenominator(left, right.getSuperclass());
        } else if (right.isAssignableFrom(left)) {
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/UserConfigurationCompare.java`
#### Snippet
```java
        } else if (left.isAssignableFrom(right)) {
            return getCommonDenominator(left, right.getSuperclass());
        } else if (right.isAssignableFrom(left)) {
            return getCommonDenominator(left.getSuperclass(), right);
        } else {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/UserConfigurationCompare.java`
#### Snippet
```java
            return configEqualObjectMeta(castTo(ObjectMeta.class, entity1), castTo(ObjectMeta.class, entity2));
        } else if (entity1 instanceof Collection && entity2 instanceof Collection) {
            return collectionsEqual((Collection) entity1, (Collection) entity2);
        } else {
            Class<?> aClass = getCommonDenominator(entity1.getClass(), entity2.getClass());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/UserConfigurationCompare.java`
#### Snippet
```java
            return configEqualObjectMeta(castTo(ObjectMeta.class, entity1), castTo(ObjectMeta.class, entity2));
        } else if (entity1 instanceof Collection && entity2 instanceof Collection) {
            return collectionsEqual((Collection) entity1, (Collection) entity2);
        } else {
            Class<?> aClass = getCommonDenominator(entity1.getClass(), entity2.getClass());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'. Reason: 'entity1' has raw type, so result of entrySet is erased
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/UserConfigurationCompare.java`
#### Snippet
```java
            return false;
        }
        Set<Map.Entry> entries = entity1.entrySet();
        for (Map.Entry entry : entries) {
            Object key = entry.getKey();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class' to 'java.lang.Class'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/Serialization.java`
#### Snippet
```java

  public static <T> T unmarshal(File file) throws IOException {
    return unmarshal(file, (Class<T>) KubernetesResource.class);
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class' to 'java.lang.Class'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/Serialization.java`
#### Snippet
```java

  public static <T> T unmarshal(URL url) throws IOException {
    return unmarshal(url, (Class<T>) KubernetesResource.class);
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class' to 'java.lang.Class'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/Serialization.java`
#### Snippet
```java

  public static <T> T unmarshal(String objectAsString) {
    return unmarshal(objectAsString, (Class<T>) KubernetesResource.class);
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/KarafHealthCheckEnricher.java`
#### Snippet
```java
        }

        final Map<String, Object> startUpFeaturesObject = (Map<String, Object>) startupFeatures;
        final Object feature = startUpFeaturesObject.get("feature");

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/KarafHealthCheckEnricher.java`
#### Snippet
```java

            if (feature instanceof List) {
                final List<String> features = (List<String>) feature;

                for (String featureValue : features) {
```

### UNCHECKED_WARNING
Unchecked call to 'getOrElse(T)' as a member of raw type 'org.gradle.api.provider.Provider'
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/task/KubernetesConfigViewTask.java`
#### Snippet
```java
        if (method.getParameters().length == 0 && Property.class.isAssignableFrom(method.getReturnType())) {
          effectiveConfig.put(CaseUtils.toCamelCase(method.getName().replaceFirst("^get", ""), false),
              ((Property) method.invoke(kubernetesExtension)).getOrElse(null));
        }
      }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java

            // Get configuration from global plugin config
            ret = getAuthConfigFromPluginConfiguration(lookupMode, authConfigMap, passwordDecryptionMethod);
            if (ret != null) {
                log.debug("AuthConfig: credentials from plugin config");
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map,capture\>' to 'java.util.Map'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
        String configMapKey = lookupMode.getConfigMapKey();
        if (configMapKey == null) {
            return (Map<String, String>)authConfigMap;
        }
        if (authConfigMap != null) {
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'java.util.Map'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
        }
        if (authConfigMap != null) {
            return (Map<String, String>)authConfigMap.get(configMapKey);
        }
        return null;
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/RegistryAuthConfiguration.java`
#### Snippet
```java

        if (push != null) {
            authMap.put("push", push);
        }
        if (pull != null) {
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/RegistryAuthConfiguration.java`
#### Snippet
```java
        }
        if (pull != null) {
            authMap.put("pull", pull);
        }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/RegistryAuthConfiguration.java`
#### Snippet
```java
        for (int i = 0; i < content.length; i += 2) {
            if (content[i + 1] != null && content[i + 1].length() > 0) {
                authMap.put(content[i], content[i+1]);
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `jkube-kit/common-maven/src/main/java/org/eclipse/jkube/kit/common/util/MavenConfigurationExtractor.java`
#### Snippet
```java
        final Object insertedValue = conf.get(currentElement.getName());
        if (insertedValue instanceof List) {
            ((List) insertedValue).add(currentElement.getValue());
        } else if (insertedValue instanceof String) {
            final List<String> list = new ArrayList<>();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/generator/VertxPortsExtractor.java`
#### Snippet
```java
                return null;
            }
            Map<String, Object> config = (Map<String, Object>)pluginConfiguration.get("config");
            return config != null ? config.get("vertxConfig").toString() : null;
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'java.util.List\>'
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/KubernetesConfigAuthUtil.java`
#### Snippet
```java
    }

    for (Map<String, ?> contextMap : (List<Map<String, ?>>) kubeConfig.get("contexts")) {
      if (currentContextName.equals(contextMap.get("name"))) {
        return parseContext(kubeConfig, (Map<String, ?>) contextMap.get("context"));
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'java.util.Map'
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/KubernetesConfigAuthUtil.java`
#### Snippet
```java
    for (Map<String, ?> contextMap : (List<Map<String, ?>>) kubeConfig.get("contexts")) {
      if (currentContextName.equals(contextMap.get("name"))) {
        return parseContext(kubeConfig, (Map<String, ?>) contextMap.get("context"));
      }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'java.util.List\>'
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/KubernetesConfigAuthUtil.java`
#### Snippet
```java
    }

    List<Map<String, ?>> users = (List<Map<String, ?>>) kubeConfig.get("users");
    if (users == null) {
      return null;
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'java.util.Map'
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/KubernetesConfigAuthUtil.java`
#### Snippet
```java
    for (Map<String, ?> userMap : users) {
      if (userName.equals(userMap.get("name"))) {
        return parseUser(userName, (Map<String, ?>) userMap.get("user"));
      }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java
        return element.map(input -> {
            if (input instanceof Map) {
                return (Map<String, String>) input;
            } else {
                throw new IllegalArgumentException(String.format(
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java
        return element.map(input -> {
            if (input instanceof Map) {
                final Collection<Object> values = ((Map<String, Object>) input).values();
                List<String> elements = new ArrayList<>();
                for (Object value : values) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java
                for (Object value : values) {
                    if (value instanceof List) {
                        List<String> currentValues = (List<String>) value;
                        elements.addAll(currentValues);
                    } else {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java
            Stream.of(path)).collect(Collectors.toList())) {
            if (currentRoot instanceof Map) {
                currentRoot = ((Map<String, Object>) currentRoot).get(key);
                if (currentRoot == null) {
                    return Optional.empty();
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Passing a non-null argument to `Optional`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/AssemblyConfiguration.java`
#### Snippet
```java
    @Deprecated
    public Assembly getInline() {
        return Optional.ofNullable(getLayers())
            .filter(l -> !l.isEmpty())
            .map(l -> l.get(l.size() - 1))
```

### DataFlowIssue
Dereference of `dir.listFiles(DIR_FILTER)` may produce `NullPointerException`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/ClassUtil.java`
#### Snippet
```java

    private static void findClasses(List<String> classes, File dir, String prefix) throws IOException {
        for (File subDir : dir.listFiles(DIR_FILTER)) {
            findClasses(classes, subDir, prefix);
        }
```

### DataFlowIssue
Dereference of `dir.listFiles(CLASS_FILE_FILTER)` may produce `NullPointerException`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/ClassUtil.java`
#### Snippet
```java
        }

        for (File classFile : dir.listFiles(CLASS_FILE_FILTER)) {
            try (InputStream is = new FileInputStream(classFile)) {
                if (hasMainMethod(is)) {
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/task/KubernetesConfigViewTask.java`
#### Snippet
```java
        if (method.getParameters().length == 0 && Property.class.isAssignableFrom(method.getReturnType())) {
          effectiveConfig.put(CaseUtils.toCamelCase(method.getName().replaceFirst("^get", ""), false),
              ((Property) method.invoke(kubernetesExtension)).getOrElse(null));
        }
      }
```

### DataFlowIssue
Variable is already assigned to this value
in `jkube-kit/profile/src/main/java/org/eclipse/jkube/kit/profile/ProfileUtil.java`
#### Snippet
```java
                if (profileFound != null) {
                    if (profileFound.getParentProfile() != null) {
                        profileFound = inheritFromParentProfile(profileFound, resourceDir);
                        log.info("{} inheriting resources from {}", profileFound, profileFound.getParentProfile());
                    }
```

### DataFlowIssue
Argument `relativePath` might be null
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/assembly/AssemblyManager.java`
#### Snippet
```java
        // Replace build target dir from destfile and add changed-files build dir instead
        String relativePath = FileUtil.getRelativeFilePath(assemblyDir.getCanonicalPath(), destFile.getCanonicalPath());
        return new File(archiveDir, relativePath);
    }

```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/resource/ServiceProtocol.java`
#### Snippet
```java
 */
public enum ServiceProtocol {
    UDP, TCP;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `jkube-kit/watcher/standard/src/main/java/org/eclipse/jkube/watcher/standard/PodExecutor.java`
#### Snippet
```java
    final KubernetesClient client = watcherContext.getJKubeServiceHub().getClient();
    try (
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    ) {
      final String namespace = watcherContext.getNamespace();
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/HealthCheckMode.java`
#### Snippet
```java
     * A command based health check.
     */
    cmd;

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildImageSelectMode.java`
#### Snippet
```java

    // Include all builds with alias names as classifiers
    all;

}
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'ANNOTATION_KEY' is still used
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DockerRegistrySecretEnricher.java`
#### Snippet
```java
     */
    @Deprecated
    private static final String ANNOTATION_KEY = "maven.jkube.io/dockerServerId";
    private static final String DOCKER_SERVER_ID_ANNOTATION_KEY = INTERNAL_ANNOTATION_PREFIX + "/dockerServerId";
    private static final String ENRICHER_NAME = "jkube-docker-registry-secret";
```

### DeprecatedIsStillUsed
Deprecated member 'PULL_POLICY' is still used
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ControllerViaPluginConfigurationEnricher.java`
#### Snippet
```java
         */
        @Deprecated
        PULL_POLICY("pullPolicy", JKUBE_DEFAULT_IMAGE_PULL_POLICY),
        REPLICA_COUNT("replicaCount", "1"),
        SCHEDULE("schedule", null);
```

### DeprecatedIsStillUsed
Deprecated member 'PULL_POLICY' is still used
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultControllerEnricher.java`
#### Snippet
```java
     */
    @Deprecated
    PULL_POLICY("pullPolicy", JKUBE_DEFAULT_IMAGE_PULL_POLICY),
    TYPE("type", null),
    REPLICA_COUNT("replicaCount", "1"),
```

### DeprecatedIsStillUsed
Deprecated member 'PREFIX_ANNOTATION' is still used
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/FileDataSecretEnricher.java`
#### Snippet
```java
     */
    @Deprecated
    protected static final String PREFIX_ANNOTATION = "maven.jkube.io/secret/";
    protected static final String FILEDATASECRET_PREFIX_ANNOTATION = INTERNAL_ANNOTATION_PREFIX + "/secret/";

```

### DeprecatedIsStillUsed
Deprecated member 'DEFAULT_STORAGE_CLASS' is still used
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/VolumePermissionEnricher.java`
#### Snippet
```java
         */
        @Deprecated
        DEFAULT_STORAGE_CLASS("defaultStorageClass", null),
        /**
         * @deprecated Use configuration field in PersistentVolumeClaimStorageClassEnricher
```

### DeprecatedIsStillUsed
Deprecated member 'USE_ANNOTATION' is still used
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/VolumePermissionEnricher.java`
#### Snippet
```java
         */
        @Deprecated
        USE_ANNOTATION("useStorageClassAnnotation", "false"),
        CPU_LIMIT("cpuLimit", null),
        CPU_REQUEST("cpuRequest", null),
```

### DeprecatedIsStillUsed
Deprecated member 'PREFIX_ANNOTATION' is still used
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ConfigMapEnricher.java`
#### Snippet
```java
     */
    @Deprecated
    protected static final String PREFIX_ANNOTATION = "maven.jkube.io/cm/";

    protected static final String CONFIGMAP_PREFIX_ANNOTATION = INTERNAL_ANNOTATION_PREFIX + "/cm/";
```

### DeprecatedIsStillUsed
Deprecated member 'DEPRECATED_JKUBE_ANNOTATION_PREFIX' is still used
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/resource/JKubeAnnotations.java`
#### Snippet
```java
     */
    @Deprecated
    private static final String DEPRECATED_JKUBE_ANNOTATION_PREFIX = "jkube.io";
    private final String annotation;

```

### DeprecatedIsStillUsed
Deprecated member 'env' is still used
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/resource/ResourceConfig.java`
#### Snippet
```java
   */
  @Deprecated
  private Map<String, String> env;
  private MetaDataConfig labels;
  private MetaDataConfig annotations;
```

### DeprecatedIsStillUsed
Deprecated member 'imagePullPolicy' is still used
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/resource/ResourceConfig.java`
#### Snippet
```java
   */
  @Deprecated
  private String imagePullPolicy;

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'replicas' is still used
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/resource/ResourceConfig.java`
#### Snippet
```java
   */
  @Deprecated
  private Integer replicas;
  private String namespace;
  private String serviceAccount;
```

### DeprecatedIsStillUsed
Deprecated member 'startup' is still used
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/resource/ResourceConfig.java`
#### Snippet
```java
   */
  @Deprecated
  private ProbeConfig startup;
  private MetricsConfig metrics;

```

### DeprecatedIsStillUsed
Deprecated member 'controllerName' is still used
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/resource/ResourceConfig.java`
#### Snippet
```java
   */
  @Deprecated
  private String controllerName;
  @Singular
  private List<ServiceConfig> services;
```

### DeprecatedIsStillUsed
Deprecated member 'volumes' is still used
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/resource/ResourceConfig.java`
#### Snippet
```java
  @Deprecated
  @Singular
  private List<VolumeConfig> volumes;
  @Singular
  private List<SecretConfig> secrets;
```

### DeprecatedIsStillUsed
Deprecated member 'restartPolicy' is still used
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/resource/ResourceConfig.java`
#### Snippet
```java
   */
  @Deprecated
  private String restartPolicy;
  private ControllerResourceConfig controller;
  private boolean useLegacyJKubePrefix;
```

### DeprecatedIsStillUsed
Deprecated member 'containerPrivileged' is still used
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/resource/ResourceConfig.java`
#### Snippet
```java
   */
  @Deprecated
  private boolean containerPrivileged;

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'readiness' is still used
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/resource/ResourceConfig.java`
#### Snippet
```java
   */
  @Deprecated
  private ProbeConfig readiness;
  /**
   * @deprecated Use nested controller configuration instead
```

### DeprecatedIsStillUsed
Deprecated member 'liveness' is still used
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/resource/ResourceConfig.java`
#### Snippet
```java
   */
  @Deprecated
  private ProbeConfig liveness;
  /**
   * @deprecated Use nested controller configuration instead
```

### DeprecatedIsStillUsed
Deprecated member 'inline' is still used
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/AssemblyConfiguration.java`
#### Snippet
```java
     */
    @Deprecated
    private Assembly inline;
    /**
     * Each of the layers ({@link Assembly} for the Container Image.
```

### DeprecatedIsStillUsed
Deprecated member 'addNewEntriesFromDirectoryToExistingConfigMap' is still used
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/KubernetesResourceUtil.java`
#### Snippet
```java
     */
    @Deprecated
    public static void addNewEntriesFromDirectoryToExistingConfigMap(ConfigMapBuilder configMapBuilder, final Path path)
        throws IOException {
        try (Stream<Path> files = Files.list(path)) {
```

### DeprecatedIsStillUsed
Deprecated member 'addNewEntryToExistingConfigMap' is still used
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/KubernetesResourceUtil.java`
#### Snippet
```java
     */
    @Deprecated
    public static void addNewEntryToExistingConfigMap(ConfigMapBuilder configMapBuilder, Map.Entry<String, String> entry, final Path file)
        throws IOException {
        if (isFileWithBinaryContent(file)) {
```

### DeprecatedIsStillUsed
Deprecated member 'createConfigMapEntry' is still used
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/KubernetesResourceUtil.java`
#### Snippet
```java
     */
    @Deprecated
    public static Map.Entry<String, String> createConfigMapEntry(final String key, final Path file) throws IOException {
        final byte[] bytes = Files.readAllBytes(file);
        if (isFileWithBinaryContent(file)) {
```

### DeprecatedIsStillUsed
Deprecated member 'NATIVE_IMAGE' is still used
in `jkube-kit/jkube-kit-quarkus/src/main/java/org/eclipse/jkube/quarkus/generator/QuarkusGenerator.java`
#### Snippet
```java
     */
    @Deprecated
    NATIVE_IMAGE("nativeImage", "false");

    @Getter
```

## RuleId[id=WebProperties]
### WebProperties
Cannot resolve class or package 'faces'
in `quickstarts/maven/webapp-wildfly-datasource/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'webapp'
in `quickstarts/maven/webapp-wildfly-datasource/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class 'FacesServlet'
in `quickstarts/maven/webapp-wildfly-datasource/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'faces'
in `quickstarts/gradle/webapp-wildfly/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'webapp'
in `quickstarts/gradle/webapp-wildfly/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class 'FacesServlet'
in `quickstarts/gradle/webapp-wildfly/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

## RuleId[id=ShiftOutOfRange]
### ShiftOutOfRange
Shift operation `>>>` by overly large constant value 32
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/Timestamp.java`
#### Snippet
```java
    public int hashCode() {
        int result = date.hashCode();
        result = 31 * result + (int) (rest ^ (rest >>> 32));
        return result;
    }
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'Arrays.asList()' call
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DependencyEnricher.java`
#### Snippet
```java
        });
        processArtifactSetResources(this.kubernetesTemplateDependencyArtifacts, items -> {
            List<HasMetadata> templates = Arrays.asList(items.toArray(new HasMetadata[0]));

            // lets remove all the plain resources (without any ${PARAM} expressions) which match objects
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/task/KubernetesRemoteDevTask.java`
#### Snippet
```java
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
      if (jKubeServiceHub.getLog() instanceof AnsiLogger) {
        // Perform uninstall before Maven does to avoid race conditions and messages being logged as Ansi to a closed
        // AnsiConsole
        AnsiConsole.systemUninstall();
      }
      remoteDevelopmentService.stop();
    }));
    try {
      remoteDevelopmentService.start().get();
    } catch (ExecutionException e) {
      remoteDevelopmentService.stop();
    } catch (InterruptedException e) {
      remoteDevelopmentService.stop();
      Thread.currentThread().interrupt();
    }
```

### DuplicatedCode
Duplicated code
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ContainerDetails.java`
#### Snippet
```java
        int length = labels.size();
        Map<String, String> mapped = new HashMap<>(length);

        Iterator<String> iterator = labels.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            mapped.put(key, labels.get(key).getAsString());
        }

        return mapped;
```

### DuplicatedCode
Duplicated code
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
                    JsonObject securityCredentials = new Gson().fromJson(r, JsonObject.class);

                    String user = securityCredentials.getAsJsonPrimitive("AccessKeyId").getAsString();
                    String password = securityCredentials.getAsJsonPrimitive("SecretAccessKey").getAsString();
                    String token = securityCredentials.getAsJsonPrimitive("Token").getAsString();

                    log.debug("Received temporary access key %s...", user.substring(0, 8));
```

### DuplicatedCode
Duplicated code
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/AnsiLoggerFacade.java`
#### Snippet
```java
        Map<String,Integer> imgLineMap = imageLines.get();
        Integer line = imgLineMap.get(imageId);

        int diff = 0;
        if (line == null) {
            line = imgLineMap.size();
            imgLineMap.put(imageId, line);
        } else {
            diff = imgLineMap.size() - line;
        }

        if (diff > 0) {
            print(ansi().cursorUp(diff).eraseLine(Ansi.Erase.ALL).toString());
        }

        // Status with progress bars: (max length = 11, hence pad to 11)
        // Extracting
        // Downloading
        String progress = progressMessage != null ? progressMessage : "";
```

### DuplicatedCode
Duplicated code
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/AnsiLoggerFacade.java`
#### Snippet
```java
        AtomicInteger count = updateCount.get();
        int nr = count.getAndIncrement();
        if (nr % NON_ANSI_UPDATE_PERIOD == 0) {
            print("#");
        }
        if (nr > 0 && nr % (80 * NON_ANSI_UPDATE_PERIOD) == 0) {
            print("\n");
        }
```

### DuplicatedCode
Duplicated code
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
        ImageStreamSpec toSpec = to.getSpec();
        if (toSpec == null) {
            toSpec = new ImageStreamSpec();
            to.setSpec(toSpec);
        }
        List<TagReference> toTags = toSpec.getTags();
        if (toTags == null) {
            toTags = new ArrayList<>();
            toSpec.setTags(toTags);
        }
```

### DuplicatedCode
Duplicated code
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DebugEnricher.java`
#### Snippet
```java
                    if (ports == null) {
                        ports = new ArrayList<>();
                    }
                    if (!KubernetesHelper.containsPort(ports, remoteDebugPort)) {
                        ContainerPort port = KubernetesHelper.addPort(remoteDebugPort, "debug", log);
                        if (port != null) {
                            ports.add(port);
                            container.setPorts(ports);
                            enabled = true;
                        }
                    }
```

### DuplicatedCode
Duplicated code
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/KubernetesResourceUtil.java`
#### Snippet
```java
        if (item1 != null && item2 != null) {
            ObjectMeta metadata1 = item1.getMetadata();
            ObjectMeta metadata2 = item2.getMetadata();
            if (metadata1 == null) {
                item1.setMetadata(metadata2);
            } else if (metadata2 != null) {
                metadata1.setAnnotations(mergeMapsAndRemoveEmptyStrings(metadata2.getAnnotations(), metadata1.getAnnotations()));
                metadata1.setLabels(mergeMapsAndRemoveEmptyStrings(metadata2.getLabels(), metadata1.getLabels()));
            }
        }
```

### DuplicatedCode
Duplicated code
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ControllerViaPluginConfigurationEnricher.java`
#### Snippet
```java
                    if (spec.getTemplate() != null && spec.getTemplate().getSpec() != null) {
                        final PodSpec podSpec = spec.getTemplate().getSpec();
                        builder.accept(new TypedVisitor<PodSpecBuilder>() {
                            @Override
                            public void visit(PodSpecBuilder builder) {
                                String defaultApplicationContainerName = KubernetesResourceUtil.mergePodSpec(builder, podSpec, name, getValueFromConfig(SIDECAR, false));
                                if(defaultApplicationContainerName != null) {
                                    setProcessingInstruction(NEED_IMAGECHANGE_TRIGGERS, Collections.singletonList(defaultApplicationContainerName));
                                }
                            }
                        });
                    }
```

### DuplicatedCode
Duplicated code
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/MavenIssueManagementEnricher.java`
#### Snippet
```java
builder.accept(new TypedVisitor<ServiceBuilder>() {
            @Override
            public void visit(ServiceBuilder serviceBuilder) {
                serviceBuilder.editMetadata().addToAnnotations(getAnnotations()).endMetadata();
            }
        });

        builder.accept(new TypedVisitor<DeploymentBuilder>() {
            @Override
            public void visit(DeploymentBuilder builder) {
                builder.editMetadata().addToAnnotations(getAnnotations()).endMetadata();
            }
        });

        builder.accept(new TypedVisitor<DeploymentConfigBuilder>() {
            @Override
            public void visit(DeploymentConfigBuilder builder) {
                builder.editMetadata().addToAnnotations(getAnnotations()).endMetadata();
            }
        });

        builder.accept(new TypedVisitor<ReplicaSetBuilder>() {
            @Override
            public void visit(ReplicaSetBuilder builder) {
                builder.editMetadata().addToAnnotations(getAnnotations()).endMetadata();
            }
        });

        builder.accept(new TypedVisitor<ReplicationControllerBuilder>() {
            @Override
            public void visit(ReplicationControllerBuilder builder) {
                builder.editMetadata().addToAnnotations(getAnnotations()).endMetadata();
            }
        });

        builder.accept(new TypedVisitor<DaemonSetBuilder>() {
            @Override
            public void visit(DaemonSetBuilder builder) {
                builder.editMetadata().addToAnnotations(getAnnotations()).endMetadata();
            }
        });

        builder.accept(new TypedVisitor<StatefulSetBuilder>() {
            @Override
            public void visit(StatefulSetBuilder builder) {
                builder.editMetadata().addToAnnotations(getAnnotations()).endMetadata();
            }
        });

        builder.accept(new TypedVisitor<JobBuilder>() {
            @Override
            public void visit(JobBuilder builder) {
                builder.editMetadata().addToAnnotations(getAnnotations()).endMetadata();
            }
        });
```

### DuplicatedCode
Duplicated code
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ProjectLabelEnricher.java`
#### Snippet
```java
                Map<String, String> selectors = new HashMap<>();
                if(builder.buildSpec() != null && builder.buildSpec().getSelector() != null && builder.buildSpec().getSelector().getMatchLabels() != null) {
                    selectors.putAll(builder.buildSpec().getSelector().getMatchLabels());
                }
                MapUtil.mergeIfAbsent(selectors, createLabels());
                builder.editOrNewSpec().editOrNewSelector().withMatchLabels(selectors).endSelector().endSpec();
```

### DuplicatedCode
Duplicated code
in `jkube-kit/jkube-kit-helidon/src/main/java/org/eclipse/jkube/helidon/HelidonUtils.java`
#### Snippet
```java
    for (Supplier<Properties> source : sources) {
      final Properties props = source.get();
      if (!props.isEmpty()) {
        props.putAll(toMap(javaProject.getProperties()));
        return props;
      }
    }
    return javaProject.getProperties();
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `jkube-kit/generator/webapp/src/main/java/org/eclipse/jkube/generator/webapp/handler/AbstractAppServerHandler.java`
#### Snippet
```java
     *
     * @param patterns one or more patterns to match files in the build directory.
     * @return list of files found matching the provided pattern.
     */
    private String[] scanFiles(String... patterns) throws IOException {
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/PortForwardService.java`
#### Snippet
```java
                        try {
                            currentPortForward.close();
                        } catch (Exception e) {}
                    }
                }
```

### CatchMayIgnoreException
Empty `catch` block
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/PortForwardService.java`
#### Snippet
```java
            try {
                watch.close();
            } catch (Exception e) {}
            try {
                forwarderThread.interrupt();
```

### CatchMayIgnoreException
Empty `catch` block
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/DockerRegistryAuthHandler.java`
#### Snippet
```java
                return extractAuthConfigFromAuths(registryToLookup, dockerConfig.getAsJsonObject("auths"));
            }
        } catch (IOException exception) {

        }
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/ClassUtil.java`
#### Snippet
```java

        for (File classFile : dir.listFiles(CLASS_FILE_FILTER)) {
            try (InputStream is = new FileInputStream(classFile)) {
                if (hasMainMethod(is)) {
                    classes.add(convertToClass(classFile.getAbsolutePath(), prefix));
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/archive/JKubeTarArchiver.java`
#### Snippet
```java
        tarArchiveOutputStream.putArchiveEntry(tarEntry);
        if (currentFile.isFile()) {
          try (InputStream fis = new FileInputStream(currentFile)) {
            IOUtils.copy(fis, tarArchiveOutputStream);
          }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/validator/ResourceValidator.java`
#### Snippet
```java

    private JsonNode geFileContent(File file) throws IOException {
        try (InputStream resourceStream = new FileInputStream(file)) {
            ObjectMapper jsonMapper = new ObjectMapper(new YAMLFactory());
            return jsonMapper.readTree(resourceStream);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/KeyStoreUtil.java`
#### Snippet
```java

    private static Certificate[] loadCertificates(String certPath) throws IOException, CertificateException {
        try (InputStream is = new FileInputStream(certPath)) {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X509");
            Collection<? extends Certificate> certs = certificateFactory.generateCertificates(is);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/log/DefaultLogCallback.java`
#### Snippet
```java
                if (cachedPs == null) {
                    Files.createParentDirs(new File(file));
                    PrintStream ps = new PrintStream(new FileOutputStream(file), true);
                    cachedPs = new SharedPrintStream(ps);
                    printStreamMap.put(file, cachedPs);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/DockerAccessWithHcClient.java`
#### Snippet
```java
        return response -> {
            try (InputStream stream = response.getEntity().getContent();
                 OutputStream out = compression.wrapOutputStream(new FileOutputStream(filename))) {
                IOUtils.copy(stream, out, 65536);
            }
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/PortMapping.java`
#### Snippet
```java
        private void writeProperties(Properties props, String file) throws IOException {
            File propFile = new File(file);
            try (OutputStream os = new FileOutputStream(propFile)) {
                props.store(os, "Docker ports");
            } catch (IOException e) {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/generator/SpringBootGenerator.java`
#### Snippet
```java
        byte[] buffer = new byte[8192];
        int bytesRead = -1;
        try (InputStream is = new FileInputStream(file)) {
            CRC32 crc = new CRC32();
            int size = 0;
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/generator/SpringBootGenerator.java`
#### Snippet
```java

        byte[] buffer = new byte[8192];
        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(tmpZip));
             ZipOutputStream out = new ZipOutputStream(new FileOutputStream(target))) {
            for (ZipEntry ze = zin.getNextEntry(); ze != null; ze = zin.getNextEntry()) {
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/generator/SpringBootGenerator.java`
#### Snippet
```java
        byte[] buffer = new byte[8192];
        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(tmpZip));
             ZipOutputStream out = new ZipOutputStream(new FileOutputStream(target))) {
            for (ZipEntry ze = zin.getNextEntry(); ze != null; ze = zin.getNextEntry()) {
                if (matchesFatJarEntry(libs, ze.getName(), true) || matchesFatJarEntry(classes, ze.getName(), false)) {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/generator/SpringBootGenerator.java`
#### Snippet
```java

            for (File lib : libs) {
                try (InputStream in = new FileInputStream(lib)) {
                    out.putNextEntry(createZipEntry(lib, getFatJarFullPath(lib, true)));
                    for (int read = in.read(buffer); read > -1; read = in.read(buffer)) {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/generator/SpringBootGenerator.java`
#### Snippet
```java

            for (File cls : classes) {
                try (InputStream in = new FileInputStream(cls)) {
                    out.putNextEntry(createZipEntry(cls, getFatJarFullPath(cls, false)));
                    for (int read = in.read(buffer); read > -1; read = in.read(buffer)) {
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/RevisionHistoryEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/RevisionHistoryEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/PersistentVolumeClaimStorageClassEnricher.java`
#### Snippet
```java
    protected String key;
    @Getter
    protected String defaultValue;
  }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/PersistentVolumeClaimStorageClassEnricher.java`
#### Snippet
```java

    @Getter
    protected String key;
    @Getter
    protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/TriggersAnnotationEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ImageEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ControllerViaPluginConfigurationEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ControllerViaPluginConfigurationEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultControllerEnricher.java`
#### Snippet
```java
    protected String key;
    @Getter
    protected String defaultValue;
  }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultControllerEnricher.java`
#### Snippet
```java

    @Getter
    protected String key;
    @Getter
    protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/IngressEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/IngressEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/NameEnricher.java`
#### Snippet
```java

    @Getter
    protected String key;
  }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/BaseGenerator.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/BaseGenerator.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DependencyEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DependencyEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ContainerEnvJavaOptionsMergeEnricher.java`
#### Snippet
```java

    @Getter
    protected String key;
    @Getter
    protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ContainerEnvJavaOptionsMergeEnricher.java`
#### Snippet
```java
    protected String key;
    @Getter
    protected String defaultValue;
  }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DebugEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DebugEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ServiceAccountEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ServiceAccountEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/VolumePermissionEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/VolumePermissionEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultNamespaceEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultNamespaceEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ProjectLabelEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ProjectLabelEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/openshift/ImageChangeTriggerEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/openshift/ImageChangeTriggerEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/openshift/AutoTLSEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/openshift/AutoTLSEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/openshift/RouteEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/openshift/RouteEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/AbstractHealthCheckEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/AbstractHealthCheckEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/WebAppHealthCheckEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/WebAppHealthCheckEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/ServiceDiscoveryEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/ServiceDiscoveryEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/PrometheusEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/PrometheusEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/KarafHealthCheckEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/KarafHealthCheckEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/jkube-kit-microprofile/src/main/java/org/eclipse/jkube/microprofile/enricher/AbstractMicroprofileHealthCheckEnricher.java`
#### Snippet
```java
    protected String key;
    @Getter
    protected String defaultValue;
  }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/jkube-kit-microprofile/src/main/java/org/eclipse/jkube/microprofile/enricher/AbstractMicroprofileHealthCheckEnricher.java`
#### Snippet
```java

    @Getter
    protected String key;
    @Getter
    protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/generator/webapp/src/main/java/org/eclipse/jkube/generator/webapp/WebAppGenerator.java`
#### Snippet
```java

    @Getter
    protected String key;
    @Getter
    protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/generator/webapp/src/main/java/org/eclipse/jkube/generator/webapp/WebAppGenerator.java`
#### Snippet
```java
    protected String key;
    @Getter
    protected String defaultValue;
  }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/jkube-kit-quarkus/src/main/java/org/eclipse/jkube/quarkus/enricher/QuarkusHealthCheckEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/jkube-kit-quarkus/src/main/java/org/eclipse/jkube/quarkus/enricher/QuarkusHealthCheckEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/jkube-kit-quarkus/src/main/java/org/eclipse/jkube/quarkus/generator/QuarkusGenerator.java`
#### Snippet
```java
    protected String key;
    @Getter
    protected String defaultValue;
  }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/jkube-kit-quarkus/src/main/java/org/eclipse/jkube/quarkus/generator/QuarkusGenerator.java`
#### Snippet
```java

    @Getter
    protected String key;
    @Getter
    protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/jkube-kit-wildfly-jar/src/main/java/org/eclipse/jkube/wildfly/jar/enricher/WildflyJARHealthCheckEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/jkube-kit-wildfly-jar/src/main/java/org/eclipse/jkube/wildfly/jar/enricher/WildflyJARHealthCheckEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/jkube-kit-micronaut/src/main/java/org/eclipse/jkube/micronaut/enricher/MicronautHealthCheckEnricher.java`
#### Snippet
```java
    protected String key;
    @Getter
    protected String defaultValue;
  }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/jkube-kit-micronaut/src/main/java/org/eclipse/jkube/micronaut/enricher/MicronautHealthCheckEnricher.java`
#### Snippet
```java

    @Getter
    protected String key;
    @Getter
    protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/generator/karaf/src/main/java/org/eclipse/jkube/generator/karaf/KarafGenerator.java`
#### Snippet
```java

    @Getter
    protected String key;
    @Getter(AccessLevel.PUBLIC)
    protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/generator/karaf/src/main/java/org/eclipse/jkube/generator/karaf/KarafGenerator.java`
#### Snippet
```java
    protected String key;
    @Getter(AccessLevel.PUBLIC)
    protected String defaultValue;
  }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/jkube-kit-thorntail-v2/src/main/java/org/eclipse/jkube/thorntail/v2/enricher/ThorntailV2HealthCheckEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/jkube-kit-thorntail-v2/src/main/java/org/eclipse/jkube/thorntail/v2/enricher/ThorntailV2HealthCheckEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/enricher/SpringBootHealthCheckEnricher.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/enricher/SpringBootHealthCheckEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/generator/java-exec/src/main/java/org/eclipse/jkube/generator/javaexec/JavaExecGenerator.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter(AccessLevel.PUBLIC)
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/generator/java-exec/src/main/java/org/eclipse/jkube/generator/javaexec/JavaExecGenerator.java`
#### Snippet
```java
        protected String key;
        @Getter(AccessLevel.PUBLIC)
        protected String defaultValue;
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/generator/SpringBootGenerator.java`
#### Snippet
```java

        @Getter
        protected String key;
        @Getter
        protected String defaultValue;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/generator/SpringBootGenerator.java`
#### Snippet
```java
        protected String key;
        @Getter
        protected String defaultValue;
    }

```

## RuleId[id=CdiInjectionPointsInspection]
### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/task/KubernetesHelmTask.java`
#### Snippet
```java
public class KubernetesHelmTask extends AbstractJKubeTask {
  @Inject
  public KubernetesHelmTask(Class<? extends KubernetesExtension> extensionClass) {
    super(extensionClass);
    setDescription("Generates a Helm chart for the kubernetes resources.");
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/task/KubernetesWatchTask.java`
#### Snippet
```java
public class KubernetesWatchTask extends AbstractJKubeTask {
  @Inject
  public KubernetesWatchTask(Class<? extends KubernetesExtension> extensionClass) {
    super(extensionClass);
    setDescription("Used to automatically rebuild Docker images and restart containers in case of updates.");
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/task/KubernetesLogTask.java`
#### Snippet
```java

  @Inject
  public KubernetesLogTask(Class<? extends KubernetesExtension> extensionClass) {
    super(extensionClass);
    setDescription(
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/task/KubernetesPushTask.java`
#### Snippet
```java
public class KubernetesPushTask extends AbstractJKubeTask {
  @Inject
  public KubernetesPushTask(Class<? extends KubernetesExtension> extensionClass) {
    super(extensionClass);
    setDescription("Uploads the built Docker images to a Docker registry");
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/task/KubernetesHelmPushTask.java`
#### Snippet
```java
public class KubernetesHelmPushTask extends AbstractJKubeTask {
  @Inject
  public KubernetesHelmPushTask(Class<? extends KubernetesExtension> extensionClass) {
    super(extensionClass);
    setDescription("Upload a helm chart to specified helm repository.");
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/task/KubernetesRemoteDevTask.java`
#### Snippet
```java

  @Inject
  public KubernetesRemoteDevTask(Class<? extends KubernetesExtension> extensionClass) {
    super(extensionClass);
    setDescription("Starts a new JKube remote development session.");
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/task/KubernetesDebugTask.java`
#### Snippet
```java

  @Inject
  public KubernetesDebugTask(Class<? extends KubernetesExtension> extensionClass) {
    super(extensionClass);
    setDescription(
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/task/KubernetesUndeployTask.java`
#### Snippet
```java

  @Inject
  public KubernetesUndeployTask(Class<? extends KubernetesExtension> extensionClass) {
    super(extensionClass);
    setDescription("Undeploys (deletes) the kubernetes resources generated by the current project.");
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `gradle-plugin/openshift/src/main/java/org/eclipse/jkube/gradle/plugin/task/OpenShiftHelmPushTask.java`
#### Snippet
```java
public class OpenShiftHelmPushTask extends KubernetesHelmPushTask implements OpenShiftJKubeTask {
  @Inject
  public OpenShiftHelmPushTask(Class<? extends OpenShiftExtension> extensionClass) {
    super(extensionClass);
    setDescription(
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `gradle-plugin/openshift/src/main/java/org/eclipse/jkube/gradle/plugin/task/OpenShiftBuildTask.java`
#### Snippet
```java

  @Inject
  public OpenShiftBuildTask(Class<? extends OpenShiftExtension> extensionClass) {
    super(extensionClass);
    setDescription(
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `gradle-plugin/openshift/src/main/java/org/eclipse/jkube/gradle/plugin/task/OpenShiftHelmTask.java`
#### Snippet
```java

  @Inject
  public OpenShiftHelmTask(Class<? extends OpenShiftExtension> extensionClass) {
    super(extensionClass);
    setDescription(
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `gradle-plugin/openshift/src/main/java/org/eclipse/jkube/gradle/plugin/task/OpenShiftRemoteDevTask.java`
#### Snippet
```java
public class OpenShiftRemoteDevTask extends KubernetesRemoteDevTask implements OpenShiftJKubeTask {
  @Inject
  public OpenShiftRemoteDevTask(Class<? extends OpenShiftExtension> extensionClass) {
    super(extensionClass);
    setDescription(
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `gradle-plugin/openshift/src/main/java/org/eclipse/jkube/gradle/plugin/task/OpenShiftWatchTask.java`
#### Snippet
```java
public class OpenShiftWatchTask extends KubernetesWatchTask implements OpenShiftJKubeTask {
  @Inject
  public OpenShiftWatchTask(Class<? extends OpenShiftExtension> extensionClass) {
    super(extensionClass);
    setDescription(
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `gradle-plugin/openshift/src/main/java/org/eclipse/jkube/gradle/plugin/task/OpenShiftUndeployTask.java`
#### Snippet
```java
public class OpenShiftUndeployTask extends KubernetesUndeployTask implements OpenShiftJKubeTask {
  @Inject
  public OpenShiftUndeployTask(Class<? extends OpenShiftExtension> extensionClass) {
    super(extensionClass);
    setDescription(
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `gradle-plugin/openshift/src/main/java/org/eclipse/jkube/gradle/plugin/task/OpenShiftApplyTask.java`
#### Snippet
```java

  @Inject
  public OpenShiftApplyTask(Class<? extends OpenShiftExtension> extensionClass) {
    super(extensionClass);
    setDescription(
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `gradle-plugin/openshift/src/main/java/org/eclipse/jkube/gradle/plugin/task/OpenShiftDebugTask.java`
#### Snippet
```java
public class OpenShiftDebugTask extends KubernetesDebugTask implements OpenShiftJKubeTask {
  @Inject
  public OpenShiftDebugTask(Class<? extends OpenShiftExtension> extensionClass) {
    super(extensionClass);
    setDescription(
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `gradle-plugin/openshift/src/main/java/org/eclipse/jkube/gradle/plugin/task/OpenShiftPushTask.java`
#### Snippet
```java
public class OpenShiftPushTask extends KubernetesPushTask implements OpenShiftJKubeTask {
  @Inject
  public OpenShiftPushTask(Class<? extends OpenShiftExtension> extensionClass) {
    super(extensionClass);
    setDescription(
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `gradle-plugin/openshift/src/main/java/org/eclipse/jkube/gradle/plugin/task/OpenShiftResourceTask.java`
#### Snippet
```java

  @Inject
  public OpenShiftResourceTask(Class<? extends OpenShiftExtension> extensionClass) {
    super(extensionClass);
    setDescription(
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/FileUtil.java`
#### Snippet
```java
        }
        final StringBuilder relativeFilePath = new StringBuilder();
        relativeFilePath.append(oldPath.relativize(newPath).toString());
        if (newFilePath.endsWith(File.separator)) {
            relativeFilePath.append(File.separator);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/FileUtil.java`
#### Snippet
```java
            return path.substring(slashIndex + 1);
        } else {
            throw new IllegalArgumentException(String.format("URL %s should contain a name file to be downloaded.", url.toString()));
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/KarafHealthCheckEnricher.java`
#### Snippet
```java
        if (!(startupFeatures instanceof Map)) {
            throw new IllegalArgumentException(String.format("For element %s was expected a complex object but a simple object was found of type %s and value %s",
                "startupFeatures", startupFeatures.getClass(), startupFeatures.toString()));
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/AnsiLoggerFacade.java`
#### Snippet
```java
            // We print only the message here since breaking exception will bubble up
            // anyway
            return message + ": " + params[0].toString();
        } else {
            return String.format(message, params);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/DockerFileBuilder.java`
#### Snippet
```java

    private String createTempDir() {
         return "/tmp/" + UUID.randomUUID().toString();
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/DockerFileBuilder.java`
#### Snippet
```java
        if (toBeQuoted) {
            // need to keep quotes
            sb.append('"').append(valBuf.toString()).append('"');
        } else {
            sb.append(value);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java
                throw new IllegalArgumentException(String.format(
                    ERROR_MESSAGE,
                    config.getKey(), input.getClass(), input.toString()));
            }
        });
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java
                throw new IllegalArgumentException(String.format(
                    ERROR_MESSAGE,
                    config.getKey(), input.getClass(), input.toString()));
            }

```

## RuleId[id=RegExpUnexpectedAnchor]
### RegExpUnexpectedAnchor
Anchor `$` in unexpected position
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "  )                              # LPT6, LPT7, LPT8, and LPT9...     \n" +
            "  (?:\\.[^.]*)?                  # followed by optional extension    \n" +
            "  $                              # and end of string                 \n" +
            ")                                # End negative lookahead assertion. \n" +
            "[^<>:\"/\\\\|?*\\x00-\\x1F]*     # Zero or more valid filename chars.\n" +
```

### RegExpUnexpectedAnchor
Anchor `$` in unexpected position
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "[^<>:\"/\\\\|?*\\x00-\\x1F]*     # Zero or more valid filename chars.\n" +
            "[^<>:\"/\\\\|?*\\x00-\\x1F .]    # Last char is not a space or dot.  \n" +
            "$                                # Anchor to end of string.            ",
        Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE | Pattern.COMMENTS);
    Matcher matcher = pattern.matcher(filename);
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `ImagePullCacheStore` may be 'static'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/ImagePullCache.java`
#### Snippet
```java
     * @since 20/07/16
     */
    class ImagePullCacheStore {

        private JsonObject cache;
```

### InnerClassMayBeStatic
Inner class `WindowsPipeDockerHostProvider` may be 'static'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/DockerConnectionDetector.java`
#### Snippet
```java

    // Check for a windows pipe
    class WindowsPipeDockerHostProvider implements DockerHostProvider {
        @Override
        public ConnectionParameter getConnectionParameter(String certPath) throws IOException {
```

### InnerClassMayBeStatic
Inner class `UnixSocketDockerHostProvider` may be 'static'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/DockerConnectionDetector.java`
#### Snippet
```java

    // Check for a unix socket
    class UnixSocketDockerHostProvider implements DockerHostProvider {
        @Override
        public ConnectionParameter getConnectionParameter(String certPath) throws IOException {
```

### InnerClassMayBeStatic
Inner class `EnvDockerHostProvider` may be 'static'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/DockerConnectionDetector.java`
#### Snippet
```java

    // Lookup from the enviroment
    class EnvDockerHostProvider implements DockerHostProvider {
        @Override
        public ConnectionParameter getConnectionParameter(String certPath) throws IOException {
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/PatchService.java`
#### Snippet
```java
            throw new IllegalArgumentException("Internal: No patcher for " + newDto.getKind() + " found");
        }
        /**
         * This is done in order to fix https://github.com/openshift/origin/issues/19905
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/RunImageConfiguration.java`
#### Snippet
```java
    }

    /**
     * Custom networks are available since API 1.21 (Docker 1.9).
     */
```

## RuleId[id=RegExpRepeatedSpace]
### RegExpRepeatedSpace
10 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
  static boolean isValidWindowsFileName(String filename) {
    Pattern pattern = Pattern.compile(
        "# Match a valid Windows filename (unspecified file system).          \n" +
            "^                                # Anchor to start of string.        \n" +
            "(?!                              # Assert filename is not: CON, PRN, \n" +
```

### RegExpRepeatedSpace
32 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
    Pattern pattern = Pattern.compile(
        "# Match a valid Windows filename (unspecified file system).          \n" +
            "^                                # Anchor to start of string.        \n" +
            "(?!                              # Assert filename is not: CON, PRN, \n" +
            "  (?:                            # AUX, NUL, COM1, COM2, COM3, COM4, \n" +
```

### RegExpRepeatedSpace
8 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
    Pattern pattern = Pattern.compile(
        "# Match a valid Windows filename (unspecified file system).          \n" +
            "^                                # Anchor to start of string.        \n" +
            "(?!                              # Assert filename is not: CON, PRN, \n" +
            "  (?:                            # AUX, NUL, COM1, COM2, COM3, COM4, \n" +
```

### RegExpRepeatedSpace
30 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
        "# Match a valid Windows filename (unspecified file system).          \n" +
            "^                                # Anchor to start of string.        \n" +
            "(?!                              # Assert filename is not: CON, PRN, \n" +
            "  (?:                            # AUX, NUL, COM1, COM2, COM3, COM4, \n" +
            "    CON|PRN|AUX|NUL|             # COM5, COM6, COM7, COM8, COM9,     \n" +
```

### RegExpRepeatedSpace
2 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "^                                # Anchor to start of string.        \n" +
            "(?!                              # Assert filename is not: CON, PRN, \n" +
            "  (?:                            # AUX, NUL, COM1, COM2, COM3, COM4, \n" +
            "    CON|PRN|AUX|NUL|             # COM5, COM6, COM7, COM8, COM9,     \n" +
            "    COM[1-9]|LPT[1-9]            # LPT1, LPT2, LPT3, LPT4, LPT5,     \n" +
```

### RegExpRepeatedSpace
28 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "^                                # Anchor to start of string.        \n" +
            "(?!                              # Assert filename is not: CON, PRN, \n" +
            "  (?:                            # AUX, NUL, COM1, COM2, COM3, COM4, \n" +
            "    CON|PRN|AUX|NUL|             # COM5, COM6, COM7, COM8, COM9,     \n" +
            "    COM[1-9]|LPT[1-9]            # LPT1, LPT2, LPT3, LPT4, LPT5,     \n" +
```

### RegExpRepeatedSpace
4 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "(?!                              # Assert filename is not: CON, PRN, \n" +
            "  (?:                            # AUX, NUL, COM1, COM2, COM3, COM4, \n" +
            "    CON|PRN|AUX|NUL|             # COM5, COM6, COM7, COM8, COM9,     \n" +
            "    COM[1-9]|LPT[1-9]            # LPT1, LPT2, LPT3, LPT4, LPT5,     \n" +
            "  )                              # LPT6, LPT7, LPT8, and LPT9...     \n" +
```

### RegExpRepeatedSpace
13 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "(?!                              # Assert filename is not: CON, PRN, \n" +
            "  (?:                            # AUX, NUL, COM1, COM2, COM3, COM4, \n" +
            "    CON|PRN|AUX|NUL|             # COM5, COM6, COM7, COM8, COM9,     \n" +
            "    COM[1-9]|LPT[1-9]            # LPT1, LPT2, LPT3, LPT4, LPT5,     \n" +
            "  )                              # LPT6, LPT7, LPT8, and LPT9...     \n" +
```

### RegExpRepeatedSpace
5 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "(?!                              # Assert filename is not: CON, PRN, \n" +
            "  (?:                            # AUX, NUL, COM1, COM2, COM3, COM4, \n" +
            "    CON|PRN|AUX|NUL|             # COM5, COM6, COM7, COM8, COM9,     \n" +
            "    COM[1-9]|LPT[1-9]            # LPT1, LPT2, LPT3, LPT4, LPT5,     \n" +
            "  )                              # LPT6, LPT7, LPT8, and LPT9...     \n" +
```

### RegExpRepeatedSpace
4 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "  (?:                            # AUX, NUL, COM1, COM2, COM3, COM4, \n" +
            "    CON|PRN|AUX|NUL|             # COM5, COM6, COM7, COM8, COM9,     \n" +
            "    COM[1-9]|LPT[1-9]            # LPT1, LPT2, LPT3, LPT4, LPT5,     \n" +
            "  )                              # LPT6, LPT7, LPT8, and LPT9...     \n" +
            "  (?:\\.[^.]*)?                  # followed by optional extension    \n" +
```

### RegExpRepeatedSpace
12 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "  (?:                            # AUX, NUL, COM1, COM2, COM3, COM4, \n" +
            "    CON|PRN|AUX|NUL|             # COM5, COM6, COM7, COM8, COM9,     \n" +
            "    COM[1-9]|LPT[1-9]            # LPT1, LPT2, LPT3, LPT4, LPT5,     \n" +
            "  )                              # LPT6, LPT7, LPT8, and LPT9...     \n" +
            "  (?:\\.[^.]*)?                  # followed by optional extension    \n" +
```

### RegExpRepeatedSpace
5 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "  (?:                            # AUX, NUL, COM1, COM2, COM3, COM4, \n" +
            "    CON|PRN|AUX|NUL|             # COM5, COM6, COM7, COM8, COM9,     \n" +
            "    COM[1-9]|LPT[1-9]            # LPT1, LPT2, LPT3, LPT4, LPT5,     \n" +
            "  )                              # LPT6, LPT7, LPT8, and LPT9...     \n" +
            "  (?:\\.[^.]*)?                  # followed by optional extension    \n" +
```

### RegExpRepeatedSpace
2 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "    CON|PRN|AUX|NUL|             # COM5, COM6, COM7, COM8, COM9,     \n" +
            "    COM[1-9]|LPT[1-9]            # LPT1, LPT2, LPT3, LPT4, LPT5,     \n" +
            "  )                              # LPT6, LPT7, LPT8, and LPT9...     \n" +
            "  (?:\\.[^.]*)?                  # followed by optional extension    \n" +
            "  $                              # and end of string                 \n" +
```

### RegExpRepeatedSpace
30 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "    CON|PRN|AUX|NUL|             # COM5, COM6, COM7, COM8, COM9,     \n" +
            "    COM[1-9]|LPT[1-9]            # LPT1, LPT2, LPT3, LPT4, LPT5,     \n" +
            "  )                              # LPT6, LPT7, LPT8, and LPT9...     \n" +
            "  (?:\\.[^.]*)?                  # followed by optional extension    \n" +
            "  $                              # and end of string                 \n" +
```

### RegExpRepeatedSpace
5 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "    CON|PRN|AUX|NUL|             # COM5, COM6, COM7, COM8, COM9,     \n" +
            "    COM[1-9]|LPT[1-9]            # LPT1, LPT2, LPT3, LPT4, LPT5,     \n" +
            "  )                              # LPT6, LPT7, LPT8, and LPT9...     \n" +
            "  (?:\\.[^.]*)?                  # followed by optional extension    \n" +
            "  $                              # and end of string                 \n" +
```

### RegExpRepeatedSpace
2 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "    COM[1-9]|LPT[1-9]            # LPT1, LPT2, LPT3, LPT4, LPT5,     \n" +
            "  )                              # LPT6, LPT7, LPT8, and LPT9...     \n" +
            "  (?:\\.[^.]*)?                  # followed by optional extension    \n" +
            "  $                              # and end of string                 \n" +
            ")                                # End negative lookahead assertion. \n" +
```

### RegExpRepeatedSpace
18 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "    COM[1-9]|LPT[1-9]            # LPT1, LPT2, LPT3, LPT4, LPT5,     \n" +
            "  )                              # LPT6, LPT7, LPT8, and LPT9...     \n" +
            "  (?:\\.[^.]*)?                  # followed by optional extension    \n" +
            "  $                              # and end of string                 \n" +
            ")                                # End negative lookahead assertion. \n" +
```

### RegExpRepeatedSpace
4 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "    COM[1-9]|LPT[1-9]            # LPT1, LPT2, LPT3, LPT4, LPT5,     \n" +
            "  )                              # LPT6, LPT7, LPT8, and LPT9...     \n" +
            "  (?:\\.[^.]*)?                  # followed by optional extension    \n" +
            "  $                              # and end of string                 \n" +
            ")                                # End negative lookahead assertion. \n" +
```

### RegExpRepeatedSpace
2 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "  )                              # LPT6, LPT7, LPT8, and LPT9...     \n" +
            "  (?:\\.[^.]*)?                  # followed by optional extension    \n" +
            "  $                              # and end of string                 \n" +
            ")                                # End negative lookahead assertion. \n" +
            "[^<>:\"/\\\\|?*\\x00-\\x1F]*     # Zero or more valid filename chars.\n" +
```

### RegExpRepeatedSpace
30 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "  )                              # LPT6, LPT7, LPT8, and LPT9...     \n" +
            "  (?:\\.[^.]*)?                  # followed by optional extension    \n" +
            "  $                              # and end of string                 \n" +
            ")                                # End negative lookahead assertion. \n" +
            "[^<>:\"/\\\\|?*\\x00-\\x1F]*     # Zero or more valid filename chars.\n" +
```

### RegExpRepeatedSpace
17 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "  )                              # LPT6, LPT7, LPT8, and LPT9...     \n" +
            "  (?:\\.[^.]*)?                  # followed by optional extension    \n" +
            "  $                              # and end of string                 \n" +
            ")                                # End negative lookahead assertion. \n" +
            "[^<>:\"/\\\\|?*\\x00-\\x1F]*     # Zero or more valid filename chars.\n" +
```

### RegExpRepeatedSpace
32 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "  (?:\\.[^.]*)?                  # followed by optional extension    \n" +
            "  $                              # and end of string                 \n" +
            ")                                # End negative lookahead assertion. \n" +
            "[^<>:\"/\\\\|?*\\x00-\\x1F]*     # Zero or more valid filename chars.\n" +
            "[^<>:\"/\\\\|?*\\x00-\\x1F .]    # Last char is not a space or dot.  \n" +
```

### RegExpRepeatedSpace
5 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "  $                              # and end of string                 \n" +
            ")                                # End negative lookahead assertion. \n" +
            "[^<>:\"/\\\\|?*\\x00-\\x1F]*     # Zero or more valid filename chars.\n" +
            "[^<>:\"/\\\\|?*\\x00-\\x1F .]    # Last char is not a space or dot.  \n" +
            "$                                # Anchor to end of string.            ",
```

### RegExpRepeatedSpace
4 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            ")                                # End negative lookahead assertion. \n" +
            "[^<>:\"/\\\\|?*\\x00-\\x1F]*     # Zero or more valid filename chars.\n" +
            "[^<>:\"/\\\\|?*\\x00-\\x1F .]    # Last char is not a space or dot.  \n" +
            "$                                # Anchor to end of string.            ",
        Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE | Pattern.COMMENTS);
```

### RegExpRepeatedSpace
2 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            ")                                # End negative lookahead assertion. \n" +
            "[^<>:\"/\\\\|?*\\x00-\\x1F]*     # Zero or more valid filename chars.\n" +
            "[^<>:\"/\\\\|?*\\x00-\\x1F .]    # Last char is not a space or dot.  \n" +
            "$                                # Anchor to end of string.            ",
        Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE | Pattern.COMMENTS);
```

### RegExpRepeatedSpace
32 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "[^<>:\"/\\\\|?*\\x00-\\x1F]*     # Zero or more valid filename chars.\n" +
            "[^<>:\"/\\\\|?*\\x00-\\x1F .]    # Last char is not a space or dot.  \n" +
            "$                                # Anchor to end of string.            ",
        Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE | Pattern.COMMENTS);
    Matcher matcher = pattern.matcher(filename);
```

### RegExpRepeatedSpace
12 consecutive spaces in RegExp
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
            "[^<>:\"/\\\\|?*\\x00-\\x1F]*     # Zero or more valid filename chars.\n" +
            "[^<>:\"/\\\\|?*\\x00-\\x1F .]    # Last char is not a space or dot.  \n" +
            "$                                # Anchor to end of string.            ",
        Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE | Pattern.COMMENTS);
    Matcher matcher = pattern.matcher(filename);
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/Timestamp.java`
#### Snippet
```java

        if (rest != timestamp.rest) return false;
        if (!date.equals(timestamp.date)) return false;

        return true;
```

### TrivialIf
`if` statement can be simplified
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/VolumeBindingUtil.java`
#### Snippet
```java
        }

        if (isUserHomeRelativePath(candidatePath)) {
            return true;
        }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'version'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/SpringBootConfigurationHelper.java`
#### Snippet
```java
    }

    private Optional<Integer> majorVersion(Optional<String> version) {
        if (version.isPresent()) {
            try {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'springBootVersion'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/SpringBootConfigurationHelper.java`
#### Snippet
```java
    private static final int DEFAULT_SERVER_PORT = 8080;

    public SpringBootConfigurationHelper(Optional<String> springBootVersion) {
        this.propertyOffset = propertyOffset(springBootVersion);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'springBootVersion'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/SpringBootConfigurationHelper.java`
#### Snippet
```java
    }

    private int propertyOffset(Optional<String> springBootVersion) {
        Optional<Integer> majorVersion = majorVersion(springBootVersion);
        int idx = majorVersion.map(v -> v - 1).orElse(0);
```

## RuleId[id=ImplicitArrayToString]
### ImplicitArrayToString
Implicit call to 'toString()' on array returned by call to `values()`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/PropertyMode.java`
#### Snippet
```java
            }
        }
        throw new IllegalArgumentException("PropertyMode: invalid mode "+name+". Valid: "+values());
    }
}
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Watch' used without 'try'-with-resources statement
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/DebugService.java`
#### Snippet
```java
        log.info("No Active debug pod with provided selector and environment variables found! Waiting for pod to be ready...");
        log.info("Waiting for debug pod with selector " + selector + " and environment variables " + envVars);
        pods.watch(portForwardPodWatcher);

        // now lets wait forever?
```

### AutoCloseableResource
'Watch' used without 'try'-with-resources statement
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/PortForwardService.java`
#### Snippet
```java
        nextForwardedPod[0] = newPod;

        final Watch watch = KubernetesHelper.withSelector(kubernetes.pods(), podSelector, log).watch(new Watcher<Pod>() {

            @Override
```

### AutoCloseableResource
'OpenShiftClient' used without 'try'-with-resources statement
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
                return;
            }
            final OpenShiftClient openShiftClient = asOpenShiftClient();
            OAuthClient old = openShiftClient.oAuthClients().withName(id).get();
            if (isRunning(old)) {
```

### AutoCloseableResource
'OpenShiftClient' used without 'try'-with-resources statement
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
        if (!exists) {
            try {
                Object answer = asOpenShiftClient().projectrequests().create(entity);
                // Add project to created projects
                projectsCreated.add(name);
```

### AutoCloseableResource
'OpenShiftClient' used without 'try'-with-resources statement
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
            log.info("Creating a Template from " + sourceName + " namespace " + namespace + " name " + getName(entity));
            try {
                final Template answer = asOpenShiftClient().templates().inNamespace(namespace).create(entity);
                logGeneratedEntity("Created Template: ", namespace, entity, answer);
            } catch (Exception e) {
```

### AutoCloseableResource
'OpenShiftClient' used without 'try'-with-resources statement
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
        }
        if (!isProcessTemplatesLocally()) {
            final OpenShiftClient openShiftClient = asOpenShiftClient();
            String currentNamespace = applicableNamespace(entity, namespace, fallbackNamespace);
            String id = getName(entity);
```

### AutoCloseableResource
'OpenShiftClient' used without 'try'-with-resources statement
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
            DeploymentConfig resource = (DeploymentConfig) dto;
            if (OpenshiftHelper.isOpenShift(kubernetesClient)) {
                applyResource(resource, sourceName, asOpenShiftClient().deploymentConfigs());
            } else {
                log.warn("Not connected to OpenShift cluster so cannot apply entity %s", dto);
```

### AutoCloseableResource
'OpenShiftClient' used without 'try'-with-resources statement
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
            String currentNamespace = applicableNamespace(entity, namespace, fallbackNamespace);
            try {
                final OpenShiftClient openShiftClient = asOpenShiftClient();
                Resource<ImageStream> resource = openShiftClient.imageStreams().inNamespace(currentNamespace).withName(name);
                ImageStream old = resource.get();
```

### AutoCloseableResource
'OpenShiftClient' used without 'try'-with-resources statement
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
                        "host: " + entity.getSpec().getHost() :
                        "No Spec !"));
                asOpenShiftClient().routes().inNamespace(namespace).resource(entity).create();
            } catch (Exception e) {
                onApplyError("Failed to create Route from " + sourceName + ". " + e + ". " + entity, e);
```

### AutoCloseableResource
'OpenShiftClient' used without 'try'-with-resources statement
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
            ObjectMeta metadata = getOrCreateMetadata(entity);
            metadata.setName(namespaceName);
            String kubernetesClientNamespace = asOpenShiftClient().getNamespace();
            if (isNotBlank(kubernetesClientNamespace)) {
                Map<String, String> entityLabels = getOrCreateLabels(entity);
```

### AutoCloseableResource
'OpenShiftClient' used without 'try'-with-resources statement
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
            // are not granted permission get operation on non-existing project resource that returns 403
            // instead of 404. Only more privileged roles like 'view' or 'cluster-reader' are granted this permission.
            List<Project> projects = asOpenShiftClient().projects().list().getItems();
            for (Project project : projects) {
                if (namespaceName.equals(project.getMetadata().getName())) {
```

### AutoCloseableResource
'OpenShiftClient' used without 'try'-with-resources statement
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
        if (OpenshiftHelper.isOpenShift(kubernetesClient)) {
            try {
                asOpenShiftClient().buildConfigs().inNamespace(namespace).resource(entity).create();
            } catch (Exception e) {
                onApplyError("Failed to create BuildConfig from " + sourceName + ". " + e, e);
```

### AutoCloseableResource
'OpenShiftClient' used without 'try'-with-resources statement
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
        if (OpenshiftHelper.isOpenShift(kubernetesClient)) {
            try {
                asOpenShiftClient().oAuthClients().resource(entity).create();
            } catch (Exception e) {
                onApplyError("Failed to create OAuthClient from " + sourceName + ". " + e + ". " + entity, e);
```

### AutoCloseableResource
'OpenShiftClient' used without 'try'-with-resources statement
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
                return;
            }
            final OpenShiftClient openShiftClient = asOpenShiftClient();
            Route route = openShiftClient.routes().inNamespace(currentNamespace).withName(id).get();
            if (isRunning(route)) {
```

### AutoCloseableResource
'OpenShiftClient' used without 'try'-with-resources statement
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
            String currentNamespace = applicableNamespace(entity, namespace, fallbackNamespace);
            applyNamespace(currentNamespace);
            final OpenShiftClient openShiftClient = asOpenShiftClient();
            BuildConfig old = openShiftClient.buildConfigs().inNamespace(currentNamespace).withName(id).get();
            if (isRunning(old)) {
```

### AutoCloseableResource
'HttpClient' used without 'try'-with-resources statement
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/IoUtil.java`
#### Snippet
```java
    public static void download(KitLogger log, URL downloadUrl, File target) throws IOException {
        log.progressStart();
        try (HttpClient client = HttpClientUtils.createHttpClient(Config.empty()).newBuilder().build()) {
            final HttpResponse<InputStream> response = client.sendAsync(
                client.newHttpRequestBuilder().timeout(30, TimeUnit.MINUTES).url(downloadUrl).build(), InputStream.class)
```

### AutoCloseableResource
'PrintStream' used without 'try'-with-resources statement
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/log/DefaultLogCallback.java`
#### Snippet
```java
    @Override
    public void error(String error) {
        ps().println(error);
    }

```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `(rest ^ (rest >>> 32))` to `int` is redundant
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/Timestamp.java`
#### Snippet
```java
    public int hashCode() {
        int result = date.hashCode();
        result = 31 * result + (int) (rest ^ (rest >>> 32));
        return result;
    }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param f` tag description is missing
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/AbstractPortsExtractor.java`
#### Snippet
```java
	 * Reads the configuration from the file.
	 *
	 * @param f
	 * @return
	 * @throws IOException
```

### JavadocDeclaration
`@return` tag description is missing
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/AbstractPortsExtractor.java`
#### Snippet
```java
	 *
	 * @param f
	 * @return
	 * @throws IOException
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/AbstractPortsExtractor.java`
#### Snippet
```java
	 * @param f
	 * @return
	 * @throws IOException
	 */
	private Map<String, String> readConfig(File f) throws IOException {
```

### JavadocDeclaration
`@return` tag description is missing
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/AbstractPortsExtractor.java`
#### Snippet
```java
	 *
	 * @param candidate The string to check
	 * @return
	 */
	private boolean isValidPortPropertyKey(String candidate) {
```

### JavadocDeclaration
`@param project` tag description is missing
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
    /**
     * Creates and return a project in openshift
     * @param project
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
     * Creates and return a project in openshift
     * @param project
     * @return
     */
    public boolean applyProject(Project project) {
```

### JavadocDeclaration
`@return` tag description is missing
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/resource/ConfigMap.java`
#### Snippet
```java
    /**
     * Return the name of ConfigMap.
     * @return
     */
    public String getName() {
```

### JavadocDeclaration
`@param tableContent` tag description is missing
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/AsciiDocParser.java`
#### Snippet
```java
    /**
     * Moves buffer until it finds the first content column (skipping headers).
     * @param tableContent
     */
    private void skipUntilColumns(final BufferedReader tableContent) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
     * @return The given credentials, if registry does not need extended authentication;
     * else, the credentials after authentication.
     * @throws IOException
     */
    private AuthConfig extendedAuthentication(AuthConfig standardAuthConfig, String registry) throws IOException {
```

### JavadocDeclaration
`@param in` tag description is missing
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/log/LogRequestor.java`
#### Snippet
```java
     * NoBytesReadException if zero bytes are read. Otherwise it is identical.
     *
     * @param in
     * @param bytes
     * @throws IOException
```

### JavadocDeclaration
`@param bytes` tag description is missing
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/log/LogRequestor.java`
#### Snippet
```java
     *
     * @param in
     * @param bytes
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/log/LogRequestor.java`
#### Snippet
```java
     * @param in
     * @param bytes
     * @throws IOException
     */
    private void readFully(InputStream in, byte[] bytes) throws IOException {
```

### JavadocDeclaration
`@param prefix` tag description is missing
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
         * Data type-specific extractor to read value from properties.
         *
         * @param prefix
         * @param key
         * @param properties
```

### JavadocDeclaration
`@param key` tag description is missing
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
         *
         * @param prefix
         * @param key
         * @param properties
         * @return
```

### JavadocDeclaration
`@param properties` tag description is missing
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
         * @param prefix
         * @param key
         * @param properties
         * @return
         */
```

### JavadocDeclaration
`@return` tag description is missing
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
         * @param key
         * @param properties
         * @return
         */
        protected abstract T withPrefix(String prefix, ConfigKey key, Properties properties);
```

### JavadocDeclaration
Javadoc pointing to itself
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/ImageName.java`
#### Snippet
```java

    /**
     * Get the full name of this image like {@link #getFullName(String)} does, but allow
     * an optional registry. This registry is used when this image does not already
     * contain a registry. If no tag was provided in the initial name, <code>latest</code> is used.
```

### JavadocDeclaration
`@throws` tag description is missing
in `jkube-kit/profile/src/main/java/org/eclipse/jkube/kit/profile/ProfileUtil.java`
#### Snippet
```java
     * @return the merged configuration which can be empty if no profile is given
     * @param config the provided configuration
     * @throws IOException
     */
    public static ProcessorConfig blendProfileWithConfiguration(ProcessorConfigurationExtractor configExtractor,
```

### JavadocDeclaration
Javadoc pointing to itself
in `jkube-kit/profile/src/main/java/org/eclipse/jkube/kit/profile/ProfileUtil.java`
#### Snippet
```java
     *
     * <ul>
     *     <li>A given directory with the name profiles.yml (and variations, {@link #findProfile(String, File[])}</li>
     * </ul>
     * @param profileArg the profile's name
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `useReplicaSet` may be 'final'
in `kubernetes-maven-plugin/plugin/src/main/java/org/eclipse/jkube/maven/plugin/mojo/build/ResourceMojo.java`
#### Snippet
```java
    // Whether to use replica sets or replication controller. Could be configurable
    // but for now leave it hidden.
    private boolean useReplicaSet = true;

    // The image configuration after resolving and customization
```

### FieldMayBeFinal
Field `useProjectClasspath` may be 'final'
in `kubernetes-maven-plugin/plugin/src/main/java/org/eclipse/jkube/maven/plugin/mojo/build/ResourceMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "jkube.useProjectClasspath", defaultValue = "false")
    private boolean useProjectClasspath = false;


```

### FieldMayBeFinal
Field `label` may be 'final'
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/resource/RuntimeMode.java`
#### Snippet
```java
    public static final String JKUBE_EFFECTIVE_PLATFORM_MODE = "jkube.internal.effective.platform.mode";

    private String label;

    RuntimeMode(String label) {
```

### FieldMayBeFinal
Field `propertyOffset` may be 'final'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/SpringBootConfigurationHelper.java`
#### Snippet
```java
    private static final String[] ACTUATOR_DEFAULT_BASE_PATH = {"", "/actuator"};

    private int propertyOffset;

    private static final int DEFAULT_SERVER_PORT = 8080;
```

### FieldMayBeFinal
Field `errorMsg` may be 'final'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/validator/ResourceValidator.java`
#### Snippet
```java
    private static class ConstraintViolationImpl implements ConstraintViolation<ValidationMessage> {

        private ValidationMessage errorMsg;

        public ConstraintViolationImpl(ValidationMessage errorMsg) {
```

### FieldMayBeFinal
Field `cache` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/ImagePullCache.java`
#### Snippet
```java
    class ImagePullCacheStore {

        private JsonObject cache;


```

### FieldMayBeFinal
Field `docker` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/VolumeService.java`
#### Snippet
```java
public class VolumeService {
   // DAO for accessing the docker daemon
   private DockerAccess docker;

   VolumeService(DockerAccess dockerAccess) {
```

### FieldMayBeFinal
Field `dockerAccess` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/WaitService.java`
#### Snippet
```java

    private final QueryService queryService;
    private DockerAccess dockerAccess;
    private KitLogger log;

```

### FieldMayBeFinal
Field `log` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/WaitService.java`
#### Snippet
```java
    private final QueryService queryService;
    private DockerAccess dockerAccess;
    private KitLogger log;

    public WaitService(DockerAccess dockerAccess, QueryService queryService, KitLogger log) {
```

### FieldMayBeFinal
Field `queryParams` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/UrlBuilder.java`
#### Snippet
```java
    private static class Builder {

        private Map<String,String> queryParams = new HashMap<>();
        private String url;

```

### FieldMayBeFinal
Field `url` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/UrlBuilder.java`
#### Snippet
```java

        private Map<String,String> queryParams = new HashMap<>();
        private String url;

        public Builder(String url) {
```

### FieldMayBeFinal
Field `numUsers` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/log/SharedPrintStream.java`
#### Snippet
```java
    private PrintStream printStream;

    private AtomicInteger numUsers;

    SharedPrintStream(PrintStream ps) {
```

### FieldMayBeFinal
Field `printStream` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/log/SharedPrintStream.java`
#### Snippet
```java

class SharedPrintStream {
    private PrintStream printStream;

    private AtomicInteger numUsers;
```

### FieldMayBeFinal
Field `date` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/Timestamp.java`
#### Snippet
```java
public class Timestamp implements Comparable<Timestamp> {

    private LocalDateTime date;
    private int rest;

```

### FieldMayBeFinal
Field `suffix` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/SuffixFileFilter.java`
#### Snippet
```java
    public static final FilenameFilter PEM_FILTER = new SuffixFileFilter(".pem");

    private String suffix;

    public SuffixFileFilter(String suffix) {
```

### FieldMayBeFinal
Field `imageLines` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/AnsiLoggerFacade.java`
#### Snippet
```java

    // Map remembering lines
    private ThreadLocal<Map<String, Integer>> imageLines = new ThreadLocal<>();
    private ThreadLocal<AtomicInteger> updateCount = new ThreadLocal<>();

```

### FieldMayBeFinal
Field `verbose` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/AnsiLoggerFacade.java`
#### Snippet
```java
    private final String prefix;
    private final boolean batchMode;
    private boolean verbose;

    // ANSI escapes for various colors (or empty strings if no coloring is used)
```

### FieldMayBeFinal
Field `updateCount` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/AnsiLoggerFacade.java`
#### Snippet
```java
    // Map remembering lines
    private ThreadLocal<Map<String, Integer>> imageLines = new ThreadLocal<>();
    private ThreadLocal<AtomicInteger> updateCount = new ThreadLocal<>();

    // Whether to use ANSI codes
```

### FieldMayBeFinal
Field `stringValueExtractor` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
    private IntListValueExtractor intListValueExtractor;
    private MapValueExtractor mapValueExtractor;
    private StringValueExtractor stringValueExtractor;
    private IntValueExtractor intValueExtractor;
    private LongValueExtractor longValueExtractor;
```

### FieldMayBeFinal
Field `propertyMode` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
    private String prefix;
    private Properties properties;
    private PropertyMode propertyMode;

    private StringListValueExtractor stringListValueExtractor;
```

### FieldMayBeFinal
Field `intListValueExtractor` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java

    private StringListValueExtractor stringListValueExtractor;
    private IntListValueExtractor intListValueExtractor;
    private MapValueExtractor mapValueExtractor;
    private StringValueExtractor stringValueExtractor;
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
public class ValueProvider {
    private String prefix;
    private Properties properties;
    private PropertyMode propertyMode;

```

### FieldMayBeFinal
Field `booleanValueExtractor` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
    private IntValueExtractor intValueExtractor;
    private LongValueExtractor longValueExtractor;
    private BooleanValueExtractor booleanValueExtractor;
    private DoubleValueExtractor doubleValueExtractor;

```

### FieldMayBeFinal
Field `prefix` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
 */
public class ValueProvider {
    private String prefix;
    private Properties properties;
    private PropertyMode propertyMode;
```

### FieldMayBeFinal
Field `doubleValueExtractor` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
    private LongValueExtractor longValueExtractor;
    private BooleanValueExtractor booleanValueExtractor;
    private DoubleValueExtractor doubleValueExtractor;

    /**
```

### FieldMayBeFinal
Field `mapValueExtractor` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
    private StringListValueExtractor stringListValueExtractor;
    private IntListValueExtractor intListValueExtractor;
    private MapValueExtractor mapValueExtractor;
    private StringValueExtractor stringValueExtractor;
    private IntValueExtractor intValueExtractor;
```

### FieldMayBeFinal
Field `stringListValueExtractor` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
    private PropertyMode propertyMode;

    private StringListValueExtractor stringListValueExtractor;
    private IntListValueExtractor intListValueExtractor;
    private MapValueExtractor mapValueExtractor;
```

### FieldMayBeFinal
Field `longValueExtractor` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
    private StringValueExtractor stringValueExtractor;
    private IntValueExtractor intValueExtractor;
    private LongValueExtractor longValueExtractor;
    private BooleanValueExtractor booleanValueExtractor;
    private DoubleValueExtractor doubleValueExtractor;
```

### FieldMayBeFinal
Field `intValueExtractor` may be 'final'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
    private MapValueExtractor mapValueExtractor;
    private StringValueExtractor stringValueExtractor;
    private IntValueExtractor intValueExtractor;
    private LongValueExtractor longValueExtractor;
    private BooleanValueExtractor booleanValueExtractor;
```

### FieldMayBeFinal
Field `source` may be 'final'
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/DockerFileBuilder.java`
#### Snippet
```java
    // All entries required, destination is relative to exportDir
    private static final class CopyEntry {
        private String source;
        private String destination;

```

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9-]*[a-zA-Z0-9])`
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/ImageName.java`
#### Snippet
```java

    // https://github.com/docker/docker/blob/04da4041757370fb6f85510c8977c5a18ddae380/vendor/github.com/docker/distribution/reference/regexp.go#L25
    private static final String domainComponentRegexp = "(?:[a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9-]*[a-zA-Z0-9])";

    // ==========================================================
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/AsyncUtil.java`
#### Snippet
```java
      T ret;
      while(!predicate.test(ret = supplier.get())) {
        Thread.sleep(100L);
      }
      return ret;
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
                // now lets add them all in case 2 tags have the same name
                for (TagReference tag : fromTags) {
                    toTags.add(tag);
                }
            }
```

## RuleId[id=BigDecimalMethodWithoutRoundingCalled]
### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.divide()' called without a rounding mode argument
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/GoTimeUtil.java`
#### Snippet
```java
        }

        BigDecimal sec = ns.divide(new BigDecimal(1_000_000_000));
        if (sec.compareTo(new BigDecimal(Integer.MAX_VALUE)) > 0) {
            throw new IllegalArgumentException("Integer Overflow");
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'getDestinationDirectory()' is marked unstable with @Incubating
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/GradleUtil.java`
#### Snippet
```java
      final SourceSetContainer sourceSetContainer = extractSourceSets(gradleProject);
      if (sourceSetContainer != null) {
        return sourceSetContainer.getByName(SourceSet.MAIN_SOURCE_SET_NAME).getJava().getDestinationDirectory()
            .getAsFile().getOrNull();
      }
```

### UnstableApiUsage
'readFully(java.io.InputStream, byte\[\])' is marked unstable with @Beta
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/log/LogRequestor.java`
#### Snippet
```java
        ByteBuffer payload = ByteBuffer.allocate(size);
        try {
            ByteStreams.readFully(is, payload.array());
        } catch (EOFException e) {
            throw new IOException("Failed to read log message. Could not read all " + size + " bytes. " + e.getMessage() +
```

### UnstableApiUsage
'read(java.io.InputStream, byte\[\], int, int)' is marked unstable with @Beta
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/log/LogRequestor.java`
#### Snippet
```java
     */
    private void readFully(InputStream in, byte[] bytes) throws IOException {
        int read = ByteStreams.read(in, bytes, 0, bytes.length);
        if (read == 0) {
            throw new NoBytesReadException();
```

### UnstableApiUsage
'com.google.common.io.Closeables' is marked unstable with @Beta
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/watcher/SpringBootWatcher.java`
#### Snippet
```java
                    }
                } finally {
                    Closeables.closeQuietly(reader);
                }
            }
```

### UnstableApiUsage
'closeQuietly(java.io.Reader)' is declared in unstable class 'com.google.common.io.Closeables' marked with @Beta
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/watcher/SpringBootWatcher.java`
#### Snippet
```java
                    }
                } finally {
                    Closeables.closeQuietly(reader);
                }
            }
```

