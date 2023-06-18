# fhir-data-pipes 
 
# Bad smells
I found 24 bad smells with 24 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 24 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java
record.get(ID_KEY).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java
((GenericRecord) (record.get(META_KEY))).get(LAST_UPDATED_KEY).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java
tagCoding.get(SYSTEM_KEY).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java
tagCoding.get(CODE_KEY).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/batch/src/main/java/org/openmrs/analytics/ReadJsonFilesFn.java`
#### Snippet
```java
file.getMetadata().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/batch/src/main/java/org/openmrs/analytics/ReadJsonFilesFn.java`
#### Snippet
```java
file.getMetadata().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/batch/src/test/java/org/openmrs/analytics/ConvertResourceFnTest.java`
#### Snippet
```java
capturedResource.getResourceType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/batch/src/test/java/org/openmrs/analytics/ConvertResourceFnTest.java`
#### Snippet
```java
((Patient) (capturedResource)).getGender().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/batch/src/test/java/org/openmrs/analytics/ConvertResourceFnTest.java`
#### Snippet
```java
capturedResource.getResourceType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/common/src/test/java/org/openmrs/analytics/GcsDwhFilesTest.java`
#### Snippet
```java
instant.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/common/src/test/java/org/openmrs/analytics/ParquetUtilTest.java`
#### Snippet
```java
schema.getField("id").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/common/src/test/java/org/openmrs/analytics/ParquetUtilTest.java`
#### Snippet
```java
schema.getField("identifier").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/common/src/test/java/org/openmrs/analytics/ParquetUtilTest.java`
#### Snippet
```java
schema.getField("name").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/common/src/test/java/org/openmrs/analytics/ParquetUtilTest.java`
#### Snippet
```java
schema.getField("id").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/common/src/test/java/org/openmrs/analytics/ParquetUtilTest.java`
#### Snippet
```java
schema.getField("identifier").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/common/src/test/java/org/openmrs/analytics/ParquetUtilTest.java`
#### Snippet
```java
schema.getField("basedOn").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/common/src/test/java/org/openmrs/analytics/ParquetUtilTest.java`
#### Snippet
```java
schema.getField("subject").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/common/src/test/java/org/openmrs/analytics/ParquetUtilTest.java`
#### Snippet
```java
schema.getField("code").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/common/src/test/java/org/openmrs/analytics/ParquetUtilTest.java`
#### Snippet
```java
schema.getField("id").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/common/src/test/java/org/openmrs/analytics/ParquetUtilTest.java`
#### Snippet
```java
schema.getField("identifier").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/common/src/test/java/org/openmrs/analytics/ParquetUtilTest.java`
#### Snippet
```java
schema.getField("status").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/common/src/test/java/org/openmrs/analytics/ParquetUtilTest.java`
#### Snippet
```java
schema.getField("class").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/controller/src/main/java/org/openmrs/analytics/DwhFilesManager.java`
#### Snippet
```java
currentDirectory.resolve(".temp-beam", StandardResolveOptions.RESOLVE_DIRECTORY).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-data-pipes711789442568505935718383939474332034378/pipelines/streaming/src/main/java/org/openmrs/analytics/FhirConverter.java`
#### Snippet
```java
payload.get(config.getChildPrimaryKey()).toString()
```

