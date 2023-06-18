# assertj-swing 
 
# Bad smells
I found 5 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 5 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-swing182157316867006577117491790886483665129/assertj-swing-jide/src/main/java/org/assertj/swing/jide/grids/driver/AbstractComboBoxDriver.java`
#### Snippet
```java
propertyName(comboBox, SELECTED_INDEX_PROPERTY).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-swing182157316867006577117491790886483665129/assertj-swing-jide/src/main/java/org/assertj/swing/jide/grids/driver/ListComboBoxDriver.java`
#### Snippet
```java
itemAt(comboBox, i).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-swing182157316867006577117491790886483665129/assertj-swing/src/main/java/org/assertj/swing/core/LabelMatcher.java`
#### Snippet
```java
checkNotNullOrEmpty(label).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-swing182157316867006577117491790886483665129/assertj-swing/src/main/java/org/assertj/swing/core/NameMatcher.java`
#### Snippet
```java
checkNotNullOrEmpty(name).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-swing182157316867006577117491790886483665129/assertj-swing/src/main/java/org/assertj/swing/driver/JOptionPaneMessageTypes.java`
#### Snippet
```java
checkNotNullOrEmpty(messageMap.get(messageType)).toString()
```

