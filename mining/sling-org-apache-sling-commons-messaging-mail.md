# sling-org-apache-sling-commons-messaging-mail 
 
# Bad smells
I found 89 bad smells with 80 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 80 | true |
| ZeroLengthArrayInitialization | 4 | false |
| BoundedWildcard | 4 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageIdProvider.java`
#### Snippet
```java
     * @see MimeMessage#getMessageID()
     */
    public abstract @NotNull String getMessageId(@NotNull final MimeMessage message) throws MessagingException;

}
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageIdProvider.java`
#### Snippet
```java
     * @see MimeMessage#getMessageID()
     */
    public abstract @NotNull String getMessageId(@NotNull final MimeMessage message) throws MessagingException;

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MailService.java`
#### Snippet
```java
     * @return {@link java.util.concurrent.CompletableFuture} for signaling completion
     */
    public abstract @NotNull CompletableFuture<Void> sendMessage(@NotNull MimeMessage message);

}
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MailService.java`
#### Snippet
```java
     * @return {@link java.util.concurrent.CompletableFuture} for signaling completion
     */
    public abstract @NotNull CompletableFuture<Void> sendMessage(@NotNull MimeMessage message);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MailService.java`
#### Snippet
```java
     * @return the message builder for this service
     */
    public abstract @NotNull MessageBuilder getMessageBuilder();

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MailService.java`
#### Snippet
```java
     * @return the message builder for this service
     */
    public abstract @NotNull MessageBuilder getMessageBuilder();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeMessage#setReplyTo(Address[])
     */
    public abstract @NotNull MessageBuilder replyTo(@NotNull final Collection<String> addresses) throws AddressException;

    // subject
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeMessage#setReplyTo(Address[])
     */
    public abstract @NotNull MessageBuilder replyTo(@NotNull final Collection<String> addresses) throws AddressException;

    // subject
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#CC
     */
    public abstract @NotNull MessageBuilder cc(@NotNull final String address) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#CC
     */
    public abstract @NotNull MessageBuilder cc(@NotNull final String address) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see InternetHeaders
     */
    public abstract @NotNull MessageBuilder header(@NotNull final String name, @Nullable final String value);

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see InternetHeaders
     */
    public abstract @NotNull MessageBuilder header(@NotNull final String name, @Nullable final String value);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeMessage#setFrom(Address)
     */
    public abstract @NotNull MessageBuilder from(@NotNull final InternetAddress from);

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeMessage#setFrom(Address)
     */
    public abstract @NotNull MessageBuilder from(@NotNull final InternetAddress from);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#TO
     */
    public abstract @NotNull MessageBuilder to(@NotNull final InternetAddress to);

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#TO
     */
    public abstract @NotNull MessageBuilder to(@NotNull final InternetAddress to);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#TO
     */
    public abstract @NotNull MessageBuilder to(@NotNull final String address) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#TO
     */
    public abstract @NotNull MessageBuilder to(@NotNull final String address) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#CC
     */
    public abstract @NotNull MessageBuilder cc(@NotNull final InternetAddress[] addresses);

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#CC
     */
    public abstract @NotNull MessageBuilder cc(@NotNull final InternetAddress[] addresses);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeMessage#setReplyTo(Address[])
     */
    public abstract @NotNull MessageBuilder replyTo(@NotNull final InternetAddress[] addresses);

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeMessage#setReplyTo(Address[])
     */
    public abstract @NotNull MessageBuilder replyTo(@NotNull final InternetAddress[] addresses);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#BCC
     */
    public abstract @NotNull MessageBuilder bcc(@NotNull final String address) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#BCC
     */
    public abstract @NotNull MessageBuilder bcc(@NotNull final String address) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeBodyPart#setContent(Object, String)
     */
    public abstract @NotNull MessageBuilder text(@NotNull final String text);

    // html
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeBodyPart#setContent(Object, String)
     */
    public abstract @NotNull MessageBuilder text(@NotNull final String text);

    // html
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeMessage#setReplyTo(Address[])
     */
    public abstract @NotNull MessageBuilder replyTo(@NotNull final String address) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeMessage#setReplyTo(Address[])
     */
    public abstract @NotNull MessageBuilder replyTo(@NotNull final String address) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see InternetHeaders
     */
    public abstract @NotNull MessageBuilder headers(@NotNull final Collection<Header> headers);

    // from
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see InternetHeaders
     */
    public abstract @NotNull MessageBuilder headers(@NotNull final Collection<Header> headers);

    // from
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#TO
     */
    public abstract @NotNull MessageBuilder to(@NotNull final Collection<String> addresses) throws AddressException;

    // cc
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#TO
     */
    public abstract @NotNull MessageBuilder to(@NotNull final Collection<String> addresses) throws AddressException;

    // cc
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#BCC
     */
    public abstract @NotNull MessageBuilder bcc(@NotNull final Collection<String> addresses) throws AddressException;

    // replyTo
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#BCC
     */
    public abstract @NotNull MessageBuilder bcc(@NotNull final Collection<String> addresses) throws AddressException;

    // replyTo
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#BCC
     */
    public abstract @NotNull MessageBuilder bcc(@NotNull final InternetAddress[] addresses);

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#BCC
     */
    public abstract @NotNull MessageBuilder bcc(@NotNull final InternetAddress[] addresses);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#BCC
     */
    public abstract @NotNull MessageBuilder bcc(@NotNull final InternetAddress bcc);

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#BCC
     */
    public abstract @NotNull MessageBuilder bcc(@NotNull final InternetAddress bcc);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see Part#INLINE
     */
    public abstract @NotNull MessageBuilder inline(final byte @NotNull [] content, @NotNull final String type, @NotNull final String cid);

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see Part#INLINE
     */
    public abstract @NotNull MessageBuilder inline(final byte @NotNull [] content, @NotNull final String type, @NotNull final String cid);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#TO
     */
    public abstract @NotNull MessageBuilder to(@NotNull final String address, @NotNull final String name) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#TO
     */
    public abstract @NotNull MessageBuilder to(@NotNull final String address, @NotNull final String name) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see Part#INLINE
     */
    public abstract @NotNull MessageBuilder inline(final byte @NotNull [] content, @NotNull final String type, @NotNull final String cid, @Nullable final Collection<Header> headers);

    // build
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see Part#INLINE
     */
    public abstract @NotNull MessageBuilder inline(final byte @NotNull [] content, @NotNull final String type, @NotNull final String cid, @Nullable final Collection<Header> headers);

    // build
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeBodyPart#setContent(Object, String)
     */
    public abstract @NotNull MessageBuilder html(@NotNull final String html);

    // attachment
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeBodyPart#setContent(Object, String)
     */
    public abstract @NotNull MessageBuilder html(@NotNull final String html);

    // attachment
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#CC
     */
    public abstract @NotNull MessageBuilder cc(@NotNull final Collection<String> addresses) throws AddressException;

    // bcc
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#CC
     */
    public abstract @NotNull MessageBuilder cc(@NotNull final Collection<String> addresses) throws AddressException;

    // bcc
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeMessage#setReplyTo(Address[])
     */
    public abstract @NotNull MessageBuilder replyTo(@NotNull final InternetAddress replyTo);

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeMessage#setReplyTo(Address[])
     */
    public abstract @NotNull MessageBuilder replyTo(@NotNull final InternetAddress replyTo);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @throws MessagingException if building message fails
     */
    public abstract @NotNull MimeMessage build() throws MessagingException;

}
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @throws MessagingException if building message fails
     */
    public abstract @NotNull MimeMessage build() throws MessagingException;

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#CC
     */
    public abstract @NotNull MessageBuilder cc(@NotNull final InternetAddress cc);

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#CC
     */
    public abstract @NotNull MessageBuilder cc(@NotNull final InternetAddress cc);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#TO
     */
    public abstract @NotNull MessageBuilder to(@NotNull final InternetAddress[] addresses);

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#TO
     */
    public abstract @NotNull MessageBuilder to(@NotNull final InternetAddress[] addresses);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#TO
     */
    public abstract @NotNull MessageBuilder to(@NotNull final String[] addresses) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#TO
     */
    public abstract @NotNull MessageBuilder to(@NotNull final String[] addresses) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeMessage#setSubject(String) 
     */
    public abstract @NotNull MessageBuilder subject(@NotNull final String subject);

    // text
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeMessage#setSubject(String) 
     */
    public abstract @NotNull MessageBuilder subject(@NotNull final String subject);

    // text
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeMessage#setFrom(Address)
     */
    public abstract @NotNull MessageBuilder from(@NotNull final String address, @NotNull final String name) throws AddressException;

    // to
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeMessage#setFrom(Address)
     */
    public abstract @NotNull MessageBuilder from(@NotNull final String address, @NotNull final String name) throws AddressException;

    // to
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#CC
     */
    public abstract @NotNull MessageBuilder cc(@NotNull final String[] addresses) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#CC
     */
    public abstract @NotNull MessageBuilder cc(@NotNull final String[] addresses) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#BCC
     */
    public abstract @NotNull MessageBuilder bcc(@NotNull final String[] addresses) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#BCC
     */
    public abstract @NotNull MessageBuilder bcc(@NotNull final String[] addresses) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeMessage#setReplyTo(Address[])
     */
    public abstract @NotNull MessageBuilder replyTo(@NotNull final String address, final String name) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeMessage#setReplyTo(Address[])
     */
    public abstract @NotNull MessageBuilder replyTo(@NotNull final String address, final String name) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see Part#ATTACHMENT
     */
    public abstract @NotNull MessageBuilder attachment(final byte @NotNull [] content, @NotNull final String type, @NotNull final String filename);

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see Part#ATTACHMENT
     */
    public abstract @NotNull MessageBuilder attachment(final byte @NotNull [] content, @NotNull final String type, @NotNull final String filename);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeMessage#setReplyTo(Address[])
     */
    public abstract @NotNull MessageBuilder replyTo(@NotNull final String[] addresses) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeMessage#setReplyTo(Address[])
     */
    public abstract @NotNull MessageBuilder replyTo(@NotNull final String[] addresses) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see Part#ATTACHMENT
     */
    public abstract @NotNull MessageBuilder attachment(final byte @NotNull [] content, @NotNull final String type, @NotNull final String filename, @Nullable final Collection<Header> headers);

    // inline
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see Part#ATTACHMENT
     */
    public abstract @NotNull MessageBuilder attachment(final byte @NotNull [] content, @NotNull final String type, @NotNull final String filename, @Nullable final Collection<Header> headers);

    // inline
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeMessage#setFrom(Address)
     */
    public abstract @NotNull MessageBuilder from(@NotNull final String address) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see MimeMessage#setFrom(Address)
     */
    public abstract @NotNull MessageBuilder from(@NotNull final String address) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#BCC
     */
    public abstract @NotNull MessageBuilder bcc(@NotNull final String address, final String name) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#BCC
     */
    public abstract @NotNull MessageBuilder bcc(@NotNull final String address, final String name) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#CC
     */
    public abstract @NotNull MessageBuilder cc(@NotNull final String address, @NotNull final String name) throws AddressException;

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/mail/MessageBuilder.java`
#### Snippet
```java
     * @see RecipientType#CC
     */
    public abstract @NotNull MessageBuilder cc(@NotNull final String address, @NotNull final String name) throws AddressException;

    /**
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/sling/commons/messaging/mail/internal/SimpleMessageBuilder.java`
#### Snippet
```java

        message.setFrom(from());
        message.setRecipients(Message.RecipientType.TO, to().toArray(new Address[0]));
        message.setRecipients(Message.RecipientType.CC, cc().toArray(new Address[0]));
        message.setRecipients(Message.RecipientType.BCC, bcc().toArray(new Address[0]));
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/sling/commons/messaging/mail/internal/SimpleMessageBuilder.java`
#### Snippet
```java
        message.setFrom(from());
        message.setRecipients(Message.RecipientType.TO, to().toArray(new Address[0]));
        message.setRecipients(Message.RecipientType.CC, cc().toArray(new Address[0]));
        message.setRecipients(Message.RecipientType.BCC, bcc().toArray(new Address[0]));
        message.setReplyTo(replyTo().toArray(new Address[0]));
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/sling/commons/messaging/mail/internal/SimpleMessageBuilder.java`
#### Snippet
```java
        message.setRecipients(Message.RecipientType.TO, to().toArray(new Address[0]));
        message.setRecipients(Message.RecipientType.CC, cc().toArray(new Address[0]));
        message.setRecipients(Message.RecipientType.BCC, bcc().toArray(new Address[0]));
        message.setReplyTo(replyTo().toArray(new Address[0]));
        message.setSubject(subject(), StandardCharsets.UTF_8.name());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/sling/commons/messaging/mail/internal/SimpleMessageBuilder.java`
#### Snippet
```java
        message.setRecipients(Message.RecipientType.CC, cc().toArray(new Address[0]));
        message.setRecipients(Message.RecipientType.BCC, bcc().toArray(new Address[0]));
        message.setReplyTo(replyTo().toArray(new Address[0]));
        message.setSubject(subject(), StandardCharsets.UTF_8.name());

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `src/main/java/org/apache/sling/commons/messaging/mail/MailService.java`
#### Snippet
```java
     *
     * @param message the MIME message to send
     * @return {@link java.util.concurrent.CompletableFuture} for signaling completion
     */
    public abstract @NotNull CompletableFuture<Void> sendMessage(@NotNull MimeMessage message);
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Inline`
in `src/main/java/org/apache/sling/commons/messaging/mail/internal/SimpleMessageBuilder.java`
#### Snippet
```java

    @SuppressWarnings("checkstyle:IllegalCatch")
    private static void addInlines(final MimeMultipart parent, final List<Inline> inlines) throws MessagingException {
        for (final Inline inline : inlines) {
            try (ByteArrayInputStream inputStream = new ByteArrayInputStream(inline.content)) {
```

### BoundedWildcard
Can generalize to `? extends Header`
in `src/main/java/org/apache/sling/commons/messaging/mail/internal/SimpleMessageBuilder.java`
#### Snippet
```java
    }

    private static void setHeaders(final MimeBodyPart part, final Collection<Header> headers) throws MessagingException {
        for (final Header header : headers) {
            part.setHeader(header.getName(), header.getValue());
```

### BoundedWildcard
Can generalize to `? extends Attachment`
in `src/main/java/org/apache/sling/commons/messaging/mail/internal/SimpleMessageBuilder.java`
#### Snippet
```java

    @SuppressWarnings("checkstyle:IllegalCatch")
    private static void addAttachments(final MimeMultipart parent, final List<Attachment> attachments) throws MessagingException {
        for (final Attachment attachment : attachments) {
            try (ByteArrayInputStream inputStream = new ByteArrayInputStream(attachment.content)) {
```

### BoundedWildcard
Can generalize to `? extends Header`
in `src/main/java/org/apache/sling/commons/messaging/mail/internal/SimpleMessageBuilder.java`
#### Snippet
```java

    @Override
    public @NotNull MessageBuilder headers(@NotNull final Collection<Header> headers) {
        this.headers.addAll(headers);
        return this;
```

