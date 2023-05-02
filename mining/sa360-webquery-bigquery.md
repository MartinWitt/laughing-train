# sa360-webquery-bigquery 
 
# Bad smells
I found 6 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNUSED_IMPORT | 4 | false |
| Deprecation | 2 | false |
## RuleId[id=Deprecation]
### Deprecation
'withFirstRecordAsHeader()' is deprecated
in `src/main/java/dswebquerytobigquery/ConfigReader.java`
#### Snippet
```java
   */
  public static TransferConfig[] loadConfig(File configFile) throws IOException {
    return CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(new FileReader(configFile))
        .getRecords()
        .stream()
```

### Deprecation
'withHeader(java.lang.String...)' is deprecated
in `src/main/java/dswebquerytobigquery/Html2CsvParseHandler.java`
#### Snippet
```java
          new CSVPrinter(
              new OutputStreamWriter(new FileOutputStream(outputFile), StandardCharsets.UTF_8),
              CSVFormat.DEFAULT.withHeader(headers));
    } catch (IOException ioexception) {
      throw new SAXException("error creating outputfile", ioexception);
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

