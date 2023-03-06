# guacamole-client 
 
# Bad smells
I found 836 bad smells with 175 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 221 | false |
| UnnecessaryModifier | 125 | true |
| BoundedWildcard | 69 | false |
| UnnecessaryFullyQualifiedName | 55 | false |
| NonSerializableFieldInSerializableClass | 36 | false |
| HtmlWrongAttributeValue | 27 | false |
| RedundantFieldInitialization | 26 | false |
| NonProtectedConstructorInAbstractClass | 26 | true |
| UnnecessarySuperQualifier | 24 | false |
| UNUSED_IMPORT | 21 | false |
| CharsetObjectCanBeUsed | 18 | false |
| AssignmentToMethodParameter | 18 | false |
| NestedAssignment | 15 | false |
| FieldMayBeStatic | 11 | false |
| CatchMayIgnoreException | 11 | false |
| DataFlowIssue | 9 | false |
| AnonymousHasLambdaAlternative | 7 | false |
| RedundantMethodOverride | 7 | false |
| ClassNameSameAsAncestorName | 7 | false |
| MismatchedCollectionQueryUpdate | 6 | false |
| ZeroLengthArrayInitialization | 6 | false |
| DeprecatedIsStillUsed | 6 | false |
| UnnecessaryLocalVariable | 6 | true |
| CStyleArrayDeclaration | 5 | false |
| UtilityClassWithoutPrivateConstructor | 5 | true |
| UnnecessarySemicolon | 5 | false |
| SimplifyStreamApiCallChains | 5 | false |
| ToArrayCallWithZeroLengthArrayArgument | 4 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 4 | false |
| SynchronizeOnNonFinalField | 4 | false |
| Convert2Lambda | 4 | false |
| AbstractClassNeverImplemented | 3 | false |
| CodeBlock2Expr | 3 | true |
| UnnecessaryToStringCall | 3 | true |
| RegExpRedundantEscape | 2 | false |
| LongLiteralsEndingWithLowercaseL | 2 | false |
| RegExpSimplifiable | 2 | false |
| JavaLangImport | 2 | false |
| ConstantValue | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| KotlinMavenPluginPhase | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 2 | false |
| EnumSwitchStatementWhichMissesCases | 1 | false |
| MagicConstant | 1 | false |
| RedundantArrayCreation | 1 | true |
| ObjectNotify | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| FinalPrivateMethod | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| EmptyMethod | 1 | false |
| DuplicateThrows | 1 | false |
| Java8MapForEach | 1 | false |
| Convert2MethodRef | 1 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 1 | false |
| RedundantCollectionOperation | 1 | false |
| SamePackageImport | 1 | false |
| Anonymous2MethodRef | 1 | false |
| Java8MapApi | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[attrList.size()\]'
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/AuthenticationProviderService.java`
#### Snippet
```java

        // Build LDAP query parameters
        String[] attrArray = attrList.toArray(new String[attrList.size()]);

        Map<String, String> tokens = new HashMap<>();
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[elements.size()\]'
in `guacamole-common/src/main/java/org/apache/guacamole/io/ReaderGuacamoleReader.java`
#### Snippet
```java
        GuacamoleInstruction instruction = new GuacamoleInstruction(
                opcode,
                elements.toArray(new String[elements.size()])
        );

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new ModeledConnection\[connections.size()\]'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/tunnel/RestrictedGuacamoleTunnelService.java`
#### Snippet
```java

        // Sort connections in ascending order of usage
        ModeledConnection[] sortedConnections = connections.toArray(new ModeledConnection[connections.size()]);
        Arrays.sort(sortedConnections, new Comparator<ModeledConnection>() {

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[values.size()\]'
in `guacamole/src/main/java/org/apache/guacamole/rest/APIRequest.java`
#### Snippet
```java

            // Add parameters to map
            this.parameters.put(name, values.toArray(new String[values.size()]));
            
        }
