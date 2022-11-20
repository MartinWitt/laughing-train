# doris 
 
# Bad smells
I found 252 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=GroovyUnusedAssignment] | 251 | false |
| RuleId[ruleID=GroovyUnnecessaryContinue] | 1 | false |
## RuleId[ruleID=GroovyUnusedAssignment]
### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java

// **Note**: default db will be create if not exist
defaultDb = "regression_test"

// add useLocalSessionState so that the jdbc will not send
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
// init cmd like: select @@session.tx_read_only
// at each time we connect.
jdbcUrl = "jdbc:mysql://127.0.0.1:9030/?useLocalSessionState=true"
jdbcUser = "root"
jdbcPassword = ""
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
// at each time we connect.
jdbcUrl = "jdbc:mysql://127.0.0.1:9030/?useLocalSessionState=true"
jdbcUser = "root"
jdbcPassword = ""

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
jdbcUrl = "jdbc:mysql://127.0.0.1:9030/?useLocalSessionState=true"
jdbcUser = "root"
jdbcPassword = ""

feHttpAddress = "127.0.0.1:8030"
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
jdbcPassword = ""

feHttpAddress = "127.0.0.1:8030"
feHttpUser = "root"
feHttpPassword = ""
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java

feHttpAddress = "127.0.0.1:8030"
feHttpUser = "root"
feHttpPassword = ""

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
feHttpAddress = "127.0.0.1:8030"
feHttpUser = "root"
feHttpPassword = ""

// set DORIS_HOME by system properties
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
suitePath = "${DORIS_HOME}/regression-test/suites"
dataPath = "${DORIS_HOME}/regression-test/data"
pluginPath = "${DORIS_HOME}/regression-test/plugins"
realDataPath = "${DORIS_HOME}/regression-test/realdata"
// sf1DataPath can be url like "https://doris-community-test-1308700295.cos.ap-hongkong.myqcloud.com" or local path like "/data"
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
dataPath = "${DORIS_HOME}/regression-test/data"
pluginPath = "${DORIS_HOME}/regression-test/plugins"
realDataPath = "${DORIS_HOME}/regression-test/realdata"
// sf1DataPath can be url like "https://doris-community-test-1308700295.cos.ap-hongkong.myqcloud.com" or local path like "/data"
sf1DataPath = "https://doris-community-test-1308700295.cos.ap-hongkong.myqcloud.com"
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
realDataPath = "${DORIS_HOME}/regression-test/realdata"
// sf1DataPath can be url like "https://doris-community-test-1308700295.cos.ap-hongkong.myqcloud.com" or local path like "/data"
sf1DataPath = "https://doris-community-test-1308700295.cos.ap-hongkong.myqcloud.com"

// will test <group>/<suite>.groovy
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
testSuites = ""
// empty directories will test all directories
testDirectories = ""

// this groups will not be executed
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java

// this groups will not be executed
excludeGroups = ""
// this suites will not be executed
excludeSuites = ""
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
excludeGroups = ""
// this suites will not be executed
excludeSuites = ""
// this directories will not be executed
excludeDirectories = ""
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
excludeSuites = ""
// this directories will not be executed
excludeDirectories = ""

customConf1 = "test_custom_conf_value"
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
excludeDirectories = ""

customConf1 = "test_custom_conf_value"

// for test csv with header
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java

// for test csv with header
enableHdfs=false // set to true if hdfs is ready
hdfsFs = "hdfs://127.0.0.1:9000"
hdfsUser = "doris-test"
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
hdfsFs = "hdfs://127.0.0.1:9000"
hdfsUser = "doris-test"
hdfsPasswd = ""
brokerName = "broker_name"

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
hdfsUser = "doris-test"
hdfsPasswd = ""
brokerName = "broker_name"

// broker load test config
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java

// broker load test config
enableBrokerLoad=true
ak=""
sk=""
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
// broker load test config
enableBrokerLoad=true
ak=""
sk=""

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
enableBrokerLoad=true
ak=""
sk=""

// jdbc connector test config
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
// See `docker/thirdparties/start-thirdparties-docker.sh`
enableJdbcTest=false
mysql_57_port=3316
pg_14_port=5442

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
enableJdbcTest=false
mysql_57_port=3316
pg_14_port=5442

