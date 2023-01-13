# dubbo-admin 
 
# Bad smells
I found 263 bad smells with 77 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SizeReplaceableByIsEmpty | 54 | true |
| ReturnNull | 45 | false |
| AssignmentToMethodParameter | 22 | false |
| DynamicRegexReplaceableByCompiledPattern | 20 | false |
| BoundedWildcard | 16 | false |
| UtilityClassWithoutPrivateConstructor | 14 | true |
| ConstantValue | 11 | false |
| SystemOutErr | 7 | false |
| DataFlowIssue | 5 | false |
| CommentedOutCode | 4 | false |
| MissortedModifiers | 4 | false |
| PublicFieldAccessedInSynchronizedContext | 4 | false |
| UnnecessaryLocalVariable | 4 | true |
| ZeroLengthArrayInitialization | 4 | false |
| UnnecessaryFullyQualifiedName | 3 | false |
| RedundantFieldInitialization | 3 | false |
| UnusedAssignment | 3 | false |
| UnnecessarySemicolon | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| RegExpRedundantEscape | 2 | false |
| RedundantArrayCreation | 2 | true |
| DuplicateBranchesInSwitch | 2 | false |
| RedundantCollectionOperation | 2 | false |
| MismatchedJavadocCode | 2 | false |
| NonShortCircuitBoolean | 2 | false |
| NonProtectedConstructorInAbstractClass | 2 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 2 | false |
| Java8MapApi | 2 | false |
| UseOfPropertiesAsHashtable | 2 | false |
| SynchronizeOnThis | 2 | false |
| IOResource | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| StringEqualsEmptyString | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| ConditionCoveredByFurtherCondition | 1 | false |
| NestedAssignment | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UseBulkOperation | 1 | false |
| IndexOfReplaceableByContains | 1 | false |
## RuleId[ruleID=IOResource]
### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `dubbo-admin-test/src/main/java/org/apache/dubbo/admin/ProviderBootstrap.java`
#### Snippet
```java
public class ProviderBootstrap {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ProviderConfiguration.class);
        context.start();
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `DubboAdminApplication` has only 'static' members, and lacks a 'private' constructor
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/DubboAdminApplication.java`
#### Snippet
```java
@EnableDubbo(scanBasePackages = {"org.apache.dubbo.admin.provider"})
@MapperScan(basePackages = {"org.apache.dubbo.admin.mapper"})
public class DubboAdminApplication {

	public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `Tool` has only 'static' members, and lacks a 'private' constructor
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/Tool.java`
#### Snippet
```java
 *
 */
public class Tool {

    public static String getInterface(String service) {
```

### UtilityClassWithoutPrivateConstructor
Class `ConsumerBootstrap` has only 'static' members, and lacks a 'private' constructor
in `dubbo-admin-test/src/main/java/org/apache/dubbo/admin/ConsumerBootstrap.java`
#### Snippet
```java
import org.springframework.context.annotation.PropertySource;

public class ConsumerBootstrap {
    public static void main(String[] args) throws Exception {
        int port = 8282;
```

### UtilityClassWithoutPrivateConstructor
Class `OverrideUtils` has only 'static' members, and lacks a 'private' constructor
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/OverrideUtils.java`
#### Snippet
```java
 *
 */
