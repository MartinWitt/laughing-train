# assertj-db 
 
# Bad smells
I found 116 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DuplicatedCode | 37 | false |
| JavadocReference | 35 | false |
| TrivialStringConcatenation | 31 | false |
| NullArgumentToVariableArgMethod | 5 | false |
| DataFlowIssue | 4 | false |
| RedundantCast | 2 | false |
| IOStreamConstructor | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/api/SoftProxies.java`
#### Snippet
```java
    try {
      Class<? extends V> proxyClass = createProxyClass(assertClass);
      Constructor<? extends V> constructor = proxyClass.getConstructor(actualClass);
      return constructor.newInstance(actual);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnColumnContent.java`
#### Snippet
```java
      boolean found = false;
      List<Value> newList = new ArrayList<>();
      for (Value obj : list) {
        if (found || !Values.areEqual(obj, val)) {
          newList.add(obj);
        }
        else {
          found = true;
        }
      }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnColumnEquality.java`
#### Snippet
```java
    int index = 0;
    for (Value value : valuesList) {
      if (!areEqual(value, expected[index])) {
        throw failures.failure(info, shouldBeEqual(index, value.getValue(), expected[index]));
      }
      index++;
    }
    return assertion;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnColumnEquality.java`
#### Snippet
```java
    int index = 0;
    for (Value value : valuesList) {
      if (!areEqual(value, expected[index])) {
        throw failures.failure(info,
                               shouldBeEqual(index,
                                             Values.getRepresentationFromValueInFrontOfExpected(value, expected[index]),
                                             expected[index]));
      }
      index++;
    }
    return assertion;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnColumnEquality.java`
#### Snippet
```java
    AssertionsOnColumnType
            .isOfAnyTypeIn(assertion, info, valuesList, ValueType.DATE, ValueType.DATE_TIME, ValueType.NOT_IDENTIFIED);
    AssertionsOnNumberOfRows.hasNumberOfRows(assertion, info, valuesList.size(), expected.length);
    int index = 0;
    for (Value value : valuesList) {
      if (!areEqual(value, expected[index])) {
        throw failures.failure(info,
                               shouldBeEqual(index, Values.getRepresentationFromValueInFrontOfExpected(value, expected[index]), expected[index]));
      }
      index++;
    }
    return assertion;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnColumnOfChangeEquality.java`
#### Snippet
```java
    AssertionsOnColumnOfChangeType.isBoolean(assertion, info, valueAtStartPoint, valueAtEndPoint, true);
    if (!areEqual(valueAtStartPoint, expected)) {
      throw failures.failure(info, shouldBeEqualWithStartPoint(valueAtStartPoint.getValue(), expected));
    }
    if (!areEqual(valueAtEndPoint, expected)) {
      throw failures.failure(info, shouldBeEqualWithEndPoint(valueAtEndPoint.getValue(), expected));
    }
    return assertion;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnColumnOfChangeEquality.java`
#### Snippet
```java
    AssertionsOnColumnOfChangeType.isNumber(assertion, info, valueAtStartPoint, valueAtEndPoint, true);
    if (!areEqual(valueAtStartPoint, expected)) {
      throw failures.failure(info, shouldBeEqualWithStartPoint(
              Values.getRepresentationFromValueInFrontOfExpected(valueAtStartPoint, expected), expected));
    }
    if (!areEqual(valueAtEndPoint, expected)) {
      throw failures.failure(info, shouldBeEqualWithEndPoint(
              Values.getRepresentationFromValueInFrontOfExpected(valueAtEndPoint, expected), expected));
    }
    return assertion;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnColumnOfChangeEquality.java`
#### Snippet
```java
    AssertionsOnColumnOfChangeType.isBytes(assertion, info, valueAtStartPoint, valueAtEndPoint, true);
    if (!areEqual(valueAtStartPoint, expected)) {
      throw failures.failure(info, shouldBeEqualWithStartPoint());
    }
    if (!areEqual(valueAtEndPoint, expected)) {
      throw failures.failure(info, shouldBeEqualWithEndPoint());
    }
    return assertion;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnColumnOfChangeEquality.java`
#### Snippet
```java
    AssertionsOnColumnOfChangeType.isOfAnyTypeIn(assertion, info, valueAtStartPoint, valueAtEndPoint,
                                                 ValueType.TEXT, ValueType.NUMBER, ValueType.DATE,
                                                 ValueType.TIME, ValueType.DATE_TIME, ValueType.UUID, ValueType.NOT_IDENTIFIED);
    if (!areEqual(valueAtStartPoint, expected)) {
      throw failures.failure(info, shouldBeEqualWithStartPoint(
              Values.getRepresentationFromValueInFrontOfExpected(valueAtStartPoint, expected), expected));
    }
    if (!areEqual(valueAtEndPoint, expected)) {
      throw failures.failure(info, shouldBeEqualWithEndPoint(
              Values.getRepresentationFromValueInFrontOfExpected(valueAtEndPoint, expected), expected));
    }
    return assertion;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnColumnOfChangeEquality.java`
#### Snippet
```java
    AssertionsOnColumnOfChangeType.isText(assertion, info, valueAtStartPoint, valueAtEndPoint, true);
    if (!areEqual(valueAtStartPoint, expected)) {
      throw failures.failure(info, shouldBeEqualWithStartPoint(valueAtStartPoint.getValue(), expected));
    }
    if (!areEqual(valueAtEndPoint, expected)) {
      throw failures.failure(info, shouldBeEqualWithEndPoint(valueAtEndPoint.getValue(), expected));
    }
    return assertion;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnColumnOfChangeEquality.java`
#### Snippet
```java
    AssertionsOnColumnOfChangeType
        .isOfAnyTypeIn(assertion, info, valueAtStartPoint, valueAtEndPoint, ValueType.DATE,
                       ValueType.DATE_TIME, ValueType.NOT_IDENTIFIED);
    if (!areEqual(valueAtStartPoint, expected)) {
      throw failures.failure(info, shouldBeEqualWithStartPoint(
          Values.getRepresentationFromValueInFrontOfExpected(valueAtStartPoint, expected), expected));
    }
    if (!areEqual(valueAtEndPoint, expected)) {
      throw failures.failure(info, shouldBeEqualWithEndPoint(
          Values.getRepresentationFromValueInFrontOfExpected(valueAtEndPoint, expected), expected));
    }
    return assertion;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnColumnOfChangeEquality.java`
#### Snippet
```java
    AssertionsOnColumnOfChangeType.isOfAnyTypeIn(assertion, info, valueAtStartPoint, valueAtEndPoint, ValueType.TIME,
                                                 ValueType.NOT_IDENTIFIED);
    if (!areEqual(valueAtStartPoint, expected)) {
      throw failures.failure(info, shouldBeEqualWithStartPoint(
              Values.getRepresentationFromValueInFrontOfExpected(valueAtStartPoint, expected), expected));
    }
    if (!areEqual(valueAtEndPoint, expected)) {
      throw failures.failure(info, shouldBeEqualWithEndPoint(
              Values.getRepresentationFromValueInFrontOfExpected(valueAtEndPoint, expected), expected));
    }
    return assertion;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnColumnOfChangeEquality.java`
#### Snippet
```java
    AssertionsOnColumnOfChangeType.isOfAnyTypeIn(assertion, info, valueAtStartPoint, valueAtEndPoint,
                                                 ValueType.UUID, ValueType.NOT_IDENTIFIED);
    if (!areEqual(valueAtStartPoint, expected)) {
      throw failures.failure(info, shouldBeEqualWithStartPoint(
          Values.getRepresentationFromValueInFrontOfExpected(valueAtStartPoint, expected), expected));
    }
    if (!areEqual(valueAtEndPoint, expected)) {
      throw failures.failure(info, shouldBeEqualWithEndPoint(
          Values.getRepresentationFromValueInFrontOfExpected(valueAtEndPoint, expected), expected));
    }
    return assertion;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnModifiedColumns.java`
#### Snippet
```java
    List<String> namesList = new ArrayList<>();
    for (String name : names) {
      if (name == null) {
        throw new NullPointerException("Column name must be not null");
      }
      namesList.add(name);
    }
    namesList.sort(columnLetterCase);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnValueChronology.java`
#### Snippet
```java
    Object object = value.getValue();
    AssertionsOnValueType.isOfAnyTypeIn(assertion, info, value, ValueType.DATE, ValueType.DATE_TIME);
    DateTimeValue dateTimeValue;
    if (object instanceof Date) {
      dateTimeValue = DateTimeValue.of(DateValue.from((Date) object));
    } else {
      dateTimeValue = DateTimeValue.from((Timestamp) object);
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnValueCloseness.java`
#### Snippet
```java
    if (expected != null) {
      AssertionsOnValueType.isOfAnyTypeIn(assertion, info, value, ValueType.DATE, ValueType.DATE_TIME);
    }
    if (areClose(value, expected, tolerance)) {
      return assertion;
    }
    Object object = value.getValue();
    if (value.getValueType() == ValueType.DATE) {
      throw failures.failure(info, shouldBeClose(DateValue.from((Date) object), expected, tolerance));
    }
    if (expected != null) {
      throw failures.failure(info, shouldBeClose(DateTimeValue.from((Timestamp) object), DateTimeValue.of(expected), tolerance));
    }
    throw failures.failure(info, shouldBeClose(DateTimeValue.from((Timestamp) object), null, tolerance));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnValueCloseness.java`
#### Snippet
```java
    if (expected != null) {
      AssertionsOnValueType.isOfAnyTypeIn(assertion, info, value, ValueType.DATE, ValueType.DATE_TIME);
    }
    if (areClose(value, expected, tolerance)) {
      return assertion;
    }
    Object object = value.getValue();
    if (value.getValueType() == ValueType.DATE) {
      throw failures.failure(info, shouldBeClose(DateTimeValue.of(DateValue.from((Date) object)), expected, tolerance));
    }
    throw failures.failure(info, shouldBeClose(DateTimeValue.from((Timestamp) object), expected, tolerance));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/output/impl/HtmlOutput.java`
#### Snippet
```java
List<String> pksNameList = table.getPksNameList();
    List<String> columnsNameList = table.getColumnsNameList();
    List<Row> rowsList = table.getRowsList();
    Row[] rows = rowsList.toArray(new Row[0]);

    List<String> typesList = OutputType.getTypesList(rows);
    StringBuilder[] pksValueStringBuilders = OutputType.getPksValueStringBuilder(rows);

    StringBuilder stringBuilder = new StringBuilder();

    stringBuilder.append("<table border=\"1\" cellspacing=\"0\">");
    stringBuilder.append("<tr>");
    stringBuilder.append("<th>");
    stringBuilder.append("</th>");
    stringBuilder.append("<th>");
    stringBuilder.append("<br/>PRIMARY<br/>KEY");
    stringBuilder.append("</th>");
    int index = 0;
    for (String columnName : columnsNameList) {
      String pk = "";
      if (pksNameList.contains(columnName)) {
        pk = "*";
      }
      stringBuilder.append("<th>");
      stringBuilder.append(pk);
      stringBuilder.append("<br/>");
      stringBuilder.append(columnName);
      stringBuilder.append("<br/>");
      if (index < typesList.size()) {
        stringBuilder.append(typesList.get(index));
      }
      stringBuilder.append("<br/>Index : ");
      stringBuilder.append(index);
      stringBuilder.append("</th>");

      index++;
    }
    stringBuilder.append("</tr>");
    index = 0;
    for (Row row : table.getRowsList()) {
      stringBuilder.append("<tr>");
      stringBuilder.append("<td>Index :");
      stringBuilder.append(index);
      stringBuilder.append("</td>");
      stringBuilder.append("<td>");
      stringBuilder.append(pksValueStringBuilders[index]);
      stringBuilder.append("</td>");
      for (Value value : row.getValuesList()) {
        stringBuilder.append("<td>");
        stringBuilder.append(OutputType.getText(value));
        stringBuilder.append("</td>");
      }
      stringBuilder.append("</tr>");
      index++;
    }
    stringBuilder.append("</table>");

    return getHtml(info, stringBuilder.toString());
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/output/impl/HtmlOutput.java`
#### Snippet
```java
      String dataName = OutputType.getDataName(change);
      List<String> columnsNameList = change.getColumnsNameList();
      Row rowAtStartPoint = change.getRowAtStartPoint();
      Row rowAtEndPoint = change.getRowAtEndPoint();

      StringBuilder[] pksValueStringBuilders = OutputType.getPksValueStringBuilder(change);
      List<String> typesList = OutputType.getTypesList(rowAtStartPoint, rowAtEndPoint);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/output/impl/HtmlOutput.java`
#### Snippet
```java
stringBuilder.append("<td>");
    stringBuilder.append(changeType);
    stringBuilder.append("</td>");
    stringBuilder.append("<td>");
    stringBuilder.append(dataName);
    stringBuilder.append("</td>");
    stringBuilder.append("<td>");
    stringBuilder.append(pksValueStringBuilders[0]);
    stringBuilder.append("</td>");
    stringBuilder.append("<td>");


    stringBuilder.append("<table border=\"1\" cellspacing=\"0\">");
    stringBuilder.append("<tr>");
    stringBuilder.append("<th>");
    stringBuilder.append("</th>");
    int index = 0;
    for (String columnName : columnsNameList) {
      String pk = "";
      if (change.getPksNameList().contains(columnName)) {
        pk = "*";
      }
      stringBuilder.append("<th>");
      stringBuilder.append(pk);
      stringBuilder.append("<br/>");
      stringBuilder.append(columnName);
      stringBuilder.append("<br/>");
      stringBuilder.append(typesList.get(index));
      stringBuilder.append("<br/>Index : ");
      stringBuilder.append(index);
      stringBuilder.append("</th>");

      index++;
    }
    stringBuilder.append("</tr>");

    stringBuilder.append("<tr>");
    stringBuilder.append("<td>");
    stringBuilder.append("At start point");
    stringBuilder.append("</td>");
    if (change.getRowAtStartPoint() == null) {
      for (String s : change.getColumnsNameList()) {
        stringBuilder.append("<td>");
        stringBuilder.append("</td>");
      }
    } else {
      for (Value value : change.getRowAtStartPoint().getValuesList()) {
        stringBuilder.append("<td>");
        stringBuilder.append(OutputType.getText(value));
        stringBuilder.append("</td>");
      }
    }
    stringBuilder.append("</tr>");
    stringBuilder.append("<tr>");
    stringBuilder.append("<td>");
    stringBuilder.append("At end point");
    stringBuilder.append("</td>");
    if (change.getRowAtEndPoint() == null) {
      for (String s : change.getColumnsNameList()) {
        stringBuilder.append("<td>");
        stringBuilder.append("</td>");
      }
    } else {
      for (Value value : change.getRowAtEndPoint().getValuesList()) {
        stringBuilder.append("<td>");
        stringBuilder.append(OutputType.getText(value));
        stringBuilder.append("</td>");
      }
    }
    stringBuilder.append("</tr>");
    stringBuilder.append("</table>");
    stringBuilder.append("</td>");
    stringBuilder.append("</tr>");
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/output/impl/HtmlOutput.java`
#### Snippet
```java
stringBuilder.append(changeType);
      stringBuilder.append("</td>");
      stringBuilder.append("<td>");
      stringBuilder.append(dataName);
      stringBuilder.append("</td>");
      stringBuilder.append("<td>");
      stringBuilder.append(pksValueStringBuilders[0]);
      stringBuilder.append("</td>");
      stringBuilder.append("<td>");
      stringBuilder.append("<table border=\"1\" cellspacing=\"0\">");
      stringBuilder.append("<tr>");
      stringBuilder.append("<th>");
      stringBuilder.append("</th>");
      int index = 0;
      for (String columnName : columnsNameList) {
        String pk = "";
        if (change.getPksNameList().contains(columnName)) {
          pk = "*";
        }
        stringBuilder.append("<th>");
        stringBuilder.append(pk);
        stringBuilder.append("<br/>");
        stringBuilder.append(columnName);
        stringBuilder.append("<br/>");
        stringBuilder.append(typesList.get(index));
        stringBuilder.append("<br/>Index : ");
        stringBuilder.append(index);
        stringBuilder.append("</th>");

        index++;
      }
      stringBuilder.append("</tr>");
      stringBuilder.append("<tr>");
      stringBuilder.append("<td>");
      stringBuilder.append("At start point");
      stringBuilder.append("</td>");
      if (change.getRowAtStartPoint() == null) {
        for (String s : change.getColumnsNameList()) {
          stringBuilder.append("<td>");
          stringBuilder.append("</td>");
        }
      } else {
        for (Value value : change.getRowAtStartPoint().getValuesList()) {
          stringBuilder.append("<td>");
          stringBuilder.append(OutputType.getText(value));
          stringBuilder.append("</td>");
        }
      }
      stringBuilder.append("</tr>");
      stringBuilder.append("<tr>");
      stringBuilder.append("<td>");
      stringBuilder.append("At end point");
      stringBuilder.append("</td>");
      if (change.getRowAtEndPoint() == null) {
        for (String s : change.getColumnsNameList()) {
          stringBuilder.append("<td>");
          stringBuilder.append("</td>");
        }
      } else {
        for (Value value : change.getRowAtEndPoint().getValuesList()) {
          stringBuilder.append("<td>");
          stringBuilder.append(OutputType.getText(value));
          stringBuilder.append("</td>");
        }
      }
      stringBuilder.append("</tr>");
      stringBuilder.append("</table>");
      stringBuilder.append("</td>");
      stringBuilder.append("</tr>");
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/output/impl/HtmlOutput.java`
#### Snippet
```java
    for (String columnName : columnsNameList) {
      String pk = "";
      if (row.getPksNameList().contains(columnName)) {
        pk = "*";
      }
      stringBuilder.append("<th>");
      stringBuilder.append(pk);
      stringBuilder.append("<br/>");
      stringBuilder.append(columnName);
      stringBuilder.append("<br/>");
      stringBuilder.append(typesList.get(index));
      stringBuilder.append("<br/>Index : ");
      stringBuilder.append(index);
      stringBuilder.append("</th>");

      index++;
    }
    stringBuilder.append("</tr>");
    stringBuilder.append("<tr>");
    stringBuilder.append("<td>");
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/output/impl/HtmlOutput.java`
#### Snippet
```java
    ChangeType changeType = change.getChangeType();
    DataType dataType = change.getDataType();
    String dataName = OutputType.getDataName(change);
    List<String> columnsNameList = change.getColumnsNameList();
    Row rowAtStartPoint = change.getRowAtStartPoint();
    Row rowAtEndPoint = change.getRowAtEndPoint();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/output/impl/OutputType.java`
#### Snippet
```java
        List<Value> valuesList = new ArrayList<>();
        for (Row row : rows) {
          if (row != null) {
            Value value = row.getValuesList().get(index);
            valuesList.add(value);
          }
        }
        String type = OutputType.getType(valuesList.toArray(new Value[0]));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/output/impl/OutputType.java`
#### Snippet
```java
      List<Value> pksValueList = row.getPksValueList();
      StringBuilder pksValueStringBuilder = new StringBuilder();
      for (Value pkValue : pksValueList) {
        if (pksValueStringBuilder.length() > 0) {
          pksValueStringBuilder.append(", ");
        }
        pksValueStringBuilder.append(getText(pkValue));
      }
      stringBuildersList.add(pksValueStringBuilder);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("|");
    int index = 0;
    for (String content : otherColumnsContent) {
      Integer columnSize = sizesList.get(index);
      stringBuilder.append(getFilledText(content, columnSize));
      stringBuilder.append("|");
      index++;
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
    List<String> pksNameList = table.getPksNameList();
    List<String> columnsNameList = table.getColumnsNameList();
    List<Row> rowsList = table.getRowsList();
    Row[] rows = rowsList.toArray(new Row[0]);

    List<String> typesList = OutputType.getTypesList(rows);
    int indexColumnSize = getIndexColumnSize(rows.length);
    StringBuilder[] pksValueStringBuilders = OutputType.getPksValueStringBuilder(rows);
    int primaryKeyColumnSize = getColumnSize("PRIMARY", pksValueStringBuilders);
    List<Integer> sizesList = getSizesList(rows.length == 0 ? getColumnSizesList(columnsNameList) : getColumnSizesList(rows),
                                           indexColumnSize,
                                           primaryKeyColumnSize);

    StringBuilder stringBuilder = new StringBuilder();
    // Description
    stringBuilder.append("[").append(info.descriptionText()).append("]").append(EOL);
    // Line
    stringBuilder.append(getCompleteLine(sizesList));
    // Primary key
    stringBuilder.append(getCompletePrimaryKey(sizesList, pksNameList, columnsNameList));
    // Column name
    stringBuilder.append(getCompleteColumnName(sizesList, columnsNameList, "", "PRIMARY"));
    // Type
    stringBuilder.append(getCompleteType(sizesList, typesList, "", "KEY"));
    // Index
    stringBuilder.append(getCompleteIndex(sizesList, 2));
    // Line
    stringBuilder.append(getCompleteLine(sizesList));
    // Values
    int index = 0;
    for (Row row : rows) {
      stringBuilder.append(getCompleteRow(sizesList, row,
                                          "Index : " + index, pksValueStringBuilders[index]));
      index++;
    }
    // Line
    stringBuilder.append(getCompleteLine(sizesList));

    return stringBuilder.toString();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/type/DateTimeValue.java`
#### Snippet
```java
    TimeValue movedTimeValue = timeValue.move(time);

    int hours = movedTimeValue.getHours();
    int days = hours / 24;
    if (hours > 0) {
      hours -= days * 24;
    }
    else {
      hours += days * 24;
    }
    if (hours < 0) {
      days--;
      hours += 24;
    }

    DateValue dateValue = getDate();
    DateValue movedDateValue = dateValue.move(DateValue.of(0, 0, days));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/type/Row.java`
#### Snippet
```java
    List<Value> pksValueList = new ArrayList<>();
    if (pksNameList != null) {
      for (String name : pksNameList) {
        int index = NameComparator.INSTANCE.indexOf(columnsNameList, name, primaryKeyLetterCase);
        Value value = valuesList.get(index);
        pksValueList.add(value);
      }
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/type/Table.java`
#### Snippet
```java
      List<String> columnsToCheckList = new ArrayList<>();
      for (String column : columnsToCheck) {
        if (column == null) {
          throw new NullPointerException("The name of the column can not be null");
        }
        int indexOf = NameComparator.INSTANCE.indexOf(columnsList, column, letterCase);
        if (indexOf != -1) {
          columnsToCheckList.add(columnsList.get(indexOf));
        }
      }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/type/TimeValue.java`
#### Snippet
```java
    if (seconds > 0 && (thisSeconds + seconds >= 60)) {
      thisSeconds += seconds - 60;
      minutes++;
    }
    else if (seconds >= 0 || thisSeconds >= -seconds) {
      thisSeconds += seconds;
    }
    else {
      thisSeconds += 60 + seconds;
      minutes--;
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
      } else if (object instanceof Byte) {
        actualValue = ((Byte) object).longValue();
      } else if (object instanceof Short) {
        actualValue = ((Short) object).longValue();
      } else if (object instanceof Integer) {
        actualValue = ((Integer) object).longValue();
      } else if (object instanceof Long) {
        actualValue = (Long) object;
      }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
    if (tolerance instanceof Float) {
      return nb >= expected - tolerance.floatValue() &&
             nb <= expected + tolerance.floatValue();
    } else if (tolerance instanceof Double) {
      return nb >= expected - tolerance.doubleValue() &&
             nb <= expected + tolerance.doubleValue();
    } else {
      return nb >= expected - tolerance.longValue() &&
             nb <= expected + tolerance.longValue();
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
    } else if (object instanceof Timestamp) {
      Timestamp timestamp = (Timestamp) object;
      DateTimeValue dateTimeValue = DateTimeValue.from(timestamp);
      DateTimeValue dateTimeValueMin = DateTimeValue.of(expected).move(tolerance.reverse());
      DateTimeValue dateTimeValueMax = DateTimeValue.of(expected).move(tolerance);
      return dateTimeValue.compareTo(dateTimeValueMin) >= 0 && dateTimeValue.compareTo(dateTimeValueMax) <= 0;
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
    Object object = value.getValue();
    if (expected == null) {
      return object == null;
    }

    if (object instanceof Date) {
      Date date = (Date) object;
      DateTimeValue dateTimeValue = DateTimeValue.of(DateValue.from(date));
      DateTimeValue dateTimeValueMin = expected.move(tolerance.reverse());
      DateTimeValue dateTimeValueMax = expected.move(tolerance);
      return dateTimeValue.compareTo(dateTimeValueMin) >= 0 && dateTimeValue.compareTo(dateTimeValueMax) <= 0;
    } else if (object instanceof Timestamp) {
      Timestamp timestamp = (Timestamp) object;
      DateTimeValue dateTimeValue = DateTimeValue.from(timestamp);
      DateTimeValue dateTimeValueMin = DateTimeValue.of(expected).move(tolerance.reverse());
      DateTimeValue dateTimeValueMax = DateTimeValue.of(expected).move(tolerance);
      return dateTimeValue.compareTo(dateTimeValueMin) >= 0 && dateTimeValue.compareTo(dateTimeValueMax) <= 0;
    }
    return false;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
    Object object = value.getValue();
    if (expected == null) {
      return object == null;
    }

    if (object instanceof Date) {
      Date date = (Date) object;
      DateTimeValue dateTimeValue = DateTimeValue.of(DateValue.from(date));
      DateTimeValue dateTimeValueMin = expected.move(tolerance.reverse());
      DateTimeValue dateTimeValueMax = expected.move(tolerance);
      return dateTimeValue.compareTo(dateTimeValueMin) >= 0 && dateTimeValue.compareTo(dateTimeValueMax) <= 0;
    }
    if (object instanceof Timestamp) {
      Timestamp timestamp = (Timestamp) object;
      DateTimeValue dateTimeValue = DateTimeValue.from(timestamp);
      DateTimeValue dateTimeValueMin = expected.move(tolerance.reverse());
      DateTimeValue dateTimeValueMax = expected.move(tolerance);
      return dateTimeValue.compareTo(dateTimeValueMin) >= 0 && dateTimeValue.compareTo(dateTimeValueMax) <= 0;
    }
    return false;
```

### DuplicatedCode
Duplicated code
in `src/main/javadoc/assertj-javadoc.css`
#### Snippet
```java
    background-image:url(resources/background.gif);
    background-repeat:repeat-x;
    color:#FFFFFF;
    float:left;
    padding:0;
    width:100%;
    clear:right;
    height:2.8em;
    padding-top:10px;
    overflow:hidden;
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/assertj/db/api/Assertions.java`
#### Snippet
```java
    }

    try (InputStream inputStream = new FileInputStream(file)) {
      return read(inputStream);
    } catch (IOException e) {
```

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `load()` is inaccessible from here
in `src/main/java/org/assertj/db/type/Request.java`
#### Snippet
```java
   * 
   * @see AbstractDbData#loadImpl(Connection)
   * @param connection {@link Connection} to the database provided by {@link AbstractDbData#load()} private method.
   * @throws NullPointerException If the {@link #request} field is {@code null}.
   * @throws SQLException SQL Exception.
```

### JavadocReference
Symbol `load()` is inaccessible from here
in `src/main/java/org/assertj/db/type/Table.java`
#### Snippet
```java
   * Specific implementation of the loading for a {@code Table}.
   *
   * @param connection {@link Connection} to the database provided by {@link AbstractDbData#load()} private method.
   * @throws NullPointerException If the {@link #name} field is {@code null}.
   * @throws SQLException         SQL Exception.
```

### JavadocReference
Symbol `returnToOrigin()` is inaccessible from here
in `src/main/java/org/assertj/db/navigation/origin/package-info.java`
#### Snippet
```java
 * This package contains interfaces that defines the different {@link org.assertj.db.navigation.origin.Origin}s used by the navigation.
 * <p>These {@link org.assertj.db.navigation.origin.Origin}s are the key to help the navigation.<br>
 * The {@link org.assertj.db.navigation.origin.Origin} is used by the {@link org.assertj.db.api.AbstractAssertWithOrigin#returnToOrigin()} method
 * to return to the previous instance that provides assertion methods :
 * for example to return to a object with assertion methods on a table ({@link org.assertj.db.api.TableAssert})
```

### JavadocReference
Symbol `dataSource` is inaccessible from here
in `src/main/java/org/assertj/db/type/AbstractDbData.java`
#### Snippet
```java
   * @param index The column index.
   * @return The column and the values
   * @throws NullPointerException If the {@link #dataSource} and {@link #source} fields are {@code null}.
   * @throws AssertJDBException If triggered, this exception wrap a possible {@link SQLException} during the loading.
   */
```

### JavadocReference
Symbol `source` is inaccessible from here
in `src/main/java/org/assertj/db/type/AbstractDbData.java`
#### Snippet
```java
   * @param index The column index.
   * @return The column and the values
   * @throws NullPointerException If the {@link #dataSource} and {@link #source} fields are {@code null}.
   * @throws AssertJDBException If triggered, this exception wrap a possible {@link SQLException} during the loading.
   */
```

### JavadocReference
Symbol `dataSource` is inaccessible from here
in `src/main/java/org/assertj/db/type/AbstractDbData.java`
#### Snippet
```java
   * </p>
   *
   * @throws NullPointerException If the {@link #dataSource} and {@link #source} fields are {@code null}.
   * @throws AssertJDBException If triggered, this exception wrap a possible {@link SQLException} during the loading.
   */
```

### JavadocReference
Symbol `source` is inaccessible from here
in `src/main/java/org/assertj/db/type/AbstractDbData.java`
#### Snippet
```java
   * </p>
   *
   * @throws NullPointerException If the {@link #dataSource} and {@link #source} fields are {@code null}.
   * @throws AssertJDBException If triggered, this exception wrap a possible {@link SQLException} during the loading.
   */
```

### JavadocReference
Symbol `dataSource` is inaccessible from here
in `src/main/java/org/assertj/db/type/AbstractDbData.java`
#### Snippet
```java
   *
   * @return The list of the columns name.
   * @throws NullPointerException If the {@link #dataSource} and {@link #source} fields are {@code null}.
   * @throws AssertJDBException If triggered, this exception wrap a possible {@link SQLException} during the loading.
   */
```

### JavadocReference
Symbol `source` is inaccessible from here
in `src/main/java/org/assertj/db/type/AbstractDbData.java`
#### Snippet
```java
   *
   * @return The list of the columns name.
   * @throws NullPointerException If the {@link #dataSource} and {@link #source} fields are {@code null}.
   * @throws AssertJDBException If triggered, this exception wrap a possible {@link SQLException} during the loading.
   */
```

### JavadocReference
Symbol `dataSource` is inaccessible from here
in `src/main/java/org/assertj/db/type/AbstractDbData.java`
#### Snippet
```java
   *
   * @return The list of the values in columns.
   * @throws NullPointerException If the {@link #dataSource} and {@link #source} fields are {@code null}.
   * @throws AssertJDBException If triggered, this exception wrap a possible {@link SQLException} during the loading.
   */
```

### JavadocReference
Symbol `source` is inaccessible from here
in `src/main/java/org/assertj/db/type/AbstractDbData.java`
#### Snippet
```java
   *
   * @return The list of the values in columns.
   * @throws NullPointerException If the {@link #dataSource} and {@link #source} fields are {@code null}.
   * @throws AssertJDBException If triggered, this exception wrap a possible {@link SQLException} during the loading.
   */
```

### JavadocReference
Symbol `dataSource` is inaccessible from here
in `src/main/java/org/assertj/db/type/AbstractDbData.java`
#### Snippet
```java
   *
   * @return The list of the values.
   * @throws NullPointerException If the {@link #dataSource} and {@link #source} fields are {@code null}.
   * @throws AssertJDBException If triggered, this exception wrap a possible {@link SQLException} during the loading.
   */
```

### JavadocReference
Symbol `source` is inaccessible from here
in `src/main/java/org/assertj/db/type/AbstractDbData.java`
#### Snippet
```java
   *
   * @return The list of the values.
   * @throws NullPointerException If the {@link #dataSource} and {@link #source} fields are {@code null}.
   * @throws AssertJDBException If triggered, this exception wrap a possible {@link SQLException} during the loading.
   */
```

### JavadocReference
Symbol `dataSource` is inaccessible from here
in `src/main/java/org/assertj/db/type/AbstractDbData.java`
#### Snippet
```java
   * @param index The column index
   * @return The values
   * @throws NullPointerException If the {@link #dataSource} and {@link #source} fields are {@code null}.
   * @throws AssertJDBException If triggered, this exception wrap a possible {@link SQLException} during the loading.
   */
```

### JavadocReference
Symbol `source` is inaccessible from here
in `src/main/java/org/assertj/db/type/AbstractDbData.java`
#### Snippet
```java
   * @param index The column index
   * @return The values
   * @throws NullPointerException If the {@link #dataSource} and {@link #source} fields are {@code null}.
   * @throws AssertJDBException If triggered, this exception wrap a possible {@link SQLException} during the loading.
   */
```

### JavadocReference
Symbol `dataSource` is inaccessible from here
in `src/main/java/org/assertj/db/type/AbstractDbData.java`
#### Snippet
```java
   * @param index The index
   * @return The {@link Row}
   * @throws NullPointerException If the {@link #dataSource} and {@link #source} fields are {@code null}.
   * @throws AssertJDBException If triggered, this exception wrap a possible {@link SQLException} during the loading.
   */
```

### JavadocReference
Symbol `source` is inaccessible from here
in `src/main/java/org/assertj/db/type/AbstractDbData.java`
#### Snippet
```java
   * @param index The index
   * @return The {@link Row}
   * @throws NullPointerException If the {@link #dataSource} and {@link #source} fields are {@code null}.
   * @throws AssertJDBException If triggered, this exception wrap a possible {@link SQLException} during the loading.
   */
```

### JavadocReference
Symbol `dataSource` is inaccessible from here
in `src/main/java/org/assertj/db/type/AbstractDbData.java`
#### Snippet
```java
   *
   * @return The list of the primary key name.
   * @throws NullPointerException If the {@link #dataSource} and {@link #source} fields are {@code null}.
   * @throws AssertJDBException If triggered, this exception wrap a possible {@link SQLException} during the loading.
   */
```

### JavadocReference
Symbol `source` is inaccessible from here
in `src/main/java/org/assertj/db/type/AbstractDbData.java`
#### Snippet
```java
   *
   * @return The list of the primary key name.
   * @throws NullPointerException If the {@link #dataSource} and {@link #source} fields are {@code null}.
   * @throws AssertJDBException If triggered, this exception wrap a possible {@link SQLException} during the loading.
   */
```

### JavadocReference
Symbol `valueAtStartPoint` is inaccessible from here
in `src/main/java/org/assertj/db/navigation/ToValueFromColumn.java`
#### Snippet
```java
   *
   * @return An object to make assertions on the next value.
   * @see org.assertj.db.api.ChangeColumnAssert#valueAtStartPoint
   * @see org.assertj.db.api.ChangeColumnValueAssert#valueAtStartPoint
   */
```

### JavadocReference
Symbol `valueAtEndPoint` is inaccessible from here
in `src/main/java/org/assertj/db/navigation/ToValueFromColumn.java`
#### Snippet
```java
   *
   * @return An object to make assertions on the value.
   * @see org.assertj.db.api.ChangeColumnAssert#valueAtEndPoint
   * @see org.assertj.db.api.ChangeColumnValueAssert#valueAtEndPoint
   */
```

### JavadocReference
Cannot resolve symbol `org.assertj.core.api.SoftAssertions`
in `src/main/java/org/assertj/db/api/SoftAssertions.java`
#### Snippet
```java
 * proxies of the AssertJ-DB assertion objects.
 *
 * For more details see AssertJ implementation : {@link org.assertj.core.api.SoftAssertions}
 *
 * @author Julien Roy
```

### JavadocReference
Cannot resolve symbol `Condition`
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueCondition.java`
#### Snippet
```java
   * @throws NullPointerException if the given condition is {@code null}.
   * @throws AssertionError if the actual value does not satisfy the given condition.
   * @see org.assertj.db.api.AbstractValueAssert#is(Condition)
   * @see org.assertj.db.api.AbstractAssertWithValues#is(Condition)
   */
```

### JavadocReference
Cannot resolve symbol `Condition`
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueCondition.java`
#### Snippet
```java
   * @throws AssertionError if the actual value does not satisfy the given condition.
   * @see org.assertj.db.api.AbstractValueAssert#is(Condition)
   * @see org.assertj.db.api.AbstractAssertWithValues#is(Condition)
   */
  T is(Condition<?> condition);
```

### JavadocReference
Cannot resolve symbol `Condition`
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueCondition.java`
#### Snippet
```java
   * @throws NullPointerException if the given condition is {@code null}.
   * @throws AssertionError if the actual value satisfies the given condition.
   * @see org.assertj.db.api.AbstractValueAssert#isNot(Condition)
   * @see org.assertj.db.api.AbstractAssertWithValues#isNot(Condition)
   */
```

### JavadocReference
Cannot resolve symbol `Condition`
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueCondition.java`
#### Snippet
```java
   * @throws AssertionError if the actual value satisfies the given condition.
   * @see org.assertj.db.api.AbstractValueAssert#isNot(Condition)
   * @see org.assertj.db.api.AbstractAssertWithValues#isNot(Condition)
   */
  T isNot(Condition<?> condition);
```

### JavadocReference
Cannot resolve symbol `Condition`
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueCondition.java`
#### Snippet
```java

  /**
   * Verifies that the actual value satisfies the given condition. This method is an alias for <code>{@link #is(Condition)}</code>.
   *
   * @param condition the given condition.
```

### JavadocReference
Cannot resolve symbol `Condition`
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueCondition.java`
#### Snippet
```java
   * @throws NullPointerException if the given condition is {@code null}.
   * @throws AssertionError if the actual value does not satisfy the given condition.
   * @see org.assertj.db.api.AbstractValueAssert#has(Condition)
   * @see org.assertj.db.api.AbstractAssertWithValues#has(Condition)
   */
```

### JavadocReference
Cannot resolve symbol `Condition`
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueCondition.java`
#### Snippet
```java
   * @throws AssertionError if the actual value does not satisfy the given condition.
   * @see org.assertj.db.api.AbstractValueAssert#has(Condition)
   * @see org.assertj.db.api.AbstractAssertWithValues#has(Condition)
   */
  T has(Condition<?> condition);
```

### JavadocReference
Cannot resolve symbol `Condition`
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueCondition.java`
#### Snippet
```java

  /**
   * Verifies that the actual value satisfies the given condition. This method is an alias for <code>{@link #is(Condition)}</code>.
   *
   * @param condition the given condition.
```

### JavadocReference
Cannot resolve symbol `Condition`
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueCondition.java`
#### Snippet
```java
   * @throws NullPointerException if the given condition is {@code null}.
   * @throws AssertionError if the actual value does not satisfy the given condition.
   * @see org.assertj.db.api.AbstractValueAssert#satisfies(Condition)
   * @see org.assertj.db.api.AbstractAssertWithValues#satisfies(Condition)
   */
```

### JavadocReference
Cannot resolve symbol `Condition`
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueCondition.java`
#### Snippet
```java
   * @throws AssertionError if the actual value does not satisfy the given condition.
   * @see org.assertj.db.api.AbstractValueAssert#satisfies(Condition)
   * @see org.assertj.db.api.AbstractAssertWithValues#satisfies(Condition)
   */
  T satisfies(Condition<?> condition);
```

### JavadocReference
Cannot resolve symbol `Condition`
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueCondition.java`
#### Snippet
```java

  /**
   * Verifies that the actual value does not satisfy the given condition. This method is an alias for <code>{@link #isNot(Condition)}</code>.
   *
   * @param condition the given condition.
```

### JavadocReference
Cannot resolve symbol `Condition`
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueCondition.java`
#### Snippet
```java
   * @throws NullPointerException if the given condition is {@code null}.
   * @throws AssertionError if the actual value satisfies the given condition.
   * @see org.assertj.db.api.AbstractValueAssert#doesNotHave(Condition)
   * @see org.assertj.db.api.AbstractAssertWithValues#doesNotHave(Condition)
   */
```

### JavadocReference
Cannot resolve symbol `Condition`
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueCondition.java`
#### Snippet
```java
   * @throws AssertionError if the actual value satisfies the given condition.
   * @see org.assertj.db.api.AbstractValueAssert#doesNotHave(Condition)
   * @see org.assertj.db.api.AbstractAssertWithValues#doesNotHave(Condition)
   */
  T doesNotHave(Condition<?> condition);
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Casting `object` to `Timestamp` may produce `ClassCastException`
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnValueChronology.java`
#### Snippet
```java
      dateTimeValue = DateTimeValue.of(DateValue.from((Date) object));
    } else {
      dateTimeValue = DateTimeValue.from((Timestamp) object);
    }

```

### DataFlowIssue
Casting `object` to `Timestamp` may produce `ClassCastException`
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnValueChronology.java`
#### Snippet
```java
      dateTimeValue = DateTimeValue.of(DateValue.from((Date) object));
    } else {
      dateTimeValue = DateTimeValue.from((Timestamp) object);
    }

```

### DataFlowIssue
Casting `object` to `Timestamp` may produce `ClassCastException`
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnValueChronology.java`
#### Snippet
```java
      dateTimeValue = DateTimeValue.of(DateValue.from((Date) object));
    } else {
      dateTimeValue = DateTimeValue.from((Timestamp) object);
    }

```

### DataFlowIssue
Casting `object` to `Timestamp` may produce `ClassCastException`
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnValueChronology.java`
#### Snippet
```java
      dateTimeValue = DateTimeValue.of(DateValue.from((Date) object));
    } else {
      dateTimeValue = DateTimeValue.from((Timestamp) object);
    }

```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/OutputType.java`
#### Snippet
```java
    }
    if (type == ValueType.DATE_TIME) {
      return "" + DateTimeValue.from((Timestamp) object);
    }
    if (type == ValueType.DATE) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/OutputType.java`
#### Snippet
```java
    }
    if (type == ValueType.DATE) {
      return "" + DateValue.from((Date) object);
    }
    if (type == ValueType.TIME) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/OutputType.java`
#### Snippet
```java
    }
    if (type == ValueType.TIME) {
      return "" + TimeValue.from((Time) object);
    } else {
      return "" + object;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/OutputType.java`
#### Snippet
```java
      return "" + TimeValue.from((Time) object);
    } else {
      return "" + object;
    }
  }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
      DataType dataType = change.getDataType();
      String dataName = OutputType.getDataName(change);
      int dataTypeColumnSize = getColumnSize("" + dataType, dataName);
      if (size < dataTypeColumnSize) {
        size = dataTypeColumnSize;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
   */
  private static int getColumnSize(String columnName, String type, Integer index, Value... values) {
    int size = ("" + columnName).length();
    int typeSize = type.length();
    if (typeSize > size) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
   */
  private static String getText(Object object) {
    return "" + object;
  }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
      // Column name
      stringBuilder.append(getCompleteColumnName(sizesList, columnsNameList,
                                                 "", "TYPE", "" + dataType, "PRIMARY", ""));
      // Type
      stringBuilder.append(getCompleteType(sizesList, typesList,
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
    for (Integer size : sizesList) {
      if (index < otherColumnsContent.length) {
        stringBuilder.append(getFilledText("" + otherColumnsContent[index], size));
        stringBuilder.append("|");
      }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
    for (int size : sizesList) {
      if (index < otherColumnsContent.length) {
        stringBuilder.append(getFilledText("" + otherColumnsContent[index], size));
      } else {
        stringBuilder.append(getCellLine(size));
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java

    int changeTypeColumnSize = getColumnSize("TYPE", changeType);
    int dataTypeColumnSize = getColumnSize("" + dataType, dataName);
    int primaryKeyColumnSize = getColumnSize("PRIMARY", pksValueStringBuilders);
    List<Integer> sizesList = getSizesList(getColumnSizesList(rowAtStartPoint, rowAtEndPoint),
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
           // Column name
           + getCompleteColumnName(sizesList, columnsNameList,
                                                   "TYPE", "" + dataType, "PRIMARY", "")
           // Type
           + getCompleteType(sizesList, typesList,
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
   */
  private static int getColumnSize(String columnName, Object... objects) {
    int size = ("" + columnName).length();
    for (Object object : objects) {
      int valueSize = getText(object).length();
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
   */
  private static boolean isBigDecimalCloseToNumber(BigDecimal nb, Number expected, Number tolerance) {
    BigDecimal bigExpected = new BigDecimal("" + expected);
    BigDecimal bigTolerance = new BigDecimal("" + tolerance);
    BigDecimal bigMin = bigExpected.subtract(bigTolerance);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
  private static boolean isBigDecimalCloseToNumber(BigDecimal nb, Number expected, Number tolerance) {
    BigDecimal bigExpected = new BigDecimal("" + expected);
    BigDecimal bigTolerance = new BigDecimal("" + tolerance);
    BigDecimal bigMin = bigExpected.subtract(bigTolerance);
    BigDecimal bigMax = bigExpected.add(bigTolerance);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
    } else {
      try {
        bi = new BigInteger("" + object);
      } catch (NumberFormatException e) {
        throw new AssertJDBException("Expected <%s> can not be compared to a BigInteger (<%s>)", expected, object);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
    }

    BigInteger bigTolerance = new BigInteger("" + tolerance);
    BigInteger bigMin = expected.subtract(bigTolerance);
    BigInteger bigMax = expected.add(bigTolerance);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
      } else {
        try {
          bi = new BigInteger("" + object);
        } catch (NumberFormatException e) {
          throw new AssertJDBException("Expected <%s> can not be compared to a BigInteger (<%s>)", expected, object);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
      } else {
        try {
          bd = new BigDecimal("" + object);
        } catch (NumberFormatException e) {
          throw new AssertJDBException("Expected <%s> can not be compared to a BigDecimal (<%s>)", expected, object);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
        return Double.compare(d, expectedD);
      } else if (object instanceof BigInteger) {
        BigInteger bi = new BigInteger("" + expected);
        return ((BigInteger) object).compareTo(bi);
      } else if (object instanceof BigDecimal) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
        return ((BigInteger) object).compareTo(bi);
      } else if (object instanceof BigDecimal) {
        BigDecimal bd = new BigDecimal("" + expected);
        return ((BigDecimal) object).compareTo(bd);
      } else if (object instanceof Byte) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
   */
  private static boolean isBigIntegerCloseToNumber(BigInteger nb, Number expected, Number tolerance) {
    BigInteger bigExpected = new BigInteger("" + expected);
    BigInteger bigTolerance = new BigInteger("" + tolerance);
    BigInteger bigMin = bigExpected.subtract(bigTolerance);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
  private static boolean isBigIntegerCloseToNumber(BigInteger nb, Number expected, Number tolerance) {
    BigInteger bigExpected = new BigInteger("" + expected);
    BigInteger bigTolerance = new BigInteger("" + tolerance);
    BigInteger bigMin = bigExpected.subtract(bigTolerance);
    BigInteger bigMax = bigExpected.add(bigTolerance);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
      } else {
        try {
          bi = new BigInteger("" + object);
        } catch (NumberFormatException e) {
          throw new AssertJDBException("Expected <%s> can not be compared to a BigInteger (<%s>)", expected, object);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
      } else {
        try {
          bd = new BigDecimal("" + object);
        } catch (NumberFormatException e) {
          throw new AssertJDBException("Expected <%s> can not be compared to a BigDecimal (<%s>)", expected, object);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
        }
      } else if (object instanceof BigInteger) {
        BigInteger bi = new BigInteger("" + expected);
        if (((BigInteger) object).compareTo(bi) == 0) {
          return true;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
        }
      } else if (object instanceof BigDecimal) {
        BigDecimal bd = new BigDecimal("" + expected);
        if (((BigDecimal) object).compareTo(bd) == 0) {
          return true;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
    } else {
      try {
        bd = new BigDecimal("" + object);
      } catch (NumberFormatException e) {
        throw new AssertJDBException("Expected <%s> can not be compared to a BigDecimal (<%s>)", expected, object);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
    }

    BigDecimal bigTolerance = new BigDecimal("" + tolerance);
    BigDecimal bigMin = expected.subtract(bigTolerance);
    BigDecimal bigMax = expected.add(bigTolerance);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
        }
      } else if (number instanceof BigInteger) {
        BigInteger bi = new BigInteger("" + expected);
        if (((BigInteger) number).compareTo(bi) == 0) {
          return true;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
        }
      } else if (number instanceof BigDecimal) {
        BigDecimal bd = new BigDecimal("" + expected);
        if (((BigDecimal) number).compareTo(bd) == 0) {
          return true;
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `null` to `String[]` is redundant
in `src/main/java/org/assertj/db/type/Table.java`
#### Snippet
```java
   */
  public Table(Source source, String name) {
    this(source, name, (String[]) null, (String[]) null);
  }

```

### RedundantCast
Casting `null` to `String[]` is redundant
in `src/main/java/org/assertj/db/type/Table.java`
#### Snippet
```java
   */
  public Table(DataSource dataSource, String name) {
    this(dataSource, name, (String[]) null, (String[]) null);
  }

```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `pksValueStringBuilders`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
    int indexColumnSize = getIndexColumnSize(rows.length);
    StringBuilder[] pksValueStringBuilders = OutputType.getPksValueStringBuilder(rows);
    int primaryKeyColumnSize = getColumnSize("PRIMARY", pksValueStringBuilders);
    List<Integer> sizesList = getSizesList(rows.length == 0 ? getColumnSizesList(columnsNameList) : getColumnSizesList(rows),
                                           indexColumnSize,
```

### NullArgumentToVariableArgMethod
Confusing argument `pksValueStringBuilders`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
    List<String> typesList = OutputType.getTypesList(row);
    StringBuilder[] pksValueStringBuilders = OutputType.getPksValueStringBuilder(row);
    int primaryKeyColumnSize = getColumnSize("PRIMARY", pksValueStringBuilders);
    List<Integer> sizesList = getSizesList(getColumnSizesList(row),
                                           primaryKeyColumnSize);
```

### NullArgumentToVariableArgMethod
Confusing argument `pksValueStringBuilders`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
    int indexColumnSize = getIndexColumnSize(rows.length);
    StringBuilder[] pksValueStringBuilders = OutputType.getPksValueStringBuilder(rows);
    int primaryKeyColumnSize = getColumnSize("PRIMARY", pksValueStringBuilders);
    List<Integer> sizesList = getSizesList(rows.length == 0 ? getColumnSizesList(columnsNameList) : getColumnSizesList(rows),
                                           indexColumnSize,
```

### NullArgumentToVariableArgMethod
Confusing argument `pksValueStringBuilders`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
    int dataTypeColumnSize = getDataTypeColumnSize(changesArray);
    StringBuilder[] pksValueStringBuilders = OutputType.getPksValueStringBuilder(changesArray);
    int primaryKeyColumnSize = getColumnSize("PRIMARY", pksValueStringBuilders);

    StringBuilder stringBuilder = new StringBuilder();
```

### NullArgumentToVariableArgMethod
Confusing argument `pksValueStringBuilders`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
    int changeTypeColumnSize = getColumnSize("TYPE", changeType);
    int dataTypeColumnSize = getColumnSize("" + dataType, dataName);
    int primaryKeyColumnSize = getColumnSize("PRIMARY", pksValueStringBuilders);
    List<Integer> sizesList = getSizesList(getColumnSizesList(rowAtStartPoint, rowAtEndPoint),
                                           changeTypeColumnSize,
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `expected` is always 'null'
in `src/main/java/org/assertj/db/error/ShouldBeCompatible.java`
#### Snippet
```java
  public static ErrorMessageFactory shouldBeCompatible(Value actual, Object expected) {
    if (expected == null) {
      return new ShouldBeCompatible(actual, expected);
    }
    return new ShouldBeCompatible(actual, expected.getClass(), expected);
```

