# dekaf 
 
# Bad smells
I found 815 bad smells with 17 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| KotlinAnnotator | 395 | false |
| WrongPackageStatement | 70 | false |
| FunctionName | 69 | false |
| MissortedModifiers | 25 | false |
| RedundantFieldInitialization | 24 | false |
| NonExceptionNameEndsWithException | 24 | false |
| UnusedSymbol | 23 | false |
| ReturnNull | 22 | false |
| ConvertSecondaryConstructorToPrimary | 16 | false |
| RedundantSuppression | 16 | false |
| NullableProblems | 13 | false |
| UnnecessaryFullyQualifiedName | 13 | false |
| MemberVisibilityCanBePrivate | 13 | false |
| RedundantNullableReturnType | 10 | false |
| ReplaceJavaStaticMethodWithKotlinAnalog | 9 | false |
| RemoveExplicitTypeArguments | 8 | false |
| UtilityClassWithoutPrivateConstructor | 7 | true |
| DataFlowIssue | 4 | false |
| AbstractClassNeverImplemented | 4 | false |
| PackageDirectoryMismatch | 4 | false |
| ZeroLengthArrayInitialization | 4 | false |
| MoveVariableDeclarationIntoWhen | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| RedundantVisibilityModifier | 3 | false |
| NonProtectedConstructorInAbstractClass | 3 | true |
| SizeReplaceableByIsEmpty | 2 | true |
| BoundedWildcard | 2 | false |
| LiftReturnOrAssignment | 2 | false |
| RedundantSemicolon | 2 | false |
| ConvertTryFinallyToUseCall | 2 | false |
| EmptyMethod | 2 | false |
| GroovyUnusedAssignment | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| UnnecessarySemicolon | 1 | false |
| CascadeIf | 1 | false |
| KotlinRedundantDiagnosticSuppress | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| SortModifiers | 1 | false |
| ReplacePutWithAssignment | 1 | false |
| SystemOutErr | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| NestedAssignment | 1 | false |
| UnusedReceiverParameter | 1 | false |
| UnnecessaryVariable | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UseCompareMethod | 1 | false |
| ConstantValue | 1 | false |
| CanBeVal | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Integer\[b.size()\]'
in `dekaf-inter/src/utils/Version.java`
#### Snippet
```java
    if (b.size() == 1 && b.get(0) == 0) return ZERO;

    return of(b.toArray(new Integer[b.size()]));
  }

```

## RuleId[ruleID=MoveVariableDeclarationIntoWhen]
### MoveVariableDeclarationIntoWhen
Variable declaration could be moved into 'when'
in `dekaf-main/src/settings/SettingsLoader.kt`
#### Snippet
```java
            var i = 1
            while (i < n - 1) {
                val c = str[i++]
                when (c) {
                    '\\' -> {
```

### MoveVariableDeclarationIntoWhen
Variable declaration could be moved into 'when'
in `dekaf-main/src/settings/SettingsLoader.kt`
#### Snippet
```java
                when (c) {
                    '\\' -> {
                        val x = str[i++]
                        val cx =
                                when (x) {
```

