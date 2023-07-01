# guacamole-client 
 
# Bad smells
I found 466 bad smells with 141 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 125 | true |
| RedundantTypeArguments | 82 | false |
| FieldMayBeFinal | 37 | false |
| UNUSED_IMPORT | 21 | false |
| JavadocReference | 19 | false |
| DuplicatedCode | 18 | false |
| FieldCanBeLocal | 18 | false |
| CharsetObjectCanBeUsed | 18 | false |
| CatchMayIgnoreException | 11 | false |
| JavadocLinkAsPlainText | 9 | false |
| ArraysAsListWithZeroOrOneArgument | 9 | false |
| SimplifyStreamApiCallChains | 6 | false |
| DeprecatedIsStillUsed | 6 | false |
| Deprecation | 6 | false |
| UnnecessaryLocalVariable | 6 | true |
| UnnecessarySemicolon | 5 | false |
| CStyleArrayDeclaration | 5 | false |
| RedundantMethodOverride | 5 | false |
| JavadocDeclaration | 5 | false |
| ToArrayCallWithZeroLengthArrayArgument | 4 | true |
| SynchronizeOnNonFinalField | 4 | false |
| DataFlowIssue | 3 | false |
| PlaceholderCountMatchesArgumentCount | 3 | false |
| UastIncorrectHttpHeaderInspection | 3 | false |
| IOStreamConstructor | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| ConditionCoveredByFurtherCondition | 3 | false |
| RegExpRedundantEscape | 2 | false |
| LongLiteralsEndingWithLowercaseL | 2 | false |
| RegExpSimplifiable | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| DanglingJavadoc | 2 | false |
| NullableProblems | 2 | false |
| TrivialIf | 2 | false |
| KotlinMavenPluginPhase | 2 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 2 | false |
| ConstantValue | 2 | false |
| MagicConstant | 1 | false |
| RedundantArrayCreation | 1 | true |
| RedundantCollectionOperation | 1 | false |
| FinalPrivateMethod | 1 | false |
| FunctionalExpressionCanBeFolded | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| RedundantCast | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| DuplicateThrows | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
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
Call to `toArray()` with pre-sized array argument 'new String\[attrList.size()\]'
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/AuthenticationProviderService.java`
#### Snippet
```java

        // Build LDAP query parameters
        String[] attrArray = attrList.toArray(new String[attrList.size()]);

        Map<String, String> tokens = new HashMap<>();
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

## RuleId[id=UnnecessaryModifier]
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
    public AuthenticatedUser authenticateUser(AuthenticationProvider authenticationProvider,
            Credentials credentials) throws GuacamoleException;

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
     *     removed.
     */
    public SharedConnectionDefinition remove(String key);

}
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
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/security/SaltService.java`
#### Snippet
```java
     * @return a new salt for password encryption.
     */
    public byte[] generateSalt();
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
     *     was accessed directly.
     */
    public String getSharingProfileIdentifier();

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
     */

    public Set<String> getConnectionGroupIdentifiers()
            throws GuacamoleException;

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
     *     If an error occurs while retrieving the identifiers.
     */
    public Set<String> getConnectionIdentifiers() throws GuacamoleException;

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
     * this ConnectionGroup.
     */
    public String getParentIdentifier();

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
     * @return A String which may (or may not) be the user's password.
     */
    public String getPassword();

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
     *     still ongoing or if the end time is unknown.
     */
    public Date getEndDate();

    /**
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
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/Directory.java`
#### Snippet
```java
     * interface.
     */
    public enum Type {

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
     *     connection.
     */
    public Set<String> getSharingProfileIdentifiers() throws GuacamoleException;

}
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
     * ConnectionGroup for this Connection.
     */
    public void setParentIdentifier(String parentIdentifier);

    /**
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
     *                      from being constructed for the child element.
     */
    public TagHandler childElement(String localName)
            throws SAXException;

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
     *                            guacamole.properties.
     */
    public <Type> Type getProperty(GuacamoleProperty<Type> property)
            throws GuacamoleException;

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
     *                            guacamole.properties.
     */
    public <Type> Type getProperty(GuacamoleProperty<Type> property,
            Type defaultValue) throws GuacamoleException;

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
    public Collection<Form> getConnectionAttributes();

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
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/GuacamoleExceptionSupplier.java`
#### Snippet
```java
     *    If an error occurs while attemping to calculate the return value.
     */
    public T get() throws GuacamoleException;

}
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

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `https`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-sqlserver/src/main/java/org/apache/guacamole/auth/sqlserver/conf/SQLServerEnvironment.java`
#### Snippet
```java
     * of connections.
     *
     * @see https://docs.microsoft.com/en-us/sql/sql-server/maximum-capacity-specifications-for-sql-server
     */
    private static final int DEFAULT_BATCH_SIZE = 500;
```

### JavadocReference
Cannot resolve symbol `SUCCESS`
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/GuacamoleStatus.java`
#### Snippet
```java
     * Returns an instance of the {@link GuacamoleException} subclass
     * corresponding to this Guacamole protocol status code. All status codes
     * have a corresponding GuacamoleException except for {@link SUCCESS}. The
     * returned GuacamoleException will have the provided human-readable
     * message.
```

### JavadocReference
Cannot resolve symbol `SUCCESS`
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/GuacamoleStatus.java`
#### Snippet
```java
     *
     * @throws IllegalStateException
     *    If invoked on {@link SUCCESS}, which has no corresponding
     *    GuacamoleException.
     */
```

### JavadocReference
Cannot resolve symbol `search`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ActivityRecordMapper.java`
#### Snippet
```java
     * associated with data explicitly readable by the given user will be
     * returned. If records are needed by a system administrator (who, by
     * definition, does not need explicit read rights), use {@link search()}
     * instead.
     *
```

### JavadocReference
Cannot resolve symbol `searchReadable`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ActivityRecordMapper.java`
#### Snippet
```java
     * This should only be called on behalf of a system administrator. If
     * records are needed by a non-administrative user who must have explicit
     * read rights, use {@link searchReadable()} instead.
     *
     * @param identifier
```

### JavadocReference
Cannot resolve symbol `https`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-mysql/src/main/java/org/apache/guacamole/auth/mysql/conf/MySQLEnvironment.java`
#### Snippet
```java
     * exceeding it.
     *
     * @see https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_max_allowed_packet
     * @see https://mariadb.com/kb/en/server-system-variables/#max_allowed_packet
     */
```

### JavadocReference
Cannot resolve symbol `https`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-mysql/src/main/java/org/apache/guacamole/auth/mysql/conf/MySQLEnvironment.java`
#### Snippet
```java
     *
     * @see https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_max_allowed_packet
     * @see https://mariadb.com/kb/en/server-system-variables/#max_allowed_packet
     */
    private static final int DEFAULT_BATCH_SIZE = 1000;
```

### JavadocReference
Cannot resolve symbol `userDN`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/LDAPConnectionService.java`
#### Snippet
```java
     *     call and will be automatically closed if this call fails.
     *
     * @param userDN
     *     The DN of the user to bind as, or null to bind anonymously.
     *
```

### JavadocReference
Cannot resolve symbol `LDAP_USERNAME_ATTRIBUTES`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/conf/JacksonLDAPConfiguration.java`
#### Snippet
```java

    /**
     * The raw YAML value of {@link LDAPGuacamoleProperties#LDAP_USERNAME_ATTRIBUTES}.
     * If not set within the YAML, this will be null.
     */
```

### JavadocReference
Cannot resolve symbol `LDAP_GROUP_NAME_ATTRIBUTES`
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/conf/JacksonLDAPConfiguration.java`
#### Snippet
```java

    /**
     * The raw YAML value of {@link LDAPGuacamoleProperties#LDAP_GROUP_NAME_ATTRIBUTES}.
     * If not set within the YAML, this will be null.
     */
```

### JavadocReference
Cannot resolve symbol `getHistory`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/User.java`
#### Snippet
```java
     * time (active sessions are first), and then in descending order of start
     * time (newer sessions are first). If login history tracking is not
     * implemented, or is only implemented using the deprecated {@link getHistory}
     * method, this method should throw GuacamoleUnsupportedException.
     * 
```

### JavadocReference
Cannot resolve symbol `getUserHistory`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/User.java`
#### Snippet
```java
     *
     * @deprecated
     *     This function is deprecated in favor of {@link getUserHistory}, which
     *     returns the login history as an ActivityRecordSet which supports
     *     various sort and filter functions. While this continues to be defined
```

### JavadocReference
Cannot resolve symbol `getHistory`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/Connection.java`
#### Snippet
```java
     * of start time (newer connections are first). If connection history
     * tracking has not been implemented, or has been implemented using the
     * deprecated {@link getHistory} method, this function should throw
     * GuacamoleUnsupportedExpcetion.
     * 
```

### JavadocReference
Cannot resolve symbol `getConnectionHistory`
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/Connection.java`
#### Snippet
```java
     * @deprecated 
     *     This function has been deprecated in favor of
     *     {@link getConnectionHistory}, which returns the connection history
     *     as an ActivityRecordSet that can be easily sorted and filtered.
     *     While the getHistory() method is provided for API compatibility,
```

### JavadocReference
Cannot resolve symbol `The`
in `guacamole/src/main/java/org/apache/guacamole/net/auth/Connectable.java`
#### Snippet
```java
     *
     * @see
     *     The definition of getActiveConnections() in the current version of
     *     the Connectable interface, as defined by guacamole-ext.
     */
```

### JavadocReference
Cannot resolve symbol `The`
in `guacamole/src/main/java/org/apache/guacamole/net/auth/Connectable.java`
#### Snippet
```java
     *
     * @see
     *     The definition of getActiveConnections() in the current version of
     *     the Connectable interface, as defined by guacamole-ext.
     */
```

### JavadocReference
Cannot resolve symbol `KsmAuthenticationProviderModule`
in `extensions/guacamole-vault/modules/guacamole-vault-base/src/main/java/org/apache/guacamole/vault/VaultAuthenticationProviderModule.java`
#### Snippet
```java
 * specific to that vault implementation will need to be created.
 *
 * @see KsmAuthenticationProviderModule
 */
public abstract class VaultAuthenticationProviderModule extends AbstractModule {
```

