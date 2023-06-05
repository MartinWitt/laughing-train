# teamcity-rest 
 
# Bad smells
I found 966 bad smells with 87 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 157 | false |
| UNCHECKED_WARNING | 98 | false |
| NotNullFieldNotInitialized | 86 | false |
| Deprecation | 78 | false |
| DataFlowIssue | 72 | false |
| DefaultAnnotationParam | 50 | false |
| UNUSED_IMPORT | 42 | false |
| UnnecessaryToStringCall | 37 | true |
| ConstantValue | 34 | false |
| CommentedOutCode | 24 | false |
| JavadocReference | 23 | false |
| UnnecessaryModifier | 21 | true |
| JavadocLinkAsPlainText | 19 | false |
| TrivialIf | 18 | false |
| UnusedAssignment | 15 | false |
| InnerClassMayBeStatic | 13 | true |
| FieldCanBeLocal | 11 | false |
| UnnecessaryStringEscape | 10 | true |
| DuplicatedCode | 9 | false |
| NullableProblems | 7 | false |
| ArraysAsListWithZeroOrOneArgument | 7 | false |
| MismatchedCollectionQueryUpdate | 6 | false |
| DeprecatedIsStillUsed | 6 | false |
| SuspiciousMethodCalls | 6 | false |
| IgnoreResultOfCall | 5 | false |
| Contract | 5 | false |
| UnnecessarySemicolon | 5 | false |
| UnnecessaryCallToStringValueOf | 5 | false |
| ConditionCoveredByFurtherCondition | 5 | false |
| FieldMayBeFinal | 5 | false |
| EmptyStatementBody | 4 | false |
| DuplicateExpressions | 4 | false |
| RedundantMethodOverride | 4 | false |
| StringConcatenationInLoops | 4 | false |
| NullArgumentToVariableArgMethod | 4 | false |
| SpringXmlModelInspection | 4 | false |
| ProtectedMemberInFinalClass | 4 | true |
| CollectionAddAllCanBeReplacedWithConstructor | 4 | false |
| DuplicateBranchesInSwitch | 3 | false |
| SimplifiableConditionalExpression | 3 | false |
| IfStatementWithIdenticalBranches | 3 | false |
| BoxingBoxedValue | 3 | false |
| DanglingJavadoc | 3 | false |
| WrapperTypeMayBePrimitive | 2 | false |
| LongLiteralsEndingWithLowercaseL | 2 | false |
| SpringBeanConstructorArgInspection | 2 | false |
| EqualsBetweenInconvertibleTypes | 2 | false |
| FunctionalExpressionCanBeFolded | 2 | false |
| SlowAbstractSetRemoveAll | 2 | false |
| RedundantStringFormatCall | 2 | false |
| ComparatorMethodParameterNotUsed | 2 | false |
| SpringXmlAutowireExplicitlyInspection | 2 | false |
| BusyWait | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| PointlessArithmeticExpression | 1 | false |
| SortedCollectionWithNonComparableKeys | 1 | false |
| RegExpRedundantEscape | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| RedundantTypeArguments | 1 | false |
| MismatchedStringBuilderQueryUpdate | 1 | false |
| AccessStaticViaInstance | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| SimplifiableBooleanExpression | 1 | false |
| ExtendsAnnotation | 1 | false |
| PointlessNullCheck | 1 | false |
| ReplaceInefficientStreamCount | 1 | false |
| IOStreamConstructor | 1 | false |
| RedundantCast | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| CopyConstructorMissesField | 1 | false |
| NumericOverflow | 1 | false |
| CastCanBeRemovedNarrowingVariableType | 1 | false |
| SuspiciousIndentAfterControlStatement | 1 | false |
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

## RuleId[id=WrapperTypeMayBePrimitive]
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

