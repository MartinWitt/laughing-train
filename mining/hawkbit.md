# hawkbit 
 
# Bad smells
I found 883 bad smells with 56 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 322 | false |
| ReturnNull | 131 | false |
| DefaultAnnotationParam | 53 | false |
| UnnecessaryFullyQualifiedName | 41 | false |
| UnnecessaryModifier | 28 | true |
| UnnecessarySemicolon | 19 | false |
| StringBufferReplaceableByString | 18 | false |
| SimplifyOptionalCallChains | 15 | false |
| MismatchedJavadocCode | 13 | false |
| DataFlowIssue | 12 | false |
| UNUSED_IMPORT | 11 | false |
| MismatchedCollectionQueryUpdate | 11 | false |
| WrapperTypeMayBePrimitive | 10 | false |
| AbstractMethodCallInConstructor | 10 | false |
| OptionalContainsCollection | 9 | false |
| ZeroLengthArrayInitialization | 8 | false |
| UnstableApiUsage | 8 | false |
| RedundantFieldInitialization | 7 | false |
| DynamicRegexReplaceableByCompiledPattern | 7 | false |
| ToArrayCallWithZeroLengthArrayArgument | 6 | true |
| FinalPrivateMethod | 6 | false |
| SizeReplaceableByIsEmpty | 6 | true |
| NestedAssignment | 6 | false |
| UnusedAssignment | 6 | false |
| OptionalGetWithoutIsPresent | 6 | false |
| CodeBlock2Expr | 5 | true |
| StringConcatenationInsideStringBufferAppend | 5 | false |
| Convert2MethodRef | 5 | false |
| RedundantCollectionOperation | 5 | false |
| UnnecessaryBoxing | 5 | false |
| FinalStaticMethod | 4 | false |
| UnnecessarySuperQualifier | 4 | false |
| FuseStreamOperations | 4 | false |
| ReplaceInefficientStreamCount | 4 | false |
| SimplifyStreamApiCallChains | 4 | false |
| NonStrictComparisonCanBeEquality | 4 | true |
| RegExpRedundantEscape | 3 | false |
| IgnoreResultOfCall | 3 | false |
| EmptyMethod | 3 | false |
| CallToStringConcatCanBeReplacedByOperator | 3 | false |
| ConstantValue | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| DuplicateBranchesInSwitch | 2 | false |
| RegExpSimplifiable | 2 | false |
| FunctionalExpressionCanBeFolded | 2 | false |
| SlowListContainsAll | 2 | false |
| ReplaceAssignmentWithOperatorAssignment | 2 | false |
| OptionalIsPresent | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| CatchMayIgnoreException | 2 | false |
| CharsetObjectCanBeUsed | 2 | false |
| EqualsWhichDoesntCheckParameterClass | 2 | false |
| WhileCanBeForeach | 1 | false |
| UnnecessaryReturn | 1 | true |
| AbstractClassNeverImplemented | 1 | false |
| MissortedModifiers | 1 | false |
| UnnecessaryUnboxing | 1 | false |
| RedundantMethodOverride | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| UseOfPropertiesAsHashtable | 1 | false |
| EqualsAndHashcode | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| IndexOfReplaceableByContains | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| ManualArrayToCollectionCopy | 1 | false |
| TypeParameterHidesVisibleType | 1 | false |
| MethodOverloadsParentMethod | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| SetReplaceableByEnumSet | 1 | false |
| StringEqualsEmptyString | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| AssignmentToMethodParameter | 1 | false |
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
            return toSingleList(cb.and(childs.toArray(new Predicate[childs.size()])));
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
            return toSingleList(cb.or(childs.toArray(new Predicate[childs.size()])));
        }
        return toSingleList(cb.conjunction());
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtSoftwareModuleTypeResource.java`
#### Snippet
```java

        final Slice<SoftwareModuleType> findModuleTypessAll;
        Long countModulesAll;
        if (rsqlParam != null) {
            findModuleTypessAll = softwareModuleTypeManagement.findByRsql(pageable, rsqlParam);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTargetFilterQueryResource.java`
#### Snippet
```java
        final Pageable pageable = new OffsetBasedPageRequest(sanitizedOffsetParam, sanitizedLimitParam, sorting);
        final Slice<TargetFilterQuery> findTargetFiltersAll;
        final Long countTargetsAll;
        if (rsqlParam != null) {
            final Page<TargetFilterQuery> findFilterPage = filterManagement.findByRsql(pageable, rsqlParam);
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

## RuleId[id=UnnecessaryModifier]
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
    private Entry<String, String> subEntityMapTuple;

    private SoftwareModuleFields(final String fieldName) {
        this(fieldName, false, null);
    }
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

    private DistributionSetFields(final String fieldName, final Entry<String, String> subEntityMapTuple) {
        this(fieldName, true, subEntityMapTuple);
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
    }

    private TargetFields(final String fieldName, final boolean mapField, final List<String> subEntityAttribues,
            final Entry<String, String> subEntityMapTuple) {
        this.fieldName = fieldName;
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

    private TargetFields(final String fieldName, final Entry<String, String> subEntityMapTuple) {
        this(fieldName, true, Collections.emptyList(), subEntityMapTuple);
    }
```

## RuleId[id=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/matcher/EventVerifier.java`
#### Snippet
```java
            final StringBuilder failMessage = new StringBuilder("Missing event verification for ");
            final Iterator<Class<?>> itr = diffSet.iterator();
            while (itr.hasNext()) {
                final Class<?> element = itr.next();
                final int count = eventCaptor.getCountFor(element);
```

## RuleId[id=RegExpRedundantEscape]
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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`ip.length() == 0` can be replaced with 'ip.isEmpty()'
in `hawkbit-http-security/src/main/java/org/eclipse/hawkbit/security/DosFilter.java`
#### Snippet
```java

    private static boolean checkIpFails(final String ip) {
        return ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip);
    }

```

### SizeReplaceableByIsEmpty
`diffSet.size() > 0` can be replaced with '!diffSet.isEmpty()'
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/matcher/EventVerifier.java`
#### Snippet
```java

        final Set<Class<?>> diffSet = eventCaptor.diff(expectedEvents);
        if (diffSet.size() > 0) {
            final StringBuilder failMessage = new StringBuilder("Missing event verification for ");
            final Iterator<Class<?>> itr = diffSet.iterator();
```

### SizeReplaceableByIsEmpty
`substring.length() > 0` can be replaced with '!substring.isEmpty()'
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/util/FileStreamingUtil.java`
#### Snippet
```java
    private static long sublong(final String value, final int beginIndex, final int endIndex) {
        final String substring = value.substring(beginIndex, endIndex);
        return substring.length() > 0 ? Long.parseLong(substring) : -1;
    }

```

### SizeReplaceableByIsEmpty
`delim.length() > 0` can be replaced with '!delim.isEmpty()'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/utils/HawkbitCommonUtil.java`
#### Snippet
```java
        }
        final String conCatedStr = conCatStrBldr.toString();
        return delim.length() > 0 && conCatedStr.startsWith(delim) ? conCatedStr.substring(1) : conCatedStr;
    }

```

### SizeReplaceableByIsEmpty
`prefix.length() > 0` can be replaced with '!prefix.isEmpty()'
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java

        return distributionSetManagement.create(
                entityFactory.distributionSet().create().name(prefix != null && prefix.length() > 0 ? prefix : "DS")
                        .version(version).description(randomDescriptionShort()).type(findOrCreateDefaultTestDsType())
                        .modules(modules.stream().map(SoftwareModule::getId).collect(Collectors.toList()))
```

### SizeReplaceableByIsEmpty
`prefix.length() > 0` can be replaced with '!prefix.isEmpty()'
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java

        return distributionSetManagement.create(
                entityFactory.distributionSet().create().name(prefix != null && prefix.length() > 0 ? prefix : "DS")
                        .version(version).description(randomDescriptionShort()).type(findOrCreateDefaultTestDsType())
                        .modules(Arrays.asList(osMod.getId(), runtimeMod.getId(), appMod.getId()))
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

    private Button buildTagButton(final ProxyTag tagData) {
        final String tagButtonId = new StringBuilder(UIComponentIdProvider.ASSIGNED_TAG_ID_PREFIX).append(".")
                .append(tagData.getId()).toString();

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
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/filterlayout/AbstractFilterButtons.java`
#### Snippet
```java

    private Button buildFilterNameButton(final T clickedFilter) {
        final String filterNameId = new StringBuilder(getFilterButtonIdPrefix()).append(".")
                .append(clickedFilter.getId()).toString();

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

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `AbstractBooleanTenantConfigurationItem` has no concrete subclass
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/tenantconfiguration/generic/AbstractBooleanTenantConfigurationItem.java`
#### Snippet
```java
 * abstract authentication configuration item.
 */
public abstract class AbstractBooleanTenantConfigurationItem extends VerticalLayout
        implements BooleanConfigurationItem {

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Action`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/event/remote/AbstractAssignmentEvent.java`
#### Snippet
```java
    }

    protected AbstractAssignmentEvent(final Object source, final String tenant, final List<Action> a,
            final String applicationId) {
        super(source, tenant, applicationId);
```

### BoundedWildcard
Can generalize to `? extends Action`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/event/remote/TargetAssignDistributionSetEvent.java`
#### Snippet
```java
     *            see {@link Action#isMaintenanceWindowAvailable()}
     */
    public TargetAssignDistributionSetEvent(final String tenant, final long distributionSetId, final List<Action> a,
            final String applicationId, final boolean maintenanceWindowAvailable) {
        super(distributionSetId, tenant,
```

### BoundedWildcard
Can generalize to `? extends Action`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/event/remote/MultiActionEvent.java`
#### Snippet
```java
    }

    private static List<Long> getIdsFromActions(final List<Action> actions) {
        return actions.stream().map(Identifiable::getId).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? extends Action`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/event/remote/MultiActionEvent.java`
#### Snippet
```java
    }

    private static List<String> getControllerIdsFromActions(final List<Action> actions) {
        return actions.stream().map(Action::getTarget).map(Target::getControllerId).distinct()
                .collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends TotalTargetCountActionStatus`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/model/TotalTargetCountStatus.java`
#### Snippet
```java
     *            all target {@link Status} with total count
     */
    private void addToTotalCount(final List<TotalTargetCountActionStatus> targetCountActionStatus) {
        if (targetCountActionStatus == null) {
            statusTotalCountMap.put(TotalTargetCountStatus.Status.NOTSTARTED, totalTargetCount);
```

### BoundedWildcard
Can generalize to `? extends DdiArtifact`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/json/model/DdiChunk.java`
#### Snippet
```java
     */
    public DdiChunk(final String part, final String version, final String name, final Boolean encrypted,
            final List<DdiArtifact> artifacts, final List<DdiMetadata> metadata) {
        this.part = part;
        this.version = version;
```

### BoundedWildcard
Can generalize to `? extends DdiChunk`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/json/model/DdiDeployment.java`
#### Snippet
```java
     *            the parameter is null.
     */
    public DdiDeployment(final HandlingType download, final HandlingType update, final List<DdiChunk> chunks,
            final DdiMaintenanceWindowStatus maintenanceWindow) {
        this.download = download;
```

### BoundedWildcard
Can generalize to `? extends UserPrincipal`
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/InMemoryUserManagementAutoConfiguration.java`
#### Snippet
```java
        private final HashMap<String, UserPrincipal> userPrincipalMap = new HashMap<>();

        public FixedInMemoryUserPrincipalUserDetailsService(final Collection<UserPrincipal> userPrincipals) {
            for (final UserPrincipal user : userPrincipals) {
                userPrincipalMap.put(user.getUsername(), user);
```

### BoundedWildcard
Can generalize to `? super Long`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/matcher/BaseEntityMatcher.java`
#### Snippet
```java
    private static class HasIdMatcher extends FeatureMatcher<BaseEntity, Long> {

        public HasIdMatcher(final Matcher<Long> subMatcher) {
            super(subMatcher, "getId()", "id");
        }
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtSoftwareModuleMapper.java`
#### Snippet
```java
    }

    static List<MgmtArtifact> artifactsToResponse(final Collection<Artifact> artifacts) {
        if (artifacts == null) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends SoftwareModule`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtSoftwareModuleMapper.java`
#### Snippet
```java
    }

    static List<MgmtSoftwareModule> toResponse(final Collection<SoftwareModule> softwareModules) {
        if (softwareModules == null) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends MgmtSoftwareModuleRequestBodyPost`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtSoftwareModuleMapper.java`
#### Snippet
```java

    static List<SoftwareModuleCreate> smFromRequest(final EntityFactory entityFactory,
            final Collection<MgmtSoftwareModuleRequestBodyPost> smsRest) {
        if (smsRest == null) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends MgmtSoftwareModuleMetadata`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtSoftwareModuleMapper.java`
#### Snippet
```java

    static List<SoftwareModuleMetadataCreate> fromRequestSwMetadata(final EntityFactory entityFactory,
            final Long softwareModuleId, final Collection<MgmtSoftwareModuleMetadata> metadata) {
        if (metadata == null) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends SoftwareModuleMetadata`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtSoftwareModuleMapper.java`
#### Snippet
```java
    }

    static List<MgmtSoftwareModuleMetadata> toResponseSwMetadata(final Collection<SoftwareModuleMetadata> metadata) {
        if (metadata == null) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends MgmtAssignedTargetRequestBody`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTargetTagResource.java`
#### Snippet
```java

    private List<String> findTargetControllerIds(
            final List<MgmtAssignedTargetRequestBody> assignedTargetRequestBodies) {
        return assignedTargetRequestBodies.stream().map(MgmtAssignedTargetRequestBody::getControllerId)
                .collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends MgmtTargetTypeRequestBodyPost`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTargetTypeMapper.java`
#### Snippet
```java

    static List<TargetTypeCreate> targetFromRequest(final EntityFactory entityFactory,
            final Collection<MgmtTargetTypeRequestBodyPost> targetTypesRest) {
        if (targetTypesRest == null) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends TargetType`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTargetTypeMapper.java`
#### Snippet
```java
    }

    static List<MgmtTargetType> toListResponse(final List<TargetType> types) {
        if (types == null) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends MgmtSoftwareModuleTypeRequestBodyPost`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtSoftwareModuleTypeMapper.java`
#### Snippet
```java

    static List<SoftwareModuleTypeCreate> smFromRequest(final EntityFactory entityFactory,
            final Collection<MgmtSoftwareModuleTypeRequestBodyPost> smTypesRest) {
        if (smTypesRest == null) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends SoftwareModuleType`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtSoftwareModuleTypeMapper.java`
#### Snippet
```java
    }

    static List<MgmtSoftwareModuleType> toTypesResponse(final Collection<SoftwareModuleType> types) {
        if (types == null) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends MgmtTargetAssignmentRequestBody`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtDistributionSetResource.java`
#### Snippet
```java
    public ResponseEntity<MgmtTargetAssignmentResponseBody> createAssignedTarget(
            @PathVariable("distributionSetId") final Long distributionSetId,
            @RequestBody final List<MgmtTargetAssignmentRequestBody> assignments,
            @RequestParam(value = "offline", required = false) final boolean offline) {
        if (offline) {
```

### BoundedWildcard
Can generalize to `? extends MgmtSoftwareModuleAssigment`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtDistributionSetResource.java`
#### Snippet
```java
    @Override
    public ResponseEntity<Void> assignSoftwareModules(@PathVariable("distributionSetId") final Long distributionSetId,
            @RequestBody final List<MgmtSoftwareModuleAssigment> softwareModuleIDs) {

        distributionSetManagement.assignSoftwareModules(distributionSetId,
```

### BoundedWildcard
Can generalize to `? extends MgmtDistributionSetTypeAssignment`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTargetTypeResource.java`
#### Snippet
```java
    @Override
    public ResponseEntity<Void> addCompatibleDistributionSets(@PathVariable("targetTypeId") final Long targetTypeId,
            @RequestBody final List<MgmtDistributionSetTypeAssignment> distributionSetTypeIds) {

        targetTypeManagement.assignCompatibleDistributionSetTypes(targetTypeId, distributionSetTypeIds.stream()
```

### BoundedWildcard
Can generalize to `? extends DistributionSet`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtDistributionSetMapper.java`
#### Snippet
```java
    }

    static List<MgmtDistributionSet> toResponseFromDsList(final List<DistributionSet> sets) {
        if (sets == null) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends DistributionSetAssignmentResult`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtDistributionSetMapper.java`
#### Snippet
```java

    static MgmtTargetAssignmentResponseBody toResponse(
            final List<DistributionSetAssignmentResult> dsAssignmentResults) {
        final MgmtTargetAssignmentResponseBody result = new MgmtTargetAssignmentResponseBody();
        final int alreadyAssigned = dsAssignmentResults.stream()
```

### BoundedWildcard
Can generalize to `? extends MgmtDistributionSetRequestBodyPost`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtDistributionSetMapper.java`
#### Snippet
```java
     * @return converted list of {@link DistributionSet}s
     */
    static List<DistributionSetCreate> dsFromRequest(final Collection<MgmtDistributionSetRequestBodyPost> sets,
            final EntityFactory entityFactory) {

```

### BoundedWildcard
Can generalize to `? extends DistributionSetMetadata`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtDistributionSetMapper.java`
#### Snippet
```java
    }

    static List<MgmtMetadata> toResponseDsMetadata(final List<DistributionSetMetadata> metadata) {

        final List<MgmtMetadata> mappedList = new ArrayList<>(metadata.size());
```

### BoundedWildcard
Can generalize to `? extends DistributionSet`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtDistributionSetMapper.java`
#### Snippet
```java
    }

    static List<MgmtDistributionSet> toResponseDistributionSets(final Collection<DistributionSet> sets) {
        if (sets == null) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends MgmtMetadata`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtDistributionSetMapper.java`
#### Snippet
```java
    }

    static List<MetaData> fromRequestDsMetadata(final List<MgmtMetadata> metadata, final EntityFactory entityFactory) {
        if (metadata == null) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends MgmtAssignedDistributionSetRequestBody`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtDistributionSetTagResource.java`
#### Snippet
```java

    private static List<Long> findDistributionSetIds(
            final List<MgmtAssignedDistributionSetRequestBody> assignedDistributionSetRequestBodies) {
        return assignedDistributionSetRequestBodies.stream()
                .map(MgmtAssignedDistributionSetRequestBody::getDistributionSetId).collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends TargetFilterQuery`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTargetFilterQueryMapper.java`
#### Snippet
```java
    }

    static List<MgmtTargetFilterQuery> toResponse(final List<TargetFilterQuery> filters,
            final boolean confirmationFlowEnabled) {
        if (CollectionUtils.isEmpty(filters)) {
```

### BoundedWildcard
Can generalize to `? extends Action`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtActionMapper.java`
#### Snippet
```java
     * @return the response
     */
    public static List<MgmtAction> toResponse(final Collection<Action> actions, final MgmtRepresentationMode repMode) {
        if (actions == null) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends DistributionSetTag`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTagMapper.java`
#### Snippet
```java
    }

    static List<MgmtTag> toResponseDistributionSetTag(final List<DistributionSetTag> distributionSetTags) {
        final List<MgmtTag> tagsRest = new ArrayList<>();
        if (distributionSetTags == null) {
```

### BoundedWildcard
Can generalize to `? extends MgmtTagRequestBodyPut`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTagMapper.java`
#### Snippet
```java

    static List<TagCreate> mapTagFromRequest(final EntityFactory entityFactory,
            final Collection<MgmtTagRequestBodyPut> tags) {
        return tags.stream()
                .map(tagRest -> entityFactory.tag().create().name(tagRest.getName())
```

### BoundedWildcard
Can generalize to `? extends TargetTag`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTagMapper.java`
#### Snippet
```java
    }

    static List<MgmtTag> toResponse(final List<TargetTag> targetTags) {
        final List<MgmtTag> tagsRest = new ArrayList<>();
        if (targetTags == null) {
```

### BoundedWildcard
Can generalize to `? extends DistributionSetType`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtDistributionSetTypeMapper.java`
#### Snippet
```java
    }

    static List<MgmtDistributionSetType> toListResponse(final Collection<DistributionSetType> types) {
        if (types == null) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends MgmtDistributionSetTypeRequestBodyPost`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtDistributionSetTypeMapper.java`
#### Snippet
```java

    static List<DistributionSetTypeCreate> smFromRequest(final EntityFactory entityFactory,
            final Collection<MgmtDistributionSetTypeRequestBodyPost> smTypesRest) {
        if (smTypesRest == null) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends DmfTarget`
in `hawkbit-dmf/hawkbit-dmf-api/src/main/java/org/eclipse/hawkbit/dmf/json/model/DmfBatchDownloadAndUpdateRequest.java`
#### Snippet
```java
     *            the target
     */
    public void addTargets(final List<DmfTarget> targets) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends RolloutGroup`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtRolloutMapper.java`
#### Snippet
```java
    }

    static List<MgmtRolloutGroupResponseBody> toResponseRolloutGroup(final List<RolloutGroup> rollouts,
            final boolean confirmationFlowEnabled, final boolean withDetails) {
        if (rollouts == null) {
```

### BoundedWildcard
Can generalize to `? extends Rollout`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtRolloutMapper.java`
#### Snippet
```java
    }

    static List<MgmtRolloutResponseBody> toResponseRollout(final List<Rollout> rollouts, final boolean withDetails) {
        if (rollouts == null) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends DmfArtifact`
in `hawkbit-dmf/hawkbit-dmf-api/src/main/java/org/eclipse/hawkbit/dmf/json/model/DmfSoftwareModule.java`
#### Snippet
```java
    }

    public void setArtifacts(final List<DmfArtifact> artifacts) {
        this.artifacts = artifacts;
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/PagedList.java`
#### Snippet
```java
     */
    @JsonCreator
    public PagedList(@JsonProperty("content") @NotNull final List<T> content, @JsonProperty("total") final long total) {
        this.size = content.size();
        this.total = total;
```

### BoundedWildcard
Can generalize to `? extends MgmtDistributionSetAssignment`
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/target/MgmtDistributionSetAssignments.java`
#### Snippet
```java
     *            the assignments
     */
    public MgmtDistributionSetAssignments(final List<MgmtDistributionSetAssignment> assignments) {
        super(assignments);
    }
```

### BoundedWildcard
Can generalize to `? extends Action`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTargetMapper.java`
#### Snippet
```java
    }

    static List<MgmtAction> toResponse(final String targetId, final Collection<Action> actions) {
        if (actions == null) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends MgmtMetadata`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTargetMapper.java`
#### Snippet
```java
    }

    static List<MetaData> fromRequestTargetMetadata(final List<MgmtMetadata> metadata,
            final EntityFactory entityFactory) {
        if (metadata == null) {
```

### BoundedWildcard
Can generalize to `? extends MgmtTargetRequestBody`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTargetMapper.java`
#### Snippet
```java

    static List<TargetCreate> fromRequest(final EntityFactory entityFactory,
            final Collection<MgmtTargetRequestBody> targetsRest) {
        if (targetsRest == null) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends Target`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTargetMapper.java`
#### Snippet
```java
     * @return the response
     */
    public static List<MgmtTarget> toResponse(final Collection<Target> targets, final TenantConfigHelper configHelper) {
        if (targets == null) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends TargetMetadata`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTargetMapper.java`
#### Snippet
```java
    }

    static List<MgmtMetadata> toResponseTargetMetadata(final List<TargetMetadata> metadata) {
        return metadata.stream().map(MgmtTargetMapper::toResponseTargetMetadata).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? extends ActionStatus`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTargetMapper.java`
#### Snippet
```java
    }

    static List<MgmtActionStatus> toActionStatusRestResponse(final Collection<ActionStatus> actionStatus,
            final DeploymentManagement deploymentManagement) {
        if (actionStatus == null) {
```

### BoundedWildcard
Can generalize to `? extends Target`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/AbstractIntegrationTest.java`
#### Snippet
```java

    protected DistributionSetAssignmentResult assignDistributionSet(final DistributionSet ds,
            final List<Target> targets) {
        final List<String> targetIds = targets.stream().map(Target::getControllerId).collect(Collectors.toList());
        return assignDistributionSet(ds.getId(), targetIds, ActionType.FORCED);
```

### BoundedWildcard
Can generalize to `? extends RolloutGroup`
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/RolloutHelper.java`
#### Snippet
```java
     * @return list of groups
     */
    public static List<Long> getGroupsByStatusIncludingGroup(final List<RolloutGroup> groups,
            final RolloutGroup.RolloutGroupStatus status, final RolloutGroup group) {
        return groups.stream().filter(innerGroup -> innerGroup.getStatus() == status || innerGroup.equals(group))
```

### BoundedWildcard
Can generalize to `? extends RolloutGroup`
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/RolloutHelper.java`
#### Snippet
```java
     *         string.
     */
    public static String getAllGroupsTargetFilter(final List<RolloutGroup> groups) {
        if (groups.stream().anyMatch(group -> StringUtils.isEmpty(group.getTargetFilterQuery()))) {
            return "";
```

### BoundedWildcard
Can generalize to `? extends RolloutGroup`
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/RolloutHelper.java`
#### Snippet
```java
    }

    private static boolean isTargetFilterInGroups(final String groupFilter, final List<RolloutGroup> groups) {
        return !StringUtils.isEmpty(groupFilter)
                && groups.stream().anyMatch(prevGroup -> !StringUtils.isEmpty(prevGroup.getTargetFilterQuery())
```

### BoundedWildcard
Can generalize to `? super ByteRange`
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/util/FileStreamingUtil.java`
#### Snippet
```java

    private static void checkForShortcut(final HttpServletRequest request, final String etag, final long lastModified,
            final ByteRange full, final List<ByteRange> ranges) {
        final String ifRange = request.getHeader(HttpHeaders.IF_RANGE);
        if (ifRange != null && !ifRange.equals(etag)) {
```

### BoundedWildcard
Can generalize to `? super ByteRange`
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/util/FileStreamingUtil.java`
#### Snippet
```java

    private static ResponseEntity<InputStream> extractRange(final HttpServletResponse response, final long length,
            final List<ByteRange> ranges, final String range) {

        if (ranges.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends SoftwareModuleMetadata`
in `hawkbit-rest/hawkbit-ddi-resource/src/main/java/org/eclipse/hawkbit/ddi/rest/resource/DataConversionHelper.java`
#### Snippet
```java
    }

    private static List<DdiMetadata> mapMetadata(final List<SoftwareModuleMetadata> metadata) {
        return CollectionUtils.isEmpty(metadata) ? null
                : metadata.stream().map(md -> new DdiMetadata(md.getKey(), md.getValue())).collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends List`
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/RolloutStatusCache.java`
#### Snippet
```java
    }

    private void putIntoCache(final Map<Long, List<TotalTargetCountActionStatus>> put, @NotNull final Cache cache) {
        put.forEach((k, v) -> cache.put(k, new CachedTotalTargetCountActionStatus(k, v)));
    }
```

### BoundedWildcard
Can generalize to `? extends UiErrorDetailsExtractor`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/error/HawkbitUIErrorHandler.java`
#### Snippet
```java
     */
    public HawkbitUIErrorHandler(final VaadinMessageSource i18n,
            final List<UiErrorDetailsExtractor> uiErrorDetailsExtractors) {
        this.i18n = i18n;
        this.uiErrorDetailsExtractors = uiErrorDetailsExtractors;
```

### BoundedWildcard
Can generalize to `? extends DashboardMenuItem`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/menu/DashboardMenu.java`
#### Snippet
```java
    DashboardMenu(final VaadinMessageSource i18n, final UiProperties uiProperties,
            final HawkbitServerProperties serverProperties, final PermissionService permissionService,
            final List<DashboardMenuItem> dashboardVaadinViews) {
        this.i18n = i18n;
        this.uiProperties = uiProperties;
```

### BoundedWildcard
Can generalize to `? extends ConstraintViolation`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/error/extractors/ConstraintViolationErrorExtractor.java`
#### Snippet
```java
    }

    private static String formatViolations(final Set<ConstraintViolation<?>> violations) {
        return violations.stream().map(violation -> violation.getPropertyPath() + " " + violation.getMessage())
                .collect(Collectors.joining(System.lineSeparator()));
```

### BoundedWildcard
Can generalize to `? super String`
in `hawkbit-rest/hawkbit-ddi-resource/src/main/java/org/eclipse/hawkbit/ddi/rest/resource/DdiRootController.java`
#### Snippet
```java
    }

    private static void addMessageIfEmpty(final String text, final List<String> messages) {
        if (messages != null && messages.isEmpty()) {
            messages.add(RepositoryConstants.SERVER_MESSAGE_PREFIX + text + ".");
```

### BoundedWildcard
Can generalize to `? super String`
in `hawkbit-rest/hawkbit-ddi-resource/src/main/java/org/eclipse/hawkbit/ddi/rest/resource/DdiRootController.java`
#### Snippet
```java

    private static Status handleCaseCancelCanceled(final DdiActionFeedback feedback, final Target target,
            final Long actionId, final List<String> messages) {
        final Status status;
        LOG.error(
```

### BoundedWildcard
Can generalize to `? super Pageable`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/utils/HawkbitCommonUtil.java`
#### Snippet
```java
     * @return Entities
     */
    public static <T> List<T> getEntitiesByPageableProvider(final Function<Pageable, Slice<T>> provider) {
        Pageable query = PageRequest.of(0, SPUIDefinitions.PAGE_SIZE);
        Slice<T> slice;
```

### BoundedWildcard
Can generalize to `? extends Slice`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/utils/HawkbitCommonUtil.java`
#### Snippet
```java
     * @return Entities
     */
    public static <T> List<T> getEntitiesByPageableProvider(final Function<Pageable, Slice<T>> provider) {
        Pageable query = PageRequest.of(0, SPUIDefinitions.PAGE_SIZE);
        Slice<T> slice;
```

### BoundedWildcard
Can generalize to `? extends EventListenersAwareLayout`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/AbstractEventListenersAwareView.java`
#### Snippet
```java
     *            event aware layouts to add
     */
    protected void addEventAwareLayouts(final Collection<EventListenersAwareLayout> eventAwareLayouts) {
        eventAwareLayouts.forEach(this::addEventAwareLayout);
    }
```

### BoundedWildcard
Can generalize to `? extends EntityIdEvent`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/push/DelayedEventBusPushStrategy.java`
#### Snippet
```java
        }

        private List<Long> getEventIds(final List<EntityIdEvent> events) {
            return events.stream().map(EntityIdEvent::getEntityId).collect(Collectors.toList());
        }
```

### BoundedWildcard
Can generalize to `? extends EntityIdEvent`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/push/DelayedEventBusPushStrategy.java`
#### Snippet
```java
        }

        private Map<Long, List<Long>> getParentAwareEventIds(final List<EntityIdEvent> events) {
            return events.stream().filter(event -> event instanceof ParentIdAwareEvent)
                    .collect(Collectors.groupingBy(event -> ((ParentIdAwareEvent) event).getParentEntityId(),
```

### BoundedWildcard
Can generalize to `? extends List`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/push/DelayedEventBusPushStrategy.java`
#### Snippet
```java
        private Stream<EntityModifiedEventPayload> mapToEntityModifiedEventPayload(
                final EntityModifiedEventPayloadIdentifier eventPayloadIdentifier,
                final Map<Long, List<Long>> parentAwareEntityIds) {
            return parentAwareEntityIds.entrySet().stream().map(parentAwareEntry -> EntityModifiedEventPayload
                    .of(eventPayloadIdentifier, parentAwareEntry.getKey(), parentAwareEntry.getValue()));
```

### BoundedWildcard
Can generalize to `? super T`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/AbstractEntityWindowBuilder.java`
#### Snippet
```java

    protected CommonDialogWindow getWindowForEntity(final T proxyEntity,
            final AbstractEntityWindowController<T, ?, ?> controller, final Component windowContent) {
        controller.populateWithData(proxyEntity);

```

### BoundedWildcard
Can generalize to `? extends SoftwareModule`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/providers/SoftwareModuleDataProvider.java`
#### Snippet
```java
    }

    private static Slice<AssignedSoftwareModule> mapToAssignedSoftwareModule(final Slice<SoftwareModule> smSlice) {
        return smSlice.map(sm -> new AssignedSoftwareModule(sm, false));
    }
```

### BoundedWildcard
Can generalize to `? extends QuerySortOrder`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/providers/AbstractGenericDataProvider.java`
#### Snippet
```java
    }

    private List<Order> convertToListOfOrders(final List<QuerySortOrder> querySortOrders) {
        return querySortOrders.stream()
                .map(querySortOrder -> convertToOrderCriteria(querySortOrder))
```

### BoundedWildcard
Can generalize to `? extends U`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/providers/AbstractMetaDataDataProvider.java`
#### Snippet
```java

    @Override
    protected Stream<ProxyMetaData> getProxyEntities(final Slice<U> backendEntities) {
        return backendEntities.stream().map(this::createProxyMetaData);
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/providers/AbstractProxyDataProvider.java`
#### Snippet
```java
     *            Sort
     */
    protected AbstractProxyDataProvider(final IdentifiableEntityToProxyIdentifiableEntityMapper<T, U> mapper,
            final Sort defaultSortOrder) {
        super(defaultSortOrder);
```

### BoundedWildcard
Can generalize to `? super U`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/providers/AbstractProxyDataProvider.java`
#### Snippet
```java
     *            Sort
     */
    protected AbstractProxyDataProvider(final IdentifiableEntityToProxyIdentifiableEntityMapper<T, U> mapper,
            final Sort defaultSortOrder) {
        super(defaultSortOrder);
```

### BoundedWildcard
Can generalize to `? extends U`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/providers/AbstractProxyDataProvider.java`
#### Snippet
```java

    @Override
    protected Stream<T> getProxyEntities(final Slice<U> backendEntities) {
        return backendEntities.stream().map(entityMapper::map);
    }
```

### BoundedWildcard
Can generalize to `? extends HeaderSupport`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/header/AbstractGridHeader.java`
#### Snippet
```java
    }

    protected void addHeaderSupports(final Collection<HeaderSupport> headerSupports) {
        headerSupports.forEach(this::addHeaderSupport);
    }
```

### BoundedWildcard
Can generalize to `? extends BreadcrumbLink`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/header/AbstractBreadcrumbGridHeader.java`
#### Snippet
```java
    protected abstract String getHeaderCaptionDetailsId();

    protected void addBreadcrumbLinks(final Collection<BreadcrumbLink> breadcrumbLinks) {
        breadcrumbLinks.forEach(this::addBreadcrumbLink);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/header/support/SearchHeaderSupport.java`
#### Snippet
```java
    public SearchHeaderSupport(final VaadinMessageSource i18n, final String searchFieldId,
            final String searchResetIconId, final Supplier<String> searchStateSupplier,
            final Consumer<String> searchByCallback) {
        this.i18n = i18n;

```

### BoundedWildcard
Can generalize to `? super M`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/MasterEntitySupport.java`
#### Snippet
```java
     *            Callback called after master entity change
     */
    public MasterEntitySupport(final FilterSupport<?, ?> filterSupport, final Function<M, ?> masterEntityToFilterMapper,
            final Consumer<M> postMasterChangeCallback) {
        this.filterSupport = filterSupport;
```

### BoundedWildcard
Can generalize to `? super M`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/MasterEntitySupport.java`
#### Snippet
```java
     */
    public MasterEntitySupport(final FilterSupport<?, ?> filterSupport, final Function<M, ?> masterEntityToFilterMapper,
            final Consumer<M> postMasterChangeCallback) {
        this.filterSupport = filterSupport;
        this.masterEntityToFilterMapper = masterEntityToFilterMapper;
```

### BoundedWildcard
Can generalize to `? extends ProxyDistributionSet`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/assignment/DistributionSetsToTagAssignmentSupport.java`
#### Snippet
```java

    @Override
    protected void publishTagAssignmentEvent(final List<ProxyDistributionSet> sourceItemsToAssign) {
        final List<Long> assignedDsIds = sourceItemsToAssign.stream().map(ProxyIdentifiableEntity::getId)
                .collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends ProxyDistributionSet`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/assignment/DistributionSetsToTagAssignmentSupport.java`
#### Snippet
```java
    @Override
    protected AbstractAssignmentResult<DistributionSet> toggleTagAssignment(
            final List<ProxyDistributionSet> sourceItems, final String tagName) {
        final Collection<Long> dsIdsToAssign = sourceItems.stream().map(ProxyDistributionSet::getId)
                .collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? super T`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/DeleteSupport.java`
#### Snippet
```java
     */
    public void setConfirmationQuestionDetailsGenerator(
            final Function<T, String> confirmationQuestionDetailsGenerator) {
        this.confirmationQuestionDetailsGenerator = confirmationQuestionDetailsGenerator;
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/DeleteSupport.java`
#### Snippet
```java
    public DeleteSupport(final Grid<T> grid, final VaadinMessageSource i18n, final UINotification notification,
            final String messageKeyEntityTypeSing, final String messageKeyEntityTypePlur,
            final Function<T, String> entityNameGenerator, final Predicate<Collection<T>> itemsDeletionCallback,
            final String deletionWindowId) {
        this.grid = grid;
```

### BoundedWildcard
Can generalize to `? super Collection`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/DeleteSupport.java`
#### Snippet
```java
    public DeleteSupport(final Grid<T> grid, final VaadinMessageSource i18n, final UINotification notification,
            final String messageKeyEntityTypeSing, final String messageKeyEntityTypePlur,
            final Function<T, String> entityNameGenerator, final Predicate<Collection<T>> itemsDeletionCallback,
            final String deletionWindowId) {
        this.grid = grid;
```

### BoundedWildcard
Can generalize to `? extends AssignmentSupport`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/DragAndDropSupport.java`
#### Snippet
```java
    public DragAndDropSupport(final AbstractGrid<T, ?> grid, final VaadinMessageSource i18n,
            final UINotification notification,
            final Map<String, AssignmentSupport<?, T>> sourceTargetAssignmentStrategies, final UIEventBus eventBus) {
        this.grid = grid;
        this.i18n = i18n;
```

### BoundedWildcard
Can generalize to `? extends ProxyTarget`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/assignment/TargetsToTagAssignmentSupport.java`
#### Snippet
```java

    @Override
    protected AbstractAssignmentResult<Target> toggleTagAssignment(final List<ProxyTarget> sourceItems,
            final String tagName) {
        final Collection<String> controllerIdsToAssign = sourceItems.stream().map(ProxyTarget::getControllerId)
```

### BoundedWildcard
Can generalize to `? extends ProxyTarget`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/assignment/TargetsToTagAssignmentSupport.java`
#### Snippet
```java

    @Override
    protected void publishTagAssignmentEvent(final List<ProxyTarget> sourceItemsToAssign) {
        final List<Long> assignedTargetIds = sourceItemsToAssign.stream().map(ProxyIdentifiableEntity::getId)
                .collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? super Long`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/SelectionSupport.java`
#### Snippet
```java
            final EventView view, final LongFunction<Optional<T>> mapIdToProxyEntityFunction,
            final Supplier<Long> selectedEntityIdUiStateProvider,
            final Consumer<Long> setSelectedEntityIdUiStateCallback) {
        this.grid = grid;
        this.eventBus = eventBus;
```

### BoundedWildcard
Can generalize to `? extends ProxyTarget`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/assignment/AbstractTargetsToTargetTypeAssignmentSupport.java`
#### Snippet
```java
    }

    protected void publishTypeAssignmentEvent(final List<ProxyTarget> sourceItemsToAssign) {
        final List<Long> assignedTargetIds = sourceItemsToAssign.stream().map(ProxyIdentifiableEntity::getId)
                .collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends ProxyTag`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/assignment/TagsAssignmentSupport.java`
#### Snippet
```java

    @Override
    protected void performAssignment(final List<ProxyTag> sourceItemsToAssign, final T targetItem) {

        // we are taking first tag because multi-tag assignment is
```

### BoundedWildcard
Can generalize to `? super T`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/PinSupport.java`
#### Snippet
```java
     *
     */
    public PinSupport(final Consumer<T> refreshItemCallback,
            final BiConsumer<PinBehaviourType, T> publishPinningChangedCallback,
            final Consumer<T> updatePinnedUiStateCallback, final Supplier<Optional<F>> getPinFilterCallback,
```

### BoundedWildcard
Can generalize to `? super PinBehaviourType`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/PinSupport.java`
#### Snippet
```java
     */
    public PinSupport(final Consumer<T> refreshItemCallback,
            final BiConsumer<PinBehaviourType, T> publishPinningChangedCallback,
            final Consumer<T> updatePinnedUiStateCallback, final Supplier<Optional<F>> getPinFilterCallback,
            final Consumer<F> updatePinFilterCallback, final Function<F, Collection<Long>> assignedIdsProvider,
```

### BoundedWildcard
Can generalize to `? super T`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/PinSupport.java`
#### Snippet
```java
     */
    public PinSupport(final Consumer<T> refreshItemCallback,
            final BiConsumer<PinBehaviourType, T> publishPinningChangedCallback,
            final Consumer<T> updatePinnedUiStateCallback, final Supplier<Optional<F>> getPinFilterCallback,
            final Consumer<F> updatePinFilterCallback, final Function<F, Collection<Long>> assignedIdsProvider,
```

### BoundedWildcard
Can generalize to `? super T`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/PinSupport.java`
#### Snippet
```java
    public PinSupport(final Consumer<T> refreshItemCallback,
            final BiConsumer<PinBehaviourType, T> publishPinningChangedCallback,
            final Consumer<T> updatePinnedUiStateCallback, final Supplier<Optional<F>> getPinFilterCallback,
            final Consumer<F> updatePinFilterCallback, final Function<F, Collection<Long>> assignedIdsProvider,
            final Function<F, Collection<Long>> installedIdsProvider) {
```

### BoundedWildcard
Can generalize to `? super F`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/PinSupport.java`
#### Snippet
```java
            final BiConsumer<PinBehaviourType, T> publishPinningChangedCallback,
            final Consumer<T> updatePinnedUiStateCallback, final Supplier<Optional<F>> getPinFilterCallback,
            final Consumer<F> updatePinFilterCallback, final Function<F, Collection<Long>> assignedIdsProvider,
            final Function<F, Collection<Long>> installedIdsProvider) {
        this.refreshItemCallback = refreshItemCallback;
```

### BoundedWildcard
Can generalize to `? super F`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/PinSupport.java`
#### Snippet
```java
            final BiConsumer<PinBehaviourType, T> publishPinningChangedCallback,
            final Consumer<T> updatePinnedUiStateCallback, final Supplier<Optional<F>> getPinFilterCallback,
            final Consumer<F> updatePinFilterCallback, final Function<F, Collection<Long>> assignedIdsProvider,
            final Function<F, Collection<Long>> installedIdsProvider) {
        this.refreshItemCallback = refreshItemCallback;
```

### BoundedWildcard
Can generalize to `? extends Collection`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/PinSupport.java`
#### Snippet
```java
            final BiConsumer<PinBehaviourType, T> publishPinningChangedCallback,
            final Consumer<T> updatePinnedUiStateCallback, final Supplier<Optional<F>> getPinFilterCallback,
            final Consumer<F> updatePinFilterCallback, final Function<F, Collection<Long>> assignedIdsProvider,
            final Function<F, Collection<Long>> installedIdsProvider) {
        this.refreshItemCallback = refreshItemCallback;
```

### BoundedWildcard
Can generalize to `? super F`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/PinSupport.java`
#### Snippet
```java
            final Consumer<T> updatePinnedUiStateCallback, final Supplier<Optional<F>> getPinFilterCallback,
            final Consumer<F> updatePinFilterCallback, final Function<F, Collection<Long>> assignedIdsProvider,
            final Function<F, Collection<Long>> installedIdsProvider) {
        this.refreshItemCallback = refreshItemCallback;

```

### BoundedWildcard
Can generalize to `? extends Collection`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/PinSupport.java`
#### Snippet
```java
            final Consumer<T> updatePinnedUiStateCallback, final Supplier<Optional<F>> getPinFilterCallback,
            final Consumer<F> updatePinFilterCallback, final Function<F, Collection<Long>> assignedIdsProvider,
            final Function<F, Collection<Long>> installedIdsProvider) {
        this.refreshItemCallback = refreshItemCallback;

```

### BoundedWildcard
Can generalize to `? extends ProxyTarget`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/assignment/TargetsToTargetTypeAssignmentSupport.java`
#### Snippet
```java
    }

    private AbstractAssignmentResult<Target> initiateTargetTypeAssignment(final List<ProxyTarget> sourceItems,
                                                                          final Long typeId) {
        final Collection<String> controllerIdsToAssign = sourceItems.stream().map(ProxyTarget::getControllerId)
```

### BoundedWildcard
Can generalize to `? extends ProxyTarget`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/assignment/TargetsToTargetTypeAssignmentSupport.java`
#### Snippet
```java
     * @return false if some targets already have a type assigned
     */
    private boolean isAssignmentValid(List<ProxyTarget> sourceItemsToAssign, ProxyTargetType targetItem) {
        if(sourceItemsToAssign.size() > 1) {
            List<ProxyTarget> targetsWithDifferentType = sourceItemsToAssign.stream().filter(
```

### BoundedWildcard
Can generalize to `? extends ProxyTag`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/assignment/TargetTagsToDistributionSetAssignmentSupport.java`
#### Snippet
```java

    @Override
    protected void performAssignment(final List<ProxyTag> sourceItemsToAssign, final ProxyDistributionSet targetItem) {
        // we are taking first tag because multi-tag assignment is
        // not supported
```

### BoundedWildcard
Can generalize to `? extends Target`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/assignment/TargetTagsToDistributionSetAssignmentSupport.java`
#### Snippet
```java
    }

    private static List<ProxyTarget> mapTargetsToProxyTargets(final List<Target> targetsToAssign) {
        // it is redundant to use TargetToProxyTargetMapper here
        return targetsToAssign.stream().map(target -> {
```

### BoundedWildcard
Can generalize to `? extends ProxyTargetType`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/assignment/TypeToTargetAssignmentSupport.java`
#### Snippet
```java
    }

    protected void publishTypeAssignmentEvent(final List<ProxyTargetType> sourceItemsToAssign) {
        final List<Long> assignedTargetIds = sourceItemsToAssign.stream().map(ProxyIdentifiableEntity::getId)
                .collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends ProxySoftwareModule`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/assignment/SwModulesToDistributionSetAssignmentSupport.java`
#### Snippet
```java
    }

    private void assignSwModulesToDistribution(final List<ProxySoftwareModule> swModules,
            final ProxyDistributionSet ds) {
        final Set<Long> swModuleIdsToAssign = swModules.stream().map(ProxySoftwareModule::getId)
```

### BoundedWildcard
Can generalize to `? extends ProxySoftwareModule`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/assignment/SwModulesToDistributionSetAssignmentSupport.java`
#### Snippet
```java

    @Override
    protected List<ProxySoftwareModule> getFilteredSourceItems(final List<ProxySoftwareModule> sourceItemsToAssign,
            final ProxyDistributionSet targetItem) {
        final DistributionSetType dsType = dsTypeManagement.get(targetItem.getTypeInfo().getId()).orElse(null);
```

### BoundedWildcard
Can generalize to `? extends ProxyTarget`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/assignment/TargetsToNoTargetTypeAssignmentSupport.java`
#### Snippet
```java
    }

    protected AbstractAssignmentResult<Target> initiateTargetTypeUnAssignment(final List<ProxyTarget> sourceItems) {
        final Collection<String> controllerIdsToAssign = sourceItems.stream().map(ProxyTarget::getControllerId)
                .collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? super JsonObject`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/selection/client/RangeSelectionHandler.java`
#### Snippet
```java
    }

    private static void selectSingleItemOnly(final SelectionModel<JsonObject> selectionModel, final JsonObject item) {
        selectionModel.deselectAll();
        selectionModel.select(item);
```

### BoundedWildcard
Can generalize to `? super JsonObject`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/selection/client/RangeSelectionHandler.java`
#### Snippet
```java
    }

    private void adaptSelectionByItem(final SelectionModel<JsonObject> selectionModel, final JsonObject item) {
        if (selectionModel.isSelected(item)) {
            selectionModel.deselect(item);
```

### BoundedWildcard
Can generalize to `? extends ProxyDistributionSet`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/assignment/DistributionSetsToTargetAssignmentSupport.java`
#### Snippet
```java
    }

    private boolean areSourceDsValid(final List<ProxyDistributionSet> sourceItemsToAssign) {
        return sourceItemsToAssign.stream().allMatch(this::isSourceDsValid);
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/event/TenantConfigChangedEventPayload.java`
#### Snippet
```java
     * instance of {@link Optional} contains the cast value. Otherwise, it's empty.
     */
    public <T> Optional<T> getValue(final Class<T> fromClass) {
        return fromClass.isInstance(value) ? Optional.of(fromClass.cast(value)) : Optional.empty();
    }
```

### BoundedWildcard
Can generalize to `? super BulkUploadEventPayload`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/BulkUploadChangedListener.java`
#### Snippet
```java
     */
    public BulkUploadChangedListener(final EventBus eventBus,
            final Consumer<BulkUploadEventPayload> bulkUploadCallback) {
        super(eventBus, EventTopics.BULK_UPLOAD_CHANGED);

```

### BoundedWildcard
Can generalize to `? super T`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/SelectGridEntityListener.java`
#### Snippet
```java
     */
    public SelectGridEntityListener(final UIEventBus eventBus, final EventLayoutViewAware layoutViewAware,
            final SelectionSupport<T> selectionSupport) {
        super(eventBus, CommandTopics.SELECT_GRID_ENTITY, layoutViewAware);

```

### BoundedWildcard
Can generalize to `? extends T`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/SelectGridEntityListener.java`
#### Snippet
```java

    @EventBusListenerMethod(scope = EventScope.UI)
    private void onSelectGridEntityEvent(final SelectionChangedEventPayload<T> eventPayload) {
        if (getLayoutViewAware().suitableViewLayout(eventPayload)) {
            selectionSupport.deselectAll();
```

### BoundedWildcard
Can generalize to `? extends VisibilityHandler`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/LayoutVisibilityListener.java`
#### Snippet
```java
     */
    public LayoutVisibilityListener(final UIEventBus eventBus, final EventViewAware viewAware,
            final Map<EventLayout, VisibilityHandler> layoutVisibilityHandlers) {
        super(eventBus, CommandTopics.CHANGE_LAYOUT_VISIBILITY, viewAware);

```

### BoundedWildcard
Can generalize to `? extends T`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/SelectionChangedListener.java`
#### Snippet
```java

    @EventBusListenerMethod(scope = EventScope.UI)
    private void onSelectionChangedEvent(final SelectionChangedEventPayload<T> eventPayload) {
        if (!getLayoutViewAware().suitableViewLayout(eventPayload)) {
            return;
```

### BoundedWildcard
Can generalize to `? extends MasterEntityAwareComponent`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/SelectionChangedListener.java`
#### Snippet
```java
     */
    public SelectionChangedListener(final UIEventBus eventBus, final EventLayoutViewAware layoutViewAware,
            final List<MasterEntityAwareComponent<T>> masterEntityAwareComponents) {
        super(eventBus, EventTopics.SELECTION_CHANGED, layoutViewAware);

```

### BoundedWildcard
Can generalize to `? super T`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/GenericEventListener.java`
#### Snippet
```java
     *            Event callback
     */
    public GenericEventListener(final UIEventBus eventBus, final String topic, final Consumer<T> eventCallback) {
        super(eventBus, topic);

```

### BoundedWildcard
Can generalize to `? extends F`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/PinningChangedListener.java`
#### Snippet
```java

    @EventBusListenerMethod(scope = EventScope.UI)
    private void onPinEvent(final PinningChangedEventPayload<F> eventPayload) {
        if (!suitableEntityType(eventPayload.getEntityType())) {
            return;
```

### BoundedWildcard
Can generalize to `? super F`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/PinningChangedListener.java`
#### Snippet
```java
     */
    public PinningChangedListener(final UIEventBus eventBus, final Class<? extends ProxyIdentifiableEntity> entityType,
            final PinSupport<? extends ProxyIdentifiableEntity, F> pinSupport, final Runnable updatePinCountInfo) {
        super(eventBus, EventTopics.PINNING_CHANGED);

```

### BoundedWildcard
Can generalize to `? extends ResizeHandler`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/LayoutResizeListener.java`
#### Snippet
```java
     */
    public LayoutResizeListener(final UIEventBus eventBus, final EventViewAware viewAware,
            final Map<EventLayout, ResizeHandler> layoutResizeHandlers) {
        super(eventBus, CommandTopics.RESIZE_LAYOUT, viewAware);

```

### BoundedWildcard
Can generalize to `? extends Target`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java
     * @return updated {@link Action}.
     */
    public List<Action> sendUpdateActionStatusToTargets(final Collection<Target> targets, final Status status,
            final Collection<String> msgs) {
        final List<Action> result = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends SoftwareModule`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java
     */
    public DistributionSet generateDistributionSet(final String name, final String version,
            final DistributionSetType type, final Collection<SoftwareModule> modules,
            final boolean requiredMigrationStep) {
        return entityFactory.distributionSet().create().name(name).version(version)
```

### BoundedWildcard
Can generalize to `? extends SoftwareModuleType`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java
     */
    public DistributionSetType findOrCreateDistributionSetType(final String dsTypeKey, final String dsTypeName,
            final Collection<SoftwareModuleType> mandatory, final Collection<SoftwareModuleType> optional) {
        return distributionSetTypeManagement.getByKey(dsTypeKey)
                .orElseGet(() -> distributionSetTypeManagement.create(entityFactory.distributionSetType().create()
```

### BoundedWildcard
Can generalize to `? extends SoftwareModuleType`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java
     */
    public DistributionSetType findOrCreateDistributionSetType(final String dsTypeKey, final String dsTypeName,
            final Collection<SoftwareModuleType> mandatory, final Collection<SoftwareModuleType> optional) {
        return distributionSetTypeManagement.getByKey(dsTypeKey)
                .orElseGet(() -> distributionSetTypeManagement.create(entityFactory.distributionSetType().create()
```

### BoundedWildcard
Can generalize to `? extends DistributionSetType`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java
     * @return persisted {@link TargetType}
     */
    public TargetType createTargetType(final String targetTypeName, final List<DistributionSetType> compatibleDsTypes) {
        return targetTypeManagement.create(entityFactory.targetType().create().name(targetTypeName)
                .description(targetTypeName + " description").colour(DEFAULT_COLOUR)
```

### BoundedWildcard
Can generalize to `? extends SoftwareModule`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java
     */
    public DistributionSet createDistributionSet(final String name, final String version,
            final DistributionSetType type, final Collection<SoftwareModule> modules) {
        return distributionSetManagement.create(entityFactory.distributionSet().create().name(name).version(version)
                .description(randomDescriptionShort()).type(type)
```

### BoundedWildcard
Can generalize to `? extends SoftwareModule`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java
     */
    public DistributionSet createDistributionSet(final String prefix, final String version,
            final boolean isRequiredMigrationStep, final Collection<SoftwareModule> modules) {

        return distributionSetManagement.create(
```

### BoundedWildcard
Can generalize to `? extends DistributionSetTag`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java
     */
    public DistributionSet createDistributionSet(final String prefix, final String version,
            final Collection<DistributionSetTag> tags) {

        final DistributionSet set = createDistributionSet(prefix, version, false);
```

### BoundedWildcard
Can generalize to `? extends EntityModifiedAwareSupport`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/EntityModifiedListener.java`
#### Snippet
```java
            final Class<? extends ProxyIdentifiableEntity> parentEntityType,
            final Supplier<Optional<Long>> parentEntityIdProvider, final EventViewAware viewAware,
            final List<EntityModifiedAwareSupport> entityModifiedAwareSupports) {
        super(eventBus, EventTopics.ENTITY_MODIFIED, viewAware);

```

### BoundedWildcard
Can generalize to `? super EntityModifiedAwareSupport`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/EntityModifiedListener.java`
#### Snippet
```java
    }

    private void handleEntitiesModified(final Consumer<EntityModifiedAwareSupport> handler) {
        UI.getCurrent().access(() -> entityModifiedAwareSupports.forEach(handler::accept));
    }
```

### BoundedWildcard
Can generalize to `? extends ActionProperties`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageDispatcherService.java`
#### Snippet
```java
    }

    private void sendBatchUpdateMessage(final Map<String, ActionProperties> actions, final List<Target> targets,
            final Map<SoftwareModule, List<SoftwareModuleMetadata>> modules) {

```

### BoundedWildcard
Can generalize to `? extends Target`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageDispatcherService.java`
#### Snippet
```java
    }

    private void sendBatchUpdateMessage(final Map<String, ActionProperties> actions, final List<Target> targets,
            final Map<SoftwareModule, List<SoftwareModuleMetadata>> modules) {

```

### BoundedWildcard
Can generalize to `? extends SoftwareModuleMetadata`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageDispatcherService.java`
#### Snippet
```java
    }

    private List<DmfMetadata> convertMetadata(final List<SoftwareModuleMetadata> metadata) {
        return metadata.stream().map(md -> new DmfMetadata(md.getKey(), md.getValue())).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? super Collection`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageDispatcherService.java`
#### Snippet
```java

    private static <T, R> List<R> partitionedParallelExecution(final Collection<T> controllerIds,
            final Function<Collection<T>, List<R>> loadingFunction) {
        // Ensure not exceeding the max value of MAX_PROCESSING_SIZE
        if (controllerIds.size() > MAX_PROCESSING_SIZE) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageDispatcherService.java`
#### Snippet
```java

    private static <T, R> List<R> partitionedParallelExecution(final Collection<T> controllerIds,
            final Function<Collection<T>, List<R>> loadingFunction) {
        // Ensure not exceeding the max value of MAX_PROCESSING_SIZE
        if (controllerIds.size() > MAX_PROCESSING_SIZE) {
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageDispatcherService.java`
#### Snippet
```java
    }

    private List<DmfArtifact> convertArtifacts(final Target target, final List<Artifact> localArtifacts) {
        if (localArtifacts.isEmpty()) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends Action`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageDispatcherService.java`
#### Snippet
```java
    }

    protected void sendMultiActionRequestToTarget(final String tenant, final Target target, final List<Action> actions,
            final Function<Action, Map<SoftwareModule, List<SoftwareModuleMetadata>>> getSoftwareModuleMetaData) {

```

### BoundedWildcard
Can generalize to `? super F`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/FilterSupport.java`
#### Snippet
```java
     *            Generic
     */
    public <R> void updateFilter(final BiConsumer<F, R> setter, final R filterValue) {
        if (setter != null) {
            setter.accept(entityFilter, filterValue);
```

### BoundedWildcard
Can generalize to `? super Action`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageDispatcherService.java`
#### Snippet
```java

    protected void sendMultiActionRequestToTarget(final String tenant, final Target target, final List<Action> actions,
            final Function<Action, Map<SoftwareModule, List<SoftwareModuleMetadata>>> getSoftwareModuleMetaData) {

        final URI targetAddress = target.getAddress();
```

### BoundedWildcard
Can generalize to `? extends Map`>
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageDispatcherService.java`
#### Snippet
```java

    protected void sendMultiActionRequestToTarget(final String tenant, final Target target, final List<Action> actions,
            final Function<Action, Map<SoftwareModule, List<SoftwareModuleMetadata>>> getSoftwareModuleMetaData) {

        final URI targetAddress = target.getAddress();
```

### BoundedWildcard
Can generalize to `? extends SoftwareModule`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageDispatcherService.java`
#### Snippet
```java

    private DmfSoftwareModule convertToAmqpSoftwareModule(final Target target,
            final Entry<SoftwareModule, List<SoftwareModuleMetadata>> entry) {
        final DmfSoftwareModule amqpSoftwareModule = new DmfSoftwareModule();
        amqpSoftwareModule.setModuleId(entry.getKey().getId());
```

### BoundedWildcard
Can generalize to `? extends List`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageDispatcherService.java`
#### Snippet
```java

    private DmfSoftwareModule convertToAmqpSoftwareModule(final Target target,
            final Entry<SoftwareModule, List<SoftwareModuleMetadata>> entry) {
        final DmfSoftwareModule amqpSoftwareModule = new DmfSoftwareModule();
        amqpSoftwareModule.setModuleId(entry.getKey().getId());
```

### BoundedWildcard
Can generalize to `? super T`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/ShowEntityFormLayoutListener.java`
#### Snippet
```java
    public ShowEntityFormLayoutListener(final UIEventBus eventBus, final Class<T> entityType,
            final Class<? extends ProxyIdentifiableEntity> parentEntityType, final EventLayoutViewAware layoutViewAware,
            final Runnable addFormCallback, final Consumer<T> updateFormCallback) {
        super(eventBus, CommandTopics.SHOW_ENTITY_FORM_LAYOUT, layoutViewAware);

```

### BoundedWildcard
Can generalize to `? extends T`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/ShowEntityFormLayoutListener.java`
#### Snippet
```java

    @EventBusListenerMethod(scope = EventScope.UI)
    private void onShowFormEvent(final ShowFormEventPayload<T> eventPayload) {
        if (!suitableEntityType(eventPayload.getEntityType())
                || !suitableParentEntityType(eventPayload.getParentEntityType())
```

### BoundedWildcard
Can generalize to `? super Collection`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/support/EntityModifiedGridRefreshAwareSupport.java`
#### Snippet
```java
     */
    public EntityModifiedGridRefreshAwareSupport(final Runnable refreshGridCallback,
            final Consumer<Collection<Long>> refreshGridItemsCallback) {
        this.refreshGridCallback = refreshGridCallback;
        this.refreshGridItemsCallback = refreshGridItemsCallback;
```

### BoundedWildcard
Can generalize to `? super T`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/support/EntityModifiedSelectionAwareSupport.java`
#### Snippet
```java
     */
    public EntityModifiedSelectionAwareSupport(final SelectionSupport<T> selectionSupport,
            final LongFunction<Optional<T>> getFromBackendCallback, final Predicate<T> shouldDeselectCallback,
            final LongConsumer selectedEntityDeletedCallback) {
        this.selectionSupport = selectionSupport;
```

### BoundedWildcard
Can generalize to `? super TenantConfigChangedEventPayload`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/TenantConfigChangedListener.java`
#### Snippet
```java
    TenantConfigChangedListener(final UIEventBus eventBus, final String tenantFilter,
            final Collection<String> tenantConfigFilter,
            final Consumer<TenantConfigChangedEventPayload> onApplicationScope,
            final Consumer<TenantConfigChangedEventPayload> onUiScope) {
        super(eventBus, EventTopics.TENANT_CONFIG_CHANGED);
```

### BoundedWildcard
Can generalize to `? super TenantConfigChangedEventPayload`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/TenantConfigChangedListener.java`
#### Snippet
```java
            final Collection<String> tenantConfigFilter,
            final Consumer<TenantConfigChangedEventPayload> onApplicationScope,
            final Consumer<TenantConfigChangedEventPayload> onUiScope) {
        super(eventBus, EventTopics.TENANT_CONFIG_CHANGED);

```

### BoundedWildcard
Can generalize to `? super T`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/support/EntityModifiedPinAwareSupport.java`
#### Snippet
```java
    public EntityModifiedPinAwareSupport(final PinSupport<T, ?> pinSupport,
            final boolean shouldUpdatePinStylingOnUpdate, final boolean shouldReApplyPinningOnUpdate,
            final LongFunction<Optional<T>> getFromBackendCallback, final Predicate<T> shouldUnpinnOnUpdateCallback) {
        this.pinSupport = pinSupport;

```

### BoundedWildcard
Can generalize to `? extends ProxyTag`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/tagdetails/TagAssignementComboBox.java`
#### Snippet
```java
     *            assignable tags
     */
    void initializeAssignableTags(final List<ProxyTag> assignableTags) {
        allAssignableTags.addAll(assignableTags);
        assignableTagsComboBox.getDataProvider().refreshAll();
```

### BoundedWildcard
Can generalize to `? extends ProxyTag`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/tagdetails/TagPanelLayout.java`
#### Snippet
```java
     *            assigned tags
     */
    void initializeTags(final List<ProxyTag> allTags, final List<ProxyTag> assignedTags) {
        assignableTagsComboBox.removeAllTags();
        assignedTagField.removeAllTags();
```

### BoundedWildcard
Can generalize to `? super Collection`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/support/EntityModifiedGenericSupport.java`
#### Snippet
```java
     *            Entities deleted callback event
     */
    public EntityModifiedGenericSupport(final Consumer<Collection<Long>> onEntitiesAddedCallback,
            final Consumer<Collection<Long>> onEntitiesUpdatedCallback,
            final Consumer<Collection<Long>> onEntitiesDeletedCallback) {
```

### BoundedWildcard
Can generalize to `? super Collection`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/support/EntityModifiedGenericSupport.java`
#### Snippet
```java
     */
    public EntityModifiedGenericSupport(final Consumer<Collection<Long>> onEntitiesAddedCallback,
            final Consumer<Collection<Long>> onEntitiesUpdatedCallback,
            final Consumer<Collection<Long>> onEntitiesDeletedCallback) {
        this.onEntitiesAddedCallback = onEntitiesAddedCallback;
```

### BoundedWildcard
Can generalize to `? super Collection`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/support/EntityModifiedGenericSupport.java`
#### Snippet
```java
    public EntityModifiedGenericSupport(final Consumer<Collection<Long>> onEntitiesAddedCallback,
            final Consumer<Collection<Long>> onEntitiesUpdatedCallback,
            final Consumer<Collection<Long>> onEntitiesDeletedCallback) {
        this.onEntitiesAddedCallback = onEntitiesAddedCallback;
        this.onEntitiesUpdatedCallback = onEntitiesUpdatedCallback;
```

### BoundedWildcard
Can generalize to `? extends ProxyTag`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/tagdetails/TagListField.java`
#### Snippet
```java
     *            assigned tags
     */
    void initializeAssignedTags(final List<ProxyTag> assignedTags) {
        removeAllComponents();

```

### BoundedWildcard
Can generalize to `? super ProxyTargetType`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/filterlayout/TargetTypeFilterButtonClick.java`
#### Snippet
```java
     */
    public TargetTypeFilterButtonClick(
            final BiConsumer<ProxyTargetType, ClickBehaviourType> filterChangedCallback) {
        this.filterChangedCallback = filterChangedCallback;
        this.noTargetTypeBtnClicked = false;
```

### BoundedWildcard
Can generalize to `? super ClickBehaviourType`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/filterlayout/TargetTypeFilterButtonClick.java`
#### Snippet
```java
     */
    public TargetTypeFilterButtonClick(
            final BiConsumer<ProxyTargetType, ClickBehaviourType> filterChangedCallback) {
        this.filterChangedCallback = filterChangedCallback;
        this.noTargetTypeBtnClicked = false;
```

### BoundedWildcard
Can generalize to `? super Map`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/filterlayout/TagFilterButtonClick.java`
#### Snippet
```java
    private final transient Consumer<ClickBehaviourType> noTagChangedCallback;

    TagFilterButtonClick(final Consumer<Map<Long, String>> filterChangedCallback,
            final Consumer<ClickBehaviourType> noTagChangedCallback) {
        this.filterChangedCallback = filterChangedCallback;
```

### BoundedWildcard
Can generalize to `? super ClickBehaviourType`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/filterlayout/TagFilterButtonClick.java`
#### Snippet
```java

    TagFilterButtonClick(final Consumer<Map<Long, String>> filterChangedCallback,
            final Consumer<ClickBehaviourType> noTagChangedCallback) {
        this.filterChangedCallback = filterChangedCallback;
        this.noTagChangedCallback = noTagChangedCallback;
```

### BoundedWildcard
Can generalize to `? super ProxyType`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/filterlayout/TypeFilterButtonClick.java`
#### Snippet
```java
     *          Callback event of ClickBehaviourType
     */
    public TypeFilterButtonClick(final BiConsumer<ProxyType, ClickBehaviourType> filterChangedCallback) {
        this.filterChangedCallback = filterChangedCallback;
    }
```

### BoundedWildcard
Can generalize to `? super ClickBehaviourType`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/filterlayout/TypeFilterButtonClick.java`
#### Snippet
```java
     *          Callback event of ClickBehaviourType
     */
    public TypeFilterButtonClick(final BiConsumer<ProxyType, ClickBehaviourType> filterChangedCallback) {
        this.filterChangedCallback = filterChangedCallback;
    }
```

### BoundedWildcard
Can generalize to `? extends ProxyType`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/filterlayout/AbstractTypeFilterButtons.java`
#### Snippet
```java

    @Override
    protected boolean deleteFilterButtons(final Collection<ProxyType> filterButtonsToDelete) {
        // We do not allow multiple deletion yet
        final ProxyType typeToDelete = filterButtonsToDelete.iterator().next();
```

### BoundedWildcard
Can generalize to `? extends ProxyTag`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/filterlayout/AbstractTagFilterButtons.java`
#### Snippet
```java

    @Override
    protected boolean deleteFilterButtons(final Collection<ProxyTag> filterButtonsToDelete) {
        // We do not allow multiple deletion of tags yet
        final ProxyTag tagToDelete = filterButtonsToDelete.iterator().next();
```

### BoundedWildcard
Can generalize to `? super ProxyMetaData`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/detailslayout/AddMetaDataWindowController.java`
#### Snippet
```java
     */
    public AddMetaDataWindowController(final CommonUiDependencies uiDependencies,
            final MetaDataAddUpdateWindowLayout layout, final Function<ProxyMetaData, MetaData> createMetaDataCallback,
            final Predicate<String> duplicateCheckCallback) {
        super(uiDependencies);
```

### BoundedWildcard
Can generalize to `? extends MetaData`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/detailslayout/AddMetaDataWindowController.java`
#### Snippet
```java
     */
    public AddMetaDataWindowController(final CommonUiDependencies uiDependencies,
            final MetaDataAddUpdateWindowLayout layout, final Function<ProxyMetaData, MetaData> createMetaDataCallback,
            final Predicate<String> duplicateCheckCallback) {
        super(uiDependencies);
```

### BoundedWildcard
Can generalize to `? super String`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/detailslayout/AddMetaDataWindowController.java`
#### Snippet
```java
    public AddMetaDataWindowController(final CommonUiDependencies uiDependencies,
            final MetaDataAddUpdateWindowLayout layout, final Function<ProxyMetaData, MetaData> createMetaDataCallback,
            final Predicate<String> duplicateCheckCallback) {
        super(uiDependencies);

```

### BoundedWildcard
Can generalize to `? super F`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/detailslayout/AbstractMetaDataWindowBuilder.java`
#### Snippet
```java
    }

    protected Window getWindowForShowMetaData(final AbstractMetaDataWindowLayout<F> metaDataWindowLayout,
            final F selectedEntityFilter, final String selectedEntityName, final ProxyMetaData proxyMetaData) {
        final CommonDialogWindow window = createWindow(metaDataWindowLayout, null);
```

### BoundedWildcard
Can generalize to `? super ProxyMetaData`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/detailslayout/UpdateMetaDataWindowController.java`
#### Snippet
```java
     */
    public UpdateMetaDataWindowController(final CommonUiDependencies uiDependencies,
            final MetaDataAddUpdateWindowLayout layout, final Function<ProxyMetaData, MetaData> updateMetaDataCallback,
            final Predicate<String> duplicateCheckCallback) {
        super(uiDependencies);
```

### BoundedWildcard
Can generalize to `? extends MetaData`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/detailslayout/UpdateMetaDataWindowController.java`
#### Snippet
```java
     */
    public UpdateMetaDataWindowController(final CommonUiDependencies uiDependencies,
            final MetaDataAddUpdateWindowLayout layout, final Function<ProxyMetaData, MetaData> updateMetaDataCallback,
            final Predicate<String> duplicateCheckCallback) {
        super(uiDependencies);
```

### BoundedWildcard
Can generalize to `? super String`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/detailslayout/UpdateMetaDataWindowController.java`
#### Snippet
```java
    public UpdateMetaDataWindowController(final CommonUiDependencies uiDependencies,
            final MetaDataAddUpdateWindowLayout layout, final Function<ProxyMetaData, MetaData> updateMetaDataCallback,
            final Predicate<String> duplicateCheckCallback) {
        super(uiDependencies);

```

### BoundedWildcard
Can generalize to `? extends Entry`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/detailslayout/AbstractGridDetailsLayout.java`
#### Snippet
```java
    protected abstract String getLogLabelIdPrefix();

    protected void addDetailsComponents(final Collection<Entry<String, Component>> detailsComponents) {
        this.detailsComponents.addAll(detailsComponents);
    }
```

### BoundedWildcard
Can generalize to `? super SaveDialogCloseListener`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/detailslayout/AbstractMetaDataWindowLayout.java`
#### Snippet
```java
     *            SaveDialogCloseListener
     */
    public void setSaveCallback(final Consumer<SaveDialogCloseListener> saveCallback) {
        this.saveCallback = saveCallback;
    }
```

### BoundedWildcard
Can generalize to `? extends ProxyMetaData`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/detailslayout/AbstractMetaDataWindowLayout.java`
#### Snippet
```java
    protected abstract MetaData doUpdateMetaData(final ProxyMetaData entity);

    protected boolean deleteMetaData(final Collection<ProxyMetaData> metaDataToDelete) {
        if (!StringUtils.isEmpty(masterEntityFilter) && !CollectionUtils.isEmpty(metaDataToDelete)) {
            // as of now we only allow deletion of single metadata entry
```

### BoundedWildcard
Can generalize to `? extends ProxyMetaData`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/detailslayout/MetaDataAddUpdateWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return Key textfield
     */
    public TextField createKeyField(final Binder<ProxyMetaData> binder) {
        final TextField keyField = new TextFieldBuilder(MetaData.KEY_MAX_SIZE)
                .id(UIComponentIdProvider.METADATA_KEY_FIELD_ID).caption(i18n.getMessage(TEXTFIELD_KEY))
```

### BoundedWildcard
Can generalize to `? extends ProxyMetaData`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/detailslayout/MetaDataAddUpdateWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return Target field CheckBox
     */
    public CheckBox createVisibleForTargetsField(final Binder<ProxyMetaData> binder) {
        return FormComponentBuilder.createCheckBox(i18n.getMessage(TARGET_VISIBLE),
                UIComponentIdProvider.METADATA_TARGET_VISIBLE_ID, binder, ProxyMetaData::isVisibleForTargets,
```

### BoundedWildcard
Can generalize to `? extends ProxyMetaData`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/detailslayout/MetaDataAddUpdateWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return Value textarea
     */
    public TextArea createValueField(final Binder<ProxyMetaData> binder) {
        final TextArea valueField = new TextAreaBuilder(MetaData.VALUE_MAX_SIZE)
                .id(UIComponentIdProvider.METADATA_VALUE_ID).caption(i18n.getMessage(TEXTFIELD_VALUE))
```

### BoundedWildcard
Can generalize to `? super ProxyMetaData`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/detailslayout/MetadataDetailsGrid.java`
#### Snippet
```java
     */
    public MetadataDetailsGrid(final VaadinMessageSource i18n, final UIEventBus eventBus, final String typePrefix,
            final Consumer<ProxyMetaData> showMetadataDetailsCallback,
            final AbstractMetaDataDataProvider<?, F> metaDataDataProvider) {
        super(i18n, eventBus);
```

### BoundedWildcard
Can generalize to `? extends SoftwareModule`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/detailslayout/SoftwareModuleDetailsGrid.java`
#### Snippet
```java
    }

    private static List<ProxySoftwareModuleDetails> getSmDetailsByType(final Collection<SoftwareModule> softwareModules,
            final SoftwareModuleType type, final boolean isMandatory) {
        final List<ProxySoftwareModuleDetails> smDetails = softwareModules.stream()
```

### BoundedWildcard
Can generalize to `? extends ProxyDistributionSet`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/distributionset/AbstractDsGrid.java`
#### Snippet
```java
    }

    private boolean deleteDistributionSets(final Collection<ProxyDistributionSet> setsToBeDeleted) {
        final Collection<Long> dsToBeDeletedIds = setsToBeDeleted.stream().map(ProxyIdentifiableEntity::getId)
                .collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/layouts/AbstractRolloutWindowLayout.java`
#### Snippet
```java

    @Override
    public void addValidationListener(final Consumer<Boolean> validationCallback) {
        this.validationCallback = validationCallback;

```

### BoundedWildcard
Can generalize to `? extends ValidatableLayout`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/layouts/AbstractRolloutWindowLayout.java`
#### Snippet
```java
    }

    protected void addValidatableLayouts(final Collection<ValidatableLayout> validatableLayouts) {
        validatableLayouts.forEach(this::addValidatableLayout);
    }
```

### BoundedWildcard
Can generalize to `? extends ProxyAdvancedRolloutGroup`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/components/VisualGroupDefinitionLayout.java`
#### Snippet
```java
     */
    public void setAdvancedRolloutGroupDefinitions(
            final List<ProxyAdvancedRolloutGroup> advancedRolloutGroupDefinitions) {
        this.advancedRolloutGroupDefinitions = advancedRolloutGroupDefinitions;

```

### BoundedWildcard
Can generalize to `? extends Column`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/GridComponentBuilder.java`
#### Snippet
```java
     */
    public static void joinToIconColumn(final HeaderRow headerRow, final String headerCaption,
            final List<Column<?, ?>> columns) {
        columns.forEach(column -> {
            column.setWidth(30D);
```

### BoundedWildcard
Can generalize to `? extends StyleGenerator`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/GridComponentBuilder.java`
#### Snippet
```java
    }

    private static <T> StyleGenerator<T> merge(final Collection<StyleGenerator<T>> generators) {
        return item -> generators.stream().filter(Objects::nonNull).map(gen -> gen.apply(item)).filter(Objects::nonNull)
                .collect(Collectors.joining(" "));
```

### BoundedWildcard
Can generalize to `? super E`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/GridComponentBuilder.java`
#### Snippet
```java
     */
    public static <E extends ProxyIdentifiableEntity> Column<E, Button> addDeleteColumn(final Grid<E> grid,
            final VaadinMessageSource i18n, final String columnId, final DeleteSupport<E> deleteSupport,
            final String buttonIdPrefix, final Predicate<E> buttonEnabled) {
        final ValueProvider<E, Button> getDelButton = entity -> buildActionButton(i18n,
```

### BoundedWildcard
Can generalize to `? super E`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/GridComponentBuilder.java`
#### Snippet
```java
    public static <E extends ProxyIdentifiableEntity> Column<E, Button> addDeleteColumn(final Grid<E> grid,
            final VaadinMessageSource i18n, final String columnId, final DeleteSupport<E> deleteSupport,
            final String buttonIdPrefix, final Predicate<E> buttonEnabled) {
        final ValueProvider<E, Button> getDelButton = entity -> buildActionButton(i18n,
                clickEvent -> deleteSupport.openConfirmationWindowDeleteAction(entity), VaadinIcons.TRASH,
```

### BoundedWildcard
Can generalize to `? extends ProxyAdvancedRolloutGroup`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/components/AdvancedGroupsLayout.java`
#### Snippet
```java

    private List<RolloutGroupCreate> getRolloutGroupsCreateFromDefinitions(
            final List<ProxyAdvancedRolloutGroup> advancedRolloutGroupDefinitions) {
        final AdvancedRolloutGroupDefinitionToCreateMapper mapper = new AdvancedRolloutGroupDefinitionToCreateMapper(
                entityFactory);
```

### BoundedWildcard
Can generalize to `? super List`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/components/AdvancedGroupsLayout.java`
#### Snippet
```java
     */
    public void setAdvancedGroupDefinitionsChangedListener(
            final BiConsumer<List<ProxyAdvancedRolloutGroup>, Boolean> advancedGroupDefinitionsChangedListener) {
        this.advancedGroupDefinitionsChangedListener = advancedGroupDefinitionsChangedListener;
    }
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/components/AdvancedGroupsLayout.java`
#### Snippet
```java
     */
    public void setAdvancedGroupDefinitionsChangedListener(
            final BiConsumer<List<ProxyAdvancedRolloutGroup>, Boolean> advancedGroupDefinitionsChangedListener) {
        this.advancedGroupDefinitionsChangedListener = advancedGroupDefinitionsChangedListener;
    }
```

### BoundedWildcard
Can generalize to `? extends ProxyAdvancedRolloutGroup`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/components/AdvancedGroupsLayout.java`
#### Snippet
```java
     *            the rollout groups
     */
    public void populateByAdvancedRolloutGroupDefinitions(final List<ProxyAdvancedRolloutGroup> groups) {
        if (CollectionUtils.isEmpty(groups)) {
            return;
```

### BoundedWildcard
Can generalize to `? super ProxyDistributionSet`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/components/RolloutFormLayout.java`
#### Snippet
```java
     *            Changed listener
     */
    public void setDistSetChangedListener(final Consumer<ProxyDistributionSet> distSetChangedListener) {
        this.distSetChangedListener = distSetChangedListener;
    }
```

### BoundedWildcard
Can generalize to `? super ProxyTargetFilterQuery`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/components/RolloutFormLayout.java`
#### Snippet
```java
     *            Changed listener
     */
    public void setFilterQueryChangedListener(final Consumer<ProxyTargetFilterQuery> filterQueryChangedListener) {
        this.filterQueryChangedListener = filterQueryChangedListener;
    }
```

### BoundedWildcard
Can generalize to `? extends ProxyAdvancedRolloutGroup`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/controllers/AddRolloutWindowController.java`
#### Snippet
```java

    private List<RolloutGroupCreate> getRolloutGroupsCreateFromDefinitions(
            final List<ProxyAdvancedRolloutGroup> advancedRolloutGroupDefinitions) {
        final AdvancedRolloutGroupDefinitionToCreateMapper mapper = new AdvancedRolloutGroupDefinitionToCreateMapper(
                getEntityFactory());
```

### BoundedWildcard
Can generalize to `? super T`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/StatusIconBuilder.java`
#### Snippet
```java
        protected EntityStatusIconBuilderWithGenetaredTooltip(final VaadinMessageSource i18n, final Class<T> statusType,
                final Function<E, T> getEntityStatus, final String labelIdPrefix,
                final Function<T, String> tooltipGenerator) {
            super(i18n, statusType, getEntityStatus, labelIdPrefix);
            this.tooltipGenerator = tooltipGenerator;
```

### BoundedWildcard
Can generalize to `? extends ProxyType`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/smtype/SmTypeWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return RadioButtonGroup of software module type assignment
     */
    public RadioButtonGroup<SmTypeAssign> createSmTypeAssignOptionGroup(final Binder<ProxyType> binder) {
        final RadioButtonGroup<SmTypeAssign> smTypeAssignOptionGroup = new RadioButtonGroup<>();
        smTypeAssignOptionGroup.setId(UIComponentIdProvider.ASSIGN_OPTION_GROUP_SOFTWARE_MODULE_TYPE_ID);
```

### BoundedWildcard
Can generalize to `? extends Html5File`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/UploadDropAreaLayout.java`
#### Snippet
```java
        }

        private void uploadFilesForSoftwareModule(final Collection<Html5File> files, final Long softwareModuleId) {
            final SoftwareModule softwareModule = softwareManagement.get(softwareModuleId).orElse(null);

```

### BoundedWildcard
Can generalize to `? extends ProxyRollout`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/rollout/RolloutGrid.java`
#### Snippet
```java
    }

    private boolean deleteRollout(final Collection<ProxyRollout> rolloutsToBeDeleted) {
        final Collection<Long> rolloutToBeDeletedIds = rolloutsToBeDeleted.stream().map(ProxyIdentifiableEntity::getId)
                .collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? super ProxyTargetFilterQuery`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/FormComponentBuilder.java`
#### Snippet
```java
     */
    public static <T extends TargetFilterQueryAware> BoundComponent<ComboBox<ProxyTargetFilterQuery>> createTargetFilterQueryCombo(
            final Binder<T> binder, final Validator<ProxyTargetFilterQuery> validator,
            final TargetFilterQueryDataProvider dataProvider, final VaadinMessageSource i18n,
            final String componentId) {
```

### BoundedWildcard
Can generalize to `? super String`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/FormComponentBuilder.java`
#### Snippet
```java
     */
    public static <T extends TypeInfoAware> BoundComponent<ComboBox<ProxyTypeInfo>> createTypeCombo(
            final Binder<T> binder, final AbstractProxyDataProvider<ProxyTypeInfo, ?, String> dataProvider,
            final VaadinMessageSource i18n, final String componentId, final boolean isRequired) {
        final ComboBox<ProxyTypeInfo> typeCombo = SPUIComponentProvider.getComboBox(componentId,
```

### BoundedWildcard
Can generalize to `? extends ProxyType`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/FormComponentBuilder.java`
#### Snippet
```java
     * @return text field
     */
    public static TextField createTypeKeyField(final Binder<ProxyType> binder, final VaadinMessageSource i18n) {
        final TextField typeKey = new TextFieldBuilder(Type.KEY_MAX_SIZE).id(UIComponentIdProvider.TYPE_POPUP_KEY)
                .caption(i18n.getMessage("textfield.key")).prompt(i18n.getMessage("textfield.key"))
```

### BoundedWildcard
Can generalize to `? extends ProxyArtifact`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/details/ArtifactDetailsGrid.java`
#### Snippet
```java
    }

    private boolean artifactsDeletionCallback(final Collection<ProxyArtifact> artifactsToBeDeleted) {
        final Collection<Long> artifactToBeDeletedIds = artifactsToBeDeleted.stream()
                .map(ProxyIdentifiableEntity::getId).collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends ProxySoftwareModule`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/smtable/SmWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return input component
     */
    public TextArea createDescription(final Binder<ProxySoftwareModule> binder) {
        return FormComponentBuilder
                .createDescriptionInput(binder, i18n, UIComponentIdProvider.ADD_SW_MODULE_DESCRIPTION).getComponent();
```

### BoundedWildcard
Can generalize to `? extends ProxySoftwareModule`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/smtable/SmWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return input component
     */
    public TextField createVersionField(final Binder<ProxySoftwareModule> binder) {
        return FormComponentBuilder.createVersionInput(binder, i18n, UIComponentIdProvider.SOFT_MODULE_VERSION)
                .getComponent();
```

### BoundedWildcard
Can generalize to `? extends ProxySoftwareModule`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/smtable/SmWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return input component
     */
    public ComboBox<ProxyTypeInfo> createSoftwareModuleTypeCombo(final Binder<ProxySoftwareModule> binder) {
        return FormComponentBuilder
                .createTypeCombo(binder, smTypeDataProvider, i18n, UIComponentIdProvider.SW_MODULE_TYPE, true)
```

### BoundedWildcard
Can generalize to `? extends ProxySoftwareModule`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/smtable/SmWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return input component
     */
    public TextField createVendorField(final Binder<ProxySoftwareModule> binder) {
        final TextField smVendor = new TextFieldBuilder(SoftwareModule.VENDOR_MAX_SIZE)
                .id(UIComponentIdProvider.SOFT_MODULE_VENDOR).caption(i18n.getMessage(TEXTFIELD_VENDOR))
```

### BoundedWildcard
Can generalize to `? extends ProxySoftwareModule`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/smtable/SmWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return input component
     */
    public CheckBox createArtifactEncryptionCheck(final Binder<ProxySoftwareModule> binder) {
        return FormComponentBuilder.createCheckBox(i18n.getMessage(ARTIFACT_ENCRYPTION),
                UIComponentIdProvider.ARTIFACT_ENCRYPTION_ID, binder, ProxySoftwareModule::isEncrypted,
```

### BoundedWildcard
Can generalize to `? extends ProxySoftwareModule`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/smtable/SmWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return input component
     */
    public TextField createNameField(final Binder<ProxySoftwareModule> binder) {
        return FormComponentBuilder.createNameInput(binder, i18n, UIComponentIdProvider.SOFT_MODULE_NAME)
                .getComponent();
```

### BoundedWildcard
Can generalize to `? extends EntityModifiedEventPayload`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/components/NotificationUnreadButton.java`
#### Snippet
```java

    private Label buildEventNotificationLabel(
            final Entry<EventNotificationType, EntityModifiedEventPayload> remotelyOriginatedEvent) {
        final EventNotificationType notificationType = remotelyOriginatedEvent.getKey();
        final int modifiedEntitiesCount = remotelyOriginatedEvent.getValue().getEntityIds().size();
```

### BoundedWildcard
Can generalize to `? extends ProxySoftwareModule`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/smtable/SoftwareModuleGrid.java`
#### Snippet
```java
    }

    private boolean deleteSoftwareModules(final Collection<ProxySoftwareModule> swModulesToBeDeleted) {
        final Collection<Long> swModuleToBeDeletedIds = swModulesToBeDeleted.stream()
                .map(ProxyIdentifiableEntity::getId).collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends ProxyTarget`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/miscs/DeploymentAssignmentWindowController.java`
#### Snippet
```java
     *            to assign to the given targets
     */
    public void assignTargetsToDistributions(final List<ProxyTarget> proxyTargets,
            final List<ProxyDistributionSet> proxyDistributionSets) {

```

### BoundedWildcard
Can generalize to `? extends ProxyDistributionSet`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/miscs/DeploymentAssignmentWindowController.java`
#### Snippet
```java
     */
    public void assignTargetsToDistributions(final List<ProxyTarget> proxyTargets,
            final List<ProxyDistributionSet> proxyDistributionSets) {

        final ActionType actionType = proxyAssignmentWindow.getActionType();
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/dstable/InvalidateDsAffectedEntitiesDialog.java`
#### Snippet
```java
     */
    public InvalidateDsAffectedEntitiesDialog(final List<ProxyDistributionSet> allDistributionSetsForInvalidation,
            final VaadinMessageSource i18n, final Consumer<Boolean> callback,
            final DistributionSetInvalidationCount affectedEntities) {

```

### BoundedWildcard
Can generalize to `? extends ProxyDistributionSet`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/dstable/InvalidateDsAffectedEntitiesDialog.java`
#### Snippet
```java
    }

    private String createConsequencesText(final List<ProxyDistributionSet> allDistributionSetsForInvalidation) {
        String consequencesText = "";
        if (allDistributionSetsForInvalidation.size() == 1) {
```

### BoundedWildcard
Can generalize to `? extends ProxyAssignmentWindow`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/miscs/AssignmentWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return Maintenance timezone combobox
     */
    public ComboBox<String> createMaintenanceTimeZoneCombo(final Binder<ProxyAssignmentWindow> binder) {
        final ComboBox<String> maintenanceTimeZoneCombo = new ComboBox<>();

```

### BoundedWildcard
Can generalize to `? extends ProxyAssignmentWindow`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/miscs/AssignmentWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return Maintenance window checkbox
     */
    public CheckBox createEnableMaintenanceWindowToggle(final Binder<ProxyAssignmentWindow> binder) {
        final CheckBox maintenanceWindowToggle = FormComponentBuilder.createCheckBox(
                i18n.getMessage("caption.maintenancewindow.enabled"),
```

### BoundedWildcard
Can generalize to `? extends ProxyAssignmentWindow`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/miscs/AssignmentWindowLayoutComponentBuilder.java`
#### Snippet
```java
     */
    public BoundComponent<ActionTypeOptionGroupAssignmentLayout> createActionTypeOptionGroupLayout(
            final Binder<ProxyAssignmentWindow> binder) {
        final BoundComponent<ActionTypeOptionGroupAssignmentLayout> actionTypeGroupBounded = FormComponentBuilder
                .createActionTypeOptionGroupLayout(binder, i18n,
```

### BoundedWildcard
Can generalize to `? extends ProxyAssignmentWindow`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/miscs/AssignmentWindowLayoutComponentBuilder.java`
#### Snippet
```java
    }

    public CheckBox createConfirmationToggle(final Binder<ProxyAssignmentWindow> binder) {
        final CheckBox confirmationToggle = FormComponentBuilder.createCheckBox(
                i18n.getMessage(CAPTION_ACTION_CONFIRMATION_REQUIRED),
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/miscs/AssignmentWindowLayout.java`
#### Snippet
```java
     *          validation call back event
     */
    public void addValidationListener(final Consumer<Boolean> validationCallback) {
        proxyAssignmentBinder.addStatusChangeListener(event -> validationCallback.accept(event.getBinder().isValid()));
    }
```

### BoundedWildcard
Can generalize to `? extends ProxyDistributionSet`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/dstable/InvalidateDsConsequencesDialog.java`
#### Snippet
```java
    }

    private String createCaption(final List<ProxyDistributionSet> allDistributionSetsForInvalidation) {
        String caption = "";
        if (allDistributionSetsForInvalidation.size() == 1) {
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/dstable/InvalidateDsConsequencesDialog.java`
#### Snippet
```java
     */
    public InvalidateDsConsequencesDialog(final List<ProxyDistributionSet> allDistributionSetsForInvalidation,
            final VaadinMessageSource i18n, final UiProperties uiProperties, final Consumer<Boolean> callback) {

        this.i18n = i18n;
```

### BoundedWildcard
Can generalize to `? super ProxyTargetFilterQuery`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettag/filter/CustomTargetTagFilterButtonClick.java`
#### Snippet
```java
     */
    public CustomTargetTagFilterButtonClick(
            final BiConsumer<ProxyTargetFilterQuery, ClickBehaviourType> filterChangedCallback) {
        this.filterChangedCallback = filterChangedCallback;
    }
```

### BoundedWildcard
Can generalize to `? super ClickBehaviourType`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettag/filter/CustomTargetTagFilterButtonClick.java`
#### Snippet
```java
     */
    public CustomTargetTagFilterButtonClick(
            final BiConsumer<ProxyTargetFilterQuery, ClickBehaviourType> filterChangedCallback) {
        this.filterChangedCallback = filterChangedCallback;
    }
```

### BoundedWildcard
Can generalize to `? extends ProxyTargetType`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettag/filter/TargetTypeFilterButtons.java`
#### Snippet
```java

    @Override
    protected boolean deleteFilterButtons(Collection<ProxyTargetType> filterButtonsToDelete) {
        final ProxyTargetType targetTypeToDelete = filterButtonsToDelete.iterator().next();
        final String targetTypeToDeleteName = targetTypeToDelete.getName();
```

### BoundedWildcard
Can generalize to `? extends ProxyTargetType`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettag/targettype/TargetTypeWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return layout of target type distribution set selection
     */
    public TargetTypeDsTypeSelectLayout createTargetTypeDsSelectLayout(final Binder<ProxyTargetType> binder) {

        final TargetTypeDsTypeSelectLayout targetTypeDsTypeSelectLayout = new TargetTypeDsTypeSelectLayout(i18n, distributionSetTypeManagement);
```

### BoundedWildcard
Can generalize to `? extends ProxyDistributionSet`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/dstable/InvalidateDistributionSetSupport.java`
#### Snippet
```java

    private static List<Long> getDistributionSetIds(
            final List<ProxyDistributionSet> allDistributionSetsForInvalidation) {
        return allDistributionSetsForInvalidation.stream().map(ProxyDistributionSet::getId)
                .collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends ProxyDistributionSet`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/dstable/InvalidateDistributionSetSupport.java`
#### Snippet
```java
    }

    private String createSuccessNotificationText(final List<ProxyDistributionSet> allDistributionSetsForInvalidation) {
        String successNotificationText = "";
        if (allDistributionSetsForInvalidation.size() == 1) {
```

### BoundedWildcard
Can generalize to `? extends ProxyDistributionSet`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/dstable/InvalidateDistributionSetSupport.java`
#### Snippet
```java
    }

    private String createFailureNotificationText(final List<ProxyDistributionSet> allDistributionSetsForInvalidation) {
        String failureNotificationText = "";
        if (allDistributionSetsForInvalidation.size() == 1) {
```

### BoundedWildcard
Can generalize to `? extends ProxyBulkUploadWindow`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/bulkupload/BulkUploadWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return ComboBox
     */
    public ComboBox<ProxyDistributionSet> createDistributionSetCombo(final Binder<ProxyBulkUploadWindow> binder) {
        final BoundComponent<ComboBox<ProxyDistributionSet>> boundComboBox = FormComponentBuilder
                .createDistributionSetComboBox(binder, distributionSetDataProvider, i18n,
```

### BoundedWildcard
Can generalize to `? extends ProxyBulkUploadWindow`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/bulkupload/BulkUploadWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return ComboBox
     */
    public ComboBox<ProxyTypeInfo> createTargetTypeCombo(final Binder<ProxyBulkUploadWindow> binder) {
        final BoundComponent<ComboBox<ProxyTypeInfo>> boundComboBox = FormComponentBuilder
                .createTypeCombo(binder, targetTypeDataProvider, i18n, UIComponentIdProvider.TARGET_ADD_TARGETTYPE, false);
```

### BoundedWildcard
Can generalize to `? extends ProxyBulkUploadWindow`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/bulkupload/BulkUploadWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return input component
     */
    public TextArea createDescriptionField(final Binder<ProxyBulkUploadWindow> binder) {
        final TextArea description = FormComponentBuilder
                .createDescriptionInput(binder, i18n, UIComponentIdProvider.TARGET_ADD_DESC).getComponent();
```

### BoundedWildcard
Can generalize to `? extends ProxyTarget`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettable/TargetWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return input component
     */
    public BoundComponent<ComboBox<ProxyTypeInfo>> createTargetTypeCombo(final Binder<ProxyTarget> binder, final TargetTypeDataProvider<ProxyTypeInfo> targetTypeDataProvider) {
        return FormComponentBuilder
                .createTypeCombo(binder, targetTypeDataProvider, i18n, UIComponentIdProvider.TARGET_ADD_TARGETTYPE, false);
```

### BoundedWildcard
Can generalize to `? extends ProxyTarget`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettable/TargetWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return input component
     */
    public BoundComponent<TextField> createNameField(final Binder<ProxyTarget> binder) {
        return FormComponentBuilder.createNameInput(binder, i18n, UIComponentIdProvider.TARGET_ADD_NAME);
    }
```

### BoundedWildcard
Can generalize to `? extends ProxyTarget`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettable/TargetWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return Target controller id Text field
     */
    public TextField createControllerIdField(final Binder<ProxyTarget> binder) {
        final TextField targetControllerId = new TextFieldBuilder(Target.CONTROLLER_ID_MAX_SIZE)
                .id(UIComponentIdProvider.TARGET_ADD_CONTROLLER_ID).caption(i18n.getMessage(TEXTFIELD_CONTROLLER_ID))
```

### BoundedWildcard
Can generalize to `? extends ProxyTarget`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettable/TargetWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return input component
     */
    public TextArea createDescriptionField(final Binder<ProxyTarget> binder) {
        return FormComponentBuilder.createDescriptionInput(binder, i18n, UIComponentIdProvider.TARGET_ADD_DESC)
                .getComponent();
```

### BoundedWildcard
Can generalize to `? extends TargetManagementFilterParams`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettable/TargetCountMessageLabel.java`
#### Snippet
```java
    public TargetCountMessageLabel(final VaadinMessageSource i18n, final UINotification notification,
            final TargetManagement targetManagement,
            final FilterSupport<ProxyTarget, TargetManagementFilterParams> gridFilterSupport) {
        super(i18n, notification);

```

### BoundedWildcard
Can generalize to `? super CommonDialogWindow.SaveDialogCloseListener`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettable/TargetAutoConfActivationLayout.java`
#### Snippet
```java
    }

    public void setSaveCallback(final Consumer<CommonDialogWindow.SaveDialogCloseListener> saveCallback) {
        saveCallback.accept(new CommonDialogWindow.SaveDialogCloseListener() {
            @Override
```

### BoundedWildcard
Can generalize to `? extends ProxyTargetConfirmationOptions`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettable/TargetAutoConfActivationLayout.java`
#### Snippet
```java
    }

    public TextField createInitiatorField(final Binder<ProxyTargetConfirmationOptions> binder) {
        final TextField initiatorField = new TextFieldBuilder(64).id(AUTO_CONFIRMATION_ACTIVATION_DIALOG_INITIATOR)
                .caption(i18n.getMessage(CAPTION_TEXTFIELD_INITIATOR))
```

### BoundedWildcard
Can generalize to `? extends ProxyTargetConfirmationOptions`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettable/TargetAutoConfActivationLayout.java`
#### Snippet
```java
     * @return input component
     */
    public TextArea createRemarkInputArea(final Binder<ProxyTargetConfirmationOptions> binder) {
        return FormComponentBuilder
                .createBigTextInput(binder, i18n, AUTO_CONFIRMATION_ACTIVATION_DIALOG_REMARK,
```

### BoundedWildcard
Can generalize to `? extends ProxyBulkUploadWindow`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/bulkupload/BulkUploadHandler.java`
#### Snippet
```java
            final TargetManagement targetManagement, final TargetTagManagement tagManagement,
            final DistributionSetManagement distributionSetManagement, final DeploymentManagement deploymentManagement,
            final Supplier<ProxyBulkUploadWindow> bulkUploadInputsProvider) {
        this.targetManagement = targetManagement;
        this.deploymentManagement = deploymentManagement;
```

### BoundedWildcard
Can generalize to `? extends SoftwareModuleType`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/distributions/smtype/filter/SmTypeCssStylesHandler.java`
#### Snippet
```java
    }

    private static Map<Long, String> getSmTypeIdWithColor(final List<SoftwareModuleType> smTypes) {
        return smTypes.stream().collect(Collectors.toMap(Type::getId,
                type -> Optional.ofNullable(type.getColour()).orElse(SPUIDefinitions.DEFAULT_COLOR)));
```

### BoundedWildcard
Can generalize to `? extends ProxyDistributionSet`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/distributions/dstable/DsWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return Migration step required checkbox
     */
    public CheckBox createMigrationStepField(final Binder<ProxyDistributionSet> binder) {
        final CheckBox migrationRequired = FormComponentBuilder.createCheckBox(i18n.getMessage(MIGRATION_STEP),
                UIComponentIdProvider.DIST_ADD_MIGRATION_CHECK, binder, ProxyDistributionSet::isRequiredMigrationStep,
```

### BoundedWildcard
Can generalize to `? extends ProxyDistributionSet`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/distributions/dstable/DsWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return input component
     */
    public TextArea createDescription(final Binder<ProxyDistributionSet> binder) {
        return FormComponentBuilder.createDescriptionInput(binder, i18n, UIComponentIdProvider.DIST_ADD_DESC)
                .getComponent();
```

### BoundedWildcard
Can generalize to `? extends ProxyDistributionSet`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/distributions/dstable/DsWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return Distribution set type combobox
     */
    public ComboBox<ProxyTypeInfo> createDistributionSetTypeCombo(final Binder<ProxyDistributionSet> binder) {
        return FormComponentBuilder
                .createTypeCombo(binder, dsTypeDataProvider, i18n, UIComponentIdProvider.DIST_ADD_DISTSETTYPE, true)
```

### BoundedWildcard
Can generalize to `? extends ProxyDistributionSet`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/distributions/dstable/DsWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return input component
     */
    public TextField createVersionField(final Binder<ProxyDistributionSet> binder) {
        return FormComponentBuilder.createVersionInput(binder, i18n, UIComponentIdProvider.DIST_ADD_VERSION)
                .getComponent();
```

### BoundedWildcard
Can generalize to `? extends ProxyDistributionSet`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/distributions/dstable/DsWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return input component
     */
    public TextField createNameField(final Binder<ProxyDistributionSet> binder) {
        return FormComponentBuilder.createNameInput(binder, i18n, UIComponentIdProvider.DIST_ADD_NAME).getComponent();
    }
```

### BoundedWildcard
Can generalize to `? extends ProxyType`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/distributions/disttype/DsTypeWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return layout of distribution set software module selection
     */
    public DsTypeSmSelectLayout createDsTypeSmSelectLayout(final Binder<ProxyType> binder) {
        final DsTypeSmSelectLayout dsTypeSmSelectLayout = new DsTypeSmSelectLayout(i18n, softwareModuleTypeManagement);
        dsTypeSmSelectLayout.setRequiredIndicatorVisible(true);
```

### BoundedWildcard
Can generalize to `? super ProxyTargetFilterQuery`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/TargetFilterDetailsGridHeader.java`
#### Snippet
```java

    private void showAddUpdateFilterLayout(final String captionMessage,
            final AbstractEntityWindowController<ProxyTargetFilterQuery, ProxyTargetFilterQuery, TargetFilterQuery> controller,
            final ProxyTargetFilterQuery proxyEntity) {
        headerCaptionDetails.setValue(captionMessage);
```

### BoundedWildcard
Can generalize to `? extends ProxyTargetFilterQuery`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/TargetFilterAddUpdateLayoutComponentBuilder.java`
#### Snippet
```java
     * @return Auto complete query field component
     */
    public AutoCompleteTextFieldComponent createQueryField(final Binder<ProxyTargetFilterQuery> binder) {
        final AutoCompleteTextFieldComponent autoCompleteComponent = new AutoCompleteTextFieldComponent(
                rsqlValidationOracle);
```

### BoundedWildcard
Can generalize to `? extends ProxyTargetFilterQuery`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/TargetFilterAddUpdateLayoutComponentBuilder.java`
#### Snippet
```java
     * @return input component
     */
    public TextField createNameField(final Binder<ProxyTargetFilterQuery> binder) {
        final TextField filterName = FormComponentBuilder
                .createNameInput(binder, i18n, UIComponentIdProvider.CUSTOM_FILTER_ADD_NAME).getComponent();
```

### BoundedWildcard
Can generalize to `? extends ProxyTargetFilterQuery`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/AutoAssignmentWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return Auto assignment checkbox
     */
    public CheckBox createEnableCheckbox(final Binder<ProxyTargetFilterQuery> binder) {
        final String caption = i18n.getMessage(UIMessageIdProvider.LABEL_AUTO_ASSIGNMENT_ENABLE);
        return FormComponentBuilder.createCheckBox(caption, UIComponentIdProvider.DIST_SET_SELECT_ENABLE_ID, binder,
```

### BoundedWildcard
Can generalize to `? extends ProxyTargetFilterQuery`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/AutoAssignmentWindowLayoutComponentBuilder.java`
#### Snippet
```java
     */
    public BoundComponent<ComboBox<ProxyDistributionSet>> createDistributionSetCombo(
            final Binder<ProxyTargetFilterQuery> binder, final DistributionSetStatelessDataProvider dataProvider) {
        final BoundComponent<ComboBox<ProxyDistributionSet>> boundComboBox = FormComponentBuilder
                .createDistributionSetComboBox(binder, dataProvider, i18n,
```

### BoundedWildcard
Can generalize to `? extends ProxyTargetFilterQuery`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/AutoAssignmentWindowLayoutComponentBuilder.java`
#### Snippet
```java
     */
    public ActionTypeOptionGroupAutoAssignmentLayout createActionTypeOptionGroupLayout(
            final Binder<ProxyTargetFilterQuery> binder) {
        final ActionTypeOptionGroupAutoAssignmentLayout actionTypeOptionGroupLayout = new ActionTypeOptionGroupAutoAssignmentLayout(
                i18n, UIComponentIdProvider.AUTO_ASSIGNMENT_ACTION_TYPE_OPTIONS_ID);
```

### BoundedWildcard
Can generalize to `? extends ProxyTargetFilterQuery`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/AutoAssignmentWindowLayoutComponentBuilder.java`
#### Snippet
```java
    }

    public CheckBox createConfirmationCheckbox(final Binder<ProxyTargetFilterQuery> binder) {
        final String caption = i18n.getMessage(UIMessageIdProvider.LABEL_AUTO_ASSIGNMENT_CONFIRMATION_REQUIRED);
        return FormComponentBuilder.createCheckBox(caption, UIComponentIdProvider.ASSIGNMENT_CONFIRMATION_REQUIRED,
```

### BoundedWildcard
Can generalize to `? extends ProxyTarget`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettable/TargetGrid.java`
#### Snippet
```java
    }

    private boolean deleteTargets(final Collection<ProxyTarget> targetsToBeDeleted) {
        final Collection<Long> targetToBeDeletedIds = targetsToBeDeleted.stream().map(ProxyIdentifiableEntity::getId)
                .collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? super Pageable`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettable/TargetGrid.java`
#### Snippet
```java
    }

    private Collection<Long> getTargetIdsByFunction(final Function<Pageable, Page<Target>> findTargetsFunction) {
        return HawkbitCommonUtil.getEntitiesByPageableProvider(findTargetsFunction::apply).stream().map(Target::getId)
                .collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends Page`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettable/TargetGrid.java`
#### Snippet
```java
    }

    private Collection<Long> getTargetIdsByFunction(final Function<Pageable, Page<Target>> findTargetsFunction) {
        return HawkbitCommonUtil.getEntitiesByPageableProvider(findTargetsFunction::apply).stream().map(Target::getId)
                .collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends ProxyTargetFilterQuery`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/TargetFilterGrid.java`
#### Snippet
```java
    }

    private boolean targetFiltersDeletionCallback(final Collection<ProxyTargetFilterQuery> targetFiltersToBeDeleted) {
        final Collection<Long> targetFilterIdsToBeDeleted = targetFiltersToBeDeleted.stream()
                .map(ProxyIdentifiableEntity::getId).collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends SuggestTokenDto`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/client/SuggestionsSelectList.java`
#### Snippet
```java
     *            server RPC to ask for new suggestion after a selection
     */
    public void addItems(final List<SuggestTokenDto> suggestions, final VTextField textFieldWidget,
            final PopupPanel popupPanel, final TextFieldSuggestionBoxServerRpc suggestionServerRpc) {
        for (int index = 0; index < suggestions.size(); index++) {
```

### BoundedWildcard
Can generalize to `? extends ProxyTypeInfo`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/tenantconfiguration/DefaultDistributionSetTypeView.java`
#### Snippet
```java
     *            ValueChangeEvent
     */
    private void selectDistributionSetTypeValue(final HasValue.ValueChangeEvent<ProxyTypeInfo> event) {
        changeIcon.setVisible(!event.getValue().getId().equals(currentDefaultDistSetTypeId));
    }
```

### BoundedWildcard
Can generalize to `? extends ProxySystemConfigDsType`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/tenantconfiguration/window/SystemConfigWindowLayoutComponentBuilder.java`
#### Snippet
```java
     * @return Distribution set type combo box
     */
    public ComboBox<ProxyTypeInfo> createDistributionSetTypeCombo(final Binder<ProxySystemConfigDsType> binder) {
        final ComboBox<ProxyTypeInfo> dsTypeCombo = SPUIComponentProvider.getComboBox(
                UIComponentIdProvider.SYSTEM_CONFIGURATION_DEFAULTDIS_COMBOBOX, null,
```

### BoundedWildcard
Can generalize to `? extends BaseConfigurationView`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/tenantconfiguration/TenantConfigurationDashboardView.java`
#### Snippet
```java
    TenantConfigurationDashboardView(final VaadinMessageSource i18n, final UiProperties uiProperties,
            final UINotification uINotification,
            final List<BaseConfigurationView<? extends ProxySystemConfigWindow>> configurationViews) {
        this.i18n = i18n;
        this.uiProperties = uiProperties;
```

### BoundedWildcard
Can generalize to `? super String`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaSystemManagement.java`
#### Snippet
```java
    // intended in this case
    @SuppressWarnings("squid:S2229")
    public void forEachTenant(final Consumer<String> consumer) {

        Page<String> tenants;
```

### BoundedWildcard
Can generalize to `? super J`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaManagementHelper.java`
#### Snippet
```java

    public static <J extends AbstractJpaBaseEntity> J touch(final EntityManager entityManager,
            final CrudRepository<J, ?> repository, final J entity) {
        // merge base entity so optLockRevision gets updated and audit
        // log written because modifying e.g. metadata is modifying the base
```

### BoundedWildcard
Can generalize to `? extends T`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaTenantConfigurationManagement.java`
#### Snippet
```java
    @Override
    public <T extends Serializable> TenantConfigurationValue<T> buildTenantConfigurationValueByKey(
            final TenantConfigurationKey configurationKey, final Class<T> propertyType,
            final TenantConfiguration tenantConfiguration) {
        if (tenantConfiguration != null) {
```

### BoundedWildcard
Can generalize to `? extends JpaTarget`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/OfflineDsAssignmentStrategy.java`
#### Snippet
```java

    @Override
    public void sendTargetUpdatedEvents(final DistributionSet set, final List<JpaTarget> targets) {
        targets.forEach(target -> {
            target.setUpdateStatus(TargetUpdateStatus.IN_SYNC);
```

### BoundedWildcard
Can generalize to `? extends List`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/OfflineDsAssignmentStrategy.java`
#### Snippet
```java

    @Override
    public void setAssignedDistributionSetAndTargetStatus(final JpaDistributionSet set, final List<List<Long>> targetIds,
            final String currentUser) {
        targetIds.forEach(tIds -> targetRepository.setAssignedAndInstalledDistributionSetAndUpdateStatus(
```

### BoundedWildcard
Can generalize to `? extends DistributionSetTypeCreate`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDistributionSetTypeManagement.java`
#### Snippet
```java
    @Retryable(include = {
            ConcurrencyFailureException.class }, maxAttempts = Constants.TX_RT_MAX, backoff = @Backoff(delay = Constants.TX_RT_DELAY))
    public List<DistributionSetType> create(final Collection<DistributionSetTypeCreate> types) {
        return types.stream().map(this::create).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? super SoftwareModuleType`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDistributionSetTypeManagement.java`
#### Snippet
```java

    private void addModuleTypes(final Collection<Long> currentSmTypeIds, final Collection<Long> updatedSmTypeIds,
            final Function<SoftwareModuleType, JpaDistributionSetType> addModuleTypeCallback) {
        final Set<Long> smTypeIdsToAdd = updatedSmTypeIds.stream().filter(id -> !currentSmTypeIds.contains(id))
                .collect(Collectors.toSet());
```

### BoundedWildcard
Can generalize to `? extends TargetTypeCreate`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaTargetTypeManagement.java`
#### Snippet
```java
    @Retryable(include = {
            ConcurrencyFailureException.class }, maxAttempts = Constants.TX_RT_MAX, backoff = @Backoff(delay = Constants.TX_RT_DELAY))
    public List<TargetType> create(final Collection<TargetTypeCreate> creates) {
        return creates.stream().map(this::create).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? extends List`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/OnlineDsAssignmentStrategy.java`
#### Snippet
```java

    @Override
    public void closeActiveActions(final List<List<Long>> targetIds) {
        targetIds.forEach(this::closeObsoleteUpdateActions);
    }
```

### BoundedWildcard
Can generalize to `? extends JpaTarget`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/OnlineDsAssignmentStrategy.java`
#### Snippet
```java

    @Override
    public void sendTargetUpdatedEvents(final DistributionSet set, final List<JpaTarget> targets) {
        targets.forEach(target -> {
            target.setUpdateStatus(TargetUpdateStatus.PENDING);
```

### BoundedWildcard
Can generalize to `? extends List`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/OnlineDsAssignmentStrategy.java`
#### Snippet
```java

    @Override
    public void setAssignedDistributionSetAndTargetStatus(final JpaDistributionSet set, final List<List<Long>> targetIds,
            final String currentUser) {
        targetIds.forEach(tIds -> targetRepository.setAssignedDistributionSetAndUpdateStatus(TargetUpdateStatus.PENDING,
```

### BoundedWildcard
Can generalize to `? extends DistributionSetAssignmentResult`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/OnlineDsAssignmentStrategy.java`
#### Snippet
```java

    @Override
    public void sendDeploymentEvents(final List<DistributionSetAssignmentResult> assignmentResults) {
        if (isMultiAssignmentsEnabled()) {
            sendDeploymentEvent(assignmentResults.stream().flatMap(result -> result.getAssignedEntity().stream())
```

### BoundedWildcard
Can generalize to `? extends List`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/OnlineDsAssignmentStrategy.java`
#### Snippet
```java

    @Override
    public Set<Long> cancelActiveActions(final List<List<Long>> targetIds) {
        return targetIds.stream().map(this::overrideObsoleteUpdateActions).flatMap(Collection::stream)
                .collect(Collectors.toSet());
```

### BoundedWildcard
Can generalize to `? extends SoftwareModuleTypeCreate`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaSoftwareModuleTypeManagement.java`
#### Snippet
```java
    @Retryable(include = {
            ConcurrencyFailureException.class }, maxAttempts = Constants.TX_RT_MAX, backoff = @Backoff(delay = Constants.TX_RT_DELAY))
    public List<SoftwareModuleType> create(final Collection<SoftwareModuleTypeCreate> creates) {
        return creates.stream().map(this::create).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? extends Target`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaRolloutExecutor.java`
#### Snippet
```java
    }

    private void createAssignmentOfTargetsToGroup(final Slice<Target> targets, final RolloutGroup group) {
        targets.forEach(target -> rolloutTargetGroupRepository.save(new RolloutTargetGroup(group, target)));
    }
```

### BoundedWildcard
Can generalize to `? extends JpaRolloutGroup`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaRolloutExecutor.java`
#### Snippet
```java
    }

    private void executeRolloutGroups(final JpaRollout rollout, final List<JpaRolloutGroup> rolloutGroups) {
        for (final JpaRolloutGroup rolloutGroup : rolloutGroups) {

```

### BoundedWildcard
Can generalize to `? extends Target`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaRolloutExecutor.java`
#### Snippet
```java
     * is created in-active.
     */
    private void createScheduledAction(final Collection<Target> targets, final DistributionSet distributionSet,
            final ActionType actionType, final Long forcedTime, final Rollout rollout,
            final RolloutGroup rolloutGroup) {
```

### BoundedWildcard
Can generalize to `? extends Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaSoftwareModuleManagement.java`
#### Snippet
```java
    }

    private Predicate[] specificationsToPredicate(final List<Specification<JpaSoftwareModule>> specifications,
            final Root<JpaSoftwareModule> root, final CriteriaQuery<?> query, final CriteriaBuilder cb,
            final Predicate... additionalPredicates) {
```

### BoundedWildcard
Can generalize to `? extends SoftwareModuleCreate`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaSoftwareModuleManagement.java`
#### Snippet
```java
    @Retryable(include = {
            ConcurrencyFailureException.class }, maxAttempts = Constants.TX_RT_MAX, backoff = @Backoff(delay = Constants.TX_RT_DELAY))
    public List<SoftwareModule> create(final Collection<SoftwareModuleCreate> swModules) {
        return swModules.stream().map(this::create).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? extends MetaData`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDistributionSetManagement.java`
#### Snippet
```java
    @Retryable(include = {
            ConcurrencyFailureException.class }, maxAttempts = Constants.TX_RT_MAX, backoff = @Backoff(delay = Constants.TX_RT_DELAY))
    public List<DistributionSetMetadata> createMetaData(final long dsId, final Collection<MetaData> md) {

        md.forEach(meta -> checkAndThrowIfDistributionSetMetadataAlreadyExists(
```

### BoundedWildcard
Can generalize to `? extends DistributionSetCreate`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDistributionSetManagement.java`
#### Snippet
```java
    @Retryable(include = {
            ConcurrencyFailureException.class }, maxAttempts = Constants.TX_RT_MAX, backoff = @Backoff(delay = Constants.TX_RT_DELAY))
    public List<DistributionSet> create(final Collection<DistributionSetCreate> creates) {
        return creates.stream().map(this::create).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? super SuggestToken`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java

    private static void setExceptionDetails(final String rsqlQuery, final Exception ex,
            final List<SuggestToken> expectedTokens) {
        final ParseException parseException = findParseException(ex);
        if (parseException == null) {
```

### BoundedWildcard
Can generalize to `? super SuggestToken`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java
    }

    private static void addSuggestionOnTokenImage(final List<SuggestToken> listTokens, final int nextTokenBeginColumn,
            final int currentTokenEndColumn, final int[] is) {
        for (final int i : is) {
```

### BoundedWildcard
Can generalize to `? extends SuggestToken`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java
    }

    private static String getCustomMessage(final String message, final List<SuggestToken> expectedTokens) {
        String builder = message;

```

### BoundedWildcard
Can generalize to `? extends MetaData`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaTargetManagement.java`
#### Snippet
```java
    @Retryable(include = {
            ConcurrencyFailureException.class }, maxAttempts = Constants.TX_RT_MAX, backoff = @Backoff(delay = Constants.TX_RT_DELAY))
    public List<TargetMetadata> createMetaData(final String controllerId, final Collection<MetaData> md) {

        final JpaTarget target = getByControllerIdAndThrowIfNotFound(controllerId);
```

### BoundedWildcard
Can generalize to `? super String`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaControllerManagement.java`
#### Snippet
```java
    }

    private static void copy(final Map<String, String> src, final Map<String, String> trg) {
        if (src == null || src.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? super String`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaControllerManagement.java`
#### Snippet
```java
    }

    private static void copy(final Map<String, String> src, final Map<String, String> trg) {
        if (src == null || src.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends TargetPoll`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaControllerManagement.java`
#### Snippet
```java
    }

    private Void updateLastTargetQueries(final String tenant, final List<TargetPoll> polls) {
        LOG.debug("Persist {} targetqueries.", polls.size());

```

### BoundedWildcard
Can generalize to `? super String`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaRolloutManagement.java`
#### Snippet
```java

    private long countOverlappingTargetsWithPreviousGroups(final String baseFilter, final List<RolloutGroup> groups,
            final RolloutGroup group, final int groupIndex, final Map<String, Long> targetFilterCounts) {
        // there can't be overlapping targets in the first group
        if (groupIndex == 0) {
```

### BoundedWildcard
Can generalize to `? extends Rollout`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaRolloutManagement.java`
#### Snippet
```java
    }

    private void setRolloutStatusDetails(final Slice<Rollout> rollouts) {
        final List<Long> rolloutIds = rollouts.getContent().stream().map(Rollout::getId).collect(Collectors.toList());
        final Map<Long, List<TotalTargetCountActionStatus>> allStatesForRollout = getStatusCountItemForRollout(
```

### BoundedWildcard
Can generalize to `? extends RolloutGroupCreate`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaRolloutManagement.java`
#### Snippet
```java
    @Override
    @Async
    public ListenableFuture<RolloutGroupsValidation> validateTargetsInGroups(final List<RolloutGroupCreate> groups,
            final String targetFilter, final Long createdAt, final Long dsTypeId) {

```

### BoundedWildcard
Can generalize to `? extends RolloutGroupCreate`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaRolloutManagement.java`
#### Snippet
```java
    }

    private Rollout createRolloutGroups(final List<RolloutGroupCreate> groupList,
            final RolloutGroupConditions conditions, final Rollout rollout) {
        RolloutHelper.verifyRolloutInStatus(rollout, RolloutStatus.CREATING);
```

### BoundedWildcard
Can generalize to `? extends DeploymentRequest`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/utils/WeightValidationHelper.java`
#### Snippet
```java
     *            the {@linkplain List} of {@link DeploymentRequest}s
     */
    public void validate(final List<DeploymentRequest> deploymentRequests) {
        final long assignmentsWithWeight = deploymentRequests.stream()
                .filter(request -> request.getTargetWithActionType().getWeight() != null).count();
```

### BoundedWildcard
Can generalize to `? extends SoftwareModule`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaDistributionSet.java`
#### Snippet
```java
     */
    public JpaDistributionSet(final String name, final String version, final String description,
            final DistributionSetType type, final Collection<SoftwareModule> moduleList,
            final boolean requiredMigrationStep) {
        super(name, version, description);
```

### BoundedWildcard
Can generalize to `? extends CleanupTask`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/autocleanup/AutoCleanupScheduler.java`
#### Snippet
```java
    public AutoCleanupScheduler(final SystemManagement systemManagement,
            final SystemSecurityContext systemSecurityContext, final LockRegistry lockRegistry,
            final List<CleanupTask> cleanupTasks) {
        this.systemManagement = systemManagement;
        this.systemSecurityContext = systemSecurityContext;
```

### BoundedWildcard
Can generalize to `? extends Specification`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/SpecificationsBuilder.java`
#### Snippet
```java
     * @return <null> if the given specification list is empty
     */
    public static <T> Specification<T> combineWithAnd(final List<Specification<T>> specList) {
        if (specList.isEmpty()) {
            return null;
```

### BoundedWildcard
Can generalize to `? super TargetFilterQuery`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/autoassign/AbstractAutoAssignExecutor.java`
#### Snippet
```java
    }

    protected void forEachFilterWithAutoAssignDS(final Consumer<TargetFilterQuery> consumer) {
        Slice<TargetFilterQuery> filterQueries;
        Pageable query = PageRequest.of(0, PAGE_SIZE);
```

### BoundedWildcard
Can generalize to `? extends RolloutGroupActionEvaluator`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rollout/condition/RolloutGroupEvaluationManager.java`
#### Snippet
```java

    private static <T extends Enum<T>> RolloutGroupActionEvaluator<T> findFirstActionEvaluator(
            final List<RolloutGroupActionEvaluator<T>> evaluators, final T action) {
        return evaluators.stream().filter(evaluator -> evaluator.getAction() == action).findFirst().orElseThrow(() -> {
            LOGGER.warn("Could not find suitable evaluator for the '{}' action.", action.name());
```

### BoundedWildcard
Can generalize to `? extends RolloutGroupConditionEvaluator`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rollout/condition/RolloutGroupEvaluationManager.java`
#### Snippet
```java

    private static <T extends Enum<T>> RolloutGroupConditionEvaluator<T> findFirstConditionEvaluator(
            final List<RolloutGroupConditionEvaluator<T>> evaluators, final T condition) {
        return evaluators.stream().filter(evaluator -> evaluator.getCondition() == condition).findFirst()
                .orElseThrow(() -> {
```

### BoundedWildcard
Can generalize to `? extends List`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/InMemoryUserAuthoritiesResolver.java`
#### Snippet
```java
     *            The authority map to read from. Must not be <code>null</code>.
     */
    public InMemoryUserAuthoritiesResolver(final Map<String, List<String>> usernamesToAuthorities) {
        this.usernamesToAuthorities = usernamesToAuthorities;
    }
```

### BoundedWildcard
Can generalize to `? super Expression`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/JpaQueryRsqlVisitor.java`
#### Snippet
```java
    @SuppressWarnings({ "unchecked", "rawtypes" })
    private Predicate toNotExistsSubQueryPredicate(final String[] fieldNames, final A enumField,
            final Function<Expression<String>, Predicate> subQueryPredicateProvider) {
        final Class<?> javaType = root.getJavaType();
        final Subquery<?> subquery = query.subquery(javaType);
```

### BoundedWildcard
Can generalize to `? extends Predicate`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/JpaQueryRsqlVisitor.java`
#### Snippet
```java
    @SuppressWarnings({ "unchecked", "rawtypes" })
    private Predicate toNotExistsSubQueryPredicate(final String[] fieldNames, final A enumField,
            final Function<Expression<String>, Predicate> subQueryPredicateProvider) {
        final Class<?> javaType = root.getJavaType();
        final Subquery<?> subquery = query.subquery(javaType);
```

### BoundedWildcard
Can generalize to `? super Path`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/JpaQueryRsqlVisitor.java`
#### Snippet
```java

    private static Optional<Path<?>> getFieldPath(final Root<?> root, final String[] split, final boolean isMapKeyField,
            final BiFunction<Path<?>, String, Path<?>> joinFieldPathProvider) {
        Path<?> fieldPath = null;
        for (int i = 0; i < split.length; i++) {
```

### BoundedWildcard
Can generalize to `? super String`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/JpaQueryRsqlVisitor.java`
#### Snippet
```java

    private static Optional<Path<?>> getFieldPath(final Root<?> root, final String[] split, final boolean isMapKeyField,
            final BiFunction<Path<?>, String, Path<?>> joinFieldPathProvider) {
        Path<?> fieldPath = null;
        for (int i = 0; i < split.length; i++) {
```

### BoundedWildcard
Can generalize to `? extends Path`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/JpaQueryRsqlVisitor.java`
#### Snippet
```java

    private static Optional<Path<?>> getFieldPath(final Root<?> root, final String[] split, final boolean isMapKeyField,
            final BiFunction<Path<?>, String, Path<?>> joinFieldPathProvider) {
        Path<?> fieldPath = null;
        for (int i = 0; i < split.length; i++) {
```

### BoundedWildcard
Can generalize to `? super String`
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/PreAuthTokenSourceTrustAuthenticationProvider.java`
#### Snippet
```java
     *            a list of IP addresses.
     */
    public PreAuthTokenSourceTrustAuthenticationProvider(final List<String> authorizedSourceIps) {
        this.authorizedSourceIps = authorizedSourceIps;
    }
```

### BoundedWildcard
Can generalize to `? extends DeploymentRequest`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDeploymentManagement.java`
#### Snippet
```java
    }

    private void enforceMaxActionsPerTarget(final Collection<DeploymentRequest> deploymentRequests) {
        final int quota = quotaManagement.getMaxActionsPerTarget();

```

### BoundedWildcard
Can generalize to `? extends JpaAction`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDeploymentManagement.java`
#### Snippet
```java

    private static DistributionSetAssignmentResult buildAssignmentResult(final JpaDistributionSet distributionSet,
            final List<JpaAction> assignedActions, final int totalTargetsForAssignment) {
        final int alreadyAssignedTargetsCount = totalTargetsForAssignment - assignedActions.size();

```

### BoundedWildcard
Can generalize to `? extends JpaAction`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDeploymentManagement.java`
#### Snippet
```java
    }

    private void setInitialActionStatusOfRolloutGroup(final List<JpaAction> actions) {
        final List<JpaActionStatus> statusList = new ArrayList<>();
        for (final JpaAction action : actions) {
```

### BoundedWildcard
Can generalize to `? extends JpaAction`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDeploymentManagement.java`
#### Snippet
```java
    }

    private void closeOrCancelOpenDeviceActions(final List<JpaAction> actions) {
        final List<Long> targetIds = actions.stream().map(JpaAction::getTarget).map(Target::getId)
                .collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends TargetWithActionType`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDeploymentManagement.java`
#### Snippet
```java
    }

    private void createActionsStatus(final Map<TargetWithActionType, JpaAction> actions,
            final AbstractDsAssignmentStrategy assignmentStrategy, final String actionMessage) {
        actionStatusRepository.saveAll(actions.entrySet().stream().map(entry -> {
```

### BoundedWildcard
Can generalize to `? extends JpaAction`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDeploymentManagement.java`
#### Snippet
```java
    }

    private void createActionsStatus(final Map<TargetWithActionType, JpaAction> actions,
            final AbstractDsAssignmentStrategy assignmentStrategy, final String actionMessage) {
        actionStatusRepository.saveAll(actions.entrySet().stream().map(entry -> {
```

### BoundedWildcard
Can generalize to `? extends DeploymentRequest`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDeploymentManagement.java`
#### Snippet
```java

    private static Map<Long, List<TargetWithActionType>> convertRequest(
            final Collection<DeploymentRequest> deploymentRequests) {
        return deploymentRequests.stream().collect(Collectors.groupingBy(DeploymentRequest::getDistributionSetId,
                Collectors.mapping(DeploymentRequest::getTargetWithActionType, Collectors.toList())));
```

### BoundedWildcard
Can generalize to `? extends JpaTarget`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDeploymentManagement.java`
#### Snippet
```java
     * statements
     */
    private static List<List<Long>> getTargetEntitiesAsChunks(final List<JpaTarget> targetEntities) {
        return Lists.partition(targetEntities.stream().map(Target::getId).collect(Collectors.toList()),
                Constants.MAX_ENTRIES_IN_STATEMENT);
```

### BoundedWildcard
Can generalize to `? extends Entry`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDeploymentManagement.java`
#### Snippet
```java
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public List<DistributionSetAssignmentResult> offlineAssignedDistributionSets(
            final Collection<Entry<String, Long>> assignments) {
        final Collection<Entry<String, Long>> distinctAssignments = assignments.stream().distinct()
                .collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends TargetWithActionType`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDeploymentManagement.java`
#### Snippet
```java

    private Map<TargetWithActionType, JpaAction> createActions(final String initiatedBy,
            final Collection<TargetWithActionType> targetsWithActionType, final List<JpaTarget> targets,
            final AbstractDsAssignmentStrategy assignmentStrategy, final JpaDistributionSet set) {

```

### BoundedWildcard
Can generalize to `? extends DeploymentRequest`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDeploymentManagement.java`
#### Snippet
```java
    }

    private void checkForTargetTypeCompatibility(final List<DeploymentRequest> deploymentRequests) {
        final List<String> controllerIds = deploymentRequests.stream().map(DeploymentRequest::getControllerId)
                .distinct().collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends JpaAction`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDeploymentManagement.java`
#### Snippet
```java
    }

    private void setAssignmentOnTargets(final List<JpaAction> actions) {
        final List<JpaTarget> assignedDsTargets = actions.stream().map(savedAction -> {
            final JpaTarget mergedTarget = (JpaTarget) entityManager.merge(savedAction.getTarget());
```

### BoundedWildcard
Can generalize to `? extends TargetWithActionType`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDeploymentManagement.java`
#### Snippet
```java
     */
    private DistributionSetAssignmentResult assignDistributionSetToTargets(final String initiatedBy, final Long dsID,
            final Collection<TargetWithActionType> targetsWithActionType, final String actionMessage,
            final AbstractDsAssignmentStrategy assignmentStrategy) {

```

### BoundedWildcard
Can generalize to `? extends DeploymentRequest`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDeploymentManagement.java`
#### Snippet
```java
    }

    private static void checkIfRequiresMultiAssignment(final Collection<DeploymentRequest> deploymentRequests) {
        final long distinctTargetsInRequest = deploymentRequests.stream()
                .map(request -> request.getTargetWithActionType().getControllerId()).distinct().count();
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final private`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/builder/JpaTargetBuilder.java`
#### Snippet
```java
 */
public class JpaTargetBuilder implements TargetBuilder {
    final private TargetTypeManagement targetTypeManagement;

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
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/target/MgmtTarget.java`
#### Snippet
```java
    public void setAddress(final String address) {
        if (address != null) {
            URI.create(address);
        }
        this.address = address;
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

### FunctionalExpressionCanBeFolded
Method reference can be replaced with qualifier
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaRolloutExecutor.java`
#### Snippet
```java
        if (hasScheduledActions) {
            try {
                final Iterable<JpaAction> iterable = scheduledActions::iterator;
                final List<Long> actionIds = StreamSupport.stream(iterable.spliterator(), false).map(Action::getId)
                        .collect(Collectors.toList());
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/event/remote/TargetAssignDistributionSetEvent.java`
#### Snippet
```java
            final String applicationId, final boolean maintenanceWindowAvailable) {
        super(distributionSetId, tenant,
                a.stream().filter(action -> action.getDistributionSet().getId().longValue() == distributionSetId)
                        .collect(Collectors.toList()),
                applicationId);
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

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `ErrorController` is the same as one of its superclass' names
in `hawkbit-runtime/hawkbit-update-server/src/main/java/org/eclipse/hawkbit/app/ErrorController.java`
#### Snippet
```java
// Exception squid:S3752 - errors need handling for all methods
@SuppressWarnings("squid:S3752")
public class ErrorController extends BasicErrorController {

    private static final String PATH = "path";
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
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/TestConfiguration.java`
#### Snippet
```java
 */
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true, mode = AdviceMode.PROXY, proxyTargetClass = false, securedEnabled = true)
@EnableConfigurationProperties({ HawkbitServerProperties.class, DdiSecurityProperties.class,
        ArtifactUrlHandlerProperties.class, ArtifactFilesystemProperties.class, HawkbitSecurityProperties.class,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/SecurityManagedConfiguration.java`
#### Snippet
```java

        @Bean
        @ConditionalOnProperty(prefix = "hawkbit.server.security.cors", name = "enabled", matchIfMissing = false)
        CorsConfiguration corsConfiguration() {
            final CorsConfiguration corsConfiguration = new CorsConfiguration();
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
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/system/MgmtSystemTenantConfigurationValue.java`
#### Snippet
```java
    private Object value;

    @JsonInclude(Include.ALWAYS)
    private boolean isGlobal = true;

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
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/targetfilter/MgmtDistributionSetAutoAssignment.java`
#### Snippet
```java
    private Integer weight;

    @JsonProperty(required = false)
    private Boolean confirmationRequired;

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
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaActionStatus.java`
#### Snippet
```java
    private List<String> messages;

    @Column(name = "code", nullable = true, updatable = false)
    private Integer code;
    
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
    private JpaDistributionSet autoAssignDistributionSet;

    @Column(name = "auto_assign_action_type", nullable = true)
    @ObjectTypeConverter(name = "autoAssignActionType", objectType = Action.ActionType.class, dataType = Integer.class, conversionValues = {
            @ConversionValue(objectValue = "FORCED", dataValue = "0"),
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
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaArtifact.java`
#### Snippet
```java
    private String md5Hash;

    @Column(name = "sha256_hash", length = 64, updatable = false, nullable = true)
    private String sha256Hash;

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
            @JsonProperty(required = false)
            private Long softwareModuleId;
            @JsonProperty(required = false)
            private String filename;

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
    private final String controllerId;
    @JsonProperty(required = false)
    private final Long targetId;

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
        private String filename;
        @JsonProperty(required = false)
        private SoftwareModuleFilenameResource softwareModuleFilenameResource;

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
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDeploymentManagement.java`
#### Snippet
```java

    @Override
    @Transactional(readOnly = false)
    public int deleteActionsByStatusAndLastModifiedBefore(final Set<Status> status, final long lastModified) {
        if (status.isEmpty()) {
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/detailslayout/AbstractMetaDataWindowLayout.java`
#### Snippet
```java
        public MetaDataWindowGridLayout(final MetadataWindowGridHeader metadataWindowGridHeader,
                final MetaDataWindowGrid<?> metaDataWindowGrid) {
            super.buildLayout(metadataWindowGridHeader, metaDataWindowGrid);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/tenantconfiguration/polling/DurationField.java`
#### Snippet
```java
            throw new IllegalArgumentException("The duaration has to be smaller than 23:59:59.");
        }
        super.setValue(durationToLocalDateTime(duration));
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/AbstractJpaTenantAwareBaseEntity.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "BaseEntity [id=" + super.getId() + "]";
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/AbstractJpaTenantAwareBaseEntity.java`
#### Snippet
```java
            throw new TenantNotExistException("Tenant "
                    + TenantAwareHolder.getInstance().getTenantAware().getCurrentTenant()
                    + " does not exists, cannot create entity " + this.getClass() + " with id " + super.getId());
        }
        setTenant(currentTenant.toUpperCase());
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
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtSoftwareModuleResource.java`
#### Snippet
```java
                .orElseThrow(() -> new EntityNotFoundException(SoftwareModule.class, softwareModuleId));

        if (artifactId != null && !module.getArtifact(artifactId).isPresent()) {
            throw new EntityNotFoundException(Artifact.class, artifactId);
        }
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
Can be replaced with 'isEmpty()'
in `hawkbit-rest/hawkbit-ddi-resource/src/main/java/org/eclipse/hawkbit/ddi/rest/resource/DdiRootController.java`
#### Snippet
```java

    private static boolean checkModule(final String fileName, final SoftwareModule module) {
        return null == module || !module.getArtifactByFilename(fileName).isPresent();
    }

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

            for (final Entry<Long, String> tagIdWithName : tagIdsWithName.entrySet()) {
                if (!tagManagement.get(tagIdWithName.getKey()).isPresent()) {
                    deletedTags.add(tagIdWithName.getValue());
                } else {
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
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaRolloutManagement.java`
#### Snippet
```java
        final Optional<Rollout> rollout = get(rolloutId);

        if (!rollout.isPresent()) {
            return rollout;
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
Unused import `import org.springframework.util.CollectionUtils;`
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractDistributionSetTypeUpdateCreate.java`
#### Snippet
```java

import org.eclipse.hawkbit.repository.ValidString;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

```

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
Unused import `import org.springframework.web.bind.annotation.RequestMapping;`
in `hawkbit-rest/hawkbit-ddi-resource/src/main/java/org/eclipse/hawkbit/ddi/rest/resource/DdiRootController.java`
#### Snippet
```java
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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

### UNUSED_IMPORT
Unused import `import org.springframework.data.domain.PageRequest;`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTargetTagResource.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
```

### UNUSED_IMPORT
Unused import `import org.vaadin.spring.events.EventBus.UIEventBus;`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettag/filter/TargetTagFilterHeader.java`
#### Snippet
```java
import org.eclipse.hawkbit.ui.utils.UIComponentIdProvider;
import org.eclipse.hawkbit.ui.utils.UIMessageIdProvider;
import org.vaadin.spring.events.EventBus.UIEventBus;

import com.vaadin.ui.Window;
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/utils/HawkbitCommonUtil.java`
#### Snippet
```java
            slice = provider.apply(query);
            entities.addAll(slice.getContent());
        } while ((query = slice.nextPageable()) != Pageable.unpaged());

        return entities;
```

### NestedAssignment
Result of assignment expression used
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/bulkupload/BulkUploadHandler.java`
#### Snippet
```java
            try (final LineNumberReader reader = new LineNumberReader(
                    new InputStreamReader(tempStream, Charset.defaultCharset()))) {
                while ((line = reader.readLine()) != null) {
                    readLine(line, reader.getLineNumber(), totalNumberOfLines);
                }
```

### NestedAssignment
Result of assignment expression used
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaSystemManagement.java`
#### Snippet
```java
                return null;
            }));
        } while ((query = tenants.nextPageable()) != Pageable.unpaged());

    }
```

### NestedAssignment
Result of assignment expression used
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/autoassign/AbstractAutoAssignExecutor.java`
#### Snippet
```java
                }
            });
        } while ((query = filterQueries.nextPageable()) != Pageable.unpaged());
    }

```

### NestedAssignment
Result of assignment expression used
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/util/IpUtil.java`
#### Snippet
```java
        if (trackRemoteIp) {
            ip = request.getHeader(forwardHeader);
            if (ip == null || (ip = findClientIpAddress(ip)) == null) {
                ip = request.getRemoteAddr();
            }
```

### NestedAssignment
Result of assignment expression used
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/ControllerPreAuthenticatedSecurityHeaderFilter.java`
#### Snippet
```java
        int iHeader = 1;
        String foundHash;
        while ((foundHash = securityToken.getHeader(String.format(sslIssuerHashBasicHeader, iHeader))) != null) {
            if (knownHashes.contains(foundHash.toLowerCase())) {
                if (LOGGER.isTraceEnabled()) {
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`outputValue = outputValue / 1024.0` could be simplified to 'outputValue /= 1024.0'
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/SizeConversionHelper.java`
#### Snippet
```java
        String unit = KB;
        if (outputValue >= 1024) {
            outputValue = outputValue / 1024.0;
            unit = MB;
        }
```

### ReplaceAssignmentWithOperatorAssignment
`total = total + value` could be simplified to 'total += value'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/DistributionBarHelper.java`
#### Snippet
```java
        Long total = 0L;
        for (final Long value : statusTotalCountMap.values()) {
            total = total + value;
        }
        return total;
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTargetMapper.java`
#### Snippet
```java
        result.setDetailStatus(action.getStatus().toString().toLowerCase());

        action.getLastActionStatusCode().ifPresent(statusCode -> {
            result.setLastStatusCode(statusCode);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/DeleteSupport.java`
#### Snippet
```java
            final String failureNotificationText) {
        return ConfirmationDialog.newBuilder(i18n, deletionWindowId).caption(confirmationCaption)
                .question(confirmationQuestion).onSaveOrUpdate(() -> {
                    handleOkDelete(itemsToBeDeleted, successNotificationText, failureNotificationText);
                }).build();
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageDispatcherService.java`
#### Snippet
```java
                targetManagement::getByControllerID);

        eventTargets.forEach(target -> {
            cancelEvent.getActionPropertiesForController(target.getControllerId()).map(ActionProperties::getId)
                    .ifPresent(actionId -> {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageDispatcherService.java`
#### Snippet
```java
        eventTargets.forEach(target -> {
            cancelEvent.getActionPropertiesForController(target.getControllerId()).map(ActionProperties::getId)
                    .ifPresent(actionId -> {
                        sendCancelMessageToTarget(cancelEvent.getTenant(), target.getControllerId(), actionId,
                                target.getAddress());
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageDispatcherService.java`
#### Snippet
```java
    private List<Target> getTargetsWithoutPendingCancellations(final Set<String> controllerIds) {
        return partitionedParallelExecution(controllerIds, partition -> {
            return targetManagement.getByControllerID(partition).stream().filter(target -> {
                if (hasPendingCancellations(target.getControllerId())) {
                    LOG.debug("Target {} has pending cancellations. Will not send update message to it.",
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
Contents of collection `actionStatus` are queried, but never updated
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaAction.java`
#### Snippet
```java
    @CascadeOnDelete
    @OneToMany(mappedBy = "action", targetEntity = JpaActionStatus.class, fetch = FetchType.LAZY)
    private List<JpaActionStatus> actionStatus;

    @ManyToOne(fetch = FetchType.LAZY)
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
Contents of collection `rolloutGroups` are queried, but never updated
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaRollout.java`
#### Snippet
```java
    @CascadeOnDelete
    @OneToMany(targetEntity = JpaRolloutGroup.class, fetch = FetchType.LAZY, mappedBy = "rollout")
    private List<JpaRolloutGroup> rolloutGroups;

    @Column(name = "target_filter", length = TargetFilterQuery.QUERY_MAX_SIZE, nullable = false)
```

### MismatchedCollectionQueryUpdate
Contents of collection `rolloutTargetGroup` are queried, but never updated
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaRolloutGroup.java`
#### Snippet
```java
    @OneToMany(mappedBy = "rolloutGroup", fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST }, targetEntity = RolloutTargetGroup.class)
    private List<RolloutTargetGroup> rolloutTargetGroup;

    // No foreign key to avoid to many nested cascades on delete which some DBs cannot handle
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
Contents of collection `actions` are queried, but never updated
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaDistributionSet.java`
#### Snippet
```java

    @OneToMany(mappedBy = "distributionSet", targetEntity = JpaAction.class, fetch = FetchType.LAZY)
    private List<JpaAction> actions;

    @CascadeOnDelete
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

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `fileUploadId` is accessed in both synchronized and unsynchronized contexts
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileTransferHandlerVaadinUpload.java`
#### Snippet
```java
    private final long maxSize;

    private FileUploadId fileUploadId;

    FileTransferHandlerVaadinUpload(final long maxSize, final SoftwareModuleManagement softwareManagement,
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `hawkbit-dmf/hawkbit-dmf-rabbitmq-test/src/main/java/org/eclipse/hawkbit/rabbitmq/test/AbstractAmqpIntegrationTest.java`
#### Snippet
```java
        final Properties queueProps = rabbitAdmin.getQueueProperties(queueName);
        if (queueProps != null && queueProps.containsKey(RabbitAdmin.QUEUE_MESSAGE_COUNT)) {
            return Integer.parseInt(queueProps.get(RabbitAdmin.QUEUE_MESSAGE_COUNT).toString());
        }
        final int fallbackCount = 0;
```

## RuleId[id=EmptyMethod]
### EmptyMethod
Method only calls its super
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/SecurityManagedConfiguration.java`
#### Snippet
```java
        @Override
        @Bean(name = VaadinSharedSecurityConfiguration.AUTHENTICATION_MANAGER_BEAN)
        public AuthenticationManager authenticationManagerBean() throws Exception {
            return super.authenticationManagerBean();
        }
```

### EmptyMethod
Method only calls its super
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/SecurityManagedConfiguration.java`
#### Snippet
```java
            @Bean(name = VaadinSharedSecurityConfiguration.ACCESS_DECISION_MANAGER_BEAN)
            @Override
            protected AccessDecisionManager accessDecisionManager() {
                return super.accessDecisionManager();
            }
```

### EmptyMethod
All implementations of this method are empty
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/RolloutApprovalStrategy.java`
#### Snippet
```java
     *            rollout to create approval task for.
     */
    void onApprovalRequired(Rollout rollout);

    /**
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/DisposableSqlTestDatabaseExtension.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(SharedSqlTestDatabaseExtension.class);
    
    private DatasourceContext datasourceContext = null;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/RolloutTestApprovalStrategy.java`
#### Snippet
```java
public class RolloutTestApprovalStrategy implements RolloutApprovalStrategy {

    private boolean approvalNeeded = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `hawkbit-rest/hawkbit-mgmt-api/src/main/java/org/eclipse/hawkbit/mgmt/json/model/rollout/MgmtRolloutSuccessAction.java`
#### Snippet
```java

    private SuccessAction action = SuccessAction.NEXTGROUP;
    private String expression = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/DdiSecurityProperties.java`
#### Snippet
```java
             * Set to true to enable target token authentication.
             */
            private boolean enabled = false;

            public boolean isEnabled() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/DdiSecurityProperties.java`
#### Snippet
```java
             * Gateway token based authentication enabled.
             */
            private boolean enabled = false;

            /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/DdiSecurityProperties.java`
#### Snippet
```java
             * Set to true to enable anonymous DDI client authentication.
             */
            private boolean enabled = false;

            /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/HawkbitSecurityProperties.java`
#### Snippet
```java
         * Flag to enable CORS.
         */
        private boolean enabled = false;

        /**
```

## RuleId[id=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/json/model/DdiConfirmationBaseAction.java`
#### Snippet
```java
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({ "id", "confirmation", "actionHistory" })
public class DdiConfirmationBaseAction extends RepresentationModel<DdiConfirmationBaseAction> {

    @JsonProperty("id")
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-27-23-31-07.019.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `IllegalFieldAccessExeption` does not end with 'Exception'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/ParseExceptionWrapper.java`
#### Snippet
```java
    }

    static class IllegalFieldAccessExeption extends RuntimeException {
        public IllegalFieldAccessExeption(Throwable e) {
            super(e);
```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/tagdetails/TagListField.java`
#### Snippet
```java
                .append(tagData.getId()).toString();

        final Button tagButton = new Button(tagData.getName().concat(" ×"), e -> removeTagAssignment(tagData));
        tagButton.setId(tagButtonId);
        tagButton.setDescription(i18n.getMessage(UIMessageIdProvider.TOOLTIP_CLICK_TO_REMOVE));
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/detailslayout/KeyValueDetailsComponent.java`
#### Snippet
```java
        keyValueDetailLayout.setExpandRatio(valueDetail, 1.0F);

        keyValueDetailLayout.setDescription(key.concat(": ") + value);

        keyValueDetailsLayout.addComponent(keyValueDetailLayout);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java
            final StringBuilder tokens = new StringBuilder();
            expectedTokens.stream().forEach(value -> tokens.append(value.getSuggestion() + ","));
            builder = builder.concat("Was expecting :" + tokens.toString().substring(0, tokens.length() - 1));
        }
        builder = builder.replace('\r', ' ');
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

        final List<DistributionSet> result = Collections
                .unmodifiableList(allDs.stream().map(distributionSetRepository::save).collect(Collectors.toList()));

        // No reason to save the tag
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

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/WithSpringAuthorityRule.java`
#### Snippet
```java
            @Override
            public String[] removeFromAllPermission() {
                return new String[0];
            }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/WithSpringAuthorityRule.java`
#### Snippet
```java
                    permissions.addAll(Arrays.asList(additionalAuthorities));
                }
                return permissions.toArray(new String[0]);
            }
        });
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/security/OidcUserManagementAutoConfiguration.java`
#### Snippet
```java
        }

        final List<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList(roles.toArray(new String[0]));
        if (authoritiesMapper != null) {
            return new LinkedHashSet<>(authoritiesMapper.mapAuthorities(authorities));
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/providers/TargetManagementStateDataProvider.java`
#### Snippet
```java
        final Long distributionId = filter.getDistributionId();
        final boolean noTagClicked = filter.isNoTagClicked();
        final String[] targetTags = filter.getTargetTags().toArray(new String[0]);
        final Long targetFilterQueryId = filter.getTargetFilterQueryId();
        final boolean noTargetTypeClicked = filter.isNoTargetTypeClicked();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/providers/TargetManagementStateDataProvider.java`
#### Snippet
```java
        final Long distributionId = filter.getDistributionId();
        final boolean noTagClicked = filter.isNoTagClicked();
        final String[] targetTags = filter.getTargetTags().toArray(new String[0]);
        final boolean noTargetTypeClicked = filter.isNoTargetTypeClicked();
        final Long targetTypeId = filter.getTargetTypeId();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/ActionFields.java`
#### Snippet
```java
            return new String[] { ACTIVE, INACTIVE };
        }
        return new String[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaSoftwareModuleManagement.java`
#### Snippet
```java
            }
            softwareModuleRepository.deleteSoftwareModule(System.currentTimeMillis(), currentUser,
                    assignedModuleIds.toArray(new Long[0]));
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/ParseExceptionWrapper.java`
#### Snippet
```java
        return (parseException.expectedTokenSequences != null) // unclear if this can happen
                ? parseException.expectedTokenSequences
                : new int[0][0];
    }

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
Variable `successNotificationText` initializer `""` is redundant
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/dstable/InvalidateDistributionSetSupport.java`
#### Snippet
```java

    private String createSuccessNotificationText(final List<ProxyDistributionSet> allDistributionSetsForInvalidation) {
        String successNotificationText = "";
        if (allDistributionSetsForInvalidation.size() == 1) {
            successNotificationText = i18n.getMessage(
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

## RuleId[id=IndexOfReplaceableByContains]
### IndexOfReplaceableByContains
`builder.indexOf("Was expecting") != -1` can be replaced with 'builder.contains("Was expecting")'
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java

        builder = message.substring(message.indexOf(':') + 1, message.length());
        if (builder.indexOf("Was expecting") != -1) {
            builder = builder.substring(0, builder.lastIndexOf("Was expecting"));
        }
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `sort == null` is always `false`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaSoftwareModuleManagement.java`
#### Snippet
```java
        final List<Order> orders = new ArrayList<>();
        orders.add(cb.desc(assignedCaseMax));
        if (sort == null || sort.isEmpty()) {
            orders.add(cb.asc(smRoot.get(JpaSoftwareModule_.name)));
            orders.add(cb.asc(smRoot.get(JpaSoftwareModule_.version)));
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

## RuleId[id=OptionalGetWithoutIsPresent]
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

        // load also lazy stuff
        return distributionSetManagement.getWithDetails(set.getId()).get();
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
        tags.forEach(tag -> distributionSetManagement.toggleTagAssignment(Arrays.asList(set.getId()), tag.getName()));

        return distributionSetManagement.get(set.getId()).get();

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

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Start` has only 'static' members, and lacks a 'private' constructor
in `hawkbit-runtime/hawkbit-update-server/src/main/java/org/eclipse/hawkbit/app/Start.java`
#### Snippet
```java
// Exception squid:S1118 - Spring boot standard behavior
@SuppressWarnings({ "squid:S1118" })
public class Start {

    /**
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
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/components/AutoStartOptionGroupLayout.java`
#### Snippet
```java
     */
    public enum AutoStartOption {
        MANUAL, AUTO_START, SCHEDULED;

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
Method invocation `clear` may produce `NullPointerException`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtSystemManagementResource.java`
#### Snippet
```java
        final Collection<String> cacheNames = cacheManager.getCacheNames();
        LOGGER.info("Invalidating caches {}", cacheNames);
        cacheNames.forEach(cacheName -> cacheManager.getCache(cacheName).clear());
        return ResponseEntity.ok(cacheNames);
    }
```

### DataFlowIssue
Method reference argument might be null
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtSystemManagementResource.java`
#### Snippet
```java
        final Collection<String> cacheNames = cacheManager.getCacheNames();
        return ResponseEntity
                .ok(cacheNames.stream().map(cacheManager::getCache).map(this::cacheRest).collect(Collectors.toList()));
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
Passing `null` argument to parameter annotated as @NotNull
in `hawkbit-rest/hawkbit-ddi-resource/src/main/java/org/eclipse/hawkbit/ddi/rest/resource/DataConversionHelper.java`
#### Snippet
```java
            result.add(WebMvcLinkBuilder
                    .linkTo(WebMvcLinkBuilder.methodOn(DdiRootController.class, tenantAware.getCurrentTenant())
                            .putConfigData(null, tenantAware.getCurrentTenant(), target.getControllerId()))
                    .withRel(DdiRestConstants.CONFIG_DATA_ACTION).expand());
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
The call to 'isNotNull' always fails as an argument is out of bounds
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/TestdataFactory.java`
#### Snippet
```java
    private void assertTargetProperlyCreated(final Target target) {
        assertThat(target.getCreatedBy()).isNotNull();
        assertThat(target.getCreatedAt()).isNotNull();
        assertThat(target.getLastModifiedBy()).isNotNull();
        assertThat(target.getLastModifiedAt()).isNotNull();
```

### DataFlowIssue
Method invocation `clear` may produce `NullPointerException`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/cache/TenantAwareCacheManager.java`
#### Snippet
```java
    @Override
    public void evictCaches(final String tenant) {
        getCacheNames(tenant).forEach(cachename -> delegate.getCache(buildKey(tenant, cachename)).clear());
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

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/RolloutHelper.java`
#### Snippet
```java

    private static String concatAndTargetFilters(final String... filters) {
        return "(" + Arrays.stream(filters).collect(Collectors.joining(");(")) + ")";
    }

```

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
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/im/authentication/PermissionService.java`
#### Snippet
```java
        }

        authentication.getAuthorities().stream().forEach(authority -> permissions.add(authority.getAuthority()));

        return permissions;
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

## RuleId[id=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `extend()` overloads a compatible method of a superclass, when overriding might have been intended
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/TextFieldSuggestionBox.java`
#### Snippet
```java
     *            the connector to attach this extension to
     */
    public void extend(final TextField target) {
        super.extend(target);
    }
```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains array `Expect[]`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/matcher/EventVerifier.java`
#### Snippet
```java
    @Override
    public void afterTestMethod(final TestContext testContext) throws Exception {
        final Optional<Expect[]> expectedEvents = getExpectationsFrom(testContext.getTestMethod());
        try {
            expectedEvents.ifPresent(events -> afterTest(events));
```

### OptionalContainsCollection
'Optional' contains array `Expect[]`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/matcher/EventVerifier.java`
#### Snippet
```java
    @Override
    public void beforeTestMethod(final TestContext testContext) throws Exception {
        final Optional<Expect[]> expectedEvents = getExpectationsFrom(testContext.getTestMethod());
        expectedEvents.ifPresent(events -> beforeTest(testContext));
    }
```

### OptionalContainsCollection
'Optional' contains array `Expect[]`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/matcher/EventVerifier.java`
#### Snippet
```java
    }

    private Optional<Expect[]> getExpectationsFrom(final Method testMethod) {
        return Optional.ofNullable(testMethod.getAnnotation(ExpectEvents.class)).map(ExpectEvents::value);
    }
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractDistributionSetTypeUpdateCreate.java`
#### Snippet
```java
    }

    public Optional<Collection<Long>> getOptional() {
        return Optional.ofNullable(optional);
    }
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractDistributionSetTypeUpdateCreate.java`
#### Snippet
```java
    }

    public Optional<Collection<Long>> getMandatory() {
        return Optional.ofNullable(mandatory);
    }
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `hawkbit-repository/hawkbit-repository-core/src/main/java/org/eclipse/hawkbit/repository/builder/AbstractTargetTypeUpdateCreate.java`
#### Snippet
```java
     * @return  List of ID
     */
    public Optional<Collection<Long>> getCompatible() {
        return Optional.ofNullable(compatible);
    }
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java
    }

    private static Optional<List<SuggestToken>> handleSubtokenSuggestion(final String currentTokenImageName,
            final int nextTokenBeginColumn) {
        final String[] split = currentTokenImageName.split("\\.");
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java
    }

    private static Optional<List<SuggestToken>> handleFieldTokenSuggestion(final String currentTokenImageName,
            final int nextTokenBeginColumn, final int currentTokenEndColumn) {
        final boolean containsDot = currentTokenImageName.indexOf('.') != -1;
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java
        // token == 5 is the field token, reverse engineering.
        if (currentTokenKind == 5) {
            final Optional<List<SuggestToken>> handleFieldTokenSuggestion = handleFieldTokenSuggestion(
                    currentTokenImageName, nextTokenBeginColumn, currentTokenEndColumn);
            if (handleFieldTokenSuggestion.isPresent()) {
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtSystemManagementResource.java`
#### Snippet
```java
    private MgmtSystemCache guavaCache(final Cache cache, final Object nativeCache) {
        final com.google.common.cache.Cache<Object, Object> guavaCache = (com.google.common.cache.Cache<Object, Object>) nativeCache;
        final List<String> keys = guavaCache.asMap().keySet().stream().map(key -> key.toString())
                .collect(Collectors.toList());
        return new MgmtSystemCache(cache.getName(), keys);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/matcher/EventVerifier.java`
#### Snippet
```java
        final Optional<Expect[]> expectedEvents = getExpectationsFrom(testContext.getTestMethod());
        try {
            expectedEvents.ifPresent(events -> afterTest(events));
        } finally {
            expectedEvents.ifPresent(listener -> removeEventListener(testContext));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTargetMapper.java`
#### Snippet
```java

        action.getLastActionStatusCode().ifPresent(statusCode -> {
            result.setLastStatusCode(statusCode);
        });

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/providers/AbstractGenericDataProvider.java`
#### Snippet
```java
    private List<Order> convertToListOfOrders(final List<QuerySortOrder> querySortOrders) {
        return querySortOrders.stream()
                .map(querySortOrder -> convertToOrderCriteria(querySortOrder))
                .collect(Collectors.toList());
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/ControllerPreAuthenticateSecurityTokenFilter.java`
#### Snippet
```java

        return target.map(t -> new HeaderAuthentication(t.getControllerId(),
                systemSecurityContext.runAsSystemAsTenant(() -> t.getSecurityToken(), securityToken.getTenant())))
                .orElse(null);
    }
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'tenant' in a Serializable class
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/im/authentication/TenantUserPasswordAuthenticationToken.java`
#### Snippet
```java
    // Exception squid:S1948 - no need to be Serializable
    @SuppressWarnings({ "squid:S1948" })
    final Object tenant;

    /**
```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `getCrudMenuBarId()` during object construction
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/header/AbstractFilterHeader.java`
#### Snippet
```java
        super(i18n, permChecker, eventBus);

        this.crudMenuHeaderSupport = new CrudMenuHeaderSupport(i18n, getCrudMenuBarId(),
                permChecker.hasCreateRepositoryPermission(), permChecker.hasUpdateRepositoryPermission(),
                permChecker.hasDeleteRepositoryPermission(), this::addNewItem, this::publishShowEditMode,
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getCloseIconId()` during object construction
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/header/AbstractFilterHeader.java`
#### Snippet
```java
                permChecker.hasDeleteRepositoryPermission(), this::addNewItem, this::publishShowEditMode,
                this::publishShowDeleteMode, this::publishHideAllMode);
        this.closeHeaderSupport = new CloseHeaderSupport(i18n, getCloseIconId(), this::hideFilterLayout);
        addHeaderSupports(Arrays.asList(crudMenuHeaderSupport, closeHeaderSupport));
    }
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getEditIconId()` during object construction
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/header/AbstractDetailsHeader.java`
#### Snippet
```java

        if (hasEditPermission()) {
            this.editDetailsHeaderSupport = new EditDetailsHeaderSupport(i18n, getEditIconId(), this::onEdit);
        } else {
            this.editDetailsHeaderSupport = null;
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getMetaDataIconId()` during object construction
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/header/AbstractDetailsHeader.java`
#### Snippet
```java

        if (hasMetadataReadPermission()) {
            this.metaDataDetailsHeaderSupport = new MetaDataDetailsHeaderSupport(i18n, getMetaDataIconId(),
                    this::showMetaData);
        } else {
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getSearchFieldId()` during object construction
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/header/AbstractEntityGridHeader.java`
#### Snippet
```java
        this.view = view;

        this.searchHeaderSupport = new SearchHeaderSupport(i18n, getSearchFieldId(), getSearchResetIconId(),
                this::getSearchTextFromUiState, this::searchBy);
        this.filterButtonsHeaderSupport = new FilterButtonsHeaderSupport(i18n, getFilterButtonsIconId(),
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getSearchResetIconId()` during object construction
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/header/AbstractEntityGridHeader.java`
#### Snippet
```java
        this.view = view;

        this.searchHeaderSupport = new SearchHeaderSupport(i18n, getSearchFieldId(), getSearchResetIconId(),
                this::getSearchTextFromUiState, this::searchBy);
        this.filterButtonsHeaderSupport = new FilterButtonsHeaderSupport(i18n, getFilterButtonsIconId(),
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getFilterButtonsIconId()` during object construction
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/header/AbstractEntityGridHeader.java`
#### Snippet
```java
        this.searchHeaderSupport = new SearchHeaderSupport(i18n, getSearchFieldId(), getSearchResetIconId(),
                this::getSearchTextFromUiState, this::searchBy);
        this.filterButtonsHeaderSupport = new FilterButtonsHeaderSupport(i18n, getFilterButtonsIconId(),
                this::showFilterButtonsLayout, this::onLoadIsShowFilterButtonDisplayed);
        this.resizeHeaderSupport = new ResizeHeaderSupport(i18n, getMaxMinIconId(), this::maximizeTable,
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getMaxMinIconId()` during object construction
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/header/AbstractEntityGridHeader.java`
#### Snippet
```java
        this.filterButtonsHeaderSupport = new FilterButtonsHeaderSupport(i18n, getFilterButtonsIconId(),
                this::showFilterButtonsLayout, this::onLoadIsShowFilterButtonDisplayed);
        this.resizeHeaderSupport = new ResizeHeaderSupport(i18n, getMaxMinIconId(), this::maximizeTable,
                this::minimizeTable, this::onLoadIsTableMaximized);

```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getMessageKeyEntityTypeSing()` during object construction
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/filterlayout/AbstractFilterButtons.java`
#### Snippet
```java
        super(i18n, eventBus, permChecker);

        this.filterButtonDeleteSupport = new DeleteSupport<>(this, i18n, notification, getMessageKeyEntityTypeSing(),
                getMessageKeyEntityTypePlur(), ProxyFilterButton::getName, this::deleteFilterButtons,
                UIComponentIdProvider.FILTER_BUTTON_DELETE_CONFIRMATION_DIALOG);
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getMessageKeyEntityTypePlur()` during object construction
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/filterlayout/AbstractFilterButtons.java`
#### Snippet
```java

        this.filterButtonDeleteSupport = new DeleteSupport<>(this, i18n, notification, getMessageKeyEntityTypeSing(),
                getMessageKeyEntityTypePlur(), ProxyFilterButton::getName, this::deleteFilterButtons,
                UIComponentIdProvider.FILTER_BUTTON_DELETE_CONFIRMATION_DIALOG);
    }
```

## RuleId[id=RedundantCollectionOperation]
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
`contains` can be replaced with 'Map.containsKey()'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/FilterSupport.java`
#### Snippet
```java
     */
    public boolean isFilterTypeSupported(final FilterType filterType) {
        return filterTypeToSetterMapping.keySet().contains(filterType);
    }

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
     * @param lastTargetQuery
     *            last time the target polled
     * @return set of {@link Target}
     */
    public List<Target> createTargets(final int numberOfTargets, final String controllerIdPrefix,
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
     * Get all the IDs of uploaded files from the upload process
     *
     * @return List of IDs of  uploaded files
     */
    public Set<FileUploadId> getAllFileUploadIdsFromOverallUploadProcessList() {
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
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/tenantconfiguration/repository/ActionAutoCleanupConfigurationItem.java`
#### Snippet
```java

        /**
         * @return List of status
         */
        public Set<Status> getStatus() {
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

## RuleId[id=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettag/filter/FilterByStatusLayout.java`
#### Snippet
```java
        this.eventBus = eventBus;
        this.targetTagFilterLayoutUiState = targetTagFilterLayoutUiState;
        this.activeStatusFilters = new HashSet<>();
        this.isOverdueFilterActive = false;

```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/AbstractHawkbitUI.java`
#### Snippet
```java
        private String getStartView(final String viewName) {
            final DashboardMenuItem view = dashboardMenu.getByViewName(viewName);
            if ("".equals(viewName) && !dashboardMenu.isAccessibleViewsEmpty()) {
                return dashboardMenu.getInitialViewName();
            }
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Double.parseDouble()` call can be used instead
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/notification/client/ParallelNotificationConnector.java`
#### Snippet
```java
    private static double getMarginBottom(final VNotification notification) {
        try {
            return Double.valueOf(
                    notification.getElement().getStyle().getMarginBottom().trim().toLowerCase().replace("px", ""));
        } catch (final NumberFormatException e) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaRolloutGroupManagement.java`
#### Snippet
```java

        final TotalTargetCountStatus totalTargetCountStatus = new TotalTargetCountStatus(rolloutStatusCountItems,
                Long.valueOf(jpaRolloutGroup.getTotalTargets()), jpaRolloutGroup.getRollout().getActionType());
        jpaRolloutGroup.setTotalTargetCountStatus(totalTargetCountStatus);
        return rolloutGroup;
```

### UnnecessaryBoxing
Unnecessary boxing
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaRolloutGroupManagement.java`
#### Snippet
```java
        for (final RolloutGroup rolloutGroup : rolloutGroups) {
            final TotalTargetCountStatus totalTargetCountStatus = new TotalTargetCountStatus(
                    allStatesForRollout.get(rolloutGroup.getId()), Long.valueOf(rolloutGroup.getTotalTargets()),
                    rolloutGroup.getRollout().getActionType());
            ((JpaRolloutGroup) rolloutGroup).setTotalTargetCountStatus(totalTargetCountStatus);
```

### UnnecessaryBoxing
Unnecessary boxing
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaRolloutGroupManagement.java`
#### Snippet
```java
        for (final JpaRolloutGroup rolloutGroup : rolloutGroups) {
            final TotalTargetCountStatus totalTargetCountStatus = new TotalTargetCountStatus(
                    allStatesForRollout.get(rolloutGroup.getId()), Long.valueOf(rolloutGroup.getTotalTargets()),
                    rolloutGroup.getRollout().getActionType());
            rolloutGroup.setTotalTargetCountStatus(totalTargetCountStatus);
```

### UnnecessaryBoxing
Unnecessary boxing
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaRolloutGroup.java`
#### Snippet
```java
    public TotalTargetCountStatus getTotalTargetCountStatus() {
        if (totalTargetCountStatus == null) {
            totalTargetCountStatus = new TotalTargetCountStatus(Long.valueOf(totalTargets), rollout.getActionType());
        }
        return totalTargetCountStatus;
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

## RuleId[id=ConditionCoveredByFurtherCondition]
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

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/MsSqlTestDatabase.java`
#### Snippet
```java
    protected void dropRandomSchema() {
        final String uri = context.getDatasourceUrl();
        final String dbServerUri = uri.split(";database=")[0];
        LOGGER.info("\033[0;33mDropping mssql schema {} \033[0m", context.getRandomSchemaName());

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/MsSqlTestDatabase.java`
#### Snippet
```java
        LOGGER.info("\033[0;33mCreating mssql schema {} \033[0m", context.getRandomSchemaName());

        executeStatement(uri.split(";database=")[0], "CREATE DATABASE " + context.getRandomSchemaName() + ";");
        return this;
    }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/util/HttpUtil.java`
#### Snippet
```java
     */
    public static boolean matchesHttpHeader(final String matchHeader, final String toMatch) {
        final String[] matchValues = matchHeader.split("\\s*,\\s*");
        Arrays.sort(matchValues);
        return Arrays.binarySearch(matchValues, toMatch) > -1 || Arrays.binarySearch(matchValues, "*") > -1;
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/util/FileStreamingUtil.java`
#### Snippet
```java

            // Range header matches"bytes=n-n,n-n,n-n..."
            if (!range.matches("^bytes=\\d*-\\d*(,\\d*-\\d*)*+$")) {
                response.setHeader(HttpHeaders.CONTENT_RANGE, "bytes */" + length);
                LOG.debug("range header for filename ({}) is not satisfiable: ", filename);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/tenantconfiguration/RepositoryConfigurationView.java`
#### Snippet
```java
        final TenantConfigurationValue<String> statusStr = readConfigValue(ACTION_CLEANUP_ACTION_STATUS, String.class);
        if (statusStr != null) {
            return Arrays.stream(statusStr.getValue().split("[;,]")).map(Action.Status::valueOf)
                    .collect(Collectors.toSet());
        }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/autocleanup/AutoActionCleanup.java`
#### Snippet
```java
        final TenantConfigurationValue<String> statusStr = getConfigValue(ACTION_CLEANUP_ACTION_STATUS, String.class);
        if (statusStr != null) {
            return Arrays.stream(statusStr.getValue().split("[;,]")).map(Status::valueOf)
                    .collect(Collectors.toCollection(() -> EnumSet.noneOf(Status.class)));
        }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/ControllerPreAuthenticatedSecurityHeaderFilter.java`
#### Snippet
```java

    private static List<String> splitMultiHashBySemicolon(final String knownIssuerHashes) {
        return Arrays.stream(knownIssuerHashes.split("[;,]")).map(String::toLowerCase).collect(Collectors.toList());
    }
}
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.hawkbit.tenancy` is unnecessary and can be removed
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/SystemManagement.java`
#### Snippet
```java
    /**
     * Runs consumer for each teant as
     * {@link TenantAware#runAsTenant(String, org.eclipse.hawkbit.tenancy.TenantAware.TenantRunner)}
     * sliently (i.e. exceptions will be logged but operations will continue for
     * further tenants).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.hawkbit.repository.model` is unnecessary and can be removed
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/TargetManagement.java`
#### Snippet
```java
     *
     * @param controllerId
     *            of the {@link org.eclipse.hawkbit.repository.model.Target} to
     *            check
     * @param distributionSetId
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.hawkbit.repository.model` is unnecessary and can be removed
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/TargetManagement.java`
#### Snippet
```java
     * @param distributionSetId
     *            of the
     *            {@link org.eclipse.hawkbit.repository.model.DistributionSet}
     *            to consider
     * @param targetFilterQuery
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.hawkbit.repository.model` is unnecessary and can be removed
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/model/DeploymentRequest.java`
#### Snippet
```java
     *            required, the action will be automatically confirmed and put in
     *            the
     *            {@link org.eclipse.hawkbit.repository.model.Action.Status#RUNNING}
     *            state. Otherwise the confirmation flow will be triggered
     *            and the {@link Action} will stay in the
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.hawkbit.repository.model` is unnecessary and can be removed
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/model/DeploymentRequest.java`
#### Snippet
```java
     *            state. Otherwise the confirmation flow will be triggered
     *            and the {@link Action} will stay in the
     *            {@link org.eclipse.hawkbit.repository.model.Action.Status#WAIT_FOR_CONFIRMATION}
     *            state until the confirmation is given. (Only considered
     *            with CONFIRMATION_FLOW active via tenant configuration)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.http` is unnecessary and can be removed
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     * @param body
     *            as {@link DdiActivateAutoConfirmation}
     * @return {@link org.springframework.http.HttpStatus#OK} if successful or
     *         {@link org.springframework.http.HttpStatus#CONFLICT} in case
     *         auto-confirmation was active already.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.http` is unnecessary and can be removed
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     *            as {@link DdiActivateAutoConfirmation}
     * @return {@link org.springframework.http.HttpStatus#OK} if successful or
     *         {@link org.springframework.http.HttpStatus#CONFLICT} in case
     *         auto-confirmation was active already.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.http` is unnecessary and can be removed
in `hawkbit-rest/hawkbit-ddi-api/src/main/java/org/eclipse/hawkbit/ddi/rest/api/DdiRootControllerRestApi.java`
#### Snippet
```java
     * @param controllerId
     *            to disable auto-confirmation for
     * @return {@link org.springframework.http.HttpStatus#OK} if successfully
     *         executed
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vaadin.event` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/utils/ShortCutModifierUtils.java`
#### Snippet
```java
     * 
     * @return on mac return
     *         {@link com.vaadin.event.ShortcutAction.ModifierKey#META} other
     *         platform return
     *         {@link com.vaadin.event.ShortcutAction.ModifierKey#CTRL}
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vaadin.event` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/utils/ShortCutModifierUtils.java`
#### Snippet
```java
     *         {@link com.vaadin.event.ShortcutAction.ModifierKey#META} other
     *         platform return
     *         {@link com.vaadin.event.ShortcutAction.ModifierKey#CTRL}
     */
    public static int getCtrlOrMetaModifier() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vaadin.ui` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/utils/HawkbitCommonUtil.java`
#### Snippet
```java
     *
     * @return the current locale, never {@code null}.
     * @see com.vaadin.ui.UI#getLocale()
     * @see java.util.Locale#getDefault()
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/utils/HawkbitCommonUtil.java`
#### Snippet
```java
     * @return the current locale, never {@code null}.
     * @see com.vaadin.ui.UI#getLocale()
     * @see java.util.Locale#getDefault()
     */
    public static Locale getCurrentLocale() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vaadin.server` is unnecessary, and can be replaced with an import
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/utils/SPDateTimeUtil.java`
#### Snippet
```java
        }

        final WebBrowser webBrowser = com.vaadin.server.Page.getCurrent().getWebBrowser();
        final String[] timeZones = TimeZone.getAvailableIDs(webBrowser.getRawTimezoneOffset());
        TimeZone tz = TimeZone.getDefault();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vaadin.event` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/selection/RangeSelectionModel.java`
#### Snippet
```java
         * 
         * @return on mac return
         *         {@link com.vaadin.event.ShortcutAction.ModifierKey#META}
         *         other platform return
         *         {@link com.vaadin.event.ShortcutAction.ModifierKey#CTRL}
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vaadin.event` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/selection/RangeSelectionModel.java`
#### Snippet
```java
         *         {@link com.vaadin.event.ShortcutAction.ModifierKey#META}
         *         other platform return
         *         {@link com.vaadin.event.ShortcutAction.ModifierKey#CTRL}
         */
        public static int getCtrlOrMetaModifier() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vaadin.ui` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileTransferHandlerVaadinUpload.java`
#### Snippet
```java
     * Upload failed for {@link Upload} variant.
     *
     * @see com.vaadin.ui.Upload.FailedListener#uploadFailed(com.vaadin.ui.Upload.FailedEvent)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vaadin.ui` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileTransferHandlerVaadinUpload.java`
#### Snippet
```java
     * Upload failed for {@link Upload} variant.
     *
     * @see com.vaadin.ui.Upload.FailedListener#uploadFailed(com.vaadin.ui.Upload.FailedEvent)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vaadin.ui` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileTransferHandlerVaadinUpload.java`
#### Snippet
```java
     * Reports progress in {@link Upload} variant.
     *
     * @see com.vaadin.ui.Upload.ProgressListener#updateProgress(long, long)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vaadin.ui` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileTransferHandlerVaadinUpload.java`
#### Snippet
```java
     * Upload sucessfull for {@link Upload} variant.
     *
     * @see com.vaadin.ui.Upload.SucceededListener#uploadSucceeded(com.vaadin.ui.Upload.SucceededEvent)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vaadin.ui` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileTransferHandlerVaadinUpload.java`
#### Snippet
```java
     * Upload sucessfull for {@link Upload} variant.
     *
     * @see com.vaadin.ui.Upload.SucceededListener#uploadSucceeded(com.vaadin.ui.Upload.SucceededEvent)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vaadin.ui` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileTransferHandlerVaadinUpload.java`
#### Snippet
```java
     * Create stream for {@link Upload} variant.
     *
     * @see com.vaadin.ui.Upload.Receiver#receiveUpload(java.lang.String,
     *      java.lang.String)
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileTransferHandlerVaadinUpload.java`
#### Snippet
```java
     * Create stream for {@link Upload} variant.
     *
     * @see com.vaadin.ui.Upload.Receiver#receiveUpload(java.lang.String,
     *      java.lang.String)
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileTransferHandlerVaadinUpload.java`
#### Snippet
```java
     *
     * @see com.vaadin.ui.Upload.Receiver#receiveUpload(java.lang.String,
     *      java.lang.String)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vaadin.ui` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileTransferHandlerVaadinUpload.java`
#### Snippet
```java
     * Upload started for {@link Upload} variant.
     *
     * @see com.vaadin.ui.Upload.StartedListener#uploadStarted(com.vaadin.ui.Upload.StartedEvent)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vaadin.ui` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileTransferHandlerVaadinUpload.java`
#### Snippet
```java
     * Upload started for {@link Upload} variant.
     *
     * @see com.vaadin.ui.Upload.StartedListener#uploadStarted(com.vaadin.ui.Upload.StartedEvent)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vaadin.ui` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileTransferHandlerVaadinUpload.java`
#### Snippet
```java
     * variant.
     *
     * @see com.vaadin.ui.Upload.FinishedListener#uploadFinished(com.vaadin.ui.Upload.FinishedEvent)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vaadin.ui` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileTransferHandlerVaadinUpload.java`
#### Snippet
```java
     * variant.
     *
     * @see com.vaadin.ui.Upload.FinishedListener#uploadFinished(com.vaadin.ui.Upload.FinishedEvent)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vaadin.server` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileTransferHandlerStreamVariable.java`
#### Snippet
```java
     * case.
     *
     * @see com.vaadin.server.StreamVariable#streamingFinished(com.vaadin.server.StreamVariable.StreamingEndEvent)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vaadin.server` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileTransferHandlerStreamVariable.java`
#### Snippet
```java
     * case.
     *
     * @see com.vaadin.server.StreamVariable#streamingFinished(com.vaadin.server.StreamVariable.StreamingEndEvent)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vaadin.server` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileTransferHandlerStreamVariable.java`
#### Snippet
```java
     * Reports progress in {@link StreamVariable} variant. Interrupts
     *
     * @see com.vaadin.server.StreamVariable#onProgress(com.vaadin.server.StreamVariable.StreamingProgressEvent)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vaadin.server` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/upload/FileTransferHandlerStreamVariable.java`
#### Snippet
```java
     * Reports progress in {@link StreamVariable} variant. Interrupts
     *
     * @see com.vaadin.server.StreamVariable#onProgress(com.vaadin.server.StreamVariable.StreamingProgressEvent)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.hawkbit.ui.filtermanagement.client` is unnecessary and can be removed
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/client/TextFieldSuggestionBoxServerRpc.java`
#### Snippet
```java
     * Parses the given RSQL based query and try finding suggestions at the
     * current given cursor position. When suggestions are possible the
     * {@link TextFieldSuggestionBoxClientRpc#showSuggestions(org.eclipse.hawkbit.ui.filtermanagement.client.SuggestionContextDto)}
     * is called as a callback mechanism back to the client.
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.boot.autoconfigure.orm.jpa` is unnecessary and can be removed
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/RepositoryApplicationConfiguration.java`
#### Snippet
```java
     * {@link MultiTenantJpaTransactionManager} bean.
     *
     * @see org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration#transactionManager(ObjectProvider)
     * @return a new {@link PlatformTransactionManager}
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/AbstractJpaBaseEntity.java`
#### Snippet
```java
     * {@link #getOptLockRevision()} and class.
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/AbstractJpaBaseEntity.java`
#### Snippet
```java
     * {@link #getOptLockRevision()} and class.
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/AbstractJpaBaseEntity.java`
#### Snippet
```java
     * {@link #getOptLockRevision()} and class.
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/AbstractJpaTenantAwareBaseEntity.java`
#### Snippet
```java
     * different tenants.
     * 
     * @see org.eclipse.hawkbit.repository.model.BaseEntity#equals(java.lang.Object)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.validation` is unnecessary, and can be replaced with an import
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/aspects/ExceptionMappingAspectHandler.java`
#### Snippet
```java
        do {
            final Throwable cause = exception.getCause();
            if (cause instanceof javax.validation.ConstraintViolationException) {
                return (Exception) cause;
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/im/authentication/UserAuthenticationFilter.java`
#### Snippet
```java
 * in any remote call through HTTP except the SP login screen. E.g. using the SP
 * REST-API. To authenticate user e.g. using Basic-Authentication implement the
 * {@link #doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)}
 * method.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/im/authentication/UserAuthenticationFilter.java`
#### Snippet
```java
 * in any remote call through HTTP except the SP login screen. E.g. using the SP
 * REST-API. To authenticate user e.g. using Basic-Authentication implement the
 * {@link #doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)}
 * method.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/im/authentication/UserAuthenticationFilter.java`
#### Snippet
```java
 * in any remote call through HTTP except the SP login screen. E.g. using the SP
 * REST-API. To authenticate user e.g. using Basic-Authentication implement the
 * {@link #doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)}
 * method.
 *
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator never returns negative value
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/AbstractIntegrationTest.java`
#### Snippet
```java

    protected static Comparator<Target> controllerIdComparator() {
        return (o1, o2) -> o1.getControllerId().equals(o2.getControllerId()) ? 0 : 1;
    }

```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractSqlTestDatabase()` of an abstract class should not be declared 'public'
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/AbstractSqlTestDatabase.java`
#### Snippet
```java
    protected final DatasourceContext context;

    public AbstractSqlTestDatabase(final DatasourceContext context) {
        this.context = context;
    }
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `deploymentRequests`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDeploymentManagement.java`
#### Snippet
```java
    private List<DeploymentRequest> validateRequestForAssignments(List<DeploymentRequest> deploymentRequests) {
        if (!isMultiAssignmentsEnabled()) {
            deploymentRequests = deploymentRequests.stream().distinct().collect(Collectors.toList());
            checkIfRequiresMultiAssignment(deploymentRequests);
        }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/tenancy/configuration/DurationHelper.java`
#### Snippet
```java
    public static Duration formattedStringToDuration(final String formattedDuration) {
        if (formattedDuration == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/tenancy/configuration/DurationHelper.java`
#### Snippet
```java
    public static String durationToFormattedString(final Duration duration) {
        if (duration == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/event/remote/entity/RemoteEntityEvent.java`
#### Snippet
```java
            LOG.error("Cannot reload entity because class is not found", e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-api/src/main/java/org/eclipse/hawkbit/repository/model/BaseEntity.java`
#### Snippet
```java

    static Long getIdOrNull(final BaseEntity entity) {
        return entity == null ? null : entity.getId();
    }

```

### ReturnNull
Return of `null`
in `hawkbit-http-security/src/main/java/org/eclipse/hawkbit/security/ControllerTenantAwareAuthenticationDetailsSource.java`
#### Snippet
```java
            LOGGER.info("Controller request not matching tenant aware request pattern requestpath: {}, pattern {}",
                    requestURI, TENANT_AWARE_CONTROLLER_PATTERN);
            return null;
        }
        final Map<String, String> extractUriTemplateVariables = pathExtractor
```

### ReturnNull
Return of `null`
in `hawkbit-http-security/src/main/java/org/eclipse/hawkbit/security/HttpDownloadAuthenticationFilter.java`
#### Snippet
```java
        final Matcher matcher = pattern.matcher(requestURI);
        if (!matcher.matches()) {
            return null;
        }
        LOG.debug("retrieving id from URI request {}", requestURI);
```

### ReturnNull
Return of `null`
in `hawkbit-http-security/src/main/java/org/eclipse/hawkbit/security/HttpDownloadAuthenticationFilter.java`
#### Snippet
```java
        final String id = groups[groups.length - 1];
        if (id == null) {
            return null;
        }
        return downloadIdCache.get(id);
```

### ReturnNull
Return of `null`
in `hawkbit-http-security/src/main/java/org/eclipse/hawkbit/security/AbstractHttpControllerAuthenticationFilter.java`
#### Snippet
```java
        final DmfTenantSecurityToken secruityToken = createTenantSecruityTokenVariables(request);
        if (secruityToken == null) {
            return null;
        }
        return abstractControllerAuthenticationFilter.getPreAuthenticatedPrincipal(secruityToken);
```

### ReturnNull
Return of `null`
in `hawkbit-http-security/src/main/java/org/eclipse/hawkbit/security/AbstractHttpControllerAuthenticationFilter.java`
#### Snippet
```java
                        CONTROLLER_REQUEST_ANT_PATTERN);
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `hawkbit-http-security/src/main/java/org/eclipse/hawkbit/security/AbstractHttpControllerAuthenticationFilter.java`
#### Snippet
```java
        final DmfTenantSecurityToken secruityToken = createTenantSecruityTokenVariables(request);
        if (secruityToken == null) {
            return null;
        }
        return abstractControllerAuthenticationFilter.getPreAuthenticatedCredentials(secruityToken);
```

### ReturnNull
Return of `null`
in `hawkbit-autoconfigure/src/main/java/org/eclipse/hawkbit/autoconfigure/repository/event/EventPublisherAutoConfiguration.java`
#### Snippet
```java
            tenantAware.runAsTenant(remoteEvent.getTenant(), () -> {
                super.multicastEvent(event, eventType);
                return null;
            });
        }
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/HashGeneratorUtils.java`
#### Snippet
```java
            LOG.error("Algorithm could not be found", e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-artifact-repository-filesystem/src/main/java/org/eclipse/hawkbit/artifact/repository/ArtifactFilesystemRepository.java`
#### Snippet
```java
        final File file = getFile(tenant, sha1);
        if (!file.exists()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/CleanupTestExecutionListener.java`
#### Snippet
```java
                    applicationContext.getBean(SystemSecurityContext.class),
                    applicationContext.getBean(SystemManagement.class)).clearTestRepository();
            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/RolloutTestApprovalStrategy.java`
#### Snippet
```java
    @Override
    public String getApprovalUser(Rollout rollout) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/JpaTestRepositoryManagement.java`
#### Snippet
```java
                systemSecurityContext.runAsSystem(() -> {
                    systemManagement.deleteTenant(tenant);
                    return null;
                });
            } catch (final Exception e) {
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/WithSpringAuthorityRule.java`
#### Snippet
```java
            @Override
            public String credentials() {
                return null;
            }

```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-test/src/main/java/org/eclipse/hawkbit/repository/test/util/WithSpringAuthorityRule.java`
#### Snippet
```java
            return context.getRequiredTestClass().getAnnotation(WithUser.class);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtRestModelMapper.java`
#### Snippet
```java
    public static MgmtActionType convertActionType(final ActionType actionType) {
        if (actionType == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtRestModelMapper.java`
#### Snippet
```java
    public static ActionType convertActionType(final MgmtActionType actionTypeRest) {
        if (actionTypeRest == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtRestModelMapper.java`
#### Snippet
```java
    public static CancelationType convertCancelationType(final MgmtCancelationType cancelationType) {
        if (cancelationType == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtSoftwareModuleMapper.java`
#### Snippet
```java
    static MgmtSoftwareModule toResponse(final SoftwareModule softwareModule) {
        if (softwareModule == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtDistributionSetMapper.java`
#### Snippet
```java
    static MgmtDistributionSet toResponse(final DistributionSet distributionSet) {
        if (distributionSet == null) {
            return null;
        }
        final MgmtDistributionSet response = new MgmtDistributionSet();
```

### ReturnNull
Return of `null`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTargetResource.java`
#### Snippet
```java

    private <T, R> R getNullIfEmpty(final T object, final Function<T, R> extractMethod) {
        return object == null ? null : extractMethod.apply(object);
    }

```

### ReturnNull
Return of `null`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTagMapper.java`
#### Snippet
```java
        final MgmtTag response = new MgmtTag();
        if (distributionSetTag == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTargetMapper.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-rest/hawkbit-mgmt-resource/src/main/java/org/eclipse/hawkbit/mgmt/rest/resource/MgmtTargetMapper.java`
#### Snippet
```java
    public static MgmtTarget toResponse(final Target target, final TenantConfigHelper configHelper) {
        if (target == null) {
            return null;
        }
        final MgmtTarget targetRest = new MgmtTarget();
```

### ReturnNull
Return of `null`
in `hawkbit-rest/hawkbit-rest-core/src/main/java/org/eclipse/hawkbit/rest/util/FileStreamingUtil.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpControllerAuthentication.java`
#### Snippet
```java

        if (!filter.isEnable(secruityToken)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpControllerAuthentication.java`
#### Snippet
```java
        if (principal == null) {
            LOGGER.debug("No pre-authenticated principal found in message");
            return null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/BaseAmqpService.java`
#### Snippet
```java
        if (value == null) {
            logAndThrowMessageError(message, errorMessageIfNull);
            return null;
        }
        return value.toString();
```

### ReturnNull
Return of `null`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageHandlerService.java`
#### Snippet
```java
        logAndThrowMessageError(message,
                "Cancel rejected message is not allowed, if action is on state: " + action.getStatus());
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageHandlerService.java`
#### Snippet
```java
            return UpdateMode.valueOf(mode.name());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-dmf/hawkbit-dmf-amqp/src/main/java/org/eclipse/hawkbit/amqp/AmqpMessageHandlerService.java`
#### Snippet
```java
            SecurityContextHolder.setContext(oldContext);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-rest/hawkbit-ddi-resource/src/main/java/org/eclipse/hawkbit/ddi/rest/resource/DataConversionHelper.java`
#### Snippet
```java

    private static List<DdiMetadata> mapMetadata(final List<SoftwareModuleMetadata> metadata) {
        return CollectionUtils.isEmpty(metadata) ? null
                : metadata.stream().map(md -> new DdiMetadata(md.getKey(), md.getValue())).collect(Collectors.toList());
    }
```

### ReturnNull
Return of `null`
in `hawkbit-rest/hawkbit-ddi-resource/src/main/java/org/eclipse/hawkbit/ddi/rest/resource/DdiRootController.java`
#### Snippet
```java
                    : DdiMaintenanceWindowStatus.UNAVAILABLE;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-rest/hawkbit-ddi-resource/src/main/java/org/eclipse/hawkbit/ddi/rest/resource/DdiRootController.java`
#### Snippet
```java
            return UpdateMode.valueOf(mode.name());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/UserDetailsFormatter.java`
#### Snippet
```java
        final UserDetails userDetails = getCurrentUser();
        if (!(userDetails instanceof UserPrincipal)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/AbstractEventListenersAwareView.java`
#### Snippet
```java
                return new AbstractMap.SimpleEntry<>(keyValue[0], keyValue[1]);
            }
            return null;
        }).filter(Objects::nonNull)
                .collect(Collectors.toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue));
```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/AbstractEntityWindowController.java`
#### Snippet
```java

    protected Class<? extends ProxyIdentifiableEntity> getParentEntityClass() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/utils/SPDateTimeUtil.java`
#### Snippet
```java
            return format.format(new Date(lastQueryDate));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/mappers/TargetToProxyTargetMapper.java`
#### Snippet
```java
                    i18n));
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/proxies/ProxyRolloutForm.java`
#### Snippet
```java

    public String getTargetFilterQuery() {
        return targetFilterInfo != null ? targetFilterInfo.getQuery() : null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/AbstractEntityWindowBuilder.java`
#### Snippet
```java
    protected String getHelpLink() {
        // can be overriden to provide help link to documentation
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/proxies/ProxyAdvancedRolloutGroup.java`
#### Snippet
```java

    public String getTargetFilterQuery() {
        return targetFilterInfo != null ? targetFilterInfo.getQuery() : null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/proxies/ProxyRollout.java`
#### Snippet
```java

    public String getDsNameVersion() {
        return dsInfo != null ? dsInfo.getNameVersion() : null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/proxies/ProxyRolloutWindow.java`
#### Snippet
```java
        case MANUAL:
        default:
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/data/proxies/ProxyRolloutWindow.java`
#### Snippet
```java
     */
    public Long getDistributionSetId() {
        return rolloutForm.getDistributionSetInfo() != null ? rolloutForm.getDistributionSetInfo().getId() : null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/MasterEntitySupport.java`
#### Snippet
```java
    private Object getMasterEntityFilter(final M masterEntity) {
        if (masterEntity == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/PinSupport.java`
#### Snippet
```java
    public String getPinningStyle(final T item) {
        if (isPinned(item.getId())) {
            return null;
        } else {
            return SPUIStyleDefinitions.UN_PINNED_STYLE;
```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/PinSupport.java`
#### Snippet
```java
    public String getAssignedOrInstalledRowStyle(final Long itemId) {
        if (!isPinFilterActive()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/grid/support/PinSupport.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/layout/listener/ViewAwareListener.java`
#### Snippet
```java
     */
    public EventView getView() {
        return viewAware != null ? viewAware.getView() : null;
    }
}
```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/filterlayout/AbstractFilterButtons.java`
#### Snippet
```java
                return SPUIStyleDefinitions.SP_FILTER_BTN_CLICKED_STYLE;
            } else {
                return null;
            }
        };
```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/layouts/AbstractRolloutWindowLayout.java`
#### Snippet
```java
                    e.getMessage(), validationErrors);

            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/layouts/AddRolloutWindowLayout.java`
#### Snippet
```java
    private Long getTotalTargets(final String filterQuery, final Long distSetTypeId) {
        if (StringUtils.isEmpty(filterQuery)) {
            return null;
        }
        if (distSetTypeId == null) {
```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/components/SimpleGroupsLayout.java`
#### Snippet
```java
                }).withConverter(errorThresholdPresentation -> {
                    if (errorThresholdPresentation == null) {
                        return null;
                    }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/components/SimpleGroupsLayout.java`
#### Snippet
```java
                }, errorThresholdModel -> {
                    if (errorThresholdModel == null) {
                        return null;
                    }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/components/AutoStartOptionGroupLayout.java`
#### Snippet
```java
                return VaadinIcons.CLOCK;
            default:
                return null;
            }
        });
```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/components/AutoStartOptionGroupLayout.java`
#### Snippet
```java
                return i18n.getMessage("caption.rollout.start.scheduled");
            default:
                return null;
            }
        });
```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/window/components/AutoStartOptionGroupLayout.java`
#### Snippet
```java
                return i18n.getMessage("caption.rollout.start.scheduled.desc");
            default:
                return null;
            }
        });
```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/StatusIconBuilder.java`
#### Snippet
```java
        public Label getLabel(final ProxyAction action) {
            if (ActionType.TIMEFORCED != action.getActionType()) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/smtype/SmTypeWindowLayoutComponentBuilder.java`
#### Snippet
```java
                return i18n.getMessage("label.multiAssign.type");
            default:
                return null;
            }
        });
```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/smtype/SmTypeWindowLayoutComponentBuilder.java`
#### Snippet
```java
                return i18n.getMessage("label.multiAssign.type.desc");
            default:
                return null;
            }
        });
```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/rollout/rollout/RolloutGrid.java`
#### Snippet
```java
            return SPUIDefinitions.INVALID_DISTRIBUTION;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/FormComponentBuilder.java`
#### Snippet
```java
        final Binding<T, ProxyTargetFilterQueryInfo> binding = bindingBuilder.withConverter(tfq -> {
            if (tfq == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/FormComponentBuilder.java`
#### Snippet
```java
        }, tfqInfo -> {
            if (tfqInfo == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/FormComponentBuilder.java`
#### Snippet
```java
                .asRequired(i18n.getMessage("message.scheduledTime.cannotBeEmpty")).withConverter(localDateTime -> {
                    if (localDateTime == null) {
                        return null;
                    }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/FormComponentBuilder.java`
#### Snippet
```java
                }, startAtTime -> {
                    if (startAtTime == null) {
                        return null;
                    }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/FormComponentBuilder.java`
#### Snippet
```java
                .withConverter(ds -> {
                    if (ds == null) {
                        return null;
                    }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/FormComponentBuilder.java`
#### Snippet
```java
                }, dsInfo -> {
                    if (dsInfo == null) {
                        return null;
                    }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/FormComponentBuilder.java`
#### Snippet
```java
                .asRequired(i18n.getMessage("message.forcedTime.cannotBeEmpty")).withConverter(localDateTime -> {
                    if (localDateTime == null) {
                        return null;
                    }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/common/builder/FormComponentBuilder.java`
#### Snippet
```java
                }, forcedTime -> {
                    if (forcedTime == null) {
                        return null;
                    }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/artifacts/smtable/SoftwareModuleGrid.java`
#### Snippet
```java
        setStyleGenerator(sm -> {
            if (masterEntitySupport.getMasterId() == null || !sm.isAssigned()) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/miscs/AbstractActionTypeOptionGroupLayout.java`
#### Snippet
```java
                return VaadinIcons.DOWNLOAD;
            default:
                return null;
            }
        });
```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/miscs/AbstractActionTypeOptionGroupLayout.java`
#### Snippet
```java
                return i18n.getMessage(UIMessageIdProvider.CAPTION_ACTION_DOWNLOAD_ONLY);
            default:
                return null;
            }
        });
```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/miscs/AbstractActionTypeOptionGroupLayout.java`
#### Snippet
```java
                return i18n.getMessage(UIMessageIdProvider.TOOLTIP_DOWNLOAD_ONLY_ITEM);
            default:
                return null;
            }
        });
```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/dstable/InvalidateDsConsequencesDialog.java`
#### Snippet
```java
            return i18n.getMessage(UIMessageIdProvider.TOOLTIP_DISTRIBUTIONSET_INVALIDATE_NONE);
        default:
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/dstable/InvalidateDsConsequencesDialog.java`
#### Snippet
```java
            return i18n.getMessage(UIMessageIdProvider.LABEL_CANCEL_ACTION_NONE);
        default:
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/targettag/filter/TargetFilterQueryButtons.java`
#### Snippet
```java
                return SPUIStyleDefinitions.SP_FILTER_BTN_CLICKED_STYLE;
            } else {
                return null;
            }
        };
```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/bulkupload/BulkUploadHandler.java`
#### Snippet
```java
            }
            if (deletedTags.isEmpty()) {
                return null;
            }
            if (deletedTags.size() == 1) {
```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/management/bulkupload/BulkUploadHandler.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/AutoAssignmentWindowController.java`
#### Snippet
```java
        // this subclass cares itself for persisting the entity because of
        // special requirements (multiple confirmation dialogs).
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/AutoAssignmentWindowController.java`
#### Snippet
```java
        // this subclass cares itself for persisting the entity because of
        // special requirements (multiple confirmation dialogs)
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-ui/src/main/java/org/eclipse/hawkbit/ui/filtermanagement/AutoAssignmentWindowController.java`
#### Snippet
```java
        // this subclass cares itself for persisting the entity because of
        // special requirements (multiple confirmation dialogs)
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/cache/DefaultDownloadIdCache.java`
#### Snippet
```java
    public DownloadArtifactCache get(final String downloadId) {
        final ValueWrapper valueWrapper = getCache().get(downloadId);
        return (valueWrapper == null) ? null : (DownloadArtifactCache) valueWrapper.get();
    }

```

### ReturnNull
Return of `null`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/repository/ActionFields.java`
#### Snippet
```java
            return 0;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `hawkbit-core/src/main/java/org/eclipse/hawkbit/api/PropertyBasedArtifactUrlHandler.java`
#### Snippet
```java

    private static String getPort(final UrlProtocol protocol) {
        return protocol.getPort() == null ? null : String.valueOf(protocol.getPort());
    }

```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaArtifactManagement.java`
#### Snippet
```java
    private final DbArtifact wrapInEncryptionAwareDbArtifact(final long smId, final DbArtifact dbArtifact) {
        if (dbArtifact == null) {
            return null;
        }
        final ArtifactEncryptionService encryptionService = ArtifactEncryptionService.getInstance();
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaArtifactManagement.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/AbstractDsAssignmentStrategy.java`
#### Snippet
```java
        }).orElseGet(() -> {
            LOG.warn("Cannot find target for targetWithActionType '{}'.", targetWithActionType.getControllerId());
            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaSystemManagement.java`
#### Snippet
```java
            artifactRepository.deleteByTenant(tenant);
            softwareModuleTypeRepository.deleteByTenant(tenant);
            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaSystemManagement.java`
#### Snippet
```java
            final TenantMetaData findByTenant = tenantMetaDataRepository
                    .findByTenantIgnoreCase(tenantAware.getCurrentTenant());
            return findByTenant != null ? findByTenant.getTenant() : null;
        });
    }
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaSystemManagement.java`
#### Snippet
```java
                            + "Continue with next tenant.", tenant, ex.getMessage());
                }
                return null;
            }));
        } while ((query = tenants.nextPageable()) != Pageable.unpaged());
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaTenantConfigurationManagement.java`
#### Snippet
```java
                    .value(getGlobalConfigurationValue(configurationKey.getKeyName(), propertyType)).build();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/HawkBitEclipseLinkJpaDialect.java`
#### Snippet
```java
        final SQLException sqlException = findSqlException(ex);
        if (sqlException == null) {
            return null;
        }
        return SQLSTATE_EXCEPTION_TRANSLATOR.translate("", null, sqlException);
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/HawkBitEclipseLinkJpaDialect.java`
#### Snippet
```java
        } while (exception != null);

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/ParseExceptionWrapper.java`
#### Snippet
```java
        public TokenWrapper getNext() {
            final Object nextToken = getValue(nextTokenField);
            return nextToken != null ? new TokenWrapper(nextToken) : null;

        }
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/ParseExceptionWrapper.java`
#### Snippet
```java
        return (parseException.currentToken != null) // unclear if this can happen
                ? new TokenWrapper(parseException.currentToken)
                : null;

    }
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/ParseExceptionWrapper.java`
#### Snippet
```java
        public String getImage() {
            if (imageTokenField == null) {
                return null;
            }
            return (String) getValue(imageTokenField);
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/RsqlParserValidationOracle.java`
#### Snippet
```java
            return findParseException(e.getCause());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTarget.java`
#### Snippet
```java
    public PollStatus getPollStatus() {
        if (lastTargetQuery == null) {
            return null;
        }
        return SystemSecurityContextHolder.getInstance().getSystemSecurityContext().runAsSystem(() -> {
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTarget.java`
#### Snippet
```java
            return securityToken;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTarget.java`
#### Snippet
```java
    public URI getAddress() {
        if (address == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/model/JpaTarget.java`
#### Snippet
```java
        } catch (final IllegalArgumentException e) {
            LOG.warn("Invalid address provided. Cloud not be configured to URI", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaRolloutManagement.java`
#### Snippet
```java
    private Map<Long, List<TotalTargetCountActionStatus>> getStatusCountItemForRollout(final List<Long> rollouts) {
        if (rollouts.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/utils/DeploymentHelper.java`
#### Snippet
```java
        tenantAware.runAsTenantAsUser(tenantAware.getCurrentTenant(), user, () -> {
            handler.run();
            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rollout/RolloutScheduler.java`
#### Snippet
```java
            systemManagement.forEachTenant(tenant -> rolloutHandler.handleAll());

            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rollout/condition/PauseRolloutGroupAction.java`
#### Snippet
```java
            rolloutGroupRepository.save(rolloutGroup);
            rolloutManagement.pauseRollout(rollout.getId());
            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/autoassign/AutoAssignScheduler.java`
#### Snippet
```java
        final Lock lock = lockRegistry.obtain("autoassign");
        if (!lock.tryLock()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/autoassign/AutoAssignScheduler.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rollout/condition/StartNextGroupRolloutGroupSuccessAction.java`
#### Snippet
```java
        systemSecurityContext.runAsSystem(() -> {
            startNextGroup(rollout, rolloutGroup);
            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/specifications/SpecificationsBuilder.java`
#### Snippet
```java
    public static <T> Specification<T> combineWithAnd(final List<Specification<T>> specList) {
        if (specList.isEmpty()) {
            return null;
        }
        Specification<T> specs = Specification.where(specList.get(0));
```

### ReturnNull
Return of `null`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/util/IpUtil.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/SystemSecurityContext.java`
#### Snippet
```java
        @Override
        public Object getPrincipal() {
            return oldAuthentication != null ? oldAuthentication.getPrincipal() : null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/SystemSecurityContext.java`
#### Snippet
```java
        @Override
        public Object getDetails() {
            return oldAuthentication != null ? oldAuthentication.getDetails() : null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/SystemSecurityContext.java`
#### Snippet
```java
        @Override
        public String getName() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/SystemSecurityContext.java`
#### Snippet
```java
        @Override
        public Object getCredentials() {
            return oldAuthentication != null ? oldAuthentication.getCredentials() : null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/rsql/JpaQueryRsqlVisitor.java`
#### Snippet
```java
    private Predicate mapToMapPredicate(final ComparisonNode node, final Path<Object> fieldPath, final A enumField) {
        if (!enumField.isMap()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/PreAuthTokenSourceTrustAuthenticationProvider.java`
#### Snippet
```java
    public Authentication authenticate(final Authentication authentication) {
        if (!supports(authentication.getClass())) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/ControllerPreAuthenticateSecurityTokenFilter.java`
#### Snippet
```java
                "security token filter is enabled but requst does not contain either the necessary path variables {} or the authorization header with scheme {}",
                secruityToken, TARGET_SECURITY_TOKEN_AUTH_SCHEME);
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/SecurityContextTenantAware.java`
#### Snippet
```java
        @Override
        public Object getCredentials() {
            return delegate != null ? delegate.getCredentials() : null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/SecurityContextTenantAware.java`
#### Snippet
```java
        @Override
        public String toString() {
            return delegate != null ? delegate.toString() : null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/SecurityContextTenantAware.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/SecurityContextTenantAware.java`
#### Snippet
```java
        @Override
        public String getName() {
            return delegate != null ? delegate.getName() : null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-security-core/src/main/java/org/eclipse/hawkbit/security/SecurityContextTenantAware.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/DmfTenantSecurityToken.java`
#### Snippet
```java
    public String getHeader(final String name) {
        if (headers == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/ControllerPreAuthenticatedGatewaySecurityTokenFilter.java`
#### Snippet
```java
                "security token filter is enabled but request does not contain either the necessary secruity token {} or the authorization header with scheme {}",
                secruityToken, GATEWAY_SECURITY_TOKEN_AUTH_SCHEME);
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/ControllerPreAuthenticatedSecurityHeaderFilter.java`
#### Snippet
```java
            return new HeaderAuthentication(commonNameValue, sslIssuerHashValue);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-security-integration/src/main/java/org/eclipse/hawkbit/security/ControllerPreAuthenticatedSecurityHeaderFilter.java`
#### Snippet
```java
                "Certificate request but no matching hash found in headers {} for common name {} in request",
                sslIssuerHashBasicHeader, securityToken.getHeader(caCommonNameHeader));
        return null;
    }

```

### ReturnNull
Return of `null`
in `hawkbit-repository/hawkbit-repository-jpa/src/main/java/org/eclipse/hawkbit/repository/jpa/JpaDeploymentManagement.java`
#### Snippet
```java
            setSkipActionStatus(action);
            actionRepository.save(action);
            return null;
        }

```

## RuleId[id=UnnecessaryLocalVariable]
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
'move(java.io.File, java.io.File)' is marked unstable with @Beta
in `hawkbit-artifact-repository-filesystem/src/main/java/org/eclipse/hawkbit/artifact/repository/ArtifactFilesystemRepository.java`
#### Snippet
```java
            FileUtils.deleteQuietly(file);
        } else {
            Files.move(file, fileSHA1Naming);
        }

```

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