### JavadocReference
Cannot resolve symbol `KsmAuthenticationProviderModule`
in `extensions/guacamole-vault/modules/guacamole-vault-base/src/main/java/org/apache/guacamole/vault/VaultAuthenticationProviderModule.java`
#### Snippet
```java
     *     - VaultSecretService
     *
     * @see KsmAuthenticationProviderModule
     */
    protected abstract void configureVault();
```

### JavadocReference
Cannot resolve symbol `https`
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-postgresql/src/main/java/org/apache/guacamole/auth/postgresql/conf/PostgreSQLEnvironment.java`
#### Snippet
```java
     * execution errors while staying well below the maximum limit.
     *
     * @see https://www.postgresql.org/docs/current/runtime-config-resource.html#GUC-MAX-PREPARED-STATEMENT-ARGS
     */
    private static final int DEFAULT_BATCH_SIZE = 5000;
```

## RuleId[id=DataFlowIssue]
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
Method invocation `notifyFailed` may produce `NullPointerException`
in `extensions/guacamole-auth-ban/src/main/java/org/apache/guacamole/auth/ban/status/InMemoryAuthenticationFailureTracker.java`
#### Snippet
```java
                (addr) -> new AuthenticationFailureStatus(maxAttempts, banDuration));

        status.notifyFailed();
        return status;

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

## RuleId[id=UnnecessarySemicolon]
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
'!Stream.anyMatch(...)' can be replaced with 'noneMatch()'
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-ssl/src/main/java/org/apache/guacamole/auth/ssl/SSLClientAuthenticationResource.java`
#### Snippet
```java
        // attributes
        List<String> usernameAttributes = confService.getSubjectUsernameAttributes();
        if (usernameAttributes != null && !usernameAttributes.stream().anyMatch(nameRdn.getType()::equalsIgnoreCase))
            throw new GuacamoleClientException("Subject DN \"" + dn + "\" "
                    + "does not contain an acceptable username attribute.");
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

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `extensions/guacamole-history-recording-storage/src/main/java/org/apache/guacamole/history/connection/HistoryConnectionRecord.java`
#### Snippet
```java
        }
        catch (MalformedURLException e) {
            logger.warn("Ignoring file \"{}\" as a unique URL and UUID for that file could not be generated: {}", e.getMessage());
            logger.debug("URL for file \"{}\" could not be determined.", file, e);
            return;
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (2) than placeholders specified (3)
in `guacamole/src/main/java/org/apache/guacamole/event/EventLoggingListener.java`
#### Snippet
```java
            default:
                logger.warn("DirectoryEvent operation type has no corresponding log message implemented: {}", op);
                logger.info("{} successfully performed an unknown action on {} {}", new RequestingUser(event), new AffectedObject(event));

        }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (1)
in `guacamole/src/main/java/org/apache/guacamole/extension/ProviderFactory.java`
#### Snippet
```java
        }
        catch (IllegalAccessException e) {
            logger.error("The {} extension in use is not properly defined. "
                    + "Please contact the developers of the extension or, if you "
                    + "are the developer, turn on debug-level logging.");
            logger.debug("Default constructor of {} is not public.", typeName, e);
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

## RuleId[id=CStyleArrayDeclaration]
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
     *     If an error occurs while parsing the new data.
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

## RuleId[id=UastIncorrectHttpHeaderInspection]
### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `guacamole-common/src/main/java/org/apache/guacamole/servlet/GuacamoleHTTPTunnelServlet.java`
#### Snippet
```java
     * token identifying each active and distinct HTTP tunnel connection.
     */
    private static final String TUNNEL_TOKEN_HEADER_NAME = "Guacamole-Tunnel-Token";

    /**
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `guacamole-common/src/main/java/org/apache/guacamole/servlet/GuacamoleHTTPTunnelServlet.java`
#### Snippet
```java
            // If response not committed, send error code and message
            if (!response.isCommitted()) {
                response.addHeader("Guacamole-Status-Code", Integer.toString(guacamoleStatusCode));
                response.addHeader("Guacamole-Error-Message", message);
                response.sendError(guacamoleHttpCode);
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `guacamole-common/src/main/java/org/apache/guacamole/servlet/GuacamoleHTTPTunnelServlet.java`
#### Snippet
```java
            if (!response.isCommitted()) {
                response.addHeader("Guacamole-Status-Code", Integer.toString(guacamoleStatusCode));
                response.addHeader("Guacamole-Error-Message", message);
                response.sendError(guacamoleHttpCode);
            }
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `doc/guacamole-playback-example/src/main/webapp/playback.css`
#### Snippet
```java
    display: -ms-flexbox;
    -ms-flex-align: center;
    -ms-flex-direction: row;

    /* Ancient Mozilla */
    display: -moz-box;
    -moz-box-align: center;
    -moz-box-orient: horizontal;

    /* Ancient WebKit */
    display: -webkit-box;
    -webkit-box-align: center;
    -webkit-box-orient: horizontal;

    /* Old WebKit */
    display: -webkit-flex;
    -webkit-align-items: center;
    -webkit-flex-direction: row;

    /* W3C */
    display: flex;
    align-items: center;
    flex-direction: row;
```

### DuplicatedCode
Duplicated code
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/activeconnection/ActiveConnectionPermissionService.java`
#### Snippet
```java
        Collection<String> accessibleObjects = new ArrayList<String>(permissions.size());

        // For each identifier/permission combination
        for (String identifier : identifiers) {
            for (ObjectPermission.Type permissionType : permissionTypes) {

                // Add identifier if at least one requested permission is granted
                ObjectPermission permission = new ObjectPermission(permissionType, identifier);
                if (permissions.contains(permission)) {
                    accessibleObjects.add(identifier);
                    break;
                }

            }
        }

        return accessibleObjects;
```

### DuplicatedCode
Duplicated code
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ModeledDirectoryObjectService.java`
#### Snippet
```java
        for (ObjectPermission.Type permission : IMPLICIT_OBJECT_PERMISSIONS) {

            // Create model which grants this permission to the current user
            ObjectPermissionModel permissionModel = new ObjectPermissionModel();
            permissionModel.setEntityID(userModel.getEntityID());
            permissionModel.setType(permission);
            permissionModel.setObjectIdentifier(model.getIdentifier());

            // Add permission
            implicitPermissions.add(permissionModel);

        }
        
        return Collections.unmodifiableCollection(implicitPermissions);
```

### DuplicatedCode
Duplicated code
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connection/ModeledConnection.java`
#### Snippet
```java
        super.setAttributes(attributes);

        // Translate connection limit attribute
        try { getModel().setMaxConnections(NumericField.parse(attributes.get(MAX_CONNECTIONS_NAME))); }
        catch (NumberFormatException e) {
            logger.warn("Not setting maximum connections: {}", e.getMessage());
            logger.debug("Unable to parse numeric attribute.", e);
        }

        // Translate per-user connection limit attribute
        try { getModel().setMaxConnectionsPerUser(NumericField.parse(attributes.get(MAX_CONNECTIONS_PER_USER_NAME))); }
        catch (NumberFormatException e) {
            logger.warn("Not setting maximum connections per user: {}", e.getMessage());
            logger.debug("Unable to parse numeric attribute.", e);
        }
```

### DuplicatedCode
Duplicated code
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/connection/ConnectionService.java`
#### Snippet
```java
        switch (proxyConfig.getEncryptionMethod()) {

            // If guacd requires SSL, use it
            case SSL:
                socket = new ConfiguredGuacamoleSocket(
                    new SSLGuacamoleSocket(hostname, port),
                    filteredConfig, info
                );
                break;

            // Connect directly via TCP if encryption is not enabled
            case NONE:
                socket = new ConfiguredGuacamoleSocket(
                    new InetGuacamoleSocket(hostname, port),
                    filteredConfig, info
                );
                break;

            // Abort if encryption method is unknown
            default:
                throw new GuacamoleServerException("Unimplemented encryption method.");

        }
```

### DuplicatedCode
Duplicated code
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java
        KeeperRecordData data = record.getData();
        List<KeeperRecordField> custom = data.getCustom();

        // Use text "hostname" custom field as fallback ...
        Text textField = getField(custom, Text.class, HOSTNAME_LABEL_PATTERN);
        if (textField != null)
            return getSingleStringValue(textField.getValue());

        // ... or hidden "hostname" custom field
        HiddenField hiddenField = getField(custom, HiddenField.class, HOSTNAME_LABEL_PATTERN);
        if (hiddenField != null)
            return getSingleStringValue(hiddenField.getValue());

        return null;
```

### DuplicatedCode
Duplicated code
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmRecordService.java`
#### Snippet
```java
        Password passwordField = getField(record, Password.class, PASSWORD_LABEL_PATTERN);
        if (passwordField != null)
            return getSingleStringValue(passwordField.getValue());

        HiddenField hiddenField = getField(record, HiddenField.class, PASSWORD_LABEL_PATTERN);
        if (hiddenField != null)
            return getSingleStringValue(hiddenField.getValue());

        return null;
```

### DuplicatedCode
Duplicated code
in `guacamole-common/src/main/java/org/apache/guacamole/websocket/GuacamoleWebSocketTunnelEndpoint.java`
#### Snippet
```java
Thread readThread = new Thread() {

            @Override
            public void run() {

                StringBuilder buffer = new StringBuilder(BUFFER_SIZE);
                GuacamoleReader reader = tunnel.acquireReader();
                char[] readMessage;

                try {

                    // Send tunnel UUID
                    sendInstruction(new GuacamoleInstruction(
                        GuacamoleTunnel.INTERNAL_DATA_OPCODE,
                        tunnel.getUUID().toString()
                    ));

                    try {

                        // Attempt to read
                        while ((readMessage = reader.read()) != null) {

                            // Buffer message
                            buffer.append(readMessage);

                            // Flush if we expect to wait or buffer is getting full
                            if (!reader.available() || buffer.length() >= BUFFER_SIZE) {
                                sendInstruction(buffer.toString());
                                buffer.setLength(0);
                            }

                        }

                        // No more data
                        closeConnection(session, GuacamoleStatus.SUCCESS);

                    }

                    // Catch any thrown guacamole exception and attempt
                    // to pass within the WebSocket connection, logging
                    // each error appropriately.
                    catch (GuacamoleClientException e) {
                        logger.info("WebSocket connection terminated: {}", e.getMessage());
                        logger.debug("WebSocket connection terminated due to client error.", e);
                        closeConnection(session, e.getStatus().getGuacamoleStatusCode(),
                                e.getWebSocketCode());
                    }
                    catch (GuacamoleConnectionClosedException e) {
                        logger.debug("Connection to guacd closed.", e);
                        closeConnection(session, GuacamoleStatus.SUCCESS);
                    }
                    catch (GuacamoleException e) {
                        logger.error("Connection to guacd terminated abnormally: {}", e.getMessage());
                        logger.debug("Internal error during connection to guacd.", e);
                        closeConnection(session, e.getStatus().getGuacamoleStatusCode(),
                                e.getWebSocketCode());
                    }

                }
                catch (IOException e) {
                    logger.debug("I/O error prevents further reads.", e);
                    closeConnection(session, GuacamoleStatus.SERVER_ERROR);
                }

            }

        };

        readThread.start();
