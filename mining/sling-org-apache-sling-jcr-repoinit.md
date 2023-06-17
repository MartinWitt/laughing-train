# sling-org-apache-sling-jcr-repoinit 
 
# Bad smells
I found 60 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 25 | false |
| DataFlowIssue | 8 | false |
| JavadocReference | 5 | false |
| UnnecessaryToStringCall | 4 | true |
| FieldMayBeFinal | 4 | false |
| ConstantValue | 4 | false |
| DuplicatedCode | 2 | false |
| MismatchedJavadocCode | 2 | false |
| UNUSED_IMPORT | 2 | false |
| UnusedAssignment | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| NonFinalFieldInEnum | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[privileges.size()\]'
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
        AccessControlManager acMgr = session.getAccessControlManager();

        final String [] privArray = privileges.toArray(new String[privileges.size()]);
        final Privilege[] jcrPriv = AccessControlUtils.privilegesFromNames(acMgr, privArray);
        
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `type` in enum 'TextFormat'
in `src/main/java/org/apache/sling/jcr/repoinit/impl/RepoinitTextProvider.java`
#### Snippet
```java
        MODEL("model");

        private String type;

        TextFormat(String type) {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
        final JackrabbitAccessControlManager acMgr = getJACM(session);
        Principal principal = AccessControlUtils.getPrincipal(session, principalName);
        if (principal == null) {
            // due to transient nature of the repo-init the principal lookup may not succeed if completed through query
            // -> save transient changes and retry principal lookup
            session.save();
            principal = AccessControlUtils.getPrincipal(session, principalName);
            checkState(principal != null, PRINCIPAL_NOT_FOUND_PATTERN, principalName);
        }

        final PrincipalAccessControlList acl = getPrincipalAccessControlList(acMgr, principal, true);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/sling/jcr/repoinit/impl/RepositoryInitializerFactory.java`
