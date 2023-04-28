# credential-secure-storage-for-java 
 
# Bad smells
I found 43 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 19 | false |
| DataFlowIssue | 7 | false |
| BoundedWildcard | 6 | false |
| SizeReplaceableByIsEmpty | 3 | true |
| NestedAssignment | 2 | false |
| EmptyMethod | 1 | false |
| RedundantFieldInitialization | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| ArrayEquality | 1 | false |
| NonShortCircuitBoolean | 1 | false |
## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `src/main/java/com/microsoft/credentialstorage/implementation/windows/CredAdvapi32.java`
#### Snippet
```java
     *      GetLastError
     */
    void CredFree(Pointer credential) throws LastErrorException;
}

```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/internal/GLibInitializer.java`
#### Snippet
```java
    private final GLibLibrary GLIB_INSTANCE = GLibLibrary.INSTANCE;

    private boolean glibInitialized = false;

    private GLibInitializer() {
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/com/microsoft/credentialstorage/implementation/macosx/KeychainSecurityCliStore.java`
#### Snippet
```java
                case TimeDateValue:
                    // we don't care about timedate for now, so just append as-is
                    value.append(c);
                    break;
                case ValueFinished:
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `ByReference` is the same as one of its superclass' names
in `src/main/java/com/microsoft/credentialstorage/implementation/windows/CredAdvapi32.java`
#### Snippet
```java
    class CREDENTIAL_ATTRIBUTE extends Structure {

        public static class ByReference extends CREDENTIAL_ATTRIBUTE implements Structure.ByReference { }

        @Override
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/credentialstorage/implementation/macosx/KeychainSecurityBackedTokenPairStore.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/libsecret/LibSecretBackedTokenPairStore.java`
#### Snippet
```java
        // no token found
        if (accessToken == null && refreshToken == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/libsecret/LibSecretBackedTokenPairStore.java`
#### Snippet
```java
    protected StoredTokenPair create(String username, char[] secret) {
        // not used
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/keyring/GnomeKeyringBackedTokenPairStore.java`
#### Snippet
```java
        // no token found
        if (accessToken == null && refreshToken == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/keyring/GnomeKeyringBackedTokenPairStore.java`
#### Snippet
```java
    protected StoredTokenPair create(String username, char[] secret) {
        // not used
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/credentialstorage/implementation/windows/CredManagerBackedTokenPairStore.java`
#### Snippet
```java
    protected StoredTokenPair create(final String username, final char[] secret) {
        // not used
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/credentialstorage/implementation/windows/CredManagerBackedTokenPairStore.java`
#### Snippet
```java
        // no token found
        if (accessToken == null && refreshToken == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/credentialstorage/StorageProvider.java`
#### Snippet
```java
            public SecretStore<StoredCredential> getSecureNonPersistentStore() {
                logger.warn("Do not have any secure non-persistent stores available.");
                return null;
            }
        };
```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/credentialstorage/StorageProvider.java`
#### Snippet
```java
            public SecretStore<StoredToken> getSecureNonPersistentStore() {
                logger.warn("Do not have any secure non-persistent stores available.");
                return null;
            }
        };
