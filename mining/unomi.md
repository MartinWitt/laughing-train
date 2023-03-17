# unomi 
 
# Bad smells
I found 1325 bad smells with 143 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 293 | false |
| MissortedModifiers | 258 | false |
| BoundedWildcard | 90 | false |
| SizeReplaceableByIsEmpty | 78 | true |
| RedundantFieldInitialization | 62 | false |
| UNUSED_IMPORT | 55 | false |
| ConstantValue | 34 | false |
| DynamicRegexReplaceableByCompiledPattern | 28 | false |
| ClassNameSameAsAncestorName | 22 | false |
| UnusedAssignment | 21 | false |
| SystemOutErr | 21 | false |
| DataFlowIssue | 19 | false |
| UseOfPropertiesAsHashtable | 18 | false |
| DeprecatedIsStillUsed | 17 | false |
| UtilityClassWithoutPrivateConstructor | 16 | true |
| NonProtectedConstructorInAbstractClass | 16 | true |
| AssignmentToMethodParameter | 15 | false |
| NonShortCircuitBoolean | 14 | false |
| UnnecessaryFullyQualifiedName | 13 | false |
| DefaultAnnotationParam | 11 | false |
| RedundantImplements | 11 | false |
| UnnecessaryBoxing | 11 | false |
| EmptyMethod | 10 | false |
| MismatchedJavadocCode | 10 | false |
| RegExpRedundantEscape | 9 | false |
| StringConcatenationInsideStringBufferAppend | 9 | false |
| StringBufferReplaceableByString | 8 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 8 | false |
| NonSerializableFieldInSerializableClass | 8 | false |
| BooleanConstructor | 7 | false |
| UnnecessaryReturn | 6 | true |
| ZeroLengthArrayInitialization | 6 | false |
| InnerClassMayBeStatic | 5 | true |
| UnnecessaryLocalVariable | 5 | true |
| UnnecessaryModifier | 4 | true |
| KeySetIterationMayUseEntrySet | 4 | false |
| UnnecessarySuperQualifier | 4 | false |
| NestedAssignment | 4 | false |
| CodeBlock2Expr | 4 | true |
| TypeParameterExtendsObject | 4 | false |
| UnnecessaryToStringCall | 4 | true |
| StringEqualsEmptyString | 4 | false |
| ThrowablePrintStackTrace | 4 | false |
| ToArrayCallWithZeroLengthArrayArgument | 3 | true |
| ObsoleteCollection | 3 | false |
| DuplicateBranchesInSwitch | 3 | false |
| RedundantMethodOverride | 3 | false |
| DuplicateThrows | 3 | false |
| RedundantLengthCheck | 3 | false |
| UnnecessarySemicolon | 3 | false |
| StringOperationCanBeSimplified | 3 | false |
| Convert2Lambda | 3 | false |
| WrapperTypeMayBePrimitive | 2 | false |
| CStyleArrayDeclaration | 2 | false |
| AbstractClassNeverImplemented | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| StringBufferReplaceableByStringBuilder | 2 | false |
| Convert2MethodRef | 2 | false |
| RedundantCollectionOperation | 2 | false |
| EqualsWithItself | 1 | false |
| ConditionalBreakInInfiniteLoop | 1 | false |
| RedundantClassCall | 1 | false |
| EmptyStatementBody | 1 | false |
| CommentedOutCode | 1 | false |
| TrivialStringConcatenation | 1 | false |
| NumberEquality | 1 | false |
| MismatchedStringBuilderQueryUpdate | 1 | false |
| IgnoreResultOfCall | 1 | false |
| UnnecessaryUnboxing | 1 | false |
| WhileLoopSpinsOnField | 1 | false |
| MalformedFormatString | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| InstanceofCatchParameter | 1 | false |
| DoubleBraceInitialization | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| CastConflictsWithInstanceof | 1 | false |
| MethodOverridesStaticMethod | 1 | false |
| IOResource | 1 | false |
| RedundantOperationOnEmptyContainer | 1 | false |
| Java8MapForEach | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| CatchMayIgnoreException | 1 | false |
| SwitchStatementWithConfusingDeclaration | 1 | false |
| RedundantSuppression | 1 | false |
| UtilityClassWithPublicConstructor | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| CharsetObjectCanBeUsed | 1 | false |
| MissingDeprecatedAnnotation | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| Anonymous2MethodRef | 1 | false |
| PointlessBooleanExpression | 1 | true |
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

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/GeoLocationByPointSessionConditionEvaluator.java`
#### Snippet
```java
            String name = condition.getParameter("name") == null ? "properties.location" : (String) condition.getParameter("name");

            Double latitudeProperty = Double.parseDouble(BeanUtils.getProperty(item, name + ".lat"));
            Double longitudeProperty = Double.parseDouble(BeanUtils.getProperty(item, name + ".lon"));

```

### WrapperTypeMayBePrimitive
Type may be primitive
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/GeoLocationByPointSessionConditionEvaluator.java`
#### Snippet
```java

            Double latitudeProperty = Double.parseDouble(BeanUtils.getProperty(item, name + ".lat"));
            Double longitudeProperty = Double.parseDouble(BeanUtils.getProperty(item, name + ".lon"));


```

## RuleId[id=UnnecessaryModifier]
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
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyTypedObjectDeserializer.java`
#### Snippet
```java
                objectClass = HashMap.class;
            }
        } else {

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
    "eventType" : {
      "type" : "string",
      "pattern" : "^(\\w|[-_@\\.]){0,60}$"
    },
    "profileId" : {
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

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/event/UnomiEventPublisher.java`
#### Snippet
```java
    public void activate(BundleContext bundleContext) {
        final String[] interfaces = Arrays.stream(UnomiEventPublisher.class.getInterfaces()).map(Class::getName).toArray(String[]::new);
        eventServiceRegistration = bundleContext.registerService(interfaces, this, new Hashtable<>());
    }

```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `api/src/main/java/org/apache/unomi/api/utils/ParserHelper.java`
#### Snippet
```java

        private Set<String> eventTypeIds = new HashSet<>();
        private Stack<String> conditionTypeStack = new Stack<>();

        public void visit(Condition condition) {
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `api/src/main/java/org/apache/unomi/api/utils/ParserHelper.java`
#### Snippet
```java

        private Set<String> eventTypeIds = new HashSet<>();
        private Stack<String> conditionTypeStack = new Stack<>();

        public void visit(Condition condition) {
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `propsMap.keySet()` may be replaced with 'entrySet()' iteration
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/UpdatePropertiesAction.java`
#### Snippet
```java
    private boolean processProperties(Profile target, Map<String, Object> propsMap, String strategy) {
        boolean isProfileOrPersonaUpdated = false;
        for (String prop : propsMap.keySet()) {
            PropertyType propType = null;
            if (prop.startsWith("properties.") || prop.startsWith("systemProperties.")) {
```

### KeySetIterationMayUseEntrySet
Iteration over `values.keySet()` may be replaced with 'Map.forEach()' iteration
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyHelper.java`
#### Snippet
```java
        // create a new Map, with prefix added to each key
        Map<String, Object> flattenMap = new HashMap<>();
        values.keySet().forEach(key -> {
            // use a dot as a joining char
            flattenMap.put(prefix + "." + key, values.get(key));
```

### KeySetIterationMayUseEntrySet
Iteration over `fieldsMapping.keySet()` may be replaced with 'entrySet()' iteration
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/LineSplitProcessor.java`
#### Snippet
```java
            logger.debug("$$$$ : LineSplitProcessor : MAPPING : " + fieldsMapping.keySet());
            Map<String, Object> properties = new HashMap<>();
            for (String fieldMappingKey : fieldsMapping.keySet()) {
                PropertyType propertyType = RouterUtils.getPropertyTypeById(profilePropertyTypes, fieldMappingKey);

```

### KeySetIterationMayUseEntrySet
Iteration over `headers.keySet()` may be replaced with 'entrySet()' iteration
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/HttpUtils.java`
#### Snippet
```java

    private static void addHeaders(Map<String, String> headers, HttpRequestBase httpRequestBase) {
        for (String key : headers.keySet()) {
            httpRequestBase.addHeader(key, headers.get(key));
        }
```

## RuleId[id=DuplicateBranchesInSwitch]
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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`query.getAggregate().getDateRanges().size() > 0` can be replaced with '!query.getAggregate().getDateRanges().isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/queries/QueryServiceImpl.java`
#### Snippet
```java
                        String format = (String) query.getAggregate().getParameters().get("format");
                        baseAggregate = new DateAggregate(property, interval, format);
                    } else if (aggregateType.equals("dateRange") && query.getAggregate().getDateRanges() != null && query.getAggregate().getDateRanges().size() > 0) {
                        String format = (String) query.getAggregate().getParameters().get("format");
                        baseAggregate = new DateRangeAggregate(query.getAggregate().getProperty(), format, query.getAggregate().getDateRanges());
```

### SizeReplaceableByIsEmpty
`query.getAggregate().getNumericRanges().size() > 0` can be replaced with '!query.getAggregate().getNumericRanges().isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/queries/QueryServiceImpl.java`
#### Snippet
```java
                        String format = (String) query.getAggregate().getParameters().get("format");
                        baseAggregate = new DateRangeAggregate(query.getAggregate().getProperty(), format, query.getAggregate().getDateRanges());
                    } else if (aggregateType.equals("numericRange") && query.getAggregate().getNumericRanges() != null && query.getAggregate().getNumericRanges().size() > 0) {
                        baseAggregate = new NumericRangeAggregate(query.getAggregate().getProperty(), query.getAggregate().getNumericRanges());
                    } else if (aggregateType.equals("ipRange") && query.getAggregate().ipRanges() != null && query.getAggregate().ipRanges().size() > 0) {
```

### SizeReplaceableByIsEmpty
`query.getAggregate().ipRanges().size() > 0` can be replaced with '!query.getAggregate().ipRanges().isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/queries/QueryServiceImpl.java`
#### Snippet
```java
                    } else if (aggregateType.equals("numericRange") && query.getAggregate().getNumericRanges() != null && query.getAggregate().getNumericRanges().size() > 0) {
                        baseAggregate = new NumericRangeAggregate(query.getAggregate().getProperty(), query.getAggregate().getNumericRanges());
                    } else if (aggregateType.equals("ipRange") && query.getAggregate().ipRanges() != null && query.getAggregate().ipRanges().size() > 0) {
                        baseAggregate = new IpRangeAggregate(query.getAggregate().getProperty(), query.getAggregate().ipRanges());
                    }
```

### SizeReplaceableByIsEmpty
`query.getAggregate().getDateRanges().size() > 0` can be replaced with '!query.getAggregate().getDateRanges().isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/goals/GoalsServiceImpl.java`
#### Snippet
```java
                    String format = (String) query.getAggregate().getParameters().get("format");
                    aggregate = new DateAggregate(property, interval, format);
                } else if (query.getAggregate().getType().equals("dateRange") && query.getAggregate().getDateRanges() != null && query.getAggregate().getDateRanges().size() > 0) {
                    String format = (String) query.getAggregate().getParameters().get("format");
                    aggregate = new DateRangeAggregate(property, format, query.getAggregate().getDateRanges());
```

### SizeReplaceableByIsEmpty
`query.getAggregate().getNumericRanges().size() > 0` can be replaced with '!query.getAggregate().getNumericRanges().isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/goals/GoalsServiceImpl.java`
#### Snippet
```java
                    String format = (String) query.getAggregate().getParameters().get("format");
                    aggregate = new DateRangeAggregate(property, format, query.getAggregate().getDateRanges());
                } else if (query.getAggregate().getType().equals("numericRange") && query.getAggregate().getNumericRanges() != null && query.getAggregate().getNumericRanges().size() > 0) {
                    aggregate = new NumericRangeAggregate(property, query.getAggregate().getNumericRanges());
                } else if (query.getAggregate().getType().equals("ipRange") && query.getAggregate().ipRanges() != null && query.getAggregate().ipRanges().size() > 0) {
```

### SizeReplaceableByIsEmpty
`query.getAggregate().ipRanges().size() > 0` can be replaced with '!query.getAggregate().ipRanges().isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/goals/GoalsServiceImpl.java`
#### Snippet
```java
                } else if (query.getAggregate().getType().equals("numericRange") && query.getAggregate().getNumericRanges() != null && query.getAggregate().getNumericRanges().size() > 0) {
                    aggregate = new NumericRangeAggregate(property, query.getAggregate().getNumericRanges());
                } else if (query.getAggregate().getType().equals("ipRange") && query.getAggregate().ipRanges() != null && query.getAggregate().ipRanges().size() > 0) {
                    aggregate = new IpRangeAggregate(property, query.getAggregate().ipRanges());
                }
```

### SizeReplaceableByIsEmpty
`result.getContentIds().size() > 0` can be replaced with '!result.getContentIds().isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/personalization/PersonalizationServiceImpl.java`
#### Snippet
```java
    public String bestMatch(Profile profile, Session session, PersonalizationRequest personalizationRequest) {
        PersonalizationResult result = personalizeList(profile,session,personalizationRequest);
        if (result.getContentIds().size() > 0) {
            return result.getContentIds().get(0);
        }
```

### SizeReplaceableByIsEmpty
`childProperties.size() > 0` can be replaced with '!childProperties.isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/events/EventServiceImpl.java`
#### Snippet
```java
                childProperties = getEventPropertyTypes((Map<String, Map<String, Object>>) e.getValue().get("properties"));
                valueType = definitionsService.getValueType("set");
                if (childProperties != null && childProperties.size() > 0) {
                    propertyType.setChildPropertyTypes(childProperties);
                }
```

### SizeReplaceableByIsEmpty
`profileToMerge.getNestedProperty(propertyName).toString().length() > 0` can be replaced with '!profileToMerge.getNestedProperty(propertyName).toString().isEmpty()'
in `services/src/main/java/org/apache/unomi/services/mergers/DefaultPropertyMergeStrategyExecutor.java`
#### Snippet
```java
        for (Profile profileToMerge : profilesToMerge) {
            if (profileToMerge.getNestedProperty(propertyName) != null &&
                    profileToMerge.getNestedProperty(propertyName).toString().length() > 0) {
                PropertyHelper.setProperty(targetProfile, "properties." + propertyName, profileToMerge.getNestedProperty(propertyName), "alwaysSet");
                modified = true;
```

### SizeReplaceableByIsEmpty
`trackedCondition.getConditionType().getParameters().size() > 0` can be replaced with '!trackedCondition.getConditionType().getParameters().isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/rules/RulesServiceImpl.java`
#### Snippet
```java
                        trackedCondition.getConditionType() != null &&
                                trackedCondition.getConditionType().getParameters() != null &&
                                trackedCondition.getConditionType().getParameters().size() > 0
                ) {
                    // lookup for track parameters
```

### SizeReplaceableByIsEmpty
`trackedParameters.size() > 0` can be replaced with '!trackedParameters.isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/rules/RulesServiceImpl.java`
#### Snippet
```java
                        }
                    });
                    if (trackedParameters.size() > 0) {
                        evalCondition = new Condition(definitionsService.getConditionType("booleanCondition"));
                        evalCondition.setParameter("operator", "and");
```

### SizeReplaceableByIsEmpty
`matchingConditions.size() == 0` can be replaced with 'matchingConditions.isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/definitions/DefinitionsServiceImpl.java`
#### Snippet
```java
                }
            }
            if (matchingConditions.size() == 0) {
                return null;
            } else if (matchingConditions.equals(subConditions)) {
```

### SizeReplaceableByIsEmpty
`matchingConditions.size() == 0` can be replaced with 'matchingConditions.isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/definitions/DefinitionsServiceImpl.java`
#### Snippet
```java
                }
            }
            if (matchingConditions.size() == 0) {
                return null;
            } else if (matchingConditions.equals(subConditions)) {
```

### SizeReplaceableByIsEmpty
`newListIdentifiers.size() == 0` can be replaced with 'newListIdentifiers.isEmpty()'
in `extensions/lists-extension/actions/src/main/java/org/apache/unomi/lists/actions/AddToListsAction.java`
#### Snippet
```java
    public int execute(Action action, Event event) {
        List<String> newListIdentifiers = (List<String>) action.getParameterValues().get("listIdentifiers");
        if (newListIdentifiers == null || newListIdentifiers.size() == 0) {
            return EventService.NO_CHANGE;
        }
```

### SizeReplaceableByIsEmpty
`batch.size() > 0` can be replaced with '!batch.isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
            }

            if (batch.size() == segmentUpdateBatchSize || (!entryIterator.hasNext() && batch.size() > 0)) {
                try {
                    persistenceService.update(batch, Profile.class);
```

### SizeReplaceableByIsEmpty
`rule.getActions().size() > 0` can be replaced with '!rule.getActions().isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
        // reevaluate auto generated rules used to store the event occurrence count on the profile
        for (Rule rule : rulesService.getAllRules()) {
            if (rule.getActions() != null && rule.getActions().size() > 0) {
                for (Action action : rule.getActions()) {
                    if (action.getActionTypeId().equals("setEventOccurenceCountAction")) {
```

### SizeReplaceableByIsEmpty
`rule.getLinkedItems().size() > 0` can be replaced with '!rule.getLinkedItems().isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
                            recalculatePastEventOccurrencesOnProfiles(rule.getCondition(), pastEventCondition, true, true);
                            logger.info("Event occurrence count on profiles updated for rule: {}", rule.getItemId());
                            if (rule.getLinkedItems() != null && rule.getLinkedItems().size() > 0) {
                                segmentOrScoringIdsToReevaluate.addAll(rule.getLinkedItems());
                            }
```

### SizeReplaceableByIsEmpty
`scoring.getElements().size() > 0` can be replaced with '!scoring.getElements().isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java

        segmentOrScoringIdsToReevaluate.addAll(allScoring.stream()
                .filter(scoring -> scoring.getElements() != null && scoring.getElements().size() > 0 && scoring.getElements().stream()
                        .anyMatch(scoringElement -> scoringElement != null && scoringElement.getCondition() != null && scoringElement.getCondition().toString().contains("propertyValueDateExpr")))
                .map(Item::getItemId)
```

### SizeReplaceableByIsEmpty
`segmentOrScoringIdsToReevaluate.size() > 0` can be replaced with '!segmentOrScoringIdsToReevaluate.isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java

        // reevaluate segments and scoring.
        if (segmentOrScoringIdsToReevaluate.size() > 0) {
            persistenceService.refreshIndex(Profile.class, null);
            for (String linkedItem : segmentOrScoringIdsToReevaluate) {
```

### SizeReplaceableByIsEmpty
`profiles.getList().size() > 0` can be replaced with '!profiles.getList().isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
        PartialList<Profile> profiles = persistenceService.query(profilesToUpdateCondition, null, Profile.class, 0, segmentUpdateBatchSize, "10m");

        while (profiles != null && profiles.getList().size() > 0) {
            long startTime = System.currentTimeMillis();
            if (batchSegmentProfileUpdate) {
```

### SizeReplaceableByIsEmpty
`name.length() != 0` can be replaced with '!name.isEmpty()'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/utils/StringUtils.java`
#### Snippet
```java

    public static String decapitalize(String name) {
        if (name != null && name.length() != 0) {
            if (name.length() > 1 && Character.isUpperCase(name.charAt(1)) && Character.isUpperCase(name.charAt(0))) {
                return name;
```

### SizeReplaceableByIsEmpty
`propertyMergeStrategyId.length() > 0` can be replaced with '!propertyMergeStrategyId.isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
            String propertyMergeStrategyId = "defaultMergeStrategy";
            if (propertyType != null) {
                if (propertyType.getMergeStrategy() != null && propertyMergeStrategyId.length() > 0) {
                    propertyMergeStrategyId = propertyType.getMergeStrategy();
                }
```

### SizeReplaceableByIsEmpty
`profile.getSegments().size() > 0` can be replaced with '!profile.getSegments().isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
        // we now have to merge the profile's segments
        for (Profile profile : profilesToMerge) {
            if (profile.getSegments() != null && profile.getSegments().size() > 0) {
                masterProfile.getSegments().addAll(profile.getSegments());
                // TODO better segments diff calculation
```

### SizeReplaceableByIsEmpty
`profile.getConsents().size() > 0` can be replaced with '!profile.getConsents().isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
        // we now have to merge the profile's consents
        for (Profile profile : profilesToMerge) {
            if (profile.getConsents() != null && profile.getConsents().size() > 0) {
                for (String consentId : profile.getConsents().keySet()) {
                    if (masterProfile.getConsents().containsKey(consentId)) {
```

### SizeReplaceableByIsEmpty
`subConditions.size() > 0` can be replaced with '!subConditions.isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
                }
            }
            return subConditions.size() > 0 && isAnd;
        } else {
            Condition profileCondition = definitionsService.extractConditionBySystemTag(condition, "profileCondition");
```

### SizeReplaceableByIsEmpty
`types.size() > 0` can be replaced with '!types.isEmpty()'
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
    public String getPropertyTypeMapping(String fromPropertyTypeId) {
        Collection<PropertyType> types = getPropertyTypeByMapping(fromPropertyTypeId);
        if (types.size() > 0) {
            return types.iterator().next().getMetadata().getId();
        }
```

### SizeReplaceableByIsEmpty
`variableStr.trim().length() > 0` can be replaced with '!variableStr.trim().isEmpty()'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/GraphQLServlet.java`
#### Snippet
```java
        String variableStr = req.getParameter("variables");
        Map<String, Object> variables = new HashMap<>();
        if ((variableStr != null) && (variableStr.trim().length() > 0)) {
            TypeReference<Map<String, Object>> typeRef = new TypeReference<Map<String, Object>>() {
            };
```

### SizeReplaceableByIsEmpty
`query.trim().length() == 0` can be replaced with 'query.trim().isEmpty()'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/GraphQLServlet.java`
#### Snippet
```java
    private void executeGraphQLRequest(
            HttpServletResponse resp, String query, String operationName, Map<String, Object> variables) throws IOException {
        if (query == null || query.trim().length() == 0) {
            throw new IllegalArgumentException("Query cannot be empty or null");
        }
```

### SizeReplaceableByIsEmpty
`properties.size() == 0` can be replaced with 'properties.isEmpty()'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/profile/PropertiesConnectionDataFetcher.java`
#### Snippet
```java
        final int startIndex = Math.max(0, params.getOffset());
        final int lastIndex = Math.min(params.getOffset() + params.getSize(), properties.size());
        if (properties == null || properties.size() == 0 || properties.size() < startIndex || lastIndex <= 0) {
            return new CDPPropertyConnection();
        }
```

### SizeReplaceableByIsEmpty
`targetId.trim().length() > 0` can be replaced with '!targetId.trim().isEmpty()'
in `plugins/hover-event/src/main/java/org/apache/unomi/plugins/events/hover/querybuilders/HoverEventConditionESQueryBuilder.java`
#### Snippet
```java
        String targetPath = (String) condition.getParameter("targetPath");

        if (targetId != null && targetId.trim().length() > 0) {
            queryBuilders.add(QueryBuilders.termQuery("target.itemId", targetId));
        } else if (targetPath != null && targetPath.trim().length() > 0) {
```

### SizeReplaceableByIsEmpty
`targetPath.trim().length() > 0` can be replaced with '!targetPath.trim().isEmpty()'
in `plugins/hover-event/src/main/java/org/apache/unomi/plugins/events/hover/querybuilders/HoverEventConditionESQueryBuilder.java`
#### Snippet
```java
        if (targetId != null && targetId.trim().length() > 0) {
            queryBuilders.add(QueryBuilders.termQuery("target.itemId", targetId));
        } else if (targetPath != null && targetPath.trim().length() > 0) {
            queryBuilders.add(QueryBuilders.termQuery("target.properties.pageInfo.pagePath", targetPath));
        } else {
```

### SizeReplaceableByIsEmpty
`list.size() == 0` can be replaced with 'list.isEmpty()'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/providers/CompositeGraphQLFieldVisibility.java`
#### Snippet
```java
    private static <T> T extractWithPriority(List<T> list) {
        boolean anyBlocks = list.stream().anyMatch(Objects::isNull);
        boolean noItems = list.size() == 0;
        if (anyBlocks || noItems) {
            // some provider blocks it or none describes at all
```

### SizeReplaceableByIsEmpty
`existingMergedProfiles.size() > 0` can be replaced with '!existingMergedProfiles.isEmpty()'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/MergeProfilesOnPropertyAction.java`
#### Snippet
```java
        Profile eventProfile = event.getProfile();

        if (existingMergedProfiles.size() > 0) {
            // Take existing profile
            eventProfile = existingMergedProfiles.get(0);
```

### SizeReplaceableByIsEmpty
`mandatoryPropTypeSystemTags.size() > 0` can be replaced with '!mandatoryPropTypeSystemTags.isEmpty()'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/CopyPropertiesAction.java`
#### Snippet
```java
            PropertyType propertyType = profileService.getPropertyType(mappedProperty);
            Object previousValue = event.getProfile().getProperty(mappedProperty);
            if (mandatoryPropTypeSystemTags != null && mandatoryPropTypeSystemTags.size() > 0) {
                if (propertyType == null || propertyType.getMetadata() == null || propertyType.getMetadata().getSystemTags() == null
                        || !propertyType.getMetadata().getSystemTags().containsAll(mandatoryPropTypeSystemTags)) {
```

### SizeReplaceableByIsEmpty
`conditions.size() > 0` can be replaced with '!conditions.isEmpty()'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/SourceEventPropertyConditionEvaluator.java`
#### Snippet
```java
        }

        if(conditions.size() > 0){
            if (item != null) {
                andCondition.setParameter("subConditions", conditions);
```

### SizeReplaceableByIsEmpty
`propertiesToOverwrite.size() > 0` can be replaced with '!propertiesToOverwrite.isEmpty()'
in `extensions/router/router-service/src/main/java/org/apache/unomi/router/services/ProfileImportServiceImpl.java`
#### Snippet
```java
                }
                List<String> propertiesToOverwrite = profileToImport.getPropertiesToOverwrite();
                if (profileToImport.isOverwriteExistingProfiles() && propertiesToOverwrite != null && propertiesToOverwrite.size() > 0) { // We overwrite only properties marked to overwrite
                    logger.debug("Properties to overwrite: {}", propertiesToOverwrite);
                    for (String propName : propertiesToOverwrite) {
```

### SizeReplaceableByIsEmpty
`existingProfiles.size() == 0` can be replaced with 'existingProfiles.isEmpty()'
in `extensions/router/router-service/src/main/java/org/apache/unomi/router/services/ProfileImportServiceImpl.java`
#### Snippet
```java
                existingProfile.setSegments(profileToImport.getSegments());
                existingProfile.setScores(profileToImport.getScores());
            } else if (existingProfiles.size() == 0 && !profileToImport.isProfileToDelete()) {
                logger.debug("New profile to add...");
                BeanUtils.copyProperties(existingProfile, profileToImport);
```

### SizeReplaceableByIsEmpty
`((List) actualValue).size() > 0` can be replaced with '!((List) actualValue).isEmpty()'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java
        } else if (op.equals("exists")) {
            if (actualValue instanceof List) {
                return ((List) actualValue).size() > 0;
            }
            return true;
```

### SizeReplaceableByIsEmpty
`locale.getCountry().length() > 0` can be replaced with '!locale.getCountry().isEmpty()'
in `rest/src/main/java/org/apache/unomi/rest/service/impl/ResourceBundleHelper.java`
#### Snippet
```java
        }

        if (locale.getCountry().length() > 0) {
            // try the locale without the country
            return getBundle(locale.getLanguage(), bundle, loader);
```

### SizeReplaceableByIsEmpty
`exportConfiguration.getProperties().size() > 0` can be replaced with '!exportConfiguration.getProperties().isEmpty()'
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/route/ProfileExportCollectRouteBuilder.java`
#### Snippet
```java
        for (final ExportConfiguration exportConfiguration : exportConfigurationList) {
            if (RouterConstants.IMPORT_EXPORT_CONFIG_TYPE_RECURRENT.equals(exportConfiguration.getConfigType()) &&
                    exportConfiguration.getProperties() != null && exportConfiguration.getProperties().size() > 0) {
                if ((Map<String, String>) exportConfiguration.getProperties().get("mapping") != null) {
                    String destinationEndpoint = (String) exportConfiguration.getProperties().get("destination");
```

### SizeReplaceableByIsEmpty
`importConfiguration.getProperties().size() > 0` can be replaced with '!importConfiguration.getProperties().isEmpty()'
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/route/ProfileImportFromSourceRouteBuilder.java`
#### Snippet
```java
        for (final ImportConfiguration importConfiguration : importConfigurationList) {
            if (RouterConstants.IMPORT_EXPORT_CONFIG_TYPE_RECURRENT.equals(importConfiguration.getConfigType()) &&
                    importConfiguration.getProperties() != null && importConfiguration.getProperties().size() > 0) {
                //Prepare Split Processor
                LineSplitProcessor lineSplitProcessor = new LineSplitProcessor();
```

### SizeReplaceableByIsEmpty
`interval.length() > 0` can be replaced with '!interval.isEmpty()'
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/aggregate/DateAggregate.java`
#### Snippet
```java
    public DateAggregate(String field, String interval, String format) {
        super(field);
        this.interval = (interval != null && interval.length() > 0) ? interval : DEFAULT_INTERVAL;
        this.format = format;
    }
```

### SizeReplaceableByIsEmpty
`interval.length() > 0` can be replaced with '!interval.isEmpty()'
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/aggregate/DateAggregate.java`
#### Snippet
```java
    public DateAggregate(String field, String interval) {
        super(field);
        this.interval = (interval != null && interval.length() > 0) ? interval : DEFAULT_INTERVAL;
    }
    public DateAggregate(String field, String interval, String format) {
```

### SizeReplaceableByIsEmpty
`statusDateStr.trim().length() > 0` can be replaced with '!statusDateStr.trim().isEmpty()'
in `api/src/main/java/org/apache/unomi/api/Consent.java`
#### Snippet
```java
        if (consentMap.containsKey("statusDate")) {
            String statusDateStr = (String) consentMap.get("statusDate");
            if (statusDateStr != null && statusDateStr.trim().length() > 0) {
                setStatusDate(dateFormat.parse(statusDateStr));
            }
```

### SizeReplaceableByIsEmpty
`revokeDateStr.trim().length() > 0` can be replaced with '!revokeDateStr.trim().isEmpty()'
in `api/src/main/java/org/apache/unomi/api/Consent.java`
#### Snippet
```java
        if (consentMap.containsKey("revokeDate")) {
            String revokeDateStr = (String) consentMap.get("revokeDate");
            if (revokeDateStr != null && revokeDateStr.trim().length() > 0) {
                setRevokeDate(dateFormat.parse(revokeDateStr));
            }
```

### SizeReplaceableByIsEmpty
`sessions.size()>0` can be replaced with '!sessions.isEmpty()'
in `api/src/main/java/org/apache/unomi/api/PersonaWithSessions.java`
#### Snippet
```java
    @XmlTransient
    public PersonaSession getLastSession() {
        return sessions.size()>0?sessions.get(0):null;
    }
}
```

### SizeReplaceableByIsEmpty
`input.trim().length() == 0` can be replaced with 'input.trim().isEmpty()'
in `api/src/main/java/org/apache/unomi/api/GeoPoint.java`
#### Snippet
```java
     */
    public static GeoPoint fromString(final String input) {
        if (input == null || input.trim().length() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`cc.length() > 0` can be replaced with '!cc.isEmpty()'
in `plugins/mail/src/main/java/org/apache/unomi/plugins/mail/actions/SendMailAction.java`
#### Snippet
```java
            email.addTo(to);
            email.setFrom(from);
            if (cc != null && cc.length() > 0) {
                email.addCc(cc);
            }
```

### SizeReplaceableByIsEmpty
`bcc.length() > 0` can be replaced with '!bcc.isEmpty()'
in `plugins/mail/src/main/java/org/apache/unomi/plugins/mail/actions/SendMailAction.java`
#### Snippet
```java
                email.addCc(cc);
            }
            if (bcc != null && bcc.length() > 0) {
                email.addBcc(bcc);
            }
```

### SizeReplaceableByIsEmpty
`remoteAddrParameter.length() > 0` can be replaced with '!remoteAddrParameter.isEmpty()'
in `plugins/request/src/main/java/org/apache/unomi/plugins/request/actions/SetRemoteHostInfoAction.java`
#### Snippet
```java
            logger.debug("X-Forwarded-For is " + xff);
        }
        if (remoteAddrParameter != null && remoteAddrParameter.length() > 0) {
            remoteAddr = remoteAddrParameter;
        } else if (xff != null && !xff.equals("")) {
```

### SizeReplaceableByIsEmpty
`cityResponse.getSubdivisions().size() > 0` can be replaced with '!cityResponse.getSubdivisions().isEmpty()'
in `plugins/request/src/main/java/org/apache/unomi/plugins/request/actions/SetRemoteHostInfoAction.java`
#### Snippet
```java
            }

            if (cityResponse.getSubdivisions().size() > 0) {
                session.setProperty("sessionAdminSubDiv1", cityResponse.getSubdivisions().get(0).getGeoNameId());
            }
```

### SizeReplaceableByIsEmpty
`systemAllowedClasses.trim().length() > 0` can be replaced with '!systemAllowedClasses.trim().isEmpty()'
in `scripting/src/main/java/org/apache/unomi/scripting/SecureFilteringClassLoader.java`
#### Snippet
```java
                defaultAllowedClasses = null;
            } else {
                if (systemAllowedClasses.trim().length() > 0) {
                    String[] systemAllowedClassesParts = systemAllowedClasses.split(",");
                    defaultAllowedClasses = new HashSet<>();
```

### SizeReplaceableByIsEmpty
`systemForbiddenClasses.trim().length() > 0` can be replaced with '!systemForbiddenClasses.trim().isEmpty()'
in `scripting/src/main/java/org/apache/unomi/scripting/SecureFilteringClassLoader.java`
#### Snippet
```java
        String systemForbiddenClasses = System.getProperty("org.apache.unomi.scripting.forbid", null);
        if (systemForbiddenClasses != null) {
            if (systemForbiddenClasses.trim().length() > 0) {
                String[] systemForbiddenClassesParts = systemForbiddenClasses.split(",");
                defaultForbiddenClasses = new HashSet<>();
```

### SizeReplaceableByIsEmpty
`extensionIds.size() > 0` can be replaced with '!extensionIds.isEmpty()'
in `extensions/json-schema/services/src/main/java/org/apache/unomi/schema/impl/SchemaServiceImpl.java`
#### Snippet
```java
    private String generateExtendedSchema(String id, String schema) throws JsonProcessingException {
        Set<String> extensionIds = extensions.get(id);
        if (extensionIds != null && extensionIds.size() > 0) {
            // This schema need to be extends !
            ObjectNode jsonSchema = (ObjectNode) objectMapper.readTree(schema);
```

### SizeReplaceableByIsEmpty
`weatherLike.size() > 0` can be replaced with '!weatherLike.isEmpty()'
in `extensions/weather-update/core/src/main/java/org/apache/unomi/weatherupdate/actions/WeatherUpdateAction.java`
#### Snippet
```java
        if (currentWeatherData.has(WEATHER_LIKE_INFO)) {
            weatherLike = currentWeatherData.get(WEATHER_LIKE_INFO);
            if (weatherLike.size() > 0) {
                weatherLike = weatherLike.get(0).get(MAIN_INFO_WEATHER);
                logger.debug("Weather like: {}", weatherLike);
```

### SizeReplaceableByIsEmpty
`typeMappings.size() == 0` can be replaced with 'typeMappings.isEmpty()'
in `extensions/geonames/services/src/main/java/org/apache/unomi/geonames/services/GeonamesServiceImpl.java`
#### Snippet
```java
    private void importGeoNameDatabase(final File f) {
        Map<String,Map<String,Object>> typeMappings = persistenceService.getPropertiesMapping(GeonameEntry.ITEM_TYPE);
        if (typeMappings == null || typeMappings.size() == 0) {
            logger.warn("Type mappings for type {} are not yet installed, delaying import until they are ready!", GeonameEntry.ITEM_TYPE);
            schedulerService.getSharedScheduleExecutorService().schedule(new TimerTask() {
```

### SizeReplaceableByIsEmpty
`items.size() > 0` can be replaced with '!items.isEmpty()'
in `extensions/geonames/services/src/main/java/org/apache/unomi/geonames/services/GeonamesServiceImpl.java`
#### Snippet
```java
        l.add(featureCodeCondition);

        if (items.size() > 0) {
            l.add(getPropertyCondition("countryCode", "propertyValue", items.get(0), "equals"));
        }
```

### SizeReplaceableByIsEmpty
`entries.size() == 0` can be replaced with 'entries.isEmpty()'
in `extensions/geonames/services/src/main/java/org/apache/unomi/geonames/services/GeonamesServiceImpl.java`
#### Snippet
```java
        l.add(featureCodeCondition);
        List<GeonameEntry> entries = persistenceService.query(andCondition, null, GeonameEntry.class);
        if (entries.size() == 0) {
            featureCodeCondition.setParameter("propertyValues", CITIES_FEATURE_CODES);
            entries = persistenceService.query(andCondition, "population:desc", GeonameEntry.class, 0, 1).getList();
```

### SizeReplaceableByIsEmpty
`entries.size() > 0` can be replaced with '!entries.isEmpty()'
in `extensions/geonames/services/src/main/java/org/apache/unomi/geonames/services/GeonamesServiceImpl.java`
#### Snippet
```java
            entries = persistenceService.query(andCondition, "population:desc", GeonameEntry.class, 0, 1).getList();
        }
        if (entries.size() > 0) {
            return getHierarchy(entries.get(0));
        }
```

### SizeReplaceableByIsEmpty
`response.get(LISTS).size() > 0` can be replaced with '!response.get(LISTS).isEmpty()'
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/internal/MailChimpServiceImpl.java`
#### Snippet
```java
            JsonNode response = HttpUtils.executeGetRequest(httpClient, getBaseUrl() + "/lists", getHeaders(), false);
            if (response != null) {
                if (response.has(LISTS) && response.get(LISTS).size() > 0) {
                    for (JsonNode list : response.get(LISTS)) {
                        if (list.has(ID) && list.has(NAME)) {
```

### SizeReplaceableByIsEmpty
`response.get(ERRORS).size() > 0` can be replaced with '!response.get(ERRORS).isEmpty()'
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/internal/MailChimpServiceImpl.java`
#### Snippet
```java

        JsonNode response = HttpUtils.executeDeleteRequest(httpClient, getBaseUrl() + "/lists/" + listIdentifier + "/members/" + currentMember.get(ID).asText(), getHeaders());
        if (response == null || (response.has(ERRORS) && response.get(ERRORS).size() > 0)) {
            logger.error("Couldn't remove the visitor from the MailChimp list, list identifier was {} and response was {}", listIdentifier, response);
            return MailChimpResult.ERROR;
```

### SizeReplaceableByIsEmpty
`response.get(ERRORS).size() > 0` can be replaced with '!response.get(ERRORS).isEmpty()'
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/internal/MailChimpServiceImpl.java`
#### Snippet
```java

        JsonNode response = HttpUtils.executePostRequest(httpClient, getBaseUrl() + "/lists/" + listIdentifier + "/members", getHeaders(), userData.toString());
        if (response == null || (response.has(ERRORS) && response.get(ERRORS).size() > 0)) {
            logger.error("Error when adding user to MailChimp list, list identifier was {} and response was {}", listIdentifier, response);
            return MailChimpResult.ERROR;
```

### SizeReplaceableByIsEmpty
`response.get(ERRORS).size() > 0` can be replaced with '!response.get(ERRORS).isEmpty()'
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/internal/MailChimpServiceImpl.java`
#### Snippet
```java

        JsonNode response = HttpUtils.executePatchRequest(httpClient, getBaseUrl() + "/lists/" + listIdentifier + "/members/" + currentMember.get(ID).asText(), getHeaders(), body.toString());
        if (response == null || (response.has(ERRORS) && response.get(ERRORS).size() > 0)) {
            logger.error("Error when updating visitor properties to MailChimp list, list identifier was {} and response was {}", listIdentifier, response);
            return MailChimpResult.ERROR;
```

### SizeReplaceableByIsEmpty
`queryResult.size() > 0` can be replaced with '!queryResult.isEmpty()'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
                    "='" + identifierFieldValue + "'");
            queryResult = mappingResponse(response, queryResult);
            if (queryResult.size() > 0) {
                return true;
            }
```

### SizeReplaceableByIsEmpty
`foundExistingSfdcLeadIds.size() > 0` can be replaced with '!foundExistingSfdcLeadIds.isEmpty()'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        }

        if (foundExistingSfdcLeadIds.size() > 0) {
            logger.info("Found an existing lead, attempting to update it...");
            // we found an existing lead we must update it
```

### SizeReplaceableByIsEmpty
`sfdcLeadFields.size() == 0` can be replaced with 'sfdcLeadFields.isEmpty()'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        addConsents(profile, sfdcLeadFields);

        if (sfdcLeadFields.size() == 0) {
            logger.info("No SFDC field value to send, will not send anything to Salesforce.");
            if (foundExistingSfdcLeadIds.size() == 0) {
```

### SizeReplaceableByIsEmpty
`foundExistingSfdcLeadIds.size() == 0` can be replaced with 'foundExistingSfdcLeadIds.isEmpty()'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        if (sfdcLeadFields.size() == 0) {
            logger.info("No SFDC field value to send, will not send anything to Salesforce.");
            if (foundExistingSfdcLeadIds.size() == 0) {
                return null;
            } else {
```

### SizeReplaceableByIsEmpty
`existingSfdcLeadFields.size() == 0` can be replaced with 'existingSfdcLeadFields.isEmpty()'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        }

        if (existingSfdcLeadFields.size() == 0) {
            // if we are creating a lead, let's make sure we have all the mandatory fields before sending the request
            boolean missingMandatoryFields = false;
```

### SizeReplaceableByIsEmpty
`foundExistingSfdcLeadIds.size() > 0` can be replaced with '!foundExistingSfdcLeadIds.isEmpty()'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        String baseUrl = sfdcSession.getEndPoint() + REST_ENDPOINT_URI + "/sobjects/Lead";
        HttpEntityEnclosingRequestBase request = new HttpPost(baseUrl);
        if (foundExistingSfdcLeadIds.size() > 0) {
            baseUrl = sfdcSession.getEndPoint() + REST_ENDPOINT_URI + "/sobjects/Lead/" + foundExistingSfdcLeadIds
                    .iterator().next();
```

### SizeReplaceableByIsEmpty
`foundExistingSfdcLeadIds.size() == 0` can be replaced with 'foundExistingSfdcLeadIds.isEmpty()'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        }

        if (foundExistingSfdcLeadIds.size() == 0) {
            return null;
        } else {
```

### SizeReplaceableByIsEmpty
`foundSfdcLeadIds.size() == 0` can be replaced with 'foundSfdcLeadIds.isEmpty()'
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        String unomiIdentifierValue = (String) profile.getProperty(sfdcConfiguration.getUnomiIdentifierField());
        Set<String> foundSfdcLeadIds = findLeadIdsByIdentifierValue(unomiIdentifierValue);
        if (foundSfdcLeadIds.size() == 0) {
            logger.info("No lead found in Salesforce corresponding to profile {}", profile);
            // we didn't find a corresponding lead in salesforce.
```

### SizeReplaceableByIsEmpty
`items.size() == 0` can be replaced with 'items.isEmpty()'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
    @Override
    public List<String> update(final Map<Item, Map> items, final Date dateHint, final Class clazz) {
        if (items.size() == 0)
            return new ArrayList<>();

```

### SizeReplaceableByIsEmpty
`bulkByScrollResponse.getSearchFailures().size() > 0` can be replaced with '!bulkByScrollResponse.getSearchFailures().isEmpty()'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
            }

            if ((bulkByScrollResponse.getSearchFailures() != null && bulkByScrollResponse.getSearchFailures().size() > 0) ||
                    bulkByScrollResponse.getBulkFailures() != null && bulkByScrollResponse.getBulkFailures().size() > 0) {
                logger.warn("Remove by query: we found some failure during the process of query: {}", queryBuilder);
```

### SizeReplaceableByIsEmpty
`bulkByScrollResponse.getBulkFailures().size() > 0` can be replaced with '!bulkByScrollResponse.getBulkFailures().isEmpty()'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java

            if ((bulkByScrollResponse.getSearchFailures() != null && bulkByScrollResponse.getSearchFailures().size() > 0) ||
                    bulkByScrollResponse.getBulkFailures() != null && bulkByScrollResponse.getBulkFailures().size() > 0) {
                logger.warn("Remove by query: we found some failure during the process of query: {}", queryBuilder);

```

### SizeReplaceableByIsEmpty
`bulkByScrollResponse.getSearchFailures().size() > 0` can be replaced with '!bulkByScrollResponse.getSearchFailures().isEmpty()'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                logger.warn("Remove by query: we found some failure during the process of query: {}", queryBuilder);

                if (bulkByScrollResponse.getSearchFailures() != null && bulkByScrollResponse.getSearchFailures().size() > 0) {
                    for (ScrollableHitSource.SearchFailure searchFailure : bulkByScrollResponse.getSearchFailures()) {
                        logger.warn("Remove by query, search failure: {}", searchFailure.toString());
```

### SizeReplaceableByIsEmpty
`bulkByScrollResponse.getBulkFailures().size() > 0` can be replaced with '!bulkByScrollResponse.getBulkFailures().isEmpty()'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                }

                if (bulkByScrollResponse.getBulkFailures() != null && bulkByScrollResponse.getBulkFailures().size() > 0) {
                    for (BulkItemResponse.Failure bulkFailure : bulkByScrollResponse.getBulkFailures()) {
                        logger.warn("Remove by query, bulk failure: {}", bulkFailure.toString());
```

### SizeReplaceableByIsEmpty
`backoffPolicyStr.length() > 0` can be replaced with '!backoffPolicyStr.isEmpty()'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
        if (bulkProcessorBackoffPolicy != null) {
            String backoffPolicyStr = bulkProcessorBackoffPolicy;
            if (backoffPolicyStr != null && backoffPolicyStr.length() > 0) {
                backoffPolicyStr = backoffPolicyStr.toLowerCase();
                if ("nobackoff".equals(backoffPolicyStr)) {
```

### SizeReplaceableByIsEmpty
`response.getBulkFailures().size() > 0` can be replaced with '!response.getBulkFailures().isEmpty()'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                        BulkByScrollResponse response = client.updateByQuery(updateByQueryRequest, RequestOptions.DEFAULT);

                        if (response.getBulkFailures().size() > 0) {
                            for (BulkItemResponse.Failure failure : response.getBulkFailures()) {
                                logger.error("Failure : cause={} , message={}", failure.getCause(), failure.getMessage());
```

## RuleId[id=StringBufferReplaceableByString]
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
in `api/src/main/java/org/apache/unomi/api/conditions/Condition.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Condition{");
        sb.append("conditionType=").append(conditionType);
        sb.append(", conditionTypeId='").append(conditionTypeId).append('\'');
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `result &= profileService.matchCondition(condition, profile, session)`
in `services/src/main/java/org/apache/unomi/services/impl/personalization/PersonalizationServiceImpl.java`
#### Snippet
```java
                Condition condition = filter.getCondition();
                if (condition != null && condition.getConditionTypeId() != null) {
                    result &= profileService.matchCondition(condition, profile, session);
                }
            }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `result &= profileService.matchCondition(condition, profile, session)`
in `services/src/main/java/org/apache/unomi/services/sorts/FilterPersonalizationStrategy.java`
#### Snippet
```java
                for (PersonalizationService.Filter filter : personalizedContent.getFilters()) {
                    Condition condition = filter.getCondition();
                    result &= profileService.matchCondition(condition, profile, session);
                }
            }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `changed |= merge(currentMap, (Map) newEntry.getValue())`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
                        changed = true;
                    } else {
                        changed |= merge(currentMap, (Map) newEntry.getValue());
                    }
                } else if (StringUtils.equals(packageName, "java.lang")) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `changed |= merge(target.get(newEntry.getKey()), newEntry.getValue())`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
                } else {
                    if (target.get(newEntry.getKey()) != null) {
                        changed |= merge(target.get(newEntry.getKey()), newEntry.getValue());
                    } else {
                        target.put(newEntry.getKey(), newEntry.getValue());
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `masterProfileChanged |= propertyMergeStrategyExecutor.mergeProperty(profileProperty, propertyType, p...`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
                for (ServiceReference<PropertyMergeStrategyExecutor> propertyMergeStrategyExecutorReference : matchingPropertyMergeStrategyExecutors) {
                    PropertyMergeStrategyExecutor propertyMergeStrategyExecutor = bundleContext.getService(propertyMergeStrategyExecutorReference);
                    masterProfileChanged |= propertyMergeStrategyExecutor.mergeProperty(profileProperty, propertyType, profilesToMerge, masterProfile);
                }
            } catch (InvalidSyntaxException e) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `isProfileOrPersonaUpdated |= processProperties(target, propsToAdd, "setIfMissing")`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/UpdatePropertiesAction.java`
#### Snippet
```java

        if (propsToAdd != null) {
            isProfileOrPersonaUpdated |= processProperties(target, propsToAdd, "setIfMissing");
        }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `isProfileOrPersonaUpdated |= processProperties(target, propsToUpdate, "alwaysSet")`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/UpdatePropertiesAction.java`
#### Snippet
```java
        Map<String, Object> propsToUpdate = (HashMap<String, Object>) event.getProperties().get(PROPS_TO_UPDATE);
        if (propsToUpdate != null) {
            isProfileOrPersonaUpdated |= processProperties(target, propsToUpdate, "alwaysSet");
        }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `isProfileOrPersonaUpdated |= processProperties(target, propsToAddToSet, "addValues")`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/UpdatePropertiesAction.java`
#### Snippet
```java
        Map<String, Object> propsToAddToSet = (HashMap<String, Object>) event.getProperties().get(PROPS_TO_ADD_TO_SET);
        if (propsToAddToSet != null) {
            isProfileOrPersonaUpdated |= processProperties(target, propsToAddToSet, "addValues");
        }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `isProfileOrPersonaUpdated |= PropertyHelper.setProperty(target, prop, null, "remove")`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/UpdatePropertiesAction.java`
#### Snippet
```java
        if (propsToDelete != null) {
            for (String prop : propsToDelete) {
                isProfileOrPersonaUpdated |= PropertyHelper.setProperty(target, prop, null, "remove");
            }
        }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `isProfileOrPersonaUpdated |= PropertyHelper.setProperty(target, prop, PropertyHelper.getValueByTypeI...`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/UpdatePropertiesAction.java`
#### Snippet
```java
            }
            if (propType != null) {
                isProfileOrPersonaUpdated |= PropertyHelper.setProperty(target, prop, PropertyHelper.getValueByTypeId(propsMap.get(prop), propType.getValueTypeId()), strategy);
            } else {
                isProfileOrPersonaUpdated |= PropertyHelper.setProperty(target, prop, propsMap.get(prop), strategy);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `isProfileOrPersonaUpdated |= PropertyHelper.setProperty(target, prop, propsMap.get(prop), strategy)`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/UpdatePropertiesAction.java`
#### Snippet
```java
                isProfileOrPersonaUpdated |= PropertyHelper.setProperty(target, prop, PropertyHelper.getValueByTypeId(propsMap.get(prop), propType.getValueTypeId()), strategy);
            } else {
                isProfileOrPersonaUpdated |= PropertyHelper.setProperty(target, prop, propsMap.get(prop), strategy);
            }
        }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `saved |= profileService.setPropertyType(property)`
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ProfileServiceEndPoint.java`
#### Snippet
```java
        boolean saved = false;
        for (PropertyType property : properties) {
            saved |= profileService.setPropertyType(property);
        }
        return saved;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `result &= ParserHelper.resolveActionType(definitionsService, action)`
in `api/src/main/java/org/apache/unomi/api/utils/ParserHelper.java`
#### Snippet
```java
        }
        for (Action action : rule.getActions()) {
            result &= ParserHelper.resolveActionType(definitionsService, action);
        }
        return result;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `executedSuccessfully &= response.isAcknowledged()`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                    putStoredScriptRequest.id(script.getKey());
                    AcknowledgedResponse response = client.putScript(putStoredScriptRequest, RequestOptions.DEFAULT);
                    executedSuccessfully &= response.isAcknowledged();
                    if (response.isAcknowledged()) {
                        logger.info("Successfully stored painless script: {}", script.getKey());
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

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `extensions/router/router-service/src/main/java/org/apache/unomi/router/services/AbstractConfigurationServiceImpl.java`
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
in `extensions/router/router-service/src/main/java/org/apache/unomi/router/services/AbstractCustomServiceImpl.java`
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
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/context/RouterCamelContext.java`
#### Snippet
```java
    private void processBundleStartup(BundleContext bundleContext) {
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

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `ESItemMixIn` has no concrete subclass
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ESItemMixIn.java`
#### Snippet
```java
 * @author dgaillard
 */
public abstract class ESItemMixIn {

    public ESItemMixIn() { }
```

### AbstractClassNeverImplemented
Abstract class `ESEventMixIn` has no concrete subclass
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ESEventMixIn.java`
#### Snippet
```java
 * This mixin is used in ESCustomObjectMapper to prevent the persistent parameter from being registered in ES
 */
public abstract class ESEventMixIn {

    public ESEventMixIn() { }
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends PropertyType`
in `extensions/router/router-api/src/main/java/org/apache/unomi/router/api/RouterUtils.java`
#### Snippet
```java
    }

    public static PropertyType getPropertyTypeById(Collection<PropertyType> propertyTypes, String propertyTypeId) {
        for (PropertyType propertyType : propertyTypes) {
            if (propertyType.getMetadata().getId().equals(propertyTypeId)) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/conditions/ConditionContextHelper.java`
#### Snippet
```java
    }

    public static <T> Collection<T> foldToASCII(Collection<T> s) {
        if (s != null) {
            return Collections2.transform(s, new Function<T, T>() {
```

### BoundedWildcard
Can generalize to `? extends PersonalizationStrategy`
in `services/src/main/java/org/apache/unomi/services/impl/personalization/PersonalizationServiceImpl.java`
#### Snippet
```java
    }

    public void addPersonalizationStrategy(ServiceReference<PersonalizationStrategy> personalizationStrategyRef) {
        PersonalizationStrategy personalizationStrategy = bundleContext.getService(personalizationStrategyRef);
        personalizationStrategies.put(personalizationStrategyRef.getProperty("personalizationStrategyId").toString(), personalizationStrategy);
```

### BoundedWildcard
Can generalize to `? extends ActionDispatcher`
in `services/src/main/java/org/apache/unomi/services/actions/impl/ActionExecutorDispatcherImpl.java`
#### Snippet
```java
    }

    public void unbindDispatcher(ServiceReference<ActionDispatcher> actionDispatcherServiceReference) {
        if (actionDispatcherServiceReference == null) {
            return;
```

### BoundedWildcard
Can generalize to `? extends ActionExecutor`
in `services/src/main/java/org/apache/unomi/services/actions/impl/ActionExecutorDispatcherImpl.java`
#### Snippet
```java
    }

    public void bindExecutor(ServiceReference<ActionExecutor> actionExecutorServiceReference) {
        ActionExecutor actionExecutor = bundleContext.getService(actionExecutorServiceReference);
        executors.put(actionExecutorServiceReference.getProperty("actionExecutorId").toString(), actionExecutor);
```

### BoundedWildcard
Can generalize to `? extends ActionDispatcher`
in `services/src/main/java/org/apache/unomi/services/actions/impl/ActionExecutorDispatcherImpl.java`
#### Snippet
```java
    }

    public void bindDispatcher(ServiceReference<ActionDispatcher> actionDispatcherServiceReference) {
        ActionDispatcher actionDispatcher = bundleContext.getService(actionDispatcherServiceReference);
        actionDispatchers.put(actionDispatcher.getPrefix(), actionDispatcher);
```

### BoundedWildcard
Can generalize to `? super String`
in `services/src/main/java/org/apache/unomi/services/impl/events/EventServiceImpl.java`
#### Snippet
```java
    }

    public void setRestrictedEventTypeIds(Set<String> restrictedEventTypeIds) {
        this.restrictedEventTypeIds = restrictedEventTypeIds;
    }
```

### BoundedWildcard
Can generalize to `? extends EventListenerService`
in `services/src/main/java/org/apache/unomi/services/impl/events/EventServiceImpl.java`
#### Snippet
```java
    }

    public void bind(ServiceReference<EventListenerService> serviceReference) {
        EventListenerService eventListenerService = bundleContext.getService(serviceReference);
        eventListeners.add(eventListenerService);
```

### BoundedWildcard
Can generalize to `? extends EventListenerService`
in `services/src/main/java/org/apache/unomi/services/impl/events/EventServiceImpl.java`
#### Snippet
```java
    }

    public void unbind(ServiceReference<EventListenerService> serviceReference) {
        if (serviceReference != null) {
            EventListenerService eventListenerService = bundleContext.getService(serviceReference);
```

### BoundedWildcard
Can generalize to `? super EventProperty`
in `services/src/main/java/org/apache/unomi/services/impl/events/EventServiceImpl.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private void getEventProperties(Map<String, Map<String, Object>> mappings, List<EventProperty> props, String prefix) {
        for (Map.Entry<String, Map<String, Object>> e : mappings.entrySet()) {
            if (e.getValue().get("properties") != null) {
```

### BoundedWildcard
Can generalize to `? extends Profile`
in `services/src/main/java/org/apache/unomi/services/mergers/DefaultPropertyMergeStrategyExecutor.java`
#### Snippet
```java

public class DefaultPropertyMergeStrategyExecutor implements PropertyMergeStrategyExecutor {
    public boolean mergeProperty(String propertyName, PropertyType propertyType, List<Profile> profilesToMerge, Profile targetProfile) {
        boolean modified = false;
        for (Profile profileToMerge : profilesToMerge) {
```

### BoundedWildcard
Can generalize to `? extends Profile`
in `services/src/main/java/org/apache/unomi/services/mergers/MostRecentPropertyMergeStrategyExecutor.java`
#### Snippet
```java

public class MostRecentPropertyMergeStrategyExecutor implements PropertyMergeStrategyExecutor {
    public boolean mergeProperty(String propertyName, PropertyType propertyType, List<Profile> profilesToMerge, Profile targetProfile) {
        Object result = null;
        int i = profilesToMerge.size() - 1;
```

### BoundedWildcard
Can generalize to `? extends RuleListenerService`
in `services/src/main/java/org/apache/unomi/services/impl/rules/RulesServiceImpl.java`
#### Snippet
```java
    }

    public void unbind(ServiceReference<RuleListenerService> serviceReference) {
        if (serviceReference != null) {
            RuleListenerService ruleListenerService = bundleContext.getService(serviceReference);
```

### BoundedWildcard
Can generalize to `? extends RuleListenerService`
in `services/src/main/java/org/apache/unomi/services/impl/rules/RulesServiceImpl.java`
#### Snippet
```java
    }

    public void bind(ServiceReference<RuleListenerService> serviceReference) {
        RuleListenerService ruleListenerService = bundleContext.getService(serviceReference);
        ruleListeners.add(ruleListenerService);
```

### BoundedWildcard
Can generalize to `? extends Rule`
in `services/src/main/java/org/apache/unomi/services/impl/rules/RulesServiceImpl.java`
#### Snippet
```java
    }

    private Map<String, Set<Rule>> getRulesByEventType(List<Rule> rules) {
        Map<String, Set<Rule>> newRulesByEventType = new HashMap<>();
        for (Rule rule : rules) {
```

### BoundedWildcard
Can generalize to `? super String`
in `services/src/main/java/org/apache/unomi/services/impl/rules/RulesServiceImpl.java`
#### Snippet
```java
    }

    private void updateRulesByEventType(Map<String, Set<Rule>> rulesByEventType, Rule rule) {
        Set<String> eventTypeIds = ParserHelper.resolveConditionEventTypes(rule.getCondition());
        if (eventTypeIds.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends Profile`
in `services/src/main/java/org/apache/unomi/services/mergers/AddPropertyMergeStrategyExecutor.java`
#### Snippet
```java

public class AddPropertyMergeStrategyExecutor implements PropertyMergeStrategyExecutor {
    public boolean mergeProperty(String propertyName, PropertyType propertyType, List<Profile> profilesToMerge, Profile targetProfile) {
        Object targetPropertyValue = targetProfile.getProperty(propertyName);
        Object result = targetPropertyValue;
```

### BoundedWildcard
Can generalize to `? super String`
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
    }

    private void managedBundleEvent(Bundle bundle, Map<String, Boolean> bundles, Boolean start) {
        if (bundle.getSymbolicName().startsWith("org.apache.unomi") && bundles.containsKey(bundle.getSymbolicName())) {
            logger.info("Bundle {} was {}.", bundle.getSymbolicName(), start ? "started" : "stopped");
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
    }

    private void managedBundleEvent(Bundle bundle, Map<String, Boolean> bundles, Boolean start) {
        if (bundle.getSymbolicName().startsWith("org.apache.unomi") && bundles.containsKey(bundle.getSymbolicName())) {
            logger.info("Bundle {} was {}.", bundle.getSymbolicName(), start ? "started" : "stopped");
```

### BoundedWildcard
Can generalize to `? super String`
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
    }

    private void checkInBundlesList(Bundle bundle, Map<String, Boolean> bundles) {
        if (bundle.getSymbolicName().startsWith("org.apache.unomi") && bundles.containsKey(bundle.getSymbolicName())) {
            if (bundle.getState() == Bundle.ACTIVE) {
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
    }

    private void checkInBundlesList(Bundle bundle, Map<String, Boolean> bundles) {
        if (bundle.getSymbolicName().startsWith("org.apache.unomi") && bundles.containsKey(bundle.getSymbolicName())) {
            if (bundle.getState() == Bundle.ACTIVE) {
```

### BoundedWildcard
Can generalize to `? extends Metadata`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPListConnection.java`
#### Snippet
```java
    private final PartialList<Metadata> userLists;

    public CDPListConnection(final PartialList<Metadata> userLists) {
        this.userLists = userLists;
    }
```

### BoundedWildcard
Can generalize to `? extends Profile`
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
    }

    private void sendProfileUpdatedEvent(List<Profile> profiles) {
        for (Profile profileToAdd : profiles) {
            sendProfileUpdatedEvent(profileToAdd);
```

### BoundedWildcard
Can generalize to `? extends Rule`
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
    }

    private void clearAutoGeneratedRules(List<Rule> rules, String idWithScope) {
        for (Rule previousRule : rules) {
            previousRule.getLinkedItems().removeAll(Collections.singleton(idWithScope));
```

### BoundedWildcard
Can generalize to `? extends ScoringElement`
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
    }

    private void updateExistingProfilesForScoring(String scoringId, List<ScoringElement> scoringElements, boolean isEnabled) {
        long startTime = System.currentTimeMillis();

```

### BoundedWildcard
Can generalize to `? extends Profile`
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
    }

    private void batchUpdateProfilesSegment(String segmentId, List<Profile> profiles, boolean isAdd) {
        Map<Item, Map> profileToPropertiesMap = new HashMap<>();
        for (Profile profileToUpdate : profiles) {
```

### BoundedWildcard
Can generalize to `? super Rule`
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
    }

    private void getAutoGeneratedRules(Metadata metadata, Condition condition, Condition parentCondition, List<Rule> rules) {
        Set<String> tags = condition.getConditionType().getMetadata().getSystemTags();
        if (tags.contains("eventCondition") && !tags.contains("profileCondition")) {
```

### BoundedWildcard
Can generalize to `? super GraphQLInputObjectField`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/PropertyFilterUtils.java`
#### Snippet
```java
    }

    private static void addFilters(final List<GraphQLInputObjectField> fieldDefinitions, final GraphQLSchemaProvider.DefinitionType propertyType, final GraphQLAnnotations graphQLAnnotations) {
        final String propertyName = PropertyNameTranslator.translateFromUnomiToGraphQL(propertyType.getName());

```

### BoundedWildcard
Can generalize to `? extends GraphQLSchemaProvider.DefinitionType`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/PropertyFilterUtils.java`
#### Snippet
```java
public class PropertyFilterUtils {

    public static List<GraphQLInputObjectField> buildInputPropertyFilters(final Collection<GraphQLSchemaProvider.DefinitionType> propertyTypes, final GraphQLAnnotations graphQLAnnotations) {
        if (propertyTypes == null || propertyTypes.isEmpty()) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? super String`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
    }

    private boolean merge(Map<String, Object> target, Map<String, Object> object) {
        boolean changed = false;
        for (Map.Entry<String, Object> newEntry : object.entrySet()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
        }

        private void updateListMap(Map<String, List<PropertyType>> listMap, PropertyType propertyType, String key) {
            List<PropertyType> propertyTypes = listMap.get(key);
            if (propertyTypes == null) {
```

### BoundedWildcard
Can generalize to `? extends PropertyType`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
         * @return new instance
         */
        public PropertyTypes with(List<PropertyType> newProperties) {
            Map<String, PropertyType> updatedProperties = new HashMap<>();
            for (PropertyType property : newProperties) {
```

### BoundedWildcard
Can generalize to `? extends PropertyType`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
        private Map<String, List<PropertyType>> propertyTypesByTarget = new HashMap<>();

        public PropertyTypes(List<PropertyType> allPropertyTypes) {
            this.allPropertyTypes = new ArrayList<>(allPropertyTypes);
            propertyTypesById = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? super String`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
    }

    private boolean mergeSystemProperties(Map<String, Object> targetProperties, Map<String, Object> sourceProperties) {
        boolean changed = false;
        for (Map.Entry<String, Object> sourceProperty : sourceProperties.entrySet()) {
```

### BoundedWildcard
Can generalize to `? extends CDPPropertyInput`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/CreateOrUpdateProfilePropertiesCommand.java`
#### Snippet
```java
        final List<CDPPropertyInput> properties;

        Builder(final List<CDPPropertyInput> properties) {
            this.properties = properties;
        }
```

### BoundedWildcard
Can generalize to `? extends Segment`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/SegmentConnectionDataFetcher.java`
#### Snippet
```java
public abstract class SegmentConnectionDataFetcher extends BaseConnectionDataFetcher<CDPSegmentConnection> {

    protected CDPSegmentConnection createSegmentConnection(PartialList<Segment> segments) {
        final List<CDPSegmentEdge> segmentEdges = segments.getList().stream().map(segment -> new CDPSegmentEdge(new CDPSegment(segment), segment.getItemId())).collect(Collectors.toList());
        final CDPPageInfo pageInfo = new CDPPageInfo(
```

### BoundedWildcard
Can generalize to `? extends Event`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/EventConnectionDataFetcher.java`
#### Snippet
```java
public abstract class EventConnectionDataFetcher extends BaseConnectionDataFetcher<CDPEventConnection> {

    protected CDPEventConnection createEventConnection(PartialList<Event> events) {
        final List<CDPEventEdge> eventEdges = events.getList().stream().map(CDPEventEdge::new).collect(Collectors.toList());
        final CDPPageInfo pageInfo = new CDPPageInfo(
```

### BoundedWildcard
Can generalize to `? extends Profile`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/ProfileConnectionDataFetcher.java`
#### Snippet
```java
public abstract class ProfileConnectionDataFetcher extends BaseConnectionDataFetcher<CDPProfileConnection> {

    protected CDPProfileConnection createProfileConnection(PartialList<Profile> profiles) {
        final List<CDPProfileEdge> eventEdges = profiles.getList().stream()
                .map(CDPProfileEdge::new)
```

### BoundedWildcard
Can generalize to `? extends CDPOrderByInput`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/BaseConnectionDataFetcher.java`
#### Snippet
```java
    }

    protected Query buildQuery(final Condition condition, final List<CDPOrderByInput> orderByInputs, final ConnectionParams params) {
        final Query query = new Query();
        query.setCondition(condition);
```

### BoundedWildcard
Can generalize to `? extends PropertyType`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/profile/PropertiesConnectionDataFetcher.java`
#### Snippet
```java
    }

    private CDPPropertyConnection createPropertiesConnection(Collection<PropertyType> properties, ConnectionParams params) {
        final int startIndex = Math.max(0, params.getOffset());
        final int lastIndex = Math.min(params.getOffset() + params.getSize(), properties.size());
```

### BoundedWildcard
Can generalize to `? extends Condition`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentProfileIDsConditionParser.java`
#### Snippet
```java
    private final List<Condition> conditions;

    public SegmentProfileIDsConditionParser(List<Condition> conditions) {
        this.conditions = conditions;
    }
```

### BoundedWildcard
Can generalize to `? extends CDPNamedFilterInput`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/profile/ProfileMatchesDataFetcher.java`
#### Snippet
```java
    private final List<CDPNamedFilterInput> namedFilters;

    public ProfileMatchesDataFetcher(Profile profile, List<CDPNamedFilterInput> namedFilters) {
        this.profile = profile;
        this.namedFilters = namedFilters;
```

### BoundedWildcard
Can generalize to `? extends Condition`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentProfileConsentsConditionParser.java`
#### Snippet
```java
    private final List<Condition> conditions;

    public SegmentProfileConsentsConditionParser(List<Condition> conditions) {
        this.conditions = conditions;
    }
```

### BoundedWildcard
Can generalize to `? extends Condition`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentProfileListConditionParser.java`
#### Snippet
```java
    private final List<Condition> conditions;

    public SegmentProfileListConditionParser(List<Condition> conditions) {
        this.conditions = conditions;
    }
```

### BoundedWildcard
Can generalize to `? extends Condition`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentProfileSegmentsConditionParser.java`
#### Snippet
```java
    private final List<Condition> conditions;

    public SegmentProfileSegmentsConditionParser(List<Condition> conditions) {
        this.conditions = conditions;
    }
```

### BoundedWildcard
Can generalize to `? extends Condition`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentProfilePropertiesConditionParser.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private Map<String, Object> processSetConditions(final List<Condition> conditions) {
        final Map<Integer, List<Condition>> groupedConditionsByDeepLevels = new TreeMap<>();

```

### BoundedWildcard
Can generalize to `? super String`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentProfileEventsConditionParser.java`
#### Snippet
```java
    }

    private void processEventPropertyCondition(final Condition condition, final Map<String, Object> fieldsMap) {
        final Map<String, Object> fieldAsTuple = createProfileEventPropertyField(condition);
        if (fieldAsTuple.size() == 2) {
```

### BoundedWildcard
Can generalize to `? super String`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentProfileEventsConditionParser.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private void processDynamicEventField(final Condition condition, final Map<String, Object> container) {
        final List<Condition> subConditions = (List<Condition>) condition.getParameter("subConditions");

```

### BoundedWildcard
Can generalize to `? extends INPUT`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/factories/ConditionFactory.java`
#### Snippet
```java

    public <INPUT> Condition filtersToCondition(
            final List<INPUT> inputFilters,
            final List<Map<String, Object>> filterInputAsMap,
            final BiFunction<INPUT, Map<String, Object>, Condition> function,
```

### BoundedWildcard
Can generalize to `? extends Map`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/factories/ConditionFactory.java`
#### Snippet
```java
    public <INPUT> Condition filtersToCondition(
            final List<INPUT> inputFilters,
            final List<Map<String, Object>> filterInputAsMap,
            final BiFunction<INPUT, Map<String, Object>, Condition> function,
            final String operator) {
```

### BoundedWildcard
Can generalize to `? super INPUT`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/factories/ConditionFactory.java`
#### Snippet
```java
            final List<INPUT> inputFilters,
            final List<Map<String, Object>> filterInputAsMap,
            final BiFunction<INPUT, Map<String, Object>, Condition> function,
            final String operator) {
        final List<Condition> subConditions = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super Map`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/factories/ConditionFactory.java`
#### Snippet
```java
            final List<INPUT> inputFilters,
            final List<Map<String, Object>> filterInputAsMap,
            final BiFunction<INPUT, Map<String, Object>, Condition> function,
            final String operator) {
        final List<Condition> subConditions = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends Condition`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/factories/ConditionFactory.java`
#### Snippet
```java
            final List<INPUT> inputFilters,
            final List<Map<String, Object>> filterInputAsMap,
            final BiFunction<INPUT, Map<String, Object>, Condition> function,
            final String operator) {
        final List<Condition> subConditions = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends INPUT`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/factories/ConditionFactory.java`
#### Snippet
```java

    public <INPUT> Condition filtersToCondition(
            final List<INPUT> inputFilters, final Function<INPUT, Condition> function, final String operator) {
        final List<Condition> subConditions = inputFilters.stream()
                .map(function)
```

### BoundedWildcard
Can generalize to `? super INPUT`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/factories/ConditionFactory.java`
#### Snippet
```java

    public <INPUT> Condition filtersToCondition(
            final List<INPUT> inputFilters, final Function<INPUT, Condition> function, final String operator) {
        final List<Condition> subConditions = inputFilters.stream()
                .map(function)
```

### BoundedWildcard
Can generalize to `? extends Condition`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/factories/ConditionFactory.java`
#### Snippet
```java

    public <INPUT> Condition filtersToCondition(
            final List<INPUT> inputFilters, final Function<INPUT, Condition> function, final String operator) {
        final List<Condition> subConditions = inputFilters.stream()
                .map(function)
```

### BoundedWildcard
Can generalize to `? extends T`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/providers/CompositeGraphQLFieldVisibility.java`
#### Snippet
```java
    }

    private static <T extends GraphQLNamedSchemaElement> List<T> intersect(List<T> prev, List<T> curr) {
        return curr.
                stream().
```

### BoundedWildcard
Can generalize to `? extends GraphQLFieldVisibilityProvider`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/providers/CompositeGraphQLFieldVisibility.java`
#### Snippet
```java
    private final List<GraphQLFieldVisibilityProvider> providers;

    public CompositeGraphQLFieldVisibility(List<GraphQLFieldVisibilityProvider> providers) {
        this.providers = providers;
        if (providers != null && !providers.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends Profile`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/MergeProfilesOnPropertyAction.java`
#### Snippet
```java
    }

    private void reassignSession(Event event, List<Profile> existingMergedProfiles, boolean forceEventProfileAsMaster, String mergePropName, String mergePropValue) {
        Profile eventProfile = event.getProfile();

```

### BoundedWildcard
Can generalize to `? super QueryBuilder`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/SourceEventPropertyConditionESQueryBuilder.java`
#### Snippet
```java
    }

    private void appendFilderIfPropExist(List<QueryBuilder> queryBuilders, Condition condition, String prop){
        final Object parameter = condition.getParameter(prop);
        if (parameter != null && !"".equals(parameter)) {
```

### BoundedWildcard
Can generalize to `? super Condition`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/SourceEventPropertyConditionEvaluator.java`
#### Snippet
```java
    private DefinitionsService definitionsService;

    private void appendConditionIfPropExist(List<Condition> conditions, Condition condition, String prop, ConditionType propConditionType) {
        final Object parameter = condition.getParameter(prop);
        if (parameter != null && !"".equals(parameter)) {
```

### BoundedWildcard
Can generalize to `? extends DefinitionType`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaProvider.java`
#### Snippet
```java
            final GraphQLObjectType graphQLObjectType,
            final Class<? extends DynamicFieldDataFetcher> fetcherClass,
            final Collection<DefinitionType> propertyTypes) {
        final GraphQLCodeRegistry.Builder codeRegisterBuilder = graphQLAnnotations.getContainer().getCodeRegistryBuilder();

```

### BoundedWildcard
Can generalize to `? extends DefinitionType`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaProvider.java`
#### Snippet
```java
    private void registerDynamicInputFields(final String graphQLTypeName,
            final GraphQLInputObjectType graphQLInputObjectType,
            final Collection<DefinitionType> propertyTypes) {
        final List<GraphQLInputObjectField> fieldDefinitions = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends DefinitionType`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaProvider.java`
#### Snippet
```java

    private GraphQLInputObjectType createDynamicInputType(final String name,
                                                          final List<DefinitionType> propertyTypes,
                                                          final boolean isEvent,
                                                          Deque<String> typeStack) {
```

### BoundedWildcard
Can generalize to `? extends DefinitionType`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaProvider.java`
#### Snippet
```java
    }

    private GraphQLObjectType createDynamicOutputType(final String name, final List<DefinitionType> propertyTypes, final Set<Class> interfaces, final GraphQLCodeRegistry.Builder codeRegisterBuilder) {
        final String typeName = StringUtils.capitalize(PropertyNameTranslator.translateFromUnomiToGraphQL(name));

```

### BoundedWildcard
Can generalize to `? extends PropertyType`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/factories/ProfileConditionFactory.java`
#### Snippet
```java
            final Object propertyValue,
            final String typeName,
            final Map<String, PropertyType> propertyTypeMap,
            final Map<String, Object> filterAsMap,
            final List<Condition> subConditions) {
```

### BoundedWildcard
Can generalize to `? super Condition`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/factories/ProfileConditionFactory.java`
#### Snippet
```java
            final Map<String, PropertyType> propertyTypeMap,
            final Map<String, Object> filterAsMap,
            final List<Condition> subConditions) {
        if (propertyTypeMap.containsKey(propertyName) && "set".equals(propertyTypeMap.get(propertyName).getValueTypeId())) {
            final Map<String, Object> setFilterAsMap = (Map<String, Object>) filterAsMap.get(propertyName);
```

### BoundedWildcard
Can generalize to `? extends PropertyType`
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ProfileServiceEndPoint.java`
#### Snippet
```java
    @POST
    @Path("/properties/bulk")
    public boolean setPropertyTypes(List<PropertyType> properties) {
        boolean saved = false;
        for (PropertyType property : properties) {
```

### BoundedWildcard
Can generalize to `? extends ConditionType`
in `rest/src/main/java/org/apache/unomi/rest/service/impl/LocalizationHelper.java`
#### Snippet
```java
     * @return a collection of {@link RESTConditionType}s based on the specified {@link ConditionType}s and localized using the specified language
     */
    public Collection<RESTConditionType> generateConditions(Collection<ConditionType> conditionTypes, String language) {
        List<RESTConditionType> result = new ArrayList<RESTConditionType>();
        if (conditionTypes == null) {
```

### BoundedWildcard
Can generalize to `? extends ActionType`
in `rest/src/main/java/org/apache/unomi/rest/service/impl/LocalizationHelper.java`
#### Snippet
```java
     * @return a collection of {@link RESTActionType}s based on the specified {@link ActionType}s and localized using the specified language
     */
    public Collection<RESTActionType> generateActions(Collection<ActionType> actionTypes, String language) {
        List<RESTActionType> result = new ArrayList<RESTActionType>();
        if (actionTypes == null) {
```

### BoundedWildcard
Can generalize to `? extends ValueType`
in `rest/src/main/java/org/apache/unomi/rest/service/impl/LocalizationHelper.java`
#### Snippet
```java
     * @return a collection of {@link RESTValueType}s based on the specified {@link ValueType}s and localized using the specified language
     */
    public Collection<RESTValueType> generateValueTypes(Collection<ValueType> valueTypes, String language) {
        List<RESTValueType> result = new ArrayList<RESTValueType>();
        if (valueTypes == null) {
```

### BoundedWildcard
Can generalize to `? extends Event`
in `rest/src/main/java/org/apache/unomi/rest/service/impl/RestServiceUtilsImpl.java`
#### Snippet
```java

    @Override
    public EventsRequestContext performEventsRequest(List<Event> events, EventsRequestContext eventsRequestContext) {
        List<String> filteredEventTypes = privacyService.getFilteredEventTypes(eventsRequestContext.getProfile());
        String thirdPartyId = eventService.authenticateThirdPartyServer(eventsRequestContext.getRequest().getHeader("X-Unomi-Peer"),
```

### BoundedWildcard
Can generalize to `? extends ImportConfiguration`
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/ImportConfigByFileNameProcessor.java`
#### Snippet
```java
    }

    public void setImportConfigurationService(ImportExportConfigurationService<ImportConfiguration> importConfigurationService) {
        this.importConfigurationService = importConfigurationService;
    }
```

### BoundedWildcard
Can generalize to `? extends ExportConfiguration`
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/route/ProfileExportCollectRouteBuilder.java`
#### Snippet
```java
    }

    public void setExportConfigurationList(List<ExportConfiguration> exportConfigurationList) {
        this.exportConfigurationList = exportConfigurationList;
    }
```

### BoundedWildcard
Can generalize to `? extends ImportConfiguration`
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/route/ProfileImportFromSourceRouteBuilder.java`
#### Snippet
```java
    }

    public void setImportConfigurationList(List<ImportConfiguration> importConfigurationList) {
        this.importConfigurationList = importConfigurationList;
    }
```

### BoundedWildcard
Can generalize to `? extends StdDeserializer`
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/CustomObjectMapper.java`
#### Snippet
```java
    }

    public CustomObjectMapper(Map<Class, StdDeserializer<?>> deserializers) {
        super();
        super.registerModule(new JaxbAnnotationModule());
```

### BoundedWildcard
Can generalize to `? extends ValueExtractor`
in `api/src/main/java/org/apache/unomi/api/utils/ParserHelper.java`
#### Snippet
```java
    }

    public static Object extractValue(String s, Event event, Map<String, ValueExtractor> valueExtractors) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Object value = null;

```

### BoundedWildcard
Can generalize to `? extends PathSegment`
in `extensions/geonames/rest/src/main/java/org/apache/unomi/geonames/rest/GeonamesEndPoint.java`
#### Snippet
```java
    @GET
    @Path("/cities/{items:.*}")
    public PartialList<GeonameEntry> getChildrenCities(@PathParam("items") List<PathSegment> items, @HeaderParam("Accept-Language") String language) {
        List<String> l = new ArrayList<>();
        for (PathSegment item : items) {
```

### BoundedWildcard
Can generalize to `? extends GeonameEntry`
in `extensions/geonames/rest/src/main/java/org/apache/unomi/geonames/rest/GeonamesEndPoint.java`
#### Snippet
```java
    }

    private void translate(List<GeonameEntry> l, Locale locale) {
        for (GeonameEntry entry : l) {
            if (GeonamesService.COUNTRY_FEATURE_CODES.contains(entry.getFeatureCode())) {
```

### BoundedWildcard
Can generalize to `? extends PathSegment`
in `extensions/geonames/rest/src/main/java/org/apache/unomi/geonames/rest/GeonamesEndPoint.java`
#### Snippet
```java
    @GET
    @Path("/entries/{items:.*}")
    public PartialList<GeonameEntry> getChildrenEntries(@PathParam("items") List<PathSegment> items, @HeaderParam("Accept-Language") String language) {
        List<String> l = new ArrayList<>();
        for (PathSegment item : items) {
```

### BoundedWildcard
Can generalize to `? extends JsonSchemaWrapper`
in `extensions/json-schema/services/src/main/java/org/apache/unomi/schema/impl/SchemaServiceImpl.java`
#### Snippet
```java
    }

    private void initExtensions(Map<String, JsonSchemaWrapper> schemas) {
        Map<String, Set<String>> extensionsReloaded = new HashMap<>();
        // lookup extensions
```

### BoundedWildcard
Can generalize to `? super String`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
    }

    private void addConsents(Profile profile, Map<String, Object> sfdcLeadFields) {
        Map<String, Consent> consents = profile.getConsents();
        String mappingConsentsString = sfdcConfiguration.getSfdcFieldsConsents();
```

### BoundedWildcard
Can generalize to `? extends ConditionEvaluator`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
    }

    public void bindConditionEvaluator(ServiceReference<ConditionEvaluator> conditionEvaluatorServiceReference) {
        ConditionEvaluator conditionEvaluator = bundleContext.getService(conditionEvaluatorServiceReference);
        conditionEvaluatorDispatcher.addEvaluator(conditionEvaluatorServiceReference.getProperty("conditionEvaluatorId").toString(), conditionEvaluator);
```

### BoundedWildcard
Can generalize to `? extends T`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java

    @Override
    public <T extends Item> PartialList<T> continueScrollQuery(final Class<T> clazz, final String scrollIdentifier, final String scrollTimeValidity) {
        return new InClassLoaderExecute<PartialList<T>>(metricsService, this.getClass().getName() + ".continueScrollQuery", this.bundleContext, this.fatalIllegalStateErrors, throwExceptions) {

```

### BoundedWildcard
Can generalize to `? extends Item`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java

    @Override
    public List<String> update(final Map<Item, Map> items, final Date dateHint, final Class clazz) {
        if (items.size() == 0)
            return new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends Map`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java

    @Override
    public List<String> update(final Map<Item, Map> items, final Date dateHint, final Class clazz) {
        if (items.size() == 0)
            return new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends T`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
    }

    private <T extends Item> PartialList<T> query(final QueryBuilder query, final String sortBy, final Class<T> clazz, final String customItemType, final int offset, final int size, final String[] routing, final String scrollTimeValidity) {
        return new InClassLoaderExecute<PartialList<T>>(metricsService, this.getClass().getName() + ".query", this.bundleContext, this.fatalIllegalStateErrors, throwExceptions) {

```

### BoundedWildcard
Can generalize to `? extends Map`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
    }

    private Map<String, Object> getPropertyMapping(String property, Map<String, Map<String, Object>> mappings) {
        Map<String, Object> propMapping = null;
        String[] properties = StringUtils.split(property, '.');
```

### BoundedWildcard
Can generalize to `? super String`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
    }

    private void mergePropertiesMapping(Map<String, Object> result, Map<String, Object> entry) {
        if (entry == null || entry.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends ConditionESQueryBuilder`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
    }

    public void bindConditionESQueryBuilder(ServiceReference<ConditionESQueryBuilder> conditionESQueryBuilderServiceReference) {
        ConditionESQueryBuilder conditionESQueryBuilder = bundleContext.getService(conditionESQueryBuilderServiceReference);
        conditionESQueryBuilderDispatcher.addQueryBuilder(conditionESQueryBuilderServiceReference.getProperty("queryBuilderId").toString(), conditionESQueryBuilder);
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final @GraphQLNonNull @GraphQLName("name")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPRecommendationInput.java`
#### Snippet
```java

    public CDPRecommendationInput(
            final @GraphQLNonNull @GraphQLName("name") String name) {
        this.name = name;
    }
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLNonNull @GraphQLName("id")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileIDInput.java`
#### Snippet
```java

    public CDPProfileIDInput(
            final @GraphQLID @GraphQLNonNull @GraphQLName("id") String id,
            final @GraphQLNonNull @GraphQLName("client") CDPClientInput client) {
        this.id = id;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLNonNull @GraphQLName("client")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileIDInput.java`
#### Snippet
```java
    public CDPProfileIDInput(
            final @GraphQLID @GraphQLNonNull @GraphQLName("id") String id,
            final @GraphQLNonNull @GraphQLName("client") CDPClientInput client) {
        this.id = id;
        this.client = client;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("identifier")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPropertyInput.java`
#### Snippet
```java

    public CDPPropertyInput(
            final @GraphQLName("identifier") CDPIdentifierPropertyInput identifierPropertyTypeInput,
            final @GraphQLName("string") CDPStringPropertyInput stringPropertyTypeInput,
            final @GraphQLName("int") CDPIntPropertyInput integerPropertyTypeInput,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("string")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPropertyInput.java`
#### Snippet
```java
    public CDPPropertyInput(
            final @GraphQLName("identifier") CDPIdentifierPropertyInput identifierPropertyTypeInput,
            final @GraphQLName("string") CDPStringPropertyInput stringPropertyTypeInput,
            final @GraphQLName("int") CDPIntPropertyInput integerPropertyTypeInput,
            final @GraphQLName("long") CDPLongPropertyInput longPropertyTypeInput,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("int")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPropertyInput.java`
#### Snippet
```java
            final @GraphQLName("identifier") CDPIdentifierPropertyInput identifierPropertyTypeInput,
            final @GraphQLName("string") CDPStringPropertyInput stringPropertyTypeInput,
            final @GraphQLName("int") CDPIntPropertyInput integerPropertyTypeInput,
            final @GraphQLName("long") CDPLongPropertyInput longPropertyTypeInput,
            final @GraphQLName("float") CDPFloatPropertyInput floatPropertyTypeInput,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("long")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPropertyInput.java`
#### Snippet
```java
            final @GraphQLName("string") CDPStringPropertyInput stringPropertyTypeInput,
            final @GraphQLName("int") CDPIntPropertyInput integerPropertyTypeInput,
            final @GraphQLName("long") CDPLongPropertyInput longPropertyTypeInput,
            final @GraphQLName("float") CDPFloatPropertyInput floatPropertyTypeInput,
            final @GraphQLName("date") CDPDatePropertyInput datePropertyTypeInput,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("float")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPropertyInput.java`
#### Snippet
```java
            final @GraphQLName("int") CDPIntPropertyInput integerPropertyTypeInput,
            final @GraphQLName("long") CDPLongPropertyInput longPropertyTypeInput,
            final @GraphQLName("float") CDPFloatPropertyInput floatPropertyTypeInput,
            final @GraphQLName("date") CDPDatePropertyInput datePropertyTypeInput,
            final @GraphQLName("boolean") CDPBooleanPropertyInput booleanPropertyTypeInput,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("date")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPropertyInput.java`
#### Snippet
```java
            final @GraphQLName("long") CDPLongPropertyInput longPropertyTypeInput,
            final @GraphQLName("float") CDPFloatPropertyInput floatPropertyTypeInput,
            final @GraphQLName("date") CDPDatePropertyInput datePropertyTypeInput,
            final @GraphQLName("boolean") CDPBooleanPropertyInput booleanPropertyTypeInput,
            final @GraphQLName("geopoint") CDPGeoPointPropertyInput geoPointPropertyTypeInput,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("boolean")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPropertyInput.java`
#### Snippet
```java
            final @GraphQLName("float") CDPFloatPropertyInput floatPropertyTypeInput,
            final @GraphQLName("date") CDPDatePropertyInput datePropertyTypeInput,
            final @GraphQLName("boolean") CDPBooleanPropertyInput booleanPropertyTypeInput,
            final @GraphQLName("geopoint") CDPGeoPointPropertyInput geoPointPropertyTypeInput,
            final @GraphQLName("set") CDPSetPropertyInput setPropertyTypeInput,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("geopoint")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPropertyInput.java`
#### Snippet
```java
            final @GraphQLName("date") CDPDatePropertyInput datePropertyTypeInput,
            final @GraphQLName("boolean") CDPBooleanPropertyInput booleanPropertyTypeInput,
            final @GraphQLName("geopoint") CDPGeoPointPropertyInput geoPointPropertyTypeInput,
            final @GraphQLName("set") CDPSetPropertyInput setPropertyTypeInput,
            final @GraphQLName("json") CDPJsonPropertyInput jsonPropertyTypeInput) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("set")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPropertyInput.java`
#### Snippet
```java
            final @GraphQLName("boolean") CDPBooleanPropertyInput booleanPropertyTypeInput,
            final @GraphQLName("geopoint") CDPGeoPointPropertyInput geoPointPropertyTypeInput,
            final @GraphQLName("set") CDPSetPropertyInput setPropertyTypeInput,
            final @GraphQLName("json") CDPJsonPropertyInput jsonPropertyTypeInput) {
        this.identifierPropertyTypeInput = identifierPropertyTypeInput;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("json")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPropertyInput.java`
#### Snippet
```java
            final @GraphQLName("geopoint") CDPGeoPointPropertyInput geoPointPropertyTypeInput,
            final @GraphQLName("set") CDPSetPropertyInput setPropertyTypeInput,
            final @GraphQLName("json") CDPJsonPropertyInput jsonPropertyTypeInput) {
        this.identifierPropertyTypeInput = identifierPropertyTypeInput;
        this.stringPropertyTypeInput = stringPropertyTypeInput;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("joinLists")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListsUpdateEventInput.java`
#### Snippet
```java
    private List<String> leaveLists;

    public CDPListsUpdateEventInput(final @GraphQLName("joinLists") List<String> joinLists,
                                    final @GraphQLName("leaveLists") List<String> leaveLists) {
        this.joinLists = joinLists;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("leaveLists")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListsUpdateEventInput.java`
#### Snippet
```java

    public CDPListsUpdateEventInput(final @GraphQLName("joinLists") List<String> joinLists,
                                    final @GraphQLName("leaveLists") List<String> leaveLists) {
        this.joinLists = joinLists;
        this.leaveLists = leaveLists;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLNonNull @GraphQLName("type")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventInput.java`
#### Snippet
```java

    public CDPConsentUpdateEventInput(
            final @GraphQLNonNull @GraphQLName("type") String type,
            final @GraphQLName("status") String status,
            final @GraphQLName("lastUpdate") OffsetDateTime lastUpdate,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("status")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventInput.java`
#### Snippet
```java
    public CDPConsentUpdateEventInput(
            final @GraphQLNonNull @GraphQLName("type") String type,
            final @GraphQLName("status") String status,
            final @GraphQLName("lastUpdate") OffsetDateTime lastUpdate,
            final @GraphQLName("expiration") OffsetDateTime expiration) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("lastUpdate")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventInput.java`
#### Snippet
```java
            final @GraphQLNonNull @GraphQLName("type") String type,
            final @GraphQLName("status") String status,
            final @GraphQLName("lastUpdate") OffsetDateTime lastUpdate,
            final @GraphQLName("expiration") OffsetDateTime expiration) {
        this.type = type;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("expiration")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventInput.java`
#### Snippet
```java
            final @GraphQLName("status") String status,
            final @GraphQLName("lastUpdate") OffsetDateTime lastUpdate,
            final @GraphQLName("expiration") OffsetDateTime expiration) {
        this.type = type;
        this.status = status;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("state")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSessionEventInput.java`
#### Snippet
```java

    public CDPSessionEventInput(
            final @GraphQLName("state") CDPSessionState state,
            final @GraphQLName("unomi_sessionId") String unomi_sessionId,
            final @GraphQLName("unomi_scope") String unomi_scope) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("unomi_sessionId")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSessionEventInput.java`
#### Snippet
```java
    public CDPSessionEventInput(
            final @GraphQLName("state") CDPSessionState state,
            final @GraphQLName("unomi_sessionId") String unomi_sessionId,
            final @GraphQLName("unomi_scope") String unomi_scope) {
        this.state = state;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("unomi_scope")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSessionEventInput.java`
#### Snippet
```java
            final @GraphQLName("state") CDPSessionState state,
            final @GraphQLName("unomi_sessionId") String unomi_sessionId,
            final @GraphQLName("unomi_scope") String unomi_scope) {
        this.state = state;
        this.unomi_sessionId = unomi_sessionId;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLNonNull @GraphQLName("name")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPViewInput.java`
#### Snippet
```java
    private String name;

    public CDPViewInput(final @GraphQLID @GraphQLNonNull @GraphQLName("name") String name) {
        this.name = name;
    }
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLNonNull @GraphQLName("topic")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPInterestInput.java`
#### Snippet
```java
    private Double score;

    public CDPInterestInput(final @GraphQLID @GraphQLNonNull @GraphQLName("topic") String topic,
                            final @GraphQLName("score") Double score) {
        this.topic = topic;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("score")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPInterestInput.java`
#### Snippet
```java

    public CDPInterestInput(final @GraphQLID @GraphQLNonNull @GraphQLName("topic") String topic,
                            final @GraphQLName("score") Double score) {
        this.topic = topic;
        this.score = score;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("fieldName")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPOrderByInput.java`
#### Snippet
```java

    public CDPOrderByInput(
            final @GraphQLName("fieldName") String fieldName,
            final @GraphQLName("sortOrder") CDPSortOrder sortOrder) {
        this.fieldName = fieldName;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("sortOrder")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPOrderByInput.java`
#### Snippet
```java
    public CDPOrderByInput(
            final @GraphQLName("fieldName") String fieldName,
            final @GraphQLName("sortOrder") CDPSortOrder sortOrder) {
        this.fieldName = fieldName;
        this.sortOrder = sortOrder;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("center")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPGeoDistanceFilterInput.java`
#### Snippet
```java

    public CDPGeoDistanceFilterInput(
            final @GraphQLName("center") GeoPoint center,
            final @GraphQLName("unit") CDPGeoDistanceFilterUnit unit,
            final @GraphQLName("distance") Double distance) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("unit")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPGeoDistanceFilterInput.java`
#### Snippet
```java
    public CDPGeoDistanceFilterInput(
            final @GraphQLName("center") GeoPoint center,
            final @GraphQLName("unit") CDPGeoDistanceFilterUnit unit,
            final @GraphQLName("distance") Double distance) {
        this.center = center;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("distance")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPGeoDistanceFilterInput.java`
#### Snippet
```java
            final @GraphQLName("center") GeoPoint center,
            final @GraphQLName("unit") CDPGeoDistanceFilterUnit unit,
            final @GraphQLName("distance") Double distance) {
        this.center = center;
        this.unit = unit;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("and")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPTopicFilterInput.java`
#### Snippet
```java

    public CDPTopicFilterInput(
            final @GraphQLName("and") List<CDPTopicFilterInput> and,
            final @GraphQLName("or") List<CDPTopicFilterInput> or,
            final @GraphQLName("id_equals") @GraphQLID String id_equals,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("or")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPTopicFilterInput.java`
#### Snippet
```java
    public CDPTopicFilterInput(
            final @GraphQLName("and") List<CDPTopicFilterInput> and,
            final @GraphQLName("or") List<CDPTopicFilterInput> or,
            final @GraphQLName("id_equals") @GraphQLID String id_equals,
            final @GraphQLName("view_equals") String view_equals,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("id_equals")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPTopicFilterInput.java`
#### Snippet
```java
            final @GraphQLName("and") List<CDPTopicFilterInput> and,
            final @GraphQLName("or") List<CDPTopicFilterInput> or,
            final @GraphQLName("id_equals") @GraphQLID String id_equals,
            final @GraphQLName("view_equals") String view_equals,
            final @GraphQLName("name_equals") String name_equals) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("view_equals")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPTopicFilterInput.java`
#### Snippet
```java
            final @GraphQLName("or") List<CDPTopicFilterInput> or,
            final @GraphQLName("id_equals") @GraphQLID String id_equals,
            final @GraphQLName("view_equals") String view_equals,
            final @GraphQLName("name_equals") String name_equals) {
        this.and = and;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("name_equals")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPTopicFilterInput.java`
#### Snippet
```java
            final @GraphQLName("id_equals") @GraphQLID String id_equals,
            final @GraphQLName("view_equals") String view_equals,
            final @GraphQLName("name_equals") String name_equals) {
        this.and = and;
        this.or = or;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("and")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileEventsFilterInput.java`
#### Snippet
```java
    private CDPEventFilterInput eventFilter;

    public CDPProfileEventsFilterInput(final @GraphQLName("and") List<CDPProfileEventsFilterInput> and,
                                       final @GraphQLName("or") List<CDPProfileEventsFilterInput> or,
                                       final @GraphQLName("not") CDPProfileEventsFilterInput not,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("or")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileEventsFilterInput.java`
#### Snippet
```java

    public CDPProfileEventsFilterInput(final @GraphQLName("and") List<CDPProfileEventsFilterInput> and,
                                       final @GraphQLName("or") List<CDPProfileEventsFilterInput> or,
                                       final @GraphQLName("not") CDPProfileEventsFilterInput not,
                                       final @GraphQLName("minimalCount") Integer minimalCount,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("not")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileEventsFilterInput.java`
#### Snippet
```java
    public CDPProfileEventsFilterInput(final @GraphQLName("and") List<CDPProfileEventsFilterInput> and,
                                       final @GraphQLName("or") List<CDPProfileEventsFilterInput> or,
                                       final @GraphQLName("not") CDPProfileEventsFilterInput not,
                                       final @GraphQLName("minimalCount") Integer minimalCount,
                                       final @GraphQLName("maximalCount") Integer maximalCount,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("minimalCount")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileEventsFilterInput.java`
#### Snippet
```java
                                       final @GraphQLName("or") List<CDPProfileEventsFilterInput> or,
                                       final @GraphQLName("not") CDPProfileEventsFilterInput not,
                                       final @GraphQLName("minimalCount") Integer minimalCount,
                                       final @GraphQLName("maximalCount") Integer maximalCount,
                                       final @GraphQLName("eventFilter") CDPEventFilterInput eventFilter) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("maximalCount")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileEventsFilterInput.java`
#### Snippet
```java
                                       final @GraphQLName("not") CDPProfileEventsFilterInput not,
                                       final @GraphQLName("minimalCount") Integer minimalCount,
                                       final @GraphQLName("maximalCount") Integer maximalCount,
                                       final @GraphQLName("eventFilter") CDPEventFilterInput eventFilter) {
        this.and = and;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("eventFilter")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileEventsFilterInput.java`
#### Snippet
```java
                                       final @GraphQLName("minimalCount") Integer minimalCount,
                                       final @GraphQLName("maximalCount") Integer maximalCount,
                                       final @GraphQLName("eventFilter") CDPEventFilterInput eventFilter) {
        this.and = and;
        this.or = or;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("joinLists_contains")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListsUpdateEventFilterInput.java`
#### Snippet
```java
    private List<String> leaveLists_contains;

    public CDPListsUpdateEventFilterInput(final @GraphQLName("joinLists_contains") List<String> joinLists_contains,
                                          final @GraphQLName("leaveLists_contains") List<String> leaveLists_contains) {
        this.joinLists_contains = joinLists_contains;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("leaveLists_contains")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListsUpdateEventFilterInput.java`
#### Snippet
```java

    public CDPListsUpdateEventFilterInput(final @GraphQLName("joinLists_contains") List<String> joinLists_contains,
                                          final @GraphQLName("leaveLists_contains") List<String> leaveLists_contains) {
        this.joinLists_contains = joinLists_contains;
        this.leaveLists_contains = leaveLists_contains;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLName("id")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventInput.java`
#### Snippet
```java

    public CDPEventInput(
            final @GraphQLID @GraphQLName("id") String id,
            final @GraphQLName("cdp_sourceID") String cdp_sourceID,
            final @GraphQLNonNull @GraphQLName("cdp_profileID") CDPProfileIDInput cdp_profileID,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("cdp_sourceID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventInput.java`
#### Snippet
```java
    public CDPEventInput(
            final @GraphQLID @GraphQLName("id") String id,
            final @GraphQLName("cdp_sourceID") String cdp_sourceID,
            final @GraphQLNonNull @GraphQLName("cdp_profileID") CDPProfileIDInput cdp_profileID,
            final @GraphQLID @GraphQLNonNull @GraphQLName("cdp_objectID") String cdp_objectID,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLNonNull @GraphQLName("cdp_profileID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventInput.java`
#### Snippet
```java
            final @GraphQLID @GraphQLName("id") String id,
            final @GraphQLName("cdp_sourceID") String cdp_sourceID,
            final @GraphQLNonNull @GraphQLName("cdp_profileID") CDPProfileIDInput cdp_profileID,
            final @GraphQLID @GraphQLNonNull @GraphQLName("cdp_objectID") String cdp_objectID,
            final @GraphQLName("cdp_consentUpdateEvent") CDPConsentUpdateEventInput cdp_consentUpdateEvent,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLNonNull @GraphQLName("cdp_objectID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventInput.java`
#### Snippet
```java
            final @GraphQLName("cdp_sourceID") String cdp_sourceID,
            final @GraphQLNonNull @GraphQLName("cdp_profileID") CDPProfileIDInput cdp_profileID,
            final @GraphQLID @GraphQLNonNull @GraphQLName("cdp_objectID") String cdp_objectID,
            final @GraphQLName("cdp_consentUpdateEvent") CDPConsentUpdateEventInput cdp_consentUpdateEvent,
            final @GraphQLName("cdp_listUpdateEvent") CDPListsUpdateEventInput cdp_listUpdateEvent,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("cdp_consentUpdateEvent")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventInput.java`
#### Snippet
```java
            final @GraphQLNonNull @GraphQLName("cdp_profileID") CDPProfileIDInput cdp_profileID,
            final @GraphQLID @GraphQLNonNull @GraphQLName("cdp_objectID") String cdp_objectID,
            final @GraphQLName("cdp_consentUpdateEvent") CDPConsentUpdateEventInput cdp_consentUpdateEvent,
            final @GraphQLName("cdp_listUpdateEvent") CDPListsUpdateEventInput cdp_listUpdateEvent,
            final @GraphQLName("cdp_sessionEvent") CDPSessionEventInput cdp_sessionEvent) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("cdp_listUpdateEvent")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventInput.java`
#### Snippet
```java
            final @GraphQLID @GraphQLNonNull @GraphQLName("cdp_objectID") String cdp_objectID,
            final @GraphQLName("cdp_consentUpdateEvent") CDPConsentUpdateEventInput cdp_consentUpdateEvent,
            final @GraphQLName("cdp_listUpdateEvent") CDPListsUpdateEventInput cdp_listUpdateEvent,
            final @GraphQLName("cdp_sessionEvent") CDPSessionEventInput cdp_sessionEvent) {
        this.id = id;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("cdp_sessionEvent")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventInput.java`
#### Snippet
```java
            final @GraphQLName("cdp_consentUpdateEvent") CDPConsentUpdateEventInput cdp_consentUpdateEvent,
            final @GraphQLName("cdp_listUpdateEvent") CDPListsUpdateEventInput cdp_listUpdateEvent,
            final @GraphQLName("cdp_sessionEvent") CDPSessionEventInput cdp_sessionEvent) {
        this.id = id;
        this.cdp_sourceID = cdp_sourceID;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("after")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPDateFilterInput.java`
#### Snippet
```java

    public CDPDateFilterInput(
            final @GraphQLName("after") long after,
            final @GraphQLName("includeAfter") boolean includeAfter,
            final @GraphQLName("before") long before,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("includeAfter")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPDateFilterInput.java`
#### Snippet
```java
    public CDPDateFilterInput(
            final @GraphQLName("after") long after,
            final @GraphQLName("includeAfter") boolean includeAfter,
            final @GraphQLName("before") long before,
            final @GraphQLName("includeBefore") boolean includeBefore) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("before")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPDateFilterInput.java`
#### Snippet
```java
            final @GraphQLName("after") long after,
            final @GraphQLName("includeAfter") boolean includeAfter,
            final @GraphQLName("before") long before,
            final @GraphQLName("includeBefore") boolean includeBefore) {
        this.after = after;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("includeBefore")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPDateFilterInput.java`
#### Snippet
```java
            final @GraphQLName("includeAfter") boolean includeAfter,
            final @GraphQLName("before") long before,
            final @GraphQLName("includeBefore") boolean includeBefore) {
        this.after = after;
        this.includeAfter = includeAfter;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLName("id")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPTopicInput.java`
#### Snippet
```java

    public CDPTopicInput(
            final @GraphQLID @GraphQLName("id") String id,
            final @GraphQLID @GraphQLNonNull @GraphQLName("view") String view,
            final @GraphQLNonNull @GraphQLName("name") String name) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLNonNull @GraphQLName("view")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPTopicInput.java`
#### Snippet
```java
    public CDPTopicInput(
            final @GraphQLID @GraphQLName("id") String id,
            final @GraphQLID @GraphQLNonNull @GraphQLName("view") String view,
            final @GraphQLNonNull @GraphQLName("name") String name) {
        this.id = id;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLNonNull @GraphQLName("name")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPTopicInput.java`
#### Snippet
```java
            final @GraphQLID @GraphQLName("id") String id,
            final @GraphQLID @GraphQLNonNull @GraphQLName("view") String view,
            final @GraphQLNonNull @GraphQLName("name") String name) {
        this.id = id;
        this.view = view;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("name")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPNamedFilterInput.java`
#### Snippet
```java
    private CDPProfileFilterInput filter;

    public CDPNamedFilterInput(final @GraphQLName("name") @GraphQLNonNull String name,
                               final @GraphQLName("filter") CDPProfileFilterInput filter) {
        this.name = name;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("filter")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPNamedFilterInput.java`
#### Snippet
```java

    public CDPNamedFilterInput(final @GraphQLName("name") @GraphQLNonNull String name,
                               final @GraphQLName("filter") CDPProfileFilterInput filter) {
        this.name = name;
        this.filter = filter;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLNonNull @GraphQLName("type")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaConsentInput.java`
#### Snippet
```java
    private OffsetDateTime expiration;

    public CDPPersonaConsentInput(final @GraphQLNonNull @GraphQLName("type") String type,
                                  final @GraphQLName("status") String status,
                                  final @GraphQLName("lastUpdate") OffsetDateTime lastUpdate,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("status")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaConsentInput.java`
#### Snippet
```java

    public CDPPersonaConsentInput(final @GraphQLNonNull @GraphQLName("type") String type,
                                  final @GraphQLName("status") String status,
                                  final @GraphQLName("lastUpdate") OffsetDateTime lastUpdate,
                                  final @GraphQLName("expiration") OffsetDateTime expiration) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("lastUpdate")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaConsentInput.java`
#### Snippet
```java
    public CDPPersonaConsentInput(final @GraphQLNonNull @GraphQLName("type") String type,
                                  final @GraphQLName("status") String status,
                                  final @GraphQLName("lastUpdate") OffsetDateTime lastUpdate,
                                  final @GraphQLName("expiration") OffsetDateTime expiration) {
        this.type = type;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("expiration")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaConsentInput.java`
#### Snippet
```java
                                  final @GraphQLName("status") String status,
                                  final @GraphQLName("lastUpdate") OffsetDateTime lastUpdate,
                                  final @GraphQLName("expiration") OffsetDateTime expiration) {
        this.type = type;
        this.status = status;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLName("id")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/UnomiSegmentInput.java`
#### Snippet
```java

    public UnomiSegmentInput(
            final @GraphQLID @GraphQLName("id") String id,
            final @GraphQLID @GraphQLNonNull @GraphQLName("view") String view,
            final @GraphQLNonNull @GraphQLName("name") String name,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLNonNull @GraphQLName("view")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/UnomiSegmentInput.java`
#### Snippet
```java
    public UnomiSegmentInput(
            final @GraphQLID @GraphQLName("id") String id,
            final @GraphQLID @GraphQLNonNull @GraphQLName("view") String view,
            final @GraphQLNonNull @GraphQLName("name") String name,
            final @GraphQLNonNull @GraphQLName("condition") Object condition) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLNonNull @GraphQLName("name")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/UnomiSegmentInput.java`
#### Snippet
```java
            final @GraphQLID @GraphQLName("id") String id,
            final @GraphQLID @GraphQLNonNull @GraphQLName("view") String view,
            final @GraphQLNonNull @GraphQLName("name") String name,
            final @GraphQLNonNull @GraphQLName("condition") Object condition) {
        this.id = id;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLNonNull @GraphQLName("condition")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/UnomiSegmentInput.java`
#### Snippet
```java
            final @GraphQLID @GraphQLNonNull @GraphQLName("view") String view,
            final @GraphQLNonNull @GraphQLName("name") String name,
            final @GraphQLNonNull @GraphQLName("condition") Object condition) {
        this.id = id;
        this.view = view;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("and")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPInterestFilterInput.java`
#### Snippet
```java
    private Double score_gte;

    public CDPInterestFilterInput(final @GraphQLName("and") List<CDPInterestFilterInput> and,
                                  final @GraphQLName("or") List<CDPInterestFilterInput> or,
                                  final @GraphQLName("topic_equals") String topic_equals,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("or")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPInterestFilterInput.java`
#### Snippet
```java

    public CDPInterestFilterInput(final @GraphQLName("and") List<CDPInterestFilterInput> and,
                                  final @GraphQLName("or") List<CDPInterestFilterInput> or,
                                  final @GraphQLName("topic_equals") String topic_equals,
                                  final @GraphQLName("score_equals") Double score_equals,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("topic_equals")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPInterestFilterInput.java`
#### Snippet
```java
    public CDPInterestFilterInput(final @GraphQLName("and") List<CDPInterestFilterInput> and,
                                  final @GraphQLName("or") List<CDPInterestFilterInput> or,
                                  final @GraphQLName("topic_equals") String topic_equals,
                                  final @GraphQLName("score_equals") Double score_equals,
                                  final @GraphQLName("score_lt") Double score_lt,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("score_equals")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPInterestFilterInput.java`
#### Snippet
```java
                                  final @GraphQLName("or") List<CDPInterestFilterInput> or,
                                  final @GraphQLName("topic_equals") String topic_equals,
                                  final @GraphQLName("score_equals") Double score_equals,
                                  final @GraphQLName("score_lt") Double score_lt,
                                  final @GraphQLName("score_lte") Double score_lte,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("score_lt")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPInterestFilterInput.java`
#### Snippet
```java
                                  final @GraphQLName("topic_equals") String topic_equals,
                                  final @GraphQLName("score_equals") Double score_equals,
                                  final @GraphQLName("score_lt") Double score_lt,
                                  final @GraphQLName("score_lte") Double score_lte,
                                  final @GraphQLName("score_gt") Double score_gt,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("score_lte")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPInterestFilterInput.java`
#### Snippet
```java
                                  final @GraphQLName("score_equals") Double score_equals,
                                  final @GraphQLName("score_lt") Double score_lt,
                                  final @GraphQLName("score_lte") Double score_lte,
                                  final @GraphQLName("score_gt") Double score_gt,
                                  final @GraphQLName("score_gte") Double score_gte) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("score_gt")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPInterestFilterInput.java`
#### Snippet
```java
                                  final @GraphQLName("score_lt") Double score_lt,
                                  final @GraphQLName("score_lte") Double score_lte,
                                  final @GraphQLName("score_gt") Double score_gt,
                                  final @GraphQLName("score_gte") Double score_gte) {
        this.and = and;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("score_gte")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPInterestFilterInput.java`
#### Snippet
```java
                                  final @GraphQLName("score_lte") Double score_lte,
                                  final @GraphQLName("score_gt") Double score_gt,
                                  final @GraphQLName("score_gte") Double score_gte) {
        this.and = and;
        this.or = or;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLNonNull @GraphQLName("name")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPOptimizationInput.java`
#### Snippet
```java
    private String name;

    public CDPOptimizationInput(final @GraphQLNonNull @GraphQLName("name") String name) {
        this.name = name;
    }
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLNonNull @GraphQLName("id")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPClientInput.java`
#### Snippet
```java

    public CDPClientInput(
            final @GraphQLID @GraphQLNonNull @GraphQLName("id") String id,
            final @GraphQLName("title") String title) {
        this.id = id;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("title")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPClientInput.java`
#### Snippet
```java
    public CDPClientInput(
            final @GraphQLID @GraphQLNonNull @GraphQLName("id") String id,
            final @GraphQLName("title") String title) {
        this.id = id;
        this.title = title;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("profileIDs_contains")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileFilterInput.java`
#### Snippet
```java
    private CDPProfileEventsFilterInput events;

    public CDPProfileFilterInput(final @GraphQLName("profileIDs_contains") List<String> profileIDs_contains,
                                 final @GraphQLName("segments_contains") List<String> segments_contains,
                                 final @GraphQLName("consents_contains") List<String> consents_contains,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("segments_contains")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileFilterInput.java`
#### Snippet
```java

    public CDPProfileFilterInput(final @GraphQLName("profileIDs_contains") List<String> profileIDs_contains,
                                 final @GraphQLName("segments_contains") List<String> segments_contains,
                                 final @GraphQLName("consents_contains") List<String> consents_contains,
                                 final @GraphQLName("lists_contains") List<String> lists_contains,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("consents_contains")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileFilterInput.java`
#### Snippet
```java
    public CDPProfileFilterInput(final @GraphQLName("profileIDs_contains") List<String> profileIDs_contains,
                                 final @GraphQLName("segments_contains") List<String> segments_contains,
                                 final @GraphQLName("consents_contains") List<String> consents_contains,
                                 final @GraphQLName("lists_contains") List<String> lists_contains,
                                 final @GraphQLName("properties") CDPProfilePropertiesFilterInput properties,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("lists_contains")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileFilterInput.java`
#### Snippet
```java
                                 final @GraphQLName("segments_contains") List<String> segments_contains,
                                 final @GraphQLName("consents_contains") List<String> consents_contains,
                                 final @GraphQLName("lists_contains") List<String> lists_contains,
                                 final @GraphQLName("properties") CDPProfilePropertiesFilterInput properties,
                                 final @GraphQLName("interests") CDPInterestFilterInput interests,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("properties")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileFilterInput.java`
#### Snippet
```java
                                 final @GraphQLName("consents_contains") List<String> consents_contains,
                                 final @GraphQLName("lists_contains") List<String> lists_contains,
                                 final @GraphQLName("properties") CDPProfilePropertiesFilterInput properties,
                                 final @GraphQLName("interests") CDPInterestFilterInput interests,
                                 final @GraphQLName("events") CDPProfileEventsFilterInput events) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("interests")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileFilterInput.java`
#### Snippet
```java
                                 final @GraphQLName("lists_contains") List<String> lists_contains,
                                 final @GraphQLName("properties") CDPProfilePropertiesFilterInput properties,
                                 final @GraphQLName("interests") CDPInterestFilterInput interests,
                                 final @GraphQLName("events") CDPProfileEventsFilterInput events) {
        this.profileIDs_contains = profileIDs_contains;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("events")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileFilterInput.java`
#### Snippet
```java
                                 final @GraphQLName("properties") CDPProfilePropertiesFilterInput properties,
                                 final @GraphQLName("interests") CDPInterestFilterInput interests,
                                 final @GraphQLName("events") CDPProfileEventsFilterInput events) {
        this.profileIDs_contains = profileIDs_contains;
        this.segments_contains = segments_contains;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("id")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventTypeInput.java`
#### Snippet
```java
    private List<CDPPropertyInput> properties;

    public CDPEventTypeInput(final @GraphQLName("id") String id,
                             final @GraphQLName("scope") String scope,
                             final @GraphQLName("typeName") String typeName,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("scope")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventTypeInput.java`
#### Snippet
```java

    public CDPEventTypeInput(final @GraphQLName("id") String id,
                             final @GraphQLName("scope") String scope,
                             final @GraphQLName("typeName") String typeName,
                             final @GraphQLName("properties") List<CDPPropertyInput> properties) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("typeName")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventTypeInput.java`
#### Snippet
```java
    public CDPEventTypeInput(final @GraphQLName("id") String id,
                             final @GraphQLName("scope") String scope,
                             final @GraphQLName("typeName") String typeName,
                             final @GraphQLName("properties") List<CDPPropertyInput> properties) {
        this.id = id;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("properties")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventTypeInput.java`
#### Snippet
```java
                             final @GraphQLName("scope") String scope,
                             final @GraphQLName("typeName") String typeName,
                             final @GraphQLName("properties") List<CDPPropertyInput> properties) {
        this.id = id;
        this.scope = scope;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLNonNull @GraphQLName("id")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSourceInput.java`
#### Snippet
```java

    public CDPSourceInput(
            final @GraphQLID @GraphQLNonNull @GraphQLName("id") String id,
            final @GraphQLName("thirdParty") Boolean thirdParty) {
        this.id = id;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("thirdParty")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSourceInput.java`
#### Snippet
```java
    public CDPSourceInput(
            final @GraphQLID @GraphQLNonNull @GraphQLName("id") String id,
            final @GraphQLName("thirdParty") Boolean thirdParty) {
        this.id = id;
        this.thirdParty = thirdParty;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("state_equals")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSessionEventFilterInput.java`
#### Snippet
```java

    public CDPSessionEventFilterInput(
            final @GraphQLName("state_equals") CDPSessionState state_equals,
            final @GraphQLName("unomi_sessionId_equals") String unomi_sessionId_equals,
            final @GraphQLName("unomi_scope_equals") String unomi_scope_equals) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("unomi_sessionId_equals")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSessionEventFilterInput.java`
#### Snippet
```java
    public CDPSessionEventFilterInput(
            final @GraphQLName("state_equals") CDPSessionState state_equals,
            final @GraphQLName("unomi_sessionId_equals") String unomi_sessionId_equals,
            final @GraphQLName("unomi_scope_equals") String unomi_scope_equals) {
        this.state_equals = state_equals;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("unomi_scope_equals")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSessionEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("state_equals") CDPSessionState state_equals,
            final @GraphQLName("unomi_sessionId_equals") String unomi_sessionId_equals,
            final @GraphQLName("unomi_scope_equals") String unomi_scope_equals) {
        this.state_equals = state_equals;
        this.unomi_sessionId_equals = unomi_sessionId_equals;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("and")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java

    public CDPEventFilterInput(
            final @GraphQLName("and") List<CDPEventFilterInput> and,
            final @GraphQLName("or") List<CDPEventFilterInput> or,
            final @GraphQLName("id_equals") String id_equals,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("or")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java
    public CDPEventFilterInput(
            final @GraphQLName("and") List<CDPEventFilterInput> and,
            final @GraphQLName("or") List<CDPEventFilterInput> or,
            final @GraphQLName("id_equals") String id_equals,
            final @GraphQLName("cdp_clientID_equals") String cdp_clientID_equals,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("id_equals")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("and") List<CDPEventFilterInput> and,
            final @GraphQLName("or") List<CDPEventFilterInput> or,
            final @GraphQLName("id_equals") String id_equals,
            final @GraphQLName("cdp_clientID_equals") String cdp_clientID_equals,
            final @GraphQLName("cdp_sourceID_equals") String cdp_sourceID_equals,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("cdp_clientID_equals")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("or") List<CDPEventFilterInput> or,
            final @GraphQLName("id_equals") String id_equals,
            final @GraphQLName("cdp_clientID_equals") String cdp_clientID_equals,
            final @GraphQLName("cdp_sourceID_equals") String cdp_sourceID_equals,
            final @GraphQLName("cdp_profileID_equals") String cdp_profileID_equals,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("cdp_sourceID_equals")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("id_equals") String id_equals,
            final @GraphQLName("cdp_clientID_equals") String cdp_clientID_equals,
            final @GraphQLName("cdp_sourceID_equals") String cdp_sourceID_equals,
            final @GraphQLName("cdp_profileID_equals") String cdp_profileID_equals,
            final @GraphQLName("cdp_timestamp_equals") OffsetDateTime cdp_timestamp_equals,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("cdp_profileID_equals")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("cdp_clientID_equals") String cdp_clientID_equals,
            final @GraphQLName("cdp_sourceID_equals") String cdp_sourceID_equals,
            final @GraphQLName("cdp_profileID_equals") String cdp_profileID_equals,
            final @GraphQLName("cdp_timestamp_equals") OffsetDateTime cdp_timestamp_equals,
            final @GraphQLName("cdp_timestamp_lt") OffsetDateTime cdp_timestamp_lt,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("cdp_timestamp_equals")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("cdp_sourceID_equals") String cdp_sourceID_equals,
            final @GraphQLName("cdp_profileID_equals") String cdp_profileID_equals,
            final @GraphQLName("cdp_timestamp_equals") OffsetDateTime cdp_timestamp_equals,
            final @GraphQLName("cdp_timestamp_lt") OffsetDateTime cdp_timestamp_lt,
            final @GraphQLName("cdp_timestamp_lte") OffsetDateTime cdp_timestamp_lte,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("cdp_timestamp_lt")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("cdp_profileID_equals") String cdp_profileID_equals,
            final @GraphQLName("cdp_timestamp_equals") OffsetDateTime cdp_timestamp_equals,
            final @GraphQLName("cdp_timestamp_lt") OffsetDateTime cdp_timestamp_lt,
            final @GraphQLName("cdp_timestamp_lte") OffsetDateTime cdp_timestamp_lte,
            final @GraphQLName("cdp_timestamp_gt") OffsetDateTime cdp_timestamp_gt,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("cdp_timestamp_lte")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("cdp_timestamp_equals") OffsetDateTime cdp_timestamp_equals,
            final @GraphQLName("cdp_timestamp_lt") OffsetDateTime cdp_timestamp_lt,
            final @GraphQLName("cdp_timestamp_lte") OffsetDateTime cdp_timestamp_lte,
            final @GraphQLName("cdp_timestamp_gt") OffsetDateTime cdp_timestamp_gt,
            final @GraphQLName("cdp_timestamp_gte") OffsetDateTime cdp_timestamp_gte,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("cdp_timestamp_gt")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("cdp_timestamp_lt") OffsetDateTime cdp_timestamp_lt,
            final @GraphQLName("cdp_timestamp_lte") OffsetDateTime cdp_timestamp_lte,
            final @GraphQLName("cdp_timestamp_gt") OffsetDateTime cdp_timestamp_gt,
            final @GraphQLName("cdp_timestamp_gte") OffsetDateTime cdp_timestamp_gte,
            final @GraphQLName("cdp_consentUpdateEvent") CDPConsentUpdateEventFilterInput cdp_consentUpdateEvent,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("cdp_timestamp_gte")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("cdp_timestamp_lte") OffsetDateTime cdp_timestamp_lte,
            final @GraphQLName("cdp_timestamp_gt") OffsetDateTime cdp_timestamp_gt,
            final @GraphQLName("cdp_timestamp_gte") OffsetDateTime cdp_timestamp_gte,
            final @GraphQLName("cdp_consentUpdateEvent") CDPConsentUpdateEventFilterInput cdp_consentUpdateEvent,
            final @GraphQLName("cdp_listsUpdateEvent") CDPListsUpdateEventFilterInput cdp_listsUpdateEvent,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("cdp_consentUpdateEvent")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("cdp_timestamp_gt") OffsetDateTime cdp_timestamp_gt,
            final @GraphQLName("cdp_timestamp_gte") OffsetDateTime cdp_timestamp_gte,
            final @GraphQLName("cdp_consentUpdateEvent") CDPConsentUpdateEventFilterInput cdp_consentUpdateEvent,
            final @GraphQLName("cdp_listsUpdateEvent") CDPListsUpdateEventFilterInput cdp_listsUpdateEvent,
            final @GraphQLName("cdp_sessionEvent") CDPSessionEventFilterInput cdp_sessionEvent,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("cdp_listsUpdateEvent")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("cdp_timestamp_gte") OffsetDateTime cdp_timestamp_gte,
            final @GraphQLName("cdp_consentUpdateEvent") CDPConsentUpdateEventFilterInput cdp_consentUpdateEvent,
            final @GraphQLName("cdp_listsUpdateEvent") CDPListsUpdateEventFilterInput cdp_listsUpdateEvent,
            final @GraphQLName("cdp_sessionEvent") CDPSessionEventFilterInput cdp_sessionEvent,
            final @GraphQLName("cdp_profileUpdateEvent") CDPProfileUpdateEventFilterInput cdp_profileUpdateEvent) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("cdp_sessionEvent")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("cdp_consentUpdateEvent") CDPConsentUpdateEventFilterInput cdp_consentUpdateEvent,
            final @GraphQLName("cdp_listsUpdateEvent") CDPListsUpdateEventFilterInput cdp_listsUpdateEvent,
            final @GraphQLName("cdp_sessionEvent") CDPSessionEventFilterInput cdp_sessionEvent,
            final @GraphQLName("cdp_profileUpdateEvent") CDPProfileUpdateEventFilterInput cdp_profileUpdateEvent) {
        this.and = and;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("cdp_profileUpdateEvent")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("cdp_listsUpdateEvent") CDPListsUpdateEventFilterInput cdp_listsUpdateEvent,
            final @GraphQLName("cdp_sessionEvent") CDPSessionEventFilterInput cdp_sessionEvent,
            final @GraphQLName("cdp_profileUpdateEvent") CDPProfileUpdateEventFilterInput cdp_profileUpdateEvent) {
        this.and = and;
        this.or = or;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("type_equals")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java

    public CDPConsentUpdateEventFilterInput(
            final @GraphQLName("type_equals") String type_equals,
            final @GraphQLName("status_equals") String status_equals,
            final @GraphQLName("lastUpdate_equals") OffsetDateTime lastUpdate_equals,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("status_equals")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java
    public CDPConsentUpdateEventFilterInput(
            final @GraphQLName("type_equals") String type_equals,
            final @GraphQLName("status_equals") String status_equals,
            final @GraphQLName("lastUpdate_equals") OffsetDateTime lastUpdate_equals,
            final @GraphQLName("lastUpdate_lt") OffsetDateTime lastUpdate_lt,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("lastUpdate_equals")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("type_equals") String type_equals,
            final @GraphQLName("status_equals") String status_equals,
            final @GraphQLName("lastUpdate_equals") OffsetDateTime lastUpdate_equals,
            final @GraphQLName("lastUpdate_lt") OffsetDateTime lastUpdate_lt,
            final @GraphQLName("lastUpdate_lte") OffsetDateTime lastUpdate_lte,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("lastUpdate_lt")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("status_equals") String status_equals,
            final @GraphQLName("lastUpdate_equals") OffsetDateTime lastUpdate_equals,
            final @GraphQLName("lastUpdate_lt") OffsetDateTime lastUpdate_lt,
            final @GraphQLName("lastUpdate_lte") OffsetDateTime lastUpdate_lte,
            final @GraphQLName("lastUpdate_gt") OffsetDateTime lastUpdate_gt,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("lastUpdate_lte")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("lastUpdate_equals") OffsetDateTime lastUpdate_equals,
            final @GraphQLName("lastUpdate_lt") OffsetDateTime lastUpdate_lt,
            final @GraphQLName("lastUpdate_lte") OffsetDateTime lastUpdate_lte,
            final @GraphQLName("lastUpdate_gt") OffsetDateTime lastUpdate_gt,
            final @GraphQLName("lastUpdate_gte") OffsetDateTime lastUpdate_gte,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("lastUpdate_gt")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("lastUpdate_lt") OffsetDateTime lastUpdate_lt,
            final @GraphQLName("lastUpdate_lte") OffsetDateTime lastUpdate_lte,
            final @GraphQLName("lastUpdate_gt") OffsetDateTime lastUpdate_gt,
            final @GraphQLName("lastUpdate_gte") OffsetDateTime lastUpdate_gte,
            final @GraphQLName("expiration_equals") OffsetDateTime expiration_equals,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("lastUpdate_gte")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("lastUpdate_lte") OffsetDateTime lastUpdate_lte,
            final @GraphQLName("lastUpdate_gt") OffsetDateTime lastUpdate_gt,
            final @GraphQLName("lastUpdate_gte") OffsetDateTime lastUpdate_gte,
            final @GraphQLName("expiration_equals") OffsetDateTime expiration_equals,
            final @GraphQLName("expiration_lt") OffsetDateTime expiration_lt,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("expiration_equals")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("lastUpdate_gt") OffsetDateTime lastUpdate_gt,
            final @GraphQLName("lastUpdate_gte") OffsetDateTime lastUpdate_gte,
            final @GraphQLName("expiration_equals") OffsetDateTime expiration_equals,
            final @GraphQLName("expiration_lt") OffsetDateTime expiration_lt,
            final @GraphQLName("expiration_lte") OffsetDateTime expiration_lte,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("expiration_lt")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("lastUpdate_gte") OffsetDateTime lastUpdate_gte,
            final @GraphQLName("expiration_equals") OffsetDateTime expiration_equals,
            final @GraphQLName("expiration_lt") OffsetDateTime expiration_lt,
            final @GraphQLName("expiration_lte") OffsetDateTime expiration_lte,
            final @GraphQLName("expiration_gt") OffsetDateTime expiration_gt,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("expiration_lte")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("expiration_equals") OffsetDateTime expiration_equals,
            final @GraphQLName("expiration_lt") OffsetDateTime expiration_lt,
            final @GraphQLName("expiration_lte") OffsetDateTime expiration_lte,
            final @GraphQLName("expiration_gt") OffsetDateTime expiration_gt,
            final @GraphQLName("expiration_gte") OffsetDateTime expiration_gte) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("expiration_gt")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("expiration_lt") OffsetDateTime expiration_lt,
            final @GraphQLName("expiration_lte") OffsetDateTime expiration_lte,
            final @GraphQLName("expiration_gt") OffsetDateTime expiration_gt,
            final @GraphQLName("expiration_gte") OffsetDateTime expiration_gte) {
        this.type_equals = type_equals;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("expiration_gte")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java
            final @GraphQLName("expiration_lte") OffsetDateTime expiration_lte,
            final @GraphQLName("expiration_gt") OffsetDateTime expiration_gt,
            final @GraphQLName("expiration_gte") OffsetDateTime expiration_gte) {
        this.type_equals = type_equals;
        this.status_equals = status_equals;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLName("id")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSegmentInput.java`
#### Snippet
```java

    public CDPSegmentInput(
            final @GraphQLID @GraphQLName("id") String id,
            final @GraphQLID @GraphQLNonNull @GraphQLName("view") String view,
            final @GraphQLNonNull @GraphQLName("name") String name,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLNonNull @GraphQLName("view")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSegmentInput.java`
#### Snippet
```java
    public CDPSegmentInput(
            final @GraphQLID @GraphQLName("id") String id,
            final @GraphQLID @GraphQLNonNull @GraphQLName("view") String view,
            final @GraphQLNonNull @GraphQLName("name") String name,
            final @GraphQLName("profiles") CDPProfileFilterInput profiles) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLNonNull @GraphQLName("name")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSegmentInput.java`
#### Snippet
```java
            final @GraphQLID @GraphQLName("id") String id,
            final @GraphQLID @GraphQLNonNull @GraphQLName("view") String view,
            final @GraphQLNonNull @GraphQLName("name") String name,
            final @GraphQLName("profiles") CDPProfileFilterInput profiles) {
        this.id = id;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("profiles")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSegmentInput.java`
#### Snippet
```java
            final @GraphQLID @GraphQLNonNull @GraphQLName("view") String view,
            final @GraphQLNonNull @GraphQLName("name") String name,
            final @GraphQLName("profiles") CDPProfileFilterInput profiles) {
        this.id = id;
        this.view = view;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLName("id")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListInput.java`
#### Snippet
```java

    public CDPListInput(
            final @GraphQLID @GraphQLName("id") String id,
            final @GraphQLID @GraphQLNonNull @GraphQLName("view") String view,
            final @GraphQLNonNull @GraphQLName("name") String name) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLNonNull @GraphQLName("view")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListInput.java`
#### Snippet
```java
    public CDPListInput(
            final @GraphQLID @GraphQLName("id") String id,
            final @GraphQLID @GraphQLNonNull @GraphQLName("view") String view,
            final @GraphQLNonNull @GraphQLName("name") String name) {
        this.id = id;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLNonNull @GraphQLName("name")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListInput.java`
#### Snippet
```java
            final @GraphQLID @GraphQLName("id") String id,
            final @GraphQLID @GraphQLNonNull @GraphQLName("view") String view,
            final @GraphQLNonNull @GraphQLName("name") String name) {
        this.id = id;
        this.view = view;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("and")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListFilterInput.java`
#### Snippet
```java

    public CDPListFilterInput(
            final @GraphQLName("and") List<CDPListFilterInput> and,
            final @GraphQLName("or") List<CDPListFilterInput> or,
            final @GraphQLName("view_equals") @GraphQLID String view_equals,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("or")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListFilterInput.java`
#### Snippet
```java
    public CDPListFilterInput(
            final @GraphQLName("and") List<CDPListFilterInput> and,
            final @GraphQLName("or") List<CDPListFilterInput> or,
            final @GraphQLName("view_equals") @GraphQLID String view_equals,
            final @GraphQLName("name_equals") String name_equals) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("view_equals")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListFilterInput.java`
#### Snippet
```java
            final @GraphQLName("and") List<CDPListFilterInput> and,
            final @GraphQLName("or") List<CDPListFilterInput> or,
            final @GraphQLName("view_equals") @GraphQLID String view_equals,
            final @GraphQLName("name_equals") String name_equals) {
        this.and = and;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("name_equals")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListFilterInput.java`
#### Snippet
```java
            final @GraphQLName("or") List<CDPListFilterInput> or,
            final @GraphQLName("view_equals") @GraphQLID String view_equals,
            final @GraphQLName("name_equals") String name_equals) {
        this.and = and;
        this.or = or;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("and")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSegmentFilterInput.java`
#### Snippet
```java

    public CDPSegmentFilterInput(
            final @GraphQLName("and") List<CDPSegmentFilterInput> andFilters,
            final @GraphQLName("or") List<CDPSegmentFilterInput> orFilters,
            final @GraphQLName("view_equals") String viewEquals,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("or")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSegmentFilterInput.java`
#### Snippet
```java
    public CDPSegmentFilterInput(
            final @GraphQLName("and") List<CDPSegmentFilterInput> andFilters,
            final @GraphQLName("or") List<CDPSegmentFilterInput> orFilters,
            final @GraphQLName("view_equals") String viewEquals,
            final @GraphQLName("view_regexp") String viewRegexp,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("view_equals")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSegmentFilterInput.java`
#### Snippet
```java
            final @GraphQLName("and") List<CDPSegmentFilterInput> andFilters,
            final @GraphQLName("or") List<CDPSegmentFilterInput> orFilters,
            final @GraphQLName("view_equals") String viewEquals,
            final @GraphQLName("view_regexp") String viewRegexp,
            final @GraphQLName("name_equals") String nameEquals,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("view_regexp")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSegmentFilterInput.java`
#### Snippet
```java
            final @GraphQLName("or") List<CDPSegmentFilterInput> orFilters,
            final @GraphQLName("view_equals") String viewEquals,
            final @GraphQLName("view_regexp") String viewRegexp,
            final @GraphQLName("name_equals") String nameEquals,
            final @GraphQLName("name_regexp") String nameRegexp) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("name_equals")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSegmentFilterInput.java`
#### Snippet
```java
            final @GraphQLName("view_equals") String viewEquals,
            final @GraphQLName("view_regexp") String viewRegexp,
            final @GraphQLName("name_equals") String nameEquals,
            final @GraphQLName("name_regexp") String nameRegexp) {
        this.andFilters = andFilters;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("name_regexp")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSegmentFilterInput.java`
#### Snippet
```java
            final @GraphQLName("view_regexp") String viewRegexp,
            final @GraphQLName("name_equals") String nameEquals,
            final @GraphQLName("name_regexp") String nameRegexp) {
        this.andFilters = andFilters;
        this.orFilters = orFilters;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLName("id")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaInput.java`
#### Snippet
```java
    // # fields will be added here according to registered profile properties

    public CDPPersonaInput(final @GraphQLID @GraphQLName("id") String id,
                           final @GraphQLNonNull @GraphQLName("cdp_name") String cdp_name,
                           final @GraphQLNonNull @GraphQLName("cdp_view") String cdp_view,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLNonNull @GraphQLName("cdp_name")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaInput.java`
#### Snippet
```java

    public CDPPersonaInput(final @GraphQLID @GraphQLName("id") String id,
                           final @GraphQLNonNull @GraphQLName("cdp_name") String cdp_name,
                           final @GraphQLNonNull @GraphQLName("cdp_view") String cdp_view,
                           final @GraphQLName("cdp_profileIDs") List<CDPProfileIDInput> cdp_profileIDs,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLNonNull @GraphQLName("cdp_view")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaInput.java`
#### Snippet
```java
    public CDPPersonaInput(final @GraphQLID @GraphQLName("id") String id,
                           final @GraphQLNonNull @GraphQLName("cdp_name") String cdp_name,
                           final @GraphQLNonNull @GraphQLName("cdp_view") String cdp_view,
                           final @GraphQLName("cdp_profileIDs") List<CDPProfileIDInput> cdp_profileIDs,
                           final @GraphQLName("cdp_segments") Set<String> cdp_segments,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("cdp_profileIDs")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaInput.java`
#### Snippet
```java
                           final @GraphQLNonNull @GraphQLName("cdp_name") String cdp_name,
                           final @GraphQLNonNull @GraphQLName("cdp_view") String cdp_view,
                           final @GraphQLName("cdp_profileIDs") List<CDPProfileIDInput> cdp_profileIDs,
                           final @GraphQLName("cdp_segments") Set<String> cdp_segments,
                           final @GraphQLName("cdp_interests") List<CDPInterestInput> cdp_interests,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("cdp_segments")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaInput.java`
#### Snippet
```java
                           final @GraphQLNonNull @GraphQLName("cdp_view") String cdp_view,
                           final @GraphQLName("cdp_profileIDs") List<CDPProfileIDInput> cdp_profileIDs,
                           final @GraphQLName("cdp_segments") Set<String> cdp_segments,
                           final @GraphQLName("cdp_interests") List<CDPInterestInput> cdp_interests,
                           final @GraphQLName("cdp_consents") List<CDPPersonaConsentInput> cdp_consents) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("cdp_interests")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaInput.java`
#### Snippet
```java
                           final @GraphQLName("cdp_profileIDs") List<CDPProfileIDInput> cdp_profileIDs,
                           final @GraphQLName("cdp_segments") Set<String> cdp_segments,
                           final @GraphQLName("cdp_interests") List<CDPInterestInput> cdp_interests,
                           final @GraphQLName("cdp_consents") List<CDPPersonaConsentInput> cdp_consents) {
        this.id = id;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("cdp_consents")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPPersonaInput.java`
#### Snippet
```java
                           final @GraphQLName("cdp_segments") Set<String> cdp_segments,
                           final @GraphQLName("cdp_interests") List<CDPInterestInput> cdp_interests,
                           final @GraphQLName("cdp_consents") List<CDPPersonaConsentInput> cdp_consents) {
        this.id = id;
        this.cdp_name = cdp_name;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("name")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPDatePropertyInput.java`
#### Snippet
```java
    private String defaultValue;

    public CDPDatePropertyInput(final @GraphQLName("name") String name,
                                final @GraphQLName("minOccurrences") Integer minOccurrences,
                                final @GraphQLName("maxOccurrences") Integer maxOccurrences,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("minOccurrences")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPDatePropertyInput.java`
#### Snippet
```java

    public CDPDatePropertyInput(final @GraphQLName("name") String name,
                                final @GraphQLName("minOccurrences") Integer minOccurrences,
                                final @GraphQLName("maxOccurrences") Integer maxOccurrences,
                                final @GraphQLName("tags") List<String> tags,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("maxOccurrences")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPDatePropertyInput.java`
#### Snippet
```java
    public CDPDatePropertyInput(final @GraphQLName("name") String name,
                                final @GraphQLName("minOccurrences") Integer minOccurrences,
                                final @GraphQLName("maxOccurrences") Integer maxOccurrences,
                                final @GraphQLName("tags") List<String> tags,
                                final @GraphQLName("defaultValue") String defaultValue) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("tags")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPDatePropertyInput.java`
#### Snippet
```java
                                final @GraphQLName("minOccurrences") Integer minOccurrences,
                                final @GraphQLName("maxOccurrences") Integer maxOccurrences,
                                final @GraphQLName("tags") List<String> tags,
                                final @GraphQLName("defaultValue") String defaultValue) {
        super(name, minOccurrences, maxOccurrences, tags);
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("defaultValue")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/CDPDatePropertyInput.java`
#### Snippet
```java
                                final @GraphQLName("maxOccurrences") Integer maxOccurrences,
                                final @GraphQLName("tags") List<String> tags,
                                final @GraphQLName("defaultValue") String defaultValue) {
        super(name, minOccurrences, maxOccurrences, tags);
        this.defaultValue = defaultValue;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("views")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfileInterface.java`
#### Snippet
```java
    @GraphQLField
    List<CDPInterest> cdp_interests(
            final @GraphQLName("views") List<String> viewIds,
            final DataFetchingEnvironment environment) throws Exception;

```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("views")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfileInterface.java`
#### Snippet
```java

    @GraphQLField
    List<CDPList> cdp_lists(final @GraphQLName("views") List<String> viewIds,
                            final DataFetchingEnvironment environment) throws Exception;

```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("views")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfileInterface.java`
#### Snippet
```java
    @GraphQLField
    List<CDPSegment> cdp_segments(
            final @GraphQLName("views") List<String> viewIds,
            final DataFetchingEnvironment environment) throws Exception;

```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("views")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPersona.java`
#### Snippet
```java
    @GraphQLField
    public List<CDPSegment> cdp_segments(
            final @GraphQLName("views") List<String> viewIds, final DataFetchingEnvironment environment) throws Exception {
        return persona != null ? new ProfileSegmentsDataFetcher(persona, viewIds).get(environment) : null;
    }
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("views")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPersona.java`
#### Snippet
```java

    @Override
    public List<CDPList> cdp_lists(final @GraphQLName("views") List<String> viewIds, final DataFetchingEnvironment environment) throws Exception {
        return persona != null ? new ProfileListsDataFetcher(persona, viewIds).get(environment) : null;
    }
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("views")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPersona.java`
#### Snippet
```java
    @GraphQLField
    public List<CDPInterest> cdp_interests(
            final @GraphQLName("views") List<String> viewIds,
            final DataFetchingEnvironment environment) throws Exception {
        return persona != null ? new ProfileInterestsDataFetcher(persona, viewIds).get(environment) : null;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("first")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPList.java`
#### Snippet
```java
    @GraphQLField
    public CDPProfileConnection active(
            final @GraphQLName("first") Integer first,
            final @GraphQLName("after") String after,
            final @GraphQLName("last") Integer last,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("after")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPList.java`
#### Snippet
```java
    public CDPProfileConnection active(
            final @GraphQLName("first") Integer first,
            final @GraphQLName("after") String after,
            final @GraphQLName("last") Integer last,
            final @GraphQLName("before") String before,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("last")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPList.java`
#### Snippet
```java
            final @GraphQLName("first") Integer first,
            final @GraphQLName("after") String after,
            final @GraphQLName("last") Integer last,
            final @GraphQLName("before") String before,
            final DataFetchingEnvironment environment) throws Exception {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("before")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPList.java`
#### Snippet
```java
            final @GraphQLName("after") String after,
            final @GraphQLName("last") Integer last,
            final @GraphQLName("before") String before,
            final DataFetchingEnvironment environment) throws Exception {
        return new ListProfileConnectionDataFetcher().get(environment);
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLName("listID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    @GraphQLField
    public Boolean removeProfileFromList(
            final @GraphQLID @GraphQLName("listID") String listId,
            final @GraphQLName("profileID") CDPProfileIDInput profileIDInput,
            final DataFetchingEnvironment environment) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("profileID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    public Boolean removeProfileFromList(
            final @GraphQLID @GraphQLName("listID") String listId,
            final @GraphQLName("profileID") CDPProfileIDInput profileIDInput,
            final DataFetchingEnvironment environment) {
        return RemoveProfileFromListCommand.create()
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLNonNull @GraphQLName("topicID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    @GraphQLField
    public Boolean deleteTopic(
            final @GraphQLID @GraphQLNonNull @GraphQLName("topicID") String topicId,
            final DataFetchingEnvironment environment) {
        return DeleteTopicCommand.create(topicId)
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("view")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    @GraphQLField
    public CDPView createOrUpdateView(
            final @GraphQLName("view") CDPViewInput viewInput,
            final DataFetchingEnvironment environment) {
        return CreateOrUpdateViewCommand.create(viewInput)
```

### MissortedModifiers
Missorted modifiers `final @GraphQLNonNull @GraphQLName("propertyNames")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    @GraphQLField
    public boolean deleteProfileProperties(
            final @GraphQLNonNull @GraphQLName("propertyNames") List<String> propertyNames,
            final DataFetchingEnvironment environment) {
        return DeleteProfilePropertiesCommand.create(propertyNames)
```

### MissortedModifiers
Missorted modifiers `final @GraphQLNonNull @GraphQLName("profileID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    @GraphQLField
    public boolean deleteProfile(
            final @GraphQLNonNull @GraphQLName("profileID") CDPProfileIDInput profileIDInput,
            final DataFetchingEnvironment environment) {
        return DeleteProfileCommand.create()
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("topic")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    @GraphQLField
    public CDPTopic createOrUpdateTopic(
            final @GraphQLName("topic") CDPTopicInput topicInput,
            final DataFetchingEnvironment environment) {
        return CreateOrUpdateTopicCommand.create(topicInput)
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName(SEGMENT_ARGUMENT_NAME)`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    @GraphQLField
    public CDPSegment createOrUpdateSegment(
            final @GraphQLName(SEGMENT_ARGUMENT_NAME) CDPSegmentInput segmentInput,
            final DataFetchingEnvironment environment
    ) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLNonNull @GraphQLName("viewID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    @GraphQLField
    public Boolean deleteView(
            final @GraphQLID @GraphQLNonNull @GraphQLName("viewID") String viewId,
            final DataFetchingEnvironment environment) {
        return DeleteViewCommand.create(viewId)
```

### MissortedModifiers
Missorted modifiers `final @GraphQLNonNull @GraphQLName("profileAlias")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    @GraphQLField
    public CDPProfileAlias addAliasToProfile(
            final @GraphQLNonNull @GraphQLName("profileAlias") CDPProfileAliasInput profileAliasInput,
            final DataFetchingEnvironment environment) {
        return AddAliasToProfileCommand.create()
```

### MissortedModifiers
Missorted modifiers `final @GraphQLNonNull @GraphQLName("events")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    @GraphQLField
    public int processEvents(
            final @GraphQLNonNull @GraphQLName("events") List<CDPEventInput> eventInputs,
            final DataFetchingEnvironment environment
    ) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLNonNull @GraphQLName("sourceID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    @GraphQLField
    public Boolean deleteSource(
            final @GraphQLID @GraphQLNonNull @GraphQLName("sourceID") String sourceId,
            final DataFetchingEnvironment environment) {
        return DeleteSourceCommand.create(sourceId)
```

### MissortedModifiers
Missorted modifiers `final @GraphQLNonNull @GraphQLName("profileID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    @GraphQLField
    public boolean deleteAllPersonalData(
            final @GraphQLNonNull @GraphQLName("profileID") CDPProfileIDInput profileIDInput,
            final DataFetchingEnvironment environment) {
        return DeleteAllPersonalDataCommand.create()
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName(SEGMENT_ARGUMENT_NAME)`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    @GraphQLField
    public UnomiSegment createOrUpdateUnomiSegment(
            final @GraphQLName(SEGMENT_ARGUMENT_NAME) UnomiSegmentInput segmentInput,
            final DataFetchingEnvironment environment
    ) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("source")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    @GraphQLField
    public CDPSource createOrUpdateSource(
            final @GraphQLName("source") CDPSourceInput sourceInput,
            final DataFetchingEnvironment environment) {
        return CreateOrUpdateSourceCommand.create(sourceInput)
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLNonNull @GraphQLName("alias")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    @GraphQLField
    public CDPProfileAlias removeAliasFromProfile(
            final @GraphQLID @GraphQLNonNull @GraphQLName("alias") String alias,
            final @GraphQLName("profileID") CDPProfileIDInput profileIDInput,
            final DataFetchingEnvironment environment
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("profileID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    public CDPProfileAlias removeAliasFromProfile(
            final @GraphQLID @GraphQLNonNull @GraphQLName("alias") String alias,
            final @GraphQLName("profileID") CDPProfileIDInput profileIDInput,
            final DataFetchingEnvironment environment
    ) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("list")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    @GraphQLField
    public CDPList createOrUpdateList(
            final @GraphQLName("list") CDPListInput listInput,
            final DataFetchingEnvironment environment) {
        return CreateOrUpdateListCommand.create(listInput)
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("listID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    @GraphQLField
    public CDPList addProfileToList(
            final @GraphQLName("listID") String listId,
            final @GraphQLName("profileID") CDPProfileIDInput profileIDInput,
            final @GraphQLName("active") Boolean active,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("profileID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    public CDPList addProfileToList(
            final @GraphQLName("listID") String listId,
            final @GraphQLName("profileID") CDPProfileIDInput profileIDInput,
            final @GraphQLName("active") Boolean active,
            final DataFetchingEnvironment environment) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("active")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
            final @GraphQLName("listID") String listId,
            final @GraphQLName("profileID") CDPProfileIDInput profileIDInput,
            final @GraphQLName("active") Boolean active,
            final DataFetchingEnvironment environment) {
        return AddProfileToListCommand.create()
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName(PERSONA_ARGUMENT_NAME)`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    @GraphQLField
    public CDPPersona createOrUpdatePersona(
            final @GraphQLName(PERSONA_ARGUMENT_NAME) CDPPersonaInput personaInput,
            final DataFetchingEnvironment environment) {
        return CreateOrUpdatePersonaCommand.create(personaInput)
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("properties")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    @GraphQLField
    public boolean createOrUpdateProfileProperties(
            final @GraphQLName("properties") List<CDPPropertyInput> properties,
            final DataFetchingEnvironment environment) {

```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLName("listID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    @GraphQLField
    public Boolean deleteList(
            final @GraphQLID @GraphQLName("listID") String listId,
            final DataFetchingEnvironment environment) {
        return DeleteListCommand.create(listId)
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLName("segmentID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPMutation.java`
#### Snippet
```java
    @GraphQLField
    public boolean deleteSegment(
            final @GraphQLID @GraphQLName("segmentID") String segmentId,
            final DataFetchingEnvironment environment
    ) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("views")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfile.java`
#### Snippet
```java
    @Override
    @GraphQLField
    public List<CDPList> cdp_lists(final @GraphQLName("views") List<String> viewIds, final DataFetchingEnvironment environment) throws Exception {
        return new ProfileListsDataFetcher(profile, viewIds).get(environment);
    }
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("profileID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfile.java`
#### Snippet
```java
    @GraphQLField
    public CDPEventConnection cdp_lastEvents(
            final @GraphQLName("profileID") CDPProfileIDInput profileID,
            final @GraphQLName("count") Integer count,
            final DataFetchingEnvironment environment
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("count")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfile.java`
#### Snippet
```java
    public CDPEventConnection cdp_lastEvents(
            final @GraphQLName("profileID") CDPProfileIDInput profileID,
            final @GraphQLName("count") Integer count,
            final DataFetchingEnvironment environment
    ) throws Exception {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("views")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfile.java`
#### Snippet
```java
    @Override
    @GraphQLField
    public List<CDPSegment> cdp_segments(final @GraphQLName("views") List<String> viewIds, final DataFetchingEnvironment environment) throws Exception {
        return new ProfileSegmentsDataFetcher(profile, viewIds).get(environment);
    }
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("filter")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfile.java`
#### Snippet
```java
    @GraphQLField
    public CDPEventConnection cdp_events(
            final @GraphQLName("filter") CDPEventFilterInput filterInput,
            final @GraphQLName("first") Integer first,
            final @GraphQLName("last") Integer last,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("first")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfile.java`
#### Snippet
```java
    public CDPEventConnection cdp_events(
            final @GraphQLName("filter") CDPEventFilterInput filterInput,
            final @GraphQLName("first") Integer first,
            final @GraphQLName("last") Integer last,
            final @GraphQLName("before") String before,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("last")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfile.java`
#### Snippet
```java
            final @GraphQLName("filter") CDPEventFilterInput filterInput,
            final @GraphQLName("first") Integer first,
            final @GraphQLName("last") Integer last,
            final @GraphQLName("before") String before,
            final @GraphQLName("after") String after,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("before")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfile.java`
#### Snippet
```java
            final @GraphQLName("first") Integer first,
            final @GraphQLName("last") Integer last,
            final @GraphQLName("before") String before,
            final @GraphQLName("after") String after,
            final DataFetchingEnvironment environment
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("after")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfile.java`
#### Snippet
```java
            final @GraphQLName("last") Integer last,
            final @GraphQLName("before") String before,
            final @GraphQLName("after") String after,
            final DataFetchingEnvironment environment
    ) throws Exception {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("views")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfile.java`
#### Snippet
```java
    @Override
    @GraphQLField
    public List<CDPInterest> cdp_interests(final @GraphQLName("views") List<String> viewIds, final DataFetchingEnvironment environment) throws Exception {
        return new ProfileInterestsDataFetcher(profile, viewIds).get(environment);
    }
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("profileID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
    @GraphQLField
    public CDPProfile getProfile(
            final @GraphQLName("profileID") @GraphQLNonNull CDPProfileIDInput profileID,
            final @GraphQLName("createIfMissing") Boolean createIfMissing,
            final DataFetchingEnvironment environment) throws Exception {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("createIfMissing")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
    public CDPProfile getProfile(
            final @GraphQLName("profileID") @GraphQLNonNull CDPProfileIDInput profileID,
            final @GraphQLName("createIfMissing") Boolean createIfMissing,
            final DataFetchingEnvironment environment) throws Exception {

```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("filter")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
    @GraphQLField
    public CDPListConnection findLists(
            final @GraphQLName("filter") CDPListFilterInput filterInput,
            final @GraphQLName("orderBy") List<CDPOrderByInput> orderByInput,
            final @GraphQLName("first") Integer first,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("orderBy")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
    public CDPListConnection findLists(
            final @GraphQLName("filter") CDPListFilterInput filterInput,
            final @GraphQLName("orderBy") List<CDPOrderByInput> orderByInput,
            final @GraphQLName("first") Integer first,
            final @GraphQLName("after") String after,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("first")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
            final @GraphQLName("filter") CDPListFilterInput filterInput,
            final @GraphQLName("orderBy") List<CDPOrderByInput> orderByInput,
            final @GraphQLName("first") Integer first,
            final @GraphQLName("after") String after,
            final @GraphQLName("last") Integer last,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("after")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
            final @GraphQLName("orderBy") List<CDPOrderByInput> orderByInput,
            final @GraphQLName("first") Integer first,
            final @GraphQLName("after") String after,
            final @GraphQLName("last") Integer last,
            final @GraphQLName("before") String before,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("last")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
            final @GraphQLName("first") Integer first,
            final @GraphQLName("after") String after,
            final @GraphQLName("last") Integer last,
            final @GraphQLName("before") String before,
            final DataFetchingEnvironment environment) throws Exception {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("before")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
            final @GraphQLName("after") String after,
            final @GraphQLName("last") Integer last,
            final @GraphQLName("before") String before,
            final DataFetchingEnvironment environment) throws Exception {
        return new ListConnectionDataFetcher(filterInput, orderByInput).get(environment);
```

### MissortedModifiers
Missorted modifiers `final @GraphQLNonNull @GraphQLName("id")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java

    @GraphQLField
    public CDPEventInterface getEvent(final @GraphQLNonNull @GraphQLName("id") String id, final DataFetchingEnvironment environment) throws Exception {
        return new EventDataFetcher(id).get(environment);
    }
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("filter")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java

    @GraphQLField
    public CDPTopicConnection findTopics(final @GraphQLName("filter") CDPTopicFilterInput filterInput,
                                         final @GraphQLName("orderBy") List<CDPOrderByInput> orderByInput,
                                         final @GraphQLName("first") Integer first,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("orderBy")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
    @GraphQLField
    public CDPTopicConnection findTopics(final @GraphQLName("filter") CDPTopicFilterInput filterInput,
                                         final @GraphQLName("orderBy") List<CDPOrderByInput> orderByInput,
                                         final @GraphQLName("first") Integer first,
                                         final @GraphQLName("after") String after,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("first")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
    public CDPTopicConnection findTopics(final @GraphQLName("filter") CDPTopicFilterInput filterInput,
                                         final @GraphQLName("orderBy") List<CDPOrderByInput> orderByInput,
                                         final @GraphQLName("first") Integer first,
                                         final @GraphQLName("after") String after,
                                         final @GraphQLName("last") Integer last,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("after")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
                                         final @GraphQLName("orderBy") List<CDPOrderByInput> orderByInput,
                                         final @GraphQLName("first") Integer first,
                                         final @GraphQLName("after") String after,
                                         final @GraphQLName("last") Integer last,
                                         final @GraphQLName("before") String before,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("last")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
                                         final @GraphQLName("first") Integer first,
                                         final @GraphQLName("after") String after,
                                         final @GraphQLName("last") Integer last,
                                         final @GraphQLName("before") String before,
                                         final DataFetchingEnvironment environment) throws Exception {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("before")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
                                         final @GraphQLName("after") String after,
                                         final @GraphQLName("last") Integer last,
                                         final @GraphQLName("before") String before,
                                         final DataFetchingEnvironment environment) throws Exception {
        return new FindTopicsConnectionDataFetcher(filterInput, orderByInput).get(environment);
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("filter")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
    @GraphQLField
    public CDPEventConnection findEvents(
            final @GraphQLName("filter") CDPEventFilterInput filter,
            final @GraphQLName("orderBy") List<CDPOrderByInput> orderBy,
            final @GraphQLName("first") Integer first,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("orderBy")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
    public CDPEventConnection findEvents(
            final @GraphQLName("filter") CDPEventFilterInput filter,
            final @GraphQLName("orderBy") List<CDPOrderByInput> orderBy,
            final @GraphQLName("first") Integer first,
            final @GraphQLName("after") String after,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("first")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
            final @GraphQLName("filter") CDPEventFilterInput filter,
            final @GraphQLName("orderBy") List<CDPOrderByInput> orderBy,
            final @GraphQLName("first") Integer first,
            final @GraphQLName("after") String after,
            final @GraphQLName("last") Integer last,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("after")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
            final @GraphQLName("orderBy") List<CDPOrderByInput> orderBy,
            final @GraphQLName("first") Integer first,
            final @GraphQLName("after") String after,
            final @GraphQLName("last") Integer last,
            final @GraphQLName("before") String before,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("last")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
            final @GraphQLName("first") Integer first,
            final @GraphQLName("after") String after,
            final @GraphQLName("last") Integer last,
            final @GraphQLName("before") String before,
            final
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("before")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
            final @GraphQLName("after") String after,
            final @GraphQLName("last") Integer last,
            final @GraphQLName("before") String before,
            final
            @GraphQLName("unomi_text")
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("unomi_text") @GraphQLDescription("The text that the item must have in one of its fields to be considered a match")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
            final @GraphQLName("last") Integer last,
            final @GraphQLName("before") String before,
            final
            @GraphQLName("unomi_text")
            @GraphQLDescription("The text that the item must have in one of its fields to be considered a match")
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLName("segmentID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java

    @GraphQLField
    public CDPSegment getSegment(final @GraphQLID @GraphQLName("segmentID") String segmentId,
                                 final DataFetchingEnvironment environment) throws Exception {
        return new SegmentDataFetcher(segmentId).get(environment);
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("first")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java

    @GraphQLField
    public CDPPropertyConnection getProfileProperties(final @GraphQLName("first") Integer first,
                                                      final @GraphQLName("after") String after,
                                                      final @GraphQLName("last") Integer last,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("after")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
    @GraphQLField
    public CDPPropertyConnection getProfileProperties(final @GraphQLName("first") Integer first,
                                                      final @GraphQLName("after") String after,
                                                      final @GraphQLName("last") Integer last,
                                                      final @GraphQLName("before") String before,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("last")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
    public CDPPropertyConnection getProfileProperties(final @GraphQLName("first") Integer first,
                                                      final @GraphQLName("after") String after,
                                                      final @GraphQLName("last") Integer last,
                                                      final @GraphQLName("before") String before,
                                                      final DataFetchingEnvironment environment) throws Exception {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("before")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
                                                      final @GraphQLName("after") String after,
                                                      final @GraphQLName("last") Integer last,
                                                      final @GraphQLName("before") String before,
                                                      final DataFetchingEnvironment environment) throws Exception {
        return new PropertiesConnectionDataFetcher().get(environment);
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLName("listID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
    @GraphQLField
    public CDPList getList(
            final @GraphQLID @GraphQLName("listID") String listId,
            final DataFetchingEnvironment environment) throws Exception {
        return new GetListDataFetcher(listId).get(environment);
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("filter")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
    @GraphQLField
    public CDPProfileAliasConnection findProfileAliases(
            final @GraphQLName("filter") CDPProfileAliasFilterInput filterInput,
            final @GraphQLName("orderBy") List<CDPOrderByInput> orderByInput,
            final @GraphQLName("first") Integer first,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("orderBy")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
    public CDPProfileAliasConnection findProfileAliases(
            final @GraphQLName("filter") CDPProfileAliasFilterInput filterInput,
            final @GraphQLName("orderBy") List<CDPOrderByInput> orderByInput,
            final @GraphQLName("first") Integer first,
            final @GraphQLName("after") String after,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("first")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
            final @GraphQLName("filter") CDPProfileAliasFilterInput filterInput,
            final @GraphQLName("orderBy") List<CDPOrderByInput> orderByInput,
            final @GraphQLName("first") Integer first,
            final @GraphQLName("after") String after,
            final @GraphQLName("last") Integer last,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("after")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
            final @GraphQLName("orderBy") List<CDPOrderByInput> orderByInput,
            final @GraphQLName("first") Integer first,
            final @GraphQLName("after") String after,
            final @GraphQLName("last") Integer last,
            final @GraphQLName("before") String before,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("last")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
            final @GraphQLName("first") Integer first,
            final @GraphQLName("after") String after,
            final @GraphQLName("last") Integer last,
            final @GraphQLName("before") String before,
            final DataFetchingEnvironment environment
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("before")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
            final @GraphQLName("after") String after,
            final @GraphQLName("last") Integer last,
            final @GraphQLName("before") String before,
            final DataFetchingEnvironment environment
    ) throws Exception {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLName("profileID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
    @GraphQLField
    public List<CDPProfileAlias> getProfileAliases(
            final @GraphQLID @GraphQLName("profileID") @GraphQLNonNull String profileID,
            final DataFetchingEnvironment environment) throws Exception {
        return new GetProfileAliasesDataFetcher(profileID).get(environment);
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("filter")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java

    @GraphQLField
    public CDPSegmentConnection findSegments(final @GraphQLName("filter") CDPSegmentFilterInput filter,
                                             final @GraphQLName("orderBy") List<CDPOrderByInput> orderBy,
                                             final @GraphQLName("first") Integer first,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("orderBy")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
    @GraphQLField
    public CDPSegmentConnection findSegments(final @GraphQLName("filter") CDPSegmentFilterInput filter,
                                             final @GraphQLName("orderBy") List<CDPOrderByInput> orderBy,
                                             final @GraphQLName("first") Integer first,
                                             final @GraphQLName("after") String after,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("first")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
    public CDPSegmentConnection findSegments(final @GraphQLName("filter") CDPSegmentFilterInput filter,
                                             final @GraphQLName("orderBy") List<CDPOrderByInput> orderBy,
                                             final @GraphQLName("first") Integer first,
                                             final @GraphQLName("after") String after,
                                             final @GraphQLName("last") Integer last,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("after")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
                                             final @GraphQLName("orderBy") List<CDPOrderByInput> orderBy,
                                             final @GraphQLName("first") Integer first,
                                             final @GraphQLName("after") String after,
                                             final @GraphQLName("last") Integer last,
                                             final @GraphQLName("before") String before,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("last")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
                                             final @GraphQLName("first") Integer first,
                                             final @GraphQLName("after") String after,
                                             final @GraphQLName("last") Integer last,
                                             final @GraphQLName("before") String before,
                                             final DataFetchingEnvironment environment) {
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("before")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
                                             final @GraphQLName("after") String after,
                                             final @GraphQLName("last") Integer last,
                                             final @GraphQLName("before") String before,
                                             final DataFetchingEnvironment environment) {
        return new FindSegmentsConnectionDataFetcher(filter, orderBy).get(environment);
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("filter")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
    @GraphQLField
    public CDPProfileConnection findProfiles(
            final @GraphQLName("filter") CDPProfileFilterInput filter,
            final @GraphQLName("orderBy") List<CDPOrderByInput> orderBy,
            final @GraphQLName("first") Integer first,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("orderBy")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
    public CDPProfileConnection findProfiles(
            final @GraphQLName("filter") CDPProfileFilterInput filter,
            final @GraphQLName("orderBy") List<CDPOrderByInput> orderBy,
            final @GraphQLName("first") Integer first,
            final @GraphQLName("after") String after,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("first")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
            final @GraphQLName("filter") CDPProfileFilterInput filter,
            final @GraphQLName("orderBy") List<CDPOrderByInput> orderBy,
            final @GraphQLName("first") Integer first,
            final @GraphQLName("after") String after,
            final @GraphQLName("last") Integer last,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("after")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
            final @GraphQLName("orderBy") List<CDPOrderByInput> orderBy,
            final @GraphQLName("first") Integer first,
            final @GraphQLName("after") String after,
            final @GraphQLName("last") Integer last,
            final @GraphQLName("before") String before,
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("last")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
            final @GraphQLName("first") Integer first,
            final @GraphQLName("after") String after,
            final @GraphQLName("last") Integer last,
            final @GraphQLName("before") String before,
            final
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("before")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
            final @GraphQLName("after") String after,
            final @GraphQLName("last") Integer last,
            final @GraphQLName("before") String before,
            final
            @GraphQLName("unomi_text")
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("unomi_text") @GraphQLDescription("The text that the item must have in one of its fields to be considered a match")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
            final @GraphQLName("last") Integer last,
            final @GraphQLName("before") String before,
            final
            @GraphQLName("unomi_text")
            @GraphQLDescription("The text that the item must have in one of its fields to be considered a match")
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLNonNull @GraphQLName("alias")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java
    @GraphQLField
    public CDPProfileAlias getProfileAlias(
            final @GraphQLID @GraphQLNonNull @GraphQLName("alias") String alias,
            final DataFetchingEnvironment environment) throws Exception {
        return new ProfileAliasDataFetcher(alias).get(environment);
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLName("segmentID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java

    @GraphQLField
    public UnomiSegment getUnomiSegment(final @GraphQLID @GraphQLName("segmentID") String segmentId,
                                        final DataFetchingEnvironment environment) throws Exception {
        return new UnomiSegmentDataFetcher(segmentId).get(environment);
```

### MissortedModifiers
Missorted modifiers `final @GraphQLID @GraphQLName("topicID")`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPQuery.java`
#### Snippet
```java

    @GraphQLField
    public CDPTopic getTopic(final @GraphQLID @GraphQLName("topicID") String topicId,
                             final DataFetchingEnvironment environment) throws Exception {
        return new TopicDataFetcher(topicId).get(environment);
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/BaseCommand.java`
#### Snippet
```java
    }

    public static abstract class Builder<B extends Builder> {

        protected DataFetchingEnvironment environment;
```

### MissortedModifiers
Missorted modifiers `final @GraphQLName("name")`
in `samples/graphql-providers/src/main/java/org/apache/unomi/graphql/providers/sample/MyEventInput.java`
#### Snippet
```java
    private String name;

    public MyEventInput(final @GraphQLName("name") String name) {
        this.name = name;
    }
```

### MissortedModifiers
Missorted modifiers `final @PathParam("profileId")`
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ProfileServiceEndPoint.java`
#### Snippet
```java
    @DELETE
    @Path("/{profileId}/aliases/{aliasId}")
    public void removeAliasFromProfile(final @PathParam("profileId") String profileId,
                                       final @PathParam("aliasId") String aliasId,
                                       final @HeaderParam("X-Unomi-ClientId") String headerClientID) {
```

### MissortedModifiers
Missorted modifiers `final @PathParam("aliasId")`
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ProfileServiceEndPoint.java`
#### Snippet
```java
    @Path("/{profileId}/aliases/{aliasId}")
    public void removeAliasFromProfile(final @PathParam("profileId") String profileId,
                                       final @PathParam("aliasId") String aliasId,
                                       final @HeaderParam("X-Unomi-ClientId") String headerClientID) {
        String clientId = headerClientID != null ? headerClientID : "defaultClientId";
```

### MissortedModifiers
Missorted modifiers `final @HeaderParam("X-Unomi-ClientId")`
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ProfileServiceEndPoint.java`
#### Snippet
```java
    public void removeAliasFromProfile(final @PathParam("profileId") String profileId,
                                       final @PathParam("aliasId") String aliasId,
                                       final @HeaderParam("X-Unomi-ClientId") String headerClientID) {
        String clientId = headerClientID != null ? headerClientID : "defaultClientId";
        profileService.removeAliasFromProfile(profileId, aliasId, clientId);
```

### MissortedModifiers
Missorted modifiers `final @PathParam("profileId")`
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ProfileServiceEndPoint.java`
#### Snippet
```java
    @GET
    @Path("/{profileId}/aliases")
    public PartialList<ProfileAlias> listAliasesByProfileId(final @PathParam("profileId") String profileId,
                                                            @QueryParam("offset") @DefaultValue("0") int offset,
                                                            @QueryParam("size") @DefaultValue("50") int size,
```

### MissortedModifiers
Missorted modifiers `final @PathParam("profileId")`
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ProfileServiceEndPoint.java`
#### Snippet
```java
    @POST
    @Path("/{profileId}/aliases/{aliasId}")
    public void addAliasToProfile(final @PathParam("profileId") String profileId,
                                  final @PathParam("aliasId") String aliasId,
                                  final @HeaderParam("X-Unomi-ClientId") String headerClientID) {
```

### MissortedModifiers
Missorted modifiers `final @PathParam("aliasId")`
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ProfileServiceEndPoint.java`
#### Snippet
```java
    @Path("/{profileId}/aliases/{aliasId}")
    public void addAliasToProfile(final @PathParam("profileId") String profileId,
                                  final @PathParam("aliasId") String aliasId,
                                  final @HeaderParam("X-Unomi-ClientId") String headerClientID) {
        String clientId = headerClientID != null ? headerClientID : "defaultClientId";
```

### MissortedModifiers
Missorted modifiers `final @HeaderParam("X-Unomi-ClientId")`
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ProfileServiceEndPoint.java`
#### Snippet
```java
    public void addAliasToProfile(final @PathParam("profileId") String profileId,
                                  final @PathParam("aliasId") String aliasId,
                                  final @HeaderParam("X-Unomi-ClientId") String headerClientID) {
        String clientId = headerClientID != null ? headerClientID : "defaultClientId";
        profileService.addAliasToProfile(profileId, aliasId, clientId);
```

### MissortedModifiers
Missorted modifiers `final static`
in `api/src/main/java/org/apache/unomi/api/Patch.java`
#### Snippet
```java
    private static final long serialVersionUID = 4171966405850833985L;

    public final static Map<String, Class<? extends Item>> PATCHABLE_TYPES;

    static {
```

### MissortedModifiers
Missorted modifiers `final static`
in `api/src/main/java/org/apache/unomi/api/PersonalizationResult.java`
#### Snippet
```java
public class PersonalizationResult implements Serializable  {

    public final static String ADDITIONAL_RESULT_INFO_IN_CONTROL_GROUP = "inControlGroup";

    List<String> contentIds;
```

### MissortedModifiers
Missorted modifiers `final static`
in `scripting/src/main/java/org/apache/unomi/scripting/MvelScriptExecutor.java`
#### Snippet
```java
public class MvelScriptExecutor implements ScriptExecutor {

    private final static String INVALID_SCRIPT_MARKER = "--- Invalid Script Marker ---";

    private Map<String, Serializable> mvelExpressions = new ConcurrentHashMap<>();
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ArrayUtils.toPrimitive()` is ignored
in `services/src/main/java/org/apache/unomi/services/impl/cluster/ClusterServiceImpl.java`
#### Snippet
```java
                if (loadAverage != null) {
                    Double[] loadAverageArray = loadAverage.toArray(new Double[loadAverage.size()]);
                    ArrayUtils.toPrimitive(loadAverageArray);
                    clusterNode.setLoadAverage(ArrayUtils.toPrimitive(loadAverageArray));
                }
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `plugins/mail/src/main/java/org/apache/unomi/plugins/mail/actions/SendMailAction.java`
#### Snippet
```java
        if (profileNotif != null && profileNotif.get(notifType) != null && ((HashMap) profileNotif.get(notifType)).get(notifTypeId) != null) {
            Integer notifTypeAck = (Integer) ((HashMap) profileNotif.get(notifType) ).get(notifTypeId);
            if(notifyOnce.booleanValue() && notifTypeAck > 0){
                logger.info("Notification "+notifType+" already sent for the profile "+event.getProfileId());
                return EventService.NO_CHANGE;
```

## RuleId[id=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java
    @Override
    public void run() {
        while (consuming) {
            try {
                consume();
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `setRouterCamelContext()` only delegates to its super method
in `extensions/router/router-service/src/main/java/org/apache/unomi/router/services/ExportConfigurationServiceImpl.java`
#### Snippet
```java

    @Override
    public void setRouterCamelContext(IRouterCamelContext routerCamelContext) {
        super.setRouterCamelContext(routerCamelContext);
    }
```

### RedundantMethodOverride
Method `setRouterCamelContext()` only delegates to its super method
in `extensions/router/router-service/src/main/java/org/apache/unomi/router/services/ImportConfigurationServiceImpl.java`
#### Snippet
```java

    @Override
    public void setRouterCamelContext(IRouterCamelContext routerCamelContext) {
        super.setRouterCamelContext(routerCamelContext);
    }
```

### RedundantMethodOverride
Method `findClass()` only delegates to its super method
in `scripting/src/main/java/org/apache/unomi/scripting/SecureFilteringClassLoader.java`
#### Snippet
```java

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/CreateOrUpdateViewCommand.java`
#### Snippet
```java
    }

    public static class Builder extends BaseCommand.Builder<Builder> {

        final CDPViewInput viewInput;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/DeleteViewCommand.java`
#### Snippet
```java
    }

    public static class Builder extends BaseCommand.Builder<Builder> {

        final String viewId;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/DeleteSourceCommand.java`
#### Snippet
```java
    }

    public static class Builder extends BaseCommand.Builder<Builder> {

        final String sourceId;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/CreateOrUpdateSourceCommand.java`
#### Snippet
```java
    }

    public static class Builder extends BaseCommand.Builder<Builder> {

        final CDPSourceInput sourceInput;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/DeleteTopicCommand.java`
#### Snippet
```java
    }

    public static class Builder extends BaseCommand.Builder<Builder> {

        final String topicId;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/DeleteAllPersonalDataCommand.java`
#### Snippet
```java
    }

    public static class Builder extends BaseCommand.Builder<Builder> {

        public Builder() {
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/RemoveAliasFromProfileCommand.java`
#### Snippet
```java
    }

    public static class Builder extends BaseCommand.Builder<Builder> {

        private String alias;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/DeleteProfileCommand.java`
#### Snippet
```java
    }

    public static class Builder extends BaseCommand.Builder<Builder> {

        public DeleteProfileCommand build() {
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/AddAliasToProfileCommand.java`
#### Snippet
```java
    }

    public static class Builder extends BaseCommand.Builder<Builder> {

        private CDPProfileAliasInput profileAliasInput;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/CreateOrUpdateTopicCommand.java`
#### Snippet
```java
    }

    public static class Builder extends BaseCommand.Builder<Builder> {

        final CDPTopicInput topicInput;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/list/AddProfileToListCommand.java`
#### Snippet
```java
    }

    public static class Builder extends BaseCommand.Builder<Builder> {

        private String listId;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/list/DeleteListCommand.java`
#### Snippet
```java
    }

    public static class Builder extends BaseCommand.Builder<Builder> {

        private final String listId;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/list/RemoveProfileFromListCommand.java`
#### Snippet
```java
    }

    public static class Builder extends BaseCommand.Builder<Builder> {

        private String listId;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/list/CreateOrUpdateListCommand.java`
#### Snippet
```java
    }

    public static class Builder extends BaseCommand.Builder<Builder> {

        private final CDPListInput listInput;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/segments/DeleteSegmentCommand.java`
#### Snippet
```java
    }

    public static class Builder extends BaseCommand.Builder<Builder> {

        private final String segmentId;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/CreateOrUpdateProfilePropertiesCommand.java`
#### Snippet
```java
    }

    public static class Builder extends BaseCommand.Builder<Builder> {

        final List<CDPPropertyInput> properties;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/DeleteProfilePropertiesCommand.java`
#### Snippet
```java
    }

    public static class Builder extends BaseCommand.Builder<Builder> {

        private final List<String> propertyNames;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/segments/CreateOrUpdateSegmentCommand.java`
#### Snippet
```java
    }

    public static class Builder extends BaseCreateOrUpdateSegmentCommand.Builder<CDPSegmentInput, Builder> {

        public Builder(CDPSegmentInput segmentInput) {
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/segments/CreateOrUpdateUnomiSegmentCommand.java`
#### Snippet
```java
    }

    public static class Builder extends BaseCreateOrUpdateSegmentCommand.Builder<UnomiSegmentInput, Builder> {

        public Builder(UnomiSegmentInput segmentInput) {
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/CreateOrUpdatePersonaCommand.java`
#### Snippet
```java
    }

    public static class Builder extends BaseCommand.Builder<Builder> {

        final CDPPersonaInput personaInput;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/segments/BaseCreateOrUpdateSegmentCommand.java`
#### Snippet
```java
    }

    public static class Builder<INPUT extends BaseSegmentInput, B extends BaseCommand.Builder> extends BaseCommand.Builder<B> {

        private final INPUT segmentInput;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/ProcessEventsCommand.java`
#### Snippet
```java


    public static final class Builder extends BaseCommand.Builder<Builder> {

        private final List<CDPEventInput> eventInputs;
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

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `metrics/src/main/java/org/apache/unomi/metrics/commands/ViewCommand.java`
#### Snippet
```java
public class ViewCommand extends MetricsCommandSupport{

    @Argument(index = 0, name = "metricName", description = "The identifier for the metric", required = true, multiValued = false)
    String metricName;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `metrics/src/main/java/org/apache/unomi/metrics/commands/ViewCommand.java`
#### Snippet
```java
public class ViewCommand extends MetricsCommandSupport{

    @Argument(index = 0, name = "metricName", description = "The identifier for the metric", required = true, multiValued = false)
    String metricName;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `metrics/src/main/java/org/apache/unomi/metrics/commands/CallerStatusCommand.java`
#### Snippet
```java
    boolean noFormat;

    @Argument(index = 0, name = "metricName", description = "The identifier for the metric", required = false, multiValued = false)
    String metricName;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `metrics/src/main/java/org/apache/unomi/metrics/commands/CallerStatusCommand.java`
#### Snippet
```java
    boolean noFormat;

    @Argument(index = 0, name = "metricName", description = "The identifier for the metric", required = false, multiValued = false)
    String metricName;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `metrics/src/main/java/org/apache/unomi/metrics/commands/CallerStatusCommand.java`
#### Snippet
```java
    boolean noFormat;

    @Argument(index = 0, name = "metricName", description = "The identifier for the metric", required = false, multiValued = false)
    String metricName;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `metrics/src/main/java/org/apache/unomi/metrics/commands/CallerStatusCommand.java`
#### Snippet
```java
public class CallerStatusCommand extends MetricsCommandSupport {

    @Option(name = "--no-format", description = "Disable table rendered output", required = false, multiValued = false)
    boolean noFormat;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `metrics/src/main/java/org/apache/unomi/metrics/commands/CallerStatusCommand.java`
#### Snippet
```java
public class CallerStatusCommand extends MetricsCommandSupport {

    @Option(name = "--no-format", description = "Disable table rendered output", required = false, multiValued = false)
    boolean noFormat;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `metrics/src/main/java/org/apache/unomi/metrics/commands/CallerStatusCommand.java`
#### Snippet
```java
    String metricName;

    @Argument(index = 1, name = "status", description = "The new status for the metric's caller tracing", required = false, multiValued = false)
    Boolean metricStatus;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `metrics/src/main/java/org/apache/unomi/metrics/commands/CallerStatusCommand.java`
#### Snippet
```java
    String metricName;

    @Argument(index = 1, name = "status", description = "The new status for the metric's caller tracing", required = false, multiValued = false)
    Boolean metricStatus;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `metrics/src/main/java/org/apache/unomi/metrics/commands/ListCommand.java`
#### Snippet
```java
public class ListCommand extends MetricsCommandSupport {

    @Option(name = "--csv", description = "Output table in CSV format", required = false, multiValued = false)
    boolean csv;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `metrics/src/main/java/org/apache/unomi/metrics/commands/ListCommand.java`
#### Snippet
```java
public class ListCommand extends MetricsCommandSupport {

    @Option(name = "--csv", description = "Output table in CSV format", required = false, multiValued = false)
    boolean csv;

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

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/utils/GraphQLObjectMapper.java`
#### Snippet
```java
    private GraphQLObjectMapper() {
        super();
        super.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        super.registerModule(new JaxbAnnotationModule());
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/utils/GraphQLObjectMapper.java`
#### Snippet
```java
        super();
        super.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        super.registerModule(new JaxbAnnotationModule());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/CustomObjectMapper.java`
#### Snippet
```java
    public CustomObjectMapper(Map<Class, StdDeserializer<?>> deserializers) {
        super();
        super.registerModule(new JaxbAnnotationModule());
        configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        setSerializationInclusion(JsonInclude.Include.NON_NULL);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/CustomObjectMapper.java`
#### Snippet
```java
        propertyTypedObjectDeserializer.registerMapping("itemType=.*", CustomItem.class);

        super.registerModule(deserializerModule);
    }

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
Unused import `import groovy.util.GroovyScriptEngine;`
in `extensions/groovy-actions/services/src/main/java/org/apache/unomi/groovy/actions/services/GroovyActionsService.java`
#### Snippet
```java
import groovy.lang.GroovyCodeSource;
import groovy.lang.GroovyShell;
import groovy.util.GroovyScriptEngine;
import org.apache.unomi.groovy.actions.GroovyAction;

```

### UNUSED_IMPORT
Unused import `import org.osgi.framework.BundleContext;`
in `extensions/privacy-extension/services/src/main/java/org/apache/unomi/privacy/internal/PrivacyServiceImpl.java`
#### Snippet
```java
import org.apache.unomi.persistence.spi.PersistenceService;
import org.apache.unomi.persistence.spi.aggregate.TermsAggregate;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
Unused import `import org.apache.http.ssl.SSLContexts;`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.apache.unomi.api.Consent;
```

### UNUSED_IMPORT
Unused import `import org.json.JSONObject;`
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/MailChimpService.java`
#### Snippet
```java
import org.apache.unomi.api.Profile;
import org.apache.unomi.api.actions.Action;
import org.json.JSONObject;

import java.util.HashMap;
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
Unused import `import org.osgi.service.component.annotations.Reference;`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/services/ServiceManager.java`
#### Snippet
```java
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = ServiceManager.class)
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
Unused import `import org.apache.karaf.shell.console.OsgiCommandSupport;`
in `metrics/src/main/java/org/apache/unomi/metrics/commands/ResetCommand.java`
#### Snippet
```java

import org.apache.karaf.shell.commands.Command;
import org.apache.karaf.shell.console.OsgiCommandSupport;
import org.apache.unomi.metrics.MetricsService;

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
Unused import `import org.apache.commons.lang3.StringUtils;`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/SendEventAction.java`
#### Snippet
```java
package org.apache.unomi.plugins.baseplugin.actions;

import org.apache.commons.lang3.StringUtils;
import org.apache.unomi.api.Event;
import org.apache.unomi.api.Item;
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
Unused import `import org.apache.commons.lang3.StringUtils;`
in `services/src/main/java/org/apache/unomi/services/actions/impl/ActionExecutorDispatcherImpl.java`
#### Snippet
```java

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.unomi.api.Event;
import org.apache.unomi.api.actions.Action;
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

### UNUSED_IMPORT
Unused import `import org.apache.commons.lang3.CharEncoding;`
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.CharEncoding;
import org.apache.unomi.api.Event;
import org.apache.unomi.api.Item;
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `metrics/src/main/java/org/apache/unomi/metrics/internal/MetricImpl.java`
#### Snippet
```java
    @Override
    public long addTotalTime(long time) {
        return totalTime += time;
    }

```

### NestedAssignment
Result of assignment expression used
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
                bufferedReader = new BufferedReader(new InputStreamReader(logoURL.openStream()));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    if (!line.trim().startsWith("#")) {
                        logoLines.add(line);
```

### NestedAssignment
Result of assignment expression used
in `extensions/geonames/services/src/main/java/org/apache/unomi/geonames/services/GeonamesServiceImpl.java`
#### Snippet
```java
            long lastCharCount = 0;
            long importStartTime = System.currentTimeMillis();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split("\t");

```

### NestedAssignment
Result of assignment expression used
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
        StringBuilder content = new StringBuilder();
        String l;
        while ((l = reader.readLine()) != null) {
            content.append(l);
        }
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/auth/GraphQLServletSecurityValidator.java`
#### Snippet
```java
            List<Node> children = opDef.getSelectionSet().getChildren();
            final Field cdp = (Field) children.stream().filter((node) -> {
                return (node instanceof Field) && "cdp".equals(((Field) node).getName());
            }).findFirst().orElse(null);
            if (cdp == null) {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/auth/GraphQLServletSecurityValidator.java`
#### Snippet
```java

            return cdp.getSelectionSet().getChildren().stream().allMatch((node) -> {
                return (node instanceof Field) && allowedNodeNames.contains(((Field) node).getName());
            });
        }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/CreateOrUpdatePersonaCommand.java`
#### Snippet
```java
        persona.setSegments(personaInput.getCdp_segments());
        if (personaInput.getCdp_consents() != null && !personaInput.getCdp_consents().isEmpty()) {
            personaInput.getCdp_consents().forEach(consentInput -> {
                persona.setConsent(createConsent(personaInput.getCdp_view(), consentInput));
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                if (bulkResponse.hasFailures()) {
                    Iterator<BulkItemResponse> iterator = bulkResponse.iterator();
                    iterator.forEachRemaining(bulkItemResponse -> {
                        failedItemsIds.add(bulkItemResponse.getId());
                    });
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

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `serverBus` is accessed in both synchronized and unsynchronized contexts
in `rest/src/main/java/org/apache/unomi/rest/server/RestServer.java`
#### Snippet
```java

    // services
    private Bus serverBus;
    private RestAuthenticationConfig restAuthenticationConfig;
    private List<ExceptionMapper> exceptionMappers = new ArrayList<>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `refreshTimer` is accessed in both synchronized and unsynchronized contexts
in `rest/src/main/java/org/apache/unomi/rest/server/RestServer.java`
#### Snippet
```java
    // refresh
    private long timeOfLastUpdate = System.currentTimeMillis();
    private Timer refreshTimer = null;
    private long startupDelay = 1000L;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `exceptionMappers` is accessed in both synchronized and unsynchronized contexts
in `rest/src/main/java/org/apache/unomi/rest/server/RestServer.java`
#### Snippet
```java
    private Bus serverBus;
    private RestAuthenticationConfig restAuthenticationConfig;
    private List<ExceptionMapper> exceptionMappers = new ArrayList<>();
    private ConfigSharingService configSharingService;
    private SchemaService schemaService;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `schemaService` is accessed in both synchronized and unsynchronized contexts
in `rest/src/main/java/org/apache/unomi/rest/server/RestServer.java`
#### Snippet
```java
    private List<ExceptionMapper> exceptionMappers = new ArrayList<>();
    private ConfigSharingService configSharingService;
    private SchemaService schemaService;

    // refresh
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `restAuthenticationConfig` is accessed in both synchronized and unsynchronized contexts
in `rest/src/main/java/org/apache/unomi/rest/server/RestServer.java`
#### Snippet
```java
    // services
    private Bus serverBus;
    private RestAuthenticationConfig restAuthenticationConfig;
    private List<ExceptionMapper> exceptionMappers = new ArrayList<>();
    private ConfigSharingService configSharingService;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `configSharingService` is accessed in both synchronized and unsynchronized contexts
in `rest/src/main/java/org/apache/unomi/rest/server/RestServer.java`
#### Snippet
```java
    private RestAuthenticationConfig restAuthenticationConfig;
    private List<ExceptionMapper> exceptionMappers = new ArrayList<>();
    private ConfigSharingService configSharingService;
    private SchemaService schemaService;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `timeOfLastUpdate` is accessed in both synchronized and unsynchronized contexts
in `rest/src/main/java/org/apache/unomi/rest/server/RestServer.java`
#### Snippet
```java

    // refresh
    private long timeOfLastUpdate = System.currentTimeMillis();
    private Timer refreshTimer = null;
    private long startupDelay = 1000L;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `server` is accessed in both synchronized and unsynchronized contexts
in `rest/src/main/java/org/apache/unomi/rest/server/RestServer.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(RestServer.class.getName());

    private Server server;
    private BundleContext bundleContext;
    private ServiceTracker jaxRSServiceTracker;
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java

        String bootstrapServers = getValue(properties, "bootstrap.servers", "localhost:9092");
        config.put("bootstrap.servers", bootstrapServers);

        String groupId = getValue(properties, "group.id", "unomi");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java

        String groupId = getValue(properties, "group.id", "unomi");
        config.put("group.id", groupId);

        String enableAutoCommit = getValue(properties, "enable.auto.commit", "true");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java

        String enableAutoCommit = getValue(properties, "enable.auto.commit", "true");
        config.put("enable.auto.commit", enableAutoCommit);

        String autoCommitIntervalMs = getValue(properties, "auto.commit.interval.ms", "1000");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java

        String autoCommitIntervalMs = getValue(properties, "auto.commit.interval.ms", "1000");
        config.put("auto.commit.interval.ms", autoCommitIntervalMs);

        String sessionTimeoutMs = getValue(properties,"session.timeout.ms", "30000");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java

        String sessionTimeoutMs = getValue(properties,"session.timeout.ms", "30000");
        config.put("session.timeout.ms", sessionTimeoutMs);

        String keyDeserializer = getValue(properties, "key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java

        String keyDeserializer = getValue(properties, "key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        config.put("key.deserializer", keyDeserializer);

        String valueDeserializer = getValue(properties, "value.deserializer", "org.apache.kafka.common.serialization.ValueDeserializer");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java

        String valueDeserializer = getValue(properties, "value.deserializer", "org.apache.kafka.common.serialization.ValueDeserializer");
        config.put("value.deserializer", valueDeserializer);

        String securityProtocol = getValue(properties, "security.protocol", null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java
        String securityProtocol = getValue(properties, "security.protocol", null);
        if (securityProtocol != null) {
            config.put("security.protocol", securityProtocol);
        }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java
        String sslTruststoreLocation = getValue(properties, "ssl.truststore.location", null);
        if (sslTruststoreLocation != null)
            config.put("ssl.truststore.location", sslTruststoreLocation);

        String sslTruststorePassword = getValue(properties, "ssl.truststore.password", null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java
        String sslTruststorePassword = getValue(properties, "ssl.truststore.password", null);
        if (sslTruststorePassword != null)
            config.put("ssl.truststore.password", sslTruststorePassword);

        String sslKeystoreLocation = getValue(properties, "ssl.keystore.location", null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java
        String sslKeystoreLocation = getValue(properties, "ssl.keystore.location", null);
        if (sslKeystoreLocation != null)
            config.put("ssl.keystore.location", sslKeystoreLocation);

        String sslKeystorePassword = getValue(properties, "ssl.keystore.password", null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java
        String sslKeystorePassword = getValue(properties, "ssl.keystore.password", null);
        if (sslKeystorePassword != null)
            config.put("ssl.keystore.password", sslKeystorePassword);

        String sslKeyPassword = getValue(properties, "ssl.key.password", null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java
        String sslKeyPassword = getValue(properties, "ssl.key.password", null);
        if (sslKeyPassword != null)
            config.put("ssl.key.password", sslKeyPassword);

        String sslProvider = getValue(properties, "ssl.provider", null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java
        String sslProvider = getValue(properties, "ssl.provider", null);
        if (sslProvider != null)
            config.put("ssl.provider", sslProvider);

        String sslCipherSuites = getValue(properties, "ssl.cipher.suites", null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java
        String sslCipherSuites = getValue(properties, "ssl.cipher.suites", null);
        if (sslCipherSuites != null)
            config.put("ssl.cipher.suites", sslCipherSuites);

        String sslEnabledProtocols = getValue(properties, "ssl.enabled.protocols", null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java
        String sslEnabledProtocols = getValue(properties, "ssl.enabled.protocols", null);
        if (sslEnabledProtocols != null)
            config.put("ssl.enabled.protocols", sslEnabledProtocols);

        String sslTruststoreType = getValue(properties, "ssl.truststore.type", null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java
        String sslTruststoreType = getValue(properties, "ssl.truststore.type", null);
        if (sslTruststoreType != null)
            config.put("ssl.truststore.type", sslTruststoreType);

        String sslKeystoreType = getValue(properties, "ssl.keystore.type", null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java
        String sslKeystoreType = getValue(properties, "ssl.keystore.type", null);
        if (sslKeystoreType != null)
            config.put("ssl.keystore.type", sslKeystoreType);

        ClassLoader originClassLoader = Thread.currentThread().getContextClassLoader();
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `api/src/main/java/org/apache/unomi/api/Parameter.java`
#### Snippet
```java
     */
    @Deprecated
    public void setChoiceListInitializerFilter(String choiceListInitializerFilter) {
        // Avoid errors when deploying old definitions
    }
```

### EmptyMethod
All implementations of this method are empty
in `api/src/main/java/org/apache/unomi/api/services/ProfileService.java`
#### Snippet
```java
     */
    @Deprecated
    void purgeMonthlyItems(int existsNumberOfMonths);
}

```

### EmptyMethod
The method is empty
in `extensions/geonames/services/src/main/java/org/apache/unomi/geonames/services/GeonamesServiceImpl.java`
#### Snippet
```java
    }

    public void stop() {
    }

```

### EmptyMethod
The method is empty
in `extensions/router/router-service/src/main/java/org/apache/unomi/router/services/AbstractCustomServiceImpl.java`
#### Snippet
```java
    }

    private void processBundleStop(BundleContext bundleContext) {
    }

```

### EmptyMethod
The method is empty
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
    }

    public void stop() {
    }

```

### EmptyMethod
All implementations of this method are empty
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PersistenceService.java`
#### Snippet
```java
     */
    @Deprecated
    void purge(Date date);

    /**
```

### EmptyMethod
The method is empty
in `services/src/main/java/org/apache/unomi/services/impl/cluster/ClusterSystemStatisticsEventHandler.java`
#### Snippet
```java
    }

    public void init() {
        // nothing to do
    }
```

### EmptyMethod
The method is empty
in `services/src/main/java/org/apache/unomi/services/impl/cluster/ClusterSystemStatisticsEventHandler.java`
#### Snippet
```java
    }

    public void destroy() {
        // nothing to do
    }
```

### EmptyMethod
The method is empty
in `services/src/main/java/org/apache/unomi/services/impl/goals/GoalsServiceImpl.java`
#### Snippet
```java
    }

    private void processBundleStop(BundleContext bundleContext) {
    }

```

### EmptyMethod
The method is empty
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
    }

    private void processBundleStop(BundleContext bundleContext) {
    }

```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `extensions/router/router-api/src/main/java/org/apache/unomi/router/api/ImportConfiguration.java`
#### Snippet
```java
    private List<String> propertiesToOverwrite;
    private boolean hasHeader = false;
    private boolean hasDeleteColumn = false;


```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `extensions/router/router-api/src/main/java/org/apache/unomi/router/api/ImportConfiguration.java`
#### Snippet
```java
    private boolean overwriteExistingProfiles = false;
    private List<String> propertiesToOverwrite;
    private boolean hasHeader = false;
    private boolean hasDeleteColumn = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `extensions/router/router-api/src/main/java/org/apache/unomi/router/api/ImportConfiguration.java`
#### Snippet
```java
    public static final String ITEM_TYPE = "importConfig";
    private String mergingProperty;
    private boolean overwriteExistingProfiles = false;
    private List<String> propertiesToOverwrite;
    private boolean hasHeader = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `services/src/main/java/org/apache/unomi/services/impl/cluster/ClusterServiceImpl.java`
#### Snippet
```java
    private String internalAddress;
    private Map<String, Map<String,Serializable>> nodeSystemStatistics = new ConcurrentHashMap<>();
    private Group group = null;
    private SchedulerService schedulerService;

```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `metrics/src/main/java/org/apache/unomi/metrics/internal/MetricImpl.java`
#### Snippet
```java

    private String name;
    private long totalCount = 0L;
    private long totalTime = 0L;
    private Map<String,CallerCount> callerCounts = new ConcurrentHashMap<String, CallerCount>();
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `metrics/src/main/java/org/apache/unomi/metrics/internal/MetricImpl.java`
#### Snippet
```java
    private String name;
    private long totalCount = 0L;
    private long totalTime = 0L;
    private Map<String,CallerCount> callerCounts = new ConcurrentHashMap<String, CallerCount>();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `metrics/src/main/java/org/apache/unomi/metrics/internal/MetricsServiceImpl.java`
#### Snippet
```java
public class MetricsServiceImpl implements MetricsService {

    boolean activated = false;
    Map<String,Metric> metrics = new ConcurrentHashMap<String,Metric>();
    Map<String,Boolean> callersStatus = new ConcurrentHashMap<>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
    private BundleContext bundleContext;
    private boolean startupMessageAlreadyDisplayed = false;
    private boolean shutdownMessageAlreadyDisplayed = false;

    private Integer checkStartupStateRefreshInterval = 60;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
    private String requiredServices;
    private Set<Filter> requiredServicesFilters = new LinkedHashSet<>();
    private long matchedRequiredServicesCount = 0;

    private BundleContext bundleContext;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java

    private BundleContext bundleContext;
    private boolean startupMessageAlreadyDisplayed = false;
    private boolean shutdownMessageAlreadyDisplayed = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java

    private Set<String> featuresToInstall = ConcurrentHashMap.newKeySet();
    private boolean installingFeatureStarted = false;
    private List<ServerInfo> serverInfos = new ArrayList<>();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
    private boolean sendProfileUpdateEventForSegmentUpdate = true;
    private int maximumIdsQueryCount = 5000;
    private boolean pastEventsDisablePartitions = false;
    private int dailyDateExprEvaluationHourUtc = 5;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
    private int maxRetriesForUpdateProfileSegment = 0;
    private long secondsDelayForRetryUpdateProfileSegment = 1;
    private boolean batchSegmentProfileUpdate = false;
    private boolean sendProfileUpdateEventForSegmentUpdate = true;
    private int maximumIdsQueryCount = 5000;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
    private long segmentRefreshInterval = 1000;
    private int aggregateQueryBucketSize = 5000;
    private int maxRetriesForUpdateProfileSegment = 0;
    private long secondsDelayForRetryUpdateProfileSegment = 1;
    private boolean batchSegmentProfileUpdate = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
    private TimerTask propertyTypeLoadTask = null;

    private boolean forceRefreshOnSave = false;

    public ProfileServiceImpl() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java

    private PropertyTypes propertyTypes;
    private TimerTask propertyTypeLoadTask = null;

    private boolean forceRefreshOnSave = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
    private Integer purgeEventExistTime = 0;
    private Integer purgeProfileInterval = 0;
    private TimerTask purgeTask = null;
    private long propertiesRefreshInterval = 10000;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/SetPropertyAction.java`
#### Snippet
```java
    private static final AtomicLong nowDeprecatedLogTimestamp = new AtomicLong();

    private boolean useEventToUpdateProfile = false;

    public void setUseEventToUpdateProfile(boolean useEventToUpdateProfile) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PastEventConditionESQueryBuilder.java`
#### Snippet
```java
    private int maximumIdsQueryCount = 5000;
    private int aggregateQueryBucketSize = 5000;
    private boolean pastEventsDisablePartitions = false;

    public void setDefinitionsService(DefinitionsService definitionsService) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `common/src/main/java/org/apache/unomi/common/DataTable.java`
#### Snippet
```java

    List<Row> rows = new ArrayList<>();
    int maxColumns = 0;

    public static final EmptyCell EMPTY_CELL = new EmptyCell();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `rest/src/main/java/org/apache/unomi/rest/models/RESTParameter.java`
#### Snippet
```java
    private String id;
    private String type;
    private boolean multivalued = false;
    private String defaultValue = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rest/src/main/java/org/apache/unomi/rest/models/RESTParameter.java`
#### Snippet
```java
    private String type;
    private boolean multivalued = false;
    private String defaultValue = null;

    public String getId() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rest/src/main/java/org/apache/unomi/rest/server/RestServer.java`
#### Snippet
```java
    // refresh
    private long timeOfLastUpdate = System.currentTimeMillis();
    private Timer refreshTimer = null;
    private long startupDelay = 1000L;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `rest/src/main/java/org/apache/unomi/utils/EventsRequestContext.java`
#### Snippet
```java
    private Session session;

    private boolean newSession = false;
    private HttpServletRequest request;
    private HttpServletResponse response;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `api/src/main/java/org/apache/unomi/api/PartialList.java`
#### Snippet
```java
    private long totalSize;
    private Relation totalSizeRelation;
    private String scrollIdentifier = null;
    private String scrollTimeValidity = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `api/src/main/java/org/apache/unomi/api/PartialList.java`
#### Snippet
```java
    private Relation totalSizeRelation;
    private String scrollIdentifier = null;
    private String scrollTimeValidity = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `api/src/main/java/org/apache/unomi/api/Session.java`
#### Snippet
```java
    private int size = 0;

    private int duration = 0;

    private List<String> originEventTypes = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `api/src/main/java/org/apache/unomi/api/Session.java`
#### Snippet
```java
    private Date lastEventDate;

    private int size = 0;

    private int duration = 0;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `api/src/main/java/org/apache/unomi/api/Metadata.java`
#### Snippet
```java
    private Set<String> systemTags = new LinkedHashSet<>();
    private boolean enabled = true;
    private boolean missingPlugins = false;
    private boolean hidden = false;
    private boolean readOnly = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `api/src/main/java/org/apache/unomi/api/Metadata.java`
#### Snippet
```java
    private boolean enabled = true;
    private boolean missingPlugins = false;
    private boolean hidden = false;
    private boolean readOnly = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `api/src/main/java/org/apache/unomi/api/Metadata.java`
#### Snippet
```java
    private boolean missingPlugins = false;
    private boolean hidden = false;
    private boolean readOnly = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `api/src/main/java/org/apache/unomi/api/Parameter.java`
#### Snippet
```java
    String id;
    String type;
    boolean multivalued = false;
    String defaultValue = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `api/src/main/java/org/apache/unomi/api/Parameter.java`
#### Snippet
```java
    String type;
    boolean multivalued = false;
    String defaultValue = null;

    public Parameter() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `api/src/main/java/org/apache/unomi/api/rules/RuleStatistics.java`
#### Snippet
```java
    private long executionCount = 0;
    private long localExecutionCount = 0;
    private long conditionsTime = 0;
    private long localConditionsTime = 0;
    private long actionsTime = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `api/src/main/java/org/apache/unomi/api/rules/RuleStatistics.java`
#### Snippet
```java

    private long executionCount = 0;
    private long localExecutionCount = 0;
    private long conditionsTime = 0;
    private long localConditionsTime = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `api/src/main/java/org/apache/unomi/api/rules/RuleStatistics.java`
#### Snippet
```java
    private long localConditionsTime = 0;
    private long actionsTime = 0;
    private long localActionsTime = 0;
    private Date lastSyncDate;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `api/src/main/java/org/apache/unomi/api/rules/RuleStatistics.java`
#### Snippet
```java
    private long conditionsTime = 0;
    private long localConditionsTime = 0;
    private long actionsTime = 0;
    private long localActionsTime = 0;
    private Date lastSyncDate;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `api/src/main/java/org/apache/unomi/api/rules/RuleStatistics.java`
#### Snippet
```java
    private long localExecutionCount = 0;
    private long conditionsTime = 0;
    private long localConditionsTime = 0;
    private long actionsTime = 0;
    private long localActionsTime = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `api/src/main/java/org/apache/unomi/api/rules/RuleStatistics.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private long executionCount = 0;
    private long localExecutionCount = 0;
    private long conditionsTime = 0;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `api/src/main/java/org/apache/unomi/api/rules/Rule.java`
#### Snippet
```java
    private List<String> linkedItems;

    private boolean raiseEventOnlyOnceForProfile = false;

    private boolean raiseEventOnlyOnceForSession = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `api/src/main/java/org/apache/unomi/api/rules/Rule.java`
#### Snippet
```java
    private boolean raiseEventOnlyOnceForProfile = false;

    private boolean raiseEventOnlyOnceForSession = false;

    private boolean raiseEventOnlyOnce = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `api/src/main/java/org/apache/unomi/api/rules/Rule.java`
#### Snippet
```java
    private boolean raiseEventOnlyOnceForSession = false;

    private boolean raiseEventOnlyOnce = false;

    private int priority;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `api/src/main/java/org/apache/unomi/api/Event.java`
#### Snippet
```java
    private String eventType;
    private String sessionId = null;
    private String profileId = null;
    private Date timeStamp;
    private Map<String, Object> properties;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `api/src/main/java/org/apache/unomi/api/Event.java`
#### Snippet
```java
    private static final long serialVersionUID = -1096874942838593575L;
    private String eventType;
    private String sessionId = null;
    private String profileId = null;
    private Date timeStamp;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `api/src/main/java/org/apache/unomi/api/campaigns/CampaignDetail.java`
#### Snippet
```java
    private long campaignSessionViews = 0;
    private long campaignSessionSuccess = 0;
    private long numberOfGoals = 0;
    private double conversionRate;
    private Campaign campaign;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `api/src/main/java/org/apache/unomi/api/campaigns/CampaignDetail.java`
#### Snippet
```java
 */
public class CampaignDetail {
    private long engagedProfiles = 0;
    private long campaignSessionViews = 0;
    private long campaignSessionSuccess = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `api/src/main/java/org/apache/unomi/api/campaigns/CampaignDetail.java`
#### Snippet
```java
public class CampaignDetail {
    private long engagedProfiles = 0;
    private long campaignSessionViews = 0;
    private long campaignSessionSuccess = 0;
    private long numberOfGoals = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `api/src/main/java/org/apache/unomi/api/campaigns/CampaignDetail.java`
#### Snippet
```java
    private long engagedProfiles = 0;
    private long campaignSessionViews = 0;
    private long campaignSessionSuccess = 0;
    private long numberOfGoals = 0;
    private double conversionRate;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugins/kafka-injector/src/main/java/org/apache/unomi/kafka/KafkaInjector.java`
#### Snippet
```java
    private String topic;
    private String messageType;
    private boolean consuming = false;
    private ObjectMapper objectMapper;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `scripting/src/main/java/org/apache/unomi/scripting/internal/ExpressionFilterFactoryImpl.java`
#### Snippet
```java
    private final Map<String,Set<Pattern>> forbiddenExpressionPatternsByCollection = new HashMap<>();

    private BundleContext bundleContext = null;
    private final ObjectMapper objectMapper = new ObjectMapper();

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `scripting/src/main/java/org/apache/unomi/scripting/SecureFilteringClassLoader.java`
#### Snippet
```java

    private static Set<String> defaultAllowedClasses = null;
    private static Set<String> defaultForbiddenClasses = null;

    static {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `scripting/src/main/java/org/apache/unomi/scripting/SecureFilteringClassLoader.java`
#### Snippet
```java

    private Set<String> allowedClasses = null;
    private Set<String> forbiddenClasses = null;

    private static Set<String> defaultAllowedClasses = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `scripting/src/main/java/org/apache/unomi/scripting/SecureFilteringClassLoader.java`
#### Snippet
```java
    private Set<String> forbiddenClasses = null;

    private static Set<String> defaultAllowedClasses = null;
    private static Set<String> defaultForbiddenClasses = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `scripting/src/main/java/org/apache/unomi/scripting/SecureFilteringClassLoader.java`
#### Snippet
```java
public class SecureFilteringClassLoader extends ClassLoader {

    private Set<String> allowedClasses = null;
    private Set<String> forbiddenClasses = null;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `wab/src/main/java/org/apache/unomi/web/ContextServlet.java`
#### Snippet
```java
    private String profileIdCookieDomain;
    private int profileIdCookieMaxAgeInSeconds = MAX_COOKIE_AGE_IN_SECONDS;
    private boolean profileIdCookieHttpOnly = false;
    private int publicPostRequestBytesLimit = 200000;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
    private static final String ROLLOVER_LIFECYCLE_NAME = "unomi-rollover-policy";

    private boolean throwExceptions = false;
    private RestHighLevelClient client;
    private BulkProcessor bulkProcessor;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
    private String logLevelRestClient = "ERROR";
    private boolean alwaysOverwrite = true;
    private boolean aggQueryThrowOnMissingDocs = false;
    private Integer aggQueryMaxResponseSizeHttp = null;
    private Integer clientSocketTimeout = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
    private boolean aggQueryThrowOnMissingDocs = false;
    private Integer aggQueryMaxResponseSizeHttp = null;
    private Integer clientSocketTimeout = null;
    private Map<String, WriteRequest.RefreshPolicy> itemTypeToRefreshPolicy = new HashMap<>();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
    private String password;
    private boolean sslEnable = false;
    private boolean sslTrustAllCertificates = false;

    private int aggregateQueryBucketSize = 5000;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
    private String username;
    private String password;
    private boolean sslEnable = false;
    private boolean sslTrustAllCertificates = false;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
    private boolean alwaysOverwrite = true;
    private boolean aggQueryThrowOnMissingDocs = false;
    private Integer aggQueryMaxResponseSizeHttp = null;
    private Integer clientSocketTimeout = null;
    private Map<String, WriteRequest.RefreshPolicy> itemTypeToRefreshPolicy = new HashMap<>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java

    private MetricsService metricsService;
    private boolean useBatchingForSave = false;
    private boolean useBatchingForUpdate = true;
    private String logLevelRestClient = "ERROR";
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `CDPPropertyInterface`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPFloatPropertyType.java`
#### Snippet
```java

@GraphQLName(TYPE_NAME)
public class CDPFloatPropertyType extends CDPPropertyType implements CDPPropertyInterface {

    public static final String TYPE_NAME = "CDP_FloatProperty";
```

### RedundantImplements
Redundant interface declaration `CDPPropertyInterface`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPGeoPointPropertyType.java`
#### Snippet
```java

@GraphQLName(TYPE_NAME)
public class CDPGeoPointPropertyType extends CDPPropertyType implements CDPPropertyInterface {

    public static final String TYPE_NAME = "CDP_GeoPointProperty";
```

### RedundantImplements
Redundant interface declaration `CDPPropertyInterface`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPJsonPropertyType.java`
#### Snippet
```java

@GraphQLName(TYPE_NAME)
public class CDPJsonPropertyType extends CDPPropertyType implements CDPPropertyInterface {

    public static final String TYPE_NAME = "CDP_JsonProperty";
```

### RedundantImplements
Redundant interface declaration `CDPPropertyInterface`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPLongPropertyType.java`
#### Snippet
```java

@GraphQLName(TYPE_NAME)
public class CDPLongPropertyType extends CDPPropertyType implements CDPPropertyInterface {

    public static final String TYPE_NAME = "CDP_LongProperty";
```

### RedundantImplements
Redundant interface declaration `CDPPropertyInterface`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPStringPropertyType.java`
#### Snippet
```java

@GraphQLName(TYPE_NAME)
public class CDPStringPropertyType extends CDPPropertyType implements CDPPropertyInterface {

    public static final String TYPE_NAME = "CDP_StringProperty";
```

### RedundantImplements
Redundant interface declaration `CDPPropertyInterface`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPSetPropertyType.java`
#### Snippet
```java

@GraphQLName(TYPE_NAME)
public class CDPSetPropertyType extends CDPPropertyType implements CDPPropertyInterface {

    public static final String TYPE_NAME = "CDP_SetProperty";
```

### RedundantImplements
Redundant interface declaration `CDPPropertyInterface`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPIntPropertyType.java`
#### Snippet
```java

@GraphQLName(TYPE_NAME)
public class CDPIntPropertyType extends CDPPropertyType implements CDPPropertyInterface {

    public static final String TYPE_NAME = "CDP_IntProperty";
```

### RedundantImplements
Redundant interface declaration `CDPPropertyInterface`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPBooleanPropertyType.java`
#### Snippet
```java

@GraphQLName(TYPE_NAME)
public class CDPBooleanPropertyType extends CDPPropertyType implements CDPPropertyInterface {

    public static final String TYPE_NAME = "CDP_BooleanProperty";
```

### RedundantImplements
Redundant interface declaration `CDPPropertyInterface`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPDatePropertyType.java`
#### Snippet
```java

@GraphQLName(TYPE_NAME)
public class CDPDatePropertyType extends CDPPropertyType implements CDPPropertyInterface {

    public static final String TYPE_NAME = "CDP_DateProperty";
```

### RedundantImplements
Redundant interface declaration `CDPPropertyInterface`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPIdentifierPropertyType.java`
#### Snippet
```java

@GraphQLName(TYPE_NAME)
public class CDPIdentifierPropertyType extends CDPPropertyType implements CDPPropertyInterface {

    public static final String TYPE_NAME = "CDP_IdentifierProperty";
```

### RedundantImplements
Redundant interface declaration `Bus`
in `rest/src/main/java/org/apache/unomi/rest/server/RestServerBus.java`
#### Snippet
```java
 */
@Component(service = Bus.class)
public class RestServerBus extends ExtensionManagerBus implements Bus {
    public RestServerBus() {
        this.getFeatures().add(new LoggingFeature());
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-17-15-36-54.228.html`
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
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java
                actualValue = null;
            } catch (Exception e) {
                if (!(e instanceof OgnlException)
                        || (!StringUtils.startsWith(e.getMessage(),
                        "source is null for getProperty(null"))) {
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer sb` may be declared as 'StringBuilder'
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
```

### StringBufferReplaceableByStringBuilder
`StringBuffer sb` may be declared as 'StringBuilder'
in `plugins/request/src/main/java/org/apache/unomi/plugins/request/useragent/UserAgent.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("User-Agent { \n");
        sb.append("agent.name: " + this.getUserAgentName() + ",\n");
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

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
    private void displayLogsForInactiveServices() {
        requiredServicesFilters.forEach(requiredServicesFilter -> {
            ServiceReference[] serviceReference = new ServiceReference[0];
            String filterToString = requiredServicesFilter.toString();
            try {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/IdsConditionESQueryBuilder.java`
#### Snippet
```java
        }

        IdsQueryBuilder idsQueryBuilder = QueryBuilders.idsQuery().addIds(ids.toArray(new String[0]));
        if (match) {
            return idsQueryBuilder;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `extensions/privacy-extension/services/src/main/java/org/apache/unomi/privacy/internal/PrivacyServiceImpl.java`
#### Snippet
```java
            session.setProfile(newProfile);
            persistenceService.save(session);
            List<Event> events = eventService.searchEvents(session.getItemId(), new String[0], null, 0, -1, null).getList();
            for (Event event : events) {
                persistenceService.update(event, Event.class, "profileId", newProfile.getItemId());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ClientEndpoint.java`
#### Snippet
```java
                values.add(value.toString().trim().replace("\n", ""));
            }
            csvWriter.writeNext(keySet.toArray(new String[0]));
            csvWriter.writeNext(values.toArray(new String[0]));
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ClientEndpoint.java`
#### Snippet
```java
            }
            csvWriter.writeNext(keySet.toArray(new String[0]));
            csvWriter.writeNext(values.toArray(new String[0]));
        }
        Response.ResponseBuilder responseBuilder = Response.ok(writer.toString());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/LineSplitProcessor.java`
#### Snippet
```java
                                        properties.put(fieldMappingKey, new String[]{multivalueArray});
                                    } else {
                                        properties.put(fieldMappingKey, new String[]{});
                                    }
                                }
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `rest/src/main/java/org/apache/unomi/rest/validation/request/RequestValidatorInterceptor.java`
#### Snippet
```java
    private final ConfigSharingService configSharingService;

    private static final List<String> PROTECTED_URIS = new ArrayList<String>(){{
        add("/cxs/eventcollector");
        add("/cxs/context.js");
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `values.toArray(new String[values.size()])`, unclear if a varargs or non-varargs call is desired
in `common/src/main/java/org/apache/unomi/common/DataTable.java`
#### Snippet
```java
                    values.add(row.getData(i).toString());
                }
                printer.printRecord(values.toArray(new String[values.size()]));
            }
            printer.close();
```

## RuleId[id=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'List\>' type conflicts with preceding 'instanceof Collection' check
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
                            // TODO UNOMI-719: move this in a dedicated extension point to handle this kind of merge strategy in a more generic way
                            List<Map<String, Object>> sourceStatuses = (List<Map<String, Object>>) sourceProperty.getValue();
                            List<Map<String, Object>> targetStatuses = (List<Map<String, Object>>) targetProperty;

                            for (Map<String, Object> sourceStatus : sourceStatuses) {
```

## RuleId[id=TypeParameterExtendsObject]
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
        ObjectCodec codec = jp.getCodec();
        TreeNode treeNode = codec.readTree(jp);
        Class<? extends Object> objectClass = null;
        if (treeNode instanceof ObjectNode) {
            ObjectNode root = (ObjectNode) treeNode;
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
Variable `forbiddenClasses` initializer `null` is redundant
in `scripting/src/main/java/org/apache/unomi/scripting/SecureFilteringClassLoader.java`
#### Snippet
```java

    private Set<String> allowedClasses = null;
    private Set<String> forbiddenClasses = null;

    private static Set<String> defaultAllowedClasses = null;
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
        // first we must check if an existing lead exists for the profile.

        String baseUrl = null;
        try {
            baseUrl = sfdcSession.getEndPoint() + REST_ENDPOINT_URI + "/query?q=" + URLEncoder.encode(query, "UTF-8");
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
Condition `isProfileOrPersonaUpdated` at the left side of assignment expression is always `false`. Can be simplified
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/UpdatePropertiesAction.java`
#### Snippet
```java

        if (propsToAdd != null) {
            isProfileOrPersonaUpdated |= processProperties(target, propsToAdd, "setIfMissing");
        }

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
Value `anonymousSessionProfile` is always 'false'
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
Value `requireAnonymousBrowsing` is always 'false'
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
Value `requireAnonymousBrowsing` is always 'false'
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
Value `anonymousSessionProfile` is always 'false'
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
                sobjectDescribe = new LinkedHashMap<>(queryResponse);
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

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `getObjectMapper()` tries to override a static method of a superclass
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ESCustomObjectMapper.java`
#### Snippet
```java
    }

    public static ObjectMapper getObjectMapper() {
        return ESCustomObjectMapper.Holder.INSTANCE;
    }
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

## RuleId[id=IOResource]
### IOResource
'CSVWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ClientEndpoint.java`
#### Snippet
```java
        StringWriter writer = new StringWriter();
        //using custom delimiter and quote character
        CSVWriter csvWriter = new CSVWriter(writer);
        if (vertical) {
            csvWriter.writeNext(new String[] { "name", "value" });
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
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/internal/MailChimpServiceImpl.java`
#### Snippet
```java
        if (StringUtils.isNotBlank(listMergeFields)) {
            String mergeFields[] = StringUtils.split(listMergeFields, SEPARATOR_CHARS_PROPERTIES);
            if (mergeFields.length > 0) {
                for (String mergeField : mergeFields) {
                    if (StringUtils.isNotBlank(mergeField)) {
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

## RuleId[id=Java8MapForEach]
### Java8MapForEach
Can be replaced with 'Map.forEach()'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/json/JSONObjectType.java`
#### Snippet
```java
        Map<String, Object> propertiesTree = (Map<String, Object>) schemaTree.get("properties");
        if (propertiesTree != null) {
            propertiesTree.entrySet().forEach(entry -> {
                if (entry.getValue() instanceof Map) {
                    properties.put(entry.getKey(), jsonTypeFactory.getTypes((Map<String, Object>) entry.getValue()));
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `RouterUtils` has only 'static' members, and lacks a 'private' constructor
in `extensions/router/router-api/src/main/java/org/apache/unomi/router/api/RouterUtils.java`
#### Snippet
```java
 * Created by amidani on 30/06/2017.
 */
public class RouterUtils {

    public static ImportExportConfiguration addExecutionEntry(ImportExportConfiguration configuration, Map execution, int executionsHistorySize) {
```

### UtilityClassWithoutPrivateConstructor
Class `ConditionContextHelper` has only 'static' members, and lacks a 'private' constructor
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/conditions/ConditionContextHelper.java`
#### Snippet
```java
import java.util.*;

public class ConditionContextHelper {
    private static final Logger logger = LoggerFactory.getLogger(ConditionContextHelper.class);

```

### UtilityClassWithoutPrivateConstructor
Class `RootMutation` has only 'static' members, and lacks a 'private' constructor
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/RootMutation.java`
#### Snippet
```java

@GraphQLName(TYPE_NAME)
public class RootMutation {

    public static final String TYPE_NAME = "Mutation";
```

### UtilityClassWithoutPrivateConstructor
Class `RootQuery` has only 'static' members, and lacks a 'private' constructor
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/RootQuery.java`
#### Snippet
```java

@GraphQLName(TYPE_NAME)
public class RootQuery {

    public static final String TYPE_NAME = "Query";
```

### UtilityClassWithoutPrivateConstructor
Class `StringUtils` has only 'static' members, and lacks a 'private' constructor
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/utils/StringUtils.java`
#### Snippet
```java
import java.util.stream.Stream;

public class StringUtils {
    public StringUtils() {
    }
```

### UtilityClassWithoutPrivateConstructor
Class `ComparisonConditionTranslator` has only 'static' members, and lacks a 'private' constructor
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/ComparisonConditionTranslator.java`
#### Snippet
```java
package org.apache.unomi.graphql.schema;

public class ComparisonConditionTranslator {

    public static String translateFromGraphQLToUnomi(final String originalCondition) {
```

### UtilityClassWithoutPrivateConstructor
Class `PropertyNameTranslator` has only 'static' members, and lacks a 'private' constructor
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/PropertyNameTranslator.java`
#### Snippet
```java
package org.apache.unomi.graphql.schema;

public class PropertyNameTranslator {

    public static String translateFromUnomiToGraphQL(final String propertyName) {
```

### UtilityClassWithoutPrivateConstructor
Class `ReflectionUtil` has only 'static' members, and lacks a 'private' constructor
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/utils/ReflectionUtil.java`
#### Snippet
```java
import java.util.List;

public class ReflectionUtil {

    private static final String UNOMI_TYPE_FIELD = "UNOMI_TYPE";
```

### UtilityClassWithoutPrivateConstructor
Class `PropertyValueTypeHelper` has only 'static' members, and lacks a 'private' constructor
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/PropertyValueTypeHelper.java`
#### Snippet
```java
import org.apache.unomi.graphql.scalars.DateTimeFunction;

public class PropertyValueTypeHelper {

    public static String getPropertyValueParameter(
```

### UtilityClassWithoutPrivateConstructor
Class `PropertyFilterUtils` has only 'static' members, and lacks a 'private' constructor
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/PropertyFilterUtils.java`
#### Snippet
```java
import java.util.List;

public class PropertyFilterUtils {

    public static List<GraphQLInputObjectField> buildInputPropertyFilters(final Collection<GraphQLSchemaProvider.DefinitionType> propertyTypes, final GraphQLAnnotations graphQLAnnotations) {
```

### UtilityClassWithoutPrivateConstructor
Class `HttpUtils` has only 'static' members, and lacks a 'private' constructor
in `rest/src/main/java/org/apache/unomi/utils/HttpUtils.java`
#### Snippet
```java
 * This is duplicate of the class from the wab bundle, the original file will be removed once endpoints forwarded
 */
public class HttpUtils {

    private static final int MAX_COOKIE_AGE_IN_SECONDS = 60 * 60 * 24 * 365; // 1 year
```

### UtilityClassWithoutPrivateConstructor
Class `PropertyHelper` has only 'static' members, and lacks a 'private' constructor
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyHelper.java`
#### Snippet
```java
 * Helper method for properties
 */
public class PropertyHelper {

    private static final Logger logger = LoggerFactory.getLogger(PropertyHelper.class.getName());
```

### UtilityClassWithoutPrivateConstructor
Class `ValidationPattern` has only 'static' members, and lacks a 'private' constructor
in `api/src/main/java/org/apache/unomi/api/utils/ValidationPattern.java`
#### Snippet
```java
package org.apache.unomi.api.utils;

public class ValidationPattern {

    public static final String TEXT_VALID_CHARACTERS_PATTERN = "^(\\w|[-_@\\.]){0,60}$";
```

### UtilityClassWithoutPrivateConstructor
Class `HttpUtils` has only 'static' members, and lacks a 'private' constructor
in `wab/src/main/java/org/apache/unomi/web/HttpUtils.java`
#### Snippet
```java
import java.io.IOException;

public class HttpUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ParserHelper` has only 'static' members, and lacks a 'private' constructor
in `api/src/main/java/org/apache/unomi/api/utils/ParserHelper.java`
#### Snippet
```java
 * Helper class to resolve condition, action and values types when loading definitions from JSON files
 */
public class ParserHelper {

    private static final Logger logger = LoggerFactory.getLogger(ParserHelper.class);
```

### UtilityClassWithoutPrivateConstructor
Class `HttpUtils` has only 'static' members, and lacks a 'private' constructor
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/HttpUtils.java`
#### Snippet
```java
 * Created by dsalhotra on 27/06/2017.
 */
public class HttpUtils {

    private static Logger logger = LoggerFactory.getLogger(HttpUtils.class);
```

## RuleId[id=UnnecessarySemicolon]
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
in `api/src/main/java/org/apache/unomi/api/services/ConfigSharingService.java`
#### Snippet
```java

    class ConfigChangeEvent {
        public enum ConfigChangeEventType { ADDED, UPDATED, REMOVED };
        private ConfigChangeEventType eventType;
        private String name;
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
Variable is already assigned to this value
in `extensions/router/router-service/src/main/java/org/apache/unomi/router/services/ProfileExportServiceImpl.java`
#### Snippet
```java
        execution.put(RouterConstants.KEY_EXECS_EXTRACTED, profileList.size());

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

### DataFlowIssue
Variable is already assigned to this value
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/ExportRouteCompletionProcessor.java`
#### Snippet
```java
        ExportConfiguration exportConfiguration = exportConfigurationService.load(exportConfig.getItemId());

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
Deprecated member 'updateWithScript' is still used
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PersistenceService.java`
#### Snippet
```java
     */
    @Deprecated
    boolean updateWithScript(Item item, Date dateHint, Class<?> clazz, String script, Map<String, Object> scriptParams);

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

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
            }
        });
        propsToRemove.forEach(propId -> profileProperties.remove(propId));
        return profileProperties;
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
    public void setFatalIllegalStateErrors(String fatalIllegalStateErrors) {
        this.fatalIllegalStateErrors = Arrays.stream(fatalIllegalStateErrors.split(","))
                .map(i -> i.trim()).filter(i -> !i.isEmpty()).toArray(String[]::new);
    }

```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'serviceManager' in a Serializable class
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/GraphQLServlet.java`
#### Snippet
```java
    private GraphQLSchemaUpdater graphQLSchemaUpdater;

    private ServiceManager serviceManager;

    private GraphQLServletSecurityValidator validator;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'graphQLSchemaUpdater' in a Serializable class
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/GraphQLServlet.java`
#### Snippet
```java
    public static final String SCHEMA_URL = "/schema.json";

    private GraphQLSchemaUpdater graphQLSchemaUpdater;

    private ServiceManager serviceManager;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'validator' in a Serializable class
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/GraphQLServlet.java`
#### Snippet
```java
    private ServiceManager serviceManager;

    private GraphQLServletSecurityValidator validator;

    @Reference
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'configuration' in a Serializable class
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/event/UpdateCamelRouteEvent.java`
#### Snippet
```java
public class UpdateCamelRouteEvent extends Event {
    private String routeId;
    private Object configuration;

    public UpdateCamelRouteEvent(String id) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'data' in a Serializable class
in `api/src/main/java/org/apache/unomi/api/Patch.java`
#### Snippet
```java
    private String operation;

    private Object data;

    private Date lastApplication;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'valueType' in a Serializable class
in `api/src/main/java/org/apache/unomi/api/PropertyType.java`
#### Snippet
```java
    private String target;
    private String valueTypeId;
    private ValueType valueType;
    private String defaultValue;
    private List<DateRange> dateRanges = new ArrayList<>();
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'to' in a Serializable class
in `api/src/main/java/org/apache/unomi/api/query/DateRange.java`
#### Snippet
```java
    private String key;
    private Object from;
    private Object to;

    public DateRange() {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'from' in a Serializable class
in `api/src/main/java/org/apache/unomi/api/query/DateRange.java`
#### Snippet
```java
public class DateRange implements Serializable {
    private String key;
    private Object from;
    private Object to;

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

## RuleId[id=MismatchedJavadocCode]
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
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/DeleteProfilePropertiesCommand.java`
#### Snippet
```java

        if (!incorrectPropertyNames.isEmpty()) {
            throw new IllegalArgumentException(String.format("The properties \"%s\" do not belong to profile", incorrectPropertyNames.toString()));
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java
                logger.warn("unable to parse date. See debug log level for full stacktrace");
                if (logger.isDebugEnabled()) {
                    logger.debug("unable to parse date {}", value.toString(), e);
                }
            }
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

## RuleId[id=InnerClassMayBeStatic]
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
Inner class `ConditionDecorator` may be 'static'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentConditionParser.java`
#### Snippet
```java
    }

    private class ConditionDecorator {

        private String id;
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
Inner class `ClassLoaderClassResolver` may be 'static'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java
    }

    private class ClassLoaderClassResolver extends DefaultClassResolver {
        private ClassLoader classLoader;

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

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/HardcodedPropertyAccessorRegistry.java`
#### Snippet
```java
            nextTokens.propertyName = expression.substring(lookupNameBeginPos, lookupNameEndPos);
            nextTokens.leftoverExpression = expression.substring(leftoverStartPos);
            if ("".equals(nextTokens.leftoverExpression)) {
                nextTokens.leftoverExpression = null;
            }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/HardcodedPropertyAccessorRegistry.java`
#### Snippet
```java
            return object;
        }
        if (expression.trim().equals("")) {
            return object;
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `plugins/request/src/main/java/org/apache/unomi/plugins/request/actions/SetRemoteHostInfoAction.java`
#### Snippet
```java
        if (remoteAddrParameter != null && remoteAddrParameter.length() > 0) {
            remoteAddr = remoteAddrParameter;
        } else if (xff != null && !xff.equals("")) {
            if (xff.indexOf(',') > -1) {
                xff = xff.substring(0, xff.indexOf(','));
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `extensions/groovy-actions/services/src/main/java/org/apache/unomi/groovy/actions/services/impl/GroovyActionsServiceImpl.java`
#### Snippet
```java
     */
    private void saveActionType(Action action) {
        Metadata metadata = new Metadata(null, action.id(), action.name().equals("") ? action.id() : action.name(), action.description());
        metadata.setHidden(action.hidden());
        metadata.setReadOnly(true);
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/actions/CopyPropertiesAction.java`
#### Snippet
```java

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public int execute(Action action, Event event) {
        boolean atLeastOnechanged = false;
        List<String> mandatoryPropTypeSystemTags = (List<String>) action.getParameterValues().get("mandatoryPropTypeSystemTag");
```

## RuleId[id=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `StringUtils` has only 'static' members, and a 'public' constructor
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/utils/StringUtils.java`
#### Snippet
```java
import java.util.stream.Stream;

public class StringUtils {
    public StringUtils() {
    }
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `services/src/main/java/org/apache/unomi/services/mergers/AddPropertyMergeStrategyExecutor.java`
#### Snippet
```java
            if (propertyType.getValueTypeId() != null) {
                if (propertyType.getValueTypeId().equals("integer")) {
                    result = new Integer(0);
                } else if (propertyType.getValueTypeId().equals("long")) {
                    result = new Long(0);
```

### UnnecessaryBoxing
Unnecessary boxing
in `services/src/main/java/org/apache/unomi/services/mergers/AddPropertyMergeStrategyExecutor.java`
#### Snippet
```java
                    result = new Integer(0);
                } else if (propertyType.getValueTypeId().equals("long")) {
                    result = new Long(0);
                } else if (propertyType.getValueTypeId().equals("double")) {
                    result = new Double(0.0);
```

### UnnecessaryBoxing
Unnecessary boxing
in `services/src/main/java/org/apache/unomi/services/mergers/AddPropertyMergeStrategyExecutor.java`
#### Snippet
```java
                    result = new Long(0);
                } else if (propertyType.getValueTypeId().equals("double")) {
                    result = new Double(0.0);
                } else if (propertyType.getValueTypeId().equals("float")) {
                    result = new Float(0.0);
```

### UnnecessaryBoxing
Unnecessary boxing
in `services/src/main/java/org/apache/unomi/services/mergers/AddPropertyMergeStrategyExecutor.java`
#### Snippet
```java
                    result = new Double(0.0);
                } else if (propertyType.getValueTypeId().equals("float")) {
                    result = new Float(0.0);
                } else {
                    result = new Long(0);
```

### UnnecessaryBoxing
Unnecessary boxing
in `services/src/main/java/org/apache/unomi/services/mergers/AddPropertyMergeStrategyExecutor.java`
#### Snippet
```java
                    result = new Float(0.0);
                } else {
                    result = new Long(0);
                }
            } else {
```

### UnnecessaryBoxing
Unnecessary boxing
in `services/src/main/java/org/apache/unomi/services/mergers/AddPropertyMergeStrategyExecutor.java`
#### Snippet
```java
                }
            } else {
                result = new Long(0);
            }
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/processor/LineSplitFailureHandler.java`
#### Snippet
```java
        importLineError.setLineContent(exchange.getIn().getBody(String.class));
        importLineError.setLineNb(((Integer) exchange.getProperty("CamelSplitIndex") + 1));
        exchange.getIn().setHeader(RouterConstants.HEADER_FAILED_MESSAGE, new Boolean(true));
        exchange.getIn().setBody(importLineError, ImportLineError.class);
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyHelper.java`
#### Snippet
```java
        } else if (setPropertyValueBoolean instanceof Number) {
            if (((Number) setPropertyValueBoolean).intValue() >= 1) {
                return new Boolean(true);
            } else {
                return new Boolean(false);
```

### UnnecessaryBoxing
Unnecessary boxing
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyHelper.java`
#### Snippet
```java
                return new Boolean(true);
            } else {
                return new Boolean(false);
            }
        } else {
```

### UnnecessaryBoxing
Unnecessary boxing
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyHelper.java`
#### Snippet
```java
            if (((String) setPropertyValueBoolean).equalsIgnoreCase("true") || ((String) setPropertyValueBoolean).equalsIgnoreCase("on") ||
                    ((String) setPropertyValueBoolean).equalsIgnoreCase("yes") || ((String) setPropertyValueBoolean).equalsIgnoreCase("1")) {
                return new Boolean(true);
            } else {
                return new Boolean(false);
```

### UnnecessaryBoxing
Unnecessary boxing
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyHelper.java`
#### Snippet
```java
                return new Boolean(true);
            } else {
                return new Boolean(false);
            }
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

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `extensions/unomi-mailchimp/rest/src/main/java/org/apache/unomi/mailchimp/rest/MailChimpEndPoint.java`
#### Snippet
```java

    public MailChimpEndPoint() {
        System.out.println("Initializing MailChimpEndPoint service endpoint...");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `metrics/src/main/java/org/apache/unomi/metrics/commands/DeactivateCommand.java`
#### Snippet
```java
    protected Object doExecute() throws Exception {
        metricsService.setActivated(false);
        System.out.println("Metrics de-activated successfully.");
        return null;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `metrics/src/main/java/org/apache/unomi/metrics/commands/ResetCommand.java`
#### Snippet
```java
    protected Object doExecute() throws Exception {
        metricsService.resetMetrics();
        System.out.println("Metrics reset successfully.");
        return null;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `metrics/src/main/java/org/apache/unomi/metrics/commands/ActivateCommand.java`
#### Snippet
```java
    protected Object doExecute() throws Exception {
        metricsService.setActivated(true);
        System.out.println("Metrics activated successfully.");
        return null;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `metrics/src/main/java/org/apache/unomi/metrics/commands/ViewCommand.java`
#### Snippet
```java
        Metric metric = metricsService.getMetrics().get(metricName);
        if (metric == null) {
            System.out.println("Couldn't find a metric with name=" + metricName);
            return null;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `metrics/src/main/java/org/apache/unomi/metrics/commands/ViewCommand.java`
#### Snippet
```java
        defaultPrettyPrinter = defaultPrettyPrinter.withArrayIndenter(DefaultIndenter.SYSTEM_LINEFEED_INSTANCE);
        String jsonMetric = CustomObjectMapper.getObjectMapper().writer(defaultPrettyPrinter).writeValueAsString(metric);
        System.out.println(jsonMetric);
        return null;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `metrics/src/main/java/org/apache/unomi/metrics/commands/CallerStatusCommand.java`
#### Snippet
```java
        if (metricName != null && metricStatus != null) {
            metricsService.setCallerActivated(metricName, metricStatus);
            System.out.println("Metric callers " + metricName + " set to " + metricStatus);
            return null;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `metrics/src/main/java/org/apache/unomi/metrics/commands/CallerStatusCommand.java`
#### Snippet
```java
        }

        shellTable.print(System.out, !noFormat);
        return null;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `metrics/src/main/java/org/apache/unomi/metrics/commands/ListCommand.java`
#### Snippet
```java
    protected Object doExecute() throws Exception {

        System.out.println("Metrics service status: " + (metricsService.isActivated() ? "active" : "inactive"));

        Map<String,Metric> metrics = metricsService.getMetrics();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `metrics/src/main/java/org/apache/unomi/metrics/commands/ListCommand.java`
#### Snippet
```java

        if (csv) {
            System.out.println(dataTable.toCSV(headers));
            return null;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `metrics/src/main/java/org/apache/unomi/metrics/commands/ListCommand.java`
#### Snippet
```java
            row.addContent(rowData);
        }
        shellTable.print(System.out);
        return null;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
            List<String> logoLines = serverInfos.get(serverInfos.size() - 1).getLogoLines();
            if (logoLines != null && !logoLines.isEmpty()) {
                logoLines.forEach(System.out::println);
            }
            System.out.println("--------------------------------------------------------------------------------------------");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
                logoLines.forEach(System.out::println);
            }
            System.out.println("--------------------------------------------------------------------------------------------");
            serverInfos.forEach(serverInfo -> {
                String versionMessage = MessageFormat.format(" {0} {1} ({2,date,yyyy-MM-dd HH:mm:ssZ} // {3} // {4} // {5}) ",
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
                        serverInfo.getServerBuildDate(), serverInfo.getServerTimestamp(), serverInfo.getServerScmBranch(),
                        serverInfo.getServerBuildNumber());
                System.out.println(versionMessage);
                logger.info(versionMessage);
            });
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
                logger.info(versionMessage);
            });
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.println("Server successfully started " + requiredBundles.size() + " bundles and " + requiredServicesFilters.size()
                    + " required " + "services in " + totalStartupTime + " ms");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
            });
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.println("Server successfully started " + requiredBundles.size() + " bundles and " + requiredServicesFilters.size()
                    + " required " + "services in " + totalStartupTime + " ms");
            logger.info("Server successfully started {} bundles and {} required services in {} ms", requiredBundles.size(),
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
                long featureStartupTime = System.currentTimeMillis();
                if (!featuresService.isInstalled(featuresService.getFeature(value))) {
                    System.out.println("Installing feature " + value);
                    featuresService.installFeature(value, EnumSet.of(FeaturesService.Option.NoAutoRefreshManagedBundles,
                            FeaturesService.Option.NoAutoRefreshUnmanagedBundles, FeaturesService.Option.NoAutoRefreshBundles));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
        bundleContext.addServiceListener(this);
        startupTime = System.currentTimeMillis();
        System.out.println("Initializing Unomi...");
        logger.info("Bundle watcher initialized.");
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
                matchedRequiredServicesCount--;
                if (!shutdownMessageAlreadyDisplayed) {
                    System.out.println("Apache Unomi shutting down...");
                    logger.info("Apache Unomi no longer available, as required service {} is shutdown !", serviceReference);
                    shutdownMessageAlreadyDisplayed = true;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/json/JSONTypeFactory.java`
#### Snippet
```java
                schemaTree = GraphQLSchemaProvider.buildJSONSchema(refSchema, schemaService).getSchemaTree();
            } else {
                System.err.println("Couldn't find schema for ref " + schemaId);
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `extensions/salesforce-connector/rest/src/main/java/org/apache/unomi/sfdc/rest/SFDCEndPoint.java`
#### Snippet
```java

    public SFDCEndPoint() {
        System.out.println("Initializing SFDC service endpoint...");
    }

```

## RuleId[id=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `api/src/main/java/org/apache/unomi/api/services/EventService.java`
#### Snippet
```java
     * @deprecated use event types instead
     */
    List<EventProperty> getEventProperties();

    /**
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

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/PropertyNameTranslator.java`
#### Snippet
```java

    public static String translateFromUnomiToGraphQL(final String propertyName) {
        return propertyName.replaceAll(":", "__COLON__").replaceAll("-", "__DASH__");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/PropertyNameTranslator.java`
#### Snippet
```java

    public static String translateFromUnomiToGraphQL(final String propertyName) {
        return propertyName.replaceAll(":", "__COLON__").replaceAll("-", "__DASH__");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/PropertyNameTranslator.java`
#### Snippet
```java

    public static String translateFromGraphQLToUnomi(final String propertyName) {
        return propertyName.replaceAll("__DASH__", "-").replaceAll("__COLON__", ":");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/PropertyNameTranslator.java`
#### Snippet
```java

    public static String translateFromGraphQLToUnomi(final String propertyName) {
        return propertyName.replaceAll("__DASH__", "-").replaceAll("__COLON__", ":");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
    private String csvEncode(String input) {
        if (StringUtils.containsAny(input, '\n', '"', ',')) {
            return "\"" + input.replace("\"", "\"\"") + "\"";
        }
        return input;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentProfileInterestsConditionParser.java`
#### Snippet
```java
        }

        tuple.put("topic_equals", condition.getParameter("propertyName").toString().replaceAll("properties.interests.", ""));

        return tuple;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentProfileConsentsConditionParser.java`
#### Snippet
```java
                .map(condition ->
                        condition.getParameter("propertyName").toString()
                                .replaceAll("consents.", "")
                                .replaceAll(".status", "")
                ).collect(Collectors.toList());
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentProfileConsentsConditionParser.java`
#### Snippet
```java
                        condition.getParameter("propertyName").toString()
                                .replaceAll("consents.", "")
                                .replaceAll(".status", "")
                ).collect(Collectors.toList());
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentProfilePropertiesConditionParser.java`
#### Snippet
```java

    private Map<String, Object> createProfilePropertiesField(final Condition condition) {
        final String propertyName = condition.getParameter("propertyName").toString().replaceAll("properties.", "");

        return createProfilePropertiesField(propertyName, condition);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentProfilePropertiesConditionParser.java`
#### Snippet
```java

    private boolean isSimpleCondition(final Condition condition) {
        final String propertyName = condition.getParameter("propertyName").toString().replaceAll("properties.", "");

        return profilePropertiesAsMap.containsKey(propertyName);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentProfilePropertiesConditionParser.java`
#### Snippet
```java

        conditions.forEach(condition -> {
            final String propertyName = condition.getParameter("propertyName").toString().replaceAll("properties.", "");

            final String[] propertiesPath = propertyName.split("\\.", -1);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentProfilePropertiesConditionParser.java`
#### Snippet
```java

        groupedConditionsByDeepLevels.values().forEach(setConditions -> setConditions.forEach(condition -> {
            final String propertyName = condition.getParameter("propertyName").toString().replaceAll("properties.", "");

            final String[] propertiesPath = propertyName.split("\\.", -1);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/parsers/SegmentProfileEventsConditionParser.java`
#### Snippet
```java
                }

                final String propertyName = subCondition.getParameter("propertyName").toString().replace("properties.", "");

                final String comparisonOperator = subCondition.getParameter("comparisonOperator").toString();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaProvider.java`
#### Snippet
```java
        final String eventName = typeName.substring(0, index).toLowerCase() + "_" + new String(chars);

        return eventName.replace("Filter", "")
                .replace("Input", "");
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaProvider.java`
#### Snippet
```java

        return eventName.replace("Filter", "")
                .replace("Input", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaProvider.java`
#### Snippet
```java
                                final String typeName = ReflectionUtil.resolveTypeName(additionalType);

                                final String fieldName = generateFieldName(typeName.replace("FilterInput", ""));

                                if (!registeredFieldNames.contains(fieldName)) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `extensions/router/router-service/src/main/java/org/apache/unomi/router/services/ProfileExportServiceImpl.java`
#### Snippet
```java
                    int j = 0;
                    for (String entry : multiValue) {
                        lineToWrite += entry.replaceAll("\"", "\"\"");
                        if (j + 1 < multiValue.size()) {
                            lineToWrite += exportConfiguration.getMultiValueSeparator();
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `extensions/router/router-service/src/main/java/org/apache/unomi/router/services/ProfileExportServiceImpl.java`
#### Snippet
```java
            } else {
                if(propertyValue != null) {
                    propertyValue = propertyValue.toString().replaceAll("\"", "\"\"");
                    if (StringUtils.contains(propertyValue.toString(), exportConfiguration.getColumnSeparator())) {
                        propertyValue = "\"" + propertyValue + "\"";
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `extensions/groovy-actions/rest/src/main/java/org/apache/unomi/groovy/actions/rest/GroovyActionsEndPoint.java`
#### Snippet
```java
        try {
            groovyActionsService
                    .save(file.getContentDisposition().getFilename().replace(".groovy", ""), IOUtils.toString(file.getDataHandler().getInputStream()));
        } catch (IOException e) {
            logger.error("Error while processing groovy file", e);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ClientEndpoint.java`
#### Snippet
```java
            csvWriter.writeNext(new String[] { "name", "value" });
            for (Map.Entry<String, Object> entry : currentProfile.getProperties().entrySet()) {
                csvWriter.writeNext(new String[] { entry.getKey(), entry.getValue().toString().trim().replace("\n", "") });
            }
        } else {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ClientEndpoint.java`
#### Snippet
```java
            List<String> values = new ArrayList<>();
            for (Object value : currentProfile.getProperties().values()) {
                values.add(value.toString().trim().replace("\n", ""));
            }
            csvWriter.writeNext(keySet.toArray(new String[0]));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `extensions/json-schema/rest/src/main/java/org/apache/unomi/schema/rest/JsonSchemaEndPoint.java`
#### Snippet
```java
        JsonSchemaWrapper schema = schemaService.getSchema(id);
        if (schema != null) {
            return schema.getSchema().replace("\n", "");
        }
        return null;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `extensions/groovy-actions/services/src/main/java/org/apache/unomi/groovy/actions/listener/GroovyActionListener.java`
#### Snippet
```java
    private void addGroovyAction(URL groovyActionURL) {
        try {
            groovyActionsService.save(FilenameUtils.getName(groovyActionURL.getPath()).replace(".groovy", ""),
                    IOUtils.toString(groovyActionURL.openStream()));
        } catch (IOException e) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `extensions/groovy-actions/services/src/main/java/org/apache/unomi/groovy/actions/listener/GroovyActionListener.java`
#### Snippet
```java

    private void removeGroovyAction(URL groovyActionURL) {
        String actionName = FilenameUtils.getName(groovyActionURL.getPath()).replace(".groovy", "");
        groovyActionsService.remove(actionName);
        logger.info("The script {} has been removed.", actionName);
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `extensions/json-schema/services/src/main/java/org/apache/unomi/schema/impl/SchemaServiceImpl.java`
#### Snippet
```java
        String extendsSchemaId = schemaNode.at("/self/extends").asText();

        if (TARGET_EVENTS.equals(target) && !name.matches("[_A-Za-z][_0-9A-Za-z]*")) {
            throw new IllegalArgumentException(
                    "The \"/self/name\" value should match the following regular expression [_A-Za-z][_0-9A-Za-z]* for the Json schema on events");
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/SFDCConfiguration.java`
#### Snippet
```java
        if (mappings != null && mappings.length > 0) {
            for (String mapping : mappings) {
                String[] parts = mapping.split("<=>");
                if (parts != null && parts.length == 2) {
                    unomiToSfdcFieldMappings.put(parts[0], parts[1]);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/SFDCConfiguration.java`
#### Snippet
```java
    public void setSfdcFieldMappingsIdentifier(String sfdcFieldMappingsIdentifier) {
        this.sfdcFieldMappingsIdentifier = sfdcFieldMappingsIdentifier;
        String[] sfdcFieldMappingsIdentifierParts = sfdcFieldMappingsIdentifier.split("<=>");
        if (sfdcFieldMappingsIdentifierParts != null && sfdcFieldMappingsIdentifierParts.length == 2) {
            unomiIdentifierField = sfdcFieldMappingsIdentifierParts[0];
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            if (mappingConsents.length > 0) {
                for (String mappingConsent : mappingConsents) {
                    String[] mappingConsentArray = mappingConsent.split("<=>");
                    if (mappingConsentArray.length <= 0) {
                        logger.error("Error with the mapping for field {}, this field will not be mapped please check the cfg file", mappingConsentsString);
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.karaf.cellar.core` is unnecessary and can be removed
in `services/src/main/java/org/apache/unomi/services/impl/cluster/ClusterServiceImpl.java`
#### Snippet
```java
        Map<String, ClusterNode> clusterNodes = new LinkedHashMap<String, ClusterNode>();

        Set<org.apache.karaf.cellar.core.Node> karafCellarNodes = karafCellarClusterManager.listNodes();
        org.apache.karaf.cellar.core.Node thisKarafNode = karafCellarClusterManager.getNode();
        Map<String, Properties> clusterConfigurations = karafCellarClusterManager.getMap(Constants.CONFIGURATION_MAP + Configurations.SEPARATOR + karafCellarGroupName);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.karaf.cellar.core` is unnecessary and can be removed
in `services/src/main/java/org/apache/unomi/services/impl/cluster/ClusterServiceImpl.java`
#### Snippet
```java

        Set<org.apache.karaf.cellar.core.Node> karafCellarNodes = karafCellarClusterManager.listNodes();
        org.apache.karaf.cellar.core.Node thisKarafNode = karafCellarClusterManager.getNode();
        Map<String, Properties> clusterConfigurations = karafCellarClusterManager.getMap(Constants.CONFIGURATION_MAP + Configurations.SEPARATOR + karafCellarGroupName);
        Properties karafCellarClusterNodeConfiguration = clusterConfigurations.get(KARAF_CELLAR_CLUSTER_NODE_CONFIGURATION);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.karaf.cellar.core` is unnecessary and can be removed
in `services/src/main/java/org/apache/unomi/services/impl/cluster/ClusterServiceImpl.java`
#### Snippet
```java
            internalNodeEndpoints = getMapProperty(karafCellarClusterNodeConfiguration, KARAF_CLUSTER_CONFIGURATION_INTERNAL_ENDPOINTS, thisKarafNode.getId() + "=" + internalAddress);
        }
        for (org.apache.karaf.cellar.core.Node karafCellarNode : karafCellarNodes) {
            ClusterNode clusterNode = new ClusterNode();
            String publicEndpoint = publicNodeEndpoints.get(karafCellarNode.getId());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.karaf.cellar.core` is unnecessary and can be removed
in `services/src/main/java/org/apache/unomi/services/impl/cluster/ClusterServiceImpl.java`
#### Snippet
```java
            if (setupConfigOk) {
                Map<String, Properties> configurations = karafCellarClusterManager.getMap(Constants.CONFIGURATION_MAP + Configurations.SEPARATOR + karafCellarGroupName);
                org.apache.karaf.cellar.core.Node thisKarafNode = karafCellarClusterManager.getNode();
                Properties karafCellarClusterNodeConfiguration = configurations.get(KARAF_CELLAR_CLUSTER_NODE_CONFIGURATION);
                if (karafCellarClusterNodeConfiguration == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `io.reactivex.subscribers` is unnecessary, and can be replaced with an import
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/websocket/ExecutionResultSubscriber.java`
#### Snippet
```java
import java.util.Collections;

public class ExecutionResultSubscriber extends io.reactivex.subscribers.DefaultSubscriber<ExecutionResult> {

    private static final Logger logger = LoggerFactory.getLogger(ExecutionResultSubscriber.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet.http` is unnecessary, and can be replaced with an import
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/GraphQLServlet.java`
#### Snippet
```java

@Component(
        service = {javax.servlet.http.HttpServlet.class, javax.servlet.Servlet.class},
        property = {"alias=/graphql"}
)
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary, and can be replaced with an import
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/GraphQLServlet.java`
#### Snippet
```java

@Component(
        service = {javax.servlet.http.HttpServlet.class, javax.servlet.Servlet.class},
        property = {"alias=/graphql"}
)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.cxf.metrics` is unnecessary, and can be replaced with an import
in `rest/src/main/java/org/apache/unomi/rest/server/RestServerBus.java`
#### Snippet
```java
    public RestServerBus() {
        this.getFeatures().add(new LoggingFeature());
        this.getFeatures().add(new org.apache.cxf.metrics.MetricsFeature());
    }
}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.unomi.api` is unnecessary and can be removed
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ScopeServiceEndPoint.java`
#### Snippet
```java

/**
 * A JAX-RS endpoint to manage {@link org.apache.unomi.api.Scope}s.
 */
@WebService
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.unomi.persistence.spi` is unnecessary, and can be replaced with an import
in `rest/src/main/java/org/apache/unomi/rest/server/RestServer.java`
#### Snippet
```java

        // Build the server
        ObjectMapper objectMapper = new org.apache.unomi.persistence.spi.CustomObjectMapper(desers);
        JAXRSServerFactoryBean jaxrsServerFactoryBean = new JAXRSServerFactoryBean();
        jaxrsServerFactoryBean.setAddress("/");
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.cxf.rs.security.cors` is unnecessary, and can be replaced with an import
in `rest/src/main/java/org/apache/unomi/rest/server/RestServer.java`
#### Snippet
```java
        jaxrsServerFactoryBean.setBus(serverBus);
        jaxrsServerFactoryBean.setProvider(new JacksonJaxbJsonProvider(objectMapper, JacksonJaxbJsonProvider.DEFAULT_ANNOTATIONS));
        jaxrsServerFactoryBean.setProvider(new org.apache.cxf.rs.security.cors.CrossOriginResourceSharingFilter());
        jaxrsServerFactoryBean.setProvider(new RetroCompatibilityParamConverterProvider(objectMapper));

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.unomi.api` is unnecessary, and can be replaced with an import
in `extensions/groovy-actions/services/src/main/java/org/apache/unomi/groovy/actions/services/impl/GroovyActionsServiceImpl.java`
#### Snippet
```java

        actionType.setParameters(Stream.of(action.parameters())
                .map(parameter -> new org.apache.unomi.api.Parameter(parameter.id(), parameter.type(), parameter.multivalued()))
                .collect(Collectors.toList()));
        definitionsService.setActionType(actionType);
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator never returns positive value
in `common/src/main/java/org/apache/unomi/common/DataTable.java`
#### Snippet
```java
    public static class EmptyCell implements Comparable {
        @Override
        public int compareTo(Object o) {
            if (o instanceof EmptyCell) {
                return 0;
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/conditions/ConditionContextHelper.java`
#### Snippet
```java
            mappingCharFilterFactory.inform(new ClasspathResourceLoader(ConditionContextHelper.class.getClassLoader()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/org/apache/unomi/common/DataTable.java`
#### Snippet
```java
            printer.close();
        } catch (IOException e) {
            e.printStackTrace(); // this will probably never happen as we are writing to a String.
        }
        return stringBuilder.toString();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                    client.indices().refresh(Requests.refreshRequest(index), RequestOptions.DEFAULT);
                } catch (IOException e) {
                    e.printStackTrace();//TODO manage ES7
                }
                return true;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                    client.indices().refresh(Requests.refreshRequest(), RequestOptions.DEFAULT);
                } catch (IOException e) {
                    e.printStackTrace();//TODO manage ES7
                }
                return true;
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `ESItemMixIn()` of an abstract class should not be declared 'public'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ESItemMixIn.java`
#### Snippet
```java
public abstract class ESItemMixIn {

    public ESItemMixIn() { }

    @JsonIgnore abstract Long getVersion();
```

### NonProtectedConstructorInAbstractClass
Constructor `ESEventMixIn()` of an abstract class should not be declared 'public'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ESEventMixIn.java`
#### Snippet
```java
public abstract class ESEventMixIn {

    public ESEventMixIn() { }

    @JsonIgnore abstract boolean isPersistent();
```

### NonProtectedConstructorInAbstractClass
Constructor `MetricAdapter()` of an abstract class should not be declared 'public'
in `metrics/src/main/java/org/apache/unomi/metrics/MetricAdapter.java`
#### Snippet
```java
    public abstract T execute(Object... args) throws Exception;

    public MetricAdapter(MetricsService metricsService, String timerName) {
        this.metricsService = metricsService;
        this.timerName = timerName;
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseCDPPropertyInput()` of an abstract class should not be declared 'public'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/BaseCDPPropertyInput.java`
#### Snippet
```java
    private List<String> tags;

    public BaseCDPPropertyInput(@GraphQLName("name") String name,
                                @GraphQLName("minOccurrences") Integer minOccurrences,
                                @GraphQLName("maxOccurrences") Integer maxOccurrences,
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseCDPPropertyInput()` of an abstract class should not be declared 'public'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/BaseCDPPropertyInput.java`
#### Snippet
```java
    }

    public BaseCDPPropertyInput(BaseCDPPropertyInput input) {
        this.name = input.name;
        this.minOccurrences = input.minOccurrences;
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseCommand()` of an abstract class should not be declared 'public'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/BaseCommand.java`
#### Snippet
```java
    public abstract T execute();

    public BaseCommand(final Builder builder) {
        this.environment = builder.environment;
        this.serviceManager = environment.getContext();
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseCreateOrUpdateSegmentCommand()` of an abstract class should not be declared 'public'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/segments/BaseCreateOrUpdateSegmentCommand.java`
#### Snippet
```java
    private final INPUT segmentInput;

    public BaseCreateOrUpdateSegmentCommand(Builder builder) {
        super(builder);

```

### NonProtectedConstructorInAbstractClass
Constructor `DynamicFieldDataFetcher()` of an abstract class should not be declared 'public'
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/DynamicFieldDataFetcher.java`
#### Snippet
```java
    protected String valueTypeId;

    public DynamicFieldDataFetcher(String fieldName, String valueTypeId) {
        this.fieldName = PropertyNameTranslator.translateFromGraphQLToUnomi(fieldName);
        this.valueTypeId = valueTypeId;
```

### NonProtectedConstructorInAbstractClass
Constructor `HardcodedPropertyAccessor()` of an abstract class should not be declared 'public'
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/accessors/HardcodedPropertyAccessor.java`
#### Snippet
```java
    protected HardcodedPropertyAccessorRegistry registry;

    public HardcodedPropertyAccessor(HardcodedPropertyAccessorRegistry registry) {
        this.registry = registry;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `RouterAbstractRouteBuilder()` of an abstract class should not be declared 'public'
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/route/RouterAbstractRouteBuilder.java`
#### Snippet
```java
    protected ProfileService profileService;

    public RouterAbstractRouteBuilder(Map<String, String> kafkaProps, String configType) {
        this.kafkaHost = kafkaProps.get("kafkaHost");
        this.kafkaPort = kafkaProps.get("kafkaPort");
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseAggregate()` of an abstract class should not be declared 'public'
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/aggregate/BaseAggregate.java`
#### Snippet
```java
    private String field;

    public BaseAggregate(String field) {
        this.field = field;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `MetadataItem()` of an abstract class should not be declared 'public'
in `api/src/main/java/org/apache/unomi/api/MetadataItem.java`
#### Snippet
```java
    protected Metadata metadata;

    public MetadataItem() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `MetadataItem()` of an abstract class should not be declared 'public'
in `api/src/main/java/org/apache/unomi/api/MetadataItem.java`
#### Snippet
```java
    }

    public MetadataItem(Metadata metadata) {
        super(metadata.getId());
        this.metadata = metadata;
```

### NonProtectedConstructorInAbstractClass
Constructor `Item()` of an abstract class should not be declared 'public'
in `api/src/main/java/org/apache/unomi/api/Item.java`
#### Snippet
```java
    }

    public Item(String itemId) {
        this();
        this.itemId = itemId;
```

### NonProtectedConstructorInAbstractClass
Constructor `Item()` of an abstract class should not be declared 'public'
in `api/src/main/java/org/apache/unomi/api/Item.java`
#### Snippet
```java
    protected Map<String, Object> systemMetadata = new HashMap<>();

    public Item() {
        this.itemType = getItemType(this.getClass());
        if (itemType == null) {
```

### NonProtectedConstructorInAbstractClass
Constructor `InClassLoaderExecute()` of an abstract class should not be declared 'public'
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
        private boolean throwExceptions;

        public InClassLoaderExecute(MetricsService metricsService, String timerName, BundleContext bundleContext, String[] fatalIllegalStateErrors, boolean throwExceptions) {
            this.timerName = timerName;
            this.metricsService = metricsService;
```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new ParserHelper.ValueExtractor() can be replaced with method reference
in `services/src/main/java/org/apache/unomi/services/actions/impl/ActionExecutorDispatcherImpl.java`
#### Snippet
```java
    public ActionExecutorDispatcherImpl() {
        valueExtractors.putAll(ParserHelper.DEFAULT_VALUE_EXTRACTORS);
        valueExtractors.put("script", new ParserHelper.ValueExtractor() {
            @Override
            public Object extract(String valueAsString, Event event)
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `services/src/main/java/org/apache/unomi/services/impl/patches/PatchServiceImpl.java`
#### Snippet
```java
        if (urls != null) {
            List<URL> resources = Collections.list(urls);
            resources.sort(new Comparator<URL>() {
                @Override public int compare(URL o1, URL o2) {
                    return o1.getFile().compareTo(o2.getFile());
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java

    public Collection<PropertyType> getPropertyTypeByMapping(String propertyName) {
        Collection<PropertyType> l = new TreeSet<PropertyType>(new Comparator<PropertyType>() {
            @Override
            public int compare(PropertyType o1, PropertyType o2) {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `common/src/main/java/org/apache/unomi/common/DataTable.java`
#### Snippet
```java

    public void sort(SortCriteria... sortCriterias) {
        rows.sort(new Comparator<Row>() {
            @Override
            public int compare(Row row1, Row row2) {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `s`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/conditions/ConditionContextHelper.java`
#### Snippet
```java
    public static String foldToASCII(String s) {
        if (s != null) {
            s = s.toLowerCase();
            try (StringReader stringReader = new StringReader(s); Reader foldedStringReader = mappingCharFilterFactory.create(stringReader)) {
                return IOUtils.toString(foldedStringReader);
```

### AssignmentToMethodParameter
Assignment to method parameter `metadata`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/property/BaseCDPPropertyInput.java`
#### Snippet
```java
    private Metadata updateMetadata(Metadata metadata) {
        if (metadata == null) {
            metadata = new Metadata();
            final Set<String> systemTags = new HashSet<>();

```

### AssignmentToMethodParameter
Assignment to method parameter `schemaTree`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/json/JSONTypeFactory.java`
#### Snippet
```java
            JsonSchemaWrapper refSchema = schemaService.getSchema(schemaId);
            if (refSchema != null) {
                schemaTree = GraphQLSchemaProvider.buildJSONSchema(refSchema, schemaService).getSchemaTree();
            } else {
                System.err.println("Couldn't find schema for ref " + schemaId);
```

### AssignmentToMethodParameter
Assignment to method parameter `profilesToMerge`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
        }

        profilesToMerge = filteredProfilesToMerge;

        Set<String> allProfileProperties = new LinkedHashSet<>();
```

### AssignmentToMethodParameter
Assignment to method parameter `profileId`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
        ProfileAlias profileAlias = persistenceService.load(profileId, ProfileAlias.class);
        if (profileAlias != null) {
            profileId = profileAlias.getProfileID();
        }
        return persistenceService.load(profileId, Profile.class);
```

### AssignmentToMethodParameter
Assignment to method parameter `item`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/SourceEventPropertyConditionEvaluator.java`
#### Snippet
```java
        // in case the evaluated item is an event, we switch to his source internal object for further evaluations
        if (item instanceof Event) {
            item = ((Event) item).getSource();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `exportConfiguration`
in `extensions/router/router-service/src/main/java/org/apache/unomi/router/services/ProfileExportServiceImpl.java`
#### Snippet
```java
        execution.put(RouterConstants.KEY_EXECS_EXTRACTED, profileList.size());

        exportConfiguration = (ExportConfiguration) RouterUtils.addExecutionEntry(exportConfiguration, execution, Integer.parseInt((String) configSharingService.getProperty(RouterConstants.KEY_HISTORY_SIZE)));
        persistenceService.save(exportConfiguration);

```

### AssignmentToMethodParameter
Assignment to method parameter `eventsRequestContext`
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ContextJsonEndpoint.java`
#### Snippet
```java
        processOverrides(contextRequest, eventsRequestContext.getProfile(), eventsRequestContext.getSession());

        eventsRequestContext = restServiceUtils.performEventsRequest(contextRequest.getEvents(), eventsRequestContext);
        data.setProcessedEvents(eventsRequestContext.getProcessedItems());

```

### AssignmentToMethodParameter
Assignment to method parameter `sessionId`
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ContextJsonEndpoint.java`
#### Snippet
```java
        if (contextRequest != null) {
            scope = contextRequest.getSource() != null ? contextRequest.getSource().getScope() : scope;
            sessionId = contextRequest.getSessionId() != null ? contextRequest.getSessionId() : sessionId;
            profileId = contextRequest.getProfileId();
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `lang`
in `rest/src/main/java/org/apache/unomi/rest/service/impl/ResourceBundleHelper.java`
#### Snippet
```java
        int i = lang.indexOf(';');
        if (i > -1) {
            lang = lang.substring(0, i);
        }
        return Locale.forLanguageTag(lang);
```

### AssignmentToMethodParameter
Assignment to method parameter `profileId`
in `rest/src/main/java/org/apache/unomi/rest/service/impl/RestServiceUtilsImpl.java`
#### Snippet
```java
        if (profileId == null) {
            // Get profile id from the cookie
            profileId = getProfileIdCookieValue(request);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `propertyName`
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyHelper.java`
#### Snippet
```java
                    PropertyUtils.setProperty(target, resolver.next(propertyName), v);
                }
                propertyName = resolver.remove(propertyName);
                target = v;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyHelper.java`
#### Snippet
```java
                }
                propertyName = resolver.remove(propertyName);
                target = v;
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                && propertyMapping.containsKey("fields")
                && ((Map) propertyMapping.get("fields")).containsKey("keyword")) {
            name += ".keyword";
        }
        return name;
```

### AssignmentToMethodParameter
Assignment to method parameter `mappings`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                return propMapping;
            } else {
                mappings = propMapping != null ? ((Map<String, Map<String, Object>>) propMapping.get("properties")) : null;
            }
        }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `extensions/router/router-api/src/main/java/org/apache/unomi/router/api/RouterUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/topics/TopicServiceImpl.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/conditions/ConditionContextHelper.java`
#### Snippet
```java
                Object parameter = parseParameter(context, entry.getValue(), scriptExecutor);
                if (parameter == null) {
                    return null;
                }
                values.put(entry.getKey(), parameter);
```

### ReturnNull
Return of `null`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/conditions/ConditionContextHelper.java`
#### Snippet
```java
            });
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/conditions/ConditionContextHelper.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/conditions/ConditionContextHelper.java`
#### Snippet
```java
        Map<String, Object> values = (Map<String, Object>) parseParameter(context, condition.getParameterValues(), scriptExecutor);
        if (values == null) {
            return null;
        }
        Condition n = new Condition(condition.getConditionType());
```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/cluster/ClusterServiceImpl.java`
#### Snippet
```java
        String oldPropertyValue = (String) properties.setProperty(propertyName, propertyValueBuilder.toString());
        if (oldPropertyValue == null) {
            return null;
        }
        return getMapProperty(oldPropertyValue);
```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/goals/GoalsServiceImpl.java`
#### Snippet
```java
    private CampaignDetail getCampaignDetail(Campaign campaign) {
        if (campaign == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/personalization/PersonalizationServiceImpl.java`
#### Snippet
```java
            return result.getContentIds().get(0);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/events/EventServiceImpl.java`
#### Snippet
```java
            logger.warn("Could not authenticate any third party servers for key: {}", key);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `metrics/src/main/java/org/apache/unomi/metrics/commands/DeactivateCommand.java`
#### Snippet
```java
        metricsService.setActivated(false);
        System.out.println("Metrics de-activated successfully.");
        return null;
    }

```

### ReturnNull
Return of `null`
in `metrics/src/main/java/org/apache/unomi/metrics/commands/ResetCommand.java`
#### Snippet
```java
        metricsService.resetMetrics();
        System.out.println("Metrics reset successfully.");
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `metrics/src/main/java/org/apache/unomi/metrics/commands/ActivateCommand.java`
#### Snippet
```java
        metricsService.setActivated(true);
        System.out.println("Metrics activated successfully.");
        return null;
    }

```

### ReturnNull
Return of `null`
in `metrics/src/main/java/org/apache/unomi/metrics/commands/ViewCommand.java`
#### Snippet
```java
        if (metric == null) {
            System.out.println("Couldn't find a metric with name=" + metricName);
            return null;
        }
        // by default pretty printer will use spaces between array values, we change this to linefeeds to make
```

### ReturnNull
Return of `null`
in `metrics/src/main/java/org/apache/unomi/metrics/commands/ViewCommand.java`
#### Snippet
```java
        String jsonMetric = CustomObjectMapper.getObjectMapper().writer(defaultPrettyPrinter).writeValueAsString(metric);
        System.out.println(jsonMetric);
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `metrics/src/main/java/org/apache/unomi/metrics/commands/CallerStatusCommand.java`
#### Snippet
```java
            metricsService.setCallerActivated(metricName, metricStatus);
            System.out.println("Metric callers " + metricName + " set to " + metricStatus);
            return null;
        }
        Map<String,Boolean> callersStatus = metricsService.getCallersStatus();
```

### ReturnNull
Return of `null`
in `metrics/src/main/java/org/apache/unomi/metrics/commands/CallerStatusCommand.java`
#### Snippet
```java

        shellTable.print(System.out, !noFormat);
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `metrics/src/main/java/org/apache/unomi/metrics/commands/ListCommand.java`
#### Snippet
```java
        if (csv) {
            System.out.println(dataTable.toCSV(headers));
            return null;
        }

```

### ReturnNull
Return of `null`
in `metrics/src/main/java/org/apache/unomi/metrics/commands/ListCommand.java`
#### Snippet
```java
        }
        shellTable.print(System.out);
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/definitions/DefinitionsServiceImpl.java`
#### Snippet
```java
            }
            if (matchingConditions.size() == 0) {
                return null;
            } else if (matchingConditions.equals(subConditions)) {
                return rootCondition;
```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/definitions/DefinitionsServiceImpl.java`
#### Snippet
```java
            return rootCondition;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/definitions/DefinitionsServiceImpl.java`
#### Snippet
```java
            }
            if (matchingConditions.size() == 0) {
                return null;
            } else if (matchingConditions.equals(subConditions)) {
                return rootCondition;
```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/definitions/DefinitionsServiceImpl.java`
#### Snippet
```java
            return rootCondition;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/definitions/DefinitionsServiceImpl.java`
#### Snippet
```java
    public ConditionType getConditionType(String id) {
        if (id == null) {
            return null;
        }
        ConditionType type = conditionTypeById.get(id);
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListsUpdateEventInput.java`
#### Snippet
```java

        if (profile == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventInput.java`
#### Snippet
```java

        if (profile == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSessionEventInput.java`
#### Snippet
```java

        if (profile == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPUnomiEventInput.java`
#### Snippet
```java

        if (profile == null) {
            return null;
        }
        //TODO: maybe will have to convert manually
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileUpdateEventFilterInput.java`
#### Snippet
```java
    public static CDPProfileUpdateEventFilterInput fromMap(final Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new CDPProfileUpdateEventFilterInput();
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPOrderByInput.java`
#### Snippet
```java
    public String asString() {
        if (Strings.isNullOrEmpty(fieldName)) {
            return null;
        } else if (sortOrder == null || CDPSortOrder.UNSPECIFIED == sortOrder) {
            return fieldName;
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPProfileUpdateEventInput.java`
#### Snippet
```java

        if (profile == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPListsUpdateEventFilterInput.java`
#### Snippet
```java
    public static CDPListsUpdateEventFilterInput fromMap(final Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        final List<String> joinLists = (List<String>) map.get("joinLists_contains");
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPSessionEventFilterInput.java`
#### Snippet
```java
    public static CDPSessionEventFilterInput fromMap(final Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        final CDPSessionState state = map.get("state_equals") != null ? CDPSessionState.valueOf((String) map.get("state_equals")) : null;
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java
    public static CDPEventFilterInput fromMap(final Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        final List<CDPEventFilterInput> andFltrs = recursiveList(map.get("and"));
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPEventFilterInput.java`
#### Snippet
```java
    private static List<CDPEventFilterInput> recursiveList(Object list) {
        if (list == null) {
            return null;
        }
        return ((List<Map<String, Object>>) list).stream()
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/input/CDPConsentUpdateEventFilterInput.java`
#### Snippet
```java
    public static CDPConsentUpdateEventFilterInput fromMap(final Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        final String typeEq = (String) map.get("type_equals");
```

### ReturnNull
Return of `null`
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
            serverIdentifier = bundle.getHeaders().get("Implementation-ServerIdentifier");
        } else {
            return null;
        }
        List<String> logoLines = loadLogo(bundle);
```

### ReturnNull
Return of `null`
in `lifecycle-watcher/src/main/java/org/apache/unomi/lifecycle/BundleWatcherImpl.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPropertyInterface.java`
#### Snippet
```java
        final PropertyType type = getType();
        if (type == null) {
            return null;
        }
        final Metadata meta = type.getMetadata();
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPropertyInterface.java`
#### Snippet
```java
        }
        final Metadata meta = type.getMetadata();
        return meta != null ? meta.getTags() : null;
    }
}
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPropertyInterface.java`
#### Snippet
```java
        final PropertyType type = getType();
        if (type == null) {
            return null;
        }
        // Using 0-1 for regular field and 0-1000 for multivalued
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPropertyInterface.java`
#### Snippet
```java
        final PropertyType type = getType();
        if (type == null) {
            return null;
        }
        final Metadata meta = type.getMetadata();
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPropertyInterface.java`
#### Snippet
```java
        }
        final Metadata meta = type.getMetadata();
        return meta != null ? meta.getName() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfileAlias.java`
#### Snippet
```java
    @GraphQLField
    public String alias() {
        return profileAlias != null ? profileAlias.getItemId() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfileAlias.java`
#### Snippet
```java
            return profileID;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfileAlias.java`
#### Snippet
```java
    @GraphQLField
    public OffsetDateTime creationTime() {
        return profileAlias != null ? profileAlias.getCreationTime().toInstant().atZone(ZoneId.systemDefault()).toOffsetDateTime() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfileAlias.java`
#### Snippet
```java
    @GraphQLField
    public OffsetDateTime modifiedTime() {
        return profileAlias != null ? profileAlias.getModifiedTime().toInstant().atZone(ZoneId.systemDefault()).toOffsetDateTime() : null;
    }
}
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPSessionEvent.java`
#### Snippet
```java
        final Object state = getEvent().getProperty("state");

        return state != null ? CDPSessionState.valueOf(state.toString()) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPObject.java`
#### Snippet
```java
    @GraphQLField
    public List<CDPTopic> topics(final DataFetchingEnvironment environment) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPSegment.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPSegment.java`
#### Snippet
```java
    @GraphQLField
    public String id() {
        return segment != null ? segment.getItemId() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPSegment.java`
#### Snippet
```java
    public CDPView view() {
        if (segment == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPSegment.java`
#### Snippet
```java
        }

        return segment.getScope() != null ? new CDPView(segment.getScope()) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPConsent.java`
#### Snippet
```java
    @GraphQLField
    public OffsetDateTime expiration() {
        return consent != null ? DateUtils.toOffsetDateTime(consent.getRevokeDate()) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPConsent.java`
#### Snippet
```java
    @GraphQLField
    public String type() {
        return consent != null ? consent.getTypeIdentifier() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPConsent.java`
#### Snippet
```java
    @GraphQLField
    public CDPProfileInterface profile() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPConsent.java`
#### Snippet
```java
    @GraphQLField
    public CDPSource source() {
        return consent != null ? new CDPSource(consent.getScope()) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPConsent.java`
#### Snippet
```java
    @GraphQLField
    public OffsetDateTime lastUpdate() {
        return consent != null ? DateUtils.toOffsetDateTime(consent.getStatusDate()) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPConsent.java`
#### Snippet
```java
    @GraphQLField
    public CDPConsentStatus status() {
        return consent != null ? CDPConsentStatus.from(consent.getStatus()) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPTopic.java`
#### Snippet
```java
    @GraphQLNonNull
    public CDPView view(final DataFetchingEnvironment environment) {
        return topic != null ? new CDPView(topic.getScope()) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPTopic.java`
#### Snippet
```java
    @GraphQLNonNull
    public String name(final DataFetchingEnvironment environment) {
        return topic != null ? topic.getName() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPTopic.java`
#### Snippet
```java
    @GraphQLNonNull
    public String id(final DataFetchingEnvironment environment) {
        return topic != null ? topic.getTopicId() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPropertyEdge.java`
#### Snippet
```java
    @GraphQLPrettify
    public String getCursor() {
        return type != null ? type.getItemId() : null;
    }
}
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfileEdge.java`
#### Snippet
```java
    @GraphQLNonNull
    public String cursor(final DataFetchingEnvironment environment) {
        return profile != null ? profile.getItemId() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPListConnection.java`
#### Snippet
```java
    @GraphQLField
    public Integer totalCount(final DataFetchingEnvironment environment) {
        return userLists != null ? (int) userLists.getTotalSize() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPListConnection.java`
#### Snippet
```java
    public CDPPageInfo pageInfo(final DataFetchingEnvironment environment) {
        if (userLists == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPListConnection.java`
#### Snippet
```java
    public List<CDPListEdge> edges(final DataFetchingEnvironment environment) {
        if (userLists == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfileAliasEdge.java`
#### Snippet
```java
    @GraphQLField
    public String cursor() {
        return profileAlias != null ? profileAlias.getItemId() : null;
    }
}
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPListEdge.java`
#### Snippet
```java
    @GraphQLNonNull
    public String cursor(final DataFetchingEnvironment environment) {
        return userList != null ? userList.getItemId() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPListEdge.java`
#### Snippet
```java
    @GraphQLField
    public CDPList node(final DataFetchingEnvironment environment) {
        return userList != null ? new CDPList(userList) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPEventInterface.java`
#### Snippet
```java
    @GraphQLField
    default List<CDPTopic> cdp_topics(final DataFetchingEnvironment environment) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPEventInterface.java`
#### Snippet
```java
    @GraphQLField
    default GeoPoint cdp_location(final DataFetchingEnvironment environment) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPEventInterface.java`
#### Snippet
```java
    @GraphQLField
    default CDPSource cdp_source(final DataFetchingEnvironment environment) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPEventInterface.java`
#### Snippet
```java
            return new CDPProfile(profile);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPEventInterface.java`
#### Snippet
```java

    default Object getProperty(final String propertyName) {
        return getEvent() != null ? getEvent().getProperty(propertyName) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPersona.java`
#### Snippet
```java
    @GraphQLField
    public String id() {
        return persona != null ? persona.getItemId() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPersona.java`
#### Snippet
```java
    public CDPView cdp_view() {
        if (persona == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPersona.java`
#### Snippet
```java
        final Object view = persona.getProperty("cdp_view");

        return view != null ? new CDPView(view.toString()) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPersona.java`
#### Snippet
```java
    @GraphQLField
    public List<CDPConsent> cdp_consents(final DataFetchingEnvironment environment) throws Exception {
        return persona != null ? new ProfileConsentsDataFetcher(persona).get(environment) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPersona.java`
#### Snippet
```java
    @Override
    public Object getProperty(final String propertyName) {
        return persona != null ? persona.getProperty(propertyName) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPersona.java`
#### Snippet
```java
    @GraphQLNonNull
    public String cdp_name() {
        return persona != null ? (String) persona.getProperty("cdp_name") : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPersona.java`
#### Snippet
```java
    public List<CDPSegment> cdp_segments(
            final @GraphQLName("views") List<String> viewIds, final DataFetchingEnvironment environment) throws Exception {
        return persona != null ? new ProfileSegmentsDataFetcher(persona, viewIds).get(environment) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPersona.java`
#### Snippet
```java
    @Override
    public List<CDPList> cdp_lists(final @GraphQLName("views") List<String> viewIds, final DataFetchingEnvironment environment) throws Exception {
        return persona != null ? new ProfileListsDataFetcher(persona, viewIds).get(environment) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPersona.java`
#### Snippet
```java
    public List<CDPProfileID> cdp_profileIDs(final DataFetchingEnvironment environment) throws Exception {
        if (persona == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPersona.java`
#### Snippet
```java

        List<String> profileIds = (List<String>) persona.getProperty("mergedWith");
        return profileIds != null ? profileIds.stream().map(CDPProfileID::new).collect(Collectors.toList()) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPPersona.java`
#### Snippet
```java
            final @GraphQLName("views") List<String> viewIds,
            final DataFetchingEnvironment environment) throws Exception {
        return persona != null ? new ProfileInterestsDataFetcher(persona, viewIds).get(environment) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPList.java`
#### Snippet
```java
    @GraphQLNonNull
    public CDPView view() {
        return userList.getScope() != null ? new CDPView(userList.getScope()) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPList.java`
#### Snippet
```java
    @GraphQLNonNull
    public String name() {
        return userList.getMetadata() != null ? userList.getMetadata().getName() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/UnomiSegment.java`
#### Snippet
```java
    @GraphQLField
    public Object condition() {
        return segment != null ? segment.getCondition() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/UnomiSegment.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/UnomiSegment.java`
#### Snippet
```java
    @GraphQLField
    public String id() {
        return segment != null ? segment.getItemId() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/UnomiSegment.java`
#### Snippet
```java
    public CDPView view() {
        if (segment == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/UnomiSegment.java`
#### Snippet
```java
        }

        return segment.getScope() != null ? new CDPView(segment.getScope()) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPConsentUpdateEvent.java`
#### Snippet
```java
    public OffsetDateTime expiration(DataFetchingEnvironment environment) {
        final Object expiration = getEvent().getProperty("expiration");
        return expiration != null ? DateUtils.offsetDateTimeFromMap((Map<String, Object>) expiration) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPConsentUpdateEvent.java`
#### Snippet
```java
    public OffsetDateTime lastUpdate(DataFetchingEnvironment environment) {
        final Object lastUpdate = getEvent().getProperty("lastUpdate");
        return lastUpdate != null ? DateUtils.offsetDateTimeFromMap((Map<String, Object>) lastUpdate) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPConsentUpdateEvent.java`
#### Snippet
```java
    public String type(DataFetchingEnvironment environment) {
        final Object type = getEvent().getProperty("type");
        return type != null ? type.toString() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPConsentUpdateEvent.java`
#### Snippet
```java
    public String status(DataFetchingEnvironment environment) {
        final Object status = getEvent().getProperty("status");
        return status != null ? status.toString() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPListsUpdateEvent.java`
#### Snippet
```java

        if (listIds == null || listIds.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPListsUpdateEvent.java`
#### Snippet
```java

        if (partialList == null || partialList.getList() == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/CDPProfile.java`
#### Snippet
```java
    @Override
    public Object getProperty(final String propertyName) {
        return profile != null ? profile.getProperty(propertyName) : null;
    }

```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
                }
            } else {
                return null;
            }
        } else if ("profileSegmentCondition".equals(condition.getConditionTypeId())) {
```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
                referencedSegmentIds.remove(segmentId);
                if (referencedSegmentIds.isEmpty()) {
                    return null;
                } else {
                    condition.setParameter("segments", referencedSegmentIds);
```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
                }
            } else {
                return null;
            }
        } else if ("scoringCondition".equals(condition.getConditionTypeId())
```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
        } else if ("scoringCondition".equals(condition.getConditionTypeId())
                && scoringId.equals(condition.getParameter("scoringPlanId"))) {
            return null;
        }
        return condition;
```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/segments/SegmentServiceImpl.java`
#### Snippet
```java
        } catch (JsonProcessingException e) {
            logger.error("Cannot generate key", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPFloatPropertyType.java`
#### Snippet
```java
    public Double minValue() {
        if (type == null) {
            return null;
        }
        final NumericRange defaultRange = getDefaultNumericRange();
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPFloatPropertyType.java`
#### Snippet
```java
        }
        final NumericRange defaultRange = getDefaultNumericRange();
        return defaultRange != null ? defaultRange.getFrom() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPFloatPropertyType.java`
#### Snippet
```java
    public Double maxValue() {
        final NumericRange defaultRange = getDefaultNumericRange();
        return defaultRange != null ? defaultRange.getTo() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPFloatPropertyType.java`
#### Snippet
```java
    public Double defaultValue() {
        if (type == null) {
            return null;
        }
        final String defaultValue = type.getDefaultValue();
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPFloatPropertyType.java`
#### Snippet
```java
        }
        final String defaultValue = type.getDefaultValue();
        return !Strings.isNullOrEmpty(defaultValue) ? Double.valueOf(defaultValue) : null;
    }
}
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPGeoPointPropertyType.java`
#### Snippet
```java
    @GraphQLField
    public GeoPoint defaultValue() {
        return type != null && type.getDefaultValue() != null ? GeoPoint.fromString(type.getDefaultValue()) : null;
    }
}
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPJsonPropertyType.java`
#### Snippet
```java
    @GraphQLField
    public Object defaultValue() {
        return type != null ? type.getDefaultValue() : null;
    }
}
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPLongPropertyType.java`
#### Snippet
```java
        final NumericRange defaultRange = getDefaultNumericRange();
        final Double to = defaultRange != null ? defaultRange.getTo() : null;
        return to != null ? to.longValue() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPLongPropertyType.java`
#### Snippet
```java
    public Long minValue() {
        if (type == null) {
            return null;
        }
        final NumericRange defaultRange = getDefaultNumericRange();
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPLongPropertyType.java`
#### Snippet
```java
        final NumericRange defaultRange = getDefaultNumericRange();
        final Double from = defaultRange != null ? defaultRange.getFrom() : null;
        return from != null ? from.longValue() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPLongPropertyType.java`
#### Snippet
```java
    public Long defaultValue() {
        if (type == null) {
            return null;
        }
        final String defaultValue = type.getDefaultValue();
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPLongPropertyType.java`
#### Snippet
```java
        }
        final String defaultValue = type.getDefaultValue();
        return !Strings.isNullOrEmpty(defaultValue) ? Long.valueOf(defaultValue) : null;
    }
}
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPStringPropertyType.java`
#### Snippet
```java
    @GraphQLField
    public String defaultValue() {
        return type != null ? type.getDefaultValue() : null;
    }
}
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPStringPropertyType.java`
#### Snippet
```java
    public String regexp() {
        //TODO when unomi supports this type
        return null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPSetPropertyType.java`
#### Snippet
```java
        final Set<PropertyType> childPropertyTypes = this.type.getChildPropertyTypes();
        if (childPropertyTypes == null || childPropertyTypes.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPIntPropertyType.java`
#### Snippet
```java
    public Integer defaultValue() {
        if (type == null) {
            return null;
        }
        final String defaultValue = type.getDefaultValue();
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPIntPropertyType.java`
#### Snippet
```java
        }
        final String defaultValue = type.getDefaultValue();
        return !Strings.isNullOrEmpty(defaultValue) ? Integer.valueOf(defaultValue) : null;
    }
}
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPIntPropertyType.java`
#### Snippet
```java
    public Integer minValue() {
        if (type == null) {
            return null;
        }
        final NumericRange defaultRange = getDefaultNumericRange();
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPIntPropertyType.java`
#### Snippet
```java
        final NumericRange defaultRange = getDefaultNumericRange();
        final Double from = defaultRange != null ? defaultRange.getFrom() : null;
        return from != null ? from.intValue() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPIntPropertyType.java`
#### Snippet
```java
        final NumericRange defaultRange = getDefaultNumericRange();
        final Double to = defaultRange != null ? defaultRange.getTo() : null;
        return to != null ? to.intValue() : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPBooleanPropertyType.java`
#### Snippet
```java
    public Boolean defaultValue() {
        final String defaultValue = type.getDefaultValue();
        return !Strings.isNullOrEmpty(defaultValue) ? Boolean.valueOf(defaultValue) : null;
    }
}
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPPropertyType.java`
#### Snippet
```java
    protected NumericRange getDefaultNumericRange() {
        if (type == null || type.getNumericRanges() == null) {
            return null;
        }
        return type.getNumericRanges().stream()
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPDatePropertyType.java`
#### Snippet
```java
    public OffsetDateTime defaultValue() {
        if (type == null) {
            return null;
        }
        final String defaultValue = type.getDefaultValue();
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPDatePropertyType.java`
#### Snippet
```java
        }
        final String defaultValue = type.getDefaultValue();
        return !Strings.isNullOrEmpty(defaultValue) ? OffsetDateTime.parse(defaultValue) : null;
    }
}
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPIdentifierPropertyType.java`
#### Snippet
```java
    public String regexp() {
        //TODO when unomi supports this type
        return null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/types/output/property/CDPIdentifierPropertyType.java`
#### Snippet
```java
    @GraphQLField
    public String defaultValue() {
        return type != null ? type.getDefaultValue() : null;
    }
}
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/utils/DateUtils.java`
#### Snippet
```java
    public static LocalDate toLocalDate(final Date date) {
        if (date == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/utils/DateUtils.java`
#### Snippet
```java
    public static Date toDate(final OffsetDateTime offsetDateTime) {
        if (offsetDateTime == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/utils/DateUtils.java`
#### Snippet
```java
    public static OffsetDateTime offsetDateTimeFromMap(final Map<String, Object> parameterValues) {
        if (parameterValues == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/utils/DateUtils.java`
#### Snippet
```java
    public static OffsetDateTime toOffsetDateTime(final Date date) {
        if (date == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/CDPPropertyInterfaceRegister.java`
#### Snippet
```java
    public CDPPropertyInterface getProperty(final PropertyType type) {
        if (!properties.containsKey(type.getValueTypeId())) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/utils/ReflectionUtil.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/utils/ReflectionUtil.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
                return profile;
            } else {
                return null;
            }
        } else if (merge(previousProfile, profile)) {
```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
                return previousProfile;
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
    public Session saveSession(Session session) {
        if (session.getItemId() == null) {
            return null;
        }
        if (session.getProfile() != null && session.getProfile().getProperties() != null) {
```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
            session.getProfile().setProperties(removePersonalIdentifiersFromSessionProfile(session.getProfile().getProperties()));
        }
        return persistenceService.save(session) ? session : null;
    }

```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
    public Collection<PropertyType> getTargetPropertyTypes(String target) {
        if (target == null) {
            return null;
        }
        Collection<PropertyType> result = propertyTypes.getByTarget(target);
```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
    private Profile save(Profile profile, boolean forceRefresh) {
        if (profile.getItemId() == null) {
            return null;
        }
        profile.setSystemProperty("lastUpdated", new Date());
```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
            return profile;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
    public Set<PropertyType> getPropertyTypeByTag(String tag) {
        if (tag == null) {
            return null;
        }
        List<PropertyType> result = propertyTypes.getByTag(tag);
```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
        Persona persona = persistenceService.load(personaId, Persona.class);
        if (persona == null) {
            return null;
        }
        List<PersonaSession> sessions = persistenceService.query("profileId", persona.getItemId(), "timeStamp:desc", PersonaSession.class);
```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
    public Set<PropertyType> getPropertyTypeBySystemTag(String tag) {
        if (tag == null) {
            return null;
        }
        List<PropertyType> result = propertyTypes.getBySystemTag(tag);
```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
            return types.iterator().next().getMetadata().getId();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `services/src/main/java/org/apache/unomi/services/impl/profiles/ProfileServiceImpl.java`
#### Snippet
```java
            return personaToSave;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/scalars/GeoPointFunction.java`
#### Snippet
```java
                        return dataFetcherResult.toString();
                    }
                    return null;
                }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/scalars/GeoPointFunction.java`
#### Snippet
```java
                        return GeoPoint.fromString((String) input);
                    }
                    return null;
                }
            })
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/websocket/GraphQLMessage.java`
#### Snippet
```java
            return GraphQLObjectMapper.getInstance().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/websocket/GraphQLMessage.java`
#### Snippet
```java
            final JsonNode node = GraphQLObjectMapper.getInstance().readTree(textMessage);
            if (node == null || node.isMissingNode()) {
                return null;
            }
            final String id = node.path("id").asText(null);
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/servlet/websocket/GraphQLMessage.java`
#### Snippet
```java
            return builder.build();
        } catch (IOException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/RemoveAliasFromProfileCommand.java`
#### Snippet
```java
        ProfileAlias profileAlias = profileService.removeAliasFromProfile(profileIDInput.getId(), alias, profileIDInput.getClient().getId());

        return profileAlias != null ? new CDPProfileAlias(profileAlias) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/list/AddProfileToListCommand.java`
#### Snippet
```java

        if (userList == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/list/AddProfileToListCommand.java`
#### Snippet
```java

        if (profile == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/list/RemoveProfileFromListCommand.java`
#### Snippet
```java

        if (userList == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/commands/list/RemoveProfileFromListCommand.java`
#### Snippet
```java

        if (profile == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/TopicDataFetcher.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/CustomEventOrSetPropertyDataFetcher.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/CustomEventOrSetPropertyDataFetcher.java`
#### Snippet
```java
            return method.invoke(object);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/BaseDataFetcher.java`
#### Snippet
```java
        final Object param = environment.getArgument(name);
        if (param == null) {
            return null;
        }
        return GraphQLObjectMapper.getInstance().convertValue(param, clazz);
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/list/GetListDataFetcher.java`
#### Snippet
```java
        final UserList userList = serviceManager.getService(UserListService.class).load(listId);

        return userList != null ? new CDPList(UserListConverter.convertToUnomiList(userList)) : null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/event/EventDataFetcher.java`
#### Snippet
```java
        final Event event = eventService.getEvent(id);

        return event == null ? null : serviceManager.getService(CDPEventInterfaceRegister.class).getEvent(event);
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/profile/ProfileAliasDataFetcher.java`
#### Snippet
```java
        PersistenceService persistenceService = serviceManager.getService(PersistenceService.class);
        ProfileAlias profileAlias = persistenceService.load(alias, ProfileAlias.class);
        return profileAlias != null ? new CDPProfileAlias(profileAlias) : null;
    }
}
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/profile/ProfileDataFetcher.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/profile/ProfileInterestsDataFetcher.java`
#### Snippet
```java
                    final Double score = Double.parseDouble(interest.get("value").toString());
                    if (viewIds != null && !viewIds.isEmpty()) {
                        return viewIds.contains(topic) ? new CDPInterest(topic, score) : null;
                    }
                    return new CDPInterest(topic, score);
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/profile/ProfileListsDataFetcher.java`
#### Snippet
```java
        final Map<String, Object> systemProperties = profile.getSystemProperties();
        if (systemProperties == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/profile/ProfileListsDataFetcher.java`
#### Snippet
```java
        final List<String> listIds = (List<String>) systemProperties.get("lists");
        if (listIds == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/profile/ProfileListsDataFetcher.java`
#### Snippet
```java
        return stream.map(viewId -> {
            final UserList list = Iterables.tryFind(userLists, userList -> viewId.equals(userList.getItemId())).orNull();
            return list != null ? new CDPList(list) : null;
        }).filter(Objects::nonNull).collect(Collectors.toList());
    }
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/segment/SegmentDataFetcher.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/fetchers/segment/UnomiSegmentDataFetcher.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/providers/CompositeGraphQLFieldVisibility.java`
#### Snippet
```java
    public GraphQLInputObjectField getFieldDefinition(GraphQLInputFieldsContainer fieldsContainer, String fieldName) {
        if (providers == null) {
            return null;
        }
        List<GraphQLInputObjectField> list = providers.stream().
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/providers/CompositeGraphQLFieldVisibility.java`
#### Snippet
```java
        if (anyBlocks || noItems) {
            // some provider blocks it or none describes at all
            return null;
        } else {
            // return first as they are sorted by priority
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/providers/CompositeGraphQLFieldVisibility.java`
#### Snippet
```java
    public GraphQLFieldDefinition getFieldDefinition(GraphQLFieldsContainer fieldsContainer, String fieldName) {
        if (providers == null) {
            return null;
        }
        List<GraphQLFieldDefinition> list = providers.stream().
```

### ReturnNull
Return of `null`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/SourceEventPropertyConditionESQueryBuilder.java`
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
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/GeoLocationByPointSessionConditionESQueryBuilder.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaProvider.java`
#### Snippet
```java
        public String getTypeId() {
            if (firstNonNullType == null) {
                return null;
            }
            return firstNonNullType.getType();
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaProvider.java`
#### Snippet
```java
        if (typeStack.contains(name)) {
            logger.error("Loop detected when creating dynamic input types {} !" , typeStack);
            return null;
        }
        typeStack.push(name);
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaProvider.java`
#### Snippet
```java
        } else {
            typeStack.pop();
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/schema/GraphQLSchemaProvider.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/NestedConditionEvaluator.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/accessors/MapAccessor.java`
#### Snippet
```java
        Object mapValue = object.get(propertyName);
        if (mapValue == null) {
            return null;
        }
        if (leftoverExpression != null) {
```

### ReturnNull
Return of `null`
in `graphql/cxs-impl/src/main/java/org/apache/unomi/graphql/condition/factories/ProfileConditionFactory.java`
#### Snippet
```java
        }

        return notEmpty ? pastEventConditionBuilder.build() : null;
    }
}
```

### ReturnNull
Return of `null`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java
    protected static Date getDate(Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof Date) {
```

### ReturnNull
Return of `null`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java
                    @Override
                    public Object setup(Map context, Object target, Member member, String propertyName) {
                        return null;
                    }

```

### ReturnNull
Return of `null`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java
    private Object getSecond(Collection<?> collection) {
        if (collection == null) {
            return null;
        }
        if (collection.isEmpty()) {
```

### ReturnNull
Return of `null`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java
        }
        if (collection.isEmpty()) {
            return null;
        }
        Iterator<?> iterator = collection.iterator();
```

### ReturnNull
Return of `null`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java
                logger.debug("OGNL Off. Expression not evaluated on item {}: {}", item.getClass().getName(), expression);
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java
                logger.debug("OGNL expression filtered because not allowed: {}", expression);
            }
            return null;
        }
        OgnlContext ognlContext = getOgnlContext(secureFilteringClassLoader);
```

### ReturnNull
Return of `null`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java
                }

                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java
    private Object getFirst(Collection<?> collection) {
        if (collection == null) {
            return null;
        }
        if (collection.isEmpty()) {
```

### ReturnNull
Return of `null`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java
        }
        if (collection.isEmpty()) {
            return null;
        }
        Iterator<?> iterator = collection.iterator();
```

### ReturnNull
Return of `null`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionEvaluator.java`
#### Snippet
```java
            return iterator.next();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ProfileServiceEndPoint.java`
#### Snippet
```java
    @WebMethod(exclude = true)
    public PartialList<Session> findProfileSessions(String profileId) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ProfileServiceEndPoint.java`
#### Snippet
```java
        if (StringUtils.isBlank(tag) || StringUtils.isBlank(itemType)) {
            response.sendError(Response.Status.BAD_REQUEST.getStatusCode(), "Missing mandatory query parameters when requesting /cxs/profiles/existingProperties, mandatory query parameters are tag and itemType");
            return null;
        }
        Set<PropertyType> properties;
```

### ReturnNull
Return of `null`
in `extensions/privacy-extension/services/src/main/java/org/apache/unomi/privacy/internal/PrivacyServiceImpl.java`
#### Snippet
```java
    @Override
    public Boolean setDeniedPropertyDistribution(String profileId, List<String> propertyNames) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/privacy-extension/services/src/main/java/org/apache/unomi/privacy/internal/PrivacyServiceImpl.java`
#### Snippet
```java
        Profile profile = profileService.load(profileId);
        if (profile == null) {
            return null;
        }
        profile.setProperty("filteredEventTypes", eventTypes);
```

### ReturnNull
Return of `null`
in `extensions/privacy-extension/services/src/main/java/org/apache/unomi/privacy/internal/PrivacyServiceImpl.java`
#### Snippet
```java
        Profile profile = profileService.load(profileId);
        if (profile == null) {
            return null;
        }
        if (!profile.getProperties().containsKey(propertyName)) {
```

### ReturnNull
Return of `null`
in `extensions/privacy-extension/services/src/main/java/org/apache/unomi/privacy/internal/PrivacyServiceImpl.java`
#### Snippet
```java
    @Override
    public List<String> getDeniedPropertyDistribution(String profileId) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/privacy-extension/services/src/main/java/org/apache/unomi/privacy/internal/PrivacyServiceImpl.java`
#### Snippet
```java
    @Override
    public Boolean setDeniedProperties(String profileId, List<String> propertyNames) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `rest/src/main/java/org/apache/unomi/rest/server/provider/RetroCompatibilityParamConverterProvider.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionESQueryBuilder.java`
#### Snippet
```java
                }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugins/baseplugin/src/main/java/org/apache/unomi/plugins/baseplugin/conditions/PropertyConditionESQueryBuilder.java`
#### Snippet
```java
        List<Object> results = new ArrayList<>();
        if (datesValues == null) {
            return null;
        }
        for (Object dateValue : datesValues) {
```

### ReturnNull
Return of `null`
in `rest/src/main/java/org/apache/unomi/rest/endpoints/DefinitionsServiceEndPoint.java`
#### Snippet
```java
    public RESTConditionType getConditionType(@PathParam("conditionId") String id, @HeaderParam("Accept-Language") String language) {
        ConditionType conditionType = definitionsService.getConditionType(id);
        return conditionType != null ? localizationHelper.generateCondition(conditionType, language) : null;
    }

```

### ReturnNull
Return of `null`
in `rest/src/main/java/org/apache/unomi/rest/endpoints/DefinitionsServiceEndPoint.java`
#### Snippet
```java
    public RESTActionType getActionType(@PathParam("actionId") String id, @HeaderParam("Accept-Language") String language) {
        ActionType actionType = definitionsService.getActionType(id);
        return actionType != null ? localizationHelper.generateAction(actionType, language) : null;
    }

```

### ReturnNull
Return of `null`
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ContextJsonEndpoint.java`
#### Snippet
```java
                    logger.debug("Scripting detected in context request with value {}, filtering out...", value);
                }
                return null;
            } else {
                return stringValue;
```

### ReturnNull
Return of `null`
in `rest/src/main/java/org/apache/unomi/rest/endpoints/ContextJsonEndpoint.java`
#### Snippet
```java
                newParameterValues.put(parameterEntry.getKey(), parameterEntry.getValue());
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `rest/src/main/java/org/apache/unomi/rest/service/impl/ResourceBundleHelper.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/router/router-core/src/main/java/org/apache/unomi/router/core/event/UpdateCamelRouteEventHandler.java`
#### Snippet
```java
    @Override
    public Switch getSwitch() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `api/src/main/java/org/apache/unomi/api/Item.java`
#### Snippet
```java
            logger.error("Error resolving itemType for class " + clazz.getName(), e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyHelper.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyHelper.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `persistence-spi/src/main/java/org/apache/unomi/persistence/spi/PropertyHelper.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `api/src/main/java/org/apache/unomi/api/PersonaWithSessions.java`
#### Snippet
```java
    @XmlTransient
    public PersonaSession getLastSession() {
        return sessions.size()>0?sessions.get(0):null;
    }
}
```

### ReturnNull
Return of `null`
in `api/src/main/java/org/apache/unomi/api/GeoPoint.java`
#### Snippet
```java
    public static GeoPoint fromString(final String input) {
        if (input == null || input.trim().length() == 0) {
            return null;
        }
        final String[] parts = input.split(",");
```

### ReturnNull
Return of `null`
in `api/src/main/java/org/apache/unomi/api/Event.java`
#### Snippet
```java
            properties = (Map) properties.get(property);
            if (properties == null) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `api/src/main/java/org/apache/unomi/api/Profile.java`
#### Snippet
```java
            properties = (Map) properties.get(property);
            if (properties == null) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `samples/tweet-button-plugin/src/main/java/org/apache/unomi/samples/tweet_button_plugin/actions/IncrementTweetNumberAction.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `scripting/src/main/java/org/apache/unomi/scripting/internal/ExpressionFilterFactoryImpl.java`
#### Snippet
```java
            return patterns;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `scripting/src/main/java/org/apache/unomi/scripting/ExpressionFilter.java`
#### Snippet
```java
            }

            return null;
        }
        if (allowedExpressionPatterns != null && !expressionMatches(expression, allowedExpressionPatterns)) {
```

### ReturnNull
Return of `null`
in `scripting/src/main/java/org/apache/unomi/scripting/ExpressionFilter.java`
#### Snippet
```java
            }

            return null;
        }
        return expression;
```

### ReturnNull
Return of `null`
in `extensions/json-schema/rest/src/main/java/org/apache/unomi/schema/rest/JsonSchemaEndPoint.java`
#### Snippet
```java
            return schema.getSchema().replace("\n", "");
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `scripting/src/main/java/org/apache/unomi/scripting/MvelScriptExecutor.java`
#### Snippet
```java
                return MVEL.executeExpression(mvelExpressions.get(script), context);
            } else {
                return null;
            }
        } finally {
```

### ReturnNull
Return of `null`
in `extensions/json-schema/services/src/main/java/org/apache/unomi/schema/impl/SchemaServiceImpl.java`
#### Snippet
```java
                    if (jsonSchemaWrapper == null) {
                        logger.error("Couldn't find schema {}", uri);
                        return null;
                    }

```

### ReturnNull
Return of `null`
in `extensions/json-schema/services/src/main/java/org/apache/unomi/schema/impl/SchemaServiceImpl.java`
#### Snippet
```java
    public JsonSchemaWrapper getSchemaForEventType(String eventType) {
        if (StringUtils.isEmpty(eventType)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `extensions/weather-update/core/src/main/java/org/apache/unomi/weatherupdate/actions/WeatherUpdateAction.java`
#### Snippet
```java
        }
        logger.info("API Response doesn't contains the temperature");
        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/weather-update/core/src/main/java/org/apache/unomi/weatherupdate/actions/WeatherUpdateAction.java`
#### Snippet
```java
        }
        logger.warn("API Response doesn't contains the weather description");
        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/weather-update/core/src/main/java/org/apache/unomi/weatherupdate/actions/WeatherUpdateAction.java`
#### Snippet
```java
        }
        logger.warn("API Response doesn't contains the wind direction");
        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/weather-update/core/src/main/java/org/apache/unomi/weatherupdate/actions/WeatherUpdateAction.java`
#### Snippet
```java
        }
        logger.info("API Response doesn't contains the wind speed");
        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/HttpUtils.java`
#### Snippet
```java
        } catch (UnsupportedEncodingException e) {
            logger.error("Error when executing request", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/HttpUtils.java`
#### Snippet
```java
        } catch (IOException e) {
            logger.error("Error when executing request", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/HttpUtils.java`
#### Snippet
```java
                EntityUtils.consumeQuietly(response.getEntity());
                logger.error("Error when communicating with MailChimp server, response code was {} and response message was {}", statusCode, response.getStatusLine().getReasonPhrase());
                return null;
            }

```

### ReturnNull
Return of `null`
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/HttpUtils.java`
#### Snippet
```java
                    EntityUtils.consumeQuietly(response.getEntity());
                    logger.error("Error when parsing entity response", e);
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/HttpUtils.java`
#### Snippet
```java
                EntityUtils.consumeQuietly(response.getEntity());
                logger.error("Error when parsing response with ObjectMapper", e);
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/HttpUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/internal/MailChimpServiceImpl.java`
#### Snippet
```java
        if (currentMergeFields == null || !currentMergeFields.has(MERGE_FIELDS)) {
            logger.error("Can't find merge_fields from the response, the response was {}", currentMergeFields);
            return null;
        }

```

### ReturnNull
Return of `null`
in `extensions/unomi-mailchimp/services/src/main/java/org/apache/unomi/mailchimp/services/internal/MailChimpServiceImpl.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
    public Map<String, Object> getLimits() {
        if (!isConnected()) {
            return null;
        }
        String baseUrl = null;
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            Object responseObject = handleRequest(get);
            if (responseObject == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
                return (Map<String, Object>) responseObject;
            }
            return null;
        } catch (UnsupportedEncodingException e) {
            logger.error("Error retrieving Salesforce API Limits", e);
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        } catch (UnsupportedEncodingException e) {
            logger.error("Error retrieving Salesforce API Limits", e);
            return null;
        } catch (ClientProtocolException e) {
            logger.error("Error retrieving Salesforce API Limits", e);
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        } catch (ClientProtocolException e) {
            logger.error("Error retrieving Salesforce API Limits", e);
            return null;
        } catch (IOException e) {
            logger.error("Error retrieving Salesforce API Limits", e);
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        } catch (IOException e) {
            logger.error("Error retrieving Salesforce API Limits", e);
            return null;
        } catch (HttpException e) {
            logger.error("Error retrieving Salesforce API Limits", e);
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        } catch (HttpException e) {
            logger.error("Error retrieving Salesforce API Limits", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
    public String createOrUpdateLead(Profile profile) {
        if (!isConnected()) {
            return null;
        }
        // first we must check if an existing contact exists for the profile.
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            logger.info("Contact {}  found in SFDC... No SFDC field value to send, will not send anything to " +
                    "Salesforce. ", unomiIdentifierValue);
            return null;
        }
        // then we must check if an existing lead exists for the profile.
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            logger.info("No SFDC field value to send, will not send anything to Salesforce.");
            if (foundExistingSfdcLeadIds.size() == 0) {
                return null;
            } else {
                return foundExistingSfdcLeadIds.iterator().next();
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            }
            if (missingMandatoryFields) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            Object responseObject = handleRequest(request);
            if (responseObject == null) {
                return null;
            }
            if (responseObject instanceof Map) {
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java

        if (foundExistingSfdcLeadIds.size() == 0) {
            return null;
        } else {
            return foundExistingSfdcLeadIds.iterator().next();
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
    public SFDCConfiguration loadConfiguration() {
        if (persistenceService == null) {
            return null;
        }
        SFDCConfiguration sfdcConfiguration = persistenceService.load("sfdcConfiguration", SFDCConfiguration.class);
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
    public Map<String, Object> getSObject(String sobjectName, String objectId) {
        if (!isConnected()) {
            return null;
        }
        Map<String, Object> sobjectMap = new LinkedHashMap<>();
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            if (responseObject == null) {
                logger.warn("Couldn't retrieve sobject {} with id {}", sobjectName, objectId);
                return null;
            }
            Map<String, Object> queryResponse = (Map<String, Object>) responseObject;
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        Set<String> mandatoryFields = new TreeSet<>();
        if (!isConnected()) {
            return null;
        }
        Map<String, Object> leadDescribe = getSObjectDescribe("Lead");
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
    public Map<String, Object> query(String query) {
        if (!isConnected()) {
            return null;
        }
        // first we must check if an existing lead exists for the profile.
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            Object responseObject = handleRequest(get);
            if (responseObject == null) {
                return null;
            }
            if (responseObject != null && responseObject instanceof Map) {
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
                return (Map<String, Object>) responseObject;
            }
            return null;
        } catch (UnsupportedEncodingException e) {
            logger.error("Error executing query {}", query, e);
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        } catch (UnsupportedEncodingException e) {
            logger.error("Error executing query {}", query, e);
            return null;
        } catch (ClientProtocolException e) {
            logger.error("Error executing query {}", query, e);
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        } catch (ClientProtocolException e) {
            logger.error("Error executing query {}", query, e);
            return null;
        } catch (IOException e) {
            logger.error("Error executing query {}", query, e);
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        } catch (IOException e) {
            logger.error("Error executing query {}", query, e);
            return null;
        } catch (HttpException e) {
            logger.error("Error executing query {}", query, e);
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        } catch (HttpException e) {
            logger.error("Error executing query {}", query, e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        Map<String, Object> sobjectDescribe = new LinkedHashMap<>();
        if (!isConnected()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            if (responseObject == null) {
                logger.warn("Couldn't retrieve sobject {} describe", sobjectName);
                return null;
            }
            Map<String, Object> queryResponse = (Map<String, Object>) responseObject;
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        if (sfdcSession == null) {
            logger.error("Invalid session !");
            return null;
        }
        logger.info("Login successful!\nServer URL: " + sfdcSession.getEndPoint()
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            if (sfdcSession == null) {
                logger.error("Couldn't get a valid session !");
                return null;
            }
            if (request.containsHeader("Authorization")) {
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
                if (!loginSuccessful) {
                    logger.error("Login failed, cannot execute request {}", request);
                    return null;
                }
                logger.warn("Retrying request {} once again...", request);
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
                }
            }
            return null;
        }
        if (response.getEntity() == null) {
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        }
        if (response.getEntity() == null) {
            return null;
        }
        return JSON.parse(EntityUtils.toString(response.getEntity()));
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
    public Set<String> getRecentLeadIds() {
        if (!isConnected()) {
            return null;
        }
        Set<String> recentLeadIds = new LinkedHashSet<>();
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            if (responseObject == null) {
                logger.warn("Couldn't retrieve recent leads");
                return null;
            }
            Map<String, Object> queryResponse = (Map<String, Object>) responseObject;
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        } catch (HttpException e) {
            logger.error("Error logging in", e);
            return null;
        } catch (IOException e) {
            logger.error("Error logging in", e);
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
        } catch (IOException e) {
            logger.error("Error logging in", e);
            return null;
        }
        return null;
```

### ReturnNull
Return of `null`
in `extensions/salesforce-connector/services/src/main/java/org/apache/unomi/sfdc/services/internal/SFDCServiceImpl.java`
#### Snippet
```java
            return null;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
        Map<String, Object> propertyMapping = getPropertyMapping(name, itemType);
        if (propertyMapping == null) {
            return null;
        }
        if (propertyMapping != null
```

### ReturnNull
Return of `null`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                            return value;
                        } else {
                            return null;
                        }
                    }
```

### ReturnNull
Return of `null`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                    if (ese.status().equals(RestStatus.NOT_FOUND)) {
                        // this can happen if we are just testing the existence of the item, it is not always an error.
                        return null;
                    }
                    throw new Exception("Error loading itemType=" + clazz.getName() + " customItemType=" + customItemType + " itemId=" + itemId, ese);
```

### ReturnNull
Return of `null`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                } catch (IndexNotFoundException e) {
                    // this can happen if we are just testing the existence of the item, it is not always an error.
                    return null;
                } catch (Exception ex) {
                    throw new Exception("Error loading itemType=" + clazz.getName() + " customItemType=" + customItemType + " itemId=" + itemId, ex);
```

### ReturnNull
Return of `null`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                                    }
                                }
                                return null;
                            }
                        }.execute();
```

### ReturnNull
Return of `null`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                    if (tTemp instanceof IllegalStateException && Arrays.stream(this.fatalIllegalStateErrors).anyMatch(tTemp.getMessage()::contains)) {
                        handleFatalStateError(); // Stop application
                        return null;
                    }
                    tTemp = tTemp.getCause();
```

### ReturnNull
Return of `null`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                handleError(t, logError);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                    client.close();
                }
                return null;
            }
        }.catchingExecuteInClassLoader(true);
```

### ReturnNull
Return of `null`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                    sslContext.init(null, new TrustManager[]{new X509TrustManager() {
                        public X509Certificate[] getAcceptedIssuers() {
                            return null;
                        }

```

### ReturnNull
Return of `null`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
                return "text";
            default:
                return null;
        }
    }
```

### ReturnNull
Return of `null`
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
    private <T extends Item> T load(final String itemId, final Class<T> clazz, final String customItemType) {
        if (StringUtils.isEmpty(itemId)) {
            return null;
        }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `initialDelay` is redundant
in `services/src/main/java/org/apache/unomi/services/impl/scheduler/SchedulerServiceImpl.java`
#### Snippet
```java

        Duration duration = Duration.between(now, nextRun);
        long initialDelay = duration.getSeconds();
        return initialDelay;
    }
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
Local variable `result` is redundant
in `persistence-elasticsearch/core/src/main/java/org/apache/unomi/persistence/elasticsearch/ElasticSearchPersistenceServiceImpl.java`
#### Snippet
```java
            return new ArrayList<>();

        List<String> result = new InClassLoaderExecute<List<String>>(metricsService, this.getClass().getName() + ".updateItems", this.bundleContext, this.fatalIllegalStateErrors, throwExceptions) {
            protected List<String> execute(Object... args) throws Exception {
                long batchRequestStartTime = System.currentTimeMillis();
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