### MoveVariableDeclarationIntoWhen
Variable declaration could be moved into 'when'
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java
        }

        val obj = get(name1)
        when (obj) {
            null               -> {
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `DekafInfo` has only 'static' members, and lacks a 'private' constructor
in `dekaf-inter/src/DekafInfo.java`
#### Snippet
```java
 * Brief information.
 */
public class DekafInfo {

  public static final Version VERSION = Version.of(3, 0, 0, -30);
```

### UtilityClassWithoutPrivateConstructor
Class `ArrayHacks` has only 'static' members, and lacks a 'private' constructor
in `dekaf-inter/src/utils/ArrayHacks.java`
#### Snippet
```java


public final class ArrayHacks {

    @SuppressWarnings("unchecked")
```

### UtilityClassWithoutPrivateConstructor
Class `JdbcStuff` has only 'static' members, and lacks a 'private' constructor
in `dekaf-jdbc/src/impl/JdbcStuff.java`
#### Snippet
```java


public final class JdbcStuff {

    public static void closeIt(@NotNull AutoCloseable closeable) {
```

### UtilityClassWithoutPrivateConstructor
Class `JdbcParametersHandler` has only 'static' members, and lacks a 'private' constructor
in `dekaf-jdbc/src/impl/JdbcParametersHandler.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 */
class JdbcParametersHandler {

  static void assignValueByItsType(@NotNull final PreparedStatement stmt,
```

### UtilityClassWithoutPrivateConstructor
Class `JdbcRowsCollectors` has only 'static' members, and lacks a 'private' constructor
in `dekaf-jdbc/src/impl/JdbcRowsCollectors.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 */
public class JdbcRowsCollectors {


```

### UtilityClassWithoutPrivateConstructor
Class `JdbcRowFetchers` has only 'static' members, and lacks a 'private' constructor
in `dekaf-jdbc/src/impl/JdbcRowFetchers.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 */
public class JdbcRowFetchers {


```

### UtilityClassWithoutPrivateConstructor
Class `JdbcValueGetters` has only 'static' members, and lacks a 'private' constructor
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 */
public final class JdbcValueGetters {


```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dekaf-inter/src/common/ParamType.java`
#### Snippet
```java
    paramCLOB      (),
    paramBLOB      (),
    paramRefCursor ();
    // @formatter:on

```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Method invocation `createStatement` may produce `NullPointerException`
in `dekaf-jdbc/src/impl/JdbcSession.java`
#### Snippet
```java
    protected Statement createSimpleStatement() {
        try {
            return connection.createStatement();
        }
        catch (SQLException e) {
```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `dekaf-jdbc/src/impl/JdbcColumnCursor.java`
#### Snippet
```java
            boolean ok = rset.next();
            if (ok) {
                C value = getter.getValue(rset, 1);
                C[] result = createArray(cellClass, 1);
                result[0] = value;
```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `dekaf-jdbc/src/impl/JdbcColumnCursor.java`
#### Snippet
```java
                boolean ok = rset.next();
                if (!ok) break;
                C value = getter.getValue(rset, 1);
                if (array == null) array = createArray(cellClass, portionSize);
                array[k++] = value;
```

### DataFlowIssue
@Nullable method 'lookForArrayGetter' always returns a non-null value
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java
  }

  @Nullable
  protected static <W> JdbcValueGetter<W> lookForArrayGetter(@NotNull final Class<W> clazz) {
    return new ArrayGetter<W>(clazz);
```

## RuleId[ruleID=RemoveExplicitTypeArguments]
### RemoveExplicitTypeArguments
Remove explicit type arguments
in `dekaf-main/src/queries/Layouts.kt`
#### Snippet
```java

fun<R:Any, B> layTableListOf(rowLayout: RowLayout<R,B>): QueryLayout<List<R>> =
        QueryTableLayout(ListTableLayout<R,B>(), rowLayout)

fun<R:Any, B> layTableArrayOf(rowLayout: RowLayout<R,B>): QueryLayout<Array<R>> =
```

### RemoveExplicitTypeArguments
Remove explicit type arguments
in `dekaf-main/src/queries/Layouts.kt`
#### Snippet
```java

fun<R:Any, B> layTableIteratorOf(rowLayout: RowLayout<R,B>): QueryLayout<Iterator<R>> =
        QueryTableLayout(IterateTableLayout<R,B>(), rowLayout)


```

### RemoveExplicitTypeArguments
Remove explicit type arguments
in `dekaf-main/src/queries/Layouts.kt`
#### Snippet
```java

fun<R:Any, B> layTableArrayOf(rowLayout: RowLayout<R,B>): QueryLayout<Array<R>> =
        QueryTableLayout(ArrayTableLayout<R,B>(), rowLayout)

fun<R:Any, B> layTableStreamOf(rowLayout: RowLayout<R,B>): QueryLayout<Stream<R>> =
```

### RemoveExplicitTypeArguments
Remove explicit type arguments
in `dekaf-main/src/queries/Layouts.kt`
#### Snippet
```java

fun<R:Any, B> layTableStreamOf(rowLayout: RowLayout<R,B>): QueryLayout<Stream<R>> =
        QueryTableLayout(StreamTableLayout<R,B>(), rowLayout)

fun<R:Any, B> layTableIteratorOf(rowLayout: RowLayout<R,B>): QueryLayout<Iterator<R>> =
```

### RemoveExplicitTypeArguments
Remove explicit type arguments
in `dekaf-main/src/settings/SettingsFun.kt`
#### Snippet
```java
    val n = pairs.size
    if (n == 0) return Settings.empty
    val a = Array<Setting>(n) {  index ->
        val p = pairs[index]
        Setting(p.first, p.second)
```

### RemoveExplicitTypeArguments
Remove explicit type arguments
in `dekaf-main/src/settings/SettingsLoader.kt`
#### Snippet
```java
    fun load(text: CharSequence): Settings {
        val builder = SettingsBuilder()
        val simReader = SimplextTextReader<SettingsBuilder?>(builder, ::handleLine)
        prepareSimplextReader(simReader)
        simReader.processText(text)
```

### RemoveExplicitTypeArguments
Remove explicit type arguments
in `dekaf-main/src/settings/SettingsLoader.kt`
#### Snippet
```java
            val parts = str.split('.')
            val n = parts.size
            return Array<String>(n) { i -> parts[i].trim() }
        }

```

### RemoveExplicitTypeArguments
Remove explicit type arguments
in `dekaf-main/src/settings/SettingsLoader.kt`
#### Snippet
```java
    fun load(file: Path): Settings {
        val builder = SettingsBuilder()
        val simReader = SimplextFileReader<SettingsBuilder?>(builder, ::handleLine)
        prepareSimplextReader(simReader)
        simReader.processFile(file)
```

## RuleId[ruleID=CascadeIf]
### CascadeIf
Cascade 'if' should be replaced with 'when'
in `dekaf-main/src/settings/SettingsLoader.kt`
#### Snippet
```java
                val path = decodeNamePath(pathStr)
                val value = parentBuilder[path]
                if (value == null) {
                    val innerBuilder = SettingsBuilder()
                    parentBuilder[path] = innerBuilder
```

## RuleId[ruleID=KotlinRedundantDiagnosticSuppress]
### KotlinRedundantDiagnosticSuppress
Redundant suppression
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
@file:Suppress("platform_class_mapped_to_kotlin", "RemoveRedundantQualifierName")

package org.jetbrains.dekaf.jdbcTest.impl
```

## RuleId[ruleID=FunctionName]
### FunctionName
Function name `equals_viaObject` should not contain underscores
in `dekaf-inter-test/tests/settings/SettingTest.kt`
#### Snippet
```java

    @Test
    fun equals_viaObject() {
        val setting1 = Setting("theName", "theValue")
        val setting2 = Setting("the" + "Name", "the" + "Value")
```

### FunctionName
Function name `equals_basic` should not contain underscores
in `dekaf-inter-test/tests/settings/SettingTest.kt`
#### Snippet
```java

    @Test
    fun equals_basic() {
        val setting1 = Setting("theName", "theValue")
        val setting2 = Setting("the" + "Name", "the" + "Value")
```

### FunctionName
Function name `arrayClass_basic` should not contain underscores
in `dekaf-inter-test/tests/utils/ArrayHacksTest.kt`
#### Snippet
```java

    @Test
    fun arrayClass_basic() {
        val a: Array<String> = arrayOf("S")
        val c = arrayClass(a)
```

### FunctionName
Function name `importStringList_lines_basic` should not contain underscores
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java

    @Test
    fun importStringList_lines_basic() {
        val text = "einz\nzwei\ndrei\nvier\n"
        val list = importStringList(text)
```

### FunctionName
Function name `escapeJavaString_dontChangeGoodString` should not contain underscores
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java

    @Test
    fun escapeJavaString_dontChangeGoodString() {
        val goodString = "Just a good string"
        expect that escapeJavaString(goodString) sameAs goodString
```

### FunctionName
Function name `importStringList_CSV_trim` should not contain underscores
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java

    @Test
    fun importStringList_CSV_trim() {
        val text = "  einz , \t zwei , drei , vier  "
        val list = importStringList(text)
```

### FunctionName
Function name `importStringList_lines_trim` should not contain underscores
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java

    @Test
    fun importStringList_lines_trim() {
        val text = "einz  \n   zwei \n drei \n  vier"
        val list = importStringList(text)
```

### FunctionName
Function name `importStringList_lines_doubleLineBreaks` should not contain underscores
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java

    @Test
    fun importStringList_lines_doubleLineBreaks() {
        val text = "einz  \n \n   zwei \n drei \n \n vier"
        val list = importStringList(text)
```

### FunctionName
Function name `importStringList_empty` should not contain underscores
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java

    @Test
    fun importStringList_empty() {
        val list = importStringList(" \t \n  ")
        expect that list iz empty
```

### FunctionName
Function name `importStringList_CSV_basic` should not contain underscores
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java

    @Test
    fun importStringList_CSV_basic() {
        val text = "einz,zwei,drei,vier"
        val list = importStringList(text)
```

### FunctionName
Function name `importStringList_combineCommasAndLines` should not contain underscores
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java

    @Test
    fun importStringList_combineCommasAndLines() {
        val text = "einz, zwei, drei\n vier, fünf\n "
        val list = importStringList(text)
```

### FunctionName
Function name `escapeJavaString_basic` should not contain underscores
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java

    @Test
    fun escapeJavaString_basic() {
        expect that escapeJavaString("x\ny\nz") equalsTo """x\ny\nz"""
        expect that escapeJavaString("x\ny\nz") equalsTo """x\ny\nz"""
```

### FunctionName
Function name `get_byIndex` should not contain underscores
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java

    @Test
    fun get_byIndex() {
        val settings = Settings(Setting("name1", "value A"),
                                Setting("name2", "value B"),
```

### FunctionName
Function name `iterator_basic` should not contain underscores
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java

    @Test
    fun iterator_basic() {
        val s1 = Setting("name1", "value A")
        val s2 = Setting("name2", "value B")
```

### FunctionName
Function name `get_byName_12` should not contain underscores
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java

    @Test
    fun get_byName_12() {
        doTestByName(12)
    }
```

### FunctionName
Function name `toText_plain` should not contain underscores
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java

    @Test
    fun toText_plain() {
        val settings = Settings.of("name1", "value A",
                                   "name2", "value B",
```

### FunctionName
Function name `get_byName_44` should not contain underscores
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java

    @Test
    fun get_byName_44() {
        doTestByName(44)
    }
```

### FunctionName
Function name `get_byName_3` should not contain underscores
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java

    @Test
    fun get_byName_3() {
        val settings = Settings(Setting("name1", "value A"),
                                Setting("name2", "value B"),
```

### FunctionName
Function name `toText_nested` should not contain underscores
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java

    @Test
    fun toText_nested() {
        val settings2 = Settings.of("name1", "value A",
                                    "name2", "value B",
```

### FunctionName
Function name `init_basic` should not contain underscores
in `dekaf-jdbc-test/tests/impl/JdbcFacadeTest.kt`
#### Snippet
```java

    @Test @Order(1)
    fun init_basic() {
        val facade = factory.createFacade()
        facade.init(memH2Settings)
```

### FunctionName
Function name `autocommit_afterTransaction` should not contain underscores
in `dekaf-jdbc-test/tests/impl/JdbcSessionTest.kt`
#### Snippet
```java

    @Test
    fun autocommit_afterTransaction() {
        val ses = facade.openSession()
        try {
```

### FunctionName
Function name `autocommit_byDefault` should not contain underscores
in `dekaf-jdbc-test/tests/impl/JdbcSessionTest.kt`
#### Snippet
```java

    @Test
    fun autocommit_byDefault() {
        val ses = facade.openSession()
        try {
```

### FunctionName
Function name `tran_beginAndRollback` should not contain underscores
in `dekaf-jdbc-test/tests/impl/JdbcSessionTest.kt`
#### Snippet
```java

    @Test
    fun tran_beginAndRollback() {
        expect that session.isInTransaction equalsTo false

```

### FunctionName
Function name `tran_beginAndCommit` should not contain underscores
in `dekaf-jdbc-test/tests/impl/JdbcSessionTest.kt`
#### Snippet
```java

    @Test
    fun tran_beginAndCommit() {
        expect that session.isInTransaction equalsTo false

```

### FunctionName
Function name `basic_insert_1` should not contain underscores
in `dekaf-jdbc-test/tests/impl/JdbcSeanceTest.kt`
#### Snippet
```java

    @Test @Order(2)
    fun basic_insert_1() {
        val stmtText = "insert into Basic_Table (B,C,V) values (?,?,?)"
        session.openSeance().use { seance ->
```

### FunctionName
Function name `affectedRows_3` should not contain underscores
in `dekaf-jdbc-test/tests/impl/JdbcSeanceTest.kt`
#### Snippet
```java

    @Test @Order(12)
    fun affectedRows_3() {
        val text = "insert into Basic_Table (B,C,V) values (1,'A','Aa'), (2,'B','Bb'), (3,'C','Cc')"
        var affectedRows = -1
```

### FunctionName
Function name `affectedRows_1` should not contain underscores
in `dekaf-jdbc-test/tests/impl/JdbcSeanceTest.kt`
#### Snippet
```java

    @Test @Order(11)
    fun affectedRows_1() {
        val text = "insert into Basic_Table (B,C,V) values (1,'A','Aa')"
        var affectedRows = -1
```

### FunctionName
Function name `affectedRows_0` should not contain underscores
in `dekaf-jdbc-test/tests/impl/JdbcSeanceTest.kt`
#### Snippet
```java

    @Test @Order(10)
    fun affectedRows_0() {
        val text = "update Basic_Table set B = -99 where 1 is null"
        var affectedRows = -1
```

### FunctionName
Function name `basic_insert_3` should not contain underscores
in `dekaf-jdbc-test/tests/impl/JdbcSeanceTest.kt`
#### Snippet
```java

    @Test @Order(3)
    fun basic_insert_3() {
        val stmtText = "insert into Basic_Table (B,C,V) values (?,?,?)"
        session.openSeance().use { seance ->
```

### FunctionName
Function name `session_ping` should not contain underscores
in `dekaf-main-test/src/DbMasterTest.kt`
#### Snippet
```java

    @Test @Order(3)
    fun session_ping() {
        val facade = DbMaster.open(H2memSettings)

```

### FunctionName
Function name `connect_disconnect` should not contain underscores
in `dekaf-main-test/src/DbMasterTest.kt`
#### Snippet
```java

    @Test @Order(2)
    fun connect_disconnect() {
        val facade = DbMaster.open(H2memSettings)

```

### FunctionName
Function name `basic_perform_inTransaction` should not contain underscores
in `dekaf-main-test/src/base/BaseSessionTest.kt`
#### Snippet
```java

    @Test @Order(3)
    fun basic_perform_inTransaction() {
        dbf.inTransaction { transaction ->
            transaction.perform("call 2*2")
```

### FunctionName
Function name `basic_perform_beyondTransaction` should not contain underscores
in `dekaf-main-test/src/base/BaseSessionTest.kt`
#### Snippet
```java

    @Test @Order(2)
    fun basic_perform_beyondTransaction() {
        dbf.inSession { session ->
            session.perform("call 2*2")
```

### FunctionName
Function name `basic_ping` should not contain underscores
in `dekaf-main-test/src/base/BaseSessionTest.kt`
#### Snippet
```java

    @Test @Order(1)
    fun basic_ping() {
        dbf.inSession { session ->
            session.ping()
```

### FunctionName
Function name `basic_commit` should not contain underscores
in `dekaf-main-test/src/base/BaseTransactionTest.kt`
#### Snippet
```java

    @Test @Order(1)
    fun basic_commit() {
        dbf.inSession { session ->

```

### FunctionName
Function name `mass_session_open_ping_close` should not contain underscores
in `dekaf-main-test/src/base/BaseFacadeTest.kt`
#### Snippet
```java

    @Test @Order(31)
    fun mass_session_open_ping_close() {
        expect that dbf.countActiveSessions() iz zero

```

### FunctionName
Function name `basic_session_open_ping_close` should not contain underscores
in `dekaf-main-test/src/base/BaseFacadeTest.kt`
#### Snippet
```java

    @Test @Order(1)
    fun basic_session_open_ping_close() {
        expect that dbf.countActiveSessions() iz zero

```

### FunctionName
Function name `interFactory_exists` should not contain underscores
in `dekaf-main-test/src/base/FactoryLoaderTest.kt`
#### Snippet
```java

    @Test
    fun interFactory_exists() {
        val f = FactoryLoader.selectInterServiceFactory(Settings.empty)
        expect that f.javaClass.name equalsTo "org.jetbrains.dekaf.jdbc.impl.JdbcServiceFactory"
```

### FunctionName
Function name `releaseBroken_basic` should not contain underscores
in `dekaf-main-test/src/pool/ServicePoolTest.kt`
#### Snippet
```java

    @Test
    fun releaseBroken_basic() {
        val pool = TestPool()

```

### FunctionName
Function name `borrowAndRelease_massThrottlingRotating` should not contain underscores
in `dekaf-main-test/src/pool/ServicePoolTest.kt`
#### Snippet
```java

    @Test
    fun borrowAndRelease_massThrottlingRotating() {
        val pool = TestPool()
        pool.setup(maxServices = 5, rotating = true)
```

### FunctionName
Function name `borrowAndRelease_massThrottling` should not contain underscores
in `dekaf-main-test/src/pool/ServicePoolTest.kt`
#### Snippet
```java

    @Test
    fun borrowAndRelease_massThrottling() {
        val pool = TestPool()
        pool.setup(maxServices = 5, rotating = false)
```

### FunctionName
Function name `populate_basic` should not contain underscores
in `dekaf-main-test/src/pool/ServicePoolTest.kt`
#### Snippet
```java

    @Test
    fun populate_basic() {
        val pool = TestPool()
        pool.setup(minServices = 3, maxServices = 10)
```

### FunctionName
Function name `borrowAndRelease_mass` should not contain underscores
in `dekaf-main-test/src/pool/ServicePoolTest.kt`
#### Snippet
```java

    @Test
    fun borrowAndRelease_mass() {
        val pool = TestPool()

```

### FunctionName
Function name `borrowAndRelease_basic` should not contain underscores
in `dekaf-main-test/src/pool/ServicePoolTest.kt`
#### Snippet
```java

    @Test
    fun borrowAndRelease_basic() {
        val pool = TestPool()

```

### FunctionName
Function name `populate_inChaos` should not contain underscores
in `dekaf-main-test/src/pool/ServicePoolTest.kt`
#### Snippet
```java

    @Test
    fun populate_inChaos() {
        val pool = TestPool()
        pool.setup(minServices = 5, maxServices = 10, rotating = false)
```

### FunctionName
Function name `populate_exact` should not contain underscores
in `dekaf-main-test/src/pool/ServicePoolTest.kt`
#### Snippet
```java

    @Test
    fun populate_exact() {
        val pool = TestPool()
        pool.setup(minServices = 3, maxServices = 3)
```

### FunctionName
Function name `releaseBroken_replacement` should not contain underscores
in `dekaf-main-test/src/pool/ServicePoolTest.kt`
#### Snippet
```java

    @Test
    fun releaseBroken_replacement() {
        val pool = TestPool()
        pool.setup(minServices = 1, maxServices = 1, waitingTime = 10_000L)
```

### FunctionName
Function name `queryArrayOfArrayOfMandatoryNumber_empty` should not contain underscores
in `dekaf-main-test/src/queries/QueryLayoutTest.kt`
#### Snippet
```java

    @Test @Order(3)
    fun queryArrayOfArrayOfMandatoryNumber_empty() {
        val queryText = "$query4x4\nwhere 1 is null"
        val query: Query<Array<Array<out Number>>> =
```

### FunctionName
Function name `nestSettings_basic` should not contain underscores
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java

    @Test
    fun nestSettings_basic() {
        val b = SettingsBuilder()
        b.put("A" to 1)
```

### FunctionName
Function name `set_byPath_1` should not contain underscores
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java

    @Test
    fun set_byPath_1() {
        val b = SettingsBuilder()
        val path = arrayOf("name")
```

### FunctionName
Function name `get_basic2` should not contain underscores
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java

    @Test
    fun get_basic2() {
        val b = SettingsBuilder()
        b.put("First" to 11L)
```

### FunctionName
Function name `get_byPath_3` should not contain underscores
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java

    @Test
    fun get_byPath_3() {
        val inner = SettingsBuilder()
        inner["second"] = Settings(Setting("third", "theSuperValue"))
```

### FunctionName
Function name `get_byPath_2_innerIsSettingsBuilder` should not contain underscores
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java

    @Test
    fun get_byPath_2_innerIsSettingsBuilder() {
        val inner = SettingsBuilder()
        inner["second"] = "theValue"
```

### FunctionName
Function name `set_byPath_2` should not contain underscores
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java

    @Test
    fun set_byPath_2() {
        val b = SettingsBuilder()
        val path1 = arrayOf("animal", "cat")
```

### FunctionName
Function name `empty_afterRemove` should not contain underscores
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java

    @Test
    fun empty_afterRemove() {
        val b = SettingsBuilder()
        b.put("First" to 1)
```

### FunctionName
Function name `get_basic1` should not contain underscores
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java

    @Test
    fun get_basic1() {
        val b = SettingsBuilder()
        b.put("First" to 11L)
```

### FunctionName
Function name `get_byPath_2_innerIsSettings` should not contain underscores
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java

    @Test
    fun get_byPath_2_innerIsSettings() {
        val b = SettingsBuilder()
        b["first"] = Settings(Setting("second", "theValue"))
```

### FunctionName
Function name `nestSettingsBuilder_basic` should not contain underscores
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java

    @Test
    fun nestSettingsBuilder_basic() {
        val inner = SettingsBuilder()
        inner.put("B11" to 11)
```

### FunctionName
Function name `get_byPath_1` should not contain underscores
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java

    @Test
    fun get_byPath_1() {
        val b = SettingsBuilder()
        b["first"] = "simpleValue"
```

### FunctionName
Function name `nest_basic` should not contain underscores
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java

    @Test
    fun nest_basic() {
        val text =
                """|animal:
```

### FunctionName
Function name `simple_level2` should not contain underscores
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java

    @Test
    fun simple_level2() {
        val text =
                """|animal.cat = meow   
```

### FunctionName
Function name `quotes_baisc` should not contain underscores
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java

    @Test
    fun quotes_baisc() {
        val text =
                """|single = ' in single quotes '
```

### FunctionName
Function name `plain_commentsAtEnd` should not contain underscores
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java

    @Test
    fun plain_commentsAtEnd() {
        val text =
                """|cat = meow    // comment 1
```

### FunctionName
Function name `nest_path_path` should not contain underscores
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java

    @Test
    fun nest_path_path() {
        val text =
                """|live.animal:
```

### FunctionName
Function name `quotes_escapeQuotes` should not contain underscores
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java

    @Test
    fun quotes_escapeQuotes() {
        val text =
                """|single = ' in \'single\' quotes '
```

### FunctionName
Function name `nest_path` should not contain underscores
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java

    @Test
    fun nest_path() {
        val text =
                """|live.animal:
```

### FunctionName
Function name `plain_commentsBetween` should not contain underscores
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java

    @Test
    fun plain_commentsBetween() {
        val text =
                """|// comment 1
```

### FunctionName
Function name `nest_repeat` should not contain underscores
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java

    @Test
    fun nest_repeat() {
        val text =
                """|animal:
```

### FunctionName
Function name `quotes_escapeSpecialCharacters` should not contain underscores
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java

    @Test
    fun quotes_escapeSpecialCharacters() {
        val text =
                """|name = " text with \t and \r\n "
```

## RuleId[ruleID=KotlinAnnotator]
### KotlinAnnotator
Unresolved reference: inter
in `dekaf-inter-test/tests/settings/SettingTest.kt`
#### Snippet
```java
import lb.yaka.expectations.*
import lb.yaka.gears.*
import org.jetbrains.dekaf.inter.settings.Setting
import org.jetbrains.dekaf.test.utils.UnitTest
import org.junit.jupiter.api.Test
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-inter-test/tests/settings/SettingTest.kt`
#### Snippet
```java
    @Test
    fun equals_viaObject() {
        val setting1 = Setting("theName", "theValue")
        val setting2 = Setting("the" + "Name", "the" + "Value")

```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-inter-test/tests/settings/SettingTest.kt`
#### Snippet
```java
    fun equals_viaObject() {
        val setting1 = Setting("theName", "theValue")
        val setting2 = Setting("the" + "Name", "the" + "Value")

        expect that Objects.equals(setting1, setting2) iz true
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-inter-test/tests/settings/SettingTest.kt`
#### Snippet
```java
    @Test
    fun equals_basic() {
        val setting1 = Setting("theName", "theValue")
        val setting2 = Setting("the" + "Name", "the" + "Value")

```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-inter-test/tests/settings/SettingTest.kt`
#### Snippet
```java
    fun equals_basic() {
        val setting1 = Setting("theName", "theValue")
        val setting2 = Setting("the" + "Name", "the" + "Value")

        expect that (setting1.equals(setting2)) iz true
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-inter-test/tests/settings/SettingTest.kt`
#### Snippet
```java
        expect that (setting1.equals(setting2)) iz true
        expect that (setting1 == setting2) iz true
        expect that setting1 equalsTo setting2
    }

```

### KotlinAnnotator
Unresolved reference: ArrayHacks
in `dekaf-inter-test/tests/utils/ArrayHacksTest.kt`
#### Snippet
```java
    @Test
    fun createMatrix() {
        val m: Array<Array<String>> = ArrayHacks.createArray(String::class.java, 5, 3)
        m[0][0] = "0:0"
        m[0][2] = "0:2"
```

### KotlinAnnotator
Unresolved reference: arrayClass
in `dekaf-inter-test/tests/utils/ArrayHacksTest.kt`
#### Snippet
```java
    fun arrayClass_basic() {
        val a: Array<String> = arrayOf("S")
        val c = arrayClass(a)
        expect that c.isArray equalsTo true
        expect that c.componentType equalsTo java.lang.String::class.java
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-inter-test/tests/utils/ArrayHacksTest.kt`
#### Snippet
```java
import lb.yaka.expectations.equalsTo
import lb.yaka.gears.expect
import org.jetbrains.dekaf.inter.utils.ArrayHacks
import org.jetbrains.dekaf.inter.utils.ArrayHacks.arrayClass
import org.jetbrains.dekaf.test.utils.UnitTest
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-inter-test/tests/utils/ArrayHacksTest.kt`
#### Snippet
```java
import lb.yaka.gears.expect
import org.jetbrains.dekaf.inter.utils.ArrayHacks
import org.jetbrains.dekaf.inter.utils.ArrayHacks.arrayClass
import org.jetbrains.dekaf.test.utils.UnitTest
import org.junit.jupiter.api.Test
```

### KotlinAnnotator
Unresolved reference: importStringList
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java
    fun importStringList_lines_basic() {
        val text = "einz\nzwei\ndrei\nvier\n"
        val list = importStringList(text)
        expect that list containsExactly listOf("einz", "zwei", "drei", "vier")
    }
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java
        val text = "einz\nzwei\ndrei\nvier\n"
        val list = importStringList(text)
        expect that list containsExactly listOf("einz", "zwei", "drei", "vier")
    }

```

### KotlinAnnotator
Unresolved reference: escapeJavaString
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java
    fun escapeJavaString_dontChangeGoodString() {
        val goodString = "Just a good string"
        expect that escapeJavaString(goodString) sameAs goodString
    }

```

### KotlinAnnotator
Unresolved reference: importStringList
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java
    fun importStringList_CSV_trim() {
        val text = "  einz , \t zwei , drei , vier  "
        val list = importStringList(text)
        expect that list containsExactly listOf("einz", "zwei", "drei", "vier")
    }
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java
        val text = "  einz , \t zwei , drei , vier  "
        val list = importStringList(text)
        expect that list containsExactly listOf("einz", "zwei", "drei", "vier")
    }

```

### KotlinAnnotator
Unresolved reference: importStringList
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java
    fun importStringList_lines_trim() {
        val text = "einz  \n   zwei \n drei \n  vier"
        val list = importStringList(text)
        expect that list containsExactly listOf("einz", "zwei", "drei", "vier")
    }
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java
        val text = "einz  \n   zwei \n drei \n  vier"
        val list = importStringList(text)
        expect that list containsExactly listOf("einz", "zwei", "drei", "vier")
    }

```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java
import lb.yaka.gears.empty
import lb.yaka.gears.expect
import org.jetbrains.dekaf.inter.utils.SimpleStringConvert.*
import org.jetbrains.dekaf.test.utils.UnitTest
import org.junit.jupiter.api.Test
```

### KotlinAnnotator
Unresolved reference: importStringList
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java
    fun importStringList_lines_doubleLineBreaks() {
        val text = "einz  \n \n   zwei \n drei \n \n vier"
        val list = importStringList(text)
        expect that list containsExactly listOf("einz", "zwei", "drei", "vier")
    }
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java
        val text = "einz  \n \n   zwei \n drei \n \n vier"
        val list = importStringList(text)
        expect that list containsExactly listOf("einz", "zwei", "drei", "vier")
    }

```

### KotlinAnnotator
Unresolved reference: importStringList
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java
    @Test
    fun importStringList_empty() {
        val list = importStringList(" \t \n  ")
        expect that list iz empty
    }
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java
    fun importStringList_empty() {
        val list = importStringList(" \t \n  ")
        expect that list iz empty
    }

```

### KotlinAnnotator
Unresolved reference: importStringList
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java
    fun importStringList_CSV_basic() {
        val text = "einz,zwei,drei,vier"
        val list = importStringList(text)
        expect that list containsExactly listOf("einz", "zwei", "drei", "vier")
    }
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java
        val text = "einz,zwei,drei,vier"
        val list = importStringList(text)
        expect that list containsExactly listOf("einz", "zwei", "drei", "vier")
    }

```

### KotlinAnnotator
Unresolved reference: importStringList
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java
    fun importStringList_combineCommasAndLines() {
        val text = "einz, zwei, drei\n vier, fünf\n "
        val list = importStringList(text)
        expect that list containsExactly listOf("einz", "zwei", "drei", "vier", "fünf")
    }
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java
        val text = "einz, zwei, drei\n vier, fünf\n "
        val list = importStringList(text)
        expect that list containsExactly listOf("einz", "zwei", "drei", "vier", "fünf")
    }

```

### KotlinAnnotator
Unresolved reference: escapeJavaString
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java
    @Test
    fun escapeJavaString_basic() {
        expect that escapeJavaString("x\ny\nz") equalsTo """x\ny\nz"""
        expect that escapeJavaString("x\ny\nz") equalsTo """x\ny\nz"""
        expect that escapeJavaString("x\r\ny\r\nz") equalsTo """x\r\ny\r\nz"""
```

### KotlinAnnotator
Unresolved reference: escapeJavaString
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java
    fun escapeJavaString_basic() {
        expect that escapeJavaString("x\ny\nz") equalsTo """x\ny\nz"""
        expect that escapeJavaString("x\ny\nz") equalsTo """x\ny\nz"""
        expect that escapeJavaString("x\r\ny\r\nz") equalsTo """x\r\ny\r\nz"""
        expect that escapeJavaString("x\ty\bz") equalsTo """x\ty\bz"""
```

### KotlinAnnotator
Unresolved reference: escapeJavaString
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java
        expect that escapeJavaString("x\ny\nz") equalsTo """x\ny\nz"""
        expect that escapeJavaString("x\ny\nz") equalsTo """x\ny\nz"""
        expect that escapeJavaString("x\r\ny\r\nz") equalsTo """x\r\ny\r\nz"""
        expect that escapeJavaString("x\ty\bz") equalsTo """x\ty\bz"""
    }
```

### KotlinAnnotator
Unresolved reference: escapeJavaString
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java
        expect that escapeJavaString("x\ny\nz") equalsTo """x\ny\nz"""
        expect that escapeJavaString("x\r\ny\r\nz") equalsTo """x\r\ny\r\nz"""
        expect that escapeJavaString("x\ty\bz") equalsTo """x\ty\bz"""
    }

```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
    @Test
    fun get_byIndex() {
        val settings = Settings(Setting("name1", "value A"),
                                Setting("name2", "value B"),
                                Setting("name3", "value C"))
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
    @Test
    fun get_byIndex() {
        val settings = Settings(Setting("name1", "value A"),
                                Setting("name2", "value B"),
                                Setting("name3", "value C"))
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
    fun get_byIndex() {
        val settings = Settings(Setting("name1", "value A"),
                                Setting("name2", "value B"),
                                Setting("name3", "value C"))
        expect that settings.getEntry(0) equalsTo Setting("name1", "value A")
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
        val settings = Settings(Setting("name1", "value A"),
                                Setting("name2", "value B"),
                                Setting("name3", "value C"))
        expect that settings.getEntry(0) equalsTo Setting("name1", "value A")
        expect that settings.getEntry(1) equalsTo Setting("name2", "value B")
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
                                Setting("name2", "value B"),
                                Setting("name3", "value C"))
        expect that settings.getEntry(0) equalsTo Setting("name1", "value A")
        expect that settings.getEntry(1) equalsTo Setting("name2", "value B")
        expect that settings.getEntry(2) equalsTo Setting("name3", "value C")
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
                                Setting("name3", "value C"))
        expect that settings.getEntry(0) equalsTo Setting("name1", "value A")
        expect that settings.getEntry(1) equalsTo Setting("name2", "value B")
        expect that settings.getEntry(2) equalsTo Setting("name3", "value C")
        expect that settings.size equalsTo 3
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
        expect that settings.getEntry(0) equalsTo Setting("name1", "value A")
        expect that settings.getEntry(1) equalsTo Setting("name2", "value B")
        expect that settings.getEntry(2) equalsTo Setting("name3", "value C")
        expect that settings.size equalsTo 3
    }
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
    @Test
    fun iterator_basic() {
        val s1 = Setting("name1", "value A")
        val s2 = Setting("name2", "value B")
        val s3 = Setting("name3", "value C")
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
    fun iterator_basic() {
        val s1 = Setting("name1", "value A")
        val s2 = Setting("name2", "value B")
        val s3 = Setting("name3", "value C")
        val settings = Settings(s1, s2, s3)
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
        val s1 = Setting("name1", "value A")
        val s2 = Setting("name2", "value B")
        val s3 = Setting("name3", "value C")
        val settings = Settings(s1, s2, s3)
        val it = settings.iterator()
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
        val s2 = Setting("name2", "value B")
        val s3 = Setting("name3", "value C")
        val settings = Settings(s1, s2, s3)
        val it = settings.iterator()
        expect that it.next() sameAs s1
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java

    private fun doTestByName(n: Int) {
        val entries = Array(n) { i -> Setting("name$i", "value $i") }
        val settings = Settings(*entries)
        for (i in 0 until n) {
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
    private fun doTestByName(n: Int) {
        val entries = Array(n) { i -> Setting("name$i", "value $i") }
        val settings = Settings(*entries)
        for (i in 0 until n) {
            expect that settings.getEntry("name$i") sameAs entries[i]
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
import lb.yaka.expectations.*
import lb.yaka.gears.*
import org.jetbrains.dekaf.inter.settings.Setting
import org.jetbrains.dekaf.inter.settings.Settings
import org.jetbrains.dekaf.test.utils.UnitTest
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
import lb.yaka.gears.*
import org.jetbrains.dekaf.inter.settings.Setting
import org.jetbrains.dekaf.inter.settings.Settings
import org.jetbrains.dekaf.test.utils.UnitTest
import org.junit.jupiter.api.Test
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
    @Test
    fun toText_plain() {
        val settings = Settings.of("name1", "value A",
                                   "name2", "value B",
                                   "name3", "value C")
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
                              |name3 = value C
                           """.trimMargin() + '\n'
        expect that text equalsTo expectedText
    }

```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
    @Test
    fun get_byName_3() {
        val settings = Settings(Setting("name1", "value A"),
                                Setting("name2", "value B"),
                                Setting("name3", "value C"))
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
    @Test
    fun get_byName_3() {
        val settings = Settings(Setting("name1", "value A"),
                                Setting("name2", "value B"),
                                Setting("name3", "value C"))
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
    fun get_byName_3() {
        val settings = Settings(Setting("name1", "value A"),
                                Setting("name2", "value B"),
                                Setting("name3", "value C"))
        expect that settings.getEntry("name1") equalsTo Setting("name1", "value A")
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
        val settings = Settings(Setting("name1", "value A"),
                                Setting("name2", "value B"),
                                Setting("name3", "value C"))
        expect that settings.getEntry("name1") equalsTo Setting("name1", "value A")
        expect that settings.getEntry("name2") equalsTo Setting("name2", "value B")
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
                                Setting("name2", "value B"),
                                Setting("name3", "value C"))
        expect that settings.getEntry("name1") equalsTo Setting("name1", "value A")
        expect that settings.getEntry("name2") equalsTo Setting("name2", "value B")
        expect that settings.getEntry("name3") equalsTo Setting("name3", "value C")
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
                                Setting("name3", "value C"))
        expect that settings.getEntry("name1") equalsTo Setting("name1", "value A")
        expect that settings.getEntry("name2") equalsTo Setting("name2", "value B")
        expect that settings.getEntry("name3") equalsTo Setting("name3", "value C")
    }
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
        expect that settings.getEntry("name1") equalsTo Setting("name1", "value A")
        expect that settings.getEntry("name2") equalsTo Setting("name2", "value B")
        expect that settings.getEntry("name3") equalsTo Setting("name3", "value C")
    }

```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
    @Test
    fun toText_nested() {
        val settings2 = Settings.of("name1", "value A",
                                    "name2", "value B",
                                    "name3", "value C")
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
                                    "name2", "value B",
                                    "name3", "value C")
        val settings1 = Settings.of("x", settings2,
                                    "y", "another value")
        val text = settings1.toText().toString()
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
                              |y = another value
                           """.trimMargin() + '\n'
        expect that text equalsTo expectedText
    }

```

### KotlinAnnotator
Unresolved reference: InterServiceFactory
in `dekaf-jdbc-test/tests/impl/JdbcServiceFactoryTest.kt`
#### Snippet
```java
    @Test
    fun serviceLoading() {
        val loader: ServiceLoader<InterServiceFactory> =
                ServiceLoader.load(InterServiceFactory::class.java)
        val list: List<ServiceLoader.Provider<InterServiceFactory>> =
```

### KotlinAnnotator
Unresolved reference: InterServiceFactory
in `dekaf-jdbc-test/tests/impl/JdbcServiceFactoryTest.kt`
#### Snippet
```java
    fun serviceLoading() {
        val loader: ServiceLoader<InterServiceFactory> =
                ServiceLoader.load(InterServiceFactory::class.java)
        val list: List<ServiceLoader.Provider<InterServiceFactory>> =
                loader.stream().collect(Collectors.toList())
```

### KotlinAnnotator
Unresolved reference: InterServiceFactory
in `dekaf-jdbc-test/tests/impl/JdbcServiceFactoryTest.kt`
#### Snippet
```java
        val loader: ServiceLoader<InterServiceFactory> =
                ServiceLoader.load(InterServiceFactory::class.java)
        val list: List<ServiceLoader.Provider<InterServiceFactory>> =
                loader.stream().collect(Collectors.toList())

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcServiceFactoryTest.kt`
#### Snippet
```java
        val factory = list.first().get()

        expect that factory isInstanceOf JdbcServiceFactory::class
    }

```

### KotlinAnnotator
Unresolved reference: JdbcServiceFactory
in `dekaf-jdbc-test/tests/impl/JdbcServiceFactoryTest.kt`
#### Snippet
```java
        val factory = list.first().get()

        expect that factory isInstanceOf JdbcServiceFactory::class
    }

```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-jdbc-test/tests/impl/JdbcServiceFactoryTest.kt`
#### Snippet
```java
import lb.yaka.gears.notEmpty
import lb.yaka.utils.isInstanceOf
import org.jetbrains.dekaf.inter.intf.InterServiceFactory
import org.jetbrains.dekaf.jdbc.impl.JdbcServiceFactory
import org.jetbrains.dekaf.test.utils.UnitTest
```

### KotlinAnnotator
Unresolved reference: jdbc
in `dekaf-jdbc-test/tests/impl/JdbcServiceFactoryTest.kt`
#### Snippet
```java
import lb.yaka.utils.isInstanceOf
import org.jetbrains.dekaf.inter.intf.InterServiceFactory
import org.jetbrains.dekaf.jdbc.impl.JdbcServiceFactory
import org.jetbrains.dekaf.test.utils.UnitTest
import org.junit.jupiter.api.Test
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-jdbc-test/tests/impl/JdbcFacadeTest.kt`
#### Snippet
```java
    companion object {
        val memH2Settings =
                Settings.of(
                        "driver", Settings.of("class", "org.h2.Driver"),
                        "jdbc", Settings.of("connection-string", "jdbc:h2:mem:test")
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-jdbc-test/tests/impl/JdbcFacadeTest.kt`
#### Snippet
```java
        val memH2Settings =
                Settings.of(
                        "driver", Settings.of("class", "org.h2.Driver"),
                        "jdbc", Settings.of("connection-string", "jdbc:h2:mem:test")
                )
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-jdbc-test/tests/impl/JdbcFacadeTest.kt`
#### Snippet
```java
                Settings.of(
                        "driver", Settings.of("class", "org.h2.Driver"),
                        "jdbc", Settings.of("connection-string", "jdbc:h2:mem:test")
                )
        val factory = JdbcServiceFactory()
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-jdbc-test/tests/impl/JdbcFacadeTest.kt`
#### Snippet
```java
import lb.yaka.expectations.zero
import lb.yaka.gears.expect
import org.jetbrains.dekaf.inter.settings.Settings
import org.jetbrains.dekaf.jdbc.impl.JdbcServiceFactory
import org.jetbrains.dekaf.test.utils.UnitTest
```

### KotlinAnnotator
Unresolved reference: jdbc
in `dekaf-jdbc-test/tests/impl/JdbcFacadeTest.kt`
#### Snippet
```java
import lb.yaka.gears.expect
import org.jetbrains.dekaf.inter.settings.Settings
import org.jetbrains.dekaf.jdbc.impl.JdbcServiceFactory
import org.jetbrains.dekaf.test.utils.UnitTest
import org.junit.jupiter.api.MethodOrderer
```

### KotlinAnnotator
Unresolved reference: JdbcServiceFactory
in `dekaf-jdbc-test/tests/impl/JdbcFacadeTest.kt`
#### Snippet
```java
                        "jdbc", Settings.of("connection-string", "jdbc:h2:mem:test")
                )
        val factory = JdbcServiceFactory()
    }

```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-jdbc-test/tests/impl/JdbcSeanceTest.kt`
#### Snippet
```java
import lb.yaka.expectations.zero
import lb.yaka.gears.expect
import org.jetbrains.dekaf.inter.common.StatementCategory.stmtUpdate
import org.jetbrains.dekaf.test.utils.*
import org.junit.jupiter.api.*
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcSeanceTest.kt`
#### Snippet
```java
    fun basic_insert_1() {
        val stmtText = "insert into Basic_Table (B,C,V) values (?,?,?)"
        session.openSeance().use { seance ->
            seance.prepare(stmtText, stmtUpdate, null)
            seance.execute(listOf(`1`, 'C', "The First Row"))
```

### KotlinAnnotator
Unresolved reference: stmtUpdate
in `dekaf-jdbc-test/tests/impl/JdbcSeanceTest.kt`
#### Snippet
```java
        val stmtText = "insert into Basic_Table (B,C,V) values (?,?,?)"
        session.openSeance().use { seance ->
            seance.prepare(stmtText, stmtUpdate, null)
            seance.execute(listOf(`1`, 'C', "The First Row"))
        }
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcSeanceTest.kt`
#### Snippet
```java
        val text = "insert into Basic_Table (B,C,V) values (1,'A','Aa'), (2,'B','Bb'), (3,'C','Cc')"
        var affectedRows = -1
        session.openSeance().use { seance ->
            seance.prepare(text, stmtUpdate, null)
            seance.execute(null)
```

### KotlinAnnotator
Unresolved reference: stmtUpdate
in `dekaf-jdbc-test/tests/impl/JdbcSeanceTest.kt`
#### Snippet
```java
        var affectedRows = -1
        session.openSeance().use { seance ->
            seance.prepare(text, stmtUpdate, null)
            seance.execute(null)
            affectedRows = seance.affectedRows
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcSeanceTest.kt`
#### Snippet
```java
        val text = "insert into Basic_Table (B,C,V) values (1,'A','Aa')"
        var affectedRows = -1
        session.openSeance().use { seance ->
            seance.prepare(text, stmtUpdate, null)
            seance.execute(null)
```

### KotlinAnnotator
Unresolved reference: stmtUpdate
in `dekaf-jdbc-test/tests/impl/JdbcSeanceTest.kt`
#### Snippet
```java
        var affectedRows = -1
        session.openSeance().use { seance ->
            seance.prepare(text, stmtUpdate, null)
            seance.execute(null)
            affectedRows = seance.affectedRows
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcSeanceTest.kt`
#### Snippet
```java
        val text = "update Basic_Table set B = -99 where 1 is null"
        var affectedRows = -1
        session.openSeance().use { seance ->
            seance.prepare(text, stmtUpdate, null)
            seance.execute(null)
```

### KotlinAnnotator
Unresolved reference: stmtUpdate
in `dekaf-jdbc-test/tests/impl/JdbcSeanceTest.kt`
#### Snippet
```java
        var affectedRows = -1
        session.openSeance().use { seance ->
            seance.prepare(text, stmtUpdate, null)
            seance.execute(null)
            affectedRows = seance.affectedRows
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcSeanceTest.kt`
#### Snippet
```java
    fun basic_insert_3() {
        val stmtText = "insert into Basic_Table (B,C,V) values (?,?,?)"
        session.openSeance().use { seance ->
            seance.prepare(stmtText, stmtUpdate, null)
            seance.execute(listOf(`7`, 'X', "Row X"))
```

### KotlinAnnotator
Unresolved reference: stmtUpdate
in `dekaf-jdbc-test/tests/impl/JdbcSeanceTest.kt`
#### Snippet
```java
        val stmtText = "insert into Basic_Table (B,C,V) values (?,?,?)"
        session.openSeance().use { seance ->
            seance.prepare(stmtText, stmtUpdate, null)
            seance.execute(listOf(`7`, 'X', "Row X"))
            seance.execute(listOf(`8`, 'Y', "Row Y"))
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
    fun closeAtTheEnd() {
        val text = "select value from table(value int = (1,2,3,4,5,6,7))"
        session.openSeance().use { seance ->
            seance.setPortionSize(5)
            seance.prepare(text, stmtQuery, null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
        session.openSeance().use { seance ->
            seance.setPortionSize(5)
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcColumnCursor<java.lang.Integer> = seance.makeColumnCursor(0, java.lang.Integer::class.java)
```

### KotlinAnnotator
Unresolved reference: JdbcColumnCursor
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcColumnCursor<java.lang.Integer> = seance.makeColumnCursor(0, java.lang.Integer::class.java)
            cursor.prepare()

```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
    fun fetchSingleNull() {
        val text = "select cast(null as bigint) as V"
        val r: Array<JavaLong?>? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
        val text = "select cast(null as bigint) as V"
        val r: Array<JavaLong?>? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcColumnCursor<JavaLong> = seance.makeColumnCursor(0, JavaLong::class.java)
```

### KotlinAnnotator
Unresolved reference: JdbcColumnCursor
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcColumnCursor<JavaLong> = seance.makeColumnCursor(0, JavaLong::class.java)
            cursor.prepare()
            cursor.fetchRow()
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
    fun fetchSingleValue() {
        val text = "select * from values (1000001, 'labuda')"
        val r: Array<JavaLong?>? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
        val text = "select * from values (1000001, 'labuda')"
        val r: Array<JavaLong?>? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcColumnCursor<JavaLong> = seance.makeColumnCursor(0, JavaLong::class.java)
```

### KotlinAnnotator
Unresolved reference: JdbcColumnCursor
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcColumnCursor<JavaLong> = seance.makeColumnCursor(0, JavaLong::class.java)
            cursor.prepare()
            cursor.fetchRow()
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
    fun fetchSingleEmpty() {
        val text = "select * from values (1) where 1 is null"
        val r: Array<JavaLong?>? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
        val text = "select * from values (1) where 1 is null"
        val r: Array<JavaLong?>? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcColumnCursor<JavaLong> = seance.makeColumnCursor(0, JavaLong::class.java)
```

### KotlinAnnotator
Unresolved reference: JdbcColumnCursor
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcColumnCursor<JavaLong> = seance.makeColumnCursor(0, JavaLong::class.java)
            cursor.prepare()
            cursor.fetchRow()
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
    fun fetchPortion() {
        val text = "select * from values (1000001, 'a'), (2000002, 'b'), (3000003, 'c')"
        val column = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
        val text = "select * from values (1000001, 'a'), (2000002, 'b'), (3000003, 'c')"
        val column = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcColumnCursor<JavaLong> = seance.makeColumnCursor(0, JavaLong::class.java)
```

### KotlinAnnotator
Unresolved reference: JdbcColumnCursor
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcColumnCursor<JavaLong> = seance.makeColumnCursor(0, JavaLong::class.java)
            cursor.prepare()
            cursor.fetchPortion()
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
        }

        expect that column iz notNull; column!!
        expect that column hasSize 3

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java

        expect that column iz notNull; column!!
        expect that column hasSize 3

        expect that column[0] equalsTo 1000001L
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
    fun portions() {
        val text = "select value from table(value int = (1,2,3,4,5,6,7,8,9,10,11,12))"
        session.openSeance().use { seance ->
            seance.setPortionSize(5)
            seance.prepare(text, stmtQuery, null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
        session.openSeance().use { seance ->
            seance.setPortionSize(5)
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcColumnCursor<java.lang.Integer> = seance.makeColumnCursor(0, java.lang.Integer::class.java)
```

### KotlinAnnotator
Unresolved reference: JdbcColumnCursor
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcColumnCursor<java.lang.Integer> = seance.makeColumnCursor(0, java.lang.Integer::class.java)
            cursor.prepare()

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
            val m1 = cursor.fetchPortion()

            expect that m1 iz notNull; m1!!
            expect that m1 hasSize 5

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java

            expect that m1 iz notNull; m1!!
            expect that m1 hasSize 5

            expect that m1[0] equalsTo 1
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
            val m2 = cursor.fetchPortion()

            expect that m2 iz notNull; m2!!
            expect that m2 hasSize 5

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java

            expect that m2 iz notNull; m2!!
            expect that m2 hasSize 5

            expect that m2[0] equalsTo 6
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
            val m3 = cursor.fetchPortion()

            expect that m3 iz notNull; m3!!
            expect that m3 hasSize 2

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java

            expect that m3 iz notNull; m3!!
            expect that m3 hasSize 2

            expect that m3[0] equalsTo 11
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
            val m4 = cursor.fetchPortion()

            expect that m4 iz Null
        }
    }
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
import lb.yaka.expectations.*
import lb.yaka.gears.*
import org.jetbrains.dekaf.inter.common.StatementCategory.stmtQuery
import org.jetbrains.dekaf.jdbc.impl.JdbcColumnCursor
import org.jetbrains.dekaf.jdbcTest.JavaLong
```

### KotlinAnnotator
Unresolved reference: jdbc
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
import lb.yaka.gears.*
import org.jetbrains.dekaf.inter.common.StatementCategory.stmtQuery
import org.jetbrains.dekaf.jdbc.impl.JdbcColumnCursor
import org.jetbrains.dekaf.jdbcTest.JavaLong
import org.junit.jupiter.api.MethodOrderer
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
    fun fetchPortion() {
        val text = "select * from values (1000001, 'a'), (2000002, 'b'), (3000003, 'c')"
        val column = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
        val text = "select * from values (1000001, 'a'), (2000002, 'b'), (3000003, 'c')"
        val column = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor = seance.makeLongsCursor(0)
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
        }

        expect that column iz notNull; column!!
        expect that column hasSize 3

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java

        expect that column iz notNull; column!!
        expect that column hasSize 3

        expect that column[0] equalsTo 1000001L
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
    fun fetchSingleValue() {
        val text = "select * from values (1000001, 'labuda')"
        val r: LongArray? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
        val text = "select * from values (1000001, 'labuda')"
        val r: LongArray? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor = seance.makeLongsCursor(0)
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
    fun portions() {
        val text = "select value from table(value int = (1,2,3,4,5,6,7,8,9,10,11,12))"
        session.openSeance().use { seance ->
            seance.setPortionSize(5)
            seance.prepare(text, stmtQuery, null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
        session.openSeance().use { seance ->
            seance.setPortionSize(5)
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor = seance.makeLongsCursor(0)
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
            val m1 = cursor.fetchPortion()

            expect that m1 iz notNull; m1!!
            expect that m1 hasSize 5

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java

            expect that m1 iz notNull; m1!!
            expect that m1 hasSize 5

            expect that m1[0] equalsTo 1L
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
            val m2 = cursor.fetchPortion()

            expect that m2 iz notNull; m2!!
            expect that m2 hasSize 5

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java

            expect that m2 iz notNull; m2!!
            expect that m2 hasSize 5

            expect that m2[0] equalsTo 6L
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
            val m3 = cursor.fetchPortion()

            expect that m3 iz notNull; m3!!
            expect that m3 hasSize 2

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java

            expect that m3 iz notNull; m3!!
            expect that m3 hasSize 2

            expect that m3[0] equalsTo 11L
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
            val m4 = cursor.fetchPortion()

            expect that m4 iz Null
        }
    }
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
    fun closeAtTheEnd() {
        val text = "select value from table(value int = (1,2,3,4,5,6,7))"
        session.openSeance().use { seance ->
            seance.setPortionSize(5)
            seance.prepare(text, stmtQuery, null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
        session.openSeance().use { seance ->
            seance.setPortionSize(5)
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcColumnCursor<java.lang.Integer> = seance.makeColumnCursor(0, java.lang.Integer::class.java)
```

### KotlinAnnotator
Unresolved reference: JdbcColumnCursor
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcColumnCursor<java.lang.Integer> = seance.makeColumnCursor(0, java.lang.Integer::class.java)
            cursor.prepare()

```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
    fun fetchSingleEmpty() {
        val text = "select * from values (1) where 1 is null"
        val r: LongArray? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
        val text = "select * from values (1) where 1 is null"
        val r: LongArray? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor = seance.makeLongsCursor(0)
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
import lb.yaka.expectations.*
import lb.yaka.gears.*
import org.jetbrains.dekaf.inter.common.StatementCategory.stmtQuery
import org.jetbrains.dekaf.jdbc.impl.JdbcColumnCursor
import org.junit.jupiter.api.MethodOrderer
```

### KotlinAnnotator
Unresolved reference: jdbc
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
import lb.yaka.gears.*
import org.jetbrains.dekaf.inter.common.StatementCategory.stmtQuery
import org.jetbrains.dekaf.jdbc.impl.JdbcColumnCursor
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
    fun fetchSingleNull() {
        val text = "select cast(null as bigint) as V"
        val r: LongArray? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
        val text = "select cast(null as bigint) as V"
        val r: LongArray? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor = seance.makeLongsCursor(0)
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
import lb.yaka.expectations.*
import lb.yaka.gears.*
import org.jetbrains.dekaf.inter.common.StatementCategory.stmtQuery
import org.jetbrains.dekaf.jdbc.impl.JdbcColumnCursor
import org.junit.jupiter.api.MethodOrderer
```

### KotlinAnnotator
Unresolved reference: jdbc
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
import lb.yaka.gears.*
import org.jetbrains.dekaf.inter.common.StatementCategory.stmtQuery
import org.jetbrains.dekaf.jdbc.impl.JdbcColumnCursor
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
    fun fetchSingleNull() {
        val text = "select cast(null as bigint) as V"
        val r: IntArray? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
        val text = "select cast(null as bigint) as V"
        val r: IntArray? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor = seance.makeIntsCursor(0)
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
    fun closeAtTheEnd() {
        val text = "select value from table(value int = (1,2,3,4,5,6,7))"
        session.openSeance().use { seance ->
            seance.setPortionSize(5)
            seance.prepare(text, stmtQuery, null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
        session.openSeance().use { seance ->
            seance.setPortionSize(5)
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcColumnCursor<java.lang.Integer> = seance.makeColumnCursor(0, java.lang.Integer::class.java)
```

### KotlinAnnotator
Unresolved reference: JdbcColumnCursor
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcColumnCursor<java.lang.Integer> = seance.makeColumnCursor(0, java.lang.Integer::class.java)
            cursor.prepare()

```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
    fun fetchSingleValue() {
        val text = "select * from values (1000001, 'labuda')"
        val r: IntArray? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
        val text = "select * from values (1000001, 'labuda')"
        val r: IntArray? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor = seance.makeIntsCursor(0)
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
    fun fetchSingleEmpty() {
        val text = "select * from values (1) where 1 is null"
        val r: IntArray? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
        val text = "select * from values (1) where 1 is null"
        val r: IntArray? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor = seance.makeIntsCursor(0)
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
    fun portions() {
        val text = "select value from table(value int = (1,2,3,4,5,6,7,8,9,10,11,12))"
        session.openSeance().use { seance ->
            seance.setPortionSize(5)
            seance.prepare(text, stmtQuery, null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
        session.openSeance().use { seance ->
            seance.setPortionSize(5)
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor = seance.makeIntsCursor(0)
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
            val m1 = cursor.fetchPortion()

            expect that m1 iz notNull; m1!!
            expect that m1 hasSize 5

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java

            expect that m1 iz notNull; m1!!
            expect that m1 hasSize 5

            expect that m1[0] equalsTo 1
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
            val m2 = cursor.fetchPortion()

            expect that m2 iz notNull; m2!!
            expect that m2 hasSize 5

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java

            expect that m2 iz notNull; m2!!
            expect that m2 hasSize 5

            expect that m2[0] equalsTo 6
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
            val m3 = cursor.fetchPortion()

            expect that m3 iz notNull; m3!!
            expect that m3 hasSize 2

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java

            expect that m3 iz notNull; m3!!
            expect that m3 hasSize 2

            expect that m3[0] equalsTo 11
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
            val m4 = cursor.fetchPortion()

            expect that m4 iz Null
        }
    }
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
    fun fetchPortion() {
        val text = "select * from values (1000001, 'a'), (2000002, 'b'), (3000003, 'c')"
        val column = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
        val text = "select * from values (1000001, 'a'), (2000002, 'b'), (3000003, 'c')"
        val column = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor = seance.makeIntsCursor(0)
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
        }

        expect that column iz notNull; column!!
        expect that column hasSize 3

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java

        expect that column iz notNull; column!!
        expect that column hasSize 3

        expect that column[0] equalsTo 1000001
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
    fun fetchRow() {
        val text = "select * from values (1, 1001, 1000001), (2, 2002, 2000002), (3, 3003, 3000003)"
        val r: Array<Number?>? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
        val text = "select * from values (1, 1001, 1000001), (2, 2002, 2000002), (3, 3003, 3000003)"
        val r: Array<Number?>? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcMatrixCursor<Number> = seance.makeMatrixCursor(0, Number::class.java)
```

### KotlinAnnotator
Unresolved reference: JdbcMatrixCursor
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcMatrixCursor<Number> = seance.makeMatrixCursor(0, Number::class.java)
            cursor.prepare(arrayOf<Class<out Number>>(JavaByte::class.java, JavaShort::class.java, JavaLong::class.java))
            cursor.fetchRow()
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
import lb.yaka.expectations.*
import lb.yaka.gears.*
import org.jetbrains.dekaf.inter.common.StatementCategory.stmtQuery
import org.jetbrains.dekaf.jdbc.impl.JdbcMatrixCursor
import org.jetbrains.dekaf.jdbcTest.JavaByte
```

### KotlinAnnotator
Unresolved reference: jdbc
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
import lb.yaka.gears.*
import org.jetbrains.dekaf.inter.common.StatementCategory.stmtQuery
import org.jetbrains.dekaf.jdbc.impl.JdbcMatrixCursor
import org.jetbrains.dekaf.jdbcTest.JavaByte
import org.jetbrains.dekaf.jdbcTest.JavaInt
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
    fun closeAtTheEnd() {
        val text = "select value from table(value int = (1,2,3,4,5,6,7))"
        session.openSeance().use { seance ->
            seance.setPortionSize(5)
            seance.prepare(text, stmtQuery, null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
        session.openSeance().use { seance ->
            seance.setPortionSize(5)
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcMatrixCursor<JavaInt> = seance.makeMatrixCursor(0, JavaInt::class.java)
```

### KotlinAnnotator
Unresolved reference: JdbcMatrixCursor
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcMatrixCursor<JavaInt> = seance.makeMatrixCursor(0, JavaInt::class.java)
            cursor.prepare(arrayOf(JavaInt::class.java))

```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
    fun fetchPortion() {
        val text = "select * from values (1, 1001, 1000001), (2, 2002, 2000002), (3, 3003, 3000003)"
        val m = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
        val text = "select * from values (1, 1001, 1000001), (2, 2002, 2000002), (3, 3003, 3000003)"
        val m = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcMatrixCursor<Number> = seance.makeMatrixCursor(0, Number::class.java)
```

### KotlinAnnotator
Unresolved reference: JdbcMatrixCursor
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcMatrixCursor<Number> = seance.makeMatrixCursor(0, Number::class.java)
            cursor.prepare(arrayOf<Class<out Number>>(JavaByte::class.java, JavaShort::class.java, JavaLong::class.java))
            cursor.fetchPortion()
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
        }

        expect that m iz notNull; m!!
        expect that m hasSize 3
        expect that m[0] hasSize 3
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java

        expect that m iz notNull; m!!
        expect that m hasSize 3
        expect that m[0] hasSize 3

```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
    fun portions() {
        val text = "select value from table(value int = (1,2,3,4,5,6,7,8,9,10,11,12))"
        session.openSeance().use { seance ->
            seance.setPortionSize(5)
            seance.prepare(text, stmtQuery, null)
```

### KotlinAnnotator
Unresolved reference: stmtQuery
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
        session.openSeance().use { seance ->
            seance.setPortionSize(5)
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcMatrixCursor<JavaInt> = seance.makeMatrixCursor(0, JavaInt::class.java)
```

### KotlinAnnotator
Unresolved reference: JdbcMatrixCursor
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcMatrixCursor<JavaInt> = seance.makeMatrixCursor(0, JavaInt::class.java)
            cursor.prepare(arrayOf(JavaInt::class.java))

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
            val m1 = cursor.fetchPortion()

            expect that m1 iz notNull; m1!!
            expect that m1 hasSize 5

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java

            expect that m1 iz notNull; m1!!
            expect that m1 hasSize 5

            expect that m1[0][0] equalsTo 1
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
            val m2 = cursor.fetchPortion()

            expect that m2 iz notNull; m2!!
            expect that m2 hasSize 5

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java

            expect that m2 iz notNull; m2!!
            expect that m2 hasSize 5

            expect that m2[0][0] equalsTo 6
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
            val m3 = cursor.fetchPortion()

            expect that m3 iz notNull; m3!!
            expect that m3 hasSize 2

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java

            expect that m3 iz notNull; m3!!
            expect that m3 hasSize 2

            expect that m3[0][0] equalsTo 11
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
            val m4 = cursor.fetchPortion()

            expect that m4 iz Null
        }
    }
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/base/BaseQueryRunner.kt`
#### Snippet
```java
package org.jetbrains.dekaf.main.base

import org.jetbrains.dekaf.inter.common.StatementCategory
import org.jetbrains.dekaf.inter.intf.InterSeance
import org.jetbrains.dekaf.main.db.DbQueryRunner
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/base/BaseQueryRunner.kt`
#### Snippet
```java

import org.jetbrains.dekaf.inter.common.StatementCategory
import org.jetbrains.dekaf.inter.intf.InterSeance
import org.jetbrains.dekaf.main.db.DbQueryRunner
import org.jetbrains.dekaf.main.queries.QueryLayout
```

### KotlinAnnotator
Unresolved reference: InterSeance
in `dekaf-main/src/base/BaseQueryRunner.kt`
#### Snippet
```java

    private val session: BaseSession
    private val seance: InterSeance
    private val queryText: String
    private val layout: QueryLayout<T>
```

### KotlinAnnotator
Unresolved reference: InterSeance
in `dekaf-main/src/base/BaseQueryRunner.kt`
#### Snippet
```java


    constructor(session: BaseSession, seance: InterSeance, queryText: String, layout: QueryLayout<T>) {
        this.session = session
        this.seance = seance
```

### KotlinAnnotator
Unresolved reference: StatementCategory
in `dekaf-main/src/base/BaseQueryRunner.kt`
#### Snippet
```java
    override fun run(vararg paramValues: Any?): T {
        val params: List<Any?>? = if (paramValues.isNotEmpty()) Arrays.asList(*paramValues) else null
        seance.prepare(queryText, StatementCategory.stmtQuery, null)
        seance.execute(params)
        val collector: ResultCollector<T> = layout.makeResultCollector()
```

### KotlinAnnotator
Unresolved reference: InterSession
in `dekaf-main/src/base/BaseFacade.kt`
#### Snippet
```java


    private fun openInterSession(): InterSession {
        val f = interFacade ?: throw IllegalStateException("Facade is not set up")
        return f.openSession()
```

### KotlinAnnotator
Unresolved reference: openSession
in `dekaf-main/src/base/BaseFacade.kt`
#### Snippet
```java
    private fun openInterSession(): InterSession {
        val f = interFacade ?: throw IllegalStateException("Facade is not set up")
        return f.openSession()
    }

```

### KotlinAnnotator
Unresolved reference: InterSession
in `dekaf-main/src/base/BaseFacade.kt`
#### Snippet
```java
    }

    internal fun releaseInterSessionBack(interSession: InterSession) {
        pool.release(interSession)
    }
```

### KotlinAnnotator
Unresolved reference: InterSession
in `dekaf-main/src/base/BaseFacade.kt`
#### Snippet
```java

    private inner class Pool : ServicePool<InterSession>() {
        override fun openService(): InterSession = openInterSession()
        override fun closeService(service: InterSession, wasBroken: Boolean) = closeInterSession(service, wasBroken)
    }
```

### KotlinAnnotator
Unresolved reference: InterFacade
in `dekaf-main/src/base/BaseFacade.kt`
#### Snippet
```java


    fun setup(interFacade: InterFacade, settings: Settings) {
        if (this.interFacade != null) throw IllegalStateException("The facade is already initialized")

```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main/src/base/BaseFacade.kt`
#### Snippet
```java


    fun setup(interFacade: InterFacade, settings: Settings) {
        if (this.interFacade != null) throw IllegalStateException("The facade is already initialized")

```

### KotlinAnnotator
Unresolved reference: InterSession
in `dekaf-main/src/base/BaseFacade.kt`
#### Snippet
```java
    private inner class Pool : ServicePool<InterSession>() {
        override fun openService(): InterSession = openInterSession()
        override fun closeService(service: InterSession, wasBroken: Boolean) = closeInterSession(service, wasBroken)
    }

```

### KotlinAnnotator
Unresolved reference: InterSession
in `dekaf-main/src/base/BaseFacade.kt`
#### Snippet
```java
    }

    internal fun releaseInterSessionBroken(interSession: InterSession) {
        pool.releaseBroken(interSession)
    }
```

### KotlinAnnotator
Unresolved reference: InterSession
in `dekaf-main/src/base/BaseFacade.kt`
#### Snippet
```java


    private inner class Pool : ServicePool<InterSession>() {
        override fun openService(): InterSession = openInterSession()
        override fun closeService(service: InterSession, wasBroken: Boolean) = closeInterSession(service, wasBroken)
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `dekaf-main/src/base/BaseFacade.kt`
#### Snippet
```java
        if (!ping) return true

        openInterSession().use { interSession ->
            try {
                interSession.ping()
```

### KotlinAnnotator
'return' is not allowed here
in `dekaf-main/src/base/BaseFacade.kt`
#### Snippet
```java
            try {
                interSession.ping()
                return true
            }
            catch (e: Exception) {
```

### KotlinAnnotator
'return' is not allowed here
in `dekaf-main/src/base/BaseFacade.kt`
#### Snippet
```java
            }
            catch (e: Exception) {
                return false
            }
        }
```

### KotlinAnnotator
A 'return' expression required in a function with a block body ('{...}')
in `dekaf-main/src/base/BaseFacade.kt`
#### Snippet
```java
            }
        }
    }


```

### KotlinAnnotator
Unresolved reference: InterSession
in `dekaf-main/src/base/BaseFacade.kt`
#### Snippet
```java
    }

    private fun closeInterSession(session: InterSession, wasBroken: Boolean) {
        session.rollback()
        session.close()
```

### KotlinAnnotator
Unresolved reference: InterFacade
in `dekaf-main/src/base/BaseFacade.kt`
#### Snippet
```java
class BaseFacade : DbFacade {

    private var interFacade: InterFacade? = null

    private var settings: Settings = Settings.empty
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main/src/base/BaseFacade.kt`
#### Snippet
```java
    private var interFacade: InterFacade? = null

    private var settings: Settings = Settings.empty

    private var connected: Boolean = false
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main/src/base/BaseFacade.kt`
#### Snippet
```java
    private var interFacade: InterFacade? = null

    private var settings: Settings = Settings.empty

    private var connected: Boolean = false
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/base/BaseFacade.kt`
#### Snippet
```java
package org.jetbrains.dekaf.main.base

import org.jetbrains.dekaf.inter.intf.InterFacade
import org.jetbrains.dekaf.inter.intf.InterSession
import org.jetbrains.dekaf.inter.settings.Settings
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/base/BaseFacade.kt`
#### Snippet
```java

import org.jetbrains.dekaf.inter.intf.InterFacade
import org.jetbrains.dekaf.inter.intf.InterSession
import org.jetbrains.dekaf.inter.settings.Settings
import org.jetbrains.dekaf.main.db.DbFacade
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/base/BaseFacade.kt`
#### Snippet
```java
import org.jetbrains.dekaf.inter.intf.InterFacade
import org.jetbrains.dekaf.inter.intf.InterSession
import org.jetbrains.dekaf.inter.settings.Settings
import org.jetbrains.dekaf.main.db.DbFacade
import org.jetbrains.dekaf.main.pool.ServicePool
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/base/BasePerformer.kt`
#### Snippet
```java
package org.jetbrains.dekaf.main.base

import org.jetbrains.dekaf.inter.intf.InterSession
import org.jetbrains.dekaf.main.db.DbInsideTransaction
import org.jetbrains.dekaf.main.db.DbQueryRunner
```

### KotlinAnnotator
Unresolved reference: InterSession
in `dekaf-main/src/base/BasePerformer.kt`
#### Snippet
```java

    internal val baseSession: BaseSession
    internal val interSession: InterSession


```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/DbMaster.kt`
#### Snippet
```java
package org.jetbrains.dekaf.main

import org.jetbrains.dekaf.inter.intf.InterFacade
import org.jetbrains.dekaf.inter.settings.Settings
import org.jetbrains.dekaf.main.base.BaseFacade
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/DbMaster.kt`
#### Snippet
```java

import org.jetbrains.dekaf.inter.intf.InterFacade
import org.jetbrains.dekaf.inter.settings.Settings
import org.jetbrains.dekaf.main.base.BaseFacade
import org.jetbrains.dekaf.main.base.FactoryLoader
```

### KotlinAnnotator
Unresolved reference: InterFacade
in `dekaf-main/src/DbMaster.kt`
#### Snippet
```java
object DbMaster {

    private val facades = CopyOnWriteArrayList<InterFacade>()


```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main/src/DbMaster.kt`
#### Snippet
```java

    @JvmStatic
    fun open(settings: Settings, connect: Boolean = false): DbFacade {
        // inter
        val interFactory = FactoryLoader.selectInterServiceFactory(settings)
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/base/BaseSession.kt`
#### Snippet
```java
package org.jetbrains.dekaf.main.base

import org.jetbrains.dekaf.inter.intf.InterSession
import org.jetbrains.dekaf.main.db.DbQueryRunner
import org.jetbrains.dekaf.main.db.DbSession
```

### KotlinAnnotator
Unresolved reference: InterSession
in `dekaf-main/src/base/BaseSession.kt`
#### Snippet
```java


    constructor(facade: BaseFacade, interSession: InterSession) : this(facade) {
        this.interSession = interSession

```

### KotlinAnnotator
Unresolved reference: InterSession
in `dekaf-main/src/base/BaseSession.kt`
#### Snippet
```java
class BaseSession (private val facade: BaseFacade) : DbSession {

    private var interSession: InterSession? = null

    private var activeTransactionPerformer: InTransactionPerformer? = null
```

### KotlinAnnotator
Unresolved reference: InterSession
in `dekaf-main/src/base/BaseSession.kt`
#### Snippet
```java


    internal fun ensureInterSession(): InterSession {
        val s = interSession
        if (closed || s == null || s.isClosed)
```

### KotlinAnnotator
Unresolved reference: InterSession
in `dekaf-main/src/base/BaseSession.kt`
#### Snippet
```java
    }

    private fun detachInterSession(): InterSession? {
        val s = interSession
        interSession = null
```

### KotlinAnnotator
Unresolved reference: InterMatrixCursor
in `dekaf-main/src/queries/impl/RowArrayNHandler.kt`
#### Snippet
```java
    override val rowClass: Class<Array<out E?>>

    private lateinit var cursor: InterMatrixCursor<E>
    

```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/queries/impl/RowArrayNHandler.kt`
#### Snippet
```java
package org.jetbrains.dekaf.main.queries.impl

import org.jetbrains.dekaf.inter.intf.InterMatrixCursor
import org.jetbrains.dekaf.inter.intf.InterSeance
import org.jetbrains.dekaf.inter.utils.ArrayHacks
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/queries/impl/RowArrayNHandler.kt`
#### Snippet
```java

import org.jetbrains.dekaf.inter.intf.InterMatrixCursor
import org.jetbrains.dekaf.inter.intf.InterSeance
import org.jetbrains.dekaf.inter.utils.ArrayHacks

```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/queries/impl/RowArrayNHandler.kt`
#### Snippet
```java
import org.jetbrains.dekaf.inter.intf.InterMatrixCursor
import org.jetbrains.dekaf.inter.intf.InterSeance
import org.jetbrains.dekaf.inter.utils.ArrayHacks


```

### KotlinAnnotator
Unresolved reference: InterSeance
in `dekaf-main/src/queries/impl/RowArrayNHandler.kt`
#### Snippet
```java


    override fun prepare(seance: InterSeance, position: Int): InterMatrixCursor<E?> {
        val cursor = seance.makeMatrixCursor(position, baseClass)
        cursor.prepare()
```

### KotlinAnnotator
Unresolved reference: InterMatrixCursor
in `dekaf-main/src/queries/impl/RowArrayNHandler.kt`
#### Snippet
```java


    override fun prepare(seance: InterSeance, position: Int): InterMatrixCursor<E?> {
        val cursor = seance.makeMatrixCursor(position, baseClass)
        cursor.prepare()
```

### KotlinAnnotator
Unresolved reference: ArrayHacks
in `dekaf-main/src/queries/impl/RowArrayNHandler.kt`
#### Snippet
```java
        this.baseClass = baseClass
        this.columnCount = columnCount
        rowClass = ArrayHacks.createEmptyArray(baseClass).javaClass
    }

```

### KotlinAnnotator
Unresolved reference: ArrayHacks
in `dekaf-main/src/queries/impl/RowArrayMHandler.kt`
#### Snippet
```java
        this.defaultValue = defaultValue
        cN = columnCount
        rowClass = ArrayHacks.createEmptyArray(baseClass).javaClass
    }

```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/queries/impl/RowArrayMHandler.kt`
#### Snippet
```java
package org.jetbrains.dekaf.main.queries.impl

import org.jetbrains.dekaf.inter.intf.InterMatrixCursor
import org.jetbrains.dekaf.inter.intf.InterSeance
import org.jetbrains.dekaf.inter.utils.ArrayHacks
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/queries/impl/RowArrayMHandler.kt`
#### Snippet
```java

import org.jetbrains.dekaf.inter.intf.InterMatrixCursor
import org.jetbrains.dekaf.inter.intf.InterSeance
import org.jetbrains.dekaf.inter.utils.ArrayHacks

```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/queries/impl/RowArrayMHandler.kt`
#### Snippet
```java
import org.jetbrains.dekaf.inter.intf.InterMatrixCursor
import org.jetbrains.dekaf.inter.intf.InterSeance
import org.jetbrains.dekaf.inter.utils.ArrayHacks


```

### KotlinAnnotator
Unresolved reference: InterMatrixCursor
in `dekaf-main/src/queries/impl/RowArrayMHandler.kt`
#### Snippet
```java
    override val rowClass: Class<Array<out E>>

    private lateinit var cursor: InterMatrixCursor<E>

    private var cN: Int
```

### KotlinAnnotator
Unresolved reference: InterSeance
in `dekaf-main/src/queries/impl/RowArrayMHandler.kt`
#### Snippet
```java
    }

    override fun prepare(seance: InterSeance, position: Int): InterMatrixCursor<E> {
        val cursor = seance.makeMatrixCursor(position, baseClass)
        cursor.prepare()
```

### KotlinAnnotator
Unresolved reference: InterMatrixCursor
in `dekaf-main/src/queries/impl/RowArrayMHandler.kt`
#### Snippet
```java
    }

    override fun prepare(seance: InterSeance, position: Int): InterMatrixCursor<E> {
        val cursor = seance.makeMatrixCursor(position, baseClass)
        cursor.prepare()
```

### KotlinAnnotator
Unresolved reference: InterSeance
in `dekaf-main/src/queries/impl/RowFunHandler.kt`
#### Snippet
```java


    override fun prepare(seance: InterSeance, position: Int): InterMatrixCursor<Any?> {
        val cursor = seance.makeMatrixCursor(position, baseClass)
        cursor.prepare(arrayOf<Class<out Any?>>(class1, class2, class3))
```

### KotlinAnnotator
Unresolved reference: InterMatrixCursor
in `dekaf-main/src/queries/impl/RowFunHandler.kt`
#### Snippet
```java


    override fun prepare(seance: InterSeance, position: Int): InterMatrixCursor<Any?> {
        val cursor = seance.makeMatrixCursor(position, baseClass)
        cursor.prepare(arrayOf<Class<out Any?>>(class1, class2, class3))
```

### KotlinAnnotator
Unresolved reference: InterSeance
in `dekaf-main/src/queries/impl/RowFunHandler.kt`
#### Snippet
```java


    override fun prepare(seance: InterSeance, position: Int): InterMatrixCursor<Any?> {
        val cursor: InterMatrixCursor<Any?> = seance.makeMatrixCursor(position, baseClass)
        cursor.prepare(arrayOf<Class<out Any?>>(class1, class2))
```

### KotlinAnnotator
Unresolved reference: InterMatrixCursor
in `dekaf-main/src/queries/impl/RowFunHandler.kt`
#### Snippet
```java


    override fun prepare(seance: InterSeance, position: Int): InterMatrixCursor<Any?> {
        val cursor: InterMatrixCursor<Any?> = seance.makeMatrixCursor(position, baseClass)
        cursor.prepare(arrayOf<Class<out Any?>>(class1, class2))
```

### KotlinAnnotator
Unresolved reference: InterMatrixCursor
in `dekaf-main/src/queries/impl/RowFunHandler.kt`
#### Snippet
```java

    override fun prepare(seance: InterSeance, position: Int): InterMatrixCursor<Any?> {
        val cursor: InterMatrixCursor<Any?> = seance.makeMatrixCursor(position, baseClass)
        cursor.prepare(arrayOf<Class<out Any?>>(class1, class2))
        this.cursor = cursor
```

### KotlinAnnotator
Unresolved reference: InterMatrixCursor
in `dekaf-main/src/queries/impl/RowFunHandler.kt`
#### Snippet
```java
    final override val rowClass: Class<R>

    protected lateinit var cursor: InterMatrixCursor<Any?>

    constructor(rowClass: Class<R>) {
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/queries/impl/RowFunHandler.kt`
#### Snippet
```java
package org.jetbrains.dekaf.main.queries.impl

import org.jetbrains.dekaf.inter.intf.InterMatrixCursor
import org.jetbrains.dekaf.inter.intf.InterSeance
import org.jetbrains.dekaf.main.util.guessCommonOf
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/queries/impl/RowFunHandler.kt`
#### Snippet
```java

import org.jetbrains.dekaf.inter.intf.InterMatrixCursor
import org.jetbrains.dekaf.inter.intf.InterSeance
import org.jetbrains.dekaf.main.util.guessCommonOf
import org.jetbrains.dekaf.main.util.isInstanceOf
```

### KotlinAnnotator
Unresolved reference: InterSeance
in `dekaf-main/src/queries/impl/ResultCollector.kt`
#### Snippet
```java
interface ResultCollector<T> : AutoCloseable {

    fun prepare(seance: InterSeance, positionIndex: Int)

    fun retrieve(): T
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/queries/impl/ResultCollector.kt`
#### Snippet
```java
package org.jetbrains.dekaf.main.queries.impl

import org.jetbrains.dekaf.inter.intf.InterSeance


```

### KotlinAnnotator
Unresolved reference: JdbcFacade
in `dekaf-jdbc-test/tests/impl/H2ConnectedTest.kt`
#### Snippet
```java
    }

    protected lateinit var facade:  JdbcFacade
    protected lateinit var session: JdbcSession

```

### KotlinAnnotator
Unresolved reference: JdbcSession
in `dekaf-jdbc-test/tests/impl/H2ConnectedTest.kt`
#### Snippet
```java

    protected lateinit var facade:  JdbcFacade
    protected lateinit var session: JdbcSession


```

### KotlinAnnotator
Unresolved reference: closeIt
in `dekaf-jdbc-test/tests/impl/H2ConnectedTest.kt`
#### Snippet
```java
        }
        finally {
            closeIt(stmt)
        }
    }
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-jdbc-test/tests/impl/H2ConnectedTest.kt`
#### Snippet
```java
package org.jetbrains.dekaf.jdbcTest.impl

import org.jetbrains.dekaf.inter.settings.Settings
import org.jetbrains.dekaf.jdbc.impl.JdbcFacade
import org.jetbrains.dekaf.jdbc.impl.JdbcServiceFactory
```

### KotlinAnnotator
Unresolved reference: jdbc
in `dekaf-jdbc-test/tests/impl/H2ConnectedTest.kt`
#### Snippet
```java

import org.jetbrains.dekaf.inter.settings.Settings
import org.jetbrains.dekaf.jdbc.impl.JdbcFacade
import org.jetbrains.dekaf.jdbc.impl.JdbcServiceFactory
import org.jetbrains.dekaf.jdbc.impl.JdbcSession
```

### KotlinAnnotator
Unresolved reference: jdbc
in `dekaf-jdbc-test/tests/impl/H2ConnectedTest.kt`
#### Snippet
```java
import org.jetbrains.dekaf.inter.settings.Settings
import org.jetbrains.dekaf.jdbc.impl.JdbcFacade
import org.jetbrains.dekaf.jdbc.impl.JdbcServiceFactory
import org.jetbrains.dekaf.jdbc.impl.JdbcSession
import org.jetbrains.dekaf.jdbc.impl.JdbcStuff.closeIt
```

### KotlinAnnotator
Unresolved reference: jdbc
in `dekaf-jdbc-test/tests/impl/H2ConnectedTest.kt`
#### Snippet
```java
import org.jetbrains.dekaf.jdbc.impl.JdbcFacade
import org.jetbrains.dekaf.jdbc.impl.JdbcServiceFactory
import org.jetbrains.dekaf.jdbc.impl.JdbcSession
import org.jetbrains.dekaf.jdbc.impl.JdbcStuff.closeIt
import org.jetbrains.dekaf.test.utils.UnitTest
```

### KotlinAnnotator
Unresolved reference: jdbc
in `dekaf-jdbc-test/tests/impl/H2ConnectedTest.kt`
#### Snippet
```java
import org.jetbrains.dekaf.jdbc.impl.JdbcServiceFactory
import org.jetbrains.dekaf.jdbc.impl.JdbcSession
import org.jetbrains.dekaf.jdbc.impl.JdbcStuff.closeIt
import org.jetbrains.dekaf.test.utils.UnitTest
import org.junit.jupiter.api.AfterAll
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-jdbc-test/tests/impl/H2ConnectedTest.kt`
#### Snippet
```java
    companion object {
        val memH2Settings =
                Settings.of(
                        "driver", Settings.of("class", "org.h2.Driver"),
                        "jdbc", Settings.of("connection-string", "jdbc:h2:mem:test")
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-jdbc-test/tests/impl/H2ConnectedTest.kt`
#### Snippet
```java
        val memH2Settings =
                Settings.of(
                        "driver", Settings.of("class", "org.h2.Driver"),
                        "jdbc", Settings.of("connection-string", "jdbc:h2:mem:test")
                )
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-jdbc-test/tests/impl/H2ConnectedTest.kt`
#### Snippet
```java
                Settings.of(
                        "driver", Settings.of("class", "org.h2.Driver"),
                        "jdbc", Settings.of("connection-string", "jdbc:h2:mem:test")
                )
        val factory = JdbcServiceFactory()
```

### KotlinAnnotator
Unresolved reference: JdbcServiceFactory
in `dekaf-jdbc-test/tests/impl/H2ConnectedTest.kt`
#### Snippet
```java
                        "jdbc", Settings.of("connection-string", "jdbc:h2:mem:test")
                )
        val factory = JdbcServiceFactory()
    }

```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/queries/impl/TableArrayResultCollector.kt`
#### Snippet
```java
package org.jetbrains.dekaf.main.queries.impl

import org.jetbrains.dekaf.inter.utils.ArrayHacks


```

### KotlinAnnotator
Unresolved reference: ArrayHacks
in `dekaf-main/src/queries/impl/TableArrayResultCollector.kt`
#### Snippet
```java
    override fun retrieve(): Array<R> {
        val list = retrieveIntoArrayList()
        val emptyArray: Array<R> = ArrayHacks.createEmptyArray(handler.rowClass)
        val n = list.size
        if (n == 0) return emptyArray
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main/src/settings/SettingsFun.kt`
#### Snippet
```java


fun settingsOf(vararg pairs: Pair<String, Serializable>): Settings {
    val n = pairs.size
    if (n == 0) return Settings.empty
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main/src/settings/SettingsFun.kt`
#### Snippet
```java
fun settingsOf(vararg pairs: Pair<String, Serializable>): Settings {
    val n = pairs.size
    if (n == 0) return Settings.empty
    val a = Array<Setting>(n) {  index ->
        val p = pairs[index]
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-main/src/settings/SettingsFun.kt`
#### Snippet
```java
    val n = pairs.size
    if (n == 0) return Settings.empty
    val a = Array<Setting>(n) {  index ->
        val p = pairs[index]
        Setting(p.first, p.second)
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-main/src/settings/SettingsFun.kt`
#### Snippet
```java
    val a = Array<Setting>(n) {  index ->
        val p = pairs[index]
        Setting(p.first, p.second)
    }
    return Settings(*a)
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main/src/settings/SettingsFun.kt`
#### Snippet
```java
        Setting(p.first, p.second)
    }
    return Settings(*a)
}

```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/settings/SettingsFun.kt`
#### Snippet
```java
package org.jetbrains.dekaf.main.settings

import org.jetbrains.dekaf.inter.settings.Setting
import org.jetbrains.dekaf.inter.settings.Settings
import java.io.Serializable
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/settings/SettingsFun.kt`
#### Snippet
```java

import org.jetbrains.dekaf.inter.settings.Setting
import org.jetbrains.dekaf.inter.settings.Settings
import java.io.Serializable

```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-main/src/settings/SettingsFun.kt`
#### Snippet
```java


val Setting.pair: Pair<String, Serializable>
    inline get() = Pair(name, value)

```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/queries/impl/RowHandler.kt`
#### Snippet
```java
package org.jetbrains.dekaf.main.queries.impl

import org.jetbrains.dekaf.inter.intf.InterMatrixCursor
import org.jetbrains.dekaf.inter.intf.InterSeance

```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/queries/impl/RowHandler.kt`
#### Snippet
```java

import org.jetbrains.dekaf.inter.intf.InterMatrixCursor
import org.jetbrains.dekaf.inter.intf.InterSeance


```

### KotlinAnnotator
Unresolved reference: InterSeance
in `dekaf-main/src/queries/impl/RowHandler.kt`
#### Snippet
```java
interface RowHandler<R, B> {

    fun prepare(seance: InterSeance, position: Int): InterMatrixCursor<B>

    fun handleRow(values: Array<out B>): R
```

### KotlinAnnotator
Unresolved reference: InterMatrixCursor
in `dekaf-main/src/queries/impl/RowHandler.kt`
#### Snippet
```java
interface RowHandler<R, B> {

    fun prepare(seance: InterSeance, position: Int): InterMatrixCursor<B>

    fun handleRow(values: Array<out B>): R
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/base/FactoryLoaderTest.kt`
#### Snippet
```java
    @Test
    fun interFactory_exists() {
        val f = FactoryLoader.selectInterServiceFactory(Settings.empty)
        expect that f.javaClass.name equalsTo "org.jetbrains.dekaf.jdbc.impl.JdbcServiceFactory"
    }
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main-test/src/base/FactoryLoaderTest.kt`
#### Snippet
```java
import lb.yaka.expectations.equalsTo
import lb.yaka.gears.expect
import org.jetbrains.dekaf.inter.settings.Settings
import org.jetbrains.dekaf.main.base.FactoryLoader
import org.jetbrains.dekaf.test.utils.UnitTest
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main/src/settings/SettingsLoader.kt`
#### Snippet
```java


    fun load(text: CharSequence): Settings {
        val builder = SettingsBuilder()
        val simReader = SimplextTextReader<SettingsBuilder?>(builder, ::handleLine)
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/settings/SettingsLoader.kt`
#### Snippet
```java
package org.jetbrains.dekaf.main.settings

import org.jetbrains.dekaf.inter.settings.Settings
import org.jetbrains.dekaf.main.simplext.SimplextFileReader
import org.jetbrains.dekaf.main.simplext.SimplextLine
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main/src/settings/SettingsLoader.kt`
#### Snippet
```java
    }

    fun load(file: Path): Settings {
        val builder = SettingsBuilder()
        val simReader = SimplextFileReader<SettingsBuilder?>(builder, ::handleLine)
```

### KotlinAnnotator
Unresolved reference: InterMatrixCursor
in `dekaf-main/src/queries/impl/TableResultCollector.kt`
#### Snippet
```java
    protected val handler: RowHandler<R, B>

    protected lateinit var cursor: InterMatrixCursor<B>


```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/queries/impl/TableResultCollector.kt`
#### Snippet
```java
package org.jetbrains.dekaf.main.queries.impl

import org.jetbrains.dekaf.inter.intf.InterMatrixCursor
import org.jetbrains.dekaf.inter.intf.InterSeance

```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/queries/impl/TableResultCollector.kt`
#### Snippet
```java

import org.jetbrains.dekaf.inter.intf.InterMatrixCursor
import org.jetbrains.dekaf.inter.intf.InterSeance


```

### KotlinAnnotator
Unresolved reference: InterSeance
in `dekaf-main/src/queries/impl/TableResultCollector.kt`
#### Snippet
```java


    override fun prepare(seance: InterSeance, positionIndex: Int) {
        cursor = handler.prepare(seance, positionIndex)
    }
```

### KotlinAnnotator
Unresolved reference: InterServiceFactory
in `dekaf-main/src/base/FactoryLoader.kt`
#### Snippet
```java
    private object InterFactories {

        val factories: Collection<InterServiceFactory>


```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/base/FactoryLoader.kt`
#### Snippet
```java
package org.jetbrains.dekaf.main.base

import org.jetbrains.dekaf.inter.exceptions.DBFactoryException
import org.jetbrains.dekaf.inter.intf.InterServiceFactory
import org.jetbrains.dekaf.inter.settings.Settings
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/base/FactoryLoader.kt`
#### Snippet
```java

import org.jetbrains.dekaf.inter.exceptions.DBFactoryException
import org.jetbrains.dekaf.inter.intf.InterServiceFactory
import org.jetbrains.dekaf.inter.settings.Settings
import java.util.*
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/base/FactoryLoader.kt`
#### Snippet
```java
import org.jetbrains.dekaf.inter.exceptions.DBFactoryException
import org.jetbrains.dekaf.inter.intf.InterServiceFactory
import org.jetbrains.dekaf.inter.settings.Settings
import java.util.*
import java.util.stream.Collectors
```

### KotlinAnnotator
Unresolved reference: InterServiceFactory
in `dekaf-main/src/base/FactoryLoader.kt`
#### Snippet
```java

        init {
            val loader: ServiceLoader<InterServiceFactory> =
                    ServiceLoader.load(InterServiceFactory::class.java)
            val providers: List<ServiceLoader.Provider<InterServiceFactory>> =
```

### KotlinAnnotator
Unresolved reference: InterServiceFactory
in `dekaf-main/src/base/FactoryLoader.kt`
#### Snippet
```java
        init {
            val loader: ServiceLoader<InterServiceFactory> =
                    ServiceLoader.load(InterServiceFactory::class.java)
            val providers: List<ServiceLoader.Provider<InterServiceFactory>> =
                    loader.stream().collect(Collectors.toList())
```

### KotlinAnnotator
Unresolved reference: InterServiceFactory
in `dekaf-main/src/base/FactoryLoader.kt`
#### Snippet
```java
            val loader: ServiceLoader<InterServiceFactory> =
                    ServiceLoader.load(InterServiceFactory::class.java)
            val providers: List<ServiceLoader.Provider<InterServiceFactory>> =
                    loader.stream().collect(Collectors.toList())
            factories = ArrayList(providers.size)
```

### KotlinAnnotator
Unresolved reference: add
in `dekaf-main/src/base/FactoryLoader.kt`
#### Snippet
```java
                val factory = provider.get()
                // TODO log loading a provider
                factories.add(factory)
            }
        }
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main/src/base/FactoryLoader.kt`
#### Snippet
```java
    private const val baseInterServiceFactoryName = "org.jetbrains.dekaf.jdbc.impl.JdbcServiceFactory"

    fun selectInterServiceFactory(settings: Settings): InterServiceFactory {
        val factories = InterFactories.factories
        if (factories.isEmpty()) throw DBFactoryException("No instances of InterServiceFactory")
```

### KotlinAnnotator
Unresolved reference: InterServiceFactory
in `dekaf-main/src/base/FactoryLoader.kt`
#### Snippet
```java
    private const val baseInterServiceFactoryName = "org.jetbrains.dekaf.jdbc.impl.JdbcServiceFactory"

    fun selectInterServiceFactory(settings: Settings): InterServiceFactory {
        val factories = InterFactories.factories
        if (factories.isEmpty()) throw DBFactoryException("No instances of InterServiceFactory")
```

### KotlinAnnotator
Unresolved reference: DBFactoryException
in `dekaf-main/src/base/FactoryLoader.kt`
#### Snippet
```java
    fun selectInterServiceFactory(settings: Settings): InterServiceFactory {
        val factories = InterFactories.factories
        if (factories.isEmpty()) throw DBFactoryException("No instances of InterServiceFactory")
        var f = factories.firstOrNull { it.javaClass.name == baseInterServiceFactoryName }
        f ?: throw DBFactoryException("No base instance of InterServiceFactory")
```

### KotlinAnnotator
Unresolved reference: DBFactoryException
in `dekaf-main/src/base/FactoryLoader.kt`
#### Snippet
```java
        if (factories.isEmpty()) throw DBFactoryException("No instances of InterServiceFactory")
        var f = factories.firstOrNull { it.javaClass.name == baseInterServiceFactoryName }
        f ?: throw DBFactoryException("No base instance of InterServiceFactory")
        return f
    }
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java

    private fun addNewEntry(name: String, value: Serializable) {
        val entry = Setting(name, value)
        val n = entries.size
        entries.add(entry)
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java
        val index = indexOf(name)
        if (index < 0) throw NoSuchSettingException("Attempting to replace a setting name '$name' but no setting")
        val newEntry = Setting(name, newValue)
        entries[index] = newEntry
    }
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java
            when (obj) {
                is SettingsBuilder -> obj = obj[name]
                is Settings -> obj = obj.getEntry(name)
                else -> return null
            }
```

### KotlinAnnotator
Unresolved reference: getEntry
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java
            when (obj) {
                is SettingsBuilder -> obj = obj[name]
                is Settings -> obj = obj.getEntry(name)
                else -> return null
            }
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java
        }

        return if (obj is Setting) obj.value else obj
    }

```

### KotlinAnnotator
Unresolved reference: value
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java
        }

        return if (obj is Setting) obj.value else obj
    }

```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java
 *
 */
class SettingsBuilder : Iterable<Setting>, Serializable {


```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java


    fun build(): Settings {
        val n = entries.size
        if (n == 0) return Settings.empty
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java
    fun build(): Settings {
        val n = entries.size
        if (n == 0) return Settings.empty

        val list = ArrayList<Setting>(n)
```

### KotlinAnnotator
None of the following functions can be called with the arguments supplied: public final fun \`\`(c: (MutableCollection..Collection?)): kotlin.collections.ArrayList /\* = java.util.ArrayList \*/ defined in kotlin.collections.ArrayList public final fun \`\`(initialCapacity: Int): kotlin.collections.ArrayList /\* = java.util.ArrayList \*/ defined in kotlin.collections.ArrayList
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java
        if (n == 0) return Settings.empty

        val list = ArrayList<Setting>(n)
        for (i in 0 until n) {
            val setting = entries[i]
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java
        if (n == 0) return Settings.empty

        val list = ArrayList<Setting>(n)
        for (i in 0 until n) {
            val setting = entries[i]
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java
            val setting = entries[i]
            when (val value = setting.value) {
                is Settings -> if (value.isNotEmpty) list += setting
                is SettingsBuilder -> if (value.isNotEmpty) value.buildNestedSettingTo(list, setting.name)
                else -> list += setting
```

### KotlinAnnotator
Function '' should return Unit to be used by corresponding operator '+='
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java
            val setting = entries[i]
            when (val value = setting.value) {
                is Settings -> if (value.isNotEmpty) list += setting
                is SettingsBuilder -> if (value.isNotEmpty) value.buildNestedSettingTo(list, setting.name)
                else -> list += setting
```

### KotlinAnnotator
Function '' should return Unit to be used by corresponding operator '+='
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java
                is Settings -> if (value.isNotEmpty) list += setting
                is SettingsBuilder -> if (value.isNotEmpty) value.buildNestedSettingTo(list, setting.name)
                else -> list += setting
            }
        }
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java
        }

        return if (list.isNotEmpty()) Settings(*list.toTypedArray()) else Settings.empty
    }

```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java
        }

        return if (list.isNotEmpty()) Settings(*list.toTypedArray()) else Settings.empty
    }

```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java


    private fun buildNestedSettingTo(container: ArrayList<Setting>, name: String) {
        val settings = build()
        if (settings.isNotEmpty) container += Setting(name, settings)
```

### KotlinAnnotator
None of the following functions can be called with the arguments supplied: public operator fun Collection.plus(element: TypeVariable(T)): List defined in kotlin.collections public operator fun Collection.plus(elements: Array): List defined in kotlin.collections public operator fun Collection.plus(elements: Iterable): List defined in kotlin.collections public operator fun Collection.plus(elements: Sequence): List defined in kotlin.collections public operator fun Iterable.plus(element: TypeVariable(T)): List defined in kotlin.collections public operator fun Iterable.plus(elements: Array): List defined in kotlin.collections public operator fun Iterable.plus(elements: Iterable): List defined in kotlin.collections public operator fun Iterable.plus(elements: Sequence): List defined in kotlin.collections
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java
    private fun buildNestedSettingTo(container: ArrayList<Setting>, name: String) {
        val settings = build()
        if (settings.isNotEmpty) container += Setting(name, settings)
    }

```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java
    private fun buildNestedSettingTo(container: ArrayList<Setting>, name: String) {
        val settings = build()
        if (settings.isNotEmpty) container += Setting(name, settings)
    }

```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java
    fun replace(index: Int, newValue: Serializable) {
        val oldEntry = entries[index]
        val newEntry = Setting(oldEntry.name, newValue)
        entries[index] = newEntry
    }
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java
     * @param index zero-based index.
     */
    operator fun get(index: Int): Setting {
        return entries[index]
    }
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java


    private val entries = ArrayList<Setting>()

    @Transient
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java


    override fun iterator(): Iterator<Setting> {
        return Collections.unmodifiableCollection(entries).iterator()
    }
```

### KotlinAnnotator
Not enough information to infer type variable T
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java

    override fun iterator(): Iterator<Setting> {
        return Collections.unmodifiableCollection(entries).iterator()
    }

```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java
package org.jetbrains.dekaf.main.settings

import org.jetbrains.dekaf.inter.settings.Setting
import org.jetbrains.dekaf.inter.settings.Settings
import java.io.Serializable
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java

import org.jetbrains.dekaf.inter.settings.Setting
import org.jetbrains.dekaf.inter.settings.Settings
import java.io.Serializable
import java.util.*
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/util/H2Util.kt`
#### Snippet
```java

val H2memSettings =
        Settings.of(
                "driver", Settings.of("class", "org.h2.Driver"),
                "jdbc", Settings.of("connection-string", "jdbc:h2:mem:test")
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/util/H2Util.kt`
#### Snippet
```java
val H2memSettings =
        Settings.of(
                "driver", Settings.of("class", "org.h2.Driver"),
                "jdbc", Settings.of("connection-string", "jdbc:h2:mem:test")
        )
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/util/H2Util.kt`
#### Snippet
```java
        Settings.of(
                "driver", Settings.of("class", "org.h2.Driver"),
                "jdbc", Settings.of("connection-string", "jdbc:h2:mem:test")
        )

```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main-test/src/util/H2Util.kt`
#### Snippet
```java
package org.jetbrains.dekaf.mainTest.util

import org.jetbrains.dekaf.inter.settings.Settings


```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
        }

        b.build() aka "Built Instance" sameAs Settings.empty
    }

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
        val s = b.build()

        expect that s hasSize 3
        expect that s.getEntry(1).name equalsTo "B"
        expect that s.getEntry(1).value iz Settings::class
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
        expect that s hasSize 3
        expect that s.getEntry(1).name equalsTo "B"
        expect that s.getEntry(1).value iz Settings::class

        val nest = s.getEntry(1).nest()
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
        nest ?: failNull("nest()")

        expect that nest hasSize 2
        expect that nest.getEntry(0).name equalsTo "B11"
        expect that nest.getEntry(0).value equalsTo 11
```

### KotlinAnnotator
Unresolved reference. None of the following candidates is applicable because of receiver type mismatch: public infix fun \> Subject.hasSize(size: Int): Subject defined in lb.yaka.expectations public infix fun \> Subject.hasSize(size: Int): Subject defined in lb.yaka.expectations
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java

        expect that b aka "builder" complies {
            hasSize(1)
            at(0) equalsTo Setting("name", "value")
        }
```

### KotlinAnnotator
Unresolved reference. None of the following candidates is applicable because of receiver type mismatch: public infix fun \> Subject.at(index: Int): Subject defined in lb.yaka.expectations public infix fun \> Subject.at(index: Int): Subject defined in lb.yaka.expectations
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
        expect that b aka "builder" complies {
            hasSize(1)
            at(0) equalsTo Setting("name", "value")
        }
    }
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
        expect that b aka "builder" complies {
            hasSize(1)
            at(0) equalsTo Setting("name", "value")
        }
    }
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
    fun get_byPath_3() {
        val inner = SettingsBuilder()
        inner["second"] = Settings(Setting("third", "theSuperValue"))

        val outer = SettingsBuilder()
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
    fun get_byPath_3() {
        val inner = SettingsBuilder()
        inner["second"] = Settings(Setting("third", "theSuperValue"))

        val outer = SettingsBuilder()
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
import lb.yaka.expectations.*
import lb.yaka.gears.*
import org.jetbrains.dekaf.inter.settings.Setting
import org.jetbrains.dekaf.inter.settings.Settings
import org.jetbrains.dekaf.main.settings.SettingsBuilder
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
import lb.yaka.gears.*
import org.jetbrains.dekaf.inter.settings.Setting
import org.jetbrains.dekaf.inter.settings.Settings
import org.jetbrains.dekaf.main.settings.SettingsBuilder
import org.jetbrains.dekaf.main.settings.pair
```

### KotlinAnnotator
Unresolved reference. None of the following candidates is applicable because of receiver type mismatch: public infix fun \> Subject.hasSize(size: Int): Subject defined in lb.yaka.expectations public infix fun \> Subject.hasSize(size: Int): Subject defined in lb.yaka.expectations
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java

        val b2 = inner as SettingsBuilder
        expect that b2 aka "Inner Builder" hasSize 2
        expect that b2["cat"] aka "cat value" equalsTo "meow"
        expect that b2["dog"] aka "dog value" equalsTo "bark"
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
        }

        b.build() aka "Built Instance" sameAs Settings.empty
    }

```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
    fun get_byPath_2_innerIsSettings() {
        val b = SettingsBuilder()
        b["first"] = Settings(Setting("second", "theValue"))

        val path = arrayOf("first", "second")
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
    fun get_byPath_2_innerIsSettings() {
        val b = SettingsBuilder()
        b["first"] = Settings(Setting("second", "theValue"))

        val path = arrayOf("first", "second")
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
        val s = outer.build()

        expect that s hasSize 3
        expect that s.getEntry(1).name equalsTo "B"
        expect that s.getEntry(1).value iz Settings::class
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
        expect that s hasSize 3
        expect that s.getEntry(1).name equalsTo "B"
        expect that s.getEntry(1).value iz Settings::class

        val nest = s.getEntry(1).nest()
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
        nest ?: failNull("nest()")

        expect that nest hasSize 2
        expect that nest.getEntry(0).name equalsTo "B11"
        expect that nest.getEntry(0).value equalsTo 11
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
        val s = b.build()

        expect that s hasSize 3
        expect that s complies {
            at(0) complies {
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java

        expect that s hasSize 3
        expect that s complies {
            at(0) complies {
                property { ::name } equalsTo "Good"
```

### KotlinAnnotator
Unresolved reference. None of the following candidates is applicable because of receiver type mismatch: public infix fun \> Subject.at(index: Int): Subject defined in lb.yaka.expectations public infix fun \> Subject.at(index: Int): Subject defined in lb.yaka.expectations
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
        expect that s hasSize 3
        expect that s complies {
            at(0) complies {
                property { ::name } equalsTo "Good"
                property { ::value } equalsTo 44
```

### KotlinAnnotator
Unresolved reference: property
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
        expect that s complies {
            at(0) complies {
                property { ::name } equalsTo "Good"
                property { ::value } equalsTo 44
            }
```

### KotlinAnnotator
Unresolved reference: property
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
            at(0) complies {
                property { ::name } equalsTo "Good"
                property { ::value } equalsTo 44
            }
            at(1) complies {
```

### KotlinAnnotator
Unresolved reference. None of the following candidates is applicable because of receiver type mismatch: public infix fun \> Subject.at(index: Int): Subject defined in lb.yaka.expectations public infix fun \> Subject.at(index: Int): Subject defined in lb.yaka.expectations
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
                property { ::value } equalsTo 44
            }
            at(1) complies {
                property { ::name } equalsTo "Evil"
                property { ::value } equalsTo 13
```

### KotlinAnnotator
Unresolved reference: property
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
            }
            at(1) complies {
                property { ::name } equalsTo "Evil"
                property { ::value } equalsTo 13
            }
```

### KotlinAnnotator
Unresolved reference: property
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
            at(1) complies {
                property { ::name } equalsTo "Evil"
                property { ::value } equalsTo 13
            }
            at(2) complies {
```

### KotlinAnnotator
Unresolved reference. None of the following candidates is applicable because of receiver type mismatch: public infix fun \> Subject.at(index: Int): Subject defined in lb.yaka.expectations public infix fun \> Subject.at(index: Int): Subject defined in lb.yaka.expectations
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
                property { ::value } equalsTo 13
            }
            at(2) complies {
                property { ::name } equalsTo "None"
                property { ::value } equalsTo 99
```

### KotlinAnnotator
Unresolved reference: property
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
            }
            at(2) complies {
                property { ::name } equalsTo "None"
                property { ::value } equalsTo 99
            }
```

### KotlinAnnotator
Unresolved reference: property
in `dekaf-main-test/src/settings/SettingsBuilderTest.kt`
#### Snippet
```java
            at(2) complies {
                property { ::name } equalsTo "None"
                property { ::value } equalsTo 99
            }
        }
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
                """.trimMargin()
        val settings = makeSettings(text)
        expect that settings hasSize 3
        expect that settings["cat"] equalsTo "meow"
        expect that settings["dog"] equalsTo "bark"
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        val settings = makeSettings(text)

        expect that settings aka "Settings" complies {
            hasSize(1)
            at(0) equalsTo Setting("theName", "theValue")
```

### KotlinAnnotator
Unresolved reference. None of the following candidates is applicable because of receiver type mismatch: public infix fun \> Subject.hasSize(size: Int): Subject defined in lb.yaka.expectations public infix fun \> Subject.hasSize(size: Int): Subject defined in lb.yaka.expectations
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java

        expect that settings aka "Settings" complies {
            hasSize(1)
            at(0) equalsTo Setting("theName", "theValue")
        }
```

### KotlinAnnotator
Unresolved reference. None of the following candidates is applicable because of receiver type mismatch: public infix fun \> Subject.at(index: Int): Subject defined in lb.yaka.expectations public infix fun \> Subject.at(index: Int): Subject defined in lb.yaka.expectations
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        expect that settings aka "Settings" complies {
            hasSize(1)
            at(0) equalsTo Setting("theName", "theValue")
        }
    }
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        expect that settings aka "Settings" complies {
            hasSize(1)
            at(0) equalsTo Setting("theName", "theValue")
        }
    }
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        val settings = makeSettings(text)

        expect that settings aka "Settings" complies {
            hasSize(1)
            at(0) equalsTo Setting("theName", "theValue")
```

### KotlinAnnotator
Unresolved reference. None of the following candidates is applicable because of receiver type mismatch: public infix fun \> Subject.hasSize(size: Int): Subject defined in lb.yaka.expectations public infix fun \> Subject.hasSize(size: Int): Subject defined in lb.yaka.expectations
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java

        expect that settings aka "Settings" complies {
            hasSize(1)
            at(0) equalsTo Setting("theName", "theValue")
        }
```

### KotlinAnnotator
Unresolved reference. None of the following candidates is applicable because of receiver type mismatch: public infix fun \> Subject.at(index: Int): Subject defined in lb.yaka.expectations public infix fun \> Subject.at(index: Int): Subject defined in lb.yaka.expectations
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        expect that settings aka "Settings" complies {
            hasSize(1)
            at(0) equalsTo Setting("theName", "theValue")
        }
    }
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        expect that settings aka "Settings" complies {
            hasSize(1)
            at(0) equalsTo Setting("theName", "theValue")
        }
    }
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        val settings = makeSettings(text)

        expect that settings hasSize 1
        
        val inner = settings["animal"] as Settings
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        expect that settings hasSize 1
        
        val inner = settings["animal"] as Settings
        expect that inner hasSize 3
        expect that inner["cat"] equalsTo "meow"
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        
        val inner = settings["animal"] as Settings
        expect that inner hasSize 3
        expect that inner["cat"] equalsTo "meow"
        expect that inner["dog"] equalsTo "bark"
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
                """.trimMargin()
        val settings = makeSettings(text)
        expect that settings hasSize 3
        expect that settings["cat"] equalsTo "meow"
        expect that settings["dog"] equalsTo "bark"
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        val settings = makeSettings(text)

        expect that settings aka "Settings" complies {
            hasSize(1)
            at(0) equalsTo Setting("theName", "theValue")
```

### KotlinAnnotator
Unresolved reference. None of the following candidates is applicable because of receiver type mismatch: public infix fun \> Subject.hasSize(size: Int): Subject defined in lb.yaka.expectations public infix fun \> Subject.hasSize(size: Int): Subject defined in lb.yaka.expectations
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java

        expect that settings aka "Settings" complies {
            hasSize(1)
            at(0) equalsTo Setting("theName", "theValue")
        }
```

### KotlinAnnotator
Unresolved reference. None of the following candidates is applicable because of receiver type mismatch: public infix fun \> Subject.at(index: Int): Subject defined in lb.yaka.expectations public infix fun \> Subject.at(index: Int): Subject defined in lb.yaka.expectations
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        expect that settings aka "Settings" complies {
            hasSize(1)
            at(0) equalsTo Setting("theName", "theValue")
        }
    }
```

### KotlinAnnotator
Unresolved reference: Setting
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        expect that settings aka "Settings" complies {
            hasSize(1)
            at(0) equalsTo Setting("theName", "theValue")
        }
    }
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
import lb.yaka.expectations.*
import lb.yaka.gears.*
import org.jetbrains.dekaf.inter.settings.Setting
import org.jetbrains.dekaf.inter.settings.Settings
import org.jetbrains.dekaf.main.settings.SettingsLoader
```

### KotlinAnnotator
Unresolved reference: inter
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
import lb.yaka.gears.*
import org.jetbrains.dekaf.inter.settings.Setting
import org.jetbrains.dekaf.inter.settings.Settings
import org.jetbrains.dekaf.main.settings.SettingsLoader
import org.jetbrains.dekaf.test.utils.SystemTestWithTempDir
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        val settings = makeSettings(text)

        expect that settings hasSize 1

        val inner1 = settings["live"] as Settings
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        expect that settings hasSize 1

        val inner1 = settings["live"] as Settings
        expect that inner1 hasSize 1

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java

        val inner1 = settings["live"] as Settings
        expect that inner1 hasSize 1

        val inner2 = inner1["animal"] as Settings
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        expect that inner1 hasSize 1

        val inner2 = inner1["animal"] as Settings
        expect that inner2 hasSize 2

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java

        val inner2 = inner1["animal"] as Settings
        expect that inner2 hasSize 2

        val catSettings = inner2["cat"] as Settings
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        expect that inner2 hasSize 2

        val catSettings = inner2["cat"] as Settings
        expect that catSettings["voice"] equalsTo "meow"

```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        expect that catSettings["voice"] equalsTo "meow"

        val dogSettings = inner2["dog"] as Settings
        expect that dogSettings["voice"] equalsTo "bark"
    }
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java


    abstract protected fun makeSettings(text: CharSequence): Settings

}
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        val settings = makeSettings(text)

        expect that settings hasSize 1

        val inner = settings["animal"] as Settings
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        expect that settings hasSize 1

        val inner = settings["animal"] as Settings
        expect that inner hasSize 3
        expect that inner["cat"] equalsTo "meow"
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java

        val inner = settings["animal"] as Settings
        expect that inner hasSize 3
        expect that inner["cat"] equalsTo "meow"
        expect that inner["dog"] equalsTo "bark"
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
class SettingsTextLoaderTest : SettingsLoaderTest(), UnitTest {

    override fun makeSettings(text: CharSequence): Settings {
        val loader = SettingsLoader()
        return loader.load(text)
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        val settings = makeSettings(text)

        expect that settings hasSize 1

        val inner1 = settings["live"] as Settings
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        expect that settings hasSize 1

        val inner1 = settings["live"] as Settings
        expect that inner1 hasSize 1

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java

        val inner1 = settings["live"] as Settings
        expect that inner1 hasSize 1

        val inner2 = inner1["animal"] as Settings
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        expect that inner1 hasSize 1

        val inner2 = inner1["animal"] as Settings
        expect that inner2 hasSize 3

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java

        val inner2 = inner1["animal"] as Settings
        expect that inner2 hasSize 3

        val catSettings = inner2["cat"] as Settings
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        expect that inner2 hasSize 3

        val catSettings = inner2["cat"] as Settings
        expect that catSettings["voice"] equalsTo "meow"

```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        expect that catSettings["voice"] equalsTo "meow"

        val dogSettings = inner2["dog"] as Settings
        expect that dogSettings["voice"] equalsTo "bark"
    }
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        val settings = makeSettings(text)

        expect that settings hasSize 1

        val inner1 = settings["live"] as Settings
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        expect that settings hasSize 1

        val inner1 = settings["live"] as Settings
        expect that inner1 hasSize 1

```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java

        val inner1 = settings["live"] as Settings
        expect that inner1 hasSize 1

        val inner2 = inner1["animal"] as Settings
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        expect that inner1 hasSize 1

        val inner2 = inner1["animal"] as Settings
        expect that inner2 hasSize 3
        expect that inner2["cat"] equalsTo "meow"
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java

        val inner2 = inner1["animal"] as Settings
        expect that inner2 hasSize 3
        expect that inner2["cat"] equalsTo "meow"
        expect that inner2["dog"] equalsTo "bark"
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
    }

    override fun makeSettings(text: CharSequence): Settings {
        val fileName = "File" + (++counter) + ".txt"
        val file = dir.resolve(fileName)
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
                """.trimMargin()
        val settings = makeSettings(text)
        expect that settings hasSize 3
        expect that settings["cat"] equalsTo "meow"
        expect that settings["dog"] equalsTo "bark"
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        val settings = makeSettings(text)

        expect that settings hasSize 1

        val inner = settings["animal"] as Settings
```

### KotlinAnnotator
Unresolved reference: Settings
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java
        expect that settings hasSize 1

        val inner = settings["animal"] as Settings
        expect that inner hasSize 3
        expect that inner["cat"] equalsTo "meow"
```

### KotlinAnnotator
Overload resolution ambiguity: public final inline infix fun that(x: NavigableSet?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: SortedSet?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntStream?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongStream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Stream?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Array?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ByteArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: CharArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: DoubleArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: FloatArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: IntArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: LongArray?): Subject\> defined in lb.yaka.gears.Expect public final infix fun that(x: ShortArray?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Collection?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Iterable?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: List?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Set?): Subject\> defined in lb.yaka.gears.Expect public final inline infix fun that(x: Sequence?): Subject\> defined in lb.yaka.gears.Expect
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java

        val inner = settings["animal"] as Settings
        expect that inner hasSize 3
        expect that inner["cat"] equalsTo "meow"
        expect that inner["dog"] equalsTo "bark"
```

## RuleId[ruleID=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java

  @Nullable
  protected static <W> JdbcValueGetter<W> lookForArrayGetter(@NotNull final Class<W> clazz) {
    return new ArrayGetter<W>(clazz);
  }
```

## RuleId[ruleID=ConvertSecondaryConstructorToPrimary]
### ConvertSecondaryConstructorToPrimary
Secondary constructor should be converted to a primary one
in `dekaf-main/src/base/BaseQueryRunner.kt`
#### Snippet
```java


    constructor(session: BaseSession, seance: InterSeance, queryText: String, layout: QueryLayout<T>) {
        this.session = session
        this.seance = seance
```

### ConvertSecondaryConstructorToPrimary
Secondary constructor should be converted to a primary one
in `dekaf-main/src/base/BasePerformer.kt`
#### Snippet
```java
class BeyondTransactionPerformer : BasePerformer {

    constructor(session: BaseSession) : super(session)

}
```

### ConvertSecondaryConstructorToPrimary
Secondary constructor should be converted to a primary one
in `dekaf-main/src/base/BasePerformer.kt`
#### Snippet
```java


    constructor(session: BaseSession) {
        this.baseSession = session
        this.interSession = baseSession.ensureInterSession()
```

### ConvertSecondaryConstructorToPrimary
Secondary constructor should be converted to a primary one
in `dekaf-main/src/base/BasePerformer.kt`
#### Snippet
```java
    private var ended: Boolean = false

    constructor(session: BaseSession) : super(session) {
        interSession.beginTransaction()
    }
```

### ConvertSecondaryConstructorToPrimary
Secondary constructor should be converted to a primary one
in `dekaf-main/src/queries/impl/TableListResultCollector.kt`
#### Snippet
```java
class TableListResultCollector<R, B>: TableResultCollector<List<R>, R, B> {

    constructor(handler: RowHandler<R, B>) : super(handler)


```

### ConvertSecondaryConstructorToPrimary
Secondary constructor should be converted to a primary one
in `dekaf-main/src/queries/impl/RowArrayNHandler.kt`
#### Snippet
```java
    

    constructor(baseClass: Class<E>, columnCount: Int) {
        this.baseClass = baseClass
        this.columnCount = columnCount
```

### ConvertSecondaryConstructorToPrimary
Secondary constructor should be converted to a primary one
in `dekaf-main/src/queries/impl/RowArrayMHandler.kt`
#### Snippet
```java


    constructor(baseClass: Class<E>, columnCount: Int, defaultValue: E) {
        this.baseClass = baseClass
        this.columnCount = columnCount
```

### ConvertSecondaryConstructorToPrimary
Secondary constructor should be converted to a primary one
in `dekaf-main/src/queries/impl/TableStreamResultCollector.kt`
#### Snippet
```java
class TableStreamResultCollector<R, B>: TableResultCollector<Stream<R>, R, B> {

    constructor(handler: RowHandler<R, B>) : super(handler)

    override fun retrieve(): Stream<R> {
```

### ConvertSecondaryConstructorToPrimary
Secondary constructor should be converted to a primary one
in `dekaf-main/src/queries/impl/RowFunHandler.kt`
#### Snippet
```java
    private val function: (C1?,C2?,C3?) -> R

    constructor(rowClass: Class<R>,
                class1: Class<C1>,
                class2: Class<C2>,
```

### ConvertSecondaryConstructorToPrimary
Secondary constructor should be converted to a primary one
in `dekaf-main/src/queries/impl/RowFunHandler.kt`
#### Snippet
```java
    protected lateinit var cursor: InterMatrixCursor<Any?>

    constructor(rowClass: Class<R>) {
        this.rowClass = rowClass
    }
```

### ConvertSecondaryConstructorToPrimary
Secondary constructor should be converted to a primary one
in `dekaf-main/src/queries/impl/RowFunHandler.kt`
#### Snippet
```java
    private val function: (C1?,C2?) -> R

    constructor(rowClass: Class<R>,
                class1: Class<C1>,
                class2: Class<C2>,
```

### ConvertSecondaryConstructorToPrimary
Secondary constructor should be converted to a primary one
in `dekaf-main/src/queries/impl/TableIteratorResultCollector.kt`
#### Snippet
```java


    constructor(handler: RowHandler<R, B>) : super(handler)


```

### ConvertSecondaryConstructorToPrimary
Secondary constructor should be converted to a primary one
in `dekaf-main/src/queries/impl/TableArrayResultCollector.kt`
#### Snippet
```java
class TableArrayResultCollector<R, B>: TableResultCollector<Array<R>, R, B> {

    constructor(handler: RowHandler<R, B>) : super(handler)


```

### ConvertSecondaryConstructorToPrimary
Secondary constructor should be converted to a primary one
in `dekaf-main/src/simplext/SimplextTextReader.kt`
#### Snippet
```java
class SimplextTextReader<N> : SimplextReader<N> {

    constructor(rootNode: N, handler: (SimplextLine<N>) -> N) : super(rootNode, handler)


```

### ConvertSecondaryConstructorToPrimary
Secondary constructor should be converted to a primary one
in `dekaf-main/src/simplext/SimplextFileReader.kt`
#### Snippet
```java
class SimplextFileReader<N> : SimplextReader<N> {

    constructor(rootNode: N, handler: (SimplextLine<N>) -> N) : super(rootNode, handler)


```

### ConvertSecondaryConstructorToPrimary
Secondary constructor should be converted to a primary one
in `dekaf-main/src/queries/impl/TableResultCollector.kt`
#### Snippet
```java


    constructor(handler: RowHandler<R, B>) {
        this.handler = handler
    }
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`name.length() > 0` can be replaced with '!name.isEmpty()'
in `dekaf-inter/src/settings/Setting.java`
#### Snippet
```java

    public Setting(@NotNull final String name, @NotNull final Serializable value) {
        assert name.length() > 0 : "Name of a setting cannot be empty";
        assert name.trim().equals(name) : "Name of a setting cannot have trailing spaces";
        this.name = name;
```

### SizeReplaceableByIsEmpty
`str.length() == 0` can be replaced with 'str.isEmpty()'
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java
    Character getValue(@NotNull final ResultSet rset, final int index) throws SQLException {
      final String str = rset.getString(index);
      if (rset.wasNull() || str == null || str.length() == 0) {
        return null;
      }
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `dekaf-inter/src/settings/Setting.java`
#### Snippet
```java
    @Override
    public String toString() {
        return name + " = " + value.toString();
    }
    
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `dekaf-jdbc/src/utils/Numbers.java`
#### Snippet
```java
    String message =
        String.format("Unknown how to convert value (%s) of type %s to %s.",
                      number.toString(),
                      number.getClass().getCanonicalName(),
                      numberClass.getCanonicalName());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java
          String message =
              String.format("Array value fetching problem: unknown how to convert value (%s) of type %s to %s.",
                            x.toString(), xClass.getCanonicalName(), componentType.getCanonicalName());
          throw new IllegalStateException(message);
        }
```

## RuleId[ruleID=WrongPackageStatement]
### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.intf' does not correspond to the file path 'intf'
in `dekaf-inter/src/intf/InterCursor.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.intf;

public interface InterCursor extends AutoCloseable {
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.intf' does not correspond to the file path 'intf'
in `dekaf-inter/src/intf/InterColumnCursor.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.intf;

import org.jetbrains.annotations.Nullable;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.intf' does not correspond to the file path 'intf'
in `dekaf-inter/src/intf/InterIntsCursor.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.intf;

import org.jetbrains.annotations.Nullable;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.intf' does not correspond to the file path 'intf'
in `dekaf-inter/src/intf/InterLongsCursor.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.intf;

import org.jetbrains.annotations.Nullable;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.intf' does not correspond to the file path 'intf'
in `dekaf-inter/src/intf/InterServiceFactory.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.intf;


```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.intf' does not correspond to the file path 'intf'
in `dekaf-inter/src/intf/InterSession.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.intf;


```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.intf' does not correspond to the file path 'intf'
in `dekaf-inter/src/intf/InterMatrixCursor.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.intf;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.intf' does not correspond to the file path 'intf'
in `dekaf-inter/src/intf/InterSeance.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.intf;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.common' does not correspond to the file path 'common'
in `dekaf-inter/src/common/StatementCategory.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.common;

public enum StatementCategory {
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.intf' does not correspond to the file path 'intf'
in `dekaf-inter/src/intf/InterFacade.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.intf;

import org.jetbrains.annotations.ApiStatus;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.common' does not correspond to the file path 'common'
in `dekaf-inter/src/common/ParamType.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.common;

public enum ParamType {
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter' does not correspond to the file path ''
in `dekaf-inter/src/DekafInfo.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter;

import org.jetbrains.dekaf.inter.utils.Version;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.utils' does not correspond to the file path 'utils'
in `dekaf-inter/src/utils/EmptyIterator.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.utils;

import java.util.Iterator;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.common' does not correspond to the file path 'common'
in `dekaf-inter/src/common/ParamDirection.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.common;

public enum ParamDirection {
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/NoRowsException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/UnexpectedReflectionException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/DBConnectionException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/DBParameterSettingException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.utils' does not correspond to the file path 'utils'
in `dekaf-inter/src/utils/ArrayHacks.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.utils;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/DBAccessDeniedException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/StrippedSQLException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/DuplicateKeyException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/DBPreparingException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/DBFactoryException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/DBDriverException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.settings' does not correspond to the file path 'settings'
in `dekaf-inter/src/settings/Setting.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.settings;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/UnhandledTypeException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/DBSessionIsClosedException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/DBTransactionIsAlreadyStartedException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/DBParameterHandlingException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/DBInitializationException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.common' does not correspond to the file path 'common'
in `dekaf-inter/src/common/ParamDef.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.common;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/DBColumnAccessDeniedException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/DBFetchingException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/DBPerformingException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/DBSchemaAccessDeniedException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/DBLoginFailedException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/DBTransactionException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/UnknownDBException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/StrippedUnknownException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/DBIsNotConnected.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/UnexpectedDBException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/NoTableOrViewException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/DbmsUnsupportedFeatureException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/DBServiceIsNotActiveException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.jdbc.impl' does not correspond to the file path 'impl'
in `dekaf-jdbc/src/impl/JdbcRowsCollector.java`
#### Snippet
```java
package org.jetbrains.dekaf.jdbc.impl;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.utils' does not correspond to the file path 'utils'
in `dekaf-inter/src/utils/Version.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.utils;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.exceptions' does not correspond to the file path 'exceptions'
in `dekaf-inter/src/exceptions/DBException.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.exceptions;

import org.jetbrains.annotations.Contract;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.settings' does not correspond to the file path 'settings'
in `dekaf-inter/src/settings/Settings.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.settings;


```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.jdbc.impl' does not correspond to the file path 'impl'
in `dekaf-jdbc/src/impl/JdbcIntsCursor.java`
#### Snippet
```java
package org.jetbrains.dekaf.jdbc.impl;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.inter.utils' does not correspond to the file path 'utils'
in `dekaf-inter/src/utils/SimpleStringConvert.java`
#### Snippet
```java
package org.jetbrains.dekaf.inter.utils;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.jdbc.impl' does not correspond to the file path 'impl'
in `dekaf-jdbc/src/impl/JdbcStuff.java`
#### Snippet
```java
package org.jetbrains.dekaf.jdbc.impl;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.jdbc.impl' does not correspond to the file path 'impl'
in `dekaf-jdbc/src/impl/JdbcRowFetcher.java`
#### Snippet
```java
package org.jetbrains.dekaf.jdbc.impl;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.jdbc.impl' does not correspond to the file path 'impl'
in `dekaf-jdbc/src/impl/JdbcBaseCursor.java`
#### Snippet
```java
package org.jetbrains.dekaf.jdbc.impl;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.jdbc.impl' does not correspond to the file path 'impl'
in `dekaf-jdbc/src/impl/JdbcValueGetter.java`
#### Snippet
```java
package org.jetbrains.dekaf.jdbc.impl;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.jdbc.impl' does not correspond to the file path 'impl'
in `dekaf-jdbc/src/impl/JdbcSeance.java`
#### Snippet
```java
package org.jetbrains.dekaf.jdbc.impl;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.jdbc.impl' does not correspond to the file path 'impl'
in `dekaf-jdbc/src/impl/JdbcSession.java`
#### Snippet
```java
package org.jetbrains.dekaf.jdbc.impl;

import org.jetbrains.annotations.ApiStatus;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.jdbc.impl' does not correspond to the file path 'impl'
in `dekaf-jdbc/src/impl/JdbcServiceFactory.java`
#### Snippet
```java
package org.jetbrains.dekaf.jdbc.impl;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.jdbc.impl' does not correspond to the file path 'impl'
in `dekaf-jdbc/src/impl/JdbcLongsCursor.java`
#### Snippet
```java
package org.jetbrains.dekaf.jdbc.impl;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.jdbc.impl' does not correspond to the file path 'impl'
in `dekaf-jdbc/src/impl/JdbcParametersHandler.java`
#### Snippet
```java
package org.jetbrains.dekaf.jdbc.impl;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.jdbc.impl' does not correspond to the file path 'impl'
in `dekaf-jdbc/src/impl/JdbcFacade.java`
#### Snippet
```java
package org.jetbrains.dekaf.jdbc.impl;

import org.jetbrains.annotations.ApiStatus;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.jdbc.impl' does not correspond to the file path 'impl'
in `dekaf-jdbc/src/impl/JdbcUtil.java`
#### Snippet
```java
package org.jetbrains.dekaf.jdbc.impl;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.jdbc.impl' does not correspond to the file path 'impl'
in `dekaf-jdbc/src/impl/JdbcRowsCollectors.java`
#### Snippet
```java
package org.jetbrains.dekaf.jdbc.impl;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.jdbc.impl' does not correspond to the file path 'impl'
in `dekaf-jdbc/src/impl/JdbcColumnCursor.java`
#### Snippet
```java
package org.jetbrains.dekaf.jdbc.impl;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.jdbc.utils' does not correspond to the file path 'utils'
in `dekaf-jdbc/src/utils/NameAndClass.java`
#### Snippet
```java
package org.jetbrains.dekaf.jdbc.utils;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.jdbc.utils' does not correspond to the file path 'utils'
in `dekaf-jdbc/src/utils/Objects.java`
#### Snippet
```java
package org.jetbrains.dekaf.jdbc.utils;

import org.jetbrains.annotations.Contract;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.jdbc.impl' does not correspond to the file path 'impl'
in `dekaf-jdbc/src/impl/JdbcMatrixCursor.java`
#### Snippet
```java
package org.jetbrains.dekaf.jdbc.impl;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.jdbc.impl' does not correspond to the file path 'impl'
in `dekaf-jdbc/src/impl/JdbcRowFetchers.java`
#### Snippet
```java
package org.jetbrains.dekaf.jdbc.impl;

import org.jetbrains.annotations.NotNull;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.jdbc.utils' does not correspond to the file path 'utils'
in `dekaf-jdbc/src/utils/Numbers.java`
#### Snippet
```java
package org.jetbrains.dekaf.jdbc.utils;

import org.jetbrains.annotations.Contract;
```

### WrongPackageStatement
Package name 'org.jetbrains.dekaf.jdbc.impl' does not correspond to the file path 'impl'
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java
package org.jetbrains.dekaf.jdbc.impl;

import org.jetbrains.annotations.NotNull;
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `SimpleStringConvert` has no concrete subclass
in `dekaf-inter/src/utils/SimpleStringConvert.java`
#### Snippet
```java


public abstract class SimpleStringConvert {

    @NotNull
```

### AbstractClassNeverImplemented
Abstract class `JdbcUtil` has no concrete subclass
in `dekaf-jdbc/src/impl/JdbcUtil.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 */
abstract class JdbcUtil {


```

### AbstractClassNeverImplemented
Abstract class `Objects` has no concrete subclass
in `dekaf-jdbc/src/utils/Objects.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 **/
public abstract class Objects {

  @Contract("_,!null->!null; _,null->null")
```

### AbstractClassNeverImplemented
Abstract class `Numbers` has no concrete subclass
in `dekaf-jdbc/src/utils/Numbers.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 */
public abstract class Numbers {


```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `dekaf-inter/src/utils/SimpleStringConvert.java`
#### Snippet
```java
    private static int parseQuotedStringItemToList(final CharSequence text,
                                                   final int offset,
                                                   final ArrayList<String> container) {
        char q = text.charAt(offset);
        int n = text.length(), k = offset + 1;
```

### BoundedWildcard
Can generalize to `? super String`
in `dekaf-inter/src/utils/SimpleStringConvert.java`
#### Snippet
```java
    private static int parseSimpleStringItemToList(final CharSequence text,
                                                   final int offset,
                                                   final ArrayList<String> container) {
        int n = text.length(), k = offset, m = offset;
        while (k < n) {
```

## RuleId[ruleID=ReplaceJavaStaticMethodWithKotlinAnalog]
### ReplaceJavaStaticMethodWithKotlinAnalog
Should be replaced with Kotlin function
in `dekaf-main/src/base/BaseQueryRunner.kt`
#### Snippet
```java
    
    override fun run(vararg paramValues: Any?): T {
        val params: List<Any?>? = if (paramValues.isNotEmpty()) Arrays.asList(*paramValues) else null
        seance.prepare(queryText, StatementCategory.stmtQuery, null)
        seance.execute(params)
```

### ReplaceJavaStaticMethodWithKotlinAnalog
Should be replaced with Kotlin function
in `dekaf-main/src/util/TextFun.kt`
#### Snippet
```java
    if (n <= limitLength && b < 0) return this

    val limit = Math.min(b, limitLength)
    return if (b < 0) "${this.subSequence(0, limit)}... (a string with size $n)"
           else "${this.subSequence(0, limit)}... (a text with size $n with line breaks)"
```

### ReplaceJavaStaticMethodWithKotlinAnalog
Should be replaced with Kotlin function
in `dekaf-main/src/simplext/SimplextReader.kt`
#### Snippet
```java
    protected fun processLine(buffer: CharSequence, from: Int, till: Int) {
        lastLine++
        val n = min(buffer.length, till)
        var p = from
        if (p >= n) return
```

### ReplaceJavaStaticMethodWithKotlinAnalog
Should be replaced with Kotlin function
in `test-utils/src/TestConsoleFun.kt`
#### Snippet
```java
fun say(text: String) {
    synchronized(printLock) {
        System.out.println(text)
        System.out.flush()
    }
```

### ReplaceJavaStaticMethodWithKotlinAnalog
Should be replaced with Kotlin function
in `test-utils/src/TestConsoleFun.kt`
#### Snippet
```java
fun halt(errorCode: Int): Nothing {
    Thread.sleep(40L)
    System.exit(errorCode)
    throw Exception("Must be halted with exit code: $errorCode")
}
```

### ReplaceJavaStaticMethodWithKotlinAnalog
Should be replaced with Kotlin function
in `test-utils/src/SystemTest.kt`
#### Snippet
```java

        private fun deleteTemporaryDirectoryRecursively(dir: Path) {
            System.out.println("Going to delete the temporary directory: $dir")
            val pathsToDelete =
                    Files.walk(dir)
```

### ReplaceJavaStaticMethodWithKotlinAnalog
Should be replaced with Kotlin function
in `test-utils/src/SystemTest.kt`
#### Snippet
```java
                if (path.isFile()) filesCount++
            }
            System.out.println("\tit contains $dirsCount sub-directories and $filesCount files")

            for (path in pathsToDelete) {
```

### ReplaceJavaStaticMethodWithKotlinAnalog
Should be replaced with Kotlin function
in `test-utils/src/SystemTest.kt`
#### Snippet
```java
                Files.deleteIfExists(path)
            }
            System.out.println("\tdone.")
        }

```

### ReplaceJavaStaticMethodWithKotlinAnalog
Should be replaced with Kotlin function
in `dekaf-main-test/src/queries/QueryLayoutTest.kt`
#### Snippet
```java
        expect that array[3] hasSize 4
        
        val list: List<Array<out Number>> = Arrays.asList(*array)
        checkList4x4(list)
    }
```

## RuleId[ruleID=NullableProblems]
### NullableProblems
Primitive type members cannot be annotated
in `dekaf-inter/src/intf/InterIntsCursor.java`
#### Snippet
```java
    void setDefaultValue(int defaultValue);

    @Nullable
    int[] fetchPortion();

```

### NullableProblems
Primitive type members cannot be annotated
in `dekaf-inter/src/intf/InterLongsCursor.java`
#### Snippet
```java
    long[] fetchPortion();

    @Nullable
    long[] fetchRow();

```

### NullableProblems
Primitive type members cannot be annotated
in `dekaf-inter/src/intf/InterLongsCursor.java`
#### Snippet
```java
    void setDefaultValue(long defaultValue);

    @Nullable
    long[] fetchPortion();

```

### NullableProblems
Primitive type members cannot be annotated
in `dekaf-inter/src/intf/InterIntsCursor.java`
#### Snippet
```java
    int[] fetchPortion();

    @Nullable
    int[] fetchRow();

```

### NullableProblems
Primitive type members cannot be annotated
in `dekaf-inter/src/utils/Version.java`
#### Snippet
```java
   * @return array of elements, may be an empty array but never null.
   */
  @NotNull
  public int[] toArray() {
    final int n = elements.length;
```

### NullableProblems
Primitive type members cannot be annotated
in `dekaf-inter/src/utils/Version.java`
#### Snippet
```java


  @NotNull
  private final int[] elements;

```

### NullableProblems
Primitive type members cannot be annotated
in `dekaf-inter/src/utils/Version.java`
#### Snippet
```java
   * @return         the version.
   */
  public static Version of(@NotNull final int... elements) {
    int n = elements.length;
    while (n > 0 && elements[n-1] == 0) n--;
```

### NullableProblems
Primitive type members cannot be annotated
in `dekaf-inter/src/utils/Version.java`
#### Snippet
```java


  private Version(@NotNull final int[] elements) {
    this.elements = elements; // already copied
  }
```

### NullableProblems
Primitive type members cannot be annotated
in `dekaf-jdbc/src/impl/JdbcIntsCursor.java`
#### Snippet
```java
    }

    @Nullable
    @Override
    public int[] fetchRow() {
```

### NullableProblems
Primitive type members cannot be annotated
in `dekaf-jdbc/src/impl/JdbcIntsCursor.java`
#### Snippet
```java
    }

    @Override @Nullable
    public int[] fetchPortion() {
        if (end) return null;
```

### NullableProblems
Primitive type members cannot be annotated
in `dekaf-jdbc/src/impl/JdbcLongsCursor.java`
#### Snippet
```java
    }

    @Override @Nullable
    public long[] fetchPortion() {
        if (end) return null;
```

### NullableProblems
Primitive type members cannot be annotated
in `dekaf-jdbc/src/impl/JdbcLongsCursor.java`
#### Snippet
```java
    }

    @Nullable
    @Override
    public long[] fetchRow() {
```

### NullableProblems
Primitive type members cannot be annotated
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java

  static final class BinaryGetter extends JdbcValueGetter<byte[]> {
    @Nullable
    @Override
    byte[] getValue(@NotNull final ResultSet rset, final int index) throws SQLException {
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `static abstract`
in `dekaf-jdbc/src/impl/JdbcRowFetchers.java`
#### Snippet
```java


  public static abstract class ComplexFetcher<X> extends JdbcRowFetcher<X> {

    protected final NameAndClass[] components;
```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java


    final static BigDecimalGetter INSTANCE = new BigDecimalGetter();
  }

```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java


    final static ShortGetter INSTANCE = new ShortGetter();
  }

```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java

    private final static Short _1_ = Short.valueOf((short)1);
    private final static Short _0_ = Short.valueOf((short)0);

    final static BoolShortGetter INSTANCE = new BoolShortGetter();
```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java


    final static IntGetter INSTANCE = new IntGetter();
  }

```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java


    final static DateGetter INSTANCE = new DateGetter();
  }

```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java


    final static BigDecimalGetter INSTANCE = new BigDecimalGetter();
  }

```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java


    final static TimeGetter INSTANCE = new TimeGetter();
  }

```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java
    }

    private final static Integer _1_ = Integer.valueOf((int)1);
    private final static Integer _0_ = Integer.valueOf((int)0);

```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java


    final static JavaDateGetter INSTANCE = new JavaDateGetter();
  }

```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java

    private final static Byte _1_ = Byte.valueOf((byte)1);
    private final static Byte _0_ = Byte.valueOf((byte)0);

    final static BoolByteGetter INSTANCE = new BoolByteGetter();
```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java
    }

    private final static Short _1_ = Short.valueOf((short)1);
    private final static Short _0_ = Short.valueOf((short)0);

```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java


    final static DoubleGetter INSTANCE = new DoubleGetter();
  }

```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java
    private final static Integer _0_ = Integer.valueOf((int)0);

    final static BoolIntGetter INSTANCE = new BoolIntGetter();
  }

```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java
    private final static Byte _0_ = Byte.valueOf((byte)0);

    final static BoolByteGetter INSTANCE = new BoolByteGetter();
  }

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java


  static abstract class AbstractArrayGetter<A> extends JdbcValueGetter<A> {
    @Nullable
    @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java


    final static CharGetter INSTANCE = new CharGetter();
  }

```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java
    private final static Short _0_ = Short.valueOf((short)0);

    final static BoolShortGetter INSTANCE = new BoolShortGetter();
  }

```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java


    final static TimestampGetter INSTANCE = new TimestampGetter();
  }

```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java


    final static LongGetter INSTANCE = new LongGetter();
  }

```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java


    final static ByteGetter INSTANCE = new ByteGetter();
  }

```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java


    final static GenericNumberGetter INSTANCE = new GenericNumberGetter();
  }

```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java


    final static FloatGetter INSTANCE = new FloatGetter();
  }

```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java
    }

    private final static Byte _1_ = Byte.valueOf((byte)1);
    private final static Byte _0_ = Byte.valueOf((byte)0);

```

### MissortedModifiers
Missorted modifiers `final static`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java

    private final static Integer _1_ = Integer.valueOf((int)1);
    private final static Integer _0_ = Integer.valueOf((int)0);

    final static BoolIntGetter INSTANCE = new BoolIntGetter();
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `dekaf-inter/src/exceptions/DBException.java`
#### Snippet
```java
  @Contract("null->null; !null->!null")
  @SuppressWarnings({"ThrowableResultOfMethodCallIgnored", "ThrowableInstanceNeverThrown"})
  private static Throwable stripException(final Throwable e) {
    if (e == null) return null;

```

### RedundantSuppression
Redundant suppression
in `dekaf-jdbc/src/impl/JdbcMatrixCursor.java`
#### Snippet
```java
            int n = md.getColumnCount();

            //noinspection unchecked
            getters = createArray(JdbcValueGetter.class, n);
            for (int i = 0; i < n; i++) {
```

### RedundantSuppression
Redundant suppression
in `dekaf-jdbc/src/impl/JdbcMatrixCursor.java`
#### Snippet
```java
            }

            //noinspection unchecked
            getters = createArray(JdbcValueGetter.class, n);
            for (int i = 0; i < n; i++) {
```

### RedundantSuppression
Redundant suppression
in `dekaf-jdbc/src/impl/JdbcMatrixCursor.java`
#### Snippet
```java
        for (int i = 0; i < n; i++) {
            JdbcValueGetter<? extends B> getter = getters[i];
            //noinspection ConstantConditions
            B value = getter.getValue(rset, i+1);
            row[i] = value != null ? value : defaultValue;
```

### RedundantSuppression
Redundant suppression
in `dekaf-jdbc/src/impl/JdbcRowFetchers.java`
#### Snippet
```java
    private void init(@NotNull final ResultSetMetaData md) throws SQLException {
      int n = Math.max(md.getColumnCount() - (position-1), 0);
      //noinspection unchecked
      getters = (JdbcValueGetter<Integer>[]) new JdbcValueGetter[n];
      for (int i = 0; i < n; i++) {
```

### RedundantSuppression
Redundant suppression
in `dekaf-jdbc/src/impl/JdbcRowFetchers.java`
#### Snippet
```java

      final int n = getters.length;
      //noinspection unchecked
      int[] array = new int[n];
      for (int j = 0; j < n; j++) {
```

### RedundantSuppression
Redundant suppression
in `dekaf-jdbc/src/impl/JdbcRowFetchers.java`
#### Snippet
```java
    private void init(@NotNull final ResultSetMetaData md) throws SQLException {
      int n = Math.max(md.getColumnCount() - (position-1), 0);
      //noinspection unchecked
      getters = (JdbcValueGetter<Long>[]) new JdbcValueGetter[n];
      for (int i = 0; i < n; i++) {
```

### RedundantSuppression
Redundant suppression
in `dekaf-jdbc/src/impl/JdbcRowFetchers.java`
#### Snippet
```java

      final int n = getters.length;
      //noinspection unchecked
      long[] array = new long[n];
      for (int j = 0; j < n; j++) {
```

### RedundantSuppression
Redundant suppression
in `dekaf-jdbc/src/impl/JdbcRowsCollectors.java`
#### Snippet
```java

      int n = list.size();
      //noinspection unchecked
      R[] array;
      if (n > 0) {
```

### RedundantSuppression
Redundant suppression
in `dekaf-jdbc/src/impl/JdbcSeance.java`
#### Snippet
```java

    private void assignTypedParams(final @NotNull Iterable<?> paramValues) {
        //noinspection ConstantConditions
        int n = paramsDefs.length;
        int k = 0;
```

### RedundantSuppression
Redundant suppression
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java
  @NotNull
  @SuppressWarnings("unchecked")
  static <W> JdbcValueGetter<W> of(final int jdbcType, @NotNull final Class<? extends W> clazz) {
    JdbcValueGetter<W> getter = find(jdbcType, clazz);
    if (getter != null) {
```

### RedundantSuppression
Redundant suppression
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java
  @Nullable
  @SuppressWarnings("unchecked")
  static <W> JdbcValueGetter<W> find(final int jdbcType, @NotNull final Class<? extends W> clazz) {
    JdbcValueGetter<?> getter = null;
    if (jdbcType != Types.OTHER) getter = SPECIFIC_GETTERS.get(new SpecificKey(jdbcType, clazz));
```

### RedundantSuppression
Redundant suppression
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
@file:Suppress("platform_class_mapped_to_kotlin", "RemoveRedundantQualifierName")

package org.jetbrains.dekaf.jdbcTest.impl

import lb.yaka.expectations.*
import lb.yaka.gears.*
import org.jetbrains.dekaf.inter.common.StatementCategory.stmtQuery
import org.jetbrains.dekaf.jdbc.impl.JdbcMatrixCursor
import org.jetbrains.dekaf.jdbcTest.JavaByte
import org.jetbrains.dekaf.jdbcTest.JavaInt
import org.jetbrains.dekaf.jdbcTest.JavaLong
import org.jetbrains.dekaf.jdbcTest.JavaShort
import org.jetbrains.dekaf.test.utils.*
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder


@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
class JdbcMatrixCursorTest : H2ConnectedTest() {

    @Test @Order(10)
    fun fetchRow() {
        val text = "select * from values (1, 1001, 1000001), (2, 2002, 2000002), (3, 3003, 3000003)"
        val r: Array<Number?>? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcMatrixCursor<Number> = seance.makeMatrixCursor(0, Number::class.java)
            cursor.prepare(arrayOf<Class<out Number>>(JavaByte::class.java, JavaShort::class.java, JavaLong::class.java))
            cursor.fetchRow()
        }

        expect that r iz notNull; r!!
        expect that r hasSize 3

        expect that r[0] iz JavaByte::class
        expect that r[1] iz JavaShort::class
        expect that r[2] iz JavaLong::class

        expect that r[0] equalsTo `1`
        expect that r[1] equalsTo 1001.toShort()
        expect that r[2] equalsTo 1000001L
    }

    @Test @Order(20)
    fun fetchPortion() {
        val text = "select * from values (1, 1001, 1000001), (2, 2002, 2000002), (3, 3003, 3000003)"
        val m = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcMatrixCursor<Number> = seance.makeMatrixCursor(0, Number::class.java)
            cursor.prepare(arrayOf<Class<out Number>>(JavaByte::class.java, JavaShort::class.java, JavaLong::class.java))
            cursor.fetchPortion()
        }

        expect that m iz notNull; m!!
        expect that m hasSize 3
        expect that m[0] hasSize 3

        expect that m[0][0] iz JavaByte::class
        expect that m[0][1] iz JavaShort::class
        expect that m[0][2] iz JavaLong::class
        expect that m[1][0] iz JavaByte::class
        expect that m[1][1] iz JavaShort::class
        expect that m[1][2] iz JavaLong::class
        expect that m[2][0] iz JavaByte::class
        expect that m[2][1] iz JavaShort::class
        expect that m[2][2] iz JavaLong::class

        expect that m[0][0] equalsTo `1`
        expect that m[1][0] equalsTo `2`
        expect that m[2][0] equalsTo `3`

        expect that m[0][1] equalsTo 1001.toShort()
        expect that m[1][1] equalsTo 2002.toShort()
        expect that m[2][1] equalsTo 3003.toShort()

        expect that m[0][2] equalsTo 1000001L
        expect that m[1][2] equalsTo 2000002L
        expect that m[2][2] equalsTo 3000003L
    }


    @Test @Order(30)
    fun portions() {
        val text = "select value from table(value int = (1,2,3,4,5,6,7,8,9,10,11,12))"
        session.openSeance().use { seance ->
            seance.setPortionSize(5)
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcMatrixCursor<JavaInt> = seance.makeMatrixCursor(0, JavaInt::class.java)
            cursor.prepare(arrayOf(JavaInt::class.java))

            val m1 = cursor.fetchPortion()

            expect that m1 iz notNull; m1!!
            expect that m1 hasSize 5

            expect that m1[0][0] equalsTo 1
            expect that m1[4][0] equalsTo 5

            val m2 = cursor.fetchPortion()

            expect that m2 iz notNull; m2!!
            expect that m2 hasSize 5

            expect that m2[0][0] equalsTo 6
            expect that m2[4][0] equalsTo 10

            val m3 = cursor.fetchPortion()

            expect that m3 iz notNull; m3!!
            expect that m3 hasSize 2

            expect that m3[0][0] equalsTo 11
            expect that m3[1][0] equalsTo 12

            val m4 = cursor.fetchPortion()

            expect that m4 iz Null
        }
    }


    @Test @Order(90)
    fun closeAtTheEnd() {
        val text = "select value from table(value int = (1,2,3,4,5,6,7))"
        session.openSeance().use { seance ->
            seance.setPortionSize(5)
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
            val cursor: JdbcMatrixCursor<JavaInt> = seance.makeMatrixCursor(0, JavaInt::class.java)
            cursor.prepare(arrayOf(JavaInt::class.java))

            expect that cursor.isClosed equalsTo false

            cursor.fetchPortion()

            expect that cursor.isClosed equalsTo false

            cursor.fetchPortion()

            expect that cursor.isClosed equalsTo true
        }
    }

}
```

### RedundantSuppression
Redundant suppression
in `dekaf-main/src/util/BooleanFun.kt`
#### Snippet
```java
@file:JvmName("BooleanFun")
@file:Suppress("UsePropertyAccessSyntax", "unused", "nothing_to_inline")

package org.jetbrains.dekaf.main.util


inline val Boolean.byte: Byte get() = if (this) 1.toByte() else 0.toByte()

inline val Boolean.int: Int get() = if (this) 1 else 0


/**
 * Returns the first argument when [this] is true and the second one otherwise.
 * A kind of lite replacement of the ternary operator.
 * @param onTrue what to return when [this] this true.
 * @param onFalse what to return when [this] this false.
 */
inline fun<V> Boolean.choose(onTrue: V, onFalse: V) = if (this) onTrue else onFalse

/**
 * Returns the argument when [this] is true and null otherwise.
 */
inline operator fun<V> Boolean.rem(value: V?): V? = if (this) value else null


/**
 * When this is true performs the given lambda and return the result,
 * otherwise returns null.
 */
inline fun<T> Boolean.then(crossinline producer: () -> T): T? = if (this) producer() else null

/**
 * When this is false performs the given lambda and return the result,
 * in case of true returns null.
 */
inline fun<T> Boolean.otherwise(crossinline producer: () -> T): T? = if (!this) producer() else null

```

### RedundantSuppression
Redundant suppression
in `test-utils/src/SystemTest.kt`
#### Snippet
```java
@Suppress("unused")
    companion object {

        //@TempDir @JvmStatic
        var rootTempDir: Path? = null

        @JvmStatic
        @BeforeAll
        fun createRootTemporaryDirectory() {
            val td = Files.createTempDirectory("DekafTesting-")
            assert(Files.exists(td))
            assert(Files.isDirectory(td))
            rootTempDir = td
        }

        @JvmStatic
        @AfterAll
        fun dropRootTemporaryDirectory() {
            val td = rootTempDir ?: return
            deleteTemporaryDirectoryRecursively(td)
        }

        private fun deleteTemporaryDirectoryRecursively(dir: Path) {
            System.out.println("Going to delete the temporary directory: $dir")
            val pathsToDelete =
                    Files.walk(dir)
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList())

            var dirsCount = 0
            var filesCount = 0
            for (path in pathsToDelete) {
                if (path.isDirectory()) dirsCount++
                if (path.isFile()) filesCount++
            }
            System.out.println("\tit contains $dirsCount sub-directories and $filesCount files")

            for (path in pathsToDelete) {
                Files.deleteIfExists(path)
            }
            System.out.println("\tdone.")
        }


        @JvmStatic
        fun getTempDir(): Path {
            val trace: Array<StackTraceElement> = Thread.currentThread().stackTrace
            assert(trace.size >= 4)
            val entry: StackTraceElement = trace[2]
            val longName = entry.className
            val lastPoint = longName.lastIndexOf('.')
            val shortName = if (lastPoint >= 0) longName.substring(lastPoint + 1) else longName
            return getTempDir(shortName)
        }

        @JvmStatic
        fun getTempDir(name: String): Path {
            val rootTempDir = rootTempDir
                              ?: throw IllegalStateException("The temporary directory was not created yet")
            require(rootTempDir.exists()) { "The temporary directory ($rootTempDir) should exist" }
            require(rootTempDir.isDirectory()) { "The temporary directory ($rootTempDir) should be a directory" }
            val innerDir = rootTempDir.resolve(name)
            Files.createDirectory(innerDir)
            assert(innerDir.exists() && innerDir.isDirectory()) { "Cannot create sub-directory properly" }
            return innerDir
        }

    }
```

### RedundantSuppression
Redundant suppression
in `tests-basic/src/TestLaunch.kt`
#### Snippet
```java
@file:Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")

package org.jetbrains.dekaf.tests.basic

import org.jetbrains.dekaf.test.utils.blame
import org.jetbrains.dekaf.test.utils.halt
import org.jetbrains.dekaf.test.utils.say
import org.jetbrains.dekaf.test.utils.teamcity.TeamCityListener
import org.jetbrains.dekaf.test.utils.teamcity.TeamCityMessages
import org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage
import org.junit.platform.launcher.Launcher
import org.junit.platform.launcher.LauncherDiscoveryRequest
import org.junit.platform.launcher.TagFilter.includeTags
import org.junit.platform.launcher.TestPlan
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder
import org.junit.platform.launcher.core.LauncherFactory
import org.junit.platform.launcher.listeners.SummaryGeneratingListener
import org.junit.platform.launcher.listeners.TestExecutionSummary
import java.nio.file.Files
import java.nio.file.Path


object TestLaunch {

    const val jarsDir = "./jars"
    const val jarsNameSuffix = "-test.jar"


    init {
        TeamCityMessages.messageConsumer = ::say
    }


    @JvmStatic
    fun main(args: Array<String>) {

        if (args.isEmpty()) {
            blame("Specify the tag expression\n")
            return
        }
        if (args.size > 1) {
            blame("Too many arguments.\nSpecify the tag expression as the first argument.\n")
            return
        }

        launchTests(args[0])
    }


    private fun launchTests(tagExpressions: String) {
        say("Tag expression: $tagExpressions")
        val request: LauncherDiscoveryRequest = LauncherDiscoveryRequestBuilder.request()
            .selectors(selectPackage("org.jetbrains.dekaf"))
            .filters(includeTags(tagExpressions))
            .build()
        val launcher: Launcher = LauncherFactory.create()
        val testPlan: TestPlan = launcher.discover(request)
        val listener1 = TeamCityListener()
        val listener2 = SummaryGeneratingListener()
        launcher.registerTestExecutionListeners(listener1, listener2)
        launcher.execute(testPlan)
        val summary: TestExecutionSummary = listener2.summary

        val message = "\n" +
                      "========== SUMMARY ==========\n" +
                      "  All found containers:  ${summary.containersFoundCount}\n" +
                      "  Started containers:    ${summary.containersStartedCount}\n" +
                      "  Successful containers: ${summary.containersSucceededCount}\n" +
                      "  Skipped containers:    ${summary.containersSkippedCount}\n" +
                      "  Failed containers:     ${summary.containersFailedCount}\n" +
                      "  Aborted containers:    ${summary.containersAbortedCount}\n" +
                      "-----------------------------\n" +
                      "  All found tests:       ${summary.testsFoundCount}\n" +
                      "  Started tests:         ${summary.testsStartedCount}\n" +
                      "  Successful tests:      ${summary.testsSucceededCount}\n" +
                      "  Skipped tests:         ${summary.testsSkippedCount}\n" +
                      "  Failed tests:          ${summary.testsFailedCount}\n" +
                      "  Aborted tests:         ${summary.testsAbortedCount}\n" +
                      "-----------------------------\n"
        
        say(message)
        Thread.sleep(10L)

        val totalOkCount = summary.testsSucceededCount
        val totalFailureCount = summary.totalFailureCount
        when {
            totalOkCount == 0L      -> {
                val message1 = if (summary.testsFoundCount == 0L) "No tests found." else "All tests failed."
                halt(message1, errorCode = 0x10)
            }
            totalFailureCount == 0L -> {
                say("OK\n")
            }
            else                    -> {
                halt("Total $totalFailureCount failures.", errorCode = 0x02)
            }
        }
    }


    private val Path.exists: Boolean
        get() = Files.exists(this)


}
```

## RuleId[ruleID=RedundantVisibilityModifier]
### RedundantVisibilityModifier
Redundant visibility modifier
in `dekaf-main/src/pool/ServicePool.kt`
#### Snippet
```java
        }

        internal fun passivate() {
            active = false
            activeServices.decrementAndGet()
```

### RedundantVisibilityModifier
Redundant visibility modifier
in `dekaf-main/src/pool/ServicePool.kt`
#### Snippet
```java
            private set

        internal fun activate(): S {
            active = true
            activeServices.incrementAndGet()
```

### RedundantVisibilityModifier
Redundant visibility modifier
in `dekaf-main/src/pool/ServicePool.kt`
#### Snippet
```java
        }

        internal fun updateTime() {
            last = now()
        }
```

## RuleId[ruleID=LiftReturnOrAssignment]
### LiftReturnOrAssignment
'Return' can be lifted out of 'if'
in `dekaf-main/src/util/TextFun.kt`
#### Snippet
```java
infix fun CharSequence.splitToPair(delimiter: Char): Pair<CharSequence, CharSequence> {
    val p = this.indexOf(delimiter)
    if (p >= 0) {
        // delimiter found
        val s1 = subSequence(0, p)
```

### LiftReturnOrAssignment
'Return' can be lifted out of 'if'
in `dekaf-main/src/settings/SettingsLoader.kt`
#### Snippet
```java
                val path = decodeNamePath(pathStr)
                val value = parentBuilder[path]
                if (value == null) {
                    val innerBuilder = SettingsBuilder()
                    parentBuilder[path] = innerBuilder
```

## RuleId[ruleID=SortModifiers]
### SortModifiers
Non-canonical modifiers order
in `dekaf-main-test/src/settings/SettingsLoaderTest.kt`
#### Snippet
```java


    abstract protected fun makeSettings(text: CharSequence): Settings

}
```

## RuleId[ruleID=RedundantSemicolon]
### RedundantSemicolon
Redundant semicolon
in `dekaf-main/src/queries/impl/TableStreamResultCollector.kt`
#### Snippet
```java
        if (!iterator.hasNext()) return Stream.empty()

        val spliterator = Spliterators.spliteratorUnknownSize(iterator, 0);
        val stream = StreamSupport.stream(spliterator, false)
        stream.onClose { cursor.close() }
```

### RedundantSemicolon
Redundant semicolon
in `test-utils/src/teamcity/TeamCityMessages.kt`
#### Snippet
```java
        val w = StringWriter(4096)
        this.printStackTrace(java.io.PrintWriter(w))
        return w.buffer.toString();
    }

```

## RuleId[ruleID=ReplacePutWithAssignment]
### ReplacePutWithAssignment
map.put() should be converted to assignment
in `dekaf-main/src/pool/ServicePool.kt`
#### Snippet
```java
        val service: S = openService()
        val handle = Handle(service)
        services.put(service, handle)
        return handle
    }
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `dekaf-jdbc/src/impl/JdbcUtil.java`
#### Snippet
```java
    }

    System.err.println(message);
  }

```

## RuleId[ruleID=RedundantNullableReturnType]
### RedundantNullableReturnType
'r' is always non-null type
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
    fun fetchSingleNull() {
        val text = "select cast(null as bigint) as V"
        val r: Array<JavaLong?>? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### RedundantNullableReturnType
'r' is always non-null type
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
    fun fetchSingleValue() {
        val text = "select * from values (1000001, 'labuda')"
        val r: Array<JavaLong?>? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### RedundantNullableReturnType
'r' is always non-null type
in `dekaf-jdbc-test/tests/impl/JdbcColumnCursorTest.kt`
#### Snippet
```java
    fun fetchSingleEmpty() {
        val text = "select * from values (1) where 1 is null"
        val r: Array<JavaLong?>? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### RedundantNullableReturnType
'r' is always non-null type
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
    fun fetchSingleValue() {
        val text = "select * from values (1000001, 'labuda')"
        val r: LongArray? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### RedundantNullableReturnType
'r' is always non-null type
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
    fun fetchSingleEmpty() {
        val text = "select * from values (1) where 1 is null"
        val r: LongArray? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### RedundantNullableReturnType
'r' is always non-null type
in `dekaf-jdbc-test/tests/impl/JdbcLongsCursorTest.kt`
#### Snippet
```java
    fun fetchSingleNull() {
        val text = "select cast(null as bigint) as V"
        val r: LongArray? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### RedundantNullableReturnType
'r' is always non-null type
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
    fun fetchSingleNull() {
        val text = "select cast(null as bigint) as V"
        val r: IntArray? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### RedundantNullableReturnType
'r' is always non-null type
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
    fun fetchSingleValue() {
        val text = "select * from values (1000001, 'labuda')"
        val r: IntArray? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### RedundantNullableReturnType
'r' is always non-null type
in `dekaf-jdbc-test/tests/impl/JdbcIntsCursorTest.kt`
#### Snippet
```java
    fun fetchSingleEmpty() {
        val text = "select * from values (1) where 1 is null"
        val r: IntArray? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

### RedundantNullableReturnType
'r' is always non-null type
in `dekaf-jdbc-test/tests/impl/JdbcMatrixCursorTest.kt`
#### Snippet
```java
    fun fetchRow() {
        val text = "select * from values (1, 1001, 1000001), (2, 2002, 2000002), (3, 3003, 3000003)"
        val r: Array<Number?>? = session.openSeance().use { seance ->
            seance.prepare(text, stmtQuery, null)
            seance.execute(null)
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dekaf-inter/src/utils/Version.java`
#### Snippet
```java
  public static Version of(@NotNull final String string) {
    ArrayList<Integer> b = new ArrayList<Integer>(5);
    final String[] substrings = string.split("[.,\\-_ ]|(?<=\\d)(?!\\d)|(?<!\\d)(?=\\d)");
    for (String ss : substrings) {
      String ss2 = ss.trim().toLowerCase(Locale.ENGLISH);
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `dekaf-jdbc/src/impl/JdbcParametersHandler.java`
#### Snippet
```java
        stmt.setString(index, (String) object);
      }
      else if (object instanceof java.sql.Date) {
        setter = "setDate";
        stmt.setDate(index, (java.sql.Date) object);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `dekaf-jdbc/src/impl/JdbcParametersHandler.java`
#### Snippet
```java
      else if (object instanceof java.sql.Date) {
        setter = "setDate";
        stmt.setDate(index, (java.sql.Date) object);
      }
      else if (object instanceof Timestamp) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `dekaf-jdbc/src/impl/JdbcParametersHandler.java`
#### Snippet
```java
        stmt.setTimestamp(index, (Timestamp) object);
      }
      else if (object instanceof java.sql.Time) {
        setter = "setTime";
        stmt.setTime(index, (java.sql.Time) object);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `dekaf-jdbc/src/impl/JdbcParametersHandler.java`
#### Snippet
```java
      else if (object instanceof java.sql.Time) {
        setter = "setTime";
        stmt.setTime(index, (java.sql.Time) object);
      }
      else if (object instanceof java.util.Date) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `dekaf-jdbc/src/impl/JdbcParametersHandler.java`
#### Snippet
```java
        stmt.setTime(index, (java.sql.Time) object);
      }
      else if (object instanceof java.util.Date) {
        setter = "setTimestamp";
        stmt.setTimestamp(index, new Timestamp(((java.util.Date) object).getTime()));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `dekaf-jdbc/src/impl/JdbcParametersHandler.java`
#### Snippet
```java
      else if (object instanceof java.util.Date) {
        setter = "setTimestamp";
        stmt.setTimestamp(index, new Timestamp(((java.util.Date) object).getTime()));
      }
      else if (object instanceof byte[]) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java
    @Override
    @Nullable
    java.sql.Date getValue(@NotNull final ResultSet rset, final int index) throws SQLException {
      final java.sql.Date date = rset.getDate(index);
      return date != null ? new Date(date.getTime()) : null;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java
    @Nullable
    java.sql.Date getValue(@NotNull final ResultSet rset, final int index) throws SQLException {
      final java.sql.Date date = rset.getDate(index);
      return date != null ? new Date(date.getTime()) : null;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java


  static final class TimeGetter extends JdbcValueGetter<java.sql.Time> {
    @Override
    @Nullable
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java
    @Override
    @Nullable
    java.sql.Time getValue(@NotNull final ResultSet rset, final int index) throws SQLException {
      final Time time = rset.getTime(index);
      return time != null ? new Time(time.getTime()) : null;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java


  static final class DateGetter extends JdbcValueGetter<java.sql.Date> {
    @Override
    @Nullable
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java
    NORMAL_GETTERS.put(Character.class, CharGetter.INSTANCE);
    NORMAL_GETTERS.put(java.util.Date.class, JavaDateGetter.INSTANCE);
    NORMAL_GETTERS.put(java.sql.Date.class, DateGetter.INSTANCE);
    NORMAL_GETTERS.put(Timestamp.class, TimestampGetter.INSTANCE);
    NORMAL_GETTERS.put(java.sql.Time.class, TimeGetter.INSTANCE);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java
    NORMAL_GETTERS.put(java.sql.Date.class, DateGetter.INSTANCE);
    NORMAL_GETTERS.put(Timestamp.class, TimestampGetter.INSTANCE);
    NORMAL_GETTERS.put(java.sql.Time.class, TimeGetter.INSTANCE);
    NORMAL_GETTERS.put(Object.class, ObjectGetter.INSTANCE);
    NORMAL_GETTERS.put(byte[].class, ArrayOfByteGetter.INSTANCE);
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `dekaf-jdbc/src/impl/JdbcSeance.java`
#### Snippet
```java
        }
        else {
            hasInParams = hasOutParams = false;
            paramCount = 0;
        }
```

## RuleId[ruleID=UnusedReceiverParameter]
### UnusedReceiverParameter
Receiver parameter is never used
in `dekaf-main/src/settings/SettingsFun.kt`
#### Snippet
```java


val Setting.pair: Pair<String, Serializable>
    inline get() = Pair(name, value)

```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `DBParameterHandlingException()` of an abstract class should not be declared 'public'
in `dekaf-inter/src/exceptions/DBParameterHandlingException.java`
#### Snippet
```java
  }

  public DBParameterHandlingException(final @NotNull String message,
                                      final @NotNull Exception exception,
                                      final @NotNull String statementText) {
```

### NonProtectedConstructorInAbstractClass
Constructor `DBException()` of an abstract class should not be declared 'public'
in `dekaf-inter/src/exceptions/DBException.java`
#### Snippet
```java


  public DBException(@NotNull final String message,
                     @Nullable final Throwable cause,
                     @Nullable final String statementText) {
```

### NonProtectedConstructorInAbstractClass
Constructor `ComplexFetcher()` of an abstract class should not be declared 'public'
in `dekaf-jdbc/src/impl/JdbcRowFetchers.java`
#### Snippet
```java


    public ComplexFetcher(@NotNull final NameAndClass[] components) {
      this.components = components;

```

## RuleId[ruleID=MemberVisibilityCanBePrivate]
### MemberVisibilityCanBePrivate
Function 'processStream' could be private
in `dekaf-main/src/simplext/SimplextFileReader.kt`
#### Snippet
```java


    fun processStream(stream: Stream<String>) {
        var offset = 0
        for (line in stream) {
```

### MemberVisibilityCanBePrivate
Property 'offset' could be private
in `dekaf-main/src/simplext/SimplextLine.kt`
#### Snippet
```java
        val line: Int,
        val indent: Int,
        val offset: Int,
        val text: CharSequence

```

### MemberVisibilityCanBePrivate
Property 'pos' could be private
in `dekaf-main/src/simplext/SimplextLine.kt`
#### Snippet
```java
     * Position in the line of the first non-space character, starting from 1.
     */
    val pos: Int
        get() = indent + 1

```

### MemberVisibilityCanBePrivate
Property 'fileName' could be private
in `dekaf-main/src/settings/SettingsLoader.kt`
#### Snippet
```java
    var tabWidth = 8

    var fileName: String? = null

    var errorHandler: (Error) -> Unit = ::defaultErrorHandler
```

### MemberVisibilityCanBePrivate
Property 'tabWidth' could be private
in `dekaf-main/src/settings/SettingsLoader.kt`
#### Snippet
```java
class SettingsLoader {

    var tabWidth = 8

    var fileName: String? = null
```

### MemberVisibilityCanBePrivate
Property 'rootNode' could be private
in `dekaf-main/src/simplext/SimplextReader.kt`
#### Snippet
```java
         * Root node.
         */
        val rootNode: N,

        /**
```

### MemberVisibilityCanBePrivate
Function 'indexOf' could be private
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java


    fun indexOf(name: String): Int {
        val map = this.map
        if (map != null) {
```

### MemberVisibilityCanBePrivate
Function 'replace' could be private
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java
    }

    fun replace(index: Int, newValue: Serializable) {
        val oldEntry = entries[index]
        val newEntry = Setting(oldEntry.name, newValue)
```

### MemberVisibilityCanBePrivate
Property 'rootTempDir' could be private
in `test-utils/src/SystemTest.kt`
#### Snippet
```java

        //@TempDir @JvmStatic
        var rootTempDir: Path? = null

        @JvmStatic
```

### MemberVisibilityCanBePrivate
Property 'value' could be private
in `test-utils/src/teamcity/TeamCityListener.kt`
#### Snippet
```java


    val <T> Optional<T>.value: T? get() = if (isPresent) get() else null

}
```

### MemberVisibilityCanBePrivate
Property 'underTeamCity' could be private
in `test-utils/src/teamcity/TeamCityMessages.kt`
#### Snippet
```java
     * Whether we're under TeamCity.
     */
    val underTeamCity = System.getenv(teamcityDetectVarName) != null


```

### MemberVisibilityCanBePrivate
Function 'reportTestFailure' could be private
in `test-utils/src/teamcity/TeamCityMessages.kt`
#### Snippet
```java
    }

    fun reportTestFailure(testName: String, errorMessage: String, stackTrace: String) {
        if (underTeamCity)
            say("##teamcity[testFailed name='%s' message='%s' details='%s']",
```

### MemberVisibilityCanBePrivate
Function 'printConsumer' could be private
in `test-utils/src/teamcity/TeamCityMessages.kt`
#### Snippet
```java

    
    fun printConsumer(message: String) {
        println(message)
    }
```

## RuleId[ruleID=ConvertTryFinallyToUseCall]
### ConvertTryFinallyToUseCall
try-finally can be replaced with 'use()'
in `dekaf-main/src/db/DbSession.kt`
#### Snippet
```java
fun<X> DbSession.inTransaction(block: (DbTransaction) -> X): X {
    val transaction = this.beginTransaction()
    try {
        val result = block(transaction)
        transaction.commit()
```

### ConvertTryFinallyToUseCall
try-finally can be replaced with 'use()'
in `dekaf-main/src/db/DbFacade.kt`
#### Snippet
```java
fun<X> DbFacade.inSession(block: (DbSession) -> X): X {
    val session = openSession()
    try {
        return block(session)
    }
```

## RuleId[ruleID=PackageDirectoryMismatch]
### PackageDirectoryMismatch
Package directive does not match the file location
in `dekaf-inter-test/tests/settings/SettingTest.kt`
#### Snippet
```java
package org.jetbrains.dekaf.interTest.settings

import lb.yaka.expectations.*
```

### PackageDirectoryMismatch
Package directive does not match the file location
in `dekaf-inter-test/tests/utils/ArrayHacksTest.kt`
#### Snippet
```java
package com.jetbrains.dekaf.interTest.utils

import lb.yaka.expectations.equalsTo
```

### PackageDirectoryMismatch
Package directive does not match the file location
in `dekaf-inter-test/tests/utils/SimpleStringConvertTest.kt`
#### Snippet
```java
package com.jetbrains.dekaf.interTest.utils

import lb.yaka.expectations.containsExactly
```

### PackageDirectoryMismatch
Package directive does not match the file location
in `dekaf-inter-test/tests/settings/SettingsTest.kt`
#### Snippet
```java
package org.jetbrains.dekaf.interTest.settings

import lb.yaka.expectations.*
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `dekaf-main-test/src/base/UnitTestWithH2.kt`
#### Snippet
```java
    companion object {

        lateinit var dbFacade: BaseFacade

        @BeforeAll @JvmStatic
```

### EmptyMethod
The method is empty
in `test-utils/src/SystemTest.kt`
#### Snippet
```java

        //@TempDir @JvmStatic
        var rootTempDir: Path? = null

        @JvmStatic
```

## RuleId[ruleID=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `build.gradle`
#### Snippet
```java
def annotationsVersion   = '20.0.0'
def kotlinVersion        = '1.4.10'
def jUnitPlatformVersion = '1.6.2'
def jUnitJupiterVersion  = '5.6.2'
def h2Version            = '1.4.200'
```

### GroovyUnusedAssignment
Assignment is not used
in `build.gradle`
#### Snippet
```java
def libH2                       = "com.h2database:h2:$h2Version"

def outDir  = "$rootDir/out"
def jarsDir = "$rootDir/jars"

```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dekaf-jdbc/src/impl/JdbcIntsCursor.java`
#### Snippet
```java
public class JdbcIntsCursor extends JdbcBaseCursor implements InterIntsCursor {

    private int defaultValue = 0;

    protected JdbcIntsCursor(final @NotNull JdbcSeance seance, final @NotNull ResultSet rset) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dekaf-jdbc/src/impl/JdbcBaseCursor.java`
#### Snippet
```java

    protected boolean end = false;
    private boolean closed = false;


```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dekaf-jdbc/src/impl/JdbcBaseCursor.java`
#### Snippet
```java
    protected final ResultSet rset;

    protected boolean end = false;
    private boolean closed = false;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dekaf-jdbc/src/impl/JdbcSeance.java`
#### Snippet
```java
    protected boolean hasInParams  = false;
    protected boolean hasOutParams = false;
    protected int     paramCount   = 0;

    protected int affectedRows = 0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dekaf-jdbc/src/impl/JdbcSeance.java`
#### Snippet
```java

    @Nullable
    protected String statementText = null;

    protected int portionSize = 1000;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dekaf-jdbc/src/impl/JdbcSeance.java`
#### Snippet
```java

    @Nullable
    protected ParamDef[] paramsDefs = null;

    protected boolean hasInParams  = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dekaf-jdbc/src/impl/JdbcSeance.java`
#### Snippet
```java
    protected final JdbcSession session;

    protected PreparedStatement stmt = null;

    @NotNull
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dekaf-jdbc/src/impl/JdbcSeance.java`
#### Snippet
```java
    protected ResultSet rset;

    private boolean closed = false;

    private final Collection<JdbcBaseCursor> cursors = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dekaf-jdbc/src/impl/JdbcSeance.java`
#### Snippet
```java

    protected boolean hasInParams  = false;
    protected boolean hasOutParams = false;
    protected int     paramCount   = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dekaf-jdbc/src/impl/JdbcSeance.java`
#### Snippet
```java
    protected int     paramCount   = 0;

    protected int affectedRows = 0;

    @Nullable
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dekaf-jdbc/src/impl/JdbcSeance.java`
#### Snippet
```java
    protected ParamDef[] paramsDefs = null;

    protected boolean hasInParams  = false;
    protected boolean hasOutParams = false;
    protected int     paramCount   = 0;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dekaf-jdbc/src/impl/JdbcSession.java`
#### Snippet
```java

    private boolean autoCommit = false;
    private boolean inTransaction = false;
    private boolean closed = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dekaf-jdbc/src/impl/JdbcSession.java`
#### Snippet
```java
    private Connection connection;

    private boolean autoCommit = false;
    private boolean inTransaction = false;
    private boolean closed = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dekaf-jdbc/src/impl/JdbcSession.java`
#### Snippet
```java
    private boolean autoCommit = false;
    private boolean inTransaction = false;
    private boolean closed = false;


```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `dekaf-jdbc/src/impl/JdbcLongsCursor.java`
#### Snippet
```java
public class JdbcLongsCursor extends JdbcBaseCursor implements InterLongsCursor {

    private long defaultValue = 0L;

    protected JdbcLongsCursor(final @NotNull JdbcSeance seance, final @NotNull ResultSet rset) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dekaf-jdbc/src/impl/JdbcFacade.java`
#### Snippet
```java
    private ClassLoader driverClassLoader = this.getClass().getClassLoader();

    private Driver driver = null;


```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dekaf-jdbc/src/impl/JdbcFacade.java`
#### Snippet
```java

    @Nullable
    private String driverClassName = null;

    @Nullable
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dekaf-jdbc/src/impl/JdbcFacade.java`
#### Snippet
```java

    @Nullable
    private Settings jdbcParameters = null;


```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dekaf-jdbc/src/impl/JdbcFacade.java`
#### Snippet
```java

    @Nullable
    private String[] driverJars = null;

    @Nullable
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dekaf-jdbc/src/impl/JdbcFacade.java`
#### Snippet
```java

    @Nullable
    private String jdbcConnectionString = null;

    @Nullable
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dekaf-jdbc/src/impl/JdbcFacade.java`
#### Snippet
```java

    @Nullable
    private String driverPath = null;

    @Nullable
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dekaf-jdbc/src/impl/JdbcColumnCursor.java`
#### Snippet
```java

    @Nullable
    private JdbcValueGetter<C> getter = null;

    protected JdbcColumnCursor(final @NotNull JdbcSeance seance,
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dekaf-jdbc/src/impl/JdbcMatrixCursor.java`
#### Snippet
```java

    @Nullable
    private JdbcValueGetter<? extends B>[] getters = null;

    private B defaultValue;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dekaf-jdbc/src/impl/JdbcMatrixCursor.java`
#### Snippet
```java
    private final Class<? extends B> baseClass;

    private int columnCount = 0;

    @Nullable
```

## RuleId[ruleID=UnnecessaryVariable]
### UnnecessaryVariable
Variable used only in following return and can be inlined
in `dekaf-main/src/base/BaseFacade.kt`
#### Snippet
```java
    override fun openSession(): BaseSession {
        val interSession = pool.borrow()
        val session = BaseSession(this, interSession)
        return session
    }
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `dekaf-inter/src/utils/EmptyIterator.java`
#### Snippet
```java
    @Override
    public E next() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dekaf-inter/src/exceptions/DBException.java`
#### Snippet
```java
  @SuppressWarnings({"ThrowableResultOfMethodCallIgnored", "ThrowableInstanceNeverThrown"})
  private static Throwable stripException(final Throwable e) {
    if (e == null) return null;

    String className = e.getClass().getName();
```

### ReturnNull
Return of `null`
in `dekaf-inter/src/settings/Settings.java`
#### Snippet
```java
    public String[] getStrings(@NotNull String name) {
        Setting entry = getEntry(name);
        return entry != null ? entry.getAsStrings() : null;
    }

```

### ReturnNull
Return of `null`
in `dekaf-jdbc/src/impl/JdbcIntsCursor.java`
#### Snippet
```java
    @Override
    public int[] fetchRow() {
        if (end) return null;

        try {
```

### ReturnNull
Return of `null`
in `dekaf-jdbc/src/impl/JdbcIntsCursor.java`
#### Snippet
```java
            }
            else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `dekaf-jdbc/src/impl/JdbcIntsCursor.java`
#### Snippet
```java
    @Override @Nullable
    public int[] fetchPortion() {
        if (end) return null;

        int portionSize = seance.portionSize;
```

### ReturnNull
Return of `null`
in `dekaf-jdbc/src/impl/JdbcIntsCursor.java`
#### Snippet
```java
            end = true;
            close();
            return null;
        }
        else if (k < portionSize) {
```

### ReturnNull
Return of `null`
in `dekaf-jdbc/src/impl/JdbcLongsCursor.java`
#### Snippet
```java
    @Override @Nullable
    public long[] fetchPortion() {
        if (end) return null;

        int portionSize = seance.portionSize;
```

### ReturnNull
Return of `null`
in `dekaf-jdbc/src/impl/JdbcLongsCursor.java`
#### Snippet
```java
            end = true;
            close();
            return null;
        }
        else if (k < portionSize) {
```

### ReturnNull
Return of `null`
in `dekaf-jdbc/src/impl/JdbcLongsCursor.java`
#### Snippet
```java
    @Override
    public long[] fetchRow() {
        if (end) return null;

        try {
```

### ReturnNull
Return of `null`
in `dekaf-jdbc/src/impl/JdbcLongsCursor.java`
#### Snippet
```java
            }
            else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `dekaf-jdbc/src/impl/JdbcColumnCursor.java`
#### Snippet
```java
    @Override
    public C[] fetchRow() {
        if (end) return null;
        checkPrepared();

```

### ReturnNull
Return of `null`
in `dekaf-jdbc/src/impl/JdbcColumnCursor.java`
#### Snippet
```java
            }
            else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `dekaf-jdbc/src/impl/JdbcColumnCursor.java`
#### Snippet
```java
    @Override @Nullable
    public C[] fetchPortion() {
        if (end) return null;
        checkPrepared();

```

### ReturnNull
Return of `null`
in `dekaf-jdbc/src/impl/JdbcColumnCursor.java`
#### Snippet
```java
            end = true;
            close();
            return null;
        }
        else if (k < portionSize) {
```

### ReturnNull
Return of `null`
in `dekaf-jdbc/src/utils/Objects.java`
#### Snippet
```java
    }
    else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `dekaf-jdbc/src/impl/JdbcMatrixCursor.java`
#### Snippet
```java
    @Override
    public B[][] fetchPortion() {
        if (end) return null;
        checkPrepared();

```

### ReturnNull
Return of `null`
in `dekaf-jdbc/src/impl/JdbcMatrixCursor.java`
#### Snippet
```java
            end = true;
            close();
            return null;
        }
        else if (k < portionSize) {
```

### ReturnNull
Return of `null`
in `dekaf-jdbc/src/impl/JdbcMatrixCursor.java`
#### Snippet
```java
    @Override
    public B[] fetchRow() {
        if (end) return null;
        checkPrepared();

```

### ReturnNull
Return of `null`
in `dekaf-jdbc/src/utils/Numbers.java`
#### Snippet
```java
  @Contract(value = "!null -> !null; null -> null", pure = true)
  public static Number convertNumberSmartly(final BigDecimal decimal) {
    if (decimal == null) return null;
    if (decimal.equals(Numbers.DECIMAL_ZERO)) return BYTE_ZERO;

```

### ReturnNull
Return of `null`
in `dekaf-jdbc/src/utils/Numbers.java`
#### Snippet
```java
  @Contract(value = "_,!null -> !null; _,null -> null", pure = true)
  public static <N extends Number> N convertNumber(final Class<N> numberClass, final Number number) {
    if (number == null) return null;
    if (numberClass.isAssignableFrom(number.getClass())) return (N) number;

```

### ReturnNull
Return of `null`
in `dekaf-jdbc/src/impl/JdbcValueGetters.java`
#### Snippet
```java
    byte[] getValue(@NotNull final ResultSet rset, final int index) throws SQLException {
      final byte[] binaryValue = rset.getBytes(index);
      return rset.wasNull() ? null : binaryValue;
    }

```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-02-27-21-11-57.115.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `dekaf-inter/src/settings/Setting.java`
#### Snippet
```java
    public String[] getAsStrings() {
        CharSequence text = value instanceof CharSequence ? (CharSequence) value : value.toString();
        return importStringList(text).toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dekaf-jdbc/src/impl/JdbcSession.java`
#### Snippet
```java
        JdbcSeance[] seancesToClose;
        synchronized (seances) {
            seancesToClose = seances.toArray(new JdbcSeance[0]);
            seances.clear();
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dekaf-jdbc/src/impl/JdbcFacade.java`
#### Snippet
```java
        JdbcSession[] sessionsToClose;
        synchronized (sessions) {
            sessionsToClose = sessions.toArray(new JdbcSession[0]);
            sessions.clear();
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dekaf-jdbc/src/impl/JdbcRowsCollectors.java`
#### Snippet
```java
      else {
        //noinspection unchecked
        array = (R[]) new Object[0];
      }

```

## RuleId[ruleID=UseCompareMethod]
### UseCompareMethod
Expression can be replaced with 'Integer.compare'
in `dekaf-inter/src/utils/Version.java`
#### Snippet
```java

  private static int compare(final int x, final int y) {
    return x < y ? -1 : x > y ? +1 : 0;
  }

```

## RuleId[ruleID=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `NoRowsException` ends with 'Exception'
in `dekaf-inter/src/exceptions/NoRowsException.java`
#### Snippet
```java
 *
 **/
public class NoRowsException extends DBException {

  public NoRowsException(@NotNull final SQLException sqlException, @Nullable String statementText) {
```

### NonExceptionNameEndsWithException
Non-exception class name `DBConnectionException` ends with 'Exception'
in `dekaf-inter/src/exceptions/DBConnectionException.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 */
public class DBConnectionException extends DBException {

  public DBConnectionException(@NotNull final String message,
```

### NonExceptionNameEndsWithException
Non-exception class name `DBParameterSettingException` ends with 'Exception'
in `dekaf-inter/src/exceptions/DBParameterSettingException.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 */
public class DBParameterSettingException extends DBParameterHandlingException {

  public DBParameterSettingException(final @NotNull String message,
```

### NonExceptionNameEndsWithException
Non-exception class name `DBAccessDeniedException` ends with 'Exception'
in `dekaf-inter/src/exceptions/DBAccessDeniedException.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 **/
public class DBAccessDeniedException extends DBException {

  public DBAccessDeniedException(@NotNull final SQLException sqlException,
```

### NonExceptionNameEndsWithException
Non-exception class name `DuplicateKeyException` ends with 'Exception'
in `dekaf-inter/src/exceptions/DuplicateKeyException.java`
#### Snippet
```java
 *
 **/
public class DuplicateKeyException extends DBException {

  public DuplicateKeyException(@NotNull final SQLException sqlException,
```

### NonExceptionNameEndsWithException
Non-exception class name `DBPreparingException` ends with 'Exception'
in `dekaf-inter/src/exceptions/DBPreparingException.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 */
public class DBPreparingException extends DBException {
  public DBPreparingException(@NotNull final SQLException sqlException,
                              @Nullable String statementText) {
```

### NonExceptionNameEndsWithException
Non-exception class name `DBFactoryException` ends with 'Exception'
in `dekaf-inter/src/exceptions/DBFactoryException.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 */
public class DBFactoryException extends DBException {

  public DBFactoryException(@NotNull String message, @NotNull Exception exception) {
```

### NonExceptionNameEndsWithException
Non-exception class name `DBDriverException` ends with 'Exception'
in `dekaf-inter/src/exceptions/DBDriverException.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 */
public class DBDriverException extends DBException {

  public DBDriverException(@NotNull String message, @NotNull Exception exception) {
```

### NonExceptionNameEndsWithException
Non-exception class name `UnhandledTypeException` ends with 'Exception'
in `dekaf-inter/src/exceptions/UnhandledTypeException.java`
#### Snippet
```java
 *
 **/
public class UnhandledTypeException extends DBException {
  public UnhandledTypeException(@NotNull final String message, @Nullable String statementText) {
    super(message, statementText);
```

### NonExceptionNameEndsWithException
Non-exception class name `DBSessionIsClosedException` ends with 'Exception'
in `dekaf-inter/src/exceptions/DBSessionIsClosedException.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 */
public class DBSessionIsClosedException extends DBServiceIsNotActiveException {
  public DBSessionIsClosedException(@NotNull final String message) {
    super(message);
```

### NonExceptionNameEndsWithException
Non-exception class name `DBTransactionIsAlreadyStartedException` ends with 'Exception'
in `dekaf-inter/src/exceptions/DBTransactionIsAlreadyStartedException.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 */
public class DBTransactionIsAlreadyStartedException extends DBTransactionException {

  public DBTransactionIsAlreadyStartedException() {
```

### NonExceptionNameEndsWithException
Non-exception class name `DBParameterHandlingException` ends with 'Exception'
in `dekaf-inter/src/exceptions/DBParameterHandlingException.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 */
public abstract class DBParameterHandlingException extends DBException {

  protected DBParameterHandlingException(final @NotNull String message,
```

### NonExceptionNameEndsWithException
Non-exception class name `DBInitializationException` ends with 'Exception'
in `dekaf-inter/src/exceptions/DBInitializationException.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 */
public class DBInitializationException extends DBException {

  public DBInitializationException(@NotNull final String message,
```

### NonExceptionNameEndsWithException
Non-exception class name `DBColumnAccessDeniedException` ends with 'Exception'
in `dekaf-inter/src/exceptions/DBColumnAccessDeniedException.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 **/
public class DBColumnAccessDeniedException extends DBAccessDeniedException {

  public DBColumnAccessDeniedException(@NotNull final SQLException sqlException,
```

### NonExceptionNameEndsWithException
Non-exception class name `DBFetchingException` ends with 'Exception'
in `dekaf-inter/src/exceptions/DBFetchingException.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 */
public class DBFetchingException extends DBException {
  public DBFetchingException(@NotNull final SQLException sqlException,
                             @Nullable String statementText) {
```

### NonExceptionNameEndsWithException
Non-exception class name `DBPerformingException` ends with 'Exception'
in `dekaf-inter/src/exceptions/DBPerformingException.java`
#### Snippet
```java
 * @author Leonid Bushuev
 */
public class DBPerformingException extends DBException {

  public DBPerformingException(@NotNull final SQLException sqlException,
```

### NonExceptionNameEndsWithException
Non-exception class name `DBSchemaAccessDeniedException` ends with 'Exception'
in `dekaf-inter/src/exceptions/DBSchemaAccessDeniedException.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 **/
public class DBSchemaAccessDeniedException extends DBAccessDeniedException {

  public DBSchemaAccessDeniedException(@NotNull final SQLException sqlException,
```

### NonExceptionNameEndsWithException
Non-exception class name `DBLoginFailedException` ends with 'Exception'
in `dekaf-inter/src/exceptions/DBLoginFailedException.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 */
public class DBLoginFailedException extends DBConnectionException {

  public DBLoginFailedException(@NotNull final SQLException sqlException,
```

### NonExceptionNameEndsWithException
Non-exception class name `DBTransactionException` ends with 'Exception'
in `dekaf-inter/src/exceptions/DBTransactionException.java`
#### Snippet
```java


public class DBTransactionException extends DBException {

    public DBTransactionException(final @NotNull String message,
```

### NonExceptionNameEndsWithException
Non-exception class name `UnknownDBException` ends with 'Exception'
in `dekaf-inter/src/exceptions/UnknownDBException.java`
#### Snippet
```java
 * Unknown database error.
 */
public final class UnknownDBException extends DBException {

  public UnknownDBException(@NotNull final SQLException sqlException,
```

### NonExceptionNameEndsWithException
Non-exception class name `UnexpectedDBException` ends with 'Exception'
in `dekaf-inter/src/exceptions/UnexpectedDBException.java`
#### Snippet
```java
 * Unknown database error.
 */
public final class UnexpectedDBException extends DBException {

  public UnexpectedDBException(@NotNull final SQLException sqlException,
```

### NonExceptionNameEndsWithException
Non-exception class name `NoTableOrViewException` ends with 'Exception'
in `dekaf-inter/src/exceptions/NoTableOrViewException.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 */
public class NoTableOrViewException extends DBException {

  public NoTableOrViewException(@NotNull final SQLException sqlException,
```

### NonExceptionNameEndsWithException
Non-exception class name `DbmsUnsupportedFeatureException` ends with 'Exception'
in `dekaf-inter/src/exceptions/DbmsUnsupportedFeatureException.java`
#### Snippet
```java
 */

public class DbmsUnsupportedFeatureException extends DBException {

  public DbmsUnsupportedFeatureException(@NotNull final String message,
```

### NonExceptionNameEndsWithException
Non-exception class name `DBServiceIsNotActiveException` ends with 'Exception'
in `dekaf-inter/src/exceptions/DBServiceIsNotActiveException.java`
#### Snippet
```java
 * @author Leonid Bushuev from JetBrains
 */
public class DBServiceIsNotActiveException extends DBException {

  public DBServiceIsNotActiveException(@NotNull final String message) {
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `f != null` is always `true`
in `dekaf-jdbc/src/impl/JdbcRowFetchers.java`
#### Snippet
```java
          String name = components[i].name;
          Field f = getClassField(structClass, name);
          if (f != null) {
            f.setAccessible(true);
            fields[i] = f;
```

## RuleId[ruleID=UnusedSymbol]
### UnusedSymbol
Property "facades" is never used
in `dekaf-main/src/DbMaster.kt`
#### Snippet
```java
object DbMaster {

    private val facades = CopyOnWriteArrayList<InterFacade>()


```

### UnusedSymbol
Function "isInstanceOf" is never used
in `dekaf-main/src/util/ClassFun.kt`
#### Snippet
```java


inline infix fun Any?.isInstanceOf(klass: KClass<out Any>) =
        this != null && klass.isInstance(this)

```

### UnusedSymbol
Function "layRowArrayOf" is never used
in `dekaf-main/src/queries/Layouts.kt`
#### Snippet
```java


inline fun<reified E:Any> layRowArrayOf(columnCount: Int = 0): RowLayout<Array<out E?>, E?> =
        layRowArrayOf(E::class.java, columnCount)

```

### UnusedSymbol
Class "FieldByPositionRowLayout" is never used
in `dekaf-main/src/queries/QueryLayout.kt`
#### Snippet
```java
}

class FieldByPositionRowLayout<F:Any> (val fieldClass: Class<F>, val position: Int) : RowLayout<F, F>() {
    override fun makeRowHandler(): RowHandler<F, F> {
        TODO("not implemented yet")
```

### UnusedSymbol
Property "fieldClass" is never used
in `dekaf-main/src/queries/QueryLayout.kt`
#### Snippet
```java
}

class FieldByPositionRowLayout<F:Any> (val fieldClass: Class<F>, val position: Int) : RowLayout<F, F>() {
    override fun makeRowHandler(): RowHandler<F, F> {
        TODO("not implemented yet")
```

### UnusedSymbol
Property "position" is never used
in `dekaf-main/src/queries/QueryLayout.kt`
#### Snippet
```java
}

class FieldByPositionRowLayout<F:Any> (val fieldClass: Class<F>, val position: Int) : RowLayout<F, F>() {
    override fun makeRowHandler(): RowHandler<F, F> {
        TODO("not implemented yet")
```

### UnusedSymbol
Class "FieldByNameRowLayout" is never used
in `dekaf-main/src/queries/QueryLayout.kt`
#### Snippet
```java
}

class FieldByNameRowLayout<F:Any> (val fieldClass: Class<F>, val name: String) : RowLayout<F, F>() {
    override fun makeRowHandler(): RowHandler<F, F> {
        TODO("not implemented yet")
```

### UnusedSymbol
Property "fieldClass" is never used
in `dekaf-main/src/queries/QueryLayout.kt`
#### Snippet
```java
}

class FieldByNameRowLayout<F:Any> (val fieldClass: Class<F>, val name: String) : RowLayout<F, F>() {
    override fun makeRowHandler(): RowHandler<F, F> {
        TODO("not implemented yet")
```

### UnusedSymbol
Property "name" is never used
in `dekaf-main/src/queries/QueryLayout.kt`
#### Snippet
```java
}

class FieldByNameRowLayout<F:Any> (val fieldClass: Class<F>, val name: String) : RowLayout<F, F>() {
    override fun makeRowHandler(): RowHandler<F, F> {
        TODO("not implemented yet")
```

### UnusedSymbol
Property "pair" is never used
in `dekaf-main/src/settings/SettingsFun.kt`
#### Snippet
```java


val Setting.pair: Pair<String, Serializable>
    inline get() = Pair(name, value)

```

### UnusedSymbol
Property "line" is never used
in `dekaf-main/src/settings/SettingsLoader.kt`
#### Snippet
```java


    class Error (val line: Int, val message: String, val exception: Exception?)


```

### UnusedSymbol
Function "replace" is never used
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java

    @Throws(NoSuchSettingException::class)
    fun replace(name: String, newValue: Serializable) {
        val index = indexOf(name)
        if (index < 0) throw NoSuchSettingException("Attempting to replace a setting name '$name' but no setting")
```

### UnusedSymbol
Function "buildNestedSettingTo" is never used
in `dekaf-main/src/settings/SettingsBuilder.kt`
#### Snippet
```java


    private fun buildNestedSettingTo(container: ArrayList<Setting>, name: String) {
        val settings = build()
        if (settings.isNotEmpty) container += Setting(name, settings)
```

### UnusedSymbol
Function "isReadable" is never used
in `test-utils/src/FileFun.kt`
#### Snippet
```java
fun Path.isFile() = Files.isRegularFile(this)

fun Path.isReadable() = Files.isReadable(this)


```

### UnusedSymbol
Function "reportSuiteStarted" is never used
in `test-utils/src/teamcity/TeamCityMessages.kt`
#### Snippet
```java


    fun reportSuiteStarted(suiteName: String?) {
        if (suiteName == null) return
        if (underTeamCity)
```

### UnusedSymbol
Function "reportSuiteFinished" is never used
in `test-utils/src/teamcity/TeamCityMessages.kt`
#### Snippet
```java
    }

    fun reportSuiteFinished(suiteName: String?) {
        if (suiteName == null) return
        if (underTeamCity)
```

### UnusedSymbol
Property "jarsNameSuffix" is never used
in `tests-basic/src/TestLaunch.kt`
#### Snippet
```java

    const val jarsDir = "./jars"
    const val jarsNameSuffix = "-test.jar"


```

### UnusedSymbol
Property "exists" is never used
in `tests-basic/src/TestLaunch.kt`
#### Snippet
```java


    private val Path.exists: Boolean
        get() = Files.exists(this)

```

### UnusedSymbol
Property "jarsDir" is never used
in `tests-basic/src/TestLaunch.kt`
#### Snippet
```java
object TestLaunch {

    const val jarsDir = "./jars"
    const val jarsNameSuffix = "-test.jar"

```

### UnusedSymbol
Property "0" is never used
in `test-utils/src/NumberConsts.kt`
#### Snippet
```java


const val `0`: Byte = 0
const val `1`: Byte = 1
const val `2`: Byte = 2
```

### UnusedSymbol
Property "4" is never used
in `test-utils/src/NumberConsts.kt`
#### Snippet
```java
const val `2`: Byte = 2
const val `3`: Byte = 3
const val `4`: Byte = 4
const val `5`: Byte = 5
const val `6`: Byte = 6
```

### UnusedSymbol
Property "6" is never used
in `test-utils/src/NumberConsts.kt`
#### Snippet
```java
const val `4`: Byte = 4
const val `5`: Byte = 5
const val `6`: Byte = 6
const val `7`: Byte = 7
const val `8`: Byte = 8
```

### UnusedSymbol
Property "5" is never used
in `test-utils/src/NumberConsts.kt`
#### Snippet
```java
const val `3`: Byte = 3
const val `4`: Byte = 4
const val `5`: Byte = 5
const val `6`: Byte = 6
const val `7`: Byte = 7
```

## RuleId[ruleID=CanBeVal]
### CanBeVal
Variable is never modified, so it can be declared using 'val'
in `dekaf-main/src/base/FactoryLoader.kt`
#### Snippet
```java
        val factories = InterFactories.factories
        if (factories.isEmpty()) throw DBFactoryException("No instances of InterServiceFactory")
        var f = factories.firstOrNull { it.javaClass.name == baseInterServiceFactoryName }
        f ?: throw DBFactoryException("No base instance of InterServiceFactory")
        return f
```