## RuleId[id=UnnecessaryModifier]
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

  interface Entity<M, S> {
    public void persist();

    @NotNull
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

    @NotNull
    public S getSingle(final @NotNull String featureLocator, final @NotNull Fields fields, final @NotNull BeanContext beanContext);

    public void delete(final @NotNull String featureLocator, final @NotNull ServiceLocator serviceLocator);
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
in `src/jetbrains/buildServer/server/rest/request/FilesSubResource.java`
#### Snippet
```java
     * @param response true if the request is processed and response is complete. false if the response is not written into and the processing should be continued
     */
    public boolean processDownload(@NotNull Element element, @NotNull HttpServletRequest request, @NotNull HttpServletResponse response);
  }

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
  }

  public enum Direction {
    FORWARD, BACKWARD;
  }
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

  @NotNull
  public Direction getDirection();

  static PaginationArguments everything() {
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
in `src/jetbrains/buildServer/server/rest/model/agent/Compatibility.java`
#### Snippet
```java
    SBuildType getBuildType();

    public boolean isCompatible();

    @Nullable
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
  public String getContentHref(@Nullable Element element);

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
in `src/jetbrains/buildServer/server/rest/model/files/FileApiUrlBuilder.java`
#### Snippet
```java
public interface FileApiUrlBuilder {
  @NotNull
  public String getMetadataHref(@Nullable Element element);

  @NotNull
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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `src/jetbrains/buildServer/server/rest/data/problem/ProblemOccurrenceFinder.java`
#### Snippet
```java
          try {
            final BuildPromotion buildByPromotionId = buildPromotionFinder.getBuildPromotion(Long.valueOf(buildId));
            if (buildByPromotionId.getBuildType() == null) {
              //missing build type, skip. Workaround for http://youtrack.jetbrains.com/issue/TW-34733
            } else {
```

### EmptyStatementBody
`else` statement has empty body
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentPoolFinder.java`
#### Snippet
```java
      if (project != null) {
        result.add(project);
      } else {
        //todo: include not present projects into the list
      }
```

### EmptyStatementBody
`else` statement has empty body
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
        //use "artifact-dependencies" as the only dependencies as this allows to repeat a build
        setDepsWithNullCheck(customizer, getBuildPatchedDeps(submittedBuildType.getArtifactDependencies(), false, serviceLocator, artifactDepsBuildsPosted));
      } else {
        //no artifact dependencies customizations necessary
      }
```

### EmptyStatementBody
`if` statement has empty body
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
        pos = pos + DIMENSION_COMPLEX_VALUE_START_DELIMITER.length();
      } else if (text.startsWith(DIMENSION_COMPLEX_VALUE_END_DELIMITER, pos)) {
        if (nesting == 0) {
          //out of order ")", ignore
        } else {
```

## RuleId[id=UnnecessaryStringEscape]
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
      agentPoolManager.associateProjectsWithPool(agentPoolId, Collections.singleton(postedProject.getProjectId()));
    } catch (NoSuchAgentPoolException e) {
      throw new BadRequestException("Agent pool with id \'" + agentPoolId + "' is not found.");
    }
    return new Project(postedProject, Fields.LONG, myBeanContext);
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
in `src/jetbrains/buildServer/server/rest/data/DataProvider.java`
#### Snippet
```java
      agentPoolManager.moveAgentTypesToPool(agentPoolId, Collections.singleton(agentTypeId)); //this moves the entire agent type to the pool, not only the agent, TW-40502
    } catch (NoSuchAgentPoolException e) {
      throw new IllegalStateException("Agent pool with id \'" + agentPoolId + "' is not found.");
    } catch (PoolQuotaExceededException e) {
      throw new IllegalStateException(e.getMessage());
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

## RuleId[id=CommentedOutCode]
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
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootFinder.java`
#### Snippet
```java

        if (personalSupportService != null) {
//          if (null != personalSupportService.mapPath(Arrays.asList(new VcsSettings(root, "")), repositoryIdStringWithoutType, true).getMappedPath())
//          return true;
          List<Boolean> canAffectList = personalSupportService.canAffect(Arrays.asList(new VcsSettings(root, "")), Collections.singletonList(repositoryIdStringWithoutType), true);
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
Commented out code (4 lines)
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
  //============================= Main definition methods =============================

  //public AbstractTypedFinder<ITEM> description(@NotNull final String description) {
  //  myDescription = description;
  //  return this;
```

### CommentedOutCode
Commented out code (5 lines)
in `src/jetbrains/buildServer/server/rest/model/agent/AgentPool.java`
#### Snippet
```java
      resultLocator.setDimension(AgentPoolFinder.ID, String.valueOf(id));
    }
    /*
    //todo: implement this in finder!
    if (name != null) {
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
Commented out code (2 lines)
in `src/jetbrains/buildServer/server/rest/jersey/JacksonObjectMapperResolver.java`
#### Snippet
```java
    LOG.debug("Using own customized ObjectMapper for class '" + type.getCanonicalName() + "'");

//    final String name = type.getPackage().getName();
//    return name.startsWith("jetbrains.buildServer.server.rest") ? myMapper : null;

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
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
    throw new NotFoundException("No build can be found by number '" + buildNumber + "' in the build type with id '" + buildType.getExternalId() + "'");

    /*
    final BuildPromotion singleItem = findSingleItem(locator);
    if (singleItem != null) { //will find it the regular way, go for it with all due checks
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

## RuleId[id=LongLiteralsEndingWithLowercaseL]
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

## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'UserAvatarsManagerResolver'#treeend

*** ** * ** ***

|--------------------------------------|---|-----------|
| **UserAvatarsManagerResolver(...):** |   | **Bean:** |
| UserAvatarsManager object            |   | **???**   |
in `src/META-INF/build-server-plugin-rest-api.xml`
#### Snippet
```java
  <!-- <aop:aspectj-autoproxy/> -->

  <bean id="userAvatarsManagerResolver" class="jetbrains.buildServer.server.rest.jersey.UserAvatarsManagerResolver">
    <constructor-arg ref="userAvatarsManager"/>
  </bean>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AgentPoolActionsAccessCheckerImpl'#treeend

*** ** * ** ***

|---------------------------------------------|---|-----------|
| **AgentPoolActionsAccessCheckerImpl(...):** |   | **Bean:** |
| SecurityContextEx securityContext           |   | **???**   |
in `src/META-INF/build-server-plugin-rest-api.xml`
#### Snippet
```java
  </bean>

  <bean id="agentPoolActionsAccessChecker" class="jetbrains.buildServer.server.graphql.resolver.agentPool.AgentPoolActionsAccessCheckerImpl">
    <property name="agentPoolManager" ref="hiddenAgentPoolManager" />
    <property name="projectManager" ref="projectManager" />
```

## RuleId[id=NotNullFieldNotInitialized]
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
in `src/jetbrains/buildServer/server/graphql/resolver/AgentResolver.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private BuildTypeFinder myBuildTypeFinder;

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
  private AgentPoolFinder myAgentPoolFinder;

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
  private AgentTypeFinder myAgentTypeFinder;

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
  protected WebLinks myWebLinks;
  @NotNull private Fields myFields;
  @NotNull private BeanContext myBeanContext;
  /**
   * These are used only when posting a link to the change
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
  private BuildTypeResolver myBuildTypeResolver;

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
  private ResolverExceptionHandler myExceptionHandler;

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
  private AgentTypeResolver myAgentTypeResolver;

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
  private CloudImageResolver myCloudImageResolver;

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
  private Query myQuery;

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
  private AgentPoolMutation myAgentPoolMutation;

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
in `src/jetbrains/buildServer/server/graphql/model/mutation/UnassignBuildTypeFromAgentInput.java`
#### Snippet
```java
  private int myAgentRawId;

  @NotNull
  private String myBuildTypeRawId;

```

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
@XmlRootElement(name = "groupApprovalRule")
public class GroupApprovalRuleStatus {
  @NotNull protected BuildPromotionEx myBuildPromotionEx;
  @NotNull protected ApprovalRule myApprovalRule;
  @NotNull protected Fields myFields;
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
  private PaginationArgumentsProvider myPaginationArgumentsProvider;

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
  private ProjectFinder myProjectFinder;

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
  @NotNull
  private SRunningBuild myBuild;
  @NotNull private Fields myFields;
  @NotNull private BeanContext myBeanContext;

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
  @NotNull
  private Fields myFields;
  @NotNull
  private BeanContext myBeanContext;

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
in `src/jetbrains/buildServer/server/graphql/model/mutation/AssignBuildTypeWithAgentInput.java`
#### Snippet
```java
public class AssignBuildTypeWithAgentInput {
  private int myAgentRawId;
  @NotNull
  private String myBuildTypeRawId;

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
  @NotNull protected BuildPromotionEx myBuildPromotionEx;
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
  @NotNull protected ApprovalRule myApprovalRule;
  @NotNull protected Fields myFields;
  @NotNull protected BeanContext myBeanContext;
  @NotNull protected ApprovableBuildManager myApprovableBuildManager;

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
in `src/jetbrains/buildServer/server/graphql/model/mutation/UnassignProjectBuildTypesFromAgentInput.java`
#### Snippet
```java
  private int myAgentRawId;

  @NotNull
  private String myProjectRawId;

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
@ModelDescription("Represents approval status for this build, if applicable.")
public class ApprovalInfo {
  @NotNull private BuildPromotionEx myBuildPromotionEx;
  @NotNull private Fields myFields;
  @NotNull private BeanContext myBeanContext;
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
  @NotNull private BuildPromotionEx myBuildPromotionEx;
  @NotNull private Fields myFields;
  @NotNull private BeanContext myBeanContext;
  @NotNull private ApprovableBuildManager myApprovableBuildManager;
  @NotNull private Boolean myApprovalFeatureEnabled;
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
  private AgentTypeManager myAgentTypeManager;

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
in `src/jetbrains/buildServer/server/graphql/resolver/CloudImageResolver.java`
#### Snippet
```java

  @Autowired
  @NotNull
  private AgentPoolManager myAgentPoolManager;

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
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  private Fields myFields = Fields.LONG;

  @NotNull
  private BeanContext myBeanContext;

```

## RuleId[id=DuplicateBranchesInSwitch]
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

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `newValue == null ? null : Boolean.valueOf(newValue)`
in `src/jetbrains/buildServer/server/rest/model/versionedSettings/VersionedSettingsConfig.java`
#### Snippet
```java
        return;
      case "showSettingsChanges":
        myShowSettingsChanges = newValue == null ? null : Boolean.valueOf(newValue);
        return;
      case "buildSettingsMode":
```

### DuplicateExpressions
Multiple occurrences of `newValue == null ? null : Boolean.valueOf(newValue)`
in `src/jetbrains/buildServer/server/rest/model/versionedSettings/VersionedSettingsConfig.java`
#### Snippet
```java
        return;
      case "allowUIEditing":
        myAllowUIEditing = newValue == null ? null : Boolean.valueOf(newValue);
        return;
      case "storeSecureValuesOutsideVcs":
```

### DuplicateExpressions
Multiple occurrences of `newValue == null ? null : Boolean.valueOf(newValue)`
in `src/jetbrains/buildServer/server/rest/model/versionedSettings/VersionedSettingsConfig.java`
#### Snippet
```java
        return;
      case "storeSecureValuesOutsideVcs":
        myStoreSecureValuesOutsideVcs = newValue == null ? null : Boolean.valueOf(newValue);
        return;
      case "portableDsl":
```

### DuplicateExpressions
Multiple occurrences of `newValue == null ? null : Boolean.valueOf(newValue)`
in `src/jetbrains/buildServer/server/rest/model/versionedSettings/VersionedSettingsConfig.java`
#### Snippet
```java
        return;
      case "portableDsl":
        myPortableDsl = newValue == null ? null : Boolean.valueOf(newValue);
        return;
      default:
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

## RuleId[id=Deprecation]
### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/CloudUtil.java`
#### Snippet
```java
  @Nullable
  public SProject getProject(@NotNull final CloudImage image) {
    return Util.resolveNull(getProfile(image), this::getProject);
  }

```

### Deprecation
'resolveNull(T, java.util.function.Function, R)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudProfileFinder.java`
#### Snippet
```java
      dimensionString(ID).description("profile id").
        filter((value, item) -> value.equals(item.getProfileId())).
        toItems(dimension -> Util.resolveNull(myCloudUtil.findProfileGloballyById(dimension), Collections::singletonList, Collections.emptyList()));

      dimensionValueCondition(NAME).description("profile name").valueForDefaultFilter(CloudProfile::getProfileName);
```

### Deprecation
'resolveNull(T, java.util.function.Function, R)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudProfileFinder.java`
#### Snippet
```java

      dimensionWithFinder(INSTANCE, () -> myServiceLocator.getSingletonService(CloudInstanceFinder.class), "instances of the profiles").
        filter((value, item) -> value.stream().anyMatch(instance -> Util.resolveNull(myCloudUtil.getProfile(instance.getInstance().getImage()), p -> p.getProfileId().equals(item.getProfileId()), false))).
        toItems(instances -> instances.stream().map(instance -> instance.getInstance().getImage()).distinct().map(image -> myCloudUtil.getProfile(image)).filter(Objects::nonNull).distinct().collect(Collectors.toList()));

```

### Deprecation
'resolveNull(T, java.util.function.Function, R)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudProfileFinder.java`
#### Snippet
```java

      dimensionWithFinder(IMAGE, () -> myServiceLocator.getSingletonService(CloudImageFinder.class), "images of the profiles").
        filter((value, item) -> value.stream().anyMatch(image -> Util.resolveNull(myCloudUtil.getProfile(image), p -> p.getProfileId().equals(item.getProfileId()), false))).
        toItems(images -> images.stream().map(image -> myCloudUtil.getProfile(image)).filter(Objects::nonNull).distinct().collect(Collectors.toList()));

```

### Deprecation
'resolveNull(T, java.util.function.Function, R)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudProfileFinder.java`
#### Snippet
```java

      dimensionProjects(PROJECT, myServiceLocator).description("projects defining the cloud profiles").
        valueForDefaultFilter(item -> Util.resolveNull(myProjectManager.findProjectById(item.getProjectId()), p -> Collections.singleton(p), Collections.emptySet())).
        toItems(projects -> projects.stream().flatMap(project -> myCloudManager.listProfilesByProject(project.getProjectId(), false).stream()).collect(Collectors.toList()));

```

### Deprecation
'resolveNull(T, java.util.function.Function, R)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudProfileFinder.java`
#### Snippet
```java

      dimensionProjects(AFFECTED_PROJECT, myServiceLocator).description("projects where the cloud profiles are accessible").
        filter((projects, item) -> Util.resolveNull(myCloudUtil.getProject(item), p -> CloudUtil.containProjectOrParent(projects, p), false))
        .toItems(projects -> projects.stream().flatMap(project -> myCloudManager.listProfilesByProject(project.getProjectId(), true).stream()).collect(Collectors.toList()));

```

### Deprecation
'jetbrains.buildServer.server.rest.util.BeanFactory' is deprecated
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntity.java`
#### Snippet
```java
  static public BeanContext getFakeBeanContext(@NotNull final ServiceLocator serviceLocator) {
    final ApiUrlBuilder apiUrlBuilder = new ApiUrlBuilder(path -> path);
    final BeanFactory beanFactory = new BeanFactory(null);

    return new BeanContext(beanFactory, serviceLocator, apiUrlBuilder);
```

### Deprecation
'jetbrains.buildServer.server.rest.util.BeanFactory' is deprecated
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntity.java`
#### Snippet
```java
  static public BeanContext getFakeBeanContext(@NotNull final ServiceLocator serviceLocator) {
    final ApiUrlBuilder apiUrlBuilder = new ApiUrlBuilder(path -> path);
    final BeanFactory beanFactory = new BeanFactory(null);

    return new BeanContext(beanFactory, serviceLocator, apiUrlBuilder);
```

### Deprecation
'jetbrains.buildServer.server.rest.util.BeanFactory' is deprecated
in `src/jetbrains/buildServer/server/rest/jersey/BeanContextProvider.java`
#### Snippet
```java
  private final ServiceLocator myServiceLocator;

  public BeanContextProvider(final RequestPathTransformInfo requestPathTransformInfo, final BeanFactory factory, final ServiceLocator serviceLocator) {
    myRequestPathTransformInfo = requestPathTransformInfo;
    myFactory = factory;
```

### Deprecation
'jetbrains.buildServer.server.rest.util.BeanFactory' is deprecated
in `src/jetbrains/buildServer/server/rest/jersey/BeanContextProvider.java`
#### Snippet
```java
  @Context private HttpServletRequest request;

  private final BeanFactory myFactory;
  private final ServiceLocator myServiceLocator;

```

### Deprecation
'resolveNull(T, java.util.function.Function, R)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudImageFinder.java`
#### Snippet
```java
    @NotNull
    private List<CloudImage> findImageByProfileAndId(@NotNull CloudUtil.ImageIdData profileAndId) {
      return Util.resolveNull(myCloudUtil.getImage(profileAndId.profileId, profileAndId.id), Collections::singletonList, Collections.emptyList());
    }

```

### Deprecation
'resolveNull(T, java.util.function.Function, R)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudImageFinder.java`
#### Snippet
```java

    private boolean checkImageByProfileAndId(CloudUtil.ImageIdData profileAndId, CloudImage item) {
      return profileAndId.id.equals(item.getId()) && Util.resolveNull(myCloudUtil.getProfile(item), p -> profileAndId.profileId.equals(p.getProfileId()), false);
    }

```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudImageFinder.java`
#### Snippet
```java
      dimensionValueCondition(ERROR)
        .description("image error message")
        .valueForDefaultFilter(cloudImage -> Util.resolveNull(cloudImage.getErrorInfo(), CloudErrorInfo::getMessage));

      dimensionAgents(AGENT, myServiceLocator)
```

### Deprecation
'resolveNull(T, java.util.function.Function, R)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudImageFinder.java`
#### Snippet
```java
      dimensionProjects(AFFECTED_PROJECT, myServiceLocator)
        .description("projects where the cloud profiles/images are accessible")
        .filter((projects, item) -> Util.resolveNull(myCloudUtil.getProject(item), p -> CloudUtil.containProjectOrParent(projects, p), false))
        .toItems(projects -> projects
          .stream()
```

### Deprecation
'resolveNull(T, java.util.function.Function, R)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudImageFinder.java`
#### Snippet
```java
    @NotNull
    private Predicate<AgentPool> poolIsAssociatedWithCloudImage(@NotNull CloudImage cloudImage) {
      return pool -> Util.resolveNull(cloudImage.getAgentPoolId(), id -> id.equals(pool.getAgentPoolId()), false);
    }
  }
```

### Deprecation
'getSchema()' is deprecated
in `src/jetbrains/buildServer/server/rest/swagger/SwaggerUtil.java`
#### Snippet
```java
        final Map<String, Response> responses = operation.getResponses();
        for (Response response : responses.values()) {
          final Property schema = response.getSchema();
          if (schema instanceof RefProperty) {
            RefProperty rp = (RefProperty)schema;
```

### Deprecation
'jetbrains.buildServer.server.rest.data.util.Matcher' is deprecated
in `src/jetbrains/buildServer/server/rest/data/TimeCondition.java`
#### Snippet
```java
  }

  public class ParsedTimeCondition implements Matcher<Date> {
    @Nullable private final TimeWithPrecision myLimitingSinceDate;
    @NotNull private final TimeWithPrecision myLimitingDate;
```

### Deprecation
'jetbrains.buildServer.server.rest.util.BeanFactory' is deprecated
in `src/jetbrains/buildServer/server/rest/util/BeanContext.java`
#### Snippet
```java

  public BeanContext(
    BeanFactory factory,
    @NotNull ServiceLocator serviceLocator,
    @NotNull ApiUrlBuilder apiUrlBuilder
```

### Deprecation
'jetbrains.buildServer.server.rest.data.util.Matcher' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootFinder.java`
#### Snippet
```java
    final List<String> properties = locator.getDimensionValue(PROPERTY);
    if (!properties.isEmpty()) {
      final Matcher<ParametersProvider> parameterCondition = ParameterCondition.create(properties);
      result.add(vcsRoot -> parameterCondition.matches(new AbstractMapParametersProvider(vcsRoot.getProperties())));
    }
```

### Deprecation
'jetbrains.buildServer.server.rest.data.finder.impl.BuildFinder' is deprecated
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private BuildFinder myBuildFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private ProjectFinder myProjectFinder;
```

### Deprecation
'jetbrains.buildServer.server.rest.data.finder.impl.BuildFinder' is deprecated
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
    ServiceLocator serviceLocator,
    @NotNull DataProvider dataProvider,
    BuildFinder buildFinder,
    BuildTypeFinder buildTypeFinder,
    ProjectFinder projectFinder,
```

### Deprecation
'jetbrains.buildServer.server.rest.data.finder.impl.BuildFinder' is deprecated
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
    myDataProvider = dataProvider;
    myServiceLocator = firstNonNull(serviceLocator, beanContext.getServiceLocator());
    myBuildFinder = firstNonNull(buildFinder, myServiceLocator.findSingletonService(BuildFinder.class));
    myBuildTypeFinder = firstNonNull(buildTypeFinder, myServiceLocator.findSingletonService(BuildTypeFinder.class));
    myProjectFinder = firstNonNull(projectFinder, myServiceLocator.findSingletonService(ProjectFinder.class));
```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/problem/ProblemWrapper.java`
#### Snippet
```java
  public String getDescription() {
    //see jetbrains.buildServer.serverSide.impl.problems.BuildProblemImpl.getTypeDescription
    return Util.resolveNull(myServiceLocator.getSingletonService(ProblemDetailsProviderService.class).getProviders().get(type), p -> p.getTypeDescription());
  }

```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/model/agent/BooleanStatus.java`
#### Snippet
```java
    status = ValueWithDefault.decideIncludeByDefault(fields.isIncluded("status"), statusP);
    comment = lastCommentP == null ? null : ValueWithDefault.decideIncludeByDefault(fields.isIncluded("comment", false),
                                                                                    () -> Util.resolveNull(lastCommentP.get(), v -> new Comment(v,
                                                                                                           fields.getNestedField("comment", Fields.NONE, Fields.LONG), beanContext)));
  }
```

### Deprecation
Overrides deprecated method in 'graphql.execution.DataFetcherExceptionHandler'
in `src/jetbrains/buildServer/server/graphql/util/ResolverExceptionHandler.java`
#### Snippet
```java

  @Override
  public DataFetcherExceptionHandlerResult onException(DataFetcherExceptionHandlerParameters handlerParameters) {
    Throwable exception = handlerParameters.getException();
    SourceLocation sourceLocation = handlerParameters.getSourceLocation();
```

### Deprecation
'jetbrains.buildServer.server.rest.util.BeanFactory' is deprecated
in `src/jetbrains/buildServer/server/rest/request/ProblemOccurrenceRequest.java`
#### Snippet
```java
  @Context @NotNull private ProblemOccurrencesTreeCollector myProblemOccurrencesTreeCollector;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private BeanFactory myFactory;

  public static final String API_SUB_URL = Constants.API_URL + "/problemOccurrences";
```

### Deprecation
'jetbrains.buildServer.server.rest.data.util.Matcher' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootInstanceFinder.java`
#### Snippet
```java
    final List<String> properties = locator.getDimensionValue(PROPERTY);
    if (!properties.isEmpty()) {
      final Matcher<ParametersProvider> parameterCondition = ParameterCondition.create(properties);
      result.add(item -> parameterCondition.matches(new AbstractMapParametersProvider(item.getProperties())));
    }
```

### Deprecation
'jetbrains.buildServer.server.rest.data.util.Matcher' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootInstanceFinder.java`
#### Snippet
```java
    if (properties.isEmpty()) return;

    final Matcher<ParametersProvider> parameterCondition = ParameterCondition.create(properties);

    for (Iterator<SVcsRoot> iterator = vcsRoots.iterator(); iterator.hasNext(); ) {
```

### Deprecation
'jetbrains.buildServer.server.rest.data.finder.impl.BuildFinder' is deprecated
in `src/jetbrains/buildServer/server/rest/request/RootApiRequest.java`
#### Snippet
```java
  public static final String VERSION = "/version";
  @Context @NotNull private DataProvider myDataProvider;
  @Context @NotNull private BuildFinder myBuildFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private ProjectFinder myProjectFinder;
```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
    description = ValueWithDefault.decideDefault(
      fields.isIncluded("description"),
      () -> Util.resolveNull(project.getDescription(), d -> StringUtil.isEmpty(d) ? null : d)
    );

```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
    parentProject = ValueWithDefault.decideDefault(
      fields.isIncluded("parentProject", false),
      () -> Util.resolveNull(actualParentProject.get(), (v) -> new Project(v, fields.getNestedField("parentProject"), beanContext))
    );

```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
    parentProjectId = ValueWithDefault.decideDefault(
      fields.isIncluded("parentProjectId"),
      () -> Util.resolveNull(actualParentProject.get(), parent -> parent.getExternalId())
    );

```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
    final boolean forceParentAttributes = TeamCityProperties.getBoolean("rest.beans.project.addParentProjectAttributes");
    parentProjectName = ValueWithDefault.decideDefault(forceParentAttributes || fields.isIncluded("parentProjectName", false, false),
                                                       () -> Util.resolveNull(actualParentProject.get(), v -> v.getFullName()));
    parentProjectInternalId = ValueWithDefault.decideDefault(forceParentAttributes || fields.isIncluded("parentProjectInternalId", includeInternal, includeInternal),
                                                             () -> Util.resolveNull(actualParentProject.get(), v -> v.getProjectId()));
```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/model/project/Project.java`
#### Snippet
```java
                                                       () -> Util.resolveNull(actualParentProject.get(), v -> v.getFullName()));
    parentProjectInternalId = ValueWithDefault.decideDefault(forceParentAttributes || fields.isIncluded("parentProjectInternalId", includeInternal, includeInternal),
                                                             () -> Util.resolveNull(actualParentProject.get(), v -> v.getProjectId()));

  }
```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/model/problem/TestOccurrence.java`
#### Snippet
```java
      }
      return ValueWithDefault.decideDefault(myChecker.isIncluded("nextFixed", myFields),
                                            () -> Util.resolveNull(myTestRun.getFixedIn(),
                                                                   (fi) -> new TestOccurrence(getSuccessfulTestRun(fi, myTestRun), myBeanContext, myFields.getNestedField("nextFixed"))));
    } catch (IllegalArgumentException | UnsupportedOperationException e) {
```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/model/problem/TestOccurrence.java`
#### Snippet
```java

      return ValueWithDefault.decideDefault(myChecker.isIncluded("firstFailed", myFields),
                                            () -> Util.resolveNull(myTestRun.getFirstFailed(),
                                                                   (ff) -> new TestOccurrence(getFailedTestRun(ff, myTestRun), myBeanContext,
                                                                                              myFields.getNestedField("firstFailed"))));
```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/model/problem/TestOccurrence.java`
#### Snippet
```java
  @FieldStrategy(name = "mute", defaultForShort = FieldRule.EXCLUDE)
  public Mute getMute() {
    return Util.resolveNull(myTestRun.getMuteInfo(),
                            (mi) -> ValueWithDefault.decideDefault(myChecker.isIncluded("mute", myFields),
                                                                   () -> new Mute(mi, myFields.getNestedField("mute", Fields.NONE, Fields.LONG), myBeanContext)));
```

### Deprecation
'jetbrains.buildServer.server.rest.util.BeanFactory' is deprecated
in `src/jetbrains/buildServer/server/rest/request/VersionedSettingsRequest.java`
#### Snippet
```java
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanFactory myFactory;
  @Context @NotNull private VersionedSettingsTokensService myVersionedSettingsTokensService;
  @Context @NotNull private PermissionChecker myPermissionChecker;
```

### Deprecation
'jetbrains.buildServer.server.rest.util.BeanFactory' is deprecated
in `src/jetbrains/buildServer/server/rest/request/VersionedSettingsRequest.java`
#### Snippet
```java
  protected void initForTests(@NotNull ApiUrlBuilder apiUrlBuilder,
                              @NotNull ServiceLocator serviceLocator,
                              @NotNull BeanFactory beanFactory,
                              @NotNull ProjectFinder projectFinder,
                              @NotNull VersionedSettingsBeanCollector versionedSettingsBeanCollector,
```

### Deprecation
'jetbrains.buildServer.server.rest.data.util.Matcher' is deprecated
in `src/jetbrains/buildServer/server/rest/data/ParameterCondition.java`
#### Snippet
```java

  @NotNull
  public static Matcher<ParametersProvider> create(@Nullable final List<String> propertyConditionLocators) {
    if (propertyConditionLocators == null || propertyConditionLocators.isEmpty()) {
      return parametersProvider -> true;
```

### Deprecation
'jetbrains.buildServer.server.rest.util.BeanFactory' is deprecated
in `src/jetbrains/buildServer/server/rest/request/ServerRequest.java`
#### Snippet
```java
  private ApiUrlBuilder myApiUrlBuilder;
  @Context
  private BeanFactory myFactory;

  @SuppressWarnings("NullableProblems") @Context @NotNull
```

### Deprecation
'jetbrains.buildServer.server.rest.util.BeanFactory' is deprecated
in `src/jetbrains/buildServer/server/rest/request/ServerRequest.java`
#### Snippet
```java
    @NotNull ServiceLocator serviceLocator,
    @NotNull ApiUrlBuilder apiUrlBuilder,
    @NotNull BeanFactory beanFactory,
    @NotNull BeanContext beanContext,
    @NotNull PermissionChecker permissionChecker) {
```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/CloudInstanceData.java`
#### Snippet
```java
  @Nullable
  public String getError() {
    return Util.resolveNull(myInstance.getErrorInfo(), CloudErrorInfo::getMessage);
  }
}
```

### Deprecation
'resolveNull(T, java.util.function.Function, R)' is deprecated
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudProfile.java`
#### Snippet
```java
  public Project getProject() {
    return ValueWithDefault.decideDefault(myFields.isIncluded("project", false),
                                          () -> Util.resolveNull(myBeanContext.getSingletonService(CloudUtil.class).getProject(myCloudProfile),
                                                                 p -> new Project(p, myFields.getNestedField("project"), myBeanContext),
                                                                 new Project(null, myCloudProfile.getProjectId(), myFields.getNestedField("project"), myBeanContext)));
```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudInstance.java`
#### Snippet
```java
  public Agent getAgent() {
    return ValueWithDefault.decideDefault(myFields.isIncluded("agent", false),
                                          () -> Util.resolveNull(myCloudInstance.getAgent(), a -> new Agent(a, myFields.getNestedField("agent"), myBeanContext)));
  }

```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/problem/TestOccurrenceFinder.java`
#### Snippet
```java
    boolean needsActualOccurrence = fields.isIncluded("testOccurrence", false, false);
    if(needsActualOccurrence) {
      Status status = Util.resolveNull(locator.lookupSingleDimensionValue(STATUS), TestOccurrence::getStatusFromPosted);
      if(status == null || status != Status.FAILURE) {
        return TestOccurrencesCachedInfo.empty();
```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/problem/TestOccurrenceFinder.java`
#### Snippet
```java
    }

    Status status = Util.resolveNull(locator.getSingleDimensionValue(STATUS), TestOccurrence::getStatusFromPosted);
    if (status != null) {
      result.add(item -> status.equals(item.getStatus()));
```

### Deprecation
'jetbrains.buildServer.server.rest.data.finder.impl.BuildFinder' is deprecated
in `src/jetbrains/buildServer/server/rest/data/problem/TestOccurrenceFinder.java`
#### Snippet
```java
      if (buildDimension != null) {
        // Include test runs from personal build if user is looking for one specific build.
        boolean searchByBuildId = new Locator(buildDimension).isAnyPresent(BuildFinder.DIMENSION_ID);
        locator.setDimensionIfNotPresent(INCLUDE_PERSONAL, Boolean.toString(searchByBuildId));

```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/problem/TestOccurrenceFinder.java`
#### Snippet
```java
    }

    if (locator == null || loadAllTests || Util.resolveNull(locator.lookupSingleDimensionValue(STATUS), TestOccurrence::getStatusFromPosted) != Status.FAILURE) {
      optionsMask |= BuildStatisticsOptions.PASSED_TESTS;
    }
```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudImage.java`
#### Snippet
```java
  @XmlElement(name = "errorMessage")
  public String getErrorMessage() {
    return ValueWithDefault.decideDefault(myFields.isIncluded("errorMessage", true), () -> Util.resolveNull(myCloudImage.getErrorInfo(), e-> e.getMessage()));
  }

```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudImage.java`
#### Snippet
```java
  public CloudProfile getProfile() {
    return ValueWithDefault.decideDefault(myFields.isIncluded("profile", false),
                                          () -> Util.resolveNull(myBeanContext.getSingletonService(CloudUtil.class).getProfile(myCloudImage), p -> new CloudProfile(p, myFields.getNestedField("profile"), myBeanContext)));
  }

```

### Deprecation
'jetbrains.buildServer.server.rest.util.BeanFactory' is deprecated
in `src/jetbrains/buildServer/server/rest/request/TestRequest.java`
#### Snippet
```java
  @Context @NotNull private TestFinder myTestFinder;
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private BeanFactory myBeanFactory;

  public static final String API_SUB_URL = Constants.API_URL + "/tests";
```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentPoolFinder.java`
#### Snippet
```java
      dimensionBoolean(PROJECT_POOL).description("project pool").hidden().valueForDefaultFilter(agentPool -> agentPool.isProjectPool());  //hidden for now (might want to rethink naming)
      dimensionProjects(OWNER_PROJECT, myServiceLocator).description("project which defines the project pool").hidden(). //hidden for now (might want to rethink naming)
        valueForDefaultFilter(agentPool -> Util.resolveNull(getPoolOwnerProject(agentPool), ownerProject -> new HashSet<>(CollectionsUtil.setOf(ownerProject.getProject()))));
      dimensionProjects(PROJECT, myServiceLocator).description("projects associated with the agent pool").
        valueForDefaultFilter(agentPool -> new HashSet<>(getPoolProjects(agentPool)));
```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
                                            SBuild nextBuild = (SBuild)associatedData.get(ArtifactDependencyChangesProvider.NEW_BUILD_ATTR);
                                            if (prevBuild == null && nextBuild == null) return null;
                                            return new BuildChangeData(Util.resolveNull(prevBuild, (b) -> b.getBuildPromotion()),
                                                                       Util.resolveNull(nextBuild, (b) -> b.getBuildPromotion()));
                                          })
```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
                                            if (prevBuild == null && nextBuild == null) return null;
                                            return new BuildChangeData(Util.resolveNull(prevBuild, (b) -> b.getBuildPromotion()),
                                                                       Util.resolveNull(nextBuild, (b) -> b.getBuildPromotion()));
                                          })
                                          .filter(Objects::nonNull).collect(Collectors.toList());
```

### Deprecation
'jetbrains.buildServer.server.rest.util.BeanFactory' is deprecated
in `src/jetbrains/buildServer/server/rest/data/DataProvider.java`
#### Snippet
```java
                      @NotNull final BuildPromotionManager promotionManager,
                      @NotNull final ChangesCheckingService changesCheckingService,
                      @NotNull final BeanFactory beanFactory,
                      @NotNull final ConfigurableApplicationContext applicationContext,
                      @NotNull final DBFunctionsProvider dbFunctionsProvider,
```

### Deprecation
'jetbrains.buildServer.server.rest.util.BeanFactory' is deprecated
in `src/jetbrains/buildServer/server/rest/data/DataProvider.java`
#### Snippet
```java
  @NotNull private final BuildPromotionManager myPromotionManager;
  @NotNull private final ChangesCheckingService myChangesCheckingService;
  @NotNull private final BeanFactory myBeanFactory;
  @NotNull private final ConfigurableApplicationContext myApplicationContext;
  @NotNull private final DBFunctionsProvider myDbFunctionsProvider;
```

### Deprecation
'jetbrains.buildServer.server.rest.util.BeanFactory' is deprecated
in `src/jetbrains/buildServer/server/rest/data/DataProvider.java`
#### Snippet
```java

  @NotNull
  public BeanFactory getBeanFactory() {
    return myBeanFactory;
  }
```

### Deprecation
'jetbrains.buildServer.server.rest.data.finder.impl.BuildFinder' is deprecated
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
  void initForTests(@NotNull final BeanContext beanContext) {
    myBeanContext = beanContext;
    myBuildFinder = myBeanContext.getSingletonService(BuildFinder.class);
    myBuildPromotionFinder = myBeanContext.getSingletonService(BuildPromotionFinder.class);
    myBuildTypeFinder = myBeanContext.getSingletonService(BuildTypeFinder.class);
```

### Deprecation
'jetbrains.buildServer.server.rest.data.finder.impl.BuildFinder' is deprecated
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
  public static final String ARTIFACTS = "/artifacts";

  @Context @NotNull private BuildFinder myBuildFinder;
  @Context @NotNull private BuildPromotionFinder myBuildPromotionFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
```

### Deprecation
'resolveNull(T, java.util.function.Function, R)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudInstanceFinder.java`
#### Snippet
```java

      dimensionProjects(AFFECTED_PROJECT, myServiceLocator).description("projects where the cloud profiles/images are accessible").
        filter((projects, item) -> Util.resolveNull(myCloudUtil.getInstanceProject(item), p -> CloudUtil.containProjectOrParent(projects, p), false)).
        toItems(projects -> projects.stream()
                                    .flatMap(project -> myCloudManager.listProfilesByProject(project.getProjectId(), true).stream())
```

### Deprecation
'resolveNull(T, java.util.function.Function, R)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudInstanceFinder.java`
#### Snippet
```java
  private boolean checkInstanceHasGivenIds(@NotNull CloudUtil.InstanceIdData instanceIdData, @NotNull CloudInstanceData instanceData) {
    return instanceIdData.id.equals(instanceData.getInstance().getInstanceId()) && instanceIdData.imageId.equals(instanceData.getCloudImageId())
           && Util.resolveNull(myCloudUtil.getProfile(instanceData.getInstance().getImage()), p -> instanceIdData.profileId.equals(p.getProfileId()), false);
  }

```

### Deprecation
'resolveNull(T, java.util.function.Function, R)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudInstanceFinder.java`
#### Snippet
```java
  @NotNull
  private List<CloudInstanceData> getCloudInstanceDataById(@NotNull CloudUtil.InstanceIdData instanceIdData) {
    return Util.resolveNull(myCloudUtil.getInstance(instanceIdData.profileId, instanceIdData.imageId, instanceIdData.id),
                            i -> Collections.singletonList(new CloudInstanceData(i, instanceIdData.profileId, myServiceLocator)), Collections.emptyList());
  }
```

### Deprecation
'jetbrains.buildServer.server.rest.data.finder.impl.BuildFinder' is deprecated
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
  private static final Pattern NON_ALPHA_NUM_PATTERN = Pattern.compile("[^a-zA-Z0-9-#.]+");

  @Context @NotNull private BuildFinder myBuildFinder;
  @Context @NotNull private BuildTypeFinder myBuildTypeFinder;
  @Context @NotNull private ProjectFinder myProjectFinder;
```

### Deprecation
'jetbrains.buildServer.server.rest.util.BeanFactory' is deprecated
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
  @Context @NotNull private ApiUrlBuilder myApiUrlBuilder;
  @Context @NotNull private ServiceLocator myServiceLocator;
  @Context @NotNull private BeanFactory myFactory;
  @Context @NotNull private BeanContext myBeanContext;
  @Context @NotNull public PermissionChecker myPermissionChecker;
```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
    return ValueWithDefault.decideDefault(
      myFields.isIncluded("type",false, false),
      () -> Util.resolveNull(myBuildType.getSettingsEx(), (e) -> e.getOption(BuildTypeOptions.BT_BUILD_CONFIGURATION_TYPE).toLowerCase()), s -> BuildTypeOptions.BuildConfigurationType.REGULAR.name().equalsIgnoreCase(s)
    );
  }
```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/model/change/BuildChange.java`
#### Snippet
```java

  public BuildChange(BuildChangeData buildChange, final @NotNull Fields fields, @NotNull final BeanContext beanContext) {
    nextBuild = ValueWithDefault.decideDefault(fields.isIncluded("nextBuild"), () -> Util.resolveNull(buildChange.getNextBuild(), (b) -> new Build(b, fields.getNestedField("nextBuild"), beanContext)));
    prevBuild = ValueWithDefault.decideDefault(fields.isIncluded("prevBuild"), () -> Util.resolveNull(buildChange.getPreviousBuild(), (b) -> new Build(b, fields.getNestedField("prevBuild"), beanContext)));
  }
```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/model/change/BuildChange.java`
#### Snippet
```java
  public BuildChange(BuildChangeData buildChange, final @NotNull Fields fields, @NotNull final BeanContext beanContext) {
    nextBuild = ValueWithDefault.decideDefault(fields.isIncluded("nextBuild"), () -> Util.resolveNull(buildChange.getNextBuild(), (b) -> new Build(b, fields.getNestedField("nextBuild"), beanContext)));
    prevBuild = ValueWithDefault.decideDefault(fields.isIncluded("prevBuild"), () -> Util.resolveNull(buildChange.getPreviousBuild(), (b) -> new Build(b, fields.getNestedField("prevBuild"), beanContext)));
  }
}
```

### Deprecation
'projectLocator' is deprecated
in `src/jetbrains/buildServer/server/rest/request/VcsRootRequest.java`
#### Snippet
```java
  @NotNull
  private SProject getVcsRootProject(@NotNull final VcsRoot description, @NotNull final BeanContext context) {
    if (!StringUtil.isEmpty(description.projectLocator)){
      if (description.project != null){
        throw new BadRequestException("Only one from 'projectLocator' attribute and 'project' element should be specified.");
```

### Deprecation
'projectLocator' is deprecated
in `src/jetbrains/buildServer/server/rest/request/VcsRootRequest.java`
#### Snippet
```java
        throw new BadRequestException("Only one from 'projectLocator' attribute and 'project' element should be specified.");
      }
      return myProjectFinder.getItem(description.projectLocator);
    }else{
      if (description.project == null){
```

### Deprecation
'jetbrains.buildServer.server.rest.data.finder.impl.BuildFinder' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ChangeFinder.java`
#### Snippet
```java
  @NotNull private final PermissionChecker myPermissionChecker;
  @NotNull private final ProjectFinder myProjectFinder;
  @NotNull private final BuildFinder myBuildFinder;
  @NotNull private final BuildPromotionFinder myBuildPromotionFinder;
  @NotNull private final BuildTypeFinder myBuildTypeFinder;
```

### Deprecation
'jetbrains.buildServer.server.rest.data.finder.impl.BuildFinder' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ChangeFinder.java`
#### Snippet
```java
  public ChangeFinder(
    @NotNull ProjectFinder projectFinder,
    @NotNull BuildFinder buildFinder,
    @NotNull BuildPromotionFinder buildPromotionFinder,
    @NotNull BuildTypeFinder buildTypeFinder,
```

### Deprecation
'resolveNull(T, java.util.function.Function)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
            return user.getId() == owner.getId();
          }
          SUser actualUser = Util.resolveNull(getTriggeredBy(item), TriggeredBy::getUser);
          return actualUser != null && user.getId() == actualUser.getId();
      });
```

### Deprecation
'resolveNull(T, java.util.function.Function, R)' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
    if (triggeredDimension != null) {
      final ItemFilter<TriggeredBy> filter = myTriggerByFinder.getFilter(triggeredDimension);
      result.add(item -> Util.resolveNull(getTriggeredBy(item), filter::isIncluded, false));
    }

```

### Deprecation
'jetbrains.buildServer.server.rest.data.util.Matcher' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
    final List<String> properties = locator.getDimensionValue(CommonLocatorDimensionsList.PROPERTY);
    if (!properties.isEmpty()) {
      final Matcher<ParametersProvider> parameterCondition = ParameterCondition.create(properties);
      result.add(item -> {
          if (!Build.canViewRuntimeData(myPermissionChecker, item)) return false;
```

### Deprecation
'jetbrains.buildServer.server.rest.data.util.Matcher' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
    final List<String> statisticValues = locator.getDimensionValue(STATISTIC_VALUE);
    if (!statisticValues.isEmpty()) {
      final Matcher<ParametersProvider> parameterCondition = ParameterCondition.create(statisticValues);
      result.add(item -> parameterCondition.matches(new AbstractMapParametersProvider(Build.getBuildStatisticsValues(item))));
    }
```

### Deprecation
'jetbrains.buildServer.server.rest.data.finder.impl.BuildFinder' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
    }

    BuildFinder legacyFinder = myServiceLocator.getSingletonService(BuildFinder.class);
    return legacyFinder.getBuildsLegacy(buildType, locator);
  }
```

### Deprecation
'jetbrains.buildServer.server.rest.data.finder.impl.BuildFinder' is deprecated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
    }

    BuildFinder legacyFinder = myServiceLocator.getSingletonService(BuildFinder.class);
    return legacyFinder.getBuildsLegacy(buildType, locator);
  }
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`(value == null) ? false: value` can be simplified to 'value!=null \&\& value'
in `src/jetbrains/buildServer/server/rest/model/CopyOptionsDescription.java`
#### Snippet
```java

  private static boolean toBoolean(final Boolean value) {
    return (value == null) ? false: value;
  }
}
```

### SimplifiableConditionalExpression
`myHidden == null ? false : myHidden` can be simplified to 'myHidden!=null \&\& myHidden'
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java

    public boolean getHidden() {
      return myHidden == null ? false : myHidden;
    }

```

### SimplifiableConditionalExpression
`myIgnoreCase == null ? false : myIgnoreCase` can be simplified to 'myIgnoreCase!=null \&\& myIgnoreCase'
in `src/jetbrains/buildServer/server/rest/data/ValueCondition.java`
#### Snippet
```java

  public boolean getActualIgnoreCase() {
    return myIgnoreCase == null ? false : myIgnoreCase;
  }

```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/jetbrains/buildServer/server/rest/data/investigations/InvestigationFinder.java`
#### Snippet
```java
    final ResponsibilityEntry.State state = responsibilityInfo.getState();
    if (state.equals(ResponsibilityEntry.State.NONE)) {
      return Collections.<InvestigationWrapper>emptyList();
    } else {
      return Collections.singletonList(new InvestigationWrapper(getBuildTypeRE(buildType)));
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
in `src/jetbrains/buildServer/server/graphql/model/mutation/agentPool/UpdateAgentPoolInput.java`
#### Snippet
```java

public class UpdateAgentPoolInput {
  @NotNull
  private int myRawId;
  @Nullable
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

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Projects.java`
#### Snippet
```java
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Project" maxOccurs="unbounded">
```

### JavadocLinkAsPlainText
Link specified as plain text
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Projects.java`
#### Snippet
```java
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *                 &lt;attribute name="activity" use="required">
```

### JavadocLinkAsPlainText
Link specified as plain text
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Projects.java`
#### Snippet
```java
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *                 &lt;attribute name="activity" use="required">
 *                   &lt;simpleType>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Projects.java`
#### Snippet
```java
 *                 &lt;attribute name="activity" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="Sleeping"/>
 *                       &lt;enumeration value="Building"/>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Projects.java`
#### Snippet
```java
 *                 &lt;attribute name="lastBuildStatus" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="Exception"/>
 *                       &lt;enumeration value="Success"/>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Projects.java`
#### Snippet
```java
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="lastBuildLabel" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *                 &lt;attribute name="lastBuildTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="nextBuildTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Projects.java`
#### Snippet
```java
 *                 &lt;/attribute>
 *                 &lt;attribute name="lastBuildLabel" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *                 &lt;attribute name="lastBuildTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="nextBuildTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="webUrl" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Projects.java`
#### Snippet
```java
 *                 &lt;attribute name="lastBuildLabel" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *                 &lt;attribute name="lastBuildTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="nextBuildTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="webUrl" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Projects.java`
#### Snippet
```java
 *                 &lt;attribute name="lastBuildTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="nextBuildTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="webUrl" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/jetbrains/buildServer/server/rest/model/change/Revision.java`
#### Snippet
```java

  /**
   * Experimental, https://youtrack.jetbrains.com/issue/TW-42653
   */
  @XmlElement(name = VcsRootEntry.CHECKOUT_RULES)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
  /**
   * Experimental use only!
   * Related to https://youtrack.jetbrains.com/issue/TW-37419
   */
  @GET
```

### JavadocLinkAsPlainText
Link specified as plain text
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Project.java`
#### Snippet
```java
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="activity" use="required">
```

### JavadocLinkAsPlainText
Link specified as plain text
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Project.java`
#### Snippet
```java
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="activity" use="required">
 *         &lt;simpleType>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Project.java`
#### Snippet
```java
 *       &lt;attribute name="activity" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Sleeping"/>
 *             &lt;enumeration value="Building"/>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Project.java`
#### Snippet
```java
 *       &lt;attribute name="lastBuildStatus" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Exception"/>
 *             &lt;enumeration value="Success"/>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Project.java`
#### Snippet
```java
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="lastBuildLabel" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="lastBuildTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="nextBuildTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Project.java`
#### Snippet
```java
 *       &lt;/attribute>
 *       &lt;attribute name="lastBuildLabel" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="lastBuildTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="nextBuildTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="webUrl" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Project.java`
#### Snippet
```java
 *       &lt;attribute name="lastBuildLabel" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="lastBuildTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="nextBuildTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="webUrl" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `contrib/src/jetbrains/buildServer/server/restcontrib/cctray/model/Project.java`
#### Snippet
```java
 *       &lt;attribute name="lastBuildTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="nextBuildTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="webUrl" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/jetbrains/buildServer/server/rest/data/build/GenericBuildsFilter.java`
#### Snippet
```java
  @NotNull private final BranchMatcher myBranchMatcher;
  @Nullable private final String myAgentName;
  @NotNull private final ServiceLocator myServiceLocator;
  @Nullable private final Set<SBuildAgent> myAgents;
  @Nullable private final RangeLimit mySince;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/jetbrains/buildServer/server/rest/jersey/ExtensionHolderProviderFactory.java`
#### Snippet
```java

  private final ExtensionHolder myExtensionHolder;
  private final String myPluginName;

  public ExtensionHolderProviderFactory(@NotNull ExtensionHolder extensionHolder, final String pluginName) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootFinder.java`
#### Snippet
```java
  @NotNull private final VcsManager myVcsManager;
  @NotNull private final ProjectFinder myProjectFinder;
  @NotNull private final Finder<BuildTypeOrTemplate> myBuildTypeFinder; //todo: add filtering by (multiple) build types???
  @NotNull private final ProjectManager myProjectManager;
  @NotNull private final VcsRootIdentifiersManager myVcsRootIdentifiersManager;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/jetbrains/buildServer/server/rest/model/RelatedEntity.java`
#### Snippet
```java
   */
  @XmlAttribute(name = "internalId")
  private String internalId;


```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/jetbrains/buildServer/server/rest/model/RelatedEntity.java`
#### Snippet
```java
public class RelatedEntity { //see also Related
  @XmlAttribute(name = "type")
  private String type;

  @XmlAttribute(name = "unknown")
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/jetbrains/buildServer/server/rest/model/problem/scope/TestScopes.java`
#### Snippet
```java
  private Fields myFields;
  private BeanContext myContext;
  private UriInfo myUriInfo;
  private PagerData myPagerData;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/jetbrains/buildServer/server/rest/data/TimeWithPrecision.java`
#### Snippet
```java

  private static class TimeFormat {
    @NotNull private final String myTimeFormat;
    private final boolean mySecondsPrecision;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/jetbrains/buildServer/server/rest/data/TimeWithPrecision.java`
#### Snippet
```java
  private static class TimeFormat {
    @NotNull private final String myTimeFormat;
    private final boolean mySecondsPrecision;

    public TimeFormat(@NotNull final String timeFormat, final boolean secondsPrecision) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/jetbrains/buildServer/server/rest/data/DataProvider.java`
#### Snippet
```java
  @NotNull private final BuildHistory myBuildHistory;
  @NotNull private final UserModel myUserModel;
  @NotNull private final RolesManager myRolesManager;
  @NotNull private final VcsManager myVcsManager;
  @NotNull private final WebLinks myWebLinks;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/jetbrains/buildServer/server/rest/model/UnknownEntity.java`
#### Snippet
```java
public class UnknownEntity {
  @XmlAttribute(name = "internalId")
  private String internalId;

  @XmlAttribute(name = "type")
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/jetbrains/buildServer/server/rest/model/UnknownEntity.java`
#### Snippet
```java

  @XmlAttribute(name = "type")
  private String type;

  @SuppressWarnings("unused")
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Stream.findFirst()` is ignored
in `src/jetbrains/buildServer/server/rest/data/util/itemholder/ItemHolder.java`
#### Snippet
```java
  @NotNull
  static <T> ItemHolder<T> of(@NotNull Stream<? extends T> items) {
    return processor -> items.filter(item -> !processor.processItem(item)).findFirst();
  }

```

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

### IgnoreResultOfCall
Result of `Stream.findFirst()` is ignored
in `src/jetbrains/buildServer/server/rest/data/finder/impl/CloudImageFinder.java`
#### Snippet
```java
        // this is equialent of takeWhile
        allImages.filter(image -> !itemProcessor.processItem(image))
                 .findFirst();
      };
    }
```

### IgnoreResultOfCall
Result of `Stream.allMatch()` is ignored
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ChangeFinder.java`
#### Snippet
```java
      if (pending) {
        Stream<SVcsModificationOrChangeDescriptor> changes = getPendingChanges(buildType, locator);
        return processor -> changes.allMatch(processor::processItem);
      } else {
        locator.markUnused(PENDING);
```

### IgnoreResultOfCall
Result of `Stream.allMatch()` is ignored
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ChangeFinder.java`
#### Snippet
```java
    if (buildType != null) {
      Stream<SVcsModificationOrChangeDescriptor> changes = getBranchChanges(buildType, SelectPrevBuildPolicy.SINCE_NULL_BUILD, locator);
      return processor -> changes.allMatch(processor::processItem);
    }

```

## RuleId[id=FunctionalExpressionCanBeFolded]
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

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/jetbrains/buildServer/server/rest/model/Properties.java`
#### Snippet
```java
  }

  @XmlAttribute(name = "href", required = false)
  public String getHref() {
    return myHref;
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
  public String getHref() {
    return myPagerData == null ? null : ValueWithDefault.decideDefault(myFields.isIncluded("href"),
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
  @XmlAttribute(required = false) @Nullable public String nextHref;
  @XmlAttribute(required = false) @Nullable public String prevHref;
  @XmlAttribute(required = false) @Nullable public String href;

  public CloudProfiles() {}
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
in `src/jetbrains/buildServer/server/rest/model/build/Branches.java`
#### Snippet
```java
  public Integer count;

  @XmlAttribute(required = false)
  @Nullable
  public String href;
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
import jetbrains.buildServer.server.rest.util.BuildTypeOrTemplate;
```

### UNUSED_IMPORT
Unused import `import io.swagger.annotations.ExtensionProperty;`
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesSnapshotDep.java`
#### Snippet
```java
package jetbrains.buildServer.server.rest.model.buildType;

import io.swagger.annotations.ExtensionProperty;
import jetbrains.buildServer.ServiceLocator;
import jetbrains.buildServer.server.rest.data.PermissionChecker;
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
import jetbrains.buildServer.server.rest.util.BuildTypeOrTemplate;
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
      final Set<SVcsRoot> vcsRoots = new HashSet<SVcsRoot>(myServiceLocator.getSingletonService(VcsRootFinder.class).getItems(vcsRoot).getEntries());
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
        new HashSet<jetbrains.buildServer.vcs.VcsRootInstance>(myServiceLocator.getSingletonService(VcsRootInstanceFinder.class).getItems(vcsRootInstance).getEntries());
      final List<SBuildType> result = new ArrayList<SBuildType>();
```

### MismatchedCollectionQueryUpdate
Contents of collection `vcsRoots` are queried, but never updated
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java
      final String vcsRoot = locator.getSingleDimensionValue(VCS_ROOT_DIMENSION);
      if (vcsRoot != null) {
        final Set<SVcsRoot> vcsRoots = new HashSet<>(myServiceLocator.getSingletonService(VcsRootFinder.class).getItems(vcsRoot).getEntries());
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
          new HashSet<>(myServiceLocator.getSingletonService(VcsRootInstanceFinder.class).getItems(vcsRootInstance).getEntries());
        result.add(item -> {
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

## RuleId[id=SlowAbstractSetRemoveAll]
### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   */
  public void markUnused(@NotNull String... dimensionNames) {
    myUsedDimensions.removeAll(Arrays.asList(dimensionNames));
  }

```

### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
  private void reportKnownButNotReportedDimensions() {
    final Set<String> usedDimensions = new HashSet<>(myUsedDimensions);
    if (mySupportedDimensions != null) usedDimensions.removeAll(Arrays.asList(mySupportedDimensions));
    usedDimensions.removeAll(myHiddenSupportedDimensions);
    if (usedDimensions.size() > 0) {
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

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'equals()' call
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
  private boolean isStateIncluded(@NotNull final Locator stateLocator, @NotNull final String state) {
    final String singleValue = stateLocator.getSingleValue();
    if (singleValue != null && (STATE_ANY.equals(singleValue) || state.equals(singleValue))) {
      return true;
    }
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+` in loop
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
          row = rs.getString(1);
          for (int i = 2; i < columnCount + 1; i++) {
            row = row + myFieldDelimiter + rs.getString(i);
          }
        } catch (SQLException e) {
```

### StringConcatenationInLoops
String concatenation `+` in loop
in `src/jetbrains/buildServer/server/rest/request/DebugRequest.java`
#### Snippet
```java
        row = metaData.getColumnName(1);
        for (int i = 2; i < metaData.getColumnCount() + 1; i++) {
          row = row + myFieldDelimiter + metaData.getColumnName(i);
        }
      } catch (SQLException e) {
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/jetbrains/buildServer/server/rest/swagger/ExtensionModelResolver.java`
#### Snippet
```java

    for (String word : words) {
      result += StringUtils.capitalize(word);
    }

```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/jetbrains/buildServer/server/rest/jersey/ExceptionMapperBase.java`
#### Snippet
```java
          for (Errors.ErrorMessage errorMessage : messages) {
            // the data is not accessible otherwise
            result += "\"" + field.get(errorMessage) + "\",";
          }
          result += ")";
```

## RuleId[id=NullArgumentToVariableArgMethod]
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

### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/jetbrains/buildServer/server/rest/request/ChangeRequest.java`
#### Snippet
```java

    final UriBuilder requestUriBuilder = uriInfo.getRequestUriBuilder();
    requestUriBuilder.replaceQueryParam("count" , null);
    requestUriBuilder.replaceQueryParam("start", null);
    return new Changes(buildModifications.getEntries(),
```

### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/jetbrains/buildServer/server/rest/request/ChangeRequest.java`
#### Snippet
```java
    final UriBuilder requestUriBuilder = uriInfo.getRequestUriBuilder();
    requestUriBuilder.replaceQueryParam("count" , null);
    requestUriBuilder.replaceQueryParam("start", null);
    return new Changes(buildModifications.getEntries(),
                       new PagerDataImpl(requestUriBuilder, request.getContextPath(), buildModifications, locatorText, "locator"),
```

## RuleId[id=UnusedAssignment]
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
Variable `myDescription` initializer `null` is redundant
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
    @NotNull protected final Dimension myDimension;
    @NotNull protected final DimensionValueMapper<TYPE> myValueMapper;
    protected String myDescription = null;
    protected Boolean myHidden = null;

```

### UnusedAssignment
Variable `myHidden` initializer `null` is redundant
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
    @NotNull protected final DimensionValueMapper<TYPE> myValueMapper;
    protected String myDescription = null;
    protected Boolean myHidden = null;

    public TypedFinderDimensionImpl(@NotNull final Dimension dimension, @NotNull final DimensionValueMapper<TYPE> valueMapper) {
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
Variable `locator` initializer `null` is redundant
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildFinder.java`
#### Snippet
```java
    }

    Locator locator = null;
    try {
      locator = locatorText != null ? new Locator(locatorText) : Locator.createEmptyLocator();
```

## RuleId[id=ConstantValue]
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
Condition `!(build instanceof BaseBuild)` is always `false` when reached
in `src/jetbrains/buildServer/server/rest/data/build/BuildParametersUtil.java`
#### Snippet
```java
  public static ParametersProvider getStartParameters(@NotNull BuildPromotion buildPromotion) {
    SBuild build = buildPromotion.getAssociatedBuild();
    if (build == null || !(build instanceof BaseBuild)) {
      return new MapParametersProviderImpl();
    }
```

### ConstantValue
Condition `!(build instanceof BaseBuild)` is always `false` when reached
in `src/jetbrains/buildServer/server/rest/data/build/BuildParametersUtil.java`
#### Snippet
```java
  public static ParametersProvider getResultingParameters(@NotNull BuildPromotion buildPromotion) {
    SBuild build = buildPromotion.getAssociatedBuild();
    if(build == null || !(build instanceof BaseBuild)) {
      return new MapParametersProviderImpl();
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
Value `result` is always 'false'
in `src/jetbrains/buildServer/server/rest/model/Fields.java`
#### Snippet
```java
      }
    }
    return result;
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
Condition `exception instanceof AccessDeniedException` is always `true`
in `src/jetbrains/buildServer/server/graphql/util/ResolverExceptionHandler.java`
#### Snippet
```java
    }

    if(exception instanceof AccessDeniedException) {
      GraphQLError error = builder.errorType(TeamCityGraphQLErrorType.ACCESS_DENIED).build();

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
Condition `experimental == null` is always `false`
in `src/jetbrains/buildServer/server/rest/model/metrics/Metrics.java`
#### Snippet
```java

    final Boolean experimental = fields.isIncluded("experimental", false, false);
    final List<MetricValue> metricValues = metricsReader.queryBuilder().withExperimental(experimental == null || experimental).build();
    
    metrics = ValueWithDefault.decideDefault(fields.isIncluded("metric", true, true), () -> {
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
            return processInvocationExpansion(item, locator.getSingleDimensionValueAsBoolean(EXPAND_INVOCATIONS));
          }
          if (!(item instanceof MultiTestRun)) return null;
          for (STestRun testRun : getInvocations(item)) {
            if ((long)testRun.getTestRunId() == idDimension) {
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
Value `include` is always 'true'
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
    final Boolean include = myFields.isIncluded("startEstimate", false);
    if (myQueuedBuild == null || (include != null && !include)) return null;
    return ValueWithDefault.decideDefault(include, () -> {
      final BuildEstimates buildEstimates = myQueuedBuild.getBuildEstimates();
      if (buildEstimates == null) return null;
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

## RuleId[id=Contract]
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashMap' to 'java.util.Map'
in `src/jetbrains/buildServer/server/rest/model/change/VcsRootInstance.java`
#### Snippet
```java
    return check(ValueWithDefault.decideDefault(myFields.isIncluded("properties", false),
                                                () -> {
                                                  Map<String, String> properties = new LinkedHashMap<>(myRoot.getProperties());
                                                  properties.remove("teamcity:branchSpec"); //TW-56449
                                                  return new Properties(properties, null, myFields.getNestedField("properties", Fields.NONE, Fields.LONG), myBeanContext);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Collection'
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java
    }
    if ((own == null || !own) && !templates.isEmpty()) {
      HashSet<Option> optionsFromTemplates = templates.stream().flatMap(t -> t.getOwnOptions().stream()).collect(HashSet::new, Collection::add, (t1, t2) -> t1.addAll(t2));
      properties.putAll(getOptionsAsMap(buildType.get(), optionsFromTemplates));
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BranchFinder.java`
#### Snippet
```java
    // since we're going to traverse all build types form the buildTypes it makes sense to fetch branches from them once,
    // without this filter we'd traverse branches of a single build type 1 + as many times as it is accessible via snapshot dependencies
    final Set<SBuildType> myFilteredBuildTypes = new HashSet<>(buildTypes);
    return data -> !myFilteredBuildTypes.contains(data);
  }
```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BranchFinder.java`
#### Snippet
```java
    // since we're going to traverse all build types form the buildTypes it makes sense to fetch branches from them once,
    // without this filter we'd traverse branches of a single build type 1 + as many times as it is accessible via snapshot dependencies
    final Set<SBuildType> myFilteredBuildTypes = new HashSet<>(buildTypes);
    return data -> !myFilteredBuildTypes.contains(data);
  }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootFinder.java`
#### Snippet
```java
      final String projectLocator = locator.getSingleDimensionValue(PROJECT);
      if (projectLocator != null) {
        Set<SProject> projects = new HashSet<>(myProjectFinder.getItemsNotEmpty(projectLocator).getEntries());
        result.add(item -> projects.contains(VcsRoot.getProjectByRoot(item)));
      }
```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootFinder.java`
#### Snippet
```java
      final String projectLocator = locator.getSingleDimensionValue(PROJECT);
      if (projectLocator != null) {
        Set<SProject> projects = new HashSet<>(myProjectFinder.getItemsNotEmpty(projectLocator).getEntries());
        result.add(item -> projects.contains(VcsRoot.getProjectByRoot(item)));
      }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.TreeSet' to 'java.util.TreeSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java

  private Iterable<SBuildAgent> calculateCanActuallyRunAgents(@NotNull final List<BuildPromotion> builds, final @NotNull ServiceLocator serviceLocator) {
    TreeSet<SBuildAgent> result = new TreeSet<>(AGENT_COMPARATOR);
    for (BuildPromotion build : builds) {
      SQueuedBuild queuedBuild = build.getQueuedBuild();
```

### UNCHECKED_WARNING
Unchecked call to 'TreeSet(Comparator)' as a member of raw type 'java.util.TreeSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java

  private Iterable<SBuildAgent> calculateCanActuallyRunAgents(@NotNull final List<BuildPromotion> builds, final @NotNull ServiceLocator serviceLocator) {
    TreeSet<SBuildAgent> result = new TreeSet<>(AGENT_COMPARATOR);
    for (BuildPromotion build : builds) {
      SQueuedBuild queuedBuild = build.getQueuedBuild();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.TreeSet' to 'java.util.TreeSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
    List<BuildPromotion> builds = finder.getItems(buildDimension).getEntries();
    //agents with the same id can be returned (not existing agents)
    TreeSet<SBuildAgent> result = new TreeSet<>(AGENT_COMPARATOR);
    for (BuildPromotion build : builds) {
      SQueuedBuild queuedBuild = build.getQueuedBuild();
```

### UNCHECKED_WARNING
Unchecked call to 'TreeSet(Comparator)' as a member of raw type 'java.util.TreeSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
    List<BuildPromotion> builds = finder.getItems(buildDimension).getEntries();
    //agents with the same id can be returned (not existing agents)
    TreeSet<SBuildAgent> result = new TreeSet<>(AGENT_COMPARATOR);
    for (BuildPromotion build : builds) {
      SQueuedBuild queuedBuild = build.getQueuedBuild();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.TreeSet' to 'java.util.TreeSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
    final boolean includeUnauthorized = authorizedDimension == null || !authorizedDimension;

    TreeSet<SBuildAgent> result = new TreeSet<>(AGENT_COMPARATOR);

    final Boolean connectedDimension = locator.getSingleDimensionValueAsBoolean(CONNECTED);
```

### UNCHECKED_WARNING
Unchecked call to 'TreeSet(Comparator)' as a member of raw type 'java.util.TreeSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
    final boolean includeUnauthorized = authorizedDimension == null || !authorizedDimension;

    TreeSet<SBuildAgent> result = new TreeSet<>(AGENT_COMPARATOR);

    final Boolean connectedDimension = locator.getSingleDimensionValueAsBoolean(CONNECTED);
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
    myDataProvider = dataProvider;
    myServiceLocator = firstNonNull(serviceLocator, beanContext.getServiceLocator());
    myBuildFinder = firstNonNull(buildFinder, myServiceLocator.findSingletonService(BuildFinder.class));
    myBuildTypeFinder = firstNonNull(buildTypeFinder, myServiceLocator.findSingletonService(BuildTypeFinder.class));
    myProjectFinder = firstNonNull(projectFinder, myServiceLocator.findSingletonService(ProjectFinder.class));
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
    myServiceLocator = firstNonNull(serviceLocator, beanContext.getServiceLocator());
    myBuildFinder = firstNonNull(buildFinder, myServiceLocator.findSingletonService(BuildFinder.class));
    myBuildTypeFinder = firstNonNull(buildTypeFinder, myServiceLocator.findSingletonService(BuildTypeFinder.class));
    myProjectFinder = firstNonNull(projectFinder, myServiceLocator.findSingletonService(ProjectFinder.class));
    myAgentPoolFinder = firstNonNull(agentPoolFinder, myServiceLocator.findSingletonService(AgentPoolFinder.class));
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
    myBuildFinder = firstNonNull(buildFinder, myServiceLocator.findSingletonService(BuildFinder.class));
    myBuildTypeFinder = firstNonNull(buildTypeFinder, myServiceLocator.findSingletonService(BuildTypeFinder.class));
    myProjectFinder = firstNonNull(projectFinder, myServiceLocator.findSingletonService(ProjectFinder.class));
    myAgentPoolFinder = firstNonNull(agentPoolFinder, myServiceLocator.findSingletonService(AgentPoolFinder.class));
    myBranchFinder = firstNonNull(branchFinder, myServiceLocator.findSingletonService(BranchFinder.class));
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
    myBuildTypeFinder = firstNonNull(buildTypeFinder, myServiceLocator.findSingletonService(BuildTypeFinder.class));
    myProjectFinder = firstNonNull(projectFinder, myServiceLocator.findSingletonService(ProjectFinder.class));
    myAgentPoolFinder = firstNonNull(agentPoolFinder, myServiceLocator.findSingletonService(AgentPoolFinder.class));
    myBranchFinder = firstNonNull(branchFinder, myServiceLocator.findSingletonService(BranchFinder.class));
    myApiUrlBuilder = firstNonNull(apiUrlBuilder, myServiceLocator.findSingletonService(ApiUrlBuilder.class));
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
    myProjectFinder = firstNonNull(projectFinder, myServiceLocator.findSingletonService(ProjectFinder.class));
    myAgentPoolFinder = firstNonNull(agentPoolFinder, myServiceLocator.findSingletonService(AgentPoolFinder.class));
    myBranchFinder = firstNonNull(branchFinder, myServiceLocator.findSingletonService(BranchFinder.class));
    myApiUrlBuilder = firstNonNull(apiUrlBuilder, myServiceLocator.findSingletonService(ApiUrlBuilder.class));
    myPermissionChecker = firstNonNull(permissionChecker, myServiceLocator.findSingletonService(PermissionChecker.class));
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
    myAgentPoolFinder = firstNonNull(agentPoolFinder, myServiceLocator.findSingletonService(AgentPoolFinder.class));
    myBranchFinder = firstNonNull(branchFinder, myServiceLocator.findSingletonService(BranchFinder.class));
    myApiUrlBuilder = firstNonNull(apiUrlBuilder, myServiceLocator.findSingletonService(ApiUrlBuilder.class));
    myPermissionChecker = firstNonNull(permissionChecker, myServiceLocator.findSingletonService(PermissionChecker.class));
  }
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
    myBranchFinder = firstNonNull(branchFinder, myServiceLocator.findSingletonService(BranchFinder.class));
    myApiUrlBuilder = firstNonNull(apiUrlBuilder, myServiceLocator.findSingletonService(ApiUrlBuilder.class));
    myPermissionChecker = firstNonNull(permissionChecker, myServiceLocator.findSingletonService(PermissionChecker.class));
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/jetbrains/buildServer/server/rest/model/project/PropEntityProjectFeature.java`
#### Snippet
```java
      builder.dimensionParameterCondition(PROPERTY).description("feature property").valueForDefaultFilter(item -> new MapParametersProviderImpl(item.getParameters()));

      builder.multipleConvertToItems(TypedFinderBuilder.DimensionCondition.ALWAYS, dimensions -> new ArrayList<>(project.getOwnFeatures()));

      builder.locatorProvider(projectFeatureDescriptor -> getLocator(projectFeatureDescriptor));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/MuteFinder.java`
#### Snippet
```java
                       .toItems(dimension -> Collections.singletonList(findMuteById(dimension.intValue())));

      dimensionTests(TEST, myServiceLocator).description("test for which mute is assigned").valueForDefaultFilter(muteInfo -> new HashSet<>(muteInfo.getTests()));
                                            //.toItems(dimension -> dimension.stream().
                                            //  flatMap(sTest -> {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.TreeSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootInstanceFinder.java`
#### Snippet
```java
  //todo: use getAllProjectUsages here?
  private Set<VcsRootInstance> getSettingsRootInstances(@NotNull final Collection<SProject> projectsInRoot) {
    Set<VcsRootInstance> result = new TreeSet<>(VCS_ROOT_INSTANCE_COMPARATOR);
    for (SProject project : projectsInRoot) {
      VcsRootInstance instance = myVersionedSettingsManager.getVersionedSettingsVcsRootInstance(project);
```

### UNCHECKED_WARNING
Unchecked call to 'TreeSet(Comparator)' as a member of raw type 'java.util.TreeSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootInstanceFinder.java`
#### Snippet
```java
  //todo: use getAllProjectUsages here?
  private Set<VcsRootInstance> getSettingsRootInstances(@NotNull final Collection<SProject> projectsInRoot) {
    Set<VcsRootInstance> result = new TreeSet<>(VCS_ROOT_INSTANCE_COMPARATOR);
    for (SProject project : projectsInRoot) {
      VcsRootInstance instance = myVersionedSettingsManager.getVersionedSettingsVcsRootInstance(project);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.TreeSet' to 'java.util.TreeSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootInstanceFinder.java`
#### Snippet
```java
  private Set<VcsRootInstance> getInstances(final @NotNull String buildTypesLocator, @Nullable final Boolean versionedSettingsUsagesOnly) {
    List<BuildTypeOrTemplate> buildTypes = getBuildTypeOrTemplates(buildTypesLocator);
    TreeSet<VcsRootInstance> result = new TreeSet<>(VCS_ROOT_INSTANCE_COMPARATOR);
    if (versionedSettingsUsagesOnly == null || !versionedSettingsUsagesOnly) {
      buildTypes.stream().flatMap(bt -> bt.getVcsRootInstanceEntries().stream()).map(vcsRE -> vcsRE.getVcsRoot()).forEach(result::add);
```

### UNCHECKED_WARNING
Unchecked call to 'TreeSet(Comparator)' as a member of raw type 'java.util.TreeSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootInstanceFinder.java`
#### Snippet
```java
  private Set<VcsRootInstance> getInstances(final @NotNull String buildTypesLocator, @Nullable final Boolean versionedSettingsUsagesOnly) {
    List<BuildTypeOrTemplate> buildTypes = getBuildTypeOrTemplates(buildTypesLocator);
    TreeSet<VcsRootInstance> result = new TreeSet<>(VCS_ROOT_INSTANCE_COMPARATOR);
    if (versionedSettingsUsagesOnly == null || !versionedSettingsUsagesOnly) {
      buildTypes.stream().flatMap(bt -> bt.getVcsRootInstanceEntries().stream()).map(vcsRE -> vcsRE.getVcsRoot()).forEach(result::add);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.TreeSet' to 'java.util.TreeSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootInstanceFinder.java`
#### Snippet
```java
  @NotNull
  private TreeSet<VcsRootInstance> getVcsRootInstancesUnderProject(@NotNull final SProject project, @Nullable final Boolean versionedSettingsUsagesOnly) {
    TreeSet<VcsRootInstance> result = new TreeSet<>(VCS_ROOT_INSTANCE_COMPARATOR);
    if (versionedSettingsUsagesOnly == null || !versionedSettingsUsagesOnly){
      result.addAll((project.getVcsRootInstances()));  //todo: includes versioned settings???
```

### UNCHECKED_WARNING
Unchecked call to 'TreeSet(Comparator)' as a member of raw type 'java.util.TreeSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootInstanceFinder.java`
#### Snippet
```java
  @NotNull
  private TreeSet<VcsRootInstance> getVcsRootInstancesUnderProject(@NotNull final SProject project, @Nullable final Boolean versionedSettingsUsagesOnly) {
    TreeSet<VcsRootInstance> result = new TreeSet<>(VCS_ROOT_INSTANCE_COMPARATOR);
    if (versionedSettingsUsagesOnly == null || !versionedSettingsUsagesOnly){
      result.addAll((project.getVcsRootInstances()));  //todo: includes versioned settings???
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.TreeSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootInstanceFinder.java`
#### Snippet
```java
    if (vcsRootLocator != null) {
      final List<SVcsRoot> vcsRoots = myVcsRootFinder.getItemsNotEmpty(vcsRootLocator).getEntries();
      final Set<VcsRootInstance> result = new TreeSet<>(VCS_ROOT_INSTANCE_COMPARATOR);

      final String buildTypesLocator = locator.getSingleDimensionValue(BUILD_TYPE);
```

### UNCHECKED_WARNING
Unchecked call to 'TreeSet(Comparator)' as a member of raw type 'java.util.TreeSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootInstanceFinder.java`
#### Snippet
```java
    if (vcsRootLocator != null) {
      final List<SVcsRoot> vcsRoots = myVcsRootFinder.getItemsNotEmpty(vcsRootLocator).getEntries();
      final Set<VcsRootInstance> result = new TreeSet<>(VCS_ROOT_INSTANCE_COMPARATOR);

      final String buildTypesLocator = locator.getSingleDimensionValue(BUILD_TYPE);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.TreeSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootInstanceFinder.java`
#### Snippet
```java
    //if reworked, can use checkPermission(Permission.VIEW_BUILD_CONFIGURATION_SETTINGS, item);
    // when implemented, can also add to jetbrains.buildServer.usageStatistics.impl.providers.StaticServerUsageStatisticsProvider.publishNumberOfVcsRoots()
    final Set<VcsRootInstance> result = new TreeSet<>(VCS_ROOT_INSTANCE_COMPARATOR);

    if (versionedSettingsUsagesOnly == null || !versionedSettingsUsagesOnly) {
```

### UNCHECKED_WARNING
Unchecked call to 'TreeSet(Comparator)' as a member of raw type 'java.util.TreeSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootInstanceFinder.java`
#### Snippet
```java
    //if reworked, can use checkPermission(Permission.VIEW_BUILD_CONFIGURATION_SETTINGS, item);
    // when implemented, can also add to jetbrains.buildServer.usageStatistics.impl.providers.StaticServerUsageStatisticsProvider.publishNumberOfVcsRoots()
    final Set<VcsRootInstance> result = new TreeSet<>(VCS_ROOT_INSTANCE_COMPARATOR);

    if (versionedSettingsUsagesOnly == null || !versionedSettingsUsagesOnly) {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `src/jetbrains/buildServer/server/rest/RequestWrapper.java`
#### Snippet
```java
  public Enumeration getHeaderNames() {
    final ArrayList headerNames = Collections.list(super.getHeaderNames());
    headerNames.add(Constants.ORIGINAL_REQUEST_URI_HEADER_NAME);
    return Collections.enumeration(headerNames);
  }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.Collection'
in `src/jetbrains/buildServer/server/rest/RequestWrapper.java`
#### Snippet
```java
    final ArrayList headerNames = Collections.list(super.getHeaderNames());
    headerNames.add(Constants.ORIGINAL_REQUEST_URI_HEADER_NAME);
    return Collections.enumeration(headerNames);
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'jetbrains.buildServer.server.rest.data.problem.tree.TreeSlicingOptions' to 'jetbrains.buildServer.server.rest.data.problem.tree.TreeSlicingOptions'
in `src/jetbrains/buildServer/server/rest/data/problem/scope/TestScopeTreeCollector.java`
#### Snippet
```java
    Comparator<Node<STestRun, TestCountersData>> order = getNodeOrder(locator);

    TreeSlicingOptions<STestRun, TestCountersData> slicingOptions = new TreeSlicingOptions<>(getMaxChildrenFunction(locator), STestRun.NEW_FIRST_NAME_COMPARATOR, order);
    String maxTotalNodesStr = locator.getSingleDimensionValue(TREE_MAX_TOTAL_NODES);
    if (maxTotalNodesStr != null) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'jetbrains.buildServer.server.rest.data.problem.tree.TreeSlicingOptions' to 'jetbrains.buildServer.server.rest.data.problem.tree.TreeSlicingOptions'
in `src/jetbrains/buildServer/server/rest/data/problem/scope/ProblemOccurrencesTreeCollector.java`
#### Snippet
```java
    Comparator<ScopeTree.Node<BuildProblem, ProblemCounters>> nodeOrder = getNodeOrder(locator);

    TreeSlicingOptions<BuildProblem, ProblemCounters> slicingOptions = new TreeSlicingOptions<>(getMaxChildrenFunction(locator), NEW_FAILED_FIRST_THEN_BY_ID, nodeOrder);

    if (locator.isAnyPresent(SUB_TREE_ROOT_ID)) {
```

### UNCHECKED_WARNING
Unchecked call to 'TreeSlicingOptions(Function, Integer\>, Comparator, Comparator\>)' as a member of raw type 'jetbrains.buildServer.server.rest.data.problem.tree.TreeSlicingOptions'
in `src/jetbrains/buildServer/server/rest/data/problem/scope/ProblemOccurrencesTreeCollector.java`
#### Snippet
```java
    Comparator<ScopeTree.Node<BuildProblem, ProblemCounters>> nodeOrder = getNodeOrder(locator);

    TreeSlicingOptions<BuildProblem, ProblemCounters> slicingOptions = new TreeSlicingOptions<>(getMaxChildrenFunction(locator), NEW_FAILED_FIRST_THEN_BY_ID, nodeOrder);

    if (locator.isAnyPresent(SUB_TREE_ROOT_ID)) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/jetbrains/buildServer/server/rest/request/ChangeRequest.java`
#### Snippet
```java
      ChangeStatusProvider myStatusProvider = myServiceLocator.getSingletonService(ChangeStatusProvider.class);
      ChangeStatus changeStatus = myStatusProvider.getMergedChangeStatus(change);
      return new FileChanges(new ArrayList<>(changeStatus.getMergedVcsModificationInfo().getChangedFiles()), new Fields(fields));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/jetbrains/buildServer/server/rest/request/ChangeRequest.java`
#### Snippet
```java
      ChangeStatusProvider myStatusProvider = myServiceLocator.getSingletonService(ChangeStatusProvider.class);
      ChangeStatus changeStatus = myStatusProvider.getMergedChangeStatus(change);
      return new FileChanges(new ArrayList<>(changeStatus.getMergedVcsModificationInfo().getChangedFiles()), new Fields(fields));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/jetbrains/buildServer/server/rest/model/problem/TestOccurrences.java`
#### Snippet
```java
    if(items != null) {
      this.items = ValueWithDefault.decideDefault(isTestOccurrenceIncluded(fields), () -> {
        final List<STestRun> sortedItems = new ArrayList<>(items);
        if (TeamCityProperties.getBoolean("rest.beans.testOccurrences.sortByNameAndNew")) {
          sortedItems.sort(STestRun.NEW_FIRST_NAME_COMPARATOR); //if we are to support customizable order, this should be done in the TestOccurrenceFinder
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/jetbrains/buildServer/server/rest/model/problem/TestOccurrences.java`
#### Snippet
```java
    if(items != null) {
      this.items = ValueWithDefault.decideDefault(isTestOccurrenceIncluded(fields), () -> {
        final List<STestRun> sortedItems = new ArrayList<>(items);
        if (TeamCityProperties.getBoolean("rest.beans.testOccurrences.sortByNameAndNew")) {
          sortedItems.sort(STestRun.NEW_FIRST_NAME_COMPARATOR); //if we are to support customizable order, this should be done in the TestOccurrenceFinder
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/jetbrains/buildServer/server/rest/request/VersionedSettingsRequest.java`
#### Snippet
```java
    try {
      Set<SProject> projectsToLoadSettingsFromVcs = getVersionedSettingsActions().getProjectsToLoadSettingsFromVcs(project);
      return new Projects(new ArrayList<>(projectsToLoadSettingsFromVcs), null, new Fields(fields), new BeanContext(myFactory, myServiceLocator, myApiUrlBuilder));
    } catch (VersionedSettingsActions.VersionedSettingsActionException e) {
      throw new OperationException(e.getMessage());
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/jetbrains/buildServer/server/rest/request/VersionedSettingsRequest.java`
#### Snippet
```java
    try {
      Set<SProject> projectsToLoadSettingsFromVcs = getVersionedSettingsActions().getProjectsToLoadSettingsFromVcs(project);
      return new Projects(new ArrayList<>(projectsToLoadSettingsFromVcs), null, new Fields(fields), new BeanContext(myFactory, myServiceLocator, myApiUrlBuilder));
    } catch (VersionedSettingsActions.VersionedSettingsActionException e) {
      throw new OperationException(e.getMessage());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashMap' to 'java.util.LinkedHashMap'
in `src/jetbrains/buildServer/server/rest/data/ParameterCondition.java`
#### Snippet
```java
      @Override
      public Map<String, String> getAll() {
        LinkedHashMap<String, String> result = new LinkedHashMap<>(larger.getAll());
        for (String key : smaller.getAll().keySet()) {
          result.remove(key);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Collection'
in `src/jetbrains/buildServer/server/rest/model/problem/Test.java`
#### Snippet
```java
        final CurrentMuteInfo currentMuteInfo = test.getCurrentMuteInfo();
        if (currentMuteInfo != null) {
          muteInfos.addAll(new LinkedHashSet<>(currentMuteInfo.getProjectsMuteInfo().values())); //add with deduplication
          muteInfos.addAll(new LinkedHashSet<>(currentMuteInfo.getBuildTypeMuteInfo().values())); //add with deduplication
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Collection'
in `src/jetbrains/buildServer/server/rest/model/problem/Test.java`
#### Snippet
```java
        if (currentMuteInfo != null) {
          muteInfos.addAll(new LinkedHashSet<>(currentMuteInfo.getProjectsMuteInfo().values())); //add with deduplication
          muteInfos.addAll(new LinkedHashSet<>(currentMuteInfo.getBuildTypeMuteInfo().values())); //add with deduplication
        }
        return new Mutes(muteInfos, null, fields.getNestedField("mutes", Fields.NONE, Fields.LONG), beanContext);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/DataUpdater.java`
#### Snippet
```java
    if (groupDescription.parentGroups != null) {
      try {
        Group.setGroupParents(resultingGroup, new LinkedHashSet<>(groupDescription.parentGroups.getFromPosted(serviceLocator)), false, serviceLocator);
      } catch (Exception e) {
        myGroupManager.deleteUserGroup(resultingGroup);
```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashSet(Collection)' as a member of raw type 'java.util.LinkedHashSet'
in `src/jetbrains/buildServer/server/rest/data/DataUpdater.java`
#### Snippet
```java
    if (groupDescription.parentGroups != null) {
      try {
        Group.setGroupParents(resultingGroup, new LinkedHashSet<>(groupDescription.parentGroups.getFromPosted(serviceLocator)), false, serviceLocator);
      } catch (Exception e) {
        myGroupManager.deleteUserGroup(resultingGroup);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.Collection'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/UserGroupFinder.java`
#### Snippet
```java
  @NotNull
  public Collection<UserGroup> getAllGroups() {
    return new ArrayList<>(myUserGroupManager.getUserGroups());
  }
}
```

### UNCHECKED_WARNING
Unchecked call to 'isAnnotationPresent(Class)' as a member of raw type 'java.lang.Class'
in `src/jetbrains/buildServer/server/rest/jersey/ExtensionsAwareResourceConfig.java`
#### Snippet
```java
    Set<Class> s = new HashSet<Class>();
    for (Class c : getClasses()) {
      if (c.isAnnotationPresent(ac)) {
        s.add(c);
      }
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/jetbrains/buildServer/server/rest/model/cloud/CloudProfile.java`
#### Snippet
```java
    return ValueWithDefault.decideDefault(myFields.isIncluded("images", false, true),
                                          () -> new CloudImages(
                                            CachingValue.simple(() -> new ArrayList<>(myBeanContext.getSingletonService(CloudUtil.class).getImages(myCloudProfile))),
                                            new PagerDataImpl(CloudRequest.getImagesHref(myCloudProfile)),
                                            myFields.getNestedField("images", Fields.NONE, Fields.LONG), myBeanContext));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.TreeSet' to 'java.util.TreeSet'
in `src/jetbrains/buildServer/server/rest/data/problem/TestOccurrenceFinder.java`
#### Snippet
```java
    final Map<TestName, List<STestRun>> failingTests = currentProblems.getFailingTests();
    final Map<TestName, List<STestRun>> mutedTestFailures = currentProblems.getMutedTestFailures();
    final TreeSet<STestRun> result = new TreeSet<>(TEST_RUN_COMPARATOR);
    //todo: check whether STestRun is OK to put into the set
    for (List<STestRun> testRuns : failingTests.values()) {
```

### UNCHECKED_WARNING
Unchecked call to 'TreeSet(Comparator)' as a member of raw type 'java.util.TreeSet'
in `src/jetbrains/buildServer/server/rest/data/problem/TestOccurrenceFinder.java`
#### Snippet
```java
    final Map<TestName, List<STestRun>> failingTests = currentProblems.getFailingTests();
    final Map<TestName, List<STestRun>> mutedTestFailures = currentProblems.getMutedTestFailures();
    final TreeSet<STestRun> result = new TreeSet<>(TEST_RUN_COMPARATOR);
    //todo: check whether STestRun is OK to put into the set
    for (List<STestRun> testRuns : failingTests.values()) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.ArrayList'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ProjectFinder.java`
#### Snippet
```java
        return myProjectManager.findProjects(((UserEx)user).getProjectVisibilityHolder().getKnownVisibleProjects());
      case SELECTED_WITH_ORDER:
        ArrayList<SProject> result = new ArrayList<>(myProjectManager.findProjects(((UserEx)user).getProjectVisibilityHolder().getKnownVisibleProjects()));
        Collections.sort(result, new ProjectComparator());
        return result;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentPoolFinder.java`
#### Snippet
```java
      dimensionBoolean(PROJECT_POOL).description("project pool").hidden().valueForDefaultFilter(agentPool -> agentPool.isProjectPool());  //hidden for now (might want to rethink naming)
      dimensionProjects(OWNER_PROJECT, myServiceLocator).description("project which defines the project pool").hidden(). //hidden for now (might want to rethink naming)
        valueForDefaultFilter(agentPool -> Util.resolveNull(getPoolOwnerProject(agentPool), ownerProject -> new HashSet<>(CollectionsUtil.setOf(ownerProject.getProject()))));
      dimensionProjects(PROJECT, myServiceLocator).description("projects associated with the agent pool").
        valueForDefaultFilter(agentPool -> new HashSet<>(getPoolProjects(agentPool)));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentPoolFinder.java`
#### Snippet
```java
        valueForDefaultFilter(agentPool -> Util.resolveNull(getPoolOwnerProject(agentPool), ownerProject -> new HashSet<>(CollectionsUtil.setOf(ownerProject.getProject()))));
      dimensionProjects(PROJECT, myServiceLocator).description("projects associated with the agent pool").
        valueForDefaultFilter(agentPool -> new HashSet<>(getPoolProjects(agentPool)));
      dimensionAgents(AGENT, myServiceLocator).description("agents associated with the agent pool").
        valueForDefaultFilter(agentPool -> new HashSet<>(getPoolAgentsInternal(agentPool)));
```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentPoolFinder.java`
#### Snippet
```java
        valueForDefaultFilter(agentPool -> Util.resolveNull(getPoolOwnerProject(agentPool), ownerProject -> new HashSet<>(CollectionsUtil.setOf(ownerProject.getProject()))));
      dimensionProjects(PROJECT, myServiceLocator).description("projects associated with the agent pool").
        valueForDefaultFilter(agentPool -> new HashSet<>(getPoolProjects(agentPool)));
      dimensionAgents(AGENT, myServiceLocator).description("agents associated with the agent pool").
        valueForDefaultFilter(agentPool -> new HashSet<>(getPoolAgentsInternal(agentPool)));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentPoolFinder.java`
#### Snippet
```java
        valueForDefaultFilter(agentPool -> new HashSet<>(getPoolProjects(agentPool)));
      dimensionAgents(AGENT, myServiceLocator).description("agents associated with the agent pool").
        valueForDefaultFilter(agentPool -> new HashSet<>(getPoolAgentsInternal(agentPool)));

      filter(DimensionCondition.ALWAYS, dimensions -> {
```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentPoolFinder.java`
#### Snippet
```java
        valueForDefaultFilter(agentPool -> new HashSet<>(getPoolProjects(agentPool)));
      dimensionAgents(AGENT, myServiceLocator).description("agents associated with the agent pool").
        valueForDefaultFilter(agentPool -> new HashSet<>(getPoolAgentsInternal(agentPool)));

      filter(DimensionCondition.ALWAYS, dimensions -> {
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `src/jetbrains/buildServer/server/rest/swagger/LocatorResourceListener.java`
#### Snippet
```java

  public LocatorResourceListener(ClassLoader classloader) {
    super(classloader, LocatorResource.class);
  }
}
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `src/jetbrains/buildServer/server/rest/swagger/LocatorResourceListener.java`
#### Snippet
```java
public final class LocatorResourceListener extends AnnotationScannerListener {
  public LocatorResourceListener() {
    super(LocatorResource.class);
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.HashMap'
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
          while (metadataEntryIterator.hasNext()) {
            BuildMetadataEntry metadataEntry = metadataEntryIterator.next();
            HashMap<String, String> properties = new HashMap<>(metadataEntry.getMetadata());
            if (properties.get(".providerId") == null) {
              properties.put(".providerId", providerId);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
    if (!missing.isEmpty()) throw new RevisionsNotFoundException(Collections.singletonMap(buildType, missing));

    return new ArrayList<>(revisionsMap.values());
  }

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
    if (!missing.isEmpty()) throw new RevisionsNotFoundException(Collections.singletonMap(buildType, missing));

    return new ArrayList<>(revisionsMap.values());
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
                                                        final boolean useAllOriginalDeps,
                                                        final @NotNull ServiceLocator serviceLocator, @NotNull final List<BuildPromotion> artifactDepsBuilds) {
    List<SArtifactDependency> originalDepsCopy = useAllOriginalDeps ? new ArrayList<>(originalDeps) : null;
    Map<String, Integer> processedBuildsByBuildTypeExternalId = new HashMap<>();
    final ArtifactDependencyFactory artifactDependencyFactory = serviceLocator.getSingletonService(ArtifactDependencyFactory.class);
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
                                                        final boolean useAllOriginalDeps,
                                                        final @NotNull ServiceLocator serviceLocator, @NotNull final List<BuildPromotion> artifactDepsBuilds) {
    List<SArtifactDependency> originalDepsCopy = useAllOriginalDeps ? new ArrayList<>(originalDeps) : null;
    Map<String, Integer> processedBuildsByBuildTypeExternalId = new HashMap<>();
    final ArtifactDependencyFactory artifactDependencyFactory = serviceLocator.getSingletonService(ArtifactDependencyFactory.class);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `src/jetbrains/buildServer/server/graphql/resolver/ProjectResolver.java`
#### Snippet
```java

    try {
      return (Map<Integer, AgentPool>) context;
    } catch (ClassCastException e) {
      return null;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/UserFinder.java`
#### Snippet
```java
     */
    boolean containsAllRolesEffectively(@NotNull final RolesHolder mainHolder) {
      Set<Role> anyScopeRoles = new HashSet<>(this.anyScopeRoles);
      Set<RoleScope> anyRoleScopes = new HashSet<>(this.anyRoleScopes);
      Map<Role, Set<RoleScope>> roleScopes = new HashMap<>(this.roleScopes.size());
```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/UserFinder.java`
#### Snippet
```java
     */
    boolean containsAllRolesEffectively(@NotNull final RolesHolder mainHolder) {
      Set<Role> anyScopeRoles = new HashSet<>(this.anyScopeRoles);
      Set<RoleScope> anyRoleScopes = new HashSet<>(this.anyRoleScopes);
      Map<Role, Set<RoleScope>> roleScopes = new HashMap<>(this.roleScopes.size());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/UserFinder.java`
#### Snippet
```java
    boolean containsAllRolesEffectively(@NotNull final RolesHolder mainHolder) {
      Set<Role> anyScopeRoles = new HashSet<>(this.anyScopeRoles);
      Set<RoleScope> anyRoleScopes = new HashSet<>(this.anyRoleScopes);
      Map<Role, Set<RoleScope>> roleScopes = new HashMap<>(this.roleScopes.size());
      for (Map.Entry<Role, Set<RoleScope>> entry : this.roleScopes.entrySet()) {
```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/UserFinder.java`
#### Snippet
```java
    boolean containsAllRolesEffectively(@NotNull final RolesHolder mainHolder) {
      Set<Role> anyScopeRoles = new HashSet<>(this.anyScopeRoles);
      Set<RoleScope> anyRoleScopes = new HashSet<>(this.anyRoleScopes);
      Map<Role, Set<RoleScope>> roleScopes = new HashMap<>(this.roleScopes.size());
      for (Map.Entry<Role, Set<RoleScope>> entry : this.roleScopes.entrySet()) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/UserFinder.java`
#### Snippet
```java
      Map<Role, Set<RoleScope>> roleScopes = new HashMap<>(this.roleScopes.size());
      for (Map.Entry<Role, Set<RoleScope>> entry : this.roleScopes.entrySet()) {
        roleScopes.put(entry.getKey(), new HashSet<>(entry.getValue()));
      }

```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/UserFinder.java`
#### Snippet
```java
      Map<Role, Set<RoleScope>> roleScopes = new HashMap<>(this.roleScopes.size());
      for (Map.Entry<Role, Set<RoleScope>> entry : this.roleScopes.entrySet()) {
        roleScopes.put(entry.getKey(), new HashSet<>(entry.getValue()));
      }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java
      final String vcsRoot = locator.getSingleDimensionValue(VCS_ROOT_DIMENSION);
      if (vcsRoot != null) {
        final Set<SVcsRoot> vcsRoots = new HashSet<>(myServiceLocator.getSingletonService(VcsRootFinder.class).getItems(vcsRoot).getEntries());
        result.add(item -> {
            for (VcsRootInstanceEntry vcsRootInstanceEntry : item.getVcsRootInstanceEntries()) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java
      if (vcsRootInstance != null) {
        final Set<jetbrains.buildServer.vcs.VcsRootInstance> vcsRootInstances =
          new HashSet<>(myServiceLocator.getSingletonService(VcsRootInstanceFinder.class).getItems(vcsRootInstance).getEntries());
        result.add(item -> {
            for (VcsRootInstanceEntry vcsRootInstanceEntry : item.getVcsRootInstanceEntries()) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/request/GroupRequest.java`
#### Snippet
```java
      throw new BadRequestException("No payload received while list of groups expected");
    }
    Group.setGroupParents(group, new LinkedHashSet<>(parents.getFromPosted(myBeanContext.getServiceLocator())), true, myBeanContext.getServiceLocator());
    return new Groups(group.getParentGroups(), new Fields(fields), myBeanContext);
  }
```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashSet(Collection)' as a member of raw type 'java.util.LinkedHashSet'
in `src/jetbrains/buildServer/server/rest/request/GroupRequest.java`
#### Snippet
```java
      throw new BadRequestException("No payload received while list of groups expected");
    }
    Group.setGroupParents(group, new LinkedHashSet<>(parents.getFromPosted(myBeanContext.getServiceLocator())), true, myBeanContext.getServiceLocator());
    return new Groups(group.getParentGroups(), new Fields(fields), myBeanContext);
  }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ChangeFinder.java`
#### Snippet
```java
    @Override
    public GraphFinder.LinkRetriever<SVcsModification> getChildren() {
      return item -> new ArrayList<>(item.getParentModifications());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/jetbrains/buildServer/server/rest/data/finder/FinderImpl.java`
#### Snippet
```java
    if (o == null) return null;
    if (o instanceof List) {
      return (List)o;  //this never produces ClassCastException as generics are lost on run-time
    }
    return Collections.singletonList((ITEM)o);  //this never produces ClassCastException as generics are lost on run-time
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'ITEM'
in `src/jetbrains/buildServer/server/rest/data/finder/FinderImpl.java`
#### Snippet
```java
      return (List)o;  //this never produces ClassCastException as generics are lost on run-time
    }
    return Collections.singletonList((ITEM)o);  //this never produces ClassCastException as generics are lost on run-time
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.HashSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
                                    (project != null ? " in the project " + project.describe(false) : ""));
      }
      return new HashSet<>(result);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
                                    (project != null ? " in the project " + project.describe(false) : ""));
      }
      return new HashSet<>(result);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.HashSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
        throw new NotFoundException("No build types found in the project " + project.describe(false));
      }
      return new HashSet<>(result);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
        throw new NotFoundException("No build types found in the project " + project.describe(false));
      }
      return new HashSet<>(result);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.HashSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
        throw new NotFoundException("No build types found under the affected project " + affectedProject.describe(false));
      }
      return new HashSet<>(result);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
        throw new NotFoundException("No build types found under the affected project " + affectedProject.describe(false));
      }
      return new HashSet<>(result);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
      final String buildTypeLocator = locator.getSingleDimensionValue(BUILD_TYPE);
      if (buildTypeLocator != null) {
        final Set<SBuildType> buildTypes = new HashSet<>(myBuildTypeFinder.getBuildTypes(getProjectFromDimension(locator, PROJECT), buildTypeLocator));
        if (buildTypes.isEmpty()) {
          throw new NotFoundException("No build types found for locator '" + buildTypeLocator + "'");
```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
      final String buildTypeLocator = locator.getSingleDimensionValue(BUILD_TYPE);
      if (buildTypeLocator != null) {
        final Set<SBuildType> buildTypes = new HashSet<>(myBuildTypeFinder.getBuildTypes(getProjectFromDimension(locator, PROJECT), buildTypeLocator));
        if (buildTypes.isEmpty()) {
          throw new NotFoundException("No build types found for locator '" + buildTypeLocator + "'");
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
      final String snapshotDepDimension = locator.getSingleDimensionValue(SNAPSHOT_DEP);
      if (snapshotDepDimension != null) {
        final Set<BuildPromotion> snapshotRelatedBuilds = new HashSet<>(getSnapshotRelatedBuilds(snapshotDepDimension));
        result.add(item -> snapshotRelatedBuilds.contains(item));
      }
```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
      final String snapshotDepDimension = locator.getSingleDimensionValue(SNAPSHOT_DEP);
      if (snapshotDepDimension != null) {
        final Set<BuildPromotion> snapshotRelatedBuilds = new HashSet<>(getSnapshotRelatedBuilds(snapshotDepDimension));
        result.add(item -> snapshotRelatedBuilds.contains(item));
      }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
      final String artifactDepDimension = locator.getSingleDimensionValue(ARTIFACT_DEP);
      if (artifactDepDimension != null) {
        final Set<BuildPromotion> artifactRelatedBuilds = new HashSet<>(getArtifactRelatedBuilds(artifactDepDimension, locator));
        result.add(item -> artifactRelatedBuilds.contains(item));
      }
```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
      final String artifactDepDimension = locator.getSingleDimensionValue(ARTIFACT_DEP);
      if (artifactDepDimension != null) {
        final Set<BuildPromotion> artifactRelatedBuilds = new HashSet<>(getArtifactRelatedBuilds(artifactDepDimension, locator));
        result.add(item -> artifactRelatedBuilds.contains(item));
      }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
      final String snapshotDepProblem = locator.getSingleDimensionValue(SNAPSHOT_PROBLEM);
      if (snapshotDepProblem != null) {
        final Set<BuildPromotion> snapshotDepProblemBuilds = new HashSet<>(getSnapshotDepProblemBuilds(snapshotDepProblem));
        result.add(item -> snapshotDepProblemBuilds.contains(item));
      }
```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
      final String snapshotDepProblem = locator.getSingleDimensionValue(SNAPSHOT_PROBLEM);
      if (snapshotDepProblem != null) {
        final Set<BuildPromotion> snapshotDepProblemBuilds = new HashSet<>(getSnapshotDepProblemBuilds(snapshotDepProblem));
        result.add(item -> snapshotDepProblemBuilds.contains(item));
      }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
      final String equivalent = locator.getSingleDimensionValue(EQUIVALENT);
      if (equivalent != null) {
        final Set<BuildPromotion> filter = new HashSet<>(((BuildPromotionEx)getItem(equivalent)).getStartedEquivalentPromotions(-1));
        result.add(item -> filter.contains(item));
      }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
      if (graphLocator != null) {
        final GraphFinder<BuildPromotion> graphFinder = new BuildPromotionOrderedFinder(BuildPromotionFinder.this);
        final Set<BuildPromotion> filter = new HashSet<>(graphFinder.getItems(graphLocator).getEntries());
        result.add(filter::contains);
      }
```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
      if (graphLocator != null) {
        final GraphFinder<BuildPromotion> graphFinder = new BuildPromotionOrderedFinder(BuildPromotionFinder.this);
        final Set<BuildPromotion> filter = new HashSet<>(graphFinder.getItems(graphLocator).getEntries());
        result.add(filter::contains);
      }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.TreeSet' to 'java.util.Set'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java

        final List<SBuildType> buildTypes = myBuildTypeFinder.getBuildTypes(null, buildTypeLocator);
        final Set<BuildPromotion> builds = new TreeSet<>(BUILD_PROMOTIONS_COMPARATOR);
        for (SBuildType buildType : buildTypes) {
          List<SBuild> buildByNumber = myBuildsManager.findBuildInstancesByBuildNumber(buildType.getBuildTypeId(), buildNumber);
```

### UNCHECKED_WARNING
Unchecked call to 'TreeSet(Comparator)' as a member of raw type 'java.util.TreeSet'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java

        final List<SBuildType> buildTypes = myBuildTypeFinder.getBuildTypes(null, buildTypeLocator);
        final Set<BuildPromotion> builds = new TreeSet<>(BUILD_PROMOTIONS_COMPARATOR);
        for (SBuildType buildType : buildTypes) {
          List<SBuild> buildByNumber = myBuildsManager.findBuildInstancesByBuildNumber(buildType.getBuildTypeId(), buildNumber);
```

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `getServerLicenseType(jetbrains.buildServer.serverSide.LicenseList)` is inaccessible from here
in `src/jetbrains/buildServer/server/rest/model/server/LicenseKeyEntity.java`
#### Snippet
```java

  /**
   * See also {@link jetbrains.buildServer.server.rest.model.server.LicensingData#getServerLicenseType(jetbrains.buildServer.serverSide.LicenseList)}
   */
  
```

### JavadocReference
Cannot resolve symbol `jetbrains.buildServer.serverSide.LicenseList`
in `src/jetbrains/buildServer/server/rest/model/server/LicenseKeyEntity.java`
#### Snippet
```java

  /**
   * See also {@link jetbrains.buildServer.server.rest.model.server.LicensingData#getServerLicenseType(jetbrains.buildServer.serverSide.LicenseList)}
   */
  
```

### JavadocReference
Symbol `getLicenseType(jetbrains.buildServer.serverSide.LicenseKey)` is inaccessible from here
in `src/jetbrains/buildServer/server/rest/model/server/LicensingData.java`
#### Snippet
```java

  /**
   * See also {@link jetbrains.buildServer.server.rest.model.server.LicenseKeyEntity#getLicenseType(jetbrains.buildServer.serverSide.LicenseKey)}
   */
  private LicenseType getServerLicenseType(final LicenseList licenseList) {
```

### JavadocReference
Cannot resolve symbol `jetbrains.buildServer.serverSide.LicenseKey`
in `src/jetbrains/buildServer/server/rest/model/server/LicensingData.java`
#### Snippet
```java

  /**
   * See also {@link jetbrains.buildServer.server.rest.model.server.LicenseKeyEntity#getLicenseType(jetbrains.buildServer.serverSide.LicenseKey)}
   */
  private LicenseType getServerLicenseType(final LicenseList licenseList) {
```

### JavadocReference
Cannot resolve symbol `getSettingsParameters(jetbrains.buildServer.serverSide.SBuildType)`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java
  /**
   * Caller must ensure 'name' is a valid name of a BuildType setting
   * @see #getSettingsParameters(jetbrains.buildServer.serverSide.SBuildType)
   */
  public static void setSettingsParameter(final BuildTypeOrTemplate buildType, final String name, final String value) {
```

### JavadocReference
Cannot resolve symbol `jetbrains.buildServer.serverSide.SBuildType`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildTypeUtil.java`
#### Snippet
```java
  /**
   * Caller must ensure 'name' is a valid name of a BuildType setting
   * @see #getSettingsParameters(jetbrains.buildServer.serverSide.SBuildType)
   */
  public static void setSettingsParameter(final BuildTypeOrTemplate buildType, final String name, final String value) {
```

### JavadocReference
Cannot resolve symbol `start`
in `src/jetbrains/buildServer/server/rest/model/PagerDataImpl.java`
#### Snippet
```java
  /**
   * @param uriBuilder           UriBuilder for the current Url
   * @param start                number of the starting item on the current page
   * @param count                count of the items on a page
   * @param currentPageRealCount number of items on the current page
```

### JavadocReference
Cannot resolve symbol `count`
in `src/jetbrains/buildServer/server/rest/model/PagerDataImpl.java`
#### Snippet
```java
   * @param uriBuilder           UriBuilder for the current Url
   * @param start                number of the starting item on the current page
   * @param count                count of the items on a page
   * @param currentPageRealCount number of items on the current page
   * @param locatorText          if specified, 'locatorQueryParameterName' should also be specified, replaces/adds start/count in the locator query parameter instead of the URL query parameters
```

### JavadocReference
Cannot resolve symbol `currentPageRealCount`
in `src/jetbrains/buildServer/server/rest/model/PagerDataImpl.java`
#### Snippet
```java
   * @param start                number of the starting item on the current page
   * @param count                count of the items on a page
   * @param currentPageRealCount number of items on the current page
   * @param locatorText          if specified, 'locatorQueryParameterName' should also be specified, replaces/adds start/count in the locator query parameter instead of the URL query parameters
   * @param locatorQueryParameterName
```

### JavadocReference
Cannot resolve symbol `featureId`
in `src/jetbrains/buildServer/server/rest/model/project/PropEntityProjectFeature.java`
#### Snippet
```java

  /**
   * @param featureId id of the feature to search in the project
   */
  @NotNull
```

### JavadocReference
Cannot resolve symbol `Integer.MAX_VALUE`
in `src/jetbrains/buildServer/server/rest/data/problem/tree/TreeSlicingOptions.java`
#### Snippet
```java
  /**
   * This function should always return non-null non-negative integer value. <br/>
   * If no limit could be provided, then {@link Integer.MAX_VALUE} should be returned.
   */
  private final Function<Node<DATA, COUNTERS>, Integer> myMaxChildren;
```

### JavadocReference
Cannot resolve symbol `Integer.MAX_VALUE`
in `src/jetbrains/buildServer/server/rest/data/problem/tree/TreeSlicingOptions.java`
#### Snippet
```java
   *
   * @param node the node which has a limit on the count of the children
   * @return the max amount of children or {@link Integer.MAX_VALUE} if no limit present.
   */
  public int getMaxChildren(Node<DATA, COUNTERS> node) {
```

### JavadocReference
Cannot resolve symbol `agentRef`
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
   * Moves the agent posted to the pool
   * @param agentPoolLocator
   * @param agentRef
   * @return
   */
```

### JavadocReference
Cannot resolve symbol `projects`
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
   * Adds the posted project to the pool associated projects
   * @param agentPoolLocator
   * @param projects
   * @return
   */
```

### JavadocReference
Cannot resolve symbol `also`
in `src/jetbrains/buildServer/server/rest/data/parameters/EntityWithParameters.java`
#### Snippet
```java
  /**
   * @return null if own parameters are not supported.
   * @see also InheritableUserParametersHolder
   */
  @Nullable
```

### JavadocReference
Cannot resolve symbol `jetbrains.buildServer.controllers.interceptors.AuthorizationInterceptorImpl.preHandle`
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java

  /**
   * see {@link jetbrains.buildServer.controllers.interceptors.AuthorizationInterceptorImpl.preHandle()}
   *
   * @param request
```

### JavadocReference
Cannot resolve symbol `patchLocatorForPersonalBuilds(String, HttpServletRequest)`
in `src/jetbrains/buildServer/server/rest/data/problem/TestOccurrenceFinder.java`
#### Snippet
```java
  /** Internal dimension, stores id of the user who is making request. <br/>
   * See also {@link TestOccurrenceFinder#getPersonalBuildsFilter(Locator)},
   * {@link jetbrains.buildServer.server.rest.request.TestOccurrenceRequest#patchLocatorForPersonalBuilds(String, HttpServletRequest)  TestOccurrenceRequest.patchLocatorForPersonalBuilds}
   */
  public static final String PERSONAL_FOR_USER = "personalForUser";
```

### JavadocReference
Cannot resolve symbol `HttpServletRequest`
in `src/jetbrains/buildServer/server/rest/data/problem/TestOccurrenceFinder.java`
#### Snippet
```java
  /** Internal dimension, stores id of the user who is making request. <br/>
   * See also {@link TestOccurrenceFinder#getPersonalBuildsFilter(Locator)},
   * {@link jetbrains.buildServer.server.rest.request.TestOccurrenceRequest#patchLocatorForPersonalBuilds(String, HttpServletRequest)  TestOccurrenceRequest.patchLocatorForPersonalBuilds}
   */
  public static final String PERSONAL_FOR_USER = "personalForUser";
```

### JavadocReference
Cannot resolve symbol `timeCondition`
in `src/jetbrains/buildServer/server/rest/data/TimeWithPrecision.java`
#### Snippet
```java
     * @param dimension
     * @param dimensionValue
     * @param timeCondition
     * @return rest of the parsed relativeTimeString
     */
```

### JavadocReference
Cannot resolve symbol `TwoFactorConfirmationException`
in `src/jetbrains/buildServer/server/rest/data/TwoFactorSecretKeysUpdater.java`
#### Snippet
```java
   * @param uuid     uuid for temporary credentials lookup
   * @param password 6-digit TOTP password
   * @throws TwoFactorConfirmationException if draft credentials by UUID not found (expired or incorrect UUID), or if provided password is incorrect
   */
  public void confirmCredentials(@NotNull final SUser user, @NotNull final UUID uuid, final int password) throws TwoFactorConfirmationException {
```

### JavadocReference
Cannot resolve symbol `projectLocator`
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
   * Experimental support only.
   * Use this to get an example of the bean to be posted to the /buildTypes request to create a new build type
   * @param projectLocator
   * @return
   */
```

### JavadocReference
Cannot resolve symbol `dimensionNames`
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   * This also has a side effect of not reporting the dimensions as known but not reported, see "reportKnownButNotReportedDimensions" method.
   *
   * @param dimensionNames
   */
  public void markAllUnused() {
```

### JavadocReference
Cannot resolve symbol `AccessDeniedException`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
   * See also: {@link BuildPromotionFinder#getBuildPromotion(long)}
   * @throws NotFoundException
   * @throws AccessDeniedException
   */
  @NotNull
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
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesArtifactDep.java`
#### Snippet
```java
          result.add(new PropEntityArtifactDep(dependency, buildType, fields.getNestedField("artifact-dependency", Fields.NONE, Fields.LONG), context));
        }
        ;
        return result;
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

## RuleId[id=DataFlowIssue]
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
Method invocation `getInternalId` may produce `NullPointerException`
in `src/jetbrains/buildServer/server/graphql/resolver/AgentBuildTypeEdgeResolver.java`
#### Snippet
```java
    SBuildType bt = myBuildTypeFinder.getItem("id:" + edge.getNode().getRawId()).getBuildType();

    return AgentFinder.getAssignedBuildTypes(realAgent).contains(bt.getInternalId());
  }

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
    if (parameters.containsKey(parameterName)) { // this processes stored "null" values duly, but this might not be necessary...
      String value = parameters.get(parameterName);
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
`null` is returned by the method declared as @NotNull
in `src/jetbrains/buildServer/server/graphql/resolver/Query.java`
#### Snippet
```java

    // TODO: implement me
    return null;
  }

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
Argument `myUserFinder.getCurrentUser()` might be null
in `src/jetbrains/buildServer/server/rest/request/TwoFactorRequest.java`
#### Snippet
```java
    }
    try {
      myKeysUpdater.confirmCredentials(myUserFinder.getCurrentUser(), UUID.fromString(uuid), password);
      TwoFactorAuthUtil.setTwoFactorCompletion(request);  // TODO: attempt to prevent instant kick after enabled 2FA without context request
      TwoFactorAuthUtil.saveSensitiveSettingsEntryTime(request);  // TW-80499
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
Variable is already assigned to this value
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java

          if (DIMENSION_COMPLEX_VALUE_START_DELIMITER.equals(nextDelimeter)) {
            parsedIndex = nameEnd;
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
Argument `submittedParams.name` might be null
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
    }

    final BuildTypeOrTemplate resultingBuildType = createEmptyBuildTypeOrTemplate(serviceLocator, project, submittedParams.name);

    try {
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

## RuleId[id=BoxingBoxedValue]
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

## RuleId[id=DeprecatedIsStillUsed]
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

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve bean 'userAvatarsManager'
in `src/META-INF/build-server-plugin-rest-api.xml`
#### Snippet
```java

  <bean id="userAvatarsManagerResolver" class="jetbrains.buildServer.server.rest.jersey.UserAvatarsManagerResolver">
    <constructor-arg ref="userAvatarsManager"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve bean 'hiddenAgentPoolManager'
in `src/META-INF/build-server-plugin-rest-api.xml`
#### Snippet
```java

  <bean id="agentPoolActionsAccessChecker" class="jetbrains.buildServer.server.graphql.resolver.agentPool.AgentPoolActionsAccessCheckerImpl">
    <property name="agentPoolManager" ref="hiddenAgentPoolManager" />
    <property name="projectManager" ref="projectManager" />
    <property name="agentTypeStorage" ref="hiddenAgentTypeManager" />
```

### SpringXmlModelInspection
Cannot resolve bean 'projectManager'
in `src/META-INF/build-server-plugin-rest-api.xml`
#### Snippet
```java
  <bean id="agentPoolActionsAccessChecker" class="jetbrains.buildServer.server.graphql.resolver.agentPool.AgentPoolActionsAccessCheckerImpl">
    <property name="agentPoolManager" ref="hiddenAgentPoolManager" />
    <property name="projectManager" ref="projectManager" />
    <property name="agentTypeStorage" ref="hiddenAgentTypeManager" />
  </bean>
```

### SpringXmlModelInspection
Cannot resolve bean 'hiddenAgentTypeManager'
in `src/META-INF/build-server-plugin-rest-api.xml`
#### Snippet
```java
    <property name="agentPoolManager" ref="hiddenAgentPoolManager" />
    <property name="projectManager" ref="projectManager" />
    <property name="agentTypeStorage" ref="hiddenAgentTypeManager" />
  </bean>
</beans>
```

## RuleId[id=UnnecessaryCallToStringValueOf]
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/jetbrains/buildServer/server/graphql/resolver/AgentTypeResolver.java`
#### Snippet
```java
      CloudProfile profile = myCloudManager.findProfileGloballyById(AgentTypeKey.getProfileId());
      if (profile == null) {
        return null;
      }

      CloudImage respectiveImage = null;
      CloudClientEx client = myCloudManager.getClient(profile.getProjectId(), profile.getProfileId());
      for (CloudImage image : client.getImages()) {
        SAgentType imageAgentType = myCloudManager.getDescriptionFor(profile, image.getId());
        if (imageAgentType == null) continue;

        if (AgentTypeKey.equals(imageAgentType.getAgentTypeKey())) {
          respectiveImage = image;
          break;
        }
      }
```

### DuplicatedCode
Duplicated code
in `src/jetbrains/buildServer/server/rest/data/DataProvider.java`
#### Snippet
```java
    if (roleId == null) {
      throw new BadRequestException("Expected roleId is not specified");
    }
    final RoleScope roleScope = RoleAssignment.getScope(scopeValue, context.getServiceLocator());
    final Collection<RoleEntry> roles = group.getRoles();
    for (RoleEntry roleEntry : roles) {
      if (roleScope.equals(roleEntry.getScope()) && roleId.equals(roleEntry.getRole().getId())) {
        return roleEntry;
      }
    }
```

### DuplicatedCode
Duplicated code
in `src/jetbrains/buildServer/server/rest/data/changeLog/ChangeLogBeanCollector.java`
#### Snippet
```java
    Locator branchLocator = Locator.createPotentiallyEmptyLocator(branchLocatorDef);

    Set<String> supportedBranchDimensions = new HashSet<>(Arrays.asList(
      BranchFinder.NAME,
      BranchFinder.DEFAULT,
      BranchFinder.POLICY,
      BranchFinder.BRANCH_GROUP,
      Locator.LOCATOR_SINGLE_VALUE_UNUSED_NAME
    ));

    if (!supportedBranchDimensions.containsAll(branchLocator.getUnusedDimensions())) {
      throw new BadRequestException(String.format("Supported sub-dimensions for dimension '%s' are: [%s]", BRANCH, String.join(",", supportedBranchDimensions)));
    }
```

### DuplicatedCode
Duplicated code
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildFinder.java`
#### Snippet
```java
    BuildsFilter buildsFilter = getBuildsFilter(locator, buildType);
    locator.checkLocatorFullyProcessed();

    final Integer c = buildsFilter.getCount();
    if (c != null) {
      buildsFilter.setCount(c != -1 ? c : null);
    } else {
      buildsFilter.setCount(jetbrains.buildServer.server.rest.request.Constants.getDefaultPageItemsCount());
    }
```

### DuplicatedCode
Duplicated code
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildTypeFinder.java`
#### Snippet
```java
    Locator selectedByUserLocator = new Locator(selectedForUserLocator, "user", "mode");
    String userLocator = selectedByUserLocator.getSingleDimensionValue("user");
    String modeLocator = selectedByUserLocator.getSingleDimensionValue("mode");
    if (userLocator == null && modeLocator == null) {
      //assume it's user locator - the only supported way before 2017.1
      userLocator = selectedForUserLocator;
    } else {
      selectedByUserLocator.checkLocatorFullyProcessed();
    }
    final SUser user = myServiceLocator.getSingletonService(UserFinder.class).getItem(userLocator);
```

### DuplicatedCode
Duplicated code
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootFinder.java`
#### Snippet
```java
    final List<String> properties = locator.getDimensionValue(PROPERTY);
    if (!properties.isEmpty()) {
      final Matcher<ParametersProvider> parameterCondition = ParameterCondition.create(properties);
      result.add(vcsRoot -> parameterCondition.matches(new AbstractMapParametersProvider(vcsRoot.getProperties())));
    }

    final String rootName = locator.getSingleDimensionValue(NAME);
```

### DuplicatedCode
Duplicated code
in `src/jetbrains/buildServer/server/rest/data/problem/scope/TestScopeTreeCollector.java`
#### Snippet
```java
    String maxTotalNodesStr = locator.getSingleDimensionValue(TREE_MAX_TOTAL_NODES);
    if (maxTotalNodesStr != null) {
      try {
        int maxTotalNodes = Integer.parseInt(maxTotalNodesStr);
        slicingOptions = slicingOptions.withMaxNodes(maxTotalNodes);
      } catch (NumberFormatException nfe) {
        throw new LocatorProcessException("Dimension '" + TREE_MAX_TOTAL_NODES + "' must be an integer.");
      }
    }
```

### DuplicatedCode
Duplicated code
in `src/jetbrains/buildServer/server/rest/request/RoleRequest.java`
#### Snippet
```java
    myPermissionChecker.checkGlobalPermission(Permission.MANAGE_ROLES);
    RolesManager rolesManager = myServiceLocator.getSingletonService(RolesManager.class);

    jetbrains.buildServer.serverSide.auth.Role role = rolesManager.findRoleById(roleId);
    if (role == null) {
      throw new NotFoundException("Role '" + roleId + "' not found");
    }
    jetbrains.buildServer.serverSide.auth.Role includedRole = rolesManager.findRoleById(includedId);
    if (includedRole == null) {
      throw new BadRequestException("Role '" + includedId + "' not found");
    }
```

### DuplicatedCode
Duplicated code
in `src/jetbrains/buildServer/server/rest/request/VcsRootInstanceRequest.java`
#### Snippet
```java
    final jetbrains.buildServer.vcs.VcsRootInstance rootInstance = myVcsRootInstanceFinder.getItem(vcsRootInstanceLocator);
    myVcsRootInstanceFinder.checkPermission(Permission.EDIT_PROJECT, rootInstance);
    VcsRootInstance.setFieldValue(rootInstance, fieldName, newValue, myBeanContext);
    rootInstance.getParent().schedulePersisting("VCS root changed");
    return VcsRootInstance.getFieldValue(rootInstance, fieldName, myDataProvider);
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/jetbrains/buildServer/server/rest/request/BuildRequest.java`
#### Snippet
```java
      InputStream inputStream = null;
      try {
        inputStream = new BufferedInputStream(new FileInputStream(resultIconFile));
        TCStreamUtil.writeBinary(inputStream, output);
      } catch (IOException e) {
```

## RuleId[id=ProtectedMemberInFinalClass]
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
in `src/jetbrains/buildServer/server/rest/data/util/LazyUtil.java`
#### Snippet
```java
    return  new Lazy<T>() {
      @Override
      protected T createValue() {
        return value.get();
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

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/jetbrains/buildServer/server/rest/swagger/SwaggerUtil.java`
#### Snippet
```java
    Map<K, V> sorted = new LinkedHashMap<K, V>();
    List<K> keys = new ArrayList<K>();
    keys.addAll(input.keySet());
    Collections.sort(keys);

```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/jetbrains/buildServer/server/rest/swagger/SwaggerUtil.java`
#### Snippet
```java
    final ArrayDeque<String> queue = new ArrayDeque<String>();

    queue.addAll(usedReferences);

    while (!queue.isEmpty()) {
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/jetbrains/buildServer/server/rest/data/investigations/InvestigationFinder.java`
#### Snippet
```java

    final ArrayList<InvestigationWrapper> result = new ArrayList<InvestigationWrapper>();
    result.addAll(getInvestigationWrappersForProject(project, user));

    //todo: TeamCity API: is there a dedicated wahy to do this?
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildFinder.java`
#### Snippet
```java
    final ArrayList<SBuild> result = new ArrayList<SBuild>();
    //todo: sort and ensure there are no duplicates
    result.addAll(BuildsFilterProcessor.getMatchingRunningBuilds(buildsFilter, myServiceLocator.getSingletonService(BuildsManager.class)));
    final Integer originalCount = buildsFilter.getCount();
    if (originalCount == null || result.size() < originalCount) {
```

## RuleId[id=UnnecessaryToStringCall]
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
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntityArtifactDep.java`
#### Snippet
```java
      //restore
      original.applyUnsafe(settings);
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
      original.applyUnsafe(settingsEx);
      throw new BadRequestException("Error adding artifact dependency: " + e.toString(), e);
    }
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
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
  public TypedFinderBuilder<ITEM> filter(@NotNull final DimensionCondition conditions, @NotNull final ItemFilterFromDimensions<ITEM> parsedObjectsIfConditionsMatched) {
    ItemFilterFromDimensions<ITEM> previous = myFiltersConditions.put(conditions, parsedObjectsIfConditionsMatched);
    if (previous != null) throw new OperationException("Overriding dimension condition '" + conditions.toString() + "'");
    return this;
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
in `src/jetbrains/buildServer/server/rest/data/finder/FinderImpl.java`
#### Snippet
```java
      result.append(", context: ");
      result.append(contextVars.stream().map(s -> s + "=" + Optional.ofNullable(getContextItems(s)).map(
                                 v -> v.stream().map(vElem -> (vElem == null ? "<null>" : "'" + vElem.toString() + "'")).collect(Collectors.joining(", ", "{", "}"))).orElse("<null>"))
                               .collect(Collectors.joining(", ", "{", "}")));
      //vElem.toString() might produce not due presentation
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/jetbrains/buildServer/server/rest/data/util/FilterConditionChecker.java`
#### Snippet
```java
package jetbrains.buildServer.server.rest.data.util;

/**
 * @author Yegor.Yarko
 *         Date: 27.07.13
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/jetbrains/buildServer/server/rest/request/TestScopesRequest.java`
#### Snippet
```java
  @Produces({"application/xml", "application/json"})
  @ApiOperation(hidden = true, value = "highly experimental")
  /**
   * Get horizontally sliced tree containing projects and build configurations which are relevant to test runs satisfying given locator
   */
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/jetbrains/buildServer/server/rest/model/change/BuildChange.java`
#### Snippet
```java
package jetbrains.buildServer.server.rest.model.change;

/**
 * @author Yegor.Yarko
 * Date: 20/03/2018
```

## RuleId[id=SuspiciousMethodCalls]
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
in `src/jetbrains/buildServer/server/rest/model/nodes/DisabledResponsibilities.java`
#### Snippet
```java
  public DisabledResponsibilities(@NotNull final TeamCityNode node, @NotNull final Fields fields) {
    Set<NodeResponsibility> enabledResponsibilities = node.getEnabledResponsibilities();
    Set<NodeResponsibility> disabledResponsibilities = NodeResponsibility.assignableResponsibilities().stream().filter(n -> !enabledResponsibilities.contains(n)).collect(Collectors.toSet());
    this.responsibilities = ValueWithDefault.decideDefault(fields.isIncluded("responsibility", true), () ->
      disabledResponsibilities.stream().map(toResponsibility(fields)).collect(toList())
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
Inner class `ProjectsConnectionEdge` may be 'static'
in `src/jetbrains/buildServer/server/graphql/model/connections/ProjectsConnection.java`
#### Snippet
```java


  public class ProjectsConnectionEdge extends LazyEdge<SProject, Project> {
    public ProjectsConnectionEdge(@NotNull SProject data) {
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
Inner class `ThreadNamingContainerResponse` may be 'static'
in `src/jetbrains/buildServer/server/rest/jersey/ThreadNamingContainerResponseFilter.java`
#### Snippet
```java
  }

  public class ThreadNamingContainerResponse extends AdaptingContainerResponse {
    public ThreadNamingContainerResponse(ContainerResponse delegate) {
      super(delegate);
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

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/jetbrains/buildServer/server/rest/data/build/GenericBuildsFilter.java`
#### Snippet
```java
  public boolean isExcludedBySince(final SBuild build) {
    if (mySince != null) {
      if (!mySince.before(build)) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `src/jetbrains/buildServer/server/rest/data/build/GenericBuildsFilter.java`
#### Snippet
```java
    }
    if (tagsMatchPattern == null) {
      if ((present && buildTags.size() != 0) || (!present && (buildTags.size() == 0))) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `src/jetbrains/buildServer/server/rest/data/build/GenericBuildsFilter.java`
#### Snippet
```java
      if (present && tagsMatchPattern) {
        return true;
      } else if (!present && !tagsMatchPattern) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `src/jetbrains/buildServer/server/rest/data/build/GenericBuildsFilter.java`
#### Snippet
```java

    if (myParameterCondition != null){
      if (!myParameterCondition.matches(BuildParametersUtil.getResultingParameters(build.getBuildPromotion()))) {
        return false;
      }
```

### TrivialIf
`if` statement can be simplified
in `src/jetbrains/buildServer/server/rest/model/Property.java`
#### Snippet
```java
      }
      if (!isSecure(parameter, serviceLocator)) {
        if (!Objects.equal(value, parameter.getValue())) {
          return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/jetbrains/buildServer/server/rest/model/Property.java`
#### Snippet
```java
        }
      } else {
        if (!Objects.equal(value, getSecureValue(parameter, serviceLocator))) {
          return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/jetbrains/buildServer/server/rest/model/Property.java`
#### Snippet
```java
      if (value != null) {
        if (!isSecure(parameter, serviceLocator)) {
          if (!Objects.equal(value, parameter.getValue())) {
            return false;
          }
```

### TrivialIf
`if` statement can be simplified
in `src/jetbrains/buildServer/server/rest/model/Property.java`
#### Snippet
```java
          }
        } else {
          if (!Objects.equal(value, getSecureValue(parameter, serviceLocator))) {
            return false;
          }
```

### TrivialIf
`if` statement can be simplified
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java

    SBuildType buildType = build.getBuildType();
    if (buildType != null && !getCompatibilityData(agent, buildType).isCompatible()) {
      return false;  //todo: optimize, as this calculates compatibility second time
    }
```

### TrivialIf
`if` statement can be simplified
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
  private boolean canActuallyRun(@NotNull final SBuildAgent agent, @NotNull final BuildPromotion build, @NotNull final CompatibilityResult compatibilityResult) {
    if (getAgentType(agent).getPolicy().isBuildTypeAllowed(build.getBuildTypeId())) {
      if (compatibilityResult.isCompatible()) return true;
    }
    return false;
```

### TrivialIf
`if` statement can be simplified
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AgentFinder.java`
#### Snippet
```java
  public static boolean canActuallyRun(@NotNull final AgentCompatibility compatibility) {
    if (getAgentType(compatibility).getPolicy().isBuildTypeAllowed(compatibility.getBuildType().getBuildTypeId())) {
      if (compatibility.isActive() && compatibility.isCompatible()) return true;
    }
    return false;
```

### TrivialIf
`if` statement can be simplified
in `src/jetbrains/buildServer/server/rest/data/problem/ProblemFinder.java`
#### Snippet
```java
    // dimension-specific item search
    Long id = locator.getSingleDimensionValueAsLong(DIMENSION_ID);
    if (id != null) {
      return id;
    }
```

### TrivialIf
`if` statement can be simplified
in `src/jetbrains/buildServer/server/rest/data/PermissionChecker.java`
#### Snippet
```java
        return false;
      }
      if (authorityHolder.isPermissionGrantedForAnyProject(permission) &&
          authorityHolder.isPermissionGrantedForAllProjects(allProjectsInternalIds, permission)) {
        return true;
```

### TrivialIf
`if` statement can be simplified
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
    SFinishedBuild finishedBuild = (SFinishedBuild)build;  //TeamCity API: getPinComment() is only available for finished build, while isPinned is available for running
    final jetbrains.buildServer.serverSide.comments.Comment pinComment = finishedBuild.getPinComment();
    if (pinComment == null) {
      return null;
    }
```

### TrivialIf
`if` statement can be simplified
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
    public Boolean isInherited(@NotNull final String paramName) {
      Parameter ownParameter = getOwnParameter(paramName);
      if (ownParameter == null) return true;
      // might need to add check for read-only parameter here...
      return false;
```

### TrivialIf
`if` statement can be simplified
in `src/jetbrains/buildServer/server/rest/data/BranchMatcher.java`
#### Snippet
```java
    }
    if (myBranched != null) {
      if (!myBranched.equals(buildBranch != null)) {
        return false;
      }
```

### TrivialIf
`if` statement can be simplified
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
    }
    if (tagsMatchPattern == null) {
      if ((present && buildTags.size() != 0) || (!present && (buildTags.size() == 0))) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
      if (present && tagsMatchPattern) {
        return true;
      } else if (!present && !tagsMatchPattern) {
        return true;
      }
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'build == null' covered by subsequent condition '!(build instanceof BaseBuild)'
in `src/jetbrains/buildServer/server/rest/data/build/BuildParametersUtil.java`
#### Snippet
```java
  public static ParametersProvider getStartParameters(@NotNull BuildPromotion buildPromotion) {
    SBuild build = buildPromotion.getAssociatedBuild();
    if (build == null || !(build instanceof BaseBuild)) {
      return new MapParametersProviderImpl();
    }
```

### ConditionCoveredByFurtherCondition
Condition 'build == null' covered by subsequent condition '!(build instanceof BaseBuild)'
in `src/jetbrains/buildServer/server/rest/data/build/BuildParametersUtil.java`
#### Snippet
```java
  public static ParametersProvider getResultingParameters(@NotNull BuildPromotion buildPromotion) {
    SBuild build = buildPromotion.getAssociatedBuild();
    if(build == null || !(build instanceof BaseBuild)) {
      return new MapParametersProviderImpl();
    }
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

## RuleId[id=ComparatorMethodParameterNotUsed]
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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `vcsRootInstances.getEntries()` to `Collection` is redundant
in `src/jetbrains/buildServer/server/rest/request/VcsRootInstanceRequest.java`
#### Snippet
```java
                                         @Context HttpServletRequest request) {
    final PagedSearchResult<jetbrains.buildServer.vcs.VcsRootInstance> vcsRootInstances = myVcsRootInstanceFinder.getItems(vcsRootInstanceLocator);
    return new VcsRootInstances(CachingValue.simple(((Collection<jetbrains.buildServer.vcs.VcsRootInstance>)vcsRootInstances.getEntries())),
                                new PagerDataImpl(uriInfo.getRequestUriBuilder(), request.getContextPath(), vcsRootInstances, vcsRootInstanceLocator, "locator"),
                                new Fields(fields),
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param ` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/util/finderBuilder/TypedFinderDimension.java`
#### Snippet
```java
   *
   * @param checker           predicate function, decideing whether to include given item in the result or not.
   * @param <TYPE_FOR_FILTER>
   */
  @NotNull
```

### JavadocDeclaration
`@param mapper` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/util/itemholder/ItemHolder.java`
#### Snippet
```java
   * Replacement for ex FlatteningItemHolder.
   *
   * @param mapper
   * @param <R>    the output item type.
   * @return new ItemHolder
```

### JavadocDeclaration
`@param agents` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/build/GenericBuildsFilter.java`
#### Snippet
```java
   * @param branchMatcher   if not set, only builds from default branch match. The locator supports dimensions: "name"/String, "default"/boolean and "unspecified"/boolean.
   * @param agentName       limit builds to those ran on specified agent, can be null to return all builds
   * @param agents
   * @param parameterCondition  limit builds to those with a finish parameter matching the condition specified, can be null to return all builds
   * @param since           the RangeLimit to return only the builds since the limit. If contains build, it is not included, if contains the date, the builds that were started at and later then the date are included
```

### JavadocDeclaration
`@param serviceLocator` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/build/GenericBuildsFilter.java`
#### Snippet
```java
   * @param count           the number of builds to return, all by default
   * @param lookupLimit     the number of builds to search. Matching results only within first 'lookupLimit' builds will be returned
   * @param serviceLocator
   */
  public GenericBuildsFilter(@Nullable final SBuildType buildType,
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/util/LocatorUtil.java`
#### Snippet
```java
   * @param dimensionName only alpha-numeric characters are supported! Only numeric values without brackets are supported!
   * @param value         new value for the dimension, only alpha-numeric characters are supported!
   * @return
   */
  public static String setDimension(@Nullable final String locator, @NotNull final String dimensionName, final String value) {
```

### JavadocDeclaration
`@param item` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/util/DuplicateChecker.java`
#### Snippet
```java
public interface DuplicateChecker<ITEM> {
  /**
   * @param item
   * @return true, if item is a duplicate and was already seen, false otherwise
   */
```

### JavadocDeclaration
Wrong tag `date`
in `src/jetbrains/buildServer/server/rest/data/finder/ExistenceAwareFinder.java`
#### Snippet
```java
/**
 * @author Andrey Kokorev
 * @date 17.02.2022
 */
public interface ExistenceAwareFinder {
```

### JavadocDeclaration
`@param fieldName` tag description is missing
in `src/jetbrains/buildServer/server/rest/model/Fields.java`
#### Snippet
```java
  /**
   *
   * @param fieldName
   * @return null if the defaults should be used
   */
```

### JavadocDeclaration
`@param nestedFieldName` tag description is missing
in `src/jetbrains/buildServer/server/rest/model/Fields.java`
#### Snippet
```java
   * Returnes fields for the nested field 'nestedFieldName' defaulting to 'defaultForShort' and 'defaultForLong' for corresponding presentations.
   * Excludes stored in 'default*Presentation' paramters are ignored.
   * @param nestedFieldName
   * @param defaultForShort - default to use if the current Fields is short presentation
   * @param defaultForLong - default to use if the current Fields is long presentation
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/model/Fields.java`
#### Snippet
```java
   * @param defaultForShort - default to use if the current Fields is short presentation
   * @param defaultForLong - default to use if the current Fields is long presentation
   * @return
   */
  @NotNull
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntity.java`
#### Snippet
```java
   * Checks all except id and disabled state
   * @param that the entity to check the current one against
   * @return
   */
  public boolean isSimilar(@Nullable final PropEntity that) {
```

### JavadocDeclaration
Wrong tag `date`
in `src/jetbrains/buildServer/server/rest/model/user/PermissionAssignment.java`
#### Snippet
```java
/**
 * @author Yegor.Yarko
 * @date 18/09/2017
 * @see PermissionRestriction DTO with the same structure and behaviour, but with another semantics.
 */
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java

    /**
     * @param element
     * @param listChildrenLevel       number of nesting to list children for; -1 for unlimited level, 0 for no children listed
     * @param listArchiveChildrenLevel  treat archives as directories (up to the specified archive nesting number)
```

### JavadocDeclaration
`@param firstNode` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildArtifactsFinder.java`
#### Snippet
```java
     * @param listArchiveChildrenLevel  treat archives as directories (up to the specified archive nesting number)
     * @param hidden           list files under .teamcity, "null" to include both hidden and not
     * @param firstNode
     */
    public Node(@NotNull final Element element,
```

### JavadocDeclaration
Wrong tag `date`
in `src/jetbrains/buildServer/server/rest/request/AvatarRequest.java`
#### Snippet
```java
/**
 * @author Vladislav Golubinov
 * @date 24.09.2021
 */
@Api("Avatar")
```

### JavadocDeclaration
`@param dependency` tag description is missing
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntityArtifactDep.java`
#### Snippet
```java
  /**
   *
   * @param dependency
   * @param buildType null is enabled/disabled is not applicable
   * @param fields
```

### JavadocDeclaration
`@param fields` tag description is missing
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntityArtifactDep.java`
#### Snippet
```java
   * @param dependency
   * @param buildType null is enabled/disabled is not applicable
   * @param fields
   * @param context
   */
```

### JavadocDeclaration
`@param context` tag description is missing
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntityArtifactDep.java`
#### Snippet
```java
   * @param buildType null is enabled/disabled is not applicable
   * @param fields
   * @param context
   */
  public PropEntityArtifactDep(@NotNull final SArtifactDependency dependency, @Nullable final BuildTypeSettingsEx buildType,
```

### JavadocDeclaration
`@param locatorQueryParameterName` tag description is missing
in `src/jetbrains/buildServer/server/rest/model/PagerDataImpl.java`
#### Snippet
```java
   * @param currentPageRealCount number of items on the current page
   * @param locatorText          if specified, 'locatorQueryParameterName' should also be specified, replaces/adds start/count in the locator query parameter instead of the URL query parameters
   * @param locatorQueryParameterName
   */
  public PagerDataImpl(@NotNull final UriBuilder uriBuilder,
```

### JavadocDeclaration
Class/method reference, quoted text, or HTML link are expected after @see tag
in `src/jetbrains/buildServer/server/rest/data/finder/Finder.java`
#### Snippet
```java
   * @param locatorText locator of the group of items.
   * @return items, matched by this locator.
   * @see {@link Locator#Locator(String)}
   */
  @NotNull
```

### JavadocDeclaration
Wrong tag `date`
in `src/jetbrains/buildServer/server/rest/data/finder/Finder.java`
#### Snippet
```java
 * @param <ITEM> the type of items, handled by this finder.
 * @author Yegor Yarko
 * @date 06.06.2016
 * @see Locator Locator - data query object
 * @see FinderDataBinding
```

### JavadocDeclaration
`@param locatorText` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/finder/Finder.java`
#### Snippet
```java
   * The filter returned should check all the Finder's conditions.
   *
   * @param locatorText
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/finder/Finder.java`
#### Snippet
```java
   *
   * @param locatorText
   * @return
   */
  @NotNull
```

### JavadocDeclaration
Class/method reference, quoted text, or HTML link are expected after @see tag
in `src/jetbrains/buildServer/server/rest/data/finder/Finder.java`
#### Snippet
```java
   * @return single item found by locator.
   * @throws jetbrains.buildServer.server.rest.errors.BadRequestException if {@code locatorText} is null.
   * @see {@link Locator#Locator(String)}
   */
  @NotNull
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
   * @param start             Deprecated, use "locator" parameter instead
   * @param count             Deprecated, use "locator" parameter instead, defaults to 100
   * @return
   */
  @GET
```

### JavadocDeclaration
`@param projectLocator` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
   * Creates a new build configuration template by copying existing one.
   *
   * @param projectLocator
   * @param descriptor     reference to the build configuration template to copy and copy options.
   *                       e.g. <newBuildTypeDescription name='Conf Name' id='ProjectId_ConfId' copyAllAssociatedSettings='true'><sourceBuildType id='sourceConfId'/></newBuildTypeDescription>
```

### JavadocDeclaration
`@param projectLocator` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
   * Use this to get an example of the bean to be posted to the /projects request to create a new project
   *
   * @param projectLocator
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
   *
   * @param projectLocator
   * @return
   */
  @GET
```

### JavadocDeclaration
Wrong tag `date`
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
/**
 * @author Yegor Yarko
 * @date 11.04.2009
 */
@Path(ProjectRequest.API_PROJECTS_URL)
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
   * Lists branches from the build configurations of the project
   * @param branchesLocator experimental use only!
   * @return
   */
  @GET
```

### JavadocDeclaration
`@param projectLocator` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/ProjectRequest.java`
#### Snippet
```java
   * Creates a new build configuration by copying existing one.
   *
   * @param projectLocator
   * @param descriptor     reference to the build configuration to copy and copy options.
   *                       e.g. <newBuildTypeDescription name='Conf Name' id='ProjectId_ConfId' copyAllAssociatedSettings='true'><sourceBuildType id='sourceConfId'/></newBuildTypeDescription>
```

### JavadocDeclaration
Wrong tag `date`
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java
/**
 * @author Yegor.Yarko
 * @date 27/04/2016
 */
@SuppressWarnings("WeakerAccess")
```

### JavadocDeclaration
`@param problemId` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/problem/ProblemWrapper.java`
#### Snippet
```java
  /**
   * The same as above, just with a bit better performance
   * @param problemId
   * @param buildProblemData
   * @param serviceLocator
```

### JavadocDeclaration
`@param buildProblemData` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/problem/ProblemWrapper.java`
#### Snippet
```java
   * The same as above, just with a bit better performance
   * @param problemId
   * @param buildProblemData
   * @param serviceLocator
   */
```

### JavadocDeclaration
`@param serviceLocator` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/problem/ProblemWrapper.java`
#### Snippet
```java
   * @param problemId
   * @param buildProblemData
   * @param serviceLocator
   */
  public ProblemWrapper(final int problemId, @NotNull final BuildProblemData buildProblemData, final @NotNull ServiceLocator serviceLocator) {
```

### JavadocDeclaration
Wrong tag `date`
in `src/jetbrains/buildServer/server/rest/model/project/SshKeys.java`
#### Snippet
```java
/**
 * @author Vladimir Shefer
 * @date 21.11.2022
 */
@XmlRootElement(name = "sshKeys")
```

### JavadocDeclaration
`@param locatorText` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/ProblemOccurrenceRequest.java`
#### Snippet
```java
   * Experimental, the requests and results returned will change in future versions!
   *
   * @param locatorText
   * @param uriInfo
   * @param request
```

### JavadocDeclaration
`@param uriInfo` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/ProblemOccurrenceRequest.java`
#### Snippet
```java
   *
   * @param locatorText
   * @param uriInfo
   * @param request
   * @return
```

### JavadocDeclaration
`@param request` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/ProblemOccurrenceRequest.java`
#### Snippet
```java
   * @param locatorText
   * @param uriInfo
   * @param request
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/ProblemOccurrenceRequest.java`
#### Snippet
```java
   * @param uriInfo
   * @param request
   * @return
   */
  @GET
```

### JavadocDeclaration
`@param subTreeRoot` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/problem/tree/ScopeTree.java`
#### Snippet
```java
   * Modifies the tree!
   *
   * @param subTreeRoot
   * @param slicingOptions
   * @return
```

### JavadocDeclaration
`@param slicingOptions` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/problem/tree/ScopeTree.java`
#### Snippet
```java
   *
   * @param subTreeRoot
   * @param slicingOptions
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/problem/tree/ScopeTree.java`
#### Snippet
```java
   * @param subTreeRoot
   * @param slicingOptions
   * @return
   */
  @NotNull
```

### JavadocDeclaration
`@param path` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/FilesSubResource.java`
#### Snippet
```java
    /**
     * Same as {@link #getElement(String, Purpose)} where purpose is set to BROWSE
     * @param path
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/FilesSubResource.java`
#### Snippet
```java
     * Same as {@link #getElement(String, Purpose)} where purpose is set to BROWSE
     * @param path
     * @return
     */
    @NotNull
```

### JavadocDeclaration
Wrong tag `date`
in `src/jetbrains/buildServer/server/rest/model/project/SshKey.java`
#### Snippet
```java
/**
 * @author Vladimir Shefer
 * @date 21.11.2022
 */
@XmlRootElement(name = "sshKey")
```

### JavadocDeclaration
`@param locator` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/CloudRequest.java`
#### Snippet
```java
  /**
   * Returns list of currently known cloud instances
   * @param locator
   */
  @GET
```

### JavadocDeclaration
`@param locator` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/CloudRequest.java`
#### Snippet
```java
  /**
   * Returns list of currently known cloud profiles
   * @param locator
   */
  @GET
```

### JavadocDeclaration
`@param locator` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/CloudRequest.java`
#### Snippet
```java
  /**
   * Returns list of currently known cloud images
   * @param locator
   */
  @GET
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/ChangeRequest.java`
#### Snippet
```java
   * @param uriInfo             Deprecated, use "locator" parameter instead
   * @param request             Deprecated, use "locator" parameter instead
   * @return
   */
  @GET
```

### JavadocDeclaration
`@param locator` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/AgentRequest.java`
#### Snippet
```java
   * @param includeDisconnected Deprecated, use "locator" parameter instead
   * @param includeUnauthorized Deprecated, use "locator" parameter instead
   * @param locator
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/AgentRequest.java`
#### Snippet
```java
   * @param includeUnauthorized Deprecated, use "locator" parameter instead
   * @param locator
   * @return
   */
  @GET
```

### JavadocDeclaration
`@param locatorText` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/InvestigationRequest.java`
#### Snippet
```java
  /**
   * Experimental, the requests and results returned will change in future versions!
   * @param locatorText
   * @param uriInfo
   * @param request
```

### JavadocDeclaration
`@param uriInfo` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/InvestigationRequest.java`
#### Snippet
```java
   * Experimental, the requests and results returned will change in future versions!
   * @param locatorText
   * @param uriInfo
   * @param request
   * @return
```

### JavadocDeclaration
`@param request` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/InvestigationRequest.java`
#### Snippet
```java
   * @param locatorText
   * @param uriInfo
   * @param request
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/InvestigationRequest.java`
#### Snippet
```java
   * @param uriInfo
   * @param request
   * @return
   */
  @GET
```

### JavadocDeclaration
`@param parametersProvider` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/ParameterCondition.java`
#### Snippet
```java

  /** Use this condition to check parameters obtained from parametersProvider and return only matched ones.
   * @param parametersProvider
   * @return parameters stream, matching the condition.
   */
```

### JavadocDeclaration
`@param parametersProvider` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/ParameterCondition.java`
#### Snippet
```java

  /**
   * @param parametersProvider
   * @param ownParametersProvider subset of 'parametersProvider' with all the same values which determines which parameter to consider not inherited
   * @return
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/ParameterCondition.java`
#### Snippet
```java
   * @param parametersProvider
   * @param ownParametersProvider subset of 'parametersProvider' with all the same values which determines which parameter to consider not inherited
   * @return
   */
  public boolean matches(@NotNull final ParametersProvider parametersProvider, @NotNull final ParametersProvider ownParametersProvider) {
```

### JavadocDeclaration
`@param agentPoolLocator` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
  /**
   * Moves the agent posted to the pool
   * @param agentPoolLocator
   * @param agentRef
   * @return
```

### JavadocDeclaration
`@param agentRef` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
   * Moves the agent posted to the pool
   * @param agentPoolLocator
   * @param agentRef
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
   * @param agentPoolLocator
   * @param agentRef
   * @return
   */
  @POST
```

### JavadocDeclaration
`@param agentPoolLocator` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
  /**
   * Associates the posted set of projects with the pool which replaces earlier associations on this pool
   * @param agentPoolLocator
   * @param projects
   * @return
```

### JavadocDeclaration
`@param projects` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
   * Associates the posted set of projects with the pool which replaces earlier associations on this pool
   * @param agentPoolLocator
   * @param projects
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
   * @param agentPoolLocator
   * @param projects
   * @return
   */
  @PUT
```

### JavadocDeclaration
`@param agentPoolLocator` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
  /**
   * Adds the posted project to the pool associated projects
   * @param agentPoolLocator
   * @param projects
   * @return
```

### JavadocDeclaration
`@param projects` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
   * Adds the posted project to the pool associated projects
   * @param agentPoolLocator
   * @param projects
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/AgentPoolRequest.java`
#### Snippet
```java
   * @param agentPoolLocator
   * @param projects
   * @return
   */
  @POST
```

### JavadocDeclaration
`@param locatorText` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/TestOccurrenceRequest.java`
#### Snippet
```java
   * Experimental, the requests and results returned will change in future versions!
   *
   * @param locatorText
   * @param uriInfo
   * @param request
```

### JavadocDeclaration
`@param uriInfo` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/TestOccurrenceRequest.java`
#### Snippet
```java
   *
   * @param locatorText
   * @param uriInfo
   * @param request
   * @return
```

### JavadocDeclaration
`@param request` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/TestOccurrenceRequest.java`
#### Snippet
```java
   * @param locatorText
   * @param uriInfo
   * @param request
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/TestOccurrenceRequest.java`
#### Snippet
```java
   * @param uriInfo
   * @param request
   * @return
   */
  @GET
```

### JavadocDeclaration
`@param locatorText` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/ProblemRequest.java`
#### Snippet
```java
   * Experimental, the requests and results returned will change in future versions!
   *
   * @param locatorText
   * @param uriInfo
   * @param request
```

### JavadocDeclaration
`@param uriInfo` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/ProblemRequest.java`
#### Snippet
```java
   *
   * @param locatorText
   * @param uriInfo
   * @param request
   * @return
```

### JavadocDeclaration
`@param request` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/ProblemRequest.java`
#### Snippet
```java
   * @param locatorText
   * @param uriInfo
   * @param request
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/ProblemRequest.java`
#### Snippet
```java
   * @param uriInfo
   * @param request
   * @return
   */
  @GET
```

### JavadocDeclaration
`@param locatorText` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/MuteRequest.java`
#### Snippet
```java
  /**
   * Experimental, the requests and results returned will change in future versions!
   * @param locatorText
   * @param uriInfo
   * @param request
```

### JavadocDeclaration
`@param uriInfo` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/MuteRequest.java`
#### Snippet
```java
   * Experimental, the requests and results returned will change in future versions!
   * @param locatorText
   * @param uriInfo
   * @param request
   * @return
```

### JavadocDeclaration
`@param request` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/MuteRequest.java`
#### Snippet
```java
   * @param locatorText
   * @param uriInfo
   * @param request
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/MuteRequest.java`
#### Snippet
```java
   * @param uriInfo
   * @param request
   * @return
   */
  @GET
```

### JavadocDeclaration
`@param request` tag description is missing
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java
   * see {@link jetbrains.buildServer.controllers.interceptors.AuthorizationInterceptorImpl.preHandle()}
   *
   * @param request
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/APIController.java`
#### Snippet
```java
   *
   * @param request
   * @return
   */
  private static boolean canRedirect(@NotNull HttpServletRequest request) {
```

### JavadocDeclaration
`@param dimension` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/TimeWithPrecision.java`
#### Snippet
```java

    /**
     * @param dimension
     * @param dimensionValue
     * @param timeCondition
```

### JavadocDeclaration
`@param dimensionValue` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/TimeWithPrecision.java`
#### Snippet
```java
    /**
     * @param dimension
     * @param dimensionValue
     * @param timeCondition
     * @return rest of the parsed relativeTimeString
```

### JavadocDeclaration
`@param timeCondition` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/TimeWithPrecision.java`
#### Snippet
```java
     * @param dimension
     * @param dimensionValue
     * @param timeCondition
     * @return rest of the parsed relativeTimeString
     */
```

### JavadocDeclaration
`@param locatorText` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/TestRequest.java`
#### Snippet
```java
   * Experimental, the requests and results returned will change in future versions!
   *
   * @param locatorText
   * @param uriInfo
   * @param request
```

### JavadocDeclaration
`@param uriInfo` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/TestRequest.java`
#### Snippet
```java
   *
   * @param locatorText
   * @param uriInfo
   * @param request
   * @return
```

### JavadocDeclaration
`@param request` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/TestRequest.java`
#### Snippet
```java
   * @param locatorText
   * @param uriInfo
   * @param request
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/TestRequest.java`
#### Snippet
```java
   * @param uriInfo
   * @param request
   * @return
   */
  @GET
```

### JavadocDeclaration
`@param name` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ProjectFinder.java`
#### Snippet
```java
   *
   * @param parentProject Project under which to search. If 'null' - process all projects including root one.
   * @param name
   * @param recursive
   * @return
```

### JavadocDeclaration
`@param recursive` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ProjectFinder.java`
#### Snippet
```java
   * @param parentProject Project under which to search. If 'null' - process all projects including root one.
   * @param name
   * @param recursive
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ProjectFinder.java`
#### Snippet
```java
   * @param name
   * @param recursive
   * @return
   */
  @NotNull
```

### JavadocDeclaration
`@param artifactDependencies` tag description is missing
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesArtifactDep.java`
#### Snippet
```java

  /**
   * @param artifactDependencies
   * @param buildType            null if enabled/disabled is not applicable
   * @param fields
```

### JavadocDeclaration
`@param fields` tag description is missing
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesArtifactDep.java`
#### Snippet
```java
   * @param artifactDependencies
   * @param buildType            null if enabled/disabled is not applicable
   * @param fields
   * @param context
   */
```

### JavadocDeclaration
`@param context` tag description is missing
in `src/jetbrains/buildServer/server/rest/model/buildType/PropEntitiesArtifactDep.java`
#### Snippet
```java
   * @param buildType            null if enabled/disabled is not applicable
   * @param fields
   * @param context
   */
  public PropEntitiesArtifactDep(@NotNull final List<SArtifactDependency> artifactDependencies, @Nullable final BuildTypeSettingsEx buildType,
```

### JavadocDeclaration
`@param user` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/TwoFactorSecretKeysUpdater.java`
#### Snippet
```java
   * Refreshes grace period for given user.
   *
   * @param user
   */
  public void refreshGracePeriod(@NotNull final SUser user) {
```

### JavadocDeclaration
`@param user` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/TwoFactorSecretKeysUpdater.java`
#### Snippet
```java
   * Generates and writes new recovery keys for given user. Old keys are discarded
   *
   * @param user
   * @return set of new recovery keys
   */
```

### JavadocDeclaration
`@param user` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/TwoFactorSecretKeysUpdater.java`
#### Snippet
```java
   * Checks if user has enabled 2FA
   *
   * @param user
   * @return true if 2FA is enabled, false otherwise
   */
```

### JavadocDeclaration
`@param user` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/TwoFactorSecretKeysUpdater.java`
#### Snippet
```java
   * Disables two-factor authentication for given user
   *
   * @param user
   */
  public void disable2FA(@NotNull final SUser user) {
```

### JavadocDeclaration
`@param permission` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/PermissionAssignmentData.java`
#### Snippet
```java
   * Creates global permission assignment (for project-related permission means that the permission is granted for all the projects)
   *
   * @param permission
   */
  public PermissionAssignmentData(@NotNull final Permission permission) {
```

### JavadocDeclaration
`@param value` tag description is missing
in `src/jetbrains/buildServer/server/rest/util/StringPool.java`
#### Snippet
```java
   * Implementation does NOT have to guarantee <code>reuse(a) == reuse(b)</code> for <code>a.equals(b) && a != b</code>.
   * </p>
   * @param value
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/util/StringPool.java`
#### Snippet
```java
   * </p>
   * @param value
   * @return
   */
  @Contract("null -> null, !null -> !null")
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java

  /**
   * @return
   * @deprecated use "state" instead
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/model/build/Build.java`
#### Snippet
```java
   * The set of the changes included can vary in the future TeamCity versions. In TeamCity 8.1 this is the last usual change and also a personal change (for personal build only)
   *
   * @return
   */
  @XmlElement(name = "lastChanges")
```

### JavadocDeclaration
Wrong tag `Deprecated`
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java

  /**
   * @Deprecated Use .../templates instead
   */
  @DELETE
```

### JavadocDeclaration
`@param projectLocator` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
   * Experimental support only.
   * Use this to get an example of the bean to be posted to the /buildTypes request to create a new build type
   * @param projectLocator
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
   * Use this to get an example of the bean to be posted to the /buildTypes request to create a new build type
   * @param projectLocator
   * @return
   */
  @GET
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
   * @param start             Deprecated, use "locator" parameter instead
   * @param count             Deprecated, use "locator" parameter instead, defaults to 100
   * @return
   */
  @GET
```

### JavadocDeclaration
`@param buildTypeLocator` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
  /**
   * Checks if there are any branches satisfying given locator.
   * @param buildTypeLocator
   * @param branchLocator
   * @return
```

### JavadocDeclaration
`@param branchLocator` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
   * Checks if there are any branches satisfying given locator.
   * @param buildTypeLocator
   * @param branchLocator
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
   * @param buildTypeLocator
   * @param branchLocator
   * @return
   */
  @GET
```

### JavadocDeclaration
`@param buildTypeLocator` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
  /**
   * Lists branches of the build type.
   * @param buildTypeLocator
   * @param branchesLocator experimental use only!
   * @return
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java
   * @param buildTypeLocator
   * @param branchesLocator experimental use only!
   * @return
   */
  @GET
```

### JavadocDeclaration
Wrong tag `Deprecated`
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java

  /**
   * @Deprecated Use .../templates instead
   */
  @PUT
```

### JavadocDeclaration
Wrong tag `Deprecated`
in `src/jetbrains/buildServer/server/rest/request/BuildTypeRequest.java`
#### Snippet
```java

  /**
   * @Deprecated Use .../templates instead
   */
  @GET
```

### JavadocDeclaration
Wrong tag `date`
in `src/jetbrains/buildServer/server/rest/model/PagerData.java`
#### Snippet
```java
 *
 * @author Vladimir Shefer
 * @date 11.11.2022
 */
public interface PagerData {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/service/core/impl/ProjectSshKeyCoreServiceImpl.java`
#### Snippet
```java
   * therefore we need to get it from ServiceLocator lazily.
   * Probably it's worth to create @Lazy bean in spring context of REST API to make its injection more convenient.
   * @return
   */
  private ServerSshKeyManager getServerSshKeyManager() {
```

### JavadocDeclaration
`@param dimensionNames` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   * This also has a side effect of not reporting the dimensions as known but not reported, see "reportKnownButNotReportedDimensions" method.
   *
   * @param dimensionNames
   */
  public void markUnused(@NotNull String... dimensionNames) {
```

### JavadocDeclaration
`@param dimensionNames` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   * This also has a side effect of not reporting the dimensions as known but not reported, see "reportKnownButNotReportedDimensions" method.
   *
   * @param dimensionNames
   */
  public void markAllUnused() {
```

### JavadocDeclaration
Class/method reference, quoted text, or HTML link are expected after @see tag
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
  /**
   * Gets the value without marking it as used.
   * @see {@link Locator#getSingleValue()}
   * @return the value of single-value-locator
   */
```

### JavadocDeclaration
`@param hiddenDimensions` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   * Sets dimensions which will not be reported by checkLocatorFullyProcessed method as used but not declared
   *
   * @param hiddenDimensions
   */
  public void addHiddenDimensions(final String... hiddenDimensions) {
```

### JavadocDeclaration
`@param locator` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   * Creates a new locator as a copy of the passed one preserving the entire state.
   *
   * @param locator
   */
  public Locator(@NotNull final Locator locator) {
```

### JavadocDeclaration
`@param locator` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   * Creates usual mode locator
   *
   * @param locator
   * @param supportedDimensions dimensions supported in this locator, used in {@link #checkLocatorFullyProcessed()}
   * @throws LocatorProcessException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   * @param locator
   * @param supportedDimensions dimensions supported in this locator, used in {@link #checkLocatorFullyProcessed()}
   * @throws LocatorProcessException
   */
  public Locator(@Nullable final String locator, @Nullable final String... supportedDimensions) throws LocatorProcessException {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   * </pre>
   *
   * @return
   */
  public boolean isSingleValue() {
```

### JavadocDeclaration
`@param locator` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   * Creates locator with given metadata
   *
   * @param locator
   * @param supportedDimensions dimensions supported in this locator, used in {@link #checkLocatorFullyProcessed()}
   * @throws LocatorProcessException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   * @param locator
   * @param supportedDimensions dimensions supported in this locator, used in {@link #checkLocatorFullyProcessed()}
   * @throws LocatorProcessException
   */
  public Locator(@Nullable final String locator, final Metadata metadata, @Nullable final String... supportedDimensions) throws LocatorProcessException {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   * @param dimensionName only alpha-numeric characters are supported! Only numeric values without brackets are supported!
   * @param value         new value for the dimension, only alpha-numeric characters are supported!
   * @return
   */
  @Nullable
```

### JavadocDeclaration
`@param text` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   * Scans text skipping blocks wrapped in "()", returns on found stopText, after closing ")" if stopText is null or on reaching end of string
   *
   * @param text
   * @param stopText
   * @return negative value if text is not well-formed, position of a char before stopText, last char of () sequence if stopText is null or length of the text
```

### JavadocDeclaration
`@param stopText` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   *
   * @param text
   * @param stopText
   * @return negative value if text is not well-formed, position of a char before stopText, last char of () sequence if stopText is null or length of the text
   */
```

### JavadocDeclaration
`@param dimensionName` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   * </pre>
   *
   * @param dimensionName
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   *
   * @param dimensionName
   * @return
   */
  @Nullable
```

### JavadocDeclaration
`@param locator` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   * Creates usual or extended mode locator
   *
   * @param locator
   * @param supportedDimensions dimensions supported in this locator, used in {@link #checkLocatorFullyProcessed()}
   * @throws LocatorProcessException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   * @param locator
   * @param supportedDimensions dimensions supported in this locator, used in {@link #checkLocatorFullyProcessed()}
   * @throws LocatorProcessException
   */
  public Locator(@Nullable final String locator, final boolean extendedMode, @Nullable final String... supportedDimensions) throws LocatorProcessException {
```

### JavadocDeclaration
Wrong tag `date`
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
 *
 * @author Yegor.Yarko
 * @date 13.08.2010
 */
public class Locator {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   *
   * @param strings each odd arguments is a name of a dimension. each event argument is the locator text.
   * @return
   * @throws IllegalArgumentException if odd number of arguments passed.
   * @implNote If no arguments passed, then undefined behaviour.
```

### JavadocDeclaration
`@param locator` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   * If "locator" text is empty, "defaults" locator will be used
   *
   * @param locator
   * @param defaults
   * @param supportedDimensions
```

### JavadocDeclaration
`@param defaults` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   *
   * @param locator
   * @param defaults
   * @param supportedDimensions
   * @return
```

### JavadocDeclaration
`@param supportedDimensions` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   * @param locator
   * @param defaults
   * @param supportedDimensions
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
   * @param defaults
   * @param supportedDimensions
   * @return
   */
  @NotNull
```

### JavadocDeclaration
`@param descriptor` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/change/SVcsModificationOrChangeDescriptor.java`
#### Snippet
```java
   * descriptor.getRelatedVcsChange must be non-null;
   *
   * @param descriptor
   */
  public SVcsModificationOrChangeDescriptor(@NotNull ChangeDescriptor descriptor) {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java

  /**
   * @return
   * @deprecated since 01.2014
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
  /**
   * Link to builds of this build configuration. Is not present for templates.
   * @return
   */
  @XmlElement(name = "builds")
```

### JavadocDeclaration
Wrong tag `Deprecated`
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
   * This is preserved for compatibility reasons with TeamCity before 2017.2 where only one template can be used in a build configuration
   * @return the first template used in the build configuration
   * @Deprecated use getTemplates
   */
  @XmlElement(name = "template")
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/model/buildType/BuildType.java`
#### Snippet
```java
   * Link to investigations for this build type
   *
   * @return
   */
  @XmlElement(name = "investigations")
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/BuildQueueRequest.java`
#### Snippet
```java
   *
   * @param locator Build locator to filter builds
   * @return
   */
  @GET
```

### JavadocDeclaration
Tag `return` is not allowed here
in `src/jetbrains/buildServer/server/rest/request/BuildQueueRequest.java`
#### Snippet
```java
   *
   * @param locator Build locator to filter builds to delete
   * @return
   */
  @DELETE
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/model/Util.java`
#### Snippet
```java
   * @param <T> the initial value type
   * @param <R> the result type
   * @return
   * @deprecated since 01.2023. Use `Optional.ofNullable(value).map(mapper).orElse(null);` instead;
   */
```

### JavadocDeclaration
Wrong tag `deprected`
in `src/jetbrains/buildServer/server/rest/data/BranchMatcher.java`
#### Snippet
```java
/**
 * Specifies branch locator.
 * @deprected see {@link BranchFinder}
 * @author Yegor.Yarko
 *         Date: 18.01.12
```

### JavadocDeclaration
`@param vcsRootInstanceLocator` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/VcsRootRequest.java`
#### Snippet
```java
  /**
   * @param vcsRootLocator this is effectively ignored as vcsRootInstanceLocator should specify instance fully
   * @param vcsRootInstanceLocator
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/request/VcsRootRequest.java`
#### Snippet
```java
   * @param vcsRootLocator this is effectively ignored as vcsRootInstanceLocator should specify instance fully
   * @param vcsRootInstanceLocator
   * @return
   */
  @GET
```

### JavadocDeclaration
Wrong tag `date`
in `src/jetbrains/buildServer/server/rest/data/finder/impl/ChangeFinder.java`
#### Snippet
```java
/**
 * @author Yegor.Yarko
 * @date 12.05.13
 */
@LocatorResource(value = LocatorName.CHANGE,
```

### JavadocDeclaration
`@return` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/finder/FinderImpl.java`
#### Snippet
```java
   * @param locatorText if null, then the empty locator with some finder specific locator defaults is created.
   * @param locatorDefaults optional parameter. if {@code locatorText} does not have some dimensions, then they are going to be retrieved from this.
   * @return
   */
  @NotNull
```

### JavadocDeclaration
Wrong tag `returns`
in `src/jetbrains/buildServer/server/rest/data/finder/FinderImpl.java`
#### Snippet
```java
  /**
   * @throws NotFoundException if there is locator sub-dimension which references a single entry which cannot be found (might need to return empty collection for the case as well)
   * @returns the items found by locatorText or empty collection if the locator does ot correspond to any item
   */
  @Override
```

### JavadocDeclaration
Wrong tag `returns`
in `src/jetbrains/buildServer/server/rest/data/finder/FinderImpl.java`
#### Snippet
```java
  /**
   * @throws NotFoundException if there is locator sub-dimension which  references a single entry which cannot be found (might need to return empty collection for the case as well)
   * @returns the items found by locatorText or empty collection if the locator does ot correspond to any item
   */
  @NotNull
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
   * <br/>
   * See also: {@link BuildPromotionFinder#getBuildPromotion(long)}
   * @throws NotFoundException
   * @throws AccessDeniedException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/jetbrains/buildServer/server/rest/data/finder/impl/BuildPromotionFinder.java`
#### Snippet
```java
   * See also: {@link BuildPromotionFinder#getBuildPromotion(long)}
   * @throws NotFoundException
   * @throws AccessDeniedException
   */
  @NotNull
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `myAuditLogProvider` may be 'final'
in `src/jetbrains/buildServer/server/rest/data/finder/impl/AuditEventFinder.java`
#### Snippet
```java
  public static final Set<ActionType> HIDDEN_ACTION_TYPES = ActionType.getHiddenActionTypes();

  private AuditLogProvider myAuditLogProvider;
  @NotNull private final ServiceLocator myServiceLocator;

```

### FieldMayBeFinal
Field `myExcludedCount` may be 'final'
in `src/jetbrains/buildServer/server/graphql/model/connections/agentPool/AgentPoolProjectsConnection.java`
#### Snippet
```java
  private final PaginatingConnection<SProject, Project, AgentPoolProjectsConnectionEdge> myDelegate;
  @Nullable
  private Integer myExcludedCount;

  public AgentPoolProjectsConnection(@NotNull List<SProject> data, @Nullable Integer excludedCount, @NotNull PaginationArguments paginationArguments) {
```

### FieldMayBeFinal
Field `LOG` may be 'final'
in `src/jetbrains/buildServer/server/rest/request/FilesSubResource.java`
#### Snippet
```java
public class FilesSubResource {

  private static Logger LOG = Logger.getInstance(FilesSubResource.class.getName());

  public static final String METADATA = "/metadata";
```

### FieldMayBeFinal
Field `LOG` may be 'final'
in `src/jetbrains/buildServer/server/rest/data/ParameterCondition.java`
#### Snippet
```java
 */
public class ParameterCondition {
  private static Logger LOG = Logger.getInstance(ParameterCondition.class.getName());

  public static final String NAME = "name";
```

### FieldMayBeFinal
Field `LOG` may be 'final'
in `src/jetbrains/buildServer/server/rest/data/TimeWithPrecision.java`
#### Snippet
```java
 */
public class TimeWithPrecision {
  private static Logger LOG = Logger.getInstance(TimeWithPrecision.class.getName());
  public static final String SUPPORTED_HINT = "Supported format example: '-4w2d5h30m5s'";

```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `src/META-INF/build-server-plugin-rest-api.xml`
#### Snippet
```java
               http://www.springframework.org/schema/context
               http://www.springframework.org/schema/context/spring-context-3.0.xsd"
       default-autowire="constructor">

  <!--
```

### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `contrib/src/META-INF/build-server-plugin-restcontrib.xml`
#### Snippet
```java
       xsi:schemaLocation="http://www.springframework.org/schema/beans
               http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">

  <bean id="restControllerExtensionInitializer" class="jetbrains.buildServer.server.restcontrib.RESTControllerExtensionInitializer"/>
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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/jetbrains/buildServer/server/rest/data/finder/impl/VcsRootFinder.java`
#### Snippet
```java
//          if (null != personalSupportService.mapPath(Arrays.asList(new VcsSettings(root, "")), repositoryIdStringWithoutType, true).getMappedPath())
//          return true;
          List<Boolean> canAffectList = personalSupportService.canAffect(Arrays.asList(new VcsSettings(root, "")), Collections.singletonList(repositoryIdStringWithoutType), true);
          for (Boolean aBoolean : canAffectList) {
            if (aBoolean) return true;
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/jetbrains/buildServer/server/rest/data/finder/TypedFinderBuilder.java`
#### Snippet
```java

  private static <T extends Enum<T>> List<String> getValues(final @NotNull Class<T> enumClass) {
    return CollectionsUtil.convertCollection(Arrays.asList(enumClass.getEnumConstants()), source -> source.name().toLowerCase());
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
  private static final String DIMENSION_COMPLEX_VALUE_START_DELIMITER = "(";
  private static final String DIMENSION_COMPLEX_VALUE_END_DELIMITER = ")";
  private static final List<String> LIST_WITH_EMPTY_STRING = Arrays.asList("");
  private static final String BASE64_ESCAPE_FAKE_DIMENSION = "$base64";
  public static final String LOCATOR_SINGLE_VALUE_UNUSED_NAME = "$singleValue";
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
    }
    Set<String> ignoredDimensions = mySupportedDimensions == null ? Collections.emptySet() :
                                    CollectionsUtil.intersect(unusedDimensions, CollectionsUtil.join(Arrays.asList(mySupportedDimensions), myHiddenSupportedDimensions));
    Set<String> unknownDimensions = CollectionsUtil.minus(unusedDimensions, ignoredDimensions);
    StringBuilder message = new StringBuilder();
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
      if (currentList == null) {
        // Dimension with an empy string value is a frequent case in a Fields, so let's reuse a special list for that list.
        newList = currentDimensionValue.equals("") ? LIST_WITH_EMPTY_STRING : Arrays.asList(currentDimensionValue);
      } else {
        newList = new ArrayList<>(currentList);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
      mySupportedDimensions = dimensions;
    } else {
      mySupportedDimensions = CollectionsUtil.join(Arrays.asList(mySupportedDimensions), Arrays.asList(dimensions)).toArray(mySupportedDimensions);
    }
  }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/jetbrains/buildServer/server/rest/data/Locator.java`
#### Snippet
```java
      mySupportedDimensions = dimensions;
    } else {
      mySupportedDimensions = CollectionsUtil.join(Arrays.asList(mySupportedDimensions), Arrays.asList(dimensions)).toArray(mySupportedDimensions);
    }
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

## RuleId[id=SuspiciousIndentAfterControlStatement]
### SuspiciousIndentAfterControlStatement
Suspicious indentation after 'if' statement
in `src/jetbrains/buildServer/server/rest/data/build/GenericBuildsFilter.java`
#### Snippet
```java
        @Nullable final Branch buildBranch = build.getBuildPromotion().getBranch();
        if (buildBranch != null && !buildBranch.isDefaultBranch())
        return false;
      }
    }
```