```

### DuplicatedCode
Duplicated code
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty8/GuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java
sendInstruction(new GuacamoleInstruction(
                                GuacamoleTunnel.INTERNAL_DATA_OPCODE,
                                tunnel.getUUID().toString()
                            ));

                            try {

                                // Attempt to read
                                while ((readMessage = reader.read()) != null) {

                                    // Buffer message
                                    buffer.append(readMessage);

                                    // Flush if we expect to wait or buffer is getting full
                                    if (!reader.available() || buffer.length() >= BUFFER_SIZE) {
                                        sendInstruction(buffer.toString());
                                        buffer.setLength(0);
                                    }

                                }

                                // No more data
                                closeConnection(connection, GuacamoleStatus.SUCCESS);
                                
                            }

                            // Catch any thrown guacamole exception and attempt
                            // to pass within the WebSocket connection, logging
                            // each error appropriately.
                            catch (GuacamoleClientException e) {
                                logger.info("WebSocket connection terminated: {}", e.getMessage());
                                logger.debug("WebSocket connection terminated due to client error.", e);
                                closeConnection(connection, e.getStatus().getGuacamoleStatusCode(),
                                        e.getWebSocketCode());
                            }
                            catch (GuacamoleConnectionClosedException e) {
                                logger.debug("Connection to guacd closed.", e);
                                closeConnection(connection, GuacamoleStatus.SUCCESS);
                            }
                            catch (GuacamoleException e) {
                                logger.error("Connection to guacd terminated abnormally: {}", e.getMessage());
                                logger.debug("Internal error during connection to guacd.", e);
                                closeConnection(connection, e.getStatus().getGuacamoleStatusCode(),
                                        e.getWebSocketCode());
                            }
```

### DuplicatedCode
Duplicated code
in `guacamole-common/src/main/java/org/apache/guacamole/websocket/GuacamoleWebSocketTunnelEndpoint.java`
#### Snippet
```java
        if (tunnel == null)
            return;

        // Filter received instructions, handling tunnel-internal instructions
        // without passing through to guacd
        GuacamoleWriter writer = new FilteredGuacamoleWriter(tunnel.acquireWriter(), new GuacamoleFilter() {

            @Override
            public GuacamoleInstruction filter(GuacamoleInstruction instruction)
                    throws GuacamoleException {

                // Filter out all tunnel-internal instructions
                if (instruction.getOpcode().equals(GuacamoleTunnel.INTERNAL_DATA_OPCODE)) {

                    // Respond to ping requests
                    List<String> args = instruction.getArgs();
                    if (args.size() >= 2 && args.get(0).equals(PING_OPCODE)) {

                        try {
                            sendInstruction(new GuacamoleInstruction(
                                GuacamoleTunnel.INTERNAL_DATA_OPCODE,
                                PING_OPCODE, args.get(1)
                            ));
                        }
                        catch (IOException e) {
                            logger.debug("Unable to send \"ping\" response for WebSocket tunnel.", e);
                        }

                    }

                    return null;

                }

                // Pass through all non-internal instructions untouched
                return instruction;

            }

        });
```

### DuplicatedCode
Duplicated code
in `guacamole/src/main/frontend/src/app/client/styles/file-transfer-dialog.css`
#### Snippet
```java
    display: -ms-flexbox;
    -ms-flex-align: stretch;
    -ms-flex-direction: column;

    /* Ancient Mozilla */
    display: -moz-box;
    -moz-box-align: stretch;
    -moz-box-orient: vertical;

    /* Ancient WebKit */
    display: -webkit-box;
    -webkit-box-align: stretch;
    -webkit-box-orient: vertical;

    /* Old WebKit */
    display: -webkit-flex;
    -webkit-align-items: stretch;
    -webkit-flex-direction: column;

    /* W3C */
    display: flex;
    align-items: stretch;
    flex-direction: column;
```

### DuplicatedCode
Duplicated code
in `guacamole/src/main/frontend/src/app/client/styles/share-menu.css`
#### Snippet
```java
.share-menu {

    /* IE10 */
    display: -ms-flexbox;
    -ms-flex-align: stretch;
    -ms-flex-direction: row;

    /* Ancient Mozilla */
    display: -moz-box;
    -moz-box-align: stretch;
    -moz-box-orient: horizontal;

    /* Ancient WebKit */
    display: -webkit-box;
    -webkit-box-align: stretch;
    -webkit-box-orient: horizontal;

    /* Old WebKit */
    display: -webkit-flex;
    -webkit-align-items: stretch;
    -webkit-flex-direction: row;

    /* W3C */
    display: flex;
    align-items: stretch;
    flex-direction: row;

}
```

### DuplicatedCode
Duplicated code
in `guacamole/src/main/frontend/src/app/index/styles/headers.css`
#### Snippet
```java
    display: -ms-flexbox;
    -ms-flex-align: stretch;
    -ms-flex-direction: row;

    /* Ancient Mozilla */
    display: -moz-box;
    -moz-box-align: stretch;
    -moz-box-orient: horizontal;
    
    /* Ancient WebKit */
    display: -webkit-box;
    -webkit-box-align: stretch;
    -webkit-box-orient: horizontal;

    /* Old WebKit */
    display: -webkit-flex;
    -webkit-align-items: stretch;
    -webkit-flex-direction: row;

    /* W3C */
    display: flex;
    align-items: stretch;
    flex-direction: row;
```

### DuplicatedCode
Duplicated code
in `guacamole/src/main/frontend/src/app/login/styles/animation.css`
#### Snippet
```java
@keyframes shake-head {
    0%   { margin-left:  0.25em; margin-right: -0.25em; }
    25%  { margin-left: -0.25em; margin-right:  0.25em; }
    50%  { margin-left:  0.25em; margin-right: -0.25em; }
    75%  { margin-left: -0.25em; margin-right:  0.25em; }
    100% { margin-left:  0.00em; margin-right:  0.00em; }
}
```

### DuplicatedCode
Duplicated code
in `guacamole/src/main/frontend/src/app/navigation/styles/menu.css`
#### Snippet
```java
.menu-dropdown {

    /* IE10 */
    display: -ms-flexbox;
    -ms-flex-align: center;
    -ms-flex-direction: row;

    /* Ancient Mozilla */
    display: -moz-box;
    -moz-box-align: center;
    -moz-box-orient: horizontal;
    
    /* Ancient WebKit */
    display: -webkit-box;
    -webkit-box-align: center;
    -webkit-box-orient: horizontal;

    /* Old WebKit */
    display: -webkit-flex;
    -webkit-align-items: center;
    -webkit-flex-direction: row;

    /* W3C */
    display: flex;
    align-items: center;
    flex-direction: row;

}
```

### DuplicatedCode
Duplicated code
in `guacamole/src/main/frontend/src/app/player/styles/player.css`
#### Snippet
```java
    display: -webkit-box;
    display: -webkit-flex;
    display: -moz-box;
    display: -ms-flexbox;
    display: flex;

    -webkit-box-align: center;
    -webkit-align-items: center;
    -moz-box-align: center;
    -ms-flex-align: center;
    align-items: center;
```

### DuplicatedCode
Duplicated code
in `guacamole/src/main/frontend/src/app/player/styles/playerDisplay.css`
#### Snippet
```java
    position: relative;

    display: -webkit-box;
    display: -webkit-flex;
    display: -moz-box;
    display: -ms-flexbox;
    display: flex;

    -webkit-box-align: center;
    -webkit-align-items: center;
    -moz-box-align: center;
    -ms-flex-align: center;
    align-items: center;

    -webkit-box-pack: center;
    -webkit-justify-content: center;
    -moz-box-pack: center;
    -ms-flex-pack: center;
    justify-content: center;
```

### DuplicatedCode
Duplicated code
in `guacamole/src/main/java/org/apache/guacamole/tunnel/websocket/jetty8/GuacamoleWebSocketTunnelServlet.java`
#### Snippet
```java
                try {
                    tunnel = doConnect(tunnelRequest);
                }
                catch (GuacamoleException e) {
                    logger.error("Creation of WebSocket tunnel to guacd failed: {}", e.getMessage());
                    logger.debug("Error connecting WebSocket tunnel.", e);
                    closeConnection(connection, e.getStatus().getGuacamoleStatusCode(),
                            e.getWebSocketCode());
                    return;
                }

                // Do not start connection if tunnel does not exist
                if (tunnel == null) {
                    closeConnection(connection, GuacamoleStatus.RESOURCE_NOT_FOUND);
                    return;
                }
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

## RuleId[id=RegExpSimplifiable]
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

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `extensions/guacamole-history-recording-storage/src/main/java/org/apache/guacamole/history/connection/HistoryConnectionRecord.java`
#### Snippet
```java
        Reader reader = null;
        try {
            reader = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8);

            GuacamoleReader guacReader = new ReaderGuacamoleReader(reader);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `guacamole-ext/src/main/java/org/apache/guacamole/properties/FileGuacamoleProperties.java`
