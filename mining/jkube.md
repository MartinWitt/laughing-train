# jkube 
 
# Bad smells
I found 1112 bad smells with 131 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 285 | false |
| GroovyUnusedAssignment | 154 | false |
| BoundedWildcard | 138 | false |
| ProtectedMemberInFinalClass | 68 | true |
| DynamicRegexReplaceableByCompiledPattern | 55 | false |
| ClassNameSameAsAncestorName | 38 | false |
| AssignmentToMethodParameter | 33 | false |
| SizeReplaceableByIsEmpty | 30 | true |
| ZeroLengthArrayInitialization | 27 | false |
| RegExpRepeatedSpace | 27 | false |
| UnnecessaryFullyQualifiedName | 22 | false |
| DeprecatedIsStillUsed | 21 | false |
| NestedAssignment | 15 | false |
| SystemOutErr | 15 | false |
| RedundantFieldInitialization | 14 | false |
| OptionalContainsCollection | 13 | false |
| UseOfPropertiesAsHashtable | 12 | false |
| UnusedAssignment | 9 | false |
| ConstantValue | 9 | false |
| NonProtectedConstructorInAbstractClass | 9 | true |
| UnnecessaryToStringCall | 8 | true |
| IgnoreResultOfCall | 6 | false |
| DataFlowIssue | 6 | false |
| ToArrayCallWithZeroLengthArrayArgument | 5 | true |
| RegExpSimplifiable | 5 | false |
| AnonymousHasLambdaAlternative | 5 | false |
| UnstableApiUsage | 5 | false |
| RegExpRedundantEscape | 4 | false |
| NonShortCircuitBoolean | 4 | false |
| RedundantStringFormatCall | 4 | false |
| UnnecessarySemicolon | 4 | false |
| InnerClassMayBeStatic | 4 | true |
| UnnecessaryStringEscape | 3 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 3 | false |
| CallToStringConcatCanBeReplacedByOperator | 3 | false |
| CatchMayIgnoreException | 3 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| WrapperTypeMayBePrimitive | 2 | false |
| WhileCanBeForeach | 2 | false |
| TrivialStringConcatenation | 2 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| RegExpUnexpectedAnchor | 2 | false |
| UnnecessaryBoxing | 2 | false |
| EnumSwitchStatementWhichMissesCases | 1 | false |
| UnnecessaryModifier | 1 | true |
| ConditionalBreakInInfiniteLoop | 1 | false |
| EmptyTryBlock | 1 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| Java8ListReplaceAll | 1 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| RedundantMethodOverride | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| UNUSED_IMPORT | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| InfiniteLoopStatement | 1 | false |
| EmptyMethod | 1 | false |
| RedundantImplements | 1 | false |
| SynchronizeOnThis | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
| Convert2MethodRef | 1 | false |
| ShiftOutOfRange | 1 | false |
| RedundantCollectionOperation | 1 | false |
| MismatchedJavadocCode | 1 | false |
| StringEqualsEmptyString | 1 | false |
| ImplicitArrayToString | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| Convert2Lambda | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| BusyWait | 1 | false |
| RegExpUnnecessaryNonCapturingGroup | 1 | false |
| WaitNotInLoop | 1 | false |
| UseBulkOperation | 1 | false |
| BigDecimalMethodWithoutRoundingCalled | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
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
Call to `toArray()` with pre-sized array argument 'new URL\[compileJars.size()\]'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/ClassUtil.java`
#### Snippet
```java
            }

            return new URLClassLoader(compileJars.toArray(new URL[compileJars.size()]),
                    PluginServiceFactory.class.getClassLoader());

