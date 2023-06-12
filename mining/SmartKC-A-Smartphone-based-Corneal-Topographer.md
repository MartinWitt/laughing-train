# SmartKC-A-Smartphone-based-Corneal-Topographer 
 
# Bad smells
I found 3 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 3 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-SmartKC-A-Smartphone-based-Corneal-Topographer-212534034335255547112930108952430357633/mobile_app/smartkc_mobile_app_src/app/src/main/java/com/example/kt/DataActivity.java`
#### Snippet
```java
patientId.getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-SmartKC-A-Smartphone-based-Corneal-Topographer-212534034335255547112930108952430357633/mobile_app/smartkc_mobile_app_src/app/src/main/java/com/example/kt/DataActivity.java`
#### Snippet
```java
patientAge.getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-SmartKC-A-Smartphone-based-Corneal-Topographer-212534034335255547112930108952430357633/mobile_app/smartkc_mobile_app_src/app/src/main/java/com/example/kt/DataActivity.java`
#### Snippet
```java
feedbackSpinner.getSelectedItem().toString()
```

