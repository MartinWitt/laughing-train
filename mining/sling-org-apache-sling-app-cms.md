# sling-org-apache-sling-app-cms 
 
# Bad smells
I found 294 bad smells with 23 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=ReturnNull] | 48 | false |
| RuleId[ruleID=DataFlowIssue] | 41 | false |
| RuleId[ruleID=RegExpRedundantEscape] | 22 | false |
| RuleId[ruleID=BoundedWildcard] | 19 | false |
| RuleId[ruleID=UnusedAssignment] | 17 | false |
| RuleId[ruleID=UnnecessaryModifier] | 15 | true |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 15 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 14 | false |
| RuleId[ruleID=NullableProblems] | 13 | false |
| RuleId[ruleID=FinalStaticMethod] | 11 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 11 | false |
| RuleId[ruleID=MismatchedCollectionQueryUpdate] | 10 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 9 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 8 | false |
| RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument] | 7 | true |
| RuleId[ruleID=FuseStreamOperations] | 5 | false |
| RuleId[ruleID=ManualMinMaxCalculation] | 4 | false |
| RuleId[ruleID=RedundantOperationOnEmptyContainer] | 3 | false |
| RuleId[ruleID=RegExpSingleCharAlternation] | 3 | false |
| RuleId[ruleID=ConstantValue] | 3 | false |
| RuleId[ruleID=SimplifyStreamApiCallChains] | 2 | false |
| RuleId[ruleID=ComparatorCombinators] | 2 | false |
| RuleId[ruleID=Java8MapForEach] | 1 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 1 | false |
| RuleId[ruleID=OptionalContainsCollection] | 1 | false |
| RuleId[ruleID=Convert2MethodRef] | 1 | false |
| RuleId[ruleID=KeySetIterationMayUseEntrySet] | 1 | false |
| RuleId[ruleID=RedundantCollectionOperation] | 1 | false |
| RuleId[ruleID=UnnecessaryToStringCall] | 1 | true |
| RuleId[ruleID=OptionalUsedAsFieldOrParameterType] | 1 | false |
| RuleId[ruleID=SystemOutErr] | 1 | false |
| RuleId[ruleID=SimplifyOptionalCallChains] | 1 | false |
| RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized] | 1 | false |
| RuleId[ruleID=HtmlWrongAttributeValue] | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new Integer\[pgs.size()\]'
in `reference/src/main/java/org/apache/sling/cms/reference/models/ItemList.java`
#### Snippet
```java
            pgs.add(i);
        }
        pages = pgs.toArray(new Integer[pgs.size()]);
        if (log.isDebugEnabled()) {
            log.debug("Loaded pages {}", Arrays.toString(pages));
```

### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new Integer\[pgs.size()\]'
in `reference/src/main/java/org/apache/sling/cms/reference/models/Search.java`
#### Snippet
```java
            pgs.add(i);
        }
        pages = pgs.toArray(new Integer[pgs.size()]);
        if (log.isDebugEnabled()) {
            log.debug("Loaded pages {}", Arrays.toString(pages));
```

### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new String\[values.size()\]'
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/fields/SelectionHandler.java`
#### Snippet
```java
        return Optional.ofNullable(parameterValues).map(v -> {
            List<String> values = Arrays.stream(v).filter(StringUtils::isNotBlank).collect(Collectors.toList());
            return values.toArray(new String[values.size()]);
        }).orElse(new String[0]);
    }
```

### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new String\[arguments.size()\]'
in `feature/src/main/java/org/apache/sling/cms/feature/Main.java`
#### Snippet
```java
        arguments.add(farUrl.toString());

        org.apache.sling.feature.launcher.impl.Main.main(arguments.toArray(new String[arguments.size()]));
    }
}
```

### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new ResourceBundleProvider\[this.providers.size()\]'
in `core/src/main/java/org/apache/sling/cms/core/i18n/impl/I18NProviderImpl.java`
#### Snippet
```java
        synchronized (this.providers) {
            this.providers.put(ServiceUtil.getComparableForServiceRanking(props, Order.ASCENDING), provider);
            this.sortedProviders = this.providers.values().toArray(new ResourceBundleProvider[this.providers.size()]);
        }
    }
```

### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new ResourceBundleProvider\[this.providers.size()\]'
in `core/src/main/java/org/apache/sling/cms/core/i18n/impl/I18NProviderImpl.java`
#### Snippet
```java
        synchronized (this.providers) {
            this.providers.remove(ServiceUtil.getComparableForServiceRanking(props, Order.ASCENDING));
            this.sortedProviders = this.providers.values().toArray(new ResourceBundleProvider[this.providers.size()]);
        }
    }
```

### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new String\[keywords.size()\]'
in `core/src/main/java/org/apache/sling/cms/core/internal/models/PageImpl.java`
#### Snippet
```java
            }
        }
        return keywords.toArray(new String[keywords.size()]);
    }

```

## RuleId[ruleID=RedundantOperationOnEmptyContainer]
### RuleId[ruleID=RedundantOperationOnEmptyContainer]
Collection `new ArrayList`() is always empty
in `core/src/main/java/org/apache/sling/cms/core/models/StartContent.java`
#### Snippet
```java
            }
        }
        return new ArrayList<Row>().stream();
    }
}
```

### RuleId[ruleID=RedundantOperationOnEmptyContainer]
Collection `empty` is always empty
in `core/src/main/java/org/apache/sling/cms/core/internal/models/AuthorizableWrapperImpl.java`
#### Snippet
```java
            } else {
                List<Authorizable> empty = Collections.emptyList();
                return empty.iterator();
            }
        } catch (RepositoryException e) {
```

### RuleId[ruleID=RedundantOperationOnEmptyContainer]
Collection `empty` is always empty
in `core/src/main/java/org/apache/sling/cms/core/internal/models/AuthorizableWrapperImpl.java`
#### Snippet
```java
            } else {
                List<Authorizable> empty = Collections.emptyList();
                return empty.iterator();
            }
        } catch (RepositoryException e) {
```

## RuleId[ruleID=UnnecessaryModifier]
### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `reference/src/main/java/org/apache/sling/cms/reference/SearchService.java`
#### Snippet
```java
	 * @return the appropriate resource resolvers
	 */
	public ResourceResolver getResourceResolver(SlingHttpServletRequest request);
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/sling/cms/AuthorizableWrapper.java`
#### Snippet
```java
     * @return true if the authorizable is a member of the group
     */
    public boolean isMember(String groupName);

}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/sling/cms/AuthorizableWrapper.java`
#### Snippet
```java
     * @return true if the user is a super user
     */
    public boolean isAdministrator();

    /**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/sling/cms/AuthorizableWrapper.java`
#### Snippet
```java
     */
    @NotNull
    public String getId();

    /**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/sling/cms/insights/PageInsightRequest.java`
#### Snippet
```java
     * @throws IOException an exception occurs retrieving the content
     */
    public Document getPageDocument() throws IOException;

    /**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/sling/cms/insights/PageInsightRequest.java`
#### Snippet
```java
     * @throws IOException an exception occurs retrieving the content
     */
    public Element getPageBodyElement() throws IOException;

    /**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/sling/cms/insights/PageInsightRequest.java`
#### Snippet
```java
     * @throws IOException an exception occurs retrieving the content
     */
    public String getPageHtml() throws IOException;

    public default TYPE getType() {
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/sling/cms/insights/PageInsightRequest.java`
#### Snippet
```java
     * @return the page
     */
    public Page getPage();

    /**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/sling/cms/insights/PageInsightRequest.java`
#### Snippet
```java
     * @throws IOException an exception occurs retrieving the content
     */
    public String getPageBodyHtml() throws IOException;

    /**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/sling/cms/insights/PageInsightRequest.java`
#### Snippet
```java
    public String getPageHtml() throws IOException;

    public default TYPE getType() {
        return TYPE.PAGE;
    }
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/sling/cms/insights/InsightRequest.java`
#### Snippet
```java
public interface InsightRequest {

    public enum TYPE {
        FILE, PAGE
    }
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/sling/cms/insights/FileInsightRequest.java`
#### Snippet
```java
public interface FileInsightRequest extends InsightRequest {

    public default TYPE getType() {
        return TYPE.FILE;
    }
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/sling/cms/insights/FileInsightRequest.java`
#### Snippet
```java
     * @return the file
     */
    public File getFile();

}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/sling/cms/readability/ReadabilityServiceFactory.java`
#### Snippet
```java
	 * @return the ReadabilityService or null
	 */
	public ReadabilityService getReadabilityService(Locale locale);

}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/sling/cms/usergenerated/UserGeneratedContentService.java`
#### Snippet
```java
public interface UserGeneratedContentService {

    public enum APPROVE_ACTION {
        MOVE, PUBLISH
    }
```

## RuleId[ruleID=Java8MapForEach]
### RuleId[ruleID=Java8MapForEach]
Can be replaced with 'Map.forEach()'
in `core/src/main/java/org/apache/sling/cms/core/internal/models/FileImpl.java`
#### Snippet
```java
        if (metadata != null) {
            metadata.getValueMap().entrySet()
                    .forEach(e -> data.put(Text.unescapeIllegalJcrChars(e.getKey()), e.getValue()));
        }
        data.remove(JcrConstants.JCR_PRIMARYTYPE);
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `feature/src/main/java/org/apache/sling/cms/feature/Main.java`
#### Snippet
```java
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Bootstrapping Sling CMS Feature Model");
```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Method invocation `equals` may produce `NullPointerException`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/DeleteUserGeneratedContentAction.java`
#### Snippet
```java

            if (!request.getOriginalRequest().getResourceResolver().getUserID()
                    .equals(ugcParent.getValueMap().get("user", String.class))) {
                throw new FormException("Cannot delete content not created by the current user");
            }
```

### RuleId[ruleID=DataFlowIssue]
Argument `userId` might be null
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/providers/UserProfileFormValueProvider.java`
#### Snippet
```java
            if (session != null) {
                UserManager userManager = session.getUserManager();
                User user = (User) userManager.getAuthorizable(userId);
                
                formData.put("userId", user.getID());
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getID` may produce `NullPointerException`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/providers/UserProfileFormValueProvider.java`
#### Snippet
```java
                User user = (User) userManager.getAuthorizable(userId);
                
                formData.put("userId", user.getID());

