# rides-android-sdk 
 
# Bad smells
I found 9 bad smells with 9 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 9 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-rides-android-sdk35356699544551039208250644605817189543/core-android/src/test/java/com/uber/sdk/android/core/UberButtonTest.java`
#### Snippet
```java
uberButton.getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-rides-android-sdk35356699544551039208250644605817189543/core-android/src/test/java/com/uber/sdk/android/core/UberButtonTest.java`
#### Snippet
```java
uberButton.getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-rides-android-sdk35356699544551039208250644605817189543/core-android/src/test/java/com/uber/sdk/android/core/UberButtonTest.java`
#### Snippet
```java
uberButton.getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-rides-android-sdk35356699544551039208250644605817189543/core-android/src/main/java/com/uber/sdk/android/core/auth/AuthUtils.java`
#### Snippet
```java
builder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-rides-android-sdk35356699544551039208250644605817189543/core-android/src/test/java/com/uber/sdk/android/core/auth/LoginActivityTest.java`
#### Snippet
```java
signupDeeplinkIntent.getData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-rides-android-sdk35356699544551039208250644605817189543/core-android/src/test/java/com/uber/sdk/android/core/auth/OAuthWebViewClientTest.java`
#### Snippet
```java
uriCaptor.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-rides-android-sdk35356699544551039208250644605817189543/core-android/src/test/java/com/uber/sdk/android/core/auth/SsoDeeplinkTest.java`
#### Snippet
```java
intent.getData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-rides-android-sdk35356699544551039208250644605817189543/core-android/src/test/java/com/uber/sdk/android/core/auth/SsoDeeplinkTest.java`
#### Snippet
```java
intent.getData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-rides-android-sdk35356699544551039208250644605817189543/rides-android/src/main/java/com/uber/sdk/android/rides/RideRequestView.java`
#### Snippet
```java
builder.build().toString()
```

