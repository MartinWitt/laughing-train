# sling-org-apache-sling-jcr-repoinit 
 
# Bad smells
I found 40 bad smells with 7 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 8 | false |
| ZeroLengthArrayInitialization | 6 | false |
| UnnecessaryToStringCall | 4 | true |
| AssignmentToMethodParameter | 3 | false |
| DataFlowIssue | 2 | false |
| UNUSED_IMPORT | 2 | false |
| MismatchedJavadocCode | 2 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| UnusedAssignment | 2 | false |
| StringEqualsEmptyString | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| ImplicitArrayToString | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| RedundantFieldInitialization | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| TrivialStringConcatenation | 1 | false |
| ConstantValue | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[privileges.size()\]'
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
        AccessControlManager acMgr = session.getAccessControlManager();

        final String [] privArray = privileges.toArray(new String[privileges.size()]);
        final Privilege[] jcrPriv = AccessControlUtils.privilegesFromNames(acMgr, privArray);
        
```

## RuleId[ruleID=ImplicitArrayToString]
### ImplicitArrayToString
Implicit call to 'toString()' on array returned by call to `entry.getRestrictionNames()`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
        return "[" + entry.getClass().getSimpleName() + "# principal: "
                + "" + entry.getPrincipal() + ", privileges: " + Arrays.toString(entry.getPrivileges()) +
                ", isAllow: " + entry.isAllow() + ", restrictionNames: " + entry.getRestrictionNames()  + "]";
    }

```

## RuleId[ruleID=DataFlowIssue]
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

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/sling/jcr/repoinit/package-info.java`
#### Snippet
```java
 ******************************************************************************/

@org.osgi.annotation.versioning.Version("1.1.2")
package org.apache.sling.jcr.repoinit;

```

## RuleId[ruleID=UNUSED_IMPORT]
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

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/sling/jcr/repoinit/impl/RetryableOperation.java`
#### Snippet
```java
    @SuppressWarnings("java:S2245") // we don't do crypto stuff here
    Random random = new Random();
    int retryCount = 0;

    RetryableOperation(int backoff, int maxRetries, int jitter) {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/NodePropertiesVisitor.java`
#### Snippet
```java
            String relPath = parentPath.toString();
            if (n.hasNode(relPath)) {
                n = n.getNode(relPath);
            } else {
                n = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/NodePropertiesVisitor.java`
#### Snippet
```java
                n = n.getNode(relPath);
            } else {
                n = null;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `subTreePath`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/NodePropertiesVisitor.java`
#### Snippet
```java
        } else {
            if (subTreePath.startsWith("/")) {
                subTreePath = subTreePath.substring(1);
            }
            pRelPath = String.format("%s/%s", subTreePath, name);
```

## RuleId[ruleID=MismatchedJavadocCode]
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

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-04-18-21-43.399.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`reference.trim().length() == 0` can be replaced with 'reference.trim().isEmpty()'
in `src/main/java/org/apache/sling/jcr/repoinit/impl/RepositoryInitializerFactory.java`
#### Snippet
```java
                    final RepoinitTextProvider p = new RepoinitTextProvider();
                    for(final String reference : config.references()) {
                        if(reference == null || reference.trim().length() == 0) {
                            continue;
                        }
```

### SizeReplaceableByIsEmpty
`script.trim().length() == 0` can be replaced with 'script.trim().isEmpty()'
in `src/main/java/org/apache/sling/jcr/repoinit/impl/RepositoryInitializerFactory.java`
#### Snippet
```java
                if ( config.scripts() != null ) {
                    for(final String script : config.scripts()) {
                        if(script == null || script.trim().length() == 0) {
                            continue;
                        }
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/sling/jcr/repoinit/impl/GroupMembershipVisitor.java`
#### Snippet
```java
                report(groupname + " is not a group");
            } else {
                ((Group) group).addMembers(members.toArray(new String[0]));
            }
        } catch (RepositoryException e) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/sling/jcr/repoinit/impl/GroupMembershipVisitor.java`
#### Snippet
```java
                report(groupname + " is not a group");
            } else {
                ((Group) group).removeMembers(members.toArray(new String[0]));
            }
        } catch (RepositoryException e) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/sling/jcr/repoinit/impl/PrivilegeVisitor.java`
#### Snippet
```java
            try {
                ((JackrabbitWorkspace) session.getWorkspace()).getPrivilegeManager()
                    .registerPrivilege(rp.getPrivilegeName(), rp.isAbstract(), rp.getDeclaredAggregateNames().toArray(new String[0]));
            } catch (Exception ex) {
                report(ex, "Unable to register privilege from: " + rp);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java

                    LocalRestrictions restr = createLocalRestrictions(restrictionClauses, acl, session);
                    Privilege[] privs = AccessControlUtils.privilegesFromNames(acMgr, privileges.toArray(new String[0]));
                    
                    for (AccessControlEntry ace : acl.getAccessControlEntries()) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
            LocalRestrictions restr = createLocalRestrictions(line.getRestrictions(), acl, session);
            List<String> privNames = line.getProperty(PROP_PRIVILEGES);
            Privilege[] privs = AccessControlUtils.privilegesFromNames(acMgr, privNames.toArray(new String[0]));
            Predicate<PrincipalAccessControlList.Entry> predicate = entry -> {
                if (!jcrPaths.contains(entry.getEffectivePath())) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
                }
            } else if (action == AclLine.Action.ALLOW) {
                final Privilege[] privileges = AccessControlUtils.privilegesFromNames(acMgr, line.getProperty(PROP_PRIVILEGES).toArray(new String[0]));
                for (String effectivePath : jcrPaths) {
                    if (acl == null) {
```

