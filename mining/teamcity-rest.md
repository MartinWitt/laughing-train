# teamcity-rest 
 
# Bad smells
I found 1719 bad smells with 191 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| MissortedModifiers | 283 | false |
| ReturnNull | 251 | false |
| NotNullFieldNotInitialized | 222 | false |
| UnnecessaryFullyQualifiedName | 95 | false |
| DataFlowIssue | 75 | false |
| RedundantSuppression | 75 | false |
| BoundedWildcard | 64 | false |
| UNUSED_IMPORT | 55 | false |
| DefaultAnnotationParam | 50 | false |
| Convert2MethodRef | 44 | false |
| SizeReplaceableByIsEmpty | 39 | true |
| UnnecessaryToStringCall | 37 | true |
| ConstantValue | 33 | false |
| RedundantFieldInitialization | 31 | false |
| CodeBlock2Expr | 30 | true |
| CommentedOutCode | 24 | false |
| UtilityClassWithoutPrivateConstructor | 22 | true |
| UnnecessaryModifier | 21 | true |
| MissingDeprecatedAnnotation | 18 | false |
| AssignmentToMethodParameter | 16 | false |
| UnusedAssignment | 14 | false |
| ZeroLengthArrayInitialization | 12 | false |
| InnerClassMayBeStatic | 12 | true |
| UnnecessaryStringEscape | 10 | true |
| NonProtectedConstructorInAbstractClass | 10 | true |
| EmptyMethod | 9 | false |
| DynamicRegexReplaceableByCompiledPattern | 9 | false |
| ProtectedMemberInFinalClass | 8 | true |
| StaticCallOnSubclass | 7 | false |
| NullableProblems | 7 | false |
| UnnecessaryBoxing | 7 | false |
| ReplaceAssignmentWithOperatorAssignment | 6 | false |
| MismatchedCollectionQueryUpdate | 6 | false |
| DeprecatedIsStillUsed | 6 | false |
| SuspiciousMethodCalls | 6 | false |
| RedundantMethodOverride | 5 | false |
| Contract | 5 | false |
| UnnecessarySemicolon | 5 | false |
| UnnecessaryCallToStringValueOf | 5 | false |
| StringEqualsEmptyString | 5 | false |
| ConditionCoveredByFurtherCondition | 5 | false |
| NullArgumentToVariableArgMethod | 4 | false |
| Convert2Lambda | 4 | false |
| KeySetIterationMayUseEntrySet | 3 | false |
| DuplicateBranchesInSwitch | 3 | false |
| IfStatementWithIdenticalBranches | 3 | false |
| NestedAssignment | 3 | false |
| StringBufferReplaceableByStringBuilder | 3 | false |
| BoxingBoxedValue | 3 | false |
| WrapperTypeMayBePrimitive | 2 | false |
| AssignmentToStaticFieldFromInstanceMethod | 2 | false |
| LongLiteralsEndingWithLowercaseL | 2 | false |
| UnnecessaryQualifierForThis | 2 | false |
| EqualsBetweenInconvertibleTypes | 2 | false |
| FunctionalExpressionCanBeFolded | 2 | false |
| UnnecessarySuperQualifier | 2 | false |
| RedundantStringFormatCall | 2 | false |
| ComparatorCombinators | 2 | false |
| ComparatorMethodParameterNotUsed | 2 | false |
| BusyWait | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| EnumSwitchStatementWhichMissesCases | 1 | false |
| PointlessArithmeticExpression | 1 | false |
| SortedCollectionWithNonComparableKeys | 1 | false |
| RegExpRedundantEscape | 1 | false |
| ObsoleteCollection | 1 | false |
| CastToIncompatibleInterface | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| MismatchedStringBuilderQueryUpdate | 1 | false |
| IgnoreResultOfCall | 1 | false |
| AccessStaticViaInstance | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| SimplifiableBooleanExpression | 1 | false |
| ExtendsAnnotation | 1 | false |
| EqualsAndHashcode | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| SynchronizeOnThis | 1 | false |
| NonFinalFieldOfException | 1 | false |
| ReplaceInefficientStreamCount | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| Anonymous2MethodRef | 1 | false |
| Java8MapApi | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| CopyConstructorMissesField | 1 | false |
| CastCanBeRemovedNarrowingVariableType | 1 | false |
| NumericOverflow | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[knownDimensions.size()\]'
in `src/jetbrains/buildServer/server/rest/data/finder/FinderImpl.java`
#### Snippet
```java
    knownDimensions.add(OPTIONS_REPORT_ERROR_ON_NOTHING_FOUND);
    knownDimensions.add(CONTEXT_ITEM_DIMENSION_NAME); //experimental, internal
    return knownDimensions.toArray(new String[knownDimensions.size()]);
  }

```

## RuleId[id=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch` statement on enum type 'jetbrains.buildServer.server.rest.data.problem.scope.TestScopeType' misses cases: 'PROJECT', 'BUILD_TYPE', and 'BUILD'
in `src/jetbrains/buildServer/server/rest/data/problem/scope/TestScope.java`
#### Snippet
```java
  @Nullable
  public String getName() {
    switch (myType) {
      case SUITE:
        return mySuite;
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `src/jetbrains/buildServer/server/rest/data/problem/scope/TestScopesCollector.java`
#### Snippet
```java
  @NotNull
  public PagedSearchResult<TestScope> getPagedItems(@NotNull Locator locator) {
    Long count = locator.getSingleDimensionValueAsLong(PagerData.COUNT, DEFAULT_COUNT);
    Long start = locator.getSingleDimensionValueAsLong(PagerData.START);

```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/jetbrains/buildServer/server/rest/data/finder/impl/MuteFinder.java`
#### Snippet
```java
        // no dimensions found, assume it's id
        try {
          Long value = Long.valueOf(dimension);
          return Collections.singletonList(findMuteById(value.intValue()));
        } catch (NumberFormatException nfe) {
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/jetbrains/buildServer/server/rest/model/files/FileApiUrlBuilder.java`
#### Snippet
```java
public interface FileApiUrlBuilder {
  @NotNull
  public String getMetadataHref(@Nullable Element element);

  @NotNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/jetbrains/buildServer/server/rest/model/files/FileApiUrlBuilder.java`
#### Snippet
```java

  @NotNull
  public String getContentHref(@Nullable Element element);

  @NotNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/jetbrains/buildServer/server/rest/model/files/FileApiUrlBuilder.java`
#### Snippet
```java

  @NotNull
  public String getChildrenHref(@Nullable Element element);

  @NotNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/jetbrains/buildServer/server/rest/model/files/FileApiUrlBuilder.java`
#### Snippet
```java

  @NotNull
  public String getUrlPathPrefix();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/jetbrains/buildServer/server/rest/util/StringPool.java`
#### Snippet
```java
   */
  @Contract("null -> null, !null -> !null")
  public String reuse(@Nullable String value);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/jetbrains/buildServer/server/graphql/model/connections/PaginationArguments.java`
#### Snippet
```java

  @NotNull
  public Direction getDirection();

  static PaginationArguments everything() {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/jetbrains/buildServer/server/graphql/model/connections/PaginationArguments.java`
#### Snippet
```java
  public String getAfter();

  public int getCount();

  @NotNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/jetbrains/buildServer/server/graphql/model/connections/PaginationArguments.java`
#### Snippet
```java
public interface PaginationArguments {
  @Nullable
  public String getAfter();

  public int getCount();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/jetbrains/buildServer/server/graphql/model/connections/PaginationArguments.java`
#### Snippet
```java
  }

  public enum Direction {
    FORWARD, BACKWARD;
  }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java
    public M get(final @Nullable String locator, final @NotNull Fields fields, final @NotNull BeanContext beanContext);

    public void replaceAll(final @NotNull M newEntities, final @NotNull ServiceLocator serviceLocator);

    ParametersPersistableEntity getParametersHolder(final @NotNull String featureLocator);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java

    @NotNull
    public M get(final @Nullable String locator, final @NotNull Fields fields, final @NotNull BeanContext beanContext);

    public void replaceAll(final @NotNull M newEntities, final @NotNull ServiceLocator serviceLocator);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java
     */
    @NotNull
    public String add(final @NotNull S entityToAdd, final @NotNull ServiceLocator serviceLocator);

    @NotNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java
    public S getSingle(final @NotNull String featureLocator, final @NotNull Fields fields, final @NotNull BeanContext beanContext);

    public void delete(final @NotNull String featureLocator, final @NotNull ServiceLocator serviceLocator);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java

  interface Entity<M, S> {
    public void persist();

    @NotNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java

    @NotNull
    public S getSingle(final @NotNull String featureLocator, final @NotNull Fields fields, final @NotNull BeanContext beanContext);

    public void delete(final @NotNull String featureLocator, final @NotNull ServiceLocator serviceLocator);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java
     */
    @NotNull
    public String replace(final @NotNull String featureLocator, final @NotNull S newFeature, final @NotNull ServiceLocator serviceLocator);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/jetbrains/buildServer/server/graphql/model/connections/ExtensibleConnection.java`
#### Snippet
```java
  }

  public interface Edge<T> {
    @NotNull
    DataFetcherResult<T> getNode();
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ProjectFinder.java`
#### Snippet
```java


  public static enum SelectedByUserMode {
    SELECTED, //those which are selected on Overview, in the order these were configured on Overview (this order can be different from the current hierarchy order)
    SELECTED_WITH_ORDER, //experimental! those which are selected on Overview, in hierarchy-defined order and selected order for siblings within hierarchy
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/jetbrains/buildServer/server/rest/model/agent/Compatibility.java`
#### Snippet
```java
    SBuildType getBuildType();

    public boolean isCompatible();

    @Nullable
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/jetbrains/buildServer/server/graphql/model/connections/PaginationArgumentsProvider.java`
#### Snippet
```java
  PaginationArguments getLastPage();

  public enum FallbackBehaviour {
    RETURN_EVERYTHING,
    RETURN_FIRST_PAGE
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/jetbrains/buildServer/server/rest/request/FilesSubResource.java`
#### Snippet
```java
     * @param response true if the request is processed and response is complete. false if the response is not written into and the processing should be continued
     */
    public boolean processDownload(@NotNull Element element, @NotNull HttpServletRequest request, @NotNull HttpServletResponse response);
  }

```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`0 + count` can be replaced with 'count'
in `src/jetbrains/buildServer/server/rest/model/PagerDataImpl.java`
#### Snippet
```java
        nextHref = null;
      } else {
        nextHref = getModifiedBuilder(uriBuilder, 0 + count, count, locatorText, locatorQueryParameterName);
      }
    } else {
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `getPropertiesHref()` declared in class 'jetbrains.buildServer.server.rest.request.FeatureSubResource' but referenced via subclass 'jetbrains.buildServer.server.rest.request.ProjectFeatureSubResource'
in `src/jetbrains/buildServer/server/rest/model/project/PropEntityProjectFeature.java`
#### Snippet
```java
                                  @NotNull final Fields fields, @NotNull final BeanContext beanContext) {
    String featureHref = ProjectRequest.getFeatureHref(project, descriptor);
    init(descriptor.getId(), null, descriptor.getType(), null, null, featureHref, descriptor.getParameters(), ProjectFeatureSubResource.getPropertiesHref(featureHref),
         fields, beanContext);
  }
```

### StaticCallOnSubclass
Static method `setSetting()` declared in class 'jetbrains.buildServer.server.rest.model.buildType.PropEntity' but referenced via subclass 'jetbrains.buildServer.server.rest.model.buildType.PropEntityStep'
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
      throw new BadRequestException("Could not get field of a requirement which does not have id");
    }
    PropEntityStep.setSetting(buildType.get(), id, name, newValue);
    buildType.persist("Agent requirement settings changed");
    return PropEntityStep.getSetting(buildType.get(), id, name);
```

### StaticCallOnSubclass
Static method `getSetting()` declared in class 'jetbrains.buildServer.server.rest.model.buildType.PropEntity' but referenced via subclass 'jetbrains.buildServer.server.rest.model.buildType.PropEntityStep'
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
    PropEntityStep.setSetting(buildType.get(), id, name, newValue);
    buildType.persist("Agent requirement settings changed");
    return PropEntityStep.getSetting(buildType.get(), id, name);
  }

```

### StaticCallOnSubclass
Static method `setSetting()` declared in class 'jetbrains.buildServer.server.rest.model.buildType.PropEntity' but referenced via subclass 'jetbrains.buildServer.server.rest.model.buildType.PropEntityArtifactDep'
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
    final BuildTypeOrTemplate buildType = myBuildTypeFinder.getBuildTypeOrTemplate(null, buildTypeLocator, true);
    final SArtifactDependency dep = getArtifactDependency(buildType, artifactDepLocator);
    PropEntityArtifactDep.setSetting(buildType.get(), dep.getId(), name, newValue);
    buildType.persist("Artifact dependency settings changed");
    return PropEntityArtifactDep.getSetting(buildType.get(), dep.getId(), name);
```

### StaticCallOnSubclass
Static method `getSetting()` declared in class 'jetbrains.buildServer.server.rest.model.buildType.PropEntity' but referenced via subclass 'jetbrains.buildServer.server.rest.model.buildType.PropEntityArtifactDep'
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
    PropEntityArtifactDep.setSetting(buildType.get(), dep.getId(), name, newValue);
    buildType.persist("Artifact dependency settings changed");
    return PropEntityArtifactDep.getSetting(buildType.get(), dep.getId(), name);
  }

```

### StaticCallOnSubclass
Static method `getSetting()` declared in class 'jetbrains.buildServer.server.rest.model.buildType.PropEntity' but referenced via subclass 'jetbrains.buildServer.server.rest.model.buildType.PropEntityStep'
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
      throw new BadRequestException("Could not get field of a requirement which does not have id");
    }
    return PropEntityStep.getSetting(buildType.get(), id, name);
  }

```

### StaticCallOnSubclass
Static method `getSetting()` declared in class 'jetbrains.buildServer.server.rest.model.buildType.PropEntity' but referenced via subclass 'jetbrains.buildServer.server.rest.model.buildType.PropEntityArtifactDep'
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
    final BuildTypeOrTemplate buildType = myBuildTypeFinder.getBuildTypeOrTemplate(null, buildTypeLocator, true);
    final SArtifactDependency dep = getArtifactDependency(buildType, artifactDepLocator);
    return PropEntityArtifactDep.getSetting(buildType.get(), dep.getId(), name);
  }

```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/jetbrains/buildServer/server/rest/data/DataProvider.java`
#### Snippet
```java
      agentPoolManager.moveAgentTypesToPool(agentPoolId, Collections.singleton(agentTypeId)); //this moves the entire agent type to the pool, not only the agent, TW-40502
    } catch (NoSuchAgentPoolException e) {
      throw new IllegalStateException("Agent pool with id \'" + agentPoolId + "' is not found.");
    } catch (PoolQuotaExceededException e) {
      throw new IllegalStateException(e.getMessage());
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
      agentPoolManager.dissociateProjectsFromPool(agentPoolId, Collections.singleton(project.getProjectId()));
    } catch (NoSuchAgentPoolException e) {
      throw new BadRequestException("Agent pool with id \'" + agentPoolId + "' is not found.");
    }
  }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
      myServiceLocator.getSingletonService(AgentPoolManager.class).deleteAgentPool(agentPool.getAgentPoolId());
    } catch (NoSuchAgentPoolException e) {
      throw new BadRequestException("Agent pool with id \'" + agentPool.getAgentPoolId() + "' does not exist.", e);
    } catch (AgentPoolCannotBeDeletedException e) {
      throw new BadRequestException("Cannot delete agent pool with id \'" + agentPool.getAgentPoolId() + "'.", e);
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
      throw new BadRequestException("Agent pool with id \'" + agentPool.getAgentPoolId() + "' does not exist.", e);
    } catch (AgentPoolCannotBeDeletedException e) {
      throw new BadRequestException("Cannot delete agent pool with id \'" + agentPool.getAgentPoolId() + "'.", e);
    }
  }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
      agentPoolManager.associateProjectsWithPool(agentPoolId, projectIds);
    } catch (NoSuchAgentPoolException e) {
      throw new BadRequestException("Agent pool with id \'" + agentPoolId + "' is not found.");
    }
    return new Projects(myAgentPoolFinder.getPoolProjects(agentPool), null, Fields.LONG, myBeanContext);
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
      newAgentPool = myServiceLocator.getSingletonService(AgentPoolManager.class).createNewAgentPool(agentPool.name, agentDetails);
    } catch (AgentPoolCannotBeRenamedException e) {
      throw new BadRequestException("Agent pool with name \'" + agentPool.name + "' already exists.");
    }
    if (agentPool.projects != null){
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
      agentPoolManager.dissociateProjectsFromPool(agentPoolId, agentPoolManager.getPoolProjects(agentPoolId));
    } catch (NoSuchAgentPoolException e) {
      throw new BadRequestException("Agent pool with id \'" + agentPoolId + "' is not found.");
    }
  }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
      agentPoolManager.associateProjectsWithPool(agentPoolId, Collections.singleton(postedProject.getProjectId()));
    } catch (NoSuchAgentPoolException e) {
      throw new BadRequestException("Agent pool with id \'" + agentPoolId + "' is not found.");
    }
    return new Project(postedProject, Fields.LONG, myBeanContext);
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
      agentPoolManager.associateProjectsWithPool(agentPoolId, singleton(project.getProjectId()));
    } catch (NoSuchAgentPoolException e) {
      throw new BadRequestException("Agent pool with id \'" + agentPoolId + "' is not found.");
    }
    return new AgentPool(agentPoolFromPosted, Fields.LONG, myBeanContext);
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
      agentPoolManager.dissociateProjectsFromPool(agentPoolId, singleton(project.getProjectId()));
    } catch (NoSuchAgentPoolException e) {
      throw new BadRequestException("Agent pool with id \'" + agentPoolId + "' is not found.");
    }
  }
```

## RuleId[id=SortedCollectionWithNonComparableKeys]
### SortedCollectionWithNonComparableKeys
Construction of sorted collection with non-comparable elements
in `src/jetbrains/buildServer/server/rest/data/problem/ProblemWrapper.java`
#### Snippet
```java
  public List<MuteInfo> getMutes() { //this returns not full mute data, but only confined to the problem (MuteInfo.getBuildProblemIds() will not return all the problems affected by the mute)
    if (mutes == null) {
      Set<MuteInfo> mutesSet = new TreeSet<MuteInfo>();
      final SProject rootProject = myServiceLocator.getSingletonService(ProjectManager.class).getRootProject();
      final CurrentMuteInfo currentMuteInfo = myServiceLocator.getSingletonService(ProblemMutingService.class).getBuildProblemCurrentMuteInfo(rootProject.getProjectId(), id);
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `LOG` from instance context
in `src/jetbrains/buildServer/server/rest/jersey/ExtensionsAwareResourceConfig.java`
#### Snippet
```java
  public ExtensionsAwareResourceConfig(@NotNull final APIController controller, @SuppressWarnings("SpringJavaAutowiringInspection") final ServerPluginInfo pluginDescriptor) {
    myController = controller;
    LOG = Logger.getInstance(ExtensionsAwareResourceConfig.class.getName() + "/" + pluginDescriptor.getPluginName());
  }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `OUR_FIRST_BIND_PATH` from instance context
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java
      throw new RuntimeException(message);
    }
    OUR_FIRST_BIND_PATH = unfilteredOriginalBindPaths.get(0);

    final List<String> originalBindPaths = filterOtherPlugins(unfilteredOriginalBindPaths);
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (23 lines)
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java
  }

  //private static <T> StringBuilder compare(@NotNull final String entityName, @Nullable final Collection<T> a, @Nullable final Collection<T> b,
  //                                         @NotNull final String fieldPrefix, @NotNull final DiffCalculator<T> diffCalculator) {
  //  StringBuilder result = new StringBuilder();
```

### CommentedOutCode
Commented out code (2 lines)
in `src/jetbrains/buildServer/server/rest/model/change/VcsRoot.java`
#### Snippet
```java


  /*
  @XmlAttribute
  private String currentVersion;
```

### CommentedOutCode
Commented out code (2 lines)
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootFinder.java`
#### Snippet
```java

        if (personalSupportService != null) {
//          if (null != personalSupportService.mapPath(Arrays.asList(new VcsSettings(root, "")), repositoryIdStringWithoutType, true).getMappedPath())
//          return true;
          List<Boolean> canAffectList = personalSupportService.canAffect(Arrays.asList(new VcsSettings(root, "")), Collections.singletonList(repositoryIdStringWithoutType), true);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/jetbrains/buildServer/server/rest/jersey/JacksonObjectMapperResolver.java`
#### Snippet
```java
    LOG.debug("Using own customized ObjectMapper for class '" + type.getCanonicalName() + "'");

//    final String name = type.getPackage().getName();
//    return name.startsWith("jetbrains.buildServer.server.rest") ? myMapper : null;

```

### CommentedOutCode
Commented out code (3 lines)
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Project.java`
#### Snippet
```java
      if (TeamCityProperties.getBoolean("rest.cctray.extendedActivity")) {

//        if (myBuildType.isInQueue()) {
//            return "Waiting in queue"; // non standard, makes cctray hanging
//        }
```

### CommentedOutCode
Commented out code (18 lines)
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java
  }

  //@GET
  //@Path("/{featureLocator}/{setting}")
  //@Produces({"text/plain"})
```

### CommentedOutCode
Commented out code (11 lines)
in `src/jetbrains/buildServer/server/rest/request/MuteRequest.java`
#### Snippet
```java
  }

  /*
  public static String getHref(@NotNull final ProblemWrapper problem) {
    return getHref(MuteFinder.getLocator(problem));
```

### CommentedOutCode
Commented out code (14 lines)
in `src/jetbrains/buildServer/server/rest/data/finder/impl/MuteFinder.java`
#### Snippet
```java
  }

  /*
  @NotNull
  public static String getLocator(@NotNull final SBuildType buildType) {
```

### CommentedOutCode
Commented out code (6 lines)
in `src/jetbrains/buildServer/server/rest/data/finder/impl/MuteFinder.java`
#### Snippet
```java
  }

  /*
  @NotNull
  private Stream<MuteInfo> getMutes(@Nullable final CurrentMuteInfo currentMuteInfo) {
```

### CommentedOutCode
Commented out code (6 lines)
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ProjectFinder.java`
#### Snippet
```java
      AgentPoolFinder agentPoolFinder = myServiceLocator.getSingletonService(AgentPoolFinder.class);
      // streams API alternative
      //Optional<Set<String>> filterProjectInternalIds = poolDimensions.stream().
      //  map(poolLocator -> agentPoolFinder.getItems(poolLocator).myEntries.stream().flatMap(pool -> pool.getProjectIds().stream()).collect(Collectors.toSet())).
      //  reduce((projectIds, projectIds2) -> projectIds.stream().filter(projectIds2::contains).collect(Collectors.toSet()));
```

### CommentedOutCode
Commented out code (5 lines)
in `src/jetbrains/buildServer/server/rest/model/agent/AgentPool.java`
#### Snippet
```java
      resultLocator.setDimension(AgentPoolFinder.ID.name, String.valueOf(id));
    }
    /*
    //todo: implement this in finder!
    if (name != null) {
```

### CommentedOutCode
Commented out code (8 lines)
in `src/jetbrains/buildServer/server/rest/data/problem/ProblemOccurrenceFinder.java`
#### Snippet
```java
    }
    return fillIsNew(myBuildProblemManager.getCurrentBuildProblemsList(project), null);
    /*
    final List<BuildProblem> currentBuildProblemsList = myBuildProblemManager.getCurrentBuildProblemsList(project);

```

### CommentedOutCode
Commented out code (4 lines)
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
    throw new NotFoundException("No build can be found by number '" + buildNumber + "' in the build type with id '" + buildType.getExternalId() + "'");

    /*
    final BuildPromotion singleItem = findSingleItem(locator);
    if (singleItem != null) { //will find it the regular way, go for it with all due checks
```

### CommentedOutCode
Commented out code (16 lines)
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
  }

  /*
  @GET
  @Path("/{projectLocator}/readOnlyUI/value")
```

### CommentedOutCode
Commented out code (9 lines)
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
        }

        //@Override
        //public String setSetting(@NotNull final String featureLocator, @NotNull final String settingName, @Nullable final String newValue) {
        //  return null;
```

### CommentedOutCode
Commented out code (10 lines)
in `src/jetbrains/buildServer/server/rest/data/problem/TestOccurrenceFinder.java`
#### Snippet
```java
  @Nullable
  public STestRun findSingleItem(@NotNull final Locator locator) {
    /*
    if (locator.isSingleValue()) {
      Long idDimension = locator.getSingleValueAsLong();
```

### CommentedOutCode
Commented out code (26 lines)
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
   *   curl -H "Transfer-Encoding: chunked" -H "Content-Type: text/plain" -X POST -T -  .../app/rest/runningBuilds/XXX/log/stream
   */
  /*
  @POST
  @Path("/{buildLocator}/log/stream")
```

### CommentedOutCode
Commented out code (11 lines)
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
  }

  /*
  //this seems to have no sense as there is no way to retrieve a list of values without registered value provider
  //can also add delete to workaround issues like https://youtrack.jetbrains.com/issue/TW-61084
```

### CommentedOutCode
Commented out code (10 lines)
in `src/jetbrains/buildServer/server/rest/model/audit/AuditAction.java`
#### Snippet
```java
  }

  /*
  @NotNull
  private String getLog4jObjectDescription(@NotNull final AuditLogAction action) {
```

### CommentedOutCode
Commented out code (4 lines)
in `src/jetbrains/buildServer/server/rest/model/audit/AuditAction.java`
#### Snippet
```java
    pattern = ValueWithDefault.decideDefault(fields.isIncluded("pattern", false, true), actionType::getDescription);

    /*
    text = ValueWithDefault.decideDefault(fields.isIncluded("text", false, false),
                                          () -> AuditUtil.formatAdditionalObjects(getLog4jObjectDescription(action),
```

### CommentedOutCode
Commented out code (11 lines)
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
  }

  ///**
  // * Experimental support only
  // */
```

### CommentedOutCode
Commented out code (19 lines)
in `src/jetbrains/buildServer/server/rest/request/InvestigationRequest.java`
#### Snippet
```java
  }

  /*
  @GET
  @Path("/{investigationLocator}/{field}")
```

### CommentedOutCode
Commented out code (62 lines)
in `src/jetbrains/buildServer/server/rest/data/finder/FinderImpl.java`
#### Snippet
```java
  }

  /*
  @NotNull
  private FinderDataBinding.LocatorDataBinding<ITEM> getItemsAnd(@NotNull final List<String> itemsDimension) {
```

### CommentedOutCode
Commented out code (4 lines)
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
  //============================= Main definition methods =============================

  //public AbstractTypedFinder<ITEM> description(@NotNull final String description) {
  //  myDescription = description;
  //  return this;
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java

  static final Comparator<ArtifactTreeElement> ARTIFACT_COMPARATOR = new ArtifactsComparator();
  private static final Pattern SLASHES_OR_SPACE_PATTERN = Pattern.compile("[\\/ ]", Pattern.LITERAL);


```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Vector<>` used
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java
      @Override
      public Enumeration<String> getInitParameterNames() {
        return new Vector<>(initParameters.keySet()).elements();
      }
    };
```

## RuleId[id=CastToIncompatibleInterface]
### CastToIncompatibleInterface
Cast to incompatible interface `CoroutineContext`
in `src/jetbrains/buildServer/server/graphql/GraphQLProvider.java`
#### Snippet
```java
    return SchemaParser.newParser()
                .schemaString(sdl)
                .options(SchemaParserOptions.newOptions().coroutineContext((CoroutineContext) ExecutorsKt.from(myExecutor)).build())
                .resolvers(
                  myQuery,
```

## RuleId[id=LongLiteralsEndingWithLowercaseL]
### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `src/jetbrains/buildServer/server/rest/data/problem/TestCountersData.java`
#### Snippet
```java
  private Integer myNewFailed = 0;
  @Nullable
  private Long myDuration = 0l;

  public TestCountersData() { }
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `src/jetbrains/buildServer/server/rest/data/problem/TestCountersData.java`
#### Snippet
```java
    if (calcIgnored) myIgnored = 0;
    if (calcNewFailure) myNewFailed = 0;
    if (calcDuration) myDuration = 0l;

    for(STestRun testRun : testRuns) {
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `valuesMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/jetbrains/buildServer/server/rest/model/metrics/MetricValues.java`
#### Snippet
```java
        Fields nestedFields = fields.getNestedField("metricValues");
        final List<jetbrains.buildServer.server.rest.model.metrics.MetricValue> result = new ArrayList<>();
        for (MetricValueKey key : valuesMap.keySet()) {
          result.add(new jetbrains.buildServer.server.rest.model.metrics.MetricValue(key, valuesMap.get(key), nestedFields));
        }
```

### KeySetIterationMayUseEntrySet
Iteration over `tagsMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/jetbrains/buildServer/server/rest/model/metrics/MetricTags.java`
#### Snippet
```java
      () -> {
        final List<MetricTag> result = new ArrayList<>();
        for (String name : tagsMap.keySet()) {
          result.add(new MetricTag(name, tagsMap.get(name)));
        }
```

### KeySetIterationMayUseEntrySet
Iteration over `myItemsConditions.keySet()` may be replaced with 'entrySet()' iteration
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
      }

      for (DimensionCondition conditions : myItemsConditions.keySet()) {
        if (conditions.complies(locator)) {
          ItemsFromDimensions<ITEM> itemsFromDimensions = myItemsConditions.get(conditions);
```

## RuleId[id=NotNullFieldNotInitialized]
### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/data/RangeLimit.java`
#### Snippet
```java
public class RangeLimit {
  @Nullable private SBuild myBuild;
  @NotNull private Date myDate;

  public RangeLimit(@NotNull final SBuild build) {
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/issue/Issue.java`
#### Snippet
```java
@ModelDescription("Represents an issue related to the specific change.")
public class Issue {
  @NotNull protected jetbrains.buildServer.issueTracker.Issue myIssue;

  public Issue() {
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/issue/IssueUsages.java`
#### Snippet
```java
  @NotNull private SBuild myBuild;
  @NotNull private Fields myFields;
  @NotNull private BeanContext myBeanContext;

  public IssueUsages() {
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/issue/IssueUsages.java`
#### Snippet
```java
  @Nullable private Collection<Issue> myIssues;
  @NotNull private SBuild myBuild;
  @NotNull private Fields myFields;
  @NotNull private BeanContext myBeanContext;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/issue/IssueUsages.java`
#### Snippet
```java
public class IssueUsages{
  @Nullable private Collection<Issue> myIssues;
  @NotNull private SBuild myBuild;
  @NotNull private Fields myFields;
  @NotNull private BeanContext myBeanContext;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/model/mutation/UnassignProjectBuildTypesFromAgentInput.java`
#### Snippet
```java
  private int myAgentRawId;

  @NotNull
  private String myProjectRawId;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/build/VcsLabel.java`
#### Snippet
```java
  @NotNull
  private Fields myFields;
  @NotNull
  private BeanContext myBeanContext;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/build/VcsLabel.java`
#### Snippet
```java
  @NotNull
  private jetbrains.buildServer.serverSide.vcs.VcsLabel myRealLabel;
  @NotNull
  private Fields myFields;
  @NotNull
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/build/VcsLabel.java`
#### Snippet
```java
)
public class VcsLabel {
  @NotNull
  private jetbrains.buildServer.serverSide.vcs.VcsLabel myRealLabel;
  @NotNull
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/RequestPathTransformInfo.java`
#### Snippet
```java
@Component
public class RequestPathTransformInfo implements PathTransformator {
  @NotNull
  private Map<String, String> myPathMapping;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/issue/IssueUsage.java`
#### Snippet
```java
  private SBuild myBuild;
  @NotNull private Fields myFields;
  @NotNull private BeanContext myBeanContext;

  public IssueUsage() {
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/issue/IssueUsage.java`
#### Snippet
```java
  private jetbrains.buildServer.issueTracker.Issue myIssue;
  private SBuild myBuild;
  @NotNull private Fields myFields;
  @NotNull private BeanContext myBeanContext;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/model/mutation/AssignProjectBuildTypesWithAgentInput.java`
#### Snippet
```java
public class AssignProjectBuildTypesWithAgentInput {
  private int myAgentRawId;
  @NotNull
  private String myProjectRawId;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/Query.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private PaginationArgumentsProvider myPaginationArgumentsProvider;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/Query.java`
#### Snippet
```java
public class Query implements GraphQLQueryResolver {
  @Autowired
  @NotNull
  private Finder<SBuildAgent> myAgentFinder;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/Query.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private AgentPoolManager myAgentPoolManager;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/Query.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private AbstractAgentPoolFactory myPoolFactory;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/Query.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private ProjectManager myProjectManager;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  private Fields myFields = Fields.LONG;

  @NotNull
  private BeanContext myBeanContext;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  protected BuildTypeOrTemplate myBuildType;

  @NotNull
  private String myExternalId;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/change/Changes.java`
#### Snippet
```java
  @Nullable private CachingValue<List<SVcsModificationOrChangeDescriptor>> myModifications;
  @Nullable private PagerData myPagerData;
  @NotNull private Fields myFields;
  @NotNull private BeanContext myBeanContext;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/change/Changes.java`
#### Snippet
```java
  @Nullable private PagerData myPagerData;
  @NotNull private Fields myFields;
  @NotNull private BeanContext myBeanContext;

  public static final String CHANGE = "change";
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/Mutation.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private BuildTypeFinder myBuildTypeFinder;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/Mutation.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private ProjectFinder myProjectFinder;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/Mutation.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private AgentPoolManager myAgentPoolManager;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/Mutation.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private AbstractAgentPoolFactory myAgentPoolFactory;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/Mutation.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private BuildAgentManagerEx myBuildAgentManager;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/Mutation.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private AgentTypeManager myAgentTypeManager;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/CloudImageResolver.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private AgentTypeManager myAgentTypeManager;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/CloudImageResolver.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private AgentPoolManager myAgentPoolManager;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/CloudImageResolver.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private ProjectManager myProjectManager;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/CloudImageResolver.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private AgentTypeFinder myAgentTypeFinder;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/RESTControllerExtensionAdapter.java`
#### Snippet
```java
 */
public abstract class RESTControllerExtensionAdapter implements RESTControllerExtension{
  @NotNull
  private ConfigurableApplicationContext myContext;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/model/mutation/UnassignBuildTypeFromAgentInput.java`
#### Snippet
```java
  private int myAgentRawId;

  @NotNull
  private String myBuildTypeRawId;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/build/approval/UserApprovalRuleStatus.java`
#### Snippet
```java
  @NotNull protected ApprovalRule myApprovalRule;
  @NotNull protected Fields myFields;
  @NotNull protected BeanContext myBeanContext;
  @NotNull protected ApprovableBuildManager myApprovableBuildManager;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/build/approval/UserApprovalRuleStatus.java`
#### Snippet
```java
public class UserApprovalRuleStatus {
  @NotNull protected BuildPromotionEx myBuildPromotionEx;
  @NotNull protected ApprovalRule myApprovalRule;
  @NotNull protected Fields myFields;
  @NotNull protected BeanContext myBeanContext;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/build/approval/UserApprovalRuleStatus.java`
#### Snippet
```java
@XmlRootElement(name = "userApprovalRule")
public class UserApprovalRuleStatus {
  @NotNull protected BuildPromotionEx myBuildPromotionEx;
  @NotNull protected ApprovalRule myApprovalRule;
  @NotNull protected Fields myFields;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/build/approval/UserApprovalRuleStatus.java`
#### Snippet
```java
  @NotNull protected Fields myFields;
  @NotNull protected BeanContext myBeanContext;
  @NotNull protected ApprovableBuildManager myApprovableBuildManager;

  public UserApprovalRuleStatus(
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/build/approval/UserApprovalRuleStatus.java`
#### Snippet
```java
  @NotNull protected BuildPromotionEx myBuildPromotionEx;
  @NotNull protected ApprovalRule myApprovalRule;
  @NotNull protected Fields myFields;
  @NotNull protected BeanContext myBeanContext;
  @NotNull protected ApprovableBuildManager myApprovableBuildManager;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/GroupRequest.java`
#### Snippet
```java
  @Context @NotNull private UserFinder myUserFinder;
  @Context @NotNull private DataUpdater myDataUpdater;
  @Context @NotNull private BeanContext myBeanContext;

  public static final String API_USER_GROUPS_URL = Constants.API_URL + "/userGroups";
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/GroupRequest.java`
#### Snippet
```java
  @Context @NotNull private UserGroupFinder myUserGroupFinder;
  @Context @NotNull private UserFinder myUserFinder;
  @Context @NotNull private DataUpdater myDataUpdater;
  @Context @NotNull private BeanContext myBeanContext;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/GroupRequest.java`
#### Snippet
```java
@Api("Group")
public class GroupRequest {
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private UserGroupFinder myUserGroupFinder;
  @Context @NotNull private UserFinder myUserFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/GroupRequest.java`
#### Snippet
```java
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private UserGroupFinder myUserGroupFinder;
  @Context @NotNull private UserFinder myUserFinder;
  @Context @NotNull private DataUpdater myDataUpdater;
  @Context @NotNull private BeanContext myBeanContext;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/GroupRequest.java`
#### Snippet
```java
public class GroupRequest {
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private UserGroupFinder myUserGroupFinder;
  @Context @NotNull private UserFinder myUserFinder;
  @Context @NotNull private DataUpdater myDataUpdater;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ChangeRequest.java`
#### Snippet
```java

  private static final String DEFAULT_CHANGES_LOOKUP_LIMIT_FOR_COMMITERS = "1000";
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private ChangeFinder myChangeFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ChangeRequest.java`
#### Snippet
```java
  @Context @NotNull private ChangeFinder myChangeFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private TestScopeTreeCollector myTestScopeTreeCollector;
  @Context @NotNull private ProblemOccurrencesTreeCollector myProblemOccurrencesTreeCollector;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ChangeRequest.java`
#### Snippet
```java
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private TestScopeTreeCollector myTestScopeTreeCollector;
  @Context @NotNull private ProblemOccurrencesTreeCollector myProblemOccurrencesTreeCollector;

  public static String getChangeHref(SVcsModification modification) {
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ChangeRequest.java`
#### Snippet
```java
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private ChangeFinder myChangeFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private TestScopeTreeCollector myTestScopeTreeCollector;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ChangeRequest.java`
#### Snippet
```java
  private static final String DEFAULT_CHANGES_LOOKUP_LIMIT_FOR_COMMITERS = "1000";
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private ChangeFinder myChangeFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ChangeRequest.java`
#### Snippet
```java
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private ChangeFinder myChangeFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private TestScopeTreeCollector myTestScopeTreeCollector;
  @Context @NotNull private ProblemOccurrencesTreeCollector myProblemOccurrencesTreeCollector;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ProblemOccurrenceRequest.java`
#### Snippet
```java
public class ProblemOccurrenceRequest {
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private ProblemOccurrenceFinder myProblemOccurrenceFinder;
  @Context @NotNull private ProblemOccurrencesTreeCollector myProblemOccurrencesTreeCollector;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ProblemOccurrenceRequest.java`
#### Snippet
```java
@Api("ProblemOccurrence")
public class ProblemOccurrenceRequest {
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private ProblemOccurrenceFinder myProblemOccurrenceFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ProblemOccurrenceRequest.java`
#### Snippet
```java
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private ProblemOccurrenceFinder myProblemOccurrenceFinder;
  @Context @NotNull private ProblemOccurrencesTreeCollector myProblemOccurrencesTreeCollector;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private BeanFactory myFactory;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ProblemOccurrenceRequest.java`
#### Snippet
```java
  @Context @NotNull private ProblemOccurrencesTreeCollector myProblemOccurrencesTreeCollector;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private BeanFactory myFactory;

  public static final String API_SUB_URL = Constants.API_URL + "/problemOccurrences";
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ProblemOccurrenceRequest.java`
#### Snippet
```java
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private ProblemOccurrenceFinder myProblemOccurrenceFinder;
  @Context @NotNull private ProblemOccurrencesTreeCollector myProblemOccurrencesTreeCollector;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ProblemOccurrenceRequest.java`
#### Snippet
```java
  @Context @NotNull private ProblemOccurrenceFinder myProblemOccurrenceFinder;
  @Context @NotNull private ProblemOccurrencesTreeCollector myProblemOccurrencesTreeCollector;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private BeanFactory myFactory;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/BuildQueueRequest.java`
#### Snippet
```java
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;

  @NotNull
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/BuildQueueRequest.java`
#### Snippet
```java
  public static final String API_BUILD_QUEUE_URL = Constants.API_URL + "/buildQueue";
  public static final String COMPATIBLE_AGENTS = "/compatibleAgents";
  @Context @NotNull private QueuedBuildFinder myQueuedBuildFinder;
  @Context @NotNull private BuildPromotionFinder myBuildPromotionFinder;
  @Context @NotNull private AgentFinder myAgentFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/BuildQueueRequest.java`
#### Snippet
```java
  public static final String COMPATIBLE_AGENTS = "/compatibleAgents";
  @Context @NotNull private QueuedBuildFinder myQueuedBuildFinder;
  @Context @NotNull private BuildPromotionFinder myBuildPromotionFinder;
  @Context @NotNull private AgentFinder myAgentFinder;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/BuildQueueRequest.java`
#### Snippet
```java
  @Context @NotNull private AgentFinder myAgentFinder;

  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/BuildQueueRequest.java`
#### Snippet
```java
  @Context @NotNull private QueuedBuildFinder myQueuedBuildFinder;
  @Context @NotNull private BuildPromotionFinder myBuildPromotionFinder;
  @Context @NotNull private AgentFinder myAgentFinder;

  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/BuildQueueRequest.java`
#### Snippet
```java

  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/AgentBuildTypeEdgeResolver.java`
#### Snippet
```java
public class AgentBuildTypeEdgeResolver implements GraphQLResolver<AgentBuildTypeEdge> {
  @Autowired
  @NotNull
  private BuildTypeFinder myBuildTypeFinder;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/AgentBuildTypeEdgeResolver.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private BuildAgentManager myAgentManager;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/UserRequest.java`
#### Snippet
```java
public class UserRequest {
  public static final String API_USERS_URL = Constants.API_URL + "/users";
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private UserFinder myUserFinder;
  @Context @NotNull private DataUpdater myDataUpdater;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/UserRequest.java`
#### Snippet
```java
  @Context @NotNull private UserFinder myUserFinder;
  @Context @NotNull private DataUpdater myDataUpdater;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private BeanContext myBeanContext;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/UserRequest.java`
#### Snippet
```java
  public static final String API_USERS_URL = Constants.API_URL + "/users";
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private UserFinder myUserFinder;
  @Context @NotNull private DataUpdater myDataUpdater;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/UserRequest.java`
#### Snippet
```java
  @Context @NotNull private DataUpdater myDataUpdater;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private BeanContext myBeanContext;

  public static String getUserHref(@NotNull final jetbrains.buildServer.users.User user) {
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/UserRequest.java`
#### Snippet
```java
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private UserFinder myUserFinder;
  @Context @NotNull private DataUpdater myDataUpdater;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private BeanContext myBeanContext;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/build/approval/ApprovalInfo.java`
#### Snippet
```java
  @NotNull private Fields myFields;
  @NotNull private BeanContext myBeanContext;
  @NotNull private ApprovableBuildManager myApprovableBuildManager;
  @NotNull private Boolean myApprovalFeatureEnabled;
  @Nullable private ApprovalBuildFeatureConfiguration myConfiguration;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/build/approval/ApprovalInfo.java`
#### Snippet
```java
  @NotNull private BuildPromotionEx myBuildPromotionEx;
  @NotNull private Fields myFields;
  @NotNull private BeanContext myBeanContext;
  @NotNull private ApprovableBuildManager myApprovableBuildManager;
  @NotNull private Boolean myApprovalFeatureEnabled;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/build/approval/ApprovalInfo.java`
#### Snippet
```java
  @NotNull private BeanContext myBeanContext;
  @NotNull private ApprovableBuildManager myApprovableBuildManager;
  @NotNull private Boolean myApprovalFeatureEnabled;
  @Nullable private ApprovalBuildFeatureConfiguration myConfiguration;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/build/approval/ApprovalInfo.java`
#### Snippet
```java
public class ApprovalInfo {
  @NotNull private BuildPromotionEx myBuildPromotionEx;
  @NotNull private Fields myFields;
  @NotNull private BeanContext myBeanContext;
  @NotNull private ApprovableBuildManager myApprovableBuildManager;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/build/approval/ApprovalInfo.java`
#### Snippet
```java
@ModelDescription("Represents approval status for this build, if applicable.")
public class ApprovalInfo {
  @NotNull private BuildPromotionEx myBuildPromotionEx;
  @NotNull private Fields myFields;
  @NotNull private BeanContext myBeanContext;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/HealthRequest.java`
#### Snippet
```java
  @Context
  HealthItemFinder myHealthItemFinder;
  @NotNull
  @Context
  private BeanContext myBeanContext;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/HealthRequest.java`
#### Snippet
```java
  @NotNull
  public static final String API_SUB_URL = Constants.API_URL + "/health";
  @NotNull
  @Context
  HealthItemFinder myHealthItemFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ChangeLogRequest.java`
#### Snippet
```java
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private BuildPromotionFinder myBuildPromotionFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private ProjectFinder myProjectFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ChangeLogRequest.java`
#### Snippet
```java
  public static final String API_CHANGE_LOG_URL = Constants.API_URL + "/changeLog";
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private BuildPromotionFinder myBuildPromotionFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ChangeLogRequest.java`
#### Snippet
```java
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private BuildPromotionFinder myBuildPromotionFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private ProjectFinder myProjectFinder;
  @Context @NotNull private ChangeLogBeanCollector myChangeLogBeanCollector;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ChangeLogRequest.java`
#### Snippet
```java
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private ProjectFinder myProjectFinder;
  @Context @NotNull private ChangeLogBeanCollector myChangeLogBeanCollector;

  @GET
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ChangeLogRequest.java`
#### Snippet
```java
public class ChangeLogRequest {
  public static final String API_CHANGE_LOG_URL = Constants.API_URL + "/changeLog";
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private BuildPromotionFinder myBuildPromotionFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ChangeLogRequest.java`
#### Snippet
```java
  @Context @NotNull private BuildPromotionFinder myBuildPromotionFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private ProjectFinder myProjectFinder;
  @Context @NotNull private ChangeLogBeanCollector myChangeLogBeanCollector;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/AuditRequest.java`
#### Snippet
```java
  public AuditEventFinder myAuditEventFinder;
  @Context
  @NotNull
  public BeanContext myBeanContext;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/AuditRequest.java`
#### Snippet
```java
  public static final String API_URL = Constants.API_URL + "/audit";
  @Context
  @NotNull
  public AuditEventFinder myAuditEventFinder;
  @Context
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/MuteRequest.java`
#### Snippet
```java
  @Context @NotNull private MuteFinder myMuteFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private BeanContext myBeanContext;

  public static final String API_SUB_URL = Constants.API_URL + "/mutes";
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/MuteRequest.java`
#### Snippet
```java
public class MuteRequest {
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private MuteFinder myMuteFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private BeanContext myBeanContext;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/MuteRequest.java`
#### Snippet
```java
@Api("Mute")
public class MuteRequest {
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private MuteFinder myMuteFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/MuteRequest.java`
#### Snippet
```java
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private MuteFinder myMuteFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private BeanContext myBeanContext;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/RootApiRequest.java`
#### Snippet
```java
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private ProjectFinder myProjectFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull public BeanContext myBeanContext;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/RootApiRequest.java`
#### Snippet
```java
  @Context @NotNull private BuildFinder myBuildFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private ProjectFinder myProjectFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull public BeanContext myBeanContext;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/RootApiRequest.java`
#### Snippet
```java
  public static final String VERSION = "/version";
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private BuildFinder myBuildFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private ProjectFinder myProjectFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/RootApiRequest.java`
#### Snippet
```java
  @Context @NotNull private ProjectFinder myProjectFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull public BeanContext myBeanContext;

  @GET
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/RootApiRequest.java`
#### Snippet
```java
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private BuildFinder myBuildFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private ProjectFinder myProjectFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/RootApiRequest.java`
#### Snippet
```java
  public static final String API_VERSION = "/apiVersion";
  public static final String VERSION = "/version";
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private BuildFinder myBuildFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
@Api("AgentPool")
public class AgentPoolRequest {
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private ServiceLocator myServiceLocator;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private AgentPoolFinder myAgentPoolFinder;
  @Context @NotNull private ProjectFinder myProjectFinder;
  @Context @NotNull private AgentFinder myAgentFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
  @Context @NotNull private AgentPoolFinder myAgentPoolFinder;
  @Context @NotNull private ProjectFinder myProjectFinder;
  @Context @NotNull private AgentFinder myAgentFinder;

  public static final String API_AGENT_POOLS_URL = Constants.API_URL + "/agentPools";
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private AgentPoolFinder myAgentPoolFinder;
  @Context @NotNull private ProjectFinder myProjectFinder;
  @Context @NotNull private AgentFinder myAgentFinder;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private AgentPoolFinder myAgentPoolFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private AgentPoolFinder myAgentPoolFinder;
  @Context @NotNull private ProjectFinder myProjectFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
public class AgentPoolRequest {
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ServerRequest.java`
#### Snippet
```java
  private BeanContext myBeanContext;

  @SuppressWarnings("NullableProblems") @Context @NotNull
  private PermissionChecker myPermissionChecker;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ServerRequest.java`
#### Snippet
```java
  private BeanFactory myFactory;

  @SuppressWarnings("NullableProblems") @Context @NotNull
  private BeanContext myBeanContext;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/request/CCTrayRequest.java`
#### Snippet
```java
public class CCTrayRequest {
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;

  @GET
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/request/CCTrayRequest.java`
#### Snippet
```java
@Singleton
public class CCTrayRequest {
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/RoleRequest.java`
#### Snippet
```java
  @Context private ServiceLocator myServiceLocator;
  @Context @NotNull public PermissionChecker myPermissionChecker;
  @Context @NotNull private BeanContext myBeanContext;

  public static String getRoleHref(jetbrains.buildServer.serverSide.auth.Role role) {
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/RoleRequest.java`
#### Snippet
```java
  public static final String API_SUB_URL = Constants.API_URL + "/roles";
  @Context private ServiceLocator myServiceLocator;
  @Context @NotNull public PermissionChecker myPermissionChecker;
  @Context @NotNull private BeanContext myBeanContext;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ProblemRequest.java`
#### Snippet
```java
  @Context @NotNull private ProblemFinder myProblemFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private BeanContext myBeanContext;

  public static final String API_SUB_URL = Constants.API_URL + "/problems";
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ProblemRequest.java`
#### Snippet
```java
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private ProblemFinder myProblemFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private BeanContext myBeanContext;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ProblemRequest.java`
#### Snippet
```java
@Api("Problem")
public class ProblemRequest {
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private ProblemFinder myProblemFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ProblemRequest.java`
#### Snippet
```java
public class ProblemRequest {
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private ProblemFinder myProblemFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private BeanContext myBeanContext;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/TestScopesRequest.java`
#### Snippet
```java
  public static final String API_SUB_URL = Constants.API_URL + "/testScopes";
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private TestScopesCollector myTestScopesCollector;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/TestScopesRequest.java`
#### Snippet
```java
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private TestScopesCollector myTestScopesCollector;
  @Context @NotNull private TestScopeTreeCollector myTestScopeTreeCollector;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/TestScopesRequest.java`
#### Snippet
```java
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private TestScopesCollector myTestScopesCollector;
  @Context @NotNull private TestScopeTreeCollector myTestScopeTreeCollector;

  // Very highly experimental
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/TestScopesRequest.java`
#### Snippet
```java
public class TestScopesRequest {
  public static final String API_SUB_URL = Constants.API_URL + "/testScopes";
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/TestScopesRequest.java`
#### Snippet
```java
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private TestScopesCollector myTestScopesCollector;
  @Context @NotNull private TestScopeTreeCollector myTestScopeTreeCollector;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/VcsRootRequest.java`
#### Snippet
```java
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull public PermissionChecker myPermissionChecker;

  public static final String API_VCS_ROOTS_URL = Constants.API_URL + "/vcs-roots";
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/VcsRootRequest.java`
#### Snippet
```java
  @Context @NotNull private VcsRootInstanceFinder myVcsRootInstanceFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull public PermissionChecker myPermissionChecker;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/VcsRootRequest.java`
#### Snippet
```java
public class VcsRootRequest {
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private ProjectFinder myProjectFinder;
  @Context @NotNull private VcsRootFinder myVcsRootFinder;
  @Context @NotNull private VcsRootInstanceFinder myVcsRootInstanceFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/VcsRootRequest.java`
#### Snippet
```java
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private ProjectFinder myProjectFinder;
  @Context @NotNull private VcsRootFinder myVcsRootFinder;
  @Context @NotNull private VcsRootInstanceFinder myVcsRootInstanceFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/VcsRootRequest.java`
#### Snippet
```java
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull public PermissionChecker myPermissionChecker;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/VcsRootRequest.java`
#### Snippet
```java
@Api("VcsRoot")
public class VcsRootRequest {
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private ProjectFinder myProjectFinder;
  @Context @NotNull private VcsRootFinder myVcsRootFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/VcsRootRequest.java`
#### Snippet
```java
  @Context @NotNull private ProjectFinder myProjectFinder;
  @Context @NotNull private VcsRootFinder myVcsRootFinder;
  @Context @NotNull private VcsRootInstanceFinder myVcsRootInstanceFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private ServiceLocator myServiceLocator;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/VcsRootRequest.java`
#### Snippet
```java
  @Context @NotNull private VcsRootFinder myVcsRootFinder;
  @Context @NotNull private VcsRootInstanceFinder myVcsRootInstanceFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/AvatarRequest.java`
#### Snippet
```java

  @Context @NotNull private UserFinder myUserFinder;
  @Context @NotNull private UserAvatarsManager myUserAvatarsManager;

  @GET
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/AvatarRequest.java`
#### Snippet
```java
  private static final int MAX_AVATAR_SIZE = 300;

  @Context @NotNull private UserFinder myUserFinder;
  @Context @NotNull private UserAvatarsManager myUserAvatarsManager;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/AgentRequest.java`
#### Snippet
```java
  private ApiUrlBuilder myApiUrlBuilder;
  @Context
  @NotNull
  private AgentPoolFinder myAgentPoolFinder;
  @Context
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/AgentRequest.java`
#### Snippet
```java
  private AgentFinder myAgentFinder;
  @Context
  @NotNull
  private ServiceLocator myServiceLocator;
  @Context
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/AgentRequest.java`
#### Snippet
```java
  private ServiceLocator myServiceLocator;
  @Context
  @NotNull
  private BeanContext myBeanContext;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/AgentRequest.java`
#### Snippet
```java
  private AgentPoolFinder myAgentPoolFinder;
  @Context
  @NotNull
  private AgentFinder myAgentFinder;
  @Context
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/CloudRequest.java`
#### Snippet
```java
  @Context private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private CloudInstanceFinder myCloudInstanceFinder;
  @Context @NotNull private CloudImageFinder myCloudImageFinder;
  @Context @NotNull private CloudProfileFinder myCloudProfileFinder;
  @Context @NotNull private ServiceLocator myServiceLocator;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/CloudRequest.java`
#### Snippet
```java
  @Context @NotNull private CloudImageFinder myCloudImageFinder;
  @Context @NotNull private CloudProfileFinder myCloudProfileFinder;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/CloudRequest.java`
#### Snippet
```java
public class CloudRequest {
  @Context private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private CloudInstanceFinder myCloudInstanceFinder;
  @Context @NotNull private CloudImageFinder myCloudImageFinder;
  @Context @NotNull private CloudProfileFinder myCloudProfileFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/CloudRequest.java`
#### Snippet
```java
  @Context @NotNull private CloudProfileFinder myCloudProfileFinder;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;

  public static final String API_CLOUD_URL = Constants.API_URL + "/cloud";
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/CloudRequest.java`
#### Snippet
```java
  @Context @NotNull private CloudInstanceFinder myCloudInstanceFinder;
  @Context @NotNull private CloudImageFinder myCloudImageFinder;
  @Context @NotNull private CloudProfileFinder myCloudProfileFinder;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanContext myBeanContext;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/problem/TestOccurrence.java`
#### Snippet
```java
  private static final Logger LOG = Logger.getInstance(TestOccurrence.class.getName());

  @NotNull private BeanContext myBeanContext;
  @NotNull private Fields myFields;
  @NotNull private STestRun myTestRun;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/problem/TestOccurrence.java`
#### Snippet
```java
  @NotNull private BeanContext myBeanContext;
  @NotNull private Fields myFields;
  @NotNull private STestRun myTestRun;
  private final FieldInclusionChecker myChecker = FieldInclusionChecker.getForClass(TestOccurrence.class);

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/problem/TestOccurrence.java`
#### Snippet
```java

  @NotNull private BeanContext myBeanContext;
  @NotNull private Fields myFields;
  @NotNull private STestRun myTestRun;
  private final FieldInclusionChecker myChecker = FieldInclusionChecker.getForClass(TestOccurrence.class);
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/TestRequest.java`
#### Snippet
```java
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private TestFinder myTestFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private BeanFactory myBeanFactory;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/TestRequest.java`
#### Snippet
```java
  @Context @NotNull private TestFinder myTestFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private BeanFactory myBeanFactory;

  public static final String API_SUB_URL = Constants.API_URL + "/tests";
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/TestRequest.java`
#### Snippet
```java
public class TestRequest {
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private TestFinder myTestFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private BeanFactory myBeanFactory;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/TestRequest.java`
#### Snippet
```java
@Api("Test")
public class TestRequest {
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private TestFinder myTestFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/TwoFactorRequest.java`
#### Snippet
```java
public class TwoFactorRequest {
  @Context @NotNull private UserFinder myUserFinder;
  @Context @NotNull private TwoFactorSecretKeysUpdater myKeysUpdater;

  @POST
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/TwoFactorRequest.java`
#### Snippet
```java
@Api(value = "2FA", hidden = true)
public class TwoFactorRequest {
  @Context @NotNull private UserFinder myUserFinder;
  @Context @NotNull private TwoFactorSecretKeysUpdater myKeysUpdater;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/model/mutation/agentPool/BulkAssignProjectWithAgentPoolInput.java`
#### Snippet
```java

public class BulkAssignProjectWithAgentPoolInput {
  @NotNull
  private List<String> myProjectRawIds;
  private int myAgentPoolRawId;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/VcsRootInstanceRequest.java`
#### Snippet
```java
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private VcsRootInstanceFinder myVcsRootInstanceFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;

  public static final String API_VCS_ROOT_INSTANCES_URL = Constants.API_URL + "/vcs-root-instances";
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/VcsRootInstanceRequest.java`
#### Snippet
```java
public class VcsRootInstanceRequest {
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private VcsRootInstanceFinder myVcsRootInstanceFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/VcsRootInstanceRequest.java`
#### Snippet
```java
@Api("VcsRootInstance")
public class VcsRootInstanceRequest {
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private VcsRootInstanceFinder myVcsRootInstanceFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/VcsRootInstanceRequest.java`
#### Snippet
```java
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private VcsRootInstanceFinder myVcsRootInstanceFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
  @NotNull private ServerSshKeyManager myServerSshKeyManager;

  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private BuildFinder myBuildFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
  @Context @NotNull private AgentPoolFinder myAgentPoolFinder;
  @Context @NotNull private BranchFinder myBranchFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;

  @Context @NotNull private PermissionChecker myPermissionChecker;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private ProjectFinder myProjectFinder;
  @Context @NotNull private AgentPoolFinder myAgentPoolFinder;
  @Context @NotNull private BranchFinder myBranchFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
  @Context @NotNull private BuildFinder myBuildFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private ProjectFinder myProjectFinder;
  @Context @NotNull private AgentPoolFinder myAgentPoolFinder;
  @Context @NotNull private BranchFinder myBranchFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private BuildFinder myBuildFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private ProjectFinder myProjectFinder;
  @Context @NotNull private AgentPoolFinder myAgentPoolFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;

  @Context @NotNull private PermissionChecker myPermissionChecker;

  @Context
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java

  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private BuildFinder myBuildFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private BuildFinder myBuildFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private ProjectFinder myProjectFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
  @Context @NotNull private ProjectFinder myProjectFinder;
  @Context @NotNull private AgentPoolFinder myAgentPoolFinder;
  @Context @NotNull private BranchFinder myBranchFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/BuildTypeResolver.java`
#### Snippet
```java
public class BuildTypeResolver extends ModelResolver<BuildType> {
  @Autowired
  @NotNull
  private BuildTypeFinder myBuildTypeFinder;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/change/Change.java`
#### Snippet
```java
  protected ApiUrlBuilder myApiUrlBuilder;
  protected WebLinks myWebLinks;
  @NotNull private Fields myFields;
  @NotNull private BeanContext myBeanContext;
  /**
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/change/Change.java`
#### Snippet
```java
  protected WebLinks myWebLinks;
  @NotNull private Fields myFields;
  @NotNull private BeanContext myBeanContext;
  /**
   * These are used only when posting a link to the change
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private VcsRootInstanceFinder myVcsRootInstanceFinder;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private PermissionChecker myPermissionChecker;
  @Context @NotNull private BeanContext myBeanContext;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java

  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private VcsRootInstanceFinder myVcsRootInstanceFinder;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private PermissionChecker myPermissionChecker;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
  @Context @NotNull private VcsRootInstanceFinder myVcsRootInstanceFinder;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private PermissionChecker myPermissionChecker;
  @Context @NotNull private BeanContext myBeanContext;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
  public static final String REST_VALID_QUERY_PROPERTY_NAME = "rest.debug.database.allow.query.prefixes";

  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private VcsRootInstanceFinder myVcsRootInstanceFinder;
  @Context @NotNull private ServiceLocator myServiceLocator;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private PermissionChecker myPermissionChecker;
  @Context @NotNull private BeanContext myBeanContext;

  @GET
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/model/mutation/UnassignProjectFromAgentPoolInput.java`
#### Snippet
```java

public class UnassignProjectFromAgentPoolInput {
  @NotNull
  private String myProjectRawId;
  private int myAgentPoolRawId;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/build/RunningBuildInfo.java`
#### Snippet
```java
  private SRunningBuild myBuild;
  @NotNull private Fields myFields;
  @NotNull private BeanContext myBeanContext;

  public RunningBuildInfo() {
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/build/RunningBuildInfo.java`
#### Snippet
```java
@ModelDescription("Represents a progress estimate of this build.")
public class RunningBuildInfo {
  @NotNull
  private SRunningBuild myBuild;
  @NotNull private Fields myFields;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/build/RunningBuildInfo.java`
#### Snippet
```java
  @NotNull
  private SRunningBuild myBuild;
  @NotNull private Fields myFields;
  @NotNull private BeanContext myBeanContext;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
  @Context @NotNull public BuildPromotionFinder myBuildPromotionFinder;
  @Context @NotNull public BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull public PermissionChecker myPermissionChecker;
  @Context @NotNull public BeanContext myBeanContext;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
  @Context @NotNull public BuildFinder myBuildFinder;
  @Context @NotNull public BuildPromotionFinder myBuildPromotionFinder;
  @Context @NotNull public BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull public PermissionChecker myPermissionChecker;
  @Context @NotNull public BeanContext myBeanContext;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
  @Context @NotNull public BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull public PermissionChecker myPermissionChecker;
  @Context @NotNull public BeanContext myBeanContext;

  public static String getHref() {
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java

  @Context @NotNull public BuildFinder myBuildFinder;
  @Context @NotNull public BuildPromotionFinder myBuildPromotionFinder;
  @Context @NotNull public BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull public PermissionChecker myPermissionChecker;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
  public static final String ARTIFACTS = "/artifacts";

  @Context @NotNull public BuildFinder myBuildFinder;
  @Context @NotNull public BuildPromotionFinder myBuildPromotionFinder;
  @Context @NotNull public BuildTypeFinder myBuildTypeFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
  @Context @NotNull private VcsRootFinder myVcsRootFinder;
  @Context @NotNull private InvestigationFinder myInvestigationFinder;
  @Context @NotNull private BranchFinder myBranchFinder;

  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java

  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanFactory myFactory;
  @Context @NotNull private BeanContext myBeanContext;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
  @Context @NotNull private BuildFinder myBuildFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private VcsRootFinder myVcsRootFinder;
  @Context @NotNull private InvestigationFinder myInvestigationFinder;
  @Context @NotNull private BranchFinder myBranchFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private VcsRootFinder myVcsRootFinder;
  @Context @NotNull private InvestigationFinder myInvestigationFinder;
  @Context @NotNull private BranchFinder myBranchFinder;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanFactory myFactory;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull public PermissionChecker myPermissionChecker;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
  @Context @NotNull private BranchFinder myBranchFinder;

  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanFactory myFactory;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanFactory myFactory;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull public PermissionChecker myPermissionChecker;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
  @Context @NotNull private BeanFactory myFactory;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull public PermissionChecker myPermissionChecker;

  public static final String API_BUILD_TYPES_URL = Constants.API_URL + "/buildTypes";
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java

  @Context @NotNull private BuildFinder myBuildFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private VcsRootFinder myVcsRootFinder;
  @Context @NotNull private InvestigationFinder myInvestigationFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
  private static final Pattern NON_ALPHA_NUM_PATTERN = Pattern.compile("[^a-zA-Z0-9-#.]+");

  @Context @NotNull private BuildFinder myBuildFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private VcsRootFinder myVcsRootFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/AgentResolver.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private AgentPoolFinder myAgentPoolFinder;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/AgentResolver.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private AgentTypeFinder myAgentTypeFinder;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/AgentResolver.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private BuildAgentManager myAgentManager;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/AgentResolver.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private ProjectFinder myProjectFinder;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/AgentResolver.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private AbstractAgentPoolFactory myPoolFactory;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/AgentResolver.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private BuildTypeFinder myBuildTypeFinder;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/model/mutation/agentPool/CreateAgentPoolInput.java`
#### Snippet
```java

public class CreateAgentPoolInput {
  @NotNull
  private String myName;
  @Nullable
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/agentPool/AgentPoolActionsAccessCheckerImpl.java`
#### Snippet
```java
  @NotNull private AgentTypeStorage myAgentTypeStorage;
  @NotNull private ProjectManagerEx myProjectManager;
  @NotNull private AgentPoolManager myAgentPoolManager;

  public AgentPoolActionsAccessCheckerImpl(@NotNull final SecurityContextEx securityContext) {
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/agentPool/AgentPoolActionsAccessCheckerImpl.java`
#### Snippet
```java

  private final SecurityContextEx mySecurityContext;
  @NotNull private AgentTypeStorage myAgentTypeStorage;
  @NotNull private ProjectManagerEx myProjectManager;
  @NotNull private AgentPoolManager myAgentPoolManager;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/resolver/agentPool/AgentPoolActionsAccessCheckerImpl.java`
#### Snippet
```java
  private final SecurityContextEx mySecurityContext;
  @NotNull private AgentTypeStorage myAgentTypeStorage;
  @NotNull private ProjectManagerEx myProjectManager;
  @NotNull private AgentPoolManager myAgentPoolManager;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/GraphQLProvider.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private ProjectAgentPoolResolver myProjectAgentPoolResolver;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/GraphQLProvider.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private AgentTypeResolver myAgentTypeResolver;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/GraphQLProvider.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private ResolverExceptionHandler myExceptionHandler;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/GraphQLProvider.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private AgentBuildTypeEdgeResolver myAgentBuildTypeEdgeResolver;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/GraphQLProvider.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private AgentPoolResolver myAgentPoolResolver;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/GraphQLProvider.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private ProjectResolver myProjectResolver;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/GraphQLProvider.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private Mutation myMutation;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/GraphQLProvider.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private AgentPoolMutation myAgentPoolMutation;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/GraphQLProvider.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private CloudImageResolver myCloudImageResolver;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/GraphQLProvider.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private BuildTypeResolver myBuildTypeResolver;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/GraphQLProvider.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private AgentResolver myAgentResolver;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/GraphQLProvider.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private Query myQuery;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/build/approval/GroupApprovalRuleStatus.java`
#### Snippet
```java
public class GroupApprovalRuleStatus {
  @NotNull protected BuildPromotionEx myBuildPromotionEx;
  @NotNull protected ApprovalRule myApprovalRule;
  @NotNull protected Fields myFields;
  @NotNull protected BeanContext myBeanContext;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/build/approval/GroupApprovalRuleStatus.java`
#### Snippet
```java
  @NotNull protected BuildPromotionEx myBuildPromotionEx;
  @NotNull protected ApprovalRule myApprovalRule;
  @NotNull protected Fields myFields;
  @NotNull protected BeanContext myBeanContext;
  @NotNull protected ApprovableBuildManager myApprovableBuildManager;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/build/approval/GroupApprovalRuleStatus.java`
#### Snippet
```java
  @NotNull protected Fields myFields;
  @NotNull protected BeanContext myBeanContext;
  @NotNull protected ApprovableBuildManager myApprovableBuildManager;

  public GroupApprovalRuleStatus(
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/build/approval/GroupApprovalRuleStatus.java`
#### Snippet
```java
  @NotNull protected ApprovalRule myApprovalRule;
  @NotNull protected Fields myFields;
  @NotNull protected BeanContext myBeanContext;
  @NotNull protected ApprovableBuildManager myApprovableBuildManager;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/model/build/approval/GroupApprovalRuleStatus.java`
#### Snippet
```java
@XmlRootElement(name = "groupApprovalRule")
public class GroupApprovalRuleStatus {
  @NotNull protected BuildPromotionEx myBuildPromotionEx;
  @NotNull protected ApprovalRule myApprovalRule;
  @NotNull protected Fields myFields;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/InvestigationRequest.java`
#### Snippet
```java
@Api("Investigation")
public class InvestigationRequest {
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private InvestigationFinder myInvestigationFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/InvestigationRequest.java`
#### Snippet
```java
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private InvestigationFinder myInvestigationFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private BeanContext myBeanContext;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/InvestigationRequest.java`
#### Snippet
```java
public class InvestigationRequest {
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private InvestigationFinder myInvestigationFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private BeanContext myBeanContext;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/InvestigationRequest.java`
#### Snippet
```java
  @Context @NotNull private InvestigationFinder myInvestigationFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private BeanContext myBeanContext;

  public static final String API_SUB_URL = Constants.API_URL + "/investigations";
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/model/mutation/agentPool/AssignProjectWithAgentPoolInput.java`
#### Snippet
```java

public class AssignProjectWithAgentPoolInput {
  @NotNull
  private String myProjectRawId;
  private int myAgentPoolRawId;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/TestOccurrenceRequest.java`
#### Snippet
```java
public class TestOccurrenceRequest {
  public static final String API_SUB_URL = Constants.API_URL + "/testOccurrences";
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private TestOccurrenceFinder myTestOccurrenceFinder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/TestOccurrenceRequest.java`
#### Snippet
```java
  public static final String API_SUB_URL = Constants.API_URL + "/testOccurrences";
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private TestOccurrenceFinder myTestOccurrenceFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/TestOccurrenceRequest.java`
#### Snippet
```java
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private TestOccurrenceFinder myTestOccurrenceFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;

  public static String getHref() {
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/rest/request/TestOccurrenceRequest.java`
#### Snippet
```java
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private TestOccurrenceFinder myTestOccurrenceFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `src/jetbrains/buildServer/server/graphql/model/mutation/AssignBuildTypeWithAgentInput.java`
#### Snippet
```java
public class AssignBuildTypeWithAgentInput {
  private int myAgentRawId;
  @NotNull
  private String myBuildTypeRawId;

```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
            break;
          case TIMED_WAITING:
            buf.append("waiting on ");
            break;
          default:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/jetbrains/buildServer/server/rest/model/RelatedEntity.java`
#### Snippet
```java
       case STRING:              return "text";
       case BUILD_PROMOTION:     return "build";
       case BUILD:               return "build";
       case BUILD_TYPE:          return "buildType";
       case BUILD_TYPE_TEMPLATE: return "buildType";
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/jetbrains/buildServer/server/rest/model/RelatedEntity.java`
#### Snippet
```java
       case BUILD:               return "build";
       case BUILD_TYPE:          return "buildType";
       case BUILD_TYPE_TEMPLATE: return "buildType";
       case PROJECT:             return "project";
       case USER:                return "user";
```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `BuildPromotionFinder` on 'this' is unnecessary in this context
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
      final String graphLocator = locator.getSingleDimensionValue(ORDERED);
      if (graphLocator != null) {
        final GraphFinder<BuildPromotion> graphFinder = new BuildPromotionOrderedFinder(BuildPromotionFinder.this);
        final Set<BuildPromotion> filter = new HashSet<>(graphFinder.getItems(graphLocator).myEntries);
        result.add(filter::contains);
```

### UnnecessaryQualifierForThis
Qualifier `TestOccurrenceFinder` on 'this' is unnecessary in this context
in `src/jetbrains/buildServer/server/rest/data/problem/TestOccurrenceFinder.java`
#### Snippet
```java
          Collection<STestRun> testRuns = getInvocations(item);
          FinderSearchMatcher<STestRun> matcher =
              new FinderSearchMatcher<>(dimensionValue, new DelegatingAbstractFinder<STestRun>(TestOccurrenceFinder.this) {
                @Nullable
                @Override
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`agents.size() > 0` can be replaced with '!agents.isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/CloudInstanceData.java`
#### Snippet
```java
    if (profileId == null) return null;
    Collection<SBuildAgent> agents = myServiceLocator.getSingletonService(CloudManager.class).findAgentByInstance(profileId, myInstance.getInstanceId());
    return agents.size() > 0 ? agents.iterator().next() : null;
  }

```

### SizeReplaceableByIsEmpty
`errors.size() != 0` can be replaced with '!errors.isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/DataUpdater.java`
#### Snippet
```java
    }

    if (errors.size() != 0) {
      throw new PartialUpdateError("Partial error updating user " + user.describe(false), errors);
    }
```

### SizeReplaceableByIsEmpty
`errors.size() != 0` can be replaced with '!errors.isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/DataUpdater.java`
#### Snippet
```java
      }
    }
    if (errors.size() != 0) {
      throw new PartialUpdateError("Partial error updating roles for user " + user.describe(false), errors);
    }
```

### SizeReplaceableByIsEmpty
`((Collection``)value).size() == 0` can be replaced with '((Collection)value).isEmpty()'
in `src/jetbrains/buildServer/server/rest/util/ValueWithDefault.java`
#### Snippet
```java
    }
    if (Collection.class.isAssignableFrom(value.getClass())) {
      return ((Collection<?>)value).size() == 0;
    }
    if (DefaultValueAware.class.isAssignableFrom(value.getClass())) {
```

### SizeReplaceableByIsEmpty
`metadata.size() != 0` can be replaced with '!metadata.isEmpty()'
in `src/jetbrains/buildServer/server/rest/errors/WebApplicationExceptionMapper.java`
#### Snippet
```java
    final MultivaluedMap<String, Object> metadata = exceptionResponse.getMetadata();
    String metadataDetails = "";
    if (metadata != null && metadata.size() != 0) {
      metadataDetails = " Metadata: " + StringUtil.join(metadata.entrySet(), entry -> entry.getKey() + ":" + entry.getValue(), ", ");
    }
```

### SizeReplaceableByIsEmpty
`matching.length() == 0` can be replaced with 'matching.isEmpty()'
in `src/jetbrains/buildServer/server/rest/RequestPathTransformInfo.java`
#### Snippet
```java
  public PathTransformator getReverseTransformator(@NotNull final String originalPath, final boolean prefixSupported) {
    final String matching = getLargestMatchingSubstring(originalPath, myPathMapping.keySet());
    if (matching.length() == 0){
      return path -> path;
    }
```

### SizeReplaceableByIsEmpty
`matching.length() == 0` can be replaced with 'matching.isEmpty()'
in `src/jetbrains/buildServer/server/rest/RequestPathTransformInfo.java`
#### Snippet
```java
  public String getTransformedPath(@NotNull final String path) {
    String matching = getLargestMatchingSubstring(path, myPathMapping.keySet());
    if (matching.length() == 0){
      return path;
    }
```

### SizeReplaceableByIsEmpty
`myProblems.size() == 0` can be replaced with 'myProblems.isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/problem/scope/ProblemOccurrencesTreeCollector.java`
#### Snippet
```java
    @Override
    public Iterable<Scope> getPath() {
      if(myProblems.size() == 0) {
        // should not actually happen
        return Collections.emptyList();
```

### SizeReplaceableByIsEmpty
`agent.size() == 0` can be replaced with 'agent.isEmpty()'
in `src/jetbrains/buildServer/server/graphql/resolver/CloudImageResolver.java`
#### Snippet
```java
      Collection<SBuildAgent> agent = myCloudManager.findAgentByInstance(image.getProfileId(), instance.getInstanceId());

      if(agent.size() == 0) return;
      if(agent.size() > 1) {
        LOG.info(String.format(
```

### SizeReplaceableByIsEmpty
`usedDimensions.size() > 0` can be replaced with '!usedDimensions.isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
    if (mySupportedDimensions != null) usedDimensions.removeAll(Arrays.asList(mySupportedDimensions));
    usedDimensions.removeAll(myHiddenSupportedDimensions);
    if (usedDimensions.size() > 0) {
      //found used dimensions which are not declared as used.

```

### SizeReplaceableByIsEmpty
`node.getData().size() > 0` can be replaced with '!node.getData().isEmpty()'
in `src/jetbrains/buildServer/server/rest/model/problem/scope/AbstractScopeTree.java`
#### Snippet
```java
    Fields leafFields = myFields.getNestedField("leaf");
    return myNodes.stream()
                  .filter(node -> node.getData().size() > 0)
                  .map(node -> buildLeaf(node, leafFields, myContext))
                  .collect(Collectors.toList());
```

### SizeReplaceableByIsEmpty
`buildsWithErrors.size() != 0` can be replaced with '!buildsWithErrors.isEmpty()'
in `src/jetbrains/buildServer/server/rest/request/BuildQueueRequest.java`
#### Snippet
```java
    }

    if (buildsWithErrors.size() != 0) {
      final StringBuilder buildListDetails = new StringBuilder();
      for (Map.Entry<Build, Exception> buildExceptionEntry : buildsWithErrors.entrySet()) {
```

### SizeReplaceableByIsEmpty
`errors.size() >0` can be replaced with '!errors.isEmpty()'
in `src/jetbrains/buildServer/server/rest/request/BuildQueueRequest.java`
#### Snippet
```java
      }
    }
    if (errors.size() >0){
      throw new PartialUpdateError("Some builds were not deleted", errors);
    }
```

### SizeReplaceableByIsEmpty
`found.size() > 0` can be replaced with '!found.isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/FinderSearchMatcher.java`
#### Snippet
```java
    }
    if (myMatch == null) {
      return found.size() > 0; // found anything when "match" is empty
    }

```

### SizeReplaceableByIsEmpty
`runningBuilds.size() > 0` can be replaced with '!runningBuilds.isEmpty()'
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Project.java`
#### Snippet
```java
    public String getActivity() {
        final List<SRunningBuild> runningBuilds = myBuildType.getRunningBuilds();
        if (runningBuilds.size() > 0) {
            return "Building";
        }
```

### SizeReplaceableByIsEmpty
`bindPath.length() == 0` can be replaced with 'bindPath.isEmpty()'
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java
    final String[] bindPaths = bindPath.split(",");

    if (bindPath.length() == 0) {
      LOG.error("Invalid REST API bind path in plugin descriptor: '" + bindPath + "'in " + getPluginIdentifyingText() + ". Corrupted plugin?");
      return Collections.emptyList();
```

### SizeReplaceableByIsEmpty
`new PropEntityProjectFeature.ProjectFeatureFinder(item).getItems(featureDimension).getEntries().size...` can be replaced with '!new PropEntityProjectFeature.ProjectFeatureFinder(item).getItems(featureDimension).getEntries().isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ProjectFinder.java`
#### Snippet
```java
            return false;
          }
          return new PropEntityProjectFeature.ProjectFeatureFinder(item).getItems(featureDimension).getEntries().size() > 0;
        }
      });
```

### SizeReplaceableByIsEmpty
`filteredBuilds.size() == 0` can be replaced with 'filteredBuilds.isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildFinder.java`
#### Snippet
```java

    final List<SBuild> filteredBuilds = getBuilds(buildsFilter);
    if (filteredBuilds.size() == 0){
      throw new NotFoundException("No build found by filter: " + buildsFilter.toString() + ".");
    }
```

### SizeReplaceableByIsEmpty
`buildTags.size() != 0` can be replaced with '!buildTags.isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
    }
    if (tagsMatchPattern == null) {
      if ((present && buildTags.size() != 0) || (!present && (buildTags.size() == 0))) {
        return true;
      }
```

### SizeReplaceableByIsEmpty
`buildTags.size() == 0` can be replaced with 'buildTags.isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
    }
    if (tagsMatchPattern == null) {
      if ((present && buildTags.size() != 0) || (!present && (buildTags.size() == 0))) {
        return true;
      }
```

### SizeReplaceableByIsEmpty
`tagsList.size() > 0` can be replaced with '!tagsList.isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
    if (tags != null) {
      final List<String> tagsList = Arrays.asList(tags.split(","));
      if (tagsList.size() > 0) {
        result.add(item -> item.getTags().containsAll(tagsList));
      }
```

### SizeReplaceableByIsEmpty
`map.size() > 0` can be replaced with '!map.isEmpty()'
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
  @Nullable
  private static Map<String, String> getNullOrCollection(final @NotNull Map<String, String> map) {
    return map.size() > 0 ? map : null;
  }

```

### SizeReplaceableByIsEmpty
`new TagFinder(userFinder, item).getItems(singleTag, getDefaultLocator()).myEntries.size() > 0` can be replaced with '!new TagFinder(userFinder, item).getItems(singleTag, getDefaultLocator()).myEntries.isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/build/TagFinder.java`
#### Snippet
```java

  public static boolean isIncluded(@NotNull final BuildPromotion item, @Nullable final String singleTag, @NotNull final UserFinder userFinder) {
    return new TagFinder(userFinder, item).getItems(singleTag, getDefaultLocator()).myEntries.size() > 0; //the code should correspond to locator.isSingleValue() case processing in getFilter method
  }

```

### SizeReplaceableByIsEmpty
`items.size() > 0` can be replaced with '!items.isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
                                                    final @NotNull ServiceLocator serviceLocator) {
    final List<ArtifactTreeElement> items = getItems(root, Locator.getStringLocator(DIMENSION_PATTERNS, pathWithPatterns), null, serviceLocator);
    if (items.size() > 0){
      final ArtifactTreeElement first = items.get(0);
      //now find it in browser to make sure archive's children can be listed
```

### SizeReplaceableByIsEmpty
`SLASHES_OR_SPACE_PATTERN.matcher(path).replaceAll("").length() == 0` can be replaced with 'SLASHES_OR_SPACE_PATTERN.matcher(path).replaceAll("").isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
                                                   final @NotNull ServiceLocator serviceLocator) {
    Element element;
    if (SLASHES_OR_SPACE_PATTERN.matcher(path).replaceAll("").length() == 0){ //TeamCity API issue: cannot list root of the Browser by empty string or "/"
      element = browser.getRoot();
    }else{
```

### SizeReplaceableByIsEmpty
`myTags.size() > 0` can be replaced with '!myTags.isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/build/GenericBuildsFilter.java`
#### Snippet
```java
      return false;
    }
    if (myTags != null && myTags.size() > 0 && myTags.get(0).startsWith("format:extended")) {
      @NotNull final List<String> buildTags = build.getTags();
      //unofficial experimental support for "tag:(format:regexp,value:.*)" tag specification
```

### SizeReplaceableByIsEmpty
`unusedDimensions.size() > 0` can be replaced with '!unusedDimensions.isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/build/GenericBuildsFilter.java`
#### Snippet
```java
          }
        final Set<String> unusedDimensions = tagsLocator.getUnusedDimensions();
        if (unusedDimensions.size() > 0) {
          throw new BadRequestException("Unknown dimensions in locator 'tag': " + unusedDimensions);
        }
```

### SizeReplaceableByIsEmpty
`myTags.size() > 0` can be replaced with '!myTags.isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/build/GenericBuildsFilter.java`
#### Snippet
```java
        throw new BadRequestException("Invalid locator 'tag': " + e.getMessage(), e);
      }
    }else if (myTags != null && myTags.size() > 0 && !build.getTags().containsAll(myTags)) {
      return false;
    }
```

### SizeReplaceableByIsEmpty
`buildTags.size() != 0` can be replaced with '!buildTags.isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/build/GenericBuildsFilter.java`
#### Snippet
```java
    }
    if (tagsMatchPattern == null) {
      if ((present && buildTags.size() != 0) || (!present && (buildTags.size() == 0))) {
        return true;
      }
```

### SizeReplaceableByIsEmpty
`buildTags.size() == 0` can be replaced with 'buildTags.isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/build/GenericBuildsFilter.java`
#### Snippet
```java
    }
    if (tagsMatchPattern == null) {
      if ((present && buildTags.size() != 0) || (!present && (buildTags.size() == 0))) {
        return true;
      }
```

### SizeReplaceableByIsEmpty
`projectIds.size() == 0` can be replaced with 'projectIds.isEmpty()'
in `src/jetbrains/buildServer/server/graphql/resolver/agentPool/AgentPoolActionsAccessCheckerImpl.java`
#### Snippet
```java

    Collection<String> projectIds = targetPool.getProjectIds();
    if(projectIds.size() == 0) {
      return false;
    }
```

### SizeReplaceableByIsEmpty
`causes.size() > 0` can be replaced with '!causes.isEmpty()'
in `src/jetbrains/buildServer/server/rest/errors/PartialUpdateError.java`
#### Snippet
```java
  private static StringBuilder getCombinedMessage(final String message, final List<Throwable> causes) {
    final StringBuilder resultMessage = new StringBuilder(message);
    if (causes.size() > 0) {
      resultMessage.append(", nested errors: ");
      for (Throwable cause : causes) {
```

### SizeReplaceableByIsEmpty
`causes.size() == 0` can be replaced with 'causes.isEmpty()'
in `src/jetbrains/buildServer/server/rest/errors/PartialUpdateError.java`
#### Snippet
```java

  private static Throwable getFirst(final List<Throwable> causes) {
    if (causes == null || causes.size() == 0) {
      return null;
    }
```

### SizeReplaceableByIsEmpty
`dupliactes.size() > 0` can be replaced with '!dupliactes.isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ChangeFinder.java`
#### Snippet
```java
  private Stream<SVcsModification> modificationWithDuplicates(@NotNull SVcsModification m) {
    Collection<SVcsModification> dupliactes = m.getDuplicates();
    if (dupliactes.size() > 0) {
      return Stream.concat(Stream.of(m), m.getDuplicates().stream());
    }
```

### SizeReplaceableByIsEmpty
`problemOccurrences.size() == 0` can be replaced with 'problemOccurrences.isEmpty()'
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
                                          () -> {
                                            final List<BuildProblem> problemOccurrences = ProblemOccurrenceFinder.getProblemOccurrences(myBuildPromotion);
                                            if (problemOccurrences.size() == 0) return null;

                                            int newProblemsCount = 0;
```

### SizeReplaceableByIsEmpty
`lastChanges.size() > 0` can be replaced with '!lastChanges.isEmpty()'
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
    if (myLastChanges != null) {
      List<SVcsModification> lastChanges = myLastChanges.getChangesFromPosted(serviceLocator.getSingletonService(ChangeFinder.class));
      if (lastChanges.size() > 0) {
        boolean changeProcessed = false;
        boolean personalChangeProcessed = false;
```

### SizeReplaceableByIsEmpty
`description.length() == 0` can be replaced with 'description.isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
    @NotNull
    public TypedFinderDimension<ITEM, TYPE> description(@NotNull final String description) {
      if (description.length() == 0) throw new OperationException("Wrong description: empty");
      if (myDescription != null) throw new OperationException("Attempt to redefine description: old: '" + getDescription() + "', new: '" + description + "'");
      myDescription = description;
```

### SizeReplaceableByIsEmpty
`name.length() == 0` can be replaced with 'name.isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java

    public Dimension(@NotNull final String name) {
      if (name.length() == 0) throw new OperationException("Wrong name: empty");
      this.name = name;
    }
```

### SizeReplaceableByIsEmpty
`dimensions.size() == 0` can be replaced with 'dimensions.isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
  @Nullable
  public static <T> Set<T> getIntersected(@Nullable List<Set<T>> dimensions) {
    if (dimensions == null || dimensions.size() == 0) {
      return null;
    }
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/jetbrains/buildServer/server/rest/model/Property.java`
#### Snippet
```java
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Property{");
    sb.append("name='").append(name).append('\'');
    sb.append(", value='").append(value).append('\'');
```

## RuleId[id=MismatchedStringBuilderQueryUpdate]
### MismatchedStringBuilderQueryUpdate
Contents of `StringBuilder message` are updated, but never queried
in `src/jetbrains/buildServer/server/rest/data/TimeWithPrecision.java`
#### Snippet
```java
    }

    StringBuilder message = new StringBuilder();
    Date exampleTime = new Date();
    // throwing original error
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends S`
in `src/jetbrains/buildServer/server/rest/util/CachingValueNullable.java`
#### Snippet
```java

  @NotNull
  public static <S> CachingValueNullable<S> simple(@NotNull final ValueWithDefault.Value<S> value) {
    return new CachingValueNullable<S>() {
      @Override protected S doGet() { return value.get(); }
```

### BoundedWildcard
Can generalize to `? super String`
in `src/jetbrains/buildServer/server/rest/data/RestContext.java`
#### Snippet
```java
  private final StringPool myStringPool = new SimpleStringPool();

  public RestContext(@NotNull Function<String, Object> function) {
    myFunction = function;
  }
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/jetbrains/buildServer/server/rest/util/StreamUtil.java`
#### Snippet
```java
 */
public class StreamUtil {
  public static <T> void forEachNullableFlattened(@Nullable List<List<T>> items, @NotNull final Consumer<? super T> action) {
    if (items != null) {
      items.stream().filter(Objects::nonNull).flatMap(Collection::stream).filter(Objects::nonNull).forEach(action);
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudInstances.java`
#### Snippet
```java
  public CloudInstances() {}

  public CloudInstances(@NotNull final CachingValue<List<CloudInstanceData>> items, final PagerData pagerData, @NotNull final Fields fields, @NotNull final BeanContext context) {
    cloudInstances = ValueWithDefault.decideDefault(
      fields.isIncluded("cloudInstance", false, true),
```

### BoundedWildcard
Can generalize to `? extends S`
in `src/jetbrains/buildServer/server/rest/util/CachingValue.java`
#### Snippet
```java

  @NotNull
  public static <S> CachingValue<S> simple(@NotNull Supplier<S> value) {
    return new CachingValue<S>() {
      @NotNull
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/jetbrains/buildServer/server/rest/util/ValueWithDefault.java`
#### Snippet
```java

  @Nullable
  public static <T> T decide(@Nullable Boolean decision, @Nullable Supplier<T> trueValue, @Nullable Supplier<T> falseValue, boolean defaultDecision) {
    boolean actualDecision;
    if (decision == null) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/jetbrains/buildServer/server/rest/util/ValueWithDefault.java`
#### Snippet
```java

  @Nullable
  public static <T> T decide(@Nullable Boolean decision, @Nullable Supplier<T> trueValue, @Nullable Supplier<T> falseValue, boolean defaultDecision) {
    boolean actualDecision;
    if (decision == null) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/jetbrains/buildServer/server/rest/util/ValueWithDefault.java`
#### Snippet
```java

  @Nullable
  public static <T> T decideDefault(@Nullable Boolean include, @Nullable Supplier<T> value, @NotNull Predicate<T> isDefault) {
    if (value == null) {
      return null;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/jetbrains/buildServer/server/rest/util/ValueWithDefault.java`
#### Snippet
```java

  @Nullable
  public static <T> T decideDefault(@Nullable Boolean include, @Nullable Supplier<T> value, @NotNull Predicate<T> isDefault) {
    if (value == null) {
      return null;
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudImages.java`
#### Snippet
```java
  public CloudImages(
    @NotNull
    CachingValue<List<jetbrains.buildServer.clouds.CloudImage>> items,
    @Nullable
    PagerData pagerData,
```

### BoundedWildcard
Can generalize to `? extends BuildChangeData`
in `src/jetbrains/buildServer/server/rest/model/change/BuildChanges.java`
#### Snippet
```java
  }

  public BuildChanges(@NotNull final List<BuildChangeData> buildChangeData, @NotNull final Fields fields, @NotNull final BeanContext beanContext) {
    myBuildChanges = ValueWithDefault.decideDefault(fields.isIncluded("buildChange", false, true), buildChangeData.stream().map(
      data -> new BuildChange(data, fields.getNestedField("buildChange", Fields.SHORT, Fields.LONG), beanContext)).collect(Collectors.toList()));
```

### BoundedWildcard
Can generalize to `? extends InvestigationWrapper`
in `src/jetbrains/buildServer/server/rest/model/buildType/Investigations.java`
#### Snippet
```java
  }

  public Investigations(@Nullable final Collection<InvestigationWrapper> itemsP,
                        @Nullable final PagerData pagerData, @NotNull final Fields fields,
                        @NotNull final BeanContext beanContext) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/jetbrains/buildServer/server/rest/model/change/Changes.java`
#### Snippet
```java
  }

  public static Changes fromSVcsModificationsSupplier(@NotNull final Supplier<List<SVcsModification>> modifications,
                                                      @Nullable final PagerData pagerData,
                                                      @NotNull Fields fields,
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/jetbrains/buildServer/server/rest/model/change/Changes.java`
#### Snippet
```java
                 @NotNull Fields fields,
                 @NotNull final BeanContext beanContext,
                 @Nullable final CachingValue<List<SVcsModificationOrChangeDescriptor>> modifications) {
    myModifications = modifications;
    myPagerData = pagerData;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/jetbrains/buildServer/server/rest/data/util/FilterItemProcessor.java`
#### Snippet
```java
  private final ArrayList<T> myList = new ArrayList<T>();

  public FilterItemProcessor(final PagingItemFilter<T> filter) {
    myFilter = filter;
  }
```

### BoundedWildcard
Can generalize to `? super NAKED`
in `src/jetbrains/buildServer/server/rest/data/util/UnwrappingFilter.java`
#### Snippet
```java
  private final Function<WRAPPED, NAKED> myUnwrapper;

  public UnwrappingFilter(@NotNull ItemFilter<NAKED> nakedFilter, @NotNull Function<WRAPPED, NAKED> unwrapper) {
    myNakedFilter = nakedFilter;
    myUnwrapper = unwrapper;
```

### BoundedWildcard
Can generalize to `? super WRAPPED`
in `src/jetbrains/buildServer/server/rest/data/util/UnwrappingFilter.java`
#### Snippet
```java
  private final Function<WRAPPED, NAKED> myUnwrapper;

  public UnwrappingFilter(@NotNull ItemFilter<NAKED> nakedFilter, @NotNull Function<WRAPPED, NAKED> unwrapper) {
    myNakedFilter = nakedFilter;
    myUnwrapper = unwrapper;
```

### BoundedWildcard
Can generalize to `? extends NAKED`
in `src/jetbrains/buildServer/server/rest/data/util/UnwrappingFilter.java`
#### Snippet
```java
  private final Function<WRAPPED, NAKED> myUnwrapper;

  public UnwrappingFilter(@NotNull ItemFilter<NAKED> nakedFilter, @NotNull Function<WRAPPED, NAKED> unwrapper) {
    myNakedFilter = nakedFilter;
    myUnwrapper = unwrapper;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java
  }

  private static <T> StringBuilder compareWithoutOrder(@NotNull final String entityName, @NotNull final Collection<T> a, @NotNull final Retriever<T> b,
                                                       @NotNull final String fieldPrefix, @NotNull final DiffCalculator<T> diffCalculator) {
    StringBuilder result = new StringBuilder();
```

### BoundedWildcard
Can generalize to `? super T`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java

  private static <T> StringBuilder compareWithoutOrder(@NotNull final String entityName, @NotNull final Collection<T> a, @NotNull final Retriever<T> b,
                                                       @NotNull final String fieldPrefix, @NotNull final DiffCalculator<T> diffCalculator) {
    StringBuilder result = new StringBuilder();
    for (final T oA : a) {
```

### BoundedWildcard
Can generalize to `? extends BuildTypeOrTemplate`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypes.java`
#### Snippet
```java
  }

  public BuildTypes(@NotNull final List<BuildTypeOrTemplate> items, @Nullable final PagerData pagerData, @NotNull final Fields fields, @NotNull final BeanContext beanContext) {
    if (fields.isIncluded("buildType", false, true)){
      this.buildTypes = new ArrayList<BuildType>(items.size());
```

### BoundedWildcard
Can generalize to `? extends ScopeTree.Node`
in `src/jetbrains/buildServer/server/rest/model/problem/scope/AbstractScopeTree.java`
#### Snippet
```java
  public AbstractScopeTree() { }

  public AbstractScopeTree(@NotNull List<ScopeTree.Node<DATA, COUNTERS>> sourceNodes, @NotNull Fields fields, @NotNull BeanContext context) {
    myNodes = sourceNodes;
    myFields = fields;
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/jetbrains/buildServer/server/rest/swagger/SwaggerUtil.java`
#### Snippet
```java
  }

  static <K extends Comparable<? super K>, V> Map<K, V> getOrderedMap(Map<K, V> input) {
    if (input == null) return null;
    Map<K, V> sorted = new LinkedHashMap<K, V>();
```

### BoundedWildcard
Can generalize to `? extends V`
in `src/jetbrains/buildServer/server/rest/swagger/SwaggerUtil.java`
#### Snippet
```java
  }

  static <K extends Comparable<? super K>, V> Map<K, V> getOrderedMap(Map<K, V> input) {
    if (input == null) return null;
    Map<K, V> sorted = new LinkedHashMap<K, V>();
```

### BoundedWildcard
Can generalize to `? super String`
in `src/jetbrains/buildServer/server/rest/model/ItemsProviders.java`
#### Snippet
```java

    @NotNull
    public static <S> ItemsProvider<S> items(@NotNull Function<String, List<S>> getItems) {
      return new ItemsProvider<S>() {
        @NotNull
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/jetbrains/buildServer/server/rest/model/ItemsProviders.java`
#### Snippet
```java

    @NotNull
    public static <S> ItemsProvider<S> items(@NotNull Function<String, List<S>> getItems) {
      return new ItemsProvider<S>() {
        @NotNull
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/jetbrains/buildServer/server/rest/data/problem/tree/ScopeTree.java`
#### Snippet
```java

  @NotNull
  public List<Node<DATA, COUNTERS>> getTopTreeSliceUpTo(@Nullable Comparator<Node<DATA, COUNTERS>> order, @NotNull Predicate<Scope> isIncludedLevel) {
    Queue<Node<DATA, COUNTERS>> nodeQueue = new ArrayDeque<>();
    nodeQueue.add(myRoot);
```

### BoundedWildcard
Can generalize to `? super Scope`
in `src/jetbrains/buildServer/server/rest/data/problem/tree/ScopeTree.java`
#### Snippet
```java

  @NotNull
  public List<Node<DATA, COUNTERS>> getTopTreeSliceUpTo(@Nullable Comparator<Node<DATA, COUNTERS>> order, @NotNull Predicate<Scope> isIncludedLevel) {
    Queue<Node<DATA, COUNTERS>> nodeQueue = new ArrayDeque<>();
    nodeQueue.add(myRoot);
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/jetbrains/buildServer/server/rest/data/problem/tree/ScopeTree.java`
#### Snippet
```java
   */
  @NotNull
  public List<Node<DATA, COUNTERS>> getFullTree(@Nullable Comparator<Node<DATA, COUNTERS>> nodeComparator) {
    List<Node<DATA, COUNTERS>> result = new ArrayList<>(myIdToNodesMap.size());

```

### BoundedWildcard
Can generalize to `? super TestScopeInfo`
in `src/jetbrains/buildServer/server/rest/data/problem/scope/TestScopeTreeCollector.java`
#### Snippet
```java

  @NotNull
  private static Function<Node<STestRun, TestCountersData>, Integer> getMaxChildrenFunction(int defaultMaxChildren, Function<TestScopeInfo, Integer> scope2maxChildren) {
    return (node) -> {
      // TW-71521 Don't apply `maxChildren` to project & build configuration nodes
```

### BoundedWildcard
Can generalize to `? super String`
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java
  }

  private static void addEntries(final Map<String, String> map, final List<String> keys, final String value) {
    for (String key : keys) {
      map.put(key, value);
```

### BoundedWildcard
Can generalize to `? super String`
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java
  }

  private static void addEntries(final Map<String, String> map, final List<String> keys, final String value) {
    for (String key : keys) {
      map.put(key, value);
```

### BoundedWildcard
Can generalize to `? extends BranchData`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BranchFinder.java`
#### Snippet
```java
    private final Map<String, BranchData> myMap = new HashMap<>();

    void addAll(@NotNull final Stream<BranchData> buildTypeBranches) {
      buildTypeBranches.forEach(branch -> {
        //assuming that branch.isDefaultBranch() means Branch.DEFAULT_BRANCH_NAME.equals(name)
```

### BoundedWildcard
Can generalize to `? super T`
in `src/jetbrains/buildServer/server/rest/model/MultipleOperationResult.java`
#### Snippet
```java

      @NotNull
      public static <T> Data process(@Nullable final String locator, @NotNull final Finder<T> finder, @NotNull Consumer<T> action) {
        if (locator == null){
          throw new BadRequestException("Empty locator specified.");
```

### BoundedWildcard
Can generalize to `? super DATA`
in `src/jetbrains/buildServer/server/graphql/model/connections/LazyEdge.java`
#### Snippet
```java
  }

  public LazyEdge(@NotNull DATA data, @NotNull Function<DATA, MODEL> transformer, @NotNull Function<DATA, ?> dataTransformer) {
    myData = data;
    myTransformer = transformer;
```

### BoundedWildcard
Can generalize to `? extends RelatedEntity.Entity`
in `src/jetbrains/buildServer/server/rest/model/RelatedEntities.java`
#### Snippet
```java
  }

  public RelatedEntities(final @NotNull List<RelatedEntity.Entity> items, @NotNull final Fields fields, @NotNull final BeanContext context) {
    entities = ValueWithDefault.decideDefault(fields.isIncluded("entity", false, true),
                                                 () -> items.stream().map(i -> new RelatedEntity(i, fields.getNestedField("entity", Fields.NONE, Fields.LONG), context)).collect(Collectors.toList()));
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/jetbrains/buildServer/server/rest/swagger/SwaggerResource.java`
#### Snippet
```java

  @NotNull
  private static <K, V> Map<K, List<V>> getNotNullMap(@Nullable final MultivaluedMap<K, V> params) {
    final Map<K, List<V>> output = new HashMap<K, List<V>>();
    if (params != null) {
```

### BoundedWildcard
Can generalize to `? extends Iterable`
in `src/jetbrains/buildServer/server/rest/data/util/itemholder/ItemHolder.java`
#### Snippet
```java
   * @param collection only created when terminal operation is executed.
   */
  static <T> ItemHolder<T> of(Supplier<Iterable<T>> collection) {
    return processor -> ItemHolder.of(collection.get()).process(processor);
  }
```

### BoundedWildcard
Can generalize to `? extends CommiterData`
in `src/jetbrains/buildServer/server/rest/model/change/Commiters.java`
#### Snippet
```java
  public Commiters() { }

  public Commiters(@NotNull List<CommiterData> commiters,
                   @NotNull Fields fields,
                   @NotNull final BeanContext beanContext) {
```

### BoundedWildcard
Can generalize to `? super ITEM`
in `src/jetbrains/buildServer/server/rest/data/util/KeyDuplicateChecker.java`
#### Snippet
```java
  private final Set<KEY> mySeenKeys = new HashSet<>();

  public KeyDuplicateChecker(@NotNull Function<ITEM, KEY> keyExtractor) {
    myKeyExtractor = keyExtractor;
  }
```

### BoundedWildcard
Can generalize to `? extends KEY`
in `src/jetbrains/buildServer/server/rest/data/util/KeyDuplicateChecker.java`
#### Snippet
```java
  private final Set<KEY> mySeenKeys = new HashSet<>();

  public KeyDuplicateChecker(@NotNull Function<ITEM, KEY> keyExtractor) {
    myKeyExtractor = keyExtractor;
  }
```

### BoundedWildcard
Can generalize to `? extends TYPE`
in `src/jetbrains/buildServer/server/rest/data/util/finderBuilder/DimensionValueMapper.java`
#### Snippet
```java
  @Nullable private String myLocatorTypeDescription;

  public DimensionValueMapper(@NotNull final ValueRetriever<TYPE> retriever) {
    myRetriever = retriever;
  }
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/jetbrains/buildServer/server/rest/model/Util.java`
#### Snippet
```java
  @NotNull
  @Deprecated
  public static <T, R> R resolveNull(@Nullable T value, @NotNull Function<T, R> mapper, @NotNull R resultForNull) {
    return value == null ? resultForNull : mapper.apply(value);
  }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/jetbrains/buildServer/server/rest/data/util/PagingItemFilter.java`
#### Snippet
```java
  @Nullable private T myLastProcessedItem = null;

  public PagingItemFilter(@NotNull final ItemFilter<T> filter, @Nullable final Long start, @Nullable final Integer count, @Nullable final Long lookupLimit) {
    myFilter = filter;
    myStart = start;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/jetbrains/buildServer/server/rest/data/finder/GraphFinder.java`
#### Snippet
```java
  }

  public GraphFinder(@NotNull LightweightFinder<T> finder, @NotNull Traverser<T> traverser) {
    super(DIMENSION_FROM, DIMENSION_TO, DIMENSION_RECURSIVE, DIMENSION_INCLUDE_INITIAL, DIMENSION_STOP);
    myFinder = finder;
```

### BoundedWildcard
Can generalize to `? extends BuildType`
in `src/jetbrains/buildServer/server/graphql/model/connections/agent/AgentBuildTypeEdge.java`
#### Snippet
```java
  private final Edge<BuildType> myDelegate;

  public AgentBuildTypeEdge(@NotNull Edge<BuildType> delegate) {
      myDelegate = delegate;
  }
```

### BoundedWildcard
Can generalize to `? extends Throwable`
in `src/jetbrains/buildServer/server/rest/errors/PartialUpdateError.java`
#### Snippet
```java
  }

  private static StringBuilder getCombinedMessage(final String message, final List<Throwable> causes) {
    final StringBuilder resultMessage = new StringBuilder(message);
    if (causes.size() > 0) {
```

### BoundedWildcard
Can generalize to `? extends Throwable`
in `src/jetbrains/buildServer/server/rest/errors/PartialUpdateError.java`
#### Snippet
```java
  }

  private static Throwable getFirst(final List<Throwable> causes) {
    if (causes == null || causes.size() == 0) {
      return null;
```

### BoundedWildcard
Can generalize to `? extends BranchData`
in `src/jetbrains/buildServer/server/rest/model/build/Branches.java`
#### Snippet
```java
  }

  public Branches(@Nullable final List<BranchData> branchesP, @Nullable final PagerData pagerData, @NotNull final Fields fields, @NotNull final BeanContext beanContext) {
    if (branchesP != null) {
      branches = ValueWithDefault.decideDefault(
```

### BoundedWildcard
Can generalize to `? super Date`
in `src/jetbrains/buildServer/server/rest/data/TimeCondition.java`
#### Snippet
```java
    public ParsedTimeCondition(@Nullable final TimeWithPrecision limitingSinceDate,
                               @NotNull final TimeWithPrecision limitingDate,
                               @NotNull final Condition<Date> condition) {
      myLimitingSinceDate = limitingSinceDate;
      myLimitingDate = limitingDate;
```

### BoundedWildcard
Can generalize to `? super T`
in `src/jetbrains/buildServer/server/rest/data/TimeCondition.java`
#### Snippet
```java
  @NotNull
  public <T> FilterAndLimitingDate<T> processTimeCondition(@NotNull final String timeLocatorText,
                                                            @NotNull final ValueExtractor<T, Date> valueExtractor,
                                                            @Nullable final ValueExtractor<BuildPromotion, Date> buildValueExtractor) {
    ParsedTimeCondition matcher;
```

### BoundedWildcard
Can generalize to `? extends Date`
in `src/jetbrains/buildServer/server/rest/data/TimeCondition.java`
#### Snippet
```java
  @NotNull
  public <T> FilterAndLimitingDate<T> processTimeCondition(@NotNull final String timeLocatorText,
                                                            @NotNull final ValueExtractor<T, Date> valueExtractor,
                                                            @Nullable final ValueExtractor<BuildPromotion, Date> buildValueExtractor) {
    ParsedTimeCondition matcher;
```

### BoundedWildcard
Can generalize to `? extends Finder`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
  public <FINDER_TYPE> TypedFinderDimensionWithDefaultChecker<ITEM, List<FINDER_TYPE>, Set<FINDER_TYPE>> dimensionWithFinder(
    @NotNull final Dimension<List<FINDER_TYPE>> dimension,
    @NotNull final Supplier<Finder<FINDER_TYPE>> finderValue,
    @NotNull String typeDescription
  ) {
```

### BoundedWildcard
Can generalize to `? super TYPE`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
  //============================= helper methods =============================

  private <TYPE> TypedFinderBuilder<ITEM> filter(@NotNull final Dimension<TYPE> dimension, @NotNull final Filter<TYPE, ITEM> filteringMapper) {
    DimensionCondition condition;
    if (Locator.LOCATOR_SINGLE_VALUE_UNUSED_NAME.equals(dimension.name)) {
```

### BoundedWildcard
Can generalize to `? super ITEM`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
  //============================= helper methods =============================

  private <TYPE> TypedFinderBuilder<ITEM> filter(@NotNull final Dimension<TYPE> dimension, @NotNull final Filter<TYPE, ITEM> filteringMapper) {
    DimensionCondition condition;
    if (Locator.LOCATOR_SINGLE_VALUE_UNUSED_NAME.equals(dimension.name)) {
```

### BoundedWildcard
Can generalize to `? extends Finder`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
   */
  public <FINDER_TYPE, MIDDLE> TypedFinderDimensionWithDefaultChecker<ITEM, List<FINDER_TYPE>, Set<FINDER_TYPE>>
  dimensionWithFinder(@NotNull final Dimension<List<FINDER_TYPE>> dimension, @NotNull final Supplier<Finder<FINDER_TYPE>> finderValue,
                      @NotNull final Function<FINDER_TYPE, MIDDLE> converter, @NotNull String typeDescription) {
    return dimension(dimension, mapper(dimensionValue -> getNotEmptyItems(finderValue.get(), dimensionValue)).acceptingType(typeDescription))
```

### BoundedWildcard
Can generalize to `? super FINDER_TYPE`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
  public <FINDER_TYPE, MIDDLE> TypedFinderDimensionWithDefaultChecker<ITEM, List<FINDER_TYPE>, Set<FINDER_TYPE>>
  dimensionWithFinder(@NotNull final Dimension<List<FINDER_TYPE>> dimension, @NotNull final Supplier<Finder<FINDER_TYPE>> finderValue,
                      @NotNull final Function<FINDER_TYPE, MIDDLE> converter, @NotNull String typeDescription) {
    return dimension(dimension, mapper(dimensionValue -> getNotEmptyItems(finderValue.get(), dimensionValue)).acceptingType(typeDescription))
      .defaultFilter((fromFilter, fromItem) -> {
```

### BoundedWildcard
Can generalize to `? super TYPE`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java

    private TypedFinderDimensionWithDefaultCheckerImpl(final @NotNull TypedFinderDimensionImpl<TYPE> original,
                                                       final @NotNull Filter<TYPE, TYPE_FOR_FILTER> defaultChecker) {
      myOriginal = original;
      myDefaultChecker = defaultChecker;
```

### BoundedWildcard
Can generalize to `? super TYPE_FOR_FILTER`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java

    private TypedFinderDimensionWithDefaultCheckerImpl(final @NotNull TypedFinderDimensionImpl<TYPE> original,
                                                       final @NotNull Filter<TYPE, TYPE_FOR_FILTER> defaultChecker) {
      myOriginal = original;
      myDefaultChecker = defaultChecker;
```

### BoundedWildcard
Can generalize to `? extends Set`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java

  @Nullable
  public static <T> Set<T> getIntersected(@Nullable List<Set<T>> dimensions) {
    if (dimensions == null || dimensions.size() == 0) {
      return null;
```

### BoundedWildcard
Can generalize to `? extends TYPE_FOR_FILTER`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java

    @NotNull
    public TypedFinderDimensionWithDefaultChecker<ITEM, TYPE, TYPE_FOR_FILTER> valueForDefaultFilter(@NotNull TypeFromItem<TYPE_FOR_FILTER, ITEM> retriever) {
      TypedFinderBuilder.this.filter(myOriginal.getDimension(), (value, item) -> {
        TYPE_FOR_FILTER valueForFilter = retriever.get(item);
```

### BoundedWildcard
Can generalize to `? super ITEM`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java

    @NotNull
    public TypedFinderDimensionWithDefaultChecker<ITEM, TYPE, TYPE_FOR_FILTER> valueForDefaultFilter(@NotNull TypeFromItem<TYPE_FOR_FILTER, ITEM> retriever) {
      TypedFinderBuilder.this.filter(myOriginal.getDimension(), (value, item) -> {
        TYPE_FOR_FILTER valueForFilter = retriever.get(item);
```

### BoundedWildcard
Can generalize to `? extends DuplicateChecker`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java

  @NotNull
  public TypedFinderBuilder<ITEM> duplicateCheckerSupplier(@NotNull Supplier<DuplicateChecker<ITEM>> duplicateCheckerSupplier) {
    myDuplicateCheckerSupplier = duplicateCheckerSupplier;
    return this;
```

### BoundedWildcard
Can generalize to `? super ITEM`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java

  @NotNull
  public TypedFinderBuilder<ITEM> locatorProvider(@NotNull LocatorProvider<ITEM> locatorProvider) {
    myLocatorProvider = locatorProvider;
    return this;
```

## RuleId[id=NullableProblems]
### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
    @Nullable final List<BuildPromotion> buildPromotions;

    private CompatibleLocatorParseResult(final List<SBuildType> buildTypes, final List<BuildPromotion> buildPromotions) {
      this.buildTypes = buildTypes;
      this.buildPromotions = buildPromotions;
```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
    @Nullable final List<BuildPromotion> buildPromotions;

    private CompatibleLocatorParseResult(final List<SBuildType> buildTypes, final List<BuildPromotion> buildPromotions) {
      this.buildTypes = buildTypes;
      this.buildPromotions = buildPromotions;
```

### NullableProblems
Primitive type members cannot be annotated
in `src/jetbrains/buildServer/server/rest/model/problem/Problem.java`
#### Snippet
```java
   * @return problem id
   */
  @NotNull
  public long getFromPosted(@NotNull final ServiceLocator serviceLocator) {
    try {
```

### NullableProblems
Primitive type members cannot be annotated
in `src/jetbrains/buildServer/server/rest/model/RelatedEntity.java`
#### Snippet
```java
    @Nullable private String type;
    @Nullable private String internalId; //type-specific internalId
    @Nullable private boolean unknown; //true if the types of the entity is unknown

    @Nullable private String text;
```

### NullableProblems
Primitive type members cannot be annotated
in `src/jetbrains/buildServer/server/rest/jersey/ExceptionMapperBase.java`
#### Snippet
```java

  public static class ResponseData {
    @NotNull private final int responseStatusCode;
    @Nullable private final String message;

```

### NullableProblems
Primitive type members cannot be annotated
in `src/jetbrains/buildServer/server/rest/jersey/ExceptionMapperBase.java`
#### Snippet
```java
    }

    @NotNull public int getResponseStatus() { return responseStatusCode;}
    @Nullable public String getMessage() { return message;}
  }
```

### NullableProblems
Primitive type members cannot be annotated
in `src/jetbrains/buildServer/server/graphql/model/mutation/agentPool/UpdateAgentPoolInput.java`
#### Snippet
```java

public class UpdateAgentPoolInput {
  @NotNull
  private int myRawId;
  @Nullable
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/debug/Sessions.java`
#### Snippet
```java
  }

  private long getSessionUserId(final @NotNull MBeanServer serverBean, final @NotNull ObjectName managerBean, final String sessionId) throws Exception {
    final String userKeyAttribute = getUserKeySessionAttribute(serverBean, managerBean, sessionId);
    // parsing UserImpl.toString to get user id
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/debug/Sessions.java`
#### Snippet
```java
  }

  private long getSessionUserId(final @NotNull MBeanServer serverBean, final @NotNull ObjectName managerBean, final String sessionId) throws Exception {
    final String userKeyAttribute = getUserKeySessionAttribute(serverBean, managerBean, sessionId);
    // parsing UserImpl.toString to get user id
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/debug/Sessions.java`
#### Snippet
```java

  @Nullable
  private String getUserKeySessionAttribute(final @NotNull MBeanServer serverBean, final @NotNull ObjectName managerBean, final String sessionId)
    throws InstanceNotFoundException, MBeanException, ReflectionException {
    return (String)serverBean.invoke(managerBean, "getSessionAttribute", new Object[]{sessionId, SESSION_USER_KEY_ATTRIBUTE_NAME}, SIGNATURE_SESSION_ATTRIBUTE);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/debug/Sessions.java`
#### Snippet
```java

  @Nullable
  private String getUserKeySessionAttribute(final @NotNull MBeanServer serverBean, final @NotNull ObjectName managerBean, final String sessionId)
    throws InstanceNotFoundException, MBeanException, ReflectionException {
    return (String)serverBean.invoke(managerBean, "getSessionAttribute", new Object[]{sessionId, SESSION_USER_KEY_ATTRIBUTE_NAME}, SIGNATURE_SESSION_ATTRIBUTE);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/util/AggregatedBuildArtifactsElementBuilder.java`
#### Snippet
```java

  @NotNull
  public static Element getBuildAggregatedArtifactElement(@NotNull final String path, @NotNull final List<BuildPromotion> builds, final @NotNull ServiceLocator serviceLocator) {
    final AggregatedBuildArtifactsElementBuilder result = new AggregatedBuildArtifactsElementBuilder();
    int i = 0;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudProfiles.java`
#### Snippet
```java
  public CloudProfiles() {}

  public CloudProfiles(final @NotNull List<jetbrains.buildServer.clouds.CloudProfile> items, final PagerData pagerData, @NotNull final Fields fields, @NotNull final BeanContext context) {
    cloudProfiles = ValueWithDefault.decideDefault(
      fields.isIncluded("cloudProfile", false, true),
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/jetbrains/buildServer/server/rest/data/RestContext.java`
#### Snippet
```java
 */
public class RestContext {
  private final static ThreadLocal<RestContext> ourThreadLocalInstance = new ThreadLocal<>();

  private final Function<String, Object> myFunction;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/federation/FederationServers.java`
#### Snippet
```java

  @NotNull
  private Function<TeamCityServer, FederationServer> toFederationServer(final @NotNull Fields fields) {
    return server -> new FederationServer(server, fields.getNestedField("server", Fields.SHORT, Fields.LONG));
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/files/Files.java`
#### Snippet
```java

  @NotNull
  static List<File> toFiles(final List<? extends Element> source, final @NotNull FileApiUrlBuilder builder, final @NotNull Fields fields, final @NotNull BeanContext beanContext) {
    return CollectionsUtil.convertCollection(source, new Converter<File, Element>() {
      public File createFrom(@NotNull final Element source) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/files/Files.java`
#### Snippet
```java

  @NotNull
  static List<File> toFiles(final List<? extends Element> source, final @NotNull FileApiUrlBuilder builder, final @NotNull Fields fields, final @NotNull BeanContext beanContext) {
    return CollectionsUtil.convertCollection(source, new Converter<File, Element>() {
      public File createFrom(@NotNull final Element source) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/files/Files.java`
#### Snippet
```java

  @NotNull
  static List<File> toFiles(final List<? extends Element> source, final @NotNull FileApiUrlBuilder builder, final @NotNull Fields fields, final @NotNull BeanContext beanContext) {
    return CollectionsUtil.convertCollection(source, new Converter<File, Element>() {
      public File createFrom(@NotNull final Element source) {
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `src/jetbrains/buildServer/server/rest/model/files/Files.java`
#### Snippet
```java
  }

  public static abstract class DefaultFilesProvider implements FilesProvider {
    @NotNull private final FileApiUrlBuilder myBuilder;
    @NotNull private final BeanContext myBeanContext;
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `src/jetbrains/buildServer/server/rest/model/files/Files.java`
#### Snippet
```java

    @NotNull
    abstract protected List<? extends Element> getItems();

    @Override
```

### MissortedModifiers
Missorted modifiers `final public`
in `src/jetbrains/buildServer/server/rest/util/CachingValue.java`
#### Snippet
```java

  @NotNull
  final public S get() {
    if (myValue == null) {
      myValue = doGet();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/ProblemTarget.java`
#### Snippet
```java
  }

  public ProblemTarget(final @NotNull MuteInfo item,
                       @NotNull final Fields fields,
                       @NotNull final BeanContext beanContext) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/jetbrains/buildServer/server/rest/util/ValueWithDefault.java`
#### Snippet
```java
 */
public class ValueWithDefault {
  final static Logger LOG = Logger.getInstance(ValueWithDefault.class.getName());

  /**
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesTrigger.java`
#### Snippet
```java
    public final Map<BuildTriggerDescriptor, Boolean> deps = new LinkedHashMap<>();

    public Storage(final @NotNull BuildTypeSettings buildTypeSettings) {
      for (BuildTriggerDescriptor entity : buildTypeSettings.getBuildTriggersCollection()) {
        deps.put(entity, buildTypeSettings.isEnabled(entity.getId()));
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesTrigger.java`
#### Snippet
```java
    }

    public void apply(final @NotNull BuildTypeSettings buildTypeSettings) {
      removeAllTriggers(buildTypeSettings);
      for (Map.Entry<BuildTriggerDescriptor, Boolean> entry : deps.entrySet()) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesSnapshotDep.java`
#### Snippet
```java
   * @return true if buildTypeSettings is modified
   */
  public boolean setToBuildType(final @NotNull BuildTypeSettingsEx buildTypeSettings, final @NotNull ServiceLocator serviceLocator) {
    final List<Dependency> originalDependencies = buildTypeSettings.getDependencies();
    try {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesSnapshotDep.java`
#### Snippet
```java
   * @return true if buildTypeSettings is modified
   */
  public boolean setToBuildType(final @NotNull BuildTypeSettingsEx buildTypeSettings, final @NotNull ServiceLocator serviceLocator) {
    final List<Dependency> originalDependencies = buildTypeSettings.getDependencies();
    try {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/nodes/EffectiveResponsibilities.java`
#### Snippet
```java

  @NotNull
  private Function<NodeResponsibility, Responsibility> toResponsibility(final @NotNull Fields fields) {
    return r -> new Responsibility(r, fields.getNestedField("responsibility", Fields.SHORT, Fields.LONG));
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/nodes/EnabledResponsibilities.java`
#### Snippet
```java

  @NotNull
  private Function<NodeResponsibility, Responsibility> toResponsibility(final @NotNull Fields fields) {
    return r -> new Responsibility(r, fields.getNestedField("responsibility", Fields.SHORT, Fields.LONG));
  }
```

### MissortedModifiers
Missorted modifiers `static public`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntity.java`
#### Snippet
```java
  }

  static public BeanContext getFakeBeanContext(@NotNull final ServiceLocator serviceLocator) {
    final ApiUrlBuilder apiUrlBuilder = new ApiUrlBuilder(path -> path);
    final BeanFactory beanFactory = new BeanFactory(null);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/build/Tags.java`
#### Snippet
```java

  @NotNull
  public List<TagData> getFromPosted(final @NotNull UserFinder userFinder) {
    if (tags == null) {
      return new ArrayList<TagData>();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/build/Tags.java`
#### Snippet
```java
  }

  public Tags(final @NotNull List <TagData> tagData, final @NotNull Fields fields, final @NotNull BeanContext beanContext) {
    tags = ValueWithDefault.decideDefault(fields.isIncluded("tag", false), new ValueWithDefault.Value<List<Tag>>() {
      @Nullable
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/build/Tags.java`
#### Snippet
```java
  }

  public Tags(final @NotNull List <TagData> tagData, final @NotNull Fields fields, final @NotNull BeanContext beanContext) {
    tags = ValueWithDefault.decideDefault(fields.isIncluded("tag", false), new ValueWithDefault.Value<List<Tag>>() {
      @Nullable
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/build/Tags.java`
#### Snippet
```java
  }

  public Tags(final @NotNull List <TagData> tagData, final @NotNull Fields fields, final @NotNull BeanContext beanContext) {
    tags = ValueWithDefault.decideDefault(fields.isIncluded("tag", false), new ValueWithDefault.Value<List<Tag>>() {
      @Nullable
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/change/VcsStatus.java`
#### Snippet
```java
  }

  public VcsStatus(@NotNull final VcsRootInstanceEx vcsRoot, final @NotNull Fields fields, @NotNull final BeanContext beanContext) {
    current = ValueWithDefault.decideDefault(fields.isIncluded("current", true),
                                             new VcsCheckStatus(vcsRoot.getStatus(), vcsRoot.getLastRequestor(), fields.getNestedField("current", Fields.LONG, Fields.LONG)));
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/change/RepositoryState.java`
#### Snippet
```java
  }

  public RepositoryState(@NotNull final jetbrains.buildServer.vcs.RepositoryState repositoryState, final @NotNull Fields fields, @NotNull final BeanContext beanContext) {
    this.timestamp = ValueWithDefault.decideDefault(fields.isIncluded("timestamp"), Util.formatTime(repositoryState.getCreateTimestamp()));

```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/change/VcsCheckStatus.java`
#### Snippet
```java
  }

  public VcsCheckStatus(@NotNull final VcsRootStatus status, @Nullable final OperationRequestor requestor, final @NotNull Fields fields) {
    this.status = ValueWithDefault.decideDefault(fields.isIncluded("status"), status.getType().toString().toLowerCase());
    this.timestamp = ValueWithDefault.decideDefault(fields.isIncluded("timestamp"), Util.formatTime(status.getTimestamp()));
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  }

  public static boolean shouldRestrictSettingsViewing(final @NotNull BuildTypeSettings buildType, final @NotNull PermissionChecker permissionChecker) {
    if (TeamCityProperties.getBooleanOrTrue("rest.beans.buildType.checkPermissions")) {
      return !permissionChecker.isPermissionGranted(Permission.VIEW_BUILD_CONFIGURATION_SETTINGS, buildType.getProject().getProjectId());
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  }

  public static boolean shouldRestrictSettingsViewing(final @NotNull BuildTypeSettings buildType, final @NotNull PermissionChecker permissionChecker) {
    if (TeamCityProperties.getBooleanOrTrue("rest.beans.buildType.checkPermissions")) {
      return !permissionChecker.isPermissionGranted(Permission.VIEW_BUILD_CONFIGURATION_SETTINGS, buildType.getProject().getProjectId());
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java

  @NotNull
  private BuildTypeOrTemplate createEmptyBuildTypeOrTemplate(final @NotNull ServiceLocator serviceLocator, final @NotNull SProject project, final @NotNull String name) {
    SubmitedParameters submittedParams = mySubmitted.get();
    if (submittedParams.templateFlag == null || !submittedParams.templateFlag) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java

  @NotNull
  private BuildTypeOrTemplate createEmptyBuildTypeOrTemplate(final @NotNull ServiceLocator serviceLocator, final @NotNull SProject project, final @NotNull String name) {
    SubmitedParameters submittedParams = mySubmitted.get();
    if (submittedParams.templateFlag == null || !submittedParams.templateFlag) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java

  @NotNull
  private BuildTypeOrTemplate createEmptyBuildTypeOrTemplate(final @NotNull ServiceLocator serviceLocator, final @NotNull SProject project, final @NotNull String name) {
    SubmitedParameters submittedParams = mySubmitted.get();
    if (submittedParams.templateFlag == null || !submittedParams.templateFlag) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  }

  private boolean initForIds(final @NotNull String externalId, final @Nullable String internalId, final @NotNull Fields fields, final @NotNull BeanContext beanContext) {
    final boolean canViewSettings;
    myBuildType = null;
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  }

  private boolean initForIds(final @NotNull String externalId, final @Nullable String internalId, final @NotNull Fields fields, final @NotNull BeanContext beanContext) {
    final boolean canViewSettings;
    myBuildType = null;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  }

  private boolean initForIds(final @NotNull String externalId, final @Nullable String internalId, final @NotNull Fields fields, final @NotNull BeanContext beanContext) {
    final boolean canViewSettings;
    myBuildType = null;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  }

  private boolean initForIds(final @NotNull String externalId, final @Nullable String internalId, final @NotNull Fields fields, final @NotNull BeanContext beanContext) {
    final boolean canViewSettings;
    myBuildType = null;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
   * @return true if there were modification attempts
   */
  private boolean fillBuildTypeOrTemplate(final @NotNull BuildTypeOrTemplatePatcher buildTypeOrTemplatePatcher, final @NotNull ServiceLocator serviceLocator) {
    boolean result = false;
    SubmitedParameters submittedParams = mySubmitted.get();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
   * @return true if there were modification attempts
   */
  private boolean fillBuildTypeOrTemplate(final @NotNull BuildTypeOrTemplatePatcher buildTypeOrTemplatePatcher, final @NotNull ServiceLocator serviceLocator) {
    boolean result = false;
    SubmitedParameters submittedParams = mySubmitted.get();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/problem/scope/TestScopesCollector.java`
#### Snippet
```java
  private static final long DEFAULT_COUNT = 100;

  public TestScopesCollector(final @NotNull TestOccurrenceFinder finder, final @NotNull TestScopeFilterProducer testScopeFilterProducer) {
    myTestOccurrenceFinder = finder;
    myTestScopeFilterProducer = testScopeFilterProducer;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/problem/scope/TestScopesCollector.java`
#### Snippet
```java
  private static final long DEFAULT_COUNT = 100;

  public TestScopesCollector(final @NotNull TestOccurrenceFinder finder, final @NotNull TestScopeFilterProducer testScopeFilterProducer) {
    myTestOccurrenceFinder = finder;
    myTestScopeFilterProducer = testScopeFilterProducer;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/project/PropEntityProjectFeature.java`
#### Snippet
```java
   */
  @NotNull
  public static SProjectFeatureDescriptor getFeatureByLocator(@NotNull final SProject project, final @NotNull String featureLocator) {
    return new ProjectFeatureFinder(project).getItem(featureLocator);
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/VcsRootEntry.java`
#### Snippet
```java
  }

  public VcsRootEntry(final @NotNull SVcsRoot vcsRootParam, @NotNull final BuildTypeOrTemplate buildType, @NotNull final Fields fields, @NotNull final BeanContext beanContext) {
    id = ValueWithDefault.decideIncludeByDefault(fields.isIncluded("id", true, true), vcsRootParam.getExternalId());
    inherited = ValueWithDefault.decideDefault(fields.isIncluded("inherited"), !isOwnVcsRoot(buildType, vcsRootParam));
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/change/BuildChange.java`
#### Snippet
```java
  }

  public BuildChange(BuildChangeData buildChange, final @NotNull Fields fields, @NotNull final BeanContext beanContext) {
    nextBuild = ValueWithDefault.decideDefault(fields.isIncluded("nextBuild"), () -> Util.resolveNull(buildChange.getNextBuild(), (b) -> new Build(b, fields.getNestedField("nextBuild"), beanContext)));
    prevBuild = ValueWithDefault.decideDefault(fields.isIncluded("prevBuild"), () -> Util.resolveNull(buildChange.getPreviousBuild(), (b) -> new Build(b, fields.getNestedField("prevBuild"), beanContext)));
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/Property.java`
#### Snippet
```java

  @Nullable
  private static String getSecureValue(final @NotNull Parameter parameter, final @NotNull ServiceLocator serviceLocator) {
    final ParameterFactory parameterFactory = serviceLocator.getSingletonService(ParameterFactory.class);
    return parameterFactory.getRawValue(parameter);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/Property.java`
#### Snippet
```java

  @Nullable
  private static String getSecureValue(final @NotNull Parameter parameter, final @NotNull ServiceLocator serviceLocator) {
    final ParameterFactory parameterFactory = serviceLocator.getSingletonService(ParameterFactory.class);
    return parameterFactory.getRawValue(parameter);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/Property.java`
#### Snippet
```java
  }

  public static boolean isPropertyToExclude(@NotNull final String key, @Nullable final String value, final @NotNull ServiceLocator serviceLocator) {
    //TeamCity API question: or should jetbrains.buildServer.agent.Constants.SECURE_PROPERTY_PREFIX be used here?
    if (key.startsWith(SVcsRoot.SECURE_PROPERTY_PREFIX)) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/Property.java`
#### Snippet
```java
  }

  public static boolean includeSecureProperties(final @NotNull ServiceLocator serviceLocator) {
    //noinspection ConstantConditions
    return TeamCityProperties.getBoolean("rest.listSecureProperties") &&
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/change/VcsRootInstance.java`
#### Snippet
```java
  }

  public VcsRootInstance(final jetbrains.buildServer.vcs.VcsRootInstance root, final @NotNull Fields fields, @NotNull final BeanContext beanContext) {
    myRoot = root;

```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
  }

  private boolean hasDimensions(final @NotNull String locatorText) {
    if (locatorText.contains(DIMENSION_NAME_VALUE_DELIMITER)) {
      return true;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java

  @Nullable
  private static String getBase64UnescapedSingleValue(final @NotNull String text, final boolean extendedMode) {
    if (!TeamCityProperties.getBooleanOrTrue("rest.locator.allowBase64")) return null;
    if (!text.startsWith(BASE64_ESCAPE_FAKE_DIMENSION + DIMENSION_NAME_VALUE_DELIMITER)) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/change/VcsRoot.java`
#### Snippet
```java
  }

  public static boolean shouldRestrictSettingsViewing(final @NotNull SVcsRoot root, final @NotNull PermissionChecker permissionChecker) {
    //see also jetbrains.buildServer.server.rest.data.finder.impl.VcsRootFinder.checkPermission
    if (TeamCityProperties.getBooleanOrTrue("rest.beans.vcsRoot.checkPermissions")) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/change/VcsRoot.java`
#### Snippet
```java
  }

  public static boolean shouldRestrictSettingsViewing(final @NotNull SVcsRoot root, final @NotNull PermissionChecker permissionChecker) {
    //see also jetbrains.buildServer.server.rest.data.finder.impl.VcsRootFinder.checkPermission
    if (TeamCityProperties.getBooleanOrTrue("rest.beans.vcsRoot.checkPermissions")) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/Investigation.java`
#### Snippet
```java
  }

  public Investigation(final @NotNull InvestigationWrapper investigation,
                       final @NotNull Fields fields,
                       final @NotNull BeanContext beanContext) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/Investigation.java`
#### Snippet
```java

  public Investigation(final @NotNull InvestigationWrapper investigation,
                       final @NotNull Fields fields,
                       final @NotNull BeanContext beanContext) {
    final ResponsibilityEntry.State stateOjbect = investigation.getState();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/Investigation.java`
#### Snippet
```java
  public Investigation(final @NotNull InvestigationWrapper investigation,
                       final @NotNull Fields fields,
                       final @NotNull BeanContext beanContext) {
    final ResponsibilityEntry.State stateOjbect = investigation.getState();
    state = ValueWithDefault.decideDefault(fields.isIncluded("state"), stateOjbect.name());
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/build/Tag.java`
#### Snippet
```java
  }

  public Tag(final @NotNull String tagName, final @Nullable jetbrains.buildServer.users.User owner,
             final @NotNull Fields fields,
             final @NotNull BeanContext beanContext) {
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/model/build/Tag.java`
#### Snippet
```java
  }

  public Tag(final @NotNull String tagName, final @Nullable jetbrains.buildServer.users.User owner,
             final @NotNull Fields fields,
             final @NotNull BeanContext beanContext) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/build/Tag.java`
#### Snippet
```java

  public Tag(final @NotNull String tagName, final @Nullable jetbrains.buildServer.users.User owner,
             final @NotNull Fields fields,
             final @NotNull BeanContext beanContext) {
    this.name = ValueWithDefault.decideDefault(fields.isIncluded("name"), tagName);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/build/Tag.java`
#### Snippet
```java
  public Tag(final @NotNull String tagName, final @Nullable jetbrains.buildServer.users.User owner,
             final @NotNull Fields fields,
             final @NotNull BeanContext beanContext) {
    this.name = ValueWithDefault.decideDefault(fields.isIncluded("name"), tagName);
    this.privateTag = ValueWithDefault.decideDefault(fields.isIncluded("private"), owner != null);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/problem/scope/TestScopeTreeCollector.java`
#### Snippet
```java
    .add("childrenCount", Comparator.comparing(node -> node.getChildren().size()));

  public TestScopeTreeCollector(final @NotNull TestScopesCollector scopesCollector, final @NotNull TestOccurrenceFinder testOccurrenceFinder) {
    myScopeCollector = scopesCollector;
    myTestOccurrenceFinder = testOccurrenceFinder;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/problem/scope/TestScopeTreeCollector.java`
#### Snippet
```java
    .add("childrenCount", Comparator.comparing(node -> node.getChildren().size()));

  public TestScopeTreeCollector(final @NotNull TestScopesCollector scopesCollector, final @NotNull TestOccurrenceFinder testOccurrenceFinder) {
    myScopeCollector = scopesCollector;
    myTestOccurrenceFinder = testOccurrenceFinder;
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/model/agent/Agents.java`
#### Snippet
```java
  }

  private void init(final @Nullable Collection<SBuildAgent> agentObjects,
                    final @Nullable PagerData pagerData,
                    final @NotNull Fields fields,
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/model/agent/Agents.java`
#### Snippet
```java

  private void init(final @Nullable Collection<SBuildAgent> agentObjects,
                    final @Nullable PagerData pagerData,
                    final @NotNull Fields fields,
                    final @NotNull BeanContext beanContext) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/agent/Agents.java`
#### Snippet
```java
  private void init(final @Nullable Collection<SBuildAgent> agentObjects,
                    final @Nullable PagerData pagerData,
                    final @NotNull Fields fields,
                    final @NotNull BeanContext beanContext) {
    if (agentObjects != null) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/agent/Agents.java`
#### Snippet
```java
                    final @Nullable PagerData pagerData,
                    final @NotNull Fields fields,
                    final @NotNull BeanContext beanContext) {
    if (agentObjects != null) {
      agents = ValueWithDefault.decideDefault(fields.isIncluded(AGENT, false, true), () -> {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/ProblemOccurrenceRequest.java`
#### Snippet
```java
  }

  public static String getHref(final @NotNull BuildPromotion buildPromotion) {
    return API_SUB_URL + "?locator=" + ProblemOccurrenceFinder.getProblemOccurrenceLocator(buildPromotion);
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/ProblemOccurrenceRequest.java`
#### Snippet
```java
  }

  public static String getHref(final @NotNull SBuild build) {
    return API_SUB_URL + "?locator=" + ProblemOccurrenceFinder.getProblemOccurrenceLocator(build);
  }
```

### MissortedModifiers
Missorted modifiers `final private`
in `src/jetbrains/buildServer/server/rest/util/BuildTypeOrTemplate.java`
#### Snippet
```java
 */
public class BuildTypeOrTemplate implements Loggable {
  @Nullable final private SBuildType myBuildType;
  @Nullable final private BuildTypeTemplate myTemplate;
  @NotNull final private BuildTypeIdentity myBuildTypeIdentity;
```

### MissortedModifiers
Missorted modifiers `final private`
in `src/jetbrains/buildServer/server/rest/util/BuildTypeOrTemplate.java`
#### Snippet
```java
  @Nullable final private SBuildType myBuildType;
  @Nullable final private BuildTypeTemplate myTemplate;
  @NotNull final private BuildTypeIdentity myBuildTypeIdentity;
  @Nullable private Boolean myInherited = null; //used in template lists only

```

### MissortedModifiers
Missorted modifiers `final private`
in `src/jetbrains/buildServer/server/rest/util/BuildTypeOrTemplate.java`
#### Snippet
```java
public class BuildTypeOrTemplate implements Loggable {
  @Nullable final private SBuildType myBuildType;
  @Nullable final private BuildTypeTemplate myTemplate;
  @NotNull final private BuildTypeIdentity myBuildTypeIdentity;
  @Nullable private Boolean myInherited = null; //used in template lists only
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesAgentRequirement.java`
#### Snippet
```java
    }

    public void apply(final @NotNull BuildTypeSettings buildTypeSettings) {
      removeAll(buildTypeSettings);
      for (Requirement item : deps) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesAgentRequirement.java`
#### Snippet
```java
    private final Map<String, Boolean> enabledData = new HashMap<>();

    public Storage(final @NotNull BuildTypeSettings buildTypeSettings) {
      for (Requirement item : buildTypeSettings.getRequirements()) {
        deps.add(item);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesAgentRequirement.java`
#### Snippet
```java
  }

  private static void removeAll(final @NotNull BuildTypeSettings buildTypeSettings) {
    for (Requirement entry : buildTypeSettings.getRequirements()) {
      buildTypeSettings.removeRequirement(entry);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/Entry.java`
#### Snippet
```java
  }

  public Entry(@Nullable String name, @Nullable String value, final @NotNull Fields fields) {
    this.name =  ValueWithDefault.decideIncludeByDefault(fields.isIncluded("name", true, true), name);
    this.value = ValueWithDefault.decideIncludeByDefault(fields.isIncluded("value", true, true), value);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/server/CleanupSettings.java`
#### Snippet
```java
  }

  public CleanupSettings(final @NotNull ServerCleanupManager serverCleanupManager) {
    enabled = serverCleanupManager.isCleanupEnabled();
    maxCleanupDuration = serverCleanupManager.getMaxCleanupDuration();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesFeature.java`
#### Snippet
```java
    }

    public void apply(final @NotNull BuildTypeSettings buildTypeSettings){
      removeAllFeatures(buildTypeSettings);
      for (Map.Entry<SBuildFeatureDescriptor, Boolean> entry : deps.entrySet()) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesFeature.java`
#### Snippet
```java
    public final Map<SBuildFeatureDescriptor, Boolean> deps = new LinkedHashMap<>();

    public Storage(final @NotNull BuildTypeSettings buildTypeSettings) {
      for (SBuildFeatureDescriptor dependency : buildTypeSettings.getBuildFeatures()) {
        deps.put(dependency, buildTypeSettings.isEnabled(dependency.getId()));
```

### MissortedModifiers
Missorted modifiers `final @PathParam("queuePosition")`
in `src/jetbrains/buildServer/server/rest/request/BuildQueueRequest.java`
#### Snippet
```java
  }

  private int getQueuePositionNumber(final @PathParam("queuePosition") String queuePosition) {
    try {
      if ("first".equals(queuePosition)) return 1;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootFinder.java`
#### Snippet
```java
                       @NotNull ProjectManager projectManager,
                       @NotNull VcsRootIdentifiersManager vcsRootIdentifiersManager,
                       final @NotNull PermissionChecker permissionChecker) {
    super(DIMENSION_ID, NAME, TYPE, PROJECT, AFFECTED_PROJECT, PROPERTY, REPOSITORY_ID_STRING, INTERNAL_ID, UUID,
          Locator.LOCATOR_SINGLE_VALUE_UNUSED_NAME);
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/jetbrains/buildServer/server/rest/jersey/JacksonObjectMapperResolver.java`
#### Snippet
```java
public class JacksonObjectMapperResolver implements ContextResolver<ObjectMapper> {

  final static Logger LOG = Logger.getInstance(JacksonObjectMapperResolver.class.getName());

  private final ObjectMapper myMapper;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/ParametersSubResource.java`
#### Snippet
```java
  @Nullable protected final String myParametersHref;

  public ParametersSubResource(final @NotNull BeanContext beanContext,
                               final @NotNull ParametersPersistableEntity entityWithParameters,
                               final @Nullable String parametersHref) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/ParametersSubResource.java`
#### Snippet
```java

  public ParametersSubResource(final @NotNull BeanContext beanContext,
                               final @NotNull ParametersPersistableEntity entityWithParameters,
                               final @Nullable String parametersHref) {
    myBeanContext = beanContext;
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/request/ParametersSubResource.java`
#### Snippet
```java
  public ParametersSubResource(final @NotNull BeanContext beanContext,
                               final @NotNull ParametersPersistableEntity entityWithParameters,
                               final @Nullable String parametersHref) {
    myBeanContext = beanContext;
    myEntityWithParameters = entityWithParameters;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/problem/Mute.java`
#### Snippet
```java
  }

  public Mute(final @NotNull MuteInfo item, @NotNull final Fields fields, final @NotNull BeanContext beanContext) {
    id = ValueWithDefault.decideDefault(fields.isIncluded("id"), item.getId());
    href = ValueWithDefault.decideDefault(fields.isIncluded("href"), beanContext.getApiUrlBuilder().transformRelativePath(MuteRequest.getHref(item)));
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/problem/Mute.java`
#### Snippet
```java
  }

  public Mute(final @NotNull MuteInfo item, @NotNull final Fields fields, final @NotNull BeanContext beanContext) {
    id = ValueWithDefault.decideDefault(fields.isIncluded("id"), item.getId());
    href = ValueWithDefault.decideDefault(fields.isIncluded("href"), beanContext.getApiUrlBuilder().transformRelativePath(MuteRequest.getHref(item)));
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/problem/Mute.java`
#### Snippet
```java

  @NotNull
  public MuteData getFromPosted(final @NotNull ServiceLocator serviceLocator) {
    if (scope == null) {
      throw new BadRequestException("Bad 'mute' entity: missing 'scope'");
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/ParameterCondition.java`
#### Snippet
```java
  }

  private boolean matchesInternal(final @NotNull ParametersProvider parametersProvider) {
    String constantValueIfSimpleEqualsCondition = myNameCondition.getConstantValueIfSimpleEqualsCondition();
    if (!StringUtil.isEmpty(constantValueIfSimpleEqualsCondition)) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/ParameterCondition.java`
#### Snippet
```java
   */
  @NotNull
  public Stream<Parameter> filterAllMatchingParameters(final @NotNull ParametersProvider parametersProvider) {
    // It is unclear what to do in a case when myNameCheckShouldMatchAll is true and some parameters do not pass this check.
    if (myNameCheckShouldMatchAll) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java
    public M get(final @Nullable String locator, final @NotNull Fields fields, final @NotNull BeanContext beanContext);

    public void replaceAll(final @NotNull M newEntities, final @NotNull ServiceLocator serviceLocator);

    ParametersPersistableEntity getParametersHolder(final @NotNull String featureLocator);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java
    public M get(final @Nullable String locator, final @NotNull Fields fields, final @NotNull BeanContext beanContext);

    public void replaceAll(final @NotNull M newEntities, final @NotNull ServiceLocator serviceLocator);

    ParametersPersistableEntity getParametersHolder(final @NotNull String featureLocator);
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java

    @NotNull
    public M get(final @Nullable String locator, final @NotNull Fields fields, final @NotNull BeanContext beanContext);

    public void replaceAll(final @NotNull M newEntities, final @NotNull ServiceLocator serviceLocator);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java

    @NotNull
    public M get(final @Nullable String locator, final @NotNull Fields fields, final @NotNull BeanContext beanContext);

    public void replaceAll(final @NotNull M newEntities, final @NotNull ServiceLocator serviceLocator);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java

    @NotNull
    public M get(final @Nullable String locator, final @NotNull Fields fields, final @NotNull BeanContext beanContext);

    public void replaceAll(final @NotNull M newEntities, final @NotNull ServiceLocator serviceLocator);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java
  }

  public FeatureSubResource(final @NotNull BeanContext beanContext, final @NotNull Entity<M, S> entity) {
    myEntity = entity;
    myBeanContext = beanContext;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java
  }

  public FeatureSubResource(final @NotNull BeanContext beanContext, final @NotNull Entity<M, S> entity) {
    myEntity = entity;
    myBeanContext = beanContext;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java
     */
    @NotNull
    public String add(final @NotNull S entityToAdd, final @NotNull ServiceLocator serviceLocator);

    @NotNull
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java
     */
    @NotNull
    public String add(final @NotNull S entityToAdd, final @NotNull ServiceLocator serviceLocator);

    @NotNull
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java
    public S getSingle(final @NotNull String featureLocator, final @NotNull Fields fields, final @NotNull BeanContext beanContext);

    public void delete(final @NotNull String featureLocator, final @NotNull ServiceLocator serviceLocator);

    /**
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java
    public S getSingle(final @NotNull String featureLocator, final @NotNull Fields fields, final @NotNull BeanContext beanContext);

    public void delete(final @NotNull String featureLocator, final @NotNull ServiceLocator serviceLocator);

    /**
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java
    public void replaceAll(final @NotNull M newEntities, final @NotNull ServiceLocator serviceLocator);

    ParametersPersistableEntity getParametersHolder(final @NotNull String featureLocator);

    String getHref();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java

    @NotNull
    public S getSingle(final @NotNull String featureLocator, final @NotNull Fields fields, final @NotNull BeanContext beanContext);

    public void delete(final @NotNull String featureLocator, final @NotNull ServiceLocator serviceLocator);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java

    @NotNull
    public S getSingle(final @NotNull String featureLocator, final @NotNull Fields fields, final @NotNull BeanContext beanContext);

    public void delete(final @NotNull String featureLocator, final @NotNull ServiceLocator serviceLocator);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java

    @NotNull
    public S getSingle(final @NotNull String featureLocator, final @NotNull Fields fields, final @NotNull BeanContext beanContext);

    public void delete(final @NotNull String featureLocator, final @NotNull ServiceLocator serviceLocator);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java
     */
    @NotNull
    public String replace(final @NotNull String featureLocator, final @NotNull S newFeature, final @NotNull ServiceLocator serviceLocator);

    /**
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java
     */
    @NotNull
    public String replace(final @NotNull String featureLocator, final @NotNull S newFeature, final @NotNull ServiceLocator serviceLocator);

    /**
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FeatureSubResource.java`
#### Snippet
```java
     */
    @NotNull
    public String replace(final @NotNull String featureLocator, final @NotNull S newFeature, final @NotNull ServiceLocator serviceLocator);

    /**
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/MuteFinder.java`
#### Snippet
```java

  @NotNull
  private Stream<MuteInfo> getTestsMutes(final @NotNull SProject project) {
    /* this returns the original mutes state, so does not work (TW-53393)
    return myProblemMutingService.getTestsCurrentMuteInfo(project).values().stream().flatMap(currentMute -> getMutes(currentMute)).distinct(); //check is distinct can be reimplemented to be more effective here
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/MuteFinder.java`
#### Snippet
```java

  @NotNull
  private Stream<MuteInfo> getProblemsMutes(final @NotNull SProject project) {
    /* this returns the original mutes state, so does not work (TW-53393)
    return myProblemMutingService.getBuildProblemsCurrentMuteInfo(project).values().stream().flatMap(currentMute -> getMutes(currentMute)).distinct();  //check is distinct can be reimplemented to be more effective here
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/user/PermissionAssignment.java`
#### Snippet
```java

  @NotNull
  private static Project getProject(final @NotNull String internalProjectId, final @NotNull Fields field, final @NotNull BeanContext beanContext) {
    ProjectManager projectManager = beanContext.getSingletonService(ProjectManager.class);
    try {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/user/PermissionAssignment.java`
#### Snippet
```java

  @NotNull
  private static Project getProject(final @NotNull String internalProjectId, final @NotNull Fields field, final @NotNull BeanContext beanContext) {
    ProjectManager projectManager = beanContext.getSingletonService(ProjectManager.class);
    try {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/user/PermissionAssignment.java`
#### Snippet
```java

  @NotNull
  private static Project getProject(final @NotNull String internalProjectId, final @NotNull Fields field, final @NotNull BeanContext beanContext) {
    ProjectManager projectManager = beanContext.getSingletonService(ProjectManager.class);
    try {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/problem/Resolution.java`
#### Snippet
```java
    }

    public static ResolutionType getType(final @NotNull UnmuteOptions unmuteOptions) {
      if (unmuteOptions.isUnmuteManually()) {
        return ResolutionType.manually;
```

### MissortedModifiers
Missorted modifiers `final @PathParam("areaId")`
in `src/jetbrains/buildServer/server/rest/request/ServerRequest.java`
#### Snippet
```java

  @NotNull
  private Permission getAreaPermission(final @PathParam("areaId") String areaId) {
    return "logs".equals(areaId) ? Permission.MANAGE_SERVER_INSTALLATION : Permission.VIEW_SERVER_SETTINGS;
  }
```

### MissortedModifiers
Missorted modifiers `final @PathParam("areaId")`
in `src/jetbrains/buildServer/server/rest/request/ServerRequest.java`
#### Snippet
```java

  @NotNull
  private File getAreaRoot(final @PathParam("areaId") String areaId) {
    File rootPath;
    if ("logs".equals(areaId)) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/metrics/MetricValues.java`
#### Snippet
```java
  }

  public MetricValues(@NotNull Map<MetricValueKey, Double> valuesMap, final @NotNull Fields fields) {
    values = ValueWithDefault.decideDefault(
      fields.isIncluded("metricValues", true),
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootInstanceFinder.java`
#### Snippet
```java

  @NotNull
  private Set<VcsRootInstance> getInstances(final @NotNull String buildTypesLocator, @Nullable final Boolean versionedSettingsUsagesOnly) {
    List<BuildTypeOrTemplate> buildTypes = getBuildTypeOrTemplates(buildTypesLocator);
    TreeSet<VcsRootInstance> result = new TreeSet<>(VCS_ROOT_INSTANCE_COMPARATOR);
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootInstanceFinder.java`
#### Snippet
```java

  @NotNull
  private VcsRootInstance getVcsRootInstanceById(final @Nullable Long parsedId) {
    if (parsedId == null) {
      throw new BadRequestException("Expecting VCS root instance id, found empty value.");
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootInstanceFinder.java`
#### Snippet
```java
                               @NotNull VersionedSettingsManager versionedSettingsManager,
                               @NotNull TimeCondition timeCondition,
                               final @NotNull PermissionChecker permissionChecker,
                               @NotNull final ServiceLocator serviceLocator) {
    super(DIMENSION_ID, TYPE, PROJECT, AFFECTED_PROJECT, PROPERTY, REPOSITORY_ID_STRING,
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ProjectFinder.java`
#### Snippet
```java

  @Nullable
  private SProject getParentProject(final @NotNull Locator locator) {
    String parentProjectLocator = locator.getSingleDimensionValue(DIMENSION_PARENT_PROJECT); //compatibility mode for versions <9.1
    if (parentProjectLocator == null) parentProjectLocator = locator.getSingleDimensionValue(DIMENSION_AFFECTED_PROJECT);
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ProjectFinder.java`
#### Snippet
```java

  @NotNull
  public PagedSearchResult<SProject> getItems(final @Nullable SProject parentProject, final @Nullable String projectLocator) {
    String actualLocator = projectLocator;
    if (parentProject != null && (projectLocator == null || !(new Locator(projectLocator)).isSingleValue())) {
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ProjectFinder.java`
#### Snippet
```java

  @NotNull
  public PagedSearchResult<SProject> getItems(final @Nullable SProject parentProject, final @Nullable String projectLocator) {
    String actualLocator = projectLocator;
    if (parentProject != null && (projectLocator == null || !(new Locator(projectLocator)).isSingleValue())) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/agent/Compatibility.java`
#### Snippet
```java
    private final String myDescription;

    public BasicAgentCompatibilityData(final @NotNull SBuildAgent agent, final @NotNull SBuildType buildType, boolean compatible, String description) {
      myAgent = agent;
      myBuildType = buildType;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/agent/Compatibility.java`
#### Snippet
```java
    private final String myDescription;

    public BasicAgentCompatibilityData(final @NotNull SBuildAgent agent, final @NotNull SBuildType buildType, boolean compatible, String description) {
      myAgent = agent;
      myBuildType = buildType;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/agent/Compatibility.java`
#### Snippet
```java
    private final AgentCompatibility myCompatibility;

    public ActualAgentCompatibilityData(final @NotNull AgentCompatibility compatibility, final @NotNull SBuildAgent agent) {
      myAgent = agent;
      myCompatibility = compatibility;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/agent/Compatibility.java`
#### Snippet
```java
    private final AgentCompatibility myCompatibility;

    public ActualAgentCompatibilityData(final @NotNull AgentCompatibility compatibility, final @NotNull SBuildAgent agent) {
      myAgent = agent;
      myCompatibility = compatibility;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/problem/Test.java`
#### Snippet
```java
  }

  public Test(final @NotNull STest test, final @NotNull BeanContext beanContext, @NotNull final Fields fields) {
    id = ValueWithDefault.decideDefault(fields.isIncluded("id"), String.valueOf(test.getTestNameId()));
    name = ValueWithDefault.decideDefault(fields.isIncluded("name"), test.getName().getAsString());
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/problem/Test.java`
#### Snippet
```java
  }

  public Test(final @NotNull STest test, final @NotNull BeanContext beanContext, @NotNull final Fields fields) {
    id = ValueWithDefault.decideDefault(fields.isIncluded("id"), String.valueOf(test.getTestNameId()));
    name = ValueWithDefault.decideDefault(fields.isIncluded("name"), test.getName().getAsString());
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/server/LicenseKeyEntities.java`
#### Snippet
```java
  }

  private List<LicenseKeyEntity> getLicenseKeys(final @NotNull Collection<LicenseKey> licenseKeys, final @Nullable Collection<LicenseKey> activeLicenseKeys, final @NotNull Fields fields) {
    Ordering<LicenseKeyData> licenseKeyDataComparator = Ordering
      .natural().reverse().nullsFirst().onResultOf((LicenseKeyData input) -> input == null ? null : input.getExpirationDate())
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/model/server/LicenseKeyEntities.java`
#### Snippet
```java
  }

  private List<LicenseKeyEntity> getLicenseKeys(final @NotNull Collection<LicenseKey> licenseKeys, final @Nullable Collection<LicenseKey> activeLicenseKeys, final @NotNull Fields fields) {
    Ordering<LicenseKeyData> licenseKeyDataComparator = Ordering
      .natural().reverse().nullsFirst().onResultOf((LicenseKeyData input) -> input == null ? null : input.getExpirationDate())
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/server/LicenseKeyEntities.java`
#### Snippet
```java
  }

  private List<LicenseKeyEntity> getLicenseKeys(final @NotNull Collection<LicenseKey> licenseKeys, final @Nullable Collection<LicenseKey> activeLicenseKeys, final @NotNull Fields fields) {
    Ordering<LicenseKeyData> licenseKeyDataComparator = Ordering
      .natural().reverse().nullsFirst().onResultOf((LicenseKeyData input) -> input == null ? null : input.getExpirationDate())
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/problem/TestOccurrence.java`
#### Snippet
```java
  public TestOccurrence() { }

  public TestOccurrence(final @NotNull STestRun testRun, final @NotNull BeanContext beanContext, @NotNull final Fields fields) {
    myTestRun = testRun;
    myBeanContext = beanContext;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/problem/TestOccurrence.java`
#### Snippet
```java
  public TestOccurrence() { }

  public TestOccurrence(final @NotNull STestRun testRun, final @NotNull BeanContext beanContext, @NotNull final Fields fields) {
    myTestRun = testRun;
    myBeanContext = beanContext;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/metrics/MetricTags.java`
#### Snippet
```java
  }

  public MetricTags(@NotNull Map<String, String> tagsMap, final @NotNull Fields fields) {
    tags = ValueWithDefault.decideDefault(
      fields.isIncluded("tag", true),
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/TestRequest.java`
#### Snippet
```java
  }

  public static String getHref(final @NotNull STest test) {
    return API_SUB_URL + "/" + TestFinder.getTestLocator(test);
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/server/LicensingData.java`
#### Snippet
```java
  }

  public LicensingData(final @NotNull LicenseKeysManager licenseKeysManager, final @NotNull Fields fields, @NotNull final BeanContext beanContext) {
    myFields = fields;

```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/server/LicensingData.java`
#### Snippet
```java
  }

  public LicensingData(final @NotNull LicenseKeysManager licenseKeysManager, final @NotNull Fields fields, @NotNull final BeanContext beanContext) {
    myFields = fields;

```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildFinder.java`
#### Snippet
```java

  @NotNull
  private BuildPromotion getBuildPromotionInternal(final @Nullable SBuildType buildType, @Nullable final String buildLocator) {
    final BuildPromotion promotion = myBuildPromotionFinder.getBuildPromotion(buildType, buildLocator);
    if (!TeamCityProperties.getBoolean(REST_RETURN_ONLY_STARTED_BUILDS)) {
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildFinder.java`
#### Snippet
```java
  //todo: get rid of most usages of this, use getBuildPromotion instead (but there are some TeamCity API issue)
  @NotNull
  public SBuild getBuild(final @Nullable SBuildType buildType, final @Nullable String buildLocator) {
    final BuildPromotion promotion = getBuildPromotion(buildType, buildLocator);
    final SBuild associatedBuild = promotion.getAssociatedBuild();
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildFinder.java`
#### Snippet
```java
  //todo: get rid of most usages of this, use getBuildPromotion instead (but there are some TeamCity API issue)
  @NotNull
  public SBuild getBuild(final @Nullable SBuildType buildType, final @Nullable String buildLocator) {
    final BuildPromotion promotion = getBuildPromotion(buildType, buildLocator);
    final SBuild associatedBuild = promotion.getAssociatedBuild();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildFinder.java`
#### Snippet
```java
  protected static final String REST_RETURN_ONLY_STARTED_BUILDS = "rest.request.builds.returnOnlyStartedBuilds";

  public BuildFinder(final @NotNull ServiceLocator serviceLocator,
                     final @NotNull BuildTypeFinder buildTypeFinder,
                     final @NotNull ProjectFinder projectFinder,
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildFinder.java`
#### Snippet
```java

  public BuildFinder(final @NotNull ServiceLocator serviceLocator,
                     final @NotNull BuildTypeFinder buildTypeFinder,
                     final @NotNull ProjectFinder projectFinder,
                     final @NotNull UserFinder userFinder,
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildFinder.java`
#### Snippet
```java
  public BuildFinder(final @NotNull ServiceLocator serviceLocator,
                     final @NotNull BuildTypeFinder buildTypeFinder,
                     final @NotNull ProjectFinder projectFinder,
                     final @NotNull UserFinder userFinder,
                     final @NotNull BuildPromotionFinder buildPromotionFinder,
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildFinder.java`
#### Snippet
```java
                     final @NotNull BuildTypeFinder buildTypeFinder,
                     final @NotNull ProjectFinder projectFinder,
                     final @NotNull UserFinder userFinder,
                     final @NotNull BuildPromotionFinder buildPromotionFinder,
                     final @NotNull AgentFinder agentFinder) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildFinder.java`
#### Snippet
```java
                     final @NotNull ProjectFinder projectFinder,
                     final @NotNull UserFinder userFinder,
                     final @NotNull BuildPromotionFinder buildPromotionFinder,
                     final @NotNull AgentFinder agentFinder) {
    myServiceLocator = serviceLocator;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildFinder.java`
#### Snippet
```java
                     final @NotNull UserFinder userFinder,
                     final @NotNull BuildPromotionFinder buildPromotionFinder,
                     final @NotNull AgentFinder agentFinder) {
    myServiceLocator = serviceLocator;
    myBuildTypeFinder = buildTypeFinder;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/agent/AgentPool.java`
#### Snippet
```java
  }

  public AgentPool(@NotNull final jetbrains.buildServer.serverSide.agentPools.AgentPool agentPool, final @NotNull Fields fields, @NotNull final BeanContext beanContext) {
    id = ValueWithDefault.decideIncludeByDefault(fields.isIncluded("id"), agentPool.getAgentPoolId());
    name = ValueWithDefault.decideIncludeByDefault(fields.isIncluded("name"), agentPool.getName());
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/agent/AgentPool.java`
#### Snippet
```java

  @Nullable
  private static Integer getMaxAgents(final @NotNull jetbrains.buildServer.serverSide.agentPools.AgentPool agentPool) {
    int maxAgents = agentPool.getMaxAgents();
    return maxAgents == AgentPoolLimits.DEFAULT.getMaxAgents() ? null : agentPool.getMaxAgents();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/RelatedEntities.java`
#### Snippet
```java
  }

  public RelatedEntities(final @NotNull List<RelatedEntity.Entity> items, @NotNull final Fields fields, @NotNull final BeanContext context) {
    entities = ValueWithDefault.decideDefault(fields.isIncluded("entity", false, true),
                                                 () -> items.stream().map(i -> new RelatedEntity(i, fields.getNestedField("entity", Fields.NONE, Fields.LONG), context)).collect(Collectors.toList()));
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/problem/TestFinder.java`
#### Snippet
```java

  @NotNull
  public static String getTestLocator(final @NotNull STest test) {
    return getTestLocator(test.getTestNameId());
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/problem/TestFinder.java`
#### Snippet
```java

  @Nullable
  public STest findTest(final @NotNull Long testNameId) {
    return myTestManager.findTest(testNameId, myProjectFinder.getRootProject().getProjectId()); //STest in root project should have all the data across entire server
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/problem/TestFinder.java`
#### Snippet
```java
  @NotNull private final ProblemMutingService myProblemMutingService;

  public TestFinder(final @NotNull ProjectFinder projectFinder,
                    final @NotNull BuildTypeFinder buildTypeFinder,
                    final @NotNull BuildPromotionFinder buildPromotionFinder,
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/problem/TestFinder.java`
#### Snippet
```java

  public TestFinder(final @NotNull ProjectFinder projectFinder,
                    final @NotNull BuildTypeFinder buildTypeFinder,
                    final @NotNull BuildPromotionFinder buildPromotionFinder,
                    final @NotNull STestManager testManager,
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/problem/TestFinder.java`
#### Snippet
```java
  public TestFinder(final @NotNull ProjectFinder projectFinder,
                    final @NotNull BuildTypeFinder buildTypeFinder,
                    final @NotNull BuildPromotionFinder buildPromotionFinder,
                    final @NotNull STestManager testManager,
                    final @NotNull TestName2Index testName2Index,
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/problem/TestFinder.java`
#### Snippet
```java
                    final @NotNull BuildTypeFinder buildTypeFinder,
                    final @NotNull BuildPromotionFinder buildPromotionFinder,
                    final @NotNull STestManager testManager,
                    final @NotNull TestName2Index testName2Index,
                    final @NotNull CurrentProblemsManager currentProblemsManager,
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/problem/TestFinder.java`
#### Snippet
```java
                    final @NotNull BuildPromotionFinder buildPromotionFinder,
                    final @NotNull STestManager testManager,
                    final @NotNull TestName2Index testName2Index,
                    final @NotNull CurrentProblemsManager currentProblemsManager,
                    final @NotNull ProblemMutingService problemMutingService) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/problem/TestFinder.java`
#### Snippet
```java
                    final @NotNull STestManager testManager,
                    final @NotNull TestName2Index testName2Index,
                    final @NotNull CurrentProblemsManager currentProblemsManager,
                    final @NotNull ProblemMutingService problemMutingService) {
    super(DIMENSION_ID, NAME, AFFECTED_PROJECT, CURRENT, CURRENTLY_INVESTIGATED, CURRENTLY_MUTED, MUTE_AFFECTED,
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/problem/TestFinder.java`
#### Snippet
```java
                    final @NotNull TestName2Index testName2Index,
                    final @NotNull CurrentProblemsManager currentProblemsManager,
                    final @NotNull ProblemMutingService problemMutingService) {
    super(DIMENSION_ID, NAME, AFFECTED_PROJECT, CURRENT, CURRENTLY_INVESTIGATED, CURRENTLY_MUTED, MUTE_AFFECTED,
      Locator.LOCATOR_SINGLE_VALUE_UNUSED_NAME);
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java

  @Nullable
  public static String patchLocator(final @Nullable String buildTypeLocator, final @Nullable SProject project) {
    if (project == null) return buildTypeLocator;
    return Locator.setDimensionIfNotPresent(buildTypeLocator, DIMENSION_PROJECT, ProjectFinder.getLocator(project));
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java

  @Nullable
  public static String patchLocator(final @Nullable String buildTypeLocator, final @Nullable SProject project) {
    if (project == null) return buildTypeLocator;
    return Locator.setDimensionIfNotPresent(buildTypeLocator, DIMENSION_PROJECT, ProjectFinder.getLocator(project));
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java

  @NotNull
  private List<BuildTypeOrTemplate> getSelectedByUser(final @NotNull Locator locator, @NotNull final String selectedForUserLocator) {
    Locator selectedByUserLocator = new Locator(selectedForUserLocator, "user", "mode");
    String userLocator = selectedByUserLocator.getSingleDimensionValue("user");
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java

  @NotNull
  public PagedSearchResult<BuildTypeOrTemplate> getBuildTypesPaged(final @Nullable SProject project, final @Nullable String buildTypeLocator, final boolean buildType) {
    if (buildTypeLocator != null && (new Locator(buildTypeLocator)).isSingleValue()){
      return getItems(buildTypeLocator);
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java

  @NotNull
  public PagedSearchResult<BuildTypeOrTemplate> getBuildTypesPaged(final @Nullable SProject project, final @Nullable String buildTypeLocator, final boolean buildType) {
    if (buildTypeLocator != null && (new Locator(buildTypeLocator)).isSingleValue()){
      return getItems(buildTypeLocator);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/project/PropEntitiesProjectFeature.java`
#### Snippet
```java
    private final Collection<SProjectFeatureDescriptor> myFeatures;

    public Storage(final @NotNull SProject project) {
      myFeatures = project.getOwnFeatures();
    }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/project/PropEntitiesProjectFeature.java`
#### Snippet
```java
    }

    public void apply(final @NotNull SProject project){
      removeAll(project);
      for (SProjectFeatureDescriptor entry : myFeatures) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/problem/ProblemOccurrence.java`
#### Snippet
```java
  }

  public ProblemOccurrence(final @NotNull BuildProblem problemP,
                           final @NotNull BeanContext beanContext,
                           @NotNull final Fields fields) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/problem/ProblemOccurrence.java`
#### Snippet
```java

  public ProblemOccurrence(final @NotNull BuildProblem problemP,
                           final @NotNull BeanContext beanContext,
                           @NotNull final Fields fields) {
    id = ValueWithDefault.decideDefault(fields.isIncluded("id"), ProblemOccurrenceFinder.getProblemOccurrenceLocator(problemP));
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/problem/ProblemFinder.java`
#### Snippet
```java
  @NotNull private final ProblemMutingService myProblemMutingService;

  public ProblemFinder(final @NotNull ProjectFinder projectFinder,
                       final @NotNull BuildPromotionFinder buildPromotionFinder,
                       final @NotNull BuildProblemManager buildProblemManager,
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/problem/ProblemFinder.java`
#### Snippet
```java

  public ProblemFinder(final @NotNull ProjectFinder projectFinder,
                       final @NotNull BuildPromotionFinder buildPromotionFinder,
                       final @NotNull BuildProblemManager buildProblemManager,
                       final @NotNull ProjectManager projectManager,
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/problem/ProblemFinder.java`
#### Snippet
```java
  public ProblemFinder(final @NotNull ProjectFinder projectFinder,
                       final @NotNull BuildPromotionFinder buildPromotionFinder,
                       final @NotNull BuildProblemManager buildProblemManager,
                       final @NotNull ProjectManager projectManager,
                       final @NotNull ServiceLocator serviceLocator,
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/problem/ProblemFinder.java`
#### Snippet
```java
                       final @NotNull BuildPromotionFinder buildPromotionFinder,
                       final @NotNull BuildProblemManager buildProblemManager,
                       final @NotNull ProjectManager projectManager,
                       final @NotNull ServiceLocator serviceLocator,
                       final @NotNull ProblemMutingService problemMutingService) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/problem/ProblemFinder.java`
#### Snippet
```java
                       final @NotNull BuildProblemManager buildProblemManager,
                       final @NotNull ProjectManager projectManager,
                       final @NotNull ServiceLocator serviceLocator,
                       final @NotNull ProblemMutingService problemMutingService) {
    super(DIMENSION_ID, IDENTITY, TYPE, AFFECTED_PROJECT, CURRENT, CURRENTLY_INVESTIGATED, CURRENTLY_MUTED,
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/problem/ProblemFinder.java`
#### Snippet
```java
                       final @NotNull ProjectManager projectManager,
                       final @NotNull ServiceLocator serviceLocator,
                       final @NotNull ProblemMutingService problemMutingService) {
    super(DIMENSION_ID, IDENTITY, TYPE, AFFECTED_PROJECT, CURRENT, CURRENTLY_INVESTIGATED, CURRENTLY_MUTED,
          Locator.LOCATOR_SINGLE_VALUE_UNUSED_NAME);
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java

  @NotNull
  public BuildPromotion getBuildPromotion(final @Nullable SBuildType buildType, @Nullable final String locatorText) {
    if (buildType == null) {
      return getItem(locatorText);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
  }

  private HashSet<SBuildType> getBuildTypes(final @NotNull Locator locator) {
    SProject project = getProjectFromDimension(locator, PROJECT);

```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java

  @NotNull
  public PagedSearchResult<BuildPromotion> getBuildPromotions(final @Nullable SBuildType buildType, final @Nullable String locatorText) {
    if (buildType == null) {
      return getItems(locatorText);
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java

  @NotNull
  public PagedSearchResult<BuildPromotion> getBuildPromotions(final @Nullable SBuildType buildType, final @Nullable String locatorText) {
    if (buildType == null) {
      return getItems(locatorText);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java

  @Nullable
  private SProject getProjectFromDimension(final @NotNull Locator locator, @NotNull final String dimension) {
    final String projectLocator = locator.getSingleDimensionValue(dimension);
    if (projectLocator == null) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/jetbrains/buildServer/server/rest/data/build/BuildsFilterProcessor.java`
#### Snippet
```java
 */
public class BuildsFilterProcessor {
  final static Logger LOG = Logger.getInstance(BuildsFilterProcessor.class.getName());

  public static List<SFinishedBuild> getMatchingFinishedBuilds(@NotNull final BuildsFilter buildsFilter, @NotNull final BuildHistory buildHistory) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
  }

  private boolean isCompatibleWithAnyBuild(final @NotNull SBuildAgent agent, final List<BuildPromotion> buildPromotions) {
    for (BuildPromotion buildPromotion : buildPromotions) {
      if (canActuallyRun(agent, buildPromotion)) return true;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
  }

  private Iterable<SBuildAgent> calculateCanActuallyRunAgents(@NotNull final List<BuildPromotion> builds, final @NotNull ServiceLocator serviceLocator) {
    TreeSet<SBuildAgent> result = new TreeSet<>(AGENT_COMPARATOR);
    for (BuildPromotion build : builds) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
  @NotNull private final ServiceLocator myServiceLocator;

  public AgentFinder(final @NotNull BuildAgentManager agentManager, @NotNull final ServiceLocator serviceLocator) {
    super(DIMENSION_ID, NAME, CONNECTED, AUTHORIZED, ENABLED, PARAMETER, IP, POOL, BUILD, COMPATIBLE, Locator.LOCATOR_SINGLE_VALUE_UNUSED_NAME);
    setHiddenDimensions(PROTOCOL, INCOMPATIBLE, AGENT_TYPE_ID, DEFAULT_FILTERING, DIMENSION_LOOKUP_LIMIT);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
  }

  private static Compatibility.AgentCompatibilityData getCompatibilityData(final @NotNull SBuildAgent agent, final @NotNull SBuildType buildType) {
    if (!getAgentType(agent).getPolicy().isBuildTypeAllowed(buildType.getBuildTypeId())) {
      return new Compatibility.BasicAgentCompatibilityData(agent, buildType, false, "Restricted by agent policy");
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
  }

  private static Compatibility.AgentCompatibilityData getCompatibilityData(final @NotNull SBuildAgent agent, final @NotNull SBuildType buildType) {
    if (!getAgentType(agent).getPolicy().isBuildTypeAllowed(buildType.getBuildTypeId())) {
      return new Compatibility.BasicAgentCompatibilityData(agent, buildType, false, "Restricted by agent policy");
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
  }

  private boolean isCompatibleWithAllBuild(final @NotNull SBuildAgent agent, final List<BuildPromotion> buildPromotions) {
    for (BuildPromotion buildPromotion : buildPromotions) {
      if (!canActuallyRun(agent, buildPromotion)) return false;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java

  @NotNull
  public static List<Compatibility.AgentCompatibilityData> getIncompatible(final @NotNull SBuildAgent agent,
                                                                           final @Nullable List<SBuildType> buildTypes,
                                                                           final @NotNull ServiceLocator serviceLocator) {
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
  @NotNull
  public static List<Compatibility.AgentCompatibilityData> getIncompatible(final @NotNull SBuildAgent agent,
                                                                           final @Nullable List<SBuildType> buildTypes,
                                                                           final @NotNull ServiceLocator serviceLocator) {
    ArrayList<Compatibility.AgentCompatibilityData> result = new ArrayList<>();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
  public static List<Compatibility.AgentCompatibilityData> getIncompatible(final @NotNull SBuildAgent agent,
                                                                           final @Nullable List<SBuildType> buildTypes,
                                                                           final @NotNull ServiceLocator serviceLocator) {
    ArrayList<Compatibility.AgentCompatibilityData> result = new ArrayList<>();
    List<SBuildType> buildTypesToProcess = buildTypes != null ? buildTypes : serviceLocator.getSingletonService(ProjectManager.class).getAllBuildTypes();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
  }

  private static boolean isAgentRestrictorAllowed(final @NotNull SBuildAgent agent, final @NotNull SQueuedBuild queuedBuild) {
    AgentRestrictor agentRestrictor = queuedBuild.getAgentRestrictor();
    if (agentRestrictor == null) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
  }

  private static boolean isAgentRestrictorAllowed(final @NotNull SBuildAgent agent, final @NotNull SQueuedBuild queuedBuild) {
    AgentRestrictor agentRestrictor = queuedBuild.getAgentRestrictor();
    if (agentRestrictor == null) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/project/Projects.java`
#### Snippet
```java
  }

  public Projects(@NotNull final List<SProject> projectObjects, @Nullable final PagerData pagerData, final @NotNull Fields fields, @NotNull final BeanContext beanContext) {
    if (fields.isIncluded("project", false, true)) {
      projects = ValueWithDefault.decideDefault(
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
        @NotNull
        @Override
        public String replace(@NotNull final String featureLocator, final @NotNull PropEntityProjectFeature newFeature, @NotNull final ServiceLocator serviceLocator) {
          return newFeature.replaceIn(project, PropEntityProjectFeature.getFeatureByLocator(project, featureLocator), serviceLocator).getId(); //todo: return id form the method!
        }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java

  @Nullable
  private static Map<String, String> getNullOrCollection(final @NotNull Map<String, String> map) {
    return map.size() > 0 ? map : null;
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/build/TagFinder.java`
#### Snippet
```java
  }

  private TagFinder(final @NotNull UserFinder userFinder, @Nullable final BuildPromotion buildPromotion, @SuppressWarnings("unused") boolean internalConstructor) {
    super(NAME, PRIVATE, OWNER);
    setHiddenDimensions(Locator.LOCATOR_SINGLE_VALUE_UNUSED_NAME, CONDITION, //experimental
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/build/TagFinder.java`
#### Snippet
```java
  private final BuildPromotion myBuildPromotion;

  public TagFinder(final @NotNull UserFinder userFinder, final @NotNull BuildPromotion buildPromotion) {
    this(userFinder, buildPromotion, true);
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/build/TagFinder.java`
#### Snippet
```java
  private final BuildPromotion myBuildPromotion;

  public TagFinder(final @NotNull UserFinder userFinder, final @NotNull BuildPromotion buildPromotion) {
    this(userFinder, buildPromotion, true);
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/agent/Environment.java`
#### Snippet
```java
  }

  public Environment(@NotNull final SBuildAgent agent, @NotNull final Fields fields, final @NotNull BeanContext beanContext) {
    osType = ValueWithDefault.decideIncludeByDefault(fields.isIncluded("osType"), () -> Agent.getAgentOsType(agent));
    osName = ValueWithDefault.decideIncludeByDefault(fields.isIncluded("osName"), agent::getOperatingSystemName);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FilesSubResource.java`
#### Snippet
```java
  }

  static String getETag(final @NotNull Element element, @NotNull final String uniqueElementBrowserId) {
    //this should not change between the releases to make the client caching work
    String fullNamePart = Util.concatenatePath(uniqueElementBrowserId, CONTENT, element.getFullName());
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FilesSubResource.java`
#### Snippet
```java
  }

  static boolean getSetContentDisposition(final @NotNull Element element, final @NotNull HttpServletRequest request, final @NotNull HttpServletResponse response) {
    String contentDisposition = getSetting("rest.files.contentResponseBuilder.contentDisposition", "attachment", "contentDisposition", request.getParameter("contentDisposition"),
      false,
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FilesSubResource.java`
#### Snippet
```java
  }

  static boolean getSetContentDisposition(final @NotNull Element element, final @NotNull HttpServletRequest request, final @NotNull HttpServletResponse response) {
    String contentDisposition = getSetting("rest.files.contentResponseBuilder.contentDisposition", "attachment", "contentDisposition", request.getParameter("contentDisposition"),
      false,
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FilesSubResource.java`
#### Snippet
```java
  }

  static boolean getSetContentDisposition(final @NotNull Element element, final @NotNull HttpServletRequest request, final @NotNull HttpServletResponse response) {
    String contentDisposition = getSetting("rest.files.contentResponseBuilder.contentDisposition", "attachment", "contentDisposition", request.getParameter("contentDisposition"),
      false,
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/FilesSubResource.java`
#### Snippet
```java
  }

  private static long getLastModified(final @NotNull Element element) {
    if (element instanceof ArtifactElement) {
      Long lastModified = ((ArtifactElement)element).getLastModified();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/Entries.java`
#### Snippet
```java
  }

  public Entries(@NotNull final java.util.Map<String, String> propertiesP, final @NotNull Fields fields) {
    this.count = ValueWithDefault.decideIncludeByDefault(fields.isIncluded("count"), propertiesP.size());
    Fields entryFields = fields.getNestedField("entry");
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/problem/Problem.java`
#### Snippet
```java
  }

  public Problem(final @NotNull ProblemWrapper problem,
                 final @NotNull Fields fields,
                 final @NotNull BeanContext beanContext) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/problem/Problem.java`
#### Snippet
```java

  public Problem(final @NotNull ProblemWrapper problem,
                 final @NotNull Fields fields,
                 final @NotNull BeanContext beanContext) {
    id = ValueWithDefault.decideDefault(fields.isIncluded("id"), String.valueOf(problem.getId()));
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/problem/Problem.java`
#### Snippet
```java
  public Problem(final @NotNull ProblemWrapper problem,
                 final @NotNull Fields fields,
                 final @NotNull BeanContext beanContext) {
    id = ValueWithDefault.decideDefault(fields.isIncluded("id"), String.valueOf(problem.getId()));

```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/agent/Agent.java`
#### Snippet
```java
  }

  public Agent(@NotNull final SBuildAgent agent, final @NotNull Fields fields, @NotNull final BeanContext beanContext) {
    final int agentId = agent.getId();
    final boolean unknownAgent = agentId == UNKNOWN_AGENT_ID;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/agent/Agent.java`
#### Snippet
```java
   */
  @SuppressWarnings("unused")
  public Agent(@NotNull final SAgentType agentType, final @NotNull Fields fields, @NotNull final BeanContext beanContext) {
    typeId = ValueWithDefault.decideDefault(fields.isIncluded("typeId", true), agentType.getAgentTypeId());
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/agent/Agent.java`
#### Snippet
```java
   * Used only for build triggering
   */
  public Agent(@NotNull final jetbrains.buildServer.serverSide.agentPools.AgentPool agentPool, final @NotNull Fields fields, @NotNull final BeanContext beanContext) {
    pool = ValueWithDefault.decideDefault(fields.isIncluded("pool", true), () -> new AgentPool(agentPool, fields.getNestedField("pool", Fields.SHORT, Fields.SHORT), beanContext));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/model/agent/Agent.java`
#### Snippet
```java

  @NotNull
  public static String getActualActionComment(final @Nullable String submittedComment) {
    return StringUtil.isEmpty(submittedComment) ? TeamCityProperties.getProperty("rest.defaultActionComment") : submittedComment;
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/agent/Agent.java`
#### Snippet
```java

  @NotNull
  private static AgentProtocol getAgentProtocol(final @NotNull SBuildAgent agent) {
    final String protocolType = agent.getCommunicationProtocolType();
    if (PollingRemoteAgentConnection.TYPE.equals(protocolType)) return AgentProtocol.unidirectional;
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
  @NotNull
  public static List<ArtifactTreeElement> getItems(@NotNull final Element initialElement,
                                                   final @Nullable String basePath,
                                                   final @Nullable String filesLocator,
                                                   final @Nullable FileApiUrlBuilder urlBuilder,
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
  public static List<ArtifactTreeElement> getItems(@NotNull final Element initialElement,
                                                   final @Nullable String basePath,
                                                   final @Nullable String filesLocator,
                                                   final @Nullable FileApiUrlBuilder urlBuilder,
                                                   final @NotNull ServiceLocator serviceLocator) {
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
                                                   final @Nullable String basePath,
                                                   final @Nullable String filesLocator,
                                                   final @Nullable FileApiUrlBuilder urlBuilder,
                                                   final @NotNull ServiceLocator serviceLocator) {
    return makeRelativeToBasePath(BuildArtifactsFinder.getItems(initialElement, filesLocator, urlBuilder, serviceLocator), basePath);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
                                                   final @Nullable String filesLocator,
                                                   final @Nullable FileApiUrlBuilder urlBuilder,
                                                   final @NotNull ServiceLocator serviceLocator) {
    return makeRelativeToBasePath(BuildArtifactsFinder.getItems(initialElement, filesLocator, urlBuilder, serviceLocator), basePath);
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java

  @NotNull
  private static String removeLeading(final @NotNull String result, final String prefix) {
    return result.startsWith(prefix) ? result.substring(prefix.length()) : result;
  }
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
  @NotNull
  public static List<ArtifactTreeElement> getItems(@NotNull final Element initialElement,
                                                   final @Nullable String filesLocator,
                                                   final @Nullable FileApiUrlBuilder urlBuilder,
                                                   final @NotNull ServiceLocator serviceLocator) {
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
  public static List<ArtifactTreeElement> getItems(@NotNull final Element initialElement,
                                                   final @Nullable String filesLocator,
                                                   final @Nullable FileApiUrlBuilder urlBuilder,
                                                   final @NotNull ServiceLocator serviceLocator) {
    if (initialElement.isLeaf()) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
                                                   final @Nullable String filesLocator,
                                                   final @Nullable FileApiUrlBuilder urlBuilder,
                                                   final @NotNull ServiceLocator serviceLocator) {
    if (initialElement.isLeaf()) {
      String additionalMessage = "";
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
  }

  static boolean isWithinHidden(final @NotNull Element data) {
    final String fullName = data.getFullName();
    return fullName.equals(ArtifactsConstants.TEAMCITY_ARTIFACTS_DIR) ||
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java

  @Nullable
  private static Element getSingleItemByPatternPath(final @NotNull String pathWithPatterns, final @NotNull Element root, final @NotNull Browser browser,
                                                    final @NotNull ServiceLocator serviceLocator) {
    final List<ArtifactTreeElement> items = getItems(root, Locator.getStringLocator(DIMENSION_PATTERNS, pathWithPatterns), null, serviceLocator);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java

  @Nullable
  private static Element getSingleItemByPatternPath(final @NotNull String pathWithPatterns, final @NotNull Element root, final @NotNull Browser browser,
                                                    final @NotNull ServiceLocator serviceLocator) {
    final List<ArtifactTreeElement> items = getItems(root, Locator.getStringLocator(DIMENSION_PATTERNS, pathWithPatterns), null, serviceLocator);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java

  @Nullable
  private static Element getSingleItemByPatternPath(final @NotNull String pathWithPatterns, final @NotNull Element root, final @NotNull Browser browser,
                                                    final @NotNull ServiceLocator serviceLocator) {
    final List<ArtifactTreeElement> items = getItems(root, Locator.getStringLocator(DIMENSION_PATTERNS, pathWithPatterns), null, serviceLocator);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
  @Nullable
  private static Element getSingleItemByPatternPath(final @NotNull String pathWithPatterns, final @NotNull Element root, final @NotNull Browser browser,
                                                    final @NotNull ServiceLocator serviceLocator) {
    final List<ArtifactTreeElement> items = getItems(root, Locator.getStringLocator(DIMENSION_PATTERNS, pathWithPatterns), null, serviceLocator);
    if (items.size() > 0){
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
  @NotNull
  public static ArtifactTreeElementWrapper getItem(@NotNull final Browser browser, @NotNull final String path, @NotNull final String where,
                                                   final @NotNull ServiceLocator serviceLocator) {
    Element element;
    if (SLASHES_OR_SPACE_PATTERN.matcher(path).replaceAll("").length() == 0){ //TeamCity API issue: cannot list root of the Browser by empty string or "/"
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
  }

  static boolean isHiddenDir(final @NotNull Element data) {
    final String fullName = data.getFullName();
    return fullName.equals(ArtifactsConstants.TEAMCITY_ARTIFACTS_DIR) ||
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
  @NotNull
  public static ArtifactTreeElement getItem(@NotNull final java.io.File rootPath, @NotNull final String path, @NotNull final String where,
                                            final @NotNull ServiceLocator serviceLocator) {
    // does not work for archives so far...
    // return getItem(new ZipAwareBrowser(new FileSystemBrowser(rootPath)), path, "");
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
  }
  @NotNull
  public static Element getArtifactElementToServeContent(@NotNull final BuildPromotion buildPromotion, @NotNull final String path, final @NotNull ServiceLocator serviceLocator) {
    final BuildPromotionEx buildPromotionEx = (BuildPromotionEx)buildPromotion;
    boolean analyzeDownloadPath = TeamCityProperties.getBooleanOrTrue("teamcity.rest.artifactContent.analyzePath");
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java

  @NotNull
  public static Element getArtifactElement(@NotNull final BuildPromotion buildPromotion, @NotNull final String path, final @NotNull ServiceLocator serviceLocator) {
    final BuildPromotionEx buildPromotionEx = (BuildPromotionEx)buildPromotion;
    final BuildArtifacts artifacts = buildPromotionEx.getArtifacts(BuildArtifactsViewMode.VIEW_ALL_WITH_ARCHIVES_CONTENT);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/VcsRootEntries.java`
#### Snippet
```java
    }

    public void apply(final @NotNull BuildTypeSettings buildTypeSettings) {
      removeAllFrom(buildTypeSettings);
      for (jetbrains.buildServer.vcs.VcsRootEntry entity : entities) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/VcsRootEntries.java`
#### Snippet
```java
    private final List<jetbrains.buildServer.vcs.VcsRootEntry> entities;

    public Storage(final @NotNull BuildTypeSettings buildTypeSettings) {
      entities = buildTypeSettings.getVcsRootEntries();
    }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/change/Change.java`
#### Snippet
```java
  }

  public Change(@NotNull SVcsModification modification, final @NotNull Fields fields, @NotNull final BeanContext beanContext) {
    this(new SVcsModificationOrChangeDescriptor(modification), fields, beanContext);
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/change/Change.java`
#### Snippet
```java
  }

  public Change(SVcsModificationOrChangeDescriptor modificationOrDescriptor, final @NotNull Fields fields, @NotNull final BeanContext beanContext) {
    myDescriptor = modificationOrDescriptor.getChangeDescriptor();
    myModification = modificationOrDescriptor.getSVcsModification();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesStep.java`
#### Snippet
```java
    }

    public void apply(final @NotNull BuildTypeSettings buildTypeSettings){
      removeAllSteps(buildTypeSettings);
      for (Map.Entry<SBuildRunnerDescriptor, Boolean> entry : deps.entrySet()) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesStep.java`
#### Snippet
```java
    public final Map<SBuildRunnerDescriptor, Boolean> deps = new LinkedHashMap<>();

    public Storage(final @NotNull BuildTypeSettings buildTypeSettings) {
      for (SBuildRunnerDescriptor entity : buildTypeSettings.getBuildRunners()) {
        deps.put(entity, buildTypeSettings.isEnabled(entity.getId()));
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java

  @NotNull
  public static String getBuildArtifactsHref(final @NotNull BuildPromotion build) {
    return Util.concatenatePath(BuildRequest.getBuildHref(build), ARTIFACTS);
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java

  @NotNull
  private String getBuildFileName(@NotNull final BuildPromotion buildPromotion, final @NotNull String path) {
    final SBuild build = buildPromotion.getAssociatedBuild();
    if (build != null) {
```

### MissortedModifiers
Missorted modifiers `final @Context`
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
  }

  private Response processIconRequest(final String stateName, final String suffix, final @Context HttpServletRequest request) {
    final String iconFileName = IMG_STATUS_WIDGET_ROOT_DIRECTORY + "/" + stateName + (StringUtil.isEmpty(suffix) ? IMG_STATUS_WIDGET_DEFAULT_SUFFIX : suffix);
    final String resultIconFileName;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/problem/ProblemWrapper.java`
#### Snippet
```java
  @NotNull private final ServiceLocator myServiceLocator;

  public ProblemWrapper(final int problemId, final @NotNull ServiceLocator serviceLocator) {
    id = problemId;
    myServiceLocator = serviceLocator;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/problem/ProblemWrapper.java`
#### Snippet
```java
   * @param serviceLocator
   */
  public ProblemWrapper(final int problemId, @NotNull final BuildProblemData buildProblemData, final @NotNull ServiceLocator serviceLocator) {
    id = problemId;
    myServiceLocator = serviceLocator;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
  }

  private String replaceNonAlphaNum(final @NotNull String path) {
    return NON_ALPHA_NUM_PATTERN.matcher(path).replaceAll("_");
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/change/FileChange.java`
#### Snippet
```java
  }

  public FileChange(final @NotNull VcsFileModification vcsFileModification, final @NotNull Fields fields) {
    before = ValueWithDefault.decideDefault(fields.isIncluded("before-revision", true), vcsFileModification.getBeforeChangeRevisionNumber());
    after = ValueWithDefault.decideDefault(fields.isIncluded("after-revision", true), vcsFileModification.getAfterChangeRevisionNumber());
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/change/FileChange.java`
#### Snippet
```java
  }

  public FileChange(final @NotNull VcsFileModification vcsFileModification, final @NotNull Fields fields) {
    before = ValueWithDefault.decideDefault(fields.isIncluded("before-revision", true), vcsFileModification.getBeforeChangeRevisionNumber());
    after = ValueWithDefault.decideDefault(fields.isIncluded("after-revision", true), vcsFileModification.getAfterChangeRevisionNumber());
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/jetbrains/buildServer/server/rest/data/build/GenericBuildsFilter.java`
#### Snippet
```java

public class GenericBuildsFilter implements BuildsFilter {
  final static Logger LOG = Logger.getInstance(GenericBuildsFilter.class.getName());

  public static final String BRANCH_NAME_ANY = "<any>";
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java

  @Nullable
  public static BuildType getDefaultTemplate(final @NotNull SProject project, final @NotNull Fields fields, final @NotNull BeanContext beanContext) {
    BuildTypeTemplate defaultTemplate = project.getDefaultTemplate();
    if (defaultTemplate == null) return null;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java

  @Nullable
  public static BuildType getDefaultTemplate(final @NotNull SProject project, final @NotNull Fields fields, final @NotNull BeanContext beanContext) {
    BuildTypeTemplate defaultTemplate = project.getDefaultTemplate();
    if (defaultTemplate == null) return null;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java

  @Nullable
  public static BuildType getDefaultTemplate(final @NotNull SProject project, final @NotNull Fields fields, final @NotNull BeanContext beanContext) {
    BuildTypeTemplate defaultTemplate = project.getDefaultTemplate();
    if (defaultTemplate == null) return null;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
  }

  public Project(@NotNull final SProject project, final @NotNull Fields fields, @NotNull final BeanContext beanContext) {
    myFields = fields;
    myProject = project;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java

  @Nullable
  private Links getLinks(@NotNull final SProject project, final @NotNull Fields fields, @NotNull final BeanContext beanContext) {
    return ValueWithDefault.decideDefault(fields.isIncluded("links", false, false), new ValueWithDefault.Value<Links>() {
      @Nullable
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
  }

  public static boolean shouldRestrictSettingsViewing(final @NotNull BuildProject project, final @NotNull PermissionChecker permissionChecker) {
    if (TeamCityProperties.getBooleanOrTrue("rest.beans.project.checkPermissions")) {
      return !permissionChecker.isPermissionGranted(Permission.VIEW_BUILD_CONFIGURATION_SETTINGS, project.getProjectId());
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
  }

  public static boolean shouldRestrictSettingsViewing(final @NotNull BuildProject project, final @NotNull PermissionChecker permissionChecker) {
    if (TeamCityProperties.getBooleanOrTrue("rest.beans.project.checkPermissions")) {
      return !permissionChecker.isPermissionGranted(Permission.VIEW_BUILD_CONFIGURATION_SETTINGS, project.getProjectId());
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/agent/Compatibilities.java`
#### Snippet
```java
  public Compatibilities(@Nullable final List<Compatibility.AgentCompatibilityData> compatibilitiesP,
                         @Nullable final SBuildAgent contextAgent, @Nullable final SBuildType contextBuildType,
                         @NotNull final Fields fields, final @NotNull BeanContext beanContext) {
    compatibilities = compatibilitiesP == null ? null : ValueWithDefault.decideDefault(fields.isIncluded("compatibility", true, true), () -> {
        Fields nestedFields = fields.getNestedField("compatibility");
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/nodes/DisabledResponsibilities.java`
#### Snippet
```java

  @NotNull
  private Function<NodeResponsibility, Responsibility> toResponsibility(final @NotNull Fields fields) {
    return r -> new Responsibility(r, fields.getNestedField("responsibility", Fields.SHORT, Fields.LONG));
  }
```

### MissortedModifiers
Missorted modifiers `private @NotNull`
in `src/jetbrains/buildServer/server/rest/data/BranchData.java`
#### Snippet
```java

  private static class MergingBranchData extends BranchData {
    private @NotNull final String myName;
    private final BranchData myFirstBranch;
    private final boolean myIsDefault;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/BranchData.java`
#### Snippet
```java

  @NotNull
  private static String getMergeConflictMessage(final @NotNull BranchData b1, final @NotNull BranchData b2, @NotNull final String details) {
    return "While merging branches, found branches " + details + ". Please report to JetBrains." +
           " 1: " + b1.getName() + "/" + b1.getDisplayName() + "/" + b1.isDefaultBranch() +
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/BranchData.java`
#### Snippet
```java

  @NotNull
  private static String getMergeConflictMessage(final @NotNull BranchData b1, final @NotNull BranchData b2, @NotNull final String details) {
    return "While merging branches, found branches " + details + ". Please report to JetBrains." +
           " 1: " + b1.getName() + "/" + b1.getDisplayName() + "/" + b1.isDefaultBranch() +
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/change/FileChanges.java`
#### Snippet
```java
  }

  public FileChanges(@NotNull final List<? extends VcsFileModification> fileChanges, final @NotNull Fields fields) {
    count = ValueWithDefault.decideDefault(fields.isIncluded("count", true), fileChanges.size()); // this can differ from the actual number of sub-elements included

```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/audit/AuditEvents.java`
#### Snippet
```java
  public AuditEvents() {}

  public AuditEvents(final @NotNull List<AuditLogAction> items, final PagerData pagerData, @NotNull final Fields fields, @NotNull final BeanContext context) {
    auditEvents = ValueWithDefault.decideDefault(fields.isIncluded("auditEvent", false, true),
                                                 () -> items.stream().map(i -> new AuditEvent(i, fields.getNestedField("auditEvent", Fields.SHORT, Fields.LONG), context)).collect(Collectors.toList()));
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/problem/TypedValue.java`
#### Snippet
```java
  }

  public TypedValue(final @NotNull String name, @NotNull final String type, final @NotNull String value, @NotNull final Fields fields) {
    this.name = ValueWithDefault.decideDefault(fields.isIncluded("name", true, true), name);
    this.type = ValueWithDefault.decideDefault(fields.isIncluded("type", true, true), type);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/problem/TypedValue.java`
#### Snippet
```java
  }

  public TypedValue(final @NotNull String name, @NotNull final String type, final @NotNull String value, @NotNull final Fields fields) {
    this.name = ValueWithDefault.decideDefault(fields.isIncluded("name", true, true), name);
    this.type = ValueWithDefault.decideDefault(fields.isIncluded("type", true, true), type);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/TestOccurrenceRequest.java`
#### Snippet
```java
  }

  public static String getHref(final @NotNull SBuild build) {
    return API_SUB_URL + "?locator=" + TestOccurrenceFinder.getTestRunLocator(build);
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/TestOccurrenceRequest.java`
#### Snippet
```java
  }

  public static String getHref(final @NotNull STest test) {
    return API_SUB_URL + "?locator=" + TestOccurrenceFinder.getTestRunLocator(test);
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/request/TestOccurrenceRequest.java`
#### Snippet
```java
  }

  public static String getHref(final @NotNull STestRun testRun) {
    return API_SUB_URL + "/" + TestOccurrenceFinder.getTestRunLocator(testRun);
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesArtifactDep.java`
#### Snippet
```java
    }

    public void apply(final @NotNull BuildTypeSettings buildTypeSettings){
      buildTypeSettings.setArtifactDependencies(deps);
      for (Map.Entry<String, Boolean> entry : enabledData.entrySet()) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesArtifactDep.java`
#### Snippet
```java
    public final Map<String, Boolean> enabledData = new HashMap<>();

    public Storage(final @NotNull BuildTypeSettings buildTypeSettings) {
      for (SArtifactDependency dependency : buildTypeSettings.getArtifactDependencies()) {
        deps.add(dependency);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesArtifactDep.java`
#### Snippet
```java
   * @return true if buildTypeSettings is modified
   */
  public boolean setToBuildType(final @NotNull BuildTypeSettingsEx buildTypeSettings, final @NotNull ServiceLocator serviceLocator) {
    PropEntitiesArtifactDep.Storage original = new PropEntitiesArtifactDep.Storage(buildTypeSettings);
    try {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesArtifactDep.java`
#### Snippet
```java
   * @return true if buildTypeSettings is modified
   */
  public boolean setToBuildType(final @NotNull BuildTypeSettingsEx buildTypeSettings, final @NotNull ServiceLocator serviceLocator) {
    PropEntitiesArtifactDep.Storage original = new PropEntitiesArtifactDep.Storage(buildTypeSettings);
    try {
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/UserFinder.java`
#### Snippet
```java
  }

  public void checkViewUserPermission(final @Nullable SUser user) throws AuthorizationFailedException {
    if (user == null || !ServerAuthUtil.canViewUser(mySecurityContext.getAuthorityHolder(), user)) {
      //it's important to throw the same exception in both cases when the user is null and when there is no enough permissions,
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java

  @NotNull
  public String getLocatorFromPosted(final @NotNull Map<Long, Long> buildPromotionIdQueuedBuildsReplacements) {
    String locatorText;
    if (myLocator != null) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  private List<SArtifactDependency> getBuildPatchedDeps(@NotNull final List<SArtifactDependency> originalDeps,
                                                        final boolean useAllOriginalDeps,
                                                        final @NotNull ServiceLocator serviceLocator, @NotNull final List<BuildPromotion> artifactDepsBuilds) {
    List<SArtifactDependency> originalDepsCopy = useAllOriginalDeps ? new ArrayList<>(originalDeps) : null;
    Map<String, Integer> processedBuildsByBuildTypeExternalId = new HashMap<>();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/TimeCondition.java`
#### Snippet
```java

  @NotNull
  public static TimeService getTimeService(final @NotNull ServiceLocator serviceLocator) {
    return serviceLocator.getSingletonService(RunningBuildsManagerEx.class).getTimeService();
  }
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
    }

    final static Condition PRESENT = new Condition() {
      @Override
      public boolean get(@Nullable final String dimensionValue) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java

  @NotNull
  private <FINDER_TYPE> List<FINDER_TYPE> getNotEmptyItems(final @NotNull Finder<FINDER_TYPE> finder, final @NotNull String dimensionValue) {
    List<FINDER_TYPE> result = finder.getItems(dimensionValue).getEntries();
    if (result.isEmpty()) throw new LocatorProcessException("Nothing found by locator '" + dimensionValue + "'");
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java

  @NotNull
  private <FINDER_TYPE> List<FINDER_TYPE> getNotEmptyItems(final @NotNull Finder<FINDER_TYPE> finder, final @NotNull String dimensionValue) {
    List<FINDER_TYPE> result = finder.getItems(dimensionValue).getEntries();
    if (result.isEmpty()) throw new LocatorProcessException("Nothing found by locator '" + dimensionValue + "'");
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
  }

  private static <T extends Enum<T>> List<String> getValues(final @NotNull Class<T> enumClass) {
    return CollectionsUtil.convertCollection(Arrays.asList(enumClass.getEnumConstants()), source -> source.name().toLowerCase());
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
    @NotNull private final Filter<TYPE, TYPE_FOR_FILTER> myDefaultChecker;

    private TypedFinderDimensionWithDefaultCheckerImpl(final @NotNull TypedFinderDimensionImpl<TYPE> original,
                                                       final @NotNull Filter<TYPE, TYPE_FOR_FILTER> defaultChecker) {
      myOriginal = original;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java

    private TypedFinderDimensionWithDefaultCheckerImpl(final @NotNull TypedFinderDimensionImpl<TYPE> original,
                                                       final @NotNull Filter<TYPE, TYPE_FOR_FILTER> defaultChecker) {
      myOriginal = original;
      myDefaultChecker = defaultChecker;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
  }

  private void patchWithDefaultValues(final @NotNull Locator locator) {
    if (!locator.isSingleValue()) {
      for (Map.Entry<DimensionCondition, NameValuePairs> entry : myDefaultDimensionsConditions.entrySet()) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
    }

    private <TYPE> TYPE getByDimensionValue(final @NotNull TypedFinderDimensionImpl<TYPE> typedDimension, final String dimensionValue) {
      TYPE result;
      try {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
      @NotNull private final DimensionObjects myDimensionObjects;

      public DimensionObjectsWrapper(final @NotNull DimensionObjects dimensionObjects) {
        myDimensionObjects = dimensionObjects;
      }
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
  }

  public static abstract class Condition {
    abstract boolean get(@NotNull String dimensionValue);

```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `src/jetbrains/buildServer/server/rest/data/DataProvider.java`
#### Snippet
```java
  // Workaround for http://youtrack.jetbrains.com/issue/TW-25260
  public <T> T getBean(Class<T> type){
    if (type.equals(DBFunctionsProvider.class)) return (T)myDbFunctionsProvider;
    if (type.equals(StartupContext.class)) return (T)myStartupContext;
    return myApplicationContext.getBean(type);
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `src/jetbrains/buildServer/server/rest/data/DataProvider.java`
#### Snippet
```java
  public <T> T getBean(Class<T> type){
    if (type.equals(DBFunctionsProvider.class)) return (T)myDbFunctionsProvider;
    if (type.equals(StartupContext.class)) return (T)myStartupContext;
    return myApplicationContext.getBean(type);
  }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Matcher.end()` is ignored
in `src/jetbrains/buildServer/server/rest/data/util/LocatorUtil.java`
#### Snippet
```java
      String result = matcher.replaceFirst(dimensionName + DIMENSION_NAME_VALUE_DELIMITER + value);
      try {
        matcher.end();
      } catch (IllegalStateException ex) {
        throw new LocatorProcessException("Cannot replace locator values: invalid locator '" + locator + "'");
```

## RuleId[id=FunctionalExpressionCanBeFolded]
### FunctionalExpressionCanBeFolded
Method reference can be replaced with qualifier
in `src/jetbrains/buildServer/server/graphql/model/connections/agentPool/AgentPoolsConnection.java`
#### Snippet
```java
  public class AgentPoolsConnectionEdge extends LazyEdge<jetbrains.buildServer.serverSide.agentPools.AgentPool, AbstractAgentPool> {
    public AgentPoolsConnectionEdge(@NotNull jetbrains.buildServer.serverSide.agentPools.AgentPool data) {
      super(data, myPoolFactory::apply);
    }

```

### FunctionalExpressionCanBeFolded
Method reference can be replaced with qualifier
in `src/jetbrains/buildServer/server/graphql/model/connections/ProjectAgentPoolsConnection.java`
#### Snippet
```java

    public ProjectAgentPoolEdge(@NotNull jetbrains.buildServer.serverSide.agentPools.AgentPool data) {
      super(data, myPoolFactory::apply);
    }
  }
```

## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'jetbrains.buildServer.server.rest.APIController.getBasePackages()' accessed via instance reference
in `src/jetbrains/buildServer/server/rest/jersey/ExtensionsAwareResourceConfig.java`
#### Snippet
```java
    {
      final ClassLoader cl = getClass().getClassLoader();
      scanners.add(new Pair<String[], ClassLoader>(myController.getBasePackages(), cl));
    }
    final Set<String> packagesFromExtensions = new TreeSet<String>();
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getOwnParametersCollection()` is identical to its super method
in `src/jetbrains/buildServer/server/rest/data/parameters/ParametersProviderBackedEntityWithParameters.java`
#### Snippet
```java
  @Nullable
  @Override
  public Collection<Parameter> getOwnParametersCollection() {
    return null;
  }
```

### RedundantMethodOverride
Method `getOwnParametersCollection()` is identical to its super method
in `src/jetbrains/buildServer/server/rest/data/parameters/UserParametersHolderEntityWithParameters.java`
#### Snippet
```java

  @Nullable
  public Collection<Parameter> getOwnParametersCollection() {
    return null;
  }
```

### RedundantMethodOverride
Method `getItem()` only delegates to its super method
in `src/jetbrains/buildServer/server/rest/data/finder/impl/HealthItemFinder.java`
#### Snippet
```java
  @NotNull
  @Override
  public HealthStatusItem getItem(@Nullable final String locatorText) {
    return super.getItem(locatorText);
  }
```

### RedundantMethodOverride
Method `getBuildType()` is identical to its super method
in `src/jetbrains/buildServer/server/rest/data/BranchData.java`
#### Snippet
```java
    @Nullable
    @Override
    public SBuildType getBuildType() {
      return null;
    }
```

### RedundantMethodOverride
Method `getBuilds()` is identical to its super method
in `src/jetbrains/buildServer/server/rest/data/BranchData.java`
#### Snippet
```java
    @Nullable
    @Override
    public PagedSearchResult<BuildPromotion> getBuilds(@Nullable final String locator) {
      return null;
    }
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudProfiles.java`
#### Snippet
```java
  @XmlAttribute(required = false) @Nullable public String nextHref;
  @XmlAttribute(required = false) @Nullable public String prevHref;
  @XmlAttribute(required = false) @Nullable public String href;

  public CloudProfiles() {}
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudProfiles.java`
#### Snippet
```java

  @XmlAttribute(required = false) @Nullable public String nextHref;
  @XmlAttribute(required = false) @Nullable public String prevHref;
  @XmlAttribute(required = false) @Nullable public String href;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudProfiles.java`
#### Snippet
```java
  public Integer count;

  @XmlAttribute(required = false) @Nullable public String nextHref;
  @XmlAttribute(required = false) @Nullable public String prevHref;
  @XmlAttribute(required = false) @Nullable public String href;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudInstances.java`
#### Snippet
```java

  @XmlAttribute(required = false) @Nullable public String nextHref;
  @XmlAttribute(required = false) @Nullable public String prevHref;
  @XmlAttribute(required = false) @Nullable public String href;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudInstances.java`
#### Snippet
```java
  @XmlAttribute(required = false) @Nullable public String nextHref;
  @XmlAttribute(required = false) @Nullable public String prevHref;
  @XmlAttribute(required = false) @Nullable public String href;

  public CloudInstances() {}
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudInstances.java`
#### Snippet
```java
  public Integer count;

  @XmlAttribute(required = false) @Nullable public String nextHref;
  @XmlAttribute(required = false) @Nullable public String prevHref;
  @XmlAttribute(required = false) @Nullable public String href;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudImages.java`
#### Snippet
```java

  @Nullable
  @XmlAttribute(required = false)
  public String getPrevHref() {
    return prevHref;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudImages.java`
#### Snippet
```java

  @Nullable
  @XmlAttribute(required = false)
  public String getNextHref() {
    return nextHref;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudImages.java`
#### Snippet
```java

  @Nullable
  @XmlAttribute(required = false)
  public String getHref() {
    return href;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/buildType/Investigations.java`
#### Snippet
```java
public class Investigations implements DefaultValueAware {
  @XmlAttribute public Integer count;
  @XmlAttribute(required = false) @Nullable public String nextHref;
  @XmlAttribute(required = false) @Nullable public String prevHref;
  @XmlAttribute(name = "href") public String href;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/buildType/Investigations.java`
#### Snippet
```java
  @XmlAttribute public Integer count;
  @XmlAttribute(required = false) @Nullable public String nextHref;
  @XmlAttribute(required = false) @Nullable public String prevHref;
  @XmlAttribute(name = "href") public String href;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntity.java`
#### Snippet
```java
  public Boolean inherited;

  @XmlAttribute(required = false)
  @Nullable
  public String href;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/change/Changes.java`
#### Snippet
```java
  }

  @XmlAttribute(required = false)
  @Nullable
  public String getNextHref() {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/change/Changes.java`
#### Snippet
```java
  }

  @XmlAttribute(required = false)
  @Nullable
  public String getPrevHref() {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/change/Changes.java`
#### Snippet
```java
  }

  @XmlAttribute(required = false)
  public String getHref() {
    return myPagerData == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("href"),
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypes.java`
#### Snippet
```java
  public String href;

  @XmlAttribute(required = false)
  @Nullable
  public String nextHref;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypes.java`
#### Snippet
```java
  public String nextHref;

  @XmlAttribute(required = false)
  @Nullable
  public String prevHref;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/build/Builds.java`
#### Snippet
```java
  }

  @XmlAttribute(required = false)
  @Nullable
  public String getHref() {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/build/Builds.java`
#### Snippet
```java
  }

  @XmlAttribute(required = false)
  @Nullable
  public String getPrevHref() {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/build/Builds.java`
#### Snippet
```java
  }

  @XmlAttribute(required = false)
  @Nullable
  public String getNextHref() {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/agent/AgentPools.java`
#### Snippet
```java
  public String href;

  @XmlAttribute(required = false)
  @Nullable
  public String nextHref;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/agent/AgentPools.java`
#### Snippet
```java
  public String nextHref;

  @XmlAttribute(required = false)
  @Nullable
  public String prevHref;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/agent/Agents.java`
#### Snippet
```java
  public String prevHref;

  @XmlAttribute(required = false)
  @Nullable
  public String href;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/agent/Agents.java`
#### Snippet
```java
  public String nextHref;

  @XmlAttribute(required = false)
  @Nullable
  public String prevHref;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/agent/Agents.java`
#### Snippet
```java
  public List<Agent> agents;

  @XmlAttribute(required = false)
  @Nullable
  public String nextHref;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/problem/ProblemOccurrences.java`
#### Snippet
```java
  @XmlAttribute public Integer count;
  @XmlAttribute(name = "href") public String href;
  @XmlAttribute(required = false) @Nullable public String nextHref;
  @XmlAttribute(required = false) @Nullable public String prevHref;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/problem/ProblemOccurrences.java`
#### Snippet
```java
  @XmlAttribute(name = "href") public String href;
  @XmlAttribute(required = false) @Nullable public String nextHref;
  @XmlAttribute(required = false) @Nullable public String prevHref;

  private boolean isDefault;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/problem/Tests.java`
#### Snippet
```java
  @XmlElement public TestCounters myTestCounters;
  @XmlAttribute(required = false) @Nullable public String nextHref;
  @XmlAttribute(required = false) @Nullable public String prevHref;

  public Tests() {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/problem/Tests.java`
#### Snippet
```java
  @XmlAttribute public Integer count;
  @XmlElement public TestCounters myTestCounters;
  @XmlAttribute(required = false) @Nullable public String nextHref;
  @XmlAttribute(required = false) @Nullable public String prevHref;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/Properties.java`
#### Snippet
```java
  public Integer count;

  @XmlAttribute(required = false)
  @Nullable
  public String href;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/problem/Problems.java`
#### Snippet
```java
  @XmlAttribute public Integer count;
  @XmlAttribute(required = false) @Nullable public String nextHref;
  @XmlAttribute(required = false) @Nullable public String prevHref;

  public Problems() {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/problem/Problems.java`
#### Snippet
```java
  @XmlElement(name = "problem") public List<Problem> items;
  @XmlAttribute public Integer count;
  @XmlAttribute(required = false) @Nullable public String nextHref;
  @XmlAttribute(required = false) @Nullable public String prevHref;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/server/LicenseKeyEntities.java`
#### Snippet
```java
  public Integer count;

  @XmlAttribute(required = false)
  @Nullable
  public String href;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/problem/Mutes.java`
#### Snippet
```java

  @XmlAttribute public Integer count;
  @XmlAttribute(required = false) @Nullable public String nextHref;
  @XmlAttribute(required = false) @Nullable public String prevHref;
  @XmlAttribute(name = "href") public String href;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/problem/Mutes.java`
#### Snippet
```java
  @XmlAttribute public Integer count;
  @XmlAttribute(required = false) @Nullable public String nextHref;
  @XmlAttribute(required = false) @Nullable public String prevHref;
  @XmlAttribute(name = "href") public String href;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/project/PropEntitiesProjectFeature.java`
#### Snippet
```java
  public Integer count;

  @XmlAttribute(required = false)
  @Nullable
  public String href;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/project/Projects.java`
#### Snippet
```java
  public String nextHref;

  @XmlAttribute(required = false)
  @Nullable
  public String prevHref;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/project/Projects.java`
#### Snippet
```java
  public String href;

  @XmlAttribute(required = false)
  @Nullable
  public String nextHref;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/request/FilesSubResource.java`
#### Snippet
```java
  @GET
  @Path(FilesSubResource.CONTENT + "{path:(/.*)?}")
  @Produces({MediaType.WILDCARD})
  @ApiOperation(value = "getContent", hidden = true)
  public Response getContent(@PathParam("path") final String path,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/request/FilesSubResource.java`
#### Snippet
```java
  @GET
  @Path("files" + "{path:(/.*)?}")
  @Produces({MediaType.WILDCARD})
  @ApiOperation(value = "Download specific file.", nickname = "downloadFile")
  public Response getContentAlias(@PathParam("path") @DefaultValue("") final String path, @Context HttpServletRequest request, @Context HttpServletResponse response) {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/request/FilesSubResource.java`
#### Snippet
```java
  @GET
  @Path("/archived" + "{path:(/.*)?}")
  @Produces({MediaType.WILDCARD})
  @ApiOperation(value = "Get specific file zipped.", nickname = "getZippedFile")
  public Response getZipped(@PathParam("path") final String path,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/buildType/VcsRoots.java`
#### Snippet
```java
  public String nextHref;

  @XmlAttribute(required = false)
  @Nullable
  public String prevHref;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/buildType/VcsRoots.java`
#### Snippet
```java
  public Integer count;

  @XmlAttribute(required = false)
  @Nullable
  public String href;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/buildType/VcsRoots.java`
#### Snippet
```java
  public String href;

  @XmlAttribute(required = false)
  @Nullable
  public String nextHref;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/buildType/VcsRootInstances.java`
#### Snippet
```java
  public String href;

  @XmlAttribute(required = false)
  @Nullable
  public String nextHref;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/buildType/VcsRootInstances.java`
#### Snippet
```java
  public String nextHref;

  @XmlAttribute(required = false)
  @Nullable
  public String prevHref;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/audit/AuditEvents.java`
#### Snippet
```java
  @XmlAttribute(required = false) @Nullable public String nextHref;
  @XmlAttribute(required = false) @Nullable public String prevHref;
  @XmlAttribute(required = false) @Nullable public String href;

  public AuditEvents() {}
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/audit/AuditEvents.java`
#### Snippet
```java

  @XmlAttribute(required = false) @Nullable public String nextHref;
  @XmlAttribute(required = false) @Nullable public String prevHref;
  @XmlAttribute(required = false) @Nullable public String href;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/audit/AuditEvents.java`
#### Snippet
```java
  public Integer count;

  @XmlAttribute(required = false) @Nullable public String nextHref;
  @XmlAttribute(required = false) @Nullable public String prevHref;
  @XmlAttribute(required = false) @Nullable public String href;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/build/Branches.java`
#### Snippet
```java
  public Integer count;

  @XmlAttribute(required = false)
  @Nullable
  public String href;
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
1000 \* 60 \* 60 \* 24 \* 100: integer multiplication implicitly cast to long
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Project.java`
#### Snippet
```java
    // todo (TeamCity) can return some huge number for some reason: TW-19894
    final long fromNow_ms = interval.getStartPoint().getAbsoluteTime().getTime() - (new Date()).getTime();
    return 0 <= fromNow_ms && fromNow_ms <= 1000 * 60 * 60 * 24 * 100;
  }

```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BranchFinder.java`
#### Snippet
```java
    final String singleValue = locator.getSingleValue();
    if (singleValue != null) {
      if (!ANY.equals(singleValue)) {
//        result.branchName = singleValue;  do not set as it is ignore case and can match display/vcs branch
        filter.add(item -> singleValue.equalsIgnoreCase(item.getDisplayName()) || singleValue.equalsIgnoreCase(item.getName()));
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed with side effect extraction
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
      return new Compatibility.BasicAgentCompatibilityData(agent, buildType, false, "Agent belongs to the pool not associated with the project");
    }
    if (!compatibility.isCompatible()) {
      return new Compatibility.ActualAgentCompatibilityData(compatibility, agent);
    }
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `src/jetbrains/buildServer/server/rest/data/change/ChangeUtil.java`
#### Snippet
```java
  public static SnapshotDependencyLink getSnapshotDependencyLink(@NotNull ChangeDescriptor changeDescriptor, @NotNull Fields fields, @NotNull BeanContext context) {
    Object data = changeDescriptor.getAssociatedData().get(ChangeDescriptorConstants.SNAPSHOT_DEPENDENCY_PROMOTION);
    if (data instanceof BuildPromotion) {
      BuildPromotion p = (BuildPromotion) data;
      SBuild build = p.getAssociatedBuild();
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/jetbrains/buildServer/server/rest/data/finder/impl/UserFinder.java`
#### Snippet
```java
      SUser user = null;
      try {
        user = super.getItem(locatorText);
        return user;
      } finally {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/jetbrains/buildServer/server/rest/data/finder/impl/UserFinder.java`
#### Snippet
```java
      }
    }
    return super.getItem(locatorText);
  }

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.NotNull;`
in `src/jetbrains/buildServer/server/graphql/model/mutation/MoveCloudImageToAgentPoolPayload.java`
#### Snippet
```java
import jetbrains.buildServer.server.graphql.model.CloudImage;
import jetbrains.buildServer.server.graphql.model.agentPool.AgentPool;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

```

### UNUSED_IMPORT
Unused import `import java.util.Objects;`
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Objects;
import java.util.*;
import java.util.concurrent.TimeUnit;
```

### UNUSED_IMPORT
Unused import `import java.util.Comparator;`
in `src/jetbrains/buildServer/server/rest/data/investigations/InvestigationWrapper.java`
#### Snippet
```java

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.data.ParameterCondition;`
in `src/jetbrains/buildServer/server/rest/data/parameters/ParametersProviderBackedEntityWithParameters.java`
#### Snippet
```java
import jetbrains.buildServer.parameters.ParametersProvider;
import jetbrains.buildServer.server.rest.data.Locator;
import jetbrains.buildServer.server.rest.data.ParameterCondition;
import jetbrains.buildServer.serverSide.Parameter;
import jetbrains.buildServer.serverSide.SimpleParameter;
```

### UNUSED_IMPORT
Unused import `import io.swagger.annotations.ExtensionProperty;`
in `src/jetbrains/buildServer/server/rest/model/Entries.java`
#### Snippet
```java

import com.intellij.util.containers.SortedList;
import io.swagger.annotations.ExtensionProperty;
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;`
in `src/jetbrains/buildServer/server/rest/model/Entries.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;
import jetbrains.buildServer.server.rest.util.DefaultValueAware;
import jetbrains.buildServer.server.rest.util.ValueWithDefault;
```

### UNUSED_IMPORT
Unused import `import java.util.function.Supplier;`
in `src/jetbrains/buildServer/server/rest/model/ItemsProviders.java`
#### Snippet
```java
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
```

### UNUSED_IMPORT
Unused import `import io.swagger.annotations.ExtensionProperty;`
in `src/jetbrains/buildServer/server/rest/model/RelatedEntities.java`
#### Snippet
```java
package jetbrains.buildServer.server.rest.model;

import io.swagger.annotations.ExtensionProperty;
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.annotations.ModelDescription;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.annotations.ModelDescription;`
in `src/jetbrains/buildServer/server/rest/model/RelatedEntities.java`
#### Snippet
```java
import io.swagger.annotations.ExtensionProperty;
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.annotations.ModelDescription;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;`
in `src/jetbrains/buildServer/server/rest/model/RelatedEntities.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.swagger.annotations.ModelDescription;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;
import jetbrains.buildServer.server.rest.util.BeanContext;
import jetbrains.buildServer.server.rest.util.ValueWithDefault;
```

### UNUSED_IMPORT
Unused import `import io.swagger.annotations.ExtensionProperty;`
in `src/jetbrains/buildServer/server/rest/model/audit/AuditEvents.java`
#### Snippet
```java
package jetbrains.buildServer.server.rest.model.audit;

import io.swagger.annotations.ExtensionProperty;
import jetbrains.buildServer.server.rest.model.Fields;
import jetbrains.buildServer.server.rest.model.PagerData;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;`
in `src/jetbrains/buildServer/server/rest/model/audit/AuditEvents.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;
import jetbrains.buildServer.server.rest.util.BeanContext;
import jetbrains.buildServer.server.rest.util.ValueWithDefault;
```

### UNUSED_IMPORT
Unused import `import io.swagger.annotations.ExtensionProperty;`
in `src/jetbrains/buildServer/server/rest/model/build/VcsLabels.java`
#### Snippet
```java
package jetbrains.buildServer.server.rest.model.build;

import io.swagger.annotations.ExtensionProperty;
import java.util.ArrayList;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;`
in `src/jetbrains/buildServer/server/rest/model/build/VcsLabels.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.model.Fields;
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.util.ValueWithDefault;
```

### UNUSED_IMPORT
Unused import `import io.swagger.annotations.ExtensionProperty;`
in `src/jetbrains/buildServer/server/rest/model/buildType/Investigations.java`
#### Snippet
```java
package jetbrains.buildServer.server.rest.model.buildType;

import io.swagger.annotations.ExtensionProperty;
import jetbrains.buildServer.ServiceLocator;
import jetbrains.buildServer.server.rest.data.investigations.InvestigationWrapper;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;`
in `src/jetbrains/buildServer/server/rest/model/buildType/Investigations.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;
import jetbrains.buildServer.server.rest.util.BeanContext;
import jetbrains.buildServer.server.rest.util.DefaultValueAware;
```

### UNUSED_IMPORT
Unused import `import io.swagger.annotations.ExtensionProperty;`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesAgentRequirement.java`
#### Snippet
```java
package jetbrains.buildServer.server.rest.model.buildType;

import io.swagger.annotations.ExtensionProperty;
import jetbrains.buildServer.ServiceLocator;
import jetbrains.buildServer.requirements.Requirement;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesAgentRequirement.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;
import jetbrains.buildServer.server.rest.util.BeanContext;
import jetbrains.buildServer.server.rest.util.ValueWithDefault;
```

### UNUSED_IMPORT
Unused import `import io.swagger.annotations.ExtensionProperty;`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesArtifactDep.java`
#### Snippet
```java
package jetbrains.buildServer.server.rest.model.buildType;

import io.swagger.annotations.ExtensionProperty;
import jetbrains.buildServer.ServiceLocator;
import jetbrains.buildServer.server.rest.errors.BadRequestException;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesArtifactDep.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;
import jetbrains.buildServer.server.rest.util.BeanContext;
import jetbrains.buildServer.server.rest.util.DefaultValueAware;
```

### UNUSED_IMPORT
Unused import `import io.swagger.annotations.ExtensionProperty;`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesFeature.java`
#### Snippet
```java
package jetbrains.buildServer.server.rest.model.buildType;

import io.swagger.annotations.ExtensionProperty;
import jetbrains.buildServer.ServiceLocator;
import jetbrains.buildServer.server.rest.errors.BadRequestException;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesFeature.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;
import jetbrains.buildServer.server.rest.util.BeanContext;
import jetbrains.buildServer.server.rest.util.ValueWithDefault;
```

### UNUSED_IMPORT
Unused import `import io.swagger.annotations.ExtensionProperty;`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesSnapshotDep.java`
#### Snippet
```java
package jetbrains.buildServer.server.rest.model.buildType;

import io.swagger.annotations.ExtensionProperty;
import jetbrains.buildServer.ServiceLocator;
import jetbrains.buildServer.server.rest.errors.BadRequestException;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesSnapshotDep.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;
import jetbrains.buildServer.server.rest.util.BeanContext;
import jetbrains.buildServer.server.rest.util.ValueWithDefault;
```

### UNUSED_IMPORT
Unused import `import io.swagger.annotations.ExtensionProperty;`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesStep.java`
#### Snippet
```java
package jetbrains.buildServer.server.rest.model.buildType;

import io.swagger.annotations.ExtensionProperty;
import jetbrains.buildServer.ServiceLocator;
import jetbrains.buildServer.server.rest.errors.BadRequestException;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesStep.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;
import jetbrains.buildServer.server.rest.util.BeanContext;
import jetbrains.buildServer.server.rest.util.ValueWithDefault;
```

### UNUSED_IMPORT
Unused import `import io.swagger.annotations.ExtensionProperty;`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesTrigger.java`
#### Snippet
```java
package jetbrains.buildServer.server.rest.model.buildType;

import io.swagger.annotations.ExtensionProperty;
import jetbrains.buildServer.ServiceLocator;
import jetbrains.buildServer.buildTriggers.BuildTriggerDescriptor;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesTrigger.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;
import jetbrains.buildServer.server.rest.util.BeanContext;
import jetbrains.buildServer.server.rest.util.ValueWithDefault;
```

### UNUSED_IMPORT
Unused import `import javax.xml.bind.annotation.XmlAttribute;`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntityAgentRequirement.java`
#### Snippet
```java
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

```

### UNUSED_IMPORT
Unused import `import io.swagger.annotations.ExtensionProperty;`
in `src/jetbrains/buildServer/server/rest/model/change/FileChanges.java`
#### Snippet
```java

import com.intellij.openapi.diagnostic.Logger;
import io.swagger.annotations.ExtensionProperty;
import javax.xml.bind.annotation.XmlRootElement;
import jetbrains.buildServer.server.rest.model.Fields;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.annotations.ModelDescription;`
in `src/jetbrains/buildServer/server/rest/model/change/FileChanges.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.model.Fields;
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.annotations.ModelDescription;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;`
in `src/jetbrains/buildServer/server/rest/model/change/FileChanges.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.swagger.annotations.ModelDescription;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;
import jetbrains.buildServer.server.rest.util.ValueWithDefault;
import jetbrains.buildServer.serverSide.TeamCityProperties;
```

### UNUSED_IMPORT
Unused import `import io.swagger.annotations.ExtensionProperty;`
in `src/jetbrains/buildServer/server/rest/model/change/RepositoryState.java`
#### Snippet
```java
import javax.xml.bind.annotation.XmlType;

import io.swagger.annotations.ExtensionProperty;
import jetbrains.buildServer.server.rest.data.BranchData;
import jetbrains.buildServer.server.rest.model.Fields;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;`
in `src/jetbrains/buildServer/server/rest/model/change/RepositoryState.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.annotations.ModelDescription;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.util.BeanContext;
```

### UNUSED_IMPORT
Unused import `import io.swagger.annotations.ExtensionProperty;`
in `src/jetbrains/buildServer/server/rest/model/issue/IssueUsages.java`
#### Snippet
```java
import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ExtensionProperty;
import jetbrains.buildServer.issueTracker.Issue;
import jetbrains.buildServer.server.rest.model.Fields;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;`
in `src/jetbrains/buildServer/server/rest/model/issue/IssueUsages.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.model.Fields;
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.util.BeanContext;
```

### UNUSED_IMPORT
Unused import `import io.swagger.annotations.ExtensionProperty;`
in `src/jetbrains/buildServer/server/rest/model/issue/Issues.java`
#### Snippet
```java
package jetbrains.buildServer.server.rest.model.issue;

import io.swagger.annotations.ExtensionProperty;
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.annotations.ModelDescription;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.annotations.ModelDescription;`
in `src/jetbrains/buildServer/server/rest/model/issue/Issues.java`
#### Snippet
```java
import io.swagger.annotations.ExtensionProperty;
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.annotations.ModelDescription;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;`
in `src/jetbrains/buildServer/server/rest/model/issue/Issues.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.swagger.annotations.ModelDescription;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;

import javax.xml.bind.annotation.XmlElement;
```

### UNUSED_IMPORT
Unused import `import io.swagger.annotations.ExtensionProperty;`
in `src/jetbrains/buildServer/server/rest/model/metrics/Metrics.java`
#### Snippet
```java
package jetbrains.buildServer.server.rest.model.metrics;

import io.swagger.annotations.ExtensionProperty;
import jetbrains.buildServer.metrics.MetricValue;
import jetbrains.buildServer.metrics.ServerMetricsReader;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;`
in `src/jetbrains/buildServer/server/rest/model/metrics/Metrics.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;
import jetbrains.buildServer.server.rest.util.ValueWithDefault;
import jetbrains.buildServer.util.CollectionsUtil;
```

### UNUSED_IMPORT
Unused import `import io.swagger.annotations.ExtensionProperty;`
in `src/jetbrains/buildServer/server/rest/model/problem/Tests.java`
#### Snippet
```java
package jetbrains.buildServer.server.rest.model.problem;

import io.swagger.annotations.ExtensionProperty;
import java.util.Collection;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;`
in `src/jetbrains/buildServer/server/rest/model/problem/Tests.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.model.PagerData;
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.util.BeanContext;
```

### UNUSED_IMPORT
Unused import `import javax.xml.bind.annotation.XmlRootElement;`
in `src/jetbrains/buildServer/server/rest/model/problem/scope/AbstractLeaf.java`
#### Snippet
```java

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import jetbrains.buildServer.server.rest.data.problem.tree.ScopeTree;
```

### UNUSED_IMPORT
Unused import `import javax.xml.bind.annotation.XmlType;`
in `src/jetbrains/buildServer/server/rest/model/problem/scope/AbstractLeaf.java`
#### Snippet
```java
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import jetbrains.buildServer.server.rest.data.problem.tree.ScopeTree;
import jetbrains.buildServer.server.rest.data.problem.tree.TreeCounters;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.model.user.PermissionAssignment;`
in `src/jetbrains/buildServer/server/rest/model/project/SshKeys.java`
#### Snippet
```java
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import jetbrains.buildServer.server.rest.model.user.PermissionAssignment;
import jetbrains.buildServer.server.rest.swagger.annotations.ModelDescription;

```

### UNUSED_IMPORT
Unused import `import io.swagger.annotations.ExtensionProperty;`
in `src/jetbrains/buildServer/server/rest/model/user/PermissionRestrictions.java`
#### Snippet
```java
import javax.xml.bind.annotation.XmlType;

import io.swagger.annotations.ExtensionProperty;
import jetbrains.buildServer.server.rest.model.Fields;
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;`
in `src/jetbrains/buildServer/server/rest/model/user/PermissionRestrictions.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.model.Fields;
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.util.BeanContext;
```

### UNUSED_IMPORT
Unused import `import io.swagger.annotations.ExtensionProperty;`
in `src/jetbrains/buildServer/server/rest/model/user/Tokens.java`
#### Snippet
```java
import javax.xml.bind.annotation.XmlType;

import io.swagger.annotations.ExtensionProperty;
import jetbrains.buildServer.server.rest.model.Fields;
import jetbrains.buildServer.server.rest.util.BeanContext;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;`
in `src/jetbrains/buildServer/server/rest/model/user/Tokens.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.util.BeanContext;
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.constants.ExtensionType;
import jetbrains.buildServer.server.rest.swagger.constants.ObjectType;
import jetbrains.buildServer.server.rest.util.ValueWithDefault;
```

### UNUSED_IMPORT
Unused import `import java.util.Objects;`
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Objects;
import java.util.*;
import java.util.concurrent.TimeUnit;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.model.Util;`
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.errors.OperationException;
import jetbrains.buildServer.server.rest.model.Properties;
import jetbrains.buildServer.server.rest.model.Util;
import jetbrains.buildServer.server.rest.model.*;
import jetbrains.buildServer.server.rest.model.build.Builds;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.server.rest.model.server.CleanupSettings;`
in `src/jetbrains/buildServer/server/rest/request/ServerRequest.java`
#### Snippet
```java
import jetbrains.buildServer.server.rest.model.metrics.Metrics;
import jetbrains.buildServer.server.rest.model.plugin.PluginInfos;
import jetbrains.buildServer.server.rest.model.server.CleanupSettings;
import jetbrains.buildServer.server.rest.model.server.*;
import jetbrains.buildServer.server.rest.util.BeanContext;
```

### UNUSED_IMPORT
Unused import `import io.swagger.annotations.ExtensionProperty;`
in `src/jetbrains/buildServer/server/rest/swagger/ExtensionModelResolver.java`
#### Snippet
```java
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.intellij.openapi.diagnostic.Logger;
import io.swagger.annotations.ExtensionProperty;
import io.swagger.converter.ModelConverter;
import io.swagger.converter.ModelConverterContext;
```

### UNUSED_IMPORT
Unused import `import javax.xml.bind.annotation.XmlElement;`
in `src/jetbrains/buildServer/server/rest/swagger/ExtensionModelResolver.java`
#### Snippet
```java
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import jetbrains.buildServer.server.rest.swagger.annotations.ModelBaseType;
import jetbrains.buildServer.server.rest.swagger.annotations.ModelDescription;
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
    return ValueWithDefault.decideDefault(myFields.isIncluded("pauseComment", false, false), () -> {
      jetbrains.buildServer.serverSide.comments.Comment pauseComment;
      if (myBuildType != null && myBuildType.getBuildType() != null && (pauseComment = myBuildType.getBuildType().getPauseComment()) != null) {
        return new Comment(pauseComment, myFields.getNestedField("pauseComment"), myBeanContext);
      } else {
```

### NestedAssignment
Result of assignment expression used
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
    byte[] buf = new byte[8192];
    int length;
    while ((length = source.read(buf)) != -1) {
      target.write(buf, 0, length);
    }
```

### NestedAssignment
Result of assignment expression used
in `src/jetbrains/buildServer/server/rest/model/user/Token.java`
#### Snippet
```java

  public void setPermissionRestrictions(@Nullable final PermissionRestrictions permissionRestrictions) {
    FeatureToggle.withToggleOnByDefault("teamcity.internal.accessTokens.enablePermissionScopes", () -> this.permissionRestrictions = permissionRestrictions);
  }

```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`myTimeMs = myTimeMs + firstNumber * dimensionValue` could be simplified to 'myTimeMs += firstNumber \* dimensionValue'
in `src/jetbrains/buildServer/server/rest/data/TimeWithPrecision.java`
#### Snippet
```java
      long firstNumber = getNextNumber();
      removeNextSection();
      myTimeMs = myTimeMs + firstNumber * dimensionValue;

      return this;
```

### ReplaceAssignmentWithOperatorAssignment
`parsedIndex = parsedIndex + complexValueEnd` could be simplified to 'parsedIndex += complexValueEnd'
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
            }
            currentDimensionValue = valueAndRest.substring(DIMENSION_COMPLEX_VALUE_START_DELIMITER.length(), complexValueEnd - DIMENSION_COMPLEX_VALUE_END_DELIMITER.length());
            parsedIndex = parsedIndex + complexValueEnd;
            if (parsedIndex != locator.length()) {
              if (!locator.startsWith(DIMENSIONS_DELIMITER, parsedIndex)) {
```

### ReplaceAssignmentWithOperatorAssignment
`parsedIndex = parsedIndex + valueEnd + DIMENSIONS_DELIMITER.length()` could be simplified to 'parsedIndex += valueEnd + DIMENSIONS_DELIMITER.length()'
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
            } else {
              currentDimensionValue = valueAndRest.substring(0, valueEnd);
              parsedIndex = parsedIndex + valueEnd + DIMENSIONS_DELIMITER.length();
            }
            if (ANY_LITERAL.equals(currentDimensionValue)) {
```

### ReplaceAssignmentWithOperatorAssignment
`pos = pos + DIMENSION_COMPLEX_VALUE_START_DELIMITER.length()` could be simplified to 'pos += DIMENSION_COMPLEX_VALUE_START_DELIMITER.length()'
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
      if (text.startsWith(DIMENSION_COMPLEX_VALUE_START_DELIMITER, pos)) {
        nesting++;
        pos = pos + DIMENSION_COMPLEX_VALUE_START_DELIMITER.length();
      } else if (text.startsWith(DIMENSION_COMPLEX_VALUE_END_DELIMITER, pos)) {
        if (nesting == 0) {
```

### ReplaceAssignmentWithOperatorAssignment
`pos = pos + DIMENSION_COMPLEX_VALUE_END_DELIMITER.length()` could be simplified to 'pos += DIMENSION_COMPLEX_VALUE_END_DELIMITER.length()'
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
          nesting--;
        }
        pos = pos + DIMENSION_COMPLEX_VALUE_END_DELIMITER.length();
        if (nesting == 0 && stopText == null) return pos;
      } else if (nesting == 0 && stopText != null && text.startsWith(stopText, pos)) {
```

### ReplaceAssignmentWithOperatorAssignment
`i = i + 2` could be simplified to 'i += 2'
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
      throw new IllegalArgumentException("The number of parameters should be even");
    }
    for (int i = 0; i < strings.length; i = i + 2) {
      result.setDimension(strings[i], strings[i + 1]);
    }
```

## RuleId[id=SimplifiableBooleanExpression]
### SimplifiableBooleanExpression
`!(filterValue ^ actualValue)` can be simplified to 'filterValue==actualValue'
in `src/jetbrains/buildServer/server/rest/data/util/FilterUtil.java`
#### Snippet
```java
public class FilterUtil {
  public static boolean isIncludedByBooleanFilter(@Nullable final Boolean filterValue, @Nullable final Boolean actualValue) {
    return filterValue == null || actualValue == null || (!(filterValue ^ actualValue));
  }

```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/model/build/approval/GroupApprovalRuleStatuses.java`
#### Snippet
```java
        fields.isIncluded("groupApproval", false, true),
        () -> {
          return rules.stream()
                      .map(rule -> new GroupApprovalRuleStatus(buildPromotionEx, rule, fields.getNestedField("groupApproval"), beanContext))
                      .collect(Collectors.toList());
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
    }
    return ValueWithDefault.decideDefault(myFields.isIncluded("compatibleCloudImages", false, true), () -> {
      return findCompatibleCloudImages(myFields.getNestedField("compatibleCloudImages"));
    });
  }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  public PropEntitiesStep getSteps() {
    return myBuildType == null ? null : ValueWithDefault.decideIncludeByDefault(myFields.isIncluded("steps", false), check(() -> {
        return new PropEntitiesStep(myBuildType.getSettingsEx(), myFields.getNestedField("steps", Fields.NONE, Fields.LONG), myBeanContext);
    }));
  }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
               myFields.isIncluded("snapshot-dependencies", false),
               check(() -> {
                 return new PropEntitiesSnapshotDep(myBuildType.getSettingsEx(), myFields
                     .getNestedField("snapshot-dependencies", Fields.NONE, Fields.LONG), myBeanContext);
               })
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  public PropEntitiesFeature getFeatures() {
    return myBuildType == null ? null : ValueWithDefault.decideIncludeByDefault(myFields.isIncluded("features", false), check(() -> {
        return new PropEntitiesFeature(myBuildType.getSettingsEx(), myFields.getNestedField("features", Fields.NONE, Fields.LONG), myBeanContext);
    }));
  }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  public PropEntitiesTrigger getTriggers() {
    return myBuildType == null ? null : ValueWithDefault.decideIncludeByDefault(myFields.isIncluded("triggers", false), check(() -> {
        return new PropEntitiesTrigger(myBuildType.getSettingsEx(), myFields.getNestedField("triggers", Fields.NONE, Fields.LONG), myBeanContext);
    }));
  }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java
      result.append(compare("disabledSetting", a.getDisabledParameterDescriptorIds(), a.getOwnDisabledParameterDescriptorIds(), b.getDisabledParameterDescriptorIds(),
                            b.getOwnDisabledParameterDescriptorIds(), compareInheritedFlag,
                            (result1, oA, oB, entityName, fieldPrefix) -> {
                              result1.append(compareObjects(entityName, oA, oB, fieldPrefix + "id"));
                            }));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/graphql/resolver/agentPool/AgentPoolResolver.java`
#### Snippet
```java
              return type != null && pool.getRealPool().getAgentPoolId() != type.getAgentPoolId();
            })
            .forEach(image -> {
              images.add(new Pair<>(profile, image));
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/graphql/resolver/AgentBuildTypeEdgeResolver.java`
#### Snippet
```java
      }

      compatibility.getMissedVcsPluginsOnAgent().forEach((pluginName, displayName) -> {
        result.add(new MissedVCSPluginAgentBuildTypeIncompatibility(displayName));
      });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/graphql/resolver/AgentBuildTypeEdgeResolver.java`
#### Snippet
```java
      });

      compatibility.getInvalidRunParameters().forEach(prop -> {
        result.add(new InvalidRunParameterAgentBuildTypeIncompatibility(prop.getPropertyName(), prop.getInvalidReason()));
      });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/graphql/resolver/AgentBuildTypeEdgeResolver.java`
#### Snippet
```java
      });

      compatibility.getUndefinedParameters().forEach((name, origin) -> {
        result.add(new UndefinedRunParameterAgentBuildTypeIncompatibility(name, origin));
      });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/graphql/resolver/AgentBuildTypeEdgeResolver.java`
#### Snippet
```java
      });

      compatibility.getNonMatchedRequirements().forEach(r -> {
        result.add(new UnmetRequirementAgentBuildTypeIncompatibility(r.getPropertyName(), r.getPropertyValue(), r.getType().toString()));
      });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/data/ParameterCondition.java`
#### Snippet
```java

    return parametersProvider -> {
      return list.stream().allMatch(condition -> condition.matches(parametersProvider));
    };
  }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java
                if (runAsSystemActual) {
                  if (shouldLogToDebug && LOG.isDebugEnabled()) LOG.debug("Executing request with system security level");
                  mySecurityContext.runAsSystem(() -> {
                    myWebComponent.doFilter(actualRequest, response, null);
                  });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java

  private void initJerseyWebComponentAsync() {
    new NamedDaemonThreadFactory("REST API initializer for " + getPluginIdentifyingText()).newThread(() -> {
      initJerseyWebComponent(() -> "via background initial initialization");
    }).start();
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BranchFinder.java`
#### Snippet
```java
  public DuplicateChecker<BranchData> createDuplicateChecker() {
    return new ComparatorDuplicateChecker<>((branchData1, branchData2) -> {
      return ComparisonChain.start()
                            .compareTrueFirst(branchData1.isDefaultBranch(), branchData2.isDefaultBranch())
                            .compare(branchData1.getName(), branchData2.getName())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BranchFinder.java`
#### Snippet
```java
      ArrayList<BranchData> result = new ArrayList<>(myMap.values());
      result.sort((o1, o2) -> {
            return ComparisonChain.start()
                                  .compareTrueFirst(Branch.DEFAULT_BRANCH_NAME.equals(o1.getName()), Branch.DEFAULT_BRANCH_NAME.equals(o2.getName()))
                                  .compareFalseFirst(Branch.UNSPECIFIED_BRANCH_NAME.equals(o1.getName()), Branch.UNSPECIFIED_BRANCH_NAME.equals(o2.getName()))
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/model/metrics/Metrics.java`
#### Snippet
```java
    
    metrics = ValueWithDefault.decideDefault(fields.isIncluded("metric", true, true), () -> {
      return CollectionsUtil
        .convertCollection(metricValues, new Converter<Metric, MetricValue>() {
          public Metric createFrom(@NotNull final MetricValue source) {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/model/metrics/Metric.java`
#### Snippet
```java
  public MetricValues getMetricValues() {
    return ValueWithDefault.decideDefault(myFields.isIncluded("metricValues"), () -> {
      return new MetricValues(myMetricValue.getValues(), myFields);
    });
  }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudInstanceFinder.java`
#### Snippet
```java

      multipleConvertToItemHolder(DimensionCondition.ALWAYS, dimensions -> {
        return myCloudUtil.getAllInstancesProcessor();
      });

```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/model/user/User.java`
#### Snippet
```java
  public String getUsername() {
    return myUser == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("username"), () -> {
      return myUser.getUsername();
    });
  }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/model/user/User.java`
#### Snippet
```java
  public String getName() {
    return myUser == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("name"), () -> {
      return StringUtil.isEmpty(myUser.getName()) ? null : myUser.getName();
    });
  }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/model/metrics/MetricValue.java`
#### Snippet
```java
           .append("tags=(");

    myName.getAdditionalTags().entrySet().forEach(e -> {
      builder.append(String.format("'%s'='%s',", e.getKey(), e.getValue()));
    });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/data/util/itemholder/ItemHolder.java`
#### Snippet
```java
  default <R> ItemHolder<R> map(Function<T, R> mapper) {
    return processor -> process(item -> {
      return processor.processItem(mapper.apply(item));
    });
  }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/model/change/Change.java`
#### Snippet
```java
  public String getType() {
    return ValueWithDefault.decideDefault(myFields.isIncluded("type", false), () -> {
      return myDescriptor != null ? myDescriptor.getType() : null;
    });
  }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
    return ValueWithDefault.decideDefault(
      myFields.isIncluded("uuid", false, false), () -> {
        return myBeanContext
                 .getSingletonService(PermissionChecker.class)
                 .isPermissionGranted(Permission.EDIT_PROJECT, myProject.getProjectId())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/model/build/approval/UserApprovalRuleStatuses.java`
#### Snippet
```java
        fields.isIncluded("userApproval", false, true),
        () -> {
          return rules.stream()
                      .map(rule -> new UserApprovalRuleStatus(buildPromotionEx, rule, fields.getNestedField("userApproval"), beanContext))
                      .collect(Collectors.toList());
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/request/NodesRequest.java`
#### Snippet
```java
  public Nodes getAllNodes(@ApiParam(format = LocatorName.TEAMCITY_NODE) @QueryParam("locator") String locator, @QueryParam("fields") String fields) {
    return executeSafely(() -> {
      return new Nodes(myFinder.getItems(locator).myEntries, new Fields(fields), myPermissionChecker);
    });
  }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/model/problem/scope/ProblemOccurrencesTree.java`
#### Snippet
```java
        myFields.isIncluded("name"),
        () -> {
          return myNode.getData().get(0).getTypeDescription();
        }
      );
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  public Customizations getCustomization() {
    return ValueWithDefault.decideDefault(myFields.isIncluded("customization", false, true), () -> {
      return new Customizations(((BuildPromotionEx)myBuildPromotion).getPromotionCustomization().getItems());
    });
  }
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `myModelResolvers` are queried, but never updated
in `src/jetbrains/buildServer/server/graphql/resolver/Query.java`
#### Snippet
```java

  @Autowired
  private List<ModelResolver<?>> myModelResolvers;

  @Autowired
```

### MismatchedCollectionQueryUpdate
Contents of collection `vcsRoots` are queried, but never updated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java
      final String vcsRoot = locator.getSingleDimensionValue(VCS_ROOT_DIMENSION);
      if (vcsRoot != null) {
        final Set<SVcsRoot> vcsRoots = new HashSet<>(myServiceLocator.getSingletonService(VcsRootFinder.class).getItems(vcsRoot).myEntries);
        result.add(item -> {
            for (VcsRootInstanceEntry vcsRootInstanceEntry : item.getVcsRootInstanceEntries()) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `vcsRootInstances` are queried, but never updated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java
      final String vcsRootInstance = locator.getSingleDimensionValue(VCS_ROOT_INSTANCE_DIMENSION);
      if (vcsRootInstance != null) {
        final Set<jetbrains.buildServer.vcs.VcsRootInstance> vcsRootInstances =
          new HashSet<>(myServiceLocator.getSingletonService(VcsRootInstanceFinder.class).getItems(vcsRootInstance).myEntries);
        result.add(item -> {
```

### MismatchedCollectionQueryUpdate
Contents of collection `vcsRoots` are queried, but never updated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java
    final String vcsRoot = locator.getSingleDimensionValue(VCS_ROOT_DIMENSION);
    if (vcsRoot != null) {
      final Set<SVcsRoot> vcsRoots = new HashSet<SVcsRoot>(myServiceLocator.getSingletonService(VcsRootFinder.class).getItems(vcsRoot).myEntries);
      final VcsManager vcsManager = myServiceLocator.getSingletonService(VcsManager.class);
      final LinkedHashSet<BuildTypeOrTemplate> result = new LinkedHashSet<BuildTypeOrTemplate>();
```

### MismatchedCollectionQueryUpdate
Contents of collection `vcsRootInstances` are queried, but never updated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java
    final String vcsRootInstance = locator.getSingleDimensionValue(VCS_ROOT_INSTANCE_DIMENSION);
    if (vcsRootInstance != null) {
      final Set<jetbrains.buildServer.vcs.VcsRootInstance> vcsRootInstances =
        new HashSet<jetbrains.buildServer.vcs.VcsRootInstance>(myServiceLocator.getSingletonService(VcsRootInstanceFinder.class).getItems(vcsRootInstance).myEntries);
      final List<SBuildType> result = new ArrayList<SBuildType>();
```

### MismatchedCollectionQueryUpdate
Contents of collection `filter` are queried, but never updated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
      final String equivalent = locator.getSingleDimensionValue(EQUIVALENT);
      if (equivalent != null) {
        final Set<BuildPromotion> filter = new HashSet<>(((BuildPromotionEx)getItem(equivalent)).getStartedEquivalentPromotions(-1));
        result.add(item -> filter.contains(item));
      }
```

## RuleId[id=ExtendsAnnotation]
### ExtendsAnnotation
Class 'CommonLocatorDimension' implements annotation interface `LocatorDimension`
in `src/jetbrains/buildServer/server/rest/swagger/CommonLocatorDimension.java`
#### Snippet
```java
import java.lang.annotation.Annotation;

public class CommonLocatorDimension implements LocatorDimension {
  public final String value;
  public final String dataType;
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `src/jetbrains/buildServer/server/rest/data/CloudUtil.java`
#### Snippet
```java
  private CloudInstancesProviderExtendedCallback callback(@NotNull final ItemProcessor<CloudInstanceData> processor) {
    return new CloudInstancesProviderExtendedCallback() {
      @Override public void processNotReady(@NotNull final CloudProfile profile) {}
      @Override public void processClientError(@NotNull final CloudProfile profile, @NotNull CloudErrorInfo errorInfo) {}
      @Override public void processImageError(@NotNull final CloudProfile profile, @NotNull final CloudImage image) {}
```

### EmptyMethod
The method is empty
in `src/jetbrains/buildServer/server/rest/data/CloudUtil.java`
#### Snippet
```java
    return new CloudInstancesProviderExtendedCallback() {
      @Override public void processNotReady(@NotNull final CloudProfile profile) {}
      @Override public void processClientError(@NotNull final CloudProfile profile, @NotNull CloudErrorInfo errorInfo) {}
      @Override public void processImageError(@NotNull final CloudProfile profile, @NotNull final CloudImage image) {}
      @Override public void processInstanceError(@NotNull final CloudProfile profile, @NotNull final CloudInstance instance) {}
```

### EmptyMethod
The method is empty
in `src/jetbrains/buildServer/server/rest/data/CloudUtil.java`
#### Snippet
```java
      @Override public void processNotReady(@NotNull final CloudProfile profile) {}
      @Override public void processClientError(@NotNull final CloudProfile profile, @NotNull CloudErrorInfo errorInfo) {}
      @Override public void processImageError(@NotNull final CloudProfile profile, @NotNull final CloudImage image) {}
      @Override public void processInstanceError(@NotNull final CloudProfile profile, @NotNull final CloudInstance instance) {}
      @Override public void processInstanceExpired(@NotNull final CloudProfile profile, @NotNull final CloudClientEx client, @NotNull final CloudInstance instance) {}
```

### EmptyMethod
The method is empty
in `src/jetbrains/buildServer/server/rest/data/CloudUtil.java`
#### Snippet
```java
      @Override public void processClientError(@NotNull final CloudProfile profile, @NotNull CloudErrorInfo errorInfo) {}
      @Override public void processImageError(@NotNull final CloudProfile profile, @NotNull final CloudImage image) {}
      @Override public void processInstanceError(@NotNull final CloudProfile profile, @NotNull final CloudInstance instance) {}
      @Override public void processInstanceExpired(@NotNull final CloudProfile profile, @NotNull final CloudClientEx client, @NotNull final CloudInstance instance) {}
      @Override public boolean processInstance(@NotNull final CloudProfile profile, @NotNull final CloudInstance instance) {
```

### EmptyMethod
The method is empty
in `src/jetbrains/buildServer/server/rest/data/CloudUtil.java`
#### Snippet
```java
      @Override public void processImageError(@NotNull final CloudProfile profile, @NotNull final CloudImage image) {}
      @Override public void processInstanceError(@NotNull final CloudProfile profile, @NotNull final CloudInstance instance) {}
      @Override public void processInstanceExpired(@NotNull final CloudProfile profile, @NotNull final CloudClientEx client, @NotNull final CloudInstance instance) {}
      @Override public boolean processInstance(@NotNull final CloudProfile profile, @NotNull final CloudInstance instance) {
        return processor.processItem(new CloudInstanceData(instance, profile.getProfileId(), myServiceLocator));
```

### EmptyMethod
Method only calls its super
in `src/jetbrains/buildServer/server/rest/model/problem/scope/ProblemOccurrencesTree.java`
#### Snippet
```java
  @XmlElement(name = "node")
  @Override
  public List<Node> getNodes() {
    return super.getNodes();
  }
```

### EmptyMethod
Method only calls its super
in `src/jetbrains/buildServer/server/rest/model/problem/scope/ProblemOccurrencesTree.java`
#### Snippet
```java
  @XmlElement(name = "leaf")
  @Override
  public List<Leaf> getLeafs() {
    return super.getLeafs();
  }
```

### EmptyMethod
Method only calls its super
in `src/jetbrains/buildServer/server/rest/model/problem/scope/TestScopeTree.java`
#### Snippet
```java
  @XmlElement(name = "node")
  @Override
  public List<Node> getNodes() {
    return super.getNodes();
  }
```

### EmptyMethod
Method only calls its super
in `src/jetbrains/buildServer/server/rest/model/problem/scope/TestScopeTree.java`
#### Snippet
```java
  @XmlElement(name = "leaf")
  @Override
  public List<Leaf> getLeafs() {
    return super.getLeafs();
  }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/jetbrains/buildServer/server/rest/util/CachingValueNullable.java`
#### Snippet
```java
public abstract class CachingValueNullable<S> implements ValueWithDefault.Value<S> {
  private S myValue;
  private boolean myInitialized = false;

  @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/jetbrains/buildServer/server/rest/util/AggregatedBuildArtifactsElementBuilder.java`
#### Snippet
```java
  @Nullable private String myElementName;
  @Nullable private String myFullElementName;
  private boolean myHasDirElements = false;

  @NotNull
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/jetbrains/buildServer/server/rest/util/FilteringItemsRetriever.java`
#### Snippet
```java
public class FilteringItemsRetriever<T> implements ItemsProviders.ItemsRetriever<T> {
  private final ItemsProviders.ItemsRetriever<T> myUnfilteredItems;
  private List<T> myFilteredItems = null;
  private final String myLocator;
  private final Finder<T> myFinder;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/jetbrains/buildServer/server/rest/data/parameters/ParametersProviderBackedEntityWithParameters.java`
#### Snippet
```java
  private final ParametersProvider myProvider;
  @Nullable
  private List<Parameter> myParameters = null;

  public ParametersProviderBackedEntityWithParameters(@NotNull ParametersProvider provider) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/jetbrains/buildServer/server/rest/model/change/ChangeStatus.java`
#### Snippet
```java
  private class BuildsCollector implements ItemsProviders.ItemsRetriever<BuildPromotion> {
    private int myCount = 0;
    private List<BuildPromotion> myPromotions = null;

    BuildsCollector(@NotNull Fields fields) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/jetbrains/buildServer/server/rest/model/change/ChangeStatus.java`
#### Snippet
```java
   */
  private class BuildsCollector implements ItemsProviders.ItemsRetriever<BuildPromotion> {
    private int myCount = 0;
    private List<BuildPromotion> myPromotions = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java

    final BuildTypeOrTemplatePatcher buildTypeOrTemplatePatcher = new BuildTypeOrTemplatePatcher() {
      private BuildTypeOrTemplate myCached = null;

      @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/jetbrains/buildServer/server/rest/data/util/FilterItemProcessor.java`
#### Snippet
```java
*/
public class FilterItemProcessor<T> implements ItemProcessor<T> {
  private long myCurrentIndex = 0;
  private long myTotalItemsProcessed = 0;
  private final PagingItemFilter<T> myFilter;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/jetbrains/buildServer/server/rest/data/util/FilterItemProcessor.java`
#### Snippet
```java
public class FilterItemProcessor<T> implements ItemProcessor<T> {
  private long myCurrentIndex = 0;
  private long myTotalItemsProcessed = 0;
  private final PagingItemFilter<T> myFilter;
  private final ArrayList<T> myList = new ArrayList<T>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
    private int myMaxLevel = 0;
    private int myMinLevel = 0;
    private int myCurrentLevel = 0;

    void process(char ch) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
  private static class LevelData {
    private int myMaxLevel = 0;
    private int myMinLevel = 0;
    private int myCurrentLevel = 0;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
  private final String myRawValue;
  @NotNull private final Metadata myMetadata;
  private boolean modified = false;
  private final Map<String, List<String>> myDimensions;
  private final String mySingleValue;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
  @NotNull private final Collection<String> myIgnoreUnusedDimensions = new HashSet<>();
  @NotNull private final Collection<String> myHiddenSupportedDimensions = new HashSet<>();
  private DescriptionProvider myDescriptionProvider = null;

  public Locator(@Nullable final String locator) throws LocatorProcessException {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java

  private static class LevelData {
    private int myMaxLevel = 0;
    private int myMinLevel = 0;
    private int myCurrentLevel = 0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/jetbrains/buildServer/server/rest/util/BuildTypeOrTemplate.java`
#### Snippet
```java
  @Nullable final private BuildTypeTemplate myTemplate;
  @NotNull final private BuildTypeIdentity myBuildTypeIdentity;
  @Nullable private Boolean myInherited = null; //used in template lists only

  public BuildTypeOrTemplate(@NotNull SBuildType buildType) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java
  public static final String REST_PREFER_OWN_BIND_PATHS = "rest.allow.bind.paths.override.for.plugins";
  private static final String CONTEXT_REQUEST_ARGUMENTS_PREFIX = RestApiInternalRequestTag.REQUEST_ARGUMENTS_PREFIX;
  private static String OUR_FIRST_BIND_PATH = null;
  private final Logger LOG;
  private final boolean myInternalAuthProcessing = TeamCityProperties.getBoolean("rest.cors.optionsRequest.allowUnauthorized");
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BranchFinder.java`
#### Snippet
```java
    private ItemFilter<BranchData> filter;
    private String branchName; // name or display name of the branch, if set. Even if set, there might be other conditions set
    private boolean matchesAllBranches = false;
    private boolean matchesDefaultBranchOrNotBranched = false;
    private boolean unspecified = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BranchFinder.java`
#### Snippet
```java
    private String branchName; // name or display name of the branch, if set. Even if set, there might be other conditions set
    private boolean matchesAllBranches = false;
    private boolean matchesDefaultBranchOrNotBranched = false;
    private boolean unspecified = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BranchFinder.java`
#### Snippet
```java
    private boolean matchesAllBranches = false;
    private boolean matchesDefaultBranchOrNotBranched = false;
    private boolean unspecified = false;

    public boolean isIncluded(@NotNull final BuildPromotion promotion) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
    final Date sinceStartDateFinal = sinceStartDate;
    return new ItemFilter<BuildPromotion>() {
      private long currentLookAheadCount = 0;

      public boolean isIncluded(@NotNull final BuildPromotion item) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java

    private Iterable<Node> myCachedChildren;
    private boolean myCachedChildrenInitialized = false;

    public Iterable<Node> getChildren() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
    final BuildIconStatus.Value<BuildPromotion> buildPromotionRetriever = new BuildIconStatus.Value<BuildPromotion>() {
      private List<BuildPromotion> myBuilds;
      private int currentIndex = 0;

      @NotNull
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/jetbrains/buildServer/server/rest/data/util/PagingItemFilter.java`
#### Snippet
```java
  @Nullable private final Long myLookupLimit;
  private final long myActualStart;
  private boolean myLookupLimitReached = false;
  @Nullable private T myLastProcessedItem = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/jetbrains/buildServer/server/rest/data/util/PagingItemFilter.java`
#### Snippet
```java
  private final long myActualStart;
  private boolean myLookupLimitReached = false;
  @Nullable private T myLastProcessedItem = null;

  public PagingItemFilter(@NotNull final ItemFilter<T> filter, @Nullable final Long start, @Nullable final Integer count, @Nullable final Long lookupLimit) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/jetbrains/buildServer/server/rest/data/finder/impl/UserFinder.java`
#### Snippet
```java

    private Permissions globalPermissions = null;
    private Map<String, Permissions> projectsPermissions = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/jetbrains/buildServer/server/rest/data/finder/impl/UserFinder.java`
#### Snippet
```java
    }

    private Permissions globalPermissions = null;
    private Map<String, Permissions> projectsPermissions = null;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  }

  private boolean myCanViewRuntimeDataChecked = false;

  private void checkCanViewRuntimeData() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java

          private Integer myCachedCheapCount = null;
          private boolean myCheapCountIsCalculated = false;

          @Nullable
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
          }

          private Integer myCachedCheapCount = null;
          private boolean myCheapCountIsCalculated = false;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
    @NotNull protected final Dimension<TYPE> myDimension;
    @NotNull protected final DimensionValueMapper<TYPE> myValueMapper;
    protected String myDescription = null;
    protected Boolean myHidden = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
    @NotNull protected final DimensionValueMapper<TYPE> myValueMapper;
    protected String myDescription = null;
    protected Boolean myHidden = null;

    public TypedFinderDimensionImpl(@NotNull final Dimension<TYPE> dimension, @NotNull final DimensionValueMapper<TYPE> valueMapper) {
```

## RuleId[id=EqualsAndHashcode]
### EqualsAndHashcode
Class has `hashCode()` defined but does not define `equals()`
in `src/jetbrains/buildServer/server/rest/RequestWrapper.java`
#### Snippet
```java
 *         Date: 16.11.2009
 */
public class RequestWrapper extends HttpServletRequestWrapper {
  private static final Logger LOG = Logger.getInstance(RequestWrapper.class.getName());
  private final RequestPathTransformInfo myRequestPathTransformInfo;
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `PartialUpdateError` does not end with 'Exception'
in `src/jetbrains/buildServer/server/rest/errors/PartialUpdateError.java`
#### Snippet
```java
 *         Date: 02.12.13
 */
public class PartialUpdateError extends RuntimeException {
  public PartialUpdateError(String message, List<Throwable> causes) {
    super(getCombinedMessage(message, causes).toString(), getFirst(causes));
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/rest-api.f6f2b48a/diagnostic-2023-03-06-15-01-40.394.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer sb` may be declared as 'StringBuilder'
in `src/jetbrains/buildServer/server/rest/model/PagerDataImpl.java`
#### Snippet
```java
    String path = uri.getRawPath();
    assert path != null;
    StringBuffer sb = new StringBuffer();

    if (pathPrefixToExclude != null && path.startsWith(pathPrefixToExclude)) {
```

### StringBufferReplaceableByStringBuilder
`StringBuffer result` may be declared as 'StringBuilder'
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
    });
    action.stop();
    StringBuffer result = new StringBuffer();
    result.append("StdOut:").append(execResult.getStdout()).append("\n");
    result.append("StdErr: ").append(execResult.getStderr()).append("\n");
```

### StringBufferReplaceableByStringBuilder
`StringBuffer responseText` may be declared as 'StringBuilder'
in `src/jetbrains/buildServer/server/rest/jersey/ExceptionMapperBase.java`
#### Snippet
```java
      LOG.warn("Critical error encountered while reporting an error", error);
    }
    StringBuffer responseText = new StringBuffer();
    if (statusCode >= 500){
      responseText.append("Error has occurred during request processing");
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `src/jetbrains/buildServer/server/rest/data/changeLog/ChangeLogBeanCollector.java`
#### Snippet
```java
      Locator copy = new Locator(branchLocator);
      if(copy.isSingleValue()) {
        throw new BadRequestException(String.format("Single value branch locator is unsupported. There should be a name subdimension in a branch locator, which must be in a following format: branch:(name:(matchType:<MATCH_TYPE>,value:<VALUE>)) ."));
      }
      if (copy.isAnyPresent(BranchFinder.NAME)) {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/jetbrains/buildServer/server/rest/data/changeLog/ChangeLogBeanCollector.java`
#### Snippet
```java
        Locator name = Locator.createPotentiallyEmptyLocator(copy.getSingleDimensionValue(BranchFinder.NAME));
        if (!name.isAnyPresent("matchType")) {
          throw new BadRequestException(String.format("Name subdimension in a branch locator must be in a following format: name:(matchType:<MATCH_TYPE>,value:<VALUE>)."));
        }
      }
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java
          runAsSystem = true;
        } else {
          synchronized (this) {
            Thread.sleep(10000); //to prevent brute-forcing
          }
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `myLocator` of exception class
in `src/jetbrains/buildServer/server/rest/errors/LocatorProcessException.java`
#### Snippet
```java
 */
public class LocatorProcessException extends RuntimeException {
  @Nullable private Locator myLocator;

  public LocatorProcessException(final String locator, final int index, final String message) {
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/jetbrains/buildServer/server/rest/model/changeLog/ChangeLogGraphVertex.java`
#### Snippet
```java
  @XmlElement(name = "lines")
  public List<Integer[]> getLines() {
    return myVertex.getLines().stream().map(line -> line.getPositions().toArray(new Integer[0])).collect(Collectors.toList());
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/jetbrains/buildServer/server/rest/model/changeLog/ChangeLogGraphColumn.java`
#### Snippet
```java
  @XmlElement(name = "lines")
  public List<Integer[]> getLines() {
    return myColumn.getLines().stream().map(line -> line.getPositions().toArray(new Integer[0])).collect(Collectors.toList());
  }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/jetbrains/buildServer/server/graphql/resolver/Mutation.java`
#### Snippet
```java
        SProject project = myProjectFinder.getItem("id:" + input.getProjectRawId());
        List<String> bts = project.getBuildTypes().stream().map(bt -> bt.getInternalId()).collect(Collectors.toList());
        myAgentTypeManager.excludeRunConfigurationsFromAllowed(agent.getAgentTypeId(), bts.toArray(new String[0]));

        return DataFetcherResult.<UnassignProjectBuildTypesFromAgentPayload>newResult()
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/jetbrains/buildServer/server/graphql/resolver/Mutation.java`
#### Snippet
```java
      agent -> {
        SProject project = myProjectFinder.getItem("id:" + input.getProjectRawId());
        String[] bts = project.getBuildTypes().stream().map(bt -> bt.getInternalId()).collect(Collectors.toSet()).toArray(new String[0]);
        myAgentTypeManager.includeRunConfigurationsToAllowed(agent.getAgentTypeId(), bts);

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/jetbrains/buildServer/server/rest/data/problem/Orders.java`
#### Snippet
```java
  @NotNull
  public String[] getNames() {
    return myComparators.keySet().toArray(new String[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/jetbrains/buildServer/server/rest/request/RoleRequest.java`
#### Snippet
```java
    jetbrains.buildServer.serverSide.auth.Role newRole = rolesManager.createNewRole(role.name);
    if (permissions != null) {
      newRole.addPermissions(permissions.toArray(new Permission[0]));
    }
    if (included != null) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/jetbrains/buildServer/server/rest/data/finder/AbstractFinder.java`
#### Snippet
```java

  private final String[] myKnownDimensions;
  private String[] myHiddenDimensions = new String[]{};

  public AbstractFinder(@NotNull final String... knownDimensions) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
      for (Locator partialLocator : partialLocators) {
        partialLocator.setDimensionIfNotPresent(PagerData.COUNT, "1");  //limit to single item per strob item by default
        final String finalBuildLocator = Locator.createLocator(strobBuildLocator, partialLocator, new String[]{}).getStringRepresentation();
        strobResult.add(ItemHolder.of(getItems(finalBuildLocator).myEntries));
      }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java

    final List<ArtifactTreeElement> result = new ArrayList<>();
    AntPatternTreeMatcher.ScanOption[] options = {};
    if (includeDirectories != null && !includeDirectories) {
      options = new AntPatternTreeMatcher.ScanOption[]{AntPatternTreeMatcher.ScanOption.LEAFS_ONLY};  // does not seem to have any effect, see TW-41662
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/jetbrains/buildServer/server/rest/model/agent/CompatibilityPolicy.java`
#### Snippet
```java
      try {
        agentTypeManager.setRunConfigurationPolicy(agentTypeId, BuildAgentManager.RunConfigurationPolicy.SELECTED_COMPATIBLE_CONFIGURATIONS);
        agentTypeManager.excludeRunConfigurationsFromAllowed(agentTypeId, previous_canRunConfigurations.toArray(new String[0]));
        agentTypeManager.includeRunConfigurationsToAllowed(agentTypeId, buildTypesFromPosted.stream().map(jetbrains.buildServer.BuildType::getBuildTypeId).toArray(String[]::new));
      } catch (Exception e) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/jetbrains/buildServer/server/rest/model/agent/CompatibilityPolicy.java`
#### Snippet
```java
      } catch (Exception e) {
        agentTypeManager.setRunConfigurationPolicy(agentTypeId, previousPolicy);
        agentTypeManager.excludeRunConfigurationsFromAllowed(agentTypeId, agentTypeManager.getCanRunConfigurations(agentTypeId).toArray(new String[0]));
        agentTypeManager.includeRunConfigurationsToAllowed(agentTypeId, previous_canRunConfigurations.toArray(new String[0]));
        throw e;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/jetbrains/buildServer/server/rest/model/agent/CompatibilityPolicy.java`
#### Snippet
```java
        agentTypeManager.setRunConfigurationPolicy(agentTypeId, previousPolicy);
        agentTypeManager.excludeRunConfigurationsFromAllowed(agentTypeId, agentTypeManager.getCanRunConfigurations(agentTypeId).toArray(new String[0]));
        agentTypeManager.includeRunConfigurationsToAllowed(agentTypeId, previous_canRunConfigurations.toArray(new String[0]));
        throw e;
      }
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/jetbrains/buildServer/server/rest/request/ChangeRequest.java`
#### Snippet
```java

    final UriBuilder requestUriBuilder = uriInfo.getRequestUriBuilder();
    requestUriBuilder.replaceQueryParam("count" , null);
    requestUriBuilder.replaceQueryParam("start", null);
    return new Changes(buildModifications.myEntries,
```

### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/jetbrains/buildServer/server/rest/request/ChangeRequest.java`
#### Snippet
```java
    final UriBuilder requestUriBuilder = uriInfo.getRequestUriBuilder();
    requestUriBuilder.replaceQueryParam("count" , null);
    requestUriBuilder.replaceQueryParam("start", null);
    return new Changes(buildModifications.myEntries,
                       new PagerDataImpl(requestUriBuilder, request.getContextPath(), buildModifications, locatorText, "locator"),
```

### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/jetbrains/buildServer/server/rest/model/PagerDataImpl.java`
#### Snippet
```java
      return new UriModification(result, null);
    }
    newBuilder.replaceQueryParam(PagerData.START, null).replaceQueryParam(PagerData.COUNT, null);
    final String locatorWithStart = LocatorUtil.setDimension(locatorText, PagerData.START, start);
    String newLocator = count == null ? locatorWithStart : LocatorUtil.setDimension(locatorWithStart, PagerData.COUNT, count);
```

### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/jetbrains/buildServer/server/rest/model/PagerDataImpl.java`
#### Snippet
```java
      return new UriModification(result, null);
    }
    newBuilder.replaceQueryParam(PagerData.START, null).replaceQueryParam(PagerData.COUNT, null);
    final String locatorWithStart = LocatorUtil.setDimension(locatorText, PagerData.START, start);
    String newLocator = count == null ? locatorWithStart : LocatorUtil.setDimension(locatorWithStart, PagerData.COUNT, count);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `LOG` initializer `Logger.getInstance(ExtensionHolderProviderFactory.class.getName())` is redundant
in `src/jetbrains/buildServer/server/rest/jersey/ExtensionHolderProviderFactory.java`
#### Snippet
```java
 */
public class ExtensionHolderProviderFactory implements IoCComponentProviderFactory {
  private Logger LOG = Logger.getInstance(ExtensionHolderProviderFactory.class.getName());

  private final ExtensionHolder myExtensionHolder;
```

### UnusedAssignment
Variable `LOG` initializer `Logger.getInstance(JerseyWebComponent.class.getName())` is redundant
in `src/jetbrains/buildServer/server/rest/jersey/JerseyWebComponent.java`
#### Snippet
```java
  private final String myPluginName;

  private Logger LOG = Logger.getInstance(JerseyWebComponent.class.getName());
  private final ExtensionHolder myExtensionHolder;
  /**
```

### UnusedAssignment
Variable `dependOn` initializer `null` is redundant
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitySnapshotDep.java`
#### Snippet
```java
      @Nullable
      public BuildType get() {
        @Nullable SBuildType dependOn = null;
        try {
          dependOn = dependency.getDependOn();
```

### UnusedAssignment
Variable `option` initializer `null` is redundant
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java
      try {
        if (Option.class.isAssignableFrom(declaredField.get(buildType).getClass())) {
          Option option = null;
          option = (Option)declaredField.get(buildType);
          if (option == null) {
```

### UnusedAssignment
Variable `templates` initializer `null` is redundant
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java
    Boolean defaultValue = locator == null ? null : locator.getSingleDimensionValueAsBoolean("defaults");

    List<? extends BuildTypeTemplate> templates = null;
    try {
      //todo: rework this to use only options methods of buildType and not traversing templates
```

### UnusedAssignment
Variable `newInterval` initializer `0` is redundant
in `src/jetbrains/buildServer/server/rest/model/change/VcsRoot.java`
#### Snippet
```java
        vcsRoot.restoreDefaultModificationCheckInterval();
      } else {
        int newInterval = 0;
        try {
          newInterval = Integer.parseInt(newValue);
```

### UnusedAssignment
Variable `dependOn` initializer `null` is redundant
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntityArtifactDep.java`
#### Snippet
```java
      @Nullable
      public BuildType get() {
        @Nullable SBuildType dependOn = null;
        try {
          dependOn = dependency.getSourceBuildType();
```

### UnusedAssignment
Variable `project` initializer `null` is redundant
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ProjectFinder.java`
#### Snippet
```java
    if (locator.isSingleValue()) {
      // no dimensions found, assume it's a name or internal id or external id
      SProject project = null;
      @SuppressWarnings("ConstantConditions") @NotNull final String singleValue = locator.getSingleValue();
      project = myProjectManager.findProjectByExternalId(singleValue);
```

### UnusedAssignment
Variable `locator` initializer `null` is redundant
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildFinder.java`
#### Snippet
```java
    }

    Locator locator = null;
    try {
      locator = locatorText != null ? new Locator(locatorText) : Locator.createEmptyLocator();
```

### UnusedAssignment
Variable `legacyTemplateFlag` initializer `null` is redundant
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java
      } catch (NotFoundException e) {
        //legacy support for boolean template
        Boolean legacyTemplateFlag = null;
        try {
          legacyTemplateFlag = locator.getSingleDimensionValueAsBoolean(TEMPLATE_DIMENSION_NAME);
```

### UnusedAssignment
Variable `agentTypeId` initializer `null` is redundant
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
  public static SAgentType getAgentType(@NotNull final String agentTypeLocator, @NotNull final AgentTypeFinder agentTypeFinder) {
    //support only int single value for now
    Integer agentTypeId = null;
    try {
      agentTypeId = Integer.valueOf(agentTypeLocator);
```

### UnusedAssignment
Variable `memoryHog` initializer `null` is redundant
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java

    final long startTime = System.currentTimeMillis();
    List<byte[]> memoryHog = null;
    if (memoryToAllocateBytes != null) {
      memoryHog = new ArrayList<>(memoryChunksCount);
```

### UnusedAssignment
Variable `buildsHref` initializer `null` is redundant
in `src/jetbrains/buildServer/server/rest/model/build/Branch.java`
#### Snippet
```java
      myFields.isIncluded("builds", false),
      () -> {
        String buildsHref = null;
        PagedSearchResult<BuildPromotion> builds = null;
        final Fields buildsFields = myFields.getNestedField("builds");
```

### UnusedAssignment
Variable `investigationWrapper` initializer `null` is redundant
in `src/jetbrains/buildServer/server/rest/request/InvestigationRequest.java`
#### Snippet
```java
  @ApiOperation(value="Create a new investigation.",nickname="addInvestigation")
  public Investigation createInstance(Investigation investigation, @QueryParam("fields") String fields) {
    InvestigationWrapper investigationWrapper = null;
    try {
      investigationWrapper = investigation.getFromPostedAndApply(myServiceLocator, false).get(0);
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `errorsCount > 0` is always `false`
in `src/jetbrains/buildServer/server/rest/data/ArchiveElement.java`
#### Snippet
```java
          }
        } finally {
          if (errorsCount > 0) {
            LOG.warn("Encountered " + errorsCount + " errors while processing " + detailsForLog.get());
          }
```

### ConstantValue
Condition `exception instanceof AccessDeniedException` is always `true`
in `src/jetbrains/buildServer/server/graphql/util/ResolverExceptionHandler.java`
#### Snippet
```java
    }

    if(exception instanceof AccessDeniedException) {
      GraphQLError error = builder.errorType(TeamCityGraphQLErrorType.ACCESS_DENIED).build();

```

### ConstantValue
Condition `!locatorText.isEmpty()` is always `false`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
      locatorText = "internalId:" + submittedParams.internalId;
    } else {
      if (submittedParams.id != null) locatorText += (!locatorText.isEmpty() ? "," : "") + "id:" + submittedParams.id;
    }
    if (locatorText.isEmpty()) {
```

### ConstantValue
Result of `locatorText.isEmpty()` is always 'true'
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
      locatorText = "internalId:" + submittedParams.internalId;
    } else {
      if (submittedParams.id != null) locatorText += (!locatorText.isEmpty() ? "," : "") + "id:" + submittedParams.id;
    }
    if (locatorText.isEmpty()) {
```

### ConstantValue
Value `tr` is always 'null'
in `src/jetbrains/buildServer/server/rest/data/problem/scope/TestScopesCollector.java`
#### Snippet
```java
                                                 .flatMap(tr -> {
                                                   if (tr instanceof MultiTestRun) return ((MultiTestRun)tr).getTestRuns().stream();
                                                   else return Stream.of(tr);
                                                 })
                                                 .collect(Collectors.groupingBy(splitter::remapPromotion));
```

### ConstantValue
Condition `build != null` is always `true`
in `src/jetbrains/buildServer/server/rest/model/build/PinInfo.java`
#### Snippet
```java

  public PinInfo(@NotNull SBuild build, final Fields fields, final BeanContext beanContext) {
    super(build != null && build.isPinned(), () -> Build.getPinComment(build), fields, beanContext);
  }
}
```

### ConstantValue
Condition `pagerData != null` is always `true`
in `src/jetbrains/buildServer/server/rest/model/health/HealthCategories.java`
#### Snippet
```java
    this.healthCategories = ValueWithDefault.decideDefault(fields.isIncluded(NAME, false, true),
                                                           () -> items.stream().map(i -> mapFunction(fields, i)).collect(Collectors.toList()));
    if (pagerData != null) {
      this.href = ValueWithDefault.decideDefault(fields.isIncluded("href", true), () -> generateHref(context, pagerData.getHref()));
      this.nextHref = ValueWithDefault
```

### ConstantValue
Condition `e instanceof DuplicateProjectNameException` is always `true`
in `src/jetbrains/buildServer/server/rest/errors/RuntimeExceptionMapper.java`
#### Snippet
```java
  public ResponseData getResponseData(@NotNull final RuntimeException e) {
    // process known errors
    if (e instanceof DuplicateProjectNameException ||
        e instanceof InvalidIdentifierException ||
        e instanceof DuplicateBuildTypeIdException ||
```

### ConstantValue
Condition `e instanceof DuplicateProjectNameException || e instanceof InvalidIdentifierException || ...` is always `true`
in `src/jetbrains/buildServer/server/rest/errors/RuntimeExceptionMapper.java`
#### Snippet
```java
  public ResponseData getResponseData(@NotNull final RuntimeException e) {
    // process known errors
    if (e instanceof DuplicateProjectNameException ||
        e instanceof InvalidIdentifierException ||
        e instanceof DuplicateBuildTypeIdException ||
        e instanceof DuplicateBuildTypeNameException ||
        e instanceof DuplicateExternalIdException ||
        e instanceof DuplicateIdException ||
        e instanceof DuplicateTemplateNameException ||
        e instanceof InvalidNameException) {
      return new ResponseData(Response.Status.BAD_REQUEST, "Error occurred while processing this request.");
    }
```

### ConstantValue
Condition `found.size() > 0` is always `true`
in `src/jetbrains/buildServer/server/rest/data/FinderSearchMatcher.java`
#### Snippet
```java
    }
    if (myMatch == null) {
      return found.size() > 0; // found anything when "match" is empty
    }

```

### ConstantValue
Value `name` is always 'null'
in `src/jetbrains/buildServer/server/rest/data/ParameterCondition.java`
#### Snippet
```java
    final String name = locator.isSingleValue() ? locator.getSingleValue() : locator.getSingleDimensionValue(NAME);
    if (name == null) {
      nameCondition = new ValueCondition(RequirementType.ANY, name, null);
    } else {
      try {
```

### ConstantValue
Condition `!systemActionFlag` is always `true`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AuditEventFinder.java`
#### Snippet
```java
            Boolean systemActionFlag = getIfSingle(dimensions.lookup(SYSTEM_ACTION)); //todo: should only show system actions to users with due permissions?
            if (systemActionFlag != null && !systemActionFlag) {
              builder.setUserAction(!systemActionFlag);
              dimensions.get(SYSTEM_ACTION); //marking as used
            }
```

### ConstantValue
Value `systemActionFlag` is always 'false'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AuditEventFinder.java`
#### Snippet
```java
            Boolean systemActionFlag = getIfSingle(dimensions.lookup(SYSTEM_ACTION)); //todo: should only show system actions to users with due permissions?
            if (systemActionFlag != null && !systemActionFlag) {
              builder.setUserAction(!systemActionFlag);
              dimensions.get(SYSTEM_ACTION); //marking as used
            }
```

### ConstantValue
Condition `experimental == null` is always `false`
in `src/jetbrains/buildServer/server/rest/model/metrics/Metrics.java`
#### Snippet
```java

    final Boolean experimental = fields.isIncluded("experimental", false, false);
    final List<MetricValue> metricValues = metricsReader.queryBuilder().withExperimental(experimental == null || experimental).build();
    
    metrics = ValueWithDefault.decideDefault(fields.isIncluded("metric", true, true), () -> {
```

### ConstantValue
Condition `agentPool == null` is always `false`
in `src/jetbrains/buildServer/server/rest/request/AgentRequest.java`
#### Snippet
```java
    final SBuildAgent agent = myAgentFinder.getItem(agentLocator);
    final jetbrains.buildServer.serverSide.agentPools.AgentPool agentPool = myAgentPoolFinder.getAgentPool(agent);
    return agentPool == null ? null : new AgentPool(agentPool, new Fields(fields), myBeanContext);
  }

```

### ConstantValue
Condition `!(myTestRun instanceof MultiTestRun)` is always `false`
in `src/jetbrains/buildServer/server/rest/model/problem/TestOccurrence.java`
#### Snippet
```java
  public TestOccurrences getInvocations() {
    return ValueWithDefault.decideDefault(myChecker.isIncluded("invocations", myFields), () -> {
      if (!(myTestRun instanceof MultiTestRun)) return null;
      MultiTestRun multiTestRun = (MultiTestRun) myTestRun;
      Fields nestedField = myFields.getNestedField("invocations");
```

### ConstantValue
Condition `exceptionOnFullSearch != null` is always `true`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
        } catch (LocatorProcessException locatorException) {
          throw new BadRequestException("Invalid sub-locator '" + BRANCH + "': Cannot" +
                                        (exceptionOnFullSearch != null ? " find branches: " + exceptionOnFullSearch.getMessage() +"; and cannot" : "") +
                                        " create filter: " + locatorException.getMessage(), locatorException);
        }
```

### ConstantValue
Value `agentDescription` is always 'null'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
      return (AgentType)agentDescription;
    }
    if (agentDescription instanceof BuildAgentEx) {
      return ((BuildAgentEx)agentDescription).getAgentType();
    }
```

### ConstantValue
Condition `defaultFiltering == null || defaultFiltering` is always `true`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
    }

    if ((defaultFiltering == null || defaultFiltering) && locator.isAnyPresent(COMPATIBLE)) {
      locator.setDimensionIfNotPresent(CONNECTED, "true");
      String compatible = locator.lookupSingleDimensionValue(COMPATIBLE);
```

### ConstantValue
Condition `defaultFiltering` is always `true` when reached
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
    }

    if ((defaultFiltering == null || defaultFiltering) && locator.isAnyPresent(COMPATIBLE)) {
      locator.setDimensionIfNotPresent(CONNECTED, "true");
      String compatible = locator.lookupSingleDimensionValue(COMPATIBLE);
```

### ConstantValue
Condition `pagerData != null` is always `true`
in `src/jetbrains/buildServer/server/rest/model/health/HealthItems.java`
#### Snippet
```java
    this.healthItems = ValueWithDefault.decideDefault(fields.isIncluded(HealthItem.NAME, false, true),
                                                      () -> items.stream().map(i -> mapFunction(fields, i)).collect(Collectors.toList()));
    if (pagerData != null) {
      this.href = ValueWithDefault.decideDefault(fields.isIncluded("href", true), () -> generateHref(context, pagerData.getHref()));
      this.nextHref = ValueWithDefault
```

### ConstantValue
Condition `!locatorText.isEmpty()` is always `false`
in `src/jetbrains/buildServer/server/rest/model/agent/Agent.java`
#### Snippet
```java
  public SBuildAgent getAgentFromPosted(@NotNull final AgentFinder agentFinder) {
    String locatorText = "";
    if (id != null) locatorText += (!locatorText.isEmpty() ? "," : "") + AgentFinder.DIMENSION_ID + ":" + id;
    if (locatorText.isEmpty()) {
      locatorText = locator;
```

### ConstantValue
Result of `locatorText.isEmpty()` is always 'true'
in `src/jetbrains/buildServer/server/rest/model/agent/Agent.java`
#### Snippet
```java
  public SBuildAgent getAgentFromPosted(@NotNull final AgentFinder agentFinder) {
    String locatorText = "";
    if (id != null) locatorText += (!locatorText.isEmpty() ? "," : "") + AgentFinder.DIMENSION_ID + ":" + id;
    if (locatorText.isEmpty()) {
      locatorText = locator;
```

### ConstantValue
Value `entry` is always 'null'
in `src/jetbrains/buildServer/server/rest/data/problem/TestOccurrenceFinder.java`
#### Snippet
```java
      for (STestRun entry : tests) {
        if (!(entry instanceof MultiTestRun)) {
          processor.processItem(entry);
        } else {
          for (STestRun nestedTestRun : getInvocations(entry)) {
```

### ConstantValue
Condition `!(item instanceof MultiTestRun)` is always `false`
in `src/jetbrains/buildServer/server/rest/data/problem/TestOccurrenceFinder.java`
#### Snippet
```java
  @NotNull
  private Collection<STestRun> getInvocations(@NotNull final STestRun item) {
    if (!(item instanceof MultiTestRun)) return Collections.singletonList(item);
    MultiTestRun compositeRun = (MultiTestRun)item;
    return compositeRun.getTestRuns();
```

### ConstantValue
Condition `!(item instanceof MultiTestRun)` is always `false`
in `src/jetbrains/buildServer/server/rest/data/problem/TestOccurrenceFinder.java`
#### Snippet
```java
            return processInvocationExpansion(item, locator.getSingleDimensionValueAsBoolean(EXPAND_INVOCATIONS));
          }
          if (!(item instanceof MultiTestRun)) return null;
          for (STestRun testRun : getInvocations(item)) {
            if ((long)testRun.getTestRunId() == idDimension) {
```

### ConstantValue
Condition `!(build instanceof RunningBuildEx)` is always `false` when reached
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
  private void logMessage(@NotNull final SBuild build, final String lines) {
//    build.getBuildLog().message(lines, Status.NORMAL, MessageAttrs.attrs());
    if (build.isFinished() || !(build instanceof RunningBuildEx)) {
      throw new NotFoundException("Build with id " + build.getBuildId() + " is already finished");
    }
```

### ConstantValue
Condition `!(build instanceof RunningBuildEx)` is always `false` when reached
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
      throw new NotFoundException("Build with id " + buildPromotion.getId() + " is not in the running or finished state");
    }
    if (build.isFinished() || !(build instanceof RunningBuildEx)) {
      throw new NotFoundException("Build with id " + buildPromotion.getId() + " is already finished");
    }
```

### ConstantValue
Condition `build != null && !(build instanceof DummyBuild)` is always `false`
in `src/jetbrains/buildServer/server/rest/data/change/ChangeUtil.java`
#### Snippet
```java
      BuildPromotion p = (BuildPromotion) data;
      SBuild build = p.getAssociatedBuild();
      if (build != null && !(build instanceof DummyBuild)) {
        return SnapshotDependencyLink.build(build, fields, context);
      }
```

### ConstantValue
Condition `!(build instanceof DummyBuild)` is always `false` when reached
in `src/jetbrains/buildServer/server/rest/data/change/ChangeUtil.java`
#### Snippet
```java
      BuildPromotion p = (BuildPromotion) data;
      SBuild build = p.getAssociatedBuild();
      if (build != null && !(build instanceof DummyBuild)) {
        return SnapshotDependencyLink.build(build, fields, context);
      }
```

### ConstantValue
Condition `pool == null || pool.isProjectPool() || pool instanceof ReadOnlyAgentPool` is always `true`
in `src/jetbrains/buildServer/server/graphql/resolver/agentPool/AgentPoolActionsAccessCheckerImpl.java`
#### Snippet
```java
  public boolean canManageProjectsInPool(int agentPoolId) {
    AgentPool pool = myAgentPoolManager.findAgentPoolById(agentPoolId);
    if(pool == null || pool.isProjectPool() || pool instanceof ReadOnlyAgentPool) {
      return false;
    }
```

### ConstantValue
Condition `!(build instanceof SFinishedBuild)` is always `false` when reached
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  @Nullable
  public static jetbrains.buildServer.serverSide.comments.Comment getPinComment(@Nullable final SBuild build) {
    if (build == null || !(build instanceof SFinishedBuild)) return null;
    SFinishedBuild finishedBuild = (SFinishedBuild)build;  //TeamCity API: getPinComment() is only available for finished build, while isPinned is available for running
    final jetbrains.buildServer.serverSide.comments.Comment pinComment = finishedBuild.getPinComment();
```

### ConstantValue
Condition `!(agent instanceof SBuildAgent)` is always `false`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java

    BuildAgent agent = estimates.getAgent();
    if(agent == null || !(agent instanceof SBuildAgent) || (agent instanceof BuildAgentEx && ((BuildAgentEx) agent).isFakeAgent())) {
      return null;
    }
```

## RuleId[id=Contract]
### Contract
Return value should be one of: null, !null, true, false, this, new, paramN, fail, _. Found: null,!null-\>!null
in `src/jetbrains/buildServer/server/rest/util/StringPool.java`
#### Snippet
```java
   * @return
   */
  @Contract("null -> null, !null -> !null")
  public String reuse(@Nullable String value);
}
```

### Contract
Return value should be one of: null, !null, true, false, this, new, paramN, fail, _. Found: null,!null-\>!null
in `src/jetbrains/buildServer/server/rest/util/SimpleStringPool.java`
#### Snippet
```java
  private final HashMap<String, String> myStringPool = new HashMap<>();

  @Contract("null -> null, !null -> !null")
  public String reuse(@Nullable String value) {
    if (value == null) {
```

### Contract
Method takes 2 parameters, while contract clause '!null -\> !null' expects 1
in `src/jetbrains/buildServer/server/rest/data/ParameterCondition.java`
#### Snippet
```java

  @Nullable
  @Contract("!null -> !null; null -> null")
  private static ValueCondition createValueCondition(@Nullable final String propertyConditionLocator, boolean surroundingBracesHaveSpecialMeaning) {
    if (propertyConditionLocator == null) {
```

### Contract
Contract clause 'null -\> false' is never satisfied as its conditions are covered by previous contracts
in `src/jetbrains/buildServer/server/rest/data/util/FilterUtil.java`
#### Snippet
```java
  }

  @Contract("true -> true; null -> false; false -> false")
  public static boolean isTrue(@Nullable final Boolean value) {
    return value != null && value;
```

### Contract
Contract clause 'null -\> true' is never satisfied as its conditions are covered by previous contracts
in `src/jetbrains/buildServer/server/rest/data/util/FilterUtil.java`
#### Snippet
```java
  }

  @Contract("true -> true; null -> true; false -> false")
  public static boolean isIncludingBooleanFilter(@Nullable final Boolean value) {
    return value == null || value;
```

## RuleId[id=ReplaceInefficientStreamCount]
### ReplaceInefficientStreamCount
Can be replaced with '!stream.findAny().isPresent()'
in `src/jetbrains/buildServer/server/graphql/resolver/agentPool/AgentPoolActionsAccessCheckerImpl.java`
#### Snippet
```java
    AuthorityHolder authHolder = mySecurityContext.getAuthorityHolder();

    return getRestrictingProjectsInPoolUnsafe(authHolder, agentPoolId).count() == 0;
  }

```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `FeatureToggle` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/rest/util/FeatureToggle.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public class FeatureToggle {
  @NotNull
  private static final Logger LOGGER = Logger.getInstance(FeatureToggle.class);
```

### UtilityClassWithoutPrivateConstructor
Class `StreamUtil` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/rest/util/StreamUtil.java`
#### Snippet
```java
 * Date: 20/10/2017
 */
public class StreamUtil {
  public static <T> void forEachNullableFlattened(@Nullable List<List<T>> items, @NotNull final Consumer<? super T> action) {
    if (items != null) {
```

### UtilityClassWithoutPrivateConstructor
Class `ValueWithDefault` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/rest/util/ValueWithDefault.java`
#### Snippet
```java
 * Date: 10.01.14
 */
public class ValueWithDefault {
  final static Logger LOG = Logger.getInstance(ValueWithDefault.class.getName());

```

### UtilityClassWithoutPrivateConstructor
Class `SwaggerUIUtil` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/rest/SwaggerUIUtil.java`
#### Snippet
```java
import java.net.URL;

public class SwaggerUIUtil {

  public static final String INDEX = "index.html";
```

### UtilityClassWithoutPrivateConstructor
Class `PagerDimensions` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/rest/data/PagerDimensions.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public final class PagerDimensions {
  @NotNull
  private static final TypedFinderBuilder.Dimension<Long> COUNT = new TypedFinderBuilder.Dimension<>(count());
```

### UtilityClassWithoutPrivateConstructor
Class `BuildTypeUtil` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java
 *         Date: 04.01.12
 */
public class BuildTypeUtil {
  private static final Logger LOG = Logger.getInstance(BuildTypeUtil.class.getName());
  protected static final String BUILD_NUMBER_COUNTER = "buildNumberCounter";
```

### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/rest/model/Constants.java`
#### Snippet
```java
 *         Date: 17.11.2009
 */
public class Constants {
  public static final String TIME_FORMAT = "yyyyMMdd'T'HHmmssZ";
}
```

### UtilityClassWithoutPrivateConstructor
Class `SwaggerUtil` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/rest/swagger/SwaggerUtil.java`
#### Snippet
```java
import java.util.*;

public class SwaggerUtil {
  private static final Logger LOG = Logger.getInstance(SwaggerUtil.class.getName());

```

### UtilityClassWithoutPrivateConstructor
Class `LocatorDimensionDataType` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/rest/swagger/constants/LocatorDimensionDataType.java`
#### Snippet
```java
package jetbrains.buildServer.server.rest.swagger.constants;

public class LocatorDimensionDataType {
  public static final String STRING = "string";
  public static final String BOOLEAN = "boolean";
```

### UtilityClassWithoutPrivateConstructor
Class `SplitBuildsFeatureUtil` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/rest/util/SplitBuildsFeatureUtil.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class SplitBuildsFeatureUtil {
  public static boolean isVirtualBuild(@NotNull BuildPromotion build) {
    SBuildType bt = build.getBuildType();
```

### UtilityClassWithoutPrivateConstructor
Class `LocatorUtil` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/rest/data/util/LocatorUtil.java`
#### Snippet
```java
import static jetbrains.buildServer.server.rest.data.Locator.DIMENSION_NAME_VALUE_DELIMITER;

public class LocatorUtil {
  public static boolean exactlyOneIsPresentAndUnused(@NotNull Locator locator, @NotNull String ...dimensions) {
    if(dimensions.length == 0) {
```

### UtilityClassWithoutPrivateConstructor
Class `ExtensionType` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/rest/swagger/constants/ExtensionType.java`
#### Snippet
```java
import java.util.Map;

public class ExtensionType {
  // reference to an abstract class which may be present in client implementation (to streamline code generation)
  public static final String X_BASE_TYPE = "x-object-type";
```

### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/rest/request/Constants.java`
#### Snippet
```java
 *         Date: 04.08.2009
 */
public class Constants {
  public static final int DEFAULT_PAGE_ITEMS_COUNT = 100;
  public static final int CACHE_CONTROL_NEVER_EXPIRES = 31536000;
```

### UtilityClassWithoutPrivateConstructor
Class `BuildsFilterProcessor` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/rest/data/build/BuildsFilterProcessor.java`
#### Snippet
```java
 *         Date: 14.01.13
 */
public class BuildsFilterProcessor {
  final static Logger LOG = Logger.getInstance(BuildsFilterProcessor.class.getName());

```

### UtilityClassWithoutPrivateConstructor
Class `CommonLocatorDimensionsList` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/rest/swagger/constants/CommonLocatorDimensionsList.java`
#### Snippet
```java
import java.util.Map;

public class CommonLocatorDimensionsList {
  public static final String PROPERTY = "property";
  public static final String CURRENT = "current";
```

### UtilityClassWithoutPrivateConstructor
Class `ObjectType` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/rest/swagger/constants/ObjectType.java`
#### Snippet
```java
package jetbrains.buildServer.server.rest.swagger.constants;

public class ObjectType {
  public static final String LIST = "ListEntity";
  public static final String PAGINATED = "PaginatedEntity";
```

### UtilityClassWithoutPrivateConstructor
Class `LocatorName` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/rest/swagger/constants/LocatorName.java`
#### Snippet
```java
package jetbrains.buildServer.server.rest.swagger.constants;

public class LocatorName {
  public static final String AGENT = "AgentLocator";
  public static final String AGENT_POOL = "AgentPoolLocator";
```

### UtilityClassWithoutPrivateConstructor
Class `Util` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/rest/model/Util.java`
#### Snippet
```java
 * @since 17.11.2009
 */
public class Util {
  @Nullable
  public static String formatTime(@Nullable final Date time) {
```

### UtilityClassWithoutPrivateConstructor
Class `ChangeUtil` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/rest/data/change/ChangeUtil.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class ChangeUtil {
  public static List<CommiterData> getUniqueCommiters(@NotNull Stream<SVcsModification> modifications) {
    Set<String> seenUsernames = new HashSet<>();
```

### UtilityClassWithoutPrivateConstructor
Class `ParentsFetcher` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/graphql/util/ParentsFetcher.java`
#### Snippet
```java


public class ParentsFetcher {
  @NotNull
  public static List<SProject> getAncestors(@Nullable SProject self) {
```

### UtilityClassWithoutPrivateConstructor
Class `Context` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/graphql/util/Context.java`
#### Snippet
```java
package jetbrains.buildServer.server.graphql.util;

public class Context {
  public static final String CURRENT_USER = "$currentUser";
}
```

### UtilityClassWithoutPrivateConstructor
Class `FilterUtil` has only 'static' members, and lacks a 'private' constructor
in `src/jetbrains/buildServer/server/rest/data/util/FilterUtil.java`
#### Snippet
```java
 *         Date: 10.04.13
 */
public class FilterUtil {
  public static boolean isIncludedByBooleanFilter(@Nullable final Boolean filterValue, @Nullable final Boolean actualValue) {
    return filterValue == null || actualValue == null || (!(filterValue ^ actualValue));
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTriggerCustomization.java`
#### Snippet
```java
      }
    };
  };

  @Override
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/jetbrains/buildServer/server/graphql/model/connections/PaginationArguments.java`
#### Snippet
```java

  public enum Direction {
    FORWARD, BACKWARD;
  }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ProjectFinder.java`
#### Snippet
```java
    SELECTED_WITH_ORDER, //experimental! those which are selected on Overview, in hierarchy-defined order and selected order for siblings within hierarchy
    SELECTED_AND_UNKNOWN, //as in SELECTED plus those which has mo mark on selection or hiding, in Overview-configured order
    ALL_WITH_ORDER; //all the projects which user can see in the order defined on Overview, but abiding the hierarchy depth-first traversing (i.e. as should be shown in projects pop-up)
  }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/jetbrains/buildServer/server/rest/model/Util.java`
#### Snippet
```java
    final StringBuilder result = new StringBuilder();
    for (String pathPart : pathParts) {
      if (pathPart == null) continue;;
      if (result.length() > 0 && '/' == result.charAt(result.length() - 1)) {
        result.append(StringUtil.removeLeadingSlash(pathPart));
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesArtifactDep.java`
#### Snippet
```java
          result.add(new PropEntityArtifactDep(dependency, buildType, fields.getNestedField("artifact-dependency", Fields.NONE, Fields.LONG), context));
        }
        ;
        return result;
      }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
@Nullable method 'get' always returns a non-null value
in `src/jetbrains/buildServer/server/rest/model/files/File.java`
#### Snippet
```java
  public File getParent() {
    return parent == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("parent", false), new ValueWithDefault.Value<File>() {
      @Nullable
      public File get() {
        return new File(parent, null, fileApiUrlBuilder, myFields.getNestedField("parent",Fields.SHORT, Fields.SHORT), myBeanContext);
```

### DataFlowIssue
Argument `fileApiUrlBuilder` might be null
in `src/jetbrains/buildServer/server/rest/model/files/File.java`
#### Snippet
```java
      @Nullable
      public File get() {
        return new File(parent, null, fileApiUrlBuilder, myFields.getNestedField("parent",Fields.SHORT, Fields.SHORT), myBeanContext);
      }
    });
```

### DataFlowIssue
@Nullable method 'get' always returns a non-null value
in `src/jetbrains/buildServer/server/rest/model/files/File.java`
#### Snippet
```java
    }
    return ValueWithDefault.decideDefaultIgnoringAccessDenied(myFields.isIncluded("children", false), new ValueWithDefault.Value<Files>() {
      @Nullable
      public Files get() {
        final Fields nestedFields = myFields.getNestedField("children");
```

### DataFlowIssue
Method invocation `getUrlPathPrefix` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/rest/model/files/File.java`
#### Snippet
```java
      public Files get() {
        final Fields nestedFields = myFields.getNestedField("children");
        final FileApiUrlBuilder builder = FilesSubResource.fileApiUrlBuilder(nestedFields.getLocator(), fileApiUrlBuilder.getUrlPathPrefix());
        return new Files(builder.getChildrenHref(element), new Files.DefaultFilesProvider(builder, myBeanContext) {
          @NotNull
```

### DataFlowIssue
Method invocation `lastIndexOf` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/rest/model/debug/Sessions.java`
#### Snippet
```java
      throw new Exception("No '" + SESSION_USER_KEY_ATTRIBUTE_NAME + "' session attribute found"); //todo: support custom user key, see SessionUser.getUser()
    }
    final int index = userKeyAttribute.lastIndexOf("{id=");
    if (!userKeyAttribute.endsWith("}") || index < 0) {
      throw new Exception("Unparsable attribute value '" + userKeyAttribute + "'");
```

### DataFlowIssue
@Nullable method 'get' always returns a non-null value
in `src/jetbrains/buildServer/server/rest/model/debug/Sessions.java`
#### Snippet
```java

    sessions = ValueWithDefault.decideDefault(fields.isIncluded("session", true), new ValueWithDefault.Value<Collection<Session>>() {
      @Nullable
      @Override
      public Collection<Session> get() {
```

### DataFlowIssue
@Nullable method 'get' always returns a non-null value
in `src/jetbrains/buildServer/server/rest/model/issue/IssueUsages.java`
#### Snippet
```java
  public Integer getCount() {
    return ValueWithDefault.decideDefault(myFields.isIncluded("count", false), new ValueWithDefault.Value<Integer>() {
      @Nullable
      public Integer get() {
        return getRelatedIssues().size();
```

### DataFlowIssue
@Nullable method 'get' always returns a non-null value
in `src/jetbrains/buildServer/server/rest/model/issue/IssueUsages.java`
#### Snippet
```java
  public List<IssueUsage> getIssueUsages() {
    return ValueWithDefault.decideDefault(myFields.isIncluded("issueUsage", false), new ValueWithDefault.Value<List<IssueUsage>>() {
             @Nullable
             public List<IssueUsage> get() {
               Collection<Issue> issues = getRelatedIssues();
```

### DataFlowIssue
Argument `buildLocator` might be null
in `src/jetbrains/buildServer/server/rest/model/build/downloadedArtifacts/DownloadedArtifacts.java`
#### Snippet
```java
    if(StringUtil.isNotEmpty(buildLocatorText)) {
      Locator buildLocator = Locator.locator(buildLocatorText);
      buildFilter = myBeanContext.getSingletonService(BuildPromotionFinder.class).getFilter(buildLocator);
      buildLocator.checkLocatorFullyProcessed();
    } else {
```

### DataFlowIssue
Unboxing of `counters.getNewFailed()` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/rest/model/change/ChangeStatus.java`
#### Snippet
```java
    TestCountersData counters = new TestCountersData(testRuns, false, true, false, false, true, false);

    myNewFailedTests   = counters.getNewFailed();
    myOtherFailedTests = counters.getFailed() - counters.getNewFailed();
  }
```

### DataFlowIssue
Unboxing of `counters.getFailed()` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/rest/model/change/ChangeStatus.java`
#### Snippet
```java

    myNewFailedTests   = counters.getNewFailed();
    myOtherFailedTests = counters.getFailed() - counters.getNewFailed();
  }

```

### DataFlowIssue
`null` is returned by the method declared as @NotNull
in `src/jetbrains/buildServer/server/graphql/resolver/Query.java`
#### Snippet
```java

    // TODO: implement me
    return null;
  }

```

### DataFlowIssue
Argument `myBuildType` might be null
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  @NotNull
  private CloudImages findCompatibleCloudImages(Fields fields) {
    PagedSearchResult<CloudImage> items = myBeanContext.getSingletonService(CloudImageFinder.class).getItems(CloudImageFinder.getCompatibleBuildTypeLocator(myBuildType));
    return new CloudImages(CachingValue.simple(items.getEntries()), null, fields, myBeanContext);
  }
```

### DataFlowIssue
Argument `submittedParams.name` might be null
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
    }

    final BuildTypeOrTemplate resultingBuildType = createEmptyBuildTypeOrTemplate(serviceLocator, project, submittedParams.name);

    try {
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/rest/model/change/Changes.java`
#### Snippet
```java
    if (myModifications != null) {
      myChanges = ValueWithDefault.decideDefault(myFields.isIncluded(CHANGE, myModifications.isCached(), false, null),
                                                 () -> myModifications.get().stream().map(root -> new Change(root, myFields.getNestedField(CHANGE), myBeanContext))
                                                                 .collect(Collectors.toList()));

```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/rest/model/change/Changes.java`
#### Snippet
```java
      //for performance reasons: include count only when changes are to be calculated
      myCount = ValueWithDefault.decideIncludeByDefault(myFields.isIncluded(COUNT, myModifications.isCached(), myModifications.isCached(), myModifications.isCached()),
                                                     () -> myModifications.get().size());
    }
  }
```

### DataFlowIssue
Argument `testScope.getPackage()` might be null
in `src/jetbrains/buildServer/server/rest/data/problem/scope/TestScopesCollector.java`
#### Snippet
```java
    return packages.flatMap(testScope -> {
      Map<String, List<STestRun>> byClass = testScope.getTestRuns().stream().collect(Collectors.groupingBy(item -> item.getTest().getName().getClassName()));
      return byClass.entrySet().stream().map(classPair -> new TestScope(classPair.getValue(), testScope.getSuite(), testScope.getPackage(), classPair.getKey()));
    });
  }
```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/rest/data/problem/scope/ProblemOccurrencesTreeCollector.java`
#### Snippet
```java
  private static final Comparator<BuildProblem> NEW_FAILED_FIRST_THEN_BY_ID = (bp1, bp2) -> {
    if(!(bp1 instanceof BuildProblemImpl) || !(bp2 instanceof BuildProblemImpl)) {
      return Integer.compare(bp1.getId(), bp2.getId());
    }

```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/rest/data/problem/scope/ProblemOccurrencesTreeCollector.java`
#### Snippet
```java
  private static final Comparator<BuildProblem> NEW_FAILED_FIRST_THEN_BY_ID = (bp1, bp2) -> {
    if(!(bp1 instanceof BuildProblemImpl) || !(bp2 instanceof BuildProblemImpl)) {
      return Integer.compare(bp1.getId(), bp2.getId());
    }

```

### DataFlowIssue
@Nullable method 'get' always returns a non-null value
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitySnapshotDep.java`
#### Snippet
```java

    sourceBuildType = ValueWithDefault.decideDefault(fields.isIncluded(PropEntitySnapshotDep.SOURCE_BUILD_TYPE, false, true), new ValueWithDefault.Value<BuildType>() {
      @Nullable
      public BuildType get() {
        @Nullable SBuildType dependOn = null;
```

### DataFlowIssue
Argument `parameterName` might be null
in `src/jetbrains/buildServer/server/rest/model/Property.java`
#### Snippet
```java
      throw new BadRequestException("Parameter name cannot be empty.");
    }
    final Parameter parameter = entity.getParameter(parameterName);
    if (parameter == null) {
      throw new NotFoundException("No parameter with name '" + parameterName + "' is found.");
```

### DataFlowIssue
Argument `parameterName` might be null
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java
    if (parameters.containsKey(parameterName)) { // this processes stored "null" values duly, but this might not be necessary...
      String value = parameters.get(parameterName);
      if (!checkSecure || !Property.isPropertyToExclude(parameterName, value, serviceLocator) || Property.includeSecureProperties(serviceLocator)) {
        return value;
      } else {
```

### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java
                          @NotNull final String entityName,
                          @NotNull final String fieldPrefix) {
      result.append(compareObjects("cleanupOption", oA.getType(), oB.getType(), fieldPrefix + "type"));
      result.append(compareObjects("cleanupOption", oA.getCleanupLevel(), oB.getCleanupLevel(), fieldPrefix + "level"));
      result.append(compareObjects("cleanupOption", oA.getParameters(), oB.getParameters(), fieldPrefix + "parameters"));
```

### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java
                          @NotNull final String entityName,
                          @NotNull final String fieldPrefix) {
      result.append(compareObjects("cleanupOption", oA.getType(), oB.getType(), fieldPrefix + "type"));
      result.append(compareObjects("cleanupOption", oA.getCleanupLevel(), oB.getCleanupLevel(), fieldPrefix + "level"));
      result.append(compareObjects("cleanupOption", oA.getParameters(), oB.getParameters(), fieldPrefix + "parameters"));
```

### DataFlowIssue
Argument `parameterName` might be null
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java
      throw new BadRequestException(nameItProperty ? "Property" : "Parameter" + " name cannot be empty.");
    }
    Parameter parameter = parametrizedEntity.getParameter(parameterName);
    if (parameter == null) {
      throw new NotFoundException((nameItProperty ? "No property" : "No parameter") + " with name '" + parameterName + "' is found.");
```

### DataFlowIssue
Argument `parameterName` might be null
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java
    final String value = parameters.get(parameterName);
    if (value != null) {
      if (!checkSecure || !Property.isPropertyToExclude(parameterName, value, serviceLocator) || Property.includeSecureProperties(serviceLocator)) {
        return value;
      } else {
```

### DataFlowIssue
Argument `parameterName` might be null
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java
    }

    Parameter parameter = parametrizedEntity.getParameter(parameterName);
    if (parameter != null) {
      final ControlDescription typeSpec = parameter.getControlDescription();
```

### DataFlowIssue
Variable is already assigned to this value
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java

          if (DIMENSION_COMPLEX_VALUE_START_DELIMITER.equals(nextDelimeter)) {
            parsedIndex = nameEnd;
          }

```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
                                     final boolean extendedMode) {
    if ((supportedDimensions == null || !Arrays.asList(supportedDimensions).contains(name)) && !hiddenSupportedDimensions.contains(name)) {
      for (int i = 0; i < name.length(); i++) {
        if (!Character.isLetter(name.charAt(i)) && !Character.isDigit(name.charAt(i)) && !(name.charAt(i) == '-' && extendedMode)) return false;
      }
```

### DataFlowIssue
Argument `locator` might be null
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
    mySupportedDimensions = supportedDimensions;
    myUsedDimensions = new HashSet<>(mySupportedDimensions == null ? 10 : Math.max(mySupportedDimensions.length, 10));
    String escapedValue = getUnescapedSingleValue(locator, myMetadata);

    if (escapedValue != null) {
```

### DataFlowIssue
Argument `newValue` might be null
in `src/jetbrains/buildServer/server/rest/model/change/VcsRoot.java`
#### Snippet
```java
        int newInterval = 0;
        try {
          newInterval = Integer.parseInt(newValue);
        } catch (Exception e) {
          throw new BadRequestException(
```

### DataFlowIssue
@Nullable method 'get' always returns a non-null value
in `src/jetbrains/buildServer/server/rest/model/build/Tag.java`
#### Snippet
```java
    this.privateTag = ValueWithDefault.decideDefault(fields.isIncluded("private"), owner != null);
    this.owner = owner == null ? null : ValueWithDefault.decideDefault(fields.isIncluded("owner", false, true), new ValueWithDefault.Value<User>() {
      @Nullable
      public User get() {
        return new User(owner, fields.getNestedField("owner"), beanContext);
```

### DataFlowIssue
Unboxing of `t.isInherited()` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/rest/util/BuildTypeOrTemplate.java`
#### Snippet
```java

  public static void setTemplates(@NotNull final SBuildType buildType, @NotNull final List<BuildTypeOrTemplate> buildTypeOrTemplates, final boolean optimizeSetting) {
    List<BuildTypeTemplate> newTemplates = buildTypeOrTemplates.stream().filter(t -> t.isInherited() == null || !t.isInherited()).map(bt -> {
      BuildTypeTemplate result = bt.getTemplate();
      if (result == null) {
```

### DataFlowIssue
`null` is assigned to a variable that is annotated with @NotNull
in `src/jetbrains/buildServer/server/rest/util/BuildTypeOrTemplate.java`
#### Snippet
```java
    myBuildType = null;
    myTemplate = null;
    myBuildTypeIdentity = null;
  }

```

### DataFlowIssue
@Nullable method 'get' always returns a non-null value
in `src/jetbrains/buildServer/server/rest/model/problem/ProblemOccurrences.java`
#### Snippet
```java
    if (itemsP != null) {
      items = ValueWithDefault.decideDefault(fields.isIncluded("problemOccurrence", false), new ValueWithDefault.Value<List<ProblemOccurrence>>() {
        @Nullable
        public List<ProblemOccurrence> get() {
          final ArrayList<ProblemOccurrence> result = new ArrayList<ProblemOccurrence>(itemsP.size());
```

### DataFlowIssue
Method invocation `getBuildProblemInfo` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/rest/data/investigations/InvestigationFinder.java`
#### Snippet
```java
    }
    @SuppressWarnings("ConstantConditions") @NotNull final BuildProblemResponsibilityEntry problemRE = item.getProblemRE();
    return problemRE.getBuildProblemInfo().getId() == problem.getId();
  }

```

### DataFlowIssue
Method invocation `getInternalId` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/graphql/resolver/AgentBuildTypeEdgeResolver.java`
#### Snippet
```java
    SBuildType bt = myBuildTypeFinder.getItem("id:" + edge.getNode().getRawId()).getBuildType();

    return AgentFinder.getAssignedBuildTypes(realAgent).contains(bt.getInternalId());
  }

```

### DataFlowIssue
Method invocation `getApprovalRules` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/rest/model/build/approval/ApprovalInfo.java`
#### Snippet
```java
      try {
        List<ApprovalRule> groupRules = myConfiguration
          .getApprovalRules() // asserted by myApprovalFeatureEnabled
          .stream()
          .filter(rule -> rule instanceof GroupApprovalRule)
```

### DataFlowIssue
Method invocation `getApprovalRules` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/rest/model/build/approval/ApprovalInfo.java`
#### Snippet
```java
      try {
        List<ApprovalRule> userRules = myConfiguration
          .getApprovalRules() // asserted by myApprovalFeatureEnabled
          .stream()
          .filter(rule -> rule instanceof UserApprovalRule)
```

### DataFlowIssue
@Nullable method 'get' always returns a non-null value
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntityArtifactDep.java`
#### Snippet
```java

    sourceBuildType = ValueWithDefault.decideDefault(fields.isIncluded(PropEntitySnapshotDep.SOURCE_BUILD_TYPE, false, true), new ValueWithDefault.Value<BuildType>() {
      @Nullable
      public BuildType get() {
        @Nullable SBuildType dependOn = null;
```

### DataFlowIssue
Argument `delimiter` might be null
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java
        myCachedValue = currentValue;
        myCachedDelimiter = delimiter;
        myParsedValues = currentValue.split(StringUtil.isEmpty(delimiter) ? "," : delimiter);
        for (int i = 0; i < myParsedValues.length; i++) {
          myParsedValues[i] = myParsedValues[i].trim();
```

### DataFlowIssue
@Nullable method 'getBuildTypeIds' always returns a non-null value
in `src/jetbrains/buildServer/server/rest/data/finder/impl/MuteFinder.java`
#### Snippet
```java

        @Override
        @Nullable
        public Collection<String> getBuildTypeIds() {
          return myBuildTypeIds;
```

### DataFlowIssue
Argument `singleValue` might be null
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ProjectFinder.java`
#### Snippet
```java
        return project;
      }
      final List<SProject> projectsByName = findProjectsByName(null, singleValue, true);
      if (projectsByName.size() == 1) {
        return projectsByName.get(0);
```

### DataFlowIssue
Method invocation `forEach` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/HealthItemFinder.java`
#### Snippet
```java
        if (!CollectionUtils.isEmpty(reportTypes)) {
          final HealthStatusProfileBuilder builder = new HealthStatusProfileBuilder();
          reportTypes.forEach(builder::addReportType);
          profile = builder.build();
        } else {
```

### DataFlowIssue
Argument `myUserFinder.getCurrentUser()` might be null
in `src/jetbrains/buildServer/server/rest/request/TwoFactorRequest.java`
#### Snippet
```java
    }
    try {
      myKeysUpdater.confirmCredentials(myUserFinder.getCurrentUser(), UUID.fromString(uuid), password);
      TwoFactorAuthUtil.setTwoFactorCompletion(request);  // TODO: attempt to prevent instant kick after enabled 2FA without context request
    } catch (TwoFactorConfirmationException e) {
```

### DataFlowIssue
Argument `user` might be null
in `src/jetbrains/buildServer/server/rest/request/TwoFactorRequest.java`
#### Snippet
```java
  public TwoFactorRecoveryKeys serveRecoveryKeys() {
    final SUser user = myUserFinder.getCurrentUser();
    if (!myKeysUpdater.hasEnabled2FA(user)) {
      throw new AccessDeniedException(user, "You need to set up 2FA to generate recovery keys");
    }
```

### DataFlowIssue
Argument `user` might be null
in `src/jetbrains/buildServer/server/rest/request/TwoFactorRequest.java`
#### Snippet
```java
  public TwoFactorCredentials setupTwoFactor() {
    final SUser user = myUserFinder.getCurrentUser();
    if (myKeysUpdater.hasEnabled2FA(user)) {
      throw new AccessDeniedException(user, "You already have enabled 2FA");
    }
```

### DataFlowIssue
Argument `newValue` might be null
in `src/jetbrains/buildServer/server/rest/model/agent/AgentPool.java`
#### Snippet
```java
        maxAgents = AgentPoolLimits.DEFAULT.getMaxAgents();
      } else {
        maxAgents = Integer.valueOf(newValue);
      }
      modificationsFound = true;
```

### DataFlowIssue
Argument `internalId` might be null
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java
        }
      }
      BuildTypeOrTemplate buildType = findBuildTypeOrTemplateByInternalId(internalId, template);
      if (buildType != null) {
        return buildType;
```

### DataFlowIssue
Argument `uuid` might be null
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java
    if (!StringUtil.isEmpty(uuid)) {
      Boolean template = locator.getSingleDimensionValueAsBoolean(TEMPLATE_FLAG_DIMENSION_NAME);
      BuildTypeOrTemplate buildType = findBuildTypeOrTemplateByUuid(uuid, template);
      if (buildType != null) {
        return buildType;
```

### DataFlowIssue
Argument `id` might be null
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java
        }
      }
      BuildTypeOrTemplate buildType = findBuildTypeOrTemplateByExternalId(id, template);
      if (buildType != null) {
        return buildType;
```

### DataFlowIssue
Argument `requestorText` might be null
in `src/jetbrains/buildServer/server/rest/request/VcsRootInstanceRequest.java`
#### Snippet
```java
    //TeamCity API: ideally, should be possible to pass custom value as requestor to allow debugging the origin of the request
    if (StringUtil.isEmpty(requestorText)) return OperationRequestor.USER;
    return TypedFinderBuilder.getEnumValue(requestorText, OperationRequestor.class);
  }

```

### DataFlowIssue
Result of 'min' is the same as the second argument making the call meaningless
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
    if (count != null && count <= result) return count;
    if (!recursive) {
      return count != null ? Math.min(count, result) : result;
    }
    return null;
```

### DataFlowIssue
Argument `text` might be null
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
      if (StringUtil.isEmpty(text)) return null;
      try {
        return Long.parseLong(text);
      } catch (NumberFormatException e) {
        return null;
```

### DataFlowIssue
Argument `locator.getSingleValueAsLong()` might be null
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
    if (locator.isSingleValue()) {
      try {
        long foundPromotionId = getBuildPromotionByIdOrByBuildId(locator.getSingleValueAsLong()).getId();
        result.add(item -> foundPromotionId == item.getId());
      } catch (NotFoundException e) {
```

### DataFlowIssue
Method invocation `getClass` will produce `NullPointerException`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
      return ((BuildAgentEx)agentDescription).getAgentType();
    }
    throw new OperationException("Unsupported agent details of type: " + agentDescription.getClass());
  }

```

### DataFlowIssue
Expression `submittedComment` might evaluate to null but is returned by the method declared as @NotNull
in `src/jetbrains/buildServer/server/rest/model/agent/Agent.java`
#### Snippet
```java
  @NotNull
  public static String getActualActionComment(final @Nullable String submittedComment) {
    return StringUtil.isEmpty(submittedComment) ? TeamCityProperties.getProperty("rest.defaultActionComment") : submittedComment;
  }

```

### DataFlowIssue
Argument `basePath` might be null
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java

    final String normalizedName = removeLeadingDelimeters(name);
    if (!normalizedName.startsWith(removeLeadingDelimeters(basePath))) {
      return name;
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
          childrenNestingLevel = -1;
        } else {
          childrenNestingLevel = 1;
        }
      } else {
```

### DataFlowIssue
Variable is already assigned to this value
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
          archiveChildrenNestingLevel = 1;
        } else {
          archiveChildrenNestingLevel = 0;
        }
      } else {
```

### DataFlowIssue
@Nullable method 'get' always returns a non-null value
in `src/jetbrains/buildServer/server/rest/model/buildType/VcsRootEntries.java`
#### Snippet
```java
    final List<jetbrains.buildServer.vcs.VcsRootEntry> vcsRootEntries = buildType.get().getVcsRootEntries();
    vcsRootAssignments = ValueWithDefault.decideDefault(fields.isIncluded("vcs-root-entry", true, true), new ValueWithDefault.Value<List<VcsRootEntry>>() {
      @Nullable
      public List<VcsRootEntry> get() {
        ArrayList<VcsRootEntry> items = new ArrayList<VcsRootEntry>(vcsRootEntries.size());
```

### DataFlowIssue
Method invocation `toUpperCase` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
    //TeamCity API: ideally, should be possible to pass custom value as requestor to allow debugging the origin of the request
    if (StringUtil.isEmpty(requestorText)) return OperationRequestor.COMMIT_HOOK; //todo: seems like should be unknown or user by default
    return OperationRequestor.valueOf(requestorText.toUpperCase());
  }

```

### DataFlowIssue
`null` is returned by the method declared as @NotNull
in `src/jetbrains/buildServer/server/rest/data/problem/TestOccurrenceFinder.java`
#### Snippet
```java
    } catch (Exception e) {
      ExceptionUtil.rethrowAsRuntimeException(e);
      return null;
    }
  }
```

### DataFlowIssue
Argument `currentUser` might be null
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
      stoppedBuilds.forEach(build -> {
        try {
          restoreInQueue(build, currentUser);
        } catch (RuntimeException e) {
          errors.putIfAbsent(build.getBuildPromotion().getId(), e);
```

### DataFlowIssue
@Nullable method 'getParameter' always returns a non-null value
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
      }

      @Nullable
      @Override
      public Parameter getParameter(@NotNull final String paramName) {
```

### DataFlowIssue
Expression `value` might evaluate to null but is returned by the method declared as @NotNull
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
      if (!resolveResult.isModified() && resolveResult.isFullyResolved()) {
        //no references found
        return value;
      }
      //report original error
```

### DataFlowIssue
Argument `buildType.getBuildType()` might be null
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java

  public static String getBuildTypeHref(@NotNull final BuildTypeOrTemplate buildType) {
    return buildType.isBuildType() ? getBuildTypeHref(buildType.getBuildType()) : getBuildTypeHref(buildType.getTemplate());
  }

```

### DataFlowIssue
Argument `buildType.getTemplate()` might be null
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java

  public static String getBuildTypeHref(@NotNull final BuildTypeOrTemplate buildType) {
    return buildType.isBuildType() ? getBuildTypeHref(buildType.getBuildType()) : getBuildTypeHref(buildType.getTemplate());
  }

```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
    for (Requirement requirement : buildType.get().getRequirements()) {
      String id = requirement.getId();
      if (requirementId.equals(id != null ? id : requirement.getPropertyName())) {
        return requirement;
      }
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
    //may be it is a property name: use obsolete pre-TeamCity 10 logic
    for (Requirement requirement : buildType.get().getRequirements()) {
      if (requirementId.equals(requirement.getPropertyName())) {
        LOG.debug("Found agent requirement by parameter name '" + requirementId + "' instead of id." +
                  (requirement.getId() != null ? " This behavior is obsolete, use id (" + requirement.getId() + ") instead of parameter name." : ""));
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java

    for (SArtifactDependency dep : buildType.get().getArtifactDependencies()) {
      if (artifactDepId.equals(dep.getId())) {
        return dep;
      }
```

### DataFlowIssue
Argument `artifactDepId` might be null
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java

    try {
      final Integer orderNumber = Integer.parseInt(artifactDepId);
      try {
        SArtifactDependency result = buildType.get().getArtifactDependencies().get(orderNumber);
```

### DataFlowIssue
@Nullable method 'get' always returns a non-null value
in `src/jetbrains/buildServer/server/rest/model/buildType/VcsRoots.java`
#### Snippet
```java
                  @NotNull final BeanContext beanContext) {
    vcsRoots = ValueWithDefault.decideDefault(fields.isIncluded("vcs-root", false), new ValueWithDefault.Value<List<VcsRoot>>() {
      @Nullable
      public List<VcsRoot> get() {
        final ArrayList<VcsRoot> items = new ArrayList<VcsRoot>(serverVcsRoots.size());
```

### DataFlowIssue
@Nullable method 'get' always returns a non-null value
in `src/jetbrains/buildServer/server/rest/model/change/FileChanges.java`
#### Snippet
```java

    files = ValueWithDefault.decideDefault(fields.isIncluded("file", true), new ValueWithDefault.Value<List<FileChange>>() {
      @Nullable
      @Override
      public List<FileChange> get() {
```

### DataFlowIssue
@Nullable method 'get' always returns a non-null value
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesArtifactDep.java`
#### Snippet
```java
                                 @NotNull final Fields fields, @NotNull final BeanContext context) {
    propEntities = ValueWithDefault.decideDefault(fields.isIncluded("artifact-dependency", true), new ValueWithDefault.Value<List<PropEntityArtifactDep>>() {
      @Nullable
      public List<PropEntityArtifactDep> get() {
        final ArrayList<PropEntityArtifactDep> result = new ArrayList<PropEntityArtifactDep>(artifactDependencies.size());
```

## RuleId[id=BoxingBoxedValue]
### BoxingBoxedValue
Boxing of already boxed `submittedParams.paused`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
//check if it is already paused      if (Boolean.valueOf(submittedPaused) ^ buildTypeOrTemplatePatcher.getBuildTypeOrTemplate().getBuildType().isPaused())
      result = true;
      buildTypeOrTemplatePatcher.getBuildTypeOrTemplate().getBuildType().setPaused(Boolean.valueOf(submittedParams.paused),
                                                                                   serviceLocator.getSingletonService(UserFinder.class).getCurrentUser(),
                                                                                   TeamCityProperties.getProperty("rest.defaultActionComment"));
```

### BoxingBoxedValue
Boxing of already boxed `agentPool.maxAgents`
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
      if (agentPool.maxAgents != null) {
        agentDetails = new AgentPoolLimitsImpl(AgentPoolLimits.DEFAULT.getMinAgents(),
                                                agentPool.maxAgents != null ? Integer.valueOf(agentPool.maxAgents) : AgentPoolLimits.DEFAULT.getMaxAgents());
      }
      newAgentPool = myServiceLocator.getSingletonService(AgentPoolManager.class).createNewAgentPool(agentPool.name, agentDetails);
```

### BoxingBoxedValue
Boxing of already boxed `buildId`
in `src/jetbrains/buildServer/server/rest/data/problem/ProblemOccurrenceFinder.java`
#### Snippet
```java
        for (Long buildId : buildIds) {
          try {
            final BuildPromotion buildByPromotionId = buildPromotionFinder.getBuildPromotion(Long.valueOf(buildId));
            if (buildByPromotionId.getBuildType() == null) {
              //missing build type, skip. Workaround for http://youtrack.jetbrains.com/issue/TW-34733
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'getProjectName' is still used
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  @XmlAttribute
  @Deprecated
  public String getProjectName() {
    return myBuildType == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("projectName"), () -> myBuildType.getProject().getFullName());
  }
```

### DeprecatedIsStillUsed
Deprecated member 'sourceProjectLocator' is still used
in `src/jetbrains/buildServer/server/rest/model/project/NewProjectDescription.java`
#### Snippet
```java
   */
  @Deprecated
  @XmlAttribute public String sourceProjectLocator;

  @XmlElement(name = "sourceProject")
```

### DeprecatedIsStillUsed
Deprecated member 'sourceBuildTypeLocator' is still used
in `src/jetbrains/buildServer/server/rest/model/buildType/NewBuildTypeDescription.java`
#### Snippet
```java
   */
  @Deprecated
  @XmlAttribute public String sourceBuildTypeLocator;

  @XmlElement(name = "sourceBuildType")
```

### DeprecatedIsStillUsed
Deprecated member 'parentProjectName' is still used
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
   */
  @XmlAttribute
  public String parentProjectName;

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'parentProjectInternalId' is still used
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
   */
  @XmlAttribute
  public String parentProjectInternalId;


```

### DeprecatedIsStillUsed
Deprecated member 'getPercentageComplete' is still used
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
   */
  @XmlAttribute
  public Integer getPercentageComplete() {
    return ValueWithDefault.decideDefault(myFields.isIncluded("percentageComplete"), () -> {
      if (myBuild == null || myBuild.isFinished()) {
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/model/files/Files.java`
#### Snippet
```java

      boolean countIsCheap = filesP.isCountCheap();
      count = ValueWithDefault.decideIncludeByDefault(fields.isIncluded("count", countIsCheap, countIsCheap, true), () -> filesP.getCount());
    }
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/problem/scope/TestScopesCollector.java`
#### Snippet
```java
  private static final List<String> SUPPORTED_SCOPES = Arrays.asList("suite", "package", "class");
  private static final Orders<TestScope> SUPPORTED_ORDERS = new Orders<TestScope>()
    .add("name",     Comparator.comparing(scope -> scope.getName()))
    .add("duration", Comparator.comparing(scope -> scope.getOrCalcCountersData().getDuration()))
    .add("count",    Comparator.comparing(scope -> scope.getOrCalcCountersData().getCount()));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/model/project/PropEntityProjectFeature.java`
#### Snippet
```java
      builder.multipleConvertToItems(TypedFinderBuilder.DimensionCondition.ALWAYS, dimensions -> new ArrayList<>(project.getOwnFeatures()));

      builder.locatorProvider(projectFeatureDescriptor -> getLocator(projectFeatureDescriptor));
      builder.duplicateCheckerSupplier(SetDuplicateChecker::new);

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/problem/scope/ProblemOccurrencesTreeCollector.java`
#### Snippet
```java
    return problemsByBuildAndType.values().stream()
                                 .flatMap(problemsByType -> problemsByType.values().stream())
                                 .map(group -> new GroupedProblems(group))
                                 .collect(Collectors.toList());
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java
    }
    if ((own == null || !own) && !templates.isEmpty()) {
      HashSet<Option> optionsFromTemplates = templates.stream().flatMap(t -> t.getOwnOptions().stream()).collect(HashSet::new, Collection::add, (t1, t2) -> t1.addAll(t2));
      properties.putAll(getOptionsAsMap(buildType.get(), optionsFromTemplates));
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypes.java`
#### Snippet
```java
  public BuildTypes initializeSubmittedFromUsual() {
    //fields are used, so nothing should be done with them
    if (buildTypes != null) buildTypes.forEach(bt -> bt.initializeSubmittedFromUsual());
    return this;
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/investigations/InvestigationFinder.java`
#### Snippet
```java
    final String typeDimension = locator.getSingleDimensionValue(TYPE);
    if (typeDimension != null) {
      if (ProblemTarget.getKnownTypesForInvestigation().stream().noneMatch(s -> typeDimension.equalsIgnoreCase(s))) {
        throw new BadRequestException("Error in dimension '" + TYPE + "': unknown value '" + typeDimension + "'. Known values: " +
                                      StringUtil.join(ProblemTarget.getKnownTypesForInvestigation(), ", "));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudInstance.java`
#### Snippet
```java
  @XmlElement(name = "errorMessage")
  public String getErrorMessage() {
    return ValueWithDefault.decideDefault(myFields.isIncluded("errorMessage", true), () -> myCloudInstance.getError());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudInstance.java`
#### Snippet
```java
  @XmlAttribute
  public String getId() {
    return ValueWithDefault.decideDefault(myFields.isIncluded("id", true, true), () -> myCloudInstance.getId());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudInstance.java`
#### Snippet
```java
  @XmlAttribute
  public String getState() {
    return ValueWithDefault.decideDefault(myFields.isIncluded("state", true, true), () -> myCloudInstance.getState());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/PermissionAssignmentFinder.java`
#### Snippet
```java
    if (projects == null) {
      if (global == null || global) {
        result = Stream.concat(result, permissions.stream().filter(p -> authorityHolder.isPermissionGrantedGlobally(p)).map(p -> new PermissionAssignmentData(p)));
      }
      if (global == null || !global) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/PermissionAssignmentFinder.java`
#### Snippet
```java
    if (global == null || global) {
      result = Stream.concat(result, permissions.stream().filter(p -> p.isProjectAssociationSupported()).filter(p -> authorityHolder.isPermissionGrantedGlobally(p))
                                                .map(p -> new PermissionAssignmentData(p)));
    }
    if (global == null || !global) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/PermissionAssignmentFinder.java`
#### Snippet
```java

    builder.dimensionEnum(PERMISSION, Permission.class).description("id of the permission to filter the results by")
           .valueForDefaultFilter(p -> p.getPermission());

    builder.multipleConvertToItemHolder(
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudInstanceFinder.java`
#### Snippet
```java
      name("CloudInstanceFinder");

      dimension(ID, mapper(value -> new CloudUtil.InstanceIdData(value)).acceptingType("Specially formatted text"))
        .description("instance id as provided by list instances call")
        .filter((instanceIdData, instanceData) -> checkInstanceHasGivenIds(instanceIdData, instanceData))
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudInstanceFinder.java`
#### Snippet
```java
      dimension(ID, mapper(value -> new CloudUtil.InstanceIdData(value)).acceptingType("Specially formatted text"))
        .description("instance id as provided by list instances call")
        .filter((instanceIdData, instanceData) -> checkInstanceHasGivenIds(instanceIdData, instanceData))
        .toItems(instanceIdData -> getCloudInstanceDataById(instanceIdData));

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudInstanceFinder.java`
#### Snippet
```java
        .description("instance id as provided by list instances call")
        .filter((instanceIdData, instanceData) -> checkInstanceHasGivenIds(instanceIdData, instanceData))
        .toItems(instanceIdData -> getCloudInstanceDataById(instanceIdData));

      dimensionValueCondition(ERROR).description("instance error message").valueForDefaultFilter(instance -> instance.getError());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudInstanceFinder.java`
#### Snippet
```java
        .toItems(instanceIdData -> getCloudInstanceDataById(instanceIdData));

      dimensionValueCondition(ERROR).description("instance error message").valueForDefaultFilter(instance -> instance.getError());
      dimensionValueCondition(NETWORK_ADDRESS).description("instance network address").valueForDefaultFilter(instance -> instance.getInstance().getNetworkIdentity());
      dimensionTimeCondition(START_DATE, myTimeCondition).description("instance start time").valueForDefaultFilter(instance -> instance.getInstance().getStartedTime());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootInstanceFinder.java`
#### Snippet
```java

    TimeCondition.FilterAndLimitingDate<VcsRootInstance> finishFiltering =
      myTimeCondition.processTimeConditions(FINISH_VCS_CHECKING_FOR_CHANGES, locator, (vcsRootInstance) -> getFinishCheckingForChanges(vcsRootInstance), null);
    if (finishFiltering != null) result.add(finishFiltering.getFilter());

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudImageFinder.java`
#### Snippet
```java
      return agentTypes.stream()
                       .map(it -> findRespectiveCloudImage(it.getAgentTypeKey()))
                       .filter(it -> it != null);
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudImageFinder.java`
#### Snippet
```java
      return buildTypeOrTemplateList
        .stream()
        .flatMap(it -> findCompatibleCloudImages(it));
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudImageFinder.java`
#### Snippet
```java
      dimension(ID, mapper(CloudUtil.ImageIdData::new).acceptingType("Specially formatted text"))
        .description("image id as provided by list images call")
        .filter((profileAndId, item) -> checkImageByProfileAndId(profileAndId, item))
        .toItems(profileAndId -> findImageByProfileAndId(profileAndId));

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudImageFinder.java`
#### Snippet
```java
        .description("image id as provided by list images call")
        .filter((profileAndId, item) -> checkImageByProfileAndId(profileAndId, item))
        .toItems(profileAndId -> findImageByProfileAndId(profileAndId));

      dimensionValueCondition(NAME)
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ProjectFinder.java`
#### Snippet
```java
      builder.dimensionEnum(PERMISSION, Permission.class).description("permission to check, should be present");
      builder.filter(locator -> locator.lookupSingleDimensionValue(PERMISSION.name) != null && locator.lookupSingleDimensionValue(USER.name) != null,
                     dimensions -> new PermissionFilter(dimensions));
      myFinder = builder.build();
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/graphql/model/connections/agent/AssociatedAgentBuildTypesConnectionBuilder.java`
#### Snippet
```java

    public ConnectionImpl(@NotNull Connection<BuildType> delegate) {
      myEdges = delegate.getEdges().stream().map(e -> new AgentBuildTypeEdge(e)).collect(Collectors.toList());
      myPageInfo = delegate.getPageInfo();
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/model/RelatedEntities.java`
#### Snippet
```java
                                                 () -> items.stream().map(i -> new RelatedEntity(i, fields.getNestedField("entity", Fields.NONE, Fields.LONG), context)).collect(Collectors.toList()));

    count = ValueWithDefault.decideIncludeByDefault(fields.isIncluded("count"), () -> items.size());
  }
}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java
      if (selectedByUser != null) {
        List<BuildTypeOrTemplate> filterSet = getSelectedByUser(locator, selectedByUser);
        result.add(item -> filterSet.contains(item));
      }
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java
      final GraphFinder<BuildTypeOrTemplate> graphFinder = new GraphFinder<>(this, new SnapshotDepsTraverser(myPermissionChecker));
      final List<BuildTypeOrTemplate> boundingList = graphFinder.getItems(snapshotDependencies).myEntries;
      result.add(item -> boundingList.contains(item));
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java
      final GraphFinder<BuildTypeOrTemplate> graphFinder = new GraphFinder<>(this, new ArtifactDepsTraverser(myPermissionChecker));
      final List<BuildTypeOrTemplate> boundingList = graphFinder.getItems(artifactDependencies).myEntries;
      result.add(item -> boundingList.contains(item));
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java
        final BuildTypeTemplate buildTemplate = getBuildTemplate(null, templateLocator, true); //only this can throw exceptions caught later
        final List<BuildTypeOrTemplate> boundingList = BuildTypes.fromBuildTypes(buildTemplate.getUsages());
        result.add(item -> boundingList.contains(item));
      } catch (NotFoundException e) {
        //legacy support for boolean template
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java
          }
        }
        return result.stream().map(bt -> new BuildTypeOrTemplate(bt)).collect(Collectors.toList());
      }
      case SELECTED:
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/problem/ProblemFinder.java`
#### Snippet
```java
      //todo: bug: searches only inside current problems: non-current problems are not returned
      //todo: TeamCity API (VB): is there a dedicated API call for this?  -- consider doing this via ProblemOccurrences
      result.add(item -> currentProjectProblems.contains(item));
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
            int[] max = new int[1];
            max[0] = -1;
            boolean exceedsCount = itemDimension.stream().map(l -> getCheapCount(l)).anyMatch(cheapCount -> {
              if (cheapCount == null) {
                max[0] = -2; //there is not cheap count
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
        }
        if (!branchFilterDetails.isAnyBranch()) {
          result.add(item -> branchFilterDetails.isIncluded(item));
        }
      }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentPoolFinder.java`
#### Snippet
```java
      multipleConvertToItems(DimensionCondition.ALWAYS, dimensions -> myAgentPoolManager.getAllAgentPools());

      locatorProvider(agentPool -> getLocator(agentPool));
      duplicateCheckerSupplier(() -> new ComparatorDuplicateChecker<>(
        (agentPool1, agentPool2) -> ComparisonChain.start()
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
    myPermissionChecker.checkGlobalPermission(Permission.MANAGE_SERVER_INSTALLATION);
    try {
      return new Items(Stream.of(InetAddress.getAllByName(host)).filter(Objects::nonNull).map(inetAddress -> inetAddress.getHostAddress()).collect(Collectors.toList()));
    } catch (UnknownHostException e) {
      throw new BadRequestException("Unknown host: " + e.getMessage());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
        if (locator != null) throw new BadRequestException("Builds locator is not supported here");
        BuildTypeFinder buildTypeFinder = myServiceLocator.getSingletonService(BuildTypeFinder.class);
        Set<String> buildTypeIds = buildTypeFinder.getBuildTypesPaged(null, buildTypeLocator, true).myEntries.stream().map(bt -> bt.getInternalId()).collect(Collectors.toSet());
        List<BuildPromotion> buildPromotions = new ArrayList<>(1000);
        myServiceLocator.getSingletonService(BuildPromotionManagerImpl.class).traverseCachedBuildTypePromotions(buildTypeIds, item -> buildPromotions.add(item));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/problem/TestOccurrenceFinder.java`
#### Snippet
```java
    if(scopeDimension != null) {
      final TestScopeFilter filter = myTestScopeFilterProducer.createFromLocatorString(scopeDimension);
      result.add(item -> filter.test(item));
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/BranchData.java`
#### Snippet
```java
    // At this point we don't care that these branches may come from different repositories, as we only need this info to show branch labels in the UI.
    Map<MergingBranchData.MergeKey, BranchData> mergedBranchData = unmergeBranches.collect(
      Collectors.groupingBy(branchData -> new MergingBranchData.MergeKey(branchData), Collectors.reducing(null, (left, right) -> left == null ? right : left))
    );

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/UserFinder.java`
#### Snippet
```java
      builder.dimensionEnum(PERMISSION, Permission.class).description("permission to check, should be present");
      builder.filter(locator -> locator.lookupSingleDimensionValue(PERMISSION.name) != null && locator.lookupDimensionValue(PROJECT.name).size() <= 1,
                     dimensions -> new UserPermissionFilter(dimensions));
      myFinder = builder.build();
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/UserFinder.java`
#### Snippet
```java
                                              });

      dimensionParameterCondition(PROPERTY).description("user's property").valueForDefaultFilter(item -> getUserPropertiesProvider(item));
      dimensionValueCondition(EMAIL).description("user's email").valueForDefaultFilter(item -> item.getEmail());
      dimensionValueCondition(NAME).description("user's display name").valueForDefaultFilter(item -> item.getName());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/UserFinder.java`
#### Snippet
```java
      dimension(ROLE, mapper(dimensionValue -> new RoleEntryDatas(dimensionValue, myRolesManager, myProjectFinder, myPermissionChecker)).acceptingType("role locator"))
        .description("user's role")
        .filter((roleEntryDatas, item) -> roleEntryDatas.matches(item));

      PermissionCheck permissionCheck = new PermissionCheck();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/UserFinder.java`
#### Snippet
```java

      PermissionCheck permissionCheck = new PermissionCheck();
      dimension(PERMISSION, mapper(dimensionValue -> permissionCheck.matches(dimensionValue)).acceptingType("permission check locator"))
        .description("user's permission (experimental)").hidden()
        .filter((type, item) -> type.isIncluded(item));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/data/finder/impl/UserFinder.java`
#### Snippet
```java
      dimension(PERMISSION, mapper(dimensionValue -> permissionCheck.matches(dimensionValue)).acceptingType("permission check locator"))
        .description("user's permission (experimental)").hidden()
        .filter((type, item) -> type.isIncluded(item));

      multipleConvertToItemHolder(DimensionCondition.ALWAYS, dimensions -> {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
      } catch (Exception e) {
        LOG.warnAndDebugDetails("Failed to get changes (including empty changes) for " + LogUtil.describe(myBuildPromotion), e);
        data = CachingValue.simple(() -> Collections.emptyList());
      }
      return new Changes(new PagerDataImpl(href), changesFields, myBeanContext, data);
```

## RuleId[id=ComparatorCombinators]
### ComparatorCombinators
Can be replaced with 'Comparator.comparing'
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
    StringBuilder result = new StringBuilder();
    myDimensions.entrySet().stream()
                .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
                .forEach(entry -> {
      String name = entry.getKey();
```

### ComparatorCombinators
Can be replaced with 'Comparator.comparing'
in `src/jetbrains/buildServer/server/rest/swagger/LocatorAwareReader.java`
#### Snippet
```java
    }

    Collections.sort(dimensions, (dim1, dim2) -> dim1.value().compareTo(dim2.value()));

    for (LocatorDimension dimension : dimensions) {
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `Long.toString()` call
in `src/jetbrains/buildServer/server/rest/data/problem/scope/ProblemOccurrencesTreeCollector.java`
#### Snippet
```java
      String btNodeId = Hashing.sha1().hashString("BT" + buildType.getInternalId(), Charsets.UTF_8).toString();
      scopes.add(new ProblemScope(btNodeId, buildType.getExternalId(), ProblemScopeType.BUILD_TYPE));
      String buildNodeId = Hashing.sha1().hashString("B" + Long.toString(promotion.getId()), Charsets.UTF_8).toString();
      scopes.add(new ProblemScope(buildNodeId, Long.toString(promotion.getId()), ProblemScopeType.BUILD));

```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java
      return "";
    }
    return entity + ": " + fieldA + "=" + String.valueOf(a) + " <-> " + fieldB + "=" + String.valueOf(b) + "\n";
  }

```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java
      return "";
    }
    return entity + ": " + fieldA + "=" + String.valueOf(a) + " <-> " + fieldB + "=" + String.valueOf(b) + "\n";
  }

```

### UnnecessaryCallToStringValueOf
Unnecessary `Long.toString()` call
in `src/jetbrains/buildServer/server/rest/data/problem/scope/TestScope.java`
#### Snippet
```java
    String buildNodeId = "";
    if(myBuildPromotion != null) {
      buildNodeId = Hashing.sha1().hashString("B" + Long.toString(myBuildPromotion.getId()), Charsets.UTF_8).toString();
      myPath.add(new TestScopeInfo(buildNodeId, Long.toString(myBuildPromotion.getId()), TestScopeType.BUILD));
    }
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/jetbrains/buildServer/server/rest/jersey/ExceptionMapperBase.java`
#### Snippet
```java
      responseText.append("Responding with error");
    }
    responseText.append(", status code: ").append(Integer.toString(statusCode));
    if (status != null) responseText.append(" (").append(status.toString()).append(")");
    responseText.append(".");
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'myLocator' in a Serializable class
in `src/jetbrains/buildServer/server/rest/errors/LocatorProcessException.java`
#### Snippet
```java
 */
public class LocatorProcessException extends RuntimeException {
  @Nullable private Locator myLocator;

  public LocatorProcessException(final String locator, final int index, final String message) {
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudImage.java`
#### Snippet
```java
      @NotNull
      @Override
      protected Optional<SAgentType> createValue() {
        jetbrains.buildServer.clouds.CloudProfile profile = myBeanContext.getSingletonService(CloudUtil.class).getProfile(myCloudImage);
        if(profile == null) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/jetbrains/buildServer/server/rest/model/build/downloadedArtifacts/DownloadedArtifacts.java`
#### Snippet
```java
  private final Lazy<Map<SBuild, List<ArtifactInfo>>> myFilteredInfo = new Lazy<Map<SBuild, List<ArtifactInfo>>>() {
    @Override
    protected Map<SBuild, List<ArtifactInfo>> createValue() {
      return getFilteredInfo();
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  private final Lazy<SubmitedParameters> mySubmitted = new Lazy<SubmitedParameters>() {
    @Override
    protected SubmitedParameters createValue() {
      return new SubmitedParameters();
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/jetbrains/buildServer/server/rest/model/Fields.java`
#### Snippet
```java
    myFieldsSpecLocator = new Lazy<Locator>() {
      @Override
      protected Locator createValue() {
        return computeParsedCustomFields();
      }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/jetbrains/buildServer/server/graphql/model/agentPool/AgentPoolPermissions.java`
#### Snippet
```java
    myEnableAgents = new Lazy<Boolean>() {
      @Override
      protected Boolean createValue() {
        return enableAgents.getAsBoolean();
      }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/jetbrains/buildServer/server/graphql/model/agentPool/AgentPoolPermissions.java`
#### Snippet
```java
    myManageAgents = new Lazy<Boolean>() {
      @Override
      protected Boolean createValue() {
        return manageAgents.getAsBoolean();
      }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/jetbrains/buildServer/server/graphql/model/agentPool/AgentPoolPermissions.java`
#### Snippet
```java
    myManageProjects = new Lazy<Boolean>() {
      @Override
      protected Boolean createValue() {
        return manageProjects.getAsBoolean();
      }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/jetbrains/buildServer/server/graphql/model/agentPool/AgentPoolPermissions.java`
#### Snippet
```java
    myAuthorizeAgents = new Lazy<Boolean>() {
      @Override
      protected Boolean createValue() {
        return authorizeAgents.getAsBoolean();
      }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/model/debug/Sessions.java`
#### Snippet
```java
      sessionsListRaw = String.valueOf(serverBean.invoke(managerBean, "listSessionIds", null, null));
    } catch (Exception e) {
      throw new OperationException("Could not get sessions data: " + e.toString(), e);
    }
    final String[] sessionIds = sessionsListRaw.split(" ");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/model/debug/Sessions.java`
#### Snippet
```java
      } catch (Exception e) {
        userId = null;
        LOG.debug("Cannot retrieve userId for session with id '" + sessionId + "': " + e.toString());
      }
      Long creationTimestamp = (Long)getBeanOperationResult(serverBean, managerBean, sessionId, "getCreationTimestamp");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/util/AggregatedBuildArtifactsElementBuilder.java`
#### Snippet
```java
        result.add(artifactElement);
      } catch (NotFoundException e) {
        LOG.debug("Ignoring not found error in artifacts aggregation request: " + e.toString());
      } catch (AuthorizationFailedException e) {
        LOG.debug("Ignoring authentication error in artifacts aggregation request: " + e.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/util/AggregatedBuildArtifactsElementBuilder.java`
#### Snippet
```java
        LOG.debug("Ignoring not found error in artifacts aggregation request: " + e.toString());
      } catch (AuthorizationFailedException e) {
        LOG.debug("Ignoring authentication error in artifacts aggregation request: " + e.toString());
      }
      i++;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/data/TimeWithPrecision.java`
#### Snippet
```java
        firstError = new BadRequestException("Was not able to parse date '" + timeString + "' using format '" + Constants.TIME_FORMAT + "' and others." +
                                             " Supported format example: '" + new SimpleDateFormat(Constants.TIME_FORMAT, Locale.ENGLISH).format(new Date()) + "'." +
                                             " Error: " + e.toString(), e);
      }
    } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/data/TimeWithPrecision.java`
#### Snippet
```java
                                             " Supported format example: '" +
                                             DateTimeFormat.forPattern(Constants.TIME_FORMAT).withLocale(Locale.ENGLISH).withZone(DateTimeZone.getDefault()).print(Instant.now()) +
                                             "'. Error: " + e.toString(), e);
      }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/data/TimeWithPrecision.java`
#### Snippet
```java
    } catch (Exception e) {
      //ignore
      if (LOG.isDebugEnabled()) LOG.debug("Was not able to parse date/time '" + timeString + "' using ISODateTimeFormat.localTimeParser. Error: " + e.toString(), e);
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/data/TimeWithPrecision.java`
#### Snippet
```java
    } catch (Exception e) {
      //ignore
      if (LOG.isDebugEnabled()) LOG.debug("Was not able to parse date/time '" + timeString + "' using ISODateTimeFormat.dateTimeParser. Error: " + e.toString(), e);
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/data/TimeWithPrecision.java`
#### Snippet
```java
    } catch (Exception e) {
      //ignore
      if (LOG.isDebugEnabled()) LOG.debug("Was not able to parse date/time '" + timeString + "' using ISODateTimeFormat.basicDateTime. Error: " + e.toString(), e);
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/data/TimeWithPrecision.java`
#### Snippet
```java
    } catch (Exception e) {
      //ignore
      if (LOG.isDebugEnabled()) LOG.debug("Was not able to parse date/time '" + timeString + "' using ISODateTimeFormat.basicDateTimeNoMillis. Error: " + e.toString(), e);
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/data/TimeWithPrecision.java`
#### Snippet
```java
    } catch (Exception e) {
      //ignore
      if (LOG.isDebugEnabled()) LOG.debug("Was not able to parse date/time '" + timeString + "' using ISODateTimeFormat.localDateOptionalTimeParser. Error: " + e.toString(), e);
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/data/TimeWithPrecision.java`
#### Snippet
```java
    } catch (Exception e) {
      //ignore
      if (LOG.isDebugEnabled()) LOG.debug("Was not able to parse date/time '" + timeString + "' using LocalTime. Error: " + e.toString(), e);
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/data/TimeWithPrecision.java`
#### Snippet
```java
    } catch (Exception e) {
      //ignore
      if (LOG.isDebugEnabled()) LOG.debug("Was not able to parse date/time '" + timeString + "' using format '" + "yyyyMMdd'T'HHmmss.SSS" + "'. Error: " + e.toString(), e);
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/data/TimeWithPrecision.java`
#### Snippet
```java
    } catch (Exception e) {
      //ignore
      if (LOG.isDebugEnabled()) LOG.debug("Was not able to parse date/time '" + timeString + "' using format '" + "yyyyMMdd'T'HHmmss" + "'. Error: " + e.toString(), e);
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesSnapshotDep.java`
#### Snippet
```java
        buildTypeSettings.addDependency(dependency);
      }
      throw new BadRequestException("Error setting snapshot dependencies: " + e.toString(), e);
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/jersey/ExtensionHolderProviderFactory.java`
#### Snippet
```java
    final Object o = myExtensionHolder.findSingletonService(c);
    if (o != null) {
      LOG.debug("Request for class: " + c + " as extension, found: " + o.toString());
      return new IoCManagedComponentProvider() {
        public Object getInstance() {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/model/Property.java`
#### Snippet
```java
        entity.removeParameter(name);
      }
      throw new BadRequestException("Cannot set parameter '" + name + "' to value '" + fromPosted.getValue() + "': " + e.toString(), e);
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/jersey/ExtensionsAwareResourceConfig.java`
#### Snippet
```java
          throw new RuntimeException(message, e);
        }
        message += " Jersey resources located in the packages are ignored. Error: " + e.toString() + ExceptionMapperBase.addKnownExceptionsData(e, "");
        LOG.error(message, e);
        Loggers.SERVER.error(message);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/request/BuildQueueRequest.java`
#### Snippet
```java
        buildsWithErrors.put(build, e);
        LOG.debug("Got error trying to add build" + (build.getPromotionIdOfSubmittedBuild() != null ? " with id '" + build.getPromotionIdOfSubmittedBuild() + "'" : "") +
                  " to the build queue. Details: " + e.toString(), e);
      }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/data/ParameterCondition.java`
#### Snippet
```java
      result.append(myNameCondition.getConstantValueIfSimpleEqualsCondition());
    } else {
      result.append(myNameCondition.toString());
    }
    result.append(", ").append("value condition: ").append(myValueCondition.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/data/ParameterCondition.java`
#### Snippet
```java
      result.append(myNameCondition.toString());
    }
    result.append(", ").append("value condition: ").append(myValueCondition.toString());
    result.append(")");
    return result.toString();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntityArtifactDep.java`
#### Snippet
```java
      //restore
      original.apply(buildType);
      throw new BadRequestException("Error updating artifact dependencies: " + e.toString(), e);
    }
    return newDependency;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntityArtifactDep.java`
#### Snippet
```java
    } catch (Exception e) {
      original.apply(buildType);
      throw new BadRequestException("Error adding artifact dependency: " + e.toString(), e);
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/model/Properties.java`
#### Snippet
```java
        holder.addParameter(p);
      }
      throw new BadRequestException("Cannot set parameters: " + e.toString(), e);
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildFinder.java`
#### Snippet
```java
    final List<SBuild> filteredBuilds = getBuilds(buildsFilter);
    if (filteredBuilds.size() == 0){
      throw new NotFoundException("No build found by filter: " + buildsFilter.toString() + ".");
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/data/problem/ProblemOccurrenceFinder.java`
#### Snippet
```java

    } catch (Exception e) {
      throw new OperationException("Error performing database query: " + e.toString(), e);
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
    @Override
    public String toString() {
      return myElement.toString() + " unified";
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
        @Override
        public String toString() {
          return myElement.toString() + " with children concealed";
        }
      };
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
      return new Sessions(serverBean, managerBean, new Fields(fields), beanContext);
    } catch (Exception e) {
      throw new OperationException("Could not get sessions data: " + e.toString(), e);
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
          }
        } catch (Throwable throwable) {
          LOG.info("Error while retrieving build under system, returning 'internal_error'': " + throwable.toString(), throwable);
          return INTERNAL_ERROR; //todo: use separate icon for errors (most importantly, wrong request)
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/jersey/ExceptionMapperBase.java`
#### Snippet
```java
    }
    responseText.append(", status code: ").append(Integer.toString(statusCode));
    if (status != null) responseText.append(" (").append(status.toString()).append(")");
    responseText.append(".");

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/data/finder/FinderImpl.java`
#### Snippet
```java
      result.append(", context: ");
      result.append(contextVars.stream().map(s -> s + "=" + Optional.ofNullable(getContextItems(s)).map(
                                 v -> v.stream().map(vElem -> (vElem == null ? "<null>" : "'" + vElem.toString() + "'")).collect(Collectors.joining(", ", "{", "}"))).orElse("<null>"))
                               .collect(Collectors.joining(", ", "{", "}")));
      //vElem.toString() might produce not due presentation
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/data/finder/FinderImpl.java`
#### Snippet
```java
          throw new BadRequestException("Invalid filter for found single item, try omitting extra dimensions: " + e.getMessage(), e);
        } catch (Exception e) {
          throw new BadRequestException("Invalid filter for found single item, try omitting extra dimensions: " + e.toString(), e);
        }
        locator.markUsed(DIMENSION_UNIQUE); //mark as used as it has no influence on single item
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
      }
    } catch (Exception e) {
      throw new OperationException("Unexpected state while getting artifact dependency details: " + e.toString(), e);
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
      @Override
      public String toString() {
        return dimension.toString() + " -> " + conditionBasedOnValue.toString();
      }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
      @Override
      public String toString() {
        return dimension.toString() + " -> " + conditionBasedOnValue.toString();
      }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
  public TypedFinderBuilder<ITEM> filter(@NotNull final DimensionCondition conditions, @NotNull final ItemFilterFromDimensions<ITEM> parsedObjectsIfConditionsMatched) {
    ItemFilterFromDimensions<ITEM> previous = myFiltersConditions.put(conditions, parsedObjectsIfConditionsMatched);
    if (previous != null) throw new OperationException("Overriding dimension condition '" + conditions.toString() + "'");
    return this;
  }
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `BuildsCollector` may be 'static'
in `src/jetbrains/buildServer/server/rest/model/change/ChangeStatus.java`
#### Snippet
```java
   * Simple utility class to avoid storing builds promotions if not necessary.
   */
  private class BuildsCollector implements ItemsProviders.ItemsRetriever<BuildPromotion> {
    private int myCount = 0;
    private List<BuildPromotion> myPromotions = null;
```

### InnerClassMayBeStatic
Inner class `CloudImageAndProfilePair` may be 'static'
in `src/jetbrains/buildServer/server/graphql/resolver/AgentTypeResolver.java`
#### Snippet
```java
  }

  private class CloudImageAndProfilePair {
    private final CloudImage myImage;
    private final CloudProfile myProfile;
```

### InnerClassMayBeStatic
Inner class `AgentPoolAgentsConnectionEdge` may be 'static'
in `src/jetbrains/buildServer/server/graphql/model/connections/agentPool/AgentPoolAgentsConnection.java`
#### Snippet
```java
  }

  public class AgentPoolAgentsConnectionEdge extends LazyEdge<SBuildAgent, Agent> {
    public AgentPoolAgentsConnectionEdge(@NotNull SBuildAgent data) {
      super(data, Agent::new);
```

### InnerClassMayBeStatic
Inner class `ByBuildSplitter` may be 'static'
in `src/jetbrains/buildServer/server/rest/data/problem/scope/TestScopesCollector.java`
#### Snippet
```java
  }

  private class ByBuildSplitter {
    private final boolean myGroupParallelTests;
    private final BuildPromotion myHeadPromotion;
```

### InnerClassMayBeStatic
Inner class `BuildTypesConnectionEdge` may be 'static'
in `src/jetbrains/buildServer/server/graphql/model/connections/BuildTypesConnection.java`
#### Snippet
```java
  }

  public class BuildTypesConnectionEdge extends LazyEdge<SBuildType, BuildType> {

    public BuildTypesConnectionEdge(@NotNull SBuildType data) {
```

### InnerClassMayBeStatic
Inner class `BranchSearchOptions` may be 'static'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BranchFinder.java`
#### Snippet
```java
  }

  protected class BranchSearchOptions {
    @NotNull private final BranchesPolicy branchesPolicy;
    @Nullable private final Boolean includeBranchesFromDependencies;
```

### InnerClassMayBeStatic
Inner class `ProjectsConnectionEdge` may be 'static'
in `src/jetbrains/buildServer/server/graphql/model/connections/ProjectsConnection.java`
#### Snippet
```java


  public class ProjectsConnectionEdge extends LazyEdge<SProject, Project> {
    public ProjectsConnectionEdge(@NotNull SProject data) {
      super(data, Project::new);
```

### InnerClassMayBeStatic
Inner class `UriModification` may be 'static'
in `src/jetbrains/buildServer/server/rest/model/PagerDataImpl.java`
#### Snippet
```java
  }

  class UriModification {
    @NotNull private final UriBuilder myBuilder;
    @Nullable private final String myCurrentLocatorText;
```

### InnerClassMayBeStatic
Inner class `ArtifactDepsTraverser` may be 'static'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java
  }

  private class ArtifactDepsTraverser implements GraphFinder.Traverser<BuildTypeOrTemplate> {
    @NotNull private final PermissionChecker myPermissionChecker;

```

### InnerClassMayBeStatic
Inner class `IncludePersonalBuildsRuling` may be 'static'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java

  // Package-private for tests
  class IncludePersonalBuildsRuling {
    private final boolean myIncludePersonal;
    private final SUser myOwner;
```

### InnerClassMayBeStatic
Inner class `AgentPoolProjectsConnectionEdge` may be 'static'
in `src/jetbrains/buildServer/server/graphql/model/connections/agentPool/AgentPoolProjectsConnection.java`
#### Snippet
```java
  }

  public class AgentPoolProjectsConnectionEdge extends LazyEdge<SProject, Project> {
    public AgentPoolProjectsConnectionEdge(@NotNull SProject data) {
      super(data, Project::new);
```

### InnerClassMayBeStatic
Inner class `ParsedTimeCondition` may be 'static'
in `src/jetbrains/buildServer/server/rest/data/TimeCondition.java`
#### Snippet
```java
  }

  public class ParsedTimeCondition implements Matcher<Date> {
    @Nullable private final TimeWithPrecision myLimitingSinceDate;
    @NotNull private final TimeWithPrecision myLimitingDate;
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Set' may not contain objects of type ''
in `src/jetbrains/buildServer/server/rest/model/nodes/EffectiveResponsibilities.java`
#### Snippet
```java
  public EffectiveResponsibilities(@NotNull final TeamCityNode node, @NotNull final Fields fields) {
    Set<NodeResponsibility> editable = NodeResponsibility.assignableResponsibilities();
    Set<NodeResponsibility> effectiveResponsibilities = node.getEffectiveResponsibilities().stream().filter(n -> editable.contains(n)).collect(Collectors.toSet());
    this.responsibilities = ValueWithDefault.decideDefault(fields.isIncluded("responsibility", true), () ->
      effectiveResponsibilities.stream().map(toResponsibility(fields)).collect(toList())
```

### SuspiciousMethodCalls
'Set' may not contain objects of type ''
in `src/jetbrains/buildServer/server/rest/model/nodes/EnabledResponsibilities.java`
#### Snippet
```java
  public EnabledResponsibilities(@NotNull final TeamCityNode node, @NotNull final Fields fields) {
    Set<NodeResponsibility> editable = NodeResponsibility.assignableResponsibilities();
    Set<NodeResponsibility> enabledResponsibilities = node.getEnabledResponsibilities().stream().filter(n -> editable.contains(n)).collect(Collectors.toSet());
    this.responsibilities = ValueWithDefault.decideDefault(fields.isIncluded("responsibility", true), () ->
      enabledResponsibilities.stream().map(toResponsibility(fields)).collect(toList())
```

### SuspiciousMethodCalls
'Set' may not contain objects of type ''
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BranchFinder.java`
#### Snippet
```java
    // without this filter we'd traverse branches of a single build type 1 + as many times as it is accessible via snapshot dependencies
    final Set<SBuildType> myFilteredBuildTypes = new HashSet<>(buildTypes);
    return data -> !myFilteredBuildTypes.contains(data);
  }

```

### SuspiciousMethodCalls
'Set' may not contain objects of type ''
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AuditEventFinder.java`
#### Snippet
```java
    @NotNull
    private List<String> getActionTypesValues() {
      return Arrays.stream(ActionType.class.getEnumConstants()).filter(o -> !HIDDEN_ACTION_TYPES.contains(o)).map(source -> source.name().toLowerCase()).collect(Collectors.toList());
    }
  }
```

### SuspiciousMethodCalls
'Collection' may not contain objects of type ''
in `src/jetbrains/buildServer/server/rest/model/server/LicenseKeyEntities.java`
#### Snippet
```java

    return CollectionsUtil.convertCollection(ordering.sortedCopy(licenseKeys), (source) ->
      new LicenseKeyEntity(source, activeLicenseKeys == null ? null : activeLicenseKeys.contains(source), fields.getNestedField("licenseKey", Fields.LONG, Fields.LONG)));
  }
}
```

### SuspiciousMethodCalls
'Set' may not contain objects of type ''
in `src/jetbrains/buildServer/server/rest/model/nodes/DisabledResponsibilities.java`
#### Snippet
```java
  public DisabledResponsibilities(@NotNull final TeamCityNode node, @NotNull final Fields fields) {
    Set<NodeResponsibility> enabledResponsibilities = node.getEnabledResponsibilities();
    Set<NodeResponsibility> disabledResponsibilities = NodeResponsibility.assignableResponsibilities().stream().filter(n -> !enabledResponsibilities.contains(n)).collect(Collectors.toSet());
    this.responsibilities = ValueWithDefault.decideDefault(fields.isIncluded("responsibility", true), () ->
      disabledResponsibilities.stream().map(toResponsibility(fields)).collect(toList())
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/problem/Orders.java`
#### Snippet
```java
      String dimension = locator.getSingleDimensionValue(name);
      if (dimension != null) {
        if ("asc".equals(dimension) || "".equals(dimension)) {
          comparator = comparator.thenComparing(compPair.getValue());
        } else if ("desc".equals(dimension)) {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
      if (currentList == null) {
        // Dimension with an empy string value is a frequent case in a Fields, so let's reuse a special list for that list.
        newList = currentDimensionValue.equals("") ? LIST_WITH_EMPTY_STRING : Arrays.asList(currentDimensionValue);
      } else {
        newList = new ArrayList<>(currentList);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/jetbrains/buildServer/server/rest/model/change/VcsRoot.java`
#### Snippet
```java
      return;
    } else if ("modificationCheckInterval".equals(field)) {
      if ("".equals(newValue)) {
        vcsRoot.restoreDefaultModificationCheckInterval();
      } else {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/jetbrains/buildServer/server/rest/model/agent/Agent.java`
#### Snippet
```java
  static String getAgentOsType(@NotNull final SBuildAgent agent) {
    String osName = agent.getOperatingSystemName();
    if ("N/A".equalsIgnoreCase(osName) || "<unknown>".equalsIgnoreCase(osName) || "".equals(osName)) {
      osName = ((BuildAgentEx)agent).getAgentType().getOperatingSystemName();
    }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
    }
    final BuildArtifactHolder holder = artifacts.findArtifact(path);
    if (!holder.isAvailable() && !"".equals(path)) { // "".equals(path) is a workaround for no artifact directory case
      return getItem(new ArtifactsBrowserImpl(artifacts), path, LogUtil.describe(buildPromotionEx), serviceLocator);
    }
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/DataProvider.java`
#### Snippet
```java
        throw new BadRequestException("Trigger id cannot be empty.");
      }
      @SuppressWarnings("ConstantConditions") final BuildTriggerDescriptor foundTrigger = buildType.findTriggerById(triggerId);
      if (foundTrigger == null){
        throw new NotFoundException("No trigger found by id '" + triggerLocator +"' in build type.");
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
      //found used dimensions which are not declared as used.

      //noinspection ThrowableInstanceNeverThrown
      final Exception exception = new Exception("Helper exception to get stacktrace");
      LOG.info("Locator " + StringUtil.pluralize("dimension", usedDimensions.size()) + " " + usedDimensions + (usedDimensions.size() > 1 ? " are" : " is") +
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/build/BuildsFilterProcessor.java`
#### Snippet
```java
      new FilterItemProcessor<>(new PagingItemFilter<>(new FinishedBuildsFilter(buildsFilter), buildsFilter.getStart(), buildsFilter.getCount(), null));
    if (buildsFilter.getBuildType() != null) {
      //noinspection ConstantConditions
      buildHistory.processEntries(buildsFilter.getBuildType().getBuildTypeId(),
                                    getUserForProcessEntries(buildsFilter),
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
    protected ItemHolder<ITEM> getPrefilteredItems(@NotNull final Locator locator, @NotNull DimensionObjects dimensionObjects) {
      if (mySingleDimensionHandler != null && locator.isSingleValue()) {
        //noinspection ConstantConditions
        List<ITEM> items = mySingleDimensionHandler.get(locator.getSingleValue());
        if (items == null) throw new OperationException("Single value items provider returned 'null', but it cannot be ignored");
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AuditEventFinder.java`
#### Snippet
```java
          dimensions.get(BUILD_TYPE); //mark as used
          if (buildTypeOrTemplate.isBuildType()) {
            //noinspection ConstantConditions
            builder.addFilter(new BuildTypeFilter(buildTypeOrTemplate.getBuildType()));
          } else {
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AuditEventFinder.java`
#### Snippet
```java
            builder.addFilter(new BuildTypeFilter(buildTypeOrTemplate.getBuildType()));
          } else {
            //noinspection ConstantConditions
            builder.addFilter(new BuildTypeTemplateFilter(buildTypeOrTemplate.getTemplate()));
          }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
        final long nextListArchiveChildrenLevel =
          (myElement.isArchive() && myListArchiveChildrenLevel > 0 && !myFirstNode) ? myListArchiveChildrenLevel - 1 : myListArchiveChildrenLevel;
        //noinspection unchecked
        return CollectionsUtil.filterAndConvertCollection(myElement.getChildren(), source -> {
          final Boolean nestedHidden = myHidden != null && myHidden && isHiddenDir(source) ? null : myHidden; //do not filter if we list hidden files and already within .teamcity
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
        });
      } catch (BrowserException e) {
        //noinspection ThrowableResultOfMethodCallIgnored
        if (ExceptionUtil.getCause(e, AccessDeniedException.class) != null) {
          throw new AuthorizationFailedException("Error listing children for artifact '" + myElement.getFullName() + "'.", e);
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java

    @SuppressWarnings("SimplifiableConditionalExpression")
    public boolean isArchive() {
      return myZipElement != null ? myZipElement.isArchive() : false;
    }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java

    @SuppressWarnings("SimplifiableConditionalExpression")
    public boolean isInsideArchive() {
      return myZipElement != null ? myZipElement.isInsideArchive() : false;
    }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildFinder.java`
#### Snippet
```java
        // no dimensions found and no build type, assume it's build id

        @SuppressWarnings("ConstantConditions") SBuild build =
          myServiceLocator.getSingletonService(BuildsManager.class).findBuildInstanceById(locator.getSingleValueAsLong()); //todo: report non-number more user-friendly
        if (build == null) {
          throw new NotFoundException("Cannot find build by id '" + locator.getSingleValue() + "'.");
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildFinder.java`
#### Snippet
```java
      }
      // no dimensions found and build type is specified, assume it's build number
      @SuppressWarnings("ConstantConditions") SBuild build = myServiceLocator.getSingletonService(BuildsManager.class).findBuildInstanceByBuildNumber(buildType.getBuildTypeId(),
                                                                                                                       buildLocator);
      if (build == null) {
        throw new NotFoundException("No build can be found by number '" + buildLocator + "' in build configuration " + buildType + ".");
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ChangeFinder.java`
#### Snippet
```java
    if (locator.isSingleValue()) {
      // no dimensions found, assume it's id
      @SuppressWarnings("ConstantConditions") SVcsModification modification = myVcsManager.findModificationById(locator.getSingleValueAsLong(), false);
      if (modification == null) {
        throw new NotFoundException("No change can be found by id '" + locator.getSingleValueAsLong() + "'.");
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ChangeFinder.java`
#### Snippet
```java
      final Long promotionLocator = locator.getSingleDimensionValueAsLong(PROMOTION);
      if (promotionLocator != null) {
        @SuppressWarnings("ConstantConditions") final Set<Long> buildChanges =
          getBuildChangeDescriptors(myBuildPromotionFinder.getBuildPromotion(promotionLocator), null)
            .map(mord -> mord.getRelatedVcsChange().getId()).collect(Collectors.toSet());
        result.add(item -> buildChanges.contains(item.getId()));
      }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ProjectFinder.java`
#### Snippet
```java
      // no dimensions found, assume it's a name or internal id or external id
      SProject project = null;
      @SuppressWarnings("ConstantConditions") @NotNull final String singleValue = locator.getSingleValue();
      project = myProjectManager.findProjectByExternalId(singleValue);
      if (project != null) {
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ProjectFinder.java`
#### Snippet
```java

      PermissionFilter(final TypedFinderBuilder.DimensionObjects dimensions) {
        //noinspection ConstantConditions - is checked in a filter condition earlier
        myPermission = dimensions.get(PERMISSION).get(0);
        //noinspection ConstantConditions - is checked in a filter condition earlier
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ProjectFinder.java`
#### Snippet
```java
        //noinspection ConstantConditions - is checked in a filter condition earlier
        myPermission = dimensions.get(PERMISSION).get(0);
        //noinspection ConstantConditions - is checked in a filter condition earlier
        myUsers = dimensions.get(USER).get(0);
      }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/finder/impl/QueuedBuildFinder.java`
#### Snippet
```java
    if (locator.isSingleValue()) {
     // assume it's promotion id
      @SuppressWarnings("ConstantConditions") @NotNull final Long singleValueAsLong = locator.getSingleValueAsLong();
      return getQueuedBuildByPromotionId(singleValueAsLong);
    }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/finder/impl/QueuedBuildFinder.java`
#### Snippet
```java
    if (locator.isSingleValue()) { // assume it's a promotion id
      final Long singleValueAsLong = locator.getSingleValueAsLong();
      //noinspection ConstantConditions
      return myBuildPromotionFinder.getBuildPromotion(singleValueAsLong);
    }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/finder/impl/UserFinder.java`
#### Snippet
```java

      UserPermissionFilter(final TypedFinderBuilder.DimensionObjects dimensions) {
        //noinspection ConstantConditions - is checked in a filter condition earlier
        myPermission = dimensions.get(PERMISSION).get(0);
        List<List<SProject>> projects = dimensions.get(PROJECT);
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/investigations/InvestigationFinder.java`
#### Snippet
```java
    //.setDimension(TYPE, investigation.getType());
    if (investigation.isBuildType()) {
      //noinspection ConstantConditions
      return getLocator((SBuildType)investigation.getBuildTypeRE().getBuildType()); //TeamCity API issue: cast
    } else if (investigation.isProblem()) {
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/investigations/InvestigationFinder.java`
#### Snippet
```java
      return getLocator((SBuildType)investigation.getBuildTypeRE().getBuildType()); //TeamCity API issue: cast
    } else if (investigation.isProblem()) {
      //noinspection ConstantConditions
      return getLocatorForProblem(investigation.getProblemRE().getBuildProblemInfo().getId(), investigation.getProblemRE().getProject());
    } else if (investigation.isTest()) {
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/investigations/InvestigationFinder.java`
#### Snippet
```java
      return getLocatorForProblem(investigation.getProblemRE().getBuildProblemInfo().getId(), investigation.getProblemRE().getProject());
    } else if (investigation.isTest()) {
      //noinspection ConstantConditions
      return getLocatorForTest(investigation.getTestRE().getTestNameId(), investigation.getTestRE().getProject());
    } else {
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/investigations/InvestigationFinder.java`
#### Snippet
```java
      return false;
    }
    @SuppressWarnings("ConstantConditions") @NotNull final BuildProblemResponsibilityEntry problemRE = item.getProblemRE();
    return problemRE.getBuildProblemInfo().getId() == problem.getId();
  }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/investigations/InvestigationWrapper.java`
#### Snippet
```java
  @SuppressWarnings("ConstantConditions")
  @Nullable
  public BuildProject getAssignmentProject() {
    if (isProblem()){
      return getProblemRE().getProject();
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/investigations/InvestigationWrapper.java`
#### Snippet
```java
  @SuppressWarnings("ConstantConditions")
  @Nullable
  public BuildType getAssignmentBuildType() {
    if (isBuildType()){
      return getBuildTypeRE().getBuildType();
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/investigations/InvestigationWrapper.java`
#### Snippet
```java
    ResponsibilityFacadeEx responsibilityFacade = serviceLocator.getSingletonService(ResponsibilityFacadeEx.class);
    if (isBuildType()) {
      //noinspection ConstantConditions
      responsibilityFacade.removeBuildTypeResponsibility(getAssignmentBuildType());
    } else if (isTest()) {
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/investigations/InvestigationWrapper.java`
#### Snippet
```java
      responsibilityFacade.removeBuildTypeResponsibility(getAssignmentBuildType());
    } else if (isTest()) {
      //noinspection ConstantConditions
      responsibilityFacade.removeTestNameResponsibility(getTestRE().getTestName(), getAssignmentProject().getProjectId());
    } else  if (isProblem()) {
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/investigations/InvestigationWrapper.java`
#### Snippet
```java
      responsibilityFacade.removeTestNameResponsibility(getTestRE().getTestName(), getAssignmentProject().getProjectId());
    } else  if (isProblem()) {
      //noinspection ConstantConditions
      responsibilityFacade.removeBuildProblemResponsibility(getProblemRE().getBuildProblemInfo(), getAssignmentProject().getProjectId());
    } else {
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/problem/Orders.java`
#### Snippet
```java
    if (locator.isSingleValue()) {
      // Not null by locator contract
      //noinspection ConstantConditions
      return get(locator.getSingleValue());
    }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/problem/TestOccurrenceFinder.java`
#### Snippet
```java

    // Personal builds always have an owner.
    //noinspection ConstantConditions
    return testRun -> !testRun.getBuild().isPersonal() || currentUser.getId() == testRun.getBuild().getOwner().getId();
  }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/problem/scope/ProblemOccurrencesTreeCollector.java`
#### Snippet
```java
      String subTreeRootId = locator.getSingleDimensionValue(SUB_TREE_ROOT_ID);
      locator.checkLocatorFullyProcessed();
      //noinspection ConstantConditions
      return tree.getFullNodeAndSlicedOrderedSubtree(subTreeRootId, slicingOptions);
    }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/problem/scope/ProblemOccurrencesTreeCollector.java`
#### Snippet
```java

      treeLocator.checkLocatorFullyProcessed();
      //noinspection ConstantConditions
      return tree.getFullNodeAndSlicedOrderedSubtree(subTreeRootId, slicingOptions);
    }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/problem/scope/ProblemOccurrencesTreeCollector.java`
#### Snippet
```java
    if(locator.isAnyPresent(ORDER_BY)) {
      String orderDimension = locator.getSingleDimensionValue(ORDER_BY);
      //noinspection ConstantConditions
      return SUPPORTED_ORDERS.getComparator(orderDimension);
    }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/problem/scope/TestScopeTreeCollector.java`
#### Snippet
```java
      treeLocator.checkLocatorFullyProcessed();

      //noinspection ConstantConditions
      return tree.getFullNodeAndSlicedOrderedSubtree(subTreeRootId, slicingOptions);
    }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/problem/scope/TestScopeTreeCollector.java`
#### Snippet
```java
    if(locator.isAnyPresent(ORDER_BY)) {
      String orderDimension = locator.getSingleDimensionValue(ORDER_BY);
      //noinspection ConstantConditions
      return SUPPORTED_ORDERS.getComparator(orderDimension);
    }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/data/problem/scope/TestScopesCollector.java`
#### Snippet
```java
    if(locator.isAnyPresent(ORDER_BY)) {
      String orderDimension = locator.getSingleDimensionValue(ORDER_BY);
      //noinspection ConstantConditions
      scopes = scopes.sorted(SUPPORTED_ORDERS.getComparator(orderDimension));
    }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/Property.java`
#### Snippet
```java

  public static boolean includeSecureProperties(final @NotNull ServiceLocator serviceLocator) {
    //noinspection ConstantConditions
    return TeamCityProperties.getBoolean("rest.listSecureProperties") &&
           serviceLocator.findSingletonService(PermissionChecker.class).isPermissionGranted(Permission.EDIT_PROJECT, null);
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java

  @SuppressWarnings("ConstantConditions")
  public Build() {
    myBuildPromotion = null;
    myBuild = null;
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  private void checkCanViewRuntimeData() {
    if (!myCanViewRuntimeDataChecked) {
      //noinspection ConstantConditions
      myBeanContext.getServiceLocator().findSingletonService(PermissionChecker.class).checkPermission(Permission.VIEW_BUILD_RUNTIME_DATA, myBuildPromotion);
      myCanViewRuntimeDataChecked = true;
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
          myTriggeringOptions.rebuildDependencies.getFromPosted(serviceLocator.getSingletonService(BuildTypeFinder.class)), source -> {
            if (source.getBuildType() == null) {
              //noinspection ConstantConditions
              throw new BadRequestException("Template is specified instead of a build type. Template id: '" + source.getTemplate().getExternalId() + "'");
            }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
        throw new BadRequestException("Build type creation request should contain project node.");
      }
      //noinspection ConstantConditions
      project = serviceLocator.findSingletonService(ProjectManager.class).findProjectByExternalId(submittedParams.projectId);
      if (project == null) {
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
      }
    } else {
      //noinspection ConstantConditions
      project = submittedParams.project.getProjectFromPosted(serviceLocator.findSingletonService(ProjectFinder.class));
    }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
      }
      try {
        //noinspection ConstantConditions
        List<BuildTypeOrTemplate> templates = submittedParams.templates.getFromPosted(serviceLocator.findSingletonService(BuildTypeFinder.class));
        BuildTypeOrTemplate.setTemplates(buildTypeOrTemplatePatcher.getBuildTypeOrTemplate().getBuildType(), templates, false);
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
      final BuildTypeOrTemplate templateFromPosted;
      try {
        //noinspection ConstantConditions
        templateFromPosted = submittedParams.template.getBuildTypeFromPosted(serviceLocator.findSingletonService(BuildTypeFinder.class));
      } catch (BadRequestException e) {
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java
      }
      final Object optionValue = option.fromString(value);
      //noinspection unchecked
      buildType.get().setOption(option, optionValue);
    }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntityArtifactDep.java`
#### Snippet
```java
      artifactDependency.setCleanDestinationFolder(Boolean.parseBoolean(cleanDir));
    }
    //noinspection SimplifiableConditionalExpression
    return artifactDependency;
  }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitySnapshotDep.java`
#### Snippet
```java
      throw new IllegalArgumentException("No option found for name '" + name + "'");
    }
    //noinspection unchecked
    dependency.setOption(option, option.fromString(value));  //todo: try to provide possible values for ENUM options in error message
  }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntityStep.java`
#### Snippet
```java
    }

    @SuppressWarnings("ConstantConditions")
    final SBuildRunnerDescriptor runnerToCreate =
      buildType.addBuildRunner(StringUtil.isEmpty(name) ? "" : name, type, properties != null ? properties.getMap() : Collections.<String, String>emptyMap());
    return runnerToCreate;
  }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudImage.java`
#### Snippet
```java
    externalArticleName = "Cloud Profile"
)
public class CloudImage {

  @NotNull private final jetbrains.buildServer.clouds.CloudImage myCloudImage;
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudImage.java`
#### Snippet
```java

  @SuppressWarnings("ConstantConditions")
  public CloudImage() {
    myCloudImage = null;
    myFields = null;
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudInstance.java`
#### Snippet
```java
    externalArticleName = "Cloud Profile"
)
public class CloudInstance {

  @NotNull private final CloudInstanceData myCloudInstance;
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudInstance.java`
#### Snippet
```java

  @SuppressWarnings("ConstantConditions")
  public CloudInstance() {
    myCloudInstance = null;
    myFields = null;
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudProfile.java`
#### Snippet
```java
    externalArticleName = "Cloud Profile"
)
public class CloudProfile {

  @NotNull private final jetbrains.buildServer.clouds.CloudProfile myCloudProfile;
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudProfile.java`
#### Snippet
```java

  @SuppressWarnings("ConstantConditions")
  public CloudProfile() {
    myCloudProfile = null;
    myFields = null;
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/files/File.java`
#### Snippet
```java

  @SuppressWarnings({"UnusedDeclaration", "ConstantConditions"})
  public File() {
    fileApiUrlBuilder = null;
    parent = null;
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/health/HealthItem.java`
#### Snippet
```java

  @SuppressWarnings({"ConstantConditions", "unused"})
  public HealthItem() {
    this.identity = null;
    this.severity = null;
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
      return String.valueOf(project.isReadOnly());
    } else if ("parentProjectName".equals(field)) {
      //noinspection ConstantConditions
      return project.getParentProject() == null ? null : project.getParentProject().getName();
    } else if ("parentProjectId".equals(field)) {
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
      return project.getParentProject() == null ? null : project.getParentProject().getName();
    } else if ("parentProjectId".equals(field)) {
      //noinspection ConstantConditions
      return project.getParentProject() == null ? null : project.getParentProject().getExternalId();
    } else if ("parentProjectInternalId".equals(field)) {
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
      return project.getParentProject() == null ? null : project.getParentProject().getExternalId();
    } else if ("parentProjectInternalId".equals(field)) {
      //noinspection ConstantConditions
      return project.getParentProject() == null ? null : project.getParentProject().getProjectId();
    } else if ("status".equals(field)) { //Experimental support
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/request/BuildQueueRequest.java`
#### Snippet
```java
      for (Map.Entry<Build, Exception> buildExceptionEntry : buildsWithErrors.entrySet()) {
        final Build build = buildExceptionEntry.getKey();
        //noinspection ThrowableResultOfMethodCallIgnored
        buildListDetails.append("Not able to add build").append(build.getPromotionIdOfSubmittedBuild() != null ? " with id '" + build.getPromotionIdOfSubmittedBuild() + "'" : "")
                        .append(" to the build queue due to error: ").append(buildExceptionEntry.getValue().toString());
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/request/BuildQueueRequest.java`
#### Snippet
```java
        }
      } catch (Exception e) {
        //noinspection ThrowableResultOfMethodCallIgnored
        buildsWithErrors.put(build, e);
        LOG.debug("Got error trying to add build" + (build.getPromotionIdOfSubmittedBuild() != null ? " with id '" + build.getPromotionIdOfSubmittedBuild() + "'" : "") +
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
    };

    @SuppressWarnings("deprecation") final String mediaType = WebUtil.getMimeType(request, resultIconFileName);
    final Response.ResponseBuilder response = Response.ok(streamingOutput, mediaType).header("Cache-Control", "no-cache, private");
    //see also setting no caching headers in jetbrains.buildServer.server.rest.request.FilesSubResource.getContentByStream()
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/request/ServerRequest.java`
#### Snippet
```java

  @SuppressWarnings("NullableProblems") @Context @NotNull
  private BeanContext myBeanContext;

  @SuppressWarnings("NullableProblems") @Context @NotNull
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/request/ServerRequest.java`
#### Snippet
```java

  @SuppressWarnings("NullableProblems") @Context @NotNull
  private PermissionChecker myPermissionChecker;

  public void initForTests(
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/util/AggregatedBuildArtifactsElementBuilder.java`
#### Snippet
```java
      @Override
      public String getName() {
        //noinspection ConstantConditions
        return myElementName;
      }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/util/AggregatedBuildArtifactsElementBuilder.java`
#### Snippet
```java
      @Override
      public String getFullName() {
        //noinspection ConstantConditions
        return myFullElementName;
      }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/util/BuildTypeOrTemplate.java`
#### Snippet
```java
  @NotNull
  public BuildTypeSettings get(){
    //noinspection ConstantConditions
    return isBuildType() ? myBuildType : myTemplate;
  }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/util/BuildTypeOrTemplate.java`
#### Snippet
```java
  @NotNull
  public BuildTypeSettingsEx getSettingsEx(){
    //noinspection ConstantConditions
    return isBuildType() ? ((BuildTypeEx)myBuildType).getSettings() : ((BuildTypeTemplateEx)myTemplate).getSettings();
  }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/util/BuildTypeOrTemplate.java`
#### Snippet
```java
  @NotNull
  public BuildTypeIdentity getIdentity(){
    //noinspection ConstantConditions
    return isBuildType() ? myBuildType : myTemplate;
  }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/util/BuildTypeOrTemplate.java`
#### Snippet
```java
  @Nullable
  public String getDescription() {
    //noinspection ConstantConditions
    return myBuildType!=null ? myBuildType.getDescription() : myTemplate.getDescription();
  }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/util/BuildTypeOrTemplate.java`
#### Snippet
```java
      myBuildType.setName(value);
    }else{
      //noinspection ConstantConditions
      myTemplate.setName(value);
    }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/util/BuildTypeOrTemplate.java`
#### Snippet
```java
      myBuildType.setDescription(value);
    } else {
      //noinspection ConstantConditions
      myTemplate.setDescription(value);
    }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/util/BuildTypeOrTemplate.java`
#### Snippet
```java

  public boolean isEnabled(final String id) {
    //noinspection ConstantConditions
    return myBuildType != null ? myBuildType.isEnabled(id) : myTemplate.isEnabled(id);
  }
```

### RedundantSuppression
Redundant suppression
in `src/jetbrains/buildServer/server/rest/util/BuildTypeOrTemplate.java`
#### Snippet
```java
  @NotNull
  public List<VcsRootInstanceEntry> getVcsRootInstanceEntries(){
    //noinspection ConstantConditions
    return myBuildType != null ? myBuildType.getVcsRootInstanceEntries() : ((BuildTypeTemplateEx)myTemplate).getVcsRootInstanceEntries(); //TeamCity open API issue
  }
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `src/jetbrains/buildServer/server/rest/model/debug/Sessions.java`
#### Snippet
```java
    }
    try {
      return Long.valueOf(userId);
    } catch (NumberFormatException e) {
      throw new Exception("User id '" + userId + "' parsed from userKeyAttribute '" + userKeyAttribute + "' is not a number.");
```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `src/jetbrains/buildServer/server/rest/data/TimeWithPrecision.java`
#### Snippet
```java
      String numberSubstring = myTimeText.substring(0, myNextUnitStartIndex);
      try {
        return Long.valueOf(numberSubstring);
      } catch (NumberFormatException e) {
        throw new BadRequestException("Could not parse number from '" + numberSubstring + "'");
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `src/jetbrains/buildServer/server/rest/model/agent/AgentPool.java`
#### Snippet
```java
        maxAgents = AgentPoolLimits.DEFAULT.getMaxAgents();
      } else {
        maxAgents = Integer.valueOf(newValue);
      }
      modificationsFound = true;
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
    myDataProvider.checkGlobalPermission(Permission.MANAGE_SERVER_INSTALLATION);
    checkQuery(query);
    final boolean treatAsDataRetrieveQuery = dataRetrieveQuery != null ? Boolean.valueOf(dataRetrieveQuery) : isDataRetrieveQuery(query);
    DumpResultSetProcessor processor;
    if (treatAsDataRetrieveQuery) {
```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
    if (totalTime != null) {
      try {
        totalTimeMs = Long.valueOf(totalTime);
      } catch (NumberFormatException e) {
        totalTimeMs = TimeWithPrecision.getMsFromRelativeTime(totalTime);
```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
    Date limitingDate;
    try {
      limitingDate = new Date(Long.valueOf(dateLocator));
    } catch (NumberFormatException e) {
      limitingDate = myServiceLocator.getSingletonService(TimeCondition.class).getTimeCondition(dateLocator).getLimitingSinceDate();
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
  public String interruptThread(@PathParam("threadLocator") String threadLocator, String interrupted) {
    myDataProvider.checkGlobalPermission(Permission.MANAGE_SERVER_INSTALLATION);
    if (!Boolean.valueOf(interrupted)) {
      throw new BadRequestException("Only \"true\" is supported as the posted value");
    }
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'singleValue != null' covered by subsequent condition 'STATE_ANY.equals(...) \|\| state.equals(...)'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
  private boolean isStateIncluded(@NotNull final Locator stateLocator, @NotNull final String state) {
    final String singleValue = stateLocator.getSingleValue();
    if (singleValue != null && (STATE_ANY.equals(singleValue) || state.equals(singleValue))) {
      return true;
    }
```

### ConditionCoveredByFurtherCondition
Condition 'build != null' covered by subsequent condition 'build instanceof BaseBuild'
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  public static ParametersProvider getStartParametersProvider(@NotNull BuildPromotion buildPromotion, @NotNull ServiceLocator serviceLocator) {
    SBuild build = buildPromotion.getAssociatedBuild();
    if (build != null && build instanceof BaseBuild) {
      try {
        Map<String, String> parameters = ((BaseBuild)build).getBuildStartParameters();
```

### ConditionCoveredByFurtherCondition
Condition 'build == null' covered by subsequent condition '!(build instanceof SFinishedBuild)'
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  @Nullable
  public static jetbrains.buildServer.serverSide.comments.Comment getPinComment(@Nullable final SBuild build) {
    if (build == null || !(build instanceof SFinishedBuild)) return null;
    SFinishedBuild finishedBuild = (SFinishedBuild)build;  //TeamCity API: getPinComment() is only available for finished build, while isPinned is available for running
    final jetbrains.buildServer.serverSide.comments.Comment pinComment = finishedBuild.getPinComment();
```

### ConditionCoveredByFurtherCondition
Condition 'build != null' covered by subsequent condition 'build instanceof BaseBuild'
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  public static ParametersProvider getBuildResultingParameters(@NotNull BuildPromotion buildPromotion, @NotNull ServiceLocator serviceLocator) {
    SBuild build = buildPromotion.getAssociatedBuild();
    if (build != null && build instanceof BaseBuild) {
      try {
        Map<String, String> parameters = ((BaseBuild)build).getBuildFinishParameters();
```

### ConditionCoveredByFurtherCondition
Condition 'agent == null' covered by subsequent condition '!(agent instanceof SBuildAgent)'
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java

    BuildAgent agent = estimates.getAgent();
    if(agent == null || !(agent instanceof SBuildAgent) || (agent instanceof BuildAgentEx && ((BuildAgentEx) agent).isFakeAgent())) {
      return null;
    }
```

## RuleId[id=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/jetbrains/buildServer/server/rest/model/buildType/VCSLabelingOptions.java`
#### Snippet
```java
@SuppressWarnings("PublicField")
@XmlRootElement(name="vcsLabeling")
public class VCSLabelingOptions {
  @XmlAttribute(name = "labelName")
  public String labelName;
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/jetbrains/buildServer/server/rest/model/buildType/Investigation.java`
#### Snippet
```java
   * @deprecated
   */
  @XmlElement public User responsible;

  public Investigation() {
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/jetbrains/buildServer/server/rest/request/ChangeRequest.java`
#### Snippet
```java
  @Path("/{changeLocator}/vcsRoot")
  @Produces({"application/xml", "application/json"})
  public VcsRootInstance getChangeVCSRoot(@ApiParam(format = LocatorName.CHANGE) @PathParam("changeLocator") String changeLocator,
                                          @QueryParam("fields") String fields) {
    return getChangeVCSRootInstance(changeLocator, fields);
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/jetbrains/buildServer/server/rest/model/buildType/ProblemScope.java`
#### Snippet
```java
   * @deprecated
   */
  @XmlElement public BuildType buildType;

  public ProblemScope() {
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/jetbrains/buildServer/server/rest/model/change/Change.java`
#### Snippet
```java
   */
  @XmlAttribute
  public String getUsername() {
    return ValueWithDefault.decideDefault(myFields.isIncluded("username"), myModification.getUserName());
  }
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/jetbrains/buildServer/server/rest/model/change/Change.java`
#### Snippet
```java
   */
  @XmlElement(name = "user")
  public User getUser() {
    return ValueWithDefault.decideDefault(myFields.isIncluded("user", false), () -> {
      final Collection<SUser> users = myModification.getCommitters();
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
  @Path("/vcsCheckingForChangesQueue")
  @Produces({"application/xml", "application/json"})
  public VcsRootInstances scheduleCheckingForChanges(@QueryParam("locator") final String vcsRootInstancesLocator,
                                                     @QueryParam("requestor") final String requestor,
                                                     @QueryParam("fields") final String fields,
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
  @Path("/{buildLocator}/related-issues")
  @Produces({"application/xml", "application/json"})
  public IssueUsages serveBuildRelatedIssuesOld(@ApiParam(format = LocatorName.BUILD) @PathParam("buildLocator") String buildLocator,
                                                @QueryParam("fields") String fields) {
    return serveBuildRelatedIssues(buildLocator, fields);
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
  @Path("/{buildLocator}/pin/")
  @Consumes({"text/plain"})
  public void unpinBuild(@ApiParam(format = LocatorName.BUILD) @PathParam("buildLocator") String buildLocator,
                         String comment,
                         @Context HttpServletRequest request) {
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
  @Path("/{buildLocator}/pin/")
  @Consumes({"text/plain"})
  public void pinBuild(@ApiParam(format = LocatorName.BUILD) @PathParam("buildLocator") String buildLocator,
                       String comment,
                       @Context HttpServletRequest request) {
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
  @Path("/{buildLocator}/pin/")
  @Produces({"text/plain"})
  public String getPinned(@ApiParam(format = LocatorName.BUILD) @PathParam("buildLocator") String buildLocator,
                          @Context HttpServletRequest request) {
    SBuild build = myBuildFinder.getBuild(null, buildLocator);
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
  @ApiOperation(value = "deleteBuilds", hidden = true)
  @Produces({"application/xml", "application/json"})
  public void deleteBuilds(@ApiParam(format = LocatorName.BUILD) @QueryParam("locator") String locator,
                           @Context HttpServletRequest request) {
    if (locator == null) {
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
  @Consumes({"application/xml", "application/json"})
  @Produces({"application/xml", "application/json"})
  public VCSLabelingOptions setVCSLabelingOptions(@ApiParam(format = LocatorName.BUILD_TYPE) @PathParam("btLocator") String buildTypeLocator,
                                                  VCSLabelingOptions options) {
    final BuildTypeOrTemplate buildType = myBuildTypeFinder.getBuildTypeOrTemplate(null, buildTypeLocator, true);
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
  @Path("/{btLocator}/vcsLabeling")
  @Produces({"application/xml", "application/json"})
  public VCSLabelingOptions getVCSLabelingOptions(@ApiParam(format = LocatorName.BUILD_TYPE) @PathParam("btLocator") String buildTypeLocator) {
    throw new BadRequestException("VCS labeling configuration is moved to build features settings." +
                                  " List build features of type '" + VcsLabelingBuildFeature.VCS_LABELING_TYPE + "' to get VCS labeling settings.");
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
   */
  @XmlAttribute
  public String parentProjectName;

  /**
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
   */
  @XmlAttribute
  public String parentProjectInternalId;


```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
   */
  @XmlAttribute
  public Integer getPercentageComplete() {
    return ValueWithDefault.decideDefault(myFields.isIncluded("percentageComplete"), () -> {
      if (myBuild == null || myBuild.isFinished()) {
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
   */
  @XmlAttribute
  public Boolean isRunning() {
    return ValueWithDefault.decideDefault(myFields.isIncluded("running", false, false), () -> myBuild != null && !myBuild.isFinished());
  }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/jetbrains/buildServer/server/rest/request/ServerRequest.java`
#### Snippet
```java
          nodeIdPart = "_" + CurrentNodeInfo.getNodeId().toLowerCase();
        }
        return "server_" + nodeIdPart + areaId + (StringUtil.isEmpty(path) ? "" : "-" + path.replaceAll("[^a-zA-Z0-9-#.]+", "_"));
      }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/jetbrains/buildServer/server/rest/request/VcsRootInstanceRequest.java`
#### Snippet
```java
      @Override
      public String getArchiveName(@NotNull final String path) {
        return rootInstance.getName().replaceAll(" ", "").replaceAll("::", "_").replaceAll("[^a-zA-Z0-9-#.]+", "_") + path.replaceAll("[^a-zA-Z0-9-#.]+", "_");
      }
    }, urlPrefix, myBeanContext, false);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/jetbrains/buildServer/server/rest/request/FilesSubResource.java`
#### Snippet
```java
    @NotNull
    public String getArchiveName(@NotNull final String path) {
      return path.replaceAll("[^a-zA-Z0-9-#.]+", "_");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/jetbrains/buildServer/server/rest/model/Util.java`
#### Snippet
```java
    String result = WebUtil.encode(value);
    //make it more readable by not encoding common characters which regularly work in the clients and on the server
    result = result.replace("%24", "$")
                   .replace("%28", "(")
                   .replace("%29", ")")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/jetbrains/buildServer/server/rest/model/Util.java`
#### Snippet
```java
    //make it more readable by not encoding common characters which regularly work in the clients and on the server
    result = result.replace("%24", "$")
                   .replace("%28", "(")
                   .replace("%29", ")")
                   .replace("%3A", ":")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/jetbrains/buildServer/server/rest/model/Util.java`
#### Snippet
```java
    result = result.replace("%24", "$")
                   .replace("%28", "(")
                   .replace("%29", ")")
                   .replace("%3A", ":")
                   .replace("%2C", ",");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/jetbrains/buildServer/server/rest/model/Util.java`
#### Snippet
```java
                   .replace("%28", "(")
                   .replace("%29", ")")
                   .replace("%3A", ":")
                   .replace("%2C", ",");
    return result;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/jetbrains/buildServer/server/rest/model/Util.java`
#### Snippet
```java
                   .replace("%29", ")")
                   .replace("%3A", ":")
                   .replace("%2C", ",");
    return result;
  }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/jetbrains/buildServer/server/rest/swagger/ExtensionModelResolver.java`
#### Snippet
```java
    if (fullyQualifiedName.startsWith(MODEL_PACKAGE)) {
      String packageName = fullyQualifiedName.
          replace(MODEL_PACKAGE, "").
          replace(shortName, "");
      StringUtils.strip(packageName, "."); // remove leading and trailing dots
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/files/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.files;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/files/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.files;
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest.model.user` is unnecessary and can be removed
in `src/jetbrains/buildServer/server/rest/data/DataUpdater.java`
#### Snippet
```java
  }

  public SUser createUser(@NotNull final jetbrains.buildServer.server.rest.model.user.User userData) {
    myDataProvider.checkGlobalPermission(jetbrains.buildServer.serverSide.auth.Permission.CREATE_USER);

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/debug/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.debug;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/debug/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.debug;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/group/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.group;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/group/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.group;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/federation/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.federation;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/federation/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.federation;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/build/downloadedArtifacts/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.build.downloadedArtifacts;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/build/downloadedArtifacts/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.build.downloadedArtifacts;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
          property.addTo(new BuildTypeRequest.BuildTypeSettingsEntityWithParams(buildTypeOrTemplatePatcher.getBuildTypeOrTemplate()), serviceLocator);
          result = true;
        } catch (java.lang.UnsupportedOperationException e) {  //can be thrown from EditableBuildTypeCopy
          LOG.debug("Error setting property '" + property.name + "' to value '" + property.value + "': " + e.getMessage());
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/build/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.build;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/build/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.build;
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.graphql.model` is unnecessary and can be removed
in `src/jetbrains/buildServer/server/graphql/resolver/CloudImageResolver.java`
#### Snippet
```java
  }

  public DataFetcherResult<jetbrains.buildServer.server.graphql.model.AgentType> agentType(@NotNull CloudImage image) {
    DataFetcherResult.Builder<jetbrains.buildServer.server.graphql.model.AgentType> result = DataFetcherResult.newResult();

```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.graphql.model` is unnecessary and can be removed
in `src/jetbrains/buildServer/server/graphql/resolver/CloudImageResolver.java`
#### Snippet
```java

  public DataFetcherResult<jetbrains.buildServer.server.graphql.model.AgentType> agentType(@NotNull CloudImage image) {
    DataFetcherResult.Builder<jetbrains.buildServer.server.graphql.model.AgentType> result = DataFetcherResult.newResult();

    SAgentType agentType = findAgentType(image);
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.graphql.model` is unnecessary and can be removed
in `src/jetbrains/buildServer/server/graphql/resolver/CloudImageResolver.java`
#### Snippet
```java
    }

    return result.data(new jetbrains.buildServer.server.graphql.model.AgentType(agentType)).build();
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/jetbrains/buildServer/server/rest/jersey/UrlBuilderProvider.java`
#### Snippet
```java
@Component
@Provider
public class UrlBuilderProvider implements InjectableProvider<Context, java.lang.reflect.Type>, Injectable<ApiUrlBuilder> {
  private final RequestPathTransformInfo myRequestPathTransformInfo;

```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest.errors` is unnecessary and can be removed
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   *
   * @param dimensionName the name of the dimension to extract value.   @return empty collection if no such dimension is found, values of the dimension otherwise.
   * @throws jetbrains.buildServer.server.rest.errors.LocatorProcessException if there are more then a single dimension definition for a 'dimensionName' name or the dimension has no value specified.
   */
  @NotNull
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest.errors` is unnecessary and can be removed
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   *
   * @param dimensionName the name of the dimension to extract value.   @return 'null' if no such dimension is found, value of the dimension otherwise.
   * @throws jetbrains.buildServer.server.rest.errors.LocatorProcessException if there are more then a single dimension definition for a 'dimensionName' name or the dimension has no value specified.
   */
  @Nullable
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest` is unnecessary and can be removed
in `src/jetbrains/buildServer/server/rest/RESTControllerExtensionAdapter.java`
#### Snippet
```java

/**
 * @see jetbrains.buildServer.server.rest.RESTControllerExtension
 * @author Yegor.Yarko
 *         Date: 03.08.2010
```

### UnnecessaryFullyQualifiedName
Qualifier `com.sun.jersey.api` is unnecessary and can be removed
in `src/jetbrains/buildServer/server/rest/errors/JerseyParamExceptionExceptionMapper.java`
#### Snippet
```java
public class JerseyParamExceptionExceptionMapper extends ExceptionMapperBase<ParamException> {
  @Override
  public ResponseData getResponseData(@NotNull final com.sun.jersey.api.ParamException e) {
    return new ResponseData(Response.Status.BAD_REQUEST, "Error processing request parameter '" + e.getParameterName() + "'. Check supported formats.");
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest.model.problem.scope` is unnecessary and can be removed
in `src/jetbrains/buildServer/server/rest/request/ProblemOccurrenceRequest.java`
#### Snippet
```java
    List<ScopeTree.Node<BuildProblem, ProblemOccurrencesTreeCollector.ProblemCounters>> tree = myProblemOccurrencesTreeCollector.getTree(new Locator(locatorText));

    return new jetbrains.buildServer.server.rest.model.problem.scope.ProblemOccurrencesTree(tree, new Fields(fields), myBeanContext);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest.model.plugin` is unnecessary and can be removed
in `src/jetbrains/buildServer/server/rest/model/plugin/PluginInfos.java`
#### Snippet
```java

  @XmlElement(name = "plugin")
  public List<jetbrains.buildServer.server.rest.model.plugin.PluginInfo> plugins;

  public PluginInfos() {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/role/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.role;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/role/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.role;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/issue/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.issue;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/issue/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.issue;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/audit/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.audit;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/audit/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.audit;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/change/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.change;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/change/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.change;
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.graphql.model` is unnecessary and can be removed
in `src/jetbrains/buildServer/server/graphql/model/connections/agent/CloudImageInstancesConnection.java`
#### Snippet
```java

  @NotNull
  private final PaginatingConnection<SBuildAgent, jetbrains.buildServer.server.graphql.model.Agent, AgentEdge> myDelegate;

  public CloudImageInstancesConnection(@NotNull List<SBuildAgent> data, @NotNull PaginationArguments paginationArguments) {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/changeLog/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.changeLog;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/changeLog/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.changeLog;
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest` is unnecessary and can be removed
in `src/jetbrains/buildServer/server/rest/RESTControllerExtension.java`
#### Snippet
```java
 * @author Yegor.Yarko
 *         Date: 01.08.2010
 * @see jetbrains.buildServer.server.rest.RESTControllerExtensionAdapter
 */
public interface RESTControllerExtension extends ServerExtension {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/user/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.user;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/user/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.user;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/problem/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.problem;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/problem/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.problem;
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest.model.metrics` is unnecessary and can be removed
in `src/jetbrains/buildServer/server/rest/model/metrics/MetricValues.java`
#### Snippet
```java
      () -> {
        Fields nestedFields = fields.getNestedField("metricValues");
        final List<jetbrains.buildServer.server.rest.model.metrics.MetricValue> result = new ArrayList<>();
        for (MetricValueKey key : valuesMap.keySet()) {
          result.add(new jetbrains.buildServer.server.rest.model.metrics.MetricValue(key, valuesMap.get(key), nestedFields));
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest.model.metrics` is unnecessary and can be removed
in `src/jetbrains/buildServer/server/rest/model/metrics/MetricValues.java`
#### Snippet
```java
        final List<jetbrains.buildServer.server.rest.model.metrics.MetricValue> result = new ArrayList<>();
        for (MetricValueKey key : valuesMap.keySet()) {
          result.add(new jetbrains.buildServer.server.rest.model.metrics.MetricValue(key, valuesMap.get(key), nestedFields));
        }
        return result;
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest.model.problem.scope` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/request/TestScopesRequest.java`
#### Snippet
```java
   * Get horizontally sliced tree containing projects and build configurations which are relevant to test runs satisfying given locator
   */
  public jetbrains.buildServer.server.rest.model.problem.scope.TestScopeTree serveScopesTreeTopSlice(@QueryParam("locator") String locatorText,
                                                                                                     @QueryParam("fields") String fields) {
    List<ScopeTree.Node<STestRun, TestCountersData>> treeNodes = myTestScopeTreeCollector.getTopSlicedTree(Locator.locator(locatorText));
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest.model.problem.scope` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/request/TestScopesRequest.java`
#### Snippet
```java
    List<ScopeTree.Node<STestRun, TestCountersData>> treeNodes = myTestScopeTreeCollector.getTopSlicedTree(Locator.locator(locatorText));

    return new jetbrains.buildServer.server.rest.model.problem.scope.TestScopeTree(treeNodes, new Fields(fields), myBeanContext);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest.model.problem.scope` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/request/TestScopesRequest.java`
#### Snippet
```java
  @Produces({"application/xml", "application/json"})
  @ApiOperation(hidden = true, value = "highly experimental")
  public jetbrains.buildServer.server.rest.model.problem.scope.TestScopeTree serveScopesTree(@QueryParam("locator") String locatorText,
                                    @QueryParam("fields") String fields) {
    List<ScopeTree.Node<STestRun, TestCountersData>> treeNodes = myTestScopeTreeCollector.getSlicedTree(Locator.locator(locatorText));
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest.model.problem.scope` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/request/TestScopesRequest.java`
#### Snippet
```java
    List<ScopeTree.Node<STestRun, TestCountersData>> treeNodes = myTestScopeTreeCollector.getSlicedTree(Locator.locator(locatorText));

    return new jetbrains.buildServer.server.rest.model.problem.scope.TestScopeTree(treeNodes, new Fields(fields), myBeanContext);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest.model.server` is unnecessary and can be removed
in `src/jetbrains/buildServer/server/rest/model/server/LicensingData.java`
#### Snippet
```java

  /**
   * See also {@link jetbrains.buildServer.server.rest.model.server.LicenseKeyEntity#getLicenseType(jetbrains.buildServer.serverSide.LicenseKey)}
   */
  private LicenseType getServerLicenseType(final LicenseList licenseList) {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/problem/scope/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.problem.scope;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/problem/scope/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.problem.scope;
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest.request` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildFinder.java`
#### Snippet
```java
      buildsFilter.setCount(c != -1 ? c : null);
    } else {
      buildsFilter.setCount(jetbrains.buildServer.server.rest.request.Constants.getDefaultPageItemsCount());
    }
    return buildsFilter;
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest.request` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildFinder.java`
#### Snippet
```java
      buildsFilter.setCount(c != -1 ? c : null);
    } else {
      buildsFilter.setCount(jetbrains.buildServer.server.rest.request.Constants.getDefaultPageItemsCount());
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest.model.server` is unnecessary and can be removed
in `src/jetbrains/buildServer/server/rest/model/server/LicenseKeyEntity.java`
#### Snippet
```java

  /**
   * See also {@link jetbrains.buildServer.server.rest.model.server.LicensingData#getServerLicenseType(jetbrains.buildServer.serverSide.LicenseList)}
   */
  
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/agent/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.agent;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/agent/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.agent;
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest.model.build` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
           .valueForDefaultFilter(triggeredBy -> Collections.singleton(triggeredBy.getUser()));
    builder.dimensionValueCondition(new TypedFinderBuilder.Dimension<>("type")).description("type of the trigger")
           .valueForDefaultFilter(item -> jetbrains.buildServer.server.rest.model.build.TriggeredBy.getDetails(item, serviceLocator).type);
    return builder.build();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest.model.files` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/request/FilesSubResource.java`
#### Snippet
```java
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @ApiOperation(value = "Get metadata of specific file.", nickname = "getFileMetadata")
  public jetbrains.buildServer.server.rest.model.files.File getMetadata(@PathParam("path") final String path,
                                                                        @QueryParam("fields") String fields,
                                                                        @Context HttpServletRequest request) {
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest.model.files` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/request/FilesSubResource.java`
#### Snippet
```java
                                                                        @Context HttpServletRequest request) {
    final Element element = myProvider.getElement(myProvider.preprocess(StringUtil.removeLeadingSlash(path)));
    return new jetbrains.buildServer.server.rest.model.files.File(element, getParent(element), fileApiUrlBuilder(null, myUrlPrefix), new Fields(fields), myBeanContext);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/Entries.java`
#### Snippet
```java
  }

  public Entries(@NotNull final java.util.Map<String, String> propertiesP, final @NotNull Fields fields) {
    this.count = ValueWithDefault.decideIncludeByDefault(fields.isIncluded("count"), propertiesP.size());
    Fields entryFields = fields.getNestedField("entry");
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/Entries.java`
#### Snippet
```java
        }
      });
      for (java.util.Map.Entry<String, String> prop : propertiesP.entrySet()) {
        entries.add(new Entry(prop.getKey(), prop.getValue(), entryFields));
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/Entries.java`
#### Snippet
```java

  @NotNull
  public java.util.Map<String, String> getMap() {
    if (entries == null) return new HashMap<>();
    final HashMap<String, String> result = new HashMap<String, String>(entries.size());
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java

  @NotNull
  public static ArtifactTreeElement getItem(@NotNull final java.io.File rootPath, @NotNull final String path, @NotNull final String where,
                                            final @NotNull ServiceLocator serviceLocator) {
    // does not work for archives so far...
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/buildType/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.buildType;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/buildType/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.buildType;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/health/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.health;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/health/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.health;
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest.request` is unnecessary and can be removed
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
  /**
   * Serves a build described by the locator provided searching through those accessible by the current user.
   * See {@link jetbrains.buildServer.server.rest.request.BuildRequest#serveAllBuilds}
   * If several builds are matched, the first one is used (the effect is the same as if ",count:1" locator dimension is added)
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/plugin/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.plugin;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/plugin/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.plugin;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/nodes/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.nodes;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/nodes/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.nodes;
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.graphql.model.agentPool` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/graphql/resolver/agentPool/AgentPoolMutation.java`
#### Snippet
```java
    return result.data(new MoveCloudImageToAgentPoolPayload(
      new CloudImage(image, profile),
      new jetbrains.buildServer.server.graphql.model.agentPool.AgentPool(sourcePool),
      new jetbrains.buildServer.server.graphql.model.agentPool.AgentPool(targetPool)
    )).build();
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.graphql.model.agentPool` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/graphql/resolver/agentPool/AgentPoolMutation.java`
#### Snippet
```java
      new CloudImage(image, profile),
      new jetbrains.buildServer.server.graphql.model.agentPool.AgentPool(sourcePool),
      new jetbrains.buildServer.server.graphql.model.agentPool.AgentPool(targetPool)
    )).build();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.graphql.model.agentPool` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/graphql/resolver/agentPool/AgentPoolMutation.java`
#### Snippet
```java

    AgentPool updatedTargetPool = myAgentPoolManager.findAgentPoolById(input.getTargetAgentPoolRawId()); // should not be null at this stage
    BulkMoveAgentToAgentsPoolPayload payload = new BulkMoveAgentToAgentsPoolPayload(agents, new jetbrains.buildServer.server.graphql.model.agentPool.AgentPool(updatedTargetPool));
    return result.data(payload).build();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.graphql.model.agentPool` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/graphql/resolver/agentPool/AgentPoolMutation.java`
#### Snippet
```java
    } catch (AgentPoolCannotBeRenamedException e) {
      LOG.debug(e);
      return result.data(new UpdateAgentPoolPayload(new jetbrains.buildServer.server.graphql.model.agentPool.AgentPool(poolOfInterest)))
                   .error(new OperationFailedGraphQLError(e.getMessage()))
                   .build();
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.graphql.model.agentPool` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/graphql/resolver/agentPool/AgentPoolMutation.java`
#### Snippet
```java
    }

    result.data(new UpdateAgentPoolPayload(new jetbrains.buildServer.server.graphql.model.agentPool.AgentPool(updatedPool)));

    return result.build();
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.graphql.model.agentPool` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/graphql/resolver/agentPool/AgentPoolMutation.java`
#### Snippet
```java
    return result.data(new AssignProjectWithAgentPoolPayload(
      new Project(project),
      new jetbrains.buildServer.server.graphql.model.agentPool.AgentPool(agentPool)
    )).build();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.graphql.model.agentPool` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/graphql/resolver/agentPool/AgentPoolMutation.java`
#### Snippet
```java
    return result.data(new UnassignProjectFromAgentPoolPayload(
      new Project(project),
      new jetbrains.buildServer.server.graphql.model.agentPool.AgentPool(agentPool)
    )).build();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.graphql.model.agentPool` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/graphql/resolver/agentPool/AgentPoolMutation.java`
#### Snippet
```java
    });

    return result.data(new BulkMoveCloudImagesToAgentPoolPayload(cloudImages, new jetbrains.buildServer.server.graphql.model.agentPool.AgentPool(targetPool)))
                 .build();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.graphql.model.agentPool` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/graphql/resolver/agentPool/AgentPoolMutation.java`
#### Snippet
```java
    }

    return result.data(new BulkAssignProjectWithAgentPoolPayload(new jetbrains.buildServer.server.graphql.model.agentPool.AgentPool(agentPool))).build();
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.graphql.model.agentPool` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/graphql/resolver/agentPool/AgentPoolMutation.java`
#### Snippet
```java
    return result.data(new MoveAgentToAgentPoolPayload(
      new Agent(agent),
      sourcePool == null ? null : new jetbrains.buildServer.server.graphql.model.agentPool.AgentPool(sourcePool),
      targetPool == null ? null : new jetbrains.buildServer.server.graphql.model.agentPool.AgentPool(targetPool)
    )).build();
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.graphql.model.agentPool` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/graphql/resolver/agentPool/AgentPoolMutation.java`
#### Snippet
```java
      new Agent(agent),
      sourcePool == null ? null : new jetbrains.buildServer.server.graphql.model.agentPool.AgentPool(sourcePool),
      targetPool == null ? null : new jetbrains.buildServer.server.graphql.model.agentPool.AgentPool(targetPool)
    )).build();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.graphql.model.agentPool` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/graphql/resolver/agentPool/AgentPoolMutation.java`
#### Snippet
```java
      }

      result.data(new CreateAgentPoolPayload(new jetbrains.buildServer.server.graphql.model.agentPool.AgentPool(resultPool)));
    } catch (AgentPoolCannotBeRenamedException e) {
      LOG.debug(e);
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.restcontrib.cctray.model;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.restcontrib.cctray.model;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/metrics/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.metrics;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/metrics/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.metrics;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/project/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.project;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/project/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.project;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/server/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.server;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/server/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.server;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/cloud/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.cloud;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `src/jetbrains/buildServer/server/rest/model/cloud/package-info.java`
#### Snippet
```java
 */

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
package jetbrains.buildServer.server.rest.model.cloud;
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.server.rest.model.user` is unnecessary and can be removed
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java

  @XmlElement(name = "user")
  public jetbrains.buildServer.server.rest.model.user.User getPersonalBuildUser() {
    return ValueWithDefault.decideDefault(myFields.isIncluded("user", false), () -> {
      final SUser owner = myBuildPromotion.getOwner();
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator does not return 0 for equal elements
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
    public int compare(final BuildPromotion o1, final BuildPromotion o2) {
      final int buildTypesCompare = o1.getBuildTypeId().compareTo(o2.getBuildTypeId());
      return buildTypesCompare != 0 ? buildTypesCompare : (int)(o1.getId() - o2.getId());
    }
  }
```

### ComparatorMethodParameterNotUsed
Comparator does not return 0 for equal elements
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
    public int compare(final SBuild o1, final SBuild o2) {
      final int buildTypesCompare = o1.getBuildTypeId().compareTo(o2.getBuildTypeId());
      return buildTypesCompare != 0 ? buildTypesCompare : (int)(o1.getBuildId() - o2.getBuildId());
    }
  }
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `ChangeLogGraphVertex()` of an abstract class should not be declared 'public'
in `src/jetbrains/buildServer/server/rest/model/changeLog/ChangeLogGraphVertex.java`
#### Snippet
```java
  private final V myVertex;

  public ChangeLogGraphVertex(V vertex) {
    myVertex = vertex;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `DefaultFilesProvider()` of an abstract class should not be declared 'public'
in `src/jetbrains/buildServer/server/rest/model/files/Files.java`
#### Snippet
```java
    @Nullable protected List<? extends Element> myItems;

    public DefaultFilesProvider(@NotNull final FileApiUrlBuilder builder, @NotNull final BeanContext beanContext) {
      myBuilder = builder;
      myBeanContext = beanContext;
```

### NonProtectedConstructorInAbstractClass
Constructor `UserParametersHolderEntityWithParameters()` of an abstract class should not be declared 'public'
in `src/jetbrains/buildServer/server/rest/data/parameters/UserParametersHolderEntityWithParameters.java`
#### Snippet
```java
  @NotNull private final UserParametersHolder myEntity;

  public UserParametersHolderEntityWithParameters(@NotNull final UserParametersHolder entity) {
    myEntity = entity;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractScopeTree()` of an abstract class should not be declared 'public'
in `src/jetbrains/buildServer/server/rest/model/problem/scope/AbstractScopeTree.java`
#### Snippet
```java
  private BeanContext myContext;

  public AbstractScopeTree() { }

  public AbstractScopeTree(@NotNull List<ScopeTree.Node<DATA, COUNTERS>> sourceNodes, @NotNull Fields fields, @NotNull BeanContext context) {
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractScopeTree()` of an abstract class should not be declared 'public'
in `src/jetbrains/buildServer/server/rest/model/problem/scope/AbstractScopeTree.java`
#### Snippet
```java
  public AbstractScopeTree() { }

  public AbstractScopeTree(@NotNull List<ScopeTree.Node<DATA, COUNTERS>> sourceNodes, @NotNull Fields fields, @NotNull BeanContext context) {
    myNodes = sourceNodes;
    myFields = fields;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractFinder()` of an abstract class should not be declared 'public'
in `src/jetbrains/buildServer/server/rest/data/finder/AbstractFinder.java`
#### Snippet
```java
  private String[] myHiddenDimensions = new String[]{};

  public AbstractFinder(@NotNull final String... knownDimensions) {
    setDataBinding(this);
    myKnownDimensions = ArrayUtils.addAll(knownDimensions);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractLeaf()` of an abstract class should not be declared 'public'
in `src/jetbrains/buildServer/server/rest/model/problem/scope/AbstractLeaf.java`
#### Snippet
```java
  }

  public AbstractLeaf(@NotNull ScopeTree.Node<DATA, COUNTERS> node, @NotNull Fields fields, @NotNull BeanContext beanContext) {
    myNode = node;
    myFields = fields;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractLeaf()` of an abstract class should not be declared 'public'
in `src/jetbrains/buildServer/server/rest/model/problem/scope/AbstractLeaf.java`
#### Snippet
```java
  protected ScopeTree.Node<DATA, COUNTERS> myNode;

  public AbstractLeaf() {
  }

```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractAgentPool()` of an abstract class should not be declared 'public'
in `src/jetbrains/buildServer/server/graphql/model/agentPool/AbstractAgentPool.java`
#### Snippet
```java
  private final jetbrains.buildServer.serverSide.agentPools.AgentPool myRealPool;

  public AbstractAgentPool(@NotNull jetbrains.buildServer.serverSide.agentPools.AgentPool realPool) {
    myRealPool = realPool;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `BranchData()` of an abstract class should not be declared 'public'
in `src/jetbrains/buildServer/server/rest/data/BranchData.java`
#### Snippet
```java
  @NotNull private final String myBranchName;

  public BranchData(@NotNull final String branchName) {
    myBranchName = branchName;
  }
```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new ValueWithDefault.Value() can be replaced with method reference
in `src/jetbrains/buildServer/server/rest/model/issue/IssueUsage.java`
#### Snippet
```java
  @XmlElement(defaultValue = "")
  public Changes getChanges() {
    return ValueWithDefault.decideDefault(myFields.isIncluded("changes", false), new ValueWithDefault.Value<Changes>() {
      @Nullable
      public Changes get() {
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `src/jetbrains/buildServer/server/rest/data/finder/impl/UserFinder.java`
#### Snippet
```java
      } else {
        Set<RoleScope> scopes = roleScopes.get(role);
        if (scopes == null) {
          scopes = new HashSet<>();
          roleScopes.put(role, scopes);
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `src/jetbrains/buildServer/server/rest/data/build/TagFinder.java`
#### Snippet
```java

    final ArrayList<TagData> result = new ArrayList<TagData>(myBuildPromotion.getTagDatas());
    Collections.sort(result, new Comparator<TagData>() {
      public int compare(final TagData o1, final TagData o2) {
        if (o1 == o2) return 0;
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `src/jetbrains/buildServer/server/rest/data/build/GenericBuildsFilter.java`
#### Snippet
```java
      myAgents = null;
    } else {
      myAgents = new TreeSet<SBuildAgent>(new Comparator<SBuildAgent>() {
        public int compare(final SBuildAgent o1, final SBuildAgent o2) {
          if (o1.getId() == -1) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
    final boolean forceParentAttributes = TeamCityProperties.getBoolean("rest.beans.project.addParentProjectAttributes");
    parentProjectName = ValueWithDefault.decideDefault(forceParentAttributes || fields.isIncluded("parentProjectName", false, false),
                                                       () -> Util.resolveNull(actualParentProject.get(), new Function<SProject, String>() {
                                                         @Override
                                                         public String apply(final SProject v) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
                                                       }));
    parentProjectInternalId = ValueWithDefault.decideDefault(forceParentAttributes || fields.isIncluded("parentProjectInternalId", includeInternal, includeInternal),
                                                             () -> Util.resolveNull(actualParentProject.get(), new Function<SProject, String>() {
                                                               @Override
                                                               public String apply(final SProject v) {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `project`
in `src/jetbrains/buildServer/server/rest/data/CloudUtil.java`
#### Snippet
```java
        return true;
      }
      project = project.getParentProject();
    }
    return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `parentProject`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ProjectFinder.java`
#### Snippet
```java
    final ArrayList<SProject> result = new ArrayList<SProject>();
    if (parentProject == null) {
      parentProject = getRootProject();
      if (name.equals(parentProject.getName())) { //process root project as well
        result.add(parentProject);
```

### AssignmentToMethodParameter
Assignment to method parameter `buildType`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildFinder.java`
#### Snippet
```java

    String buildTypeLocator = locator.getSingleDimensionValue("buildType");
    buildType = myBuildTypeFinder.deriveBuildTypeFromLocator(buildType, buildTypeLocator);

    Long id = locator.getSingleDimensionValueAsLong(DIMENSION_ID);
```

### AssignmentToMethodParameter
Assignment to method parameter `projects`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java
  private BuildTypeOrTemplate findBuildTypebyName(@NotNull final String name, @Nullable List<SProject> projects, final Boolean isTemplate) {
    if (projects == null) {
      projects = myProjectManager.getProjects();
    }
    BuildTypeOrTemplate firstFound = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `project`
in `src/jetbrains/buildServer/server/rest/data/problem/ProblemFinder.java`
#### Snippet
```java
  private Set<ProblemWrapper> getCurrentProblemsList(@Nullable SProject project) {
    if (project == null){
      project = myProjectManager.getRootProject();
    }
    final List<BuildProblem> currentBuildProblemsList = myBuildProblemManager.getCurrentBuildProblemsList(project);
```

### AssignmentToMethodParameter
Assignment to method parameter `project`
in `src/jetbrains/buildServer/server/rest/data/problem/ProblemOccurrenceFinder.java`
#### Snippet
```java
  private List<BuildProblem> getCurrentProblemOccurences(@Nullable SProject project) {
    if (project == null) {
      project = myProjectManager.getRootProject();
    }
    return fillIsNew(myBuildProblemManager.getCurrentBuildProblemsList(project), null);
```

### AssignmentToMethodParameter
Assignment to method parameter `sinceBuildId`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java

    if (sinceBuildPromotion != null) {
      sinceBuildId = sinceBuildId != null ? Math.max(sinceBuildId, getBuildId(sinceBuildPromotion)) : getBuildId(sinceBuildPromotion);
      final SBuild sinceBuild = sinceBuildPromotion.getAssociatedBuild();
      if (sinceBuild != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `sinceStartDate`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
      final SBuild sinceBuild = sinceBuildPromotion.getAssociatedBuild();
      if (sinceBuild != null) {
        sinceStartDate = TimeCondition.maxDate(sinceStartDate, sinceBuild.getStartDate());
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `expirationTime`
in `src/jetbrains/buildServer/server/rest/model/user/Token.java`
#### Snippet
```java
  public void setExpirationTime(@Nullable Date expirationTime) {
    if (expirationTime == null) {
      expirationTime = new Date(PermanentTokenConstants.NO_EXPIRE.getTime());
    }
    final Date currentDate = new Date();
```

### AssignmentToMethodParameter
Assignment to method parameter `loadPercentage`
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
      }
    }
    if (loadPercentage == null) loadPercentage = 0;
    long loadMsInSecond = Math.round((Math.max(Math.min(loadPercentage, 100), 0) / 100.0) * 1000);

```

### AssignmentToMethodParameter
Assignment to method parameter `format`
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
      myDataProvider.checkGlobalPermission(Permission.MANAGE_SERVER_INSTALLATION);
      if (StringUtil.isEmpty(format)) {
        format = jetbrains.buildServer.server.rest.model.Constants.TIME_FORMAT;
      }
      DateTimeFormatter formatter = DateTimeFormat.forPattern(format).withLocale(Locale.ENGLISH);
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `src/jetbrains/buildServer/server/rest/jersey/ExceptionMapperBase.java`
#### Snippet
```java
          final Field field = Errors.ErrorMessage.class.getDeclaredField("message");
          field.setAccessible(true);
          result += " (messages: ";
          for (Errors.ErrorMessage errorMessage : messages) {
            // the data is not accessible otherwise
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `src/jetbrains/buildServer/server/rest/jersey/ExceptionMapperBase.java`
#### Snippet
```java
          for (Errors.ErrorMessage errorMessage : messages) {
            // the data is not accessible otherwise
            result += "\"" + field.get(errorMessage) + "\",";
          }
          result += ")";
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `src/jetbrains/buildServer/server/rest/jersey/ExceptionMapperBase.java`
#### Snippet
```java
            result += "\"" + field.get(errorMessage) + "\",";
          }
          result += ")";
        } catch (NoSuchFieldException e1) {
          //ignore
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/jetbrains/buildServer/server/rest/jersey/ExceptionMapperBase.java`
#### Snippet
```java
      final Throwable cause = e.getCause();
      if (cause == null || cause == e) break;
      e = cause;
    }
    return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `toProcess`
in `src/jetbrains/buildServer/server/rest/data/finder/GraphFinder.java`
#### Snippet
```java
        }
      }
      toProcess = linkedItems;
      if (!recursive) break;
      if (lookupLimit != null && (result.size() - initialSize >= lookupLimit)) {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/changeLog/ChangeLogGraphChangeVertex.java`
#### Snippet
```java

    // For now we just stick to the format of the old graph, hence null instead of false.
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/changeLog/ChangeLogGraphChangeVertex.java`
#### Snippet
```java
    }

    return null;
  }
}
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/debug/Sessions.java`
#### Snippet
```java
    @Override
    public String apply(Session input) {
      return input.user != null ? input.user.getUsername() : null;
    }
  }).compound(Ordering.natural().nullsLast().onResultOf(new Function<Session, Comparable>() {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/debug/Sessions.java`
#### Snippet
```java
      return serverBean.getAttribute(managerBean, attributeName);
    } catch (Exception e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/debug/Sessions.java`
#### Snippet
```java
    @Override
    public Comparable apply(final Session input) {
      return input.creationDate != null ? input.creationDate : null;
    }
  }));
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/debug/Sessions.java`
#### Snippet
```java
      return serverBean.invoke(managerBean, operationName, new Object[]{sessionId}, new String[]{String.class.getName()});
    } catch (Exception e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/debug/Sessions.java`
#### Snippet
```java
    @Override
    public Comparable apply(final Session input) {
      return input.lastAccessedDate != null ? input.lastAccessedDate : null;
    }
  })).compound(Ordering.natural().nullsLast().onResultOf(new Function<Session, Comparable>() {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/changeLog/ChangeLogRow.java`
#### Snippet
```java
  public Change getChange() {
    if (!VCS_CHANGE_ROW.equals(myRow.getType())) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/changeLog/ChangeLogRow.java`
#### Snippet
```java
  public Build getBuild() {
    if (!BUILD_ROW.equals(myRow.getType()) || myRow.getBuild() == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudImage.java`
#### Snippet
```java
  @XmlAttribute
  public String getLocator() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/data/DataUpdater.java`
#### Snippet
```java

  private Map<PropertyKey, String> convertToUserProperties(@Nullable Properties properties) {
    if (properties == null) return null;
    Map<PropertyKey, String> convertedProperties = new HashMap<PropertyKey, String>(properties.properties.size());
    for (Property listItem : properties.properties) {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/issue/IssueUsage.java`
#### Snippet
```java
        }
      }
      return null;
    } else {
      // this is highly inefficient especially when serving /relatedIssues for a build with large number of changes
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/issue/IssueUsage.java`
#### Snippet
```java
        }
      }
      return relatedModifications.isEmpty() ? null : Changes.fromSVcsModifications(relatedModifications, null, myFields.getNestedField("changes", Fields.NONE, Fields.LONG), myBeanContext);
    }
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/util/SimpleStringPool.java`
#### Snippet
```java
  public String reuse(@Nullable String value) {
    if (value == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/graphql/resolver/Query.java`
#### Snippet
```java

    // TODO: implement me
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/graphql/resolver/AgentTypeResolver.java`
#### Snippet
```java
      jetbrains.buildServer.serverSide.agentTypes.AgentType rawAgentType = myAgentTypeFinder.findAgentType(agentTypeId);

      return rawAgentType == null ? null : new AgentType((SAgentType) rawAgentType);
    } catch (NumberFormatException nfe) {
      // no agent type with this id
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/graphql/resolver/AgentTypeResolver.java`
#### Snippet
```java
    } catch (NumberFormatException nfe) {
      // no agent type with this id
      return null;
    } catch (ClassCastException cce) {
      LOG.debug("", cce);
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/graphql/resolver/AgentTypeResolver.java`
#### Snippet
```java
    } catch (ClassCastException cce) {
      LOG.debug("", cce);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/jersey/ExtensionHolderProviderFactory.java`
#### Snippet
```java
    }
    LOG.debug("Request for class: " + c + " as extension, nothing found.");
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  public CloudImages getCompatibleCloudImages() {
    if (myBuildType == null || myBuildType.getBuildType() == null) {
      return null;
    }
    return ValueWithDefault.decideDefault(myFields.isIncluded("compatibleCloudImages", false, true), () -> {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  @XmlAttribute
  public String getProjectId() {
    return myBuildType == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("projectId"), () -> myBuildType.getProject().getExternalId());
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  @XmlAttribute (name = "templateFlag")
  public Boolean getTemplateFlag() {
    return myBuildType == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("templateFlag"), () -> !myBuildType.isBuildType());
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  public PropEntitiesAgentRequirement getAgentRequirements() {
    if (myBuildType == null) {
      return null;
    }
    return ValueWithDefault.decideIncludeByDefault(
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  @XmlElement(name = "features")
  public PropEntitiesFeature getFeatures() {
    return myBuildType == null ? null : ValueWithDefault.decideIncludeByDefault(myFields.isIncluded("features", false), check(() -> {
        return new PropEntitiesFeature(myBuildType.getSettingsEx(), myFields.getNestedField("features", Fields.NONE, Fields.LONG), myBeanContext);
    }));
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  @XmlElement
  public Links getLinks() {
    return myBuildType == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("links", false, false), () -> {
        WebLinks webLinks = myBeanContext.getSingletonService(WebLinks.class);
        RelativeWebLinks relativeWebLinks = new RelativeWebLinks();
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  public Agents getCompatibleAgents() {
    if (myBuildType == null || myBuildType.getBuildType() == null) {
      return null;
    }
    return ValueWithDefault.decideDefault(myFields.isIncluded("compatibleAgents", false, true), () -> {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  public BuildType getTemplate() {
    if (myBuildType == null || myBuildType.getBuildType() == null){
      return null;
    }
    return ValueWithDefault.decideDefault(myFields.isIncluded("template", false, false), check(() -> {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
        try {
          final BuildTypeTemplate template = myBuildType.getBuildType().getTemplate();
          return template == null ? null : new BuildType(new BuildTypeOrTemplate(template), myFields.getNestedField("template"), myBeanContext);
        } catch (RuntimeException e) {
          LOG.debug("Error retrieving template for build configuration " + LogUtil.describe(myBuildType.getBuildType()) + ": " + e, e);
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
          //still including external id since the user has permission to view settings of the current build configuration
          String templateExternalId = getTemplateExternalId(myBuildType.getBuildType());
          return templateId == null || templateExternalId == null ? null : new BuildType(templateExternalId, templateId, myFields.getNestedField("template"), myBeanContext);
        }
    }));
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  public BuildTypes getTemplates() {
    if (myBuildType == null || myBuildType.getBuildType() == null){
      return null;
    }
    return ValueWithDefault.decideDefault(myFields.isIncluded("templates", false), check(() -> {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  public Project getProject() {
    return ValueWithDefault.decideDefault(myFields.isIncluded("project", false),
        () -> myBuildType == null ? null : new Project(myBuildType.getProject(), myFields.getNestedField("project"), myBeanContext)
    );
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  @XmlElement(name = "branches")
  public Branches getBranches() {
    if (myBuildType == null || myBuildType.getBuildType() == null) return null;
    return ValueWithDefault.decideDefault(myFields.isIncluded("branches", false, false), // do not include until asked as should only include for branched build types
      () -> {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  @XmlElement(name = "steps")
  public PropEntitiesStep getSteps() {
    return myBuildType == null ? null : ValueWithDefault.decideIncludeByDefault(myFields.isIncluded("steps", false), check(() -> {
        return new PropEntitiesStep(myBuildType.getSettingsEx(), myFields.getNestedField("steps", Fields.NONE, Fields.LONG), myBeanContext);
    }));
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  public String getDescription() {
    if (myBuildType == null) {
      return null;
    }
    return ValueWithDefault.decideDefault(myFields.isIncluded("description"), () -> {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
    return ValueWithDefault.decideDefault(myFields.isIncluded("description"), () -> {
      String description = myBuildType.getDescription();
      return StringUtil.isEmpty(description) ? null : description;
    });
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
    //template has no user link
    if (myBuildType == null || myBuildType.getBuildType() == null) {
      return null;
    }
    return ValueWithDefault.decideDefault(myFields.isIncluded("webUrl"), () -> myBeanContext.getSingletonService(WebLinks.class).getConfigurationHomePageUrl(myBuildType.getBuildType()));
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  @XmlAttribute
  public String getHref() {
    return myBuildType == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("href"), () -> myBeanContext.getApiUrlBuilder().getHref(myBuildType));
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  @Deprecated
  public String getProjectName() {
    return myBuildType == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("projectName"), () -> myBuildType.getProject().getFullName());
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  @XmlAttribute
  public String getName() {
    return myBuildType == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("name"), () -> myBuildType.getName());
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  public String getType() {
    if(myBuildType == null) {
      return null;
    }
    return ValueWithDefault.decideDefault(
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  @XmlAttribute
  public String getLocator() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  @XmlElement(name = "snapshot-dependencies")
  public PropEntitiesSnapshotDep getSnapshotDependencies() {
    return myBuildType == null ? null :
           ValueWithDefault.decideIncludeByDefault(
               myFields.isIncluded("snapshot-dependencies", false),
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  @SuppressWarnings("unused")
  public Boolean isExternalStatusAllowed() {
    return myBuildType == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("externalStatusAllowed", false, false), () -> myBuildType.getSettingsEx().getOption(BuildTypeOptions.BT_ALLOW_EXTERNAL_STATUS));
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  public VcsRootInstances getVcsRootInstances() {
    return ValueWithDefault.decideIncludeByDefault(myFields.isIncluded("vcsRootInstances", false, false)
      , check(() -> myBuildType == null || myBuildType.getBuildType() == null ? null :
                    new VcsRootInstances(CachingValue.simple(myBuildType.getBuildType().getVcsRootInstances()), null, myFields.getNestedField("vcsRootInstances"), myBeanContext)));
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  public PropEntitiesArtifactDep getArtifactDependencies() {
    if (myBuildType == null) {
      return null;
    } else {
      return ValueWithDefault.decideIncludeByDefault(myFields.isIncluded("artifact-dependencies", false), check(
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  @XmlElement(name = "triggers")
  public PropEntitiesTrigger getTriggers() {
    return myBuildType == null ? null : ValueWithDefault.decideIncludeByDefault(myFields.isIncluded("triggers", false), check(() -> {
        return new PropEntitiesTrigger(myBuildType.getSettingsEx(), myFields.getNestedField("triggers", Fields.NONE, Fields.LONG), myBeanContext);
    }));
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  @XmlAttribute
  public Boolean isPaused() {
    return myBuildType == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("paused"), () -> myBuildType.isPaused());
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  public Investigations getInvestigations() {
    if (myBuildType == null || myBuildType.getBuildType() == null) {
      return null;
    }
    return ValueWithDefault.decideDefault(myFields.isIncluded("investigations", false, true), () -> {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
        return ((BuildTypeIdentityEx)myBuildType.getIdentity()).getEntityId().getConfigId();
      } else {
        return null;
      }
    } else {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
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
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
        return new Comment(pauseComment, myFields.getNestedField("pauseComment"), myBeanContext);
      } else {
        return null;
      }
    });
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  @XmlElement(name="settings")
  public Properties getSettings() {
    return myBuildType == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("settings", false), check(() -> {
        Fields nestedField = myFields.getNestedField("settings", Fields.NONE, Fields.LONG);
        Locator locator = nestedField.getLocator() == null ? null : new Locator(nestedField.getLocator());
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  public VcsRootEntries getVcsRootEntries() {
    return ValueWithDefault.decideIncludeByDefault(myFields.isIncluded("vcs-root-entries", false),
        check(() -> myBuildType == null ? null : new VcsRootEntries(myBuildType, myFields.getNestedField("vcs-root-entries"), myBeanContext))
    );
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
        templateInternalIds.stream().map(id -> {
          BuildTypeTemplate template = projectManager.findBuildTypeTemplateById(id);
          if (template == null) return null;
          return new BuildTypeOrTemplate.IdsOnly(template.getExternalId(), id);
        }).collect(Collectors.toList()));
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
    final boolean includeProperty = TeamCityProperties.getBoolean(APIController.INCLUDE_INTERNAL_ID_PROPERTY_NAME);
    return myBuildType == null
           ? null
           : ValueWithDefault.decideDefault(myFields.isIncluded("projectInternalId", includeProperty, includeProperty), () -> myBuildType.getProject().getProjectId());
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  @XmlElement(name = "builds")
  public Builds getBuilds() {
    if (myBuildType == null || !myBuildType.isBuildType()) return null;
    if (!myFields.isIncluded("builds", false, true)){
      return null;
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
    if (myBuildType == null || !myBuildType.isBuildType()) return null;
    if (!myFields.isIncluded("builds", false, true)){
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  @XmlElement
  public Properties getParameters() {
    return myBuildType == null ? null : ValueWithDefault
        .decideIncludeByDefault(myFields.isIncluded("parameters", false),
            check(() -> new Properties(
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/change/Changes.java`
#### Snippet
```java
  @XmlAttribute(required = false)
  public String getHref() {
    return myPagerData == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("href"),
                                                                       myBeanContext.getApiUrlBuilder().transformRelativePath(myPagerData.getHref()));
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/graphql/model/connections/agentPool/AgentPoolProjectEdge.java`
#### Snippet
```java
  @Override
  public Project getNode() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/graphql/model/connections/agentPool/AgentPoolProjectEdge.java`
#### Snippet
```java
  @Override
  public ConnectionCursor getCursor() {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitySnapshotDep.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitySnapshotDep.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/swagger/CommonLocatorDimension.java`
#### Snippet
```java
  @Override
  public Class<? extends Annotation> annotationType() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/health/HealthCategories.java`
#### Snippet
```java
      this.href = ValueWithDefault.decideDefault(fields.isIncluded("href", true), () -> generateHref(context, pagerData.getHref()));
      this.nextHref = ValueWithDefault
        .decideDefault(fields.isIncluded("nextHref"), () -> pagerData.getNextHref() != null ? generateHref(context, pagerData.getNextHref()) : null);
      this.prevHref = ValueWithDefault
        .decideDefault(fields.isIncluded("prevHref"), () -> pagerData.getPrevHref() != null ? generateHref(context, pagerData.getPrevHref()) : null);
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/health/HealthCategories.java`
#### Snippet
```java
        .decideDefault(fields.isIncluded("nextHref"), () -> pagerData.getNextHref() != null ? generateHref(context, pagerData.getNextHref()) : null);
      this.prevHref = ValueWithDefault
        .decideDefault(fields.isIncluded("prevHref"), () -> pagerData.getPrevHref() != null ? generateHref(context, pagerData.getPrevHref()) : null);
    } else {
      this.href = null;
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/swagger/SwaggerConfigImpl.java`
#### Snippet
```java

  public String getFilterClass() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/swagger/SwaggerConfigImpl.java`
#### Snippet
```java

  public Swagger configure(final Swagger swagger) {
    if (swagger == null) return null;

    Info info = swagger.getInfo();
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/audit/AuditEvent.java`
#### Snippet
```java
      if (comment.getUser() != null) return new User(comment.getUser(), fields.getNestedField("user", Fields.SHORT, Fields.SHORT), context);
      long userId = actionP.getUserId();
      return userId == -1 ? null : new User(userId, fields.getNestedField("user", Fields.SHORT, Fields.SHORT), context);
    });
    this.comment = ValueWithDefault.decideDefault(fields.isIncluded("comment"), () -> StringUtil.isEmpty(comment.getComment()) ? null : comment.getComment());
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/jersey/UrlBuilderProvider.java`
#### Snippet
```java
      return this;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java
   */
  public static String compareBuildTypes(@Nullable final BuildTypeSettingsEx a, @Nullable final BuildTypeSettingsEx b, boolean compareInheritedFlag, boolean compareIds) {
    if (a == b) return null;
    if (a == null) return "null <-> not null";
    if (b == null) return "not null <-> null";
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java
    }

    return result.length() == 0 ? null : result.toString();

/* Not using for comparison:
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Builds.java`
#### Snippet
```java
        PagerData pager = myBuildDataRetriever.getPagerData();
        if(pager == null) {
          return null;
        }
        return myBeanContext.getApiUrlBuilder().transformRelativePath(pager.getHref());
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Builds.java`
#### Snippet
```java
        PagerData pager = myBuildDataRetriever.getPagerData();
        if(pager == null || pager.getPrevHref() == null) {
          return null;
        }
        return myBeanContext.getApiUrlBuilder().transformRelativePath(pager.getPrevHref());
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Builds.java`
#### Snippet
```java
        PagerData pager = myBuildDataRetriever.getPagerData();
        if(pager == null || pager.getNextHref() == null) {
          return null;
        }
        return myBeanContext.getApiUrlBuilder().transformRelativePath(pager.getNextHref());
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/change/VcsRoot.java`
#### Snippet
```java
            //ignore
          }
          return null;
      });
    } else {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/change/SnapshotDependencyLink.java`
#### Snippet
```java
  public String getBuildTypeBranch() {
    if(myBuildTypeBranch == null)
      return null;

    return ValueWithDefault.decideDefault(myFields.isIncluded("buildTypeBranch",false, false), myBuildTypeBranch);
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/change/SnapshotDependencyLink.java`
#### Snippet
```java
  public Build getBuild() {
    if(myBuild == null && myQueuedBuild == null)
      return null;

    if (myQueuedBuild != null) {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/change/SnapshotDependencyLink.java`
#### Snippet
```java
  public BuildType getBuildType() {
    if(myBuildType == null)
      return null;

    return ValueWithDefault.decideDefault(
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/problem/scope/AbstractScopeTree.java`
#### Snippet
```java
  public List<N> getNodes() {
    if(BooleanUtils.isNotTrue(myFields.isIncluded("node"))) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/problem/scope/AbstractScopeTree.java`
#### Snippet
```java
  public List<L> getLeafs() {
    if(BooleanUtils.isNotTrue(myFields.isIncluded("leaf"))) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/swagger/SwaggerUtil.java`
#### Snippet
```java
      return getPropertySimpleRef(items);
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/swagger/SwaggerUtil.java`
#### Snippet
```java

  static <K extends Comparable<? super K>, V> Map<K, V> getOrderedMap(Map<K, V> input) {
    if (input == null) return null;
    Map<K, V> sorted = new LinkedHashMap<K, V>();
    List<K> keys = new ArrayList<K>();
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/approval/UserApprovalRuleStatus.java`
#### Snippet
```java
      );
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/approval/UserApprovalRuleStatus.java`
#### Snippet
```java
      );
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/data/problem/scope/TestScopeTreeCollector.java`
#### Snippet
```java
      if (scope.getType().equals(TestScopeType.BUILD_TYPE)) return buildTypeMaxChildren;
      if (scope.getType().equals(TestScopeType.PROJECT)) return projectMaxChildren;
      return null;
    });
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/problem/scope/TestScope.java`
#### Snippet
```java
  public BuildType getBuildType() {
    if(myRealTestScope.getBuildType() == null)
      return null;

    return ValueWithDefault.decideDefault(
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/request/BuildQueueRequest.java`
#### Snippet
```java

    if (QueueWebUtil.processLargeQueueCase(request, response, myServiceLocator.getSingletonService(BuildQueue.class))) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/user/PermissionRestriction.java`
#### Snippet
```java
    this.isGlobalScope = ValueWithDefault.decideIncludeByDefault(fields.isIncluded("isGlobalScope", true, true), () -> project == null);
    this.project =
      ValueWithDefault.decideDefault(fields.isIncluded("project", false, true), () -> project != null ? new Project(project, fields.getNestedField("project"), beanContext) : null);
    this.permission = ValueWithDefault.decideIncludeByDefault(
      fields.isIncluded("permission", true, true),
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/approval/ApprovalInfo.java`
#### Snippet
```java
  public ApprovalStatus getStatus() {
    if (!myFields.isIncluded("status", true, true)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/approval/ApprovalInfo.java`
#### Snippet
```java
      );
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/approval/ApprovalInfo.java`
#### Snippet
```java
    if (myFields.isIncluded("groupApprovals", true, true)) {
      if (!myApprovalFeatureEnabled) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/approval/ApprovalInfo.java`
#### Snippet
```java
                     .checkProjectPermission(Permission.VIEW_BUILD_CONFIGURATION_SETTINGS, myBuildPromotionEx.getProjectId());
      } catch (AuthorizationFailedException e) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/approval/ApprovalInfo.java`
#### Snippet
```java
        );
      } catch (InvalidApprovalRuleException e) {
        return null; // act as if there are no rules at all
      }
    }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/approval/ApprovalInfo.java`
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
in `src/jetbrains/buildServer/server/rest/model/build/approval/ApprovalInfo.java`
#### Snippet
```java
    if (myFields.isIncluded("userApprovals", true, true)) {
      if (!myApprovalFeatureEnabled) {
        return null;
      }
      try { // return empty list of rule statuses if user is not entitled to see build configuration settings
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/approval/ApprovalInfo.java`
#### Snippet
```java
                     .checkProjectPermission(Permission.VIEW_BUILD_CONFIGURATION_SETTINGS, myBuildPromotionEx.getProjectId());
      } catch (AuthorizationFailedException e) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/approval/ApprovalInfo.java`
#### Snippet
```java
        );
      } catch (InvalidApprovalRuleException e) {
        return null; // act as if there are no rules at all
      }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/approval/ApprovalInfo.java`
#### Snippet
```java

    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/approval/ApprovalInfo.java`
#### Snippet
```java
      return false;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/ProblemScope.java`
#### Snippet
```java
          final String projectId = scope.getProjectId();
          if(projectId == null) {
            return null;
          }

```

### ReturnNull
Return of `null`
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Project.java`
#### Snippet
```java
        if (lastBuild == null) {
            // is this OK?
            return null;
        }
        return String.valueOf(lastBuild.getBuildNumber());
```

### ReturnNull
Return of `null`
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Project.java`
#### Snippet
```java
        if (lastBuild == null) {
            // is this OK?
            return null;
        }
        return getFormattedTime(lastBuild.getStartDate());
```

### ReturnNull
Return of `null`
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Project.java`
#### Snippet
```java
        }
        //todo: get next VCS checking/scheduled time
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java
      final String message = TeamCityProperties.getProperty("rest.disable.message", "REST API is disabled on this TeamCity server with 'rest.disable' internal property.");
      reportRestErrorResponse(response, HttpServletResponse.SC_NOT_IMPLEMENTED, null, message, Level.INFO, request);
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java
      final String message = TeamCityProperties.getProperty("rest.disable.message", defaultMessage);
      reportRestErrorResponse(response, HttpServletResponse.SC_NOT_IMPLEMENTED, null, message, Level.INFO, request);
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java
    } catch (Throwable throwable) {
      reportRestErrorResponse(response, HttpServletResponse.SC_INTERNAL_SERVER_ERROR, throwable, "Error initializing REST API", Level.ERROR, request);
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java
          reportRestErrorResponse(response, HttpServletResponse.SC_UNAUTHORIZED, null, "Wrong authToken specified",
                                  Level.INFO, request);
          return null;
        }
      }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java
        LOG.debug("Pre-flight OPTIONS request detected, replying with status 204");
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
        return null;
      }
      if (myInternalAuthProcessing && SessionUser.getUser(request) == null && !requestForMyPathNotRequiringAuth(request)) {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java
      if (myInternalAuthProcessing && SessionUser.getUser(request) == null && !requestForMyPathNotRequiringAuth(request)) {
        if (processRequestAuthentication(request, response, myAuthManager)) {
          return null;
        }
        //TeamCity API issue: SecurityContext.getAuthorityHolder is "SYSTEM" if request is not authorized
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java
          response.getWriter().write("TeamCity core was unable to handle authentication (no current user).");
          LOG.warn("TeamCity core was unable to handle authentication (no current user), replying with 401 status. Request details: " + WebUtil.getRequestDump(request));
          return null;
        }
      }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/problem/Resolution.java`
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
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
    } catch (Exception e) {
      //ignore for agent type
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/request/AgentRequest.java`
#### Snippet
```java
    final SBuildAgent agent = myAgentFinder.getItem(agentLocator);
    final jetbrains.buildServer.serverSide.agentPools.AgentPool agentPool = myAgentPoolFinder.getAgentPool(agent);
    return agentPool == null ? null : new AgentPool(agentPool, new Fields(fields), myBeanContext);
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/user/User.java`
#### Snippet
```java
  @XmlAttribute(name = "enabled2FA")
  public Boolean getEnabled2FA() {
    return myUser == null ? null : ValueWithDefault.decideDefaultIgnoringAccessDenied(myFields.isIncluded("enabled2FA", false), () -> {
      checkCanViewUserDetails();
      return myTwoFactorPasswordManager.hasEnabled2FA(myUser);
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/user/User.java`
#### Snippet
```java
  @XmlAttribute
  public String getEmail() {
    return myUser == null ? null : ValueWithDefault.decideDefaultIgnoringAccessDenied(myFields.isIncluded("email", false), () -> {
      checkCanViewUserDetails();
      return StringUtil.isEmpty(myUser.getEmail()) ? null : myUser.getEmail();
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/user/User.java`
#### Snippet
```java
    return myUser == null ? null : ValueWithDefault.decideDefaultIgnoringAccessDenied(myFields.isIncluded("email", false), () -> {
      checkCanViewUserDetails();
      return StringUtil.isEmpty(myUser.getEmail()) ? null : myUser.getEmail();
    });
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/user/User.java`
#### Snippet
```java
  @XmlElement(name = "properties")
  public Properties getProperties() {
    return myUser == null ? null : ValueWithDefault.decideDefaultIgnoringAccessDenied(myFields.isIncluded("properties", false), () -> {
      checkCanViewUserDetails();
      return new Properties(getProperties(myUser), UserRequest.getPropertiesHref(myUser),myFields.getNestedField("properties", Fields.NONE, Fields.LONG), myContext);
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/user/User.java`
#### Snippet
```java
  @XmlAttribute
  public Boolean getHasPassword() {
    return myUser == null ? null : ValueWithDefault.decideDefaultIgnoringAccessDenied(myFields.isIncluded("hasPassword", false, false), () -> {
      checkCanViewUserDetails();
      return ((UserImpl)myUser).hasPassword();
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/user/User.java`
#### Snippet
```java
  @XmlElement(name = "roles")
  public RoleAssignments getRoles() {
    return myUser == null ? null : ValueWithDefault.decideDefaultIgnoringAccessDenied(myFields.isIncluded("roles", false), () -> {
      checkCanViewUserDetails();
      return new RoleAssignments(myUser.getRoles(), myUser, myContext);
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/user/User.java`
#### Snippet
```java
  @XmlElement(name = "groups")
  public Groups getGroups() {
    return myUser == null ? null : ValueWithDefault.decideDefaultIgnoringAccessDenied(myFields.isIncluded("groups", false), () -> {
      checkCanViewUserDetails();
      return new Groups(myUser.getUserGroups(), myFields.getNestedField("groups", Fields.NONE, Fields.LONG), myContext);
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/user/User.java`
#### Snippet
```java
  @XmlAttribute
  public String getHref() {
    return myUser == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("href"), myContext.getApiUrlBuilder().getHref(myUser));
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/user/User.java`
#### Snippet
```java
  @XmlElement(name = "avatars")
  public UserAvatars getAvatars() {
    return myUser == null ? null : ValueWithDefault.decideDefaultIgnoringAccessDenied(myFields.isIncluded("avatars", false), () -> {
      final UserAvatarsManager.Avatars avatars = myUserAvatarsManager.getAvatars(myUser);
      if (!avatars.exists()) {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/user/User.java`
#### Snippet
```java
      final UserAvatarsManager.Avatars avatars = myUserAvatarsManager.getAvatars(myUser);
      if (!avatars.exists()) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/user/User.java`
#### Snippet
```java
  @XmlAttribute
  public String getLastLogin() {
    return myUser == null ? null : ValueWithDefault.decideDefaultIgnoringAccessDenied(myFields.isIncluded("lastLogin", false), () -> {
      checkCanViewUserDetails();
      Date lastLoginTimestamp = myUser.getLastLoginTimestamp();
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/user/User.java`
#### Snippet
```java
        return Util.formatTime(lastLoginTimestamp);
      }
      return null;
    });
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/user/User.java`
#### Snippet
```java
  @XmlAttribute
  public String getUsername() {
    return myUser == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("username"), () -> {
      return myUser.getUsername();
    });
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/user/User.java`
#### Snippet
```java
  @XmlAttribute
  public String getLocator() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/user/User.java`
#### Snippet
```java
  @XmlAttribute
  public String getPassword() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/user/User.java`
#### Snippet
```java
  @XmlAttribute
  public String getRealm() {
    return myUser == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("realm", false), myUser.getRealm());
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/user/User.java`
#### Snippet
```java
  @XmlAttribute
  public String getName() {
    return myUser == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("name"), () -> {
      return StringUtil.isEmpty(myUser.getName()) ? null : myUser.getName();
    });
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/problem/TestOccurrence.java`
#### Snippet
```java
  public TestOccurrences getInvocations() {
    return ValueWithDefault.decideDefault(myChecker.isIncluded("invocations", myFields), () -> {
      if (!(myTestRun instanceof MultiTestRun)) return null;
      MultiTestRun multiTestRun = (MultiTestRun) myTestRun;
      Fields nestedField = myFields.getNestedField("invocations");
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/problem/TestOccurrence.java`
#### Snippet
```java
  public Boolean isNewFailure() {
    if (!myTestRun.getStatus().isFailed()) {
      return null;
    }
    return ValueWithDefault.decideDefault(myChecker.isIncluded("newFailure", myFields), () -> myTestRun.isNewFailure());
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/problem/TestOccurrence.java`
#### Snippet
```java
  public TestOccurrence getNextFixed() {
    if (BooleanUtils.isNotTrue(myChecker.isIncluded("nextFixed", myFields))) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/problem/TestOccurrence.java`
#### Snippet
```java
    try {
      if (!myTestRun.isFixed()) {
        return null;
      }
      return ValueWithDefault.decideDefault(myChecker.isIncluded("nextFixed", myFields),
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/problem/TestOccurrence.java`
#### Snippet
```java
    } catch (IllegalArgumentException | UnsupportedOperationException e) {
      LOG.warnAndDebugDetails("Returning empty nextFixed as there was an error while getting nextFixed for test occurrence \"" + TestOccurrenceFinder.getTestRunLocator(myTestRun) + "\"", e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/request/TypedParametersSubResource.java`
#### Snippet
```java
    myEntityWithParameters.persist("The type of the parameter with name " + parameterName + " changed");
    final ParameterType type = Property.createFrom(parameterName, myEntityWithParameters, Fields.LONG, myBeanContext.getServiceLocator()).type;
    return type == null ? null : type.rawValue;
  }
}
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/request/TypedParametersSubResource.java`
#### Snippet
```java
  public String getParameterTypeRawValue(@PathParam("name") String parameterName) {
    final ParameterType type = Property.createFrom(parameterName, myEntityWithParameters, Fields.LONG, myBeanContext.getServiceLocator()).type;
    return type == null ? null : type.rawValue;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/server/LicensingData.java`
#### Snippet
```java
        permissionChecker.checkGlobalPermission(Permission.MANAGE_SERVER_LICENSES);
        int result = licensingPolicy.getBuildTypesLicensesLeft();
        return result == -1 ? null : result;
      }
    );
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/problem/scope/AbstractNode.java`
#### Snippet
```java
  public String getParent() {
    if (BooleanUtils.isNotTrue(myFields.isIncluded("parentId")) || myNode.getParent() == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/server/LicenseKeyEntity.java`
#### Snippet
```java
      return Integer.valueOf(numberOfAgents);
    } catch (NumberFormatException e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/jersey/provider/annotated/JerseyContextSingletonAnnotationProvider.java`
#### Snippet
```java
  @Override
  public Injectable<?> getInjectable(ComponentContext ic, Context context, Type type) {
    if (!(type instanceof Class)) return null;

    Class<?> clazz = (Class<?>)type;
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/jersey/provider/annotated/JerseyContextSingletonAnnotationProvider.java`
#### Snippet
```java

    if (!(clazz.isAnnotationPresent(JerseyContextSingleton.class))) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/jersey/provider/annotated/JerseyContextSingletonAnnotationProvider.java`
#### Snippet
```java
    String[] beanNamesForType = myApplicationContext.getBeanNamesForType(clazz);
    if (beanNamesForType.length == 0) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/problem/scope/AbstractLeaf.java`
#### Snippet
```java
  public String getNodeId() {
    if (BooleanUtils.isNotTrue(myFields.isIncluded("nodeId"))) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/agent/AgentPool.java`
#### Snippet
```java
                    AgentPoolFinder.PontentiallyInaccessibleProject project = agentPoolFinder.getPoolOwnerProject(agentPool);
                    if (project == null) { //not existing project
                      return null;
                    }
                    if (project.getProject() == null) { //inaccessible project
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/problem/ProblemOccurrence.java`
#### Snippet
```java
        if (problemP.getBuildPromotion().getBuildType() == null){
          //missing build type, skip. Workaround for http://youtrack.jetbrains.com/issue/TW-34733
          return null;
        }
        return !problemP.getAllResponsibilities().isEmpty();
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/problem/ProblemOccurrence.java`
#### Snippet
```java
        BuildProblemDataEx buildProblemData = (BuildProblemDataEx)problemP.getBuildProblemData();
        Integer buildLogAnchor = buildProblemData.getBuildLogAnchor();
        return buildLogAnchor == null ? null : buildLogAnchor.toString();
      } catch (ClassCastException e) {
        return null;
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/problem/ProblemOccurrence.java`
#### Snippet
```java
        return buildLogAnchor == null ? null : buildLogAnchor.toString();
      } catch (ClassCastException e) {
        return null;
      }
    });
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
    final SProject actualParentProject = project.getParentProject();
    return actualParentProject == null
           ? null
           : new Project(actualParentProject,  new Fields(fields), myBeanContext);
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/request/FilesSubResource.java`
#### Snippet
```java
      return Response.status(response.getStatus()).build();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/health/HealthItems.java`
#### Snippet
```java
      this.href = ValueWithDefault.decideDefault(fields.isIncluded("href", true), () -> generateHref(context, pagerData.getHref()));
      this.nextHref = ValueWithDefault
        .decideDefault(fields.isIncluded("nextHref"), () -> pagerData.getNextHref() != null ? generateHref(context, pagerData.getNextHref()) : null);
      this.prevHref = ValueWithDefault
        .decideDefault(fields.isIncluded("prevHref"), () -> pagerData.getPrevHref() != null ? generateHref(context, pagerData.getPrevHref()) : null);
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/health/HealthItems.java`
#### Snippet
```java
        .decideDefault(fields.isIncluded("nextHref"), () -> pagerData.getNextHref() != null ? generateHref(context, pagerData.getNextHref()) : null);
      this.prevHref = ValueWithDefault
        .decideDefault(fields.isIncluded("prevHref"), () -> pagerData.getPrevHref() != null ? generateHref(context, pagerData.getPrevHref()) : null);
    } else {
      this.href = null;
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/server/Server.java`
#### Snippet
```java
      return ValueWithDefault.decideIncludeByDefault(myFields.isIncluded("startTime"), Util.formatTime(startupContext.getServerStartupTimestamp()));
    } catch (Exception e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/agent/Agent.java`
#### Snippet
```java
      build = ValueWithDefault.decideDefault(fields.isIncluded("build", false), () -> {
        SRunningBuild runningBuild = agent.getRunningBuild();
        if (runningBuild == null) return null;
        try {
          beanContext.getSingletonService(PermissionChecker.class).checkPermission(Permission.VIEW_PROJECT, runningBuild.getBuildPromotion());
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/agent/Agent.java`
#### Snippet
```java
          ip = ValueWithDefault.decideDefaultIgnoringAccessDenied(fields.isIncluded("ip", false), () -> {
            final String hostAddress = agent.getHostAddress();
            return DeadAgent.NA.equals(hostAddress) ? null : hostAddress;
          });
          protocol = ValueWithDefault.decideDefaultIgnoringAccessDenied(fields.isIncluded("protocol", false, false), () -> getAgentProtocol(agent));
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/agent/Agent.java`
#### Snippet
```java
                                                         () -> {
                                                           long idleTime = agent.getIdleTime();
                                                           return idleTime <= 0 ? null : Util.formatTime(new Date(Dates.now().getTime() - idleTime));
                                                         });

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/agent/Agent.java`
#### Snippet
```java
                                                                                   fields.getNestedField("cloudInstance"), beanContext);
                                                                               } catch (NotFoundException e) {
                                                                                 return null;
                                                                               }
                                                                             });
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/agent/Agent.java`
#### Snippet
```java
            try {
              if (!agent.isCloudAgent()) {
                return null;
              } else {
                return new CloudImage(beanContext.getSingletonService(CloudImageFinder.class).getItem(CloudImageFinder.getLocator(agent)), fields.getNestedField("cloudImage"), beanContext);
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/agent/Agent.java`
#### Snippet
```java
            } catch (Exception e) {
              LOGGER.warnAndDebugDetails("Unable to get the cloud image for agent " + LogUtil.describe(agent), e);
              return null;
            }
          });
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/agent/Agent.java`
#### Snippet
```java
    }
    OSKind os = OSKind.guessByName(osName);
    if (os == null) return null;
    switch (os) {
      case WINDOWS:
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/agent/Agent.java`
#### Snippet
```java
        return "Unix";
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/graphql/resolver/BuildTypeResolver.java`
#### Snippet
```java
  @Override
  public BuildType findById(String id) {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
    private Iterable<Node> getChildrenInternal() {
      if (shouldHideChildren()) {
        return null;
      }
      try {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/change/Change.java`
#### Snippet
```java
    return ValueWithDefault.decideDefault(myFields.isIncluded("snapshotDependencyLink", false), () -> {
      if(myDescriptor == null)
        return null;

      return ChangeUtil.getSnapshotDependencyLink(myDescriptor, myFields.getNestedField("snapshotDependencyLink"), myBeanContext);
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/change/Change.java`
#### Snippet
```java
  public VcsRootInstance getVcsRootInstance() {
    return myModification.isPersonal()
           ? null
           : ValueWithDefault.decideDefault(myFields.isIncluded("vcsRootInstance", false),
                                            new VcsRootInstance(myModification.getVcsRoot(), myFields.getNestedField("vcsRootInstance"), myBeanContext));
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/change/Change.java`
#### Snippet
```java
  @XmlAttribute
  public String getLocator() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/change/Change.java`
#### Snippet
```java
      final Collection<SUser> users = myModification.getCommitters();
      if (users.size() != 1) {
        return null;
      }
      return new User(users.iterator().next(), myFields.getNestedField("user"), myBeanContext);
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/change/Commiters.java`
#### Snippet
```java
  public Integer getCount() {
    if(!myFields.isIncluded("count", true, true))
      return null;
    return myCommiters.size();
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/change/Commiters.java`
#### Snippet
```java
  public List<Commiter> getCommiters() {
    if(!myFields.isIncluded("commiter", false, true))
      return null;

    Fields commiterFields = myFields.getNestedField("commiter");
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/graphql/resolver/ProjectResolver.java`
#### Snippet
```java
  @Override
  public Project findById(String id) {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/change/BranchVersion.java`
#### Snippet
```java
  @XmlAttribute(name = "version")
  public String getVersion(){
    return myVersion == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("version"), myVersion);
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/data/problem/TestOccurrenceFinder.java`
#### Snippet
```java
    } catch (Exception e) {
      ExceptionUtil.rethrowAsRuntimeException(e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/RunningBuildInfo.java`
#### Snippet
```java
                                            SFinishedBuild recentlyFinishedBuild = myBuild.getRecentlyFinishedBuild();
                                            return recentlyFinishedBuild == null
                                                   ? null
                                                   : new Build(recentlyFinishedBuild.getBuildPromotion(), myFields.getNestedField("outdatedReasonBuild"), myBeanContext);
                                          });
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
  public String getBuildNumber(@ApiParam(format = LocatorName.BUILD) @PathParam("buildLocator") String buildLocator) {
    SBuild build = getBuild(myBuildFinder.getBuildPromotion(null, buildLocator));
    return build == null ? null : build.getBuildNumber();
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
    final SBuild associatedBuild = build.getAssociatedBuild();
    if (associatedBuild == null) {
      return null;
    }
    return new Build(associatedBuild, new Fields(fields), myBeanContext);
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
  public String getBuildStatusText(@ApiParam(format = LocatorName.BUILD) @PathParam("buildLocator") String buildLocator) {
    SBuild build = getBuild(myBuildFinder.getBuildPromotion(null, buildLocator));
    return build == null ? null : build.getStatusDescriptor().getText();
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/change/Commiter.java`
#### Snippet
```java
      return new Users(myNonCheckedUsers, myFields.getNestedField("users"), myBeanContext);
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/change/Commiter.java`
#### Snippet
```java
      return myVCSUsername;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/jersey/BeanContextProvider.java`
#### Snippet
```java
      return this;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/graphql/resolver/AgentResolver.java`
#### Snippet
```java
  @Override
  public Agent findById(@NotNull String id) {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntityTrigger.java`
#### Snippet
```java
      return "Trigger with id '" + triggerToAdd.getId() + "'already exists.";
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
  public String getUuid() {
    if (myProject == null || myBeanContext == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
  public Projects getAncestorProjects() {
    if (myProject == null || myBeanContext == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
    description = ValueWithDefault.decideDefault(
      fields.isIncluded("description"),
      () -> Util.resolveNull(project.getDescription(), d -> StringUtil.isEmpty(d) ? null : d)
    );

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
      fields.isIncluded("defaultTemplate", false),
      () -> !canViewSettings.get()
            ? null
            : getDefaultTemplate(project, fields.getNestedField("defaultTemplate", Fields.NONE, Fields.SHORT), beanContext)
    );
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
    parameters = ValueWithDefault.decideDefault(
      fields.isIncluded("parameters", false),
      () -> !canViewSettings.get() ? null :
            new Properties(createEntity(project), ProjectRequest.getParametersHref(project), null, fields.getNestedField("parameters", Fields.NONE, Fields.LONG), beanContext)
    );
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
    vcsRoots = ValueWithDefault.decideDefault(
      fields.isIncluded("vcsRoots", false),
      () -> !canViewSettings.get() ? null : new VcsRoots(
        project.getOwnVcsRoots(), //consistent with VcsRootFinder
        new PagerDataImpl(VcsRootRequest.getHref(project)),
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
      fields.isIncluded("projectFeatures", false),
      () -> {
        if (!canViewSettings.get()) return null;
        Fields nestedFields = fields.getNestedField("projectFeatures", Fields.NONE, Fields.LONG);
        return new PropEntitiesProjectFeature(project, nestedFields.getLocator(), nestedFields, beanContext);
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
  public Boolean isVirtual() {
    if (myProject == null || myBeanContext == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Branch.java`
#### Snippet
```java
          buildsHref = BuildRequest.getBuildsHref(myBranch, null);
        }
        if (builds == null && buildsHref == null) return null;
        return Builds.createFromPrefilteredBuildPromotions(builds == null ? null : builds.getEntries(), buildsHref == null ? null : new PagerDataImpl(buildsHref), buildsFields, myBeanContext);
      });
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/approval/GroupApprovalRuleStatus.java`
#### Snippet
```java
      );
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/approval/GroupApprovalRuleStatus.java`
#### Snippet
```java
      );
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/graphql/resolver/agentPool/ProjectAgentPoolResolver.java`
#### Snippet
```java
  @Override
  public ProjectAgentPool findById(String id) {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/problem/scope/TestScopeTree.java`
#### Snippet
```java
    public TestOccurrences getTestOccurrences() {
      if(BooleanUtils.isNotTrue(myFields.isIncluded("testOccurrences"))) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/problem/scope/TestScopeTree.java`
#### Snippet
```java
    public TestCounters getCounters() {
      if(BooleanUtils.isNotTrue(myFields.isIncluded("testCounters"))) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/errors/PartialUpdateError.java`
#### Snippet
```java
  private static Throwable getFirst(final List<Throwable> causes) {
    if (causes == null || causes.size() == 0) {
      return null;
    }
    return causes.get(0);
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesArtifactDep.java`
#### Snippet
```java
  @XmlAttribute
  public String getReplace() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  public IssueUsages getIssues() {
    return myBuild == null
           ? null
           : ValueWithDefault.decideDefault(myFields.isIncluded("relatedIssues", false), () -> {
             final boolean includeAllInline = TeamCityProperties.getBoolean("rest.beans.build.inlineRelatedIssues");
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
        result = myQueuedBuild.getWhenQueued();
      }
      return result == null ? null : Util.formatTime(result);
    });
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
    return ValueWithDefault.decideDefault(myFields.isIncluded("running-info", false), () -> {
      SRunningBuild runningBuild = getRunningBuild(myBuildPromotion, myServiceLocator);
      if (runningBuild == null) return null;
      return new RunningBuildInfo(runningBuild, myFields.getNestedField("running-info"), myBeanContext);
    });
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
      () -> {
        if(myBuild == null) {
          return null;
        }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  @XmlAttribute
  public Boolean isPinned() {
    return myBuild == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("pinned"), () -> myBuild.isPinned());
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  public String getStatus() {
    //todo: consider getting details from full statistics is that is required for the node as otherwise the text and test counts will be not in sync
    return myBuild == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("status", true), () -> myBuild.getBuildStatus().getText());
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  @XmlElement
  public String getStartDate() { // consider adding myBuild.getServerStartDate()
    return myBuild == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("startDate", false), () -> Util.formatTime(myBuild.getStartDate()));
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  public Properties getStatistics() {
    if (myBuild == null) {
      return null;
    } else {
      final String statisticsHref = myBeanContext.getApiUrlBuilder().getHref(myBuild) + BuildRequest.STATISTICS;
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
                                            SBuild prevBuild = (SBuild)associatedData.get(ArtifactDependencyChangesProvider.OLD_BUILD_ATTR);
                                            SBuild nextBuild = (SBuild)associatedData.get(ArtifactDependencyChangesProvider.NEW_BUILD_ATTR);
                                            if (prevBuild == null && nextBuild == null) return null;
                                            return new BuildChangeData(Util.resolveNull(prevBuild, (b) -> b.getBuildPromotion()),
                                                                       Util.resolveNull(nextBuild, (b) -> b.getBuildPromotion()));
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  public Changes getChanges() {
    if (!myFields.isIncluded("changes", false, true)) {
      return null;
    }
    return ValueWithDefault.decide(myFields.isIncluded("changes", false), () -> {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
        CollectionsUtil.filterAndConvertCollection(((BuildPromotionEx)myBuildPromotion).getAllRevisionsMap().values(), source -> source, data -> data.isSettingsRevision());
      if (revisions.isEmpty()) {
        return null;
      }
      if (revisions.size() > 1) {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  @XmlAttribute
  public String getLocator() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
    return ValueWithDefault.decideDefault(myFields.isIncluded("agent", false), () -> {
      if (myBuild != null) {
        if (myBuild.isAgentLessBuild()) return null;
        SBuildAgent agent = myBuild.getAgent();
        return new Agent(agent, myFields.getNestedField("agent"), myBeanContext);
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
        }
      }
      return null;
    });
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
        return new ApprovalInfo(buildPromotionEx, myFields.getNestedField("approvalInfo"), myBeanContext);
      }
      return null;
    });
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  public BuildState getState() {
    if (!myFields.isIncluded("state", true, true)) {
      return null;
    }
    if (myQueuedBuild != null) return BuildState.queued;
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
                                          () -> {
                                            final List<BuildProblem> problemOccurrences = ProblemOccurrenceFinder.getProblemOccurrences(myBuildPromotion);
                                            if (problemOccurrences.size() == 0) return null;

                                            int newProblemsCount = 0;
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  @XmlElement
  public String getStatusText() {
    return myBuild == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("statusText", false, true), () -> myBuild.getStatusDescriptor().getText());
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  @XmlElement(name = "testOccurrences")
  public TestOccurrences getTestOccurrences() {
    if (myBuild == null) return null;
    return ValueWithDefault.decideDefault(myFields.isIncluded("testOccurrences", false),
                                          () -> {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
                                            final ShortStatistics statistics = fullStatistics != null ? fullStatistics : myBuild.getShortStatistics();
                                            if (statistics.getAllTestCount() == 0) {
                                              return null;
                                            }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
                                            if (myBuild.getBuildType() == null) {
                                              //workaround for http://youtrack.jetbrains.com/issue/TW-34734
                                              return null;
                                            }
                                            final List<STestRun> tests = ValueWithDefault.decideDefault(
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  @XmlElement
  public String getFinishDate() {
    return myBuild == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("finishDate", false), () -> Util.formatTime(myBuild.getFinishDate()));
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
      //can improve the code by requesting only 1 item
      final List<AuditLogAction> logActions = ((BuildPromotionEx)myBuildPromotion).getAuditLogActions(new ActionTypesFilter(ActionType.BUILD_MARKED_AS_FAILED, ActionType.BUILD_MARKED_AS_SUCCESSFUL));
      if (logActions.isEmpty()) return null;
      AuditLogAction action = logActions.get(0); //the most recent action
      return new Comment(action.getComment(), myFields.getNestedField("statusChangeComment", Fields.NONE, Fields.LONG), myBeanContext);
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
        triggeredBy = myQueuedBuild.getTriggeredBy();
      }
      return triggeredBy == null ? null : new TriggeredBy(triggeredBy, myFields.getNestedField("triggered", Fields.NONE, Fields.LONG), myBeanContext);
    });
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  public String getStartEstimate() {
    final Boolean include = myFields.isIncluded("startEstimate", false);
    if (myQueuedBuild == null || (include != null && !include)) return null;
    return ValueWithDefault.decideDefault(include, () -> {
      final BuildEstimates buildEstimates = myQueuedBuild.getBuildEstimates();
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
    return ValueWithDefault.decideDefault(include, () -> {
      final BuildEstimates buildEstimates = myQueuedBuild.getBuildEstimates();
      if (buildEstimates == null) return null;

      final TimeInterval timeInterval = buildEstimates.getTimeInterval();
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java

      final TimeInterval timeInterval = buildEstimates.getTimeInterval();
      if (timeInterval == null) return null;

      if (TeamCityProperties.getBoolean("rest.beans.build.startEstimate.legacyBehavior")) {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
        //this property support can be dropped in TeamCity 2017.2
        final TimePoint endPoint = timeInterval.getEndPoint();
        if (endPoint == null) return null;
        return Util.formatTime(endPoint.getAbsoluteTime());
      }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
      }
      TimePoint result = timeInterval.getStartPoint();
      if (result == TimePoint.NEVER) return null;
      return Util.formatTime(result.getAbsoluteTime());
    });
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  public Agents getCompatibleAgents() {
    if (myQueuedBuild == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  public static Comment getCanceledComment(@NotNull final SBuild build, @NotNull final Fields fields, @NotNull final BeanContext context) {
    final CanceledInfo canceledInfo = build.getCanceledInfo();
    if (canceledInfo == null) return null;

    jetbrains.buildServer.users.User user = null;
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
    if (myBuild == null) {
      //todo: support serving artifact dependencies for queued build, may be rename the node
      return null;
    }
    return ValueWithDefault.decideDefault(myFields.isIncluded("artifact-dependencies", false), () -> {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
        SBuildAgent agent = getEstimatedAgent();
        if(agent == null) {
          return null;
        }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  public NamedDatas getMetadata() {
    if (myBuild == null) {
      return null;
    } else {
      return ValueWithDefault.decideDefaultIgnoringAccessDenied(myFields.isIncluded("metadata", false, false), () -> {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  @XmlElement(name = "finishOnAgentDate")
  public String getFinishOnAgentDate() {
    return ValueWithDefault.decideDefault(myFields.isIncluded("finishOnAgentDate"), () -> myBuild != null ? Util.formatTime(myBuild.getFinishOnAgentDate()) : null);
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  @XmlElement(name = CANCELED_INFO)
  public Comment getCanceledInfo() {  //TeamCity API: is only available for running or finished build, while isCanceled is available for queued
    return myBuild == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded(CANCELED_INFO, false),
                                                                   () -> getCanceledComment(myBuild, myFields.getNestedField(CANCELED_INFO, Fields.NONE, Fields.LONG), myBeanContext));
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  @XmlAttribute
  public String getNumber() {
    return myBuild == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("number", true), myBuild::getBuildNumber);
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  public String getFinishEstimate() {
    if(myQueuedBuild == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
      () -> {
        BuildEstimates estimates = myQueuedBuild.getBuildEstimates();
        if(estimates == null) return null;

        TimeInterval estimateInterval = estimates.getTimeInterval();
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java

        TimeInterval estimateInterval = estimates.getTimeInterval();
        if(estimateInterval == null) return null;

        TimePoint endPoint = estimateInterval.getEndPoint();
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
        TimePoint endPoint = estimateInterval.getEndPoint();
        if(TimePoint.NEVER.equals(endPoint) || endPoint == null) {
          return null;
        }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  public Builds getBuildDependencies() {
    if (!myFields.isIncluded("snapshot-dependencies", false, true)) {
      return null;
    }
    return ValueWithDefault.decideDefault(
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
    if (myBuild != null) {
      //todo: support serving for the running/finished builds, via a link
      return null;
    }
    return ValueWithDefault.decideDefault(myFields.isIncluded("custom-artifact-dependencies", false), () -> {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
        SBuildAgent agent = getEstimatedAgent();
        if(agent == null) {
          return null;
        }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
        SRunningBuild delayer = agent.getRunningBuild();
        if(delayer == null) {
          return null;
        }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
  public Comment getPinInfo() {
    if (myBuild == null || !myBuild.isPinned()) {
      return null;
    }
    return ValueWithDefault.decideDefault(myFields.isIncluded("pinInfo", false), () -> {
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
    return ValueWithDefault.decideDefault(myFields.isIncluded("pinInfo", false), () -> {
      final jetbrains.buildServer.serverSide.comments.Comment pinComment = getPinComment(myBuild);
      if (pinComment == null) return null;
      return new Comment(pinComment, myFields.getNestedField("pinInfo", Fields.NONE, Fields.LONG), myBeanContext);
    });
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
    return ValueWithDefault.decideDefault(myFields.isIncluded("user", false), () -> {
      final SUser owner = myBuildPromotion.getOwner();
      return owner == null ? null : new User(owner, myFields.getNestedField("user"), myBeanContext);
    });
  }
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
        return buildTypeExternalId;
      } else {
        return null;
      }
    });
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
        SBuild sequenceBuild = ((BuildPromotionEx) myBuildPromotion).getSequenceBuild();
        if(sequenceBuild == null || sequenceBuild.getBuildPromotion().equals(myBuildPromotion)) {
          return null;
        }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
    default <TYPE> TYPE getSingleValue(@NotNull Dimension<TYPE> dimension) {
      List<TYPE> values = get(dimension);
      if (values == null || values.isEmpty()) return null;

      if (values.size() > 1) {
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `stream` is redundant
in `src/jetbrains/buildServer/server/rest/SwaggerUIUtil.java`
#### Snippet
```java
      throw new IllegalArgumentException(String.format("File %s was not found", fullPath));
    } else {
      InputStream stream = classLoader.getResourceAsStream(fullPath);
      return stream;
    }
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
            i++;//just load CPU
          }
          Thread.sleep(1000 - loadMsInSecond);
        } else {
          Thread.sleep(totalTimeMs - (System.currentTimeMillis() - startTime));
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
          Thread.sleep(1000 - loadMsInSecond);
        } else {
          Thread.sleep(totalTimeMs - (System.currentTimeMillis() - startTime));
        }
      }
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy field 'myDescriptionProvider'
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   * @param locator
   */
  public Locator(@NotNull final Locator locator) {
    myRawValue = locator.myRawValue;
    modified = locator.modified;
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'strategyAnnotation' to 'FieldStrategy'
in `src/jetbrains/buildServer/server/rest/util/fieldInclusion/FieldInclusionChecker.java`
#### Snippet
```java

    } else {
      FieldStrategy rule = (FieldStrategy)strategyAnnotation;
      myStrategies.put(rule.name(), rule);
    }
```

## RuleId[id=NumericOverflow]
### NumericOverflow
Numeric overflow in expression
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Project.java`
#### Snippet
```java
    // todo (TeamCity) can return some huge number for some reason: TW-19894
    final long fromNow_ms = interval.getStartPoint().getAbsoluteTime().getTime() - (new Date()).getTime();
    return 0 <= fromNow_ms && fromNow_ms <= 1000 * 60 * 60 * 24 * 100;
  }

```

