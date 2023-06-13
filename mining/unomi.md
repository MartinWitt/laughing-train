# unomi 
 
# Bad smells
I found 820 bad smells with 25 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 329 | false |
| UNCHECKED_WARNING | 116 | false |
| UNUSED_IMPORT | 50 | false |
| ConstantValue | 30 | false |
| UnusedAssignment | 23 | false |
| DataFlowIssue | 19 | false |
| DuplicatedCode | 18 | false |
| Deprecation | 17 | false |
| DeprecatedIsStillUsed | 17 | false |
| FieldCanBeLocal | 16 | false |
| TrivialIf | 13 | false |
| MismatchedJavadocCode | 10 | false |
| RegExpRedundantEscape | 9 | false |
| StringConcatenationInsideStringBufferAppend | 9 | false |
| StringBufferReplaceableByString | 8 | false |
| JavadocLinkAsPlainText | 8 | false |
| RedundantCast | 8 | false |
| EmptyStatementBody | 7 | false |
| BooleanConstructor | 7 | false |
| ArraysAsListWithZeroOrOneArgument | 7 | false |
| JavadocDeclaration | 6 | false |
| StringConcatenationInLoops | 5 | false |
| InnerClassMayBeStatic | 5 | true |
| UnnecessaryModifier | 4 | true |
| TypeParameterExtendsObject | 4 | false |
| SuspiciousMethodCalls | 4 | false |
| UnnecessaryLocalVariable | 4 | true |
| ToArrayCallWithZeroLengthArrayArgument | 3 | true |
| DuplicateBranchesInSwitch | 3 | false |
| UnnecessaryReturn | 3 | true |
| DuplicateThrows | 3 | false |
| RedundantLengthCheck | 3 | false |
| UnnecessarySemicolon | 3 | false |
| StringOperationCanBeSimplified | 3 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| CStyleArrayDeclaration | 2 | false |
| UastIncorrectHttpHeaderInspection | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| SlowAbstractSetRemoveAll | 2 | false |
| RedundantCollectionOperation | 2 | false |
| SwitchStatementWithTooFewBranches | 2 | false |
| ListIndexOfReplaceableByContains | 2 | false |
| EqualsWithItself | 1 | false |
| ConditionalBreakInInfiniteLoop | 1 | false |
| RedundantClassCall | 1 | false |
| CommentedOutCode | 1 | false |
| NonFinalFieldInEnum | 1 | false |
| TrivialStringConcatenation | 1 | false |
| SimplifiableConditionalExpression | 1 | false |
| NumberEquality | 1 | false |
| MismatchedStringBuilderQueryUpdate | 1 | false |
| NullableProblems | 1 | false |
| MalformedFormatString | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| RedundantOperationOnEmptyContainer | 1 | false |
| JavadocReference | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| CatchMayIgnoreException | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| IOStreamConstructor | 1 | false |
| DanglingJavadoc | 1 | false |
| SwitchStatementWithConfusingDeclaration | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| CharsetObjectCanBeUsed | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| PointlessBooleanExpression | 1 | true |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[id=EqualsWithItself]
### EqualsWithItself
`compareTo()` called on itself
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
            public int compare(PropertyType o1, PropertyType o2) {
                if (o1.getRank() == o2.getRank()) {
                    return o1.getMetadata().getName().compareTo(o1.getMetadata().getName());
                } else if (o1.getRank() < o2.getRank()) {
                    return -1;
```

## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Double\[loadAverage.size()\]'
in `services/src/main/java/org/apache/unomi/services/impl/cluster/ClusterServiceImpl.java`
#### Snippet
```java
                List<Double> loadAverage = (List<Double>) nodeStatistics.get("systemLoadAverage");
                if (loadAverage != null) {
                    Double[] loadAverageArray = loadAverage.toArray(new Double[loadAverage.size()]);
                    ArrayUtils.toPrimitive(loadAverageArray);
                    clusterNode.setLoadAverage(ArrayUtils.toPrimitive(loadAverageArray));
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[values.size()\]'
in `common/src/main/java/org/apache/unomi/common/DataTable.java`
#### Snippet
```java
                    values.add(row.getData(i).toString());
                }
                printer.printRecord(values.toArray(new String[values.size()]));
            }
            printer.close();
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Node\[nodeList.size()\]'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
        }

        RestClientBuilder clientBuilder = RestClient.builder(nodeList.toArray(new Node[nodeList.size()]));

        if (clientSocketTimeout != null) {
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/unomi/api/services/UserListService.java`
#### Snippet
```java
     * @return a {@link PartialList} of {@link UserList} metadata
     */
    public PartialList<Metadata> getUserListMetadatas(int offset, int size, String sortBy);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/unomi/api/services/RulesService.java`
#### Snippet
```java
     * @return a set of rules that match the event passed in the parameters
     */
    public Set<Rule> getMatchingRules(Event event);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/unomi/api/services/RulesService.java`
#### Snippet
```java
     * Refresh the rules for this instance by reloading them from the persistence backend
     */
    public void refreshRules();

}
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `common/src/main/java/org/apache/unomi/common/DataTable.java`
#### Snippet
```java
    }

    public static enum SortOrder {
        ASCENDING,
        DESCENDING;
```

## RuleId[id=ConditionalBreakInInfiniteLoop]
### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                    if (size == -1) {
                        // Scroll until no more hits are returned
                        while (true) {

                            for (SearchHit searchHit : response.getHits().getHits()) {
```

## RuleId[id=RedundantClassCall]
### RedundantClassCall
Redundant call to `isInstance()`
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyHelper.java`
#### Snippet
```java
    private static Map<String, Object> flatten(Map.Entry<String, Object> in) {
        // for other then Map objects return them
        if (!Map.class.isInstance(in.getValue())) {
            return Collections.singletonMap(in.getKey(), in.getValue());
        }
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`else` statement has empty body
in `extensions/geonames/services/src/main/java/org/apache/unomi/geonames/services/GeonamesServiceImpl.java`
#### Snippet
```java
            }, refreshDbInterval, TimeUnit.MILLISECONDS);
            return;
        } else {
            // let's check that the mappings are correct
        }
```

### EmptyStatementBody
`if` statement has empty body
in `rest/src/main/java/org/apache/unomi/rest/service/impl/RestServiceUtilsImpl.java`
#### Snippet
```java
                    // Handle anonymous situation
                    Boolean requireAnonymousBrowsing = privacyService.isRequireAnonymousBrowsing(eventsRequestContext.getProfile());
                    if (requireAnonymousBrowsing && anonymousSessionProfile) {
                        // User wants to browse anonymously, anonymous profile is already set.
                    } else if (requireAnonymousBrowsing && !anonymousSessionProfile) {
```

### EmptyStatementBody
`else` statement has empty body
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyTypedObjectDeserializer.java`
#### Snippet
```java
                objectClass = HashMap.class;
            }
        } else {

        }
```

### EmptyStatementBody
`if` statement has empty body
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
            scmBranch = bundle.getHeaders().get("Implementation-ScmBranch");
        }
        if (bundle.getHeaders().get("Implementation-UnomiEventTypes") != null) {
            // to be implemented
        }
```

### EmptyStatementBody
`if` statement has empty body
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
            // to be implemented
        }
        if (bundle.getHeaders().get("Implementation-UnomiCapabilities") != null) {
            // to be implemented
        }
```

### EmptyStatementBody
`else` statement has empty body
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                                        searchSourceBuilder.sort(name, SortOrder.ASC);
                                    }
                                } else {
                                    // in the case of no data existing for the property, we will not add the sorting to the request.
                                }
```

### EmptyStatementBody
`else` statement has empty body
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                                }
                            }
                        } else {
                            // field name could be null if no existing data exists
                        }
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `mergeFields`
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/internal/MailChimpServiceImpl.java`
#### Snippet
```java
        this.listMergeFieldMapping = new HashMap<>();
        if (StringUtils.isNotBlank(listMergeFields)) {
            String mergeFields[] = StringUtils.split(listMergeFields, SEPARATOR_CHARS_PROPERTIES);
            if (mergeFields.length > 0) {
                for (String mergeField : mergeFields) {
```

### CStyleArrayDeclaration
C-style array declaration of local variable `mergeFieldInfo`
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/internal/MailChimpServiceImpl.java`
#### Snippet
```java
                for (String mergeField : mergeFields) {
                    if (StringUtils.isNotBlank(mergeField)) {
                        String mergeFieldInfo[] = StringUtils.split(mergeField, SEPARATOR_CHARS_PROPERTY);
                        if (mergeFieldInfo.length > 0) {
                            Map<String, String> fieldInfo = new HashMap<>();
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (7 lines)
in `extensions/geonames/services/src/main/java/org/apache/unomi/geonames/services/GeonameEntry.java`
#### Snippet
```java
    }

//    public List<String> getAlternatenames() {
//        return alternatenames;
//    }
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `extensions/json-schema/services/src/main/resources/META-INF/cxs/schemas/events/event.json`
#### Snippet
```java
    "eventType" : {
      "type" : "string",
      "pattern" : "^(\\w|[-_@\\.]){0,60}$"
    },
    "profileId" : {
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `extensions/json-schema/services/src/main/resources/META-INF/cxs/schemas/items/item.json`
#### Snippet
```java
    "itemId" : {
      "type" : ["null","string"],
      "pattern" : "^(\\w|[-_@\\.]){0,60}$",
      "description" : "The identifier for the item"
    },
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `extensions/json-schema/services/src/main/resources/META-INF/cxs/schemas/events/event.json`
#### Snippet
```java
    "profileId" : {
      "type" : [ "string"],
      "pattern" : "^(\\w|[-_@\\.]){0,60}$"
    },
    "sessionId" : {
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `extensions/json-schema/services/src/main/resources/META-INF/cxs/schemas/events/event.json`
#### Snippet
```java
    "sessionId" : {
      "type" : [ "string"],
      "pattern" : "^(\\w|[-_@\\.]){0,60}$"
    },
    "scope" : {
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `extensions/json-schema/services/src/main/resources/META-INF/cxs/schemas/events/event.json`
#### Snippet
```java
      "type" : [ "string"],
      "validateScope": true,
      "pattern" : "^(\\w|[-_@\\.]){0,60}$"
    },
    "sourceId" : {
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `extensions/json-schema/services/src/main/resources/META-INF/cxs/schemas/events/event.json`
#### Snippet
```java
    "sourceId" : {
      "type" : [ "string"],
      "pattern" : "^(\\w|[-_@\\.]){0,60}$"
    },
    "persistent" : {
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `rest/src/main/resources/META-INF/cxs/schemas/rest/requestIds.json`
#### Snippet
```java
    "sessionId": {
      "type": ["null", "string"],
      "pattern" : "^(\\w|[-_@\\.]){0,60}$"
    },
    "profileId": {
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `rest/src/main/resources/META-INF/cxs/schemas/rest/requestIds.json`
#### Snippet
```java
    "profileId": {
      "type": ["null", "string"],
      "pattern" : "^(\\w|[-_@\\.]){0,60}$"
    },
    "personaId" : {
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `rest/src/main/resources/META-INF/cxs/schemas/rest/requestIds.json`
#### Snippet
```java
    "personaId" : {
      "type" : ["null", "string"],
      "pattern" : "^(\\w|[-_@\\.]){0,60}$"
    }
  }
```

## RuleId[id=UastIncorrectHttpHeaderInspection]
### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ProfileServiceEndPoint.java`
#### Snippet
```java
    public void removeAliasFromProfile(final @PathParam("profileId") String profileId,
                                       final @PathParam("aliasId") String aliasId,
                                       final @HeaderParam("X-Unomi-ClientId") String headerClientID) {
        String clientId = headerClientID != null ? headerClientID : "defaultClientId";
        profileService.removeAliasFromProfile(profileId, aliasId, clientId);
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ProfileServiceEndPoint.java`
#### Snippet
```java
    public void addAliasToProfile(final @PathParam("profileId") String profileId,
                                  final @PathParam("aliasId") String aliasId,
                                  final @HeaderParam("X-Unomi-ClientId") String headerClientID) {
        String clientId = headerClientID != null ? headerClientID : "defaultClientId";
        profileService.addAliasToProfile(profileId, aliasId, clientId);
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/internal/MailChimpServiceImpl.java`
#### Snippet
```java
                                    break;
                                case BIRTHDAY:
                                    if (mergeFieldDefinition.has(OPTIONS) && mergeFieldDefinition.get(OPTIONS).has(DATE_FORMAT)) {
                                        mergeFields.put(mcTagName, formatDate(mergeFieldDefinition.get(OPTIONS).get(DATE_FORMAT).asText(), profile.getProperty(unomiId)));
                                    }
                                    break;
                                default:
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
        switch (event.getType()) {
            case BundleEvent.STARTING:
                break;
            case BundleEvent.STARTED:
                managedBundleEvent(event.getBundle(), requiredBundles, true);
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
                break;
            case BundleEvent.STOPPING:
                break;
            case BundleEvent.STOPPED:
                managedBundleEvent(event.getBundle(), requiredBundles, false);
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `value` in enum 'FilterType'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentConditionParser.java`
#### Snippet
```java
        UNKNOWN("unknown");

        private String value;

        FilterType(String value) {
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `api/src/main/java/org/apache/unomi/api/EventTarget.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EventTarget{");
        sb.append("id='").append(id).append('\'');
        sb.append(", type='").append(type).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `api/src/main/java/org/apache/unomi/api/Profile.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Profile{");
        sb.append("properties=").append(properties);
        sb.append(", systemProperties=").append(systemProperties);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `api/src/main/java/org/apache/unomi/api/Consent.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Consent{");
        sb.append("scope='").append(scope).append('\'');
        sb.append(", typeIdentifier='").append(typeIdentifier).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `api/src/main/java/org/apache/unomi/api/conditions/Condition.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Condition{");
        sb.append("conditionType=").append(conditionType);
        sb.append(", conditionTypeId='").append(conditionTypeId).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `common/src/main/java/org/apache/unomi/common/DataTable.java`
#### Snippet
```java
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("[");
            sb.append(rowData);
            sb.append(']');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `common/src/main/java/org/apache/unomi/common/DataTable.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        sb.append(rows);
        sb.append(']');
```

### StringBufferReplaceableByString
`StringBuilder responseAsString` can be replaced with 'String'
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ContextJsonEndpoint.java`
#### Snippet
```java
                invalidateSession);
        String contextAsJSONString = CustomObjectMapper.getObjectMapper().writeValueAsString(contextResponse);
        StringBuilder responseAsString = new StringBuilder();
        responseAsString.append("window.digitalData = window.digitalData || {};\n").append("var cxs = ").append(contextAsJSONString)
                .append(";\n");
```

### StringBufferReplaceableByString
`StringBuilder stringBuilder` can be replaced with 'String'
in `rest/src/main/java/org/apache/unomi/utils/HttpUtils.java`
#### Snippet
```java
     */
    public static String dumpRequestInfo(HttpServletRequest httpServletRequest) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        stringBuilder.append("======================================================================================\n");
```

## RuleId[id=Deprecation]
### Deprecation
'refreshIndex(java.lang.Class, java.util.Date)' is deprecated
in `services/src/main/java/org/apache/unomi/services/impl/topics/TopicServiceImpl.java`
#### Snippet
```java
    public Topic save(final Topic topic) {
        if (persistenceService.save(topic)) {
            persistenceService.refreshIndex(Topic.class, null);

            return topic;
```

### Deprecation
'aggregateQuery(org.apache.unomi.api.conditions.Condition, org.apache.unomi.persistence.spi.aggregate.BaseAggregate, java.lang.String)' is deprecated
in `services/src/main/java/org/apache/unomi/services/impl/queries/QueryServiceImpl.java`
#### Snippet
```java
                return persistenceService.aggregateWithOptimizedQuery(query.getCondition(), baseAggregate, itemType);
            } else {
                return persistenceService.aggregateQuery(query.getCondition(), baseAggregate, itemType);
            }
        }
```

### Deprecation
'purge(java.util.Date)' is deprecated
in `services/src/main/java/org/apache/unomi/services/impl/cluster/ClusterServiceImpl.java`
#### Snippet
```java
    @Override
    public void purge(Date date) {
        persistenceService.purge(date);
    }

```

### Deprecation
'refreshIndex(java.lang.Class, java.util.Date)' is deprecated
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
        if (persistenceService.save(profile)) {
            if (forceRefresh) {
                persistenceService.refreshIndex(Profile.class, null);
            }
            return profile;
```

### Deprecation
'com.fasterxml.jackson.databind.util.ISO8601DateFormat' is deprecated
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
    public void start() {
        try {
            iso8601DateFormat = new ISO8601DateFormat();

            SFDCConfiguration sfdcConfiguration = loadConfiguration();
```

### Deprecation
'com.fasterxml.jackson.databind.util.ISO8601DateFormat' is deprecated
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java

    private SFDCSession sfdcSession;
    private DateFormat iso8601DateFormat = new ISO8601DateFormat();

    private PersistenceService persistenceService;
```

### Deprecation
'refreshIndex(java.lang.Class, java.util.Date)' is deprecated
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
        // reevaluate segments and scoring.
        if (segmentOrScoringIdsToReevaluate.size() > 0) {
            persistenceService.refreshIndex(Profile.class, null);
            for (String linkedItem : segmentOrScoringIdsToReevaluate) {
                Segment linkedSegment = getSegmentDefinition(linkedItem);
```

### Deprecation
'com.fasterxml.jackson.databind.util.ISO8601DateFormat' is deprecated
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/ModifyConsentAction.java`
#### Snippet
```java
        boolean isProfileUpdated = false;

        ISO8601DateFormat dateFormat = new ISO8601DateFormat();
        Map consentMap = (Map) event.getProperties().get(CONSENT_PROPERTY_NAME);
        if (consentMap != null) {
```

### Deprecation
'com.fasterxml.jackson.databind.util.ISO8601DateFormat' is deprecated
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/ModifyConsentAction.java`
#### Snippet
```java
        boolean isProfileUpdated = false;

        ISO8601DateFormat dateFormat = new ISO8601DateFormat();
        Map consentMap = (Map) event.getProperties().get(CONSENT_PROPERTY_NAME);
        if (consentMap != null) {
```

### Deprecation
'getMergedWith()' is deprecated
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/accessors/ProfileAccessor.java`
#### Snippet
```java
        }
        if ("mergedWith".equals(propertyName)) {
            return object.getMergedWith();
        }
        return PROPERTY_NOT_FOUND_MARKER;
```

### Deprecation
'getAggregate(java.lang.String, java.lang.String, org.apache.unomi.api.query.AggregateQuery)' is deprecated
in `rest/src/main/java/org/apache/unomi/rest/endpoints/QueryServiceEndPoint.java`
#### Snippet
```java
            return queryService.getAggregateWithOptimizedQuery(type, property, aggregateQuery);
        } else {
            return queryService.getAggregate(type, property, aggregateQuery);
        }
    }
```

### Deprecation
'setPersonalizations(java.util.Map\>)' is deprecated
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ContextJsonEndpoint.java`
#### Snippet
```java
        if (personalizations != null) {
            data.setPersonalizationResults(new HashMap<>());
            data.setPersonalizations(new HashMap<>());
            for (PersonalizationService.PersonalizationRequest personalization : sanitizePersonalizations(personalizations)) {
                PersonalizationResult personalizationResult = personalizationService.personalizeList(eventsRequestContext.getProfile(), eventsRequestContext.getSession(), personalization);
```

### Deprecation
'getPersonalizations()' is deprecated
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ContextJsonEndpoint.java`
#### Snippet
```java
                eventsRequestContext.addChanges(personalizationResult.getChangeType());
                data.getPersonalizationResults().put(personalization.getId(), personalizationResult);
                data.getPersonalizations().put(personalization.getId(), personalizationResult.getContentIds());
            }
        }
```

### Deprecation
'refreshIndex(java.lang.Class, java.util.Date)' is deprecated
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/AddAliasToProfileCommand.java`
#### Snippet
```java

        PersistenceService persistenceService = serviceManager.getService(PersistenceService.class);
        persistenceService.refreshIndex(ProfileAlias.class, null);

        return new CDPProfileAlias(persistenceService.load(profileAliasInput.getAlias(), ProfileAlias.class));
```

### Deprecation
'setMergedWith(java.lang.String)' is deprecated
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/CreateOrUpdatePersonaCommand.java`
#### Snippet
```java
        if (personaInput.getCdp_profileIDs() != null && !personaInput.getCdp_profileIDs().isEmpty()) {
            final String profileIds = personaInput.getCdp_profileIDs().stream().map(CDPProfileIDInput::getId).collect(Collectors.joining(","));
            persona.setMergedWith(profileIds);
        }

```

### Deprecation
'com.fasterxml.jackson.databind.util.ISO8601DateFormat' is deprecated
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/CustomObjectMapper.java`
#### Snippet
```java
        configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        setSerializationInclusion(JsonInclude.Include.NON_NULL);
        ISO8601DateFormat dateFormat = new ISO8601DateFormat();
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        setDateFormat(dateFormat);
```

### Deprecation
'com.fasterxml.jackson.databind.util.ISO8601DateFormat' is deprecated
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/CustomObjectMapper.java`
#### Snippet
```java
        configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        setSerializationInclusion(JsonInclude.Include.NON_NULL);
        ISO8601DateFormat dateFormat = new ISO8601DateFormat();
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        setDateFormat(dateFormat);
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `services/src/main/java/org/apache/unomi/services/impl/configsharing/ConfigSharingServiceImpl.java`
#### Snippet
```java
    private void processBundleStartup(BundleContext bundleContext) {
        if (bundleContext == null) {
            return;
        }
    }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `services/src/main/java/org/apache/unomi/services/impl/rules/RulesServiceImpl.java`
#### Snippet
```java
    private void processBundleStop(BundleContext bundleContext) {
        if (bundleContext == null) {
            return;
        }
    }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
    private void processBundleStop(BundleContext bundleContext) {
        if (bundleContext == null) {
            return;
        }
    }
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                        "        \"lifecycle.name\": \"" + (indexPrefix + "-" + ROLLOVER_LIFECYCLE_NAME) + "\",\n" +
                        "        \"lifecycle.rollover_alias\": \"" + rolloverAlias + "\"" +
                        "" +
                        "    },\n" +
                        "    \"analysis\": {\n" +
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`action.getParameterValues().containsKey("forceEventProfileAsMaster") ? (boolean) action.getParameterValues().get("forceEventProfileAsMaster") : false` can be simplified to 'action.getParameterValues().containsKey("forceEventProfileAsMaster") \&\& (boolean) action.getParameterValues().get("forceEventProfileAsMaster")'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/MergeProfilesOnPropertyAction.java`
#### Snippet
```java
        final String clientIdFromEvent = (String) event.getAttributes().get(Event.CLIENT_ID_ATTRIBUTE);
        final String clientId = clientIdFromEvent != null ? clientIdFromEvent : "defaultClientId";
        boolean forceEventProfileAsMaster = action.getParameterValues().containsKey("forceEventProfileAsMaster") ? (boolean) action.getParameterValues().get("forceEventProfileAsMaster") : false;
        final String currentProfileMergeValue = (String) eventProfile.getSystemProperties().get(mergePropName);

```

## RuleId[id=BooleanConstructor]
### BooleanConstructor
Boolean constructor call
in `services/src/main/java/org/apache/unomi/services/impl/cluster/ClusterSystemStatisticsEventHandler.java`
#### Snippet
```java
                    eventSwitch.turnOn();
                } else {
                    Boolean status = new Boolean(handlerStatus);
                    if (status) {
                        eventSwitch.turnOn();
```

### BooleanConstructor
Boolean constructor call
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/LineSplitFailureHandler.java`
#### Snippet
```java
        importLineError.setLineContent(exchange.getIn().getBody(String.class));
        importLineError.setLineNb(((Integer) exchange.getProperty("CamelSplitIndex") + 1));
        exchange.getIn().setHeader(RouterConstants.HEADER_FAILED_MESSAGE, new Boolean(true));
        exchange.getIn().setBody(importLineError, ImportLineError.class);
    }
```

### BooleanConstructor
Boolean constructor call
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/LineSplitProcessor.java`
#### Snippet
```java
                            }
                        } else if (propertyType.getValueTypeId().equals("boolean")) {
                            properties.put(fieldMappingKey, new Boolean(profileData[fieldsMapping.get(fieldMappingKey)].trim()));
                        } else if (propertyType.getValueTypeId().equals("integer")) {
                            properties.put(fieldMappingKey, new Integer(profileData[fieldsMapping.get(fieldMappingKey)].trim()));
```

### BooleanConstructor
Boolean constructor call
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyHelper.java`
#### Snippet
```java
        } else if (setPropertyValueBoolean instanceof Number) {
            if (((Number) setPropertyValueBoolean).intValue() >= 1) {
                return new Boolean(true);
            } else {
                return new Boolean(false);
```

### BooleanConstructor
Boolean constructor call
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyHelper.java`
#### Snippet
```java
                return new Boolean(true);
            } else {
                return new Boolean(false);
            }
        } else {
```

### BooleanConstructor
Boolean constructor call
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyHelper.java`
#### Snippet
```java
            if (((String) setPropertyValueBoolean).equalsIgnoreCase("true") || ((String) setPropertyValueBoolean).equalsIgnoreCase("on") ||
                    ((String) setPropertyValueBoolean).equalsIgnoreCase("yes") || ((String) setPropertyValueBoolean).equalsIgnoreCase("1")) {
                return new Boolean(true);
            } else {
                return new Boolean(false);
```

### BooleanConstructor
Boolean constructor call
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyHelper.java`
#### Snippet
```java
                return new Boolean(true);
            } else {
                return new Boolean(false);
            }
        }
```

## RuleId[id=NumberEquality]
### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
            @Override
            public int compare(PropertyType o1, PropertyType o2) {
                if (o1.getRank() == o2.getRank()) {
                    return o1.getMetadata().getName().compareTo(o1.getMetadata().getName());
                } else if (o1.getRank() < o2.getRank()) {
```

## RuleId[id=MismatchedStringBuilderQueryUpdate]
### MismatchedStringBuilderQueryUpdate
Contents of `StringBuffer sb` are updated, but never queried
in `plugins/request/src/main/java/org/apache/unomi/plugins/request/useragent/UserAgent.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("User-Agent { \n");
        sb.append("agent.name: " + this.getUserAgentName() + ",\n");
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/org/apache/unomi/common/DataTable.java`
#### Snippet
```java
    public static class EmptyCell implements Comparable {
        @Override
        public int compareTo(Object o) {
            if (o instanceof EmptyCell) {
                return 0;
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `api/src/main/java/org/apache/unomi/api/BatchUpdate.java`
#### Snippet
```java
    /**
     * Retrieves the property name which value needs to be updated. Note that the property name follows the
     * <a href='https://commons.apache.org/proper/commons-beanutils/apidocs/org/apache/commons/beanutils/expression/DefaultResolver.html'>Apache Commons BeanUtils expression
     * format</a>
     *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `api/src/main/java/org/apache/unomi/api/services/SchedulerService.java`
#### Snippet
```java
 * A service to centralize scheduling of tasks instead of using Timers or executors in each service
 *
 * https://stackoverflow.com/questions/409932/java-timer-vs-executorservice
 */
public interface SchedulerService {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/providers/GraphQLFieldVisibilityProvider.java`
#### Snippet
```java
/**
 * Provider of {@link GraphqlFieldVisibility} to limit graphql schema fields visibility
 * More about it here https://www.graphql-java.com/documentation/v14/fieldvisibility/
 */
public interface GraphQLFieldVisibilityProvider extends GraphQLProvider {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PersistenceService.java`
#### Snippet
```java
     *                           this will be used as the scrolling window size.
     * @param scrollTimeValidity the time the scrolling query should stay valid. This must contain a time unit value such as the ones supported by ElasticSearch, such as
     *                           the ones declared here : https://www.elastic.co/guide/en/elasticsearch/reference/current/common-options.html#time-units
     * @return a {@link PartialList} of items matching the specified criteria, with an scroll identifier and the scroll validity used if a scroll query was requested.
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PersistenceService.java`
#### Snippet
```java
     *                           this will be used as the scrolling window size.
     * @param scrollTimeValidity the time the scrolling query should stay valid. This must contain a time unit value such as the ones supported by ElasticSearch, such as
     *                           the ones declared here : https://www.elastic.co/guide/en/elasticsearch/reference/current/common-options.html#time-units
     * @return a {@link PartialList} of items matching the specified criteria, with an scroll identifier and the scroll validity used if a scroll query was requested.
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PersistenceService.java`
#### Snippet
```java
     * @param scrollIdentifier   a scroll identifier obtained by the execution of a first query and returned in the {@link PartialList} object
     * @param scrollTimeValidity a scroll time validity value for the scroll query to stay valid. This must contain a time unit value such as the ones supported by ElasticSearch, such as
     *                           the ones declared here : https://www.elastic.co/guide/en/elasticsearch/reference/current/common-options.html#time-units
     * @param <T>                the type of the Item subclass we want to retrieve
     * @return a {@link PartialList} of items matching the specified criteria, with an scroll identifier and the scroll validity used if a scroll query was requested. Note that if
```

### JavadocLinkAsPlainText
Link specified as plain text
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PersistenceService.java`
#### Snippet
```java
     *                           a column ({@code :}) and an order specifier: {@code asc} or {@code desc}.
     * @param scrollTimeValidity the time the scrolling query should stay valid. This must contain a time unit value such as the ones supported by ElasticSearch, such as
     *                           *                     the ones declared here : https://www.elastic.co/guide/en/elasticsearch/reference/current/common-options.html#time-units
     * @return a {@link PartialList} of pages items with the given type
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PersistenceService.java`
#### Snippet
```java
     * @param scrollIdentifier   a scroll identifier obtained by the execution of a first query and returned in the {@link PartialList} object
     * @param scrollTimeValidity a scroll time validity value for the scroll query to stay valid. This must contain a time unit value such as the ones supported by ElasticSearch, such as
     *                           the ones declared here : https://www.elastic.co/guide/en/elasticsearch/reference/current/common-options.html#time-units
     * @return a {@link PartialList} of items matching the specified criteria, with an scroll identifier and the scroll validity used if a scroll query was requested. Note that if
     * there are no more results the list will be empty but not null.
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java

    private Set<String> sfdcLeadMandatoryFields = new TreeSet<>();
    private Set<String> sfdcLeadUpdateableFields = new TreeSet<>();

    private SFDCSession sfdcSession;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/router/router-rest/src/main/java/org/apache/unomi/router/rest/ExportConfigurationServiceEndPoint.java`
#### Snippet
```java

    @Reference
    private ProfileService profileService;

    public ExportConfigurationServiceEndPoint() throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/context/RouterCamelContext.java`
#### Snippet
```java
    // TODO UNOMI-572: when fixing UNOMI-572 please remove the usage of the custom ScheduledExecutorService and re-introduce the Unomi Scheduler Service
    private ScheduledExecutorService scheduler;
    private Integer configsRefreshInterval = 1000;
    private ScheduledFuture<?> scheduledFuture;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/context/RouterCamelContext.java`
#### Snippet
```java
    private String uploadDir;
    private String execHistorySize;
    private String execErrReportSize;
    private Map<String, String> kafkaProps;
    private String configType;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `rest/src/main/java/org/apache/unomi/rest/server/RestServer.java`
#### Snippet
```java
    private long timeOfLastUpdate = System.currentTimeMillis();
    private Timer refreshTimer = null;
    private long startupDelay = 1000L;

    private static final QName UNOMI_REST_SERVER_END_POINT_NAME = new QName("http://rest.unomi.apache.org/", "UnomiRestServerEndPoint");
```

### FieldCanBeLocal
Field can be converted to a local variable
in `rest/src/main/java/org/apache/unomi/rest/endpoints/QueryServiceEndPoint.java`
#### Snippet
```java

    @Reference
    private LocalizationHelper localizationHelper;

    @WebMethod(exclude = true)
```

### FieldCanBeLocal
Field can be converted to a local variable
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ProfileServiceEndPoint.java`
#### Snippet
```java

    @Reference
    private LocalizationHelper localizationHelper;

    public ProfileServiceEndPoint() {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/DeleteViewCommand.java`
#### Snippet
```java
public class DeleteViewCommand extends BaseCommand<Boolean> {

    private final String viewId;

    public DeleteViewCommand(Builder builder) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/list/AddProfileToListCommand.java`
#### Snippet
```java
    private final String listId;
    private final CDPProfileIDInput profileIDInput;
    private final Boolean active;

    private AddProfileToListCommand(final Builder builder) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaProvider.java`
#### Snippet
```java

    public class JSONTypeDefinitionType implements DefinitionType {
        private List<JSONType> jsonTypes;
        private JSONType firstNonNullType;
        private String name;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `samples/graphql-providers/src/main/java/org/apache/unomi/graphql/providers/sample/CDPProfileExtension.java`
#### Snippet
```java
public class CDPProfileExtension {

    private CDPProfile cdpProfile;

    public CDPProfileExtension(CDPProfile cdpProfile) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java
    private Dictionary<String, Object> properties;
    private KafkaConsumer<String, String> consumer;
    private String topic;
    private String messageType;
    private boolean consuming = false;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaInjector.class);

    private Dictionary<String, Object> properties;
    private KafkaConsumer<String, String> consumer;
    private String topic;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
    private FeaturesService featuresService;

    private String requiredServices;
    private Set<Filter> requiredServicesFilters = new LinkedHashSet<>();
    private long matchedRequiredServicesCount = 0;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
    private RestHighLevelClient client;
    private BulkProcessor bulkProcessor;
    private String elasticSearchAddresses;
    private List<String> elasticSearchAddressList = new ArrayList<>();
    private String clusterName;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java

    private Integer defaultQueryLimit = 10;
    private Integer removeByQueryTimeoutInMinutes = 10;

    private String bulkProcessorConcurrentRequests = "1";
```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Too many arguments for format string (found: 3, expected: 0)
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
                        boolean isUpdated = persistenceService.update(profileToAddUpdated, Profile.class, sourceMapToUpdate);
                        if (isUpdated == false)
                            throw new Exception(String.format("failed retry update profile segment {}, profile {}, time {}", segmentId, profileId, new Date()));
                    });
        }
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `services/src/main/java/org/apache/unomi/services/impl/rules/RulesServiceImpl.java`
#### Snippet
```java
        for (RuleStatistics ruleStatistics : allRuleStatistics.values()) {
            boolean mustPersist = false;
            if (allPersistedRuleStatistics.containsKey(ruleStatistics.getItemId())) {
                // we must sync with the data coming from the persistence service.
                RuleStatistics persistedRuleStatistics = allPersistedRuleStatistics.get(ruleStatistics.getItemId());
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import javax.xml.bind.annotation.XmlTransient;`
in `api/src/main/java/org/apache/unomi/api/ContextResponse.java`
#### Snippet
```java
import org.apache.unomi.api.services.RulesService;

import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.*;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Collectors;`
in `api/src/main/java/org/apache/unomi/api/ContextResponse.java`
#### Snippet
```java
import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

/**
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `api/src/main/java/org/apache/unomi/api/PersonalizationStrategy.java`
#### Snippet
```java
import org.apache.unomi.api.services.PersonalizationService;

import java.util.List;

/**
```

### UNUSED_IMPORT
Unused import `import java.net.URL;`
in `api/src/main/java/org/apache/unomi/api/services/PatchService.java`
#### Snippet
```java
import org.apache.unomi.api.Patch;

import java.net.URL;
import java.util.Enumeration;

```

### UNUSED_IMPORT
Unused import `import java.util.Enumeration;`
in `api/src/main/java/org/apache/unomi/api/services/PatchService.java`
#### Snippet
```java

import java.net.URL;
import java.util.Enumeration;

/**
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.ExecutorService;`
in `api/src/main/java/org/apache/unomi/api/services/SchedulerService.java`
#### Snippet
```java
package org.apache.unomi.api.services;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

```

### UNUSED_IMPORT
Unused import `import java.io.StringWriter;`
in `common/src/main/java/org/apache/unomi/common/DataTable.java`
#### Snippet
```java

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Comparator;
```

### UNUSED_IMPORT
Unused import `import com.networknt.schema.ValidationMessage;`
in `extensions/json-schema/services/src/main/java/org/apache/unomi/schema/api/ValidationError.java`
#### Snippet
```java
package org.apache.unomi.schema.api;

import com.networknt.schema.ValidationMessage;

import java.io.Serializable;
```

### UNUSED_IMPORT
Unused import `import java.text.MessageFormat;`
in `extensions/json-schema/services/src/main/java/org/apache/unomi/schema/impl/SchemaServiceImpl.java`
#### Snippet
```java
import java.io.InputStream;
import java.net.URI;
import java.text.MessageFormat;
import java.util.*;
import java.util.concurrent.*;
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.api.conditions.Condition;`
in `extensions/router/router-api/src/main/java/org/apache/unomi/router/api/ExportConfiguration.java`
#### Snippet
```java

import org.apache.unomi.api.Item;
import org.apache.unomi.api.conditions.Condition;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.api.MetadataItem;`
in `extensions/router/router-api/src/main/java/org/apache/unomi/router/api/ImportConfiguration.java`
#### Snippet
```java

import org.apache.unomi.api.Item;
import org.apache.unomi.api.MetadataItem;

import javax.lang.model.type.MirroredTypeException;
```

### UNUSED_IMPORT
Unused import `import javax.lang.model.type.MirroredTypeException;`
in `extensions/router/router-api/src/main/java/org/apache/unomi/router/api/ImportConfiguration.java`
#### Snippet
```java
import org.apache.unomi.api.MetadataItem;

import javax.lang.model.type.MirroredTypeException;
import java.util.*;

```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.api.PropertyType;`
in `extensions/router/router-api/src/main/java/org/apache/unomi/router/api/services/ProfileExportService.java`
#### Snippet
```java

import org.apache.unomi.api.Profile;
import org.apache.unomi.api.PropertyType;
import org.apache.unomi.router.api.ExportConfiguration;

```

### UNUSED_IMPORT
Unused import `import java.util.Collection;`
in `extensions/router/router-api/src/main/java/org/apache/unomi/router/api/services/ProfileExportService.java`
#### Snippet
```java
import org.apache.unomi.router.api.ExportConfiguration;

import java.util.Collection;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.api.services.SchedulerService;`
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/context/RouterCamelContext.java`
#### Snippet
```java
import org.apache.unomi.api.services.ConfigSharingService;
import org.apache.unomi.api.services.ProfileService;
import org.apache.unomi.api.services.SchedulerService;
import org.apache.unomi.persistence.spi.PersistenceService;
import org.apache.unomi.router.api.ExportConfiguration;
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.api.PropertyType;`
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/LineBuildProcessor.java`
#### Snippet
```java
import org.apache.camel.Processor;
import org.apache.unomi.api.Profile;
import org.apache.unomi.api.PropertyType;
import org.apache.unomi.router.api.ExportConfiguration;
import org.apache.unomi.router.api.services.ProfileExportService;
```

### UNUSED_IMPORT
Unused import `import java.util.Collection;`
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/LineBuildProcessor.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

import java.util.Collection;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.api.services.ProfileService;`
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/LineSplitProcessor.java`
#### Snippet
```java
import org.apache.commons.lang3.StringUtils;
import org.apache.unomi.api.PropertyType;
import org.apache.unomi.api.services.ProfileService;
import org.apache.unomi.router.api.ImportConfiguration;
import org.apache.unomi.router.api.ProfileToImport;
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.router.api.services.ImportExportConfigurationService;`
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/route/ProfileExportCollectRouteBuilder.java`
#### Snippet
```java
import org.apache.unomi.router.api.ExportConfiguration;
import org.apache.unomi.router.api.RouterConstants;
import org.apache.unomi.router.api.services.ImportExportConfigurationService;
import org.apache.unomi.router.core.bean.CollectProfileBean;
import org.slf4j.Logger;
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.api.utils.ValidationPattern;`
in `extensions/router/router-rest/src/main/java/org/apache/unomi/router/rest/ImportConfigurationServiceEndPoint.java`
#### Snippet
```java
import org.apache.cxf.rs.security.cors.CrossOriginResourceSharing;
import org.apache.unomi.api.services.ConfigSharingService;
import org.apache.unomi.api.utils.ValidationPattern;
import org.apache.unomi.router.api.ImportConfiguration;
import org.apache.unomi.router.api.RouterConstants;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Collectors;`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentProfileIDsConditionParser.java`
#### Snippet
```java
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SegmentProfileIDsConditionParser {
```

### UNUSED_IMPORT
Unused import `import com.networknt.schema.JsonSchema;`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaProvider.java`
#### Snippet
```java

import com.fasterxml.jackson.core.JsonProcessingException;
import com.networknt.schema.JsonSchema;
import graphql.annotations.AnnotationsSchemaCreator;
import graphql.annotations.processor.GraphQLAnnotations;
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.api.PropertyType;`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/PropertyFilterUtils.java`
#### Snippet
```java
import graphql.schema.GraphQLInputObjectType;
import graphql.schema.GraphQLInputType;
import org.apache.unomi.api.PropertyType;
import org.apache.unomi.graphql.scalars.DateTimeFunction;
import org.apache.unomi.graphql.scalars.GeoPointFunction;
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.api.services.DefinitionsService;`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/services/ServiceManager.java`
#### Snippet
```java
package org.apache.unomi.graphql.services;

import org.apache.unomi.api.services.DefinitionsService;
import org.apache.unomi.api.services.EventService;
import org.apache.unomi.api.services.PrivacyService;
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.api.services.EventService;`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/services/ServiceManager.java`
#### Snippet
```java

import org.apache.unomi.api.services.DefinitionsService;
import org.apache.unomi.api.services.EventService;
import org.apache.unomi.api.services.PrivacyService;
import org.apache.unomi.api.services.ProfileService;
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.api.services.PrivacyService;`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/services/ServiceManager.java`
#### Snippet
```java
import org.apache.unomi.api.services.DefinitionsService;
import org.apache.unomi.api.services.EventService;
import org.apache.unomi.api.services.PrivacyService;
import org.apache.unomi.api.services.ProfileService;
import org.apache.unomi.api.services.SegmentService;
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.api.services.ProfileService;`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/services/ServiceManager.java`
#### Snippet
```java
import org.apache.unomi.api.services.EventService;
import org.apache.unomi.api.services.PrivacyService;
import org.apache.unomi.api.services.ProfileService;
import org.apache.unomi.api.services.SegmentService;
import org.apache.unomi.api.services.UserListService;
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.api.services.SegmentService;`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/services/ServiceManager.java`
#### Snippet
```java
import org.apache.unomi.api.services.PrivacyService;
import org.apache.unomi.api.services.ProfileService;
import org.apache.unomi.api.services.SegmentService;
import org.apache.unomi.api.services.UserListService;
import org.apache.unomi.graphql.schema.CDPEventInterfaceRegister;
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.api.services.UserListService;`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/services/ServiceManager.java`
#### Snippet
```java
import org.apache.unomi.api.services.ProfileService;
import org.apache.unomi.api.services.SegmentService;
import org.apache.unomi.api.services.UserListService;
import org.apache.unomi.graphql.schema.CDPEventInterfaceRegister;
import org.apache.unomi.graphql.schema.CDPProfileInterfaceRegister;
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.graphql.schema.CDPEventInterfaceRegister;`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/services/ServiceManager.java`
#### Snippet
```java
import org.apache.unomi.api.services.SegmentService;
import org.apache.unomi.api.services.UserListService;
import org.apache.unomi.graphql.schema.CDPEventInterfaceRegister;
import org.apache.unomi.graphql.schema.CDPProfileInterfaceRegister;
import org.apache.unomi.graphql.schema.CDPPropertyInterfaceRegister;
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.graphql.schema.CDPProfileInterfaceRegister;`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/services/ServiceManager.java`
#### Snippet
```java
import org.apache.unomi.api.services.UserListService;
import org.apache.unomi.graphql.schema.CDPEventInterfaceRegister;
import org.apache.unomi.graphql.schema.CDPProfileInterfaceRegister;
import org.apache.unomi.graphql.schema.CDPPropertyInterfaceRegister;
import org.apache.unomi.graphql.schema.GraphQLSchemaUpdater;
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.graphql.schema.CDPPropertyInterfaceRegister;`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/services/ServiceManager.java`
#### Snippet
```java
import org.apache.unomi.graphql.schema.CDPEventInterfaceRegister;
import org.apache.unomi.graphql.schema.CDPProfileInterfaceRegister;
import org.apache.unomi.graphql.schema.CDPPropertyInterfaceRegister;
import org.apache.unomi.graphql.schema.GraphQLSchemaUpdater;
import org.apache.unomi.persistence.spi.PersistenceService;
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.graphql.schema.GraphQLSchemaUpdater;`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/services/ServiceManager.java`
#### Snippet
```java
import org.apache.unomi.graphql.schema.CDPProfileInterfaceRegister;
import org.apache.unomi.graphql.schema.CDPPropertyInterfaceRegister;
import org.apache.unomi.graphql.schema.GraphQLSchemaUpdater;
import org.apache.unomi.persistence.spi.PersistenceService;
import org.osgi.framework.BundleContext;
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.persistence.spi.PersistenceService;`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/services/ServiceManager.java`
#### Snippet
```java
import org.apache.unomi.graphql.schema.CDPPropertyInterfaceRegister;
import org.apache.unomi.graphql.schema.GraphQLSchemaUpdater;
import org.apache.unomi.persistence.spi.PersistenceService;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventTypeInput.java`
#### Snippet
```java
import graphql.annotations.annotationTypes.GraphQLName;

import java.util.ArrayList;
import java.util.List;

```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.metrics.MetricsService;`
in `metrics/src/main/java/org/apache/unomi/metrics/commands/ResetCommand.java`
#### Snippet
```java
import org.apache.karaf.shell.commands.Command;
import org.apache.karaf.shell.console.OsgiCommandSupport;
import org.apache.unomi.metrics.MetricsService;

@Command(scope = "metrics", name = "reset", description = "This will reset all the metrics to zero.")
```

### UNUSED_IMPORT
Unused import `import com.google.common.collect.Lists;`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/conditions/ConditionContextHelper.java`
#### Snippet
```java
import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.core.util.IOUtils;
```

### UNUSED_IMPORT
Unused import `import java.util.function.Consumer;`
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PersistenceService.java`
#### Snippet
```java
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.api.Profile;`
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyHelper.java`
#### Snippet
```java
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.beanutils.expression.DefaultResolver;
import org.apache.unomi.api.Profile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
```

### UNUSED_IMPORT
Unused import `import java.util.LinkedHashMap;`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/SetEventOccurenceCountAction.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;

```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/SetEventOccurenceCountAction.java`
#### Snippet
```java
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.bind.DatatypeConverter;
```

### UNUSED_IMPORT
Unused import `import java.io.ByteArrayInputStream;`
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executors;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Collectors;`
in `rest/src/main/java/org/apache/unomi/rest/service/impl/RestServiceUtilsImpl.java`
#### Snippet
```java
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component(service = RestServiceUtils.class)
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.beanutils.PropertyUtils;`
in `services/src/main/java/org/apache/unomi/services/actions/impl/ActionExecutorDispatcherImpl.java`
#### Snippet
```java
package org.apache.unomi.services.actions.impl;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.unomi.api.Event;
```

### UNUSED_IMPORT
Unused import `import com.fasterxml.jackson.databind.JsonNode;`
in `services/src/main/java/org/apache/unomi/services/impl/events/EventServiceImpl.java`
#### Snippet
```java
package org.apache.unomi.services.impl.events;

import com.fasterxml.jackson.databind.JsonNode;
import inet.ipaddr.IPAddress;
import inet.ipaddr.IPAddressString;
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.persistence.spi.CustomObjectMapper;`
in `services/src/main/java/org/apache/unomi/services/impl/events/EventServiceImpl.java`
#### Snippet
```java
import org.apache.unomi.api.query.Query;
import org.apache.unomi.api.services.*;
import org.apache.unomi.persistence.spi.CustomObjectMapper;
import org.apache.unomi.persistence.spi.PersistenceService;
import org.apache.unomi.persistence.spi.aggregate.TermsAggregate;
```

### UNUSED_IMPORT
Unused import `import org.apache.unomi.api.conditions.ConditionType;`
in `services/src/main/java/org/apache/unomi/services/impl/rules/RulesServiceImpl.java`
#### Snippet
```java
import org.apache.unomi.api.actions.Action;
import org.apache.unomi.api.conditions.Condition;
import org.apache.unomi.api.conditions.ConditionType;
import org.apache.unomi.api.query.Query;
import org.apache.unomi.api.rules.Rule;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Collectors;`
in `services/src/main/java/org/apache/unomi/services/impl/rules/RulesServiceImpl.java`
#### Snippet
```java
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class RulesServiceImpl implements RulesService, EventListenerService, SynchronousBundleListener {
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `newValues` are updated, but never queried
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ContextJsonEndpoint.java`
#### Snippet
```java
        } else if (value instanceof List) {
            List values = (List) value;
            List newValues = new ArrayList();
            for (Object listObject : values) {
                Object newObject = sanitizeValue(listObject);
```

### MismatchedCollectionQueryUpdate
Contents of collection `newParameterValues` are updated, but never queried
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ContextJsonEndpoint.java`
#### Snippet
```java

    private Condition sanitizeCondition(Condition condition) {
        Map<String, Object> newParameterValues = new LinkedHashMap<>();
        for (Map.Entry<String, Object> parameterEntry : condition.getParameterValues().entrySet()) {
            Object sanitizedValue = sanitizeValue(parameterEntry.getValue());
```

## RuleId[id=SlowAbstractSetRemoveAll]
### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `extensions/privacy-extension/services/src/main/java/org/apache/unomi/privacy/internal/PrivacyServiceImpl.java`
#### Snippet
```java
        anonymousProfile.getSystemProperties().put("isAnonymousProfile", true);
        anonymousProfile.getProperties().putAll(profile.getProperties());
        anonymousProfile.getProperties().keySet().removeAll(getDeniedProperties(profile.getItemId()));
//        profileService.save(anonymousProfile);
        return anonymousProfile;
```

### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `extensions/privacy-extension/services/src/main/java/org/apache/unomi/privacy/internal/PrivacyServiceImpl.java`
#### Snippet
```java
        eventService.send(new Event("anonymizeProfile", null, profile, scope, null, profile, null, new Date(), false));

        boolean res = profile.getProperties().keySet().removeAll(getDeniedProperties(profile.getItemId()));

        eventService.send(new Event("profileUpdated", null, profile, scope, null, profile, null, new Date(), false));
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `rest/src/main/java/org/apache/unomi/rest/deserializers/EventsCollectorRequestDeserializer.java`
#### Snippet
```java

    @Override
    public EventsCollectorRequest deserialize(JsonParser jsonParser, DeserializationContext context) throws IOException, JsonProcessingException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        if (!schemaService.isValid(node.toString(), "https://unomi.apache.org/schemas/json/rest/eventscollectorrequest/1-0-0")) {
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java
    }

    private void consume() throws UnsupportedEncodingException, IOException, JsonMappingException {
        ConsumerRecords<String, String> records = consumer.poll(10000);
        if (records.isEmpty()) {
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java
    }

    private void consume() throws UnsupportedEncodingException, IOException, JsonMappingException {
        ConsumerRecords<String, String> records = consumer.poll(10000);
        if (records.isEmpty()) {
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `extensions/router/router-service/src/main/java/org/apache/unomi/router/services/ProfileExportServiceImpl.java`
#### Snippet
```java
                if (propertyValue != null) {
                    List<String> multiValue = (List<String>) propertyValue;
                    lineToWrite += StringUtils.isNotBlank(exportConfiguration.getMultiValueDelimiter()) ? exportConfiguration.getMultiValueDelimiter().charAt(0) : "";
                    int j = 0;
                    for (String entry : multiValue) {
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `extensions/router/router-service/src/main/java/org/apache/unomi/router/services/ProfileExportServiceImpl.java`
#### Snippet
```java
                    int j = 0;
                    for (String entry : multiValue) {
                        lineToWrite += entry.replaceAll("\"", "\"\"");
                        if (j + 1 < multiValue.size()) {
                            lineToWrite += exportConfiguration.getMultiValueSeparator();
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `extensions/router/router-service/src/main/java/org/apache/unomi/router/services/ProfileExportServiceImpl.java`
#### Snippet
```java
                    lineToWrite += StringUtils.isNotBlank(exportConfiguration.getMultiValueDelimiter()) ? exportConfiguration.getMultiValueDelimiter().charAt(1) : "";
                } else {
                    lineToWrite += "";
                }
            } else {
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `extensions/router/router-service/src/main/java/org/apache/unomi/router/services/ProfileExportServiceImpl.java`
#### Snippet
```java
                        propertyValue = "\"" + propertyValue + "\"";
                    }
                    lineToWrite += propertyValue.toString();
                } else {
                    lineToWrite += "";
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `extensions/router/router-service/src/main/java/org/apache/unomi/router/services/ProfileExportServiceImpl.java`
#### Snippet
```java
                    lineToWrite += propertyValue.toString();
                } else {
                    lineToWrite += "";
                }
            }
```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyTypedObjectDeserializer.java`
#### Snippet
```java
        ObjectCodec codec = jp.getCodec();
        TreeNode treeNode = codec.readTree(jp);
        Class<? extends Object> objectClass = null;
        if (treeNode instanceof ObjectNode) {
            ObjectNode root = (ObjectNode) treeNode;
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyTypedObjectDeserializer.java`
#### Snippet
```java
    private static final long serialVersionUID = -2561171359946902967L;

    private Map<String, Class<? extends Object>> registry =
            new LinkedHashMap<String, Class<? extends Object>>();

```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyTypedObjectDeserializer.java`
#### Snippet
```java

    private Map<String, Class<? extends Object>> registry =
            new LinkedHashMap<String, Class<? extends Object>>();

    private Map<String,Set<String>> fieldValuesToMatch = new LinkedHashMap<String,Set<String>>();
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyTypedObjectDeserializer.java`
#### Snippet
```java

    public void registerMapping(String matchExpression,
                                Class<? extends Object> mappedClass) {
        registry.put(matchExpression, mappedClass);
        String[] fieldParts = matchExpression.split("=");
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `childProperties` initializer `null` is redundant
in `services/src/main/java/org/apache/unomi/services/impl/events/EventServiceImpl.java`
#### Snippet
```java
        Set<PropertyType> properties = new LinkedHashSet<>();
        for (Map.Entry<String, Map<String, Object>> e : mappings.entrySet()) {
            Set<PropertyType> childProperties = null;
            Metadata propertyMetadata = new Metadata(null, e.getKey(), e.getKey(), null);
            Set<String> systemTags = new HashSet<>();
```

### UnusedAssignment
Variable `valueType` initializer `null` is redundant
in `services/src/main/java/org/apache/unomi/services/impl/events/EventServiceImpl.java`
#### Snippet
```java
            PropertyType propertyType = new PropertyType(propertyMetadata);
            propertyType.setTarget("event");
            ValueType valueType = null;
            if (e.getValue().get("properties") != null) {
                childProperties = getEventPropertyTypes((Map<String, Map<String, Object>>) e.getValue().get("properties"));
```

### UnusedAssignment
Variable `propertyTypesByTags` initializer `new HashMap<>()` is redundant
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
        private List<PropertyType> allPropertyTypes;
        private Map<String, PropertyType> propertyTypesById = new HashMap<>();
        private Map<String, List<PropertyType>> propertyTypesByTags = new HashMap<>();
        private Map<String, List<PropertyType>> propertyTypesBySystemTags = new HashMap<>();
        private Map<String, List<PropertyType>> propertyTypesByTarget = new HashMap<>();
```

### UnusedAssignment
Variable `propertyTypesByTarget` initializer `new HashMap<>()` is redundant
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
        private Map<String, List<PropertyType>> propertyTypesByTags = new HashMap<>();
        private Map<String, List<PropertyType>> propertyTypesBySystemTags = new HashMap<>();
        private Map<String, List<PropertyType>> propertyTypesByTarget = new HashMap<>();

        public PropertyTypes(List<PropertyType> allPropertyTypes) {
```

### UnusedAssignment
Variable `propertyTypesBySystemTags` initializer `new HashMap<>()` is redundant
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
        private Map<String, PropertyType> propertyTypesById = new HashMap<>();
        private Map<String, List<PropertyType>> propertyTypesByTags = new HashMap<>();
        private Map<String, List<PropertyType>> propertyTypesBySystemTags = new HashMap<>();
        private Map<String, List<PropertyType>> propertyTypesByTarget = new HashMap<>();

```

### UnusedAssignment
Variable `propertyTypesById` initializer `new HashMap<>()` is redundant
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
    private static class PropertyTypes {
        private List<PropertyType> allPropertyTypes;
        private Map<String, PropertyType> propertyTypesById = new HashMap<>();
        private Map<String, List<PropertyType>> propertyTypesByTags = new HashMap<>();
        private Map<String, List<PropertyType>> propertyTypesBySystemTags = new HashMap<>();
```

### UnusedAssignment
Variable `baseUrl` initializer `null` is redundant
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        // first we must check if an existing lead exists for the profile.

        String baseUrl = null;
        try {
            baseUrl = sfdcSession.getEndPoint() + REST_ENDPOINT_URI + "/query?q=" + URLEncoder.encode(query, "UTF-8");
```

### UnusedAssignment
The value `iso8601DateFormat.parse((String) existingSfdcLeadFields.get("LastModifiedDate"))` assigned to `sfdcLastModified` is never used
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            if (existingSfdcLeadFields.get("LastModifiedDate") != null) {
                try {
                    sfdcLastModified = iso8601DateFormat.parse((String) existingSfdcLeadFields.get("LastModifiedDate"));
                } catch (ParseException e) {
                    logger.error("Error parsing date {}", existingSfdcLeadFields.get("LastModifiedDate"), e);
```

### UnusedAssignment
Variable `baseUrl` initializer `null` is redundant
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            return null;
        }
        String baseUrl = null;
        try {
            baseUrl = sfdcSession.getEndPoint() + REST_ENDPOINT_URI + "/limits";
```

### UnusedAssignment
Variable `loginSuccessful` initializer `false` is redundant
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            return sfdcSession;
        }
        boolean loginSuccessful = false;
        try {
            loginSuccessful = login(sfdcConfiguration);
```

### UnusedAssignment
The value `false` assigned to `result` is never used
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            } catch (HttpException e) {
                logger.warn("Error trying to login with new configuration {}", sfdcConfiguration, e);
                result = false;
            } catch (IOException e) {
                logger.warn("Error trying to login with new configuration {}", sfdcConfiguration, e);
```

### UnusedAssignment
Variable `allowedClasses` initializer `null` is redundant
in `scripting/src/main/java/org/apache/unomi/scripting/SecureFilteringClassLoader.java`
#### Snippet
```java
public class SecureFilteringClassLoader extends ClassLoader {

    private Set<String> allowedClasses = null;
    private Set<String> forbiddenClasses = null;

```

### UnusedAssignment
Variable `forbiddenClasses` initializer `null` is redundant
in `scripting/src/main/java/org/apache/unomi/scripting/SecureFilteringClassLoader.java`
#### Snippet
```java

    private Set<String> allowedClasses = null;
    private Set<String> forbiddenClasses = null;

    private static Set<String> defaultAllowedClasses = null;
```

### UnusedAssignment
Variable `list` initializer `null` is redundant
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/strategy/ArrayListAggregationStrategy.java`
#### Snippet
```java
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        Object newBody = newExchange.getIn().getBody();
        ArrayList<Object> list = null;
        if (oldExchange == null) {
            list = new ArrayList<Object>();
```

### UnusedAssignment
Variable `importConfigId` initializer `null` is redundant
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/ImportRouteCompletionProcessor.java`
#### Snippet
```java
    @Override
    public void process(Exchange exchange) throws Exception {
        String importConfigId = null;
        ImportConfiguration importConfigOneShot = (ImportConfiguration) exchange.getIn().getHeader(RouterConstants.HEADER_IMPORT_CONFIG_ONESHOT);
        if (importConfigOneShot != null) {
```

### UnusedAssignment
Variable `propType` initializer `null` is redundant
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/UpdatePropertiesAction.java`
#### Snippet
```java
        boolean isProfileOrPersonaUpdated = false;
        for (String prop : propsMap.keySet()) {
            PropertyType propType = null;
            if (prop.startsWith("properties.") || prop.startsWith("systemProperties.")) {
                propType = profileService.getPropertyType(prop.substring(prop.indexOf('.') + 1));
```

### UnusedAssignment
Variable `consent` initializer `null` is redundant
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/ModifyConsentAction.java`
#### Snippet
```java
        if (consentMap != null) {
            if (consentMap.containsKey("typeIdentifier") && consentMap.containsKey("status")) {
                Consent consent = null;
                try {
                    consent = new Consent(consentMap, dateFormat);
```

### UnusedAssignment
Variable `types` initializer `null` is redundant
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/json/JSONTypeFactory.java`
#### Snippet
```java
            return new ArrayList<>();
        }
        List<String> types = null;
        if (typeObject instanceof String) {
            types = new ArrayList<>();
```

### UnusedAssignment
Variable `objectType` initializer `null` is redundant
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaProvider.java`
#### Snippet
```java
                String childPropertyName = PropertyNameTranslator.translateFromUnomiToGraphQL(childPropertyType.getName());

                GraphQLOutputType objectType = null;
                if (isSet) {
                    objectType = createDynamicSetOutputType(childPropertyType, codeRegisterBuilder, typeName + "_" + childPropertyName);
```

### UnusedAssignment
Variable `builtinItemTypeClasses` initializer `new HashMap<>()` is redundant
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/CustomObjectMapper.java`
#### Snippet
```java
    private static final long serialVersionUID = 4578277612897061535L;
    
    private Map<String,Class<? extends Item>> builtinItemTypeClasses = new HashMap<>();
    private PropertyTypedObjectDeserializer propertyTypedObjectDeserializer;
    private ItemDeserializer itemDeserializer;
```

### UnusedAssignment
Variable `serviceReference` initializer `new ServiceReference[0]` is redundant
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
    private void displayLogsForInactiveServices() {
        requiredServicesFilters.forEach(requiredServicesFilter -> {
            ServiceReference[] serviceReference = new ServiceReference[0];
            String filterToString = requiredServicesFilter.toString();
            try {
```

### UnusedAssignment
Variable `serverIdentifier` initializer `"n/a"` is redundant
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java

    public ServerInfo getBundleServerInfo(Bundle bundle) {
        String serverIdentifier = "n/a";
        if (bundle.getHeaders().get("Implementation-ServerIdentifier") != null) {
            serverIdentifier = bundle.getHeaders().get("Implementation-ServerIdentifier");
```

### UnusedAssignment
Variable `propMapping` initializer `null` is redundant
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java

    private Map<String, Object> getPropertyMapping(String property, Map<String, Map<String, Object>> mappings) {
        Map<String, Object> propMapping = null;
        String[] properties = StringUtils.split(property, '.');
        for (int i = 0; i < properties.length && mappings != null; i++) {
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `childProperties != null` is always `true`
in `services/src/main/java/org/apache/unomi/services/impl/events/EventServiceImpl.java`
#### Snippet
```java
                childProperties = getEventPropertyTypes((Map<String, Map<String, Object>>) e.getValue().get("properties"));
                valueType = definitionsService.getValueType("set");
                if (childProperties != null && childProperties.size() > 0) {
                    propertyType.setChildPropertyTypes(childProperties);
                }
```

### ConstantValue
Condition `setupConfigOk` is always `true`
in `services/src/main/java/org/apache/unomi/services/impl/cluster/ClusterServiceImpl.java`
#### Snippet
```java
            boolean setupConfigOk = true;
            group = karafCellarGroupManager.findGroupByName(karafCellarGroupName);
            if (setupConfigOk && group == null) {
                logger.error("Cluster group " + karafCellarGroupName + " doesn't exist, creating it...");
                group = karafCellarGroupManager.createGroup(karafCellarGroupName);
```

### ConstantValue
Condition `query != null` is always `true`
in `services/src/main/java/org/apache/unomi/services/impl/goals/GoalsServiceImpl.java`
#### Snippet
```java
        BaseAggregate aggregate = null;
        String property = query.getAggregate().getProperty();
        if(query != null && query.getAggregate() != null && property != null) {
            if (query.getAggregate().getType() != null){
                // try to guess the aggregate type
```

### ConstantValue
Condition `mappings != null` is always `true`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/SFDCConfiguration.java`
#### Snippet
```java
        this.sfdcFieldMappings = sfdcFieldMappings;
        String[] mappings = sfdcFieldMappings.split(",");
        if (mappings != null && mappings.length > 0) {
            for (String mapping : mappings) {
                String[] parts = mapping.split("<=>");
```

### ConstantValue
Condition `parts != null` is always `true`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/SFDCConfiguration.java`
#### Snippet
```java
            for (String mapping : mappings) {
                String[] parts = mapping.split("<=>");
                if (parts != null && parts.length == 2) {
                    unomiToSfdcFieldMappings.put(parts[0], parts[1]);
                    sfdcToUnomiFieldMappings.put(parts[1], parts[0]);
```

### ConstantValue
Condition `sfdcFieldMappingsIdentifierParts != null` is always `true`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/SFDCConfiguration.java`
#### Snippet
```java
        this.sfdcFieldMappingsIdentifier = sfdcFieldMappingsIdentifier;
        String[] sfdcFieldMappingsIdentifierParts = sfdcFieldMappingsIdentifier.split("<=>");
        if (sfdcFieldMappingsIdentifierParts != null && sfdcFieldMappingsIdentifierParts.length == 2) {
            unomiIdentifierField = sfdcFieldMappingsIdentifierParts[0];
            sfdcIdentifierField = sfdcFieldMappingsIdentifierParts[1];
```

### ConstantValue
Value `tag` is always 'null'
in `services/src/main/java/org/apache/unomi/services/impl/definitions/DefinitionsServiceImpl.java`
#### Snippet
```java
                    } else {
                        // we found a tag that is not defined, we will define it automatically
                        logger.warn("Unknown tag {} used in property type definition {}", tag, predefinedPropertyURL);
                    }
                }
```

### ConstantValue
Condition `propertyMergeStrategyId.length() > 0` is always `true` when reached
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
            String propertyMergeStrategyId = "defaultMergeStrategy";
            if (propertyType != null) {
                if (propertyType.getMergeStrategy() != null && propertyMergeStrategyId.length() > 0) {
                    propertyMergeStrategyId = propertyType.getMergeStrategy();
                }
```

### ConstantValue
Condition `responseObject != null` is always `true`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
                return null;
            }
            if (responseObject != null && responseObject instanceof Map) {
                return (Map<String, Object>) responseObject;
            }
```

### ConstantValue
Condition `queryResponse != null` is always `true`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            }
            Map<String, Object> queryResponse = (Map<String, Object>) responseObject;
            if (queryResponse != null) {
                logger.debug("Response received from Salesforce: {}", queryResponse);
                sobjectMap = new LinkedHashMap<>(queryResponse);
```

### ConstantValue
Condition `queryResponse != null` is always `true`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            }
            Map<String, Object> queryResponse = (Map<String, Object>) responseObject;
            if (queryResponse != null) {
                logger.debug("Response received from Salesforce: {}", queryResponse);
                sobjectDescribe = new LinkedHashMap<>(queryResponse);
```

### ConstantValue
Condition `i < sortCriterias.length` is always `true`
in `common/src/main/java/org/apache/unomi/common/DataTable.java`
#### Snippet
```java
                    if (rowComparison == 0) {
                        // rows are equal on this criteria, let's go to the next criteria if it exists
                        if (i < sortCriterias.length) {
                            i++;
                        } else {
```

### ConstantValue
Condition `initialFilterCollectionParts != null` is always `true`
in `scripting/src/main/java/org/apache/unomi/scripting/internal/ExpressionFilterFactoryImpl.java`
#### Snippet
```java
        String initialFilterCollections = System.getProperty("org.apache.unomi.scripting.filter.collections", "mvel,ognl");
        String[] initialFilterCollectionParts = initialFilterCollections.split(",");
        if (initialFilterCollectionParts != null) {
            for (String initialFilterCollection : initialFilterCollectionParts) {
                allowedExpressionPatternsByCollection.put(initialFilterCollection, loadPatternsFromConfig("org.apache.unomi.scripting.filter."+initialFilterCollection+".allow"));
```

### ConstantValue
Condition `profileData != null` is always `true`
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/LineSplitProcessor.java`
#### Snippet
```java
                PropertyType propertyType = RouterUtils.getPropertyTypeById(profilePropertyTypes, fieldMappingKey);

                if (fieldMappingKey != null && fieldsMapping.get(fieldMappingKey) != null && profileData != null && profileData[fieldsMapping.get(fieldMappingKey)] != null) {
                    logger.debug("$$$$ : LineSplitProcessor : PropType value : {}", profileData[fieldsMapping.get(fieldMappingKey)].trim());
                } else {
```

### ConstantValue
Condition `profileData != null` is always `true`
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/LineSplitProcessor.java`
#### Snippet
```java
                    } catch (Throwable t) {
                        logger.error("Error converting profileData", t);
                        if (fieldMappingKey != null && fieldsMapping.get(fieldMappingKey) != null && profileData != null && profileData[fieldsMapping.get(fieldMappingKey)] != null) {
                            throw new BadProfileDataFormatException("Unable to convert '" + profileData[fieldsMapping.get(fieldMappingKey)].trim() + "' to " + propertyType!=null?propertyType.getValueTypeId():"Null propertyType ", new Throwable("DATA_TYPE"));
                        } else {
```

### ConstantValue
Condition `"Unable to convert '" + profileData[fieldsMapping.get(fieldMappingKey)].trim() + "' to " + propertyT...` is always `true`
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/LineSplitProcessor.java`
#### Snippet
```java
                        logger.error("Error converting profileData", t);
                        if (fieldMappingKey != null && fieldsMapping.get(fieldMappingKey) != null && profileData != null && profileData[fieldsMapping.get(fieldMappingKey)] != null) {
                            throw new BadProfileDataFormatException("Unable to convert '" + profileData[fieldsMapping.get(fieldMappingKey)].trim() + "' to " + propertyType!=null?propertyType.getValueTypeId():"Null propertyType ", new Throwable("DATA_TYPE"));
                        } else {
                            throw new BadProfileDataFormatException("Unable to find profile data for key " + fieldMappingKey, new Throwable("DATA_TYPE"));
```

### ConstantValue
Condition `circleLatitude != null` is always `true`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/GeoLocationByPointSessionConditionESQueryBuilder.java`
#### Snippet
```java
            String distance = condition.getParameter("distance").toString();

            if(circleLatitude != null && circleLongitude != null && distance != null) {
                return QueryBuilders.geoDistanceQuery(name)
                        .point(circleLatitude, circleLongitude)
```

### ConstantValue
Condition `circleLongitude != null` is always `true`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/GeoLocationByPointSessionConditionESQueryBuilder.java`
#### Snippet
```java
            String distance = condition.getParameter("distance").toString();

            if(circleLatitude != null && circleLongitude != null && distance != null) {
                return QueryBuilders.geoDistanceQuery(name)
                        .point(circleLatitude, circleLongitude)
```

### ConstantValue
Value `dateValue` is always 'null'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionESQueryBuilder.java`
#### Snippet
```java
    private Object convertDateToISO(Object dateValue) {
        if (dateValue == null) {
            return dateValue;
        }
        if (dateValue instanceof Date) {
```

### ConstantValue
Value `scope` is always 'null'
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ContextJsonEndpoint.java`
#### Snippet
```java
        String scope = null;
        if (contextRequest != null) {
            scope = contextRequest.getSource() != null ? contextRequest.getSource().getScope() : scope;
            sessionId = contextRequest.getSessionId() != null ? contextRequest.getSessionId() : sessionId;
            profileId = contextRequest.getProfileId();
```

### ConstantValue
Condition `!anonymousSessionProfile` is always `true` when reached
in `rest/src/main/java/org/apache/unomi/rest/service/impl/RestServiceUtilsImpl.java`
#### Snippet
```java
                    if (requireAnonymousBrowsing && anonymousSessionProfile) {
                        // User wants to browse anonymously, anonymous profile is already set.
                    } else if (requireAnonymousBrowsing && !anonymousSessionProfile) {
                        // User wants to browse anonymously, update the sessionProfile to anonymous profile
                        sessionProfile = privacyService.getAnonymousProfile(eventsRequestContext.getProfile());
```

### ConstantValue
Condition `!requireAnonymousBrowsing` is always `true`
in `rest/src/main/java/org/apache/unomi/rest/service/impl/RestServiceUtilsImpl.java`
#### Snippet
```java
                        eventsRequestContext.getSession().setProfile(sessionProfile);
                        eventsRequestContext.addChanges(EventService.SESSION_UPDATED);
                    } else if (!requireAnonymousBrowsing && anonymousSessionProfile) {
                        // User does not want to browse anonymously anymore, update the sessionProfile to real profile
                        sessionProfile = eventsRequestContext.getProfile();
```

### ConstantValue
Condition `!requireAnonymousBrowsing` is always `true`
in `rest/src/main/java/org/apache/unomi/rest/service/impl/RestServiceUtilsImpl.java`
#### Snippet
```java
                        eventsRequestContext.getSession().setProfile(sessionProfile);
                        eventsRequestContext.addChanges(EventService.SESSION_UPDATED);
                    } else if (!requireAnonymousBrowsing && !anonymousSessionProfile) {
                        // User does not want to browse anonymously, use the real profile. Check that session contains the current profile.
                        sessionProfile = eventsRequestContext.getProfile();
```

### ConstantValue
Condition `!requireAnonymousBrowsing && !anonymousSessionProfile` is always `true`
in `rest/src/main/java/org/apache/unomi/rest/service/impl/RestServiceUtilsImpl.java`
#### Snippet
```java
                        eventsRequestContext.getSession().setProfile(sessionProfile);
                        eventsRequestContext.addChanges(EventService.SESSION_UPDATED);
                    } else if (!requireAnonymousBrowsing && !anonymousSessionProfile) {
                        // User does not want to browse anonymously, use the real profile. Check that session contains the current profile.
                        sessionProfile = eventsRequestContext.getProfile();
```

### ConstantValue
Condition `!anonymousSessionProfile` is always `true` when reached
in `rest/src/main/java/org/apache/unomi/rest/service/impl/RestServiceUtilsImpl.java`
#### Snippet
```java
                        eventsRequestContext.getSession().setProfile(sessionProfile);
                        eventsRequestContext.addChanges(EventService.SESSION_UPDATED);
                    } else if (!requireAnonymousBrowsing && !anonymousSessionProfile) {
                        // User does not want to browse anonymously, use the real profile. Check that session contains the current profile.
                        sessionProfile = eventsRequestContext.getProfile();
```

### ConstantValue
Value `isSystemTag` is always 'true'
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ProfileServiceEndPoint.java`
#### Snippet
```java
        Set<PropertyType> properties;
        if (isSystemTag) {
            properties = profileService.getExistingProperties(tag, itemType, isSystemTag);
        } else {
            properties = profileService.getExistingProperties(tag, itemType);
```

### ConstantValue
Condition `properties == null` is always `false`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/profile/PropertiesConnectionDataFetcher.java`
#### Snippet
```java
        final int startIndex = Math.max(0, params.getOffset());
        final int lastIndex = Math.min(params.getOffset() + params.getSize(), properties.size());
        if (properties == null || properties.size() == 0 || properties.size() < startIndex || lastIndex <= 0) {
            return new CDPPropertyConnection();
        }
```

### ConstantValue
Value `filter` is always 'null'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                    return ((IdsQueryBuilder) filter).ids().size();
                }
                return queryCount(filter, itemType);
            } catch (UnsupportedOperationException e1) {
                return -1;
```

### ConstantValue
Condition `propertyMapping != null` is always `true`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
            return null;
        }
        if (propertyMapping != null
                && "text".equals(propertyMapping.get("type"))
                && propertyMapping.containsKey("fields")
```

### ConstantValue
Condition `backoffPolicyStr != null` is always `true`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
        if (bulkProcessorBackoffPolicy != null) {
            String backoffPolicyStr = bulkProcessorBackoffPolicy;
            if (backoffPolicyStr != null && backoffPolicyStr.length() > 0) {
                backoffPolicyStr = backoffPolicyStr.toLowerCase();
                if ("nobackoff".equals(backoffPolicyStr)) {
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/route/RouterAbstractRouteBuilder.java`
#### Snippet
```java
            kafkaUri.append(kafkaHost).append(":").append(kafkaPort).append("?topic=").append(kafkaTopic);
            if (StringUtils.isNotBlank(kafkaGroupId)) {
                kafkaUri.append("&groupId=" + kafkaGroupId);
            }
            if (RouterConstants.DIRECTION_TO.equals(direction)) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/route/RouterAbstractRouteBuilder.java`
#### Snippet
```java
            }
            if (RouterConstants.DIRECTION_TO.equals(direction)) {
                kafkaUri.append("&autoCommitEnable=" + kafkaAutoCommit + "&consumersCount=" + kafkaConsumerCount);
            }
            KafkaConfiguration kafkaConfiguration = new KafkaConfiguration();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuffer.append()` call
in `plugins/request/src/main/java/org/apache/unomi/plugins/request/useragent/UserAgent.java`
#### Snippet
```java
        StringBuffer sb = new StringBuffer();
        sb.append("User-Agent { \n");
        sb.append("agent.name: " + this.getUserAgentName() + ",\n");
        sb.append("agent.version: " + this.getUserAgentVersion() + ",\n");
        sb.append("operatingsystem.family: " + this.getOperatingSystemFamily() + ",\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuffer.append()` call
in `plugins/request/src/main/java/org/apache/unomi/plugins/request/useragent/UserAgent.java`
#### Snippet
```java
        sb.append("User-Agent { \n");
        sb.append("agent.name: " + this.getUserAgentName() + ",\n");
        sb.append("agent.version: " + this.getUserAgentVersion() + ",\n");
        sb.append("operatingsystem.family: " + this.getOperatingSystemFamily() + ",\n");
        sb.append("operatingsystem.name: " + this.getOperatingSystemName() + ",\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuffer.append()` call
in `plugins/request/src/main/java/org/apache/unomi/plugins/request/useragent/UserAgent.java`
#### Snippet
```java
        sb.append("agent.name: " + this.getUserAgentName() + ",\n");
        sb.append("agent.version: " + this.getUserAgentVersion() + ",\n");
        sb.append("operatingsystem.family: " + this.getOperatingSystemFamily() + ",\n");
        sb.append("operatingsystem.name: " + this.getOperatingSystemName() + ",\n");
        sb.append("device.category: " + this.getDeviceCategory() + " \n}");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuffer.append()` call
in `plugins/request/src/main/java/org/apache/unomi/plugins/request/useragent/UserAgent.java`
#### Snippet
```java
        sb.append("agent.version: " + this.getUserAgentVersion() + ",\n");
        sb.append("operatingsystem.family: " + this.getOperatingSystemFamily() + ",\n");
        sb.append("operatingsystem.name: " + this.getOperatingSystemName() + ",\n");
        sb.append("device.category: " + this.getDeviceCategory() + " \n}");
        sb.append("device.brand: " + this.getDeviceBrand() + " \n}");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuffer.append()` call
in `plugins/request/src/main/java/org/apache/unomi/plugins/request/useragent/UserAgent.java`
#### Snippet
```java
        sb.append("operatingsystem.family: " + this.getOperatingSystemFamily() + ",\n");
        sb.append("operatingsystem.name: " + this.getOperatingSystemName() + ",\n");
        sb.append("device.category: " + this.getDeviceCategory() + " \n}");
        sb.append("device.brand: " + this.getDeviceBrand() + " \n}");
        sb.append("device.name: " + this.getDeviceName() + " \n}");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuffer.append()` call
in `plugins/request/src/main/java/org/apache/unomi/plugins/request/useragent/UserAgent.java`
#### Snippet
```java
        sb.append("operatingsystem.name: " + this.getOperatingSystemName() + ",\n");
        sb.append("device.category: " + this.getDeviceCategory() + " \n}");
        sb.append("device.brand: " + this.getDeviceBrand() + " \n}");
        sb.append("device.name: " + this.getDeviceName() + " \n}");
        return super.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuffer.append()` call
in `plugins/request/src/main/java/org/apache/unomi/plugins/request/useragent/UserAgent.java`
#### Snippet
```java
        sb.append("device.category: " + this.getDeviceCategory() + " \n}");
        sb.append("device.brand: " + this.getDeviceBrand() + " \n}");
        sb.append("device.name: " + this.getDeviceName() + " \n}");
        return super.toString();
    }
```

## RuleId[id=RedundantOperationOnEmptyContainer]
### RedundantOperationOnEmptyContainer
Collection `lastAggregation` is always empty
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                    if (bucketsAggregation != null) {
                        final MissingAggregationBuilder missingBucketsAggregation = AggregationBuilders.missing("missing").field(fieldName);
                        for (AggregationBuilder aggregationBuilder : lastAggregation) {
                            bucketsAggregation.subAggregation(aggregationBuilder);
                            missingBucketsAggregation.subAggregation(aggregationBuilder);
```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/SFDCConfiguration.java`
#### Snippet
```java
        this.sfdcFieldMappings = sfdcFieldMappings;
        String[] mappings = sfdcFieldMappings.split(",");
        if (mappings != null && mappings.length > 0) {
            for (String mapping : mappings) {
                String[] parts = mapping.split("<=>");
```

### RedundantLengthCheck
Redundant array length check
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        if (!mappingConsentsString.isEmpty()) {
            String[] mappingConsents = mappingConsentsString.split(",");
            if (mappingConsents.length > 0) {
                for (String mappingConsent : mappingConsents) {
                    String[] mappingConsentArray = mappingConsent.split("<=>");
```

### RedundantLengthCheck
Redundant array length check
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/internal/MailChimpServiceImpl.java`
#### Snippet
```java
        if (StringUtils.isNotBlank(listMergeFields)) {
            String mergeFields[] = StringUtils.split(listMergeFields, SEPARATOR_CHARS_PROPERTIES);
            if (mergeFields.length > 0) {
                for (String mergeField : mergeFields) {
                    if (StringUtils.isNotBlank(mergeField)) {
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `samples/tweet-button-plugin/src/main/java/org/apache/unomi/samples/tweet_button_plugin/actions/IncrementTweetNumberAction.java`
#### Snippet
```java
        final Profile profile = event.getProfile();
        Integer tweetNb = (Integer) profile.getProperty(TWEET_NB_PROPERTY);
        List<String> tweetedFrom = (List<String>) profile.getProperty(TWEETED_FROM_PROPERTY);

        if (tweetNb == null || tweetedFrom == null) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.HashSet'
in `services/src/main/java/org/apache/unomi/services/impl/events/EventServiceImpl.java`
#### Snippet
```java
                ThirdPartyServer thirdPartyServer = thirdPartyServers.get(keys[1]);
                if (keys[2].equals("allowedEvents")) {
                    HashSet<String> allowedEvents = new HashSet<>(Arrays.asList(StringUtils.split(entry.getValue(), ',')));
                    restrictedEventTypeIds.addAll(allowedEvents);
                    thirdPartyServer.setAllowedEvents(allowedEvents);
```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `services/src/main/java/org/apache/unomi/services/impl/events/EventServiceImpl.java`
#### Snippet
```java
                ThirdPartyServer thirdPartyServer = thirdPartyServers.get(keys[1]);
                if (keys[2].equals("allowedEvents")) {
                    HashSet<String> allowedEvents = new HashSet<>(Arrays.asList(StringUtils.split(entry.getValue(), ',')));
                    restrictedEventTypeIds.addAll(allowedEvents);
                    thirdPartyServer.setAllowedEvents(allowedEvents);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.io.Serializable' to 'java.util.List'
in `services/src/main/java/org/apache/unomi/services/impl/cluster/ClusterServiceImpl.java`
#### Snippet
```java
                    clusterNode.setCpuLoad(systemCpuLoad);
                }
                List<Double> loadAverage = (List<Double>) nodeStatistics.get("systemLoadAverage");
                if (loadAverage != null) {
                    Double[] loadAverageArray = loadAverage.toArray(new Double[loadAverage.size()]);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\>'
in `services/src/main/java/org/apache/unomi/services/sorts/ControlGroupPersonalizationStrategy.java`
#### Snippet
```java
            systemPropertiesItem.getSystemProperties().put(PERSONALIZATION_STRATEGY_STATUS, strategyStatuses);
        } else {
            strategyStatuses = (List<Map<String, Object>>) systemPropertiesItem.getSystemProperties().get(PERSONALIZATION_STRATEGY_STATUS);
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `services/src/main/java/org/apache/unomi/services/sorts/ControlGroupPersonalizationStrategy.java`
#### Snippet
```java
    public PersonalizationResult personalizeList(Profile profile, Session session, PersonalizationService.PersonalizationRequest personalizationRequest) {
        if (personalizationRequest.getStrategyOptions() != null && personalizationRequest.getStrategyOptions().containsKey(CONTROL_GROUP_CONFIG)) {
            Map<String, Object> controlGroupMap = (Map<String, Object>) personalizationRequest.getStrategyOptions().get(CONTROL_GROUP_CONFIG);

            return controlGroupMap.containsKey(CONTROL_GROUP_CONFIG_STORE_IN_SESSION) &&
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\>'
in `services/src/main/java/org/apache/unomi/services/sorts/ScorePersonalizationStrategy.java`
#### Snippet
```java
            String interestList = (String) (personalizedContent.getProperties() != null ? personalizedContent.getProperties().get("interests") : null);
            if (interestList != null) {
                List<Map<String, Object>> profileInterests = (List<Map<String, Object>>) profile.getProperties().get("interests");
                if (profileInterests != null) {
                    for (String interest : interestList.split(" ")) {
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `plugins/mail/src/main/java/org/apache/unomi/plugins/mail/actions/SendMailAction.java`
#### Snippet
```java
                return EventService.NO_CHANGE;
            }else{
                ((HashMap) profileNotif.get(notifType) ).put(notifTypeId, notifTypeAck+1);
            }
        } else {
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `plugins/mail/src/main/java/org/apache/unomi/plugins/mail/actions/SendMailAction.java`
#### Snippet
```java
                profileNotif = new HashMap();
            }
            profileNotif.put(notifType, profileNotif.get(notifType)!=null?profileNotif.get(notifType):new HashMap());
            Integer notifTypeAck = (Integer) ((HashMap) profileNotif.get(notifType) ).get(notifTypeId);
            if(notifTypeAck == null){
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `plugins/mail/src/main/java/org/apache/unomi/plugins/mail/actions/SendMailAction.java`
#### Snippet
```java
            Integer notifTypeAck = (Integer) ((HashMap) profileNotif.get(notifType) ).get(notifTypeId);
            if(notifTypeAck == null){
                ((HashMap) profileNotif.get(notifType) ).put(notifTypeId, 1);
            }
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `extensions/geonames/services/src/main/java/org/apache/unomi/geonames/services/GeonamesServiceImpl.java`
#### Snippet
```java
    public PartialList<GeonameEntry> getChildrenEntries(List<String> items, int offset, int size) {
        Condition andCondition = getItemsInChildrenQuery(items, CITIES_FEATURE_CODES);
        Condition featureCodeCondition = ((List<Condition>) andCondition.getParameter("subConditions")).get(0);
        int level = items.size();

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `extensions/geonames/services/src/main/java/org/apache/unomi/geonames/services/GeonamesServiceImpl.java`
#### Snippet
```java
        featureCodeCondition.setParameter("propertyValues", featuresCode);

        List<Condition> l = (List<Condition>) andCondition.getParameter("subConditions");
        Condition condition = getPropertyCondition(featurePropertyName, "propertyValue", featureValue, "equals");
        l.add(condition);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\>'
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
                            // Special handling for personalization strategy statuses
                            // TODO UNOMI-719: move this in a dedicated extension point to handle this kind of merge strategy in a more generic way
                            List<Map<String, Object>> sourceStatuses = (List<Map<String, Object>>) sourceProperty.getValue();
                            List<Map<String, Object>> targetStatuses = (List<Map<String, Object>>) targetProperty;

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\>'
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
                            // TODO UNOMI-719: move this in a dedicated extension point to handle this kind of merge strategy in a more generic way
                            List<Map<String, Object>> sourceStatuses = (List<Map<String, Object>>) sourceProperty.getValue();
                            List<Map<String, Object>> targetStatuses = (List<Map<String, Object>>) targetProperty;

                            for (Map<String, Object> sourceStatus : sourceStatuses) {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Collection'
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
                                if (!targetCollection.contains(sourceItem)) {
                                    try {
                                        targetCollection.add(sourceItem);
                                        changed = true;
                                    } catch (Exception e) {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
        Set<PropertyType> personalIdsProps = getPropertyTypeBySystemTag(PERSONAL_IDENTIFIER_TAG_NAME);
        final List personalIdsPropsNames = new ArrayList<String>();
        personalIdsProps.forEach(propType -> personalIdsPropsNames.add(propType.getMetadata().getId()));
        Set propsToRemove = new HashSet<String>();
        profileProperties.keySet().forEach(propKey -> {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Set'
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
        profileProperties.keySet().forEach(propKey -> {
            if (personalIdsPropsNames.contains(propKey)) {
                propsToRemove.add(propKey);
            }
        });
```

### UNCHECKED_WARNING
Unchecked call to 'forEach(Consumer)' as a member of raw type 'java.lang.Iterable'
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
            }
        });
        propsToRemove.forEach(propId -> profileProperties.remove(propId));
        return profileProperties;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
                    changed = true;
                } else if (newEntry.getValue() instanceof Map) {
                    Map<String, Object> currentMap = (Map) target.get(newEntry.getKey());
                    if (currentMap == null) {
                        target.put(newEntry.getKey(), newEntry.getValue());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
                        changed = true;
                    } else {
                        changed |= merge(currentMap, (Map) newEntry.getValue());
                    }
                } else if (StringUtils.equals(packageName, "java.lang")) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
        }
        if (session.getProfile() != null && session.getProfile().getProperties() != null) {
            session.getProfile().setProperties(removePersonalIdentifiersFromSessionProfile(session.getProfile().getProperties()));
        }
        return persistenceService.save(session) ? session : null;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Collection'
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
            Collection encodedValues = new ArrayList(propertyValues.size());
            for (Object value : propertyValues) {
                encodedValues.add(csvEncode(value.toString()));
            }
            sb.append(csvEncode(StringUtils.join(encodedValues, ",")));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java

        if (condition.getConditionTypeId().equals("booleanCondition")) {
            List<Condition> subConditions = (List<Condition>) condition.getParameter("subConditions");
            boolean isAnd = "and".equals(condition.getParameter("operator"));
            for (Condition subCondition : subConditions) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map\>'
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
        }

        Map<String, Map<String, String>> propMapping = (Map<String, Map<String, String>>) itemMapping.get("properties").get("properties");
        for (PropertyType propertyType : profileProperties) {
            if (propMapping.containsKey(propertyType.getMetadata().getId())) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        oauthPost.setEntity(new UrlEncodedFormEntity(parametersBody, "UTF-8"));

        Map<String, String> oauthLoginResponse = (Map<String, String>) handleRequest(oauthPost, 0, false);
        if (oauthLoginResponse == null) {
            return false;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            }
            if (responseObject != null && responseObject instanceof Map) {
                return (Map<String, Object>) responseObject;
            }
            return null;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            }
            if (responseObject instanceof Map) {
                Map<String, Object> responseData = (Map<String, Object>) responseObject;
                if (responseData.get("id") != null) {
                    String sfdcId = (String) responseData.get("id");
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
                return null;
            }
            Map<String, Object> queryResponse = (Map<String, Object>) responseObject;
            if (queryResponse.containsKey("recentItems")) {
                logger.debug("Response received from Salesforce: {}", queryResponse);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
                Object[] recentItems = (Object[]) queryResponse.get("recentItems");
                for (Object recentItem : recentItems) {
                    Map<String, String> recentItemMap = (Map<String, String>) recentItem;
                    recentLeadIds.add(recentItemMap.get("Id"));
                }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
                return null;
            }
            Map<String, Object> queryResponse = (Map<String, Object>) responseObject;
            if (queryResponse != null) {
                logger.debug("Response received from Salesforce: {}", queryResponse);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java

    private Set<String> mappingResponse(Object response, Set<String> results) {
        Map<String, Object> result = (Map<String, Object>) response;
        Long totalSize = (Long) result.get("totalSize");
        Boolean done = (Boolean) result.get("done");
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        }
        for (Object recordObject : recordObjects) {
            Map<String, Object> record = (Map<String, Object>) recordObject;
            if (record.containsKey("Id")) {
                results.add((String) record.get("Id"));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        Set<String> compoundFieldNames = new TreeSet<>();
        for (Object field : fields) {
            Map<String, Object> fieldDescribe = (Map<String, Object>) field;
            String fieldName = (String) fieldDescribe.get("name");
            String compoundFieldName = (String) fieldDescribe.get("compoundFieldName");
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java

            if (responseObject instanceof Map) {
                return (Map<String, Object>) responseObject;
            }
            return null;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        HttpGet get = new HttpGet(baseUrl);

        Map<String, String> queryResponse = (Map<String, String>) handleRequest(get);

        if (queryResponse != null && queryResponse.containsKey("count")) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
                return null;
            }
            Map<String, Object> queryResponse = (Map<String, Object>) responseObject;
            if (queryResponse != null) {
                logger.debug("Response received from Salesforce: {}", queryResponse);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java

        List<Scoring> allScoring = this.allScoring;
        Map<String, Integer> scoreModifiers = (Map<String, Integer>) profile.getSystemProperties().get("scoreModifiers");
        for (Scoring scoring : allScoring) {
            if (scoring.getMetadata().isEnabled()) {
```

### UNCHECKED_WARNING
Unchecked method 'with(P...)' invocation
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
                    .withMaxRetries(maxRetriesForUpdateProfileSegment);

            Failsafe.with(retryPolicy).
                    run(executionContext -> {
                        logger.warn("retry updating profile segment {}, profile {}, time {}", segmentId, profileId, new Date());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap\[\]' to 'java.util.Map\[\]'
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java

        String[] scripts = new String[scoringElements.size() + 1];
        Map<String, Object>[] scriptParams = new HashMap[scoringElements.size() + 1];
        Condition[] conditions = new Condition[scoringElements.size() + 1];

```

### UNCHECKED_WARNING
Unchecked call to 'compareTo(T)' as a member of raw type 'java.lang.Comparable'
in `common/src/main/java/org/apache/unomi/common/DataTable.java`
#### Snippet
```java
                        }
                    }
                    int rowComparison = row1Data.compareTo(row2Data);
                    if (rowComparison == 0) {
                        // rows are equal on this criteria, let's go to the next criteria if it exists
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/route/ProfileExportCollectRouteBuilder.java`
#### Snippet
```java
            if (RouterConstants.IMPORT_EXPORT_CONFIG_TYPE_RECURRENT.equals(exportConfiguration.getConfigType()) &&
                    exportConfiguration.getProperties() != null && exportConfiguration.getProperties().size() > 0) {
                if ((Map<String, String>) exportConfiguration.getProperties().get("mapping") != null) {
                    String destinationEndpoint = (String) exportConfiguration.getProperties().get("destination");
                    if (StringUtils.isNotBlank(destinationEndpoint) && allowedEndpoints.contains(destinationEndpoint.substring(0, destinationEndpoint.indexOf(':')))) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/route/ProfileImportFromSourceRouteBuilder.java`
#### Snippet
```java
                //Prepare Split Processor
                LineSplitProcessor lineSplitProcessor = new LineSplitProcessor();
                lineSplitProcessor.setFieldsMapping((Map<String, Integer>) importConfiguration.getProperties().get("mapping"));
                lineSplitProcessor.setOverwriteExistingProfiles(importConfiguration.isOverwriteExistingProfiles());
                lineSplitProcessor.setPropertiesToOverwrite(importConfiguration.getPropertiesToOverwrite());
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/ExportRouteCompletionProcessor.java`
#### Snippet
```java

        Map execution = new HashMap();
        execution.put(RouterConstants.KEY_EXECS_DATE, ((Date) exchange.getProperty("CamelCreatedTimestamp")).getTime());
        execution.put(RouterConstants.KEY_EXECS_EXTRACTED, exchange.getProperty("CamelSplitSize"));

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/ExportRouteCompletionProcessor.java`
#### Snippet
```java
        Map execution = new HashMap();
        execution.put(RouterConstants.KEY_EXECS_DATE, ((Date) exchange.getProperty("CamelCreatedTimestamp")).getTime());
        execution.put(RouterConstants.KEY_EXECS_EXTRACTED, exchange.getProperty("CamelSplitSize"));

        exportConfiguration = (ExportConfiguration) RouterUtils.addExecutionEntry(exportConfiguration, execution, executionsHistorySize);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/ImportRouteCompletionProcessor.java`
#### Snippet
```java

        Map execution = new HashMap();
        execution.put("date", ((Date) exchange.getProperty("CamelCreatedTimestamp")).getTime());
        execution.put("totalLinesNb", nbTotal);
        execution.put("successCount", successCount);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/ImportRouteCompletionProcessor.java`
#### Snippet
```java
        Map execution = new HashMap();
        execution.put("date", ((Date) exchange.getProperty("CamelCreatedTimestamp")).getTime());
        execution.put("totalLinesNb", nbTotal);
        execution.put("successCount", successCount);
        execution.put("failureCount", failureCount);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/ImportRouteCompletionProcessor.java`
#### Snippet
```java
        execution.put("date", ((Date) exchange.getProperty("CamelCreatedTimestamp")).getTime());
        execution.put("totalLinesNb", nbTotal);
        execution.put("successCount", successCount);
        execution.put("failureCount", failureCount);
        execution.put("errors", errors);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/ImportRouteCompletionProcessor.java`
#### Snippet
```java
        execution.put("totalLinesNb", nbTotal);
        execution.put("successCount", successCount);
        execution.put("failureCount", failureCount);
        execution.put("errors", errors);

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/ImportRouteCompletionProcessor.java`
#### Snippet
```java
        execution.put("successCount", successCount);
        execution.put("failureCount", failureCount);
        execution.put("errors", errors);

        importConfiguration = (ImportConfiguration) RouterUtils.addExecutionEntry(importConfiguration, execution, executionsHistorySize);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `extensions/lists-extension/actions/src/main/java/org/apache/unomi/lists/actions/AddToListsAction.java`
#### Snippet
```java
    @Override
    public int execute(Action action, Event event) {
        List<String> newListIdentifiers = (List<String>) action.getParameterValues().get("listIdentifiers");
        if (newListIdentifiers == null || newListIdentifiers.size() == 0) {
            return EventService.NO_CHANGE;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `extensions/lists-extension/actions/src/main/java/org/apache/unomi/lists/actions/AddToListsAction.java`
#### Snippet
```java
        Profile profile = event.getProfile();

        List<String> existingListIdentifiers = (List<String>) profile.getSystemProperties().get("lists");
        if (existingListIdentifiers == null) {
            existingListIdentifiers = new ArrayList<>();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/LineSplitProcessor.java`
#### Snippet
```java
        String configType = (String) exchange.getIn().getHeader(RouterConstants.HEADER_CONFIG_TYPE);
        if (importConfigOneShot != null) {
            fieldsMapping = (Map<String, Integer>) importConfigOneShot.getProperties().get("mapping");
            propertiesToOverwrite = importConfigOneShot.getPropertiesToOverwrite();
            mergingProperty = importConfigOneShot.getMergingProperty();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `extensions/router/router-service/src/main/java/org/apache/unomi/router/services/ProfileExportServiceImpl.java`
#### Snippet
```java

    public String convertProfileToCSVLine(Profile profile, ExportConfiguration exportConfiguration, Collection<PropertyType> propertiesDef) {
        Map<String, String> mapping = (Map<String, String>) exportConfiguration.getProperty("mapping");
        String lineToWrite = "";
        for (int i = 0; i < mapping.size(); i++) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `extensions/router/router-service/src/main/java/org/apache/unomi/router/services/ProfileExportServiceImpl.java`
#### Snippet
```java
            if (propType != null && BooleanUtils.isTrue(propType.isMultivalued())) {
                if (propertyValue != null) {
                    List<String> multiValue = (List<String>) propertyValue;
                    lineToWrite += StringUtils.isNotBlank(exportConfiguration.getMultiValueDelimiter()) ? exportConfiguration.getMultiValueDelimiter().charAt(0) : "";
                    int j = 0;
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `extensions/router/router-service/src/main/java/org/apache/unomi/router/services/ProfileExportServiceImpl.java`
#### Snippet
```java

        Map execution = new HashMap();
        execution.put(RouterConstants.KEY_EXECS_DATE, new Date().getTime());
        execution.put(RouterConstants.KEY_EXECS_EXTRACTED, counter);

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `extensions/router/router-service/src/main/java/org/apache/unomi/router/services/ProfileExportServiceImpl.java`
#### Snippet
```java
        Map execution = new HashMap();
        execution.put(RouterConstants.KEY_EXECS_DATE, new Date().getTime());
        execution.put(RouterConstants.KEY_EXECS_EXTRACTED, counter);

        exportConfiguration = (ExportConfiguration) RouterUtils.addExecutionEntry(exportConfiguration, execution, Integer.parseInt((String) configSharingService.getProperty(RouterConstants.KEY_HISTORY_SIZE)));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/CopyPropertiesAction.java`
#### Snippet
```java
            Object targetProperties = BeanUtilsBean.getInstance().getPropertyUtils().getProperty(event, rootProperty);
            if (targetProperties instanceof Map) {
                propsToCopy.putAll((Map) targetProperties);
            }
        } catch (Exception e) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.HashMap'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/UpdatePropertiesAction.java`
#### Snippet
```java
        boolean isProfileOrPersonaUpdated = false;

        Map<String, Object> propsToAdd = (HashMap<String, Object>) event.getProperties().get(PROPS_TO_ADD);

        if (propsToAdd != null) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.HashMap'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/UpdatePropertiesAction.java`
#### Snippet
```java
        }

        Map<String, Object> propsToUpdate = (HashMap<String, Object>) event.getProperties().get(PROPS_TO_UPDATE);
        if (propsToUpdate != null) {
            isProfileOrPersonaUpdated |= processProperties(target, propsToUpdate, "alwaysSet");
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.HashMap'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/UpdatePropertiesAction.java`
#### Snippet
```java
        }

        Map<String, Object> propsToAddToSet = (HashMap<String, Object>) event.getProperties().get(PROPS_TO_ADD_TO_SET);
        if (propsToAddToSet != null) {
            isProfileOrPersonaUpdated |= processProperties(target, propsToAddToSet, "addValues");
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/UpdatePropertiesAction.java`
#### Snippet
```java
        }

        List<String> propsToDelete = (List<String>) event.getProperties().get(PROPS_TO_DELETE);
        if (propsToDelete != null) {
            for (String prop : propsToDelete) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.ArrayList'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/UpdatePropertiesAction.java`
#### Snippet
```java
                //ideally each property must have a matching propertyType
                if(prop.equals("segments")) {
                    propsMap.put(prop, new HashSet<String>((ArrayList<String>)propsMap.get(prop)));
                }
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/ModifyConsentAction.java`
#### Snippet
```java
                Consent consent = null;
                try {
                    consent = new Consent(consentMap, dateFormat);
                    isProfileUpdated = profile.setConsent(consent);
                } catch (ParseException e) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Collection'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/IdsConditionESQueryBuilder.java`
#### Snippet
```java
    @Override
    public QueryBuilder buildQuery(Condition condition, Map<String, Object> context, ConditionESQueryBuilderDispatcher dispatcher) {
        Collection<String> ids = (Collection<String>) condition.getParameter("ids");
        Boolean match = (Boolean) condition.getParameter("match");

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/IncrementPropertyAction.java`
#### Snippet
```java
                        // Create a new map to avoid modifying the original Object
                        Map<String, Object> newPropertyValue = new HashMap<>();
                        Map<String, Object> nestedProperty = (Map<String, Object>) nestedPropertyValue;

                        // increment with target
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/IncrementPropertyAction.java`
#### Snippet
```java

                        // increment with target
                        ((Map<String, Object>) propertyTargetValue).forEach((key, targetValue) -> {
                            if ((targetValue instanceof Integer && (nestedProperty.containsKey(key) && nestedProperty.get(key) instanceof Integer)) ||
                                    (targetValue instanceof Integer && !nestedProperty.containsKey(key))) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/IncrementPropertyAction.java`
#### Snippet
```java
                    // Create a new map to avoid modifying the original object
                    Map<String, Object> newPropertyValue = new HashMap<>();
                    Map<String, Object> nestedProperty = (Map<String, Object>) nestedPropertyValue;
                    nestedProperty.forEach((key, propValue) -> newPropertyValue.put(key, propValue instanceof Integer ? (int) propValue + 1 : propValue));
                    propertyValue = newPropertyValue;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map\[\]' to 'java.util.Map\[\]'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/MergeProfilesOnPropertyAction.java`
#### Snippet
```java

                    String[] scripts = new String[]{"updateProfileId"};
                    Map<String, Object>[] scriptParams = new Map[]{Collections.singletonMap("profileId", masterProfileId)};
                    Condition[] conditions = new Condition[]{profileIdsCondition};

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Collection'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/IdsConditionEvaluator.java`
#### Snippet
```java
    @Override
    public boolean eval(Condition condition, Item item, Map<String, Object> context, ConditionEvaluatorDispatcher dispatcher) {
        Collection<String> ids = (Collection<String>) condition.getParameter("ids");
        Boolean match = (Boolean) condition.getParameter("match");

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PastEventConditionEvaluator.java`
#### Snippet
```java
            String key = (String) parameters.get("generatedPropertyKey");
            Profile profile = (Profile) item;
            Map<String,Object> pastEvents = (Map<String, Object>) profile.getSystemProperties().get("pastEvents");
            if (pastEvents != null) {
                Number l = (Number) pastEvents.get(key);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/NestedConditionEvaluator.java`
#### Snippet
```java

                // Evaluated each nested items until one match the nested condition
                for (Object nestedItem : (List<Object>) nestedItems) {
                    if (nestedItem instanceof Map) {
                        Map<String, Object> flattenedNestedItem = flattenNestedItem(path, (Map<String, Object>) nestedItem);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/NestedConditionEvaluator.java`
#### Snippet
```java
                for (Object nestedItem : (List<Object>) nestedItems) {
                    if (nestedItem instanceof Map) {
                        Map<String, Object> flattenedNestedItem = flattenNestedItem(path, (Map<String, Object>) nestedItem);
                        Item finalNestedItem = createFinalNestedItemForEvaluation(item, path, flattenedNestedItem);
                        if (finalNestedItem != null && dispatcher.eval(subCondition, finalNestedItem, context)) {
```

### UNCHECKED_WARNING
Unchecked call to 'getProperty(T, String, String)' as a member of raw type 'org.apache.unomi.plugins.baseplugin.conditions.accessors.HardcodedPropertyAccessor'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/HardcodedPropertyAccessorRegistry.java`
#### Snippet
```java
            HardcodedPropertyAccessor propertyAccessor = propertyAccessors.get(lookupClass);
            if (propertyAccessor != null) {
                Object result = propertyAccessor.getProperty(object, nextTokens.propertyName, nextTokens.leftoverExpression);
                if (!HardcodedPropertyAccessor.PROPERTY_NOT_FOUND_MARKER.equals(result)) {
                    return result;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `extensions/privacy-extension/services/src/main/java/org/apache/unomi/privacy/internal/PrivacyServiceImpl.java`
#### Snippet
```java
            return new ArrayList<String>();
        }
        return (List<String>) profile.getProperty("filteredEventTypes");
    }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `extensions/privacy-extension/services/src/main/java/org/apache/unomi/privacy/internal/PrivacyServiceImpl.java`
#### Snippet
```java
        List deniedProperties = new ArrayList<String>();
        Set<PropertyType> personalIdsProps = profileService.getPropertyTypeBySystemTag(ProfileService.PERSONAL_IDENTIFIER_TAG_NAME);
        personalIdsProps.forEach(propType -> deniedProperties.add(propType.getMetadata().getId()));
        return deniedProperties;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `extensions/privacy-extension/services/src/main/java/org/apache/unomi/privacy/internal/PrivacyServiceImpl.java`
#### Snippet
```java
        Set<PropertyType> personalIdsProps = profileService.getPropertyTypeBySystemTag(ProfileService.PERSONAL_IDENTIFIER_TAG_NAME);
        personalIdsProps.forEach(propType -> deniedProperties.add(propType.getMetadata().getId()));
        return deniedProperties;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `extensions/weather-update/core/src/main/java/org/apache/unomi/weatherupdate/actions/WeatherUpdateAction.java`
#### Snippet
```java
        }

        Map<String, Double> location = (Map<String, Double>) session.getProperty(LOCATION);
        JsonNode currentWeatherData = getWeather(location);
        if (currentWeatherData == null) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java
                actualCenter = (GeoPoint) actualValue;
            } else if (actualValue instanceof Map) {
                actualCenter = GeoPoint.fromMap((Map<String, Double>) actualValue);
            } else if (actualValue instanceof String) {
                actualCenter = GeoPoint.fromString((String) actualValue);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ContextJsonEndpoint.java`
#### Snippet
```java
                Object newObject = sanitizeValue(listObject);
                if (newObject != null) {
                    newValues.add(newObject);
                }
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `rest/src/main/java/org/apache/unomi/rest/deserializers/ContextRequestDeserializer.java`
#### Snippet
```java
        }
        if (node.get("sessionPropertiesOverrides") != null) {
            cr.setSessionPropertiesOverrides(jsonParser.getCodec().treeToValue(node.get("sessionPropertiesOverrides"), Map.class));
        }
        if (node.get("sessionId") != null) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListsUpdateEventFilterInput.java`
#### Snippet
```java
            return null;
        }
        final List<String> joinLists = (List<String>) map.get("joinLists_contains");
        final List<String> leaveLists = (List<String>) map.get("leaveLists_contains");
        return new CDPListsUpdateEventFilterInput(joinLists, leaveLists);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListsUpdateEventFilterInput.java`
#### Snippet
```java
        }
        final List<String> joinLists = (List<String>) map.get("joinLists_contains");
        final List<String> leaveLists = (List<String>) map.get("leaveLists_contains");
        return new CDPListsUpdateEventFilterInput(joinLists, leaveLists);
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java
        final OffsetDateTime timeGt = (OffsetDateTime) map.get("cdp_timestamp_gt");
        final OffsetDateTime timeGte = (OffsetDateTime) map.get("cdp_timestamp_gte");
        final CDPConsentUpdateEventFilterInput consentFltr = CDPConsentUpdateEventFilterInput.fromMap((Map<String, Object>) map.get("cdp_consentUpdateEvent"));
        final CDPListsUpdateEventFilterInput listsFltr = CDPListsUpdateEventFilterInput.fromMap((Map<String, Object>) map.get("cdp_listsUpdateEvent"));
        final CDPSessionEventFilterInput sessionFltr = CDPSessionEventFilterInput.fromMap((Map<String, Object>) map.get("cdp_sessionEvent"));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java
        final OffsetDateTime timeGte = (OffsetDateTime) map.get("cdp_timestamp_gte");
        final CDPConsentUpdateEventFilterInput consentFltr = CDPConsentUpdateEventFilterInput.fromMap((Map<String, Object>) map.get("cdp_consentUpdateEvent"));
        final CDPListsUpdateEventFilterInput listsFltr = CDPListsUpdateEventFilterInput.fromMap((Map<String, Object>) map.get("cdp_listsUpdateEvent"));
        final CDPSessionEventFilterInput sessionFltr = CDPSessionEventFilterInput.fromMap((Map<String, Object>) map.get("cdp_sessionEvent"));
        final CDPProfileUpdateEventFilterInput profileFltr = CDPProfileUpdateEventFilterInput.fromMap((Map<String, Object>) map.get("cdp_profileUpdateEvent"));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java
        final CDPConsentUpdateEventFilterInput consentFltr = CDPConsentUpdateEventFilterInput.fromMap((Map<String, Object>) map.get("cdp_consentUpdateEvent"));
        final CDPListsUpdateEventFilterInput listsFltr = CDPListsUpdateEventFilterInput.fromMap((Map<String, Object>) map.get("cdp_listsUpdateEvent"));
        final CDPSessionEventFilterInput sessionFltr = CDPSessionEventFilterInput.fromMap((Map<String, Object>) map.get("cdp_sessionEvent"));
        final CDPProfileUpdateEventFilterInput profileFltr = CDPProfileUpdateEventFilterInput.fromMap((Map<String, Object>) map.get("cdp_profileUpdateEvent"));

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java
        final CDPListsUpdateEventFilterInput listsFltr = CDPListsUpdateEventFilterInput.fromMap((Map<String, Object>) map.get("cdp_listsUpdateEvent"));
        final CDPSessionEventFilterInput sessionFltr = CDPSessionEventFilterInput.fromMap((Map<String, Object>) map.get("cdp_sessionEvent"));
        final CDPProfileUpdateEventFilterInput profileFltr = CDPProfileUpdateEventFilterInput.fromMap((Map<String, Object>) map.get("cdp_profileUpdateEvent"));

        return new CDPEventFilterInput(andFltrs, orFltrs, idEq, clientIdEq, sourceIdEq, profileIdEq, timeEq, timeLt,
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\>'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java
            return null;
        }
        return ((List<Map<String, Object>>) list).stream()
                .map(CDPEventFilterInput::fromMap)
                .collect(Collectors.toList());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPersona.java`
#### Snippet
```java
        }

        List<String> profileIds = (List<String>) persona.getProperty("mergedWith");
        return profileIds != null ? profileIds.stream().map(CDPProfileID::new).collect(Collectors.toList()) : null;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\>'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/json/JSONType.java`
#### Snippet
```java

    public List<JSONType> getAllOf() {
        List<Map<String, Object>> allOfTree = (List<Map<String, Object>>) schemaTree.get("allOf");
        List<JSONType> allOfTypes = new ArrayList<>();
        if (allOfTree != null) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/json/JSONObjectType.java`
#### Snippet
```java
        super(schemaTree, jsonTypeFactory);
        setType("object");
        Map<String, Object> propertiesTree = (Map<String, Object>) schemaTree.get("properties");
        if (propertiesTree != null) {
            propertiesTree.entrySet().forEach(entry -> {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/json/JSONObjectType.java`
#### Snippet
```java
            propertiesTree.entrySet().forEach(entry -> {
                if (entry.getValue() instanceof Map) {
                    properties.put(entry.getKey(), jsonTypeFactory.getTypes((Map<String, Object>) entry.getValue()));
                } else {
                    logger.error("Expected map type for property {}, instead found {}", entry.getKey(), entry.getValue().getClass());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/json/JSONTypeFactory.java`
#### Snippet
```java
            types.add((String) typeObject);
        } else {
            types = (List<String>) typeObject;
        }
        List<JSONType> resultJsonTypes = new ArrayList<>();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/json/JSONSchema.java`
#### Snippet
```java
        schemaId = (String) schemaTree.get("$id");
        if (schemaTree.containsKey("self")) {
            Map<String, Object> self = (Map<String, Object>) schemaTree.get("self");
            name = (String) self.get("name");
            vendor = (String) self.get("vendor");
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/actions/CDPUpdateListsAction.java`
#### Snippet
```java
    @Override
    public int execute(Action action, Event event) {
        List<String> joinLists = (List<String>) event.getProperty("joinLists");
        List<String> leaveLists = (List<String>) event.getProperty("leaveLists");

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/actions/CDPUpdateListsAction.java`
#### Snippet
```java
    public int execute(Action action, Event event) {
        List<String> joinLists = (List<String>) event.getProperty("joinLists");
        List<String> leaveLists = (List<String>) event.getProperty("leaveLists");

        final Profile profile = event.getProfile();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/actions/CDPUpdateListsAction.java`
#### Snippet
```java

        final Profile profile = event.getProfile();
        List<String> existingLists = (List<String>) profile.getSystemProperties().get("lists");
        if (existingLists == null) {
            existingLists = new ArrayList<>();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/websocket/GraphQLMessage.java`
#### Snippet
```java
            final JsonNode payloadNode = node.path("payload");
            if (!payloadNode.isMissingNode()) {
                Map<String, Object> payload = GraphQLObjectMapper.getInstance().convertValue(payloadNode, Map.class);
                payload.forEach(builder::field);
            }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/websocket/SubscriptionWebSocket.java`
#### Snippet
```java
        ExecutionInput executionInput = ExecutionInput.newExecutionInput()
                .query((String) payload.get("query"))
                .variables((Map<String, Object>) payload.get("variables"))
                .operationName((String) payload.get("operationName"))
                .context(serviceManager)
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.unomi.graphql.types.input.BaseSegmentInput' to 'INPUT'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/segments/BaseCreateOrUpdateSegmentCommand.java`
#### Snippet
```java
        super(builder);

        this.segmentInput = (INPUT) builder.segmentInput;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/segments/CreateOrUpdateSegmentCommand.java`
#### Snippet
```java
        final Map<String, Object> segmentArgumentAsMap = environment.getArgument(SEGMENT_ARGUMENT_NAME);
        if (segmentArgumentAsMap != null) {
            profileFilterAsMap = (Map<String, Object>) segmentArgumentAsMap.get("profiles");
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/BaseDataFetcher.java`
#### Snippet
```java

    protected <K> K parseParam(final String name, K defaultValue, final DataFetchingEnvironment environment) {
        return (K) Optional.ofNullable(environment.getArgument(name)).orElse(defaultValue);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/DynamicFieldDataFetcher.java`
#### Snippet
```java
                return propertyValue;
            } else if (propertyValue instanceof Map) {
                return GeoPoint.fromMap((Map<String, Double>) propertyValue);
            } else if (propertyValue instanceof String) {
                return GeoPoint.fromString((String) propertyValue);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentProfileIDsConditionParser.java`
#### Snippet
```java
                        && "inContains".equals(condition.getParameter("comparisonOperator"))
                        && Objects.nonNull(condition.getParameter("propertyValues")))
                .map(condition -> (List<String>) condition.getParameter("propertyValues"))
                .reduce(new ArrayList<>(), (List<String> all, List<String> ids) -> {
                    all.addAll(ids);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaProvider.java`
#### Snippet
```java
        Map<String, Object> schemaMap;
        try {
            schemaMap = GraphQLObjectMapper.getInstance().readValue(jsonSchemaWrapper.getSchema(), Map.class);
        } catch (JsonProcessingException e) {
            logger.error("Failed to process Json object, e");
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/factories/ProfileConditionFactory.java`
#### Snippet
```java

        if ("distance".equals(comparisonOperator) && value instanceof Map) {
            Map<String, Object> distanceFilter = (Map<String, Object>) value;

            ConditionBuilder builder = ConditionBuilder.create(getConditionType(conditionTypeId))
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `extensions/router/router-api/src/main/java/org/apache/unomi/router/api/RouterUtils.java`
#### Snippet
```java
        }

        configuration.getExecutions().add(execution);
        return configuration;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List\>'
in `extensions/router/router-api/src/main/java/org/apache/unomi/router/api/ImportExportConfiguration.java`
#### Snippet
```java
    private String status;

    private List<Map<String, Object>> executions = new ArrayList();

    /**
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/CustomObjectMapper.java`
#### Snippet
```java

    public void registerBuiltInItemTypeClass(String itemType, Class clazz) {
        propertyTypedObjectDeserializer.registerMapping("itemType=" + itemType, clazz);
        itemDeserializer.registerMapping(itemType, clazz);
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/CustomObjectMapper.java`
#### Snippet
```java
    public void registerBuiltInItemTypeClass(String itemType, Class clazz) {
        propertyTypedObjectDeserializer.registerMapping("itemType=" + itemType, clazz);
        itemDeserializer.registerMapping(itemType, clazz);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyHelper.java`
#### Snippet
```java
        // extract the key prefix for nested objects
        String prefix = in.getKey();
        Map<String, Object> values = (Map<String, Object>) in.getValue();
        // create a new Map, with prefix added to each key
        Map<String, Object> flattenMap = new HashMap<>();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.String' to 'T'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/conditions/ConditionContextHelper.java`
#### Snippet
```java
                public T apply(T o) {
                    if (o instanceof String) {
                        return (T) ConditionContextHelper.foldToASCII((String) o);
                    }
                    return o;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                    && result.get(subentry.getKey()) instanceof Map
                    && subentry.getValue() instanceof Map) {
                mergePropertiesMapping((Map) result.get(subentry.getKey()), (Map) subentry.getValue());
            } else {
                result.put(subentry.getKey(), subentry.getValue());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                    && result.get(subentry.getKey()) instanceof Map
                    && subentry.getValue() instanceof Map) {
                mergePropertiesMapping((Map) result.get(subentry.getKey()), (Map) subentry.getValue());
            } else {
                result.put(subentry.getKey(), subentry.getValue());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map\>'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                return propMapping;
            } else {
                mappings = propMapping != null ? ((Map<String, Map<String, Object>>) propMapping.get("properties")) : null;
            }
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
            }
            Map<String, Object> subMappings = mappings.computeIfAbsent("properties", k -> new HashMap<>());
            Map<String, Object> subSubMappings = (Map<String, Object>) subMappings.computeIfAbsent("properties", k -> new HashMap<>());

            if (subSubMappings.containsKey(property.getItemId())) {
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.unomi.api.CustomItem' to 'T'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                                    PartialList<CustomItem> r = query(QueryBuilders.idsQuery().addIds(documentId), null, customItemType, 0, 1, null, null);
                                    if (r.size() > 0) {
                                        return (T) r.get(0);
                                    }
                                }
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `HttpException`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/SFDCService.java`
#### Snippet
```java
     * @param sfdcConfiguration the configuration to use for the login
     * @return true if the login was successful, false otherwise
     * @throws HttpException thrown if there was an error communicating with the Salesforce server
     * @throws IOException thrown if there was an error communicating with the Salesforce server
     */
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `api/src/main/java/org/apache/unomi/api/services/ConfigSharingService.java`
#### Snippet
```java

    class ConfigChangeEvent {
        public enum ConfigChangeEventType { ADDED, UPDATED, REMOVED };
        private ConfigChangeEventType eventType;
        private String name;
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `api/src/main/java/org/apache/unomi/api/services/ProfileService.java`
#### Snippet
```java
    default Session loadSession(String sessionId) {
        return loadSession(sessionId, null);
    };

    /**
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `common/src/main/java/org/apache/unomi/common/DataTable.java`
#### Snippet
```java
    public static enum SortOrder {
        ASCENDING,
        DESCENDING;
    }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Variable is already assigned to this value
in `services/src/main/java/org/apache/unomi/services/impl/cluster/ClusterServiceImpl.java`
#### Snippet
```java
                group = karafCellarGroupManager.createGroup(karafCellarGroupName);
                if (group != null) {
                    setupConfigOk = true;
                } else {
                    setupConfigOk = false;
```

### DataFlowIssue
Method invocation `getAggregate` may produce `NullPointerException`
in `services/src/main/java/org/apache/unomi/services/impl/goals/GoalsServiceImpl.java`
#### Snippet
```java
        // resolve aggregate
        BaseAggregate aggregate = null;
        String property = query.getAggregate().getProperty();
        if(query != null && query.getAggregate() != null && property != null) {
            if (query.getAggregate().getType() != null){
```

### DataFlowIssue
Method invocation `execute` may produce `NullPointerException`
in `services/src/main/java/org/apache/unomi/services/actions/impl/ActionExecutorDispatcherImpl.java`
#### Snippet
```java
                logger.warn("Couldn't find any action dispatcher for prefix '{}', action {} won't execute !", actionPrefix, actionKey);
            }
            return actionDispatcher.execute(action, event, actionName);
        } else if (executors.containsKey(actionKey)) {
            ActionExecutor actionExecutor = executors.get(actionKey);
```

### DataFlowIssue
Casting `result` to `Integer` may produce `ClassCastException`
in `services/src/main/java/org/apache/unomi/services/mergers/AddPropertyMergeStrategyExecutor.java`
#### Snippet
```java
            if (propertyType != null) {
                if (propertyType.getValueTypeId().equals("integer") || (property instanceof Integer)) {
                    result = (Integer) result + (Integer) property;
                } else if (propertyType.getValueTypeId().equals("long") || (property instanceof Long)) {
                    result = (Long) result + (Long) property;
```

### DataFlowIssue
Casting `result` to `Long` may produce `ClassCastException`
in `services/src/main/java/org/apache/unomi/services/mergers/AddPropertyMergeStrategyExecutor.java`
#### Snippet
```java
                    result = (Integer) result + (Integer) property;
                } else if (propertyType.getValueTypeId().equals("long") || (property instanceof Long)) {
                    result = (Long) result + (Long) property;
                } else if (propertyType.getValueTypeId().equals("double") || (property instanceof Double)) {
                    result = (Double) result + (Double) property;
```

### DataFlowIssue
Casting `result` to `Double` may produce `ClassCastException`
in `services/src/main/java/org/apache/unomi/services/mergers/AddPropertyMergeStrategyExecutor.java`
#### Snippet
```java
                    result = (Long) result + (Long) property;
                } else if (propertyType.getValueTypeId().equals("double") || (property instanceof Double)) {
                    result = (Double) result + (Double) property;
                } else if (propertyType.getValueTypeId().equals("float") || (property instanceof Float)) {
                    result = (Float) result + (Float) property;
```

### DataFlowIssue
Casting `result` to `Float` may produce `ClassCastException`
in `services/src/main/java/org/apache/unomi/services/mergers/AddPropertyMergeStrategyExecutor.java`
#### Snippet
```java
                    result = (Double) result + (Double) property;
                } else if (propertyType.getValueTypeId().equals("float") || (property instanceof Float)) {
                    result = (Float) result + (Float) property;
                } else {
                    result = (Long) result + Long.parseLong(property.toString());
```

### DataFlowIssue
Casting `result` to `Long` may produce `ClassCastException`
in `services/src/main/java/org/apache/unomi/services/mergers/AddPropertyMergeStrategyExecutor.java`
#### Snippet
```java
                    result = (Float) result + (Float) property;
                } else {
                    result = (Long) result + Long.parseLong(property.toString());
                }
            } else {
```

### DataFlowIssue
Method invocation `getSize` may produce `NullPointerException`
in `extensions/geonames/services/src/main/java/org/apache/unomi/geonames/services/GeonamesServiceImpl.java`
#### Snippet
```java
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(f));
            ZipEntry zipEntry = zipInputStream.getNextEntry(); // used to advance to the first entry in the ZipInputStream
            long fileSize = zipEntry.getSize();
            BufferedReader reader = new BufferedReader(new InputStreamReader(zipInputStream, "UTF-8"));

```

### DataFlowIssue
Variable is already assigned to this value
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            response = query("SELECT Id FROM Contact WHERE " + sfdcConfiguration.getSfdcIdentifierField() +
                    "='" + identifierFieldValue + "'");
            queryResult = mappingResponse(response, queryResult);
            if (queryResult.size() > 0) {
                return true;
```

### DataFlowIssue
Variable is already assigned to this value
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/ExportRouteCompletionProcessor.java`
#### Snippet
```java
        execution.put(RouterConstants.KEY_EXECS_EXTRACTED, exchange.getProperty("CamelSplitSize"));

        exportConfiguration = (ExportConfiguration) RouterUtils.addExecutionEntry(exportConfiguration, execution, executionsHistorySize);
        exportConfiguration.setStatus(RouterConstants.CONFIG_STATUS_COMPLETE_SUCCESS);

```

### DataFlowIssue
Variable is already assigned to this value
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/ImportRouteCompletionProcessor.java`
#### Snippet
```java
        execution.put("errors", errors);

        importConfiguration = (ImportConfiguration) RouterUtils.addExecutionEntry(importConfiguration, execution, executionsHistorySize);

        //Set running to false, route is complete
```

### DataFlowIssue
Method invocation `getValueTypeId` may produce `NullPointerException`
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/LineSplitProcessor.java`
#### Snippet
```java
                            }
                        }
                        if (propertyType.getValueTypeId().equals("string") || propertyType.getValueTypeId().equals("email") ||
                                propertyType.getValueTypeId().equals("date")) {
                            if (BooleanUtils.isTrue(propertyType.isMultivalued())) {
```

### DataFlowIssue
Method invocation `getValueTypeId` may produce `NullPointerException`
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/LineSplitProcessor.java`
#### Snippet
```java
                        logger.error("Error converting profileData", t);
                        if (fieldMappingKey != null && fieldsMapping.get(fieldMappingKey) != null && profileData != null && profileData[fieldsMapping.get(fieldMappingKey)] != null) {
                            throw new BadProfileDataFormatException("Unable to convert '" + profileData[fieldsMapping.get(fieldMappingKey)].trim() + "' to " + propertyType!=null?propertyType.getValueTypeId():"Null propertyType ", new Throwable("DATA_TYPE"));
                        } else {
                            throw new BadProfileDataFormatException("Unable to find profile data for key " + fieldMappingKey, new Throwable("DATA_TYPE"));
```

### DataFlowIssue
Variable is already assigned to this value
in `extensions/router/router-service/src/main/java/org/apache/unomi/router/services/ProfileExportServiceImpl.java`
#### Snippet
```java
        execution.put(RouterConstants.KEY_EXECS_EXTRACTED, counter);

        exportConfiguration = (ExportConfiguration) RouterUtils.addExecutionEntry(exportConfiguration, execution, Integer.parseInt((String) configSharingService.getProperty(RouterConstants.KEY_HISTORY_SIZE)));
        persistenceService.save(exportConfiguration);

```

### DataFlowIssue
Method invocation `compareTo` may produce `NullPointerException`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java

        if (expectedValueInteger != null) {
            return PropertyHelper.getInteger(actualValue).compareTo(PropertyHelper.getInteger(expectedValueInteger));
        } else if (expectedValueDouble != null) {
            return PropertyHelper.getDouble(actualValue).compareTo(PropertyHelper.getDouble(expectedValueDouble));
```

### DataFlowIssue
Argument `PropertyHelper.getInteger(expectedValueInteger)` might be null
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java

        if (expectedValueInteger != null) {
            return PropertyHelper.getInteger(actualValue).compareTo(PropertyHelper.getInteger(expectedValueInteger));
        } else if (expectedValueDouble != null) {
            return PropertyHelper.getDouble(actualValue).compareTo(PropertyHelper.getDouble(expectedValueDouble));
```

### DataFlowIssue
Method invocation `compareTo` may produce `NullPointerException`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java
            return PropertyHelper.getInteger(actualValue).compareTo(PropertyHelper.getInteger(expectedValueInteger));
        } else if (expectedValueDouble != null) {
            return PropertyHelper.getDouble(actualValue).compareTo(PropertyHelper.getDouble(expectedValueDouble));
        } else if (expectedValueDate != null) {
            return getDate(actualValue).compareTo(getDate(expectedValueDate));
```

### DataFlowIssue
Argument `PropertyHelper.getDouble(expectedValueDouble)` might be null
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java
            return PropertyHelper.getInteger(actualValue).compareTo(PropertyHelper.getInteger(expectedValueInteger));
        } else if (expectedValueDouble != null) {
            return PropertyHelper.getDouble(actualValue).compareTo(PropertyHelper.getDouble(expectedValueDouble));
        } else if (expectedValueDate != null) {
            return getDate(actualValue).compareTo(getDate(expectedValueDate));
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'filter()' and 'map()' can be swapped
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/factories/EventConditionFactory.java`
#### Snippet
```java
                .stream()
                .filter(inputObjectField -> !nonDynamicFields.contains(inputObjectField.getName()))
                .map(GraphQLInputObjectField::getName)
                .collect(Collectors.toList());

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `append()` is redundant
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
                    handleExportProperty(sb, profile.getProperties().get(propertyId), propertyIdAndType.getValue());
                } else {
                    sb.append("");
                }
                sb.append(";");
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `extensions/router/router-rest/src/main/java/org/apache/unomi/router/rest/ConfigRestExceptionMapper.java`
#### Snippet
```java
    @Override
    public Response toResponse(PartialContentException exception) {
        return Response.status(Response.Status.PARTIAL_CONTENT).header("Content-Type", MediaType.TEXT_PLAIN).entity(new String(exception.getMessage())).build();
    }

```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'setPersonalizations' is still used
in `api/src/main/java/org/apache/unomi/api/ContextResponse.java`
#### Snippet
```java
     */
    @Deprecated
    public void setPersonalizations(Map<String, List<String>> personalizations) {
        this.personalizations = personalizations;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getPersonalizations' is still used
in `api/src/main/java/org/apache/unomi/api/ContextResponse.java`
#### Snippet
```java
     */
    @Deprecated
    public Map<String, List<String>> getPersonalizations() {
        return personalizations;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'purgeSessionsAndEventsTime' is still used
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
     */
    @Deprecated
    private Integer purgeSessionsAndEventsTime = 0;
    private Integer purgeSessionExistTime = 0;
    private Integer purgeEventExistTime = 0;
```

### DeprecatedIsStillUsed
Deprecated member 'setMergedWith' is still used
in `api/src/main/java/org/apache/unomi/api/Profile.java`
#### Snippet
```java
     */
    @Deprecated
    public void setMergedWith(String mergedWith) {
        this.mergedWith = mergedWith;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getMergedWith' is still used
in `api/src/main/java/org/apache/unomi/api/Profile.java`
#### Snippet
```java
     */
    @Deprecated
    public String getMergedWith() {
        return mergedWith;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getAggregate' is still used
in `api/src/main/java/org/apache/unomi/api/services/QueryService.java`
#### Snippet
```java
     */
    @Deprecated
    Map<String, Long> getAggregate(String itemType, String property, AggregateQuery query);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'loadSession' is still used
in `api/src/main/java/org/apache/unomi/api/services/ProfileService.java`
#### Snippet
```java
     */
    @Deprecated
    Session loadSession(String sessionId, Date dateHint);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'AllEventToProfilePropertiesAction' is still used
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/AllEventToProfilePropertiesAction.java`
#### Snippet
```java
 */
@Deprecated
public class AllEventToProfilePropertiesAction implements ActionExecutor {

    private ProfileService profileService;
```

### DeprecatedIsStillUsed
Deprecated member 'EventsCollectorServlet' is still used
in `wab/src/main/java/org/apache/unomi/web/EventsCollectorServlet.java`
#### Snippet
```java
 */
@Deprecated
public class EventsCollectorServlet extends HttpServlet {
    private static final long serialVersionUID = 2008054804885122957L;
    private static final Logger logger = LoggerFactory.getLogger(EventsCollectorServlet.class.getName());
```

### DeprecatedIsStillUsed
Deprecated member 'ClientServlet' is still used
in `wab/src/main/java/org/apache/unomi/web/ClientServlet.java`
#### Snippet
```java
 */
@Deprecated
public class ClientServlet extends HttpServlet {

    private static final Logger logger = LoggerFactory.getLogger(ClientServlet.class.getName());
```

### DeprecatedIsStillUsed
Deprecated member 'ContextServlet' is still used
in `wab/src/main/java/org/apache/unomi/web/ContextServlet.java`
#### Snippet
```java
 */
@Deprecated
public class ContextServlet extends HttpServlet {
    private static final long serialVersionUID = 2928875830103325238L;
    private static final Logger logger = LoggerFactory.getLogger(ContextServlet.class.getName());
```

### DeprecatedIsStillUsed
Deprecated member 'updateWithQueryAndStoredScript' is still used
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PersistenceService.java`
#### Snippet
```java
     */
    @Deprecated
    boolean updateWithQueryAndStoredScript(Date dateHint, Class<?> clazz, String[] scripts, Map<String, Object>[] scriptParams, Condition[] conditions);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'purge' is still used
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PersistenceService.java`
#### Snippet
```java
     */
    @Deprecated
    void purge(Date date);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'aggregateQuery' is still used
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PersistenceService.java`
#### Snippet
```java
     */
    @Deprecated
    Map<String, Long> aggregateQuery(Condition filter, BaseAggregate aggregate, String itemType);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'updateWithQueryAndScript' is still used
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PersistenceService.java`
#### Snippet
```java
     */
    @Deprecated
    boolean updateWithQueryAndScript(Date dateHint, Class<?> clazz, String[] scripts, Map<String, Object>[] scriptParams, Condition[] conditions);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'loadCustomItem' is still used
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PersistenceService.java`
#### Snippet
```java
     */
    @Deprecated
    CustomItem loadCustomItem(String itemId, Date dateHint, String customItemType);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'updateWithScript' is still used
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PersistenceService.java`
#### Snippet
```java
     */
    @Deprecated
    boolean updateWithScript(Item item, Date dateHint, Class<?> clazz, String script, Map<String, Object> scriptParams);

    /**
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'containsKey()' check
in `metrics/src/main/java/org/apache/unomi/metrics/internal/MetricsServiceImpl.java`
#### Snippet
```java
    public void setCallerActivated(String timerName, boolean activated) {
        if (!activated) {
            if (callersStatus.containsKey(timerName)) {
                callersStatus.remove(timerName);
            }
```

### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsKey()'
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyHelper.java`
#### Snippet
```java
                        Object parentPropertyValue = PropertyUtils.getNestedProperty(target, parentPropertyName);
                        if (parentPropertyValue instanceof HashMap) {
                            if (((HashMap) parentPropertyValue).keySet().contains(propertyName.substring(propertyName.lastIndexOf('.') + 1))) {
                                ((HashMap) parentPropertyValue).remove(propertyName.substring(propertyName.lastIndexOf('.') + 1));
                                PropertyUtils.setNestedProperty(target, parentPropertyName, parentPropertyValue);
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `services/src/main/java/org/apache/unomi/services/impl/patches/PatchServiceImpl.java`
#### Snippet
```java
    @Override
    public void bundleChanged(BundleEvent event) {
        switch (event.getType()) {
            case BundleEvent.STARTED:
                processBundleStartup(event.getBundle().getBundleContext());
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
    @Override
    public void bundleChanged(BundleEvent event) {
        switch (event.getType()) {
            case BundleEvent.STARTING:
                loadPredefinedMappings(event.getBundle().getBundleContext(), true);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `api/src/main/java/org/apache/unomi/api/Event.java`
#### Snippet
```java
        if (!name.contains(".")) {
            return getProperty(name);
        }

        Map properties = this.properties;
        String[] propertyPath = StringUtils.substringBeforeLast(name, ".").split("\\.");
        String propertyName = StringUtils.substringAfterLast(name, ".");

        for (String property: propertyPath) {
            properties = (Map) properties.get(property);
            if (properties == null) {
                return null;
            }
        }
        return properties.get(propertyName);
```

### DuplicatedCode
Duplicated code
in `extensions/lists-extension/services/src/main/java/org/apache/unomi/services/UserListServiceImpl.java`
#### Snippet
```java
        List<Metadata> metadata = new LinkedList<>();
        for (UserList definition : userLists.getList()) {
            metadata.add(definition.getMetadata());
        }
        return new PartialList<>(metadata, userLists.getOffset(), userLists.getPageSize(), userLists.getTotalSize(), userLists.getTotalSizeRelation());
```

### DuplicatedCode
Duplicated code
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/route/ProfileImportFromSourceRouteBuilder.java`
#### Snippet
```java
        ProcessorDefinition prDefErr = onException(BadProfileDataFormatException.class)
                .log(LoggingLevel.ERROR, "Error processing record ${exchangeProperty.CamelSplitIndex}++ !")
                .handled(true)
                .process(new LineSplitFailureHandler())
                .onException(Exception.class)
                .log(LoggingLevel.ERROR, "Failed to process file.")
                .handled(true);

        if (RouterConstants.CONFIG_TYPE_KAFKA.equals(configType)) {
            prDefErr.to((KafkaEndpoint) getEndpointURI(RouterConstants.DIRECTION_FROM, RouterConstants.DIRECT_IMPORT_DEPOSIT_BUFFER));
        } else {
            prDefErr.to((String) getEndpointURI(RouterConstants.DIRECTION_FROM, RouterConstants.DIRECT_IMPORT_DEPOSIT_BUFFER));
        }
```

### DuplicatedCode
Duplicated code
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/internal/MailChimpServiceImpl.java`
#### Snippet
```java
        if (!isMailChimpConnectorConfigured() || profile.getProperty(EMAIL) == null) {
            return MailChimpResult.ERROR;
        }

        String listIdentifier = (String) action.getParameterValues().get(LIST_IDENTIFIER);
        if (StringUtils.isBlank(listIdentifier)) {
            logger.warn("Couldn't get the list identifier from Unomi");
            return MailChimpResult.ERROR;
        }

        JsonNode currentMember = isMemberOfMailChimpList(profile, listIdentifier);
```

### DuplicatedCode
Duplicated code
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/list/AddProfileToListCommand.java`
#### Snippet
```java
        final UserList userList = serviceManager.getService(UserListService.class).load(listId);

        if (userList == null) {
            return null;
        }

        ProfileService profileService = serviceManager.getService(ProfileService.class);
        final Profile profile = profileService.load(profileIDInput.getId());

        if (profile == null) {
            return null;
        }
```

### DuplicatedCode
Duplicated code
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/factories/EventConditionFactory.java`
#### Snippet
```java
        if (filterInput.getAnd() != null && !filterInput.getAnd().isEmpty()) {
            final List<Map<String, Object>> listFilterInputAsMap = (List<Map<String, Object>>) filterInputAsMap.get("and");

            rootSubConditions.add(filtersToCondition(filterInput.getAnd(), listFilterInputAsMap, this::eventFilterInputCondition, "and"));
        }

        if (filterInput.getOr() != null && !filterInput.getOr().isEmpty()) {
            final List<Map<String, Object>> listFilterInputAsMap = (List<Map<String, Object>>) filterInputAsMap.get("or");

            rootSubConditions.add(filtersToCondition(filterInput.getOr(), listFilterInputAsMap, this::eventFilterInputCondition, "or"));
        }
```

### DuplicatedCode
Duplicated code
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/factories/ProfileAliasConditionFactory.java`
#### Snippet
```java
        if (filterInputAsMap.get("and") != null) {
            final List<Map<String, Object>> andFilterInputAsMap = (List<Map<String, Object>>) filterInputAsMap.get("and");

            rootSubConditions.add(filtersToCondition(filterInput.getAnd(), andFilterInputAsMap, this::filterInputCondition, "and"));
        }

        if (filterInputAsMap.get("or") != null) {
            final List<Map<String, Object>> orFilterInputAsMap = (List<Map<String, Object>>) filterInputAsMap.get("or");

            rootSubConditions.add(filtersToCondition(filterInput.getOr(), orFilterInputAsMap, this::filterInputCondition, "or"));
        }

        return booleanCondition("and", rootSubConditions);
```

### DuplicatedCode
Duplicated code
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPIntPropertyInput.java`
#### Snippet
```java
        if (type == null) {
            return;
        }
        super.updateType(type);
        type.setDefaultValue(defaultValue != null ? defaultValue.toString() : null);
        if (minValue != null || maxValue != null) {
            final Double from = minValue != null ? minValue.doubleValue() : null;
            final Double to = maxValue != null && (minValue == null || maxValue >= minValue) ? maxValue.doubleValue() : null;
            updateDefaultNumericRange(type, from, to);
        } else {
            deleteDefaultNumericRange(type);
        }
```

### DuplicatedCode
Duplicated code
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/UpdatePropertiesAction.java`
#### Snippet
```java
                Event profileUpdated = new Event("profileUpdated", null, target, null, null, target, new Date());
                profileUpdated.setPersistent(false);
                int changes = eventService.send(profileUpdated);
                if ((changes & EventService.PROFILE_UPDATED) == EventService.PROFILE_UPDATED) {
                    profileService.save(target);
                }
```

### DuplicatedCode
Duplicated code
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PastEventConditionESQueryBuilder.java`
#### Snippet
```java
        boolean eventsOccurred = getStrategyFromOperator((String) condition.getParameter("operator"));
        int minimumEventCount = !eventsOccurred || condition.getParameter("minimumEventCount") == null ? 1 : (Integer) condition.getParameter("minimumEventCount");
        int maximumEventCount = !eventsOccurred || condition.getParameter("maximumEventCount") == null ? Integer.MAX_VALUE : (Integer) condition.getParameter("maximumEventCount");
        String generatedPropertyKey = (String) condition.getParameter("generatedPropertyKey");
```

### DuplicatedCode
Duplicated code
in `plugins/request/src/main/java/org/apache/unomi/plugins/request/actions/RequestHeaderToProfilePropertyAction.java`
#### Snippet
```java
        if (requestHeaderValue != null) {
            if (profilePropertyName != null) {
                if (event.getProfile().getProperty(profilePropertyName) == null || !event.getProfile().getProperty(profilePropertyName).equals(requestHeaderValue)) {
                    event.getProfile().setProperty(profilePropertyName, requestHeaderValue);
                    return EventService.PROFILE_UPDATED;
                }
            } else if (sessionPropertyName != null) {
                if (event.getSession().getProperty(sessionPropertyName) == null || !event.getSession().getProperty(sessionPropertyName).equals(requestHeaderValue)) {
                    event.getSession().setProperty(sessionPropertyName, requestHeaderValue);
                    return EventService.SESSION_UPDATED;
                }
            }
        }
        return EventService.NO_CHANGE;
```

### DuplicatedCode
Duplicated code
in `rest/src/main/java/org/apache/unomi/rest/service/impl/LocalizationHelper.java`
#### Snippet
```java
        result.setId(conditionType.getItemId());
        result.setVersion(conditionType.getVersion());

        result.setName(conditionType.getMetadata().getName());
        result.setDescription(conditionType.getMetadata().getDescription());

        result.setTags(conditionType.getMetadata().getTags());
        result.setSystemTags(conditionType.getMetadata().getSystemTags());
```

### DuplicatedCode
Duplicated code
in `services/src/main/java/org/apache/unomi/services/impl/AbstractServiceImpl.java`
#### Snippet
```java
        List<Metadata> details = new LinkedList<>();
        for (T definition : items.getList()) {
            details.add(definition.getMetadata());
        }
        return new PartialList<>(details, items.getOffset(), items.getPageSize(), items.getTotalSize(), items.getTotalSizeRelation());
```

### DuplicatedCode
Duplicated code
in `services/src/main/java/org/apache/unomi/services/impl/definitions/DefinitionsServiceImpl.java`
#### Snippet
```java
        logger.debug("postConstruct {" + bundleContext.getBundle() + "}");

        processBundleStartup(bundleContext);

        // process already started bundles
        for (Bundle bundle : bundleContext.getBundles()) {
            if (bundle.getBundleContext() != null && bundle.getBundleId() != bundleContext.getBundle().getBundleId()) {
                processBundleStartup(bundle.getBundleContext());
            }
        }

        bundleContext.addBundleListener(this);
```

### DuplicatedCode
Duplicated code
in `services/src/main/java/org/apache/unomi/services/impl/definitions/DefinitionsServiceImpl.java`
#### Snippet
```java
            if (matchingConditions.size() == 0) {
                return null;
            } else if (matchingConditions.equals(subConditions)) {
                return rootCondition;
            } else if (rootCondition.getConditionTypeId().equals("booleanCondition") && "and".equals(rootCondition.getParameter("operator"))) {
                if (matchingConditions.size() == 1) {
                    return matchingConditions.get(0);
                } else {
                    Condition res = new Condition();
                    res.setConditionType(getConditionType("booleanCondition"));
                    res.setParameter("operator", "and");
                    res.setParameter("subConditions", matchingConditions);
                    return res;
                }
            }
            throw new IllegalArgumentException();
```

### DuplicatedCode
Duplicated code
in `services/src/main/java/org/apache/unomi/services/impl/goals/GoalsServiceImpl.java`
#### Snippet
```java
        action1.setParameter("setPropertyName", name);
        action1.setParameter("setPropertyValueCurrentEventTimestamp", true);
        action1.setParameter("storeInSession", true);
        Action action2 = new Action();
        action2.setActionType(definitionsService.getActionType("setPropertyAction"));
        action2.setParameter("setPropertyName", name);
        action2.setParameter("setPropertyValueCurrentEventTimestamp", true);
        action2.setParameter("storeInSession", false);
        rule.setActions(Arrays.asList(action1, action2));
```

### DuplicatedCode
Duplicated code
in `services/src/main/java/org/apache/unomi/services/impl/rules/RulesServiceImpl.java`
#### Snippet
```java
                ruleStatistics.setExecutionCount(persistedRuleStatistics.getExecutionCount() + ruleStatistics.getLocalExecutionCount());
                if (ruleStatistics.getLocalExecutionCount() > 0) {
                    ruleStatistics.setLocalExecutionCount(0);
                    mustPersist = true;
                }
                ruleStatistics.setConditionsTime(persistedRuleStatistics.getConditionsTime() + ruleStatistics.getLocalConditionsTime());
                if (ruleStatistics.getLocalConditionsTime() > 0) {
                    ruleStatistics.setLocalConditionsTime(0);
                    mustPersist = true;
                }
                ruleStatistics.setActionsTime(persistedRuleStatistics.getActionsTime() + ruleStatistics.getLocalActionsTime());
                if (ruleStatistics.getLocalActionsTime() > 0) {
                    ruleStatistics.setLocalActionsTime(0);
                    mustPersist = true;
                }
                ruleStatistics.setLastSyncDate(new Date());
```

### DuplicatedCode
Duplicated code
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
        List<Metadata> segments = new LinkedList<>();
        List<Metadata> scorings = new LinkedList<>();
        for (Segment definition : impactedSegments) {
            segments.add(definition.getMetadata());
        }
        for (Scoring definition : impactedScorings) {
            scorings.add(definition.getMetadata());
        }
        return new DependentMetadata(segments, scorings);
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                    }
                }
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return 'true' but there's no such enum constant in MailChimpResult
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/MailChimpService.java`
#### Snippet
```java
     * @param profile the Unomi profile to remove from the list @see org.apache.unomi.api.Profile
     * @param action the action used to call this method, to retrieve parameters @see org.apache.unomi.api.actions.Action
     * @return true if the visitor is successfully removed to a MailChimp list.
     */
    MailChimpResult removeFromMCList(Profile profile, Action action);
```

### MismatchedJavadocCode
Method is specified to return 'true' but there's no such enum constant in MailChimpResult
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/MailChimpService.java`
#### Snippet
```java
     * @param profile the Unomi profile to unsubscribe from the list @see org.apache.unomi.api.Profile
     * @param action the action used to call this method, to retrieve parameters @see org.apache.unomi.api.actions.Action
     * @return true if the visitor is successfully unsbscribed to a MailChimp list.
     */
    MailChimpResult updateMCProfileProperties(Profile profile, Action action);
```

### MismatchedJavadocCode
Method is specified to return 'true' but there's no such enum constant in MailChimpResult
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/MailChimpService.java`
#### Snippet
```java
     * @param profile the Unomi profile to add to the list @see org.apache.unomi.api.Profile
     * @param action the action used to call this method, to retrieve parameters @see org.apache.unomi.api.actions.Action
     * @return true if the visitor is successfully added to a MailChimp list.
     */
    MailChimpResult addToMCList(Profile profile, Action action);
```

### MismatchedJavadocCode
Method is specified to return 'true' but there's no such enum constant in MailChimpResult
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/MailChimpService.java`
#### Snippet
```java
     * @param profile the Unomi profile to unsubscribe from the list @see org.apache.unomi.api.Profile
     * @param action the action used to call this method, to retrieve parameters @see org.apache.unomi.api.actions.Action
     * @return true if the visitor is successfully unsbscribed to a MailChimp list.
     */
    MailChimpResult unsubscribeFromMCList(Profile profile, Action action);
```

### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
     *
     * @param generatedPropertyKey the generated property key of the generated rule for the given past event condition.
     * @return the list of profile ids.
     */
    private Set<String> getExistingProfilesWithPastEventOccurrenceCount(String generatedPropertyKey) {
```

### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
     * @param eventCountByProfile the events count per profileId map
     * @param propertyKey         the generate property key for this past event condition, to keep track of the count in the profile
     * @return the list of profiles for witch the count of event occurrences have been updated.
     */
    private Set<String> updatePastEventOccurrencesOnProfiles(Map<String, Long> eventCountByProfile, String propertyKey) {
```

### MismatchedJavadocCode
Method is specified to return set but the return type is list
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ScoringServiceEndPoint.java`
#### Snippet
```java
     *               a column ({@code :}) and an order specifier: {@code asc} or {@code desc}.
     *
     * @return the set of all scoring metadata
     */
    @GET
```

### MismatchedJavadocCode
Method is specified to return list but the return type is map
in `rest/src/main/java/org/apache/unomi/rest/authentication/RestAuthenticationConfig.java`
#### Snippet
```java
     * - Method name only:              getContextJSON
     *
     * @return the list of role mappings &lt;methodKey, roles separated by single white spaces&gt;, like: &lt;"getContextJSON", "ROLE1 ROLE2 ROLE3"&gt;
     */
    Map<String, String> getMethodRolesMap();
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `extensions/groovy-actions/services/src/main/java/org/apache/unomi/groovy/actions/annotations/Action.java`
#### Snippet
```java
    /**
     * List of tags that help to classify the action
     * @return list of system tags
     */
    String[] systemTags() default {};
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `extensions/groovy-actions/services/src/main/java/org/apache/unomi/groovy/actions/annotations/Action.java`
#### Snippet
```java
     * The value of the parameters can be retrieved in the action like the following:
     * action.getParameterValues().get(parameterName);
     * @return list of parameters
     */
    Parameter[] parameters() default {};
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java

            @Override
            protected void customize(Request request) {
                super.customize(request);
                request.header("Authorization", "OAuth " + sfdcSession.getSessionId());
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `extensions/geonames/services/src/main/java/org/apache/unomi/geonames/services/GeonamesServiceImpl.java`
#### Snippet
```java
        try {

            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(f));
            ZipEntry zipEntry = zipInputStream.getNextEntry(); // used to advance to the first entry in the ZipInputStream
            long fileSize = zipEntry.getSize();
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `services/src/main/java/org/apache/unomi/services/impl/definitions/DefinitionsServiceImpl.java`
#### Snippet
```java
            }
        }
        conditionTypes.addAll(directConditionTypes);

        return conditionTypes;
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `services/src/main/java/org/apache/unomi/services/impl/definitions/DefinitionsServiceImpl.java`
#### Snippet
```java
        Set<ActionType> actionTypes = new LinkedHashSet<ActionType>();
        List<ActionType> directActionTypes = persistenceService.query(fieldName, fieldValue,null, ActionType.class);
        actionTypes.addAll(directActionTypes);

        return actionTypes;
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `services/src/main/java/org/apache/unomi/services/impl/rules/RulesServiceImpl.java`
#### Snippet
```java
        PartialList<Rule> rules = persistenceService.query(query.getCondition(), query.getSortby(), Rule.class, query.getOffset(), query.getLimit());
        List<Rule> details = new LinkedList<>();
        details.addAll(rules.getList());
        return new PartialList<>(details, rules.getOffset(), rules.getPageSize(), rules.getTotalSize(), rules.getTotalSizeRelation());
    }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
            //Generate a UUID if no itemId is set on the persona
            if (personaToSave.getPersona().getItemId() == null) {
                personaToSave.getPersona().setItemId("persona-" + UUID.randomUUID().toString());
            }
            boolean savedPersona = persistenceService.save(personaToSave.getPersona());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/route/ProfileImportFromSourceRouteBuilder.java`
#### Snippet
```java
                            // this route is only invoked when the original route is complete as a kind
                            // of completion callback
                            .log(LoggingLevel.DEBUG, "ROUTE [" + importConfiguration.getItemId() + "] is now complete [" + new Date().toString() + "]")
                            // must use end to denote the end of the onCompletion route
                            .end()
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/DeleteProfilePropertiesCommand.java`
#### Snippet
```java

        if (!incorrectPropertyNames.isEmpty()) {
            throw new IllegalArgumentException(String.format("The properties \"%s\" do not belong to profile", incorrectPropertyNames.toString()));
        }

```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `rest/src/main/java/org/apache/unomi/rest/endpoints/UserListServiceEndPoint.java`
#### Snippet
```java
package org.apache.unomi.rest.endpoints;

/**
 * Created by amidani on 24/03/2017.
 */
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `ClassLoaderClassResolver` may be 'static'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java
    }

    private class ClassLoaderClassResolver extends DefaultClassResolver {
        private ClassLoader classLoader;

```

### InnerClassMayBeStatic
Inner class `EventPublisherListener` may be 'static'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/event/UnomiEventPublisher.java`
#### Snippet
```java
    }

    class EventPublisherListener {

        private ObservableEmitter<CDPEventInterface> emitter;
```

### InnerClassMayBeStatic
Inner class `PropertyTypeDefinitionType` may be 'static'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaProvider.java`
#### Snippet
```java
    }

    public class PropertyTypeDefinitionType implements DefinitionType {

        private PropertyType propertyType;
```

### InnerClassMayBeStatic
Inner class `JSONTypeDefinitionType` may be 'static'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaProvider.java`
#### Snippet
```java
    }

    public class JSONTypeDefinitionType implements DefinitionType {
        private List<JSONType> jsonTypes;
        private JSONType firstNonNullType;
```

### InnerClassMayBeStatic
Inner class `ConditionDecorator` may be 'static'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentConditionParser.java`
#### Snippet
```java
    }

    private class ConditionDecorator {

        private String id;
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
            }
        });
        propsToRemove.forEach(propId -> profileProperties.remove(propId));
        return profileProperties;
    }
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `extensions/router/router-api/src/main/java/org/apache/unomi/router/api/RouterUtils.java`
#### Snippet
```java
        if (configuration.getExecutions().size() >= executionsHistorySize) {
            int oldestExecIndex = 0;
            long oldestExecDate = (Long) configuration.getExecutions().get(0).get(RouterConstants.KEY_EXECS_DATE);
            for (int i = 1; i < configuration.getExecutions().size(); i++) {
                if ((Long) configuration.getExecutions().get(i).get(RouterConstants.KEY_EXECS_DATE) < oldestExecDate) {
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `extensions/router/router-api/src/main/java/org/apache/unomi/router/api/RouterUtils.java`
#### Snippet
```java
            long oldestExecDate = (Long) configuration.getExecutions().get(0).get(RouterConstants.KEY_EXECS_DATE);
            for (int i = 1; i < configuration.getExecutions().size(); i++) {
                if ((Long) configuration.getExecutions().get(i).get(RouterConstants.KEY_EXECS_DATE) < oldestExecDate) {
                    oldestExecDate = (Long) configuration.getExecutions().get(i).get(RouterConstants.KEY_EXECS_DATE);
                    oldestExecIndex = i;
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `extensions/router/router-api/src/main/java/org/apache/unomi/router/api/RouterUtils.java`
#### Snippet
```java
            for (int i = 1; i < configuration.getExecutions().size(); i++) {
                if ((Long) configuration.getExecutions().get(i).get(RouterConstants.KEY_EXECS_DATE) < oldestExecDate) {
                    oldestExecDate = (Long) configuration.getExecutions().get(i).get(RouterConstants.KEY_EXECS_DATE);
                    oldestExecIndex = i;
                }
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `boolQueryBuilder` declared in one 'switch' branch and used in another
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionESQueryBuilder.java`
#### Snippet
```java
            case "all":
                checkRequiredValue(values, name, comparisonOperator, true);
                BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
                for (Object curValue : values) {
                    boolQueryBuilder.must(QueryBuilders.termQuery(name, curValue));
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `samples/tweet-button-plugin/src/main/java/org/apache/unomi/samples/tweet_button_plugin/actions/IncrementTweetNumberAction.java`
#### Snippet
```java
            CustomItem source = (CustomItem) sourceAsItem;
            final String url = (String) source.getProperties().get("url");
            if (url != null) {
                return url;
            }
```

### TrivialIf
`if` statement can be simplified
in `services/src/main/java/org/apache/unomi/services/impl/events/EventServiceImpl.java`
#### Snippet
```java
        Event pastEvent = this.persistenceService.load(event.getItemId(), Event.class);
        if (pastEvent != null && pastEvent.getVersion() >= 1) {
            if ((pastEvent.getSessionId() != null && pastEvent.getSessionId().equals(event.getSessionId())) ||
                    (pastEvent.getProfileId() != null && pastEvent.getProfileId().equals(event.getProfileId())))  {
                return true;
```

### TrivialIf
`if` statement can be simplified
in `services/src/main/java/org/apache/unomi/services/impl/configsharing/ConfigSharingServiceImpl.java`
#### Snippet
```java
    public Object removeProperty(String name) {
        boolean existed = false;
        if (configProperties.containsKey(name)) {
            existed = true;
        }
```

### TrivialIf
`if` statement can be simplified
in `services/src/main/java/org/apache/unomi/services/impl/configsharing/ConfigSharingServiceImpl.java`
#### Snippet
```java
    public Object setProperty(String name, Object newValue) {
        boolean existed = false;
        if (configProperties.containsKey(name)) {
            existed = true;
        }
```

### TrivialIf
`if` statement can be simplified
in `services/src/main/java/org/apache/unomi/services/impl/cluster/ClusterServiceImpl.java`
#### Snippet
```java
                logger.error("Cluster group " + karafCellarGroupName + " doesn't exist, creating it...");
                group = karafCellarGroupManager.createGroup(karafCellarGroupName);
                if (group != null) {
                    setupConfigOk = true;
                } else {
```

### TrivialIf
`if` statement can be simplified
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/SFDCSession.java`
#### Snippet
```java

    public boolean isExpired() {
        if (System.currentTimeMillis() < this.issuedAt + this.timeout) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `api/src/main/java/org/apache/unomi/api/Consent.java`
#### Snippet
```java
    public boolean isConsentGrantedAtDate(Date testDate) {
        if (getStatusDate().before(testDate) && (getRevokeDate() == null || (getRevokeDate().after(testDate)))) {
            if (getStatus().equals(ConsentStatus.GRANTED)) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            return false;
        }
        if (sfdcSession.isExpired()) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
                    "='" + identifierFieldValue + "'");
            queryResult = mappingResponse(response, queryResult);
            if (queryResult.size() > 0) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
                }
            } else if ("scoringCondition".equals(condition.getConditionTypeId())) {
                if (scoringToDeleteId.equals(condition.getParameter("scoringPlanId"))) {
                    return true;
                }
```

### TrivialIf
`if` statement can be simplified
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
                @SuppressWarnings("unchecked") final List<String> referencedSegmentIds = (List<String>) condition.getParameter("segments");

                if (referencedSegmentIds.indexOf(segmentToDeleteId) >= 0) {
                    return true;
                }
```

### TrivialIf
`if` statement can be simplified
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/json/JSONType.java`
#### Snippet
```java

    public boolean merge(JSONType anotherType) {
        if (!anotherType.getType().equals(getType())) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/conditions/ConditionContextHelper.java`
#### Snippet
```java
    private static boolean hasContextualParameter(Object value) {
        if (value instanceof String) {
            if (((String) value).startsWith("parameter::") || ((String) value).startsWith("script::")) {
                return true;
            }
```

## RuleId[id=ListIndexOfReplaceableByContains]
### ListIndexOfReplaceableByContains
`referencedSegmentIds.indexOf(segmentId) >= 0` can be replaced with 'referencedSegmentIds.contains(segmentId)'
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
        } else if ("profileSegmentCondition".equals(condition.getConditionTypeId())) {
            @SuppressWarnings("unchecked") final List<String> referencedSegmentIds = (List<String>) condition.getParameter("segments");
            if (referencedSegmentIds.indexOf(segmentId) >= 0) {
                referencedSegmentIds.remove(segmentId);
                if (referencedSegmentIds.isEmpty()) {
```

### ListIndexOfReplaceableByContains
`referencedSegmentIds.indexOf(segmentToDeleteId) >= 0` can be replaced with 'referencedSegmentIds.contains(segmentToDeleteId)'
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
                @SuppressWarnings("unchecked") final List<String> referencedSegmentIds = (List<String>) condition.getParameter("segments");

                if (referencedSegmentIds.indexOf(segmentToDeleteId) >= 0) {
                    return true;
                }
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
                for (String mappingConsent : mappingConsents) {
                    String[] mappingConsentArray = mappingConsent.split("<=>");
                    if (mappingConsentArray.length <= 0) {
                        logger.error("Error with the mapping for field {}, this field will not be mapped please check the cfg file", mappingConsentsString);
                    } else {
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `extensions/geonames/services/src/main/java/org/apache/unomi/geonames/services/GeonamesServiceImpl.java`
#### Snippet
```java
            ZipEntry zipEntry = zipInputStream.getNextEntry(); // used to advance to the first entry in the ZipInputStream
            long fileSize = zipEntry.getSize();
            BufferedReader reader = new BufferedReader(new InputStreamReader(zipInputStream, "UTF-8"));

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'value != null' covered by subsequent condition 'value instanceof List'
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyHelper.java`
#### Snippet
```java
    public static List<Object> convertToList(Object value) {
        List<Object> convertedList = new ArrayList<>();
        if (value != null && value instanceof List) {
            convertedList.addAll((List) value);
        } else if (value != null) {
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator never returns positive values
in `common/src/main/java/org/apache/unomi/common/DataTable.java`
#### Snippet
```java
    public static class EmptyCell implements Comparable {
        @Override
        public int compareTo(Object o) {
            if (o instanceof EmptyCell) {
                return 0;
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param session` tag description is missing
in `extensions/weather-update/core/src/main/java/org/apache/unomi/weatherupdate/actions/WeatherUpdateAction.java`
#### Snippet
```java
     *
     * @param currentWeatherData the response from the API
     * @param session
     */
    private void updateSessionWithWeatherData(JsonNode currentWeatherData, Session session) {
```

### JavadocDeclaration
`@param location` tag description is missing
in `extensions/weather-update/core/src/main/java/org/apache/unomi/weatherupdate/actions/WeatherUpdateAction.java`
#### Snippet
```java
     * Do the API call
     *
     * @param location
     * @return the response
     */
```

### JavadocDeclaration
`@param contextRequest` tag description is missing
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ContextJsonEndpoint.java`
#### Snippet
```java
     * - sessionPropertiesOverrides for session properties
     *
     * @param contextRequest
     * @param profile
     * @param session
```

### JavadocDeclaration
`@param profile` tag description is missing
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ContextJsonEndpoint.java`
#### Snippet
```java
     *
     * @param contextRequest
     * @param profile
     * @param session
     */
```

### JavadocDeclaration
`@param session` tag description is missing
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ContextJsonEndpoint.java`
#### Snippet
```java
     * @param contextRequest
     * @param profile
     * @param session
     */
    private void processOverrides(ContextRequest contextRequest, Profile profile, Session session) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `extensions/groovy-actions/services/src/main/java/org/apache/unomi/groovy/actions/services/impl/GroovyActionsServiceImpl.java`
#### Snippet
```java
     * could be called
     *
     * @throws IOException
     */
    private void loadBaseScript() throws IOException {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `exportConfiguration.getProperties().get(...)` to `Map` is redundant
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/route/ProfileExportCollectRouteBuilder.java`
#### Snippet
```java
            if (RouterConstants.IMPORT_EXPORT_CONFIG_TYPE_RECURRENT.equals(exportConfiguration.getConfigType()) &&
                    exportConfiguration.getProperties() != null && exportConfiguration.getProperties().size() > 0) {
                if ((Map<String, String>) exportConfiguration.getProperties().get("mapping") != null) {
                    String destinationEndpoint = (String) exportConfiguration.getProperties().get("destination");
                    if (StringUtils.isNotBlank(destinationEndpoint) && allowedEndpoints.contains(destinationEndpoint.substring(0, destinationEndpoint.indexOf(':')))) {
```

### RedundantCast
Casting `exportConfiguration.getProperties().get(...)` to `String` is redundant
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/route/ProfileExportCollectRouteBuilder.java`
#### Snippet
```java
                    String destinationEndpoint = (String) exportConfiguration.getProperties().get("destination");
                    if (StringUtils.isNotBlank(destinationEndpoint) && allowedEndpoints.contains(destinationEndpoint.substring(0, destinationEndpoint.indexOf(':')))) {
                        String timerString = "timer://collectProfile?fixedRate=true&period=" + (String) exportConfiguration.getProperties().get("period");
                        if ((String) exportConfiguration.getProperties().get("delay") != null) {
                            timerString += "&delay=" + (String) exportConfiguration.getProperties().get("delay");
```

### RedundantCast
Casting `exportConfiguration.getProperties().get(...)` to `String` is redundant
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/route/ProfileExportCollectRouteBuilder.java`
#### Snippet
```java
                    if (StringUtils.isNotBlank(destinationEndpoint) && allowedEndpoints.contains(destinationEndpoint.substring(0, destinationEndpoint.indexOf(':')))) {
                        String timerString = "timer://collectProfile?fixedRate=true&period=" + (String) exportConfiguration.getProperties().get("period");
                        if ((String) exportConfiguration.getProperties().get("delay") != null) {
                            timerString += "&delay=" + (String) exportConfiguration.getProperties().get("delay");
                        }
```

### RedundantCast
Casting `exportConfiguration.getProperties().get(...)` to `String` is redundant
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/route/ProfileExportCollectRouteBuilder.java`
#### Snippet
```java
                        String timerString = "timer://collectProfile?fixedRate=true&period=" + (String) exportConfiguration.getProperties().get("period");
                        if ((String) exportConfiguration.getProperties().get("delay") != null) {
                            timerString += "&delay=" + (String) exportConfiguration.getProperties().get("delay");
                        }
                        ProcessorDefinition prDef = from(timerString)
```

### RedundantCast
Casting `null` to `Throwable` is redundant
in `extensions/router/router-rest/src/main/java/org/apache/unomi/router/rest/PartialContentException.java`
#### Snippet
```java
     */
    public PartialContentException(String message) {
        super(message, (Throwable) null, Response.Status.PARTIAL_CONTENT);
    }

```

### RedundantCast
Casting `null` to `Throwable` is redundant
in `extensions/router/router-rest/src/main/java/org/apache/unomi/router/rest/PartialContentException.java`
#### Snippet
```java

    public PartialContentException(String message, Response response) {
        super(message, (Throwable) null, Response.Status.PARTIAL_CONTENT);
    }

```

### RedundantCast
Casting `exchange.getIn().getBody()` to `String` is redundant
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/LineSplitProcessor.java`
#### Snippet
```java
                .build();

        logger.debug("$$$$ : LineSplitProcessor : BODY : " + (String) exchange.getIn().getBody());

        String[] profileData = rfc4180Parser.parseLine(((String) exchange.getIn().getBody()));
```

### RedundantCast
Casting `subConditionAsMap` to `Object` is redundant
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/segments/CreateOrUpdateUnomiSegmentCommand.java`
#### Snippet
```java
            final List<Condition> subConditionDecorators = subConditions.stream()
                    .map(subConditionAsMap -> {
                        final Condition subCondition = GraphQLObjectMapper.getInstance().convertValue((Object) subConditionAsMap, Condition.class);

                        return decorateCondition(subCondition);
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `id` may be 'final'
in `services/src/main/java/org/apache/unomi/services/impl/events/ThirdPartyServer.java`
#### Snippet
```java
 */
public class ThirdPartyServer {
    private String id;

    private String key;
```

### FieldMayBeFinal
Field `eventListeners` may be 'final'
in `services/src/main/java/org/apache/unomi/services/impl/events/EventServiceImpl.java`
#### Snippet
```java
    private static final int MAX_RECURSION_DEPTH = 10;

    private List<EventListenerService> eventListeners = new CopyOnWriteArrayList<EventListenerService>();

    private PersistenceService persistenceService;
```

### FieldMayBeFinal
Field `personalizationStrategies` may be 'final'
in `services/src/main/java/org/apache/unomi/services/impl/personalization/PersonalizationServiceImpl.java`
#### Snippet
```java
    private ProfileService profileService;

    private Map<String, PersonalizationStrategy> personalizationStrategies = new ConcurrentHashMap<>();
    private final PersonalizationStrategy controlGroupStrategy = new ControlGroupPersonalizationStrategy();

```

### FieldMayBeFinal
Field `nodeSystemStatistics` may be 'final'
in `services/src/main/java/org/apache/unomi/services/impl/cluster/ClusterServiceImpl.java`
#### Snippet
```java
    private String publicAddress;
    private String internalAddress;
    private Map<String, Map<String,Serializable>> nodeSystemStatistics = new ConcurrentHashMap<>();
    private Group group = null;
    private SchedulerService schedulerService;
```

### FieldMayBeFinal
Field `actionDispatchers` may be 'final'
in `services/src/main/java/org/apache/unomi/services/actions/impl/ActionExecutorDispatcherImpl.java`
#### Snippet
```java
    private Map<String, ActionExecutor> executors = new ConcurrentHashMap<>();
    private MetricsService metricsService;
    private Map<String, ActionDispatcher> actionDispatchers = new ConcurrentHashMap<>();
    private BundleContext bundleContext;
    private ScriptExecutor scriptExecutor;
```

### FieldMayBeFinal
Field `executors` may be 'final'
in `services/src/main/java/org/apache/unomi/services/actions/impl/ActionExecutorDispatcherImpl.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(ActionExecutorDispatcherImpl.class.getName());
    private final Map<String, ParserHelper.ValueExtractor> valueExtractors = new HashMap<>(11);
    private Map<String, ActionExecutor> executors = new ConcurrentHashMap<>();
    private MetricsService metricsService;
    private Map<String, ActionDispatcher> actionDispatchers = new ConcurrentHashMap<>();
```

### FieldMayBeFinal
Field `endPoint` may be 'final'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/SFDCSession.java`
#### Snippet
```java
public class SFDCSession {
    private String sessionId;
    private String endPoint;
    private String signature;
    private String id;
```

### FieldMayBeFinal
Field `sessionId` may be 'final'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/SFDCSession.java`
#### Snippet
```java
 */
public class SFDCSession {
    private String sessionId;
    private String endPoint;
    private String signature;
```

### FieldMayBeFinal
Field `timeout` may be 'final'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/SFDCSession.java`
#### Snippet
```java
    private String tokenType;
    private Long issuedAt;
    private Long timeout;

    public SFDCSession(String sessionId, String endPoint, String signature, String id, String tokenType, String issuedAt, Long timeout) {
```

### FieldMayBeFinal
Field `signature` may be 'final'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/SFDCSession.java`
#### Snippet
```java
    private String sessionId;
    private String endPoint;
    private String signature;
    private String id;
    private String tokenType;
```

### FieldMayBeFinal
Field `tokenType` may be 'final'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/SFDCSession.java`
#### Snippet
```java
    private String signature;
    private String id;
    private String tokenType;
    private Long issuedAt;
    private Long timeout;
```

### FieldMayBeFinal
Field `id` may be 'final'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/SFDCSession.java`
#### Snippet
```java
    private String endPoint;
    private String signature;
    private String id;
    private String tokenType;
    private Long issuedAt;
```

### FieldMayBeFinal
Field `issuedAt` may be 'final'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/SFDCSession.java`
#### Snippet
```java
    private String id;
    private String tokenType;
    private Long issuedAt;
    private Long timeout;

```

### FieldMayBeFinal
Field `unomiToSfdcFieldMappings` may be 'final'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/SFDCConfiguration.java`
#### Snippet
```java
    private long sfdcSessionTimeout = 15 * 60 * 1000L; // 15 minutes by default

    private Map<String, String> unomiToSfdcFieldMappings = new HashMap<>();
    private Map<String, String> sfdcToUnomiFieldMappings = new HashMap<>();

```

### FieldMayBeFinal
Field `sfdcToUnomiFieldMappings` may be 'final'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/SFDCConfiguration.java`
#### Snippet
```java

    private Map<String, String> unomiToSfdcFieldMappings = new HashMap<>();
    private Map<String, String> sfdcToUnomiFieldMappings = new HashMap<>();

    public SFDCConfiguration() { }
```

### FieldMayBeFinal
Field `valueTypeById` may be 'final'
in `services/src/main/java/org/apache/unomi/services/impl/definitions/DefinitionsServiceImpl.java`
#### Snippet
```java
    private Map<String, ConditionType> conditionTypeById = new ConcurrentHashMap<>();
    private Map<String, ActionType> actionTypeById = new ConcurrentHashMap<>();
    private Map<String, ValueType> valueTypeById = new HashMap<>();
    private Map<String, Set<ValueType>> valueTypeByTag = new HashMap<>();
    private Map<Long, List<PluginType>> pluginTypes = new HashMap<>();
```

### FieldMayBeFinal
Field `propertyMergeStrategyTypeById` may be 'final'
in `services/src/main/java/org/apache/unomi/services/impl/definitions/DefinitionsServiceImpl.java`
#### Snippet
```java
    private Map<String, Set<ValueType>> valueTypeByTag = new HashMap<>();
    private Map<Long, List<PluginType>> pluginTypes = new HashMap<>();
    private Map<String, PropertyMergeStrategyType> propertyMergeStrategyTypeById = new HashMap<>();

    private long definitionsRefreshInterval = 10000;
```

### FieldMayBeFinal
Field `pluginTypes` may be 'final'
in `services/src/main/java/org/apache/unomi/services/impl/definitions/DefinitionsServiceImpl.java`
#### Snippet
```java
    private Map<String, ValueType> valueTypeById = new HashMap<>();
    private Map<String, Set<ValueType>> valueTypeByTag = new HashMap<>();
    private Map<Long, List<PluginType>> pluginTypes = new HashMap<>();
    private Map<String, PropertyMergeStrategyType> propertyMergeStrategyTypeById = new HashMap<>();

```

### FieldMayBeFinal
Field `valueTypeByTag` may be 'final'
in `services/src/main/java/org/apache/unomi/services/impl/definitions/DefinitionsServiceImpl.java`
#### Snippet
```java
    private Map<String, ActionType> actionTypeById = new ConcurrentHashMap<>();
    private Map<String, ValueType> valueTypeById = new HashMap<>();
    private Map<String, Set<ValueType>> valueTypeByTag = new HashMap<>();
    private Map<Long, List<PluginType>> pluginTypes = new HashMap<>();
    private Map<String, PropertyMergeStrategyType> propertyMergeStrategyTypeById = new HashMap<>();
```

### FieldMayBeFinal
Field `allRuleStatistics` may be 'final'
in `services/src/main/java/org/apache/unomi/services/impl/rules/RulesServiceImpl.java`
#### Snippet
```java
    private final Set<String> invalidRulesId = new HashSet<>();

    private Map<String, RuleStatistics> allRuleStatistics = new ConcurrentHashMap<>();

    private Integer rulesRefreshInterval = 1000;
```

### FieldMayBeFinal
Field `ruleListeners` may be 'final'
in `services/src/main/java/org/apache/unomi/services/impl/rules/RulesServiceImpl.java`
#### Snippet
```java
    private Integer rulesStatisticsRefreshInterval = 10000;

    private List<RuleListenerService> ruleListeners = new CopyOnWriteArrayList<RuleListenerService>();

    private Map<String, Set<Rule>> rulesByEventType = new HashMap<>();
```

### FieldMayBeFinal
Field `metricsService` may be 'final'
in `metrics/src/main/java/org/apache/unomi/metrics/MetricAdapter.java`
#### Snippet
```java
public abstract class MetricAdapter<T> {

    private MetricsService metricsService;
    private String timerName;

```

### FieldMayBeFinal
Field `timerName` may be 'final'
in `metrics/src/main/java/org/apache/unomi/metrics/MetricAdapter.java`
#### Snippet
```java

    private MetricsService metricsService;
    private String timerName;

    public abstract T execute(Object... args) throws Exception;
```

### FieldMayBeFinal
Field `callerCounts` may be 'final'
in `metrics/src/main/java/org/apache/unomi/metrics/internal/MetricImpl.java`
#### Snippet
```java
    private long totalCount = 0L;
    private long totalTime = 0L;
    private Map<String,CallerCount> callerCounts = new ConcurrentHashMap<String, CallerCount>();

    public MetricImpl(String name) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `metrics/src/main/java/org/apache/unomi/metrics/internal/MetricImpl.java`
#### Snippet
```java
public class MetricImpl implements Metric {

    private String name;
    private long totalCount = 0L;
    private long totalTime = 0L;
```

### FieldMayBeFinal
Field `count` may be 'final'
in `metrics/src/main/java/org/apache/unomi/metrics/internal/CallerCountImpl.java`
#### Snippet
```java
    private String hash;
    private List<String> caller;
    private AtomicLong count = new AtomicLong();
    private AtomicLong totalTime = new AtomicLong();

```

### FieldMayBeFinal
Field `hash` may be 'final'
in `metrics/src/main/java/org/apache/unomi/metrics/internal/CallerCountImpl.java`
#### Snippet
```java
public class CallerCountImpl implements CallerCount {

    private String hash;
    private List<String> caller;
    private AtomicLong count = new AtomicLong();
```

### FieldMayBeFinal
Field `caller` may be 'final'
in `metrics/src/main/java/org/apache/unomi/metrics/internal/CallerCountImpl.java`
#### Snippet
```java

    private String hash;
    private List<String> caller;
    private AtomicLong count = new AtomicLong();
    private AtomicLong totalTime = new AtomicLong();
```

### FieldMayBeFinal
Field `totalTime` may be 'final'
in `metrics/src/main/java/org/apache/unomi/metrics/internal/CallerCountImpl.java`
#### Snippet
```java
    private List<String> caller;
    private AtomicLong count = new AtomicLong();
    private AtomicLong totalTime = new AtomicLong();

    public CallerCountImpl(String hash, List<String> caller) {
```

### FieldMayBeFinal
Field `allPropertyTypes` may be 'final'
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
     */
    private static class PropertyTypes {
        private List<PropertyType> allPropertyTypes;
        private Map<String, PropertyType> propertyTypesById = new HashMap<>();
        private Map<String, List<PropertyType>> propertyTypesByTags = new HashMap<>();
```

### FieldMayBeFinal
Field `consents` may be 'final'
in `api/src/main/java/org/apache/unomi/api/Profile.java`
#### Snippet
```java
    private String mergedWith;

    private Map<String, Consent> consents = new LinkedHashMap<>();

    /**
```

### FieldMayBeFinal
Field `numericRanges` may be 'final'
in `api/src/main/java/org/apache/unomi/api/query/Aggregate.java`
#### Snippet
```java
    private Map<String, Object> parameters = new HashMap<>();
    private List<DateRange> dateRanges = new ArrayList<>();
    private List<NumericRange> numericRanges = new ArrayList<>();
    private List<IpRange> ipRanges = new ArrayList<>();

```

### FieldMayBeFinal
Field `lon` may be 'final'
in `api/src/main/java/org/apache/unomi/api/GeoPoint.java`
#### Snippet
```java
     * Longitude of the geo point
     */
    private Double lon;

    /**
```

### FieldMayBeFinal
Field `lat` may be 'final'
in `api/src/main/java/org/apache/unomi/api/GeoPoint.java`
#### Snippet
```java
     * Latitude of the geo point
     */
    private Double lat;

    /**
```

### FieldMayBeFinal
Field `scores` may be 'final'
in `api/src/main/java/org/apache/unomi/api/segments/SegmentsAndScores.java`
#### Snippet
```java
public class SegmentsAndScores implements Serializable {
    private Set<String> segments;
    private Map<String,Integer> scores;

    /**
```

### FieldMayBeFinal
Field `segments` may be 'final'
in `api/src/main/java/org/apache/unomi/api/segments/SegmentsAndScores.java`
#### Snippet
```java
 */
public class SegmentsAndScores implements Serializable {
    private Set<String> segments;
    private Map<String,Integer> scores;

```

### FieldMayBeFinal
Field `newValue` may be 'final'
in `api/src/main/java/org/apache/unomi/api/services/ConfigSharingService.java`
#### Snippet
```java
        private String name;
        private Object oldValue;
        private Object newValue;

        public ConfigChangeEvent(ConfigChangeEventType eventType, String name, Object oldValue, Object newValue) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `api/src/main/java/org/apache/unomi/api/services/ConfigSharingService.java`
#### Snippet
```java
        public enum ConfigChangeEventType { ADDED, UPDATED, REMOVED };
        private ConfigChangeEventType eventType;
        private String name;
        private Object oldValue;
        private Object newValue;
```

### FieldMayBeFinal
Field `oldValue` may be 'final'
in `api/src/main/java/org/apache/unomi/api/services/ConfigSharingService.java`
#### Snippet
```java
        private ConfigChangeEventType eventType;
        private String name;
        private Object oldValue;
        private Object newValue;

```

### FieldMayBeFinal
Field `eventType` may be 'final'
in `api/src/main/java/org/apache/unomi/api/services/ConfigSharingService.java`
#### Snippet
```java
    class ConfigChangeEvent {
        public enum ConfigChangeEventType { ADDED, UPDATED, REMOVED };
        private ConfigChangeEventType eventType;
        private String name;
        private Object oldValue;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/HttpUtils.java`
#### Snippet
```java
public class HttpUtils {

    private static Logger logger = LoggerFactory.getLogger(HttpUtils.class);

    public static CloseableHttpClient initHttpClient() {
```

### FieldMayBeFinal
Field `mvelExpressions` may be 'final'
in `scripting/src/main/java/org/apache/unomi/scripting/MvelScriptExecutor.java`
#### Snippet
```java
    private final static String INVALID_SCRIPT_MARKER = "--- Invalid Script Marker ---";

    private Map<String, Serializable> mvelExpressions = new ConcurrentHashMap<>();
    private SecureFilteringClassLoader secureFilteringClassLoader = new SecureFilteringClassLoader(getClass().getClassLoader());
    private ExpressionFilterFactory expressionFilterFactory;
```

### FieldMayBeFinal
Field `secureFilteringClassLoader` may be 'final'
in `scripting/src/main/java/org/apache/unomi/scripting/MvelScriptExecutor.java`
#### Snippet
```java

    private Map<String, Serializable> mvelExpressions = new ConcurrentHashMap<>();
    private SecureFilteringClassLoader secureFilteringClassLoader = new SecureFilteringClassLoader(getClass().getClassLoader());
    private ExpressionFilterFactory expressionFilterFactory;

```

### FieldMayBeFinal
Field `conditionTypeStack` may be 'final'
in `api/src/main/java/org/apache/unomi/api/utils/ParserHelper.java`
#### Snippet
```java

        private Set<String> eventTypeIds = new HashSet<>();
        private Stack<String> conditionTypeStack = new Stack<>();

        public void visit(Condition condition) {
```

### FieldMayBeFinal
Field `eventTypeIds` may be 'final'
in `api/src/main/java/org/apache/unomi/api/utils/ParserHelper.java`
#### Snippet
```java
    public static class EventTypeConditionVisitor implements ConditionVisitor {

        private Set<String> eventTypeIds = new HashSet<>();
        private Stack<String> conditionTypeStack = new Stack<>();

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/route/ProfileImportToUnomiRouteBuilder.java`
#### Snippet
```java
public class ProfileImportToUnomiRouteBuilder extends RouterAbstractRouteBuilder {

    private Logger logger = LoggerFactory.getLogger(ProfileImportToUnomiRouteBuilder.class.getName());

    private UnomiStorageProcessor unomiStorageProcessor;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/route/ProfileImportOneShotRouteBuilder.java`
#### Snippet
```java
public class ProfileImportOneShotRouteBuilder extends RouterAbstractRouteBuilder {

    private Logger logger = LoggerFactory.getLogger(ProfileImportOneShotRouteBuilder.class.getName());
    private ImportConfigByFileNameProcessor importConfigByFileNameProcessor;
    private String uploadDir;
```

### FieldMayBeFinal
Field `expressionFiltersActivated` may be 'final'
in `scripting/src/main/java/org/apache/unomi/scripting/internal/ExpressionFilterFactoryImpl.java`
#### Snippet
```java
    private final ObjectMapper objectMapper = new ObjectMapper();

    private boolean expressionFiltersActivated = Boolean.parseBoolean(System.getProperty("org.apache.unomi.scripting.filter.activated", "true"));

    public void setBundleContext(BundleContext bundleContext) {
```

### FieldMayBeFinal
Field `profileExportService` may be 'final'
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/LineBuildProcessor.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(LineBuildProcessor.class);

    private ProfileExportService profileExportService;

    public LineBuildProcessor(ProfileExportService profileExportService) {
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/internal/MailChimpServiceImpl.java`
#### Snippet
```java
public class MailChimpServiceImpl implements MailChimpService {

    private static Logger logger = LoggerFactory.getLogger(MailChimpServiceImpl.class);

    private static final String ACCEPT = "Accept";
```

### FieldMayBeFinal
Field `configsRefreshInterval` may be 'final'
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/context/RouterCamelContext.java`
#### Snippet
```java
    // TODO UNOMI-572: when fixing UNOMI-572 please remove the usage of the custom ScheduledExecutorService and re-introduce the Unomi Scheduler Service
    private ScheduledExecutorService scheduler;
    private Integer configsRefreshInterval = 1000;
    private ScheduledFuture<?> scheduledFuture;

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/context/RouterCamelContext.java`
#### Snippet
```java
public class RouterCamelContext implements IRouterCamelContext {

    private Logger logger = LoggerFactory.getLogger(RouterCamelContext.class.getName());
    private CamelContext camelContext;
    private UnomiStorageProcessor unomiStorageProcessor;
```

### FieldMayBeFinal
Field `updated` may be 'final'
in `rest/src/main/java/org/apache/unomi/rest/models/EventCollectorResponse.java`
#### Snippet
```java

public class EventCollectorResponse implements Serializable {
    private int updated;

    public EventCollectorResponse(int updated) {
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `extensions/weather-update/core/src/main/java/org/apache/unomi/weatherupdate/actions/WeatherUpdateAction.java`
#### Snippet
```java
    private static final String LOCATION = "location";
    private static final String MESSAGE = "message";
    private static Logger logger = LoggerFactory.getLogger(WeatherUpdateAction.class);
    private CloseableHttpClient httpClient;
    private String weatherApiKey;
```

### FieldMayBeFinal
Field `classLoader` may be 'final'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java

    private class ClassLoaderClassResolver extends DefaultClassResolver {
        private ClassLoader classLoader;

        public ClassLoaderClassResolver(ClassLoader classLoader) {
```

### FieldMayBeFinal
Field `startupDelay` may be 'final'
in `rest/src/main/java/org/apache/unomi/rest/server/RestServer.java`
#### Snippet
```java
    private long timeOfLastUpdate = System.currentTimeMillis();
    private Timer refreshTimer = null;
    private long startupDelay = 1000L;

    private static final QName UNOMI_REST_SERVER_END_POINT_NAME = new QName("http://rest.unomi.apache.org/", "UnomiRestServerEndPoint");
```

### FieldMayBeFinal
Field `exceptionMappers` may be 'final'
in `rest/src/main/java/org/apache/unomi/rest/server/RestServer.java`
#### Snippet
```java
    private Bus serverBus;
    private RestAuthenticationConfig restAuthenticationConfig;
    private List<ExceptionMapper> exceptionMappers = new ArrayList<>();
    private ConfigSharingService configSharingService;
    private SchemaService schemaService;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPRecommendationInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private String name;

    public CDPRecommendationInput(
```

### FieldMayBeFinal
Field `name` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPViewInput.java`
#### Snippet
```java
    @GraphQLNonNull
    @GraphQLField
    private String name;

    public CDPViewInput(final @GraphQLID @GraphQLNonNull @GraphQLName("name") String name) {
```

### FieldMayBeFinal
Field `client` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileIDInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private CDPClientInput client;

    public CDPProfileIDInput(
```

### FieldMayBeFinal
Field `id` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileIDInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private String id;

    @GraphQLField
```

### FieldMayBeFinal
Field `and` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPTopicFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private List<CDPTopicFilterInput> and;

    @GraphQLField
```

### FieldMayBeFinal
Field `id_equals` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPTopicFilterInput.java`
#### Snippet
```java
    @GraphQLID
    @GraphQLField
    private String id_equals;

    @GraphQLField
```

### FieldMayBeFinal
Field `name_equals` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPTopicFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private String name_equals;

    public CDPTopicFilterInput(
```

### FieldMayBeFinal
Field `or` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPTopicFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private List<CDPTopicFilterInput> or;

    @GraphQLID
```

### FieldMayBeFinal
Field `view_equals` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPTopicFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private String view_equals;

    @GraphQLField
```

### FieldMayBeFinal
Field `joinLists` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListsUpdateEventInput.java`
#### Snippet
```java

    @GraphQLField
    private List<String> joinLists;

    @GraphQLField
```

### FieldMayBeFinal
Field `leaveLists` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListsUpdateEventInput.java`
#### Snippet
```java

    @GraphQLField
    private List<String> leaveLists;

    public CDPListsUpdateEventInput(final @GraphQLName("joinLists") List<String> joinLists,
```

### FieldMayBeFinal
Field `unomi_scope` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSessionEventInput.java`
#### Snippet
```java

    @GraphQLField
    private String unomi_scope;

    public CDPSessionEventInput(
```

### FieldMayBeFinal
Field `unomi_sessionId` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSessionEventInput.java`
#### Snippet
```java

    @GraphQLField
    private String unomi_sessionId;

    @GraphQLField
```

### FieldMayBeFinal
Field `state` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSessionEventInput.java`
#### Snippet
```java

    @GraphQLField
    private CDPSessionState state;

    @GraphQLField
```

### FieldMayBeFinal
Field `expiration` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventInput.java`
#### Snippet
```java

    @GraphQLField
    private OffsetDateTime expiration;

    public CDPConsentUpdateEventInput(
```

### FieldMayBeFinal
Field `status` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventInput.java`
#### Snippet
```java

    @GraphQLField
    private String status;

    @GraphQLField
```

### FieldMayBeFinal
Field `type` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private String type;

    @GraphQLField
```

### FieldMayBeFinal
Field `lastUpdate` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventInput.java`
#### Snippet
```java

    @GraphQLField
    private OffsetDateTime lastUpdate;

    @GraphQLField
```

### FieldMayBeFinal
Field `score` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPInterestInput.java`
#### Snippet
```java

    @GraphQLField
    private Double score;

    public CDPInterestInput(final @GraphQLID @GraphQLNonNull @GraphQLName("topic") String topic,
```

### FieldMayBeFinal
Field `topic` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPInterestInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private String topic;

    @GraphQLField
```

### FieldMayBeFinal
Field `distance` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPGeoDistanceFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private Double distance;

    public CDPGeoDistanceFilterInput(
```

### FieldMayBeFinal
Field `unit` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPGeoDistanceFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private CDPGeoDistanceFilterUnit unit;

    @GraphQLField
```

### FieldMayBeFinal
Field `center` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPGeoDistanceFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private GeoPoint center;

    @GraphQLField
```

### FieldMayBeFinal
Field `joinLists_contains` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListsUpdateEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private List<String> joinLists_contains;

    @GraphQLField
```

### FieldMayBeFinal
Field `leaveLists_contains` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListsUpdateEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private List<String> leaveLists_contains;

    public CDPListsUpdateEventFilterInput(final @GraphQLName("joinLists_contains") List<String> joinLists_contains,
```

### FieldMayBeFinal
Field `maximalCount` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileEventsFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private Integer maximalCount;

    @GraphQLField
```

### FieldMayBeFinal
Field `eventFilter` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileEventsFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private CDPEventFilterInput eventFilter;

    public CDPProfileEventsFilterInput(final @GraphQLName("and") List<CDPProfileEventsFilterInput> and,
```

### FieldMayBeFinal
Field `not` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileEventsFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private CDPProfileEventsFilterInput not;

    @GraphQLField
```

### FieldMayBeFinal
Field `and` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileEventsFilterInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLName("and")
    private List<CDPProfileEventsFilterInput> and;

    @GraphQLField
```

### FieldMayBeFinal
Field `or` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileEventsFilterInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLName("or")
    private List<CDPProfileEventsFilterInput> or;

    @GraphQLField
```

### FieldMayBeFinal
Field `minimalCount` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileEventsFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private Integer minimalCount;

    @GraphQLField
```

### FieldMayBeFinal
Field `sortOrder` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPOrderByInput.java`
#### Snippet
```java

    @GraphQLField
    private CDPSortOrder sortOrder;

    public CDPOrderByInput(
```

### FieldMayBeFinal
Field `fieldName` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPOrderByInput.java`
#### Snippet
```java

    @GraphQLField
    private String fieldName;

    @GraphQLField
```

### FieldMayBeFinal
Field `id` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPClientInput.java`
#### Snippet
```java
    @GraphQLNonNull
    @GraphQLField
    private String id;

    @GraphQLField
```

### FieldMayBeFinal
Field `title` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPClientInput.java`
#### Snippet
```java

    @GraphQLField
    private String title;

    public CDPClientInput(
```

### FieldMayBeFinal
Field `name` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPNamedFilterInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private String name;

    @GraphQLField
```

### FieldMayBeFinal
Field `filter` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPNamedFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private CDPProfileFilterInput filter;

    public CDPNamedFilterInput(final @GraphQLName("name") @GraphQLNonNull String name,
```

### FieldMayBeFinal
Field `name` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPOptimizationInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private String name;

    public CDPOptimizationInput(final @GraphQLNonNull @GraphQLName("name") String name) {
```

### FieldMayBeFinal
Field `id` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPTopicInput.java`
#### Snippet
```java
    @GraphQLID
    @GraphQLField
    private String id;

    @GraphQLID
```

### FieldMayBeFinal
Field `view` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPTopicInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private String view;

    @GraphQLField
```

### FieldMayBeFinal
Field `name` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPTopicInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private String name;

    public CDPTopicInput(
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private CDPProfilePropertiesFilterInput properties;

    @GraphQLField
```

### FieldMayBeFinal
Field `lists_contains` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private List<String> lists_contains;

    @GraphQLField
```

### FieldMayBeFinal
Field `consents_contains` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private List<String> consents_contains;

    @GraphQLField
```

### FieldMayBeFinal
Field `events` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private CDPProfileEventsFilterInput events;

    public CDPProfileFilterInput(final @GraphQLName("profileIDs_contains") List<String> profileIDs_contains,
```

### FieldMayBeFinal
Field `interests` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private CDPInterestFilterInput interests;

    @GraphQLField
```

### FieldMayBeFinal
Field `profileIDs_contains` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private List<String> profileIDs_contains;

    @GraphQLField
```

### FieldMayBeFinal
Field `segments_contains` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private List<String> segments_contains;

    @GraphQLField
```

### FieldMayBeFinal
Field `lastUpdate` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaConsentInput.java`
#### Snippet
```java

    @GraphQLField
    private OffsetDateTime lastUpdate;

    @GraphQLField
```

### FieldMayBeFinal
Field `status` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaConsentInput.java`
#### Snippet
```java

    @GraphQLField
    private String status;

    @GraphQLField
```

### FieldMayBeFinal
Field `type` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaConsentInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private String type;

    @GraphQLField
```

### FieldMayBeFinal
Field `expiration` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaConsentInput.java`
#### Snippet
```java

    @GraphQLField
    private OffsetDateTime expiration;

    public CDPPersonaConsentInput(final @GraphQLNonNull @GraphQLName("type") String type,
```

### FieldMayBeFinal
Field `typeName` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventTypeInput.java`
#### Snippet
```java

    @GraphQLField
    private String typeName;

    @GraphQLField
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventTypeInput.java`
#### Snippet
```java

    @GraphQLField
    private List<CDPPropertyInput> properties;

    public CDPEventTypeInput(final @GraphQLName("id") String id,
```

### FieldMayBeFinal
Field `id` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventTypeInput.java`
#### Snippet
```java

    @GraphQLField
    private String id;

    @GraphQLField
```

### FieldMayBeFinal
Field `scope` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventTypeInput.java`
#### Snippet
```java

    @GraphQLField
    private String scope;

    @GraphQLField
```

### FieldMayBeFinal
Field `name` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/UnomiSegmentInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private String name;

    @GraphQLField
```

### FieldMayBeFinal
Field `condition` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/UnomiSegmentInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private Object condition;

    public UnomiSegmentInput(
```

### FieldMayBeFinal
Field `view` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/UnomiSegmentInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private String view;

    @GraphQLField
```

### FieldMayBeFinal
Field `id` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/UnomiSegmentInput.java`
#### Snippet
```java
    @GraphQLID
    @GraphQLField
    private String id;

    @GraphQLID
```

### FieldMayBeFinal
Field `includeBefore` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPDateFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private boolean includeBefore;

    public CDPDateFilterInput(
```

### FieldMayBeFinal
Field `after` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPDateFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private long after;

    @GraphQLField
```

### FieldMayBeFinal
Field `before` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPDateFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private long before;

    @GraphQLField
```

### FieldMayBeFinal
Field `includeAfter` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPDateFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private boolean includeAfter;

    @GraphQLField
```

### FieldMayBeFinal
Field `cdp_objectID` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private String cdp_objectID;

    @GraphQLField
```

### FieldMayBeFinal
Field `cdp_consentUpdateEvent` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventInput.java`
#### Snippet
```java

    @GraphQLField
    private CDPConsentUpdateEventInput cdp_consentUpdateEvent;

    @GraphQLField
```

### FieldMayBeFinal
Field `cdp_sessionEvent` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventInput.java`
#### Snippet
```java

    @GraphQLField
    private CDPSessionEventInput cdp_sessionEvent;

    public CDPEventInput(
```

### FieldMayBeFinal
Field `cdp_profileID` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private CDPProfileIDInput cdp_profileID;

    @GraphQLID
```

### FieldMayBeFinal
Field `id` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventInput.java`
#### Snippet
```java
    @GraphQLID
    @GraphQLField
    private String id;

    @GraphQLField
```

### FieldMayBeFinal
Field `cdp_sourceID` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventInput.java`
#### Snippet
```java

    @GraphQLField
    private String cdp_sourceID;

    @GraphQLField
```

### FieldMayBeFinal
Field `cdp_listUpdateEvent` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventInput.java`
#### Snippet
```java

    @GraphQLField
    private CDPListsUpdateEventInput cdp_listUpdateEvent;

    @GraphQLField
```

### FieldMayBeFinal
Field `id` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSourceInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private String id;

    @GraphQLField
```

### FieldMayBeFinal
Field `thirdParty` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSourceInput.java`
#### Snippet
```java

    @GraphQLField
    private Boolean thirdParty;

    public CDPSourceInput(
```

### FieldMayBeFinal
Field `or` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfilePropertiesFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private List<CDPProfilePropertiesFilterInput> or;

    public CDPProfilePropertiesFilterInput(@GraphQLName("and") List<CDPProfilePropertiesFilterInput> and,
```

### FieldMayBeFinal
Field `and` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfilePropertiesFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private List<CDPProfilePropertiesFilterInput> and;

    @GraphQLField
```

### FieldMayBeFinal
Field `score_equals` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPInterestFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private Double score_equals;

    @GraphQLField
```

### FieldMayBeFinal
Field `or` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPInterestFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private List<CDPInterestFilterInput> or;

    @GraphQLField
```

### FieldMayBeFinal
Field `and` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPInterestFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private List<CDPInterestFilterInput> and;

    @GraphQLField
```

### FieldMayBeFinal
Field `score_gt` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPInterestFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private Double score_gt;

    @GraphQLField
```

### FieldMayBeFinal
Field `score_lte` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPInterestFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private Double score_lte;

    @GraphQLField
```

### FieldMayBeFinal
Field `score_lt` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPInterestFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private Double score_lt;

    @GraphQLField
```

### FieldMayBeFinal
Field `topic_equals` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPInterestFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private String topic_equals;

    @GraphQLField
```

### FieldMayBeFinal
Field `score_gte` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPInterestFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private Double score_gte;

    public CDPInterestFilterInput(final @GraphQLName("and") List<CDPInterestFilterInput> and,
```

### FieldMayBeFinal
Field `or` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private List<CDPListFilterInput> or;

    @GraphQLID
```

### FieldMayBeFinal
Field `name_equals` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private String name_equals;

    public CDPListFilterInput(
```

### FieldMayBeFinal
Field `and` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private List<CDPListFilterInput> and;

    @GraphQLField
```

### FieldMayBeFinal
Field `view_equals` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListFilterInput.java`
#### Snippet
```java
    @GraphQLID
    @GraphQLField
    private String view_equals;

    @GraphQLField
```

### FieldMayBeFinal
Field `state_equals` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSessionEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private CDPSessionState state_equals;

    @GraphQLField
```

### FieldMayBeFinal
Field `unomi_scope_equals` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSessionEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private String unomi_scope_equals;

    public CDPSessionEventFilterInput(
```

### FieldMayBeFinal
Field `unomi_sessionId_equals` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSessionEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private String unomi_sessionId_equals;

    @GraphQLField
```

### FieldMayBeFinal
Field `status_equals` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private String status_equals;

    @GraphQLField
```

### FieldMayBeFinal
Field `expiration_lt` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private OffsetDateTime expiration_lt;

    @GraphQLField
```

### FieldMayBeFinal
Field `lastUpdate_lt` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private OffsetDateTime lastUpdate_lt;

    @GraphQLField
```

### FieldMayBeFinal
Field `lastUpdate_lte` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private OffsetDateTime lastUpdate_lte;

    @GraphQLField
```

### FieldMayBeFinal
Field `expiration_lte` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private OffsetDateTime expiration_lte;

    @GraphQLField
```

### FieldMayBeFinal
Field `expiration_gte` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private OffsetDateTime expiration_gte;

    public CDPConsentUpdateEventFilterInput(
```

### FieldMayBeFinal
Field `expiration_equals` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private OffsetDateTime expiration_equals;

    @GraphQLField
```

### FieldMayBeFinal
Field `lastUpdate_equals` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private OffsetDateTime lastUpdate_equals;

    @GraphQLField
```

### FieldMayBeFinal
Field `expiration_gt` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private OffsetDateTime expiration_gt;

    @GraphQLField
```

### FieldMayBeFinal
Field `lastUpdate_gt` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private OffsetDateTime lastUpdate_gt;

    @GraphQLField
```

### FieldMayBeFinal
Field `type_equals` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private String type_equals;

    @GraphQLField
```

### FieldMayBeFinal
Field `lastUpdate_gte` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private OffsetDateTime lastUpdate_gte;

    @GraphQLField
```

### FieldMayBeFinal
Field `profiles` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSegmentInput.java`
#### Snippet
```java

    @GraphQLField
    private CDPProfileFilterInput profiles;

    public CDPSegmentInput(
```

### FieldMayBeFinal
Field `name` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSegmentInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private String name;

    @GraphQLField
```

### FieldMayBeFinal
Field `id` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSegmentInput.java`
#### Snippet
```java
    @GraphQLID
    @GraphQLField
    private String id;

    @GraphQLID
```

### FieldMayBeFinal
Field `view` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSegmentInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private String view;

    @GraphQLField
```

### FieldMayBeFinal
Field `setPropertyTypeInput` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPropertyInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLName("set")
    private CDPSetPropertyInput setPropertyTypeInput;

    @GraphQLField
```

### FieldMayBeFinal
Field `floatPropertyTypeInput` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPropertyInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLName("float")
    private CDPFloatPropertyInput floatPropertyTypeInput;

    @GraphQLField
```

### FieldMayBeFinal
Field `integerPropertyTypeInput` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPropertyInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLName("int")
    private CDPIntPropertyInput integerPropertyTypeInput;

    @GraphQLField
```

### FieldMayBeFinal
Field `geoPointPropertyTypeInput` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPropertyInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLName("geopoint")
    private CDPGeoPointPropertyInput geoPointPropertyTypeInput;

    @GraphQLField
```

### FieldMayBeFinal
Field `stringPropertyTypeInput` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPropertyInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLName("string")
    private CDPStringPropertyInput stringPropertyTypeInput;

    @GraphQLField
```

### FieldMayBeFinal
Field `jsonPropertyTypeInput` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPropertyInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLName("json")
    private CDPJsonPropertyInput jsonPropertyTypeInput;

    public CDPPropertyInput(
```

### FieldMayBeFinal
Field `booleanPropertyTypeInput` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPropertyInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLName("boolean")
    private CDPBooleanPropertyInput booleanPropertyTypeInput;

    @GraphQLField
```

### FieldMayBeFinal
Field `datePropertyTypeInput` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPropertyInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLName("date")
    private CDPDatePropertyInput datePropertyTypeInput;

    @GraphQLField
```

### FieldMayBeFinal
Field `longPropertyTypeInput` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPropertyInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLName("long")
    private CDPLongPropertyInput longPropertyTypeInput;

    @GraphQLField
```

### FieldMayBeFinal
Field `identifierPropertyTypeInput` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPropertyInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLName("identifier")
    private CDPIdentifierPropertyInput identifierPropertyTypeInput;

    @GraphQLField
```

### FieldMayBeFinal
Field `name` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private String name;

    public CDPListInput(
```

### FieldMayBeFinal
Field `view` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private String view;

    @GraphQLField
```

### FieldMayBeFinal
Field `id` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListInput.java`
#### Snippet
```java
    @GraphQLID
    @GraphQLField
    private String id;

    @GraphQLID
```

### FieldMayBeFinal
Field `cdp_consents` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaInput.java`
#### Snippet
```java

    @GraphQLField
    private List<CDPPersonaConsentInput> cdp_consents;

    // # fields will be added here according to registered profile properties
```

### FieldMayBeFinal
Field `cdp_segments` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaInput.java`
#### Snippet
```java

    @GraphQLField
    private Set<String> cdp_segments;

    @GraphQLField
```

### FieldMayBeFinal
Field `cdp_view` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private String cdp_view;

    @GraphQLField
```

### FieldMayBeFinal
Field `cdp_interests` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaInput.java`
#### Snippet
```java

    @GraphQLField
    private List<CDPInterestInput> cdp_interests;

    @GraphQLField
```

### FieldMayBeFinal
Field `id` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaInput.java`
#### Snippet
```java
    @GraphQLID
    @GraphQLField
    private String id;

    @GraphQLField
```

### FieldMayBeFinal
Field `cdp_profileIDs` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaInput.java`
#### Snippet
```java

    @GraphQLField
    private List<CDPProfileIDInput> cdp_profileIDs;

    @GraphQLField
```

### FieldMayBeFinal
Field `cdp_name` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLNonNull
    private String cdp_name;

    @GraphQLField
```

### FieldMayBeFinal
Field `viewRegexp` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSegmentFilterInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLName("view_regexp")
    private String viewRegexp;

    @GraphQLField
```

### FieldMayBeFinal
Field `orFilters` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSegmentFilterInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLName("or")
    private List<CDPSegmentFilterInput> orFilters;

    @GraphQLField
```

### FieldMayBeFinal
Field `nameEquals` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSegmentFilterInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLName("name_equals")
    private String nameEquals;

    @GraphQLField
```

### FieldMayBeFinal
Field `andFilters` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSegmentFilterInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLName("and")
    private List<CDPSegmentFilterInput> andFilters;

    @GraphQLField
```

### FieldMayBeFinal
Field `viewEquals` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSegmentFilterInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLName("view_equals")
    private String viewEquals;

    @GraphQLField
```

### FieldMayBeFinal
Field `nameRegexp` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSegmentFilterInput.java`
#### Snippet
```java
    @GraphQLField
    @GraphQLName("name_regexp")
    private String nameRegexp;

    public CDPSegmentFilterInput(
```

### FieldMayBeFinal
Field `defaultValue` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPBooleanPropertyInput.java`
#### Snippet
```java
public class CDPBooleanPropertyInput extends BaseCDPPropertyInput {

    private Boolean defaultValue;

    public CDPBooleanPropertyInput(@GraphQLName("name") String name,
```

### FieldMayBeFinal
Field `maxValue` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPLongPropertyInput.java`
#### Snippet
```java

    private Long minValue;
    private Long maxValue;
    private Long defaultValue;

```

### FieldMayBeFinal
Field `defaultValue` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPLongPropertyInput.java`
#### Snippet
```java
    private Long minValue;
    private Long maxValue;
    private Long defaultValue;

    public CDPLongPropertyInput(@GraphQLName("name") String name,
```

### FieldMayBeFinal
Field `minValue` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPLongPropertyInput.java`
#### Snippet
```java
public class CDPLongPropertyInput extends BaseCDPPropertyInput {

    private Long minValue;
    private Long maxValue;
    private Long defaultValue;
```

### FieldMayBeFinal
Field `regexp` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPStringPropertyInput.java`
#### Snippet
```java
public class CDPStringPropertyInput extends BaseCDPPropertyInput {

    private String regexp;
    private String defaultValue;

```

### FieldMayBeFinal
Field `defaultValue` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPStringPropertyInput.java`
#### Snippet
```java

    private String regexp;
    private String defaultValue;

    public CDPStringPropertyInput(@GraphQLName("name") String name,
```

### FieldMayBeFinal
Field `defaultValue` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPJsonPropertyInput.java`
#### Snippet
```java
public class CDPJsonPropertyInput extends BaseCDPPropertyInput {

    private Object defaultValue;

    public CDPJsonPropertyInput(@GraphQLName("name") String name,
```

### FieldMayBeFinal
Field `defaultValue` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPDatePropertyInput.java`
#### Snippet
```java
public class CDPDatePropertyInput extends BaseCDPPropertyInput {

    private String defaultValue;

    public CDPDatePropertyInput(final @GraphQLName("name") String name,
```

### FieldMayBeFinal
Field `minValue` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPFloatPropertyInput.java`
#### Snippet
```java
public class CDPFloatPropertyInput extends BaseCDPPropertyInput {

    private Double minValue;
    private Double maxValue;
    private Double defaultValue;
```

### FieldMayBeFinal
Field `maxValue` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPFloatPropertyInput.java`
#### Snippet
```java

    private Double minValue;
    private Double maxValue;
    private Double defaultValue;

```

### FieldMayBeFinal
Field `defaultValue` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPFloatPropertyInput.java`
#### Snippet
```java
    private Double minValue;
    private Double maxValue;
    private Double defaultValue;

    public CDPFloatPropertyInput(@GraphQLName("name") String name,
```

### FieldMayBeFinal
Field `defaultValue` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPGeoPointPropertyInput.java`
#### Snippet
```java
public class CDPGeoPointPropertyInput extends BaseCDPPropertyInput {

    private GeoPoint defaultValue;

    public CDPGeoPointPropertyInput(@GraphQLName("name") String name,
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPSetPropertyInput.java`
#### Snippet
```java
public class CDPSetPropertyInput extends BaseCDPPropertyInput {

    private List<CDPPropertyInput> properties;

    public CDPSetPropertyInput(@GraphQLName("name") String name,
```

### FieldMayBeFinal
Field `id_equals` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private String id_equals;

    @GraphQLField
```

### FieldMayBeFinal
Field `cdp_sourceID_equals` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private String cdp_sourceID_equals;

    @GraphQLField
```

### FieldMayBeFinal
Field `cdp_timestamp_lt` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private OffsetDateTime cdp_timestamp_lt;

    @GraphQLField
```

### FieldMayBeFinal
Field `cdp_timestamp_gt` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private OffsetDateTime cdp_timestamp_gt;

    @GraphQLField
```

### FieldMayBeFinal
Field `cdp_consentUpdateEvent` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private CDPConsentUpdateEventFilterInput cdp_consentUpdateEvent;

    @GraphQLField
```

### FieldMayBeFinal
Field `cdp_timestamp_gte` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private OffsetDateTime cdp_timestamp_gte;

    @GraphQLField
```

### FieldMayBeFinal
Field `and` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private List<CDPEventFilterInput> and;

    @GraphQLField
```

### FieldMayBeFinal
Field `cdp_sessionEvent` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private CDPSessionEventFilterInput cdp_sessionEvent;

    @GraphQLField
```

### FieldMayBeFinal
Field `or` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private List<CDPEventFilterInput> or;

    @GraphQLField
```

### FieldMayBeFinal
Field `cdp_timestamp_lte` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private OffsetDateTime cdp_timestamp_lte;

    @GraphQLField
```

### FieldMayBeFinal
Field `cdp_timestamp_equals` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private OffsetDateTime cdp_timestamp_equals;

    @GraphQLField
```

### FieldMayBeFinal
Field `cdp_profileID_equals` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private String cdp_profileID_equals;

    @GraphQLField
```

### FieldMayBeFinal
Field `cdp_listsUpdateEvent` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private CDPListsUpdateEventFilterInput cdp_listsUpdateEvent;

    @GraphQLField
```

### FieldMayBeFinal
Field `cdp_clientID_equals` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private String cdp_clientID_equals;

    @GraphQLField
```

### FieldMayBeFinal
Field `cdp_profileUpdateEvent` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private CDPProfileUpdateEventFilterInput cdp_profileUpdateEvent;

    public CDPEventFilterInput(
```

### FieldMayBeFinal
Field `center` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPGeoDistanceFilter.java`
#### Snippet
```java

    @GraphQLField
    private GeoPoint center;

    @GraphQLField
```

### FieldMayBeFinal
Field `distance` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPGeoDistanceFilter.java`
#### Snippet
```java

    @GraphQLField
    private Double distance;

    public CDPGeoDistanceFilter(GeoPoint center, CDPGeoDistanceFilterUnit unit, Double distance) {
```

### FieldMayBeFinal
Field `unit` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPGeoDistanceFilter.java`
#### Snippet
```java

    @GraphQLField
    private CDPGeoDistanceFilterUnit unit;

    @GraphQLField
```

### FieldMayBeFinal
Field `thirdParty` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPSource.java`
#### Snippet
```java
    private String id;

    private Boolean thirdParty;

    public CDPSource(String id) {
```

### FieldMayBeFinal
Field `id` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPSource.java`
#### Snippet
```java
public class CDPSource {

    private String id;

    private Boolean thirdParty;
```

### FieldMayBeFinal
Field `regexp` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPIdentifierPropertyInput.java`
#### Snippet
```java
public class CDPIdentifierPropertyInput extends BaseCDPPropertyInput {

    private String regexp;
    private String defaultValue;

```

### FieldMayBeFinal
Field `defaultValue` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPIdentifierPropertyInput.java`
#### Snippet
```java

    private String regexp;
    private String defaultValue;

    public CDPIdentifierPropertyInput(@GraphQLName("name") String name,
```

### FieldMayBeFinal
Field `defaultValue` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPIntPropertyInput.java`
#### Snippet
```java
    private Integer minValue;
    private Integer maxValue;
    private Integer defaultValue;

    public CDPIntPropertyInput(@GraphQLName("name") String name,
```

### FieldMayBeFinal
Field `maxValue` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPIntPropertyInput.java`
#### Snippet
```java

    private Integer minValue;
    private Integer maxValue;
    private Integer defaultValue;

```

### FieldMayBeFinal
Field `minValue` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPIntPropertyInput.java`
#### Snippet
```java
public class CDPIntPropertyInput extends BaseCDPPropertyInput {

    private Integer minValue;
    private Integer maxValue;
    private Integer defaultValue;
```

### FieldMayBeFinal
Field `executionTimeMillis` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPFilterMatch.java`
#### Snippet
```java

    @GraphQLField
    private Long executionTimeMillis;

    public CDPFilterMatch(String name, Boolean matched, Long executionTimeMillis) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPFilterMatch.java`
#### Snippet
```java

    @GraphQLField
    private String name;

    @GraphQLField
```

### FieldMayBeFinal
Field `matched` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPFilterMatch.java`
#### Snippet
```java

    @GraphQLField
    private Boolean matched;

    @GraphQLField
```

### FieldMayBeFinal
Field `tags` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/BaseCDPPropertyInput.java`
#### Snippet
```java
    private Integer minOccurrences;
    private Integer maxOccurrences;
    private List<String> tags;

    public BaseCDPPropertyInput(@GraphQLName("name") String name,
```

### FieldMayBeFinal
Field `maxOccurrences` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/BaseCDPPropertyInput.java`
#### Snippet
```java
    private String name;
    private Integer minOccurrences;
    private Integer maxOccurrences;
    private List<String> tags;

```

### FieldMayBeFinal
Field `name` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/BaseCDPPropertyInput.java`
#### Snippet
```java
public abstract class BaseCDPPropertyInput {

    private String name;
    private Integer minOccurrences;
    private Integer maxOccurrences;
```

### FieldMayBeFinal
Field `minOccurrences` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/BaseCDPPropertyInput.java`
#### Snippet
```java

    private String name;
    private Integer minOccurrences;
    private Integer maxOccurrences;
    private List<String> tags;
```

### FieldMayBeFinal
Field `event` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPObject.java`
#### Snippet
```java
public class CDPObject {

    private Event event;

    public CDPObject(Event event) {
```

### FieldMayBeFinal
Field `totalCount` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPTopicConnection.java`
#### Snippet
```java
    public static final String TYPE_NAME = "CDP_TopicConnection";

    private Long totalCount;

    private List<CDPTopicEdge> edges;
```

### FieldMayBeFinal
Field `token` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPConsent.java`
#### Snippet
```java
public class CDPConsent {

    private String token;
    private Consent consent;

```

### FieldMayBeFinal
Field `consent` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPConsent.java`
#### Snippet
```java

    private String token;
    private Consent consent;

    public CDPConsent(String token, Consent consent) {
```

### FieldMayBeFinal
Field `edges` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPTopicConnection.java`
#### Snippet
```java
    private Long totalCount;

    private List<CDPTopicEdge> edges;

    private CDPPageInfo pageInfo;
```

### FieldMayBeFinal
Field `pageInfo` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPTopicConnection.java`
#### Snippet
```java
    private List<CDPTopicEdge> edges;

    private CDPPageInfo pageInfo;

    public CDPTopicConnection() {
```

### FieldMayBeFinal
Field `event` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPEventEdge.java`
#### Snippet
```java
public class CDPEventEdge {

    private Event event;

    public CDPEventEdge(Event event) {
```

### FieldMayBeFinal
Field `segment` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPSegment.java`
#### Snippet
```java
    public static final String TYPE_NAME = "CDP_Segment";

    private Segment segment;

    public CDPSegment(Segment segment) {
```

### FieldMayBeFinal
Field `type` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPropertyEdge.java`
#### Snippet
```java
public class CDPPropertyEdge {

    private PropertyType type;

    public CDPPropertyEdge(final PropertyType type) {
```

### FieldMayBeFinal
Field `pageInfo` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfileConnection.java`
#### Snippet
```java
    private List<CDPProfileEdge> edges;

    private CDPPageInfo pageInfo;

    public CDPProfileConnection() {
```

### FieldMayBeFinal
Field `totalCount` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfileConnection.java`
#### Snippet
```java
public class CDPProfileConnection {
    @GraphQLField
    private Long totalCount;

    private List<CDPProfileEdge> edges;
```

### FieldMayBeFinal
Field `edges` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfileConnection.java`
#### Snippet
```java
    private Long totalCount;

    private List<CDPProfileEdge> edges;

    private CDPPageInfo pageInfo;
```

### FieldMayBeFinal
Field `persona` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPersona.java`
#### Snippet
```java
    public static final String TYPE_NAME = "CDP_Persona";

    private Persona persona;

    public CDPPersona(Persona persona) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPView.java`
#### Snippet
```java
public class CDPView {

    private String name;

    public CDPView(final String name) {
```

### FieldMayBeFinal
Field `node` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPSegmentEdge.java`
#### Snippet
```java

    @GraphQLField
    private CDPSegment node;

    @GraphQLNonNull
```

### FieldMayBeFinal
Field `cursor` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPSegmentEdge.java`
#### Snippet
```java
    @GraphQLNonNull
    @GraphQLField
    private String cursor;

    public CDPSegmentEdge(CDPSegment node, @GraphQLNonNull String cursor) {
```

### FieldMayBeFinal
Field `userList` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPList.java`
#### Snippet
```java
    public static final String TYPE_NAME = "CDP_List";

    private UserList userList;

    public CDPList(final UserList userList) {
```

### FieldMayBeFinal
Field `score` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPInterest.java`
#### Snippet
```java
    private String topic;

    private Double score;

    public CDPInterest(@GraphQLID final String topic, final Double score) {
```

### FieldMayBeFinal
Field `topic` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPInterest.java`
#### Snippet
```java
public class CDPInterest {

    private String topic;

    private Double score;
```

### FieldMayBeFinal
Field `pageInfo` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPSegmentConnection.java`
#### Snippet
```java

    @GraphQLField
    private CDPPageInfo pageInfo;

    public CDPSegmentConnection() {
```

### FieldMayBeFinal
Field `edges` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPSegmentConnection.java`
#### Snippet
```java

    @GraphQLField
    private List<CDPSegmentEdge> edges;

    @GraphQLField
```

### FieldMayBeFinal
Field `totalCount` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPSegmentConnection.java`
#### Snippet
```java
public class CDPSegmentConnection {
    @GraphQLField
    private Long totalCount;

    @GraphQLField
```

### FieldMayBeFinal
Field `totalCount` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPEventConnection.java`
#### Snippet
```java
public class CDPEventConnection {
    @GraphQLField
    private Long totalCount;

    @GraphQLField
```

### FieldMayBeFinal
Field `edges` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPEventConnection.java`
#### Snippet
```java

    @GraphQLField
    private List<CDPEventEdge> edges;

    @GraphQLField
```

### FieldMayBeFinal
Field `pageInfo` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPEventConnection.java`
#### Snippet
```java

    @GraphQLField
    private CDPPageInfo pageInfo;

    public CDPEventConnection() {
```

### FieldMayBeFinal
Field `edges` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPropertyConnection.java`
#### Snippet
```java

    @GraphQLField
    private List<CDPPropertyEdge> edges;

    @GraphQLField
```

### FieldMayBeFinal
Field `pageInfo` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPropertyConnection.java`
#### Snippet
```java

    @GraphQLField
    private CDPPageInfo pageInfo;

    public CDPPropertyConnection() {
```

### FieldMayBeFinal
Field `totalCount` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPropertyConnection.java`
#### Snippet
```java
public class CDPPropertyConnection {
    @GraphQLField
    private Long totalCount;

    @GraphQLField
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/utils/EventBuilder.java`
#### Snippet
```java
    private Map<String, Object> propertiesToUpdate;
    private List<String> propertiesToDelete;
    private Map<String, Object> properties = new HashMap<>();
    private boolean persistent;

```

### FieldMayBeFinal
Field `parameters` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/utils/ConditionBuilder.java`
#### Snippet
```java
    private Object propertyValueInteger;

    private Map<String, Object> parameters = new HashMap<>();

    private ConditionBuilder(final ConditionType conditionType) {
```

### FieldMayBeFinal
Field `profiles` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/CDPProfileInterfaceRegister.java`
#### Snippet
```java
public class CDPProfileInterfaceRegister {

    private ConcurrentHashMap<String, Class<? extends CDPProfileInterface>> profiles;

    public CDPProfileInterfaceRegister() {
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/CDPPropertyInterfaceRegister.java`
#### Snippet
```java
public class CDPPropertyInterfaceRegister {

    private ConcurrentHashMap<String, Class<? extends CDPPropertyInterface>> properties;

    public CDPPropertyInterfaceRegister() {
```

### FieldMayBeFinal
Field `events` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/CDPEventInterfaceRegister.java`
#### Snippet
```java
public class CDPEventInterfaceRegister {

    private ConcurrentHashMap<String, Class<? extends CDPEventInterface>> events;

    public CDPEventInterfaceRegister() {
```

### FieldMayBeFinal
Field `fieldVisibilityProviders` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaUpdater.java`
#### Snippet
```java
    private final List<GraphQLTypeFunctionProvider> typeFunctionProviders = new CopyOnWriteArrayList<>();

    private List<GraphQLFieldVisibilityProvider> fieldVisibilityProviders = new CopyOnWriteArrayList<>();

    private GraphQLCodeRegistryProvider codeRegistryProvider;
```

### FieldMayBeFinal
Field `type` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/websocket/GraphQLMessage.java`
#### Snippet
```java
    private String id;

    private String type;

    private Map<String, Object> payload;
```

### FieldMayBeFinal
Field `payload` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/websocket/GraphQLMessage.java`
#### Snippet
```java
    private String type;

    private Map<String, Object> payload;

    public static final String TYPE_CONNECTION_INIT = "connection_init"; // client->server
```

### FieldMayBeFinal
Field `payload` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/websocket/GraphQLMessage.java`
#### Snippet
```java
        private String id;
        private String type;
        private Map<String, Object> payload = new HashMap<>();

        public Builder(String id) {
```

### FieldMayBeFinal
Field `id` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/websocket/GraphQLMessage.java`
#### Snippet
```java
public class GraphQLMessage {

    private String id;

    private String type;
```

### FieldMayBeFinal
Field `id` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/websocket/GraphQLMessage.java`
#### Snippet
```java
    public static class Builder {

        private String id;
        private String type;
        private Map<String, Object> payload = new HashMap<>();
```

### FieldMayBeFinal
Field `serviceManager` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/websocket/SubscriptionWebSocket.java`
#### Snippet
```java
    private GraphQL graphQL;

    private ServiceManager serviceManager;

    private Map<String, ExecutionResultSubscriber> subscriptions = new HashMap<String, ExecutionResultSubscriber>();
```

### FieldMayBeFinal
Field `subscriptions` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/websocket/SubscriptionWebSocket.java`
#### Snippet
```java
    private ServiceManager serviceManager;

    private Map<String, ExecutionResultSubscriber> subscriptions = new HashMap<String, ExecutionResultSubscriber>();

    public SubscriptionWebSocket(GraphQL graphQL, ServiceManager serviceManager) {
```

### FieldMayBeFinal
Field `graphQL` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/websocket/SubscriptionWebSocket.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(SubscriptionWebSocket.class);

    private GraphQL graphQL;

    private ServiceManager serviceManager;
```

### FieldMayBeFinal
Field `profileService` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/CreateOrUpdateProfilePropertiesCommand.java`
#### Snippet
```java
    private final List<CDPPropertyInput> properties;

    private ProfileService profileService;

    private CreateOrUpdateProfilePropertiesCommand(final Builder builder) {
```

### FieldMayBeFinal
Field `last` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/ConnectionParams.java`
#### Snippet
```java

    private Integer first;
    private Integer last;
    private String after;
    private String before;
```

### FieldMayBeFinal
Field `first` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/ConnectionParams.java`
#### Snippet
```java
    public static final int DEFAULT_PAGE_SIZE = 10;

    private Integer first;
    private Integer last;
    private String after;
```

### FieldMayBeFinal
Field `after` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/ConnectionParams.java`
#### Snippet
```java
    private Integer first;
    private Integer last;
    private String after;
    private String before;
    private String text;
```

### FieldMayBeFinal
Field `text` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/ConnectionParams.java`
#### Snippet
```java
    private String after;
    private String before;
    private String text;

    private ConnectionParams(final Builder builder) {
```

### FieldMayBeFinal
Field `before` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/ConnectionParams.java`
#### Snippet
```java
    private Integer last;
    private String after;
    private String before;
    private String text;

```

### FieldMayBeFinal
Field `eventPublisher` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/event/EventListenerSubscriptionFetcher.java`
#### Snippet
```java
public class EventListenerSubscriptionFetcher extends BaseDataFetcher<Publisher<CDPEventInterface>> {

    private UnomiEventPublisher eventPublisher;

    public EventListenerSubscriptionFetcher(UnomiEventPublisher eventPublisher) {
```

### FieldMayBeFinal
Field `filterInput` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/profile/ProfileAllEventsConnectionDataFetcher.java`
#### Snippet
```java

    private final Profile profile;
    private CDPEventFilterInput filterInput;

    public ProfileAllEventsConnectionDataFetcher(Profile profile, CDPEventFilterInput filterInput) {
```

### FieldMayBeFinal
Field `listeners` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/event/UnomiEventPublisher.java`
#### Snippet
```java
    private ServiceRegistration<?> eventServiceRegistration;

    private List<EventPublisherListener> listeners = new CopyOnWriteArrayList<>();

    private CDPEventInterfaceRegister eventRegister;
```

### FieldMayBeFinal
Field `jsonTypes` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaProvider.java`
#### Snippet
```java

    public class JSONTypeDefinitionType implements DefinitionType {
        private List<JSONType> jsonTypes;
        private JSONType firstNonNullType;
        private String name;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaProvider.java`
#### Snippet
```java
        private List<JSONType> jsonTypes;
        private JSONType firstNonNullType;
        private String name;

        public JSONTypeDefinitionType(String name, List<JSONType> jsonTypes) {
```

### FieldMayBeFinal
Field `propertyType` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaProvider.java`
#### Snippet
```java
    public class PropertyTypeDefinitionType implements DefinitionType {

        private PropertyType propertyType;

        public PropertyTypeDefinitionType(PropertyType propertyType) {
```

### FieldMayBeFinal
Field `additionalTypes` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaProvider.java`
#### Snippet
```java
    private GraphQLAnnotations graphQLAnnotations;

    private Set<Class<?>> additionalTypes = new HashSet<>();

    public interface DefinitionType {
```

### FieldMayBeFinal
Field `conditionTypesMap` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/factories/ConditionFactory.java`
#### Snippet
```java
    protected String conditionTypeId;

    private Map<String, ConditionType> conditionTypesMap;

    public ConditionFactory(final String conditionTypeId, final DataFetchingEnvironment environment) {
```

### FieldMayBeFinal
Field `rootConditionIdPerFilterType` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentConditionParser.java`
#### Snippet
```java
    private Map<FilterType, List<ConditionDecorator>> groupedConditionsByFilterType = new LinkedHashMap<>();

    private Map<FilterType, String> rootConditionIdPerFilterType = new LinkedHashMap<>();

    public SegmentConditionParser(final Condition segmentCondition, final DataFetchingEnvironment environment) {
```

### FieldMayBeFinal
Field `groupedConditionsByFilterType` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentConditionParser.java`
#### Snippet
```java
    private Map<String, ConditionDecorator> conditionsContext = new LinkedHashMap<>();

    private Map<FilterType, List<ConditionDecorator>> groupedConditionsByFilterType = new LinkedHashMap<>();

    private Map<FilterType, String> rootConditionIdPerFilterType = new LinkedHashMap<>();
```

### FieldMayBeFinal
Field `conditionsContext` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentConditionParser.java`
#### Snippet
```java
    private final DataFetchingEnvironment environment;

    private Map<String, ConditionDecorator> conditionsContext = new LinkedHashMap<>();

    private Map<FilterType, List<ConditionDecorator>> groupedConditionsByFilterType = new LinkedHashMap<>();
```

### FieldMayBeFinal
Field `value` may be 'final'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentConditionParser.java`
#### Snippet
```java
        UNKNOWN("unknown");

        private String value;

        FilterType(String value) {
```

### FieldMayBeFinal
Field `cdpProfile` may be 'final'
in `samples/graphql-providers/src/main/java/org/apache/unomi/graphql/providers/sample/CDPProfileExtension.java`
#### Snippet
```java
public class CDPProfileExtension {

    private CDPProfile cdpProfile;

    public CDPProfileExtension(CDPProfile cdpProfile) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `samples/graphql-providers/src/main/java/org/apache/unomi/graphql/providers/sample/MyEventInput.java`
#### Snippet
```java

    @GraphQLField
    private String name;

    public MyEventInput(final @GraphQLName("name") String name) {
```

### FieldMayBeFinal
Field `name_equals` may be 'final'
in `samples/graphql-providers/src/main/java/org/apache/unomi/graphql/providers/sample/MyEventFilterInput.java`
#### Snippet
```java

    @GraphQLField
    private String name_equals;

    public MyEventFilterInput(@GraphQLName("name_equals") String name_equals) {
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `extensions/router/router-api/src/main/java/org/apache/unomi/router/api/ImportExportConfiguration.java`
#### Snippet
```java
    private String description;
    private String configType;
    private Map<String, Object> properties = new HashMap<>();
    private String columnSeparator = ",";
    private String lineSeparator = "\n";
```

### FieldMayBeFinal
Field `scopeService` may be 'final'
in `extensions/json-schema/services/src/main/java/org/apache/unomi/schema/keyword/ScopeValidator.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(ScopeValidator.class);

    private ScopeService scopeService;

    public ScopeValidator(String schemaPath, JsonNode schemaNode, JsonSchema parentSchema, ValidationContext validationContext, ScopeService scopeService) {
```

### FieldMayBeFinal
Field `bundleContext` may be 'final'
in `extensions/groovy-actions/services/src/main/java/org/apache/unomi/groovy/actions/GroovyBundleResourceConnector.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(GroovyBundleResourceConnector.class.getName());

    private BundleContext bundleContext;

    public GroovyBundleResourceConnector(BundleContext bundleContext) {
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `extensions/unomi-mailchimp/actions/src/main/java/org/apache/unomi/mailchimp/actions/RemoveVisitorFromMailChimpListAction.java`
#### Snippet
```java

public class RemoveVisitorFromMailChimpListAction implements ActionExecutor {
    private static Logger logger = LoggerFactory.getLogger(RemoveVisitorFromMailChimpListAction.class);
    private MailChimpService mailChimpService;

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `extensions/unomi-mailchimp/actions/src/main/java/org/apache/unomi/mailchimp/actions/AddVisitorToMailChimpListAction.java`
#### Snippet
```java

public class AddVisitorToMailChimpListAction implements ActionExecutor {
    private static Logger logger = LoggerFactory.getLogger(AddVisitorToMailChimpListAction.class);
    private MailChimpService mailChimpService;

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `extensions/unomi-mailchimp/actions/src/main/java/org/apache/unomi/mailchimp/actions/UnsubscribeVisitorFromMailChimpListAction.java`
#### Snippet
```java

public class UnsubscribeVisitorFromMailChimpListAction implements ActionExecutor {
    private static Logger logger = LoggerFactory.getLogger(UnsubscribeVisitorFromMailChimpListAction.class);
    private MailChimpService mailChimpService;

```

### FieldMayBeFinal
Field `classes` may be 'final'
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/ItemDeserializer.java`
#### Snippet
```java

    private static final long serialVersionUID = -7040054009670771266L;
    private Map<String,Class<? extends Item>> classes = new HashMap<>();

    public ItemDeserializer() {
```

### FieldMayBeFinal
Field `field` may be 'final'
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/aggregate/BaseAggregate.java`
#### Snippet
```java

public abstract class BaseAggregate {
    private String field;

    public BaseAggregate(String field) {
```

### FieldMayBeFinal
Field `interval` may be 'final'
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/aggregate/DateAggregate.java`
#### Snippet
```java
    public static final DateAggregate YEAR = new DateAggregate("1y");
    private static final String DEFAULT_INTERVAL = "1M";
    private String interval;
    private String format;
    public DateAggregate(String field) {
```

### FieldMayBeFinal
Field `propertyTypedObjectDeserializer` may be 'final'
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/CustomObjectMapper.java`
#### Snippet
```java
    
    private Map<String,Class<? extends Item>> builtinItemTypeClasses = new HashMap<>();
    private PropertyTypedObjectDeserializer propertyTypedObjectDeserializer;
    private ItemDeserializer itemDeserializer;

```

### FieldMayBeFinal
Field `itemDeserializer` may be 'final'
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/CustomObjectMapper.java`
#### Snippet
```java
    private Map<String,Class<? extends Item>> builtinItemTypeClasses = new HashMap<>();
    private PropertyTypedObjectDeserializer propertyTypedObjectDeserializer;
    private ItemDeserializer itemDeserializer;

    public CustomObjectMapper() {
```

### FieldMayBeFinal
Field `fieldValuesToMatch` may be 'final'
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyTypedObjectDeserializer.java`
#### Snippet
```java
            new LinkedHashMap<String, Class<? extends Object>>();

    private Map<String,Set<String>> fieldValuesToMatch = new LinkedHashMap<String,Set<String>>();

    public PropertyTypedObjectDeserializer(JavaType listType, JavaType mapType) {
```

### FieldMayBeFinal
Field `registry` may be 'final'
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyTypedObjectDeserializer.java`
#### Snippet
```java
    private static final long serialVersionUID = -2561171359946902967L;

    private Map<String, Class<? extends Object>> registry =
            new LinkedHashMap<String, Class<? extends Object>>();

```

### FieldMayBeFinal
Field `childFirstURLClassLoader` may be 'final'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ChildFirstClassLoader.java`
#### Snippet
```java
public class ChildFirstClassLoader extends ClassLoader {

    private ChildFirstURLClassLoader childFirstURLClassLoader;

    private static class ChildFirstURLClassLoader extends URLClassLoader {
```

### FieldMayBeFinal
Field `parentClassLoader` may be 'final'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ChildFirstClassLoader.java`
#### Snippet
```java

    private static class ChildFirstURLClassLoader extends URLClassLoader {
        private ClassLoader parentClassLoader;

        public ChildFirstURLClassLoader(URL[] urls, ClassLoader parentClassLoader) {
```

### FieldMayBeFinal
Field `evaluators` may be 'final'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/conditions/ConditionEvaluatorDispatcher.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(ConditionEvaluatorDispatcher.class.getName());

    private Map<String, ConditionEvaluator> evaluators = new ConcurrentHashMap<>();

    private MetricsService metricsService;
```

### FieldMayBeFinal
Field `queryBuilders` may be 'final'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/conditions/ConditionESQueryBuilderDispatcher.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(ConditionESQueryBuilderDispatcher.class.getName());

    private Map<String, ConditionESQueryBuilder> queryBuilders = new ConcurrentHashMap<>();
    private ScriptExecutor scriptExecutor;

```

### FieldMayBeFinal
Field `resolver` may be 'final'
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyHelper.java`
#### Snippet
```java

    private static final Logger logger = LoggerFactory.getLogger(PropertyHelper.class.getName());
    private static DefaultResolver resolver = new DefaultResolver();

    public static boolean setProperty(Object target, String propertyName, Object propertyValue, String setPropertyStrategy) {
```

### FieldMayBeFinal
Field `mappingCharFilterFactory` may be 'final'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/conditions/ConditionContextHelper.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(ConditionContextHelper.class);

    private static MappingCharFilterFactory mappingCharFilterFactory;
    static {
        Map<String,String> args = new HashMap<>();
```

### FieldMayBeFinal
Field `requiredBundlesFromFeatures` may be 'final'
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
    private long startupTime;
    private Map<String, Boolean> requiredBundles = new ConcurrentHashMap<>();
    private Map<String, Boolean> requiredBundlesFromFeatures = new ConcurrentHashMap<>();

    private ScheduledExecutorService scheduler;
```

### FieldMayBeFinal
Field `requiredServicesFilters` may be 'final'
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java

    private String requiredServices;
    private Set<Filter> requiredServicesFilters = new LinkedHashSet<>();
    private long matchedRequiredServicesCount = 0;

```

### FieldMayBeFinal
Field `serverInfos` may be 'final'
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
    private Set<String> featuresToInstall = ConcurrentHashMap.newKeySet();
    private boolean installingFeatureStarted = false;
    private List<ServerInfo> serverInfos = new ArrayList<>();

    public void setRequiredBundles(Map<String, Boolean> requiredBundles) {
```

### FieldMayBeFinal
Field `featuresToInstall` may be 'final'
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
    private Integer checkStartupStateRefreshInterval = 60;

    private Set<String> featuresToInstall = ConcurrentHashMap.newKeySet();
    private boolean installingFeatureStarted = false;
    private List<ServerInfo> serverInfos = new ArrayList<>();
```

### FieldMayBeFinal
Field `mappings` may be 'final'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
    private String[] fatalIllegalStateErrors;
    private BundleContext bundleContext;
    private Map<String, String> mappings = new HashMap<String, String>();
    private ConditionEvaluatorDispatcher conditionEvaluatorDispatcher;
    private ConditionESQueryBuilderDispatcher conditionESQueryBuilderDispatcher;
```

### FieldMayBeFinal
Field `timerName` may be 'final'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
    public abstract static class InClassLoaderExecute<T> {

        private String timerName;
        private MetricsService metricsService;
        private BundleContext bundleContext;
```

### FieldMayBeFinal
Field `knownMappings` may be 'final'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
    private Map<String, WriteRequest.RefreshPolicy> itemTypeToRefreshPolicy = new HashMap<>();

    private Map<String, Map<String, Map<String, Object>>> knownMappings = new HashMap<>();

    private static final Map<String, String> itemTypeIndexNameMap = new HashMap<>();
```

### FieldMayBeFinal
Field `elasticSearchAddressList` may be 'final'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
    private BulkProcessor bulkProcessor;
    private String elasticSearchAddresses;
    private List<String> elasticSearchAddressList = new ArrayList<>();
    private String clusterName;
    private String indexPrefix;
```

### FieldMayBeFinal
Field `throwExceptions` may be 'final'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
        private BundleContext bundleContext;
        private String[] fatalIllegalStateErrors; // Errors that if occur - stop the application
        private boolean throwExceptions;

        public InClassLoaderExecute(MetricsService metricsService, String timerName, BundleContext bundleContext, String[] fatalIllegalStateErrors, boolean throwExceptions) {
```

### FieldMayBeFinal
Field `removeByQueryTimeoutInMinutes` may be 'final'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java

    private Integer defaultQueryLimit = 10;
    private Integer removeByQueryTimeoutInMinutes = 10;

    private String bulkProcessorConcurrentRequests = "1";
```

### FieldMayBeFinal
Field `bundleContext` may be 'final'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
        private String timerName;
        private MetricsService metricsService;
        private BundleContext bundleContext;
        private String[] fatalIllegalStateErrors; // Errors that if occur - stop the application
        private boolean throwExceptions;
```

### FieldMayBeFinal
Field `fatalIllegalStateErrors` may be 'final'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
        private MetricsService metricsService;
        private BundleContext bundleContext;
        private String[] fatalIllegalStateErrors; // Errors that if occur - stop the application
        private boolean throwExceptions;

```

### FieldMayBeFinal
Field `metricsService` may be 'final'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java

        private String timerName;
        private MetricsService metricsService;
        private BundleContext bundleContext;
        private String[] fatalIllegalStateErrors; // Errors that if occur - stop the application
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `sfdcConfiguration` is redundant
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            return null;
        }
        SFDCConfiguration sfdcConfiguration = persistenceService.load("sfdcConfiguration", SFDCConfiguration.class);
        return sfdcConfiguration;
    }
```

### UnnecessaryLocalVariable
Local variable `exportConfigSaved` is redundant
in `extensions/router/router-rest/src/main/java/org/apache/unomi/router/rest/ExportConfigurationServiceEndPoint.java`
#### Snippet
```java
    @Override
    public ExportConfiguration saveConfiguration(ExportConfiguration exportConfiguration) {
        ExportConfiguration exportConfigSaved = configurationService.save(exportConfiguration, true);

        return exportConfigSaved;
```

### UnnecessaryLocalVariable
Local variable `importConfigSaved` is redundant
in `extensions/router/router-rest/src/main/java/org/apache/unomi/router/rest/ImportConfigurationServiceEndPoint.java`
#### Snippet
```java
    public ImportConfiguration saveConfiguration(ImportConfiguration importConfiguration) {

        ImportConfiguration importConfigSaved = configurationService.save(importConfiguration, true);

        return importConfigSaved;
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
            return new ArrayList<>();

        List<String> result = new InClassLoaderExecute<List<String>>(metricsService, this.getClass().getName() + ".updateItems", this.bundleContext, this.fatalIllegalStateErrors, throwExceptions) {
            protected List<String> execute(Object... args) throws Exception {
                long batchRequestStartTime = System.currentTimeMillis();
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `extensions/geonames/services/src/main/java/org/apache/unomi/geonames/services/GeonamesService.java`
#### Snippet
```java
    List<String> FEATURES_CLASSES = Arrays.asList("A", "P");
    List<String> COUNTRY_FEATURE_CODES = Arrays.asList("PCL", "PCLD", "PCLF", "PCL", "PCLI", "PCLIX", "PCLS");
    List<String> ADM1_FEATURE_CODES = Arrays.asList("ADM1");
    List<String> ADM2_FEATURE_CODES = Arrays.asList("ADM2");
    List<String> CITIES_FEATURE_CODES = Arrays.asList("PPL", "PPLA", "PPLA2", "PPLA3", "PPLA4", "PPLC", "PPLCH", "PPLF", "PPLG", "PPLL", "PPLR", "PPLR");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `extensions/geonames/services/src/main/java/org/apache/unomi/geonames/services/GeonamesService.java`
#### Snippet
```java
    List<String> COUNTRY_FEATURE_CODES = Arrays.asList("PCL", "PCLD", "PCLF", "PCL", "PCLI", "PCLIX", "PCLS");
    List<String> ADM1_FEATURE_CODES = Arrays.asList("ADM1");
    List<String> ADM2_FEATURE_CODES = Arrays.asList("ADM2");
    List<String> CITIES_FEATURE_CODES = Arrays.asList("PPL", "PPLA", "PPLA2", "PPLA3", "PPLA4", "PPLC", "PPLCH", "PPLF", "PPLG", "PPLL", "PPLR", "PPLR");
    List<List<String>> ORDERED_FEATURES = Arrays.asList(COUNTRY_FEATURE_CODES, ADM1_FEATURE_CODES, ADM2_FEATURE_CODES, CITIES_FEATURE_CODES);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `extensions/geonames/services/src/main/java/org/apache/unomi/geonames/services/GeonamesServiceImpl.java`
#### Snippet
```java

        if (COUNTRY_FEATURE_CODES.contains(entry.getFeatureCode())) {
            featureCodes = Arrays.asList("PPLC");
        } else if (ADM1_FEATURE_CODES.contains(entry.getFeatureCode())) {
            featureCodes = Arrays.asList("PPLA", "PPLC");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
                    action.setParameter("pastEventCondition", parentCondition);

                    rule.setActions(Arrays.asList(action));
                    rule.setLinkedItems(Arrays.asList(metadata.getId()));

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java

                    rule.setActions(Arrays.asList(action));
                    rule.setLinkedItems(Arrays.asList(metadata.getId()));

                    // it's a new generated rules to keep track of the event count, we should update all the profile that match this past event
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/context/RouterCamelContext.java`
#### Snippet
```java
        if (RouterConstants.IMPORT_EXPORT_CONFIG_TYPE_RECURRENT.equals(importConfiguration.getConfigType())) {
            ProfileImportFromSourceRouteBuilder builder = new ProfileImportFromSourceRouteBuilder(kafkaProps, configType);
            builder.setImportConfigurationList(Arrays.asList(importConfiguration));
            builder.setImportConfigurationService(importConfigurationService);
            builder.setProfileService(profileService);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java
            Thread.currentThread().setContextClassLoader(null);
            consumer = new KafkaConsumer<String, String>(config);
            consumer.subscribe(Arrays.asList(topic));
        } finally {
            Thread.currentThread().setContextClassLoader(originClassLoader);
```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`isUpdated == false` can be simplified to '!isUpdated'
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
                        Map<String, Object> sourceMapToUpdate = buildPropertiesMapForUpdateSegment(profileToAddUpdated, segmentId, isAdd);
                        boolean isUpdated = persistenceService.update(profileToAddUpdated, Profile.class, sourceMapToUpdate);
                        if (isUpdated == false)
                            throw new Exception(String.format("failed retry update profile segment {}, profile {}, time {}", segmentId, profileId, new Date()));
                    });
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `extensions/json-schema/services/src/main/java/org/apache/unomi/schema/api/ValidationError.java`
#### Snippet
```java
    }

    public boolean equals(Object o) {
        ValidationError other = (ValidationError) o;
        return validationMessage.equals(other.getError());
```

