# talkback 
 
# Bad smells
I found 33 bad smells with 33 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 33 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/braille/common/src/phone/java/com/google/android/accessibility/braille/common/BraillePreferenceUtils.java`
#### Snippet
```java
newValue.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/braille/common/src/phone/java/com/google/android/accessibility/braille/common/translate/EditBufferUeb2WithPartial.java`
#### Snippet
```java
SpeechCleanupUtils.cleanUp(context, text).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/braille/common/src/phone/java/com/google/android/accessibility/braille/common/translate/EditBufferUeb2WithPartial.java`
#### Snippet
```java
SpeechCleanupUtils.cleanUp(context, text).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/braille/common/src/phone/java/com/google/android/accessibility/braille/common/translate/EditBufferUtils.java`
#### Snippet
```java
extractedText.text.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/braille/common/src/phone/java/com/google/android/accessibility/braille/common/translate/EditBufferUtils.java`
#### Snippet
```java
extractedText.text.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/braille/common/src/phone/java/com/google/android/accessibility/braille/common/translate/EditBufferUtils.java`
#### Snippet
```java
extractedText.text.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/braille/common/src/phone/java/com/google/android/accessibility/braille/common/translate/EditBufferUtils.java`
#### Snippet
```java
extractedText.text.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/braille/common/src/phone/java/com/google/android/accessibility/braille/common/translate/EditBufferUtils.java`
#### Snippet
```java
extractedText.text.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/braille/common/src/phone/java/com/google/android/accessibility/braille/common/translate/EditBufferUtils.java`
#### Snippet
```java
extractedText.text.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/braille/common/src/phone/java/com/google/android/accessibility/braille/common/translate/EditBufferUtils.java`
#### Snippet
```java
extractedText.text.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/braille/common/src/phone/java/com/google/android/accessibility/braille/common/translate/EditBufferUtils.java`
#### Snippet
```java
SpeechCleanupUtils.cleanUp(context, text).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/braille/common/src/phone/java/com/google/android/accessibility/braille/common/translate/EditBufferUtils.java`
#### Snippet
```java
SpeechCleanupUtils.cleanUp(context, text).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/braille/brailleime/src/phone/java/com/google/android/accessibility/brailleime/Utils.java`
#### Snippet
```java
BrailleUserPreferences.readCurrentActiveInputCodeAndCorrect(context).getUserFacingName(context.getResources()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/braille/brailleime/src/phone/java/com/google/android/accessibility/brailleime/settings/BrailleImePreferencesActivity.java`
#### Snippet
```java
newValue.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/talkback/src/main/java/com/google/android/accessibility/talkback/actor/search/SearchScreenOverlay.java`
#### Snippet
```java
keywordEditText.getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/talkback/src/main/java/com/google/android/accessibility/talkback/actor/search/SearchScreenOverlay.java`
#### Snippet
```java
keywordEditText.getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/talkback/src/main/java/com/google/android/accessibility/talkback/actor/search/SearchScreenOverlay.java`
#### Snippet
```java
keywordEditText.getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/talkback/src/main/java/com/google/android/accessibility/talkback/actor/search/SearchScreenOverlay.java`
#### Snippet
```java
keywordEditText.getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/talkback/src/main/java/com/google/android/accessibility/talkback/actor/search/SearchScreenOverlay.java`
#### Snippet
```java
keywordEditText.getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/talkback/src/main/java/com/google/android/accessibility/talkback/eventprocessor/ProcessorPhoneticLetters.java`
#### Snippet
```java
span.getLocale().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/talkback/src/main/java/com/google/android/accessibility/talkback/labeling/LabelDialogManager.java`
#### Snippet
```java
editField.getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/talkback/src/main/java/com/google/android/accessibility/talkback/labeling/LabelDialogManager.java`
#### Snippet
```java
editField.getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/talkback/src/main/java/com/google/android/accessibility/talkback/labeling/PackageRemovalReceiver.java`
#### Snippet
```java
intent.getData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/talkback/src/main/java/com/google/android/accessibility/talkback/menurules/NodeMenuRuleProcessor.java`
#### Snippet
```java
rule.getUserFriendlyMenuName(service).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/talkback/src/main/java/com/google/android/accessibility/talkback/preference/base/FocusIndicatorPrefFragment.java`
#### Snippet
```java
preference.getTitle().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/talkback/src/main/java/com/google/android/accessibility/talkback/preference/base/FocusIndicatorPrefFragment.java`
#### Snippet
```java
pref.getTitle().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/talkback/src/main/java/com/google/android/accessibility/talkback/preference/base/KeyboardShortcutPreferenceFragmentCompat.java`
#### Snippet
```java
instructionText.getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/utils/src/main/java/com/google/android/accessibility/utils/AccessibilityServiceCompatUtils.java`
#### Snippet
```java
rootNode.getPackageName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/utils/src/main/java/com/google/android/accessibility/utils/TreeDebug.java`
#### Snippet
```java
node.getContentDescription().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/utils/src/main/java/com/google/android/accessibility/utils/TreeDebug.java`
#### Snippet
```java
AccessibilityNodeInfoUtils.getState(node).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/utils/src/main/java/com/google/android/accessibility/utils/WebInterfaceUtils.java`
#### Snippet
```java
node.getPackageName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/utils/src/main/java/com/google/android/accessibility/utils/input/SpeechStateMonitor.java`
#### Snippet
```java
event.getPackageName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-talkback101534783352609613810886659515204452032/utils/src/main/java/com/google/android/accessibility/utils/output/SpeechControllerImpl.java`
#### Snippet
```java
clip.getItemAt(0).getText().toString()
```

