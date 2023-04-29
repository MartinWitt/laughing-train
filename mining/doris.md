# doris 
 
# Bad smells
I found 467 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| GroovyUnusedAssignment | 466 | false |
| GroovyUnnecessaryContinue | 1 | false |
## RuleId[id=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java

// **Note**: default db will be create if not exist
defaultDb = "regression_test"

// add useLocalSessionState so that the jdbc will not send
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
// at each time we connect.
// add allowLoadLocalInfile so that the jdbc can execute mysql load data from client.
jdbcUrl = "jdbc:mysql://127.0.0.1:9030/?useLocalSessionState=true&allowLoadLocalInfile=true"
jdbcUser = "root"
jdbcPassword = ""
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
// add allowLoadLocalInfile so that the jdbc can execute mysql load data from client.
jdbcUrl = "jdbc:mysql://127.0.0.1:9030/?useLocalSessionState=true&allowLoadLocalInfile=true"
jdbcUser = "root"
jdbcPassword = ""

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
jdbcUrl = "jdbc:mysql://127.0.0.1:9030/?useLocalSessionState=true&allowLoadLocalInfile=true"
jdbcUser = "root"
jdbcPassword = ""

feHttpAddress = "127.0.0.1:8030"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
jdbcPassword = ""

feHttpAddress = "127.0.0.1:8030"
feHttpUser = "root"
feHttpPassword = ""
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java

feHttpAddress = "127.0.0.1:8030"
feHttpUser = "root"
feHttpPassword = ""

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
feHttpAddress = "127.0.0.1:8030"
feHttpUser = "root"
feHttpPassword = ""

// set DORIS_HOME by system properties
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
// set DORIS_HOME by system properties
// e.g. java -DDORIS_HOME=./
suitePath = "${DORIS_HOME}/regression-test/suites"
dataPath = "${DORIS_HOME}/regression-test/data"
pluginPath = "${DORIS_HOME}/regression-test/plugins"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
// e.g. java -DDORIS_HOME=./
suitePath = "${DORIS_HOME}/regression-test/suites"
dataPath = "${DORIS_HOME}/regression-test/data"
pluginPath = "${DORIS_HOME}/regression-test/plugins"
realDataPath = "${DORIS_HOME}/regression-test/realdata"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
suitePath = "${DORIS_HOME}/regression-test/suites"
dataPath = "${DORIS_HOME}/regression-test/data"
pluginPath = "${DORIS_HOME}/regression-test/plugins"
realDataPath = "${DORIS_HOME}/regression-test/realdata"
sslCertificatePath = "${DORIS_HOME}/regression-test/ssl_default_certificate"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
dataPath = "${DORIS_HOME}/regression-test/data"
pluginPath = "${DORIS_HOME}/regression-test/plugins"
realDataPath = "${DORIS_HOME}/regression-test/realdata"
sslCertificatePath = "${DORIS_HOME}/regression-test/ssl_default_certificate"

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
pluginPath = "${DORIS_HOME}/regression-test/plugins"
realDataPath = "${DORIS_HOME}/regression-test/realdata"
sslCertificatePath = "${DORIS_HOME}/regression-test/ssl_default_certificate"

// will test <group>/<suite>.groovy
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
// will test <group>/<suite>.groovy
// empty group will test all group
testGroups = ""
// empty suite will test all suite
testSuites = ""
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
testGroups = ""
// empty suite will test all suite
testSuites = ""
// empty directories will test all directories
testDirectories = ""
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
testSuites = ""
// empty directories will test all directories
testDirectories = ""

// this groups will not be executed
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java

// this groups will not be executed
excludeGroups = ""
// this suites will not be executed
excludeSuites = "test_broker_load"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
excludeGroups = ""
// this suites will not be executed
excludeSuites = "test_broker_load"
// this directories will not be executed
excludeDirectories = "segcompaction_p2"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
excludeSuites = "test_broker_load"
// this directories will not be executed
excludeDirectories = "segcompaction_p2"

customConf1 = "test_custom_conf_value"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
excludeDirectories = "segcompaction_p2"

customConf1 = "test_custom_conf_value"

// for test csv with header
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java

// for test csv with header
enableHdfs=false // set to true if hdfs is ready
hdfsFs = "hdfs://127.0.0.1:9000"
hdfsUser = "doris-test"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
// for test csv with header
enableHdfs=false // set to true if hdfs is ready
hdfsFs = "hdfs://127.0.0.1:9000"
hdfsUser = "doris-test"
hdfsPasswd = ""
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
enableHdfs=false // set to true if hdfs is ready
hdfsFs = "hdfs://127.0.0.1:9000"
hdfsUser = "doris-test"
hdfsPasswd = ""
brokerName = "broker_name"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
hdfsFs = "hdfs://127.0.0.1:9000"
hdfsUser = "doris-test"
hdfsPasswd = ""
brokerName = "broker_name"

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
hdfsUser = "doris-test"
hdfsPasswd = ""
brokerName = "broker_name"

// broker load test config
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java

// broker load test config
enableBrokerLoad=true
ak=""
sk=""
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
// broker load test config
enableBrokerLoad=true
ak=""
sk=""

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
enableBrokerLoad=true
ak=""
sk=""

// jdbc connector test config
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
// To enable jdbc test, you need first start mysql/pg container.
// See `docker/thirdparties/start-thirdparties-docker.sh`
enableJdbcTest=false
mysql_57_port=3316
pg_14_port=5442
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
// See `docker/thirdparties/start-thirdparties-docker.sh`
enableJdbcTest=false
mysql_57_port=3316
pg_14_port=5442
oracle_11_port=1521
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
enableJdbcTest=false
mysql_57_port=3316
pg_14_port=5442
oracle_11_port=1521
sqlserver_2022_port=1433
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
mysql_57_port=3316
pg_14_port=5442
oracle_11_port=1521
sqlserver_2022_port=1433
clickhouse_22_port=8123
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
pg_14_port=5442
oracle_11_port=1521
sqlserver_2022_port=1433
clickhouse_22_port=8123

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
oracle_11_port=1521
sqlserver_2022_port=1433
clickhouse_22_port=8123

// hive catalog test config
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
// To enable jdbc test, you need first start hive container.
// See `docker/thirdparties/start-thirdparties-docker.sh`
enableHiveTest=false
hms_port=9183
hdfs_port=8120
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
// See `docker/thirdparties/start-thirdparties-docker.sh`
enableHiveTest=false
hms_port=9183
hdfs_port=8120

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
enableHiveTest=false
hms_port=9183
hdfs_port=8120

// elasticsearch catalog test config
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
// elasticsearch catalog test config
// See `docker/thirdparties/start-thirdparties-docker.sh`
enableEsTest=false
es_6_port=19200
es_7_port=29200
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
// See `docker/thirdparties/start-thirdparties-docker.sh`
enableEsTest=false
es_6_port=19200
es_7_port=29200
es_8_port=39200
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
enableEsTest=false
es_6_port=19200
es_7_port=29200
es_8_port=39200

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
es_6_port=19200
es_7_port=29200
es_8_port=39200


```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java

//hive  catalog test config for bigdata
enableExternalHiveTest = false
extHiveHmsHost = "***.**.**.**"
extHiveHmsPort = 7004
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
//hive  catalog test config for bigdata
enableExternalHiveTest = false
extHiveHmsHost = "***.**.**.**"
extHiveHmsPort = 7004
extHdfsPort = 4007
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
enableExternalHiveTest = false
extHiveHmsHost = "***.**.**.**"
extHiveHmsPort = 7004
extHdfsPort = 4007
extHiveHmsUser = "****"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
extHiveHmsHost = "***.**.**.**"
extHiveHmsPort = 7004
extHdfsPort = 4007
extHiveHmsUser = "****"
extHiveHmsPassword= "***********"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
extHiveHmsPort = 7004
extHdfsPort = 4007
extHiveHmsUser = "****"
extHiveHmsPassword= "***********"

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
extHdfsPort = 4007
extHiveHmsUser = "****"
extHiveHmsPassword= "***********"

//mysql jdbc connector test config for bigdata
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java

//mysql jdbc connector test config for bigdata
enableExternalMysqlTest = false
extMysqlHost = "***.**.**.**"
extMysqlPort = 3306
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
//mysql jdbc connector test config for bigdata
enableExternalMysqlTest = false
extMysqlHost = "***.**.**.**"
extMysqlPort = 3306
extMysqlUser = "****"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
enableExternalMysqlTest = false
extMysqlHost = "***.**.**.**"
extMysqlPort = 3306
extMysqlUser = "****"
extMysqlPassword = "***********"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
extMysqlHost = "***.**.**.**"
extMysqlPort = 3306
extMysqlUser = "****"
extMysqlPassword = "***********"

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
extMysqlPort = 3306
extMysqlUser = "****"
extMysqlPassword = "***********"

//postgresql jdbc connector test config for bigdata
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java

//postgresql jdbc connector test config for bigdata
enableExternalPgTest = false
extPgHost = "***.**.**.*"
extPgPort = 5432
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
//postgresql jdbc connector test config for bigdata
enableExternalPgTest = false
extPgHost = "***.**.**.*"
extPgPort = 5432
extPgUser = "****"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
enableExternalPgTest = false
extPgHost = "***.**.**.*"
extPgPort = 5432
extPgUser = "****"
extPgPassword = "***********"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
extPgHost = "***.**.**.*"
extPgPort = 5432
extPgUser = "****"
extPgPassword = "***********"

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
extPgPort = 5432
extPgUser = "****"
extPgPassword = "***********"

// elasticsearch external test config for bigdata
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java

// elasticsearch external test config for bigdata
enableExternalEsTest = false
extEsHost = "***********"
extEsPort = 9200
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
// elasticsearch external test config for bigdata
enableExternalEsTest = false
extEsHost = "***********"
extEsPort = 9200
extEsUser = "*******"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
enableExternalEsTest = false
extEsHost = "***********"
extEsPort = 9200
extEsUser = "*******"
extEsPassword = "***********"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
extEsHost = "***********"
extEsPort = 9200
extEsUser = "*******"
extEsPassword = "***********"

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
extEsPort = 9200
extEsUser = "*******"
extEsPassword = "***********"

s3Endpoint = "cos.ap-hongkong.myqcloud.com"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
extEsPassword = "***********"

s3Endpoint = "cos.ap-hongkong.myqcloud.com"
s3BucketName = "doris-build-hk-1308700295"
s3Region = "ap-hongkong"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java

s3Endpoint = "cos.ap-hongkong.myqcloud.com"
s3BucketName = "doris-build-hk-1308700295"
s3Region = "ap-hongkong"

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
s3Endpoint = "cos.ap-hongkong.myqcloud.com"
s3BucketName = "doris-build-hk-1308700295"
s3Region = "ap-hongkong"

// If the failure suite num exceeds this config
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
// all following suite will be skipped to fast quit the run.
// <=0 means no limit.
max_failure_num=0

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/load/insert/test_map_dml.groovy`
#### Snippet
```java
    }

    def create_test_table01 = {testTablez ->
        def result1 = sql """
            CREATE TABLE IF NOT EXISTS ${testTable01} (
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/load/insert/test_map_dml.groovy`
#### Snippet
```java
    // case1: string_int for map
    try {
        def res = sql "DROP TABLE IF EXISTS ${testTable}"
        create_test_table.call(testTable)
        sql "INSERT INTO ${testTable} VALUES (1, {' amory ': 6, 'happy': 38})"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/load/insert/test_map_dml.groovy`
#### Snippet
```java
    // case2: normal key val type for map
    try {
        def res = sql "DROP TABLE IF EXISTS ${testTable01}"

        create_test_table01.call(testTable)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/load/insert/test_array_insert.groovy`
#### Snippet
```java
    }
    
    def create_test_table01 = {testTabley ->
        
        def result1 = sql """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/load/insert/test_array_insert.groovy`
#### Snippet
```java
    }

    def create_test_table02 = {testTablez ->
        def result1 = sql """
            CREATE TABLE IF NOT EXISTS ${testTable02} (
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/mv_p0/ut/testProjectionMV3/testProjectionMV3.groovy`
#### Snippet
```java
    sql """insert into emps values("2020-01-02",2,"b",2,2,2);"""

    def result = "null"

    createMV("create materialized view emps_mv as select deptno, empid, name from emps order by deptno;")
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/mv_p0/ut/testProjectionMV4/testProjectionMV4.groovy`
#### Snippet
```java
    sql """insert into emps values("2020-01-02",2,"b",2,2,2);"""

    def result = "null"

    createMV("create materialized view emps_mv as select name, deptno, salary from emps;")
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/mv_p0/test_mv_useless/test_dup_mv_useless.groovy`
#### Snippet
```java
suite ("test_dup_mv_useless") {
    def testTable = "test_dup_mv_useless_table"
    def getJobState = { tableName ->
        def jobStateResult = sql """  SHOW ALTER TABLE MATERIALIZED VIEW WHERE TableName='${testTable}' ORDER BY CreateTime DESC LIMIT 1; """
        return jobStateResult[0][8]
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/mv_p0/test_mv_useless/test_dup_mv_useless.groovy`
#### Snippet
```java
    sql "insert into ${testTable} select 3,3,3;"

    def result = "null"
    test {
        sql "create materialized view k1 as select k1 from ${testTable};"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/mv_p0/test_mv_useless/test_agg_mv_useless.groovy`