```

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

## RuleId[id=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (action) { case DELETED: message = ": Pod Deleted"; ...` statement on enum type 'io.fabric8.kubernetes.client.Watcher.Action' misses cases: 'ADDED', 'MODIFIED', and 'BOOKMARK'
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/kubernetes/KubernetesClientUtil.java`
#### Snippet
```java
    public static String getPodStatusMessagePostfix(Watcher.Action action) {
        String message = "";
        switch (action) {
            case DELETED:
                message = ": Pod Deleted";
                break;
            case ERROR:
                message = ": Error";
                break;
        }
        return message;
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

## RuleId[id=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ContainersListElement.java`
#### Snippet
```java

        Iterator<String> iterator = labels.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            mapped.put(key, labels.get(key).getAsString());
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ContainerDetails.java`
#### Snippet
```java

        Iterator<String> iterator = labels.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            mapped.put(key, labels.get(key).getAsString());
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `globalColorIdx` from instance context
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/log/LogOutputSpec.java`
#### Snippet
```java
        public LogOutputSpecBuilder colorString(String color, boolean fgBright) {
            if (color == null) {
                this.color = COLOR_PALETTE[globalColorIdx++ % COLOR_PALETTE.length];
            } else {
                try {
```

## RuleId[id=RegExpRedundantEscape]
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

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/AbstractPortsExtractor.java`
#### Snippet
```java
	private static final String NUMBER_REGEX = "\\d+";

	private static final String PORT_REGEX = "([a-zA-Z0-9_]+)(([\\.-_]+p)|([P]))ort";
	private static final Pattern PORT_PATTERN = Pattern.compile(PORT_REGEX);

```

## RuleId[id=Java8ListReplaceAll]
### Java8ListReplaceAll
The loop can be replaced with 'List.replaceAll'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/VolumeBindingUtil.java`
#### Snippet
```java
        }

        for (int i = 0; i < bindings.size(); i++) {
            bindings.set(i, resolveRelativeVolumeBinding(baseDir, bindings.get(i)));
        }
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `PORT_NORMALIZATION_MAPPING.keySet()` may be replaced with 'Map.forEach()' iteration
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java
            @Override
            public void visit(ServicePortBuilder portBuilder) {
                PORT_NORMALIZATION_MAPPING.keySet().forEach(key -> {
                    if (key.intValue() == portBuilder.buildTargetPort().getIntVal()) {
                        portBuilder.withPort(PORT_NORMALIZATION_MAPPING.get(key));
```

## RuleId[id=RegExpSimplifiable]
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

### RegExpSimplifiable
`[P]` can be simplified to 'P'
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/AbstractPortsExtractor.java`
#### Snippet
```java
	private static final String NUMBER_REGEX = "\\d+";

	private static final String PORT_REGEX = "([a-zA-Z0-9_]+)(([\\.-_]+p)|([P]))ort";
	private static final Pattern PORT_PATTERN = Pattern.compile(PORT_REGEX);

```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`opts.size() > 0` can be replaced with '!opts.isEmpty()'
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/VolumeCreateConfig.java`
#### Snippet
```java

    public VolumeCreateConfig opts(Map<String, String> opts) {
        if (opts != null && opts.size() > 0) {
            add("DriverOpts", JsonFactory.newJsonObject(opts));
        }
```

### SizeReplaceableByIsEmpty
`labels.size() > 0` can be replaced with '!labels.isEmpty()'
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/VolumeCreateConfig.java`
#### Snippet
```java

    public VolumeCreateConfig labels(Map<String,String> labels) {
        if (labels != null && labels.size() > 0) {
            add("Labels", JsonFactory.newJsonObject(labels));
        }
```

### SizeReplaceableByIsEmpty
`nocache.length() == 0` can be replaced with 'nocache.isEmpty()'
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/openshift/OpenShiftBuildServiceUtils.java`
#### Snippet
```java
    String nocache = System.getProperty("docker.nocache");
    if (nocache != null) {
      return nocache.length() == 0 || Boolean.parseBoolean(nocache);
    } else {
      BuildConfiguration buildConfig = imageConfig.getBuildConfiguration();
```

### SizeReplaceableByIsEmpty
`containerToImageMap.size() != 0` can be replaced with '!containerToImageMap.isEmpty()'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/openshift/ImageChangeTriggerEnricher.java`
#### Snippet
```java
                }
                // add a new image change trigger for the build stream
                if (containerToImageMap.size() != 0) {
                    if(enableImageChangeTrigger && isOpenShiftMode()) {
                        for (Map.Entry<String, String> entry : containerToImageMap.entrySet()) {
```

### SizeReplaceableByIsEmpty
`goal.length() > 0` can be replaced with '!goal.isEmpty()'
in `jkube-kit/common-maven/src/main/java/org/eclipse/jkube/kit/common/util/MojoExecutionService.java`
#### Snippet
```java
        try {
            String executionId = null;
            if (goal != null && goal.length() > 0 && goal.indexOf('#') > -1) {
                int pos = goal.indexOf('#');
                executionId = goal.substring(pos + 1);
```

### SizeReplaceableByIsEmpty
`number.length() == 0` can be replaced with 'number.isEmpty()'
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/UlimitConfig.java`
#### Snippet
```java

    private Integer asInteger(String number) {
        if (number == null || number.length() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`mode.length() > 0` can be replaced with '!mode.isEmpty()'
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/NetworkConfig.java`
#### Snippet
```java

    private static Mode extractMode(String mode) {
        if (mode != null && mode.length() > 0) {
            try {
                return Mode.valueOf(mode.toLowerCase());
```

### SizeReplaceableByIsEmpty
`registry.length() > 0` can be replaced with '!registry.isEmpty()'
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/ImageName.java`
#### Snippet
```java

    public boolean hasRegistry() {
        return registry != null && registry.length() > 0;
    }

```

### SizeReplaceableByIsEmpty
`content[i + 1].length() > 0` can be replaced with '!content\[i + 1\].isEmpty()'
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/RegistryAuthConfiguration.java`
#### Snippet
```java
        };
        for (int i = 0; i < content.length; i += 2) {
            if (content[i + 1] != null && content[i + 1].length() > 0) {
                authMap.put(content[i], content[i+1]);
            }
```

### SizeReplaceableByIsEmpty
`map.size() > 0` can be replaced with '!map.isEmpty()'
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/DockerFileBuilder.java`
#### Snippet
```java

    private void addMap(StringBuilder b, DockerFileKeyword keyword, Map<String,String> map) {
        if (map != null && map.size() > 0) {
            final String[] entries = new String[map.size()];
            int i = 0;
```

### SizeReplaceableByIsEmpty
`entry.getValue().length() == 0` can be replaced with 'entry.getValue().isEmpty()'
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/DockerFileBuilder.java`
#### Snippet
```java
    private void validateMap(Map<String, String> env) {
        for (Map.Entry<String, String> entry : env.entrySet()) {
            if (entry.getValue() == null || entry.getValue().length() == 0) {
                throw new IllegalArgumentException("Environment variable '" +
                                                   entry.getKey() + "' must not be null or empty if building an image");
```

### SizeReplaceableByIsEmpty
`volume.length() > 0` can be replaced with '!volume.isEmpty()'
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/DockerFileBuilder.java`
#### Snippet
```java
        }
        // don't export '/'
        if (volume.length() > 0) {
            DockerFileKeyword.VOLUME.addTo(buffer, "[\"" + volume + "\"]");
        }
```

### SizeReplaceableByIsEmpty
`parts[i + 1].length() > 0` can be replaced with '!parts\[i + 1\].isEmpty()'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/AnsiUtil.java`
#### Snippet
```java

    for (int i = 1; i < parts.length; i += 4) {
      boolean colorPart = i + 1 < parts.length && parts[i + 1].length() > 0;
      boolean plainPart = i + 3 < parts.length && parts[i + 3].length() > 0;

```

### SizeReplaceableByIsEmpty
`parts[i + 3].length() > 0` can be replaced with '!parts\[i + 3\].isEmpty()'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/AnsiUtil.java`
#### Snippet
```java
    for (int i = 1; i < parts.length; i += 4) {
      boolean colorPart = i + 1 < parts.length && parts[i + 1].length() > 0;
      boolean plainPart = i + 3 < parts.length && parts[i + 3].length() > 0;

      if (colorPart) {
```

### SizeReplaceableByIsEmpty
`toProcess.length() == 0` can be replaced with 'toProcess.isEmpty()'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/CommandLine.java`
#### Snippet
```java

    public static List<String>  translateCommandline(String toProcess) {
        if (toProcess == null || toProcess.length() == 0) {
            //no command? no string
            return Collections.emptyList();
```

### SizeReplaceableByIsEmpty
`suffix.length() > 0` can be replaced with '!suffix.isEmpty()'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/JKubeProjectUtil.java`
#### Snippet
```java
    public static String createDefaultResourceName(String artifactId, String ... suffixes) {
        String suffix = StringUtils.join(suffixes, "-");
        String ret = artifactId + (suffix.length() > 0 ? "-" + suffix : "");
        if (ret.length() > MAX_RESOURCE_NAME_LENGTH) {
            ret = ret.substring(0, MAX_RESOURCE_NAME_LENGTH);
```

### SizeReplaceableByIsEmpty
`line.length() > 0` can be replaced with '!line.isEmpty()'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/PluginServiceFactory.java`
#### Snippet
```java
    private synchronized  <T> void createOrRemoveService(Map<ServiceEntry, T> serviceMap, String line)
            throws ReflectiveOperationException {
        if (line.length() > 0 && !COMMENT_LINE_PATTERN.matcher(line).matches()) {
            ServiceEntry entry = new ServiceEntry(line);
            if (entry.isRemove()) {
```

### SizeReplaceableByIsEmpty
`filenameTypes.length() > 0` can be replaced with '!filenameTypes.isEmpty()'
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/resource/MappingConfig.java`
#### Snippet
```java

    public boolean isValid() {
        return kind != null &&  filenameTypes != null && filenameTypes.length() > 0;
    }
}
```

### SizeReplaceableByIsEmpty
`ret.size() > 0` can be replaced with '!ret.isEmpty()'
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/EnvUtil.java`
#### Snippet
```java
            }
        }
        return ret.size() > 0 ? ret : null;
    }

```

### SizeReplaceableByIsEmpty
`prior.length() > 0` can be replaced with '!prior.isEmpty()'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/ecr/AwsSigner4Request.java`
#### Snippet
```java
            String prior = unique.get(key);
            if (prior != null) {
                if (prior.length() > 0) {
                    value = prior + ',' + value;
                }
```

### SizeReplaceableByIsEmpty
`queryParams.size() > 0` can be replaced with '!queryParams.isEmpty()'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/UrlBuilder.java`
#### Snippet
```java

        public String build() {
            if (queryParams.size() > 0) {
                StringBuilder ret = new StringBuilder(url);
                ret.append("?");
```

### SizeReplaceableByIsEmpty
`buildArgs.size() > 0` can be replaced with '!buildArgs.isEmpty()'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/BuildOptions.java`
#### Snippet
```java

    public BuildOptions buildArgs(Map<String, String> buildArgs) {
        if (buildArgs != null && buildArgs.size() > 0) {
            options.put("buildargs", JsonFactory.newJsonObject(buildArgs).toString());
        }
```

### SizeReplaceableByIsEmpty
`nocache.length() == 0` can be replaced with 'nocache.isEmpty()'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/BuildService.java`
#### Snippet
```java
        String nocache = System.getProperty("docker.nocache");
        if (nocache != null) {
            return nocache.length() == 0 || Boolean.parseBoolean(nocache);
        } else {
            BuildConfiguration buildConfig = imageConfig.getBuildConfiguration();
```

### SizeReplaceableByIsEmpty
`env.size() > 0` can be replaced with '!env.isEmpty()'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/ContainerCreateConfig.java`
#### Snippet
```java

        Properties envProps = new Properties();
        if (env != null && env.size() > 0) {
            for (Map.Entry<String, String> entry : env.entrySet()) {
                String value = entry.getValue();
```

### SizeReplaceableByIsEmpty
`envProps.size() > 0` can be replaced with '!envProps.isEmpty()'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/ContainerCreateConfig.java`
#### Snippet
```java
        }

        if (envProps.size() > 0) {
            addEnvironment(envProps);
        }
```

### SizeReplaceableByIsEmpty
`labels.size() > 0` can be replaced with '!labels.isEmpty()'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/ContainerCreateConfig.java`
#### Snippet
```java

    public ContainerCreateConfig labels(Map<String,String> labels) {
        if (labels != null && labels.size() > 0) {
            createConfig.add("Labels", JsonFactory.newJsonObject(labels));
        }
```

### SizeReplaceableByIsEmpty
`opts.size() > 0` can be replaced with '!opts.isEmpty()'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/ContainerHostConfig.java`
#### Snippet
```java

                Map<String,String> opts = logDriver.getOpts();
                if (opts != null && opts.size() > 0) {
                    JsonObject config = new JsonObject();
                    for (Map.Entry<String, String> logOpt : opts.entrySet()) {
```

### SizeReplaceableByIsEmpty
`formatOrConstant.length() == 0` can be replaced with 'formatOrConstant.isEmpty()'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/log/LogOutputSpec.java`
#### Snippet
```java
                    || formatOrConstant.equalsIgnoreCase("FALSE")) {
                timeFormatter = null;
            } else if (formatOrConstant.length() == 0 || formatOrConstant.equalsIgnoreCase("DEFAULT")) {
                timeFormatter = DateTimeFormatter.ofPattern(DEFAULT_TIMESTAMP_PATTERN);
            } else if (formatOrConstant.equalsIgnoreCase("ISO8601")) {
```

### SizeReplaceableByIsEmpty
`duration.length() == 0` can be replaced with 'duration.isEmpty()'
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/GoTimeUtil.java`
#### Snippet
```java
        }
        String duration = durationP.trim();
        if (duration.length() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`healthCheckProperties.size() > 0` can be replaced with '!healthCheckProperties.isEmpty()'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/PropertyConfigHandler.java`
#### Snippet
```java
    private HealthCheckConfiguration extractHealthCheck(HealthCheckConfiguration config, ValueProvider valueProvider) {
        Map<String, String> healthCheckProperties = valueProvider.getMap(HEALTHCHECK, Collections.emptyMap());
        if (healthCheckProperties != null && healthCheckProperties.size() > 0) {
            return HealthCheckConfiguration.builder()
                    .interval(valueProvider.getString(HEALTHCHECK_INTERVAL, valueOrNull(config, HealthCheckConfiguration::getInterval)))
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

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `enabled |= setDebugEnvVar(container, debugSuspend)`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/DebugService.java`
#### Snippet
```java
                boolean enabled = false;
                for (Container container : containers) {
                    enabled |= setDebugEnvVar(container, debugSuspend);
                    enabled |= addDebugContainerPort(container);
                    enabled |= handleDebugSuspendEnvVar(container, debugSuspend, entity);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `enabled |= addDebugContainerPort(container)`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/DebugService.java`
#### Snippet
```java
                for (Container container : containers) {
                    enabled |= setDebugEnvVar(container, debugSuspend);
                    enabled |= addDebugContainerPort(container);
                    enabled |= handleDebugSuspendEnvVar(container, debugSuspend, entity);
                }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `enabled |= handleDebugSuspendEnvVar(container, debugSuspend, entity)`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/DebugService.java`
#### Snippet
```java
                    enabled |= setDebugEnvVar(container, debugSuspend);
                    enabled |= addDebugContainerPort(container);
                    enabled |= handleDebugSuspendEnvVar(container, debugSuspend, entity);
                }
                if (enabled) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `controllersApplied &= applyService.isAlreadyApplied(h)`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/DebugService.java`
#### Snippet
```java
                    log.warn("%s %s not applied, Did you forget to deploy your application?", h.getKind(), h.getMetadata().getName());
                }
                controllersApplied &= applyService.isAlreadyApplied(h);
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends RegistryServerConfiguration`
in `jkube-kit/resource/helm/src/main/java/org/eclipse/jkube/kit/resource/helm/HelmServiceUtil.java`
#### Snippet
```java
  }

  static void setAuthentication(HelmRepository repository, KitLogger logger, List<RegistryServerConfiguration> registryServerConfigurations, UnaryOperator<String> passwordDecrypter)  {
    final String id = repository.getName();
    final String REPO = "Repo ";
```

### BoundedWildcard
Can generalize to `? super String`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/PortMapping.java`
#### Snippet
```java
    }

    private <T> void update(Map<String, T> map, String key, T value) {
        if (key != null) {
            map.put(key, value);
```

### BoundedWildcard
Can generalize to `? extends Assembly`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/assembly/AssemblyConfigurationUtils.java`
#### Snippet
```java
  @Nonnull
  static DockerFileBuilder createDockerFileBuilder(BuildConfiguration buildConfig, AssemblyConfiguration assemblyConfig,
      Map<Assembly, List<AssemblyFileEntry>> layers) {
    DockerFileBuilder builder =
        new DockerFileBuilder()
```

### BoundedWildcard
Can generalize to `? extends List`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/assembly/AssemblyConfigurationUtils.java`
#### Snippet
```java
  @Nonnull
  static DockerFileBuilder createDockerFileBuilder(BuildConfiguration buildConfig, AssemblyConfiguration assemblyConfig,
      Map<Assembly, List<AssemblyFileEntry>> layers) {
    DockerFileBuilder builder =
        new DockerFileBuilder()
```

### BoundedWildcard
Can generalize to `? extends Pod`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/PortForwardService.java`
#### Snippet
```java
    }

    private Pod getNewestPod(List<Pod> items) {
        Pod targetPod = null;
        if (items != null) {
```

### BoundedWildcard
Can generalize to `? extends HelmParameter`
in `jkube-kit/resource/helm/src/main/java/org/eclipse/jkube/kit/resource/helm/HelmService.java`
#### Snippet
```java
  }

  private static void interpolateTemplateParameterExpressionsWithHelmExpressions(File file, List<HelmParameter> helmParameters) throws IOException {
    final String originalTemplate = FileUtils.readFileToString(file, Charset.defaultCharset());

```

### BoundedWildcard
Can generalize to `? extends HelmParameter`
in `jkube-kit/resource/helm/src/main/java/org/eclipse/jkube/kit/resource/helm/HelmService.java`
#### Snippet
```java
  }

  private static void createValuesYaml(List<HelmParameter> helmParameters, File outputDir) throws IOException {
    final Map<String, String> values = helmParameters.stream()
        .filter(hp -> hp.getParameter().getValue() != null)
```

### BoundedWildcard
Can generalize to `? super String`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ContainerDetails.java`
#### Snippet
```java
    }

    private void addPortMapping(String port, PortBinding binding, Map<String, PortBinding> portBindings) {
        if (port.indexOf('/') == -1) {
            port = port + "/tcp";
```

### BoundedWildcard
Can generalize to `? super PortBinding`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ContainerDetails.java`
#### Snippet
```java
    }

    private void addPortMapping(String port, PortBinding binding, Map<String, PortBinding> portBindings) {
        if (port.indexOf('/') == -1) {
            port = port + "/tcp";
```

### BoundedWildcard
Can generalize to `? extends Container`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/PodLogService.java`
#### Snippet
```java
    }

    private String getLogContainerName(List<Container> containers) {
        if (StringUtils.isNotBlank(context.getLogContainerName())) {
            for (Container container : containers) {
```

### BoundedWildcard
Can generalize to `? extends ResourceService`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/JKubeServiceHub.java`
#### Snippet
```java
            DockerServiceHub dockerServiceHub, JKubeConfiguration configuration,
            BuildServiceConfig buildServiceConfig,
            LazyBuilder<ResourceService> resourceService, boolean offline) {
        this.clusterAccess = clusterAccess;
        this.platformMode = platformMode;
```

### BoundedWildcard
Can generalize to `? super String`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/DockerFileUtil.java`
#### Snippet
```java
    }

    private static void updateMapWithArgValue(Map<String, String> result, Map<String, String> args, String argString) {
        if (argString.contains("=") || argString.contains(":")) {
            String[] argStringParts = argString.split("[=:]");
```

### BoundedWildcard
Can generalize to `? super String`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/DockerFileUtil.java`
#### Snippet
```java
    }

    private static void updateMapWithArgValue(Map<String, String> result, Map<String, String> args, String argString) {
        if (argString.contains("=") || argString.contains(":")) {
            String[] argStringParts = argString.split("[=:]");
```

### BoundedWildcard
Can generalize to `? extends AssemblyFileEntry`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/assembly/AssemblyManager.java`
#### Snippet
```java

    public File createChangedFilesArchive(
        List<AssemblyFileEntry> entries, File assemblyDirectory, String imageName,
        JKubeConfiguration jKubeConfiguration) throws IOException {

```

### BoundedWildcard
Can generalize to `? extends ArchiverCustomizer`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/assembly/AssemblyManager.java`
#### Snippet
```java

    // Create final tar-ball to be used for building the archive to send to the Docker daemon
    private File createBuildTarBall(JKubeConfiguration params, BuildDirs buildDirs, List<ArchiverCustomizer> archiverCustomizers,
                                    AssemblyConfiguration assemblyConfig, ArchiveCompression compression) throws IOException {
        AssemblyConfigurationSource source = new AssemblyConfigurationSource(params, buildDirs, assemblyConfig);
```

### BoundedWildcard
Can generalize to `? extends List`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/assembly/AssemblyManager.java`
#### Snippet
```java
    private void createAssemblyArchive(
        AssemblyConfiguration assemblyConfig, JKubeConfiguration params, BuildDirs buildDirs, ArchiveCompression compression,
        Map<Assembly, List<AssemblyFileEntry>> layers)
        throws IOException {

```

### BoundedWildcard
Can generalize to `? extends HasMetadata`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/DebugService.java`
#### Snippet
```java
     * @return boolean value indicating whether debug should be done or not
     */
    private boolean isDebugApplicable(Collection<HasMetadata> entities) {
        boolean controllersApplied = !entities.isEmpty();
        for (HasMetadata h : entities) {
```

### BoundedWildcard
Can generalize to `? extends AssemblyFileEntry`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/assembly/AssemblyManager.java`
#### Snippet
```java

    @Nonnull
    private static ArchiverCustomizer fileModeCustomizer(@Nonnull List<AssemblyFileEntry> fileEntries) {
        return a -> {
            fileEntries.stream().filter(afe -> StringUtils.isNotBlank(afe.getFileMode()))
```

### BoundedWildcard
Can generalize to `? extends List`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/assembly/AssemblyManager.java`
#### Snippet
```java
    private static List<ArchiverCustomizer> getDefaultCustomizers(JKubeConfiguration configuration,
        AssemblyConfiguration assemblyConfiguration, ArchiverCustomizer finalCustomizer,
        Map<Assembly, List<AssemblyFileEntry>> layers) {
        final List<ArchiverCustomizer> archiverCustomizers = new ArrayList<>();
        if (finalCustomizer != null) {
```

### BoundedWildcard
Can generalize to `? extends HasMetadata`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/kubernetes/KubernetesUndeployService.java`
#### Snippet
```java
  }

  private void undeployResources(String namespace, String fallbackNamespace, List<HasMetadata> entities) {
    final Consumer<HasMetadata> resourceDeleter = resourceDeleter(namespace, fallbackNamespace);
    entities.stream().filter(isCustomResource.negate()).forEach(resourceDeleter);
```

### BoundedWildcard
Can generalize to `? extends HasMetadata`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/kubernetes/KubernetesUndeployService.java`
#### Snippet
```java
  }

  private void undeployCustomResources(String currentNamespace, String fallbackNamespace, List<HasMetadata> entities) {
    final Consumer<HasMetadata> customResourceDeleter = customResourceDeleter(currentNamespace, fallbackNamespace);
    entities.stream().filter(isCustomResource).forEach(customResourceDeleter);
```

### BoundedWildcard
Can generalize to `? extends HasMetadata`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/kubernetes/KubernetesClientUtil.java`
#### Snippet
```java
    }

    public static void deleteEntities(NamespacedKubernetesClient kc, Collection<HasMetadata> entities, KitLogger log) {
        List<HasMetadata> list = new ArrayList<>(entities);

```

### BoundedWildcard
Can generalize to `? extends HasMetadata`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/kubernetes/KubernetesClientUtil.java`
#### Snippet
```java
    }

    public static void deleteOpenShiftEntities(NamespacedKubernetesClient kc, Collection<HasMetadata> entities, String s2iBuildNameSuffix, KitLogger log) {
        // For OpenShift cluster, also delete s2i buildconfig
        OpenShiftClient openshiftClient = OpenshiftHelper.asOpenShiftClient(kc);
```

### BoundedWildcard
Can generalize to `? extends HasMetadata`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/kubernetes/KubernetesClientUtil.java`
#### Snippet
```java
    private KubernetesClientUtil() { }

    public static void resizeApp(NamespacedKubernetesClient kubernetes, Collection<HasMetadata> entities, int replicas, KitLogger log) {
        for (HasMetadata entity : entities) {
            String name = KubernetesHelper.getName(entity);
```

### BoundedWildcard
Can generalize to `? super Build`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/openshift/OpenshiftBuildService.java`
#### Snippet
```java
    }

    private Watcher<Build> getBuildWatcher(final CountDownLatch latch, final String buildName, final AtomicReference<Build> buildHolder) {
        return new Watcher<Build>() {

```

### BoundedWildcard
Can generalize to `? extends ImageConfiguration`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ContainerEnvJavaOptionsMergeEnricher.java`
#### Snippet
```java
    private final List<ImageConfiguration> imageConfigurations;

    public ContainerEnvJavaOptionsMergeVisitor(List<ImageConfiguration> imageConfigurations) {
      this.imageConfigurations = imageConfigurations;
    }
```

### BoundedWildcard
Can generalize to `? extends EnvVar`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ContainerEnvJavaOptionsMergeEnricher.java`
#### Snippet
```java
    }

    private List<EnvVar> mergeEnv(List<EnvVar> envVars, ImageConfiguration imageConfiguration) {
      final List<EnvVar> ret = new ArrayList<>();
      for (EnvVar env : envVars) {
```

### BoundedWildcard
Can generalize to `? super List`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DependencyEnricher.java`
#### Snippet
```java
    }

    private void processArtifactSetResources(Set<URI> artifactSet, Function<List<HasMetadata>, Void> function) {
        for (URI uri : artifactSet) {
            try {
```

### BoundedWildcard
Can generalize to `? extends HasMetadata`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DependencyEnricher.java`
#### Snippet
```java
    }

    public void filterAndAddItemsToBuilder(KubernetesListBuilder builder, List<HasMetadata> items) {
        Map<KindAndName, Integer> aIndexMap = new HashMap<>();
        int nItems = 0;
```

### BoundedWildcard
Can generalize to `? extends HasMetadata`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DependencyEnricher.java`
#### Snippet
```java
    }

    private void removeTemplateObjects(List<HasMetadata> list, List<HasMetadata> objects) {
        for (HasMetadata object : objects) {
            List<HasMetadata> copy = new ArrayList<>(list);
```

### BoundedWildcard
Can generalize to `? extends HasMetadata`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DependencyEnricher.java`
#### Snippet
```java
    }

    private void removeTemplateObjects(List<HasMetadata> list, List<HasMetadata> objects) {
        for (HasMetadata object : objects) {
            List<HasMetadata> copy = new ArrayList<>(list);
```

### BoundedWildcard
Can generalize to `? super URI`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DependencyEnricher.java`
#### Snippet
```java
    }

    private void addArtifactsWithYaml(Set<URI> artifactSet, String dependencyYaml) throws URISyntaxException {
        final List<Dependency> artifacts = getContext().getDependencies(isIncludeTransitive());

```

### BoundedWildcard
Can generalize to `? extends Container`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/VolumePermissionEnricher.java`
#### Snippet
```java
            }

            private String getMountPath(List<Container> containers, String name){
                for (Container container : containers) {
                    List<VolumeMount> volumeMounts = container.getVolumeMounts();
```

### BoundedWildcard
Can generalize to `? extends io.fabric8.kubernetes.api.model.networking.v1.IngressRule`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ingress/ExtensionsV1beta1IngressConverter.java`
#### Snippet
```java
    }

    private static List<IngressRule> convertIngressRules(List<io.fabric8.kubernetes.api.model.networking.v1.IngressRule> networkingV1IngressRules) {
        List<IngressRule> ingressRules = new ArrayList<>();
        networkingV1IngressRules.forEach(ir -> ingressRules.add(convertIngressRule(ir)));
```

### BoundedWildcard
Can generalize to `? extends io.fabric8.kubernetes.api.model.networking.v1.IngressTLS`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ingress/ExtensionsV1beta1IngressConverter.java`
#### Snippet
```java
    }

    private static List<IngressTLS> convertIngressTls(List<io.fabric8.kubernetes.api.model.networking.v1.IngressTLS> networkV1IngressTls) {
        List<IngressTLS> ingressTLS = new ArrayList<>();
        networkV1IngressTls.forEach(t -> ingressTLS.add(convertIngressTls(t)));
```

### BoundedWildcard
Can generalize to `? extends io.fabric8.kubernetes.api.model.networking.v1.HTTPIngressPath`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ingress/ExtensionsV1beta1IngressConverter.java`
#### Snippet
```java
    }

    private static List<HTTPIngressPath> convertHTTPIngressPaths(List<io.fabric8.kubernetes.api.model.networking.v1.HTTPIngressPath> networkV1HttpIngressPaths) {
        List<HTTPIngressPath> httpIngressPaths = new ArrayList<>();
        networkV1HttpIngressPaths.forEach(h -> httpIngressPaths.add(convertHTTPIngressPath(h)));
```

### BoundedWildcard
Can generalize to `? extends VolumeMount`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/openshift/AutoTLSEnricher.java`
#### Snippet
```java
            }

            private boolean isVolumeMountAlreadyExists(List<VolumeMount> volumes, String volumeName) {
                for (VolumeMount v : volumes) {
                    if (volumeName.equals(v.getName())) {
```

### BoundedWildcard
Can generalize to `? extends Volume`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/openshift/AutoTLSEnricher.java`
#### Snippet
```java
            }

            private boolean isVolumeAlreadyExists(List<Volume> volumes, String volumeName) {
                for (Volume v : volumes) {
                    if (volumeName.equals(v.getName())) {
```

### BoundedWildcard
Can generalize to `? extends ServicePort`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java
    }

    private String formatPortsAsList(List<ServicePort> ports)  {
        List<String> p = new ArrayList<>();
        for (ServicePort port : ports) {
```

### BoundedWildcard
Can generalize to `? extends ServicePort`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java
    }

    private List<ServicePort> mirrorMissingTargetPorts(List<ServicePort> ports) {
        List<ServicePort> ret = new ArrayList<>();
        for (ServicePort port : ports) {
```

### BoundedWildcard
Can generalize to `? extends Service`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java

    // convert list to array, never returns null.
    private Service[] toArray(List<Service> services) {
        if (services == null) {
            return new Service[0];
```

### BoundedWildcard
Can generalize to `? extends ServicePort`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java
    }

    private void ensurePortProtocolAndName(List<ServicePort> ports) {
        for (ServicePort port : ports) {
            String protocol = ensureProtocol(port);
```

### BoundedWildcard
Can generalize to `? extends ServicePort`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java

    // remove first element of list or null if list is empty
    private ServicePort shiftOrNull(List<ServicePort> ports) {
        if (!ports.isEmpty()) {
            return ports.remove(0);
```

### BoundedWildcard
Can generalize to `? extends ImageConfiguration`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java


    private List<ServicePort> extractPorts(List<ImageConfiguration> images) {
        List<ServicePort> ret = new ArrayList<>();
        boolean isMultiPort = Boolean.parseBoolean(getConfig(Config.MULTI_PORT));
```

### BoundedWildcard
Can generalize to `? super ServicePort`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java

    // null ports can happen for ignored mappings
    private void addPortIfNotNull(List<ServicePort> ret, ServicePort port) {
        if (port != null) {
            ret.add(port);
```

### BoundedWildcard
Can generalize to `? extends IngressRuleConfig`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ingress/NetworkingV1IngressGenerator.java`
#### Snippet
```java
    }

    private static IngressSpec getXmlConfiguredIngressSpec(List<IngressRuleConfig> ingressRuleConfigs, List<IngressTlsConfig> ingressTlsConfigs) {
        IngressSpecBuilder ingressSpecBuilder = new IngressSpecBuilder();
        for (IngressRuleConfig ingressRuleConfig: ingressRuleConfigs) {
```

### BoundedWildcard
Can generalize to `? extends IngressTlsConfig`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ingress/NetworkingV1IngressGenerator.java`
#### Snippet
```java
    }

    private static IngressSpec getXmlConfiguredIngressSpec(List<IngressRuleConfig> ingressRuleConfigs, List<IngressTlsConfig> ingressTlsConfigs) {
        IngressSpecBuilder ingressSpecBuilder = new IngressSpecBuilder();
        for (IngressRuleConfig ingressRuleConfig: ingressRuleConfigs) {
```

### BoundedWildcard
Can generalize to `? super String`
in `jkube-kit/common-maven/src/main/java/org/eclipse/jkube/kit/common/util/MavenConfigurationExtractor.java`
#### Snippet
```java
    }

    private static void addAsList(Map<String, Object> conf, Xpp3Dom currentElement) {
        final Object insertedValue = conf.get(currentElement.getName());
        if (insertedValue instanceof List) {
```

### BoundedWildcard
Can generalize to `? extends TagReference`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
     * @return the number of tags removed
     */
    private int removeTagByName(List<TagReference> tags, String tagName) {
        List<TagReference> removeTags = new ArrayList<>();
        for (TagReference tag : tags) {
```

### BoundedWildcard
Can generalize to `? extends HasMetadata`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
    }

    public static List<HasMetadata> getK8sListWithNamespaceFirst(Collection<HasMetadata> k8sList) {
        return k8sList.stream().sorted(new HasMetadataComparator()).sorted((k1, k2) -> {
            if (isNamespaceOrProject(k1)) {
```

### BoundedWildcard
Can generalize to `? extends HasMetadata`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
    }

    private void applyStandardEntities(String fileName, List<HasMetadata> entities) {
        for (HasMetadata entity : entities) {
            if (entity instanceof Pod) {
```

### BoundedWildcard
Can generalize to `? extends HasMetadata`
in `jkube-kit/watcher/standard/src/main/java/org/eclipse/jkube/watcher/standard/DockerImageWatcher.java`
#### Snippet
```java
    }

    protected void restartContainer(WatchService.ImageWatcher watcher, Collection<HasMetadata> resources) {
        ImageConfiguration imageConfig = watcher.getImageConfiguration();
        String imageName = imageConfig.getName();
```

### BoundedWildcard
Can generalize to `? extends RegistryServerConfiguration`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/RegistryServerConfiguration.java`
#### Snippet
```java


    public static RegistryServerConfiguration getServer(final List<RegistryServerConfiguration> settings, final String serverId) {
        if (settings != null && !StringUtils.isBlank(serverId)) {
            for (RegistryServerConfiguration registryServerConfiguration : settings) {
```

### BoundedWildcard
Can generalize to `? super String`
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/DockerFileBuilder.java`
#### Snippet
```java
    public static List<String[]> extractLines(File dockerFile,
                                              String keyword,
                                              Function<String, String> interpolator) throws IOException {
        List<String[]> ret = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(dockerFile))) {
```

### BoundedWildcard
Can generalize to `? super String`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/BuildReferenceDateUtil.java`
#### Snippet
```java
   * @return timestamp to use
   */
  public static Date getBuildTimestamp(Map<String, Object> pluginContext, String buildTimestampContextKey,
                                                    String projectBuildDir, String dockerBuildTimestampFile) throws IOException {
    Date now = (Date) (pluginContext != null ? pluginContext.get(buildTimestampContextKey) : null);
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/ExternalCommand.java`
#### Snippet
```java
    }

    private void stopStreamPump(Future<IOException> future) throws IOException {
        try {
            IOException e = future.get(2, TimeUnit.SECONDS);
```

### BoundedWildcard
Can generalize to `? extends Parameter`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/OpenshiftHelper.java`
#### Snippet
```java
    // =============================================================================================

    private static void combineParameters(List<Parameter> parameters, List<Parameter> otherParameters) {
        if (otherParameters != null && !otherParameters.isEmpty()) {
            Map<String, Parameter> map = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends Profile`
in `jkube-kit/profile/src/main/java/org/eclipse/jkube/kit/profile/ProfileUtil.java`
#### Snippet
```java


    private static Profile mergeProfiles(List<Profile> profiles) {
        Profile ret = null;
        for (Profile profile : profiles) {
```

### BoundedWildcard
Can generalize to `? extends ConstraintViolation`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/ValidationUtil.java`
#### Snippet
```java
    private ValidationUtil() { }

    public static String createValidationMessage(Set<ConstraintViolation<?>> constraintViolations) {
        if (constraintViolations.isEmpty()) {
            return "No Constraint Validations!";
```

### BoundedWildcard
Can generalize to `? extends T`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/AsyncUtil.java`
#### Snippet
```java
  }

  public static <T> CompletableFuture<T> async(Callable<T> callable) {
    final CompletableFuture<T> future = new CompletableFuture<>();
    CompletableFuture.runAsync(() -> {
```

### BoundedWildcard
Can generalize to `? extends T`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/AsyncUtil.java`
#### Snippet
```java
  }

  public static <T> Function<Predicate<T>, CompletableFuture<T>> await(Supplier<T> supplier) {
    return predicate -> async(() -> {
      T ret;
```

### BoundedWildcard
Can generalize to `? extends T`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/LazyBuilder.java`
#### Snippet
```java
    private final Supplier<T> build;

    public LazyBuilder(Supplier<T> build) {
        this.instance = new AtomicReference<>();
        this.build = build;
```

### BoundedWildcard
Can generalize to `? super String`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/ClassUtil.java`
#### Snippet
```java


    private static void findClasses(List<String> classes, File dir, String prefix) throws IOException {
        for (File subDir : dir.listFiles(DIR_FILTER)) {
            findClasses(classes, subDir, prefix);
```

### BoundedWildcard
Can generalize to `? super String`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/MapUtil.java`
#### Snippet
```java
     * @param toPut source hash map
     */
    public static void putAllIfNotNull(Map<String, String> ret, Map<String, String> toPut) {
        if (toPut != null) {
            ret.putAll(toPut);
```

### BoundedWildcard
Can generalize to `? super String`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/MapUtil.java`
#### Snippet
```java
     * @param toPut source hash map
     */
    public static void putAllIfNotNull(Map<String, String> ret, Map<String, String> toPut) {
        if (toPut != null) {
            ret.putAll(toPut);
```

### BoundedWildcard
Can generalize to `? super String`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/MapUtil.java`
#### Snippet
```java
     * @param toMerge the values to add
     */
    public static void mergeIfAbsent(Map<String, String> map, Map<String, String> toMerge) {
        for (Map.Entry<String, String> entry : toMerge.entrySet()) {
            map.putIfAbsent(entry.getKey(), entry.getValue());
```

### BoundedWildcard
Can generalize to `? super String`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/MapUtil.java`
#### Snippet
```java
     * @param toMerge the values to add
     */
    public static void mergeIfAbsent(Map<String, String> map, Map<String, String> toMerge) {
        for (Map.Entry<String, String> entry : toMerge.entrySet()) {
            map.putIfAbsent(entry.getKey(), entry.getValue());
```

### BoundedWildcard
Can generalize to `? extends K`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/MapUtil.java`
#### Snippet
```java
     * @return merged hash map
     */
    public static <K,V> Map<K,V> mergeMaps(Map<K, V> map1, Map<K, V> map2) {
        Map<K, V> answer = new HashMap<>();
        if (map2 != null) {
```

### BoundedWildcard
Can generalize to `? extends V`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/MapUtil.java`
#### Snippet
```java
     * @return merged hash map
     */
    public static <K,V> Map<K,V> mergeMaps(Map<K, V> map1, Map<K, V> map2) {
        Map<K, V> answer = new HashMap<>();
        if (map2 != null) {
```

### BoundedWildcard
Can generalize to `? extends K`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/MapUtil.java`
#### Snippet
```java
     * @return merged hash map
     */
    public static <K,V> Map<K,V> mergeMaps(Map<K, V> map1, Map<K, V> map2) {
        Map<K, V> answer = new HashMap<>();
        if (map2 != null) {
```

### BoundedWildcard
Can generalize to `? extends V`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/MapUtil.java`
#### Snippet
```java
     * @return merged hash map
     */
    public static <K,V> Map<K,V> mergeMaps(Map<K, V> map1, Map<K, V> map2) {
        Map<K, V> answer = new HashMap<>();
        if (map2 != null) {
```

### BoundedWildcard
Can generalize to `? extends Dependency`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/JKubeProjectUtil.java`
#### Snippet
```java
  }

  private static Dependency getDependencyByGroupArtifact(List<Dependency> dependencyList, String groupId, String artifactId) {
    if (dependencyList != null) {
      return iterateOverListWithCondition(dependencyList, dependency ->
```

### BoundedWildcard
Can generalize to `? extends Container`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/PodHelper.java`
#### Snippet
```java
  }

  public static boolean firstContainerHasEnvVar(List<Container> containers, String name, String value) {
    if (containers != null && !containers.isEmpty()) {
      Container container = containers.get(0);
```

### BoundedWildcard
Can generalize to `? extends ConstraintViolationImpl`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/validator/ResourceValidator.java`
#### Snippet
```java
    }

    private String getErrorMessage(File resource, Set<ConstraintViolationImpl> violations) {
        StringBuilder validationError = new StringBuilder();
        validationError.append("Invalid Resource : ");
```

### BoundedWildcard
Can generalize to `? extends ValidationMessage`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/validator/ResourceValidator.java`
#### Snippet
```java
    }

    private void processErrors(Set<ValidationMessage> errors, File resource) {
        Set<ConstraintViolationImpl> constraintViolations = new HashSet<>();
        for (ValidationMessage errorMsg: errors) {
```

### BoundedWildcard
Can generalize to `? extends TreeMap`
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/resource/ProcessorConfig.java`
#### Snippet
```java
     */
    @SuppressWarnings({"squid:S3740", "rawtypes", "unchecked"})
    public void setConfig(Map<String, TreeMap> config) {
        this.config = new HashMap<>();
        config.forEach((key, value) -> this.config.put(key, value));
```

### BoundedWildcard
Can generalize to `? extends T`
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/resource/ProcessorConfig.java`
#### Snippet
```java
     * @return the ordered list according to the algorithm described above
     */
    public <T extends Named> List<T> prepareProcessors(List<T> namedList, String type) {
        List<T> ret = new ArrayList<>();
        Map<String, T> lookup = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends WaitChecker`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/WaitService.java`
#### Snippet
```java
    }

    private String extractCheckerLog(List<WaitChecker> checkers) {
        List<String> logOut = new ArrayList<>();
        for (WaitChecker checker : checkers) {
```

### BoundedWildcard
Can generalize to `? extends File`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/archive/JKubeTarArchiver.java`
#### Snippet
```java

  public static File createTarBall(
      File outputFile, File inputDirectory, List<File> fileList, Map<File, String> fileModeMap,
      ArchiveCompression compression,
      Consumer<TarArchiveOutputStream> tarCustomizer, Consumer<TarArchiveEntry> tarArchiveEntryCustomizer
```

### BoundedWildcard
Can generalize to `? super TarArchiveOutputStream`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/archive/JKubeTarArchiver.java`
#### Snippet
```java
      File outputFile, File inputDirectory, List<File> fileList, Map<File, String> fileModeMap,
      ArchiveCompression compression,
      Consumer<TarArchiveOutputStream> tarCustomizer, Consumer<TarArchiveEntry> tarArchiveEntryCustomizer
  ) throws IOException {
    try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
```

### BoundedWildcard
Can generalize to `? super TarArchiveEntry`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/archive/JKubeTarArchiver.java`
#### Snippet
```java
      File outputFile, File inputDirectory, List<File> fileList, Map<File, String> fileModeMap,
      ArchiveCompression compression,
      Consumer<TarArchiveOutputStream> tarCustomizer, Consumer<TarArchiveEntry> tarArchiveEntryCustomizer
  ) throws IOException {
    try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
```

### BoundedWildcard
Can generalize to `? extends WaitChecker`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/wait/WaitUtil.java`
#### Snippet
```java

    // Give checkers a possibility to clean up
    private static void cleanup(Iterable<WaitChecker> checkers) {
        for (WaitChecker checker : checkers) {
            checker.cleanUp();
```

### BoundedWildcard
Can generalize to `? extends WaitChecker`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/wait/WaitUtil.java`
#### Snippet
```java
    }

    private static boolean check(Iterable<WaitChecker> checkers) {
        for (WaitChecker checker : checkers) {
            if (checker.check()) {
```

### BoundedWildcard
Can generalize to `? extends VolumeConfiguration`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/RunService.java`
#### Snippet
```java
     * @throws DockerAccessException docker access exception
     */
    public List<String> createVolumesAsPerVolumeBinds(DockerServiceHub hub, List<String> binds, List<VolumeConfiguration> volumes)
            throws DockerAccessException {

```

### BoundedWildcard
Can generalize to `? extends ImageConfiguration`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/RunService.java`
#### Snippet
```java
    }

    private List<ImageConfiguration> convertToResolvables(List<ImageConfiguration> images) {
        List<ImageConfiguration> ret = new ArrayList<>();
        for (ImageConfiguration config : images) {
```

### BoundedWildcard
Can generalize to `? extends Network`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/RunService.java`
#### Snippet
```java
    }

    public void removeCustomNetworks(Collection<Network> networks) throws DockerAccessException {
        for (Network network : networks) {
            docker.removeNetwork(network.getId());
```

### BoundedWildcard
Can generalize to `? super Network`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/RunService.java`
#### Snippet
```java
    }

    private void collectCustomNetworks(Set<Network> networksToRemove, ContainerTracker.ContainerShutdownDescriptor descriptor, boolean removeCustomNetworks) throws DockerAccessException {
        final NetworkConfig config = descriptor.getImageConfiguration().getRunConfiguration().getNetworkingConfig();
        if (removeCustomNetworks && config.isCustomNetwork()) {
```

### BoundedWildcard
Can generalize to `? extends RegistryServerConfiguration`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java

    protected static AuthConfig getAuthConfigFromSettings(
        List<RegistryServerConfiguration> settings, String user, String registry, UnaryOperator<String> passwordDecryptionMethod) {

        RegistryServerConfiguration defaultServer = null;
```

### BoundedWildcard
Can generalize to `? extends UlimitConfig`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/ContainerHostConfig.java`
#### Snippet
```java
    }

    public ContainerHostConfig ulimits(List<UlimitConfig> ulimitsConfig) {
        if (ulimitsConfig != null && !ulimitsConfig.isEmpty()) {
            JsonArray ulimits = new JsonArray();
```

### BoundedWildcard
Can generalize to `? extends T`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/ApacheHttpClientDelegate.java`
#### Snippet
```java
        private final ResponseHandler<T> delegate;

        StatusCodeCheckerResponseHandler(ResponseHandler<T> delegate, int... statusCodes) {
            this.statusCodes = statusCodes;
            this.delegate = delegate;
```

### BoundedWildcard
Can generalize to `? extends EnvVar`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
    }

    public static String getEnvVar(List<EnvVar> envVarList, String name, String defaultValue) {
        String answer = defaultValue;
        if (envVarList != null) {
```

### BoundedWildcard
Can generalize to `? extends Pod`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
    }

    public static Pod getNewestPod(Collection<Pod> pods) {
        if (pods == null || pods.isEmpty()) {
            return null;
```

### BoundedWildcard
Can generalize to `? extends HasMetadata`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
    }

    public static LabelSelector extractPodLabelSelector(Collection<HasMetadata> entities) {
        LabelSelector chosenSelector = null;
        for (HasMetadata entity : entities) {
```

### BoundedWildcard
Can generalize to `? extends ContainerPort`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
    }

    public static boolean containsPort(List<ContainerPort> ports, String portValue) {
        for (ContainerPort port : ports) {
            Integer containerPort = port.getContainerPort();
```

### BoundedWildcard
Can generalize to `? extends Lookup`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/FormatParameterReplacer.java`
#### Snippet
```java
    private final Map<String, Lookup> lookupMap;

    public FormatParameterReplacer(Map<String, Lookup> lookupMap) {
        this.lookupMap = lookupMap;
    }
```

### BoundedWildcard
Can generalize to `? extends Container`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/ContainerNamingUtil.java`
#### Snippet
```java

    // Filter out any older indexed containernames, keeping only the last one (i.e. with the highest index)
    private static Collection<Container> keepOnlyLastIndexedContainer(Collection<Container> existingContainers, final String partiallyApplied) {

        Collection<Container> result = new ArrayList<>(existingContainers);
```

### BoundedWildcard
Can generalize to `? extends Container`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/ContainerNamingUtil.java`
#### Snippet
```java
    }

    private static Set<String> extractContainerNames(final Collection<Container> existingContainers) {
        final ImmutableSet.Builder<String> containerNamesBuilder = ImmutableSet.builder();
        for (final Container container : existingContainers) {
```

### BoundedWildcard
Can generalize to `? extends ImageConfiguration`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/StartOrderResolver.java`
#### Snippet
```java
    // Images references via volumes but with no run configuration are started once to create
    // an appropriate container which can be linked into the image
    private List<ImageConfiguration> resolve(List<ImageConfiguration> images) {
        List<ImageConfiguration> resolved = new ArrayList<>();
        // First pass: Pick all data images and all without dependencies
```

### BoundedWildcard
Can generalize to `? super ImageConfiguration`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/StartOrderResolver.java`
#### Snippet
```java
    }

    private void resolveImageDependencies(List<ImageConfiguration> resolved) throws DockerAccessException, ResolveSteadyStateException {
        boolean changed = false;
        Iterator<ImageConfiguration> iterator = secondPass.iterator();
```

### BoundedWildcard
Can generalize to `? super Enricher`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/DefaultEnricherManager.java`
#### Snippet
```java
  }

  private void loop(ProcessorConfig config, Function<Enricher, Void> function) {
    for (Enricher enricher : filterEnrichers(config, enrichers)) {
      function.apply(enricher);
```

### BoundedWildcard
Can generalize to `? extends Enricher`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/DefaultEnricherManager.java`
#### Snippet
```java

  // =============================================================================================
  private void logEnrichers(List<Enricher> enrichers) {
    log.verbose("Enrichers:");
    for (Enricher enricher : enrichers) {
```

### BoundedWildcard
Can generalize to `? extends ImageConfiguration`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/ConfigHelper.java`
#### Snippet
```java
    // Filter image configuration on name. Given filter should be either null (no filter) or a comma separated
    // list of image names which should be used
    private static List<ImageConfiguration> filterImages(String nameFilter, List<ImageConfiguration> imagesToFilter) {
        List<ImageConfiguration> ret = new ArrayList<>();
        for (ImageConfiguration imageConfig : imagesToFilter) {
```

### BoundedWildcard
Can generalize to `? extends ImageConfiguration`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/ConfigHelper.java`
#### Snippet
```java
     * @return the minimal API Docker API required to be used for the given configuration.
     */
    public static String initAndValidate(List<ImageConfiguration> images, String apiVersion, NameFormatter nameFormatter) {
        // Init and validate configs. After this step, getResolvedImages() contains the valid configuration.
        for (ImageConfiguration imageConfiguration : images) {
```

### BoundedWildcard
Can generalize to `? extends ImageConfiguration`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/ConfigHelper.java`
#### Snippet
```java
    }

    public static void validateExternalPropertyActivation(JavaProject project, List<ImageConfiguration> images) {
        String prop = getExternalConfigActivationProperty(project);
        if(prop == null) {
```

### BoundedWildcard
Can generalize to `? extends ImageConfiguration`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/ConfigHelper.java`
#### Snippet
```java

    // Extract authentication information
    private static void verifyImageNames(List<ImageConfiguration> ret) {
        for (ImageConfiguration config : ret) {
            if (config.getName() == null) {
```

### BoundedWildcard
Can generalize to `? extends ImageConfiguration`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/ConfigHelper.java`
#### Snippet
```java
    // Resolve and initialize external configuration
    private static List<ImageConfiguration> resolveConfiguration(Resolver imageResolver,
                                                                 List<ImageConfiguration> unresolvedImages) {
        List<ImageConfiguration> ret = new ArrayList<>();
        if (unresolvedImages != null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/model/Configuration.java`
#### Snippet
```java
    public Configuration(
        @Singular List<ImageConfiguration> images, ResourceConfig resource,
        BiFunction<String, String, Optional<Map<String, Object>>> pluginConfigLookup,
        Function<String, Optional<Map<String, Object>>> secretConfigLookup, ProcessorConfig processorConfig,
        JKubeBuildStrategy jKubeBuildStrategy) {
```

### BoundedWildcard
Can generalize to `? super String`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/model/Configuration.java`
#### Snippet
```java
    public Configuration(
        @Singular List<ImageConfiguration> images, ResourceConfig resource,
        BiFunction<String, String, Optional<Map<String, Object>>> pluginConfigLookup,
        Function<String, Optional<Map<String, Object>>> secretConfigLookup, ProcessorConfig processorConfig,
        JKubeBuildStrategy jKubeBuildStrategy) {
```

### BoundedWildcard
Can generalize to `? super String`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/model/Configuration.java`
#### Snippet
```java
        @Singular List<ImageConfiguration> images, ResourceConfig resource,
        BiFunction<String, String, Optional<Map<String, Object>>> pluginConfigLookup,
        Function<String, Optional<Map<String, Object>>> secretConfigLookup, ProcessorConfig processorConfig,
        JKubeBuildStrategy jKubeBuildStrategy) {

```

### BoundedWildcard
Can generalize to `? extends UlimitConfig`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/PropertyConfigHandler.java`
#### Snippet
```java
    }

    private List<UlimitConfig> extractUlimits(List<UlimitConfig> config, ValueProvider valueProvider) {
        List<String> other = null;
        if (config != null) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java

        @Override
        protected List<T> merge(ConfigKey key, List<List<T>> values) {
            List<T> merged = new ArrayList<>();
            for (List<T> value : values) {
```

### BoundedWildcard
Can generalize to `? extends Map`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java

        @Override
        protected Map<String, String> merge(ConfigKey key, List<Map<String, String>> values) {
            Map<String, String> merged = null;

```

### BoundedWildcard
Can generalize to `? super String`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
    }

    public <T> T getObject(ConfigKey key, T fromConfig, final Function<String, T> converter) {
        ValueExtractor<T> arbitraryExtractor = new ValueExtractor<T>() {
            @Override
```

### BoundedWildcard
Can generalize to `? extends T`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
    }

    public <T> T getObject(ConfigKey key, T fromConfig, final Function<String, T> converter) {
        ValueExtractor<T> arbitraryExtractor = new ValueExtractor<T>() {
            @Override
```

### BoundedWildcard
Can generalize to `? extends ServiceConfig`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/handler/ServiceHandler.java`
#### Snippet
```java
public class ServiceHandler {

    public List<Service> getServices(List<ServiceConfig> services) {

        ArrayList<Service> ret = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends ImageConfiguration`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/handler/ContainerHandler.java`
#### Snippet
```java
    }

    List<Container> getContainers(ControllerResourceConfig config, List<ImageConfiguration> images)  {
        List<Container> ret = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? super Integer`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/handler/ProbeHandler.java`
#### Snippet
```java

    @SuppressWarnings("java:S4276") // IntSupplier throws NullPointerException when unboxing null Integers
    private void setTimeoutInProbeIfNotNull(Probe probe, Supplier<Integer> integerSupplier, BiConsumer<Integer, Probe> probeConsumer) {
        Integer i = integerSupplier.get();
        if (i != null) {
```

### BoundedWildcard
Can generalize to `? super Probe`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/handler/ProbeHandler.java`
#### Snippet
```java

    @SuppressWarnings("java:S4276") // IntSupplier throws NullPointerException when unboxing null Integers
    private void setTimeoutInProbeIfNotNull(Probe probe, Supplier<Integer> integerSupplier, BiConsumer<Integer, Probe> probeConsumer) {
        Integer i = integerSupplier.get();
        if (i != null) {
```

### BoundedWildcard
Can generalize to `? extends Parameter`
in `jkube-kit/resource/service/src/main/java/org/eclipse/jkube/kit/resource/service/TemplateUtil.java`
#### Snippet
```java
  }

  private static String interpolateTemplateVariables(List<Parameter> parameters, String text) {
    for (Parameter parameter : parameters) {
      final String from = "${" + parameter.getName() + "}";
```

### BoundedWildcard
Can generalize to `? super String`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/KubernetesResourceUtil.java`
#### Snippet
```java
    }

    private static void addKind(Map<String, Object> fragment, String kind, String fileName) {
        if (kind == null && !fragment.containsKey("kind")) {
            throw new IllegalArgumentException(
```

### BoundedWildcard
Can generalize to `? extends InitContainerConfig`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/KubernetesResourceUtil.java`
#### Snippet
```java
    }

    public static List<Container> createNewInitContainersFromConfig(List<InitContainerConfig> initContainerConfigs) {
        List<Container> initContainers = new ArrayList<>();
        for (InitContainerConfig initContainerConfig : initContainerConfigs) {
```

### BoundedWildcard
Can generalize to `? super String`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/KubernetesResourceUtil.java`
#### Snippet
```java
    // ===============================================================================================

    private static Map<String, Object> getMetadata(Map<String, Object> fragment) {
        Object mo = fragment.get("metadata");
        Map<String, Object> meta;
```

### BoundedWildcard
Can generalize to `? extends MappingConfig`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/KubernetesResourceUtil.java`
#### Snippet
```java
    }

    public static void updateKindFilenameMappings(List<MappingConfig> mappings) {
        if (mappings != null) {
            final Map<String, List<String>> mappingKindFilename = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends VolumeConfig`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/KubernetesResourceUtil.java`
#### Snippet
```java
    }

    private static List<VolumeMount> createVolumeMountsFromConfig(List<VolumeConfig> volumeConfigs) {
        List<VolumeMount> volumeMounts = new ArrayList<>();
        for (VolumeConfig vc : volumeConfigs) {
```

### BoundedWildcard
Can generalize to `? super String`
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/AbstractPortsExtractor.java`
#### Snippet
```java
	 * @param port The candidate port.
	 */
	private void addPortIfValid(Map<String, Integer> map, String key, String port) {
		if (StringUtils.isNotBlank(port)) {
			String t = port.trim();
```

### BoundedWildcard
Can generalize to `? super Integer`
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/AbstractPortsExtractor.java`
#### Snippet
```java
	 * @param port The candidate port.
	 */
	private void addPortIfValid(Map<String, Integer> map, String key, String port) {
		if (StringUtils.isNotBlank(port)) {
			String t = port.trim();
```

### BoundedWildcard
Can generalize to `? extends ImageConfiguration`
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/BaseGenerator.java`
#### Snippet
```java
    }

    private boolean containsBuildConfiguration(List<ImageConfiguration> configs) {
        for (ImageConfiguration imageConfig : configs) {
            if (imageConfig.getBuildConfiguration() != null) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/GroovyUtil.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private static <T> List<T> namedClosureListTo(Closure<?> closure, Class<T> targetListType) {
    final ConfigObject co = parse(closure);
    final List<T> ret = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends Closure`
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/KubernetesExtension.java`
#### Snippet
```java
  }

  public void mappings(List<Closure<?>> closures) {
    mappings = closures.stream().map(c -> closureTo(c, MappingConfig.class)).collect(Collectors.toList());
  }
```

### BoundedWildcard
Can generalize to `? super String`
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/KubernetesExtension.java`
#### Snippet
```java
  }

  protected <T> Optional<T> getProperty(String property, Function<String, T> propertyCaster) {
    final String propValue = javaProject.getProperties().getProperty(property);
    if (StringUtils.isNotBlank(propValue)) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/KubernetesExtension.java`
#### Snippet
```java
  }

  protected <T> Optional<T> getProperty(String property, Function<String, T> propertyCaster) {
    final String propValue = javaProject.getProperties().getProperty(property);
    if (StringUtils.isNotBlank(propValue)) {
```

### BoundedWildcard
Can generalize to `? extends Closure`
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/KubernetesExtension.java`
#### Snippet
```java
   * @param closures The list of closures to unmarshal with individual ImageConfiguration
   */
  public void images(List<Closure<?>> closures) {
    images = closures.stream().map(c -> closureTo(c, ImageConfiguration.class)).collect(Collectors.toList());
  }
```

### BoundedWildcard
Can generalize to `? extends Property`
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/KubernetesExtension.java`
#### Snippet
```java
  }

  protected <T> T getOrDefault(String property, Function<String, T> propertyCaster, Supplier<Property<T>> dslGetter,
      T defaultValue) {
    return getProperty(property, propertyCaster).orElse(dslGetter.get().getOrElse(defaultValue));
```

### BoundedWildcard
Can generalize to `? super JavaProject`
in `jkube-kit/jkube-kit-quarkus/src/main/java/org/eclipse/jkube/quarkus/enricher/QuarkusHealthCheckEnricher.java`
#### Snippet
```java
    }

    private Probe discoverQuarkusHealthCheck(int initialDelay, Function<JavaProject, String> pathResolver) {
        if (!getContext().hasDependency(QUARKUS_GROUP_ID, "quarkus-smallrye-health")) {
            return null;
```

### BoundedWildcard
Can generalize to `? super String`
in `jkube-kit/generator/karaf/src/main/java/org/eclipse/jkube/generator/karaf/KarafGenerator.java`
#### Snippet
```java
  }

  protected void addPortIfValid(List<String> list, String port) {
    if (StringUtils.isNotBlank(port) && Integer.parseInt(port) > 0) {
      list.add(port);
```

### BoundedWildcard
Can generalize to `? super ResolutionResult`
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/GradleUtil.java`
#### Snippet
```java

  private static List<Dependency> extractDependencies(Project gradleProject,
      Function<ResolutionResult, Set<? extends DependencyResult>> resolutionToDependency) {
    return new ArrayList<Configuration>(gradleProject.getConfigurations()).stream()
        .filter(GradleUtil::canBeResolved)
```

### BoundedWildcard
Can generalize to `? extends Set`
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/GradleUtil.java`
#### Snippet
```java

  private static List<Dependency> extractDependencies(Project gradleProject,
      Function<ResolutionResult, Set<? extends DependencyResult>> resolutionToDependency) {
    return new ArrayList<Configuration>(gradleProject.getConfigurations()).stream()
        .filter(GradleUtil::canBeResolved)
```

### BoundedWildcard
Can generalize to `? extends File`
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/generator/SpringBootGenerator.java`
#### Snippet
```java
    }

    private boolean matchesFatJarEntry(List<File> fatJarEntries, String path, boolean lib) {
        for (File e : fatJarEntries) {
            String fullPath = getFatJarFullPath(e, lib);
```

## RuleId[id=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/PortForwardService.java`
#### Snippet
```java
        final Pod[] nextForwardedPod = new Pod[1];

        final Thread forwarderThread = new Thread() {
            @Override
            public void run() {
```

### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/PortForwardService.java`
#### Snippet
```java
			}
        };
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
```

### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/RunService.java`
#### Snippet
```java
     */
    public void addShutdownHookForStoppingContainers(final boolean keepContainer, final boolean removeVolumes, final boolean removeCustomNetworks) {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
```

### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
    public static void printLogsAsync(LogWatch logWatcher, final String failureMessage, final CountDownLatch terminateLatch, final KitLogger log) {
        final InputStream in = logWatcher.getOutput();
        Thread thread = new Thread() {
            @Override
            public void run() {
```

### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/watcher/SpringBootWatcher.java`
#### Snippet
```java

    protected Thread startOutputProcessor(final KitLogger logger, final InputStream inputStream, final boolean error, final AtomicBoolean outputEnabled) {
        Thread printer = new Thread() {
            @Override
            public void run() {
```

## RuleId[id=IgnoreResultOfCall]
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

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/RevisionHistoryEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    private enum Config implements Configs.Config {
        LIMIT("limit", DEFAULT_NUMBER_OF_REVISIONS);

```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/TriggersAnnotationEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    private enum Config implements Configs.Config {

        /**
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultControllerEnricher.java`
#### Snippet
```java

  @AllArgsConstructor
  public enum Config implements Configs.Config {
    NAME("name", null),
    /**
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ImageEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    private enum Config implements Configs.Config {
        // What pull policy to use when fetching images
        PULL_POLICY("pullPolicy");
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ControllerViaPluginConfigurationEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    private enum Config implements Configs.Config {
        NAME("name", null),
        /**
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/IngressEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    public enum Config implements Configs.Config {
        HOST("host", null),
        TARGET_API_VERSION("targetApiVersion", "networking.k8s.io/v1");
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/NameEnricher.java`
#### Snippet
```java

  @AllArgsConstructor
  private enum Config implements Configs.Config {
    NAME("name");

```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ContainerEnvJavaOptionsMergeEnricher.java`
#### Snippet
```java

  @AllArgsConstructor
  private enum Config implements Configs.Config {
    // What pull policy to use when fetching images
    DISABLE("disable", "false");
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DebugEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    private enum Config implements Configs.Config {
        ENABLED("enabled", "false");

```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ServiceAccountEnricher.java`
#### Snippet
```java
public class ServiceAccountEnricher extends BaseEnricher {
    @AllArgsConstructor
    public enum Config implements Configs.Config {
        SKIP_CREATE("skipCreate", "false");

```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DependencyEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    private enum Config implements Configs.Config {

        INCLUDE_TRANSITIVE("includeTransitive", "true"),
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultNamespaceEnricher.java`
#### Snippet
```java
    private final ResourceConfig config;
    @AllArgsConstructor
    private enum Config implements Configs.Config {
        NAMESPACE(DefaultNamespaceEnricher.NAMESPACE, null),
        FORCE("force", "false"),
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/VolumePermissionEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    enum Config implements Configs.Config {
        IMAGE_NAME("imageName", "busybox"),
        PERMISSION("permission", "777"),
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/openshift/ImageChangeTriggerEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    private enum Config implements Configs.Config {
        CONTAINERS("containers", "");

```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ProjectLabelEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    private enum Config implements Configs.Config {
        USE_PROJECT_LABEL("useProjectLabel", "false"),
        APP("app", null),
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/openshift/AutoTLSEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    private enum Config implements Configs.Config {

        TLS_SECRET_NAME("tlsSecretName", null),
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    private enum Config implements Configs.Config {
        // Default name to use instead of a calculated one
        NAME("name", null),
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/openshift/RouteEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    private enum Config implements Configs.Config {
        GENERATE_ROUTE("generateRoute", "true"),
        TLS_TERMINATION("tlsTermination", null),
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/jkube-kit-micronaut/src/main/java/org/eclipse/jkube/micronaut/enricher/MicronautHealthCheckEnricher.java`
#### Snippet
```java

  @AllArgsConstructor
  private enum Config implements Configs.Config {
    READINESS_PROBE_INITIAL_DELAY_SECONDS("readinessProbeInitialDelaySeconds", null),
    READINESS_PROBE_PERIOD_SECONDS("readinessProbePeriodSeconds", null),
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    private enum Config implements Configs.Config {

        TYPE("type"),
```

### ClassNameSameAsAncestorName
Class name `GZIPOutputStream` is the same as one of its superclass' names
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/archive/ArchiveCompression.java`
#### Snippet
```java
    }

    private static class GZIPOutputStream extends java.util.zip.GZIPOutputStream {
        private GZIPOutputStream(OutputStream out) throws IOException {
            super(out, 65536);
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/jkube-kit-thorntail-v2/src/main/java/org/eclipse/jkube/thorntail/v2/enricher/ThorntailV2HealthCheckEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    private enum Config implements Configs.Config {

        SCHEME("scheme", "HTTP"),
```

### ClassNameSameAsAncestorName
Class name `Comparator` is the same as one of its superclass' names
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/DockerConnectionDetector.java`
#### Snippet
```java
        int getPriority();

        class Comparator implements java.util.Comparator<DockerHostProvider> {
            @Override
            public int compare(DockerHostProvider o1, DockerHostProvider o2) {
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/jkube-kit-wildfly-jar/src/main/java/org/eclipse/jkube/wildfly/jar/enricher/WildflyJARHealthCheckEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    private enum Config implements Configs.Config {

        SCHEME("scheme", "HTTP"),
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/generator/java-exec/src/main/java/org/eclipse/jkube/generator/javaexec/JavaExecGenerator.java`
#### Snippet
```java

    @AllArgsConstructor
    public enum Config implements Configs.Config {
        // Webport to expose. Set to 0 if no port should be exposed
        WEB_PORT("webPort", null),
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/BaseGenerator.java`
#### Snippet
```java

    @AllArgsConstructor
    enum Config implements Configs.Config {
        // The image name
        NAME("name", null),
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/generator/webapp/src/main/java/org/eclipse/jkube/generator/webapp/WebAppGenerator.java`
#### Snippet
```java

  @AllArgsConstructor
  private enum Config implements Configs.Config {
    // App server to use (like 'tomcat', 'jetty', 'wildfly'
    SERVER("server", null),
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/WebAppHealthCheckEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    private enum Config implements Configs.Config {

        SCHEME("scheme", "HTTP"),
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/PrometheusEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    private enum Config implements Configs.Config {
        PROMETHEUS_PORT("prometheusPort", null),
        PROMETHEUS_PATH("prometheusPath", "/metrics");
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/ServiceDiscoveryEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    private enum Config implements Configs.Config {
        DESCRIPTION_PATH("descriptionPath", null),
        DISCOVERABLE("discoverable", null),
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/AbstractHealthCheckEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    private enum Config implements Configs.Config {
        ENRICH_ALL_CONTAINERS("enrichAllContainers", "false"),
        ENRICH_CONTAINERS("enrichContainers", null);
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/KarafHealthCheckEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    private enum Config implements Configs.Config {
        FAILURE_THRESHOLD("failureThreshold", "3"),
        SUCCESS_THRESHOLD("successThreshold", "1");
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/enricher/SpringBootHealthCheckEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    private enum Config implements Configs.Config {
        READINESS_PROBE_INITIAL_DELAY_SECONDS("readinessProbeInitialDelaySeconds", "10"),
        READINESS_PROBE_PERIOD_SECONDS("readinessProbePeriodSeconds", null),
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/jkube-kit-microprofile/src/main/java/org/eclipse/jkube/microprofile/enricher/AbstractMicroprofileHealthCheckEnricher.java`
#### Snippet
```java

  @AllArgsConstructor
  private enum Config implements Configs.Config {

    SCHEME("scheme", "HTTP"),
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/jkube-kit-quarkus/src/main/java/org/eclipse/jkube/quarkus/enricher/QuarkusHealthCheckEnricher.java`
#### Snippet
```java

    @AllArgsConstructor
    private enum Config implements Configs.Config {

        SCHEME("scheme", "HTTP"),
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/generator/karaf/src/main/java/org/eclipse/jkube/generator/karaf/KarafGenerator.java`
#### Snippet
```java

  @AllArgsConstructor
  private enum Config implements Configs.Config {
    BASE_DIR("baseDir", "/deployments"),
    JOLOKIA_PORT("jolokiaPort", "8778"),
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/jkube-kit-quarkus/src/main/java/org/eclipse/jkube/quarkus/generator/QuarkusGenerator.java`
#### Snippet
```java

  @AllArgsConstructor
  public enum Config implements Configs.Config {

    /**
```

### ClassNameSameAsAncestorName
Class name `Config` is the same as one of its superclass' names
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/generator/SpringBootGenerator.java`
#### Snippet
```java

    @AllArgsConstructor
    public enum Config implements Configs.Config {
        COLOR("color", "");

```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `jkube-kit/generator/webapp/src/main/java/org/eclipse/jkube/generator/webapp/WebAppGenerator.java`
#### Snippet
```java

  private AppServerHandler getAppServerHandler(GeneratorContext context) {
    String from = super.getFromAsConfigured();
    if (from != null) {
      // If a base image is provided use this exclusively and dont do a custom lookup
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

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/DockerFileUtil.java`
#### Snippet
```java
        try (BufferedReader reader = new BufferedReader(new FileReader(dockerFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String lineInterpolated = JKubeFileInterpolator.interpolate(line, properties, filter);
                String[] lineParts = lineInterpolated.split("\\s+");
```

### NestedAssignment
Result of assignment expression used
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/DockerFileBuilder.java`
#### Snippet
```java
        try (BufferedReader reader = new BufferedReader(new FileReader(dockerFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String lineInterpolated = interpolator.apply(line);
                String[] lineParts = lineInterpolated.split("\\s+");
```

### NestedAssignment
Result of assignment expression used
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/AsyncUtil.java`
#### Snippet
```java
    return predicate -> async(() -> {
      T ret;
      while(!predicate.test(ret = supplier.get())) {
        Thread.sleep(100L);
      }
```

### NestedAssignment
Result of assignment expression used
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/IoUtil.java`
#### Snippet
```java
                long readBytes = 0;
                int len;
                while (EOF != (len = is.read(buffer))) {
                    readBytes += len;
                    log.progressUpdate(target.getName(), "Downloading", getProgressBar(readBytes, length));
```

### NestedAssignment
Result of assignment expression used
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/AsciiDocParser.java`
#### Snippet
```java
    private void skipUntilColumns(final BufferedReader tableContent) throws IOException {
        String line;
        while ((line = tableContent.readLine()) != null) {
            if(line.trim().isEmpty()){
                break;
```

### NestedAssignment
Result of assignment expression used
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/AsciiDocParser.java`
#### Snippet
```java

        int separator;
        if ((separator = column.indexOf("|")) < 0) {
            throw new IllegalArgumentException(String.format("Expected the initial of a column with (|) but %s found.", column));
        }
```

### NestedAssignment
Result of assignment expression used
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/JKubeFileInterpolator.java`
#### Snippet
```java
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                ret.append(JKubeFileInterpolator.interpolate(line, properties, filter != null ? filter : DEFAULT_FILTER)).append(System.lineSeparator());
            }
```

### NestedAssignment
Result of assignment expression used
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/wait/HttpPingChecker.java`
#### Snippet
```java
            statusMax = Integer.parseInt(matcher.group(2));
        } else {
            statusMin = statusMax = Integer.parseInt(status);
        }
    }
```

### NestedAssignment
Result of assignment expression used
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/KeyStoreUtil.java`
#### Snippet
```java
             PEMParser parser = new PEMParser(reader)) {
            Object readObject;
            while ((readObject = parser.readObject()) != null) {
                if (readObject instanceof PEMKeyPair) {
                    PEMKeyPair keyPair = (PEMKeyPair) readObject;
```

### NestedAssignment
Result of assignment expression used
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/DockerAccessWithHcClient.java`
#### Snippet
```java
                try {
                    callback.open();
                    while ( (line = reader.readLine()) != null) {
                        callback.log(1, new Timestamp(), line);
                    }
```

### NestedAssignment
Result of assignment expression used
in `jkube-kit/generator/java-exec/src/main/java/org/eclipse/jkube/generator/javaexec/MainClassDetector.java`
#### Snippet
```java
            List<String> foundMainClasses = ClassUtil.findMainClasses(classesDir);
            if (foundMainClasses.isEmpty()) {
                return mainClass = null;
            } else if (foundMainClasses.size() == 1) {
                return mainClass = foundMainClasses.get(0);
```

### NestedAssignment
Result of assignment expression used
in `jkube-kit/generator/java-exec/src/main/java/org/eclipse/jkube/generator/javaexec/MainClassDetector.java`
#### Snippet
```java
                return mainClass = null;
            } else if (foundMainClasses.size() == 1) {
                return mainClass = foundMainClasses.get(0);
            } else {
                log.warn("Found more than one main class : %s. Ignoring ....",  foundMainClasses);
```

### NestedAssignment
Result of assignment expression used
in `jkube-kit/generator/java-exec/src/main/java/org/eclipse/jkube/generator/javaexec/MainClassDetector.java`
#### Snippet
```java
            } else {
                log.warn("Found more than one main class : %s. Ignoring ....",  foundMainClasses);
                return mainClass = null;
            }
        } catch (IOException e) {
```

### NestedAssignment
Result of assignment expression used
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/watcher/SpringBootWatcher.java`
#### Snippet
```java
                try {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (outputEnabled.get()) {
                            if (error) {
```

### NestedAssignment
Result of assignment expression used
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/generator/SpringBootGenerator.java`
#### Snippet
```java
            CRC32 crc = new CRC32();
            int size = 0;
            while ((bytesRead = is.read(buffer)) != -1) {
                crc.update(buffer, 0, bytesRead);
                size += bytesRead;
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`port = port + "/tcp"` could be simplified to 'port += "/tcp"'
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ContainerDetails.java`
#### Snippet
```java
    private void addPortMapping(String port, PortBinding binding, Map<String, PortBinding> portBindings) {
        if (port.indexOf('/') == -1) {
            port = port + "/tcp";
        }

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

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `socketPath` is accessed in both synchronized and unsynchronized contexts
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/win/NamedPipe.java`
#### Snippet
```java
    private volatile boolean  outputShutdown;

    private String socketPath;

    private RandomAccessFile randomAccessFile;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `channel` is accessed in both synchronized and unsynchronized contexts
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/win/NamedPipe.java`
#### Snippet
```java

    private RandomAccessFile randomAccessFile;
    private FileChannel channel;

    NamedPipe(KitLogger log) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `sps` is accessed in both synchronized and unsynchronized contexts
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/log/DefaultLogCallback.java`
#### Snippet
```java

    private final LogOutputSpec outputSpec;
    private SharedPrintStream sps;

    public DefaultLogCallback(LogOutputSpec outputSpec) {
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/PropertiesUtil.java`
#### Snippet
```java
    for (String property : keys) {
      if (properties.containsKey(property)) {
        String value = properties.get(property).toString();
        if (Utils.isNotNullOrEmpty(value)) {
          return value;
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/SpringBootUtil.java`
#### Snippet
```java
    public static String getSpringBootActiveProfile(JavaProject project) {
        if (project != null && project.getProperties() != null
              && project.getProperties().get("spring.profiles.active") != null) {
            return project.getProperties().get("spring.profiles.active").toString();
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/SpringBootUtil.java`
#### Snippet
```java
        if (project != null && project.getProperties() != null
              && project.getProperties().get("spring.profiles.active") != null) {
            return project.getProperties().get("spring.profiles.active").toString();
        }
        return null;
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putAll()` on properties object
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/YamlUtil.java`
#### Snippet
```java
        });
    if (source != null) {
      properties.putAll(getFlattenedMap(source));
    }
    return properties;
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `jkube-kit/jkube-kit-thorntail-v2/src/main/java/org/eclipse/jkube/thorntail/v2/enricher/ThorntailV2HealthCheckEnricher.java`
#### Snippet
```java
        properties.putAll(System.getProperties());
        if (properties.containsKey("thorntail.http.port")) {
            return Integer.parseInt((String) properties.get("thorntail.http.port"));
        }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/access/ClusterConfiguration.java`
#### Snippet
```java
          f.setAccessible(true);
          try {
            f.set(c, mergedProperties.get(PROPERTY_PREFIX.concat(f.getName())).toString());
          } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/ContainerCreateConfig.java`
#### Snippet
```java
                    value = value.substring(1);
                }
                envProps.put(entry.getKey(), StringSubstitutor.replace(value, mavenProps));
            }
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/StartContainerExecutor.java`
#### Snippet
```java

            String prefix = addDot(exposeContainerProps) + addDot(propKey);
            projectProperties.put(prefix + "id", containerId);
            String ip = container.getIPAddress();
            if (StringUtils.isNotEmpty(ip)) {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/StartContainerExecutor.java`
#### Snippet
```java
            String ip = container.getIPAddress();
            if (StringUtils.isNotEmpty(ip)) {
                projectProperties.put(prefix + "ip", ip);
            }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/StartContainerExecutor.java`
#### Snippet
```java
            if (nets != null) {
                for (Map.Entry<String, String> entry : nets.entrySet()) {
                    projectProperties.put(prefix + addDot("net") + addDot(entry.getKey()) + "ip", entry.getValue());
                }
            }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `jkube-kit/jkube-kit-quarkus/src/main/java/org/eclipse/jkube/quarkus/QuarkusUtils.java`
#### Snippet
```java
    return Optional.ofNullable(project)
        .map(JavaProject::getProperties)
        .map(properties -> properties.get("quarkus.profile"))
        .map(Object::toString);
  }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/GradleUtil.java`
#### Snippet
```java
      .filter(e -> Objects.nonNull(e.getValue()))
      .reduce(new Properties(), (acc, e) -> {
        acc.put(e.getKey(), e.getValue());
        return acc;
      }, (acc, e) -> acc);
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/DockerAccess.java`
#### Snippet
```java
     * @throws DockerAccessException docker access exception
     */
    void start() throws DockerAccessException;

    /**
```

## RuleId[id=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/kit/custom-foo-generator/foo-generator/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.quickstarts.kit'
version = '1.8.0-SNAPSHOT'

```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/kit/custom-foo-generator/app/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.quickstarts.kit'
version = '0.0.1-SNAPSHOT'

```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/kit/custom-foo-generator/app/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.quickstarts.kit'
version = '0.0.1-SNAPSHOT'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/vertx/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.quickstarts.gradle'
version = '1.6.0-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/vertx/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.quickstarts.gradle'
version = '1.6.0-SNAPSHOT'
sourceCompatibility = '11'
def vertxVersion = '4.2.2'
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/vertx/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.quickstarts.gradle'
version = '1.6.0-SNAPSHOT'
sourceCompatibility = '11'
def vertxVersion = '4.2.2'
def launcherClassName = 'io.vertx.core.Launcher'
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/micronaut/build.gradle`
#### Snippet
```java
}

version = "0.1"
group = "org.eclipse.jkube.quickstarts.gradle.micronaut"

```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/micronaut/build.gradle`
#### Snippet
```java

version = "0.1"
group = "org.eclipse.jkube.quickstarts.gradle.micronaut"

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/thorntail/build.gradle`
#### Snippet
```java
apply plugin: 'org.eclipse.jkube.openshift'

group = 'org.eclipse.jkube.quickstarts.gradle'
version = '1.8.0-SNAPSHOT'
sourceCompatibility = '8'
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/thorntail/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.quickstarts.gradle'
version = '1.8.0-SNAPSHOT'
sourceCompatibility = '8'

```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/thorntail/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.quickstarts.gradle'
version = '1.8.0-SNAPSHOT'
sourceCompatibility = '8'

thorntail {
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/spring-boot/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.quickstarts.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/spring-boot/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.quickstarts.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/spring-boot/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.quickstarts.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/openliberty/build.gradle`
#### Snippet
```java

group 'org.eclipse.jkube.quickstarts.gradle.openliberty'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/openliberty/build.gradle`
#### Snippet
```java
group 'org.eclipse.jkube.quickstarts.gradle.openliberty'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/spring-boot-crd/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.quickstart.gradle.springboot.crd'
version = '1.5.1'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/spring-boot-crd/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.quickstart.gradle.springboot.crd'
version = '1.5.1'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/spring-boot-crd/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.quickstart.gradle.springboot.crd'
version = '1.5.1'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/docker-file-simple/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.quickstart.maven.helloworld'
version = '1.5.1'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/docker-file-simple/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.quickstart.maven.helloworld'
version = '1.5.1'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/docker-file-simple/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.quickstart.maven.helloworld'
version = '1.5.1'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/spring-boot-watch/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.quickstarts.gradle.springbootwatch'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/spring-boot-watch/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.quickstarts.gradle.springbootwatch'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/spring-boot-watch/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.quickstarts.gradle.springbootwatch'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/spring-boot-helm/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.quickstart.gradle.spring.boot.helm'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/spring-boot-helm/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.quickstart.gradle.spring.boot.helm'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/spring-boot-helm/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.quickstart.gradle.spring.boot.helm'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/spring-boot-camel-complete/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.quickstarts.gradle'
version = '1.5.1'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/spring-boot-camel-complete/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.quickstarts.gradle'
version = '1.5.1'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/spring-boot-camel-complete/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.quickstarts.gradle'
version = '1.5.1'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/docker-file-provided-context-dir/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.gradle.sample.spring.boot'
version = '1.5.1'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/docker-file-provided-context-dir/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.gradle.sample.spring.boot'
version = '1.5.1'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/docker-file-provided-context-dir/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.gradle.sample.spring.boot'
version = '1.5.1'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/docker-file-provided-docker-file/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.gradle.sample.spring.boot'
version = '1.5.1'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/docker-file-provided-docker-file/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.gradle.sample.spring.boot'
version = '1.5.1'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/docker-file-provided-docker-file/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.gradle.sample.spring.boot'
version = '1.5.1'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/micronaut-customized-image/build.gradle`
#### Snippet
```java
}

version = "1.5.1"
group = "org.eclipse.jkube.quickstart.gradle.micronaut.custom"

```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/micronaut-customized-image/build.gradle`
#### Snippet
```java

version = "1.5.1"
group = "org.eclipse.jkube.quickstart.gradle.micronaut.custom"

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/docker-file-provided-context-and-file/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.gradle.sample.spring.boot'
version = '1.5.1'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/docker-file-provided-context-and-file/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.gradle.sample.spring.boot'
version = '1.5.1'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/docker-file-provided-context-and-file/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.gradle.sample.spring.boot'
version = '1.5.1'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/spring-boot-with-jib-assembly/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.quickstarts.gradle'
version = '1.5.1'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/spring-boot-with-jib-assembly/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.quickstarts.gradle'
version = '1.5.1'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/spring-boot-with-jib-assembly/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.quickstarts.gradle'
version = '1.5.1'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/groovy-dsl-config/build.gradle`
#### Snippet
```java

version = "1.5.1"
group = "org.eclipse.jkube.quickstart.gradle.camelcdi"

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/docker-file-provided-context-and-assembly/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.gradle.sample.spring.boot'
version = '1.5.1'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/docker-file-provided-context-and-assembly/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.gradle.sample.spring.boot'
version = '1.5.1'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/docker-file-provided-context-and-assembly/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.gradle.sample.spring.boot'
version = '1.5.1'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/route/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/route/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/route/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/openliberty-with-legacy-plugin-syntax/build.gradle`
#### Snippet
```java
group 'org.eclipse.jkube.quickstarts.gradle.openliberty'

sourceCompatibility = 11
targetCompatibility = 11
tasks.withType(JavaCompile) {
```

### GroovyUnusedAssignment
Assignment is not used
in `quickstarts/gradle/openliberty-with-legacy-plugin-syntax/build.gradle`
#### Snippet
```java

sourceCompatibility = 11
targetCompatibility = 11
tasks.withType(JavaCompile) {
    options.encoding = 'UTF-8'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/name/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/name/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/name/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/expose/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/expose/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/expose/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/simple/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/simple/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/simple/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/autotls/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/autotls/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/autotls/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/configmap/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/service/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/service/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/service/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/configmap/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/namespace/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/namespace/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/namespace/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/controller/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/controller/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/controller/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/vertx/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/vertx/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
def vertxVersion = '4.2.2'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/vertx/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
def vertxVersion = '4.2.2'
def launcherClassName = 'io.vertx.core.Launcher'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/secret-file/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/secret-file/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/secret-file/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/ingress/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/ingress/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/ingress/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/openliberty/build.gradle`
#### Snippet
```java
group 'org.eclipse.jkube.integration.tests.gradle.openliberty'

sourceCompatibility = '11'
tasks.withType(JavaCompile) {
    options.encoding = 'UTF-8'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/debug-mode/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/debug-mode/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/debug-mode/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/spring-boot/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/spring-boot/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/project-label/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/project-label/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/project-label/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/git-annotations/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/git-annotations/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/git-annotations/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/serviceaccount/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/smallrye-health/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/smallrye-health/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/serviceaccount/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/smallrye-health/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/serviceaccount/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/revisionhistory/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/revisionhistory/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/revisionhistory/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/dockerfile-simple/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/dockerfile-simple/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/dockerfile-simple/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/imagepullpolicy/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/imagepullpolicy/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/imagepullpolicy/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/initcontainers/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/initcontainers/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/initcontainers/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/metadata/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/metadata/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/metadata/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/multi-environments/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/multi-environments/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/multi-environments/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/imagechangetrigger/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/imagechangetrigger/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/imagechangetrigger/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/multiple-services/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/multiple-services/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/multiple-services/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/volume-permission/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/volume-permission/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/volume-permission/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/dependency-resources/dependent/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/dependency-resources/dependent/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/java-options-env-merge/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/java-options-env-merge/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/java-options-env-merge/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/triggersannotation/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/triggersannotation/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/triggersannotation/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/dependency-resources/dependency/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/dependency-resources/dependency/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/spring-boot-with-fragment/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/spring-boot-with-fragment/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/groovy-dsl-image/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/groovy-dsl-image/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/groovy-dsl-image/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/serviceaccount-via-groovy-dsl/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/serviceaccount-via-groovy-dsl/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/serviceaccount-via-groovy-dsl/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/extension-configuration/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/extension-configuration/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/extension-configuration/build.gradle`
#### Snippet
```java
group = 'org.eclipse.jkube.integration.tests.gradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/probes-groovy-dsl-config/build.gradle`
#### Snippet
```java
}

group = 'org.eclipse.jkube.it.gradle.probes.groovy.dsl'
version = '0.0.1-SNAPSHOT'

```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-plugin/it/src/it/probes-groovy-dsl-config/build.gradle`
#### Snippet
```java

group = 'org.eclipse.jkube.it.gradle.probes.groovy.dsl'
version = '0.0.1-SNAPSHOT'

repositories {
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/auth/RegistryAuthConfig.java`
#### Snippet
```java
    private final Map<String, String> defaultConfig;

    private boolean skipExtendedAuthentication = false;

    private final String propertyPrefix;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/assembly/AssemblyManager.java`
#### Snippet
```java
public class AssemblyManager {

    private static AssemblyManager dockerAssemblyManager = null;
    public static final String DEFAULT_DATA_BASE_IMAGE = "busybox:latest";
    public static final String SCRATCH_IMAGE = "scratch";
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jkube-kit/common-maven/src/main/java/org/eclipse/jkube/kit/common/util/AnsiLogger.java`
#### Snippet
```java
  private final KitLogger fallbackLogger;

  private boolean isVerbose = false;
  private List<LogVerboseCategory> verboseModes = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jkube-kit/common-maven/src/main/java/org/eclipse/jkube/kit/common/util/AnsiLogger.java`
#### Snippet
```java

  private boolean isVerbose = false;
  private List<LogVerboseCategory> verboseModes = null;

  // Map remembering lines
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `kubernetes-maven-plugin/plugin/src/main/java/org/eclipse/jkube/maven/plugin/mojo/build/AbstractDockerMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "jkube.useProjectClasspath", defaultValue = "false")
    protected boolean useProjectClasspath = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `kubernetes-maven-plugin/plugin/src/main/java/org/eclipse/jkube/maven/plugin/mojo/build/AbstractDockerMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "jkube.build.forcePull", defaultValue = "false")
    protected boolean forcePull = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `kubernetes-maven-plugin/plugin/src/main/java/org/eclipse/jkube/maven/plugin/mojo/build/ResourceMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "jkube.useProjectClasspath", defaultValue = "false")
    private boolean useProjectClasspath = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/DockerFileBuilder.java`
#### Snippet
```java

    // whether the Dockerfile should be optimised. i.e. compressing run statements into a single statement
    private boolean shouldOptimise = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/DockerFileBuilder.java`
#### Snippet
```java
    private Arguments cmd;

    private Boolean exportTargetDir = null;

    // User under which the files should be added
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/DockerFileBuilder.java`
#### Snippet
```java

    // Workdir
    private String workdir = null;

    // Basedir to be export
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/ContainerTracker.java`
#### Snippet
```java
        // Command to call before stopping container and whether to stop the build
        private String preStop;
        private boolean breakOnError = false;

        ContainerShutdownDescriptor(ImageConfiguration imageConfig, String containerId) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/DockerMachine.java`
#### Snippet
```java
    private final KitLogger log;
    private final DockerMachineConfiguration machine;
    private boolean initialized = false;
    private Map<String, String> envMap;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/log/LogOutputSpec.java`
#### Snippet
```java
            YELLOW,CYAN,MAGENTA,GREEN,RED,BLUE
    };
    private static int globalColorIdx = 0;

    @Builder(toBuilder = true)
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jkube-kit/generator/java-exec/src/main/java/org/eclipse/jkube/generator/javaexec/MainClassDetector.java`
#### Snippet
```java
class MainClassDetector {

    private String mainClass = null;
    private final File classesDir;
    private final KitLogger log;
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Contextualizable`
in `kubernetes-maven-plugin/plugin/src/main/java/org/eclipse/jkube/maven/plugin/mojo/build/BuildMojo.java`
#### Snippet
```java
 */
@Mojo(name = "build", defaultPhase = LifecyclePhase.PRE_INTEGRATION_TEST, requiresDependencyResolution = ResolutionScope.COMPILE)
public class BuildMojo extends AbstractDockerMojo implements Contextualizable {

    @Override
```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/assembly/AssemblyConfigurationUtils.java`
#### Snippet
```java
    }
    if (StringUtils.isBlank(ac.getTargetDir())) {
      builder.targetDir(LINUX_FILE_SEPARATOR.concat(name));
    }
    return builder.build();
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/access/ClusterConfiguration.java`
#### Snippet
```java
    Field[] fields = ClusterConfiguration.class.getDeclaredFields();
    Stream.of(fields)
        .filter(f -> mergedProperties.containsKey(PROPERTY_PREFIX.concat(f.getName())))
        .forEach(f -> {
          f.setAccessible(true);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/access/ClusterConfiguration.java`
#### Snippet
```java
          f.setAccessible(true);
          try {
            f.set(c, mergedProperties.get(PROPERTY_PREFIX.concat(f.getName())).toString());
          } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/WatchService.java`
#### Snippet
```java
                runService.addShutdownHookForStoppingContainers(context.isKeepContainer(), context.isRemoveVolumes(), context.isAutoCreateCustomNetworks());
            }
            wait();
        } catch (InterruptedException e) {
            log.warn("Interrupted");
```

## RuleId[id=RedundantStringFormatCall]
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

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `jkube-kit/resource/helm/src/main/java/org/eclipse/jkube/kit/resource/helm/HelmServiceUtil.java`
#### Snippet
```java
      sourceFiles = new File[] { templateDir };
    } else {
      sourceFiles = new File[0];
    }
    for (File sourceFile : Objects
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jkube-kit/resource/helm/src/main/java/org/eclipse/jkube/kit/resource/helm/HelmService.java`
#### Snippet
```java

  public static List<File> listYamls(File directory) {
    return Stream.of(Optional.ofNullable(directory.listFiles()).orElse(new File[0]))
        .filter(File::isFile)
        .filter(HelmService::isYaml)
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/AbstractImageBuildService.java`
#### Snippet
```java
  @Override
  public final void push(Collection<ImageConfiguration> imageConfigs, int retries, RegistryConfig registryConfig, boolean skipTag) throws JKubeServiceException {
    processImage(imageConfiguration -> pushSingleImage(imageConfiguration, retries, registryConfig, skipTag), "Skipped push", imageConfigs.toArray(new ImageConfiguration[0]));
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/openshift/OpenshiftBuildService.java`
#### Snippet
```java
            ImageStreamTag imageStreamTag = client.imageStreamTags().inNamespace(applicableOpenShiftNamespace).withName(resolveImageStreamTagName(imageName)).get();
            List<ImageStreamTag> imageStreamTags = createAdditionalTagsIfPresent(imageConfig, applicableOpenShiftNamespace, imageStreamTag);
            client.resourceList(imageStreamTags.toArray(new ImageStreamTag[0])).inNamespace(applicableOpenShiftNamespace).createOrReplace();
            log.info("Tags [%s] set to %s", String.join(",", additionalTagsToCreate), imageName.getNameWithoutTag());
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DependencyEnricher.java`
#### Snippet
```java
        final List<HasMetadata> openshiftItems = new ArrayList<>();
        processArtifactSetResources(this.openshiftDependencyArtifacts, items -> {
            openshiftItems.addAll(Arrays.asList(items.toArray(new HasMetadata[0])));
            return null;
        });
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DependencyEnricher.java`
#### Snippet
```java
        final List<HasMetadata> kubernetesItems = new ArrayList<>();
        processArtifactSetResources(this.kubernetesDependencyArtifacts, items -> {
            kubernetesItems.addAll(Arrays.asList(items.toArray(new HasMetadata[0])));
            return null;
        });
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DependencyEnricher.java`
#### Snippet
```java
        });
        processArtifactSetResources(this.kubernetesTemplateDependencyArtifacts, items -> {
            List<HasMetadata> templates = Arrays.asList(items.toArray(new HasMetadata[0]));

            // lets remove all the plain resources (without any ${PARAM} expressions) which match objects
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java
    private Service[] toArray(List<Service> services) {
        if (services == null) {
            return new Service[0];
        }
        if (services instanceof ArrayList) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java
        }
        if (services instanceof ArrayList) {
            return services.toArray(new Service[0]);
        } else {
            Service[] ret = new Service[services.size()];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `kubernetes-maven-plugin/plugin/src/main/java/org/eclipse/jkube/maven/plugin/mojo/develop/UndeployMojo.java`
#### Snippet
```java
    final List<File> environmentResourceDirs = ResourceUtil.getFinalResourceDirs(resourceDir, environment);
    jkubeServiceHub.getUndeployService()
        .undeploy(environmentResourceDirs, resources, getManifestsToUndeploy().toArray(new File[0]));
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `kubernetes-maven-plugin/plugin/src/main/java/org/eclipse/jkube/maven/plugin/mojo/build/AbstractDockerMojo.java`
#### Snippet
```java
                    getBuildTimestamp(getPluginContext(), CONTEXT_KEY_BUILD_TIMESTAMP, project.getBuild().getDirectory(), DOCKER_BUILD_TIMESTAMP));

            jkubeServiceHub.getBuildService().build(imageConfigs.toArray(new ImageConfiguration[0]));

        } catch (Exception ex) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `kubernetes-maven-plugin/plugin/src/main/java/org/eclipse/jkube/maven/plugin/mojo/build/ResourceMojo.java`
#### Snippet
```java
    private File[] mavenFilterFiles(File[] resourceFiles, File outDir) throws IOException {
        if (resourceFiles == null) {
            return new File[0];
        }
        if (!outDir.exists() && !outDir.mkdirs()) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jkube-kit/profile/src/main/java/org/eclipse/jkube/kit/profile/ProfileUtil.java`
#### Snippet
```java

    public static Profile findProfile(String profileArg, List<File> resourceDirs) throws IOException {
        return findProfile(profileArg, resourceDirs == null ? new File[0] : resourceDirs.toArray(new File[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jkube-kit/profile/src/main/java/org/eclipse/jkube/kit/profile/ProfileUtil.java`
#### Snippet
```java

    public static Profile findProfile(String profileArg, List<File> resourceDirs) throws IOException {
        return findProfile(profileArg, resourceDirs == null ? new File[0] : resourceDirs.toArray(new File[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/ClassUtil.java`
#### Snippet
```java
        // return an empty CL .. don't want to have to deal with NULL later
        // if somehow we incorrectly call this method
        return new URLClassLoader(new URL[]{});
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/archive/AssemblyFileSetUtils.java`
#### Snippet
```java
      if (source.isDirectory()) {
        FileUtils.forceMkdir(target);
        for (File sourceChild : Optional.ofNullable(source.listFiles()).orElse(new File[0])) {
          copy(sourceDirectory, sourceChild, new File(target, sourceChild.getName()), assemblyFileSet);
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/validator/ResourceValidator.java`
#### Snippet
```java
        @Override
        public Object[] getExecutableParameters() {
            return new Object[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/resource/MappingConfig.java`
#### Snippet
```java
    public String[] getFilenamesAsArray() {
        if (this.filenameTypes == null) {
            return new String[0];
        }
        return filenameTypes.split(",\\s*");
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/DockerMachine.java`
#### Snippet
```java
            }
            args.add(machine.getName());
            return args.toArray(new String[0]);
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
            }
        }
        return new File[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
    public static File[] listResourceFragments(File resourceDir) {
        if (resourceDir == null) {
            return new File[0];
        }
        return resourceDir.listFiles((File dir, String name) -> FILENAME_PATTERN.matcher(name).matches() && !PROFILES_PATTERN.matcher(name).matches());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
            }
        }
        return resourceFiles.toArray(new File[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/StartOrderResolver.java`
#### Snippet
```java
               .append(config.getAlias())
               .append(" depends on ")
               .append(String.join(",", config.getDependencies().toArray(new String[0])))
               .append("\n");
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jkube-kit/generator/webapp/src/main/java/org/eclipse/jkube/generator/webapp/handler/AbstractAppServerHandler.java`
#### Snippet
```java
            }
        } else {
            return new String[0];
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/task/KubernetesBuildTask.java`
#### Snippet
```java
          getBuildTimestamp(null, null, kubernetesExtension.javaProject.getBuildDirectory().getAbsolutePath(),
              DOCKER_BUILD_TIMESTAMP));
      jKubeServiceHub.getBuildService().build(resolvedImages.toArray(new ImageConfiguration[0]));
    } catch (JKubeServiceException | IOException e) {
      kitLogger.error(e.getMessage());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/task/KubernetesUndeployTask.java`
#### Snippet
```java
      final List<File> environmentResourceDirs = resolveResourceSourceDirectory();
      jKubeServiceHub.getUndeployService()
        .undeploy(environmentResourceDirs, resources, findManifestsToUndeploy().toArray(new File[0]));
    } catch (IOException e) {
      throw new IllegalStateException(e.getMessage(), e);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/task/KubernetesResourceTask.java`
#### Snippet
```java
  private File[] gradleFilterFiles(File[] resourceFiles) throws IOException {
    if (resourceFiles == null) {
      return new File[0];
    }
    final File outDir = kubernetesExtension.getWorkDirectoryOrDefault();
```

## RuleId[id=UnusedAssignment]
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

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Configs` has only 'static' members, and lacks a 'private' constructor
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/Configs.java`
#### Snippet
```java
 * Helper functions for working with typesafe configs
 */
public class Configs {

    // Interfaces to use for dealing with configuration values and default values
```

### UtilityClassWithoutPrivateConstructor
Class `QuarkusAssemblies` has only 'static' members, and lacks a 'private' constructor
in `jkube-kit/jkube-kit-quarkus/src/main/java/org/eclipse/jkube/quarkus/generator/QuarkusAssemblies.java`
#### Snippet
```java
import static org.eclipse.jkube.quarkus.QuarkusUtils.runnerSuffix;

public class QuarkusAssemblies {

  public static final QuarkusAssembly NATIVE = quarkusGenerator -> {
```

## RuleId[id=UnnecessarySemicolon]
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
in `jkube-kit/watcher/standard/src/main/java/org/eclipse/jkube/watcher/standard/PodExecutor.java`
#### Snippet
```java
    try (
        KubernetesClient client = clusterAccess.createDefaultClient();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    ) {
      String namespace = clusterAccess.getNamespace();
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

## RuleId[id=DataFlowIssue]
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
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultControllerEnricher.java`
#### Snippet
```java
     */
    @Deprecated
    PULL_POLICY("pullPolicy", JKUBE_DEFAULT_IMAGE_PULL_POLICY),
    TYPE("type", null),
    REPLICA_COUNT("replicaCount", "1");
```

### DeprecatedIsStillUsed
Deprecated member 'PULL_POLICY' is still used
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ControllerViaPluginConfigurationEnricher.java`
#### Snippet
```java
         */
        @Deprecated
        PULL_POLICY("pullPolicy", JKUBE_DEFAULT_IMAGE_PULL_POLICY),
        REPLICA_COUNT("replicaCount", "1");

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

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `Map`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DockerRegistrySecretEnricher.java`
#### Snippet
```java
    protected Map<String, String> generateData(String dockerId) {
        final Configuration config = getContext().getConfiguration();
        final Optional<Map<String,Object>> secretConfig = config.getSecretConfiguration(dockerId);
        if (!secretConfig.isPresent()) {
            return null;
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java
    }

    private Optional<Map<String, Object>> getFromPluginConfiguration() {
        for(String pluginId : JKUBE_PLUGINS) {
            Optional<Map<String, Object>> configuration = getContext().getConfiguration().getPluginConfiguration("maven", pluginId);
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java
    private Optional<Map<String, Object>> getFromPluginConfiguration() {
        for(String pluginId : JKUBE_PLUGINS) {
            Optional<Map<String, Object>> configuration = getContext().getConfiguration().getPluginConfiguration("maven", pluginId);
            if(configuration.isPresent()) {
                return configuration;
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java
    }

    private Optional<Map<String, String>> getMapValue(Config config, boolean readiness) {
        Optional<Object> element = getElement(readiness ? READINESS : LIVENESS, config.getKey());
        if (!element.isPresent()) {
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java
    }

    private Optional<List<String>> getListValue(Config config, boolean readiness) {
        Optional<Object> element = getElement(readiness ? READINESS : LIVENESS, config.getKey());
        if (!element.isPresent()) {
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/model/Configuration.java`
#### Snippet
```java
     * @return configuration map specific to this id
     */
    public Optional<Map<String, Object>> getPluginConfiguration(String system, String id) {
        return pluginConfigLookup.apply(system, id);
    }
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/model/Configuration.java`
#### Snippet
```java
     * Lookup secret configuration.
     */
    private Function<String, Optional<Map<String,Object>>> secretConfigLookup;

    /**
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/model/Configuration.java`
#### Snippet
```java
     * @return configuration map specific to this id
     */
    public Optional<Map<String, Object>> getSecretConfiguration(String id) {
        return secretConfigLookup.apply(id);
    }
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/model/Configuration.java`
#### Snippet
```java
    public Configuration(
        @Singular List<ImageConfiguration> images, ResourceConfig resource,
        BiFunction<String, String, Optional<Map<String, Object>>> pluginConfigLookup,
        Function<String, Optional<Map<String, Object>>> secretConfigLookup, ProcessorConfig processorConfig,
        JKubeBuildStrategy jKubeBuildStrategy) {
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/model/Configuration.java`
#### Snippet
```java
        @Singular List<ImageConfiguration> images, ResourceConfig resource,
        BiFunction<String, String, Optional<Map<String, Object>>> pluginConfigLookup,
        Function<String, Optional<Map<String, Object>>> secretConfigLookup, ProcessorConfig processorConfig,
        JKubeBuildStrategy jKubeBuildStrategy) {

```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/model/Configuration.java`
#### Snippet
```java
     * Lookup plugin project configuration.
     */
    private BiFunction<String, String, Optional<Map<String,Object>>> pluginConfigLookup;

    /**
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/GroovyUtil.java`
#### Snippet
```java
   * @return an Optional with a List if the closure was parsed or empty if the closure was invoked successfully
   */
  public static <T> Optional<List<T>> invokeOrParseClosureList(Closure<?> closure, Class<T> targetClass) {
    try {
      closure.call();
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/KarafHealthCheckEnricher.java`
#### Snippet
```java

        // TODO, If Gradle features are added, this won't work
        final Optional<Map<String, Object>> configurationValues = getContext().getConfiguration().getPluginConfiguration("maven", "karaf-maven-plugin");

        if (!configurationValues.isPresent()) {
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/AbstractJKubePlugin.java`
#### Snippet
```java
              .filter(Objects::nonNull)
              // Cannot remove warning (object spread)
              .forEach(t -> task.mustRunAfter(t));
          precedence.getOrDefault(task.getName(), Collections.emptyList())
              .forEach(taskDepClass -> task.mustRunAfter(evaluatedProject.getTasks().withType(taskDepClass)));
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
                watch.close();
            } catch (Exception e) {}
            try {
                forwarderThread.interrupt();
```

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
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/DockerRegistryAuthHandler.java`
#### Snippet
```java
                return extractAuthConfigFromAuths(registryToLookup, dockerConfig.getAsJsonObject("auths"));
            }
        } catch (IOException exception) {

        }
```

## RuleId[id=ProtectedMemberInFinalClass]
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
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/TriggersAnnotationEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
    }

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
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ImageEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
    }

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
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/NameEnricher.java`
#### Snippet
```java

    @Getter
    protected String key;
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
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java

        @Getter
        protected String key;
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
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/generator/SpringBootGenerator.java`
#### Snippet
```java
        protected String key;
        @Getter
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

## RuleId[id=UnnecessaryToStringCall]
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
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/DockerFileBuilder.java`
#### Snippet
```java

    private String createTempDir() {
         return "/tmp/" + UUID.randomUUID().toString();
    }

```

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
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/KarafHealthCheckEnricher.java`
#### Snippet
```java
        if (!(startupFeatures instanceof Map)) {
            throw new IllegalArgumentException(String.format("For element %s was expected a complex object but a simple object was found of type %s and value %s",
                "startupFeatures", startupFeatures.getClass(), startupFeatures.toString()));
        }

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
Inner class `EnvDockerHostProvider` may be 'static'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/DockerConnectionDetector.java`
#### Snippet
```java

    // Lookup from the enviroment
    class EnvDockerHostProvider implements DockerHostProvider {
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

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/chunked/BuildJsonResponseHandler.java`
#### Snippet
```java
            }
            throw new DockerAccessException("%s %s", json.get("error"),
                    (msg.equals(detailMsg) || "".equals(detailMsg) ? "" : "(" + detailMsg + ")"));
        } else if (json.has("stream")) {
            String message = json.get("stream").getAsString();
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ContainerDetails.java`
#### Snippet
```java
    private void addPortMapping(String port, JsonObject hostConfig, Map<String, PortBinding> portBindings) {
        String hostIp = hostConfig.get(HOST_IP).getAsString();
        Integer hostPort = Integer.valueOf(hostConfig.get(HOST_PORT).getAsInt());

        addPortMapping(port, new PortBinding(hostPort, hostIp), portBindings);
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/compose/DockerComposeServiceWrapper.java`
#### Snippet
```java
        if (restart.contains(":")) {
            String[] parts = restart.split(":", 2);
            builder.name(parts[0]).retry(Integer.valueOf(parts[1]));
        }
        else {
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

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jkube-kit/common-maven/src/main/java/org/eclipse/jkube/kit/common/util/AnsiLogger.java`
#### Snippet
```java

  private void flush() {
    System.out.flush();
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jkube-kit/common-maven/src/main/java/org/eclipse/jkube/kit/common/util/AnsiLogger.java`
#### Snippet
```java

  private void print(String txt) {
    System.out.print(txt);
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jkube-kit/common-maven/src/main/java/org/eclipse/jkube/kit/common/util/AnsiLogger.java`
#### Snippet
```java

  private void println(String txt) {
    System.out.println(txt);
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/KitLogger.java`
#### Snippet
```java
        @Override
        public void error(String format, Object... params) {
            System.out.println(String.format(format,params));
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/KitLogger.java`
#### Snippet
```java
        @Override
        public void warn(String format, Object... params) {
            System.out.println(String.format(format,params));
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/KitLogger.java`
#### Snippet
```java
        @Override
        public void info(String format, Object... params) {
            System.out.println(String.format(format,params));
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/KitLogger.java`
#### Snippet
```java
        @Override
        public void debug(String format, Object... params) {
            System.out.println(String.format(format,params));
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jkube-kit/build/service/jib/src/main/java/org/eclipse/jkube/kit/service/jib/JibServiceUtil.java`
#### Snippet
```java

    private static void logUpdateFinished() {
        System.out.println(JIB_LOG_PREFIX + generateProgressBar(1.0F));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jkube-kit/build/service/jib/src/main/java/org/eclipse/jkube/kit/service/jib/JibServiceUtil.java`
#### Snippet
```java
                final String progressBar = progressDisplay.get(1);
                final String task = progressDisplay.get(2);
                System.out.println(ansi().cursorUpLine(1).eraseLine().a(JIB_LOG_PREFIX).a(progressBar).a(" ").a(task));
            }
        };
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jkube-kit/build/service/jib/src/main/java/org/eclipse/jkube/kit/service/jib/JibServiceUtil.java`
#### Snippet
```java
        return le -> {
            if (le.getLevel() != LogEvent.Level.DEBUG || logger.isVerboseEnabled() || logger.isDebugEnabled()) {
                System.out.println(ansi().cursorUpLine(1).eraseLine().a(JIB_LOG_PREFIX)
                        .a(StringUtils.rightPad(le.getMessage(), 120)).a("\n"));
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/log/SharedPrintStream.java`
#### Snippet
```java
    boolean close() {
        int nrUsers = numUsers.decrementAndGet();
        if (nrUsers == 0 && printStream != System.out) {
            printStream.close();
            return true;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/log/DefaultLogCallback.java`
#### Snippet
```java
            String file = outputSpec.getFile();
            if (outputSpec.isLogStdout() || file == null) {
                this.sps = new SharedPrintStream(System.out);
            } else {
                SharedPrintStream cachedPs = printStreamMap.get(file);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/AnsiLoggerFacade.java`
#### Snippet
```java

    private void print(String txt) {
        System.out.print(txt);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/AnsiLoggerFacade.java`
#### Snippet
```java

    private void println(String txt) {
        System.out.println(txt);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/AnsiLoggerFacade.java`
#### Snippet
```java

    private void flush() {
        System.out.flush();
    }

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

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'goal.length() \> 0' covered by subsequent condition 'goal.indexOf(...) \> -1'
in `jkube-kit/common-maven/src/main/java/org/eclipse/jkube/kit/common/util/MojoExecutionService.java`
#### Snippet
```java
        try {
            String executionId = null;
            if (goal != null && goal.length() > 0 && goal.indexOf('#') > -1) {
                int pos = goal.indexOf('#');
                executionId = goal.substring(pos + 1);
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/resource/helm/src/main/java/org/eclipse/jkube/kit/resource/helm/HelmRepositoryConnectionUtils.java`
#### Snippet
```java
    String url = formatRepositoryURL(file, repository);
    if (url.endsWith(".tar.gz")) {
      url = url.replaceAll("tar.gz$", "tgz");
    }
    final HttpURLConnection connection = createConnection(repository, url);
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/resource/helm/src/main/java/org/eclipse/jkube/kit/resource/helm/HelmService.java`
#### Snippet
```java

  public static boolean isYaml(File file) {
    return file.getName().toLowerCase().matches(".*?\\.ya?ml$");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/resource/helm/src/main/java/org/eclipse/jkube/kit/resource/helm/HelmService.java`
#### Snippet
```java
  private static String expression(HelmParameter parameter) {
    final String value = Optional.ofNullable(parameter.getParameter().getValue()).map(StringUtils::trimToEmpty).orElse("");
    if (value.matches(GOLANG_EXPRESSION_REGEX)) {
      return value;
    }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/resource/helm/src/main/java/org/eclipse/jkube/kit/resource/helm/HelmService.java`
#### Snippet
```java
        .filter(hp -> hp.getParameter().getValue() != null)
        // Placeholders replaced by Go expressions don't need to be persisted in the values.yaml file
        .filter(hp -> !hp.getParameter().getValue().trim().matches(GOLANG_EXPRESSION_REGEX))
        .collect(Collectors.toMap(HelmParameter::getHelmName, hp -> hp.getParameter().getValue()));

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/DockerFileUtil.java`
#### Snippet
```java
            while ((line = reader.readLine()) != null) {
                String lineInterpolated = JKubeFileInterpolator.interpolate(line, properties, filter);
                String[] lineParts = lineInterpolated.split("\\s+");
                if (lineParts.length > 0 && lineParts[0].equalsIgnoreCase(keyword)) {
                    ret.add(lineParts);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/DockerFileUtil.java`
#### Snippet
```java
    private static void updateMapWithArgValue(Map<String, String> result, Map<String, String> args, String argString) {
        if (argString.contains("=") || argString.contains(":")) {
            String[] argStringParts = argString.split("[=:]");
            String argStringKey = argStringParts[0];
            String argStringValue = determineFinalArgValue(argString, argStringParts, args);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/DockerFileUtil.java`
#### Snippet
```java
            if (argStringValue.startsWith("\"") || argStringValue.startsWith("'")) {
                // Replaces surrounding quotes
                argStringValue = argStringValue.replaceAll("(^[\"'])|([\"']$)", "");
            } else {
                validateArgValue(argStringValue);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/DockerFileUtil.java`
#### Snippet
```java

    private static void validateArgValue(String argStringParam) {
        String[] argStringParts = argStringParam.split("\\s+");
        if (argStringParts.length > 1) {
            throw new IllegalArgumentException("Dockerfile parse error: ARG requires exactly one argument. Provided : " + argStringParam);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/openshift/ImageStreamService.java`
#### Snippet
```java

    protected static String resolveImageStreamName(ImageName name) {
        return name.getSimpleName().replace("/", "-");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/common-it/src/main/java/org/eclipse/jkube/kit/common/ResourceVerify.java`
#### Snippet
```java

  public static String jsonCompatibleYaml(String txt) {
    return txt.replace("{{", "{").replace("}}", "}");
  }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/common-it/src/main/java/org/eclipse/jkube/kit/common/ResourceVerify.java`
#### Snippet
```java

  public static String jsonCompatibleYaml(String txt) {
    return txt.replace("{{", "{").replace("}}", "}");
  }
}
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/ImageName.java`
#### Snippet
```java

    private void parseComponentsBeforeTag(String rest) {
        String[] parts = rest.split("\\s*/\\s*");
        if (parts.length == 1) {
            registry = null;
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/HealthCheckConfiguration.java`
#### Snippet
```java
            return null;
        }
        return timeout.matches("^\\d+$") ? timeout + "s" : timeout;
    }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/DockerFileBuilder.java`
#### Snippet
```java
            while ((line = reader.readLine()) != null) {
                String lineInterpolated = interpolator.apply(line);
                String[] lineParts = lineInterpolated.split("\\s+");
                if (lineParts.length > 0 && lineParts[0].equalsIgnoreCase(keyword)) {
                    ret.add(lineParts);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/AnsiUtil.java`
#### Snippet
```java
    // are followed or preceded by their counterpart. This lets the split retain
    // the character in the center.
    String[] parts = message.split("(\\[\\[(?=.]])|(?<=\\[\\[.)]])");
    if (parts.length == 1) {
      return message;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/IoUtil.java`
#### Snippet
```java
    public static String sanitizeFileName(String name) {
        if (name != null) {
            return name.replaceAll("[^A-Za-z0-9]+", "-");
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/ClassUtil.java`
#### Snippet
```java

    private static String convertToClass(String name, String prefix) {
        String ret = name.replaceAll("[/\\\\]", ".");
        ret = ret.substring(0, name.length() - ".class".length());
        return ret.substring(prefix.length());
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/AsciiDocParser.java`
#### Snippet
```java

        return column.trim().substring(separator + 1)
                .replaceAll("[`_*]", "")
                .trim();

```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/validator/ResourceValidator.java`
#### Snippet
```java
    private static JsonObject fixUrlIfUnversioned(JsonObject jsonSchema, String versionedUri) {
        final String uri = jsonSchema.get("$schema").getAsString();
        if (uri.matches("^https?://json-schema.org/draft-05/schema[^/]*$")) {
            final JsonObject ret = jsonSchema.deepCopy();
            ret.addProperty("$schema", versionedUri);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/validator/ResourceValidator.java`
#### Snippet
```java
        @Override
        public String toString() {
            return "[message=" + getMessage().replaceFirst("[$]", "") +", violation type="+errorMsg.getType()+"]";
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/validator/ResourceValidator.java`
#### Snippet
```java

    private void getResourceProperties(String kind, JsonObject jsonSchema) {
        String kindKey = kind.replaceAll("\"", "").toLowerCase();
        if (jsonSchema.get("resources") != null && jsonSchema.get("resources").getAsJsonObject().get(kindKey) != null) {
            jsonSchema.add("properties" , jsonSchema.get("resources").getAsJsonObject()
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/config/resource/src/main/java/org/eclipse/jkube/kit/config/resource/MappingConfig.java`
#### Snippet
```java
            return new String[0];
        }
        return filenameTypes.split(",\\s*");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/service/MigrateService.java`
#### Snippet
```java
        .filter(e -> e.getTextContent().startsWith(PREFIX_FMP) || e.getTextContent().startsWith(PREFIX_F8))
        .forEach(e -> e.setTextContent(e.getTextContent()
            .replaceFirst(PREFIX_FMP, PREFIX_JKUBE)
            .replaceFirst(PREFIX_F8, PREFIX_JKUBE)
        ));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/service/MigrateService.java`
#### Snippet
```java
        .forEach(e -> e.setTextContent(e.getTextContent()
            .replaceFirst(PREFIX_FMP, PREFIX_JKUBE)
            .replaceFirst(PREFIX_F8, PREFIX_JKUBE)
        ));
    } catch (XPathExpressionException e) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/service/MigrateService.java`
#### Snippet
```java
          .filter(e -> e.getTagName().startsWith(PREFIX_F8) || e.getTagName().startsWith(PREFIX_FMP))
          .forEach(e -> e.getOwnerDocument().renameNode(e, null, e.getNodeName()
              .replaceFirst(PREFIX_FMP, PREFIX_JKUBE)
              .replaceFirst(PREFIX_F8, PREFIX_JKUBE)));
    } catch (XPathExpressionException e) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/service/MigrateService.java`
#### Snippet
```java
          .forEach(e -> e.getOwnerDocument().renameNode(e, null, e.getNodeName()
              .replaceFirst(PREFIX_FMP, PREFIX_JKUBE)
              .replaceFirst(PREFIX_F8, PREFIX_JKUBE)));
    } catch (XPathExpressionException e) {
      logger.error("Could not replace configuration for plugin (%s)", e.getMessage());
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/service/MigrateService.java`
#### Snippet
```java
        .filter(e -> e.getTagName().startsWith(FABRIC8 + "."))
        .forEach(e -> document.renameNode(e, null, e.getNodeName()
            .replace(FABRIC8, JKUBE)
            .replace(PREFIX_FMP, PREFIX_JKUBE)
            .replace(PREFIX_F8, PREFIX_JKUBE)));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/service/MigrateService.java`
#### Snippet
```java
        .forEach(e -> document.renameNode(e, null, e.getNodeName()
            .replace(FABRIC8, JKUBE)
            .replace(PREFIX_FMP, PREFIX_JKUBE)
            .replace(PREFIX_F8, PREFIX_JKUBE)));
  }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/service/MigrateService.java`
#### Snippet
```java
            .replace(FABRIC8, JKUBE)
            .replace(PREFIX_FMP, PREFIX_JKUBE)
            .replace(PREFIX_F8, PREFIX_JKUBE)));
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/EnvUtil.java`
#### Snippet
```java
        String[] res = new String[split.length];
        for (int i = 0; i < split.length; i++) {
            res[i] = split[i].replaceAll("\\\\ ", " ");
        }
        return res;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/EnvUtil.java`
#### Snippet
```java
    public static String convertTcpToHttpUrl(String connect) {
        String protocol = connect.contains(":" + DOCKER_HTTP_PORT) ? "http:" : "https:";
        return connect.replaceFirst("^tcp:", protocol);
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/EnvUtil.java`
#### Snippet
```java
        if (StringUtils.isNotBlank(version) && version.contains(".")) {
            try {
                version = version.replace(".", "");
                Integer.parseInt(version);
                return true;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/EnvUtil.java`
#### Snippet
```java
        if (matcher.matches()) {
            String result = "/" + matcher.group(1).toLowerCase() + matcher.group(2);
            return result.replace("\\", "/");
        }
        return path;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/ecr/AwsSigner4Request.java`
#### Snippet
```java
            } else {
                // minimize white space
                value = value.trim().replaceAll("\\s+", " ");
            }
            // merge all values with same header name
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/BuildService.java`
#### Snippet
```java
            String key = (String) keyObj;
            if (key.startsWith(ARG_PREFIX)) {
                String argKey = key.replaceFirst(ARG_PREFIX, "");
                String value = properties.getProperty(key);

```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/ContainerCreateConfig.java`
#### Snippet
```java
                if (value == null) {
                    value = "";
                } else if(value.matches("^\\+\\$\\{.*}$")) {
                    /*
                     * This case is to handle the Maven interpolation issue which used
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/chunked/PullOrPushResponseJsonHandler.java`
#### Snippet
```java
        String value;
        if (json.has("stream")) {
            value = json.get("stream").getAsString().replaceFirst("\n$", "");
        } else if (json.has("status")) {
            value = json.get("status").getAsString();
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/chunked/BuildJsonResponseHandler.java`
#### Snippet
```java
            String status = json.get("status").getAsString().trim();
            String id = json.has("id") ? json.get("id").getAsString() : null;
            if (status.matches("^.*(Download|Pulling).*")) {
                log.info("  %s%s",id != null ? id + " " : "",status);
            }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/AnsiLoggerFacade.java`
#### Snippet
```java
    private String evaluateEmphasis(String message, Ansi.Color msgColor) {
        // Split with delimiters [[.]]. See also http://stackoverflow.com/a/2206545/207604
        String prepared = message.replaceAll("\\[\\[(.)]]", "[[]]$1[[]]");
        String[] parts = prepared.split("\\[\\[]]");
        if (parts.length == 1) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/AnsiLoggerFacade.java`
#### Snippet
```java
        // Split with delimiters [[.]]. See also http://stackoverflow.com/a/2206545/207604
        String prepared = message.replaceAll("\\[\\[(.)]]", "[[]]$1[[]]");
        String[] parts = prepared.split("\\[\\[]]");
        if (parts.length == 1) {
            return message;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/ContainerNamingUtil.java`
#### Snippet
```java

    private static String cleanImageName(final String imageName) {
        return new ImageName(imageName).getSimpleName().replaceAll("[^a-zA-Z0-9_.-]+", "_");
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/ContainerNamingUtil.java`
#### Snippet
```java
        Container last = null;
        for (long i = 1; i < Long.MAX_VALUE; i++) {
            final String withIndexApplied = partiallyApplied.replaceAll(INDEX_PLACEHOLDER, String.valueOf(i));
            Container mapped = containerMap.get(withIndexApplied);
            if (mapped != null) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/ContainerNamingUtil.java`
#### Snippet
```java
        if (partiallyApplied.contains(INDEX_PLACEHOLDER)) {
            for (long i = 1; i < Long.MAX_VALUE; i++) {
                final String withIndexApplied = partiallyApplied.replaceAll(INDEX_PLACEHOLDER, String.valueOf(i));
                if (!existingContainersNames.contains(withIndexApplied)) {
                    return withIndexApplied;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/ConfigHelper.java`
#### Snippet
```java
            return true;
        }
        Set<String> imagesAllowed = new HashSet<>(Arrays.asList(imageList.split("\\s*,\\s*")));
        return imagesAllowed.contains(imageConfig.getName()) || imagesAllowed.contains(imageConfig.getAlias());
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/handler/ProbeHandler.java`
#### Snippet
```java
            if(getUrl==null)
                return new TCPSocketAction(getUrl, portObj);
            String validurl = getUrl.replaceFirst("(([a-zA-Z])+)://","http://");
            try{
                URL url = new URL(validurl);
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/generator/java-exec/src/main/java/org/eclipse/jkube/generator/javaexec/JavaExecGenerator.java`
#### Snippet
```java

    protected static boolean isPortValid(String port) {
      return StringUtils.isNotBlank(port) && port.matches("\\d+") && Integer.parseInt(port) > 0;
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/KubernetesResourceUtil.java`
#### Snippet
```java

    private static String sanitizeName(String name) {
        return name.replaceAll("[^a-zA-Z0-9-]", "").replaceFirst("^-*(.*?)-*$","$1");
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/KubernetesResourceUtil.java`
#### Snippet
```java

    private static String sanitizeName(String name) {
        return name.replaceAll("[^a-zA-Z0-9-]", "").replaceFirst("^-*(.*?)-*$","$1");
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/KubernetesResourceUtil.java`
#### Snippet
```java
        String alias = imageConfig.getAlias();
        String containerName =  alias != null ? alias : extractImageUser(imageConfig.getName(), groupArtifactVersion.getGroupId()) + "-" + groupArtifactVersion.getArtifactId();
        if (!containerName.matches(CONTAINER_NAME_REGEX)) {
            return sanitizeName(containerName);
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/AbstractPortsExtractor.java`
#### Snippet
```java
		if (StringUtils.isNotBlank(port)) {
			String t = port.trim();
			if (t.matches(NUMBER_REGEX)) {
				map.put(key, Integer.parseInt(t));
			}
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/generator/webapp/src/main/java/org/eclipse/jkube/generator/webapp/WebAppGenerator.java`
#### Snippet
```java
    final String command = getConfig(Config.CMD);
    final String user = getConfig(Config.USER);
    final List<String> ports = Arrays.asList(getConfig(Config.PORTS).split("\\s*,\\s*"));
    final boolean supportsS2iBuild = Configs.asBoolean(getConfig(Config.SUPPORTS_S2I_BUILD));
    return new CustomAppServerHandler(from, deploymentDir, command, user, ports, supportsS2iBuild);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/generator/webapp/src/main/java/org/eclipse/jkube/generator/webapp/WebAppGenerator.java`
#### Snippet
```java
      targetFilename = String.format("ROOT.%s", extension);
    } else {
      targetFilename = String.format("%s.%s", path.replaceAll("[\\\\/]", ""), extension);
    }
    final AssemblyConfiguration.AssemblyConfigurationBuilder builder = AssemblyConfiguration.builder();
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/task/KubernetesConfigViewTask.java`
#### Snippet
```java
      for (Method method : KubernetesExtension.class.getMethods()) {
        if (method.getParameters().length == 0 && Property.class.isAssignableFrom(method.getReturnType())) {
          effectiveConfig.put(CaseUtils.toCamelCase(method.getName().replaceFirst("^get", ""), false),
              ((Property) method.invoke(kubernetesExtension)).getOrElse(null));
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/enricher/SpringBootHealthCheckEnricher.java`
#### Snippet
```java
    private String normalizeMultipleSlashes(String s) {
        //substitute multiple consecutive "/" with a single occurrence (i.e. ////a//b///c////////d -> /a/b/c/d)
        return s.replaceAll("/{2,}","/");
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/GradleUtil.java`
#### Snippet
```java

  private static boolean isJavaArtifact(File artifact) {
    return artifact.getName().toLowerCase(Locale.ROOT).matches(".+?\\.(jar|war|ear)");
  }
}
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `io.fabric8.kubernetes.api.model.apps` is unnecessary, and can be replaced with an import
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/RevisionHistoryEnricher.java`
#### Snippet
```java
        log.info("Adding revision history limit to %s", maxRevisionHistories);

        builder.accept(new TypedVisitor<io.fabric8.kubernetes.api.model.apps.DeploymentBuilder>() {
            @Override
            public void visit(io.fabric8.kubernetes.api.model.apps.DeploymentBuilder item) {
```

### UnnecessaryFullyQualifiedName
Qualifier `io.fabric8.kubernetes.api.model.extensions` is unnecessary, and can be replaced with an import
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/RevisionHistoryEnricher.java`
#### Snippet
```java
            }
        });
        builder.accept(new TypedVisitor<io.fabric8.kubernetes.api.model.extensions.DeploymentBuilder>() {
            @Override
            public void visit(io.fabric8.kubernetes.api.model.extensions.DeploymentBuilder item) {
```

### UnnecessaryFullyQualifiedName
Qualifier `io.fabric8.kubernetes.api.model.extensions` is unnecessary, and can be replaced with an import
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/RevisionHistoryEnricher.java`
#### Snippet
```java
        builder.accept(new TypedVisitor<io.fabric8.kubernetes.api.model.extensions.DeploymentBuilder>() {
            @Override
            public void visit(io.fabric8.kubernetes.api.model.extensions.DeploymentBuilder item) {
                item.editOrNewSpec()
                    .withRevisionHistoryLimit(maxRevisionHistories)
```

### UnnecessaryFullyQualifiedName
Qualifier `io.fabric8.kubernetes.api.model.apps` is unnecessary, and can be replaced with an import
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/RevisionHistoryEnricher.java`
#### Snippet
```java
        builder.accept(new TypedVisitor<io.fabric8.kubernetes.api.model.apps.DeploymentBuilder>() {
            @Override
            public void visit(io.fabric8.kubernetes.api.model.apps.DeploymentBuilder item) {
                item.editOrNewSpec()
                    .withRevisionHistoryLimit(maxRevisionHistories)
```

### UnnecessaryFullyQualifiedName
Qualifier `io.fabric8.kubernetes.api.model.extensions` is unnecessary, and can be replaced with an import
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/IngressEnricher.java`
#### Snippet
```java

            @Override
            public void visit(io.fabric8.kubernetes.api.model.extensions.IngressBuilder builder) {
                ObjectMeta metadata = builder.buildMetadata();
                if (metadata != null && Objects.equals(serviceName, metadata.getName())) {
```

### UnnecessaryFullyQualifiedName
Qualifier `io.fabric8.kubernetes.api.model.networking.v1` is unnecessary, and can be replaced with an import
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/IngressEnricher.java`
#### Snippet
```java
    private HasMetadata generateIngressWithConfiguredApiVersion(ServiceBuilder serviceBuilder) {
        ResourceConfig resourceConfig = getConfiguration().getResource();
        io.fabric8.kubernetes.api.model.networking.v1.Ingress ingress = NetworkingV1IngressGenerator.generate(
          serviceBuilder, getRouteDomain(), getConfig(Config.HOST), getIngressRuleXMLConfig(resourceConfig), getIngressTlsXMLConfig(resourceConfig));
        HasMetadata generatedIngress = ingress;
```

### UnnecessaryFullyQualifiedName
Qualifier `io.fabric8.kubernetes.api.model.networking.v1` is unnecessary, and can be replaced with an import
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/IngressEnricher.java`
#### Snippet
```java
        listBuilder.accept(new TypedVisitor<io.fabric8.kubernetes.api.model.networking.v1.IngressBuilder>() {
            @Override
            public void visit(io.fabric8.kubernetes.api.model.networking.v1.IngressBuilder builder) {
                ObjectMeta metadata = builder.buildMetadata();
                if (metadata != null && Objects.equals(serviceName, metadata.getName())) {
```

### UnnecessaryFullyQualifiedName
Qualifier `io.fabric8.kubernetes.api.model.networking.v1` is unnecessary, and can be replaced with an import
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/IngressEnricher.java`
#### Snippet
```java
            }
        });
        listBuilder.accept(new TypedVisitor<io.fabric8.kubernetes.api.model.networking.v1.IngressBuilder>() {
            @Override
            public void visit(io.fabric8.kubernetes.api.model.networking.v1.IngressBuilder builder) {
```

### UnnecessaryFullyQualifiedName
Qualifier `io.fabric8.kubernetes.api.model.extensions` is unnecessary, and can be replaced with an import
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/IngressEnricher.java`
#### Snippet
```java
        final String serviceName = service.editOrNewMetadata().getName();
        final AtomicBoolean answer = new AtomicBoolean(false);
        listBuilder.accept(new TypedVisitor<io.fabric8.kubernetes.api.model.extensions.IngressBuilder>() {

            @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `io.fabric8.kubernetes.api.model` is unnecessary, and can be replaced with an import
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ConfigMapEnricher.java`
#### Snippet
```java
    }

    private io.fabric8.kubernetes.api.model.ConfigMap createConfigMapFromConfiguration(org.eclipse.jkube.kit.config.resource.ConfigMap configMap, String configMapName) throws IOException {
        io.fabric8.kubernetes.api.model.ConfigMapBuilder configMapBuilder = new io.fabric8.kubernetes.api.model.ConfigMapBuilder();
        configMapBuilder.withNewMetadata().withName(configMapName).endMetadata();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.jkube.kit.config.resource` is unnecessary, and can be replaced with an import
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ConfigMapEnricher.java`
#### Snippet
```java
    }

    private io.fabric8.kubernetes.api.model.ConfigMap createConfigMapFromConfiguration(org.eclipse.jkube.kit.config.resource.ConfigMap configMap, String configMapName) throws IOException {
        io.fabric8.kubernetes.api.model.ConfigMapBuilder configMapBuilder = new io.fabric8.kubernetes.api.model.ConfigMapBuilder();
        configMapBuilder.withNewMetadata().withName(configMapName).endMetadata();
```

### UnnecessaryFullyQualifiedName
Qualifier `io.fabric8.kubernetes.api.model` is unnecessary and can be removed
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ConfigMapEnricher.java`
#### Snippet
```java

    private io.fabric8.kubernetes.api.model.ConfigMap createConfigMapFromConfiguration(org.eclipse.jkube.kit.config.resource.ConfigMap configMap, String configMapName) throws IOException {
        io.fabric8.kubernetes.api.model.ConfigMapBuilder configMapBuilder = new io.fabric8.kubernetes.api.model.ConfigMapBuilder();
        configMapBuilder.withNewMetadata().withName(configMapName).endMetadata();

```

### UnnecessaryFullyQualifiedName
Qualifier `io.fabric8.kubernetes.api.model` is unnecessary and can be removed
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ConfigMapEnricher.java`
#### Snippet
```java

    private io.fabric8.kubernetes.api.model.ConfigMap createConfigMapFromConfiguration(org.eclipse.jkube.kit.config.resource.ConfigMap configMap, String configMapName) throws IOException {
        io.fabric8.kubernetes.api.model.ConfigMapBuilder configMapBuilder = new io.fabric8.kubernetes.api.model.ConfigMapBuilder();
        configMapBuilder.withNewMetadata().withName(configMapName).endMetadata();

```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.jkube.kit.config.resource` is unnecessary, and can be replaced with an import
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ConfigMapEnricher.java`
#### Snippet
```java
    }

    private org.eclipse.jkube.kit.config.resource.ConfigMap getConfigMapFromXmlConfiguration() {
        ResourceConfig resourceConfig = getConfiguration().getResource();
        if (resourceConfig != null && resourceConfig.getConfigMap() != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.jkube.kit.config.resource` is unnecessary, and can be replaced with an import
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ConfigMapEnricher.java`
#### Snippet
```java

    private void addConfigMapFromResourceConfigurations(KubernetesListBuilder builder) {
        org.eclipse.jkube.kit.config.resource.ConfigMap configMapResourceConfiguration = getConfigMapFromXmlConfiguration();
        try {
            if (configMapResourceConfiguration == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `io.fabric8.kubernetes.api.model` is unnecessary, and can be replaced with an import
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ConfigMapEnricher.java`
#### Snippet
```java
            }

            io.fabric8.kubernetes.api.model.ConfigMap configMap = createConfigMapFromConfiguration(configMapResourceConfiguration, configMapName);

            if ((configMap.getData() != null && !configMap.getData().isEmpty())
```

### UnnecessaryFullyQualifiedName
Qualifier `org.sonatype.plexus.components.sec.dispatcher` is unnecessary and can be removed
in `kubernetes-maven-plugin/plugin/src/main/java/org/eclipse/jkube/maven/plugin/mojo/build/AbstractJKubeMojo.java`
#### Snippet
```java
    protected ClusterConfiguration access;

    @Component(role = org.sonatype.plexus.components.sec.dispatcher.SecDispatcher.class, hint = "default")
    protected SecDispatcher securityDispatcher;

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/UserConfigurationCompare.java`
#### Snippet
```java
                }
            }
            return java.util.Objects.equals(entity1, entity2);
        }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/UserConfigurationCompare.java`
#### Snippet
```java
        }
        // TODO should we ignore annotations?
        return java.util.Objects.equals(entity1.getName(), entity2.getName()) &&
                java.util.Objects.equals(entity1.getNamespace(), entity2.getNamespace()) &&
                configEqualMap(entity1.getLabels(), entity2.getLabels()) &&
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/UserConfigurationCompare.java`
#### Snippet
```java
        // TODO should we ignore annotations?
        return java.util.Objects.equals(entity1.getName(), entity2.getName()) &&
                java.util.Objects.equals(entity1.getNamespace(), entity2.getNamespace()) &&
                configEqualMap(entity1.getLabels(), entity2.getLabels()) &&
                configEqualMap(entity1.getAnnotations(), entity2.getAnnotations());
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary, and can be replaced with an import
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/win/NpipeSocketAddress.java`
#### Snippet
```java
import java.io.File;

class NpipeSocketAddress extends java.net.SocketAddress {

  private static final long serialVersionUID = -201738636850828643L;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.jkube.generator.webapp` is unnecessary and can be removed
in `jkube-kit/generator/webapp/src/main/java/org/eclipse/jkube/generator/webapp/AppServerDetector.java`
#### Snippet
```java
class AppServerDetector {

    private final List<? extends org.eclipse.jkube.generator.webapp.AppServerHandler> serverHandlers;
    private final AppServerHandler defaultHandler;
    private final HashMap<String, AppServerHandler> serverHandlerMap;
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `SecretEnricher()` of an abstract class should not be declared 'public'
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/SecretEnricher.java`
#### Snippet
```java
public abstract class SecretEnricher extends BaseEnricher {

    public SecretEnricher(JKubeEnricherContext buildContext, String name) {
        super(buildContext, name);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractNativeClientBuilder()` of an abstract class should not be declared 'public'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/util/AbstractNativeClientBuilder.java`
#### Snippet
```java
    private final int maxConnections;

    public AbstractNativeClientBuilder(String path, int maxConnections, KitLogger logger) {
        this.maxConnections = maxConnections;
        this.log = logger;
```

### NonProtectedConstructorInAbstractClass
Constructor `EnvCommand()` of an abstract class should not be declared 'public'
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/EnvCommand.java`
#### Snippet
```java
    private final String prefix;

    public EnvCommand(KitLogger log, String prefix) {
        super(log);
        this.prefix = prefix;
```

### NonProtectedConstructorInAbstractClass
Constructor `FromSelector()` of an abstract class should not be declared 'public'
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/FromSelector.java`
#### Snippet
```java
    private final GeneratorContext context;

    public FromSelector(GeneratorContext context) {
        this.context = context;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractPortsExtractor()` of an abstract class should not be declared 'public'
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/AbstractPortsExtractor.java`
#### Snippet
```java
	protected final PrefixedLogger log;

	public AbstractPortsExtractor(PrefixedLogger log) {
		this.log = log;
	}
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseGenerator()` of an abstract class should not be declared 'public'
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/BaseGenerator.java`
#### Snippet
```java
    }

    public BaseGenerator(GeneratorContext context, String name, FromSelector fromSelector) {
        this.context = context;
        this.name = name;
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseGenerator()` of an abstract class should not be declared 'public'
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/BaseGenerator.java`
#### Snippet
```java
    }

    public BaseGenerator(GeneratorContext context, String name) {
        this(context, name, null);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractHealthCheckEnricher()` of an abstract class should not be declared 'public'
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/AbstractHealthCheckEnricher.java`
#### Snippet
```java
    }

    public AbstractHealthCheckEnricher(EnricherContext buildContext, String name) {
        super(buildContext, name);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseWatcher()` of an abstract class should not be declared 'public'
in `jkube-kit/watcher/api/src/main/java/org/eclipse/jkube/watcher/api/BaseWatcher.java`
#### Snippet
```java
    protected final PrefixedLogger log;

    public BaseWatcher(WatcherContext context, String name) {
        this.context = context;
        this.config = new WatcherConfig(context.getBuildContext().getProject().getProperties(), name, context.getConfig());
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/RunService.java`
#### Snippet
```java
        long waited;
        try {
            waited = WaitUtil.wait(killGracePeriodInSeconds, new Callable<Void>() {
                @Override
                public Void call() throws Exception {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `answer`
in `jkube-kit/resource/helm/src/main/java/org/eclipse/jkube/kit/resource/helm/HelmServiceUtil.java`
#### Snippet
```java
        for (HasMetadata item : items) {
          Map<String, String> annotations = KubernetesHelper.getOrCreateAnnotations(item);
          answer = getJKubeIconUrlFromAnnotations(annotations);
          if (StringUtils.isNotBlank(answer)) {
            break;
```

### AssignmentToMethodParameter
Assignment to method parameter `helmConfig`
in `jkube-kit/resource/helm/src/main/java/org/eclipse/jkube/kit/resource/helm/HelmServiceUtil.java`
#### Snippet
```java
  public static HelmConfig initHelmPushConfig(HelmConfig helmConfig, JavaProject project) {
    if (helmConfig == null) {
      helmConfig = new HelmConfig();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `original`
in `jkube-kit/resource/helm/src/main/java/org/eclipse/jkube/kit/resource/helm/HelmServiceUtil.java`
#### Snippet
```java

    if (original == null) {
      original = new HelmConfig();
    }
    original.setChart(resolveFromPropertyOrDefault(PROPERTY_CHART, project, original::getChart, project.getArtifactId()));
```

### AssignmentToMethodParameter
Assignment to method parameter `port`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ContainerDetails.java`
#### Snippet
```java
    private void addPortMapping(String port, PortBinding binding, Map<String, PortBinding> portBindings) {
        if (port.indexOf('/') == -1) {
            port = port + "/tcp";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `defaultImageName`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/DockerFileUtil.java`
#### Snippet
```java
        if (defaultImageName == null) {
            // Default name group/artifact:version (or 'latest' if SNAPSHOT)
            defaultImageName = "%g/%a:%l";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `resourceConfig`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/kubernetes/KubernetesClientUtil.java`
#### Snippet
```java
            .orElse(null);
        if (resourceConfig == null) {
            resourceConfig = ResourceConfig.builder().namespace(resolvedNamespace).build();
        } else if (resolvedNamespace != null) {
            resourceConfig = ResourceConfig.toBuilder(resourceConfig).namespace(resolvedNamespace).build();
```

### AssignmentToMethodParameter
Assignment to method parameter `resourceConfig`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/kubernetes/KubernetesClientUtil.java`
#### Snippet
```java
            resourceConfig = ResourceConfig.builder().namespace(resolvedNamespace).build();
        } else if (resolvedNamespace != null) {
            resourceConfig = ResourceConfig.toBuilder(resourceConfig).namespace(resolvedNamespace).build();
        }
        return resourceConfig;
```

### AssignmentToMethodParameter
Assignment to method parameter `build`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/openshift/OpenshiftBuildService.java`
#### Snippet
```java
                logTerminateLatch.countDown();

                build = buildHolder.get();
                if (build == null) {
                    log.debug("Build watcher on %s was closed prematurely", buildName);
```

### AssignmentToMethodParameter
Assignment to method parameter `build`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/openshift/OpenshiftBuildService.java`
#### Snippet
```java
                if (build == null) {
                    log.debug("Build watcher on %s was closed prematurely", buildName);
                    build = client.builds().inNamespace(applicableOpenShiftNamespace).withName(buildName).get();
                }
                String status = KubernetesHelper.getBuildStatusPhase(build);
```

### AssignmentToMethodParameter
Assignment to method parameter `entity`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
                    log.info("Updating " + kind + " " + name + " from " + sourceName);
                    copyAllImageStreamTags(entity, old);
                    entity = patchService.compareAndPatchEntity(currentNamespace, entity, old);
                    openShiftClient.resource(entity).inNamespace(currentNamespace).createOrReplace();
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `project`
in `jkube-kit/common-maven/src/main/java/org/eclipse/jkube/kit/common/util/MavenUtil.java`
#### Snippet
```java
                }
            }
            project = project.getParent();
        }
        return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `project`
in `jkube-kit/common-maven/src/main/java/org/eclipse/jkube/kit/common/util/MavenUtil.java`
#### Snippet
```java
                answer = basedir;
            }
            project = project.getParent();
        }
        return answer;
```

### AssignmentToMethodParameter
Assignment to method parameter `fullName`
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/ImageName.java`
#### Snippet
```java
            String[] digestParts = fullName.split("@");
            digest = digestParts[1];
            fullName = digestParts[0];
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `volume`
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/DockerFileBuilder.java`
#### Snippet
```java
    private void addVolume(StringBuilder buffer, String volume) {
        while (volume.endsWith("/")) {
            volume = volume.substring(0, volume.length() - 1);
        }
        // don't export '/'
```

### AssignmentToMethodParameter
Assignment to method parameter `currentDir`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/GitUtil.java`
#### Snippet
```java
        if (currentDir == null) {
            // TODO: Why is this check needed ?
            currentDir = new File(System.getProperty("basedir", "."));
        }
        File gitFolder = findGitFolder(currentDir);
```

### AssignmentToMethodParameter
Assignment to method parameter `key`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/MapUtil.java`
#### Snippet
```java
        if (StringUtils.isNotBlank(keyPrefix)) {
            if (key.startsWith("[")) {
                key = keyPrefix + key;
            }
            else {
```

### AssignmentToMethodParameter
Assignment to method parameter `key`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/MapUtil.java`
#### Snippet
```java
            }
            else {
                key = keyPrefix + "." + key;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `property`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/JKubeFileInterpolator.java`
#### Snippet
```java
        for (Map.Entry<String, String> entry : expressionMarkers.entrySet()) {
            if (property.contains(entry.getKey())) {
                property = property.substring(entry.getKey().length(), property.length() - entry.getValue().length());
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `line`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/JKubeFileInterpolator.java`
#### Snippet
```java
            String value = checkPropertyWithDelimiters(line, property, getPropertyAsMap(properties), delimiters);
            if (!StringUtils.isEmpty(value)) {
                line = value;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `line`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/JKubeFileInterpolator.java`
#### Snippet
```java
            String value = checkPropertyWithDelimiters(line, property, getPropertyAsMap(properties), delimiters);
            if (!StringUtils.isEmpty(value)) {
                line = value;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `line`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/JKubeFileInterpolator.java`
#### Snippet
```java
            String value = checkPropertyWithDelimiters(line, e.getKey(), environmentVariables, delimiters);
            if (!StringUtils.isEmpty(value)) {
                line = value;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `version`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/EnvUtil.java`
#### Snippet
```java
        if (StringUtils.isNotBlank(version) && version.contains(".")) {
            try {
                version = version.replace(".", "");
                Integer.parseInt(version);
                return true;
```

### AssignmentToMethodParameter
Assignment to method parameter `authority`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/ecr/AwsSigner4Request.java`
#### Snippet
```java
            scheme = uri.substring(0, schemeEnd);
            if (uri.charAt(pathStart + 1) == '/') {
                authority = uri.substring(pathStart);
                pathStart = uri.indexOf('/', pathStart + 2);
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `authConfig`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/DockerAccessWithHcClient.java`
#### Snippet
```java
    private Map<String, String> createAuthHeader(AuthConfig authConfig) {
        if (authConfig == null) {
            authConfig = AuthConfig.EMPTY_AUTH_CONFIG;
        }
        return Collections.singletonMap("X-Registry-Auth", authConfig.toHeaderValue(log));
```

### AssignmentToMethodParameter
Assignment to method parameter `baseUrl`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/DockerAccessWithHcClient.java`
#### Snippet
```java
        if (uri.getScheme().equalsIgnoreCase("unix")) {
            this.delegate = createHttpClient(new UnixSocketClientBuilder(uri.getPath(), maxConnections, log));
            baseUrl = UNIX_URL;
        } else if (uri.getScheme().equalsIgnoreCase("npipe")) {
            this.delegate = createHttpClient(new NamedPipeClientBuilder(uri.getPath(), maxConnections, log), false);
```

### AssignmentToMethodParameter
Assignment to method parameter `baseUrl`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/DockerAccessWithHcClient.java`
#### Snippet
```java
        } else if (uri.getScheme().equalsIgnoreCase("npipe")) {
            this.delegate = createHttpClient(new NamedPipeClientBuilder(uri.getPath(), maxConnections, log), false);
            baseUrl = NPIPE_URL;
        } else {
            this.delegate = createHttpClient(new HttpClientBuilder(isSSL(baseUrl) ? certPath : null, maxConnections));
```

### AssignmentToMethodParameter
Assignment to method parameter `baseUrl`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/DockerAccessWithHcClient.java`
#### Snippet
```java
        // Strip trailing slashes if any
        while(baseUrl.endsWith("/")) {
            baseUrl = baseUrl.substring(0, baseUrl.length() - 1);
        }
        this.urlBuilder = new UrlBuilder(baseUrl, "v" + fetchApiVersionFromServer(baseUrl, this.delegate));
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/PropertyMode.java`
#### Snippet
```java
        }

        name = name.toLowerCase();
        for (PropertyMode e : PropertyMode.values()) {
            if (e.name().toLowerCase().equals(name)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/ImageNameFormatter.java`
#### Snippet
```java
        }

        name = interpolate(name, project.getProperties(), DEFAULT_FILTER);
        return formatParamReplacer.replace(name);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `input`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/FormatParameterReplacer.java`
#### Snippet
```java
            ret.append(matcher.group(1));
            ret.append(formatElement(matcher.group(2),matcher.group(3)));
            input = matcher.group(4);
        }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `apiVersion`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/ConfigHelper.java`
#### Snippet
```java
        // Init and validate configs. After this step, getResolvedImages() contains the valid configuration.
        for (ImageConfiguration imageConfiguration : images) {
            apiVersion = EnvUtil.extractLargerVersion(apiVersion, initAndValidate(nameFormatter, imageConfiguration));
        }
        return apiVersion;
```

### AssignmentToMethodParameter
Assignment to method parameter `configurationProperties`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/handler/ContainerHandler.java`
#### Snippet
```java

        if (configurationProperties == null) {
            configurationProperties = new Properties();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `jkube-kit/resource/service/src/main/java/org/eclipse/jkube/kit/resource/service/TemplateUtil.java`
#### Snippet
```java
      final String to = parameter.getValue();
      if (StringUtils.isNotBlank(to)) {
        text = text.replace(from, to);
      }
    }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ExecDetails.java`
#### Snippet
```java
    public Integer getExitCode() {
        if (isRunning()) {
            return null;
        }
        return json.get(EXIT_CODE).getAsInt();
```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ExecDetails.java`
#### Snippet
```java
    public String[] getArguments() {
        if (!json.has(PROCESS_CONFIG)) {
            return null;
        }
        JsonObject processConfig = json.getAsJsonObject(PROCESS_CONFIG);
```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ExecDetails.java`
#### Snippet
```java
        JsonObject processConfig = json.getAsJsonObject(PROCESS_CONFIG);
        if (!processConfig.has(ARGUMENTS)) {
            return null;
        }
        JsonArray arguments = processConfig.getAsJsonArray(ARGUMENTS);
```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ExecDetails.java`
#### Snippet
```java
    public String getEntryPoint() {
        if (!json.has(PROCESS_CONFIG)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ExecDetails.java`
#### Snippet
```java
        JsonObject processConfig = json.getAsJsonObject(PROCESS_CONFIG);
        if (!processConfig.has(ENTRY_POINT)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/auth/handler/OpenShiftRegistryAuthHandler.java`
#### Snippet
```java
            boolean useOpenShift = Boolean.parseBoolean(useOpenAuthMode);
            if (!useOpenShift) {
                return null;
            }
            log.debug("AuthConfig: OpenShift credentials");
```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/auth/handler/OpenShiftRegistryAuthHandler.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/auth/handler/SystemPropertyRegistryAuthHandler.java`
#### Snippet
```java

        if (username == null) {
            return null;
        }
        if (password == null) {
```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/auth/handler/FromConfigRegistryAuthHandler.java`
#### Snippet
```java
            return AuthConfig.fromRegistryAuthConfig(registryAuthConfig, kind, decryptor);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ContainersListElement.java`
#### Snippet
```java
    public String getIPAddress() {
        // IP address is not provided by container list action.
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ContainersListElement.java`
#### Snippet
```java
    public Integer getExitCode() {
        // exit code is not provided by container list action.
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ContainersListElement.java`
#### Snippet
```java
    public Map<String, String> getCustomNetworkIpAddresses() {
        // IP address is not provided by container list action.
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ContainersListElement.java`
#### Snippet
```java
    public String getNetworkMode() {
      // HostConfig.NetworkMode is not provided by container list action.
      return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/KubernetesConfigAuthUtil.java`
#### Snippet
```java
  private static AuthConfig parseUser(String userName, Map<String, ?> user) {
    if (user == null) {
      return null;
    }
    String token = (String) user.get("token");
```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/KubernetesConfigAuthUtil.java`
#### Snippet
```java
    String token = (String) user.get("token");
    if (token == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/KubernetesConfigAuthUtil.java`
#### Snippet
```java
    Map<String, ?> kubeConfig = readKubeConfig();
    if (kubeConfig == null) {
      return null;
    }
    String currentContextName = (String) kubeConfig.get("current-context");
```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/KubernetesConfigAuthUtil.java`
#### Snippet
```java
    String currentContextName = (String) kubeConfig.get("current-context");
    if (currentContextName == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/KubernetesConfigAuthUtil.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/KubernetesConfigAuthUtil.java`
#### Snippet
```java
  private static AuthConfig parseContext(Map<String, ?> kubeConfig, Map<String, ?> context) {
    if (context == null) {
      return null;
    }
    String userName = (String) context.get("user");
```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/KubernetesConfigAuthUtil.java`
#### Snippet
```java
    String userName = (String) context.get("user");
    if (userName == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/KubernetesConfigAuthUtil.java`
#### Snippet
```java
    List<Map<String, ?>> users = (List<Map<String, ?>>) kubeConfig.get("users");
    if (users == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/KubernetesConfigAuthUtil.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `jkube-kit/resource/helm/src/main/java/org/eclipse/jkube/kit/resource/helm/HelmServiceUtil.java`
#### Snippet
```java
      return annotations.get(JKubeAnnotations.ICON_URL.value());
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/PortMapping.java`
#### Snippet
```java
            return Integer.parseInt(val);
        } catch (@SuppressWarnings("unused") NumberFormatException exp) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/PortMapping.java`
#### Snippet
```java
            return portBindings;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/PortMapping.java`
#### Snippet
```java
        Map<String, Integer> portMap = getContainerPortToHostPortMap();
        if (portMap.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/PortMapping.java`
#### Snippet
```java
            return getAsIntOrNull(projProperties.getProperty(var));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/PortForwardService.java`
#### Snippet
```java
            return getNewestPod(items);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ContainerDetails.java`
#### Snippet
```java
        Set<String> keys = networks.keySet();
        if (keys == null || keys.isEmpty()) {
            return null;
        }
        Map<String, String> results = new HashMap<>();
```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ContainerDetails.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ContainerDetails.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ContainerDetails.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ContainerDetails.java`
#### Snippet
```java
        if (!json.getAsJsonObject(CONFIG).has(HEALTHCHECK) ||
                !json.getAsJsonObject(CONFIG).getAsJsonObject(HEALTHCHECK).has(TEST)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/model/ContainerDetails.java`
#### Snippet
```java
    public Integer getExitCode() {
        if (isRunning()) {
            return null;
        }
        JsonObject state = json.getAsJsonObject(STATE);
```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/DockerFileUtil.java`
#### Snippet
```java
                ? getFileReaderFromDir(new File(getHomeDir(),".docker/config.json"))
                : getFileReaderFromDir(new File(dockerConfig,"config.json"));
        return reader != null ? new Gson().fromJson(reader, JsonObject.class) : null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/helper/DockerFileUtil.java`
#### Snippet
```java
            }
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/api/src/main/java/org/eclipse/jkube/kit/build/api/assembly/AssemblyManager.java`
#### Snippet
```java
            return artifactFile;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/openshift/ImageStreamService.java`
#### Snippet
```java
        } catch (ParseException e) {
            log.error("parsing date error : " + e.getMessage(), e);
            return null;
        } catch (NullPointerException e) {
            log.error("tag date is null : " + e.getMessage(), e);
```

### ReturnNull
Return of `null`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/openshift/ImageStreamService.java`
#### Snippet
```java
        } catch (NullPointerException e) {
            log.error("tag date is null : " + e.getMessage(), e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DockerRegistrySecretEnricher.java`
#### Snippet
```java
        final Optional<Map<String,Object>> secretConfig = config.getSecretConfiguration(dockerId);
        if (!secretConfig.isPresent()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/kubernetes/KubernetesClientUtil.java`
#### Snippet
```java
            return kubernetesClient.genericKubernetesResources(resource.getApiVersion(), resource.getKind()).inNamespace(namespace).withName(resource.getMetadata().getName()).get();
        } catch (Exception exception) { // Not found exception
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/SecretEnricher.java`
#### Snippet
```java
            return annotation.get(getAnnotationKey());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/SecretEnricher.java`
#### Snippet
```java
            return resourceConfig.getSecrets();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/GitEnricher.java`
#### Snippet
```java
            } catch (IOException | GitAPIException e) {
                log.error("Cannot extract Git information for adding to annotations: " + e, e);
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/IngressEnricher.java`
#### Snippet
```java
            return routeDomainFromProperties;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/openshift/OpenShiftBuildServiceUtils.java`
#### Snippet
```java
        };
      } else {
        return null;
      }
    } catch (IOException e) {
```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/FileDataSecretEnricher.java`
#### Snippet
```java
            return key.substring(FILEDATASECRET_PREFIX_ANNOTATION.length());
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/PortNameEnricher.java`
#### Snippet
```java
        String serviceName = DEFAULT_PORT_MAPPING.get(port);
        if (StringUtils.isBlank(serviceName)) {
            return null;
        }
        log.verbose("Adding default port name %s for port %d", serviceName, port);
```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/PortNameEnricher.java`
#### Snippet
```java
        Set<String> sn = serviceNames(port, protocol);
        if (sn == null || sn.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ServiceAccountEnricher.java`
#### Snippet
```java
            return builder.buildSpec().getTemplate().getSpec().getServiceAccount();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ServiceAccountEnricher.java`
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
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultNamespaceEnricher.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ConfigMapEnricher.java`
#### Snippet
```java
            return resourceConfig.getConfigMap();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ingress/ExtensionsV1beta1IngressConverter.java`
#### Snippet
```java
    public static Ingress convert(io.fabric8.kubernetes.api.model.networking.v1.Ingress networkV1Ingress) {
        if (networkV1Ingress == null) {
            return null;
        }
        IngressBuilder extensionsIngressBuilder = new IngressBuilder();
```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/openshift/DeploymentConfigEnricher.java`
#### Snippet
```java
            return new DeploymentStrategyBuilder().withType(strategyType).build();
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java
            log.warn("Invalid port specification '%s' for image %s. Must match \\d+(/(tcp|udp))?. Ignoring for now for service generation",
                     portSpec, imageName);
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java
        // No image config, no service
        if (!hasImageConfiguration()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java
        } else {
            // No ports, no headless --> no service
            return null;
        }
        specBuilder.withType(getConfig(Config.TYPE));
```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
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
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java
            return ports.remove(0);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java
                return serviceNames.iterator().next();
            } else {
                return null;
            }
        } catch (IOException e) {
```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java
        } catch (IOException e) {
            log.warn("Cannot lookup port %d/%s in IANA database: %s", port, serviceProtocol.toLowerCase(), e.getMessage());
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/DefaultServiceEnricher.java`
#### Snippet
```java
            log.error("Error while reading the spring-boot configuration", ex);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/openshift/RouteEnricher.java`
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
in `jkube-kit/enricher/generic/src/main/java/org/eclipse/jkube/enricher/generic/ingress/NetworkingV1IngressGenerator.java`
#### Snippet
```java
                    .build();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/config/service/src/main/java/org/eclipse/jkube/kit/config/service/ApplyService.java`
#### Snippet
```java
            } catch (IOException e) {
                onApplyError("Failed to process template " + sourceName + ". " + e + ". " + entity, e);
                return null;
            }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/common-maven/src/main/java/org/eclipse/jkube/kit/common/util/MavenUtil.java`
#### Snippet
```java
            return artifact.getFile();
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `jkube-kit/common-maven/src/main/java/org/eclipse/jkube/kit/common/util/MavenUtil.java`
#### Snippet
```java
            project = project.getParent();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/UlimitConfig.java`
#### Snippet
```java
            return name + "=:"+soft;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/UlimitConfig.java`
#### Snippet
```java
    private Integer asInteger(String number) {
        if (number == null || number.length() == 0) {
            return null;
        }
        return Integer.parseInt(number);
```

### ReturnNull
Return of `null`
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/NetworkConfig.java`
#### Snippet
```java
        public NetworkConfig build() {
            return mode == null && name == null && aliases == null ?
                null : new NetworkConfig(mode, name, aliases);
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/NetworkConfig.java`
#### Snippet
```java

    public String getContainerAlias() {
        return mode == Mode.container ? name : null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/NetworkConfig.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/NetworkConfig.java`
#### Snippet
```java

    public String getCustomNetwork() {
        return mode == Mode.custom || mode == null ? name : null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/NetworkConfig.java`
#### Snippet
```java
        }
        if (mode == null) {
            return null;
        }
        return mode.name().toLowerCase() + (mode == Mode.container ? ":" + containerId : "");
```

### ReturnNull
Return of `null`
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/RunImageConfiguration.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/HealthCheckConfiguration.java`
#### Snippet
```java
        // Seconds as default
        if (timeout == null) {
            return null;
        }
        return timeout.matches("^\\d+$") ? timeout + "s" : timeout;
```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/generator/VertxPortsExtractor.java`
#### Snippet
```java
             */
            if (pluginConfiguration == null) {
                return null;
            }
            Map<String, Object> config = (Map<String, Object>)pluginConfiguration.get("config");
```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/generator/VertxPortsExtractor.java`
#### Snippet
```java
            }
            Map<String, Object> config = (Map<String, Object>)pluginConfiguration.get("config");
            return config != null ? config.get("vertxConfig").toString() : null;
        }
        return null;
```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/generator/VertxPortsExtractor.java`
#### Snippet
```java
            return config != null ? config.get("vertxConfig").toString() : null;
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `jkube-kit/watcher/standard/src/main/java/org/eclipse/jkube/watcher/standard/DockerImageWatcher.java`
#### Snippet
```java
            Thread.currentThread().interrupt();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-micronaut/src/main/java/org/eclipse/jkube/micronaut/enricher/MicronautHealthCheckEnricher.java`
#### Snippet
```java
  private Probe buildProbe(Integer initialDelaySeconds, Integer periodSeconds){
    if (!isApplicable()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java

    private static final String VERTX_HEALTH = "vertx.health.";
    private static final Function<? super String, String> TRIM = input -> input == null ? null : input.trim();
    protected static final String[] JKUBE_PLUGINS = { "kubernetes-maven-plugin", "openshift-maven-plugin",
        "org.eclipse.jkube.kubernetes.gradle.plugin", "org.eclipse.jkube.openshift.gradle.plugin",
```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java
    private Probe discoverVertxHealthCheck(boolean readiness) {
        if (!isApplicable()) {
            return null;
        }
        // We don't allow to set the HOST, because it should rather be configured in the HTTP header (Host header)
```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java
            if (!port.isPresent() && !portName.isPresent()) {
                log.info("TCP health check disabled (port not set)");
                return null;
            }
            if (port.isPresent() && port.get() <= 0) {
```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java
            if (port.isPresent() && port.get() <= 0) {
                log.info("TCP health check disabled (port set to a negative number)");
                return null;
            }
        } else if (type.equalsIgnoreCase("EXEC")) {
```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java
            if (command.isEmpty()) {
                log.info("TCP health check disabled (command not set)");
                return null;
            }
        } else if (type.equalsIgnoreCase("HTTP")) {
```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java
            if (port.isPresent() && port.get() <= 0) {
                log.info("HTTP health check disabled (port set to " + port.get());
                return null;
            }

```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java
            if (path == null) {
                log.info("HTTP health check disabled (path not set)");
                return null;
            }

```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-vertx/src/main/java/org/eclipse/jkube/vertx/enricher/VertxHealthCheckEnricher.java`
#### Snippet
```java
            if (path.isEmpty()) {
                log.info("HTTP health check disabled (the path is empty)");
                return null;
            }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/AssemblyConfiguration.java`
#### Snippet
```java

    public String getModeRaw() {
        return mode != null ? mode.name() : null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/AssemblyConfiguration.java`
#### Snippet
```java

    public String getPermissionsRaw() {
        return permissions != null ? permissions.name() : null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
      return "1.21";
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java

    // No dockerfile mode
    return null;
  }

```

### ReturnNull
Return of `null`
in `jkube-kit/config/image/src/main/java/org/eclipse/jkube/kit/config/image/build/BuildConfiguration.java`
#### Snippet
```java
      return "1.21";
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/RegistryServerConfiguration.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/Configs.java`
#### Snippet
```java
        }
        default String getDefaultValue() {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/Configs.java`
#### Snippet
```java

    public static Integer asInteger(String value) {
        return value != null ? Integer.parseInt(value) : null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/ExternalCommand.java`
#### Snippet
```java
                    }
                }
                return null;
            } catch (IOException e) {
                return e;
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/OpenshiftHelper.java`
#### Snippet
```java
            return client.adapt(OpenShiftClient.class);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/OpenshiftHelper.java`
#### Snippet
```java
            objects = entity.getObjects();
            if (objects == null || objects.isEmpty()) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `jkube-kit/profile/src/main/java/org/eclipse/jkube/kit/profile/ProfileUtil.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/PropertiesUtil.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/SpringBootUtil.java`
#### Snippet
```java
            return project.getProperties().get("spring.profiles.active").toString();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/UserConfigurationCompare.java`
#### Snippet
```java
                        entity);
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/UserConfigurationCompare.java`
#### Snippet
```java
        } else {
            //no match
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/FileUtil.java`
#### Snippet
```java
    public static String getAbsolutePath(URL url) {
        try {
            return url != null ? Paths.get(url.toURI()).toAbsolutePath().toString() : null;
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/FileUtil.java`
#### Snippet
```java
        final Path newPath = new File(newFilePath).toPath();
        if (!Objects.equals(oldPath.getRoot(), newPath.getRoot())) {
            return null;
        }
        final StringBuilder relativeFilePath = new StringBuilder();
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KindFilenameMapperUtil.java`
#### Snippet
```java
                return new FileInputStream(locationFile);
            } catch (FileNotFoundException e) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/IoUtil.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/ClassUtil.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/GitUtil.java`
#### Snippet
```java
                .findFirst().orElse(null);
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/GitUtil.java`
#### Snippet
```java
        if (gitFolder == null) {
            // No git repository found
            return null;
        }
        FileRepositoryBuilder builder = new FileRepositoryBuilder();
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/GitUtil.java`
#### Snippet
```java
            return findGitFolder(parent);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/SpringBootConfigurationHelper.java`
#### Snippet
```java
    public Integer getManagementPort(Properties properties) {
        String value = properties.getProperty(getManagementPortPropertyKey());
        return value != null ? Integer.parseInt(value) : null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/JKubeProjectUtil.java`
#### Snippet
```java
          .orElse(null);
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/JKubeProjectUtil.java`
#### Snippet
```java
      return jkubeProject.getArtifact();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-thorntail-v2/src/main/java/org/eclipse/jkube/thorntail/v2/enricher/ThorntailV2HealthCheckEnricher.java`
#### Snippet
```java
        if (getContext().hasDependency(IO_THORNTAIL, "thorntail-kernel")) {
            // if there's thorntail-kernel, it's Thorntail v4
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-thorntail-v2/src/main/java/org/eclipse/jkube/thorntail/v2/enricher/ThorntailV2HealthCheckEnricher.java`
#### Snippet
```java
                     .withInitialDelaySeconds(initialDelay).build();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/validator/ResourceValidator.java`
#### Snippet
```java
        @Override
        public <U> U unwrap(Class<U> aClass) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/validator/ResourceValidator.java`
#### Snippet
```java
        @Override
        public ConstraintDescriptor<?> getConstraintDescriptor() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/validator/ResourceValidator.java`
#### Snippet
```java
        @Override
        public Path getPropertyPath() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/validator/ResourceValidator.java`
#### Snippet
```java
        @Override
        public Class<ValidationMessage> getRootBeanClass() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/validator/ResourceValidator.java`
#### Snippet
```java
        @Override
        public ValidationMessage getRootBean() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/validator/ResourceValidator.java`
#### Snippet
```java
        @Override
        public String getMessageTemplate() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/validator/ResourceValidator.java`
#### Snippet
```java
        @Override
        public Object getExecutableReturnValue() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/validator/ResourceValidator.java`
#### Snippet
```java
        @Override
        public Object getInvalidValue() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/validator/ResourceValidator.java`
#### Snippet
```java
        @Override
        public Object getLeafBean() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/EnvUtil.java`
#### Snippet
```java

        if (!isVersionAValid && !isVersionBValid) {
            return null;
        } else if (isVersionAValid && isVersionBValid) {
            String[] partsA = versionA.split("\\.");
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/EnvUtil.java`
#### Snippet
```java
                return new Date(Long.parseLong(ts));
            } else {
                return null;
            }
        } catch (IOException e) {
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/EnvUtil.java`
#### Snippet
```java
            }
        }
        return ret.size() > 0 ? ret : null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/EnvUtil.java`
#### Snippet
```java
            return matcher.group(1);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/EnvUtil.java`
#### Snippet
```java
        List<String> ret = new ArrayList<>(orderedMap.values());
        ret.addAll(rest);
        return !ret.isEmpty() ? ret : null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/QueryService.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/DockerRegistryAuthHandler.java`
#### Snippet
```java
        JsonObject credentials = getCredentialsNode(auths, registryToLookup);
        if (credentials == null || !credentials.has("auth")) {
            return null;
        }
        String auth = credentials.get("auth").getAsString();
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/DockerRegistryAuthHandler.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/DockerRegistryAuthHandler.java`
#### Snippet
```java
            return auths.getAsJsonObject(registryWithScheme);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/CredentialHelperClient.java`
#### Snippet
```java
            } catch (IOException ex) {
                if (getStatusCode() == 1) {
                    return null;
                } else {
                    throw ex;
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/CredentialHelperClient.java`
#### Snippet
```java
                JsonFactory.newJsonObject(String.join("\n", reply));
            if (!credentials.has(SECRET_KEY) || !credentials.has(USERNAME_KEY)) {
                return null;
            }
            return credentials;
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/CredentialHelperClient.java`
#### Snippet
```java
    AuthConfig toAuthConfig(JsonObject credential){
        if (credential == null) {
            return null;
        }
        String password = credential.get(CredentialHelperClient.SECRET_KEY).getAsString();
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/ecr/AwsSdkAuthConfigFactory.java`
#### Snippet
```java
            Object credentials = awsSdkHelper.getCredentialsFromDefaultAWSCredentialsProviderChain();
            if (credentials == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/ecr/AwsSdkAuthConfigFactory.java`
#### Snippet
```java
                    issueTitle == null ? "" : "title=?" + issueTitle);
            log.warn("%s", t);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/ecr/AwsSdkHelper.java`
#### Snippet
```java
        Class<?> sessionCredentialsClass = Class.forName(AWS_SESSION_CREDENTIALS);
        return sessionCredentialsClass.isInstance(credentials)
                ? (String) sessionCredentialsClass.getMethod("getSessionToken").invoke(credentials) : null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/WatchService.java`
#### Snippet
```java
            WatchImageConfiguration watchConfig = imageConfig.getWatchConfiguration();
            return watchConfig != null && watchConfig.getPostGoal() != null ?
                    watchConfig.getPostGoal() : null;

        }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/RunService.java`
#### Snippet
```java
            }
        }
        return !ret.isEmpty() ? ret : null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/DockerMachine.java`
#### Snippet
```java
    public synchronized DockerConnectionDetector.ConnectionParameter getConnectionParameter(String certPath) throws IOException {
        if (machine == null) {
            return null;
        }
        if (envMap == null) {
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/DockerMachine.java`
#### Snippet
```java
        String value = envMap.get("DOCKER_HOST");
        if (value == null) {
            return null;
        }
        log.info("DOCKER_HOST from docker-machine \"%s\" : %s", machine.getName(), value);
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/DockerConnectionDetector.java`
#### Snippet
```java
                return new ConnectionParameter("npipe:////./pipe/docker_engine", certPath);
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/DockerConnectionDetector.java`
#### Snippet
```java
                return new ConnectionParameter("unix://"+filePath, certPath);
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/DockerConnectionDetector.java`
#### Snippet
```java
        public ConnectionParameter getConnectionParameter(String certPath) throws IOException {
            String connect = System.getenv("DOCKER_HOST");
            return connect != null ? new ConnectionParameter(connect, certPath) : null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/HcChunkedResponseHandlerWrapper.java`
#### Snippet
```java
      EntityStreamReaderUtil.processJsonStream(handler, stream);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/BuildService.java`
#### Snippet
```java
            return buildConfig.getDockerFile().getName();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
        if (awsContainerCredentialsUri == null) {
            log.debug("System environment not set for variable AWS_CONTAINER_CREDENTIALS_RELATIVE_URI, no task role found");
            return null;
        }
        if (awsContainerCredentialsUri.charAt(0) != '/') {
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
        } catch (URISyntaxException e) {
            log.warn("Failed to construct path to ECS metadata endpoint for credentials", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
                System.getProperty(lookupMode.asSysProperty(AUTH_AUTHTOKEN)));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
            return (Map<String, String>)authConfigMap.get(configMapKey);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java

        // No authentication found
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
            return AuthConfig.fromMap(cloneConfig);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
                    // no instance role found
                    log.debug("No instance role found, return code was %d", response.getStatusLine().getStatusCode());
                    return null;
                }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
                            response.getStatusLine().getStatusCode());
                    // no instance role found
                    return null;
                }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
            return configuration.get(prop).toString();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
        JsonObject credentials = getCredentialsNode(auths,registryToLookup);
        if (credentials == null || !credentials.has("auth")) {
            return null;
        }
        String auth = credentials.get("auth").getAsString();
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
                return validateMandatoryOpenShiftLogin(readKubeConfigAuth(), useOpenAuthModeKey);
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
                return validateMandatoryOpenShiftLogin(readKubeConfigAuth(), useOpenAuthModeKey);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
        if (accessKeyId == null) {
            log.debug("System environment not set for variable AWS_ACCESS_KEY_ID, no AWS credentials found");
            return null;
        }
        String secretAccessKey = awsSdkHelper.getAwsSecretAccessKeyEnvVar();
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
        if (secretAccessKey == null) {
            log.warn("System environment set for variable AWS_ACCESS_KEY_ID, but NOT for variable AWS_SECRET_ACCESS_KEY!");
            return null;
        }
        return AuthConfig.builder()
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
                    " Consider integrating the AWS SDK in order to make use of common AWS authentication mechanisms," +
                    " see https://www.eclipse.org/jkube/docs/kubernetes-maven-plugin#extended-authentication");
            return null;
        }
        return new AwsSdkAuthConfigFactory(log, awsSdkHelper).createAuthConfig();
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
            }
        }
        return defaultServer != null ? createAuthConfigFromServer(defaultServer, passwordDecryptionMethod) : null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
            return auths.getAsJsonObject(registryWithScheme);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
        JsonObject dockerConfig = DockerFileUtil.readDockerConfig();
        if (dockerConfig == null) {
            return null;
        }
        String registryToLookup = registry != null ? registry : DOCKER_LOGIN_DEFAULT_REGISTRY;
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java

        log.debug("AuthConfig: no credentials found");
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
                        response.getStatusLine().getStatusCode());
                // no instance role found
                return null;
            }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/auth/AuthConfigFactory.java`
#### Snippet
```java
        URI uri = getMetadataEndpointForCredentials(awsSdkHelper, log);
        if (uri == null) {
            return null;
        }
        // get temporary credentials
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/unix/UnixSocket.java`
#### Snippet
```java
    @Override
    public InetAddress getInetAddress() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/unix/UnixSocket.java`
#### Snippet
```java
    @Override
    public InetAddress getLocalAddress() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/unix/UnixSocket.java`
#### Snippet
```java
    @Override
    public SocketChannel getChannel() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/win/NamedPipe.java`
#### Snippet
```java
    @Override
    public SocketChannel getChannel() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/win/NamedPipe.java`
#### Snippet
```java
    @Override
    public InetAddress getInetAddress() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/win/NamedPipe.java`
#### Snippet
```java
    @Override
    public SocketAddress getLocalSocketAddress() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/win/NamedPipe.java`
#### Snippet
```java
    @Override
    public InetAddress getLocalAddress() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/DockerAccessWithHcClient.java`
#### Snippet
```java
                }
            }
            return null;
        };
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/DockerAccessWithHcClient.java`
#### Snippet
```java
        ApacheHttpClientDelegate.HttpBodyAndStatus response = inspectImage(name);
        if (response.getStatusCode() == HTTP_NOT_FOUND) {
            return null;
        }
        JsonObject imageDetails = JsonFactory.newJsonObject(response.getBody());
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/DockerAccessWithHcClient.java`
#### Snippet
```java
        ApacheHttpClientDelegate.HttpBodyAndStatus response = inspectExecContainer(containerIdOrName);
        if (response.getStatusCode() == HTTP_NOT_FOUND) {
            return null;
        } else {
            return new ExecDetails(JsonFactory.newJsonObject(response.getBody()));
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/DockerAccessWithHcClient.java`
#### Snippet
```java
                IOUtils.copy(stream, out, 65536);
            }
            return null;
        };
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/DockerAccessWithHcClient.java`
#### Snippet
```java
        ApacheHttpClientDelegate.HttpBodyAndStatus response = inspectContainer(containerIdOrName);
        if (response.getStatusCode() == HTTP_NOT_FOUND) {
            return null;
        } else {
            return new ContainerDetails(JsonFactory.newJsonObject(response.getBody()));
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/access/hc/ApacheHttpClientDelegate.java`
#### Snippet
```java

    private static String getResponseMessage(HttpResponse response) throws IOException {
        return (response.getEntity() == null) ? null
            : EntityUtils.toString(response.getEntity()).trim();
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
            }
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
            return new LabelSelectorBuilder().withMatchLabels(matchLabels).build();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
          return toLabelSelector(metadata.getLabels());
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
            return newestPod.getMetadata().getName();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
    private static Date parseTimestamp(String text) {
        if (StringUtils.isBlank(text)) {
            return null;
        }
        return parseDate(text);
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
    public static Pod getNewestPod(Collection<Pod> pods) {
        if (pods == null || pods.isEmpty()) {
            return null;
        }
        List<Pod> sortedPods = new ArrayList<>(pods);
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
            return new SimpleDateFormat(DATE_TIME_FORMAT).parse(text);
        } catch (ParseException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
            return build.getStatus().getPhase();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
    public static ContainerPort addPort(String portNumberText, String portName, KitLogger log) {
        if (StringUtils.isBlank(portNumberText)) {
            return null;
        }
        int portValue;
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
        } catch (NumberFormatException e) {
            log.warn("Could not parse remote debugging port %s as an integer: %s", portNumberText, e);
            return null;
        }
        return new ContainerPortBuilder().withName(portName).withContainerPort(portValue).build();
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
            return getNamespace(entity.getMetadata());
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
            return getOrCreateAnnotations(item).get(annotationKey);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
            return getName(entity.getMetadata());
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
            return parseTimestamp(metadata.getCreationTimestamp());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java
            return entity.getNamespace();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/DeepCopy.java`
#### Snippet
```java
    public static <T> T copy(T orig) {
        if (orig == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/compose/DockerComposeConfigHandler.java`
#### Snippet
```java
                return buildConfig;
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/compose/DockerComposeConfigHandler.java`
#### Snippet
```java
            return ret.isAbsolute() ? ret.getAbsolutePath() : new File(parentDir, ret.getPath()).getAbsolutePath();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/compose/DockerComposeConfigHandler.java`
#### Snippet
```java
            return unresolvedConfig.getName();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/ImageNameFormatter.java`
#### Snippet
```java
    public String format(String name) {
        if (name == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/compose/DockerComposeServiceWrapper.java`
#### Snippet
```java
            return (Map<String, String>) ((Map) build).get("args");
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/compose/DockerComposeServiceWrapper.java`
#### Snippet
```java
        Object logConfig = asObject("logging");
        if (logConfig == null) {
            return null;
        }
        if (!(logConfig instanceof Map)) {
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/compose/DockerComposeServiceWrapper.java`
#### Snippet
```java
        String restart = asString("restart");
        if (restart == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/compose/DockerComposeServiceWrapper.java`
#### Snippet
```java
    Arguments getEntrypoint() {
        Object entrypoint = asObject("entrypoint");
        return entrypoint != null ? asArguments(entrypoint, "entrypoint") : null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/compose/DockerComposeServiceWrapper.java`
#### Snippet
```java
        } else {
            throwIllegalArgumentException(String.format("'%s' must be either String or List but not %s", label, command.getClass()));
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/compose/DockerComposeServiceWrapper.java`
#### Snippet
```java
        Object ulimits = asObject("ulimits");
        if (ulimits == null) {
            return null;
        }
        if (!(ulimits instanceof Map)) {
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/compose/DockerComposeServiceWrapper.java`
#### Snippet
```java
        Object build = asObject("build");
        if (build == null) {
            return null;
        }
        if (build instanceof String) {
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/compose/DockerComposeServiceWrapper.java`
#### Snippet
```java
        Object networks = asObject("networks");
        if (networks == null) {
            return null;
        }
        if (networks instanceof List) {
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/compose/DockerComposeServiceWrapper.java`
#### Snippet
```java
        } else {
            throwIllegalArgumentException("'networks:' must beu either a list or a map");
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/compose/DockerComposeServiceWrapper.java`
#### Snippet
```java
            return (String) ((Map) build).get("dockerfile");
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/compose/DockerComposeServiceWrapper.java`
#### Snippet
```java
    private Long convertToNanoCpus(Double cpus){
        if(cpus == null){
            return null;
        }
        return (long)(cpus * 1000000000);
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/compose/DockerComposeServiceWrapper.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/compose/DockerComposeServiceWrapper.java`
#### Snippet
```java
    Arguments getCommand() {
        Object command = asObject("command");
        return command != null ? asArguments(command, "command") : null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/StartOrderResolver.java`
#### Snippet
```java
    private List<String> extractDependentImagesFor(ImageConfiguration config) {
        LinkedHashSet<String> ret = new LinkedHashSet<>(config.getDependencies());
        return ret.isEmpty() ? null : new ArrayList<>(ret);
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/GoTimeUtil.java`
#### Snippet
```java
    public static BigDecimal durationNs(String durationP) {
        if (durationP == null) {
            return null;
        }
        String duration = durationP.trim();
```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/GoTimeUtil.java`
#### Snippet
```java
        String duration = durationP.trim();
        if (duration.length() == 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/helper/ConfigHelper.java`
#### Snippet
```java
        // This can be used to disable in a more "local" context, if set globally
        if(PropertyMode.Skip.name().equalsIgnoreCase(value)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/PropertyConfigHandler.java`
#### Snippet
```java
        BuildConfiguration config = fromConfig.getBuildConfiguration();
        if (!buildConfigured(config, valueProvider, project)) {
            return null;
        }
        return BuildConfiguration.builder()
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/PropertyConfigHandler.java`
#### Snippet
```java

    private Arguments extractArguments(ValueProvider valueProvider, ConfigKey configKey, Arguments alternative) {
        return valueProvider.getObject(configKey, alternative, raw -> raw != null ? Arguments.builder().shell(raw).build() : null);
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/PropertyConfigHandler.java`
#### Snippet
```java
        List<String> ulimits = valueProvider.getList(ConfigKey.ULIMITS, other);
        if (ulimits == null) {
            return null;
        }
        List<UlimitConfig> ret = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/PropertyConfigHandler.java`
#### Snippet
```java
        List<String> ports = valueProvider.getList(PORTS, config);
        if (ports == null) {
            return null;
        }
        List<String[]> parsedPorts = EnvUtil.splitOnLastColon(ports);
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
        protected Double withPrefix(String prefix, ConfigKey key, Properties properties) {
            String prop = properties.getProperty(key.asPropertyKey(prefix));
            return prop == null ? null : Double.valueOf(prop);
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
        protected Boolean withPrefix(String prefix, ConfigKey key, Properties properties) {
            String prop = properties.getProperty(key.asPropertyKey(prefix));
            return prop == null ? null : Boolean.parseBoolean(prop);
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
        protected Integer withPrefix(String prefix, ConfigKey key, Properties properties) {
            String prop = properties.getProperty(key.asPropertyKey(prefix));
            return prop == null ? null : Integer.valueOf(prop);
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
            // Short-circuit
            if(fromProperty == null && fromConfig == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
                    return merge(key, values);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
        protected Long withPrefix(String prefix, ConfigKey key, Properties properties) {
            String prop = properties.getProperty(key.asPropertyKey(prefix));
            return prop == null ? null : Long.valueOf(prop);
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/config/handler/property/ValueProvider.java`
#### Snippet
```java
            List<String> strings = extractFromPropertiesAsList(key.asPropertyKey(prefix), properties);
            if(strings == null) {
                return null;
            }
            return process(strings);
```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/handler/HandlerHub.java`
#### Snippet
```java
    public <T extends HasMetadata> ControllerHandler<T> getHandlerFor(T item) {
        if (item == null) {
            return null;
        }
        return (ControllerHandler<T>) getHandlerFor(item.getClass());
```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/JKubeEnricherContext.java`
#### Snippet
```java
    @Override
    public String getProperty(String key) {
        return project.getProperties() != null ? project.getProperties().getProperty(key) : null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/handler/ContainerHandler.java`
#### Snippet
```java
            return ret;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/handler/ContainerHandler.java`
#### Snippet
```java
    private String getImageName(ImageConfiguration imageConfiguration) {
        if (StringUtils.isBlank(imageConfiguration.getName())) {
            return null;
        }
        Properties props = getPropertiesWithSystemOverrides(this.configurationProperties);
```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/handler/ProbeHandler.java`
#### Snippet
```java
    private HTTPGetAction getHTTPGetAction(String getUrl, Map<String, String> headers) {
        if (getUrl == null || !getUrl.subSequence(0,4).toString().equalsIgnoreCase("http")) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/handler/ProbeHandler.java`
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
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/handler/ProbeHandler.java`
#### Snippet
```java
    public Probe getProbe(ProbeConfig probeConfig)  {
        if (probeConfig == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/handler/ProbeHandler.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/handler/ProbeHandler.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-wildfly-jar/src/main/java/org/eclipse/jkube/wildfly/jar/enricher/WildflyJARHealthCheckEnricher.java`
#### Snippet
```java
          return discoverWildflyJARHealthCheck(Config.STARTUP_PATH, Config.STARTUP_INITIAL_DELAY);
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-wildfly-jar/src/main/java/org/eclipse/jkube/wildfly/jar/enricher/WildflyJARHealthCheckEnricher.java`
#### Snippet
```java
            int port = asInt(getConfig(Config.PORT));
            if (port <= 0) {
                return null;
            }
            return new ProbeBuilder()
```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-wildfly-jar/src/main/java/org/eclipse/jkube/wildfly/jar/enricher/WildflyJARHealthCheckEnricher.java`
#### Snippet
```java
                    .build();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/resource/service/src/main/java/org/eclipse/jkube/kit/resource/service/TemplateUtil.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-wildfly-jar/src/main/java/org/eclipse/jkube/wildfly/jar/generator/WildflyJARGenerator.java`
#### Snippet
```java
                map(Plugin::getConfiguration).
                map(c -> (Map<String, Object>) c.get(PLUGIN_OPTIONS)).
                map(options -> options.containsKey(JBOSS_MAVEN_DIST) && options.containsKey(JBOSS_MAVEN_REPO) ? options : null).
                map(options -> {
                   String dist = (String) options.get(JBOSS_MAVEN_DIST);
```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-wildfly-jar/src/main/java/org/eclipse/jkube/wildfly/jar/generator/WildflyJARGenerator.java`
#### Snippet
```java
                map(options -> {
                   String dist = (String) options.get(JBOSS_MAVEN_DIST);
                   return dist == null || "true".equals(dist) ? (String) options.get(JBOSS_MAVEN_REPO) : null;
                }).map(Paths::get).orElse(null);
    }
```

### ReturnNull
Return of `null`
in `jkube-kit/generator/webapp/src/main/java/org/eclipse/jkube/generator/webapp/AppServerHandler.java`
#### Snippet
```java
     */
    default String getUser() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/generator/java-exec/src/main/java/org/eclipse/jkube/generator/javaexec/FatJarDetector.java`
#### Snippet
```java
    public Result scan() {
        if (directory == null || !directory.exists()) {
            return null;
        }
        // Scanning is lazy ...
```

### ReturnNull
Return of `null`
in `jkube-kit/generator/webapp/src/main/java/org/eclipse/jkube/generator/webapp/handler/CustomAppServerHandler.java`
#### Snippet
```java
  @Override
  public String getAssemblyName() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `jkube-kit/generator/java-exec/src/main/java/org/eclipse/jkube/generator/javaexec/JavaExecGenerator.java`
#### Snippet
```java

    protected String getBuildWorkdir() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/generator/java-exec/src/main/java/org/eclipse/jkube/generator/javaexec/JavaExecGenerator.java`
#### Snippet
```java

    protected Arguments getBuildEntryPoint() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/api/src/main/java/org/eclipse/jkube/kit/enricher/api/util/KubernetesResourceUtil.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/AbstractPortsExtractor.java`
#### Snippet
```java
		String propertyName = getConfigPathPropertyName();
		if (StringUtils.isBlank(propertyName)) {
			return null;
		}
		// The system property / Maven property has priority over what is specified in
```

### ReturnNull
Return of `null`
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/AbstractPortsExtractor.java`
#### Snippet
```java
		}
		if (StringUtils.isBlank(configPath)) {
			return null;
		}
		return Paths.get(configPath).toFile();
```

### ReturnNull
Return of `null`
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/AbstractJKubePlugin.java`
#### Snippet
```java
        return evaluatedProject.getTasks().getByName(taskName);
      } catch (UnknownTaskException ignore) {
        return null;
      }
    };
```

### ReturnNull
Return of `null`
in `jkube-kit/generator/api/src/main/java/org/eclipse/jkube/generator/api/support/BaseGenerator.java`
#### Snippet
```java
        if (getContext().getRuntimeMode() == RuntimeMode.OPENSHIFT &&
            getContext().getStrategy() == JKubeBuildStrategy.s2i) {
            return null;
        }
        return getConfigWithFallback(Config.REGISTRY, "jkube.generator.registry", null);
```

### ReturnNull
Return of `null`
in `gradle-plugin/kubernetes/src/main/java/org/eclipse/jkube/gradle/plugin/task/TaskUtil.java`
#### Snippet
```java
  public static DockerAccess initDockerAccess(KubernetesExtension kubernetesExtension, KitLogger kitLogger) {
    if (!kubernetesExtension.isDockerAccessRequired()) {
      return null;
    }
    final DockerAccessFactory.DockerAccessContext dockerAccessContext = DockerAccessFactory.DockerAccessContext.builder()
```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/DockerHealthCheckEnricher.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/DockerHealthCheckEnricher.java`
#### Snippet
```java
    private ImageConfiguration getImageWithContainerName(String containerName) {
        if (containerName == null) {
            return null;
        }
        for (ImageConfiguration image : getImages()) {
```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/DockerHealthCheckEnricher.java`
#### Snippet
```java
                }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/DockerHealthCheckEnricher.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/WebAppHealthCheckEnricher.java`
#### Snippet
```java
    private Probe getProbe(boolean readiness) {
        if (!isApplicable()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/AbstractHealthCheckEnricher.java`
#### Snippet
```java

    protected Probe getStartupProbe() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/AbstractHealthCheckEnricher.java`
#### Snippet
```java
     */
    protected Probe getLivenessProbe() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/AbstractHealthCheckEnricher.java`
#### Snippet
```java
     */
    protected Probe getReadinessProbe() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/KarafHealthCheckEnricher.java`
#### Snippet
```java

        if (!configurationValues.isPresent()) {
            return null;
        }
        final Optional<Object> lookup = configurationValues.map(m -> m.get("startupFeatures"));
```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/KarafHealthCheckEnricher.java`
#### Snippet
```java

        if (!lookup.isPresent()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/enricher/specific/src/main/java/org/eclipse/jkube/kit/enricher/specific/KarafHealthCheckEnricher.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-microprofile/src/main/java/org/eclipse/jkube/microprofile/MicroprofileHealthUtil.java`
#### Snippet
```java
      return microProfileDep.getVersion();
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/enricher/SpringBootHealthCheckEnricher.java`
#### Snippet
```java
            log.error("Error while reading the spring-boot configuration", ex);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-microprofile/src/main/java/org/eclipse/jkube/microprofile/enricher/AbstractMicroprofileHealthCheckEnricher.java`
#### Snippet
```java
          .build();
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-microprofile/src/main/java/org/eclipse/jkube/microprofile/enricher/AbstractMicroprofileHealthCheckEnricher.java`
#### Snippet
```java
      return discoverAbstractMicroprofileHealthCheck(getConfig(Config.STARTUP_PATH), getConfigAsInt(Config.STARTUP_INITIAL_DELAY), getConfigAsInt(Config.STARTUP_FAILURE_THRESHOLD), getConfigAsInt(Config.STARTUP_SUCCESS_THRESHOLD), getConfigAsInt(Config.STARTUP_PERIOD_SECONDS));
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-quarkus/src/main/java/org/eclipse/jkube/quarkus/enricher/QuarkusHealthCheckEnricher.java`
#### Snippet
```java
                QuarkusUtils::resolveQuarkusStartupPath);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-quarkus/src/main/java/org/eclipse/jkube/quarkus/enricher/QuarkusHealthCheckEnricher.java`
#### Snippet
```java
    private Probe discoverQuarkusHealthCheck(int initialDelay, Function<JavaProject, String> pathResolver) {
        if (!getContext().hasDependency(QUARKUS_GROUP_ID, "quarkus-smallrye-health")) {
            return null;
        }
        return new ProbeBuilder()
```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-spring-boot/src/main/java/org/eclipse/jkube/springboot/watcher/SpringBootWatcher.java`
#### Snippet
```java
        if (selector == null) {
            log.warn("Unable to determine a selector for application pods");
            return null;
        }

```

### ReturnNull
Return of `null`
in `jkube-kit/jkube-kit-quarkus/src/main/java/org/eclipse/jkube/quarkus/generator/QuarkusGenerator.java`
#### Snippet
```java
      return ab.build();
    }
    return null;
  }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `answer` is redundant
in `jkube-kit/common/src/main/java/org/eclipse/jkube/kit/common/util/KubernetesHelper.java`
#### Snippet
```java

    public static String getEnvVar(List<EnvVar> envVarList, String name, String defaultValue) {
        String answer = defaultValue;
        if (envVarList != null) {
            for (EnvVar envVar : envVarList) {
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

## RuleId[id=WaitNotInLoop]
### WaitNotInLoop
Call to `wait()` is not in loop
in `jkube-kit/build/service/docker/src/main/java/org/eclipse/jkube/kit/build/service/docker/WatchService.java`
#### Snippet
```java
                runService.addShutdownHookForStoppingContainers(context.isKeepContainer(), context.isRemoveVolumes(), context.isAutoCreateCustomNetworks());
            }
            wait();
        } catch (InterruptedException e) {
            log.warn("Interrupted");
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

