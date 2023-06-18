# MaXUC-Jitsi-Fork 
 
# Bad smells
I found 85 bad smells with 85 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 85 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/gui/main/chat/ChatConversationPanel.java`
#### Snippet
```java
GuiActivator.getResources().getImageURL("service.gui.DEFAULT_USER_PHOTO_SMALL").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/gui/main/chat/IncomingMessageStyle.java`
#### Snippet
```java
GuiActivator.getResources().getImageURL("service.gui.lookandfeel.INCOMING_MESSAGE_INDICATOR").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/gui/main/chat/IncomingMessageStyle.java`
#### Snippet
```java
GuiActivator.getResources().getImageURL("service.gui.lookandfeel.INCOMING_SMS_INDICATOR").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/gui/main/chat/OutgoingMessageStyle.java`
#### Snippet
```java
GuiActivator.getResources().getImageURL("service.gui.lookandfeel.OUTGOING_MESSAGE_INDICATOR").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/gui/main/chat/OutgoingMessageStyle.java`
#### Snippet
```java
GuiActivator.getResources().getImageURL("service.gui.lookandfeel.OUTGOING_SMS_INDICATOR").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/netaddr/WifiInformation/WifiInformationMac.java`
#### Snippet
```java
o.get("hardwareAddress").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/ChatRoomConfigurationFormFieldJabberImpl.java`
#### Snippet
```java
smackOption.getValue().getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/ChatRoomJabberImpl.java`
#### Snippet
```java
participant.getResourcepart().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/ChatRoomJabberImpl.java`
#### Snippet
```java
participant.getResourceOrEmpty().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/ChatRoomJabberImpl.java`
#### Snippet
```java
participant.getResourcepart().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/ChatRoomJabberImpl.java`
#### Snippet
```java
participant.getResourcepart().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/ChatRoomJabberImpl.java`
#### Snippet
```java
msgFrom.getResourceOrEmpty().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/ChatRoomJabberImpl.java`
#### Snippet
```java
msgSender.getResourceOrEmpty().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/ChatRoomJabberImpl.java`
#### Snippet
```java
mucUser.getDecline().getFrom().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/ChatRoomMemberJabberImpl.java`
#### Snippet
```java
jabberID.asBareJid().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/IncomingFileTransferRequestJabberImpl.java`
#### Snippet
```java
fileTransferRequest.getRequestor().asBareJid().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/InfoRetreiver.java`
#### Snippet
```java
card.toXML().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetBasicInstantMessagingJabberImpl.java`
#### Snippet
```java
msg.getFrom().asBareJid().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetBasicInstantMessagingJabberImpl.java`
#### Snippet
```java
msg.getTo().asBareJid().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetBasicInstantMessagingJabberImpl.java`
#### Snippet
```java
msg.getFrom().asBareJid().getLocalpartOrThrow().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetBasicInstantMessagingJabberImpl.java`
#### Snippet
```java
msg.getFrom().asBareJid().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetGenericNotificationsJabberImpl.java`
#### Snippet
```java
notifyEvent.getFrom().asBareJid().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetGeolocationJabberImpl.java`
#### Snippet
```java
stanza.getFrom().asBareJid().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetMultiUserChatJabberImpl.java`
#### Snippet
```java
getXmppConnection().getUser().getLocalpart().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetMultiUserChatJabberImpl.java`
#### Snippet
```java
serviceRoomsIter.next().getJid().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetMultiUserChatJabberImpl.java`
#### Snippet
```java
serviceNamesIter.next().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetMultiUserChatJabberImpl.java`
#### Snippet
```java
x.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetMultiUserChatJabberImpl.java`
#### Snippet
```java
room.getRoom().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetPersistentPresenceJabberImpl.java`
#### Snippet
```java
from.getResourceOrEmpty().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetPersistentPresenceJabberImpl.java`
#### Snippet
```java
pendingPresenceRequest.getFrom().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetPersistentPresenceJabberImpl.java`
#### Snippet
```java
presence.getFrom().getResourceOrEmpty().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetPersistentPresenceJabberImpl.java`
#### Snippet
```java
from.getResourceOrEmpty().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetPersistentPresenceJabberImpl.java`
#### Snippet
```java
p.getFrom().getResourceOrEmpty().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetPersistentPresenceJabberImpl.java`
#### Snippet
```java
presence.getFrom().getResourceOrEmpty().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetPersistentPresenceJabberImpl.java`
#### Snippet
```java
other.getFrom().getResourceOrEmpty().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetPersistentPresenceJabberImpl.java`
#### Snippet
```java
presence.getFrom().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetTypingNotificationsJabberImpl.java`
#### Snippet
```java
from.asEntityBareJidIfPossible().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetTypingNotificationsJabberImpl.java`
#### Snippet
```java
from.asEntityBareJidIfPossible().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetTypingNotificationsJabberImpl.java`
#### Snippet
```java
chat.getXmppAddressOfChatPartner().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetTypingNotificationsJabberImpl.java`
#### Snippet
```java
chat.getXmppAddressOfChatPartner().asBareJid().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/ProtocolProviderServiceJabberImpl.java`
#### Snippet
```java
StringUtils.escapeForXml((System.getProperty("sip-communicator.application.name", "SIP Communicator") + " ") + System.getProperty("sip-communicator.version", "SVN")).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/ProviderManagerExt.java`
#### Snippet
```java
Direction.received.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/ProviderManagerExt.java`
#### Snippet
```java
Direction.sent.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/debugger/SmackPacketDebugger.java`
#### Snippet
```java
anonymizeStanza(stanza).toXML().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/debugger/SmackPacketDebugger.java`
#### Snippet
```java
anonymizeStanza(stanza).toXML().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/jabber/extensions/version/VersionManager.java`
#### Snippet
```java
StringUtils.escapeForXml(ver.getApplicationName()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/CallPeerMediaHandlerSipImpl.java`
#### Snippet
```java
createUpdateOffer(localSess).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/CallPeerMediaHandlerSipImpl.java`
#### Snippet
```java
processFirstOffer(offer).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/CallPeerMediaHandlerSipImpl.java`
#### Snippet
```java
processUpdateOffer(offer, localSess).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/CallPeerSipImpl.java`
#### Snippet
```java
getPeerAddress().getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/ContactSipImpl.java`
#### Snippet
```java
contactAddress.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/OperationSetBasicTelephonySipImpl.java`
#### Snippet
```java
callPeer.getPeerAddress().getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/OperationSetBasicTelephonySipImpl.java`
#### Snippet
```java
fromHeader.getAddress().getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/OperationSetBasicTelephonySipImpl.java`
#### Snippet
```java
fromHeader.getAddress().getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/OperationSetBasicTelephonySipImpl.java`
#### Snippet
```java
fromHeader.getAddress().getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/OperationSetBasicTelephonySipImpl.java`
#### Snippet
```java
referToAddress.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/OperationSetBasicTelephonySipImpl.java`
#### Snippet
```java
fromHeader.getAddress().getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/OperationSetBasicTelephonySipImpl.java`
#### Snippet
```java
referToAddress.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/OperationSetBasicTelephonySipImpl.java`
#### Snippet
```java
replacesHeader.encodeBody(new StringBuilder()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/OperationSetPresenceSipImpl.java`
#### Snippet
```java
contact.getSipAddress().getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/OperationSetPresenceSipImpl.java`
#### Snippet
```java
fromAddress.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/OperationSetPresenceSipImpl.java`
#### Snippet
```java
address.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/OperationSetTelephonyConferencingSipImpl.java`
#### Snippet
```java
localPartyAddress.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/ServerStoredContactListSipImpl.java`
#### Snippet
```java
contactAddress.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/sdp/SdpUtils.java`
#### Snippet
```java
extension.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/security/SipSecurityManager.java`
#### Snippet
```java
reoriginatedRequest.getRequestURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/security/SipSecurityManager.java`
#### Snippet
```java
reoriginatedRequest.getContent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/xcap/XCapClientImpl.java`
#### Snippet
```java
userAddress.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/xcap/XCapClientImpl.java`
#### Snippet
```java
userAddress.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/protocol/sip/xcap/XCapClientImpl.java`
#### Snippet
```java
userAddress.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/impl/replacement/emoji/EmojiReplacementService.java`
#### Snippet
```java
res.getImageURLForPath(path).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/plugin/generalconfig/RingtoneSelectorComboBox.java`
#### Snippet
```java
e.mInvalidValue.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/plugin/generalconfig/RingtoneSelectorComboBox.java`
#### Snippet
```java
e.mInvalidValue.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/plugin/generalconfig/RingtoneSelectorComboBox.java`
#### Snippet
```java
e.mInvalidValue.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/service/protocol/emergencylocation/LocationAddress.java`
#### Snippet
```java
new ToStringBuilder(this, ToStringStyle.NO_CLASS_NAME_STYLE).append("number", number).append("numberSuffix", numberSuffix).append("preDirectional", preDirectional).append("streetName", streetName).append("streetSuffix", streetSuffix).append("postDirectional", postDirectional).append("addressLine2", addressLine2).append("city", city).append("stateOrProvince", stateOrProvince).append("postalCode", postalCode).append("country", country).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/service/protocol/media/AbstractOperationSetTelephonyConferencing.java`
#### Snippet
```java
MediaType.AUDIO.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/service/protocol/media/AbstractOperationSetTelephonyConferencing.java`
#### Snippet
```java
MediaType.VIDEO.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/service/protocol/media/CallPeerMediaHandler.java`
#### Snippet
```java
remoteExtension.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/util/NetworkUtils.java`
#### Snippet
```java
r.getReplacement().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/util/PrivacyUtils.java`
#### Snippet
```java
obj.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/util/PrivacyUtils.java`
#### Snippet
```java
obj.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/util/PrivacyUtils.java`
#### Snippet
```java
str.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/util/PrivacyUtils.java`
#### Snippet
```java
obj.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/util/SRVRecord.java`
#### Snippet
```java
record.getTarget().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-MaXUC-Jitsi-Fork-18927444387977279196214606143669230941/src/net/java/sip/communicator/util/SRVRecord.java`
#### Snippet
```java
record.getName().toString()
```