#### Snippet
```java
suite ("test_agg_mv_useless") {
    def testTable = "test_agg_mv_useless_table"
    def getJobState = { tableName ->
        def jobStateResult = sql """  SHOW ALTER TABLE MATERIALIZED VIEW WHERE TableName='${testTable}' ORDER BY CreateTime DESC LIMIT 1; """
        return jobStateResult[0][8]
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/mv_p0/test_mv_useless/test_uniq_mv_useless.groovy`
#### Snippet
```java
suite ("test_uniq_mv_useless") {
    def testTable = "test_uniq_mv_useless_table"
    def getJobState = { tableName ->
        def jobStateResult = sql """  SHOW ALTER TABLE MATERIALIZED VIEW WHERE TableName='${testTable}' ORDER BY CreateTime DESC LIMIT 1; """
        return jobStateResult[0][8]
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/mv_p0/test_create_mv_complex_type/test_create_mv_complex_type.groovy`
#### Snippet
```java
    sql """insert into base_table select 1, 100000, 1.0, '{"jsonk1": 123}', [100, 200], {"k1": 10}, {1, 2};"""

    def success = false

    // 1. special column - mv dup key
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/demo_p0/thread_action.groovy`
#### Snippet
```java

suite("thread_action") {
    def (_, elapsedMillis) = timer {
        /**
         * the default max thread num is 10, you can specify by 'actionParallel' param.
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/demo_p0/thread_action.groovy`
#### Snippet
```java

suite("thread_action") {
    def (_, elapsedMillis) = timer {
        /**
         * the default max thread num is 10, you can specify by 'actionParallel' param.
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/export/test_array_export.groovy`
#### Snippet
```java
    }
    
    def export_to_hdfs = {exportTable, exportLable, hdfsPath, exportFormat, BrokerName, HdfsUserName, HdfsPasswd->
        sql """ EXPORT TABLE ${exportTable} 
                TO "${hdfsPath}" 
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/export/test_array_export.groovy`
#### Snippet
```java
    }

    def select_out_file = {exportTable, HdfsPath, outFormat, BrokerName, HdfsUserName, HdfsPasswd->
        sql """
            SELECT * FROM ${exportTable}
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/export/test_array_export.groovy`
#### Snippet
```java
    }
    
    def check_export_result = {checklabel->
        max_try_milli_secs = 15000
        while(max_try_milli_secs) {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/export/test_array_export.groovy`
#### Snippet
```java
    }

    def check_download_result={resultlist, expectedTotalRows->
        int totalLines = 0
        for(String oneFile :resultlist) {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/export/test_array_export.groovy`
#### Snippet
```java
        File[] files = path.listFiles()
        assert files.length == 1
        List<String> outLines = Files.readAllLines(Paths.get(files[0].getAbsolutePath()), StandardCharsets.UTF_8);
        List<String> baseLines = Files.readAllLines(Paths.get("""${context.config.dataPath}/export/test_array_export.out"""), StandardCharsets.UTF_8)
        for (int j = 0; j < outLines.size(); j ++) {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/export/test_array_export.groovy`
#### Snippet
```java
        assert files.length == 1
        List<String> outLines = Files.readAllLines(Paths.get(files[0].getAbsolutePath()), StandardCharsets.UTF_8);
        List<String> baseLines = Files.readAllLines(Paths.get("""${context.config.dataPath}/export/test_array_export.out"""), StandardCharsets.UTF_8)
        for (int j = 0; j < outLines.size(); j ++) {
            String[] outLine = outLines.get(j).split("\t")
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/load_p0/stream_load/load_json_column_exclude_schema_without_jsonpath.groovy`
#### Snippet
```java
    
    def create_test_table = {
        def result1 = sql """
            CREATE TABLE IF NOT EXISTS ${testTable} (
              k1 TINYINT NULL,
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/load_p0/stream_load/load_json_null_to_nullable.groovy`
#### Snippet
```java

    def create_test_table = {
        def result1 = sql """
            CREATE TABLE IF NOT EXISTS ${testTable} (
              `k1` CHAR NULL COMMENT "",
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/load_p0/broker_load/test_array_load.groovy`
#### Snippet
```java
    }

    def create_test_table01 = {testTablex ->
        def result1 = sql """
            CREATE TABLE IF NOT EXISTS ${testTable01} (
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/load_p0/broker_load/test_array_load.groovy`
#### Snippet
```java
    }

    def load_from_hdfs1 = {testTablex, label, hdfsFilePath, format, brokerName, hdfsUser, hdfsPasswd ->
        def result1= sql """
                        LOAD LABEL ${label} (
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/load_p0/broker_load/test_array_load.groovy`
#### Snippet
```java
        hdfsPasswd = getHdfsPasswd()
        def hdfs_json_file_path = uploadToHdfs "broker_load/simple_object_array.json"
        def hdfs_csv_file_path = uploadToHdfs "broker_load/simple_array.csv"
        def hdfs_orc_file_path = uploadToHdfs "broker_load/simple_array.orc"
        // orc file with native array(list) type
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/load_p0/broker_load/test_array_load.groovy`
#### Snippet
```java
        def hdfs_json_file_path = uploadToHdfs "broker_load/simple_object_array.json"
        def hdfs_csv_file_path = uploadToHdfs "broker_load/simple_array.csv"
        def hdfs_orc_file_path = uploadToHdfs "broker_load/simple_array.orc"
        // orc file with native array(list) type
        def hdfs_orc_file_path2 = uploadToHdfs "broker_load/simple_array_list_type.orc"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/load_p0/broker_load/test_array_load.groovy`
#### Snippet
```java
        def hdfs_orc_file_path = uploadToHdfs "broker_load/simple_array.orc"
        // orc file with native array(list) type
        def hdfs_orc_file_path2 = uploadToHdfs "broker_load/simple_array_list_type.orc"
        def hdfs_parquet_file_path = uploadToHdfs "broker_load/simple_array.parquet"
 
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/load_p0/broker_load/test_array_load.groovy`
#### Snippet
```java
        // orc file with native array(list) type
        def hdfs_orc_file_path2 = uploadToHdfs "broker_load/simple_array_list_type.orc"
        def hdfs_parquet_file_path = uploadToHdfs "broker_load/simple_array.parquet"
 
        // case5: import array data by hdfs and enable vectorized engine
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/load_p0/stream_load/load_json_with_jsonpath.groovy`
#### Snippet
```java

    def create_test_table = {
        def result1 = sql """
            CREATE TABLE IF NOT EXISTS ${testTable} (
              `k1` INT NULL COMMENT "",
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/load_p0/stream_load/test_json_load.groovy`
#### Snippet
```java
    }

    def create_test_table2 = {testTablex ->
        // multi-line sql
        def result1 = sql """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/load_p0/stream_load/test_json_load.groovy`
#### Snippet
```java

    // city is NOT NULL
    def create_test_table3 = {testTablex ->
        // multi-line sql
        def result1 = sql """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/load_p0/stream_load/test_json_load.groovy`
#### Snippet
```java
    }

    def test_invalid_json_array_table = { testTablex ->
        // multi-line sql
        def result1 = sql """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/load_p0/stream_load/test_json_load.groovy`
#### Snippet
```java
    }
    
    def load_from_hdfs2 = {testTablex, label, hdfsFilePath, format, brokerName, hdfsUser, hdfsPasswd ->
        def result1= sql """
                        LOAD LABEL ${label} (
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/jsonb_p0/test_jsonb_load_and_function.groovy`
#### Snippet
```java
            String command = sb.toString()
            def process = command.execute()
            def code = process.waitFor()
            def err = IOGroovyMethods.getText(new BufferedReader(new InputStreamReader(process.getErrorStream())))
            def out = process.getText()
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/jsonb_p0/test_jsonb_load_and_function.groovy`
#### Snippet
```java
            def process = command.execute()
            def code = process.waitFor()
            def err = IOGroovyMethods.getText(new BufferedReader(new InputStreamReader(process.getErrorStream())))
            def out = process.getText()
            log.info("error result: " + out)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/jsonb_p0/test_jsonb_load_and_function.groovy`
#### Snippet
```java
            String command = sb.toString()
            def process = command.execute()
            def code = process.waitFor()
            def err = IOGroovyMethods.getText(new BufferedReader(new InputStreamReader(process.getErrorStream())))
            def out = process.getText()
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/jsonb_p0/test_jsonb_load_and_function.groovy`
#### Snippet
```java
            def process = command.execute()
            def code = process.waitFor()
            def err = IOGroovyMethods.getText(new BufferedReader(new InputStreamReader(process.getErrorStream())))
            def out = process.getText()
            log.info("error result: " + out)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/query_p0/sql_functions/cast_function/test_non_nullable_function.groovy`
#### Snippet
```java
    qt_nullable "SELECT k1, non_nullable(k3) FROM ${tableName} ORDER BY k1"
    try {
        def result = "SELECT k1, non_nullable(k4) FROM ${tableName} ORDER BY k1"
    } catch (Exception e) {
        assertTrue(e.getMessage().contains("Try to use originally non-nullable column"))
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/query_p0/union/test_union.groovy`
#### Snippet
```java
    qt_union34 """select "2016-07-01" union (select "2016-07-02") order by 1"""
    qt_union35 """select cast("2016-07-01" as date) union (select cast("2016-07-02 1:10:0" as date)) order by 1"""
    def res1 = sql"""select cast(1 as decimal), cast(2 as double) union distinct select 1.0, 2.0 
             union distinct (select 1.00000000, 2.00000) order by 1, 2"""
    def res2 = sql"""select cast(1 as decimal), cast(2 as decimal) union distinct select 1.0, 2.0 
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/query_p0/union/test_union.groovy`
#### Snippet
```java
    def res1 = sql"""select cast(1 as decimal), cast(2 as double) union distinct select 1.0, 2.0 
             union distinct (select 1.00000000, 2.00000) order by 1, 2"""
    def res2 = sql"""select cast(1 as decimal), cast(2 as decimal) union distinct select 1.0, 2.0 
             union distinct (select 1.00000000, 2.00000) order by 1, 2"""

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/query_p2/system/test_query_sys_tables.groovy`
#### Snippet
```java
suite("test_query_sys_tables_p2", "p2") {
    // test a large amount of data
    def dbPrefix = "db_query_sys_tables_with_lots_of_tables_"
    def tablePrefix = "tb_query_sys_tables_with_lots_of_tables_"

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/query_p2/system/test_query_sys_tables.groovy`
#### Snippet
```java
    // test a large amount of data
    def dbPrefix = "db_query_sys_tables_with_lots_of_tables_"
    def tablePrefix = "tb_query_sys_tables_with_lots_of_tables_"

    // create lots of dbs and tables to make rows in `information_schema.columns`
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/export_p0/test_outfile_expr.groovy`
#### Snippet
```java
        File[] files = path.listFiles()
        assert files.length == 1
        List<String> outLines = Files.readAllLines(Paths.get(files[0].getAbsolutePath()), StandardCharsets.UTF_8);
        List<String> baseLines = Files.readAllLines(Paths.get("""${context.config.dataPath}/export_p0/test_outfile_expr.out"""), StandardCharsets.UTF_8)
        for (int j = 0; j < outLines.size(); j ++) {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/export_p0/test_outfile_expr.groovy`
#### Snippet
```java
        assert files.length == 1
        List<String> outLines = Files.readAllLines(Paths.get(files[0].getAbsolutePath()), StandardCharsets.UTF_8);
        List<String> baseLines = Files.readAllLines(Paths.get("""${context.config.dataPath}/export_p0/test_outfile_expr.out"""), StandardCharsets.UTF_8)
        for (int j = 0; j < outLines.size(); j ++) {
            String[] outLine = outLines.get(j).split("\t")
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/export_p0/test_outfile.groovy`
#### Snippet
```java
        File[] files = path.listFiles()
        assert files.length == 1
        List<String> outLines = Files.readAllLines(Paths.get(files[0].getAbsolutePath()), StandardCharsets.UTF_8);
        List<String> baseLines = Files.readAllLines(Paths.get("""${context.config.dataPath}/export_p0/test_outfile.out"""), StandardCharsets.UTF_8)
        for (int j = 0; j < outLines.size(); j ++) {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/export_p0/test_outfile.groovy`
#### Snippet
```java
        assert files.length == 1
        List<String> outLines = Files.readAllLines(Paths.get(files[0].getAbsolutePath()), StandardCharsets.UTF_8);
        List<String> baseLines = Files.readAllLines(Paths.get("""${context.config.dataPath}/export_p0/test_outfile.out"""), StandardCharsets.UTF_8)
        for (int j = 0; j < outLines.size(); j ++) {
            String[] outLine = outLines.get(j).split("\t")
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/rollup_p0/test_materialized_view_struct.groovy`
#### Snippet
```java
    def create_test_table = {testTable ->

        def result1 = sql """
            CREATE TABLE IF NOT EXISTS ${tableName} (
              `k1` int(11) NULL,
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/account_p0/test_nereids_authentication.groovy`
#### Snippet
```java
    }
    assertEquals(result.size(), 0)
    connect(user=user, password='Doris_123456', url=url) {
        sql "SELECT * FROM ${tableName1}, ${tableName2} WHERE ${tableName1}.`key` = ${tableName2}.`key`"
    }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/account_p0/test_nereids_authentication.groovy`
#### Snippet
```java
    }
    assertEquals(result.size(), 0)
    connect(user=user, password='Doris_123456', url=url) {
        sql "SELECT * FROM ${tableName1}, ${tableName2} WHERE ${tableName1}.`key` = ${tableName2}.`key`"
    }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/account_p0/test_information_schema.groovy`
#### Snippet
```java
// under the License.
suite("test_information_schema") {
    def dbPrefix = "db_test_schema_"
    def tablePrefix = "tb_test_schema_"

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/account_p0/test_information_schema.groovy`
#### Snippet
```java
suite("test_information_schema") {
    def dbPrefix = "db_test_schema_"
    def tablePrefix = "tb_test_schema_"

    // create lots of dbs and tables to make rows in `information_schema.columns` more than 1024
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/account_p0/test_alter_user.groovy`
#### Snippet
```java
    sql """set password for 'test_auth_user2' = password('12345')"""
    
    def result1 = connect(user = 'test_auth_user2', password = '12345', url = context.config.jdbcUrl) {
        sql 'select 1'
    }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/account_p0/test_alter_user.groovy`
#### Snippet
```java
        exception "Cannot use these credentials for 'default_cluster:test_auth_user2'@'%' because they contradict the password history policy"
    }
    result1 = connect(user = 'test_auth_user2', password = 'abc123456', url = context.config.jdbcUrl) {
        sql 'select 1'
    }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/account_p0/test_alter_user.groovy`
