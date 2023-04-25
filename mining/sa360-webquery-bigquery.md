# sa360-webquery-bigquery 
 
# Bad smells
I found 20 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| AbstractClassNeverImplemented | 5 | false |
| UNUSED_IMPORT | 4 | false |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| RedundantFieldInitialization | 2 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| SystemOutErr | 1 | false |
| ReturnNull | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| StringEqualsEmptyString | 1 | false |
## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/dswebquerytobigquery/Html2CsvParseHandler.java`
#### Snippet
```java
  private ImmutableList.Builder<String> rowAccumulator;
  private boolean bodyElementStarted = false;
  private int bodyRowCounter = 0;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/dswebquerytobigquery/Html2CsvParseHandler.java`
#### Snippet
```java
  private StringBuilder textAccumulator;
  private ImmutableList.Builder<String> rowAccumulator;
  private boolean bodyElementStarted = false;
  private int bodyRowCounter = 0;

```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/dswebquerytobigquery/Html2CsvParseHandler.java`
#### Snippet
```java
      }
    } catch (IOException ioexecption) {
      System.err.println("error closing file" + ioexecption.getMessage());
    }
    super.fatalError(e);
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/dswebquerytobigquery/WebQuery.java`
#### Snippet
```java
      return matcher.group(1);
    }
    return null;
  }

```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `WqToBqDataTypeMapper` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/dswebquerytobigquery/WqToBqDataTypeMapper.java`
#### Snippet
```java

/** Mapper for WebQuery column type to BigQuery Column type. */
class WqToBqDataTypeMapper {

  static final String TIMESTAMP = "TIMESTAMP";
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigReader` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/dswebquerytobigquery/ConfigReader.java`
#### Snippet
```java

/** Service to read CSV Configurations for loading multiple WebQuery to BQ jobs. */
class ConfigReader {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/dswebquerytobigquery/Main.java`
#### Snippet
```java
import java.util.stream.Stream;

class Main {

  private static final GoogleLogger logger = GoogleLogger.forEnclosingClass();
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/dswebquerytobigquery/Html2CsvParseHandler.java`
#### Snippet
```java

    return headerValue
        .replaceAll("[^A-Za-z0-9_]", "_") // Replace all non-Alphanumeric chars
        .replaceAll("_{2,}", "_") // Replace multiple underscrores with one
        .toLowerCase();
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/dswebquerytobigquery/Html2CsvParseHandler.java`
#### Snippet
```java
    return headerValue
        .replaceAll("[^A-Za-z0-9_]", "_") // Replace all non-Alphanumeric chars
        .replaceAll("_{2,}", "_") // Replace multiple underscrores with one
        .toLowerCase();
  }
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/dswebquerytobigquery/Html2CsvParseHandler.java`
#### Snippet
```java
              .add(Constants.REPORT_PULL_TIMESTAMP_COLUMN_NAME) // add partition column
              .build()
              .toArray(new String[0]));
    }

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `src/main/java/dswebquerytobigquery/BigQueryProcessor.java`
#### Snippet
```java
import com.google.cloud.bigquery.TableId;
import com.google.cloud.storage.Blob;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneOffset;
```

### UNUSED_IMPORT
Unused import `import com.google.api.services.bigquery.BigqueryScopes;`
in `src/main/java/dswebquerytobigquery/Main.java`
#### Snippet
```java
import static dswebquerytobigquery.Constants.MAX_THREADS;

import com.google.api.services.bigquery.BigqueryScopes;
import com.google.api.services.storage.StorageScopes;
import com.google.auth.oauth2.GoogleCredentials;
```

### UNUSED_IMPORT
Unused import `import com.google.api.services.storage.StorageScopes;`
in `src/main/java/dswebquerytobigquery/Main.java`
#### Snippet
```java

import com.google.api.services.bigquery.BigqueryScopes;
import com.google.api.services.storage.StorageScopes;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.common.collect.ImmutableList;
```

### UNUSED_IMPORT
Unused import `import com.google.common.collect.ImmutableList;`
in `src/main/java/dswebquerytobigquery/Main.java`
#### Snippet
```java
import com.google.api.services.storage.StorageScopes;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.common.collect.ImmutableList;
import com.google.common.flogger.GoogleLogger;
import java.io.File;
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `ColumnHeader` has no concrete subclass
in `src/main/java/dswebquerytobigquery/ColumnHeader.java`
#### Snippet
```java
/** Model to store information on the WebQuery's columns. */
@AutoValue
public abstract class ColumnHeader {

  public abstract String name();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `src/main/java/dswebquerytobigquery/TransferConfig.java`
#### Snippet
```java

  @AutoValue.Builder
  public abstract static class Builder {

    public abstract Builder setBigQueryConfig(BigQueryConfig newBigQueryConfig);
```

### AbstractClassNeverImplemented
Abstract class `TransferConfig` has no concrete subclass
in `src/main/java/dswebquerytobigquery/TransferConfig.java`
#### Snippet
```java
/** Model to denote a configuration to load WebQuery into BigQuery. */
@AutoValue
public abstract class TransferConfig {

  static Builder builder() {
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `src/main/java/dswebquerytobigquery/BigQueryConfig.java`
#### Snippet
```java

  @AutoValue.Builder
  public abstract static class Builder {

    public abstract Builder setProjectId(String newProjectId);
```

### AbstractClassNeverImplemented
Abstract class `BigQueryConfig` has no concrete subclass
in `src/main/java/dswebquerytobigquery/BigQueryConfig.java`
#### Snippet
```java
/** Configuration for BigQuery Table information. */
@AutoValue
public abstract class BigQueryConfig {

  public static Builder builder() {
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/dswebquerytobigquery/Html2CsvParseHandler.java`
#### Snippet
```java

  private static String sanitizeForCsv(String cellData) {
    if (cellData == null || cellData.equals("") || cellData.equals("\"\"")) {
      return "";
    }
```

