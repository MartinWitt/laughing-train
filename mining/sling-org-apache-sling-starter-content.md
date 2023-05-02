# sling-org-apache-sling-starter-content 
 
# Bad smells
I found 23 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 9 | false |
| DataFlowIssue | 4 | false |
| JavadocDeclaration | 3 | false |
| UnusedAssignment | 2 | false |
| ConstantValue | 2 | false |
| JavadocReference | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| EmptyStatementBody | 1 | false |
## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `list`
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java
    /**
     * Populate the restriction item list from data from a previously failed POST request
     * @param list the list of restriction items
     * @param srMap map where the key is the restriction name and the value is the restriction definition
     * @return map of field values that were found in the form context
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

## RuleId[id=DataFlowIssue]
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

### DataFlowIssue
Condition `workspace instanceof JackrabbitWorkspace` is redundant and can be replaced with a null check
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java
            // non-existing path. We can't determine what is supported there, so consider all registered privileges
            Workspace workspace = jcrSession.getWorkspace();
            if (workspace instanceof JackrabbitWorkspace) {
                PrivilegeManager privilegeManager = ((JackrabbitWorkspace)workspace).getPrivilegeManager();
                supportedPrivileges = privilegeManager.getRegisteredPrivileges();
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
Condition `session instanceof JackrabbitSession` is redundant and can be replaced with a null check
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java
        if (principalId != null && !principalId.isEmpty()) {
            Session session = request.getResourceResolver().adaptTo(Session.class);
            if (session instanceof JackrabbitSession) {
                UserManager userManager = ((JackrabbitSession)session).getUserManager();
                if (userManager != null) {
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`else` statement has empty body
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java
                    if (authorizable != null) {
                        isInValidPrincipal = false;
                    } else {
                        //no user/group matches the supplied principal id
                    }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java
     * be used on the client side UI.
     * @return JSON representation of the privilege aggregations
     * @throws RepositoryException
     */
    public String getPrivilegeAggregationsAsJSON() throws RepositoryException {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java
     * @param jcrSession the current session
     * @param resourcePath the resource path to consider
     * @return
     * @throws RepositoryException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java
     * @param resourcePath the resource path to consider
     * @return
     * @throws RepositoryException
     */
    protected @NotNull Privilege[] getSupportedOrRegisteredPrivileges(@NotNull Session jcrSession, @Nullable String resourcePath) 
```

## RuleId[id=UnusedAssignment]
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `displayName` may be 'final'
in `src/main/java/org/apache/sling/starter/access/models/RestrictionDefinitionInfo.java`
#### Snippet
```java

public class RestrictionDefinitionInfo implements RestrictionDefinition {
    private String displayName;
    private RestrictionDefinition rd;

```

### FieldMayBeFinal
Field `isGroup` may be 'final'
in `src/main/java/org/apache/sling/starter/access/models/PrincipalPrivilege.java`
#### Snippet
```java
    private boolean isAllow;
    private boolean isDeny;
    private boolean isGroup;

    public PrincipalPrivilege(@NotNull Principal principal) {
```

### FieldMayBeFinal
Field `principalName` may be 'final'
in `src/main/java/org/apache/sling/starter/access/models/PrincipalPrivilege.java`
#### Snippet
```java

public class PrincipalPrivilege {
    private String principalName;
    private boolean isAllow;
    private boolean isDeny;
```

### FieldMayBeFinal
Field `rd` may be 'final'
in `src/main/java/org/apache/sling/starter/access/models/RestrictionDefinitionInfo.java`
#### Snippet
```java
public class RestrictionDefinitionInfo implements RestrictionDefinition {
    private String displayName;
    private RestrictionDefinition rd;

    public RestrictionDefinitionInfo(String displayName, RestrictionDefinition rd) {
```

### FieldMayBeFinal
Field `value` may be 'final'
in `src/main/java/org/apache/sling/starter/access/models/RestrictionItem.java`
#### Snippet
```java
public class RestrictionItem {
    private RestrictionDefinition rd;
    private Object value;
    private boolean exists;

```

### FieldMayBeFinal
Field `rd` may be 'final'
in `src/main/java/org/apache/sling/starter/access/models/RestrictionItem.java`
#### Snippet
```java

public class RestrictionItem {
    private RestrictionDefinition rd;
    private Object value;
    private boolean exists;
```

### FieldMayBeFinal
Field `longestPath` may be 'final'
in `src/main/java/org/apache/sling/starter/access/models/PrivilegeItem.java`
#### Snippet
```java
    private boolean granted;
    private boolean denied;
    private String longestPath;
    private long depth;
    private String extraCssClasses;
```

### FieldMayBeFinal
Field `depth` may be 'final'
in `src/main/java/org/apache/sling/starter/access/models/PrivilegeItem.java`
#### Snippet
```java
    private boolean denied;
    private String longestPath;
    private long depth;
    private String extraCssClasses;
    private List<RestrictionItem> allowRestrictions;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `src/main/java/org/apache/sling/starter/access/models/PrivilegeItem.java`
#### Snippet
```java

public class PrivilegeItem {
    private String name;
    private boolean granted;
    private boolean denied;
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `principal instanceof GroupPrincipal` is always `true`
in `src/main/java/org/apache/sling/starter/access/models/PrincipalPrivilege.java`
#### Snippet
```java
        super();
        this.principalName = principal.getName();
        this.isGroup = principal instanceof GroupPrincipal;
    }

```

### ConstantValue
Value `jsonValue` is always 'null'
in `src/main/java/org/apache/sling/starter/access/models/Ace.java`
#### Snippet
```java
                    }
                    value = values;
                } else if (jsonValue instanceof JsonString) {
                    value = ((JsonString)jsonValue).getString();
                }
```