## RuleId[ruleID=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
    private static String toString(JackrabbitAccessControlEntry entry) throws RepositoryException {
        return "[" + entry.getClass().getSimpleName() + "# principal: "
                + "" + entry.getPrincipal() + ", privileges: " + Arrays.toString(entry.getPrivileges()) +
                ", isAllow: " + entry.isAllow() + ", restrictionNames: " + entry.getRestrictionNames()  + "]";
    }
```

## RuleId[ruleID=UnnecessaryToStringCall]
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

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Operation`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/JcrRepoInitOpsProcessorImpl.java`
#### Snippet
```java
     */
    @Override
    public void apply(Session session, List<Operation> ops) {

        final OperationVisitor [] visitors = {
```

### BoundedWildcard
Can generalize to `? extends RetryableOperationResult`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/RetryableOperation.java`
#### Snippet
```java
     * @return true if the supplier was eventually successful, false if it failed despite all retries
     */
    public RetryableOperationResult apply(Supplier<RetryableOperationResult> operation, String logMessage) {

        RetryableOperationResult result = operation.get();
```

### BoundedWildcard
Can generalize to `? extends PropertyLine`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/NodePropertiesVisitor.java`
#### Snippet
```java
     * @param propertyLines the property lines to process to set the properties
     */
    private void setNodeProperties(String nodePath, List<PropertyLine> propertyLines) throws RepositoryException {
        log.info("Setting properties on nodePath '{}'", nodePath);
        Node n = session.getNode(nodePath);
```

### BoundedWildcard
Can generalize to `? extends PropertyLine`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/NodePropertiesVisitor.java`
#### Snippet
```java
     * @param propertyLines the property lines to process to set the properties
     */
    private void setAuthorizableProperties(String nodePath, List<PropertyLine> propertyLines) throws RepositoryException {
        int lastHashIndex = nodePath.lastIndexOf(SUBTREE_DELIMINATOR);
        if (lastHashIndex == -1) {
```

### BoundedWildcard
Can generalize to `? extends PathSegmentDefinition`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/NodeVisitor.java`
#### Snippet
```java
    }

    private void createNodes(List<PathSegmentDefinition> pathSegmentDefinitions, List<PropertyLine> propertyLines, boolean strict) {
        StringBuilder parentPathBuilder = new StringBuilder();
        for (PathSegmentDefinition psd : pathSegmentDefinitions) {
```

### BoundedWildcard
Can generalize to `? extends AclLine`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
    }

    public static void removePrincipalEntries(Session session, String principalName, Collection<AclLine> lines) throws RepositoryException {
        final JackrabbitAccessControlManager acMgr = getJACM(session);
        Principal principal = AccessControlUtils.getPrincipal(session, principalName);
```

### BoundedWildcard
Can generalize to `? extends AclLine`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
    }

    public static void setPrincipalAcl(Session session, String principalName, Collection<AclLine> lines, boolean isStrict) throws RepositoryException {
        final JackrabbitAccessControlManager acMgr = getJACM(session);
        Principal principal = AccessControlUtils.getPrincipal(session, principalName);
```

### BoundedWildcard
Can generalize to `? super PrincipalAccessControlList.Entry`
in `src/main/java/org/apache/sling/jcr/repoinit/impl/AclUtil.java`
#### Snippet
```java
    }

    private static boolean removePrincipalEntries(@Nullable PrincipalAccessControlList acl, @NotNull String principalName, @NotNull Predicate<PrincipalAccessControlList.Entry> predicate) throws RepositoryException {
        boolean modified = false;
        if (acl == null) {
```

## RuleId[ruleID=UnusedAssignment]
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

## RuleId[ruleID=ConstantValue]
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

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/org/apache/sling/jcr/repoinit/impl/NodeVisitor.java`
#### Snippet
```java
                        }
                    } else if (!session.propertyExists(fullPath)) {
                        final Node parent = parentPath.equals("") ? session.getRootNode() : session.getNode(parentPath);
                        log.info("Creating node {} with primary type {}", fullPath, psd.getPrimaryType());
                        node = addChildNode(parent, psd);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/org/apache/sling/jcr/repoinit/impl/NodeVisitor.java`
#### Snippet
```java
                        node = null;
                    } else {
                        final Node parent = parentPath.equals("") ? session.getRootNode() : session.getNode(parentPath);
                        log.info("Creating node {} with primary type {}", fullPath, psd.getPrimaryType());
                        node = addChildNode(parent, psd);
```

