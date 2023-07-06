# mssql-jdbc 
 
# Bad smells
I found 1976 bad smells with 495 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 437 | true |
| FinalMethodInFinalClass | 222 | false |
| JavadocDeclaration | 194 | false |
| ConstantValue | 138 | false |
| UnusedAssignment | 131 | false |
| FieldMayBeFinal | 130 | false |
| MissingSerialAnnotation | 77 | false |
| DataFlowIssue | 51 | false |
| RedundantCast | 46 | false |
| FinalStaticMethod | 38 | false |
| MarkedForRemoval | 35 | false |
| UnnecessaryModifier | 33 | true |
| RegExpUnnecessaryNonCapturingGroup | 32 | false |
| EmptyStatementBody | 25 | false |
| PointlessArithmeticExpression | 24 | false |
| FieldCanBeLocal | 19 | false |
| DuplicatedCode | 19 | false |
| PointlessBitwiseExpression | 18 | false |
| DanglingJavadoc | 18 | false |
| ConditionCoveredByFurtherCondition | 18 | false |
| RegExpRedundantEscape | 17 | false |
| StringOperationCanBeSimplified | 15 | false |
| TrivialIf | 15 | false |
| StringBufferReplaceableByString | 14 | false |
| JavadocLinkAsPlainText | 14 | false |
| TrivialStringConcatenation | 12 | false |
| IgnoreResultOfCall | 12 | false |
| InnerClassMayBeStatic | 12 | true |
| DuplicateExpressions | 10 | false |
| SwitchStatementWithConfusingDeclaration | 9 | false |
| NonStrictComparisonCanBeEquality | 9 | true |
| RedundantClassCall | 8 | false |
| JavadocReference | 8 | false |
| DuplicateBranchesInSwitch | 7 | false |
| ExplicitArrayFilling | 7 | false |
| UnnecessaryCallToStringValueOf | 7 | false |
| UnnecessaryContinue | 7 | false |
| SuspiciousMethodCalls | 6 | false |
| IfStatementWithIdenticalBranches | 5 | false |
| BigDecimalMethodWithoutRoundingCalled | 5 | false |
| WrapperTypeMayBePrimitive | 4 | false |
| NegativeIntConstantInLongContext | 4 | false |
| CatchMayIgnoreException | 4 | false |
| BusyWait | 4 | false |
| NonFinalFieldInEnum | 3 | false |
| SimplifiableConditionalExpression | 3 | false |
| RedundantTypeArguments | 3 | false |
| SwitchStatementWithTooFewBranches | 3 | false |
| ArraysAsListWithZeroOrOneArgument | 3 | false |
| MagicConstant | 2 | false |
| FinalPrivateMethod | 2 | false |
| SimplifyOptionalCallChains | 2 | false |
| PointlessNullCheck | 2 | false |
| AutoCloseableResource | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| CopyConstructorMissesField | 2 | false |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| StringEquality | 1 | false |
| MismatchedArrayReadWrite | 1 | false |
| EmptyTryBlock | 1 | false |
| LoopConditionNotUpdatedInsideLoop | 1 | false |
| CommentedOutCode | 1 | false |
| UnnecessaryLabelOnBreakStatement | 1 | false |
| ManualArrayCopy | 1 | false |
| LongLiteralsEndingWithLowercaseL | 1 | false |
| OctalLiteral | 1 | false |
| UnnecessaryReturn | 1 | true |
| RedundantMethodOverride | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| IdempotentLoopBody | 1 | false |
| RedundantOperationOnEmptyContainer | 1 | false |
| UnnecessarySemicolon | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| RedundantCollectionOperation | 1 | false |
| MismatchedJavadocCode | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| UnnecessaryInitCause | 1 | false |
| ReactiveStreamsNullableInLambdaInTransform | 1 | false |
| RedundantCompareCall | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=StringEquality]
### StringEquality
String values are compared using `==`, not 'equals()'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataTable.java`
#### Snippet
```java

                return (rowCount == aSQLServerDataTable.rowCount && columnCount == aSQLServerDataTable.columnCount
                        && tvpName == aSQLServerDataTable.tvpName && equalColumnMetadata && equalColumnNames
                        && equalRowData);
            }
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
                    }
                    String stringValue = "" + value;
                    Short shortValue = Short.valueOf(stringValue);

                    if (shortValue >= 0 && shortValue <= 255) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
            // Rescale the value if necessary
            if (null != bigDecimalValue) {
                Integer dtvScale, biScale = bigDecimalValue.scale();
                if (null == dtv.getScale() && JDBCType.DECIMAL == dtv.getJdbcType()) {
                    dtvScale = bigDecimalValue
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java

                case REAL:
                    Float floatValue = (value instanceof String) ? Float.parseFloat((String) value) : (Float) value;
                    return ByteBuffer.allocate((Float.SIZE / Byte.SIZE)).order(ByteOrder.LITTLE_ENDIAN)
                            .putFloat(floatValue).array();
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                case FLOAT:
                case DOUBLE:
                    Double doubleValue = (value instanceof String) ? Double.parseDouble((String) value)
                                                                   : (Double) value;
                    return ByteBuffer.allocate((Double.SIZE / Byte.SIZE)).order(ByteOrder.LITTLE_ENDIAN)
```

## RuleId[id=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `valuesTypes` are read, but never written to
in `src/main/java/com/microsoft/sqlserver/jdbc/SqlVariant.java`
#### Snippet
```java

    private static final int MAXELEMENTS = 23;
    private static final sqlVariantProbBytes[] valuesTypes = new sqlVariantProbBytes[MAXELEMENTS];

    private sqlVariantProbBytes(int intValue) {
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/SqlVariant.java`
#### Snippet
```java
    private static final sqlVariantProbBytes[] valuesTypes = new sqlVariantProbBytes[MAXELEMENTS];

    private sqlVariantProbBytes(int intValue) {
        this.intValue = intValue;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java
        private static final InternalSpatialDatatype[] VALUES = values();

        private InternalSpatialDatatype(byte typeCode, String typeName) {
            this.typeCode = typeCode;
            this.typeName = typeName;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
        }

        private Builder(TDSType tdsType, Strategy strategy) {
            this.tdsType = tdsType;
            this.strategy = strategy;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
             *         when an error occurs
             */
            public void apply(TypeInfo typeInfo, TDSReader tdsReader) throws SQLServerException;
        }

```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/dataclassification/SensitivityClassification.java`
#### Snippet
```java
        private int rank;

        private SensitivityRank(int rank) {
            this.rank = rank;
        }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLCollation.java`
#### Snippet
```java
    private Charset charset;

    private Encoding(String charsetName, boolean supportsAsciiConversion, boolean hasAsciiCompatibleSBCS) {
        this.charsetName = charsetName;
        this.supportsAsciiConversion = supportsAsciiConversion;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/microsoft/sqlserver/jdbc/ISQLServerPreparedStatement.java`
#### Snippet
```java
     *         when the connection is closed.
     */
    public void setUseFmtOnly(boolean useFmtOnly) throws SQLServerException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/microsoft/sqlserver/jdbc/ISQLServerPreparedStatement.java`
#### Snippet
```java
     *         when the connection is closed.
     */
    public boolean getUseFmtOnly() throws SQLServerException;

    /**
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
    private final String value;

    private PrepareMethod(String value) {
        this.value = value;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
    private final String name;

    private KeyStoreAuthentication(String name) {
        this.name = name;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
    private final String name;

    private SqlAuthentication(String name) {
        this.name = name;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
     * Constructs a ApplicationIntent that sets the string value of the enum.
     */
    private ApplicationIntent(String value) {
        this.value = value;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
    private final String defaultValue;

    private SQLServerDriverStringProperty(String name, String defaultValue) {
        this.name = name;
        this.defaultValue = defaultValue;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
    private int maxValue = -1; // not assigned

    private SQLServerDriverIntProperty(String name, int defaultValue) {
        this.name = name;
        this.defaultValue = defaultValue;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
    private final String defaultValue;

    private SQLServerDriverObjectProperty(String name, String defaultValue) {
        this.name = name;
        this.defaultValue = defaultValue;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
    private final boolean defaultValue;

    private SQLServerDriverBooleanProperty(String name, boolean defaultValue) {
        this.name = name;
        this.defaultValue = defaultValue;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
    private final String name;

    private ColumnEncryptionSetting(String name) {
        this.name = name;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
    private final String name;

    private SSLProtocol(String name) {
        this.name = name;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
    private final String name;

    private AuthenticationScheme(String name) {
        this.name = name;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
     * Constructs a DatetimeType that sets the string value of the enum.
     */
    private DatetimeType(String value) {
        this.value = value;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
    private final String name;

    private EncryptOption(String name) {
        this.name = name;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
    }

    private SQLServerDriverIntProperty(String name, int defaultValue, int minValue, int maxValue) {
        this.name = name;
        this.defaultValue = defaultValue;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/DataTypes.java`
#### Snippet
```java
    private static final JavaType[] VALUES = values();

    private JavaType(Class<?> javaClass, JDBCType jdbcTypeFromJavaType) {
        this.javaClass = javaClass;
        this.jdbcTypeFromJavaType = jdbcTypeFromJavaType;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/DataTypes.java`
#### Snippet
```java
        private static final GetterConversion[] VALUES = values();

        private GetterConversion(SSType.Category from, EnumSet<JDBCType.Category> to) {
            this.from = from;
            this.to = to;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/DataTypes.java`
#### Snippet
```java
    }

    private JDBCType(Category category, int intValue, String className) {
        this.category = category;
        this.intValue = intValue;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/DataTypes.java`
#### Snippet
```java
        private static final NormalizationAE[] VALUES = values();

        private NormalizationAE(JDBCType from, EnumSet<SSType> to) {
            this.from = from;
            this.to = to;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/DataTypes.java`
#### Snippet
```java
        private static final SetterConversionAE[] VALUES = values();

        private SetterConversionAE(JavaType from, EnumSet<JDBCType> to) {
            this.from = from;
            this.to = to;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/DataTypes.java`
#### Snippet
```java
    }

    private TDSType(int intValue) {
        this.intValue = intValue;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/DataTypes.java`
#### Snippet
```java
        private static final UpdaterConversion[] VALUES = values();

        private UpdaterConversion(JDBCType.Category from, EnumSet<SSType.Category> to) {
            this.from = from;
            this.to = to;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/DataTypes.java`
#### Snippet
```java
    private final String name;

    private StreamType(JDBCType jdbcType, String name) {
        this.jdbcType = jdbcType;
        this.name = name;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/DataTypes.java`
#### Snippet
```java
    static final BigDecimal MIN_VALUE_SMALLMONEY = new BigDecimal("-214748.3648");

    private SSType(Category category, String name, JDBCType jdbcType) {
        this.category = category;
        this.name = name;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/DataTypes.java`
#### Snippet
```java
        private static final SetterConversion[] VALUES = values();

        private SetterConversion(JDBCType.Category from, EnumSet<JDBCType.Category> to) {
            this.from = from;
            this.to = to;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        private final String katProc;

        private CallableHandles(String name, String katName) {
            this.preKatProc = name;
            this.katProc = katName;
```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java

    static void writeShortBigEndian(short value, byte[] valueBytes, int offset) {
        valueBytes[offset + 0] = (byte) ((value >> 8) & 0xFF);
        valueBytes[offset + 1] = (byte) ((value >> 0) & 0xFF);
    }
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java

    static void writeLongBigEndian(long value, byte[] valueBytes, int offset) {
        valueBytes[offset + 0] = (byte) ((value >> 56) & 0xFF);
        valueBytes[offset + 1] = (byte) ((value >> 48) & 0xFF);
        valueBytes[offset + 2] = (byte) ((value >> 40) & 0xFF);
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java

    static void writeShort(short value, byte[] valueBytes, int offset) {
        valueBytes[offset + 0] = (byte) ((value >> 0) & 0xFF);
        valueBytes[offset + 1] = (byte) ((value >> 8) & 0xFF);
    }
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java

    static void writeIntBigEndian(int value, byte[] valueBytes, int offset) {
        valueBytes[offset + 0] = (byte) ((value >> 24) & 0xFF);
        valueBytes[offset + 1] = (byte) ((value >> 16) & 0xFF);
        valueBytes[offset + 2] = (byte) ((value >> 8) & 0xFF);
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java

    static void writeInt(int value, byte[] valueBytes, int offset) {
        valueBytes[offset + 0] = (byte) ((value >> 0) & 0xFF);
        valueBytes[offset + 1] = (byte) ((value >> 8) & 0xFF);
        valueBytes[offset + 2] = (byte) ((value >> 16) & 0xFF);
```

### PointlessArithmeticExpression
`nOffset + 0` can be replaced with 'nOffset'
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
     */
    static int readInt(byte[] data, int nOffset) {
        int b1 = ((int) data[nOffset + 0] & 0xff);
        int b2 = ((int) data[nOffset + 1] & 0xff) << 8;
        int b3 = ((int) data[nOffset + 2] & 0xff) << 16;
```

### PointlessArithmeticExpression
`nOffset + 0` can be replaced with 'nOffset'
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    static int readIntBigEndian(byte[] data, int nOffset) {
        return ((data[nOffset + 3] & 0xFF) << 0) | ((data[nOffset + 2] & 0xFF) << 8)
                | ((data[nOffset + 1] & 0xFF) << 16) | ((data[nOffset + 0] & 0xFF) << 24);
    }

```

### PointlessArithmeticExpression
`pos + 0` can be replaced with 'pos'
in `src/main/java/mssql/googlecode/cityhash/CityHash.java`
#### Snippet
```java
            int pos,
            int len) {
        long a = fetch64(s, pos + 0) * k1;
        long b = fetch64(s, pos + 8);
        long c = fetch64(s, pos + len - 8) * k2;
```

### PointlessArithmeticExpression
`pos + 0` can be replaced with 'pos'
in `src/main/java/mssql/googlecode/cityhash/CityHash.java`
#### Snippet
```java

        long z = fetch64(s, pos + 24);
        long a = fetch64(s, pos + 0) + (fetch64(s, pos + len - 16) + len) * k0;
        long b = rotate(a + z, 52);
        long c = rotate(a, 37);
```

### PointlessArithmeticExpression
`pos + 0` can be replaced with 'pos'
in `src/main/java/mssql/googlecode/cityhash/CityHash.java`
#### Snippet
```java
            int len) {
        if (len > 8) {
            long a = fetch64(s, pos + 0);
            long b = fetch64(s, pos + len - 8);
            return hashLen16(a, rotateByAtLeast1(b + len, len)) ^ b;
```

### PointlessArithmeticExpression
`pos + 0` can be replaced with 'pos'
in `src/main/java/mssql/googlecode/cityhash/CityHash.java`
#### Snippet
```java
        }
        if (len >= 4) {
            long a = 0xffffffffL & fetch32(s, pos + 0);
            return hashLen16((a << 3) + len, 0xffffffffL & fetch32(s, pos + len - 4));
        }
```

### PointlessArithmeticExpression
`pos + 0` can be replaced with 'pos'
in `src/main/java/mssql/googlecode/cityhash/CityHash.java`
#### Snippet
```java
        }
        if (len > 0) {
            int a = s[pos + 0] & 0xFF;
            int b = s[pos + (len >>> 1)] & 0xFF;
            int c = s[pos + len - 1] & 0xFF;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/mssql/googlecode/cityhash/CityHash.java`
#### Snippet
```java
    private static int toIntLE(byte[] b,
            int i) {
        return (((b[i + 3] & 255) << 24) + ((b[i + 2] & 255) << 16) + ((b[i + 1] & 255) << 8) + ((b[i + 0] & 255) << 0));
    }

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/mssql/googlecode/cityhash/CityHash.java`
#### Snippet
```java
            int i) {
        return (((long) b[i + 7] << 56) + ((long) (b[i + 6] & 255) << 48) + ((long) (b[i + 5] & 255) << 40) + ((long) (b[i + 4] & 255) << 32)
                + ((long) (b[i + 3] & 255) << 24) + ((b[i + 2] & 255) << 16) + ((b[i + 1] & 255) << 8) + ((b[i + 0] & 255) << 0));
    }

```

### PointlessArithmeticExpression
`pos + 0` can be replaced with 'pos'
in `src/main/java/mssql/googlecode/cityhash/CityHash.java`
#### Snippet
```java
            long a,
            long b) {
        return weakHashLen32WithSeeds(fetch64(s, pos + 0), fetch64(s, pos + 8), fetch64(s, pos + 16), fetch64(s, pos + 24), a, b);
    }

```

### PointlessArithmeticExpression
`pos + 0` can be replaced with 'pos'
in `src/main/java/mssql/googlecode/cityhash/CityHash.java`
#### Snippet
```java

        if (len >= 16) {
            return cityHash128WithSeed(s, pos + 16, len - 16, fetch64(s, pos + 0) ^ k3, fetch64(s, pos + 8));
        }
        else if (len >= 8) {
```

### PointlessArithmeticExpression
`pos + 0` can be replaced with 'pos'
in `src/main/java/mssql/googlecode/cityhash/CityHash.java`
#### Snippet
```java
        }
        else if (len >= 8) {
            return cityHash128WithSeed(new byte[0], 0, 0, fetch64(s, pos + 0) ^ (len * k0), fetch64(s, pos + len - 8) ^ k1);
        }
        else {
```

### PointlessArithmeticExpression
`pos + 0` can be replaced with 'pos'
in `src/main/java/mssql/googlecode/cityhash/CityHash.java`
#### Snippet
```java
            y += v[0] + fetch64(s, pos + 40);
            z = rotate(z + w[0], 33) * k1;
            v = weakHashLen32WithSeeds(s, pos + 0, v[1] * k1, x + w[0]);
            w = weakHashLen32WithSeeds(s, pos + 32, z + w[1], y + fetch64(s, pos + 16));
            {
```

### PointlessArithmeticExpression
`pos + 0` can be replaced with 'pos'
in `src/main/java/mssql/googlecode/cityhash/CityHash.java`
#### Snippet
```java
        long[] v = weakHashLen32WithSeeds(s, pos + len - 64, len, z);
        long[] w = weakHashLen32WithSeeds(s, pos + len - 32, y + k1, x);
        x = x * k1 + fetch64(s, pos + 0);

        len = (len - 1) & (~63);
```

### PointlessArithmeticExpression
`pos + 0` can be replaced with 'pos'
in `src/main/java/mssql/googlecode/cityhash/CityHash.java`
#### Snippet
```java
            y += v[0] + fetch64(s, pos + 40);
            z = rotate(z + w[0], 33) * k1;
            v = weakHashLen32WithSeeds(s, pos + 0, v[1] * k1, x + w[0]);
            w = weakHashLen32WithSeeds(s, pos + 32, z + w[1], y + fetch64(s, pos + 16));
            {
```

### PointlessArithmeticExpression
`pos + 0` can be replaced with 'pos'
in `src/main/java/mssql/googlecode/cityhash/CityHash.java`
#### Snippet
```java
            a = shiftMix(a * k1) * k1;
            c = b * k1 + hashLen0to16(s, pos, len);
            d = shiftMix(a + (len >= 8 ? fetch64(s, pos + 0) : c));
        }
        else {
```

### PointlessArithmeticExpression
`pos + 0` can be replaced with 'pos'
in `src/main/java/mssql/googlecode/cityhash/CityHash.java`
#### Snippet
```java

            do {
                a ^= shiftMix(fetch64(s, pos + 0) * k1) * k1;
                a *= k1;
                b ^= a;
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     */
    static int makeParamName(int nParam, char[] name, int offset) {
        name[offset + 0] = '@';
        name[offset + 1] = 'P';
        if (nParam < 10) {
```

### PointlessArithmeticExpression
`(i1 * 2) + 0` can be replaced with '(i1 \* 2)'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            data[(i1 * 2) + 1] = b1;
            byte b2 = (byte) (j1 & 0x00FF);
            data[(i1 * 2) + 0] = b2;
        }
        return data;
```

## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: ParameterMetaData.parameterNoNulls, ParameterMetaData.parameterNullable, ...
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerParameterMetaData.java`
#### Snippet
```java
            return queryMetaMap.get(param).isNullable;
        } else {
            return (int) getParameterInfo(param).get(NULLABLE);
        }
    }
```

### MagicConstant
Should be one of: ResultSet.HOLD_CURSORS_OVER_COMMIT, ResultSet.CLOSE_CURSORS_AT_COMMIT
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        loggerExternal.exiting(getClassNameLogging(), "getHoldability", holdability);

        return holdability;
    }

```

## RuleId[id=EmptyTryBlock]
### EmptyTryBlock
Empty `try` block
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                if (null != openStatements) {
                    while (!openStatements.isEmpty()) {
                        try (Statement st = openStatements.get(0)) {}
                    }
                    openStatements.clear();
```

## RuleId[id=MarkedForRemoval]
### MarkedForRemoval
'java.lang.SecurityManager' is deprecated and marked for removal
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnectionPoolProxy.java`
#### Snippet
```java

        // check for callAbort permission
        SecurityManager secMgr = System.getSecurityManager();
        if (secMgr != null) {
            try {
```

### MarkedForRemoval
'getSecurityManager()' is deprecated and marked for removal
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnectionPoolProxy.java`
#### Snippet
```java

        // check for callAbort permission
        SecurityManager secMgr = System.getSecurityManager();
        if (secMgr != null) {
            try {
```

### MarkedForRemoval
'java.lang.SecurityManager' is deprecated and marked for removal
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnectionPoolProxy.java`
#### Snippet
```java
            try {
                java.sql.SQLPermission perm = new java.sql.SQLPermission(CALL_ABORT_PERM);
                secMgr.checkPermission(perm);
            } catch (SecurityException ex) {
                MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_permissionDenied"));
```

### MarkedForRemoval
Overrides method that is deprecated and marked for removal in 'com.microsoft.sqlserver.jdbc.ISQLServerConnection'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnectionPoolProxy.java`
#### Snippet
```java
    @Deprecated(since = "12.1.0", forRemoval = true)
    @Override
    public void setMsiTokenCacheTtl(int timeToLive) {}

    /**
```

### MarkedForRemoval
Overrides method that is deprecated and marked for removal in 'com.microsoft.sqlserver.jdbc.ISQLServerConnection'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnectionPoolProxy.java`
#### Snippet
```java
    @Deprecated(since = "12.1.0", forRemoval = true)
    @Override
    public int getMsiTokenCacheTtl() {
        return 0;
    }
```

### MarkedForRemoval
Overrides method that is deprecated and marked for removal in 'com.microsoft.sqlserver.jdbc.ISQLServerDataSource'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
    @Override
    @Deprecated(since = "9.4.1", forRemoval = true)
    public String getAADSecurePrincipalId() {
        return getStringProperty(connectionProps, SQLServerDriverStringProperty.AAD_SECURE_PRINCIPAL_ID.toString(),
                SQLServerDriverStringProperty.AAD_SECURE_PRINCIPAL_ID.getDefaultValue());
```

### MarkedForRemoval
Overrides method that is deprecated and marked for removal in 'com.microsoft.sqlserver.jdbc.ISQLServerDataSource'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
    @Override
    @Deprecated(since = "9.3.0", forRemoval = true)
    public String getJASSConfigurationName() {
        return getStringProperty(connectionProps, SQLServerDriverStringProperty.JAAS_CONFIG_NAME.toString(),
                SQLServerDriverStringProperty.JAAS_CONFIG_NAME.getDefaultValue());
```

### MarkedForRemoval
Overrides method that is deprecated and marked for removal in 'com.microsoft.sqlserver.jdbc.ISQLServerDataSource'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
    @Deprecated(since = "12.1.0", forRemoval = true)
    @Override
    public String getMSIClientId() {
        return getStringProperty(connectionProps, SQLServerDriverStringProperty.MSI_CLIENT_ID.toString(),
                SQLServerDriverStringProperty.MSI_CLIENT_ID.getDefaultValue());
```

### MarkedForRemoval
Overrides method that is deprecated and marked for removal in 'com.microsoft.sqlserver.jdbc.ISQLServerDataSource'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
    @Deprecated(since = "12.1.0", forRemoval = true)
    @Override
    public void setMsiTokenCacheTtl(int timeToLive) {}

    /**
```

### MarkedForRemoval
Overrides method that is deprecated and marked for removal in 'com.microsoft.sqlserver.jdbc.ISQLServerDataSource'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
    @Override
    @Deprecated(since = "9.4.1", forRemoval = true)
    public void setAADSecurePrincipalId(String aadSecurePrincipalId) {
        setStringProperty(connectionProps, SQLServerDriverStringProperty.AAD_SECURE_PRINCIPAL_ID.toString(),
                aadSecurePrincipalId);
```

### MarkedForRemoval
Overrides method that is deprecated and marked for removal in 'com.microsoft.sqlserver.jdbc.ISQLServerDataSource'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
    @Override
    @Deprecated(since = "9.3.0", forRemoval = true)
    public void setJASSConfigurationName(String configurationName) {
        setStringProperty(connectionProps, SQLServerDriverStringProperty.JAAS_CONFIG_NAME.toString(),
                configurationName);
```

### MarkedForRemoval
Overrides method that is deprecated and marked for removal in 'com.microsoft.sqlserver.jdbc.ISQLServerDataSource'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
    @Override
    @Deprecated(since = "10.1.0", forRemoval = true)
    public void setEncrypt(boolean encryptOption) {
        setStringProperty(connectionProps, SQLServerDriverStringProperty.ENCRYPT.toString(),
                Boolean.toString(encryptOption));
```

### MarkedForRemoval
Overrides method that is deprecated and marked for removal in 'com.microsoft.sqlserver.jdbc.ISQLServerDataSource'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
    @Deprecated(since = "12.1.0", forRemoval = true)
    @Override
    public int getMsiTokenCacheTtl() {
        return 0;
    }
```

### MarkedForRemoval
Overrides method that is deprecated and marked for removal in 'com.microsoft.sqlserver.jdbc.ISQLServerDataSource'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
    @Override
    @Deprecated(since = "9.4.1", forRemoval = true)
    public void setAADSecurePrincipalSecret(String aadSecurePrincipalSecret) {
        setStringProperty(connectionProps, SQLServerDriverStringProperty.AAD_SECURE_PRINCIPAL_SECRET.toString(),
                aadSecurePrincipalSecret);
```

### MarkedForRemoval
Overrides method that is deprecated and marked for removal in 'com.microsoft.sqlserver.jdbc.ISQLServerDataSource'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
    @Deprecated(since = "12.1.0", forRemoval = true)
    @Override
    public void setMSIClientId(String managedIdentityClientId) {
        setStringProperty(connectionProps, SQLServerDriverStringProperty.MSI_CLIENT_ID.toString(),
                managedIdentityClientId);
```

### MarkedForRemoval
'java.security.AccessControlContext' is deprecated and marked for removal
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
package com.microsoft.sqlserver.jdbc;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PrivilegedActionException;
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
```

### MarkedForRemoval
'java.security.AccessControlContext' is deprecated and marked for removal
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
                KerbCallback callback = new KerbCallback(con);
                try {
                    AccessControlContext context = AccessController.getContext();
                    currentSubject = Subject.getSubject(context);
                    if (null == currentSubject) {
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
                KerbCallback callback = new KerbCallback(con);
                try {
                    AccessControlContext context = AccessController.getContext();
                    currentSubject = Subject.getSubject(context);
                    if (null == currentSubject) {
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
                KerbCallback callback = new KerbCallback(con);
                try {
                    AccessControlContext context = AccessController.getContext();
                    currentSubject = Subject.getSubject(context);
                    if (null == currentSubject) {
```

### MarkedForRemoval
'getSubject(java.security.AccessControlContext)' is deprecated and marked for removal
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
                try {
                    AccessControlContext context = AccessController.getContext();
                    currentSubject = Subject.getSubject(context);
                    if (null == currentSubject) {
                        lc = new LoginContext(configName, callback);
```

### MarkedForRemoval
'java.lang.SecurityManager' is deprecated and marked for removal
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
    @SuppressWarnings("deprecation")
    public void checkConnect() {
        SecurityManager security = System.getSecurityManager();
        if (null != security) {
            security.checkConnect(serverName, portNumber);
```

### MarkedForRemoval
'getSecurityManager()' is deprecated and marked for removal
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
    @SuppressWarnings("deprecation")
    public void checkConnect() {
        SecurityManager security = System.getSecurityManager();
        if (null != security) {
            security.checkConnect(serverName, portNumber);
```

### MarkedForRemoval
'java.lang.SecurityManager' is deprecated and marked for removal
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        SecurityManager security = System.getSecurityManager();
        if (null != security) {
            security.checkConnect(serverName, portNumber);
        }
    }
```

### MarkedForRemoval
'java.lang.SecurityManager' is deprecated and marked for removal
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

        // check for callAbort permission
        SecurityManager secMgr = System.getSecurityManager();
        if (secMgr != null) {
            try {
```

### MarkedForRemoval
'getSecurityManager()' is deprecated and marked for removal
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

        // check for callAbort permission
        SecurityManager secMgr = System.getSecurityManager();
        if (secMgr != null) {
            try {
```

### MarkedForRemoval
'java.lang.SecurityManager' is deprecated and marked for removal
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            try {
                SQLPermission perm = new SQLPermission(CALL_ABORT_PERM);
                secMgr.checkPermission(perm);
            } catch (SecurityException ex) {
                MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_permissionDenied"));
```

### MarkedForRemoval
Overrides method that is deprecated and marked for removal in 'com.microsoft.sqlserver.jdbc.ISQLServerConnection'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
    @Deprecated(since = "12.1.0", forRemoval = true)
    @Override
    public void setMsiTokenCacheTtl(int timeToLive) {}

    /**
```

### MarkedForRemoval
'java.lang.SecurityManager' is deprecated and marked for removal
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

        // check for setNetworkTimeout permission
        SecurityManager secMgr = System.getSecurityManager();
        if (secMgr != null) {
            try {
```

### MarkedForRemoval
'getSecurityManager()' is deprecated and marked for removal
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

        // check for setNetworkTimeout permission
        SecurityManager secMgr = System.getSecurityManager();
        if (secMgr != null) {
            try {
```

### MarkedForRemoval
'java.lang.SecurityManager' is deprecated and marked for removal
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            try {
                SQLPermission perm = new SQLPermission(SET_NETWORK_TIMEOUT_PERM);
                secMgr.checkPermission(perm);
            } catch (SecurityException ex) {
                MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_permissionDenied"));
```

### MarkedForRemoval
Overrides method that is deprecated and marked for removal in 'com.microsoft.sqlserver.jdbc.ISQLServerConnection'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
    @Deprecated(since = "12.1.0", forRemoval = true)
    @Override
    public int getMsiTokenCacheTtl() {
        return 0;
    }
```

### MarkedForRemoval
'java.lang.SecurityManager' is deprecated and marked for removal
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
    @SuppressWarnings("deprecation")
    public void checkLink() {
        SecurityManager security = System.getSecurityManager();
        if (null != security) {
            security.checkLink(DLLNAME);
```

### MarkedForRemoval
'getSecurityManager()' is deprecated and marked for removal
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
    @SuppressWarnings("deprecation")
    public void checkLink() {
        SecurityManager security = System.getSecurityManager();
        if (null != security) {
            security.checkLink(DLLNAME);
```

### MarkedForRemoval
'java.lang.SecurityManager' is deprecated and marked for removal
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        SecurityManager security = System.getSecurityManager();
        if (null != security) {
            security.checkLink(DLLNAME);
        }
    }
```

## RuleId[id=LoopConditionNotUpdatedInsideLoop]
### LoopConditionNotUpdatedInsideLoop
Condition 'this.getState() != State.TERMINATED' is not updated inside loop
in `src/main/java/com/microsoft/sqlserver/jdbc/IdleConnectionResiliency.java`
#### Snippet
```java
        stopRequested = true;
        if (blocking && this.isAlive()) {
            while (this.getState() != State.TERMINATED) {
                // wait until thread terminates
            }
```

## RuleId[id=RedundantClassCall]
### RedundantClassCall
Redundant call to `isInstance()`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
        setObject(setterGetParam(parameterIndex), x, JavaType.of(x), JDBCType.of(targetSqlType),
                (java.sql.Types.NUMERIC == targetSqlType || java.sql.Types.DECIMAL == targetSqlType
                        || InputStream.class.isInstance(x) || Reader.class.isInstance(x)) ? scale : null,
                precision, false, parameterIndex, null);

```

### RedundantClassCall
Redundant call to `isInstance()`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
        setObject(setterGetParam(parameterIndex), x, JavaType.of(x), JDBCType.of(targetSqlType),
                (java.sql.Types.NUMERIC == targetSqlType || java.sql.Types.DECIMAL == targetSqlType
                        || InputStream.class.isInstance(x) || Reader.class.isInstance(x)) ? scale : null,
                precision, false, parameterIndex, null);

```

### RedundantClassCall
Redundant call to `isInstance()`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
        setObject(setterGetParam(parameterIndex), x, JavaType.of(x), JDBCType.of(targetSqlType),
                (java.sql.Types.NUMERIC == targetSqlType || java.sql.Types.DECIMAL == targetSqlType
                        || InputStream.class.isInstance(x) || Reader.class.isInstance(x)) ? scale : null,
                precision, forceEncrypt, parameterIndex, null);

```

### RedundantClassCall
Redundant call to `isInstance()`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
        setObject(setterGetParam(parameterIndex), x, JavaType.of(x), JDBCType.of(targetSqlType),
                (java.sql.Types.NUMERIC == targetSqlType || java.sql.Types.DECIMAL == targetSqlType
                        || InputStream.class.isInstance(x) || Reader.class.isInstance(x)) ? scale : null,
                precision, forceEncrypt, parameterIndex, null);

```

### RedundantClassCall
Redundant call to `isInstance()`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
                (java.sql.Types.NUMERIC == targetSqlType || java.sql.Types.DECIMAL == targetSqlType
                        || java.sql.Types.TIMESTAMP == targetSqlType || java.sql.Types.TIME == targetSqlType
                        || microsoft.sql.Types.DATETIMEOFFSET == targetSqlType || InputStream.class.isInstance(x)
                        || Reader.class.isInstance(x)) ? scaleOrLength : null,
                null, false, parameterIndex, null);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
                        || java.sql.Types.TIMESTAMP == targetSqlType || java.sql.Types.TIME == targetSqlType
                        || microsoft.sql.Types.DATETIMEOFFSET == targetSqlType || InputStream.class.isInstance(x)
                        || Reader.class.isInstance(x)) ? scaleOrLength : null,
                null, false, parameterIndex, null);

```

### RedundantClassCall
Redundant call to `isInstance()`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCallableStatement.java`
#### Snippet
```java
        setObject(setterGetParam(findColumn(parameterName)), value, JavaType.of(value), JDBCType.of(targetSqlType),
                (java.sql.Types.NUMERIC == targetSqlType || java.sql.Types.DECIMAL == targetSqlType
                        || InputStream.class.isInstance(value) || Reader.class.isInstance(value)) ? scale : null,
                precision, false, findColumn(parameterName), null);

```

### RedundantClassCall
Redundant call to `isInstance()`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCallableStatement.java`
#### Snippet
```java
        setObject(setterGetParam(findColumn(parameterName)), value, JavaType.of(value), JDBCType.of(targetSqlType),
                (java.sql.Types.NUMERIC == targetSqlType || java.sql.Types.DECIMAL == targetSqlType
                        || InputStream.class.isInstance(value) || Reader.class.isInstance(value)) ? scale : null,
                precision, false, findColumn(parameterName), null);

```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`while` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/IdleConnectionResiliency.java`
#### Snippet
```java
        stopRequested = true;
        if (blocking && this.isAlive()) {
            while (this.getState() != State.TERMINATED) {
                // wait until thread terminates
            }
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/StreamColumns.java`
#### Snippet
```java
                // If information type index is equal to USHORT_MAX eg. 65535 then there is no information type
                if (informationTypeIndex != DataTypes.SQL_USHORTVARMAXLEN) {
                    if (informationTypeIndex >= informationTypes.size()) {}
                    informationType = informationTypes.get(informationTypeIndex);
                }
```

### EmptyStatementBody
`for` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/PLPInputStream.java`
#### Snippet
```java
        // Read/Skip BOM bytes first. When all BOM bytes have been consumed ...
        if (null == b) {
            for (int bomBytesSkipped;
                    bytesRead < maxBytes
                            && 0 != (bomBytesSkipped = (int) bomStream.skip(((long) maxBytes) - ((long) bytesRead)));
```

### EmptyStatementBody
`for` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/PLPInputStream.java`
#### Snippet
```java
                    bytesRead += bomBytesSkipped);
        } else {
            for (int bomBytesRead;
                    bytesRead < maxBytes
                            && -1 != (bomBytesRead = bomStream.read(b, offset + bytesRead, maxBytes - bytesRead));
```

### EmptyStatementBody
`for` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/PLPInputStream.java`
#### Snippet
```java

        // ... then read/skip bytes from the underlying PLPInputStream
        for (; bytesRead < maxBytes
                && -1 != (xmlBytesRead = super.readBytes(b, offset + bytesRead, maxBytes - bytesRead));
                bytesRead += xmlBytesRead);
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/PLPInputStream.java`
#### Snippet
```java
            return;

        while (skip(tdsReader.getConnection().getTDSPacketSize()) != 0);
        // Release ref to tdsReader and parentRS here, shut down stream state.
        closeHelper();
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
    private ArrayList<String> parseUserSQLForColumnListDWHelper(ArrayList<String> listOfColumns) {
        // ignore all comments
        while (checkAndRemoveCommentsAndSpace(false)) {}

        StringBuilder sb = new StringBuilder();
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder();
        while (localUserSQL.length() > 0) {
            while (checkAndRemoveCommentsAndSpace(false)) {}

            // exit condition
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
            if (localUserSQL.charAt(0) == ',') {
                localUserSQL = localUserSQL.substring(1);
                while (checkAndRemoveCommentsAndSpace(false)) {}
            }

```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
    private ArrayList<String> parseUserSQLForColumnListDW() {
        // ignore all comments
        while (checkAndRemoveCommentsAndSpace(false)) {}

        // check if optional column list was provided
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java

    private void checkAdditionalQuery() {
        while (checkAndRemoveCommentsAndSpace(true)) {}

        // At this point, if localUserSQL is not empty (after removing all whitespaces, semicolons and comments), we
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
    private ArrayList<String> parseUserSQLForValueListDW(boolean hasValuesBeenFound) {
        // ignore all comments
        if (checkAndRemoveCommentsAndSpace(false)) {}

        if (!hasValuesBeenFound) {
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java

                // ignore all comments
                while (checkAndRemoveCommentsAndSpace(false)) {}

                if (checkSQLLength(1) && "(".equalsIgnoreCase(localUserSQL.substring(0, 1))) {
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
        } else {
            // ignore all comments
            while (checkAndRemoveCommentsAndSpace(false)) {}

            if (checkSQLLength(1) && "(".equalsIgnoreCase(localUserSQL.substring(0, 1))) {
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
        // And there could be in-line comments (with /* and */) in between.
        // This method assumes the localUserSQL string starts with "insert".
        while (checkAndRemoveCommentsAndSpace(false)) {}

        StringBuilder sb = new StringBuilder();
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
    private ArrayList<String> parseUserSQLForValueListDWHelper(ArrayList<String> listOfValues) {
        // ignore all comments
        while (checkAndRemoveCommentsAndSpace(false)) {}

        // At this point, the next chunk of string is the value, without starting with ' (most likely a ?).
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        // contents, process the remainder of the current row and all subsequent rows.
        try {
            while (fetchBufferNext());
        } catch (SQLServerException e) {
            if (logger.isLoggable(java.util.logging.Level.FINER))
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java

            // Scroll past the last of the returned rows, and ...
            while (scrollWindow.next(this));

            // back up one row.
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java

        // Scroll to the last of the returned rows
        while (scrollWindow.next(this));
        scrollWindow.previous(this);

```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
            // Scroll past all the returned rows, caching in the scroll window as we go.
            try {
                while (scrollWindow != null && scrollWindow.next(this));
            } catch (SQLException e) {
                // If there is a row error in the results, don't throw an exception from here.
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                // resultset is done.
                try {
                    while (doInsertBulk(this));
                } catch (SQLServerException topLevelException) {
                    // Get to the root of this exception.
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            int bytesRead;

            while (0 == (bytesRead = readInternal(oneByte, 0, oneByte.length)));

            assert 1 == bytesRead || -1 == bytesRead;
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                tdsReader.readPacket();
            } else {
                while (tdsReader.readPacket());
            }
        } catch (SQLServerException e) {
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        // Read any remaining response packets from the server.
        // This operation may be timed out or cancelled from another thread.
        while (tdsReader.readPacket());

        // Postcondition: the entire response has been read
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            int bytesRead;

            while (0 == (bytesRead = readInternal(oneByte, 0, oneByte.length)));

            assert 1 == bytesRead || -1 == bytesRead;
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerException.java`
#### Snippet
```java
                    return "";
            }
            // if (state.equals(SQLServerException.EXCEPTION_XOPEN_NETWORK_ERROR))
            // return "S0022"; //Previous SQL99 state code for bad column name
        }
```

## RuleId[id=UnnecessaryLabelOnBreakStatement]
### UnnecessaryLabelOnBreakStatement
Unnecessary label `outerWhileLoop` on break statement
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                            }
                            // if the sorted set doesn't throw an error, break out of the outer while loop
                            break outerWhileLoop;
                        }
                        j++;
```

## RuleId[id=ManualArrayCopy]
### ManualArrayCopy
Manual array copy
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                if (cachedBytes.length <= cachedLength) {
                    int[] temp = new int[cachedBytes.length + 10];
                    for (int i = 0; i < cachedBytes.length; i++) {
                        temp[i] = cachedBytes[i];
                    }
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerMSAL4JUtils.java`
#### Snippet
```java
             */
            String correctedErrorMessage = e.getCause().getMessage().replaceAll("\\\\r\\\\n", "\r\n")
                    .replaceAll("\\{", "\"").replaceAll("\\}", "\"");

            RuntimeException correctedAuthenticationException = new RuntimeException(correctedErrorMessage);
```

### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
                        if (0 == ((BigDecimal) value).intValue()) {
                            String s = "" + value;
                            s = s.replaceAll("\\-", "");
                            if (s.startsWith("0.")) {
                                // remove the leading zero, eg., for 0.32, the precision should be 2 and not 3
```

### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
                            String s = dform.format(value);
                            s = s.replaceAll("\\.", "");
                            s = s.replaceAll("\\-", "");
                            length = s.length();
                        } else {
```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     */
    private final static Pattern JDBC_CALL_SYNTAX = Pattern
            .compile("(?s)\\s*?\\{\\s*?(\\?\\s*?=)?\\s*?[cC][aA][lL][lL]\\s+?" + SQL_IDENTIFIER_WITHOUT_GROUPS
                    + "(?:\\s*?\\((.*)\\))?\\s*\\}.*+");

```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
    private final static Pattern JDBC_CALL_SYNTAX = Pattern
            .compile("(?s)\\s*?\\{\\s*?(\\?\\s*?=)?\\s*?[cC][aA][lL][lL]\\s+?" + SQL_IDENTIFIER_WITHOUT_GROUPS
                    + "(?:\\s*?\\((.*)\\))?\\s*\\}.*+");

    /*
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     * non-whitespace characters. - including multipart identifiers
     */
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     * non-whitespace characters. - including multipart identifiers
     */
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     * non-whitespace characters. - including multipart identifiers
     */
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     * non-whitespace characters. - including multipart identifiers
     */
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
    // processed to translate the syntax.
    private final static Pattern LIMIT_SYNTAX_GENERIC = Pattern
            .compile("\\{\\s*[lL][iI][mM][iI][tT]\\s+(.*)(\\s+[oO][fF][fF][sS][eE][tT](.*)\\}|\\s*\\})");

    private final static Pattern SELECT_PATTERN = Pattern.compile("([sS][eE][lL][eE][cC][tT])\\s+");
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
    // processed to translate the syntax.
    private final static Pattern LIMIT_SYNTAX_GENERIC = Pattern
            .compile("\\{\\s*[lL][iI][mM][iI][tT]\\s+(.*)(\\s+[oO][fF][fF][sS][eE][tT](.*)\\}|\\s*\\})");

    private final static Pattern SELECT_PATTERN = Pattern.compile("([sS][eE][lL][eE][cC][tT])\\s+");
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     */
    private final static Pattern LIMIT_ONLY_PATTERN = Pattern
            .compile("\\{\\s*[lL][iI][mM][iI][tT]\\s+(((\\(|\\s)*)(\\d*|\\?)((\\)|\\s)*))\\s*\\}");

    /**
```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
            + SQL_IDENTIFIER_PART + "){0,3}?)";

```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
            + SQL_IDENTIFIER_PART + "){0,3}?)";

```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
    // It will throw an exception if OFFSET is present in the LIMIT escape syntax.
    private final static Pattern LIMIT_SYNTAX_WITH_OFFSET = Pattern
            .compile("\\{\\s*[lL][iI][mM][iI][tT]\\s+(.*)\\s+[oO][fF][fF][sS][eE][tT]\\s+(.*)\\}");
    // This pattern is used to determine if the query has LIMIT escape syntax. If so, then the query is further
    // processed to translate the syntax.
```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     * amounts of whitespace in the obvious places.
     */
    private final static Pattern SQL_EXEC_SYNTAX = Pattern.compile("\\s*?[eE][xX][eE][cC](?:[uU][tT][eE])??\\s+?("
            + SQL_IDENTIFIER_WITHOUT_GROUPS + "\\s*?=\\s+?)??" + SQL_IDENTIFIER_WITHOUT_GROUPS + "(?:$|(?:\\s+?.*+))");

```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     */
    private final static Pattern SQL_EXEC_SYNTAX = Pattern.compile("\\s*?[eE][xX][eE][cC](?:[uU][tT][eE])??\\s+?("
            + SQL_IDENTIFIER_WITHOUT_GROUPS + "\\s*?=\\s+?)??" + SQL_IDENTIFIER_WITHOUT_GROUPS + "(?:$|(?:\\s+?.*+))");

    /*
```

## RuleId[id=LongLiteralsEndingWithLowercaseL]
### LongLiteralsEndingWithLowercaseL
'long' literal `0xffffffffl` ends with lowercase 'l'
in `src/main/java/com/microsoft/sqlserver/jdbc/ActivityCorrelator.java`
#### Snippet
```java

    void increment() {
        if (sequence < 0xffffffffl) // to get to 32-bit unsigned
        {
            ++sequence;
```

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/StreamRetValue.java`
#### Snippet
```java
    private int ordinalOrLength;

    final int getOrdinalOrLength() {
        return ordinalOrLength;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSQLXML.java`
#### Snippet
```java
    final private String traceID;

    final public String toString() {
        return traceID;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerJdbc42.java`
#### Snippet
```java


    static final boolean checkSupportsJDBC43() {
        return false;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerJdbc42.java`
#### Snippet
```java
    }

    static final void throwBatchUpdateException(SQLServerException lastError,
            long[] updateCounts) throws BatchUpdateException {
        throw new BatchUpdateException(lastError.getMessage(), lastError.getSQLState(), lastError.getErrorCode(),
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
     * function assumes that the value is located at the current position in the response.
     */
    final void skipValue(TDSReader tdsReader, boolean isDiscard) throws SQLServerException {
        getterDTV.skipValue(typeInfo, tdsReader, isDiscard);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
    private String columnName;

    final void setColumnName(String name) {
        columnName = name;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
     * Sets Null value on the getterDTV of a column
     */
    final void initFromCompressedNull() {
        getterDTV.initFromCompressedNull();
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
    }

    final String getBaseColumnName() {
        return baseColumnName;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
     * If the column has not yet been read from the response then this method returns false.
     */
    final boolean isNull() {
        return getterDTV.isNull();
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
    }

    final SqlVariant getInternalVariant() {
        return this.internalVariant;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
    }

    final boolean isExpression() {
        return 0 != (infoStatus & TDS.COLINFO_STATUS_EXPRESSION);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
    private int infoStatus;

    final void setInfoStatus(int status) {
        infoStatus = status;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
     * Clears the values associated with this column.
     */
    final void clear() {
        getterDTV.clear();
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
    }

    final SQLIdentifier getTableName() {
        return tableName;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
    private String baseColumnName;

    final void setBaseColumnName(String name) {
        baseColumnName = name;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
    }

    final String getColumnName() {
        return columnName;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
    }

    final boolean isHidden() {
        return 0 != (infoStatus & TDS.COLINFO_STATUS_HIDDEN);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
    private SqlVariant internalVariant;

    final void setInternalVariant(SqlVariant type) {
        this.internalVariant = type;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
     * true, if impl of getterDTV is not set to null
     */
    final boolean isInitialized() {
        return getterDTV.isInitialized();
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
    }

    final int getTableNum() {
        return tableNum;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
    private SQLIdentifier tableName;

    final void setTableName(SQLIdentifier name) {
        tableName = name;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
    }

    final boolean isKey() {
        return 0 != (infoStatus & TDS.COLINFO_STATUS_KEY);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
    private int tableNum;

    final void setTableNum(int num) {
        tableNum = num;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
    }

    final TypeInfo getTypeInfo() {
        return typeInfo;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
    }

    final boolean isUpdatable() {
        return !isExpression() && !isHidden() && tableName.getObjectName().length() > 0;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
    }

    final boolean hasDifferentName() {
        return 0 != (infoStatus & TDS.COLINFO_STATUS_DIFFERENT_NAME);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerParameterMetaData.java`
#### Snippet
```java
     */
    @Override
    final public String toString() {
        return traceID;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SimpleInputStream.java`
#### Snippet
```java
     * of memory usage and run time) for very large PLPs. Use it only if a contiguous byte array is required.
     */
    final byte[] getBytes() throws SQLServerException {
        // We should always retrieve the entire stream, and only once.
        assert 0 == streamPos;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/StreamRetStatus.java`
#### Snippet
```java
    private int status;

    final int getStatus() {
        return status;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerJdbc43.java`
#### Snippet
```java
    }

    static final void throwBatchUpdateException(SQLServerException lastError,
            long[] updateCounts) throws BatchUpdateException {
        throw new BatchUpdateException(lastError.getMessage(), lastError.getSQLState(), lastError.getErrorCode(),
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerJdbc43.java`
#### Snippet
```java
    }

    static final boolean checkSupportsJDBC43() {
        return true;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    }

    final void setDatabaseName(String name) {
        databaseName = name;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    }

    static final Boolean isCharType(SSType ssType) {
        switch (ssType) {
            case CHAR:
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    private String objectName = "";

    final String getObjectName() {
        return objectName;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    private String serverName = "";

    final String getServerName() {
        return serverName;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    }

    final String asEscapedString() {
        StringBuilder fullName = new StringBuilder(256);

```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    }

    static final UUID readGUIDtoUUID(byte[] inputGUID) throws SQLServerException {
        if (inputGUID.length != 16) {
            throw new SQLServerException("guid length must be 16", null);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    }

    static final Boolean isBinaryType(SSType ssType) {
        switch (ssType) {
            case BINARY:
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    }

    static final boolean isCharType(int jdbcType) {
        switch (jdbcType) {
            case java.sql.Types.CHAR:
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    }

    final void setServerName(String name) {
        serverName = name;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    private String databaseName = "";

    final String getDatabaseName() {
        return databaseName;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    }

    final void setSchemaName(String name) {
        schemaName = name;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    private String schemaName = "";

    final String getSchemaName() {
        return schemaName;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    }

    static final String readGUID(byte[] inputGUID) {
        String guidTemplate = "NNNNNNNN-NNNN-NNNN-NNNN-NNNNNNNNNNNN";
        byte[] guid = inputGUID;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    }

    static final byte[] asGuidByteArray(UUID aId) {
        long msb = aId.getMostSignificantBits();
        long lsb = aId.getLeastSignificantBits();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    }

    final void setObjectName(String name) {
        objectName = name;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    }

    static final Boolean isBinaryType(int jdbcType) {
        switch (jdbcType) {
            case java.sql.Types.BINARY:
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBlob.java`
#### Snippet
```java
     * Returns string representation of object
     */
    public final String toString() {
        return traceID;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     * @return the required object.
     */
    static final Object convertStringToObject(String stringVal, Charset charset, JDBCType jdbcType,
            StreamType streamType) throws UnsupportedEncodingException {
        switch (jdbcType) {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     * @return the required object.
     */
    static final Object convertLongToObject(long longVal, JDBCType jdbcType, SSType baseSSType, StreamType streamType) {
        switch (jdbcType) {
            case BIGINT:
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
    // Returns true if input bigDecimalValue exceeds allowable
    // TDS wire format precision or scale for DECIMAL TDS token.
    static final boolean exceedsMaxRPCDecimalPrecisionOrScale(BigDecimal bigDecimalValue) {
        if (null == bigDecimalValue)
            return false;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
    }

    final void setLength(long newLength) {
        // We only expect length to be changed from an initial unknown value (-1)
        // to an actual length (+ve or 0).
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
    }

    static final byte[] convertBigDecimalToBytes(BigDecimal bigDecimalVal, int scale) {
        byte[] valueBytes;

```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     * @return the byte array containing the big-endian encoded value.
     */
    static final byte[] convertIntToBytes(int intValue, int valueLength) {
        byte[] bytes = new byte[valueLength];
        for (int i = valueLength; i-- > 0;) {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     * @return the required object.
     */
    static final Object convertMoneyToObject(BigDecimal bigDecimalVal, JDBCType jdbcType, StreamType streamType,
            int numberOfBytes) {
        switch (jdbcType) {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
    private long length;

    final long getLength() {
        return length;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
    static final InputStreamGetterArgs defaultArgs = new InputStreamGetterArgs(StreamType.NONE, false, false, "");

    static final InputStreamGetterArgs getDefaultArgs() {
        return defaultArgs;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
    }

    static final byte[] convertMoneyToBytes(BigDecimal bigDecimalVal, int bLength) {
        byte[] valueBytes = new byte[bLength];

```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     * @return the byte array containing the big-endian encoded value.
     */
    static final byte[] convertLongToBytes(long longValue) {
        byte[] bytes = new byte[8];
        for (int i = 8; i-- > 0;) {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     * @return the required object.
     */
    static final Object convertDoubleToObject(double doubleVal, JDBCType jdbcType, StreamType streamType) {
        switch (jdbcType) {
            case FLOAT:
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     * @return the required object.
     */
    static final Object convertFloatToObject(float floatVal, JDBCType jdbcType, StreamType streamType) {
        switch (jdbcType) {
            case REAL:
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     * @return a Java object of the desired type.
     */
    static final Object convertTemporalToObject(JDBCType jdbcType, SSType ssType, Calendar timeZoneCalendar,
            int daysSinceBaseDate, long ticksSinceMidnight, int fractionalSecondsScale) throws SQLServerException {

```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     *         when an error occurs.
     */
    static final Object convertBytesToObject(byte[] bytesValue, JDBCType jdbcType,
            TypeInfo baseTypeInfo) throws SQLServerException {
        switch (jdbcType) {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
    }

    static final Object convertStreamToObject(BaseInputStream stream, TypeInfo typeInfo, JDBCType jdbcType,
            InputStreamGetterArgs getterArgs) throws SQLServerException {
        // Need to handle the simple case of a null value here, as it is not done
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     * @return the required object.
     */
    static final Object convertIntegerToObject(int intValue, int valueLength, JDBCType jdbcType,
            StreamType streamType) {
        switch (jdbcType) {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     * @return the required object.
     */
    static final Object convertBigDecimalToObject(BigDecimal bigDecimalVal, JDBCType jdbcType, StreamType streamType) {
        switch (jdbcType) {
            case DECIMAL:
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerNClob.java`
#### Snippet
```java

    @Override
    final JDBCType getJdbcType() {
        return JDBCType.NCLOB;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java

        @Override
        final void processResponse(TDSReader tdsReader) throws SQLServerException {
            ensureExecuteResultsReader(tdsReader);
            processExecuteResults();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
        }

        final boolean doExecute() throws SQLServerException {
            stmt.doExecuteStatementBatch(this);
            return false;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
        final private boolean wasResponseBufferingSet;

        final boolean wasResponseBufferingSet() {
            return wasResponseBufferingSet;
        }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
            }

            final long getUpdateCount() {
                return stmtDoneToken.getUpdateCount();
            }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
            private StreamDone stmtDoneToken = null;

            final boolean isUpdateCount() {
                return null != stmtDoneToken;
            }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java

        @Override
        final void processResponse(TDSReader tdsReader) throws SQLServerException {
            ensureExecuteResultsReader(tdsReader);
            processExecuteResults();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
        final private boolean isResponseBufferingAdaptive;

        final boolean isResponseBufferingAdaptive() {
            return isResponseBufferingAdaptive;
        }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
            private boolean isResultSet = false;

            final boolean isResultSet() {
                return isResultSet;
            }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
        final private int holdability;

        final int getHoldability() {
            return holdability;
        }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
        }

        final boolean doExecute() throws SQLServerException {
            stmt.doExecuteStatement(this);
            return false;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
    private SqlVariant internalVariant;

    final void skipValue(TypeInfo typeInfo, TDSReader tdsReader, boolean isDiscard) throws SQLServerException {
        assert false;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
    }

    final void skipValue(TypeInfo type, TDSReader tdsReader, boolean isDiscard) throws SQLServerException {
        // indicates that this value was obtained from NBCROW
        // So, there is nothing else to read from the wire
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
    }

    final void initFromCompressedNull() {
        assert false;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
     * @return true if impl is not null
     */
    final boolean isInitialized() {
        return (null != impl);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
    }

    final void setForceEncrypt(boolean forceEncrypt) {
        impl.setForceEncrypt(forceEncrypt);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
    }

    final void setCalendar(Calendar calendar) {
        impl.setCalendar(calendar);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
     * Returns the DTV's current JDBC type
     */
    final JavaType getJavaType() {
        assert null != impl;
        return impl.getJavaType();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
     * Returns the DTV's current JDBC type
     */
    final JDBCType getJdbcType() {
        assert null != impl;
        return impl.getJdbcType();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
    }

    final void setStreamSetterArgs(StreamSetterArgs streamSetterArgs) {
        impl.setStreamSetterArgs(streamSetterArgs);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
    }

    final void skipValue(TypeInfo type, TDSReader tdsReader, boolean isDiscard) throws SQLServerException {
        if (null == impl)
            impl = new ServerDTVImpl();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
    }

    final void setJdbcType(JDBCType jdbcType) {
        if (null == impl)
            impl = new AppDTVImpl();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
    // for the DTV when a null value is
    // received from NBCROW for a particular column
    final void initFromCompressedNull() {
        assert valueMark == null;
        isNull = true;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
     * See DTVExecuteOp
     */
    final void executeOp(DTVExecuteOp op) throws SQLServerException {
        JDBCType jdbcType = getJdbcType();
        Object value = getSetterValue();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
    }

    final void initFromCompressedNull() {
        if (null == impl)
            impl = new ServerDTVImpl();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
    }

    final void clear() {
        impl = null;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
    }

    final void setScale(Integer scale) {
        impl.setScale(scale);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
    }

    final void setValue(Object value, JavaType javaType) {
        impl.setValue(value, javaType);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
    }

    final void close() throws SQLServerException {
        lock.lock();
        try {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLCollation.java`
#### Snippet
```java
    }

    static final int tdsLength() {
        return TDS_LENGTH;
    } // Length of collation in TDS (in bytes)
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLCollation.java`
#### Snippet
```java
    }

    final boolean hasAsciiCompatibleSBCS() {
        return encoding.hasAsciiCompatibleSBCS();
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLCollation.java`
#### Snippet
```java
    }

    final boolean supportsAsciiConversion() {
        return encoding.supportsAsciiConversion();
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLCollation.java`
#### Snippet
```java

    // Utility methods for getting details of this collation's encoding
    final Charset getCharset() throws SQLServerException {
        return encoding.charset();
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java

    @Override
    final public String toString() {
        return traceID;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
    private final String name;

    final String getName() {
        return name;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
    }

    static final DriverPropertyInfo[] getPropertyInfoFromProperties(Properties props) {
        DriverPropertyInfo[] properties = new DriverPropertyInfo[DRIVER_PROPERTIES.length];

```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/PLPInputStream.java`
#### Snippet
```java
    private final ByteArrayInputStream bomStream = new ByteArrayInputStream(xmlBOM);

    static final PLPXMLInputStream makeXMLStream(TDSReader tdsReader, InputStreamGetterArgs getterArgs,
            ServerDTVImpl dtv) throws SQLServerException {
        // Read total length of PLP stream.
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
                    }

                    final boolean doExecute() throws SQLServerException {
                        TDSWriter tdsWriter = startRequest(TDS.PKT_RPC);
                        tdsWriter.writeShort((short) 0xFFFF); // procedure name length -> use ProcIDs
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java

        @Override
        final void processResponse(TDSReader tdsReader) throws SQLServerException {
            ensureExecuteResultsReader(tdsReader);
            processExecuteResults();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
        }

        final boolean doExecute() throws SQLServerException {
            stmt.doExecutePreparedStatement(this);
            return false;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java

        @Override
        final void processResponse(TDSReader tdsReader) throws SQLServerException {
            ensureExecuteResultsReader(tdsReader);
            processExecuteResults();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
        }

        final boolean doExecute() throws SQLServerException {
            stmt.doExecutePreparedStatementBatch(this);
            return true;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/DataTypes.java`
#### Snippet
```java

    // Utility methods to check a reported length against the maximums allowed
    static final long getCheckedLength(SQLServerConnection con, JDBCType jdbcType, long length,
            boolean allowUnknown) throws SQLServerException {
        long maxLength;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/DataTypes.java`
#### Snippet
```java

    // ResultSet & CallableStatement getXXX conversions (SSType --> JDBCType)
    static final void throwConversionError(String fromType, String toType) throws SQLServerException {
        MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_unsupportedConversionFromTo"));
        Object[] msgArgs = {fromType, toType};
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerException.java`
#### Snippet
```java
    }

    final void setDriverErrorCode(int value) {
        driverErrorCode = value;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerException.java`
#### Snippet
```java
    private SQLServerError sqlServerError;

    final int getDriverErrorCode() {
        return driverErrorCode;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/ScrollWindow.java`
#### Snippet
```java
    }

    final String logCursorState() {
        return " currentRow:" + currentRow + " maxRows:" + maxRows;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/ScrollWindow.java`
#### Snippet
```java
    }

    final void previous(SQLServerResultSet rs) throws SQLServerException {
        if (SQLServerResultSet.logger.isLoggable(java.util.logging.Level.FINER))
            SQLServerResultSet.logger.finer(rs.toString() + logCursorState());
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/ScrollWindow.java`
#### Snippet
```java
    }

    final boolean next(SQLServerResultSet rs) throws SQLServerException {
        if (SQLServerResultSet.logger.isLoggable(java.util.logging.Level.FINER))
            SQLServerResultSet.logger.finer(rs.toString() + logCursorState());
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/ScrollWindow.java`
#### Snippet
```java
    }

    final void clear() {
        for (int i = 0; i < rowMark.length; ++i) {
            rowMark[i] = null;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/ScrollWindow.java`
#### Snippet
```java
    }

    final void resize(int newSize) {
        assert newSize > 0;
        if (newSize != size)
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/ScrollWindow.java`
#### Snippet
```java
    private int maxRows = 0;

    final int getMaxRows() {
        return maxRows;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/ScrollWindow.java`
#### Snippet
```java
    }

    final void reset() {
        currentRow = 0;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/ScrollWindow.java`
#### Snippet
```java
    private int currentRow;

    final int getRow() {
        return currentRow;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCallableStatement.java`
#### Snippet
```java
            private boolean foundParam;

            final boolean foundParam() {
                return foundParam;
            }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCallableStatement.java`
#### Snippet
```java
            }

            final void reset() {
                foundParam = false;
            }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSetMetaData.java`
#### Snippet
```java
    }

    final public String toString() {
        return traceID;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
     * Skip value.
     */
    final void skipRetValStatus(TDSReader tdsReader) throws SQLServerException {

        StreamRetValue srv = new StreamRetValue();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
    }

    final CryptoMetadata getCryptoMetadata() {
        return cryptoMeta;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
     * Skip value.
     */
    final void skipValue(TDSReader tdsReader, boolean isDiscard) throws SQLServerException {
        if (null == getterDTV)
            getterDTV = new DTV();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
     * semantics that we don't need here.
     */
    final Parameter cloneForBatch() {
        Parameter clonedParam = new Parameter(shouldHonorAEForParameter);
        clonedParam.typeInfo = typeInfo;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        }

        final void addToMap(String databaseName, CallableStatement stmt) {
            if (null != databaseName) {
                nullCatalog = false;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
     * @return traceID string
     */
    final public String toString() {
        return traceID;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        }

        final CallableStatement getMappedStatement(String databaseName) {
            if (null != databaseName) {
                if (null != statementMap && statementMap.containsKey(databaseName)) {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        }

        final boolean doExecute() throws SQLServerException {
            TDSWriter tdsWriter = startRequest(TDS.PKT_RPC);
            tdsWriter.writeShort((short) 0xFFFF); // procedure name length -> use ProcIDs
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
            private int rowCount = UNKNOWN_ROW_COUNT;

            final int getRowCount() {
                return rowCount;
            }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
                }

                final boolean doExecute() throws SQLServerException {
                    TDSWriter tdsWriter = startRequest(TDS.PKT_RPC);
                    tdsWriter.writeShort((short) 0xFFFF); // procedure name length -> use ProcIDs
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
            private final SQLServerStatement stmt;

            final int getRowCount() {
                return stmt.getServerCursorRowCount();
            }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
         * Repositions the fetch buffer back to the beginning.
         */
        final void reset() {
            assert null != tdsReader;
            assert null != startMark;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        }

        final void ensureStartMark() {
            if (null == startMark && !isForwardOnly()) {
                if (logger.isLoggable(java.util.logging.Level.FINEST))
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
            }

            final boolean doExecute() throws SQLServerException {
                doDeleteRowRPC(this);
                return true;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java

        @Override
        final void processResponse(TDSReader responseTDSReader) throws SQLServerException {
            tdsReader = responseTDSReader;
            discardFetchBuffer();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
         * Moves to the next row in the fetch buffer.
         */
        final RowType nextRow() throws SQLServerException {
            fetchBufferCurrentRowType = RowType.UNKNOWN;

```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
            }

            final int getServerCursorId() {
                return 0;
            }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
            }

            final boolean doExecute() throws SQLServerException {
                doInsertRowRPC(this, tableName);
                return true;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
         * buffer to allow the fetch buffer to be scrolled back to the beginning.
         */
        final void init() {
            startMark = (0 == serverCursorId && !isForwardOnly()) ? tdsReader.mark() : null;
            fetchBufferCurrentRowType = RowType.UNKNOWN;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
            }

            final int getServerCursorId() {
                return stmt.getServerCursorId();
            }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
            }

            final boolean doExecute() throws SQLServerException {
                doUpdateRowRPC(this);
                return true;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        private TDSReaderMark startMark;

        final void clearStartMark() {
            startMark = null;
        }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        private boolean needsServerCursorFixup;

        final boolean needsServerCursorFixup() {
            return needsServerCursorFixup;
        }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
            }

            final boolean doExecute() throws SQLServerException {
                int timeoutSeconds = copyOptions.getBulkCopyTimeout();
                if (timeoutSeconds > 0) {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final char readChar() throws SQLServerException {
        return (char) readShort();
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final Object readDateTime(int valueLength, Calendar appTimeZoneCalendar, JDBCType jdbcType,
            StreamType streamType) throws SQLServerException {
        // Build and return the right kind of temporal object.
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    // the client MUST send the next packet with both ignore bit (0x02) and EOM bit (0x01)
    // set in the status to cancel the request.
    final boolean ignoreMessage() throws SQLServerException {
        if (packetNum > 0 || TDS.PKT_BULK == this.tdsMessageType) {
            assert !isEOMSent;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final void write(byte[] data, int offset, int length) throws SQLServerException {
        try {
            outputStreamLock.lock();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final void tryProcessFeatureExtAck(boolean featureExtAckReceived) throws SQLServerException {
        // in case of redirection, do not check if TDS_FEATURE_EXTENSION_ACK is received or not.
        if (null != this.con.getRoutingInfo()) {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final int readInt() throws SQLServerException {
        if (payloadOffset + 4 <= currentPacket.payloadLength) {
            int value = Util.readInt(currentPacket.payload, payloadOffset);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final void stream() {
        isStreaming = true;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    private final String traceID;

    final public String toString() {
        return traceID;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final Object readTime(int valueLength, TypeInfo typeInfo, Calendar appTimeZoneCalendar,
            JDBCType jdbcType) throws SQLServerException {
        if (TDS.timeValueLength(typeInfo.getScale()) != valueLength)
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * occur only from one thread at a time.
     */
    final boolean sendAttention() throws SQLServerException {
        // If any request packets were already written to the server then send an
        // attention signal to the server to tell it to ignore the request or
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final void reset(TDSReaderMark mark) {
        if (logger.isLoggable(Level.FINEST))
            logger.finest(this.toString() + ": Resetting to: " + mark.toString());
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     *         thrown if the socket timeout cannot be read
     */
    final int getNetworkTimeout() throws IOException {
        return tcpSocket.getSoTimeout();
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final byte getServerSupportedDataClassificationVersion() {
        return serverSupportedDataClassificationVersion;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final long readUnsignedInt() throws SQLServerException {
        return readInt() & 0xFFFFFFFFL;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final TDSReaderMark mark() {
        TDSReaderMark mark = new TDSReaderMark(currentPacket, payloadOffset);
        isStreaming = false;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final boolean getServerSupportsColumnEncryption() {
        return serverSupportsColumnEncryption;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final Object readDateTimeOffset(int valueLength, TypeInfo typeInfo, JDBCType jdbcType) throws SQLServerException {
        if (TDS.datetimeoffsetValueLength(typeInfo.getScale()) != valueLength)
            throwInvalidTDS();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final boolean getServerSupportsDataClassification() {
        return serverSupportsDataClassification;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    private final boolean isLoggingPackets = packetLogger.isLoggable(Level.FINEST);

    final boolean isLoggingPackets() {
        return isLoggingPackets;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final void resetPooledConnection() {
        if (logger.isLoggable(Level.FINEST))
            logger.finest(toString() + " resetPooledConnection");
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final void throwInvalidTDSToken(String tokenName) throws SQLServerException {
        if (logger.isLoggable(Level.SEVERE))
            logger.severe(toString() + " got unexpected value in TDS response at offset:" + payloadOffset);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    private static final Logger logger = Logger.getLogger("com.microsoft.sqlserver.jdbc.internals.TDS.Channel");

    final Logger getLogger() {
        return logger;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final void readBytes(byte[] value, int valueOffset, int valueLength) throws SQLServerException {
        for (int bytesRead = 0; bytesRead < valueLength;) {
            // Ensure that we have a packet to read from.
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    static final int SQL_VARIANT_LENGTH = 8009;

    static final String getTokenName(int tdsTokenType) {
        switch (tdsTokenType) {
            case TDS_RET_STAT:
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final int readUnsignedShort() throws SQLServerException {
        if (payloadOffset + 2 <= currentPacket.payloadLength) {
            int value = Util.readUnsignedShort(currentPacket.payload, payloadOffset);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final byte[] readWrappedBytes(int valueLength) throws SQLServerException {
        assert valueLength <= valueBytes.length;
        readBytes(valueBytes, 0, valueLength);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final String readUnicodeString(int length) throws SQLServerException {
        int byteLength = 2 * length;
        byte[] bytes = new byte[byteLength];
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final short peekStatusFlag() {
        // skip the current packet(i.e, TDS packet type) and peek into the status flag (USHORT)
        if (payloadOffset + 3 <= currentPacket.payloadLength) {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * the response and another thread that is trying to buffer it with TDSCommand.detach().
     */
    final boolean readPacket() throws SQLServerException {
        lock.lock();
        try {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    volatile TDSPacket next;

    final public String toString() {
        return "TDSPacket(SPID:" + Util.readUnsignedShortBigEndian(header, TDS.PACKET_HEADER_SPID) + " Seq:"
                + header[TDS.PACKET_HEADER_SEQUENCE_NUM] + ")";
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * Reads a multi-part table name from TDS and returns it as an array of Strings.
     */
    final SQLIdentifier readSQLIdentifier() throws SQLServerException {
        // Multi-part names should have between 1 and 4 parts
        int numParts = readUnsignedByte();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final Object readDecimal(int valueLength, TypeInfo typeInfo, JDBCType jdbcType,
            StreamType streamType) throws SQLServerException {
        if (valueLength > valueBytes.length) {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final SQLServerConnection getConnection() {
        return con;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final void close() {
        if (null != sslSocket)
            disableSSL();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final SQLCollation readCollation() throws SQLServerException {
        SQLCollation collation = null;

```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    private final transient TDSWriter tdsWriter;

    final TDSWriter getWriter() {
        return tdsWriter;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     *         default (no trust store, no password specified) path.
     */
    final InputStream loadTrustStore(String trustStoreFileName) {
        FileInputStream is = null;

```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final int read(byte[] data, int offset, int length) throws SQLServerException {
        try {
            inputStreamLock.lock();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final void endMessage() throws SQLServerException {
        if (logger.isLoggable(Level.FINEST))
            logger.finest(toString() + " Finishing TDS message");
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final Object readMoney(int valueLength, JDBCType jdbcType, StreamType streamType) throws SQLServerException {
        BigInteger bi;
        switch (valueLength) {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     *         thrown if the socket timeout cannot be set
     */
    final void setNetworkTimeout(int timeout) throws IOException {
        tcpSocket.setSoTimeout(timeout);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    private transient ScheduledFuture<?> timeout;

    final public String toString() {
        return traceID;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @return InetSocketAddress of the connection socket.
     */
    final InetSocketAddress open(String host, int port, int timeoutMillis, boolean useParallel, boolean useTnir,
            boolean isTnirFirstAttempt, int timeoutMillisForFullTimeout,
            String iPAddressPreference) throws SQLServerException {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final TDSReader getReader(TDSCommand command) {
        return new TDSReader(this, con, command);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final Object readDate(int valueLength, Calendar appTimeZoneCalendar, JDBCType jdbcType) throws SQLServerException {
        if (TDS.DAYS_INTO_CE_LENGTH != valueLength)
            throwInvalidTDS();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    private final TDSCommand command;

    final TDSCommand getCommand() {
        assert null != command;
        return command;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final short readShort() throws SQLServerException {
        if (payloadOffset + 2 <= currentPacket.payloadLength) {
            short value = Util.readShort(currentPacket.payload, payloadOffset);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @return the actual number of bytes available.
     */
    final int available() {
        // The number of bytes that can be read without blocking is just the number
        // of bytes that are currently buffered. That is the number of bytes left
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final void error(String reason, SQLState sqlState, DriverError driverError) throws SQLServerException {
        assert null != command;
        command.interrupt(reason);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final void throwInvalidTDS() throws SQLServerException {
        if (logger.isLoggable(Level.SEVERE))
            logger.severe(toString() + " got unexpected value in TDS response at offset:" + payloadOffset);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final void flush() throws SQLServerException {
        try {
            con.idleNetworkTracker.markNetworkActivity();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final Object readDateTime2(int valueLength, TypeInfo typeInfo, Calendar appTimeZoneCalendar,
            JDBCType jdbcType) throws SQLServerException {
        if (TDS.datetime2ValueLength(typeInfo.getScale()) != valueLength)
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @throws SQLServerException
     */
    final void readSkipBytes(int valueLength) throws SQLServerException {
        for (int bytesSkipped = 0; bytesSkipped < valueLength;) {
            // Ensure that we have a packet to read from.
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final int readUnsignedByte() throws SQLServerException {
        // Ensure that we have a packet to read from.
        if (!ensurePayload())
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final void trySetSensitivityClassification(SensitivityClassification sensitivityClassification) {
        this.sensitivityClassification = sensitivityClassification;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final Object readReal(int valueLength, JDBCType jdbcType, StreamType streamType) throws SQLServerException {
        if (4 != valueLength)
            throwInvalidTDS();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        }

        final void setFilteredStream(InputStream is) {
            filteredStream = is;
        }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @return number of bytes available in the current packet
     */
    final int availableCurrentPacket() {
        /*
         * The number of bytes that can be read from the current chunk, without including the next chunk that is
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @return
     */
    final Boolean networkSocketStillConnected() {
        int origSoTimeout;
        inputStreamLock.lock();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final Object readFloat(int valueLength, JDBCType jdbcType, StreamType streamType) throws SQLServerException {
        if (8 != valueLength)
            throwInvalidTDS();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    static final byte ENCRYPT_INVALID = (byte) 0xFF;

    static final String getEncryptionLevel(int level) {
        switch (level) {
            case ENCRYPT_OFF:
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    final static String GUID_TEMPLATE = "NNNNNNNN-NNNN-NNNN-NNNN-NNNNNNNNNNNN";

    final Object readGUID(int valueLength, JDBCType jdbcType, StreamType streamType) throws SQLServerException {
        // GUIDs must be exactly 16 bytes
        if (16 != valueLength)
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final int peekTokenType() throws SQLServerException {
        // Check whether we're at EOF
        if (!ensurePayload())
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final void skip(int bytesToSkip) throws SQLServerException {
        assert bytesToSkip >= 0;

```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final boolean isColumnEncryptionSettingEnabled() {
        return useColumnEncryption;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final boolean isEOM() {
        return TDS.STATUS_BIT_EOM == (header[TDS.PACKET_HEADER_MESSAGE_STATUS] & TDS.STATUS_BIT_EOM);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final int readIntBigEndian() throws SQLServerException {
        if (payloadOffset + 4 <= currentPacket.payloadLength) {
            int value = Util.readIntBigEndian(currentPacket.payload, payloadOffset);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        }

        final void setFilteredStream(OutputStream os) {
            filteredStream = os;
        }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    private final String traceID;

    final public String toString() {
        return traceID;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    final long readLong() throws SQLServerException {
        if (payloadOffset + 8 <= currentPacket.payloadLength) {
            long value = Util.readLong(currentPacket.payload, payloadOffset);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            }

            final boolean doExecute() throws SQLServerException {
                TDSWriter tdsWriter = startRequest(TDS.PKT_DTC);
                tdsWriter.sendEnclavePackage(null, null);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        }

        final boolean doExecute() throws SQLServerException {
            logon(this);
            return true;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        }

        final boolean doExecute() throws SQLServerException {
            sendFedAuthToken(this, sqlFedAuthToken, tdsTokenHandler);
            return true;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            }

            final boolean doExecute() throws SQLServerException {
                TDSWriter tdsWriter = startRequest(TDS.PKT_QUERY);
                tdsWriter.sendEnclavePackage(null, null);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            }

            final boolean complete(LogonCommand logonCommand, TDSReader tdsReader) throws SQLServerException {
                // If we have the login ack already then we're done processing.
                if (null != loginAckToken)
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkBatchInsertRecord.java`
#### Snippet
```java
            case java.sql.Types.TIMESTAMP:
            case microsoft.sql.Types.DATETIMEOFFSET:
                columnMetadata.put(positionInSource,
                        new ColumnMetadata(colName, jdbcType, precision, scale, dateTimeFormatter));
                break;

```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java
                break;
            case CIRCULARSTRING:
                totalSize += NUMBER_OF_SHAPES_SIZE; // number of points
                totalSize += numberOfPoints * WKB_POINT_SIZE;
                break;
            case COMPOUNDCURVE:
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `src/main/java/com/microsoft/sqlserver/jdbc/DLLException.java`
#### Snippet
```java
                break;
            case 4:
                message = "R_AEWinApiErr";
                break;
            case 5:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java

                case TDS.SCROLLOPT_FAST_FORWARD:
                    throwNotScrollable();
                    break;

```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java

            case MONEY4:
                writeBulkCopySqlVariantHeader(21, TDSType.DECIMALN.byteValue(), (byte) 2, tdsWriter);
                tdsWriter.writeByte((byte) 38);
                tdsWriter.writeByte((byte) 4);
                tdsWriter.writeSqlVariantInternalBigDecimal((BigDecimal) colValue, bulkJdbcType);
                break;

```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
            case DATETIME4:
                // when the type is ambiguous, we write to bigger type
                writeBulkCopySqlVariantHeader(10, TDSType.DATETIME8.byteValue(), (byte) 0, tdsWriter);
                tdsWriter.writeDatetime(colValue.toString());
                break;

```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java

                case microsoft.sql.Types.SQL_VARIANT:
                    return sourceResultSet.getObject(srcColOrdinal);
                default:
                    MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_BulkTypeNotSupported"));
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
    }

    final private Savepoint setNamedSavepoint(String sName) throws SQLServerException {
        if (databaseAutoCommitMode) {
            SQLServerException.makeFromDriverError(this, this, SQLServerException.getErrString("R_cantSetSavepoint"),
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * Removes references to outstanding un-prepare requests. Should be run when connection is closed.
     */
    private final void cleanupPreparedStatementDiscardActions() {
        discardedPreparedStatementHandles.clear();
        discardedPreparedStatementHandleCount.set(0);
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `typeName` in enum 'InternalSpatialDatatype'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java

        private byte typeCode;
        private String typeName;
        private static final InternalSpatialDatatype[] VALUES = values();

```

### NonFinalFieldInEnum
Non-final field `typeCode` in enum 'InternalSpatialDatatype'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java
        INVALID_TYPE((byte) 0, null);

        private byte typeCode;
        private String typeName;
        private static final InternalSpatialDatatype[] VALUES = values();
```

### NonFinalFieldInEnum
Non-final field `rank` in enum 'SensitivityRank'
in `src/main/java/com/microsoft/sqlserver/jdbc/dataclassification/SensitivityClassification.java`
#### Snippet
```java

        private static final SensitivityRank[] VALUES = values();
        private int rank;

        private SensitivityRank(int rank) {
```

## RuleId[id=OctalLiteral]
### OctalLiteral
Octal integer `01`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                case java.sql.Types.TIME:
                    // Time is returned as Timestamp to preserve nano seconds.
                    cal.set(connection.baseYear(), Calendar.JANUARY, 01);
                    ts = new java.sql.Timestamp(cal.getTimeInMillis());
                    ts.setNanos(taNano);
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `new BigDecimal(data.toString().trim())`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkBatchInsertRecord.java`
#### Snippet
```java

            case Types.BIGINT: {
                BigDecimal bd = new BigDecimal(data.toString().trim());
                try {
                    return bd.setScale(0, RoundingMode.DOWN).longValueExact();
```

### DuplicateExpressions
Multiple occurrences of `new BigDecimal(data.toString().trim())`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkBatchInsertRecord.java`
#### Snippet
```java
            case Types.DECIMAL:
            case Types.NUMERIC: {
                BigDecimal bd = new BigDecimal(data.toString().trim());
                return bd.setScale(cm.scale, RoundingMode.HALF_UP);
            }
```

### DuplicateExpressions
Multiple occurrences of `str.substring(offset, offset + len)`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java

            // Append the new value
            sb.append(str.substring(offset, offset + len));

            // Use the combined string as the new value
```

### DuplicateExpressions
Multiple occurrences of `str.substring(offset, offset + len)`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java

            // Append the new value
            sb.append(str.substring(offset, offset + len));

            // Append the remainder of the original value
```

### DuplicateExpressions
Multiple occurrences of `SSType.VARCHAR.toString() + "(" + ((0 == bulkPrecision) ? SOURCE...`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                    case SMALLDATETIME:
                        if (null != serverBulkData && connection.getSendTemporalDataTypesAsStringForBulkCopy()) {
                            return SSType.VARCHAR.toString() + "("
                                    + ((0 == bulkPrecision) ? SOURCE_BULK_RECORD_TEMPORAL_MAX_PRECISION : bulkPrecision)
                                    + ")";
                        } else {
                            return SSType.SMALLDATETIME.toString();
```

### DuplicateExpressions
Multiple occurrences of `SSType.VARCHAR.toString() + "(" + ((0 == bulkPrecision) ? SOURCE...`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                    case DATETIME:
                        if (null != serverBulkData && connection.getSendTemporalDataTypesAsStringForBulkCopy()) {
                            return SSType.VARCHAR.toString() + "("
                                    + ((0 == bulkPrecision) ? SOURCE_BULK_RECORD_TEMPORAL_MAX_PRECISION : bulkPrecision)
                                    + ")";
                        } else {
                            return SSType.DATETIME.toString();
```

### DuplicateExpressions
Multiple occurrences of `SSType.VARCHAR.toString() + "(" + ((0 == bulkPrecision) ? destPr...`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                         */
                        if (null != serverBulkData && connection.getSendTemporalDataTypesAsStringForBulkCopy()) {
                            return SSType.VARCHAR.toString() + "("
                                    + ((0 == bulkPrecision) ? destPrecision : bulkPrecision) + ")";
                        } else {
                            return SSType.DATETIME2.toString() + "(" + bulkScale + ")";
```

### DuplicateExpressions
Multiple occurrences of `SSType.VARCHAR.toString() + "(" + ((0 == bulkPrecision) ? destPrecision : bulkPrecision) ...`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                 */
                if (null != serverBulkData && connection.getSendTemporalDataTypesAsStringForBulkCopy()) {
                    return SSType.VARCHAR.toString() + "(" + ((0 == bulkPrecision) ? destPrecision : bulkPrecision)
                            + ")";
                } else {
                    return SSType.DATE.toString();
```

### DuplicateExpressions
Multiple occurrences of `SSType.VARCHAR.toString() + "(" + ((0 == bulkPrecision) ? destPrecision : bulkPrecision) ...`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                 */
                if (null != serverBulkData && connection.getSendTemporalDataTypesAsStringForBulkCopy()) {
                    return SSType.VARCHAR.toString() + "(" + ((0 == bulkPrecision) ? destPrecision : bulkPrecision)
                            + ")";
                } else {
                    return SSType.TIME.toString() + "(" + bulkScale + ")";
```

### DuplicateExpressions
Multiple occurrences of `SSType.VARCHAR.toString() + "(" + ((0 == bulkPrecision) ? destPrecision : bulkPrecision) ...`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                 */
                if (null != serverBulkData && connection.getSendTemporalDataTypesAsStringForBulkCopy()) {
                    return SSType.VARCHAR.toString() + "(" + ((0 == bulkPrecision) ? destPrecision : bulkPrecision)
                            + ")";
                } else {
                    return SSType.DATETIMEOFFSET.toString() + "(" + bulkScale + ")";
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/com/microsoft/sqlserver/jdbc/ISQLServerEnclaveProvider.java`
#### Snippet
```java
    void addEntry(String servername, String catalog, String attestationUrl, BaseAttestationRequest b,
            EnclaveSession e) {
        StringBuilder sb = new StringBuilder(servername).append(catalog).append(attestationUrl);
        sessionCache.put(sb.toString(), new EnclaveCacheEntry(b, e));
    }
```

### StringBufferReplaceableByString
`StringBuilder keyLookup` can be replaced with 'String'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerNoneEnclaveProvider.java`
#### Snippet
```java

        // Check if the session exists in our cache
        StringBuilder keyLookup = new StringBuilder(connection.getServerName()).append(connection.getCatalog())
                .append(attestationUrl);
        EnclaveCacheEntry entry = enclaveCache.getSession(keyLookup.toString());
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
                        // same state
                    } else {
                        StringBuilder builder = new StringBuilder();
                        builder.append(name);
                        builder.append(ch);
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
                        }
                    } else {
                        StringBuilder builder = new StringBuilder();
                        builder.append(value);
                        builder.append(ch);
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
                     */
                    if (ch == '}' && i + 1 < tmpUrl.length() && tmpUrl.charAt(i + 1) == '}') {
                        StringBuilder builder = new StringBuilder();
                        builder.append(value);
                        builder.append(ch);
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
                            state = inEscapedValueEnd;
                        } else {
                            StringBuilder builder = new StringBuilder();
                            builder.append(value);
                            builder.append(ch);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/com/microsoft/sqlserver/jdbc/ActivityCorrelator.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id.toString());
        sb.append("-");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/com/microsoft/sqlserver/jdbc/SSPIAuthentication.java`
#### Snippet
```java
                logger.finer("Derived realm: " + realm);
            }
            StringBuilder sb = new StringBuilder("MSSQLSvc/");
            sb.append(dnsName).append(":").append(portOrInstance).append("@").append(realm.toUpperCase(Locale.ENGLISH));
            return sb.toString();
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
        if (null == xid)
            return "(null)";
        StringBuilder sb = new StringBuilder(300);
        sb.append("formatId=");
        sb.append(xid.getFormatId());
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerException.java`
#### Snippet
```java
            UUID clientConnId = conn.getClientConIdInternal();
            assert null != clientConnId;
            StringBuilder sb = new StringBuilder(errMsg);
            // This syntax of adding connection id is matched in a retry logic. If anything changes here, make
            // necessary changes to enableSSL() function's exception handling mechanism.
```

### StringBufferReplaceableByString
`StringBuilder keyLookup` can be replaced with 'String'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAASEnclaveProvider.java`
#### Snippet
```java
            ArrayList<String> parameterNames) throws SQLServerException {
        // Check if the session exists in our cache
        StringBuilder keyLookup = new StringBuilder(connection.getServerName()).append(connection.getCatalog())
                .append(attestationUrl);
        EnclaveCacheEntry entry = enclaveCache.getSession(keyLookup.toString());
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java

            // Start with the original value, up to the starting position
            StringBuilder sb = new StringBuilder((int) pos + len);
            sb.append(value.substring(0, (int) pos));

```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java
        else {
            // Start with the original value, up to the starting position
            StringBuilder sb = new StringBuilder(value.length());
            sb.append(value.substring(0, (int) pos));

```

### StringBufferReplaceableByString
`StringBuilder keyLookup` can be replaced with 'String'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerVSMEnclaveProvider.java`
#### Snippet
```java
            ArrayList<String> parameterNames) throws SQLServerException {
        // Check if the session exists in our cache
        StringBuilder keyLookup = new StringBuilder(connection.getServerName()).append(connection.getCatalog())
                .append(attestationUrl);
        EnclaveCacheEntry entry = enclaveCache.getSession(keyLookup.toString());
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java
                break;
            default:
                return;
        }
    }
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`(null == trustStorePassword) ? null : trustStorePassword` can be simplified to 'trustStorePassword'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                                .getDecryptedChars(con.encryptedTrustStorePassword);
                        try {
                            ks.load(is, (null == trustStorePassword) ? null : trustStorePassword);
                        } finally {
                            if (trustStorePassword != null)
```

### SimplifiableConditionalExpression
`(isDiscarded() || isExplicitlyDiscarded()) ? false : handleRefCount.incrementAndGet() > 0` can be simplified to '!isDiscarded() \&\& !isExplicitlyDiscarded() \&\& handleRefCount.incrementAndGet() \> 0'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
         */
        boolean tryAddReference() {
            return (isDiscarded() || isExplicitlyDiscarded()) ? false : handleRefCount.incrementAndGet() > 0;
        }

```

### SimplifiableConditionalExpression
`!isTDS8 ? TDS.ENCRYPT_INVALID != negotiatedEncryptionLevel : true` can be simplified to 'isTDS8 \|\| TDS.ENCRYPT_INVALID != negotiatedEncryptionLevel'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

    final byte getNegotiatedEncryptionLevel() {
        assert (!isTDS8 ? TDS.ENCRYPT_INVALID != negotiatedEncryptionLevel : true);
        return negotiatedEncryptionLevel;
    }
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
                        }
                    }
                    String stringValue = "" + value;
                    Short shortValue = Short.valueOf(stringValue);

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerMSAL4JUtils.java`
#### Snippet
```java
                logger.finest(
                        LOGCONTEXT + (authenticationResult.account() != null ? authenticationResult.account().username()
                                + ": " : "" + ACCESS_TOKEN_EXPIRE + authenticationResult.expiresOnDate()));
            }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerMSAL4JUtils.java`
#### Snippet
```java
                logger.finest(
                        LOGCONTEXT + (authenticationResult.account() != null ? authenticationResult.account().username()
                                + ": " : "" + ACCESS_TOKEN_EXPIRE + authenticationResult.expiresOnDate()));
            }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerMSAL4JUtils.java`
#### Snippet
```java
                logger.finest(
                        LOGCONTEXT + (authenticationResult.account() != null ? authenticationResult.account().username()
                                + ": " : "" + ACCESS_TOKEN_EXPIRE + authenticationResult.expiresOnDate()));
            }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerMSAL4JUtils.java`
#### Snippet
```java
                logger.finest(
                        LOGCONTEXT + (authenticationResult.account() != null ? authenticationResult.account().username()
                                + ": " : "" + ACCESS_TOKEN_EXPIRE + authenticationResult.expiresOnDate()));
            }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerMSAL4JUtils.java`
#### Snippet
```java
                logger.finest(
                        LOGCONTEXT + (authenticationResult.account() != null ? authenticationResult.account().username()
                                + ": " : "" + ACCESS_TOKEN_EXPIRE + authenticationResult.expiresOnDate()));
            }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
                    } else {
                        if (0 == ((BigDecimal) value).intValue()) {
                            String s = "" + value;
                            s = s.replaceAll("\\-", "");
                            if (s.startsWith("0.")) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
                        }
                        // if the value is in scientific notation format
                        else if (("" + value).contains("E")) {
                            DecimalFormat dform = new DecimalFormat("###.#####");
                            String s = dform.format(value);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
    static String replaceParameterWithString(String str, char marker, String replaceStr) {
        int index = 0;
        while ((index = str.indexOf("" + marker)) >= 0) {
            str = str.substring(0, index) + replaceStr + str.substring(index + 1, str.length());
        }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        int n = getDriverMinorVersion();
        String s = getDriverMajorVersion() + ".";
        s += "" + n;
        s = s + ".";
        s = s + SQLJdbcVersion.PATCH;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                    byte[] charBytes;
                    for (int charsCopied = 0; charsCopied < charsToWrite; ++charsCopied) {
                        charBytes = new String(streamCharBuffer[charsCopied] + "").getBytes(charSet);
                        System.arraycopy(charBytes, 0, streamByteBuffer, bytesToWrite, charBytes.length);
                        bytesToWrite += charBytes.length;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                }
            } else {
                String sParam = "" + nParam;
                sParam.getChars(0, sParam.length(), name, offset + 2);
                return 2 + sParam.length();
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerJdbc42.java`
#### Snippet
```java


    static final boolean checkSupportsJDBC43() {
        return false;
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerJdbc42.java`
#### Snippet
```java
    }

    static final void throwBatchUpdateException(SQLServerException lastError,
            long[] updateCounts) throws BatchUpdateException {
        throw new BatchUpdateException(lastError.getMessage(), lastError.getSQLState(), lastError.getErrorCode(),
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerJdbc43.java`
#### Snippet
```java
    }

    static final void throwBatchUpdateException(SQLServerException lastError,
            long[] updateCounts) throws BatchUpdateException {
        throw new BatchUpdateException(lastError.getMessage(), lastError.getSQLState(), lastError.getErrorCode(),
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerJdbc43.java`
#### Snippet
```java
    }

    static final boolean checkSupportsJDBC43() {
        return true;
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    }

    static final UUID readGUIDtoUUID(byte[] inputGUID) throws SQLServerException {
        if (inputGUID.length != 16) {
            throw new SQLServerException("guid length must be 16", null);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    }

    static final Boolean isBinaryType(SSType ssType) {
        switch (ssType) {
            case BINARY:
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    }

    static final Boolean isCharType(SSType ssType) {
        switch (ssType) {
            case CHAR:
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    }

    static final boolean isCharType(int jdbcType) {
        switch (jdbcType) {
            case java.sql.Types.CHAR:
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    }

    static final String readGUID(byte[] inputGUID) {
        String guidTemplate = "NNNNNNNN-NNNN-NNNN-NNNN-NNNNNNNNNNNN";
        byte[] guid = inputGUID;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    }

    static final byte[] asGuidByteArray(UUID aId) {
        long msb = aId.getMostSignificantBits();
        long lsb = aId.getLeastSignificantBits();
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    }

    static final Boolean isBinaryType(int jdbcType) {
        switch (jdbcType) {
            case java.sql.Types.BINARY:
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     * @return the required object.
     */
    static final Object convertStringToObject(String stringVal, Charset charset, JDBCType jdbcType,
            StreamType streamType) throws UnsupportedEncodingException {
        switch (jdbcType) {
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     * @return the required object.
     */
    static final Object convertLongToObject(long longVal, JDBCType jdbcType, SSType baseSSType, StreamType streamType) {
        switch (jdbcType) {
            case BIGINT:
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
    // Returns true if input bigDecimalValue exceeds allowable
    // TDS wire format precision or scale for DECIMAL TDS token.
    static final boolean exceedsMaxRPCDecimalPrecisionOrScale(BigDecimal bigDecimalValue) {
        if (null == bigDecimalValue)
            return false;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
    }

    static final byte[] convertBigDecimalToBytes(BigDecimal bigDecimalVal, int scale) {
        byte[] valueBytes;

```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     * @return the byte array containing the big-endian encoded value.
     */
    static final byte[] convertIntToBytes(int intValue, int valueLength) {
        byte[] bytes = new byte[valueLength];
        for (int i = valueLength; i-- > 0;) {
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     * @return the required object.
     */
    static final Object convertMoneyToObject(BigDecimal bigDecimalVal, JDBCType jdbcType, StreamType streamType,
            int numberOfBytes) {
        switch (jdbcType) {
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
    static final InputStreamGetterArgs defaultArgs = new InputStreamGetterArgs(StreamType.NONE, false, false, "");

    static final InputStreamGetterArgs getDefaultArgs() {
        return defaultArgs;
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
    }

    static final byte[] convertMoneyToBytes(BigDecimal bigDecimalVal, int bLength) {
        byte[] valueBytes = new byte[bLength];

```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     * @return the byte array containing the big-endian encoded value.
     */
    static final byte[] convertLongToBytes(long longValue) {
        byte[] bytes = new byte[8];
        for (int i = 8; i-- > 0;) {
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     * @return the required object.
     */
    static final Object convertDoubleToObject(double doubleVal, JDBCType jdbcType, StreamType streamType) {
        switch (jdbcType) {
            case FLOAT:
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     * @return the required object.
     */
    static final Object convertFloatToObject(float floatVal, JDBCType jdbcType, StreamType streamType) {
        switch (jdbcType) {
            case REAL:
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     * @return a Java object of the desired type.
     */
    static final Object convertTemporalToObject(JDBCType jdbcType, SSType ssType, Calendar timeZoneCalendar,
            int daysSinceBaseDate, long ticksSinceMidnight, int fractionalSecondsScale) throws SQLServerException {

```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     *         when an error occurs.
     */
    static final Object convertBytesToObject(byte[] bytesValue, JDBCType jdbcType,
            TypeInfo baseTypeInfo) throws SQLServerException {
        switch (jdbcType) {
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
    }

    static final Object convertStreamToObject(BaseInputStream stream, TypeInfo typeInfo, JDBCType jdbcType,
            InputStreamGetterArgs getterArgs) throws SQLServerException {
        // Need to handle the simple case of a null value here, as it is not done
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     * @return the required object.
     */
    static final Object convertIntegerToObject(int intValue, int valueLength, JDBCType jdbcType,
            StreamType streamType) {
        switch (jdbcType) {
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
     * @return the required object.
     */
    static final Object convertBigDecimalToObject(BigDecimal bigDecimalVal, JDBCType jdbcType, StreamType streamType) {
        switch (jdbcType) {
            case DECIMAL:
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLCollation.java`
#### Snippet
```java
    }

    static final int tdsLength() {
        return TDS_LENGTH;
    } // Length of collation in TDS (in bytes)
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
    }

    static final DriverPropertyInfo[] getPropertyInfoFromProperties(Properties props) {
        DriverPropertyInfo[] properties = new DriverPropertyInfo[DRIVER_PROPERTIES.length];

```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/PLPInputStream.java`
#### Snippet
```java
     *         when an error occurs
     */
    static final PLPInputStream makeTempStream(TDSReader tdsReader, boolean discardValue,
            ServerDTVImpl dtv) throws SQLServerException {
        return makeStream(tdsReader, discardValue, discardValue, dtv);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/PLPInputStream.java`
#### Snippet
```java
    }

    static final PLPInputStream makeStream(TDSReader tdsReader, InputStreamGetterArgs getterArgs,
            ServerDTVImpl dtv) throws SQLServerException {
        PLPInputStream is = makeStream(tdsReader, getterArgs.isAdaptive, getterArgs.isStreaming, dtv);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/PLPInputStream.java`
#### Snippet
```java
     * Non-destructive method for checking whether a PLP value at the current TDSReader location is null.
     */
    static final boolean isNull(TDSReader tdsReader) throws SQLServerException {
        TDSReaderMark mark = tdsReader.mark();
        // Temporary stream cannot get closes, since it closes the main stream.
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/PLPInputStream.java`
#### Snippet
```java
    private final ByteArrayInputStream bomStream = new ByteArrayInputStream(xmlBOM);

    static final PLPXMLInputStream makeXMLStream(TDSReader tdsReader, InputStreamGetterArgs getterArgs,
            ServerDTVImpl dtv) throws SQLServerException {
        // Read total length of PLP stream.
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/DataTypes.java`
#### Snippet
```java
        }

        static final boolean converts(SSType fromSSType, JDBCType toJDBCType) {
            return conversionMap.get(fromSSType.category).contains(toJDBCType.category);
        }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/DataTypes.java`
#### Snippet
```java

    // Utility methods to check a reported length against the maximums allowed
    static final long getCheckedLength(SQLServerConnection con, JDBCType jdbcType, long length,
            boolean allowUnknown) throws SQLServerException {
        long maxLength;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/DataTypes.java`
#### Snippet
```java

    // ResultSet & CallableStatement getXXX conversions (SSType --> JDBCType)
    static final void throwConversionError(String fromType, String toType) throws SQLServerException {
        MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_unsupportedConversionFromTo"));
        Object[] msgArgs = {fromType, toType};
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    static final byte ENCRYPT_INVALID = (byte) 0xFF;

    static final String getEncryptionLevel(int level) {
        switch (level) {
            case ENCRYPT_OFF:
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    static final int SQL_VARIANT_LENGTH = 8009;

    static final String getTokenName(int tdsTokenType) {
        switch (tdsTokenType) {
            case TDS_RET_STAT:
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
    public Builder<K, V> weigher(EntryWeigher<? super K, ? super V> weigher) {
      this.weigher = (weigher == Weighers.entrySingleton())
          ? Weighers.<K, V>entrySingleton()
          : new BoundedEntryWeigher<K, V>(weigher);
      return this;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
    public Builder<K, V> weigher(Weigher<? super V> weigher) {
      this.weigher = (weigher == Weighers.singleton())
          ? Weighers.<K, V>entrySingleton()
          : new BoundedEntryWeigher<K, V>(Weighers.asEntryWeigher(weigher));
      return this;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/Weighers.java`
#### Snippet
```java
      final Weigher<? super V> weigher) {
    return (weigher == singleton())
        ? Weighers.<K, V>entrySingleton()
        : new EntryWeigherView<K, V>(weigher);
  }
```

## RuleId[id=ExplicitArrayFilling]
### ExplicitArrayFilling
Can be replaced with single 'Arrays.fill()' method call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java
        double sign;
        double[] coords = new double[4];
        for (int i = 0; i < coords.length; i++) {
            coords[i] = Double.NaN;
        }
```

### ExplicitArrayFilling
Can be replaced with single 'Arrays.fill()' method call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
            final int batchSize = batchStatementBuffer.size();
            int[] updateCounts = new int[batchSize];
            for (int batchNum = 0; batchNum < batchSize; batchNum++)
                updateCounts[batchNum] = Statement.EXECUTE_FAILED;

```

### ExplicitArrayFilling
Can be replaced with single 'Arrays.fill()' method call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
            final int batchSize = batchStatementBuffer.size();
            long[] updateCounts = new long[batchSize];
            for (int batchNum = 0; batchNum < batchSize; batchNum++)
                updateCounts[batchNum] = Statement.EXECUTE_FAILED;

```

### ExplicitArrayFilling
Can be replaced with single 'Arrays.fill()' method call
in `src/main/java/mssql/security/provider/MD4.java`
#### Snippet
```java

        xBufOff = 0;
        for (int i = 0; i < xBuf.length; i++) {
            xBuf[i] = 0;
        }
```

### ExplicitArrayFilling
Can be replaced with single 'Arrays.fill()' method call
in `src/main/java/mssql/security/provider/MD4.java`
#### Snippet
```java
        xOff = 0;

        for (int i = 0; i != X.length; i++) {
            X[i] = 0;
        }
```

### ExplicitArrayFilling
Can be replaced with single 'Arrays.fill()' method call
in `src/main/java/mssql/security/provider/MD4.java`
#### Snippet
```java
        //
        xOff = 0;
        for (int i = 0; i != X.length; i++) {
            X[i] = 0;
        }
```

### ExplicitArrayFilling
Can be replaced with single 'Arrays.fill()' method call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSymmetricKey.java`
#### Snippet
```java

    void zeroOutKey() {
        for (int i = 0; i < rootKey.length; i++) {
            rootKey[i] = (byte) 0;
        }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerError.java`
#### Snippet
```java
    /**
     * List SQL Server transient errors drivers will retry on from
     * https://docs.microsoft.com/en-us/azure/azure-sql/database/troubleshoot-common-errors-issues#transient-faults-connection-loss-and-other-temporary-errors
     * and SqlClient
     * https://github.com/dotnet/SqlClient/blob/main/src/Microsoft.Data.SqlClient/netfx/src/Microsoft/Data/SqlClient/SqlInternalConnectionTds.cs#L589
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerError.java`
#### Snippet
```java
     * https://docs.microsoft.com/en-us/azure/azure-sql/database/troubleshoot-common-errors-issues#transient-faults-connection-loss-and-other-temporary-errors
     * and SqlClient
     * https://github.com/dotnet/SqlClient/blob/main/src/Microsoft.Data.SqlClient/netfx/src/Microsoft/Data/SqlClient/SqlInternalConnectionTds.cs#L589
     */
    enum TransientError {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
    /**
     * Sets the Service Principal Name (SPN) of the target SQL Server.
     * https://msdn.microsoft.com/en-us/library/cc280459.aspx
     *
     * @param serverSpn
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/sqlserver/jdbc/dataclassification/SensitivityClassification.java`
#### Snippet
```java
     * Sensitivity Rank
     * 
     * https://docs.microsoft.com/sql/relational-databases/system-catalog-views/sys-sensitivity-classifications-transact-sql
     *
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLCollation.java`
#### Snippet
```java
     * The set of locales is derived from the following resources:
     *
     * http://download.microsoft.com/download/9/5/e/95ef66af-9026-4bb0-a41d-a4f81802d92c/[MS-LCID].pdf Lists LCID values
     * and their corresponding meanings (in RFC 3066 format). Used to derive the names for the various enumeration
     * constants.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLCollation.java`
#### Snippet
```java
 * Enumeration of encodings that are supported by SQL Server (and hopefully the JVM).
 *
 * See, for example, https://docs.oracle.com/javase/8/docs/technotes/guides/intl/encoding.doc.html for a complete list
 * of supported encodings with their canonical names.
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLCollation.java`
#### Snippet
```java
     * Per discussions with richards and michkap on UNICODE alias -> ASCII range is 0x00 to 0x7F. The range of 0x00 to
     * 0x7F of 1250-1258, 874, 932, 936, 949, and 950 are identical to ASCII. See also ->
     * http://blogs.msdn.com/michkap/archive/2005/11/23/495193.aspx
     */
    boolean supportsAsciiConversion() {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLCollation.java`
#### Snippet
```java
     * Per discussions with richards and michkap on UNICODE alias -> ASCII range is 0x00 to 0x7F. The range of 0x00 to
     * 0x7F of 1250-1258 and 874 are identical to ASCII for these SBCS character sets. See also ->
     * http://blogs.msdn.com/michkap/archive/2005/11/23/495193.aspx
     */
    boolean hasAsciiCompatibleSBCS() {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/mssql/googlecode/cityhash/CityHash.java`
#### Snippet
```java
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/sqlserver/jdbc/DataTypes.java`
#### Snippet
```java

    /**
     * Transact-SQL Data Types: http://msdn.microsoft.com/en-us/library/ms179910.aspx
     * 
     * varbinary(max) "max indicates that the maximum storage size is 2^31 - 1 bytes. The storage size is the actual
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/sqlserver/jdbc/DataTypes.java`
#### Snippet
```java
    /**
     * From SQL Server 2005 Books Online : ntext, text, and image (Transact-SQL)
     * http://msdn.microsoft.com/en-us/library/ms187993.aspx
     * 
     * image "... through 2^31 - 1 (2,147,483,687) bytes."
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
    /**
     * Writes data for a batch of rows to the TDSWriter object. Writes the following part in the BulkLoadBCP stream
     * (https://msdn.microsoft.com/en-us/library/dd340549.aspx) <ROW> ... </ROW>
     */
    private boolean writeBatchData(TDSWriter tdsWriter, TDSCommand command,
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * than @@version or serverproperty('edition').
     * 
     * Reference: https://docs.microsoft.com/sql/t-sql/functions/serverproperty-transact-sql
     * 
     * <pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        /**
         * Managed Identities endpoint URL
         * https://docs.microsoft.com/en-us/azure/active-directory/managed-identities-azure-resources/how-to-use-vm-token
         */
        static final String AZURE_REST_MSI_URL = "http://169.254.169.254/metadata/identity/oauth2/token?api-version=2018-02-01"; // NOSONAR
```

## RuleId[id=NegativeIntConstantInLongContext]
### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `src/main/java/com/microsoft/sqlserver/jdbc/IdleConnectionResiliency.java`
#### Snippet
```java
class SessionStateTable {
    static final int SESSION_STATE_ID_MAX = 256;
    static final long MASTER_RECOVERY_DISABLE_SEQ_NUMBER = 0XFFFFFFFF;
    private boolean masterRecoveryDisabled;
    private byte[][] sessionStateInitial;
```

### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `src/main/java/mssql/security/provider/MD4.java`
#### Snippet
```java
        }

        X[14] = (int) (bitLength & 0xffffffff);
        X[15] = (int) (bitLength >>> 32);
    }
```

### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
             * connection pool.
             */
            if (SessionStateTable.MASTER_RECOVERY_DISABLE_SEQ_NUMBER == sequenceNumber) {
                sessionRecovery.getSessionStateTable().setMasterRecoveryDisabled(true);
            }
```

### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                 */

                if (SessionStateTable.MASTER_RECOVERY_DISABLE_SEQ_NUMBER != sequenceNumber
                        && ((null == sessionRecovery.getSessionStateTable().getSessionStateDelta()[sessionStateId]
                                .getData())
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/sqlserver/jdbc/XMLTDSHeader.java`
#### Snippet
```java
    private final String owningSchema; // Owner of XML schema (like dbo for example).
    @SuppressWarnings("unused")
    private final String xmlSchemaCollection; // Name of XML schema collection.

    XMLTDSHeader(TDSReader tdsReader) throws SQLServerException {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/sqlserver/jdbc/XMLTDSHeader.java`
#### Snippet
```java
final class XMLTDSHeader {
    @SuppressWarnings("unused")
    private final String databaseName; // Database name where XML schema resides.
    @SuppressWarnings("unused")
    private final String owningSchema; // Owner of XML schema (like dbo for example).
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/sqlserver/jdbc/XMLTDSHeader.java`
#### Snippet
```java
    private final String databaseName; // Database name where XML schema resides.
    @SuppressWarnings("unused")
    private final String owningSchema; // Owner of XML schema (like dbo for example).
    @SuppressWarnings("unused")
    private final String xmlSchemaCollection; // Name of XML schema collection.
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256EncryptionKey.java`
#### Snippet
```java

    // Name of algorithm associated with this key
    private final String algorithmName;
    // Salt used to derive encryption key
    private String encryptionKeySaltFormat;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256EncryptionKey.java`
#### Snippet
```java
    private String macKeySaltFormat;
    // Salt used to derive iv key
    private String ivKeySaltFormat;
    private SQLServerSymmetricKey encryptionKey;
    private SQLServerSymmetricKey macKey;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256EncryptionKey.java`
#### Snippet
```java
    private final String algorithmName;
    // Salt used to derive encryption key
    private String encryptionKeySaltFormat;
    // Salt used to derive mac key
    private String macKeySaltFormat;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256EncryptionKey.java`
#### Snippet
```java
    private String encryptionKeySaltFormat;
    // Salt used to derive mac key
    private String macKeySaltFormat;
    // Salt used to derive iv key
    private String ivKeySaltFormat;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/sqlserver/jdbc/StreamRetValue.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused")
    private int status;

    StreamRetValue() {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/sqlserver/jdbc/StreamRetValue.java`
#### Snippet
```java
final class StreamRetValue extends StreamPacket {
    @SuppressWarnings("unused")
    private String paramName;

    /*
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerJdbc42.java`
#### Snippet
```java

    /** Client process ID sent during login */
    private static int pid = 0;

    static int getProcessId() {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/sqlserver/jdbc/UDTTDSHeader.java`
#### Snippet
```java
    private final String databaseName; // Database name where UDT type resides.
    @SuppressWarnings("unused")
    private final String schemaName; // Schema where UDT resides.
    private final String typeName; // Type name of UDT.
    @SuppressWarnings("unused")
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/sqlserver/jdbc/UDTTDSHeader.java`
#### Snippet
```java
    private final String typeName; // Type name of UDT.
    @SuppressWarnings("unused")
    private final String assemblyQualifiedName; // Assembly qualified name of UDT.

    UDTTDSHeader(TDSReader tdsReader) throws SQLServerException {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/sqlserver/jdbc/UDTTDSHeader.java`
#### Snippet
```java
    private final int maxLen; // MaxLen read from UDT type (not used when writing).
    @SuppressWarnings("unused")
    private final String databaseName; // Database name where UDT type resides.
    @SuppressWarnings("unused")
    private final String schemaName; // Schema where UDT resides.
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerFMTQuery.java`
#### Snippet
```java

    private String prefix = "";
    private ArrayList<? extends Token> tokenList = null;
    private List<String> userColumns = new ArrayList<>();
    private List<String> tableTarget = new ArrayList<>();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAConnection.java`
#### Snippet
```java

    /** logger */
    private transient Logger xaLogger;

    /** reentrant lock */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
    private Integer scale;
    @SuppressWarnings("unused")
    private boolean forceEncrypt;
    private SqlVariant internalVariant;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
                                                                      // logging

    final private int instanceID; // Unique id for this instance.
    final private String traceID;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256Factory.java`
#### Snippet
```java
class SQLServerAeadAes256CbcHmac256Factory extends SQLServerEncryptionAlgorithmFactory {
    // In future we can have more
    private byte algorithmVersion = 0x1;
    private ConcurrentHashMap<String, SQLServerAeadAes256CbcHmac256Algorithm> encryptionAlgorithms = new ConcurrentHashMap<>();

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

    // Id of the thread. used for diagnosis
    private final String threadID;

    // a counter used to give unique IDs to each connector thread.
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `PLPInputStream.read()` is ignored
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSQLXML.java`
#### Snippet
```java
        // Read two bytes to eat BOM
        try {
            contents.read();
            contents.read();
        } catch (IOException e) {
```

### IgnoreResultOfCall
Result of `PLPInputStream.read()` is ignored
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSQLXML.java`
#### Snippet
```java
        try {
            contents.read();
            contents.read();
        } catch (IOException e) {
            SQLServerException.makeFromDriverError(null, null, e.getMessage(), null, true);
```

### IgnoreResultOfCall
Result of `PLPInputStream.read()` is ignored
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSQLXML.java`
#### Snippet
```java
        // Read two bytes to eat BOM
        try {
            contents.read();
            contents.read();
        } catch (IOException e) {
```

### IgnoreResultOfCall
Result of `PLPInputStream.read()` is ignored
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSQLXML.java`
#### Snippet
```java
        try {
            contents.read();
            contents.read();
        } catch (IOException e) {
            SQLServerException.makeFromDriverError(null, null, e.getMessage(), null, true);
```

### IgnoreResultOfCall
Result of `SimpleInputStream.read()` is ignored
in `src/main/java/com/microsoft/sqlserver/jdbc/SimpleInputStream.java`
#### Snippet
```java
        byte[] value = new byte[payloadLength];
        try {
            read(value);
            close();
        } catch (IOException e) {
```

### IgnoreResultOfCall
Result of `SimpleInputStream.skip()` is ignored
in `src/main/java/com/microsoft/sqlserver/jdbc/SimpleInputStream.java`
#### Snippet
```java
        // at the next item in the TDS response. Once the stream is closed,
        // it can no longer access the discarded response data.
        skip((long) payloadLength - (long) streamPos);

        closeHelper();
```

### IgnoreResultOfCall
Result of `ByteBuffer.array()` is ignored
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
                                    .longValue();
                            ByteBuffer bbuf = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
                            bbuf.putInt((int) (moneyVal >> 32)).array();
                            bbuf.putInt((int) moneyVal).array();
                            op.execute(this, bbuf.array());
```

### IgnoreResultOfCall
Result of `ByteBuffer.array()` is ignored
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
                            ByteBuffer bbuf = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
                            bbuf.putInt((int) (moneyVal >> 32)).array();
                            bbuf.putInt((int) moneyVal).array();
                            op.execute(this, bbuf.array());
                        } else {
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerVSMEnclaveProvider.java`
#### Snippet
```java
            java.net.URLConnection con = url.openConnection();
            byte[] buff = new byte[con.getInputStream().available()];
            con.getInputStream().read(buff, 0, buff.length);
            String s = new String(buff);
            // omit the square brackets that come with the JSON
```

### IgnoreResultOfCall
Result of `ByteBuffer.array()` is ignored
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                            new java.math.MathContext(digitCount, java.math.RoundingMode.HALF_UP)).longValue();
                    ByteBuffer bbuf = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
                    bbuf.putInt((int) (moneyVal >> 32)).array();
                    bbuf.putInt((int) moneyVal).array();
                    return bbuf.array();
```

### IgnoreResultOfCall
Result of `ByteBuffer.array()` is ignored
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                    ByteBuffer bbuf = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
                    bbuf.putInt((int) (moneyVal >> 32)).array();
                    bbuf.putInt((int) moneyVal).array();
                    return bbuf.array();

```

### IgnoreResultOfCall
Result of `Condition.await()` is ignored
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

                    try {
                        parentCondition.await(timeRemaining, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException ie) {
                        // Don't re-interrupt the current thread here.
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `onRetStatus()` is identical to its super method
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java

        @Override
        boolean onRetStatus(TDSReader tdsReader) throws SQLServerException {
            (new StreamRetStatus()).setFromTDS(tdsReader);
            return true;
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
1 \<\< attemptNumber: integer shift implicitly cast to long
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                intervalExpire = System.currentTimeMillis() + (timeoutUnitInterval * ((attemptNumber / 2) + 1));
            } else if (useTnir) {
                long timeSlice = timeoutUnitInterval * (1 << attemptNumber);

                // In case the timeout for the first slice is less than 500 ms then bump it up to 500 ms
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerMSAL4JUtils.java`
#### Snippet
```java
            }

            if (null != future) {
                authenticationResult = future.get();
            } else {
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
                    continue;
                }
                if (beforeColon) {
                    String repStr = replaceParameterWithString(str, '?', "null");
                    retSql.append(repStr);
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
        SQLServerParameterMetaData pmd = this.connection.getCachedParameterMetadata(sqlTextCacheKey);

        if (!forceRefresh && null != pmd) {
            return pmd;
        } else {
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
            GSSName remotePeerName = manager.createName(spn, null);

            if (null != peerCredentials) {
                peerContext = manager.createContext(remotePeerName, kerberos, peerCredentials,
                        GSSContext.DEFAULT_LIFETIME);
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     */
    boolean isAzure() {
        if (null == isAzure) {
            try (Statement stmt = this.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT CAST(SERVERPROPERTY('EngineEdition') as INT)")) {
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSecurityUtility.java`
#### Snippet
```java
        Optional<AccessToken> accessTokenOptional = dac.getToken(tokenRequestContext).blockOptional();

        if (!accessTokenOptional.isPresent()) {
            throw new SQLServerException(SQLServerException.getErrString("R_ManagedIdentityTokenAcquisitionFail"),
                    null);
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSecurityUtility.java`
#### Snippet
```java
        Optional<AccessToken> accessTokenOptional = mic.getToken(tokenRequestContext).blockOptional();

        if (!accessTokenOptional.isPresent()) {
            throw new SQLServerException(SQLServerException.getErrString("R_ManagedIdentityTokenAcquisitionFail"),
                    null);
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `policies` are queried, but never updated
in `src/main/java/com/microsoft/sqlserver/jdbc/KeyVaultHttpPipelineBuilder.java`
#### Snippet
```java
final class KeyVaultHttpPipelineBuilder {

    private final List<HttpPipelinePolicy> policies;
    private KeyVaultTokenCredential credential;
    private HttpLogOptions httpLogOptions;
```

## RuleId[id=IdempotentLoopBody]
### IdempotentLoopBody
Idempotent loop body
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                sqlWarnings = originalSqlWarnings;
                if (null != openStatements) {
                    while (!openStatements.isEmpty()) {
                        try (Statement st = openStatements.get(0)) {}
                    }
```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`value >> 0` can be replaced with 'value'
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    static void writeShortBigEndian(short value, byte[] valueBytes, int offset) {
        valueBytes[offset + 0] = (byte) ((value >> 8) & 0xFF);
        valueBytes[offset + 1] = (byte) ((value >> 0) & 0xFF);
    }

```

### PointlessBitwiseExpression
`value >> 0` can be replaced with 'value'
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
        valueBytes[offset + 5] = (byte) ((value >> 16) & 0xFF);
        valueBytes[offset + 6] = (byte) ((value >> 8) & 0xFF);
        valueBytes[offset + 7] = (byte) ((value >> 0) & 0xFF);
    }

```

### PointlessBitwiseExpression
`value >> 0` can be replaced with 'value'
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java

    static void writeShort(short value, byte[] valueBytes, int offset) {
        valueBytes[offset + 0] = (byte) ((value >> 0) & 0xFF);
        valueBytes[offset + 1] = (byte) ((value >> 8) & 0xFF);
    }
```

### PointlessBitwiseExpression
`value >> 0` can be replaced with 'value'
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
        valueBytes[offset + 1] = (byte) ((value >> 16) & 0xFF);
        valueBytes[offset + 2] = (byte) ((value >> 8) & 0xFF);
        valueBytes[offset + 3] = (byte) ((value >> 0) & 0xFF);
    }

```

### PointlessBitwiseExpression
`value >> 0` can be replaced with 'value'
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java

    static void writeInt(int value, byte[] valueBytes, int offset) {
        valueBytes[offset + 0] = (byte) ((value >> 0) & 0xFF);
        valueBytes[offset + 1] = (byte) ((value >> 8) & 0xFF);
        valueBytes[offset + 2] = (byte) ((value >> 16) & 0xFF);
```

### PointlessBitwiseExpression
`(data[nOffset + 3] & 0xFF) << 0` can be replaced with '(data\[nOffset + 3\] \& 0xFF)'
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java

    static int readIntBigEndian(byte[] data, int nOffset) {
        return ((data[nOffset + 3] & 0xFF) << 0) | ((data[nOffset + 2] & 0xFF) << 8)
                | ((data[nOffset + 1] & 0xFF) << 16) | ((data[nOffset + 0] & 0xFF) << 24);
    }
```

### PointlessBitwiseExpression
`bitLength & 0xffffffff` can be replaced with 'bitLength'
in `src/main/java/mssql/security/provider/MD4.java`
#### Snippet
```java
        }

        X[14] = (int) (bitLength & 0xffffffff);
        X[15] = (int) (bitLength >>> 32);
    }
```

### PointlessBitwiseExpression
`(b[i + 0] & 255) << 0` can be replaced with '(b\[i + 0\] \& 255)'
in `src/main/java/mssql/googlecode/cityhash/CityHash.java`
#### Snippet
```java
    private static int toIntLE(byte[] b,
            int i) {
        return (((b[i + 3] & 255) << 24) + ((b[i + 2] & 255) << 16) + ((b[i + 1] & 255) << 8) + ((b[i + 0] & 255) << 0));
    }

```

### PointlessBitwiseExpression
`(b[i + 0] & 255) << 0` can be replaced with '(b\[i + 0\] \& 255)'
in `src/main/java/mssql/googlecode/cityhash/CityHash.java`
#### Snippet
```java
            int i) {
        return (((long) b[i + 7] << 56) + ((long) (b[i + 6] & 255) << 48) + ((long) (b[i + 5] & 255) << 40) + ((long) (b[i + 4] & 255) << 32)
                + ((long) (b[i + 3] & 255) << 24) + ((b[i + 2] & 255) << 16) + ((b[i + 1] & 255) << 8) + ((b[i + 0] & 255) << 0));
    }

```

### PointlessBitwiseExpression
`tdsMessageLength >> 0` can be replaced with 'tdsMessageLength'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                                                                                                      // length is 16
                                                                                                      // bits,
        stagingBuffer.put(TDS.PACKET_HEADER_MESSAGE_LENGTH + 1, (byte) ((tdsMessageLength >> 0) & 0xFF)); // written BIG
        // ENDIAN
        stagingBuffer.put(TDS.PACKET_HEADER_SPID, (byte) ((tdsChannel.getSPID() >> 8) & 0xFF)); // Note: SPID is 16
```

### PointlessBitwiseExpression
`tdsChannel.getSPID() >> 0` can be replaced with 'tdsChannel.getSPID()'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        stagingBuffer.put(TDS.PACKET_HEADER_SPID, (byte) ((tdsChannel.getSPID() >> 8) & 0xFF)); // Note: SPID is 16
                                                                                                // bits,
        stagingBuffer.put(TDS.PACKET_HEADER_SPID + 1, (byte) ((tdsChannel.getSPID() >> 0) & 0xFF)); // written BIG
        // ENDIAN
        stagingBuffer.put(TDS.PACKET_HEADER_SEQUENCE_NUM, (byte) (packetNum % 256));
```

### PointlessBitwiseExpression
`tdsMessageLength >> 0` can be replaced with 'tdsMessageLength'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                                                                                                      // length is 16
                                                                                                      // bits,
            logBuffer.put(TDS.PACKET_HEADER_MESSAGE_LENGTH + 1, (byte) ((tdsMessageLength >> 0) & 0xFF)); // written BIG
            // ENDIAN
            logBuffer.put(TDS.PACKET_HEADER_SPID, (byte) ((tdsChannel.getSPID() >> 8) & 0xFF)); // Note: SPID is 16
```

### PointlessBitwiseExpression
`tdsChannel.getSPID() >> 0` can be replaced with 'tdsChannel.getSPID()'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            logBuffer.put(TDS.PACKET_HEADER_SPID, (byte) ((tdsChannel.getSPID() >> 8) & 0xFF)); // Note: SPID is 16
                                                                                                // bits,
            logBuffer.put(TDS.PACKET_HEADER_SPID + 1, (byte) ((tdsChannel.getSPID() >> 0) & 0xFF)); // written BIG
            // ENDIAN
            logBuffer.put(TDS.PACKET_HEADER_SEQUENCE_NUM, (byte) (packetNum % 256));
```

### PointlessBitwiseExpression
`0 | TDS.AE_METADATA` can be replaced with 'TDS.AE_METADATA'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

        if (null != cryptoMeta)
            writeByte((byte) (bOut ? 1 | TDS.AE_METADATA : 0 | TDS.AE_METADATA)); // status
        else
            writeByte((byte) (bOut ? 1 : 0)); // status
```

### PointlessBitwiseExpression
`ch >> 0` can be replaced with 'ch'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                while (bytesCopied < bytesToCopy) {
                    char ch = value.charAt(charsCopied++);
                    valueBytes[bytesCopied++] = (byte) ((ch >> 0) & 0xFF);
                    valueBytes[bytesCopied++] = (byte) ((ch >> 8) & 0xFF);
                }
```

### PointlessBitwiseExpression
`daysIntoCE >> 0` can be replaced with 'daysIntoCE'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

            byte[] encodedBytes = new byte[3];
            encodedBytes[0] = (byte) ((daysIntoCE >> 0) & 0xFF);
            encodedBytes[1] = (byte) ((daysIntoCE >> 8) & 0xFF);
            encodedBytes[2] = (byte) ((daysIntoCE >> 16) & 0xFF);
```

### PointlessBitwiseExpression
`daysIntoCE >> 0` can be replaced with 'daysIntoCE'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

            byte[] encodedBytes = new byte[3];
            encodedBytes[0] = (byte) ((daysIntoCE >> 0) & 0xFF);
            encodedBytes[1] = (byte) ((daysIntoCE >> 8) & 0xFF);
            encodedBytes[2] = (byte) ((daysIntoCE >> 16) & 0xFF);
```

### PointlessBitwiseExpression
`streamCharBuffer[charsCopied] >> 0` can be replaced with 'streamCharBuffer\[charsCopied\]'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            // saves a conversion to String and use of Charset in that conversion.
            for (int charsCopied = 0; charsCopied < charsToWrite; ++charsCopied) {
                streamByteBuffer[2 * charsCopied] = (byte) ((streamCharBuffer[charsCopied] >> 0) & 0xFF);
                streamByteBuffer[2 * charsCopied + 1] = (byte) ((streamCharBuffer[charsCopied] >> 8) & 0xFF);
            }
```

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'equals()' call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
                // TYPE_SS_SERVER_CURSOR_FORWARD_ONLY accordingly.
                String selectMethod = con.getSelectMethod();
                resultSetType = (null == selectMethod
                        || !"cursor".equals(selectMethod)) ? SQLServerResultSet.TYPE_SS_DIRECT_FORWARD_ONLY : // Default
                                                                                                              // forward-only,
```

### PointlessNullCheck
Unnecessary 'null' check before 'equalsIgnoreCase()' call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
    private boolean buildPreparedStrings(Parameter[] params, boolean renewDefinition) throws SQLServerException {
        String newTypeDefinitions = buildParamTypeDefinitions(params, renewDefinition);
        if (null != preparedTypeDefinitions && newTypeDefinitions.equalsIgnoreCase(preparedTypeDefinitions))
            return false;

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
The value `null` assigned to `timeout` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/IdleConnectionResiliency.java`
#### Snippet
```java
        if (timeout != null) {
            timeout.cancel(false);
            timeout = null;
        }

```

### UnusedAssignment
The value `null` assigned to `timer` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/IdleConnectionResiliency.java`
#### Snippet
```java
        if (timer != null) {
            timer.removeRef();
            timer = null;
        }
    }
```

### UnusedAssignment
Variable `plainCEK` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/KeyStoreProviderCommon.java`
#### Snippet
```java
    private static byte[] decryptRSAOAEP(byte[] cipherText,
            CertificateDetails certificateDetails) throws SQLServerException {
        byte[] plainCEK = null;
        try {
            Cipher rsa = Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding");
```

### UnusedAssignment
Variable `verificationSuccess` initializer `false` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/KeyStoreProviderCommon.java`
#### Snippet
```java
            String masterKeyPath) throws SQLServerException {
        Signature signVerify;
        boolean verificationSuccess = false;
        try {
            signVerify = Signature.getInstance("SHA256withRSA");
```

### UnusedAssignment
Variable `o` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSQLXML.java`
#### Snippet
```java
                    true);
        assert null == contents;
        ByteArrayInputStream o = null;
        if (null != outputStreamValue) {
            o = outputStreamValue.getInputStream();
```

### UnusedAssignment
Variable `plainText` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256Algorithm.java`
#### Snippet
```java
        assert (cipherText != null);
        assert (iv != null);
        byte[] plainText = null;
        // key to be used for decryption
        SecretKeySpec skeySpec = new SecretKeySpec(columnEncryptionkey.getEncryptionKey(), "AES");
```

### UnusedAssignment
Variable `authenticationResult` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerMSAL4JUtils.java`
#### Snippet
```java

            CompletableFuture<IAuthenticationResult> future = null;
            IAuthenticationResult authenticationResult = null;

            // try to acquire token silently if user account found in cache
```

### UnusedAssignment
Variable `parameterType` initializer `0` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerParameterMetaData.java`
#### Snippet
```java
        checkClosed();
        checkParam(param);
        int parameterType = 0;
        if (null == procMetadata) {
            parameterType = queryMetaMap.get(param).parameterType;
```

### UnusedAssignment
Variable `expiresIn` initializer `0` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/AuthenticationJNI.java`
#### Snippet
```java
class FedAuthDllInfo {
    byte[] accessTokenBytes = null;
    long expiresIn = 0;

    FedAuthDllInfo(byte[] accessTokenBytes, long expiresIn) {
```

### UnusedAssignment
Variable `accessTokenBytes` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/AuthenticationJNI.java`
#### Snippet
```java

class FedAuthDllInfo {
    byte[] accessTokenBytes = null;
    long expiresIn = 0;

```

### UnusedAssignment
Variable `cryptoCopy` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/ParameterMetaDataCache.java`
#### Snippet
```java
        for (int i = 0; i < params.length; i++) {
            try {
                CryptoMetadata cryptoCopy = null;
                CryptoMetadata metaData = params[i].getCryptoMetadata();
                if (metaData != null) {
```

### UnusedAssignment
Variable `cipherAlgorithm` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSecurityUtility.java`
#### Snippet
```java
        // Given the symmetric key instantiate a SqlClientEncryptionAlgorithm object and cache it in metadata.
        md.cipherAlgorithm = null;
        SQLServerEncryptionAlgorithm cipherAlgorithm = null;
        String algorithmName = validateAndGetEncryptionAlgorithmName(md.cipherAlgorithmId, md.cipherAlgorithmName); // may
                                                                                                                    // throw
```

### UnusedAssignment
Variable `provider` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSecurityUtility.java`
#### Snippet
```java

        SQLServerException lastException = null;
        SQLServerColumnEncryptionKeyStoreProvider provider = null;
        byte[] plaintextKey = null;

```

### UnusedAssignment
Variable `dac` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSecurityUtility.java`
#### Snippet
```java

        DefaultAzureCredentialBuilder dacBuilder = new DefaultAzureCredentialBuilder();
        DefaultAzureCredential dac = null;

        if (null != managedIdentityClientId && !managedIdentityClientId.isEmpty()) {
```

### UnusedAssignment
Variable `sqlFedAuthToken` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSecurityUtility.java`
#### Snippet
```java
        tokenRequestContext.setScopes(Arrays.asList(scope));

        SqlAuthenticationToken sqlFedAuthToken = null;

        Optional<AccessToken> accessTokenOptional = dac.getToken(tokenRequestContext).blockOptional();
```

### UnusedAssignment
Variable `provider` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSecurityUtility.java`
#### Snippet
```java
        }

        SQLServerColumnEncryptionKeyStoreProvider provider = null;
        if (shouldUseInstanceLevelProviderFlow(keyStoreName, connection, statement)) {
            provider = getColumnEncryptionKeyStoreProvider(keyStoreName, connection, statement);
```

### UnusedAssignment
Variable `mic` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSecurityUtility.java`
#### Snippet
```java
    static SqlAuthenticationToken getManagedIdentityCredAuthToken(String resource,
            String managedIdentityClientId) throws SQLServerException {
        ManagedIdentityCredential mic = null;

        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
```

### UnusedAssignment
Variable `sqlFedAuthToken` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSecurityUtility.java`
#### Snippet
```java
        tokenRequestContext.setScopes(Arrays.asList(scope));

        SqlAuthenticationToken sqlFedAuthToken = null;

        Optional<AccessToken> accessTokenOptional = mic.getToken(tokenRequestContext).blockOptional();
```

### UnusedAssignment
Variable `pid` initializer `0` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerJdbc43.java`
#### Snippet
```java

    /** Client process ID sent during login */
    private static int pid = 0;

    static {
```

### UnusedAssignment
Variable `cekEntry` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/ISQLServerEnclaveProvider.java`
#### Snippet
```java
            PreparedStatement stmt, ResultSet rs, ArrayList<byte[]> enclaveRequestedCEKs) throws SQLException {
        Map<Integer, CekTableEntry> cekList = new HashMap<>();
        CekTableEntry cekEntry = null;
        boolean isRequestedByEnclave = false;
        SQLServerStatement statement = (SQLServerStatement) ((SQLServerPreparedStatement) stmt);
```

### UnusedAssignment
Variable `keyStorePwd` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionJavaKeyStoreProvider.java`
#### Snippet
```java
    String name = "MSSQL_JAVA_KEYSTORE";
    String keyStorePath = null;
    char[] keyStorePwd = null;

    static final private java.util.logging.Logger javaKeyStoreLogger = java.util.logging.Logger
```

### UnusedAssignment
Variable `keyStore` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionJavaKeyStoreProvider.java`
#### Snippet
```java
    private CertificateDetails getCertificateDetails(String masterKeyPath) throws SQLServerException {
        FileInputStream fis = null;
        KeyStore keyStore = null;
        CertificateDetails certificateDetails = null;

```

### UnusedAssignment
Variable `certificateDetails` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionJavaKeyStoreProvider.java`
#### Snippet
```java
        FileInputStream fis = null;
        KeyStore keyStore = null;
        CertificateDetails certificateDetails = null;

        try {
```

### UnusedAssignment
Variable `keyStorePath` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionJavaKeyStoreProvider.java`
#### Snippet
```java
public class SQLServerColumnEncryptionJavaKeyStoreProvider extends SQLServerColumnEncryptionKeyStoreProvider {
    String name = "MSSQL_JAVA_KEYSTORE";
    String keyStorePath = null;
    char[] keyStorePwd = null;

```

### UnusedAssignment
Variable `cipherText` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionJavaKeyStoreProvider.java`
#### Snippet
```java
     */
    private byte[] encryptRSAOAEP(byte[] plainText, CertificateDetails certificateDetails) throws SQLServerException {
        byte[] cipherText = null;
        try {
            Cipher rsa = Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding");
```

### UnusedAssignment
Variable `signedHash` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionJavaKeyStoreProvider.java`
#### Snippet
```java
            CertificateDetails certificateDetails) throws SQLServerException {
        Signature signature;
        byte[] signedHash = null;

        try {
```

### UnusedAssignment
Variable `parentBlob` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBlob.java`
#### Snippet
```java
 */
final class SQLServerBlobOutputStream extends java.io.OutputStream {
    private SQLServerBlob parentBlob = null;
    private long currentPos;

```

### UnusedAssignment
Variable `sensitivityClassification` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/StreamColumns.java`
#### Snippet
```java
        assert dataClassificationToken == TDS.TDS_SQLDATACLASSIFICATION;

        SensitivityClassification sensitivityClassification = null;

        // get the label count
```

### UnusedAssignment
Variable `sensitivityRankProperty` initializer `SensitivityRank.NOT_DEFINED.getValue()` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/StreamColumns.java`
#### Snippet
```java
                }

                int sensitivityRankProperty = SensitivityRank.NOT_DEFINED.getValue();
                if (sensitivityRankSupported) {
                    sensitivityRankProperty = tdsReader.readInt();
```

### UnusedAssignment
Variable `value` initializer `""` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/StreamColumns.java`
#### Snippet
```java

    private String readByteString(TDSReader tdsReader) throws SQLServerException {
        String value = "";
        int byteLen = (int) tdsReader.readUnsignedByte();
        value = tdsReader.readUnicodeString(byteLen);
```

### UnusedAssignment
Variable `md` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionAzureKeyVaultProvider.java`
#### Snippet
```java
        System.arraycopy(cipherText, 0, dataToHash, destinationPosition, cipherText.length);

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance(SHA_256);
```

### UnusedAssignment
Variable `parsedUri` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionAzureKeyVaultProvider.java`
#### Snippet
```java
            throw new SQLServerException(null, form.format(msgArgs), null, 0, false);
        } else {
            URI parsedUri = null;
            try {
                parsedUri = new URI(masterKeyPath);
```

### UnusedAssignment
Variable `md` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionAzureKeyVaultProvider.java`
#### Snippet
```java
                encryptedColumnEncryptionKey.length - signature.length);

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance(SHA_256);
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
        if (dsLogger.isLoggable(Level.FINER))
            dsLogger.finer(toString() + " Begin create new connection.");
        SQLServerConnection result = null;
        result = DriverJDBCVersion.getSQLServerConnection(toString());
        result.connect(mergedProps, pooledConnection);
```

### UnusedAssignment
Variable `encryptionKey` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSymmetricKeyCache.java`
#### Snippet
```java
     */
    SQLServerSymmetricKey getKey(EncryptionKeyInfo keyInfo, SQLServerConnection connection) throws SQLServerException {
        SQLServerSymmetricKey encryptionKey = null;
        lock.lock();
        try {
```

### UnusedAssignment
Variable `encryptionAlgorithm` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerEncryptionAlgorithmFactoryList.java`
#### Snippet
```java
    SQLServerEncryptionAlgorithm getAlgorithm(SQLServerSymmetricKey key, SQLServerEncryptionType encryptionType,
            String algorithmName) throws SQLServerException {
        SQLServerEncryptionAlgorithm encryptionAlgorithm = null;
        SQLServerEncryptionAlgorithmFactory factory = null;
        if (!encryptionAlgoFactoryMap.containsKey(algorithmName)) {
```

### UnusedAssignment
Variable `factory` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerEncryptionAlgorithmFactoryList.java`
#### Snippet
```java
            String algorithmName) throws SQLServerException {
        SQLServerEncryptionAlgorithm encryptionAlgorithm = null;
        SQLServerEncryptionAlgorithmFactory factory = null;
        if (!encryptionAlgoFactoryMap.containsKey(algorithmName)) {
            MessageFormat form = new MessageFormat(
```

### UnusedAssignment
Variable `t` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerParser.java`
#### Snippet
```java
     */
    static void parseQuery(SQLServerTokenIterator iter, SQLServerFMTQuery query) throws SQLServerException {
        Token t = null;
        while (iter.hasNext()) {
            t = iter.next();
```

### UnusedAssignment
The value `iter.previous()` assigned to `t` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerParser.java`
#### Snippet
```java
                    // Check for optional keyword INTO and move the iterator back if it isn't there
                    if (t.getType() != SQLServerLexer.INTO) {
                        t = iter.previous();
                    }
                    query.getTableTarget().add(getTableTargetChunk(iter, query.getAliases(), INSERT_DELIMITING_WORDS));
```

### UnusedAssignment
The value `iter.previous()` assigned to `t` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerParser.java`
#### Snippet
```java
                    // Check for optional keyword FROM and move the iterator back if it isn't there
                    if (t.getType() != SQLServerLexer.FROM) {
                        t = iter.previous();
                    }
                    query.getTableTarget().add(getTableTargetChunk(iter, query.getAliases(), DELETE_DELIMITING_WORDS));
```

### UnusedAssignment
The value `iter.previous()` assigned to `t` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerParser.java`
#### Snippet
```java
                case SQLServerLexer.UPDATE:
                    skipTop(iter);
                    t = iter.previous();
                    // Get next chunk
                    query.getTableTarget().add(getTableTargetChunk(iter, query.getAliases(), UPDATE_DELIMITING_WORDS));
```

### UnusedAssignment
Variable `localCurrentSegmentIndex` initializer `0` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java
            int segmentIndexIncrement = 0;
            int shapeIndexIncrement = 0;
            int localCurrentSegmentIndex = 0;
            int localCurrentShapeIndex = 0;

```

### UnusedAssignment
Variable `localCurrentShapeIndex` initializer `0` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java
            int shapeIndexIncrement = 0;
            int localCurrentSegmentIndex = 0;
            int localCurrentShapeIndex = 0;

            // check if the figureoffset of current shape is -1, which means it should be empty.
```

### UnusedAssignment
Variable `pointEndIndex` initializer `0` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java
                    appendToWKTBuffers("COMPOUNDCURVE(");

                    int pointEndIndex = 0;

                    if (i == figures.length - 1) {
```

### UnusedAssignment
Variable `typeCode` initializer `0` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java
        if (EMPTY_STR.equals(potentialEmptyKeyword)) {

            byte typeCode = 0;

            if (isInsideAnotherShape) {
```

### UnusedAssignment
Variable `fa` initializer `0` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java
                throwIllegalWKTPosition();
            }
            byte fa = 0;

            if (version == 1 && (CIRCULARSTRING_STR.equals(nextToken) || COMPOUNDCURVE_STR.equals(nextToken)
```

### UnusedAssignment
Variable `stmtColumnEncriptionSetting` initializer `SQLServerStatementColumnEncryptionSetting.USE_CONNECTION_SETTING` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     * behavior which overrides connection level setting.
     */
    protected SQLServerStatementColumnEncryptionSetting stmtColumnEncriptionSetting = SQLServerStatementColumnEncryptionSetting.USE_CONNECTION_SETTING;

    /**
```

### UnusedAssignment
Variable `index` initializer `0` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     */
    static String replaceParameterWithString(String str, char marker, String replaceStr) {
        int index = 0;
        while ((index = str.indexOf("" + marker)) >= 0) {
            str = str.substring(0, index) + replaceStr + str.substring(index + 1, str.length());
```

### UnusedAssignment
Variable `charsRead` initializer `0` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/ReaderInputStream.java`
#### Snippet
```java
            while (rawChars.hasRemaining()) {
                int lastPosition = ((Buffer) rawChars).position();
                int charsRead = 0;

                // Try reading from the app-supplied Reader
```

### UnusedAssignment
Variable `readerValue` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
            // If the stream is to be sent as Unicode, then assume it's an ASCII stream
            if (JDBCType.NCHAR == jdbcType || JDBCType.NVARCHAR == jdbcType || JDBCType.LONGNVARCHAR == jdbcType) {
                Reader readerValue = null;
                readerValue = new InputStreamReader(inputStreamValue, StandardCharsets.US_ASCII);

```

### UnusedAssignment
Variable `convertedValue` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
            SSType baseSSType, TypeInfo typeInfo, JDBCType jdbcType, InputStreamGetterArgs streamGetterArgs,
            Calendar cal) throws SQLServerException {
        Object convertedValue = null;
        int lengthConsumed = 2 + cbPropsActual; // We have already read 2bytes for baseType earlier.
        int expectedValueLength = valueLength - lengthConsumed;
```

### UnusedAssignment
Variable `collation` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
        int lengthConsumed = 2 + cbPropsActual; // We have already read 2bytes for baseType earlier.
        int expectedValueLength = valueLength - lengthConsumed;
        SQLCollation collation = null;
        int precision;
        int scale;
```

### UnusedAssignment
The value `2 + cbPropsActual` assigned to `lengthConsumed` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
                internalVariant.setBaseJDBCType(jdbcType);
                typeInfo.setDisplaySize("NNNNNNNN-NNNN-NNNN-NNNN-NNNNNNNNNNNN".length());
                lengthConsumed = 2 + cbPropsActual;
                convertedValue = tdsReader.readGUID(expectedValueLength, jdbcType, streamGetterArgs.streamType);
                break;
```

### UnusedAssignment
Variable `token` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/NTLMAuthentication.java`
#### Snippet
```java
        int workstationLen = getByteArrayLength(context.workstation.getBytes());

        ByteBuffer token = null;
        token = ByteBuffer.allocate(NTLM_NEGOTIATE_PAYLOAD_OFFSET + domainNameLen + workstationLen)
                .order(ByteOrder.LITTLE_ENDIAN);
```

### UnusedAssignment
Variable `mac` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/NTLMAuthentication.java`
#### Snippet
```java

        // message authentication code
        private Mac mac = null;

        // negotiate flags from Challenge msg
```

### UnusedAssignment
Variable `msg` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/NTLMAuthentication.java`
#### Snippet
```java
        byte[] workstationBytes = unicode(context.workstation);
        int workstationLen = getByteArrayLength(workstationBytes);
        byte[] msg = null;

        try {
```

### UnusedAssignment
Variable `nStatus` initializer `0` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
        String sContext = "DTC_XA_";
        int n = 1;
        int nStatus = 0;
        XAReturnValue returnStatus = new XAReturnValue();

```

### UnusedAssignment
Variable `initCS` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                        xaInitLock.lock();
                        try {
                            SQLServerCallableStatement initCS = null;

                            initCS = (SQLServerCallableStatement) controlConnection
```

### UnusedAssignment
The value changed at `n++` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                    cs.setInt(n++, architectureOS); // Architecture of OS running SQL Server
                    cs.setInt(n++, isTransacrionTimeoutSet); // pass 1 if setTransactionTimeout() is called
                    cs.registerOutParameter(n++, Types.BINARY); // Return UoW

                    break;
```

### UnusedAssignment
The value changed at `n++` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                    cs.setInt(n++, xaFlags);
                    cs.setInt(n++, formatId);
                    cs.registerOutParameter(n++, Types.BINARY); // Return UoW
                    break;

```

### UnusedAssignment
The value changed at `n++` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                    if ((SSTRANSTIGHTLYCPLD & xaFlags) == SSTRANSTIGHTLYCPLD)
                        cs.setInt(n++, xaFlags); // XA transaction flags
                    cs.setInt(n++, formatId); // Format ID n=5 for loosely coupled, n=6 for tightly coupled
                    break;

```

### UnusedAssignment
The value changed at `n++` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                    cs.setBytes(n++, bid);
                    cs.setInt(n++, xaFlags);
                    cs.setInt(n++, formatId);
                    break;

```

### UnusedAssignment
The value changed at `n++` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                    if ((SSTRANSTIGHTLYCPLD & xaFlags) == SSTRANSTIGHTLYCPLD)
                        cs.setInt(n++, xaFlags); // XA transaction flags
                    cs.setInt(n++, formatId); // Format ID n=5 for loosely coupled, n=6 for tightly coupled
                    break;

```

### UnusedAssignment
The value changed at `n++` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                    if ((SSTRANSTIGHTLYCPLD & xaFlags) == SSTRANSTIGHTLYCPLD)
                        cs.setInt(n++, xaFlags); // XA transaction flags
                    cs.setInt(n++, formatId); // Format ID n=5 for loosely coupled, n=6 for tightly coupled
                    break;

```

### UnusedAssignment
The value changed at `n++` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                    cs.registerOutParameter(n++, Types.CHAR);
                    cs.setInt(n++, xaFlags);
                    cs.registerOutParameter(n++, Types.BINARY);
                    // Format Id need not be sent for recover action
                    break;
```

### UnusedAssignment
Variable `c` initializer `0` is redundant
in `src/main/java/mssql/googlecode/cityhash/CityHash.java`
#### Snippet
```java
        long a = seed0;
        long b = seed1;
        long c = 0;
        long d = 0;

```

### UnusedAssignment
Variable `d` initializer `0` is redundant
in `src/main/java/mssql/googlecode/cityhash/CityHash.java`
#### Snippet
```java
        long b = seed1;
        long c = 0;
        long d = 0;

        int l = len - 16;
```

### UnusedAssignment
Variable `method` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java

    static ColumnEncryptionSetting valueOfString(String value) throws SQLServerException {
        ColumnEncryptionSetting method = null;

        if (value.toLowerCase(Locale.US).equalsIgnoreCase(ColumnEncryptionSetting.ENABLED.toString())) {
```

### UnusedAssignment
Variable `method` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java

    static SqlAuthentication valueOfString(String value) throws SQLServerException {
        SqlAuthentication method = null;

        if (value.toLowerCase(Locale.US).equalsIgnoreCase(SqlAuthentication.NOT_SPECIFIED.toString())) {
```

### UnusedAssignment
Variable `result` initializer `false` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
        }

        boolean result = false;
        try {
            result = (Util.parseUrl(url, drLogger) != null);
```

### UnusedAssignment
Variable `method` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java

    static KeyStoreAuthentication valueOfString(String value) throws SQLServerException {
        KeyStoreAuthentication method = null;

        if (value.toLowerCase(Locale.US).equalsIgnoreCase(KeyStoreAuthentication.JAVA_KEYSTORE_PASSWORD.toString())) {
```

### UnusedAssignment
Variable `option` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java

    static EncryptOption valueOfString(String value) throws SQLServerException {
        EncryptOption option = null;

        String val = value.toLowerCase(Locale.US);
```

### UnusedAssignment
Variable `iptype` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java

    static IPAddressPreference valueOfString(String value) throws SQLServerException {
        IPAddressPreference iptype = null;

        if (value.toLowerCase(Locale.US).equalsIgnoreCase(IPAddressPreference.IPV4_FIRST.toString())) {
```

### UnusedAssignment
Variable `protocol` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java

    static SSLProtocol valueOfString(String value) throws SQLServerException {
        SSLProtocol protocol = null;

        if (value.toLowerCase(Locale.ENGLISH).equalsIgnoreCase(SSLProtocol.TLS.toString())) {
```

### UnusedAssignment
Variable `dateTimeFormatter` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkRecord.java`
#### Snippet
```java
        int precision;
        int scale;
        DateTimeFormatter dateTimeFormatter = null;

        ColumnMetadata(String name, int type, int precision, int scale, DateTimeFormatter dateTimeFormatter) {
```

### UnusedAssignment
Variable `cekEntry` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java

                Map<Integer, CekTableEntry> cekList = new HashMap<>();
                CekTableEntry cekEntry = null;
                while (rs.next()) {
                    int currentOrdinal = rs.getInt(DescribeParameterEncryptionResultSet1.KEYORDINAL.value());
```

### UnusedAssignment
The value `true` assigned to `inRetry` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
                    // If we are AE_v3, remove the failed entry and try again.
                    ParameterMetaDataCache.removeCacheEntry(connection, preparedSQL);
                    inRetry = true;
                    doExecutePreparedStatement(command);
                } else {
```

### UnusedAssignment
Variable `columnName` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerMetaData.java`
#### Snippet
```java
public class SQLServerMetaData {

    String columnName = null;
    int javaSqlType;
    int precision = 0;
```

### UnusedAssignment
Variable `rows` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataTable.java`
#### Snippet
```java
    Map<Integer, SQLServerDataColumn> columnMetadata = null;
    Set<String> columnNames = null;
    Map<Integer, Object[]> rows = null;
    private String tvpName = null;
    private final Lock lock = new ReentrantLock();
```

### UnusedAssignment
Variable `columnNames` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataTable.java`
#### Snippet
```java
    int columnCount = 0;
    Map<Integer, SQLServerDataColumn> columnMetadata = null;
    Set<String> columnNames = null;
    Map<Integer, Object[]> rows = null;
    private String tvpName = null;
```

### UnusedAssignment
Variable `columnMetadata` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataTable.java`
#### Snippet
```java
    int rowCount = 0;
    int columnCount = 0;
    Map<Integer, SQLServerDataColumn> columnMetadata = null;
    Set<String> columnNames = null;
    Map<Integer, Object[]> rows = null;
```

### UnusedAssignment
Variable `bd` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataTable.java`
#### Snippet
```java
                case DECIMAL:
                case NUMERIC:
                    BigDecimal bd = null;
                    boolean isColumnMetadataUpdated = false;
                    bd = new BigDecimal(val.toString());
```

### UnusedAssignment
Variable `getterStream` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java
        }

        Reader getterStream = null;
        if (null == value && !activeStreams.isEmpty()) {
            InputStream inputStream = (InputStream) activeStreams.get(0);
```

### UnusedAssignment
Variable `parentClob` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java
 */
final class SQLServerClobAsciiOutputStream extends java.io.OutputStream {
    private SQLServerClobBase parentClob = null;
    private long streamPos;

```

### UnusedAssignment
Variable `parentClob` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java
 */
final class SQLServerClobWriter extends java.io.Writer {
    private SQLServerClobBase parentClob = null;
    private long streamPos;

```

### UnusedAssignment
Variable `sig` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerVSMEnclaveProvider.java`
#### Snippet
```java
        }

        Signature sig = null;
        try {
            sig = Signature.getInstance("RSASSA-PSS");
```

### UnusedAssignment
Variable `ssType` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSetMetaData.java`
#### Snippet
```java
    @Override
    public boolean isSearchable(int column) throws SQLServerException {
        SSType ssType = null;
        CryptoMetadata cryptoMetadata = rs.getColumn(column).getCryptoMetadata();

```

### UnusedAssignment
Variable `updatability` initializer `-1` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSetMetaData.java`
#### Snippet
```java
    @Override
    public boolean isWritable(int column) throws SQLServerException {
        int updatability = -1;
        CryptoMetadata cryptoMetadata = rs.getColumn(column).getCryptoMetadata();
        if (null != cryptoMetadata) {
```

### UnusedAssignment
Variable `shouldHonorAEForParameter` initializer `false` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
    }

    private boolean shouldHonorAEForParameter = false;
    private boolean userProvidesPrecision = false;
    private boolean userProvidesScale = false;
```

### UnusedAssignment
Variable `result` initializer `""` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        }
        checkClosed();
        String result = "";
        try (SQLServerStatement s = (SQLServerStatement) connection.createStatement();
                SQLServerResultSet rs = s.executeQueryInternal("select system_user")) {
```

### UnusedAssignment
Variable `userRs` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        } else {
            // Azure DW does not support foreign keys, return an empty result set with correct metadata.
            ResultSet userRs = null;
            PreparedStatement pstmt = null;
            StringBuilder azureDwSelectBuilder = new StringBuilder();
```

### UnusedAssignment
Variable `orgCat` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        checkClosed();
        assert null != arguments;
        String orgCat = null;
        orgCat = switchCatalogs(catalog);
        SQLServerResultSet rs = null;
```

### UnusedAssignment
Variable `sCurr` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        if (null == catalog)
            return null;
        String sCurr = null;
        sCurr = connection.getCatalog().trim();
        String sNew = catalog.trim();
```

### UnusedAssignment
Variable `rs` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
                    + "SS_XML_SCHEMACOLLECTION_CATALOG_NAME, SS_XML_SCHEMACOLLECTION_SCHEMA_NAME, SS_XML_SCHEMACOLLECTION_NAME "
                    + "FROM @mssqljdbc_temp_sp_columns_result ORDER BY TABLE_CAT, TABLE_SCHEM, TABLE_NAME, ORDINAL_POSITION;";
            SQLServerResultSet rs = null;
            PreparedStatement pstmt = (SQLServerPreparedStatement) this.connection.prepareStatement(spColumnsSql);
            pstmt.closeOnCompletion();
```

### UnusedAssignment
Variable `userRs` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
                storedProcPstmt.setInt(6, 3);// odbc version

                SQLServerResultSet userRs = null;
                PreparedStatement resultPstmt = null;
                try (ResultSet rs = storedProcPstmt.executeQuery()) {
```

### UnusedAssignment
Variable `orgCat` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
    private SQLServerResultSet getResultSetFromInternalQueries(String catalog, String query) throws SQLException {
        checkClosed();
        String orgCat = null;
        orgCat = switchCatalogs(catalog);
        SQLServerResultSet rs = null;
```

### UnusedAssignment
Variable `rs` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        String orgCat = null;
        orgCat = switchCatalogs(catalog);
        SQLServerResultSet rs = null;
        try {
            SQLServerStatement statement = (SQLServerStatement) connection.createStatement();
```

### UnusedAssignment
Variable `metaDataQuery` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
        SQLServerResultSet rs = null;
        SQLServerStatement stmt = null;
        String metaDataQuery = null;

        try {
```

### UnusedAssignment
Variable `longValue` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
    private byte[] normalizedValue(JDBCType destJdbcType, Object value, JDBCType srcJdbcType, int destPrecision,
            int destScale, String destName) throws SQLServerException {
        Long longValue = null;
        byte[] byteValue = null;
        int srcDataPrecision, srcDataScale;
```

### UnusedAssignment
Variable `byteValue` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
            int destScale, String destName) throws SQLServerException {
        Long longValue = null;
        byte[] byteValue = null;
        int srcDataPrecision, srcDataScale;

```

### UnusedAssignment
Variable `bytes` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                            } else {
                                if ((SSType.BINARY == destSSType) || (SSType.VARBINARY == destSSType)) {
                                    byte[] bytes = null;
                                    try {
                                        bytes = ParameterUtils.hexToBin(colValueStr);
```

### UnusedAssignment
Variable `moreDataAvailable` initializer `false` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java

        TDSWriter tdsWriter = null;
        boolean moreDataAvailable = false;

        try {
```

### UnusedAssignment
The value `destColumnMetadata.get(destColIndx).jdbcType` assigned to `bulkJdbcType` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
            if ((sourceResultSet instanceof SQLServerResultSet) && (connection.isColumnEncryptionSettingEnabled())
                    && (null != destCryptoMeta)) {
                bulkJdbcType = destColumnMetadata.get(destColIndx).jdbcType;
                bulkPrecision = destPrecision;
                bulkScale = destColumnMetadata.get(destColIndx).scale;
```

### UnusedAssignment
The value `destPrecision` assigned to `bulkPrecision` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                    && (null != destCryptoMeta)) {
                bulkJdbcType = destColumnMetadata.get(destColIndx).jdbcType;
                bulkPrecision = destPrecision;
                bulkScale = destColumnMetadata.get(destColIndx).scale;
            }
```

### UnusedAssignment
The value `destColumnMetadata.get(destColIndx).scale` assigned to `bulkScale` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                bulkJdbcType = destColumnMetadata.get(destColIndx).jdbcType;
                bulkPrecision = destPrecision;
                bulkScale = destColumnMetadata.get(destColIndx).scale;
            }

```

### UnusedAssignment
Variable `serverSupportsDataClassification` initializer `false` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    private boolean useColumnEncryption = false;
    private boolean serverSupportsColumnEncryption = false;
    private boolean serverSupportsDataClassification = false;
    private byte serverSupportedDataClassificationVersion = TDS.DATA_CLASSIFICATION_NOT_ENABLED;
    private final transient Lock lock = new ReentrantLock();
```

### UnusedAssignment
The value `false` assigned to `useTnir` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

                if ((useTnir) && (inetAddrs.length > IP_ADDRESS_LIMIT)) {
                    useTnir = false;
                    timeoutInMilliSeconds = timeoutInMilliSecondsForFullTimeout;
                }
```

### UnusedAssignment
Variable `serverSupportsColumnEncryption` initializer `false` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    private boolean isStreaming = true;
    private boolean useColumnEncryption = false;
    private boolean serverSupportsColumnEncryption = false;
    private boolean serverSupportsDataClassification = false;
    private byte serverSupportedDataClassificationVersion = TDS.DATA_CLASSIFICATION_NOT_ENABLED;
```

### UnusedAssignment
Variable `serverSupportedDataClassificationVersion` initializer `TDS.DATA_CLASSIFICATION_NOT_ENABLED` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    private boolean serverSupportsColumnEncryption = false;
    private boolean serverSupportsDataClassification = false;
    private byte serverSupportedDataClassificationVersion = TDS.DATA_CLASSIFICATION_NOT_ENABLED;
    private final transient Lock lock = new ReentrantLock();

```

### UnusedAssignment
Variable `connected` initializer `false` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                                                                                             // default

                        boolean connected = false;
                        try {
                            connected = ch.finishConnect();
```

### UnusedAssignment
Variable `minutesOffset` initializer `0` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        long utcMillis;
        int subSecondNanos;
        int minutesOffset = 0;

        try {
```

### UnusedAssignment
Variable `minutesOffset` initializer `0` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        long utcMillis;
        int subSecondNanos;
        int minutesOffset = 0;

        try {
```

### UnusedAssignment
Variable `isFips` initializer `false` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        SSLHandhsakeState handshakeState = SSLHandhsakeState.SSL_HANDHSAKE_NOT_STARTED;

        boolean isFips = false;
        String trustStoreType = null;
        String sslProtocol = null;
```

### UnusedAssignment
Variable `trustStoreType` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

        boolean isFips = false;
        String trustStoreType = null;
        String sslProtocol = null;

```

### UnusedAssignment
Variable `sslProtocol` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        boolean isFips = false;
        String trustStoreType = null;
        String sslProtocol = null;

        // If anything in here fails, terminate the connection and throw an exception
```

### UnusedAssignment
Variable `tm` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            // then we'll "validate" the server certificate using a naive TrustManager that trusts
            // everything it sees.
            TrustManager[] tm = null;
            if (TDS.ENCRYPT_OFF == con.getNegotiatedEncryptionLevel() || con.getTrustServerCertificate()) {
                if (logger.isLoggable(Level.FINER))
```

### UnusedAssignment
Variable `tmf` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                    // Next step is to get a TrustManagerFactory that can produce TrustManagers
                    // that understands X.509 certificates.
                    TrustManagerFactory tmf = null;

                    if (logger.isLoggable(Level.FINEST))
```

### UnusedAssignment
Variable `sslContext` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            // Now, with a real or fake TrustManager in hand, get a context for creating a
            // SSL sockets through a SSL socket factory. We require at least TLS support.
            SSLContext sslContext = null;

            if (logger.isLoggable(Level.FINEST))
```

### UnusedAssignment
The value `preloginRequestOffset + 1` assigned to `preloginRequestOffset` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        if (fedAuthRequiredByUser) {
            preloginRequest[preloginRequestOffset] = 1;
            preloginRequestOffset = preloginRequestOffset + 1;
        }

```

### UnusedAssignment
The value `4` assigned to `offset` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        long seqNum = activityId.getSequence();
        Util.writeInt((int) seqNum, preloginRequest, offset);
        offset += 4;

        if (Util.isActivityTraceOn() && connectionlogger.isLoggable(Level.FINER)) {
```

### UnusedAssignment
Variable `libraryType` initializer `-1` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        private static final long serialVersionUID = -6709861741957202475L;
        boolean fedAuthRequiredPreLoginResponse;
        int libraryType = -1;
        byte[] accessToken = null;
        SqlAuthentication authentication = null;
```

### UnusedAssignment
The value `sleepInterval * 2` assigned to `sleepInterval` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                            Thread.currentThread().interrupt();
                        }
                        sleepInterval = sleepInterval * 2;
                    }
                }
```

### UnusedAssignment
The value `SQLServerDriverStringProperty.SERVER_CERTIFICATE.getDefaultValue()` assigned to `sPropValue` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                    sPropValue = activeConnectionProperties.getProperty(sPropKey);
                    if (null == sPropValue) {
                        sPropValue = SQLServerDriverStringProperty.SERVER_CERTIFICATE.getDefaultValue();
                    }
                    serverCertificate = activeConnectionProperties
```

### UnusedAssignment
Variable `tdsTokenHandler` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        // Always update serialVersionUID when prompted.
        private static final long serialVersionUID = 1L;
        transient TDSTokenHandler tdsTokenHandler = null;
        SqlAuthenticationToken sqlFedAuthToken = null;

```

### UnusedAssignment
The value `null` assigned to `authentication` is never used
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                if (null != authentication) {
                    authentication.releaseClientContext();
                    authentication = null;
                }
                if (null != impersonatedUserCred) {
```

### UnusedAssignment
Variable `data` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

                // try to read data and throw if the arguments are bad, meaning the server sent us a bad token
                String data = null;
                try {
                    byte[] dataArray = new byte[dataLen];
```

### UnusedAssignment
Variable `keystoreProvider` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
    SQLServerColumnEncryptionKeyStoreProvider getSystemOrGlobalColumnEncryptionKeyStoreProvider(
            String providerName) throws SQLServerException {
        SQLServerColumnEncryptionKeyStoreProvider keystoreProvider = null;

        lock.lock();
```

### UnusedAssignment
Variable `handle` initializer `0` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     */
    class PreparedStatementHandle {
        private int handle = 0;
        private final AtomicInteger handleRefCount = new AtomicInteger();
        private boolean isDirectSql;
```

### UnusedAssignment
Variable `statementHandle` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            // the remaining clean-up.
            int handlesRemoved = 0;
            PreparedStatementHandle statementHandle = null;

            while (null != (statementHandle = discardedPreparedStatementHandles.poll())) {
```

### UnusedAssignment
Variable `enclaveType` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                serverColumnEncryptionVersion = ColumnEncryptionVersion.AE_V1;

                String enclaveType = null;

                if (null != enclaveAttestationUrl || (enclaveAttestationProtocol != null
```

### UnusedAssignment
Variable `sqlFedAuthToken` initializer `null` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        private static final long serialVersionUID = 1L;
        transient TDSTokenHandler tdsTokenHandler = null;
        SqlAuthenticationToken sqlFedAuthToken = null;

        FedAuthTokenCommand(SqlAuthenticationToken sqlFedAuthToken, TDSTokenHandler tdsTokenHandler) {
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `null == outputStreamValue` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSQLXML.java`
#### Snippet
```java
            assert null == strValue;
        } else if (null != docValue) {
            assert null == outputStreamValue;
            assert null == strValue;
            ByteArrayOutputStreamToInputStream strm = new ByteArrayOutputStreamToInputStream();
```

### ConstantValue
Condition `null == outputStreamValue` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSQLXML.java`
#### Snippet
```java
            o = strm.getInputStream();
        } else {
            assert null == outputStreamValue;
            assert null == docValue;
            assert null != strValue;
```

### ConstantValue
Condition `null == docValue` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSQLXML.java`
#### Snippet
```java
        } else {
            assert null == outputStreamValue;
            assert null == docValue;
            assert null != strValue;
            o = new ByteArrayInputStream(strValue.getBytes(Encoding.UNICODE.charset()));
```

### ConstantValue
Condition `null != o` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSQLXML.java`
#### Snippet
```java
            o = new ByteArrayInputStream(strValue.getBytes(Encoding.UNICODE.charset()));
        }
        assert null != o;
        isFreed = true; // we have consumed the data
        return o;
```

### ConstantValue
Value `isRequestedByEnclave` is always 'true'
in `src/main/java/com/microsoft/sqlserver/jdbc/ISQLServerEnclaveProvider.java`
#### Snippet
```java
                String serverName = connection.getTrustedServerNameAE();
                SQLServerSecurityUtility.verifyColumnMasterKeyMetadata(connection, statement, keyStoreName, keyPath,
                        serverName, isRequestedByEnclave, keySignature);

                // DBID(4) + MDVER(8) + KEYID(2) + CEK(32) = 46
```

### ConstantValue
Condition `certificateDetails == null` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionJavaKeyStoreProvider.java`
#### Snippet
```java
        }

        if (certificateDetails == null) {
            MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_CertificateError"));
            Object[] msgArgs = {masterKeyPath, name};
```

### ConstantValue
Condition `this.minutesOffset >= MINUTES_OFFSET_MIN` is always `true`
in `src/main/java/microsoft/sql/DateTimeOffset.java`
#### Snippet
```java

        // Postconditions
        assert this.minutesOffset >= MINUTES_OFFSET_MIN && this.minutesOffset <= MINUTES_OFFSET_MAX : "minutesOffset: "
                + this.minutesOffset;
        assert this.nanos >= NANOS_MIN && this.nanos <= NANOS_MAX : "nanos: " + this.nanos;
```

### ConstantValue
Condition `this.minutesOffset >= MINUTES_OFFSET_MIN && this.minutesOffset <= MINUTES_OFFSET_MAX` is always `true`
in `src/main/java/microsoft/sql/DateTimeOffset.java`
#### Snippet
```java

        // Postconditions
        assert this.minutesOffset >= MINUTES_OFFSET_MIN && this.minutesOffset <= MINUTES_OFFSET_MAX : "minutesOffset: "
                + this.minutesOffset;
        assert this.nanos >= NANOS_MIN && this.nanos <= NANOS_MAX : "nanos: " + this.nanos;
```

### ConstantValue
Condition `this.minutesOffset <= MINUTES_OFFSET_MAX` is always `true` when reached
in `src/main/java/microsoft/sql/DateTimeOffset.java`
#### Snippet
```java

        // Postconditions
        assert this.minutesOffset >= MINUTES_OFFSET_MIN && this.minutesOffset <= MINUTES_OFFSET_MAX : "minutesOffset: "
                + this.minutesOffset;
        assert this.nanos >= NANOS_MIN && this.nanos <= NANOS_MAX : "nanos: " + this.nanos;
```

### ConstantValue
Condition `this.nanos >= NANOS_MIN` is always `true`
in `src/main/java/microsoft/sql/DateTimeOffset.java`
#### Snippet
```java
        assert this.minutesOffset >= MINUTES_OFFSET_MIN && this.minutesOffset <= MINUTES_OFFSET_MAX : "minutesOffset: "
                + this.minutesOffset;
        assert this.nanos >= NANOS_MIN && this.nanos <= NANOS_MAX : "nanos: " + this.nanos;
        assert 0 == this.nanos % 100 : "nanos: " + this.nanos;
        assert 0 == this.utcMillis % 1000L : "utcMillis: " + this.utcMillis;
```

### ConstantValue
Condition `this.nanos >= NANOS_MIN && this.nanos <= NANOS_MAX` is always `true`
in `src/main/java/microsoft/sql/DateTimeOffset.java`
#### Snippet
```java
        assert this.minutesOffset >= MINUTES_OFFSET_MIN && this.minutesOffset <= MINUTES_OFFSET_MAX : "minutesOffset: "
                + this.minutesOffset;
        assert this.nanos >= NANOS_MIN && this.nanos <= NANOS_MAX : "nanos: " + this.nanos;
        assert 0 == this.nanos % 100 : "nanos: " + this.nanos;
        assert 0 == this.utcMillis % 1000L : "utcMillis: " + this.utcMillis;
```

### ConstantValue
Condition `this.nanos <= NANOS_MAX` is always `true` when reached
in `src/main/java/microsoft/sql/DateTimeOffset.java`
#### Snippet
```java
        assert this.minutesOffset >= MINUTES_OFFSET_MIN && this.minutesOffset <= MINUTES_OFFSET_MAX : "minutesOffset: "
                + this.minutesOffset;
        assert this.nanos >= NANOS_MIN && this.nanos <= NANOS_MAX : "nanos: " + this.nanos;
        assert 0 == this.nanos % 100 : "nanos: " + this.nanos;
        assert 0 == this.utcMillis % 1000L : "utcMillis: " + this.utcMillis;
```

### ConstantValue
Condition `value <= 255` is always `true` when reached
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
    public int read() throws IOException {
        int value = containedStream.read();
        if (value >= 0 && value <= 255)
            return ASCII_FILTER[value];
        return value;
```

### ConstantValue
Condition `SSType.DATETIMEOFFSET == ssType` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
                        // Per driver spec, conversion to DateTimeOffset is only supported from
                        // DATETIMEOFFSET SQL Server values.
                        assert SSType.DATETIMEOFFSET == ssType;

                        // For DATETIMEOFFSET SQL Server values, the time zone offset is in minutes.
```

### ConstantValue
Value `allowEnclaveComputations` is always 'true'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionAzureKeyVaultProvider.java`
#### Snippet
```java
        KeyStoreProviderCommon.validateNonEmptyMasterKeyPath(masterKeyPath);

        CMKMetadataSignatureInfo key = new CMKMetadataSignatureInfo(masterKeyPath, allowEnclaveComputations, signature);

        if (cmkMetadataSignatureVerificationCache.contains(key)) {
```

### ConstantValue
Condition `POINT_STR.equalsIgnoreCase(nextToken)` is always `true` when reached
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java
            switch (nextToken) {
                case POINT_STR:
                    if (startPos == 0 && POINT_STR.equalsIgnoreCase(nextToken)) {
                        isSinglePoint = true;
                        internalType = InternalSpatialDatatype.POINT;
```

### ConstantValue
Condition `SQLServerResultSet.TYPE_SS_SCROLL_KEYSET != nType` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
                && SQLServerResultSet.TYPE_SS_SERVER_CURSOR_FORWARD_ONLY != nType
                && SQLServerResultSet.TYPE_SS_SCROLL_DYNAMIC != nType
                && SQLServerResultSet.TYPE_SS_SCROLL_KEYSET != nType
                && SQLServerResultSet.TYPE_SS_SCROLL_STATIC != nType) {
            SQLServerException.makeFromDriverError(connection, this,
```

### ConstantValue
Condition `SQLServerResultSet.TYPE_SS_SCROLL_STATIC != nType` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
                && SQLServerResultSet.TYPE_SS_SCROLL_DYNAMIC != nType
                && SQLServerResultSet.TYPE_SS_SCROLL_KEYSET != nType
                && SQLServerResultSet.TYPE_SS_SCROLL_STATIC != nType) {
            SQLServerException.makeFromDriverError(connection, this,
                    SQLServerException.getErrString("R_unsupportedCursor"), null, true);
```

### ConstantValue
Condition `SQLServerResultSet.CONCUR_SS_OPTIMISTIC_CC != nConcur` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
        if (ResultSet.CONCUR_READ_ONLY != nConcur && ResultSet.CONCUR_UPDATABLE != nConcur
                && SQLServerResultSet.CONCUR_SS_SCROLL_LOCKS != nConcur
                && SQLServerResultSet.CONCUR_SS_OPTIMISTIC_CC != nConcur
                && SQLServerResultSet.CONCUR_SS_OPTIMISTIC_CCVAL != nConcur) {
            SQLServerException.makeFromDriverError(connection, this,
```

### ConstantValue
Condition `MAX_CHAR_BUFFER_SIZE <= Integer.MAX_VALUE` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/ReaderInputStream.java`
#### Snippet
```java
        if (null == rawChars || !rawChars.hasRemaining()) {
            if (null == rawChars) {
                assert MAX_CHAR_BUFFER_SIZE <= Integer.MAX_VALUE;
                rawChars = CharBuffer.allocate((DataTypes.UNKNOWN_STREAM_LENGTH == readerLength
                        || readerLength > MAX_CHAR_BUFFER_SIZE) ? MAX_CHAR_BUFFER_SIZE
```

### ConstantValue
Condition `charsRead > 0` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/ReaderInputStream.java`
#### Snippet
```java
                }

                assert charsRead > 0;

                // If the reader violates its interface contract then throw an exception.
```

### ConstantValue
Condition `null != reader` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/ReaderInputStream.java`
#### Snippet
```java
    @Override
    public int available() throws IOException {
        assert null != reader;
        assert null != encodedChars;

```

### ConstantValue
Value `spn` is always 'null'
in `src/main/java/com/microsoft/sqlserver/jdbc/SSPIAuthentication.java`
#### Snippet
```java
    String enrichSpnWithRealm(SQLServerConnection con, String spn, boolean allowHostnameCanonicalization) {
        if (spn == null) {
            return spn;
        }
        Matcher m = SPN_PATTERN.matcher(spn);
```

### ConstantValue
Condition `0 == valueLength` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
                                    tdsWriter.writeEncryptedRPCDateTimeOffset(name, calendar, minutesOffset,
                                            subSecondNanos,
                                            (0 == valueLength ? TDS.MAX_FRACTIONAL_SECONDS_SCALE : valueLength),
                                            isOutParam, statement);
                                }
```

### ConstantValue
Value `byteArrayValue` is always 'null'
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
                        tdsWriter.writeEncryptedRPCPLP();
                    } else {
                        tdsWriter.writeEncryptedRPCByteArray(byteArrayValue);
                    }

```

### ConstantValue
Condition `(jdbcType == JDBCType.LONGNVARCHAR) && (JDBCType.VARCHAR == jdbcTypeSetByUser) ...` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
                            // jdbcType is set to LONGNVARCHAR if input data length is >
                            // DataTypes.SHORT_VARTYPE_MAX_CHARS for string
                            if ((jdbcType == JDBCType.LONGNVARCHAR) && (JDBCType.VARCHAR == jdbcTypeSetByUser)
                                    && (DataTypes.MAX_VARTYPE_MAX_BYTES < valueLength)) {
                                MessageFormat form = new MessageFormat(
                                        SQLServerException.getErrString("R_StreamingDataTypeAE"));
```

### ConstantValue
Condition `DataTypes.MAX_VARTYPE_MAX_BYTES < valueLength` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
                            // DataTypes.SHORT_VARTYPE_MAX_CHARS for string
                            if ((jdbcType == JDBCType.LONGNVARCHAR) && (JDBCType.VARCHAR == jdbcTypeSetByUser)
                                    && (DataTypes.MAX_VARTYPE_MAX_BYTES < valueLength)) {
                                MessageFormat form = new MessageFormat(
                                        SQLServerException.getErrString("R_StreamingDataTypeAE"));
```

### ConstantValue
Condition `(null != cryptoMeta) && (DataTypes.MAX_VARTYPE_MAX_BYTES < valueLength)` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java

                case BYTEARRAY:
                    if ((null != cryptoMeta) && (DataTypes.MAX_VARTYPE_MAX_BYTES < valueLength)) {
                        MessageFormat form = new MessageFormat(
                                SQLServerException.getErrString("R_StreamingDataTypeAE"));
```

### ConstantValue
Condition `DataTypes.MAX_VARTYPE_MAX_BYTES < valueLength` is always `false` when reached
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java

                case BYTEARRAY:
                    if ((null != cryptoMeta) && (DataTypes.MAX_VARTYPE_MAX_BYTES < valueLength)) {
                        MessageFormat form = new MessageFormat(
                                SQLServerException.getErrString("R_StreamingDataTypeAE"));
```

### ConstantValue
Condition `valueMark == null` is always `true` when reached
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
        // either there should be a valueMark
        // or valueMark should be null and isNull should be set to true(NBCROW case)
        assert ((valueMark != null) || (valueMark == null && isNull));

        if (null != streamGetterArgs) {
```

### ConstantValue
Condition `TDSType.BIGVARBINARY == baseType` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
                if (TDSType.BIGBINARY == baseType)
                    jdbcType = JDBCType.BINARY;// LONGVARCHAR;
                else if (TDSType.BIGVARBINARY == baseType)
                    jdbcType = JDBCType.VARBINARY;
                maxLength = tdsReader.readUnsignedShort();
```

### ConstantValue
Condition `null == context` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/NTLMAuthentication.java`
#### Snippet
```java
    NTLMAuthentication(final SQLServerConnection con, final String domainName, final String userName,
            final byte[] passwordHash, final String workstation) throws SQLServerException {
        if (null == context) {
            this.context = new NTLMContext(con, domainName, userName, passwordHash, workstation);
        }
```

### ConstantValue
Value `tokens` is always 'null'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCSVFileRecord.java`
#### Snippet
```java
    private static String[] escapeQuotesRFC4180(String[] tokens) throws SQLServerException {
        if (null == tokens) {
            return tokens;
        }
        for (int i = 0; i < tokens.length; i++) {
```

### ConstantValue
Value `name` is always 'null'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
    static String getPropertyOnlyName(String name, Logger logger) {
        if (null == name)
            return name;

        for (SQLServerDriverPropertyInfo aDRIVER_PROPERTIES_PROPERTY_ONLY : DRIVER_PROPERTIES_PROPERTY_ONLY) {
```

### ConstantValue
Value `name` is always 'null'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
    static String getNormalizedPropertyName(String name, Logger logger) {
        if (null == name)
            return name;

        for (String[] driverPropertiesSynonym : driverPropertiesSynonyms) {
```

### ConstantValue
Value `name` is always 'null'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
    static String getNormalizedPropertyValueName(String name) {
        if (null == name)
            return name;

        for (String[] driverPropertyValueSynonym : driverPropertyValuesSynonyms) {
```

### ConstantValue
Value `isFeatureExtAck` is always 'false'
in `src/main/java/com/microsoft/sqlserver/jdbc/tdsparser.java`
#### Snippet
```java
        // if TDS_FEATURE_EXTENSION_ACK is not received verify if TDS_FEATURE_EXT_AE was sent
        if (isLoginAck && !isFeatureExtAck)
            tdsReader.tryProcessFeatureExtAck(isFeatureExtAck);
    }

```

### ConstantValue
Condition `rec != null` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/dns/DNSUtilities.java`
#### Snippet
```java
                try {
                    DNSRecordSRV rec = DNSRecordSRV.parseFromDNSRecord(record);
                    if (rec != null) {
                        records.add(rec);
                    }
```

### ConstantValue
Condition `-1 == xmlBytesRead` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/PLPInputStream.java`
#### Snippet
```java

        // No bytes read - should have been EOF since 0-byte reads are handled above
        assert -1 == xmlBytesRead;
        return -1;
    }
```

### ConstantValue
Condition `null != localUserSQL` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
        localUserSQL = localUserSQL.trim();

        while (checkForSemicolon && null != localUserSQL && localUserSQL.length() > 0
                && localUserSQL.charAt(0) == ';') {
            localUserSQL = localUserSQL.substring(1);
```

### ConstantValue
Condition `null == localUserSQL` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
        }

        if (null == localUserSQL || localUserSQL.length() < 2) {
            return false;
        }
```

### ConstantValue
Value `needsPrepare` is always 'true'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
                    if (executeMethod == EXECUTE_BATCH) {
                        buildPrepParams(tdsWriter);
                        return needsPrepare;
                    } else { // Otherwise, if it is not a batch query, then prepare and start new TDS request to execute
                             // the statement.
```

### ConstantValue
Condition `!inRetry` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
                if (retryBasedOnFailedReuseOfCachedHandle(e, attempt, needsPrepare, false)) {
                    continue;
                } else if (!inRetry && connection.doesServerSupportEnclaveRetry()) {
                    // We only want to retry once, so no retrying if we're already in the second pass.
                    // If we are AE_v3, remove the failed entry and try again.
```

### ConstantValue
Condition `null != connection` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
        ParsedSQLCacheItem parsedSQL = getCachedParsedSQL(sqlTextCacheKey);
        if (null != parsedSQL) {
            if (null != connection && connection.isStatementPoolingEnabled()) {
                isExecutedAtLeastOnce = true;
            }
```

### ConstantValue
Condition `isUserCreatedCredential` is always `true` when reached
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
            if (null != peerCredentials && !isUserCreatedCredential) {
                peerCredentials.dispose();
            } else if (null != peerCredentials && isUserCreatedCredential) {
                peerCredentials = null;
            }
```

### ConstantValue
Condition `null != jdbcType` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/DataTypes.java`
#### Snippet
```java
            }

            assert null != jdbcType;
            return jdbcType;
        }
```

### ConstantValue
Condition `currentRow >= 1` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/ScrollWindow.java`
#### Snippet
```java
        // can be restored later if we ever move to this row again.
        if (currentRow <= maxRows) {
            assert currentRow >= 1;
            updatedRow[currentRow - 1] = rs.getUpdatedCurrentRow();
            deletedRow[currentRow - 1] = rs.getDeletedCurrentRow();
```

### ConstantValue
Value `tvpName` is always 'null'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCallableStatement.java`
#### Snippet
```java
        } else
            setObject(setterGetParam(findColumn(parameterName)), value, JavaType.of(value), JDBCType.of(sqlType), null,
                    null, false, findColumn(parameterName), tvpName);
        loggerExternal.exiting(getClassNameLogging(), "setObject");
    }
```

### ConstantValue
Value `value` is always 'null'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
    final Object apply(Object value, JDBCType asJDBCType) throws SQLServerException {
        if (null == value)
            return value;
        // Assumption: values will only be requested in integral or textual
        // format
```

### ConstantValue
Condition `SQLServerResultSet.TYPE_SS_SCROLL_KEYSET == type` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        checkResultType(type);
        return (type == SQLServerResultSet.TYPE_SS_SCROLL_DYNAMIC || SQLServerResultSet.TYPE_FORWARD_ONLY == type
                || SQLServerResultSet.TYPE_SCROLL_SENSITIVE == type || SQLServerResultSet.TYPE_SS_SCROLL_KEYSET == type
                || SQLServerResultSet.TYPE_SS_SERVER_CURSOR_FORWARD_ONLY == type);
    }
```

### ConstantValue
Condition `SQLServerResultSet.TYPE_SS_SCROLL_KEYSET == type` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        checkResultType(type);
        return (type == SQLServerResultSet.TYPE_SS_SCROLL_DYNAMIC || SQLServerResultSet.TYPE_FORWARD_ONLY == type
                || SQLServerResultSet.TYPE_SCROLL_SENSITIVE == type || SQLServerResultSet.TYPE_SS_SCROLL_KEYSET == type
                || SQLServerResultSet.TYPE_SS_SERVER_CURSOR_FORWARD_ONLY == type);
    }
```

### ConstantValue
Condition `SQLServerResultSet.TYPE_SS_SCROLL_KEYSET == type` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        checkResultType(type);
        return (type == SQLServerResultSet.TYPE_SS_SCROLL_DYNAMIC || SQLServerResultSet.TYPE_FORWARD_ONLY == type
                || SQLServerResultSet.TYPE_SCROLL_SENSITIVE == type || SQLServerResultSet.TYPE_SS_SCROLL_KEYSET == type
                || SQLServerResultSet.TYPE_SS_SERVER_CURSOR_FORWARD_ONLY == type);
    }
```

### ConstantValue
Condition `catalog.length() != 0` is always `true` when reached
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        } else {
            s += " CASE WHEN " + schemaName + "  IN " + constSchemas + " THEN null ELSE ";
            if (null != catalog && catalog.length() != 0) {
                s += "'" + catalog + "' ";
            } else
```

### ConstantValue
Value `catalog` is always 'null'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        if (null == schemaPattern) {
            catalog = null;
            rs = getResultSetFromInternalQueries(catalog, s);
        } else {

```

### ConstantValue
Condition `SQLServerResultSet.TYPE_SS_SCROLL_KEYSET == type` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        checkResultType(type);
        return (type == SQLServerResultSet.TYPE_SS_SCROLL_DYNAMIC || SQLServerResultSet.TYPE_FORWARD_ONLY == type
                || SQLServerResultSet.TYPE_SCROLL_SENSITIVE == type || SQLServerResultSet.TYPE_SS_SCROLL_KEYSET == type
                || SQLServerResultSet.TYPE_SS_SERVER_CURSOR_FORWARD_ONLY == type);
    }
```

### ConstantValue
Condition `SQLServerResultSet.TYPE_SS_SCROLL_KEYSET == type` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        checkResultType(type);
        return (type == SQLServerResultSet.TYPE_SS_SCROLL_DYNAMIC || SQLServerResultSet.TYPE_FORWARD_ONLY == type
                || SQLServerResultSet.TYPE_SCROLL_SENSITIVE == type || SQLServerResultSet.TYPE_SS_SCROLL_KEYSET == type
                || SQLServerResultSet.TYPE_SS_SERVER_CURSOR_FORWARD_ONLY == type);
    }
```

### ConstantValue
Value `value` is always 'null'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
    final Object apply(Object value, JDBCType asJDBCType) throws SQLServerException {
        if (null == value)
            return value;
        // Assumption: values will only be requested in integral or textual
        // format
```

### ConstantValue
Value `inID` is always 'null'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
    private static String escapeIDName(String inID) {
        if (null == inID)
            return inID;
        // SQL bracket escaping rules.
        // See Using Wildcard Characters As Literals in SQL BOL
```

### ConstantValue
Condition `null == sCurr` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
            return null;
        connection.setCatalog(sNew);
        if (null == sCurr || sCurr.length() == 0)
            return null;
        return sCurr;
```

### ConstantValue
Condition `null != pstmt` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
                rs.getColumn(16).setFilter(new ZeroFixupFilter());
            } catch (SQLException e) {
                if (null != pstmt) {
                    try {
                        pstmt.close();
```

### ConstantValue
Condition `null == statementMap` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java

        HandleAssociation() {
            if (null == statementMap) {
                statementMap = new HashMap<>();
            }
```

### ConstantValue
Value `x` is always 'null'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
            }

            column.updateValue(jdbcType, x, JavaType.OBJECT, null, // streamSetterArgs
                    null, scale, stmt.connection, stmt.stmtColumnEncriptionSetting, precision, forceEncrypt, index);
        } else {
```

### ConstantValue
Condition `row < 0` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
                    // of the result set, and apply the logic above.
                    if (UNKNOWN_ROW_COUNT != rowCount) {
                        assert row < 0;
                        moveRelative((rowCount + row + 1) - currentRow);
                        return;
```

### ConstantValue
Condition `row < 0` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
                } else {
                    // Absolute fetch with -ve row is relative to the end of the result set.
                    assert row < 0;
                    assert rowCount + row + 1 >= 1;
                    currentRow = rowCount + row + 1;
```

### ConstantValue
Condition `null != c` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
            Connection c = stmt.getConnection();
            if (c instanceof ISQLServerConnection) {
                if (null != c && !((ISQLServerConnection) c).getDelayLoadingLobs() && null != lob) {
                    lob.setDelayLoadingLob();
                }
```

### ConstantValue
Condition `colValue instanceof java.sql.Timestamp` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                calendar.setTimeInMillis(utcMillis);
                int subSecondNanos;
                if (colValue instanceof java.sql.Timestamp) {
                    subSecondNanos = ((java.sql.Timestamp) colValue).getNanos();
                } else {
```

### ConstantValue
Condition `null != destType` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
            if (null != columnCollation && columnCollation.trim().length() > 0) {
                // we are adding collate in command only for char and varchar
                if (null != destType && (destType.toLowerCase(Locale.ENGLISH).trim().startsWith("char")
                        || destType.toLowerCase(Locale.ENGLISH).trim().startsWith("varchar")))
                    addCollate = " COLLATE " + columnCollation;
```

### ConstantValue
Condition `colValue instanceof byte[]` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                writeBulkCopySqlVariantHeader(4 + length, TDSType.BIGVARBINARY.byteValue(), (byte) 2, tdsWriter);
                tdsWriter.writeShort((short) (variantType.getMaxLength())); // length
                if (colValue instanceof byte[]) {
                    srcBytes = (byte[]) colValue;
                } else {
```

### ConstantValue
Condition `colValue instanceof byte[]` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                writeBulkCopySqlVariantHeader(4 + length, TDSType.BIGVARBINARY.byteValue(), (byte) 2, tdsWriter);
                tdsWriter.writeShort((short) (variantType.getMaxLength())); // length
                if (colValue instanceof byte[]) {
                    srcBytes = (byte[]) colValue;
                } else {
```

### ConstantValue
Value `isStreaming` is always 'true'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                        // still work.
                        if (null == colValue) {
                            writeNullToTdsWriter(tdsWriter, bulkJdbcType, isStreaming);
                        } else {
                            // Send length as unknown.
```

### ConstantValue
Value `isStreaming` is always 'false'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                    } else {
                        if (null == colValue) {
                            writeNullToTdsWriter(tdsWriter, bulkJdbcType, isStreaming);
                        } else {

```

### ConstantValue
Value `isStreaming` is always 'true'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                        // still work.
                        if (null == colValue) {
                            writeNullToTdsWriter(tdsWriter, bulkJdbcType, isStreaming);
                        } else {
                            // Send length as unknown.
```

### ConstantValue
Value `isStreaming` is always 'false'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                    } else {
                        if (null == colValue) {
                            writeNullToTdsWriter(tdsWriter, bulkJdbcType, isStreaming);
                        } else {
                            int stringLength = colValue.toString().length();
```

### ConstantValue
Value `isStreaming` is always 'true'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                        // does not support streaming data.
                        if (null == colValue) {
                            writeNullToTdsWriter(tdsWriter, bulkJdbcType, isStreaming);
                        } else {
                            // Send length as unknown.
```

### ConstantValue
Value `isStreaming` is always 'false'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                    {
                        if (null == colValue) {
                            writeNullToTdsWriter(tdsWriter, bulkJdbcType, isStreaming);
                        } else {
                            byte[] srcBytes;
```

### ConstantValue
Condition `null != destCryptoMeta` is always `true` when reached
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
        else if (null != serverBulkData && (null == destCryptoMeta)) {
            validateStringBinaryLengths(colValue, srcColOrdinal, destColOrdinal);
        } else if ((null != serverBulkData) && (null != destCryptoMeta)) {
            // From CSV to encrypted column. Convert to respective object.
            if ((java.sql.Types.DATE == srcJdbcType) || (java.sql.Types.TIME == srcJdbcType)
```

### ConstantValue
Condition `null == destCryptoMeta` is always `true` when reached
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java

        CryptoMetadata destCryptoMeta = destColumnMetadata.get(destColIndx).cryptoMeta;
        if (null != destCryptoMeta || (null == destCryptoMeta && copyOptions.isAllowEncryptedValueModifications())) {
            // Encrypted columns are sent as binary data.
            tdsWriter.setCryptoMetaData(destColumnMetadata.get(destColIndx).cryptoMeta);
```

### ConstantValue
Condition `DataTypes.SHORT_VARTYPE_MAX_BYTES < destPrecision` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                // Return binary(n) or varbinary(n) or varbinary(max) depending on destination type/precision.
                return destSSType.toString() + "("
                        + ((DataTypes.SHORT_VARTYPE_MAX_BYTES < destPrecision) ? "max" : destPrecision) + ")";
        }

```

### ConstantValue
Condition `useParallel || useTnir` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            // inetAddrs is only used if useParallel is true or TNIR is true. Skip resolving address if that's not the
            // case.
            if (useParallel || useTnir) {
                // Ignore TNIR if host resolves to more than 64 IPs. Make sure we are using original timeout for this.
                inetAddrs = InetAddress.getAllByName(hostName);
```

### ConstantValue
Condition `useTnir` is always `true` when reached
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            // inetAddrs is only used if useParallel is true or TNIR is true. Skip resolving address if that's not the
            // case.
            if (useParallel || useTnir) {
                // Ignore TNIR if host resolves to more than 64 IPs. Make sure we are using original timeout for this.
                inetAddrs = InetAddress.getAllByName(hostName);
```

### ConstantValue
Condition `0 <= reLength` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            // For Shiloh, this is enforced in DTV by converting the Reader to some other length-
            // prefixed value in the setter.
            assert 0 <= reLength && reLength <= DataTypes.NTEXT_MAX_CHARS;

            // For non-PLP types, use the long TEXT type rather than the short VARCHAR
```

### ConstantValue
Condition `0 <= reLength && reLength <= DataTypes.NTEXT_MAX_CHARS` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            // For Shiloh, this is enforced in DTV by converting the Reader to some other length-
            // prefixed value in the setter.
            assert 0 <= reLength && reLength <= DataTypes.NTEXT_MAX_CHARS;

            // For non-PLP types, use the long TEXT type rather than the short VARCHAR
```

### ConstantValue
Condition `reLength <= DataTypes.NTEXT_MAX_CHARS` is always `true` when reached
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            // For Shiloh, this is enforced in DTV by converting the Reader to some other length-
            // prefixed value in the setter.
            assert 0 <= reLength && reLength <= DataTypes.NTEXT_MAX_CHARS;

            // For non-PLP types, use the long TEXT type rather than the short VARCHAR
```

### ConstantValue
Condition `reLength <= DataTypes.SHORT_VARTYPE_MAX_CHARS` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            // type if the stream is too long to fit in the latter or if we don't know the length up
            // front so we have to assume that it might be too long.
            boolean useVarType = reLength <= DataTypes.SHORT_VARTYPE_MAX_CHARS;

            writeRPCNameValType(sName, bOut, useVarType ? TDSType.NVARCHAR : TDSType.NTEXT);
```

### ConstantValue
Condition `useVarType` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            boolean useVarType = reLength <= DataTypes.SHORT_VARTYPE_MAX_CHARS;

            writeRPCNameValType(sName, bOut, useVarType ? TDSType.NVARCHAR : TDSType.NTEXT);

            // Write maximum length, collation, and actual length of the data
```

### ConstantValue
Condition `useVarType` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

            // Write maximum length, collation, and actual length of the data
            if (useVarType) {
                writeShort((short) DataTypes.SHORT_VARTYPE_MAX_BYTES);
                collation.writeCollation(this);
```

### ConstantValue
Value `bOut` is always 'false'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        } else { // non-PLP type
            // Write maximum length of data
            writeRPCNameValType(sName, bOut, TDSType.NVARCHAR);
            writeShort((short) DataTypes.SHORT_VARTYPE_MAX_BYTES);

```

### ConstantValue
Condition `SSType.DATETIME2 == ssType || SSType.DATETIMEOFFSET == ssType` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                // If the type is datetime2 or datetimeoffset, truncate only if its the max value supported
                else {
                    assert SSType.DATETIME2 == ssType || SSType.DATETIMEOFFSET == ssType : UNEXPECTED_SSTYPE + ssType;

                    // ... then bump the date, provided that the resulting date is still within
```

### ConstantValue
Condition `SSType.DATETIMEOFFSET == ssType` is always `true` when reached
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                // If the type is datetime2 or datetimeoffset, truncate only if its the max value supported
                else {
                    assert SSType.DATETIME2 == ssType || SSType.DATETIMEOFFSET == ssType : UNEXPECTED_SSTYPE + ssType;

                    // ... then bump the date, provided that the resulting date is still within
```

### ConstantValue
Condition `-1 == bytesRead` is always `false` when reached
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            while (0 == (bytesRead = readInternal(oneByte, 0, oneByte.length)));

            assert 1 == bytesRead || -1 == bytesRead;
            return 1 == bytesRead ? oneByte[0] : -1;
        }
```

### ConstantValue
Condition `1 == bytesRead` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

            assert 1 == bytesRead || -1 == bytesRead;
            return 1 == bytesRead ? oneByte[0] : -1;
        }

```

### ConstantValue
Condition `DataTypes.UNKNOWN_STREAM_LENGTH == streamLength` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            // in memory so that we can determine its length and send that length to the server
            // before the stream data itself.
            if (DataTypes.UNKNOWN_STREAM_LENGTH == streamLength) {
                // Create ByteArrayOutputStream with initial buffer size of 8K to handle typical
                // binary field sizes more efficiently. Note we can grow beyond 8000 bytes.
```

### ConstantValue
Condition `0 <= streamLength` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            }

            assert 0 <= streamLength && streamLength <= DataTypes.IMAGE_TEXT_MAX_BYTES;

            boolean useVarType = streamLength <= DataTypes.SHORT_VARTYPE_MAX_BYTES;
```

### ConstantValue
Condition `0 <= streamLength && streamLength <= DataTypes.IMAGE_TEXT_MAX_BYTES` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            }

            assert 0 <= streamLength && streamLength <= DataTypes.IMAGE_TEXT_MAX_BYTES;

            boolean useVarType = streamLength <= DataTypes.SHORT_VARTYPE_MAX_BYTES;
```

### ConstantValue
Condition `streamLength <= DataTypes.IMAGE_TEXT_MAX_BYTES` is always `true` when reached
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            }

            assert 0 <= streamLength && streamLength <= DataTypes.IMAGE_TEXT_MAX_BYTES;

            boolean useVarType = streamLength <= DataTypes.SHORT_VARTYPE_MAX_BYTES;
```

### ConstantValue
Condition `streamLength <= DataTypes.SHORT_VARTYPE_MAX_BYTES` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            assert 0 <= streamLength && streamLength <= DataTypes.IMAGE_TEXT_MAX_BYTES;

            boolean useVarType = streamLength <= DataTypes.SHORT_VARTYPE_MAX_BYTES;

            writeRPCNameValType(sName, bOut,
```

### ConstantValue
Condition `useVarType` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

            writeRPCNameValType(sName, bOut,
                    jdbcType.isTextual() ? (useVarType ? TDSType.BIGVARCHAR : TDSType.TEXT)
                                         : (useVarType ? TDSType.BIGVARBINARY : TDSType.IMAGE));

```

### ConstantValue
Condition `useVarType` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            writeRPCNameValType(sName, bOut,
                    jdbcType.isTextual() ? (useVarType ? TDSType.BIGVARCHAR : TDSType.TEXT)
                                         : (useVarType ? TDSType.BIGVARBINARY : TDSType.IMAGE));

            // Write maximum length, optional collation, and actual length
```

### ConstantValue
Condition `useVarType` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

            // Write maximum length, optional collation, and actual length
            if (useVarType) {
                writeShort((short) DataTypes.SHORT_VARTYPE_MAX_BYTES);
                if (jdbcType.isTextual())
```

### ConstantValue
Condition `DataTypes.UNKNOWN_STREAM_LENGTH == dataLength` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                    }

                    else if (DataTypes.UNKNOWN_STREAM_LENGTH == dataLength)
                        // Append v*max length.
                        // UNKNOWN_PLP_LEN is 0xFFFFFFFFFFFFFFFE
```

### ConstantValue
Condition `DataTypes.UNKNOWN_STREAM_LENGTH == dataLength` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                        // Null header for v*max types is 0xFFFFFFFFFFFFFFFF.
                        writeLong(0xFFFFFFFFFFFFFFFFL);
                    else if (DataTypes.UNKNOWN_STREAM_LENGTH == dataLength)
                        // Append v*max length.
                        // UNKNOWN_PLP_LEN is 0xFFFFFFFFFFFFFFFE
```

### ConstantValue
Condition `nValueLen <= DataTypes.MAX_VARTYPE_MAX_BYTES` is always `true` when reached
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        boolean isShortValue = (nValueLen <= DataTypes.SHORT_VARTYPE_MAX_BYTES);

        boolean isPLP = (!isShortValue) && (nValueLen <= DataTypes.MAX_VARTYPE_MAX_BYTES);

        // Handle Shiloh types here.
```

### ConstantValue
Condition `isPLP` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        if (isShortValue) {
            writeShort((short) DataTypes.SHORT_VARTYPE_MAX_BYTES);
        } else if (isPLP) {
            writeShort((short) DataTypes.SQL_USHORTVARMAXLEN);
        } else {
```

### ConstantValue
Condition `isPLP` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            if (isShortValue) {
                writeShort((short) nValueLen); // actual len
            } else if (isPLP) {
                writeLong(nValueLen); // actual length
            } else {
```

### ConstantValue
Condition `1000 * 60 * 60 * 24 - 1 <= millisSinceMidnight` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        // The last millisecond of the current day is always rounded to the first millisecond
        // of the next day because DATETIME is only accurate to 1/300th of a second.
        if (1000 * 60 * 60 * 24 - 1 <= millisSinceMidnight) {
            ++daysSinceSQLBaseDate;
            millisSinceMidnight = 0;
```

### ConstantValue
Value `selectedChannel` is always 'null'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            // All other channels will be closed in the finally block,
            // as they need to be closed irrespective of a success/failure
            close(selectedChannel);
            throw ex;
        } finally {
```

### ConstantValue
Condition `bytesRead < 0` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

                // Check for invalid bytesRead returned from InputStream.read
                if (bytesRead < 0 || bytesRead > buff.length - bytesToWrite) {
                    MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_errorReadingStream"));
                    Object[] msgArgs = {SQLServerException.getErrString("R_streamReadReturnedInvalidValue")};
```

### ConstantValue
Condition `SSType.DATETIME2 == ssType || SSType.DATETIMEOFFSET == ssType` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                // If the type is datetime2 or datetimeoffset, truncate only if its the max value supported
                else {
                    assert SSType.DATETIME2 == ssType || SSType.DATETIMEOFFSET == ssType : UNEXPECTED_SSTYPE + ssType;

                    // ... then bump the date, provided that the resulting date is still within
```

### ConstantValue
Condition `SSType.DATETIMEOFFSET == ssType` is always `true` when reached
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                // If the type is datetime2 or datetimeoffset, truncate only if its the max value supported
                else {
                    assert SSType.DATETIME2 == ssType || SSType.DATETIMEOFFSET == ssType : UNEXPECTED_SSTYPE + ssType;

                    // ... then bump the date, provided that the resulting date is still within
```

### ConstantValue
Condition `SSType.DATETIMEOFFSET == ssType` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                encodedBytesForEncryption = new byte[encodedLength + 3];
                System.arraycopy(encodedBytes, 0, encodedBytesForEncryption, 0, encodedBytes.length);
            } else if (SSType.DATETIMEOFFSET == ssType) {
                // for DATETIMEOFFSET sends date, time and offset part together for encryption
                encodedBytesForEncryption = new byte[encodedLength + 5];
```

### ConstantValue
Condition `SSType.DATE == ssType || SSType.DATETIME2 == ssType || SSType.DATETIMEOFFSET == ssType` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

        // Second, for types with a date component, write the days into the Common Era
        if (SSType.DATE == ssType || SSType.DATETIME2 == ssType || SSType.DATETIMEOFFSET == ssType) {
            // Computation of the number of days into the Common Era assumes that
            // the DAY_OF_YEAR field reflects a pure Gregorian calendar - one that
```

### ConstantValue
Condition `SSType.DATETIMEOFFSET == ssType` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

        // Second, for types with a date component, write the days into the Common Era
        if (SSType.DATE == ssType || SSType.DATETIME2 == ssType || SSType.DATETIMEOFFSET == ssType) {
            // Computation of the number of days into the Common Era assumes that
            // the DAY_OF_YEAR field reflects a pure Gregorian calendar - one that
```

### ConstantValue
Condition `encodedBytesForEncryption == null` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                }

                if (encodedBytesForEncryption == null) {
                    MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_NullValue"));
                    Object[] msgArgs1 = {"encodedBytesForEncryption"};
```

### ConstantValue
Condition `encodedBytesForEncryption == null` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                }

                if (encodedBytesForEncryption == null) {
                    MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_NullValue"));
                    Object[] msgArgs1 = {"encodedBytesForEncryption"};
```

### ConstantValue
Condition `isShortValue || usePLP` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        if (null != cryptoMeta) {
            // send encrypted data as BIGVARBINARY
            tdsType = (isShortValue || usePLP) ? TDSType.BIGVARBINARY : TDSType.IMAGE;
            collation = null;
        } else
```

### ConstantValue
Condition `usePLP` is always `true` when reached
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        if (null != cryptoMeta) {
            // send encrypted data as BIGVARBINARY
            tdsType = (isShortValue || usePLP) ? TDSType.BIGVARBINARY : TDSType.IMAGE;
            collation = null;
        } else
```

### ConstantValue
Condition `isShortValue || usePLP` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                case LONGVARCHAR:
                case CLOB:
                    tdsType = (isShortValue || usePLP) ? TDSType.BIGVARCHAR : TDSType.TEXT;
                    if (null == collation)
                        collation = con.getDatabaseCollation();
```

### ConstantValue
Condition `usePLP` is always `true` when reached
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                case LONGVARCHAR:
                case CLOB:
                    tdsType = (isShortValue || usePLP) ? TDSType.BIGVARCHAR : TDSType.TEXT;
                    if (null == collation)
                        collation = con.getDatabaseCollation();
```

### ConstantValue
Condition `isShortValue || usePLP` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                case LONGNVARCHAR:
                case NCLOB:
                    tdsType = (isShortValue || usePLP) ? TDSType.NVARCHAR : TDSType.NTEXT;
                    if (null == collation)
                        collation = con.getDatabaseCollation();
```

### ConstantValue
Condition `usePLP` is always `true` when reached
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                case LONGNVARCHAR:
                case NCLOB:
                    tdsType = (isShortValue || usePLP) ? TDSType.NVARCHAR : TDSType.NTEXT;
                    if (null == collation)
                        collation = con.getDatabaseCollation();
```

### ConstantValue
Condition `isShortValue || usePLP` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                case BLOB:
                default:
                    tdsType = (isShortValue || usePLP) ? TDSType.BIGVARBINARY : TDSType.IMAGE;
                    collation = null;
                    break;
```

### ConstantValue
Condition `usePLP` is always `true` when reached
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                case BLOB:
                default:
                    tdsType = (isShortValue || usePLP) ? TDSType.BIGVARBINARY : TDSType.IMAGE;
                    collation = null;
                    break;
```

### ConstantValue
Condition `isShortValue` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        {
            // Handle Shiloh types here.
            if (isShortValue) {
                writeShort((short) DataTypes.SHORT_VARTYPE_MAX_BYTES);
            } else {
```

### ConstantValue
Condition `isShortValue` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                writeShort((short) -1); // actual len
            } else {
                if (isShortValue)
                    writeShort((short) nValueLen); // actual len
                else
```

### ConstantValue
Condition `charsRead < 0` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

                // Check for invalid bytesRead returned from Reader.read
                if (charsRead < 0 || charsRead > streamCharBuffer.length - charsToWrite) {
                    MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_errorReadingStream"));
                    Object[] msgArgs = {SQLServerException.getErrString("R_streamReadReturnedInvalidValue")};
```

### ConstantValue
Condition `addr.isUnresolved()` is always `true` when reached
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        // cannot be resolved, but that InetSocketAddress(host, port) does not - it sets
        // the returned InetSocketAddress as unresolved.
        if (addr != null && addr.isUnresolved()) {
            if (logger.isLoggable(Level.FINER)) {
                logger.finer(this.toString() + "Failed to resolve host name: " + hostName
```

### ConstantValue
Value `atEOM` is always 'true'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        // This flush() call ensures that all remaining data in the socket buffer is sent.
        if (atEOM) {
            flush(atEOM);
            isEOMSent = true;
            ++tdsChannel.numMsgsSent;
```

### ConstantValue
Condition `!isTDS8` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                    // then we can skip all of the KeyStore loading logic below.
                    // The security provider's implementation takes care of everything for us.
                    if (null == trustStoreFileName && null == con.encryptedTrustStorePassword && !isTDS8) {
                        if (logger.isLoggable(Level.FINER)) {
                            logger.finer(toString() + " Using system default trust store and password");
```

### ConstantValue
Condition `charsRead < 0` is always `false`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

                // Check for invalid bytesRead returned from Reader.read
                if (charsRead < 0 || charsRead > currentPacketSize - charsToWrite) {
                    MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_errorReadingStream"));
                    Object[] msgArgs = {SQLServerException.getErrString("R_streamReadReturnedInvalidValue")};
```

### ConstantValue
Condition `null != datagramSocket` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

            // send UDP packet
            assert null != datagramSocket;
            try {
                if (multiSubnetFailover) {
```

### ConstantValue
Condition `null != clientConnectionId` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            clientConnectionId = UUID.randomUUID();
        }
        assert null != clientConnectionId;

        if (isTDS8) {
```

### ConstantValue
Value `isTDS8` is always 'true'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        if (isTDS8) {
            tdsChannel.enableSSL(serverInfo.getParsedServerName(), serverInfo.getPortNumber(), clientCertificate,
                    clientKey, clientKeyPassword, isTDS8);
            clientKeyPassword = "";
        }
```

### ConstantValue
Condition `null != enclaveAttestationProtocol` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                        // An attestation protocol also requires column encryption
                        || (null != enclaveAttestationUrl && !enclaveAttestationUrl.isEmpty()
                                && (null != enclaveAttestationProtocol || !enclaveAttestationProtocol.isEmpty())
                                && (null == columnEncryptionSetting || !isColumnEncryptionSettingEnabled()))) {
                    throw new SQLServerException(SQLServerException.getErrString("R_enclavePropertiesError"), null);
```

### ConstantValue
Condition `null != enclaveAttestationProtocol || !enclaveAttestationProtocol.isEmpty()` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                        // An attestation protocol also requires column encryption
                        || (null != enclaveAttestationUrl && !enclaveAttestationUrl.isEmpty()
                                && (null != enclaveAttestationProtocol || !enclaveAttestationProtocol.isEmpty())
                                && (null == columnEncryptionSetting || !isColumnEncryptionSettingEnabled()))) {
                    throw new SQLServerException(SQLServerException.getErrString("R_enclavePropertiesError"), null);
```

### ConstantValue
Condition `null != passwordBytes` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        byte[] userBytes = toUCS16(sUser);
        byte[] passwordBytes = encryptPassword(sPwd);
        int passwordLen = (null != passwordBytes) ? passwordBytes.length : 0;
        byte[] appNameBytes = toUCS16(appName);
        byte[] serverNameBytes = toUCS16(serverName);
```

### ConstantValue
Condition `null != interfaceLibName` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

        // Interface library name
        assert null != interfaceLibName;
        tdsWriter.writeShort((short) (tdsLoginRequestBaseLength + dataLen));
        tdsWriter.writeShort((short) (interfaceLibName.length()));
```

### ConstantValue
Condition `routingServerName != null` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

                    routingServerName = tdsReader.readUnicodeString(routingServerNameLength);
                    assert routingServerName != null;

                } finally {
```

### ConstantValue
Condition `null != routingServerName` is always `true`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

                // skip the check for hostNameInCertificate if routingServerName is null
                if (null != currentHostName && currentHostName.startsWith("*") && (null != routingServerName)
                        && routingServerName.indexOf('.') != -1) {
                    char[] currentHostNameCharArray = currentHostName.toCharArray();
```

## RuleId[id=RedundantOperationOnEmptyContainer]
### RedundantOperationOnEmptyContainer
Collection `openStatements` is always empty
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                        try (Statement st = openStatements.get(0)) {}
                    }
                    openStatements.clear();
                }
                requestStarted = false;
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `statement`
in `src/main/java/com/microsoft/sqlserver/jdbc/ParameterMetaDataCache.java`
#### Snippet
```java
     * Returns the cache and enclave lookup keys for a given connection and statement
     * 
     * @param statement
     *        The SQLServer statement used to construct part of the keys
     * @param connection
```

### JavadocReference
Cannot resolve symbol `cekList`
in `src/main/java/com/microsoft/sqlserver/jdbc/ParameterMetaDataCache.java`
#### Snippet
```java
     * @param stmt
     *        SQLServer statement used to retrieve keys to find correct cache
     * @param cekList
     *        The list of CEKs (from the first RS) that is also added to the cache as well as parameter metadata
     * @param userSql
```

### JavadocReference
Cannot resolve symbol `stmt`
in `src/main/java/com/microsoft/sqlserver/jdbc/ParameterMetaDataCache.java`
#### Snippet
```java
     * Remove the cache entry.
     * 
     * @param stmt
     *        SQLServer statement used to retrieve keys
     * @param connection
```

### JavadocReference
Cannot resolve symbol `DataSource`
in `src/main/java/com/microsoft/sqlserver/jdbc/osgi/SQLServerDataSourceFactory.java`
#### Snippet
```java

    /**
     * Sets up the basic properties for {@link DataSource}s
     */
    private void setup(SQLServerDataSource source, Properties props) {
```

### JavadocReference
Cannot resolve symbol `Weigher`
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/package-info.java`
#### Snippet
```java
 * This package contains an implementation of a bounded {@link java.util.concurrent.ConcurrentMap} data structure.
 * <p>
 * {@link Weigher} is a simple interface for determining how many units of capacity an entry consumes. Depending on which concrete Weigher class is
 * used, an entry may consume a different amount of space within the cache. The {@link Weighers} class provides utility methods for obtaining the most
 * common kinds of implementations.
```

### JavadocReference
Cannot resolve symbol `Weighers`
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/package-info.java`
#### Snippet
```java
 * <p>
 * {@link Weigher} is a simple interface for determining how many units of capacity an entry consumes. Depending on which concrete Weigher class is
 * used, an entry may consume a different amount of space within the cache. The {@link Weighers} class provides utility methods for obtaining the most
 * common kinds of implementations.
 * <p>
```

### JavadocReference
Cannot resolve symbol `EvictionListener`
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/package-info.java`
#### Snippet
```java
 * common kinds of implementations.
 * <p>
 * {@link EvictionListener} provides the ability to be notified when an entry is evicted from the map. An eviction occurs when the entry was
 * automatically removed due to the map exceeding a capacity threshold. It is not called when an entry was explicitly removed.
 * <p>
```

### JavadocReference
Cannot resolve symbol `ConcurrentLinkedHashMap`
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/package-info.java`
#### Snippet
```java
 * automatically removed due to the map exceeding a capacity threshold. It is not called when an entry was explicitly removed.
 * <p>
 * The {@link ConcurrentLinkedHashMap} class supplies an efficient, scalable, thread-safe, bounded map. As with the
 * <code>Java Collections Framework</code> the "Concurrent" prefix is used to indicate that the map is not governed by a single exclusion lock.
 *
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                                + " convert(varchar(100), SERVERPROPERTY('ProductVersion')) as version, @@VERSION;";
                        try (Statement stmt = controlConnection.createStatement();
                                ResultSet rs = stmt.executeQuery(query);) {
                            serverInfoRetrieved = true;
                            rs.next();
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `checkClosed` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSQLXML.java`
#### Snippet
```java
                    null, true);
        try {
            contents.checkClosed();
        } catch (IOException e) {
            MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_isFreed"));
```

### DataFlowIssue
Method invocation `setResult` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSQLXML.java`
#### Snippet
```java

        outputStreamValue = new ByteArrayOutputStreamToInputStream();
        handler.setResult(new StreamResult(outputStreamValue));
        return new SAXResult(handler);
    }
```

### DataFlowIssue
Casting `object` to `PEMKeyPair` may produce `ClassCastException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCertificateUtils.java`
#### Snippet
```java
                kp = converter.getKeyPair(((PEMEncryptedKeyPair) object).decryptKeyPair(decProv));
            } else {
                kp = converter.getKeyPair((PEMKeyPair) object);
            }
            return kp.getPrivate();
```

### DataFlowIssue
Argument `key` might be null
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCertificateUtils.java`
#### Snippet
```java
            }

            ByteBuffer buff = ByteBuffer.wrap(key).order(ByteOrder.LITTLE_ENDIAN);
            ((Buffer) buff).position(RSA2_MAGIC.length); // skip the header

```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/com/microsoft/sqlserver/jdbc/AuthenticationJNI.java`
#### Snippet
```java
            System.loadLibrary(SQLServerDriver.AUTH_DLL_NAME);
            int[] pkg = new int[1];
            pkg[0] = 0;
            if (0 == SNISecInitPackage(pkg, authLogger)) {
                sspiBlobMaxlen = pkg[0];
```

### DataFlowIssue
Dereference of `encType` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/ISQLServerEnclaveProvider.java`
#### Snippet
```java
                    params[paramIndex].cryptoMeta = new CryptoMetadata(cekEntry, (short) cekOrdinal,
                            (byte) rs2.getInt(DescribeParameterEncryptionResultSet2.COLUMNENCRYPTIONALGORITHM.value()),
                            null, encType.value,
                            (byte) rs2.getInt(DescribeParameterEncryptionResultSet2.NORMALIZATIONRULEVERSION.value()));
                    // Decrypt the symmetric key.(This will also validate and throw if needed).
```

### DataFlowIssue
Argument `serverResponse` might be null
in `src/main/java/com/microsoft/sqlserver/jdbc/ISQLServerEnclaveProvider.java`
#### Snippet
```java
                    SQLServerResource.getResource("R_MalformedECDHPublicKey"), "0", false);
        }
        ByteBuffer sr = ByteBuffer.wrap(serverResponse);
        byte[] magic = new byte[8];
        sr.get(magic);
```

### DataFlowIssue
Dereference of `bytes` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBlob.java`
#### Snippet
```java
                    true);

        return setBytes(pos, bytes, 0, bytes.length);
    }

```

### DataFlowIssue
Dereference of `bytes` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBlob.java`
#### Snippet
```java

        // Offset must be within incoming bytes boundary.
        if (offset < 0 || offset > bytes.length) {
            MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_invalidOffset"));
            Object[] msgArgs = {offset};
```

### DataFlowIssue
Dereference of `bytes` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBlob.java`
#### Snippet
```java

        // len must be within incoming bytes boundary.
        if (len < 0 || len > bytes.length - offset) {
            MessageFormat form = new MessageFormat(SQLServerException.getErrString(R_INVALID_LENGTH));
            Object[] msgArgs = {len};
```

### DataFlowIssue
Argument `bytes` might be null
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBlob.java`
#### Snippet
```java

            // Copy rest of data.
            System.arraycopy(bytes, offset, combinedValue, (int) pos, len);
            value = combinedValue;
        } else {
```

### DataFlowIssue
Argument `bytes` might be null
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBlob.java`
#### Snippet
```java
        } else {
            // Overwrite internal to value case.
            System.arraycopy(bytes, offset, value, (int) pos, len);
        }

```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
            valueBytes = new byte[2];
            valueBytes[0] = (byte) scale;
            valueBytes[1] = 0; // data length
        } else {
            boolean isNegative = (bigDecimalVal.signum() < 0);
```

### DataFlowIssue
Unboxing of `d.peek()` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerParser.java`
#### Snippet
```java
                        break;
                    case SQLServerLexer.RR_BRACKET:
                        if (d.peek() == SQLServerLexer.LR_BRACKET) {
                            d.pop();
                        }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
                        openingParentheses++;
                    }
                    pos = -1;
                    while (-1 != (pos = closingStr.indexOf(')', pos + 1))) {
                        closingParentheses++;
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
                        indx++;
                        if (sql.length() > indx && '\'' == sql.charAt(indx)) {
                            nextState = State.QUOTE;
                        } else {
                            nextState = State.PROCESS;
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
                        }
                    } else {
                        nextState = State.QUOTE;
                    }
                    break;
```

### DataFlowIssue
Method invocation `getProperty` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAConnection.java`
#### Snippet
```java
            // if trustStorePassword is null at this point, then check the connection string.
            Properties urlProps = Util.parseUrl(ds.getURL(), xaLogger);
            trustStorePassword = urlProps.getProperty(SQLServerDriverStringProperty.TRUST_STORE_PASSWORD.toString());
        }

```

### DataFlowIssue
Method invocation `getProperty` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAConnection.java`
#### Snippet
```java
            Properties urlProps = Util.parseUrl(ds.getURL(), xaLogger);
            String clientKeyPassword = urlProps
                    .getProperty(SQLServerDriverStringProperty.CLIENT_KEY_PASSWORD.toString());

            if (null != clientKeyPassword) {
```

### DataFlowIssue
Method invocation `getContent` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSourceObjectFactory.java`
#### Snippet
```java
            }

            String className = (String) ra.getContent();

            if (null == className) {
```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
                // If we were given an input stream length that we had to match and
                // the actual stream length did not match then cancel the request.
                if (DataTypes.UNKNOWN_STREAM_LENGTH != readerLength && stringValue.length() != readerLength) {
                    MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_mismatchedStreamLength"));
                    Object[] msgArgs = {readerLength, stringValue.length()};
```

### DataFlowIssue
Argument `fileToParse` might be null
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCSVFileRecord.java`
#### Snippet
```java
        try {
            if (null == encoding || 0 == encoding.length()) {
                sr = new InputStreamReader(fileToParse);
            } else {
                sr = new InputStreamReader(fileToParse, encoding);
```

### DataFlowIssue
Argument `fileToParse` might be null
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCSVFileRecord.java`
#### Snippet
```java
                sr = new InputStreamReader(fileToParse);
            } else {
                sr = new InputStreamReader(fileToParse, encoding);
            }
            initFileReader(sr, encoding, delimiter, firstLineIsColumnNames);
```

### DataFlowIssue
Argument `fileToParse` might be null
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCSVFileRecord.java`
#### Snippet
```java
        try {
            // Create the file reader
            fis = new FileInputStream(fileToParse);
            if (null == encoding || 0 == encoding.length()) {
                sr = new InputStreamReader(fis);
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
        } catch (SQLServerException e) {
            // ignore the exception from the parse URL failure, if we cant parse the URL we do not accept em
            result = false;
        }
        loggerExternal.exiting(getClassNameLogging(), "acceptsURL", result);
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/com/microsoft/sqlserver/jdbc/tdsparser.java`
#### Snippet
```java
                    isFeatureExtAck = true;
                    tdsReader.getConnection().processFeatureExtAck(tdsReader);
                    parsing = true;
                    break;
                case TDS.TDS_ENV_CHG:
```

### DataFlowIssue
Dereference of `encType` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
                                    (byte) secondRs.getInt(
                                            DescribeParameterEncryptionResultSet2.COLUMNENCRYPTIONALGORITHM.value()),
                                    null, encType.value, (byte) secondRs.getInt(
                                            DescribeParameterEncryptionResultSet2.NORMALIZATIONRULEVERSION.value()));

```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
            }
            typeDefinitions[i] = typeDefinition;
            stringLen += typeDefinition.length();

            // While we are getting type definitions, check if the params are output and extend the builder if so.
```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
                                int columnIndex = columnList.indexOf(c.getColumnName());
                                if (columnIndex > -1) {
                                    columnMappings.put(columnIndex + 1, i);
                                    batchRecord.addColumnMetadata(columnIndex + 1, c.getColumnName(), jdbctype,
                                            ti.getPrecision(), ti.getScale());
```

### DataFlowIssue
Unboxing of `matchPos` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCallableStatement.java`
#### Snippet
```java
        // @p1 is index 2 otherwise its index 1.
        if (bReturnValueSyntax) // 3.2717
            return matchPos + 1;
        else
            return matchPos;
```

### DataFlowIssue
Unboxing of `matchPos` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCallableStatement.java`
#### Snippet
```java
            return matchPos + 1;
        else
            return matchPos;
    }

```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java
                    true);

        return setString(pos, s, 0, s.length());
    }

```

### DataFlowIssue
Argument `value` might be null
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java
            getterStream = new BufferedReader(new InputStreamReader(inputStream, cs));
        } else {
            getterStream = new StringReader(value);
        }
        activeStreams.add(getterStream);
```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java

        // Offset must be within incoming string str boundary.
        if (offset < 0 || offset > str.length()) {
            MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_invalidOffset"));
            Object[] msgArgs = {offset};
```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java

        // len must be within incoming string str boundary.
        if (len < 0 || len > str.length() - offset) {
            MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_invalidLength"));
            Object[] msgArgs = {len};
```

### DataFlowIssue
Method invocation `substring` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java

            // Append the new value
            sb.append(str.substring(offset, offset + len));

            // Use the combined string as the new value
```

### DataFlowIssue
Method invocation `substring` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java

            // Append the new value
            sb.append(str.substring(offset, offset + len));

            // Append the remainder of the original value
```

### DataFlowIssue
Method invocation `isUpdatable` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        }

        assert tableColumn.isUpdatable();
        assert null != tableColumn.getTableName();

```

### DataFlowIssue
Method invocation `trim` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
        }

        destinationTableName = tableName.trim();

        loggerExternal.exiting(loggerClassName, "setDestinationTableName");
```

### DataFlowIssue
Method invocation `toUpperCase` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java

            String destType = getDestTypeFromSrcType(colMapping.sourceColumnOrdinal,
                    colMapping.destinationColumnOrdinal, tdsWriter).toUpperCase(Locale.ENGLISH);
            if (null != columnCollation && columnCollation.trim().length() > 0) {
                // we are adding collate in command only for char and varchar
```

### DataFlowIssue
Method invocation `isBeforeFirst` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                          // alternate check instead.
            {
                if (!sourceData.isBeforeFirst()) {
                    sourceData.beforeFirst();
                }
```

### DataFlowIssue
Method invocation `isClosed` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                }
            } else {
                if (sourceData.isClosed()) {
                    SQLServerException.makeFromDriverError(null, null,
                            SQLServerException.getErrString("R_resultsetClosed"), null, false);
```

### DataFlowIssue
Dereference of `inetAddrs` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                loggingString.append(". They are: ");

                for (InetAddress inetAddr : inetAddrs) {
                    loggingString.append(inetAddr.toString()).append(";");
                }
```

### DataFlowIssue
Argument `inetAddrs` might be null
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                    logger.finer(this.toString() + "Using Java NIO with timeout:" + timeoutInMilliSeconds);
                }
                findSocketUsingJavaNIO(inetAddrs, portNumber, timeoutInMilliSeconds);
            } else {
                if (logger.isLoggable(Level.FINER)) {
```

### DataFlowIssue
Argument `inetAddrs` might be null
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                    logger.finer(this.toString() + "Using Threading with timeout:" + timeoutInMilliSeconds);
                }
                findSocketUsingThreading(inetAddrs, portNumber, timeoutInMilliSeconds);
            }

```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

        // Fill any remaining space in the staging buffer
        remaining = stagingBuffer.remaining();
        if (remaining > 0) {
            stagingBuffer.put(value, 0, remaining);
```

### DataFlowIssue
Argument `addr` might be null
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        }

        return getConnectedSocket(addr, timeoutInMilliSeconds);
    }

```

### DataFlowIssue
Argument `fedAuthFeatureExtensionData` might be null
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        len += writeAEFeatureRequest(false, tdsWriter);
        if (federatedAuthenticationInfoRequested || federatedAuthenticationRequested) {
            len = len + writeFedAuthFeatureRequest(false, tdsWriter, fedAuthFeatureExtensionData);
        }

```

### DataFlowIssue
Dereference of `secBlob` may produce `NullPointerException`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        } else {
            tdsWriter.writeShort((short) (tdsLoginRequestBaseLength + dataLen));
            if (uShortMax <= secBlob.length) {
                tdsWriter.writeShort((short) (uShortMax));
            } else {
```

### DataFlowIssue
Argument `secBlob` might be null
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        // SSPI data
        if (integratedSecurity) {
            tdsWriter.writeBytes(secBlob, 0, secBlob.length);
        }

```

### DataFlowIssue
Argument `fedAuthFeatureExtensionData` might be null
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

        if (federatedAuthenticationInfoRequested || federatedAuthenticationRequested) {
            writeFedAuthFeatureRequest(true, tdsWriter, fedAuthFeatureExtensionData);
        }

```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerParser.java`
#### Snippet
```java
                        }
                    }
                    d.stream().forEach(sb::append);
                }
            } else {
```

## RuleId[id=MissingSerialAnnotation]
### MissingSerialAnnotation
`writeReplace()` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnectionPoolDataSource.java`
#### Snippet
```java
     *         if error
     */
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new SerializationProxy(this);
    }
```

### MissingSerialAnnotation
`readObject()` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnectionPoolDataSource.java`
#### Snippet
```java
     *         if error
     */
    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("");
    }
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnectionPoolDataSource.java`
#### Snippet
```java
    private static class SerializationProxy implements java.io.Serializable {
        private final Reference ref;
        private static final long serialVersionUID = 654661379842314126L;

        SerializationProxy(SQLServerConnectionPoolDataSource ds) {
```

### MissingSerialAnnotation
`readResolve()` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnectionPoolDataSource.java`
#### Snippet
```java
        }

        private Object readResolve() {
            SQLServerConnectionPoolDataSource ds = new SQLServerConnectionPoolDataSource();
            ds.initializeFromReference(ref);
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/ServerPortPlaceHolder.java`
#### Snippet
```java
     * Always update serialVersionUID when prompted.
     */
    private static final long serialVersionUID = 7393779415545731523L;

    private final String serverName;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPooledConnection.java`
#### Snippet
```java
     * Always update serialVersionUID when prompted.
     */
    private static final long serialVersionUID = 3492921646187451164L;

    /** listeners */
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerError.java`
#### Snippet
```java
     * Always update serialVersionUID when prompted
     */
    private static final long serialVersionUID = -7304033613218700719L;

    /** error message string */
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBlob.java`
#### Snippet
```java
     * Always refresh SerialVersionUID when prompted
     */
    private static final long serialVersionUID = -3526170228097889085L;

    // Error messages
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/microsoft/sql/DateTimeOffset.java`
#### Snippet
```java
        }

        private static final long serialVersionUID = 664661379547314226L;

        private Object readResolve() {
```

### MissingSerialAnnotation
`writeReplace()` can be annotated with '@Serial' annotation
in `src/main/java/microsoft/sql/DateTimeOffset.java`
#### Snippet
```java
     * @return serialization proxy
     */
    private Object writeReplace() {
        return new SerializationProxy(this);
    }
```

### MissingSerialAnnotation
`readObject()` can be annotated with '@Serial' annotation
in `src/main/java/microsoft/sql/DateTimeOffset.java`
#### Snippet
```java
     *         if error
     */
    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        // For added security/robustness, the only way to rehydrate a serialized DateTimeOffset
        // is to use a SerializationProxy. Direct use of readObject() is not supported.
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/microsoft/sql/DateTimeOffset.java`
#### Snippet
```java
 */
public final class DateTimeOffset implements java.io.Serializable, java.lang.Comparable<DateTimeOffset> {
    private static final long serialVersionUID = 541973748553014280L;

    /** UTC ms */
```

### MissingSerialAnnotation
`readResolve()` can be annotated with '@Serial' annotation
in `src/main/java/microsoft/sql/DateTimeOffset.java`
#### Snippet
```java
        private static final long serialVersionUID = 664661379547314226L;

        private Object readResolve() {
            java.sql.Timestamp timestamp = new java.sql.Timestamp(utcMillis);
            timestamp.setNanos(nanos);
```

### MissingSerialAnnotation
`readObject()` can be annotated with '@Serial' annotation
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
  }

  private void readObject(ObjectInputStream stream) throws InvalidObjectException {
    throw new InvalidObjectException("Proxy required");
  }
```

### MissingSerialAnnotation
`writeReplace()` can be annotated with '@Serial' annotation
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
    }

    Object writeReplace() {
      return new SimpleEntry<K, V>(this);
    }
```

### MissingSerialAnnotation
`writeReplace()` can be annotated with '@Serial' annotation
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
  static final long serialVersionUID = 1;

  Object writeReplace() {
    return new SerializationProxy<K, V>(this);
  }
```

### MissingSerialAnnotation
`writeReplace()` can be annotated with '@Serial' annotation
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
    }

    Object writeReplace() {
      return weigher;
    }
```

### MissingSerialAnnotation
`readResolve()` can be annotated with '@Serial' annotation
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
    }

    Object readResolve() {
      ConcurrentLinkedHashMap<K, V> map = new Builder<K, V>()
          .concurrencyLevel(concurrencyLevel)
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXADataSource.java`
#### Snippet
```java
    private static class SerializationProxy implements java.io.Serializable {
        private final Reference ref;
        private static final long serialVersionUID = 454661379842314126L;

        SerializationProxy(SQLServerXADataSource ds) {
```

### MissingSerialAnnotation
`writeReplace()` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXADataSource.java`
#### Snippet
```java
     *         if error
     */
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new SerializationProxy(this);
    }
```

### MissingSerialAnnotation
`readResolve()` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXADataSource.java`
#### Snippet
```java
        }

        private Object readResolve() {
            SQLServerXADataSource ds = new SQLServerXADataSource();
            ds.initializeFromReference(ref);
```

### MissingSerialAnnotation
`readObject()` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXADataSource.java`
#### Snippet
```java
     *         if error
     */
    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("");
    }
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnectionPoolProxy.java`
#### Snippet
```java
     * Always refresh SerialVersionUID when prompted
     */
    private static final long serialVersionUID = 5752599482349578127L;

    private SQLServerConnection wrappedConnection;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
    private static class SerializationProxy implements java.io.Serializable {
        private final Reference ref;
        private static final long serialVersionUID = 654661379542314226L;

        SerializationProxy(SQLServerDataSource ds) {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
     * Always refresh SerialVersionUID when prompted
     */
    private static final long serialVersionUID = 654861379544314296L;

    /**
```

### MissingSerialAnnotation
`readResolve()` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
        }

        private Object readResolve() {
            SQLServerDataSource ds = new SQLServerDataSource();
            ds.initializeFromReference(ref);
```

### MissingSerialAnnotation
`writeReplace()` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
     *         if error
     */
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new SerializationProxy(this);
    }
```

### MissingSerialAnnotation
`readObject()` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
     *         if error
     */
    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("");
    }
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkBatchInsertRecord.java`
#### Snippet
```java
     * Update serialVersionUID when making changes to this file
     */
    private static final long serialVersionUID = -955998113956445541L;

    private transient List<Parameter[]> batchParam;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerNClob.java`
#### Snippet
```java
     * Always refresh SerialVersionUID when prompted
     */
    private static final long serialVersionUID = 3593610902551842327L;

    // Loggers should be class static to avoid lock contention with multiple
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSavepoint.java`
#### Snippet
```java
     * Always update serialVersionUID when prompted.
     */
    private static final long serialVersionUID = 1857415943191289598L;

    /** sName */
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     * Always update serialVersionUID when prompted.
     */
    private static final long serialVersionUID = -4421134713913331507L;

    final static char LEFT_CURLY_BRACKET = 123;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
         * Always update serialVersionUID when prompted.
         */
        private static final long serialVersionUID = 4534132352812876292L;
        final SQLServerStatement stmt;
        final String sql;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
         * Always update serialVersionUID when prompted.
         */
        private static final long serialVersionUID = -4621631860790243331L;
        final SQLServerStatement stmt;

```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/DLLException.java`
#### Snippet
```java
 */
class DLLException extends Exception {
    private static final long serialVersionUID = -4498171382218222079L;
    // category status and state are always either -1 or a positive number
    // Internal Adal error category used in retry logic and building error message in managed code
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/AE.java`
#### Snippet
```java
     * Always update serialVersionUID when prompted.
     */
    private static final long serialVersionUID = -4568542970907052239L;

    private transient CekTableEntry[] keyList;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAConnection.java`
#### Snippet
```java
     * Always update serialVersionUID when prompted.
     */
    private static final long serialVersionUID = -8154621218821899459L;

    /**
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
     * Always refresh SerialVersionUID when prompted
     */
    private static final long serialVersionUID = 6641910171379986768L;

    private int maxLength; // Max length of data
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection43.java`
#### Snippet
```java
     * Always refresh SerialVersionUID when prompted.
     */
    private static final long serialVersionUID = -6904163521498951547L;

    SQLServerConnection43(String parentInfo) throws SQLServerException {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCSVFileRecord.java`
#### Snippet
```java
     * Update serialVersionUID when making changes to this file
     */
    private static final long serialVersionUID = 1546487135640225989L;

    /**
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLCollation.java`
#### Snippet
```java
     * 
     */
    private static final long serialVersionUID = 6748833280721312349L;

    private final int info; // First 4 bytes of TDS collation.
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkRecord.java`
#### Snippet
```java
     * Update serialVersionUID when making changes to this file
     */
    private static final long serialVersionUID = -170992637946357449L;

    /*
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
                     * Always update serialVersionUID when prompted.
                     */
                    private static final long serialVersionUID = -8944096664249990764L;

                    PreparedHandleClose() {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
     * Always update serialVersionUID when prompted.
     */
    private static final long serialVersionUID = -6292257029445685221L;

    /** delimiter for multiple statements in a single batch */
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
         * Always update serialVersionUID when prompted.
         */
        private static final long serialVersionUID = 4098801171124750861L;

        private final SQLServerPreparedStatement stmt;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
         * Always update serialVersionUID when prompted.
         */
        private static final long serialVersionUID = 5225705304799552318L;

        private final SQLServerPreparedStatement stmt;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SqlAuthenticationToken.java`
#### Snippet
```java

    /** Always update serialVersionUID when prompted **/
    private static final long serialVersionUID = -1343105491285383937L;

    /** The token expiration date. **/
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerException.java`
#### Snippet
```java
     * Always update serialVersionUID when prompted
     */
    private static final long serialVersionUID = -2195310557661496761L;
    static final String EXCEPTION_XOPEN_CONNECTION_CANT_ESTABLISH = "08001";
    static final String EXCEPTION_XOPEN_CONNECTION_DOES_NOT_EXIST = "08003";
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerLob.java`
#### Snippet
```java
     * Always update serialVersionUID when prompted.
     */
    private static final long serialVersionUID = -6444654924359581662L;

    /**
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/ScrollWindow.java`
#### Snippet
```java
     * Always update serialVersionUID when prompted.
     */
    private static final long serialVersionUID = 3028807583846251111L;

    /** Set of marks for the rows in the window */
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopyOptions.java`
#### Snippet
```java
     * Update serialVersionUID when making changes to this file
     */
    private static final long serialVersionUID = 711570696894155194L;

    /**
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCallableStatement.java`
#### Snippet
```java
     * Always update serialVersionUID when prompted.
     */
    private static final long serialVersionUID = 5044984771674532350L;

    private static final String GET_TIMESTAMP = "getTimestamp";
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java
     * Always refresh SerialVersionUID when prompted
     */
    private static final long serialVersionUID = 2872035282200133865L;

    // Loggers should be class static to avoid lock contention with multiple
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java
     * Always refresh SerialVersionUID when prompted
     */
    private static final long serialVersionUID = 8691072211054430124L;

    // The value of the CLOB that this Clob object represents.
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SharedTimer.java`
#### Snippet
```java
     * Always update serialVersionUID when prompted
     */
    private static final long serialVersionUID = -4069361613863955760L;

    static final String CORE_THREAD_PREFIX = "mssql-jdbc-shared-timer-core-";
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSetMetaData.java`
#### Snippet
```java
     * Always update serialVersionUID when prompted.
     */
    private static final long serialVersionUID = -5747558730471411712L;

    /** connection */
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
     * Always update serialVersionUID when prompted.
     */
    private static final long serialVersionUID = -116977606028371577L;

    /** connection */
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
                 * Always update serialVersionUID when prompted.
                 */
                private static final long serialVersionUID = 1L;

                CloseServerCursorCommand() {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
             * Always update serialVersionUID when prompted.
             */
            private static final long serialVersionUID = 1L;

            DeleteRowRPC() {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
             * Always update serialVersionUID when prompted.
             */
            private static final long serialVersionUID = 1L;
            final String tableName;

```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
             * Always update serialVersionUID when prompted.
             */
            private static final long serialVersionUID = 1L;

            UpdateRowRPC() {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
         * Always update serialVersionUID when prompted.
         */
        private static final long serialVersionUID = 1L;
        private final int serverCursorId;
        private int fetchType;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
     * Always refresh SerialVersionUID when prompted
     */
    private static final long serialVersionUID = -1624082547992040463L;

    /**
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
         * Always update serialVersionUID when prompted.
         */
        private static final long serialVersionUID = 6428337550654423919L;

        String sourceColumnName = null;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
             * Always update serialVersionUID when prompted.
             */
            private static final long serialVersionUID = 6714118105257791547L;

            InsertBulk() {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
     * Update serialVersionUID when making changes to this file
     */
    private static final long serialVersionUID = 1989903904654306244L;

    private static final String MAX = "(max)";
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * Always update serialVersionUID when prompted.
     */
    private static final long serialVersionUID = 5485075546328951857L;

    abstract boolean doExecute() throws SQLServerException;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * Always update serialVersionUID when prompted.
     */
    private static final long serialVersionUID = -866497813437384090L;

    private static final Logger logger = Logger.getLogger("com.microsoft.sqlserver.jdbc.internals.TDS.Channel");
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * Always update serialVersionUID when prompted.
     */
    private static final long serialVersionUID = -6457195977162963793L;

    UninterruptableTDSCommand(String logContext) {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * Always update serialVersionUID when prompted.
     */
    private static final long serialVersionUID = -392905303734809731L;

    private static final Logger logger = Logger.getLogger("com.microsoft.sqlserver.jdbc.internals.TDS.Reader");
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
         * Always update serialVersionUID when prompted
         */
        private static final long serialVersionUID = -6709861741957202475L;
        boolean fedAuthRequiredPreLoginResponse;
        int libraryType = -1;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
             * Always update serialVersionUID when prompted.
             */
            private static final long serialVersionUID = 1L;
            final String sql;

```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
         * Always refresh SerialVersionUID when prompted
         */
        private static final long serialVersionUID = 166788428640603097L;
        String unhashedString;
        private long[] segments;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * Always refresh SerialVersionUID when prompted
     */
    private static final long serialVersionUID = 1965647556064751510L;

    /**
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
    private final class LogonCommand extends UninterruptableTDSCommand {
        // Always update serialVersionUID when prompted.
        private static final long serialVersionUID = 1L;

        LogonCommand() {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
             * Always update serialVersionUID when prompted.
             */
            private static final long serialVersionUID = 1L;
            private final int requestType;
            private final byte[] payload;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
    final class FedAuthTokenCommand extends UninterruptableTDSCommand {
        // Always update serialVersionUID when prompted.
        private static final long serialVersionUID = 1L;
        transient TDSTokenHandler tdsTokenHandler = null;
        SqlAuthenticationToken sqlFedAuthToken = null;
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary arguments
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSQLXML.java`
#### Snippet
```java

        byte[] byteContents = contents.getBytes();
        return new String(byteContents, 0, byteContents.length, Encoding.UNICODE.charset());
    }

```

### StringOperationCanBeSimplified
`new String()` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/TVP.java`
#### Snippet
```java
            throw new SQLServerException(null, form.format(new Object[] {}), null, 0, false);
        }
        ary[position] = new String();
        return position;
    }
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `src/main/java/com/microsoft/sqlserver/jdbc/FailOverInfo.java`
#### Snippet
```java
                if (con.getConnectionLogger().isLoggable(Level.FINE))
                    con.getConnectionLogger().fine(con.toString() + " Failover server :" + failoverPartner);
                instanceValue = failoverPartner.substring(px + 1, failoverPartner.length());
                failoverPartner = failoverPartner.substring(0, px);
                con.validateMaxSQLLoginName(SQLServerDriverStringProperty.INSTANCE_NAME.toString(), instanceValue);
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
        int index = 0;
        while ((index = str.indexOf("" + marker)) >= 0) {
            str = str.substring(0, index) + replaceStr + str.substring(index + 1, str.length());
        }
        return str;
```

### StringOperationCanBeSimplified
Unnecessary arguments
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
            case NVARCHARMAX:
                try {
                    String strVal = new String(decryptedValue, 0, decryptedValue.length,
                            (null == baseTypeInfo.getCharset()) ? con.getDatabaseCollation().getCharset()
                                                                : baseTypeInfo.getCharset());
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
            // we've found a ] that is actually trying to close the square bracket.
            // return tablename + potentially more that's part of the table name
            sb.append(localUserSQL.substring(0, tempint + 1));
            localUserSQL = localUserSQL.substring(tempint + 1);
            return sb.toString() + parseUserSQLForTableNameDW(true, true, true, false);
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
            // we've found a " that is actually trying to close the quote.
            // return tablename + potentially more that's part of the table name
            sb.append(localUserSQL.substring(0, tempint + 1));
            localUserSQL = localUserSQL.substring(tempint + 1);
            return sb.toString() + parseUserSQLForTableNameDW(true, true, true, false);
```

### StringOperationCanBeSimplified
`toString()` call can be replaced with 'contentEquals()'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
                if (localUserSQL.charAt(0) == ',') {
                    localUserSQL = localUserSQL.substring(1);
                    if (!"?".equals(sb.toString())) {
                        // throw IllegalArgumentException and fallback to original logic for batch insert
                        throw new IllegalArgumentException(SQLServerException.getErrString("R_onlyFullParamAllowed"));
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java
            // Start with the original value, up to the starting position
            StringBuilder sb = new StringBuilder((int) pos + len);
            sb.append(value.substring(0, (int) pos));

            // Append the new value
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java

            // Append the new value
            sb.append(str.substring(offset, offset + len));

            // Use the combined string as the new value
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java
            // Start with the original value, up to the starting position
            StringBuilder sb = new StringBuilder(value.length());
            sb.append(value.substring(0, (int) pos));

            // Append the new value
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java

            // Append the new value
            sb.append(str.substring(offset, offset + len));

            // Append the remainder of the original value
```

### StringOperationCanBeSimplified
Unnecessary zero argument
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java

                case microsoft.sql.Types.DATETIMEOFFSET:
                    int endIndx = valueStr.indexOf('-', 0);
                    int year = Integer.parseInt(valueStr.substring(0, endIndx));

```

### StringOperationCanBeSimplified
`new String()` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                    byte[] charBytes;
                    for (int charsCopied = 0; charsCopied < charsToWrite; ++charsCopied) {
                        charBytes = new String(streamCharBuffer[charsCopied] + "").getBytes(charSet);
                        System.arraycopy(charBytes, 0, streamByteBuffer, bytesToWrite, charBytes.length);
                        bytesToWrite += charBytes.length;
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                // found the instance name with the servername
                if (px >= 0) {
                    instanceValue = sPropValue.substring(px + 1, sPropValue.length());
                    validateMaxSQLLoginName(instanceNameProperty, instanceValue);
                    sPropValue = sPropValue.substring(0, px);
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'ISQLServerBulkRecord' is still used
in `src/main/java/com/microsoft/sqlserver/jdbc/ISQLServerBulkRecord.java`
#### Snippet
```java
 */
@Deprecated(since = "8.1.0")
public interface ISQLServerBulkRecord extends ISQLServerBulkData {
    /**
     * Returns whether the column represents an identity column.
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
                Integer.toString(Integer.MAX_VALUE).length(), // precision (max unscaled numeric precision, in decimal
                                                              // digits)
                ("-" + "." + Integer.toString(Integer.MAX_VALUE)).length(), // column display size (includes sign and
                                                                            // decimal for scale)
                4) // scale
```

### UnnecessaryCallToStringValueOf
Unnecessary `Long.toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
        MONEY(TDSType.MONEY8, new FixedLenStrategy(SSType.MONEY, 8, // TDS length (bytes)
                Long.toString(Long.MAX_VALUE).length(), // precision (max unscaled numeric precision, in decimal digits)
                ("-" + "." + Long.toString(Long.MAX_VALUE)).length(), // column display size (includes sign and decimal
                                                                      // for scale)
                4) // scale
```

### UnnecessaryCallToStringValueOf
Unnecessary `Short.toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
        SMALLINT(TDSType.INT2, new FixedLenStrategy(SSType.SMALLINT, 2, // TDS length (bytes)
                Short.toString(Short.MAX_VALUE).length(), // precision (max numeric precision, in decimal digits)
                ("-" + Short.toString(Short.MAX_VALUE)).length(), // column display size (includes sign)
                0) // scale
        ),
```

### UnnecessaryCallToStringValueOf
Unnecessary `Long.toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
        BIGINT(TDSType.INT8, new FixedLenStrategy(SSType.BIGINT, 8, // TDS length (bytes)
                Long.toString(Long.MAX_VALUE).length(), // precision (max numeric precision, in decimal digits)
                ("-" + Long.toString(Long.MAX_VALUE)).length(), // column display size (includes sign)
                0) // scale
        ),
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
                typeInfo.setPrecision(precision);
                scale = 4;
                typeInfo.setDisplaySize(("-" + "." + Integer.toString(Integer.MAX_VALUE)).length());
                typeInfo.setScale(scale);
                internalVariant.setPrecision(precision);
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
                scale = 4;
                typeInfo.setPrecision(precision);
                typeInfo.setDisplaySize(("-" + "." + Integer.toString(Integer.MAX_VALUE)).length());
                typeInfo.setScale(scale);
                internalVariant.setPrecision(precision);
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
        INTEGER(TDSType.INT4, new FixedLenStrategy(SSType.INTEGER, 4, // TDS length (bytes)
                Integer.toString(Integer.MAX_VALUE).length(), // precision (max numeric precision, in decimal digits)
                ("-" + Integer.toString(Integer.MAX_VALUE)).length(), // column display size (includes sign)
                0) // scale
        ),
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`iterator` can be replaced with 'Collections.emptyIterator()'
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
    @Override public Object peek() { return null; }
    @Override public int size() { return 0; }
    @Override public Iterator<Object> iterator() { return emptyList().iterator(); }
  }

```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    static int getValueLengthBaseOnJavaType(Object value, JavaType javaType, Integer precision, Integer scale,
            JDBCType jdbcType) throws SQLServerException {
        switch (javaType) {
            // when the value of setObject() is null, the javaType stays
            // as OBJECT. We need to get the javaType base on jdbcType
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
        // Add as needed here for future XAER_RMFAIL exceptions
        if (root instanceof SocketException) {
            switch (err) {
                case CONN_RESET:
                    return true;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                case TINYINT:
                case SMALLINT:
                    switch (srcJdbcType) {
                        case BIT:
                            longValue = (long) ((Boolean) value ? 1 : 0);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
        switch (jdbcType) {
            case CHAR:
                return JDBCType.NCHAR;
            case VARCHAR:
                return JDBCType.NVARCHAR;
            case LONGVARCHAR:
                return JDBCType.LONGNVARCHAR;
            case CLOB:
                return JDBCType.NCLOB;
            default:
                return jdbcType;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/microsoft/sqlserver/jdbc/Geography.java`
#### Snippet
```java
        if (null == wktNoZM) {
            buffer = ByteBuffer.wrap(clr);
            buffer.order(ByteOrder.LITTLE_ENDIAN);

            parseClr(this);

            wktSb = new StringBuffer();
            wktSbNoZM = new StringBuffer();
            constructWKT(this, internalType, numberOfPoints, numberOfFigures, numberOfSegments, numberOfShapes);
            wktNoZM = wktSbNoZM.toString();
        }
        return wktNoZM;
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionAzureKeyVaultProvider.java`
#### Snippet
```java
        byte[] cipherText = new byte[cipherTextLength];
        System.arraycopy(encryptedColumnEncryptionKey, currentIndex, cipherText, 0, cipherTextLength);
        currentIndex += cipherTextLength;

        // Get signature
        byte[] signature = new byte[signatureLength];
        System.arraycopy(encryptedColumnEncryptionKey, currentIndex, signature, 0, signatureLength);

        // Compute the hash to validate the signature
        byte[] hash = new byte[encryptedColumnEncryptionKey.length - signature.length];

        System.arraycopy(encryptedColumnEncryptionKey, 0, hash, 0,
                encryptedColumnEncryptionKey.length - signature.length);
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionAzureKeyVaultProvider.java`
#### Snippet
```java
        short shortVal;
        if (index + 1 >= input.length) {
            throw new SQLServerException(null, SQLServerException.getErrString("R_ByteToShortConversion"), null, 0,
                    false);
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(2);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(input[index]);
        byteBuffer.put(input[index + 1]);
        shortVal = byteBuffer.getShort(0);
        return shortVal;
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                            if (0 == valueLength) {
                                // Workaround for the issue when inserting empty string and null into encrypted columns
                                param.typeDefinition = SSType.NVARCHAR.toString() + "(1)";
                                valueLength++;
                            } else {
                                param.typeDefinition = SSType.NVARCHAR.toString() + "(" + valueLength + ")";

                                if (DataTypes.SHORT_VARTYPE_MAX_BYTES <= valueLength) {
                                    param.typeDefinition = NVARCHAR_MAX;
                                }
                            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                    int bytesRead = 0;

                    try {
                        bufferedStream.mark(vartypeBytes.length);

                        bytesRead = bufferedStream.read(vartypeBytes, 0, vartypeBytes.length);

                        if (-1 == bytesRead)
                            bytesRead = 0;

                        bufferedStream.reset();
                    } catch (IOException e) {
                        MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_errorReadingStream"));
                        Object[] msgArgs = {e.toString()};
                        SQLServerException.makeFromDriverError(null, null, form.format(msgArgs), "", true);
                    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAASEnclaveProvider.java`
#### Snippet
```java
        ArrayList<byte[]> b = describeParameterEncryption(connection, statement, userSql, preparedTypeDefinitions,
                params, parameterNames);
        if (connection.enclaveEstablished()) {
            return b;
        } else if (null != hgsResponse && !connection.enclaveEstablished()) {
            try {
                enclaveSession = new EnclaveSession(hgsResponse.getSessionID(),
                        aasParams.createSessionSecret(hgsResponse.getDHpublicKey()));
                enclaveCache.addEntry(connection.getServerName(), connection.getCatalog(),
                        connection.enclaveAttestationUrl, aasParams, enclaveSession);
            } catch (GeneralSecurityException e) {
                SQLServerException.makeFromDriverError(connection, this, e.getLocalizedMessage(), "0", false);
            }
        }
        return b;
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBlob.java`
#### Snippet
```java
        checkClosed();

        getBytesFromStream();
        if (start < 1) {
            MessageFormat form = new MessageFormat(SQLServerException.getErrString(R_INVALID_POSITION_INDEX));
            Object[] msgArgs = {start};
            SQLServerException.makeFromDriverError(con, null, form.format(msgArgs), null, true);
        }

        if (null == pattern)
            return -1;
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkBatchInsertRecord.java`
#### Snippet
```java
        String colName = "";

        if (0 >= positionInSource) {
            MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_invalidColumnOrdinal"));
            Object[] msgArgs = {positionInSource};
            throw new SQLServerException(form.format(msgArgs), SQLState.COL_NOT_FOUND, DriverError.NOT_SET, null);
        }

        if (null != name)
            colName = name.trim();
        else if ((null != columnNames) && (columnNames.length >= positionInSource))
            colName = columnNames[positionInSource - 1];

        if ((null != columnNames) && (positionInSource > columnNames.length)) {
            MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_invalidColumn"));
            Object[] msgArgs = {positionInSource};
            throw new SQLServerException(form.format(msgArgs), SQLState.COL_NOT_FOUND, DriverError.NOT_SET, null);
        }

        checkDuplicateColumnName(positionInSource, name);
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java
        checkClosed();

        getStringFromStream();
        if (start < 1) {
            MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_invalidPositionIndex"));
            Object[] msgArgs = {start};
            SQLServerException.makeFromDriverError(con, null, form.format(msgArgs), null, true);
        }

        if (null == searchstr)
            return -1;
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionAzureKeyVaultProvider.java`
#### Snippet
```java
        byte[] dataToHash = new byte[version.length + keyPathLength.length + cipherTextLength.length
                + masterKeyPathBytes.length + cipherText.length];
        int destinationPosition = version.length;
        System.arraycopy(version, 0, dataToHash, 0, version.length);

        System.arraycopy(keyPathLength, 0, dataToHash, destinationPosition, keyPathLength.length);
        destinationPosition += keyPathLength.length;

        System.arraycopy(cipherTextLength, 0, dataToHash, destinationPosition, cipherTextLength.length);
        destinationPosition += cipherTextLength.length;

        System.arraycopy(masterKeyPathBytes, 0, dataToHash, destinationPosition, masterKeyPathBytes.length);
        destinationPosition += masterKeyPathBytes.length;

        System.arraycopy(cipherText, 0, dataToHash, destinationPosition, cipherText.length);
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionAzureKeyVaultProvider.java`
#### Snippet
```java
        int encryptedColumnEncryptionKeyLength = version.length + cipherTextLength.length + keyPathLength.length
                + cipherText.length + masterKeyPathBytes.length + signedHash.length;
        byte[] encryptedColumnEncryptionKey = new byte[encryptedColumnEncryptionKeyLength];

        // Copy version byte
        int currentIndex = 0;
        System.arraycopy(version, 0, encryptedColumnEncryptionKey, currentIndex, version.length);
        currentIndex += version.length;

        // Copy key path length
        System.arraycopy(keyPathLength, 0, encryptedColumnEncryptionKey, currentIndex, keyPathLength.length);
        currentIndex += keyPathLength.length;

        // Copy ciphertext length
        System.arraycopy(cipherTextLength, 0, encryptedColumnEncryptionKey, currentIndex, cipherTextLength.length);
        currentIndex += cipherTextLength.length;

        // Copy key path
        System.arraycopy(masterKeyPathBytes, 0, encryptedColumnEncryptionKey, currentIndex, masterKeyPathBytes.length);
        currentIndex += masterKeyPathBytes.length;

        // Copy ciphertext
        System.arraycopy(cipherText, 0, encryptedColumnEncryptionKey, currentIndex, cipherText.length);
        currentIndex += cipherText.length;

        // copy the signature
        System.arraycopy(signedHash, 0, encryptedColumnEncryptionKey, currentIndex, signedHash.length);
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerMSAL4JUtils.java`
#### Snippet
```java
            final IAuthenticationResult authenticationResult = future.get();

            if (logger.isLoggable(Level.FINEST)) {
                logger.finest(
                        LOGCONTEXT + (authenticationResult.account() != null ? authenticationResult.account().username()
                                + ": " : "" + ACCESS_TOKEN_EXPIRE + authenticationResult.expiresOnDate()));
            }

            return new SqlAuthenticationToken(authenticationResult.accessToken(), authenticationResult.expiresOnDate());
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerMSAL4JUtils.java`
#### Snippet
```java
            final CompletableFuture<IAuthenticationResult> future = clientApplication
                    .acquireToken(ClientCredentialParameters.builder(scopes).build());
            final IAuthenticationResult authenticationResult = future.get();

            if (logger.isLoggable(Level.FINEST)) {
                logger.finest(
                        LOGCONTEXT + (authenticationResult.account() != null ? authenticationResult.account().username()
                                + ": " : "" + ACCESS_TOKEN_EXPIRE + authenticationResult.expiresOnDate()));
            }

            return new SqlAuthenticationToken(authenticationResult.accessToken(), authenticationResult.expiresOnDate());
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerNoneEnclaveProvider.java`
#### Snippet
```java
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        os.write(ENCLAVE_TYPE);
        os.write(enclaveChallenge);
        os.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(ENCLAVE_LENGTH).array());
        os.write(ECDH_MAGIC);
        os.write(x);
        os.write(y);
        return os.toByteArray();
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder(length * 2);
        for (int i = 0; i < length; i++) {
            int hexVal = b[i] & 0xFF;
            sb.append(HEXCHARS[(hexVal & 0xF0) >> 4]);
            sb.append(HEXCHARS[(hexVal & 0x0F)]);
        }
        return sb.toString();
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
        byte tmpByte;

        // Reverse the first 4 bytes
        tmpByte = buffer[0];
        buffer[0] = buffer[3];
        buffer[3] = tmpByte;
        tmpByte = buffer[1];
        buffer[1] = buffer[2];
        buffer[2] = tmpByte;

        // Reverse the 5th and the 6th
        tmpByte = buffer[4];
        buffer[4] = buffer[5];
        buffer[5] = tmpByte;

        // Reverse the 7th and the 8th
        tmpByte = buffer[6];
        buffer[6] = buffer[7];
        buffer[7] = tmpByte;
```

### DuplicatedCode
Duplicated code
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
        if (prior.compareAndSet(oldWeightedValue, weightedValue)) {
          final int weightedDifference = weight - oldWeightedValue.weight;
          if (weightedDifference == 0) {
            afterRead(prior);
          } else {
            afterWrite(new UpdateTask(prior, weightedDifference));
          }
          return oldWeightedValue.value;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
    checkNotNull(key);
    checkNotNull(value);

    final int weight = weigher.weightOf(key, value);
    final WeightedValue<V> weightedValue = new WeightedValue<V>(value, weight);

    final Node<K, V> node = data.get(key);
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return set but the return type is number
in `src/main/java/com/microsoft/sqlserver/jdbc/ISQLServerDataRecord.java`
#### Snippet
```java
     * Returns the column count.
     * 
     * @return Set of ordinals for the columns.
     */
    int getColumnCount();
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionJavaKeyStoreProvider.java`
#### Snippet
```java
            }
            // Ignore the exception as we are cleaning up.
            catch (IOException e) {}
        }

```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCSVFileRecord.java`
#### Snippet
```java
            try {
                fileReader.close();
            } catch (Exception e) {}
        if (sr != null)
            try {
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCSVFileRecord.java`
#### Snippet
```java
            try {
                sr.close();
            } catch (Exception e) {}
        if (fis != null)
            try {
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCSVFileRecord.java`
#### Snippet
```java
            try {
                fis.close();
            } catch (Exception e) {}

        loggerExternal.exiting(loggerPackageName, "close");
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    private final byte[] valueBytes = new byte[256];

    protected transient SensitivityClassification sensitivityClassification;

    private static final AtomicInteger lastReaderID = new AtomicInteger(0);
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSQLXML.java`
#### Snippet
```java

        if (logger.isLoggable(java.util.logging.Level.FINE))
            logger.fine(toString() + " created by (" + connection.toString() + ")");
        getterArgs = null; // make the compiler happy
        typeInfo = null;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSQLXML.java`
#### Snippet
```java
        this.typeInfo = typeInfo;
        if (logger.isLoggable(java.util.logging.Level.FINE))
            logger.fine(toString() + " created by (null connection)");
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCertificateUtils.java`
#### Snippet
```java
                                logger.finer(logContext
                                        + " the following name in certificate does not match the serverName: " + value);
                                logger.finer(logContext + " certificate:\n" + cert.toString());
                            }
                        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCertificateUtils.java`
#### Snippet
```java
                        if (logger.isLoggable(Level.FINER)) {
                            logger.finer(logContext + " found an invalid san entry: " + sanEntry);
                            logger.finer(logContext + " certificate:\n" + cert.toString());
                        }
                    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerMSAL4JUtils.java`
#### Snippet
```java
                        X509Certificate cert = (X509Certificate) keyStore.getCertificate(alias);
                        cert.checkValidity();
                        logger.finest(LOGCONTEXT + "certificate: " + cert.toString());
                    }
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerMSAL4JUtils.java`
#### Snippet
```java
                    // we don't really need to do this, MSAL will fail if cert is not valid, but good to check here and throw with proper error message
                    cert.checkValidity();
                    logger.finest(LOGCONTEXT + "certificate: " + cert.toString());
                }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerParameterMetaData.java`
#### Snippet
```java
        con = st.connection;
        if (logger.isLoggable(java.util.logging.Level.FINE)) {
            logger.fine(toString() + " created by (" + st.toString() + ")");
        }
        try {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerParameterMetaData.java`
#### Snippet
```java
        con = st.connection;
        if (logger.isLoggable(java.util.logging.Level.FINE)) {
            logger.fine(toString() + " created by (" + st.toString() + ")");
        }
        try {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/AuthenticationJNI.java`
#### Snippet
```java
        }
        if (authLogger.isLoggable(Level.FINER)) {
            authLogger.finer(toString() + " Release client context status : " + success);
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/AuthenticationJNI.java`
#### Snippet
```java
        if (failure != 0) {
            if (authLogger.isLoggable(Level.WARNING)) {
                authLogger.warning(toString() + " Authentication failed code : " + failure);
            }
            con.terminate(SQLServerException.DRIVER_ERROR_NONE,
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SimpleInputStream.java`
#### Snippet
```java
        checkClosed();
        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + " Skipping :" + n);
        if (n < 0)
            return 0L;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SimpleInputStream.java`
#### Snippet
```java
            return;
        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + "Enter Closing SimpleInputStream.");

        // Discard the remainder of the stream, positioning the TDSReader
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SimpleInputStream.java`
#### Snippet
```java
        closeHelper();
        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + "Exit Closing SimpleInputStream.");
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SimpleInputStream.java`
#### Snippet
```java
        if (isAdaptive && null != dtv) {
            if (logger.isLoggable(java.util.logging.Level.FINER))
                logger.finer(toString() + " closing the adaptive stream.");
            dtv.setPositionAfterStreamed(tdsReader);
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SimpleInputStream.java`
#### Snippet
```java
        checkClosed();
        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + " Reading " + maxBytes + " from stream offset " + streamPos + " payload length "
                    + payloadLength);

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPooledConnection.java`
#### Snippet
```java
    public void removeConnectionEventListener(ConnectionEventListener listener) {
        if (pcLogger.isLoggable(Level.FINER))
            pcLogger.finer(toString() + safeCID());
        listenersLock.lock();
        try {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPooledConnection.java`
#### Snippet
```java
    public void addConnectionEventListener(ConnectionEventListener listener) {
        if (pcLogger.isLoggable(Level.FINER))
            pcLogger.finer(toString() + safeCID());
        listenersLock.lock();
        try {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPooledConnection.java`
#### Snippet
```java
    void notifyEvent(SQLServerException e) {
        if (pcLogger.isLoggable(Level.FINER))
            pcLogger.finer(toString() + " Exception:" + e + safeCID());

        // close the proxy on fatal error event. Note exception is null then the event comes from the proxy close.
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPooledConnection.java`
#### Snippet
```java
                if (null == e) {
                    if (pcLogger.isLoggable(Level.FINER))
                        pcLogger.finer(toString() + " notifyEvent:connectionClosed " + safeCID());
                    listener.connectionClosed(ev);
                } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPooledConnection.java`
#### Snippet
```java
                } else {
                    if (pcLogger.isLoggable(Level.FINER))
                        pcLogger.finer(toString() + " notifyEvent:connectionErrorOccurred " + safeCID());
                    listener.connectionErrorOccurred(ev);
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPooledConnection.java`
#### Snippet
```java
    public void close() throws SQLException {
        if (pcLogger.isLoggable(Level.FINER))
            pcLogger.finer(toString() + " Closing physical connection, " + safeCID());
        lock.lock();
        try {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPooledConnection.java`
#### Snippet
```java
    public Connection getConnection() throws SQLException {
        if (pcLogger.isLoggable(Level.FINER))
            pcLogger.finer(toString() + " user:(default).");
        lock.lock();
        try {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPooledConnection.java`
#### Snippet
```java
            physicalConnection.doSecurityCheck();
            if (pcLogger.isLoggable(Level.FINE))
                pcLogger.fine(toString() + " Physical connection, " + safeCID());

            if (physicalConnection.needsReconnect()) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPooledConnection.java`
#### Snippet
```java
                if (!lastProxyConnection.isClosed()) {
                    if (pcLogger.isLoggable(Level.FINE)) {
                        pcLogger.fine(toString() + "proxy " + lastProxyConnection.toString()
                                + " is not closed before getting the connection.");
                    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPooledConnection.java`
#### Snippet
```java
            lastProxyConnection = new SQLServerConnectionPoolProxy(physicalConnection);
            if (pcLogger.isLoggable(Level.FINE) && !lastProxyConnection.isClosed())
                pcLogger.fine(toString() + " proxy " + lastProxyConnection.toString() + " is returned.");

            return lastProxyConnection;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPooledConnection.java`
#### Snippet
```java

        if (pcLogger.isLoggable(Level.FINER))
            pcLogger.finer(toString() + " Start create new connection for pool.");

        physicalConnection = createNewConnection();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPooledConnection.java`
#### Snippet
```java
        physicalConnection = createNewConnection();
        if (pcLogger.isLoggable(Level.FINE))
            pcLogger.fine(toString() + " created by (" + ds.toString() + ")" + " Physical connection " + safeCID()
                    + ", End create new connection for pool");
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXADataSource.java`
#### Snippet
```java

        if (xaLogger.isLoggable(Level.FINER))
            xaLogger.finer(toString() + " user:" + user + pooledXAConnection.toString());

        // Don't start a transaction here but do mark the connection as autocommit false.
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXADataSource.java`
#### Snippet
```java

        if (xaLogger.isLoggable(Level.FINER))
            xaLogger.finer(toString() + " user:" + user + pooledXAConnection.toString());

        // Don't start a transaction here but do mark the connection as autocommit false.
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXADataSource.java`
#### Snippet
```java

        if (xaLogger.isLoggable(Level.FINER))
            xaLogger.finer(toString() + " Start get physical connection.");
        SQLServerConnection physicalConnection = pooledXAConnection.getPhysicalConnection();
        if (xaLogger.isLoggable(Level.FINE))
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXADataSource.java`
#### Snippet
```java
        SQLServerConnection physicalConnection = pooledXAConnection.getPhysicalConnection();
        if (xaLogger.isLoggable(Level.FINE))
            xaLogger.fine(toString() + " End get physical connection, " + physicalConnection.toString());
        if (loggerExternal.isLoggable(Level.FINER))
            loggerExternal.exiting(getClassNameLogging(), "getXAConnection", pooledXAConnection);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnectionPoolProxy.java`
#### Snippet
```java
                public void run() {
                    if (wrappedConnection.getConnectionLogger().isLoggable(java.util.logging.Level.FINER))
                        wrappedConnection.getConnectionLogger().finer(toString() + " Connection proxy aborted ");
                    try {
                        wrappedConnection.poolCloseEventNotify();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnectionPoolProxy.java`
#### Snippet
```java
        if (bIsOpen && (null != wrappedConnection)) {
            if (wrappedConnection.getConnectionLogger().isLoggable(java.util.logging.Level.FINER))
                wrappedConnection.getConnectionLogger().finer(toString() + " Connection proxy closed ");

            wrappedConnection.poolCloseEventNotify();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/FailOverInfo.java`
#### Snippet
```java
            if (px >= 0) {
                if (con.getConnectionLogger().isLoggable(Level.FINE))
                    con.getConnectionLogger().fine(con.toString() + " Failover server :" + failoverPartner);
                instanceValue = failoverPartner.substring(px + 1, failoverPartner.length());
                failoverPartner = failoverPartner.substring(0, px);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/FailOverInfo.java`
#### Snippet
```java
    void log(SQLServerConnection con) {
        if (con.getConnectionLogger().isLoggable(Level.FINE))
            con.getConnectionLogger().fine(con.toString() + " Failover server :" + failoverPartner
                    + " Failover partner is primary : " + useFailoverPartner);
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/FailOverInfo.java`
#### Snippet
```java
                if (connection.getConnectionLogger().isLoggable(Level.FINE))
                    connection.getConnectionLogger()
                            .fine(connection.toString() + " Failover detected. failover partner=" + actualFailoverPartner);
                useFailoverPartner = actualUseFailoverPartner;
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
    Reference getReferenceInternal(String dataSourceClassString) {
        if (dsLogger.isLoggable(Level.FINER))
            dsLogger.finer(toString() + " creating reference for " + dataSourceClassString + ".");

        Reference ref = new Reference(this.getClass().getName(),
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
        // Create new connection and connect.
        if (dsLogger.isLoggable(Level.FINER))
            dsLogger.finer(toString() + " Begin create new connection.");
        SQLServerConnection result = null;
        result = DriverJDBCVersion.getSQLServerConnection(toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
        result.connect(mergedProps, pooledConnection);
        if (dsLogger.isLoggable(Level.FINER))
            dsLogger.finer(toString() + " End create new connection " + result.toString());
        return result;
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
        result.connect(mergedProps, pooledConnection);
        if (dsLogger.isLoggable(Level.FINER))
            dsLogger.finer(toString() + " End create new connection " + result.toString());
        return result;
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "executeBatch");
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "executeQuery", sql);
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
            loggerExternal.entering(getClassNameLogging(), "execute", new Object[] {sql, autoGeneratedKeys});
            if (Util.isActivityTraceOn()) {
                loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "execute", sql);
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
    private void doExecuteCursored(StmtExecCmd execCmd, String sql) throws SQLServerException {
        if (stmtlogger.isLoggable(java.util.logging.Level.FINER)) {
            stmtlogger.finer(toString() + " Execute for cursor open" + " SQL:" + sql + " Scrollability:"
                    + getResultSetScrollOpt() + " Concurrency:" + getResultSetCCOpt());
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "executeLargeUpdate", sql);
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java

        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        if (isCursorable(executeMethod) && isSelect(sql)) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
        if (isCursorable(executeMethod) && isSelect(sql)) {
            if (stmtlogger.isLoggable(java.util.logging.Level.FINE))
                stmtlogger.fine(toString() + " Executing server side cursor " + sql);

            doExecuteCursored(execCmd, sql);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java

            if (stmtlogger.isLoggable(java.util.logging.Level.FINE))
                stmtlogger.fine(toString() + " Executing (not server cursor) " + sql);

            // Start the response
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
            loggerExternal.entering(getClassNameLogging(), "executeLargeUpdate", new Object[] {sql, autoGeneratedKeys});
            if (Util.isActivityTraceOn()) {
                loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
            loggerExternal.entering(getClassNameLogging(), "executeUpdate", new Object[] {sql, autoGeneratedKeys});
            if (Util.isActivityTraceOn()) {
                loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java

        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "executeUpdate", sql);
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java

        if (stmtlogger.isLoggable(java.util.logging.Level.FINER)) {
            stmtlogger.finer("Properties for " + toString() + ":" + " Result type:" + appResultSetType + " ("
                    + resultSetType + ")" + " Concurrency:" + resultSetConcurrency + " Fetchsize:" + nFetchSize
                    + " bIsClosed:" + bIsClosed + " useLastUpdateCount:" + connection.useLastUpdateCount());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java

        if (stmtlogger.isLoggable(java.util.logging.Level.FINE)) {
            stmtlogger.fine(toString() + " created by (" + connection.toString() + ")");
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java

        if (stmtlogger.isLoggable(java.util.logging.Level.FINE)) {
            stmtlogger.fine(toString() + " created by (" + connection.toString() + ")");
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "executeLargeBatch");
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/FailOverMapSingleton.java`
#### Snippet
```java
                if (connection.getConnectionLogger().isLoggable(Level.FINER))
                    connection.getConnectionLogger()
                            .finer(connection.toString() + " Looking up info in the map using key: " + mapKey);
                FailoverInfo fo = failoverMap.get(mapKey);
                if (null != fo)
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/FailOverMapSingleton.java`
#### Snippet
```java
            if (null == (fo = getFailoverInfo(connection, primaryServer, instance, database))) {
                if (connection.getConnectionLogger().isLoggable(Level.FINE))
                    connection.getConnectionLogger().fine(connection.toString() + " Failover map add server: "
                            + primaryServer + "; database:" + database + "; Mirror:" + failoverPartner);
                failoverMap.put(concatPrimaryDatabase(primaryServer, instance, database), actualFailoverInfo);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAConnection.java`
#### Snippet
```java

        if (xaLogger.isLoggable(Level.FINER))
            xaLogger.finer("Creating an internal control connection for" + toString());
        physicalControlConnection = null;
        physicalControlConnection = DriverJDBCVersion.getSQLServerConnection(toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAConnection.java`
#### Snippet
```java
        if (xaLogger.isLoggable(Level.FINER))
            xaLogger.finer("Created an internal control connection" + physicalControlConnection.toString() + " for "
                    + toString() + " Physical connection:" + getPhysicalConnection().toString());

        if (xaLogger.isLoggable(Level.FINER))
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAConnection.java`
#### Snippet
```java

        if (xaLogger.isLoggable(Level.FINER))
            xaLogger.finer(ds.toString() + " user:" + user);
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SSPIAuthentication.java`
#### Snippet
```java
            // Ignored, cannot canonicalize
            if (logger.isLoggable(Level.FINER)) {
                logger.finer("Could not canonicalize host name. " + e.toString());
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/NTLMAuthentication.java`
#### Snippet
```java

            if (logger.isLoggable(Level.FINEST)) {
                logger.finest(toString() + " SPN detected: " + spn);
            }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/NTLMAuthentication.java`
#### Snippet
```java
            token.put(context.targetInfo, 0, context.targetInfo.length);
            if (logger.isLoggable(Level.WARNING)) {
                logger.warning(toString()
                        + " MsvAvTimestamp not recieved from SQL Server in Challenge Message. MIC field will not be set.");
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/NTLMAuthentication.java`
#### Snippet
```java

            if (logger.isLoggable(Level.FINEST)) {
                logger.finest(toString() + " NTLM Challenge Message target info: AvId " + id);
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/NTLMAuthentication.java`
#### Snippet
```java
            // this SHOULD always be present but for some reason occasionally this had seen to be missing
            if (logger.isLoggable(Level.WARNING)) {
                logger.warning(toString() + " NTLM Challenge Message target info error: Missing timestamp.");
            }
        } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
        }
        if (xaLogger.isLoggable(Level.FINE))
            xaLogger.fine(toString() + " created by (" + loginfo + ")");

        // Information about the server, needed for XA timeout logic in the DLL.
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java

        if (xaLogger.isLoggable(Level.FINER))
            xaLogger.finer(toString() + " Calling XA function for type:" + typeDisplay(nType) + " flags:"
                    + flagsDisplay(xaFlags) + " xid:" + XidImpl.xidDisplay(xid));

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                                    // we really want to ignore this failue
                                    if (xaLogger.isLoggable(Level.FINER))
                                        xaLogger.finer(toString()
                                                + " Ignoring exception when closing failed execution. exception:" + e3);
                                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                                }
                                if (xaLogger.isLoggable(Level.FINER))
                                    xaLogger.finer(toString() + " exception:" + eX);
                                throw eX;
                            } catch (SQLTimeoutException e4) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                            } catch (SQLTimeoutException e4) {
                                if (xaLogger.isLoggable(Level.FINER))
                                    xaLogger.finer(toString() + " exception:" + e4);
                                throw new SQLServerException(e4.getMessage(), SQLState.STATEMENT_CANCELED,
                                        DriverError.NOT_SET, null);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                            String versionNumberXADLL = initCS.getString(3);
                            if (xaLogger.isLoggable(Level.FINE))
                                xaLogger.fine(toString() + " Server XA DLL version:" + versionNumberXADLL);
                            initCS.close();
                            if (XA_OK != initStatus) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                                xex.errorCode = initStatus;
                                if (xaLogger.isLoggable(Level.FINER))
                                    xaLogger.finer(toString() + " exception:" + xex);
                                throw xex;
                            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                        Object[] msgArgs = {e1.getMessage()};
                        if (xaLogger.isLoggable(Level.FINER))
                            xaLogger.finer(toString() + " exception:" + form.format(msgArgs));
                        SQLServerException.makeFromDriverError(null, null, form.format(msgArgs), null, true);
                    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                            if (xaLogger.isLoggable(Level.WARNING))
                                xaLogger.warning(
                                        toString() + " Cannot retrieve server information: :" + e.getMessage());
                        }
                    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                String versionNumberXADLL = cs.getString(9);
                if (xaLogger.isLoggable(Level.FINE)) {
                    xaLogger.fine(toString() + " Server XA DLL version:" + versionNumberXADLL);
                    if (null != cs.getString(16)) {
                        StringBuffer strBuf = new StringBuffer(cs.getString(16));
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                        strBuf.insert(12, '-');
                        strBuf.insert(8, '-');
                        xaLogger.fine(toString() + " XID to UoW mapping for XA type:XA_START XID: "
                                + XidImpl.xidDisplay(xid) + " UoW: " + strBuf.toString());
                    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                        strBuf.insert(8, '-');
                        xaLogger.fine(toString() + " XID to UoW mapping for XA type:XA_START XID: "
                                + XidImpl.xidDisplay(xid) + " UoW: " + strBuf.toString());
                    }
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                        strBuf.insert(12, '-');
                        strBuf.insert(8, '-');
                        xaLogger.fine(toString() + " XID to UoW mapping for XA type:XA_END XID: "
                                + XidImpl.xidDisplay(xid) + " UoW: " + strBuf.toString());
                    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                        strBuf.insert(8, '-');
                        xaLogger.fine(toString() + " XID to UoW mapping for XA type:XA_END XID: "
                                + XidImpl.xidDisplay(xid) + " UoW: " + strBuf.toString());
                    }
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                    try {
                        if (xaLogger.isLoggable(Level.FINER))
                            xaLogger.finer(toString() + " Begin un-enlist, enlisted count:" + enlistedTransactionCount);
                        con.jtaUnenlistConnection();
                        enlistedTransactionCount--;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                        enlistedTransactionCount--;
                        if (xaLogger.isLoggable(Level.FINER))
                            xaLogger.finer(toString() + " End un-enlist, enlisted count:" + enlistedTransactionCount);
                    } catch (SQLServerException e1) {
                        // ignore this message as the previous error message is more important.
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                        // ignore this message as the previous error message is more important.
                        if (xaLogger.isLoggable(Level.FINER))
                            xaLogger.finer(toString() + " Ignoring exception:" + e1);
                    }
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                            if (xaLogger.isLoggable(Level.FINER))
                                xaLogger.finer(
                                        toString() + " Begin enlisting, cookie:" + cookieDisplay(transactionCookie)
                                                + " enlisted count:" + enlistedTransactionCount);
                            con.jtaEnlistConnection(transactionCookie);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                            enlistedTransactionCount++;
                            if (xaLogger.isLoggable(Level.FINER))
                                xaLogger.finer(toString() + " End enlisting, cookie:" + cookieDisplay(transactionCookie)
                                        + " enlisted count:" + enlistedTransactionCount);
                        } catch (SQLServerException e1) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                    try {
                        if (xaLogger.isLoggable(Level.FINER))
                            xaLogger.finer(toString() + " Begin un-enlist, enlisted count:" + enlistedTransactionCount);
                        con.jtaUnenlistConnection();
                        enlistedTransactionCount--;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                        enlistedTransactionCount--;
                        if (xaLogger.isLoggable(Level.FINER))
                            xaLogger.finer(toString() + " End un-enlist, enlisted count:" + enlistedTransactionCount);
                    } catch (SQLServerException e1) {
                        MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_failedToUnEnlist"));
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
        } catch (SQLTimeoutException ex) {
            if (xaLogger.isLoggable(Level.FINER))
                xaLogger.finer(toString() + " exception:" + ex);
            XAException e = new XAException(ex.toString());
            e.errorCode = XAException.XAER_RMFAIL;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
        } catch (SQLServerException ex) {
            if (xaLogger.isLoggable(Level.FINER))
                xaLogger.finer(toString() + " exception:" + ex);

            if (ex.getMessage().equals(SQLServerException.getErrString("R_noServerResponse"))
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java

        if (xaLogger.isLoggable(Level.FINER))
            xaLogger.finer(toString() + " Status:" + nStatus);

        returnStatus.nStatus = nStatus;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java

        if (xaLogger.isLoggable(Level.FINER))
            xaLogger.finer(toString() + " xares:" + xares);

        // Change to return true if its the same database physical connection
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
        timeoutSeconds = seconds;
        if (xaLogger.isLoggable(Level.FINER))
            xaLogger.finer(toString() + " TransactionTimeout:" + seconds);
        return true;
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
            } catch (Exception e) {
                if (xaLogger.isLoggable(Level.WARNING))
                    xaLogger.warning(toString() + "Closing exception ignored: " + e);
            }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
                xex.errorCode = XAException.XAER_RMERR;
                if (xaLogger.isLoggable(Level.FINER))
                    xaLogger.finer(toString() + " exception:" + xex);
                throw xex;
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
            xids[i] = al.get(i);
            if (xaLogger.isLoggable(Level.FINER))
                xaLogger.finer(toString() + xids[i].toString());
        }
        return xids;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/tdsparser.java`
#### Snippet
```java
            int tdsTokenType = tdsReader.peekTokenType();
            if (isLogging) {
                logger.finest(tdsReader.toString() + ": " + tdsTokenHandler.logContext + ": Processing "
                        + ((-1 == tdsTokenType) ? "EOF" : TDS.getTokenName(tdsTokenType)));
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "execute");
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "executeQuery");
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
    private void buildServerCursorExecParams(TDSWriter tdsWriter) throws SQLServerException {
        if (getStatementLogger().isLoggable(java.util.logging.Level.FINE))
            getStatementLogger().fine(toString() + ": calling sp_cursorexecute: PreparedHandle:"
                    + getPreparedStatementHandle() + ", SQL:" + preparedSQL);

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
                sb.append(".");
                localUserSQL = localUserSQL.substring(1);
                return sb.toString() + parseUserSQLForTableNameDW(true, true, true, true);
            } else {
                return "";
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
            sb.append(localUserSQL.substring(0, tempint + 1));
            localUserSQL = localUserSQL.substring(tempint + 1);
            return sb.toString() + parseUserSQLForTableNameDW(true, true, true, false);
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
            sb.append(localUserSQL.substring(0, tempint + 1));
            localUserSQL = localUserSQL.substring(tempint + 1);
            return sb.toString() + parseUserSQLForTableNameDW(true, true, true, false);
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
            if (localUserSQL.charAt(0) == '.' || Character.isWhitespace(localUserSQL.charAt(0))
                    || checkAndRemoveCommentsAndSpace(false)) {
                return sb.toString() + parseUserSQLForTableNameDW(true, true, true, false);
            } else if (localUserSQL.charAt(0) == ';') {
                throw new IllegalArgumentException(SQLServerException.getErrString("R_endOfQueryDetected"));
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
    private void buildExecParams(TDSWriter tdsWriter) throws SQLServerException {
        if (getStatementLogger().isLoggable(java.util.logging.Level.FINE))
            getStatementLogger().fine(toString() + ": calling sp_execute: PreparedHandle:"
                    + getPreparedStatementHandle() + ", SQL:" + preparedSQL);

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
    private void buildServerCursorPrepExecParams(TDSWriter tdsWriter) throws SQLServerException {
        if (getStatementLogger().isLoggable(java.util.logging.Level.FINE))
            getStatementLogger().fine(toString() + ": calling sp_cursorprepexec: PreparedHandle:"
                    + getPreparedStatementHandle() + ", SQL:" + preparedSQL);

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java

        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        // Create the parameter array that we'll use for all the items in this batch.
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
                param.skipValue(tdsReader, true);
                if (getStatementLogger().isLoggable(java.util.logging.Level.FINER))
                    getStatementLogger().finer(toString() + ": Setting PreparedHandle:" + prepStmtHandle);

                return true;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "executeLargeUpdate");
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "executeLargeBatch");
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
    private void buildPrepExecParams(TDSWriter tdsWriter) throws SQLServerException {
        if (getStatementLogger().isLoggable(java.util.logging.Level.FINE))
            getStatementLogger().fine(toString() + ": calling sp_prepexec: PreparedHandle:"
                    + getPreparedStatementHandle() + ", SQL:" + preparedSQL);

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "executeUpdate");
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
    private void buildExecSQLParams(TDSWriter tdsWriter) throws SQLServerException {
        if (getStatementLogger().isLoggable(java.util.logging.Level.FINE))
            getStatementLogger().fine(toString() + ": calling sp_executesql: SQL:" + preparedSQL);

        expectPrepStmtHandle = false;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
    private void buildPrepParams(TDSWriter tdsWriter) throws SQLServerException {
        if (getStatementLogger().isLoggable(java.util.logging.Level.FINE))
            getStatementLogger().fine(toString() + ": calling sp_prepare: PreparedHandle:"
                    + getPreparedStatementHandle() + ", SQL:" + preparedSQL);

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java

        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), EXECUTE_BATCH_STRING);
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
            // to eat previous login errors if caused before which is more useful to the user than the cleanup errors.
            if (authLogger.isLoggable(Level.FINE)) {
                authLogger.fine(toString() + " Release of the credentials failed LoginException: " + e);
            }
        } catch (GSSException e) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
            // to eat previous login errors if caused before which is more useful to the user than the cleanup errors.
            if (authLogger.isLoggable(Level.FINE)) {
                authLogger.fine(toString() + " Release of the credentials failed GSSException: " + e);
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
                } catch (LoginException le) {
                    if (authLogger.isLoggable(Level.FINE)) {
                        authLogger.fine(toString() + "Failed to login using Kerberos due to " + le.getClass().getName()
                                + ":" + le.getMessage());
                    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java

                if (authLogger.isLoggable(Level.FINER)) {
                    authLogger.finer(toString() + " Getting client credentials");
                }
                peerCredentials = getClientCredential(currentSubject, manager, kerberos);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java

                if (authLogger.isLoggable(Level.FINER)) {
                    authLogger.finer(toString() + " creating security context");
                }
                peerContext = manager.createContext(remotePeerName, kerberos, peerCredentials,
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
        } catch (GSSException ge) {
            if (authLogger.isLoggable(Level.FINER)) {
                authLogger.finer(toString() + "initAuthInit failed GSSException:-" + ge);
            }
            con.terminate(SQLServerException.DRIVER_ERROR_NONE,
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
        } catch (PrivilegedActionException ge) {
            if (authLogger.isLoggable(Level.FINER)) {
                authLogger.finer(toString() + "initAuthInit failed privileged exception:-" + ge);
            }
            con.terminate(SQLServerException.DRIVER_ERROR_NONE,
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
        try {
            if (authLogger.isLoggable(Level.FINER)) {
                authLogger.finer(toString() + " Sending token to server over secure context");
            }
            byte[] byteToken = peerContext.initSecContext(pin, 0, pin.length);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
                done[0] = true;
                if (authLogger.isLoggable(Level.FINER)) {
                    authLogger.finer(toString() + "Authentication done.");
                }
            } else if (null == byteToken) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
                // The documentation is not clear on when this can happen but it does say this could happen
                if (authLogger.isLoggable(Level.INFO)) {
                    authLogger.info(toString() + "byteToken is null in initSecContext.");
                }
                con.terminate(SQLServerException.DRIVER_ERROR_NONE,
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
        } catch (GSSException ge) {
            if (authLogger.isLoggable(Level.FINER)) {
                authLogger.finer(toString() + "initSecContext Failed :-" + ge);
            }
            con.terminate(SQLServerException.DRIVER_ERROR_NONE,
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerTrustManager.java`
#### Snippet
```java
    PermissiveX509TrustManager(TDSChannel tdsChannel) {
        this.logger = tdsChannel.getLogger();
        this.logContext = tdsChannel.toString() + " (PermissiveX509TrustManager):";
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerTrustManager.java`
#### Snippet
```java
    HostNameOverrideX509TrustManager(TDSChannel tdsChannel, X509TrustManager tm, String hostName) {
        this.logger = tdsChannel.getLogger();
        this.logContext = tdsChannel.toString() + " (HostNameOverrideX509TrustManager):";
        defaultTrustManager = tm;

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerTrustManager.java`
#### Snippet
```java
    ServerCertificateX509TrustManager(TDSChannel tdsChannel, String cert, String hostName) {
        this.logger = tdsChannel.getLogger();
        this.logContext = tdsChannel.toString() + " (ServerCertificateX509TrustManager):";
        // canonical name is in lower case so convert this to lowercase too.
        this.hostName = hostName.toLowerCase(Locale.ENGLISH);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerException.java`
#### Snippet
```java

        if (exLogger.isLoggable(Level.FINE))
            exLogger.fine("*** SQLException:" + id + " " + this.toString() + " " + errText);
        if (bStack && exLogger.isLoggable(Level.FINE)) {
            StringBuilder sb = new StringBuilder(100);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerException.java`
#### Snippet
```java
            // necessary changes to enableSSL() function's exception handling mechanism.
            sb.append(LOG_CLIENT_CONNECTION_ID_PREFIX);
            sb.append(clientConnId.toString());
            return sb.toString();
        } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/ScrollWindow.java`
#### Snippet
```java

            if (SQLServerResultSet.logger.isLoggable(java.util.logging.Level.FINEST))
                SQLServerResultSet.logger.finest(rs.toString() + " Set mark " + rowMark[currentRow - 1] + " for row "
                        + currentRow + " of type " + rowType[currentRow - 1]);

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCallableStatement.java`
#### Snippet
```java
        closeActiveStream();
        if (getStatementLogger().isLoggable(java.util.logging.Level.FINER))
            getStatementLogger().finer(toString() + " Getting Param:" + index);

        // Dynamically load OUT params from TDS response buffer
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCallableStatement.java`
#### Snippet
```java
            if ((outParamIndex < 0 || outParamIndex >= inOutParam.length) || (!inOutParam[outParamIndex].isOutput())) {
                if (getStatementLogger().isLoggable(java.util.logging.Level.INFO)) {
                    getStatementLogger().info(toString() + " Unexpected outParamIndex: " + outParamIndex
                            + "; adjustment: " + outParamIndexAdjustment);
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java
        if (logger.isLoggable(Level.FINE)) {
            String loggingInfo = (null != connection) ? connection.toString() : "null connection";
            logger.fine(toString() + " created by (" + loggingInfo + ")");
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java
                        stream.close();
                    } catch (IOException ioException) {
                        logger.fine(toString() + " ignored IOException closing stream " + stream + ": "
                                + ioException.getMessage());
                    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSetMetaData.java`
#### Snippet
```java
        assert rs != null;
        if (logger.isLoggable(java.util.logging.Level.FINE)) {
            logger.fine(toString() + " created by (" + rs.toString() + ")");
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSetMetaData.java`
#### Snippet
```java
        assert rs != null;
        if (logger.isLoggable(java.util.logging.Level.FINE)) {
            logger.fine(toString() + " created by (" + rs.toString() + ")");
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                            // then we set precision as the default precision instead of max precision
                            if (!isOutput()) {
                                param.typeDefinition = SSType.DECIMAL.toString() + "("
                                        + SQLServerConnection.DEFAULT_DECIMAL_PRECISION + "," + scale + ")";
                            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                        } else {
                            if (SQLServerConnection.DEFAULT_DECIMAL_PRECISION >= valueLength) {
                                param.typeDefinition = SSType.DECIMAL.toString() + "("
                                        + SQLServerConnection.DEFAULT_DECIMAL_PRECISION + "," + scale + ")";

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java

                                if (SQLServerConnection.DEFAULT_DECIMAL_PRECISION < (valueLength + scale)) {
                                    param.typeDefinition = SSType.DECIMAL.toString() + "("
                                            + (SQLServerConnection.DEFAULT_DECIMAL_PRECISION + scale) + "," + scale
                                            + ")";
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                                }
                            } else {
                                param.typeDefinition = SSType.DECIMAL.toString() + "("
                                        + SQLServerConnection.MAX_DECIMAL_PRECISION + "," + scale + ")";
                            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java

                        if (isOutput()) {
                            param.typeDefinition = SSType.DECIMAL.toString() + "("
                                    + SQLServerConnection.MAX_DECIMAL_PRECISION + ", " + scale + ")";
                        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java

                        if (userProvidesPrecision) {
                            param.typeDefinition = SSType.DECIMAL.toString() + "(" + valueLength + "," + scale + ")";
                        }
                    } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                            }

                            param.typeDefinition = SSType.DECIMAL.toString() + "(" + calculatedPrecision + "," +
                                    (plainValueArray.length == 2 ? plainValueArray[1].length() : 0) + ")";
                        } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                                    (plainValueArray.length == 2 ? plainValueArray[1].length() : 0) + ")";
                        } else {
                            param.typeDefinition = SSType.DECIMAL.toString() + "("
                                    + SQLServerConnection.MAX_DECIMAL_PRECISION + "," + scale + ")";
                        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java

                        if (userProvidesScale) {
                            param.typeDefinition = SSType.TIME.toString() + "(" + outScale + ")";
                        } else {
                            param.typeDefinition = SSType.TIME.toString() + "(" + valueLength + ")";
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                            param.typeDefinition = SSType.TIME.toString() + "(" + outScale + ")";
                        } else {
                            param.typeDefinition = SSType.TIME.toString() + "(" + valueLength + ")";
                        }
                    } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                         */
                        if (userProvidesScale) {
                            param.typeDefinition = SSType.DATETIMEOFFSET.toString() + "(" + outScale + ")";
                        } else {
                            param.typeDefinition = SSType.DATETIMEOFFSET.toString() + "(" + valueLength + ")";
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                            param.typeDefinition = SSType.DATETIMEOFFSET.toString() + "(" + outScale + ")";
                        } else {
                            param.typeDefinition = SSType.DATETIMEOFFSET.toString() + "(" + valueLength + ")";
                        }
                    } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                        if (0 == valueLength) {
                            // Workaround for the issue when inserting empty string and null into encrypted columns
                            param.typeDefinition = SSType.VARCHAR.toString() + "(1)";
                            valueLength++;
                        } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                            valueLength++;
                        } else {
                            param.typeDefinition = SSType.VARCHAR.toString() + "(" + valueLength + ")";

                            if (DataTypes.SHORT_VARTYPE_MAX_BYTES <= valueLength) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                            if (0 == valueLength) {
                                // Workaround for the issue when inserting empty string and null into encrypted columns
                                param.typeDefinition = SSType.VARCHAR.toString() + "(1)";
                                valueLength++;
                            } else if (DataTypes.SHORT_VARTYPE_MAX_BYTES < valueLength) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                                param.typeDefinition = VARCHAR_MAX;
                            } else {
                                param.typeDefinition = SSType.VARCHAR.toString() + "(" + valueLength + ")";
                            }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                            if (0 == valueLength) {
                                // Workaround for the issue when inserting empty string and null into encrypted columns
                                param.typeDefinition = SSType.NVARCHAR.toString() + "(1)";
                                valueLength++;
                            } else if (DataTypes.SHORT_VARTYPE_MAX_CHARS < valueLength) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                                param.typeDefinition = NVARCHAR_MAX;
                            } else {
                                param.typeDefinition = SSType.NVARCHAR.toString() + "(" + valueLength + ")";
                            }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                            if (0 == valueLength) {
                                // Workaround for the issue when inserting empty string and null into encrypted columns
                                param.typeDefinition = SSType.NVARCHAR.toString() + "(1)";
                                valueLength++;
                            } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                                valueLength++;
                            } else {
                                param.typeDefinition = SSType.NVARCHAR.toString() + "(" + valueLength + ")";

                                if (DataTypes.SHORT_VARTYPE_MAX_BYTES <= valueLength) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                            if (0 == valueLength) {
                                // Workaround for the issue when inserting empty string and null into encrypted columns
                                param.typeDefinition = SSType.VARCHAR.toString() + "(1)";
                                valueLength++;
                            } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                                valueLength++;
                            } else {
                                param.typeDefinition = SSType.VARCHAR.toString() + "(" + valueLength + ")";

                                if (DataTypes.SHORT_VARTYPE_MAX_BYTES < valueLength) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                            if (0 == valueLength) {
                                // Workaround for the issue when inserting empty string and null into encrypted columns
                                param.typeDefinition = SSType.NVARCHAR.toString() + "(1)";
                                valueLength++;
                            } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                                valueLength++;
                            } else {
                                param.typeDefinition = SSType.NVARCHAR.toString() + "(" + valueLength + ")";

                                if (DataTypes.SHORT_VARTYPE_MAX_BYTES <= valueLength) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                            if (0 == valueLength) {
                                // Workaround for the issue when inserting empty string and null into encrypted columns
                                param.typeDefinition = SSType.NVARCHAR.toString() + "(1)";
                                valueLength++;
                            } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/Parameter.java`
#### Snippet
```java
                                valueLength++;
                            } else {
                                param.typeDefinition = SSType.NVARCHAR.toString() + "(" + valueLength + ")";

                                if (DataTypes.SHORT_VARTYPE_MAX_BYTES <= valueLength) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
            String proc) throws SQLServerException, SQLTimeoutException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
            String col) throws SQLServerException, SQLTimeoutException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
    public ResultSet getSuperTypes(String catalog, String schemaPattern, String typeNamePattern) throws SQLException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
            int[] types) throws SQLException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
    public java.sql.ResultSet getSchemas(String catalog, String schemaPattern) throws SQLException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        return getSchemasInternal(catalog, schemaPattern);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
    public java.sql.ResultSet getTableTypes() throws SQLException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        connection = con;
        if (logger.isLoggable(java.util.logging.Level.FINE)) {
            logger.fine(toString() + " created by (" + connection.toString() + ")");
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
            boolean nullable) throws SQLServerException, SQLTimeoutException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
            String[] types) throws SQLServerException, SQLTimeoutException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
    public java.sql.ResultSet getTypeInfo() throws SQLException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
    public java.sql.ResultSet getSchemas() throws SQLException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
    public java.sql.ResultSet getCatalogs() throws SQLException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
            String attributeNamePattern) throws SQLException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
                                .append("'");
                    } else {
                        sb.append(o.toString());
                    }
                } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
            String table) throws SQLServerException, SQLTimeoutException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
            String tab2) throws SQLException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
    public String getUserName() throws SQLServerException, SQLTimeoutException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
            String columnNamePattern) throws SQLException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        s += " order by 2, 1";
        if (logger.isLoggable(java.util.logging.Level.FINE)) {
            logger.fine(toString() + " schema query (" + s + ")");
        }
        SQLServerResultSet rs;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
            String table) throws SQLServerException, SQLTimeoutException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
            String table) throws SQLServerException, SQLTimeoutException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
    public ResultSet getSuperTables(String catalog, String schemaPattern, String tableNamePattern) throws SQLException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
    public java.sql.ResultSet getColumns(String catalog, String schema, String table, String col) throws SQLException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
            String col) throws SQLServerException, SQLTimeoutException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
            boolean approximate) throws SQLServerException, SQLTimeoutException {
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "beforeFirst");
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        if (logger.isLoggable(java.util.logging.Level.FINER))
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        }
        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + logCursorState());

        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "isLast");
        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + logCursorState());

        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "updateRow");
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        final class UpdateRowRPC extends TDSCommand {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java

        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + logCursorState());

        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "deleteRow");
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        final class DeleteRowRPC extends TDSCommand {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java

        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + logCursorState());

        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
            } catch (SQLException e) {
                if (logger.isLoggable(java.util.logging.Level.FINER)) {
                    logger.finer(toString() + "Filling Lobs before closing: " + e.getMessage());
                }
            } finally {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "insertRow");
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java

        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + logCursorState());

        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "last");
        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + logCursorState());

        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "getRow");
        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + logCursorState());

        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "moveToCurrentRow");
        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + logCursorState());

        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "absolute");
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        if (logger.isLoggable(java.util.logging.Level.FINER))
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        }
        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + " row:" + row + logCursorState());

        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "isAfterLast");
        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + logCursorState());

        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "next");
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        if (logger.isLoggable(java.util.logging.Level.FINER))
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        }
        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + logCursorState());

        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java

        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + " rows:" + rows + logCursorState());

        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "moveToInsertRow");
        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + logCursorState());

        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "afterLast");
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java

        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + logCursorState());

        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java

        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + " Getting Column:" + index);

        fillLOBs();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "first");
        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + logCursorState());

        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        } else {
            if (logger.isLoggable(java.util.logging.Level.FINER))
                logger.finer(toString() + " Closing cursor:" + serverCursorId);

            final class CloseServerCursorCommand extends UninterruptableTDSCommand {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
            } catch (SQLServerException e) {
                if (logger.isLoggable(java.util.logging.Level.FINER))
                    logger.finer(toString() + " Ignored error closing cursor:" + serverCursorId + " " + e.getMessage());
            }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java

            if (logger.isLoggable(java.util.logging.Level.FINER))
                logger.finer(toString() + " Closed cursor:" + serverCursorId);
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "isBeforeFirst");
        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + logCursorState());

        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "refreshRow");
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java

        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + logCursorState());

        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "isFirst");
        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + logCursorState());

        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "previous");
        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + logCursorState());

        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java

        if (logger.isLoggable(java.util.logging.Level.FINE)) {
            logger.fine(toString() + " created by (" + stmt.toString() + ")");
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java

        if (logger.isLoggable(java.util.logging.Level.FINE)) {
            logger.fine(toString() + " created by (" + stmt.toString() + ")");
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        loggerExternal.entering(getClassNameLogging(), "close");
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        closeInternal();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
    final void doServerFetch(int fetchType, int startRow, int numRows) throws SQLServerException {
        if (logger.isLoggable(java.util.logging.Level.FINER))
            logger.finer(toString() + " fetchType:" + fetchType + " startRow:" + startRow + " numRows:" + numRows);

        // Discard the current fetch buffer contents
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
                // error through normal cursor movement.
                if (logger.isLoggable(java.util.logging.Level.FINER))
                    logger.finer(toString() + " Ignored exception from row error during server cursor fixup: "
                            + e.getMessage());
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
        long start = System.currentTimeMillis();
        if (loggerExternal.isLoggable(Level.FINER))
            loggerExternal.finer(this.toString() + " Start writeToServer: " + start);

        getDestinationMetadata();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
        long end = System.currentTimeMillis();
        if (loggerExternal.isLoggable(Level.FINER)) {
            loggerExternal.finer(this.toString() + " End writeToServer: " + end);
            int seconds = (int) ((end - start) / 1000L);
            loggerExternal.finer(this.toString() + "Time elapsed: " + seconds + " seconds");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
            loggerExternal.finer(this.toString() + " End writeToServer: " + end);
            int seconds = (int) ((end - start) / 1000L);
            loggerExternal.finer(this.toString() + "Time elapsed: " + seconds + " seconds");
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java

        if (loggerExternal.isLoggable(Level.FINER))
            loggerExternal.finer(this.toString() + " TDSCommand: " + bulkCmd);

        return bulkCmd.toString();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
            if (sourcePrecision > destPrecision) {
                String srcType = JDBCType.of(srcJdbcType) + "(" + sourcePrecision + ")";
                String destType = destSSType.toString() + "(" + destPrecision + ")";
                String destName = destColumnMetadata.get(destCol).columnName;
                MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_InvalidDataForAE"));
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
            // if destination is encrypted send metadata from destination and not from source
            if (DataTypes.SHORT_VARTYPE_MAX_BYTES < destPrecision) {
                return SSType.VARBINARY.toString() + MAX;
            } else {
                return SSType.VARBINARY.toString() + "(" + destColumnMetadata.get(destColIndx).precision + ")";
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                return SSType.VARBINARY.toString() + MAX;
            } else {
                return SSType.VARBINARY.toString() + "(" + destColumnMetadata.get(destColIndx).precision + ")";
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
        if (Util.isCharType(bulkJdbcType) && Util.isBinaryType(destSSType)) {
            if (isStreaming)
                return SSType.VARBINARY.toString() + MAX;
            else
                // Return binary(n) or varbinary(n) or varbinary(max) depending on destination type/precision.
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
            else
                // Return binary(n) or varbinary(n) or varbinary(max) depending on destination type/precision.
                return destSSType.toString() + "("
                        + ((DataTypes.SHORT_VARTYPE_MAX_BYTES < destPrecision) ? "max" : destPrecision) + ")";
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                    return SSType.SMALLMONEY.toString();
                }
                return SSType.DECIMAL.toString() + "(" + bulkPrecision + ", " + bulkScale + ")";

            case java.sql.Types.NUMERIC:
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                    return SSType.SMALLMONEY.toString();
                }
                return SSType.NUMERIC.toString() + "(" + bulkPrecision + ", " + bulkScale + ")";

            case microsoft.sql.Types.GUID:
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
            case microsoft.sql.Types.GUID:
                // For char the value has to be between 0 to 8000.
                return SSType.CHAR.toString() + "(" + bulkPrecision + ")";
            case java.sql.Types.CHAR:
                if (unicodeConversionRequired(bulkJdbcType, destSSType)) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
            case java.sql.Types.CHAR:
                if (unicodeConversionRequired(bulkJdbcType, destSSType)) {
                    return SSType.NCHAR.toString() + "(" + bulkPrecision + ")";
                } else {
                    return SSType.CHAR.toString() + "(" + bulkPrecision + ")";
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                    return SSType.NCHAR.toString() + "(" + bulkPrecision + ")";
                } else {
                    return SSType.CHAR.toString() + "(" + bulkPrecision + ")";
                }
            case java.sql.Types.NCHAR:
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                }
            case java.sql.Types.NCHAR:
                return SSType.NCHAR.toString() + "(" + bulkPrecision + ")";

            case java.sql.Types.LONGVARCHAR:
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                if (unicodeConversionRequired(bulkJdbcType, destSSType)) {
                    if (isStreaming) {
                        return SSType.NVARCHAR.toString() + MAX;
                    } else {
                        return SSType.NVARCHAR.toString() + "(" + bulkPrecision + ")";
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                        return SSType.NVARCHAR.toString() + MAX;
                    } else {
                        return SSType.NVARCHAR.toString() + "(" + bulkPrecision + ")";
                    }
                } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                } else {
                    if (isStreaming) {
                        return SSType.VARCHAR.toString() + MAX;
                    } else {
                        return SSType.VARCHAR.toString() + "(" + bulkPrecision + ")";
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                        return SSType.VARCHAR.toString() + MAX;
                    } else {
                        return SSType.VARCHAR.toString() + "(" + bulkPrecision + ")";
                    }
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
            case java.sql.Types.NVARCHAR:
                if (isStreaming) {
                    return SSType.NVARCHAR.toString() + MAX;
                } else {
                    return SSType.NVARCHAR.toString() + "(" + bulkPrecision + ")";
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                    return SSType.NVARCHAR.toString() + MAX;
                } else {
                    return SSType.NVARCHAR.toString() + "(" + bulkPrecision + ")";
                }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
            case java.sql.Types.BINARY:
                // For binary the value has to be between 0 to 8000.
                return SSType.BINARY.toString() + "(" + bulkPrecision + ")";

            case java.sql.Types.LONGVARBINARY:
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
            case java.sql.Types.VARBINARY:
                if (isStreaming)
                    return SSType.VARBINARY.toString() + MAX;
                else
                    return SSType.VARBINARY.toString() + "(" + bulkPrecision + ")";
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                    return SSType.VARBINARY.toString() + MAX;
                else
                    return SSType.VARBINARY.toString() + "(" + bulkPrecision + ")";

            case microsoft.sql.Types.DATETIME:
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                    case SMALLDATETIME:
                        if (null != serverBulkData && connection.getSendTemporalDataTypesAsStringForBulkCopy()) {
                            return SSType.VARCHAR.toString() + "("
                                    + ((0 == bulkPrecision) ? SOURCE_BULK_RECORD_TEMPORAL_MAX_PRECISION : bulkPrecision)
                                    + ")";
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                    case DATETIME:
                        if (null != serverBulkData && connection.getSendTemporalDataTypesAsStringForBulkCopy()) {
                            return SSType.VARCHAR.toString() + "("
                                    + ((0 == bulkPrecision) ? SOURCE_BULK_RECORD_TEMPORAL_MAX_PRECISION : bulkPrecision)
                                    + ")";
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                         */
                        if (null != serverBulkData && connection.getSendTemporalDataTypesAsStringForBulkCopy()) {
                            return SSType.VARCHAR.toString() + "("
                                    + ((0 == bulkPrecision) ? destPrecision : bulkPrecision) + ")";
                        } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                                    + ((0 == bulkPrecision) ? destPrecision : bulkPrecision) + ")";
                        } else {
                            return SSType.DATETIME2.toString() + "(" + bulkScale + ")";
                        }
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                 */
                if (null != serverBulkData && connection.getSendTemporalDataTypesAsStringForBulkCopy()) {
                    return SSType.VARCHAR.toString() + "(" + ((0 == bulkPrecision) ? destPrecision : bulkPrecision)
                            + ")";
                } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                 */
                if (null != serverBulkData && connection.getSendTemporalDataTypesAsStringForBulkCopy()) {
                    return SSType.VARCHAR.toString() + "(" + ((0 == bulkPrecision) ? destPrecision : bulkPrecision)
                            + ")";
                } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                            + ")";
                } else {
                    return SSType.TIME.toString() + "(" + bulkScale + ")";
                }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
            case 2013: // java.sql.Types.TIME_WITH_TIMEZONE
            case 2014: // java.sql.Types.TIMESTAMP_WITH_TIMEZONE
                return SSType.DATETIMEOFFSET.toString() + "(" + bulkScale + ")";

            case microsoft.sql.Types.DATETIMEOFFSET:
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                 */
                if (null != serverBulkData && connection.getSendTemporalDataTypesAsStringForBulkCopy()) {
                    return SSType.VARCHAR.toString() + "(" + ((0 == bulkPrecision) ? destPrecision : bulkPrecision)
                            + ")";
                } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                            + ")";
                } else {
                    return SSType.DATETIMEOFFSET.toString() + "(" + bulkScale + ")";
                }
            case microsoft.sql.Types.SQL_VARIANT:
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            this.sslHandshakeOutputStream = sslHandshakeOutputStream;
            this.logger = tdsChannel.getLogger();
            this.logContext = tdsChannel.toString() + " (SSLHandshakeInputStream):";
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    void processResponse(TDSReader tdsReader) throws SQLServerException {
        if (logger.isLoggable(Level.FINEST))
            logger.finest(this.toString() + ": Processing response");
        try {
            TDSParser.parse(tdsReader, getLogContext());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

            if (logger.isLoggable(Level.FINEST))
                logger.finest(this.toString() + ": Ignoring error from database: " + e.getMessage());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

    final void log(Level level, String message) {
        logger.log(level, toString() + ": " + message);
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                if (bytesRead < 0) {
                    if (logger.isLoggable(Level.FINER))
                        logger.finer(toString() + " Premature EOS in response. packetNum:" + packetNum
                                + " headerBytesRead:" + headerBytesRead);

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            if (packetLength < TDS.PACKET_HEADER_SIZE || packetLength > con.getTDSPacketSize()) {
                if (logger.isLoggable(Level.WARNING)) {
                    logger.warning(toString() + " TDS header contained invalid packet length:" + packetLength
                            + "; packet size:" + con.getTDSPacketSize());
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

            if (logger.isLoggable(Level.FINER))
                logger.finest(toString() + " Finishing TDS message by sending ignore bit and end of message");
            writePacket(TDS.STATUS_BIT_EOM | TDS.STATUS_BIT_ATTENTION);
            return true;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        } catch (IOException e) {
            if (logger.isLoggable(Level.FINER))
                logger.finer(toString() + " write failed:" + e.getMessage());

            con.terminate(SQLServerException.DRIVER_ERROR_IO_FAILED, e.getMessage(), e);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        if (valueLength > valueBytes.length) {
            if (logger.isLoggable(Level.WARNING)) {
                logger.warning(toString() + " Invalid value length:" + valueLength);
            }
            throwInvalidTDS();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

        if (logger.isLoggable(Level.FINEST)) {
            logger.finest(toString() + " Writing " + length + " bytes");
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        public void setOOBInline(boolean on) throws SocketException {
            if (logger.isLoggable(Level.FINER))
                logger.finer(toString() + " Ignoring setOOBInline");
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        public void setReuseAddress(boolean on) throws SocketException {
            if (logger.isLoggable(Level.FINER))
                logger.finer(toString() + " Ignoring setReuseAddress");
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            this.tdsChannel = tdsChannel;
            this.logger = tdsChannel.getLogger();
            this.logContext = tdsChannel.toString() + " (ProxySocket):";

            // Create the I/O streams
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            try {
                if (logger.isLoggable(Level.FINEST))
                    logger.finest(toString() + " Opening specified trust store: " + trustStoreFileName);

                is = new FileInputStream(trustStoreFileName);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            } catch (FileNotFoundException e) {
                if (logger.isLoggable(Level.FINE))
                    logger.fine(toString() + " Trust store not found: " + e.getMessage());

                // If the trustStoreFileName connection property is set, but the file is not found,
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            try {
                if (logger.isLoggable(Level.FINEST))
                    logger.finest(toString() + " Opening default trust store (from javax.net.ssl.trustStore): "
                            + trustStoreFileName);

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            } catch (FileNotFoundException e) {
                if (logger.isLoggable(Level.FINE))
                    logger.fine(toString() + " Trust store not found: " + e.getMessage());

                // If the javax.net.ssl.trustStore property is set, but the file is not found,
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            try {
                if (logger.isLoggable(Level.FINEST))
                    logger.finest(toString() + " Opening default trust store: " + JSSECACERTS);

                is = new FileInputStream(JSSECACERTS);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            } catch (FileNotFoundException e) {
                if (logger.isLoggable(Level.FINE))
                    logger.fine(toString() + " Trust store not found: " + e.getMessage());
            }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                try {
                    if (logger.isLoggable(Level.FINEST))
                        logger.finest(toString() + " Opening default trust store: " + CACERTS);

                    is = new FileInputStream(CACERTS);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                } catch (FileNotFoundException e) {
                    if (logger.isLoggable(Level.FINE))
                        logger.fine(toString() + " Trust store not found: " + e.getMessage());

                    // No jssecerts or cacerts. Treat it as if the trust store is empty so that
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        public void setTrafficClass(int tc) throws SocketException {
            if (logger.isLoggable(Level.FINER))
                logger.finer(toString() + " Ignoring setTrafficClass");
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        } catch (IOException e) {
            if (logger.isLoggable(Level.FINE))
                logger.fine(toString() + " read failed:" + e.getMessage());

            if (e instanceof SocketTimeoutException) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                break;
            default:
                assert false : "Unexpected JDBC type " + jdbcType.toString();
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    final void endMessage() throws SQLServerException {
        if (logger.isLoggable(Level.FINEST))
            logger.finest(toString() + " Finishing TDS message");
        writePacket(TDS.STATUS_BIT_EOM);
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        public synchronized void setSendBufferSize(int size) throws SocketException {
            if (logger.isLoggable(Level.FINER))
                logger.finer(toString() + " Ignoring setSendBufferSize size:" + size);
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        try {
            if (logger.isLoggable(Level.FINER))
                logger.finer(toString() + " Enabling SSL...");

            String trustStoreFileName = con.activeConnectionProperties
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            if (TDS.ENCRYPT_OFF == con.getNegotiatedEncryptionLevel() || con.getTrustServerCertificate()) {
                if (logger.isLoggable(Level.FINER))
                    logger.finer(toString() + " SSL handshake will trust any certificate");

                tm = new TrustManager[] {new PermissiveX509TrustManager(this)};
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                if (isTDS8) {
                    if (logger.isLoggable(Level.FINEST))
                        logger.finest(toString() + " Verify server certificate for TDS 8");

                    if (null != hostNameInCertificate) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                } else {
                    if (logger.isLoggable(Level.FINER))
                        logger.finer(toString() + " SSL handshake will validate server certificate");

                    KeyStore ks = null;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                    if (null == trustStoreFileName && null == con.encryptedTrustStorePassword && !isTDS8) {
                        if (logger.isLoggable(Level.FINER)) {
                            logger.finer(toString() + " Using system default trust store and password");
                        }
                    } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                        // stored in Java Key Store (JKS) format.
                        if (logger.isLoggable(Level.FINEST))
                            logger.finest(toString() + " Finding key store interface");

                        ks = KeyStore.getInstance(trustStoreType);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                        // InputStream and close the stream.
                        if (logger.isLoggable(Level.FINEST))
                            logger.finest(toString() + " Loading key store");

                        char[] trustStorePassword = SecureStringUtil.getInstance()
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                                    if (logger.isLoggable(Level.FINE))
                                        logger.fine(
                                                toString() + " Ignoring error closing trust material InputStream...");
                                }
                            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

                    if (logger.isLoggable(Level.FINEST))
                        logger.finest(toString() + " Locating X.509 trust manager factory");

                    tmfDefaultAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                    // validate the server certificate using the trust material in the KeyStore.
                    if (logger.isLoggable(Level.FINEST))
                        logger.finest(toString() + " Getting trust manager");

                    tmf.init(ks);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

            if (logger.isLoggable(Level.FINEST))
                logger.finest(toString() + " Getting TLS or better SSL context");

            KeyManager[] km = (null != clientCertificate && !clientCertificate.isEmpty()) ? SQLServerCertificateUtils
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

            if (logger.isLoggable(Level.FINEST))
                logger.finest(toString() + " Initializing SSL context");

            sslContext.init(km, tm, null);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            // Initially, the proxy is set to encapsulate the SSL handshake in TDS packets.
            if (logger.isLoggable(Level.FINEST))
                logger.finest(toString() + " Creating SSL socket");

            proxySocket = new ProxySocket(this);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            // At long last, start the SSL handshake ...
            if (logger.isLoggable(Level.FINER))
                logger.finer(toString() + " Starting SSL handshake");

            // TLS 1.2 intermittent exception may happen here.
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

                if (logger.isLoggable(Level.FINEST)) {
                    logger.finest(toString() + " Application Protocol negotiated: "
                            + ((negotiatedProtocol == null) ? "null" : negotiatedProtocol));
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            // After SSL handshake is complete, re-wire proxy socket to use raw TCP/IP streams ...
            if (logger.isLoggable(Level.FINEST))
                logger.finest(toString() + " Rewiring proxy streams after handshake");

            proxySocket.setStreams(inputStream, outputStream);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            // ... and re-wire TDSChannel to use SSL streams.
            if (logger.isLoggable(Level.FINEST))
                logger.finest(toString() + " Getting SSL InputStream");

            inputStream = new ProxyInputStream(sslSocket.getInputStream());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

            if (logger.isLoggable(Level.FINEST))
                logger.finest(toString() + " Getting SSL OutputStream");

            outputStream = sslSocket.getOutputStream();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

            if (logger.isLoggable(Level.FINER))
                logger.finer(toString() + " SSL enabled");

        } catch (Exception e) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        public synchronized void setReceiveBufferSize(int size) throws SocketException {
            if (logger.isLoggable(Level.FINER))
                logger.finer(toString() + " Ignoring setReceiveBufferSize size:" + size);
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    final void throwInvalidTDS() throws SQLServerException {
        if (logger.isLoggable(Level.SEVERE))
            logger.severe(toString() + " got unexpected value in TDS response at offset:" + payloadOffset);
        con.throwInvalidTDS();
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    void disableSSL() {
        if (logger.isLoggable(Level.FINER)) {
            logger.finer(toString() + " Disabling SSL...");
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            if (proxySocket == null) {
                if (logger.isLoggable(Level.INFO))
                    logger.finer(toString() + " proxySocket is null, exit early");
                return;
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            // Rewire the proxy socket to the closed streams
            if (logger.isLoggable(Level.FINEST))
                logger.finest(toString() + " Rewiring proxy streams for SSL socket close");
            proxySocket.setStreams(is, os);

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            try {
                if (logger.isLoggable(Level.FINER))
                    logger.finer(toString() + " Closing SSL socket");

                sslSocket.close();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

        if (logger.isLoggable(Level.FINER))
            logger.finer(toString() + " SSL disabled");
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        } catch (IOException e) {
            if (logger.isLoggable(Level.FINER))
                logger.finer(toString() + " flush failed:" + e.getMessage());

            con.terminate(SQLServerException.DRIVER_ERROR_IO_FAILED, e.getMessage(), e);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

            if (logger.isLoggable(Level.FINEST))
                logger.finest(toString() + " Skipping " + bytesToSkip + " bytes from offset " + payloadOffset);

            bytesSkipped += bytesToSkip;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        if (isStreaming) {
            if (logger.isLoggable(Level.FINEST))
                logger.finest(toString() + " Moving to next packet -- unlinking consumed packet");

            consumedPacket.next = null;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            } catch (SQLServerException interruptException) {
                if (logger.isLoggable(Level.FINE))
                    logger.fine(this.toString() + ": Ignoring error in sending attention: "
                            + interruptException.getMessage());
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

                default:
                    assert false : "Unexpected JDBC type " + jdbcType.toString();
            }
            // Column name - must be null (from TDS - TVP_COLMETADATA)
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            try {
                if (logger.isLoggable(Level.FINEST)) {
                    logger.finest(toString() + "(networkSocketStillConnected) Checking for socket disconnect.");
                }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                } catch (SocketException e) {
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(toString()
                                + "(networkSocketStillConnected) channelSocket.getSoTimeout() failed. Unable to poll connection:"
                                + e.getMessage());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                    if (logger.isLoggable(Level.FINEST)) {
                        if (pollResult) {
                            logger.finest(toString() + "(networkSocketStillConnected) Network still connected.");
                        } else {
                            logger.finest(toString() + "(networkSocketStillConnected) Network disconnected:");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                            logger.finest(toString() + "(networkSocketStillConnected) Network still connected.");
                        } else {
                            logger.finest(toString() + "(networkSocketStillConnected) Network disconnected:");
                        }
                    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(
                                toString() + "(networkSocketStillConnected) getSoTimeout failed:" + se.getMessage());
                    }
                    return false;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

        if (logger.isLoggable(Level.FINEST))
            logger.finest(this.toString() + ": Buffering from: " + mark.toString());

        return mark;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        public void sendUrgentData(int data) throws IOException {
            if (logger.isLoggable(Level.FINER))
                logger.finer(toString() + " Ignoring sendUrgentData");
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        public void setSoLinger(boolean on, int linger) throws SocketException {
            if (logger.isLoggable(Level.FINER))
                logger.finer(toString() + " Ignoring setSoLinger");
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            this.messageStarted = false;
            this.logger = tdsChannel.getLogger();
            this.logContext = tdsChannel.toString() + " (SSLHandshakeOutputStream):";
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                isValid = false;
                if (logger.isLoggable(Level.FINER))
                    logger.finer(toString() + "TrustStoreType is required alongside with TrustStore.");
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    final void resetPooledConnection() {
        if (logger.isLoggable(Level.FINEST))
            logger.finest(toString() + " resetPooledConnection");
        sendResetConnection = TDS.STATUS_BIT_RESET_CONN;
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    final void throwInvalidTDSToken(String tokenName) throws SQLServerException {
        if (logger.isLoggable(Level.SEVERE))
            logger.severe(toString() + " got unexpected value in TDS response at offset:" + payloadOffset);
        con.throwInvalidTDSToken(tokenName);
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            if (attentionPending) {
                if (logger.isLoggable(Level.SEVERE)) {
                    logger.severe(this.toString()
                            + ": expected attn ack missing or not processed; terminating connection...");
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

        if (logger.isLoggable(Level.FINEST))
            logger.finest(this.toString() + ": Reading response...");

        try {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        } catch (SQLServerException e) {
            if (logger.isLoggable(Level.FINEST))
                logger.finest(this.toString() + ": Exception reading response: " + e.getMessage());

            throw e;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        // it can happen, but it should have no effect.
        if (logger.isLoggable(Level.FINEST)) {
            logger.finest(toString() + " Ignoring interrupt of uninterruptable TDS command; Reason:" + reason);
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        public void shutdownOutput() throws IOException {
            if (logger.isLoggable(Level.FINER))
                logger.finer(toString() + " Ignoring shutdownOutput");
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            // Copy some bytes from the current packet to the destination value.
            if (logger.isLoggable(Level.FINEST))
                logger.finest(toString() + " Reading " + bytesToCopy + " bytes from offset " + payloadOffset);

            System.arraycopy(currentPacket.payload, payloadOffset, value, valueOffset + bytesRead, bytesToCopy);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        public void shutdownInput() throws IOException {
            if (logger.isLoggable(Level.FINER))
                logger.finer(toString() + " Ignoring shutdownInput");
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

        if (Util.isActivityTraceOn() && connectionlogger.isLoggable(Level.FINER)) {
            connectionlogger.finer(toString() + " ActivityId " + activityId);
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        if (connectionlogger.isLoggable(Level.FINER)) {
            connectionlogger.finer(
                    toString() + " Requesting encryption level:" + TDS.getEncryptionLevel(requestedEncryptionLevel));
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        // Write the entire prelogin request
        if (tdsChannel.isLoggingPackets())
            tdsChannel.logPacket(preloginRequest, 0, preloginRequest.length, toString() + " Prelogin request");

        try {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        } catch (SQLServerException e) {
            connectionlogger.warning(
                    toString() + preloginErrorLogString + " Error sending prelogin request: " + e.getMessage());
            throw e;
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            } catch (SQLServerException e) {
                connectionlogger.warning(
                        toString() + preloginErrorLogString + " Error reading prelogin response: " + e.getMessage());
                throw e;
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            if (-1 == bytesRead) {
                if (connectionlogger.isLoggable(Level.WARNING)) {
                    connectionlogger.warning(toString() + preloginErrorLogString
                            + " Unexpected end of prelogin response after " + responseBytesRead + " bytes read");
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

            if (tdsChannel.isLoggingPackets())
                tdsChannel.logPacket(preloginResponse, responseBytesRead, bytesRead, toString() + " Prelogin response");

            responseBytesRead += bytesRead;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                if (TDS.PKT_REPLY != preloginResponse[0]) {
                    if (connectionlogger.isLoggable(Level.WARNING)) {
                        connectionlogger.warning(toString() + preloginErrorLogString + " Unexpected response type:"
                                + preloginResponse[0]);
                    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                if (TDS.STATUS_BIT_EOM != (TDS.STATUS_BIT_EOM & preloginResponse[1])) {
                    if (connectionlogger.isLoggable(Level.WARNING)) {
                        connectionlogger.warning(toString() + preloginErrorLogString + " Unexpected response status:"
                                + preloginResponse[1]);
                    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                if (responseLength >= preloginResponse.length) {
                    if (connectionlogger.isLoggable(Level.WARNING)) {
                        connectionlogger.warning(toString() + preloginErrorLogString + " Response length:"
                                + responseLength + " is greater than allowed length:" + preloginResponse.length);
                    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            if (responseIndex >= responseLength) {
                if (connectionlogger.isLoggable(Level.WARNING)) {
                    connectionlogger.warning(toString() + " Option token not found");
                }
                throwInvalidTDS();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            if (responseIndex + 4 >= responseLength) {
                if (connectionlogger.isLoggable(Level.WARNING)) {
                    connectionlogger.warning(toString() + " Offset/Length not found for option:" + optionToken);
                }
                throwInvalidTDS();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            if (optionOffset + optionLength > responseLength) {
                if (connectionlogger.isLoggable(Level.WARNING)) {
                    connectionlogger.warning(toString() + " Offset:" + optionOffset + " and length:" + optionLength
                            + " exceed response length:" + responseLength);
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                    if (receivedVersionOption) {
                        if (connectionlogger.isLoggable(Level.WARNING)) {
                            connectionlogger.warning(toString() + " Version option already received");
                        }
                        throwInvalidTDS();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                    if (6 != optionLength) {
                        if (connectionlogger.isLoggable(Level.WARNING)) {
                            connectionlogger.warning(toString() + " Version option length:" + optionLength
                                    + " is incorrect.  Correct value is 6.");
                        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                    if (serverMajorVersion < 9) {
                        if (connectionlogger.isLoggable(Level.WARNING)) {
                            connectionlogger.warning(toString() + " Server major version:" + serverMajorVersion
                                    + " is not supported by this driver.");
                        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                    if (connectionlogger.isLoggable(Level.FINE))
                        connectionlogger
                                .fine(toString() + " Server returned major version:" + preloginResponse[optionOffset]);

                    receivedVersionOption = true;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                    if (TDS.ENCRYPT_INVALID != negotiatedEncryptionLevel) {
                        if (connectionlogger.isLoggable(Level.WARNING)) {
                            connectionlogger.warning(toString() + " Encryption option already received");
                        }
                        throwInvalidTDS();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                    if (1 != optionLength) {
                        if (connectionlogger.isLoggable(Level.WARNING)) {
                            connectionlogger.warning(toString() + " Encryption option length:" + optionLength
                                    + " is incorrect.  Correct value is 1.");
                        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                            && TDS.ENCRYPT_NOT_SUP != negotiatedEncryptionLevel) {
                        if (connectionlogger.isLoggable(Level.WARNING)) {
                            connectionlogger.warning(toString() + " Server returned "
                                    + TDS.getEncryptionLevel(negotiatedEncryptionLevel));
                        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

                    if (connectionlogger.isLoggable(Level.FINER))
                        connectionlogger.finer(toString() + " Negotiated encryption level:"
                                + TDS.getEncryptionLevel(negotiatedEncryptionLevel));

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

                        if (connectionlogger.isLoggable(Level.WARNING)) {
                            connectionlogger.warning(toString() + " Client requested encryption level: "
                                    + TDS.getEncryptionLevel(requestedEncryptionLevel)
                                    + " Server returned unexpected encryption level: "
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                    if (0 != preloginResponse[optionOffset] && 1 != preloginResponse[optionOffset]) {
                        if (connectionlogger.isLoggable(Level.SEVERE)) {
                            connectionlogger.severe(toString()
                                    + " Server sent an unexpected value for FedAuthRequired PreLogin Option. Value was "
                                    + preloginResponse[optionOffset]);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                default:
                    if (connectionlogger.isLoggable(Level.FINER))
                        connectionlogger.finer(toString() + " Ignoring prelogin response option:" + optionToken);
                    break;
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            if (connectionlogger.isLoggable(Level.WARNING)) {
                connectionlogger
                        .warning(toString() + " Prelogin response is missing version and/or encryption option.");
            }
            throwInvalidTDS();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
    public String toString() {
        if (null != clientConnectionId)
            return traceID + " ClientConnectionId: " + clientConnectionId.toString();
        else
            return traceID;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
             * be invalid if the statement fails to close, even though query execution succeeded.
             */
            connectionlogger.fine(toString() + " Exception checking connection validity: " + e.getMessage());
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                        // wait for connectRetryInterval before retry
                        if (connectionlogger.isLoggable(Level.FINEST)) {
                            connectionlogger.finest(toString() + "Connection failed on transient error "
                                    + sqlServerError.getErrorNumber() + ". Wait for connectRetryInterval("
                                    + connectRetryInterval + ")s before retry.");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        loggerExternal.entering(loggingClassName, "setCatalog", catalog);
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        // Make the initial tcp-ip connection.
        if (connectionlogger.isLoggable(Level.FINE)) {
            connectionlogger.fine(toString() + " Connecting with server: " + serverInfo.getServerName() + " port: "
                    + serverInfo.getPortNumber() + " Timeout slice: " + timeOutSliceInMillis + " Timeout Full: "
                    + timeOutFullInSeconds);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            // load seems to contribute to likelihood. Retry once to mitigate.
            if (connectionlogger.isLoggable(Level.FINER)) {
                connectionlogger.finer(toString() + " Generating a random UUID has failed due to : " + e.getMessage()
                        + "Retrying once.");
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                    .getOriginalNegotiatedEncryptionLevel()) {
                if (connectionlogger.isLoggable(Level.WARNING)) {
                    connectionlogger.warning(toString()
                            + " The server did not preserve SSL encryption during a recovery attempt, connection recovery is not possible.");
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                    if (trustServerCertificate) {
                        if (loggerExternal.isLoggable(Level.FINER))
                            loggerExternal.finer(toString() + " ignore trustServerCertificate for strict");
                    }
                    // do not trust server cert for strict
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                if (tdsPacketSize > sslRecordSize) {
                    if (connectionlogger.isLoggable(Level.FINER)) {
                        connectionlogger.finer(toString() + " Negotiated tdsPacketSize " + tdsPacketSize
                                + " is too large for SSL with JRE " + Util.SYSTEM_JRE + " (max size is " + sslRecordSize
                                + ")");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

            if (connectionlogger.isLoggable(Level.FINER)) {
                connectionlogger.finer(toString() + " End of connect");
            }
        } finally {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        if (sessionRecovery.isReconnectRunning() && !sessionRecovery.isConnectionRecoveryPossible()) {
            if (connectionlogger.isLoggable(Level.WARNING)) {
                connectionlogger.warning(this.toString()
                        + "SessionRecovery feature extension ack was not sent by the server during reconnection.");
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

        if (connectionlogger.isLoggable(Level.FINER)) {
            connectionlogger.fine(toString() + " FEDAUTHINFO token stream length = " + tokenLen);
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            // the token must at least contain a DWORD(length is 4 bytes) indicating the number of info IDs
            if (connectionlogger.isLoggable(Level.SEVERE)) {
                connectionlogger.severe(toString() + "FEDAUTHINFO token stream length too short for CountOfInfoIDs.");
            }
            throw new SQLServerException(
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

        if (connectionlogger.isLoggable(Level.FINER)) {
            connectionlogger.fine(toString() + " CountOfInfoIDs = " + optionsCount);
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            if (connectionlogger.isLoggable(Level.FINER)) {
                connectionlogger
                        .fine(toString() + " Read rest of FEDAUTHINFO token stream: " + Arrays.toString(tokenData));
            }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

                if (connectionlogger.isLoggable(Level.FINER)) {
                    connectionlogger.fine(toString() + " FedAuthInfoOpt: ID=" + id + ", DataLen=" + dataLen
                            + ", Offset=" + dataOffset);
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                if (dataOffset < totalOptionsSize || dataOffset >= tokenLen) {
                    if (connectionlogger.isLoggable(Level.SEVERE)) {
                        connectionlogger.severe(toString() + "FedAuthInfoDataOffset points to an invalid location.");
                    }
                    MessageFormat form = new MessageFormat(
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                    data = new String(dataArray, UTF_16LE);
                } catch (Exception e) {
                    connectionlogger.severe(toString() + "Failed to read FedAuthInfoData.");
                    throw new SQLServerException(SQLServerException.getErrString("R_FedAuthInfoFailedToReadData"), e);
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

                if (connectionlogger.isLoggable(Level.FINER)) {
                    connectionlogger.fine(toString() + " FedAuthInfoData: " + data);
                }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                        if (connectionlogger.isLoggable(Level.FINER)) {
                            connectionlogger
                                    .fine(toString() + " Ignoring unknown federated authentication info option: " + id);
                        }
                        break;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            if (connectionlogger.isLoggable(Level.SEVERE)) {
                connectionlogger.severe(
                        toString() + "FEDAUTHINFO token stream is not long enough to contain the data it claims to.");
            }
            MessageFormat form = new MessageFormat(
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            // We should be receiving both stsurl and spn
            if (connectionlogger.isLoggable(Level.SEVERE)) {
                connectionlogger.severe(toString() + "FEDAUTHINFO token stream does not contain both STSURL and SPN.");
            }
            throw new SQLServerException(SQLServerException.getErrString("R_FedAuthInfoDoesNotContainStsurlAndSpn"),
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        loggerExternal.entering(loggingClassName, "rollback");
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            if (dataLength < 7) {
                if (connectionlogger.isLoggable(Level.SEVERE))
                    connectionlogger.severe(toString()
                            + "SESSIONSTATETOKEN token stream is not long enough to contain the data it claims to.");
                sessionRecovery.getSessionStateTable().setMasterRecoveryDisabled(true);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            if (dataBytesRead != dataLength) {
                if (connectionlogger.isLoggable(Level.SEVERE))
                    connectionlogger.severe(toString() + " Session State data length is corrupt.");
                sessionRecovery.getSessionStateTable().setMasterRecoveryDisabled(true);
                tdsReader.throwInvalidTDS();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            if (connectionlogger.isLoggable(Level.SEVERE))
                connectionlogger
                        .severe(toString() + " Session state received when session recovery was not negotiated.");
            tdsReader.throwInvalidTDSToken(TDS.getTokenName(tdsReader.peekTokenType()));
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        loggerExternal.entering(loggingClassName, "rollback", s);
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        loggerExternal.entering(loggingClassName, "commit");
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        if (maxFieldSize != limit) {
            if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
                loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
            }
            // If no limit on field size, set text size to max (2147483647), NOT default (0 --> 4K)
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                instancePort = getInstancePort(primary, primaryInstanceName);
                if (connectionlogger.isLoggable(Level.FINER))
                    connectionlogger.fine(toString() + " SQL Server port returned by SQL Browser: " + instancePort);
                try {
                    if (null != instancePort) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        loggingClassName += ":" + connectionID;
        if (connectionlogger.isLoggable(Level.FINE))
            connectionlogger.fine(toString() + " created by (" + parentInfo + ")");
        initResettableValues();

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        loggerExternal.entering(loggingClassName, SET_SAVE_POINT);
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                if (connectionlogger.isLoggable(Level.FINER)) {
                    connectionlogger.fine(
                            toString() + " Received feature extension acknowledgement for federated authentication.");
                }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                if (!federatedAuthenticationRequested) {
                    if (connectionlogger.isLoggable(Level.SEVERE)) {
                        connectionlogger.severe(toString() + " Did not request federated authentication.");
                    }
                    MessageFormat form = new MessageFormat(
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                        if (0 != data.length) {
                            if (connectionlogger.isLoggable(Level.SEVERE)) {
                                connectionlogger.severe(toString()
                                        + " Federated authentication feature extension ack for ADAL and Security Token includes extra data.");
                            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                        if (connectionlogger.isLoggable(Level.SEVERE)) {
                            connectionlogger.severe(
                                    toString() + " Attempting to use unknown federated authentication library.");
                        }
                        MessageFormat form = new MessageFormat(
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            case TDS.TDS_FEATURE_EXT_AE: {
                if (connectionlogger.isLoggable(Level.FINER)) {
                    connectionlogger.fine(toString() + " Received feature extension acknowledgement for AE.");
                }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                if (connectionlogger.isLoggable(Level.FINER)) {
                    connectionlogger
                            .fine(toString() + " Received feature extension acknowledgement for Data Classification.");
                }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            case TDS.TDS_FEATURE_EXT_UTF8SUPPORT: {
                if (connectionlogger.isLoggable(Level.FINER)) {
                    connectionlogger.fine(toString() + " Received feature extension acknowledgement for UTF8 support.");
                }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                if (connectionlogger.isLoggable(Level.FINER)) {
                    connectionlogger.fine(
                            toString() + " Received feature extension acknowledgement for Azure SQL DNS Caching.");
                }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                if (connectionlogger.isLoggable(Level.FINER)) {
                    connectionlogger.fine(
                            toString() + " Received feature extension acknowledgement for Idle Connection Resiliency.");
                }
                sessionRecovery.parseInitialSessionStateData(data,
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

        if (connectionlogger.isLoggable(Level.FINER)) {
            connectionlogger.finer(toString() + " Start time: " + timerStart + " Time out time: " + timerExpire
                    + " Timeout Unit Interval: " + timeoutUnitInterval);
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                if (connectionlogger.isLoggable(Level.FINE)) {
                    connectionlogger
                            .fine(toString() + " This attempt server name: " + currentConnectPlaceHolder.getServerName()
                                    + " port: " + currentConnectPlaceHolder.getPortNumber() + " InstanceName: "
                                    + currentConnectPlaceHolder.getInstanceName() + " useParallel: " + useParallel);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                                    + " port: " + currentConnectPlaceHolder.getPortNumber() + " InstanceName: "
                                    + currentConnectPlaceHolder.getInstanceName() + " useParallel: " + useParallel);
                    connectionlogger.fine(toString() + " This attempt endtime: " + intervalExpire);
                    connectionlogger.fine(toString() + " This attempt No: " + attemptNumber);
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                                    + currentConnectPlaceHolder.getInstanceName() + " useParallel: " + useParallel);
                    connectionlogger.fine(toString() + " This attempt endtime: " + intervalExpire);
                    connectionlogger.fine(toString() + " This attempt No: " + attemptNumber);
                }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            if (!isDBMirroring || (1 == attemptNumber % 2)) {
                if (connectionlogger.isLoggable(Level.FINE)) {
                    connectionlogger.fine(toString() + " sleeping milisec: " + sleepInterval);
                }
                try {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

                if (connectionlogger.isLoggable(Level.FINE)) {
                    connectionlogger.fine(toString() + " adding new failover info server: "
                            + activeConnectionProperties.getProperty(serverNameProperty) + " instance: "
                            + activeConnectionProperties.getProperty(instanceNameProperty) + " database: "
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            loggerExternal.entering(loggingClassName, "setTransactionIsolation", level);
            if (Util.isActivityTraceOn()) {
                loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            loggerExternal.entering(loggingClassName, "setAutoCommit", newAutoCommitMode);
            if (Util.isActivityTraceOn())
                loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        String commitPendingTransaction = "";
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        if (connectionlogger.isLoggable(Level.FINER)) {
            connectionlogger.finer(
                    toString() + " Autocommitmode current :" + databaseAutoCommitMode + " new: " + newAutoCommitMode);
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        if (maxRows != limit) {
            if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
                loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
            }
            connectionCommand("SET ROWCOUNT " + limit, "setMaxRows");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkValidHoldability(holdability);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                        if (isConnectionDead()) {
                            if (connectionlogger.isLoggable(Level.FINER)) {
                                connectionlogger.finer(this.toString() + " Connection is detected to be broken.");
                            }
                            if (!sessionRecovery.isConnectionRecoveryPossible()
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                                if (connectionlogger.isLoggable(Level.FINER)) {
                                    connectionlogger.finer(
                                            this.toString() + "Connection is broken and recovery is not possible.");
                                }
                                throw sessionRecovery.getReconnectException();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        loggerExternal.entering(loggingClassName, SET_SAVE_POINT, sName);
        if (loggerExternal.isLoggable(Level.FINER) && Util.isActivityTraceOn()) {
            loggerExternal.finer(toString() + ACTIVITY_ID + ActivityCorrelator.getCurrent().toString());
        }
        checkClosed();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                browserResult = new String(receiveBuffer, 3, receiveBuffer.length - 3);
                if (connectionlogger.isLoggable(Level.FINER))
                    connectionlogger.fine(toString() + " Received SSRP UDP response from IP address: "
                            + udpResponse.getAddress().getHostAddress());
            } catch (IOException ioException) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            MessageFormat form = new MessageFormat(SQLServerException.getErrString("R_sqlBrowserFailed"));
            Object[] msgArgs = {server, instanceName, ioException.toString()};
            connectionlogger.log(Level.FINE, toString() + " " + lastErrorMessage, ioException);
            SQLServerException.makeFromDriverError(this, this, form.format(msgArgs),
                    SQLServerException.EXCEPTION_XOPEN_CONNECTION_CANT_ESTABLISH, false);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

        if (loggerExternal.isLoggable(java.util.logging.Level.FINEST)) {
            loggerExternal.finest("Getting FedAuth token " + fedAuthInfo.toString());
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                            if (connectionlogger.isLoggable(Level.FINER)) {
                                connectionlogger.fine(
                                        toString() + " SQLServerConnection.getFedAuthToken.AdalException category:"
                                                + errorCategory + " error: " + errorStatus);
                            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

                        if (connectionlogger.isLoggable(Level.FINER)) {
                            connectionlogger.fine(toString() + " SQLServerConnection.getFedAuthToken sleeping: "
                                    + sleepInterval + " milliseconds.");
                            connectionlogger.fine(toString() + " SQLServerConnection.getFedAuthToken remaining: "
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                            connectionlogger.fine(toString() + " SQLServerConnection.getFedAuthToken sleeping: "
                                    + sleepInterval + " milliseconds.");
                            connectionlogger.fine(toString() + " SQLServerConnection.getFedAuthToken remaining: "
                                    + millisecondsRemaining + " milliseconds.");
                        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

            if (connectionlogger.isLoggable(Level.FINER)) {
                connectionlogger.finer(toString() + " Connection closed and returned to connection pool");
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            if (0 != SQLServerConnection.globalSystemColumnEncryptionKeyStoreProviders.size()) {
                keyStores += ","
                        + SQLServerConnection.globalSystemColumnEncryptionKeyStoreProviders.keySet().toString();
            }
            return keyStores;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                }
                if (connectionlogger.isLoggable(Level.FINER))
                    connectionlogger.finer(toString() + " Network packet size is " + tdsPacketSize + " bytes");
                break;

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                        op = " enlisted";

                    connectionlogger.finer(toString() + op);
                }
                break;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                if (inXATransaction) {
                    if (connectionlogger.isLoggable(Level.FINER))
                        connectionlogger.finer(toString() + " rolled back. (DTC)");

                    // Do not clear the transaction descriptor if the connection is in DT.
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                } else {
                    if (connectionlogger.isLoggable(Level.FINER))
                        connectionlogger.finer(toString() + " rolled back");

                    Arrays.fill(getTransactionDescriptor(), (byte) 0);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            case ENVCHANGE_XACT_COMMIT:
                if (connectionlogger.isLoggable(Level.FINER))
                    connectionlogger.finer(toString() + " committed");

                Arrays.fill(getTransactionDescriptor(), (byte) 0);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            case ENVCHANGE_DTC_DEFECT:
                if (connectionlogger.isLoggable(Level.FINER))
                    connectionlogger.finer(toString() + " defected");

                Arrays.fill(getTransactionDescriptor(), (byte) 0);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            case ENVCHANGE_USER_INFO:
                if (connectionlogger.isLoggable(Level.FINER))
                    connectionlogger.finer(toString() + " Ignored env change: " + envchange);
                break;
            case ENVCHANGE_ROUTING:
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                } finally {
                    if (connectionlogger.isLoggable(Level.FINER)) {
                        connectionlogger.finer(toString() + " Received routing ENVCHANGE with the following values."
                                + " routingDataValueLength:" + routingDataValueLength + " protocol:" + routingProtocol
                                + " portNumber:" + routingPortNumber + " serverNameLength:" + routingServerNameLength
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

                        if (connectionlogger.isLoggable(Level.FINER)) {
                            connectionlogger.finer(toString() + "Using new host to validate the SSL certificate");
                        }
                    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            default:
                if (connectionlogger.isLoggable(Level.WARNING)) {
                    connectionlogger.warning(toString() + " Unknown environment change: " + envchange);
                }
                throwInvalidTDS();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        if (!idleNetworkTracker.isIdle()) {
            if (connectionlogger.isLoggable(Level.FINEST)) {
                connectionlogger.finest(toString() + " Network not idle. Skipping networkSocketStillConnected check.");
            }
            return false;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                if (connectionlogger.isLoggable(Level.FINEST)) {
                    connectionlogger
                            .finest(toString() + " Network not idle. Skipping networkSocketStillConnected check.");
                }
                return false;
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'ConcurrentHashMap.containsKey()'
in `src/main/java/com/microsoft/sqlserver/jdbc/SimpleTtlCache.java`
#### Snippet
```java
     */
    boolean contains(Object key) {
        return cache.containsKey(key);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'ConcurrentHashMap.get()'
in `src/main/java/com/microsoft/sqlserver/jdbc/SimpleTtlCache.java`
#### Snippet
```java
     */
    V get(Object key) {
        return cache.get(key);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
  @Override
  public boolean remove(Object key, Object value) {
    final Node<K, V> node = data.get(key);
    if ((node == null) || (value == null)) {
      return false;
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
      }
      Entry<?, ?> entry = (Entry<?, ?>) obj;
      Node<K, V> node = map.data.get(entry.getKey());
      return (node != null) && (node.getValue().equals(entry.getValue()));
    }
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
   */
  public V getQuietly(Object key) {
    final Node<K, V> node = data.get(key);
    return (node == null) ? null : node.getValue();
  }
```

### SuspiciousMethodCalls
Suspicious call to 'ConcurrentLinkedHashMap.remove()'
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
      }
      Entry<?, ?> entry = (Entry<?, ?>) obj;
      return map.remove(entry.getKey(), entry.getValue());
    }
  }
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `QueryMeta` may be 'static'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerParameterMetaData.java`
#### Snippet
```java

    /* Used for prepared statement meta data */
    class QueryMeta {
        String parameterClassName = null;
        int parameterType = 0;
```

### InnerClassMayBeStatic
Inner class `ExecuteProperties` may be 'static'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     * Encapsulates a subset of statement property values as they were set at execution time.
     */
    final class ExecuteProperties {
        final private boolean wasResponseBufferingSet;

```

### InnerClassMayBeStatic
Inner class `ColumnMetadata` may be 'static'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkRecord.java`
#### Snippet
```java
     * Class to represent the column metadata
     */
    protected class ColumnMetadata {
        String columnName;
        int columnType;
```

### InnerClassMayBeStatic
Inner class `HandleAssociation` may be 'static'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
    }

    final class HandleAssociation {
        Map<String, CallableStatement> statementMap;
        boolean nullCatalog = false;
```

### InnerClassMayBeStatic
Inner class `ColumnMapping` may be 'static'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
     * Represents the column mappings between the source and destination table
     */
    private class ColumnMapping implements Serializable {
        /**
         * Always update serialVersionUID when prompted.
```

### InnerClassMayBeStatic
Inner class `BulkColumnMetaData` may be 'static'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
     * Metadata for the destination table columns
     */
    class BulkColumnMetaData {
        String columnName;
        SSType ssType = null;
```

### InnerClassMayBeStatic
Inner class `ProxyOutputStream` may be 'static'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * FilteredOutputStream transforms block writes to sequences of single-byte writes.
     */
    final class ProxyOutputStream extends OutputStream {
        private OutputStream filteredStream;

```

### InnerClassMayBeStatic
Inner class `TdsOrderUnique` may be 'static'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    }

    private class TdsOrderUnique {
        int columnOrdinal;
        byte flags;
```

### InnerClassMayBeStatic
Inner class `SSLHandshakeOutputStream` may be 'static'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * in TDS messages) to the TDS channel.
     */
    private class SSLHandshakeOutputStream extends OutputStream {
        private final TDSWriter tdsWriter;

```

### InnerClassMayBeStatic
Inner class `SqlFedAuthInfo` may be 'static'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
    }

    class SqlFedAuthInfo {
        String spn;
        String stsurl;
```

### InnerClassMayBeStatic
Inner class `IdleNetworkTracker` may be 'static'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * checking the socket for a disconnect every command execution, which has a high impact on perf.
     */
    class IdleNetworkTracker {
        private Instant lastNetworkActivity = Instant.now();

```

### InnerClassMayBeStatic
Inner class `ActiveDirectoryAuthentication` may be 'static'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
    }

    class ActiveDirectoryAuthentication {
        static final String JDBC_FEDAUTH_CLIENT_ID = "7f98cb04-cd1e-40df-9140-3bf7e2cea4db";

```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerParameterMetaData.java`
#### Snippet
```java
            int mapIndex = 1;
            for (int i = 0; i < columns.size(); i++) {
                /**
                 * For INSERT table VALUES(?,?,?...) scenarios where the column names are not specifically defined after
                 * the table name, the parser adds a '*' followed by '?'s equal to the number of parameters in the
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java
abstract class SQLServerSpatialDatatype {

    /** WKT = Well-Known-Text, WKB = Well-Knwon-Binary, CLR = Client Runtime Language */
    /**
     * As a general rule, the ~IndexEnd variables are non-inclusive (i.e. pointIndexEnd = 8 means the shape using it
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
    private transient ResultSet autoGeneratedKeys;

    /**
     * The array of objects in a batched call. Applicable to statements and prepared statements When the
     * iterativeBatching property is turned on.
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
        traceID = classN + ":" + statementID;

        /** logging classname */
        loggingClassName = "com.microsoft.sqlserver.jdbc." + classN + ":" + statementID;

```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     */
    final boolean getNextResult(boolean clearFlag) throws SQLServerException {
        /**
         * TDS response token stream handler used to locate the next result in the TDS response token stream.
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/mssql/security/provider/MD4.java`
#### Snippet
```java
 */

/**
 * This code is extracted from org.bouncycastle.crypto.digests.MD4Digest and modified to remove dependencies.
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java

                case SQL_VARIANT:
                    /**
                     * SQL_Variant has the following structure: 1- basetype: the underlying type 2- probByte: holds
                     * count of property bytes expected for a sql_variant structure 3- properties: For example VARCHAR
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/sqlserver/jdbc/NTLMAuthentication.java`
#### Snippet
```java
            msg = token.array();

            /**
             * Section 3.1.5.1.2 Client Receives a CHALLENGE_MESSAGE from the Server
             * 
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/sqlserver/jdbc/NTLMAuthentication.java`
#### Snippet
```java
        token.put(NTLM_CLIENT_CHALLENGE_RESERVED3);

        /**
         * Section 3.1.5.1.2 Client Receives a CHALLENGE_MESSAGE from the Server
         *
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/sqlserver/jdbc/NTLMAuthentication.java`
#### Snippet
```java
        }

        /**
         * Section 2.2.2.1 AV_PAIR
         *
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCSVFileRecord.java`
#### Snippet
```java
    private static final long serialVersionUID = 1546487135640225989L;

    /**
     * Resources associated with reading in the file
     */
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCallableStatement.java`
#### Snippet
```java

    private void skipOutParameters(int numParamsToSkip, boolean discardValues) throws SQLServerException {
        /** TDS token handler for locating OUT parameters (RETURN_VALUE tokens) in the response token stream */
        final class OutParamHandler extends TDSTokenHandler {
            final StreamRetValue srv = new StreamRetValue();
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
            return rs;
        } else {
            /**
             * Can't actually switchCatalogs on Azure DW. This is here to keep consistency in behavior with SQL Azure DB
             * when user provides a different catalog than the one they're currently connected to. Will throw exception
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
        tdsWriter.writeBytes(userType);

        /**
         * Flags token - Bit flags in least significant bit order https://msdn.microsoft.com/en-us/library/dd357363.aspx
         * flags[0] = (byte) 0x05; flags[1] = (byte) 0x00;
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
        int destColumnIndex = columnMappings.get(idx).destinationColumnOrdinal;

        /**
         * TYPE_INFO FIXEDLENTYPE Example INT: tdsWriter.writeByte((byte) 0x38);
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
    private boolean sendTemporalDataTypesAsStringForBulkCopy = true;

    /**
     * https://docs.microsoft.com/sql/t-sql/functions/serverproperty-transact-sql
     */
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                try {

                    /**
                     * If currentCommand needs to be detached, reset Counter to acknowledge number of Bytes in remaining
                     * packets
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                }
            }
            /**
             * Add Counter reference to newCommand
             */
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `property` declared in one 'switch' branch and used in another
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
        switch (state) {
            case inServerName:
                String property = result.toString().trim();
                if (property.length() > 0) {
                    if (logger.isLoggable(Level.FINE)) {
```

### SwitchStatementWithConfusingDeclaration
Local variable `actualNumberOfPoints` declared in one 'switch' branch and used in another
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java
            case GEOMETRYCOLLECTION:
                totalSize += NUMBER_OF_SHAPES_SIZE; // number of shapes
                int actualNumberOfPoints = numberOfPoints;
                for (Segment s : segments) {
                    if (s.getSegmentType() == SEGMENT_FIRST_ARC || s.getSegmentType() == SEGMENT_FIRST_LINE) {
```

### SwitchStatementWithConfusingDeclaration
Local variable `numberOfCompositeCurves` declared in one 'switch' branch and used in another
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java
                    }
                }
                int numberOfCompositeCurves = 0;
                for (Figure f : figures) {
                    if (f.getFiguresAttribute() == FA_COMPOSITE_CURVE) {
```

### SwitchStatementWithConfusingDeclaration
Local variable `subSecondNanos` declared in one 'switch' branch and used in another
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                utcMillis = ((java.sql.Timestamp) colValue).getTime();
                calendar.setTimeInMillis(utcMillis);
                int subSecondNanos;
                if (colValue instanceof java.sql.Timestamp) {
                    subSecondNanos = ((java.sql.Timestamp) colValue).getNanos();
```

### SwitchStatementWithConfusingDeclaration
Local variable `length` declared in one 'switch' branch and used in another
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java

            case BIGCHAR:
                int length = colValue.toString().length();
                writeBulkCopySqlVariantHeader(9 + length, TDSType.BIGCHAR.byteValue(), (byte) 7, tdsWriter);
                tdsWriter.writeCollationForSqlVariant(variantType); // writes collation info and sortID
```

### SwitchStatementWithConfusingDeclaration
Local variable `destCollation` declared in one 'switch' branch and used in another
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                tdsWriter.writeCollationForSqlVariant(variantType); // writes collation info and sortID
                tdsWriter.writeShort((short) (length));
                SQLCollation destCollation = destColumnMetadata.get(destColOrdinal).collation;
                if (null != destCollation) {
                    tdsWriter.writeBytes(colValue.toString()
```

### SwitchStatementWithConfusingDeclaration
Local variable `stringLength` declared in one 'switch' branch and used in another
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                writeBulkCopySqlVariantHeader(9 + length, TDSType.NCHAR.byteValue(), (byte) 7, tdsWriter);
                tdsWriter.writeCollationForSqlVariant(variantType); // writes collation info and sortID
                int stringLength = colValue.toString().length();
                byte[] typevarlen = new byte[2];
                typevarlen[0] = (byte) (2 * stringLength & 0xFF);
```

### SwitchStatementWithConfusingDeclaration
Local variable `typevarlen` declared in one 'switch' branch and used in another
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                tdsWriter.writeCollationForSqlVariant(variantType); // writes collation info and sortID
                int stringLength = colValue.toString().length();
                byte[] typevarlen = new byte[2];
                typevarlen[0] = (byte) (2 * stringLength & 0xFF);
                typevarlen[1] = (byte) ((2 * stringLength >> 8) & 0xFF);
```

### SwitchStatementWithConfusingDeclaration
Local variable `b` declared in one 'switch' branch and used in another
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java

            case BIGBINARY:
                byte[] b = (byte[]) colValue;
                length = b.length;
                writeBulkCopySqlVariantHeader(4 + length, TDSType.BIGVARBINARY.byteValue(), (byte) 2, tdsWriter);
```

## RuleId[id=UnnecessaryInitCause]
### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `src/main/java/com/microsoft/sqlserver/jdbc/ReaderInputStream.java`
#### Snippet
```java
                        detailMessage = SQLServerException.getErrString("R_streamReadReturnedInvalidValue");
                    IOException ioException = new IOException(detailMessage);
                    ioException.initCause(e);
                    throw ioException;
                }
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/com/microsoft/sqlserver/jdbc/StreamColInfo.java`
#### Snippet
```java

    void setFromTDS(TDSReader tdsReader) throws SQLServerException {
        if (TDS.TDS_COLINFO != tdsReader.readUnsignedByte())
            assert false : "Not a COLINFO token";

```

### TrivialIf
`if` statement can be simplified
in `src/main/java/com/microsoft/sqlserver/jdbc/StreamRetValue.java`
#### Snippet
```java

    void setFromTDS(TDSReader tdsReader) throws SQLServerException {
        if (TDS.TDS_RETURN_VALUE != tdsReader.readUnsignedByte())
            assert false;
        ordinalOrLength = tdsReader.readUnsignedShort();
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerParameterMetaData.java`
#### Snippet
```java

                    // if rsProcedureMeta has next row, it means the stored procedure is found
                    if (rsProcedureMeta.next()) {
                        procedureIsFound = true;
                    } else {
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/com/microsoft/sqlserver/jdbc/StreamRetStatus.java`
#### Snippet
```java

    void setFromTDS(TDSReader tdsReader) throws SQLServerException {
        if (TDS.TDS_RET_STAT != tdsReader.readUnsignedByte())
            assert false;
        status = tdsReader.readInt();
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerError.java`
#### Snippet
```java

    void setFromTDS(TDSReader tdsReader) throws SQLServerException {
        if (TDS.TDS_ERR != tdsReader.readUnsignedByte())
            assert false;
        setContentsFromTDS(tdsReader);
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/com/microsoft/sqlserver/jdbc/StreamInfo.java`
#### Snippet
```java

    void setFromTDS(TDSReader tdsReader) throws SQLServerException {
        if (TDS.TDS_MSG != tdsReader.readUnsignedByte())
            assert false;
        msg.setContentsFromTDS(tdsReader);
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/com/microsoft/sqlserver/jdbc/StreamColumns.java`
#### Snippet
```java
     */
    void setFromTDS(TDSReader tdsReader) throws SQLServerException {
        if (TDS.TDS_COLMETADATA != tdsReader.readUnsignedByte())
            assert false;

```

### TrivialIf
`if` statement can be simplified
in `src/main/java/com/microsoft/sqlserver/jdbc/StreamSSPI.java`
#### Snippet
```java

    void setFromTDS(TDSReader tdsReader) throws SQLServerException {
        if (TDS.TDS_SSPI != tdsReader.readUnsignedByte())
            assert false;
        int blobLength = tdsReader.readUnsignedShort();
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionCertificateStoreProvider.java`
#### Snippet
```java

    static {
        if (System.getProperty("os.name").toLowerCase(Locale.ENGLISH).startsWith("windows")) {
            isWindows = true;
        } else {
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
                // If the current command (whatever it was) produced an error then stop parsing and propagate it up.
                // In this case, the command is likely to be a RAISERROR, but it could be anything.
                if (doneToken.isError())
                    return false;

```

### TrivialIf
`if` statement can be simplified
in `src/main/java/com/microsoft/sqlserver/jdbc/StreamTabName.java`
#### Snippet
```java

    void setFromTDS(TDSReader tdsReader) throws SQLServerException {
        if (TDS.TDS_TABNAME != tdsReader.readUnsignedByte())
            assert false : "Not a TABNAME token";

```

### TrivialIf
`if` statement can be simplified
in `src/main/java/com/microsoft/sqlserver/jdbc/StreamLoginAck.java`
#### Snippet
```java

    void setFromTDS(TDSReader tdsReader) throws SQLServerException {
        if (TDS.TDS_LOGIN_ACK != tdsReader.readUnsignedByte())
            assert false;
        tdsReader.readUnsignedShort(); // length of this token stream
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
                // Consume the ROW token, leaving tdsReader at the start of
                // this row's column values.
                if (TDS.TDS_ROW != tdsReader.readUnsignedByte())
                    assert false;
                fetchBufferCurrentRowType = RowType.ROW;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
                // Consume the NBCROW token, leaving tdsReader at the start of
                // nullbitmap.
                if (TDS.TDS_NBCROW != tdsReader.readUnsignedByte())
                    assert false;

```

### TrivialIf
`if` statement can be simplified
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

        // actual logon failed (e.g. bad password)
        if ((SQLServerException.LOGON_FAILED == e.getErrorCode())
                // actual logon failed (e.g. password expired)
                || (SQLServerException.PASSWORD_EXPIRED == e.getErrorCode())
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
                        // name is never escaped!
                        name = name.trim();
                        if (name.length() <= 0) {
                            SQLServerException.makeFromDriverError(null, null,
                                    SQLServerException.getErrString("R_errorConnectionString"), null, true);
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/com/microsoft/sqlserver/jdbc/Geometry.java`
#### Snippet
```java
     */
    protected Geometry(byte[] clr) throws SQLServerException {
        if (null == clr || clr.length <= 0) {
            throwIllegalByteArray();
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/com/microsoft/sqlserver/jdbc/Geometry.java`
#### Snippet
```java
     */
    protected Geometry(String wkt, int srid) throws SQLServerException {
        if (null == wkt || wkt.length() <= 0) {
            throwIllegalWKT();
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/com/microsoft/sqlserver/jdbc/NTLMAuthentication.java`
#### Snippet
```java
         * If the CHALLENGE_MESSAGE TargetInfo field has an MsvAvTimestamp present, the client SHOULD provide a MIC
         */
        if (null == context.timestamp || 0 >= context.timestamp.length) {
            token.put(context.targetInfo, 0, context.targetInfo.length);
            if (logger.isLoggable(Level.WARNING)) {
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/com/microsoft/sqlserver/jdbc/NTLMAuthentication.java`
#### Snippet
```java
         * Windows XP, and Windows Server 2003
         */
        if (null == context.timestamp || 0 >= context.timestamp.length) {
            // this SHOULD always be present but for some reason occasionally this had seen to be missing
            if (logger.isLoggable(Level.WARNING)) {
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/com/microsoft/sqlserver/jdbc/Geography.java`
#### Snippet
```java
     */
    Geography(String wkt, int srid) throws SQLServerException {
        if (null == wkt || wkt.length() <= 0) {
            throwIllegalWKT();
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/com/microsoft/sqlserver/jdbc/Geography.java`
#### Snippet
```java
     */
    protected Geography(byte[] clr) throws SQLServerException {
        if (null == clr || clr.length <= 0) {
            throwIllegalByteArray();
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        } else if (serverMajorVersion >= 11) {
            tdsVersion = TDS.VER_DENALI;
        } else if (serverMajorVersion >= 10) {
            tdsVersion = TDS.VER_KATMAI;
        } else if (serverMajorVersion >= 9) {
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        } else if (serverMajorVersion >= 10) {
            tdsVersion = TDS.VER_KATMAI;
        } else if (serverMajorVersion >= 9) {
            tdsVersion = TDS.VER_YUKON;
        } else {
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'PLPInputStream' used without 'try'-with-resources statement
in `src/main/java/com/microsoft/sqlserver/jdbc/PLPInputStream.java`
#### Snippet
```java
        // Temporary stream cannot get closes, since it closes the main stream.
        try {
            return null == PLPInputStream.makeTempStream(tdsReader, false, null);
        } finally {
            tdsReader.reset(mark);
```

### AutoCloseableResource
'SQLServerResultSet' used without 'try'-with-resources statement
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
        }
        if (resultSet == null || rsclosed) {
            SQLServerResultSet emptyResultSet = buildExecuteMetaData();
            if (null != emptyResultSet)
                rsmd = emptyResultSet.getMetaData();
```

## RuleId[id=ReactiveStreamsNullableInLambdaInTransform]
### ReactiveStreamsNullableInLambdaInTransform
Return null or something nullable from a lambda in transformation method
in `src/main/java/com/microsoft/sqlserver/jdbc/KeyVaultCustomCredentialPolicy.java`
#### Snippet
```java
                // Ignore body
                .doOnNext(HttpResponse::close).map(res -> res.getHeaderValue(WWW_AUTHENTICATE))
                .map(header -> extractChallenge(header, BEARER_TOKEN_PREFIX)).flatMap(map -> {
                    keyVaultTokenCredential.setAuthorization(map.get("authorization"));
                    keyVaultTokenCredential.setResource(map.get("resource"));
```

## RuleId[id=RedundantCompareCall]
### RedundantCompareCall
Redundant call to `Integer.compare()`
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
                } else
                    dtvScale = dtv.getScale();
                if (null != dtvScale && 0 != Integer.compare(dtvScale, biScale))
                    bigDecimalValue = bigDecimalValue.setScale(dtvScale, RoundingMode.DOWN);
            }
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'key != null' covered by subsequent condition 'key instanceof Integer'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCertificateUtils.java`
#### Snippet
```java
                        // Java docs guarantee that the first entry in the list will be an integer.
                        // 2 is the sequence no of a dnsName
                        if ((key != null) && (key instanceof Integer) && ((Integer) key == 2)) {
                            // As per RFC2459, the DNSName will be in the
                            // "preferred name syntax" as specified by RFC
```

### ConditionCoveredByFurtherCondition
Condition 'value != null' covered by subsequent condition 'value instanceof String'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCertificateUtils.java`
#### Snippet
```java
                            // Java docs guarantee that the second entry in the list
                            // will be a string for dnsName
                            if (value != null && value instanceof String) {
                                dnsNameInSANCert = (String) value;

```

### ConditionCoveredByFurtherCondition
Condition 'firstDash \> 0' covered by subsequent condition 'firstDash == YEAR_LENGTH'
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
        // Convert the date
        boolean parsedDate = false;
        if (firstDash > 0 && secondDash > 0 && secondDash < dividingSpace - 1 && firstDash == YEAR_LENGTH
                && (secondDash - firstDash > 1 && secondDash - firstDash <= MONTH_LENGTH + 1)
                && (dividingSpace - secondDash > 1 && dividingSpace - secondDash <= DAY_LENGTH + 1)) {
```

### ConditionCoveredByFurtherCondition
Condition 'ResultSet.TYPE_SCROLL_SENSITIVE != nType' covered by subsequent condition 'SQLServerResultSet.TYPE_SS_SCROLL_KEYSET != nType'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java

        // Validate result set type ...
        if (ResultSet.TYPE_FORWARD_ONLY != nType && ResultSet.TYPE_SCROLL_SENSITIVE != nType
                && ResultSet.TYPE_SCROLL_INSENSITIVE != nType && SQLServerResultSet.TYPE_SS_DIRECT_FORWARD_ONLY != nType
                && SQLServerResultSet.TYPE_SS_SERVER_CURSOR_FORWARD_ONLY != nType
```

### ConditionCoveredByFurtherCondition
Condition 'ResultSet.TYPE_SCROLL_INSENSITIVE != nType' covered by subsequent condition 'SQLServerResultSet.TYPE_SS_SCROLL_STATIC != nType'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
        // Validate result set type ...
        if (ResultSet.TYPE_FORWARD_ONLY != nType && ResultSet.TYPE_SCROLL_SENSITIVE != nType
                && ResultSet.TYPE_SCROLL_INSENSITIVE != nType && SQLServerResultSet.TYPE_SS_DIRECT_FORWARD_ONLY != nType
                && SQLServerResultSet.TYPE_SS_SERVER_CURSOR_FORWARD_ONLY != nType
                && SQLServerResultSet.TYPE_SS_SCROLL_DYNAMIC != nType
```

### ConditionCoveredByFurtherCondition
Condition 'ResultSet.CONCUR_UPDATABLE != nConcur' covered by subsequent condition 'SQLServerResultSet.CONCUR_SS_OPTIMISTIC_CC != nConcur'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java

        // ... and concurrency
        if (ResultSet.CONCUR_READ_ONLY != nConcur && ResultSet.CONCUR_UPDATABLE != nConcur
                && SQLServerResultSet.CONCUR_SS_SCROLL_LOCKS != nConcur
                && SQLServerResultSet.CONCUR_SS_OPTIMISTIC_CC != nConcur
```

### ConditionCoveredByFurtherCondition
Condition 'null == selectMethod' covered by subsequent condition '!"cursor".equals(...)'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
                // TYPE_SS_SERVER_CURSOR_FORWARD_ONLY accordingly.
                String selectMethod = con.getSelectMethod();
                resultSetType = (null == selectMethod
                        || !"cursor".equals(selectMethod)) ? SQLServerResultSet.TYPE_SS_DIRECT_FORWARD_ONLY : // Default
                                                                                                              // forward-only,
```

### ConditionCoveredByFurtherCondition
Condition 'SQLServerResultSet.TYPE_SCROLL_SENSITIVE == type' covered by subsequent condition 'SQLServerResultSet.TYPE_SS_SCROLL_KEYSET == type'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        checkResultType(type);
        return (type == SQLServerResultSet.TYPE_SS_SCROLL_DYNAMIC || SQLServerResultSet.TYPE_FORWARD_ONLY == type
                || SQLServerResultSet.TYPE_SCROLL_SENSITIVE == type || SQLServerResultSet.TYPE_SS_SCROLL_KEYSET == type
                || SQLServerResultSet.TYPE_SS_SERVER_CURSOR_FORWARD_ONLY == type);
    }
```

### ConditionCoveredByFurtherCondition
Condition 'SQLServerResultSet.TYPE_SCROLL_SENSITIVE == type' covered by subsequent condition 'SQLServerResultSet.TYPE_SS_SCROLL_KEYSET == type'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        checkResultType(type);
        return (type == SQLServerResultSet.TYPE_SS_SCROLL_DYNAMIC || SQLServerResultSet.TYPE_FORWARD_ONLY == type
                || SQLServerResultSet.TYPE_SCROLL_SENSITIVE == type || SQLServerResultSet.TYPE_SS_SCROLL_KEYSET == type
                || SQLServerResultSet.TYPE_SS_SERVER_CURSOR_FORWARD_ONLY == type);
    }
```

### ConditionCoveredByFurtherCondition
Condition 'SQLServerResultSet.TYPE_SCROLL_SENSITIVE == type' covered by subsequent condition 'SQLServerResultSet.TYPE_SS_SCROLL_KEYSET == type'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        checkResultType(type);
        return (type == SQLServerResultSet.TYPE_SS_SCROLL_DYNAMIC || SQLServerResultSet.TYPE_FORWARD_ONLY == type
                || SQLServerResultSet.TYPE_SCROLL_SENSITIVE == type || SQLServerResultSet.TYPE_SS_SCROLL_KEYSET == type
                || SQLServerResultSet.TYPE_SS_SERVER_CURSOR_FORWARD_ONLY == type);
    }
```

### ConditionCoveredByFurtherCondition
Condition 'SQLServerResultSet.TYPE_SCROLL_SENSITIVE == type' covered by subsequent condition 'SQLServerResultSet.TYPE_SS_SCROLL_KEYSET == type'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        checkResultType(type);
        return (type == SQLServerResultSet.TYPE_SS_SCROLL_DYNAMIC || SQLServerResultSet.TYPE_FORWARD_ONLY == type
                || SQLServerResultSet.TYPE_SCROLL_SENSITIVE == type || SQLServerResultSet.TYPE_SS_SCROLL_KEYSET == type
                || SQLServerResultSet.TYPE_SS_SERVER_CURSOR_FORWARD_ONLY == type);
    }
```

### ConditionCoveredByFurtherCondition
Condition 'SQLServerResultSet.TYPE_SCROLL_SENSITIVE == type' covered by subsequent condition 'SQLServerResultSet.TYPE_SS_SCROLL_KEYSET == type'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
        checkResultType(type);
        return (type == SQLServerResultSet.TYPE_SS_SCROLL_DYNAMIC || SQLServerResultSet.TYPE_FORWARD_ONLY == type
                || SQLServerResultSet.TYPE_SCROLL_SENSITIVE == type || SQLServerResultSet.TYPE_SS_SCROLL_KEYSET == type
                || SQLServerResultSet.TYPE_SS_SERVER_CURSOR_FORWARD_ONLY == type);
    }
```

### ConditionCoveredByFurtherCondition
Condition 'null != value' covered by subsequent condition 'value instanceof String'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
        String valueStrUntrimmed = null;

        if (null != value && value instanceof String) {
            valueStrUntrimmed = (String) value;
            valueStr = valueStrUntrimmed.trim();
```

### ConditionCoveredByFurtherCondition
Condition 'null == connection' covered by subsequent condition '!(connection instanceof ISQLServerConnection)'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
        loggerExternal.entering(loggerClassName, "SQLServerBulkCopy", connection);

        if (null == connection || !(connection instanceof ISQLServerConnection)) {
            SQLServerException.makeFromDriverError(null, null,
                    SQLServerException.getErrString("R_invalidDestConnection"), null, false);
```

### ConditionCoveredByFurtherCondition
Condition 'DataTypes.UNKNOWN_STREAM_LENGTH == streamLength' covered by subsequent condition 'streamLength \<= DataTypes.MAX_VARTYPE_MAX_BYTES'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    void writeRPCXML(String sName, InputStream stream, long streamLength, boolean bOut) throws SQLServerException {
        assert DataTypes.UNKNOWN_STREAM_LENGTH == streamLength || streamLength >= 0;
        assert DataTypes.UNKNOWN_STREAM_LENGTH == streamLength || streamLength <= DataTypes.MAX_VARTYPE_MAX_BYTES;

        writeRPCNameValType(sName, bOut, TDSType.XML);
```

### ConditionCoveredByFurtherCondition
Condition 'DataTypes.UNKNOWN_STREAM_LENGTH == streamLength' covered by subsequent condition 'streamLength \<= DataTypes.MAX_VARTYPE_MAX_BYTES'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                || streamLength > DataTypes.SHORT_VARTYPE_MAX_BYTES);
        if (usePLP) {
            assert DataTypes.UNKNOWN_STREAM_LENGTH == streamLength || streamLength <= DataTypes.MAX_VARTYPE_MAX_BYTES;

            writeRPCNameValType(sName, bOut, jdbcType.isTextual() ? TDSType.BIGVARCHAR : TDSType.BIGVARBINARY);
```

### ConditionCoveredByFurtherCondition
Condition 'DataTypes.UNKNOWN_STREAM_LENGTH == reLength' covered by subsequent condition 'reLength \<= DataTypes.MAX_VARTYPE_MAX_CHARS'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        boolean usePLP = (DataTypes.UNKNOWN_STREAM_LENGTH == reLength || reLength > DataTypes.SHORT_VARTYPE_MAX_CHARS);
        if (usePLP) {
            assert DataTypes.UNKNOWN_STREAM_LENGTH == reLength || reLength <= DataTypes.MAX_VARTYPE_MAX_CHARS;

            writeRPCNameValType(sName, bOut, TDSType.NVARCHAR);
```

### ConditionCoveredByFurtherCondition
Condition 'map != null' covered by subsequent condition 'map instanceof java.util.HashMap'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        checkClosed();
        // we return an empty Hash map if the user gives this back make sure we accept it.
        if (map != null && (map instanceof java.util.HashMap) && map.isEmpty()) {
            loggerExternal.exiting(loggingClassName, "setTypeMap");
            return;
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `buffer` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCertificateUtils.java`
#### Snippet
```java
            }

            ((Buffer) buffer).position(((Buffer) buffer).position() + 8); // skip reserved and keytype
            boolean encrypted = buffer.getInt() != 0;
            int saltLength = buffer.getInt();
```

### RedundantCast
Casting `buffer` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCertificateUtils.java`
#### Snippet
```java
            buffer.get(salt);

            ((Buffer) buffer).position(((Buffer) buffer).position() + 8); // skip btype(1b), version(1b), reserved(2b),
                                                                          // and keyalg(4b)

```

### RedundantCast
Casting `stmt` to `SQLServerPreparedStatement` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/ISQLServerEnclaveProvider.java`
#### Snippet
```java
        CekTableEntry cekEntry = null;
        boolean isRequestedByEnclave = false;
        SQLServerStatement statement = (SQLServerStatement) ((SQLServerPreparedStatement) stmt);

        if (null != sqlServerStatement && sqlServerStatement.hasColumnEncryptionKeyStoreProvidersRegistered()) {
```

### RedundantCast
Casting `e` to `SQLServerException` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerNoneEnclaveProvider.java`
#### Snippet
```java
            }
        } catch (SQLServerException e) {
            throw (SQLServerException) e;
        } catch (SQLException | IOException e) {
            throw new SQLServerException(SQLServerException.getErrString("R_UnableRetrieveParameterMetadata"), null, 0,
```

### RedundantCast
Casting `((BaseInputStream)activeStreams.get(...)).payloadLength` to `long` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBlob.java`
#### Snippet
```java
        checkClosed();
        if (value == null && activeStreams.get(0) instanceof BaseInputStream) {
            return (long) ((BaseInputStream) activeStreams.get(0)).payloadLength;
        }
        getBytesFromStream();
```

### RedundantCast
Casting `1` to `long` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBlob.java`
#### Snippet
```java
            return -1;

        return position(pattern.getBytes((long) 1, (int) pattern.length()), start);
    }

```

### RedundantCast
Casting `tdsReader.readUnsignedByte()` to `int` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/StreamColumns.java`
#### Snippet
```java
    private String readByteString(TDSReader tdsReader) throws SQLServerException {
        String value = "";
        int byteLen = (int) tdsReader.readUnsignedByte();
        value = tdsReader.readUnicodeString(byteLen);
        return value;
```

### RedundantCast
Casting `getMaxRows()` to `long` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
        loggerExternal.exiting(getClassNameLogging(), "getLargeMaxRows", (long) maxRows);

        return (long) getMaxRows();
    }

```

### RedundantCast
Casting `rawChars` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/ReaderInputStream.java`
#### Snippet
```java
            // - the reader violates its interface contract (driver throws an IOException)
            while (rawChars.hasRemaining()) {
                int lastPosition = ((Buffer) rawChars).position();
                int charsRead = 0;

```

### RedundantCast
Casting `rawChars` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/ReaderInputStream.java`
#### Snippet
```java
                if (-1 == charsRead) {
                    // If the reader violates its interface contract then throw an exception.
                    if (((Buffer) rawChars).position() != lastPosition)
                        throw new IOException(SQLServerException.getErrString("R_streamReadReturnedInvalidValue"));

```

### RedundantCast
Casting `rawChars` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/ReaderInputStream.java`
#### Snippet
```java

                    // If there are no characters left to encode then we're done.
                    if (0 == ((Buffer) rawChars).position()) {
                        rawChars = null;
                        atEndOfStream = true;
```

### RedundantCast
Casting `rawChars` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/ReaderInputStream.java`
#### Snippet
```java

                // If the reader violates its interface contract then throw an exception.
                if (charsRead != ((Buffer) rawChars).position() - lastPosition)
                    throw new IOException(SQLServerException.getErrString("R_streamReadReturnedInvalidValue"));

```

### RedundantCast
Casting `NTLM_AVFLAG_VALUE_MIC` to `int` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/NTLMAuthentication.java`
#### Snippet
```java
            token.putShort(NTLM_AVID_MSVAVFLAGS);
            token.putShort((short) NTLM_AVID_MSVAVFLAGS_LEN);
            token.putInt((int) NTLM_AVFLAG_VALUE_MIC);
        }

```

### RedundantCast
Casting `(Weigher``)MapWeigher.INSTANCE` to `Weigher`> is redundant
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/Weighers.java`
#### Snippet
```java
  @SuppressWarnings({"cast", "unchecked"})
  public static <A, B> Weigher<? super Map<A, B>> map() {
    return (Weigher<Map<A, B>>) (Weigher<?>) MapWeigher.INSTANCE;
  }

```

### RedundantCast
Casting `(Weigher``)IterableWeigher.INSTANCE` to `Weigher`> is redundant
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/Weighers.java`
#### Snippet
```java
  @SuppressWarnings({"cast", "unchecked"})
  public static <E> Weigher<? super Iterable<E>> iterable() {
    return (Weigher<Iterable<E>>) (Weigher<?>) IterableWeigher.INSTANCE;
  }

```

### RedundantCast
Casting `(Weigher``)SetWeigher.INSTANCE` to `Weigher`> is redundant
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/Weighers.java`
#### Snippet
```java
  @SuppressWarnings({"cast", "unchecked"})
  public static <E> Weigher<? super Set<E>> set() {
    return (Weigher<Set<E>>) (Weigher<?>) SetWeigher.INSTANCE;
  }

```

### RedundantCast
Casting `(Weigher``)ListWeigher.INSTANCE` to `Weigher`> is redundant
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/Weighers.java`
#### Snippet
```java
  @SuppressWarnings({"cast", "unchecked"})
  public static <E> Weigher<? super List<E>> list() {
    return (Weigher<List<E>>) (Weigher<?>) ListWeigher.INSTANCE;
  }

```

### RedundantCast
Casting `(Weigher``)CollectionWeigher.INSTANCE` to `Weigher`> is redundant
in `src/main/java/mssql/googlecode/concurrentlinkedhashmap/Weighers.java`
#### Snippet
```java
  @SuppressWarnings({"cast", "unchecked"})
  public static <E> Weigher<? super Collection<E>> collection() {
    return (Weigher<Collection<E>>) (Weigher<?>) CollectionWeigher.INSTANCE;
  }

```

### RedundantCast
Casting `stmt.getResultSet()` to `SQLServerResultSet` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAASEnclaveProvider.java`
#### Snippet
```java
                    // Process the third resultset.
                    if (connection.isAEv2() && stmt.getMoreResults()) {
                        try (ResultSet hgsRs = (SQLServerResultSet) stmt.getResultSet()) {
                            if (hgsRs.next()) {
                                hgsResponse = new AASAttestationResponse(hgsRs.getBytes(1));
```

### RedundantCast
Casting `length` to `long` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java
                        || "ntext".equalsIgnoreCase(columnTypeName)) ? length / 2 : length;
            }
            return (long) length;
        } else if (null == value) {
            return 0;
```

### RedundantCast
Casting `stmt.getResultSet()` to `SQLServerResultSet` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerVSMEnclaveProvider.java`
#### Snippet
```java
                    // Process the third resultset.
                    if (connection.isAEv2() && stmt.getMoreResults()) {
                        try (ResultSet hgsRs = (SQLServerResultSet) stmt.getResultSet()) {
                            if (hgsRs.next()) {
                                hgsResponse = new VSMAttestationResponse(hgsRs.getBytes(1));
```

### RedundantCast
Casting `this.connection.prepareStatement(...)` to `SQLServerPreparedStatement` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
                    + "FROM @mssqljdbc_temp_sp_columns_result ORDER BY TABLE_CAT, TABLE_SCHEM, TABLE_NAME, ORDINAL_POSITION;";
            SQLServerResultSet rs = null;
            PreparedStatement pstmt = (SQLServerPreparedStatement) this.connection.prepareStatement(spColumnsSql);
            pstmt.closeOnCompletion();
            try {
```

### RedundantCast
Casting `this.connection.prepareStatement(...)` to `SQLServerPreparedStatement` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
                    }

                    resultPstmt = (SQLServerPreparedStatement) this.connection
                            .prepareStatement(azureDwSelectBuilder.toString());
                    userRs = (SQLServerResultSet) resultPstmt.executeQuery();
```

### RedundantCast
Casting `stagingBuffer` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

    private void writePacketHeader(int tdsMessageStatus) {
        int tdsMessageLength = ((Buffer) stagingBuffer).position();
        ++packetNum;

```

### RedundantCast
Casting `logBuffer` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                    logBuffer.putDouble(value);
                else
                    ((Buffer) logBuffer).position(((Buffer) logBuffer).position() + 8);
            }
        } else {
```

### RedundantCast
Casting `logBuffer` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                    logBuffer.put(value, offset + bytesWritten, bytesToWrite);
                else
                    ((Buffer) logBuffer).position(((Buffer) logBuffer).position() + bytesToWrite);
            }

```

### RedundantCast
Casting `logBuffer` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                    logBuffer.putLong(value);
                else
                    ((Buffer) logBuffer).position(((Buffer) logBuffer).position() + 8);
            }
        } else {
```

### RedundantCast
Casting `0` to `long` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    void writeEncryptedRPCPLP() throws SQLServerException {
        writeShort((short) DataTypes.SQL_USHORTVARMAXLEN);
        writeLong((long) 0); // actual length
        writeInt(0); // PLP_TERMINATOR, 0x00000000
    }
```

### RedundantCast
Casting `logBuffer` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                    logBuffer.putShort(value);
                else
                    ((Buffer) logBuffer).position(((Buffer) logBuffer).position() + 2);
            }
        } else {
```

### RedundantCast
Casting `socketBuffer` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        }

        ((Buffer) socketBuffer).position(((Buffer) socketBuffer).limit());
        ((Buffer) stagingBuffer).clear();

```

### RedundantCast
Casting `logBuffer` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                    logBuffer.put(value, 0, remaining);
                else
                    ((Buffer) logBuffer).position(((Buffer) logBuffer).position() + remaining);
            }
        }
```

### RedundantCast
Casting `logBuffer` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                logBuffer.put(value, remaining, valueLength - remaining);
            else
                ((Buffer) logBuffer).position(((Buffer) logBuffer).position() + remaining);
        }
    }
```

### RedundantCast
Casting `socketBuffer` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    void flush(boolean atEOM) throws SQLServerException {
        // First, flush any data left in the socket buffer.
        tdsChannel.write(socketBuffer.array(), ((Buffer) socketBuffer).position(), socketBuffer.remaining());
        ((Buffer) socketBuffer).position(((Buffer) socketBuffer).limit());

```

### RedundantCast
Casting `socketBuffer` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        // First, flush any data left in the socket buffer.
        tdsChannel.write(socketBuffer.array(), ((Buffer) socketBuffer).position(), socketBuffer.remaining());
        ((Buffer) socketBuffer).position(((Buffer) socketBuffer).limit());

        // If there is data in the staging buffer that needs to be written
```

### RedundantCast
Casting `stagingBuffer` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
        // to the socket, the socket buffer is now empty, so swap buffers
        // and start writing data from the staging buffer.
        if (((Buffer) stagingBuffer).position() >= TDS_PACKET_HEADER_SIZE) {
            // Swap the packet buffers ...
            ByteBuffer swapBuffer = stagingBuffer;
```

### RedundantCast
Casting `socketBuffer` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            // to send over the wire now.
            if (tdsChannel.isLoggingPackets()) {
                tdsChannel.logPacket(logBuffer.array(), 0, ((Buffer) socketBuffer).limit(),
                        this.toString() + " sending packet (" + ((Buffer) socketBuffer).limit() + " bytes)");
            }
```

### RedundantCast
Casting `socketBuffer` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            if (tdsChannel.isLoggingPackets()) {
                tdsChannel.logPacket(logBuffer.array(), 0, ((Buffer) socketBuffer).limit(),
                        this.toString() + " sending packet (" + ((Buffer) socketBuffer).limit() + " bytes)");
            }

```

### RedundantCast
Casting `socketBuffer` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

            // Finally, start sending data from the new socket buffer.
            tdsChannel.write(socketBuffer.array(), ((Buffer) socketBuffer).position(), socketBuffer.remaining());
            ((Buffer) socketBuffer).position(((Buffer) socketBuffer).limit());
        }
```

### RedundantCast
Casting `socketBuffer` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
            // Finally, start sending data from the new socket buffer.
            tdsChannel.write(socketBuffer.array(), ((Buffer) socketBuffer).position(), socketBuffer.remaining());
            ((Buffer) socketBuffer).position(((Buffer) socketBuffer).limit());
        }
    }
```

### RedundantCast
Casting `logBuffer` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                    logBuffer.put(value);
                else
                    ((Buffer) logBuffer).position(((Buffer) logBuffer).position() + 1);
            }
        } else {
```

### RedundantCast
Casting `stagingBuffer` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                if (con.equals(srcStmt.getConnection()) && 0 != resultSetServerCursorId) {
                    cachedTVPHeaders = ByteBuffer.allocate(stagingBuffer.capacity()).order(stagingBuffer.order());
                    cachedTVPHeaders.put(stagingBuffer.array(), 0, ((Buffer) stagingBuffer).position());

                    cachedCommand = this.command;
```

### RedundantCast
Casting `cachedTVPHeaders` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                    ((Buffer) stagingBuffer).clear();
                    ((Buffer) logBuffer).clear();
                    writeBytes(cachedTVPHeaders.array(), 0, ((Buffer) cachedTVPHeaders).position());
                }

```

### RedundantCast
Casting `logBuffer` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                    logBuffer.putInt(value);
                else
                    ((Buffer) logBuffer).position(((Buffer) logBuffer).position() + 4);
            }
        } else {
```

### RedundantCast
Casting `logBuffer` to `Buffer` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
                    logBuffer.putChar(value);
                else
                    ((Buffer) logBuffer).position(((Buffer) logBuffer).position() + 2);
            }
        } else {
```

### RedundantCast
Casting `tdsReader.readUnsignedByte()` to `int` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            while (dataBytesRead < dataLength) {
                short sessionStateId = (short) tdsReader.readUnsignedByte();
                int sessionStateLength = (int) tdsReader.readUnsignedByte();
                dataBytesRead += 2;
                if (sessionStateLength >= 0xFF) {
```

### RedundantCast
Casting `TDS.TDS_FEATURE_EXT_FEDAUTH` to `byte` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        // write feature id
        if (write) {
            tdsWriter.writeByte((byte) TDS.TDS_FEATURE_EXT_FEDAUTH); // FEATUREEXT_TCE

            // set options
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256EncryptionKey.java`
#### Snippet
```java
     * @param algorithmName
     *        name of the algorithm associated with keys
     * @throws SQLServerException
     */
    SQLServerAeadAes256CbcHmac256EncryptionKey(byte[] rootKey, String algorithmName) throws SQLServerException {
```

### JavadocDeclaration
`@param accessTokenCallbackClass` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/ISQLServerConnection.java`
#### Snippet
```java
     * of the implementing class for {@link SQLServerAccessTokenCallback}.
     *
     * @param accessTokenCallbackClass
     */
    void setAccessTokenCallbackClass(String accessTokenCallbackClass);
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSQLXML.java`
#### Snippet
```java
     * Returns unique id for each instance.
     * 
     * @return
     */
    private static int nextInstanceID() {
```

### JavadocDeclaration
`@param cipherText` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256Algorithm.java`
#### Snippet
```java
     * @param iv
     *        initialization vector
     * @param cipherText
     * @param offset
     * @param length
```

### JavadocDeclaration
`@param offset` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256Algorithm.java`
#### Snippet
```java
     *        initialization vector
     * @param cipherText
     * @param offset
     * @param length
     *        length of cipher text
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256Algorithm.java`
#### Snippet
```java
     *        length of cipher text
     * @return authentication tag
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256Algorithm.java`
#### Snippet
```java
     * @return authentication tag
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     */
    private byte[] prepareAuthenticationTag(byte[] iv, byte[] cipherText, int offset,
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256Algorithm.java`
#### Snippet
```java
     *        length of cipher text
     * @return plain text
     * @throws SQLServerException
     */
    private byte[] decryptData(byte[] iv, byte[] cipherText, int offset, int count) throws SQLServerException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256Algorithm.java`
#### Snippet
```java
     *        specify if encryption needs authentication
     * @return cipher text
     * @throws SQLServerException
     */
    protected byte[] encryptData(byte[] plainText, boolean hasAuthenticationTag) throws SQLServerException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256Algorithm.java`
#### Snippet
```java
     *        tells whether cipher text contain authentication tag
     * @return plain text
     * @throws SQLServerException
     */
    private byte[] decryptData(byte[] cipherText, boolean hasAuthenticationTag) throws SQLServerException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCertificateUtils.java`
#### Snippet
```java
     * @param certFile
     *        path to certificate file to validate
     * @throws CertificateException
     */
    static void validateServerCerticate(X509Certificate cert, String certFile) throws CertificateException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCertificateUtils.java`
#### Snippet
```java
     * @param hostName
     *        hostname
     * @throws CertificateException
     */
    static void validateServerNameInCertificate(X509Certificate cert, String hostName) throws CertificateException {
```

### JavadocDeclaration
`@param param` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerParameterMetaData.java`
#### Snippet
```java
     * Checks if the @param passed is valid for either procedure metadata or query metadata.
     * 
     * @param param
     * @throws SQLServerException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerParameterMetaData.java`
#### Snippet
```java
     * 
     * @param param
     * @throws SQLServerException
     */
    private void checkParam(int param) throws SQLServerException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerParameterMetaData.java`
#### Snippet
```java
     * @param sProcString
     *        the procedure name
     * @throws SQLServerException
     */
    @SuppressWarnings("serial")
```

### JavadocDeclaration
IOException is not declared to be thrown by method isEOS
in `src/main/java/com/microsoft/sqlserver/jdbc/SimpleInputStream.java`
#### Snippet
```java
     * Checks if we have EOS state.
     * 
     * @exception IOException
     *            if an I/O error occurs.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPooledConnection.java`
#### Snippet
```java
     *
     * @return SQLServerConnection instance
     * @throws SQLException
     */
    private SQLServerConnection createNewConnection() throws SQLException {
```

### JavadocDeclaration
`@param plainText` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSecurityUtility.java`
#### Snippet
```java
     * Give the hash of given plain text
     * 
     * @param plainText
     * @param key
     * @param length
```

### JavadocDeclaration
`@param key` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSecurityUtility.java`
#### Snippet
```java
     * 
     * @param plainText
     * @param key
     * @param length
     * @return hash of the plain text using provided key
```

### JavadocDeclaration
`@param length` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSecurityUtility.java`
#### Snippet
```java
     * @param plainText
     * @param key
     * @param length
     * @return hash of the plain text using provided key
     * @throws NoSuchAlgorithmException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSecurityUtility.java`
#### Snippet
```java
     * @param length
     * @return hash of the plain text using provided key
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSecurityUtility.java`
#### Snippet
```java
     * @return hash of the plain text using provided key
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     */
    static byte[] getHMACWithSHA256(byte[] plainText, byte[] key,
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSecurityUtility.java`
#### Snippet
```java
     *        Client ID of the user-assigned Managed Identity.
     * @return fedauth token
     * @throws SQLServerException
     */
    static SqlAuthenticationToken getDefaultAzureCredAuthToken(String resource,
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSecurityUtility.java`
#### Snippet
```java
     *        Client ID of the user-assigned Managed Identity.
     * @return fedauth token
     * @throws SQLServerException
     */
    static SqlAuthenticationToken getManagedIdentityCredAuthToken(String resource,
```

### JavadocDeclaration
`@param buffer2Index` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSecurityUtility.java`
#### Snippet
```java
     * @param buffer2
     *        second array
     * @param buffer2Index
     * @param lengthToCompare
     * @return true if array contains same bytes otherwise false
```

### JavadocDeclaration
`@param lengthToCompare` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSecurityUtility.java`
#### Snippet
```java
     *        second array
     * @param buffer2Index
     * @param lengthToCompare
     * @return true if array contains same bytes otherwise false
     */
```

### JavadocDeclaration
`@param certificateDetails` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionJavaKeyStoreProvider.java`
#### Snippet
```java
     * @param plainText
     *        plain CEK to be encrypted
     * @param certificateDetails
     * @return encrypted CEK
     * @throws SQLServerException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionJavaKeyStoreProvider.java`
#### Snippet
```java
     * @param certificateDetails
     * @return encrypted CEK
     * @throws SQLServerException
     */
    private byte[] encryptRSAOAEP(byte[] plainText, CertificateDetails certificateDetails) throws SQLServerException {
```

### JavadocDeclaration
`@param logger` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
     * @param url
     *        the JDBC URL
     * @param logger
     * @return the properties
     * @throws SQLServerException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
     * @param logger
     * @return the properties
     * @throws SQLServerException
     */
    static Properties parseUrl(String url, Logger logger) throws SQLServerException {
```

### JavadocDeclaration
UnknownHostException is not declared to be thrown by method lookupHostName
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
     * Looks up local hostname of client machine.
     * 
     * @exception UnknownHostException
     *            if local hostname is not found.
     * @return hostname string or ip of host if hostname cannot be resolved. If neither hostname or ip found returns ""
```

### JavadocDeclaration
Wrong tag `inID`
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
     * bracket escaping rules. Assumes that the incoming identifier is unescaped.
     * 
     * @inID input identifier to escape.
     * @return the escaped value.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBlob.java`
#### Snippet
```java
     * Converts stream to byte[]
     * 
     * @throws SQLServerException
     */
    private void getBytesFromStream() throws SQLServerException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/StreamColumns.java`
#### Snippet
```java
     * Parse a result set column meta data TDS stream for CEK table.
     *
     * @throws SQLServerException
     */
    void readCEKTable(TDSReader tdsReader) throws SQLServerException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/StreamColumns.java`
#### Snippet
```java
     * Parse a result set column meta data TDS stream for crypto metadata for AE.
     *
     * @throws SQLServerException
     */
    CryptoMetadata readCryptoMetadata(TDSReader tdsReader) throws SQLServerException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/StreamColumns.java`
#### Snippet
```java
     * Parse a result set column meta data TDS stream for CEK table entry.
     *
     * @throws SQLServerException
     */
    CekTableEntry readCEKTableEntry(TDSReader tdsReader) throws SQLServerException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/StreamColumns.java`
#### Snippet
```java
     * Parse a result set column meta data TDS stream.
     *
     * @throws SQLServerException
     */
    void setFromTDS(TDSReader tdsReader) throws SQLServerException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/KeyVaultHttpPipelineBuilder.java`
#### Snippet
```java
     *        The credential to use for authenticating HTTP requests.
     * @return the updated KVHttpPipelineBuilder object.
     * @throws SQLServerException
     */
    KeyVaultHttpPipelineBuilder credential(KeyVaultTokenCredential credential) throws SQLServerException {
```

### JavadocDeclaration
`@param masterKeyPath` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionAzureKeyVaultProvider.java`
#### Snippet
```java
     * Checks if the Azure Key Vault key path is Empty or Null (and raises exception if they are).
     *
     * @param masterKeyPath
     * @throws SQLServerException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionAzureKeyVaultProvider.java`
#### Snippet
```java
     *
     * @param masterKeyPath
     * @throws SQLServerException
     */
    private void validateNonEmptyAKVPath(String masterKeyPath) throws SQLServerException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionAzureKeyVaultProvider.java`
#### Snippet
```java
     *        - Plain text Column Encryption Key.
     * @return Returns an encrypted blob or throws an exception if there are any errors.
     * @throws SQLServerException
     */
    private byte[] azureKeyVaultWrap(String masterKeyPath, KeyWrapAlgorithm encryptionAlgorithm,
```

### JavadocDeclaration
`@param dataToVerify` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionAzureKeyVaultProvider.java`
#### Snippet
```java
     * Verifies the given RSA PKCSv1.5 signature.
     *
     * @param dataToVerify
     * @param signature
     * @param masterKeyPath
```

### JavadocDeclaration
`@param signature` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionAzureKeyVaultProvider.java`
#### Snippet
```java
     *
     * @param dataToVerify
     * @param signature
     * @param masterKeyPath
     *        - Azure Key Vault key url.
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionAzureKeyVaultProvider.java`
#### Snippet
```java
     *        - Azure Key Vault key url.
     * @return true if signature is valid, false if it is not valid
     * @throws SQLServerException
     */
    private boolean azureKeyVaultVerifySignature(byte[] dataToVerify, byte[] signature,
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionAzureKeyVaultProvider.java`
#### Snippet
```java
     *        - Encrypted Column Encryption Key.
     * @return Returns the decrypted plaintext Column Encryption Key or throws an exception if there are any errors.
     * @throws SQLServerException
     */
    private byte[] azureKeyVaultUnWrap(String masterKeyPath, KeyWrapAlgorithm encryptionAlgorithm,
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionAzureKeyVaultProvider.java`
#### Snippet
```java
     *        - Asymmetric key encryptio algorithm
     * @return The encryption algorithm that is going to be used.
     * @throws SQLServerException
     */
    private KeyWrapAlgorithm validateEncryptionAlgorithm(String encryptionAlgorithm) throws SQLServerException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionAzureKeyVaultProvider.java`
#### Snippet
```java
     *        - Azure Key Vault key url.
     * @return Signature
     * @throws SQLServerException
     */
    private byte[] azureKeyVaultSignHashedData(byte[] dataToSign, String masterKeyPath) throws SQLServerException {
```

### JavadocDeclaration
`@param accessTokenCallbackClass` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnectionPoolProxy.java`
#### Snippet
```java
     * of the implementing class for {@link SQLServerAccessTokenCallback}.
     *
     * @param accessTokenCallbackClass
     */
    @Override
```

### JavadocDeclaration
`@param accessTokenCallbackClass` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
     * of the implementing class for {@link SQLServerAccessTokenCallback}.
     *
     * @param accessTokenCallbackClass
     */
    @Override
```

### JavadocDeclaration
`@param props` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
     * Sets a property string value.
     *
     * @param props
     * @param propKey
     * @param propValue
```

### JavadocDeclaration
`@param propKey` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
     *
     * @param props
     * @param propKey
     * @param propValue
     *        Caller will always supply a non-null props and propKey. Caller may supply a null propValue, in this case
```

### JavadocDeclaration
`@param props` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
     * Returns a property value in String format.
     *
     * @param props
     * @param propKey
     * @param defaultValue
```

### JavadocDeclaration
`@param propKey` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
     *
     * @param props
     * @param propKey
     * @param defaultValue
     * @return Caller will always supply a non-null props and propKey. Returns null if the specific property value is
```

### JavadocDeclaration
`@param defaultValue` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
     * @param props
     * @param propKey
     * @param defaultValue
     * @return Caller will always supply a non-null props and propKey. Returns null if the specific property value is
     *         not set.
```

### JavadocDeclaration
`@param props` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
     * Sets an integer property value.
     *
     * @param props
     * @param propKey
     * @param propValue
```

### JavadocDeclaration
`@param propKey` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
     *
     * @param props
     * @param propKey
     * @param propValue
     *        Caller will always supply a non-null props and propKey.
```

### JavadocDeclaration
`@param scale` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SqlVariant.java`
#### Snippet
```java
     * Sets the scale if applicable.
     * 
     * @param scale
     */
    void setScale(int scale) {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SqlVariant.java`
#### Snippet
```java
     * Returns the base type as JDBC type.
     * 
     * @return
     */
    JDBCType getBaseJDBCType() {
```

### JavadocDeclaration
`@param collation` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SqlVariant.java`
#### Snippet
```java
     * Sets the collation if applicable.
     * 
     * @param collation
     */
    void setCollation(SQLCollation collation) {
```

### JavadocDeclaration
`@param precision` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SqlVariant.java`
#### Snippet
```java
     * Sets the precision if applicable.
     * 
     * @param precision
     */
    void setPrecision(int precision) {
```

### JavadocDeclaration
`@param baseJDBCType` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SqlVariant.java`
#### Snippet
```java
     * Stores the basetype as JDBC type.
     * 
     * @param baseJDBCType
     */
    void setBaseJDBCType(JDBCType baseJDBCType) {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SqlVariant.java`
#### Snippet
```java
     * Returns the precision.
     * 
     * @return
     */
    int getPrecision() {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SqlVariant.java`
#### Snippet
```java
     * Returns the base type for sql-variant.
     * 
     * @return
     */
    int getBaseType() {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SqlVariant.java`
#### Snippet
```java
     * Returns the scale.
     * 
     * @return
     */
    int getScale() {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SqlVariant.java`
#### Snippet
```java
     * Returns the maximum length.
     * 
     * @return
     */
    int getMaxLength() {
```

### JavadocDeclaration
`@param maxLength` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SqlVariant.java`
#### Snippet
```java
     * Sets the maximum length.
     * 
     * @param maxLength
     */
    void setMaxLength(int maxLength) {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SqlVariant.java`
#### Snippet
```java
     * Returns if the basetype for variant is of time value.
     * 
     * @return
     */
    boolean isBaseTypeTimeValue() {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SqlVariant.java`
#### Snippet
```java
     * Returns the collation.
     * 
     * @return
     */
    SQLCollation getCollation() {
```

### JavadocDeclaration
`@param baseType` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SqlVariant.java`
#### Snippet
```java
     * Sets the base type for sql-variant.
     * 
     * @param baseType
     */
    void setBaseType(int baseType) {
```

### JavadocDeclaration
`@param accessTokenCallbackClass` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/ISQLServerDataSource.java`
#### Snippet
```java
     * of the implementing class for {@link SQLServerAccessTokenCallback}.
     *
     * @param accessTokenCallbackClass
     */
    void setAccessTokenCallbackClass(String accessTokenCallbackClass);
```

### JavadocDeclaration
`@param connection` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSymmetricKeyCache.java`
#### Snippet
```java
     * @param keyInfo
     *        contains encryption meta data information
     * @param connection
     * @return plain text key
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerEncryptionAlgorithmFactoryList.java`
#### Snippet
```java
     * Return instance for given algorithm
     * 
     * @param key
     * @param encryptionType
     * @param algorithmName
```

### JavadocDeclaration
`@param encryptionType` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerEncryptionAlgorithmFactoryList.java`
#### Snippet
```java
     * 
     * @param key
     * @param encryptionType
     * @param algorithmName
     * @return instance for given algorithm
```

### JavadocDeclaration
`@param algorithmName` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerEncryptionAlgorithmFactoryList.java`
#### Snippet
```java
     * @param key
     * @param encryptionType
     * @param algorithmName
     * @return instance for given algorithm
     * @throws SQLServerException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerEncryptionAlgorithmFactoryList.java`
#### Snippet
```java
     * @param algorithmName
     * @return instance for given algorithm
     * @throws SQLServerException
     */
    SQLServerEncryptionAlgorithm getAlgorithm(SQLServerSymmetricKey key, SQLServerEncryptionType encryptionType,
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     *        The character that marks the end of translation
     * 
     * @throws SQLServerException
     * 
     * @return the number of characters that have been translated
```

### JavadocDeclaration
Duplicate @return tag
in `src/main/java/com/microsoft/sqlserver/jdbc/ReaderInputStream.java`
#### Snippet
```java
     *
     * @return true when encoded characters are available
     * @return false when no more encoded characters are available (i.e. end of stream)
     * @exception IOException
     *            if an I/O error occurs reading from the reader or encoding the characters
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/dtv.java`
#### Snippet
```java
     * @return sql_variant value
     * @since 6.3.0
     * @throws SQLServerException
     */
    private Object readSqlVariant(int intbaseType, int cbPropsActual, int valueLength, TDSReader tdsReader,
```

### JavadocDeclaration
SQLServerException is not declared to be thrown by method releaseClientContext
in `src/main/java/com/microsoft/sqlserver/jdbc/NTLMAuthentication.java`
#### Snippet
```java
     * Releases the NTLM client context
     *
     * @throws SQLServerException
     *         if error occurs
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/KeyVaultTokenCredential.java`
#### Snippet
```java
     * @param clientSecret
     *        the secret value of the AAD application
     * @throws SQLServerException
     */
    KeyVaultTokenCredential(String clientId, String clientSecret) throws SQLServerException {
```

### JavadocDeclaration
`@param tdsReader` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLCollation.java`
#### Snippet
```java
     * Reads TDS collation from TDS buffer into SQLCollation class.
     * 
     * @param tdsReader
     */
    SQLCollation(TDSReader tdsReader) throws UnsupportedEncodingException, SQLServerException {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLCollation.java`
#### Snippet
```java
     * return sort ID
     * 
     * @return
     */
    int getCollationSortID() {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLCollation.java`
#### Snippet
```java
     * Returns the collation info
     * 
     * @return
     */
    int getCollationInfo() {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
     * Returns string due to structure of DRIVER_PROPERTIES_PROPERTY_ONLY.
     * 
     * @return
     */
    public String getDefaultValue() {
```

### JavadocDeclaration
`@param logger` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
     * @param name
     *        to normalize
     * @param logger
     * @return the normalized property name
     */
```

### JavadocDeclaration
`@param logger` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDriver.java`
#### Snippet
```java
     * @param name
     *        name to normalize
     * @param logger
     * @return the normalized property name
     */
```

### JavadocDeclaration
`@param tdsReader` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/tdsparser.java`
#### Snippet
```java
     * Default parse method to parse all tokens in TDS stream.
     * 
     * @param tdsReader
     * @param tdsTokenHandler
     * @throws SQLServerException
```

### JavadocDeclaration
`@param tdsTokenHandler` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/tdsparser.java`
#### Snippet
```java
     * 
     * @param tdsReader
     * @param tdsTokenHandler
     * @throws SQLServerException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/tdsparser.java`
#### Snippet
```java
     * @param tdsReader
     * @param tdsTokenHandler
     * @throws SQLServerException
     */
    static void parse(TDSReader tdsReader, TDSTokenHandler tdsTokenHandler) throws SQLServerException {
```

### JavadocDeclaration
`@param tdsReader` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/tdsparser.java`
#### Snippet
```java
     * SQLWarnings received in TDS_MSG tokens.
     * 
     * @param tdsReader
     * @param tdsTokenHandler
     * @param readOnlyWarningsFlag
```

### JavadocDeclaration
`@param tdsTokenHandler` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/tdsparser.java`
#### Snippet
```java
     * 
     * @param tdsReader
     * @param tdsTokenHandler
     * @param readOnlyWarningsFlag
     *        - true if only TDS_MSG tokens need to be parsed in TDS Stream. false - to parse all tokens in TDS Stream.
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/tdsparser.java`
#### Snippet
```java
     * @param readOnlyWarningsFlag
     *        - true if only TDS_MSG tokens need to be parsed in TDS Stream. false - to parse all tokens in TDS Stream.
     * @throws SQLServerException
     */
    static void parse(TDSReader tdsReader, TDSTokenHandler tdsTokenHandler,
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
     * Executes a query without cursoring for metadata.
     *
     * @throws SQLServerException
     * @return ResultSet
     * @throws SQLTimeoutException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
     * @throws SQLServerException
     * @return ResultSet
     * @throws SQLTimeoutException
     */
    final java.sql.ResultSet executeQueryInternal() throws SQLServerException, SQLTimeoutException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
     * data prior to executing the statement.
     * 
     * @throws SQLServerException
     * @return the result set containing the meta data
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
     * @param tdsWriter
     *        TDS writer to write sp_prepare params to
     * @throws SQLServerException
     */
    private void doPrep(TDSWriter tdsWriter, TDSCommand command) throws SQLServerException {
```

### JavadocDeclaration
`@param con` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
    /**
     * 
     * @param con
     * @param address
     * @param port
```

### JavadocDeclaration
`@param address` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
     * 
     * @param con
     * @param address
     * @param port
     * @param impersonatedUserCred
```

### JavadocDeclaration
`@param port` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
     * @param con
     * @param address
     * @param port
     * @param impersonatedUserCred
     */
```

### JavadocDeclaration
`@param impersonatedUserCred` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
     * @param address
     * @param port
     * @param impersonatedUserCred
     */
    KerbAuthentication(SQLServerConnection con, String address, int port, GSSCredential impersonatedUserCred,
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
     * Initializes the Kerberos client security context
     * 
     * @throws SQLServerException
     */
    @SuppressWarnings("deprecation")
```

### JavadocDeclaration
SQLServerException is not declared to be thrown by method scanSQLForChar
in `src/main/java/com/microsoft/sqlserver/jdbc/ParameterUtils.java`
#### Snippet
```java
     *        the offset into [sql] to start searching from
     * @return Offset into [sql] where [c] occurs, or sql.length if [c] is not found.
     * @throws SQLServerException
     *         when [sql] does not follow
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/KeyVaultCustomCredentialPolicy.java`
#### Snippet
```java
     * @param credential
     *        the token credential to authenticate the request
     * @throws SQLServerException
     */
    KeyVaultCustomCredentialPolicy(KeyVaultTokenCredential credential) throws SQLServerException {
```

### JavadocDeclaration
Tag `return` is not allowed here
in `src/main/java/com/microsoft/sqlserver/jdbc/DataTypes.java`
#### Snippet
```java
     * Identifies binary JDBC data types.
     * 
     * @return true if the JDBC type is binary
     */
    private final static EnumSet<JDBCType> binaryTypes = EnumSet.of(BINARY, VARBINARY, LONGVARBINARY, BLOB);
```

### JavadocDeclaration
Tag `return` is not allowed here
in `src/main/java/com/microsoft/sqlserver/jdbc/DataTypes.java`
#### Snippet
```java
     * timestamp.toString() does not result in an XML representation of a timestamp.
     *
     * @return true if the JDBC type is textual
     */
    private final static EnumSet<Category> textualCategories = EnumSet.of(Category.CHARACTER, Category.LONG_CHARACTER,
```

### JavadocDeclaration
Tag `return` is not allowed here
in `src/main/java/com/microsoft/sqlserver/jdbc/DataTypes.java`
#### Snippet
```java
     * Identifies numerically signed data types.
     * 
     * @return true if the type can be signed
     */
    private final static EnumSet<JDBCType> signedTypes = EnumSet.of(SMALLINT, INTEGER, BIGINT, REAL, FLOAT, DOUBLE,
```

### JavadocDeclaration
`@param obj` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerException.java`
#### Snippet
```java
     * @param con
     *        the connection
     * @param obj
     * @param errText
     *        the exception message
```

### JavadocDeclaration
`@param sqlServerError` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerException.java`
#### Snippet
```java
     * @param errText
     *        the exception message
     * @param sqlServerError
     * @param bStack
     *        true to generate the stack trace
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerException.java`
#### Snippet
```java
     * @param bStack
     *        true to generate the stack trace
     * @throws SQLServerException
     */
    static void makeFromDatabaseError(SQLServerConnection con, Object obj, String errText,
```

### JavadocDeclaration
`@param obj` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerException.java`
#### Snippet
```java
     * @param con
     *        the connection
     * @param obj
     * @param errText
     *        the exception message
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerException.java`
#### Snippet
```java
     * @param bStack
     *        true to generate the stack trace
     * @throws SQLServerException
     */
    static void makeFromDriverError(SQLServerConnection con, Object obj, String errText, String state,
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerLob.java`
#### Snippet
```java
     * Provides functionality for the result set to maintain blobs it has created.
     * 
     * @throws SQLException
     */
    abstract void fillFromStream() throws SQLException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCallableStatement.java`
#### Snippet
```java
     * @param stmtColEncSetting
     *        the statement column encryption setting
     * @throws SQLServerException
     */
    SQLServerCallableStatement(SQLServerConnection connection, String sql, int nRSType, int nRSConcur,
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java
     * Provides functionality for the result set to maintain clobs it has created.
     * 
     * @throws SQLException
     */
    void fillFromStream() throws SQLException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java
     * Converts the stream to String.
     * 
     * @throws SQLServerException
     */
    private void getStringFromStream() throws SQLServerException {
```

### JavadocDeclaration
Wrong tag `link#removeRef`
in `src/main/java/com/microsoft/sqlserver/jdbc/SharedTimer.java`
#### Snippet
```java
     * The SharedTimer's reference count will be incremented to account for the new reference.
     *
     * When the caller is finished with the SharedTimer it must be released via {@link#removeRef}
     */
    public static SharedTimer getTimer() {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
     *        for the stored procedure
     * @return Resultset from the execution
     * @throws SQLTimeoutException
     */
    private SQLServerResultSet getResultSetFromStoredProc(String catalog, CallableHandles procedure,
```

### JavadocDeclaration
Wrong tag `inID`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
     * incoming identifier is un-escaped.
     * 
     * @inID input identifier to escape.
     * @return the escaped value.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
     * @param catalog
     *        the new catalog
     * @throws SQLServerException
     * @return the old catalog
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java
     *        to execute
     * @return Resultset from the execution
     * @throws SQLTimeoutException
     */
    private SQLServerResultSet getResultSetFromInternalQueries(String catalog, String query) throws SQLException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
     * Checks if the result set is closed
     * 
     * @throws SQLServerException
     */
    void checkClosed() throws SQLServerException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
     * @throws SQLException
     *         if the result set is forward only.
     * @throws SQLFeatureNotSupportedException
     */
    private void throwNotScrollable() throws SQLException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
     * areNullCompressedColumnsInitialized is false. In all other cases this will be a no-op.
     * 
     * @throws SQLServerException
     */
    private void initializeNullCompressedColumns() throws SQLServerException {
```

### JavadocDeclaration
Duplicate @return tag
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
     *
     * @return true if there is a current row
     * @return false if the result set is positioned before the first row or after the last row.
     */
    private boolean hasCurrentRow() {
```

### JavadocDeclaration
`@param jdbcType` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
     * For the case when source database stores unicode data in CHAR/VARCHAR and destination column is NCHAR/NVARCHAR.
     *
     * @param jdbcType
     * @param ssType
     * @return whether conversion to unicode is required.
```

### JavadocDeclaration
`@param ssType` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
     *
     * @param jdbcType
     * @param ssType
     * @return whether conversion to unicode is required.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
     * Writes sql_variant data based on the baseType for bulkcopy
     * 
     * @throws SQLServerException
     */
    private void writeSqlVariant(TDSWriter tdsWriter, Object colValue, ResultSet sourceResultSet, int srcColOrdinal,
```

### JavadocDeclaration
`@param tdsType` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
     * @param length
     *        length of base type + Basetype + probBytes
     * @param tdsType
     * @param probBytes
     * @param tdsWriter
```

### JavadocDeclaration
`@param probBytes` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
     *        length of base type + Basetype + probBytes
     * @param tdsType
     * @param probBytes
     * @param tdsWriter
     * @throws SQLServerException
```

### JavadocDeclaration
`@param tdsWriter` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
     * @param tdsType
     * @param probBytes
     * @param tdsWriter
     * @throws SQLServerException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
     * @param probBytes
     * @param tdsWriter
     * @throws SQLServerException
     */
    private void writeBulkCopySqlVariantHeader(int length, byte tdsType, byte probBytes,
```

### JavadocDeclaration
`@param isRowSet` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
     * @param sourceData
     *        ResultSet to read data rows from.
     * @param isRowSet
     * @throws SQLServerException
     *         If there are any issues encountered when performing the bulk copy operation
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @param srcJdbcType
     *        the source JDBCType
     * @throws SQLServerException
     */
    void writeMoney(BigDecimal moneyVal, int srcJdbcType) throws SQLServerException {
```

### JavadocDeclaration
`@param hostName` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * Used to find a socket to which a connection can be made
     * 
     * @param hostName
     * @param portNumber
     * @param timeoutInMilliSeconds
```

### JavadocDeclaration
`@param portNumber` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * 
     * @param hostName
     * @param portNumber
     * @param timeoutInMilliSeconds
     * @param iPAddressPreference
```

### JavadocDeclaration
`@param timeoutInMilliSeconds` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @param hostName
     * @param portNumber
     * @param timeoutInMilliSeconds
     * @param iPAddressPreference
     * @return connected socket
```

### JavadocDeclaration
`@param iPAddressPreference` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @param portNumber
     * @param timeoutInMilliSeconds
     * @param iPAddressPreference
     * @return connected socket
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @param iPAddressPreference
     * @return connected socket
     * @throws IOException
     */
    Socket findSocket(String hostName, int portNumber, int timeoutInMilliSeconds, boolean useParallel, boolean useTnir,
```

### JavadocDeclaration
IOException is not declared to be thrown by method findSocket
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @param iPAddressPreference
     * @return connected socket
     * @throws IOException
     */
    Socket findSocket(String hostName, int portNumber, int timeoutInMilliSeconds, boolean useParallel, boolean useTnir,
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @param collation
     *        The SQL collation associated with the value. Null for non-textual SQL Server types.
     * @throws SQLServerException
     */
    void writeRPCReaderUnicode(String sName, Reader re, long reLength, boolean bOut,
```

### JavadocDeclaration
`@param length` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * writes Header for sql_variant for TVP
     * 
     * @param length
     * @param tdsType
     * @param probBytes
```

### JavadocDeclaration
`@param tdsType` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * 
     * @param length
     * @param tdsType
     * @param probBytes
     * @throws SQLServerException
```

### JavadocDeclaration
`@param probBytes` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @param length
     * @param tdsType
     * @param probBytes
     * @throws SQLServerException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @param tdsType
     * @param probBytes
     * @throws SQLServerException
     */
    private void writeTVPSqlVariantHeader(int length, byte tdsType, byte probBytes) throws SQLServerException {
```

### JavadocDeclaration
`@param valueLength` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * This function reads valueLength no. of bytes from input buffer without storing them in any array
     *
     * @param valueLength
     * @throws SQLServerException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     *
     * @param valueLength
     * @throws SQLServerException
     */
    final void readSkipBytes(int valueLength) throws SQLServerException {
```

### JavadocDeclaration
`@param tdsWriter` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * Executes this command.
     *
     * @param tdsWriter
     * @param tdsReader
     * @throws SQLServerException
```

### JavadocDeclaration
`@param tdsReader` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     *
     * @param tdsWriter
     * @param tdsReader
     * @throws SQLServerException
     *         on any error executing the command, including cancel or timeout.
```

### JavadocDeclaration
`@param variantType` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * writing sqlCollation information for sqlVariant type when sending character types.
     * 
     * @param variantType
     * @throws SQLServerException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * 
     * @param variantType
     * @throws SQLServerException
     */
    void writeCollationForSqlVariant(SqlVariant variantType) throws SQLServerException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @param scale
     *        the scale of the column
     * @throws SQLServerException
     */
    void writeBigDecimal(BigDecimal bigDecimalVal, int srcJdbcType, int precision,
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * Attempts to poll the input stream to see if the network socket is still connected.
     *
     * @return
     */
    final Boolean networkSocketStillConnected() {
```

### JavadocDeclaration
Duplicate @return tag
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     *
     * @return an InputStream containing the contents of the loaded trust store
     * @return null if the trust store cannot be loaded.
     *
     *         Note: It is by design that this function returns null when the trust store cannot be loaded rather than
```

### JavadocDeclaration
`@param trustStoreType` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * <LI>if certificate is not installed TrustStoreType should be present.
     * 
     * @param trustStoreType
     * @param trustStoreFileName
     * @throws SQLServerException
```

### JavadocDeclaration
`@param trustStoreFileName` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * 
     * @param trustStoreType
     * @param trustStoreFileName
     * @throws SQLServerException
     * @since 6.1.4
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @param trustStoreType
     * @param trustStoreFileName
     * @throws SQLServerException
     * @since 6.1.4
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @param bOut
     *        boolean true if the data value is being registered as an output parameter
     * @throws SQLServerException
     */
    void writeRPCXML(String sName, InputStream stream, long streamLength, boolean bOut) throws SQLServerException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @param collation
     *        The SQL collation associated with the value. Null for non-textual SQL Server types.
     * @throws SQLServerException
     */
    void writeRPCInputStream(String sName, InputStream stream, long streamLength, boolean bOut, JDBCType jdbcType,
```

### JavadocDeclaration
`@param addresses` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * Finds a first resolved InetAddresses by IP version preference.
     *
     * @param addresses
     *
     * @param ipv6first
```

### JavadocDeclaration
`@param ipv6first` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @param addresses
     *
     * @param ipv6first
     *
     * @param hostName
```

### JavadocDeclaration
`@param hostName` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @param ipv6first
     *
     * @param hostName
     * 
     * @param portNumber
```

### JavadocDeclaration
`@param timeoutInMilliSeconds` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @param portNumber
     *        the port number at which connection should be made
     * @param timeoutInMilliSeconds
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     *        the port number at which connection should be made
     * @param timeoutInMilliSeconds
     * @throws IOException
     */
    private void findSocketUsingJavaNIO(InetAddress[] inetAddrs, int portNumber,
```

### JavadocDeclaration
IOException is not declared to be thrown by method poll
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
         * 
         * @return true if the stream is readable.
         * @throws IOException
         *         If an I/O exception occurs.
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     *        Preferred IP address type
     * @return Connected Socket
     * @throws IOException
     * @throws SQLServerException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @return Connected Socket
     * @throws IOException
     * @throws SQLServerException
     */
    private Socket getSocketByIPPreference(String hostName, int portNumber, int timeoutInMilliSeconds,
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
     * @param clientKeyPassword
     *        Private key file's password
     * @throws SQLServerException
     */
    void enableSSL(String host, int port, String clientCertificate, String clientKey, String clientKeyPassword,
```

### JavadocDeclaration
Tag `param` is not allowed here
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * Replaces JDBC syntax parameter markets '?' with SQL Server parameter markers @p1, @p2 etc...
     * 
     * @param sql
     *        the user's SQL
     * @throws SQLServerException
```

### JavadocDeclaration
Tag `throws` is not allowed here
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * @param sql
     *        the user's SQL
     * @throws SQLServerException
     * @return the returned syntax
     */
```

### JavadocDeclaration
Tag `return` is not allowed here
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     *        the user's SQL
     * @throws SQLServerException
     * @return the returned syntax
     */
    static final char[] OUT = {' ', 'O', 'U', 'T'};
```

### JavadocDeclaration
`@param timerExpire` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * Get time remaining to timer expiry
     * 
     * @param timerExpire
     * @return remaining time to expiry
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * Delist the local transaction with DTC.
     * 
     * @throws SQLServerException
     */
    final void jtaUnenlistConnection() throws SQLServerException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * @param propValue
     *        the value of the property.
     * @throws SQLServerException
     */
    void validateMaxSQLLoginName(String propName, String propValue) throws SQLServerException {
```

### JavadocDeclaration
`@param offset` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * @param name
     *        the parameter name
     * @param offset
     * @return int
     */
```

### JavadocDeclaration
Tag `param` is not allowed here
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * Determines the listening port of a named SQL Server instance.
     * 
     * @param server
     *        the server name
     * @param instanceName
```

### JavadocDeclaration
Tag `param` is not allowed here
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * @param server
     *        the server name
     * @param instanceName
     *        the instance
     * @throws SQLServerException
```

### JavadocDeclaration
Tag `throws` is not allowed here
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * @param instanceName
     *        the instance
     * @throws SQLServerException
     * @return the instance's port
     */
```

### JavadocDeclaration
Tag `return` is not allowed here
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     *        the instance
     * @throws SQLServerException
     * @return the instance's port
     */
    private static final int BROWSER_PORT = 1434;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * Checks if the connection is closed
     * 
     * @throws SQLServerException
     */
    void checkClosed() throws SQLServerException {
```

### JavadocDeclaration
`@param serverInfo` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * driver.
     * 
     * @param serverInfo
     * @param timeOutSliceInMillis
     *        -timeout value in milli seconds for one try
```

### JavadocDeclaration
`@param useTnir` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     *        - It is used to indicate whether a parallel algorithm should be tried or not for resolving a hostName.
     *        Note that useParallel is set to false for a routed connection even if multiSubnetFailover is set to true.
     * @param useTnir
     * @param isTnirFirstAttempt
     * @param timeOutsliceInMillisForFullTimeout
```

### JavadocDeclaration
`@param isTnirFirstAttempt` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     *        Note that useParallel is set to false for a routed connection even if multiSubnetFailover is set to true.
     * @param useTnir
     * @param isTnirFirstAttempt
     * @param timeOutsliceInMillisForFullTimeout
     * @return InetSocketAddress of the connected socket.
```

### JavadocDeclaration
`@param timeOutsliceInMillisForFullTimeout` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * @param useTnir
     * @param isTnirFirstAttempt
     * @param timeOutsliceInMillisForFullTimeout
     * @return InetSocketAddress of the connected socket.
     * @throws SQLServerException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * @param timeOutsliceInMillisForFullTimeout
     * @return InetSocketAddress of the connected socket.
     * @throws SQLServerException
     */
    private InetSocketAddress connectHelper(ServerPortPlaceHolder serverInfo, int timeOutSliceInMillis,
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * @param pooledConnection
     *        a parent pooled connection if this is a logical connection
     * @throws SQLServerException
     * @return the database connection
     */
```

### JavadocDeclaration
`@param serverName` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * Get the server name string including redirected server if applicable
     * 
     * @param serverName
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * 
     * @param serverName
     * @return
     */
    String getServerNameString(String serverName) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * @param fedAuthFeatureExtensionData
     *        fedauth feature extension data
     * @throws SQLServerException
     */
    private void sendLogon(LogonCommand logonCommand, SSPIAuthentication authentication,
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * The SharedTimer will be released when the Connection is closed.
     * 
     * @throws SQLServerException
     */
    SharedTimer getSharedTimer() throws SQLServerException {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * Returns the cancelTimeout in seconds.
     * 
     * @return
     */
    final int getCancelQueryTimeoutSeconds() {
```

### JavadocDeclaration
`@param accessTokenCallbackClass` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * of the implementing class for {@link SQLServerAccessTokenCallback}.
     *
     * @param accessTokenCallbackClass
     */
    public void setAccessTokenCallbackClass(String accessTokenCallbackClass) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * @param cookie
     *        the cookie identifying the transaction
     * @throws SQLServerException
     */
    final void jtaEnlistConnection(byte[] cookie) throws SQLServerException {
```

### JavadocDeclaration
Duplicate @return tag
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     *        the string property value.
     * @return false if p == null (meaning take default).
     * @return true if p == "true" (case-insensitive).
     * @return false if p == "false" (case-insensitive).
     * @exception SQLServerException
```

### JavadocDeclaration
Duplicate @return tag
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
     * @return false if p == null (meaning take default).
     * @return true if p == "true" (case-insensitive).
     * @return false if p == "false" (case-insensitive).
     * @exception SQLServerException
     *            thrown if value is not recognized.
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `ivKey` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256EncryptionKey.java`
#### Snippet
```java
    private SQLServerSymmetricKey encryptionKey;
    private SQLServerSymmetricKey macKey;
    private SQLServerSymmetricKey ivKey;

    /**
```

### FieldMayBeFinal
Field `ivKeySaltFormat` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256EncryptionKey.java`
#### Snippet
```java
    private String macKeySaltFormat;
    // Salt used to derive iv key
    private String ivKeySaltFormat;
    private SQLServerSymmetricKey encryptionKey;
    private SQLServerSymmetricKey macKey;
```

### FieldMayBeFinal
Field `macKey` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256EncryptionKey.java`
#### Snippet
```java
    private String ivKeySaltFormat;
    private SQLServerSymmetricKey encryptionKey;
    private SQLServerSymmetricKey macKey;
    private SQLServerSymmetricKey ivKey;

```

### FieldMayBeFinal
Field `encryptionKeySaltFormat` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256EncryptionKey.java`
#### Snippet
```java
    private final String algorithmName;
    // Salt used to derive encryption key
    private String encryptionKeySaltFormat;
    // Salt used to derive mac key
    private String macKeySaltFormat;
```

### FieldMayBeFinal
Field `encryptionKey` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256EncryptionKey.java`
#### Snippet
```java
    // Salt used to derive iv key
    private String ivKeySaltFormat;
    private SQLServerSymmetricKey encryptionKey;
    private SQLServerSymmetricKey macKey;
    private SQLServerSymmetricKey ivKey;
```

### FieldMayBeFinal
Field `macKeySaltFormat` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256EncryptionKey.java`
#### Snippet
```java
    private String encryptionKeySaltFormat;
    // Salt used to derive mac key
    private String macKeySaltFormat;
    // Salt used to derive iv key
    private String ivKeySaltFormat;
```

### FieldMayBeFinal
Field `keylookupValue` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SimpleTtlCache.java`
#### Snippet
```java
    class CacheClear implements Runnable {

        private K keylookupValue;
        final private java.util.logging.Logger logger = java.util.logging.Logger
                .getLogger("com.microsoft.sqlserver.jdbc.SimpleTtlCache.CacheClear");
```

### FieldMayBeFinal
Field `scheduler` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SimpleTtlCache.java`
#### Snippet
```java
    private Duration cacheTtl = Duration.ofHours(DEFAULT_TTL_IN_HOURS); // The default time-to-live is set to 2 hours.

    private static ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable r) {
```

### FieldMayBeFinal
Field `unprocessedResponseCount` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/IdleConnectionResiliency.java`
#### Snippet
```java
    private SessionStateTable sessionStateTable;
    private ReconnectThread reconnectThread;
    private AtomicInteger unprocessedResponseCount = new AtomicInteger();
    private boolean connectionRecoveryPossible;
    private SQLServerException reconnectErrorReceived = null;
```

### FieldMayBeFinal
Field `pid` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerJdbc42.java`
#### Snippet
```java

    /** Client process ID sent during login */
    private static int pid = 0;

    static int getProcessId() {
```

### FieldMayBeFinal
Field `cryptoMetadata` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java
final class Column {
    private TypeInfo typeInfo;
    private CryptoMetadata cryptoMetadata;
    private SqlVariant internalVariant;

```

### FieldMayBeFinal
Field `typeInfo` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/Column.java`
#### Snippet
```java

final class Column {
    private TypeInfo typeInfo;
    private CryptoMetadata cryptoMetadata;
    private SqlVariant internalVariant;
```

### FieldMayBeFinal
Field `versionSize` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256Algorithm.java`
#### Snippet
```java
    private byte[] version = new byte[] {0x01};
    // Added so that java hashing algorithm is similar to c#
    private byte[] versionSize = new byte[] {1};

    /*
```

### FieldMayBeFinal
Field `minimumCipherTextLengthInBytesNoAuthenticationTag` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256Algorithm.java`
#### Snippet
```java
     * of 1 block of cipher Text)
     */
    private int minimumCipherTextLengthInBytesNoAuthenticationTag = 1 + blockSizeInBytes + blockSizeInBytes;

    /*
```

### FieldMayBeFinal
Field `minimumCipherTextLengthInBytesWithAuthenticationTag` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256Algorithm.java`
#### Snippet
```java
     * 1 block of cipher Text)
     */
    private int minimumCipherTextLengthInBytesWithAuthenticationTag = minimumCipherTextLengthInBytesNoAuthenticationTag
            + SQLServerAeadAes256CbcHmac256EncryptionKey.KEYSIZE_IN_BYTES;

```

### FieldMayBeFinal
Field `algorithmVersion` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256Algorithm.java`
#### Snippet
```java
    // Stores column encryption key which includes root key and derived keys
    private SQLServerAeadAes256CbcHmac256EncryptionKey columnEncryptionkey;
    private byte algorithmVersion;
    // This variable indicate whether encryption type is deterministic (if true)
    // or random (if false)
```

### FieldMayBeFinal
Field `version` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256Algorithm.java`
#### Snippet
```java
    // Each block in the AES is 128 bits
    private int blockSizeInBytes = 16;
    private byte[] version = new byte[] {0x01};
    // Added so that java hashing algorithm is similar to c#
    private byte[] versionSize = new byte[] {1};
```

### FieldMayBeFinal
Field `blockSizeInBytes` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256Algorithm.java`
#### Snippet
```java
    private boolean isDeterministic = false;
    // Each block in the AES is 128 bits
    private int blockSizeInBytes = 16;
    private byte[] version = new byte[] {0x01};
    // Added so that java hashing algorithm is similar to c#
```

### FieldMayBeFinal
Field `columnEncryptionkey` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256Algorithm.java`
#### Snippet
```java

    // Stores column encryption key which includes root key and derived keys
    private SQLServerAeadAes256CbcHmac256EncryptionKey columnEncryptionkey;
    private byte algorithmVersion;
    // This variable indicate whether encryption type is deterministic (if true)
```

### FieldMayBeFinal
Field `encryptCipher` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SecureStringUtil.java`
#### Snippet
```java

    /* cryptographic cipher for encryption */
    private Cipher encryptCipher;

    /* cryptographic cipher for decryption */
```

### FieldMayBeFinal
Field `decryptCipher` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SecureStringUtil.java`
#### Snippet
```java

    /* cryptographic cipher for decryption */
    private Cipher decryptCipher;

    /* singleton instance */
```

### FieldMayBeFinal
Field `con` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerParameterMetaData.java`
#### Snippet
```java

    private final SQLServerPreparedStatement stmtParent;
    private SQLServerConnection con;

    private List<Map<String, Object>> procMetadata;
```

### FieldMayBeFinal
Field `instance` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/PersistentTokenCacheAccessAspect.java`
#### Snippet
```java
 */
public class PersistentTokenCacheAccessAspect implements ITokenCacheAccessAspect {
    private static PersistentTokenCacheAccessAspect instance = new PersistentTokenCacheAccessAspect();

    private final Lock lock = new ReentrantLock();
```

### FieldMayBeFinal
Field `sniSecLen` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/AuthenticationJNI.java`
#### Snippet
```java
    private static int sspiBlobMaxlen = 0;
    private byte[] sniSec = new byte[MAXPOINTERSIZE];
    private int[] sniSecLen = {0};
    private final String dnsName;
    private final int port;
```

### FieldMayBeFinal
Field `sniSec` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/AuthenticationJNI.java`
#### Snippet
```java
            .getLogger("com.microsoft.sqlserver.jdbc.internals.AuthenticationJNI");
    private static int sspiBlobMaxlen = 0;
    private byte[] sniSec = new byte[MAXPOINTERSIZE];
    private int[] sniSecLen = {0};
    private final String dnsName;
```

### FieldMayBeFinal
Field `authLogger` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/AuthenticationJNI.java`
#### Snippet
```java
    private static final int MAXPOINTERSIZE = 128; // we keep the SNI_Sec pointer
    private static boolean enabled = false;
    private static java.util.logging.Logger authLogger = java.util.logging.Logger
            .getLogger("com.microsoft.sqlserver.jdbc.internals.AuthenticationJNI");
    private static int sspiBlobMaxlen = 0;
```

### FieldMayBeFinal
Field `con` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/AuthenticationJNI.java`
#### Snippet
```java
    private final String dnsName;
    private final int port;
    private SQLServerConnection con;

    private static final UnsatisfiedLinkError linkError;
```

### FieldMayBeFinal
Field `pcLogger` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPooledConnection.java`
#### Snippet
```java

    /** logger */
    private transient java.util.logging.Logger pcLogger;

    /** trace ID */
```

### FieldMayBeFinal
Field `factoryDataSource` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPooledConnection.java`
#### Snippet
```java

    /** factory datasource */
    private SQLServerDataSource factoryDataSource;

    /** physical connection */
```

### FieldMayBeFinal
Field `factoryUser` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPooledConnection.java`
#### Snippet
```java

    /** factory password */
    private String factoryUser, factoryPassword;

    /** logger */
```

### FieldMayBeFinal
Field `factoryPassword` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPooledConnection.java`
#### Snippet
```java

    /** factory password */
    private String factoryUser, factoryPassword;

    /** logger */
```

### FieldMayBeFinal
Field `metadataCacheLogger` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/ParameterMetaDataCache.java`
#### Snippet
```java
    static final int MAX_WEIGHTED_CAPACITY = 2300; // Size of cache + threshold, above which we trim.
    static CryptoCache cache = new CryptoCache();
    static private java.util.logging.Logger metadataCacheLogger = java.util.logging.Logger
            .getLogger("com.microsoft.sqlserver.jdbc.ParameterMetaDataCache");

```

### FieldMayBeFinal
Field `paramMap` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/ParameterMetaDataCache.java`
#### Snippet
```java
     */
    static final int MAX_WEIGHTED_CAPACITY = 2300;
    private ConcurrentLinkedHashMap<String, ConcurrentLinkedHashMap<String, CryptoMetadata>> paramMap = new Builder<String, ConcurrentLinkedHashMap<String, CryptoMetadata>>()
            .maximumWeightedCapacity(MAX_WEIGHTED_CAPACITY).build();

```

### FieldMayBeFinal
Field `jvmVersion` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerJdbc43.java`
#### Snippet
```java
    }

    private static double jvmVersion = Double.parseDouble(Util.SYSTEM_SPEC_VERSION);

    static SQLServerConnection getSQLServerConnection(String parentInfo) throws SQLServerException {
```

### FieldMayBeFinal
Field `counter` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/ISQLServerEnclaveProvider.java`
#### Snippet
```java
class EnclaveSession {
    private byte[] sessionID;
    private AtomicLong counter;
    private byte[] sessionSecret;

```

### FieldMayBeFinal
Field `sessionID` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/ISQLServerEnclaveProvider.java`
#### Snippet
```java

class EnclaveSession {
    private byte[] sessionID;
    private AtomicLong counter;
    private byte[] sessionSecret;
```

### FieldMayBeFinal
Field `es` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/ISQLServerEnclaveProvider.java`
#### Snippet
```java

    private BaseAttestationRequest bar;
    private EnclaveSession es;
    private long timeCreatedInSeconds;

```

### FieldMayBeFinal
Field `sessionSecret` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/ISQLServerEnclaveProvider.java`
#### Snippet
```java
    private byte[] sessionID;
    private AtomicLong counter;
    private byte[] sessionSecret;

    EnclaveSession(byte[] cs, byte[] b) {
```

### FieldMayBeFinal
Field `bar` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/ISQLServerEnclaveProvider.java`
#### Snippet
```java
    private static final long EIGHT_HOURS_IN_SECONDS = 28800;

    private BaseAttestationRequest bar;
    private EnclaveSession es;
    private long timeCreatedInSeconds;
```

### FieldMayBeFinal
Field `sessionCache` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/ISQLServerEnclaveProvider.java`
#### Snippet
```java

final class EnclaveSessionCache {
    private ConcurrentHashMap<String, EnclaveCacheEntry> sessionCache;

    EnclaveSessionCache() {
```

### FieldMayBeFinal
Field `timeCreatedInSeconds` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/ISQLServerEnclaveProvider.java`
#### Snippet
```java
    private BaseAttestationRequest bar;
    private EnclaveSession es;
    private long timeCreatedInSeconds;

    EnclaveCacheEntry(BaseAttestationRequest b, EnclaveSession e) {
```

### FieldMayBeFinal
Field `osgiLogger` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/osgi/SQLServerDataSourceFactory.java`
#### Snippet
```java
public class SQLServerDataSourceFactory implements DataSourceFactory {

    private static java.util.logging.Logger osgiLogger = java.util.logging.Logger
            .getLogger("com.microsoft.sqlserver.jdbc.osgi.SQLServerDataSourceFactory");
    private static final String NOT_SUPPORTED_MSG = ResourceBundle
```

### FieldMayBeFinal
Field `valuesList` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerFMTQuery.java`
#### Snippet
```java
    private List<String> tableTarget = new ArrayList<>();
    private List<String> possibleAliases = new ArrayList<>();
    private List<List<String>> valuesList = new ArrayList<>();

    List<String> getColumns() {
```

### FieldMayBeFinal
Field `tableTarget` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerFMTQuery.java`
#### Snippet
```java
    private ArrayList<? extends Token> tokenList = null;
    private List<String> userColumns = new ArrayList<>();
    private List<String> tableTarget = new ArrayList<>();
    private List<String> possibleAliases = new ArrayList<>();
    private List<List<String>> valuesList = new ArrayList<>();
```

### FieldMayBeFinal
Field `possibleAliases` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerFMTQuery.java`
#### Snippet
```java
    private List<String> userColumns = new ArrayList<>();
    private List<String> tableTarget = new ArrayList<>();
    private List<String> possibleAliases = new ArrayList<>();
    private List<List<String>> valuesList = new ArrayList<>();

```

### FieldMayBeFinal
Field `userColumns` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerFMTQuery.java`
#### Snippet
```java
    private String prefix = "";
    private ArrayList<? extends Token> tokenList = null;
    private List<String> userColumns = new ArrayList<>();
    private List<String> tableTarget = new ArrayList<>();
    private List<String> possibleAliases = new ArrayList<>();
```

### FieldMayBeFinal
Field `httpLogOptions` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/KeyVaultHttpPipelineBuilder.java`
#### Snippet
```java
    private final List<HttpPipelinePolicy> policies;
    private KeyVaultTokenCredential credential;
    private HttpLogOptions httpLogOptions;
    private final RetryPolicy retryPolicy;

```

### FieldMayBeFinal
Field `lockObject` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/ActivityCorrelator.java`
#### Snippet
```java

    private static ActivityId activityId;
    private static Lock lockObject = new ReentrantLock();

    // Get the current ActivityId in TLS
```

### FieldMayBeFinal
Field `cachedCryptographyClients` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionAzureKeyVaultProvider.java`
#### Snippet
```java

    private Map<String, KeyClient> cachedKeyClients = new ConcurrentHashMap<>();
    private Map<String, CryptographyClient> cachedCryptographyClients = new ConcurrentHashMap<>();
    private TokenCredential credential;

```

### FieldMayBeFinal
Field `cachedKeyClients` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerColumnEncryptionAzureKeyVaultProvider.java`
#### Snippet
```java
    private static final byte[] firstVersion = new byte[] {0x01};

    private Map<String, KeyClient> cachedKeyClients = new ConcurrentHashMap<>();
    private Map<String, CryptographyClient> cachedCryptographyClients = new ConcurrentHashMap<>();
    private TokenCredential credential;
```

### FieldMayBeFinal
Field `connectionProps` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDataSource.java`
#### Snippet
```java
     * Properties passed to SQLServerConnection class
     */
    private Properties connectionProps;

    /**
```

### FieldMayBeFinal
Field `columnList` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkBatchInsertRecord.java`
#### Snippet
```java
    private transient List<Parameter[]> batchParam;
    private int batchParamIndex = -1;
    private List<String> columnList;
    private List<String> valueList;

```

### FieldMayBeFinal
Field `encryptionAlgoFactoryMap` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerEncryptionAlgorithmFactoryList.java`
#### Snippet
```java
final class SQLServerEncryptionAlgorithmFactoryList {

    private ConcurrentHashMap<String, SQLServerEncryptionAlgorithmFactory> encryptionAlgoFactoryMap;

    private static final SQLServerEncryptionAlgorithmFactoryList instance = new SQLServerEncryptionAlgorithmFactoryList();
```

### FieldMayBeFinal
Field `batchParam` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkBatchInsertRecord.java`
#### Snippet
```java
    private static final long serialVersionUID = -955998113956445541L;

    private transient List<Parameter[]> batchParam;
    private int batchParamIndex = -1;
    private List<String> columnList;
```

### FieldMayBeFinal
Field `valueList` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkBatchInsertRecord.java`
#### Snippet
```java
    private int batchParamIndex = -1;
    private List<String> columnList;
    private List<String> valueList;

    /*
```

### FieldMayBeFinal
Field `typeName` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java

        private byte typeCode;
        private String typeName;
        private static final InternalSpatialDatatype[] VALUES = values();

```

### FieldMayBeFinal
Field `typeCode` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java
        INVALID_TYPE((byte) 0, null);

        private byte typeCode;
        private String typeName;
        private static final InternalSpatialDatatype[] VALUES = values();
```

### FieldMayBeFinal
Field `versionOneShapeIndexes` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java
    private static final byte IS_LARGER_THAN_HEMISPHERE_MASK = 0b00100000;

    private List<Integer> versionOneShapeIndexes = new ArrayList<>();

    private static final String EMPTY_STR = "EMPTY";
```

### FieldMayBeFinal
Field `label` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/dataclassification/SensitivityProperty.java`
#### Snippet
```java
 */
public class SensitivityProperty {
    private Label label;
    private InformationType informationType;
    private int sensitivityRank;
```

### FieldMayBeFinal
Field `informationType` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/dataclassification/SensitivityProperty.java`
#### Snippet
```java
public class SensitivityProperty {
    private Label label;
    private InformationType informationType;
    private int sensitivityRank;

```

### FieldMayBeFinal
Field `name` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/dataclassification/InformationType.java`
#### Snippet
```java
 */
public class InformationType {
    private String name;
    private String id;

```

### FieldMayBeFinal
Field `id` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/dataclassification/InformationType.java`
#### Snippet
```java
public class InformationType {
    private String name;
    private String id;

    /**
```

### FieldMayBeFinal
Field `sensitivityProperties` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/dataclassification/ColumnSensitivity.java`
#### Snippet
```java
 */
public class ColumnSensitivity {
    private List<SensitivityProperty> sensitivityProperties;

    /**
```

### FieldMayBeFinal
Field `failoverMap` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/FailOverMapSingleton.java`
#### Snippet
```java
final class FailoverMapSingleton {
    private static int initialHashmapSize = 5;
    private static HashMap<String, FailoverInfo> failoverMap = new HashMap<>(initialHashmapSize);
    private static final Lock LOCK = new ReentrantLock();

```

### FieldMayBeFinal
Field `initialHashmapSize` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/FailOverMapSingleton.java`
#### Snippet
```java

final class FailoverMapSingleton {
    private static int initialHashmapSize = 5;
    private static HashMap<String, FailoverInfo> failoverMap = new HashMap<>(initialHashmapSize);
    private static final Lock LOCK = new ReentrantLock();
```

### FieldMayBeFinal
Field `X` may be 'final'
in `src/main/java/mssql/security/provider/MD4.java`
#### Snippet
```java
    private static final int DIGEST_LENGTH = 16;
    private int H1, H2, H3, H4; // IV's
    private int[] X = new int[16];
    private int xOff;

```

### FieldMayBeFinal
Field `defaultValue` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/JaasConfiguration.java`
#### Snippet
```java

    private final Configuration delegate;
    private AppConfigurationEntry[] defaultValue;

    private static AppConfigurationEntry[] generateDefaultConfiguration() {
```

### FieldMayBeFinal
Field `keyList` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/AE.java`
#### Snippet
```java
    private static final long serialVersionUID = -4568542970907052239L;

    private transient CekTableEntry[] keyList;

    CekTable(int tableSize) {
```

### FieldMayBeFinal
Field `xaLogger` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAConnection.java`
#### Snippet
```java

    /** logger */
    private transient Logger xaLogger;

    /** reentrant lock */
```

### FieldMayBeFinal
Field `workstation` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/NTLMAuthentication.java`
#### Snippet
```java

        // workstation
        private String workstation;

        // unicode bytes of server SPN
```

### FieldMayBeFinal
Field `serverChallenge` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/NTLMAuthentication.java`
#### Snippet
```java

        // server challenge from Challenge msg
        private byte[] serverChallenge = new byte[NTLM_SERVER_CHALLENGE_LENGTH];

        /**
```

### FieldMayBeFinal
Field `sr` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCSVFileRecord.java`
#### Snippet
```java

    /** input stream reader */
    private transient InputStreamReader sr;

    /** file input stream */
```

### FieldMayBeFinal
Field `parentOffset` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/spatialdatatypes/Shape.java`
#### Snippet
```java
 */
public class Shape {
    private int parentOffset;
    private int figureOffset;
    private byte openGISType;
```

### FieldMayBeFinal
Field `openGISType` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/spatialdatatypes/Shape.java`
#### Snippet
```java
    private int parentOffset;
    private int figureOffset;
    private byte openGISType;

    /**
```

### FieldMayBeFinal
Field `rank` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/dataclassification/SensitivityClassification.java`
#### Snippet
```java

        private static final SensitivityRank[] VALUES = values();
        private int rank;

        private SensitivityRank(int rank) {
```

### FieldMayBeFinal
Field `informationTypes` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/dataclassification/SensitivityClassification.java`
#### Snippet
```java

    private List<Label> labels;
    private List<InformationType> informationTypes;
    private List<ColumnSensitivity> columnSensitivities;
    private int sensitivityRank;
```

### FieldMayBeFinal
Field `labels` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/dataclassification/SensitivityClassification.java`
#### Snippet
```java
    }

    private List<Label> labels;
    private List<InformationType> informationTypes;
    private List<ColumnSensitivity> columnSensitivities;
```

### FieldMayBeFinal
Field `columnSensitivities` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/dataclassification/SensitivityClassification.java`
#### Snippet
```java
    private List<Label> labels;
    private List<InformationType> informationTypes;
    private List<ColumnSensitivity> columnSensitivities;
    private int sensitivityRank;

```

### FieldMayBeFinal
Field `id` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/dataclassification/Label.java`
#### Snippet
```java
public class Label {
    private String name;
    private String id;

    /**
```

### FieldMayBeFinal
Field `name` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/dataclassification/Label.java`
#### Snippet
```java
 */
public class Label {
    private String name;
    private String id;

```

### FieldMayBeFinal
Field `sResourceManagerId` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
    private static boolean xaInitDone;
    private static final Lock xaInitLock = new ReentrantLock();
    private String sResourceManagerId;
    private int enlistedTransactionCount;
    final private Logger xaLogger;
```

### FieldMayBeFinal
Field `controlConnection` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
    final static int XA_INIT = 10;

    private SQLServerConnection controlConnection;
    private SQLServerConnection con; // original connection

```

### FieldMayBeFinal
Field `xaStatements` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java
    public static final int SSTRANSTIGHTLYCPLD = 0x8000;

    private SQLServerCallableStatement[] xaStatements = {null, null, null, null, null, null, null, null, null, null};
    private final String traceID;
    /**
```

### FieldMayBeFinal
Field `con` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerXAResource.java`
#### Snippet
```java

    private SQLServerConnection controlConnection;
    private SQLServerConnection con; // original connection

    private boolean serverInfoRetrieved;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/tdsparser.java`
#### Snippet
```java

    /** TDS protocol diagnostics logger */
    private static Logger logger = Logger.getLogger("com.microsoft.sqlserver.jdbc.internals.TDS.TOKEN");

    /*
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/tdsparser.java`
#### Snippet
```java

    /** TDS protocol diagnostics logger */
    private static Logger logger = Logger.getLogger("com.microsoft.sqlserver.jdbc.internals.TDS.TOKEN");

    final SQLServerError getDatabaseError() {
```

### FieldMayBeFinal
Field `oneByteArray` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/PLPInputStream.java`
#### Snippet
```java
    private int leftOverReadLimit = 0;

    private byte[] oneByteArray = new byte[1];

    /**
```

### FieldMayBeFinal
Field `cryptoMetaBatch` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java
     * crypto meta batch
     */
    private Vector<CryptoMetadata> cryptoMetaBatch = new Vector<>();

    /**
```

### FieldMayBeFinal
Field `sqlTextCacheKey` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerPreparedStatement.java`
#### Snippet
```java

    /** Hash of user supplied SQL statement used for various cache lookups */
    private CityHash128Key sqlTextCacheKey;

    /**
```

### FieldMayBeFinal
Field `algorithmVersion` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256Factory.java`
#### Snippet
```java
class SQLServerAeadAes256CbcHmac256Factory extends SQLServerEncryptionAlgorithmFactory {
    // In future we can have more
    private byte algorithmVersion = 0x1;
    private ConcurrentHashMap<String, SQLServerAeadAes256CbcHmac256Algorithm> encryptionAlgorithms = new ConcurrentHashMap<>();

```

### FieldMayBeFinal
Field `encryptionAlgorithms` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAeadAes256CbcHmac256Factory.java`
#### Snippet
```java
    // In future we can have more
    private byte algorithmVersion = 0x1;
    private ConcurrentHashMap<String, SQLServerAeadAes256CbcHmac256Algorithm> encryptionAlgorithms = new ConcurrentHashMap<>();

    @Override
```

### FieldMayBeFinal
Field `serverCert` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerTrustManager.java`
#### Snippet
```java
    private final String logContext;
    private String hostName;
    private String serverCert;

    ServerCertificateX509TrustManager(TDSChannel tdsChannel, String cert, String hostName) {
```

### FieldMayBeFinal
Field `hostName` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerTrustManager.java`
#### Snippet
```java
    private final String logContext;
    private final X509TrustManager defaultTrustManager;
    private String hostName;

    HostNameOverrideX509TrustManager(TDSChannel tdsChannel, X509TrustManager tm, String hostName) {
```

### FieldMayBeFinal
Field `hostName` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerTrustManager.java`
#### Snippet
```java
    private final Logger logger;
    private final String logContext;
    private String hostName;
    private String serverCert;

```

### FieldMayBeFinal
Field `nonce` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAASEnclaveProvider.java`
#### Snippet
```java
    // Nonce length is always 256
    private static final byte[] NONCE_LENGTH = new byte[] {0x0, 0x1, 0x0, 0x0};
    private byte[] nonce = new byte[256];

    AASAttestationParameters(String attestationUrl) throws SQLServerException, IOException {
```

### FieldMayBeFinal
Field `enclaveCache` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAASEnclaveProvider.java`
#### Snippet
```java
public class SQLServerAASEnclaveProvider implements ISQLServerEnclaveProvider {

    private static EnclaveSessionCache enclaveCache = new EnclaveSessionCache();

    private AASAttestationParameters aasParams = null;
```

### FieldMayBeFinal
Field `attestationToken` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAASEnclaveProvider.java`
#### Snippet
```java
class AASAttestationResponse extends BaseAttestationResponse {

    private byte[] attestationToken;
    private static ConcurrentHashMap<String, JWTCertificateEntry> certificateCache = new ConcurrentHashMap<>();

```

### FieldMayBeFinal
Field `timeCreatedInSeconds` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAASEnclaveProvider.java`
#### Snippet
```java

    private JsonArray certificates;
    private long timeCreatedInSeconds;

    JWTCertificateEntry(JsonArray j) {
```

### FieldMayBeFinal
Field `certificateCache` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAASEnclaveProvider.java`
#### Snippet
```java

    private byte[] attestationToken;
    private static ConcurrentHashMap<String, JWTCertificateEntry> certificateCache = new ConcurrentHashMap<>();

    AASAttestationResponse(byte[] b) throws SQLServerException {
```

### FieldMayBeFinal
Field `certificates` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerAASEnclaveProvider.java`
#### Snippet
```java
    private static final long TWENTY_FOUR_HOUR_IN_SECONDS = 86400;

    private JsonArray certificates;
    private long timeCreatedInSeconds;

```

### FieldMayBeFinal
Field `map` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerCallableStatement.java`
#### Snippet
```java

    /** map */
    private Map<String, Integer> map = new ConcurrentHashMap<>();

    /** atomic integer */
```

### FieldMayBeFinal
Field `bSingleByte` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerClob.java`
#### Snippet
```java
    }

    private byte[] bSingleByte = new byte[1];

    public void write(int b) throws java.io.IOException {
```

### FieldMayBeFinal
Field `rootKey` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSymmetricKey.java`
#### Snippet
```java
 */
class SQLServerSymmetricKey {
    private byte[] rootKey;

    SQLServerSymmetricKey(byte[] rootKey) throws SQLServerException {
```

### FieldMayBeFinal
Field `certificateCache` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerVSMEnclaveProvider.java`
#### Snippet
```java
    }

    private static ConcurrentHashMap<String, X509CertificateEntry> certificateCache = new ConcurrentHashMap<>();

    private byte[] getAttestationCertificates() throws IOException {
```

### FieldMayBeFinal
Field `certificates` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerVSMEnclaveProvider.java`
#### Snippet
```java
    private static final long EIGHT_HOUR_IN_SECONDS = 28800;

    private byte[] certificates;
    private long timeCreatedInSeconds;

```

### FieldMayBeFinal
Field `segmentType` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/spatialdatatypes/Segment.java`
#### Snippet
```java
 */
public class Segment {
    private byte segmentType;

    /**
```

### FieldMayBeFinal
Field `timeCreatedInSeconds` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerVSMEnclaveProvider.java`
#### Snippet
```java

    private byte[] certificates;
    private long timeCreatedInSeconds;

    X509CertificateEntry(byte[] b) {
```

### FieldMayBeFinal
Field `enclaveCache` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerVSMEnclaveProvider.java`
#### Snippet
```java
public class SQLServerVSMEnclaveProvider implements ISQLServerEnclaveProvider {

    private static EnclaveSessionCache enclaveCache = new EnclaveSessionCache();

    private VSMAttestationParameters vsmParams = null;
```

### FieldMayBeFinal
Field `pointOffset` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/spatialdatatypes/Figure.java`
#### Snippet
```java
public class Figure {
    private byte figuresAttribute;
    private int pointOffset;

    /**
```

### FieldMayBeFinal
Field `con` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSetMetaData.java`
#### Snippet
```java

    /** connection */
    private SQLServerConnection con;

    /** resultset */
```

### FieldMayBeFinal
Field `connection` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerDatabaseMetaData.java`
#### Snippet
```java

    /** connection */
    private SQLServerConnection connection;

    static final String URL_PREFIX = "jdbc:sqlserver://";
```

### FieldMayBeFinal
Field `startRow` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        private final int serverCursorId;
        private int fetchType;
        private int startRow;
        private int numRows;

```

### FieldMayBeFinal
Field `numRows` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        private int fetchType;
        private int startRow;
        private int numRows;

        CursorFetchCommand(int serverCursorId, int fetchType, int startRow, int numRows) {
```

### FieldMayBeFinal
Field `fetchType` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerResultSet.java`
#### Snippet
```java
        private static final long serialVersionUID = 1L;
        private final int serverCursorId;
        private int fetchType;
        private int startRow;
        private int numRows;
```

### FieldMayBeFinal
Field `ownsConnection` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
     * Flag if SQLServerBulkCopy owns the connection and should close it when Close is called
     */
    private boolean ownsConnection;

    /**
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
 */
final class TDSWriter {
    private static Logger logger = Logger.getLogger("com.microsoft.sqlserver.jdbc.internals.TDS.Writer");

    private static final String UNEXPECTED_SSTYPE = "Unexpected SSType: ";
```

### FieldMayBeFinal
Field `valueBytes` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    // (byte, int, long, etc.) and Strings from their native form to bytes for sending to
    // the channel buffers.
    private byte[] valueBytes = new byte[256];

    // Monotonically increasing packet number associated with the current message
```

### FieldMayBeFinal
Field `packetLogger` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java

    /** TDS packet payload logger */
    private static Logger packetLogger = Logger.getLogger("com.microsoft.sqlserver.jdbc.internals.TDS.DATA");
    private final boolean isLoggingPackets = packetLogger.isLoggable(Level.FINEST);

```

### FieldMayBeFinal
Field `cancelQueryTimeoutSeconds` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    private volatile boolean readingResponse;
    private int queryTimeoutSeconds;
    private int cancelQueryTimeoutSeconds;
    private transient ScheduledFuture<?> timeout;

```

### FieldMayBeFinal
Field `queryTimeoutSeconds` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/IOBuffer.java`
#### Snippet
```java
    // or by detaching.
    private volatile boolean readingResponse;
    private int queryTimeoutSeconds;
    private int cancelQueryTimeoutSeconds;
    private transient ScheduledFuture<?> timeout;
```

### FieldMayBeFinal
Field `key` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        private volatile boolean evictedFromCache;
        private volatile boolean explicitlyDiscarded;
        private CityHash128Key key;

        PreparedStatementHandle(CityHash128Key key, int handle, boolean isDirectSql, boolean isEvictedFromCache) {
```

### FieldMayBeFinal
Field `isDirectSql` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        private int handle = 0;
        private final AtomicInteger handleRefCount = new AtomicInteger();
        private boolean isDirectSql;
        private volatile boolean evictedFromCache;
        private volatile boolean explicitlyDiscarded;
```

### FieldMayBeFinal
Field `sessionRecovery` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

    /** Session Recovery Object */
    private transient IdleConnectionResiliency sessionRecovery = new IdleConnectionResiliency(this);

    IdleConnectionResiliency getSessionRecovery() {
```

### FieldMayBeFinal
Field `loggingClassNameBase` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
            .getLogger("com.microsoft.sqlserver.jdbc.Connection");

    private static String loggingClassNameBase = "com.microsoft.sqlserver.jdbc.SQLServerConnection";

    /** Instance-specific loggingClassName to identity the connection in logs */
```

### FieldMayBeFinal
Field `columnEncryptionTrustedMasterKeyPaths` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
    /** trusted servername AE */
    private String trustedServerNameAE = null;
    private static Map<String, List<String>> columnEncryptionTrustedMasterKeyPaths = new HashMap<>();

    /**
```

### FieldMayBeFinal
Field `discardedPreparedStatementHandles` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

    /** Handle the actual queue of discarded prepared statements. */
    private ConcurrentLinkedQueue<PreparedStatementHandle> discardedPreparedStatementHandles = new ConcurrentLinkedQueue<>();

    /** discardedPreparedStatementHandle count */
```

### FieldMayBeFinal
Field `discardedPreparedStatementHandleCount` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

    /** discardedPreparedStatementHandle count */
    private AtomicInteger discardedPreparedStatementHandleCount = new AtomicInteger(0);

    /** fedAuth required by user flag */
```

### FieldMayBeFinal
Field `segments` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        private static final long serialVersionUID = 166788428640603097L;
        String unhashedString;
        private long[] segments;
        private int hashCode;

```

### FieldMayBeFinal
Field `parsedSQLCache` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

    /** Cache of parsed SQL meta data */
    static private ConcurrentLinkedHashMap<CityHash128Key, ParsedSQLCacheItem> parsedSQLCache;

    static {
```

### FieldMayBeFinal
Field `transactionDescriptor` may be 'final'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

    /** transaction descriptor */
    private byte[] transactionDescriptor = new byte[8];

    /**
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java
                readComma();
            } else if (wkt.charAt(currentWktPos) == ')') { // about to exit while loop
                continue;
            } else { // unexpected input
                throwIllegalWKTPosition();
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java
                    if (shapes[tempCurrentShapeIndex].getFigureOffset() == -1) {
                        tempCurrentShapeIndex++;
                        continue;
                    } else {
                        figureEndIndex = shapes[tempCurrentShapeIndex].getFigureOffset();
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java
                readComma();
            } else if (wkt.charAt(currentWktPos) == ')') { // about to exit while loop
                continue;
            } else { // unexpected input
                throwIllegalWKTPosition();
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java
                readComma();
            } else if (wkt.charAt(currentWktPos) == ')') { // about to exit while loop
                continue;
            } else { // unexpected input
                throwIllegalWKTPosition();
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSpatialDatatype.java`
#### Snippet
```java
                readComma();
            } else if (wkt.charAt(currentWktPos) == ')') { // about to exit while loop
                continue;
            } else { // unexpected input
                throwIllegalWKTPosition();
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
                    String repStr = replaceParameterWithString(str, '?', "null");
                    retSql.append(repStr);
                    continue;
                } else {
                    retSql.append(str);
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
                } else {
                    retSql.append(str);
                    continue;
                }
            }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `guid` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/Util.java`
#### Snippet
```java
    static final String readGUID(byte[] inputGUID) {
        String guidTemplate = "NNNNNNNN-NNNN-NNNN-NNNN-NNNNNNNNNNNN";
        byte[] guid = inputGUID;

        StringBuilder sb = new StringBuilder(guidTemplate.length());
```

### UnnecessaryLocalVariable
Local variable `connectException` is redundant
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerException.java`
#### Snippet
```java
    static void convertConnectExceptionToSQLServerException(String hostName, int portNumber, SQLServerConnection conn,
            Exception ex) throws SQLServerException {
        Exception connectException = ex;
        // Throw the exception if exception was caught by code above (stored in connectException).
        if (connectException != null) {
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy field 'X'
in `src/main/java/mssql/security/provider/MD4.java`
#### Snippet
```java
     * Copy constructor. This will copy the state of the provided message digest.
     */
    public MD4(MD4 t) {
        System.arraycopy(t.xBuf, 0, xBuf, 0, t.xBuf.length);

```

### CopyConstructorMissesField
Copy constructor does not copy field 'collation'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerMetaData.java`
#### Snippet
```java
     *        the object passed to initialize a new instance of SQLServerMetaData
     */
    public SQLServerMetaData(SQLServerMetaData sqlServerMetaData) {
        this.columnName = sqlServerMetaData.columnName;
        this.javaSqlType = sqlServerMetaData.javaSqlType;
```

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\[(?:[^\]]|(?:\]\]))+?\])`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     */
    private final static Pattern JDBC_CALL_SYNTAX = Pattern
            .compile("(?s)\\s*?\\{\\s*?(\\?\\s*?=)?\\s*?[cC][aA][lL][lL]\\s+?" + SQL_IDENTIFIER_WITHOUT_GROUPS
                    + "(?:\\s*?\\((.*)\\))?\\s*\\}.*+");

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\]\])`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     */
    private final static Pattern JDBC_CALL_SYNTAX = Pattern
            .compile("(?s)\\s*?\\{\\s*?(\\?\\s*?=)?\\s*?[cC][aA][lL][lL]\\s+?" + SQL_IDENTIFIER_WITHOUT_GROUPS
                    + "(?:\\s*?\\((.*)\\))?\\s*\\}.*+");

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:"(?:[^"]|(?:""))+?")`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     */
    private final static Pattern JDBC_CALL_SYNTAX = Pattern
            .compile("(?s)\\s*?\\{\\s*?(\\?\\s*?=)?\\s*?[cC][aA][lL][lL]\\s+?" + SQL_IDENTIFIER_WITHOUT_GROUPS
                    + "(?:\\s*?\\((.*)\\))?\\s*\\}.*+");

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:"")`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     */
    private final static Pattern JDBC_CALL_SYNTAX = Pattern
            .compile("(?s)\\s*?\\{\\s*?(\\?\\s*?=)?\\s*?[cC][aA][lL][lL]\\s+?" + SQL_IDENTIFIER_WITHOUT_GROUPS
                    + "(?:\\s*?\\((.*)\\))?\\s*\\}.*+");

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\S+?)`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     */
    private final static Pattern JDBC_CALL_SYNTAX = Pattern
            .compile("(?s)\\s*?\\{\\s*?(\\?\\s*?=)?\\s*?[cC][aA][lL][lL]\\s+?" + SQL_IDENTIFIER_WITHOUT_GROUPS
                    + "(?:\\s*?\\((.*)\\))?\\s*\\}.*+");

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     * non-whitespace characters. - including multipart identifiers
     */
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     * non-whitespace characters. - including multipart identifiers
     */
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\\]\\])`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     * non-whitespace characters. - including multipart identifiers
     */
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\"(?:[^\"]|(?:\"\"))+?\")`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     * non-whitespace characters. - including multipart identifiers
     */
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\"\")`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     * non-whitespace characters. - including multipart identifiers
     */
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\\S+?)`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     * non-whitespace characters. - including multipart identifiers
     */
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\[(?:[^\]]|(?:\]\]))+?\])`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
            + SQL_IDENTIFIER_PART + "){0,3}?)";

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\]\])`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
            + SQL_IDENTIFIER_PART + "){0,3}?)";

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:"(?:[^"]|(?:""))+?")`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
            + SQL_IDENTIFIER_PART + "){0,3}?)";

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:"")`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
            + SQL_IDENTIFIER_PART + "){0,3}?)";

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\S+?)`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
            + SQL_IDENTIFIER_PART + "){0,3}?)";

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\[(?:[^\]]|(?:\]\]))+?\])`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
            + SQL_IDENTIFIER_PART + "){0,3}?)";

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\]\])`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
            + SQL_IDENTIFIER_PART + "){0,3}?)";

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:"(?:[^"]|(?:""))+?")`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
            + SQL_IDENTIFIER_PART + "){0,3}?)";

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:"")`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
            + SQL_IDENTIFIER_PART + "){0,3}?)";

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\S+?)`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
    private final static String SQL_IDENTIFIER_PART = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";

    private final static String SQL_IDENTIFIER_WITHOUT_GROUPS = "(" + SQL_IDENTIFIER_PART + "(?:\\."
            + SQL_IDENTIFIER_PART + "){0,3}?)";

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\[(?:[^\]]|(?:\]\]))+?\])`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     * amounts of whitespace in the obvious places.
     */
    private final static Pattern SQL_EXEC_SYNTAX = Pattern.compile("\\s*?[eE][xX][eE][cC](?:[uU][tT][eE])??\\s+?("
            + SQL_IDENTIFIER_WITHOUT_GROUPS + "\\s*?=\\s+?)??" + SQL_IDENTIFIER_WITHOUT_GROUPS + "(?:$|(?:\\s+?.*+))");

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\]\])`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     * amounts of whitespace in the obvious places.
     */
    private final static Pattern SQL_EXEC_SYNTAX = Pattern.compile("\\s*?[eE][xX][eE][cC](?:[uU][tT][eE])??\\s+?("
            + SQL_IDENTIFIER_WITHOUT_GROUPS + "\\s*?=\\s+?)??" + SQL_IDENTIFIER_WITHOUT_GROUPS + "(?:$|(?:\\s+?.*+))");

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:"(?:[^"]|(?:""))+?")`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     * amounts of whitespace in the obvious places.
     */
    private final static Pattern SQL_EXEC_SYNTAX = Pattern.compile("\\s*?[eE][xX][eE][cC](?:[uU][tT][eE])??\\s+?("
            + SQL_IDENTIFIER_WITHOUT_GROUPS + "\\s*?=\\s+?)??" + SQL_IDENTIFIER_WITHOUT_GROUPS + "(?:$|(?:\\s+?.*+))");

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:"")`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     * amounts of whitespace in the obvious places.
     */
    private final static Pattern SQL_EXEC_SYNTAX = Pattern.compile("\\s*?[eE][xX][eE][cC](?:[uU][tT][eE])??\\s+?("
            + SQL_IDENTIFIER_WITHOUT_GROUPS + "\\s*?=\\s+?)??" + SQL_IDENTIFIER_WITHOUT_GROUPS + "(?:$|(?:\\s+?.*+))");

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\S+?)`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     * amounts of whitespace in the obvious places.
     */
    private final static Pattern SQL_EXEC_SYNTAX = Pattern.compile("\\s*?[eE][xX][eE][cC](?:[uU][tT][eE])??\\s+?("
            + SQL_IDENTIFIER_WITHOUT_GROUPS + "\\s*?=\\s+?)??" + SQL_IDENTIFIER_WITHOUT_GROUPS + "(?:$|(?:\\s+?.*+))");

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\[(?:[^\]]|(?:\]\]))+?\])`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     */
    private final static Pattern SQL_EXEC_SYNTAX = Pattern.compile("\\s*?[eE][xX][eE][cC](?:[uU][tT][eE])??\\s+?("
            + SQL_IDENTIFIER_WITHOUT_GROUPS + "\\s*?=\\s+?)??" + SQL_IDENTIFIER_WITHOUT_GROUPS + "(?:$|(?:\\s+?.*+))");

    /*
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\]\])`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     */
    private final static Pattern SQL_EXEC_SYNTAX = Pattern.compile("\\s*?[eE][xX][eE][cC](?:[uU][tT][eE])??\\s+?("
            + SQL_IDENTIFIER_WITHOUT_GROUPS + "\\s*?=\\s+?)??" + SQL_IDENTIFIER_WITHOUT_GROUPS + "(?:$|(?:\\s+?.*+))");

    /*
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:"(?:[^"]|(?:""))+?")`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     */
    private final static Pattern SQL_EXEC_SYNTAX = Pattern.compile("\\s*?[eE][xX][eE][cC](?:[uU][tT][eE])??\\s+?("
            + SQL_IDENTIFIER_WITHOUT_GROUPS + "\\s*?=\\s+?)??" + SQL_IDENTIFIER_WITHOUT_GROUPS + "(?:$|(?:\\s+?.*+))");

    /*
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:"")`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     */
    private final static Pattern SQL_EXEC_SYNTAX = Pattern.compile("\\s*?[eE][xX][eE][cC](?:[uU][tT][eE])??\\s+?("
            + SQL_IDENTIFIER_WITHOUT_GROUPS + "\\s*?=\\s+?)??" + SQL_IDENTIFIER_WITHOUT_GROUPS + "(?:$|(?:\\s+?.*+))");

    /*
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\S+?)`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     */
    private final static Pattern SQL_EXEC_SYNTAX = Pattern.compile("\\s*?[eE][xX][eE][cC](?:[uU][tT][eE])??\\s+?("
            + SQL_IDENTIFIER_WITHOUT_GROUPS + "\\s*?=\\s+?)??" + SQL_IDENTIFIER_WITHOUT_GROUPS + "(?:$|(?:\\s+?.*+))");

    /*
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\\s+?.*+)`
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerStatement.java`
#### Snippet
```java
     */
    private final static Pattern SQL_EXEC_SYNTAX = Pattern.compile("\\s*?[eE][xX][eE][cC](?:[uU][tT][eE])??\\s+?("
            + SQL_IDENTIFIER_WITHOUT_GROUPS + "\\s*?=\\s+?)??" + SQL_IDENTIFIER_WITHOUT_GROUPS + "(?:$|(?:\\s+?.*+))");

    /*
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/microsoft/sqlserver/jdbc/IdleConnectionResiliency.java`
#### Snippet
```java
                        try {
                            if (connectRetryCount > 1) {
                                Thread.sleep((long) (con.getRetryInterval()) * 1000);
                            }
                        } catch (InterruptedException ie) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

                        try {
                            Thread.sleep(sleepInterval);
                        } catch (InterruptedException e1) {
                            // re-interrupt the current thread, in order to restore the thread's interrupt status.
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                }
                try {
                    Thread.sleep(sleepInterval);
                } catch (InterruptedException e) {
                    // re-interrupt the current thread, in order to restore the thread's interrupt status.
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
                        }
                        try {
                            Thread.sleep(TimeUnit.SECONDS.toMillis(connectRetryInterval));
                        } catch (InterruptedException ex) {
                            // re-interrupt the current thread, in order to restore the thread's interrupt status.
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSecurityUtility.java`
#### Snippet
```java
        String scope = resource.endsWith(SQLServerMSAL4JUtils.SLASH_DEFAULT) ? resource : resource
                + SQLServerMSAL4JUtils.SLASH_DEFAULT;
        tokenRequestContext.setScopes(Arrays.asList(scope));

        SqlAuthenticationToken sqlFedAuthToken = null;
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerSecurityUtility.java`
#### Snippet
```java
        String scope = resource.endsWith(SQLServerMSAL4JUtils.SLASH_DEFAULT) ? resource : resource
                + SQLServerMSAL4JUtils.SLASH_DEFAULT;
        tokenRequestContext.setScopes(Arrays.asList(scope));

        SqlAuthenticationToken sqlFedAuthToken = null;
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerParser.java`
#### Snippet
```java
    static void getCTESegment(SQLServerTokenIterator iter, StringBuilder sb) throws SQLServerException {
        try {
            sb.append(getTableTargetChunk(iter, null, Arrays.asList(SQLServerLexer.AS)));
            iter.next();
            Token t = iter.next();
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java

            for (Map.Entry<String, List<String>> entry : columnEncryptionTrustedMasterKeyPaths.entrySet()) {
                masterKeyPathCopy.put(entry.getKey(), entry.getValue());
            }

```

## RuleId[id=BigDecimalMethodWithoutRoundingCalled]
### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.setScale()' called without a rounding mode argument
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
            return "";

        return java.math.BigDecimal.valueOf(subSecondNanos % Nanos.PER_SECOND, 9).setScale(scale).toPlainString()
                .substring(1);
    }
```

### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.setScale()' called without a rounding mode argument
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
        // Convert to unscaled integer value, then compare with maxRPCDecimalValue.
        // NOTE: Handle negative scale as a special case for JDK 1.5 and later VMs.
        BigInteger bi = (bigDecimalValue.scale() < 0) ? bigDecimalValue.setScale(0).unscaledValue()
                                                      : bigDecimalValue.unscaledValue();
        if (bigDecimalValue.signum() < 0)
```

### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.setScale()' called without a rounding mode argument
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
            // NOTE: Handle negative scale as a special case for JDK 1.5 and later VMs.
            if (bigDecimalVal.scale() < 0)
                bigDecimalVal = bigDecimalVal.setScale(0);

            BigInteger bi = bigDecimalVal.unscaledValue();
```

### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.setScale()' called without a rounding mode argument
in `src/main/java/com/microsoft/sqlserver/jdbc/DDC.java`
#### Snippet
```java
        boolean isNeg = value.signum() < 0;

        value = value.setScale(scale);

        BigInteger bigInt = value.unscaledValue();
```

### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.setScale()' called without a rounding mode argument
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerBulkCopy.java`
#### Snippet
```java
                    } else if (srcDataScale < destScale)
                        // update the scale of source data based on the metadata for scale sent early
                        bigDataValue = bigDataValue.setScale(destScale);

                    byteValue = DDC.convertBigDecimalToBytes(bigDataValue, bigDataValue.scale());
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'credential' to 'GSSCredential'
in `src/main/java/com/microsoft/sqlserver/jdbc/KerbAuthentication.java`
#### Snippet
```java
        // warning in Java 6.
        Object credential = Subject.doAs(subject, action);
        return (GSSCredential) credential;
    }

```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'st' to 'ISQLServerStatement'
in `src/main/java/com/microsoft/sqlserver/jdbc/SQLServerConnection.java`
#### Snippet
```java
        Statement st = new SQLServerStatement(this, nType, nConcur, stmtColEncSetting);
        if (requestStarted) {
            addOpenStatement((ISQLServerStatement) st);
        }
        loggerExternal.exiting(loggingClassName, CREATE_STATEMENT, st);
```