#### Snippet
```java
         
    // login success in multi times
    result1 = connect(user = 'test_auth_user3', password = '12345', url = context.config.jdbcUrl) {
        sql 'select 1'
    }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/account_p0/test_alter_user.groovy`
#### Snippet
```java
        sql 'select 1'
    }
    result1 = connect(user = 'test_auth_user3', password = '12345', url = context.config.jdbcUrl) {
        sql 'select 1'
    }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/account_p0/test_alter_user.groovy`
#### Snippet
```java
        sql 'select 1'
    }
    result1 = connect(user = 'test_auth_user3', password = '12345', url = context.config.jdbcUrl) {
        sql 'select 1'
    }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/account_p0/test_alter_user.groovy`
#### Snippet
```java
    // unlock user and login again
    sql """alter user test_auth_user3 account_unlock"""
    result1 = connect(user = 'test_auth_user3', password = '12345', url = context.config.jdbcUrl) {
        sql 'select 1'
    }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/account_p0/test_alter_user.groovy`
#### Snippet
```java
    // sleep 5 second to unlock account
    sleep(5000)
    result1 = connect(user = 'test_auth_user3', password = '12345', url = context.config.jdbcUrl) {
        sql 'select 1'
    }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/account_p0/test_alter_user.groovy`
#### Snippet
```java

    sql """set password for 'test_auth_user3' = password('Ab1234567^')"""
    result1 = connect(user = 'test_auth_user3', password = 'Ab1234567^', url = context.config.jdbcUrl) {
        sql 'select 1'
    }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/account_p0/test_alter_user.groovy`
#### Snippet
```java
    sql """create user test_auth_user4 identified by '12345' PASSWORD_EXPIRE INTERVAL 5 SECOND"""
    sql """grant all on *.* to test_auth_user4"""
    result1 = connect(user = 'test_auth_user4', password = '12345', url = context.config.jdbcUrl) {
        sql 'select 1'
    }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/account_p0/test_alter_user.groovy`
#### Snippet
```java
    sql """create user test_auth_user4 identified by '12345'"""
    sql """grant all on *.* to test_auth_user4"""
    result1 = connect(user = 'test_auth_user4', password = '12345', url = context.config.jdbcUrl) {
        sql 'select 1'
    }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_vertical_compaction_agg_keys.groovy`
#### Snippet
```java
        }
    }
    def reset_be_config = { ->
        String[][] backends = sql """ show backends; """
        assertTrue(backends.size() > 0)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_vertical_compaction_agg_keys.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
            boolean running = true
            do {
                Thread.sleep(1000)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_vertical_compaction_agg_keys.groovy`
#### Snippet
```java
        int rowCount = 0
        for (String[] tablet in tablets) {
            String tablet_id = tablet[0]
            StringBuilder sb = new StringBuilder();
            def compactionStatusUrlIndex = 17
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compaction_agg_keys.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
            boolean running = true
            do {
                Thread.sleep(1000)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compaction_agg_keys.groovy`
#### Snippet
```java
        int rowCount = 0
        for (String[] tablet in tablets) {
            String tablet_id = tablet[0]
            StringBuilder sb = new StringBuilder();
            def compactionStatusUrlIndex = 17
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compacation_with_delete.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
            boolean running = true
            do {
                Thread.sleep(1000)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compacation_with_delete.groovy`
#### Snippet
```java
        int rowCount = 0
        for (String[] tablet in tablets) {
            String tablet_id = tablet[0]
            StringBuilder sb = new StringBuilder();
            def compactionStatusUrlIndex = 17
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compaction_dup_keys_with_delete.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
            boolean running = true
            do {
                Thread.sleep(1000)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compaction_dup_keys_with_delete.groovy`
#### Snippet
```java
        int rowCount = 0
        for (String[] tablet in tablets) {
            String tablet_id = tablet[0]
            StringBuilder sb = new StringBuilder();
            def compactionStatusUrlIndex = 17
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compaction_uniq_keys_row_store.groovy`
#### Snippet
```java
            // set server side prepared statment url
            def url="jdbc:mysql://" + sql_ip + ":" + sql_port + "/" + realDb + "?&useServerPrepStmts=true"
            def result1 = connect(user=user, password=password, url=url) {
                def stmt = prepareStatement """ SELECT * FROM ${tableName} t where user_id = ? and date = ? and datev2 = ? and datetimev2_1 = ? and datetimev2_2 = ? and city = ? and age = ? and sex = ?; """
                setPrepareStmtArgs stmt, 1, '2017-10-01', '2017-10-01', '2017-10-01 11:11:11.21', '2017-10-01 11:11:11.11', 'Beijing', 10, 1
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compaction_uniq_keys_row_store.groovy`
#### Snippet
```java
            // set server side prepared statment url
            def url="jdbc:mysql://" + sql_ip + ":" + sql_port + "/" + realDb + "?&useServerPrepStmts=true"
            def result1 = connect(user=user, password=password, url=url) {
                def stmt = prepareStatement """ SELECT * FROM ${tableName} t where user_id = ? and date = ? and datev2 = ? and datetimev2_1 = ? and datetimev2_2 = ? and city = ? and age = ? and sex = ?; """
                setPrepareStmtArgs stmt, 1, '2017-10-01', '2017-10-01', '2017-10-01 11:11:11.21', '2017-10-01 11:11:11.11', 'Beijing', 10, 1
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compaction_uniq_keys_row_store.groovy`
#### Snippet
```java
            // set server side prepared statment url
            def url="jdbc:mysql://" + sql_ip + ":" + sql_port + "/" + realDb + "?&useServerPrepStmts=true"
            def result1 = connect(user=user, password=password, url=url) {
                def stmt = prepareStatement """ SELECT * FROM ${tableName} t where user_id = ? and date = ? and datev2 = ? and datetimev2_1 = ? and datetimev2_2 = ? and city = ? and age = ? and sex = ?; """
                setPrepareStmtArgs stmt, 1, '2017-10-01', '2017-10-01', '2017-10-01 11:11:11.21', '2017-10-01 11:11:11.11', 'Beijing', 10, 1
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compaction_uniq_keys_row_store.groovy`
#### Snippet
```java
            // set server side prepared statment url
            def url="jdbc:mysql://" + sql_ip + ":" + sql_port + "/" + realDb + "?&useServerPrepStmts=true"
            def result1 = connect(user=user, password=password, url=url) {
                def stmt = prepareStatement """ SELECT * FROM ${tableName} t where user_id = ? and date = ? and datev2 = ? and datetimev2_1 = ? and datetimev2_2 = ? and city = ? and age = ? and sex = ?; """
                setPrepareStmtArgs stmt, 1, '2017-10-01', '2017-10-01', '2017-10-01 11:11:11.21', '2017-10-01 11:11:11.11', 'Beijing', 10, 1
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compaction_uniq_keys_row_store.groovy`
#### Snippet
```java
        }

        def user = context.config.jdbcUser
        def password = context.config.jdbcPassword
        def tablets = null
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compaction_uniq_keys_row_store.groovy`
#### Snippet
```java

        def user = context.config.jdbcUser
        def password = context.config.jdbcPassword
        def tablets = null
        sql """ DROP TABLE IF EXISTS ${tableName} """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compaction_uniq_keys_row_store.groovy`
#### Snippet
```java
        def user = context.config.jdbcUser
        def password = context.config.jdbcPassword
        def tablets = null
        sql """ DROP TABLE IF EXISTS ${tableName} """
        sql """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compaction_uniq_keys_row_store.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
            boolean running = true
            do {
                Thread.sleep(1000)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compaction_uniq_keys_row_store.groovy`
#### Snippet
```java
        int rowCount = 0
        for (String[] tablet in tablets) {
            String tablet_id = tablet[0]
            StringBuilder sb = new StringBuilder();
            def compactionStatusUrlIndex = 17
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compaction_uniq_keys_with_delete.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
            boolean running = true
            do {
                Thread.sleep(1000)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compaction_uniq_keys_with_delete.groovy`
#### Snippet
```java
        int rowCount = 0
        for (String[] tablet in tablets) {
            String tablet_id = tablet[0]
            StringBuilder sb = new StringBuilder();
            def compactionStatusUrlIndex = 17
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compaction_uniq_keys.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
            boolean running = true
            do {
                Thread.sleep(1000)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compaction_uniq_keys.groovy`
#### Snippet
```java
        int rowCount = 0
        for (String[] tablet in tablets) {
            String tablet_id = tablet[0]
            StringBuilder sb = new StringBuilder();
            def compactionStatusUrlIndex = 17
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compaction_dup_keys.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
            boolean running = true
            do {
                Thread.sleep(1000)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compaction_dup_keys.groovy`
#### Snippet
```java
        int rowCount = 0
        for (String[] tablet in tablets) {
            String tablet_id = tablet[0]
            StringBuilder sb = new StringBuilder();
            def compactionStatusUrlIndex = 17
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compaction_agg_keys_with_delete.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
            boolean running = true
            do {
                Thread.sleep(1000)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_compaction_agg_keys_with_delete.groovy`
#### Snippet
```java
        int rowCount = 0
        for (String[] tablet in tablets) {
            String tablet_id = tablet[0]
            StringBuilder sb = new StringBuilder();
            def compactionStatusUrlIndex = 17
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_vertical_compaction_dup_keys.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
            boolean running = true
            do {
                Thread.sleep(1000)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_vertical_compaction_dup_keys.groovy`
#### Snippet
```java
        int rowCount = 0
        for (String[] tablet in tablets) {
            String tablet_id = tablet[0]
            StringBuilder sb = new StringBuilder();
            def compactionStatusUrlIndex = 17
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/nereids_p0/join/test_bitmap_filter.groovy`
#### Snippet
```java
    sql "SET enable_nereids_planner=true"
    sql "SET enable_fallback_to_original_planner=false"
    def tbl1 = "test_query_db.bigtable"
    def tbl2 = "bitmap_table"
    def tbl3 = "test_query_db.baseall"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/nereids_p0/join/test_bitmap_filter.groovy`
#### Snippet
```java
    def tbl1 = "test_query_db.bigtable"
    def tbl2 = "bitmap_table"
    def tbl3 = "test_query_db.baseall"

    sql "set runtime_filter_type = 16"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_vertical_compaction_uniq_keys.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
            boolean running = true
            do {
                Thread.sleep(1000)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/compaction/test_vertical_compaction_uniq_keys.groovy`
#### Snippet
```java
        int rowCount = 0
        for (String[] tablet in tablets) {
            String tablet_id = tablet[0]
            StringBuilder sb = new StringBuilder();
            def compactionStatusUrlIndex = 17
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/nereids_p0/aggregate/aggregate_group_by_metric_type.groovy`
#### Snippet
```java
    sql "SET enable_nereids_planner=true"
    sql "SET enable_fallback_to_original_planner=false"
    def error_msg = "column must use with specific function, and don't support filter or group by"
    sql "DROP TABLE IF EXISTS test_group_by_hll_and_bitmap"

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/nereids_p0/union/test_union.groovy`
#### Snippet
```java
    qt_union34 """select "2016-07-01" union (select "2016-07-02") order by 1"""
    qt_union35 """select cast("2016-07-01" as date) union (select cast("2016-07-02 1:10:0" as date)) order by 1"""
    def res1 = sql"""select cast(1 as decimal), cast(2 as double) union distinct select 1.0, 2.0 
             union distinct (select 1.00000000, 2.00000) order by 1, 2"""
    def res2 = sql"""select cast(1 as decimal), cast(2 as decimal) union distinct select 1.0, 2.0 
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/nereids_p0/union/test_union.groovy`
#### Snippet
```java
    def res1 = sql"""select cast(1 as decimal), cast(2 as double) union distinct select 1.0, 2.0 
             union distinct (select 1.00000000, 2.00000) order by 1, 2"""
    def res2 = sql"""select cast(1 as decimal), cast(2 as decimal) union distinct select 1.0, 2.0 
             union distinct (select 1.00000000, 2.00000) order by 1, 2"""

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/nereids_p0/sql_functions/window_functions/test_window_function.groovy`
#### Snippet
```java
    // test_query_first_value
    String k1 = fields[3]
    String k2 = fields[5]
    String k3 = fields[3]
    // Nereids does't support window function
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/nereids_p0/sql_functions/window_functions/test_window_function.groovy`
#### Snippet
```java
    String k1 = fields[3]
    String k2 = fields[5]
    String k3 = fields[3]
    // Nereids does't support window function
    // qt_first_value1"""select /*+SET_VAR(parallel_fragment_exec_instance_num=1) */ ${k1}, first_value(${k2}) over (partition by ${k1} order by ${k3}, ${k2})
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/nereids_p0/join/test_join.groovy`
#### Snippet
```java
    // def res97 = sql"""select * from (select k1, k2, sum(k2) over (partition by k1) as ss from ${null_table_2})a
    //    left join ${null_table_1} b on  a.k2=b.k2 and a.k1 >b.k1 order by a.k1, b.k1"""
    def res98 = sql"""select * from (select k1, k2, k5 from ${null_table_2}) a left join ${null_table_1} b
      on  a.k2=b.k2 and a.k1 >b.k1 order by a.k1, b.k1"""
    // Nereids does't support window function
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/connector_p0/spark_connector/spark_connector.groovy`
#### Snippet
```java
    sql new File("""${context.file.parent}/ddl/create.sql""").text
    logger.info("start delete local spark doris demo jar...")
    def delete_local_spark_jar = "rm -rf spark-doris-demo.jar".execute()
    logger.info("start download spark doris demo ...")
    logger.info("getS3Url ==== ${getS3Url()}")
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/connector_p0/spark_connector/spark_connector.groovy`
#### Snippet
```java
    logger.info("start download spark doris demo ...")
    logger.info("getS3Url ==== ${getS3Url()}")
    def download_spark_jar = "/usr/bin/curl ${getS3Url()}/regression/spark-doris-connector-demo-jar-with-dependencies.jar --output spark-doris-demo.jar".execute().getText()
    logger.info("finish download spark doris demo ...")
    def run_cmd = "java -jar spark-doris-demo.jar $context.config.feHttpAddress $context.config.feHttpUser regression_test_connector_p0_spark_connector.$tableName"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/ssb_sf0.1_p1/load.groovy`
