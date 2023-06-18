# ignite-extensions 
 
# Bad smells
I found 17 bad smells with 17 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 17 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ignite-extensions-6966315882797088234562843446424850607/modules/ssh-ext/src/test/java/org/apache/ignite/internal/IgniteProjectionStartStopRestartSelfTest.java`
#### Snippet
```java
Paths.get(U.getIgniteHome()).relativize(U.resolveIgnitePath(script).toPath()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ignite-extensions-6966315882797088234562843446424850607/modules/ssh-ext/src/main/java/org/apache/ignite/internal/util/nodestart/StartNodeCallableImpl.java`
#### Snippet
```java
new SB().a("echo \"").a(igniteHome).a('\\').a(scriptPath).a("\" ").a(scriptArgs).a(!cfg.isEmpty() ? " \"" : "").a(cfg).a(!cfg.isEmpty() ? "\"" : "").a(rmtLogArgs).a(" ^> ").a(scriptOutputPath).a(" ^2^>^&^1").a(" > ").a(scriptFileName).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ignite-extensions-6966315882797088234562843446424850607/modules/ssh-ext/src/main/java/org/apache/ignite/internal/util/nodestart/StartNodeCallableImpl.java`
#### Snippet
```java
new SB().a("schtasks /create /f /sc onstart").a(" /ru ").a(spec.username()).a(" /rp ").a(spec.password()).a(" /tn ").a(id).a(" /np /tr \"").a(scriptFileName).a('\"').toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ignite-extensions-6966315882797088234562843446424850607/modules/ssh-ext/src/main/java/org/apache/ignite/internal/util/nodestart/StartNodeCallableImpl.java`
#### Snippet
```java
// Ensure diagnostics in the log even in case if start node breaks silently.
new SB().a("nohup echo \"Preparing to start remote node...\" > ").a(scriptOutputDir).a('/').a(scriptOutputFileName).a(" 2>& 1 &").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ignite-extensions-6966315882797088234562843446424850607/modules/ssh-ext/src/main/java/org/apache/ignite/internal/util/nodestart/StartNodeCallableImpl.java`
#### Snippet
```java
// Console output is consumed, started nodes must use Ignite file appenders for log.
new SB().a("nohup ").a("\"").a(igniteHome).a('/').a(scriptPath).a("\"").a(" ").a(scriptArgs).a(!cfg.isEmpty() ? " \"" : "").a(cfg).a(!cfg.isEmpty() ? "\"" : "").a(rmtLogArgs).a(" > ").a(scriptOutputDir).a('/').a(scriptOutputFileName).a(" 2>& 1 &").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ignite-extensions-6966315882797088234562843446424850607/modules/geospatial-ext/geospatial/src/test/java/org/apache/ignite/internal/processors/query/h2/H2IndexingAbstractGeoSelfTest.java`
#### Snippet
```java
cache.query(new SqlFieldsQuery("explain select _key from Geometry where _val && ?").setArgs(r.read("POLYGON((5 70, 5 80, 30 80, 30 70, 5 70))"))).getAll().get(0).get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ignite-extensions-6966315882797088234562843446424850607/modules/geospatial-ext/geospatial/src/test/java/org/apache/ignite/internal/processors/query/h2/H2IndexingAbstractGeoSelfTest.java`
#### Snippet
```java
cache.query(new SqlFieldsQuery("explain select * from EnemyCamp " + "where coords && 'POINT(25 75)'")).getAll().get(0).get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ignite-extensions-6966315882797088234562843446424850607/modules/performance-statistics-ext/src/main/java/org/apache/ignite/internal/performancestatistics/handlers/CacheOperationsHandler.java`
#### Snippet
```java
opType.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ignite-extensions-6966315882797088234562843446424850607/modules/performance-statistics-ext/src/main/java/org/apache/ignite/internal/performancestatistics/handlers/TransactionsHandler.java`
#### Snippet
```java
id.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ignite-extensions-6966315882797088234562843446424850607/modules/aws-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/s3/TcpDiscoveryS3IpFinder.java`
#### Snippet
```java
new SB().a(addrStr).a(DELIM).a(addr.getPort()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ignite-extensions-6966315882797088234562843446424850607/modules/camel-ext/src/test/java/org/apache/ignite/stream/camel/IgniteCamelStreamerTest.java`
#### Snippet
```java
out.getMessage().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ignite-extensions-6966315882797088234562843446424850607/modules/pub-sub-ext/src/test/java/org/apache/ignite/stream/pubsub/MockPubSubServer.java`
#### Snippet
```java
UUID.randomUUID().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ignite-extensions-6966315882797088234562843446424850607/modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateRegionFactory.java`
#### Snippet
```java
cfgValues.getOrDefault(DFLT_ACCESS_TYPE_PROPERTY, NONSTRICT_READ_WRITE.name()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ignite-extensions-6966315882797088234562843446424850607/modules/spring-cache-ext/src/test/java/org/apache/ignite/cache/spring/IgniteSpringCacheCompatibilityTest.java`
#### Snippet
```java
VER_2_11_0.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ignite-extensions-6966315882797088234562843446424850607/modules/spark-ext/spark/src/test/java/org/apache/ignite/spark/JavaStandaloneIgniteRDDSelfTest.java`
#### Snippet
```java
((Row[]) (df.collect()))[0].get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ignite-extensions-6966315882797088234562843446424850607/modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/IgniteRepositoryQuery.java`
#### Snippet
```java
IgniteQueryGenerator.addSorting(new StringBuilder(queryString), ((Sort) (values[values.length - 1]))).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ignite-extensions-6966315882797088234562843446424850607/modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/IgniteRepositoryQuery.java`
#### Snippet
```java
IgniteQueryGenerator.addPaging(new StringBuilder(queryString), ((Pageable) (values[values.length - 1]))).toString()
```

