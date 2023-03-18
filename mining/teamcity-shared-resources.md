# teamcity-shared-resources 
 
# Bad smells
I found 52 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 18 | false |
| BoundedWildcard | 16 | false |
| StringEqualsEmptyString | 4 | false |
| RedundantSuppression | 4 | false |
| SuspiciousMethodCalls | 3 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| UnnecessaryFullyQualifiedName | 2 | false |
| DoubleBraceInitialization | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| MissortedModifiers | 1 | false |
## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/sharedResources/model/resources/ResourceType.java`
#### Snippet
```java
  public static ResourceType fromString(@Nullable final String str) {
    if (str == null) {
      return null;
    } else {
      for (ResourceType type: values()) {
```

### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/sharedResources/model/resources/ResourceType.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/sharedResources/pages/usage/ResourceUsages.java`
#### Snippet
```java
  private SProject findProject(@Nullable final String currentProjectId) {
    if (StringUtil.isEmptyOrSpaces(currentProjectId)) {
      return null;
    }
    try {
```

### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/sharedResources/pages/usage/ResourceUsages.java`
#### Snippet
```java
      return myProjectManager.findProjectByExternalId(currentProjectId);
    } catch (AccessDeniedException ignored) {}
    return null;
  }

```

### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/sharedResources/model/resources/ResourceFactory.java`
#### Snippet
```java
    final String name = parameters.get(NAME);
    if (isEmptyOrSpaces(name)) {
      return null;
    }
    if (type == ResourceType.QUOTED) {
```

### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/sharedResources/server/report/UsedResourcesSerializer.java`
#### Snippet
```java
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> type) {
      if (type.getRawType() != Resource.class) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/sharedResources/model/LockType.java`
#### Snippet
```java
      return WRITE;
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/sharedResources/pages/ResourceHelper.java`
#### Snippet
```java
        } catch (IllegalArgumentException e) {
          LOG.warn("Illegal argument supplied in quota for resource [" + resourceName + "]");
          return null;
        }
      } else {
```

### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/sharedResources/pages/ResourceHelper.java`
#### Snippet
```java
      }
    } else {
      return null;
    }
    return null;
```

### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/sharedResources/pages/ResourceHelper.java`
#### Snippet
```java
      return null;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/sharedResources/pages/ResourceHelper.java`
#### Snippet
```java
    Resource resource = null;
    if (isEmptyOrSpaces(resourceId)) {
      return null;
    }
    if (ResourceType.QUOTED.equals(resourceType)) {
```

### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/sharedResources/pages/ResourceHelper.java`
#### Snippet
```java
  private Map<String, String> validate(@NotNull final Map<String, String> params) {
    if (params.values().stream().anyMatch(StringUtil::isEmptyOrSpaces)) {
      return null;
    } else {
      return params;
```

### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/sharedResources/server/runtime/LocksStorageImpl.java`
#### Snippet
```java
                              myLocksCache.invalidate(build.getBuildPromotion());
                              existsSet.remove(build.getBuildPromotion().getId());
                              return null;
                            });
                   return null;
```

### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/sharedResources/server/runtime/LocksStorageImpl.java`
#### Snippet
```java
                              return null;
                            });
                   return null;
                 });
      }
```

### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/sharedResources/server/runtime/LocksStorageImpl.java`
#### Snippet
```java
              myLocksCache.put(buildPromotion, locksToStore);
              existsSet.add(buildPromotion.getId());
              return null;
            });
          } else {
```

### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/sharedResources/server/runtime/LocksStorageImpl.java`
#### Snippet
```java
          log.warn("Failed to store taken locks for build [" + buildPromotion + "]; Message is: " + e.getMessage());
        }
        return null;
      });
    }
```

### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/sharedResources/server/SharedResourcesAgentsFilter.java`
#### Snippet
```java
    } catch (BuildTypeNotFoundException ignored) {
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/sharedResources/server/runtime/TakenLocksImpl.java`
#### Snippet
```java
      }
    }
    return null;
  }
}
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ResourceFactory` has only 'static' members, and lacks a 'private' constructor
in `server/src/jetbrains/buildServer/sharedResources/model/resources/ResourceFactory.java`
#### Snippet
```java
 * @author Oleg Rybak (oleg.rybak@jetbrains.com)
 */
public class ResourceFactory {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `SharedResourcesPluginConstants` has only 'static' members, and lacks a 'private' constructor
in `server/src/jetbrains/buildServer/sharedResources/SharedResourcesPluginConstants.java`
#### Snippet
```java
 * @author Oleg Rybak
 */
public class SharedResourcesPluginConstants {