#### Snippet
```java
                        final List<Operation> ops;
                        try (StringReader sr = new StringReader(repoinitText)) {
                            ops = parser.parse(sr);
                        }
                        String msg = String.format("Executing %s repoinit operations", ops.size());
                        log.info(msg);
                        applyOperations(s,ops,msg);
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `src/main/java/org/apache/sling/jcr/repoinit/impl/RetryableOperation.java`
#### Snippet
```java
     * @param operation
     * @param logMessage the log message
     * @return true if the supplier was eventually successful, false if it failed despite all retries
     */
    public RetryableOperationResult apply(Supplier<RetryableOperationResult> operation, String logMessage) {
```

### MismatchedJavadocCode
Method is specified to return 'false' but its return type is not boolean
in `src/main/java/org/apache/sling/jcr/repoinit/impl/RetryableOperation.java`
#### Snippet
```java
     * @param operation
     * @param logMessage the log message
     * @return true if the supplier was eventually successful, false if it failed despite all retries
     */
    public RetryableOperationResult apply(Supplier<RetryableOperationResult> operation, String logMessage) {
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `SetProperties`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/NodePropertiesVisitor.java`
#### Snippet
```java
     * The repoinit.parser transforms the authorizable(ids)[/relative_path] path
     * syntax from the original source into ":authorizable:ids#/relative_path" in the 
     * values provided from {@link SetProperties#getPaths()}
     * 
     * These constants are used to unwind those values into the parts for processing
```

### JavadocReference
Cannot resolve symbol `getPaths()`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/NodePropertiesVisitor.java`
#### Snippet
```java
     * The repoinit.parser transforms the authorizable(ids)[/relative_path] path
     * syntax from the original source into ":authorizable:ids#/relative_path" in the 
     * values provided from {@link SetProperties#getPaths()}
     * 
     * These constants are used to unwind those values into the parts for processing
```

### JavadocReference
Cannot resolve symbol `parentNode`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/NodePropertiesVisitor.java`
#### Snippet
```java
     *
     * @param propName the propertyName to check
     * @param parentNode the parent node where the property will be set
     * @return the required type of the property or {@link PropertyType#UNDEFINED} if it could not be determined
     */
```

### JavadocReference
Cannot resolve symbol `principal`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
     * 
     * @param acMgr the access control manager
     * @param principal the principal
     * @return the first available {@link PrincipalAccessControlList} bound to the given principal or {@code null} of <a href="https://jackrabbit.apache.org/oak/docs/security/authorization/principalbased.html">principal-based authorization</a> is not enabled for the given principal
     * @throws RepositoryException
```

### JavadocReference
Cannot resolve symbol `PrincipalAccessControlList`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
     * @param acMgr the access control manager
     * @param principal the principal
     * @return the first available {@link PrincipalAccessControlList} bound to the given principal or {@code null} of <a href="https://jackrabbit.apache.org/oak/docs/security/authorization/principalbased.html">principal-based authorization</a> is not enabled for the given principal
     * @throws RepositoryException
     */
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Condition `policy instanceof JackrabbitAccessControlList` is redundant and can be replaced with a null check
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
        }
        for (AccessControlPolicy policy : session.getAccessControlManager().getPolicies(absPath)) {
            if (policy instanceof JackrabbitAccessControlList) {
                LocalRestrictions lr = createLocalRestrictions(restrictionList, ((JackrabbitAccessControlList) policy), session);
                LocalAccessControlEntry newEntry = new LocalAccessControlEntry(principal, privileges, isAllow, lr);
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
        }
        if (modified) {
            acMgr.setPolicy(acl.getPath(), acl);
        }
    }
```

### DataFlowIssue
Condition `policy instanceof JackrabbitAccessControlList` is redundant and can be replaced with a null check
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
        } else {
            for (AccessControlPolicy policy : acMgr.getPolicies(path)) {
                if (policy instanceof JackrabbitAccessControlList) {
                    return (JackrabbitAccessControlList) policy;
                }
```

### DataFlowIssue
Condition `other instanceof JackrabbitAccessControlEntry` is redundant and can be replaced with a null check
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java

        public boolean isEqual(AccessControlEntry other) {
            if (!(other instanceof JackrabbitAccessControlEntry)) {
                return false;
            }
```

### DataFlowIssue
Condition `ace instanceof PrincipalAccessControlList.Entry` is redundant and can be replaced with a null check
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
        } else {
            for (AccessControlEntry ace : acl.getAccessControlEntries()) {
                if (ace instanceof PrincipalAccessControlList.Entry) {
                    PrincipalAccessControlList.Entry entry = (PrincipalAccessControlList.Entry) ace;
                    if (predicate.test(entry)) {
```

### DataFlowIssue
Condition `acm instanceof JackrabbitAccessControlManager` is redundant and can be replaced with a null check
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
    public static JackrabbitAccessControlManager getJACM(Session s) throws RepositoryException {
        final AccessControlManager acm = s.getAccessControlManager();
        checkState((acm instanceof JackrabbitAccessControlManager), "AccessControlManager is not a JackrabbitAccessControlManager: {0}", acm.getClass().getName());
        return (JackrabbitAccessControlManager) acm;
    }
```

### DataFlowIssue
Condition `session instanceof JackrabbitSession` is redundant and can be replaced with a null check
in `src/main/java/org/apache/sling/jcr/repoinit/impl/UserUtil.java`
#### Snippet
```java

    public static PrincipalManager getPrincipalManager(Session session) throws RepositoryException {
        if(!(session instanceof JackrabbitSession)) {
            throw new IllegalArgumentException("Session is not a JackrabbitSession");
        }
```

### DataFlowIssue
Condition `session instanceof JackrabbitSession` is redundant and can be replaced with a null check
in `src/main/java/org/apache/sling/jcr/repoinit/impl/UserUtil.java`
#### Snippet
```java

    public static UserManager getUserManager(Session session) throws RepositoryException {
        if(!(session instanceof JackrabbitSession)) {
            throw new IllegalArgumentException("Session is not a JackrabbitSession");
        }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclVisitor.java`
#### Snippet
```java
                AclUtil.removeEntries(session, require(line, PROP_PRINCIPALS), paths, require(line, PROP_PRIVILEGES), line.getAction() == AclLine.Action.ALLOW, line.getRestrictions());
            } catch (Exception e) {
                report(e,"Failed to remove access control entries (" + e.toString() + ") " + line);
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclVisitor.java`
#### Snippet
```java
                AclUtil.removeEntries(session, principals, paths, require(line, PROP_PRIVILEGES), line.getAction() == AclLine.Action.ALLOW, line.getRestrictions());
            } catch (Exception e) {
                report(e,"Failed to remove access control entries (" + e.toString() + ") " + line);
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclVisitor.java`
#### Snippet
```java
            }
        } catch (Exception e) {
            report(e, "Failed to set repository level ACL (" + e.toString() + ") " + line);
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclVisitor.java`
#### Snippet
```java
            }
        } catch (Exception e) {
            report(e,"Failed to set ACL (" + e.toString() + ") " + line);
        }
    }
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/NodeVisitor.java`
#### Snippet
```java
package org.apache.sling.jcr.repoinit.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
```

### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/NodeVisitor.java`
#### Snippet
```java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/NodePropertiesVisitor.java`
#### Snippet
```java
     * property if already set"
     *
     * @throws RepositoryException
     * @throws PathNotFoundException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/NodePropertiesVisitor.java`
#### Snippet
```java
     *
     * @throws RepositoryException
     * @throws PathNotFoundException
     */
    private static boolean needToSetProperty(@NotNull Node n, @NotNull PropertyLine line) throws RepositoryException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/NodePropertiesVisitor.java`
#### Snippet
```java
     * property if already set"
     *
     * @throws RepositoryException
     * @throws PathNotFoundException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/NodePropertiesVisitor.java`
#### Snippet
```java
     *
     * @throws RepositoryException
     * @throws PathNotFoundException
     */
    private static boolean needToSetProperty(Session session, Authorizable a, String pRelPath, PropertyLine line) throws RepositoryException {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/RepositoryInitializerFactory.java`
#### Snippet
```java
     * @param logMessage logmessage which should be printed
     * @param retry the retry object
     * @return
     */
    protected RetryableOperationResult applyOperationInternal(Session session, List<Operation> ops, String logMessage,
```

### JavadocDeclaration
Exception is not declared to be thrown by method applyOperations
in `src/main/java/org/apache/sling/jcr/repoinit/impl/RepositoryInitializerFactory.java`
#### Snippet
```java
     * @param ops the list of operations
     * @param logMessage the messages to print when retry
     * @throws Exception if the application fails despite the retry
     */
    protected void applyOperations(Session session, List<Operation> ops, String logMessage) throws RepositoryException {
```

### JavadocDeclaration
`@param operation` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/RetryableOperation.java`
#### Snippet
```java
     * the retry aborts; in case the operation is retried, a log message is logged on INFO with the
     * provided logMessage and the current number of retries
     * @param operation
     * @param logMessage the log message
     * @return true if the supplier was eventually successful, false if it failed despite all retries
```

### JavadocDeclaration
`@param jace` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
         * compares if restrictions present in jackrabbit access control entry
         * is same as specified restrictions in repo init
         * @param jace
         * @return
         * @throws RepositoryException
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
         * is same as specified restrictions in repo init
         * @param jace
         * @return
         * @throws RepositoryException
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
         * @param jace
         * @return
         * @throws RepositoryException
         */
        private boolean sameRestrictions(JackrabbitAccessControlEntry jace) throws RepositoryException {
```

### JavadocDeclaration
`@param list` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
     * Converts RestrictionClauses to structure consumable by
     * jackrabbit
     * @param list
     * @param jacl
     * @param s
```

### JavadocDeclaration
`@param jacl` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
     * jackrabbit
     * @param list
     * @param jacl
     * @param s
     * @return
```

### JavadocDeclaration
`@param s` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
     * @param list
     * @param jacl
     * @param s
     * @return
     * @throws RepositoryException
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
     * @param jacl
     * @param s
     * @return
     * @throws RepositoryException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
     * @param s
     * @return
     * @throws RepositoryException
     */
    private static LocalRestrictions createLocalRestrictions(List<RestrictionClause> list, JackrabbitAccessControlList jacl, Session s) throws RepositoryException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
     * @param principal the principal
     * @return the first available {@link PrincipalAccessControlList} bound to the given principal or {@code null} of <a href="https://jackrabbit.apache.org/oak/docs/security/authorization/principalbased.html">principal-based authorization</a> is not enabled for the given principal
     * @throws RepositoryException
     */
    @Nullable
```

### JavadocDeclaration
`@param session` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
     * Remove resource-based access control setup defined for the specified paths.
     * 
     * @param session
     * @param paths
     * @throws RepositoryException
```

### JavadocDeclaration
`@param paths` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
     * 
     * @param session
     * @param paths
     * @throws RepositoryException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
     * @param session
     * @param paths
     * @throws RepositoryException
     */
    public static void removePolicies(@NotNull Session session, @NotNull List<String> paths) throws RepositoryException {
```

### JavadocDeclaration
`@param session` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
     * Remove principal-based access control setup for the principal with the given name. 
     *
     * @param session
     * @param principalName
     * @throws RepositoryException
```

### JavadocDeclaration
`@param principalName` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
     *
     * @param session
     * @param principalName
     * @throws RepositoryException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
     * @param session
     * @param principalName
     * @throws RepositoryException
     */
    public static void removePrincipalPolicy(@NotNull Session session, @NotNull String principalName) throws RepositoryException {
```

### JavadocDeclaration
`@param session` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
     * Remove resource-based access control setup for the principal with the given name.
     * 
     * @param session
     * @param principalName
     * @throws RepositoryException
```

### JavadocDeclaration
`@param principalName` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
     * 
     * @param session
     * @param principalName
     * @throws RepositoryException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
     * @param session
     * @param principalName
     * @throws RepositoryException
     */
    public static void removePolicy(@NotNull Session session, @NotNull final String principalName) throws RepositoryException {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `group` initializer `null` is redundant
in `src/main/java/org/apache/sling/jcr/repoinit/impl/GroupMembershipVisitor.java`
#### Snippet
```java
        List<String> members = rm.getMembers();
        String groupname = rm.getGroupname();
        Authorizable group = null;
        log.info("Removing members '{}' from group '{}'", members, groupname);
        try {
```

### UnusedAssignment
Variable `group` initializer `null` is redundant
in `src/main/java/org/apache/sling/jcr/repoinit/impl/GroupMembershipVisitor.java`
#### Snippet
```java
        List<String> members = am.getMembers();
        String groupname = am.getGroupname();
        Authorizable group = null;
        log.info("Adding members '{}' to group '{}'", members, groupname);
        try {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `restrictions` may be 'final'
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
     */
    private static class LocalRestrictions {
        private Map<String,Value> restrictions;
        private Map<String,Value[]> mvRestrictions;
        public LocalRestrictions(){
```

### FieldMayBeFinal
Field `mvRestrictions` may be 'final'
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
    private static class LocalRestrictions {
        private Map<String,Value> restrictions;
        private Map<String,Value[]> mvRestrictions;
        public LocalRestrictions(){
            restrictions = new HashMap<>();
```

### FieldMayBeFinal
Field `log` may be 'final'
in `src/main/java/org/apache/sling/jcr/repoinit/impl/RepoinitTextProvider.java`
#### Snippet
```java
    public static final Pattern REF_PATTERN = Pattern.compile("([a-z]+)(@([a-zA-Z0-9_-]+))?:(.*)");

    private Logger log = LoggerFactory.getLogger(getClass());

    static class Reference {
```

### FieldMayBeFinal
Field `type` may be 'final'
in `src/main/java/org/apache/sling/jcr/repoinit/impl/RepoinitTextProvider.java`
#### Snippet
```java
        MODEL("model");

        private String type;

        TextFormat(String type) {
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `principal instanceof ItemBasedPrincipal` is always `true`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
            String principalDescription = principal.getName();
            // try to get path of principal in case it is backed by a JCR user/group
            if (principal instanceof ItemBasedPrincipal) {
                principalDescription += " (" + ((ItemBasedPrincipal) principal).getPath() + ")";
            }
```

### ConstantValue
Value `args` is always 'null'
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
                throw new IllegalStateException(msgPattern);
            } else {
                throw new IllegalStateException(MessageFormat.format(msgPattern, args));
            }
        }
```

### ConstantValue
Condition `policy instanceof JackrabbitAccessControlList && !(policy instanceof PrincipalAccessControlList)` is always `false`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
            // make sure not to remove the principal-based access control list but instead only drop
            // resource-based access control content for the given principal
            if (policy instanceof JackrabbitAccessControlList && !(policy instanceof PrincipalAccessControlList)) {
                acMgr.removePolicy(policy.getPath(), policy);
            }
```

### ConstantValue
Condition `!(policy instanceof PrincipalAccessControlList)` is always `false` when reached
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
            // make sure not to remove the principal-based access control list but instead only drop
            // resource-based access control content for the given principal
            if (policy instanceof JackrabbitAccessControlList && !(policy instanceof PrincipalAccessControlList)) {
                acMgr.removePolicy(policy.getPath(), policy);
            }
```

