# hawkbit 
 
# Bad smells
I found 1018 bad smells with 43 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 416 | false |
| UNCHECKED_WARNING | 66 | false |
| DefaultAnnotationParam | 50 | false |
| TrivialIf | 39 | false |
| JavadocDeclaration | 33 | false |
| SpringBootApplicationProperties | 31 | false |
| FieldCanBeLocal | 29 | false |
| UnnecessaryModifier | 28 | true |
| DuplicatedCode | 25 | false |
| ArraysAsListWithZeroOrOneArgument | 23 | false |
| FieldMayBeFinal | 21 | false |
| DataFlowIssue | 19 | false |
| UnnecessarySemicolon | 19 | false |
| StringBufferReplaceableByString | 18 | false |
| NonFinalFieldInEnum | 15 | false |
| SimplifyOptionalCallChains | 15 | false |
| MismatchedJavadocCode | 13 | false |
| WrapperTypeMayBePrimitive | 8 | false |
| MismatchedCollectionQueryUpdate | 8 | false |
| UnstableApiUsage | 8 | false |
| UNUSED_IMPORT | 7 | false |
| ToArrayCallWithZeroLengthArrayArgument | 6 | true |
| FinalPrivateMethod | 6 | false |
| UnusedAssignment | 6 | false |
| OptionalGetWithoutIsPresent | 6 | false |
| ConstantValue | 6 | false |
| RedundantCast | 6 | false |
| Deprecation | 5 | false |
| JavadocLinkAsPlainText | 5 | false |
| StringConcatenationInsideStringBufferAppend | 5 | false |
| RedundantCollectionOperation | 5 | false |
| SuspiciousMethodCalls | 5 | false |
| FinalStaticMethod | 4 | false |
| RedundantTypeArguments | 4 | false |
| FuseStreamOperations | 4 | false |
| ReplaceInefficientStreamCount | 4 | false |
| NonStrictComparisonCanBeEquality | 4 | true |
| RegExpRedundantEscape | 3 | false |
| IgnoreResultOfCall | 3 | false |
| SimplifyStreamApiCallChains | 3 | false |
| ConditionCoveredByFurtherCondition | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| DuplicateBranchesInSwitch | 2 | false |
| RegExpSimplifiable | 2 | false |
| ThrowableSupplierOnlyThrowException | 2 | false |
| SlowListContainsAll | 2 | false |
| InfiniteRecursion | 2 | false |
| OptionalIsPresent | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| CatchMayIgnoreException | 2 | false |
| CharsetObjectCanBeUsed | 2 | false |
| EqualsWhichDoesntCheckParameterClass | 2 | false |
| UnnecessaryReturn | 1 | true |
| FunctionalExpressionCanBeFolded | 1 | false |
| RedundantMethodOverride | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| TypeParameterHidesVisibleType | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| DanglingJavadoc | 1 | false |
| AutoCloseableResource | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Column\[columns.size()\]'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/GridComponentBuilder.java`
#### Snippet
```java
            column.setResizable(false);
        });
        final Column<?, ?>[] columnArray = columns.toArray(new Column<?, ?>[columns.size()]);
        headerRow.join(columnArray).setText(headerCaption);
    }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Long\[assigned.size()\]'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDistributionSetManagement.java`
#### Snippet
```java
        // soft delete assigned
        if (!assigned.isEmpty()) {
            final Long[] dsIds = assigned.toArray(new Long[assigned.size()]);
            distributionSetRepository.deleteDistributionSet(dsIds);
            targetFilterQueryRepository.unsetAutoAssignDistributionSetAndActionType(dsIds);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Long\[toHardDelete.size()\]'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDistributionSetManagement.java`
#### Snippet
```java
        if (!toHardDelete.isEmpty()) {
            targetFilterQueryRepository
                    .unsetAutoAssignDistributionSetAndActionType(toHardDelete.toArray(new Long[toHardDelete.size()]));
            // don't give the delete statement an empty list, JPA/Oracle cannot
            // handle the empty list
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Predicate\[accept.size()\]'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RSQLUtility.java`
#### Snippet
```java

            if (!CollectionUtils.isEmpty(accept)) {
                return cb.and(accept.toArray(new Predicate[accept.size()]));
            }
            return cb.conjunction();
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Predicate\[childs.size()\]'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/JpaQueryRsqlVisitor.java`
#### Snippet
```java
        endLevel();
        if (!childs.isEmpty()) {
            return toSingleList(cb.or(childs.toArray(new Predicate[childs.size()])));
        }
        return toSingleList(cb.conjunction());
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Predicate\[childs.size()\]'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/JpaQueryRsqlVisitor.java`
#### Snippet
```java
        endLevel();
        if (!childs.isEmpty()) {
            return toSingleList(cb.and(childs.toArray(new Predicate[childs.size()])));
        }
        return toSingleList(cb.conjunction());
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/DistributionBarHelper.java`
#### Snippet
```java

    private static Long getTotalSizes(final Map<Status, Long> statusTotalCountMap) {
        Long total = 0L;
        for (final Long value : statusTotalCountMap.values()) {
            total = total + value;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/groupschart/client/GroupsPieChartWidget.java`
#### Snippet
```java

    private static PieArc getPie(final Long count, final Long total, final double startAngle) {
        final Double percentage = count.doubleValue() / total.doubleValue();
        return new PieArc(startAngle, startAngle + percentage * 2 * Math.PI);
    }
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/rollout/RolloutGrid.java`
#### Snippet
```java

        if (rollout.getRolloutGroupsCreated() == 0) {
            final Long groupsCount = rolloutGroupManagement.countByRollout(rollout.getId());
            proxyRollout.setNumberOfGroups(groupsCount.intValue());
        }
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/AutoAssignmentWindowController.java`
#### Snippet
```java
        if (entity.isAutoAssignmentEnabled() && entity.getDistributionSetInfo() != null) {
            final Long autoAssignDsId = entity.getDistributionSetInfo().getId();
            final Long targetsForAutoAssignmentCount = targetManagement.countByRsqlAndNonDSAndCompatible(autoAssignDsId,
                    entity.getQuery());

```