  /**
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.sharedResources.server` is unnecessary and can be removed
in `server/src/jetbrains/buildServer/sharedResources/server/BuildFeatureParametersProvider.java`
#### Snippet
```java
 * Exposes {@code SharedResourcesBuildFeature} parameters to build
 *
 * @see jetbrains.buildServer.sharedResources.server.SharedResourcesBuildFeature
 * @author Oleg Rybak (oleg.rybak@jetbrains.com)
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.sharedResources.model` is unnecessary and can be removed
in `server/src/jetbrains/buildServer/sharedResources/server/feature/Locks.java`
#### Snippet
```java
 * Defines operations tha deal with locks
 *
 * @see jetbrains.buildServer.sharedResources.model.Lock
 * @see jetbrains.buildServer.sharedResources.model.LockType
 *
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `server/src/jetbrains/buildServer/sharedResources/server/health/InvalidLocksReport.java`
#### Snippet
```java
        resultConsumer.consumeForBuildType(
                type,
                new HealthStatusItem(myCategory.getId() + "_" + type.getInternalId(), myCategory, new HashMap<String, Object>() {{
          put("invalid_locks", invalidLocks);
          put("build_type", type);
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Map\>' may not contain keys of type ''
in `server/src/jetbrains/buildServer/sharedResources/server/runtime/ResourceAffinity.java`
#### Snippet
```java
      iterator.advance();
      if (!currentPromotionIds.contains(iterator.key())) {
        Optional.ofNullable(iterator.value()).ifPresent(it -> it.forEach(resourceId -> myLockedValues.get(resourceId).remove(iterator.key())));
        iterator.remove();
      }
```

### SuspiciousMethodCalls
'Map' may not contain keys of type ''
in `server/src/jetbrains/buildServer/sharedResources/server/runtime/TakenLocksImpl.java`
#### Snippet
```java
      if (chainTakenLock != null) {
        result.put(rc, new TakenLock(rc,
                                     CollectionsUtil.filterMapByKeys(tl.getReadLocks(), key -> !chainTakenLock.containsKey(key)),
                                     CollectionsUtil.filterMapByKeys(tl.getWriteLocks(), key -> !chainTakenLock.containsKey(key))));
      } else {
```

### SuspiciousMethodCalls
'Map' may not contain keys of type ''
in `server/src/jetbrains/buildServer/sharedResources/server/runtime/TakenLocksImpl.java`
#### Snippet
```java
        result.put(rc, new TakenLock(rc,
                                     CollectionsUtil.filterMapByKeys(tl.getReadLocks(), key -> !chainTakenLock.containsKey(key)),
                                     CollectionsUtil.filterMapByKeys(tl.getWriteLocks(), key -> !chainTakenLock.containsKey(key))));
      } else {
        result.put(rc, tl);
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Resource`
in `server/src/jetbrains/buildServer/sharedResources/server/ConfigurationInspector.java`
#### Snippet
```java

  @NotNull
  private Map<String, String> resolveStep(@NotNull final List<Resource> resources,
                                          @NotNull final Map<String, Lock> locks) {
    Map<String, String> result = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends Lock`
in `server/src/jetbrains/buildServer/sharedResources/server/ConfigurationInspector.java`
#### Snippet
```java
  @NotNull
  private Map<String, String> resolveStep(@NotNull final List<Resource> resources,
                                          @NotNull final Map<String, Lock> locks) {
    Map<String, String> result = new HashMap<>();
    resources.forEach(rc -> {
```

### BoundedWildcard
Can generalize to `? extends Lock`
in `server/src/jetbrains/buildServer/sharedResources/server/feature/LocksImpl.java`
#### Snippet
```java
  @NotNull
  @Override
  public Map<String, String> asBuildParameters(@NotNull final Collection<Lock> locks) {
    final Map<String, String> buildParams = new HashMap<>();
    for (Lock lock: locks) {
```

### BoundedWildcard
Can generalize to `? extends SharedResourcesFeature`
in `server/src/jetbrains/buildServer/sharedResources/server/feature/LocksImpl.java`
#### Snippet
```java
  @NotNull
  @Override
  public Map<String, Lock> fromBuildFeaturesAsMap(@NotNull final Collection<SharedResourcesFeature> features) {
    final Map<String, Lock> result = new LinkedHashMap<>();       // enforced -> my -> template
    features.stream()
```

### BoundedWildcard
Can generalize to `? extends Lock`
in `server/src/jetbrains/buildServer/sharedResources/server/SharedResourcesContextProcessor.java`
#### Snippet
```java

  @NotNull
  private Map<Lock, String> initTakenValues(@NotNull final Collection<Lock> myLocks) {
    return myLocks.stream()
                  .collect(Collectors.toMap(Function.identity(), val -> ""));
```

### BoundedWildcard
Can generalize to `? extends Resource`
in `server/src/jetbrains/buildServer/sharedResources/server/SharedResourcesContextProcessor.java`
#### Snippet
```java

  private Map<String, CustomResource> getCustomResources(@NotNull final String projectId,
                                                         @NotNull final Map<String, Resource> projectResources,
                                                         @NotNull final Map<String, Map<String, CustomResource>> projectTreeCustomResources) {
    return projectTreeCustomResources.computeIfAbsent(projectId,
```

### BoundedWildcard
Can generalize to `? super String`
in `server/src/jetbrains/buildServer/sharedResources/server/SharedResourcesContextProcessor.java`
#### Snippet
```java
  private Map<String, CustomResource> getCustomResources(@NotNull final String projectId,
                                                         @NotNull final Map<String, Resource> projectResources,
                                                         @NotNull final Map<String, Map<String, CustomResource>> projectTreeCustomResources) {
    return projectTreeCustomResources.computeIfAbsent(projectId,
                                                      id -> projectResources.values().stream()
```

### BoundedWildcard
Can generalize to `? extends CustomResource`
in `server/src/jetbrains/buildServer/sharedResources/server/SharedResourcesContextProcessor.java`
#### Snippet
```java
  }

  private Map<String, CustomResource> matchCustomResources(@NotNull final Map<String, CustomResource> resources,
                                                           @NotNull final Map<String, Lock> locks) {
    final Map<String, CustomResource> result = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends List`
in `server/src/jetbrains/buildServer/sharedResources/pages/beans/BeansFactory.java`
#### Snippet
```java

  private void checkOverrides(final Resource resource,
                              final Map<String, List<Resource>> result,
                              final Map<String, Resource> overridesMap) {
    result.forEach((projectId, resources) -> {
```

### BoundedWildcard
Can generalize to `? super String`
in `server/src/jetbrains/buildServer/sharedResources/pages/beans/BeansFactory.java`
#### Snippet
```java
  private void checkOverrides(final Resource resource,
                              final Map<String, List<Resource>> result,
                              final Map<String, Resource> overridesMap) {
    result.forEach((projectId, resources) -> {
      for (Resource rc: resources) {
```

### BoundedWildcard
Can generalize to `? super Resource`
in `server/src/jetbrains/buildServer/sharedResources/pages/beans/BeansFactory.java`
#### Snippet
```java
  private void checkOverrides(final Resource resource,
                              final Map<String, List<Resource>> result,
                              final Map<String, Resource> overridesMap) {
    result.forEach((projectId, resources) -> {
      for (Resource rc: resources) {
```

### BoundedWildcard
Can generalize to `? extends TakenLock`
in `server/src/jetbrains/buildServer/sharedResources/server/SharedResourcesAgentsFilter.java`
#### Snippet
```java

  private String getNextAvailableValue(@NotNull final CustomResource resource,
                                       @NotNull final Map<Resource, TakenLock> takenLocks,
                                       @NotNull final BuildPromotion promotion,
                                       @NotNull final DistributionDataAccessor accessor) {
```

### BoundedWildcard
Can generalize to `? super Map`
in `server/src/jetbrains/buildServer/sharedResources/server/SharedResourcesAgentsFilter.java`
#### Snippet
```java
  private void gatherRuntimeInfo(@NotNull final List<RunningBuildEx> runningBuilds,
                                 @NotNull final Map<QueuedBuildInfo, SBuildAgent> canBeStarted,
                                 @NotNull final AtomicReference<Map<Resource, TakenLock>> takenLocks) {
    if (takenLocks.get() == null) {
      takenLocks.set(myTakenLocks.collectTakenLocks(runningBuilds, canBeStarted.keySet()));
```

### BoundedWildcard
Can generalize to `? extends Lock`
in `server/src/jetbrains/buildServer/sharedResources/server/runtime/TakenLocksImpl.java`
#### Snippet
```java

  @Override
  public Map<Resource, String> getUnavailableLocks(@NotNull final Map<String, Lock> locksToTake,
                                                   @NotNull final Map<Resource, TakenLock> takenLocks,
                                                   @NotNull final DistributionDataAccessor distributionDataAccessor,
```

### BoundedWildcard
Can generalize to `? extends Resource`
in `server/src/jetbrains/buildServer/sharedResources/server/runtime/TakenLocksImpl.java`
#### Snippet
```java
                                                   @NotNull final Map<Resource, TakenLock> takenLocks,
                                                   @NotNull final DistributionDataAccessor distributionDataAccessor,
                                                   @NotNull final Map<String, Resource> chainNodeResources,
                                                   @NotNull final Map<Resource, Map<BuildPromotionEx, Lock>> chainLocks,
                                                   @NotNull final BuildPromotion promotion) {
```

### BoundedWildcard
Can generalize to `? extends Lock`
in `server/src/jetbrains/buildServer/sharedResources/server/runtime/TakenLocksImpl.java`
#### Snippet
```java

  @Override
  public Map<Resource, String> getUnavailableLocks(@NotNull final Collection<Lock> locksToTake,
                                                   @NotNull final Map<Resource, TakenLock> takenLocks,
                                                   @NotNull final String projectId,
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `c`
in `server/src/jetbrains/buildServer/sharedResources/server/report/UsedResourcesSerializer.java`
#### Snippet
```java
    String name = field.getName();
    if (name.startsWith("my")) {
      char c[] = name.substring(2).toCharArray();
      c[0] = Character.toLowerCase(c[0]);
      return new String(c);
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final @NotNull`
in `server/src/jetbrains/buildServer/sharedResources/server/analysis/ResourceUsageAnalyzer.java`
#### Snippet
```java

  @NotNull
  private List<BuildTypeSettings> getLookupScope(final @NotNull SProject project) {
    final List<BuildTypeSettings> lookupScope = new ArrayList<>();
    lookupScope.addAll(project.getBuildTypes());
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `server/src/jetbrains/buildServer/sharedResources/server/feature/LocksImpl.java`
#### Snippet
```java
    final String locksString = featureParameters.get(LOCKS_FEATURE_PARAM_KEY);
    final Map<String, Lock> result = new LinkedHashMap<>();
    if (locksString != null && !"".equals(locksString)) {
      final List<String> serializedLocks = StringUtil.split(locksString, true, '\n');
      for (String str: serializedLocks) {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `server/src/jetbrains/buildServer/sharedResources/server/SharedResourcesContextProcessor.java`
#### Snippet
```java
            String currentValue;
            if (LockType.READ.equals(currentLock.getType())) {
              if (currentLock.getValue().equals("")) { // ANY lock
                currentValue = (String)((BuildPromotionEx)currentBuildPromotion).getAttribute(getReservedResourceAttributeKey(entry.getValue().getId()));
                if (currentValue == null) {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `server/src/jetbrains/buildServer/sharedResources/server/runtime/LocksStorageImpl.java`
#### Snippet
```java
  @NotNull
  private String serializeTakenLock(@NotNull final Lock lock, @NotNull final String value) {
    return StringUtil.join("\t", lock.getName(), lock.getType(), value.equals("") ? " " : value);
  }

```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `server/src/jetbrains/buildServer/sharedResources/server/runtime/TakenLocksImpl.java`
#### Snippet
```java
            if (resource instanceof CustomResource
                && lock.getType() == LockType.READ
                && lock.getValue().equals("")) { // ANY LOCK
              String reservedValue = (String)bpEx.getAttribute(getReservedResourceAttributeKey(resource.getId()));
              if (reservedValue != null) {
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `server/src/jetbrains/buildServer/sharedResources/server/SharedResourcesAgentsFilter.java`
#### Snippet
```java
  @Nullable
  @SuppressWarnings("StringBufferReplaceableByString")
  private WaitReason checkForInvalidLocks(@NotNull final SBuildType buildType) {
    WaitReason result = null;
    final Map<Lock, String> invalidLocks = myInspector.inspect(buildType);
```

### RedundantSuppression
Redundant suppression
in `server/src/jetbrains/buildServer/sharedResources/server/report/UsedResourcesSerializer.java`
#### Snippet
```java
        @SuppressWarnings("unchecked")
        @Override
        public T read(final JsonReader jsonReader) throws JsonParseException {
          JsonElement tree = Streams.parse(jsonReader);
          JsonObject object = tree.getAsJsonObject();
```

### RedundantSuppression
Redundant suppression
in `server/src/jetbrains/buildServer/sharedResources/server/runtime/LocksStorageImpl.java`
#### Snippet
```java
  @SuppressWarnings("UnstableApiUsage")
  @NotNull
  private final LoadingCache<BuildPromotion, Map<String, Lock>> myLocksCache;

  @SuppressWarnings("UnstableApiUsage")
```

### RedundantSuppression
Redundant suppression
in `server/src/jetbrains/buildServer/sharedResources/server/runtime/LocksStorageImpl.java`
#### Snippet
```java
  @SuppressWarnings("UnstableApiUsage")
  @NotNull
  private final Striped<java.util.concurrent.locks.Lock> myGuards = Striped.lazyWeakLock(TeamCityProperties.getInteger("teamcity.sharedResources.locksStorage.stripedSize", 300));

  public LocksStorageImpl(@NotNull final EventDispatcher<BuildServerListener> dispatcher) {
```