```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/credentialstorage/StorageProvider.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/credentialstorage/StorageProvider.java`
#### Snippet
```java
            public SecretStore<StoredTokenPair> getSecureNonPersistentStore() {
                logger.warn("Do not have any secure non-persistent stores available.");
                return null;
            }
        };
```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/libsecret/LibSecretBackedSecureStore.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/libsecret/LibSecretBackedSecureStore.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/libsecret/LibSecretBackedSecureStore.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/libsecret/LibSecretBackedSecureStore.java`
#### Snippet
```java

    private static LibSecretLibrary getLibSecretLibrary() {
        return isLibSecretLibraryAvailable() ? LibSecretLibrary.INSTANCE : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/keyring/GnomeKeyringBackedSecureStore.java`
#### Snippet
```java

        return checkResult(ret, "Could not get default keyring info. GNOME Keyring is not available.")
                ? keyring_info_container : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/keyring/GnomeKeyringBackedSecureStore.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/keyring/GnomeKeyringBackedSecureStore.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/keyring/GnomeKeyringBackedSecureStore.java`
#### Snippet
```java

    private static GnomeKeyringLibrary getGnomeKeyringLibrary() {
        return isGnomeKeyringLibraryAvailable() ? GnomeKeyringLibrary.INSTANCE : null;
    }

```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`metaData.size() > 0` can be replaced with '!metaData.isEmpty()'
in `src/main/java/com/microsoft/credentialstorage/implementation/macosx/KeychainSecurityBackedTokenStore.java`
#### Snippet
```java

        final StoredToken result;
        if (metaData.size() > 0) {
            final String typeName = (String) metaData.get(ACCOUNT_METADATA);
            final String secret = (String) metaData.get(PASSWORD);
```

### SizeReplaceableByIsEmpty
`accessTokenMetaData.size() > 0` can be replaced with '!accessTokenMetaData.isEmpty()'
in `src/main/java/com/microsoft/credentialstorage/implementation/macosx/KeychainSecurityBackedTokenPairStore.java`
#### Snippet
```java
        final Map<String, Object> accessTokenMetaData = read(SecretKind.TokenPair_Access_Token, key);

        if (accessTokenMetaData.size() > 0) {
            accessToken = ((String) accessTokenMetaData.get(PASSWORD)).toCharArray();
        } else {
```

### SizeReplaceableByIsEmpty
`refreshTokenMetaData.size() > 0` can be replaced with '!refreshTokenMetaData.isEmpty()'
in `src/main/java/com/microsoft/credentialstorage/implementation/macosx/KeychainSecurityBackedTokenPairStore.java`
#### Snippet
```java
        final Map<String, Object> refreshTokenMetaData = read(SecretKind.TokenPair_Refresh_Token, key);

        if (refreshTokenMetaData.size() > 0) {
            refreshToken = ((String) refreshTokenMetaData.get(PASSWORD)).toCharArray();
        } else {
```

## RuleId[id=ArrayEquality]
### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/com/microsoft/credentialstorage/model/ClearableValue.java`
#### Snippet
```java

    void clear() {
        if (EMPTY == value) {
            return;
        }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `secret_item_get_attributes` may produce `NullPointerException`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/libsecret/LibSecretBackedSecureStore.java`
#### Snippet
```java
    private static <T> T getStoredSecret(final GLibLibrary.GList listItem, final BiFunction<String, char[], T> mapper) {
        // get attributes for secret item
        final Pointer attributesHashTable = INSTANCE.secret_item_get_attributes(listItem.data);

        try {
```

### DataFlowIssue
Method invocation `secret_service_get_sync` may produce `NullPointerException`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/libsecret/LibSecretBackedSecureStore.java`
#### Snippet
```java
        Pointer secretService = null;
        try {
            secretService = INSTANCE.secret_service_get_sync(LibSecretLibrary.SECRET_SERVICE_NONE, null, error);

            if (secretService != null && checkResult(error, "Cannot get service")) {
```

### DataFlowIssue
Method invocation `secret_password_lookup_sync` may produce `NullPointerException`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/libsecret/LibSecretBackedSecureStore.java`
#### Snippet
```java
        try {
            final PointerByReference error = new PointerByReference();
            pPassword = INSTANCE.secret_password_lookup_sync(
                    SCHEMA,
                    null,
```

### DataFlowIssue
Method invocation `gnome_keyring_get_info_sync` may produce `NullPointerException`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/keyring/GnomeKeyringBackedSecureStore.java`
#### Snippet
```java
        // First make sure we can access gnome-keyring (ssh session may have trouble accessing gnome-keyring)     
        final GnomeKeyringLibrary.PointerToPointer keyring_info_container = new GnomeKeyringLibrary.PointerToPointer();
        final int ret  = INSTANCE.gnome_keyring_get_info_sync(
                GnomeKeyringLibrary.GNOME_KEYRING_DEFAULT, keyring_info_container);

```

### DataFlowIssue
Method invocation `gnome_keyring_info_get_is_locked` may produce `NullPointerException`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/keyring/GnomeKeyringBackedSecureStore.java`
#### Snippet
```java
        // Make sure it's not locked, and unlock it if user allows it (usually by popping up a dialog
        // asking for user's password
        final boolean locked = INSTANCE.gnome_keyring_info_get_is_locked(keyring_info.pointer);

        if (locked) {
```

### DataFlowIssue
Method invocation `gnome_keyring_result_to_message` may produce `NullPointerException`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/keyring/GnomeKeyringBackedSecureStore.java`
#### Snippet
```java
            logger.error(message);
            try {
                logger.error("Return code: {} description: {}", retCode, INSTANCE.gnome_keyring_result_to_message(retCode));
            } catch (UnsatisfiedLinkError e) {
                logger.error("Return code: {}", retCode);
```

### DataFlowIssue
Method invocation `gnome_keyring_find_password_sync` may produce `NullPointerException`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/keyring/GnomeKeyringBackedSecureStore.java`
#### Snippet
```java
        try {
            GnomeKeyringLibrary.PointerToPointer pPassword = new GnomeKeyringLibrary.PointerToPointer();
            INSTANCE.gnome_keyring_find_password_sync(
                    SCHEMA,
                    pPassword,
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `result &= refreshResult && checkResult(refreshError, "Could not delete refresh token from storage")`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/libsecret/LibSecretBackedTokenPairStore.java`
#### Snippet
```java
        try {
            boolean refreshResult = deleteSecret(key + REFRESH_TOKEN, accessError);
            result &= refreshResult && checkResult(refreshError, "Could not delete refresh token from storage");
        } finally {
            if (accessError.getValue() != null) {
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/com/microsoft/credentialstorage/implementation/macosx/KeychainSecurityCliStore.java`
#### Snippet
```java
            boolean parsingAttributes = false;
            String line;
            while ((line = br.readLine()) != null) {
                if (parsingAttributes) {
                    parseAttributeLine(line, result);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/com/microsoft/credentialstorage/implementation/macosx/KeychainSecurityCliStore.java`
#### Snippet
```java
            final StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
                sb.append(System.getProperty("line.separator"));
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends SecretStore`
in `src/main/java/com/microsoft/credentialstorage/StorageProvider.java`
#### Snippet
```java
    }

    private static <E extends StoredSecret> SecretStore<E> findSecureStore(final List<SecretStore<E>> stores) {
        for (final SecretStore<E> store : stores) {
            if (store.isSecure()) {
```

### BoundedWildcard
Can generalize to `? super CredAdvapi32.CREDENTIAL`
in `src/main/java/com/microsoft/credentialstorage/implementation/windows/CredManagerBackedSecureStore.java`
#### Snippet
```java
    }

    protected <T> T readSecret(final String key, final Function<CredAdvapi32.CREDENTIAL, T> mapper) {
        T cred = null;

```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/libsecret/LibSecretBackedSecureStore.java`
#### Snippet
```java
    }

    private static <T> T getStoredSecret(final GLibLibrary.GList listItem, final BiFunction<String, char[], T> mapper) {
        // get attributes for secret item
        final Pointer attributesHashTable = INSTANCE.secret_item_get_attributes(listItem.data);
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/keyring/GnomeKeyringBackedSecureStore.java`
#### Snippet
```java
    }

    protected <T> T readSecret(final String key, final BiFunction<String, char[], T> mapper) {
        if (INSTANCE != null && SCHEMA != null) {
            final Pointer searchAttributes = GLibLibrary.INSTANCE.g_array_new(0, 0, GNOME_KEYRING_ATTRIBUTE_SIZE);
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/com/microsoft/credentialstorage/implementation/macosx/KeychainSecurityCliStore.java`
#### Snippet
```java
    }

    private static void parseMetadataLine(final String line, final Map<String, Object> destination) {
        final Matcher matcher = MetadataLinePattern.matcher(line);
        if (matcher.matches()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/com/microsoft/credentialstorage/implementation/macosx/KeychainSecurityCliStore.java`
#### Snippet
```java
    }

    private static void parseAttributeLine(final String line, final Map<String, Object> destination) {
        final String template = "Undefined transition '%1$s' from %2$s.";
        final StringBuilder key = new StringBuilder();
```