#### Snippet
```java
        sql new File("""${context.file.parent}/ddl/${table}_delete.sql""").text
        sql "set insert_timeout=3600"
        def r = sql "select @@insert_timeout"
        year_cons = [
            'lo_orderdate<19930101',
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/data_model_p0/unique/test_unique_table_debug_data.groovy`
#### Snippet
```java
    String[][] backends = sql """ show backends; """
    assertTrue(backends.size() > 0)
    StringBuilder sbCommand = new StringBuilder();

    sql "insert into ${tbName} values(1,1),(2,1);"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/csv_header_p0/test_csv_with_header.groovy`
#### Snippet
```java

    sql "DROP TABLE IF EXISTS ${testTable}"
    def result1 = sql """
            CREATE TABLE IF NOT EXISTS `${testTable}` (
                `event_day` date NULL COMMENT "",
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/correctness_p0/table_valued_function/test_hdfs_tvf.groovy`
#### Snippet
```java
    // It's okay to use random `hdfsUser`, but can not be empty.
    def hdfsUserName = "doris"
    def format = "csv"
    def defaultFS = "hdfs://127.0.0.1:${hdfs_port}"
    def uri = ""
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/correctness_p0/table_valued_function/test_hdfs_tvf.groovy`
#### Snippet
```java
    def format = "csv"
    def defaultFS = "hdfs://127.0.0.1:${hdfs_port}"
    def uri = ""

    String enabled = context.config.otherConfigs.get("enableHiveTest")
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/correctness_p0/table_valued_function/test_hdfs_tvf.groovy`
#### Snippet
```java

            uri = "${defaultFS}" + "/user/doris/preinstalled_data/csv_format_test/array_malformat.csv"
            format = "csv"
            qt_csv_array_malformat """ select * from HDFS(
                                        "uri" = "${uri}",
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/correctness_p0/table_valued_function/test_hdfs_tvf.groovy`
#### Snippet
```java

            uri = "${defaultFS}" + "/user/doris/preinstalled_data/csv_format_test/array_normal.csv"
            format = "csv"
            qt_csv_array_normal """ select * from HDFS("uri" = "${uri}",
                                    "fs.defaultFS"= "${defaultFS}",
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/point_query_p0/test_point_query.groovy`
#### Snippet
```java
    }
    // def url = context.config.jdbcUrl
    def result1 = connect(user=user, password=password, url=url) {
      def stmt = prepareStatement "select * from ${tableName} where k1 = ? and k2 = ? and k3 = ?"
      assertEquals(stmt.class, com.mysql.cj.jdbc.ServerPreparedStatement);
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/point_query_p0/test_point_query.groovy`
#### Snippet
```java
    // disable useServerPrepStmts
    url = context.config.jdbcUrl
    def result2 = connect(user=user, password=password, url=url) {
        qt_sql """select * from ${tableName} where k1 = 1231 and k2 = 119291.11 and k3 = 'ddd'"""
        qt_sql """select * from ${tableName} where k1 = 1237 and k2 = 120939.11130 and k3 = 'a    ddd'"""
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/test_dytable_alter_type.groovy`
#### Snippet
```java

        //check data in table and check table schema
        def select_res_now = "true"
        for(i = 0; i < 5; i++){
            select_res_now = sql "select * from ${table_name} order by name"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/load.groovy`
#### Snippet
```java
    }

    def real_alter_res = "true"
    def res = "null"
    def wait_for_alter_finish = "null"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/load.groovy`
#### Snippet
```java

    def real_alter_res = "true"
    def res = "null"
    def wait_for_alter_finish = "null"
    def check_time = 30
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/load.groovy`
#### Snippet
```java
    def real_alter_res = "true"
    def res = "null"
    def wait_for_alter_finish = "null"
    def check_time = 30
    def json_load = {src_json, table_name ->
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/load.groovy`
#### Snippet
```java
    def res = "null"
    def wait_for_alter_finish = "null"
    def check_time = 30
    def json_load = {src_json, table_name ->
        //create table
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_rename_column.groovy`
#### Snippet
```java

    //add rollup
    def resRoll = "null"
    def rollupName = "rollup_cost"
    sql "ALTER TABLE ${tableName} ADD ROLLUP ${rollupName}(`user_id`, `cost`);"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_rename_column.groovy`
#### Snippet
```java

    //add materialized view
    def resMv = "null"
    def mvName = "mv1"
    sql "create materialized view ${mvName} as select user_id, sum(cost) from ${tableName} group by user_id;"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/test_dytable_complex_data.groovy`
#### Snippet
```java

    def real_res = "true"
    def res = "null"
    def wait_for_alter_finish = "null"
    def check_time = 30
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/test_dytable_complex_data.groovy`
#### Snippet
```java
    def real_res = "true"
    def res = "null"
    def wait_for_alter_finish = "null"
    def check_time = 30
    def colume_set = ""
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/test_dytable_complex_data.groovy`
#### Snippet
```java
    def res = "null"
    def wait_for_alter_finish = "null"
    def check_time = 30
    def colume_set = ""
    def key = ""
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/test_dytable_complex_data.groovy`
#### Snippet
```java
    def colume_set = ""
    def key = ""
    def test_create_and_load_dynamic_table = { table_name, data_model, replica_num, columes, columes_type, src_json, expect_success ->
        //create table
        sql "DROP TABLE IF EXISTS ${table_name}"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/test_dytable_complex_data.groovy`
#### Snippet
```java

        //check data in table and check table schema
        def select_res_now = "true"
        for(i = 0; i < 5; i++){
            //select_res_now = sql "select * from ${table_name} order by `${columes[0]}`"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/test_dytable_complex_data.groovy`
#### Snippet
```java

    def index_res = ""
    def create_index = { table_name, colume_name, index_name, index_type, expect_success ->
        // create index
        try{
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/test_dytable_complex_data.groovy`
#### Snippet
```java
    }

    def drop_index = { table_name, colume_name, index_name, expect_success ->
        // create index
        try{
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/test_dytable_complex_data.groovy`
#### Snippet
```java

    //start test
    String[] data_models = ["DUPLICATE"]
    int[] replica_num = [1]
    def expect_success = "true"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/test_dytable_complex_data.groovy`
#### Snippet
```java
    //start test
    String[] data_models = ["DUPLICATE"]
    int[] replica_num = [1]
    def expect_success = "true"
    def feishu_fix_columes = ["id", "content.post.zh_cn.title", "msg_type"]
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/test_dytable_complex_data.groovy`
#### Snippet
```java
    String[] data_models = ["DUPLICATE"]
    int[] replica_num = [1]
    def expect_success = "true"
    def feishu_fix_columes = ["id", "content.post.zh_cn.title", "msg_type"]
    def feishu_fix_columes_type = ["BIGINT", "VARCHAR(100)", "CHAR(50)"]
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/test_dytable_complex_data.groovy`
#### Snippet
```java
    int[] replica_num = [1]
    def expect_success = "true"
    def feishu_fix_columes = ["id", "content.post.zh_cn.title", "msg_type"]
    def feishu_fix_columes_type = ["BIGINT", "VARCHAR(100)", "CHAR(50)"]
    def github_fix_columes = ["repo.id"]
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/test_dytable_complex_data.groovy`
#### Snippet
```java
    def expect_success = "true"
    def feishu_fix_columes = ["id", "content.post.zh_cn.title", "msg_type"]
    def feishu_fix_columes_type = ["BIGINT", "VARCHAR(100)", "CHAR(50)"]
    def github_fix_columes = ["repo.id"]
    def github_fix_columes_type = ["BIGINT"]
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/test_dytable_complex_data.groovy`
#### Snippet
```java
    def feishu_fix_columes = ["id", "content.post.zh_cn.title", "msg_type"]
    def feishu_fix_columes_type = ["BIGINT", "VARCHAR(100)", "CHAR(50)"]
    def github_fix_columes = ["repo.id"]
    def github_fix_columes_type = ["BIGINT"]
    def table_name = ["feishu", "github"]
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/test_dytable_complex_data.groovy`
#### Snippet
```java
    def feishu_fix_columes_type = ["BIGINT", "VARCHAR(100)", "CHAR(50)"]
    def github_fix_columes = ["repo.id"]
    def github_fix_columes_type = ["BIGINT"]
    def table_name = ["feishu", "github"]
    ArrayList<String> table_names = new ArrayList<>()
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/test_dytable_complex_data.groovy`
#### Snippet
```java
    def github_fix_columes = ["repo.id"]
    def github_fix_columes_type = ["BIGINT"]
    def table_name = ["feishu", "github"]
    ArrayList<String> table_names = new ArrayList<>()
    //step1: create table
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/test_dytable_complex_data.groovy`
#### Snippet
```java
    def github_fix_columes_type = ["BIGINT"]
    def table_name = ["feishu", "github"]
    ArrayList<String> table_names = new ArrayList<>()
    //step1: create table
    for (def j=0; j < data_models.size(); j++){
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/test_dytable_complex_data.groovy`
#### Snippet
```java
    ArrayList<String> table_names = new ArrayList<>()
    //step1: create table
    for (def j=0; j < data_models.size(); j++){
        if( data_models[j] == "AGGREGATE" ){
            expect_success = "false"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/test_dytable_complex_data.groovy`
#### Snippet
```java
    for (def j=0; j < data_models.size(); j++){
        if( data_models[j] == "AGGREGATE" ){
            expect_success = "false"
        }

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/dynamic_table_p0/test_dytable_complex_data.groovy`
#### Snippet
```java


    def test_round = 3
    for(def tb=0; tb < table_names.size(); tb++){
        for(def round = 0; round < test_round; round++){
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_dup_vals_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_dup_vals_schema_change.groovy`
#### Snippet
```java
            assert ele instanceof List<String>
            if (((List<String>) ele)[0] == "disable_auto_compaction") {
                disableAutoCompaction = Boolean.parseBoolean(((List<String>) ele)[2])
            }
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_dup_vals_schema_change.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
                boolean running = true
                do {
                    Thread.sleep(100)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_agg_vals_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_agg_vals_schema_change.groovy`
#### Snippet
```java
            assert ele instanceof List<String>
            if (((List<String>) ele)[0] == "disable_auto_compaction") {
                disableAutoCompaction = Boolean.parseBoolean(((List<String>) ele)[2])
            }
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_agg_vals_schema_change.groovy`
#### Snippet
```java
    // wait for all compactions done
    for (String[] tablet in tablets) {
            boolean running = true
            do {
                Thread.sleep(100)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_uniq_vals_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_uniq_vals_schema_change.groovy`
#### Snippet
```java
            assert ele instanceof List<String>
            if (((List<String>) ele)[0] == "disable_auto_compaction") {
                disableAutoCompaction = Boolean.parseBoolean(((List<String>) ele)[2])
            }
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_uniq_vals_schema_change.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
                boolean running = true
                do {
                    Thread.sleep(100)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_agg_keys_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_agg_keys_schema_change.groovy`
#### Snippet
```java
            assert ele instanceof List<String>
            if (((List<String>) ele)[0] == "disable_auto_compaction") {
                disableAutoCompaction = Boolean.parseBoolean(((List<String>) ele)[2])
            }
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_agg_keys_schema_change.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
                boolean running = true
                do {
                    Thread.sleep(100)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_uniq_rollup_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_uniq_rollup_schema_change.groovy`
#### Snippet
```java
            assert ele instanceof List<String>
            if (((List<String>) ele)[0] == "disable_auto_compaction") {
                disableAutoCompaction = Boolean.parseBoolean(((List<String>) ele)[2])
            }
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_uniq_rollup_schema_change.groovy`
#### Snippet
```java
    // wait for all compactions done
    for (String[] tablet in tablets) {
            boolean running = true
            do {
                Thread.sleep(100)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_dup_keys_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_dup_keys_schema_change.groovy`
#### Snippet
```java
            assert ele instanceof List<String>
            if (((List<String>) ele)[0] == "disable_auto_compaction") {
                disableAutoCompaction = Boolean.parseBoolean(((List<String>) ele)[2])
            }
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_dup_keys_schema_change.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
                boolean running = true
                do {
                    Thread.sleep(100)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_varchar_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_varchar_schema_change.groovy`
#### Snippet
```java
            assert ele instanceof List<String>
            if (((List<String>) ele)[0] == "disable_auto_compaction") {
                disableAutoCompaction = Boolean.parseBoolean(((List<String>) ele)[2])
            }
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_varchar_schema_change.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
                boolean running = true
                do {
                    Thread.sleep(100)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_agg_rollup_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_agg_rollup_schema_change.groovy`
#### Snippet
```java
            assert ele instanceof List<String>
            if (((List<String>) ele)[0] == "disable_auto_compaction") {
                disableAutoCompaction = Boolean.parseBoolean(((List<String>) ele)[2])
            }
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_agg_rollup_schema_change.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
                boolean running = true
                do {
                    Thread.sleep(100)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_dup_mv_schema_change.groovy`
#### Snippet
```java
suite ("test_dup_mv_schema_change") {
    def tableName = "schema_change_dup_mv_regression_test"
    def getJobState = { tbName ->
         def jobStateResult = sql """  SHOW ALTER TABLE COLUMN WHERE IndexName='${tbName}' ORDER BY createtime DESC LIMIT 1 """
         return jobStateResult[0][9]
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_dup_mv_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_dup_mv_schema_change.groovy`
#### Snippet
```java
            assert ele instanceof List<String>
            if (((List<String>) ele)[0] == "disable_auto_compaction") {
                disableAutoCompaction = Boolean.parseBoolean(((List<String>) ele)[2])
            }
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_dup_mv_schema_change.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
                boolean running = true
                do {
                    Thread.sleep(100)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_uniq_mv_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_uniq_mv_schema_change.groovy`
