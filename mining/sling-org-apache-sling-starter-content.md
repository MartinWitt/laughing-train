# sling-org-apache-sling-starter-content 
 
# Bad smells
I found 27 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantFieldInitialization | 8 | false |
| DataFlowIssue | 7 | false |
| BoundedWildcard | 5 | false |
| UnusedAssignment | 2 | false |
| StringBufferReplaceableByString | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| ComparatorCombinators | 1 | false |
## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/sling/starter/access/models/Acl.java`
#### Snippet
```java

    @OSGiService
    public GetAcl getAcl = null;

    public Collection<PrincipalPrivilege> getPrincipals() throws RepositoryException {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/sling/starter/access/models/PrivilegeItem.java`
#### Snippet
```java
    private Set<String> allowRestrictionsToDelete;
    private Set<String> denyRestrictionsToDelete;
    private boolean allowExists = false;
    private boolean denyExists = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/sling/starter/access/models/PrivilegeItem.java`
#### Snippet
```java
    private Set<String> denyRestrictionsToDelete;
    private boolean allowExists = false;
    private boolean denyExists = false;

    public PrivilegeItem(String name, boolean granted, boolean denied, String longestPath) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/sling/starter/access/models/AccessFormPage.java`
#### Snippet
```java
 */
public abstract class AccessFormPage {
    protected PrivilegesInfo privilegesInfo = null;

    @ScriptVariable
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java

    @OSGiService
    public GetAce getAce = null;

    @OSGiService
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java

    @OSGiService
    public GetAcl getAcl = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java

    @OSGiService
    protected List<RestrictionProvider> restrictionProviders = null;

    @OSGiService
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java

    protected String principalId;
    protected Map<Privilege, PrivilegeItem> persistedPrivilegesMap = null;
    private boolean aceExists;

```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/org/apache/sling/starter/access/models/PrivilegeItem.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PrivilegeItem [name=");
        builder.append(name);
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java
            }
        }
        return supportedPrivileges == null ? new Privilege[0] : supportedPrivileges;
    }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getPrincipalManager` may produce `NullPointerException`
in `src/main/java/org/apache/sling/starter/access/models/Acl.java`
#### Snippet
```java

            Session jcrSession = request.getResourceResolver().adaptTo(Session.class);
            PrincipalManager principalManager = ((JackrabbitSession)jcrSession).getPrincipalManager();
            JsonObject acl = getAcl.getAcl(jcrSession, resource.getPath());
            for (Entry<String, JsonValue> entry : acl.entrySet()) {
```

### DataFlowIssue
Argument `jcrSession` might be null
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java

        Session jcrSession = request.getResourceResolver().adaptTo(Session.class);
        Map<Privilege, String> privilegeToLongestPath = AceUtils.getPrivilegeLongestPathMap(jcrSession);
        Privilege[] supported = getSupportedOrRegisteredPrivileges(jcrSession, resource.getPath());
        for (Privilege privilege : supported) {
```

### DataFlowIssue
Method invocation `getPrincipalManager` may produce `NullPointerException`
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java
        List<PrincipalPrivilege> list = new ArrayList<>();
        Session jcrSession = request.getResourceResolver().adaptTo(Session.class);
        PrincipalManager principalManager = ((JackrabbitSession)jcrSession).getPrincipalManager();
        String pid = getPrincipalId();
        JsonObject acl = getAcl.getAcl(jcrSession, getAcePath());
```

### DataFlowIssue
Argument `jcrSession` might be null
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java
        if (persistedPrivilegesMap == null) {
            Session jcrSession = request.getResourceResolver().adaptTo(Session.class);
            Map<Privilege, String> privilegeToLongestPath = AceUtils.getPrivilegeLongestPathMap(jcrSession);
            String acePath = getAcePath();
            persistedPrivilegesMap = initialPrivilegesMap(privilegeToLongestPath, acePath);
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java
                    String[] strings = entry.getValue();
                    if (rd.getRequiredType().isArray()) {
                        value = strings;
                    } else if (strings.length > 0) {
                        //use the first one?
```

### DataFlowIssue
Argument `jcrSession` might be null
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java
        try {
            Session jcrSession = request.getResourceResolver().adaptTo(Session.class);
            supportedPrivileges = getSupportedOrRegisteredPrivileges(jcrSession,
                    PATH_REPOSITORY.equals(acePath) ? null : acePath );
        } catch (RepositoryException e) {
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java
        } catch (RepositoryException e) {
            //ignore
            supportedPrivileges = null;
        }
        if (supportedPrivileges != null) {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/sling/starter/access/models/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0.0")
package org.apache.sling.starter.access.models;

```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/org/apache/sling/starter/access/models/Acl.java`
#### Snippet
```java
                    JsonObject privilegesObj = ((JsonObject)entry.getValue()).getJsonObject("privileges");
                    privilegesObj.values().stream()
                        .forEach(item -> {
                            allow.set(allow.get() || ((JsonObject)item).containsKey("allow"));
                            deny.set(deny.get() || ((JsonObject)item).containsKey("deny"));
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Privilege`
in `src/main/java/org/apache/sling/starter/access/models/AceUtils.java`
#### Snippet
```java
     * calculate the instance with the greatest depth.
     */
    private static void toLongestPath(String prefix, Privilege parentPrivilege, Map<Privilege, String> privilegeToLongestPath) {
        Privilege[] declaredAggregatePrivileges = parentPrivilege.getDeclaredAggregatePrivileges();
        for (Privilege privilege : declaredAggregatePrivileges) {
```

### BoundedWildcard
Can generalize to `? extends RestrictionDefinition`
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java
    }

    protected List<RestrictionItem> jsonToRestrictionItems(Map<String, RestrictionDefinition> srMap,
            JsonObject restrictionsObj) {
        List<RestrictionItem> restrictionItems = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends RestrictionDefinition`
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java
     */
    protected void populateEntriesForMissingMandatoryRestrictions(List<RestrictionItem> list,
            Set<RestrictionDefinition> supportedRestrictions) {
        if (supportedRestrictions != null) {
            for (RestrictionDefinition rd : supportedRestrictions) {
```

### BoundedWildcard
Can generalize to `? extends RestrictionDefinition`
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java
    protected Map<String, String[]> populateEntriesFromPreviousFailedPost(Map<String, List<RestrictionItem>> allowMap,
            Map<String, List<RestrictionItem>> denyMap,
            Map<String, RestrictionDefinition> srMap) {
        Map<String, String[]> toDeleteFieldValues = getFieldValuesForPattern(RESTRICTION_PATTERN_DELETE);
        Map<String, String[]> fieldValues = getFieldValuesForPattern(RESTRICTION_PATTERN);
```

### BoundedWildcard
Can generalize to `? extends RestrictionDefinition`
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java
     * @return a map where the key is the restriction name and the value is the restriction definition
     */
    protected Map<String, RestrictionDefinition> toSrMap(Set<RestrictionDefinition> supportedRestrictions) {
        Map<String, RestrictionDefinition> srMap = new HashMap<>();
        for (RestrictionDefinition restrictionDefinition : supportedRestrictions) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `fieldValues` initializer `null` is redundant
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java

    protected String [] fieldValuesFromReqParams(RequestParameter[] paramValues) {
        String[] fieldValues = null;
        fieldValues = new String[paramValues.length];
        for (int i=0; i < paramValues.length; i++) {
```

### UnusedAssignment
Variable `supportedPrivileges` initializer `null` is redundant
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java
            Map<Privilege, String> privilegeToLongestPath, String acePath) {
        Map<Privilege, PrivilegeItem> newMap = new HashMap<>();
        Privilege[] supportedPrivileges = null;
        try {
            Session jcrSession = request.getResourceResolver().adaptTo(Session.class);
```

## RuleId[id=ComparatorCombinators]
### ComparatorCombinators
Can be replaced with 'Comparator.comparing'
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java
                // order these so the client side iteration will process from the top down
                List<Privilege> list = new ArrayList<>(Arrays.asList(aggregatePrivileges));
                list.sort((Privilege o1, Privilege o2) -> privilegeToLongestPath.get(o1).compareTo(privilegeToLongestPath.get(o2)));

                JsonArrayBuilder aggregateArray = factory.createArrayBuilder();
```

