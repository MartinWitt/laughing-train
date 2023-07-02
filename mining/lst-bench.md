# lst-bench 
 
# Bad smells
I found 6 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessarySemicolon | 2 | false |
| EmptyStatementBody | 2 | false |
| NullableProblems | 2 | false |
## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/com/microsoft/lst_bench/telemetry/EventInfo.java`
#### Snippet
```java
    SUCCESS,
    FAILURE,
    UNKNOWN;
  }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/com/microsoft/lst_bench/telemetry/EventInfo.java`
#### Snippet
```java
    EXEC_TASK,
    EXEC_FILE,
    EXEC_STATEMENT;
  }

```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`while` statement has empty body
in `src/main/java/com/microsoft/lst_bench/client/JDBCConnection.java`
#### Snippet
```java
      if (hasResults) {
        ResultSet rs = s.getResultSet();
        while (rs.next()) {
          // do nothing
        }
```

### EmptyStatementBody
`for` statement has empty body
in `src/main/java/com/microsoft/lst_bench/client/SparkConnection.java`
#### Snippet
```java
  public void execute(String sqlText) {
    List<Row> results = session.sql(sqlText).collectAsList();
    for (Row row : results) {
      // do nothing
    }
```

## RuleId[id=NullableProblems]
### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `src/main/java/com/microsoft/lst_bench/client/JDBCConnectionManager.java`
#### Snippet
```java
  @Nullable private final String password;

  public JDBCConnectionManager(String url, String username, String password) {
    this.url = url;
    this.username = username;
```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `src/main/java/com/microsoft/lst_bench/client/JDBCConnectionManager.java`
#### Snippet
```java
  @Nullable private final String password;

  public JDBCConnectionManager(String url, String username, String password) {
    this.url = url;
    this.username = username;
```