public class OverrideUtils {
    public static OverrideConfig weightDTOtoConfig(WeightDTO weightDTO) {
        OverrideConfig overrideConfig = new OverrideConfig();
```

### UtilityClassWithoutPrivateConstructor
Class `LocalDateTimeUtil` has only 'static' members, and lacks a 'private' constructor
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/utils/LocalDateTimeUtil.java`
#### Snippet
```java
 * Date time tool class of LocalDateTime.
 */
public class LocalDateTimeUtil {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ApiDocsDubboGenericUtil` has only 'static' members, and lacks a 'private' constructor
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/utils/ApiDocsDubboGenericUtil.java`
#### Snippet
```java
 * Dubbo operation related tool class.
 */
public class ApiDocsDubboGenericUtil {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CoderUtil` has only 'static' members, and lacks a 'private' constructor
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/CoderUtil.java`
#### Snippet
```java
import java.security.NoSuchAlgorithmException;

public class CoderUtil {

    private static final Logger logger = LoggerFactory.getLogger(CoderUtil.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ServiceTestUtil` has only 'static' members, and lacks a 'private' constructor
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ServiceTestUtil.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class ServiceTestUtil {
    private static Pattern COLLECTION_PATTERN = Pattern.compile("^java\\.util\\..*(Set|List|Queue|Collection|Deque)(<.*>)*$");
    private static Pattern MAP_PATTERN = Pattern.compile("^java\\.util\\..*Map.*(<.*>)*$");
```

### UtilityClassWithoutPrivateConstructor
Class `UrlUtils` has only 'static' members, and lacks a 'private' constructor
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/UrlUtils.java`
#### Snippet
```java
 *
 */
public class UrlUtils {

    public static String paramsMapToString(Map<String, String[]> params) {
```

### UtilityClassWithoutPrivateConstructor
Class `YamlParser` has only 'static' members, and lacks a 'private' constructor
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/YamlParser.java`
#### Snippet
```java
import java.util.Map;

public class YamlParser {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
```

### UtilityClassWithoutPrivateConstructor
Class `ProviderBootstrap` has only 'static' members, and lacks a 'private' constructor
in `dubbo-admin-test/src/main/java/org/apache/dubbo/admin/ProviderBootstrap.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class ProviderBootstrap {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
```

### UtilityClassWithoutPrivateConstructor
Class `ServiceTestV3Util` has only 'static' members, and lacks a 'private' constructor
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ServiceTestV3Util.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class ServiceTestV3Util {
    private static Pattern COLLECTION_PATTERN = Pattern.compile("^java\\.util\\..*(Set|List|Queue|Collection|Deque)(<.*>)*$");
    private static Pattern MAP_PATTERN = Pattern.compile("^java\\.util\\..*Map.*(<.*>)*$");
```

### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/Constants.java`
#### Snippet
```java
import java.util.Set;

public class Constants {

    public static final String REGISTRY_ADDRESS = "dubbo.registry.address";
```

### UtilityClassWithoutPrivateConstructor
Class `SyncUtils` has only 'static' members, and lacks a 'private' constructor
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/SyncUtils.java`
#### Snippet
```java
import static org.apache.dubbo.admin.common.util.Constants.COLON;

public class SyncUtils {

    public static final String SERVICE_FILTER_KEY = ".service";
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/dto/MetricDTO.java`
#### Snippet
```java
        MAJOR,   // 重要指标

        CRITICAL; // 关键指标
    }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/dto/RelationDTO.java`
#### Snippet
```java
    private List<Link> links;

    public static final Categories CONSUMER_CATEGORIES = new RelationDTO.Categories(0, "consumer", "consumer");;
    public static final Categories PROVIDER_CATEGORIES = new RelationDTO.Categories(1, "provider", "provider");
    public static final Categories CONSUMER_AND_PROVIDER_CATEGORIES = new RelationDTO.Categories(2, "consumer and provider", "consumer and provider");
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Dereference of `parameterTypeList` may produce `NullPointerException`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/store/mesh/virtualservice/match/DubboMethodMatch.java`
#### Snippet
```java
        if (argp != null) {
            if (((parameterTypeList == null || parameterTypeList.length == 0) && argp.size() > 0)
                    || (argp.size() != parameterTypeList.length)) {
                return false;
            }
```

### DataFlowIssue
Argument `old` might be null
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/OverrideServiceImpl.java`
#### Snippet
```java
        //for 2.6
        if (StringUtils.isNotEmpty(update.getService())) {
            List<Override> oldOverrides = convertDTOtoOldOverride(old);
            List<Override> updatedOverrides = convertDTOtoOldOverride(update);
            for (Override o : oldOverrides) {
```

### DataFlowIssue
Argument `old` might be null
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/OverrideServiceImpl.java`
#### Snippet
```java
        //2.6
        if (Constants.SERVICE.equals(override.getScope())) {
            List<Override> overrides = convertDTOtoOldOverride(old);
            for (Override o : overrides) {
                o.setEnabled(false);
```

### DataFlowIssue
Argument `old` might be null
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/OverrideServiceImpl.java`
#### Snippet
```java
        //for 2.6
        if (Constants.SERVICE.equals(overrideDTO.getScope())) {
            List<Override> overrides = convertDTOtoOldOverride(old);
            for (Override o : overrides) {
                registry.unregister(o.toUrl().addParameter(Constants.COMPATIBLE_CONFIG, true));
```

### DataFlowIssue
Argument `old` might be null
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/OverrideServiceImpl.java`
#### Snippet
```java
        //for 2.6
        if (Constants.SERVICE.equals(override.getScope())) {
            List<Override> overrides = convertDTOtoOldOverride(old);
            for (Override o : overrides) {
                o.setEnabled(true);
```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'java.util.HashSet' constructor
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/ProviderServiceImpl.java`
#### Snippet
```java
                candidates = findApplications();
            } else if (Constants.IP.equals(pattern)) {
                candidates = findAddresses().stream().collect(Collectors.toSet());
            }
            // replace dot symbol and asterisk symbol to java-based regex pattern
```

## RuleId[ruleID=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ParseUtils.java`
#### Snippet
```java

            String s11 = glob1.substring(0, index1);
            String s12 = glob1.substring(index1 + 1, glob1.length());

            String s21 = glob2.substring(0, index2);
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ParseUtils.java`
#### Snippet
```java

            String s21 = glob2.substring(0, index2);
            String s22 = glob2.substring(index2 + 1, glob2.length());

            if (!s11.startsWith(s21) && !s21.startsWith(s11)) return false;
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `SpringBeanUtils.applicationContext` from instance context
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/utils/SpringBeanUtils.java`
#### Snippet
```java
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringBeanUtils.applicationContext = applicationContext;
    }
}
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (6 lines)
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/Provider.java`
#### Snippet
```java
    public URL toUrl() {
        Map<String, String> serviceName2Map = ConvertUtil.serviceName2Map(getService());
        /*if(!serviceName2Map.containsKey(Constants.INTERFACE_KEY)) {
            throw new IllegalArgumentException("No interface info");
        }
```

### CommentedOutCode
Commented out code (7 lines)
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/store/RoutingRule.java`
#### Snippet
```java
    }

//    public BlackWhiteList getBlackWhiteList() {
//        return blackWhiteList;
//    }
```

### CommentedOutCode
Commented out code (3 lines)
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ParseUtils.java`
#### Snippet
```java
            }
        }
        /*if (key != null)
        throw new IllegalStateException("Illegal route rule \"" + query
                + "\", The error in the end char: " + key);*/
```

### CommentedOutCode
Commented out code (3 lines)
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java

    public static RouteUtils parse(String whenRule, String thenRule) throws ParseException {
        /*if (whenRule == null || whenRule.trim().length() == 0) {
            throw new ParseException("Illegal route rule without when express", 0);
    	}*/
```

## RuleId[ruleID=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ParseUtils.java`
#### Snippet
```java
    public static String METHOD_SPLIT = ",";
    private static Pattern VARIABLE_PATTERN = Pattern.compile(
            "\\$\\s*\\{?\\s*([\\._0-9a-zA-Z]+)\\s*\\}?");
    private static Pattern QUERY_PATTERN = Pattern
            .compile("([&=]?)\\s*([^&=\\s]+)");
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ParseUtils.java`
#### Snippet
```java
    public static String METHOD_SPLIT = ",";
    private static Pattern VARIABLE_PATTERN = Pattern.compile(
            "\\$\\s*\\{?\\s*([\\._0-9a-zA-Z]+)\\s*\\}?");
    private static Pattern QUERY_PATTERN = Pattern
            .compile("([&=]?)\\s*([^&=\\s]+)");
```

## RuleId[ruleID=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/MethodDefinition.java`
#### Snippet
```java

    public int hashCode() {
        int result = Objects.hash(new Object[]{this.getName(), this.getReturnType(), this.getParameters()});
        result = 31 * result + Arrays.hashCode(this.getParameterTypes());
        return result;
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/TypeDefinition.java`
#### Snippet
```java

    public int hashCode() {
        return Objects.hash(new Object[]{this.getId(), this.getType(), this.getItems(), this.getEnums(), this.get$ref(), this.getProperties()});
    }
}
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `configMap.keySet()` may be replaced with 'entrySet()' iteration
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/MetricsCollectController.java`
#### Snippet
```java
        }
        List<MetricDTO> metricDTOS = new ArrayList<>();
        for (String port : configMap.keySet()) {
            String protocol = configMap.get(port);
            String res = getOnePortMessage(group, ip, port, protocol);
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ServiceTestUtil.java`
#### Snippet
```java
                return "";
            case "java.lang.Object":
                return Collections.emptyMap();
            case "java.util.Date":
                return System.currentTimeMillis();
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ServiceTestV3Util.java`
#### Snippet
```java
                return "";
            case "java.lang.Object":
                return Collections.emptyMap();
            case "java.util.Date":
                return System.currentTimeMillis();
```

## RuleId[ruleID=RedundantCollectionOperation]
### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsKey()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/MetricsServiceImpl.java`
#### Snippet
```java
        for (Consumer consumer : consumerList) {
            String application = consumer.getApplication();
            if (!consumerNodeMap.keySet().contains(application)) {
                RelationDTO.Node node = new RelationDTO.Node(index, application, RelationDTO.CONSUMER_CATEGORIES.getIndex());
                consumerNodeMap.put(application, node);
```

### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsKey()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/MetricsServiceImpl.java`
#### Snippet
```java
        for (Provider provider : providerList) {
            String application = provider.getApplication();
            if (!providerNodeMap.keySet().contains(application)) {
                RelationDTO.Node node = new RelationDTO.Node(index, application, RelationDTO.PROVIDER_CATEGORIES.getIndex());
                providerNodeMap.put(application, node);
```

## RuleId[ruleID=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/ProviderService.java`
#### Snippet
```java
     * Get all provider's service name
     *
     * @return list of all provider's service name
     */
    Set<String> findServices();
```

### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/ProviderService.java`
#### Snippet
```java
     * Get all instance registry provider's service name
     *
     * @return list of all provider's service name
     */
    Set<String> findInstanceApplications();
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`categories.size() == 0` can be replaced with 'categories.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/RegistryServerSync.java`
#### Snippet
```java
            }
        }
        if (categories.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`input.length() > 0` can be replaced with '!input.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/store/mesh/virtualservice/match/StringMatch.java`
#### Snippet
```java
            return input == null || "".equals(input);
        } else if (stringMatch.getNoempty() != null) {
            return input != null && input.length() > 0;
        } else {
            return false;
```

### SizeReplaceableByIsEmpty
`argp.size() > 0` can be replaced with '!argp.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/store/mesh/virtualservice/match/DubboMethodMatch.java`
#### Snippet
```java
        List<StringMatch> argp = dubboMethodMatch.getArgp();
        if (argp != null) {
            if (((parameterTypeList == null || parameterTypeList.length == 0) && argp.size() > 0)
                    || (argp.size() != parameterTypeList.length)) {
                return false;
```

### SizeReplaceableByIsEmpty
`service.length() > 0` can be replaced with '!service.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/Tool.java`
#### Snippet
```java

    public static String getGroup(String service) {
        if (service != null && service.length() > 0) {
            int i = service.indexOf('/');
            if (i >= 0) {
```

### SizeReplaceableByIsEmpty
`service.length() > 0` can be replaced with '!service.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/Tool.java`
#### Snippet
```java

    public static String getVersion(String service) {
        if (service != null && service.length() > 0) {
            int i = service.lastIndexOf(':');
            if (i >= 0) {
```

### SizeReplaceableByIsEmpty
`service.length() > 0` can be replaced with '!service.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/Tool.java`
#### Snippet
```java

    public static String getInterface(String service) {
        if (service != null && service.length() > 0) {
            int i = service.indexOf('/');
            if (i >= 0) {
```

### SizeReplaceableByIsEmpty
`args.size() > 0` can be replaced with '!args.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/store/mesh/virtualservice/match/DubboMethodMatch.java`
#### Snippet
```java
        List<DubboMethodArg> args = dubboMethodMatch.getArgs();

        if (args != null && args.size() > 0) {
            if (parameters == null || parameters.length == 0) {
                return false;
```

### SizeReplaceableByIsEmpty
`providers.size() > 0` can be replaced with '!providers.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/ServiceController.java`
#### Snippet
```java

        String application = null;
        if (providers != null && providers.size() > 0) {
            application = providers.get(0).getApplication();
        }
```

### SizeReplaceableByIsEmpty
`providers.size() > 0` can be replaced with '!providers.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/MetricsCollectController.java`
#### Snippet
```java
    protected void addMetricsConfigToMap(Map<String, String> configMap, String ip) {
        List<Provider> providers = providerService.findByAddress(ip);
        if (providers.size() > 0) {
            Provider provider = providers.get(0);
            String service = provider.getService();
```

### SizeReplaceableByIsEmpty
`consumers.size() > 0` can be replaced with '!consumers.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/MetricsCollectController.java`
#### Snippet
```java
        } else {
            List<Consumer> consumers = consumerService.findByAddress(ip);
            if (consumers.size() > 0) {
                Consumer consumer = consumers.get(0);
                String service = consumer.getService();
```

### SizeReplaceableByIsEmpty
`consumer.length() != 0` can be replaced with '!consumer.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/RouteServiceImpl.java`
#### Snippet
```java
            String consumer = array[0].trim();
            String provider = array[1].trim();
            if (consumer.length() != 0) {
                if (when.length() != 0) {
                    when.append(" & ").append(consumer);
```

### SizeReplaceableByIsEmpty
`provider.length() != 0` can be replaced with '!provider.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/RouteServiceImpl.java`
#### Snippet
```java
                }
            }
            if (provider.length() != 0) {
                if (then.length() != 0) {
                    then.append(" & ").append(provider);
```

### SizeReplaceableByIsEmpty
`conditions.size() == 0` can be replaced with 'conditions.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/RouteServiceImpl.java`
#### Snippet
```java
            List<String> blackWhiteList = RouteUtils.filterBlackWhiteListFromConditions(ruleDTO.getConditions());
            List<String> conditions = RouteUtils.removeBlackWhiteListRuleFromConditions(ruleDTO.getConditions());
            if (conditions.size() == 0) {
                dynamicConfiguration.deleteConfig(path);
            } else {
```

### SizeReplaceableByIsEmpty
`blackWhiteList.size() > 0` can be replaced with '!blackWhiteList.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/RouteServiceImpl.java`
#### Snippet
```java
            }
            //2.6
            if (Constants.SERVICE.equals(ruleDTO.getScope()) && blackWhiteList.size() > 0) {
                Route route = RouteUtils.convertBlackWhiteListtoRoute(blackWhiteList, Constants.SERVICE, id);
                registry.unregister(route.toUrl());
```

### SizeReplaceableByIsEmpty
`configs.size() == 0` can be replaced with 'configs.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/OverrideUtils.java`
#### Snippet
```java
            }
        }
        if (configs.size() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`services.size() == 0` can be replaced with 'services.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/ProviderServiceImpl.java`
#### Snippet
```java
        }
        List<String> services = findServicesByApplication(application);
        if (services == null || services.size() == 0) {
            throw new ParamValidationException("there is no service for application: " + application);
        }
```

### SizeReplaceableByIsEmpty
`application.length() == 0` can be replaced with 'application.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/ProviderServiceImpl.java`
#### Snippet
```java

        ConcurrentMap<String, Map<String, URL>> providerUrls = getInterfaceRegistryCache().get(Constants.PROVIDERS_CATEGORY);
        if (providerUrls == null || application == null || application.length() == 0) {
            return ret;
        }
```

### SizeReplaceableByIsEmpty
`result.size() > 0` can be replaced with '!result.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/ProviderServiceImpl.java`
#### Snippet
```java
        String version = "2.6";
        Map<String, URL> result = findProviderUrlByAppandService(application, serviceName);
        if (result != null && result.size() > 0) {
            URL url = result.values().stream().findFirst().get();
            if (url.getParameter(Constants.SPECIFICATION_VERSION_KEY) != null) {
```

### SizeReplaceableByIsEmpty
`getParams().length() > 0` can be replaced with '!getParams().isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/Override.java`
#### Snippet
```java

    public boolean isMatch(String service, String address, String application) {
        return isEnabled() && getParams() != null && getParams().length() > 0
                && service.equals(getService())
                && (address == null || getAddress() == null || getAddress().length() == 0 || getAddress().equals(Constants.ANY_VALUE) || getAddress().equals(Constants.ANYHOST_VALUE) || getAddress().equals(address))
```

### SizeReplaceableByIsEmpty
`getAddress().length() == 0` can be replaced with 'getAddress().isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/Override.java`
#### Snippet
```java
        return isEnabled() && getParams() != null && getParams().length() > 0
                && service.equals(getService())
                && (address == null || getAddress() == null || getAddress().length() == 0 || getAddress().equals(Constants.ANY_VALUE) || getAddress().equals(Constants.ANYHOST_VALUE) || getAddress().equals(address))
                && (application == null || getApplication() == null || getApplication().length() == 0 || getApplication().equals(Constants.ANY_VALUE) || getApplication().equals(application));
    }
```

### SizeReplaceableByIsEmpty
`getApplication().length() == 0` can be replaced with 'getApplication().isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/Override.java`
#### Snippet
```java
                && service.equals(getService())
                && (address == null || getAddress() == null || getAddress().length() == 0 || getAddress().equals(Constants.ANY_VALUE) || getAddress().equals(Constants.ANYHOST_VALUE) || getAddress().equals(address))
                && (application == null || getApplication() == null || getApplication().length() == 0 || getApplication().equals(Constants.ANY_VALUE) || getApplication().equals(application));
    }

```

### SizeReplaceableByIsEmpty
`getParams().length() > 0` can be replaced with '!getParams().isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/Override.java`
#### Snippet
```java

    public boolean isUniqueMatch(Consumer consumer) {
        return isEnabled() && getParams() != null && getParams().length() > 0
                && consumer.getService().equals(getService())
                && consumer.getAddress().equals(getAddress());
```

### SizeReplaceableByIsEmpty
`getParams().length() > 0` can be replaced with '!getParams().isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/Override.java`
#### Snippet
```java

    public boolean isMatch(Consumer consumer) {
        return isEnabled() && getParams() != null && getParams().length() > 0
                && consumer.getService().equals(getService())
                && (getAddress() == null || getAddress().length() == 0 || getAddress().equals(Constants.ANY_VALUE) || getAddress().equals(Constants.ANYHOST_VALUE) || getAddress().equals(consumer.getAddress()))
```

### SizeReplaceableByIsEmpty
`getAddress().length() == 0` can be replaced with 'getAddress().isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/Override.java`
#### Snippet
```java
        return isEnabled() && getParams() != null && getParams().length() > 0
                && consumer.getService().equals(getService())
                && (getAddress() == null || getAddress().length() == 0 || getAddress().equals(Constants.ANY_VALUE) || getAddress().equals(Constants.ANYHOST_VALUE) || getAddress().equals(consumer.getAddress()))
                && (getApplication() == null || getApplication().length() == 0 || getApplication().equals(Constants.ANY_VALUE) || getApplication().equals(consumer.getApplication()));
    }
```

### SizeReplaceableByIsEmpty
`getApplication().length() == 0` can be replaced with 'getApplication().isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/Override.java`
#### Snippet
```java
                && consumer.getService().equals(getService())
                && (getAddress() == null || getAddress().length() == 0 || getAddress().equals(Constants.ANY_VALUE) || getAddress().equals(Constants.ANYHOST_VALUE) || getAddress().equals(consumer.getAddress()))
                && (getApplication() == null || getApplication().length() == 0 || getApplication().equals(Constants.ANY_VALUE) || getApplication().equals(consumer.getApplication()));
    }

```

### SizeReplaceableByIsEmpty
`getParams().length() > 0` can be replaced with '!getParams().isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/Override.java`
#### Snippet
```java

    public boolean isUniqueMatch(Provider provider) {
        return isEnabled() && getParams() != null && getParams().length() > 0
                && provider.getService().equals(getService())
                && provider.getAddress().equals(getAddress());
```

### SizeReplaceableByIsEmpty
`getParams().length() > 0` can be replaced with '!getParams().isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/Override.java`
#### Snippet
```java

    public boolean isMatch(Provider provider) {
        return isEnabled() && getParams() != null && getParams().length() > 0
                && provider.getService().equals(getService())
                && (getAddress() == null || getAddress().length() == 0 || getAddress().equals(Constants.ANY_VALUE) || getAddress().equals(Constants.ANYHOST_VALUE) || getAddress().equals(provider.getAddress()))
```

### SizeReplaceableByIsEmpty
`getAddress().length() == 0` can be replaced with 'getAddress().isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/Override.java`
#### Snippet
```java
        return isEnabled() && getParams() != null && getParams().length() > 0
                && provider.getService().equals(getService())
                && (getAddress() == null || getAddress().length() == 0 || getAddress().equals(Constants.ANY_VALUE) || getAddress().equals(Constants.ANYHOST_VALUE) || getAddress().equals(provider.getAddress()))
                && (getApplication() == null || getApplication().length() == 0 || getApplication().equals(Constants.ANY_VALUE) || getApplication().equals(provider.getApplication()));
    }
```

### SizeReplaceableByIsEmpty
`getApplication().length() == 0` can be replaced with 'getApplication().isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/Override.java`
#### Snippet
```java
                && provider.getService().equals(getService())
                && (getAddress() == null || getAddress().length() == 0 || getAddress().equals(Constants.ANY_VALUE) || getAddress().equals(Constants.ANYHOST_VALUE) || getAddress().equals(provider.getAddress()))
                && (getApplication() == null || getApplication().length() == 0 || getApplication().equals(Constants.ANY_VALUE) || getApplication().equals(provider.getApplication()));
    }

```

### SizeReplaceableByIsEmpty
`getAddress().length() == 0` can be replaced with 'getAddress().isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/Override.java`
#### Snippet
```java

    public boolean isDefault() {
        return (getAddress() == null || getAddress().length() == 0 || Constants.ANY_VALUE.equals(getAddress()) || Constants.ANYHOST_VALUE.equals(getAddress()))
                && (getApplication() == null || getApplication().length() == 0 || Constants.ANY_VALUE.equals(getApplication()));
    }
```

### SizeReplaceableByIsEmpty
`getApplication().length() == 0` can be replaced with 'getApplication().isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/Override.java`
#### Snippet
```java
    public boolean isDefault() {
        return (getAddress() == null || getAddress().length() == 0 || Constants.ANY_VALUE.equals(getAddress()) || Constants.ANYHOST_VALUE.equals(getAddress()))
                && (getApplication() == null || getApplication().length() == 0 || Constants.ANY_VALUE.equals(getApplication()));
    }

```

### SizeReplaceableByIsEmpty
`userInformation.length() > 0` can be replaced with '!userInformation.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/metadata/impl/ZookeeperMetaDataCollector.java`
#### Snippet
```java
                .retryPolicy(new ExponentialBackoffRetry(1000, 3));
        String userInformation = url.getUserInformation();
        if (userInformation != null && userInformation.length() > 0) {
            builder = builder.authorization("digest", userInformation.getBytes());
        }
```

### SizeReplaceableByIsEmpty
`query.length() == 0` can be replaced with 'query.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ParseUtils.java`
#### Snippet
```java
     */
    public static String replaceParameter(String query, String key, String value) {
        if (query == null || query.length() == 0) {
            return key + "=" + value;
        }
```

### SizeReplaceableByIsEmpty
`pattern.length() == 0` can be replaced with 'pattern.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ParseUtils.java`
#### Snippet
```java
        if ("*".equals(pattern))
            return true;
        if ((pattern == null || pattern.length() == 0)
                && (value == null || value.length() == 0))
            return true;
```

### SizeReplaceableByIsEmpty
`value.length() == 0` can be replaced with 'value.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ParseUtils.java`
#### Snippet
```java
            return true;
        if ((pattern == null || pattern.length() == 0)
                && (value == null || value.length() == 0))
            return true;
        if ((pattern == null || pattern.length() == 0)
```

### SizeReplaceableByIsEmpty
`pattern.length() == 0` can be replaced with 'pattern.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ParseUtils.java`
#### Snippet
```java
                && (value == null || value.length() == 0))
            return true;
        if ((pattern == null || pattern.length() == 0)
                || (value == null || value.length() == 0))
            return false;
```

### SizeReplaceableByIsEmpty
`value.length() == 0` can be replaced with 'value.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ParseUtils.java`
#### Snippet
```java
            return true;
        if ((pattern == null || pattern.length() == 0)
                || (value == null || value.length() == 0))
            return false;

```

### SizeReplaceableByIsEmpty
`expression.length() == 0` can be replaced with 'expression.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ParseUtils.java`
#### Snippet
```java
    // FIXME Is it reasonable to throw an IllegalStateException??
    public static String interpolate(String expression, Map<String, String> params) {
        if (expression == null || expression.length() == 0) {
            throw new IllegalArgumentException("glob pattern is empty!");
        }
```

### SizeReplaceableByIsEmpty
`separator.length() == 0` can be replaced with 'separator.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ParseUtils.java`
#### Snippet
```java
            String separator = matcher.group(1);
            String content = matcher.group(2);
            if (separator == null || separator.length() == 0
                    || "&".equals(separator)) {
                if (key != null)
```

### SizeReplaceableByIsEmpty
`input.length() == 0` can be replaced with 'input.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/CoderUtil.java`
#### Snippet
```java

    public static String MD5_32bit(String input) {
        if (input == null || input.length() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`td.getProperties().size() == 0` can be replaced with 'td.getProperties().isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ServiceTestUtil.java`
#### Snippet
```java

    private static void generateEnclosedType(Map<String, Object> holder, String key, ServiceDefinition sd, TypeDefinition td) {
        if (td.getProperties() == null || td.getProperties().size() == 0 || isPrimitiveType(td)) {
            holder.put(key, generateType(sd, td));
        } else {
```

### SizeReplaceableByIsEmpty
`td.getProperties().size() == 0` can be replaced with 'td.getProperties().isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ServiceTestV3Util.java`
#### Snippet
```java
        } else {
            TypeDefinition td = findTypeDefinition(sd, type);
            if (td.getProperties() == null || td.getProperties().size() == 0) {
                holder.put(key, generateType(sd, td));
            } else {
```

### SizeReplaceableByIsEmpty
`configs.size() > 0` can be replaced with '!configs.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/OverrideServiceImpl.java`
#### Snippet
```java
            OverrideDTO overrideDTO = YamlParser.loadObject(config, OverrideDTO.class);
            List<OverrideConfig> configs = overrideDTO.getConfigs();
            if (configs != null && configs.size() > 0) {
                for (OverrideConfig overrideConfig : configs) {
                    if (Constants.BALANCING.equals(overrideConfig.getType())) {
```

### SizeReplaceableByIsEmpty
`configs.size() > 0` can be replaced with '!configs.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/OverrideServiceImpl.java`
#### Snippet
```java
            OverrideDTO overrideDTO = YamlParser.loadObject(config, OverrideDTO.class);
            List<OverrideConfig> configs = overrideDTO.getConfigs();
            if (configs != null && configs.size() > 0) {
                for (OverrideConfig overrideConfig : configs) {
                    if (Constants.WEIGHT.equals(overrideConfig.getType())) {
```

### SizeReplaceableByIsEmpty
`apps.size() > 0` can be replaced with '!apps.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/OverrideServiceImpl.java`
#### Snippet
```java
            List<String> addresses = config.getAddresses();
            for (String address : addresses) {
                if (apps != null && apps.size() > 0) {
                    for (String app : apps) {
                        Override override = new Override();
```

### SizeReplaceableByIsEmpty
`configs.size() == 0` can be replaced with 'configs.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/OverrideServiceImpl.java`
#### Snippet
```java
                    }
                }
                if (configs.size() == 0) {
                    dynamicConfiguration.deleteConfig(path);
                } else {
```

### SizeReplaceableByIsEmpty
`configs.size() == 0` can be replaced with 'configs.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/OverrideServiceImpl.java`
#### Snippet
```java
                    }
                }
                if (configs.size() == 0) {
                    dynamicConfiguration.deleteConfig(path);
                } else {
```

### SizeReplaceableByIsEmpty
`overrideDTO.getConfigs().size() > 0` can be replaced with '!overrideDTO.getConfigs().isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/OverrideServiceImpl.java`
#### Snippet
```java
        DynamicConfigDTO old = OverrideUtils.createFromOverride(overrideDTO);
        List<OverrideConfig> newConfigs = new ArrayList<>();
        if (overrideDTO.getConfigs() != null && overrideDTO.getConfigs().size() > 0) {
            for (OverrideConfig overrideConfig : overrideDTO.getConfigs()) {
                if (Constants.CONFIGS.contains(overrideConfig.getType())) {
```

### SizeReplaceableByIsEmpty
`newConfigs.size() == 0` can be replaced with 'newConfigs.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/OverrideServiceImpl.java`
#### Snippet
```java
                }
            }
            if (newConfigs.size() == 0) {
                dynamicConfiguration.deleteConfig(path);
            } else {
```

### SizeReplaceableByIsEmpty
`thenRule.trim().length() == 0` can be replaced with 'thenRule.trim().isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
            throw new ParseException("Illegal route rule without when express", 0);
    	}*/
        if (thenRule == null || thenRule.trim().length() == 0) {
            throw new ParseException("Illegal route rule without then express", 0);
        }
```

### SizeReplaceableByIsEmpty
`separator.length() == 0` can be replaced with 'separator.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
            String content = matcher.group(2);
            // The expression starts
            if (separator == null || separator.length() == 0) {
                pair = new MatchPair();
                condition.put(content, pair);
```

### SizeReplaceableByIsEmpty
`values.size() == 0` can be replaced with 'values.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
            // The Value part of KV has multiple values, separated by ','
            else if (",".equals(separator)) { // separated by ','
                if (values == null || values.size() == 0)
                    throw new ParseException("Illegal route rule \""
                            + rule + "\", The error char '" + separator
```

### SizeReplaceableByIsEmpty
`whiteList.size() > 0` can be replaced with '!whiteList.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
        Set<String> blackList = accessDTO.getBlacklist();
        List<String> conditions = new ArrayList<>();
        if (whiteList != null && whiteList.size() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("host != ");
```

### SizeReplaceableByIsEmpty
`blackList.size() > 0` can be replaced with '!blackList.isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
            conditions.add(sb.toString());
        }
        if (blackList != null && blackList.size() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("host = ");
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ConvertUtil.java`
#### Snippet
```java
        }
        // id format: "${class}:${version}:${group}"
        return new StringBuilder(baseDTO.getService()).append(COLON).append(null2EmptyString(baseDTO.getServiceVersion()))
                .append(COLON).append(null2EmptyString(baseDTO.getServiceGroup())).toString();
    }
```

## RuleId[ruleID=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `b & flag`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/interceptor/AuthInterceptor.java`
#### Snippet
```java
            InterceptorAuthentication interceptorAuthentication = iterator.next();
            boolean b = interceptorAuthentication.authentication(request, response, handler);
            flag = b & flag;
            if (!flag) {
                break;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `b & flag`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/UserController.java`
#### Snippet
```java
            LoginAuthentication loginAuthentication = iterator.next();
            boolean b = loginAuthentication.authentication(httpServletRequest, userName, password);
            flag = b & flag;
            if (!flag) {
                break;
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/MetricsCollectController.java`
#### Snippet
```java
    }

    protected void addMetricsConfigToMap(Map<String, String> configMap, String ip) {
        List<Provider> providers = providerService.findByAddress(ip);
        if (providers.size() > 0) {
```

### BoundedWildcard
Can generalize to `? super String`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/MetricsCollectController.java`
#### Snippet
```java
    }

    protected void addMetricsConfigToMap(Map<String, String> configMap, String ip) {
        List<Provider> providers = providerService.findByAddress(ip);
        if (providers.size() > 0) {
```

### BoundedWildcard
Can generalize to `? extends MethodDefinition`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ConvertUtil.java`
#### Snippet
```java
    }

    public static Map methodList2Map(List<MethodDefinition> methods) {
        Map<String, MethodDefinition> res = new HashMap<>();
        for (int i = 0; i < methods.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends Provider`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/ProviderServiceImpl.java`
#### Snippet
```java
     * @return ServiceDTO list of front page
     */
    public Set<ServiceDTO> convertProviders2DTO(List<Provider> providers) {
        Set<ServiceDTO> result = new TreeSet<>();
        Map<String, List<Provider>> providerMap = providers.stream().collect(Collectors.groupingBy(Provider::getService));
```

### BoundedWildcard
Can generalize to `? extends ServiceInstancesChangedListener.ProtocolServiceKeyWithUrls`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/mapping/AdminServiceInstancesChangedListener.java`
#### Snippet
```java
    }

    private List<URL> extractUrls(List<ServiceInstancesChangedListener.ProtocolServiceKeyWithUrls> keyUrls) {
        return keyUrls.stream()
                .flatMap((protocolServiceKeyWithUrls) -> protocolServiceKeyWithUrls.getUrls().stream())
```

### BoundedWildcard
Can generalize to `? super String`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ServiceTestUtil.java`
#### Snippet
```java
    }

    private static void generateEnclosedType(Map<String, Object> holder, String key, ServiceDefinition sd, TypeDefinition td) {
        if (td.getProperties() == null || td.getProperties().size() == 0 || isPrimitiveType(td)) {
            holder.put(key, generateType(sd, td));
```

### BoundedWildcard
Can generalize to `? extends InstanceAddressURL`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/InstanceRegistryQueryHelper.java`
#### Snippet
```java
    }

    private List<Provider> urlsToProviderList(List<InstanceAddressURL> urls) {
        List<Provider> providers = Lists.newArrayList();
        urls.stream().distinct().forEach(url -> {
```

### BoundedWildcard
Can generalize to `? super String`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ServiceTestV3Util.java`
#### Snippet
```java
    }

    private static void generateEnclosedType(Map<String, Object> holder, String key, ServiceDefinition sd, String type) {
        if (isPrimitiveType(type)) {
            holder.put(key, generateType(sd, type));
```

### BoundedWildcard
Can generalize to `? extends CallDubboServiceRequestInterfaceParam`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/ApiDocsController.java`
#### Snippet
```java
    @ApiOperation(value = "request dubbo api", notes = "request dubbo api", httpMethod = "POST", produces = "application/json")
    @PostMapping("/requestDubbo")
    public String callDubboService(CallDubboServiceRequest dubboCfg, @RequestBody List<CallDubboServiceRequestInterfaceParam> methodparams){
        String[] paramTypes = null;
        Object[] paramValues = null;
```

### BoundedWildcard
Can generalize to `? super String`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/SyncUtils.java`
#### Snippet
```java

    // Map<Long, URL>
    static void filterFromUrls(Map<String, URL> from, Map<String, URL> to, Map<String, String> filter) {
        if (from == null || from.isEmpty()) return;

```

### BoundedWildcard
Can generalize to `? super URL`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/SyncUtils.java`
#### Snippet
```java

    // Map<Long, URL>
    static void filterFromUrls(Map<String, URL> from, Map<String, URL> to, Map<String, String> filter) {
        if (from == null || from.isEmpty()) return;

```

### BoundedWildcard
Can generalize to `? extends URL`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/SyncUtils.java`
#### Snippet
```java
    public static final String ID_FILTER_KEY = ".id";

    public static Provider url2Provider(Pair<String, URL> pair) {
        if (pair == null) {
            return null;
```

### BoundedWildcard
Can generalize to `? extends URL`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/SyncUtils.java`
#### Snippet
```java
    }

    public static Consumer url2Consumer(Pair<String, URL> pair) {
        if (pair == null) {
            return null;
```

### BoundedWildcard
Can generalize to `? extends MatchPair`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
     * @return RouteUtils after replacement
     */
    public static RouteUtils copyWithReplace(RouteUtils copy, Map<String, MatchPair> whenCondition, Map<String, MatchPair> thenCondition) {
        if (null == copy) {
            throw new NullPointerException("Argument copy is null!");
```

### BoundedWildcard
Can generalize to `? extends MatchPair`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
     * @return RouteUtils after replacement
     */
    public static RouteUtils copyWithReplace(RouteUtils copy, Map<String, MatchPair> whenCondition, Map<String, MatchPair> thenCondition) {
        if (null == copy) {
            throw new NullPointerException("Argument copy is null!");
```

### BoundedWildcard
Can generalize to `? extends MatchPair`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
     */
    public static boolean matchCondition(Map<String, String> sample,
                                         Map<String, MatchPair> condition) {
        for (Map.Entry<String, String> entry : sample.entrySet()) {
            String key = entry.getKey();
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/metadata/impl/ZookeeperMetaDataCollector.java`
#### Snippet
```java
    private URL url;
    private String root;
    private final static String DEFAULT_ROOT = "dubbo";

    @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/mapping/impl/ZookeeperServiceMapping.java`
#### Snippet
```java
    private ZookeeperClient zkClient;

    private final static String MAPPING_PATH = Constants.PATH_SEPARATOR + Constants.DEFAULT_ROOT + Constants.PATH_SEPARATOR + Constants.DEFAULT_MAPPING_GROUP;

    private final Set<MappingListener> listeners = new ConcurrentHashSet<>();
```

### MissortedModifiers
Missorted modifiers `final static`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/metadata/impl/RedisMetaDataCollector.java`
#### Snippet
```java
public class RedisMetaDataCollector implements MetaDataCollector {

    private final static Logger logger = LoggerFactory.getLogger(RedisMetaDataCollector.class);
    private final static String REDIS_DATABASE_KEY = "database";
    private URL url;
```

### MissortedModifiers
Missorted modifiers `final static`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/metadata/impl/RedisMetaDataCollector.java`
#### Snippet
```java

    private final static Logger logger = LoggerFactory.getLogger(RedisMetaDataCollector.class);
    private final static String REDIS_DATABASE_KEY = "database";
    private URL url;
    private JedisPool pool;
```

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `matches` accessed in synchronized context
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
            synchronized (this) {
                if (freezed) return;
                matches = Collections.unmodifiableSet(matches);
                unmatches = Collections.unmodifiableSet(unmatches);
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `matches` accessed in synchronized context
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
            synchronized (this) {
                if (freezed) return;
                matches = Collections.unmodifiableSet(matches);
                unmatches = Collections.unmodifiableSet(unmatches);
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `unmatches` accessed in synchronized context
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
                if (freezed) return;
                matches = Collections.unmodifiableSet(matches);
                unmatches = Collections.unmodifiableSet(unmatches);
            }
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `unmatches` accessed in synchronized context
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
                if (freezed) return;
                matches = Collections.unmodifiableSet(matches);
                unmatches = Collections.unmodifiableSet(unmatches);
            }
        }
```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/store/mesh/virtualservice/match/StringMatch.java`
#### Snippet
```java
            }
        } else if (stringMatch.getEmpty() != null) {
            return input == null || "".equals(input);
        } else if (stringMatch.getNoempty() != null) {
            return input != null && input.length() > 0;
```

## RuleId[ruleID=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/MetricsCollectController.java`
#### Snippet
```java

//         default value
        if (configMap.size() <= 0) {
            configMap.put("20880", "dubbo");
        }
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dubbo-admin-test/src/main/java/org/apache/dubbo/admin/impl/provider/AnnotatedGreetingService.java`
#### Snippet
```java
public class AnnotatedGreetingService implements GreetingService {
    public String sayHello(String name) {
        System.out.println("greeting service received: " + name);
        return "hello, " + name;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dubbo-admin-test/src/main/java/org/apache/dubbo/admin/ConsumerBootstrap.java`
#### Snippet
```java
        server.start();

        System.out.println("dubbo service init finish");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dubbo-admin-test/src/main/java/org/apache/dubbo/admin/ProviderBootstrap.java`
#### Snippet
```java
        @PostConstruct
        public void init() throws Exception {
            System.out.println("Using address:" + this.configCenterAddress);

            RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dubbo-admin-test/src/main/java/org/apache/dubbo/admin/ProviderBootstrap.java`
#### Snippet
```java
            client.start();

            System.out.println("Checking config");
            if (client.checkExists().forPath("/dubbo/config/dubbo/dubbo.properties") == null) {
                String configAsString = String
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dubbo-admin-test/src/main/java/org/apache/dubbo/admin/ProviderBootstrap.java`
#### Snippet
```java
                client.create().creatingParentContainersIfNeeded()
                        .forPath("/dubbo/config/dubbo/dubbo.properties", configAsString.getBytes());
                System.out.println("Creating config");
            } else {
                byte[] bytes = client.getData().forPath("/dubbo/config/dubbo/dubbo.properties");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dubbo-admin-test/src/main/java/org/apache/dubbo/admin/ProviderBootstrap.java`
#### Snippet
```java
            } else {
                byte[] bytes = client.getData().forPath("/dubbo/config/dubbo/dubbo.properties");
                System.out.println("Reading config: " + new String(bytes));
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dubbo-admin-test/src/main/java/org/apache/dubbo/admin/ProviderBootstrap.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'v != null' covered by subsequent condition 'v instanceof String'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/ApiDocsController.java`
#### Snippet
```java
                Map<String, Object> tempMap = (Map<String, Object>) paramValue;
                tempMap.forEach((k, v) -> {
                    if (v != null && v instanceof String && StringUtils.isBlank((String) v)) {
                        tempMap.put(k, null);
                    } else {
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/ServiceController.java`
#### Snippet
```java
    @RequestMapping(value = "/service/{service}", method = RequestMethod.GET)
    public ServiceDetailDTO serviceDetail(@PathVariable String service, @PathVariable String env) {
        service = service.replace(Constants.ANY_VALUE, Constants.PATH_SEPARATOR);
        String group = Tool.getGroup(service);
        String version = Tool.getVersion(service);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/RouteServiceImpl.java`
#### Snippet
```java
        condition = condition.trim();
        if (condition.contains("=>")) {
            String[] array = condition.split("=>", 2);
            String consumer = array[0].trim();
            String provider = array[1].trim();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/RouteServiceImpl.java`
#### Snippet
```java

    private String getPath(String key, String type) {
        key = key.replace("/", "*");
        if (type.equals(Constants.CONDITION_ROUTE)) {
            return key + Constants.CONDITION_RULE_SUFFIX;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/RouteServiceImpl.java`
#### Snippet
```java
                ruleDTO.setScope(Constants.APPLICATION);
            } else {
                ruleDTO.setKey(accessDTO.getService().replace("/", "*"));
                ruleDTO.setScope(Constants.SERVICE);
            }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/RouteServiceImpl.java`
#### Snippet
```java
            String service = conditionRouteDTO.getService();
            if (org.apache.commons.lang3.StringUtils.isNotBlank(service)) {
                conditionRouteDTO.setService(service.replace("*", "/"));
            }
            String[] detachResult = ConvertUtil.detachId(id);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/ProviderServiceImpl.java`
#### Snippet
```java
            }
            // replace dot symbol and asterisk symbol to java-based regex pattern
            filter = filter.toLowerCase().replace(Constants.PUNCTUATION_POINT, Constants.PUNCTUATION_SEPARATOR_POINT);
            // filter start with [* 、? 、+] will triggering PatternSyntaxException
            if (filter.startsWith(Constants.ANY_VALUE)
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/Route.java`
#### Snippet
```java
    public void setRule(String rule) {
        this.rule = rule.trim();
        String[] rules = rule.split("=>");
        if (rules.length != 2) {
            if (rule.endsWith("=>")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ParseUtils.java`
#### Snippet
```java
        Pattern pattern = REPLACE_PARAMETER_PATTERNS.get(key);
        if (pattern == null) {
            pattern = Pattern.compile(key.replaceAll("([^(_0-9A-Za-z)])", "\\\\$0") + "=[^&]+");
        }
        Matcher matcher = pattern.matcher(query);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ParseUtils.java`
#### Snippet
```java
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, (key + "=" + value).replace("$", "\\$"));
        }
        matcher.appendTail(sb);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/TagRoutesController.java`
#### Snippet
```java
    @RequestMapping(value = "/enable/{id}", method = RequestMethod.PUT)
    public boolean enableRoute(@PathVariable String id, @PathVariable String env) {
        id = id.replace(Constants.ANY_VALUE, Constants.PATH_SEPARATOR);
        routeService.enableTagRoute(id);
        return true;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/TagRoutesController.java`
#### Snippet
```java
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TagRouteDTO detailRoute(@PathVariable String id, @PathVariable String env) {
        id = id.replace(Constants.ANY_VALUE, Constants.PATH_SEPARATOR);
        TagRouteDTO tagRoute = routeService.findTagRoute(id);
        if (tagRoute == null) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/TagRoutesController.java`
#### Snippet
```java
    @RequestMapping(value = "/disable/{id}", method = RequestMethod.PUT)
    public boolean disableRoute(@PathVariable String id, @PathVariable String env) {
        id = id.replace(Constants.ANY_VALUE, Constants.PATH_SEPARATOR);
        routeService.disableTagRoute(id);
        return true;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/TagRoutesController.java`
#### Snippet
```java
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public boolean deleteRoute(@PathVariable String id, @PathVariable String env) {
        id = id.replace(Constants.ANY_VALUE, Constants.PATH_SEPARATOR);
        routeService.deleteTagRoute(id);
        return true;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/TagRoutesController.java`
#### Snippet
```java
    public boolean updateRule(@PathVariable String id, @RequestBody TagRouteDTO routeDTO, @PathVariable String env) {

        id = id.replace(Constants.ANY_VALUE, Constants.PATH_SEPARATOR);
        String app = routeDTO.getApplication();
        if (providerService.findVersionInApplication(app).equals("2.6")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/MeshRouteController.java`
#### Snippet
```java
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public MeshRouteDTO detailRoute(@PathVariable String id, @PathVariable String env) {
        id = id.replace(Constants.ANY_VALUE, Constants.PATH_SEPARATOR);
        MeshRouteDTO meshRoute = meshRouteService.findMeshRoute(id);
        if (meshRoute == null) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/MeshRouteController.java`
#### Snippet
```java
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public boolean updateRule(@PathVariable String id, @RequestBody MeshRouteDTO meshRoute, @PathVariable String env) {
        id = id.replace(Constants.ANY_VALUE, Constants.PATH_SEPARATOR);
        if (meshRouteService.findMeshRoute(id) == null) {
            throw new ResourceNotFoundException("can not find mesh route, Id: " + id);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/MeshRouteController.java`
#### Snippet
```java
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public boolean deleteRoute(@PathVariable String id, @PathVariable String env) {
        id = id.replace(Constants.ANY_VALUE, Constants.PATH_SEPARATOR);
        return meshRouteService.deleteMeshRule(id);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-admin-test/src/main/java/org/apache/dubbo/admin/ProviderBootstrap.java`
#### Snippet
```java

            CuratorFramework client = CuratorFrameworkFactory
                    .newClient(this.configCenterAddress.replace("zookeeper://", ""), 5000, 3000, retryPolicy);

            client.start();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/OverrideServiceImpl.java`
#### Snippet
```java

    private String getPath(String key) {
        key = key.replace("/", "*");
        return key + Constants.CONFIGURATOR_RULE_SUFFIX;
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
                existRule.setScope(Constants.APPLICATION);
            } else {
                existRule.setKey(conditionRoute.getService().replace("/", "*"));
                existRule.setScope(Constants.SERVICE);
            }
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.dubbo.admin.common.util` is unnecessary and can be removed
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ConvertUtil.java`
#### Snippet
```java
    public static String getScopeFromDTO(BaseDTO baseDTO) {
        if (StringUtils.isNotEmpty(baseDTO.getApplication())) {
            return org.apache.dubbo.admin.common.util.Constants.APPLICATION;
        } else {
            return org.apache.dubbo.admin.common.util.Constants.SERVICE;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.dubbo.admin.common.util` is unnecessary and can be removed
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ConvertUtil.java`
#### Snippet
```java
            return org.apache.dubbo.admin.common.util.Constants.APPLICATION;
        } else {
            return org.apache.dubbo.admin.common.util.Constants.SERVICE;
        }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.dubbo.common.config.configcenter` is unnecessary and can be removed
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/config/impl/MultiDynamicConfiguration.java`
#### Snippet
```java

/**
 * Use {@link org.apache.dubbo.common.config.configcenter.DynamicConfiguration} adaptation Configuration Center
 */
public class MultiDynamicConfiguration implements GovernanceConfiguration {
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
        sb.append(" => ");
        contidionToString(sb, thenCondition);
        return tostring = sb.toString();
    }

```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `Entity()` of an abstract class should not be declared 'public'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/Entity.java`
#### Snippet
```java
    }

    public Entity(Long id) {
        this.id = id;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `Entity()` of an abstract class should not be declared 'public'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/Entity.java`
#### Snippet
```java
    private boolean miss;

    public Entity() {
    }

```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `REPLACE_PARAMETER_PATTERNS` are queried, but never updated
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ParseUtils.java`
#### Snippet
```java

    private static final ConcurrentMap<String, Pattern>
        REPLACE_PARAMETER_PATTERNS = new ConcurrentHashMap<String, Pattern>();
    public static String METHOD_SPLIT = ",";
    private static Pattern VARIABLE_PATTERN = Pattern.compile(
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `unmatches` is accessed in both synchronized and unsynchronized contexts
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
    public static class MatchPair {
        Set<String> matches = new HashSet<String>();
        Set<String> unmatches = new HashSet<String>();
        private volatile boolean freezed = false;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `matches` is accessed in both synchronized and unsynchronized contexts
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java

    public static class MatchPair {
        Set<String> matches = new HashSet<String>();
        Set<String> unmatches = new HashSet<String>();
        private volatile boolean freezed = false;
```

## RuleId[ruleID=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/RegistryServerSync.java`
#### Snippet
```java
                }
                Map<String, Map<String, URL>> services = categories.get(category);
                if (services == null) {
                    services = new HashMap<>();
                    categories.put(category, services);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/RegistryServerSync.java`
#### Snippet
```java
                String service = BaseServiceMetadata.buildServiceKey(getServiceInterface(url), group, version);
                Map<String, URL> ids = services.get(service);
                if (ids == null) {
                    ids = new HashMap<>();
                    services.put(service, ids);
```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/metadata/impl/NacosMetaDataCollector.java`
#### Snippet
```java
        String namespace = url.getParameter(NAMESPACE);
        if (StringUtils.isNotBlank(namespace)) {
            properties.put(NAMESPACE, namespace);
        }
    }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/metadata/impl/NacosMetaDataCollector.java`
#### Snippet
```java
                url.getPort() // Port
                ;
        properties.put(SERVER_ADDR, serverAddr);
    }

```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/dto/docs/CallDubboServiceRequest.java`
#### Snippet
```java

    @ApiParam(value = "Whether to call asynchronously, false by default")
    private boolean async = false;

    @ApiParam(value = "The version of API")
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
        Set<String> matches = new HashSet<String>();
        Set<String> unmatches = new HashSet<String>();
        private volatile boolean freezed = false;

        public MatchPair() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
    final Map<String, MatchPair> whenCondition;
    final Map<String, MatchPair> thenCondition;
    private volatile String tostring = null;

    // FIXME
```

## RuleId[ruleID=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/ServiceTestController.java`
#### Snippet
```java
        try {
            return genericService.invoke(serviceTestDTO.getService(), serviceTestDTO.getMethod(), serviceTestDTO.getParameterTypes(), serviceTestDTO.getParams());
        } catch (Exception e) {
            throw e;
        }
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `service`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/Tool.java`
#### Snippet
```java
            int i = service.indexOf('/');
            if (i >= 0) {
                service = service.substring(i + 1);
            }
            i = service.lastIndexOf(':');
```

### AssignmentToMethodParameter
Assignment to method parameter `service`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/Tool.java`
#### Snippet
```java
            i = service.lastIndexOf(':');
            if (i >= 0) {
                service = service.substring(0, i);
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `service`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/ServiceController.java`
#### Snippet
```java
    @RequestMapping(value = "/service/{service}", method = RequestMethod.GET)
    public ServiceDetailDTO serviceDetail(@PathVariable String service, @PathVariable String env) {
        service = service.replace(Constants.ANY_VALUE, Constants.PATH_SEPARATOR);
        String group = Tool.getGroup(service);
        String version = Tool.getVersion(service);
```

### AssignmentToMethodParameter
Assignment to method parameter `condition`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/RouteServiceImpl.java`
#### Snippet
```java
        StringBuilder when = new StringBuilder();
        StringBuilder then = new StringBuilder();
        condition = condition.trim();
        if (condition.contains("=>")) {
            String[] array = condition.split("=>", 2);
```

### AssignmentToMethodParameter
Assignment to method parameter `key`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/RouteServiceImpl.java`
#### Snippet
```java

    private String getPath(String key, String type) {
        key = key.replace("/", "*");
        if (type.equals(Constants.CONDITION_ROUTE)) {
            return key + Constants.CONDITION_RULE_SUFFIX;
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ConvertUtil.java`
#### Snippet
```java
    public static String null2EmptyString(String str) {
        if (null == str) {
            str = StringUtils.EMPTY_STRING;
        }
        return str;
```

### AssignmentToMethodParameter
Assignment to method parameter `filter`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/ProviderServiceImpl.java`
#### Snippet
```java
            }
            // replace dot symbol and asterisk symbol to java-based regex pattern
            filter = filter.toLowerCase().replace(Constants.PUNCTUATION_POINT, Constants.PUNCTUATION_SEPARATOR_POINT);
            // filter start with [* 、? 、+] will triggering PatternSyntaxException
            if (filter.startsWith(Constants.ANY_VALUE)
```

### AssignmentToMethodParameter
Assignment to method parameter `filter`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/ProviderServiceImpl.java`
#### Snippet
```java
            if (filter.startsWith(Constants.ANY_VALUE)
                    || filter.startsWith(Constants.INTERROGATION_POINT) || filter.startsWith(Constants.PLUS_SIGNS)) {
                filter = Constants.PUNCTUATION_POINT + filter;
            }
            // search with no case insensitive
```

### AssignmentToMethodParameter
Assignment to method parameter `operator`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/Entity.java`
#### Snippet
```java
    public void setOperator(String operator) {
        if (operator != null && operator.length() > 200) {
            operator = operator.substring(0, 200);
        }
        this.operator = operator;
```

### AssignmentToMethodParameter
Assignment to method parameter `uri`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ParseUtils.java`
#### Snippet
```java
        if (StringUtils.isEmpty(name) || StringUtils.isEmpty(value)) return uri;
        if (uri.indexOf('?') != -1) {
            uri += "&" + name + "=" + value;
        } else {
            uri += "?" + name + "=" + value;
```

### AssignmentToMethodParameter
Assignment to method parameter `uri`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ParseUtils.java`
#### Snippet
```java
            uri += "&" + name + "=" + value;
        } else {
            uri += "?" + name + "=" + value;
        }
        return uri;
```

### AssignmentToMethodParameter
Assignment to method parameter `keyPrefix`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ParseUtils.java`
#### Snippet
```java
            return new HashMap<String, String>();
        if (keyPrefix == null)
            keyPrefix = "";

        Matcher matcher = QUERY_PATTERN.matcher(query);
```

### AssignmentToMethodParameter
Assignment to method parameter `id`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/TagRoutesController.java`
#### Snippet
```java
    @RequestMapping(value = "/enable/{id}", method = RequestMethod.PUT)
    public boolean enableRoute(@PathVariable String id, @PathVariable String env) {
        id = id.replace(Constants.ANY_VALUE, Constants.PATH_SEPARATOR);
        routeService.enableTagRoute(id);
        return true;
```

### AssignmentToMethodParameter
Assignment to method parameter `id`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/TagRoutesController.java`
#### Snippet
```java
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TagRouteDTO detailRoute(@PathVariable String id, @PathVariable String env) {
        id = id.replace(Constants.ANY_VALUE, Constants.PATH_SEPARATOR);
        TagRouteDTO tagRoute = routeService.findTagRoute(id);
        if (tagRoute == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `id`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/TagRoutesController.java`
#### Snippet
```java
    @RequestMapping(value = "/disable/{id}", method = RequestMethod.PUT)
    public boolean disableRoute(@PathVariable String id, @PathVariable String env) {
        id = id.replace(Constants.ANY_VALUE, Constants.PATH_SEPARATOR);
        routeService.disableTagRoute(id);
        return true;
```

### AssignmentToMethodParameter
Assignment to method parameter `id`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/TagRoutesController.java`
#### Snippet
```java
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public boolean deleteRoute(@PathVariable String id, @PathVariable String env) {
        id = id.replace(Constants.ANY_VALUE, Constants.PATH_SEPARATOR);
        routeService.deleteTagRoute(id);
        return true;
```

### AssignmentToMethodParameter
Assignment to method parameter `id`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/TagRoutesController.java`
#### Snippet
```java
    public boolean updateRule(@PathVariable String id, @RequestBody TagRouteDTO routeDTO, @PathVariable String env) {

        id = id.replace(Constants.ANY_VALUE, Constants.PATH_SEPARATOR);
        String app = routeDTO.getApplication();
        if (providerService.findVersionInApplication(app).equals("2.6")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `id`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/MeshRouteController.java`
#### Snippet
```java
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public MeshRouteDTO detailRoute(@PathVariable String id, @PathVariable String env) {
        id = id.replace(Constants.ANY_VALUE, Constants.PATH_SEPARATOR);
        MeshRouteDTO meshRoute = meshRouteService.findMeshRoute(id);
        if (meshRoute == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `id`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/MeshRouteController.java`
#### Snippet
```java
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public boolean updateRule(@PathVariable String id, @RequestBody MeshRouteDTO meshRoute, @PathVariable String env) {
        id = id.replace(Constants.ANY_VALUE, Constants.PATH_SEPARATOR);
        if (meshRouteService.findMeshRoute(id) == null) {
            throw new ResourceNotFoundException("can not find mesh route, Id: " + id);
```

### AssignmentToMethodParameter
Assignment to method parameter `id`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/MeshRouteController.java`
#### Snippet
```java
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public boolean deleteRoute(@PathVariable String id, @PathVariable String env) {
        id = id.replace(Constants.ANY_VALUE, Constants.PATH_SEPARATOR);
        return meshRouteService.deleteMeshRule(id);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `key`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/OverrideServiceImpl.java`
#### Snippet
```java

    private String getPath(String key) {
        key = key.replace("/", "*");
        return key + Constants.CONFIGURATOR_RULE_SUFFIX;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `existRule`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
    public static RoutingRule insertConditionRule(RoutingRule existRule, ConditionRouteDTO conditionRoute) {
        if (existRule == null) {
            existRule = new RoutingRule();
            if (StringUtils.isNotEmpty(conditionRoute.getApplication())) {
                existRule.setKey(conditionRoute.getApplication());
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-01-13-13-31-24.483.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/RegistryCache.java`
#### Snippet
```java

    default V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/Tool.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/Tool.java`
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
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/metadata/impl/NoOpMetadataCollector.java`
#### Snippet
```java
    @Override
    public String getConsumerMetaData(MetadataIdentifier key) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/metadata/impl/NoOpMetadataCollector.java`
#### Snippet
```java
    @Override
    public String getProviderMetaData(MetadataIdentifier key) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/metadata/impl/NoOpMetadataCollector.java`
#### Snippet
```java
    @Override
    public URL getUrl() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/RouteServiceImpl.java`
#### Snippet
```java
            return RouteUtils.convertTagroutetoDisplay(tagRoute);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/RouteServiceImpl.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/RouteServiceImpl.java`
#### Snippet
```java
            ConditionRouteDTO conditionRouteDTO = RouteUtils.createConditionRouteFromRule(routingRule);
            if(null == conditionRouteDTO || CollectionUtils.isEmpty(conditionRouteDTO.getConditions())) {
                return null;
            }
            String service = conditionRouteDTO.getService();
```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/RouteServiceImpl.java`
#### Snippet
```java
            return conditionRouteDTO;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/OverrideUtils.java`
#### Snippet
```java
        }
        if (configs.size() == 0) {
            return null;
        }
        dynamicConfigDTO.setConfigs(configs);
```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/config/impl/MultiDynamicConfiguration.java`
#### Snippet
```java
    @Override
    public String getPath(String group, String key) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/config/impl/MultiDynamicConfiguration.java`
#### Snippet
```java
    @Override
    public String getPath(String key) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/utils/ApiDocsDubboGenericUtil.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/config/impl/NoOpConfiguration.java`
#### Snippet
```java
    @Override
    public String getConfig(String key) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/config/impl/NoOpConfiguration.java`
#### Snippet
```java
    @Override
    public String getPath(String key) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/config/impl/NoOpConfiguration.java`
#### Snippet
```java
    @Override
    public String getPath(String group, String key) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/config/impl/NoOpConfiguration.java`
#### Snippet
```java
    @Override
    public String getConfig(String group, String key) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/config/impl/NoOpConfiguration.java`
#### Snippet
```java
    @Override
    public URL getUrl() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/metadata/impl/ZookeeperMetaDataCollector.java`
#### Snippet
```java
            String path = getNodePath(identifier);
            if (client.checkExists().forPath(path) == null) {
                return null;
            }
            return new String(client.getData().forPath(path));
```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/metadata/impl/ZookeeperMetaDataCollector.java`
#### Snippet
```java
            logger.error(e.getMessage(), e);
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/CoderUtil.java`
#### Snippet
```java
    public static String MD5_32bit(String input) {
        if (input == null || input.length() == 0) {
            return null;
        }
        md.update(input.getBytes());
```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/CoderUtil.java`
#### Snippet
```java
        String hash = MD5_32bit(input);
        if (hash == null) {
            return null;
        }
        return hash.substring(8, 24);
```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/CoderUtil.java`
#### Snippet
```java
    public static String MD5_32bit(byte[] input) {
        if (input == null || input.length == 0) {
            return null;
        }
        md.update(input);
```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ServiceTestUtil.java`
#### Snippet
```java
            case "void":
            case "java.lang.Void":
                return null;
            case "java.lang.String":
                return "";
```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/UserController.java`
#### Snippet
```java
        }
        AuthInterceptor.loginFailResponse(response);
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/YamlParser.java`
#### Snippet
```java
        protected NodeTuple representJavaBeanProperty(Object javaBean, Property property, Object propertyValue, Tag customTag) {
            if (propertyValue == null) {
                return null;
            } else {
                return super.representJavaBeanProperty(javaBean, property, propertyValue, customTag);
```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/InstanceRegistryQueryHelper.java`
#### Snippet
```java
        ConcurrentMap<String, Map<String, List<InstanceAddressURL>>> appInterfaceMap = instanceRegistryCache.get(Constants.PROVIDERS_CATEGORY);
        if (appInterfaceMap == null || appInterfaceMap.get(application) == null) {
            return null;
        }
        Map<String, List<InstanceAddressURL>> urlsMap = appInterfaceMap.get(application);
```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/InstanceRegistryQueryHelper.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/metadata/impl/ConsulMetaDataCollector.java`
#### Snippet
```java
                    key.getUniqueKey(KeyTypeEnum.UNIQUE_KEY), e.getMessage()), e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/MeshRouteServiceImpl.java`
#### Snippet
```java
        String rule = dynamicConfiguration.getConfig(path);
        if (rule == null) {
            return null;
        }
        MeshRouteDTO meshRoute = new MeshRouteDTO();
```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/metadata/impl/NacosMetaDataCollector.java`
#### Snippet
```java
            logger.warn("Failed to get " + identifier + " from nacos, cause: " + e.getMessage(), e);
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ServiceTestV3Util.java`
#### Snippet
```java
            case "void":
            case "java.lang.Void":
                return null;
            case "java.lang.String":
                return "";
```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/ApiDocsController.java`
#### Snippet
```java
        if(null != paramValue) {
            if (paramValue instanceof String && StringUtils.isBlank((String) paramValue)) {
                return null;
            } else if (paramValue instanceof Map) {
                Map<String, Object> tempMap = (Map<String, Object>) paramValue;
```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/OverrideServiceImpl.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/OverrideServiceImpl.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/OverrideServiceImpl.java`
#### Snippet
```java
            return dynamicConfigDTO;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/SyncUtils.java`
#### Snippet
```java
    public static <SM extends Map<String, Map<String, URL>>> Pair<String, URL> filterFromCategory(Map<String, SM> urls, String category, String id) {
        SM services = urls.get(category);
        if (services == null) return null;

        for (Map.Entry<String, Map<String, URL>> e1 : services.entrySet()) {
```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/SyncUtils.java`
#### Snippet
```java
            if (u.containsKey(id)) return new Pair<>(id, u.get(id));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/SyncUtils.java`
#### Snippet
```java
    public static Provider url2Provider(Pair<String, URL> pair) {
        if (pair == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/SyncUtils.java`
#### Snippet
```java

        if (url == null)
            return null;

        Provider p = new Provider();
```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/SyncUtils.java`
#### Snippet
```java
    public static Consumer url2Consumer(Pair<String, URL> pair) {
        if (pair == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/SyncUtils.java`
#### Snippet
```java

        if (null == url)
            return null;

        Consumer c = new Consumer();
```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
    public static AccessDTO convertToAccessDTO(List<String> blackWhiteList, String scope, String key) {
        if (blackWhiteList == null) {
            return null;
        }
        AccessDTO accessDTO = new AccessDTO();
```

### ReturnNull
Return of `null`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
    public static List<String> convertToBlackWhiteList(AccessDTO accessDTO) {
        if (accessDTO == null) {
            return null;
        }

```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `page` is redundant
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/ServiceController.java`
#### Snippet
```java
                        .collect(Collectors.toList());

        final Page<ServiceDTO> page = new PageImpl<>(content, pageable, total);
        return page;
    }
```

### UnnecessaryLocalVariable
Local variable `res` is redundant
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/MetricsCollectController.java`
#### Snippet
```java
        MetrcisCollectServiceImpl metrcisCollectService = new MetrcisCollectServiceImpl();
        metrcisCollectService.setUrl(protocol + "://" + ip + ":" + port +"?scope=remote&cache=true");
        String res = metrcisCollectService.invoke(group).toString();
        return res;
    }
```

### UnnecessaryLocalVariable
Local variable `hash` is redundant
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/CoderUtil.java`
#### Snippet
```java
        md.update(input.getBytes());
        byte[] digest = md.digest();
        String hash = convertToString(digest);
        return hash;
    }
```

### UnnecessaryLocalVariable
Local variable `hash` is redundant
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/CoderUtil.java`
#### Snippet
```java
        md.update(input);
        byte[] digest = md.digest();
        String hash = convertToString(digest);
        return hash;
    }
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ServiceTestUtil.java`
#### Snippet
```java
        if (StringUtils.isEmpty(type)) {
            // if type is null return empty collection
            return new Object[] {};
        }
        return new Object[]{generateType(sd, type)};
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ServiceTestV3Util.java`
#### Snippet
```java
        if (StringUtils.isEmpty(type)) {
            // if type is null return empty collection
            return new Object[]{};
        }
        return new Object[]{generateType(sd, type)};
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/ApiDocsController.java`
#### Snippet
```java
        }
        if (null == paramTypes) {
            paramTypes = new String[0];
        }
        if (null == paramValues) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/ApiDocsController.java`
#### Snippet
```java
        }
        if (null == paramValues) {
            paramValues = new Object[0];
        }
        CompletableFuture<Object> future = ApiDocsDubboGenericUtil.invoke(dubboCfg.getRegistryCenterUrl(), dubboCfg.getInterfaceClassName(),
```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/mapping/AdminMappingListener.java`
#### Snippet
```java
            ServiceInstancesChangedListener serviceInstancesChangedListener = serviceListeners.get(serviceName);
            if (serviceInstancesChangedListener == null) {
                synchronized (this) {
                    serviceInstancesChangedListener = serviceListeners.get(serviceName);
                    if (serviceInstancesChangedListener == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
        void freeze() {
            if (freezed) return;
            synchronized (this) {
                if (freezed) return;
                matches = Collections.unmodifiableSet(matches);
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `result` initializer `null` is redundant
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/registry/metadata/impl/RedisMetaDataCollector.java`
#### Snippet
```java

    private String doGetMetaData(MetadataIdentifier identifier) {
        String result = null;
        if (url.getParameter(CLUSTER_KEY, false)) {
            try (JedisCluster jedisCluster = new JedisCluster(jedisClusterNodes, timeout, timeout, 2, password, new GenericObjectPoolConfig())) {
```

### UnusedAssignment
Variable `registry` initializer `null` is redundant
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/config/ConfigCenter.java`
#### Snippet
```java
    @DependsOn("governanceConfiguration")
    Registry getRegistry() {
        Registry registry = null;
        if (registryUrl == null) {
            if (StringUtils.isBlank(registryAddress)) {
```

### UnusedAssignment
Variable `overrideDTO` initializer `null` is redundant
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/OverrideServiceImpl.java`
#### Snippet
```java

    private OverrideDTO insertConfig(String config, OverrideConfig overrideConfig, String key, String scope, String configType) {
        OverrideDTO overrideDTO = null;
        if(config == null) {
            overrideDTO = new OverrideDTO();
```

## RuleId[ruleID=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
        }
        for (String condition : conditions) {
            result.add(condition);
        }
        return result;
```

## RuleId[ruleID=IndexOfReplaceableByContains]
### IndexOfReplaceableByContains
`query.indexOf(key + "=") == -1` can be replaced with '!query.contains(key + "=")'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/ParseUtils.java`
#### Snippet
```java
            return key + "=" + value;
        }
        if (query.indexOf(key + "=") == -1) {
            return query + "&" + key + "=" + value;
        }
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `flag` is always `true` when reached
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/interceptor/AuthInterceptor.java`
#### Snippet
```java
            InterceptorAuthentication interceptorAuthentication = iterator.next();
            boolean b = interceptorAuthentication.authentication(request, response, handler);
            flag = b & flag;
            if (!flag) {
                break;
```

### ConstantValue
Condition `stringURLMap == null` is always `false`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/ConsumerServiceImpl.java`
#### Snippet
```java
        filter.put(Constants.APPLICATION_KEY, application);
        Map<String, URL> stringURLMap = SyncUtils.filterFromCategory(getInterfaceRegistryCache(), filter);
        if (stringURLMap == null || stringURLMap.isEmpty()) {
            throw new ParamValidationException("there is no consumer for application: " + application);
        }
```

### ConstantValue
Condition `null == conditionRouteDTO` is always `false`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/RouteServiceImpl.java`
#### Snippet
```java
            RoutingRule routingRule = YamlParser.loadObject(config, RoutingRule.class);
            ConditionRouteDTO conditionRouteDTO = RouteUtils.createConditionRouteFromRule(routingRule);
            if(null == conditionRouteDTO || CollectionUtils.isEmpty(conditionRouteDTO.getConditions())) {
                return null;
            }
```

### ConstantValue
Condition `result != null` is always `true`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/service/impl/ProviderServiceImpl.java`
#### Snippet
```java
        String version = "2.6";
        Map<String, URL> result = findProviderUrlByAppandService(application, serviceName);
        if (result != null && result.size() > 0) {
            URL url = result.values().stream().findFirst().get();
            if (url.getParameter(Constants.SPECIFICATION_VERSION_KEY) != null) {
```

### ConstantValue
Value `matchRule` is always 'null'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/Route.java`
#### Snippet
```java
            this.matchRule = matchRule.trim();
        } else {
            this.matchRule = matchRule;
        }
    }
```

### ConstantValue
Value `filterRule` is always 'null'
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/model/domain/Route.java`
#### Snippet
```java
            this.filterRule = filterRule.trim();
        } else {
            this.filterRule = filterRule;
        }
    }
```

### ConstantValue
Condition `iterator != null` is always `true`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/controller/UserController.java`
#### Snippet
```java
        Iterator<LoginAuthentication> iterator = supportedExtensionInstances.iterator();
        boolean flag = true;
        if (iterator != null && !iterator.hasNext()) {
            if (StringUtils.isBlank(rootUserName) || (rootUserName.equals(userName) && rootUserPassword.equals(password))) {
                return jwtTokenUtil.generateToken(userName);
```

### ConstantValue
Condition `paramsString != null` is always `true`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/UrlUtils.java`
#### Snippet
```java
        StringBuilder paramsString = new StringBuilder();
        for (Entry<String, String[]> param : params.entrySet()) {
            if (paramsString != null) {
                paramsString.append("&");
            }
```

### ConstantValue
Condition `blackWhiteList != null` is always `true`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
            ConvertUtil.detachIdToService(key, accessDTO);
        }
        if (blackWhiteList != null) {
            for (String condition : blackWhiteList) {
                if (condition.contains("host != ")) {
```

### ConstantValue
Condition `conditionRoute == null` is always `false`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
        }

        return parse(conditionRoute == null ? null : conditionRoute.getMatchRule(), conditionRoute == null ? null : conditionRoute.getFilterRule());
    }

```

### ConstantValue
Condition `conditionRoute == null` is always `false`
in `dubbo-admin-server/src/main/java/org/apache/dubbo/admin/common/util/RouteUtils.java`
#### Snippet
```java
        }

        return parse(conditionRoute == null ? null : conditionRoute.getMatchRule(), conditionRoute == null ? null : conditionRoute.getFilterRule());
    }

```