#### Snippet
```java
            assert ele instanceof List<String>
            if (((List<String>) ele)[0] == "disable_auto_compaction") {
                disableAutoCompaction = Boolean.parseBoolean(((List<String>) ele)[2])
            }
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_uniq_mv_schema_change.groovy`
#### Snippet
```java
    // wait for all compactions done
    for (String[] tablet in tablets) {
            boolean running = true
            do {
                Thread.sleep(100)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_uniq_keys_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_uniq_keys_schema_change.groovy`
#### Snippet
```java
            assert ele instanceof List<String>
            if (((List<String>) ele)[0] == "disable_auto_compaction") {
                disableAutoCompaction = Boolean.parseBoolean(((List<String>) ele)[2])
            }
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_uniq_keys_schema_change.groovy`
#### Snippet
```java
    // wait for all compactions done
    for (String[] tablet in tablets) {
            boolean running = true
            do {
                Thread.sleep(100)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/decimalv3/test_agg_keys_schema_change_decimalv3.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
            boolean running = true
            do {
                Thread.sleep(100)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_agg_mv_schema_change.groovy`
#### Snippet
```java

suite ("test_agg_mv_schema_change") {
    def getJobState = { tbName ->
         def jobStateResult = sql """  SHOW ALTER TABLE COLUMN WHERE IndexName='${tbName}' ORDER BY createtime DESC LIMIT 1 """
         return jobStateResult[0][9]
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_agg_mv_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_agg_mv_schema_change.groovy`
#### Snippet
```java
            assert ele instanceof List<String>
            if (((List<String>) ele)[0] == "disable_auto_compaction") {
                disableAutoCompaction = Boolean.parseBoolean(((List<String>) ele)[2])
            }
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_agg_mv_schema_change.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
                boolean running = true
                do {
                    Thread.sleep(100)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_dup_rollup_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_dup_rollup_schema_change.groovy`
#### Snippet
```java
            assert ele instanceof List<String>
            if (((List<String>) ele)[0] == "disable_auto_compaction") {
                disableAutoCompaction = Boolean.parseBoolean(((List<String>) ele)[2])
            }
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/test_dup_rollup_schema_change.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
                boolean running = true
                do {
                    Thread.sleep(100)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/datev2/test_dup_keys_schema_change_datev2.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
            boolean running = true
            do {
                Thread.sleep(100)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys.groovy`
#### Snippet
```java
            assert ele instanceof List<String>
            if (((List<String>) ele)[0] == "disable_auto_compaction") {
                disableAutoCompaction = Boolean.parseBoolean(((List<String>) ele)[2])
            }
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys.groovy`
#### Snippet
```java

        def uuid = UUID.randomUUID().toString().replace("-", "0")
        def path = "oss://$bucket/regression/segcompaction_test/segcompaction_test.orc"

        def columns = "col_0, col_1, col_2, col_3, col_4, col_5, col_6, col_7, col_8, col_9, col_10, col_11, col_12, col_13, col_14, col_15, col_16, col_17, col_18, col_19, col_20, col_21, col_22, col_23, col_24, col_25, col_26, col_27, col_28, col_29, col_30, col_31, col_32, col_33, col_34, col_35, col_36, col_37, col_38, col_39, col_40, col_41, col_42, col_43, col_44, col_45, col_46, col_47, col_48, col_49"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys.groovy`
#### Snippet
```java
        qt_select_default """ SELECT * FROM ${tableName} WHERE col_0=47; """

        String[][] tablets = sql """ show tablets from ${tableName}; """

    } finally {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys_index.groovy`
