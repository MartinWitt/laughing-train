# credential-secure-storage-for-java 
 
# Bad smells
I found 32 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocLinkAsPlainText | 22 | false |
| DataFlowIssue | 7 | false |
| DuplicateBranchesInSwitch | 1 | false |
| DuplicatedCode | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/keyring/GnomeKeyringBackedTokenPairStore.java`
#### Snippet
```java
        Objects.requireNonNull(key, "key cannot be null");

        logger.info("Getting {} for {}", getType(), key);

        final StoredToken accessToken = readSecret(key + ACCESS_TOKEN,
                (userName, password) -> new StoredToken(password, StoredTokenType.ACCESS));
        final StoredToken refreshToken = readSecret(key + REFRESH_TOKEN,
                (userName, password) -> new StoredToken(password, StoredTokenType.REFRESH));

        // no token found
        if (accessToken == null && refreshToken == null) {
            return null;
        }

        return new StoredTokenPair(accessToken, refreshToken);
```

## RuleId[id=DataFlowIssue]
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
Method invocation `secret_service_get_sync` may produce `NullPointerException`
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/libsecret/LibSecretBackedSecureStore.java`
#### Snippet
```java
        Pointer secretService = null;
        try {
            secretService = INSTANCE.secret_service_get_sync(LibSecretLibrary.SECRET_SERVICE_NONE, null, error);

            if (secretService != null && checkResult(error, "Cannot get service")) {
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
`toString()` call can be replaced with 'contentEquals()'
in `src/main/java/com/microsoft/credentialstorage/implementation/macosx/KeychainSecurityCliStore.java`
#### Snippet
```java
        if (isNullValue) {
            destination.put(key.toString(), null);
        } else if ("blob".equals(type.toString())) {
            final int lastCharIndex = value.length() - 1;
            value.deleteCharAt(lastCharIndex);
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/libsecret/LibSecretLibrary.java`
#### Snippet
```java
     * Storing a secret, without paraphrasing, please read:
     *
     * https://www.manpagez.com/html/libsecret-1/libsecret-1-0.18.6/libsecret-Password-storage.php#secret_password_lookup_sync
     *
     * @param schema
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/windows/CredAdvapi32.java`
#### Snippet
```java
     * The CREDENTIAL structure contains an individual credential
     *
     * https://msdn.microsoft.com/en-us/library/windows/desktop/aa374788(v=vs.85).aspx
     *
     * typedef struct _CREDENTIAL {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/windows/CredAdvapi32.java`
#### Snippet
```java
     * The CredFree function frees a buffer returned by any of the credentials management functions.
     *
     * https://msdn.microsoft.com/en-us/library/windows/desktop/aa374796(v=vs.85).aspx
     *
     * @param credential
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/windows/CredAdvapi32.java`
#### Snippet
```java
     * user's security identifier (SID) disabled.
     *
     * https://msdn.microsoft.com/en-us/library/windows/desktop/aa375187(v=vs.85).aspx
     *
     * @param credential
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/libsecret/LibSecretLibrary.java`
#### Snippet
```java
     * Item Attributes — Attributes of individual keyring items.
     *
     * https://www.manpagez.com/html/libsecret-1/libsecret-1-0.18.6/libsecret-SecretSchema.php#SecretSchemaAttribute
     */
    class SecretSchemaAttribute extends Structure {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/libsecret/LibSecretLibrary.java`
#### Snippet
```java
     * Retrieving a stored secret, without paraphrasing, please read:
     *
     * https://www.manpagez.com/html/libsecret-1/libsecret-1-0.18.6/libsecret-Password-storage.php#secret_password_lookup_sync
     *
     * @param schema
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/libsecret/LibSecretLibrary.java`
#### Snippet
```java
     * Delete a stored secret, without paraphrasing, please read:
     *
     * https://www.manpagez.com/html/libsecret-1/libsecret-1-0.18.6/libsecret-Password-storage.php#secret-password-clear-sync
     *
     * @param schema
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/libsecret/LibSecretLibrary.java`
#### Snippet
```java
     * Free the in memory secret pointer, without paraphrasing, please read:
     *
     * https://developer.gnome.org/gnome-keyring/stable/gnome-keyring-Simple-Password-Storage.html#gnome-keyring-free-password
     *
     * @param password
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/libsecret/LibSecretLibrary.java`
#### Snippet
```java
 * Simple interface to store and retrieve secrets with gnome-keyring
 *
 * https://developer.gnome.org/gnome-keyring/stable/ch01.html
 */
public interface LibSecretLibrary extends Library {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/libsecret/LibSecretLibrary.java`
#### Snippet
```java
     * Search for items matching the attributes.
     *
     * http://www.manpagez.com/html/libsecret-1/libsecret-1-0.18.6/SecretService.php#secret-service-search-sync
     *
     * @param secret_service
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/libsecret/LibSecretLibrary.java`
#### Snippet
```java
     * A error object.
     *
     * https://www.manpagez.com/html/glib/glib-2.56.0/glib-Error-Reporting.php#GError
     */
    class GError extends Structure {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/libsecret/LibSecretLibrary.java`
#### Snippet
```java
     * Schema for secret
     *
     * https://www.manpagez.com/html/libsecret-1/libsecret-1-0.18.6/libsecret-SecretSchema.php#SecretSchema
     */
    class SecretSchema extends Structure {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/windows/CredAdvapi32.java`
#### Snippet
```java
     * associated with the logon session of the current token. The token must not have the user's SID disabled.
     *
     * https://msdn.microsoft.com/en-us/library/windows/desktop/aa374787(v=vs.85).aspx
     *
     * @param targetName
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/windows/CredAdvapi32.java`
#### Snippet
```java
     * The token must not have the user's SID disabled.
     *
     * https://msdn.microsoft.com/en-us/library/windows/desktop/aa374804(v=vs.85).aspx
     *
     * @param targetName
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/windows/CredAdvapi32.java`
#### Snippet
```java
     * Credential attributes
     *
     * https://msdn.microsoft.com/en-us/library/windows/desktop/aa374790(v=vs.85).aspx
     *
     * typedef struct _CREDENTIAL_ATTRIBUTE {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/keyring/GnomeKeyringLibrary.java`
#### Snippet
```java
     * Delete a stored secret, without paraphrasing, please read:
     *
     * https://developer.gnome.org/gnome-keyring/stable/gnome-keyring-Simple-Password-Storage.html#gnome-keyring-delete-password-sync
     *
     * @param schema
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/keyring/GnomeKeyringLibrary.java`
#### Snippet
```java
     * Schema for secret
     *
     * https://developer.gnome.org/gnome-keyring/stable/gnome-keyring-Simple-Password-Storage.html#GnomeKeyringPasswordSchema
     */
    class GnomeKeyringPasswordSchema extends Structure {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/keyring/GnomeKeyringLibrary.java`
#### Snippet
```java
 * Simple interface to store and retrieve secrets with gnome-keyring
 *
 * https://developer.gnome.org/gnome-keyring/stable/ch01.html
 */
public interface GnomeKeyringLibrary extends Library {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/keyring/GnomeKeyringLibrary.java`
#### Snippet
```java
     * Retrieving a stored secret, without paraphrasing, please read:
     *
     * https://developer.gnome.org/gnome-keyring/stable/gnome-keyring-Simple-Password-Storage.html#gnome-keyring-find-password-sync
     *
     * @param schema
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/keyring/GnomeKeyringLibrary.java`
#### Snippet
```java
     * Item Attributes — Attributes of individual keyring items.
     *
     * https://developer.gnome.org/gnome-keyring/stable/gnome-keyring-Item-Attributes.html
     */
    class GnomeKeyringPasswordSchemaAttribute extends Structure {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/keyring/GnomeKeyringLibrary.java`
#### Snippet
```java
     * Free the in memory secret pointer, without paraphrasing, please read:
     *
     * https://developer.gnome.org/gnome-keyring/stable/gnome-keyring-Simple-Password-Storage.html#gnome-keyring-free-password
     *
     * @param password
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/credentialstorage/implementation/posix/keyring/GnomeKeyringLibrary.java`
#### Snippet
```java
     * Storing a secret, without paraphrasing, please read:
     *
     * https://developer.gnome.org/gnome-keyring/stable/gnome-keyring-Simple-Password-Storage.html#gnome-keyring-store-password-sync
     *
     * @param schema
```