### WrapperTypeMayBePrimitive
Type may be primitive
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaRolloutManagement.java`
#### Snippet
```java
    private JpaRollout createRollout(final JpaRollout rollout) {
        WeightValidationHelper.usingContext(systemSecurityContext, tenantConfigurationManagement).validate(rollout);
        final Long totalTargets = targetManagement.countByRsqlAndCompatible(rollout.getTargetFilterQuery(),
                rollout.getDistributionSet().getType().getId());
        if (totalTargets == 0) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rollout/condition/ThresholdRolloutGroupErrorCondition.java`
#### Snippet
```java
                rolloutGroup.getId(), Action.Status.ERROR);
        try {
            final Integer threshold = Integer.valueOf(expression);

            if (totalGroup == 0) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTargetResource.java`
#### Snippet
```java

        final Slice<Action> activeActions;
        final Long totalActionCount;
        if (rsqlParam != null) {
            activeActions = this.deploymentManagement.findActionsByTarget(rsqlParam, targetId, pageable);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtActionResource.java`
#### Snippet
```java

        final Slice<Action> actions;
        final Long totalActionCount;
        if (rsqlParam != null) {
            actions = this.deploymentManagement.findActions(rsqlParam, pageable);
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/RolloutGroupFields.java`
#### Snippet
```java
    private final String fieldName;

    private RolloutGroupFields(final String fieldName) {
        this.fieldName = fieldName;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/DistributionSetMetadataFields.java`
#### Snippet
```java
    private final String fieldName;

    private DistributionSetMetadataFields(final String fieldName) {
        this.fieldName = fieldName;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/TagFields.java`
#### Snippet
```java
    private final String fieldName;

    private TagFields(final String fieldName) {
        this.fieldName = fieldName;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/SoftwareModuleTypeFields.java`
#### Snippet
```java
    private final String fieldName;

    private SoftwareModuleTypeFields(final String fieldName) {
        this.fieldName = fieldName;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/ActionStatusFields.java`
#### Snippet
```java
    private final String fieldName;

    private ActionStatusFields(final String fieldName) {
        this.fieldName = fieldName;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/SoftwareModuleMetadataFields.java`
#### Snippet
```java
    private final String fieldName;

    private SoftwareModuleMetadataFields(final String fieldName) {
        this.fieldName = fieldName;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/RolloutFields.java`
#### Snippet
```java
    private final String fieldName;

    private RolloutFields(final String fieldName) {
        this.fieldName = fieldName;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/DistributionSetTypeFields.java`
#### Snippet
```java
    private final String fieldName;

    private DistributionSetTypeFields(final String fieldName) {
        this.fieldName = fieldName;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/TargetFilterQueryFields.java`
#### Snippet
```java
    }

    private TargetFilterQueryFields(final String fieldName, final List<String> subEntityAttribues) {
        this.fieldName = fieldName;
        this.subEntityAttributes = subEntityAttribues;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/TargetFilterQueryFields.java`
#### Snippet
```java
    private List<String> subEntityAttributes;

    private TargetFilterQueryFields(final String fieldName) {
        this(fieldName, Collections.emptyList());
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/TargetFilterQueryFields.java`
#### Snippet
```java
    }

    private TargetFilterQueryFields(final String fieldName, final String... subEntityAttribues) {
        this(fieldName, Arrays.asList(subEntityAttribues));
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/TargetMetadataFields.java`
#### Snippet
```java
    private final String fieldName;

    private TargetMetadataFields(final String fieldName) {
        this.fieldName = fieldName;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/ActionFields.java`
#### Snippet
```java
    }

    private ActionFields(final String fieldName, final String... subEntityAttributes) {
        this.fieldName = fieldName;
        this.subEntityAttributes = Arrays.asList(subEntityAttributes);
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/ActionFields.java`
#### Snippet
```java
    private List<String> subEntityAttributes;

    private ActionFields(final String fieldName) {
        this.fieldName = fieldName;
        this.subEntityAttributes = Collections.emptyList();
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/SoftwareModuleFields.java`
#### Snippet
```java
    }

    private SoftwareModuleFields(final String fieldName, final boolean mapField,
            final Entry<String, String> subEntityMapTuple) {
        this.fieldName = fieldName;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/SoftwareModuleFields.java`
#### Snippet
```java
    }

    private SoftwareModuleFields(final String fieldName, final Entry<String, String> subEntityMapTuple) {
        this(fieldName, true, subEntityMapTuple);
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/SoftwareModuleFields.java`
#### Snippet
```java
    private Entry<String, String> subEntityMapTuple;

    private SoftwareModuleFields(final String fieldName) {
        this(fieldName, false, null);
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/TargetFields.java`
#### Snippet
```java
    }

    private TargetFields(final String fieldName, final Entry<String, String> subEntityMapTuple) {
        this(fieldName, true, Collections.emptyList(), subEntityMapTuple);
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/TargetFields.java`
#### Snippet
```java
    }

    private TargetFields(final String fieldName, final boolean isMapField) {
        this(fieldName, isMapField, Collections.emptyList(), null);
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/TargetFields.java`
#### Snippet
```java
    private Entry<String, String> subEntityMapTuple;

    private TargetFields(final String fieldName) {
        this(fieldName, false, Collections.emptyList(), null);
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/TargetFields.java`
#### Snippet
```java
    }

    private TargetFields(final String fieldName, final String... subEntityAttribues) {
        this(fieldName, false, Arrays.asList(subEntityAttribues), null);
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/TargetFields.java`
#### Snippet
```java
    }

    private TargetFields(final String fieldName, final boolean mapField, final List<String> subEntityAttribues,
            final Entry<String, String> subEntityMapTuple) {
        this.fieldName = fieldName;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/DistributionSetFields.java`
#### Snippet
```java
    private Entry<String, String> subEntityMapTuple;

    private DistributionSetFields(final String fieldName) {
        this(fieldName, false, null);
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/DistributionSetFields.java`
#### Snippet
```java
    }

    private DistributionSetFields(final String fieldName, final boolean mapField,
            final Entry<String, String> subEntityMapTuple) {
        this.fieldName = fieldName;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/DistributionSetFields.java`
#### Snippet
```java
    }

    private DistributionSetFields(final String fieldName, final Entry<String, String> subEntityMapTuple) {
        this(fieldName, true, subEntityMapTuple);
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/distributionset/MgmtActionType.java`
#### Snippet
```java
    private final String name;

    private MgmtActionType(final String name) {
        this.name = name;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/distributionset/MgmtCancelationType.java`
#### Snippet
```java
    private final String name;

    private MgmtCancelationType(final String name) {
        this.name = name;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/rest/api/MgmtRepresentationMode.java`
#### Snippet
```java
    private final String mode;

    private MgmtRepresentationMode(final String mode) {
        this.mode = mode;
    }
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `hawkbit-http-security/src/main/java/org/eclipse/hawkbit/security/HttpDownloadAuthenticationFilter.java`
#### Snippet
```java
public class HttpDownloadAuthenticationFilter extends AbstractPreAuthenticatedProcessingFilter {

    public static final String REQUEST_ID_REGEX_PATTERN = ".*\\/downloadId\\/.*";
    private static final Logger LOG = LoggerFactory.getLogger(HttpDownloadAuthenticationFilter.class);

```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `hawkbit-http-security/src/main/java/org/eclipse/hawkbit/security/HttpDownloadAuthenticationFilter.java`
#### Snippet
```java
public class HttpDownloadAuthenticationFilter extends AbstractPreAuthenticatedProcessingFilter {

    public static final String REQUEST_ID_REGEX_PATTERN = ".*\\/downloadId\\/.*";
    private static final Logger LOG = LoggerFactory.getLogger(HttpDownloadAuthenticationFilter.class);

```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `hawkbit-http-security/src/main/java/org/eclipse/hawkbit/security/HttpDownloadAuthenticationFilter.java`
#### Snippet
```java
        }
        LOG.debug("retrieving id from URI request {}", requestURI);
        final String[] groups = requestURI.split("\\/");
        final String id = groups[groups.length - 1];
        if (id == null) {
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/error/extractors/ArtifactEncryptionErrorExtractor.java`
#### Snippet
```java
            return i18n.getMessage(UIMessageIdProvider.MESSAGE_ERROR_ENCRYPTION_SECRETS_FAILED);
        case ENCRYPT:
            return i18n.getMessage(UIMessageIdProvider.MESSAGE_ERROR_ENCRYPTION_FAILED);
        case DECRYPT:
            return i18n.getMessage(UIMessageIdProvider.MESSAGE_ERROR_DECRYPTION_FAILED);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/bulkupload/TargetBulkUploadUiState.java`
#### Snippet
```java
            break;
        case BULK_UPLOAD_COMPLETED:
            setInProgress(false);
            break;
        default:
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `name` in enum 'FinalResult'
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/json/model/DdiResult.java`
#### Snippet
```java
        NONE("none");

        private String name;

        FinalResult(final String name) {
```

### NonFinalFieldInEnum
Non-final field `name` in enum 'HandlingType'
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/json/model/DdiDeployment.java`
#### Snippet
```java
        FORCED("forced");

        private String name;

        HandlingType(final String name) {
```

### NonFinalFieldInEnum
Non-final field `status` in enum 'DdiMaintenanceWindowStatus'
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/json/model/DdiDeployment.java`
#### Snippet
```java
        UNAVAILABLE("unavailable");

        private String status;

        DdiMaintenanceWindowStatus(final String status) {
```

### NonFinalFieldInEnum
Non-final field `name` in enum 'DdiUpdateMode'
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/json/model/DdiUpdateMode.java`
#### Snippet
```java
    REMOVE("remove");

    private String name;

    DdiUpdateMode(final String name) {
```

### NonFinalFieldInEnum
Non-final field `name` in enum 'ExecutionStatus'
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/json/model/DdiStatus.java`
#### Snippet
```java
        DOWNLOAD("download");

        private String name;

        ExecutionStatus(final String name) {
```

### NonFinalFieldInEnum
Non-final field `style` in enum 'Mode'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/header/support/CrudMenuHeaderSupport.java`
#### Snippet
```java
        SELECT(""), EDIT("mode-edit"), DELETE("mode-delete");

        private String style;

        Mode(final String style) {
```

### NonFinalFieldInEnum
Non-final field `subEntityAttributes` in enum 'TargetFilterQueryFields'
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/TargetFilterQueryFields.java`
#### Snippet
```java

    private final String fieldName;
    private List<String> subEntityAttributes;

    private TargetFilterQueryFields(final String fieldName) {
```

### NonFinalFieldInEnum
Non-final field `subEntityAttributes` in enum 'ActionFields'
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/ActionFields.java`
#### Snippet
```java
    private final String fieldName;

    private List<String> subEntityAttributes;

    private ActionFields(final String fieldName) {
```

### NonFinalFieldInEnum
Non-final field `subEntityMapTuple` in enum 'SoftwareModuleFields'
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/SoftwareModuleFields.java`
#### Snippet
```java
    private final String fieldName;
    private boolean mapField;
    private Entry<String, String> subEntityMapTuple;

    private SoftwareModuleFields(final String fieldName) {
```

### NonFinalFieldInEnum
Non-final field `mapField` in enum 'SoftwareModuleFields'
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/SoftwareModuleFields.java`
#### Snippet
```java

    private final String fieldName;
    private boolean mapField;
    private Entry<String, String> subEntityMapTuple;

```

### NonFinalFieldInEnum
Non-final field `subEntityAttribues` in enum 'TargetFields'
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/TargetFields.java`
#### Snippet
```java

    private final String fieldName;
    private List<String> subEntityAttribues;
    private boolean mapField;
    private Entry<String, String> subEntityMapTuple;
```

### NonFinalFieldInEnum
Non-final field `mapField` in enum 'TargetFields'
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/TargetFields.java`
#### Snippet
```java
    private final String fieldName;
    private List<String> subEntityAttribues;
    private boolean mapField;
    private Entry<String, String> subEntityMapTuple;

```

### NonFinalFieldInEnum
Non-final field `subEntityMapTuple` in enum 'TargetFields'
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/TargetFields.java`
#### Snippet
```java
    private List<String> subEntityAttribues;
    private boolean mapField;
    private Entry<String, String> subEntityMapTuple;

    private TargetFields(final String fieldName) {
```

### NonFinalFieldInEnum
Non-final field `mapField` in enum 'DistributionSetFields'
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/DistributionSetFields.java`
#### Snippet
```java

    private final String fieldName;
    private boolean mapField;
    private Entry<String, String> subEntityMapTuple;

```

### NonFinalFieldInEnum
Non-final field `subEntityMapTuple` in enum 'DistributionSetFields'
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/DistributionSetFields.java`
#### Snippet
```java
    private final String fieldName;
    private boolean mapField;
    private Entry<String, String> subEntityMapTuple;

    private DistributionSetFields(final String fieldName) {
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/CommonDialogWindow.java`
#### Snippet
```java
    }

    private final void init() {
        mainLayout.setMargin(false);
        mainLayout.setSpacing(false);
```

### FinalPrivateMethod
'private' method declared `final`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/tagdetails/TagListField.java`
#### Snippet
```java
    }

    private static final Label buildColourIcon(final Long clickedFilterId, final String colour) {
        final ProxyFontIcon colourFontIcon = new ProxyFontIcon(VaadinIcons.CIRCLE, ValoTheme.LABEL_TINY, "", colour);
        final String colourIconId = new StringBuilder(UIComponentIdProvider.ASSIGNED_TAG_ID_PREFIX)
```

### FinalPrivateMethod
'private' method declared `final`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/filterlayout/AbstractFilterButtons.java`
#### Snippet
```java
    }

    private final Label buildColourIcon(final Long clickedFilterId, final String colour) {
        final ProxyFontIcon colourFontIcon = new ProxyFontIcon(VaadinIcons.CIRCLE, ValoTheme.LABEL_TINY, "",
                !StringUtils.isEmpty(colour) ? colour : DEFAULT_GREEN);
```

### FinalPrivateMethod
'private' method declared `final`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/groupschart/client/GroupsPieChartWidget.java`
#### Snippet
```java
    }

    private static final native double getTextWidth(Element e)/*-{
                                                              return e.getBBox().width;
                                                              }-*/;
```

### FinalPrivateMethod
'private' method declared `final`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/groupschart/client/GroupsPieChartWidget.java`
#### Snippet
```java
                                                              }-*/;

    private static final native double getTextHeight(Element e)/*-{
                                                               return e.getBBox().height;
                                                               }-*/;
```

### FinalPrivateMethod
'private' method declared `final`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaArtifactManagement.java`
#### Snippet
```java
    }

    private final DbArtifact wrapInEncryptionAwareDbArtifact(final long smId, final DbArtifact dbArtifact) {
        if (dbArtifact == null) {
            return null;
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`{1}` is redundant
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java
        // only return comparator operators suggestions when there is a '=' or
        // '!' symbol at the end
        final String mapKeyOperatorPattern = "(\\w+)\\.\\w+[=!]{1}$";
        final Matcher mapKeyOperatorMatcher = Pattern.compile(mapKeyOperatorPattern).matcher(rsqlQuery);

```

### RegExpSimplifiable
`[\\S]` can be simplified to '\\S'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTarget.java`
#### Snippet
```java
    @Size(min = 1, max = Target.CONTROLLER_ID_MAX_SIZE)
    @NotNull
    @Pattern(regexp = "[\\S]*", message = "has whitespaces which are not allowed")
    private String controllerId;

```

## RuleId[id=Deprecation]
### Deprecation
'newInstance()' is deprecated
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/components/SPUIComponentProvider.java`
#### Snippet
```java
        try {
            // Create instance
            buttonDecorator = buttonDecoratorclassName.newInstance();
            // Decorate button
            button = buttonDecorator.decorate(new SPUIButton(id, buttonName, buttonDesc), style, setStyle, icon);
```

### Deprecation
'com.vaadin.server.FontAwesome' is deprecated
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettable/TargetConfirmationOptionsComponent.java`
#### Snippet
```java
                    UIComponentIdProvider.AUTO_CONFIRMATION_DETAILS_TOGGLE, "",
                    i18n.getMessage("button.target.auto.confirmation.disable"), ValoTheme.BUTTON_HUGE, true,
                    FontAwesome.TOGGLE_ON, SPUIButtonStyleNoBorder.class);
        } else {
            toggleAutoConfirmationButton = SPUIComponentProvider.getButton(
```

### Deprecation
'com.vaadin.server.FontAwesome' is deprecated
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettable/TargetConfirmationOptionsComponent.java`
#### Snippet
```java
                    UIComponentIdProvider.AUTO_CONFIRMATION_DETAILS_TOGGLE, "",
                    i18n.getMessage("button.target.auto.confirmation.activate"), ValoTheme.BUTTON_HUGE, true,
                    FontAwesome.TOGGLE_OFF, SPUIButtonStyleNoBorder.class);
        }

```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `hawkbit-dmf/hawkbit-dmf-rabbitmq-test/src/main/java/org/eclipse/hawkbit/rabbitmq/test/AmqpTestConfiguration.java`
#### Snippet
```java
                return new URL(serverProperties.getUrl());
            } catch (final MalformedURLException e) {
                throw Throwables.propagate(e);
            }
        };
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `hawkbit-dmf/hawkbit-dmf-rabbitmq-test/src/main/java/org/eclipse/hawkbit/rabbitmq/test/RabbitMqSetupService.java`
#### Snippet
```java
                rabbitmqHttpClient = new Client(getHttpApiUrl(), getUsername(), getPassword());
            } catch (MalformedURLException | URISyntaxException e) {
                throw Throwables.propagate(e);
            }
        }
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/util/FileStreamingUtil.java`
#### Snippet
```java
        }

        final StringBuilder builder = new StringBuilder();
        builder.append(md5Hash);
        builder.append("  ");
```

### StringBufferReplaceableByString
`StringBuilder header` can be replaced with 'String'
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/util/FileStreamingUtil.java`
#### Snippet
```java
        final byte[] content = builder.toString().getBytes(StandardCharsets.US_ASCII);

        final StringBuilder header = new StringBuilder().append("attachment;filename=").append(filename)
                .append(ARTIFACT_MD5_DWNL_SUFFIX);

```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/header/support/DistributionSetFilterDropAreaSupport.java`
#### Snippet
```java
    private static String sanitizeDsNameVersion(final String dsNameAndVersion) {
        return dsNameAndVersion.length() > SPUITargetDefinitions.DISTRIBUTION_NAME_MAX_LENGTH_ALLOWED
                ? new StringBuilder(
                        dsNameAndVersion.substring(0, SPUITargetDefinitions.DISTRIBUTION_NAME_LENGTH_ON_FILTER))
                                .append("...").toString()
```

### StringBufferReplaceableByString
`StringBuilder style` can be replaced with 'String'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/LabelBuilder.java`
#### Snippet
```java
        final Label label = new Label(name);
        label.setVisible(visible);
        final StringBuilder style = new StringBuilder(ValoTheme.LABEL_SMALL);
        style.append(' ');
        style.append(ValoTheme.LABEL_BOLD);
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/tagdetails/TagListField.java`
#### Snippet
```java
    private static final Label buildColourIcon(final Long clickedFilterId, final String colour) {
        final ProxyFontIcon colourFontIcon = new ProxyFontIcon(VaadinIcons.CIRCLE, ValoTheme.LABEL_TINY, "", colour);
        final String colourIconId = new StringBuilder(UIComponentIdProvider.ASSIGNED_TAG_ID_PREFIX)
                .append(".colour-icon.").append(clickedFilterId).toString();

```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/tagdetails/TagListField.java`
#### Snippet
```java

    private Button buildTagButton(final ProxyTag tagData) {
        final String tagButtonId = new StringBuilder(UIComponentIdProvider.ASSIGNED_TAG_ID_PREFIX).append(".")
                .append(tagData.getId()).toString();

```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/GridComponentBuilder.java`
#### Snippet
```java
            final boolean enabled, final ClickListener clickListener) {
        final Button link = new Button();
        final String id = new StringBuilder(idPrefix).append('.').append(idSuffix).toString();

        link.setCaption(caption);
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/StatusIconBuilder.java`
#### Snippet
```java

        protected Label getLabel(final E entity, final ProxyFontIcon icon) {
            final String entityStatusId = new StringBuilder(labelIdPrefix).append(".").append(entity.getId())
                    .toString();
            return SPUIComponentProvider.getLabelIcon(icon, entityStatusId);
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/filterlayout/AbstractFilterButtons.java`
#### Snippet
```java

    private Button buildFilterNameButton(final T clickedFilter) {
        final String filterNameId = new StringBuilder(getFilterButtonIdPrefix()).append(".")
                .append(clickedFilter.getId()).toString();

```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/filterlayout/AbstractFilterButtons.java`
#### Snippet
```java
        final ProxyFontIcon colourFontIcon = new ProxyFontIcon(VaadinIcons.CIRCLE, ValoTheme.LABEL_TINY, "",
                !StringUtils.isEmpty(colour) ? colour : DEFAULT_GREEN);
        final String colourIconId = new StringBuilder(getFilterButtonIdPrefix()).append(".colour-icon.")
                .append(clickedFilterId).toString();

```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/detailslayout/MetadataDetailsGrid.java`
#### Snippet
```java
    private Button buildKeyLink(final ProxyMetaData metaData) {
        final String metaDataKey = metaData.getKey();
        final String idPrefix = new StringBuilder(typePrefix).append('.')
                .append(UIComponentIdProvider.METADATA_DETAIL_LINK).toString();

```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/components/SimpleGroupsLayout.java`
#### Snippet
```java

    private String getTargetPerGroupMessage(final int targetsPerGroup) {
        return new StringBuilder(i18n.getMessage("label.target.per.group")).append(targetsPerGroup).toString();
    }

```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/ArtifactUploadState.java`
#### Snippet
```java
    private static String getStateListLogMessage(final int overallUploadCount, final int succeededUploadCount,
            final int failedUploadCount) {
        final StringBuilder buffer = new StringBuilder();
        buffer.append("Overall uploads: " + overallUploadCount);
        buffer.append("| succeeded uploads: " + succeededUploadCount);
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileUploadId.java`
#### Snippet
```java
    @Override
    public String toString() {
        return new StringBuilder(filename).append(":")
                .append(HawkbitCommonUtil.getFormattedNameVersion(softwareModuleName, softwareModuleVersion))
                .toString();
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/bulkupload/TargetBulkUpdateWindowLayout.java`
#### Snippet
```java
        targetsCountLabel.setVisible(true);
        targetsCountLabel.setValue(
                new StringBuilder().append("<font color=RED>").append(failureReason).append("</font>").toString());

        uinotification.displayValidationError(failureReason);
```

### StringBufferReplaceableByString
`StringBuilder countLabelBuilder` can be replaced with 'String'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/bulkupload/TargetBulkUpdateWindowLayout.java`
#### Snippet
```java

    private String getFormattedCountLabelValue(final int successfulUploadCount, final int failedUploadCount) {
        final StringBuilder countLabelBuilder = new StringBuilder();
        countLabelBuilder.append(
                i18n.getMessage(UIMessageIdProvider.MESSAGE_TARGET_BULKUPLOAD_RESULT_SUCCESS, successfulUploadCount));
```

### StringBufferReplaceableByString
`StringBuilder message` can be replaced with 'String'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettable/TargetCountMessageLabel.java`
#### Snippet
```java

    private void updatePinningCountLabel() {
        final StringBuilder message = new StringBuilder(i18n.getMessage("label.target.count"));
        message.append(" : ");
        message.append("<span class=\"assigned-count-message\">");
```

### StringBufferReplaceableByString
`StringBuilder targetMessage` can be replaced with 'String'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/TargetFilterCountMessageLabel.java`
#### Snippet
```java

    private void updateTotalFilteredTargetsCountLabel() {
        final StringBuilder targetMessage = new StringBuilder(i18n.getMessage("label.target.filtered.total"));
        targetMessage.append(": ");
        targetMessage.append(totalFilteredTargetsCount);
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/utils/WeightValidationHelper.java`
#### Snippet
```java
            throw new MultiAssignmentIsNotEnabledException();
        } else if (bypassWeightEnforcement) {
            return;
        } else if (multiAssignmentsEnabled && hasNoWeight) {
            throw new NoWeightProvidedInMultiAssignmentModeException();
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/BaseAmqpService.java`
#### Snippet
```java
    }

    protected static final void logAndThrowMessageError(final Message message, final String error) {
        LOGGER.debug("Warning! \"{}\" reported by message: {}", error, message);
        throw new AmqpRejectAndDontRequeueException(error);
```

### FinalStaticMethod
'static' method declared `final`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/tagdetails/TagListField.java`
#### Snippet
```java
    }

    private static final Label buildColourIcon(final Long clickedFilterId, final String colour) {
        final ProxyFontIcon colourFontIcon = new ProxyFontIcon(VaadinIcons.CIRCLE, ValoTheme.LABEL_TINY, "", colour);
        final String colourIconId = new StringBuilder(UIComponentIdProvider.ASSIGNED_TAG_ID_PREFIX)
```

### FinalStaticMethod
'static' method declared `final`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/groupschart/client/GroupsPieChartWidget.java`
#### Snippet
```java
    }

    private static final native double getTextWidth(Element e)/*-{
                                                              return e.getBBox().width;
                                                              }-*/;
```

### FinalStaticMethod
'static' method declared `final`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/groupschart/client/GroupsPieChartWidget.java`
#### Snippet
```java
                                                              }-*/;

    private static final native double getTextHeight(Element e)/*-{
                                                               return e.getBBox().height;
                                                               }-*/;
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/rollout/RolloutGrid.java`
#### Snippet
```java

    private void initFilterMappings() {
        getFilterSupport().<String> addMapping(FilterType.SEARCH, (filter, searchText) -> setSearchFilter(searchText),
                rolloutManagementUIState.getSearchText().orElse(null));
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/TargetFilterTargetGrid.java`
#### Snippet
```java

    private void initFilterMappings() {
        getFilterSupport().<String> addMapping(FilterType.QUERY, (filter, queryText) -> setQueryFilter(queryText),
                uiState.getFilterQueryValueInput());
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/TargetFilterGrid.java`
#### Snippet
```java

    private void initFilterMappings() {
        getFilterSupport().<String> addMapping(FilterType.SEARCH, (filter, searchText) -> setSearchFilter(searchText),
                uiState.getSearchFilterInput());
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RSQLUtility.java`
#### Snippet
```java
            final JpaQueryRsqlVisitor<A, T> jpqQueryRSQLVisitor = new JpaQueryRsqlVisitor<>(root, cb, enumType,
                    virtualPropertyReplacer, database, query);
            final List<Predicate> accept = rootNode.<List<Predicate>, String> accept(jpqQueryRSQLVisitor);

            if (!CollectionUtils.isEmpty(accept)) {
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/util/SortUtility.java`
#### Snippet
```java
    /**
     * Parses the sort string e.g. given in a REST call based on the definition
     * of sorting: http://localhost/entity?s=field1:ASC, field2:DESC The fields
     * will be split into the keys of the returned map. The direction of the
     * sorting will be mapped into the {@link Direction} enum.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/DistributionSetTypeRepository.java`
#### Snippet
```java
    /**
     * Retrieves the {@link DistributionSetType}s for the given IDs. Workaround
     * for https://bugs.eclipse.org/bugs/show_bug.cgi?id=349477
     *
     * @param ids
```

### JavadocLinkAsPlainText
Link specified as plain text
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RSQLUtility.java`
#### Snippet
```java
 * A utility class which is able to parse RSQL strings into an spring data
 * {@link Specification} which then can be enhanced sql queries to filter
 * entities. RSQL parser library: https://github.com/jirutka/rsql-parser
 *
 * <ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/rest/api/MgmtRestConstants.java`
#### Snippet
```java
     * The request parameter for sorting. The value of the sort parameter must
     * be in the following pattern. Example:
     * http://www.bosch.com/iap/sp/rest/targets?sort=field_1:ASC,field_2:DESC,
     * field_3:ASC
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/HawkbitSecurityProperties.java`
#### Snippet
```java
    /**
     * Basic authentication realm, see
     * https://tools.ietf.org/html/rfc2617#page-3 .
     */
    private String basicRealm = "hawkBit";
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/UiProperties.java`
#### Snippet
```java
             * Link to documentation of auto confirmation view.
             */
            private String autoConfirmationView = "";

            /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/header/AbstractFilterHeader.java`
#### Snippet
```java

    private final transient CrudMenuHeaderSupport crudMenuHeaderSupport;
    private final transient CloseHeaderSupport closeHeaderSupport;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/header/AbstractEntityGridHeader.java`
#### Snippet
```java
    private final transient SearchHeaderSupport searchHeaderSupport;
    private final transient FilterButtonsHeaderSupport filterButtonsHeaderSupport;
    private final transient ResizeHeaderSupport resizeHeaderSupport;

    private final EventLayout filterLayout;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/detailslayout/MetadataWindowGridHeader.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private final transient AddHeaderSupport addHeaderSupport;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/rollout/RolloutGridHeader.java`
#### Snippet
```java
    private final transient RolloutWindowBuilder rolloutWindowBuilder;

    private final transient SearchHeaderSupport searchHeaderSupport;
    private final transient AddHeaderSupport addHeaderSupport;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/rollout/RolloutGridHeader.java`
#### Snippet
```java

    private final transient SearchHeaderSupport searchHeaderSupport;
    private final transient AddHeaderSupport addHeaderSupport;

    RolloutGridHeader(final CommonUiDependencies uiDependencies, final RolloutManagementUIState rolloutManagementUIState,
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/smtype/SmTypeWindowLayout.java`
#### Snippet
```java
 */
public class SmTypeWindowLayout extends TagWindowLayout<ProxyType> {
    private final SmTypeWindowLayoutComponentBuilder smTypeComponentBuilder;

    private final TextField typeKey;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/details/ArtifactDetailsGridHeader.java`
#### Snippet
```java
    private final ArtifactDetailsGridLayoutUiState artifactDetailsGridLayoutUiState;

    private final transient ResizeHeaderSupport resizeHeaderSupport;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/smtable/SmWindowLayout.java`
#### Snippet
```java
 */
public class SmWindowLayout extends AbstractEntityWindowLayout<ProxySoftwareModule> {
    private final SmWindowLayoutComponentBuilder smComponentBuilder;

    private final ComboBox<ProxyTypeInfo> smTypeSelect;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/miscs/AssignmentWindowLayout.java`
#### Snippet
```java

    private final Binder<ProxyAssignmentWindow> proxyAssignmentBinder;
    private final transient AssignmentWindowLayoutComponentBuilder componentBuilder;

    private final BoundComponent<ActionTypeOptionGroupAssignmentLayout> actionTypeLayout;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettag/filter/TargetTagFilterHeader.java`
#### Snippet
```java
    private final transient TargetTypeWindowBuilder targetTypeWindowBuilder;

    private final transient ResizeHeaderSupport resizeHeaderSupport;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettag/targettype/TargetTypeWindowLayout.java`
#### Snippet
```java
 */
public class TargetTypeWindowLayout extends TagWindowLayout<ProxyTargetType> {
    private final TargetTypeWindowLayoutComponentBuilder targetTypeWindowLayoutComponentBuilder;

    private final TargetTypeDsTypeSelectLayout targetTypeDsTypeSelectLayout;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettag/targettype/TargetTypeDsTypeSelectLayout.java`
#### Snippet
```java
    private final VaadinMessageSource i18n;

    private final transient TypeToProxyTypeMapper<DistributionSetType> dsTypeToProxyTypeMapper;

    private DsTypeSelectedGrid selectedGrid;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettable/TargetWindowLayout.java`
#### Snippet
```java
 */
public class TargetWindowLayout extends AbstractEntityWindowLayout<ProxyTarget> {
    private final TargetWindowLayoutComponentBuilder targetComponentBuilder;

    private final TextField targetControllerId;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/actionhistory/ActionStatusMsgGridLayout.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private final ActionStatusMsgGridHeader actionStatusMsgHeader;
    private final ActionStatusMsgGrid actionStatusMsgGrid;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/actionhistory/ActionHistoryGridHeader.java`
#### Snippet
```java
    private final ActionHistoryGridLayoutUiState actionHistoryGridLayoutUiState;

    private final transient ResizeHeaderSupport resizeHeaderSupport;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/actionhistory/ActionStatusGridLayout.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private final ActionStatusGridHeader actionStatusGridHeader;
    private final ActionStatusGrid actionStatusGrid;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettable/TargetDetails.java`
#### Snippet
```java
    private final transient ConfirmationManagement confirmationManagement;

    private final TargetAttributesDetailsComponent attributesLayout;
    private final KeyValueDetailsComponent assignedDsDetails;
    private final KeyValueDetailsComponent installedDsDetails;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettable/TargetDetails.java`
#### Snippet
```java
    private final TargetAttributesDetailsComponent attributesLayout;
    private final KeyValueDetailsComponent assignedDsDetails;
    private final KeyValueDetailsComponent installedDsDetails;
    private final transient TargetTagToken targetTagToken;
    private final MetadataDetailsGrid<String> targetMetadataGrid;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettable/TargetDetails.java`
#### Snippet
```java

    private final TargetAttributesDetailsComponent attributesLayout;
    private final KeyValueDetailsComponent assignedDsDetails;
    private final KeyValueDetailsComponent installedDsDetails;
    private final transient TargetTagToken targetTagToken;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/distributions/dstable/DsWindowLayout.java`
#### Snippet
```java
    private final TenantConfigurationManagement tenantConfigurationManagement;

    private final DsWindowLayoutComponentBuilder dsComponentBuilder;

    private final ComboBox<ProxyTypeInfo> dsTypeSelect;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/distributions/disttype/DsTypeWindowLayout.java`
#### Snippet
```java
 */
public class DsTypeWindowLayout extends TagWindowLayout<ProxyType> {
    private final DsTypeWindowLayoutComponentBuilder dsTypeComponentBuilder;

    private final TextField typeKey;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/distributions/disttype/DsTypeSmSelectLayout.java`
#### Snippet
```java
    private final VaadinMessageSource i18n;

    private final transient TypeToProxyTypeMapper<SoftwareModuleType> smTypeToProxyTypeMapper;

    private SmTypeSelectedGrid selectedGrid;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/AutoAssignmentWindowLayout.java`
#### Snippet
```java
 */
public class AutoAssignmentWindowLayout extends AbstractEntityWindowLayout<ProxyTargetFilterQuery> {
    private final AutoAssignmentWindowLayoutComponentBuilder autoAssignComponentBuilder;

    private final Label descriptionLabel;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/TargetFilterAddUpdateLayout.java`
#### Snippet
```java
    private static final String FILTER_QUERY_CAPTION = "textfield.query";

    private final TargetFilterAddUpdateLayoutComponentBuilder filterComponentBuilder;

    private final TextField filterNameInput;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/TargetFilterGridHeader.java`
#### Snippet
```java

    private final transient SearchHeaderSupport searchHeaderSupport;
    private final transient AddHeaderSupport addHeaderSupport;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/tenantconfiguration/repository/ActionAutoCleanupConfigurationItem.java`
#### Snippet
```java

    private final VerticalLayout container;
    private final ComboBox<ActionStatusOption> actionStatusCombobox;
    private final TextField actionExpiryInput;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/tenantconfiguration/repository/ActionAutoCleanupConfigurationItem.java`
#### Snippet
```java
    private final VerticalLayout container;
    private final ComboBox<ActionStatusOption> actionStatusCombobox;
    private final TextField actionExpiryInput;

    private final VaadinMessageSource i18n;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/tenantconfiguration/authentication/CertificateAuthenticationConfigurationItem.java`
#### Snippet
```java

    private final VerticalLayout detailLayout;
    private final TextField caRootAuthorityTextField;

    /**
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `hawkbit-artifact-repository-filesystem/src/main/java/org/eclipse/hawkbit/artifact/repository/ArtifactFilesystemRepository.java`
#### Snippet
```java
    private File getFile(final String tenant, final String sha1) {
        final File aritfactDirectory = getSha1DirectoryPath(tenant, sha1).toFile();
        aritfactDirectory.mkdirs();
        return new File(aritfactDirectory, sha1);
    }
```

### IgnoreResultOfCall
Result of `URI.create()` is ignored
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractTargetUpdateCreate.java`
#### Snippet
```java
        if (address != null) {
            try {
                URI.create(StringUtils.trimWhitespace(address));
            } catch (final IllegalArgumentException e) {
                throw new InvalidTargetAddressException(
```

### IgnoreResultOfCall
Result of `URI.create()` is ignored
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/target/MgmtTarget.java`
#### Snippet
```java
    public void setAddress(final String address) {
        if (address != null) {
            URI.create(address);
        }
        this.address = address;
```

## RuleId[id=ThrowableSupplierOnlyThrowException]
### ThrowableSupplierOnlyThrowException
Throwable supplier doesn't return any exception
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rollout/condition/RolloutGroupEvaluationManager.java`
#### Snippet
```java
            final List<RolloutGroupConditionEvaluator<T>> evaluators, final T condition) {
        return evaluators.stream().filter(evaluator -> evaluator.getCondition() == condition).findFirst()
                .orElseThrow(() -> {
                    LOGGER.warn("Could not find suitable evaluator for the '{}' condition.", condition.name());
                    throw new EvaluatorNotConfiguredException(condition.name());
```

### ThrowableSupplierOnlyThrowException
Throwable supplier doesn't return any exception
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rollout/condition/RolloutGroupEvaluationManager.java`
#### Snippet
```java
    private static <T extends Enum<T>> RolloutGroupActionEvaluator<T> findFirstActionEvaluator(
            final List<RolloutGroupActionEvaluator<T>> evaluators, final T action) {
        return evaluators.stream().filter(evaluator -> evaluator.getAction() == action).findFirst().orElseThrow(() -> {
            LOGGER.warn("Could not find suitable evaluator for the '{}' action.", action.name());
            throw new EvaluatorNotConfiguredException(action.name());
```

## RuleId[id=FunctionalExpressionCanBeFolded]
### FunctionalExpressionCanBeFolded
Method reference can be replaced with qualifier
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/EntityModifiedListener.java`
#### Snippet
```java

    private void handleEntitiesModified(final Consumer<EntityModifiedAwareSupport> handler) {
        UI.getCurrent().access(() -> entityModifiedAwareSupports.forEach(handler::accept));
    }

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `isFilterPreviouslyClicked()` is identical to its super method
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/filterlayout/TargetTypeFilterButtonClick.java`
#### Snippet
```java

    @Override
    public boolean isFilterPreviouslyClicked(final ProxyTargetType clickedFilter) {
        return (previouslyClickedFilterId != null && previouslyClickedFilterId.equals(clickedFilter.getId()));
    }
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/json/model/DdiActivateAutoConfirmation.java`
#### Snippet
```java
    private final String initiator;

    @JsonProperty(required = false)
    private final String remark;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/json/model/DdiActivateAutoConfirmation.java`
#### Snippet
```java
public class DdiActivateAutoConfirmation {

    @JsonProperty(required = false)
    private final String initiator;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTargetType.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    @Column(name = "colour", nullable = true, length = TargetType.COLOUR_MAX_SIZE)
    @Size(max = TargetType.COLOUR_MAX_SIZE)
    private String colour;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTargetFilterQuery.java`
#### Snippet
```java
    private String query;

    @ManyToOne(optional = true, fetch = FetchType.LAZY, targetEntity = JpaDistributionSet.class)
    @JoinColumn(name = "auto_assign_distribution_set", nullable = true, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "fk_filter_auto_assign_ds"))
    private JpaDistributionSet autoAssignDistributionSet;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTargetFilterQuery.java`
#### Snippet
```java

    @ManyToOne(optional = true, fetch = FetchType.LAZY, targetEntity = JpaDistributionSet.class)
    @JoinColumn(name = "auto_assign_distribution_set", nullable = true, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "fk_filter_auto_assign_ds"))
    private JpaDistributionSet autoAssignDistributionSet;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTargetFilterQuery.java`
#### Snippet
```java
    private ActionType autoAssignActionType;

    @Column(name = "auto_assign_weight", nullable = true)
    private Integer autoAssignWeight;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTargetFilterQuery.java`
#### Snippet
```java
    private Integer autoAssignWeight;

    @Column(name = "auto_assign_initiated_by", nullable = true, length = USERNAME_FIELD_LENGTH)
    private String autoAssignInitiatedBy;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTargetFilterQuery.java`
#### Snippet
```java
    private JpaDistributionSet autoAssignDistributionSet;

    @Column(name = "auto_assign_action_type", nullable = true)
    @ObjectTypeConverter(name = "autoAssignActionType", objectType = Action.ActionType.class, dataType = Integer.class, conversionValues = {
            @ConversionValue(objectValue = "FORCED", dataValue = "0"),
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaActionStatus.java`
#### Snippet
```java
    private List<String> messages;

    @Column(name = "code", nullable = true, updatable = false)
    private Integer code;
    
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaAction.java`
#### Snippet
```java
    private String initiatedBy;

    @Column(name = "last_action_status_code", nullable = true, updatable = true)
    private Integer lastActionStatusCode;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaAction.java`
#### Snippet
```java
    private String initiatedBy;

    @Column(name = "last_action_status_code", nullable = true, updatable = true)
    private Integer lastActionStatusCode;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaSoftwareModuleType.java`
#### Snippet
```java
    private int maxAssignments;

    @Column(name = "colour", nullable = true, length = SoftwareModuleType.COLOUR_MAX_SIZE)
    @Size(max = SoftwareModuleType.COLOUR_MAX_SIZE)
    private String colour;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTag.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    @Column(name = "colour", nullable = true, length = Tag.COLOUR_MAX_SIZE)
    @Size(max = Tag.COLOUR_MAX_SIZE)
    private String colour;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaArtifact.java`
#### Snippet
```java
    private JpaSoftwareModule softwareModule;

    @Column(name = "md5_hash", length = 32, updatable = false, nullable = true)
    private String md5Hash;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaArtifact.java`
#### Snippet
```java
    private String md5Hash;

    @Column(name = "sha256_hash", length = 64, updatable = false, nullable = true)
    private String sha256Hash;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTarget.java`
#### Snippet
```java
     * with this security token.
     */
    @Column(name = "sec_token", updatable = true, nullable = false, length = Target.SECURITY_TOKEN_MAX_SIZE)
    @Size(min = 1, max = Target.SECURITY_TOKEN_MAX_SIZE)
    @NotNull
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTarget.java`
#### Snippet
```java
    private TargetUpdateStatus updateStatus = TargetUpdateStatus.UNKNOWN;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "installed_distribution_set", nullable = true, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "fk_target_inst_ds"))
    private JpaDistributionSet installedDistributionSet;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTarget.java`
#### Snippet
```java

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "installed_distribution_set", nullable = true, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "fk_target_inst_ds"))
    private JpaDistributionSet installedDistributionSet;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTarget.java`
#### Snippet
```java
    @ElementCollection
    @Column(name = "attribute_value", length = Target.CONTROLLER_ATTRIBUTE_VALUE_SIZE)
    @MapKeyColumn(name = "attribute_key", nullable = false, length = Target.CONTROLLER_ATTRIBUTE_KEY_SIZE)
    @CollectionTable(name = "sp_target_attributes", joinColumns = {
            @JoinColumn(name = "target_id", nullable = false, updatable = false) }, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "fk_targ_attrib_target"))
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTarget.java`
#### Snippet
```java
    private JpaDistributionSet installedDistributionSet;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "assigned_distribution_set", nullable = true, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "fk_target_assign_ds"))
    private JpaDistributionSet assignedDistributionSet;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTarget.java`
#### Snippet
```java

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "assigned_distribution_set", nullable = true, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "fk_target_assign_ds"))
    private JpaDistributionSet assignedDistributionSet;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTarget.java`
#### Snippet
```java
    private Map<String, String> controllerAttributes;

    @ManyToOne(fetch = FetchType.LAZY, optional = true, targetEntity = JpaTargetType.class)
    @JoinColumn(name = "target_type", nullable = true, updatable = true, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "fk_target_relation_target_type"))
    private TargetType targetType;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTarget.java`
#### Snippet
```java

    @ManyToOne(fetch = FetchType.LAZY, optional = true, targetEntity = JpaTargetType.class)
    @JoinColumn(name = "target_type", nullable = true, updatable = true, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "fk_target_relation_target_type"))
    private TargetType targetType;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTarget.java`
#### Snippet
```java

    @ManyToOne(fetch = FetchType.LAZY, optional = true, targetEntity = JpaTargetType.class)
    @JoinColumn(name = "target_type", nullable = true, updatable = true, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "fk_target_relation_target_type"))
    private TargetType targetType;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaSoftwareModule.java`
#### Snippet
```java
    private boolean deleted;

    @Column(name = "vendor", nullable = true, length = SoftwareModule.VENDOR_MAX_SIZE)
    @Size(max = SoftwareModule.VENDOR_MAX_SIZE)
    private String vendor;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaDistributionSetType.java`
#### Snippet
```java
    private String key;

    @Column(name = "colour", nullable = true, length = DistributionSetType.COLOUR_MAX_SIZE)
    @Size(max = DistributionSetType.COLOUR_MAX_SIZE)
    private String colour;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/target/MgmtTargetAutoConfirmUpdate.java`
#### Snippet
```java
 */
public class MgmtTargetAutoConfirmUpdate {
    @JsonProperty(required = false)
    private final String initiator;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/target/MgmtTargetAutoConfirmUpdate.java`
#### Snippet
```java
    private final String initiator;

    @JsonProperty(required = false)
    private final String remark;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/target/MgmtDistributionSetAssignment.java`
#### Snippet
```java
    @JsonProperty(required = false)
    private Integer weight;
    @JsonProperty(required = false)
    private Boolean confirmationRequired;
    private MgmtActionType type;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/target/MgmtDistributionSetAssignment.java`
#### Snippet
```java

    private long forcetime;
    @JsonProperty(required = false)
    private Integer weight;
    @JsonProperty(required = false)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/system/MgmtSystemTenantConfigurationValue.java`
#### Snippet
```java
public class MgmtSystemTenantConfigurationValue extends RepresentationModel<MgmtSystemTenantConfigurationValue> {

    @JsonInclude(Include.ALWAYS)
    private Object value;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/system/MgmtSystemTenantConfigurationValue.java`
#### Snippet
```java
    private Object value;

    @JsonInclude(Include.ALWAYS)
    private boolean isGlobal = true;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/targetfilter/MgmtTargetFilterQuery.java`
#### Snippet
```java
 *
 */
@JsonInclude(Include.ALWAYS)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MgmtTargetFilterQuery extends MgmtBaseEntity {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/rollout/MgmtRolloutRestRequestBody.java`
#### Snippet
```java
    private Integer weight;

    @JsonProperty(required = false)
    private Boolean confirmationRequired;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/rollout/MgmtRolloutRestRequestBody.java`
#### Snippet
```java
    private Long startAt;

    @JsonProperty(required = false)
    private Integer weight;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/targetfilter/MgmtDistributionSetAutoAssignment.java`
#### Snippet
```java
    private Integer weight;

    @JsonProperty(required = false)
    private Boolean confirmationRequired;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/targetfilter/MgmtDistributionSetAutoAssignment.java`
#### Snippet
```java
public class MgmtDistributionSetAutoAssignment extends MgmtId {

    @JsonProperty(required = false)
    private MgmtActionType type;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/targetfilter/MgmtDistributionSetAutoAssignment.java`
#### Snippet
```java
    private MgmtActionType type;

    @JsonProperty(required = false)
    private Integer weight;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/DmfTenantSecurityToken.java`
#### Snippet
```java
    @JsonProperty(required = false)
    private final Long tenantId;
    @JsonProperty(required = false)
    private final String controllerId;
    @JsonProperty(required = false)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/DmfTenantSecurityToken.java`
#### Snippet
```java
    @JsonProperty(required = false)
    private String tenant;
    @JsonProperty(required = false)
    private final Long tenantId;
    @JsonProperty(required = false)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/DmfTenantSecurityToken.java`
#### Snippet
```java
        @JsonProperty(required = false)
        private Long artifactId;
        @JsonProperty(required = false)
        private String filename;
        @JsonProperty(required = false)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/DmfTenantSecurityToken.java`
#### Snippet
```java
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class FileResource {
        @JsonProperty(required = false)
        private String sha1;
        @JsonProperty(required = false)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/DmfTenantSecurityToken.java`
#### Snippet
```java
    private final Long targetId;

    @JsonProperty(required = false)
    private Map<String, String> headers;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/DmfTenantSecurityToken.java`
#### Snippet
```java
        @JsonProperty(required = false)
        private String filename;
        @JsonProperty(required = false)
        private SoftwareModuleFilenameResource softwareModuleFilenameResource;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/DmfTenantSecurityToken.java`
#### Snippet
```java
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class SoftwareModuleFilenameResource {
            @JsonProperty(required = false)
            private Long softwareModuleId;
            @JsonProperty(required = false)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/DmfTenantSecurityToken.java`
#### Snippet
```java
        @JsonProperty(required = false)
        private String sha1;
        @JsonProperty(required = false)
        private Long artifactId;
        @JsonProperty(required = false)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/DmfTenantSecurityToken.java`
#### Snippet
```java
    @JsonProperty(required = false)
    private final String controllerId;
    @JsonProperty(required = false)
    private final Long targetId;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/DmfTenantSecurityToken.java`
#### Snippet
```java
    public static final String AUTHORIZATION_HEADER = "Authorization";

    @JsonProperty(required = false)
    private String tenant;
    @JsonProperty(required = false)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/DmfTenantSecurityToken.java`
#### Snippet
```java
    private Map<String, String> headers;

    @JsonProperty(required = false)
    private final FileResource fileResource;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/DmfTenantSecurityToken.java`
#### Snippet
```java
            @JsonProperty(required = false)
            private Long softwareModuleId;
            @JsonProperty(required = false)
            private String filename;

```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/MaintenanceScheduleHelper.java`
#### Snippet
```java
            // check if there is a window currently active or available in
            // future.
            if (!getNextMaintenanceWindow(cronSchedule, duration, timezone).isPresent()) {
                throw new InvalidMaintenanceScheduleException(
                        "No valid maintenance window available after current time");
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageHandlerService.java`
#### Snippet
```java
                .findActiveActionWithHighestWeight(target.getControllerId());

        if (!actionOptional.isPresent()) {
            return;
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageHandlerService.java`
#### Snippet
```java

        final Optional<Action> findActionWithDetails = controllerManagement.findActionWithDetails(actionId);
        if (!findActionWithDetails.isPresent()) {
            logAndThrowMessageError(message,
                    "Got intermediate notification about action " + actionId + " but action does not exist");
```

### SimplifyOptionalCallChains
Optional chain can be simplified
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/error/extractors/ArtifactEncryptionErrorExtractor.java`
#### Snippet
```java
                        i18n.getMessage(UIMessageIdProvider.MESSAGE_ERROR_ENCRYPTION_NOT_SUPPORTED)))
                .map(Optional::of)
                .orElseGet(() -> findExceptionOf(error, ArtifactEncryptionFailedException.class)
                        .map(ex -> UiErrorDetails.create(i18n.getMessage(UIMessageIdProvider.CAPTION_ERROR),
                                getEncryptionFailedDetailsMsg(ex))));
```

### SimplifyOptionalCallChains
Folded 'ifPresent()' call can be eliminated
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/support/EntityModifiedSelectionAwareSupport.java`
#### Snippet
```java
        }

        getModifiedEntityId(entityIds).ifPresent(selectedEntityId ->
        // we load the up-to-date version of selected entity from
        // database and reselect it, so that master-aware components
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/detailslayout/AbstractMetaDataWindowLayout.java`
#### Snippet
```java
            selectedEntity.ifPresent(this::showEditMetaDataLayout);

            if (!selectedEntity.isPresent()) {
                showAddMetaDataLayout();
            }
```

### SimplifyOptionalCallChains
Optional chain can be simplified
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/smtype/UpdateSmTypeWindowController.java`
#### Snippet
```java
        return smTypeManagement.get(id)
                .map(smType -> smType.getMaxAssignments() == 1 ? SmTypeAssign.SINGLE : SmTypeAssign.MULTI)
                .orElse(SmTypeAssign.SINGLE);
    }

```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/rollout/RolloutGrid.java`
#### Snippet
```java
        });

        if (!refetchedRollout.isPresent()) {
            onSelectedRolloutDeleted(selectedRolloutId);
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/bulkupload/BulkUploadHandler.java`
#### Snippet
```java
            final Long dsId = bulkUploadInputs.getDistributionSetInfo().getId();

            if (!distributionSetManagement.get(dsId).isPresent()) {
                return i18n.getMessage("message.bulk.upload.assignment.failed");
            }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/bulkupload/BulkUploadHandler.java`
#### Snippet
```java

            for (final Entry<Long, String> tagIdWithName : tagIdsWithName.entrySet()) {
                if (!tagManagement.get(tagIdWithName.getKey()).isPresent()) {
                    deletedTags.add(tagIdWithName.getValue());
                } else {
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `hawkbit-rest/hawkbit-ddi-resource/src/main/java/org/eclipse/hawkbit/ddi/rest/resource/DdiRootController.java`
#### Snippet
```java

    private static boolean checkModule(final String fileName, final SoftwareModule module) {
        return null == module || !module.getArtifactByFilename(fileName).isPresent();
    }

```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaRolloutGroupManagement.java`
#### Snippet
```java
        final Optional<RolloutGroup> rolloutGroup = get(rolloutGroupId);

        if (!rolloutGroup.isPresent()) {
            return rolloutGroup;
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaRolloutManagement.java`
#### Snippet
```java
        final Optional<Rollout> rollout = get(rolloutId);

        if (!rollout.isPresent()) {
            return rollout;
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaAction.java`
#### Snippet
```java
    @Override
    public boolean isMaintenanceScheduleLapsed() {
        return !getMaintenanceWindowStartTime().isPresent();
    }

```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtSoftwareModuleResource.java`
#### Snippet
```java
                .orElseThrow(() -> new EntityNotFoundException(SoftwareModule.class, softwareModuleId));

        if (artifactId != null && !module.getArtifact(artifactId).isPresent()) {
            throw new EntityNotFoundException(Artifact.class, artifactId);
        }
```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/data/ResponseList.java`
#### Snippet
```java
    @Override
    public boolean containsAll(final Collection<?> c) {
        return content.containsAll(c);
    }

```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaDistributionSetType.java`
#### Snippet
```java
            return false;
        }
        return smTypes.containsAll(getMandatoryModuleTypes());
    }

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.eclipse.hawkbit.repository.jpa.builder.JpaTargetBuilder;`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaEntityFactory.java`
#### Snippet
```java
import org.eclipse.hawkbit.repository.jpa.builder.JpaSoftwareModuleTypeBuilder;
import org.eclipse.hawkbit.repository.jpa.builder.JpaTagBuilder;
import org.eclipse.hawkbit.repository.jpa.builder.JpaTargetBuilder;
import org.eclipse.hawkbit.repository.jpa.model.JpaDistributionSetMetadata;
import org.eclipse.hawkbit.repository.jpa.model.JpaTargetMetadata;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.hawkbit.repository.TargetTypeManagement;`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/builder/JpaTargetTypeBuilder.java`
#### Snippet
```java

import org.eclipse.hawkbit.repository.DistributionSetTypeManagement;
import org.eclipse.hawkbit.repository.TargetTypeManagement;
import org.eclipse.hawkbit.repository.builder.GenericTargetTypeUpdate;
import org.eclipse.hawkbit.repository.builder.TargetTypeBuilder;
```

### UNUSED_IMPORT
Unused import `import java.util.Optional;`
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/rollout/MgmtRolloutRestRequestBody.java`
#### Snippet
```java

import java.util.List;
import java.util.Optional;

import org.eclipse.hawkbit.mgmt.json.model.distributionset.MgmtActionType;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.hawkbit.mgmt.json.model.distributionsettype.MgmtDistributionSetTypeRequestBodyPos...`
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/targettype/MgmtTargetTypeRequestBodyPost.java`
#### Snippet
```java
import com.fasterxml.jackson.annotation.JsonProperty;
import org.eclipse.hawkbit.mgmt.json.model.distributionsettype.MgmtDistributionSetTypeAssignment;
import org.eclipse.hawkbit.mgmt.json.model.distributionsettype.MgmtDistributionSetTypeRequestBodyPost;
import org.eclipse.hawkbit.mgmt.json.model.softwaremoduletype.MgmtSoftwareModuleTypeAssigment;

```

### UNUSED_IMPORT
Unused import `import org.eclipse.hawkbit.mgmt.json.model.softwaremoduletype.MgmtSoftwareModuleTypeAssigment;`
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/targettype/MgmtTargetTypeRequestBodyPost.java`
#### Snippet
```java
import org.eclipse.hawkbit.mgmt.json.model.distributionsettype.MgmtDistributionSetTypeAssignment;
import org.eclipse.hawkbit.mgmt.json.model.distributionsettype.MgmtDistributionSetTypeRequestBodyPost;
import org.eclipse.hawkbit.mgmt.json.model.softwaremoduletype.MgmtSoftwareModuleTypeAssigment;

/**
```

### UNUSED_IMPORT
Unused import `import org.eclipse.hawkbit.repository.model.Artifact;`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtSoftwareModuleTypeResource.java`
#### Snippet
```java
import org.eclipse.hawkbit.repository.SoftwareModuleTypeManagement;
import org.eclipse.hawkbit.repository.exception.EntityNotFoundException;
import org.eclipse.hawkbit.repository.model.Artifact;
import org.eclipse.hawkbit.repository.model.SoftwareModule;
import org.eclipse.hawkbit.repository.model.SoftwareModuleType;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.hawkbit.repository.model.SoftwareModule;`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtSoftwareModuleTypeResource.java`
#### Snippet
```java
import org.eclipse.hawkbit.repository.exception.EntityNotFoundException;
import org.eclipse.hawkbit.repository.model.Artifact;
import org.eclipse.hawkbit.repository.model.SoftwareModule;
import org.eclipse.hawkbit.repository.model.SoftwareModuleType;
import org.springframework.data.domain.Page;
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `configurationChangeListeners` are updated, but never queried
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/tenantconfiguration/BaseConfigurationView.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private final List<ConfigurationItemChangeListener> configurationChangeListeners = new ArrayList<>();
    private final transient TenantConfigurationManagement tenantConfigurationManagement;
    private final Binder<B> binder;
```

### MismatchedCollectionQueryUpdate
Contents of collection `assignedToDistributionSet` are queried, but never updated
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaDistributionSetTag.java`
#### Snippet
```java
    @CascadeOnDelete
    @ManyToMany(mappedBy = "tags", targetEntity = JpaDistributionSet.class, fetch = FetchType.LAZY)
    private List<DistributionSet> assignedToDistributionSet;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `assignedToTargets` are queried, but never updated
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTargetTag.java`
#### Snippet
```java
    @CascadeOnDelete
    @ManyToMany(mappedBy = "tags", targetEntity = JpaTarget.class, fetch = FetchType.LAZY)
    private List<Target> assignedToTargets;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `metadata` are queried, but never updated
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTarget.java`
#### Snippet
```java
    @CascadeOnDelete
    @OneToMany(mappedBy = "target", fetch = FetchType.LAZY, targetEntity = JpaTargetMetadata.class)
    private List<TargetMetadata> metadata;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "target", orphanRemoval = true)
```

### MismatchedCollectionQueryUpdate
Contents of collection `rolloutTargetGroup` are queried, but never updated
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTarget.java`
#### Snippet
```java
    @CascadeOnDelete
    @OneToMany(mappedBy = "target", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST })
    private List<RolloutTargetGroup> rolloutTargetGroup;

    @Column(name = "address", length = Target.ADDRESS_MAX_SIZE)
```

### MismatchedCollectionQueryUpdate
Contents of collection `metadata` are queried, but never updated
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaDistributionSet.java`
#### Snippet
```java
    @CascadeOnDelete
    @OneToMany(mappedBy = "distributionSet", fetch = FetchType.LAZY, targetEntity = JpaDistributionSetMetadata.class)
    private List<DistributionSetMetadata> metadata;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, targetEntity = JpaDistributionSetType.class)
```

### MismatchedCollectionQueryUpdate
Contents of collection `actions` are queried, but never updated
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaDistributionSet.java`
#### Snippet
```java

    @OneToMany(mappedBy = "distributionSet", targetEntity = JpaAction.class, fetch = FetchType.LAZY)
    private List<JpaAction> actions;

    @CascadeOnDelete
```

### MismatchedCollectionQueryUpdate
Contents of collection `assignedTo` are queried, but never updated
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaSoftwareModule.java`
#### Snippet
```java
    @CascadeOnDelete
    @ManyToMany(mappedBy = "modules", targetEntity = JpaDistributionSet.class, fetch = FetchType.LAZY)
    private List<DistributionSet> assignedTo;

    @Column(name = "deleted")
```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing unmodifiableList
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDistributionSetTagManagement.java`
#### Snippet
```java
        return Collections.unmodifiableList(
                creates.stream().map(create -> distributionSetTagRepository.save(create.buildDistributionSetTag()))
                        .collect(Collectors.toList()));
    }

```

### FuseStreamOperations
Stream may be extended replacing unmodifiableList
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaTargetTagManagement.java`
#### Snippet
```java

        return Collections.unmodifiableList(targetTags.stream()
                .map(ttc -> targetTagRepository.save(ttc.buildTargetTag())).collect(Collectors.toList()));
    }

```

### FuseStreamOperations
Stream may be extended replacing unmodifiableList
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDistributionSetManagement.java`
#### Snippet
```java
                .map(meta -> distributionSetMetadataRepository
                        .save(new JpaDistributionSetMetadata(meta.getKey(), set, meta.getValue())))
                .collect(Collectors.toList()));
    }

```

### FuseStreamOperations
Stream may be extended replacing unmodifiableList
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDistributionSetManagement.java`
#### Snippet
```java

        final List<DistributionSet> result = Collections
                .unmodifiableList(allDs.stream().map(distributionSetRepository::save).collect(Collectors.toList()));

        // No reason to save the tag
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `tagNames`, unclear if a varargs or non-varargs call is desired
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
        }
        if (isAtLeastOneTagActive(tagNames)) {
            hasTagsPredicates.add(exp.in(tagNames));
        }

```

## RuleId[id=InfiniteRecursion]
### InfiniteRecursion
Method `count()` recurses infinitely, and can only end by throwing an exception
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/TargetTypeRepository.java`
#### Snippet
```java
     */
    @Override
    default long count() {
        return this.count(Specification.where(null));
    }
```

### InfiniteRecursion
Method `count()` recurses infinitely, and can only end by throwing an exception
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/TargetRepository.java`
#### Snippet
```java
     */
    @Override
    default long count() {
        return this.count(Specification.where(null));
    }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `message` initializer `""` is redundant
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/components/NotificationUnreadButton.java`
#### Snippet
```java
        final EventNotificationType notificationType = remotelyOriginatedEvent.getKey();
        final int modifiedEntitiesCount = remotelyOriginatedEvent.getValue().getEntityIds().size();
        String message = "";
        if (modifiedEntitiesCount == 1) {
            message = i18n.getMessage(notificationType.getNotificationMessageKeySing());
```

### UnusedAssignment
Variable `buttonDecorator` initializer `null` is redundant
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/components/SPUIComponentProvider.java`
#### Snippet
```java
            final Class<? extends SPUIButtonDecorator> buttonDecoratorclassName) {
        Button button = null;
        SPUIButtonDecorator buttonDecorator = null;
        try {
            // Create instance
```

### UnusedAssignment
Variable `consequencesText` initializer `""` is redundant
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/dstable/InvalidateDsAffectedEntitiesDialog.java`
#### Snippet
```java

    private String createConsequencesText(final List<ProxyDistributionSet> allDistributionSetsForInvalidation) {
        String consequencesText = "";
        if (allDistributionSetsForInvalidation.size() == 1) {
            final ProxyDistributionSet distributionSet = allDistributionSetsForInvalidation.get(0);
```

### UnusedAssignment
Variable `caption` initializer `""` is redundant
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/dstable/InvalidateDsConsequencesDialog.java`
#### Snippet
```java

    private String createCaption(final List<ProxyDistributionSet> allDistributionSetsForInvalidation) {
        String caption = "";
        if (allDistributionSetsForInvalidation.size() == 1) {
            caption = i18n.getMessage(UIMessageIdProvider.CAPTION_INVALIDATE_DISTRIBUTIONSET_CONSEQUENCES_SINGULAR,
```

### UnusedAssignment
Variable `failureNotificationText` initializer `""` is redundant
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/dstable/InvalidateDistributionSetSupport.java`
#### Snippet
```java

    private String createFailureNotificationText(final List<ProxyDistributionSet> allDistributionSetsForInvalidation) {
        String failureNotificationText = "";
        if (allDistributionSetsForInvalidation.size() == 1) {
            failureNotificationText = i18n.getMessage(
```

### UnusedAssignment
Variable `successNotificationText` initializer `""` is redundant
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/dstable/InvalidateDistributionSetSupport.java`
#### Snippet
```java

    private String createSuccessNotificationText(final List<ProxyDistributionSet> allDistributionSetsForInvalidation) {
        String successNotificationText = "";
        if (allDistributionSetsForInvalidation.size() == 1) {
            successNotificationText = i18n.getMessage(
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageHandlerService.java`
#### Snippet
```java
        }

        return findActionWithDetails.get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java
        rolloutHandler.handleAll();

        return rolloutManagement.get(rollout.getId()).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java

        // load also lazy stuff
        return distributionSetManagement.getWithDetails(set.getId()).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java
        tags.forEach(tag -> distributionSetManagement.toggleTagAssignment(Arrays.asList(set.getId()), tag.getName()));

        return distributionSetManagement.get(set.getId()).get();

    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtSoftwareModuleResource.java`
#### Snippet
```java
        final SoftwareModule module = findSoftwareModuleWithExceptionIfNotFound(softwareModuleId, artifactId);

        final MgmtArtifact reponse = MgmtSoftwareModuleMapper.toResponse(module.getArtifact(artifactId).get());
        if (!module.isDeleted()) {
            MgmtSoftwareModuleMapper.addLinks(module.getArtifact(artifactId).get(), reponse);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtSoftwareModuleResource.java`
#### Snippet
```java
        final MgmtArtifact reponse = MgmtSoftwareModuleMapper.toResponse(module.getArtifact(artifactId).get());
        if (!module.isDeleted()) {
            MgmtSoftwareModuleMapper.addLinks(module.getArtifact(artifactId).get(), reponse);
        }

```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `throwable instanceof ListenerExecutionFailedException` is always `true`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpErrorMessageComposer.java`
#### Snippet
```java
        final String mainErrorMsg = throwable.getCause().getMessage();

        if (throwable instanceof ListenerExecutionFailedException) {
            Collection<Message> failedMessages = ((ListenerExecutionFailedException) throwable).getFailedMessages();
            // since the intended message content is always on top of the collection, we only extract the first one
```

### ConstantValue
Condition `cause instanceof MessageHandlingException` is always `false`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/DelayedRequeueExceptionStrategy.java`
#### Snippet
```java
    private static boolean isMessageException(final Throwable cause) {
        return cause instanceof InvalidTargetAddressException || cause instanceof MessageConversionException
                || cause instanceof MessageHandlingException;
    }
}
```

### ConstantValue
Value `cause` is always 'null'
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/DelayedRequeueExceptionStrategy.java`
#### Snippet
```java
    private static boolean isMessageException(final Throwable cause) {
        return cause instanceof InvalidTargetAddressException || cause instanceof MessageConversionException
                || cause instanceof MessageHandlingException;
    }
}
```

### ConstantValue
Value `accessException` is always 'null'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/HawkBitEclipseLinkJpaDialect.java`
#### Snippet
```java
            final DataAccessException accessException) {
        if (!(accessException instanceof JpaSystemException)) {
            return accessException;
        }

```

### ConstantValue
Condition `bypassWeightEnforcement` is always `true`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/utils/WeightValidationHelper.java`
#### Snippet
```java
        if (!multiAssignmentsEnabled && hasWeight) {
            throw new MultiAssignmentIsNotEnabledException();
        } else if (bypassWeightEnforcement) {
            return;
        } else if (multiAssignmentsEnabled && hasNoWeight) {
```

### ConstantValue
Value `key` is always 'null'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/builder/JpaSoftwareModuleMetadataCreate.java`
#### Snippet
```java

        if (key == null) {
            new JpaSoftwareModuleMetadata(key, module, value, isTargetVisible().orElse(false));
        }

```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/matcher/EventVerifier.java`
#### Snippet
```java
                final Class<?> element = itr.next();
                final int count = eventCaptor.getCountFor(element);
                failMessage.append(element + " with count: " + count + " ");
            }
            fail(failMessage.toString());
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/ArtifactUploadState.java`
#### Snippet
```java
            final int failedUploadCount) {
        final StringBuilder buffer = new StringBuilder();
        buffer.append("Overall uploads: " + overallUploadCount);
        buffer.append("| succeeded uploads: " + succeededUploadCount);
        buffer.append("| Failed Uploads: " + failedUploadCount);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/ArtifactUploadState.java`
#### Snippet
```java
        final StringBuilder buffer = new StringBuilder();
        buffer.append("Overall uploads: " + overallUploadCount);
        buffer.append("| succeeded uploads: " + succeededUploadCount);
        buffer.append("| Failed Uploads: " + failedUploadCount);
        return buffer.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/ArtifactUploadState.java`
#### Snippet
```java
        buffer.append("Overall uploads: " + overallUploadCount);
        buffer.append("| succeeded uploads: " + succeededUploadCount);
        buffer.append("| Failed Uploads: " + failedUploadCount);
        return buffer.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java
        if (!CollectionUtils.isEmpty(expectedTokens)) {
            final StringBuilder tokens = new StringBuilder();
            expectedTokens.stream().forEach(value -> tokens.append(value.getSuggestion() + ","));
            builder = builder.concat("Was expecting :" + tokens.toString().substring(0, tokens.length() - 1));
        }
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/MessageConversionExceptionHandler.java`
#### Snippet
```java
        // and append it to the errorMessage
        final Optional<String> detailedErrorMessage = getFirstAncestralErrorMessage(throwable.getCause());
        return detailedErrorMessage.isPresent()? (detailedErrorMessage.get() + errorMessage) : errorMessage;
    }

```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/error/HawkbitUIErrorHandler.java`
#### Snippet
```java

        final Optional<Page> errorOriginPage = getErrorOriginPage(event);
        if (errorOriginPage.isPresent()) {
            return errorOriginPage.get();
        }
```

## RuleId[id=ReplaceInefficientStreamCount]
### ReplaceInefficientStreamCount
Can be replaced with 'stream.anyMatch()'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java
        private static boolean containsValue(final String imageName) {
            if (!imageName.contains(".")) {
                return FIELD_NAMES.stream().filter(value -> value.equalsIgnoreCase(imageName)).count() > 0;
            }
            final String[] split = imageName.split("\\.");
```

### ReplaceInefficientStreamCount
Can be replaced with 'stream.anyMatch()'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java
            if (split.length > 1 && FIELD_NAMES.contains(split[0].toLowerCase())) {
                return SUB_NAMES.get(split[0].toLowerCase()).stream()
                        .filter(subname -> (split[0] + "." + subname).equalsIgnoreCase(imageName)).count() > 0;
            }
            return FIELD_NAMES.stream().filter(value -> value.equalsIgnoreCase(imageName)).count() > 0;
```

### ReplaceInefficientStreamCount
Can be replaced with 'stream.anyMatch()'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java
                        .filter(subname -> (split[0] + "." + subname).equalsIgnoreCase(imageName)).count() > 0;
            }
            return FIELD_NAMES.stream().filter(value -> value.equalsIgnoreCase(imageName)).count() > 0;
        }

```

### ReplaceInefficientStreamCount
Can be replaced with 'Stream.mapToLong().sum()'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java
            return Arrays.stream(TargetFields.values())
                    .filter(field -> field.toString().equalsIgnoreCase(finalTmpTokenName))
                    .map(TargetFields::getSubEntityAttributes).flatMap(List::stream).count() > 0;
        }

```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Throwable' to 'T'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/error/extractors/UiErrorDetailsExtractor.java`
#### Snippet
```java
    default <T> Optional<T> findExceptionOf(final Throwable error, final Class<T> exceptionType) {
        if (exceptionType.isAssignableFrom(error.getClass())) {
            return Optional.of((T) error);
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/providers/ActionStatusMsgDataProvider.java`
#### Snippet
```java

    private List<ProxyMessage> createProxyMessages(final Slice<String> messages) {
        final List<ProxyMessage> proxyMsgs = new ArrayList<>(messages.getNumberOfElements());

        Long idx = messages.getNumber() * ((long) messages.getSize());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.function.BiConsumer\>' to 'java.util.function.BiConsumer'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/FilterSupport.java`
#### Snippet
```java
     */
    public <R> void updateFilter(final FilterType filterType, final R filterValue) {
        updateFilter((BiConsumer<F, R>) filterTypeToSetterMapping.get(filterType).getSetter(), filterValue);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/assignment/AssignmentSupport.java`
#### Snippet
```java
        // sourceItemsToAssign are of type UnmodifiableRandomAccessList
        if (sourceItemsToAssign instanceof List) {
            assignSourceItemsToTargetItem((List<S>) sourceItemsToAssign, targetItem);
        } else {
            showErrorNotification();
```

### UNCHECKED_WARNING
Unchecked cast: 'com.vaadin.client.widget.grid.CellReference\>' to 'com.vaadin.client.widget.grid.CellReference'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/selection/client/RangeSelectionHandler.java`
#### Snippet
```java
    @Override
    public void onClick(final GridClickEvent event) {
        final CellReference<JsonObject> eventCell = (CellReference<JsonObject>) event.getTargetCell();
        final SelectionModel<JsonObject> selectionModel = eventCell.getGrid().getSelectionModel();
        final int currentRowIndex = eventCell.getRowIndex();
```

### UNCHECKED_WARNING
Unchecked cast: 'com.vaadin.client.widget.grid.CellReference\>' to 'com.vaadin.client.widget.grid.CellReference'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/selection/client/RangeSelectionHandler.java`
#### Snippet
```java
    public void onKeyUp(final GridKeyUpEvent event) {
        if (event.isDownArrow() || event.isUpArrow()) {
            final CellReference<JsonObject> eventCell = (CellReference<JsonObject>) event.getFocusedCell();
            final SelectionModel<JsonObject> selectionModel = eventCell.getGrid().getSelectionModel();
            final int currentRowIndex = eventCell.getRowIndex();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.ui.common.builder.AbstractTextFieldBuilder' to 'T'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/AbstractTextFieldBuilder.java`
#### Snippet
```java
    public T enabled(final boolean enabled) {
        this.enabled = enabled;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.ui.common.builder.AbstractTextFieldBuilder' to 'T'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/AbstractTextFieldBuilder.java`
#### Snippet
```java
    public T readOnly(final boolean readOnly) {
        this.readOnly = readOnly;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.ui.common.builder.AbstractTextFieldBuilder' to 'T'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/AbstractTextFieldBuilder.java`
#### Snippet
```java
    public T style(final String style) {
        this.style = style;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.ui.common.builder.AbstractTextFieldBuilder' to 'T'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/AbstractTextFieldBuilder.java`
#### Snippet
```java
    public T styleName(final String styleName) {
        this.styleName = styleName;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.ui.common.builder.AbstractTextFieldBuilder' to 'T'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/AbstractTextFieldBuilder.java`
#### Snippet
```java
    public T id(final String id) {
        this.id = id;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.ui.common.builder.AbstractTextFieldBuilder' to 'T'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/AbstractTextFieldBuilder.java`
#### Snippet
```java
    public T prompt(final String prompt) {
        this.prompt = prompt;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.ui.common.builder.AbstractTextFieldBuilder' to 'T'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/AbstractTextFieldBuilder.java`
#### Snippet
```java
        this.caption = caption;
        this.prompt = caption;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'org.eclipse.hawkbit.ui.management.dstable.DistributionGrid', required 'org.eclipse.hawkbit.ui.common.distributionset.AbstractDsGrid'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/dstable/DistributionGridLayout.java`
#### Snippet
```java

    @Override
    public DistributionGrid getDistributionGrid() {
        return distributionGrid;
    }
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'org.eclipse.hawkbit.ui.distributions.dstable.DistributionSetGrid', required 'org.eclipse.hawkbit.ui.common.distributionset.AbstractDsGrid'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/distributions/dstable/DistributionSetGridLayout.java`
#### Snippet
```java

    @Override
    public DistributionSetGrid getDistributionGrid() {
        return distributionSetGrid;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.EnumMap' to 'java.util.EnumMap'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDeploymentManagement.java`
#### Snippet
```java

    static {
        QUERY_DELETE_ACTIONS_BY_STATE_AND_LAST_MODIFIED = new EnumMap<>(Database.class);
        QUERY_DELETE_ACTIONS_BY_STATE_AND_LAST_MODIFIED.put(Database.SQL_SERVER, "DELETE TOP (" + ACTION_PAGE_LIMIT
                + ") FROM sp_action WHERE tenant=#tenant AND status IN (%s) AND last_modified_at<#last_modified_at ");
```

### UNCHECKED_WARNING
Unchecked call to 'EnumMap(Class)' as a member of raw type 'java.util.EnumMap'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDeploymentManagement.java`
#### Snippet
```java

    static {
        QUERY_DELETE_ACTIONS_BY_STATE_AND_LAST_MODIFIED = new EnumMap<>(Database.class);
        QUERY_DELETE_ACTIONS_BY_STATE_AND_LAST_MODIFIED.put(Database.SQL_SERVER, "DELETE TOP (" + ACTION_PAGE_LIMIT
                + ") FROM sp_action WHERE tenant=#tenant AND status IN (%s) AND last_modified_at<#last_modified_at ");
```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractDistributionSetTypeUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractDistributionSetTypeUpdateCreate.java`
#### Snippet
```java
    public T mandatory(final Collection<Long> mandatory) {
        this.mandatory = mandatory;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractDistributionSetTypeUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractDistributionSetTypeUpdateCreate.java`
#### Snippet
```java
    public T colour(final String colour) {
        this.colour = StringUtils.trimWhitespace(colour);
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractDistributionSetTypeUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractDistributionSetTypeUpdateCreate.java`
#### Snippet
```java
    public T optional(final Collection<Long> optional) {
        this.optional = optional;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractDistributionSetTypeUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractDistributionSetTypeUpdateCreate.java`
#### Snippet
```java
    public T key(final String key) {
        this.key = StringUtils.trimWhitespace(key);
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractSoftwareModuleMetadataUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractSoftwareModuleMetadataUpdateCreate.java`
#### Snippet
```java
    public T targetVisible(final Boolean targetVisible) {
        this.targetVisible = targetVisible;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractSoftwareModuleMetadataUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractSoftwareModuleMetadataUpdateCreate.java`
#### Snippet
```java
    public T softwareModuleId(final long softwareModuleId) {
        this.softwareModuleId = softwareModuleId;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractTagUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractTagUpdateCreate.java`
#### Snippet
```java
    public T colour(final String colour) {
        this.colour = StringUtils.trimWhitespace(colour);
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractRolloutGroupCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractRolloutGroupCreate.java`
#### Snippet
```java
    public T confirmationRequired(final boolean confirmationRequired) {
        this.confirmationRequired = confirmationRequired;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractRolloutGroupCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractRolloutGroupCreate.java`
#### Snippet
```java
    public T targetPercentage(final Float targetPercentage) {
        this.targetPercentage = targetPercentage;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractRolloutGroupCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractRolloutGroupCreate.java`
#### Snippet
```java
    public T conditions(final RolloutGroupConditions conditions) {
        this.conditions = conditions;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractRolloutGroupCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractRolloutGroupCreate.java`
#### Snippet
```java
    public T targetFilterQuery(final String targetFilterQuery) {
        this.targetFilterQuery = StringUtils.trimWhitespace(targetFilterQuery);
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractMetadataUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractMetadataUpdateCreate.java`
#### Snippet
```java
    public T value(final String value) {
        this.value = StringUtils.trimWhitespace(value);
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractMetadataUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractMetadataUpdateCreate.java`
#### Snippet
```java
    public T key(final String key) {
        this.key = StringUtils.trimWhitespace(key);
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractDistributionSetUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractDistributionSetUpdateCreate.java`
#### Snippet
```java
    public T requiredMigrationStep(final Boolean requiredMigrationStep) {
        this.requiredMigrationStep = requiredMigrationStep;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractDistributionSetUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractDistributionSetUpdateCreate.java`
#### Snippet
```java
    public T version(final String version) {
        this.version = StringUtils.trimWhitespace(version);
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractDistributionSetUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractDistributionSetUpdateCreate.java`
#### Snippet
```java
    public T modules(final Collection<Long> modules) {
        this.modules = modules;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractSoftwareModuleTypeUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractSoftwareModuleTypeUpdateCreate.java`
#### Snippet
```java
    public T key(final String key) {
        this.key = StringUtils.trimWhitespace(key);
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractSoftwareModuleTypeUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractSoftwareModuleTypeUpdateCreate.java`
#### Snippet
```java
    public T colour(final String colour) {
        this.colour = StringUtils.trimWhitespace(colour);
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractSoftwareModuleTypeUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractSoftwareModuleTypeUpdateCreate.java`
#### Snippet
```java
    public T maxAssignments(final int maxAssignments) {
        this.maxAssignments = maxAssignments;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractTargetUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractTargetUpdateCreate.java`
#### Snippet
```java
    public T status(final TargetUpdateStatus status) {
        this.status = status;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractTargetUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractTargetUpdateCreate.java`
#### Snippet
```java
    public T lastTargetQuery(final Long lastTargetQuery) {
        this.lastTargetQuery = lastTargetQuery;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractTargetUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractTargetUpdateCreate.java`
#### Snippet
```java
        }
        this.address = address;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractTargetUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractTargetUpdateCreate.java`
#### Snippet
```java
    public T securityToken(final String securityToken) {
        this.securityToken = StringUtils.trimWhitespace(securityToken);
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractTargetUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractTargetUpdateCreate.java`
#### Snippet
```java
    public T targetType(final Long targetTypeId) {
        this.targetTypeId = targetTypeId;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractTargetUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractTargetUpdateCreate.java`
#### Snippet
```java
    public T requestAttributes(final Boolean requestAttributes) {
        this.requestAttributes = requestAttributes;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractTargetTypeUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractTargetTypeUpdateCreate.java`
#### Snippet
```java
    public T colour(final String colour) {
        this.colour = StringUtils.trimWhitespace(colour);
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractTargetTypeUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractTargetTypeUpdateCreate.java`
#### Snippet
```java
    public T compatible(final Collection<Long> compatible) {
        this.compatible = compatible;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractSoftwareModuleUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractSoftwareModuleUpdateCreate.java`
#### Snippet
```java
    public T vendor(final String vendor) {
        this.vendor = StringUtils.trimWhitespace(vendor);
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractSoftwareModuleUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractSoftwareModuleUpdateCreate.java`
#### Snippet
```java
    public T type(final String type) {
        this.type = StringUtils.trimWhitespace(type);
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractSoftwareModuleUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractSoftwareModuleUpdateCreate.java`
#### Snippet
```java
    public T version(final String version) {
        this.version = StringUtils.trimWhitespace(version);
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractRolloutUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractRolloutUpdateCreate.java`
#### Snippet
```java
    public T actionType(final ActionType actionType) {
        this.actionType = actionType;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractRolloutUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractRolloutUpdateCreate.java`
#### Snippet
```java
    public T forcedTime(final Long forcedTime) {
        this.forcedTime = forcedTime;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractRolloutUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractRolloutUpdateCreate.java`
#### Snippet
```java
    public T set(final long set) {
        this.set = set;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractTargetFilterQueryUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractTargetFilterQueryUpdateCreate.java`
#### Snippet
```java
    public T confirmationRequired(final boolean confirmationRequired) {
        this.confirmationRequired = confirmationRequired;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractTargetFilterQueryUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractTargetFilterQueryUpdateCreate.java`
#### Snippet
```java
    public T query(final String query) {
        this.query = StringUtils.trimWhitespace(query);
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractTargetFilterQueryUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractTargetFilterQueryUpdateCreate.java`
#### Snippet
```java
    public T name(final String name) {
        this.name = StringUtils.trimWhitespace(name);
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractTargetFilterQueryUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractTargetFilterQueryUpdateCreate.java`
#### Snippet
```java
    public T autoAssignDistributionSet(final Long distributionSetId) {
        this.distributionSetId = distributionSetId;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractTargetFilterQueryUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractTargetFilterQueryUpdateCreate.java`
#### Snippet
```java
    public T autoAssignWeight(final Integer weight) {
        this.weight = weight;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractTargetFilterQueryUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractTargetFilterQueryUpdateCreate.java`
#### Snippet
```java
    public T autoAssignActionType(final ActionType actionType) {
        this.actionType = actionType;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractRolloutUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractRolloutUpdateCreate.java`
#### Snippet
```java
    public T targetFilterQuery(final String targetFilterQuery) {
        this.targetFilterQuery = StringUtils.trimWhitespace(targetFilterQuery);
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractRolloutUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractRolloutUpdateCreate.java`
#### Snippet
```java
    public T startAt(final Long startAt) {
        this.startAt = startAt;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractRolloutUpdateCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractRolloutUpdateCreate.java`
#### Snippet
```java
    public T weight(final Integer weight) {
        this.weight = weight;
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractActionStatusCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractActionStatusCreate.java`
#### Snippet
```java
        }

        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractActionStatusCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractActionStatusCreate.java`
#### Snippet
```java
        this.messages.add(StringUtils.trimWhitespace(message));

        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractActionStatusCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractActionStatusCreate.java`
#### Snippet
```java
        this.code = code;

        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractActionStatusCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractActionStatusCreate.java`
#### Snippet
```java
        this.occurredAt = occurredAt;

        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractActionStatusCreate' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractActionStatusCreate.java`
#### Snippet
```java
        this.status = status;

        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractNamedEntityBuilder' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractNamedEntityBuilder.java`
#### Snippet
```java
    public T name(final String name) {
        this.name = StringUtils.trimWhitespace(name);
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.hawkbit.repository.builder.AbstractNamedEntityBuilder' to 'T'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractNamedEntityBuilder.java`
#### Snippet
```java
    public T description(final String description) {
        this.description = StringUtils.trimWhitespace(description);
        return (T) this;
    }

```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `RolloutStatus`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     * Process rollout based on its current {@link Rollout#getStatus()}.
     *
     * For {@link RolloutStatus#CREATING} that means creating the
     * {@link RolloutGroup}s with {@link Target}s and when finished switch to
     * {@link RolloutStatus#READY}.
```

### JavadocReference
Cannot resolve symbol `pageable`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutGroupManagement.java`
#### Snippet
```java
     * @param rolloutId
     *            the ID of the rollout to filter the {@link RolloutGroup}s
     * @param pageable
     *            the page request to sort and limit the result
     * @return a page of found {@link RolloutGroup}s
```

### JavadocReference
Cannot resolve symbol `CREATING`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     * Process rollout based on its current {@link Rollout#getStatus()}.
     *
     * For {@link RolloutStatus#CREATING} that means creating the
     * {@link RolloutGroup}s with {@link Target}s and when finished switch to
     * {@link RolloutStatus#READY}.
```

### JavadocReference
Cannot resolve symbol `RolloutGroup`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     *
     * For {@link RolloutStatus#CREATING} that means creating the
     * {@link RolloutGroup}s with {@link Target}s and when finished switch to
     * {@link RolloutStatus#READY}.
     *
```

### JavadocReference
Cannot resolve symbol `RolloutStatus`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     * For {@link RolloutStatus#CREATING} that means creating the
     * {@link RolloutGroup}s with {@link Target}s and when finished switch to
     * {@link RolloutStatus#READY}.
     *
     * For {@link RolloutStatus#READY} that means switching to
```

### JavadocReference
Cannot resolve symbol `READY`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     * For {@link RolloutStatus#CREATING} that means creating the
     * {@link RolloutGroup}s with {@link Target}s and when finished switch to
     * {@link RolloutStatus#READY}.
     *
     * For {@link RolloutStatus#READY} that means switching to
```

### JavadocReference
Cannot resolve symbol `RolloutStatus`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     * {@link RolloutStatus#READY}.
     *
     * For {@link RolloutStatus#READY} that means switching to
     * {@link RolloutStatus#STARTING} if the {@link Rollout#getStartAt()} is set
     * and time of calling this method is beyond this point in time. This auto
```

### JavadocReference
Cannot resolve symbol `READY`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     * {@link RolloutStatus#READY}.
     *
     * For {@link RolloutStatus#READY} that means switching to
     * {@link RolloutStatus#STARTING} if the {@link Rollout#getStartAt()} is set
     * and time of calling this method is beyond this point in time. This auto
```

### JavadocReference
Cannot resolve symbol `RolloutStatus`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     *
     * For {@link RolloutStatus#READY} that means switching to
     * {@link RolloutStatus#STARTING} if the {@link Rollout#getStartAt()} is set
     * and time of calling this method is beyond this point in time. This auto
     * start mechanism is optional. Call {@link #start(Long)} otherwise.
```

### JavadocReference
Cannot resolve symbol `STARTING`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     *
     * For {@link RolloutStatus#READY} that means switching to
     * {@link RolloutStatus#STARTING} if the {@link Rollout#getStartAt()} is set
     * and time of calling this method is beyond this point in time. This auto
     * start mechanism is optional. Call {@link #start(Long)} otherwise.
```

### JavadocReference
Cannot resolve symbol `start(Long)`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     * {@link RolloutStatus#STARTING} if the {@link Rollout#getStartAt()} is set
     * and time of calling this method is beyond this point in time. This auto
     * start mechanism is optional. Call {@link #start(Long)} otherwise.
     *
     * For {@link RolloutStatus#STARTING} that means starting the first
```

### JavadocReference
Cannot resolve symbol `RolloutStatus`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     * start mechanism is optional. Call {@link #start(Long)} otherwise.
     *
     * For {@link RolloutStatus#STARTING} that means starting the first
     * {@link RolloutGroup}s in line and when finished switch to
     * {@link RolloutStatus#RUNNING}.
```

### JavadocReference
Cannot resolve symbol `STARTING`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     * start mechanism is optional. Call {@link #start(Long)} otherwise.
     *
     * For {@link RolloutStatus#STARTING} that means starting the first
     * {@link RolloutGroup}s in line and when finished switch to
     * {@link RolloutStatus#RUNNING}.
```

### JavadocReference
Cannot resolve symbol `RolloutGroup`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     *
     * For {@link RolloutStatus#STARTING} that means starting the first
     * {@link RolloutGroup}s in line and when finished switch to
     * {@link RolloutStatus#RUNNING}.
     *
```

### JavadocReference
Cannot resolve symbol `RolloutStatus`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     * For {@link RolloutStatus#STARTING} that means starting the first
     * {@link RolloutGroup}s in line and when finished switch to
     * {@link RolloutStatus#RUNNING}.
     *
     * For {@link RolloutStatus#RUNNING} that means checking to activate further
```

### JavadocReference
Cannot resolve symbol `RUNNING`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     * For {@link RolloutStatus#STARTING} that means starting the first
     * {@link RolloutGroup}s in line and when finished switch to
     * {@link RolloutStatus#RUNNING}.
     *
     * For {@link RolloutStatus#RUNNING} that means checking to activate further
```

### JavadocReference
Cannot resolve symbol `RolloutStatus`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     * {@link RolloutStatus#RUNNING}.
     *
     * For {@link RolloutStatus#RUNNING} that means checking to activate further
     * groups based on the defined thresholds. Switched to
     * {@link RolloutStatus#FINISHED} is all groups are finished.
```

### JavadocReference
Cannot resolve symbol `RUNNING`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     * {@link RolloutStatus#RUNNING}.
     *
     * For {@link RolloutStatus#RUNNING} that means checking to activate further
     * groups based on the defined thresholds. Switched to
     * {@link RolloutStatus#FINISHED} is all groups are finished.
```

### JavadocReference
Cannot resolve symbol `RolloutStatus`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     * For {@link RolloutStatus#RUNNING} that means checking to activate further
     * groups based on the defined thresholds. Switched to
     * {@link RolloutStatus#FINISHED} is all groups are finished.
     *
     * For {@link RolloutStatus#DELETING} that means either soft delete in case
```

### JavadocReference
Cannot resolve symbol `FINISHED`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     * For {@link RolloutStatus#RUNNING} that means checking to activate further
     * groups based on the defined thresholds. Switched to
     * {@link RolloutStatus#FINISHED} is all groups are finished.
     *
     * For {@link RolloutStatus#DELETING} that means either soft delete in case
```

### JavadocReference
Cannot resolve symbol `RolloutStatus`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     * {@link RolloutStatus#FINISHED} is all groups are finished.
     *
     * For {@link RolloutStatus#DELETING} that means either soft delete in case
     * rollout was already {@link RolloutStatus#RUNNING} which results in status
     * change {@link RolloutStatus#DELETED} or hard delete from the persistence
```

### JavadocReference
Cannot resolve symbol `DELETING`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     * {@link RolloutStatus#FINISHED} is all groups are finished.
     *
     * For {@link RolloutStatus#DELETING} that means either soft delete in case
     * rollout was already {@link RolloutStatus#RUNNING} which results in status
     * change {@link RolloutStatus#DELETED} or hard delete from the persistence
```

### JavadocReference
Cannot resolve symbol `RolloutStatus`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     *
     * For {@link RolloutStatus#DELETING} that means either soft delete in case
     * rollout was already {@link RolloutStatus#RUNNING} which results in status
     * change {@link RolloutStatus#DELETED} or hard delete from the persistence
     * otherwise.
```

### JavadocReference
Cannot resolve symbol `RUNNING`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     *
     * For {@link RolloutStatus#DELETING} that means either soft delete in case
     * rollout was already {@link RolloutStatus#RUNNING} which results in status
     * change {@link RolloutStatus#DELETED} or hard delete from the persistence
     * otherwise.
```

### JavadocReference
Cannot resolve symbol `RolloutStatus`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     * For {@link RolloutStatus#DELETING} that means either soft delete in case
     * rollout was already {@link RolloutStatus#RUNNING} which results in status
     * change {@link RolloutStatus#DELETED} or hard delete from the persistence
     * otherwise.
     *
```

### JavadocReference
Cannot resolve symbol `DELETED`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutExecutor.java`
#### Snippet
```java
     * For {@link RolloutStatus#DELETING} that means either soft delete in case
     * rollout was already {@link RolloutStatus#RUNNING} which results in status
     * change {@link RolloutStatus#DELETED} or hard delete from the persistence
     * otherwise.
     *
```

### JavadocReference
Cannot resolve symbol `Page`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/DeploymentManagement.java`
#### Snippet
```java
     * @param pageable
     *            the pagination parameter
     * @return {@link Page} of {@link ActionStatus} entries
     */
    @PreAuthorize(SpringEvalExpressions.HAS_AUTH_READ_TARGET)
```

### JavadocReference
Cannot resolve symbol `pageable`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/DeploymentManagement.java`
#### Snippet
```java
     *
     *
     * @param pageable
     *            the page request parameter for paging and sorting the result
     * @param actionStatusId
```

### JavadocReference
Cannot resolve symbol `Page`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/DeploymentManagement.java`
#### Snippet
```java
     * @param actionId
     *            to be filtered on
     * @return the corresponding {@link Page} of {@link ActionStatus}
     *
     * @throws EntityNotFoundException
```

### JavadocReference
Cannot resolve symbol `getTags()`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/ControllerManagement.java`
#### Snippet
```java
    /**
     * Finds {@link Target} based on given controller ID returns found Target
     * without details, i.e. NO {@link Target#getTags()} and
     * {@link Target#getActions()} possible.
     *
```

### JavadocReference
Cannot resolve symbol `getActions()`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/ControllerManagement.java`
#### Snippet
```java
     * Finds {@link Target} based on given controller ID returns found Target
     * without details, i.e. NO {@link Target#getTags()} and
     * {@link Target#getActions()} possible.
     *
     * @param controllerId
```

### JavadocReference
Cannot resolve symbol `Page`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/ControllerManagement.java`
#### Snippet
```java
     * @param actionId
     *            to be filtered on
     * @return the corresponding {@link Page} of {@link ActionStatus}
     *
     * @throws EntityNotFoundException
```

### JavadocReference
Cannot resolve symbol `DdiRootController`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/ControllerManagement.java`
#### Snippet
```java
     * be possible that the controller will continue to work on the
     * cancellation. The controller needs to acknowledge or reject the
     * cancellation using {@link DdiRootController#postCancelActionFeedback}.
     *
     * @param actionId
```

### JavadocReference
Cannot resolve symbol `postCancelActionFeedback`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/ControllerManagement.java`
#### Snippet
```java
     * be possible that the controller will continue to work on the
     * cancellation. The controller needs to acknowledge or reject the
     * cancellation using {@link DdiRootController#postCancelActionFeedback}.
     *
     * @param actionId
```

### JavadocReference
Cannot resolve symbol `getTags()`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/ControllerManagement.java`
#### Snippet
```java
    /**
     * Finds {@link Target} based on given ID returns found Target without
     * details, i.e. NO {@link Target#getTags()} and {@link Target#getActions()}
     * possible.
     *
```

### JavadocReference
Cannot resolve symbol `getActions()`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/ControllerManagement.java`
#### Snippet
```java
    /**
     * Finds {@link Target} based on given ID returns found Target without
     * details, i.e. NO {@link Target#getTags()} and {@link Target#getActions()}
     * possible.
     *
```

### JavadocReference
Cannot resolve symbol `Environment`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/TenantConfigurationManagement.java`
#### Snippet
```java
     * Retrieves a configuration value from the e.g. tenant overwritten
     * configuration values or in case the tenant does not a have a specific
     * configuration the global default value hold in the {@link Environment}.
     * 
     * @param configurationKeyName
```

### JavadocReference
Cannot resolve symbol `ConversionFailedException`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/TenantConfigurationManagement.java`
#### Snippet
```java
     *             if the {@code propertyType} and the value in general does not
     *             match the expected type and format defined by the Key
     * @throws ConversionFailedException
     *             if the property cannot be converted to the given
     *             {@code propertyType}
```

### JavadocReference
Cannot resolve symbol `Environment`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/TenantConfigurationManagement.java`
#### Snippet
```java
     * Retrieves a configuration value from the e.g. tenant overwritten
     * configuration values or in case the tenant does not a have a specific
     * configuration the global default value hold in the {@link Environment}.
     * 
     * @param <T>
```

### JavadocReference
Cannot resolve symbol `ConversionFailedException`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/TenantConfigurationManagement.java`
#### Snippet
```java
     *             if the {@code propertyType} and the value in general does not
     *             match the expected type and format defined by the Key
     * @throws ConversionFailedException
     *             if the property cannot be converted to the given
     *             {@code propertyType}
```

### JavadocReference
Cannot resolve symbol `ConversionFailedException`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/TenantConfigurationManagement.java`
#### Snippet
```java
     *             file or the default value does not match the expected type
     *             and format defined by the Key
     * @throws ConversionFailedException
     *             if the property cannot be converted to the given
     *             {@code propertyType}
```

### JavadocReference
Cannot resolve symbol `ConversionFailedException`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/TenantConfigurationManagement.java`
#### Snippet
```java
     *             if the {@code propertyType} and the value in general does not
     *             match the expected type and format defined by the Key
     * @throws ConversionFailedException
     *             if the property cannot be converted to the given
     */
```

### JavadocReference
Cannot resolve symbol `get(Long)`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/DistributionSetManagement.java`
#### Snippet
```java
     * details, e.g. {@link DistributionSet#getModules()}.
     *
     * Note: for performance reasons it is recommended to use {@link #get(Long)}
     * if details are not necessary.
     *
```

### JavadocReference
Cannot resolve symbol `pageable`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/DistributionSetManagement.java`
#### Snippet
```java
     * Counts all meta data by the given distribution set id.
     *
     * @param pageable
     *            the page request to page the result
     * @param setId
```

### JavadocReference
Cannot resolve symbol `TargetInfo`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/DistributionSetManagement.java`
#### Snippet
```java
     * <p>
     * 1) {@link DistributionSet}s which have the given {@link Target} as
     * {@link TargetInfo#getInstalledDistributionSet()}
     * <p>
     * 2) {@link DistributionSet}s which have the given {@link Target} as
```

### JavadocReference
Cannot resolve symbol `getInstalledDistributionSet()`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/DistributionSetManagement.java`
#### Snippet
```java
     * <p>
     * 1) {@link DistributionSet}s which have the given {@link Target} as
     * {@link TargetInfo#getInstalledDistributionSet()}
     * <p>
     * 2) {@link DistributionSet}s which have the given {@link Target} as
```

### JavadocReference
Cannot resolve symbol `getAssignedDistributionSet()`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/DistributionSetManagement.java`
#### Snippet
```java
     * <p>
     * 2) {@link DistributionSet}s which have the given {@link Target} as
     * {@link Target#getAssignedDistributionSet()}
     * <p>
     * 3) {@link DistributionSet}s which have no connection to the given
```

### JavadocReference
Cannot resolve symbol `QuotaExceededException`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/TargetFilterQueryManagement.java`
#### Snippet
```java
     *             {@link TargetFilterQueryUpdate} for field constraints.
     *
     * @throws QuotaExceededException
     *             if the update contains a new query which addresses too many
     *             targets (auto-assignments only)
```

### JavadocReference
Cannot resolve symbol `Pageable`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/SoftwareModuleManagement.java`
#### Snippet
```java
     * After that the modules are sorted by by default by
     * {@link SoftwareModule#getName()} and {@link SoftwareModule#getVersion()}
     * in ascending order if no other sorting is provided in {@link Pageable}.
     * If sorting is provided in {@link Pageable} parameter the provided sorting
     * is used.
```

### JavadocReference
Cannot resolve symbol `Pageable`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/SoftwareModuleManagement.java`
#### Snippet
```java
     * {@link SoftwareModule#getName()} and {@link SoftwareModule#getVersion()}
     * in ascending order if no other sorting is provided in {@link Pageable}.
     * If sorting is provided in {@link Pageable} parameter the provided sorting
     * is used.
     *
```

### JavadocReference
Cannot resolve symbol `deleted`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutManagement.java`
#### Snippet
```java
     * @param rolloutId
     *            rollout id
     * @param deleted
     *            flag if deleted rollouts should be included
     * @return rollout details of targets count for different statuses
```

### JavadocReference
Cannot resolve symbol `PreAuthorize`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutManagement.java`
#### Snippet
```java
 * RolloutManagement to control rollouts e.g. like creating, starting, resuming
 * and pausing rollouts. This service secures all the functionality based on the
 * {@link PreAuthorize} annotation on methods.
 */
public interface RolloutManagement {
```

### JavadocReference
Cannot resolve symbol `resumeRollout(Rollout)`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutManagement.java`
#### Snippet
```java
     * {@link RolloutGroupStatus#SCHEDULED} will not be started and keep in
     * {@link RolloutGroupStatus#SCHEDULED} state until the rollout is
     * {@link RolloutManagement#resumeRollout(Rollout)}.
     *
     * Switching the rollout status to {@link RolloutStatus#PAUSED} is
```

### JavadocReference
Cannot resolve symbol `checkRunningRollouts(long)`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutManagement.java`
#### Snippet
```java
     *
     * Switching the rollout status to {@link RolloutStatus#PAUSED} is
     * sufficient due the {@link #checkRunningRollouts(long)} will not check
     * this rollout anymore.
     *
```

### JavadocReference
Cannot resolve symbol `start(Rollout)`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutManagement.java`
#### Snippet
```java
     * targets have been assigned to the groups, the rollout status is changed to
     * {@link RolloutStatus#READY} so it can be started with
     * {@link #start(Rollout)}.
     *
     * @param rollout
```

### JavadocReference
Cannot resolve symbol `checkRunningRollouts(long)`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RolloutManagement.java`
#### Snippet
```java
     * Resumes a paused rollout. The rollout switches back to
     * {@link RolloutStatus#RUNNING} state which is then picked up again by the
     * {@link #checkRunningRollouts(long)}.
     *
     * @param rolloutId
```

### JavadocReference
Cannot resolve symbol `PageRequest`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/OffsetBasedPageRequest.java`
#### Snippet
```java

/**
 * An implementation of the {@link PageRequest} which is offset based by means
 * the offset is given and not the page number as in the original
 * {@link PageRequest} implementation where the offset is generated. Due that
```

### JavadocReference
Cannot resolve symbol `PageRequest`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/OffsetBasedPageRequest.java`
#### Snippet
```java
 * An implementation of the {@link PageRequest} which is offset based by means
 * the offset is given and not the page number as in the original
 * {@link PageRequest} implementation where the offset is generated. Due that
 * the REST-API is working with {@code offset} and {@code limit} parameter we
 * need an offset based page request.
```

### JavadocReference
Cannot resolve symbol `Action`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RepositoryProperties.java`
#### Snippet
```java

    /**
     * If an {@link Action} has a weight of null this value is used as weight.
     */
    private int actionWeightIfAbsent = 1000;
```

### JavadocReference
Cannot resolve symbol `setSelectTargetWithNoTag(Boolean)`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/FilterParams.java`
#### Snippet
```java
    /**
     * Gets the tags that are used to filter for. The activation of this filter
     * is done by {@link #setSelectTargetWithNoTag(Boolean)}.
     *
     * @return the tags that are used to filter for
```

### JavadocReference
Cannot resolve symbol `getActionHistoryMessages(Long, int)`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/QuotaManagement.java`
#### Snippet
```java
    /**
     * @return maximum number of
     *         {@link ControllerManagement#getActionHistoryMessages(Long, int)}
     *         for an individual {@link ActionStatus}.
     */
```

### JavadocReference
Cannot resolve symbol `Page`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RepositoryManagement.java`
#### Snippet
```java

    /**
     * Retrieves {@link Page} of all {@link BaseEntity} of given type.
     * 
     * @param pageable
```

### JavadocReference
Cannot resolve symbol `Page`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/TargetManagement.java`
#### Snippet
```java
     *            the filters to apply; only filters are enabled that have non-null
     *            value; filters are AND-gated
     * @return a paged result {@link Page} of the {@link Target}s in a defined
     *         order.
     *
```

### JavadocReference
Cannot resolve symbol `getMessages()`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/RepositoryConstants.java`
#### Snippet
```java
    /**
     * Prefix that the server puts in front of
     * {@link ActionStatus#getMessages()} if the message is generated by the
     * server.
     */
```

### JavadocReference
Cannot resolve symbol `ApplicationEvent`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/event/ApplicationEventFilter.java`
#### Snippet
```java

/**
 * ApplicationEventFilter for hawkBit internal {@link ApplicationEvent}
 * publishing.
 *
```

### JavadocReference
Cannot resolve symbol `entityId`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/event/remote/RolloutStoppedEvent.java`
#### Snippet
```java
     * @param tenant
     *            the tenant
     * @param entityId
     *            the entity id
     * @param entityClass
```

### JavadocReference
Cannot resolve symbol `entityClass`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/event/remote/RolloutStoppedEvent.java`
#### Snippet
```java
     * @param entityId
     *            the entity id
     * @param entityClass
     *            the entity class
     * @param applicationId
```

### JavadocReference
Cannot resolve symbol `isForced()`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/model/Rollout.java`
#### Snippet
```java
    /**
     * @return time in {@link TimeUnit#MILLISECONDS} after which
     *         {@link #isForced()} switches to <code>true</code> in case of
     *         {@link ActionType#TIMEFORCED}.
     */
```

### JavadocReference
Cannot resolve symbol `lastTargetQuery`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/model/Target.java`
#### Snippet
```java
     * @return the poll time which holds the last poll time of the target, the
     *         next poll time and the overdue time. In case the
     *         {@link #lastTargetQuery} is not set e.g. the target never polled
     *         before this method returns {@code null}
     */
```

### JavadocReference
Cannot resolve symbol `getControllerAttributes()`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/model/Target.java`
#### Snippet
```java
    /**
     * @return <code>true</code> if the {@link Target} has not jet provided
     *         {@link #getControllerAttributes()}.
     */
    boolean isRequestControllerAttributes();
```

### JavadocReference
Cannot resolve symbol `getInstalledDistributionSet()`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/model/Target.java`
#### Snippet
```java
    /**
     * @return time in {@link TimeUnit#MILLISECONDS} GMT when
     *         {@link #getInstalledDistributionSet()} was applied.
     */
    Long getInstallationDate();
```

### JavadocReference
Cannot resolve symbol `statusTotalCountMap`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/model/TotalTargetCountStatus.java`
#### Snippet
```java
     * Populate all target status to a the given map
     *
     * @param statusTotalCountMap
     *            the map
     * @param rolloutStatusCountItems
```

### JavadocReference
Cannot resolve symbol `rolloutStatusCountItems`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/model/TotalTargetCountStatus.java`
#### Snippet
```java
     * @param statusTotalCountMap
     *            the map
     * @param rolloutStatusCountItems
     *            all target {@link Status} with total count
     */
```

### JavadocReference
Cannot resolve symbol `getMessages()`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/builder/ActionStatusCreate.java`
#### Snippet
```java
    /**
     * @param message
     *            for {@link ActionStatus#getMessages()}
     * @return updated {@link ActionStatusCreate} object
     */
```

### JavadocReference
Cannot resolve symbol `getMessages()`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/builder/ActionStatusCreate.java`
#### Snippet
```java
    /**
     * @param messages
     *            for {@link ActionStatus#getMessages()}
     * @return updated {@link ActionStatusCreate} object
     */
```

### JavadocReference
Cannot resolve symbol `Actions`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/builder/RolloutCreate.java`
#### Snippet
```java

    /**
     * Set the weight of the resulting {@link Actions}
     * 
     * @param weight
```

### JavadocReference
Cannot resolve symbol `Actions`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/builder/RolloutCreate.java`
#### Snippet
```java

    /**
     * Set the forcedTime of the resulting {@link Actions}
     * 
     * @param forcedTime
```

### JavadocReference
Cannot resolve symbol `Extension`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/H2TestDatabase.java`
#### Snippet
```java

/**
 * An {@link Extension} for creating and dropping H2 schemas if
 * tests are set up with H2.
 */
```

### JavadocReference
Cannot resolve symbol `TestExecutionListener`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/CleanupTestExecutionListener.java`
#### Snippet
```java

/**
 * A spring {@link TestExecutionListener} which cleansup the repository after
 * each test-method.
 */
```

### JavadocReference
Cannot resolve symbol `Extension`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/PostgreSqlTestDatabase.java`
#### Snippet
```java

/**
 * An {@link Extension} for creating and dropping MySql schemas if
 * tests are set up with MySql.
 */
```

### JavadocReference
Cannot resolve symbol `CacheManager`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/TestConfiguration.java`
#### Snippet
```java
     *
     * @param cacheManager
     *              The {@link CacheManager}
     * @return the cache
     */
```

### JavadocReference
Cannot resolve symbol `Extension`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/MySqlTestDatabase.java`
#### Snippet
```java

/**
 * An {@link Extension} for creating and dropping MySql schemas if
 * tests are set up with MySql.
 */
```

### JavadocReference
Cannot resolve symbol `Extension`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/MsSqlTestDatabase.java`
#### Snippet
```java

/**
 * An {@link Extension} for creating and dropping MS SQL Server
 * schemas if tests are set up with MS SQL Server.
 */
```

### JavadocReference
Cannot resolve symbol `TestExecutionListener`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/AbstractSqlTestDatabase.java`
#### Snippet
```java

/**
 * A {@link TestExecutionListener} for creating and dropping SQL schemas if
 * tests are setup with an SQL schema.
 */
```

### JavadocReference
Cannot resolve symbol `ControllerAdvice`
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/RestConfiguration.java`
#### Snippet
```java

    /**
     * {@link ControllerAdvice} for mapping {@link RuntimeException}s from the
     * repository to {@link HttpStatus} codes.
     */
```

### JavadocReference
Cannot resolve symbol `HttpStatus`
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/RestConfiguration.java`
#### Snippet
```java
    /**
     * {@link ControllerAdvice} for mapping {@link RuntimeException}s from the
     * repository to {@link HttpStatus} codes.
     */
    @Bean
```

### JavadocReference
Cannot resolve symbol `ShallowEtagHeaderFilter`
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/filter/ExcludePathAwareShallowETagFilter.java`
#### Snippet
```java

/**
 * An {@link ShallowEtagHeaderFilter} with exclusion paths to exclude some paths
 * where no ETag header should be generated due that calculating the ETag is an
 * expensive operation and the response output need to be copied in memory which
```

### JavadocReference
Cannot resolve symbol `ApplicationEventPublisher`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/matcher/EventVerifier.java`
#### Snippet
```java
     * 
     * @param publisher
     *            the {@link ApplicationEventPublisher} to publish the marker
     *            event to
     */
```

### JavadocReference
Cannot resolve symbol `Direction`
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/util/SortUtility.java`
#### Snippet
```java
     * of sorting: http://localhost/entity?s=field1:ASC, field2:DESC The fields
     * will be split into the keys of the returned map. The direction of the
     * sorting will be mapped into the {@link Direction} enum.
     * 
     * @param enumType
```

### JavadocReference
Cannot resolve symbol `Direction`
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/util/SortUtility.java`
#### Snippet
```java
     *            {@code null} or an empty string.
     * @return a list which holds the {@link FieldNameProvider} and the specific
     *         {@link Direction} for them as a tuple. Never {@code null}. In
     *         case of no sorting parameters an empty map will be returned.
     * @throws SortParameterSyntaxErrorException
```

### JavadocReference
Cannot resolve symbol `RabbitListenerContainerFactory`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/ConfigurableRabbitListenerContainerFactory.java`
#### Snippet
```java

/**
 * {@link RabbitListenerContainerFactory} that can be configured through
 * hawkBit's {@link AmqpProperties}.
 *
```

### JavadocReference
Cannot resolve symbol `SimpleMessageListenerContainer`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/ConfigurableRabbitListenerContainerFactory.java`
#### Snippet
```java
     * @param missingQueuesFatal
     *            the missingQueuesFatal to set.
     * @see SimpleMessageListenerContainer#setMissingQueuesFatal
     * @param declarationRetries
     *            The number of retries
```

### JavadocReference
Cannot resolve symbol `setMissingQueuesFatal`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/ConfigurableRabbitListenerContainerFactory.java`
#### Snippet
```java
     * @param missingQueuesFatal
     *            the missingQueuesFatal to set.
     * @see SimpleMessageListenerContainer#setMissingQueuesFatal
     * @param declarationRetries
     *            The number of retries
```

### JavadocReference
Cannot resolve symbol `MultipartException`
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/exception/ResponseExceptionHandler.java`
#### Snippet
```java

    /**
     * Method for handling exception of type {@link MultipartException} which is
     * thrown in case the request body is not well formed and cannot be
     * deserialized. Called by the Spring-Framework for exception handling.
```

### JavadocReference
Cannot resolve symbol `FatalExceptionStrategy`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/DelayedRequeueExceptionStrategy.java`
#### Snippet
```java

/**
 * Custom {@link FatalExceptionStrategy} that markes defined hawkBit internal
 * exceptions not to be requeued. In addition it throttles in case of a requeue
 * by means of blocking the processing thread for a certain amount of time. That
```

### JavadocReference
Cannot resolve symbol `RabbitAdmin`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpConfiguration.java`
#### Snippet
```java

    /**
     * Create a {@link RabbitAdmin} and ignore declaration exceptions.
     * {@link RabbitAdmin#setIgnoreDeclarationExceptions(boolean)}
     *
```

### JavadocReference
Cannot resolve symbol `RabbitAdmin`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpConfiguration.java`
#### Snippet
```java
    /**
     * Create a {@link RabbitAdmin} and ignore declaration exceptions.
     * {@link RabbitAdmin#setIgnoreDeclarationExceptions(boolean)}
     *
     * @return the bean
```

### JavadocReference
Cannot resolve symbol `setIgnoreDeclarationExceptions(boolean)`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpConfiguration.java`
#### Snippet
```java
    /**
     * Create a {@link RabbitAdmin} and ignore declaration exceptions.
     * {@link RabbitAdmin#setIgnoreDeclarationExceptions(boolean)}
     *
     * @return the bean
```

### JavadocReference
Cannot resolve symbol `RabbitTemplate`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpConfiguration.java`
#### Snippet
```java

    /**
     * @return {@link RabbitTemplate} with automatic retry, published confirms and
     *         {@link Jackson2JsonMessageConverter}.
     */
```

### JavadocReference
Cannot resolve symbol `Jackson2JsonMessageConverter`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpConfiguration.java`
#### Snippet
```java
    /**
     * @return {@link RabbitTemplate} with automatic retry, published confirms and
     *         {@link Jackson2JsonMessageConverter}.
     */
    @Bean
```

### JavadocReference
Cannot resolve symbol `getControllerBaseconfirmationAction`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/json/model/DdiActionHistory.java`
#### Snippet
```java
 * Provide action history information to the controller as part of response to
 * {@link DdiRootControllerRestApi#getControllerBasedeploymentAction} and
 * {@link DdiRootControllerRestApi#getControllerBaseconfirmationAction}:
 * 1. Current action status at the server; 2. List of messages from action history
 * that were sent to server earlier by the controller using
```

### JavadocReference
Cannot resolve symbol `url`
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/PropertyHostnameResolverAutoConfiguration.java`
#### Snippet
```java
     *            to get the servers URL
     * @return the default autoconfigure hostname resolver implementation which
     *         is property based specified by the property {@link #url}
     */
    @Bean
```

### JavadocReference
Cannot resolve symbol `CacheManager`
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/cache/CacheAutoConfiguration.java`
#### Snippet
```java

/**
 * A configuration for configuring the spring {@link CacheManager} for specific
 * multi-tenancy caching. The caches between tenants must not interfere each
 * other.
```

### JavadocReference
Cannot resolve symbol `TenantCacheResolver`
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/cache/CacheAutoConfiguration.java`
#### Snippet
```java
 * other.
 *
 * This is done by providing a special {@link TenantCacheResolver} which
 * generates a cache name included the current tenant.
 */
```

### JavadocReference
Cannot resolve symbol `org.springframework.http.HttpStatus`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     * @param controllerId
     *            to disable auto-confirmation for
     * @return {@link org.springframework.http.HttpStatus#OK} if successfully
     *         executed
     */
```

### JavadocReference
Cannot resolve symbol `OK`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     * @param controllerId
     *            to disable auto-confirmation for
     * @return {@link org.springframework.http.HttpStatus#OK} if successfully
     *         executed
     */
```

### JavadocReference
Cannot resolve symbol `ResponseEntity`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     *            of the related local artifact
     *
     * @return {@link ResponseEntity} with status {@link HttpStatus#OK} if
     *         successful
     */
```

### JavadocReference
Cannot resolve symbol `HttpStatus`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     *            of the related local artifact
     *
     * @return {@link ResponseEntity} with status {@link HttpStatus#OK} if
     *         successful
     */
```

### JavadocReference
Cannot resolve symbol `OK`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     *            of the related local artifact
     *
     * @return {@link ResponseEntity} with status {@link HttpStatus#OK} if
     *         successful
     */
```

### JavadocReference
Cannot resolve symbol `RepositoryConstants`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     *            resource utilization by controllers, maximum number of
     *            messages that are retrieved from database is limited by
     *            {@link RepositoryConstants#MAX_ACTION_HISTORY_MSG_COUNT}.
     *
     *            actionHistoryMessageCount less than zero: retrieves the
```

### JavadocReference
Cannot resolve symbol `MAX_ACTION_HISTORY_MSG_COUNT`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     *            resource utilization by controllers, maximum number of
     *            messages that are retrieved from database is limited by
     *            {@link RepositoryConstants#MAX_ACTION_HISTORY_MSG_COUNT}.
     *
     *            actionHistoryMessageCount less than zero: retrieves the
```

### JavadocReference
Cannot resolve symbol `org.springframework.http.HttpStatus`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     * @param body
     *            as {@link DdiActivateAutoConfirmation}
     * @return {@link org.springframework.http.HttpStatus#OK} if successful or
     *         {@link org.springframework.http.HttpStatus#CONFLICT} in case
     *         auto-confirmation was active already.
```

### JavadocReference
Cannot resolve symbol `OK`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     * @param body
     *            as {@link DdiActivateAutoConfirmation}
     * @return {@link org.springframework.http.HttpStatus#OK} if successful or
     *         {@link org.springframework.http.HttpStatus#CONFLICT} in case
     *         auto-confirmation was active already.
```

### JavadocReference
Cannot resolve symbol `org.springframework.http.HttpStatus`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     *            as {@link DdiActivateAutoConfirmation}
     * @return {@link org.springframework.http.HttpStatus#OK} if successful or
     *         {@link org.springframework.http.HttpStatus#CONFLICT} in case
     *         auto-confirmation was active already.
     */
```

### JavadocReference
Cannot resolve symbol `CONFLICT`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     *            as {@link DdiActivateAutoConfirmation}
     * @return {@link org.springframework.http.HttpStatus#OK} if successful or
     *         {@link org.springframework.http.HttpStatus#CONFLICT} in case
     *         auto-confirmation was active already.
     */
```

### JavadocReference
Cannot resolve symbol `RepositoryConstants`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     *            resource utilization by controllers, maximum number of
     *            messages that are retrieved from database is limited by
     *            {@link RepositoryConstants#MAX_ACTION_HISTORY_MSG_COUNT}.
     * 
     *            actionHistoryMessageCount less than zero: retrieves the
```

### JavadocReference
Cannot resolve symbol `MAX_ACTION_HISTORY_MSG_COUNT`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     *            resource utilization by controllers, maximum number of
     *            messages that are retrieved from database is limited by
     *            {@link RepositoryConstants#MAX_ACTION_HISTORY_MSG_COUNT}.
     * 
     *            actionHistoryMessageCount less than zero: retrieves the
```

### JavadocReference
Cannot resolve symbol `RepositoryConstants`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     *            resource utilization by controllers, maximum number of
     *            messages that are retrieved from database is limited by
     *            {@link RepositoryConstants#MAX_ACTION_HISTORY_MSG_COUNT}.
     * 
     *            actionHistoryMessageCount less than zero: retrieves the
```

### JavadocReference
Cannot resolve symbol `MAX_ACTION_HISTORY_MSG_COUNT`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     *            resource utilization by controllers, maximum number of
     *            messages that are retrieved from database is limited by
     *            {@link RepositoryConstants#MAX_ACTION_HISTORY_MSG_COUNT}.
     * 
     *            actionHistoryMessageCount less than zero: retrieves the
```

### JavadocReference
Cannot resolve symbol `HttpStatus`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     *
     * @return response of the servlet which in case of success is status code
     *         {@link HttpStatus#OK} or in case of partial download
     *         {@link HttpStatus#PARTIAL_CONTENT}.
     */
```

### JavadocReference
Cannot resolve symbol `OK`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     *
     * @return response of the servlet which in case of success is status code
     *         {@link HttpStatus#OK} or in case of partial download
     *         {@link HttpStatus#PARTIAL_CONTENT}.
     */
```

### JavadocReference
Cannot resolve symbol `HttpStatus`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     * @return response of the servlet which in case of success is status code
     *         {@link HttpStatus#OK} or in case of partial download
     *         {@link HttpStatus#PARTIAL_CONTENT}.
     */
    @GetMapping(value = DdiRestConstants.BASE_V1_REQUEST_MAPPING
```

### JavadocReference
Cannot resolve symbol `PARTIAL_CONTENT`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     * @return response of the servlet which in case of success is status code
     *         {@link HttpStatus#OK} or in case of partial download
     *         {@link HttpStatus#PARTIAL_CONTENT}.
     */
    @GetMapping(value = DdiRestConstants.BASE_V1_REQUEST_MAPPING
```

### JavadocReference
Cannot resolve symbol `LogoutSuccessHandler`
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/SecurityAutoConfiguration.java`
#### Snippet
```java

    /**
     * @return {@link LogoutSuccessHandler} bean
     */
    @Bean
```

### JavadocReference
Cannot resolve symbol `EnableAutoConfiguration`
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/SecurityAutoConfiguration.java`
#### Snippet
```java

/**
 * {@link EnableAutoConfiguration Auto-configuration} for security.
 */
@Configuration
```

### JavadocReference
Cannot resolve symbol `LogoutHandler`
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/SecurityAutoConfiguration.java`
#### Snippet
```java

    /**
     * @return {@link LogoutHandler} bean
     */
    @Bean
```

### JavadocReference
Cannot resolve symbol `SecurityProperties`
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/SecurityAutoConfiguration.java`
#### Snippet
```java
     *
     * @param securityProperties
     *            The Spring {@link SecurityProperties} for the security user
     * @param multiUserProperties
     *            The {@link MultiUserProperties} for the managed users
```

### JavadocReference
Cannot resolve symbol `AuthenticationSuccessHandler`
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/SecurityAutoConfiguration.java`
#### Snippet
```java

    /**
     * @return {@link AuthenticationSuccessHandler} bean
     */
    @Bean
```

### JavadocReference
Cannot resolve symbol `getTags()`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java
     *            vendor and description.
     * @param tags
     *            {@link DistributionSet#getTags()}
     *
     * @return {@link DistributionSet} entity.
```

### JavadocReference
Cannot resolve symbol `getTags()`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java
     *            number.updat
     * @param tags
     *            {@link DistributionSet#getTags()}
     *
     * @return {@link DistributionSet} entity.
```

### JavadocReference
Cannot resolve symbol `groupSize`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java
     * @param amountOtherTargets
     *            amount of other targets not included in the rollout
     * @param groupSize
     *            the size of the rollout group
     * @param successCondition
```

### JavadocReference
Cannot resolve symbol `OidcUserService`
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/OidcUserManagementAutoConfiguration.java`
#### Snippet
```java

/**
 * Extended {@link OidcUserService} supporting JWT containing authorities
 */
class JwtAuthoritiesOidcUserService extends OidcUserService {
```

### JavadocReference
Cannot resolve symbol `TaskScheduler`
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/scheduling/ExecutorAutoConfiguration.java`
#### Snippet
```java

    /**
     * @return {@link TaskScheduler} for task execution
     */
    @Bean
```

### JavadocReference
Cannot resolve symbol `TaskExecutor`
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/scheduling/ExecutorAutoConfiguration.java`
#### Snippet
```java

    /**
     * @return {@link TaskExecutor} for task execution
     */
    @Bean
```

### JavadocReference
Cannot resolve symbol `uiErrorDetailsExtractor`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/MgmtUiConfiguration.java`
#### Snippet
```java
     * @param i18n
     *            VaadinMessageSource
     * @param uiErrorDetailsExtractor
     *            ui error details extractors
     *
```

### JavadocReference
Cannot resolve symbol `WebSecurityConfigurer`
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/SecurityManagedConfiguration.java`
#### Snippet
```java

    /**
     * {@link WebSecurityConfigurer} for the hawkBit server DDI interface.
     */
    @Configuration
```

### JavadocReference
Cannot resolve symbol `WebSecurityConfigurer`
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/SecurityManagedConfiguration.java`
#### Snippet
```java

    /**
     * {@link WebSecurityConfigurer} for external (management) access.
     */
    @Configuration
```

### JavadocReference
Cannot resolve symbol `WebSecurityConfigurer`
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/SecurityManagedConfiguration.java`
#### Snippet
```java

    /**
     * {@link WebSecurityConfigurer} for the hawkBit server DDI download
     * interface.
     */
```

### JavadocReference
Cannot resolve symbol `AccessDecisionManager`
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/SecurityManagedConfiguration.java`
#### Snippet
```java

        /**
         * Configuration that defines the {@link AccessDecisionManager} bean for
         * UI method security used by the Vaadin Servlet. Notice: we can not use
         * the top-level method security configuration because
```

### JavadocReference
Cannot resolve symbol `AdviceMode.ASPECTJ`
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/SecurityManagedConfiguration.java`
#### Snippet
```java
         * UI method security used by the Vaadin Servlet. Notice: we can not use
         * the top-level method security configuration because
         * {@link AdviceMode.ASPECTJ} is not supported.
         */
        @Configuration
```

### JavadocReference
Cannot resolve symbol `MessageSource`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/utils/VaadinMessageSource.java`
#### Snippet
```java
/**
 * Utility class leveraging Spring Boot auto configuration of
 * {@link MessageSource} and with Vaadins {@link UI#getLocale()}.
 *
 */
```

### JavadocReference
Cannot resolve symbol `MessageSource`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/utils/VaadinMessageSource.java`
#### Snippet
```java
     * @return the resolved message, or the message code if the lookup fails.
     *
     * @see MessageSource#getMessage(String, Object[], Locale)
     * @see HawkbitCommonUtil#getCurrentLocale()
     */
```

### JavadocReference
Cannot resolve symbol `getMessage(String, Object[], Locale)`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/utils/VaadinMessageSource.java`
#### Snippet
```java
     * @return the resolved message, or the message code if the lookup fails.
     *
     * @see MessageSource#getMessage(String, Object[], Locale)
     * @see HawkbitCommonUtil#getCurrentLocale()
     */
```

### JavadocReference
Cannot resolve symbol `EventBus`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/push/DelayedEventBusPushStrategy.java`
#### Snippet
```java
 * Spring internal application events bus and stores them first in a queue to be
 * dispatched every x (default is 2 and can be configured with the property)
 * seconds to the {@link EventBus} in a Vaadin access thread
 * {@link UI#access(Runnable)}.
 *
```

### JavadocReference
Cannot resolve symbol `UIEventBus`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/push/DelayedEventBusPushStrategy.java`
#### Snippet
```java
     * An application event publisher subscriber which subscribes
     * {@link EntityIdEvent} from the repository to dispatch these events to the
     * UI {@link UIEventBus} .
     * 
     * @param applicationEvent
```

### JavadocReference
Cannot resolve symbol `UIEventBus`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/CommonUiDependencies.java`
#### Snippet
```java

    /**
     * Returns {@link UIEventBus}
     *
     * @return the eventBus
```

### JavadocReference
Cannot resolve symbol `UserDetails`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/UserDetailsFormatter.java`
#### Snippet
```java
    /**
     * Load user details by the user name and format the user name. If the
     * loaded {@link UserDetails} is not an instance of a {@link UserPrincipal},
     * then just the {@link UserDetails#getUsername()} will return.
     * 
```

### JavadocReference
Cannot resolve symbol `UserDetails`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/UserDetailsFormatter.java`
#### Snippet
```java
     * Load user details by the user name and format the user name. If the
     * loaded {@link UserDetails} is not an instance of a {@link UserPrincipal},
     * then just the {@link UserDetails#getUsername()} will return.
     * 
     * If first and last name available, they will combined. Otherwise the
```

### JavadocReference
Cannot resolve symbol `getUsername()`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/UserDetailsFormatter.java`
#### Snippet
```java
     * Load user details by the user name and format the user name. If the
     * loaded {@link UserDetails} is not an instance of a {@link UserPrincipal},
     * then just the {@link UserDetails#getUsername()} will return.
     * 
     * If first and last name available, they will combined. Otherwise the
```

### JavadocReference
Cannot resolve symbol `getActionStatus()`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/mappers/ActionToProxyActionMapper.java`
#### Snippet
```java
     * Generates a virtual IsActiveDecoration for the presentation layer that is
     * calculated from {@link Action#isActive()} and
     * {@link Action#getActionStatus()}.
     *
     * @param action
```

### JavadocReference
Cannot resolve symbol `permChecker`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/assignment/DistributionSetsToTargetAssignmentSupport.java`
#### Snippet
```java
     * @param configManagement
     *            TenantConfigurationManagement
     * @param permChecker
     *            SpPermissionChecker
     * @param assignmentController
```

### JavadocReference
Cannot resolve symbol `EventScope`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/TenantConfigChangedListener.java`
#### Snippet
```java

        /**
         * Set consumer in case of an event with scope {@link EventScope#APPLICATION}.
         */
        public Builder applicationEventConsumer(
```

### JavadocReference
Cannot resolve symbol `APPLICATION`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/TenantConfigChangedListener.java`
#### Snippet
```java

        /**
         * Set consumer in case of an event with scope {@link EventScope#APPLICATION}.
         */
        public Builder applicationEventConsumer(
```

### JavadocReference
Cannot resolve symbol `EventScope`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/TenantConfigChangedListener.java`
#### Snippet
```java

        /**
         * Set consumer in case of an event with scope {@link EventScope#UI}.
         */
        public Builder uiEventConsumer(final Consumer<TenantConfigChangedEventPayload> uiEventConsumer) {
```

### JavadocReference
Cannot resolve symbol `UI`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/TenantConfigChangedListener.java`
#### Snippet
```java

        /**
         * Set consumer in case of an event with scope {@link EventScope#UI}.
         */
        public Builder uiEventConsumer(final Consumer<TenantConfigChangedEventPayload> uiEventConsumer) {
```

### JavadocReference
Cannot resolve symbol `EventScope`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/TenantConfigChangedListener.java`
#### Snippet
```java

    /**
     * With scope {@link EventScope#APPLICATION} to get notified about configuration
     * changes triggered by other UI sessions/users
     *
```

### JavadocReference
Cannot resolve symbol `APPLICATION`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/TenantConfigChangedListener.java`
#### Snippet
```java

    /**
     * With scope {@link EventScope#APPLICATION} to get notified about configuration
     * changes triggered by other UI sessions/users
     *
```

### JavadocReference
Cannot resolve symbol `EventScope`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/TenantConfigChangedListener.java`
#### Snippet
```java

    /**
     * With scope {@link EventScope#UI} to get notified about configuration changes
     * triggered by the current UI
     *
```

### JavadocReference
Cannot resolve symbol `UI`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/TenantConfigChangedListener.java`
#### Snippet
```java

    /**
     * With scope {@link EventScope#UI} to get notified about configuration changes
     * triggered by the current UI
     *
```

### JavadocReference
Cannot resolve symbol `tagData`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/tagdetails/TagListField.java`
#### Snippet
```java
     * Removes a tag from the field.
     * 
     * @param tagData
     */
    void removeTag(final Long tagId) {
```

### JavadocReference
Cannot resolve symbol `tagName`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/tagdetails/TagListField.java`
#### Snippet
```java
     * Adds a tag
     * 
     * @param tagName
     * @param tagColor
     */
```

### JavadocReference
Cannot resolve symbol `tagColor`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/tagdetails/TagListField.java`
#### Snippet
```java
     * 
     * @param tagName
     * @param tagColor
     */
    void addTag(final ProxyTag tagData) {
```

### JavadocReference
Cannot resolve symbol `UIEventBus`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/UploadProgressButtonLayout.java`
#### Snippet
```java
     *            the {@link VaadinMessageSource}
     * @param eventBus
     *            the {@link UIEventBus} for listening to ui events
     * @param artifactUploadState
     *            the {@link ArtifactUploadState} for state information
```

### JavadocReference
Cannot resolve symbol `ComponentScan`
in `hawkbit-rest/hawkbit-ddi-resource/src/main/java/org/eclipse/hawkbit/ddi/rest/resource/DdiApiConfiguration.java`
#### Snippet
```java

/**
 * Enable {@link ComponentScan} in the resource package to setup all
 * {@link Controller} annotated classes and setup the REST-Resources for the
 * Direct Device Integration API.
```

### JavadocReference
Cannot resolve symbol `Controller`
in `hawkbit-rest/hawkbit-ddi-resource/src/main/java/org/eclipse/hawkbit/ddi/rest/resource/DdiApiConfiguration.java`
#### Snippet
```java
/**
 * Enable {@link ComponentScan} in the resource package to setup all
 * {@link Controller} annotated classes and setup the REST-Resources for the
 * Direct Device Integration API.
 */
```

### JavadocReference
Cannot resolve symbol `maintenanceWindowPollCount.`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/ControllerPollProperties.java`
#### Snippet
```java
     * ({@link ControllerPollProperties#maintenanceWindowPollCount}).
     *
     * @param maintenanceWindowPollCount.
     */
    public void setMaintenanceWindowPollCount(int maintenanceWindowPollCount) {
```

### JavadocReference
Cannot resolve symbol `any`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/tenancy/TenantAware.java`
#### Snippet
```java
     *            under the given tenant
     * @return the return type of the {@link TenantRunner}
     * @throws any
     *             kind of {@link RuntimeException}
     */
```

### JavadocReference
Cannot resolve symbol `any`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/tenancy/TenantAware.java`
#### Snippet
```java
     *            under the given tenant
     * @return the return type of the {@link TenantRunner}
     * @throws any
     *             kind of {@link RuntimeException}
     */
```

### JavadocReference
Cannot resolve symbol `CacheManager`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/cache/DefaultDownloadIdCache.java`
#### Snippet
```java
/**
 * A default implementation of the {@link DownloadIdCache} which uses the
 * {@link CacheManager} implementation to store the download-ids.
 */
public class DefaultDownloadIdCache implements DownloadIdCache {
```

### JavadocReference
Cannot resolve symbol `MethodNotSupportedException`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/artifact/repository/ArtifactRepository.java`
#### Snippet
```java
     *            the sha1-hash of the artifact to delete
     * 
     * @throws MethodNotSupportedException
     *             if implementation does not support the operation
     */
```

### JavadocReference
Cannot resolve symbol `CacheManager`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/cache/TenantAwareCacheManager.java`
#### Snippet
```java

/**
 * A {@link CacheManager} delegator which wraps the
 * {@link CacheManager#getCache(String)} and
 * {@link CacheManager#getCacheNames()} to include the
```

### JavadocReference
Cannot resolve symbol `CacheManager`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/cache/TenantAwareCacheManager.java`
#### Snippet
```java
/**
 * A {@link CacheManager} delegator which wraps the
 * {@link CacheManager#getCache(String)} and
 * {@link CacheManager#getCacheNames()} to include the
 * {@link TenantAware#getCurrentTenant()} when accessing a cache, so caches are
```

### JavadocReference
Cannot resolve symbol `MethodNotSupportedException`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/artifact/repository/ArtifactRepository.java`
#### Snippet
```java
     * @return The artifact file object or {@code null} if no file exists.
     * 
     * @throws MethodNotSupportedException
     *             if implementation does not support the operation
     */
```

### JavadocReference
Cannot resolve symbol `getCache(String)`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/cache/TenantAwareCacheManager.java`
#### Snippet
```java
/**
 * A {@link CacheManager} delegator which wraps the
 * {@link CacheManager#getCache(String)} and
 * {@link CacheManager#getCacheNames()} to include the
 * {@link TenantAware#getCurrentTenant()} when accessing a cache, so caches are
```

### JavadocReference
Cannot resolve symbol `CacheManager`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/cache/TenantAwareCacheManager.java`
#### Snippet
```java
 * A {@link CacheManager} delegator which wraps the
 * {@link CacheManager#getCache(String)} and
 * {@link CacheManager#getCacheNames()} to include the
 * {@link TenantAware#getCurrentTenant()} when accessing a cache, so caches are
 * seperated.
```

### JavadocReference
Cannot resolve symbol `getCacheNames()`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/cache/TenantAwareCacheManager.java`
#### Snippet
```java
 * A {@link CacheManager} delegator which wraps the
 * {@link CacheManager#getCache(String)} and
 * {@link CacheManager#getCacheNames()} to include the
 * {@link TenantAware#getCurrentTenant()} when accessing a cache, so caches are
 * seperated.
```

### JavadocReference
Cannot resolve symbol `MethodNotSupportedException`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/artifact/repository/ArtifactRepository.java`
#### Snippet
```java
     * @return the stored artifact
     * 
     * @throws MethodNotSupportedException
     *             if implementation does not support the operation
     * @throws ArtifactStoreException
```

### JavadocReference
Cannot resolve symbol `CacheManager`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/cache/TenantAwareCacheManager.java`
#### Snippet
```java
     *
     * @param delegate
     *            the {@link CacheManager} to delegate to.
     * @param tenantAware
     *            the tenant aware to retrieve the current tenant
```

### JavadocReference
Cannot resolve symbol `ActionStatusRest`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/ActionStatusFields.java`
#### Snippet
```java

/**
 * Sort fields for {@link ActionStatusRest}.
 *
 *
```

### JavadocReference
Cannot resolve symbol `TargetAction`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/FieldValueConverter.java`
#### Snippet
```java
 * can be used for building generic queries. Mapping external API values e.g.
 * REST API to inside representation on database. E.g. mapping 'pending' or
 * 'finished' values in rest queries to {@link TargetAction#isActive()} boolean
 * value.
 * 
```

### JavadocReference
Cannot resolve symbol `isActive()`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/FieldValueConverter.java`
#### Snippet
```java
 * can be used for building generic queries. Mapping external API values e.g.
 * REST API to inside representation on database. E.g. mapping 'pending' or
 * 'finished' values in rest queries to {@link TargetAction#isActive()} boolean
 * value.
 * 
```

### JavadocReference
Cannot resolve symbol `ActionRest`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/ActionFields.java`
#### Snippet
```java

/**
 * Sort fields for {@link ActionRest}.
 */
public enum ActionFields implements FieldNameProvider, FieldValueConverter<ActionFields> {
```

### JavadocReference
Cannot resolve symbol `SpringBootApplication`
in `hawkbit-runtime/hawkbit-update-server/src/main/java/org/eclipse/hawkbit/app/Start.java`
#### Snippet
```java

/**
 * A {@link SpringBootApplication} annotated class with a main method to start.
 * The minimal configuration for the stand alone hawkBit server.
 *
```

### JavadocReference
Cannot resolve symbol `getMessages()`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/ActionStatusRepository.java`
#### Snippet
```java
    /**
     * Finds all status updates for the defined action and target including
     * {@link ActionStatus#getMessages()}.
     *
     * @param pageReq
```

### JavadocReference
Cannot resolve symbol `target`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/ActionStatusRepository.java`
#### Snippet
```java
     * @param pageReq
     *            for page configuration
     * @param target
     *            to look for
     * @param actionId
```

### JavadocReference
Cannot resolve symbol `PagingAndSortingRepository`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/DistributionSetTypeRepository.java`
#### Snippet
```java

/**
 * {@link PagingAndSortingRepository} for {@link DistributionSetType}.
 *
 */
```

### JavadocReference
Cannot resolve symbol `KeyGenerator`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/TenantKeyGenerator.java`
#### Snippet
```java

/**
 * {@link KeyGenerator} for tenant related caches.
 *
 */
```

### JavadocReference
Cannot resolve symbol `Type`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/SoftwareModuleRepository.java`
#### Snippet
```java

    /**
     * Counts all {@link SoftwareModule}s based on the given {@link Type}.
     *
     * @param type
```

### JavadocReference
Cannot resolve symbol `JpaRepositoryFactoryBean`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/CustomBaseRepositoryFactoryBean.java`
#### Snippet
```java

    /**
     * Creates a new {@link JpaRepositoryFactoryBean} for the given repository
     * interface.
     *
```

### JavadocReference
Cannot resolve symbol `JpaRepositoryFactoryBean`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/CustomBaseRepositoryFactoryBean.java`
#### Snippet
```java

/**
 * A {@link JpaRepositoryFactoryBean} extension that allow injection of custom
 * repository factories by using a {@link BaseRepositoryTypeProvider}
 * implementation, allows injecting different base repository implementations based on repository type
```

### JavadocReference
Cannot resolve symbol `PagingAndSortingRepository`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/TargetTypeRepository.java`
#### Snippet
```java

/**
 * {@link PagingAndSortingRepository} for {@link JpaTargetType}.
 *
 */
```

### JavadocReference
Cannot resolve symbol `KeyGenerator`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/CurrentTenantCacheKeyGenerator.java`
#### Snippet
```java

/**
 * Defines the interfaces to register the {@link KeyGenerator} as bean which is
 * used by spring caching framework to resolve the key-generator. The
 * key-generator must registered as bean so spring can resolve the key-generator
```

### JavadocReference
Cannot resolve symbol `Service`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/CurrentTenantCacheKeyGenerator.java`
#### Snippet
```java
 * by its name.
 * 
 * When using the {@link Service} annotation e.g. by {@link JpaSystemManagement}
 * the bean registration must be declared by the interface due spring registers
 * the bean by the implemented interfaces. So introduce a single interface for
```

### JavadocReference
Cannot resolve symbol `KeyGenerator`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/CurrentTenantCacheKeyGenerator.java`
#### Snippet
```java
     * which is used by the caching framework.
     * 
     * @return the {@link KeyGenerator} to be used to cache the values of the
     *         current used tenant in the {@link JpaSystemManagement}
     */
```

### JavadocReference
Cannot resolve symbol `KeyGenerator`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/SystemManagementCacheKeyGenerator.java`
#### Snippet
```java

    /**
     * An implementation of the {@link KeyGenerator} to generate a key based on
     * either the {@code createInitialTenant} thread local and the
     * {@link TenantAware}, but in case we are in a tenant creation with its default
```

### JavadocReference
Cannot resolve symbol `Page`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/SoftwareModuleMetadataRepository.java`
#### Snippet
```java
     *            The target visibility flag.
     * 
     * @return A {@link Page} with the matching meta data entries.
     */
    @Query("SELECT smd.softwareModule.id, smd FROM JpaSoftwareModuleMetadata smd WHERE smd.softwareModule.id IN :moduleId AND smd.targetVisible = :targetVisible")
```

### JavadocReference
Cannot resolve symbol `Page`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/SoftwareModuleMetadataRepository.java`
#### Snippet
```java
     *            The target visibility flag.
     * 
     * @return A {@link Page} with the matching meta data entries.
     */
    Page<JpaSoftwareModuleMetadata> findBySoftwareModuleIdAndTargetVisible(Pageable page, Long moduleId,
```

### JavadocReference
Cannot resolve symbol `org.springframework.data.repository.CrudRepository`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/BaseEntityRepository.java`
#### Snippet
```java
    /**
     * Overrides
     * {@link org.springframework.data.repository.CrudRepository#saveAll(Iterable)}
     * to return a list of created entities instead of an instance of
     * {@link Iterable} to be able to work with it directly in further code
```

### JavadocReference
Cannot resolve symbol `saveAll(Iterable)`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/BaseEntityRepository.java`
#### Snippet
```java
    /**
     * Overrides
     * {@link org.springframework.data.repository.CrudRepository#saveAll(Iterable)}
     * to return a list of created entities instead of an instance of
     * {@link Iterable} to be able to work with it directly in further code
```

### JavadocReference
Cannot resolve symbol `tenant`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/TenantConfigurationRepository.java`
#### Snippet
```java
     * Deletes a tenant configuration by tenant and key.
     * 
     * @param tenant
     *            the tenant for this configuration
     * @param keyName
```

### JavadocReference
Cannot resolve symbol `EclipseLinkJpaDialect`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/HawkBitEclipseLinkJpaDialect.java`
#### Snippet
```java

/**
 * {@link EclipseLinkJpaDialect} with additional exception translation
 * mechanisms based on {@link SQLStateSQLExceptionTranslator}.
 * 
```

### JavadocReference
Cannot resolve symbol `SQLStateSQLExceptionTranslator`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/HawkBitEclipseLinkJpaDialect.java`
#### Snippet
```java
/**
 * {@link EclipseLinkJpaDialect} with additional exception translation
 * mechanisms based on {@link SQLStateSQLExceptionTranslator}.
 * 
 * There are multiple variations of exceptions coming out of persistence
```

### JavadocReference
Cannot resolve symbol `EclipseLinkJpaDialect`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/HawkBitEclipseLinkJpaDialect.java`
#### Snippet
```java
 * <p>
 * 1) {@link PersistenceException}s that can be mapped by
 * {@link EclipseLinkJpaDialect} into corresponding {@link DataAccessException}.
 * <p>
 * 2) {@link PersistenceException}s that could not be mapped by
```

### JavadocReference
Cannot resolve symbol `DataAccessException`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/HawkBitEclipseLinkJpaDialect.java`
#### Snippet
```java
 * <p>
 * 1) {@link PersistenceException}s that can be mapped by
 * {@link EclipseLinkJpaDialect} into corresponding {@link DataAccessException}.
 * <p>
 * 2) {@link PersistenceException}s that could not be mapped by
```

### JavadocReference
Cannot resolve symbol `EclipseLinkJpaDialect`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/HawkBitEclipseLinkJpaDialect.java`
#### Snippet
```java
 * <p>
 * 2) {@link PersistenceException}s that could not be mapped by
 * {@link EclipseLinkJpaDialect} directly but instead are wrapped into
 * {@link JpaSystemException}.
 * <p>
```

### JavadocReference
Cannot resolve symbol `JpaSystemException`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/HawkBitEclipseLinkJpaDialect.java`
#### Snippet
```java
 * 2) {@link PersistenceException}s that could not be mapped by
 * {@link EclipseLinkJpaDialect} directly but instead are wrapped into
 * {@link JpaSystemException}.
 * <p>
 * 2.a) here the wrapped exception's causes might be an {@link SQLException}
```

### JavadocReference
Cannot resolve symbol `SQLStateSQLExceptionTranslator`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/HawkBitEclipseLinkJpaDialect.java`
#### Snippet
```java
 * <p>
 * 2.a) here the wrapped exception's causes might be an {@link SQLException}
 * which might be mappable by {@link SQLStateSQLExceptionTranslator} or
 * <p>
 * 2.b.) the wrapped exception's causes due not contain an {@link SQLException}
```

### JavadocReference
Cannot resolve symbol `SQLStateSQLExceptionTranslator`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/HawkBitEclipseLinkJpaDialect.java`
#### Snippet
```java
 * <p>
 * 3.a) here a cause might be an {@link SQLException} which might be mappable by
 * {@link SQLStateSQLExceptionTranslator} or
 * <p>
 * 3.b.) the cause is not an {@link SQLException} and as a result cannot be
```

### JavadocReference
Cannot resolve symbol `MethodValidationPostProcessor`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/RepositoryApplicationConfiguration.java`
#### Snippet
```java
     * Defines the validation processor bean.
     *
     * @return the {@link MethodValidationPostProcessor}
     */
    @Bean
```

### JavadocReference
Cannot resolve symbol `softwareManagement`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/RepositoryApplicationConfiguration.java`
#### Snippet
```java

    /**
     * @param softwareManagement
     *            for loading
     *            {@link DistributionSetType#getMandatoryModuleTypes()} and
```

### JavadocReference
Cannot resolve symbol `tenantAware`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/RepositoryApplicationConfiguration.java`
#### Snippet
```java
     * auto assign functionality.
     *
     * @param tenantAware
     *            to run as specific tenant
     * @param systemManagement
```

### JavadocReference
Cannot resolve symbol `autoAssignChecker`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/RepositoryApplicationConfiguration.java`
#### Snippet
```java
     * @param systemSecurityContext
     *            to run as system
     * @param autoAssignChecker
     *            to run a check as tenant
     * @param lockRegistry
```

### JavadocReference
Cannot resolve symbol `org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/RepositoryApplicationConfiguration.java`
#### Snippet
```java
     * {@link MultiTenantJpaTransactionManager} bean.
     *
     * @see org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration#transactionManager(ObjectProvider)
     * @return a new {@link PlatformTransactionManager}
     */
```

### JavadocReference
Cannot resolve symbol `transactionManager(ObjectProvider)`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/RepositoryApplicationConfiguration.java`
#### Snippet
```java
     * {@link MultiTenantJpaTransactionManager} bean.
     *
     * @see org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration#transactionManager(ObjectProvider)
     * @return a new {@link PlatformTransactionManager}
     */
```

### JavadocReference
Cannot resolve symbol `ObjectProvider`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/RepositoryApplicationConfiguration.java`
#### Snippet
```java
     * {@link MultiTenantJpaTransactionManager} bean.
     *
     * @see org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration#transactionManager(ObjectProvider)
     * @return a new {@link PlatformTransactionManager}
     */
```

### JavadocReference
Cannot resolve symbol `PlatformTransactionManager`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/RepositoryApplicationConfiguration.java`
#### Snippet
```java
     *
     * @see org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration#transactionManager(ObjectProvider)
     * @return a new {@link PlatformTransactionManager}
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RSQLUtility.java`
#### Snippet
```java
/**
 * A utility class which is able to parse RSQL strings into an spring data
 * {@link Specification} which then can be enhanced sql queries to filter
 * entities. RSQL parser library: https://github.com/jirutka/rsql-parser
 *
```

### JavadocReference
Cannot resolve symbol `StrLookup`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RSQLUtility.java`
#### Snippet
```java
 * <p>
 * There is also a mechanism that allows to refer to known macros that can
 * resolved by an optional {@link StrLookup} (cp.
 * {@link VirtualPropertyResolver}).<br>
 * An example that queries for all overdue targets using the ${OVERDUE_TS}
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RSQLUtility.java`
#### Snippet
```java

    /**
     * Builds a JPA {@link Specification} which corresponds with the given RSQL
     * query. The specification can be used to filter for JPA entities with the
     * given RSQL query.
```

### JavadocReference
Cannot resolve symbol `DdiRootController`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaControllerManagement.java`
#### Snippet
```java
     * it might be possible that the controller will continue to work on the
     * cancellation. The controller needs to acknowledge or reject the
     * cancellation using {@link DdiRootController#postCancelActionFeedback}.
     *
     * @param actionId
```

### JavadocReference
Cannot resolve symbol `postCancelActionFeedback`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaControllerManagement.java`
#### Snippet
```java
     * it might be possible that the controller will continue to work on the
     * cancellation. The controller needs to acknowledge or reject the
     * cancellation using {@link DdiRootController#postCancelActionFeedback}.
     *
     * @param actionId
```

### JavadocReference
Cannot resolve symbol `hashCode()`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/AbstractJpaTenantAwareBaseEntity.java`
#### Snippet
```java
     * different tenants.
     * 
     * @see org.eclipse.hawkbit.repository.model.BaseEntity#hashCode()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `equals(java.lang.Object)`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/AbstractJpaTenantAwareBaseEntity.java`
#### Snippet
```java
     * different tenants.
     * 
     * @see org.eclipse.hawkbit.repository.model.BaseEntity#equals(java.lang.Object)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `LocalArtifact`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaArtifact.java`
#### Snippet
```java

/**
 * JPA implementation of {@link LocalArtifact}.
 *
 */
```

### JavadocReference
Cannot resolve symbol `DescriptorEvent`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/EventAwareEntity.java`
#### Snippet
```java
    /**
     * @return list of entity fields that if the only changed fields prevents
     *         {@link #fireUpdateEvent(DescriptorEvent)} call.
     */
    default List<String> getUpdateIgnoreFields() {
```

### JavadocReference
Cannot resolve symbol `SecurityContext`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/helper/SecurityChecker.java`
#### Snippet
```java

    /**
     * Checks the current {@link SecurityContext} for the permission.
     * 
     * @param permission
```

### JavadocReference
Cannot resolve symbol `Aspect`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/aspects/ExceptionMappingAspectHandler.java`
#### Snippet
```java

/**
 * {@link Aspect} catches persistence exceptions and wraps them to custom
 * specific exceptions Additionally it checks and prevents access to certain
 * packages. Logging aspect which logs the call stack
```

### JavadocReference
Cannot resolve symbol `Backoff`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/configuration/Constants.java`
#### Snippet
```java

    /**
     * @see Backoff#delay()
     */
    public static final long TX_RT_DELAY = 100;
```

### JavadocReference
Cannot resolve symbol `findTenants()`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/autoassign/AutoAssignScheduler.java`
#### Snippet
```java
    /**
     * Scheduler method called by the spring-async mechanism. Retrieves all
     * tenants from the {@link SystemManagement#findTenants()} and runs for each
     * tenant the auto assignments defined in the target filter queries
     * {@link SystemSecurityContext}.
```

### JavadocReference
Cannot resolve symbol `delay()`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/configuration/Constants.java`
#### Snippet
```java

    /**
     * @see Backoff#delay()
     */
    public static final long TX_RT_DELAY = 100;
```

### JavadocReference
Cannot resolve symbol `JpaTransactionManager`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/configuration/MultiTenantJpaTransactionManager.java`
#### Snippet
```java

/**
 * {@link JpaTransactionManager} that sets the
 * {@link TenantAware#getCurrentTenant()} in the eclipselink session. This has
 * to be done in eclipselink after a {@link Transaction} has been started.
```

### JavadocReference
Cannot resolve symbol `Retryable`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/configuration/Constants.java`
#### Snippet
```java

    /**
     * @see Retryable#maxAttempts()
     */
    public static final int TX_RT_MAX = 10;
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/SoftwareModuleTypeSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link SoftwareModuleType}s by its
     * DELETED attribute.
     * 
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/SoftwareModuleTypeSpecification.java`
#### Snippet
```java
     *            TRUE/FALSE are compared to the attribute DELETED. If NULL the
     *            attribute is ignored
     * @return the {@link SoftwareModuleType} {@link Specification}
     */
    public static Specification<JpaSoftwareModuleType> isDeleted(final Boolean isDeleted) {
```

### JavadocReference
Cannot resolve symbol `maxAttempts()`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/configuration/Constants.java`
#### Snippet
```java

    /**
     * @see Retryable#maxAttempts()
     */
    public static final int TX_RT_MAX = 10;
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetFilterQuerySpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link JpaTargetFilterQuery}s based
     * on is {@link JpaTargetFilterQuery#getName()}.
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetFilterQuerySpecification.java`
#### Snippet
```java
     * @param distributionSet
     *            of the filter
     * @return the {@link JpaTargetFilterQuery} {@link Specification}
     */
    public static Specification<JpaTargetFilterQuery> byAutoAssignDS(final DistributionSet distributionSet) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetFilterQuerySpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link JpaTargetFilterQuery}s based
     * on is {@link JpaTargetFilterQuery#getQuery()}.
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetFilterQuerySpecification.java`
#### Snippet
```java
     * @param queryValue
     *            the query of the filter
     * @return the {@link JpaTargetFilterQuery} {@link Specification}
     */
    public static Specification<JpaTargetFilterQuery> equalsQuery(final String queryValue) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetFilterQuerySpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link JpaTargetFilterQuery}s based
     * on is {@link JpaTargetFilterQuery#getName()}.
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetFilterQuerySpecification.java`
#### Snippet
```java
     * on is {@link JpaTargetFilterQuery#getName()}.
     *
     * @return the {@link JpaTargetFilterQuery} {@link Specification}
     */
    public static Specification<JpaTargetFilterQuery> withAutoAssignDS() {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetFilterQuerySpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link JpaTargetFilterQuery}s based
     * on is {@link JpaTargetFilterQuery#getName()}.
     * 
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetFilterQuerySpecification.java`
#### Snippet
```java
     * @param searchText
     *            of the filter
     * @return the {@link JpaTargetFilterQuery} {@link Specification}
     */
    public static Specification<JpaTargetFilterQuery> likeName(final String searchText) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/RolloutSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Rollout}s by its DELETED
     * attribute. Includes fetch for stuff that is required for {@link Rollout}
     * queries.
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/RolloutSpecification.java`
#### Snippet
```java
     *            TRUE/FALSE are compared to the attribute DELETED. If NULL the
     *            attribute is ignored
     * @return the {@link Rollout} {@link Specification}
     */
    public static Specification<JpaRollout> isDeletedWithDistributionSet(final Boolean isDeleted, final Sort sort) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/RolloutSpecification.java`
#### Snippet
```java

    /**
     * Builds a {@link Specification} to search a rollout by name.
     *
     * @param searchText
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/SpecificationsBuilder.java`
#### Snippet
```java

/**
 * Helper class to easily combine {@link Specification} instances.
 *
 */
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetTypeSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link DistributionSetType} with
     * given {@link DistributionSetType#getName()} including fetching the
     * elements list.
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetTypeSpecification.java`
#### Snippet
```java
     * @param name
     *            to search
     * @return the {@link DistributionSet} {@link Specification}
     */
    public static Specification<JpaDistributionSetType> byName(final String name) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetTypeSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link DistributionSetType} with
     * given {@link DistributionSetType#getKey()} including fetching the
     * elements list.
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetTypeSpecification.java`
#### Snippet
```java
     * @param key
     *            to search
     * @return the {@link DistributionSet} {@link Specification}
     */
    public static Specification<JpaDistributionSetType> byKey(final String key) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetTypeSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link DistributionSetType}s by its
     * DELETED attribute.
     * 
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetTypeSpecification.java`
#### Snippet
```java
     *            TRUE/FALSE are compared to the attribute DELETED. If NULL the
     *            attribute is ignored
     * @return the {@link DistributionSetType} {@link Specification}
     */
    public static Specification<JpaDistributionSetType> isDeleted(final Boolean isDeleted) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetTypeSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link DistributionSetType} with
     * given {@link DistributionSetType#getId()} including fetching the elements
     * list.
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetTypeSpecification.java`
#### Snippet
```java
     * @param distid
     *            to search
     * @return the {@link DistributionSet} {@link Specification}
     */
    public static Specification<JpaDistributionSetType> byId(final Long distid) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/SoftwareModuleSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link SoftwareModule}s where its
     * DELETED attribute is false.
     * 
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/SoftwareModuleSpecification.java`
#### Snippet
```java
     * DELETED attribute is false.
     * 
     * @return the {@link SoftwareModule} {@link Specification}
     */
    public static Specification<JpaSoftwareModule> isDeletedFalse() {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/SoftwareModuleSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for fetching {@link SoftwareModule}s type.
     * 
     * @return the {@link SoftwareModule} {@link Specification}
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/SoftwareModuleSpecification.java`
#### Snippet
```java
     * {@link Specification} for fetching {@link SoftwareModule}s type.
     * 
     * @return the {@link SoftwareModule} {@link Specification}
     */
    public static Specification<JpaSoftwareModule> fetchType() {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/SoftwareModuleSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link SoftwareModule}s by "like
     * name or like version".
     * 
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/SoftwareModuleSpecification.java`
#### Snippet
```java
     * @param type
     *            to be filtered on
     * @return the {@link SoftwareModule} {@link Specification}
     */
    public static Specification<JpaSoftwareModule> equalType(final Long type) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/SoftwareModuleSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link SoftwareModule}s by "like
     * name and like version".
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/SoftwareModuleSpecification.java`
#### Snippet
```java
     * @param version
     *            to be filtered on
     * @return the {@link SoftwareModule} {@link Specification}
     */
    public static Specification<JpaSoftwareModule> likeNameAndVersion(final String name, final String version) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TagSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link TargetTag}s by assigned
     * {@link Target}.
     * 
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TagSpecification.java`
#### Snippet
```java
     *            of the target
     * 
     * @return the {@link JpaTargetTag} {@link Specification}
     */
    public static Specification<JpaTargetTag> ofTarget(final String controllerId) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TagSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link DistributionSetTag}s by
     * assigned {@link DistributionSet}.
     * 
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TagSpecification.java`
#### Snippet
```java
     *            of the distribution set
     * 
     * @return the {@link JpaDistributionSetTag} {@link Specification}
     */
    public static Specification<JpaDistributionSetTag> ofDistributionSet(final Long dsId) {
```

### JavadocReference
Cannot resolve symbol `Tag`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TagSpecification.java`
#### Snippet
```java

/**
 * Specifications class for {@link Tag}s. The class provides Spring Data JPQL
 * Specifications.
 *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetTypeSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link TargetType}s by controllerId
     *
     * @param id
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetTypeSpecification.java`
#### Snippet
```java
     *            to search for
     *
     * @return the {@link TargetType} {@link Specification}
     */
    public static Specification<JpaTargetType> hasId(final Long id) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetTypeSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link TargetType}s by controllerId
     *
     * @param ids
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetTypeSpecification.java`
#### Snippet
```java
     *            to search for
     *
     * @return the {@link TargetType} {@link Specification}
     */
    public static Specification<JpaTargetType> hasIdIn(final Collection<Long> ids) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetTypeSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link TargetType}s by controllerId
     *
     * @param controllerId
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetTypeSpecification.java`
#### Snippet
```java
     *            to search for
     *
     * @return the {@link TargetType} {@link Specification}
     */
    public static Specification<JpaTargetType> hasTargetControllerId(final String controllerId) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetTypeSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link TargetType}s by controllerId
     *
     * @param controllerIds
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetTypeSpecification.java`
#### Snippet
```java
     *            to search for
     *
     * @return the {@link TargetType} {@link Specification}
     */
    public static Specification<JpaTargetType> hasTargetControllerIdIn(final Collection<String> controllerIds) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetTypeSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link TargetType}s by controllerId
     *
     * @param id
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetTypeSpecification.java`
#### Snippet
```java
     *            to search for
     *
     * @return the {@link TargetType} {@link Specification}
     */
    public static Specification<JpaTargetType> hasTarget(final long id) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetTypeSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link TargetType} with
     * given {@link TargetType#getName()} including fetching the
     * elements list.
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetTypeSpecification.java`
#### Snippet
```java
     * @param name
     *            to search
     * @return the {@link TargetType} {@link Specification}
     */
    public static Specification<JpaTargetType> hasName(final String name) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetTypeSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link TargetType}s based on a
     * {@link DistributionSetType} name.
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetTypeSpecification.java`
#### Snippet
```java
     *            to search for
     *
     * @return the {@link TargetType} {@link Specification}
     */
    public static Specification<JpaTargetType> hasDsSetType(final Long dsTypeId) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetTypeSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link TargetType}s by controllerId
     *
     * @param ids
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetTypeSpecification.java`
#### Snippet
```java
     *            to search for
     *
     * @return the {@link TargetType} {@link Specification}
     */
    public static Specification<JpaTargetType> hasTarget(final Collection<Long> ids) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetTypeSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link TargetType}s by "like name".
     *
     * @param name
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetTypeSpecification.java`
#### Snippet
```java
     * @param name
     *            to be filtered on
     * @return the {@link TargetType} {@link Specification}
     */
    public static Specification<JpaTargetType> likeName(final String name) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link DistributionSet} with given
     * {@link DistributionSet#getId()}s.
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetSpecification.java`
#### Snippet
```java
     * @param distids
     *            to search
     * @return the {@link DistributionSet} {@link Specification}
     */
    public static Specification<JpaDistributionSet> byIds(final Collection<Long> distids) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link DistributionSet}s by "has at
     * least one of the given tag names".
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetSpecification.java`
#### Snippet
```java
     * @param selectDSWithNoTag
     *            flag to select distribution sets with no tag
     * @return the {@link DistributionSet} {@link Specification}
     */
    public static Specification<JpaDistributionSet> hasTags(final Collection<String> tagNames,
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link DistributionSet}s by "like
     * name and like version".
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetSpecification.java`
#### Snippet
```java
     * @param version
     *            to be filtered on
     * @return the {@link DistributionSet} {@link Specification}
     */
    public static Specification<JpaDistributionSet> likeNameAndVersion(final String name, final String version) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link DistributionSet}s by tag.
     *
     * @param tagId
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetSpecification.java`
#### Snippet
```java
     * @param tagId
     *            the ID of the distribution set which must be assigned
     * @return the {@link DistributionSet} {@link Specification}
     */
    public static Specification<JpaDistributionSet> hasTag(final Long tagId) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link DistributionSet}s by its
     * VALID attribute.
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetSpecification.java`
#### Snippet
```java
     *            TRUE/FALSE are compared to the attribute VALID. If NULL the
     *            attribute is ignored
     * @return the {@link DistributionSet} {@link Specification}
     */
    public static Specification<JpaDistributionSet> isValid(final Boolean isValid) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link DistributionSet} with given
     * {@link DistributionSet#getType()}.
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetSpecification.java`
#### Snippet
```java
     * @param typeId
     *            id of distribution set type to search
     * @return the {@link DistributionSet} {@link Specification}
     */
    public static Specification<JpaDistributionSet> byType(final Long typeId) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link DistributionSet}s by its
     * COMPLETED attribute.
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetSpecification.java`
#### Snippet
```java
     *            TRUE/FALSE are compared to the attribute COMPLETED. If NULL
     *            the attribute is ignored
     * @return the {@link DistributionSet} {@link Specification}
     */
    public static Specification<JpaDistributionSet> isCompleted(final Boolean isCompleted) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetSpecification.java`
#### Snippet
```java

    /**
     * returns query criteria {@link Specification} comparing case insensitive
     * "NAME == AND VERSION ==".
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetSpecification.java`
#### Snippet
```java
     * @param version
     *            to be filtered on
     * @return the {@link Specification}
     */
    public static Specification<JpaDistributionSet> equalsNameAndVersionIgnoreCase(final String name,
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link DistributionSet}s by its
     * DELETED attribute.
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetSpecification.java`
#### Snippet
```java
     *            TRUE/FALSE are compared to the attribute DELETED. If NULL the
     *            attribute is ignored
     * @return the {@link DistributionSet} {@link Specification}
     */
    public static Specification<JpaDistributionSet> isDeleted(final Boolean isDeleted) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetSpecification.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link DistributionSet} with given
     * {@link DistributionSet#getId()}.
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetSpecification.java`
#### Snippet
```java
     * @param distid
     *            to search
     * @return the {@link DistributionSet} {@link Specification}
     */
    public static Specification<JpaDistributionSet> byId(final Long distid) {
```

### JavadocReference
Cannot resolve symbol `ComponentScan`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtApiConfiguration.java`
#### Snippet
```java

/**
 * Enable {@link ComponentScan} in the resource package to setup all
 * {@link Controller} annotated classes and setup the REST-Resources for the
 * Management API.
```

### JavadocReference
Cannot resolve symbol `Controller`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtApiConfiguration.java`
#### Snippet
```java
/**
 * Enable {@link ComponentScan} in the resource package to setup all
 * {@link Controller} annotated classes and setup the REST-Resources for the
 * Management API.
 */
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/ActionSpecifications.java`
#### Snippet
```java

/**
 * Utility class for {@link Action}s {@link Specification}s. The class provides
 * Spring Data JPQL Specifications.
 *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link JpaTarget}s including
     * {@link JpaTarget#getAssignedDistributionSet()}.
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     *            to search for
     *
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> byControllerIdWithAssignedDsInJoin(final Collection<String> controllerIDs) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s that are compatible
     * with given {@link DistributionSetType}. Compatibility is evaluated by
     * checking the {@link TargetType} of a target. Targets that don't have a
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     * @param distributionSetTypeId
     *            the ID of the distribution set type which must be compatible
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> isCompatibleWithDistributionSetType(final Long distributionSetTypeId) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s by assigned
     * distribution set.
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     * @param distributionSetId
     *            the ID of the distribution set which must be assigned
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> hasAssignedDistributionSet(final Long distributionSetId) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s by controllerId
     *
     * @param ids
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     *            to search for
     *
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> hasIdIn(final Collection<Long> ids) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s by "not equal to
     * given {@link TargetUpdateStatus}".
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     *            to be filtered on
     *
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> notEqualToTargetUpdateStatus(final TargetUpdateStatus updateStatus) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s based on a
     * {@link TargetTag} name.
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     *            to search for
     *
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> hasTagName(final String tagName) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s by "like attribute
     * value".
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     * @param searchText
     *            to be filtered on
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> likeAttributeValue(final String searchText) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     * @param distributionId
     *            set that is not yet assigned
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> hasControllerIdAndAssignedDistributionSetIdNot(final List<String> tIDs,
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s that are in a given
     * {@link RolloutGroup}
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     * @param group
     *            the {@link RolloutGroup}
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> isInRolloutGroup(final Long group) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s by controllerId
     *
     * @param id
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     *            to search for
     *
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> hasId(final Long id) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s by controllerId
     *
     * @param controllerID
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     *            to search for
     *
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> hasControllerId(final String controllerID) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s that have the
     * request controller attributes flag set
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     * request controller attributes flag set
     *
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> hasRequestControllerAttributesTrue() {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s by "like
     * controllerId".
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     * @param distributionId
     *            to be filtered on
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> hasInstalledOrAssignedDistributionSet(@NotNull final Long distributionId) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s that are overdue. A
     * target is overdue if it did not respond during the configured
     * intervals:<br>
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     *            overdue_itvl</em>
     *
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> isOverdue(final long overdueTimestamp) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s by assigned
     * distribution set.
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     * @param distributionSetId
     *            the ID of the distribution set which must be assigned
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> hasInstalledDistributionSet(final Long distributionSetId) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s by "equal to any
     * given {@link TargetUpdateStatus}".
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     *            to be filtered on
     *
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> hasTargetUpdateStatus(final Collection<TargetUpdateStatus> updateStatus) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s that have no Action
     * of the {@link RolloutGroup}.
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     * @param group
     *            the {@link RolloutGroup}
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> hasNoActionInRolloutGroup(final Long group) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s by "equal to given
     * {@link TargetUpdateStatus}".
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     *            to be filtered on
     *
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> hasTargetUpdateStatus(final TargetUpdateStatus updateStatus) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s that are not in the
     * given {@link RolloutGroup}s
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     * @param groups
     *            the {@link RolloutGroup}s
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> isNotInRolloutGroups(final Collection<Long> groups) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s by "like
     * controllerId or like name".
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     * @param searchText
     *            to be filtered on
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> likeControllerIdOrName(final String searchText) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s by controllerId
     *
     * @param controllerIDs
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     *            to search for
     *
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> hasControllerIdIn(final Collection<String> controllerIDs) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s by "has no tag
     * names"or "has at least on of the given tag names".
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     * @param selectTargetWithNoTag
     *            flag to get targets with no tag assigned
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> hasTags(final String[] tagNames, final Boolean selectTargetWithNoTag) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s by tag.
     *
     * @param tagId
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     * @param tagId
     *            the ID of the tag that should be to be assigned to target
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> hasTag(final Long tagId) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s that are NOT
     * compatible with given {@link DistributionSetType}. Compatibility is
     * evaluated by checking the {@link TargetType} of a target. Targets that
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     * @param distributionSetTypeId
     *            the ID of the distribution set type which must be incompatible
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> notCompatibleWithDistributionSetType(final Long distributionSetTypeId) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s by target type id
     *
     * @param typeId
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     *            the id of the target type
     *
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> hasTargetType(final long typeId) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s that don't have
     * target type assigned
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     *            the id of the target type
     *
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> hasTargetTypeNot(final Long typeId) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s that are in an
     * action for a given {@link RolloutGroup}
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     * @param group
     *            the {@link RolloutGroup}
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> isInActionRolloutGroup(final Long group) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s including
     * {@link TargetTag}s.
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     *            to search for
     *
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> byControllerIdWithTagsInJoin(final Collection<String> controllerIDs) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s that don't have the
     * given distribution set in their action history
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     * @param distributionSetId
     *            the ID of the distribution set which must not be assigned
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> hasNotDistributionSetInActions(final Long distributionSetId) {
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java

    /**
     * {@link Specification} for retrieving {@link Target}s by target type id is
     * equal to null
     *
```

### JavadocReference
Cannot resolve symbol `Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/TargetSpecifications.java`
#### Snippet
```java
     * equal to null
     *
     * @return the {@link Target} {@link Specification}
     */
    public static Specification<JpaTarget> hasNoTargetType() {
```

### JavadocReference
Cannot resolve symbol `ConfigurationProperties`
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/PropertiesQuotaManagement.java`
#### Snippet
```java
/**
 * {@link QuotaManagement} implementation based on spring boot
 * {@link ConfigurationProperties}.
 *
 */
```

### JavadocReference
Cannot resolve symbol `ServiceMatcher`
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/model/helper/EventPublisherHolder.java`
#### Snippet
```java

    /**
     * @return the service origin Id coming either from {@link ServiceMatcher}
     *         when available or {@link BusProperties} otherwise.
     */
```

### JavadocReference
Cannot resolve symbol `BusProperties`
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/model/helper/EventPublisherHolder.java`
#### Snippet
```java
    /**
     * @return the service origin Id coming either from {@link ServiceMatcher}
     *         when available or {@link BusProperties} otherwise.
     */
    public String getApplicationId() {
```

### JavadocReference
Cannot resolve symbol `Rollout`
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/rollout/MgmtRolloutRestRequestBody.java`
#### Snippet
```java
    /**
     * @param weight
     *            the priority of {@link Rollout}
     */
    public void setWeight(final Integer weight) {
```

### JavadocReference
Cannot resolve symbol `Rollout`
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/rollout/MgmtRolloutRestRequestBody.java`
#### Snippet
```java

    /**
     * @return the priority of {@link Rollout}
     */
    public Integer getWeight() {
```

### JavadocReference
Cannot resolve symbol `response`
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/rest/api/MgmtDownloadRestApi.java`
#### Snippet
```java
     * @param downloadId
     *            the generated download id
     * @param response
     *            of the servlet
     * @return {@link ResponseEntity} with status {@link HttpStatus#OK} if
```

### JavadocReference
Cannot resolve symbol `ResponseEntity`
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/rest/api/MgmtDownloadRestApi.java`
#### Snippet
```java
     * @param response
     *            of the servlet
     * @return {@link ResponseEntity} with status {@link HttpStatus#OK} if
     *         successful
     */
```

### JavadocReference
Cannot resolve symbol `HttpStatus`
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/rest/api/MgmtDownloadRestApi.java`
#### Snippet
```java
     * @param response
     *            of the servlet
     * @return {@link ResponseEntity} with status {@link HttpStatus#OK} if
     *         successful
     */
```

### JavadocReference
Cannot resolve symbol `OK`
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/rest/api/MgmtDownloadRestApi.java`
#### Snippet
```java
     * @param response
     *            of the servlet
     * @return {@link ResponseEntity} with status {@link HttpStatus#OK} if
     *         successful
     */
```

### JavadocReference
Cannot resolve symbol `servletResponse`
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/rest/api/MgmtDownloadArtifactRestApi.java`
#### Snippet
```java
     * @param artifactId
     *            of the related LocalArtifact
     * @param servletResponse
     *            of the servlet
     * @param request
```

### JavadocReference
Cannot resolve symbol `request`
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/rest/api/MgmtDownloadArtifactRestApi.java`
#### Snippet
```java
     * @param servletResponse
     *            of the servlet
     * @param request
     *            of the client
     *
```

### JavadocReference
Cannot resolve symbol `MultipartFile`
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/rest/api/MgmtSoftwareModuleRestApi.java`
#### Snippet
```java
     *            that has to be uploaded
     * @param optionalFileName
     *            to override {@link MultipartFile#getOriginalFilename()}
     * @param md5Sum
     *            checksum for uploaded content check
```

### JavadocReference
Cannot resolve symbol `getOriginalFilename()`
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/rest/api/MgmtSoftwareModuleRestApi.java`
#### Snippet
```java
     *            that has to be uploaded
     * @param optionalFileName
     *            to override {@link MultipartFile#getOriginalFilename()}
     * @param md5Sum
     *            checksum for uploaded content check
```

### JavadocReference
Cannot resolve symbol `sha256Sum`
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/rest/api/MgmtSoftwareModuleRestApi.java`
#### Snippet
```java
     * @param sha1Sum
     *            checksum for uploaded content check
     * @param sha256Sum
     *            checksum for uploaded content check
     * 
```

### JavadocReference
Cannot resolve symbol `AuthenticationProvider`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/im/authentication/MultitenancyIndicator.java`
#### Snippet
```java
 * login screen needs to allow to specifiy the tenant to login.
 *
 * This can defere e.g. in case if the {@link AuthenticationProvider} allows
 * {@link TenantUserPasswordAuthenticationToken} tokens or not.
 *
```

### JavadocReference
Cannot resolve symbol `AbstractAuthenticationToken`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/im/authentication/TenantAwareAuthenticationDetails.java`
#### Snippet
```java
/**
 * An authentication details object
 * {@link AbstractAuthenticationToken#getDetails()} which is stored in the
 * spring security authentication token details to transport the principal and
 * tenant in the security context session.
```

### JavadocReference
Cannot resolve symbol `getDetails()`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/im/authentication/TenantAwareAuthenticationDetails.java`
#### Snippet
```java
/**
 * An authentication details object
 * {@link AbstractAuthenticationToken#getDetails()} which is stored in the
 * spring security authentication token details to transport the principal and
 * tenant in the security context session.
```

### JavadocReference
Cannot resolve symbol `GrantedAuthority`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/im/authentication/PermissionUtils.java`
#### Snippet
```java
	 * Returns all authorities.
	 * 
	 * @return a list of {@link GrantedAuthority}
	 */
	public static List<GrantedAuthority> createAllAuthorityList() {
```

### JavadocReference
Cannot resolve symbol `org.springframework.http.HttpStatus`
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/rest/api/MgmtTargetRestApi.java`
#### Snippet
```java
     *            to deactivate auto-confirm on
     * 
     * @return {@link org.springframework.http.HttpStatus#OK} in case of a
     *         success
     */
```

### JavadocReference
Cannot resolve symbol `OK`
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/rest/api/MgmtTargetRestApi.java`
#### Snippet
```java
     *            to deactivate auto-confirm on
     * 
     * @return {@link org.springframework.http.HttpStatus#OK} in case of a
     *         success
     */
```

### JavadocReference
Cannot resolve symbol `org.springframework.http.HttpStatus`
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/rest/api/MgmtTargetRestApi.java`
#### Snippet
```java
     * @param update
     *            properties to update
     * @return {@link org.springframework.http.HttpStatus#OK} in case of a
     *         success
     */
```

### JavadocReference
Cannot resolve symbol `OK`
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/rest/api/MgmtTargetRestApi.java`
#### Snippet
```java
     * @param update
     *            properties to update
     * @return {@link org.springframework.http.HttpStatus#OK} in case of a
     *         success
     */
```

### JavadocReference
Cannot resolve symbol `isAuthenticated()`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/im/authentication/TenantUserPasswordAuthenticationToken.java`
#### Snippet
```java
     *
     * Creating a new {@link TenantUserPasswordAuthenticationToken} as
     * {@link #isAuthenticated()} will return {@code false}.
     *
     * @param tenant
```

### JavadocReference
Cannot resolve symbol `isAuthenticated()`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/im/authentication/TenantUserPasswordAuthenticationToken.java`
#### Snippet
```java
    /**
     * Creating a new {@link TenantUserPasswordAuthenticationToken} as
     * {@link #isAuthenticated()} will return {@code true}.
     *
     * @param tenant
```

### JavadocReference
Cannot resolve symbol `SecurityContext`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/im/authentication/UserPrincipal.java`
#### Snippet
```java
/**
 * A software provisioning user principal definition stored in the
 * {@link SecurityContext} which contains the user specific attributes.
 * 
 */
```

### JavadocReference
Cannot resolve symbol `HttpHeaders`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/util/IpUtil.java`
#### Snippet
```java
     * Retrieves the string based IP address from a given
     * {@link HttpServletRequest} by either the
     * {@link HttpHeaders#X_FORWARDED_FOR} or by the
     * {@link HttpServletRequest#getRemoteAddr()} methods.
     *
```

### JavadocReference
Cannot resolve symbol `X_FORWARDED_FOR`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/util/IpUtil.java`
#### Snippet
```java
     * Retrieves the string based IP address from a given
     * {@link HttpServletRequest} by either the
     * {@link HttpHeaders#X_FORWARDED_FOR} or by the
     * {@link HttpServletRequest#getRemoteAddr()} methods.
     *
```

### JavadocReference
Cannot resolve symbol `HttpHeaders`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/util/IpUtil.java`
#### Snippet
```java
     * Retrieves the string based IP address from a given
     * {@link HttpServletRequest} by either the
     * {@link HttpHeaders#X_FORWARDED_FOR} or by the
     * {@link HttpServletRequest#getRemoteAddr()} methods.
     *
```

### JavadocReference
Cannot resolve symbol `X_FORWARDED_FOR`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/util/IpUtil.java`
#### Snippet
```java
     * Retrieves the string based IP address from a given
     * {@link HttpServletRequest} by either the
     * {@link HttpHeaders#X_FORWARDED_FOR} or by the
     * {@link HttpServletRequest#getRemoteAddr()} methods.
     *
```

### JavadocReference
Cannot resolve symbol `Authentication`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/SystemSecurityContext.java`
#### Snippet
```java

    /**
     * An implementation of the Spring's {@link Authentication} object which is
     * used within a system security code block and wraps the original
     * authentication object. The wrapped object contains the necessary
```

### JavadocReference
Cannot resolve symbol `GrantedAuthority`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/SystemSecurityContext.java`
#### Snippet
```java
    /**
     * Runs a given {@link Callable} within a system security context, which has
     * the provided {@link GrantedAuthority}s to successfully run the
     * {@link Callable}.
     * 
```

### JavadocReference
Cannot resolve symbol `SecurityContext`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/SystemSecurityContext.java`
#### Snippet
```java
     * 
     * The security context will be switched to the a new
     * {@link SecurityContext} and back after the callable is called.
     * 
     * @param tenant
```

### JavadocReference
Cannot resolve symbol `PreAuthenticatedAuthenticationToken`
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/PreAuthTokenSourceTrustAuthenticationProvider.java`
#### Snippet
```java
/**
 * An spring authentication provider which supports authentication tokens of
 * type {@link PreAuthenticatedAuthenticationToken} created by the
 * {@link ControllerPreAuthenticatedSecurityHeaderFilter}.
 *
```

### JavadocReference
Cannot resolve symbol `SecurityContext`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/SecurityContextTenantAware.java`
#### Snippet
```java
/**
 * A {@link TenantAware} implementation which retrieves the ID of the tenant
 * from the {@link SecurityContext#getAuthentication()}
 * {@link Authentication#getDetails()} which holds the
 * {@link TenantAwareAuthenticationDetails} object.
```

### JavadocReference
Cannot resolve symbol `getAuthentication()`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/SecurityContextTenantAware.java`
#### Snippet
```java
/**
 * A {@link TenantAware} implementation which retrieves the ID of the tenant
 * from the {@link SecurityContext#getAuthentication()}
 * {@link Authentication#getDetails()} which holds the
 * {@link TenantAwareAuthenticationDetails} object.
```

### JavadocReference
Cannot resolve symbol `Authentication`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/SecurityContextTenantAware.java`
#### Snippet
```java
 * A {@link TenantAware} implementation which retrieves the ID of the tenant
 * from the {@link SecurityContext#getAuthentication()}
 * {@link Authentication#getDetails()} which holds the
 * {@link TenantAwareAuthenticationDetails} object.
 *
```

### JavadocReference
Cannot resolve symbol `getDetails()`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/SecurityContextTenantAware.java`
#### Snippet
```java
 * A {@link TenantAware} implementation which retrieves the ID of the tenant
 * from the {@link SecurityContext#getAuthentication()}
 * {@link Authentication#getDetails()} which holds the
 * {@link TenantAwareAuthenticationDetails} object.
 *
```

### JavadocReference
Cannot resolve symbol `Authentication`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/SecurityContextTenantAware.java`
#### Snippet
```java

    /**
     * An {@link Authentication} implementation to delegate to an existing
     * {@link Authentication} object except setting the details specifically for
     * a specific tenant and user.
```

### JavadocReference
Cannot resolve symbol `Authentication`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/SecurityContextTenantAware.java`
#### Snippet
```java
    /**
     * An {@link Authentication} implementation to delegate to an existing
     * {@link Authentication} object except setting the details specifically for
     * a specific tenant and user.
     */
```

### JavadocReference
Cannot resolve symbol `GrantedAuthority`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/im/authentication/SpPermission.java`
#### Snippet
```java
 * <p>
 * Software provisioning permissions that are technically available as
 * {@linkplain GrantedAuthority} based on the authenticated users identity
 * context.
 * </p>
```

### JavadocReference
Cannot resolve symbol `Authentication`
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/PreAuthenticationFilter.java`
#### Snippet
```java
     * @return the authorities granted to the principal, or an empty collection if
     *         the token has not been authenticated. Never null.
     * @see Authentication#getAuthorities()
     */
    default Collection<GrantedAuthority> getSuccessfulAuthenticationAuthorities() {
```

### JavadocReference
Cannot resolve symbol `getAuthorities()`
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/PreAuthenticationFilter.java`
#### Snippet
```java
     * @return the authorities granted to the principal, or an empty collection if
     *         the token has not been authenticated. Never null.
     * @see Authentication#getAuthorities()
     */
    default Collection<GrantedAuthority> getSuccessfulAuthenticationAuthorities() {
```

### JavadocReference
Cannot resolve symbol `PreAuthorize`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/im/authentication/SpPermission.java`
#### Snippet
```java
     * <p>
     * Contains all the spring security evaluation expressions for the
     * {@link PreAuthorize} annotation for method security.
     * </p>
     *
```

### JavadocReference
Cannot resolve symbol `IS_CONTROLLER`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/im/authentication/SpPermission.java`
#### Snippet
```java
        /**
         * Spring security eval hasAuthority expression to check if spring
         * context contains {@link SpPermission#IS_CONTROLLER} or
         * {@link #HAS_AUTH_READ_REPOSITORY_AND_UPDATE_TARGET}.
         */
```

### JavadocReference
Cannot resolve symbol `CONTROLLER_DOWNLOAD_ROLE_ANONYMOUS`
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/ControllerPreAuthenticatedAnonymousDownload.java`
#### Snippet
```java
/**
 * An pre-authenticated processing filter which add the
 * {@link SpringEvalExpressions#CONTROLLER_DOWNLOAD_ROLE_ANONYMOUS} to the
 * security context in case the anonymous download is allowed through
 * configuration.
```

### JavadocReference
Cannot resolve symbol `AuthenticationDetailsSource`
in `hawkbit-http-security/src/main/java/org/eclipse/hawkbit/security/ControllerTenantAwareAuthenticationDetailsSource.java`
#### Snippet
```java

/**
 * An {@link AuthenticationDetailsSource} implementation which retrieves the
 * tenant from a request pattern {@link #TENANT_AWARE_CONTROLLER_PATTERN} and
 * stores the retrieved tenant in the {@link TenantAwareAuthenticationDetails}.
```

### JavadocReference
Cannot resolve symbol `StrictHttpFirewall`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/HawkbitSecurityProperties.java`
#### Snippet
```java

    /**
     * Add paths that will be ignored by {@link StrictHttpFirewall}.
     */
    private List<String> httpFirewallIgnoredPaths;
```

### JavadocReference
Cannot resolve symbol `CONTROLLER_DOWNLOAD_ROLE_ANONYMOUS`
in `hawkbit-http-security/src/main/java/org/eclipse/hawkbit/security/HttpControllerPreAuthenticateAnonymousDownloadFilter.java`
#### Snippet
```java
/**
 * An pre-authenticated processing filter which add the
 * {@link SpringEvalExpressions#CONTROLLER_DOWNLOAD_ROLE_ANONYMOUS} to the
 * security context in case the anonymous download is allowed through
 * configuration.
```

## RuleId[id=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/PreAuthTokenSourceTrustAuthenticationProvider.java`
#### Snippet
```java
    public PreAuthTokenSourceTrustAuthenticationProvider(final String... authorizedSourceIps) {
        this.authorizedSourceIps = new ArrayList<>();
        for (final String ip : authorizedSourceIps) {
            this.authorizedSourceIps.add(ip);
        }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Unboxing of `Optional.ofNullable(set).map(DistributionSet::getId).orElse(null)` may produce `NullPointerException`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/builder/RolloutCreate.java`
#### Snippet
```java
     */
    default RolloutCreate set(final DistributionSet set) {
        return set(Optional.ofNullable(set).map(DistributionSet::getId).orElse(null));
    }

```

### DataFlowIssue
Condition `t instanceof AmqpRejectAndDontRequeueException` is redundant and can be replaced with a null check
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/DelegatingConditionalErrorHandler.java`
#### Snippet
```java

    private boolean includesAmqpRejectException(final Throwable t) {
        if (t instanceof AmqpRejectAndDontRequeueException){
            return true;
        }
```

### DataFlowIssue
Method invocation `getCause` will produce `NullPointerException`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/DelegatingConditionalErrorHandler.java`
#### Snippet
```java
            return true;
        }
        if (t.getCause() != null) {
            return includesAmqpRejectException(t.getCause());
        }
```

### DataFlowIssue
Condition `cause instanceof MessageConversionException` is redundant and can be replaced with a null check
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/DelayedRequeueExceptionStrategy.java`
#### Snippet
```java

    private static boolean isMessageException(final Throwable cause) {
        return cause instanceof InvalidTargetAddressException || cause instanceof MessageConversionException
                || cause instanceof MessageHandlingException;
    }
```

### DataFlowIssue
Condition `pushStrategy instanceof ApplicationListener` is redundant and can be replaced with a null check
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/AbstractHawkbitUI.java`
#### Snippet
```java

    private void clearContextListener() {
        if (pushStrategy instanceof ApplicationListener && context instanceof AbstractApplicationContext) {
            final ApplicationListener<?> listener = (ApplicationListener<?>) pushStrategy;
            ((AbstractApplicationContext) context).getApplicationListeners().remove(listener);
```

### DataFlowIssue
Method invocation `getProviderDetails` may produce `NullPointerException`
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/SecurityManagedConfiguration.java`
#### Snippet
```java

                Assert.notNull(clientRegistration, "There must be a valid client registration");
                httpSec.oauth2ResourceServer().jwt().jwkSetUri(clientRegistration.getProviderDetails().getJwkSetUri());

                oidcBearerTokenAuthenticationFilter.setClientRegistration(clientRegistration);
```

### DataFlowIssue
Method invocation `getUsername` will produce `NullPointerException`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/UserDetailsFormatter.java`
#### Snippet
```java
    private static String formatUserName(final int expectedNameLength, final UserDetails userDetails) {
        if (!(userDetails instanceof UserPrincipal)) {
            return userDetails.getUsername();
        }

```

### DataFlowIssue
Method invocation `getPrincipal` will produce `NullPointerException`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/UserDetailsFormatter.java`
#### Snippet
```java
                    oidcUser.getAuthorities());
        } else {
            return (UserDetails) authentication.getPrincipal();
        }
    }
```

### DataFlowIssue
Argument `dsType` might be null
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/assignment/SwModulesToDistributionSetAssignmentSupport.java`
#### Snippet
```java
        return sourceItemsToAssign.stream()
                .filter(sm -> checkDuplicateSmToDsAssignment(sm, targetItem, smIdsAlreadyAssignedToDs)
                        && checkValidTypeAssignment(sm, targetItem, dsType))
                .collect(Collectors.toList());
    }
```

### DataFlowIssue
Method invocation `getClass` will produce `NullPointerException`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/DistributedResourceBundleMessageSource.java`
#### Snippet
```java
            LOGGER.warn(
                    "Resource Loader {} doesn't support getting multiple resources. Default properties mechanism will used",
                    resourceLoader.getClass().getName());
            return super.refreshProperties(filename, propHolder);
        }
```

### DataFlowIssue
Method invocation `getCache` will produce `NullPointerException`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/cache/DefaultDownloadIdCache.java`
#### Snippet
```java
        final Cache cache = (cacheManager instanceof TenancyCacheManager)
                ? ((TenancyCacheManager) cacheManager).getDirectCache(DOWNLOAD_ID_CACHE)
                : cacheManager.getCache(DOWNLOAD_ID_CACHE);
        return Objects.requireNonNull(cache, "Cache(s) returned by cache-manager must not be null!");
    }
```

### DataFlowIssue
Method invocation `getBeginColumn` may produce `NullPointerException`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java
        final int currentTokenKind = currentToken.getKind();
        final String currentTokenImageName = currentToken.getImage();
        final int nextTokenBeginColumn = nextToken.getBeginColumn();
        final int currentTokenEndColumn = currentToken.getEndColumn();

```

### DataFlowIssue
Argument `currentTokenImageName` might be null
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java
        if (currentTokenKind == 5) {
            final Optional<List<SuggestToken>> handleFieldTokenSuggestion = handleFieldTokenSuggestion(
                    currentTokenImageName, nextTokenBeginColumn, currentTokenEndColumn);
            if (handleFieldTokenSuggestion.isPresent()) {
                return handleFieldTokenSuggestion.get();
```

### DataFlowIssue
Condition `ex instanceof TransactionSystemException` is redundant and can be replaced with a null check
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/aspects/ExceptionMappingAspectHandler.java`
#### Snippet
```java
        // ConstraintViolationException directly in case of existing entity
        // update
        if (ex instanceof TransactionSystemException) {
            throw replaceWithCauseIfConstraintViolationException((TransactionSystemException) ex);
        }
```

### DataFlowIssue
Method invocation `getClass` may produce `NullPointerException`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/aspects/ExceptionMappingAspectHandler.java`
#### Snippet
```java
        for (final Class<?> mappedEx : MAPPED_EXCEPTION_ORDER) {

            if (!mappedEx.isAssignableFrom(ex.getClass())) {
                continue;
            }
```

### DataFlowIssue
Dereference of `ex` may produce `NullPointerException`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/aspects/ExceptionMappingAspectHandler.java`
#### Snippet
```java
        }

        throw ex;
    }

```

### DataFlowIssue
Argument `response` might be null
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtDistributionSetTagResource.java`
#### Snippet
```java

        final MgmtTag response = MgmtTagMapper.toResponse(distributionSetTag);
        MgmtTagMapper.addLinks(distributionSetTag, response);

        return ResponseEntity.ok(response);
```

### DataFlowIssue
Argument `response` might be null
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtDistributionSetTagResource.java`
#### Snippet
```java

        final MgmtTag response = MgmtTagMapper.toResponse(distributionSetTag);
        MgmtTagMapper.addLinks(distributionSetTag, response);

        return ResponseEntity.ok(response);
```

### DataFlowIssue
Variable is already assigned to this value
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/PreAuthTokenSourceTrustAuthenticationProvider.java`
#### Snippet
```java
                        "Cannot determine the controller remote-ip-address based on the given authentication token - {} , token details are not TenantAwareWebAuthenticationDetails! ",
                        tokenDetails);
                success = false;
            } else {
                remoteAddress = ((TenantAwareWebAuthenticationDetails) tokenDetails).getRemoteAddress();
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/exception/ArtifactEncryptionFailedException.java`
#### Snippet
```java
     */
    public enum EncryptionOperation {
        GENERATE_SECRETS, ENCRYPT, DECRYPT;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/proxies/ProxyRolloutWindow.java`
#### Snippet
```java
     */
    public enum GroupDefinitionMode {
        SIMPLE, ADVANCED;
    }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/proxies/ProxyUploadProgress.java`
#### Snippet
```java
     */
    public enum ProgressSatus {
        INPROGRESS, FINISHED, FAILED;
    }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/proxies/ProxyType.java`
#### Snippet
```java
     */
    public enum SmTypeAssign {
        SINGLE, MULTI;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/PinSupport.java`
#### Snippet
```java
     */
    public enum PinBehaviourType {
        PINNED, UNPINNED;
    }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/event/FilterType.java`
#### Snippet
```java
 */
public enum FilterType {
    SEARCH, TYPE, TAG, NO_TAG, TARGET_TYPE, NO_TARGET_TYPE, STATUS, OVERDUE, QUERY, DISTRIBUTION, MASTER;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/event/LayoutResizeEventPayload.java`
#### Snippet
```java
     */
    public enum ResizeType {
        MINIMIZE, MAXIMIZE;
    }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/event/ActionsVisibilityEventPayload.java`
#### Snippet
```java
     */
    public enum ActionsVisibilityType {
        SHOW_EDIT, SHOW_DELETE, HIDE_ALL;
    }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/event/LayoutVisibilityEventPayload.java`
#### Snippet
```java
     */
    public enum VisibilityType {
        SHOW, HIDE;
    }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/event/EntityDraggingEventPayload.java`
#### Snippet
```java
     */
    public enum DraggingEventType {
        STARTED, STOPPED;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/event/TargetFilterTabChangedEventPayload.java`
#### Snippet
```java
 */
public enum TargetFilterTabChangedEventPayload {
    SIMPLE, CUSTOM, TARGET_TYPE;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/event/EventLayout.java`
#### Snippet
```java
 */
public enum EventLayout {
    TARGET_TAG_FILTER, TARGET_LIST, DS_LIST, DS_TAG_FILTER, ACTION_HISTORY_LIST, ACTION_HISTORY_STATUS_LIST, ROLLOUT_LIST, ROLLOUT_GROUP_LIST, ROLLOUT_GROUP_TARGET_LIST, TARGET_FILTER_QUERY_LIST, TARGET_FILTER_QUERY_FORM, DS_TYPE_FILTER, SM_TYPE_FILTER, SM_LIST, ARTIFACT_LIST;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/event/BulkUploadEventPayload.java`
#### Snippet
```java
     */
    public enum BulkUploadState {
        UPLOAD_STARTED, UPLOAD_FAILED, TARGET_PROVISIONING_STARTED, TARGET_PROVISIONING_PROGRESS_UPDATED, TAGS_AND_DS_ASSIGNMENT_STARTED, TAGS_AND_DS_ASSIGNMENT_FAILED, BULK_UPLOAD_COMPLETED;
    }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/event/ShowFormEventPayload.java`
#### Snippet
```java
     */
    public enum FormType {
        ADD, EDIT;
    }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/event/SelectionChangedEventPayload.java`
#### Snippet
```java
     */
    public enum SelectionChangedEventType {
        ENTITY_SELECTED, ENTITY_DESELECTED;
    }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/event/PinningChangedEventPayload.java`
#### Snippet
```java
     */
    public enum PinningChangedEventType {
        ENTITY_PINNED, ENTITY_UNPINNED;
    }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/event/EntityModifiedEventPayload.java`
#### Snippet
```java
     */
    public enum EntityModifiedEventType {
        ENTITY_ADDED, ENTITY_UPDATED, ENTITY_REMOVED;
    }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/filterlayout/AbstractFilterButtonClickBehaviour.java`
#### Snippet
```java
     */
    public enum ClickBehaviourType {
        CLICKED, UNCLICKED;
    }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/components/AutoStartOptionGroupLayout.java`
#### Snippet
```java
     */
    public enum AutoStartOption {
        MANUAL, AUTO_START, SCHEDULED;

    }
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'java.util.ArrayList' constructor
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettable/TargetDetails.java`
#### Snippet
```java

            final List<Map.Entry<String, String>> targetAttributes = targetManagement
                    .getControllerAttributes(controllerId).entrySet().stream().collect(Collectors.toList());

            final List<ProxyKeyValueDetails> attributes = IntStream.range(0, targetAttributes.size())
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java
        if (!CollectionUtils.isEmpty(expectedTokens)) {
            final StringBuilder tokens = new StringBuilder();
            expectedTokens.stream().forEach(value -> tokens.append(value.getSuggestion() + ","));
            builder = builder.concat("Was expecting :" + tokens.toString().substring(0, tokens.length() - 1));
        }
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/RolloutHelper.java`
#### Snippet
```java

    private static String concatAndTargetFilters(final String... filters) {
        return "(" + Arrays.stream(filters).collect(Collectors.joining(");(")) + ")";
    }

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java
        }

        builder = message.substring(message.indexOf(':') + 1, message.length());
        if (builder.indexOf("Was expecting") != -1) {
            builder = builder.substring(0, builder.lastIndexOf("Was expecting"));
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java
            final StringBuilder tokens = new StringBuilder();
            expectedTokens.stream().forEach(value -> tokens.append(value.getSuggestion() + ","));
            builder = builder.concat("Was expecting :" + tokens.toString().substring(0, tokens.length() - 1));
        }
        builder = builder.replace('\r', ' ');
```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/data/ResponseList.java`
#### Snippet
```java

    @Override
    public <T> T[] toArray(final T[] a) {
        return content.toArray(a);
    }
```

## RuleId[id=SpringBootApplicationProperties]
### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.security.user.password'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application.properties`
#### Snippet
```java
# User Security
spring.security.user.name=admin
spring.security.user.password={noop}admin
spring.main.allow-bean-definition-overriding=true

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.main.allow-bean-definition-overriding'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application.properties`
#### Snippet
```java
spring.security.user.name=admin
spring.security.user.password={noop}admin
spring.main.allow-bean-definition-overriding=true

# Http Encoding
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'server.servlet.encoding.charset'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application.properties`
#### Snippet
```java

# Http Encoding
server.servlet.encoding.charset=UTF-8
server.servlet.encoding.enabled=true
server.servlet.encoding.force=true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'server.servlet.encoding.enabled'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application.properties`
#### Snippet
```java
# Http Encoding
server.servlet.encoding.charset=UTF-8
server.servlet.encoding.enabled=true
server.servlet.encoding.force=true

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'server.servlet.encoding.force'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application.properties`
#### Snippet
```java
server.servlet.encoding.charset=UTF-8
server.servlet.encoding.enabled=true
server.servlet.encoding.force=true

# DDI authentication configuration
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.server.ddi.security.authentication.anonymous.enabled'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application.properties`
#### Snippet
```java

# DDI authentication configuration
hawkbit.server.ddi.security.authentication.anonymous.enabled=false
hawkbit.server.ddi.security.authentication.targettoken.enabled=false
hawkbit.server.ddi.security.authentication.gatewaytoken.enabled=false
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.server.ddi.security.authentication.targettoken.enabled'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application.properties`
#### Snippet
```java
# DDI authentication configuration
hawkbit.server.ddi.security.authentication.anonymous.enabled=false
hawkbit.server.ddi.security.authentication.targettoken.enabled=false
hawkbit.server.ddi.security.authentication.gatewaytoken.enabled=false

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.server.ddi.security.authentication.gatewaytoken.enabled'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.server.ddi.security.authentication.anonymous.enabled=false
hawkbit.server.ddi.security.authentication.targettoken.enabled=false
hawkbit.server.ddi.security.authentication.gatewaytoken.enabled=false

# Optional events
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.server.repository.publish-target-poll-event'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application.properties`
#### Snippet
```java

# Optional events
hawkbit.server.repository.publish-target-poll-event=false

## Configuration for DMF/RabbitMQ integration
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.rabbitmq.username'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application.properties`
#### Snippet
```java

## Configuration for DMF/RabbitMQ integration
spring.rabbitmq.username=guest
spring.rabbitmq.password=guest
spring.rabbitmq.virtual-host=/
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.rabbitmq.password'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application.properties`
#### Snippet
```java
## Configuration for DMF/RabbitMQ integration
spring.rabbitmq.username=guest
spring.rabbitmq.password=guest
spring.rabbitmq.virtual-host=/
spring.rabbitmq.host=localhost
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.rabbitmq.virtual-host'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application.properties`
#### Snippet
```java
spring.rabbitmq.username=guest
spring.rabbitmq.password=guest
spring.rabbitmq.virtual-host=/
spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.rabbitmq.host'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application.properties`
#### Snippet
```java
spring.rabbitmq.password=guest
spring.rabbitmq.virtual-host=/
spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.rabbitmq.port'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application.properties`
#### Snippet
```java
spring.rabbitmq.virtual-host=/
spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672

# Define own users instead of default "admin" user:
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'server.forward-headers-strategy'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application-cloudsandbox.properties`
#### Snippet
```java
#

server.forward-headers-strategy=NATIVE

# Sandbox, small files only
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.servlet.multipart.max-file-size'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application-cloudsandbox.properties`
#### Snippet
```java

# Sandbox, small files only
spring.servlet.multipart.max-file-size=100KB
spring.servlet.multipart.max-request-size=-1

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.servlet.multipart.max-request-size'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application-cloudsandbox.properties`
#### Snippet
```java
# Sandbox, small files only
spring.servlet.multipart.max-file-size=100KB
spring.servlet.multipart.max-request-size=-1

## Configuration for building download URLs - START
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.artifact.url.protocols.download-http.rel'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application-cloudsandbox.properties`
#### Snippet
```java

## Configuration for building download URLs - START
hawkbit.artifact.url.protocols.download-http.rel=download-http
hawkbit.artifact.url.protocols.download-http.protocol=https
hawkbit.artifact.url.protocols.download-http.supports=DMF,DDI
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.artifact.url.protocols.download-http.supports'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application-cloudsandbox.properties`
#### Snippet
```java
hawkbit.artifact.url.protocols.download-http.rel=download-http
hawkbit.artifact.url.protocols.download-http.protocol=https
hawkbit.artifact.url.protocols.download-http.supports=DMF,DDI
hawkbit.artifact.url.protocols.download-http.hostname=hawkbit.eclipse.org
hawkbit.artifact.url.protocols.download-http.ref={protocol}://{hostname}/{tenant}/controller/v1/{controllerId}/softwaremodules/{softwareModuleId}/artifacts/{artifactFileName}
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.artifact.url.protocols.md5sum-http.rel'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application-cloudsandbox.properties`
#### Snippet
```java
hawkbit.artifact.url.protocols.download-http.hostname=hawkbit.eclipse.org
hawkbit.artifact.url.protocols.download-http.ref={protocol}://{hostname}/{tenant}/controller/v1/{controllerId}/softwaremodules/{softwareModuleId}/artifacts/{artifactFileName}
hawkbit.artifact.url.protocols.md5sum-http.rel=md5sum-http
hawkbit.artifact.url.protocols.md5sum-http.protocol=${hawkbit.artifact.url.protocols.download-http.protocol}
hawkbit.artifact.url.protocols.md5sum-http.supports=DDI
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.artifact.url.protocols.md5sum-http.protocol'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application-cloudsandbox.properties`
#### Snippet
```java
hawkbit.artifact.url.protocols.download-http.ref={protocol}://{hostname}/{tenant}/controller/v1/{controllerId}/softwaremodules/{softwareModuleId}/artifacts/{artifactFileName}
hawkbit.artifact.url.protocols.md5sum-http.rel=md5sum-http
hawkbit.artifact.url.protocols.md5sum-http.protocol=${hawkbit.artifact.url.protocols.download-http.protocol}
hawkbit.artifact.url.protocols.md5sum-http.supports=DDI
hawkbit.artifact.url.protocols.md5sum-http.hostname=${hawkbit.artifact.url.protocols.download-http.hostname}
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.artifact.url.protocols.md5sum-http.supports'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application-cloudsandbox.properties`
#### Snippet
```java
hawkbit.artifact.url.protocols.md5sum-http.rel=md5sum-http
hawkbit.artifact.url.protocols.md5sum-http.protocol=${hawkbit.artifact.url.protocols.download-http.protocol}
hawkbit.artifact.url.protocols.md5sum-http.supports=DDI
hawkbit.artifact.url.protocols.md5sum-http.hostname=${hawkbit.artifact.url.protocols.download-http.hostname}
hawkbit.artifact.url.protocols.md5sum-http.ref=${hawkbit.artifact.url.protocols.download-http.ref}.MD5SUM
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.artifact.url.protocols.md5sum-http.hostname'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application-cloudsandbox.properties`
#### Snippet
```java
hawkbit.artifact.url.protocols.md5sum-http.protocol=${hawkbit.artifact.url.protocols.download-http.protocol}
hawkbit.artifact.url.protocols.md5sum-http.supports=DDI
hawkbit.artifact.url.protocols.md5sum-http.hostname=${hawkbit.artifact.url.protocols.download-http.hostname}
hawkbit.artifact.url.protocols.md5sum-http.ref=${hawkbit.artifact.url.protocols.download-http.ref}.MD5SUM
## Configuration for building download URLs - END
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.artifact.url.protocols.md5sum-http.ref'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application-cloudsandbox.properties`
#### Snippet
```java
hawkbit.artifact.url.protocols.md5sum-http.supports=DDI
hawkbit.artifact.url.protocols.md5sum-http.hostname=${hawkbit.artifact.url.protocols.download-http.hostname}
hawkbit.artifact.url.protocols.md5sum-http.ref=${hawkbit.artifact.url.protocols.download-http.ref}.MD5SUM
## Configuration for building download URLs - END

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.security.user.password'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application-cloudsandbox.properties`
#### Snippet
```java

spring.security.user.name=demo
spring.security.user.password={noop}demo
hawkbit.server.security.require-ssl=true

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.server.security.require-ssl'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application-cloudsandbox.properties`
#### Snippet
```java
spring.security.user.name=demo
spring.security.user.password={noop}demo
hawkbit.server.security.require-ssl=true

hawkbit.server.ui.demo.user=${spring.security.user.name}
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.server.ui.demo.disclaimer'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application-cloudsandbox.properties`
#### Snippet
```java
hawkbit.server.ui.demo.user=${spring.security.user.name}
hawkbit.server.ui.demo.password=${spring.security.user.name}
hawkbit.server.ui.demo.disclaimer=<small>By signing in, you consent that we store the following data for up to one week: \
  <ul><li><b>IP-Address:</b> Your client's IP-Address, as well as, the IP-Address of any device you connect to the \
  application are stored for the purpose of misuse prevention.</li></ul>\
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.datasource.driverClassName'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application-mysql.properties`
#### Snippet
```java
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driverClassName=org.mariadb.jdbc.Driver

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.datasource.driverClassName'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application-db2.properties`
#### Snippet
```java
spring.datasource.username=db2inst1
spring.datasource.password=db2inst1-pwd
spring.datasource.driverClassName=com.ibm.db2.jcc.DB2Driver

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.datasource.driverClassName'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application-postgresql.properties`
#### Snippet
```java
spring.datasource.username=postgres
spring.datasource.password=
spring.datasource.driverClassName=org.postgresql.Driver

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.datasource.driverClassName'
in `hawkbit-runtime/hawkbit-update-server/src/main/resources/application-mssql.properties`
#### Snippet
```java
spring.datasource.username=SA
spring.datasource.password=
spring.datasource.driverClassName=com.microsoft.sqlserver.jdbc.SQLServerDriver

```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsKey()'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/FilterSupport.java`
#### Snippet
```java
     */
    public boolean isFilterTypeSupported(final FilterType filterType) {
        return filterTypeToSetterMapping.keySet().contains(filterType);
    }

```

### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsKey()'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/DragAndDropSupport.java`
#### Snippet
```java
    private boolean isDropValid(final String sourceId, final T dropTargetItem,
            final AssignmentSupport<?, T> assignmentStrategy) {
        if (StringUtils.isEmpty(sourceId) || !sourceTargetAssignmentStrategies.keySet().contains(sourceId)
                || dropTargetItem == null || assignmentStrategy == null) {
            showActionNotAllowedNotification();
```

### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsKey()'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/LayoutVisibilityListener.java`
#### Snippet
```java
    private void onSelectionChangedEvent(final LayoutVisibilityEventPayload eventPayload) {
        if (!getViewAware().suitableView(eventPayload)
                || !layoutVisibilityHandlers.keySet().contains(eventPayload.getLayout())) {
            return;
        }
```

### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsKey()'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/LayoutResizeListener.java`
#### Snippet
```java
    private void onSelectionChangedEvent(final LayoutResizeEventPayload eventPayload) {
        if (!getViewAware().suitableView(eventPayload)
                || !layoutResizeHandlers.keySet().contains(eventPayload.getLayout())) {
            return;
        }
```

### RedundantCollectionOperation
Unnecessary 'containsKey()' check
in `hawkbit-runtime/hawkbit-update-server/src/main/java/org/eclipse/hawkbit/app/ErrorController.java`
#### Snippet
```java
    private Map<String, Object> getErrorAttributesWithoutPath(final HttpServletRequest request) {
        final Map<String, Object> body = getErrorAttributes(request, getErrorAttributeOptions(request, MediaType.ALL));
        if (body != null && body.containsKey(PATH)) {
            body.remove(PATH);
        }
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `docs/static/slides/css/reveal.css`
#### Snippet
```java
  content: '';
  position: absolute;
  display: block;
  width: 90%;
  height: 30px;
  left: 5%;
  bottom: 0;
  background: none;
  z-index: 1;
  border-radius: 4px;
  box-shadow: 0px 95px 25px rgba(0, 0, 0, 0.2);
  -webkit-transform: translateZ(-90px) rotateX(65deg);
```

### DuplicatedCode
Duplicated code
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/SecurityManagedConfiguration.java`
#### Snippet
```java
            final ControllerTenantAwareAuthenticationDetailsSource authenticationDetailsSource = new ControllerTenantAwareAuthenticationDetailsSource();

            final HttpControllerPreAuthenticatedSecurityHeaderFilter securityHeaderFilter = new HttpControllerPreAuthenticatedSecurityHeaderFilter(
                    ddiSecurityConfiguration.getRp().getCnHeader(),
                    ddiSecurityConfiguration.getRp().getSslIssuerHashHeader(), tenantConfigurationManagement,
                    tenantAware, systemSecurityContext);
            securityHeaderFilter.setAuthenticationManager(authenticationManager());
            securityHeaderFilter.setCheckForPrincipalChanges(true);
            securityHeaderFilter.setAuthenticationDetailsSource(authenticationDetailsSource);

            final HttpControllerPreAuthenticateSecurityTokenFilter securityTokenFilter = new HttpControllerPreAuthenticateSecurityTokenFilter(
                    tenantConfigurationManagement, tenantAware, controllerManagement, systemSecurityContext);
            securityTokenFilter.setAuthenticationManager(authenticationManager());
            securityTokenFilter.setCheckForPrincipalChanges(true);
            securityTokenFilter.setAuthenticationDetailsSource(authenticationDetailsSource);

            final HttpControllerPreAuthenticatedGatewaySecurityTokenFilter gatewaySecurityTokenFilter = new HttpControllerPreAuthenticatedGatewaySecurityTokenFilter(
                    tenantConfigurationManagement, tenantAware, systemSecurityContext);
            gatewaySecurityTokenFilter.setAuthenticationManager(authenticationManager());
            gatewaySecurityTokenFilter.setCheckForPrincipalChanges(true);
            gatewaySecurityTokenFilter.setAuthenticationDetailsSource(authenticationDetailsSource);
```

### DuplicatedCode
Duplicated code
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDistributionSetTypeManagement.java`
#### Snippet
```java
        final Collection<JpaSoftwareModuleType> modules = softwareModuleTypeRepository
                .findAllById(softwareModulesTypeIds);

        if (modules.size() < softwareModulesTypeIds.size()) {
            throw new EntityNotFoundException(SoftwareModuleType.class, softwareModulesTypeIds,
                    modules.stream().map(SoftwareModuleType::getId).collect(Collectors.toList()));
        }

        final JpaDistributionSetType type = findDistributionSetTypeAndThrowExceptionIfNotFound(dsTypeId);
        checkDistributionSetTypeSoftwareModuleTypesIsAllowedToModify(dsTypeId);
        assertSoftwareModuleTypeQuota(dsTypeId, softwareModulesTypeIds.size());

        modules.forEach(type::addMandatoryModuleType);

        return distributionSetTypeRepository.save(type);
```

### DuplicatedCode
Duplicated code
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaRolloutExecutor.java`
#### Snippet
```java
        final Slice<JpaAction> scheduledActions = findScheduledActionsByRollout(rollout);
        deleteScheduledActions(rollout, scheduledActions);

        // avoid another scheduler round and re-check if all scheduled actions
        // has been cleaned up. we flush first to ensure that the we include the
        // deletion above
        entityManager.flush();
        final boolean hasScheduledActionsLeft = actionRepository.countByRolloutIdAndStatus(rollout.getId(),
                Status.SCHEDULED) > 0;

        if (hasScheduledActionsLeft) {
            return;
        }
```

### DuplicatedCode
Duplicated code
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaRolloutGroupManagement.java`
#### Snippet
```java
        final List<Long> rolloutGroupIds = rolloutGroups.getContent().stream().map(RolloutGroup::getId)
                .collect(Collectors.toList());

        if (rolloutGroupIds.isEmpty()) {
            // groups might already deleted, so return empty list.
            return new PageImpl<>(Collections.emptyList());
        }

        final Map<Long, List<TotalTargetCountActionStatus>> allStatesForRollout = getStatusCountItemForRolloutGroup(
                rolloutGroupIds);
```

### DuplicatedCode
Duplicated code
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaTargetManagement.java`
#### Snippet
```java
        final DistributionSet jpaDistributionSet = distributionSetManagement.getOrElseThrowException(distributionSetId);
        final Long distSetTypeId = jpaDistributionSet.getType().getId();

        final List<Specification<JpaTarget>> specList = Arrays.asList(
                RSQLUtility.buildRsqlSpecification(targetFilterQuery, TargetFields.class, virtualPropertyReplacer,
                        database),
                TargetSpecifications.hasNotDistributionSetInActions(distributionSetId),
                TargetSpecifications.isCompatibleWithDistributionSetType(distSetTypeId));
```

### DuplicatedCode
Duplicated code
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaDistributionSet.java`
#### Snippet
```java
        final ObjectChangeSet changeSet = ((UpdateObjectQuery) event.getQuery()).getObjectChangeSet();
        final List<DirectToFieldChangeRecord> changes = changeSet.getChanges().stream()
                .filter(DirectToFieldChangeRecord.class::isInstance).map(DirectToFieldChangeRecord.class::cast)
                .collect(Collectors.toList());

        return changes.stream().anyMatch(changeRecord -> DELETED_PROPERTY.equals(changeRecord.getAttribute())
                && Boolean.parseBoolean(changeRecord.getNewValue().toString()));
```

### DuplicatedCode
Duplicated code
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtActionResource.java`
#### Snippet
```java
        final int sanitizedOffsetParam = PagingUtility.sanitizeOffsetParam(pagingOffsetParam);
        final int sanitizedLimitParam = PagingUtility.sanitizePageLimitParam(pagingLimitParam);
        final Sort sorting = PagingUtility.sanitizeActionSortParam(sortParam);
        final Pageable pageable = new OffsetBasedPageRequest(sanitizedOffsetParam, sanitizedLimitParam, sorting);

        final Slice<Action> actions;
        final Long totalActionCount;
```

### DuplicatedCode
Duplicated code
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtDistributionSetResource.java`
#### Snippet
```java
        final int sanitizedOffsetParam = PagingUtility.sanitizeOffsetParam(pagingOffsetParam);
        final int sanitizedLimitParam = PagingUtility.sanitizePageLimitParam(pagingLimitParam);
        final Sort sorting = PagingUtility.sanitizeTargetSortParam(sortParam);

        final Pageable pageable = new OffsetBasedPageRequest(sanitizedOffsetParam, sanitizedLimitParam, sorting);
        final Page<Target> targetsAssignedDS;
```

### DuplicatedCode
Duplicated code
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtDistributionSetResource.java`
#### Snippet
```java
        final List<DeploymentRequest> deploymentRequests = assignments.stream().map(dsAssignment -> {
            final boolean isConfirmationRequired = dsAssignment.isConfirmationRequired() == null
                    ? tenantConfigHelper.isConfirmationFlowEnabled()
                    : dsAssignment.isConfirmationRequired();
            return MgmtDeploymentRequestMapper.createAssignmentRequestBuilder(dsAssignment, distributionSetId)
                    .setConfirmationRequired(isConfirmationRequired).build();
        }).collect(Collectors.toList());

        final List<DistributionSetAssignmentResult> assignmentResults = deployManagament
                .assignDistributionSets(deploymentRequests);
        return ResponseEntity.ok(MgmtDistributionSetMapper.toResponse(assignmentResults));
```

### DuplicatedCode
Duplicated code
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/smtable/SmWindowLayout.java`
#### Snippet
```java
        final FormLayout smWindowLayout = new FormLayout();

        smWindowLayout.setSpacing(true);
        smWindowLayout.setMargin(true);
        smWindowLayout.setSizeUndefined();

        smWindowLayout.addComponent(smTypeSelect);

        smWindowLayout.addComponent(smName);
        smName.focus();

        smWindowLayout.addComponent(smVersion);

        smWindowLayout.addComponent(smVendor);
```

### DuplicatedCode
Duplicated code
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/providers/TargetManagementStateDataProvider.java`
#### Snippet
```java
        final String searchText = filter.getSearchText();
        final Collection<TargetUpdateStatus> targetUpdateStatusList = filter.getTargetUpdateStatusList();
        final boolean overdueState = filter.isOverdueState();
        final Long distributionId = filter.getDistributionId();
        final boolean noTagClicked = filter.isNoTagClicked();
        final String[] targetTags = filter.getTargetTags().toArray(new String[0]);
```

### DuplicatedCode
Duplicated code
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/providers/TargetManagementStateDataProvider.java`
#### Snippet
```java
        final Collection<TargetUpdateStatus> targetUpdateStatusList = filter.getTargetUpdateStatusList();
        final boolean overdueState = filter.isOverdueState();
        final Long distributionId = filter.getDistributionId();
        final boolean noTagClicked = filter.isNoTagClicked();
        final String[] targetTags = filter.getTargetTags().toArray(new String[0]);
```

### DuplicatedCode
Duplicated code
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/filterlayout/AbstractFilterButtons.java`
#### Snippet
```java
        filterButtonLayout.addComponent(colourIcon);
        filterButtonLayout.setComponentAlignment(colourIcon, Alignment.TOP_LEFT);
        filterButtonLayout.setExpandRatio(colourIcon, 0.0F);

        filterButtonLayout.addComponent(filterName);
        filterButtonLayout.setComponentAlignment(filterName, Alignment.TOP_LEFT);
        filterButtonLayout.setExpandRatio(filterName, 1.0F);

        return filterButtonLayout;
```

### DuplicatedCode
Duplicated code
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/decorators/SPUIButtonStyleSmall.java`
#### Snippet
```java
        if (style != null) {
            if (setStyle) {
                button.setStyleName(style);
            } else {
                button.addStyleName(style);
            }
        }
        if (icon != null) {
            button.addStyleName(ValoTheme.BUTTON_ICON_ONLY);
            button.setIcon(icon);
        }
        return button;
```

### DuplicatedCode
Duplicated code
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/distributions/disttype/AddDsTypeWindowController.java`
#### Snippet
```java
        final List<Long> mandatorySmTypeIds = entity.getSelectedSmTypes().stream().filter(ProxyType::isMandatory)
                .map(ProxyType::getId).collect(Collectors.toList());

        final List<Long> optionalSmTypeIds = entity.getSelectedSmTypes().stream()
                .filter(selectedSmType -> !selectedSmType.isMandatory()).map(ProxyType::getId)
                .collect(Collectors.toList());
```

### DuplicatedCode
Duplicated code
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/distributions/disttype/DsTypeSmSelectLayout.java`
#### Snippet
```java
        selectButtonLayout.addComponent(selectButton);
        selectButtonLayout.addComponent(unSelectButton);
        selectButtonLayout.setComponentAlignment(selectButton, Alignment.MIDDLE_CENTER);
        selectButtonLayout.setComponentAlignment(unSelectButton, Alignment.MIDDLE_CENTER);

        sourceGrid = buildSourceGrid();
        selectedGrid = buildSelectedGrid();

        layout.addComponent(sourceGrid);
        layout.addComponent(selectButtonLayout);
        layout.addComponent(selectedGrid);
        layout.setComponentAlignment(sourceGrid, Alignment.MIDDLE_LEFT);
        layout.setComponentAlignment(selectButtonLayout, Alignment.MIDDLE_CENTER);
        layout.setComponentAlignment(selectedGrid, Alignment.MIDDLE_RIGHT);
        layout.setExpandRatio(sourceGrid, 0.45F);
        layout.setExpandRatio(selectButtonLayout, 0.07F);
        layout.setExpandRatio(selectedGrid, 0.48F);
```

### DuplicatedCode
Duplicated code
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/distributions/disttype/SmTypeSelectedGrid.java`
#### Snippet
```java
        setSizeFull();
        setHeightUndefined();
        addStyleName(ValoTheme.TABLE_NO_HORIZONTAL_LINES);
        addStyleName(ValoTheme.TABLE_NO_STRIPES);
        addStyleName(ValoTheme.TABLE_NO_VERTICAL_LINES);
        addStyleName(ValoTheme.TABLE_SMALL);
        // used to deactivate cell text selection by user
        addStyleName(AbstractGrid.MULTI_SELECT_STYLE);

        setId(SPUIDefinitions.TWIN_TABLE_SELECTED_ID);
        setSelectionModel(new RangeSelectionModel<>(i18n));

        addColumns();
```

### DuplicatedCode
Duplicated code
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/distributions/disttype/SmTypeSourceGrid.java`
#### Snippet
```java
        setSizeFull();
        setHeightUndefined();
        addStyleName(ValoTheme.TABLE_NO_HORIZONTAL_LINES);
        addStyleName(ValoTheme.TABLE_NO_STRIPES);
        addStyleName(ValoTheme.TABLE_NO_VERTICAL_LINES);
        addStyleName(ValoTheme.TABLE_SMALL);
        // used to deactivate cell text selection by user
        addStyleName(AbstractGrid.MULTI_SELECT_STYLE);

        setId(SPUIDefinitions.TWIN_TABLE_SOURCE_ID);
        setSelectionModel(new RangeSelectionModel<>(i18n));

        addColumns();
```

### DuplicatedCode
Duplicated code
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/FilterManagementView.java`
#### Snippet
```java
        setSizeFull();

        addComponent(targetFilterGridLayout);
        setComponentAlignment(targetFilterGridLayout, Alignment.TOP_CENTER);
        setExpandRatio(targetFilterGridLayout, 1.0F);

        targetFilterDetailsLayout.setVisible(false);
        addComponent(targetFilterDetailsLayout);
        setComponentAlignment(targetFilterDetailsLayout, Alignment.TOP_CENTER);
        setExpandRatio(targetFilterDetailsLayout, 1.0F);
```

### DuplicatedCode
Duplicated code
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/dstag/UpdateDsTagWindowController.java`
#### Snippet
```java
        final ProxyTag dsTag = new ProxyTag();

        dsTag.setId(proxyEntity.getId());
        dsTag.setName(proxyEntity.getName());
        dsTag.setDescription(proxyEntity.getDescription());
        dsTag.setColour(proxyEntity.getColour());

        nameBeforeEdit = proxyEntity.getName();

        return dsTag;
```

### DuplicatedCode
Duplicated code
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/miscs/ActionTypeOptionGroupAssignmentLayout.java`
#### Snippet
```java
        final TimeZone tz = SPDateTimeUtil.getBrowserTimeZone();
        forcedTimeDateField.setZoneId(SPDateTimeUtil.getTimeZoneId(tz));
        forcedTimeDateField.setLocale(HawkbitCommonUtil.getCurrentLocale());
        forcedTimeDateField.setResolution(DateTimeResolution.MINUTE);
        forcedTimeDateField.addStyleName(ValoTheme.DATEFIELD_TINY);
        forcedTimeDateField.setWidth("14em");
        addComponent(forcedTimeDateField);
        setComponentAlignment(forcedTimeDateField, Alignment.MIDDLE_LEFT);
```

### DuplicatedCode
Duplicated code
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/miscs/AssignmentWindowLayoutComponentBuilder.java`
#### Snippet
```java
        final String confirmationFlowHelpUrl = uiProperties.getLinks().getDocumentation().getUserConsentAndConfirmationGuide();
        final Link confirmationHelpLink = new Link("", new ExternalResource(confirmationFlowHelpUrl));

        confirmationHelpLink.setTargetName("_blank");
        confirmationHelpLink.setIcon(VaadinIcons.QUESTION_CIRCLE);
        confirmationHelpLink.setDescription(i18n.getMessage("tooltip.documentation.link"));

        return confirmationHelpLink;
```

### DuplicatedCode
Duplicated code
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/controllers/CopyRolloutWindowController.java`
#### Snippet
```java
        if (proxyRolloutWindow.getForcedTime() == null
                || RepositoryModelConstants.NO_FORCE_TIME.equals(proxyRolloutWindow.getForcedTime())) {
            proxyRolloutWindow.setForcedTime(SPDateTimeUtil.twoWeeksFromNowEpochMilli());
        }

        proxyRolloutWindow.setAutoStartOption(proxyRolloutWindow.getOptionByStartAt());
        if (AutoStartOption.SCHEDULED != proxyRolloutWindow.getAutoStartOption()) {
            proxyRolloutWindow.setStartAt(SPDateTimeUtil.halfAnHourFromNowEpochMilli());
        }

        setAdvancedGroups(proxyRolloutWindow);
```

### DuplicatedCode
Duplicated code
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/tenantconfiguration/AuthenticationConfigurationView.java`
#### Snippet
```java
        certificateAuthCheckbox.setStyleName(DIST_CHECKBOX_STYLE);
        certificateAuthCheckbox.addValueChangeListener(valueChangeEvent -> {
            if (valueChangeEvent.getValue()) {
                certificateAuthenticationConfigurationItem.showDetails();
            } else {
                certificateAuthenticationConfigurationItem.hideDetails();
            }
        });
        gridLayout.addComponent(certificateAuthCheckbox, 0, row);
        gridLayout.addComponent(certificateAuthenticationConfigurationItem, 1, row);
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
'catch' parameter named `ignore` is used
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/util/FileStreamingUtil.java`
#### Snippet
```java
                    ranges.add(full);
                }
            } catch (final IllegalArgumentException ignore) {
                LOG.info("Invalid if-range header field", ignore);
                ranges.add(full);
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/DistributedResourceBundleMessageSource.java`
#### Snippet
```java
                }
            }
        } catch (final IOException ignored) {
            LOGGER.warn("Resource with filename " + filename + " couldn't load", ignored);
        }
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/ArtifactEncryption.java`
#### Snippet
```java
     * Defines the required secret keys for particular encryption algorithm.
     *
     * @return list of required secret keys
     */
    Set<String> requiredSecretKeys();
```

### MismatchedJavadocCode
Method is specified to return list but the return type is map
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/ControllerManagement.java`
#### Snippet
```java
     * @param moduleId
     *            of the {@link SoftwareModule}
     * @return list of {@link SoftwareModuleMetadata} with maximum size of
     *         {@link RepositoryConstants#MAX_META_DATA_COUNT}
     */
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/matcher/ExpectEvents.java`
#### Snippet
```java

    /**
     * @return a list of {@link Expect}
     */
    Expect[] value() default {};
```

### MismatchedJavadocCode
Method is specified to return set but the return type is list
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java
     * @param lastTargetQuery
     *            last time the target polled
     * @return set of {@link Target}
     */
    public List<Target> createTargets(final int numberOfTargets, final String controllerIdPrefix,
```

### MismatchedJavadocCode
Method is specified to return set but the return type is list
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java
     * @param prefix
     *            prefix used for the controller ID and description
     * @return set of {@link Target}
     */
    public List<Target> createTargets(final int numberOfTargets, final String prefix) {
```

### MismatchedJavadocCode
Method is specified to return set but the return type is list
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java
     * @param descriptionPrefix
     *            prefix used for the description
     * @return set of {@link Target}
     */
    public List<Target> createTargets(final int numberOfTargets, final String controllerIdPrefix,
```

### MismatchedJavadocCode
Method is specified to return list but the return type is map
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/push/UIEventProvider.java`
#### Snippet
```java
     * are delegated to the UI as list of events.
     * 
     * @return list of provided event types. Should not be null
     */
    default Map<Class<? extends EntityIdEvent>, EntityModifiedEventPayloadIdentifier> getEvents() {
```

### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/filterlayout/AbstractFilterMultiButtonClick.java`
#### Snippet
```java

    /**
     * @return List of all previously clicked filter ids
     */
    public Set<Long> getPreviouslyClickedFilterIds() {
```

### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/ArtifactUploadState.java`
#### Snippet
```java
     * Get all the IDs of files from the failed upload
     *
     * @return List of IDs of  uploaded files
     */
    public Set<FileUploadId> getFilesInFailedState() {
```

### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/ArtifactUploadState.java`
#### Snippet
```java
     * Get all the IDs of uploaded files from the upload process
     *
     * @return List of IDs of  uploaded files
     */
    public Set<FileUploadId> getAllFileUploadIdsFromOverallUploadProcessList() {
```

### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/tenantconfiguration/repository/ActionAutoCleanupConfigurationItem.java`
#### Snippet
```java

        /**
         * @return List of status
         */
        public Set<Status> getStatus() {
```

### MismatchedJavadocCode
Method is specified to return map but the return type is list
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/RolloutStatusCache.java`
#### Snippet
```java
     * @param groupId
     *            to retrieve cache entries for
     * @return map of cached entries
     */
    public List<TotalTargetCountActionStatus> getRolloutGroupStatus(final Long groupId) {
```

### MismatchedJavadocCode
Method is specified to return map but the return type is list
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/RolloutStatusCache.java`
#### Snippet
```java
     * @param rolloutId
     *            to retrieve cache entries for
     * @return map of cached entries
     */
    public List<TotalTargetCountActionStatus> getRolloutStatus(final Long rolloutId) {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/RolloutHelper.java`
#### Snippet
```java
    public static String getTargetFilterQuery(final String targetFilter, final Long createdAt) {
        if (createdAt != null) {
            return targetFilter + ";createdat=le=" + createdAt.toString();
        }
        return targetFilter;
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/event/EventType.java`
#### Snippet
```java
    private static final Map<Integer, Class<?>> TYPES = new HashMap<>();

    /**
     * The associated event-type-value must remain the same as initially
     * declared. Otherwise messages cannot correctly de-serialized.
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'List' may not contain objects of type ''
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/SecurityManagedConfiguration.java`
#### Snippet
```java
            if (!CollectionUtils.isEmpty(allowedHostNames)) {
                firewall.setAllowedHostnames(hostName -> {
                    LOG.debug("Firewall check host: {}, allowed: {}", hostName, allowedHostNames.contains(hostName));
                    return allowedHostNames.contains(hostName);
                });
```

### SuspiciousMethodCalls
'List' may not contain objects of type ''
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/SecurityManagedConfiguration.java`
#### Snippet
```java
                firewall.setAllowedHostnames(hostName -> {
                    LOG.debug("Firewall check host: {}, allowed: {}", hostName, allowedHostNames.contains(hostName));
                    return allowedHostNames.contains(hostName);
                });
            }
```

### SuspiciousMethodCalls
'List' may not contain objects of type ''
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/EntityPropertyChangeListener.java`
#### Snippet
```java
    private static boolean isFireUpdate(final EventAwareEntity entity, final UpdateObjectQuery query) {
        return entity.getUpdateIgnoreFields().isEmpty() || query.getObjectChangeSet().getChangedAttributeNames()
                .stream().anyMatch(field -> !entity.getUpdateIgnoreFields().contains(field));
    }

```

### SuspiciousMethodCalls
Suspicious call to 'List.remove()'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaSoftwareModule.java`
#### Snippet
```java
    public void removeArtifact(final Artifact artifact) {
        if (artifacts != null) {
            artifacts.remove(artifact);
        }
    }
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaSoftwareModule.java`
#### Snippet
```java
        }

        if (!artifacts.contains(artifact)) {
            artifacts.add((JpaArtifact) artifact);
        }
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/OffsetBasedPageRequest.java`
#### Snippet
```java
        }
        final OffsetBasedPageRequest other = (OffsetBasedPageRequest) obj;
        if (offset != other.offset) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/model/AssignedSoftwareModule.java`
#### Snippet
```java
        }
        if (softwareModule == null) {
            if (other.softwareModule != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/model/AssignedSoftwareModule.java`
#### Snippet
```java
                return false;
            }
        } else if (!softwareModule.equals(other.softwareModule)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/report/model/TenantUsage.java`
#### Snippet
```java
        }
        if (usageData == null) {
            if (other.usageData != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/report/model/TenantUsage.java`
#### Snippet
```java
                return false;
            }
        } else if (!usageData.equals(other.usageData)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-dmf/hawkbit-dmf-api/src/main/java/org/eclipse/hawkbit/dmf/json/model/DmfMetadata.java`
#### Snippet
```java
        }
        if (value == null) {
            if (other.value != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-dmf/hawkbit-dmf-api/src/main/java/org/eclipse/hawkbit/dmf/json/model/DmfMetadata.java`
#### Snippet
```java
                return false;
            }
        } else if (!value.equals(other.value)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/util/FileStreamingUtil.java`
#### Snippet
```java
                return false;
            }
            if (total != other.total) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/tagdetails/AbstractTagToken.java`
#### Snippet
```java
            final List<Long> assignedDsIds = assignedEntities.stream().map(Identifiable::getId)
                    .collect(Collectors.toList());
            if (assignedDsIds.contains(expectedAssignedEntityId)) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/components/SimpleGroupsLayout.java`
#### Snippet
```java
                    return errorThresholdPresentation;
                }, errorThresholdModel -> {
                    if (errorThresholdModel == null) {
                        return null;
                    }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/api/ArtifactUrl.java`
#### Snippet
```java
        }
        if (rel == null) {
            if (other.rel != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/api/ArtifactUrl.java`
#### Snippet
```java
                return false;
            }
        } else if (!rel.equals(other.rel)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/cache/DownloadArtifactCache.java`
#### Snippet
```java
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/cache/DownloadArtifactCache.java`
#### Snippet
```java
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/DsMetadataCompositeKey.java`
#### Snippet
```java
        }
        if (key == null) {
            if (other.key != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/DsMetadataCompositeKey.java`
#### Snippet
```java
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/DistributionSetTypeElementCompositeKey.java`
#### Snippet
```java
        }
        if (smType == null) {
            if (other.smType != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/DistributionSetTypeElementCompositeKey.java`
#### Snippet
```java
                return false;
            }
        } else if (!smType.equals(other.smType)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaControllerManagement.java`
#### Snippet
```java
            }
            if (tenant == null) {
                if (other.tenant != null) {
                    return false;
                }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaControllerManagement.java`
#### Snippet
```java
                    return false;
                }
            } else if (!tenant.equals(other.tenant)) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaDistributionSetMetadata.java`
#### Snippet
```java
        final JpaDistributionSetMetadata other = (JpaDistributionSetMetadata) obj;
        if (distributionSet == null) {
            if (other.distributionSet != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaDistributionSetMetadata.java`
#### Snippet
```java
                return false;
            }
        } else if (!distributionSet.equals(other.distributionSet)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/AbstractJpaTenantAwareBaseEntity.java`
#### Snippet
```java
        final AbstractJpaTenantAwareBaseEntity other = (AbstractJpaTenantAwareBaseEntity) obj;
        if (tenant == null) {
            if (other.tenant != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/AbstractJpaTenantAwareBaseEntity.java`
#### Snippet
```java
                return false;
            }
        } else if (!tenant.equals(other.tenant)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/SwMetadataCompositeKey.java`
#### Snippet
```java
        }
        if (softwareModule == null) {
            if (other.softwareModule != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/SwMetadataCompositeKey.java`
#### Snippet
```java
                return false;
            }
        } else if (!softwareModule.equals(other.softwareModule)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/TargetMetadataCompositeKey.java`
#### Snippet
```java
        }
        if (key == null) {
            if (other.key != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/TargetMetadataCompositeKey.java`
#### Snippet
```java
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/DistributionSetTypeElement.java`
#### Snippet
```java
        final DistributionSetTypeElement other = (DistributionSetTypeElement) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/DistributionSetTypeElement.java`
#### Snippet
```java
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTargetMetadata.java`
#### Snippet
```java
        final JpaTargetMetadata other = (JpaTargetMetadata) obj;
        if (target == null) {
            if (other.target != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTargetMetadata.java`
#### Snippet
```java
                return false;
            }
        } else if (!target.equals(other.target)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaSoftwareModuleMetadata.java`
#### Snippet
```java
        final JpaSoftwareModuleMetadata other = (JpaSoftwareModuleMetadata) obj;
        if (softwareModule == null) {
            if (other.softwareModule != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaSoftwareModuleMetadata.java`
#### Snippet
```java
                return false;
            }
        } else if (!softwareModule.equals(other.softwareModule)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/im/authentication/TenantUserPasswordAuthenticationToken.java`
#### Snippet
```java
        final TenantUserPasswordAuthenticationToken other = (TenantUserPasswordAuthenticationToken) obj;
        if (tenant == null) {
            if (other.tenant != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/im/authentication/TenantUserPasswordAuthenticationToken.java`
#### Snippet
```java
                return false;
            }
        } else if (!tenant.equals(other.tenant)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/SecurityContextTenantAware.java`
#### Snippet
```java
            if (delegate != null) {
                return delegate.equals(another);
            } else if (another == null) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/HeaderAuthentication.java`
#### Snippet
```java
        }
        if (headerAuth == null) {
            if (other.headerAuth != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/HeaderAuthentication.java`
#### Snippet
```java
                return false;
            }
        } else if (!headerAuth.equals(other.headerAuth)) {
            return false;
        }
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/push/DelayedEventBusPushStrategy.java`
#### Snippet
```java

            final int size = queue.size();
            if (size <= 0) {
                LOG.debug("UI EventBus aggregator for UI {} has nothing to do.", vaadinUI.getUIId());
                return;
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/DistributionBarHelper.java`
#### Snippet
```java
        final Map<Status, Long> statusMapWithNonZeroValues = getStatusMapWithNonZeroValues(statusTotalCountMap);
        final Long totalValue = getTotalSizes(statusTotalCountMap);
        if (statusMapWithNonZeroValues.size() <= 0) {
            return getUnintialisedBar();
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java
            if (tokenImageName.contains(".")) {
                final String[] split = tokenImageName.split("\\.");
                if (split.length <= 0) {
                    return false;
                }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaControllerManagement.java`
#### Snippet
```java

        final int size = queue.size();
        if (size <= 0) {
            return;
        }
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java
     */
    public Artifact createArtifact(final String artifactData, final Long moduleId, final String filename) {
        final InputStream stubInputStream = IOUtils.toInputStream(artifactData, Charset.forName("UTF-8"));
        return artifactManagement
                .create(new ArtifactUpload(stubInputStream, moduleId, filename, false, artifactData.length()));
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/api/PropertyBasedArtifactUrlHandler.java`
#### Snippet
```java
        try {
            replaceMap.put(ARTIFACT_FILENAME_PLACEHOLDER,
                    URLEncoder.encode(placeholder.getSoftwareData().getFilename(), StandardCharsets.UTF_8.toString()));
        } catch (final UnsupportedEncodingException e) {
            LOG.error("Could not encode {}", placeholder.getSoftwareData().getFilename(), e);
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'ValidatorFactory' used without 'try'-with-resources statement
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/RepositoryApplicationConfiguration.java`
#### Snippet
```java
                .addProperty(BaseHibernateValidatorConfiguration.ALLOW_PARALLEL_METHODS_DEFINE_PARAMETER_CONSTRAINTS,
                        "true")
                .buildValidatorFactory().getValidator());
        return processor;
    }
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'cause instanceof InvalidTargetAddressException' covered by subsequent condition 'cause instanceof MessageConversionException'
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/DelayedRequeueExceptionStrategy.java`
#### Snippet
```java

    private static boolean isMessageException(final Throwable cause) {
        return cause instanceof InvalidTargetAddressException || cause instanceof MessageConversionException
                || cause instanceof MessageHandlingException;
    }
```

### ConditionCoveredByFurtherCondition
Condition 'cause instanceof MessageConversionException' covered by subsequent condition 'cause instanceof MessageHandlingException'
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/DelayedRequeueExceptionStrategy.java`
#### Snippet
```java

    private static boolean isMessageException(final Throwable cause) {
        return cause instanceof InvalidTargetAddressException || cause instanceof MessageConversionException
                || cause instanceof MessageHandlingException;
    }
```

### ConditionCoveredByFurtherCondition
Condition 'currentLayout == null' covered by subsequent condition 'currentLayout != EventLayout.ROLLOUT_LIST'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/rollout/RolloutGrid.java`
#### Snippet
```java

        final EventLayout currentLayout = rolloutManagementUIState.getCurrentLayout().orElse(null);
        if (currentLayout == null || currentLayout != EventLayout.ROLLOUT_LIST) {
            showRolloutListLayout();
        }
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator never returns negative values
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/AbstractIntegrationTest.java`
#### Snippet
```java

    protected static Comparator<Target> controllerIdComparator() {
        return (o1, o2) -> o1.getControllerId().equals(o2.getControllerId()) ? 0 : 1;
    }

```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `dst` to `DistributionSetType` is redundant
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDistributionSetTypeManagement.java`
#### Snippet
```java
    @Override
    public Optional<DistributionSetType> get(final long id) {
        return distributionSetTypeRepository.findById(id).map(dst -> (DistributionSetType) dst);
    }

```

### RedundantCast
Casting `smt` to `SoftwareModuleType` is redundant
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaSoftwareModuleTypeManagement.java`
#### Snippet
```java
    @Override
    public Optional<SoftwareModuleType> get(final long id) {
        return softwareModuleTypeRepository.findById(id).map(smt -> (SoftwareModuleType) smt);
    }

```

### RedundantCast
Casting `tfq` to `TargetFilterQuery` is redundant
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaTargetFilterQueryManagement.java`
#### Snippet
```java
    @Override
    public Optional<TargetFilterQuery> get(final long targetFilterQueryId) {
        return targetFilterQueryRepository.findById(targetFilterQueryId).map(tfq -> (TargetFilterQuery) tfq);
    }

```

### RedundantCast
Casting `rg` to `RolloutGroup` is redundant
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaRolloutGroupManagement.java`
#### Snippet
```java
    @Override
    public Optional<RolloutGroup> get(final long rolloutGroupId) {
        return rolloutGroupRepository.findById(rolloutGroupId).map(rg -> (RolloutGroup) rg);
    }

```

### RedundantCast
Casting `t` to `Target` is redundant
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaControllerManagement.java`
#### Snippet
```java
    @Override
    public Optional<Target> get(final long targetId) {
        return targetRepository.findById(targetId).map(t -> (Target) t);
    }

```

### RedundantCast
Casting `s` to `SoftwareModule` is redundant
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaControllerManagement.java`
#### Snippet
```java
    @Override
    public Optional<SoftwareModule> getSoftwareModule(final long id) {
        return softwareModuleRepository.findById(id).map(s -> (SoftwareModule) s);
    }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/model/ActionStatus.java`
#### Snippet
```java
     * @return the {@link Status} of this {@link ActionStatus}. Caused
     *         potentially a transition change of the {@link #getAction()} if
     *         different from the previous {@link ActionStatus#getStatus()}.
     */
    Status getStatus();
```

### JavadocDeclaration
`@param excludeAntPaths` tag description is missing
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/filter/ExcludePathAwareShallowETagFilter.java`
#### Snippet
```java

    /**
     * @param excludeAntPaths
     */
    public ExcludePathAwareShallowETagFilter(final String... excludeAntPaths) {
```

### JavadocDeclaration
`@param systemManagement` tag description is missing
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpControllerAuthentication.java`
#### Snippet
```java
     * Constructor.
     * 
     * @param systemManagement
     * @param controllerManagement
     * @param tenantConfigurationManagement
```

### JavadocDeclaration
`@param controllerManagement` tag description is missing
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpControllerAuthentication.java`
#### Snippet
```java
     * 
     * @param systemManagement
     * @param controllerManagement
     * @param tenantConfigurationManagement
     * @param tenantAware
```

### JavadocDeclaration
`@param tenantConfigurationManagement` tag description is missing
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpControllerAuthentication.java`
#### Snippet
```java
     * @param systemManagement
     * @param controllerManagement
     * @param tenantConfigurationManagement
     * @param tenantAware
     *            current tenant
```

### JavadocDeclaration
`@param autoConfirmState` tag description is missing
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/json/model/DdiConfirmationBase.java`
#### Snippet
```java
     * Constructor.
     *
     * @param autoConfirmState
     */
    public DdiConfirmationBase(final DdiAutoConfirmationState autoConfirmState) {
```

### JavadocDeclaration
`@return` tag description is missing
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageDispatcherService.java`
#### Snippet
```java
     * @param actionId the actionId
     * @param softwareModules the software modules
     * @return
     */
    protected DmfConfirmRequest createConfirmRequest(final Target target, final Long actionId, final Map<SoftwareModule,
```

### JavadocDeclaration
`@param sourceItemsToAssign` tag description is missing
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/assignment/TargetsToTargetTypeAssignmentSupport.java`
#### Snippet
```java
    /**
     *
     * @param sourceItemsToAssign
     * @param targetItem
     * @return false if some targets already have a type assigned
```

### JavadocDeclaration
`@param targetItem` tag description is missing
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/assignment/TargetsToTargetTypeAssignmentSupport.java`
#### Snippet
```java
     *
     * @param sourceItemsToAssign
     * @param targetItem
     * @return false if some targets already have a type assigned
     */
```

### JavadocDeclaration
`@param tagData` tag description is missing
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/tagdetails/TagListField.java`
#### Snippet
```java
     * Removes a tag from the field.
     * 
     * @param tagData
     */
    void removeTag(final ProxyTag tagData) {
```

### JavadocDeclaration
`@param tagData` tag description is missing
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/tagdetails/TagListField.java`
#### Snippet
```java
     * Removes a tag from the field.
     * 
     * @param tagData
     */
    void removeTag(final Long tagId) {
```

### JavadocDeclaration
`@param i18n` tag description is missing
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/tagdetails/TagListField.java`
#### Snippet
```java
     * Constructor.
     * 
     * @param i18n
     * @param readOnlyMode
     *            if <code>true</code> no unassignment can be done
```

### JavadocDeclaration
`@param tagData` tag description is missing
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/tagdetails/TagListField.java`
#### Snippet
```java
     * Updates a tag.
     * 
     * @param tagData
     */
    void updateTag(final ProxyTag tagData) {
```

### JavadocDeclaration
`@param tagName` tag description is missing
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/tagdetails/TagListField.java`
#### Snippet
```java
     * Adds a tag
     * 
     * @param tagName
     * @param tagColor
     */
```

### JavadocDeclaration
`@param tagColor` tag description is missing
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/tagdetails/TagListField.java`
#### Snippet
```java
     * 
     * @param tagName
     * @param tagColor
     */
    void addTag(final ProxyTag tagData) {
```

### JavadocDeclaration
`@param fileUploadId` tag description is missing
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/UploadProgressInfoWindow.java`
#### Snippet
```java
     * string but never <code>null</code>.
     * 
     * @param fileUploadId
     * @return the failure reason or an empty String.
     */
```

### JavadocDeclaration
`@param maintenanceWindowPollCount.` tag description is missing
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/ControllerPollProperties.java`
#### Snippet
```java
     * ({@link ControllerPollProperties#maintenanceWindowPollCount}).
     *
     * @param maintenanceWindowPollCount.
     */
    public void setMaintenanceWindowPollCount(int maintenanceWindowPollCount) {
```

### JavadocDeclaration
`@return` tag description is missing
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/api/HostnameResolver.java`
#### Snippet
```java
     *
     *
     * @return
     */
    URL resolveHostname();
```

### JavadocDeclaration
`@param tenant` tag description is missing
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/TenantMetaDataRepository.java`
#### Snippet
```java

    /**
     * @param tenant
     */
    @Transactional
```

### JavadocDeclaration
Duplicate @param tag for parameter 'status2'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/RolloutGroupRepository.java`
#### Snippet
```java
     * @param status2
     *            the status which the groups should not have
     * @param status2
     *            the status which the groups should not have
     * @return count of rollout-groups referning a rollout and not in the given
```

### JavadocDeclaration
`@param name` tag description is missing
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/TargetFilterQueryRepository.java`
#### Snippet
```java
     * Find customer target filter by name
     *
     * @param name
     * @return custom target filter
     */
```

### JavadocDeclaration
`@param pageable` tag description is missing
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/SoftwareModuleTypeRepository.java`
#### Snippet
```java

    /**
     * @param pageable
     * @param isDeleted
     *            to <code>true</code> if only marked as deleted have to be
```

### JavadocDeclaration
`@param set` tag description is missing
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/AbstractDsAssignmentStrategy.java`
#### Snippet
```java
    /**
     *
     * @param set
     * @param targets
     */
```

### JavadocDeclaration
`@param targets` tag description is missing
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/AbstractDsAssignmentStrategy.java`
#### Snippet
```java
     *
     * @param set
     * @param targets
     */
    abstract void sendTargetUpdatedEvents(final DistributionSet set, final List<JpaTarget> targets);
```

### JavadocDeclaration
`@param fieldNameProvider` tag description is missing
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RSQLUtility.java`
#### Snippet
```java
     * @param rsql
     *            RSQL string to validate
     * @param fieldNameProvider
     * 
     * @throws RSQLParserException
```

### JavadocDeclaration
`@param description` tag description is missing
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/AbstractJpaNamedVersionedEntity.java`
#### Snippet
```java
     * @param version
     *            of the entity
     * @param description
     */
    AbstractJpaNamedVersionedEntity(final String name, final String version, final String description) {
```

### JavadocDeclaration
`@param descriptorEvent` tag description is missing
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/EventAwareEntity.java`
#### Snippet
```java
     * Fired for the Entity creation.
     * 
     * @param descriptorEvent
     */
    void fireCreateEvent(DescriptorEvent descriptorEvent);
```

### JavadocDeclaration
`@param descriptorEvent` tag description is missing
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/EventAwareEntity.java`
#### Snippet
```java
     * Fired for the Entity deletion.
     * 
     * @param descriptorEvent
     */
    void fireDeleteEvent(DescriptorEvent descriptorEvent);
```

### JavadocDeclaration
`@param descriptorEvent` tag description is missing
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/EventAwareEntity.java`
#### Snippet
```java
     * Fired for the Entity updation.
     * 
     * @param descriptorEvent
     */
    void fireUpdateEvent(DescriptorEvent descriptorEvent);
```

### JavadocDeclaration
`@param tenant` tag description is missing
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTenantMetaData.java`
#### Snippet
```java
     * @param defaultDsType
     *            of this tenant
     * @param tenant
     */
    public JpaTenantMetaData(final DistributionSetType defaultDsType, final String tenant) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/aspects/ExceptionMappingAspectHandler.java`
#### Snippet
```java
     * @param ex
     *            the thrown and catched exception
     * @throws Throwable
     */
    @AfterThrowing(pointcut = "execution( * org.eclipse.hawkbit.repository.jpa.*Management.*(..))", throwing = "ex")
```

### JavadocDeclaration
`@param sort` tag description is missing
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/DistributionSetSpecification.java`
#### Snippet
```java
     * @param linkedControllerId
     *            controller id to get installed/assigned DS for
     * @param sort
     * @return specification that applies order by target, may be overwritten
     */
```

### JavadocDeclaration
`@param value` tag description is missing
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/system/MgmtSystemTenantConfigurationValueRequest.java`
#### Snippet
```java
     * Sets the MgmtSystemTenantConfigurationValueRequest
     * 
     * @param value
     */
    public void setValue(final Object value) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `confirmationManagement` may be 'final'
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageHandlerService.java`
#### Snippet
```java

    private ControllerManagement controllerManagement;
    private ConfirmationManagement confirmationManagement;

    private final EntityFactory entityFactory;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/json/model/DdiResult.java`
#### Snippet
```java
        NONE("none");

        private String name;

        FinalResult(final String name) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/json/model/DdiDeployment.java`
#### Snippet
```java
        FORCED("forced");

        private String name;

        HandlingType(final String name) {
```

### FieldMayBeFinal
Field `status` may be 'final'
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/json/model/DdiDeployment.java`
#### Snippet
```java
        UNAVAILABLE("unavailable");

        private String status;

        DdiMaintenanceWindowStatus(final String status) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/json/model/DdiUpdateMode.java`
#### Snippet
```java
    REMOVE("remove");

    private String name;

    DdiUpdateMode(final String name) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/json/model/DdiStatus.java`
#### Snippet
```java
        DOWNLOAD("download");

        private String name;

        ExecutionStatus(final String name) {
```

### FieldMayBeFinal
Field `autoConfirmationView` may be 'final'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/UiProperties.java`
#### Snippet
```java
             * Link to documentation of auto confirmation view.
             */
            private String autoConfirmationView = "";

            /**
```

### FieldMayBeFinal
Field `BASE64` may be 'final'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/utils/StringHtmlEncoder.java`
#### Snippet
```java
     * Base64 encoder which suppresses trailing padding characters.
     */
    private static Encoder BASE64 = Base64.getEncoder().withoutPadding();

    private StringHtmlEncoder() {
```

### FieldMayBeFinal
Field `style` may be 'final'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/header/support/CrudMenuHeaderSupport.java`
#### Snippet
```java
        SELECT(""), EDIT("mode-edit"), DELETE("mode-delete");

        private String style;

        Mode(final String style) {
```

### FieldMayBeFinal
Field `subEntityAttributes` may be 'final'
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/TargetFilterQueryFields.java`
#### Snippet
```java

    private final String fieldName;
    private List<String> subEntityAttributes;

    private TargetFilterQueryFields(final String fieldName) {
```

### FieldMayBeFinal
Field `subEntityAttributes` may be 'final'
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/ActionFields.java`
#### Snippet
```java
    private final String fieldName;

    private List<String> subEntityAttributes;

    private ActionFields(final String fieldName) {
```

### FieldMayBeFinal
Field `subEntityMapTuple` may be 'final'
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/SoftwareModuleFields.java`
#### Snippet
```java
    private final String fieldName;
    private boolean mapField;
    private Entry<String, String> subEntityMapTuple;

    private SoftwareModuleFields(final String fieldName) {
```

### FieldMayBeFinal
Field `mapField` may be 'final'
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/SoftwareModuleFields.java`
#### Snippet
```java

    private final String fieldName;
    private boolean mapField;
    private Entry<String, String> subEntityMapTuple;

```

### FieldMayBeFinal
Field `subEntityAttribues` may be 'final'
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/TargetFields.java`
#### Snippet
```java

    private final String fieldName;
    private List<String> subEntityAttribues;
    private boolean mapField;
    private Entry<String, String> subEntityMapTuple;
```

### FieldMayBeFinal
Field `mapField` may be 'final'
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/TargetFields.java`
#### Snippet
```java
    private final String fieldName;
    private List<String> subEntityAttribues;
    private boolean mapField;
    private Entry<String, String> subEntityMapTuple;

```

### FieldMayBeFinal
Field `subEntityMapTuple` may be 'final'
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/TargetFields.java`
#### Snippet
```java
    private List<String> subEntityAttribues;
    private boolean mapField;
    private Entry<String, String> subEntityMapTuple;

    private TargetFields(final String fieldName) {
```

### FieldMayBeFinal
Field `mapField` may be 'final'
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/DistributionSetFields.java`
#### Snippet
```java

    private final String fieldName;
    private boolean mapField;
    private Entry<String, String> subEntityMapTuple;

```

### FieldMayBeFinal
Field `subEntityMapTuple` may be 'final'
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/DistributionSetFields.java`
#### Snippet
```java
    private final String fieldName;
    private boolean mapField;
    private Entry<String, String> subEntityMapTuple;

    private DistributionSetFields(final String fieldName) {
```

### FieldMayBeFinal
Field `password` may be 'final'
in `hawkbit-dmf/hawkbit-dmf-rabbitmq-test/src/main/java/org/eclipse/hawkbit/rabbitmq/test/RabbitMqSetupService.java`
#### Snippet
```java
    private String username;

    private String password;

    public RabbitMqSetupService() {
```

### FieldMayBeFinal
Field `username` may be 'final'
in `hawkbit-dmf/hawkbit-dmf-rabbitmq-test/src/main/java/org/eclipse/hawkbit/rabbitmq/test/RabbitMqSetupService.java`
#### Snippet
```java
    private final String hostname;

    private String username;

    private String password;
```

### FieldMayBeFinal
Field `allowedColumns` may be 'final'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/PropertyMapper.java`
#### Snippet
```java
public final class PropertyMapper {

    private static Map<Class<?>, Map<String, String>> allowedColumns = new HashMap<>();

    private PropertyMapper() {
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `r` is redundant
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/util/FileStreamingUtil.java`
#### Snippet
```java
            final HttpServletResponse response, final FileStreamingProgressListener progressListener,
            final ByteRange full) {
        final ByteRange r = full;
        response.setHeader(HttpHeaders.CONTENT_RANGE, "bytes " + r.getStart() + "-" + r.getEnd() + "/" + r.getTotal());
        response.setContentLengthLong(r.getLength());
```

### UnnecessaryLocalVariable
Local variable `savedRollout` is redundant
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaRolloutManagement.java`
#### Snippet
```java
        RolloutHelper.verifyRolloutGroupConditions(conditions);

        final JpaRollout savedRollout = rollout;

        // we can enforce the 'max targets per group' quota right here because
```

### UnnecessaryLocalVariable
Local variable `pageTargets` is redundant
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtRolloutResource.java`
#### Snippet
```java
                    rsqlParam);
        } else {
            final Page<Target> pageTargets = this.rolloutGroupManagement.findTargetsOfRolloutGroup(pageable, groupId);
            rolloutGroupTargets = pageTargets;
        }
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/builder/DistributionSetTypeCreate.java`
#### Snippet
```java
     */
    default DistributionSetTypeCreate optional(final Long optional) {
        return optional(Arrays.asList(optional));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/builder/DistributionSetTypeCreate.java`
#### Snippet
```java
     */
    default DistributionSetTypeCreate mandatory(final Long mandatory) {
        return mandatory(Arrays.asList(mandatory));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java
    public List<Action> sendUpdateActionStatusToTargets(final Collection<Target> targets, final Status status,
            final String message) {
        return sendUpdateActionStatusToTargets(targets, status, Arrays.asList(message));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java
        final DistributionSet distributionSet = createDistributionSet();
        distributionSetInvalidationManagement.invalidateDistributionSet(
                new DistributionSetInvalidation(Arrays.asList(distributionSet.getId()), CancelationType.NONE, false));
        return distributionSet;
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java
        final DistributionSet set = createDistributionSet(prefix, version, false);

        tags.forEach(tag -> distributionSetManagement.toggleTagAssignment(Arrays.asList(set.getId()), tag.getName()));

        return distributionSetManagement.get(set.getId()).get();
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/SecurityManagedConfiguration.java`
#### Snippet
```java
        final FilterRegistrationBean<DosFilter> filterRegBean = dosFilter(Collections.emptyList(),
                securityProperties.getDos().getFilter(), securityProperties.getClients());
        filterRegBean.setUrlPatterns(Arrays.asList("/system/*"));
        filterRegBean.setOrder(DOS_FILTER_ORDER);
        filterRegBean.setName("dosSystemFilter");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/SecurityManagedConfiguration.java`
#### Snippet
```java
                final AnonymousAuthenticationFilter anonymousFilter = new AnonymousAuthenticationFilter(
                        "controllerAnonymousFilter", "anonymous",
                        Arrays.asList(new SimpleGrantedAuthority(SpringEvalExpressions.CONTROLLER_ROLE_ANONYMOUS)));
                anonymousFilter.setAuthenticationDetailsSource(authenticationDetailsSource);
                httpSec.requestMatchers().antMatchers(DDI_DL_ANT_MATCHER).and().securityContext().disable().anonymous()
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/SecurityManagedConfiguration.java`
#### Snippet
```java
        public FilterRegistrationBean<DosFilter> dosDDiDlFilter(final HawkbitSecurityProperties securityProperties) {

            final FilterRegistrationBean<DosFilter> filterRegBean = dosFilter(Arrays.asList(DDI_DL_ANT_MATCHER),
                    securityProperties.getDos().getFilter(), securityProperties.getClients());
            filterRegBean.setOrder(DOS_FILTER_ORDER);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/SecurityManagedConfiguration.java`
#### Snippet
```java
                final AnonymousAuthenticationFilter anonymousFilter = new AnonymousAuthenticationFilter(
                        "controllerAnonymousFilter", "anonymous",
                        Arrays.asList(new SimpleGrantedAuthority(SpringEvalExpressions.CONTROLLER_ROLE_ANONYMOUS)));
                anonymousFilter.setAuthenticationDetailsSource(authenticationDetailsSource);
                httpSec.requestMatchers().antMatchers(DDI_ANT_MATCHERS).and().securityContext().disable().anonymous()
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/RolloutViewMenuItem.java`
#### Snippet
```java
    @Override
    public List<String> getPermissions() {
        return Arrays.asList(SpPermission.READ_ROLLOUT);
    }
}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/UploadArtifactViewMenuItem.java`
#### Snippet
```java
    @Override
    public List<String> getPermissions() {
        return Arrays.asList(SpPermission.READ_REPOSITORY);
    }
}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/distributions/DistributionsViewMenuItem.java`
#### Snippet
```java
    @Override
    public List<String> getPermissions() {
        return Arrays.asList(SpPermission.READ_REPOSITORY);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/FilterManagementViewMenuItem.java`
#### Snippet
```java
    @Override
    public List<String> getPermissions() {
        return Arrays.asList(SpPermission.READ_TARGET);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/tenantconfiguration/TenantConfigurationDashboardViewMenuItem.java`
#### Snippet
```java
    @Override
    public List<String> getPermissions() {
        return Arrays.asList(SpPermission.TENANT_CONFIGURATION);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaSoftwareModuleManagement.java`
#### Snippet
```java
            ConcurrencyFailureException.class }, maxAttempts = Constants.TX_RT_MAX, backoff = @Backoff(delay = Constants.TX_RT_DELAY))
    public void delete(final long moduleId) {
        delete(Arrays.asList(moduleId));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDistributionSetManagement.java`
#### Snippet
```java
        final Specification<JpaDistributionSet> spec = DistributionSetSpecification.isDeleted(Boolean.FALSE);

        return distributionSetRepository.count(SpecificationsBuilder.combineWithAnd(Arrays.asList(spec)));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java
        } else if (shouldSuggestDotToken(currentTokenImageName, containsDot)) {
            return Optional
                    .of(Arrays.asList(new SuggestToken(currentTokenEndColumn, nextTokenBeginColumn + 1, null, ".")));
        } else if (shouldSuggestSubTokenFieldNames(currentTokenImageName, containsDot)) {
            return handleSubtokenSuggestion(currentTokenImageName, nextTokenBeginColumn);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDeploymentManagement.java`
#### Snippet
```java
    @Override
    public long countActions(final String rsqlParam) {
        final List<Specification<JpaAction>> specList = Arrays.asList(
                RSQLUtility.buildRsqlSpecification(rsqlParam, ActionFields.class, virtualPropertyReplacer, database));
        return JpaManagementHelper.countBySpec(actionRepository, specList);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDeploymentManagement.java`
#### Snippet
```java
    @Override
    public Slice<Action> findActions(final String rsqlParam, final Pageable pageable) {
        final List<Specification<JpaAction>> specList = Arrays.asList(
                RSQLUtility.buildRsqlSpecification(rsqlParam, ActionFields.class, virtualPropertyReplacer, database));
        return JpaManagementHelper.findAllWithoutCountBySpec(actionRepository, pageable, specList);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtDistributionSetResource.java`
#### Snippet
```java
            @Valid @RequestBody final MgmtInvalidateDistributionSetRequestBody invalidateRequestBody) {
        distributionSetInvalidationManagement
                .invalidateDistributionSet(new DistributionSetInvalidation(Arrays.asList(distributionSetId),
                        MgmtRestModelMapper.convertCancelationType(invalidateRequestBody.getActionCancelationType()),
                        invalidateRequestBody.isCancelRollouts()));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtDistributionSetTypeResource.java`
#### Snippet
```java

        distributionSetTypeManagement.assignOptionalSoftwareModuleTypes(distributionSetTypeId,
                Arrays.asList(smtId.getId()));

        return ResponseEntity.ok().build();
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtDistributionSetTypeResource.java`
#### Snippet
```java

        distributionSetTypeManagement.assignMandatorySoftwareModuleTypes(distributionSetTypeId,
                Arrays.asList(smtId.getId()));

        return ResponseEntity.ok().build();
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/AbstractControllerAuthenticationFilter.java`
#### Snippet
```java
    @Override
    public Collection<GrantedAuthority> getSuccessfulAuthenticationAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority(SpringEvalExpressions.CONTROLLER_ROLE));
    }
}
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/data/ResponseList.java`
#### Snippet
```java

    @Override
    public boolean equals(final Object o) {
        return content.equals(o);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/SecurityContextTenantAware.java`
#### Snippet
```java

        @Override
        public boolean equals(final Object another) {
            if (delegate != null) {
                return delegate.equals(another);
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/PreAuthTokenSourceTrustAuthenticationProvider.java`
#### Snippet
```java
        this.authorizedSourceIps = new ArrayList<>();
        for (final String ip : authorizedSourceIps) {
            this.authorizedSourceIps.add(ip);
        }
    }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'skipFully(java.io.InputStream, long)' is marked unstable with @Beta
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/util/FileStreamingUtil.java`
#### Snippet
```java
        int progressPercent = 1;

        ByteStreams.skipFully(from, start);

        long toRead = length;
```

### UnstableApiUsage
'nullOutputStream()' is marked unstable with @Beta
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileTransferHandlerVaadinUpload.java`
#### Snippet
```java
    public OutputStream receiveUpload(final String fileName, final String mimeType) {
        if (isUploadInterrupted()) {
            return ByteStreams.nullOutputStream();
        }

```

### UnstableApiUsage
'nullOutputStream()' is marked unstable with @Beta
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileTransferHandlerVaadinUpload.java`
#### Snippet
```java
            interruptUploadDueToUploadFailed();
            publishUploadFailedAndFinishedEvent(fileUploadId);
            return ByteStreams.nullOutputStream();
        }
        return outputStream;
```

### UnstableApiUsage
'nullOutputStream()' is marked unstable with @Beta
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileTransferHandlerStreamVariable.java`
#### Snippet
```java
    public final OutputStream getOutputStream() {
        if (isUploadInterrupted()) {
            return ByteStreams.nullOutputStream();
        }

```

### UnstableApiUsage
'nullOutputStream()' is marked unstable with @Beta
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileTransferHandlerStreamVariable.java`
#### Snippet
```java
            interruptUploadDueToUploadFailed();
            publishUploadFailedAndFinishedEvent(fileUploadId);
            return ByteStreams.nullOutputStream();
        }
        return outputStream;
```

### UnstableApiUsage
'constrainToRange(double, double, double)' is marked unstable with @Beta
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/components/ColorPickerComponent.java`
#### Snippet
```java

    private static double sanitizeSliderRGBValue(final int colorValue) {
        return Doubles.constrainToRange(colorValue, RGB_START, RGB_END);
    }

```

### UnstableApiUsage
'nullOutputStream()' is marked unstable with @Beta
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/bulkupload/BulkUploadHandler.java`
#### Snippet
```java
        }

        return ByteStreams.nullOutputStream();
    }

```

### UnstableApiUsage
'move(java.io.File, java.io.File)' is marked unstable with @Beta
in `hawkbit-artifact-repository-filesystem/src/main/java/org/eclipse/hawkbit/artifact/repository/ArtifactFilesystemRepository.java`
#### Snippet
```java
            FileUtils.deleteQuietly(file);
        } else {
            Files.move(file, fileSHA1Naming);
        }

```