```

## RuleId[id=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (status) { // Generic upstream error case UPSTREAM_ERROR: ...` statement on enum type 'org.apache.guacamole.protocol.GuacamoleStatus' misses cases: 'SUCCESS', 'UNSUPPORTED', 'SERVER_ERROR', ...
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/FailoverGuacamoleSocket.java`
#### Snippet
```java

        // Only handle error instructions related to the upstream remote desktop
        switch (status) {

            // Generic upstream error
            case UPSTREAM_ERROR:
                throw new GuacamoleUpstreamException(args.get(0));

            // Upstream is unreachable
            case UPSTREAM_NOT_FOUND:
                throw new GuacamoleUpstreamNotFoundException(args.get(0));

            // Upstream did not respond
            case UPSTREAM_TIMEOUT:
                throw new GuacamoleUpstreamTimeoutException(args.get(0));

            // Upstream is refusing the connection
            case UPSTREAM_UNAVAILABLE:
                throw new GuacamoleUpstreamUnavailableException(args.get(0));

        }

    }
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/conf/LDAPSSLProtocol.java`
#### Snippet
```java
     *     The string value that will be associated with the enum value.
     */
    private LDAPSSLProtocol(String value) {
        this.STRING_VALUE = value;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/conf/EncryptionMethod.java`
#### Snippet
```java
     *     The default port to associate with this encryption method.
     */
    private EncryptionMethod(int defaultPort) {
        this.DEFAULT_PORT = defaultPort;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/GuacamoleExceptionSupplier.java`
#### Snippet
```java
     *    If an error occurs while attemping to calculate the return value.
     */
    public T get() throws GuacamoleException;

}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-mysql/src/main/java/org/apache/guacamole/auth/mysql/conf/MySQLDriver.java`
#### Snippet
```java
     *     The name of the JDBC driver class.
     */
    private MySQLDriver(String classname) {
        this.driverClass = classname;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/Identifiable.java`
#### Snippet
```java
     *     The identifier to assign.
     */
    public void setIdentifier(String identifier);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/Identifiable.java`
#### Snippet
```java
     *     null.
     */
    public String getIdentifier();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ConnectionRecord.java`
#### Snippet
```java
     *     record.
     */
    public String getConnectionIdentifier();
    
    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ConnectionRecord.java`
#### Snippet
```java
     *     was accessed directly.
     */
    public String getSharingProfileName();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ConnectionRecord.java`
#### Snippet
```java
     */
    @Override
    public default UUID getUUID() {
        return null;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ConnectionRecord.java`
#### Snippet
```java
     *     The name of the connection associated with this connection record.
     */
    public String getConnectionName();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ConnectionRecord.java`
#### Snippet
```java
     *     was accessed directly.
     */
    public String getSharingProfileIdentifier();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/Connectable.java`
#### Snippet
```java
     *     connect is denied.
     */
    public GuacamoleTunnel connect(GuacamoleClientInformation info,
            Map<String, String> tokens) throws GuacamoleException;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/Connectable.java`
#### Snippet
```java
     *     The number of active connections associated with this object.
     */
    public int getActiveConnections();
    
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ConnectionGroup.java`
#### Snippet
```java
     * @return the type of this connection.
     */
    public Type getType();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ConnectionGroup.java`
#### Snippet
```java
     * this ConnectionGroup.
     */
    public String getParentIdentifier();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ConnectionGroup.java`
#### Snippet
```java
     * All legal types of connection group.
     */
    public enum Type {

        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ConnectionGroup.java`
#### Snippet
```java
     * @param type The type of this ConnectionGroup.
     */
    public void setType(Type type);
    
    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ConnectionGroup.java`
#### Snippet
```java
     */

    public Set<String> getConnectionGroupIdentifiers()
            throws GuacamoleException;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ConnectionGroup.java`
#### Snippet
```java
     * ConnectionGroup for this ConnectionGroup.
     */
    public void setParentIdentifier(String parentIdentifier);
    
    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ConnectionGroup.java`
#### Snippet
```java
     *     If an error occurs while retrieving the identifiers.
     */
    public Set<String> getConnectionIdentifiers() throws GuacamoleException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/User.java`
#### Snippet
```java
     * @return A String which may (or may not) be the user's password.
     */
    public String getPassword();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/User.java`
#### Snippet
```java
     * @param password The password to set.
     */
    public void setPassword(String password);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/User.java`
#### Snippet
```java
     * have a "guac-" prefix to avoid such conflicts.
     */
    public static class Attribute {

        /**
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/User.java`
#### Snippet
```java
     * have a "guac-" prefix to avoid such conflicts.
     */
    public static class Attribute {

        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/AuthenticatedUser.java`
#### Snippet
```java
     * anonymously.
     */
    public static final String ANONYMOUS_IDENTIFIER = "";

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/AuthenticatedUser.java`
#### Snippet
```java
     * anonymously.
     */
    public static final String ANONYMOUS_IDENTIFIER = "";

    /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/AuthenticatedUser.java`
#### Snippet
```java
     * anonymously.
     */
    public static final String ANONYMOUS_IDENTIFIER = "";

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ActivityLog.java`
#### Snippet
```java
     * bytes within {@link #getContent()} is unknown.
     */
    public static final long UNKNOWN_SIZE = -1;

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ActivityLog.java`
#### Snippet
```java
     * bytes within {@link #getContent()} is unknown.
     */
    public static final long UNKNOWN_SIZE = -1;

    /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ActivityLog.java`
#### Snippet
```java
     * bytes within {@link #getContent()} is unknown.
     */
    public static final long UNKNOWN_SIZE = -1;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/Shareable.java`
#### Snippet
```java
     *     object is denied.
     */
    public UserCredentials getSharingCredentials(String identifier)
            throws GuacamoleException;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ActivityRecord.java`
#### Snippet
```java

    @Override 
    public default Map<String, String> getAttributes() {
        return Collections.emptyMap();
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ActivityRecord.java`
#### Snippet
```java
     *     activity.
     */
    public String getUsername();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ActivityRecord.java`
#### Snippet
```java
     *     The date and time the activity began.
     */
    public Date getStartDate();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ActivityRecord.java`
#### Snippet
```java
     *     A Map of logs related to this record.
     */
    public default Map<String, ActivityLog> getLogs() {
        return Collections.emptyMap();
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ActivityRecord.java`
#### Snippet
```java
     *     record has no such identifier.
     */
    public default String getIdentifier() {
        UUID uuid = getUUID();
        return uuid != null ? uuid.toString() : null;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ActivityRecord.java`
#### Snippet
```java
     *     false otherwise.
     */
    public boolean isActive();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ActivityRecord.java`
#### Snippet
```java
     *     unique identifier exists.
     */
    public default UUID getUUID() {
        return null;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ActivityRecord.java`
#### Snippet
```java
     *     information is not available.
     */
    public String getRemoteHost();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ActivityRecord.java`
#### Snippet
```java
     *     still ongoing or if the end time is unknown.
     */
    public Date getEndDate();

    /**
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/Directory.java`
#### Snippet
```java
         *     Directory represented by this Directory.Type.
         */
        private Type(Class<? extends Identifiable> objectType) {
            this.objectType = objectType;
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/Directory.java`
#### Snippet
```java
     * interface.
     */
    public enum Type {

        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/Connection.java`
#### Snippet
```java
     * ConnectionGroup for this Connection.
     */
    public void setParentIdentifier(String parentIdentifier);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/Connection.java`
#### Snippet
```java
     * @return The GuacamoleConfiguration associated with this Connection.
     */
    public GuacamoleConfiguration getConfiguration();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/Connection.java`
#### Snippet
```java
     *               Connection.
     */
    public void setConfiguration(GuacamoleConfiguration config);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/Connection.java`
#### Snippet
```java
     * this Connection.
     */
    public String getParentIdentifier();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/Connection.java`
#### Snippet
```java
     *     connection.
     */
    public Set<String> getSharingProfileIdentifiers() throws GuacamoleException;

}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/RelatedObjectSet.java`
#### Snippet
```java
     * An immutable instance of RelatedObjectSEt which contains no objects.
     */
    static final RelatedObjectSet EMPTY_SET = new RelatedObjectSet() {

        @Override
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/RelatedObjectSet.java`
#### Snippet
```java
     * An immutable instance of RelatedObjectSEt which contains no objects.
     */
    static final RelatedObjectSet EMPTY_SET = new RelatedObjectSet() {

        @Override
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/SharingProfile.java`
#### Snippet
```java
     *     connection.
     */
    public void setPrimaryConnectionIdentifier(String identifier);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/SharingProfile.java`
#### Snippet
```java
     *     connection.
     */
    public String getPrimaryConnectionIdentifier();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/SharingProfile.java`
#### Snippet
```java
     *     key/value pairs.
     */
    public void setParameters(Map<String, String> parameters);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/SharingProfile.java`
#### Snippet
```java
     *     key/value pairs.
     */
    public Map<String, String> getParameters();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/permission/Permission.java`
#### Snippet
```java
     * @return The type of operation affected by this permission.
     */
    public Type getType();

}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/permission/SystemPermissionSet.java`
#### Snippet
```java
     * permissions.
     */
    static final SystemPermissionSet EMPTY_SET = new SystemPermissionSet() {

        @Override
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/permission/SystemPermissionSet.java`
#### Snippet
```java
     * permissions.
     */
    static final SystemPermissionSet EMPTY_SET = new SystemPermissionSet() {

        @Override
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/permission/ObjectPermissionSet.java`
#### Snippet
```java
     * permissions.
     */
    static final ObjectPermissionSet EMPTY_SET = new ObjectPermissionSet() {

        @Override
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/permission/ObjectPermissionSet.java`
#### Snippet
```java
     * permissions.
     */
    static final ObjectPermissionSet EMPTY_SET = new ObjectPermissionSet() {

        @Override
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/net/event/DirectoryEvent.java`
#### Snippet
```java
     * DirectoryEvent.
     */
    public enum Operation {

        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/xml/TagHandler.java`
#### Snippet
```java
     *                      correct.
     */
    public void complete(String textContent) throws SAXException;

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/xml/TagHandler.java`
#### Snippet
```java
     *                      from being initialized.
     */
    public void init(Attributes attributes) throws SAXException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/xml/TagHandler.java`
#### Snippet
```java
     *                      from being constructed for the child element.
     */
    public TagHandler childElement(String localName)
            throws SAXException;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/properties/GuacamoleProperty.java`
#### Snippet
```java
     *                            provided value.
     */
    public Type parseValue(String value) throws GuacamoleException;

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/properties/GuacamoleProperty.java`
#### Snippet
```java
     *         GuacamoleProperty will parse.
     */
    public String getName();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/Environment.java`
#### Snippet
```java
     *     Environment does not support this operation.
     */
    public default void addGuacamoleProperties(GuacamoleProperties properties)
            throws GuacamoleException {
        throw new GuacamoleUnsupportedException(String.format("%s does not "
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/Environment.java`
#### Snippet
```java
     *                            guacamole.properties.
     */
    public <Type> Type getProperty(GuacamoleProperty<Type> property,
            Type defaultValue) throws GuacamoleException;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/Environment.java`
#### Snippet
```java
     * Whether guacd requires SSL/TLS on connections.
     */
    public static final BooleanGuacamoleProperty GUACD_SSL = new BooleanGuacamoleProperty() {

        @Override
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/Environment.java`
#### Snippet
```java
     * Whether guacd requires SSL/TLS on connections.
     */
    public static final BooleanGuacamoleProperty GUACD_SSL = new BooleanGuacamoleProperty() {

        @Override
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/Environment.java`
#### Snippet
```java
     * Whether guacd requires SSL/TLS on connections.
     */
    public static final BooleanGuacamoleProperty GUACD_SSL = new BooleanGuacamoleProperty() {

        @Override
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/Environment.java`
#### Snippet
```java
     *                            not specified.
     */
    public <Type> Type getRequiredProperty(GuacamoleProperty<Type> property)
            throws GuacamoleException;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/Environment.java`
#### Snippet
```java
     * running.
     */
    public static final StringGuacamoleProperty GUACD_HOSTNAME = new StringGuacamoleProperty() {

        @Override
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/Environment.java`
#### Snippet
```java
     * running.
     */
    public static final StringGuacamoleProperty GUACD_HOSTNAME = new StringGuacamoleProperty() {

        @Override
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/Environment.java`
#### Snippet
```java
     * running.
     */
    public static final StringGuacamoleProperty GUACD_HOSTNAME = new StringGuacamoleProperty() {

        @Override
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/Environment.java`
#### Snippet
```java
     *     If the connection information for guacd cannot be retrieved.
     */
    public GuacamoleProxyConfiguration getDefaultGuacamoleProxyConfiguration()
            throws GuacamoleException;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/Environment.java`
#### Snippet
```java
     *         or may not exist, and may turn out to not be a directory.
     */
    public File getGuacamoleHome();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/Environment.java`
#### Snippet
```java
     * The port that guacd (the Guacamole proxy server) is listening on.
     */
    public static final IntegerGuacamoleProperty GUACD_PORT = new IntegerGuacamoleProperty() {

        @Override
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/Environment.java`
#### Snippet
```java
     * The port that guacd (the Guacamole proxy server) is listening on.
     */
    public static final IntegerGuacamoleProperty GUACD_PORT = new IntegerGuacamoleProperty() {

        @Override
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/Environment.java`
#### Snippet
```java
     * The port that guacd (the Guacamole proxy server) is listening on.
     */
    public static final IntegerGuacamoleProperty GUACD_PORT = new IntegerGuacamoleProperty() {

        @Override
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/Environment.java`
#### Snippet
```java
     * @return A map of all available protocols.
     */
    public Map<String, ProtocolInfo> getProtocols();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/Environment.java`
#### Snippet
```java
     *         protocol is registered.
     */
    public ProtocolInfo getProtocol(String name);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/Environment.java`
#### Snippet
```java
     *                            guacamole.properties.
     */
    public <Type> Type getProperty(GuacamoleProperty<Type> property)
            throws GuacamoleException;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-common/src/main/java/org/apache/guacamole/io/GuacamoleWriter.java`
#### Snippet
```java
     *                            portion of the array specified.
     */
    public void write(char[] chunk, int off, int len) throws GuacamoleException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-common/src/main/java/org/apache/guacamole/io/GuacamoleWriter.java`
#### Snippet
```java
     *                            instruction.
     */
    public void writeInstruction(GuacamoleInstruction instruction) throws GuacamoleException;

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-common/src/main/java/org/apache/guacamole/io/GuacamoleWriter.java`
#### Snippet
```java
     *                            the specified array.
     */
    public void write(char[] chunk) throws GuacamoleException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-common/src/main/java/org/apache/guacamole/io/GuacamoleReader.java`
#### Snippet
```java
     *                            parsed.
     */
    public GuacamoleInstruction readInstruction() throws GuacamoleException;

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-common/src/main/java/org/apache/guacamole/io/GuacamoleReader.java`
#### Snippet
```java
     *                            available data.
     */
    public boolean available() throws GuacamoleException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-common/src/main/java/org/apache/guacamole/io/GuacamoleReader.java`
#### Snippet
```java
     *                            stream.
     */
    public char[] read() throws GuacamoleException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-common/src/main/java/org/apache/guacamole/net/GuacamoleSocket.java`
#### Snippet
```java
     * @return true if this GuacamoleSocket is open, false otherwise.
     */
    public boolean isOpen();

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-common/src/main/java/org/apache/guacamole/net/GuacamoleSocket.java`
#### Snippet
```java
     *     not available.
     */
    public default String getProtocol() {
        return null;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-common/src/main/java/org/apache/guacamole/net/GuacamoleSocket.java`
#### Snippet
```java
     *         Guacamole instruction stream.
     */
    public GuacamoleReader getReader();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-common/src/main/java/org/apache/guacamole/net/GuacamoleSocket.java`
#### Snippet
```java
     *         Guacamole instruction stream.
     */
    public GuacamoleWriter getWriter();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-common/src/main/java/org/apache/guacamole/net/GuacamoleSocket.java`
#### Snippet
```java
     * @throws GuacamoleException If an error occurs while releasing resources.
     */
    public void close() throws GuacamoleException;

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `guacamole-common/src/main/java/org/apache/guacamole/net/GuacamoleTunnel.java`
#### Snippet
```java
     * transmit the tunnel UUID.
     */
    static final String INTERNAL_DATA_OPCODE = "";

    /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `guacamole-common/src/main/java/org/apache/guacamole/net/GuacamoleTunnel.java`
#### Snippet
```java
     * transmit the tunnel UUID.
     */
    static final String INTERNAL_DATA_OPCODE = "";

    /**
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/GuacamoleProtocolCapability.java`
#### Snippet
```java
     *     capability.
     */
    private GuacamoleProtocolCapability(GuacamoleProtocolVersion version) {
        this.version = version;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/GuacamoleFilter.java`
#### Snippet
```java
     *                            denied.
     */
    public GuacamoleInstruction filter(GuacamoleInstruction instruction) throws GuacamoleException;
    
}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/GuacamoleStatus.java`
#### Snippet
```java
     * @param guac_code The Guacamole protocol status code.
     */
    private GuacamoleStatus(int http_code, int websocket_code, int guac_code) {
        this.http_code = http_code;
        this.websocket_code = websocket_code;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `guacamole-ext/src/main/java/org/apache/guacamole/properties/EnumGuacamoleProperty.java`
#### Snippet
```java
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public static @interface PropertyValue {

        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/guacamole-vault/modules/guacamole-vault-base/src/main/java/org/apache/guacamole/vault/conf/VaultAttributeService.java`
#### Snippet
```java
     *     admin UI for the current vault implementation.
     */
    public Collection<Form> getConnectionAttributes();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/guacamole-vault/modules/guacamole-vault-base/src/main/java/org/apache/guacamole/vault/conf/VaultAttributeService.java`
#### Snippet
```java
     *     preferences UI for the current vault implementation.
     */
    public Collection<Form> getUserPreferenceAttributes();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/guacamole-vault/modules/guacamole-vault-base/src/main/java/org/apache/guacamole/vault/conf/VaultAttributeService.java`
#### Snippet
```java
     *     admin UI for the current vault implementation.
     */
    public Collection<Form> getConnectionGroupAttributes();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/guacamole-vault/modules/guacamole-vault-base/src/main/java/org/apache/guacamole/vault/conf/VaultAttributeService.java`
#### Snippet
```java
     *     the current vault implementation.
     */
    public Collection<Form> getUserAttributes();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/AuthenticationProviderService.java`
#### Snippet
```java
     *     credentials are invalid or expired.
     */
    public UserContext getUserContext(AuthenticationProvider authenticationProvider,
            AuthenticatedUser authenticatedUser) throws GuacamoleException;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/AuthenticationProviderService.java`
#### Snippet
```java
     *     credentials are invalid or expired.
     */
    public UserContext updateUserContext(AuthenticationProvider authenticationProvider,
            UserContext context, AuthenticatedUser authenticatedUser,
            Credentials credentials) throws GuacamoleException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/AuthenticationProviderService.java`
#### Snippet
```java
     *     If the an error occurs during decoration of the UserContext.
     */
    public UserContext decorateUserContext(AuthenticationProvider authenticationProvider,
            UserContext context, AuthenticatedUser authenticatedUser,
            Credentials credentials) throws GuacamoleException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/AuthenticationProviderService.java`
#### Snippet
```java
     *     credentials are invalid or expired.
     */
    public AuthenticatedUser authenticateUser(AuthenticationProvider authenticationProvider,
            Credentials credentials) throws GuacamoleException;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/tunnel/GuacamoleTunnelService.java`
#### Snippet
```java
     *     currently-active connections.
     */
    public Collection<ActiveConnectionRecord> getActiveConnections(Connection connection);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/tunnel/GuacamoleTunnelService.java`
#### Snippet
```java
     *     currently-active connections.
     */
    public Collection<ActiveConnectionRecord> getActiveConnections(ConnectionGroup connectionGroup);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/tunnel/GuacamoleTunnelService.java`
#### Snippet
```java
     *     permission is denied.
     */
    public Collection<ActiveConnectionRecord> getActiveConnections(ModeledAuthenticatedUser user)
            throws GuacamoleException;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/ShareKeyGenerator.java`
#### Snippet
```java
     *     The new share key.
     */
    public String getShareKey();

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/SharedConnectionMap.java`
#### Snippet
```java
     *     null if no such share key exists.
     */
    public SharedConnectionDefinition get(String key);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/SharedConnectionMap.java`
#### Snippet
```java
     *     shared.
     */
    public void add(SharedConnectionDefinition definition);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/SharedConnectionMap.java`
#### Snippet
```java
     *     removed.
     */
    public SharedConnectionDefinition remove(String key);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/security/PasswordEncryptionService.java`
#### Snippet
```java
     *     The generated password hash.
     */
    public byte[] createPasswordHash(String password, byte[] salt);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/security/SaltService.java`
#### Snippet
```java
     * @return a new salt for password encryption.
     */
    public byte[] generateSalt();
}

```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `extensions/guacamole-auth-totp/src/main/java/org/apache/guacamole/totp/TOTPGenerator.java`
#### Snippet
```java
         *     in bytes.
         */
        private Mode(String algorithmName, int recommendedKeyLength) {
            this.algorithmName = algorithmName;
            this.recommendedKeyLength = recommendedKeyLength;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `guacamole/src/main/java/org/apache/guacamole/auth/file/Authorization.java`
#### Snippet
```java
     * All supported password encodings.
     */
    public static enum Encoding {

        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/TokenSessionMap.java`
#### Snippet
```java
     * any resources.
     */
    public void shutdown();
    
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/TokenSessionMap.java`
#### Snippet
```java
     *         represents a currently logged in user, null otherwise.
     */
    public GuacamoleSession remove(String authToken);
    
    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/TokenSessionMap.java`
#### Snippet
```java
     *         represents a currently logged in user, null otherwise.
     */
    public GuacamoleSession get(String authToken);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/TokenSessionMap.java`
#### Snippet
```java
     * @param session The GuacamoleSession for the logged in user.
     */
    public void put(String authToken, GuacamoleSession session);
    
    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/AuthTokenGenerator.java`
#### Snippet
```java
     * @return A new auth token.
     */
    public String getToken();

}
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `guacamole/src/main/java/org/apache/guacamole/rest/RequestSizeFilter.java`
#### Snippet
```java
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public static @interface DoNotLimit {}

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `guacamole/src/main/java/org/apache/guacamole/tunnel/TunnelLoader.java`
#### Snippet
```java
     *         without errors, false otherwise.
     */
    public boolean isSupported();

}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `guacamole/src/main/java/org/apache/guacamole/tunnel/TunnelRequestType.java`
#### Snippet
```java
     *     object.
     */
    private TunnelRequestType(String value, String name) {
        PARAMETER_VALUE = value;
        NAME = name;
```

## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: Calendar.JANUARY, Calendar.FEBRUARY, Calendar.MARCH, Calendar.APRIL, Calendar.MAY, ...
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ActivityRecordSearchTerm.java`
#### Snippet
```java
            startCalendar.set(
                Integer.parseInt(year),
                parseInt(month, 1) - 1,
                parseInt(day,   1)
            );
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of field `elements`
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/GuacamoleParser.java`
#### Snippet
```java
     * All currently parsed elements.
     */
    private final String elements[] = new String[INSTRUCTION_MAX_ELEMENTS];

    /**
```

### CStyleArrayDeclaration
C-style array declaration of parameter `chunk`
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/GuacamoleParser.java`
#### Snippet
```java
     * @throws GuacamoleException If an error occurs while parsing the new data.
     */   
    public int append(char chunk[]) throws GuacamoleException {
        return append(chunk, 0, chunk.length);
    }
```

### CStyleArrayDeclaration
C-style array declaration of parameter `chunk`
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/GuacamoleParser.java`
#### Snippet
```java
     * @throws GuacamoleException If an error occurs while parsing the new data.
     */
    public int append(char chunk[], int offset, int length) throws GuacamoleException {

        int charsParsed = 0;
```

### CStyleArrayDeclaration
C-style array declaration of field `HEX_CHARS`
in `guacamole/src/main/java/org/apache/guacamole/auth/file/Authorization.java`
#### Snippet
```java
     * Lookup table of hex bytes characters by value.
     */
    private static final char HEX_CHARS[] = {
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
```

### CStyleArrayDeclaration
C-style array declaration of local variable `buffer`
in `guacamole/src/main/java/org/apache/guacamole/rest/patch/PatchRESTService.java`
#### Snippet
```java
        try {

            char buffer[] = new char[8192];
            int length;

```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `guacamole-ext/src/main/java/org/apache/guacamole/token/TokenFilter.java`
#### Snippet
```java
     * entire token itself.
     */
    private final Pattern tokenPattern = Pattern.compile("(.*?)(^|.)(\\$\\{([A-Za-z0-9_]*)(\\:(.*))?\\})");

    /**
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `guacamole-ext/src/main/java/org/apache/guacamole/token/TokenFilter.java`
#### Snippet
```java
     * entire token itself.
     */
    private final Pattern tokenPattern = Pattern.compile("(.*?)(^|.)(\\$\\{([A-Za-z0-9_]*)(\\:(.*))?\\})");

    /**
```

## RuleId[id=LongLiteralsEndingWithLowercaseL]
### LongLiteralsEndingWithLowercaseL
'long' literal `1000l` ends with lowercase 'l'
in `guacamole-common/src/main/java/org/apache/guacamole/servlet/GuacamoleHTTPTunnelMap.java`
#### Snippet
```java
        // Check for unused tunnels every few seconds
        executor.scheduleAtFixedRate(
            new TunnelTimeoutTask(TUNNEL_TIMEOUT * 1000l),
            TUNNEL_TIMEOUT, TUNNEL_TIMEOUT, TimeUnit.SECONDS);

```

### LongLiteralsEndingWithLowercaseL
'long' literal `60000l` ends with lowercase 'l'
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/HashTokenSessionMap.java`
#### Snippet
```java
        // Check for expired sessions every minute
        logger.info("Sessions will expire after {} minutes of inactivity.", sessionTimeoutValue);
        executor.scheduleAtFixedRate(new SessionEvictionTask(sessionTimeoutValue * 60000l), 1, 1, TimeUnit.MINUTES);
        
    }
```

## RuleId[id=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/WebSocketTunnelModule.java`
#### Snippet
```java
                ServerEndpointConfig.Builder.create(RestrictedGuacamoleWebSocketTunnelEndpoint.class, "/websocket-tunnel")
                                            .configurator(new RestrictedGuacamoleWebSocketTunnelEndpoint.Configurator(tunnelRequestServiceProvider))
                                            .subprotocols(Arrays.asList(new String[]{"guacamole"}))
                                            .build();

```

## RuleId[id=ObjectNotify]
### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `guacamole/src/main/java/org/apache/guacamole/tunnel/InterceptedStreamMap.java`
#### Snippet
```java
        // Notify waiting threads that the stream has ended
        synchronized (stream) {
            stream.notify();
        }

```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `AuthenticationService` on 'this' is unnecessary in this context
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/AuthenticationService.java`
#### Snippet
```java

        // Otherwise, attempt authentication as a new user
        AuthenticatedUser authenticatedUser = AuthenticationService.this.authenticateUser(credentials);
        return authenticatedUser;

```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-cas/src/main/java/org/apache/guacamole/auth/cas/ticket/TicketValidationService.java`
#### Snippet
```java
     *     If unable to get Guacamole configuration data
     */
    private final String decryptPassword(String encryptedPassword)
            throws GuacamoleException {

```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`\\p{Digit}` can be simplified to '\\d'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/security/PasswordPolicyService.java`
#### Snippet
```java
     */
    private final Pattern CONTAINS_NON_ALPHANUMERIC =
            Pattern.compile("[^\\p{javaLowerCase}\\p{javaUpperCase}\\p{Digit}]");

    /**
```

### RegExpSimplifiable
`\\p{Digit}` can be simplified to '\\d'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/security/PasswordPolicyService.java`
#### Snippet
```java
     * numeric character.
     */
    private final Pattern CONTAINS_DIGIT = Pattern.compile("\\p{Digit}");

    /**
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `AbstractSharingProfile` has no concrete subclass
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/AbstractSharingProfile.java`
#### Snippet
```java
 * Guacamole connection.
 */
public abstract class AbstractSharingProfile implements SharingProfile {

    /**
```

### AbstractClassNeverImplemented
Abstract class `AbstractActiveConnection` has no concrete subclass
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/AbstractActiveConnection.java`
#### Snippet
```java
 * getters/setters for its main properties.
 */
public abstract class AbstractActiveConnection extends AbstractIdentifiable
        implements ActiveConnection {

```

### AbstractClassNeverImplemented
Abstract class `CachedVaultSecretService` has no concrete subclass
in `extensions/guacamole-vault/modules/guacamole-vault-base/src/main/java/org/apache/guacamole/vault/secret/CachedVaultSecretService.java`
#### Snippet
```java
 * which is missing from the cache or has expired.
 */
public abstract class CachedVaultSecretService implements VaultSecretService {

    /**
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Connection`
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserData.java`
#### Snippet
```java
     *     connection.
     */
    public void setConnections(Map<String, Connection> connections) {
        this.connections = new ConcurrentHashMap<>(connections);
    }
```

### BoundedWildcard
Can generalize to `? extends GuacamoleTunnel`
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/connection/ConnectionService.java`
#### Snippet
```java
     *     The Collection of tunnels to close.
     */
    private void closeAll(Collection<GuacamoleTunnel> tunnels) {

        for (GuacamoleTunnel tunnel : tunnels) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/conf/JacksonLDAPConfiguration.java`
#### Snippet
```java
     *     If an error occurs while producing/retrieving the default value.
     */
    private <T> T withDefault(T value, DefaultSupplier<T> defaultValue)
            throws GuacamoleException {
        return value != null ? value : defaultValue.get();
```

### BoundedWildcard
Can generalize to `? extends T`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/conf/JacksonLDAPConfiguration.java`
#### Snippet
```java
     *     If an error occurs while producing/retrieving the default value.
     */
    private <T> T withDefault(GuacamoleProperty<T> property, String value,
            DefaultSupplier<T> defaultValue)
            throws GuacamoleException {
```

### BoundedWildcard
Can generalize to `? extends Entry`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/ObjectQueryService.java`
#### Snippet
```java
     */
    public <ObjectType extends Identifiable> Map<String, ObjectType>
        asMap(List<Entry> entries, Function<Entry, ObjectType> mapper) {

        // Convert each entry to the corresponding Guacamole API object
```

### BoundedWildcard
Can generalize to `? super Entry`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/ObjectQueryService.java`
#### Snippet
```java
     */
    public <ObjectType extends Identifiable> Map<String, ObjectType>
        asMap(List<Entry> entries, Function<Entry, ObjectType> mapper) {

        // Convert each entry to the corresponding Guacamole API object
```

### BoundedWildcard
Can generalize to `? extends ObjectType`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/ObjectQueryService.java`
#### Snippet
```java
     */
    public <ObjectType extends Identifiable> Map<String, ObjectType>
        asMap(List<Entry> entries, Function<Entry, ObjectType> mapper) {

        // Convert each entry to the corresponding Guacamole API object
```

### BoundedWildcard
Can generalize to `? extends Future`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmClient.java`
#### Snippet
```java
    public Future<String> getSecret(
            String notation,
            @Nullable GuacamoleExceptionSupplier<Future<String>> fallbackFunction)
            throws GuacamoleException {
        validateCache();
```

### BoundedWildcard
Can generalize to `? super String`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingConnectionGroup.java`
#### Snippet
```java
     *     If the applicable tokens cannot be generated.
     */
    protected void addTokens(Map<String, String> tokens) throws GuacamoleException {
        tokens.putAll(getTokens());
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingConnectionGroup.java`
#### Snippet
```java
     *     If the applicable tokens cannot be generated.
     */
    protected void addTokens(Map<String, String> tokens) throws GuacamoleException {
        tokens.putAll(getTokens());
    }
```

### BoundedWildcard
Can generalize to `? extends KeeperRecordField`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked") // Manually verified with isAssignableFrom()
    private <T extends KeeperRecordField> T getField(List<KeeperRecordField> fields,
            Class<T> fieldClass, Pattern labelPattern) {

```

### BoundedWildcard
Can generalize to `? extends T`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java
     *     multiple values.
     */
    private <T, R> R getSingleValue(List<T> values, Function<T, R> mapper) {

        T value = getSingleValue(values);
```

### BoundedWildcard
Can generalize to `? super T`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java
     *     multiple values.
     */
    private <T, R> R getSingleValue(List<T> values, Function<T, R> mapper) {

        T value = getSingleValue(values);
```

### BoundedWildcard
Can generalize to `? super String`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmSecretService.java`
#### Snippet
```java
     *     If configuration details in guacamole.properties cannot be parsed.
     */
    private void addRecordTokens(Map<String, Future<String>> tokens, String prefix,
            KeeperRecord record) throws GuacamoleException {

```

### BoundedWildcard
Can generalize to `? super Future`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmSecretService.java`
#### Snippet
```java
     *     If configuration details in guacamole.properties cannot be parsed.
     */
    private void addRecordTokens(Map<String, Future<String>> tokens, String prefix,
            KeeperRecord record) throws GuacamoleException {

```

### BoundedWildcard
Can generalize to `? super String`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingConnection.java`
#### Snippet
```java
     *     If the applicable tokens cannot be generated.
     */
    protected void addTokens(Map<String, String> tokens) throws GuacamoleException {
        tokens.putAll(getTokens());
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingConnection.java`
#### Snippet
```java
     *     If the applicable tokens cannot be generated.
     */
    protected void addTokens(Map<String, String> tokens) throws GuacamoleException {
        tokens.putAll(getTokens());
    }
```

### BoundedWildcard
Can generalize to `? extends ConnectionGroup`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleConnectionGroupDirectory.java`
#### Snippet
```java
     *               connection group directory.
     */
    public SimpleConnectionGroupDirectory(Collection<ConnectionGroup> groups) {

        // Add all given groups
```

### BoundedWildcard
Can generalize to `? extends Connection`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleConnectionDirectory.java`
#### Snippet
```java
     *     connection directory.
     */
    public SimpleConnectionDirectory(Collection<Connection> connections) {

        // Add all given connections
```

### BoundedWildcard
Can generalize to `? extends Field`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/credentials/CredentialsInfo.java`
#### Snippet
```java
     *     The fields to require.
     */
    public CredentialsInfo(Collection<Field> fields) {
        this.fields = fields;
    }
```

### BoundedWildcard
Can generalize to `? extends ObjectType`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleDirectory.java`
#### Snippet
```java
     *     A Collection of all objects that should be present in this directory.
     */
    public SimpleDirectory(Collection<ObjectType> objects) {
        this.objects = new HashMap<String, ObjectType>(objects.size());
        for (ObjectType object : objects)
```

### BoundedWildcard
Can generalize to `? super ObjectPermission`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleUser.java`
#### Snippet
```java
     *     permission added to the given set.
     */
    private void addReadPermissions(Set<ObjectPermission> permissions,
            Collection<String> identifiers) {

```

### BoundedWildcard
Can generalize to `? super String`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingUserContext.java`
#### Snippet
```java
     */
    protected void addTokens(ConnectionGroup connectionGroup,
            Map<String, String> tokens) throws GuacamoleException {
        tokens.putAll(getTokens(connectionGroup));
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingUserContext.java`
#### Snippet
```java
     */
    protected void addTokens(ConnectionGroup connectionGroup,
            Map<String, String> tokens) throws GuacamoleException {
        tokens.putAll(getTokens(connectionGroup));
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingUserContext.java`
#### Snippet
```java
     *     generated.
     */
    protected void addTokens(Connection connection, Map<String, String> tokens)
            throws GuacamoleException {
        tokens.putAll(getTokens(connection));
```

### BoundedWildcard
Can generalize to `? super String`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingUserContext.java`
#### Snippet
```java
     *     generated.
     */
    protected void addTokens(Connection connection, Map<String, String> tokens)
            throws GuacamoleException {
        tokens.putAll(getTokens(connection));
```

### BoundedWildcard
Can generalize to `? extends Type`
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/LocalEnvironment.java`
#### Snippet
```java

    @Override
    public <Type> Type getProperty(GuacamoleProperty<Type> property,
            Type defaultValue) throws GuacamoleException {

```

### BoundedWildcard
Can generalize to `? extends T`
in `guacamole-ext/src/main/java/org/apache/guacamole/properties/EnumGuacamoleProperty.java`
#### Snippet
```java
     *     with their corresponding enum constants.
     */
    private static <T extends Enum<T>> Map<String, T> getValueMapping(Class<T> enumClass) {

        T[] values = enumClass.getEnumConstants();
```

### BoundedWildcard
Can generalize to `? extends T`
in `guacamole-ext/src/main/java/org/apache/guacamole/properties/EnumGuacamoleProperty.java`
#### Snippet
```java
     *     constants.
     */
    public EnumGuacamoleProperty(Map<String, T> valueMapping) {
        this.valueMapping = valueMapping;
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `extensions/guacamole-history-recording-storage/src/main/java/org/apache/guacamole/history/connection/HistoryConnectionRecord.java`
#### Snippet
```java
     *     The file to produce an ActivityLog instance for.
     */
    private void addActivityLog(Map<String, ActivityLog> logs, File file) {

        ActivityLog log = getActivityLog(file);
```

### BoundedWildcard
Can generalize to `? super ActivityLog`
in `extensions/guacamole-history-recording-storage/src/main/java/org/apache/guacamole/history/connection/HistoryConnectionRecord.java`
#### Snippet
```java
     *     The file to produce an ActivityLog instance for.
     */
    private void addActivityLog(Map<String, ActivityLog> logs, File file) {

        ActivityLog log = getActivityLog(file);
```

### BoundedWildcard
Can generalize to `? extends ArbitraryAttributeModel`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ArbitraryAttributeMap.java`
#### Snippet
```java
     *     the given collection of model objects.
     */
    public static ArbitraryAttributeMap fromModelCollection(Collection<ArbitraryAttributeModel> models) {

        // Add all name/value pairs from the given collection to the map
```

### BoundedWildcard
Can generalize to `? extends ModelType`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ModeledDirectoryObjectService.java`
#### Snippet
```java
     */
    protected Collection<InternalType> getObjectInstances(ModeledAuthenticatedUser currentUser,
            Collection<ModelType> models) throws GuacamoleException {

        // Create new collection of objects by manually converting each model
```

### BoundedWildcard
Can generalize to `? extends ActivityRecordModel`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/UserService.java`
#### Snippet
```java
     *     in the given list.
     */
    protected List<ActivityRecord> getObjectInstances(List<ActivityRecordModel> models) {

        // Create new list of records by manually converting each model
```

### BoundedWildcard
Can generalize to `? super String`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/usergroup/ModeledUserGroup.java`
#### Snippet
```java
     *     The Map to store all restricted attributes within.
     */
    private void putRestrictedAttributes(Map<String, String> attributes) {

        // Set disabled attribute
```

### BoundedWildcard
Can generalize to `? super String`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/usergroup/ModeledUserGroup.java`
#### Snippet
```java
     *     The Map to store all restricted attributes within.
     */
    private void putRestrictedAttributes(Map<String, String> attributes) {

        // Set disabled attribute
```

### BoundedWildcard
Can generalize to `? super String`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/ModeledUser.java`
#### Snippet
```java
     *     The Map to store all unrestricted attributes within.
     */
    private void putUnrestrictedAttributes(Map<String, String> attributes) {

        // Set full name attribute
```

### BoundedWildcard
Can generalize to `? super String`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/ModeledUser.java`
#### Snippet
```java
     *     The Map to store all unrestricted attributes within.
     */
    private void putUnrestrictedAttributes(Map<String, String> attributes) {

        // Set full name attribute
```

### BoundedWildcard
Can generalize to `? super String`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/ModeledUser.java`
#### Snippet
```java
     *     The Map to store all restricted attributes within.
     */
    private void putRestrictedAttributes(Map<String, String> attributes) {

        // Set disabled attribute
```

### BoundedWildcard
Can generalize to `? super String`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/ModeledUser.java`
#### Snippet
```java
     *     The Map to store all restricted attributes within.
     */
    private void putRestrictedAttributes(Map<String, String> attributes) {

        // Set disabled attribute
```

### BoundedWildcard
Can generalize to `? extends PermissionType`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/permission/ModeledPermissionService.java`
#### Snippet
```java
    protected Collection<ModelType> getModelInstances(
            ModeledPermissions<? extends EntityModel> targetEntity,
            Collection<PermissionType> permissions) {

        // Create new collection of models by manually converting each permission
```

### BoundedWildcard
Can generalize to `? extends ModelType`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/permission/ModeledPermissionService.java`
#### Snippet
```java
     *     collection.
     */
    protected Set<PermissionType> getPermissionInstances(Collection<ModelType> models) {

        // Create new collection of permissions by manually converting each model
```

### BoundedWildcard
Can generalize to `? extends ConnectionRecordModel`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connection/ConnectionService.java`
#### Snippet
```java
     *     in the given list.
     */
    protected List<ConnectionRecord> getObjectInstances(List<ConnectionRecordModel> models) {

        // Create new list of records by manually converting each model
```

### BoundedWildcard
Can generalize to `? extends ObjectPermission`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/permission/ModeledObjectPermissionService.java`
#### Snippet
```java
    protected boolean canAlterPermissions(ModeledAuthenticatedUser user,
            ModeledPermissions<? extends EntityModel> targetEntity,
            Collection<ObjectPermission> permissions)
            throws GuacamoleException {

```

### BoundedWildcard
Can generalize to `? super String`
in `extensions/guacamole-auth-totp/src/main/java/org/apache/guacamole/auth/totp/user/TOTPUser.java`
#### Snippet
```java

    @Override
    public void setAttributes(Map<String, String> attributes) {

        // Create independent, mutable copy of attributes
```

### BoundedWildcard
Can generalize to `? extends DecoratedUserContext`
in `guacamole/src/main/java/org/apache/guacamole/GuacamoleSession.java`
#### Snippet
```java
     *     The List of UserContexts to associate with this session.
     */
    public void setUserContexts(List<DecoratedUserContext> userContexts) {
        this.access();
        this.userContexts = userContexts;
```

### BoundedWildcard
Can generalize to `? extends DecoratedUserContext`
in `guacamole/src/main/java/org/apache/guacamole/GuacamoleSession.java`
#### Snippet
```java
    public GuacamoleSession(ListenerService listenerService,
            AuthenticatedUser authenticatedUser,
            List<DecoratedUserContext> userContexts)
            throws GuacamoleException {
        this.lastAccessedTime = System.currentTimeMillis();
```

### BoundedWildcard
Can generalize to `? extends Form`
in `guacamole/src/main/java/org/apache/guacamole/rest/directory/DirectoryObjectTranslator.java`
#### Snippet
```java
     *     the given schema.
     */
    public Map<String, String> filterAttributes(Collection<Form> schema,
            Map<String, String> attributes) {

```

### BoundedWildcard
Can generalize to `? extends InternalRecordType`
in `guacamole/src/main/java/org/apache/guacamole/rest/history/ActivityRecordSetResource.java`
#### Snippet
```java
     *     The ActivityRecordSet whose records should be exposed.
     */
    public ActivityRecordSetResource(ActivityRecordSet<InternalRecordType> history) {
        this.history = history;
    }
```

### BoundedWildcard
Can generalize to `? extends APISortPredicate`
in `guacamole/src/main/java/org/apache/guacamole/rest/history/ActivityRecordSetResource.java`
#### Snippet
```java
     */
    private void applyCriteria(List<String> requiredContents,
            List<APISortPredicate> sortPredicates) throws GuacamoleException {

        // Restrict to records which contain the specified strings
```

### BoundedWildcard
Can generalize to `? extends InternalType`
in `guacamole/src/main/java/org/apache/guacamole/rest/directory/DirectoryObjectResource.java`
#### Snippet
```java
     */
    public DirectoryObjectResource(AuthenticatedUser authenticatedUser,
            UserContext userContext, Class<InternalType> internalType,
            Directory<InternalType> directory, InternalType object,
            DirectoryObjectTranslator<InternalType, ExternalType> translator) {
```

### BoundedWildcard
Can generalize to `? super InternalType`
in `guacamole/src/main/java/org/apache/guacamole/rest/directory/DirectoryObjectResource.java`
#### Snippet
```java
            UserContext userContext, Class<InternalType> internalType,
            Directory<InternalType> directory, InternalType object,
            DirectoryObjectTranslator<InternalType, ExternalType> translator) {
        this.authenticatedUser = authenticatedUser;
        this.userContext = userContext;
```

### BoundedWildcard
Can generalize to `? extends APIPatch`
in `guacamole/src/main/java/org/apache/guacamole/rest/identifier/RelatedObjectSetResource.java`
#### Snippet
```java
     */
    @PATCH
    public void patchObjects(List<APIPatch<String>> patches)
            throws GuacamoleException {

```

### BoundedWildcard
Can generalize to `? extends APIPatch`
in `guacamole/src/main/java/org/apache/guacamole/rest/permission/PermissionSetResource.java`
#### Snippet
```java
     */
    @PATCH
    public void patchPermissions(List<APIPatch<String>> patches)
            throws GuacamoleException {

```

### BoundedWildcard
Can generalize to `? extends InternalType`
in `guacamole/src/main/java/org/apache/guacamole/rest/directory/DirectoryResource.java`
#### Snippet
```java
     */
    public DirectoryResource(AuthenticatedUser authenticatedUser,
            UserContext userContext, Class<InternalType> internalType,
            Directory<InternalType> directory,
            DirectoryObjectTranslator<InternalType, ExternalType> translator,
```

### BoundedWildcard
Can generalize to `? extends APIPatch`
in `guacamole/src/main/java/org/apache/guacamole/rest/directory/DirectoryResource.java`
#### Snippet
```java
     */
    @PATCH
    public void patchObjects(List<APIPatch<String>> patches)
            throws GuacamoleException {

```

### BoundedWildcard
Can generalize to `? extends Connection`
in `guacamole/src/main/java/org/apache/guacamole/rest/connectiongroup/ConnectionGroupTree.java`
#### Snippet
```java
     *     If an error occurs while retrieving the descendants.
     */
    private void addConnectionDescendants(Collection<Connection> connections,
            List<ObjectPermission.Type> permissions)
        throws GuacamoleException {
```

### BoundedWildcard
Can generalize to `? extends Connection`
in `guacamole/src/main/java/org/apache/guacamole/rest/connectiongroup/ConnectionGroupTree.java`
#### Snippet
```java
     *     If an error occurs while adding the connection to the tree.
     */
    private void addConnections(Collection<Connection> connections)
        throws GuacamoleException {

```

### BoundedWildcard
Can generalize to `? extends ConnectionGroup`
in `guacamole/src/main/java/org/apache/guacamole/rest/connectiongroup/ConnectionGroupTree.java`
#### Snippet
```java
     *     If an error occurs while retrieving the descendants.
     */
    private void addConnectionGroupDescendants(Collection<ConnectionGroup> parents,
            List<ObjectPermission.Type> permissions)
        throws GuacamoleException {
```

### BoundedWildcard
Can generalize to `? extends SharingProfile`
in `guacamole/src/main/java/org/apache/guacamole/rest/connectiongroup/ConnectionGroupTree.java`
#### Snippet
```java
     *     If an error occurs while adding the sharing profiles to the tree.
     */
    private void addSharingProfiles(Collection<SharingProfile> sharingProfiles)
        throws GuacamoleException {

```

### BoundedWildcard
Can generalize to `? extends ConnectionGroup`
in `guacamole/src/main/java/org/apache/guacamole/rest/connectiongroup/ConnectionGroupTree.java`
#### Snippet
```java
     *     The connection groups to add to the tree.
     */
    private void addConnectionGroups(Collection<ConnectionGroup> connectionGroups) {

        // Add each connection group to the tree
```

### BoundedWildcard
Can generalize to `? extends T`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/InterceptedStreamMap.java`
#### Snippet
```java
     *     The stream to wait for.
     */
    public void waitFor(InterceptedStream<T> stream) {

        T underlyingStream = stream.getStream();
```

### BoundedWildcard
Can generalize to `? extends T`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/InterceptedStreamMap.java`
#### Snippet
```java
     *     otherwise.
     */
    public boolean close(InterceptedStream<T> stream) {

        // Remove stream if present
```

### BoundedWildcard
Can generalize to `? extends Resource`
in `guacamole/src/main/java/org/apache/guacamole/extension/PatchResourceService.java`
#### Snippet
```java
     *     mimetype "text/html".
     */
    public void addPatchResources(Collection<Resource> resources) {
        for (Resource resource : resources)
            addPatchResource(resource);
```

### BoundedWildcard
Can generalize to `? super File`
in `guacamole/src/main/java/org/apache/guacamole/extension/ExtensionClassLoader.java`
#### Snippet
```java
     */
    private static URL[] getExtensionURLs(File extension,
            List<File> temporaryFiles) throws GuacamoleException {

        try (JarFile extensionJar = new JarFile(extension)) {
```

### BoundedWildcard
Can generalize to `? super Resource`
in `guacamole/src/main/java/org/apache/guacamole/extension/ExtensionModule.java`
#### Snippet
```java
     *     authentication halt the authentication process entirely.
     */
    private void loadExtensions(Collection<Resource> javaScriptResources,
            Collection<Resource> cssResources,
            Set<String> toleratedAuthProviders) {
```

### BoundedWildcard
Can generalize to `? super Resource`
in `guacamole/src/main/java/org/apache/guacamole/extension/ExtensionModule.java`
#### Snippet
```java
     */
    private void loadExtensions(Collection<Resource> javaScriptResources,
            Collection<Resource> cssResources,
            Set<String> toleratedAuthProviders) {

```

### BoundedWildcard
Can generalize to `? super String`
in `guacamole/src/main/java/org/apache/guacamole/rest/permission/APIPermissionSet.java`
#### Snippet
```java
     *     ObjectPermissionSet.
     */
    private void addObjectPermissions(Map<String, Set<ObjectPermission.Type>> permissions,
            ObjectPermissionSet permSet) throws GuacamoleException {

```

### BoundedWildcard
Can generalize to `? super SystemPermission.Type`
in `guacamole/src/main/java/org/apache/guacamole/rest/permission/APIPermissionSet.java`
#### Snippet
```java
     *     SystemPermissionSet.
     */
    private void addSystemPermissions(Set<SystemPermission.Type> permissions,
            SystemPermissionSet permSet) throws GuacamoleException {

```

## RuleId[id=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new ThreadLocal\>() can be replaced with ThreadLocal.withInitial()
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/DelegatingConnection.java`
#### Snippet
```java
     */
    private final ThreadLocal<Map<String, String>> currentTokens =
            new ThreadLocal<Map<String, String>>() {

        @Override
```

### AnonymousHasLambdaAlternative
Anonymous new ThreadLocal\>() can be replaced with ThreadLocal.withInitial()
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/DelegatingConnectionGroup.java`
#### Snippet
```java
     */
    private final ThreadLocal<Map<String, String>> currentTokens =
            new ThreadLocal<Map<String, String>>() {

        @Override
```

### AnonymousHasLambdaAlternative
Anonymous new ThreadLocal\>() can be replaced with ThreadLocal.withInitial()
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleConnection.java`
#### Snippet
```java
     */
    private final ThreadLocal<Map<String, String>> currentTokens =
            new ThreadLocal<Map<String, String>>() {

        @Override
```

### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `guacamole-common/src/main/java/org/apache/guacamole/websocket/GuacamoleWebSocketTunnelEndpoint.java`
#### Snippet
```java

        // Prepare read transfer thread
        Thread readThread = new Thread() {

            @Override
```

### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty9/GuacamoleWebSocketTunnelListener.java`
#### Snippet
```java

        // Prepare read transfer thread
        Thread readThread = new Thread() {

            @Override
```

### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty8/GuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java
                }

                Thread readThread = new Thread() {

                    @Override
```

### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/tomcat/GuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java
                }

                Thread readThread = new Thread() {

                    @Override
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getUUID()` is identical to its super method
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ConnectionRecord.java`
#### Snippet
```java
     */
    @Override
    public default UUID getUUID() {
        return null;
    }
```

### RedundantMethodOverride
Method `getPrivileged()` is identical to its super method
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/AbstractUserContext.java`
#### Snippet
```java
     */
    @Override
    public UserContext getPrivileged() {
        return this;
    }
```

### RedundantMethodOverride
Method `getEffectiveUserGroups()` is identical to its super method
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleAuthenticationProvider.java`
#### Snippet
```java

        @Override
        public Set<String> getEffectiveUserGroups() {
            return Collections.<String>emptySet();
        }
```

### RedundantMethodOverride
Method `getResource()` is identical to its super method
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleUserContext.java`
#### Snippet
```java

    @Override
    public Object getResource() throws GuacamoleException {
        return null;
    }
```

### RedundantMethodOverride
Method `getStatus()` is identical to its super method
in `guacamole-common/src/main/java/org/apache/guacamole/GuacamoleConnectionClosedException.java`
#### Snippet
```java

    @Override
    public GuacamoleStatus getStatus() {
        return GuacamoleStatus.SERVER_ERROR;
    }
```

### RedundantMethodOverride
Method `getStatus()` is identical to its super method
in `guacamole-common/src/main/java/org/apache/guacamole/GuacamoleServerException.java`
#### Snippet
```java

    @Override
    public GuacamoleStatus getStatus() {
        return GuacamoleStatus.SERVER_ERROR;
    }
```

### RedundantMethodOverride
Method `getActiveConnections()` is identical to its super method
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/activeconnection/TrackedActiveConnection.java`
#### Snippet
```java

    @Override
    public int getActiveConnections() {
        return 0;
    }
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `AuthenticatedUser` is the same as one of its superclass' names
in `extensions/guacamole-auth-header/src/main/java/org/apache/guacamole/auth/header/user/AuthenticatedUser.java`
#### Snippet
```java
 * provider.
 */
public class AuthenticatedUser extends AbstractAuthenticatedUser {

    /**
```

### ClassNameSameAsAncestorName
Class name `AuthenticatedUser` is the same as one of its superclass' names
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/AuthenticatedUser.java`
#### Snippet
```java
 * the JSON provided during authentication.
 */
public class AuthenticatedUser extends AbstractAuthenticatedUser {

    /**
```

### ClassNameSameAsAncestorName
Class name `UserContext` is the same as one of its superclass' names
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserContext.java`
#### Snippet
```java
 * authentication.
 */
public class UserContext extends AbstractUserContext {

    /**
```

### ClassNameSameAsAncestorName
Class name `RelatedObjectSet` is the same as one of its superclass' names
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/RelatedObjectSet.java`
#### Snippet
```java
 *     The underlying database model of the parent object.
 */
public abstract class RelatedObjectSet<ParentObjectType extends ModeledDirectoryObject<ParentModelType>, ParentModelType extends ObjectModel>
        extends RestrictedObject implements org.apache.guacamole.net.auth.RelatedObjectSet {

```

### ClassNameSameAsAncestorName
Class name `SystemPermissionSet` is the same as one of its superclass' names
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/permission/SystemPermissionSet.java`
#### Snippet
```java
 * particular entity.
 */
public class SystemPermissionSet extends RestrictedObject
    implements org.apache.guacamole.net.auth.permission.SystemPermissionSet {

```

### ClassNameSameAsAncestorName
Class name `ObjectPermissionSet` is the same as one of its superclass' names
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/permission/ObjectPermissionSet.java`
#### Snippet
```java
 * a particular entity.
 */
public abstract class ObjectPermissionSet extends RestrictedObject
    implements org.apache.guacamole.net.auth.permission.ObjectPermissionSet {

```

### ClassNameSameAsAncestorName
Class name `Configurator` is the same as one of its superclass' names
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/RestrictedGuacamoleWebSocketTunnelEndpoint.java`
#### Snippet
```java
     * during the connection process.
     */
    public static class Configurator extends ServerEndpointConfig.Configurator {

        /**
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
confService.getPeriod() \* 1000 \* INVALID_INTERVAL: integer multiplication implicitly cast to long
in `extensions/guacamole-auth-totp/src/main/java/org/apache/guacamole/auth/totp/user/CodeUsageTrackingService.java`
#### Snippet
```java
            // first successful use
            long current = System.currentTimeMillis();
            long invalidUntil = current + confService.getPeriod() * 1000 * INVALID_INTERVAL;

            // Try to use the given code, marking it as used within the map of
```

## RuleId[id=JavaLangImport]
### JavaLangImport
Unnecessary import from the 'java.lang' package
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-sqlserver/src/main/java/org/apache/guacamole/auth/sqlserver/SQLServerAuthenticationProviderModule.java`
#### Snippet
```java
import com.google.inject.Module;
import com.google.inject.name.Names;
import java.lang.UnsupportedOperationException;
import java.util.Properties;
import org.apache.guacamole.GuacamoleException;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `extensions/guacamole-auth-quickconnect/src/main/java/org/apache/guacamole/auth/quickconnect/utility/QCParser.java`
#### Snippet
```java

import java.io.UnsupportedEncodingException;
import java.lang.StringBuilder;
import java.net.URI;
import java.net.URISyntaxException;
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-saml/src/main/java/org/apache/guacamole/auth/saml/user/SAMLAuthenticatedUser.java`
#### Snippet
```java
    public void init(AssertedIdentity identity, Credentials credentials)
            throws GuacamoleException {
        super.init(identity.getUsername(), credentials, getGroups(identity), getTokens(identity));
    }
    
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleConnectionGroupDirectory.java`
#### Snippet
```java

        // Use the connection group map to back the underlying AbstractDirectory
        super.setObjects(connectionGroups);

    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleUserGroup.java`
#### Snippet
```java
     */
    public SimpleUserGroup(String identifier) {
        super.setIdentifier(identifier);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleConnectionDirectory.java`
#### Snippet
```java

        // Use the connection map to back the underlying directory 
        super.setObjects(this.connections);

    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleConnection.java`
#### Snippet
```java
            GuacamoleConfiguration config, boolean interpretTokens) {

        super.setName(name);
        super.setIdentifier(identifier);
        super.setConfiguration(config);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleConnection.java`
#### Snippet
```java

        super.setName(name);
        super.setIdentifier(identifier);
        super.setConfiguration(config);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleUser.java`
#### Snippet
```java
     */
    public SimpleUser(String username) {
        super.setIdentifier(username);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/DynamicallyAuthenticatedDataSource.java`
#### Snippet
```java
        // connections failing to pass sanity checks and never being returned
        // to the pool.
        super.forceCloseAll();

    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/DynamicallyAuthenticatedDataSource.java`
#### Snippet
```java
                try {
                    logger.debug("Creating new database connection for pool.");
                    return super.getConnection(environment.getUsername(), environment.getPassword());
                }
                catch (GuacamoleException e) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ModeledObject.java`
#### Snippet
```java
     */
    public void init(ModeledAuthenticatedUser currentUser, ModelType model) {
        super.init(currentUser);
        setModel(model);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/UserModel.java`
#### Snippet
```java
    public UserModel(String identifier) {
        super(EntityType.USER);
        super.setIdentifier(identifier);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/RelatedObjectSet.java`
#### Snippet
```java
     */
    public void init(ModeledAuthenticatedUser currentUser, ParentObjectType parent) {
        super.init(currentUser);
        this.parent = parent;
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/UserRecordSet.java`
#### Snippet
```java
     */
    protected void init(ModeledAuthenticatedUser currentUser, String identifier) {
        super.init(currentUser);
        this.identifier = identifier;
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/usergroup/ModeledUserGroup.java`
#### Snippet
```java
    public void init(ModeledAuthenticatedUser currentUser, UserGroupModel model,
            boolean exposeRestrictedAttributes) {
        super.init(currentUser, model);
        this.exposeRestrictedAttributes = exposeRestrictedAttributes;
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connection/ConnectionRecordSet.java`
#### Snippet
```java
     */
    protected void init(ModeledAuthenticatedUser currentUser, String identifier) {
        super.init(currentUser);
        this.identifier = identifier;
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/ModeledUser.java`
#### Snippet
```java
    public void init(ModeledAuthenticatedUser currentUser, UserModel model,
            boolean exposeRestrictedAttributes) {
        super.init(currentUser, model);
        this.exposeRestrictedAttributes = exposeRestrictedAttributes;
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/ModeledUser.java`
#### Snippet
```java
    @Override
    public Permissions getEffectivePermissions() throws GuacamoleException {
        return super.getEffective();
    }
    
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/permission/SystemPermissionSet.java`
#### Snippet
```java
            ModeledPermissions<? extends EntityModel> entity,
            Set<String> effectiveGroups) {
        super.init(currentUser);
        this.entity = entity;
        this.effectiveGroups = effectiveGroups;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/permission/ObjectPermissionSet.java`
#### Snippet
```java
            ModeledPermissions<? extends EntityModel> entity,
            Set<String> effectiveGroups) {
        super.init(currentUser);
        this.entity = entity;
        this.effectiveGroups = effectiveGroups;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `extensions/guacamole-auth-quickconnect/src/main/java/org/apache/guacamole/auth/quickconnect/QuickConnectionGroup.java`
#### Snippet
```java

        super();
        super.setName(name);
        super.setIdentifier(identifier);
        super.setType(ConnectionGroup.Type.ORGANIZATIONAL);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `extensions/guacamole-auth-quickconnect/src/main/java/org/apache/guacamole/auth/quickconnect/QuickConnectionGroup.java`
#### Snippet
```java
        super();
        super.setName(name);
        super.setIdentifier(identifier);
        super.setType(ConnectionGroup.Type.ORGANIZATIONAL);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `extensions/guacamole-auth-quickconnect/src/main/java/org/apache/guacamole/auth/quickconnect/QuickConnectionGroup.java`
#### Snippet
```java
        super.setName(name);
        super.setIdentifier(identifier);
        super.setType(ConnectionGroup.Type.ORGANIZATIONAL);

    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `extensions/guacamole-auth-quickconnect/src/main/java/org/apache/guacamole/auth/quickconnect/QuickConnectDirectory.java`
#### Snippet
```java
        this.rootGroup = (QuickConnectionGroup)rootGroup;
        this.connectionId = new AtomicInteger();
        super.setObjects(this.connections);
        
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/activeconnection/TrackedActiveConnection.java`
#### Snippet
```java
            boolean connectable) {

        super.init(currentUser);
        this.connectionRecord = activeConnectionRecord;
        this.connectable      = connectable;
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.security.Principal;`
in `extensions/guacamole-auth-header/src/main/java/org/apache/guacamole/auth/header/AuthenticationProviderService.java`
#### Snippet
```java
import org.apache.guacamole.net.auth.credentials.GuacamoleInvalidCredentialsException;
import org.apache.guacamole.auth.header.user.AuthenticatedUser;
import java.security.Principal;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.guacamole.properties.IntegerGuacamoleProperty;`
in `extensions/guacamole-auth-header/src/main/java/org/apache/guacamole/auth/header/HTTPHeaderGuacamoleProperties.java`
#### Snippet
```java
package org.apache.guacamole.auth.header;

import org.apache.guacamole.properties.IntegerGuacamoleProperty;
import org.apache.guacamole.properties.StringGuacamoleProperty;

```

### UNUSED_IMPORT
Unused import `import java.util.Collections;`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connection/ConnectionService.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connection/ModeledConnection.java`
#### Snippet
```java
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
```

### UNUSED_IMPORT
Unused import `import org.apache.guacamole.auth.quickconnect.utility.QCParser;`
in `extensions/guacamole-auth-quickconnect/src/main/java/org/apache/guacamole/auth/quickconnect/rest/QuickConnectREST.java`
#### Snippet
```java
import org.apache.guacamole.GuacamoleException;
import org.apache.guacamole.auth.quickconnect.QuickConnectDirectory;
import org.apache.guacamole.auth.quickconnect.utility.QCParser;

/**
```

### UNUSED_IMPORT
Unused import `import com.onelogin.saml2.authn.AuthnRequest;`
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-saml/src/main/java/org/apache/guacamole/auth/saml/acs/SAMLService.java`
#### Snippet
```java
import com.google.inject.Singleton;
import com.onelogin.saml2.Auth;
import com.onelogin.saml2.authn.AuthnRequest;
import com.onelogin.saml2.authn.AuthnRequestParams;
import com.onelogin.saml2.authn.SamlResponse;
```

### UNUSED_IMPORT
Unused import `import org.apache.guacamole.vault.ksm.user.KsmConnectionGroup;`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/KsmAuthenticationProviderModule.java`
#### Snippet
```java
import org.apache.guacamole.vault.ksm.conf.KsmConfigurationService;
import org.apache.guacamole.vault.ksm.secret.KsmSecretService;
import org.apache.guacamole.vault.ksm.user.KsmConnectionGroup;
import org.apache.guacamole.vault.ksm.user.KsmDirectoryService;
import org.apache.guacamole.vault.ksm.user.KsmUserFactory;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmSecretService.java`
#### Snippet
```java
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
```

### UNUSED_IMPORT
Unused import `import java.util.Iterator;`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmSecretService.java`
#### Snippet
```java
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmSecretService.java`
#### Snippet
```java
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/user/KsmDirectory.java`
#### Snippet
```java
package org.apache.guacamole.vault.ksm.user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
```

### UNUSED_IMPORT
Unused import `import java.util.Iterator;`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/user/KsmDirectory.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/user/KsmDirectory.java`
#### Snippet
```java
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

```

### UNUSED_IMPORT
Unused import `import org.apache.guacamole.GuacamoleServerException;`
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/AuthenticationService.java`
#### Snippet
```java
import org.apache.guacamole.GuacamoleException;
import org.apache.guacamole.GuacamoleSecurityException;
import org.apache.guacamole.GuacamoleServerException;
import org.apache.guacamole.GuacamoleUnauthorizedException;
import org.apache.guacamole.GuacamoleSession;
```

### UNUSED_IMPORT
Unused import `import javax.ws.rs.core.Response;`
in `guacamole/src/main/java/org/apache/guacamole/rest/history/APISortPredicate.java`
#### Snippet
```java
package org.apache.guacamole.rest.history;

import javax.ws.rs.core.Response;
import org.apache.guacamole.GuacamoleClientException;
import org.apache.guacamole.net.auth.ActivityRecordSet;
```

### UNUSED_IMPORT
Unused import `import java.util.function.Function;`
in `guacamole/src/main/java/org/apache/guacamole/rest/history/ActivityRecordResource.java`
#### Snippet
```java
package org.apache.guacamole.rest.history;

import java.util.function.Function;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/GuacamoleParser.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.guacamole.GuacamoleException;
import org.apache.guacamole.GuacamoleServerException;
```

### UNUSED_IMPORT
Unused import `import java.util.Date;`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/DelegatingConnectionRecord.java`
#### Snippet
```java
package org.apache.guacamole.net.auth;

import java.util.Date;
import java.util.Map;
import java.util.UUID;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/DelegatingConnectionRecord.java`
#### Snippet
```java

import java.util.Date;
import java.util.Map;
import java.util.UUID;

```

### UNUSED_IMPORT
Unused import `import java.util.UUID;`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/DelegatingConnectionRecord.java`
#### Snippet
```java
import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.guacamole.net.auth.UserContext;`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/event/TunnelConnectEvent.java`
#### Snippet
```java
import org.apache.guacamole.net.auth.AuthenticatedUser;
import org.apache.guacamole.net.auth.Credentials;
import org.apache.guacamole.net.auth.UserContext;

/**
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-cas/src/main/java/org/apache/guacamole/auth/cas/conf/PrivateKeyGuacamoleProperty.java`
#### Snippet
```java
                byte[] keyBuffer = new byte[1024];

                for (int readBytes; (readBytes = keyStreamIn.read(keyBuffer)) != -1;)
                    keyStreamOut.write(keyBuffer, 0, readBytes);

```

### NestedAssignment
Result of assignment expression used
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/FilteredGuacamoleWriter.java`
#### Snippet
```java
            // Pass as much data through the parser as possible
            int parsed;
            while ((parsed = parser.append(chunk, offset, length)) != 0) {
                offset += parsed;
                length -= parsed;
```

### NestedAssignment
Result of assignment expression used
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/FailoverGuacamoleSocket.java`
#### Snippet
```java

        // Continuously read instructions, searching for errors
        while ((instruction = reader.readInstruction()) != null) {

            // Add instruction to tail of instruction queue
```

### NestedAssignment
Result of assignment expression used
in `guacamole-common/src/main/java/org/apache/guacamole/servlet/GuacamoleHTTPTunnelServlet.java`
#### Snippet
```java
                // Transfer data using buffer
                while (tunnel.isOpen() &&
                        (length = input.read(buffer, 0, buffer.length)) != -1)
                    writer.write(buffer, 0, length);

```

### NestedAssignment
Result of assignment expression used
in `guacamole-common/src/main/java/org/apache/guacamole/servlet/GuacamoleHTTPTunnelServlet.java`
#### Snippet
```java
                        break;

                } while (tunnel.isOpen() && (message = reader.read()) != null);

                // Close tunnel immediately upon EOF
```

### NestedAssignment
Result of assignment expression used
in `guacamole-common/src/main/java/org/apache/guacamole/websocket/GuacamoleWebSocketTunnelEndpoint.java`
#### Snippet
```java

                        // Attempt to read
                        while ((readMessage = reader.read()) != null) {

                            // Buffer message
```

### NestedAssignment
Result of assignment expression used
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/SharedObjectManager.java`
#### Snippet
```java
        // Remove all objects from underlying collection, cleaning up each
        // object individually
        while ((current = objects.poll()) != null)
            cleanup(current);

```

### NestedAssignment
Result of assignment expression used
in `guacamole/src/main/java/org/apache/guacamole/rest/patch/PatchRESTService.java`
#### Snippet
```java
            int length;

            while ((length = reader.read(buffer)) != -1) {
                contents.append(buffer, 0, length);
            }
```

### NestedAssignment
Result of assignment expression used
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty9/GuacamoleWebSocketTunnelListener.java`
#### Snippet
```java

                        // Attempt to read
                        while ((readMessage = reader.read()) != null) {

                            // Buffer message
```

### NestedAssignment
Result of assignment expression used
in `guacamole/src/main/java/org/apache/guacamole/resource/ResourceServlet.java`
#### Snippet
```java
            // Write resource to response body
            OutputStream output = response.getOutputStream();
            while ((length = input.read(buffer)) != -1)
                output.write(buffer, 0, length);

```

### NestedAssignment
Result of assignment expression used
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty8/GuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java

                                // Attempt to read
                                while ((readMessage = reader.read()) != null) {

                                    // Buffer message
```

### NestedAssignment
Result of assignment expression used
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/tomcat/GuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java

                                // Attempt to read
                                while ((readMessage = reader.read()) != null) {

                                    // Buffer message
```

### NestedAssignment
Result of assignment expression used
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/tomcat/GuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java

                    int num_read;
                    while ((num_read = reader.read(buffer)) > 0)
                        writer.write(buffer, 0, num_read);

```

### NestedAssignment
Result of assignment expression used
in `guacamole/src/main/java/org/apache/guacamole/extension/LanguageResourceService.java`
#### Snippet
```java
                // Attempt to read language name from node
                String languageName;
                if (nameNode == null || (languageName = nameNode.textValue()) == null) {
                    logger.warn("Root-level \"" + LANGUAGE_DISPLAY_NAME_KEY + "\" string missing or invalid in language \"{}\"", languageKey);
                    languageName = languageKey;
```

### NestedAssignment
Result of assignment expression used
in `guacamole/src/main/java/org/apache/guacamole/extension/ExtensionClassLoader.java`
#### Snippet
```java
            try (OutputStream output = new FileOutputStream(dest)) {

                while ((length = input.read(buffer)) > 0) {
                    output.write(buffer, 0, length);
                }
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-saml/src/main/java/org/apache/guacamole/auth/saml/acs/AuthenticationSessionManager.java`
#### Snippet
```java
     */
    public AuthenticationSessionManager() {
        executor.scheduleAtFixedRate(() -> {
            sessions.values().removeIf(Predicates.not(AuthenticationSession::isValid));
        }, 1, 1, TimeUnit.MINUTES);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java

        return CompletableFuture.supplyAsync(() -> {
            return new String(SecretsManager.downloadFile(file), StandardCharsets.UTF_8);
        });

```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleObjectPermissionSet.java`
#### Snippet
```java
        // Add a permission of each type to the set for each identifier given
        Set<ObjectPermission> permissions = new HashSet<>(identifiers.size());
        types.forEach(type -> {
            identifiers.forEach(identifier -> permissions.add(new ObjectPermission(type, identifier)));
        });
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `matchUsernames` are queried, but never updated
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/conf/JacksonLDAPConfiguration.java`
#### Snippet
```java
    @JsonProperty("match-usernames")
    @JsonFormat(with = ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private List<Pattern> matchUsernames;
    
    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `authProviders` are queried, but never updated
in `guacamole/src/main/java/org/apache/guacamole/GuacamoleServletContextListener.java`
#### Snippet
```java
     */
    @Inject
    private List<AuthenticationProvider> authProviders;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `authProviders` are queried, but never updated
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/DecorationService.java`
#### Snippet
```java
     */
    @Inject
    private List<AuthenticationProvider> authProviders;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `listeners` are queried, but never updated
in `guacamole/src/main/java/org/apache/guacamole/rest/event/ListenerService.java`
#### Snippet
```java
     */
    @Inject
    private List<Listener> listeners;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `authProviders` are queried, but never updated
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/AuthenticationService.java`
#### Snippet
```java
     */
    @Inject
    private List<AuthenticationProvider> authProviders;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `authProviders` are queried, but never updated
in `guacamole/src/main/java/org/apache/guacamole/rest/extension/ExtensionRESTService.java`
#### Snippet
```java
     */
    @Inject
    private List<AuthenticationProvider> authProviders;

    /**
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `remote` is accessed in both synchronized and unsynchronized contexts
in `guacamole-common/src/main/java/org/apache/guacamole/websocket/GuacamoleWebSocketTunnelEndpoint.java`
#### Snippet
```java
     * non-null if tunnel is non-null.
     */
    private RemoteEndpoint.Basic remote;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `remote` is accessed in both synchronized and unsynchronized contexts
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty9/GuacamoleWebSocketTunnelListener.java`
#### Snippet
```java
     * non-null if tunnel is non-null.
     */
    private RemoteEndpoint remote;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `connection` is accessed in both synchronized and unsynchronized contexts
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty8/GuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java
             * non-null if tunnel is non-null.
             */
            private Connection connection = null;

            /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `outbound` is accessed in both synchronized and unsynchronized contexts
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/tomcat/GuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java
             * always be non-null if tunnel is non-null.
             */
            private WsOutbound outbound = null;

            /**
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `guacamole/src/main/java/org/apache/guacamole/rest/session/SessionResource.java`
#### Snippet
```java
     */
    @HEAD
    public void checkValidity() {
        // Do nothing
    }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-saml/src/main/java/org/apache/guacamole/auth/saml/acs/AuthenticationSession.java`
#### Snippet
```java
     * yet completed successfully.
     */
    private AssertedIdentity identity = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserData.java`
#### Snippet
```java
     * expiration timestamp has been set.
     */
    private boolean singleUse = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserData.java`
#### Snippet
```java
         * immediately upon use.
         */
        private boolean singleUse = false;

        /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/conf/ConfigurationService.java`
#### Snippet
```java
     * this will be null.
     */
    private Collection<JacksonLDAPConfiguration> cachedConfigurations = null;
    
    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmClient.java`
#### Snippet
```java
     * {@link #cacheLock} acquired appropriately.
     */
    private KeeperSecrets cachedSecrets = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmClient.java`
#### Snippet
```java
     * not be accessed without {@link #cacheLock} acquired appropriately.
     */
    private volatile long cacheTimestamp = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `guacamole-common/src/main/java/org/apache/guacamole/io/ReaderGuacamoleReader.java`
#### Snippet
```java
     * future reads.
     */
    private int usedLength = 0;

    @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/GuacamoleInstruction.java`
#### Snippet
```java
     * used by the Guacamole protocol.
     */
    private String protocolForm = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/GuacamoleParser.java`
#### Snippet
```java
     * The number of elements currently parsed.
     */
    private int elementCount = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/GuacamoleParser.java`
#### Snippet
```java
     * The length of the current element, if known.
     */
    private int elementLength = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/UserRecordSet.java`
#### Snippet
```java
     * that are readable by the current user will be retrieved.
     */
    private String identifier = null;
    
    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/usergroup/ModeledUserGroup.java`
#### Snippet
```java
     * via getAttributes() or allowed to be set via setAttributes().
     */
    private boolean exposeRestrictedAttributes = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connection/ModeledGuacamoleConfiguration.java`
#### Snippet
```java
     * The manually-set parameter map, if any.
     */
    private Map<String, String> parameters = null;
    
    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connection/ConnectionRecordSet.java`
#### Snippet
```java
     * by the user making the request.
     */
    private String identifier = null;
    
    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/ModeledUser.java`
#### Snippet
```java
     * queried. If the user is new, this will be null.
     */
    private PasswordRecordModel passwordRecord = null;
    
    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/ModeledUser.java`
#### Snippet
```java
     * user was retrieved from the database, this will be null.
     */
    private String password = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/ModeledUser.java`
#### Snippet
```java
     * via getAttributes() or allowed to be set via setAttributes().
     */
    private boolean exposeRestrictedAttributes = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connection/ModeledConnection.java`
#### Snippet
```java
     * The manually-set GuacamoleConfiguration, if any.
     */
    private GuacamoleConfiguration config = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharingprofile/ModeledSharingProfile.java`
#### Snippet
```java
     * The manually-set parameter map, if any.
     */
    private Map<String, String> parameters = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `guacamole/src/main/java/org/apache/guacamole/auth/file/AuthorizeTagHandler.java`
#### Snippet
```java
     * tags occur outside a "connection" tag.
     */
    private GuacamoleConfiguration default_config = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `guacamole/src/main/java/org/apache/guacamole/rest/LimitedRequestInputStream.java`
#### Snippet
```java
     * thus far.
     */
    private long bytesRead = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `guacamole/src/main/java/org/apache/guacamole/tunnel/InterceptedStream.java`
#### Snippet
```java
     * exception yet, this will be null.
     */
    private GuacamoleException streamError = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty8/GuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java
             * non-null if tunnel is non-null.
             */
            private Connection connection = null;

            /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty8/GuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java
             * the WebSocket has not yet been connected, this will be null.
             */
            private GuacamoleTunnel tunnel = null;

            /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/tomcat/GuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java
             * the WebSocket has not yet been connected, this will be null.
             */
            private GuacamoleTunnel tunnel = null;

            /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/tomcat/GuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java
             * always be non-null if tunnel is non-null.
             */
            private WsOutbound outbound = null;

            /**
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/resources/html/shared-connection.html`
#### Snippet
```java
<!-- The user sharing this connection (if any) -->
<span class="jdbc-share-tag" ng-show="item.wrappedItem.attributes['jdbc-shared-by']"
    translate="HOME.INFO_SHARED_BY"
    translate-values="{USERNAME: item.wrappedItem.attributes['jdbc-shared-by']}"></span>

```

### HtmlWrongAttributeValue
Wrong attribute value
in `extensions/guacamole-display-statistics/src/main/resources/templates/guacClientStatistics.html`
#### Snippet
```java
    <dd ng-class="{ 'no-value' : !hasValue(statistics.desktopFps) }">
        <span ng-show="hasValue(statistics.desktopFps)"
            translate="CLIENT.INFO_FRAMERATE"
            translate-values="{ VALUE : round(statistics.desktopFps) }"></span>
    </dd>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `extensions/guacamole-display-statistics/src/main/resources/templates/guacClientStatistics.html`
#### Snippet
```java
    <dd ng-class="{ 'no-value' : !hasValue(statistics.serverFps) }">
        <span ng-show="hasValue(statistics.serverFps)"
            translate="CLIENT.INFO_FRAMERATE"
            translate-values="{ VALUE : round(statistics.serverFps) }"></span>
    </dd>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `extensions/guacamole-display-statistics/src/main/resources/templates/guacClientStatistics.html`
#### Snippet
```java
    <dd ng-class="{ 'no-value' : !hasValue(statistics.clientFps) }">
        <span ng-show="hasValue(statistics.clientFps)"
            translate="CLIENT.INFO_FRAMERATE"
            translate-values="{ VALUE : round(statistics.clientFps) }"></span>
    </dd>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `extensions/guacamole-display-statistics/src/main/resources/templates/guacClientStatistics.html`
#### Snippet
```java
    <dd ng-class="{ 'no-value' : !hasValue(statistics.dropRate) }">
        <span ng-show="hasValue(statistics.dropRate)"
            translate="CLIENT.INFO_FRAMERATE"
            translate-values="{ VALUE : round(statistics.dropRate) }"></span>
    </dd>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `extensions/guacamole-auth-totp/src/main/resources/templates/authenticationCodeField.html`
#### Snippet
```java
    <div class="totp-enroll" ng-show="field.qrCode">

        <p translate="TOTP.HELP_ENROLL_BARCODE"></p>

        <!-- Barcode and key details -->
```

### HtmlWrongAttributeValue
Wrong attribute value
in `extensions/guacamole-auth-totp/src/main/resources/templates/authenticationCodeField.html`
#### Snippet
```java
        </table>

        <p translate="TOTP.HELP_ENROLL_VERIFY"
           translate-values="{ DIGITS : field.digits }"></p>

```

### HtmlWrongAttributeValue
Wrong attribute value
in `guacamole/src/main/frontend/src/app/form/templates/redirectField.html`
#### Snippet
```java
    <div class="redirect-field">
        <p ng-show="field.translatableMessage"
           translate="{{field.translatableMessage.key}}"
           translate-values="{{field.translatableMessage.variables}}">
        </p>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `guacamole/src/main/frontend/src/index.html`
#### Snippet
```java
            <guac-modal>
                <div class="notification">
                    <p translate="APP.INFO_LOGGED_OUT"></p>
                    <p>
                        <button translate="APP.ACTION_LOGIN_AGAIN" ng-disabled="reAuthenticating"
```

### HtmlWrongAttributeValue
Wrong attribute value
in `guacamole/src/main/frontend/src/index.html`
#### Snippet
```java
                    <p translate="APP.INFO_LOGGED_OUT"></p>
                    <p>
                        <button translate="APP.ACTION_LOGIN_AGAIN" ng-disabled="reAuthenticating"
                                ng-click="reAuthenticate()"></button>
                    </p>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `guacamole/src/main/frontend/src/index.html`
#### Snippet
```java
            <guac-modal>
                <div class="fatal-page-error">
                    <h1 translate="APP.DIALOG_HEADER_ERROR"></h1>
                    <p translate="APP.ERROR_PAGE_UNAVAILABLE"></p>
                </div>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `guacamole/src/main/frontend/src/index.html`
#### Snippet
```java
                <div class="fatal-page-error">
                    <h1 translate="APP.DIALOG_HEADER_ERROR"></h1>
                    <p translate="APP.ERROR_PAGE_UNAVAILABLE"></p>
                </div>
            </guac-modal>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `guacamole/src/main/frontend/src/app/form/templates/passwordField.html`
#### Snippet
```java
<div class="password-field">
    <input type="{{passwordInputType}}"
           ng-disabled="disabled"
           ng-attr-id="{{ fieldId }}"
```

### HtmlWrongAttributeValue
Wrong attribute value
in `guacamole/src/main/frontend/src/app/home/templates/connection.html`
#### Snippet
```java
    <!-- Active user count -->
    <span class="activeUserCount" ng-show="item.getActiveConnections()"
        translate="HOME.INFO_ACTIVE_USER_COUNT"
        translate-values="{USERS: item.getActiveConnections()}"></span>

```

### HtmlWrongAttributeValue
Wrong attribute value
in `guacamole/src/main/frontend/src/app/login/templates/login.html`
#### Snippet
```java

    <!-- Login error message -->
    <p class="login-error" translate="{{loginError.key}}"
       translate-values="{{loginError.variables}}"></p>

```

### HtmlWrongAttributeValue
Wrong attribute value
in `guacamole/src/main/frontend/src/app/login/templates/login.html`
#### Snippet
```java

                <!-- Login message/instructions -->
                <p ng-show="helpText" translate="{{helpText.key}}"
                   translate-values="{{helpText.variables}}"></p>

```

### HtmlWrongAttributeValue
Wrong attribute value
in `guacamole/src/main/frontend/src/app/client/templates/guacFileTransfer.html`
#### Snippet
```java
    <!-- Progress/status text -->
    <div class="text"
         translate="CLIENT.TEXT_FILE_TRANSFER_PROGRESS"
         translate-values="{PROGRESS: getProgressValue(), UNIT: getProgressUnit()}"></div>

```

### HtmlWrongAttributeValue
Wrong attribute value
in `guacamole/src/main/frontend/src/app/client/templates/guacClientUserCount.html`
#### Snippet
```java
            ng-repeat="user in userCounts | toArray | orderBy: key"
            ng-class="{ anonymous : isAnonymous(user.key) }"
            translate="{{ getUserCountTranslationKey(user.key) }}"
            translate-values="{ USERNAME : user.key, COUNT : user.value }"></li>
    </ul>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `guacamole/src/main/frontend/src/app/client/templates/client.html`
#### Snippet
```java
                        <h3>{{'CLIENT.INFO_CONNECTION_SHARED' | translate}}</h3>
                        <p class="description"
                           translate="CLIENT.HELP_SHARE_LINK"
                           translate-values="{LINKS : getShareLinkCount()}"></p>
                        <table>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `guacamole/src/main/frontend/src/app/manage/templates/manageConnection.html`
#### Snippet
```java
                    <td class="start">{{wrapper.entry.startDate | date:historyDateFormat}}</td>
                    <td class="duration"
                        translate="{{wrapper.durationText}}"
                        translate-values="{VALUE: wrapper.duration.value, UNIT: wrapper.duration.unit}"></td>
                    <td class="remoteHost">{{wrapper.entry.remoteHost}}</td>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `guacamole/src/main/frontend/src/app/player/templates/player.html`
#### Snippet
```java
<div class="guac-player-status" ng-show="operationMessage">
    <guac-player-progress-indicator progress="operationProgress"></guac-player-progress-indicator>
    <p translate="{{ operationMessage }}"></p>
    <button class="guac-player-button guac-player-cancel"
            ng-show="cancelOperation"
```

### HtmlWrongAttributeValue
Wrong attribute value
in `guacamole/src/main/frontend/src/app/settings/templates/connection.html`
#### Snippet
```java
    <!-- Active user count -->
    <span class="activeUserCount" ng-show="item.getActiveConnections()"
        translate="SETTINGS_CONNECTIONS.INFO_ACTIVE_USER_COUNT"
        translate-values="{USERS: item.getActiveConnections()}"></span>

```

### HtmlWrongAttributeValue
Wrong attribute value
in `guacamole/src/main/frontend/src/app/settings/templates/settingsConnectionHistory.html`
#### Snippet
```java
                    <td><guac-user-item username="historyEntryWrapper.entry.username"></guac-user-item></td>
                    <td>{{historyEntryWrapper.entry.startDate | date : dateFormat}}</td>
                    <td translate="{{historyEntryWrapper.readableDurationText}}"
                        translate-values="{VALUE: historyEntryWrapper.readableDuration.value, UNIT: historyEntryWrapper.readableDuration.unit}"></td>
                    <td>{{historyEntryWrapper.entry.connectionName}}</td>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `guacamole/src/main/frontend/src/app/notification/templates/guacNotification.html`
#### Snippet
```java
        <!-- Notification text -->
        <p ng-show="notification.text" class="text"
           translate="{{notification.text.key}}"
           translate-values="{{notification.text.variables}}"></p>

```

### HtmlWrongAttributeValue
Wrong attribute value
in `guacamole/src/main/frontend/src/app/notification/templates/guacNotification.html`
#### Snippet
```java
        <div class="progress" ng-show="notification.progress"><div class="bar" ng-show="progressPercent" ng-style="{'width': progressPercent + '%'}"></div><div
                ng-show="notification.progress.text"
                translate="{{notification.progress.text}}"
                translate-values="{PROGRESS: notification.progress.value, UNIT: notification.progress.unit}"></div></div>

```

### HtmlWrongAttributeValue
Wrong attribute value
in `guacamole/src/main/frontend/src/app/notification/templates/guacNotification.html`
#### Snippet
```java
        <p class="countdown-text"
           ng-show="notification.countdown.text"
           translate="{{notification.countdown.text}}"
           translate-values="{REMAINING: timeRemaining}"></p>

```

### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-06-08-53-02.519.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/ObjectQueryService.java`
#### Snippet
```java
        SearchRequest request = ldapService.getSearchRequest(config, baseDN, query);
        if (attributes != null)
            request.addAttributes(attributes.toArray(new String[0]));

        // Produce list of all entries in the search result, automatically
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/LocalEnvironment.java`
#### Snippet
```java
            if (files == null) {
                logger.error("Unable to read contents of \"{}\".", protocol_directory.getAbsolutePath());
                files = new File[0];
            }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/ConfiguredGuacamoleSocket.java`
#### Snippet
```java
                new GuacamoleInstruction(
                    "audio",
                    info.getAudioMimetypes().toArray(new String[0])
                ));

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/ConfiguredGuacamoleSocket.java`
#### Snippet
```java
                new GuacamoleInstruction(
                    "video",
                    info.getVideoMimetypes().toArray(new String[0])
                ));

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/ConfiguredGuacamoleSocket.java`
#### Snippet
```java
                new GuacamoleInstruction(
                    "image",
                    info.getImageMimetypes().toArray(new String[0])
                ));
        
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `guacamole/src/main/java/org/apache/guacamole/extension/ExtensionClassLoader.java`
#### Snippet
```java
                        + "copied to temporary directory \"{}\".", extension, extensionTempLibDir);

            return urls.toArray(new URL[0]);

        }
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/conf/CaseInsensitivePatternDeserializer.java`
#### Snippet
```java
    @Override
    public Pattern deserialize(JsonParser parser, DeserializationContext context)
            throws IOException, JsonProcessingException {

        if (!parser.hasToken(JsonToken.VALUE_STRING))
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `cipher == null` is always `false`
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-cas/src/main/java/org/apache/guacamole/auth/cas/ticket/TicketValidationService.java`
#### Snippet
```java
            final Cipher cipher = Cipher.getInstance(clearpassKey.getAlgorithm());

            if (cipher == null)
                throw new GuacamoleServerException("Failed to initialize cipher object with private key.");

```

### ConstantValue
Condition `user instanceof LDAPAuthenticatedUser` is always `true`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/connection/ConnectionService.java`
#### Snippet
```java
                // Inject LDAP-specific tokens only if LDAP handled user
                // authentication
                if (user instanceof LDAPAuthenticatedUser)
                    connection = new TokenInjectingConnection(connection, user.getTokens());

```

## RuleId[id=Java8MapForEach]
### Java8MapForEach
Can be replaced with 'Map.forEach()'
in `extensions/guacamole-vault/modules/guacamole-vault-base/src/main/java/org/apache/guacamole/vault/user/VaultUserContext.java`
#### Snippet
```java
            @Override
            public void setTokens(Map<String, String> tokens) {
                tokens.entrySet().forEach((entry) -> setToken(entry.getKey(), entry.getValue()));
            }

```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `DEFAULT_ABSOLUTE_MAX_CONNECTIONS` may be 'static'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-postgresql/src/main/java/org/apache/guacamole/auth/postgresql/conf/PostgreSQLEnvironment.java`
#### Snippet
```java
     * allowed to the Guacamole server overall.
     */
    private final int DEFAULT_ABSOLUTE_MAX_CONNECTIONS = 0;

    /**
```

### FieldMayBeStatic
Field `DEFAULT_MAX_GROUP_CONNECTIONS` may be 'static'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-postgresql/src/main/java/org/apache/guacamole/auth/postgresql/conf/PostgreSQLEnvironment.java`
#### Snippet
```java
     * the values that should be used in the absence of the correct properties.
     */
    private final int DEFAULT_MAX_GROUP_CONNECTIONS = 0;

    /**
```

### FieldMayBeStatic
Field `DEFAULT_MAX_CONNECTIONS_PER_USER` may be 'static'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-postgresql/src/main/java/org/apache/guacamole/auth/postgresql/conf/PostgreSQLEnvironment.java`
#### Snippet
```java
     * properties.
     */
    private final int DEFAULT_MAX_CONNECTIONS_PER_USER = 1;

    /**
```

### FieldMayBeStatic
Field `DEFAULT_MAX_CONNECTIONS` may be 'static'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-postgresql/src/main/java/org/apache/guacamole/auth/postgresql/conf/PostgreSQLEnvironment.java`
#### Snippet
```java
     * the values that should be used in the absence of the correct properties.
     */
    private final int DEFAULT_MAX_CONNECTIONS = 0;

    /**
```

### FieldMayBeStatic
Field `DEFAULT_MAX_GROUP_CONNECTIONS_PER_USER` may be 'static'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-postgresql/src/main/java/org/apache/guacamole/auth/postgresql/conf/PostgreSQLEnvironment.java`
#### Snippet
```java
     * properties.
     */
    private final int DEFAULT_MAX_GROUP_CONNECTIONS_PER_USER = 1;

    /**
```

### FieldMayBeStatic
Field `DEFAULT_MAX_CONNECTIONS` may be 'static'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-mysql/src/main/java/org/apache/guacamole/auth/mysql/conf/MySQLEnvironment.java`
#### Snippet
```java
     * allowed to any one connection.
     */
    private final int DEFAULT_MAX_CONNECTIONS = 0;

    /**
```

### FieldMayBeStatic
Field `DEFAULT_MAX_GROUP_CONNECTIONS` may be 'static'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-mysql/src/main/java/org/apache/guacamole/auth/mysql/conf/MySQLEnvironment.java`
#### Snippet
```java
     * allowed to any one connection group.
     */
    private final int DEFAULT_MAX_GROUP_CONNECTIONS = 0;

    /**
```

### FieldMayBeStatic
Field `DEFAULT_MAX_GROUP_CONNECTIONS_PER_USER` may be 'static'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-mysql/src/main/java/org/apache/guacamole/auth/mysql/conf/MySQLEnvironment.java`
#### Snippet
```java
     * allowed per user to any one connection group.
     */
    private final int DEFAULT_MAX_GROUP_CONNECTIONS_PER_USER = 1;

    /**
```

### FieldMayBeStatic
Field `DEFAULT_MAX_CONNECTIONS_PER_USER` may be 'static'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-mysql/src/main/java/org/apache/guacamole/auth/mysql/conf/MySQLEnvironment.java`
#### Snippet
```java
     * allowed per user to any one connection.
     */
    private final int DEFAULT_MAX_CONNECTIONS_PER_USER = 1;

    /**
```

### FieldMayBeStatic
Field `DEFAULT_ABSOLUTE_MAX_CONNECTIONS` may be 'static'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-mysql/src/main/java/org/apache/guacamole/auth/mysql/conf/MySQLEnvironment.java`
#### Snippet
```java
     * allowed to the Guacamole server overall.
     */
    private final int DEFAULT_ABSOLUTE_MAX_CONNECTIONS = 0;

    /**
```

### FieldMayBeStatic
Field `OTHER_EXTENSIONS` may be 'static'
in `guacamole/src/main/java/org/apache/guacamole/extension/ExtensionOrderProperty.java`
#### Snippet
```java
         * explicitly listed.
         */
        private final String OTHER_EXTENSIONS = "*";

        /**
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `KsmConfig` has only 'static' members, and lacks a 'private' constructor
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/conf/KsmConfig.java`
#### Snippet
```java
 * {@link KeyValueStorage} object.
 */
public class KsmConfig {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Attribute` has only 'static' members, and lacks a 'private' constructor
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/User.java`
#### Snippet
```java
     * have a "guac-" prefix to avoid such conflicts.
     */
    public static class Attribute {

        /**
```

### UtilityClassWithoutPrivateConstructor
Class `Type` has only 'static' members, and lacks a 'private' constructor
in `guacamole-ext/src/main/java/org/apache/guacamole/form/Field.java`
#### Snippet
```java
     * See FormService.js.
     */
    public static class Type {

        /**
```

### UtilityClassWithoutPrivateConstructor
Class `ProviderFactory` has only 'static' members, and lacks a 'private' constructor
in `guacamole/src/main/java/org/apache/guacamole/extension/ProviderFactory.java`
#### Snippet
```java
 * with sufficient detail to allow debugging.
 */
class ProviderFactory {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ListenerFactory` has only 'static' members, and lacks a 'private' constructor
in `guacamole/src/main/java/org/apache/guacamole/extension/ListenerFactory.java`
#### Snippet
```java
 * provider class.
 */
class ListenerFactory {

    /**
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `custom` might be null
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java

        // Use password "private key" custom field as fallback ...
        Password passwordField = getField(custom, Password.class, PRIVATE_KEY_LABEL_PATTERN);
        if (passwordField != null)
            return CompletableFuture.completedFuture(getSingleStringValue(passwordField.getValue()));
```

### DataFlowIssue
Argument `data.getCustom()` might be null
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java

        // Fall back on custom fields
        return getField(data.getCustom(), fieldClass, labelPattern);

    }
```

### DataFlowIssue
Argument `custom` might be null
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java

        // Use text "username" custom field as fallback ...
        Text textField = getField(custom, Text.class, USERNAME_LABEL_PATTERN);
        if (textField != null)
            return getSingleStringValue(textField.getValue());
```

### DataFlowIssue
Argument `custom` might be null
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java

        // Use password "private key" custom field as fallback ...
        Password passwordField = getField(custom, Password.class, PASSPHRASE_LABEL_PATTERN);
        if (passwordField != null)
            return getSingleStringValue(passwordField.getValue());
```

### DataFlowIssue
Argument `custom` might be null
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java

        // First check text "domain" custom field ...
        Text textField = getField(custom, Text.class, DOMAIN_LABEL_PATTERN);
        if (textField != null)
            return getSingleStringValue(textField.getValue());
```

### DataFlowIssue
Argument `custom` might be null
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java

        // Use text "hostname" custom field as fallback ...
        Text textField = getField(custom, Text.class, HOSTNAME_LABEL_PATTERN);
        if (textField != null)
            return getSingleStringValue(textField.getValue());
```

### DataFlowIssue
Argument `recording.listFiles()` might be null
in `extensions/guacamole-history-recording-storage/src/main/java/org/apache/guacamole/history/connection/HistoryConnectionRecord.java`
#### Snippet
```java
        Map<String, ActivityLog> logs = new HashMap<>(super.getLogs());
        if (recording.isDirectory()) {
            Arrays.asList(recording.listFiles()).stream()
                    .forEach((file) -> addActivityLog(logs, file));
        }
```

### DataFlowIssue
Casting `e` to `GuacamoleException` will produce `ClassCastException` for any non-null value
in `extensions/guacamole-vault/modules/guacamole-vault-base/src/main/java/org/apache/guacamole/vault/conf/VaultConfigurationService.java`
#### Snippet
```java

                    if (e.getCause() instanceof GuacamoleException)
                        throw (GuacamoleException) e;

                    throw new GuacamoleServerException(String.format("Property "
```

### DataFlowIssue
Method invocation `notifyFailed` may produce `NullPointerException`
in `extensions/guacamole-auth-ban/src/main/java/org/apache/guacamole/auth/ban/status/InMemoryAuthenticationFailureTracker.java`
#### Snippet
```java
                (addr) -> new AuthenticationFailureStatus(maxAttempts, banDuration));

        status.notifyFailed();
        return status;

```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/conf/MemberAttributeType.java`
#### Snippet
```java
     */
    @PropertyValue("uid")
    UID;

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ConnectionGroup.java`
#### Snippet
```java
        BALANCING

    };

    /**
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ActivityRecordSet.java`
#### Snippet
```java
        START_DATE

    };

    /**
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-sqlserver/src/main/java/org/apache/guacamole/auth/sqlserver/conf/SQLServerDriver.java`
#### Snippet
```java
     */
    @PropertyValue("microsoft2005")
    MICROSOFT_2005;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/tomcat/RestrictedGuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java
            throws GuacamoleException {
        return tunnelRequestService.createTunnel(request);
    };

}
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'Arrays.asList().stream()' can be replaced with 'Arrays.stream()'
in `extensions/guacamole-history-recording-storage/src/main/java/org/apache/guacamole/history/connection/HistoryConnectionRecord.java`
#### Snippet
```java
        Map<String, ActivityLog> logs = new HashMap<>(super.getLogs());
        if (recording.isDirectory()) {
            Arrays.asList(recording.listFiles()).stream()
                    .forEach((file) -> addActivityLog(logs, file));
        }
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `extensions/guacamole-history-recording-storage/src/main/java/org/apache/guacamole/history/connection/HistoryConnectionRecord.java`
#### Snippet
```java
        if (recording.isDirectory()) {
            Arrays.asList(recording.listFiles()).stream()
                    .forEach((file) -> addActivityLog(logs, file));
        }
        else
```

### SimplifyStreamApiCallChains
'!Stream.anyMatch(x -\> !(...))' can be replaced with 'allMatch()'
in `guacamole/src/main/java/org/apache/guacamole/GuacamoleSession.java`
#### Snippet
```java

        // Immediately return false if any user context is not valid
        return !userContexts.stream().anyMatch(
                userContext -> !userContext.isValid());
    }
```

### SimplifyStreamApiCallChains
''stream().forEachOrdered()'' can be replaced with 'forEach()'' (may change semantics)
in `guacamole/src/main/java/org/apache/guacamole/GuacamoleServletContextListener.java`
#### Snippet
```java
            // clean up ALL temporary files
            if (temporaryFiles != null)
                Lists.reverse(temporaryFiles).stream().forEachOrdered(this::deleteTemporaryFile);

        }
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/HashTokenSessionMap.java`
#### Snippet
```java

        // Forcibly invalidate any remaining sessions
        sessionMap.values().stream().forEach(GuacamoleSession::invalidate);

    }
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'getHistory' is still used
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/User.java`
#### Snippet
```java
     */
    @Deprecated
    default List<? extends ActivityRecord> getHistory() throws GuacamoleException {
        return Collections.unmodifiableList(new ArrayList<>(getUserHistory().asCollection()));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getHistory' is still used
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/Connection.java`
#### Snippet
```java
     */
    @Deprecated
    default List<? extends ConnectionRecord> getHistory()
            throws GuacamoleException {
        return Collections.unmodifiableList(new ArrayList<>(getConnectionHistory().asCollection()));
```

### DeprecatedIsStillUsed
Deprecated member 'AuthenticationFailureListener' is still used
in `guacamole-ext/src/main/java/org/apache/guacamole/net/event/listener/AuthenticationFailureListener.java`
#### Snippet
```java
 */
@Deprecated
public interface AuthenticationFailureListener {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'TunnelCloseListener' is still used
in `guacamole-ext/src/main/java/org/apache/guacamole/net/event/listener/TunnelCloseListener.java`
#### Snippet
```java
 */
@Deprecated
public interface TunnelCloseListener {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'AuthenticationSuccessListener' is still used
in `guacamole-ext/src/main/java/org/apache/guacamole/net/event/listener/AuthenticationSuccessListener.java`
#### Snippet
```java
 */
@Deprecated
public interface AuthenticationSuccessListener {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'TunnelConnectListener' is still used
in `guacamole-ext/src/main/java/org/apache/guacamole/net/event/listener/TunnelConnectListener.java`
#### Snippet
```java
 */
@Deprecated
public interface TunnelConnectListener {

   /**
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/user/KsmDirectory.java`
#### Snippet
```java
        // Process and return each object from the wrapped directory
        return super.getAll(identifiers).stream().map(
                superObject -> wrap(superObject)
                ).collect(Collectors.toList());

```

## RuleId[id=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `close()` overrides synchronized method
in `guacamole/src/main/java/org/apache/guacamole/tunnel/TunnelRequestService.java`
#### Snippet
```java

            @Override
            public void close() throws GuacamoleException {

                // Notify listeners to allow close request to be vetoed
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'Arrays.asList()' call
in `extensions/guacamole-auth-quickconnect/src/main/java/org/apache/guacamole/auth/quickconnect/utility/QCParser.java`
#### Snippet
```java

        // Split the query string into the pairs
        List<String> paramList = Arrays.asList(queryStr.split("&"));

        // Loop through key/value pairs and put them in the Map.
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'credentialsInfo' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/credentials/GuacamoleCredentialsException.java`
#### Snippet
```java
     * Information describing the form of valid credentials.
     */
    private final CredentialsInfo credentialsInfo;
    
    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleSessionConflictException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleInsufficientCredentialsException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleSessionClosedException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleUnauthorizedException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleServerBusyException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleClientOverrunException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleClientTimeoutException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleClientException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleResourceNotFoundException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleUpstreamUnavailableException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleUpstreamException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleClientBadTypeException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleResourceConflictException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleUnsupportedException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleClientTooManyException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleSessionTimeoutException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleSecurityException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleUpstreamTimeoutException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleCredentialsException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleConnectionClosedException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleServerException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleUpstreamNotFoundException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleInvalidCredentialsException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `guacamole-ext/src/main/java/org/apache/guacamole/language/TranslatableGuacamoleResourceClosedException.java`
#### Snippet
```java
     * occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'version' in a Serializable class
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/GuacamoleProtocolCapability.java`
#### Snippet
```java
     * The minimum protocol version required to support this capability.
     */
    private final GuacamoleProtocolVersion version;
    
    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'tunnels' in a Serializable class
in `guacamole-common/src/main/java/org/apache/guacamole/servlet/GuacamoleHTTPTunnelServlet.java`
#### Snippet
```java
     * session token.
     */
    private final GuacamoleHTTPTunnelMap tunnels = new GuacamoleHTTPTunnelMap();

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'encoder' in a Serializable class
in `guacamole-common/src/main/java/org/apache/guacamole/servlet/GuacamoleHTTPTunnelServlet.java`
#### Snippet
```java
     * strings.
     */
    private final Base64.Encoder encoder = Base64.getEncoder();

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'translatableMessage' in a Serializable class
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/security/PasswordPolicyException.java`
#### Snippet
```java
     * system, describes the policy violation that occurred.
     */
    private final TranslatableMessage translatableMessage;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'currentUser' in a Serializable class
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connection/ModeledGuacamoleConfiguration.java`
#### Snippet
```java
     * permission settings.
     */
    private ModeledAuthenticatedUser currentUser;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'connectionService' in a Serializable class
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connection/ModeledGuacamoleConfiguration.java`
#### Snippet
```java
     */
    @Inject
    private ConnectionService connectionService;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'connectionModel' in a Serializable class
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connection/ModeledGuacamoleConfiguration.java`
#### Snippet
```java
     * connection associated with this configuration.
     */
    private ConnectionModel connectionModel;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'tunnelRequestService' in a Serializable class
in `guacamole/src/main/java/org/apache/guacamole/tunnel/http/RestrictedGuacamoleHTTPTunnelServlet.java`
#### Snippet
```java
     */
    @Inject
    private TunnelRequestService tunnelRequestService;
    
    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'tunnelRequestService' in a Serializable class
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty8/RestrictedGuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java
     */
    @Inject
    private TunnelRequestService tunnelRequestService;
 
    @Override
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'tunnelRequestService' in a Serializable class
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty9/RestrictedGuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java
     */
    @Inject
    private TunnelRequestService tunnelRequestService;
 
    @Override
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'tunnelRequestService' in a Serializable class
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/tomcat/RestrictedGuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java
     */
    @Inject
    private TunnelRequestService tunnelRequestService;
 
    @Override
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `guacamole/src/main/java/org/apache/guacamole/tunnel/TunnelModule.java`
#### Snippet
```java
        // If no such class or constructor, etc., then this particular
        // WebSocket support is not present
        catch (ClassNotFoundException e) {}
        catch (NoClassDefFoundError e) {}
        catch (NoSuchMethodException e) {}
```

### CatchMayIgnoreException
Empty `catch` block
in `guacamole/src/main/java/org/apache/guacamole/tunnel/TunnelModule.java`
#### Snippet
```java
        // WebSocket support is not present
        catch (ClassNotFoundException e) {}
        catch (NoClassDefFoundError e) {}
        catch (NoSuchMethodException e) {}

```

### CatchMayIgnoreException
Empty `catch` block
in `guacamole/src/main/java/org/apache/guacamole/tunnel/TunnelModule.java`
#### Snippet
```java
        catch (ClassNotFoundException e) {}
        catch (NoClassDefFoundError e) {}
        catch (NoSuchMethodException e) {}

        // Log errors which indicate bugs
```

### CatchMayIgnoreException
Empty `catch` block
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/WebSocketTunnelModule.java`
#### Snippet
```java
        // If no such servlet class, this particular WebSocket support
        // is not present
        catch (ClassNotFoundException e) {}
        catch (NoClassDefFoundError e) {}

```

### CatchMayIgnoreException
Empty `catch` block
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/WebSocketTunnelModule.java`
#### Snippet
```java
        // is not present
        catch (ClassNotFoundException e) {}
        catch (NoClassDefFoundError e) {}

        // Support not found
```

### CatchMayIgnoreException
Empty `catch` block
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty8/WebSocketTunnelModule.java`
#### Snippet
```java
        // If no such servlet class, this particular WebSocket support
        // is not present
        catch (ClassNotFoundException e) {}
        catch (NoClassDefFoundError e) {}

```

### CatchMayIgnoreException
Empty `catch` block
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty8/WebSocketTunnelModule.java`
#### Snippet
```java
        // is not present
        catch (ClassNotFoundException e) {}
        catch (NoClassDefFoundError e) {}

        // Support not found
```

### CatchMayIgnoreException
Empty `catch` block
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty9/WebSocketTunnelModule.java`
#### Snippet
```java
        // If no such servlet class, this particular WebSocket support
        // is not present
        catch (ClassNotFoundException e) {}
        catch (NoClassDefFoundError e) {}

```

### CatchMayIgnoreException
Empty `catch` block
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty9/WebSocketTunnelModule.java`
#### Snippet
```java
        // is not present
        catch (ClassNotFoundException e) {}
        catch (NoClassDefFoundError e) {}

        // Support not found
```

### CatchMayIgnoreException
Empty `catch` block
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/tomcat/WebSocketTunnelModule.java`
#### Snippet
```java
        // If no such servlet class, this particular WebSocket support
        // is not present
        catch (ClassNotFoundException e) {}
        catch (NoClassDefFoundError e) {}

```

### CatchMayIgnoreException
Empty `catch` block
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/tomcat/WebSocketTunnelModule.java`
#### Snippet
```java
        // is not present
        catch (ClassNotFoundException e) {}
        catch (NoClassDefFoundError e) {}

        // Support not found
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/group/UserGroupService.java`
#### Snippet
```java
            if (userEntries.size() != 1)
                logger.warn("user DN \"{}\" does not return unique value "
                        + "and will be ignored", userDN.toString());
            else {
                // determine unique identifier for user
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/ObjectQueryService.java`
#### Snippet
```java
        searchFilter.addNode(attributeFilter);

        logger.trace("Sending LDAP filter: \"{}\"", searchFilter.toString());
        
        return searchFilter;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `extensions/guacamole-auth-duo/src/main/java/org/apache/guacamole/auth/duo/api/SignedDuoCookie.java`
#### Snippet
```java
        // Store cookie type and signature
        this.type = type;
        this.signature = sign(key, type.getPrefix() + "|" + cookie.toString());

    }
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `CachedSecret` may be 'static'
in `extensions/guacamole-vault/modules/guacamole-vault-base/src/main/java/org/apache/guacamole/vault/secret/CachedVaultSecretService.java`
#### Snippet
```java
     * The cached value of a secret.
     */
    protected class CachedSecret {

        /**
```

### InnerClassMayBeStatic
Inner class `UsedCode` may be 'static'
in `extensions/guacamole-auth-totp/src/main/java/org/apache/guacamole/auth/totp/user/CodeUsageTrackingService.java`
#### Snippet
```java
     * A valid TOTP code which was previously used by a particular user.
     */
    private class UsedCode {

        /**
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `remote`
in `guacamole-common/src/main/java/org/apache/guacamole/websocket/GuacamoleWebSocketTunnelEndpoint.java`
#### Snippet
```java
        // connection has changed, and synchronization need only be performed
        // in context of the new remote.
        synchronized (remote) {
            remote.sendText(instruction);
        }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `remote`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty9/GuacamoleWebSocketTunnelListener.java`
#### Snippet
```java
        // connection has changed, and synchronization need only be performed
        // in context of the new remote.
        synchronized (remote) {
            remote.sendString(instruction);
        }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `connection`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty8/GuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java
                // synchronization need only be performed in context of the new
                // connection
                synchronized (connection) {
                    connection.sendMessage(instruction);
                }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `outbound`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/tomcat/GuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java
                // synchronization need only be performed in context of the new
                // connection
                synchronized (outbound) {
                    outbound.writeTextMessage(CharBuffer.wrap(instruction));
                }
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-cas/src/main/java/org/apache/guacamole/auth/cas/ticket/TicketValidationService.java`
#### Snippet
```java
            final byte[] pass64 = BaseEncoding.base64().decode(encryptedPassword);
            final byte[] cipherData = cipher.doFinal(pass64);
            return new String(cipherData, Charset.forName("UTF-8"));

        }
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserDataService.java`
#### Snippet
```java

            // Convert from UTF-8
            json = new String(receivedJSON, "UTF-8");

        }
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `guacamole-common/src/main/java/org/apache/guacamole/net/SSLGuacamoleSocket.java`
#### Snippet
```java

            // On successful connect, retrieve I/O streams
            reader = new ReaderGuacamoleReader(new InputStreamReader(sock.getInputStream(),   "UTF-8"));
            writer = new WriterGuacamoleWriter(new OutputStreamWriter(sock.getOutputStream(), "UTF-8"));

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `guacamole-common/src/main/java/org/apache/guacamole/net/SSLGuacamoleSocket.java`
#### Snippet
```java
            // On successful connect, retrieve I/O streams
            reader = new ReaderGuacamoleReader(new InputStreamReader(sock.getInputStream(),   "UTF-8"));
            writer = new WriterGuacamoleWriter(new OutputStreamWriter(sock.getOutputStream(), "UTF-8"));

        }
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `guacamole-common/src/main/java/org/apache/guacamole/net/InetGuacamoleSocket.java`
#### Snippet
```java

            // On successful connect, retrieve I/O streams
            reader = new ReaderGuacamoleReader(new InputStreamReader(sock.getInputStream(),   "UTF-8"));
            writer = new WriterGuacamoleWriter(new OutputStreamWriter(sock.getOutputStream(), "UTF-8"));

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `guacamole-common/src/main/java/org/apache/guacamole/net/InetGuacamoleSocket.java`
#### Snippet
```java
            // On successful connect, retrieve I/O streams
            reader = new ReaderGuacamoleReader(new InputStreamReader(sock.getInputStream(),   "UTF-8"));
            writer = new WriterGuacamoleWriter(new OutputStreamWriter(sock.getOutputStream(), "UTF-8"));

        }
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `guacamole-common/src/main/java/org/apache/guacamole/servlet/GuacamoleHTTPTunnelServlet.java`
#### Snippet
```java
            // Get input reader for HTTP stream
            Reader input = new InputStreamReader(
                    request.getInputStream(), "UTF-8");

            // Transfer data from input stream to tunnel output, ensuring
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `guacamole-common/src/main/java/org/apache/guacamole/servlet/GuacamoleHTTPTunnelServlet.java`
#### Snippet
```java
            // Get writer for response
            Writer out = new BufferedWriter(new OutputStreamWriter(
                    response.getOutputStream(), "UTF-8"));

            // Stream data to response, ensuring output stream is closed
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `extensions/guacamole-auth-duo/src/main/java/org/apache/guacamole/auth/duo/api/DuoCookie.java`
#### Snippet
```java

            // Encode resulting cookie string with base64
            return BaseEncoding.base64().encode(data.getBytes("UTF-8"));

        }
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `extensions/guacamole-auth-duo/src/main/java/org/apache/guacamole/auth/duo/api/DuoCookie.java`
#### Snippet
```java
        String data;
        try {
            data = new String(BaseEncoding.base64().decode(str), "UTF-8");
        }

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `extensions/guacamole-auth-duo/src/main/java/org/apache/guacamole/auth/duo/api/SignedDuoCookie.java`
#### Snippet
```java
            // Attempt to sign UTF-8 bytes of provided data
            Mac mac = Mac.getInstance(SIGNATURE_ALGORITHM);
            mac.init(new SecretKeySpec(key.getBytes("UTF-8"), SIGNATURE_ALGORITHM));

            // Return signature as hex
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `extensions/guacamole-auth-duo/src/main/java/org/apache/guacamole/auth/duo/api/SignedDuoCookie.java`
#### Snippet
```java

            // Return signature as hex
            return BaseEncoding.base16().lowerCase().encode(mac.doFinal(data.getBytes("UTF-8")));

        }
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/security/SHA256PasswordEncryptionService.java`
#### Snippet
```java
            // Hash UTF-8 bytes of possibly-salted password
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(builder.toString().getBytes("UTF-8"));
            return md.digest();

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `guacamole/src/main/java/org/apache/guacamole/auth/file/Authorization.java`
#### Snippet
```java
                    try {
                        MessageDigest digest = MessageDigest.getInstance("MD5");
                        String hashedPassword = getHexString(digest.digest(password.getBytes("UTF-8")));
                        return hashedPassword.equals(this.password.toUpperCase());
                    }
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `guacamole/src/main/java/org/apache/guacamole/auth/file/Authorization.java`
#### Snippet
```java
                    try {
                        MessageDigest digest = MessageDigest.getInstance("SHA-256");
                        String hashedPassword = getHexString(digest.digest(password.getBytes("UTF-8")));
                        return hashedPassword.equals(this.password.toUpperCase());
                    }
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `guacamole/src/main/java/org/apache/guacamole/rest/patch/PatchRESTService.java`
#### Snippet
```java

        // Read entire resource into StringBuilder one chunk at a time
        Reader reader = new InputStreamReader(resource.asStream(), "UTF-8");
        try {

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/TokenRESTService.java`
#### Snippet
```java
                    String basicBase64 = authorization.substring(6);
                    String basicCredentials = new String(
                            BaseEncoding.base64().decode(basicBase64), "UTF-8");

                    // Pull username/password from auth data
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/tomcat/GuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java

        try {
            byte[] message = Integer.toString(guacamoleStatusCode).getBytes("UTF-8");
            outbound.close(webSocketCode, ByteBuffer.wrap(message));
        }
```

## RuleId[id=KotlinMavenPluginPhase]
### KotlinMavenPluginPhase
You have kotlin-stdlib configured but no corresponding plugin execution
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/pom.xml`
#### Snippet
```java
        <dependency>
            <groupId>org.jetbrains.kotlin</groupId>
            <artifactId>kotlin-stdlib</artifactId>
            <version>${kotlin.version}</version>
        </dependency>
```

### KotlinMavenPluginPhase
You have kotlin-stdlib-jdk8 configured but no corresponding plugin execution
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/pom.xml`
#### Snippet
```java
        <dependency>
            <groupId>org.jetbrains.kotlin</groupId>
            <artifactId>kotlin-stdlib-jdk8</artifactId>
            <version>${kotlin.version}</version>
        </dependency>
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'obj == null' covered by subsequent condition '!(obj instanceof GuacamoleProtocolVersion)'
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/GuacamoleProtocolVersion.java`
#### Snippet
```java
    public boolean equals(Object obj) {

        if (obj == null || !(obj instanceof GuacamoleProtocolVersion))
            return false;

```

### ConditionCoveredByFurtherCondition
Condition 'obj == null' covered by subsequent condition '!(obj instanceof ActivityRecordSearchTerm)'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ActivityRecordSearchTerm.java`
#### Snippet
```java
    public boolean equals(Object obj) {

        if (obj == null || !(obj instanceof ActivityRecordSearchTerm))
            return false;

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.protocol` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/Connectable.java`
#### Snippet
```java
     * @deprecated
     *     This function has been deprecated in favor of
     *     {@link #connect(org.apache.guacamole.protocol.GuacamoleClientInformation, java.util.Map)},
     *     which allows for connection parameter tokens to be injected and
     *     applied by cooperating extensions, replacing the functionality
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/Connectable.java`
#### Snippet
```java
     * @deprecated
     *     This function has been deprecated in favor of
     *     {@link #connect(org.apache.guacamole.protocol.GuacamoleClientInformation, java.util.Map)},
     *     which allows for connection parameter tokens to be injected and
     *     applied by cooperating extensions, replacing the functionality
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.protocol` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/Connectable.java`
#### Snippet
```java
     *     class. It continues to be defined on this interface for
     *     compatibility. <strong>New implementations should instead implement
     *     {@link #connect(org.apache.guacamole.protocol.GuacamoleClientInformation, java.util.Map)}.</strong>
     *
     * @param info
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/Connectable.java`
#### Snippet
```java
     *     class. It continues to be defined on this interface for
     *     compatibility. <strong>New implementations should instead implement
     *     {@link #connect(org.apache.guacamole.protocol.GuacamoleClientInformation, java.util.Map)}.</strong>
     *
     * @param info
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.protocol` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/DelegatingConnection.java`
#### Snippet
```java
    /**
     * The tokens which should apply strictly to the next call to
     * {@link #connect(org.apache.guacamole.protocol.GuacamoleClientInformation)}.
     * This storage is intended as a temporary bridge allowing the old version
     * of connect() to be overridden while still resulting in the same behavior
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingConnectionGroup.java`
#### Snippet
```java
    /**
     * Wraps the given ConnectionGroup such that the additional parameter
     * tokens added by {@link #addTokens(java.util.Map)} or returned by
     * {@link #getTokens()} are included with each invocation of connect(). Any
     * additional tokens which have the same name as existing tokens will
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingConnectionGroup.java`
#### Snippet
```java
 * tokens already supplied. If not supplying a static set of tokens at
 * construction time, implementations should override either
 * {@link #addTokens(java.util.Map)} or {@link #getTokens()} to provide tokens
 * dynamically.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingConnectionGroup.java`
#### Snippet
```java
     * provided when this instance of TokenInjectingConnection was created. If
     * the values of existing tokens need to be considered, implementations
     * should override {@link #addTokens(java.util.Map)} instead.
     *
     * @return
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.protocol` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ActiveConnection.java`
#### Snippet
```java
    /**
     * Returns whether this ActiveConnection may be joined through a call to
     * {@link #connect(org.apache.guacamole.protocol.GuacamoleClientInformation, java.util.Map)}
     * by the user that retrieved this ActiveConnection.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ActiveConnection.java`
#### Snippet
```java
    /**
     * Returns whether this ActiveConnection may be joined through a call to
     * {@link #connect(org.apache.guacamole.protocol.GuacamoleClientInformation, java.util.Map)}
     * by the user that retrieved this ActiveConnection.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.protocol` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ActiveConnection.java`
#### Snippet
```java
     *     true if the user that retrieved this ActiveConnection may join the
     *     ActiveConnection through a call to
     *     {@link #connect(org.apache.guacamole.protocol.GuacamoleClientInformation, java.util.Map)},
     *     false otherwise.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ActiveConnection.java`
#### Snippet
```java
     *     true if the user that retrieved this ActiveConnection may join the
     *     ActiveConnection through a call to
     *     {@link #connect(org.apache.guacamole.protocol.GuacamoleClientInformation, java.util.Map)},
     *     false otherwise.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingConnection.java`
#### Snippet
```java
     * provided when this instance of TokenInjectingConnection was created. If
     * the values of existing tokens need to be considered, implementations
     * should override {@link #addTokens(java.util.Map)} instead.
     *
     * @return
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingConnection.java`
#### Snippet
```java
    /**
     * Wraps the given Connection such that the additional parameter tokens
     * added by {@link #addTokens(java.util.Map)} or returned by
     * {@link #getTokens()} are included with each invocation of connect().
     * Any additional tokens which have the same name as existing tokens will
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingConnection.java`
#### Snippet
```java
 * underlying Connection, adding a given set of parameter tokens to the tokens
 * already supplied. If not supplying a static set of tokens at construction
 * time, implementations should override either {@link #addTokens(java.util.Map)}
 * or {@link #getTokens()} to provide tokens dynamically.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.protocol` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/DelegatingConnectionGroup.java`
#### Snippet
```java
    /**
     * The tokens which should apply strictly to the next call to
     * {@link #connect(org.apache.guacamole.protocol.GuacamoleClientInformation)}.
     * This storage is intended as a temporary bridge allowing the old version
     * of connect() to be overridden while still resulting in the same behavior
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.net.auth` is unnecessary, and can be replaced with an import
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleConnectionRecordSet.java`
#### Snippet
```java

    @Override
    public org.apache.guacamole.net.auth.ConnectionRecordSet sort(SortableProperty property, boolean desc)
            throws GuacamoleException {
        return this;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.net.auth` is unnecessary, and can be replaced with an import
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleConnectionRecordSet.java`
#### Snippet
```java
 */
@Deprecated
public class SimpleConnectionRecordSet implements org.apache.guacamole.net.auth.ConnectionRecordSet {

    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.net.auth` is unnecessary, and can be replaced with an import
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleConnectionRecordSet.java`
#### Snippet
```java

    @Override
    public org.apache.guacamole.net.auth.ConnectionRecordSet limit(int limit)
            throws GuacamoleException {
        return this;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.net.auth` is unnecessary, and can be replaced with an import
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleConnectionRecordSet.java`
#### Snippet
```java

    @Override
    public org.apache.guacamole.net.auth.ConnectionRecordSet contains(String value)
            throws GuacamoleException {
        return this;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.protocol` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleConnection.java`
#### Snippet
```java
     * function will always be the full configuration to be used to establish
     * the connection, as provided when this SimpleConnection was created or via
     * {@link #setConfiguration(org.apache.guacamole.protocol.GuacamoleConfiguration)}.
     *
     * @return
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.protocol` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleConnection.java`
#### Snippet
```java
     * be set before the SimpleConnection may be used. Parameter tokens within
     * the GuacamoleConfiguration eventually supplied with
     * {@link #setConfiguration(org.apache.guacamole.protocol.GuacamoleConfiguration)}
     * will not be interpreted.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.protocol` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleConnection.java`
#### Snippet
```java
    /**
     * The tokens which should apply strictly to the next call to
     * {@link #connect(org.apache.guacamole.protocol.GuacamoleClientInformation)}.
     * This storage is intended as a temporary bridge allowing the old version
     * of connect() to be overridden while still resulting in the same behavior
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.protocol` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleConnection.java`
#### Snippet
```java
     * be set before the SimpleConnection may be used. Parameter tokens within
     * the GuacamoleConfiguration eventually supplied with
     * {@link #setConfiguration(org.apache.guacamole.protocol.GuacamoleConfiguration)}
     * will not be interpreted unless explicitly requested.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.net.auth` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/event/AuthenticationFailureEvent.java`
#### Snippet
```java
     * if the failure is caused by every AuthenticationProvider passively
     * refusing to authenticate the user but without explicitly rejecting the
     * user (returning null for calls to {@link AuthenticationProvider#authenticateUser(org.apache.guacamole.net.auth.Credentials)}).
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.net.auth` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/event/AuthenticationFailureEvent.java`
#### Snippet
```java
     * is caused by every AuthenticationProvider passively refusing to
     * authenticate the user but without explicitly rejecting the user
     * (returning null for calls to {@link AuthenticationProvider#authenticateUser(org.apache.guacamole.net.auth.Credentials)}),
     * or if the failure is external to any installed AuthenticationProvider
     * (such as within a {@link Listener}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.net.auth` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/event/AuthenticationFailureEvent.java`
#### Snippet
```java
     * the failure is caused by every AuthenticationProvider passively refusing
     * to authenticate the user but without explicitly rejecting the user
     * (returning null for calls to {@link AuthenticationProvider#authenticateUser(org.apache.guacamole.net.auth.Credentials)}).
     */
    private final Throwable failure;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.net.auth` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/event/AuthenticationFailureEvent.java`
#### Snippet
```java
     * caused by every AuthenticationProvider passively refusing to
     * authenticate the user but without explicitly rejecting the user
     * (returning null for calls to {@link AuthenticationProvider#authenticateUser(org.apache.guacamole.net.auth.Credentials)}),
     * or if the failure is external to any installed AuthenticationProvider
     * (such as within a {@link Listener}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/event/ApplicationShutdownEvent.java`
#### Snippet
```java
 * down, including the authentication/authorization portion of extensions. Any
 * installed extensions are still loaded (such that they may receive this event
 * via {@link Listener#handleEvent(java.lang.Object)}, but their authentication
 * providers will have been shut down via {@link AuthenticationProvider#shutdown()},
 * and resources from user sessions will have been closed and released via
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleDirectory.java`
#### Snippet
```java
     * created to store the given objects. If the objects are already available
     * in Map form, it is more efficient to use the
     * {@link #SimpleDirectory(java.util.Map)} constructor.
     *
     * @param objects
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleDirectory.java`
#### Snippet
```java
     * objects. Note that a new Map will be created to store the given objects.
     * If the objects are already available in Map form, it is more efficient
     * to use the {@link #SimpleDirectory(java.util.Map)} constructor.
     *
     * @param objects
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/token/TokenName.java`
#### Snippet
```java
     * added prefix, such that the token name will simply be the transformed
     * version of the string. See
     * {@link #canonicalize(java.lang.String, java.lang.String)}
     * 
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/token/TokenName.java`
#### Snippet
```java
     * added prefix, such that the token name will simply be the transformed
     * version of the string. See
     * {@link #canonicalize(java.lang.String, java.lang.String)}
     * 
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/token/TokenFilter.java`
#### Snippet
```java
    /**
     * Creates a new TokenFilter which has no associated tokens. Tokens must
     * later be given using {@link #setToken(java.lang.String, java.lang.String)}
     * or {@link #setTokens(java.util.Map)}.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/token/TokenFilter.java`
#### Snippet
```java
    /**
     * Creates a new TokenFilter which has no associated tokens. Tokens must
     * later be given using {@link #setToken(java.lang.String, java.lang.String)}
     * or {@link #setTokens(java.util.Map)}.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/token/TokenFilter.java`
#### Snippet
```java
     * Creates a new TokenFilter which has no associated tokens. Tokens must
     * later be given using {@link #setToken(java.lang.String, java.lang.String)}
     * or {@link #setTokens(java.util.Map)}.
     */
    public TokenFilter() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.net.auth` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingUserContext.java`
#### Snippet
```java
     * Adds tokens to an in-progress call to connect() for the given
     * ConnectionGroup. If not overridden, this function will add the tokens
     * returned by {@link #getTokens(org.apache.guacamole.net.auth.ConnectionGroup)}.
     *
     * @param connectionGroup
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.net.auth` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingUserContext.java`
#### Snippet
```java
     * Adds tokens to an in-progress call to connect() for the given
     * Connection. If not overridden, this function will add the tokens
     * returned by {@link #getTokens(org.apache.guacamole.net.auth.Connection)}.
     *
     * @param connection
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.net.auth` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingUserContext.java`
#### Snippet
```java
     * TokenInjectingUserContext was created. If the values of existing tokens
     * need to be considered, implementations should override
     * {@link #addTokens(org.apache.guacamole.net.auth.Connection, java.util.Map)}
     * instead.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingUserContext.java`
#### Snippet
```java
     * TokenInjectingUserContext was created. If the values of existing tokens
     * need to be considered, implementations should override
     * {@link #addTokens(org.apache.guacamole.net.auth.Connection, java.util.Map)}
     * instead.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.net.auth` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingUserContext.java`
#### Snippet
```java
     * TokenInjectingUserContext was created. If the values of existing tokens
     * need to be considered, implementations should override
     * {@link #addTokens(org.apache.guacamole.net.auth.ConnectionGroup, java.util.Map)}
     * instead.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingUserContext.java`
#### Snippet
```java
     * TokenInjectingUserContext was created. If the values of existing tokens
     * need to be considered, implementations should override
     * {@link #addTokens(org.apache.guacamole.net.auth.ConnectionGroup, java.util.Map)}
     * instead.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.properties` is unnecessary and can be removed
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/LocalEnvironment.java`
#### Snippet
```java
 * environment variables will be automatically added by the Guacamole web
 * application and may also be added by extensions using
 * {@link #addGuacamoleProperties(org.apache.guacamole.properties.GuacamoleProperties)}.
 */
public class LocalEnvironment implements Environment {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/GuacamoleConfiguration.java`
#### Snippet
```java
     * <p>If this value is unavailable or remains unset, it is still possible
     * to join an established connection using
     * {@link #setConnectionID(java.lang.String)}, however protocol-specific
     * responses like the "required" and "argv" instructions might not be
     * possible to handle correctly if the underlying protocol is not made
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `guacamole-common/src/main/java/org/apache/guacamole/servlet/GuacamoleHTTPTunnelServlet.java`
#### Snippet
```java
     * session token such that future read/write requests to that tunnel will
     * be rejected. Each HTTP tunnel must be associated with a session token
     * unique to that tunnel via a call {@link #registerTunnel(java.lang.String, org.apache.guacamole.net.GuacamoleTunnel)}.
     * 
     * @param tunnelSessionToken
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.net` is unnecessary and can be removed
in `guacamole-common/src/main/java/org/apache/guacamole/servlet/GuacamoleHTTPTunnelServlet.java`
#### Snippet
```java
     * session token such that future read/write requests to that tunnel will
     * be rejected. Each HTTP tunnel must be associated with a session token
     * unique to that tunnel via a call {@link #registerTunnel(java.lang.String, org.apache.guacamole.net.GuacamoleTunnel)}.
     * 
     * @param tunnelSessionToken
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `guacamole-common/src/main/java/org/apache/guacamole/servlet/GuacamoleHTTPTunnelServlet.java`
#### Snippet
```java
     *
     * @deprecated
     *     This function has been deprecated in favor of {@link #registerTunnel(java.lang.String, org.apache.guacamole.net.GuacamoleTunnel)},
     *     which decouples identification of HTTP tunnel sessions from the
     *     tunnel UUID.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.net` is unnecessary and can be removed
in `guacamole-common/src/main/java/org/apache/guacamole/servlet/GuacamoleHTTPTunnelServlet.java`
#### Snippet
```java
     *
     * @deprecated
     *     This function has been deprecated in favor of {@link #registerTunnel(java.lang.String, org.apache.guacamole.net.GuacamoleTunnel)},
     *     which decouples identification of HTTP tunnel sessions from the
     *     tunnel UUID.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `guacamole-common/src/main/java/org/apache/guacamole/servlet/GuacamoleHTTPTunnelServlet.java`
#### Snippet
```java
     *
     * @deprecated
     *     This function has been deprecated in favor of {@link #deregisterTunnel(java.lang.String)},
     *     which decouples identification of HTTP tunnel sessions from the
     *     tunnel UUID.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `guacamole-common/src/main/java/org/apache/guacamole/servlet/GuacamoleHTTPTunnelServlet.java`
#### Snippet
```java
    /**
     * Returns the tunnel associated with the given tunnel-specific session
     * token, if it has been registered with {@link #registerTunnel(java.lang.String, org.apache.guacamole.net.GuacamoleTunnel)}
     * and not yet deregistered with {@link #deregisterTunnel(java.lang.String)}.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.net` is unnecessary and can be removed
in `guacamole-common/src/main/java/org/apache/guacamole/servlet/GuacamoleHTTPTunnelServlet.java`
#### Snippet
```java
    /**
     * Returns the tunnel associated with the given tunnel-specific session
     * token, if it has been registered with {@link #registerTunnel(java.lang.String, org.apache.guacamole.net.GuacamoleTunnel)}
     * and not yet deregistered with {@link #deregisterTunnel(java.lang.String)}.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `guacamole-common/src/main/java/org/apache/guacamole/servlet/GuacamoleHTTPTunnelServlet.java`
#### Snippet
```java
     * Returns the tunnel associated with the given tunnel-specific session
     * token, if it has been registered with {@link #registerTunnel(java.lang.String, org.apache.guacamole.net.GuacamoleTunnel)}
     * and not yet deregistered with {@link #deregisterTunnel(java.lang.String)}.
     *
     * @param tunnelSessionToken
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.net.auth` is unnecessary and can be removed
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/ModeledUserContext.java`
#### Snippet
```java
 */
public class ModeledUserContext extends RestrictedObject
    implements org.apache.guacamole.net.auth.UserContext {

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `guacamole/src/main/java/org/apache/guacamole/SystemEnvironmentGuacamoleProperties.java`
#### Snippet
```java
 * environment variables. The name of the environment variable corresponding to
 * any particular property is determined using
 * {@link TokenName#canonicalize(java.lang.String)}.
 */
public class SystemEnvironmentGuacamoleProperties implements GuacamoleProperties {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.guacamole.protocol` is unnecessary and can be removed
in `guacamole/src/main/java/org/apache/guacamole/net/auth/Connectable.java`
#### Snippet
```java
     *
     * <p>A default implementation which invokes the old, deprecated
     * {@link #connect(org.apache.guacamole.protocol.GuacamoleClientInformation)}
     * is provided solely for compatibility with extensions which implement only
     * the old version of this function. This default implementation is useful
```

## RuleId[id=SamePackageImport]
### SamePackageImport
Unnecessary import from the same package `import org.apache.guacamole.properties.GuacamoleProperty;`
in `guacamole/src/main/java/org/apache/guacamole/properties/StringSetProperty.java`
#### Snippet
```java
import java.util.regex.Pattern;
import org.apache.guacamole.GuacamoleException;
import org.apache.guacamole.properties.GuacamoleProperty;

/**
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `KsmDirectory()` of an abstract class should not be declared 'public'
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/user/KsmDirectory.java`
#### Snippet
```java
     *    The directory to delegate to.
     */
    public KsmDirectory(Directory<ObjectType> directory) {
        super(directory);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SSOAuthenticationProvider()` of an abstract class should not be declared 'public'
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-base/src/main/java/org/apache/guacamole/auth/sso/SSOAuthenticationProvider.java`
#### Snippet
```java
     *     injector.
     */
    public SSOAuthenticationProvider(
            Class<? extends SSOAuthenticationProviderService> authService,
            Class<? extends SSOResource> ssoResource,
```

### NonProtectedConstructorInAbstractClass
Constructor `SSOAuthenticationProvider()` of an abstract class should not be declared 'public'
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-base/src/main/java/org/apache/guacamole/auth/sso/SSOAuthenticationProvider.java`
#### Snippet
```java
     *     injector.
     */
    public SSOAuthenticationProvider(
            Class<? extends SSOAuthenticationProviderService> authService,
            Class<? extends SSOResource> ssoResource,
```

### NonProtectedConstructorInAbstractClass
Constructor `DecoratingActivityRecordSet()` of an abstract class should not be declared 'public'
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/DecoratingActivityRecordSet.java`
#### Snippet
```java
     *     The ActivityRecordSet whose records are being decorated.
     */
    public DecoratingActivityRecordSet(ActivityRecordSet<RecordType> recordSet) {
        super(recordSet);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractActivityLog()` of an abstract class should not be declared 'public'
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/AbstractActivityLog.java`
#### Snippet
```java
     *     A human-readable message that describes this log.
     */
    public AbstractActivityLog(Type type, TranslatableMessage description) {
        this.type = type;
        this.description = description;
```

### NonProtectedConstructorInAbstractClass
Constructor `DecoratingDirectory()` of an abstract class should not be declared 'public'
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/DecoratingDirectory.java`
#### Snippet
```java
     *     The Directory whose objects are being decorated.
     */
    public DecoratingDirectory(Directory<ObjectType> directory) {
        super(directory);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractGuacamoleTunnel()` of an abstract class should not be declared 'public'
in `guacamole-common/src/main/java/org/apache/guacamole/net/AbstractGuacamoleTunnel.java`
#### Snippet
```java
     * GuacamoleSocket.
     */
    public AbstractGuacamoleTunnel() {
        readerLock = new ReentrantLock();
        writerLock = new ReentrantLock();
```

### NonProtectedConstructorInAbstractClass
Constructor `EnumGuacamoleProperty()` of an abstract class should not be declared 'public'
in `guacamole-ext/src/main/java/org/apache/guacamole/properties/EnumGuacamoleProperty.java`
#### Snippet
```java
     *     this property.
     */
    public EnumGuacamoleProperty(Class<T> enumClass) {
        this(getValueMapping(enumClass));
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `EnumGuacamoleProperty()` of an abstract class should not be declared 'public'
in `guacamole-ext/src/main/java/org/apache/guacamole/properties/EnumGuacamoleProperty.java`
#### Snippet
```java
     *     {@code additional} is not even.
     */
    public EnumGuacamoleProperty(String key, T value, Object... additional)
            throws IllegalArgumentException {
        this(mapOf(key, value, additional));
```

### NonProtectedConstructorInAbstractClass
Constructor `EnumGuacamoleProperty()` of an abstract class should not be declared 'public'
in `guacamole-ext/src/main/java/org/apache/guacamole/properties/EnumGuacamoleProperty.java`
#### Snippet
```java
     *     constants.
     */
    public EnumGuacamoleProperty(Map<String, T> valueMapping) {
        this.valueMapping = valueMapping;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `VaultAuthenticationProviderModule()` of an abstract class should not be declared 'public'
in `extensions/guacamole-vault/modules/guacamole-vault-base/src/main/java/org/apache/guacamole/vault/VaultAuthenticationProviderModule.java`
#### Snippet
```java
     *     environment.
     */
    public VaultAuthenticationProviderModule() throws GuacamoleException {
        this.environment = LocalEnvironment.getInstance();
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `InjectedAuthenticationProvider()` of an abstract class should not be declared 'public'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/InjectedAuthenticationProvider.java`
#### Snippet
```java
     *     If the Injector cannot be created due to an error.
     */
    public InjectedAuthenticationProvider(JDBCInjectorProvider injectorProvider,
            Class<? extends AuthenticationProviderService> authProviderServiceClass)
        throws GuacamoleException {
```

### NonProtectedConstructorInAbstractClass
Constructor `JDBCEnvironment()` of an abstract class should not be declared 'public'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/JDBCEnvironment.java`
#### Snippet
```java
     * read properties from the file system.
     */
    public JDBCEnvironment() {
        super(LocalEnvironment.getInstance());
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ChildObjectModel()` of an abstract class should not be declared 'public'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ChildObjectModel.java`
#### Snippet
```java
     * Creates a new, empty object.
     */
    public ChildObjectModel() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `EntityModel()` of an abstract class should not be declared 'public'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/EntityModel.java`
#### Snippet
```java
     * Creates a new, empty entity.
     */
    public EntityModel() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `EntityModel()` of an abstract class should not be declared 'public'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/EntityModel.java`
#### Snippet
```java
     *     The type to assign to the new entity.
     */
    public EntityModel(EntityType type) {
        this.type = type;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ObjectModel()` of an abstract class should not be declared 'public'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ObjectModel.java`
#### Snippet
```java
     * Creates a new, empty object.
     */
    public ObjectModel() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `RemoteAuthenticatedUser()` of an abstract class should not be declared 'public'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/RemoteAuthenticatedUser.java`
#### Snippet
```java
     *     including groups inherited through membership in other groups.
     */
    public RemoteAuthenticatedUser(AuthenticationProvider authenticationProvider,
            Credentials credentials, Set<String> effectiveGroups) {
        this.authenticationProvider = authenticationProvider;
```

### NonProtectedConstructorInAbstractClass
Constructor `RelatedObjectSet()` of an abstract class should not be declared 'public'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/RelatedObjectSet.java`
#### Snippet
```java
     * initialized by a call to init().
     */
    public RelatedObjectSet() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `ObjectPermissionSet()` of an abstract class should not be declared 'public'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/permission/ObjectPermissionSet.java`
#### Snippet
```java
     * necessary to read and modify this set will be missing.
     */
    public ObjectPermissionSet() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `ActivityRecordSetResource()` of an abstract class should not be declared 'public'
in `guacamole/src/main/java/org/apache/guacamole/rest/history/ActivityRecordSetResource.java`
#### Snippet
```java
     *     The ActivityRecordSet whose records should be exposed.
     */
    public ActivityRecordSetResource(ActivityRecordSet<InternalRecordType> history) {
        this.history = history;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `DirectoryObjectResource()` of an abstract class should not be declared 'public'
in `guacamole/src/main/java/org/apache/guacamole/rest/directory/DirectoryObjectResource.java`
#### Snippet
```java
     *     object given.
     */
    public DirectoryObjectResource(AuthenticatedUser authenticatedUser,
            UserContext userContext, Class<InternalType> internalType,
            Directory<InternalType> directory, InternalType object,
```

### NonProtectedConstructorInAbstractClass
Constructor `DirectoryResource()` of an abstract class should not be declared 'public'
in `guacamole/src/main/java/org/apache/guacamole/rest/directory/DirectoryResource.java`
#### Snippet
```java
     *     representing individual objects contained within the given Directory.
     */
    public DirectoryResource(AuthenticatedUser authenticatedUser,
            UserContext userContext, Class<InternalType> internalType,
            Directory<InternalType> directory,
```

### NonProtectedConstructorInAbstractClass
Constructor `StreamInterceptingFilter()` of an abstract class should not be declared 'public'
in `guacamole/src/main/java/org/apache/guacamole/tunnel/StreamInterceptingFilter.java`
#### Snippet
```java
     *     sent.
     */
    public StreamInterceptingFilter(GuacamoleTunnel tunnel) {
        this.tunnel = tunnel;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractResource()` of an abstract class should not be declared 'public'
in `guacamole/src/main/java/org/apache/guacamole/resource/AbstractResource.java`
#### Snippet
```java
     *     midnight of January 1, 1970 UTC.
     */
    public AbstractResource(String mimetype, long lastModified) {
        this.mimetype = mimetype;
        this.lastModified = lastModified;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractResource()` of an abstract class should not be declared 'public'
in `guacamole/src/main/java/org/apache/guacamole/resource/AbstractResource.java`
#### Snippet
```java
     *     The mimetype of this resource.
     */
    public AbstractResource(String mimetype) {
        this(mimetype, System.currentTimeMillis());
    }
```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new MessageHandler.Whole() can be replaced with method reference
in `guacamole-common/src/main/java/org/apache/guacamole/websocket/GuacamoleWebSocketTunnelEndpoint.java`
#### Snippet
```java

        // Manually register message handler
        session.addMessageHandler(new MessageHandler.Whole<String>() {

            @Override
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/tunnel/ActiveConnectionMultimap.java`
#### Snippet
```java
            // Get set of active connection records, creating if necessary
            Set<ActiveConnectionRecord> connections = records.get(identifier);
            if (connections == null) {
                connections = Collections.synchronizedSet(Collections.newSetFromMap(new LinkedHashMap<ActiveConnectionRecord, Boolean>()));
                records.put(identifier, connections);
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new FilenameFilter() can be replaced with lambda
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/LocalEnvironment.java`
#### Snippet
```java
            // Get all JSON files
            File[] files = protocol_directory.listFiles(
                new FilenameFilter() {

                    @Override
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/tunnel/RestrictedGuacamoleTunnelService.java`
#### Snippet
```java
        // Sort connections in ascending order of usage
        ModeledConnection[] sortedConnections = connections.toArray(new ModeledConnection[connections.size()]);
        Arrays.sort(sortedConnections, new Comparator<ModeledConnection>() {

            @Override
```

### Convert2Lambda
Anonymous new FilenameFilter() can be replaced with lambda
in `guacamole/src/main/java/org/apache/guacamole/extension/DirectoryClassLoader.java`
#### Snippet
```java
        // Get list of URLs for all .jar's in the lib directory
        Collection<URL> jarURLs = new ArrayList<URL>();
        File[] files = dir.listFiles(new FilenameFilter() {

            @Override
```

### Convert2Lambda
Anonymous new FileFilter() can be replaced with lambda
in `guacamole/src/main/java/org/apache/guacamole/extension/ExtensionModule.java`
#### Snippet
```java

        // Retrieve list of all extension files within extensions directory
        File[] extensionFiles = extensionsDir.listFiles(new FileFilter() {

            @Override
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `attributes`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/conf/KsmAttributeService.java`
#### Snippet
```java

            // Remove the attribute from the map so it won't be updated
            attributes = new HashMap<>(attributes);
            attributes.remove(KsmAttributeService.KSM_CONFIGURATION_ATTRIBUTE);

```

### AssignmentToMethodParameter
Assignment to method parameter `attributes`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/conf/KsmAttributeService.java`
#### Snippet
```java
                // Make a copy of the existing attributes, modifying just the value for
                // KSM_CONFIGURATION_ATTRIBUTE
                attributes = new HashMap<>(attributes);
                attributes.put(
                        KsmAttributeService.KSM_CONFIGURATION_ATTRIBUTE, base64EncodedJson);
```

### AssignmentToMethodParameter
Assignment to method parameter `connectionGroup`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/user/KsmDirectoryService.java`
#### Snippet
```java
                // Unwrap the existing ConnectionGroup
                if (connectionGroup instanceof KsmConnectionGroup)
                    connectionGroup = ((KsmConnectionGroup) connectionGroup).getUnderlyingConnectionGroup();

                // Process attribute values before saving
```

### AssignmentToMethodParameter
Assignment to method parameter `user`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/user/KsmDirectoryService.java`
#### Snippet
```java
                // Unwrap the existing user
                if (user instanceof KsmUser)
                    user = ((KsmUser) user).getUnderlyingUser();

                // Process attribute values before saving
```

### AssignmentToMethodParameter
Assignment to method parameter `tokens`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingConnectionGroup.java`
#### Snippet
```java

        // Apply provided tokens over those given to connect()
        tokens = new HashMap<>(tokens);
        addTokens(tokens);

```

### AssignmentToMethodParameter
Assignment to method parameter `tokens`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingConnection.java`
#### Snippet
```java

        // Apply provided tokens over those given to connect()
        tokens = new HashMap<>(tokens);
        addTokens(tokens);

```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/FilteredGuacamoleWriter.java`
#### Snippet
```java
            int parsed;
            while ((parsed = parser.append(chunk, offset, length)) != 0) {
                offset += parsed;
                length -= parsed;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/FilteredGuacamoleWriter.java`
#### Snippet
```java
            while ((parsed = parser.append(chunk, offset, length)) != 0) {
                offset += parsed;
                length -= parsed;
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `parentIdentifier`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ModeledChildDirectoryObject.java`
#### Snippet
```java
        if (parentIdentifier != null
                && parentIdentifier.equals(RootConnectionGroup.IDENTIFIER))
            parentIdentifier = null;

        getModel().setParentIdentifier(parentIdentifier);
```

### AssignmentToMethodParameter
Assignment to method parameter `identifiers`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ModeledDirectoryObjectService.java`
#### Snippet
```java

        // Ignore invalid identifiers
        identifiers = filterIdentifiers(identifiers);

        // Do not query if no identifiers given
```

### AssignmentToMethodParameter
Assignment to method parameter `attributes`
in `extensions/guacamole-auth-totp/src/main/java/org/apache/guacamole/auth/totp/user/TOTPUser.java`
#### Snippet
```java

        // Create independent, mutable copy of attributes
        attributes = new HashMap<>(attributes);

        // Do not allow TOTP secret to be directly manipulated
```

### AssignmentToMethodParameter
Assignment to method parameter `tokens`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/tunnel/AbstractGuacamoleTunnelService.java`
#### Snippet
```java

            // Include history record UUID as token
            tokens = new HashMap<>(tokens);
            tokens.put("HISTORY_UUID", activeConnection.getUUID().toString());

```

### AssignmentToMethodParameter
Assignment to method parameter `authenticatedUser`
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/AuthenticationService.java`
#### Snippet
```java

            // Re-authenticate the AuthenticatedUser against the original AuthenticationProvider only
            authenticatedUser = authProvider.updateAuthenticatedUser(authenticatedUser, credentials);
            if (authenticatedUser == null)
                throw new GuacamoleSecurityException("User re-authentication failed.");
```

### AssignmentToMethodParameter
Assignment to method parameter `token`
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/TokenRESTService.java`
#### Snippet
```java

        // Create/update session producing possibly-new token
        token = authenticationService.authenticate(credentials, token);

        // Pull corresponding session
```

### AssignmentToMethodParameter
Assignment to method parameter `username`
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/TokenRESTService.java`
#### Snippet
```java
                    int colon = basicCredentials.indexOf(':');
                    if (colon != -1) {
                        username = basicCredentials.substring(0, colon);
                        password = basicCredentials.substring(colon + 1);
                    }
```

### AssignmentToMethodParameter
Assignment to method parameter `password`
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/TokenRESTService.java`
#### Snippet
```java
                    if (colon != -1) {
                        username = basicCredentials.substring(0, colon);
                        password = basicCredentials.substring(colon + 1);
                    }
                    else
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `guacamole/src/main/java/org/apache/guacamole/rest/history/APISortPredicate.java`
#### Snippet
```java
        if (value.startsWith(DESCENDING_PREFIX)) {
            descending = true;
            value = value.substring(DESCENDING_PREFIX.length());
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `identifiers`
in `guacamole/src/main/java/org/apache/guacamole/rest/directory/DirectoryView.java`
#### Snippet
```java
        // Reduce requested identifiers to only those which occur within the
        // originally-specified subset
        identifiers = new ArrayList<String>(identifiers);
        identifiers.retainAll(this.identifiers);

```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `underlyingStream`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/InterceptedStreamMap.java`
#### Snippet
```java

        // Wait for stream to close
        synchronized (underlyingStream) {
            while (streams.get(stream.getIndex()) == stream) {
                try {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `stream`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/InterceptedStreamMap.java`
#### Snippet
```java

        // Notify waiting threads that the stream has ended
        synchronized (stream) {
            stream.notify();
        }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-cas/src/main/java/org/apache/guacamole/auth/cas/conf/LdapNameGuacamoleProperty.java`
#### Snippet
```java
        // Consider null/empty values to be empty
        if (value == null || value.isEmpty())
            return null;

        // Parse provided value as an LDAP DN
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-cas/src/main/java/org/apache/guacamole/auth/cas/group/LDAPGroupParser.java`
#### Snippet
```java
        // Reject null/empty group names
        if (casGroup == null || casGroup.isEmpty())
            return null;

        // Parse group as an LDAP DN
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-cas/src/main/java/org/apache/guacamole/auth/cas/group/LDAPGroupParser.java`
#### Snippet
```java
            logger.debug("CAS group \"{}\" has been rejected as it is not a "
                    + "valid LDAP DN.", casGroup, e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-cas/src/main/java/org/apache/guacamole/auth/cas/group/LDAPGroupParser.java`
#### Snippet
```java
        // Reject any group that is not beneath the base DN
        if (baseDn != null && !group.startsWith(baseDn))
            return null;

        // If a specific name attribute is defined, restrict to groups that
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-saml/src/main/java/org/apache/guacamole/auth/saml/AuthenticationProviderService.java`
#### Snippet
```java
        HttpServletRequest request = credentials.getRequest();
        if (request == null)
            return null;

        // Use established SAML identity if already provided by the SAML IdP
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-cas/src/main/java/org/apache/guacamole/auth/cas/group/LDAPGroupParser.java`
#### Snippet
```java
        Rdn last = group.getRdn(group.size() - 1);
        if (nameAttribute != null && !nameAttribute.equalsIgnoreCase(last.getType()))
            return null;

        // The group name is the string value of the final attribute in the DN
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-saml/src/main/java/org/apache/guacamole/auth/saml/acs/AuthenticationSessionManager.java`
#### Snippet
```java
            return session.getIdentity();

        return null;

    }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-saml/src/main/java/org/apache/guacamole/auth/saml/acs/AuthenticationSessionManager.java`
#### Snippet
```java
        }

        return null;

    }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-cas/src/main/java/org/apache/guacamole/auth/cas/conf/PrivateKeyGuacamoleProperty.java`
#### Snippet
```java

        if (value == null || value.isEmpty())
            return null;

        FileInputStream keyStreamIn = null;
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-cas/src/main/java/org/apache/guacamole/auth/cas/ticket/TicketValidationService.java`
#### Snippet
```java
        if (encryptedPassword == null || encryptedPassword.isEmpty()) {
            logger.warn("No or empty encrypted password, no password will be available.");
            return null;
        }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-cas/src/main/java/org/apache/guacamole/auth/cas/ticket/TicketValidationService.java`
#### Snippet
```java
        if (clearpassKey == null) {
            logger.debug("No private key available to decrypt password.");
            return null;
        }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/AuthenticationProviderService.java`
#### Snippet
```java
        // authenticated itself
        if (!(authenticatedUser instanceof AuthenticatedUser))
            return null;

        // Return UserContext containing data from the authenticated user's
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserData.java`
#### Snippet
```java
     */
    public Map<String, Connection> getConnections() {
        return connections == null ? null : Collections.unmodifiableMap(connections);
    }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/conf/StringListProperty.java`
#### Snippet
```java
        // If no property provided, return null.
        if (values == null)
            return null;

        // Split string into a list of individual values
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/conf/StringListProperty.java`
#### Snippet
```java
        List<String> stringValues = Arrays.asList(DELIMITER_PATTERN.split(values));
        if (stringValues.isEmpty())
            return null;

        return stringValues;
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/conf/LdapDnGuacamoleProperty.java`
#### Snippet
```java

        if (value == null)
            return null;

        try {
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserDataService.java`
#### Snippet
```java
        HttpServletRequest request = credentials.getRequest();
        if (request == null)
            return null;

        // Abort if the request itself is not allowed
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserDataService.java`
#### Snippet
```java
        // Abort if the request itself is not allowed
        if (!requestService.isAuthenticationAllowed(request))
            return null;

        // Pull base64-encoded, encrypted JSON data from HTTP request, if any
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserDataService.java`
#### Snippet
```java
        String base64 = request.getParameter(ENCRYPTED_DATA_PARAMETER);
        if (base64 == null)
            return null;

        // Decrypt base64-encoded parameter
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserDataService.java`
#### Snippet
```java
            if (decrypted.length <= CryptoService.SIGNATURE_LENGTH) {
                logger.warn("Submitted data is too small to contain both a signature and JSON.");
                return null;
            }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserDataService.java`
#### Snippet
```java
            if (!Arrays.equals(receivedSignature, correctSignature)) {
                logger.warn("Signature of submitted data is incorrect.");
                return null;
            }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserDataService.java`
#### Snippet
```java
            logger.warn("Submitted data is not proper base64.");
            logger.debug("Invalid base64 data.", e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserDataService.java`
#### Snippet
```java
            logger.error("Unexpected lack of support for UTF-8: {}", e.getMessage());
            logger.debug("Unable to decode base64 data as UTF-8.", e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserDataService.java`
#### Snippet
```java
            logger.error("Decryption of received data failed: {}", e.getMessage());
            logger.debug("Unable to decrypt received data.", e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserDataService.java`
#### Snippet
```java
            UserData userData = mapper.readValue(json, UserData.class);
            if (userData.isExpired())
                return null;

            // Reject if data is single-use and already present in the denylist
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserDataService.java`
#### Snippet
```java
            // Reject if data is single-use and already present in the denylist
            if (userData.isSingleUse() && !denylist.add(userData, correctSignature))
                return null;

            return userData;
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserDataService.java`
#### Snippet
```java
            logger.error("Received JSON is invalid: {}", e.getMessage());
            logger.debug("Error parsing UserData JSON.", e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/connection/ConnectionService.java`
#### Snippet
```java
            String id = activeConnections.get(primaryConnection);
            if (id == null)
                return null;

            config.setConnectionID(id);
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserDataConnection.java`
#### Snippet
```java
    @Override
    public Date getLastActive() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/conf/DefaultLDAPConfiguration.java`
#### Snippet
```java
    @Override
    public String getSearchBindDN() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/conf/DefaultLDAPConfiguration.java`
#### Snippet
```java
    @Override
    public Dn getGroupBaseDN() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/conf/DefaultLDAPConfiguration.java`
#### Snippet
```java
    @Override
    public Dn getConfigurationBaseDN() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/conf/DefaultLDAPConfiguration.java`
#### Snippet
```java
    @Override
    public String appliesTo(String username) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/conf/DefaultLDAPConfiguration.java`
#### Snippet
```java
    @Override
    public String getSearchBindPassword() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/conf/LdapFilterGuacamoleProperty.java`
#### Snippet
```java
        // No value provided, so return null.
        if (value == null)
            return null;

        try {
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/AuthenticationProviderService.java`
#### Snippet
```java
                logger.error("Unable to bind using search DN \"{}\"",
                        searchBindLogon);
                return null;
            }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/AuthenticationProviderService.java`
#### Snippet
```java
                List<Dn> userDNs = userService.getUserDNs(config, searchConnection, username);
                if (userDNs.isEmpty())
                    return null;

                // Warn if multiple DNs exist for the same user
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/AuthenticationProviderService.java`
#### Snippet
```java
                if (userDNs.size() != 1) {
                    logger.warn("Multiple DNs possible for user \"{}\": {}", username, userDNs);
                    return null;
                }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/AuthenticationProviderService.java`
#### Snippet
```java
        if (configs.isEmpty()) {
            logger.info("Skipping LDAP authentication as no LDAP servers are configured.");
            return null;
        }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/AuthenticationProviderService.java`
#### Snippet
```java
        // No LDAP connection/authentication attempt succeeded
        logger.info("User \"{}\" did not successfully authenticate against any LDAP server.", username);
        return null;

    }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/AuthenticationProviderService.java`
#### Snippet
```java
        }

        return null;

    }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/LDAPConnectionService.java`
#### Snippet
```java
            logger.debug("Cannot bind using invalid DN.", e);
            ldapConnection.close();
            return null;
        }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/LDAPConnectionService.java`
#### Snippet
```java
            logger.debug("Bind attempt with LDAP server as user \"{}\" failed.",
                    bindUser, e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/LDAPConnectionService.java`
#### Snippet
```java
                    e.getMessage());
            logger.debug("Unable to bind to LDAP server.", e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/user/UserService.java`
#### Snippet
```java
                    logger.warn("User \"{}\" is missing a username attribute "
                            + "and will be ignored.", entry.getDn().toString());
                    return null;
                }
                
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/user/UserService.java`
#### Snippet
```java
            catch (LdapInvalidAttributeValueException e) {
                
                return null;
            }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/user/UserService.java`
#### Snippet
```java
                      + "in your \"guacamole.properties\".",
                      LDAPGuacamoleProperties.LDAP_SEARCH_BIND_DN.getName()));
            return null;
        }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/conf/JacksonLDAPConfiguration.java`
#### Snippet
```java
        }

        return null;

    }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/group/UserGroupService.java`
#### Snippet
```java
            }
            catch (LdapInvalidAttributeValueException e) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/group/UserGroupService.java`
#### Snippet
```java
            logger.debug("User group \"{}\" is missing a name attribute "
                    + "and will be ignored.", entry.getDn().toString());
            return null;

        });
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/connection/ConnectionService.java`
#### Snippet
```java
                    logger.warn("{} is missing a {}.",
                            CONNECTION_LDAP_OBJECT_CLASS, LDAP_ATTRIBUTE_NAME_ID);
                    return null;
                }
                
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/connection/ConnectionService.java`
#### Snippet
```java
                            LDAP_ATTRIBUTE_NAME_ID, e.getMessage());
                    logger.debug("LDAP exception while getting CN attribute.", e);
                    return null;
                }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/connection/ConnectionService.java`
#### Snippet
```java
                            CONNECTION_LDAP_OBJECT_CLASS,
                            cnName, LDAP_ATTRIBUTE_NAME_PROTOCOL);
                    return null;
                }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/connection/ConnectionService.java`
#### Snippet
```java
                            e.getMessage());
                    logger.debug("LDAP exception when getting protocol value.", e);
                    return null;
                }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/connection/ConnectionService.java`
#### Snippet
```java
                            logger.debug("LDAP exception when getting parameter value.",
                                    e);
                            return null;
                        }
                        parameterAttribute.remove(parameter);
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-openid/src/main/java/org/apache/guacamole/auth/openid/token/TokenValidationService.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-openid/src/main/java/org/apache/guacamole/auth/openid/token/TokenValidationService.java`
#### Snippet
```java

        // Could not retrieve username from JWT
        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/conf/KsmAttributeService.java`
#### Snippet
```java
        // If the configuration value is empty, expose a null value
        else
            return null;

    }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/ObjectQueryService.java`
#### Snippet
```java

        // No identifier attribute is present on the entry
        return null;

    }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmClient.java`
#### Snippet
```java
                        + "Keeper records and cannot be used to locate "
                        + "individual secrets.", domain);
                return null;
            }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmClient.java`
#### Snippet
```java
                        + "cannot be used to locate individual secrets.",
                        username, domain);
                return null;
            }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmClient.java`
#### Snippet
```java
                        + "multiple Keeper records and cannot be used to "
                        + "locate individual secrets.", hostname);
                return null;
            }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/user/KsmDirectoryService.java`
#### Snippet
```java
                // Do not process the ConnectionGroup further if it does not exist
                if (object == null)
                    return null;

                // Sanitize values when a ConnectionGroup is fetched from the directory
```

### ReturnNull
Return of `null`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/user/KsmDirectoryService.java`
#### Snippet
```java
                // Do not process the user further if it does not exist
                if (object == null)
                    return null;

                // Sanitize values when a user is fetched from the directory
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ConnectionRecord.java`
#### Snippet
```java
    @Override
    public default UUID getUUID() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/AbstractUser.java`
#### Snippet
```java
    @Override
    public Date getLastActive() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/AbstractAuthenticationProvider.java`
#### Snippet
```java
    public AuthenticatedUser authenticateUser(Credentials credentials)
            throws GuacamoleException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/AbstractAuthenticationProvider.java`
#### Snippet
```java
    @Override
    public Object getResource() throws GuacamoleException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/AbstractAuthenticationProvider.java`
#### Snippet
```java
    public UserContext getUserContext(AuthenticatedUser authenticatedUser)
            throws GuacamoleException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/AbstractUserContext.java`
#### Snippet
```java
    @Override
    public Object getResource() throws GuacamoleException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/DecoratingActivityRecordSet.java`
#### Snippet
```java
            return decorate(record);

        return null;

    }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java
            return getSingleStringValue(hiddenField.getValue());

        return null;

    }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java

        if (values == null || values.size() != 1)
            return null;

        return values.get(0);
```

### ReturnNull
Return of `null`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java
        List<KeeperFile> files = record.getFiles();
        if (files == null)
            return null;

        KeeperFile foundFile = null;
```

### ReturnNull
Return of `null`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java
            // Ignore ambiguous fields
            if (foundFile != null)
                return null;

            foundFile = file;
```

### ReturnNull
Return of `null`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java
            return getSingleStringValue(hiddenField.getValue());

        return null;

    }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java
            // Ignore ambiguous fields
            if (foundField != null)
                return null;

            // Tentative match found - we can use this as long as no other
```

### ReturnNull
Return of `null`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java
            return getSingleStringValue(hiddenField.getValue());

        return null;

    }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java
            return getSingleStringValue(hiddenField.getValue());

        return null;

    }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java
            return value;

        return null;

    }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java
        T value = getSingleValue(values);
        if (value == null)
            return null;

        return mapper.apply(value);
```

### ReturnNull
Return of `null`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java
            return value;

        return null;

    }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java
            return getSingleStringValue(hiddenField.getValue());

        return null;

    }
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ActivityRecord.java`
#### Snippet
```java
    public default String getIdentifier() {
        UUID uuid = getUUID();
        return uuid != null ? uuid.toString() : null;
    }

```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/ActivityRecord.java`
#### Snippet
```java
     */
    public default UUID getUUID() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/Directory.java`
#### Snippet
```java
            }

            return null;

        }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmSecretService.java`
#### Snippet
```java
        // If user-specific KSM config is disabled globally or for the given
        // connectable, return null to indicate that no user config exists
        return null;
    }

```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/DecoratingDirectory.java`
#### Snippet
```java
            return decorate(object);

        return null;

    }
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleAuthenticationProvider.java`
#### Snippet
```java
        // Return as unauthorized if not authorized to retrieve configs
        if (configs == null)
            return null;

        // Return user context restricted to authorized configs
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleAuthenticationProvider.java`
#### Snippet
```java
        // Return as unauthorized if not authorized to retrieve configs
        if (configs == null)
            return null;

        return new SimpleAuthenticatedUser(credentials, configs);
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleConnection.java`
#### Snippet
```java
    @Override
    public Date getLastActive() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/xml/DocumentHandler.java`
#### Snippet
```java
        // If no state, return null
        if (stack.isEmpty())
            return null;

        return stack.getLast();
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/form/TimeZoneField.java`
#### Snippet
```java
        // Return null if no time zone provided
        if (timeZone == null || timeZone.isEmpty())
            return null;

        // Otherwise, assume time zone is valid
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/form/DateField.java`
#### Snippet
```java
    public static String format(Date date) {
        DateFormat dateFormat = new SimpleDateFormat(DateField.FORMAT);
        return date == null ? null : dateFormat.format(date);
    }

```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/form/DateField.java`
#### Snippet
```java
        // Return null if no date provided
        if (dateString == null || dateString.isEmpty())
            return null;

        // Parse date according to format
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/form/LanguageField.java`
#### Snippet
```java
        // Return null if no language is provided
        if (language == null || language.isEmpty())
            return null;

        // Otherwise, assume language is already a valid language ID
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/form/TextField.java`
#### Snippet
```java
        // Return null if no value provided
        if (str == null || str.isEmpty())
            return null;

        // Otherwise, return string unmodified
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/form/NumericField.java`
#### Snippet
```java
        // Return null if no value provided
        if (i == null)
            return null;

        // Convert to string
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/form/NumericField.java`
#### Snippet
```java
        // Return null if no value provided
        if (str == null || str.isEmpty())
            return null;

        // Parse as integer
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/form/TimeField.java`
#### Snippet
```java
        // Return null if no time provided
        if (timeString == null || timeString.isEmpty())
            return null;

        // Parse time according to format
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/form/TimeField.java`
#### Snippet
```java
    public static String format(Date time) {
        DateFormat timeFormat = new SimpleDateFormat(TimeField.FORMAT);
        return time == null ? null : timeFormat.format(time);
    }

```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleUserContext.java`
#### Snippet
```java
    @Override
    public Object getResource() throws GuacamoleException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/properties/StringListProperty.java`
#### Snippet
```java
        // If no property provided, return null.
        if (values == null)
            return null;

        // Split string into a list of individual values
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/properties/StringListProperty.java`
#### Snippet
```java
        List<String> stringValues = Arrays.asList(DELIMITER_PATTERN.split(values));
        if (stringValues.isEmpty())
            return null;

        return stringValues;
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/properties/URIGuacamoleProperty.java`
#### Snippet
```java
        // If nothing is provided, just return null.
        if (value == null)
            return null;
        
        try {
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/properties/FileGuacamoleProperty.java`
#### Snippet
```java
        // If no property provided, return null.
        if (value == null)
            return null;

        return new File(value);
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/properties/PropertiesGuacamoleProperties.java`
#### Snippet
```java
        String value = properties.getProperty(name);
        if (value == null)
            return null;

        return value.trim();
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/properties/IntegerGuacamoleProperty.java`
#### Snippet
```java
        // If no property provided, return null.
        if (value == null)
            return null;

        try {
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/properties/LongGuacamoleProperty.java`
#### Snippet
```java
        // If no property provided, return null.
        if (value == null)
            return null;

        try {
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/properties/TimeZoneGuacamoleProperty.java`
#### Snippet
```java
        // Nothing in, nothing out
        if (value == null || value.isEmpty())
            return null;
        
        // Attempt to return the TimeZone of the provided string value.
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/properties/ByteArrayProperty.java`
#### Snippet
```java
        // If no property provided, return null.
        if (value == null)
            return null;

        // Return value parsed from hex
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/properties/BooleanGuacamoleProperty.java`
#### Snippet
```java
        // If no property provided, return null.
        if (value == null)
            return null;

        // If "true", return true
```

### ReturnNull
Return of `null`
in `guacamole-common/src/main/java/org/apache/guacamole/net/GuacamoleSocket.java`
#### Snippet
```java
     */
    public default String getProtocol() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/GuacamoleProtocolVersion.java`
#### Snippet
```java
        Matcher versionMatcher = VERSION_PATTERN.matcher(version);
        if (!versionMatcher.matches())
            return null;

        // Parse version number from version string
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/environment/LocalEnvironment.java`
#### Snippet
```java

        // No such property
        return null;

    }
```

### ReturnNull
Return of `null`
in `guacamole-common/src/main/java/org/apache/guacamole/io/ReaderGuacamoleReader.java`
#### Snippet
```java
        // If EOF, return EOF
        if (instructionBuffer == null)
            return null;

        // Start of element
```

### ReturnNull
Return of `null`
in `guacamole-common/src/main/java/org/apache/guacamole/io/ReaderGuacamoleReader.java`
#### Snippet
```java
                int numRead = input.read(buffer, usedLength, buffer.length - usedLength);
                if (numRead == -1)
                    return null;

                // Update used length
```

### ReturnNull
Return of `null`
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/FilteredGuacamoleReader.java`
#### Snippet
```java
        GuacamoleInstruction filteredInstruction = readInstruction();
        if (filteredInstruction == null)
            return null;

        return filteredInstruction.toString().toCharArray();
```

### ReturnNull
Return of `null`
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/FilteredGuacamoleReader.java`
#### Snippet
```java
            GuacamoleInstruction unfilteredInstruction = reader.readInstruction();
            if (unfilteredInstruction == null)
                return null;

            // Apply filter
```

### ReturnNull
Return of `null`
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/GuacamoleStatus.java`
#### Snippet
```java

        // No such status found
        return null;

    }
```

### ReturnNull
Return of `null`
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/GuacamoleParser.java`
#### Snippet
```java
        // No instruction to return if not yet complete
        if (state != State.COMPLETE)
            return null;
        
        // Reset for next instruction.
```

### ReturnNull
Return of `null`
in `guacamole-ext/src/main/java/org/apache/guacamole/properties/EnumGuacamoleProperty.java`
#### Snippet
```java
        // Simply pass through null values
        if (value == null)
            return null;

        // Translate values based on explicit string/constant mapping
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-duo/src/main/java/org/apache/guacamole/auth/duo/DuoAuthenticationProvider.java`
#### Snippet
```java
        // User has been verified, and authentication should be allowed to
        // continue
        return null;

    }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-history-recording-storage/src/main/java/org/apache/guacamole/history/connection/HistoryConnectionRecord.java`
#### Snippet
```java
        }

        return null;

    }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-history-recording-storage/src/main/java/org/apache/guacamole/history/connection/HistoryConnectionRecord.java`
#### Snippet
```java
            logger.warn("Ignoring file \"{}\" relevant to connection history "
                    + "record as it cannot be read.", file);
            return null;
        }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-history-recording-storage/src/main/java/org/apache/guacamole/history/connection/HistoryConnectionRecord.java`
#### Snippet
```java
        if (logType == null) {
            logger.warn("Recording/log type of \"{}\" cannot be determined.", file);
            return null;
        }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-duo/src/main/java/org/apache/guacamole/auth/duo/api/SignedDuoCookie.java`
#### Snippet
```java

            // No such cookie type exists
            return null;

        }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-vault/modules/guacamole-vault-base/src/main/java/org/apache/guacamole/vault/conf/VaultConfigurationService.java`
#### Snippet
```java
                    String secretName = super.getProperty(name);
                    if (secretName == null)
                        return null;

                    return secretService.getValue(secretName).get();
```

### ReturnNull
Return of `null`
in `guacamole-common/src/main/java/org/apache/guacamole/websocket/GuacamoleWebSocketTunnelEndpoint.java`
#### Snippet
```java
                    }

                    return null;

                }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/JDBCAuthenticationProviderService.java`
#### Snippet
```java
        // connection sharing links
        if (authenticatedUser instanceof SharedAuthenticatedUser)
            return null;

        // Set semantic flags based on context
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ModeledActivityRecordSet.java`
#### Snippet
```java

        if (records.isEmpty())
            return null;

        if (records.size() == 1)
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ModeledActivityRecordSet.java`
#### Snippet
```java
                + "not be possible and may indicate a bug or database "
                + "corruption.", identifier);
        return null;

    }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ModeledActivityRecord.java`
#### Snippet
```java
        Integer id = model.getRecordID();
        if (id == null)
            return null;

        // Convert record ID to a name UUID in the given namespace
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ModeledActivityRecord.java`
#### Snippet
```java
        Integer id = model.getRecordID();
        if (id == null)
            return null;

        return id.toString();
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ModeledDirectoryObjectService.java`
#### Snippet
```java
        // If no such object, return null
        if (objects.isEmpty())
            return null;

        // The object collection will have exactly one element unless the
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/ModeledUserContext.java`
#### Snippet
```java
    @Override
    public Object getResource() throws GuacamoleException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/ConnectionSharingService.java`
#### Snippet
```java
        HttpServletRequest request = credentials.getRequest();
        if (request == null)
            return null;

        // Retrieve the share key from the request
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/ConnectionSharingService.java`
#### Snippet
```java
        String shareKey = getShareKey(credentials);
        if (shareKey == null || connectionMap.get(shareKey) == null)
            return null;

        // Return temporary in-memory user
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/HashSharedConnectionMap.java`
#### Snippet
```java
        // There are no null share keys
        if (key == null)
            return null;

        // Attempt to retrieve only if non-null
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/HashSharedConnectionMap.java`
#### Snippet
```java
        SharedConnectionDefinition definition = connectionMap.remove(key);
        if (definition == null)
            return null;

        // Close all associated tunnels and disallow further sharing
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/HashSharedConnectionMap.java`
#### Snippet
```java
        // There are no null share keys
        if (key == null)
            return null;

        // Update the last access time and return the SharedConnectionDefinition
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/UserService.java`
#### Snippet
```java
        UserModel userModel = userMapper.selectOne(username);
        if (userModel == null)
            return null;

        // Verify provided password is correct
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/UserService.java`
#### Snippet
```java
        byte[] hash = encryptionService.createPasswordHash(password, userModel.getPasswordSalt());
        if (!Arrays.equals(hash, userModel.getPasswordHash()))
            return null;

        // Create corresponding user object, set up cyclic reference
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/UserService.java`
#### Snippet
```java
        UserModel userModel = userMapper.selectOne(authenticatedUser.getIdentifier());
        if (userModel == null)
            return null;

        // Create corresponding user object, set up cyclic reference
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/user/SharedUser.java`
#### Snippet
```java

        // History is not recorded for shared users
        return null;

    }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/user/SharedUser.java`
#### Snippet
```java
    @Override
    public String getPassword() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/connection/SharedConnectionDirectory.java`
#### Snippet
```java
        // Allow access only to registered share keys
        if (!shareKeys.contains(identifier))
            return null;

        // Retrieve the connection definition associated with that share key,
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/connection/SharedConnectionDirectory.java`
#### Snippet
```java
        if (connectionDefinition == null) {
            shareKeys.remove(identifier);
            return null;
        }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connection/ConnectionModel.java`
#### Snippet
```java
        Integer id = getObjectID();
        if (id == null)
            return null;

        // Otherwise, the identifier is the ID as a string
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/connection/SharedConnection.java`
#### Snippet
```java
    @Override
    public Date getLastActive() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/ModeledUser.java`
#### Snippet
```java
        Time start = getModel().getAccessWindowStart();
        if (start == null)
            return null;

        // Return within defined time zone, current day
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/ModeledUser.java`
#### Snippet
```java
        Date validUntil = getModel().getValidUntil();
        if (validUntil == null)
            return null;

        // Convert to end-of-day within defined time zone
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/ModeledUser.java`
#### Snippet
```java
        java.util.Date parsedDate = TimeField.parse(timeString);
        if (parsedDate == null)
            return null;

        // Convert to SQL Time 
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/ModeledUser.java`
#### Snippet
```java
        Time end = getModel().getAccessWindowEnd();
        if (end == null)
            return null;

        // Return within defined time zone, current day
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/ModeledUser.java`
#### Snippet
```java
        java.util.Date parsedDate = DateField.parse(dateString);
        if (parsedDate == null)
            return null;

        // Convert to SQL Date
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/ModeledUser.java`
#### Snippet
```java
        Date validFrom = getModel().getValidFrom();
        if (validFrom == null)
            return null;

        // Convert to midnight within defined time zone
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharingprofile/SharingProfileModel.java`
#### Snippet
```java
        Integer id = getObjectID();
        if (id == null)
            return null;

        // Otherwise, the identifier is the ID as a string
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connectiongroup/ConnectionGroupModel.java`
#### Snippet
```java
        Integer id = getObjectID();
        if (id == null)
            return null;

        // Otherwise, the identifier is the ID as a string
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connectiongroup/RootConnectionGroup.java`
#### Snippet
```java
    @Override
    public String getParentIdentifier() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/activeconnection/ActiveConnectionService.java`
#### Snippet
```java
        // If no such object, return null
        if (objects.isEmpty())
            return null;

        // The object collection will have exactly one element unless the
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-totp/src/main/java/org/apache/guacamole/auth/totp/user/UserVerificationService.java`
#### Snippet
```java

            // Fail if key cannot be set
            return null;

        }
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-totp/src/main/java/org/apache/guacamole/auth/totp/user/UserVerificationService.java`
#### Snippet
```java
            logger.warn("TOTP key of user \"{}\" is not valid base32.", self.getIdentifier());
            logger.debug("TOTP key is not valid base32.", e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-quickconnect/src/main/java/org/apache/guacamole/auth/quickconnect/QuickConnectionGroup.java`
#### Snippet
```java
        if (connectionIdentifiers.add(identifier))
            return identifier;
        return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-totp/src/main/java/org/apache/guacamole/auth/totp/form/AuthenticationCodeField.java`
#### Snippet
```java
        // Do not reveal TOTP mode unless enrollment is in progress
        if (key == null)
            return null;

        return BASE32.encode(key.getSecret());
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-totp/src/main/java/org/apache/guacamole/auth/totp/form/AuthenticationCodeField.java`
#### Snippet
```java
        URI keyURI = getKeyUri();
        if (keyURI == null)
            return null;

        ByteArrayOutputStream stream = new ByteArrayOutputStream();
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-totp/src/main/java/org/apache/guacamole/auth/totp/form/AuthenticationCodeField.java`
#### Snippet
```java
        // Do not reveal TOTP mode unless enrollment is in progress
        if (key == null)
            return null;

        return key.getUsername();
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-totp/src/main/java/org/apache/guacamole/auth/totp/form/AuthenticationCodeField.java`
#### Snippet
```java
        // Do not reveal TOTP mode unless enrollment is in progress
        if (key == null)
            return null;

        return confService.getMode();
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-totp/src/main/java/org/apache/guacamole/auth/totp/form/AuthenticationCodeField.java`
#### Snippet
```java
        // Do not reveal code period unless enrollment is in progress
        if (key == null)
            return null;

        return confService.getPeriod();
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-totp/src/main/java/org/apache/guacamole/auth/totp/form/AuthenticationCodeField.java`
#### Snippet
```java
        // Do not generate a key URI if no key is being exposed
        if (key == null)
            return null;

        // Format "otpauth" URL (see https://github.com/google/google-authenticator/wiki/Key-Uri-Format)
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-totp/src/main/java/org/apache/guacamole/auth/totp/form/AuthenticationCodeField.java`
#### Snippet
```java
        // Do not reveal code issuer unless enrollment is in progress
        if (key == null)
            return null;

        return confService.getIssuer();
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-totp/src/main/java/org/apache/guacamole/auth/totp/form/AuthenticationCodeField.java`
#### Snippet
```java
        // Do not reveal code size unless enrollment is in progress
        if (key == null)
            return null;

        return confService.getDigits();
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/auth/file/UserMappingTagHandler.java`
#### Snippet
```java
            return new AuthorizeTagHandler(user_mapping);

        return null;

    }
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/auth/file/ConnectionTagHandler.java`
#### Snippet
```java
            return new ProtocolTagHandler(config);

        return null;

    }
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/auth/file/AuthorizeTagHandler.java`
#### Snippet
```java
        }

        return null;

    }
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/rest/TokenParamProvider.java`
#### Snippet
```java

        if (parameter.getAnnotation(TokenParam.class) == null)
            return null;

        return (request) -> authenticationService.getAuthenticationToken(request);
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/auth/file/FileAuthenticationProvider.java`
#### Snippet
```java
        UserMapping userMapping = getUserMapping();
        if (userMapping == null)
            return null;

        // Validate and return info for given user and pass
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/auth/file/FileAuthenticationProvider.java`
#### Snippet
```java

        // Unauthorized
        return null;

    }
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/auth/file/FileAuthenticationProvider.java`
#### Snippet
```java
        if (!userMappingFile.exists()) {
            logger.debug("User mapping file \"{}\" does not exist and will not be read.", userMappingFile);
            return null;
        }

```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/auth/file/FileAuthenticationProvider.java`
#### Snippet
```java
                logger.error("Unable to create XML parser for reading \"{}\": {}", USER_MAPPING_FILENAME, e.getMessage());
                logger.debug("An instance of SAXParser could not be created.", e);
                return null;
            }
            catch (SAXException e) {
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/auth/file/FileAuthenticationProvider.java`
#### Snippet
```java
                logger.error("Unable to create XML parser for reading \"{}\": {}", USER_MAPPING_FILENAME, e.getMessage());
                logger.debug("An instance of SAXParser could not be created.", e);
                return null;
            }

```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/auth/file/FileAuthenticationProvider.java`
#### Snippet
```java
                logger.warn("Unable to read user mapping file \"{}\": {}", userMappingFile, e.getMessage());
                logger.debug("Error reading user mapping file.", e);
                return null;
            }

```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/auth/file/FileAuthenticationProvider.java`
#### Snippet
```java
                logger.warn("User mapping file \"{}\" is not valid: {}", userMappingFile, e.getMessage());
                logger.debug("Error parsing user mapping file.", e);
                return null;
            }

```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/auth/file/Authorization.java`
#### Snippet
```java
        // If null byte array given, return null
        if (bytes == null)
            return null;

        // Create string builder for holding the hex representation,
```

### ReturnNull
Return of `null`
in `extensions/guacamole-auth-quickconnect/src/main/java/org/apache/guacamole/auth/quickconnect/utility/QCParser.java`
#### Snippet
```java

        if (config == null)
            return null;

        String protocol = config.getProtocol();
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/rest/APIRequest.java`
#### Snippet
```java
        String[] values = getParameterValues(name);
        if (values == null)
            return null;

        // Otherwise, return first value
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/DecorationService.java`
#### Snippet
```java
        Iterator<AuthenticationProvider> current = authProviders.iterator();
        if (!current.hasNext())
            return null;

        // Use first AuthenticationProvider to produce the root-level
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/HashTokenSessionMap.java`
#### Snippet
```java
        // There are no null auth tokens
        if (authToken == null)
            return null;

        // Attempt to retrieve only if non-null
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/HashTokenSessionMap.java`
#### Snippet
```java
        // There are no null auth tokens
        if (authToken == null)
            return null;

        // Return the GuacamoleSession having the given auth token (NOTE: We
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/AuthenticationService.java`
#### Snippet
```java
            return token;

        return null;

    }
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/rest/user/APIUserWrapper.java`
#### Snippet
```java
    @Override
    public Date getLastActive() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/rest/extension/ExtensionRESTService.java`
#### Snippet
```java

        // No such AuthenticationProvider found
        return null;

    }
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/rest/directory/DirectoryView.java`
#### Snippet
```java
        // originally-specified subset
        if (!identifiers.contains(identifier))
            return null;

        // Delegate to underlying directory
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/rest/connection/APIConnectionWrapper.java`
#### Snippet
```java
    @Override
    public Date getLastActive() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/UserTunnel.java`
#### Snippet
```java

        // No active connection associated with this tunnel
        return null;

    }
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/OutputStreamInterceptingFilter.java`
#### Snippet
```java
            logger.warn("Received base64 data for intercepted stream was invalid.");
            logger.debug("Decoding base64 data for intercepted stream failed.", e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/OutputStreamInterceptingFilter.java`
#### Snippet
```java

        // Instruction was handled purely internally
        return null;

    }
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/TunnelRequestType.java`
#### Snippet
```java

        // No such type
        return null;

    }
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/TunnelRequest.java`
#### Snippet
```java
        String value = getParameter(name);
        if (value == null)
            return null;

        // Attempt to parse as an integer
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/http/HTTPTunnelRequest.java`
#### Snippet
```java
            return values.get(0);

        return null;
    }

```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/WebSocketTunnelRequest.java`
#### Snippet
```java
        List<String> values = getParameterValues(name);
        if (values == null || values.isEmpty())
            return null;

        // Return first parameter value arbitrarily
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/RestrictedGuacamoleWebSocketTunnelEndpoint.java`
#### Snippet
```java
        TunnelRequest tunnelRequest = (TunnelRequest) userProperties.get(TUNNEL_REQUEST_PROPERTY);
        if (tunnelRequest == null)
            return null;

        // Get tunnel request service
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/RestrictedGuacamoleWebSocketTunnelEndpoint.java`
#### Snippet
```java
        TunnelRequestService tunnelRequestService = (TunnelRequestService) userProperties.get(TUNNEL_REQUEST_SERVICE_PROPERTY);
        if (tunnelRequestService == null)
            return null;

        // Create and return tunnel
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty9/WebSocketTunnelRequest.java`
#### Snippet
```java
        String[] values = handshakeParameters.get(name);
        if (values == null)
            return null;

        return Arrays.asList(values);
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty9/WebSocketTunnelRequest.java`
#### Snippet
```java
        List<String> values = getParameterValues(name);
        if (values == null || values.isEmpty())
            return null;

        // Return first parameter value arbitrarily
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty9/RestrictedGuacamoleWebSocketCreator.java`
#### Snippet
```java

        // Invalid protocol
        return null;

    }
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/InterceptedStreamMap.java`
#### Snippet
```java
        InterceptedStream<T> stream = streams.remove(index);
        if (stream == null)
            return null;

        // Close stream if it exists
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty9/GuacamoleWebSocketTunnelListener.java`
#### Snippet
```java
                    }

                    return null;

                }
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty8/GuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java
                            }

                            return null;

                        }
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/tomcat/GuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java
                            }

                            return null;

                        }
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/tomcat/GuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java
        
        // Otherwise, fail
        return null;

    }
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/extension/AuthenticationProviderFacade.java`
#### Snippet
```java
                    + "relevant authentication provider could not be loaded. "
                    + "Please check for errors earlier in the logs.");
            return null;
        }

```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/extension/AuthenticationProviderFacade.java`
#### Snippet
```java
                    + "authentication provider could not be loaded. Please "
                    + "check for errors earlier in the logs.");
            return null;
        }

```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/extension/AuthenticationProviderFacade.java`
#### Snippet
```java
            if (isFailureTolerated()) {
                warnAuthProviderSkipped(e);
                return null;
            }

```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/extension/AuthenticationProviderFacade.java`
#### Snippet
```java
                    + "authentication provider could not be loaded. Please "
                    + "check for errors earlier in the logs.");
            return null;
        }

```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/extension/AuthenticationProviderFacade.java`
#### Snippet
```java
        if (authProvider == null) {
            logger.warn("The authentication system could not be loaded. Please check for errors earlier in the logs.");
            return null;
        }

```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/extension/AuthenticationProviderFacade.java`
#### Snippet
```java
                    + "relevant authentication provider could not be loaded. "
                    + "Please check for errors earlier in the logs.");
            return null;
        }

```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/extension/AuthenticationProviderFacade.java`
#### Snippet
```java
            if (isFailureTolerated()) {
                warnAuthProviderSkipped(e);
                return null;
            }

```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/properties/StringSetProperty.java`
#### Snippet
```java
        // If no property provided, return null.
        if (values == null)
            return null;

        // Split string into a set of individual values
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/extension/ExtensionOrderProperty.java`
#### Snippet
```java
        // If no property provided, return null.
        if (value == null)
            return null;

        // Split string into a set of individual values
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/extension/LanguageResourceService.java`
#### Snippet
```java
        Matcher languageKeyMatcher = LANGUAGE_KEY_PATTERN.matcher(path);
        if (!languageKeyMatcher.matches())
            return null;

        // Return parsed key
```

### ReturnNull
Return of `null`
in `guacamole/src/main/java/org/apache/guacamole/extension/LanguageResourceService.java`
#### Snippet
```java
        InputStream stream = resource.asStream();
        if (stream == null)
            return null;

        // Parse JSON tree
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `tunnel` is redundant
in `doc/guacamole-example/src/main/java/org/apache/guacamole/net/example/DummyGuacamoleTunnelServlet.java`
#### Snippet
```java

        // Create tunnel from now-configured socket
        GuacamoleTunnel tunnel = new SimpleGuacamoleTunnel(socket);
        return tunnel;

```

### UnnecessaryLocalVariable
Local variable `instruction` is redundant
in `guacamole-common/src/main/java/org/apache/guacamole/io/ReaderGuacamoleReader.java`
#### Snippet
```java

        // Create instruction
        GuacamoleInstruction instruction = new GuacamoleInstruction(
                opcode,
                elements.toArray(new String[elements.size()])
```

### UnnecessaryLocalVariable
Local variable `injector` is redundant
in `guacamole/src/main/java/org/apache/guacamole/GuacamoleServletContextListener.java`
#### Snippet
```java

            // Create new injector if necessary
            Injector injector = Guice.createInjector(Stage.PRODUCTION,
                new EnvironmentModule(environment),
                new LogModule(environment),
```

### UnnecessaryLocalVariable
Local variable `updatedUser` is redundant
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/AuthenticationService.java`
#### Snippet
```java
        // Re-authenticate user if session exists
        if (existingSession != null) {
            AuthenticatedUser updatedUser = updateAuthenticatedUser(
                    existingSession.getAuthenticatedUser(), credentials);
            return updatedUser;
```

### UnnecessaryLocalVariable
Local variable `authenticatedUser` is redundant
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/AuthenticationService.java`
#### Snippet
```java

        // Otherwise, attempt authentication as a new user
        AuthenticatedUser authenticatedUser = AuthenticationService.this.authenticateUser(credentials);
        return authenticatedUser;

```

### UnnecessaryLocalVariable
Local variable `tree` is redundant
in `guacamole/src/main/java/org/apache/guacamole/extension/LanguageResourceService.java`
#### Snippet
```java
        // Parse JSON tree
        try {
            JsonNode tree = mapper.readTree(stream);
            return tree;
        }
```