#### Snippet
```java
        // Load properties from stream, if any, always closing stream when done
        Properties properties = new Properties();
        try (InputStream stream = new FileInputStream(propertiesFile)) {
            properties.load(stream);
        }
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `guacamole/src/main/java/org/apache/guacamole/extension/ExtensionClassLoader.java`
#### Snippet
```java

        try (InputStream input = jar.getInputStream(source)) {
            try (OutputStream output = new FileOutputStream(dest)) {

                while ((length = input.read(buffer)) > 0) {
```

## RuleId[id=Deprecation]
### Deprecation
Overrides deprecated method in 'org.apache.guacamole.net.auth.Connectable'
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/DelegatingConnection.java`
#### Snippet
```java
    @Override
    @Deprecated
    public GuacamoleTunnel connect(GuacamoleClientInformation info)
            throws GuacamoleException {
        return connection.connect(info, currentTokens.get());
```

### Deprecation
Overrides deprecated method in 'org.apache.guacamole.net.auth.Connection'
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/DelegatingConnection.java`
#### Snippet
```java
    @Deprecated
    @Override
    public List<? extends ConnectionRecord> getHistory()
            throws GuacamoleException {
        return connection.getHistory();
```

### Deprecation
Overrides deprecated method in 'org.apache.guacamole.net.auth.User'
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/DelegatingUser.java`
#### Snippet
```java
    @Deprecated
    @Override
    public List<? extends ActivityRecord> getHistory()
            throws GuacamoleException {
        return user.getHistory();
```

### Deprecation
Overrides deprecated method in 'org.apache.guacamole.net.auth.Connectable'
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/DelegatingConnectionGroup.java`
#### Snippet
```java
    @Override
    @Deprecated
    public GuacamoleTunnel connect(GuacamoleClientInformation info)
            throws GuacamoleException {
        return connectionGroup.connect(info, currentTokens.get());
```

### Deprecation
Overrides deprecated method in 'org.apache.guacamole.net.auth.Connectable'
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleConnectionGroup.java`
#### Snippet
```java
    @Override
    @Deprecated
    public GuacamoleTunnel connect(GuacamoleClientInformation info)
            throws GuacamoleException {
        throw new GuacamoleSecurityException("Permission denied.");
```

### Deprecation
Overrides deprecated method in 'org.apache.guacamole.net.auth.Connectable'
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleConnection.java`
#### Snippet
```java
    @Override
    @Deprecated
    public GuacamoleTunnel connect(GuacamoleClientInformation info)
            throws GuacamoleException {

```

## RuleId[id=UnnecessaryToStringCall]
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
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/group/UserGroupService.java`
#### Snippet
```java
            if (userEntries.size() != 1)
                logger.warn("user DN \"{}\" does not return unique value "
                        + "and will be ignored", userDN.toString());
            else {
                // determine unique identifier for user
```

## RuleId[id=InnerClassMayBeStatic]
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

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `guacamole-common/src/main/java/org/apache/guacamole/servlet/GuacamoleHTTPTunnelServlet.java`
#### Snippet
```java
}

/**
 * \example ExampleTunnelServlet.java
 *
```

### DanglingJavadoc
Dangling Javadoc comment
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-postgresql/src/main/java/org/apache/guacamole/auth/postgresql/PostgreSQLAuthenticationProviderModule.java`
#### Snippet
```java
        PostgreSQLSSLMode sslMode = environment.getPostgreSQLSSLMode();
        
        /**
         * Older versions of the PostgreSQL JDBC driver do not support directly
         * setting the "prefer" mode; however, the behavior defined by this
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ModeledDirectoryObject.java`
#### Snippet
```java
     */
    public Set<String> getSupportedAttributeNames() {
        return Collections.<String>emptySet();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ModeledChildDirectoryObjectService.java`
#### Snippet
```java
            // If both parents have the same identifier, nothing has changed
            if (parentIdentifier != null && parentIdentifier.equals(oldParentIdentifier))
                return Collections.<String>emptyList();

        }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/UserDirectory.java`
#### Snippet
```java
    public Collection<User> getAll(Collection<String> identifiers) throws GuacamoleException {
        Collection<ModeledUser> objects = userService.retrieveObjects(getCurrentUser(), identifiers);
        return Collections.<User>unmodifiableCollection(objects);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ModeledPermissions.java`
#### Snippet
```java
            throws GuacamoleException {
        return connectionPermissionService.getPermissionSet(getCurrentUser(),
                this, Collections.<String>emptySet());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ModeledPermissions.java`
#### Snippet
```java
            throws GuacamoleException {
        return userPermissionService.getPermissionSet(getCurrentUser(), this,
                Collections.<String>emptySet());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ModeledPermissions.java`
#### Snippet
```java
            throws GuacamoleException {
        return connectionGroupPermissionService.getPermissionSet(
                getCurrentUser(), this, Collections.<String>emptySet());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ModeledPermissions.java`
#### Snippet
```java
            throws GuacamoleException {
        return activeConnectionPermissionService.getPermissionSet(
                getCurrentUser(), this, Collections.<String>emptySet());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ModeledPermissions.java`
#### Snippet
```java
            throws GuacamoleException {
        return systemPermissionService.getPermissionSet(getCurrentUser(), this,
                Collections.<String>emptySet());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ModeledPermissions.java`
#### Snippet
```java
            throws GuacamoleException {
        return sharingProfilePermissionService.getPermissionSet(
                getCurrentUser(), this, Collections.<String>emptySet());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ModeledPermissions.java`
#### Snippet
```java
    public Set<String> getEffectiveUserGroups() {
        return entityService.retrieveEffectiveGroups(this,
                Collections.<String>emptySet());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ModeledPermissions.java`
#### Snippet
```java
    public ObjectPermissionSet getUserGroupPermissions() throws GuacamoleException {
        return userGroupPermissionService.getPermissionSet(getCurrentUser(),
                this, Collections.<String>emptySet());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/tunnel/ActiveConnectionMultimap.java`
#### Snippet
```java
                return Collections.unmodifiableCollection(connections);

            return Collections.<ActiveConnectionRecord>emptyList();

        }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/base/ModeledDirectoryObjectService.java`
#### Snippet
```java
        // Do not query if no identifiers given
        if (filteredIdentifiers.isEmpty())
            return Collections.<InternalType>emptyList();

        int batchSize = environment.getBatchSize();
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/ConnectionSharingService.java`
#### Snippet
```java
     */
    public static final CredentialsInfo SHARE_KEY =
            new CredentialsInfo(Collections.<Field>singletonList(
                new Field(SHARE_KEY_NAME, Field.Type.QUERY_PARAMETER)
            ));
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/tunnel/RestrictedGuacamoleTunnelService.java`
#### Snippet
```java
     * Set of all currently-active connections.
     */
    private final ConcurrentHashMultiset<String> activeConnections = ConcurrentHashMultiset.<String>create();

    /**
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/tunnel/RestrictedGuacamoleTunnelService.java`
#### Snippet
```java
     * Set of all currently-active user/connection pairs (seats).
     */
    private final ConcurrentHashMultiset<Seat> activeSeats = ConcurrentHashMultiset.<Seat>create();

    /**
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/tunnel/RestrictedGuacamoleTunnelService.java`
#### Snippet
```java
     * Set of all currently-active connection groups.
     */
    private final ConcurrentHashMultiset<String> activeGroups = ConcurrentHashMultiset.<String>create();

    /**
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/tunnel/RestrictedGuacamoleTunnelService.java`
#### Snippet
```java
     * Set of all currently-active user/connection group pairs (seats).
     */
    private final ConcurrentHashMultiset<Seat> activeGroupSeats = ConcurrentHashMultiset.<Seat>create();

    /**
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/user/SharedAuthenticatedUser.java`
#### Snippet
```java
    public SharedAuthenticatedUser(AuthenticationProvider authenticationProvider,
            Credentials credentials, String shareKey) {
        super(authenticationProvider, credentials, Collections.<String>emptySet());
        this.shareKey = shareKey;
        this.identifier = AuthenticatedUser.ANONYMOUS_IDENTIFIER;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/user/SharedAuthenticatedUser.java`
#### Snippet
```java
    public SharedAuthenticatedUser(AuthenticatedUser authenticatedUser) {
        super(authenticatedUser.getAuthenticationProvider(),
                authenticatedUser.getCredentials(), Collections.<String>emptySet());
        this.shareKey = null;
        this.identifier = authenticatedUser.getIdentifier();
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/user/SharedUser.java`
#### Snippet
```java
    @Override
    public Map<String, String> getAttributes() {
        return Collections.<String, String>emptyMap();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/connectiongroup/SharedRootConnectionGroup.java`
#### Snippet
```java
    @Override
    public Map<String, String> getAttributes() {
        return Collections.<String, String>emptyMap();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/connectiongroup/SharedRootConnectionGroup.java`
#### Snippet
```java
    @Override
    public Set<String> getConnectionGroupIdentifiers() throws GuacamoleException {
        return Collections.<String>emptySet();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/connection/SharedConnection.java`
#### Snippet
```java
    public Set<String> getSharingProfileIdentifiers()
            throws GuacamoleException {
        return Collections.<String>emptySet();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/connection/SharedConnection.java`
#### Snippet
```java
    public Map<String, String> getAttributes() {
        String sharedBy = definition.getActiveConnection().getUser().getIdentifier();
        return Collections.<String, String>singletonMap(CONNECTION_OWNER, sharedBy);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/tunnel/AbstractGuacamoleTunnelService.java`
#### Snippet
```java
        // selectReadable()
        if (identifiers.isEmpty())
            return Collections.<ActiveConnectionRecord>emptyList();

        // Produce collection of readable connection identifiers
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/tunnel/AbstractGuacamoleTunnelService.java`
#### Snippet
```java
        // If not a balancing group, assume no connections
        if (connectionGroup.getType() != ConnectionGroup.Type.BALANCING)
            return Collections.<ActiveConnectionRecord>emptyList();

        return activeConnectionGroups.get(connectionGroup.getIdentifier());
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/tunnel/AbstractGuacamoleTunnelService.java`
#### Snippet
```java
        // If not a balancing group, there are no balanced connections
        if (connectionGroup.getType() != ConnectionGroup.Type.BALANCING)
            return Collections.<ModeledConnection>emptyList();

        // If group has no children, there are no balanced connections
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/tunnel/AbstractGuacamoleTunnelService.java`
#### Snippet
```java
        Collection<String> identifiers = connectionMapper.selectIdentifiersWithin(connectionGroup.getIdentifier());
        if (identifiers.isEmpty())
            return Collections.<ModeledConnection>emptyList();

        // Restrict to preferred connections if session affinity is enabled
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/ModeledUser.java`
#### Snippet
```java
     * form.
     */
    public static final Form ACCOUNT_RESTRICTIONS = new Form("restrictions", Arrays.<Field>asList(
        new BooleanField(DISABLED_ATTRIBUTE_NAME, "true"),
        new BooleanField(EXPIRED_ATTRIBUTE_NAME, "true"),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/user/ModeledUser.java`
#### Snippet
```java
     * form.
     */
    public static final Form PROFILE = new Form("profile", Arrays.<Field>asList(
        new TextField(User.Attribute.FULL_NAME),
        new EmailField(User.Attribute.EMAIL_ADDRESS),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/usergroup/UserGroupDirectory.java`
#### Snippet
```java
    public Collection<UserGroup> getAll(Collection<String> identifiers) throws GuacamoleException {
        Collection<ModeledUserGroup> objects = userGroupService.retrieveObjects(getCurrentUser(), identifiers);
        return Collections.<UserGroup>unmodifiableCollection(objects);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connection/ConnectionDirectory.java`
#### Snippet
```java
    public Collection<Connection> getAll(Collection<String> identifiers) throws GuacamoleException {
        Collection<ModeledConnection> objects = connectionService.retrieveObjects(getCurrentUser(), identifiers);
        return Collections.<Connection>unmodifiableCollection(objects);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/usergroup/ModeledUserGroup.java`
#### Snippet
```java
     * form.
     */
    public static final Form ACCOUNT_RESTRICTIONS = new Form("restrictions", Arrays.<Field>asList(
        new BooleanField(DISABLED_ATTRIBUTE_NAME, "true")
    ));
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connection/ModeledConnection.java`
#### Snippet
```java
     * form.
     */
    public static final Form CONCURRENCY_LIMITS = new Form("concurrency", Arrays.<Field>asList(
        new NumericField(MAX_CONNECTIONS_NAME),
        new NumericField(MAX_CONNECTIONS_PER_USER_NAME)
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connection/ModeledConnection.java`
#### Snippet
```java
     * connection.
     */
    public static final Form GUACD_PARAMETERS = new Form("guacd", Arrays.<Field>asList(
        new TextField(GUACD_HOSTNAME_NAME),
        new NumericField(GUACD_PORT_NAME),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connection/ModeledConnection.java`
#### Snippet
```java
     * All attributes related to load balancing in a logical form.
     */
    public static final Form LOAD_BALANCING = new Form("load-balancing", Arrays.<Field>asList(
        new NumericField(CONNECTION_WEIGHT),
        new BooleanField(FAILOVER_ONLY_NAME, "true")
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharingprofile/SharingProfileDirectory.java`
#### Snippet
```java
    @Transactional
    public Collection<SharingProfile> getAll(Collection<String> identifiers) throws GuacamoleException {
        return Collections.<SharingProfile>unmodifiableCollection(
            sharingProfileService.retrieveObjects(getCurrentUser(), identifiers)
        );
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharingprofile/ModeledSharingProfile.java`
#### Snippet
```java
     * individual, logical forms. Currently, there are no such attributes.
     */
    public static final Collection<Form> ATTRIBUTES = Collections.<Form>emptyList();

    /**
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connectiongroup/ConnectionGroupDirectory.java`
#### Snippet
```java
    public Collection<ConnectionGroup> getAll(Collection<String> identifiers) throws GuacamoleException {
        Collection<ModeledConnectionGroup> objects = connectionGroupService.retrieveObjects(getCurrentUser(), identifiers);
        return Collections.<ConnectionGroup>unmodifiableCollection(objects);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connectiongroup/RootConnectionGroup.java`
#### Snippet
```java
    @Override
    public Map<String, String> getAttributes() {
        return Collections.<String, String>emptyMap();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/activeconnection/ActiveConnectionDirectory.java`
#### Snippet
```java
            throws GuacamoleException {
        Collection<TrackedActiveConnection> objects = activeConnectionService.retrieveObjects(getCurrentUser(), identifiers);
        return Collections.<ActiveConnection>unmodifiableCollection(objects);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connectiongroup/ModeledConnectionGroup.java`
#### Snippet
```java
     * form.
     */
    public static final Form CONCURRENCY_LIMITS = new Form("concurrency", Arrays.<Field>asList(
        new NumericField(MAX_CONNECTIONS_NAME),
        new NumericField(MAX_CONNECTIONS_PER_USER_NAME),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/ConfigurationService.java`
#### Snippet
```java
     */
    public Collection<String> getTrustedNetworks() throws GuacamoleException {
        return environment.getProperty(JSON_TRUSTED_NETWORKS, Collections.<String>emptyList());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserDataConnection.java`
#### Snippet
```java
    @Override
    public Map<String, String> getAttributes() {
        return Collections.<String, String>emptyMap();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserDataConnection.java`
#### Snippet
```java
    @Override
    public Set<String> getSharingProfileIdentifiers() throws GuacamoleException {
        return Collections.<String>emptySet();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserDataService.java`
#### Snippet
```java
        Map<String, UserData.Connection> connections = userData.getConnections();
        if (connections == null || userData.isExpired())
            return Collections.<String>emptySet();

        // Return all available connection identifiers
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-totp/src/main/java/org/apache/guacamole/auth/totp/user/UserVerificationService.java`
#### Snippet
```java
                        + "authentication can continue",
                        "TOTP.INFO_ENROLL_REQUIRED", new CredentialsInfo(
                            Collections.<Field>singletonList(field)
                        ));
            }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-totp/src/main/java/org/apache/guacamole/auth/totp/user/UserVerificationService.java`
#### Snippet
```java
                    "A TOTP authentication code is required before login can "
                    + "continue", "TOTP.INFO_CODE_REQUIRED", new CredentialsInfo(
                        Collections.<Field>singletonList(field)
                    ));

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/conf/DefaultLDAPConfiguration.java`
#### Snippet
```java
    @Override
    public List<String> getAttributes() {
        return Collections.<String>emptyList();
    }
    
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/AuthenticationProviderService.java`
#### Snippet
```java
        // If there are no attributes there is no reason to search LDAP
        if (attrList.isEmpty())
            return Collections.<String, String>emptyMap();

        // Build LDAP query parameters
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/AuthenticationProviderService.java`
#### Snippet
```java
            Entry userEntry = config.getLDAPConnection().lookup(config.getBindDN(), attrArray);
            if (userEntry == null)
                return Collections.<String, String>emptyMap();

            Collection<Attribute> attributes = userEntry.getAttributes();
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/AuthenticationProviderService.java`
#### Snippet
```java
            Collection<Attribute> attributes = userEntry.getAttributes();
            if (attributes == null)
                return Collections.<String, String>emptyMap();

            // Convert each retrieved attribute into a corresponding token
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/user/LDAPUserContext.java`
#### Snippet
```java
            LDAPAuthenticationProvider.ROOT_CONNECTION_GROUP,
            connectionDirectory.getIdentifiers(),
            Collections.<String>emptyList()
        );

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-ldap/src/main/java/org/apache/guacamole/auth/ldap/connection/ConnectionService.java`
#### Snippet
```java
        Dn configurationBaseDN = ldapConfig.getConfigurationBaseDN();
        if (configurationBaseDN == null)
            return Collections.<String, Connection>emptyMap();

        try {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingConnectionGroup.java`
#### Snippet
```java
     */
    public TokenInjectingConnectionGroup(ConnectionGroup connectionGroup) {
        this(connectionGroup, Collections.<String, String>emptyMap());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/AbstractConnection.java`
#### Snippet
```java
    public Set<String> getSharingProfileIdentifiers()
            throws GuacamoleException {
        return Collections.<String>emptySet();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/AbstractUserContext.java`
#### Snippet
```java
    @Override
    public Collection<Form> getSharingProfileAttributes() {
        return Collections.<Form>emptyList();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/AbstractUserContext.java`
#### Snippet
```java
    @Override
    public Collection<Form> getConnectionGroupAttributes() {
        return Collections.<Form>emptyList();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/AbstractUserContext.java`
#### Snippet
```java
            DEFAULT_ROOT_CONNECTION_GROUP,
            getConnectionDirectory().getIdentifiers(),
            Collections.<String>emptySet()
        );
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/AbstractUserContext.java`
#### Snippet
```java
    @Override
    public Collection<Form> getConnectionAttributes() {
        return Collections.<Form>emptyList();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/AbstractUserContext.java`
#### Snippet
```java
    @Override
    public Collection<Form> getUserGroupAttributes() {
        return Collections.<Form>emptyList();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/AbstractUserContext.java`
#### Snippet
```java
    @Override
    public Collection<Form> getUserAttributes() {
        return Collections.<Form>emptyList();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/AbstractAuthenticatedUser.java`
#### Snippet
```java
    @Override
    public Set<String> getEffectiveUserGroups() {
        return Collections.<String>emptySet();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingConnection.java`
#### Snippet
```java
     */
    public TokenInjectingConnection(Connection connection) {
        this(connection, Collections.<String, String>emptyMap());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/TokenInjectingUserContext.java`
#### Snippet
```java
     */
    public TokenInjectingUserContext(UserContext userContext) {
        this(userContext, Collections.<String, String>emptyMap());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleConnectionRecordSet.java`
#### Snippet
```java
    public Collection<ConnectionRecord> asCollection()
            throws GuacamoleException {
        return Collections.<ConnectionRecord>emptyList();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleConnectionGroup.java`
#### Snippet
```java
    @Override
    public Map<String, String> getAttributes() {
        return Collections.<String, String>emptyMap();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleConnection.java`
#### Snippet
```java
    @Override
    public Map<String, String> getAttributes() {
        return Collections.<String, String>emptyMap();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleDirectory.java`
#### Snippet
```java
     * The Map of objects to provide access to.
     */
    private Map<String, ObjectType> objects = Collections.<String, ObjectType>emptyMap();

    /**
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleAuthenticationProvider.java`
#### Snippet
```java
        @Override
        public Set<String> getEffectiveUserGroups() {
            return Collections.<String>emptySet();
        }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/credentials/CredentialsInfo.java`
#### Snippet
```java
     * required.
     */
    public static final CredentialsInfo EMPTY = new CredentialsInfo(Collections.<Field>emptyList());

    /**
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole-ext/src/main/java/org/apache/guacamole/token/TokenFilter.java`
#### Snippet
```java
     */
    public TokenFilter() {
         this(Collections.<String, String>emptyMap());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-quickconnect/src/main/java/org/apache/guacamole/auth/quickconnect/QuickConnectionGroup.java`
#### Snippet
```java
    public Set<String> getConnectionGroupIdentifiers() {
        // This group contains only connections, not other groups.
        return Collections.<String>emptySet();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-quickconnect/src/main/java/org/apache/guacamole/auth/quickconnect/QuickConnectionGroup.java`
#### Snippet
```java
     */
    private final Set<String> connectionIdentifiers =
            new HashSet<String>(Collections.<String>emptyList());

    /**
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/guacamole-auth-quickconnect/src/main/java/org/apache/guacamole/auth/quickconnect/QuickConnectionGroup.java`
#### Snippet
```java
    public Map<String, String> getAttributes() {
        // There are no attributes associated with this group.
        return Collections.<String, String>emptyMap();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole/src/main/java/org/apache/guacamole/extension/Extension.java`
#### Snippet
```java
        // If no paths are provided, just return an empty map 
        if (resourceTypes == null)
            return Collections.<String, Resource>emptyMap();

        // Add classpath resource for each path/mimetype pair provided
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole/src/main/java/org/apache/guacamole/extension/Extension.java`
#### Snippet
```java
        // If no classnames are provided, just return an empty list
        if (names == null)
            return Collections.<Class<?>>emptyList();

        // Define all auth provider classes
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole/src/main/java/org/apache/guacamole/extension/Extension.java`
#### Snippet
```java
        // If no classnames are provided, just return an empty list
        if (names == null)
            return Collections.<Class<AuthenticationProvider>>emptyList();

        // Define all auth provider classes
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole/src/main/java/org/apache/guacamole/extension/Extension.java`
#### Snippet
```java
        // If no paths are provided, just return an empty map 
        if (paths == null)
            return Collections.<String, Resource>emptyMap();

        // Add classpath resource for each path provided
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole/src/main/java/org/apache/guacamole/extension/ExtensionModule.java`
#### Snippet
```java
        // tolerated
        try {
            return environment.getProperty(SKIP_IF_UNAVAILABLE, Collections.<String>emptySet());
        }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guacamole/src/main/java/org/apache/guacamole/extension/ExtensionModule.java`
#### Snippet
```java
            logger.warn("The list of authentication providers specified via the \"{}\" property could not be parsed: {}", SKIP_IF_UNAVAILABLE.getName(), e.getMessage());
            logger.debug("Unable to parse \"{}\" property.", SKIP_IF_UNAVAILABLE.getName(), e);
            return Collections.<String>emptySet();
        }

```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `guacamole/src/main/java/org/apache/guacamole/rest/LimitedRequestInputStream.java`
#### Snippet
```java

    @Override
    public int read(byte[] bytes) throws IOException {
        recheckLength();
        return (int) limitedRead(stream.read(bytes));
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `guacamole/src/main/java/org/apache/guacamole/rest/LimitedRequestInputStream.java`
#### Snippet
```java

    @Override
    public int read(byte[] bytes, int i, int i1) throws IOException {
        recheckLength();
        return (int) limitedRead(stream.read(bytes, i, i1));
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/JDBCEnvironment.java`
#### Snippet
```java
     * otherwise. The batch executor allows repeated updates to be batched
     * together for improved performance. 
     * See https://mybatis.org/mybatis-3/java-api.html#sqlSessions
     *
     * @return
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/sharing/SecureRandomShareKeyGenerator.java`
#### Snippet
```java
     * uses '-' and '_' instead of '+' and '/' for digits 62 and 63
     * respectively. See RFC 4648, Section 5: "Base 64 Encoding with URL and
     * Filename Safe Alphabet" (https://tools.ietf.org/html/rfc4648#section-5).
     */
    private static final char[] URL_SAFE_BASE64_DIGITS = {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/guacamole-auth-duo/src/main/java/org/apache/guacamole/auth/duo/api/SignedDuoCookie.java`
#### Snippet
```java
     * The signature algorithm that should be used to sign the cookie, as
     * defined by:
     * http://docs.oracle.com/javase/7/docs/technotes/guides/security/StandardNames.html#Mac
     */
    private static final String SIGNATURE_ALGORITHM = "HmacSHA1";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserData.java`
#### Snippet
```java
         * are documented within the Guacamole manual:
         *
         * http://guac-dev.org/doc/gug/configuring-guacamole.html#connection-configuration
         */
        private Map<String, String> parameters;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `guacamole/src/main/java/org/apache/guacamole/rest/jsonpatch/APIPatch.java`
#### Snippet
```java
/**
 * An object for representing an entry within the body of a
 * JSON PATCH request. See https://tools.ietf.org/html/rfc6902
 *
 * @param <T>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/guacamole-vault/modules/guacamole-vault-base/src/main/java/org/apache/guacamole/vault/secret/WindowsUsername.java`
#### Snippet
```java
     * A pattern for matching a down-level logon name containing a Windows
     * domain and username - e.g. domain\\user. For more information, see
     * https://docs.microsoft.com/en-us/windows/win32/secauthn/user-name-formats#down-level-logon-name
     */
    private static final Pattern DOWN_LEVEL_LOGON_NAME_PATTERN = Pattern.compile(
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/guacamole-vault/modules/guacamole-vault-base/src/main/java/org/apache/guacamole/vault/secret/WindowsUsername.java`
#### Snippet
```java
     * A pattern for matching a user principal name containing a Windows
     * domain and username - e.g. user@domain. For more information, see
     * https://docs.microsoft.com/en-us/windows/win32/secauthn/user-name-formats#user-principal-name
     */
    private static final  Pattern USER_PRINCIPAL_NAME_PATTERN = Pattern.compile(
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmClient.java`
#### Snippet
```java
     * represented by the given Keeper notation. Keeper notation locates the
     * value of a specific field, custom field, or file associated with a
     * specific record. See: https://docs.keeper.io/secrets-manager/secrets-manager/about/keeper-notation
     * If a fallbackFunction is provided, it will be invoked to generate
     * a return value in the case where no secret is found with the given
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/secret/KsmClient.java`
#### Snippet
```java
     * represented by the given Keeper notation. Keeper notation locates the
     * value of a specific field, custom field, or file associated with a
     * specific record. See: https://docs.keeper.io/secrets-manager/secrets-manager/about/keeper-notation
     *
     * @param notation
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-mysql/src/main/java/org/apache/guacamole/auth/mysql/conf/MySQLVersion.java`
#### Snippet
```java
     * patch numbers. All non-MariaDB servers use normal MySQL version numbers.
     */
    private final Pattern MYSQL_VERSION = Pattern.compile("^([0-9]+)\\.([0-9]+)\\.([0-9]+).*$");

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-mysql/src/main/java/org/apache/guacamole/auth/mysql/conf/MySQLVersion.java`
#### Snippet
```java
     * extracting the major, minor, and patch numbers.
     */
    private final Pattern MARIADB_VERSION = Pattern.compile("^.*-([0-9]+)\\.([0-9]+)\\.([0-9]+)-MariaDB$");

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-mysql/src/main/java/org/apache/guacamole/auth/mysql/conf/MySQLEnvironment.java`
#### Snippet
```java
     * allowed to any one connection.
     */
    private final int DEFAULT_MAX_CONNECTIONS = 0;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-mysql/src/main/java/org/apache/guacamole/auth/mysql/conf/MySQLEnvironment.java`
#### Snippet
```java
     * allowed per user to any one connection group.
     */
    private final int DEFAULT_MAX_GROUP_CONNECTIONS_PER_USER = 1;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-mysql/src/main/java/org/apache/guacamole/auth/mysql/conf/MySQLEnvironment.java`
#### Snippet
```java
     * allowed to the Guacamole server overall.
     */
    private final int DEFAULT_ABSOLUTE_MAX_CONNECTIONS = 0;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-mysql/src/main/java/org/apache/guacamole/auth/mysql/conf/MySQLEnvironment.java`
#### Snippet
```java
     * allowed to any one connection group.
     */
    private final int DEFAULT_MAX_GROUP_CONNECTIONS = 0;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-mysql/src/main/java/org/apache/guacamole/auth/mysql/conf/MySQLEnvironment.java`
#### Snippet
```java
     * allowed per user to any one connection.
     */
    private final int DEFAULT_MAX_CONNECTIONS_PER_USER = 1;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-ssl/src/main/java/org/apache/guacamole/auth/ssl/conf/ConfigurationService.java`
#### Snippet
```java
     * termination service providing SSL/TLS client authentication.
     */
    private static String DEFAULT_CLIENT_VERIFIED_HEADER = "X-Client-Verified";

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-ssl/src/main/java/org/apache/guacamole/auth/ssl/conf/ConfigurationService.java`
#### Snippet
```java
     * generated for SSL/TLS authentication may remain valid, in minutes.
     */
    private static int DEFAULT_MAX_DOMAIN_VALIDITY = 5;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-ssl/src/main/java/org/apache/guacamole/auth/ssl/conf/ConfigurationService.java`
#### Snippet
```java
     * service providing SSL/TLS client authentication.
     */
    private static String DEFAULT_CLIENT_CERTIFICATE_HEADER = "X-Client-Certificate";

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-ssl/src/main/java/org/apache/guacamole/auth/ssl/conf/ConfigurationService.java`
#### Snippet
```java
     * SSL/TLS authentication may remain valid, in minutes.
     */
    private static int DEFAULT_MAX_TOKEN_VALIDITY = 5;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `guacamole/src/main/java/org/apache/guacamole/rest/auth/HashTokenSessionMap.java`
#### Snippet
```java
     * The session timeout for the Guacamole REST API, in minutes.
     */
    private final IntegerGuacamoleProperty API_SESSION_TIMEOUT =
            new IntegerGuacamoleProperty() {

```

### FieldCanBeLocal
Field can be converted to a local variable
in `guacamole/src/main/java/org/apache/guacamole/extension/ExtensionOrderProperty.java`
#### Snippet
```java
         * explicitly listed.
         */
        private final String OTHER_EXTENSIONS = "*";

        /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-postgresql/src/main/java/org/apache/guacamole/auth/postgresql/conf/PostgreSQLEnvironment.java`
#### Snippet
```java
     * properties.
     */
    private final int DEFAULT_MAX_GROUP_CONNECTIONS_PER_USER = 1;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-postgresql/src/main/java/org/apache/guacamole/auth/postgresql/conf/PostgreSQLEnvironment.java`
#### Snippet
```java
     * allowed to the Guacamole server overall.
     */
    private final int DEFAULT_ABSOLUTE_MAX_CONNECTIONS = 0;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-postgresql/src/main/java/org/apache/guacamole/auth/postgresql/conf/PostgreSQLEnvironment.java`
#### Snippet
```java
     * the values that should be used in the absence of the correct properties.
     */
    private final int DEFAULT_MAX_CONNECTIONS = 0;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-postgresql/src/main/java/org/apache/guacamole/auth/postgresql/conf/PostgreSQLEnvironment.java`
#### Snippet
```java
     * the values that should be used in the absence of the correct properties.
     */
    private final int DEFAULT_MAX_GROUP_CONNECTIONS = 0;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-postgresql/src/main/java/org/apache/guacamole/auth/postgresql/conf/PostgreSQLEnvironment.java`
#### Snippet
```java
     * properties.
     */
    private final int DEFAULT_MAX_CONNECTIONS_PER_USER = 1;

    /**
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/permission/SystemPermission.java`
#### Snippet
```java

        // Compare types
        if (type != other.type)
            return false;

```

### TrivialIf
`if` statement can be simplified
in `extensions/guacamole-auth-quickconnect/src/main/java/org/apache/guacamole/auth/quickconnect/utility/QCParser.java`
#### Snippet
```java
        // If denied parameters are defined and not empty,
        // check to see if this parameter is denied.
        if (deniedParams != null && !deniedParams.isEmpty() && deniedParams.contains(param))
            return false;
        
```

## RuleId[id=FunctionalExpressionCanBeFolded]
### FunctionalExpressionCanBeFolded
Lambda can be replaced with call qualifier
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/permission/ModeledPermissionService.java`
#### Snippet
```java
        // configured batch size, and call the collector function with each
        Iterables.partition(objects, environment.getBatchSize())
                .forEach(batch -> consumer.accept(batch));
    }

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
in `extensions/guacamole-auth-duo/src/main/java/org/apache/guacamole/auth/duo/api/DuoCookie.java`
#### Snippet
```java

            // Encode resulting cookie string with base64
            return BaseEncoding.base64().encode(data.getBytes("UTF-8"));

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
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/user/UserDataService.java`
#### Snippet
```java

            // Convert from UTF-8
            json = new String(receivedJSON, "UTF-8");

        }
```

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
in `guacamole/src/main/java/org/apache/guacamole/rest/patch/PatchRESTService.java`
#### Snippet
```java

        // Read entire resource into StringBuilder one chunk at a time
        Reader reader = new InputStreamReader(resource.asStream(), "UTF-8");
        try {

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

## RuleId[id=RedundantMethodOverride]
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
Method `getEffectiveUserGroups()` is identical to its super method
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/simple/SimpleAuthenticationProvider.java`
#### Snippet
```java

        @Override
        public Set<String> getEffectiveUserGroups() {
            return Collections.<String>emptySet();
        }
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

### ConditionCoveredByFurtherCondition
Condition 'object == null' covered by subsequent condition '!(object instanceof X509CertificateHolder)'
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-ssl/src/main/java/org/apache/guacamole/auth/ssl/SSLClientAuthenticationResource.java`
#### Snippet
```java

            // Verify received data is indeed an X.509 certificate
            if (object == null || !(object instanceof X509CertificateHolder))
                throw new GuacamoleClientException("Certificate did not "
                        + "contain an X.509 certificate.");
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
Unused import `import java.util.ArrayList;`
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/RequestValidationService.java`
#### Snippet
```java
import com.google.inject.Inject;
import inet.ipaddr.IPAddressString;
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
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
Unused import `import org.apache.guacamole.rest.APIError;`
in `guacamole/src/main/java/org/apache/guacamole/rest/directory/DirectoryResource.java`
#### Snippet
```java
import org.apache.guacamole.net.event.DirectoryFailureEvent;
import org.apache.guacamole.net.event.DirectorySuccessEvent;
import org.apache.guacamole.rest.APIError;
import org.apache.guacamole.rest.event.ListenerService;
import org.apache.guacamole.rest.jsonpatch.APIPatch;
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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `t` to `GuacamoleException` is redundant
in `guacamole/src/main/java/org/apache/guacamole/rest/directory/DirectoryResource.java`
#### Snippet
```java
            TranslatableMessage message = new TranslatableMessage(
                    "APP.TEXT_UNTRANSLATED", Collections.singletonMap(
                            "MESSAGE", ((GuacamoleException) t).getMessage()));

            return new APIPatchError(op, identifier, path, message);
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@return` tag description is missing
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/JDBCInjectorProvider.java`
#### Snippet
```java
     * cached.
     *
     * @return
     * @throws GuacamoleException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/JDBCInjectorProvider.java`
#### Snippet
```java
     *
     * @return
     * @throws GuacamoleException
     */
    protected abstract Injector create() throws GuacamoleException;
```

### JavadocDeclaration
`@param driverClassLoader` tag description is missing
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/DynamicallyAuthenticatedDataSource.java`
#### Snippet
```java
     *     credentials.
     *
     * @param driverClassLoader
     * @param driver
     * @param url
```

### JavadocDeclaration
`@param driver` tag description is missing
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/DynamicallyAuthenticatedDataSource.java`
#### Snippet
```java
     *
     * @param driverClassLoader
     * @param driver
     * @param url
     */
```

### JavadocDeclaration
`@param url` tag description is missing
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/DynamicallyAuthenticatedDataSource.java`
#### Snippet
```java
     * @param driverClassLoader
     * @param driver
     * @param url
     */
    @Inject
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `output` may be 'final'
in `guacamole-common/src/main/java/org/apache/guacamole/io/WriterGuacamoleWriter.java`
#### Snippet
```java
     * Wrapped Writer to be used for all output.
     */
    private Writer output;

    /**
```

### FieldMayBeFinal
Field `reader` may be 'final'
in `guacamole-common/src/main/java/org/apache/guacamole/net/SSLGuacamoleSocket.java`
#### Snippet
```java
     * The GuacamoleReader this socket should read from.
     */
    private GuacamoleReader reader;

    /**
```

### FieldMayBeFinal
Field `writer` may be 'final'
in `guacamole-common/src/main/java/org/apache/guacamole/net/InetGuacamoleSocket.java`
#### Snippet
```java
     * The GuacamoleWriter this socket should write to.
     */
    private GuacamoleWriter writer;

    /**
```

### FieldMayBeFinal
Field `sock` may be 'final'
in `guacamole-common/src/main/java/org/apache/guacamole/net/InetGuacamoleSocket.java`
#### Snippet
```java
     * by this class should affect.
     */
    private Socket sock;

    /**
```

### FieldMayBeFinal
Field `reader` may be 'final'
in `guacamole-common/src/main/java/org/apache/guacamole/net/InetGuacamoleSocket.java`
#### Snippet
```java
     * The GuacamoleReader this socket should read from.
     */
    private GuacamoleReader reader;

    /**
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `guacamole-common/src/main/java/org/apache/guacamole/net/InetGuacamoleSocket.java`
#### Snippet
```java
     * Logger for this class.
     */
    private Logger logger = LoggerFactory.getLogger(InetGuacamoleSocket.class);

    /**
```

### FieldMayBeFinal
Field `writer` may be 'final'
in `guacamole-common/src/main/java/org/apache/guacamole/net/SSLGuacamoleSocket.java`
#### Snippet
```java
     * The GuacamoleWriter this socket should write to.
     */
    private GuacamoleWriter writer;

    /**
```

### FieldMayBeFinal
Field `sock` may be 'final'
in `guacamole-common/src/main/java/org/apache/guacamole/net/SSLGuacamoleSocket.java`
#### Snippet
```java
     * by this class should affect.
     */
    private Socket sock;

    /**
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `guacamole-common/src/main/java/org/apache/guacamole/net/SSLGuacamoleSocket.java`
#### Snippet
```java
     * Logger for this class.
     */
    private Logger logger = LoggerFactory.getLogger(SSLGuacamoleSocket.class);

    /**
```

### FieldMayBeFinal
Field `input` may be 'final'
in `guacamole-common/src/main/java/org/apache/guacamole/io/ReaderGuacamoleReader.java`
#### Snippet
```java
     * Wrapped Reader to be used for all input.
     */
    private Reader input;

    /**
```

### FieldMayBeFinal
Field `id` may be 'final'
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/ConfiguredGuacamoleSocket.java`
#### Snippet
```java
     * by the "ready" instruction received from the Guacamole proxy.
     */
    private String id;
    
    /**
```

### FieldMayBeFinal
Field `config` may be 'final'
in `guacamole-common/src/main/java/org/apache/guacamole/protocol/ConfiguredGuacamoleSocket.java`
#### Snippet
```java
     * handshake.
     */
    private GuacamoleConfiguration config;

    /**
```

### FieldMayBeFinal
Field `secureRandom` may be 'final'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/security/SecureRandomSaltService.java`
#### Snippet
```java
     * Instance of SecureRandom for generating the salt.
     */
    private SecureRandom secureRandom = new SecureRandom();

    @Override
```

### FieldMayBeFinal
Field `mysqlDriver` may be 'final'
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-mysql/src/main/java/org/apache/guacamole/auth/mysql/MySQLAuthenticationProviderModule.java`
#### Snippet
```java
     * server.
     */
    private MySQLDriver mysqlDriver;
    
    /**
```

### FieldMayBeFinal
Field `confService` may be 'final'
in `extensions/guacamole-auth-json/src/main/java/org/apache/guacamole/auth/json/RequestValidationService.java`
#### Snippet
```java
     */
    @Inject
    private ConfigurationService confService;

    /**
```

### FieldMayBeFinal
Field `secret` may be 'final'
in `extensions/guacamole-auth-totp/src/main/java/org/apache/guacamole/auth/totp/user/UserTOTPKey.java`
#### Snippet
```java
     * The base32-encoded TOTP key associated with the user.
     */
    private byte[] secret;

    /**
```

### FieldMayBeFinal
Field `DEFAULT_CLIENT_VERIFIED_HEADER` may be 'final'
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-ssl/src/main/java/org/apache/guacamole/auth/ssl/conf/ConfigurationService.java`
#### Snippet
```java
     * termination service providing SSL/TLS client authentication.
     */
    private static String DEFAULT_CLIENT_VERIFIED_HEADER = "X-Client-Verified";

    /**
```

### FieldMayBeFinal
Field `DEFAULT_MAX_DOMAIN_VALIDITY` may be 'final'
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-ssl/src/main/java/org/apache/guacamole/auth/ssl/conf/ConfigurationService.java`
#### Snippet
```java
     * generated for SSL/TLS authentication may remain valid, in minutes.
     */
    private static int DEFAULT_MAX_DOMAIN_VALIDITY = 5;

    /**
```

### FieldMayBeFinal
Field `DEFAULT_CLIENT_CERTIFICATE_HEADER` may be 'final'
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-ssl/src/main/java/org/apache/guacamole/auth/ssl/conf/ConfigurationService.java`
#### Snippet
```java
     * service providing SSL/TLS client authentication.
     */
    private static String DEFAULT_CLIENT_CERTIFICATE_HEADER = "X-Client-Certificate";

    /**
```

### FieldMayBeFinal
Field `DEFAULT_MAX_TOKEN_VALIDITY` may be 'final'
in `extensions/guacamole-auth-sso/modules/guacamole-auth-sso-ssl/src/main/java/org/apache/guacamole/auth/ssl/conf/ConfigurationService.java`
#### Snippet
```java
     * SSL/TLS authentication may remain valid, in minutes.
     */
    private static int DEFAULT_MAX_TOKEN_VALIDITY = 5;

    /**
```

### FieldMayBeFinal
Field `type` may be 'final'
in `guacamole-ext/src/main/java/org/apache/guacamole/net/auth/permission/SystemPermission.java`
#### Snippet
```java
     * The type of operation affected by this permission.
     */
    private Type type;

    /**
```

### FieldMayBeFinal
Field `tagHandler` may be 'final'
in `guacamole-ext/src/main/java/org/apache/guacamole/xml/DocumentHandler.java`
#### Snippet
```java
         * element currently being parsed.
         */
        private TagHandler tagHandler;

        /**
```

### FieldMayBeFinal
Field `textContent` may be 'final'
in `guacamole-ext/src/main/java/org/apache/guacamole/xml/DocumentHandler.java`
#### Snippet
```java
         * The current text content of the current element being parsed.
         */
        private StringBuilder textContent = new StringBuilder();

        /**
```

### FieldMayBeFinal
Field `stack` may be 'final'
in `guacamole-ext/src/main/java/org/apache/guacamole/xml/DocumentHandler.java`
#### Snippet
```java
     * last in the stack, and the root element is first.
     */
    private Deque<DocumentHandlerState> stack =
            new LinkedList<DocumentHandlerState>();

```

### FieldMayBeFinal
Field `rootElementName` may be 'final'
in `guacamole-ext/src/main/java/org/apache/guacamole/xml/DocumentHandler.java`
#### Snippet
```java
     * The name of the root element of the document.
     */
    private String rootElementName;

    /**
```

### FieldMayBeFinal
Field `root` may be 'final'
in `guacamole-ext/src/main/java/org/apache/guacamole/xml/DocumentHandler.java`
#### Snippet
```java
     * element of the document.
     */
    private TagHandler root;

    /**
```

### FieldMayBeFinal
Field `parent` may be 'final'
in `guacamole/src/main/java/org/apache/guacamole/auth/file/ConnectionTagHandler.java`
#### Snippet
```java
     * The Authorization this connection belongs to.
     */
    private Authorization parent;

    /**
```

### FieldMayBeFinal
Field `config` may be 'final'
in `guacamole/src/main/java/org/apache/guacamole/auth/file/ConnectionTagHandler.java`
#### Snippet
```java
     * The GuacamoleConfiguration backing this tag handler.
     */
    private GuacamoleConfiguration config = new GuacamoleConfiguration();

    /**
```

### FieldMayBeFinal
Field `authorizations` may be 'final'
in `guacamole/src/main/java/org/apache/guacamole/auth/file/UserMapping.java`
#### Snippet
```java
     * All authorizations, indexed by username.
     */
    private Map<String, Authorization> authorizations =
            new HashMap<String, Authorization>();

```

### FieldMayBeFinal
Field `user_mapping` may be 'final'
in `guacamole/src/main/java/org/apache/guacamole/auth/file/UserMappingTagHandler.java`
#### Snippet
```java
     * The UserMapping which will contain all data parsed by this tag handler.
     */
    private UserMapping user_mapping = new UserMapping();

    @Override
```

### FieldMayBeFinal
Field `config` may be 'final'
in `guacamole/src/main/java/org/apache/guacamole/auth/file/ProtocolTagHandler.java`
#### Snippet
```java
     * the tag handled by this tag handler.
     */
    private GuacamoleConfiguration config;

    /**
```

### FieldMayBeFinal
Field `config` may be 'final'
in `guacamole/src/main/java/org/apache/guacamole/auth/file/ParamTagHandler.java`
#### Snippet
```java
     * the tag handled by this tag handler.
     */
    private GuacamoleConfiguration config;

    /**
```

### FieldMayBeFinal
Field `authorization` may be 'final'
in `guacamole/src/main/java/org/apache/guacamole/auth/file/AuthorizeTagHandler.java`
#### Snippet
```java
     * as the tag is parsed.
     */
    private Authorization authorization = new Authorization();

    /**
```

### FieldMayBeFinal
Field `parent` may be 'final'
in `guacamole/src/main/java/org/apache/guacamole/auth/file/AuthorizeTagHandler.java`
#### Snippet
```java
     * The UserMapping this authorization belongs to.
     */
    private UserMapping parent;

    /**
```

### FieldMayBeFinal
Field `configs` may be 'final'
in `guacamole/src/main/java/org/apache/guacamole/auth/file/Authorization.java`
#### Snippet
```java
     * Map of all authorized configurations, indexed by configuration name.
     */
    private Map<String, GuacamoleConfiguration> configs = new
            TreeMap<String, GuacamoleConfiguration>();

```

### FieldMayBeFinal
Field `property` may be 'final'
in `guacamole/src/main/java/org/apache/guacamole/rest/history/APISortPredicate.java`
#### Snippet
```java
     * The property to use when sorting ActivityRecords.
     */
    private ActivityRecordSet.SortableProperty property;

    /**
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `guacamole/src/main/java/org/apache/guacamole/extension/AuthenticationProviderFacade.java`
#### Snippet
```java
     * Logger for this class.
     */
    private Logger logger = LoggerFactory.getLogger(AuthenticationProviderFacade.class);

    /**
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

## RuleId[id=UnnecessaryLocalVariable]
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
Local variable `tunnel` is redundant
in `doc/guacamole-example/src/main/java/org/apache/guacamole/net/example/DummyGuacamoleTunnelServlet.java`
#### Snippet
```java

        // Create tunnel from now-configured socket
        GuacamoleTunnel tunnel = new SimpleGuacamoleTunnel(socket);
        return tunnel;

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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/usergroup/ModeledUserGroup.java`
#### Snippet
```java
     * logical forms.
     */
    public static final Collection<Form> ATTRIBUTES = Collections.unmodifiableCollection(Arrays.asList(
        ACCOUNT_RESTRICTIONS
    ));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/usergroup/ModeledUserGroup.java`
#### Snippet
```java
     * form.
     */
    public static final Form ACCOUNT_RESTRICTIONS = new Form("restrictions", Arrays.<Field>asList(
        new BooleanField(DISABLED_ATTRIBUTE_NAME, "true")
    ));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/usergroup/ModeledUserGroup.java`
#### Snippet
```java
     */
    public static final Set<String> ATTRIBUTE_NAMES =
            Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(
                DISABLED_ATTRIBUTE_NAME
            )));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `extensions/guacamole-auth-jdbc/modules/guacamole-auth-jdbc-base/src/main/java/org/apache/guacamole/auth/jdbc/connectiongroup/ModeledConnectionGroup.java`
#### Snippet
```java
     * individual, logical forms.
     */
    public static final Collection<Form> ATTRIBUTES = Collections.unmodifiableCollection(Arrays.asList(
        CONCURRENCY_LIMITS
    ));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `extensions/guacamole-auth-totp/src/main/java/org/apache/guacamole/auth/totp/usergroup/TOTPUserGroup.java`
#### Snippet
```java
     */
    public static final Form TOTP_USER_GROUP_CONFIG = new Form("totp-user-group-config",
            Arrays.asList(
                    new BooleanField(TOTP_KEY_DISABLED_ATTRIBUTE_NAME, TRUTH_VALUE)
            )
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/conf/KsmAttributeService.java`
#### Snippet
```java
     */
    public static final Collection<Form> KSM_CONNECTION_ATTRIBUTES =
            Collections.unmodifiableCollection(Arrays.asList(KSM_CONNECTION_FORM));

    @Override
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/conf/KsmAttributeService.java`
#### Snippet
```java
     */
    public static final Form KSM_CONNECTION_FORM = new Form("ksm-config",
            Arrays.asList(new BooleanField(KSM_USER_CONFIG_ENABLED_ATTRIBUTE, TRUTH_VALUE)));

    /**
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/conf/KsmAttributeService.java`
#### Snippet
```java
     */
    public static final Form KSM_CONFIGURATION_FORM = new Form("ksm-config",
            Arrays.asList(new TextField(KSM_CONFIGURATION_ATTRIBUTE)));

    /**
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `extensions/guacamole-vault/modules/guacamole-vault-ksm/src/main/java/org/apache/guacamole/vault/ksm/conf/KsmAttributeService.java`
#### Snippet
```java
     */
    public static final Collection<Form> KSM_ATTRIBUTES =
            Collections.unmodifiableCollection(Arrays.asList(KSM_CONFIGURATION_FORM));

    /**
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