// hive catalog test config
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
// See `docker/thirdparties/start-thirdparties-docker.sh`
enableHiveTest=false
hms_port=9183
hdfs_port=8120

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
enableHiveTest=false
hms_port=9183
hdfs_port=8120

// elasticsearch catalog test config
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
enableEsTest=false
es_6_port=19200
es_7_port=29200
es_8_port=39200

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/conf/regression-conf.groovy`
#### Snippet
```java
es_6_port=19200
es_7_port=29200
es_8_port=39200

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/load/insert/test_array_insert.groovy`
#### Snippet
```java
    }
    
    def create_test_table01 = {testTabley ->
        
        def result1 = sql """
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/load/insert/test_array_insert.groovy`
#### Snippet
```java
    }

    def create_test_table02 = {testTablez ->
        def result1 = sql """
            CREATE TABLE IF NOT EXISTS ${testTable02} (
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/demo_p0/thread_action.groovy`
#### Snippet
```java

suite("thread_action") {
    def (_, elapsedMillis) = timer {
        /**
         * the default max thread num is 10, you can specify by 'actionParallel' param.
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/export/test_array_export.groovy`
#### Snippet
```java
    }
    
    def export_to_hdfs = {exportTable, exportLable, hdfsPath, exportFormat, BrokerName, HdfsUserName, HdfsPasswd->
        sql """ EXPORT TABLE ${exportTable} 
                TO "${hdfsPath}" 
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/export/test_array_export.groovy`
#### Snippet
```java
    }

    def select_out_file = {exportTable, HdfsPath, outFormat, BrokerName, HdfsUserName, HdfsPasswd->
        sql """
            SELECT * FROM ${exportTable}
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/export/test_array_export.groovy`
#### Snippet
```java
    }
    
    def check_export_result = {checklabel->
        max_try_milli_secs = 15000
        while(max_try_milli_secs) {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/export/test_array_export.groovy`
#### Snippet
```java
    }

    def check_download_result={resultlist, expectedTotalRows->
        int totalLines = 0
        for(String oneFile :resultlist) {
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/load_p0/stream_load/load_json_null_to_nullable.groovy`
#### Snippet
```java
        }

        def result1 = sql """
            CREATE TABLE IF NOT EXISTS ${testTable} (
              `k1` CHAR NULL COMMENT "",
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/load_p0/stream_load/load_json_with_jsonpath.groovy`
#### Snippet
```java
        }

        def result1 = sql """
            CREATE TABLE IF NOT EXISTS ${testTable} (
              `k1` INT NULL COMMENT "",
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/load_p0/stream_load/load_json_column_exclude_schema_without_jsonpath.groovy`
#### Snippet
```java
        }

        def result1 = sql """
            CREATE TABLE IF NOT EXISTS ${testTable} (
              k1 TINYINT NULL,
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/load_p0/broker_load/test_array_load.groovy`
#### Snippet
```java
    }

    def create_test_table01 = {testTablex ->
        def result1 = sql """
            CREATE TABLE IF NOT EXISTS ${testTable01} (
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/load_p0/broker_load/test_array_load.groovy`
#### Snippet
```java
    }

    def load_from_hdfs1 = {testTablex, label, hdfsFilePath, format, brokerName, hdfsUser, hdfsPasswd ->
        def result1= sql """
                        LOAD LABEL ${label} (
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/load_p0/broker_load/test_array_load.groovy`
#### Snippet
```java
        def hdfs_orc_file_path = uploadToHdfs "broker_load/simple_array.orc"
        // orc file with native array(list) type
        def hdfs_orc_file_path2 = uploadToHdfs "broker_load/simple_array_list_type.orc"
        def hdfs_parquet_file_path = uploadToHdfs "broker_load/simple_array.parquet"
 
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/load_p0/broker_load/test_array_load.groovy`
#### Snippet
```java
        // orc file with native array(list) type
        def hdfs_orc_file_path2 = uploadToHdfs "broker_load/simple_array_list_type.orc"
        def hdfs_parquet_file_path = uploadToHdfs "broker_load/simple_array.parquet"
 
        // case5: import array data by hdfs and enable vectorized engine
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/load_p0/stream_load/test_json_load.groovy`
#### Snippet
```java
    }

    def create_test_table2 = {testTablex ->
        // multi-line sql
        def result1 = sql """
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/load_p0/stream_load/test_json_load.groovy`
#### Snippet
```java

    // city is NOT NULL
    def create_test_table3 = {testTablex ->
        // multi-line sql
        def result1 = sql """
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/load_p0/stream_load/test_json_load.groovy`
#### Snippet
```java
    }

    def test_invalid_json_array_table = { testTablex ->
        // multi-line sql
        def result1 = sql """
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/load_p0/stream_load/test_json_load.groovy`
#### Snippet
```java
    }
    
    def load_from_hdfs2 = {testTablex, label, hdfsFilePath, format, brokerName, hdfsUser, hdfsPasswd ->
        def result1= sql """
                        LOAD LABEL ${label} (
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/query_p0/union/test_union.groovy`
#### Snippet
```java
    def res1 = sql"""select cast(1 as decimal), cast(2 as double) union distinct select 1.0, 2.0 
             union distinct (select 1.00000000, 2.00000) order by 1, 2"""
    def res2 = sql"""select cast(1 as decimal), cast(2 as decimal) union distinct select 1.0, 2.0 
             union distinct (select 1.00000000, 2.00000) order by 1, 2"""

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/delete_p0/test_delete_where_in.groovy`
#### Snippet
```java

        //delete test
        def test_1 = sql """ DELETE FROM test_1 where k1 in (1,3000,2500,900,13); """
        def count_1= qt_sql """select count(*) from ${tb_name}"""
        logger.info("delete_1 : ${count_1}")
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/account_p0/test_information_schema.groovy`
#### Snippet
```java
// under the License.
suite("test_information_schema") {
    def dbPrefix = "db_test_schema_"
    def tablePrefix = "tb_test_schema_"

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/account_p0/test_information_schema.groovy`
#### Snippet
```java
suite("test_information_schema") {
    def dbPrefix = "db_test_schema_"
    def tablePrefix = "tb_test_schema_"

    // create lots of dbs and tables to make rows in `information_schema.columns` more than 1024
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/account_p0/test_nereids_authentication.groovy`
#### Snippet
```java
    }
    assertEquals(result.size(), 0)
    connect(user=user, password='123456', url=url) {
        sql "SELECT * FROM ${tableName1}, ${tableName2} WHERE ${tableName1}.`key` = ${tableName2}.`key`"
    }
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/account_p0/test_nereids_authentication.groovy`
#### Snippet
```java
    }
    assertEquals(result.size(), 0)
    connect(user=user, password='123456', url=url) {
        sql "SELECT * FROM ${tableName1}, ${tableName2} WHERE ${tableName1}.`key` = ${tableName2}.`key`"
    }
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/account_p0/test_alter_user.groovy`
#### Snippet
```java
    sql """set password for 'test_auth_user2' = password('12345')"""
    
    def result1 = connect(user = 'test_auth_user2', password = '12345', url = context.config.jdbcUrl) {
        sql 'select 1'
    }
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/account_p0/test_alter_user.groovy`
#### Snippet
```java
         
    // login success in multi times
    result1 = connect(user = 'test_auth_user3', password = '12345', url = context.config.jdbcUrl) {
        sql 'select 1'
    }
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/account_p0/test_alter_user.groovy`
#### Snippet
```java

    sql """set password for 'test_auth_user3' = password('Ab1234567^')"""
    result1 = connect(user = 'test_auth_user3', password = 'Ab1234567^', url = context.config.jdbcUrl) {
        sql 'select 1'
    }
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/data_model_p0/unique/test_unique_table_debug_data.groovy`
#### Snippet
```java
    String[][] backends = sql """ show backends; """
    assertTrue(backends.size() > 0)
    StringBuilder sbCommand = new StringBuilder();

    sql "insert into ${tbName} values(1,1),(2,1);"
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/csv_header_p0/test_csv_with_header.groovy`
#### Snippet
```java

    sql "DROP TABLE IF EXISTS ${testTable}"
    def result1 = sql """
            CREATE TABLE IF NOT EXISTS `${testTable}` (
                `event_day` date NULL COMMENT "",
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/primary_index/test_pk_uk_case.groovy`
#### Snippet
```java

    Random rd = new Random()
    def order_key = rd.nextInt(1000)
    def part_key = rd.nextInt(1000)
    def sub_key = 13
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/primary_index/test_pk_uk_case.groovy`
#### Snippet
```java
    Random rd = new Random()
    def order_key = rd.nextInt(1000)
    def part_key = rd.nextInt(1000)
    def sub_key = 13
    def line_num = 29
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/primary_index/test_pk_uk_case.groovy`
#### Snippet
```java
    def order_key = rd.nextInt(1000)
    def part_key = rd.nextInt(1000)
    def sub_key = 13
    def line_num = 29
    def decimal = rd.nextFloat()
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/primary_index/test_pk_uk_case.groovy`
#### Snippet
```java
    def part_key = rd.nextInt(1000)
    def sub_key = 13
    def line_num = 29
    def decimal = rd.nextFloat()
    def city = RandomStringUtils.randomAlphabetic(10)
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/primary_index/test_pk_uk_case.groovy`
#### Snippet
```java
    def sub_key = 13
    def line_num = 29
    def decimal = rd.nextFloat()
    def city = RandomStringUtils.randomAlphabetic(10)
    def name = UUID.randomUUID().toString()
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/primary_index/test_pk_uk_case.groovy`
#### Snippet
```java
    def line_num = 29
    def decimal = rd.nextFloat()
    def city = RandomStringUtils.randomAlphabetic(10)
    def name = UUID.randomUUID().toString()
    def date = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now())
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/primary_index/test_pk_uk_case.groovy`
#### Snippet
```java
    def decimal = rd.nextFloat()
    def city = RandomStringUtils.randomAlphabetic(10)
    def name = UUID.randomUUID().toString()
    def date = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now())
    for (int idx = 0; idx < 50; idx++) {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/primary_index/test_pk_uk_case.groovy`
#### Snippet
```java
    def city = RandomStringUtils.randomAlphabetic(10)
    def name = UUID.randomUUID().toString()
    def date = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now())
    for (int idx = 0; idx < 50; idx++) {
        order_key = rd.nextInt(10)
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/correctness_p0/table_valued_function/test_hdfs_tvf.groovy`
#### Snippet
```java
    def format = "csv"
    def defaultFS = "hdfs://127.0.0.1:${hdfs_port}"
    def uri = ""

    String enabled = context.config.otherConfigs.get("enableHiveTest")
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/correctness_p0/table_valued_function/test_hdfs_tvf.groovy`
#### Snippet
```java

            uri = "${defaultFS}" + "/user/doris/csv_format_test/array_malformat.csv"
            format = "csv"
            qt_csv_array_malformat """ select * from HDFS(
                                        "URI" = "${uri}",
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/correctness_p0/table_valued_function/test_hdfs_tvf.groovy`
#### Snippet
```java

            uri = "${defaultFS}" + "/user/doris/csv_format_test/array_normal.csv"
            format = "csv"
            qt_csv_array_normal """ select * from HDFS("URI" = "${uri}",
                                    "fs.defaultFS"= "${defaultFS}",
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/schema_change_p0/test_agg_vals_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/schema_change_p0/test_dup_mv_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/schema_change_p0/test_dup_vals_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/schema_change_p0/test_agg_keys_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/schema_change_p0/test_uniq_keys_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/schema_change_p0/test_dup_keys_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/schema_change_p0/test_uniq_rollup_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/schema_change_p0/test_uniq_vals_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/schema_change_p0/test_uniq_mv_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/schema_change_p0/test_agg_mv_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/schema_change_p0/test_agg_rollup_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/schema_change_p0/test_dup_rollup_schema_change.groovy`
#### Snippet
```java
        assert configList instanceof List

        boolean disableAutoCompaction = true
        for (Object ele in (List) configList) {
            assert ele instanceof List<String>
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/external_catalog_p0/hive/test_hive_orc.groovy`
#### Snippet
```java
            int code = process1.waitFor()
            assertEquals(code, 0)
            def process2 = command2.execute()
            code = process1.waitFor()
            assertEquals(code, 0)
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/external_catalog_p0/hive/test_hive_parquet.groovy`
#### Snippet
```java
            int code = process1.waitFor()
            assertEquals(code, 0)
            def process2 = command2.execute()
            code = process1.waitFor()
            assertEquals(code, 0)
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/show.groovy`
#### Snippet
```java

    if (!storage_exist.call("showPolicy_1_policy")){
        def create_s3_resource = try_sql """
            CREATE RESOURCE "showPolicy_1_resource"
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/use_policy/create_table_use_partition_policy.groovy`
#### Snippet
```java

    if (!storage_exist.call("test_create_table_partition_use_policy_1")) {
        def create_s3_resource = try_sql """
            CREATE RESOURCE "test_create_table_partition_use_resource_1"
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/use_policy/create_table_use_partition_policy.groovy`
#### Snippet
```java
            );
        """
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY test_create_table_partition_use_policy_1
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/use_policy/create_table_use_partition_policy.groovy`
#### Snippet
```java

    if (!storage_exist.call("test_create_table_partition_use_policy_2")) {
        def create_s3_resource = try_sql """
            CREATE RESOURCE "test_create_table_partition_use_resource_2"
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/use_policy/create_table_use_partition_policy.groovy`
#### Snippet
```java
            );
        """
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY test_create_table_partition_use_policy_2
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/drop.groovy`
#### Snippet
```java
        """

        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY drop_policy_test
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/use_policy/create_table_use_policy.groovy`
#### Snippet
```java

    if (!storage_exist.call("test_create_table_use_policy")) {
        def create_s3_resource = try_sql """
            CREATE RESOURCE "test_create_table_use_resource"
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/use_policy/create_table_use_policy.groovy`
#### Snippet
```java
            );
        """
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY test_create_table_use_policy
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

    // support
    def alter_result_succ_1 = try_sql """
        ALTER RESOURCE "has_resouce_policy_alter" PROPERTIES("s3_max_connections" = "1111");
    """
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java
    """

    def alter_result_succ_2 = try_sql """
        ALTER RESOURCE "has_resouce_policy_alter" PROPERTIES("s3_connection_timeout_ms" = "2222");
    """
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java
    """

    def alter_result_succ_5 = try_sql """
        ALTER RESOURCE "has_resouce_policy_alter" PROPERTIES("s3_secret_key" = "5555");
    """
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java
    """

    def alter_result_succ_6 = try_sql """
        ALTER RESOURCE "has_resouce_policy_alter" PROPERTIES("s3_access_key" = "6666");
    """
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java
    """

    def alter_result_succ_7 = try_sql """
        ALTER RESOURCE "has_resouce_policy_alter" PROPERTIES("s3_request_timeout_ms" = "7777");
    """
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

    // errCode = 2, detailMessage = current not support modify property : s3_region
    def alter_result_fail_1 = try_sql """
        ALTER RESOURCE "has_resouce_policy_alter" PROPERTIES("s3_region" = "8888");
    """
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

    // errCode = 2, detailMessage = current not support modify property : s3_bucket
    def alter_result_fail_2 = try_sql """
        ALTER RESOURCE "has_resouce_policy_alter" PROPERTIES("s3_bucket" = "9999");
    """
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

    // errCode = 2, detailMessage = current not support modify property : s3_root_path
    def alter_result_fail_3 = try_sql """
        ALTER RESOURCE "has_resouce_policy_alter" PROPERTIES("s3_root_path" = "10101010");
    """
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

    // errCode = 2, detailMessage = current not support modify property : s3_endpoint
    def alter_result_fail_4 = try_sql """
        ALTER RESOURCE "has_resouce_policy_alter" PROPERTIES("s3_endpoint" = "11111111");
    """
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

    if (!storage_exist.call("has_test_policy_to_alter")) {
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY has_test_policy_to_alter
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

    // OK
    def alter_result_sql_succ_ttl = try_sql """
        ALTER STORAGE POLICY has_test_policy_to_alter PROPERTIES("cooldown_ttl" = "10000");
    """
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

    // OK
    def alter_result_sql_succ_datetime = try_sql """
        ALTER STORAGE POLICY has_test_policy_to_alter PROPERTIES("cooldown_datetime" = "2023-06-08 00:00:00");
    """
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

    if (!storage_exist.call("has_test_policy_to_alter_1")) {
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY has_test_policy_to_alter_1
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/alter.groovy`
#### Snippet
```java

    // go to check be?fe log about notify alter.
    def alter_result_succ_again = try_sql """
        ALTER RESOURCE "has_resouce_policy_alter" PROPERTIES("s3_access_key" = "akakak");
    """
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/use_policy/alter_table_add_policy.groovy`
#### Snippet
```java

    if (!storage_exist.call("created_create_table_alter_policy")) {
        def create_s3_resource = try_sql """
            CREATE RESOURCE "test_create_alter_table_use_resource"
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/use_policy/alter_table_add_policy.groovy`
#### Snippet
```java
            );
        """
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY created_create_table_alter_policy
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/use_policy/alter_table_add_policy.groovy`
#### Snippet
```java

    if (!storage_exist.call("created_create_table_alter_policy_1")) {
        def create_s3_resource = try_sql """
            CREATE RESOURCE "test_create_alter_table_use_resource_1"
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/use_policy/alter_table_add_policy.groovy`
#### Snippet
```java
            );
        """
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY created_create_table_alter_policy_1
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/use_policy/alter_table_add_policy.groovy`
#### Snippet
```java
    // you can change created_create_table_alter_policy's policy cooldown time, cooldown ttl property,
    // by alter storage policy
    def modify_storage_policy_property_result = try_sql """
        ALTER STORAGE POLICY "created_create_table_alter_policy_1" PROPERTIES("cooldown_datetime" = "2026-06-08 00:00:00");
    """
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/use_policy/alter_table_add_policy.groovy`
#### Snippet
```java
    """
    // change s3 resource, ak?sk by alter resource
    def modify_storage_policy_property_result_1 = try_sql """
        ALTER RESOURCE "test_create_alter_table_use_resource_1" PROPERTIES("s3_access_key" = "has_been_changed");
    """
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/use_policy/modify_partition_add_policy.groovy`
#### Snippet
```java

    if (!storage_exist.call("created_create_table_partition_alter_policy")) {
        def create_s3_resource = try_sql """
            CREATE RESOURCE "test_modify_partition_table_use_resource"
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/use_policy/modify_partition_add_policy.groovy`
#### Snippet
```java
            );
        """
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY created_create_table_partition_alter_policy
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/use_policy/use_default_storage_policy.groovy`
#### Snippet
```java
        assertEquals(create_table_use_default_policy_but_not_set_default_policy_result, null);

        def create_s3_resource = try_sql """
            CREATE RESOURCE "default_s3_resource"
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/use_policy/use_default_storage_policy.groovy`
#### Snippet
```java
            );
        """
        def create_succ_1 = try_sql """
            ALTER STORAGE POLICY default_storage_policy PROPERTIES(
                "storage_resource" = "default_s3_resource",
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/use_policy/use_default_storage_policy.groovy`
#### Snippet
```java
    // you can change default_storage_policy's policy property, such as ak?sk,
    // so table create_table_not_have_policy will use s3_access_key = "has_been_changed"
    def modify_storage_policy_property_result_1 = try_sql """
        ALTER RESOURCE "default_s3_resource" PROPERTIES("s3_access_key" = "has_been_changed");
    """
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/create.groovy`
#### Snippet
```java

    if (!storage_exist.call("testPolicy_10")) {
        def create_s3_resource = try_sql """
            CREATE RESOURCE "testPolicy_10_resource"
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/create.groovy`
#### Snippet
```java

    if (!storage_exist.call("testPolicy_11")) {
        def create_s3_resource = try_sql """
            CREATE RESOURCE "testPolicy_11_resource"
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/create.groovy`
#### Snippet
```java

    if (!storage_exist.call("testPolicy_12")) {
        def create_s3_resource = try_sql """
            CREATE RESOURCE "testPolicy_12_resource"
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/create.groovy`
#### Snippet
```java

    if (!storage_exist.call("testPolicy_13")) {
        def create_s3_resource = try_sql """
            CREATE RESOURCE "testPolicy_13_resource"
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/create.groovy`
#### Snippet
```java

    if (!storage_exist.call("testPolicy_14")) {
        def create_s3_resource = try_sql """
            CREATE RESOURCE "testPolicy_14_resource"
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/suites/cold_heat_separation/policy/create.groovy`
#### Snippet
```java

    if (!storage_exist.call("testPolicy_15")) {
        def create_succ_1 = try_sql """
            CREATE STORAGE POLICY testPolicy_15
            PROPERTIES(
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java

// **Note**: default db will be create if not exist
defaultDb = "regression_test"

jdbcUrl = "jdbc:mysql://172.19.0.2:9132/?useLocalSessionState=true"
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
defaultDb = "regression_test"

jdbcUrl = "jdbc:mysql://172.19.0.2:9132/?useLocalSessionState=true"
jdbcUser = "root"
jdbcPassword = ""
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java

jdbcUrl = "jdbc:mysql://172.19.0.2:9132/?useLocalSessionState=true"
jdbcUser = "root"
jdbcPassword = ""

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
jdbcUrl = "jdbc:mysql://172.19.0.2:9132/?useLocalSessionState=true"
jdbcUser = "root"
jdbcPassword = ""

feHttpAddress = "172.19.0.2:8132"
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
jdbcPassword = ""

feHttpAddress = "172.19.0.2:8132"
feHttpUser = "root"
feHttpPassword = ""
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java

feHttpAddress = "172.19.0.2:8132"
feHttpUser = "root"
feHttpPassword = ""

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java

// **Note**: default db will be create if not exist
defaultDb = "regression_test"

jdbcUrl = "jdbc:mysql://172.19.0.2:9131/?useLocalSessionState=true"
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
defaultDb = "regression_test"

jdbcUrl = "jdbc:mysql://172.19.0.2:9131/?useLocalSessionState=true"
jdbcUser = "root"
jdbcPassword = ""
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java

jdbcUrl = "jdbc:mysql://172.19.0.2:9131/?useLocalSessionState=true"
jdbcUser = "root"
jdbcPassword = ""

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
jdbcUrl = "jdbc:mysql://172.19.0.2:9131/?useLocalSessionState=true"
jdbcUser = "root"
jdbcPassword = ""

feHttpAddress = "172.19.0.2:8131"
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
jdbcPassword = ""

feHttpAddress = "172.19.0.2:8131"
feHttpUser = "root"
feHttpPassword = ""
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java

feHttpAddress = "172.19.0.2:8131"
feHttpUser = "root"
feHttpPassword = ""

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
feHttpAddress = "172.19.0.2:8131"
feHttpUser = "root"
feHttpPassword = ""

// set DORIS_HOME by system properties
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
testSuites = ""
// empty directories will test all directories
testDirectories = ""

// this groups will not be executed
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java

// this groups will not be executed
excludeGroups = ""
// this suites will not be executed
excludeSuites = ""
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
excludeGroups = ""
// this suites will not be executed
excludeSuites = ""
// this directories will not be executed
excludeDirectories = ""
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
excludeSuites = ""
// this directories will not be executed
excludeDirectories = ""

customConf1 = "test_custom_conf_value"
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
excludeDirectories = ""

customConf1 = "test_custom_conf_value"

// for test csv with header
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java

// for test csv with header
enableHdfs=false // set to true if hdfs is ready
hdfsFs = "hdfs://127.0.0.1:9000"
hdfsUser = "doris-test"
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
hdfsFs = "hdfs://127.0.0.1:9000"
hdfsUser = "doris-test"
hdfsPasswd = ""
brokerName = "broker_name"

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
hdfsUser = "doris-test"
hdfsPasswd = ""
brokerName = "broker_name"

// broker load test config
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java

// broker load test config
enableBrokerLoad=false

// jdbc connector test config
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
// See `docker/thirdparties/start-thirdparties-docker.sh`
enableJdbcTest=false
mysql_57_port=7111
pg_14_port=7121

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
enableJdbcTest=false
mysql_57_port=7111
pg_14_port=7121

// hive catalog test config
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
// To enable jdbc test, you need first start hive container.
// See `docker/thirdparties/start-thirdparties-docker.sh`
enableHiveTest=false
hms_port=7141

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
// See `docker/thirdparties/start-thirdparties-docker.sh`
enableHiveTest=false
hms_port=7141

sf1DataPath = "/data"
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java
hms_port=7141

sf1DataPath = "/data"
cacheDataPath = "/data/regression/"

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p0/conf/regression-conf.groovy`
#### Snippet
```java

sf1DataPath = "/data"
cacheDataPath = "/data/regression/"

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
feHttpAddress = "172.19.0.2:8132"
feHttpUser = "root"
feHttpPassword = ""

beHttpAddress = "172.19.0.2:8142"
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
feHttpPassword = ""

beHttpAddress = "172.19.0.2:8142"

// set DORIS_HOME by system properties
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
// set DORIS_HOME by system properties
// e.g. java -DDORIS_HOME=./
suitePath = "${DORIS_HOME}/regression-test/suites"
dataPath = "${DORIS_HOME}/regression-test/data"
sf1DataPath = "/data"
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
// e.g. java -DDORIS_HOME=./
suitePath = "${DORIS_HOME}/regression-test/suites"
dataPath = "${DORIS_HOME}/regression-test/data"
sf1DataPath = "/data"

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
suitePath = "${DORIS_HOME}/regression-test/suites"
dataPath = "${DORIS_HOME}/regression-test/data"
sf1DataPath = "/data"

// will test <group>/<suite>.groovy
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
testGroups = ""
// empty suite will test all suite
testSuites = ""

cacheDataPath="/data/regression/"
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/pipeline/p1/conf/regression-conf.groovy`
#### Snippet
```java
testSuites = ""

cacheDataPath="/data/regression/"

```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/util/SqlUtils.groovy`
#### Snippet
```java

            parser.getInterpreter().setPredictionMode(PredictionMode.LL)
            tree = parserFunction.apply(parser)
        } finally {
            clearDFAIfNecessary(lexer, parser)
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/suite/SuiteContext.groovy`
#### Snippet
```java
        def path = new File(config.suitePath).relativePath(file)
        def realPath = new File(config.suitePath).relativePath(file)
        def sf1DataPath = config.sf1DataPath
        def outputRelativePath = path.substring(0, path.lastIndexOf(".")) + ".out"
        def realOutputRelativePath = path.substring(0, realPath.lastIndexOf(".")) + ".out"
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/RestoreAction.groovy`
#### Snippet
```java

    private void restore() {
        List<List<Object>> showTablesRes = null
        ResultSetMetaData meta = null

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/RestoreAction.groovy`
#### Snippet
```java
    private void restore() {
        List<List<Object>> showTablesRes = null
        ResultSetMetaData meta = null

        if (CollectionUtils.isEmpty(tables)) {
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/RestoreAction.groovy`
#### Snippet
```java
SHOW RESTORE FROM `${getRealDbName()}`
"""
        List<List<Object>> result = null
        ResultSetMetaData meta = null

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/RestoreAction.groovy`
#### Snippet
```java
"""
        List<List<Object>> result = null
        ResultSetMetaData meta = null

        while (true) {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/RestoreAction.groovy`
#### Snippet
```java

        while (true) {
            (result, meta) = JdbcUtils.executeToList(context.conn, showRestoreSql)
            if (!result.empty && result[result.size() - 1].size() >= 5) {
                def status = result[result.size() - 1][4].toString()
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/StreamLoadAction.groovy`
#### Snippet
```java
        this.password = context.config.feHttpPassword

        def groupList = context.group.split(',')
        this.db = context.config.getDbNameByFile(context.file)

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/action/StreamLoadAction.groovy`
#### Snippet
```java

    private HttpEntity prepareHttpEntity(CloseableHttpClient client) {
        HttpEntity entity = null
        if (inputStream != null) {
            entity = new InputStreamEntity(inputStream)
```

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
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

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/suite/Suite.groovy`
#### Snippet
```java

        if (context.config.generateOutputFile || context.config.forceGenerateOutputFile) {
            def (result, meta) = JdbcUtils.executeToStringList(context.getConnection(), sql)
            if (isOrder) {
                result = sortByToString(result)
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `regression-test/framework/src/main/groovy/org/apache/doris/regression/suite/Suite.groovy`
#### Snippet
```java
            realWriter.write(realResultsIter, tag)

            String errorMsg = null
            try {
                errorMsg = OutputUtils.checkOutput(expectCsvResults, realResults.iterator(),
```

## RuleId[ruleID=GroovyUnnecessaryContinue]
### RuleId[ruleID=GroovyUnnecessaryContinue]
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