                String subpath = providerResource.getValueMap().get(FormConstants.PN_SUBPATH, FormConstants.PATH_PROFILE);
```

### RuleId[ruleID=DataFlowIssue]
Argument `resource` might be null
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/UpdateUserGeneratedContentAction.java`
#### Snippet
```java

            Resource resource = resolver.getResource(path);
            Resource ugcParent = findUgcParent(resource);

            if (!request.getOriginalRequest().getResourceResolver().getUserID()
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `equals` may produce `NullPointerException`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/UpdateUserGeneratedContentAction.java`
#### Snippet
```java

            if (!request.getOriginalRequest().getResourceResolver().getUserID()
                    .equals(ugcParent.getValueMap().get("user", String.class))) {
                throw new FormException("Cannot modify content not created by the current user");
            }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `putAll` may produce `NullPointerException`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/UpdateUserGeneratedContentAction.java`
#### Snippet
```java
            ModifiableValueMap mvm = resource.adaptTo(ModifiableValueMap.class);
            Map<String, Object> formData = request.getFormData();
            mvm.putAll(formData);
            resolver.commit();
            log.debug("Successfully persisted resource");
```

### RuleId[ruleID=DataFlowIssue]
Unboxing of `actionResource.getValueMap().get(PN_RESETTIMEOUT, Integer.class)` may produce `NullPointerException`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/RequestPasswordResetAction.java`
#### Snippet
```java
    public FormActionResult handleForm(Resource actionResource, FormRequest request) throws FormException {
        String email = request.getFormData().get(FormConstants.PN_EMAIL, String.class);
        int resetTimeout = actionResource.getValueMap().get(PN_RESETTIMEOUT, Integer.class);

        try (ResourceResolver adminResolver = factory.getServiceResourceResolver(
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getUserManager` may produce `NullPointerException`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/CreateUserAction.java`
#### Snippet
```java
                    Collections.singletonMap(ResourceResolverFactory.SUBSERVICE, FormConstants.SERVICE_USER))) {
                JackrabbitSession session = (JackrabbitSession) adminResolver.adaptTo(Session.class);
                final UserManager userManager = session.getUserManager();

                if (userManager.getAuthorizable(username) == null) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getUserManager` may produce `NullPointerException`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/RequestPasswordResetAction.java`
#### Snippet
```java

            JackrabbitSession session = (JackrabbitSession) adminResolver.adaptTo(Session.class);
            final UserManager userManager = session.getUserManager();

            if (userManager.getAuthorizable(email) != null) {
```

### RuleId[ruleID=DataFlowIssue]
Argument `email` might be null
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/RequestPasswordResetAction.java`
#### Snippet
```java
            final UserManager userManager = session.getUserManager();

            if (userManager.getAuthorizable(email) != null) {

                User user = (User) userManager.getAuthorizable(email);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `setProperty` may produce `NullPointerException`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/RequestPasswordResetAction.java`
#### Snippet
```java
                ValueFactory vf = session.getValueFactory();

                user.setProperty(PN_RESETTOKEN, vf.createValue(resetToken));
                user.setProperty(PN_RESETTIMEOUT, vf.createValue(deadline));

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getUserManager` may produce `NullPointerException`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/ResetPasswordAction.java`
#### Snippet
```java

            JackrabbitSession session = (JackrabbitSession) adminResolver.adaptTo(Session.class);
            final UserManager userManager = session.getUserManager();

            User user = (User) userManager.getAuthorizable(email);
```

### RuleId[ruleID=DataFlowIssue]
Argument `email` might be null
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/ResetPasswordAction.java`
#### Snippet
```java
            final UserManager userManager = session.getUserManager();

            User user = (User) userManager.getAuthorizable(email);

            if (user == null) {
```

### RuleId[ruleID=DataFlowIssue]
Argument `userId` might be null
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/UpdateProfileAction.java`
#### Snippet
```java

            final UserManager userManager = session.getUserManager();
            if (userManager.getAuthorizable(userId) == null) {

                log.warn("No profile found for {}", userId);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `setProperty` may produce `NullPointerException`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/UpdateProfileAction.java`
#### Snippet
```java
                    Value[] values = Arrays.stream(((String[]) e.getValue())).map(valueFactory::createValue)
                            .collect(Collectors.toList()).toArray(new Value[0]);
                    user.setProperty(subpath + "/" + e.getKey(), values);
                } else {
                    if (e.getValue() instanceof Calendar) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `setProperty` may produce `NullPointerException`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/UpdateProfileAction.java`
#### Snippet
```java
                        value = valueFactory.createValue((String) e.getValue());
                    }
                    user.setProperty(subpath + "/" + e.getKey(), value);
                }
            }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getInputStream` may produce `NullPointerException`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/fields/TextfieldHandler.java`
#### Snippet
```java
                RequestParameter param = request.getRequestParameter(name);
                try {
                    formData.put(name, param.getInputStream());
                } catch (IOException e) {
                    throw new FormException("Failed to read file input: " + name, e);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toString` may produce `NullPointerException`
in `feature/src/main/java/org/apache/sling/cms/feature/Main.java`
#### Snippet
```java
        arguments.addAll(Arrays.asList(args));
        arguments.add("-f");
        arguments.add(farUrl.toString());

        org.apache.sling.feature.launcher.impl.Main.main(arguments.toArray(new String[arguments.size()]));
```

### RuleId[ruleID=DataFlowIssue]
`null` is returned by the method declared as @NotNull
in `core/src/main/java/org/apache/sling/cms/core/models/StartContent.java`
#### Snippet
```java
                        log.warn("Failed to get iterator", e);
                    }
                    return null;
                };
                return StreamSupport.stream(iterable.spliterator(), false).limit(10);
```

### RuleId[ruleID=DataFlowIssue]
Array index is out of bounds
in `core/src/main/java/org/apache/sling/cms/core/i18n/impl/I18NProviderImpl.java`
#### Snippet
```java
                Value[] val = a.getProperty("profile/locale");
                if (val != null && val.length == 0) {
                    return val[0].getString();
                } else {
                    return Locale.ENGLISH.toLanguageTag();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getWorkspace` may produce `NullPointerException`
in `core/src/main/java/org/apache/sling/cms/core/models/QueryDebugger.java`
#### Snippet
```java
            if (statementParam.isPresent()) {

                QueryManager queryManager = request.getResourceResolver().adaptTo(Session.class).getWorkspace()
                        .getQueryManager();
                Query explainQuery = queryManager.createQuery("explain measure " + statementParam.get(), language);
```

### RuleId[ruleID=DataFlowIssue]
Argument `publishableParent.adaptTo(Page.class)` might be null
in `core/src/main/java/org/apache/sling/cms/core/internal/DefaultScriptBindingsValueProvider.java`
#### Snippet
```java
        Resource publishableParent = CMSUtils.findPublishableParent(resource);
        if (publishableParent != null && CMSConstants.NT_PAGE.equals(publishableParent.getResourceType())) {
            Optional.of(publishableParent.adaptTo(Page.class)).ifPresent(p -> {
                bindings.put("page", p);
                ServletRequest request = (ServletRequest) bindings.get("request");
```

### RuleId[ruleID=DataFlowIssue]
Argument `resource.adaptTo(PageManager.class).getPage()` might be null
in `core/src/main/java/org/apache/sling/cms/core/internal/models/PageInsightRequestModel.java`
#### Snippet
```java
    @Inject
    public PageInsightRequestModel(@Self Resource resource, @OSGiService SlingRequestProcessor requestProcessor) {
        super(resource.adaptTo(PageManager.class).getPage(), requestProcessor);
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getPage` may produce `NullPointerException`
in `core/src/main/java/org/apache/sling/cms/core/internal/models/PageInsightRequestModel.java`
#### Snippet
```java
    @Inject
    public PageInsightRequestModel(@Self Resource resource, @OSGiService SlingRequestProcessor requestProcessor) {
        super(resource.adaptTo(PageManager.class).getPage(), requestProcessor);
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `adaptTo` may produce `NullPointerException`
in `core/src/main/java/org/apache/sling/cms/core/internal/jobs/FileMetadataExtractorConsumer.java`
#### Snippet
```java
            log.debug("Processing metadata for {}", path);
            Resource resource = serviceResolver.getResource(path);
            File file = resource.adaptTo(File.class);
            log.debug("Retrieved file {}", file);
            extractor.updateMetadata(file);
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `properties.get(k, String[].class)` may produce `NullPointerException`
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ReferenceOperation.java`
#### Snippet
```java
                }
            } else if (properties.get(k) instanceof String[]) {
                for (String v : properties.get(k, String[].class)) {
                    if (matches(v)) {
                        log.trace("Found reference in property {}@{}", resource.getPath(), k);
```

### RuleId[ruleID=DataFlowIssue]
`null` is returned by the method declared as @NotNull
in `core/src/main/java/org/apache/sling/cms/core/internal/models/AuthorizableWrapperImpl.java`
#### Snippet
```java
        } catch (RepositoryException e) {
            log.error("Failed to get ID from authorizable: {}", authorizable, e);
            return null;
        }
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `resolver.getUserID()` might be null
in `core/src/main/java/org/apache/sling/cms/core/internal/models/AuthorizableWrapperImpl.java`
#### Snippet
```java

    public AuthorizableWrapperImpl(ResourceResolver resolver) throws RepositoryException {
        authorizable = CommonUtils.getUserManager(resolver).getAuthorizable(resolver.getUserID());
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getResourceType` may produce `NullPointerException`
in `core/src/main/java/org/apache/sling/cms/core/internal/listeners/FileMetadataExtractorListener.java`
#### Snippet
```java
                Collections.singletonMap(ResourceResolverFactory.SUBSERVICE, "sling-cms-metadata"))) {
            changes.stream().map(rc -> serviceResolver.getResource(rc.getPath()))
                    .filter(r -> CMSConstants.NT_FILE.equals(r.getResourceType())).forEach(r -> {
                        log.debug("Queueing resource {}", r);
                        jobManager.addJob(FileMetadataExtractorConsumer.TOPIC,
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `core/src/main/java/org/apache/sling/cms/core/internal/servlets/CmsDefaultErrorHandlerServlet.java`
#### Snippet
```java
                Resource pResource = adminResolver.resolve(slingRequest, slingRequest.getResource().getPath());
                if (!CMSUtils.isPublished(pResource) || pResource.isResourceType(Resource.RESOURCE_TYPE_NON_EXISTING)) {
                    errorCode = HttpServletResponse.SC_NOT_FOUND;
                } else if (UserConstants.DEFAULT_ANONYMOUS_ID.equals(resolver.getUserID())) {
                    errorCode = HttpServletResponse.SC_UNAUTHORIZED;
```

### RuleId[ruleID=DataFlowIssue]
Argument `handler` might be null
in `core/src/main/java/org/apache/sling/cms/core/internal/servlets/CmsDefaultErrorHandlerServlet.java`
#### Snippet
```java
        slingResponse.setStatus(errorCode);

        doInclude(slingRequest, slingResponse, handler);

        log.debug("Error handler initialized successfully!");
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getAuthorizable` may produce `NullPointerException`
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/ChangePasswordOperation.java`
#### Snippet
```java
            AuthorizableWrapper authWrapper = request.getResource().adaptTo(AuthorizableWrapper.class);

            if (authWrapper.getAuthorizable().isGroup()) {
                throw new RepositoryException("Authorizable is a group!");
            }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getPath` may produce `NullPointerException`
in `core/src/main/java/org/apache/sling/cms/core/internal/filters/EditIncludeFilter.java`
#### Snippet
```java
    private void writeDropTarget(Resource resource, PrintWriter writer, String order) {
        Map<String, Object> replacements = new HashMap<>();
        replacements.put("parentPath", resource.getParent().getPath());
        replacements.put("order", order);
        writeTemplate(writer, replacements, "droptarget.html");
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getAuthorizable` may produce `NullPointerException`
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/MembershipOperation.java`
#### Snippet
```java
            AuthorizableWrapper authWrapper = request.getResource().adaptTo(AuthorizableWrapper.class);

            Authorizable auth = authWrapper.getAuthorizable();
            response.setPath(auth.getPath());
            changes.add(Modification.onModified(auth.getPath()));
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getAuthorizable` may produce `NullPointerException`
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/MembershipOperation.java`
#### Snippet
```java
                    throw new RepositoryException("Failed to resolve authorizable at " + path);
                }
                Group group = (Group) resource.adaptTo(AuthorizableWrapper.class).getAuthorizable();
                group.addMember(auth);
                changes.add(Modification.onModified(group.getPath()));
```

### RuleId[ruleID=DataFlowIssue]
Argument `request.getResource().adaptTo(PublishableResource.class)` might be null
in `core/src/main/java/org/apache/sling/cms/core/publication/UnpublishPostOperation.java`
#### Snippet
```java
            response.setPath(request.getResource().getPath());
            publicationManagerFactory.getPublicationManager()
                    .unpublish(request.getResource().adaptTo(PublishableResource.class));

            if (processors != null) {
```

### RuleId[ruleID=DataFlowIssue]
Argument `request.getResource().adaptTo(PublishableResource.class)` might be null
in `core/src/main/java/org/apache/sling/cms/core/publication/PublishPostOperation.java`
#### Snippet
```java
            response.setPath(request.getResource().getPath());
            publicationManagerFactory.getPublicationManager()
                    .publish(request.getResource().adaptTo(PublishableResource.class));

            if (processors != null) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `adaptTo` may produce `NullPointerException`
in `core/src/main/java/org/apache/sling/cms/core/publication/BulkPublicationJob.java`
#### Snippet
```java
                        .map(rt -> rt.getResource().adaptTo(PublishableResource.class));
            } else {
                toPublish = Collections.singletonList(resource.adaptTo(PublishableResource.class)).stream();
            }
            toPublish.forEach(pr -> {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getPath` may produce `NullPointerException`
in `core/src/main/java/org/apache/sling/cms/core/usergenerated/impl/ApproveUGCOperation.java`
#### Snippet
```java
            log.debug("Approving UGC {}", path);

            response.setParentLocation(request.getResource().getParent().getPath());

            final List<Modification> changes = new ArrayList<>();
```

### RuleId[ruleID=DataFlowIssue]
Argument `targetPath` might be null
in `core/src/main/java/org/apache/sling/cms/core/usergenerated/impl/ApproveUGCOperation.java`
#### Snippet
```java
                    .valueOf(request.getResource().getValueMap().get("approveaction", String.class));
            if (action == APPROVE_ACTION.MOVE) {
                ResourceUtil.getOrCreateResource(request.getResourceResolver(), targetPath,
                        Collections.singletonMap(JcrConstants.JCR_PRIMARYTYPE, JcrResourceConstants.NT_SLING_FOLDER),
                        JcrResourceConstants.NT_SLING_FOLDER, false);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `put` may produce `NullPointerException`
in `core/src/main/java/org/apache/sling/cms/core/usergenerated/impl/ApproveUGCOperation.java`
#### Snippet
```java
            } else {
                ModifiableValueMap mvm = request.getResource().adaptTo(ModifiableValueMap.class);
                mvm.put("published", true);
                changes.add(Modification.onModified(request.getResource().getPath()));
            }
```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### RuleId[ruleID=SimplifyStreamApiCallChains]
'Collections.singletonList().stream()' can be replaced with 'Stream.of()'
in `core/src/main/java/org/apache/sling/cms/core/publication/BulkPublicationJob.java`
#### Snippet
```java
                        .map(rt -> rt.getResource().adaptTo(PublishableResource.class));
            } else {
                toPublish = Collections.singletonList(resource.adaptTo(PublishableResource.class)).stream();
            }
            toPublish.forEach(pr -> {
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'String.join'
in `core/src/main/java/org/apache/sling/cms/core/publication/ForwardAgentEndpointSynchronization.java`
#### Snippet
```java
        }).collect(Collectors.toList()).toArray(new String[0]);
        if (log.isDebugEnabled()) {
            log.debug("Updating with endpoints: [{}]", Arrays.stream(endpoints).collect(Collectors.joining(",")));
        }
        try {
```

## RuleId[ruleID=OptionalContainsCollection]
### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `ModifiableValueMap`
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/TouchLastModifiedPostOperation.java`
#### Snippet
```java
        
        resources.forEach(r -> {
            Optional<ModifiableValueMap> op = Optional.ofNullable(r.getChild(JcrConstants.JCR_CONTENT))
                    .map(c -> c.adaptTo(ModifiableValueMap.class));
            op.ifPresent(mvm -> {
```

## RuleId[ruleID=Convert2MethodRef]
### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/org/apache/sling/cms/core/internal/models/AuthorizableWrapperImpl.java`
#### Snippet
```java
    @Override
    public boolean isMember(String groupName) {
        Iterable<Group> iterable = () -> getMembership();
        return StreamSupport.stream(iterable.spliterator(), false).anyMatch(g -> {
            try {
```

## RuleId[ruleID=RegExpRedundantEscape]
### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\=` in RegExp
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/UserGeneratedContentAction.java`
#### Snippet
```java
            Arrays.stream(properties.get("additionalProperties", new String[0])).map(v -> {
                if (v.contains("=")) {
                    String[] vs = v.split("\\=");
                    return new ImmutablePair<String, String>(vs[0], vs[1]);
                } else {
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\/` in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ReferenceOperation.java`
#### Snippet
```java
        String path = resource.getPath();
        if (CMSConstants.NT_PAGE.equals(resource.getResourceType())) {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\.html|\\'|\\\"|\\/))");
        } else {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\'|\\\"|\\/))");
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\'` in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ReferenceOperation.java`
#### Snippet
```java
        String path = resource.getPath();
        if (CMSConstants.NT_PAGE.equals(resource.getResourceType())) {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\.html|\\'|\\\"|\\/))");
        } else {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\'|\\\"|\\/))");
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\\"` in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ReferenceOperation.java`
#### Snippet
```java
        String path = resource.getPath();
        if (CMSConstants.NT_PAGE.equals(resource.getResourceType())) {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\.html|\\'|\\\"|\\/))");
        } else {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\'|\\\"|\\/))");
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\'` in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ReferenceOperation.java`
#### Snippet
```java
        String path = resource.getPath();
        if (CMSConstants.NT_PAGE.equals(resource.getResourceType())) {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\.html|\\'|\\\"|\\/))");
        } else {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\'|\\\"|\\/))");
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\\"` in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ReferenceOperation.java`
#### Snippet
```java
        String path = resource.getPath();
        if (CMSConstants.NT_PAGE.equals(resource.getResourceType())) {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\.html|\\'|\\\"|\\/))");
        } else {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\'|\\\"|\\/))");
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\/` in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ReferenceOperation.java`
#### Snippet
```java
        String path = resource.getPath();
        if (CMSConstants.NT_PAGE.equals(resource.getResourceType())) {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\.html|\\'|\\\"|\\/))");
        } else {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\'|\\\"|\\/))");
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\/` in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ReferenceOperation.java`
#### Snippet
```java
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\.html|\\'|\\\"|\\/))");
        } else {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\'|\\\"|\\/))");
        }
        this.resource = resource;
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\'` in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ReferenceOperation.java`
#### Snippet
```java
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\.html|\\'|\\\"|\\/))");
        } else {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\'|\\\"|\\/))");
        }
        this.resource = resource;
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\\"` in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ReferenceOperation.java`
#### Snippet
```java
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\.html|\\'|\\\"|\\/))");
        } else {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\'|\\\"|\\/))");
        }
        this.resource = resource;
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\'` in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ReferenceOperation.java`
#### Snippet
```java
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\.html|\\'|\\\"|\\/))");
        } else {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\'|\\\"|\\/))");
        }
        this.resource = resource;
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\\"` in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ReferenceOperation.java`
#### Snippet
```java
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\.html|\\'|\\\"|\\/))");
        } else {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\'|\\\"|\\/))");
        }
        this.resource = resource;
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\/` in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ReferenceOperation.java`
#### Snippet
```java
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\.html|\\'|\\\"|\\/))");
        } else {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\'|\\\"|\\/))");
        }
        this.resource = resource;
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\/` in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/CreateGroupOperation.java`
#### Snippet
```java
            }
            String intermediatePath = StringUtils.substringBeforeLast(request.getResource().getPath(), "/")
                    .replaceAll("\\/home\\/groups\\/?", "");
            Group group = userManager.createGroup(name, new SimplePrincipal(name), intermediatePath);

```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\/` in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/CreateGroupOperation.java`
#### Snippet
```java
            }
            String intermediatePath = StringUtils.substringBeforeLast(request.getResource().getPath(), "/")
                    .replaceAll("\\/home\\/groups\\/?", "");
            Group group = userManager.createGroup(name, new SimplePrincipal(name), intermediatePath);

```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\/` in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/CreateGroupOperation.java`
#### Snippet
```java
            }
            String intermediatePath = StringUtils.substringBeforeLast(request.getResource().getPath(), "/")
                    .replaceAll("\\/home\\/groups\\/?", "");
            Group group = userManager.createGroup(name, new SimplePrincipal(name), intermediatePath);

```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\=` in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/servlets/PathSuggestionServlet.java`
#### Snippet
```java
        typeFilters.clear();
        for (String filter : config.typeFilters()) {
            String[] parts = filter.split("\\=");
            String key = parts[0];
            String[] types = parts[1].split("\\,");
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\,` in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/servlets/PathSuggestionServlet.java`
#### Snippet
```java
            String[] parts = filter.split("\\=");
            String key = parts[0];
            String[] types = parts[1].split("\\,");
            typeFilters.put(key, types);
        }
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\/` in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/CreateUserOperation.java`
#### Snippet
```java
            }
            String intermediatePath = StringUtils.substringBeforeLast(request.getResource().getPath(), "/")
                    .replaceAll("\\/home\\/users\\/?", "");

            User user = userManager.createUser(name, password, new SimplePrincipal(name), intermediatePath);
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\/` in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/CreateUserOperation.java`
#### Snippet
```java
            }
            String intermediatePath = StringUtils.substringBeforeLast(request.getResource().getPath(), "/")
                    .replaceAll("\\/home\\/users\\/?", "");

            User user = userManager.createUser(name, password, new SimplePrincipal(name), intermediatePath);
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\/` in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/CreateUserOperation.java`
#### Snippet
```java
            }
            String intermediatePath = StringUtils.substringBeforeLast(request.getResource().getPath(), "/")
                    .replaceAll("\\/home\\/users\\/?", "");

            User user = userManager.createUser(name, password, new SimplePrincipal(name), intermediatePath);
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\,` in RegExp
in `core/src/main/java/org/apache/sling/cms/core/publication/ForwardAgentEndpointSynchronization.java`
#### Snippet
```java

        String[] endpoints = instances.stream().map(id -> {
            String endpointBase = id.getProperty(InstanceDescription.PROPERTY_ENDPOINTS).split("\\,")[0];
            return endpointBase + id.getProperty(PublicationPropertyProvider.ENDPOINT_PATHS);
        }).collect(Collectors.toList()).toArray(new String[0]);
```

## RuleId[ruleID=ComparatorCombinators]
### RuleId[ruleID=ComparatorCombinators]
Can be replaced with 'Comparator.comparing'
in `core/src/main/java/org/apache/sling/cms/core/models/LocaleList.java`
#### Snippet
```java
    public List<Locale> getLocales() {
        List<Locale> locales = Arrays.asList(DateFormat.getAvailableLocales());
        Collections.sort(locales, (o1,o2) ->  o1.toString().compareTo(o2.toString()));
        return locales;
    }
```

### RuleId[ruleID=ComparatorCombinators]
Can be replaced with 'Comparator.comparing'
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/InsightFactoryImpl.java`
#### Snippet
```java
        List<Insight> insights = providers.stream().filter(ip -> ip.isEnabled(request))
                .map(ip -> ip.evaluateRequest(request)).collect(Collectors.toList());
        Collections.sort(insights, (o1, o2) -> o1.getProvider().getTitle().compareTo(o2.getProvider().getTitle()));
        return insights;
    }
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `properties.keySet()` may be replaced with 'Map.forEach()' iteration
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ReferenceOperation.java`
#### Snippet
```java
        log.debug("Checking for references in resource {}", resource);
        ValueMap properties = resource.getValueMap();
        properties.keySet().forEach(k -> {
            if (properties.get(k) instanceof String) {
                if (matches(properties.get(k, String.class))) {
```

## RuleId[ruleID=RedundantCollectionOperation]
### RuleId[ruleID=RedundantCollectionOperation]
`contains` can be replaced with 'Map.containsKey()'
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/CreateUserAction.java`
#### Snippet
```java
        if (toset.length > 0) {
            Map<String, Object> properties = new HashMap<>();
            Arrays.stream(toset).filter(k -> formData.keySet().contains(k))
                    .forEach(k -> properties.put(k, formData.get(k)));
            properties.put(JcrConstants.JCR_PRIMARYTYPE, JcrConstants.NT_UNSTRUCTURED);
```

## RuleId[ruleID=UnnecessaryToStringCall]
### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/SendEmailAction.java`
#### Snippet
```java
        } catch (final MessagingException e) {
            log.error("Failed to send message", e);
            return FormActionResult.failure("Failed to send message: " + e.toString());
        }
    }
```

## RuleId[ruleID=FinalStaticMethod]
### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/FormActionResult.java`
#### Snippet
```java
public class FormActionResult {

    public static final FormActionResult failure(String message) {
        return new FormActionResult(false, message);
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/FormActionResult.java`
#### Snippet
```java
    }

    public static final FormActionResult success(String message) {
        return new FormActionResult(true, message);
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/FormUtils.java`
#### Snippet
```java
    }

    public static final boolean handles(String[] supportedTypes, Resource resource) {
        return Stream.of(supportedTypes).anyMatch(t -> t.equals(resource.getResourceType()));
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `api/src/main/java/org/apache/sling/cms/CMSUtils.java`
#### Snippet
```java
     */
    @Nullable
    public static final Resource findParentResourceofType(Resource resource, String type) {
        if (resource != null) {
            if (type.equals(resource.getValueMap().get(JcrConstants.JCR_PRIMARYTYPE, String.class))) {
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `api/src/main/java/org/apache/sling/cms/CMSUtils.java`
#### Snippet
```java
     */
    @NotNull
    public static final <T> List<T> adaptResources(Resource[] resources, Class<T> type) {
        return adaptResources(Arrays.asList(resources), type);
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `api/src/main/java/org/apache/sling/cms/CMSUtils.java`
#### Snippet
```java
     * @return whether or not the resource is published
     */
    public static final boolean isPublished(Resource resource) {
        boolean published = true;
        Resource publishable = findPublishableParent(resource);
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `api/src/main/java/org/apache/sling/cms/CMSUtils.java`
#### Snippet
```java
     */
    @Nullable
    public static final Resource findPublishableParent(Resource resource) {
        if (resource != null) {
            String type = resource.getValueMap().get(JcrConstants.JCR_PRIMARYTYPE, String.class);
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `api/src/main/java/org/apache/sling/cms/CMSUtils.java`
#### Snippet
```java
     */
    @NotNull
    public static final <T> List<T> adaptResources(Collection<Resource> resources, Class<T> type) {
        List<T> values = new ArrayList<>();
        if (resources != null) {
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `core/src/main/java/org/apache/sling/cms/core/internal/CommonUtils.java`
#### Snippet
```java
    }

    public static final UserManager getUserManager(@NotNull ResourceResolver resolver) throws RepositoryException {
        return Optional.ofNullable(resolver.adaptTo(Session.class)).map(session -> {
            UserManager userManager = null;
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `core/src/main/java/org/apache/sling/cms/core/internal/CommonUtils.java`
#### Snippet
```java
    }

    public static final String escapeLogMessage(String message){
        return StringEscapeUtils.escapeHtml4(message.replaceAll("[\\n\\r]"," "));
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `core/src/main/java/org/apache/sling/cms/core/internal/models/PageImpl.java`
#### Snippet
```java
public class PageImpl extends PublishableResourceImpl implements Page {

    public static final Page getContainingPage(Resource resource) {
        Resource pageRsrc = CMSUtils.findParentResourceofType(resource, CMSConstants.NT_PAGE);
        Page page = null;
```

## RuleId[ruleID=ManualMinMaxCalculation]
### RuleId[ruleID=ManualMinMaxCalculation]
Can be replaced with 'Math.min()' call
in `reference/src/main/java/org/apache/sling/cms/reference/models/ItemList.java`
#### Snippet
```java

        int l = Integer.parseInt(limit, 10);
        if (page * l >= count) {
            start = count;
        } else {
```

### RuleId[ruleID=ManualMinMaxCalculation]
Can be replaced with 'Math.min()' call
in `reference/src/main/java/org/apache/sling/cms/reference/models/ItemList.java`
#### Snippet
```java
        log.debug("Using start {}", start);

        if ((page * l) + l >= count) {
            end = count;
        } else {
```

### RuleId[ruleID=ManualMinMaxCalculation]
Can be replaced with 'Math.min()' call
in `reference/src/main/java/org/apache/sling/cms/reference/models/Search.java`
#### Snippet
```java
        }

        if (page * limit >= count) {
            start = count;
        } else {
```

### RuleId[ruleID=ManualMinMaxCalculation]
Can be replaced with 'Math.min()' call
in `reference/src/main/java/org/apache/sling/cms/reference/models/Search.java`
#### Snippet
```java
        log.debug("Using start {}", start);

        if ((page * limit) + limit >= count) {
            end = count;
        } else {
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/providers/RequestParametersValueProvider.java`
#### Snippet
```java

    @Override
    public void loadValues(SlingHttpServletRequest request, Resource providerResource, Map<String, Object> formData) {
        log.trace("loadFormData");
        String[] parameters = providerResource.getValueMap().get("allowedParameters", String[].class);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FormValueProvider`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/FormRequestImpl.java`
#### Snippet
```java
    }

    private void loadProviders(List<FormValueProvider> formValueProvider) {
        List<Resource> providers = ResourceTree.stream(getFormResource().getChild("providers"))
                .map(ResourceTree::getResource).collect(Collectors.toList());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FieldHandler`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/FormRequestImpl.java`
#### Snippet
```java
    public FormRequestImpl(@Self SlingHttpServletRequest request,
            @OSGiService(injectionStrategy = InjectionStrategy.OPTIONAL) List<FormValueProvider> formValueProvider,
            @OSGiService(injectionStrategy = InjectionStrategy.OPTIONAL) List<FieldHandler> fieldHandlers) {
        this.request = request;
        this.fieldHandlers = fieldHandlers;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/fields/TextareaHandler.java`
#### Snippet
```java

    @Override
    public void handleField(SlingHttpServletRequest request, Resource fieldResource, Map<String, Object> formData)
            throws FormException {
        log.trace("handleField");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/fields/SelectionHandler.java`
#### Snippet
```java

    @Override
    public void handleField(SlingHttpServletRequest request, Resource fieldResource, Map<String, Object> formData)
            throws FormException {
        log.trace("handleField");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/providers/UserProfileFormValueProvider.java`
#### Snippet
```java
    }

    private void loadKey(Map<String, Object> formData, String subpath, String key, User user) {
        Object value = null;

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FormAction`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/FormHandler.java`
#### Snippet
```java

    @Activate
    public FormHandler(@Reference(policyOption = ReferencePolicyOption.GREEDY) List<FormAction> formActions) {
        this.formActions = formActions;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/fields/TextfieldHandler.java`
#### Snippet
```java

    @Override
    public void handleField(SlingHttpServletRequest request, Resource fieldResource, Map<String, Object> formData)
            throws FormException {
        log.trace("handleField");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Resource`
in `api/src/main/java/org/apache/sling/cms/CMSUtils.java`
#### Snippet
```java
     */
    @NotNull
    public static final <T> List<T> adaptResources(Collection<Resource> resources, Class<T> type) {
        List<T> values = new ArrayList<>();
        if (resources != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `api/src/main/java/org/apache/sling/cms/CMSUtils.java`
#### Snippet
```java
     */
    @NotNull
    public static final <T> List<T> adaptResources(Collection<Resource> resources, Class<T> type) {
        List<T> values = new ArrayList<>();
        if (resources != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Map`
in `core/src/main/java/org/apache/sling/cms/core/models/QueryDebugger.java`
#### Snippet
```java
    }

    private void collectMbeanData(String attributeName, List<Map<String, Object>> target)
            throws MalformedObjectNameException, NullPointerException, InstanceNotFoundException,
            AttributeNotFoundException, ReflectionException, MBeanException {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super File`
in `core/src/main/java/org/apache/sling/cms/core/internal/jobs/FileMetadataExtractorJob.java`
#### Snippet
```java
    private ResourceResolverFactory factory;

    private void collectFiles(Resource root, List<File> files) {
        for (Resource child : root.getChildren()) {
            if (CMSConstants.NT_FILE.equals(child.getResourceType())) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super File`
in `core/src/main/java/org/apache/sling/cms/core/internal/jobs/OptimizeFilesJob.java`
#### Snippet
```java
    private ResourceResolverFactory factory;

    private void collectFiles(Resource root, List<File> files) {
        for (Resource child : root.getChildren()) {
            if (CMSConstants.NT_FILE.equals(child.getResourceType())) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `core/src/main/java/org/apache/sling/cms/core/internal/FileMetadataExtractorImpl.java`
#### Snippet
```java
    }

    private void putMetadata(Map<String, Object> properties, String name, Metadata metadata) {
        log.trace("Updating property: {}", name);
        String filtered = Text.escapeIllegalJcrChars(name);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Modification`
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/CheckpointOperation.java`
#### Snippet
```java
	}

	protected void doRun(SlingHttpServletRequest request, PostResponse response, List<Modification> changes)
			throws PersistenceException {
		try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Modification`
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/UpdateReferencesPostOperation.java`
#### Snippet
```java
    }

    private void updateReferences(SlingHttpServletRequest request, final List<Modification> changes) {
        final String find = request.getResource().getPath();
        final String destination = request.getParameter(SlingPostConstants.RP_DEST);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DistributionResponse`
in `core/src/main/java/org/apache/sling/cms/core/publication/ContentDistributionPublicationManager.java`
#### Snippet
```java
    }

    private String collectFailures(List<DistributionResponse> failedResponses) {
        return failedResponses.stream().map(r -> r.getState() + ": " + r.getMessage())
                .collect(Collectors.joining(",", "[", "]"));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends InstanceDescription`
in `core/src/main/java/org/apache/sling/cms/core/publication/ForwardAgentEndpointSynchronization.java`
#### Snippet
```java
    }

    private void updateInstances(Set<InstanceDescription> instances) {
        log.trace("updateInstances");

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Modification`
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/BulkReplaceOperation.java`
#### Snippet
```java

    private void updateProperties(Resource resource, Pattern updateProperties, Pattern rfind, String find,
            String replace, PostResponse response, List<Modification> changes) {
        ModifiableValueMap properties = resource.adaptTo(ModifiableValueMap.class);
        boolean updated = false;
```

## RuleId[ruleID=NullableProblems]
### RuleId[ruleID=NullableProblems]
Overridden methods are not annotated
in `api/src/main/java/org/apache/sling/cms/NameFilter.java`
#### Snippet
```java
     * @return the Sling-compatible name
     */
    @NotNull String filter(@NotNull String name);
}

```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `api/src/main/java/org/apache/sling/cms/NameFilter.java`
#### Snippet
```java
     * @return the Sling-compatible name
     */
    @NotNull String filter(@NotNull String name);
}

```

### RuleId[ruleID=NullableProblems]
Overridden methods are not annotated
in `api/src/main/java/org/apache/sling/cms/AuthorizableWrapper.java`
#### Snippet
```java
     * @return the transitive members of this authorizable
     */
    @NotNull
    Iterator<Authorizable> getMembers();

```

### RuleId[ruleID=NullableProblems]
Overridden methods are not annotated
in `api/src/main/java/org/apache/sling/cms/AuthorizableWrapper.java`
#### Snippet
```java
     * @return the transitive membership
     */
    @NotNull
    Iterator<Group> getMembership();

```

### RuleId[ruleID=NullableProblems]
Overridden methods are not annotated
in `api/src/main/java/org/apache/sling/cms/AuthorizableWrapper.java`
#### Snippet
```java
     * @return the current user's ID
     */
    @NotNull
    public String getId();

```

### RuleId[ruleID=NullableProblems]
Overridden methods are not annotated
in `api/src/main/java/org/apache/sling/cms/AuthorizableWrapper.java`
#### Snippet
```java
     * @return the groups the user belongs to
     */
    @NotNull
    Iterator<String> getGroupNames();

```

### RuleId[ruleID=NullableProblems]
Overridden methods are not annotated
in `api/src/main/java/org/apache/sling/cms/AuthorizableWrapper.java`
#### Snippet
```java
     * @return the declared members of this authorizable
     */
    @NotNull
    Iterator<Authorizable> getDeclaredMembers();

```

### RuleId[ruleID=NullableProblems]
Overridden methods are not annotated
in `api/src/main/java/org/apache/sling/cms/AuthorizableWrapper.java`
#### Snippet
```java
     * @return the direct membership
     */
    @NotNull
    Iterator<Group> getDeclaredMembership();

```

### RuleId[ruleID=NullableProblems]
Overridden methods are not annotated
in `api/src/main/java/org/apache/sling/cms/AuthorizableWrapper.java`
#### Snippet
```java
     * @return a JackRabbit Authorizable
     */
    @NotNull
    Authorizable getAuthorizable();

```

### RuleId[ruleID=NullableProblems]
Overridden methods are not annotated
in `api/src/main/java/org/apache/sling/cms/PageTemplateManager.java`
#### Snippet
```java
     * @return the list of available templates
     */
    @NotNull
    List<PageTemplate> getAvailableTemplates();
}
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `api/src/main/java/org/apache/sling/cms/publication/PublicationManager.java`
#### Snippet
```java
     * @throws PublicationException an exception occurs publishing the resource
     */
    void publish(@NotNull PublishableResource resource) throws PublicationException;

    /**
```

### RuleId[ruleID=NullableProblems]
Overridden methods are not annotated
in `api/src/main/java/org/apache/sling/cms/publication/PublicationManager.java`
#### Snippet
```java
     * @return the publication mode
     */
    @NotNull
    PUBLICATION_MODE getPublicationMode();

```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `api/src/main/java/org/apache/sling/cms/publication/PublicationManager.java`
#### Snippet
```java
     * @throws PublicationException an exception occurs publishing the resource
     */
    void unpublish(@NotNull PublishableResource resource) throws PublicationException;

    /**
```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'configRsrc'
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ComponentConfigurationImpl.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(ComponentConfigurationImpl.class);

    private Optional<Resource> configRsrc;

    public ComponentConfigurationImpl(Resource resource) {
```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `feature/src/main/java/org/apache/sling/cms/feature/Main.java`
#### Snippet
```java
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Bootstrapping Sling CMS Feature Model");

        URL farUrl = Main.class.getClassLoader().getResource("lib/slingcms.far");
```

## RuleId[ruleID=SimplifyOptionalCallChains]
### RuleId[ruleID=SimplifyOptionalCallChains]
Null check can be eliminated with 'ifPresent'
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ComponentPolicyImpl.java`
#### Snippet
```java
    public Map<String, Resource> getComponentConfigs() {
        Map<String, Resource> configs = new HashMap<>();
        Resource container = getPolicyResource().map(pr -> pr.getChild("componentConfigurations")).orElse(null);
        if (container != null) {
            container.getChildren().forEach(c -> configs.put(c.getValueMap().get("type", String.class), c));
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `reference/src/main/java/org/apache/sling/cms/reference/models/ItemList.java`
#### Snippet
```java

        if (request.getRequestPathInfo().getSuffix() != null) {
            query = query.replace("{SUFFIX}", request.getRequestPathInfo().getSuffix());
        }
        log.debug("Listing results of: {}", query);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `reference/src/main/java/org/apache/sling/cms/reference/models/ItemList.java`
#### Snippet
```java
        log.debug("Found {} results", count);

        if (StringUtils.isNotBlank(request.getParameter("page")) && request.getParameter("page").matches("\\d+")) {
            page = Integer.parseInt(request.getParameter("page"), 10) - 1;
            log.debug("Using page {}", page);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `reference/src/main/java/org/apache/sling/cms/reference/models/Search.java`
#### Snippet
```java

        Set<String> distinct = new HashSet<>();
        String term = Text.escapeIllegalXpathSearchChars(request.getParameter(TERM_PARAMETER)).replace("'", "''");
        List<Resource> queryResults = new ArrayList<>();

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `reference/src/main/java/org/apache/sling/cms/reference/models/Search.java`
#### Snippet
```java
        log.debug("Found {} results", count);

        if (StringUtils.isNotBlank(request.getParameter("page")) && request.getParameter("page").matches("\\d+")) {
            page = Integer.parseInt(request.getParameter("page"), 10) - 1;
            log.debug("Using page {}", page);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/org/apache/sling/cms/core/models/LocaleResource.java`
#### Snippet
```java
    public LocaleResource(Resource resource) {
        this.locale = Locale
                .forLanguageTag(resource.getValueMap().get(JcrConstants.JCR_LANGUAGE, "").replace("_", "-"));
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/org/apache/sling/cms/core/models/SearchResults.java`
#### Snippet
```java
        }

        term = Text.escapeIllegalXpathSearchChars(request.getParameter("term")).replace("'", "''");
        this.request = request;
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/org/apache/sling/cms/core/models/StartContent.java`
#### Snippet
```java
                        .createQuery(
                                "SELECT * FROM [nt:hierarchyNode] AS s WHERE ISDESCENDANTNODE([/content]) AND CONTAINS(s.*,'"
                                        + term.replace("'", "''") + "')",
                                Query.JCR_SQL2);
                query.setLimit(10);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/org/apache/sling/cms/core/internal/CommonUtils.java`
#### Snippet
```java

    public static final String escapeLogMessage(String message){
        return StringEscapeUtils.escapeHtml4(message.replaceAll("[\\n\\r]"," "));
    }
}
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/CreateGroupOperation.java`
#### Snippet
```java
            }
            String intermediatePath = StringUtils.substringBeforeLast(request.getResource().getPath(), "/")
                    .replaceAll("\\/home\\/groups\\/?", "");
            Group group = userManager.createGroup(name, new SimplePrincipal(name), intermediatePath);

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/CreateUserOperation.java`
#### Snippet
```java
            }
            String intermediatePath = StringUtils.substringBeforeLast(request.getResource().getPath(), "/")
                    .replaceAll("\\/home\\/users\\/?", "");

            User user = userManager.createUser(name, password, new SimplePrincipal(name), intermediatePath);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/org/apache/sling/cms/core/internal/filters/EditIncludeFilter.java`
#### Snippet
```java
            log.info("Loaded template: {}", en);
            try (InputStream is = bundle.getEntry(en).openStream()) {
                templates.put(en.replace(ENTRY_BASE, ""),
                        StringUtils.substringAfter(IOUtils.toString(is, StandardCharsets.UTF_8), "-->"));
            }
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `reference/src/main/java/org/apache/sling/cms/reference/forms/package-info.java`
#### Snippet
```java
 * @version 0.14.0
 */
@org.osgi.annotation.versioning.Version("0.14.0")
package org.apache.sling.cms.reference.forms;

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `reference/src/main/java/org/apache/sling/cms/reference/package-info.java`
#### Snippet
```java
 * Sling CMS Reference
 */
@org.osgi.annotation.versioning.Version("1.0.0")
package org.apache.sling.cms.reference;

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `reference/src/main/java/org/apache/sling/cms/reference/models/package-info.java`
#### Snippet
```java
 * @version 0.9.0
 */
@org.osgi.annotation.versioning.Version("0.10.0")
package org.apache.sling.cms.reference.models;

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/apache/sling/cms/package-info.java`
#### Snippet
```java
 * @since 0.10.0
 */
@org.osgi.annotation.versioning.Version("2.1.0")
package org.apache.sling.cms;

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/apache/sling/cms/i18n/package-info.java`
#### Snippet
```java
 * @since 0.10.0
 */
@org.osgi.annotation.versioning.Version("1.0.0")
package org.apache.sling.cms.i18n;

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/apache/sling/cms/insights/package-info.java`
#### Snippet
```java
 * @version 0.10.2
 */
@org.osgi.annotation.versioning.Version("1.0.0")
package org.apache.sling.cms.insights;

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.sling.cms.i18n` is unnecessary and can be removed
in `api/src/main/java/org/apache/sling/cms/i18n/I18NDictionary.java`
#### Snippet
```java
 * Simplified interface for interacting with Sling's i18n dictionary.
 * 
 * @see org.apache.sling.cms.i18n.I18NProvider
 */
public interface I18NDictionary {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/apache/sling/cms/publication/package-info.java`
#### Snippet
```java
 * @since 0.16.2
 */
@org.osgi.annotation.versioning.Version("1.0.0")
package org.apache.sling.cms.publication;

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/apache/sling/cms/usergenerated/package-info.java`
#### Snippet
```java
 * @version 0.9.0
 */
@org.osgi.annotation.versioning.Version("0.9.2")
package org.apache.sling.cms.usergenerated;

```

## RuleId[ruleID=RegExpSingleCharAlternation]
### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ReferenceOperation.java`
#### Snippet
```java
        String path = resource.getPath();
        if (CMSConstants.NT_PAGE.equals(resource.getResourceType())) {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\.html|\\'|\\\"|\\/))");
        } else {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\'|\\\"|\\/))");
```

### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ReferenceOperation.java`
#### Snippet
```java
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\.html|\\'|\\\"|\\/))");
        } else {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\'|\\\"|\\/))");
        }
        this.resource = resource;
```

### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ReferenceOperation.java`
#### Snippet
```java
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\.html|\\'|\\\"|\\/))");
        } else {
            regex = Pattern.compile("(^\\Q" + path + "\\E($|\\/)|(\\'|\\\")\\Q" + path + "\\E(\\'|\\\"|\\/))");
        }
        this.resource = resource;
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `policies` are queried, but never updated
in `core/src/main/java/org/apache/sling/cms/core/internal/models/PageTemplateImpl.java`
#### Snippet
```java
    @Inject
    @Optional
    private List<Resource> policies;

    private Resource resource;
```

### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `options` are updated, but never queried
in `core/src/main/java/org/apache/sling/cms/core/internal/servlets/PreviewFileServlet.java`
#### Snippet
```java
        String suffix = request.getRequestPathInfo().getSuffix();

        RequestDispatcherOptions options = new RequestDispatcherOptions();
        options.setReplaceSuffix("");
        options.setReplaceSelectors("");
```

### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `securityConfigInstances` are queried, but never updated
in `core/src/main/java/org/apache/sling/cms/core/internal/filters/CMSSecurityFilter.java`
#### Snippet
```java

    @Reference(cardinality = ReferenceCardinality.MULTIPLE, policyOption = ReferencePolicyOption.GREEDY)
    private List<CMSSecurityConfigInstance> securityConfigInstances;

    @Reference
```

### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `modificationSourcesContainingPostfix` are updated, but never queried
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/CheckpointOperation.java`
#### Snippet
```java

			// check modifications for remaining postfix and store the base path
			final Map<String, String> modificationSourcesContainingPostfix = new HashMap<>();
			final Set<String> allModificationSources = new HashSet<>(changes.size());
			for (final Modification modification : changes) {
```

### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `allModificationSources` are updated, but never queried
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/CheckpointOperation.java`
#### Snippet
```java
			// check modifications for remaining postfix and store the base path
			final Map<String, String> modificationSourcesContainingPostfix = new HashMap<>();
			final Set<String> allModificationSources = new HashSet<>(changes.size());
			for (final Modification modification : changes) {
				final String source = modification.getSource();
```

### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `services` are queried, but never updated
in `core/src/main/java/org/apache/sling/cms/core/readability/impl/ReadabilityServiceFactoryImpl.java`
#### Snippet
```java

    @Reference(policyOption = ReferencePolicyOption.GREEDY)
    private List<ReadabilityService> services;

    @Override
```

### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `modificationSourcesContainingPostfix` are updated, but never queried
in `core/src/main/java/org/apache/sling/cms/core/usergenerated/impl/ApproveUGCOperation.java`
#### Snippet
```java

            // check modifications for remaining postfix and store the base path
            final Map<String, String> modificationSourcesContainingPostfix = new HashMap<>();
            final Set<String> allModificationSources = new HashSet<>(changes.size());
            for (final Modification modification : changes) {
```

### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `allModificationSources` are updated, but never queried
in `core/src/main/java/org/apache/sling/cms/core/usergenerated/impl/ApproveUGCOperation.java`
#### Snippet
```java
            // check modifications for remaining postfix and store the base path
            final Map<String, String> modificationSourcesContainingPostfix = new HashMap<>();
            final Set<String> allModificationSources = new HashSet<>(changes.size());
            for (final Modification modification : changes) {
                final String source = modification.getSource();
```

### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `modificationSourcesContainingPostfix` are updated, but never queried
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/BulkReplaceOperation.java`
#### Snippet
```java

            // check modifications for remaining postfix and store the base path
            final Map<String, String> modificationSourcesContainingPostfix = new HashMap<>();
            final Set<String> allModificationSources = new HashSet<>(changes.size());
            for (final Modification modification : changes) {
```

### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `allModificationSources` are updated, but never queried
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/BulkReplaceOperation.java`
#### Snippet
```java
            // check modifications for remaining postfix and store the base path
            final Map<String, String> modificationSourcesContainingPostfix = new HashMap<>();
            final Set<String> allModificationSources = new HashSet<>(changes.size());
            for (final Modification modification : changes) {
                final String source = modification.getSource();
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `sortedProviders` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/sling/cms/core/i18n/impl/I18NProviderImpl.java`
#### Snippet
```java
    private RequestLocaleResolver requestLocaleResolver = defaultLocaleResolver;

    private ResourceBundleProvider[] sortedProviders = new ResourceBundleProvider[0];

    @Reference(cardinality = ReferenceCardinality.OPTIONAL, policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY)
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `api/src/main/java/org/apache/sling/cms/insights/Insight.java`
#### Snippet
```java
    private boolean scored = false;
    private List<Message> scoreDetails = new ArrayList<>();
    private boolean skip = false;

    private boolean succeeded = true;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `api/src/main/java/org/apache/sling/cms/insights/Insight.java`
#### Snippet
```java
    private InsightRequest request;
    private double score;
    private boolean scored = false;
    private List<Message> scoreDetails = new ArrayList<>();
    private boolean skip = false;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/sling/cms/core/models/SearchResults.java`
#### Snippet
```java
    private String type = CMSConstants.NT_PAGE;
    private String path = null;
    private String term = null;
    private SlingHttpServletRequest request;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/sling/cms/core/models/SearchResults.java`
#### Snippet
```java

    private String type = CMSConstants.NT_PAGE;
    private String path = null;
    private String term = null;
    private SlingHttpServletRequest request;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ComponentManagerImpl.java`
#### Snippet
```java
    private ResourceResolver resolver;

    private Map<String, List<Component>> componentCache = null;

    public ComponentManagerImpl(Resource resource) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ReferenceOperation.java`
#### Snippet
```java
    private Pattern regex = null;

    private Resource resource = null;

    protected ReferenceOperation(Resource resource) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ReferenceOperation.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(ReferenceOperation.class);

    private Pattern regex = null;

    private Resource resource = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/sling/cms/core/internal/rewriter/ReferenceMappingTransformer.java`
#### Snippet
```java
    private ReferenceMappingTransformerConfig config;

    private boolean enabled = false;

    private ConfigurationResourceResolver resolver;
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `query`
in `reference/src/main/java/org/apache/sling/cms/reference/models/ItemList.java`
#### Snippet
```java

        if (request.getRequestPathInfo().getSuffix() != null) {
            query = query.replace("{SUFFIX}", request.getRequestPathInfo().getSuffix());
        }
        log.debug("Listing results of: {}", query);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `qs`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/FormHandler.java`
#### Snippet
```java
    private String resolveUrl(SlingHttpServletRequest request, String url, String qs) {
        if (url.contains("?")) {
            qs = "&" + qs;
        } else {
            qs = "?" + qs;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `qs`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/FormHandler.java`
#### Snippet
```java
            qs = "&" + qs;
        } else {
            qs = "?" + qs;
        }
        if (url.startsWith("/")) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `url`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/FormHandler.java`
#### Snippet
```java
        if (url.startsWith("/")) {
            if (!url.contains(".html")) {
                url += ".html";
            }
            url += qs;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `url`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/FormHandler.java`
#### Snippet
```java
                url += ".html";
            }
            url += qs;
            return request.getResourceResolver().map(request, url);
        } else {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `component`
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ComponentImpl.java`
#### Snippet
```java
                String parentResourceType = component.getResourceResolver().getParentResourceType(component);
                if (StringUtils.isNotBlank(parentResourceType)) {
                    component = component.getResourceResolver().getResource(parentResourceType);
                    if (component != null) {
                        return getComponentEditPath(component);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `atts`
in `core/src/main/java/org/apache/sling/cms/core/internal/rewriter/ReferenceMappingTransformer.java`
#### Snippet
```java
    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        atts = mapReferences(atts);
        contentHandler.startElement(uri, localName, qName, atts);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `nodeName`
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/PropertyHintNodeNameGenerator.java`
#### Snippet
```java
        char lastAdded = 0;

        nodeName = nodeName.toLowerCase();
        for (int i = 0; i < nodeName.length(); i++) {
            final char c = nodeName.charAt(i);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `includeEnd`
in `core/src/main/java/org/apache/sling/cms/core/internal/filters/EditIncludeFilter.java`
#### Snippet
```java

        if (StringUtils.isNotEmpty(editPath)) {
            includeEnd = true;
            writeEditorMarkup(resource, writer, resourceBundle, shouldWriteDropTarget(request));
        } else if (component != null && !component.isEditable()) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `includeEnd`
in `core/src/main/java/org/apache/sling/cms/core/internal/filters/EditIncludeFilter.java`
#### Snippet
```java
            writeEditorMarkup(resource, writer, resourceBundle, shouldWriteDropTarget(request));
        } else if (component != null && !component.isEditable()) {
            includeEnd = true;
            String title = StringUtils.isNotEmpty(component.getTitle()) ? component.getTitle()
                    : StringUtils.substringAfterLast(resource.getResourceType(), "/");
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `word`
in `core/src/main/java/org/apache/sling/cms/core/readability/impl/ReadabilityServiceImpl.java`
#### Snippet
```java
        for (int index = 0; index < word.length() - 1; index++) {
            if (isVowel(word.charAt(index)) && isVowel(word.charAt(index + 1)) && index + 2 < word.length()) {
                word = word.substring(0, index + 1) + word.substring(index + 2);
            }
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `updated`
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/BulkReplaceOperation.java`
#### Snippet
```java
                log.trace("Value after replacement: {}", value);
                properties.put(entry.getKey(), value);
                updated = true;
            } else if (rfind != null) {
                Matcher m = rfind.matcher(value);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `updated`
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/BulkReplaceOperation.java`
#### Snippet
```java
                    log.trace("Value after replacement: {}", value);
                    properties.put(entry.getKey(), value);
                    updated = true;
                }
            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `updated`
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/BulkReplaceOperation.java`
#### Snippet
```java
                }
                properties.put(entry.getKey(), v);
                updated = true;
            }
        }
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `core/src/main/resources/res/editinclude/start.html`
#### Snippet
```java
 * specific language governing permissions and limitations
 */ --><div class="sling-cms-component" data-reload="${reload}" data-component="${componentPath}" data-sling-cms-title="${title}" data-sling-cms-resource-path="${resourcePath}" data-sling-cms-resource-type="${resourceType}" data-sling-cms-edit="${editPath}" data-sling-cms-resource-name="${resourceName}">
    <div class="sling-cms-editor" draggable="${draggable}">
        <div class="level has-background-light">
            <div class="level-left">
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/UserGeneratedContentAction.java`
#### Snippet
```java
                } else {
                    log.warn("Invalid value: {}", v);
                    return null;
                }
            }).filter(Objects::nonNull).forEach(v -> {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/providers/UserProfileFormValueProvider.java`
#### Snippet
```java
                    } catch (IllegalStateException | RepositoryException e) {
                        log.warn("Failed to get string value for " + key, e);
                        return null;
                    }
                }).collect(Collectors.toList()).toArray(new String[0]);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `api/src/main/java/org/apache/sling/cms/Reference.java`
#### Snippet
```java
            return pageMgr.getPage();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/ResetPasswordAction.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/models/StartContent.java`
#### Snippet
```java
                        log.warn("Failed to get iterator", e);
                    }
                    return null;
                };
                return StreamSupport.stream(iterable.spliterator(), false).limit(10);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/models/StartContent.java`
#### Snippet
```java
            } catch (RepositoryException e) {
                log.warn("Failed to get resource", e);
                return null;
            }
        }).filter(Objects::nonNull).collect(Collectors.toList());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeResponse.java`
#### Snippet
```java
    @Override
    public String encodeUrl(String url) {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeResponse.java`
#### Snippet
```java
    @Override
    public String encodeRedirectURL(String url) {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeResponse.java`
#### Snippet
```java
    @Override
    public String encodeRedirectUrl(String url) {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeResponse.java`
#### Snippet
```java
    @Override
    public String encodeURL(String url) {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeResponse.java`
#### Snippet
```java
    @Override
    public Locale getLocale() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/i18n/impl/I18NProviderImpl.java`
#### Snippet
```java
                }
            }
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/i18n/impl/I18NProviderImpl.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/models/QueryDebugger.java`
#### Snippet
```java
                                    } catch (RepositoryException e) {
                                        log.warn("Exception getting path from row: {}", n, e);
                                        return null;
                                    }
                                })
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
    @Override
    public String getPathInfo() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
            }
        } catch (ClassCastException e) {
            return null;
        }
        return (String) value;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
    @Override
    public String getRealPath(String path) {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
    @Override
    public ServletInputStream getInputStream() throws IOException {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
    @Override
    public String getLocalAddr() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
    @Override
    public String getRequestedSessionId() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
    @Override
    public String getRemoteHost() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
    @Override
    public String getRemoteUser() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
    @Override
    public Enumeration<?> getHeaders(String name) {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
    @Override
    public String getAuthType() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
    @Override
    public String getPathTranslated() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
    @Override
    public Enumeration<?> getHeaderNames() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
    @Override
    public String getHeader(String name) {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
    @Override
    public String getServerName() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
    @Override
    public String getContentType() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
    @Override
    public String getQueryString() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
    @Override
    public String getRemoteAddr() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
    @Override
    public String getLocalName() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
    @Override
    public Principal getUserPrincipal() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
    @Override
    public BufferedReader getReader() throws IOException {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
    @Override
    public RequestDispatcher getRequestDispatcher(String path) {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/internal/models/PageImpl.java`
#### Snippet
```java
            return templateResource.adaptTo(PageTemplate.class);
        } else {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/internal/models/EditableResourceImpl.java`
#### Snippet
```java
            return getComponent().getEditPath();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/internal/models/EditableResourceImpl.java`
#### Snippet
```java
            return getComponent().getEditResource();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/internal/models/EditableResourceImpl.java`
#### Snippet
```java
            return getComponentResource().adaptTo(Component.class);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ComponentImpl.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ComponentImpl.java`
#### Snippet
```java
    public String getEditPath() {
        Resource editResource = getEditResource();
        return editResource != null ? editResource.getPath() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/internal/models/PublishableResourceImpl.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/internal/models/SiteImpl.java`
#### Snippet
```java
            return findSiteResource(resource.getParent());
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/internal/models/AuthorizableWrapperImpl.java`
#### Snippet
```java
        } catch (RepositoryException e) {
            log.error("Failed to get ID from authorizable: {}", authorizable, e);
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/internal/models/AuthorizableWrapperImpl.java`
#### Snippet
```java
            } catch (RepositoryException e) {
                log.error("Failed to get name from group: {}", g, e);
                return null;
            }
        }).iterator();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/internal/servlets/CmsDefaultErrorHandlerServlet.java`
#### Snippet
```java
        @Override
        public Resource getSuffixResource() {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/internal/listeners/AutoVersioningListener.java`
#### Snippet
```java
            if (page != null && page.isPublished()) {
                Version latestVersion = Optional.ofNullable(pageResource.adaptTo(VersionInfo.class))
                        .map(VersionInfo::getVersions).map(vs -> !vs.isEmpty() ? vs.get(vs.size() - 1) : null)
                        .orElse(null);
                if (latestVersion != null) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/org/apache/sling/cms/core/publication/PublicationPropertyProvider.java`
#### Snippet
```java
            return publicationManagerFactory.getInstanceType().toString();
        }
        return null;
    }

```

## RuleId[ruleID=FuseStreamOperations]
### RuleId[ruleID=FuseStreamOperations]
Stream may be extended replacing 'toArray'
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/fields/SelectionHandler.java`
#### Snippet
```java
    private String[] stripBlank(String[] parameterValues) {
        return Optional.ofNullable(parameterValues).map(v -> {
            List<String> values = Arrays.stream(v).filter(StringUtils::isNotBlank).collect(Collectors.toList());
            return values.toArray(new String[values.size()]);
        }).orElse(new String[0]);
```

### RuleId[ruleID=FuseStreamOperations]
Stream may be extended replacing 'toArray'
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/providers/UserProfileFormValueProvider.java`
#### Snippet
```java
                        return null;
                    }
                }).collect(Collectors.toList()).toArray(new String[0]);
            } else if (v[0].getType() == PropertyType.LONG) {
                value = v[0].getLong();
```

### RuleId[ruleID=FuseStreamOperations]
Stream may be extended replacing 'toArray'
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/UpdateProfileAction.java`
#### Snippet
```java
                if (e.getValue() instanceof String[]) {
                    Value[] values = Arrays.stream(((String[]) e.getValue())).map(valueFactory::createValue)
                            .collect(Collectors.toList()).toArray(new Value[0]);
                    user.setProperty(subpath + "/" + e.getKey(), values);
                } else {
```

### RuleId[ruleID=FuseStreamOperations]
Stream may be extended replacing 'sort'
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/InsightFactoryImpl.java`
#### Snippet
```java
    private List<Insight> getInsights(InsightRequest request) {
        List<Insight> insights = providers.stream().filter(ip -> ip.isEnabled(request))
                .map(ip -> ip.evaluateRequest(request)).collect(Collectors.toList());
        Collections.sort(insights, (o1, o2) -> o1.getProvider().getTitle().compareTo(o2.getProvider().getTitle()));
        return insights;
```

### RuleId[ruleID=FuseStreamOperations]
Stream may be extended replacing 'toArray'
in `core/src/main/java/org/apache/sling/cms/core/publication/ForwardAgentEndpointSynchronization.java`
#### Snippet
```java
            String endpointBase = id.getProperty(InstanceDescription.PROPERTY_ENDPOINTS).split("\\,")[0];
            return endpointBase + id.getProperty(PublicationPropertyProvider.ENDPOINT_PATHS);
        }).collect(Collectors.toList()).toArray(new String[0]);
        if (log.isDebugEnabled()) {
            log.debug("Updating with endpoints: [{}]", Arrays.stream(endpoints).collect(Collectors.joining(",")));
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/UserGeneratedContentAction.java`
#### Snippet
```java
            Map<String, Object> contentProperties = new HashMap<>();
            contentProperties.put(JcrConstants.JCR_PRIMARYTYPE, JcrConstants.NT_UNSTRUCTURED);
            Arrays.stream(properties.get("additionalProperties", new String[0])).map(v -> {
                if (v.contains("=")) {
                    String[] vs = v.split("\\=");
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/fields/SelectionHandler.java`
#### Snippet
```java
            List<String> values = Arrays.stream(v).filter(StringUtils::isNotBlank).collect(Collectors.toList());
            return values.toArray(new String[values.size()]);
        }).orElse(new String[0]);
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/providers/UserProfileFormValueProvider.java`
#### Snippet
```java
                        return null;
                    }
                }).collect(Collectors.toList()).toArray(new String[0]);
            } else if (v[0].getType() == PropertyType.LONG) {
                value = v[0].getLong();
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/CreateUserAction.java`
#### Snippet
```java
                            intermediatePath);

                    String[] groups = properties.get(GROUPS, new String[0]);
                    for (String g : groups) {
                        String groupName = sub.replace(g);
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/CreateUserAction.java`
#### Snippet
```java
                    }
                    log.debug("Updating profile for {}", username);
                    updateProfile(adminResolver, user, properties.get(PROFILE_PROPERTIES, new String[0]),
                            request.getFormData());

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/UpdateProfileAction.java`
#### Snippet
```java
                if (e.getValue() instanceof String[]) {
                    Value[] values = Arrays.stream(((String[]) e.getValue())).map(valueFactory::createValue)
                            .collect(Collectors.toList()).toArray(new Value[0]);
                    user.setProperty(subpath + "/" + e.getKey(), values);
                } else {
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `core/src/main/java/org/apache/sling/cms/core/i18n/impl/I18NProviderImpl.java`
#### Snippet
```java
    private RequestLocaleResolver requestLocaleResolver = defaultLocaleResolver;

    private ResourceBundleProvider[] sortedProviders = new ResourceBundleProvider[0];

    @Reference(cardinality = ReferenceCardinality.OPTIONAL, policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY)
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/FakeRequest.java`
#### Snippet
```java
    @Override
    public Cookie[] getCookies() {
        return new Cookie[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `core/src/main/java/org/apache/sling/cms/core/internal/models/PageImpl.java`
#### Snippet
```java
            title = properties.get(CMSConstants.PN_TITLE, String.class);
        } else {
            this.taxonomy = new String[0];
            this.template = null;
            this.title = null;
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `core/src/main/java/org/apache/sling/cms/core/internal/models/PageTemplateImpl.java`
#### Snippet
```java
    public String[] getAllowedPaths() {
        if (allowedPaths == null) {
            return new String[0];
        }
        return allowedPaths;
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ComponentPolicyImpl.java`
#### Snippet
```java
    @Override
    public String[] getAvailableComponentTypes() {
        return getPolicyResource().map(pr -> pr.getValueMap().get("availableComponentTypes", new String[0]))
                .orElse(new String[0]);
    }
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ComponentPolicyImpl.java`
#### Snippet
```java
    public String[] getAvailableComponentTypes() {
        return getPolicyResource().map(pr -> pr.getValueMap().get("availableComponentTypes", new String[0]))
                .orElse(new String[0]);
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `core/src/main/java/org/apache/sling/cms/core/internal/servlets/CmsDefaultErrorHandlerServlet.java`
#### Snippet
```java
        @Override
        public String[] getSelectors() {
            return new String[0];
        }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/UpdateReferencesPostOperation.java`
#### Snippet
```java
                        log.trace("Updated value {}", value);
                    } else if (properties.get(matchingKey) instanceof String[]) {
                        String[] values = properties.get(matchingKey, new String[0]);
                        for (int i = 0; i < values.length; i++) {
                            values[i] = values[i].replace(find, destination);
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `core/src/main/java/org/apache/sling/cms/core/publication/ForwardAgentEndpointSynchronization.java`
#### Snippet
```java
            String endpointBase = id.getProperty(InstanceDescription.PROPERTY_ENDPOINTS).split("\\,")[0];
            return endpointBase + id.getProperty(PublicationPropertyProvider.ENDPOINT_PATHS);
        }).collect(Collectors.toList()).toArray(new String[0]);
        if (log.isDebugEnabled()) {
            log.debug("Updating with endpoints: [{}]", Arrays.stream(endpoints).collect(Collectors.joining(",")));
```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
Variable `value` initializer `null` is redundant
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/providers/UserProfileFormValueProvider.java`
#### Snippet
```java

    private void loadKey(Map<String, Object> formData, String subpath, String key, User user) {
        Object value = null;

        try {
```

### RuleId[ruleID=UnusedAssignment]
Variable `successPage` initializer `null` is redundant
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/FormHandler.java`
#### Snippet
```java
                .map(PageManager::getPage).map(Page::getPath)
                .orElse(StringUtils.substringBefore(request.getResource().getPath(), "/" + JcrConstants.JCR_CONTENT));
        String successPage = null;
        String errorPage = pagePath;

```

### RuleId[ruleID=UnusedAssignment]
Variable `sub` initializer `null` is redundant
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/FormHandler.java`
#### Snippet
```java
        String errorPage = pagePath;

        StringSubstitutor sub = null;
        try {
            log.debug("Extracting form request...");
```

### RuleId[ruleID=UnusedAssignment]
Variable `value` initializer `null` is redundant
in `reference/src/main/java/org/apache/sling/cms/reference/forms/impl/actions/UpdateProfileAction.java`
#### Snippet
```java

            for (Entry<String, Object> e : request.getFormData().entrySet()) {
                Value value = null;
                if (e.getValue() instanceof String[]) {
                    Value[] values = Arrays.stream(((String[]) e.getValue())).map(valueFactory::createValue)
```

### RuleId[ruleID=UnusedAssignment]
Variable `term` initializer `null` is redundant
in `core/src/main/java/org/apache/sling/cms/core/models/SearchResults.java`
#### Snippet
```java
    private String type = CMSConstants.NT_PAGE;
    private String path = null;
    private String term = null;
    private SlingHttpServletRequest request;

```

### RuleId[ruleID=UnusedAssignment]
Variable `insight` initializer `null` is redundant
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/BaseInsightProvider.java`
#### Snippet
```java
    public Insight evaluateRequest(InsightRequest request) {
        log.trace("evaluatePage");
        Insight insight = null;
        try {
            insight = this.doEvaluateRequest(request);
```

### RuleId[ruleID=UnusedAssignment]
Variable `response` initializer `null` is redundant
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/providers/PageSpeedInsightProvider.java`
#### Snippet
```java
        HttpGet httpGet = new HttpGet(checkUrl);

        CloseableHttpResponse response = null;
        JsonReader reader = null;
        try (CloseableHttpClient client = HttpClients.createDefault()) {
```

### RuleId[ruleID=UnusedAssignment]
Variable `message` initializer `null` is redundant
in `core/src/main/java/org/apache/sling/cms/core/internal/jobs/RemoveJobServlet.java`
#### Snippet
```java

        I18NDictionary dictionary = provider.getDictionary(request);
        String message = null;
        CMSJobManager jobMgr = request.adaptTo(CMSJobManager.class);
        String id = request.getParameter("id");
```

### RuleId[ruleID=UnusedAssignment]
Variable `message` initializer `null` is redundant
in `core/src/main/java/org/apache/sling/cms/core/internal/jobs/StartJobServlet.java`
#### Snippet
```java

        I18NDictionary dictionary = provider.getDictionary(request);
        String message = null;
        CMSJobManager jobMgr = request.adaptTo(CMSJobManager.class);
        if (jobMgr != null) {
```

### RuleId[ruleID=UnusedAssignment]
Variable `response` initializer `null` is redundant
in `core/src/main/java/org/apache/sling/cms/core/insights/impl/providers/HTMLValdiatorInsightProvider.java`
#### Snippet
```java
        I18NDictionary dictionary = i18nProvider.getDictionary(request.getResource().getResourceResolver());

        CloseableHttpResponse response = null;
        JsonReader reader = null;
        try (CloseableHttpClient client = HttpClients.createDefault()) {
```

### RuleId[ruleID=UnusedAssignment]
Variable `resource` initializer `null` is redundant
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ReferenceOperation.java`
#### Snippet
```java
    private Pattern regex = null;

    private Resource resource = null;

    protected ReferenceOperation(Resource resource) {
```

### RuleId[ruleID=UnusedAssignment]
Variable `regex` initializer `null` is redundant
in `core/src/main/java/org/apache/sling/cms/core/internal/models/ReferenceOperation.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(ReferenceOperation.class);

    private Pattern regex = null;

    private Resource resource = null;
```

### RuleId[ruleID=UnusedAssignment]
Variable `properties` initializer `null` is redundant
in `core/src/main/java/org/apache/sling/cms/core/internal/FileMetadataExtractorImpl.java`
#### Snippet
```java
                return;
            }
            Map<String, Object> properties = null;
            Resource metadata = content.getChild(CMSConstants.NN_METADATA);
            if (metadata != null) {
```

### RuleId[ruleID=UnusedAssignment]
Variable `value` initializer `null` is redundant
in `core/src/main/java/org/apache/sling/cms/core/internal/rewriter/ReferenceMappingTransformer.java`
#### Snippet
```java
            AttributesImpl newAtts = new AttributesImpl();
            for (int i = 0; i < atts.getLength(); i++) {
                String value = null;
                if (ArrayUtils.contains(attributes, atts.getLocalName(i).toLowerCase())
                        && atts.getValue(i).startsWith("/")) {
```

### RuleId[ruleID=UnusedAssignment]
Variable `writer` initializer `null` is redundant
in `core/src/main/java/org/apache/sling/cms/core/internal/filters/EditIncludeFilter.java`
#### Snippet
```java
            throws IOException, ServletException {
        boolean enabled = "true".equals(request.getAttribute(ENABLED_ATTR_NAME));
        PrintWriter writer = null;
        if (enabled) {
            boolean includeEnd = false;
```

### RuleId[ruleID=UnusedAssignment]
Variable `toPublish` initializer `null` is redundant
in `core/src/main/java/org/apache/sling/cms/core/publication/BulkPublicationJob.java`
#### Snippet
```java

        for (String path : paths) {
            Stream<PublishableResource> toPublish = null;
            Resource resource = resolver.getResource(path);
            if (deep) {
```

### RuleId[ruleID=UnusedAssignment]
Variable `resource` initializer `null` is redundant
in `core/src/main/java/org/apache/sling/cms/core/usergenerated/impl/UserGeneratedContentServiceImpl.java`
#### Snippet
```java
        serviceResolver.refresh();

        Resource resource = null;

        log.debug("Creating content of type {} in bucket {}", bucketConfig.getContentType(), bucketConfig.getBucket());
```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Value `includeEnd` is always 'false'
in `core/src/main/java/org/apache/sling/cms/core/internal/filters/EditIncludeFilter.java`
#### Snippet
```java
                this.writeDropTarget(resource, writer, "before " + resource.getName());
            }
            includeEnd = writeHeader(slingRequest, writer, includeEnd);
            request.setAttribute(WRITE_DROP_TARGET_ATTR_NAME, container);
            chain.doFilter(request, response);
```

### RuleId[ruleID=ConstantValue]
Condition `value.equals(find)` is always `false` when reached
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/BulkReplaceOperation.java`
#### Snippet
```java
        if (properties.get(entry.getKey()) instanceof String) {
            String value = (String) entry.getValue();
            if (rfind == null && (value.contains(find) || value.equals(find))) {
                value = value.replace(find, replace);
                log.trace("Value after replacement: {}", value);
```

### RuleId[ruleID=ConstantValue]
Condition `value.equals(find)` is always `false` when reached
in `core/src/main/java/org/apache/sling/cms/core/internal/operations/BulkReplaceOperation.java`
#### Snippet
```java
            for (int i = 0; i < v.length; i++) {
                String value = v[i];
                if (rfind == null && (value.contains(find) || value.equals(find))) {
                    v[i] = value.replace(find, replace);
                    arrUpdated = true;
```