#### Snippet
```java
suite("test_segcompaction_unique_keys_index") {
    def tableName = "segcompaction_unique_keys_index_regression_test"
    String ak = getS3AK()
    String sk = getS3SK()
    String endpoint = getS3Endpoint()
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys_index.groovy`
#### Snippet
```java
    def tableName = "segcompaction_unique_keys_index_regression_test"
    String ak = getS3AK()
    String sk = getS3SK()
    String endpoint = getS3Endpoint()
    String region = getS3Region()
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys_index.groovy`
#### Snippet
```java
    String ak = getS3AK()
    String sk = getS3SK()
    String endpoint = getS3Endpoint()
    String region = getS3Region()
    String bucket = getS3BucketName()
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys_index.groovy`
#### Snippet
```java
    String sk = getS3SK()
    String endpoint = getS3Endpoint()
    String region = getS3Region()
    String bucket = getS3BucketName()

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys_index.groovy`
#### Snippet
```java
    String endpoint = getS3Endpoint()
    String region = getS3Region()
    String bucket = getS3BucketName()


```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys_index.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys_index.groovy`
#### Snippet
```java
            assert ele instanceof List<String>
            if (((List<String>) ele)[0] == "disable_auto_compaction") {
                disableAutoCompaction = Boolean.parseBoolean(((List<String>) ele)[2])
            }
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_dup_keys.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_dup_keys.groovy`
#### Snippet
```java
            assert ele instanceof List<String>
            if (((List<String>) ele)[0] == "disable_auto_compaction") {
                disableAutoCompaction = Boolean.parseBoolean(((List<String>) ele)[2])
            }
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_dup_keys.groovy`
#### Snippet
```java

        def uuid = UUID.randomUUID().toString().replace("-", "0")
        def path = "oss://$bucket/regression/segcompaction_test/segcompaction_test.orc"

        def columns = "col_0, col_1, col_2, col_3, col_4, col_5, col_6, col_7, col_8, col_9, col_10, col_11, col_12, col_13, col_14, col_15, col_16, col_17, col_18, col_19, col_20, col_21, col_22, col_23, col_24, col_25, col_26, col_27, col_28, col_29, col_30, col_31, col_32, col_33, col_34, col_35, col_36, col_37, col_38, col_39, col_40, col_41, col_42, col_43, col_44, col_45, col_46, col_47, col_48, col_49"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_dup_keys.groovy`
#### Snippet
```java
        qt_select_default """ SELECT * FROM ${tableName} WHERE col_0=47 order by col_1, col_2; """

        String[][] tablets = sql """ show tablets from ${tableName}; """

    } finally {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/schema_change_p0/datev2/test_agg_keys_schema_change_datev2.groovy`
#### Snippet
```java
        // wait for all compactions done
        for (String[] tablet in tablets) {
            boolean running = true
            do {
                Thread.sleep(100)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys_mow_index.groovy`
#### Snippet
```java
suite("test_segcompaction_unique_keys_mow_index") {
    def tableName = "segcompaction_unique_keys_mow_index_regression_test"
    String ak = getS3AK()
    String sk = getS3SK()
    String endpoint = getS3Endpoint()
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys_mow_index.groovy`
#### Snippet
```java
    def tableName = "segcompaction_unique_keys_mow_index_regression_test"
    String ak = getS3AK()
    String sk = getS3SK()
    String endpoint = getS3Endpoint()
    String region = getS3Region()
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys_mow_index.groovy`
#### Snippet
```java
    String ak = getS3AK()
    String sk = getS3SK()
    String endpoint = getS3Endpoint()
    String region = getS3Region()
    String bucket = getS3BucketName()
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys_mow_index.groovy`
#### Snippet
```java
    String sk = getS3SK()
    String endpoint = getS3Endpoint()
    String region = getS3Region()
    String bucket = getS3BucketName()

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys_mow_index.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys_mow_index.groovy`
#### Snippet
```java
            assert ele instanceof List<String>
            if (((List<String>) ele)[0] == "disable_auto_compaction") {
                disableAutoCompaction = Boolean.parseBoolean(((List<String>) ele)[2])
            }
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys_mow_index.groovy`
#### Snippet
```java
        """

        def uuid = UUID.randomUUID().toString().replace("-", "0")
        def path = "oss://$bucket/regression/segcompaction_test/segcompaction_test.orc"

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys_mow_index.groovy`
#### Snippet
```java

        def uuid = UUID.randomUUID().toString().replace("-", "0")
        def path = "oss://$bucket/regression/segcompaction_test/segcompaction_test.orc"

        def columns = "col_0, col_1, col_2, col_3, col_4, col_5, col_6, col_7, col_8, col_9, col_10, col_11, col_12, col_13, col_14, col_15, col_16, col_17, col_18, col_19, col_20, col_21, col_22, col_23, col_24, col_25, col_26, col_27, col_28, col_29, col_30, col_31, col_32, col_33, col_34, col_35, col_36, col_37, col_38, col_39, col_40, col_41, col_42, col_43, col_44, col_45, col_46, col_47, col_48, col_49"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys_mow_index.groovy`
#### Snippet
```java

        def columns = "col_0, col_1, col_2, col_3, col_4, col_5, col_6, col_7, col_8, col_9, col_10, col_11, col_12, col_13, col_14, col_15, col_16, col_17, col_18, col_19, col_20, col_21, col_22, col_23, col_24, col_25, col_26, col_27, col_28, col_29, col_30, col_31, col_32, col_33, col_34, col_35, col_36, col_37, col_38, col_39, col_40, col_41, col_42, col_43, col_44, col_45, col_46, col_47, col_48, col_49"
        String columns_str = ("$columns" != "") ? "($columns)" : "";

        // segcompaction dose not support mow now.
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys_mow_index.groovy`
#### Snippet
```java
        qt_select_default """ SELECT COUNT(*) FROM ${tableName} WHERE col_2 MATCH_ANY 'Lemon'; """

        String[][] tablets = sql """ show tablets from ${tableName}; """

    } finally {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_agg_keys.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_agg_keys.groovy`
#### Snippet
```java
            assert ele instanceof List<String>
            if (((List<String>) ele)[0] == "disable_auto_compaction") {
                disableAutoCompaction = Boolean.parseBoolean(((List<String>) ele)[2])
            }
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_agg_keys.groovy`
#### Snippet
```java

        def uuid = UUID.randomUUID().toString().replace("-", "0")
        def path = "oss://$bucket/regression/segcompaction_test/segcompaction_test.orc"

        def columns = "col_0, col_1, col_2, col_3, col_4, col_5, col_6, col_7, col_8, col_9, col_10, col_11, col_12, col_13, col_14, col_15, col_16, col_17, col_18, col_19, col_20, col_21, col_22, col_23, col_24, col_25, col_26, col_27, col_28, col_29, col_30, col_31, col_32, col_33, col_34, col_35, col_36, col_37, col_38, col_39, col_40, col_41, col_42, col_43, col_44, col_45, col_46, col_47, col_48, col_49"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_agg_keys.groovy`
#### Snippet
```java
        qt_select_default """ SELECT * FROM ${tableName} WHERE col_0=47; """

        String[][] tablets = sql """ show tablets from ${tableName}; """

    } finally {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys_mow.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys_mow.groovy`
#### Snippet
```java
            assert ele instanceof List<String>
            if (((List<String>) ele)[0] == "disable_auto_compaction") {
                disableAutoCompaction = Boolean.parseBoolean(((List<String>) ele)[2])
            }
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys_mow.groovy`
#### Snippet
```java

        def uuid = UUID.randomUUID().toString().replace("-", "0")
        def path = "oss://$bucket/regression/segcompaction_test/segcompaction_test.orc"

        def columns = "col_0, col_1, col_2, col_3, col_4, col_5, col_6, col_7, col_8, col_9, col_10, col_11, col_12, col_13, col_14, col_15, col_16, col_17, col_18, col_19, col_20, col_21, col_22, col_23, col_24, col_25, col_26, col_27, col_28, col_29, col_30, col_31, col_32, col_33, col_34, col_35, col_36, col_37, col_38, col_39, col_40, col_41, col_42, col_43, col_44, col_45, col_46, col_47, col_48, col_49"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_unique_keys_mow.groovy`
#### Snippet
```java
        qt_select_default """ SELECT * FROM ${tableName} WHERE col_0=47; """

        String[][] tablets = sql """ show tablets from ${tableName}; """

    } finally {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/inverted_index_p0/test_index_bkd_null.groovy`
#### Snippet
```java


    def timeout = 60000
    def delta_time = 1000
    def alter_res = "null"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/inverted_index_p0/test_index_bkd_null.groovy`
#### Snippet
```java

    def timeout = 60000
    def delta_time = 1000
    def alter_res = "null"
    def useTime = 0
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/inverted_index_p0/test_index_bkd_null.groovy`
#### Snippet
```java
    def timeout = 60000
    def delta_time = 1000
    def alter_res = "null"
    def useTime = 0

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/inverted_index_p0/test_index_bkd_null.groovy`
#### Snippet
```java
    def delta_time = 1000
    def alter_res = "null"
    def useTime = 0

    def indexTblName = "bkd_null_index_test"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_dup_keys_index.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_dup_keys_index.groovy`
#### Snippet
```java
            assert ele instanceof List<String>
            if (((List<String>) ele)[0] == "disable_auto_compaction") {
                disableAutoCompaction = Boolean.parseBoolean(((List<String>) ele)[2])
            }
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_dup_keys_index.groovy`
#### Snippet
```java

        def uuid = UUID.randomUUID().toString().replace("-", "0")
        def path = "oss://$bucket/regression/segcompaction_test/segcompaction_test.orc"

        def columns = "col_0, col_1, col_2, col_3, col_4, col_5, col_6, col_7, col_8, col_9, col_10, col_11, col_12, col_13, col_14, col_15, col_16, col_17, col_18, col_19, col_20, col_21, col_22, col_23, col_24, col_25, col_26, col_27, col_28, col_29, col_30, col_31, col_32, col_33, col_34, col_35, col_36, col_37, col_38, col_39, col_40, col_41, col_42, col_43, col_44, col_45, col_46, col_47, col_48, col_49"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_dup_keys_index.groovy`
#### Snippet
```java
        qt_select_default """ SELECT COUNT(*) FROM ${tableName} WHERE col_2 MATCH_ANY 'Lemon'; """

        String[][] tablets = sql """ show tablets from ${tableName}; """

    } finally {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_agg_keys_index.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_agg_keys_index.groovy`
#### Snippet
```java
            assert ele instanceof List<String>
            if (((List<String>) ele)[0] == "disable_auto_compaction") {
                disableAutoCompaction = Boolean.parseBoolean(((List<String>) ele)[2])
            }
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_agg_keys_index.groovy`
#### Snippet
```java

        def uuid = UUID.randomUUID().toString().replace("-", "0")
        def path = "oss://$bucket/regression/segcompaction_test/segcompaction_test.orc"

        def columns = "col_0, col_1, col_2, col_3, col_4, col_5, col_6, col_7, col_8, col_9, col_10, col_11, col_12, col_13, col_14, col_15, col_16, col_17, col_18, col_19, col_20, col_21, col_22, col_23, col_24, col_25, col_26, col_27, col_28, col_29, col_30, col_31, col_32, col_33, col_34, col_35, col_36, col_37, col_38, col_39, col_40, col_41, col_42, col_43, col_44, col_45, col_46, col_47, col_48, col_49"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/segcompaction_p2/test_segcompaction_agg_keys_index.groovy`
#### Snippet
```java
        qt_select_default """ SELECT COUNT(*) FROM ${tableName} WHERE col_2 MATCH_ANY 'Lemon'; """

        String[][] tablets = sql """ show tablets from ${tableName}; """

    } finally {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/inverted_index_p0/test_array_index.groovy`
#### Snippet
```java


    def timeout = 60000
    def delta_time = 1000
    def alter_res = "null"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/inverted_index_p0/test_array_index.groovy`
#### Snippet
```java

    def timeout = 60000
    def delta_time = 1000
    def alter_res = "null"
    def useTime = 0
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/inverted_index_p0/test_array_index.groovy`
#### Snippet
```java
    def timeout = 60000
    def delta_time = 1000
    def alter_res = "null"
    def useTime = 0

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/inverted_index_p0/test_array_index.groovy`
#### Snippet
```java
    def delta_time = 1000
    def alter_res = "null"
    def useTime = 0

    def indexTblName = "array_test"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/inverted_index_p0/test_add_drop_index.groovy`
#### Snippet
```java
    def drop_index_twice_result = "fail"
    try {
        drop_result = sql "drop index age_idx on ${indexTbName1}"
        drop_index_twice_result = "success"
    } catch(Exception ex) {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/inverted_index_p0/test_add_drop_index_with_data.groovy`
#### Snippet
```java

    // alter table add multiple index
    select_result = sql """
                        ALTER TABLE ${indexTbName1}
                            ADD INDEX idx_id (id) USING INVERTED,
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/inverted_index_p0/test_add_drop_index_with_data.groovy`
#### Snippet
```java

    // alter table drop multiple index
    select_result = sql """
                        ALTER TABLE ${indexTbName1}
                            DROP INDEX idx_id,
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/inverted_index_p0/unique_with_mow/test_pk_uk_case.groovy`
#### Snippet
```java

    Random rd = new Random()
    def order_key = rd.nextInt(1000)
    def part_key = rd.nextInt(1000)
    def sub_key = 13
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/inverted_index_p0/unique_with_mow/test_pk_uk_case.groovy`
#### Snippet
```java
    Random rd = new Random()
    def order_key = rd.nextInt(1000)
    def part_key = rd.nextInt(1000)
    def sub_key = 13
    def line_num = 29
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/inverted_index_p0/unique_with_mow/test_pk_uk_case.groovy`
#### Snippet
```java
    def order_key = rd.nextInt(1000)
    def part_key = rd.nextInt(1000)
    def sub_key = 13
    def line_num = 29
    def decimal = rd.nextInt(1000) + 0.11
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/inverted_index_p0/unique_with_mow/test_pk_uk_case.groovy`
#### Snippet
```java
    def part_key = rd.nextInt(1000)
    def sub_key = 13
    def line_num = 29
    def decimal = rd.nextInt(1000) + 0.11
    def city = RandomStringUtils.randomAlphabetic(10)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/inverted_index_p0/unique_with_mow/test_pk_uk_case.groovy`
#### Snippet
```java
    def sub_key = 13
    def line_num = 29
    def decimal = rd.nextInt(1000) + 0.11
    def city = RandomStringUtils.randomAlphabetic(10)
    def name = UUID.randomUUID().toString()
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/inverted_index_p0/unique_with_mow/test_pk_uk_case.groovy`
#### Snippet
```java
    def line_num = 29
    def decimal = rd.nextInt(1000) + 0.11
    def city = RandomStringUtils.randomAlphabetic(10)
    def name = UUID.randomUUID().toString()
    def date = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now())
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/inverted_index_p0/unique_with_mow/test_pk_uk_case.groovy`
#### Snippet
```java
    def decimal = rd.nextInt(1000) + 0.11
    def city = RandomStringUtils.randomAlphabetic(10)
    def name = UUID.randomUUID().toString()
    def date = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now())
    for (int idx = 0; idx < 10; idx++) {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/inverted_index_p0/unique_with_mow/test_pk_uk_case.groovy`
#### Snippet
```java
    def city = RandomStringUtils.randomAlphabetic(10)
    def name = UUID.randomUUID().toString()
    def date = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now())
    for (int idx = 0; idx < 10; idx++) {
        order_key = rd.nextInt(10)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/nereids_syntax_p0/cast.groovy`
#### Snippet
```java

suite("cast") {
    def tableName1 ="test"
    def tableName2 ="baseall"

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/nereids_syntax_p0/cast.groovy`
#### Snippet
```java
suite("cast") {
    def tableName1 ="test"
    def tableName2 ="baseall"

    sql 'set enable_nereids_planner=true'
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/flink_connector_p0/flink_connector.groovy`
#### Snippet
```java
    sql new File("""${context.file.parent}/ddl/create.sql""").text
    logger.info("start delete local flink doris demo jar...")
    def delete_local_spark_jar = "rm -rf flink-doris-demo.jar".execute()
    logger.info("start download flink doris demo ...")
    logger.info("getS3Url ==== ${getS3Url()}")
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/flink_connector_p0/flink_connector.groovy`
#### Snippet
```java
    logger.info("start download flink doris demo ...")
    logger.info("getS3Url ==== ${getS3Url()}")
    def download_spark_jar = "curl ${getS3Url()}/regression/flink-doris-demo.jar --output flink-doris-demo.jar".execute().getText()
    logger.info("finish download spark doris demo ...")
    def run_cmd = "java -cp flink-doris-demo.jar com.doris.DorisFlinkDfSinkDemo $context.config.feHttpAddress regression_test_flink_connector_p0.$tableName $context.config.feHttpUser"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/unique_with_mow_p0/test_pk_uk_case.groovy`
#### Snippet
```java

    Random rd = new Random()
    def order_key = rd.nextInt(1000)
    def part_key = rd.nextInt(1000)
    def sub_key = 13
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/unique_with_mow_p0/test_pk_uk_case.groovy`
#### Snippet
```java
    Random rd = new Random()
    def order_key = rd.nextInt(1000)
    def part_key = rd.nextInt(1000)
    def sub_key = 13
    def line_num = 29
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/unique_with_mow_p0/test_pk_uk_case.groovy`
#### Snippet
```java
    def order_key = rd.nextInt(1000)
    def part_key = rd.nextInt(1000)
    def sub_key = 13
    def line_num = 29
    def decimal = 111.11
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/unique_with_mow_p0/test_pk_uk_case.groovy`
#### Snippet
```java
    def part_key = rd.nextInt(1000)
    def sub_key = 13
    def line_num = 29
    def decimal = 111.11
    def city = RandomStringUtils.randomAlphabetic(10)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/unique_with_mow_p0/test_pk_uk_case.groovy`
#### Snippet
```java
    def sub_key = 13
    def line_num = 29
    def decimal = 111.11
    def city = RandomStringUtils.randomAlphabetic(10)
    def name = UUID.randomUUID().toString()
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/unique_with_mow_p0/test_pk_uk_case.groovy`
#### Snippet
```java
    def line_num = 29
    def decimal = 111.11
    def city = RandomStringUtils.randomAlphabetic(10)
    def name = UUID.randomUUID().toString()
    def date = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now())
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/unique_with_mow_p0/test_pk_uk_case.groovy`
#### Snippet
```java
    def decimal = 111.11
    def city = RandomStringUtils.randomAlphabetic(10)
    def name = UUID.randomUUID().toString()
    def date = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now())
    for (int idx = 0; idx < 10; idx++) {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/unique_with_mow_p0/test_pk_uk_case.groovy`
#### Snippet
```java
    def city = RandomStringUtils.randomAlphabetic(10)
    def name = UUID.randomUUID().toString()
    def date = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now())
    for (int idx = 0; idx < 10; idx++) {
        order_key = rd.nextInt(10)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/unique_with_mow_p2/test_pk_uk_case.groovy`
#### Snippet
```java

    Random rd = new Random()
    def order_key = rd.nextInt(1000)
    def part_key = rd.nextInt(1000)
    def sub_key = 13
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/unique_with_mow_p2/test_pk_uk_case.groovy`
#### Snippet
```java
    Random rd = new Random()
    def order_key = rd.nextInt(1000)
    def part_key = rd.nextInt(1000)
    def sub_key = 13
    def line_num = 29
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/unique_with_mow_p2/test_pk_uk_case.groovy`
#### Snippet
```java
    def order_key = rd.nextInt(1000)
    def part_key = rd.nextInt(1000)
    def sub_key = 13
    def line_num = 29
    def decimal = rd.nextInt(1000) + 0.11
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/unique_with_mow_p2/test_pk_uk_case.groovy`
#### Snippet
```java
    def part_key = rd.nextInt(1000)
    def sub_key = 13
    def line_num = 29
    def decimal = rd.nextInt(1000) + 0.11
    def city = RandomStringUtils.randomAlphabetic(10)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/unique_with_mow_p2/test_pk_uk_case.groovy`
#### Snippet
```java
    def sub_key = 13
    def line_num = 29
    def decimal = rd.nextInt(1000) + 0.11
    def city = RandomStringUtils.randomAlphabetic(10)
    def name = UUID.randomUUID().toString()
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/unique_with_mow_p2/test_pk_uk_case.groovy`
#### Snippet
```java
    def line_num = 29
    def decimal = rd.nextInt(1000) + 0.11
    def city = RandomStringUtils.randomAlphabetic(10)
    def name = UUID.randomUUID().toString()
    def date = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now())
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/unique_with_mow_p2/test_pk_uk_case.groovy`
#### Snippet
```java
    def decimal = rd.nextInt(1000) + 0.11
    def city = RandomStringUtils.randomAlphabetic(10)
    def name = UUID.randomUUID().toString()
    def date = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now())
    for (int idx = 0; idx < 500; idx++) {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/unique_with_mow_p2/test_pk_uk_case.groovy`
#### Snippet
```java
    def city = RandomStringUtils.randomAlphabetic(10)
    def name = UUID.randomUUID().toString()
    def date = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now())
    for (int idx = 0; idx < 500; idx++) {
        order_key = rd.nextInt(10)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/unique_with_mow_p2/ssb_unique_load_zstd/four/load_four_step.groovy`
#### Snippet
```java
            }
            sql 'sync'
            int flag = 1
            for (int i = 1; i <= 5; i++) {
                def loadRowCount = sql "select count(1) from ${tableName}"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/external_catalog_p0/hive/test_hive_other.groovy`
#### Snippet
```java
    if (enabled != null && enabled.equalsIgnoreCase("true")) {
        String hms_port = context.config.otherConfigs.get("hms_port")
        String hdfs_port = context.config.otherConfigs.get("hdfs_port")
        String catalog_name = "hive_test_other"

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/external_catalog_p0/hive/test_different_parquet_types.groovy`
#### Snippet
```java
        logger.info("record res" + res3_1.toString())

        def res3_2 = sql """
        select count(*) from delta_binary_packed;
        """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/show.groovy`
#### Snippet
```java

    if (get_storage_policy.call("showPolicy_1_policy").isEmpty()){
        def create_s3_resource = try_sql """
            CREATE RESOURCE "showPolicy_1_resource"
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/show.groovy`
#### Snippet
```java
            );
        """
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY showPolicy_1_policy
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/show.groovy`
#### Snippet
```java
        """
    }
    def show_result = sql """
        SHOW STORAGE POLICY;
    """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/create.groovy`
#### Snippet
```java

    if (!storage_exist.call("testPolicy_10")) {
        def create_s3_resource = try_sql """
            CREATE RESOURCE "testPolicy_10_resource"
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/create.groovy`
#### Snippet
```java
            );
        """
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY testPolicy_10
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/create.groovy`
#### Snippet
```java

    if (!storage_exist.call("testPolicy_11")) {
        def create_s3_resource = try_sql """
            CREATE RESOURCE "testPolicy_11_resource"
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/create.groovy`
#### Snippet
```java
            );
        """
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY testPolicy_11
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/create.groovy`
#### Snippet
```java

    if (!storage_exist.call("testPolicy_12")) {
        def create_s3_resource = try_sql """
            CREATE RESOURCE "testPolicy_12_resource"
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/create.groovy`
#### Snippet
```java
            );
        """
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY testPolicy_12
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/create.groovy`
#### Snippet
```java

    if (!storage_exist.call("testPolicy_13")) {
        def create_s3_resource = try_sql """
            CREATE RESOURCE "testPolicy_13_resource"
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/create.groovy`
#### Snippet
```java
            );
        """
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY testPolicy_13
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/create.groovy`
#### Snippet
```java

    if (!storage_exist.call("testPolicy_14")) {
        def create_s3_resource = try_sql """
            CREATE RESOURCE "testPolicy_14_resource"
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/create.groovy`
#### Snippet
```java
            );
        """
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY testPolicy_14
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/create.groovy`
#### Snippet
```java

    if (!storage_exist.call("testPolicy_15")) {
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY testPolicy_15
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java
    def alter_resource_change_property = { resource_name ->
        // support
        def alter_result_succ_1 = try_sql """
            ALTER RESOURCE "${resource_name}" PROPERTIES("AWS_MAX_CONNECTIONS" = "1111");
        """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java
        """

        def alter_result_succ_2 = try_sql """
            ALTER RESOURCE "${resource_name}" PROPERTIES("AWS_CONNECTION_TIMEOUT_MS" = "2222");
        """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java
        """

        def alter_result_succ_5 = try_sql """
            ALTER RESOURCE "${resource_name}" PROPERTIES("AWS_SECRET_KEY" = "5555");
        """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java
        """

        def alter_result_succ_6 = try_sql """
            ALTER RESOURCE "${resource_name}" PROPERTIES("AWS_ACCESS_KEY" = "6666");
        """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java
        """

        def alter_result_succ_7 = try_sql """
            ALTER RESOURCE "${resource_name}" PROPERTIES("AWS_REQUEST_TIMEOUT_MS" = "7777");
        """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

        // errCode = 2, detailMessage = current not support modify property : AWS_REGION
        def alter_result_fail_1 = try_sql """
            ALTER RESOURCE "${resource_name}" PROPERTIES("AWS_REGION" = "8888");
        """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

        // errCode = 2, detailMessage = current not support modify property : AWS_BUCKET
        def alter_result_fail_2 = try_sql """
            ALTER RESOURCE "${resource_name}" PROPERTIES("AWS_BUCKET" = "9999");
        """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

        // errCode = 2, detailMessage = current not support modify property : AWS_ROOT_PATH
        def alter_result_fail_3 = try_sql """
            ALTER RESOURCE "${resource_name}" PROPERTIES("AWS_ROOT_PATH" = "10101010");
        """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

        // errCode = 2, detailMessage = current not support modify property : AWS_ENDPOINT
        def alter_result_fail_4 = try_sql """
            ALTER RESOURCE "${resource_name}" PROPERTIES("AWS_ENDPOINT" = "11111111");
        """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

        // errCode = 2, detailMessage = current not support modify property : type
        def alter_result_fail_5 = try_sql """
            ALTER RESOURCE "${resource_name}" PROPERTIES("type" = "local");
        """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

    if (!storage_exist.call("has_test_policy_to_alter")) {
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY has_test_policy_to_alter
            PROPERTIES( 
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

    // OK
    def alter_result_sql_succ_ttl = try_sql """
        ALTER STORAGE POLICY has_test_policy_to_alter PROPERTIES("cooldown_ttl" = "10000");
    """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

    // FAIL
    alter_result_sql_succ_ttl = try_sql """
        ALTER STORAGE POLICY has_test_policy_to_alter PROPERTIES("cooldown_ttl" = "-10000");
    """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

    // OK
    def alter_result_sql_succ_datetime = try_sql """
        ALTER STORAGE POLICY has_test_policy_to_alter PROPERTIES("cooldown_datetime" = "2023-06-08 00:00:00");
    """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

    // FAILED
    alter_result_sql_succ_datetime = try_sql """
        ALTER STORAGE POLICY has_test_policy_to_alter PROPERTIES("cooldown_datetime" = "2023-13-32 00:00:00");
    """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

    if (!storage_exist.call("has_test_policy_to_alter_1")) {
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY has_test_policy_to_alter_1
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

    // go to check be、fe log about notify alter.
    def alter_result_succ_again = try_sql """
        ALTER RESOURCE "${has_resource_policy_alter}" PROPERTIES("AWS_ACCESS_KEY" = "akakak");
    """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/drop.groovy`
#### Snippet
```java


        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY ${use_policy}
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/drop.groovy`
#### Snippet
```java
        assertEquals(drop_policy_ret.size(), 1)

        def create_succ_2 = try_sql """
            CREATE STORAGE POLICY IF NOT EXISTS drop_policy_test_has_table_binded
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/empty_table_use_policy/use_default_storage_policy.groovy`
#### Snippet
```java
        assertEquals(create_table_use_default_policy_but_not_set_default_policy_result, null);

        def create_s3_resource = try_sql """
            CREATE RESOURCE IF NOT EXISTS "default_s3_resource"
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/empty_table_use_policy/use_default_storage_policy.groovy`
#### Snippet
```java
            );
        """
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY IF NOT EXISTS default_storage_policy PROPERTIES(
                "storage_resource" = "default_s3_resource",
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/empty_table_use_policy/use_default_storage_policy.groovy`
#### Snippet
```java
    // you can change default_storage_policy's policy property, such as ak、sk,
    // so table create_table_not_have_policy will use AWS_ACCESS_KEY = "has_been_changed"
    def modify_storage_policy_property_result_1 = try_sql """
        ALTER RESOURCE "default_s3_resource" PROPERTIES("AWS_ACCESS_KEY" = "has_been_changed");
    """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/empty_table_use_policy/alter_table_add_policy.groovy`
#### Snippet
```java

    if (!storage_exist.call("created_create_table_alter_policy")) {
        def create_s3_resource = try_sql """
            CREATE RESOURCE IF NOT EXISTS "test_create_alter_table_use_resource"
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/empty_table_use_policy/alter_table_add_policy.groovy`
#### Snippet
```java
            );
        """
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY IF NOT EXISTS created_create_table_alter_policy
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/empty_table_use_policy/alter_table_add_policy.groovy`
#### Snippet
```java

    if (!storage_exist.call("created_create_table_alter_policy_1")) {
        def create_s3_resource = try_sql """
            CREATE RESOURCE IF NOT EXISTS "test_create_alter_table_use_resource_1"
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/empty_table_use_policy/alter_table_add_policy.groovy`
#### Snippet
```java
            );
        """
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY IF NOT EXISTS created_create_table_alter_policy_1
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/empty_table_use_policy/alter_table_add_policy.groovy`
#### Snippet
```java
    // you can change created_create_table_alter_policy's policy cooldown time, cooldown ttl property,
    // by alter storage policy
    def modify_storage_policy_property_result = try_sql """
        ALTER STORAGE POLICY "created_create_table_alter_policy_1" PROPERTIES("cooldown_datetime" = "2026-06-08 00:00:00");
    """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/empty_table_use_policy/alter_table_add_policy.groovy`
#### Snippet
```java
    """
    // change s3 resource, ak、sk by alter resource
    def modify_storage_policy_property_result_1 = try_sql """
        ALTER RESOURCE "test_create_alter_table_use_resource_1" PROPERTIES("AWS_ACCESS_KEY" = "has_been_changed");
    """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/empty_table_use_policy/create_table_use_policy.groovy`
#### Snippet
```java
    }

    def create_s3_resource = try_sql """
        CREATE RESOURCE IF NOT EXISTS "test_create_table_use_resource"
        PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/empty_table_use_policy/create_table_use_policy.groovy`
#### Snippet
```java
        );
    """
    def create_succ_1 = try_sql """
        CREATE STORAGE POLICY IF NOT EXISTS test_create_table_use_policy
        PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/empty_table_use_policy/create_table_use_partition_policy.groovy`
#### Snippet
```java

    if (!storage_exist.call("test_create_table_partition_use_policy_1")) {
        def create_s3_resource = try_sql """
            CREATE RESOURCE IF NOT EXISTS "test_create_table_partition_use_resource_1"
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/empty_table_use_policy/create_table_use_partition_policy.groovy`
#### Snippet
```java
            );
        """
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY IF NOT EXISTS test_create_table_partition_use_policy_1
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/empty_table_use_policy/create_table_use_partition_policy.groovy`
#### Snippet
```java

    if (!storage_exist.call("test_create_table_partition_use_policy_2")) {
        def create_s3_resource = try_sql """
            CREATE RESOURCE IF NOT EXISTS "test_create_table_partition_use_resource_2"
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/empty_table_use_policy/create_table_use_partition_policy.groovy`
#### Snippet
```java
            );
        """
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY IF NOT EXISTS test_create_table_partition_use_policy_2
            PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/empty_table_use_policy/modify_partition_add_policy.groovy`
#### Snippet
```java
    }

    def create_s3_resource = try_sql """
        CREATE RESOURCE IF NOT EXISTS "test_modify_partition_table_use_resource"
        PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation/empty_table_use_policy/modify_partition_add_policy.groovy`
#### Snippet
```java
        );
    """
    def create_succ_1 = try_sql """
        CREATE STORAGE POLICY IF NOT EXISTS created_create_table_partition_alter_policy
        PROPERTIES(
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/external_table_emr_p2/mysql/test_external_catalog_mysql.groovy`
#### Snippet
```java
        String mysqlResource01 = "mysql_catalog_resource_01"
        String mysqlCatalogName = "mysql_jdbc"
        String mysqlTableName01 = "lineorder"
        String mysqlTableName02 = "customer"
        String mysqlTableName03 = "supplier"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation_p2/create_table_use_policy.groovy`
#### Snippet
```java
    // data_sizes is one arrayList<Long>, t is tablet
    def fetchDataSize = { data_sizes, t ->
        def tabletId = t[0]
        String meta_url = t[16]
        def clos = {  respCode, body ->
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation_p2/create_table_use_partition_policy.groovy`
#### Snippet
```java
    // data_sizes is one arrayList<Long>, t is tablet
    def fetchDataSize = { data_sizes, t ->
        def tabletId = t[0]
        String meta_url = t[16]
        def clos = {  respCode, body ->
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation_p2/table_modify_resouce_and_policy.groovy`
#### Snippet
```java
    // data_sizes is one arrayList<Long>, t is tablet
    def fetchDataSize = { data_sizes, t ->
        def tabletId = t[0]
        String meta_url = t[16]
        def clos = {  respCode, body ->
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation_p2/modify_replica_use_partition.groovy`
#### Snippet
```java
    // data_sizes is one arrayList<Long>, t is tablet
    def fetchDataSize = { data_sizes, t ->
        def tabletId = t[0]
        String meta_url = t[16]
        def clos = {  respCode, body ->
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation_p2/modify_replica_use_partition.groovy`
#### Snippet
```java
    // used as passing out parameter to fetchDataSize
    List<Long> sizes = [-1, -1]
    def get_meta = { url ->
        StringBuilder sb = new StringBuilder();
        sb.append("curl ")
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation_p2/modify_replica_use_partition.groovy`
#### Snippet
```java
        """
    }
    def compactionStatusIdx = tablets[0].size() - 1
    // check rowsets inside the 3 replica
    def iterate_num = tablets.size() / 3;
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation_p2/modify_replica_use_partition.groovy`
#### Snippet
```java
    def compactionStatusIdx = tablets[0].size() - 1
    // check rowsets inside the 3 replica
    def iterate_num = tablets.size() / 3;
    for (int i = 0; i < iterate_num; i++) {
        int idx = i * 3;
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation_p2/modify_replica_use_partition.groovy`
#### Snippet
```java
    sleep(60000)
    // 对比3副本的partition中所有tablets的replicas的rowsets meta是否相同
    tablets = sql """
    SHOW TABLETS FROM ${tableName} PARTITIONS(p202302)
    """
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation_p2/modify_replica_use_partition.groovy`
#### Snippet
```java
    SHOW TABLETS FROM ${tableName} PARTITIONS(p202302)
    """
    compactionStatusIdx = tablets[0].size() - 1
    // check rowsets inside the 3 replica
    iterate_num = tablets.size() / 3;
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/suites/cold_heat_separation_p2/modify_replica_use_partition.groovy`
#### Snippet
```java
    compactionStatusIdx = tablets[0].size() - 1
    // check rowsets inside the 3 replica
    iterate_num = tablets.size() / 3;
    for (int i = 0; i < iterate_num; i++) {
        int idx = i * 3;
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java

// **Note**: default db will be create if not exist
defaultDb = "regression_test"

jdbcUrl = "jdbc:mysql://172.19.0.2:9132/?useLocalSessionState=true&allowLoadLocalInfile=true"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
defaultDb = "regression_test"

jdbcUrl = "jdbc:mysql://172.19.0.2:9132/?useLocalSessionState=true&allowLoadLocalInfile=true"
jdbcUser = "root"
jdbcPassword = ""
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java

jdbcUrl = "jdbc:mysql://172.19.0.2:9132/?useLocalSessionState=true&allowLoadLocalInfile=true"
jdbcUser = "root"
jdbcPassword = ""

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
jdbcUrl = "jdbc:mysql://172.19.0.2:9132/?useLocalSessionState=true&allowLoadLocalInfile=true"
jdbcUser = "root"
jdbcPassword = ""

feHttpAddress = "172.19.0.2:8132"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
jdbcPassword = ""

feHttpAddress = "172.19.0.2:8132"
feHttpUser = "root"
feHttpPassword = ""
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java

feHttpAddress = "172.19.0.2:8132"
feHttpUser = "root"
feHttpPassword = ""

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
feHttpAddress = "172.19.0.2:8132"
feHttpUser = "root"
feHttpPassword = ""

beHttpAddress = "172.19.0.2:8142"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
feHttpPassword = ""

beHttpAddress = "172.19.0.2:8142"

// set DORIS_HOME by system properties
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
// set DORIS_HOME by system properties
// e.g. java -DDORIS_HOME=./
suitePath = "${DORIS_HOME}/regression-test/suites"
dataPath = "${DORIS_HOME}/regression-test/data"

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
// e.g. java -DDORIS_HOME=./
suitePath = "${DORIS_HOME}/regression-test/suites"
dataPath = "${DORIS_HOME}/regression-test/data"

// will test <group>/<suite>.groovy
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
// will test <group>/<suite>.groovy
// empty group will test all group
testGroups = ""
// empty suite will test all suite
testSuites = ""
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
testGroups = ""
// empty suite will test all suite
testSuites = ""

cacheDataPath="/data/regression/"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
testSuites = ""

cacheDataPath="/data/regression/"

s3Endpoint = "cos.ap-hongkong.myqcloud.com"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
cacheDataPath="/data/regression/"

s3Endpoint = "cos.ap-hongkong.myqcloud.com"
s3BucketName = "doris-build-hk-1308700295"
s3Region = "ap-hongkong"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java

s3Endpoint = "cos.ap-hongkong.myqcloud.com"
s3BucketName = "doris-build-hk-1308700295"
s3Region = "ap-hongkong"

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
s3Endpoint = "cos.ap-hongkong.myqcloud.com"
s3BucketName = "doris-build-hk-1308700295"
s3Region = "ap-hongkong"

max_failure_num=0
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
s3Region = "ap-hongkong"

max_failure_num=0

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java

// **Note**: default db will be create if not exist
defaultDb = "regression_test"

jdbcUrl = "jdbc:mysql://172.19.0.2:9131/?useLocalSessionState=true&allowLoadLocalInfile=true"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
defaultDb = "regression_test"

jdbcUrl = "jdbc:mysql://172.19.0.2:9131/?useLocalSessionState=true&allowLoadLocalInfile=true"
jdbcUser = "root"
jdbcPassword = ""
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java

jdbcUrl = "jdbc:mysql://172.19.0.2:9131/?useLocalSessionState=true&allowLoadLocalInfile=true"
jdbcUser = "root"
jdbcPassword = ""

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
jdbcUrl = "jdbc:mysql://172.19.0.2:9131/?useLocalSessionState=true&allowLoadLocalInfile=true"
jdbcUser = "root"
jdbcPassword = ""

feHttpAddress = "172.19.0.2:8131"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
jdbcPassword = ""

feHttpAddress = "172.19.0.2:8131"
feHttpUser = "root"
feHttpPassword = ""
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java

feHttpAddress = "172.19.0.2:8131"
feHttpUser = "root"
feHttpPassword = ""

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
feHttpAddress = "172.19.0.2:8131"
feHttpUser = "root"
feHttpPassword = ""

// set DORIS_HOME by system properties
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
// set DORIS_HOME by system properties
// e.g. java -DDORIS_HOME=./
suitePath = "${DORIS_HOME}/regression-test/suites"
dataPath = "${DORIS_HOME}/regression-test/data"
pluginPath = "${DORIS_HOME}/regression-test/plugins"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
// e.g. java -DDORIS_HOME=./
suitePath = "${DORIS_HOME}/regression-test/suites"
dataPath = "${DORIS_HOME}/regression-test/data"
pluginPath = "${DORIS_HOME}/regression-test/plugins"
realDataPath = "${DORIS_HOME}/regression-test/realdata"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
suitePath = "${DORIS_HOME}/regression-test/suites"
dataPath = "${DORIS_HOME}/regression-test/data"
pluginPath = "${DORIS_HOME}/regression-test/plugins"
realDataPath = "${DORIS_HOME}/regression-test/realdata"
// sf1DataPath can be url like "https://doris-community-test-1308700295.cos.ap-hongkong.myqcloud.com" or local path like "/data"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
dataPath = "${DORIS_HOME}/regression-test/data"
pluginPath = "${DORIS_HOME}/regression-test/plugins"
realDataPath = "${DORIS_HOME}/regression-test/realdata"
// sf1DataPath can be url like "https://doris-community-test-1308700295.cos.ap-hongkong.myqcloud.com" or local path like "/data"
//sf1DataPath = "https://doris-community-test-1308700295.cos.ap-hongkong.myqcloud.com"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
// will test <group>/<suite>.groovy
// empty group will test all group
testGroups = ""
// empty suite will test all suite
testSuites = ""
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
testGroups = ""
// empty suite will test all suite
testSuites = ""
// empty directories will test all directories
testDirectories = ""
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
testSuites = ""
// empty directories will test all directories
testDirectories = ""

// this groups will not be executed
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java

// this groups will not be executed
excludeGroups = ""
// this suites will not be executed
excludeSuites = "test_broker_load"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
excludeGroups = ""
// this suites will not be executed
excludeSuites = "test_broker_load"
// this directories will not be executed
excludeDirectories = ""
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
excludeSuites = "test_broker_load"
// this directories will not be executed
excludeDirectories = ""

customConf1 = "test_custom_conf_value"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
excludeDirectories = ""

customConf1 = "test_custom_conf_value"

// for test csv with header
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java

// for test csv with header
enableHdfs=false // set to true if hdfs is ready
hdfsFs = "hdfs://127.0.0.1:9000"
hdfsUser = "doris-test"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
// for test csv with header
enableHdfs=false // set to true if hdfs is ready
hdfsFs = "hdfs://127.0.0.1:9000"
hdfsUser = "doris-test"
hdfsPasswd = ""
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
enableHdfs=false // set to true if hdfs is ready
hdfsFs = "hdfs://127.0.0.1:9000"
hdfsUser = "doris-test"
hdfsPasswd = ""
brokerName = "broker_name"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
hdfsFs = "hdfs://127.0.0.1:9000"
hdfsUser = "doris-test"
hdfsPasswd = ""
brokerName = "broker_name"

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
hdfsUser = "doris-test"
hdfsPasswd = ""
brokerName = "broker_name"

// broker load test config
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java

// broker load test config
enableBrokerLoad=true

// jdbc connector test config
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
// To enable jdbc test, you need first start mysql/pg container.
// See `docker/thirdparties/start-thirdparties-docker.sh`
enableJdbcTest=false
mysql_57_port=7111
pg_14_port=7121
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
// See `docker/thirdparties/start-thirdparties-docker.sh`
enableJdbcTest=false
mysql_57_port=7111
pg_14_port=7121

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
enableJdbcTest=false
mysql_57_port=7111
pg_14_port=7121

// hive catalog test config
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
// To enable jdbc test, you need first start hive container.
// See `docker/thirdparties/start-thirdparties-docker.sh`
enableHiveTest=false
hms_port=7141

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
// See `docker/thirdparties/start-thirdparties-docker.sh`
enableHiveTest=false
hms_port=7141

cacheDataPath = "/data/regression/"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
hms_port=7141

cacheDataPath = "/data/regression/"

s3Endpoint = "cos.ap-hongkong.myqcloud.com"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
cacheDataPath = "/data/regression/"

s3Endpoint = "cos.ap-hongkong.myqcloud.com"
s3BucketName = "doris-build-hk-1308700295"
s3Region = "ap-hongkong"
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java

s3Endpoint = "cos.ap-hongkong.myqcloud.com"
s3BucketName = "doris-build-hk-1308700295"
s3Region = "ap-hongkong"

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
s3Endpoint = "cos.ap-hongkong.myqcloud.com"
s3BucketName = "doris-build-hk-1308700295"
s3Region = "ap-hongkong"

max_failure_num=50
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
s3Region = "ap-hongkong"

max_failure_num=50

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/util/SqlUtils.groovy`
#### Snippet
```java
            // first, try parsing with potentially faster SLL mode
            parser.getInterpreter().setPredictionMode(PredictionMode.SLL)
            tree = parserFunction.apply(parser);
        } catch (ParseCancellationException ex) {
            // if we fail, parse with LL mode
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/util/SqlUtils.groovy`
#### Snippet
```java

            parser.getInterpreter().setPredictionMode(PredictionMode.LL)
            tree = parserFunction.apply(parser)
        } finally {
            clearDFAIfNecessary(lexer, parser)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/CreateMVAction.groovy`
#### Snippet
```java
    void run() {
        def result = doRun(sql)
        String resultString = result.result

        if (exception != null) {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/ExplainAction.groovy`
#### Snippet
```java
        if (checkFunction != null) {
            try {
                Boolean checkResult = null
                if (checkFunction.parameterTypes.size() == 1) {
                    if (result.exception == null) {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/ExplainAction.groovy`
#### Snippet
```java
        ResultSetMetaData meta = null
        try {
            def temp = null
            (temp, meta) = JdbcUtils.executeToList(context.getConnection(), explainSql)
            explainString = temp.stream().map({row -> row.get(0).toString()}).collect(Collectors.joining("\n"))
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/BenchmarkAction.groovy`
#### Snippet
```java
                for (int times = 1; times <= executeTimes; ++times) {
                    log.info("Execute sql ${i} for the ${times == 1 ? "first" : times} time${times > 1 ? "s" : ""}".toString())
                    def (_, elapsed) = SuiteUtils.timer {
                        JdbcUtils.executeToList(context.getConnection(), sql)
                    }
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/TestAction.groovy`
#### Snippet
```java
                if (this.resultFileUri != null) {
                    Consumer<InputStream> checkFunc = { InputStream inputStream ->
                        String errorMsg = null
                        def lineIt = new LineIterator(new InputStreamReader(inputStream, StandardCharsets.UTF_8))
                        if (resultTag.is(null)) {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/suite/Suite.groovy`
#### Snippet
```java
    List<List<Object>> sql(String sqlStr, boolean isOrder = false) {
        logger.info("Execute ${isOrder ? "order_" : ""}sql: ${sqlStr}".toString())
        def (result, meta) = JdbcUtils.executeToList(context.getConnection(), sqlStr)
        if (isOrder) {
            result = DataUtils.sortByToString(result)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/suite/Suite.groovy`
#### Snippet
```java
    List<List<String>> sql_meta(String sqlStr, boolean isOrder = false) {
        logger.info("Execute ${isOrder ? "order_" : ""}sql: ${sqlStr}".toString())
        def (tmp, rsmd) = JdbcUtils.executeToList(context.getConnection(), sqlStr)
        int count = rsmd.getColumnCount();
        List<List<String>> result = new ArrayList<>()
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/suite/Suite.groovy`
#### Snippet
```java
            List<String> item = new ArrayList<>()
            String columnName = rsmd.getColumnName(i + 1);
            int columnType = rsmd.getColumnType(i+1);
            String columnTypeName = rsmd.getColumnTypeName(i+1);
            item.add(columnName);
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/suite/Suite.groovy`
#### Snippet
```java
    void quickRunTest(String tag, Object arg, boolean isOrder = false) {
        if (context.config.generateOutputFile || context.config.forceGenerateOutputFile) {
            Tuple2<List<List<Object>>, ResultSetMetaData> tupleResult = null
            if (arg instanceof PreparedStatement) {
                tupleResult = JdbcUtils.executeToStringList(context.getConnection(),  (PreparedStatement) arg)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/suite/Suite.groovy`
#### Snippet
```java
                tupleResult = JdbcUtils.executeToStringList(context.getConnection(),  (String) arg)
            }
            def (result, meta) = tupleResult
            if (isOrder) {
                result = sortByToString(result)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/suite/Suite.groovy`
#### Snippet
```java

            OutputUtils.TagBlockIterator expectCsvResults = context.getOutputIterator().next()
            Tuple2<List<List<Object>>, ResultSetMetaData> tupleResult = null
            if (arg instanceof PreparedStatement) {
                tupleResult = JdbcUtils.executeToStringList(context.getConnection(),  (PreparedStatement) arg)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/suite/Suite.groovy`
#### Snippet
```java
            realWriter.write(realResultsIter, tag)

            String errorMsg = null
            try {
                errorMsg = OutputUtils.checkOutput(expectCsvResults, realResults.iterator(),
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/RestoreAction.groovy`
#### Snippet
```java
DROP REPOSITORY ${repository}
"""
        List<List<Object>> showRepoRes = null
        ResultSetMetaData meta = null
        (showRepoRes, meta) = JdbcUtils.executeToList(context.conn, showRepoSql)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/RestoreAction.groovy`
#### Snippet
```java
"""
        List<List<Object>> showRepoRes = null
        ResultSetMetaData meta = null
        (showRepoRes, meta) = JdbcUtils.executeToList(context.conn, showRepoSql)
        for (List<Object> row : showRepoRes) {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/RestoreAction.groovy`
#### Snippet
```java
        List<List<Object>> showRepoRes = null
        ResultSetMetaData meta = null
        (showRepoRes, meta) = JdbcUtils.executeToList(context.conn, showRepoSql)
        for (List<Object> row : showRepoRes) {
            if (row.size() > 1 && repository.equalsIgnoreCase(row[1].toString())) {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/RestoreAction.groovy`
#### Snippet
```java

    private void restore() {
        List<List<Object>> showTablesRes = null
        ResultSetMetaData meta = null

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/RestoreAction.groovy`
#### Snippet
```java
    private void restore() {
        List<List<Object>> showTablesRes = null
        ResultSetMetaData meta = null

        if (CollectionUtils.isEmpty(tables)) {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/RestoreAction.groovy`
#### Snippet
```java
            tables = new ArrayList<>()
            String showTables = """SHOW TABLES"""
            (showTablesRes, meta) = JdbcUtils.executeToList(context.conn, showTables)
            for (List<Object> tableRes : showTablesRes) {
                tables.add(tableRes[0].toString())
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/RestoreAction.groovy`
#### Snippet
```java
SHOW RESTORE FROM `${getRealDbName()}`
"""
        List<List<Object>> result = null
        ResultSetMetaData meta = null

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/RestoreAction.groovy`
#### Snippet
```java
"""
        List<List<Object>> result = null
        ResultSetMetaData meta = null

        while (true) {
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/RestoreAction.groovy`
#### Snippet
```java

        while (true) {
            (result, meta) = JdbcUtils.executeToList(context.conn, showRestoreSql)
            if (!result.empty && result[result.size() - 1].size() >= 5) {
                def status = result[result.size() - 1][4].toString()
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/StreamLoadAction.groovy`
#### Snippet
```java
        this.password = context.config.feHttpPassword

        def groupList = context.group.split(',')
        this.db = context.config.getDbNameByFile(context.file)

```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/StreamLoadAction.groovy`
#### Snippet
```java

    private HttpEntity prepareHttpEntity(CloseableHttpClient client) {
        HttpEntity entity = null
        if (inputStream != null) {
            entity = new InputStreamEntity(inputStream)
```

### GroovyUnusedAssignment
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/StreamLoadAction.groovy`
#### Snippet
```java
                Thread.sleep(2000)
                maxWaitSecond -= 2
                def (result, meta) = JdbcUtils.executeToStringList(context.getConnection(), sql)
                if (result.size() != 1) {
                    throw new IllegalStateException("Failed to get txn's ${txnId}")
```

## RuleId[id=GroovyUnnecessaryContinue]
### GroovyUnnecessaryContinue
continue is unnecessary as the last statement in a loop
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/util/BytesInputStream.groovy`
#### Snippet
```java
                if (bytesIt.hasNext()) {
                    currentStream = new ByteArrayInputStream(bytesIt.next())
                    continue
                } else {
                    return readSize > 0 ? readSize : -1
```

