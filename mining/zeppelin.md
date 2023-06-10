# zeppelin 
 
# Bad smells
I found 83 bad smells with 83 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 83 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/zeppelin-integration/src/test/java/org/apache/zeppelin/WebDriverManager.java`
#### Snippet
```java
FileUtils.getTempDirectory().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/bigquery/src/main/java/org/apache/zeppelin/bigquery/BigQueryInterpreter.java`
#### Snippet
```java
field.getV().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/elasticsearch/src/main/java/org/apache/zeppelin/elasticsearch/ElasticsearchInterpreter.java`
#### Snippet
```java
XContentHelper.toString(((InternalMetricsAggregation) (agg))).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/elasticsearch/src/main/java/org/apache/zeppelin/elasticsearch/ElasticsearchInterpreter.java`
#### Snippet
```java
XContentHelper.toString(((InternalSingleBucketAggregation) (agg))).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/elasticsearch/src/main/java/org/apache/zeppelin/elasticsearch/client/HttpBasedClient.java`
#### Snippet
```java
json.getObject().get(field).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/elasticsearch/src/main/java/org/apache/zeppelin/elasticsearch/client/HttpBasedClient.java`
#### Snippet
```java
hit.opt("_source").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/elasticsearch/src/main/java/org/apache/zeppelin/elasticsearch/client/HttpBasedClient.java`
#### Snippet
```java
result.getBody().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/elasticsearch/src/main/java/org/apache/zeppelin/elasticsearch/client/HttpBasedClient.java`
#### Snippet
```java
body.get("error").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/elasticsearch/src/main/java/org/apache/zeppelin/elasticsearch/client/TransportBasedClient.java`
#### Snippet
```java
XContentHelper.toString(((InternalMetricsAggregation) (agg))).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/elasticsearch/src/main/java/org/apache/zeppelin/elasticsearch/client/TransportBasedClient.java`
#### Snippet
```java
XContentHelper.toString(((InternalSingleBucketAggregation) (agg))).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.13-shims/src/main/java/org/apache/zeppelin/flink/Flink113SqlInterpreter.java`
#### Snippet
```java
jobClient.getJobExecutionResult().get().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.13-shims/src/main/java/org/apache/zeppelin/flink/Flink113SqlInterpreter.java`
#### Snippet
```java
Objects.requireNonNull(tableResult.collect().next().getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.13-shims/src/main/java/org/apache/zeppelin/flink/Flink113SqlInterpreter.java`
#### Snippet
```java
checkNotNull(r.getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.13-shims/src/main/java/org/apache/zeppelin/flink/Flink113SqlInterpreter.java`
#### Snippet
```java
tableResult.collect().next().getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.13-shims/src/main/java/org/apache/zeppelin/flink/Flink113SqlInterpreter.java`
#### Snippet
```java
checkNotNull(r.getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.13-shims/src/main/java/org/apache/zeppelin/flink/Flink113SqlInterpreter.java`
#### Snippet
```java
tableResult.collect().next().getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.13-shims/src/main/java/org/apache/zeppelin/flink/Flink113SqlInterpreter.java`
#### Snippet
```java
checkNotNull(r.getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.13-shims/src/main/java/org/apache/zeppelin/flink/Flink113SqlInterpreter.java`
#### Snippet
```java
checkNotNull(r.getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.13-shims/src/main/java/org/apache/zeppelin/flink/Flink113SqlInterpreter.java`
#### Snippet
```java
checkNotNull(r.getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.14-shims/src/main/java/org/apache/zeppelin/flink/Flink114SqlInterpreter.java`
#### Snippet
```java
jobClient.getJobExecutionResult().get().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.14-shims/src/main/java/org/apache/zeppelin/flink/Flink114SqlInterpreter.java`
#### Snippet
```java
Objects.requireNonNull(tableResult.collect().next().getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.14-shims/src/main/java/org/apache/zeppelin/flink/Flink114SqlInterpreter.java`
#### Snippet
```java
Objects.requireNonNull(tableResult.collect().next().getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.14-shims/src/main/java/org/apache/zeppelin/flink/Flink114SqlInterpreter.java`
#### Snippet
```java
checkNotNull(r.getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.14-shims/src/main/java/org/apache/zeppelin/flink/Flink114SqlInterpreter.java`
#### Snippet
```java
tableResult.collect().next().getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.14-shims/src/main/java/org/apache/zeppelin/flink/Flink114SqlInterpreter.java`
#### Snippet
```java
checkNotNull(r.getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.14-shims/src/main/java/org/apache/zeppelin/flink/Flink114SqlInterpreter.java`
#### Snippet
```java
tableResult.collect().next().getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.14-shims/src/main/java/org/apache/zeppelin/flink/Flink114SqlInterpreter.java`
#### Snippet
```java
checkNotNull(r.getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.14-shims/src/main/java/org/apache/zeppelin/flink/Flink114SqlInterpreter.java`
#### Snippet
```java
checkNotNull(r.getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.14-shims/src/main/java/org/apache/zeppelin/flink/Flink114SqlInterpreter.java`
#### Snippet
```java
checkNotNull(r.getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.15-shims/src/main/java/org/apache/zeppelin/flink/Flink115SqlInterpreter.java`
#### Snippet
```java
jobClient.getJobExecutionResult().get().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.15-shims/src/main/java/org/apache/zeppelin/flink/Flink115SqlInterpreter.java`
#### Snippet
```java
Objects.requireNonNull(tableResult.collect().next().getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.15-shims/src/main/java/org/apache/zeppelin/flink/Flink115SqlInterpreter.java`
#### Snippet
```java
Objects.requireNonNull(tableResult.collect().next().getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.15-shims/src/main/java/org/apache/zeppelin/flink/Flink115SqlInterpreter.java`
#### Snippet
```java
checkNotNull(r.getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.15-shims/src/main/java/org/apache/zeppelin/flink/Flink115SqlInterpreter.java`
#### Snippet
```java
tableResult.collect().next().getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.15-shims/src/main/java/org/apache/zeppelin/flink/Flink115SqlInterpreter.java`
#### Snippet
```java
checkNotNull(r.getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.15-shims/src/main/java/org/apache/zeppelin/flink/Flink115SqlInterpreter.java`
#### Snippet
```java
tableResult.collect().next().getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.15-shims/src/main/java/org/apache/zeppelin/flink/Flink115SqlInterpreter.java`
#### Snippet
```java
checkNotNull(r.getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.15-shims/src/main/java/org/apache/zeppelin/flink/Flink115SqlInterpreter.java`
#### Snippet
```java
checkNotNull(r.getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.15-shims/src/main/java/org/apache/zeppelin/flink/Flink115SqlInterpreter.java`
#### Snippet
```java
checkNotNull(r.getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.16-shims/src/main/java/org/apache/zeppelin/flink/Flink116SqlInterpreter.java`
#### Snippet
```java
jobClient.getJobExecutionResult().get().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.16-shims/src/main/java/org/apache/zeppelin/flink/Flink116SqlInterpreter.java`
#### Snippet
```java
Objects.requireNonNull(tableResult.collect().next().getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.16-shims/src/main/java/org/apache/zeppelin/flink/Flink116SqlInterpreter.java`
#### Snippet
```java
Objects.requireNonNull(tableResult.collect().next().getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.16-shims/src/main/java/org/apache/zeppelin/flink/Flink116SqlInterpreter.java`
#### Snippet
```java
checkNotNull(r.getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.16-shims/src/main/java/org/apache/zeppelin/flink/Flink116SqlInterpreter.java`
#### Snippet
```java
tableResult.collect().next().getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.16-shims/src/main/java/org/apache/zeppelin/flink/Flink116SqlInterpreter.java`
#### Snippet
```java
checkNotNull(r.getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.16-shims/src/main/java/org/apache/zeppelin/flink/Flink116SqlInterpreter.java`
#### Snippet
```java
tableResult.collect().next().getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.16-shims/src/main/java/org/apache/zeppelin/flink/Flink116SqlInterpreter.java`
#### Snippet
```java
checkNotNull(r.getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.16-shims/src/main/java/org/apache/zeppelin/flink/Flink116SqlInterpreter.java`
#### Snippet
```java
checkNotNull(r.getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/flink/flink1.16-shims/src/main/java/org/apache/zeppelin/flink/Flink116SqlInterpreter.java`
#### Snippet
```java
checkNotNull(r.getField(0)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/zeppelin-zengine/src/main/java/org/apache/zeppelin/helium/HeliumOnlineRegistry.java`
#### Snippet
```java
response.getStatusLine().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/influxdb/src/main/java/org/apache/zeppelin/influxdb/InfluxDBInterpreter.java`
#### Snippet
```java
joiner.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/influxdb/src/main/java/org/apache/zeppelin/influxdb/InfluxDBInterpreter.java`
#### Snippet
```java
value.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/influxdb/src/main/java/org/apache/zeppelin/influxdb/InfluxDBInterpreter.java`
#### Snippet
```java
rowsJoiner.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/influxdb/src/main/java/org/apache/zeppelin/influxdb/InfluxDBInterpreter.java`
#### Snippet
```java
result.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/influxdb/src/main/java/org/apache/zeppelin/influxdb/InfluxDBInterpreter.java`
#### Snippet
```java
LogLevel.NONE.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/influxdb/src/test/java/org/apache/zeppelin/influxdb/InfluxDBInterpeterTest.java`
#### Snippet
```java
mockServer.url("/").url().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/influxdb/src/test/java/org/apache/zeppelin/influxdb/InfluxDBInterpeterTest.java`
#### Snippet
```java
LogLevel.BODY.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/jdbc/src/main/java/org/apache/zeppelin/jdbc/JDBCInterpreter.java`
#### Snippet
```java
KERBEROS.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/jdbc/src/main/java/org/apache/zeppelin/jdbc/hive/YarnUtil.java`
#### Snippet
```java
appReport.getApplicationId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/jdbc/src/main/java/org/apache/zeppelin/jdbc/security/JDBCSecurityImpl.java`
#### Snippet
```java
KERBEROS.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/kotlin/src/main/java/org/apache/zeppelin/kotlin/reflect/KotlinVariableInfo.java`
#### Snippet
```java
descriptor.getReturnType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/markdown/src/main/java/org/apache/zeppelin/markdown/UMLNodeRenderer.java`
#### Snippet
```java
node.getFirstChild().getChars().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/markdown/src/main/java/org/apache/zeppelin/markdown/UMLNodeRenderer.java`
#### Snippet
```java
node.getFirstChild().getChars().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/neo4j/src/main/java/org/apache/zeppelin/graph/neo4j/utils/Neo4jConversionUtils.java`
#### Snippet
```java
val.asObject().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/submarine/src/main/java/org/apache/zeppelin/submarine/commons/SubmarineUtils.java`
#### Snippet
```java
hdfsFiles.get(i).toUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/zeppelin-integration/src/test/java/org/apache/zeppelin/integration/SparkParagraphIT.java`
#### Snippet
```java
paragraph2Result.getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/zeppelin-integration/src/test/java/org/apache/zeppelin/integration/SparkParagraphIT.java`
#### Snippet
```java
paragraph1Result.getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/zeppelin-integration/src/test/java/org/apache/zeppelin/integration/SparkParagraphIT.java`
#### Snippet
```java
paragraph2Result.getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/zeppelin-integration/src/test/java/org/apache/zeppelin/integration/SparkParagraphIT.java`
#### Snippet
```java
header.getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/zeppelin-integration/src/test/java/org/apache/zeppelin/integration/ZeppelinIT.java`
#### Snippet
```java
paragraph1Result.getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/zeppelin-interpreter-integration/src/test/java/org/apache/zeppelin/integration/SparkIntegrationTest.java`
#### Snippet
```java
response.getApplicationList().get(0).getApplicationId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/zeppelin-interpreter-integration/src/test/java/org/apache/zeppelin/integration/SparkIntegrationTest.java`
#### Snippet
```java
app.getApplicationId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/zeppelin-plugins/launcher/docker/src/main/java/org/apache/zeppelin/interpreter/launcher/DockerInterpreterProcess.java`
#### Snippet
```java
UTF_8.decode(logStream.next().content()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/zeppelin-plugins/notebookrepo/s3/src/test/java/org/apache/zeppelin/notebook/repo/S3NotebookRepoTest.java`
#### Snippet
```java
s3Proxy.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/zeppelin-plugins/notebookrepo/s3/src/test/java/org/apache/zeppelin/notebook/repo/S3NotebookRepoTest.java`
#### Snippet
```java
s3Proxy.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/scheduler/MetricCronJobListener.java`
#### Snippet
```java
context.getResult().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/zeppelin-server/src/main/java/org/apache/zeppelin/realm/kerberos/KerberosRealm.java`
#### Snippet
```java
principals.getPrimaryPrincipal().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/zeppelin-server/src/test/java/org/apache/zeppelin/rest/CredentialsRestApiTest.java`
#### Snippet
```java
response.getEntity().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/zeppelin-server/src/test/java/org/apache/zeppelin/server/CorsFilterTest.java`
#### Snippet
```java
invocationOnMock.getArguments()[1].toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/zeppelin-server/src/test/java/org/apache/zeppelin/server/CorsFilterTest.java`
#### Snippet
```java
invocationOnMock.getArguments()[1].toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/zeppelin-server/src/main/java/org/apache/zeppelin/socket/NotebookServer.java`
#### Snippet
```java
((ForbiddenException) (ex)).getResponse().getEntity().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/zeppelin-zengine/src/main/java/org/apache/zeppelin/search/LuceneSearch.java`
#### Snippet
```java
frags[0].toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-zeppelin676438842735286507017319299940921464060/zeppelin-zengine/src/main/java/org/apache/zeppelin/search/LuceneSearch.java`
#### Snippet
```java
frgTitle[0].toString()
```

