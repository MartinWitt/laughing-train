# qpid-protonj2 
 
# Bad smells
I found 1717 bad smells with 465 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 311 | true |
| ReturnNull | 258 | false |
| AssignmentToMethodParameter | 124 | false |
| LongLiteralsEndingWithLowercaseL | 95 | false |
| NestedAssignment | 58 | false |
| BoundedWildcard | 56 | false |
| CodeBlock2Expr | 49 | true |
| ThrowableNotThrown | 43 | false |
| RedundantFieldInitialization | 39 | false |
| UnusedAssignment | 36 | false |
| ConstantValue | 34 | false |
| UtilityClassWithoutPrivateConstructor | 33 | true |
| NonProtectedConstructorInAbstractClass | 32 | true |
| DuplicateBranchesInSwitch | 30 | false |
| SynchronizeOnThis | 27 | false |
| Convert2MethodRef | 27 | false |
| SystemOutErr | 26 | false |
| UnnecessaryFullyQualifiedName | 24 | false |
| MissortedModifiers | 23 | false |
| UnnecessaryUnboxing | 22 | false |
| PointlessBitwiseExpression | 22 | false |
| CastConflictsWithInstanceof | 21 | false |
| UnnecessarySuperQualifier | 18 | false |
| RefusedBequest | 16 | false |
| ZeroLengthArrayInitialization | 16 | false |
| DataFlowIssue | 15 | false |
| CatchMayIgnoreException | 15 | false |
| PublicFieldAccessedInSynchronizedContext | 15 | false |
| SizeReplaceableByIsEmpty | 13 | true |
| RedundantMethodOverride | 13 | false |
| UnnecessaryBoxing | 12 | false |
| CopyConstructorMissesField | 11 | false |
| RedundantClassCall | 9 | false |
| IgnoreResultOfCall | 9 | false |
| UnnecessaryLocalVariable | 9 | true |
| AbstractClassNeverImplemented | 8 | false |
| EmptyMethod | 8 | false |
| FieldMayBeStatic | 8 | false |
| AssignmentToForLoopParameter | 7 | false |
| Convert2Lambda | 7 | false |
| FinalStaticMethod | 6 | false |
| CharsetObjectCanBeUsed | 6 | false |
| UnnecessarySemicolon | 5 | false |
| NonSerializableFieldInSerializableClass | 5 | false |
| InnerClassMayBeStatic | 5 | true |
| Java9CollectionFactory | 5 | false |
| CStyleArrayDeclaration | 4 | false |
| RedundantArrayCreation | 4 | true |
| FinalPrivateMethod | 4 | false |
| RedundantImplements | 4 | false |
| RedundantStringFormatCall | 4 | false |
| ProtectedMemberInFinalClass | 4 | true |
| RedundantSuppression | 4 | false |
| ThrowablePrintStackTrace | 4 | false |
| ReplaceNullCheck | 4 | false |
| CastCanBeRemovedNarrowingVariableType | 4 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 3 | false |
| ConditionCoveredByFurtherCondition | 3 | false |
| RedundantFileCreation | 3 | false |
| PointlessBooleanExpression | 3 | true |
| ObjectNotify | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| ManualMinMaxCalculation | 2 | false |
| NonFinalFieldOfException | 2 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 2 | false |
| AbstractMethodCallInConstructor | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| UnnecessaryContinue | 2 | false |
| UseBulkOperation | 2 | false |
| LoopStatementsThatDontLoop | 1 | false |
| WhileCanBeForeach | 1 | false |
| CommentedOutCode | 1 | false |
| NegativeIntConstantInLongContext | 1 | false |
| FunctionalExpressionCanBeFolded | 1 | false |
| MalformedFormatString | 1 | false |
| ThrowFromFinallyBlock | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| EqualsAndHashcode | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| RedundantLengthCheck | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| ObviousNullCheck | 1 | false |
## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/Codec.java`
#### Snippet
```java
public interface Codec {

    public static final class Factory {

        public static Codec create() {
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/Codec.java`
#### Snippet
```java
public interface Codec {

    public static final class Factory {

        public static Codec create() {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DECIMAL32                = (byte) 0x74;

    public static final byte DECIMAL64                = (byte) 0x84;

    public static final byte DECIMAL128               = (byte) 0x94;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DECIMAL32                = (byte) 0x74;

    public static final byte DECIMAL64                = (byte) 0x84;

    public static final byte DECIMAL128               = (byte) 0x94;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DECIMAL32                = (byte) 0x74;

    public static final byte DECIMAL64                = (byte) 0x84;

    public static final byte DECIMAL128               = (byte) 0x94;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SMALLINT                 = (byte) 0x54;

    public static final byte LONG                     = (byte) 0x81;
    public static final byte SMALLLONG                = (byte) 0x55;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SMALLINT                 = (byte) 0x54;

    public static final byte LONG                     = (byte) 0x81;
    public static final byte SMALLLONG                = (byte) 0x55;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SMALLINT                 = (byte) 0x54;

    public static final byte LONG                     = (byte) 0x81;
    public static final byte SMALLLONG                = (byte) 0x55;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte MAP8                     = (byte) 0xc1;
    public static final byte MAP32                    = (byte) 0xd1;

    public static final byte ARRAY8                   = (byte) 0xe0;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte MAP8                     = (byte) 0xc1;
    public static final byte MAP32                    = (byte) 0xd1;

    public static final byte ARRAY8                   = (byte) 0xe0;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte MAP8                     = (byte) 0xc1;
    public static final byte MAP32                    = (byte) 0xd1;

    public static final byte ARRAY8                   = (byte) 0xe0;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte ARRAY8                   = (byte) 0xe0;
    public static final byte ARRAY32                  = (byte) 0xf0;

    static String toString(byte encoding) {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte ARRAY8                   = (byte) 0xe0;
    public static final byte ARRAY32                  = (byte) 0xf0;

    static String toString(byte encoding) {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte ARRAY8                   = (byte) 0xe0;
    public static final byte ARRAY32                  = (byte) 0xf0;

    static String toString(byte encoding) {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte LONG                     = (byte) 0x81;
    public static final byte SMALLLONG                = (byte) 0x55;

    public static final byte FLOAT                    = (byte) 0x72;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte LONG                     = (byte) 0x81;
    public static final byte SMALLLONG                = (byte) 0x55;

    public static final byte FLOAT                    = (byte) 0x72;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte LONG                     = (byte) 0x81;
    public static final byte SMALLLONG                = (byte) 0x55;

    public static final byte FLOAT                    = (byte) 0x72;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte LIST32                   = (byte) 0xd0;

    public static final byte MAP8                     = (byte) 0xc1;
    public static final byte MAP32                    = (byte) 0xd1;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte LIST32                   = (byte) 0xd0;

    public static final byte MAP8                     = (byte) 0xc1;
    public static final byte MAP32                    = (byte) 0xd1;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte LIST32                   = (byte) 0xd0;

    public static final byte MAP8                     = (byte) 0xc1;
    public static final byte MAP32                    = (byte) 0xd1;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DECIMAL128               = (byte) 0x94;

    public static final byte CHAR                     = (byte) 0x73;

    public static final byte TIMESTAMP                = (byte) 0x83;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DECIMAL128               = (byte) 0x94;

    public static final byte CHAR                     = (byte) 0x73;

    public static final byte TIMESTAMP                = (byte) 0x83;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DECIMAL128               = (byte) 0x94;

    public static final byte CHAR                     = (byte) 0x73;

    public static final byte TIMESTAMP                = (byte) 0x83;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SYM32                    = (byte) 0xb3;

    public static final byte LIST0                    = (byte) 0x45;
    public static final byte LIST8                    = (byte) 0xc0;
    public static final byte LIST32                   = (byte) 0xd0;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SYM32                    = (byte) 0xb3;

    public static final byte LIST0                    = (byte) 0x45;
    public static final byte LIST8                    = (byte) 0xc0;
    public static final byte LIST32                   = (byte) 0xd0;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SYM32                    = (byte) 0xb3;

    public static final byte LIST0                    = (byte) 0x45;
    public static final byte LIST8                    = (byte) 0xc0;
    public static final byte LIST32                   = (byte) 0xd0;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte LIST0                    = (byte) 0x45;
    public static final byte LIST8                    = (byte) 0xc0;
    public static final byte LIST32                   = (byte) 0xd0;

    public static final byte MAP8                     = (byte) 0xc1;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte LIST0                    = (byte) 0x45;
    public static final byte LIST8                    = (byte) 0xc0;
    public static final byte LIST32                   = (byte) 0xd0;

    public static final byte MAP8                     = (byte) 0xc1;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte LIST0                    = (byte) 0x45;
    public static final byte LIST8                    = (byte) 0xc0;
    public static final byte LIST32                   = (byte) 0xd0;

    public static final byte MAP8                     = (byte) 0xc1;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte VBIN8                    = (byte) 0xa0;
    public static final byte VBIN32                   = (byte) 0xb0;

    public static final byte STR8                     = (byte) 0xa1;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte VBIN8                    = (byte) 0xa0;
    public static final byte VBIN32                   = (byte) 0xb0;

    public static final byte STR8                     = (byte) 0xa1;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte VBIN8                    = (byte) 0xa0;
    public static final byte VBIN32                   = (byte) 0xb0;

    public static final byte STR8                     = (byte) 0xa1;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DOUBLE                   = (byte) 0x82;

    public static final byte DECIMAL32                = (byte) 0x74;

    public static final byte DECIMAL64                = (byte) 0x84;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DOUBLE                   = (byte) 0x82;

    public static final byte DECIMAL32                = (byte) 0x74;

    public static final byte DECIMAL64                = (byte) 0x84;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DOUBLE                   = (byte) 0x82;

    public static final byte DECIMAL32                = (byte) 0x74;

    public static final byte DECIMAL64                = (byte) 0x84;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte STR8                     = (byte) 0xa1;
    public static final byte STR32                    = (byte) 0xb1;

    public static final byte SYM8                     = (byte) 0xa3;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte STR8                     = (byte) 0xa1;
    public static final byte STR32                    = (byte) 0xb1;

    public static final byte SYM8                     = (byte) 0xa3;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte STR8                     = (byte) 0xa1;
    public static final byte STR32                    = (byte) 0xb1;

    public static final byte SYM8                     = (byte) 0xa3;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte BYTE                     = (byte) 0x51;

    public static final byte SHORT                    = (byte) 0x61;

    public static final byte INT                      = (byte) 0x71;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte BYTE                     = (byte) 0x51;

    public static final byte SHORT                    = (byte) 0x61;

    public static final byte INT                      = (byte) 0x71;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte BYTE                     = (byte) 0x51;

    public static final byte SHORT                    = (byte) 0x61;

    public static final byte INT                      = (byte) 0x71;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte FLOAT                    = (byte) 0x72;

    public static final byte DOUBLE                   = (byte) 0x82;

    public static final byte DECIMAL32                = (byte) 0x74;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte FLOAT                    = (byte) 0x72;

    public static final byte DOUBLE                   = (byte) 0x82;

    public static final byte DECIMAL32                = (byte) 0x74;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte FLOAT                    = (byte) 0x72;

    public static final byte DOUBLE                   = (byte) 0x82;

    public static final byte DECIMAL32                = (byte) 0x74;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UBYTE                    = (byte) 0x50;

    public static final byte USHORT                   = (byte) 0x60;

    public static final byte UINT                     = (byte) 0x70;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UBYTE                    = (byte) 0x50;

    public static final byte USHORT                   = (byte) 0x60;

    public static final byte UINT                     = (byte) 0x70;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UBYTE                    = (byte) 0x50;

    public static final byte USHORT                   = (byte) 0x60;

    public static final byte UINT                     = (byte) 0x70;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DESCRIBED_TYPE_INDICATOR = (byte) 0x00;

    public static final byte NULL                     = (byte) 0x40;

    public static final byte BOOLEAN                  = (byte) 0x56;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DESCRIBED_TYPE_INDICATOR = (byte) 0x00;

    public static final byte NULL                     = (byte) 0x40;

    public static final byte BOOLEAN                  = (byte) 0x56;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DESCRIBED_TYPE_INDICATOR = (byte) 0x00;

    public static final byte NULL                     = (byte) 0x40;

    public static final byte BOOLEAN                  = (byte) 0x56;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DECIMAL64                = (byte) 0x84;

    public static final byte DECIMAL128               = (byte) 0x94;

    public static final byte CHAR                     = (byte) 0x73;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DECIMAL64                = (byte) 0x84;

    public static final byte DECIMAL128               = (byte) 0x94;

    public static final byte CHAR                     = (byte) 0x73;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DECIMAL64                = (byte) 0x84;

    public static final byte DECIMAL128               = (byte) 0x94;

    public static final byte CHAR                     = (byte) 0x73;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte CHAR                     = (byte) 0x73;

    public static final byte TIMESTAMP                = (byte) 0x83;

    public static final byte UUID                     = (byte) 0x98;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte CHAR                     = (byte) 0x73;

    public static final byte TIMESTAMP                = (byte) 0x83;

    public static final byte UUID                     = (byte) 0x98;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte CHAR                     = (byte) 0x73;

    public static final byte TIMESTAMP                = (byte) 0x83;

    public static final byte UUID                     = (byte) 0x98;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UINT0                    = (byte) 0x43;

    public static final byte ULONG                    = (byte) 0x80;
    public static final byte SMALLULONG               = (byte) 0x53;
    public static final byte ULONG0                   = (byte) 0x44;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UINT0                    = (byte) 0x43;

    public static final byte ULONG                    = (byte) 0x80;
    public static final byte SMALLULONG               = (byte) 0x53;
    public static final byte ULONG0                   = (byte) 0x44;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UINT0                    = (byte) 0x43;

    public static final byte ULONG                    = (byte) 0x80;
    public static final byte SMALLULONG               = (byte) 0x53;
    public static final byte ULONG0                   = (byte) 0x44;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte USHORT                   = (byte) 0x60;

    public static final byte UINT                     = (byte) 0x70;
    public static final byte SMALLUINT                = (byte) 0x52;
    public static final byte UINT0                    = (byte) 0x43;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte USHORT                   = (byte) 0x60;

    public static final byte UINT                     = (byte) 0x70;
    public static final byte SMALLUINT                = (byte) 0x52;
    public static final byte UINT0                    = (byte) 0x43;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte USHORT                   = (byte) 0x60;

    public static final byte UINT                     = (byte) 0x70;
    public static final byte SMALLUINT                = (byte) 0x52;
    public static final byte UINT0                    = (byte) 0x43;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SMALLLONG                = (byte) 0x55;

    public static final byte FLOAT                    = (byte) 0x72;

    public static final byte DOUBLE                   = (byte) 0x82;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SMALLLONG                = (byte) 0x55;

    public static final byte FLOAT                    = (byte) 0x72;

    public static final byte DOUBLE                   = (byte) 0x82;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SMALLLONG                = (byte) 0x55;

    public static final byte FLOAT                    = (byte) 0x72;

    public static final byte DOUBLE                   = (byte) 0x82;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UUID                     = (byte) 0x98;

    public static final byte VBIN8                    = (byte) 0xa0;
    public static final byte VBIN32                   = (byte) 0xb0;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UUID                     = (byte) 0x98;

    public static final byte VBIN8                    = (byte) 0xa0;
    public static final byte VBIN32                   = (byte) 0xb0;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UUID                     = (byte) 0x98;

    public static final byte VBIN8                    = (byte) 0xa0;
    public static final byte VBIN32                   = (byte) 0xb0;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte BOOLEAN                  = (byte) 0x56;
    public static final byte BOOLEAN_TRUE             = (byte) 0x41;
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte BOOLEAN                  = (byte) 0x56;
    public static final byte BOOLEAN_TRUE             = (byte) 0x41;
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte BOOLEAN                  = (byte) 0x56;
    public static final byte BOOLEAN_TRUE             = (byte) 0x41;
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte LIST0                    = (byte) 0x45;
    public static final byte LIST8                    = (byte) 0xc0;
    public static final byte LIST32                   = (byte) 0xd0;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte LIST0                    = (byte) 0x45;
    public static final byte LIST8                    = (byte) 0xc0;
    public static final byte LIST32                   = (byte) 0xd0;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte LIST0                    = (byte) 0x45;
    public static final byte LIST8                    = (byte) 0xc0;
    public static final byte LIST32                   = (byte) 0xd0;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte ULONG                    = (byte) 0x80;
    public static final byte SMALLULONG               = (byte) 0x53;
    public static final byte ULONG0                   = (byte) 0x44;

    public static final byte BYTE                     = (byte) 0x51;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte ULONG                    = (byte) 0x80;
    public static final byte SMALLULONG               = (byte) 0x53;
    public static final byte ULONG0                   = (byte) 0x44;

    public static final byte BYTE                     = (byte) 0x51;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte ULONG                    = (byte) 0x80;
    public static final byte SMALLULONG               = (byte) 0x53;
    public static final byte ULONG0                   = (byte) 0x44;

    public static final byte BYTE                     = (byte) 0x51;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte ULONG0                   = (byte) 0x44;

    public static final byte BYTE                     = (byte) 0x51;

    public static final byte SHORT                    = (byte) 0x61;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte ULONG0                   = (byte) 0x44;

    public static final byte BYTE                     = (byte) 0x51;

    public static final byte SHORT                    = (byte) 0x61;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte ULONG0                   = (byte) 0x44;

    public static final byte BYTE                     = (byte) 0x51;

    public static final byte SHORT                    = (byte) 0x61;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte STR32                    = (byte) 0xb1;

    public static final byte SYM8                     = (byte) 0xa3;
    public static final byte SYM32                    = (byte) 0xb3;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte STR32                    = (byte) 0xb1;

    public static final byte SYM8                     = (byte) 0xa3;
    public static final byte SYM32                    = (byte) 0xb3;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte STR32                    = (byte) 0xb1;

    public static final byte SYM8                     = (byte) 0xa3;
    public static final byte SYM32                    = (byte) 0xb3;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte SYM8                     = (byte) 0xa3;
    public static final byte SYM32                    = (byte) 0xb3;

    public static final byte LIST0                    = (byte) 0x45;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte SYM8                     = (byte) 0xa3;
    public static final byte SYM32                    = (byte) 0xb3;

    public static final byte LIST0                    = (byte) 0x45;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte SYM8                     = (byte) 0xa3;
    public static final byte SYM32                    = (byte) 0xb3;

    public static final byte LIST0                    = (byte) 0x45;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte BOOLEAN                  = (byte) 0x56;
    public static final byte BOOLEAN_TRUE             = (byte) 0x41;
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;

    public static final byte UBYTE                    = (byte) 0x50;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte BOOLEAN                  = (byte) 0x56;
    public static final byte BOOLEAN_TRUE             = (byte) 0x41;
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;

    public static final byte UBYTE                    = (byte) 0x50;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte BOOLEAN                  = (byte) 0x56;
    public static final byte BOOLEAN_TRUE             = (byte) 0x41;
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;

    public static final byte UBYTE                    = (byte) 0x50;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte NULL                     = (byte) 0x40;

    public static final byte BOOLEAN                  = (byte) 0x56;
    public static final byte BOOLEAN_TRUE             = (byte) 0x41;
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte NULL                     = (byte) 0x40;

    public static final byte BOOLEAN                  = (byte) 0x56;
    public static final byte BOOLEAN_TRUE             = (byte) 0x41;
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte NULL                     = (byte) 0x40;

    public static final byte BOOLEAN                  = (byte) 0x56;
    public static final byte BOOLEAN_TRUE             = (byte) 0x41;
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
public interface EncodingCodes {

    public static final byte DESCRIBED_TYPE_INDICATOR = (byte) 0x00;

    public static final byte NULL                     = (byte) 0x40;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
public interface EncodingCodes {

    public static final byte DESCRIBED_TYPE_INDICATOR = (byte) 0x00;

    public static final byte NULL                     = (byte) 0x40;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
public interface EncodingCodes {

    public static final byte DESCRIBED_TYPE_INDICATOR = (byte) 0x00;

    public static final byte NULL                     = (byte) 0x40;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SHORT                    = (byte) 0x61;

    public static final byte INT                      = (byte) 0x71;
    public static final byte SMALLINT                 = (byte) 0x54;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SHORT                    = (byte) 0x61;

    public static final byte INT                      = (byte) 0x71;
    public static final byte SMALLINT                 = (byte) 0x54;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SHORT                    = (byte) 0x61;

    public static final byte INT                      = (byte) 0x71;
    public static final byte SMALLINT                 = (byte) 0x54;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UINT                     = (byte) 0x70;
    public static final byte SMALLUINT                = (byte) 0x52;
    public static final byte UINT0                    = (byte) 0x43;

    public static final byte ULONG                    = (byte) 0x80;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UINT                     = (byte) 0x70;
    public static final byte SMALLUINT                = (byte) 0x52;
    public static final byte UINT0                    = (byte) 0x43;

    public static final byte ULONG                    = (byte) 0x80;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UINT                     = (byte) 0x70;
    public static final byte SMALLUINT                = (byte) 0x52;
    public static final byte UINT0                    = (byte) 0x43;

    public static final byte ULONG                    = (byte) 0x80;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte ULONG                    = (byte) 0x80;
    public static final byte SMALLULONG               = (byte) 0x53;
    public static final byte ULONG0                   = (byte) 0x44;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte ULONG                    = (byte) 0x80;
    public static final byte SMALLULONG               = (byte) 0x53;
    public static final byte ULONG0                   = (byte) 0x44;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte ULONG                    = (byte) 0x80;
    public static final byte SMALLULONG               = (byte) 0x53;
    public static final byte ULONG0                   = (byte) 0x44;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte UINT                     = (byte) 0x70;
    public static final byte SMALLUINT                = (byte) 0x52;
    public static final byte UINT0                    = (byte) 0x43;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte UINT                     = (byte) 0x70;
    public static final byte SMALLUINT                = (byte) 0x52;
    public static final byte UINT0                    = (byte) 0x43;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte UINT                     = (byte) 0x70;
    public static final byte SMALLUINT                = (byte) 0x52;
    public static final byte UINT0                    = (byte) 0x43;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;

    public static final byte UBYTE                    = (byte) 0x50;

    public static final byte USHORT                   = (byte) 0x60;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;

    public static final byte UBYTE                    = (byte) 0x50;

    public static final byte USHORT                   = (byte) 0x60;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;

    public static final byte UBYTE                    = (byte) 0x50;

    public static final byte USHORT                   = (byte) 0x60;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte VBIN32                   = (byte) 0xb0;

    public static final byte STR8                     = (byte) 0xa1;
    public static final byte STR32                    = (byte) 0xb1;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte VBIN32                   = (byte) 0xb0;

    public static final byte STR8                     = (byte) 0xa1;
    public static final byte STR32                    = (byte) 0xb1;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte VBIN32                   = (byte) 0xb0;

    public static final byte STR8                     = (byte) 0xa1;
    public static final byte STR32                    = (byte) 0xb1;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte MAP32                    = (byte) 0xd1;

    public static final byte ARRAY8                   = (byte) 0xe0;
    public static final byte ARRAY32                  = (byte) 0xf0;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte MAP32                    = (byte) 0xd1;

    public static final byte ARRAY8                   = (byte) 0xe0;
    public static final byte ARRAY32                  = (byte) 0xf0;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte MAP32                    = (byte) 0xd1;

    public static final byte ARRAY8                   = (byte) 0xe0;
    public static final byte ARRAY32                  = (byte) 0xf0;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte TIMESTAMP                = (byte) 0x83;

    public static final byte UUID                     = (byte) 0x98;

    public static final byte VBIN8                    = (byte) 0xa0;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte TIMESTAMP                = (byte) 0x83;

    public static final byte UUID                     = (byte) 0x98;

    public static final byte VBIN8                    = (byte) 0xa0;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte TIMESTAMP                = (byte) 0x83;

    public static final byte UUID                     = (byte) 0x98;

    public static final byte VBIN8                    = (byte) 0xa0;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte INT                      = (byte) 0x71;
    public static final byte SMALLINT                 = (byte) 0x54;

    public static final byte LONG                     = (byte) 0x81;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte INT                      = (byte) 0x71;
    public static final byte SMALLINT                 = (byte) 0x54;

    public static final byte LONG                     = (byte) 0x81;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte INT                      = (byte) 0x71;
    public static final byte SMALLINT                 = (byte) 0x54;

    public static final byte LONG                     = (byte) 0x81;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/transport/ReceiverSettleMode.java`
#### Snippet
```java
    private final UnsignedByte value;

    private ReceiverSettleMode(int value) {
        this.value = UnsignedByte.valueOf((byte)value);
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/transport/SenderSettleMode.java`
#### Snippet
```java
    private final UnsignedByte value;

    private SenderSettleMode(int value) {
        this.value = UnsignedByte.valueOf((byte)value);
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/transport/Role.java`
#### Snippet
```java
    private final boolean receiver;

    private Role(boolean receiver) {
        this.receiver = receiver;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/primitives/DescribedType.java`
#### Snippet
```java
     * @return the descriptor that identifies this instance.
     */
    public Object getDescriptor();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/primitives/DescribedType.java`
#### Snippet
```java
     * @return the value carried inside this described instance.
     */
    public Object getDescribed();

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientTransactionContext.java`
#### Snippet
```java
interface ClientTransactionContext {

    public interface Sendable {

        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/DeliveryState.java`
#### Snippet
```java
public interface DeliveryState {

    public enum Type {
        ACCEPTED,
        REJECTED,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte TIMESTAMP                = (byte) 0x83;

    public static final byte UUID                     = (byte) 0x98;

    public static final byte VBIN8                    = (byte) 0xa0;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte TIMESTAMP                = (byte) 0x83;

    public static final byte UUID                     = (byte) 0x98;

    public static final byte VBIN8                    = (byte) 0xa0;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte TIMESTAMP                = (byte) 0x83;

    public static final byte UUID                     = (byte) 0x98;

    public static final byte VBIN8                    = (byte) 0xa0;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DECIMAL32                = (byte) 0x74;

    public static final byte DECIMAL64                = (byte) 0x84;

    public static final byte DECIMAL128               = (byte) 0x94;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DECIMAL32                = (byte) 0x74;

    public static final byte DECIMAL64                = (byte) 0x84;

    public static final byte DECIMAL128               = (byte) 0x94;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DECIMAL32                = (byte) 0x74;

    public static final byte DECIMAL64                = (byte) 0x84;

    public static final byte DECIMAL128               = (byte) 0x94;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte ULONG0                   = (byte) 0x44;

    public static final byte BYTE                     = (byte) 0x51;

    public static final byte SHORT                    = (byte) 0x61;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte ULONG0                   = (byte) 0x44;

    public static final byte BYTE                     = (byte) 0x51;

    public static final byte SHORT                    = (byte) 0x61;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte ULONG0                   = (byte) 0x44;

    public static final byte BYTE                     = (byte) 0x51;

    public static final byte SHORT                    = (byte) 0x61;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte NULL                     = (byte) 0x40;

    public static final byte BOOLEAN                  = (byte) 0x56;
    public static final byte BOOLEAN_TRUE             = (byte) 0x41;
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte NULL                     = (byte) 0x40;

    public static final byte BOOLEAN                  = (byte) 0x56;
    public static final byte BOOLEAN_TRUE             = (byte) 0x41;
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte NULL                     = (byte) 0x40;

    public static final byte BOOLEAN                  = (byte) 0x56;
    public static final byte BOOLEAN_TRUE             = (byte) 0x41;
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte FLOAT                    = (byte) 0x72;

    public static final byte DOUBLE                   = (byte) 0x82;

    public static final byte DECIMAL32                = (byte) 0x74;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte FLOAT                    = (byte) 0x72;

    public static final byte DOUBLE                   = (byte) 0x82;

    public static final byte DECIMAL32                = (byte) 0x74;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte FLOAT                    = (byte) 0x72;

    public static final byte DOUBLE                   = (byte) 0x82;

    public static final byte DECIMAL32                = (byte) 0x74;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SMALLINT                 = (byte) 0x54;

    public static final byte LONG                     = (byte) 0x81;
    public static final byte SMALLLONG                = (byte) 0x55;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SMALLINT                 = (byte) 0x54;

    public static final byte LONG                     = (byte) 0x81;
    public static final byte SMALLLONG                = (byte) 0x55;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SMALLINT                 = (byte) 0x54;

    public static final byte LONG                     = (byte) 0x81;
    public static final byte SMALLLONG                = (byte) 0x55;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte ARRAY8                   = (byte) 0xe0;
    public static final byte ARRAY32                  = (byte) 0xf0;

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte ARRAY8                   = (byte) 0xe0;
    public static final byte ARRAY32                  = (byte) 0xf0;

    /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte ARRAY8                   = (byte) 0xe0;
    public static final byte ARRAY32                  = (byte) 0xf0;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;

    public static final byte UBYTE                    = (byte) 0x50;

    public static final byte USHORT                   = (byte) 0x60;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;

    public static final byte UBYTE                    = (byte) 0x50;

    public static final byte USHORT                   = (byte) 0x60;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;

    public static final byte UBYTE                    = (byte) 0x50;

    public static final byte USHORT                   = (byte) 0x60;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SMALLLONG                = (byte) 0x55;

    public static final byte FLOAT                    = (byte) 0x72;

    public static final byte DOUBLE                   = (byte) 0x82;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SMALLLONG                = (byte) 0x55;

    public static final byte FLOAT                    = (byte) 0x72;

    public static final byte DOUBLE                   = (byte) 0x82;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SMALLLONG                = (byte) 0x55;

    public static final byte FLOAT                    = (byte) 0x72;

    public static final byte DOUBLE                   = (byte) 0x82;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte SYM8                     = (byte) 0xa3;
    public static final byte SYM32                    = (byte) 0xb3;

    public static final byte LIST0                    = (byte) 0x45;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte SYM8                     = (byte) 0xa3;
    public static final byte SYM32                    = (byte) 0xb3;

    public static final byte LIST0                    = (byte) 0x45;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte SYM8                     = (byte) 0xa3;
    public static final byte SYM32                    = (byte) 0xb3;

    public static final byte LIST0                    = (byte) 0x45;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DOUBLE                   = (byte) 0x82;

    public static final byte DECIMAL32                = (byte) 0x74;

    public static final byte DECIMAL64                = (byte) 0x84;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DOUBLE                   = (byte) 0x82;

    public static final byte DECIMAL32                = (byte) 0x74;

    public static final byte DECIMAL64                = (byte) 0x84;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DOUBLE                   = (byte) 0x82;

    public static final byte DECIMAL32                = (byte) 0x74;

    public static final byte DECIMAL64                = (byte) 0x84;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte LONG                     = (byte) 0x81;
    public static final byte SMALLLONG                = (byte) 0x55;

    public static final byte FLOAT                    = (byte) 0x72;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte LONG                     = (byte) 0x81;
    public static final byte SMALLLONG                = (byte) 0x55;

    public static final byte FLOAT                    = (byte) 0x72;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte LONG                     = (byte) 0x81;
    public static final byte SMALLLONG                = (byte) 0x55;

    public static final byte FLOAT                    = (byte) 0x72;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte INT                      = (byte) 0x71;
    public static final byte SMALLINT                 = (byte) 0x54;

    public static final byte LONG                     = (byte) 0x81;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte INT                      = (byte) 0x71;
    public static final byte SMALLINT                 = (byte) 0x54;

    public static final byte LONG                     = (byte) 0x81;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte INT                      = (byte) 0x71;
    public static final byte SMALLINT                 = (byte) 0x54;

    public static final byte LONG                     = (byte) 0x81;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UINT0                    = (byte) 0x43;

    public static final byte ULONG                    = (byte) 0x80;
    public static final byte SMALLULONG               = (byte) 0x53;
    public static final byte ULONG0                   = (byte) 0x44;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UINT0                    = (byte) 0x43;

    public static final byte ULONG                    = (byte) 0x80;
    public static final byte SMALLULONG               = (byte) 0x53;
    public static final byte ULONG0                   = (byte) 0x44;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UINT0                    = (byte) 0x43;

    public static final byte ULONG                    = (byte) 0x80;
    public static final byte SMALLULONG               = (byte) 0x53;
    public static final byte ULONG0                   = (byte) 0x44;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DECIMAL64                = (byte) 0x84;

    public static final byte DECIMAL128               = (byte) 0x94;

    public static final byte CHAR                     = (byte) 0x73;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DECIMAL64                = (byte) 0x84;

    public static final byte DECIMAL128               = (byte) 0x94;

    public static final byte CHAR                     = (byte) 0x73;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DECIMAL64                = (byte) 0x84;

    public static final byte DECIMAL128               = (byte) 0x94;

    public static final byte CHAR                     = (byte) 0x73;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte VBIN32                   = (byte) 0xb0;

    public static final byte STR8                     = (byte) 0xa1;
    public static final byte STR32                    = (byte) 0xb1;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte VBIN32                   = (byte) 0xb0;

    public static final byte STR8                     = (byte) 0xa1;
    public static final byte STR32                    = (byte) 0xb1;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte VBIN32                   = (byte) 0xb0;

    public static final byte STR8                     = (byte) 0xa1;
    public static final byte STR32                    = (byte) 0xb1;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte ULONG                    = (byte) 0x80;
    public static final byte SMALLULONG               = (byte) 0x53;
    public static final byte ULONG0                   = (byte) 0x44;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte ULONG                    = (byte) 0x80;
    public static final byte SMALLULONG               = (byte) 0x53;
    public static final byte ULONG0                   = (byte) 0x44;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte ULONG                    = (byte) 0x80;
    public static final byte SMALLULONG               = (byte) 0x53;
    public static final byte ULONG0                   = (byte) 0x44;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte USHORT                   = (byte) 0x60;

    public static final byte UINT                     = (byte) 0x70;
    public static final byte SMALLUINT                = (byte) 0x52;
    public static final byte UINT0                    = (byte) 0x43;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte USHORT                   = (byte) 0x60;

    public static final byte UINT                     = (byte) 0x70;
    public static final byte SMALLUINT                = (byte) 0x52;
    public static final byte UINT0                    = (byte) 0x43;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte USHORT                   = (byte) 0x60;

    public static final byte UINT                     = (byte) 0x70;
    public static final byte SMALLUINT                = (byte) 0x52;
    public static final byte UINT0                    = (byte) 0x43;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte LIST32                   = (byte) 0xd0;

    public static final byte MAP8                     = (byte) 0xc1;
    public static final byte MAP32                    = (byte) 0xd1;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte LIST32                   = (byte) 0xd0;

    public static final byte MAP8                     = (byte) 0xc1;
    public static final byte MAP32                    = (byte) 0xd1;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte LIST32                   = (byte) 0xd0;

    public static final byte MAP8                     = (byte) 0xc1;
    public static final byte MAP32                    = (byte) 0xd1;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte STR32                    = (byte) 0xb1;

    public static final byte SYM8                     = (byte) 0xa3;
    public static final byte SYM32                    = (byte) 0xb3;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte STR32                    = (byte) 0xb1;

    public static final byte SYM8                     = (byte) 0xa3;
    public static final byte SYM32                    = (byte) 0xb3;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte STR32                    = (byte) 0xb1;

    public static final byte SYM8                     = (byte) 0xa3;
    public static final byte SYM32                    = (byte) 0xb3;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte BOOLEAN                  = (byte) 0x56;
    public static final byte BOOLEAN_TRUE             = (byte) 0x41;
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;

    public static final byte UBYTE                    = (byte) 0x50;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte BOOLEAN                  = (byte) 0x56;
    public static final byte BOOLEAN_TRUE             = (byte) 0x41;
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;

    public static final byte UBYTE                    = (byte) 0x50;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte BOOLEAN                  = (byte) 0x56;
    public static final byte BOOLEAN_TRUE             = (byte) 0x41;
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;

    public static final byte UBYTE                    = (byte) 0x50;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte VBIN8                    = (byte) 0xa0;
    public static final byte VBIN32                   = (byte) 0xb0;

    public static final byte STR8                     = (byte) 0xa1;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte VBIN8                    = (byte) 0xa0;
    public static final byte VBIN32                   = (byte) 0xb0;

    public static final byte STR8                     = (byte) 0xa1;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte VBIN8                    = (byte) 0xa0;
    public static final byte VBIN32                   = (byte) 0xb0;

    public static final byte STR8                     = (byte) 0xa1;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte LIST0                    = (byte) 0x45;
    public static final byte LIST8                    = (byte) 0xc0;
    public static final byte LIST32                   = (byte) 0xd0;

    public static final byte MAP8                     = (byte) 0xc1;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte LIST0                    = (byte) 0x45;
    public static final byte LIST8                    = (byte) 0xc0;
    public static final byte LIST32                   = (byte) 0xd0;

    public static final byte MAP8                     = (byte) 0xc1;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte LIST0                    = (byte) 0x45;
    public static final byte LIST8                    = (byte) 0xc0;
    public static final byte LIST32                   = (byte) 0xd0;

    public static final byte MAP8                     = (byte) 0xc1;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DESCRIBED_TYPE_INDICATOR = (byte) 0x00;

    public static final byte NULL                     = (byte) 0x40;

    public static final byte BOOLEAN                  = (byte) 0x56;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DESCRIBED_TYPE_INDICATOR = (byte) 0x00;

    public static final byte NULL                     = (byte) 0x40;

    public static final byte BOOLEAN                  = (byte) 0x56;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DESCRIBED_TYPE_INDICATOR = (byte) 0x00;

    public static final byte NULL                     = (byte) 0x40;

    public static final byte BOOLEAN                  = (byte) 0x56;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte BOOLEAN                  = (byte) 0x56;
    public static final byte BOOLEAN_TRUE             = (byte) 0x41;
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte BOOLEAN                  = (byte) 0x56;
    public static final byte BOOLEAN_TRUE             = (byte) 0x41;
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte BOOLEAN                  = (byte) 0x56;
    public static final byte BOOLEAN_TRUE             = (byte) 0x41;
    public static final byte BOOLEAN_FALSE            = (byte) 0x42;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte BYTE                     = (byte) 0x51;

    public static final byte SHORT                    = (byte) 0x61;

    public static final byte INT                      = (byte) 0x71;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte BYTE                     = (byte) 0x51;

    public static final byte SHORT                    = (byte) 0x61;

    public static final byte INT                      = (byte) 0x71;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte BYTE                     = (byte) 0x51;

    public static final byte SHORT                    = (byte) 0x61;

    public static final byte INT                      = (byte) 0x71;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UBYTE                    = (byte) 0x50;

    public static final byte USHORT                   = (byte) 0x60;

    public static final byte UINT                     = (byte) 0x70;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UBYTE                    = (byte) 0x50;

    public static final byte USHORT                   = (byte) 0x60;

    public static final byte UINT                     = (byte) 0x70;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UBYTE                    = (byte) 0x50;

    public static final byte USHORT                   = (byte) 0x60;

    public static final byte UINT                     = (byte) 0x70;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
public interface EncodingCodes {

    public static final byte DESCRIBED_TYPE_INDICATOR = (byte) 0x00;

    public static final byte NULL                     = (byte) 0x40;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
public interface EncodingCodes {

    public static final byte DESCRIBED_TYPE_INDICATOR = (byte) 0x00;

    public static final byte NULL                     = (byte) 0x40;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
public interface EncodingCodes {

    public static final byte DESCRIBED_TYPE_INDICATOR = (byte) 0x00;

    public static final byte NULL                     = (byte) 0x40;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte MAP32                    = (byte) 0xd1;

    public static final byte ARRAY8                   = (byte) 0xe0;
    public static final byte ARRAY32                  = (byte) 0xf0;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte MAP32                    = (byte) 0xd1;

    public static final byte ARRAY8                   = (byte) 0xe0;
    public static final byte ARRAY32                  = (byte) 0xf0;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte MAP32                    = (byte) 0xd1;

    public static final byte ARRAY8                   = (byte) 0xe0;
    public static final byte ARRAY32                  = (byte) 0xf0;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte MAP8                     = (byte) 0xc1;
    public static final byte MAP32                    = (byte) 0xd1;

    public static final byte ARRAY8                   = (byte) 0xe0;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte MAP8                     = (byte) 0xc1;
    public static final byte MAP32                    = (byte) 0xd1;

    public static final byte ARRAY8                   = (byte) 0xe0;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte MAP8                     = (byte) 0xc1;
    public static final byte MAP32                    = (byte) 0xd1;

    public static final byte ARRAY8                   = (byte) 0xe0;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte LIST0                    = (byte) 0x45;
    public static final byte LIST8                    = (byte) 0xc0;
    public static final byte LIST32                   = (byte) 0xd0;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte LIST0                    = (byte) 0x45;
    public static final byte LIST8                    = (byte) 0xc0;
    public static final byte LIST32                   = (byte) 0xd0;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte LIST0                    = (byte) 0x45;
    public static final byte LIST8                    = (byte) 0xc0;
    public static final byte LIST32                   = (byte) 0xd0;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SYM32                    = (byte) 0xb3;

    public static final byte LIST0                    = (byte) 0x45;
    public static final byte LIST8                    = (byte) 0xc0;
    public static final byte LIST32                   = (byte) 0xd0;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SYM32                    = (byte) 0xb3;

    public static final byte LIST0                    = (byte) 0x45;
    public static final byte LIST8                    = (byte) 0xc0;
    public static final byte LIST32                   = (byte) 0xd0;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SYM32                    = (byte) 0xb3;

    public static final byte LIST0                    = (byte) 0x45;
    public static final byte LIST8                    = (byte) 0xc0;
    public static final byte LIST32                   = (byte) 0xd0;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte STR8                     = (byte) 0xa1;
    public static final byte STR32                    = (byte) 0xb1;

    public static final byte SYM8                     = (byte) 0xa3;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte STR8                     = (byte) 0xa1;
    public static final byte STR32                    = (byte) 0xb1;

    public static final byte SYM8                     = (byte) 0xa3;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte STR8                     = (byte) 0xa1;
    public static final byte STR32                    = (byte) 0xb1;

    public static final byte SYM8                     = (byte) 0xa3;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SHORT                    = (byte) 0x61;

    public static final byte INT                      = (byte) 0x71;
    public static final byte SMALLINT                 = (byte) 0x54;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SHORT                    = (byte) 0x61;

    public static final byte INT                      = (byte) 0x71;
    public static final byte SMALLINT                 = (byte) 0x54;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte SHORT                    = (byte) 0x61;

    public static final byte INT                      = (byte) 0x71;
    public static final byte SMALLINT                 = (byte) 0x54;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte ULONG                    = (byte) 0x80;
    public static final byte SMALLULONG               = (byte) 0x53;
    public static final byte ULONG0                   = (byte) 0x44;

    public static final byte BYTE                     = (byte) 0x51;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte ULONG                    = (byte) 0x80;
    public static final byte SMALLULONG               = (byte) 0x53;
    public static final byte ULONG0                   = (byte) 0x44;

    public static final byte BYTE                     = (byte) 0x51;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte ULONG                    = (byte) 0x80;
    public static final byte SMALLULONG               = (byte) 0x53;
    public static final byte ULONG0                   = (byte) 0x44;

    public static final byte BYTE                     = (byte) 0x51;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UUID                     = (byte) 0x98;

    public static final byte VBIN8                    = (byte) 0xa0;
    public static final byte VBIN32                   = (byte) 0xb0;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UUID                     = (byte) 0x98;

    public static final byte VBIN8                    = (byte) 0xa0;
    public static final byte VBIN32                   = (byte) 0xb0;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UUID                     = (byte) 0x98;

    public static final byte VBIN8                    = (byte) 0xa0;
    public static final byte VBIN32                   = (byte) 0xb0;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DECIMAL128               = (byte) 0x94;

    public static final byte CHAR                     = (byte) 0x73;

    public static final byte TIMESTAMP                = (byte) 0x83;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DECIMAL128               = (byte) 0x94;

    public static final byte CHAR                     = (byte) 0x73;

    public static final byte TIMESTAMP                = (byte) 0x83;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte DECIMAL128               = (byte) 0x94;

    public static final byte CHAR                     = (byte) 0x73;

    public static final byte TIMESTAMP                = (byte) 0x83;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UINT                     = (byte) 0x70;
    public static final byte SMALLUINT                = (byte) 0x52;
    public static final byte UINT0                    = (byte) 0x43;

    public static final byte ULONG                    = (byte) 0x80;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UINT                     = (byte) 0x70;
    public static final byte SMALLUINT                = (byte) 0x52;
    public static final byte UINT0                    = (byte) 0x43;

    public static final byte ULONG                    = (byte) 0x80;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte UINT                     = (byte) 0x70;
    public static final byte SMALLUINT                = (byte) 0x52;
    public static final byte UINT0                    = (byte) 0x43;

    public static final byte ULONG                    = (byte) 0x80;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte UINT                     = (byte) 0x70;
    public static final byte SMALLUINT                = (byte) 0x52;
    public static final byte UINT0                    = (byte) 0x43;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte UINT                     = (byte) 0x70;
    public static final byte SMALLUINT                = (byte) 0x52;
    public static final byte UINT0                    = (byte) 0x43;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java

    public static final byte UINT                     = (byte) 0x70;
    public static final byte SMALLUINT                = (byte) 0x52;
    public static final byte UINT0                    = (byte) 0x43;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte CHAR                     = (byte) 0x73;

    public static final byte TIMESTAMP                = (byte) 0x83;

    public static final byte UUID                     = (byte) 0x98;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte CHAR                     = (byte) 0x73;

    public static final byte TIMESTAMP                = (byte) 0x83;

    public static final byte UUID                     = (byte) 0x98;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/EncodingCodes.java`
#### Snippet
```java
    public static final byte CHAR                     = (byte) 0x73;

    public static final byte TIMESTAMP                = (byte) 0x83;

    public static final byte UUID                     = (byte) 0x98;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/DeliveryTag.java`
#### Snippet
```java
     * instances from the wire.
     */
    public static class ProtonDeliveryTag implements DeliveryTag {

        public static final ProtonDeliveryTag EMPTY_TAG = new ProtonDeliveryTag();
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/DeliveryTag.java`
#### Snippet
```java
     * instances from the wire.
     */
    public static class ProtonDeliveryTag implements DeliveryTag {

        public static final ProtonDeliveryTag EMPTY_TAG = new ProtonDeliveryTag();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/DescribedType.java`
#### Snippet
```java
     * @return the descriptor that identifies this instance.
     */
    public Object getDescriptor();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/DescribedType.java`
#### Snippet
```java
     * @return the value carried inside this described instance.
     */
    public Object getDescribed();

}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transport/ReceiverSettleMode.java`
#### Snippet
```java
    private final UnsignedByte value;

    private ReceiverSettleMode(int value) {
        this.value = UnsignedByte.valueOf((byte)value);
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transport/SenderSettleMode.java`
#### Snippet
```java
    private final UnsignedByte value;

    private SenderSettleMode(int value) {
        this.value = UnsignedByte.valueOf((byte)value);
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transport/Role.java`
#### Snippet
```java
    private final boolean receiver;

    private Role(boolean receiver) {
        this.receiver = receiver;
    }
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TransactionErrors.java`
#### Snippet
```java
public interface TransactionErrors {

    final static Symbol UNKNOWN_ID = Symbol.valueOf("amqp:transaction:unknown-id");

    final static Symbol TRANSACTION_ROLLBACK = Symbol.valueOf("amqp:transaction:rollback");
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TransactionErrors.java`
#### Snippet
```java
public interface TransactionErrors {

    final static Symbol UNKNOWN_ID = Symbol.valueOf("amqp:transaction:unknown-id");

    final static Symbol TRANSACTION_ROLLBACK = Symbol.valueOf("amqp:transaction:rollback");
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TransactionErrors.java`
#### Snippet
```java
    final static Symbol UNKNOWN_ID = Symbol.valueOf("amqp:transaction:unknown-id");

    final static Symbol TRANSACTION_ROLLBACK = Symbol.valueOf("amqp:transaction:rollback");

    final static Symbol TRANSACTION_TIMEOUT = Symbol.valueOf("amqp:transaction:timeout");
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TransactionErrors.java`
#### Snippet
```java
    final static Symbol UNKNOWN_ID = Symbol.valueOf("amqp:transaction:unknown-id");

    final static Symbol TRANSACTION_ROLLBACK = Symbol.valueOf("amqp:transaction:rollback");

    final static Symbol TRANSACTION_TIMEOUT = Symbol.valueOf("amqp:transaction:timeout");
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TransactionErrors.java`
#### Snippet
```java
    final static Symbol TRANSACTION_ROLLBACK = Symbol.valueOf("amqp:transaction:rollback");

    final static Symbol TRANSACTION_TIMEOUT = Symbol.valueOf("amqp:transaction:timeout");

}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TransactionErrors.java`
#### Snippet
```java
    final static Symbol TRANSACTION_ROLLBACK = Symbol.valueOf("amqp:transaction:rollback");

    final static Symbol TRANSACTION_TIMEOUT = Symbol.valueOf("amqp:transaction:timeout");

}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TxnCapability.java`
#### Snippet
```java
    final static Symbol LOCAL_TXN = Symbol.valueOf("amqp:local-transactions");

    final static Symbol DISTRIBUTED_TXN = Symbol.valueOf("amqp:distributed-transactions");

    final static Symbol PROMOTABLE_TXN = Symbol.valueOf("amqp:promotable-transactions");
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TxnCapability.java`
#### Snippet
```java
    final static Symbol LOCAL_TXN = Symbol.valueOf("amqp:local-transactions");

    final static Symbol DISTRIBUTED_TXN = Symbol.valueOf("amqp:distributed-transactions");

    final static Symbol PROMOTABLE_TXN = Symbol.valueOf("amqp:promotable-transactions");
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TxnCapability.java`
#### Snippet
```java
public interface TxnCapability {

    final static Symbol LOCAL_TXN = Symbol.valueOf("amqp:local-transactions");

    final static Symbol DISTRIBUTED_TXN = Symbol.valueOf("amqp:distributed-transactions");
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TxnCapability.java`
#### Snippet
```java
public interface TxnCapability {

    final static Symbol LOCAL_TXN = Symbol.valueOf("amqp:local-transactions");

    final static Symbol DISTRIBUTED_TXN = Symbol.valueOf("amqp:distributed-transactions");
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TxnCapability.java`
#### Snippet
```java
    final static Symbol PROMOTABLE_TXN = Symbol.valueOf("amqp:promotable-transactions");

    final static Symbol MULTI_TXNS_PER_SSN = Symbol.valueOf("amqp:multi-txns-per-ssn");

    final static Symbol MULTI_SSNS_PER_TXN = Symbol.valueOf("amqp:multi-ssns-per-txn");
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TxnCapability.java`
#### Snippet
```java
    final static Symbol PROMOTABLE_TXN = Symbol.valueOf("amqp:promotable-transactions");

    final static Symbol MULTI_TXNS_PER_SSN = Symbol.valueOf("amqp:multi-txns-per-ssn");

    final static Symbol MULTI_SSNS_PER_TXN = Symbol.valueOf("amqp:multi-ssns-per-txn");
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TxnCapability.java`
#### Snippet
```java
    final static Symbol DISTRIBUTED_TXN = Symbol.valueOf("amqp:distributed-transactions");

    final static Symbol PROMOTABLE_TXN = Symbol.valueOf("amqp:promotable-transactions");

    final static Symbol MULTI_TXNS_PER_SSN = Symbol.valueOf("amqp:multi-txns-per-ssn");
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TxnCapability.java`
#### Snippet
```java
    final static Symbol DISTRIBUTED_TXN = Symbol.valueOf("amqp:distributed-transactions");

    final static Symbol PROMOTABLE_TXN = Symbol.valueOf("amqp:promotable-transactions");

    final static Symbol MULTI_TXNS_PER_SSN = Symbol.valueOf("amqp:multi-txns-per-ssn");
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TxnCapability.java`
#### Snippet
```java
    final static Symbol MULTI_TXNS_PER_SSN = Symbol.valueOf("amqp:multi-txns-per-ssn");

    final static Symbol MULTI_SSNS_PER_TXN = Symbol.valueOf("amqp:multi-ssns-per-txn");

}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TxnCapability.java`
#### Snippet
```java
    final static Symbol MULTI_TXNS_PER_SSN = Symbol.valueOf("amqp:multi-txns-per-ssn");

    final static Symbol MULTI_SSNS_PER_TXN = Symbol.valueOf("amqp:multi-ssns-per-txn");

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferIterator.java`
#### Snippet
```java
     */
    @FunctionalInterface
    public interface ByteConsumer {

        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferComponent.java`
#### Snippet
```java
     * @return a new buffer iterator that iterates over the readable bytes.
     */
    public ProtonBufferIterator bufferIterator();

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferAllocator.java`
#### Snippet
```java

    @Override
    default public void close() {
        // Default has no action to take
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/Scheduler.java`
#### Snippet
```java
     * @throws RejectedExecutionException if the command cannot be run for some reason.
     */
    public Future<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/Scheduler.java`
#### Snippet
```java
     * @return a {@link Future} instance that can be awaited for completion of the task.
     */
    public <V> Future<V> schedule(Callable<V> task, long delay, TimeUnit unit);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/Scheduler.java`
#### Snippet
```java
     * @throws RejectedExecutionException if the command cannot be run for some reason.
     */
    public Future<?> schedule(Runnable command, long delay, TimeUnit unit);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/Scheduler.java`
#### Snippet
```java
     * @throws RejectedExecutionException if the command cannot be run for some reason.
     */
    public Future<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/EngineSaslDriver.java`
#### Snippet
```java
	 * is currently in.  If the state is 'none' then no SASL negotiations will be performed.
	 */
    public enum SaslState {

        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/EngineFactory.java`
#### Snippet
```java
	 * The Proton provided EngineFactory instance.
	 */
    public static final EngineFactory PROTON = new ProtonEngineFactory();

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/EngineFactory.java`
#### Snippet
```java
	 * The Proton provided EngineFactory instance.
	 */
    public static final EngineFactory PROTON = new ProtonEngineFactory();

    /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/EngineFactory.java`
#### Snippet
```java
	 * The Proton provided EngineFactory instance.
	 */
    public static final EngineFactory PROTON = new ProtonEngineFactory();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/Transaction.java`
#### Snippet
```java
     * Provides state for this {@link Transaction}.
     */
    public enum DischargeState {

        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/sasl/client/Mechanism.java`
#### Snippet
```java
     * @return true if this Mechanism is enabled by default.
     */
    public boolean isEnabledByDefault();

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
    public void error(String message);

    public void error(String message, Object value);

    public void error(String message, Object value1, Object value2);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
     * @return if the info log level is enabled for this {@link ProtonLogger}.
     */
    public boolean isInfoEnabled();

    public void info(String message);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
    public boolean isTraceEnabled();

    public void trace(String message);

    public void trace(String message, Object value);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
    public void error(String message, Object value);

    public void error(String message, Object value1, Object value2);

    public void error(String message, Object... arguments);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
     * @return the name that was given to this logger on creation.
     */
    public String getName();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
    public void info(String message);

    public void info(String message, Object value);

    public void info(String message, Object value1, Object value2);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
    public void trace(String message);

    public void trace(String message, Object value);

    public void trace(String message, Object value1, Object value2);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
    public void warn(String message, Object value);

    public void warn(String message, Object value1, Object value2);

    public void warn(String message, Object... arguments);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
    public void info(String message, Object value1, Object value2);

    public void info(String message, Object... arguments);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
    public void debug(String message, Object value);

    public void debug(String message, Object value1, Object value2);

    public void debug(String message, Object... arguments);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
    public void warn(String message, Object value1, Object value2);

    public void warn(String message, Object... arguments);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
    public void trace(String message, Object value);

    public void trace(String message, Object value1, Object value2);

    public void trace(String message, Object... arguments);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
    public boolean isErrorEnabled();

    public void error(String message);

    public void error(String message, Object value);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
    public void info(String message, Object value);

    public void info(String message, Object value1, Object value2);

    public void info(String message, Object... arguments);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
     * @return if the debug log level is enabled for this {@link ProtonLogger}.
     */
    public boolean isDebugEnabled();

    public void debug(String message);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
    public boolean isWarnEnabled();

    public void warn(String message);

    public void warn(String message, Object value);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
    public void debug(String message, Object value1, Object value2);

    public void debug(String message, Object... arguments);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
    public boolean isDebugEnabled();

    public void debug(String message);

    public void debug(String message, Object value);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
    public void error(String message, Object value1, Object value2);

    public void error(String message, Object... arguments);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
     * @return if the trace log level is enabled for this {@link ProtonLogger}.
     */
    public boolean isTraceEnabled();

    public void trace(String message);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
     * @return if the error log level is enabled for this {@link ProtonLogger}.
     */
    public boolean isErrorEnabled();

    public void error(String message);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
    public boolean isInfoEnabled();

    public void info(String message);

    public void info(String message, Object value);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
    public void trace(String message, Object value1, Object value2);

    public void trace(String message, Object... arguments);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
    public void warn(String message);

    public void warn(String message, Object value);

    public void warn(String message, Object value1, Object value2);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
     * @return if the warn log level is enabled for this {@link ProtonLogger}.
     */
    public boolean isWarnEnabled();

    public void warn(String message);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLogger.java`
#### Snippet
```java
    public void debug(String message);

    public void debug(String message, Object value);

    public void debug(String message, Object value1, Object value2);
```

## RuleId[ruleID=LoopStatementsThatDontLoop]
### LoopStatementsThatDontLoop
`while` statement does not loop
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
            checkClosed();

            while (true) {
                if (remainingSectionBytes == 0 && !tryMoveToNextBodySection()) {
                    return -1;  // Cannot read any further.
```

## RuleId[ruleID=RedundantClassCall]
### RedundantClassCall
Redundant call to `cast()`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
        @Override
        public boolean remove(Object target) {
            return UnsettledMap.this.remove(Number.class.cast(target).intValue()) != null;
        }

```

### RedundantClassCall
Redundant call to `cast()`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
    @Override
    public Delivery remove(Object key) {
        return removeValue(Number.class.cast(key).intValue());
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
    @Override
    public boolean containsKey(Object key) {
        return containsKey(Number.class.cast(key).intValue());
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
    @Override
    public Delivery get(Object key) {
        return get(Number.class.cast(key).intValue());
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
    @Override
    public E remove(Object key) {
        return remove(Number.class.cast(key).intValue());
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
    @Override
    public E getOrDefault(Object key, E defaultValue) {
        return getOrDefault(Number.class.cast(key).intValue(), defaultValue);
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
                if (o instanceof Map.Entry) {
                    Map.Entry<?,?> entry = (Map.Entry<?,?>) o;
                    Number key = Number.class.cast(entry.getKey());

                    if (!isInRange(key.intValue())) {
```

### RedundantClassCall
Redundant call to `cast()`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
                if (o instanceof Map.Entry) {
                    Map.Entry<?,?> entry = (Map.Entry<?,?>) o;
                    Number key = Number.class.cast(entry.getKey());

                    if (!isInRange(key.intValue())) {
```

### RedundantClassCall
Redundant call to `cast()`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
    @Override
    public E get(Object key) {
        return get(Number.class.cast(key).intValue());
    }

```

## RuleId[ruleID=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
                    size = 0;
                    Iterator<?> i = iterator();
                    while (i.hasNext()) {
                        size++;
                        i.next();
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (33 lines)
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonFrameEncodingHandler.java`
#### Snippet
```java
    // output buffer by using a composite write similar to the below. Likely this will
    // work best if the output buffer is written directly using a Netty 5 buffer proxy.
    //
    // @SuppressWarnings("resource")
    // private void writePerformativeWithPayload(EngineHandlerContext context, OutgoingAMQPEnvelope envelope) {
```

## RuleId[ruleID=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of parameter `target`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamDelivery.java`
#### Snippet
```java

        @Override
        public int read(byte target[], int offset, int length) throws IOException {
            checkStreamStateIsValid();

```

### CStyleArrayDeclaration
C-style array declaration of parameter `bytes`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java

        @Override
        public void write(byte bytes[], int offset, int length) throws IOException {
            checkClosed();
            checkOutputLimitReached(length);
```

### CStyleArrayDeclaration
C-style array declaration of parameter `bytes`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java

        @Override
        public void write(byte bytes[]) throws IOException {
            write(bytes, 0, bytes.length);
        }
```

### CStyleArrayDeclaration
C-style array declaration of parameter `target`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java

        @Override
        public int read(byte target[], int offset, int length) throws IOException {
            checkClosed();

```

## RuleId[ruleID=LongLiteralsEndingWithLowercaseL]
### LongLiteralsEndingWithLowercaseL
'long' literal `128l` ends with lowercase 'l'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/LongElement.java`
#### Snippet
```java

            if (parent.constructorType() == ArrayElement.SMALL) {
                if (-128l <= value && value <= 127l) {
                    return 1;
                } else {
```

### LongLiteralsEndingWithLowercaseL
'long' literal `127l` ends with lowercase 'l'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/LongElement.java`
#### Snippet
```java

            if (parent.constructorType() == ArrayElement.SMALL) {
                if (-128l <= value && value <= 127l) {
                    return 1;
                } else {
```

### LongLiteralsEndingWithLowercaseL
'long' literal `128l` ends with lowercase 'l'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/LongElement.java`
#### Snippet
```java

        } else {
            return (-128l <= value && value <= 127l) ? 2 : 9;
        }

```

### LongLiteralsEndingWithLowercaseL
'long' literal `127l` ends with lowercase 'l'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/LongElement.java`
#### Snippet
```java

        } else {
            return (-128l <= value && value <= 127l) ? 2 : 9;
        }

```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/UnsignedLongElement.java`
#### Snippet
```java
            final ArrayElement parent = (ArrayElement) parent();
            if (parent.constructorType() == ArrayElement.TINY) {
                if (value.longValue() == 0l) {
                    return 0;
                } else {
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/UnsignedLongElement.java`
#### Snippet
```java

            if (parent.constructorType() == ArrayElement.SMALL) {
                if (0l <= value.longValue() && value.longValue() <= 255l) {
                    return 1;
                } else {
```

### LongLiteralsEndingWithLowercaseL
'long' literal `255l` ends with lowercase 'l'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/UnsignedLongElement.java`
#### Snippet
```java

            if (parent.constructorType() == ArrayElement.SMALL) {
                if (0l <= value.longValue() && value.longValue() <= 255l) {
                    return 1;
                } else {
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/UnsignedLongElement.java`
#### Snippet
```java

        } else {
            return 0l == value.longValue() ? 1 : (1l <= value.longValue() && value.longValue() <= 255l) ? 2 : 9;
        }

```

### LongLiteralsEndingWithLowercaseL
'long' literal `1l` ends with lowercase 'l'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/UnsignedLongElement.java`
#### Snippet
```java

        } else {
            return 0l == value.longValue() ? 1 : (1l <= value.longValue() && value.longValue() <= 255l) ? 2 : 9;
        }

```

### LongLiteralsEndingWithLowercaseL
'long' literal `255l` ends with lowercase 'l'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/UnsignedLongElement.java`
#### Snippet
```java

        } else {
            return 0l == value.longValue() ? 1 : (1l <= value.longValue() && value.longValue() <= 255l) ? 2 : 9;
        }

```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/primitives/Decimal64.java`
#### Snippet
```java

    static long calculateBits(final BigDecimal underlying) {
        return 0l; // TODO
    }

```

### LongLiteralsEndingWithLowercaseL
'long' literal `0xFFl` ends with lowercase 'l'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/primitives/UnsignedByte.java`
#### Snippet
```java
    @Override
    public long longValue() {
        return (underlying) & 0xFFl;
    }

```

### LongLiteralsEndingWithLowercaseL
'long' literal `0xffffffffffffffffl` ends with lowercase 'l'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/primitives/UnsignedLong.java`
#### Snippet
```java
    public static final UnsignedLong ZERO = cachedValues[0];
    public static final UnsignedLong ONE = cachedValues[1];
    public static final UnsignedLong MAX_VALUE = new UnsignedLong(0xffffffffffffffffl);

    private final long underlying;
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
            return properties().getCreationTime();
        } else {
            return 0l;
        }
    }
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
            return properties().getAbsoluteExpiryTime();
        } else {
            return 0l;
        }
    }
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/messaging/HeaderTypeDecoder.java`
#### Snippet
```java
                    break;
                case 2:
                    header.setTimeToLive(state.getDecoder().readUnsignedInteger(buffer, state, 0l));
                    break;
                case 3:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/messaging/HeaderTypeDecoder.java`
#### Snippet
```java
                    break;
                case 4:
                    header.setDeliveryCount(state.getDecoder().readUnsignedInteger(buffer, state, 0l));
                    break;
            }
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/messaging/HeaderTypeDecoder.java`
#### Snippet
```java
                    break;
                case 2:
                    header.setTimeToLive(state.getDecoder().readUnsignedInteger(stream, state, 0l));
                    break;
                case 3:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/messaging/HeaderTypeDecoder.java`
#### Snippet
```java
                    break;
                case 4:
                    header.setDeliveryCount(state.getDecoder().readUnsignedInteger(stream, state, 0l));
                    break;
            }
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/messaging/PropertiesTypeDecoder.java`
#### Snippet
```java
                    break;
                case 8:
                    properties.setAbsoluteExpiryTime(state.getDecoder().readTimestamp(stream, state, 0l));
                    break;
                case 9:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/messaging/PropertiesTypeDecoder.java`
#### Snippet
```java
                    break;
                case 9:
                    properties.setCreationTime(state.getDecoder().readTimestamp(stream, state, 0l));
                    break;
                case 10:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/messaging/PropertiesTypeDecoder.java`
#### Snippet
```java
                    break;
                case 11:
                    properties.setGroupSequence(state.getDecoder().readUnsignedInteger(stream, state, 0l));
                    break;
                case 12:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/messaging/PropertiesTypeDecoder.java`
#### Snippet
```java
                    break;
                case 8:
                    properties.setAbsoluteExpiryTime(state.getDecoder().readTimestamp(buffer, state, 0l));
                    break;
                case 9:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/messaging/PropertiesTypeDecoder.java`
#### Snippet
```java
                    break;
                case 9:
                    properties.setCreationTime(state.getDecoder().readTimestamp(buffer, state, 0l));
                    break;
                case 10:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/messaging/PropertiesTypeDecoder.java`
#### Snippet
```java
                    break;
                case 11:
                    properties.setGroupSequence(state.getDecoder().readUnsignedInteger(buffer, state, 0l));
                    break;
                case 12:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/FlowTypeDecoder.java`
#### Snippet
```java
            switch (index) {
                case 0:
                    flow.setNextIncomingId(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 1:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/FlowTypeDecoder.java`
#### Snippet
```java
                    break;
                case 1:
                    flow.setIncomingWindow(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 2:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/FlowTypeDecoder.java`
#### Snippet
```java
                    break;
                case 2:
                    flow.setNextOutgoingId(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 3:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/FlowTypeDecoder.java`
#### Snippet
```java
                    break;
                case 3:
                    flow.setOutgoingWindow(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 4:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/FlowTypeDecoder.java`
#### Snippet
```java
                    break;
                case 4:
                    flow.setHandle(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 5:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/FlowTypeDecoder.java`
#### Snippet
```java
                    break;
                case 5:
                    flow.setDeliveryCount(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 6:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/FlowTypeDecoder.java`
#### Snippet
```java
                    break;
                case 6:
                    flow.setLinkCredit(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 7:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/FlowTypeDecoder.java`
#### Snippet
```java
                    break;
                case 7:
                    flow.setAvailable(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 8:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/FlowTypeDecoder.java`
#### Snippet
```java
            switch (index) {
                case 0:
                    flow.setNextIncomingId(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 1:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/FlowTypeDecoder.java`
#### Snippet
```java
                    break;
                case 1:
                    flow.setIncomingWindow(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 2:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/FlowTypeDecoder.java`
#### Snippet
```java
                    break;
                case 2:
                    flow.setNextOutgoingId(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 3:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/FlowTypeDecoder.java`
#### Snippet
```java
                    break;
                case 3:
                    flow.setOutgoingWindow(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 4:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/FlowTypeDecoder.java`
#### Snippet
```java
                    break;
                case 4:
                    flow.setHandle(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 5:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/FlowTypeDecoder.java`
#### Snippet
```java
                    break;
                case 5:
                    flow.setDeliveryCount(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 6:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/FlowTypeDecoder.java`
#### Snippet
```java
                    break;
                case 6:
                    flow.setLinkCredit(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 7:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/DispositionTypeDecoder.java`
#### Snippet
```java
                    break;
                case 1:
                    disposition.setFirst(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 2:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/FlowTypeDecoder.java`
#### Snippet
```java
                    break;
                case 7:
                    flow.setAvailable(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 8:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/DispositionTypeDecoder.java`
#### Snippet
```java
                    break;
                case 2:
                    disposition.setLast(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 3:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/DispositionTypeDecoder.java`
#### Snippet
```java
                    break;
                case 1:
                    disposition.setFirst(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 2:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/DispositionTypeDecoder.java`
#### Snippet
```java
                    break;
                case 2:
                    disposition.setLast(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 3:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/DetachTypeDecoder.java`
#### Snippet
```java
            switch (index) {
                case 0:
                    detach.setHandle(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 1:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/DetachTypeDecoder.java`
#### Snippet
```java
            switch (index) {
                case 0:
                    detach.setHandle(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 1:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0xffl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
        switch (encodingCode) {
            case EncodingCodes.SMALLULONG:
                descriptor = UnsignedLong.valueOf(ProtonStreamUtils.readByte(stream) & 0xffl);
                break;
            case EncodingCodes.ULONG:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
        switch (encodingCode) {
            case EncodingCodes.ULONG0:
                return 0l;
            case EncodingCodes.SMALLULONG:
                return ProtonStreamUtils.readByte(stream) & 0xffl;
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0xffl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return 0l;
            case EncodingCodes.SMALLULONG:
                return ProtonStreamUtils.readByte(stream) & 0xffl;
            case EncodingCodes.ULONG:
                return ProtonStreamUtils.readLong(stream);
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0xffl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
        switch (encodingCode) {
            case EncodingCodes.SMALLLONG:
                return ProtonStreamUtils.readByte(stream) & 0xffl;
            case EncodingCodes.LONG:
                return ProtonStreamUtils.readLong(stream);
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0xffl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
        switch (encodingCode) {
            case EncodingCodes.SMALLLONG:
                return Long.valueOf(ProtonStreamUtils.readByte(stream) & 0xffl);
            case EncodingCodes.LONG:
                return ProtonStreamUtils.readLong(stream);
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0xffl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return UnsignedLong.ZERO;
            case EncodingCodes.SMALLULONG:
                return UnsignedLong.valueOf(ProtonStreamUtils.readByte(stream) & 0xffl);
            case EncodingCodes.ULONG:
                return UnsignedLong.valueOf(ProtonStreamUtils.readLong(stream));
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0xffl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return 0;
            case EncodingCodes.SMALLUINT:
                return ProtonStreamUtils.readByte(stream) & 0xffl;
            case EncodingCodes.UINT:
                return ProtonStreamUtils.readInt(stream) & 0xffffffffl;
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0xffffffffl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return ProtonStreamUtils.readByte(stream) & 0xffl;
            case EncodingCodes.UINT:
                return ProtonStreamUtils.readInt(stream) & 0xffffffffl;
            case EncodingCodes.NULL:
                return defaultValue;
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0xffffffffl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return buffer.readByte() & 0xff;
            case EncodingCodes.UINT:
                return buffer.readInt() & 0xffffffffl;
            case EncodingCodes.NULL:
                return defaultValue;
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
        switch (encodingCode) {
            case EncodingCodes.ULONG0:
                return 0l;
            case EncodingCodes.SMALLULONG:
                return (buffer.readByte() & 0xff);
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/OpenTypeDecoder.java`
#### Snippet
```java
                    break;
                case 2:
                    open.setMaxFrameSize(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 3:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/OpenTypeDecoder.java`
#### Snippet
```java
                    break;
                case 4:
                    open.setIdleTimeout(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 5:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/OpenTypeDecoder.java`
#### Snippet
```java
                    break;
                case 2:
                    open.setMaxFrameSize(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 3:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/OpenTypeDecoder.java`
#### Snippet
```java
                    break;
                case 4:
                    open.setIdleTimeout(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 5:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/BeginTypeDecoder.java`
#### Snippet
```java
                    break;
                case 1:
                    begin.setNextOutgoingId(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 2:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/BeginTypeDecoder.java`
#### Snippet
```java
                    break;
                case 2:
                    begin.setIncomingWindow(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 3:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/BeginTypeDecoder.java`
#### Snippet
```java
                    break;
                case 3:
                    begin.setOutgoingWindow(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 4:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/BeginTypeDecoder.java`
#### Snippet
```java
                    break;
                case 4:
                    begin.setHandleMax(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 5:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/BeginTypeDecoder.java`
#### Snippet
```java
                    break;
                case 1:
                    begin.setNextOutgoingId(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 2:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/BeginTypeDecoder.java`
#### Snippet
```java
                    break;
                case 2:
                    begin.setIncomingWindow(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 3:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/BeginTypeDecoder.java`
#### Snippet
```java
                    break;
                case 3:
                    begin.setOutgoingWindow(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 4:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/BeginTypeDecoder.java`
#### Snippet
```java
                    break;
                case 4:
                    begin.setHandleMax(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 5:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/AttachTypeDecoder.java`
#### Snippet
```java
                    break;
                case 1:
                    attach.setHandle(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 2:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/AttachTypeDecoder.java`
#### Snippet
```java
                    break;
                case 9:
                    attach.setInitialDeliveryCount(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 10:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/AttachTypeDecoder.java`
#### Snippet
```java
                    break;
                case 1:
                    attach.setHandle(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 2:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/AttachTypeDecoder.java`
#### Snippet
```java
                    break;
                case 9:
                    attach.setInitialDeliveryCount(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 10:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/TransferTypeDecoder.java`
#### Snippet
```java
            switch (index) {
                case 0:
                    transfer.setHandle(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 1:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/TransferTypeDecoder.java`
#### Snippet
```java
                    break;
                case 1:
                    transfer.setDeliveryId(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 2:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/TransferTypeDecoder.java`
#### Snippet
```java
                    break;
                case 3:
                    transfer.setMessageFormat(decoder.readUnsignedInteger(buffer, state, 0l));
                    break;
                case 4:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/TransferTypeDecoder.java`
#### Snippet
```java
            switch (index) {
                case 0:
                    transfer.setHandle(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 1:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/TransferTypeDecoder.java`
#### Snippet
```java
                    break;
                case 1:
                    transfer.setDeliveryId(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 2:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transport/TransferTypeDecoder.java`
#### Snippet
```java
                    break;
                case 3:
                    transfer.setMessageFormat(decoder.readUnsignedInteger(stream, state, 0l));
                    break;
                case 4:
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/Decimal64.java`
#### Snippet
```java

    static long calculateBits(final BigDecimal underlying) {
        return 0l; // TODO
    }

```

### LongLiteralsEndingWithLowercaseL
'long' literal `0xffffffffffffffffl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/UnsignedLong.java`
#### Snippet
```java
    public static final UnsignedLong ZERO = cachedValues[0];
    public static final UnsignedLong ONE = cachedValues[1];
    public static final UnsignedLong MAX_VALUE = new UnsignedLong(0xffffffffffffffffl);

    private final long underlying;
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0xFFl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/UnsignedByte.java`
#### Snippet
```java
    @Override
    public long longValue() {
        return (underlying) & 0xFFl;
    }

```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/messaging/Properties.java`
#### Snippet
```java
    public void clearGroupSequence() {
        modified &= ~GROUP_SEQUENCE;
        groupSequence = 0l;
    }

```

### LongLiteralsEndingWithLowercaseL
'long' literal `0x00000000FFFFFFFFl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
    public Buffer writeUnsignedInt(long value) {
        try {
            resource.writeInt((int)(value & 0x00000000FFFFFFFFl));
            return this;
        } catch (RuntimeException ex) {
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0x00000000FFFFFFFFl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
    public long readUnsignedInt() {
        try {
            return readInt() & 0x00000000FFFFFFFFl;
        } catch (RuntimeException ex) {
            throw translateToNettyException(ex);
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0x00000000FFFFFFFFl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
    public Buffer setUnsignedInt(int woff, long value) {
        try {
            resource.setUnsignedInt(woff, (int)(value & 0x00000000FFFFFFFFl));
            return this;
        } catch (RuntimeException ex) {
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0x00000000000000FFl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSequentialTagGenerator.java`
#### Snippet
```java
            if (tagValue < 0) {
                buffer.writeLong(tagValue);
            } else if (tagValue <= 0x00000000000000FFl) {
                buffer.writeByte((byte) tagValue);
            } else if (tagValue <= 0x000000000000FFFFl) {
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0x000000000000FFFFl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSequentialTagGenerator.java`
#### Snippet
```java
            } else if (tagValue <= 0x00000000000000FFl) {
                buffer.writeByte((byte) tagValue);
            } else if (tagValue <= 0x000000000000FFFFl) {
                buffer.writeShort((short) tagValue);
            } else if (tagValue <= 0x00000000FFFFFFFFl) {
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0x00000000FFFFFFFFl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSequentialTagGenerator.java`
#### Snippet
```java
            } else if (tagValue <= 0x000000000000FFFFl) {
                buffer.writeShort((short) tagValue);
            } else if (tagValue <= 0x00000000FFFFFFFFl) {
                buffer.writeInt((int) tagValue);
            } else {
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0x00000000000000FFl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSequentialTagGenerator.java`
#### Snippet
```java
            if (tagValue < 0) {
                return Long.BYTES;
            } else if (tagValue <= 0x00000000000000FFl) {
                return Byte.BYTES;
            } else if (tagValue <= 0x000000000000FFFFl) {
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0x000000000000FFFFl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSequentialTagGenerator.java`
#### Snippet
```java
            } else if (tagValue <= 0x00000000000000FFl) {
                return Byte.BYTES;
            } else if (tagValue <= 0x000000000000FFFFl) {
                return Short.BYTES;
            } else if (tagValue <= 0x00000000FFFFFFFFl) {
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0x00000000FFFFFFFFl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSequentialTagGenerator.java`
#### Snippet
```java
            } else if (tagValue <= 0x000000000000FFFFl) {
                return Short.BYTES;
            } else if (tagValue <= 0x00000000FFFFFFFFl) {
                return Integer.BYTES;
            } else {
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0x00000000000000FFl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSequentialTagGenerator.java`
#### Snippet
```java
            if (tagValue < 0) {
                return ProtonBufferUtils.toByteArray(tagValue);
            } else if (tagValue <= 0x00000000000000FFl) {
                return ProtonBufferUtils.toByteArray((byte) tagValue);
            } else if (tagValue <= 0x000000000000FFFFl) {
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0x000000000000FFFFl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSequentialTagGenerator.java`
#### Snippet
```java
            } else if (tagValue <= 0x00000000000000FFl) {
                return ProtonBufferUtils.toByteArray((byte) tagValue);
            } else if (tagValue <= 0x000000000000FFFFl) {
                return ProtonBufferUtils.toByteArray((short) tagValue);
            } else if (tagValue <= 0x00000000FFFFFFFFl) {
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0x00000000FFFFFFFFl` ends with lowercase 'l'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSequentialTagGenerator.java`
#### Snippet
```java
            } else if (tagValue <= 0x000000000000FFFFl) {
                return ProtonBufferUtils.toByteArray((short) tagValue);
            } else if (tagValue <= 0x00000000FFFFFFFFl) {
                return ProtonBufferUtils.toByteArray((int) tagValue);
            } else {
```

## RuleId[ruleID=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestServerOptions.java`
#### Snippet
```java

    @Override
    public ProtonTestServerOptions clone() {
        return copyOptions(new ProtonTestServerOptions());
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestClientOptions.java`
#### Snippet
```java

    @Override
    public ProtonTestClientOptions clone() {
        return copyOptions(new ProtonTestClientOptions());
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/StreamSenderOptions.java`
#### Snippet
```java

    @Override
    public StreamSenderOptions clone() {
        return copyInto(new StreamSenderOptions());
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/OutputStreamOptions.java`
#### Snippet
```java

    @Override
    public OutputStreamOptions clone() {
        return copyInto(new OutputStreamOptions());
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/ReceiverOptions.java`
#### Snippet
```java

    @Override
    public ReceiverOptions clone() {
        return copyInto(new ReceiverOptions());
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/SenderOptions.java`
#### Snippet
```java

    @Override
    public SenderOptions clone() {
        return copyInto(new SenderOptions());
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/StreamReceiverOptions.java`
#### Snippet
```java

    @Override
    public StreamReceiverOptions clone() {
        return copyInto(new StreamReceiverOptions());
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/SslOptions.java`
#### Snippet
```java

    @Override
    public SslOptions clone() {
        return copyInto(new SslOptions());
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/TargetOptions.java`
#### Snippet
```java

    @Override
    public TargetOptions clone() {
        return copyInto(new TargetOptions());
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/SourceOptions.java`
#### Snippet
```java

    @Override
    public SourceOptions clone() {
        return copyInto(new SourceOptions());
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/TransportOptions.java`
#### Snippet
```java

    @Override
    public TransportOptions clone() {
        return copyInto(new TransportOptions());
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/SaslOptions.java`
#### Snippet
```java

    @Override
    public SaslOptions clone() {
        return copyInto(new SaslOptions());
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/ClientOptions.java`
#### Snippet
```java

    @Override
    public ClientOptions clone() {
        return copyInto(new ClientOptions());
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/ReconnectOptions.java`
#### Snippet
```java

    @Override
    public ReconnectOptions clone() {
        return copyInto(new ReconnectOptions());
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/SessionOptions.java`
#### Snippet
```java

    @Override
    public SessionOptions clone() {
        return copyInto(new SessionOptions());
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/ConnectionOptions.java`
#### Snippet
```java

    @Override
    public ConnectionOptions clone() {
        return copyInto(new ConnectionOptions());
    }
```

## RuleId[ruleID=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestServerOptions.java`
#### Snippet
```java
    public static final boolean DEFAULT_TRUST_ALL = false;
    public static final boolean DEFAULT_VERIFY_HOST = true;
    public static final List<String> DEFAULT_DISABLED_PROTOCOLS = Collections.unmodifiableList(Arrays.asList(new String[]{"SSLv2Hello", "SSLv3"}));
    public static final int DEFAULT_LOCAL_PORT = 0;
    public static final boolean DEFAULT_USE_WEBSOCKETS = false;
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestClientOptions.java`
#### Snippet
```java
    public static final boolean DEFAULT_TRUST_ALL = false;
    public static final boolean DEFAULT_VERIFY_HOST = true;
    public static final List<String> DEFAULT_DISABLED_PROTOCOLS = Collections.unmodifiableList(Arrays.asList(new String[]{"SSLv2Hello", "SSLv3"}));
    public static final int DEFAULT_LOCAL_PORT = 0;
    public static final boolean DEFAULT_USE_WEBSOCKETS = false;
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/SslOptions.java`
#### Snippet
```java
    public static final boolean DEFAULT_TRUST_ALL = false;
    public static final boolean DEFAULT_VERIFY_HOST = true;
    public static final List<String> DEFAULT_DISABLED_PROTOCOLS = Collections.unmodifiableList(Arrays.asList(new String[]{"SSLv2Hello", "SSLv3"}));
    public static final int DEFAULT_SSL_PORT = 5671;
    public static final boolean DEFAULT_ALLOW_NATIVE_SSL = false;
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/ThreadPoolUtils.java`
#### Snippet
```java
            answer = executorService.shutdownNow();
            LOG.trace("Shutdown of ExecutorService: {} is shutdown: {} and terminated: {}.",
                new Object[] { executorService, executorService.isShutdown(), executorService.isTerminated() });
        }

```

## RuleId[ruleID=ObjectNotify]
### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/FifoDeliveryQueue.java`
#### Snippet
```java
            queue.addLast(envelope);
            if (waiters > 0) {
                queue.notify();
            }
        }
```

### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/FifoDeliveryQueue.java`
#### Snippet
```java
            queue.addFirst(envelope);
            if (waiters > 0) {
                queue.notify();
            }
        }
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                return new LongElement(element.parent(), element.prev(), l);
            case ARRAY:
                break;
            case BINARY:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case BINARY:
                break;
            case BOOL:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case BOOL:
                break;
            case BYTE:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case BYTE:
                break;
            case CHAR:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case CHAR:
                break;
            case DECIMAL128:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case DECIMAL128:
                break;
            case DECIMAL32:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case DECIMAL32:
                break;
            case DECIMAL64:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case DECIMAL64:
                break;
            case DESCRIBED:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case DESCRIBED:
                break;
            case DOUBLE:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case DOUBLE:
                break;
            case FLOAT:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case FLOAT:
                break;
            case LIST:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case LIST:
                break;
            case MAP:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case MAP:
                break;
            case NULL:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case NULL:
                break;
            case SHORT:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case SHORT:
                break;
            case STRING:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case STRING:
                break;
            case SYMBOL:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case SYMBOL:
                break;
            case TIMESTAMP:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case TIMESTAMP:
                break;
            case UBYTE:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case UBYTE:
                break;
            case UINT:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case UINT:
                break;
            case ULONG:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case ULONG:
                break;
            case USHORT:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case USHORT:
                break;
            case UUID:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
            case UUID:
                break;
            default:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                    break;
                case DESCRIBED:
                    break;
                default:
                    break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/MapElement.java`
#### Snippet
```java
                        buffer.writeInt(count);
                    case TINY:
                        break;
                    default:
                        break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/transport/Disposition.java`
#### Snippet
```java
                    break;
                case BATCHABLE:
                    result = Boolean.FALSE;
                    break;
                default:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/transport/Transfer.java`
#### Snippet
```java
                    break;
                case RESUME:
                    result = Boolean.FALSE;
                    break;
                case ABORTED:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/transport/Transfer.java`
#### Snippet
```java
                    break;
                case ABORTED:
                    result = Boolean.FALSE;
                    break;
                case BATCHABLE:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/transport/Transfer.java`
#### Snippet
```java
                    break;
                case BATCHABLE:
                    result = Boolean.FALSE;
                    break;
                default:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/transport/Flow.java`
#### Snippet
```java
                    break;
                case ECHO:
                    result = Boolean.FALSE;
                    break;
                default:
```

## RuleId[ruleID=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonFrameLoggingHandler.java`
#### Snippet
```java
    private int uniqueIdentifier;

    private static final boolean checkTraceFramesEnabled() {
        String value = System.getenv(PN_TRACE_FRM);
        return "true".equalsIgnoreCase(value) || "1".equals(value) || "yes".equalsIgnoreCase(value);
```

### FinalPrivateMethod
'private' method declared `final`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonFrameLoggingHandler.java`
#### Snippet
```java
    }

    private static final void trace(String prefix, int connection, int channel, Object performative, ProtonBuffer payload) {
        if (payload == null) {
            System.out.println(String.format("%s:[%d:%d] %s", prefix, connection, channel, performative));
```

### FinalPrivateMethod
'private' method declared `final`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonFrameLoggingHandler.java`
#### Snippet
```java
    }

    private static final void log(String prefix, int connection, int channel, Object performative, ProtonBuffer payload) {
        if (payload == null) {
            LOG.trace("{}:[{}:{}] {}", prefix, connection, channel, performative);
```

### FinalPrivateMethod
'private' method declared `final`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
    }

    private final void doCompaction(UnsettledBucket<Delivery> bucket, UnsettledBucket<Delivery> prev, UnsettledBucket<Delivery> next) {
        if (prev.getFreeSpace() > 0) {
            final int toCopy = Math.min(bucket.entries, prev.getFreeSpace());
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`message.length() == 0` can be replaced with 'message.isEmpty()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientExceptionSupport.java`
#### Snippet
```java

        String message = cause.getMessage();
        if (message == null || message.length() == 0) {
            message = cause.toString();
        }
```

### SizeReplaceableByIsEmpty
`message.length() == 0` can be replaced with 'message.isEmpty()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientExceptionSupport.java`
#### Snippet
```java

        String message = cause.getMessage();
        if (message == null || message.length() == 0) {
            message = cause.toString();
        }
```

### SizeReplaceableByIsEmpty
`footer.getValue().size() > 0` can be replaced with '!footer.getValue().isEmpty()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
        return footer != null &&
               footer.getValue() != null &&
               footer.getValue().size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`messageAnnotations.getValue().size() > 0` can be replaced with '!messageAnnotations.getValue().isEmpty()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
        return messageAnnotations != null &&
               messageAnnotations.getValue() != null &&
               messageAnnotations.getValue().size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`applicationProperties.getValue().size() > 0` can be replaced with '!applicationProperties.getValue().isEmpty()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
        return applicationProperties != null &&
               applicationProperties.getValue() != null &&
               applicationProperties.getValue().size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`footer.getValue().size() > 0` can be replaced with '!footer.getValue().isEmpty()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java
        return footer != null &&
               footer.getValue() != null &&
               footer.getValue().size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`applicationProperties.getValue().size() > 0` can be replaced with '!applicationProperties.getValue().isEmpty()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java
        return applicationProperties != null &&
               applicationProperties.getValue() != null &&
               applicationProperties.getValue().size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`annotations.getValue().size() > 0` can be replaced with '!annotations.getValue().isEmpty()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java
        return annotations != null &&
               annotations.getValue() != null &&
               annotations.getValue().size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`message.length() == 0` can be replaced with 'message.isEmpty()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/IOExceptionSupport.java`
#### Snippet
```java

        String message = cause.getMessage();
        if (message == null || message.length() == 0) {
            message = cause.toString();
        }
```

### SizeReplaceableByIsEmpty
`applicationProperties.getValue().size() > 0` can be replaced with '!applicationProperties.getValue().isEmpty()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
        return applicationProperties != null &&
               applicationProperties.getValue() != null &&
               applicationProperties.getValue().size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`annotations.getValue().size() > 0` can be replaced with '!annotations.getValue().isEmpty()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
    public boolean hasAnnotations() throws ClientException {
        ensureStreamDecodedTo(StreamState.MESSAGE_ANNOTATIONS_READ);
        return annotations != null && annotations.getValue() != null && annotations.getValue().size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`footer.getValue().size() > 0` can be replaced with '!footer.getValue().isEmpty()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
        }

        return footer != null && footer.getValue() != null && footer.getValue().size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`message.length() == 0` can be replaced with 'message.isEmpty()'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/exceptions/ProtonExceptionSupport.java`
#### Snippet
```java
        if (message == null || message.isEmpty()) {
            message = cause.getMessage();
            if (message == null || message.length() == 0) {
                message = cause.toString();
            }
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/IdGenerator.java`
#### Snippet
```java
     */
    public String generateId() {
        StringBuilder sb = new StringBuilder(64);

        sb.append(prefix);
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/sasl/client/AbstractScramSHAMechanism.java`
#### Snippet
```java
        }

        StringBuilder buf = new StringBuilder("n=");
        buf.append(escapeUsername(saslPrep(credentials.username())));
        buf.append(",r=");
```

## RuleId[ruleID=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty4ToProtonBufferAdapter.java`
#### Snippet
```java
        final int bytesRead = channel.read(nioBuffer, position);

        writeOffset += bytesRead > 0 ? bytesRead : 0;

        return bytesRead;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty4ToProtonBufferAdapter.java`
#### Snippet
```java
        final int bytesRead = channel.read(nioBuffer);

        writeOffset += bytesRead > 0 ? bytesRead : 0;

        return bytesRead;
```

## RuleId[ruleID=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/Netty4Support.java`
#### Snippet
```java
    }

    public static final boolean isAvailable() {
        return UNAVAILABILITY_CAUSE == null;
    }
```

### FinalStaticMethod
'static' method declared `final`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/Netty5Support.java`
#### Snippet
```java
    }

    public static final boolean isAvailable() {
        return UNAVAILABILITY_CAUSE == null;
    }
```

### FinalStaticMethod
'static' method declared `final`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonByteArrayBufferAllocator.java`
#### Snippet
```java
    }

    public static final ProtonBufferAllocator allocator() {
        return DEFAULT;
    }
```

### FinalStaticMethod
'static' method declared `final`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonFrameLoggingHandler.java`
#### Snippet
```java
    private int uniqueIdentifier;

    private static final boolean checkTraceFramesEnabled() {
        String value = System.getenv(PN_TRACE_FRM);
        return "true".equalsIgnoreCase(value) || "1".equals(value) || "yes".equalsIgnoreCase(value);
```

### FinalStaticMethod
'static' method declared `final`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonFrameLoggingHandler.java`
#### Snippet
```java
    }

    private static final void trace(String prefix, int connection, int channel, Object performative, ProtonBuffer payload) {
        if (payload == null) {
            System.out.println(String.format("%s:[%d:%d] %s", prefix, connection, channel, performative));
```

### FinalStaticMethod
'static' method declared `final`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonFrameLoggingHandler.java`
#### Snippet
```java
    }

    private static final void log(String prefix, int connection, int channel, Object performative, ProtonBuffer payload) {
        if (payload == null) {
            LOG.trace("{}:[{}:{}] {}", prefix, connection, channel, performative);
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `TypeMapper` has no concrete subclass
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/util/TypeMapper.java`
#### Snippet
```java
import org.apache.qpid.protonj2.test.driver.codec.primitives.Symbol;

public abstract class TypeMapper {

    private static final int DEFAULT_QUOTED_STRING_LIMIT = 64;
```

### AbstractClassNeverImplemented
Abstract class `DescribedTypeRegistry` has no concrete subclass
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/DescribedTypeRegistry.java`
#### Snippet
```java
 * Registry of described types know to the Data type codec
 */
public abstract class DescribedTypeRegistry {

    private static Map<Object, Class<? extends DescribedType>> describedTypes = new HashMap<>();
```

### AbstractClassNeverImplemented
Abstract class `Fixed0SizeConstructor` has no concrete subclass
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/TypeDecoder.java`
#### Snippet
```java

    @SuppressWarnings("unused")
    private static abstract class Fixed0SizeConstructor implements TypeConstructor {

        @Override
```

### AbstractClassNeverImplemented
Abstract class `ClientConversionSupport` has no concrete subclass
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientConversionSupport.java`
#### Snippet
```java
 * Utilities used by various classes in the Client core
 */
abstract class ClientConversionSupport {

    public static Symbol[] toSymbolArray(String[] stringArray) {
```

### AbstractClassNeverImplemented
Abstract class `IOExceptionSupport` has no concrete subclass
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/IOExceptionSupport.java`
#### Snippet
```java
 * Used to make throwing IOException instances easier.
 */
public abstract class IOExceptionSupport {

    /**
```

### AbstractClassNeverImplemented
Abstract class `ProtonStreamUtils` has no concrete subclass
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamUtils.java`
#### Snippet
```java
 * primitive types.
 */
public abstract class ProtonStreamUtils {

    private static final byte[] EMPTY_ARRAY = new byte[0];
```

### AbstractClassNeverImplemented
Abstract class `ClientMessageSupport` has no concrete subclass
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessageSupport.java`
#### Snippet
```java
 * Support methods dealing with Message types and encode or decode operations.
 */
public abstract class ClientMessageSupport {

    private static final Encoder DEFAULT_ENCODER = CodecFactory.getDefaultEncoder();
```

### AbstractClassNeverImplemented
Abstract class `ProtonBufferUtils` has no concrete subclass
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
 * primitive types.
 */
public abstract class ProtonBufferUtils {

    /**
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super ByteBuffer`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestConnector.java`
#### Snippet
```java
    private final Consumer<ByteBuffer> inputConsumer;

    public ProtonTestConnector(Consumer<ByteBuffer> frameSink) {
        this.driver = new AMQPTestDriver(getPeerName(), (frame) -> {
            processDriverOutput(frame);
```

### BoundedWildcard
Can generalize to `? super ByteBuffer`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/AMQPTestDriver.java`
#### Snippet
```java
     *      A {@link Supplier} that will provide this driver with a scheduler service for delayed actions
     */
    public AMQPTestDriver(String name, Consumer<ByteBuffer> frameConsumer, Consumer<AssertionError> assertionConsumer, Supplier<EventLoop> scheduler) {
        this.frameConsumer = frameConsumer;
        this.assertionConsumer = assertionConsumer;
```

### BoundedWildcard
Can generalize to `? super AssertionError`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/AMQPTestDriver.java`
#### Snippet
```java
     *      A {@link Supplier} that will provide this driver with a scheduler service for delayed actions
     */
    public AMQPTestDriver(String name, Consumer<ByteBuffer> frameConsumer, Consumer<AssertionError> assertionConsumer, Supplier<EventLoop> scheduler) {
        this.frameConsumer = frameConsumer;
        this.assertionConsumer = assertionConsumer;
```

### BoundedWildcard
Can generalize to `? super Integer`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/matchers/transport/TransferPayloadCompositeMatcher.java`
#### Snippet
```java
    }

    public void setPayloadLengthMatcher(Matcher<Integer> payloadLengthMatcher) {
        this.payloadLengthMatcher = payloadLengthMatcher;
    }
```

### BoundedWildcard
Can generalize to `? super Session`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientLocalTransactionContext.java`
#### Snippet
```java

    @Override
    public ClientLocalTransactionContext rollback(ClientFuture<Session> rollbackFuture, boolean startNew) throws ClientIllegalStateException {
        checkCanRollbackTransaction();

```

### BoundedWildcard
Can generalize to `? super String`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java

    @Override
    public Message<E> forEachProperty(BiConsumer<String, Object> action) {
        if (hasProperties()) {
            applicationProperties.getValue().forEach(action);
```

### BoundedWildcard
Can generalize to `? super String`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java

    @Override
    public Message<E> forEachAnnotation(BiConsumer<String, Object> action) {
        if (hasAnnotations()) {
            messageAnnotations.getValue().forEach((key, value) -> {
```

### BoundedWildcard
Can generalize to `? super Section`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java

    @Override
    public ClientMessage<E> forEachBodySection(Consumer<Section<?>> consumer) {
        if (bodySections != null) {
            bodySections.forEach(section -> {
```

### BoundedWildcard
Can generalize to `? extends Section`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java

    @Override
    public ClientMessage<E> bodySections(Collection<Section<?>> sections) {
        if (sections == null || sections.isEmpty()) {
            bodySections = null;
```

### BoundedWildcard
Can generalize to `? extends Section`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
    }

    private static Section<?> validateBodySections(int messageFormat, List<Section<?>> target, Section<?> section) {
        if (messageFormat == 0 && target != null && !target.isEmpty()) {
            switch (section.getType()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java

    @Override
    public Message<E> forEachFooter(BiConsumer<String, Object> action) {
        if (hasFooters()) {
            footer.getValue().forEach((key, value) -> {
```

### BoundedWildcard
Can generalize to `? super String`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java

    @Override
    public StreamSenderMessage forEachFooter(BiConsumer<String, Object> action) {
        if (hasFooters()) {
            footer.getValue().forEach((key, value) -> {
```

### BoundedWildcard
Can generalize to `? super String`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java

    @Override
    public StreamSenderMessage forEachAnnotation(BiConsumer<String, Object> action) {
        if (hasAnnotations()) {
            annotations.getValue().forEach((key, value) -> {
```

### BoundedWildcard
Can generalize to `? super String`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java

    @Override
    public StreamSenderMessage forEachProperty(BiConsumer<String, Object> action) {
        if (hasProperties()) {
            applicationProperties.getValue().forEach(action);
```

### BoundedWildcard
Can generalize to `? extends Section`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java

    @Override
    public StreamSenderMessage bodySections(Collection<Section<?>> sections) throws ClientException {
        Objects.requireNonNull(sections, "Cannot set body sections with a null Collection");

```

### BoundedWildcard
Can generalize to `? extends ClientException`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientSession.java`
#### Snippet
```java
    }

    Future<?> scheduleRequestTimeout(final AsyncResult<?> request, long timeout, Supplier<ClientException> errorSupplier) {
        if (timeout != INFINITE) {
            return serializer.schedule(() -> request.failed(errorSupplier.get()), timeout, TimeUnit.MILLISECONDS);
```

### BoundedWildcard
Can generalize to `? super Thread`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/TrackableThreadFactory.java`
#### Snippet
```java
     *      AtomicReference that will be updated any time a new Thread is created.
     */
    public TrackableThreadFactory(String threadName, boolean daemon, AtomicReference<Thread> threadTracker) {
        this.threadName = threadName;
        this.daemon = daemon;
```

### BoundedWildcard
Can generalize to `? super Connection`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientConnection.java`
#### Snippet
```java
    }

    private void submitDisconnectionEvent(BiConsumer<Connection, DisconnectionEvent> handler, String host, int port, ClientIOException cause) {
        if (handler != null) {
            try {
```

### BoundedWildcard
Can generalize to `? super DisconnectionEvent`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientConnection.java`
#### Snippet
```java
    }

    private void submitDisconnectionEvent(BiConsumer<Connection, DisconnectionEvent> handler, String host, int port, ClientIOException cause) {
        if (handler != null) {
            try {
```

### BoundedWildcard
Can generalize to `? super Connection`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientConnection.java`
#### Snippet
```java
    }

    private void submitConnectionEvent(BiConsumer<Connection, ConnectionEvent> handler, String host, int port, ClientIOException cause) {
        if (handler != null) {
            try {
```

### BoundedWildcard
Can generalize to `? super ConnectionEvent`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientConnection.java`
#### Snippet
```java
    }

    private void submitConnectionEvent(BiConsumer<Connection, ConnectionEvent> handler, String host, int port, ClientIOException cause) {
        if (handler != null) {
            try {
```

### BoundedWildcard
Can generalize to `? super String`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java

    @Override
    public StreamReceiverMessage forEachAnnotation(BiConsumer<String, Object> action) throws ClientException {
        if (hasAnnotations()) {
            annotations.getValue().forEach((key, value) -> {
```

### BoundedWildcard
Can generalize to `? super String`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java

    @Override
    public StreamReceiverMessage forEachFooter(BiConsumer<String, Object> action) throws ClientException {
        if (hasFooters()) {
            footer.getValue().forEach((key, value) -> {
```

### BoundedWildcard
Can generalize to `? super String`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java

    @Override
    public StreamReceiverMessage forEachProperty(BiConsumer<String, Object> action) throws ClientException {
        if (hasProperties()) {
            applicationProperties.getValue().forEach(action);
```

### BoundedWildcard
Can generalize to `? extends ReconnectLocation`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/ReconnectLocationPool.java`
#### Snippet
```java
     *        The new list of {@link ReconnectLocation} to add to the pool.
     */
    public void addAll(List<ReconnectLocation> additions) {
        if (additions != null && !additions.isEmpty()) {
            synchronized (entries) {
```

### BoundedWildcard
Can generalize to `? extends E`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessageSupport.java`
#### Snippet
```java
    //----- Internal Implementation

    private static <E> ClientMessage<E> convertFromOutsideMessage(Message<E> source) throws ClientException {
        Header header = new Header();
        header.setDurable(source.durable());
```

### BoundedWildcard
Can generalize to `? super DeliveryAnnotations`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessageSupport.java`
#### Snippet
```java

    public static Message<?> decodeMessage(Decoder decoder, DecoderState decoderState,
                                           ProtonBuffer buffer, Consumer<DeliveryAnnotations> daConsumer) throws ClientException {

        final ClientMessage<?> message = new ClientMessage<>();
```

### BoundedWildcard
Can generalize to `? super ProtonBuffer`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/Engine.java`
#### Snippet
```java
     * @return this {@link Engine}
     */
    default Engine outputConsumer(Consumer<ProtonBuffer> consumer) {
        return outputHandler((buffer, ioComplete) -> {
            consumer.accept(buffer);
```

### BoundedWildcard
Can generalize to `? super ProtonBuffer`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/Engine.java`
#### Snippet
```java
     * @return this {@link Engine}
     */
    default Engine outputHandler(EventHandler<ProtonBuffer> output) {
        return outputHandler((buffer, ioComplete) -> {
            output.handle(buffer);
```

### BoundedWildcard
Can generalize to `? extends ProtonIncomingDelivery`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSessionIncomingWindow.java`
#### Snippet
```java
    }

    private static void handleRangedDisposition(UnsettledMap<ProtonIncomingDelivery> unsettled, Disposition disposition) {
        // Dispositions cover a contiguous range in the map and since the tracker always moves forward
        // when appending new deliveries the range can wrap without needing a second iteration.
```

### BoundedWildcard
Can generalize to `? super OutgoingDelivery`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSender.java`
#### Snippet
```java

    @Override
    public Sender deliveryStateUpdatedHandler(EventHandler<OutgoingDelivery> handler) {
        this.deliveryUpdatedEventHandler = handler;
        return this;
```

### BoundedWildcard
Can generalize to `? super Sender`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSender.java`
#### Snippet
```java

    @Override
    public Sender creditStateUpdateHandler(EventHandler<Sender> handler) {
        this.linkCreditUpdatedHandler = handler;
        return this;
```

### BoundedWildcard
Can generalize to `? super OutgoingDelivery`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSender.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public Sender disposition(Predicate<OutgoingDelivery> filter, DeliveryState state, boolean settle) {
        checkLinkOperable("Cannot apply disposition");
        Objects.requireNonNull(filter, "Supplied filter cannot be null");
```

### BoundedWildcard
Can generalize to `? super AMQPHeader`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java

    @Override
    public Connection negotiate(EventHandler<AMQPHeader> remoteAMQPHeaderHandler) {
        Objects.requireNonNull(remoteAMQPHeaderHandler, "Provided AMQP Header received handler cannot be null");
        checkConnectionClosed("Cannot start header negotiation on a closed connection");
```

### BoundedWildcard
Can generalize to `? super Session`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java

    @Override
    public ProtonConnection sessionOpenHandler(EventHandler<Session> remoteSessionOpenEventHandler) {
        this.remoteSessionOpenEventHandler = remoteSessionOpenEventHandler;
        return this;
```

### BoundedWildcard
Can generalize to `? super TransactionManager`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonTransactionManager.java`
#### Snippet
```java

    @Override
    public TransactionManager parentEndpointClosedHandler(EventHandler<TransactionManager> handler) {
        this.parentEndpointClosedEventHandler = handler;
        return this;
```

### BoundedWildcard
Can generalize to `? super Transaction`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonTransactionManager.java`
#### Snippet
```java

    @Override
    public TransactionManager dischargeHandler(EventHandler<Transaction<TransactionManager>> dischargeEventHandler) {
        this.dischargeEventHandler = dischargeEventHandler;
        return this;
```

### BoundedWildcard
Can generalize to `? super Transaction`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonTransactionManager.java`
#### Snippet
```java

    @Override
    public TransactionManager declareHandler(EventHandler<Transaction<TransactionManager>> declaredEventHandler) {
        this.declareEventHandler = declaredEventHandler;
        return this;
```

### BoundedWildcard
Can generalize to `? extends ProtonOutgoingDelivery`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSessionOutgoingWindow.java`
#### Snippet
```java
    }

    private static void handleRangedDisposition(UnsettledMap<ProtonOutgoingDelivery> unsettled, Disposition disposition) {
        // Dispositions cover a contiguous range in the map and since the tracker always moves forward
        // when appending new deliveries the range can wrap without needing a second iteration.
```

### BoundedWildcard
Can generalize to `? super IncomingDelivery`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonReceiver.java`
#### Snippet
```java

    @Override
    public Receiver deliveryAbortedHandler(EventHandler<IncomingDelivery> handler) {
        this.deliveryAbortedEventHandler = handler;
        return this;
```

### BoundedWildcard
Can generalize to `? super IncomingDelivery`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonReceiver.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public Receiver disposition(Predicate<IncomingDelivery> filter, DeliveryState disposition, boolean settle) {
        checkLinkOperable("Cannot apply disposition");
        Objects.requireNonNull(filter, "Supplied filter cannot be null");
```

### BoundedWildcard
Can generalize to `? super Receiver`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonReceiver.java`
#### Snippet
```java

    @Override
    public Receiver creditStateUpdateHandler(EventHandler<Receiver> handler) {
        this.linkCreditUpdatedHandler = handler;
        return this;
```

### BoundedWildcard
Can generalize to `? super IncomingDelivery`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonReceiver.java`
#### Snippet
```java

    @Override
    public Receiver deliveryStateUpdatedHandler(EventHandler<IncomingDelivery> handler) {
        this.deliveryUpdatedEventHandler = handler;
        return this;
```

### BoundedWildcard
Can generalize to `? super IncomingDelivery`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonReceiver.java`
#### Snippet
```java

    @Override
    public Receiver deliveryReadHandler(EventHandler<IncomingDelivery> handler) {
        this.deliveryReadEventHandler = handler;
        return this;
```

### BoundedWildcard
Can generalize to `? super SaslOutcome`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/sasl/client/SaslAuthenticator.java`
#### Snippet
```java
     * @return this {@link SaslAuthenticator} instance.
     */
    public SaslAuthenticator saslComplete(EventHandler<SaslOutcome> saslCompleteEventHandler) {
        this.saslCompleteHandler = saslCompleteEventHandler;
        return this;
```

### BoundedWildcard
Can generalize to `? extends E`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/RingQueue.java`
#### Snippet
```java
     * @return the head element of this queue or a default instance created from the provided {@link Supplier}/
     */
    public E poll(Supplier<E> createOnEmpty) {
        if (isEmpty()) {
            return createOnEmpty.get();
```

### BoundedWildcard
Can generalize to `? super TransactionController`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonTransactionController.java`
#### Snippet
```java

    @Override
    public TransactionController parentEndpointClosedHandler(EventHandler<TransactionController> handler) {
        this.parentEndpointClosedEventHandler = handler;
        return self();
```

### BoundedWildcard
Can generalize to `? super Transaction`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonTransactionController.java`
#### Snippet
```java

    @Override
    public TransactionController dischargedHandler(EventHandler<Transaction<TransactionController>> dischargedEventHandler) {
        this.dischargedEventHandler = dischargedEventHandler;
        return this;
```

### BoundedWildcard
Can generalize to `? super Transaction`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonTransactionController.java`
#### Snippet
```java

    @Override
    public TransactionController declaredHandler(EventHandler<Transaction<TransactionController>> declaredEventHandler) {
        this.declaredEventHandler = declaredEventHandler;
        return this;
```

### BoundedWildcard
Can generalize to `? super Transaction`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonTransactionController.java`
#### Snippet
```java

    @Override
    public TransactionController declareFailureHandler(EventHandler<Transaction<TransactionController>> declareFailureEventHandler) {
        this.declareFailureEventHandler = declareFailureEventHandler;
        return this;
```

### BoundedWildcard
Can generalize to `? super Transaction`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonTransactionController.java`
#### Snippet
```java

    @Override
    public TransactionController dischargeFailureHandler(EventHandler<Transaction<TransactionController>> dischargeFailureEventHandler) {
        this.dischargeFailureEventHandler = dischargeFailureEventHandler;
        return this;
```

### BoundedWildcard
Can generalize to `? super Delivery`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
     * 		The action to invoke on each remove.
     */
    public void removeEach(int first, int last, Consumer<Delivery> action) {
        Objects.requireNonNull(action);

```

### BoundedWildcard
Can generalize to `? super Delivery`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
     * 		The action to invoke on each visited entry.
     */
    public void forEach(int first, int last, Consumer<Delivery> action) {
        Objects.requireNonNull(action);

```

### BoundedWildcard
Can generalize to `? super Delivery`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
    }

    public void forEach(Consumer<Delivery> action) {
        Objects.requireNonNull(action);

```

### BoundedWildcard
Can generalize to `? super Delivery`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
        }

        public UnsettledBucket(int bucketCapacity, UnsettledGetDeliveryId<Delivery> idSupplier) {
            this.deliveryIdSupplier = idSupplier;
            this.deliveries = new Object[bucketCapacity];
```

### BoundedWildcard
Can generalize to `? extends E`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
         * 		The inner {@link Map} entry that is wrapped.
         */
        public ImmutableSplayMapEntry(SplayedEntry<E> entry) {
            this.entry = entry;
        }
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `static abstract`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/TypeDecoder.java`
#### Snippet
```java
    }

    private static abstract class SmallVariableConstructor implements TypeConstructor {

        @Override
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/TypeDecoder.java`
#### Snippet
```java
    }

    private static abstract class Fixed8SizeConstructor implements TypeConstructor {

        @Override
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/TypeDecoder.java`
#### Snippet
```java
    }

    private static abstract class VariableConstructor implements TypeConstructor {

        @Override
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/TypeDecoder.java`
#### Snippet
```java
    }

    private static abstract class Fixed1SizeConstructor implements TypeConstructor {

        @Override
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/TypeDecoder.java`
#### Snippet
```java
    }

    private static abstract class Fixed16SizeConstructor implements TypeConstructor {

        @Override
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/TypeDecoder.java`
#### Snippet
```java

    @SuppressWarnings("unused")
    private static abstract class Fixed0SizeConstructor implements TypeConstructor {

        @Override
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/TypeDecoder.java`
#### Snippet
```java
    }

    private static abstract class Fixed2SizeConstructor implements TypeConstructor {

        @Override
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/TypeDecoder.java`
#### Snippet
```java
    }

    private static abstract class Fixed4SizeConstructor implements TypeConstructor {

        @Override
```

### MissortedModifiers
Missorted modifiers `final protected`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientSenderLinkType.java`
#### Snippet
```java

    @Override
    final protected Sender protonLink() {
        return protonSender;
    }
```

### MissortedModifiers
Missorted modifiers `final static`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientSender.java`
#### Snippet
```java
    //----- Internal envelope for deliveries to track potential partial sends etc.

    private final static class ClientOutgoingEnvelope implements ClientTransactionContext.Sendable {

        private final ProtonBuffer payload;
```

### MissortedModifiers
Missorted modifiers `final static`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/NoOpAsyncResult.java`
#### Snippet
```java
	 * A singleton instance of the NoOpAsyncResult for use in client operation.
	 */
    public final static NoOpAsyncResult INSTANCE = new NoOpAsyncResult();

    @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TransactionErrors.java`
#### Snippet
```java
public interface TransactionErrors {

    final static Symbol UNKNOWN_ID = Symbol.valueOf("amqp:transaction:unknown-id");

    final static Symbol TRANSACTION_ROLLBACK = Symbol.valueOf("amqp:transaction:rollback");
```

### MissortedModifiers
Missorted modifiers `final static`
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TransactionErrors.java`
#### Snippet
```java
    final static Symbol UNKNOWN_ID = Symbol.valueOf("amqp:transaction:unknown-id");

    final static Symbol TRANSACTION_ROLLBACK = Symbol.valueOf("amqp:transaction:rollback");

    final static Symbol TRANSACTION_TIMEOUT = Symbol.valueOf("amqp:transaction:timeout");
```

### MissortedModifiers
Missorted modifiers `final static`
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TransactionErrors.java`
#### Snippet
```java
    final static Symbol TRANSACTION_ROLLBACK = Symbol.valueOf("amqp:transaction:rollback");

    final static Symbol TRANSACTION_TIMEOUT = Symbol.valueOf("amqp:transaction:timeout");

}
```

### MissortedModifiers
Missorted modifiers `final static`
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TxnCapability.java`
#### Snippet
```java
    final static Symbol LOCAL_TXN = Symbol.valueOf("amqp:local-transactions");

    final static Symbol DISTRIBUTED_TXN = Symbol.valueOf("amqp:distributed-transactions");

    final static Symbol PROMOTABLE_TXN = Symbol.valueOf("amqp:promotable-transactions");
```

### MissortedModifiers
Missorted modifiers `final static`
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TxnCapability.java`
#### Snippet
```java
public interface TxnCapability {

    final static Symbol LOCAL_TXN = Symbol.valueOf("amqp:local-transactions");

    final static Symbol DISTRIBUTED_TXN = Symbol.valueOf("amqp:distributed-transactions");
```

### MissortedModifiers
Missorted modifiers `final static`
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TxnCapability.java`
#### Snippet
```java
    final static Symbol PROMOTABLE_TXN = Symbol.valueOf("amqp:promotable-transactions");

    final static Symbol MULTI_TXNS_PER_SSN = Symbol.valueOf("amqp:multi-txns-per-ssn");

    final static Symbol MULTI_SSNS_PER_TXN = Symbol.valueOf("amqp:multi-ssns-per-txn");
```

### MissortedModifiers
Missorted modifiers `final static`
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TxnCapability.java`
#### Snippet
```java
    final static Symbol DISTRIBUTED_TXN = Symbol.valueOf("amqp:distributed-transactions");

    final static Symbol PROMOTABLE_TXN = Symbol.valueOf("amqp:promotable-transactions");

    final static Symbol MULTI_TXNS_PER_SSN = Symbol.valueOf("amqp:multi-txns-per-ssn");
```

### MissortedModifiers
Missorted modifiers `final static`
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transactions/TxnCapability.java`
#### Snippet
```java
    final static Symbol MULTI_TXNS_PER_SSN = Symbol.valueOf("amqp:multi-txns-per-ssn");

    final static Symbol MULTI_SSNS_PER_TXN = Symbol.valueOf("amqp:multi-ssns-per-txn");

}
```

### MissortedModifiers
Missorted modifiers `default public`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferAllocator.java`
#### Snippet
```java

    @Override
    default public void close() {
        // Default has no action to take
    }
```

### MissortedModifiers
Missorted modifiers `final static`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
    }

    private final static class ProtonByteCursorAdapter implements ByteCursor {

        private final ProtonBufferIterator iterator;
```

### MissortedModifiers
Missorted modifiers `final static`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/sasl/ProtonEngineSaslDriver.java`
#### Snippet
```java
     * Default max frame size value used by this engine SASL driver if not otherwise configured.
     */
    public final static int DEFAULT_MAX_SASL_FRAME_SIZE = 4096;

    /*
```

### MissortedModifiers
Missorted modifiers `final static`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/sasl/ProtonEngineSaslDriver.java`
#### Snippet
```java
     * The specification define lower bound for SASL frame size.
     */
    private final static int MIN_MAX_SASL_FRAME_SIZE = 512;

    private final ProtonSaslHandler handler;
```

## RuleId[ruleID=NegativeIntConstantInLongContext]
### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
            if (next >= 0) {
                currentBucket = (int) (next >> 32);
                readOffset = (int) (next & 0xFFFFFFFF);
            } else {
                readOffset = -1;
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoderState.java`
#### Snippet
```java
        final byte[] trailingBytes = new byte[length - offset];
        trailingBytes[0] = stoppageByte;
        stream.read(trailingBytes, 1, trailingBytes.length - 1);
        ByteBuffer byteBuffer = ByteBuffer.wrap(trailingBytes);

```

### IgnoreResultOfCall
Result of `InputStream.skip()` is ignored
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamUtils.java`
#### Snippet
```java
    public static InputStream skipBytes(InputStream stream, long amount) {
        try {
            stream.skip(amount);
        } catch (IOException ex) {
            throw new DecodeException(
```

### IgnoreResultOfCall
Result of `InputStream.skip()` is ignored
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractStringTypeDecoder.java`
#### Snippet
```java
    public void skipValue(InputStream stream, StreamDecoderState state) throws DecodeException {
        try {
            stream.skip(readSize(stream));
        } catch (IOException ex) {
            throw new DecodeException("Error while reading String payload bytes", ex);
```

### IgnoreResultOfCall
Result of `InputStream.skip()` is ignored
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractMapTypeDecoder.java`
#### Snippet
```java
    public void skipValue(InputStream stream, StreamDecoderState state) throws DecodeException {
        try {
            stream.skip(readSize(stream));
        } catch (IOException ex) {
            throw new DecodeException("Error while reading Map payload bytes", ex);
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractSymbolTypeDecoder.java`
#### Snippet
```java

        try {
            stream.read(symbolBytes);
        } catch (IOException ex) {
            throw new DecodeException("Error while reading Symbol payload bytes", ex);
```

### IgnoreResultOfCall
Result of `InputStream.skip()` is ignored
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractSymbolTypeDecoder.java`
#### Snippet
```java
    public void skipValue(InputStream stream, StreamDecoderState state) throws DecodeException {
        try {
            stream.skip(readSize(stream));
        } catch (IOException ex) {
            throw new DecodeException("Error while reading Symbol payload bytes", ex);
```

### IgnoreResultOfCall
Result of `InputStream.skip()` is ignored
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractListTypeDecoder.java`
#### Snippet
```java
    public void skipValue(InputStream stream, StreamDecoderState state) throws DecodeException {
        try {
            stream.skip(readSize(stream));
        } catch (IOException ex) {
            throw new DecodeException("Error while reading List payload bytes", ex);
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractBinaryTypeDecoder.java`
#### Snippet
```java

        try {
            stream.read(payload);
        } catch (IOException ex) {
            throw new DecodeException("Error while reading Binary payload bytes", ex);
```

### IgnoreResultOfCall
Result of `InputStream.skip()` is ignored
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractBinaryTypeDecoder.java`
#### Snippet
```java
    public void skipValue(InputStream stream, StreamDecoderState state) throws DecodeException {
        try {
            stream.skip(readSize(stream));
        } catch (IOException ex) {
            throw new DecodeException("Error while reading Binary payload bytes", ex);
```

## RuleId[ruleID=FunctionalExpressionCanBeFolded]
### FunctionalExpressionCanBeFolded
Lambda can be replaced with call qualifier
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
        if (bodySections != null) {
            bodySections.forEach(section -> {
                consumer.accept(section);
            });
        } else {
```

## RuleId[ruleID=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/transport/Attach.java`
#### Snippet
```java

    public boolean isReceiver() {
        return getRole().booleanValue() == true;
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/transport/Attach.java`
#### Snippet
```java

    public boolean isSender() {
        return getRole().booleanValue() == false;
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/AttachInjectAction.java`
#### Snippet
```java

    public AttachInjectAction withRcvSettleMode(Byte rcvSettleMode) {
        attach.setReceiverSettleMode(rcvSettleMode == null ? null : UnsignedByte.valueOf(rcvSettleMode.byteValue()));
        return this;
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/AttachInjectAction.java`
#### Snippet
```java

    public AttachInjectAction withSndSettleMode(Byte sndSettleMode) {
        attach.setSenderSettleMode(sndSettleMode == null ? null : UnsignedByte.valueOf(sndSettleMode.byteValue()));
        return this;
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/matchers/messaging/PropertiesMatcher.java`
#### Snippet
```java
            return withGroupSequence(nullValue());
        } else {
            return withGroupSequence(equalTo(UnsignedInteger.valueOf(groupSequence.longValue())));
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/matchers/transport/AttachMatcher.java`
#### Snippet
```java

    public AttachMatcher withRcvSettleMode(Byte rcvSettleMode) {
        return withRcvSettleMode(rcvSettleMode == null ? nullValue() : equalTo(UnsignedByte.valueOf(rcvSettleMode.byteValue())));
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/matchers/transport/AttachMatcher.java`
#### Snippet
```java

    public AttachMatcher withSndSettleMode(Byte sndSettleMode) {
        return withSndSettleMode(sndSettleMode == null ? nullValue() : equalTo(UnsignedByte.valueOf(sndSettleMode.byteValue())));
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/expectations/AttachExpectation.java`
#### Snippet
```java

    public AttachExpectation withRcvSettleMode(Byte rcvSettleMode) {
        return withRcvSettleMode(rcvSettleMode == null ? nullValue() : equalTo(UnsignedByte.valueOf(rcvSettleMode.byteValue())));
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/expectations/AttachExpectation.java`
#### Snippet
```java

    public AttachExpectation withSndSettleMode(Byte sndSettleMode) {
        return withSndSettleMode(sndSettleMode == null ? nullValue() : equalTo(UnsignedByte.valueOf(sndSettleMode.byteValue())));
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/LongTypeEncoder.java`
#### Snippet
```java
        buffer.writeByte(EncodingCodes.LONG);
        for (Object value : values) {
            buffer.writeLong(((Long) value).longValue());
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/CharacterTypeEncoder.java`
#### Snippet
```java
        buffer.writeByte(EncodingCodes.CHAR);
        for (Object charValue : values) {
            buffer.writeInt(((Character) charValue).charValue() & 0xffff);
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/CharacterTypeEncoder.java`
#### Snippet
```java
    public void writeType(ProtonBuffer buffer, EncoderState state, Character value) {
        buffer.writeByte(EncodingCodes.CHAR);
        buffer.writeInt(value.charValue() & 0xffff);
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/IntegerTypeEncoder.java`
#### Snippet
```java
        buffer.writeByte(EncodingCodes.INT);
        for (Object value : values) {
            buffer.writeInt(((Integer) value).intValue());
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/FloatTypeEncoder.java`
#### Snippet
```java
    public void writeType(ProtonBuffer buffer, EncoderState state, Float value) {
        buffer.writeByte(EncodingCodes.FLOAT);
        buffer.writeFloat(value.floatValue());
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/FloatTypeEncoder.java`
#### Snippet
```java
        buffer.writeByte(EncodingCodes.FLOAT);
        for (Object value : values) {
            buffer.writeFloat(((Float) value).floatValue());
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/ShortTypeEncoder.java`
#### Snippet
```java
        buffer.writeByte(EncodingCodes.SHORT);
        for (Object value : values) {
            buffer.writeShort(((Short) value).shortValue());
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/ShortTypeEncoder.java`
#### Snippet
```java
    public void writeType(ProtonBuffer buffer, EncoderState state, Short value) {
        buffer.writeByte(EncodingCodes.SHORT);
        buffer.writeShort(value.shortValue());
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/ByteTypeEncoder.java`
#### Snippet
```java
    public void writeType(ProtonBuffer buffer, EncoderState state, Byte value) {
        buffer.writeByte(EncodingCodes.BYTE);
        buffer.writeByte(value.byteValue());
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/ByteTypeEncoder.java`
#### Snippet
```java
        buffer.writeByte(EncodingCodes.BYTE);
        for (Object byteVal : values) {
            buffer.writeByte(((Byte) byteVal).byteValue());
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/DoubleTypeEncoder.java`
#### Snippet
```java
        buffer.writeByte(EncodingCodes.DOUBLE);
        for (Object value : values) {
            buffer.writeDouble(((Double) value).doubleValue());
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/DoubleTypeEncoder.java`
#### Snippet
```java
    public void writeType(ProtonBuffer buffer, EncoderState state, Double value) {
        buffer.writeByte(EncodingCodes.DOUBLE);
        buffer.writeDouble(value.doubleValue());
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/DeliveryTag.java`
#### Snippet
```java
            }

            return hashCode.intValue();
        }

```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `isJavaPrimitive()` is identical to its super method
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/Array32TypeDecoder.java`
#### Snippet
```java

    @Override
    public boolean isJavaPrimitive() {
        return false;
    }
```

### RedundantMethodOverride
Method `getListEncoding()` is identical to its super method
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/messaging/SourceTypeEncoder.java`
#### Snippet
```java

    @Override
    public byte getListEncoding(Source value) {
        return EncodingCodes.LIST32;
    }
```

### RedundantMethodOverride
Method `getListEncoding()` is identical to its super method
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/messaging/TargetTypeEncoder.java`
#### Snippet
```java

    @Override
    public byte getListEncoding(Target value) {
        return EncodingCodes.LIST32;
    }
```

### RedundantMethodOverride
Method `getListEncoding()` is identical to its super method
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/messaging/PropertiesTypeEncoder.java`
#### Snippet
```java

    @Override
    public byte getListEncoding(Properties value) {
        return EncodingCodes.LIST32;
    }
```

### RedundantMethodOverride
Method `getListEncoding()` is identical to its super method
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/transport/ErrorConditionTypeEncoder.java`
#### Snippet
```java

    @Override
    public byte getListEncoding(ErrorCondition value) {
        return EncodingCodes.LIST32;
    }
```

### RedundantMethodOverride
Method `getListEncoding()` is identical to its super method
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/transport/OpenTypeEncoder.java`
#### Snippet
```java

    @Override
    public byte getListEncoding(Open value) {
        return EncodingCodes.LIST32;
    }
```

### RedundantMethodOverride
Method `getListEncoding()` is identical to its super method
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/transport/AttachTypeEncoder.java`
#### Snippet
```java

    @Override
    public byte getListEncoding(Attach value) {
        return EncodingCodes.LIST32;
    }
```

### RedundantMethodOverride
Method `getListEncoding()` is identical to its super method
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/transport/BeginTypeEncoder.java`
#### Snippet
```java

    @Override
    public byte getListEncoding(Begin value) {
        return EncodingCodes.LIST32;
    }
```

### RedundantMethodOverride
Method `getListEncoding()` is identical to its super method
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/transactions/TransactionStateTypeEncoder.java`
#### Snippet
```java

    @Override
    public byte getListEncoding(TransactionalState value) {
        return EncodingCodes.LIST32;
    }
```

### RedundantMethodOverride
Method `compareTo()` is identical to its super method
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty5ToProtonBufferAdapter.java`
#### Snippet
```java

    @Override
    public int compareTo(ProtonBuffer buffer) {
        return ProtonBufferUtils.compare(this, buffer);
    }
```

### RedundantMethodOverride
Method `compareTo()` is identical to its super method
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty4ToProtonBufferAdapter.java`
#### Snippet
```java

    @Override
    public int compareTo(ProtonBuffer buffer) {
        return ProtonBufferUtils.compare(this, buffer);
    }
```

### RedundantMethodOverride
Method `engineStarting()` is identical to its super method
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEnginePipeline.java`
#### Snippet
```java

        @Override
        public void engineStarting(EngineHandlerContext context) {
        }

```

### RedundantMethodOverride
Method `setNextTagId()` is identical to its super method
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonPooledTagGenerator.java`
#### Snippet
```java
     */
    @Override
    void setNextTagId(long nextIdValue) {
        this.nextTagId = nextIdValue;
    }
```

## RuleId[ruleID=MalformedFormatString]
### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientLinkType.java`
#### Snippet
```java
            } else {
                request.failed(new ClientIllegalStateException(
                    String.format("{} closed without a specific error condition", protonLink.isSender() ? "Sender" : "Receiver")));
            }
            return false;
```

## RuleId[ruleID=ThrowFromFinallyBlock]
### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                    stream.reset();
                } catch (IOException e) {
                    throw new DecodeException("Error while resetting marked stream", e);
                }
            }
```

## RuleId[ruleID=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonByteArrayBuffer.java`
#### Snippet
```java
        final ProtonByteArrayBuffer result;

        if (readOnly && isReadOnly()) {
            result = new ProtonByteArrayBuffer(array, offset(offset), length, implicitGrowthLimit);
            result.writeOffset = length;
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/matchers/messaging/DeliveryAnnotationsMatcher.java`
#### Snippet
```java

    public Object getReceivedAnnotation(Symbol key) {
        Map<Object, Object> receivedFields = super.getReceivedFields();

        return receivedFields.get(key);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/matchers/messaging/DeliveryAnnotationsMatcher.java`
#### Snippet
```java
        validateType(key);

        Map<Object, Object> receivedFields = super.getReceivedFields();

        if (receivedFields != null) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/matchers/messaging/MessageAnnotationsMatcher.java`
#### Snippet
```java

    public Object getReceivedAnnotation(Symbol key) {
        Map<Object, Object> receivedFields = super.getReceivedFields();

        return receivedFields.get(key);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/matchers/messaging/MessageAnnotationsMatcher.java`
#### Snippet
```java
        validateType(key);

        Map<Object, Object> receivedFields = super.getReceivedFields();

        if (receivedFields != null) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/matchers/messaging/FooterMatcher.java`
#### Snippet
```java

    public Object getReceivedAnnotation(Symbol key) {
        Map<Object, Object> receivedFields = super.getReceivedFields();

        return receivedFields.get(key);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/matchers/messaging/FooterMatcher.java`
#### Snippet
```java
        validateType(key);

        Map<Object, Object> receivedFields = super.getReceivedFields();

        if (receivedFields != null) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        @Override
        SplayedEntry<V> getHigherEntry(int key) {
            return super.entrySuccessor(key);
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        @Override
        SplayedEntry<V> getFloorEntry(int key) {
            return super.entryOrPredecessor(key);
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        @Override
        SplayedEntry<V> getCeilingEntry(int key) {
            return super.entryOrSuccessor(key);
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        @Override
        SplayedEntry<V> getLowestEntry() {
            return super.lowestPossibleEntry();
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        @Override
        SplayedEntry<V> getFloorEntry(int key) {
            return super.entryOrSuccessor(key);
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        @Override
        SplayedEntry<V> getHighestEntry() {
            return super.highestPossibleEntry();
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        @Override
        SplayedEntry<V> getLowerEntry(int key) {
            return super.entryOrSuccessor(key);
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        @Override
        SplayedEntry<V> getLowerEntry(int key) {
            return super.entryPredecessor(key);
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        @Override
        SplayedEntry<V> getHighestEntry() {
            return super.lowestPossibleEntry();
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        @Override
        SplayedEntry<V> getHigherEntry(int key) {
            return super.entryPredecessor(key);
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        @Override
        SplayedEntry<V> getCeilingEntry(int key) {
            return super.entryPredecessor(key);
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        @Override
        SplayedEntry<V> getLowestEntry() {
            return super.highestPossibleEntry();
        }

```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`bucket.writeOffset = bucket.writeOffset - removals` could be simplified to 'bucket.writeOffset -= removals'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
            Arrays.fill(bucket.deliveries, bucket.writeOffset - removals, bucket.writeOffset, null);

            bucket.writeOffset = bucket.writeOffset - removals;
            bucket.entries -= removals;
            bucket.highestDeliveryId = bucket.entryIdAt(bucket.writeOffset - 1);
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/FrameDecoder.java`
#### Snippet
```java

    private FrameParserStage transitionToFrameBufferingStage(int frameSize) {
        return stage = frameBufferingStage.reset(frameSize);
    }

```

### NestedAssignment
Result of assignment expression used
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/FrameDecoder.java`
#### Snippet
```java

    private FrameParserStage transitionToFrameSizeParsingStage() {
        return stage = frameSizeParser.reset(0);
    }

```

### NestedAssignment
Result of assignment expression used
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/FrameDecoder.java`
#### Snippet
```java

    private FrameParserStage initializeFrameBodyParsingStage(int frameSize) {
        return stage = frameBodyParsingStage.reset(frameSize);
    }

```

### NestedAssignment
Result of assignment expression used
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/primitives/Symbol.java`
#### Snippet
```java
            if (underlying.remaining() <= MAX_CACHED_SYMBOL_SIZE) {
                final Symbol existing;
                if ((existing = stringToSymbols.putIfAbsent(symbolString, this)) != null) {
                    symbolString = existing.symbolString;
                }
```

### NestedAssignment
Result of assignment expression used
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/primitives/Symbol.java`
#### Snippet
```java
            if (symbolBuffer.remaining() <= MAX_CACHED_SYMBOL_SIZE) {
                final Symbol existing;
                if ((existing = bufferToSymbols.putIfAbsent(symbolBuffer, symbol)) != null) {
                    symbol = existing;
                }
```

### NestedAssignment
Result of assignment expression used
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/NettyServer.java`
#### Snippet
```java

                    if (isSecureServer()) {
                        ch.pipeline().addLast(sslHandler = SslSupport.createServerSslHandler(null, options));
                    }

```

### NestedAssignment
Result of assignment expression used
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientDelivery.java`
#### Snippet
```java
        if (message == null && payload.isReadable()) {
            try (payload) {
                message = (Message<E>)(cachedMessage = ClientMessageSupport.decodeMessage(payload, this::deliveryAnnotations));
            }
        }
```

### NestedAssignment
Result of assignment expression used
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientLocalTransactionContext.java`
#### Snippet
```java
            } else if (outcome == null) {
                DeliveryState txnOutcome = cachedSenderOutcome != null ?
                    cachedSenderOutcome : (cachedSenderOutcome = new TransactionalState().setTxnId(currentTxn.getTxnId()));
                sendable.send(txnOutcome, settled);
            } else {
```

### NestedAssignment
Result of assignment expression used
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientLocalTransactionContext.java`
#### Snippet
```java
            if (outcome instanceof Accepted) {
                txnOutcome = cachedReceiverOutcome != null ? cachedReceiverOutcome :
                    (cachedReceiverOutcome = new TransactionalState().setTxnId(currentTxn.getTxnId()).setOutcome(Accepted.getInstance()));
            } else {
                txnOutcome = new TransactionalState().setTxnId(currentTxn.getTxnId()).setOutcome((Outcome) outcome);
```

### NestedAssignment
Result of assignment expression used
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientRedirect.java`
#### Snippet
```java
            return cachedURI;
        } else {
            return cachedURI = new URI(getScheme(), null, getNetworkHost(), getPort(), getPath(), null, null);
        }
    }
```

### NestedAssignment
Result of assignment expression used
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientRemoteSource.java`
#### Snippet
```java
    public Map<String, String> filters() {
        if (cachedFilters == null && remoteSource.getFilter() != null) {
            final Map<String, String> result = cachedFilters = new LinkedHashMap<>();
            remoteSource.getFilter().forEach((key, value) -> {
                result.put(key.toString(), value.toString());
```

### NestedAssignment
Result of assignment expression used
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamDelivery.java`
#### Snippet
```java

        if (message == null) {
            message = new ClientStreamReceiverMessage(receiver, this, rawInputStream = new RawDeliveryInputStream());
        }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
        ProtonStreamDecoderState state = singleThreadedState;
        if (state == null) {
            singleThreadedState = state = newDecoderState();
        }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
        ProtonDecoderState state = singleThreadedState;
        if (state == null) {
            singleThreadedState = state = newDecoderState();
        }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/ProtonEncoderState.java`
#### Snippet
```java
                int low;

                if ((++i == remaining) || ((low = value.charAt(i)) & 0xDC00) != 0xDC00) {
                    throw new IllegalArgumentException("String contains invalid Unicode code points");
                }
```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/ProtonEncoderState.java`
#### Snippet
```java

        // ASCII Optimized path U+0000..U+007F
        for (; index < length && (ch = sequence.charAt(index)) < 0x80; ++index) {
            buffer.setByte(position++, (byte) ch);
        }
```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/ProtonEncoder.java`
#### Snippet
```java
        ProtonEncoderState state = singleThreadedState;
        if (state == null) {
            singleThreadedState = state = newEncoderState();
        }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/Symbol.java`
#### Snippet
```java
            if (symbolBuffer.getReadableBytes() <= MAX_CACHED_SYMBOL_SIZE) {
                final Symbol existing;
                if ((existing = bufferToSymbols.putIfAbsent(symbolBuffer, symbol)) != null) {
                    symbol = existing;
                }
```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/Symbol.java`
#### Snippet
```java
            if (underlying.getReadableBytes() <= MAX_CACHED_SYMBOL_SIZE) {
                final Symbol existing;
                if ((existing = stringToSymbols.putIfAbsent(symbolString, this)) != null) {
                    symbolString = existing.symbolString;
                }
```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/messaging/Data.java`
#### Snippet
```java
            return cachedBinary;
        } else {
            return cachedBinary = new Binary(buffer.copy(true));
        }
    }
```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty4ToProtonBufferAdapter.java`
#### Snippet
```java

        // Update our state to keep in touch with the ByteBuf state
        writeCapacity = readCapacity = resource.capacity();

        return this;
```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
        @Override
        public T first() {
            return (current = accessor.first()) != null ? (T) this : null;
        }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonTransaction.java`
#### Snippet
```java
    @Override
    public ProtonAttachments getAttachments() {
        return attachments == null ? attachments = new ProtonAttachments() : attachments;
    }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonIncomingDelivery.java`
#### Snippet
```java
            }

            bytesRead = claimedBytes -= bytesRead;
            if (bytesRead < 0) {
                claimedBytes = 0;
```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonIncomingDelivery.java`
#### Snippet
```java
        ProtonBuffer result = null;
        if (payload != null) {
            final int bytesRead = claimedBytes -= payload.getReadableBytes();
            result = payload.transfer();
            payload = null;
```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonIncomingDelivery.java`
#### Snippet
```java
    @Override
    public ProtonAttachments getAttachments() {
        return attachments == null ? attachments = new ProtonAttachments() : attachments;
    }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonIncomingDelivery.java`
#### Snippet
```java
            }

            bytesRead = claimedBytes -= bytesRead;
            if (claimedBytes < 0) {
                claimedBytes = 0;
```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonFrameDecodingHandler.java`
#### Snippet
```java

    private FrameParserStage transitionToFrameBufferingStage(int length) {
        return stage = frameBufferingStage.reset(length);
    }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonFrameDecodingHandler.java`
#### Snippet
```java

    private FrameParserStage initializeFrameBodyParsingStage(int length) {
        return stage = frameBodyParsingStage.reset(length);
    }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonFrameDecodingHandler.java`
#### Snippet
```java

    private FrameParserStage transitionToFrameSizeParsingStage() {
        return stage = frameSizeParser.reset(0);
    }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSender.java`
#### Snippet
```java
    @Override
    public boolean isSendable() {
        return sendable = sendable && sessionWindow.isSendable();
    }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonLinkCreditState.java`
#### Snippet
```java

    int incrementDeliveryCount(int amount) {
        return deliveryCount += amount;
    }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonOutgoingDelivery.java`
#### Snippet
```java
    @Override
    public ProtonAttachments getAttachments() {
        return attachments == null ? attachments = new ProtonAttachments() : attachments;
    }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java

            for (count = 0; count < composingBuffers.length && length > 0; ++count) {
                if ((length -= composingBuffers[count].remaining()) < 0) {
                    final ByteBuffer buffer = composingBuffers[count];
                    buffer.limit(buffer.limit() + length);
```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEndpoint.java`
#### Snippet
```java
    @Override
    public ProtonAttachments getAttachments() {
        return attachments == null ? attachments = new ProtonAttachments() : attachments;
    }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/sasl/ProtonSaslContext.java`
#### Snippet
```java
    @Override
    public ProtonAttachments getAttachments() {
        return attachments == null ? attachments = new ProtonAttachments() : attachments;
    }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSessionOutgoingWindow.java`
#### Snippet
```java
        pendingOutgoingWrites = Math.max(0, --pendingOutgoingWrites);

        if (!writeable && (writeable = pendingOutgoingWrites <= outgoingWindowLowWaterMark && remoteIncomingWindow > 0)) {
            Set<ProtonSender> senders = session.senders();
            for (ProtonSender sender : senders) {
```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSessionOutgoingWindow.java`
#### Snippet
```java
        if (outgoingCapacity == 0) {
            // At a setting of zero outgoing writes is manually disabled until elevated again to > 0
            outgoingWindowHighWaterMark = outgoingWindowLowWaterMark = 0;
            writeable = false;
        } else if (outgoingCapacity > 0) {
```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/LinkedSplayMap.java`
#### Snippet
```java
            nextNode = entry.linkNext;

            return lastReturned = entry;
        }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/LinkedSplayMap.java`
#### Snippet
```java
            nextNode = nextNode.linkPrev;

            return lastReturned = entry;
        }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/LinkedSplayMap.java`
#### Snippet
```java
        deletedEntry.linkNext.linkPrev = deletedEntry.linkPrev;
        deletedEntry.linkPrev.linkNext = deletedEntry.linkNext;
        deletedEntry.linkNext = deletedEntry.linkPrev = null;
    }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/LinkedSplayMap.java`
#### Snippet
```java

        // Unlink all the entries and reset to no insertions state
        entries.linkNext = entries.linkPrev = entries;
    }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java

            for (int i = 0; i <= current; ++i) {
                if (buckets[i].isInRange(deliveryId) && (result = buckets[i].remove(deliveryId)) != null) {
                    totalEntries--;
                    modCount++;
```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
            final UnsettledBucket<Delivery> bucket = buckets[i];

            for (int j = removeStart = removeEnd = bucket.readOffset; j < bucket.writeOffset && !foundLast; ) {
                final Delivery delivery = bucket.entryAt(j);
                final int deliveryId = deliveryIdSupplier.getDeliveryId(delivery);
```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
            final UnsettledBucket<Delivery> bucket = buckets[i];

            for (int j = removeStart = removeEnd = bucket.readOffset; j < bucket.writeOffset && !foundLast; ) {
                final Delivery delivery = bucket.entryAt(j);
                final int deliveryId = deliveryIdSupplier.getDeliveryId(delivery);
```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
                    removeEnd = ++j;
                } else {
                    removeStart = removeEnd = ++j;
                }
            }
```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
        }

        current = totalEntries = 0;
    }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
            // Be optimistic and assume the result is in the first entry and then if not search
            // beyond that entry for the result.
            if (deliveryIdSupplier.getDeliveryId(delivery = (Delivery) deliveries[readOffset]) == deliveryId) {
                return delivery;
            } else {
```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        public NavigableMap<UnsignedInteger, V> descendingMap() {
            return ascendingMapView != null ? ascendingMapView :
                (ascendingMapView = new AscendingSubMap<>(backingMap,
                    fromStart, startKey, startInclusive, toEnd, endKey, endInclusive));
        }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        public final NavigableSet<UnsignedInteger> navigableKeySet() {
            return (navigableSubMapKeySet != null) ?
                navigableSubMapKeySet : (navigableSubMapKeySet = new NavigableSubMapKeySet(this));
        }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        public Set<Entry<UnsignedInteger, V>> entrySet() {
            return navigableEntrySet != null ?
                navigableEntrySet : (navigableEntrySet = new AscendingNavigableSubMapEntrySet());
        }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java

        // Clear node before moving to cache
        node.left = node.right = node.parent = null;
        entryPool.offer(node);

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java

        // Clear node before moving to cache
        node.left = node.right = node.parent = null;
        entryPool.offer(node);

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
    public NavigableMap<UnsignedInteger, E> descendingMap() {
        return (descendingMapView != null) ? descendingMapView :
               (descendingMapView = new DescendingSubMap<>(this,
                    true, 0, true,
                    true, UnsignedInteger.MAX_VALUE.intValue(), true));
    }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        public Set<Entry<UnsignedInteger, V>> entrySet() {
            return navigableEntrySet != null ?
                navigableEntrySet : (navigableEntrySet = new DescendingNavigableSubMapEntrySet());
        }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        public NavigableMap<UnsignedInteger, V> descendingMap() {
            return descendingMapView != null ? descendingMapView :
                (descendingMapView = new DescendingSubMap<>(backingMap,
                    fromStart, startKey, startInclusive, toEnd, endKey, endInclusive));
        }

```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
                // than the element we are looking for so it goes to the right tree.
                if (greaterThanKeyRoot == null) {
                    greaterThanKeyRoot = greaterThanKeyNode = root;
                } else {
                    greaterThanKeyNode.left = root;
```

### NestedAssignment
Result of assignment expression used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
                // than the element we are looking for so it goes to the left tree.
                if (lessThanKeyRoot == null) {
                    lessThanKeyRoot = lessThanKeyNode = root;
                } else {
                    lessThanKeyNode.right = root;
```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestConnector.java`
#### Snippet
```java

    public ProtonTestConnector(Consumer<ByteBuffer> frameSink) {
        this.driver = new AMQPTestDriver(getPeerName(), (frame) -> {
            processDriverOutput(frame);
        }, null);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/SessionTracker.java`
#### Snippet
```java
    public LinkTracker getLastRemotelyOpenedLink() {
        final AtomicReference<LinkTracker> linkTracker = new AtomicReference<>();
        remoteLinks.forEach((key, value) -> {
            linkTracker.set(value);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/SessionTracker.java`
#### Snippet
```java
    public LinkTracker getLastOpenedLink() {
        final AtomicReference<LinkTracker> linkTracker = new AtomicReference<>();
        localLinks.forEach((key, value) -> {
            linkTracker.set(value);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestServer.java`
#### Snippet
```java
                super.sendAMQPFrame(channel, performative, payload, splitWrite);
            } else {
                loop.execute(() -> {
                    super.sendAMQPFrame(channel, performative, payload, splitWrite);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestServer.java`
#### Snippet
```java
                super.deferHeader(header);
            } else {
                loop.execute(() -> {
                    super.deferHeader(header);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestServer.java`
#### Snippet
```java
                super.sendEmptyFrame(channel);
            } else {
                loop.execute(() -> {
                    super.sendEmptyFrame(channel);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestServer.java`
#### Snippet
```java
                super.sendHeader(header);
            } else {
                loop.execute(() -> {
                    super.sendHeader(header);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestServer.java`
#### Snippet
```java
                super.deferAMQPFrame(channel, performative, payload, splitWrite);
            } else {
                loop.execute(() -> {
                    super.deferAMQPFrame(channel, performative, payload, splitWrite);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestServer.java`
#### Snippet
```java
                super.deferSaslFrame(channel, performative);
            } else {
                loop.execute(() -> {
                    super.deferSaslFrame(channel, performative);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestServer.java`
#### Snippet
```java
                super.sendSaslFrame(channel, performative);
            } else {
                loop.execute(() -> {
                    super.sendSaslFrame(channel, performative);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestClient.java`
#### Snippet
```java
                super.sendAMQPFrame(channel, performative, payload, splitWrite);
            } else {
                loop.execute(() -> {
                    super.sendAMQPFrame(channel, performative, payload, splitWrite);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestClient.java`
#### Snippet
```java
                super.deferSaslFrame(channel, performative);
            } else {
                loop.execute(() -> {
                    super.deferSaslFrame(channel, performative);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestClient.java`
#### Snippet
```java
                super.sendEmptyFrame(channel);
            } else {
                loop.execute(() -> {
                    super.sendEmptyFrame(channel);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestClient.java`
#### Snippet
```java
                super.deferAMQPFrame(channel, performative, payload, splitWrite);
            } else {
                loop.execute(() -> {
                    super.deferAMQPFrame(channel, performative, payload, splitWrite);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestClient.java`
#### Snippet
```java
                super.sendSaslFrame(channel, performative);
            } else {
                loop.execute(() -> {
                    super.sendSaslFrame(channel, performative);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestClient.java`
#### Snippet
```java
                super.sendHeader(header);
            } else {
                loop.execute(() -> {
                    super.sendHeader(header);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestClient.java`
#### Snippet
```java
                super.deferHeader(header);
            } else {
                loop.execute(() -> {
                    super.deferHeader(header);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/util/TypeMapper.java`
#### Snippet
```java
        if (stringsMap != null) {
            result = new HashMap<>(stringsMap.size());
            stringsMap.forEach((key, value) -> {
                result.put(Symbol.valueOf(key), value);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/NettyClient.java`
#### Snippet
```java
                HttpHeaders headers = HttpHeaders.newHeaders();

                options.getHttpHeaders().forEach((key, value) -> {
                    headers.set(key, value);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientRemoteSource.java`
#### Snippet
```java
        if (cachedFilters == null && remoteSource.getFilter() != null) {
            final Map<String, String> result = cachedFilters = new LinkedHashMap<>();
            remoteSource.getFilter().forEach((key, value) -> {
                result.put(key.toString(), value.toString());
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientConversionSupport.java`
#### Snippet
```java
        if (stringsSet != null) {
            result = new LinkedHashSet<>(stringsSet.size());
            stringsSet.forEach((entry) -> {
                result.add(Symbol.valueOf(entry));
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientConversionSupport.java`
#### Snippet
```java
        if (symbolMap != null) {
            result = new LinkedHashMap<>(symbolMap.size());
            symbolMap.forEach((key, value) -> {
                result.put(key.toString(), value);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientConversionSupport.java`
#### Snippet
```java
        if (stringsMap != null) {
            result = new HashMap<>(stringsMap.size());
            stringsMap.forEach((key, value) -> {
                result.put(Symbol.valueOf(key), value);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientSender.java`
#### Snippet
```java
    void disposition(OutgoingDelivery delivery, DeliveryState state, boolean settled) throws ClientException {
        checkClosedOrFailed();
        executor.execute(() -> {
            delivery.disposition(state, settled);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
    public Message<E> forEachAnnotation(BiConsumer<String, Object> action) {
        if (hasAnnotations()) {
            messageAnnotations.getValue().forEach((key, value) -> {
                action.accept(key.toString(), value);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
    public ClientMessage<E> forEachBodySection(Consumer<Section<?>> consumer) {
        if (bodySections != null) {
            bodySections.forEach(section -> {
                consumer.accept(section);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
    public Message<E> forEachFooter(BiConsumer<String, Object> action) {
        if (hasFooters()) {
            footer.getValue().forEach((key, value) -> {
                action.accept(key.toString(), value);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java
    public StreamSenderMessage forEachFooter(BiConsumer<String, Object> action) {
        if (hasFooters()) {
            footer.getValue().forEach((key, value) -> {
                action.accept(key.toString(), value);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java
    public StreamSenderMessage forEachAnnotation(BiConsumer<String, Object> action) {
        if (hasAnnotations()) {
            annotations.getValue().forEach((key, value) -> {
                action.accept(key.toString(), value);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/WebSocketTransport.java`
#### Snippet
```java
            DefaultHttpHeaders headers = new DefaultHttpHeaders();

            options.webSocketHeaders().forEach((key, value) -> {
                headers.set(key, value);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/WebSocketTransport.java`
#### Snippet
```java
            HttpHeaders headers = HttpHeaders.newHeaders();

            options.webSocketHeaders().forEach((key, value) -> {
                headers.set(key, value);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
    public StreamReceiverMessage forEachAnnotation(BiConsumer<String, Object> action) throws ClientException {
        if (hasAnnotations()) {
            annotations.getValue().forEach((key, value) -> {
                action.accept(key.toString(), value);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
    public StreamReceiverMessage forEachFooter(BiConsumer<String, Object> action) throws ClientException {
        if (hasFooters()) {
            footer.getValue().forEach((key, value) -> {
                action.accept(key.toString(), value);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/TcpTransport.java`
#### Snippet
```java
                listener.transportError(failureCause);
            } else {
                channel.eventLoop().execute(() -> {
                    listener.transportError(failureCause);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/TcpTransport.java`
#### Snippet
```java
                listener.transportError(failureCause);
            } else {
                channel.executor().execute(() -> {
                    listener.transportError(failureCause);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSender.java`
#### Snippet
```java
    void disposition(OutgoingDelivery delivery, DeliveryState state, boolean settled) throws ClientException {
        checkClosedOrFailed();
        executor.execute(() -> {
            delivery.disposition(state, settled);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessageSupport.java`
#### Snippet
```java
            messageAnnotations = new MessageAnnotations(new LinkedHashMap<>());

            source.forEachAnnotation((key, value) -> {
                messageAnnotations.getValue().put(Symbol.valueOf(key), value);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessageSupport.java`
#### Snippet
```java
            applicationProperties = new ApplicationProperties(new LinkedHashMap<>());

            source.forEachProperty((key, value) -> {
                applicationProperties.getValue().put(key, value);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessageSupport.java`
#### Snippet
```java
            footer = new Footer(new LinkedHashMap<>());

            source.forEachFooter((key, value) -> {
                footer.getValue().put(Symbol.valueOf(key), value);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
        Objects.requireNonNull(buffer, "The buffer resource to be cleaned cannot be null");

        return getCleaner().register(observed, () -> {
            buffer.close();
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSessionIncomingWindow.java`
#### Snippet
```java
        // when appending new deliveries the range can wrap without needing a second iteration.
        if (disposition.getSettled()) {
            unsettled.removeEach((int) disposition.getFirst(), (int) disposition.getLast(), (delivery) -> {
                delivery.getLink().remoteDisposition(disposition, delivery);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSessionIncomingWindow.java`
#### Snippet
```java
            });
        } else {
            unsettled.forEach((int) disposition.getFirst(), (int) disposition.getLast(), (delivery) -> {
                delivery.getLink().remoteDisposition(disposition, delivery);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEngine.java`
#### Snippet
```java
    private BiConsumer<ProtonBuffer, Runnable> outputHandler;
    private EventHandler<Engine> engineShutdownHandler;
    private EventHandler<Engine> engineFailureHandler = (engine) -> {
        LOG.warn("Engine encountered error and will become inoperable: ", engine.failureCause());
    };
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
    @Override
    public Connection negotiate() {
        return negotiate((header) -> {
            LOG.trace("Negotiation completed with remote returning AMQP Header: {}", header);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSessionOutgoingWindow.java`
#### Snippet
```java
        // when appending new deliveries the range can wrap without needing a second iteration.
        if (disposition.getSettled()) {
            unsettled.removeEach((int) disposition.getFirst(), (int) disposition.getLast(), (delivery) -> {
                delivery.getLink().remoteDisposition(disposition, delivery);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSessionOutgoingWindow.java`
#### Snippet
```java
            });
        } else {
            unsettled.forEach((int) disposition.getFirst(), (int) disposition.getLast(), (delivery) -> {
                delivery.getLink().remoteDisposition(disposition, delivery);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/StringUtils.java`
#### Snippet
```java
        if (symbolMap != null) {
            result = new LinkedHashMap<>(symbolMap.size());
            symbolMap.forEach((key, value) -> {
                result.put(key.toString(), value);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/StringUtils.java`
#### Snippet
```java
        if (stringsSet != null) {
            result = new LinkedHashSet<>(stringsSet.size());
            stringsSet.forEach((entry) -> {
                result.add(Symbol.valueOf(entry));
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/StringUtils.java`
#### Snippet
```java
        if (stringsMap != null) {
            result = new HashMap<>(stringsMap.size());
            stringsMap.forEach((key, value) -> {
                result.put(Symbol.valueOf(key), value);
            });
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `remoteSettlementFuture` is accessed in both synchronized and unsynchronized contexts
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientTrackable.java`
#### Snippet
```java
        AtomicReferenceFieldUpdater.newUpdater(ClientTrackable.class, DeliveryState.class, "remoteDeliveryState");

    private ClientFuture<TrackerType> remoteSettlementFuture;
    private volatile int remotelySettled;
    private volatile DeliveryState remoteDeliveryState;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `markIndex` is accessed in both synchronized and unsynchronized contexts
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamDelivery.java`
#### Snippet
```java
        private ClientFuture<Integer> readRequest;

        private int markIndex = INVALID_MARK;
        private int markLimit;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `markLimit` is accessed in both synchronized and unsynchronized contexts
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamDelivery.java`
#### Snippet
```java

        private int markIndex = INVALID_MARK;
        private int markLimit;

        public RawDeliveryInputStream() {
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonLink.java`
#### Snippet
```java
    }

    protected void transitionToRemotelyOpenedState() {
        // Nothing currently updated on this state change.
    }
```

### EmptyMethod
The method is empty
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonTransactionManager.java`
#### Snippet
```java
    }

    private void handleDeliveryStateUpdate(IncomingDelivery delivery) {
        // Nothing to do yet
    }
```

### EmptyMethod
The method is empty
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ClientFuture.java`
#### Snippet
```java
     *        update the task state in a thread safe manner.
     */
    protected void tryCancelTask() {

    }
```

### EmptyMethod
All implementations of this method are empty
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientLinkType.java`
#### Snippet
```java
    protected abstract void linkSpecificRemoteOpenHandler();

    protected abstract void linkSpecificRemoteCloseHandler();

    protected abstract void linkSpecificCleanupHandler(ClientException failureCause);
```

### EmptyMethod
All implementations of this method are empty
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/LinkTracker.java`
#### Snippet
```java
    }

    protected abstract void handleTransfer(Transfer transfer, Buffer payload);

    protected abstract void handleFlow(Flow flow);
```

### EmptyMethod
All implementations of this method are empty
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/LinkTracker.java`
#### Snippet
```java
    protected abstract void handleTransfer(Transfer transfer, Buffer payload);

    protected abstract void handleFlow(Flow flow);

    public abstract boolean isSender();
```

### EmptyMethod
The method is empty
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/SessionTracker.java`
#### Snippet
```java
    }

    public void handleDisposition(Disposition disposition) {
        // TODO Forward to attached links or issue errors if invalid.
    }
```

### EmptyMethod
The method is empty
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/SessionTracker.java`
#### Snippet
```java
    }

    public void handleLocalDisposition(Disposition disposition) {
        // TODO Forward to attached links or issue error if invalid.
    }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/DriverSessions.java`
#### Snippet
```java
    private final AMQPTestDriver driver;

    private UnsignedShort lastRemotelyOpenedSession = null;
    private UnsignedShort lastLocallyOpenedSession = null;
    private LinkTracker lastCoordinator;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/DriverSessions.java`
#### Snippet
```java

    private UnsignedShort lastRemotelyOpenedSession = null;
    private UnsignedShort lastLocallyOpenedSession = null;
    private LinkTracker lastCoordinator;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/AMQPTestDriver.java`
#### Snippet
```java
    private volatile AssertionError failureCause;

    private int advertisedIdleTimeout = 0;

    private volatile int emptyFrameCount;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/AbstractSaslPerformativeInjectAction.java`
#### Snippet
```java

    private final AMQPTestDriver driver;
    private boolean deferred = false;
    private int channel = CHANNEL_UNSET;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/AMQPHeaderInjectAction.java`
#### Snippet
```java
    private final AMQPTestDriver driver;
    private final AMQPHeader header;
    private boolean deferred = false;

    public AMQPHeaderInjectAction(AMQPTestDriver driver, AMQPHeader header) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/AbstractPerformativeInjectAction.java`
#### Snippet
```java
    private int delay = -1;
    private boolean splitWrite = false;
    private boolean deferred = false;

    public AbstractPerformativeInjectAction(AMQPTestDriver driver) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/AbstractPerformativeInjectAction.java`
#### Snippet
```java
    private int channel = CHANNEL_UNSET;
    private int delay = -1;
    private boolean splitWrite = false;
    private boolean deferred = false;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/FifoDeliveryQueue.java`
#### Snippet
```java
    private volatile int state = STOPPED;

    private int waiters = 0;

    private final Deque<ClientDelivery> queue;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java

        protected boolean closed;
        protected long remainingSectionBytes = 0;

        protected MessageBodyInputStream(InputStream deliveryStream) throws ClientException {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/messaging/Header.java`
#### Snippet
```java
    private static final int DELIVERY_COUNT = 16;

    private int modified = 0;

    private boolean durable = DEFAULT_DURABILITY;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/messaging/Properties.java`
#### Snippet
```java
    private static final int REPLY_TO_GROUP_ID = 4096;

    private int modified = 0;

    private Object messageId;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transport/Detach.java`
#### Snippet
```java
    private static final int ERROR = 4;

    private int modified = 0;

    // TODO - Consider using the matching signed types instead of next largest
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transport/Disposition.java`
#### Snippet
```java
    private static final int BATCHABLE = 32;

    private int modified = 0;

    private Role role = Role.SENDER;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transport/Begin.java`
#### Snippet
```java
    private static final int PROPERTIES = 128;

    private int modified = 0;

    // TODO - Consider using the matching signed types instead of next largest
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transport/Transfer.java`
#### Snippet
```java
    private static final int BATCHABLE = 1024;

    private int modified = 0;

    // TODO - Consider using the matching signed types instead of next largest
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transport/Flow.java`
#### Snippet
```java
    private static final int PROPERTIES = 1024;

    private int modified = 0;

    // TODO - Consider using the matching signed types instead of next largest
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transport/Attach.java`
#### Snippet
```java
    private static final int PROPERTIES = 8192;

    private int modified = 0;

    // TODO - Consider using the matching signed types instead of next largest
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSessionIncomingWindow.java`
#### Snippet
```java

    // Computed incoming window based on the incoming capacity minus bytes not yet read from deliveries.
    private long incomingWindow = 0;

    // Tracks the next expected incoming transfer ID from the remote
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSessionIncomingWindow.java`
#### Snippet
```java

    // Tracks the next expected incoming transfer ID from the remote
    private long nextIncomingId = 0;

    // Tracks the most recent delivery Id for validation against the next incoming delivery
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSessionIncomingWindow.java`
#### Snippet
```java

    // User configured incoming capacity for the session used to compute the incoming window
    private int incomingCapacity = 0;

    // Computed incoming window based on the incoming capacity minus bytes not yet read from deliveries.
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonIncomingDelivery.java`
#### Snippet
```java

    private EventHandler<IncomingDelivery> deliveryReadEventHandler = null;
    private EventHandler<IncomingDelivery> deliveryAbortedEventHandler = null;
    private EventHandler<IncomingDelivery> deliveryUpdatedEventHandler = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonIncomingDelivery.java`
#### Snippet
```java
    private Object linkedResource;

    private EventHandler<IncomingDelivery> deliveryReadEventHandler = null;
    private EventHandler<IncomingDelivery> deliveryAbortedEventHandler = null;
    private EventHandler<IncomingDelivery> deliveryUpdatedEventHandler = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonIncomingDelivery.java`
#### Snippet
```java
    private EventHandler<IncomingDelivery> deliveryReadEventHandler = null;
    private EventHandler<IncomingDelivery> deliveryAbortedEventHandler = null;
    private EventHandler<IncomingDelivery> deliveryUpdatedEventHandler = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSender.java`
#### Snippet
```java

    private EventHandler<OutgoingDelivery> deliveryUpdatedEventHandler = null;
    private EventHandler<Sender> linkCreditUpdatedHandler = null;

    private boolean sendable;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSender.java`
#### Snippet
```java
        new UnsettledMap<ProtonOutgoingDelivery>(ProtonOutgoingDelivery::getDeliveryIdInt);

    private EventHandler<OutgoingDelivery> deliveryUpdatedEventHandler = null;
    private EventHandler<Sender> linkCreditUpdatedHandler = null;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSequentialTagGenerator.java`
#### Snippet
```java
public class ProtonSequentialTagGenerator extends ProtonDeliveryTagGenerator {

    protected long nextTagId = 0;

    @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEngine.java`
#### Snippet
```java
    private int lastInputSequence;
    private int lastOutputSequence;
    private long localIdleDeadline = 0;
    private long remoteIdleDeadline = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEngine.java`
#### Snippet
```java
    private int lastOutputSequence;
    private long localIdleDeadline = 0;
    private long remoteIdleDeadline = 0;

    // Engine event points
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonOutgoingDelivery.java`
#### Snippet
```java
    private Object linkedResource;

    private EventHandler<OutgoingDelivery> deliveryUpdatedEventHandler = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSessionOutgoingWindow.java`
#### Snippet
```java

    // This is used for the delivery-id actually stamped in each transfer frame of a given message delivery.
    private int outgoingDeliveryId = 0;

    // Conceptual outgoing Transfer ID value.
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSessionOutgoingWindow.java`
#### Snippet
```java

    // Conceptual outgoing Transfer ID value.
    private int nextOutgoingId = 0;

    // Track outgoing windowing state information in order to stop outgoing writes if the high
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonReceiver.java`
#### Snippet
```java
    private EventHandler<IncomingDelivery> deliveryAbortedEventHandler = null;
    private EventHandler<IncomingDelivery> deliveryUpdatedEventHandler = null;
    private EventHandler<Receiver> linkCreditUpdatedHandler = null;

    private final ProtonSessionIncomingWindow sessionWindow;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonReceiver.java`
#### Snippet
```java
    private EventHandler<IncomingDelivery> deliveryReadEventHandler = null;
    private EventHandler<IncomingDelivery> deliveryAbortedEventHandler = null;
    private EventHandler<IncomingDelivery> deliveryUpdatedEventHandler = null;
    private EventHandler<Receiver> linkCreditUpdatedHandler = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonReceiver.java`
#### Snippet
```java

    private EventHandler<IncomingDelivery> deliveryReadEventHandler = null;
    private EventHandler<IncomingDelivery> deliveryAbortedEventHandler = null;
    private EventHandler<IncomingDelivery> deliveryUpdatedEventHandler = null;
    private EventHandler<Receiver> linkCreditUpdatedHandler = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonReceiver.java`
#### Snippet
```java
public class ProtonReceiver extends ProtonLink<Receiver> implements Receiver {

    private EventHandler<IncomingDelivery> deliveryReadEventHandler = null;
    private EventHandler<IncomingDelivery> deliveryAbortedEventHandler = null;
    private EventHandler<IncomingDelivery> deliveryUpdatedEventHandler = null;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/RingQueue.java`
#### Snippet
```java
public class RingQueue<E> extends AbstractQueue<E> {

    private int read = 0;
    private int write = -1;
    private int size;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
        private int writeOffset;
        private int entries;
        private int lowestDeliveryId = 0;
        private int highestDeliveryId = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
        private int entries;
        private int lowestDeliveryId = 0;
        private int highestDeliveryId = 0;

        private final Object[] deliveries;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
    protected final RingQueue<SplayedEntry<E>> entryPool = new RingQueue<>(DEFAULT_ENTRY_POOL_SIZE);

    protected int entriesInExistence = 0;

    /**
```

## RuleId[ruleID=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
 * @param <Delivery> The delivery type being tracker (incoming or outgoing)
 */
public class UnsettledMap<Delivery> implements Map<UnsignedInteger, Delivery> {

    public interface UnsettledGetDeliveryId<Delivery> {
```

## RuleId[ruleID=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`value >>> 0` can be replaced with 'value'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/TransferInjectAction.java`
#### Snippet
```java
        destination[offset++] = (byte) (value >>> 16);
        destination[offset++] = (byte) (value >>> 8);
        destination[offset++] = (byte) (value >>> 0);

        return destination;
```

### PointlessBitwiseExpression
`value >>> 0` can be replaced with 'value'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamUtils.java`
#### Snippet
```java
        writeByte((byte) (value >>> 16), stream);
        writeByte((byte) (value >>> 8), stream);
        writeByte((byte) (value >>> 0), stream);

        return stream;
```

### PointlessBitwiseExpression
`value >>> 0` can be replaced with 'value'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamUtils.java`
#### Snippet
```java
        writeByte((byte) (value >>> 16), stream);
        writeByte((byte) (value >>> 8), stream);
        writeByte((byte) (value >>> 0), stream);

        return stream;
```

### PointlessBitwiseExpression
`(long) (readByte(stream) & 0xFF) << 0` can be replaced with '(long) (readByte(stream) \& 0xFF)'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamUtils.java`
#### Snippet
```java
               (long) (readByte(stream) & 0xFF) << 16 |
               (long) (readByte(stream) & 0xFF) << 8 |
               (long) (readByte(stream) & 0xFF) << 0;
    }

```

### PointlessBitwiseExpression
`value >>> 0` can be replaced with 'value'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamUtils.java`
#### Snippet
```java
    public static OutputStream writeShort(short value, OutputStream stream) throws EncodeException {
        writeByte((byte) (value >>> 8), stream);
        writeByte((byte) (value >>> 0), stream);

        return stream;
```

### PointlessBitwiseExpression
`(readByte(stream) & 0xFF) << 0` can be replaced with '(readByte(stream) \& 0xFF)'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamUtils.java`
#### Snippet
```java
    public static short readShort(InputStream stream) {
        return (short) ((readByte(stream) & 0xFF) << 8 |
                        (readByte(stream) & 0xFF) << 0);
    }

```

### PointlessBitwiseExpression
`(readByte(stream) & 0xFF) << 0` can be replaced with '(readByte(stream) \& 0xFF)'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamUtils.java`
#### Snippet
```java
               (readByte(stream) & 0xFF) << 16 |
               (readByte(stream) & 0xFF) << 8 |
               (readByte(stream) & 0xFF) << 0;
    }

```

### PointlessBitwiseExpression
`(array[offset++] & 0xFF) << 0` can be replaced with '(array\[offset++\] \& 0xFF)'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
    public static short readShort(byte[] array, int offset) {
        return (short) ((array[offset++] & 0xFF) << 8 |
                        (array[offset++] & 0xFF) << 0);
    }

```

### PointlessBitwiseExpression
`value >>> 0` can be replaced with 'value'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
    public static byte[] writeShort(short value, byte[] destination, int offset) {
        destination[offset++] = (byte) (value >>> 8);
        destination[offset++] = (byte) (value >>> 0);

        return destination;
```

### PointlessBitwiseExpression
`value >>> 0` can be replaced with 'value'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
        destination[offset++] = (byte) (value >>> 16);
        destination[offset++] = (byte) (value >>> 8);
        destination[offset++] = (byte) (value >>> 0);

        return destination;
```

### PointlessBitwiseExpression
`(long) (array[offset++] & 0xFF) << 0` can be replaced with '(long) (array\[offset++\] \& 0xFF)'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
               (long) (array[offset++] & 0xFF) << 16 |
               (long) (array[offset++] & 0xFF) << 8 |
               (long) (array[offset++] & 0xFF) << 0;
    }

```

### PointlessBitwiseExpression
`value >>> 0` can be replaced with 'value'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
        destination[offset++] = (byte) (value >>> 16);
        destination[offset++] = (byte) (value >>> 8);
        destination[offset++] = (byte) (value >>> 0);

        return destination;
```

### PointlessBitwiseExpression
`(array[offset++] & 0xFF) << 0` can be replaced with '(array\[offset++\] \& 0xFF)'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
               (array[offset++] & 0xFF) << 16 |
               (array[offset++] & 0xFF) << 8 |
               (array[offset++] & 0xFF) << 0;
    }

```

### PointlessBitwiseExpression
`value >>> 0` can be replaced with 'value'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
            resource.setByte(woff, (byte) (value >>> 16));
            resource.setByte(woff + 1, (byte) (value >>> 8));
            resource.setByte(woff + 2, (byte) (value >>> 0));

            return this;
```

### PointlessBitwiseExpression
`(readByte() & 0xFF) << 0` can be replaced with '(readByte() \& 0xFF)'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
            return readByte() << 16 |
                   (readByte() & 0xFF) << 8 |
                   (readByte() & 0xFF) << 0;
        } catch (RuntimeException ex) {
            throw translateToNettyException(ex);
```

### PointlessBitwiseExpression
`value >>> 0` can be replaced with 'value'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
            resource.setByte(woff, (byte) (value >>> 16));
            resource.setByte(woff + 1, (byte) (value >>> 8));
            resource.setByte(woff + 2, (byte) (value >>> 0));

            return this;
```

### PointlessBitwiseExpression
`(readByte() & 0xFF) << 0` can be replaced with '(readByte() \& 0xFF)'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
            return ((readByte()) << 16 |
                    (readByte() & 0xFF) << 8 |
                    (readByte() & 0xFF) << 0) & 0xFFFFFF;
        } catch (RuntimeException ex) {
            throw translateToNettyException(ex);
```

### PointlessBitwiseExpression
`(getByte(index + 2) & 0xFF) << 0` can be replaced with '(getByte(index + 2) \& 0xFF)'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
            return ((getByte(index)) << 16 |
                    (getByte(index + 1) & 0xFF) << 8 |
                    (getByte(index + 2) & 0xFF) << 0) & 0xFFFFFF;
        } catch (RuntimeException ex) {
            throw translateToNettyException(ex);
```

### PointlessBitwiseExpression
`(getByte(index + 2) & 0xFF) << 0` can be replaced with '(getByte(index + 2) \& 0xFF)'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
            return (getByte(index)) << 16 |
                    (getByte(index + 1) & 0xFF) << 8 |
                    (getByte(index + 2) & 0xFF) << 0;
        } catch (RuntimeException ex) {
            throw translateToNettyException(ex);
```

### PointlessBitwiseExpression
`value >>> 0` can be replaced with 'value'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
            resource.writeByte((byte) (value >>> 16));
            resource.writeByte((byte) (value >>> 8));
            resource.writeByte((byte) (value >>> 0));

            return this;
```

### PointlessBitwiseExpression
`value >>> 0` can be replaced with 'value'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
            resource.writeByte((byte) (value >>> 16));
            resource.writeByte((byte) (value >>> 8));
            resource.writeByte((byte) (value >>> 0));

            return this;
```

### PointlessBitwiseExpression
`next & 0xFFFFFFFF` can be replaced with 'next'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
            if (next >= 0) {
                currentBucket = (int) (next >> 32);
                readOffset = (int) (next & 0xFFFFFFFF);
            } else {
                readOffset = -1;
```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `AutoCloseable`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestClient.java`
#### Snippet
```java
 * the server and outputs from the client back to the server.
 */
public class ProtonTestClient extends ProtonTestPeer implements AutoCloseable {

    private static final Logger LOG = LoggerFactory.getLogger(ProtonTestClient.class);
```

### RedundantImplements
Redundant interface declaration `ChannelHandler`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/WebSocketTransport.java`
#### Snippet
```java
    }

    private class NettyWebSocketTransportHandler extends NettyDefaultHandler<Object> implements ChannelHandler {

        private final WebSocketClientHandshaker handshaker;
```

### RedundantImplements
Redundant interface declaration `AutoCloseable`
in `protonj2/src/main/java/org/apache/qpid/protonj2/resource/SharedResource.java`
#### Snippet
```java
 * @param <T> The resource type that whose references are being tracked.
 */
public abstract class SharedResource<T extends Resource<T>> implements Resource<T>, AutoCloseable {

    private static final int CLOSED = -1;
```

### RedundantImplements
Redundant interface declaration `Transaction`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonTransactionController.java`
#### Snippet
```java
    //----- The Controller specific Transaction implementation

    private static final class ProtonControllerTransaction extends ProtonTransaction<TransactionController> implements Transaction<TransactionController> {

        private final ProtonTransactionController controller;
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-01-07-04-54.408.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer hash` may be declared as 'StringBuilder'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/sasl/client/CramMD5Mechanism.java`
#### Snippet
```java
                byte[] bytes = mac.doFinal(challengeBytes);

                StringBuffer hash = new StringBuffer(credentials.username());
                hash.append(' ');
                for (int i = 0; i < bytes.length; i++) {
```

## RuleId[ruleID=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/LargeMessageReceiver.java`
#### Snippet
```java

            while (inputStream.read(chunk) != -1) {
                System.out.println(String.format("Read data chunk [%2d]: %s", ++readCount, Arrays.toString(chunk)));
            }

```

### RedundantStringFormatCall
Redundant call to `format()`
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/Send.java`
#### Snippet
```java
                tracker.awaitSettlement();

                System.out.println(String.format("Sent message to %s: %s", sender.address(), message.body()));
            }
        }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonFrameLoggingHandler.java`
#### Snippet
```java
    private static final void trace(String prefix, int connection, int channel, Object performative, ProtonBuffer payload) {
        if (payload == null) {
            System.out.println(String.format("%s:[%d:%d] %s", prefix, connection, channel, performative));
        } else {
            System.out.println(String.format("%s:[%d:%d] %s - %s", prefix, connection, channel, performative, StringUtils.toQuotedString(payload, PAYLOAD_STRING_LIMIT, true)));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonFrameLoggingHandler.java`
#### Snippet
```java
            System.out.println(String.format("%s:[%d:%d] %s", prefix, connection, channel, performative));
        } else {
            System.out.println(String.format("%s:[%d:%d] %s - %s", prefix, connection, channel, performative, StringUtils.toQuotedString(payload, PAYLOAD_STRING_LIMIT, true)));
        }
    }
```

## RuleId[ruleID=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `temporary` of exception class
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/exceptions/ClientConnectionSecuritySaslException.java`
#### Snippet
```java
    private static final long serialVersionUID = 313318720407251822L;

    private boolean temporary;

    /**
```

### NonFinalFieldOfException
Non-final field `condition` of exception class
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/exceptions/ProtocolViolationException.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private Symbol condition;

    public ProtocolViolationException() {
```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientTrackable.java`
#### Snippet
```java
            sender.disposition(delivery, null, true);
        } finally {
            synchronized (this) {
                if (remoteSettlementFuture == null) {
                    remoteSettlementFuture = sender.session.connection().getFutureFactory().createFuture();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientTrackable.java`
#### Snippet
```java
            }

            synchronized (this) {
                REMOTELY_SETTLED_UPDATER.lazySet(this, 1);
                REMOTEL_DELIVERY_STATE_UPDATER.lazySet(this, ClientDeliveryState.fromProtonType(delivery.getRemoteState()));
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientTrackable.java`
#### Snippet
```java

    public ClientFuture<TrackerType> settlementFuture() {
        synchronized (this) {
            if (remoteSettlementFuture == null) {
                remoteSettlementFuture = sender.session.connection().getFutureFactory().createFuture();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientTrackable.java`
#### Snippet
```java
        } finally {
            if (settle) {
                synchronized (this) {
                    if (remoteSettlementFuture == null) {
                        remoteSettlementFuture = sender.session.connection().getFutureFactory().createFuture();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientSenderBuilder.java`
#### Snippet
```java
        SenderOptions senderOptions = defaultSenderOptions;
        if (senderOptions == null) {
            synchronized (this) {
                senderOptions = defaultSenderOptions;
                if (senderOptions == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientSenderBuilder.java`
#### Snippet
```java
        StreamSenderOptions senderOptions = defaultStreamSenderOptions;
        if (senderOptions == null) {
            synchronized (this) {
                senderOptions = defaultStreamSenderOptions;
                if (senderOptions == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientSessionBuilder.java`
#### Snippet
```java
        SessionOptions sessionOptions = defaultSessionOptions;
        if (sessionOptions == null) {
            synchronized (this) {
                sessionOptions = defaultSessionOptions;
                if (sessionOptions == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientReceiverBuilder.java`
#### Snippet
```java
        ReceiverOptions receiverOptions = defaultReceiverOptions;
        if (receiverOptions == null) {
            synchronized (this) {
                receiverOptions = defaultReceiverOptions;
                if (receiverOptions == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientReceiverBuilder.java`
#### Snippet
```java
        StreamReceiverOptions receiverOptions = defaultStreamReceiverOptions;
        if (receiverOptions == null) {
            synchronized (this) {
                receiverOptions = defaultStreamReceiverOptions;
                if (receiverOptions == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ClientFuture.java`
#### Snippet
```java
            STATE_FIELD_UPDATER.lazySet(this, FAILURE);

            synchronized(this) {
                if (waiting > 0) {
                    notifyAll();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ClientFuture.java`
#### Snippet
```java
            synchronized(this) {
                if (waiting > 0) {
                    notifyAll();
                }
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ClientFuture.java`
#### Snippet
```java
            STATE_FIELD_UPDATER.lazySet(this, SUCCESS);

            synchronized(this) {
                if (waiting > 0) {
                    notifyAll();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ClientFuture.java`
#### Snippet
```java
            synchronized(this) {
                if (waiting > 0) {
                    notifyAll();
                }
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ClientFuture.java`
#### Snippet
```java
            STATE_FIELD_UPDATER.lazySet(this, CANCELLED);

            synchronized(this) {
                if (waiting > 0) {
                    notifyAll();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ClientFuture.java`
#### Snippet
```java
            synchronized(this) {
                if (waiting > 0) {
                    notifyAll();
                }
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ProgressiveClientFuture.java`
#### Snippet
```java
                    idleCount++;
                } else {
                    synchronized (this) {
                        if (isComplete()) {
                            break;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ProgressiveClientFuture.java`
#### Snippet
```java
                            waiting++;
                            try {
                                wait(-diff / 1000000, (int) (-diff % 1000000));
                            } catch (InterruptedException e) {
                                Thread.interrupted();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ProgressiveClientFuture.java`
#### Snippet
```java
                    idleCount++;
                } else {
                    synchronized (this) {
                        if (isComplete()) {
                            break;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ProgressiveClientFuture.java`
#### Snippet
```java
                            waiting++;
                            try {
                                wait();
                            } catch (InterruptedException e) {
                                Thread.interrupted();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/BalancedClientFuture.java`
#### Snippet
```java
                    idleCount++;
                } else {
                    synchronized (this) {
                        if (isComplete()) {
                            break;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/BalancedClientFuture.java`
#### Snippet
```java
                            waiting++;
                            try {
                                wait(-diff / 1000000, (int) (-diff % 1000000));
                            } catch (InterruptedException e) {
                                Thread.interrupted();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/BalancedClientFuture.java`
#### Snippet
```java
                    idleCount++;
                } else {
                    synchronized (this) {
                        if (isComplete()) {
                            break;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/BalancedClientFuture.java`
#### Snippet
```java
                            waiting++;
                            try {
                                wait();
                            } catch (InterruptedException e) {
                                Thread.interrupted();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ConservativeClientFuture.java`
#### Snippet
```java
    public V get() throws InterruptedException, ExecutionException {
        while (isNotComplete()) {
            synchronized (this) {
                if (isComplete()) {
                    break;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ConservativeClientFuture.java`
#### Snippet
```java
                    waiting++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.interrupted();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ConservativeClientFuture.java`
#### Snippet
```java
                }

                synchronized (this) {
                    if (isComplete()) {
                        break;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ConservativeClientFuture.java`
#### Snippet
```java
                        waiting++;
                        try {
                            wait(-diff / 1000000, (int) (-diff % 1000000));
                        } catch (InterruptedException e) {
                            Thread.interrupted();
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestServerOptions.java`
#### Snippet
```java
    private String[] disabledCipherSuites;
    private String[] enabledProtocols;
    private String[] disabledProtocols = DEFAULT_DISABLED_PROTOCOLS.toArray(new String[0]);
    private String contextProtocol = DEFAULT_CONTEXT_PROTOCOL;

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestClientOptions.java`
#### Snippet
```java
    private String[] disabledCipherSuites;
    private String[] enabledProtocols;
    private String[] disabledProtocols = DEFAULT_DISABLED_PROTOCOLS.toArray(new String[0]);
    private String contextProtocol = DEFAULT_CONTEXT_PROTOCOL;

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ScriptWriter.java`
#### Snippet
```java
        expectSASLHeader().respondWithSASLHeader();
        remoteSaslMechanisms().withMechanisms("EXTERNAL").queue();
        expectSaslInit().withMechanism("EXTERNAL").withInitialResponse(new byte[0]);
        remoteSaslOutcome().withCode(SaslCode.OK).queue();
        expectAMQPHeader().respondWithAMQPHeader();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/SslSupport.java`
#### Snippet
```java
        LOG.trace("Enabled protocols: {}", enabledProtocols);

        return enabledProtocols.toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/SslSupport.java`
#### Snippet
```java
        LOG.trace("Enabled cipher suites: {}", enabledCipherSuites);

        return enabledCipherSuites.toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/SslSupport.java`
#### Snippet
```java
        LOG.trace("Enabled cipher suites: {}", enabledCipherSuites);

        return enabledCipherSuites.toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/SslSupport.java`
#### Snippet
```java
        LOG.trace("Enabled protocols: {}", enabledProtocols);

        return enabledProtocols.toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/SslOptions.java`
#### Snippet
```java
    private String[] disabledCipherSuites;
    private String[] enabledProtocols;
    private String[] disabledProtocols = DEFAULT_DISABLED_PROTOCOLS.toArray(new String[0]);
    private String contextProtocol = DEFAULT_CONTEXT_PROTOCOL;

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/Netty4Support.java`
#### Snippet
```java
        Throwable cause = null;
        try {
            Unpooled.wrappedBuffer(new byte[0]);
        } catch (Throwable ex) {
            LOG.debug("Netty 4 not available for use.");
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/SslSupport.java`
#### Snippet
```java
        LOG.trace("Enabled protocols: {}", enabledProtocols);

        return enabledProtocols.toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/SslSupport.java`
#### Snippet
```java
        LOG.trace("Enabled cipher suites: {}", enabledCipherSuites);

        return enabledCipherSuites.toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/SslSupport.java`
#### Snippet
```java
        LOG.trace("Enabled protocols: {}", enabledProtocols);

        return enabledProtocols.toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/SslSupport.java`
#### Snippet
```java
        LOG.trace("Enabled cipher suites: {}", enabledCipherSuites);

        return enabledCipherSuites.toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/sasl/MechanismMismatchException.java`
#### Snippet
```java
     */
    public MechanismMismatchException(String detail) {
        this(detail, new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/sasl/client/AbstractScramSHAMechanism.java`
#### Snippet
```java
            case CLIENT_PROOF_SENT:
                evaluateOutcome(challenge);
                response = new byte[0];
                state = State.COMPLETE;
                break;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
        private UnsettledBucket() {
            this.deliveryIdSupplier = null;
            this.deliveries = new Object[0];
            this.highestDeliveryId = UnsignedInteger.MAX_VALUE.intValue();
        }
```

## RuleId[ruleID=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'Open' type conflicts with preceding 'instanceof PerformativeDescribedType' check
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/AMQPTestDriver.java`
#### Snippet
```java
            switch (((PerformativeDescribedType) performative).getPerformativeType()) {
                case OPEN:
                    localOpen = (Open) performative;
                default:
                    break;
```

### CastConflictsWithInstanceof
Cast to 'BooleanTypeDecoder' type conflicts with preceding 'instanceof PrimitiveTypeDecoder' check
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractArrayTypeDecoder.java`
#### Snippet
```java

                if (Boolean.class.equals(typeClass)) {
                    return decodePrimitiveTypeArray((BooleanTypeDecoder) decoder, stream, state, count);
                } else if (Byte.class.equals(typeClass)) {
                    return decodePrimitiveTypeArray((ByteTypeDecoder) decoder, stream, state, count);
```

### CastConflictsWithInstanceof
Cast to 'ByteTypeDecoder' type conflicts with preceding 'instanceof PrimitiveTypeDecoder' check
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractArrayTypeDecoder.java`
#### Snippet
```java
                    return decodePrimitiveTypeArray((BooleanTypeDecoder) decoder, stream, state, count);
                } else if (Byte.class.equals(typeClass)) {
                    return decodePrimitiveTypeArray((ByteTypeDecoder) decoder, stream, state, count);
                } else if (Short.class.equals(typeClass)) {
                    return decodePrimitiveTypeArray((ShortTypeDecoder) decoder, stream, state, count);
```

### CastConflictsWithInstanceof
Cast to 'ShortTypeDecoder' type conflicts with preceding 'instanceof PrimitiveTypeDecoder' check
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractArrayTypeDecoder.java`
#### Snippet
```java
                    return decodePrimitiveTypeArray((ByteTypeDecoder) decoder, stream, state, count);
                } else if (Short.class.equals(typeClass)) {
                    return decodePrimitiveTypeArray((ShortTypeDecoder) decoder, stream, state, count);
                } else if (Integer.class.equals(typeClass)) {
                    if (primitiveTypeDecoder.getTypeCode() == (EncodingCodes.INT & 0xff)) {
```

### CastConflictsWithInstanceof
Cast to 'Integer32TypeDecoder' type conflicts with preceding 'instanceof PrimitiveTypeDecoder' check
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractArrayTypeDecoder.java`
#### Snippet
```java
                } else if (Integer.class.equals(typeClass)) {
                    if (primitiveTypeDecoder.getTypeCode() == (EncodingCodes.INT & 0xff)) {
                        return decodePrimitiveTypeArray((Integer32TypeDecoder) decoder, stream, state, count);
                    } else {
                        return decodePrimitiveTypeArray((Integer8TypeDecoder) decoder, stream, state, count);
```

### CastConflictsWithInstanceof
Cast to 'Integer8TypeDecoder' type conflicts with preceding 'instanceof PrimitiveTypeDecoder' check
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractArrayTypeDecoder.java`
#### Snippet
```java
                        return decodePrimitiveTypeArray((Integer32TypeDecoder) decoder, stream, state, count);
                    } else {
                        return decodePrimitiveTypeArray((Integer8TypeDecoder) decoder, stream, state, count);
                    }
                } else if (Long.class.equals(typeClass)) {
```

### CastConflictsWithInstanceof
Cast to 'LongTypeDecoder' type conflicts with preceding 'instanceof PrimitiveTypeDecoder' check
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractArrayTypeDecoder.java`
#### Snippet
```java
                } else if (Long.class.equals(typeClass)) {
                    if (primitiveTypeDecoder.getTypeCode() == (EncodingCodes.LONG & 0xff)) {
                        return decodePrimitiveTypeArray((LongTypeDecoder) decoder, stream, state, count);
                    } else {
                        return decodePrimitiveTypeArray((Long8TypeDecoder) decoder, stream, state, count);
```

### CastConflictsWithInstanceof
Cast to 'Long8TypeDecoder' type conflicts with preceding 'instanceof PrimitiveTypeDecoder' check
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractArrayTypeDecoder.java`
#### Snippet
```java
                        return decodePrimitiveTypeArray((LongTypeDecoder) decoder, stream, state, count);
                    } else {
                        return decodePrimitiveTypeArray((Long8TypeDecoder) decoder, stream, state, count);
                    }
                } else if (Double.class.equals(typeClass)) {
```

### CastConflictsWithInstanceof
Cast to 'DoubleTypeDecoder' type conflicts with preceding 'instanceof PrimitiveTypeDecoder' check
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractArrayTypeDecoder.java`
#### Snippet
```java
                    }
                } else if (Double.class.equals(typeClass)) {
                    return decodePrimitiveTypeArray((DoubleTypeDecoder) decoder, stream, state, count);
                } else if (Float.class.equals(typeClass)) {
                    return decodePrimitiveTypeArray((FloatTypeDecoder) decoder, stream, state, count);
```

### CastConflictsWithInstanceof
Cast to 'FloatTypeDecoder' type conflicts with preceding 'instanceof PrimitiveTypeDecoder' check
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractArrayTypeDecoder.java`
#### Snippet
```java
                    return decodePrimitiveTypeArray((DoubleTypeDecoder) decoder, stream, state, count);
                } else if (Float.class.equals(typeClass)) {
                    return decodePrimitiveTypeArray((FloatTypeDecoder) decoder, stream, state, count);
                } else if (Character.class.equals(typeClass)) {
                    return decodePrimitiveTypeArray((CharacterTypeDecoder) decoder, stream, state, count);
```

### CastConflictsWithInstanceof
Cast to 'CharacterTypeDecoder' type conflicts with preceding 'instanceof PrimitiveTypeDecoder' check
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractArrayTypeDecoder.java`
#### Snippet
```java
                    return decodePrimitiveTypeArray((FloatTypeDecoder) decoder, stream, state, count);
                } else if (Character.class.equals(typeClass)) {
                    return decodePrimitiveTypeArray((CharacterTypeDecoder) decoder, stream, state, count);
                } else {
                    throw new DecodeException("Unexpected class " + decoder.getClass().getName());
```

### CastConflictsWithInstanceof
Cast to 'BooleanTypeDecoder' type conflicts with preceding 'instanceof PrimitiveTypeDecoder' check
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractArrayTypeDecoder.java`
#### Snippet
```java

                if (Boolean.class.equals(typeClass)) {
                    return decodePrimitiveTypeArray((BooleanTypeDecoder) decoder, buffer, state, count);
                } else if (Byte.class.equals(typeClass)) {
                    return decodePrimitiveTypeArray((ByteTypeDecoder) decoder, buffer, state, count);
```

### CastConflictsWithInstanceof
Cast to 'ByteTypeDecoder' type conflicts with preceding 'instanceof PrimitiveTypeDecoder' check
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractArrayTypeDecoder.java`
#### Snippet
```java
                    return decodePrimitiveTypeArray((BooleanTypeDecoder) decoder, buffer, state, count);
                } else if (Byte.class.equals(typeClass)) {
                    return decodePrimitiveTypeArray((ByteTypeDecoder) decoder, buffer, state, count);
                } else if (Short.class.equals(typeClass)) {
                    return decodePrimitiveTypeArray((ShortTypeDecoder) decoder, buffer, state, count);
```

### CastConflictsWithInstanceof
Cast to 'ShortTypeDecoder' type conflicts with preceding 'instanceof PrimitiveTypeDecoder' check
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractArrayTypeDecoder.java`
#### Snippet
```java
                    return decodePrimitiveTypeArray((ByteTypeDecoder) decoder, buffer, state, count);
                } else if (Short.class.equals(typeClass)) {
                    return decodePrimitiveTypeArray((ShortTypeDecoder) decoder, buffer, state, count);
                } else if (Integer.class.equals(typeClass)) {
                    if (primitiveTypeDecoder.getTypeCode() == (EncodingCodes.INT & 0xff)) {
```

### CastConflictsWithInstanceof
Cast to 'Integer32TypeDecoder' type conflicts with preceding 'instanceof PrimitiveTypeDecoder' check
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractArrayTypeDecoder.java`
#### Snippet
```java
                } else if (Integer.class.equals(typeClass)) {
                    if (primitiveTypeDecoder.getTypeCode() == (EncodingCodes.INT & 0xff)) {
                        return decodePrimitiveTypeArray((Integer32TypeDecoder) decoder, buffer, state, count);
                    } else {
                        return decodePrimitiveTypeArray((Integer8TypeDecoder) decoder, buffer, state, count);
```

### CastConflictsWithInstanceof
Cast to 'Integer8TypeDecoder' type conflicts with preceding 'instanceof PrimitiveTypeDecoder' check
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractArrayTypeDecoder.java`
#### Snippet
```java
                        return decodePrimitiveTypeArray((Integer32TypeDecoder) decoder, buffer, state, count);
                    } else {
                        return decodePrimitiveTypeArray((Integer8TypeDecoder) decoder, buffer, state, count);
                    }
                } else if (Long.class.equals(typeClass)) {
```

### CastConflictsWithInstanceof
Cast to 'LongTypeDecoder' type conflicts with preceding 'instanceof PrimitiveTypeDecoder' check
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractArrayTypeDecoder.java`
#### Snippet
```java
                } else if (Long.class.equals(typeClass)) {
                    if (primitiveTypeDecoder.getTypeCode() == (EncodingCodes.LONG & 0xff)) {
                        return decodePrimitiveTypeArray((LongTypeDecoder) decoder, buffer, state, count);
                    } else {
                        return decodePrimitiveTypeArray((Long8TypeDecoder) decoder, buffer, state, count);
```

### CastConflictsWithInstanceof
Cast to 'Long8TypeDecoder' type conflicts with preceding 'instanceof PrimitiveTypeDecoder' check
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractArrayTypeDecoder.java`
#### Snippet
```java
                        return decodePrimitiveTypeArray((LongTypeDecoder) decoder, buffer, state, count);
                    } else {
                        return decodePrimitiveTypeArray((Long8TypeDecoder) decoder, buffer, state, count);
                    }
                } else if (Double.class.equals(typeClass)) {
```

### CastConflictsWithInstanceof
Cast to 'DoubleTypeDecoder' type conflicts with preceding 'instanceof PrimitiveTypeDecoder' check
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractArrayTypeDecoder.java`
#### Snippet
```java
                    }
                } else if (Double.class.equals(typeClass)) {
                    return decodePrimitiveTypeArray((DoubleTypeDecoder) decoder, buffer, state, count);
                } else if (Float.class.equals(typeClass)) {
                    return decodePrimitiveTypeArray((FloatTypeDecoder) decoder, buffer, state, count);
```

### CastConflictsWithInstanceof
Cast to 'FloatTypeDecoder' type conflicts with preceding 'instanceof PrimitiveTypeDecoder' check
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractArrayTypeDecoder.java`
#### Snippet
```java
                    return decodePrimitiveTypeArray((DoubleTypeDecoder) decoder, buffer, state, count);
                } else if (Float.class.equals(typeClass)) {
                    return decodePrimitiveTypeArray((FloatTypeDecoder) decoder, buffer, state, count);
                } else if (Character.class.equals(typeClass)) {
                    return decodePrimitiveTypeArray((CharacterTypeDecoder) decoder, buffer, state, count);
```

### CastConflictsWithInstanceof
Cast to 'CharacterTypeDecoder' type conflicts with preceding 'instanceof PrimitiveTypeDecoder' check
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/AbstractArrayTypeDecoder.java`
#### Snippet
```java
                    return decodePrimitiveTypeArray((FloatTypeDecoder) decoder, buffer, state, count);
                } else if (Character.class.equals(typeClass)) {
                    return decodePrimitiveTypeArray((CharacterTypeDecoder) decoder, buffer, state, count);
                } else {
                    throw new DecodeException("Unexpected class " + decoder.getClass().getName());
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `val` initializer `null` is redundant
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/FrameDecoder.java`
#### Snippet
```java

            Buffer payload = null;
            Object val = null;

            if (frameBodySize > 0) {
```

### UnusedAssignment
The value `ByteBuffer.wrap(header.getBuffer())` assigned to `output` is never used
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/AMQPTestDriver.java`
#### Snippet
```java
                deferredWrites = null;
            } else {
                output = ByteBuffer.wrap(header.getBuffer());
            }

```

### UnusedAssignment
Variable `engine` initializer `null` is redundant
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/SslSupport.java`
#### Snippet
```java
     */
    public static SSLEngine createClientJdkSslEngine(URI remote, SSLContext context, ProtonTestClientOptions options) throws Exception {
        SSLEngine engine = null;
        if (remote == null) {
            engine = context.createSSLEngine();
```

### UnusedAssignment
Variable `engine` initializer `null` is redundant
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/SslSupport.java`
#### Snippet
```java
     */
    public static SSLEngine createServerJdkSslEngine(URI remote, SSLContext context, ProtonTestServerOptions options) throws Exception {
        SSLEngine engine = null;
        if (remote == null) {
            engine = context.createSSLEngine();
```

### UnusedAssignment
The value changed at `offset++` is never used
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/TransferInjectAction.java`
#### Snippet
```java
        destination[offset++] = (byte) (value >>> 16);
        destination[offset++] = (byte) (value >>> 8);
        destination[offset++] = (byte) (value >>> 0);

        return destination;
```

### UnusedAssignment
Variable `binaryEncodedSize` initializer `-1` is redundant
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/matchers/types/EncodedPartialDataSectionMatcher.java`
#### Snippet
```java
            // Should be a Binary AMQP type with a length value and possibly some bytes
            byte encodingCode = receivedBinary.readByte();
            int binaryEncodedSize = -1;

            if (encodingCode == EncodingCodes.VBIN8) {
```

### UnusedAssignment
The value `footersMatcher.verify(footersSubBinary)` assigned to `bytesConsumed` is never used
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/matchers/transport/TransferPayloadCompositeMatcher.java`
#### Snippet
```java
            try (Buffer footersSubBinary = receivedBinary.copy(bytesConsumed, origLength - bytesConsumed, true)) {
                try {
                    bytesConsumed += footersMatcher.verify(footersSubBinary);
                } catch (Throwable t) {
                    footerMatcherFailureDescription = "\nActual encoded form of remaining bytes passed to FooterMatcher: "
```

### UnusedAssignment
Variable `remoteError` initializer `null` is redundant
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientExceptionSupport.java`
#### Snippet
```java
     */
    public static ClientConnectionRemotelyClosedException convertToConnectionClosedException(Throwable cause) {
        ClientConnectionRemotelyClosedException remoteError = null;

        if (cause instanceof ClientConnectionRemotelyClosedException) {
```

### UnusedAssignment
Variable `future` initializer `null` is redundant
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientLocalTransactionContext.java`
#### Snippet
```java

        if (currentTxn != null) {
            ClientFuture<Session> future = null;

            switch (currentTxn.getState()) {
```

### UnusedAssignment
Variable `cause` initializer `null` is redundant
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientNextReceiverSelector.java`
#### Snippet
```java

    public void handleShutdown() {
        ClientException cause = null;

        if (session.isClosed()) {
```

### UnusedAssignment
Variable `engine` initializer `null` is redundant
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/SslSupport.java`
#### Snippet
```java
     */
    public static SSLEngine createJdkSslEngine(String host, int port, SSLContext context, SslOptions options) throws Exception {
        SSLEngine engine = null;
        if (host == null || host.isEmpty()) {
            engine = context.createSSLEngine();
```

### UnusedAssignment
Variable `engine` initializer `null` is redundant
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/SslSupport.java`
#### Snippet
```java
     */
    public static SSLEngine createOpenSslEngine(ByteBufAllocator allocator, String host, int port, SslContext context, SslOptions options) throws Exception {
        SSLEngine engine = null;

        if (allocator == null) {
```

### UnusedAssignment
Variable `writeFuture` initializer `null` is redundant
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/TcpTransport.java`
#### Snippet
```java
    @SuppressWarnings("unused")
    private TcpTransport writeOutputBufferAsWrappedNettyBuffer(final ProtonBuffer buffer, boolean flush, Runnable onComplete) {
        Future<Void> writeFuture = null;

        final Buffer nettyBuf = new ProtonBufferToNetty5Adapter(buffer.transfer());
```

### UnusedAssignment
Variable `engine` initializer `null` is redundant
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/SslSupport.java`
#### Snippet
```java
     */
    public static SSLEngine createOpenSslEngine(BufferAllocator allocator, String host, int port, SslContext context, SslOptions options) throws Exception {
        SSLEngine engine = null;

        if (allocator == null) {
```

### UnusedAssignment
Variable `engine` initializer `null` is redundant
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/SslSupport.java`
#### Snippet
```java
     */
    public static SSLEngine createJdkSslEngine(String host, int port, SSLContext context, SslOptions options) throws Exception {
        SSLEngine engine = null;
        if (host == null || host.isEmpty()) {
            engine = context.createSSLEngine();
```

### UnusedAssignment
Variable `section` initializer `null` is redundant
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessageSupport.java`
#### Snippet
```java
        final ClientMessage<?> message = new ClientMessage<>();

        Section<?> section = null;

        while (buffer.isReadable()) {
```

### UnusedAssignment
Variable `ch` initializer `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/ProtonEncoderState.java`
#### Snippet
```java
        int position = buffer.getWriteOffset();
        int index = 0;
        int ch = 0;

        // Assume ASCII and just reserve what we need for that case.
```

### UnusedAssignment
Variable `typeEncoder` initializer `findTypeEncoder(buffer, state, values[0])` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/ArrayTypeEncoder.java`
#### Snippet
```java
    @Override
    public void writeRawArray(ProtonBuffer buffer, EncoderState state, Object[] values) {
        TypeEncoder<?> typeEncoder = findTypeEncoder(buffer, state, values[0]);

        // Write the Array Type encoding code, we don't optimize here.
```

### UnusedAssignment
Variable `typeEncoder` initializer `null` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/ArrayTypeEncoder.java`
#### Snippet
```java
        }

        TypeEncoder<?> typeEncoder = null;

        if (value.getClass().getComponentType().isPrimitive()) {
```

### UnusedAssignment
The value `newEncoderState()` assigned to `state` is never used
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/ProtonEncoder.java`
#### Snippet
```java
        ProtonEncoderState state = singleThreadedState;
        if (state == null) {
            singleThreadedState = state = newEncoderState();
        }

```

### UnusedAssignment
The value changed at `offset++` is never used
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
    public static short readShort(byte[] array, int offset) {
        return (short) ((array[offset++] & 0xFF) << 8 |
                        (array[offset++] & 0xFF) << 0);
    }

```

### UnusedAssignment
The value changed at `offset++` is never used
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
    public static byte[] writeShort(short value, byte[] destination, int offset) {
        destination[offset++] = (byte) (value >>> 8);
        destination[offset++] = (byte) (value >>> 0);

        return destination;
```

### UnusedAssignment
The value changed at `offset++` is never used
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
        destination[offset++] = (byte) (value >>> 16);
        destination[offset++] = (byte) (value >>> 8);
        destination[offset++] = (byte) (value >>> 0);

        return destination;
```

### UnusedAssignment
The value changed at `offset++` is never used
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
               (long) (array[offset++] & 0xFF) << 16 |
               (long) (array[offset++] & 0xFF) << 8 |
               (long) (array[offset++] & 0xFF) << 0;
    }

```

### UnusedAssignment
The value changed at `offset++` is never used
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
        destination[offset++] = (byte) (value >>> 16);
        destination[offset++] = (byte) (value >>> 8);
        destination[offset++] = (byte) (value >>> 0);

        return destination;
```

### UnusedAssignment
The value changed at `offset++` is never used
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
               (array[offset++] & 0xFF) << 16 |
               (array[offset++] & 0xFF) << 8 |
               (array[offset++] & 0xFF) << 0;
    }

```

### UnusedAssignment
Variable `maxPoolSize` initializer `DEFAULT_MAX_POOL_SIZE` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/AMQPPerformativeEnvelopePool.java`
#### Snippet
```java
    public static final int DEFAULT_MAX_POOL_SIZE = 10;

    private int maxPoolSize = DEFAULT_MAX_POOL_SIZE;

    private final RingQueue<E> pool;
```

### UnusedAssignment
Variable `val` initializer `null` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonFrameDecodingHandler.java`
#### Snippet
```java

            ProtonBuffer payload = null;
            Object val = null;

            if (frameBodySize > 0) {
```

### UnusedAssignment
Variable `session` initializer `null` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
    @Override
    public void handleBegin(Begin begin, ProtonBuffer payload, int channel, ProtonEngine context) {
        ProtonSession session = null;

        if (channel > localOpen.getChannelMax()) {
```

### UnusedAssignment
The value `null` assigned to `this.deliveryTag` is never used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonOutgoingDelivery.java`
#### Snippet
```java
        if (this.deliveryTag != null) {
            this.deliveryTag.release();
            this.deliveryTag = null;
        }

```

### UnusedAssignment
Variable `nextTag` initializer `null` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonPooledTagGenerator.java`
#### Snippet
```java

    private DeliveryTag createTag() {
        DeliveryTag nextTag = null;

        if (nextTagId >= 0 && nextTagId < tagPoolSize) {
```

### UnusedAssignment
Variable `factory` initializer `null` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/ProtonLoggerFactory.java`
#### Snippet
```java

    private static ProtonLoggerFactory findSupportedLoggingFramework() {
        ProtonLoggerFactory factory = null;

        try {
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
    private Delivery removeValue(int deliveryId) {
        if (totalEntries > 0) {
            Delivery result = null;

            for (int i = 0; i <= current; ++i) {
```

### UnusedAssignment
Variable `removeStart` initializer `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
        boolean foundFirst = false;
        boolean foundLast = false;
        int removeStart = 0;
        int removeEnd = 0;

```

### UnusedAssignment
Variable `removeEnd` initializer `0` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
        boolean foundLast = false;
        int removeStart = 0;
        int removeEnd = 0;

        for (int i = 0; i <= current && !foundLast; ++i) {
```

### UnusedAssignment
The value `(long) (prevBucketIndex) << 32` assigned to `result` is never used
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
                    // Moved into the previous bucket so the index being negative
                    // give us the located when added to the previous write offset
                    result = (long) (prevBucketIndex) << 32;
                    result = prevBucket.writeOffset + nextEntryOffset;
                } else if (nextBucket.entries + (bucket.entries - toCopyBackward) > 0) {
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Value `payload` is always 'null'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/FrameDecoder.java`
#### Snippet
```java
                }
            } else {
                LOG.trace("{} Read: CH[{}] : {} [{}]", driver.getName(), channel, HeartBeat.INSTANCE, payload);
                transitionToFrameSizeParsingStage();
                driver.handleHeartbeat(frameSize, channel);
```

### ConstantValue
Condition `body != null` is always `true`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java

                // Preserve older section from original message creation.
                if (body != null) {
                    bodySections.add(body);
                    body = null;
```

### ConstantValue
Value `result` is always 'false'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/ReconnectLocationPool.java`
#### Snippet
```java

        if (first == null || second == null) {
            return result;
        } else if (first.getPort() == second.getPort()) {
            final String firstHost = first.getHost();
```

### ConstantValue
Condition `count == 1` is always `true`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transactions/DeclaredTypeDecoder.java`
#### Snippet
```java
        } else if (count > MAX_DECLARED_LIST_ENTRIES) {
            throw new DecodeException("To many entries in Declared list encoding: " + count);
        } else if (count == 1) {
            declared.setTxnId(state.getDecoder().readBinary(buffer, state));
        }
```

### ConstantValue
Condition `writeSize > Integer.MAX_VALUE` is always `false`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/AbstractDescribedMapTypeEncoder.java`
#### Snippet
```java
        final int writeSize = buffer.getWriteOffset() - startIndex - Integer.BYTES;

        if (writeSize > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Cannot encode given array, encoded size too large: " + writeSize);
        }
```

### ConstantValue
Condition `count == 1` is always `true`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/transactions/DeclaredTypeDecoder.java`
#### Snippet
```java
        } else if (count > MAX_DECLARED_LIST_ENTRIES) {
            throw new DecodeException("To many entries in Declared list encoding: " + count);
        } else if (count == 1) {
            declared.setTxnId(state.getDecoder().readBinary(stream, state));
        }
```

### ConstantValue
Condition `writeSize > Integer.MAX_VALUE` is always `false`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/AbstractPrimitiveTypeEncoder.java`
#### Snippet
```java
        final long writeSize = buffer.getWriteOffset() - startIndex - Integer.BYTES;

        if (writeSize > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Cannot encode given array, encoded size too large: " + writeSize);
        }
```

### ConstantValue
Condition `writeSize > Integer.MAX_VALUE` is always `false`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/AbstractDescribedListTypeEncoder.java`
#### Snippet
```java
        final int writeSize = buffer.getWriteOffset() - startIndex - Integer.BYTES;

        if (writeSize > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Cannot encode given array, encoded size too large: " + writeSize);
        }
```

### ConstantValue
Condition `writeSize > Integer.MAX_VALUE` is always `false`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/messaging/AmqpSequenceTypeEncoder.java`
#### Snippet
```java
        final long writeSize = endIndex - startIndex - Integer.BYTES;

        if (writeSize > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Cannot encode given array, encoded size to large: " + writeSize);
        }
```

### ConstantValue
Condition `writeSize > Integer.MAX_VALUE` is always `false`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/messaging/AmqpValueTypeEncoder.java`
#### Snippet
```java
        final long writeSize = endIndex - startIndex - Integer.BYTES;

        if (writeSize > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Cannot encode given array, encoded size to large: " + writeSize);
        }
```

### ConstantValue
Condition `writeSize > Integer.MAX_VALUE` is always `false`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/messaging/DataTypeEncoder.java`
#### Snippet
```java
        final long writeSize = endIndex - startIndex - Integer.BYTES;

        if (writeSize > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Cannot encode given array, encoded size to large: " + writeSize);
        }
```

### ConstantValue
Condition `writeSize > Integer.MAX_VALUE` is always `false`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/LongTypeEncoder.java`
#### Snippet
```java
        long writeSize = endIndex - startIndex - Integer.BYTES;

        if (writeSize > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Cannot encode given array, encoded size to large: " + writeSize);
        }
```

### ConstantValue
Condition `writeSize > Integer.MAX_VALUE` is always `false`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/CharacterTypeEncoder.java`
#### Snippet
```java
        long writeSize = endIndex - startIndex - Integer.BYTES;

        if (writeSize > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Cannot encode given array, encoded size to large: " + writeSize);
        }
```

### ConstantValue
Condition `writeSize > Integer.MAX_VALUE` is always `false`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/BooleanTypeEncoder.java`
#### Snippet
```java
        final long writeSize = endIndex - startIndex - Integer.BYTES;

        if (writeSize > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Cannot encode given array, encoded size to large: " + writeSize);
        }
```

### ConstantValue
Condition `writeSize > Integer.MAX_VALUE` is always `false`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/IntegerTypeEncoder.java`
#### Snippet
```java
        long writeSize = endIndex - startIndex - Integer.BYTES;

        if (writeSize > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Cannot encode given array, encoded size to large: " + writeSize);
        }
```

### ConstantValue
Condition `writeSize > Integer.MAX_VALUE` is always `false`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/FloatTypeEncoder.java`
#### Snippet
```java
        long writeSize = endIndex - startIndex - Integer.BYTES;

        if (writeSize > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Cannot encode given array, encoded size to large: " + writeSize);
        }
```

### ConstantValue
Condition `writeSize > Integer.MAX_VALUE` is always `false`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/ShortTypeEncoder.java`
#### Snippet
```java
        long writeSize = endIndex - startIndex - Integer.BYTES;

        if (writeSize > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Cannot encode given array, encoded size to large: " + writeSize);
        }
```

### ConstantValue
Condition `writeSize > Integer.MAX_VALUE` is always `false`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/ByteTypeEncoder.java`
#### Snippet
```java
        long writeSize = endIndex - startIndex - Integer.BYTES;

        if (writeSize > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Cannot encode given array, encoded size to large: " + writeSize);
        }
```

### ConstantValue
Condition `writeSize > Integer.MAX_VALUE` is always `false`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/DoubleTypeEncoder.java`
#### Snippet
```java
        long writeSize = endIndex - startIndex - Integer.BYTES;

        if (writeSize > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Cannot encode given array, encoded size to large: " + writeSize);
        }
```

### ConstantValue
Condition `writeSize > Integer.MAX_VALUE` is always `false`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/ArrayTypeEncoder.java`
#### Snippet
```java
            final long writeSize = buffer.getWriteOffset() - startIndex - Integer.BYTES;

            if (writeSize > Integer.MAX_VALUE) {
                throw new IllegalArgumentException("Cannot encode given array, encoded size to large: " + writeSize);
            }
```

### ConstantValue
Condition `writeSize > Integer.MAX_VALUE` is always `false`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/ArrayTypeEncoder.java`
#### Snippet
```java
            final long writeSize = buffer.getWriteOffset() - startIndex - Integer.BYTES;

            if (writeSize > Integer.MAX_VALUE) {
                throw new IllegalArgumentException("Cannot encode given array, encoded size to large: " + writeSize);
            }
```

### ConstantValue
Condition `encoder == null` is always `true`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/ProtonEncoder.java`
#### Snippet
```java
                // class lookups as we don't want to allow arrays of polymorphic types.
                if (encoder == null && instance != null) {
                    if (encoder == null) {
                        return unknownTypeEncoder;
                    }
```

### ConstantValue
Condition `contextMap == null` is always `false`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonAttachments.java`
#### Snippet
```java
    @Override
    public <T> T get(String key) {
        return contextMap == null ? null : (T) contextMap.get(key);
    }

```

### ConstantValue
Condition `contextMap != null` is always `true`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonAttachments.java`
#### Snippet
```java
    @Override
    public Attachments clear() {
        if (contextMap != null) {
            contextMap.clear();
        }
```

### ConstantValue
Value `properties` is always 'null'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSession.java`
#### Snippet
```java
            localBegin.setProperties(new LinkedHashMap<>(properties));
        } else {
            localBegin.setProperties(properties);
        }

```

### ConstantValue
Value `capabilities` is always 'null'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSession.java`
#### Snippet
```java
            localBegin.setDesiredCapabilities(Arrays.copyOf(capabilities, capabilities.length));
        } else {
            localBegin.setDesiredCapabilities(capabilities);
        }

```

### ConstantValue
Value `capabilities` is always 'null'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSession.java`
#### Snippet
```java
            localBegin.setOfferedCapabilities(Arrays.copyOf(capabilities, capabilities.length));
        } else {
            localBegin.setOfferedCapabilities(capabilities);
        }

```

### ConstantValue
Value `capabilities` is always 'null'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
            localOpen.setOfferedCapabilities(Arrays.copyOf(capabilities, capabilities.length));
        } else {
            localOpen.setOfferedCapabilities(capabilities);
        }

```

### ConstantValue
Value `properties` is always 'null'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
            localOpen.setProperties(new LinkedHashMap<>(properties));
        } else {
            localOpen.setProperties(properties);
        }

```

### ConstantValue
Value `capabilities` is always 'null'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
            localOpen.setDesiredCapabilities(Arrays.copyOf(capabilities, capabilities.length));
        } else {
            localOpen.setDesiredCapabilities(capabilities);
        }

```

### ConstantValue
Value `capabilities` is always 'null'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonLink.java`
#### Snippet
```java
            localAttach.setOfferedCapabilities(Arrays.copyOf(capabilities, capabilities.length));
        } else {
            localAttach.setOfferedCapabilities(capabilities);
        }

```

### ConstantValue
Value `properties` is always 'null'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonLink.java`
#### Snippet
```java
            localAttach.setProperties(new LinkedHashMap<>(properties));
        } else {
            localAttach.setProperties(properties);
        }

```

### ConstantValue
Value `capabilities` is always 'null'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonLink.java`
#### Snippet
```java
            localAttach.setDesiredCapabilities(Arrays.copyOf(capabilities, capabilities.length));
        } else {
            localAttach.setDesiredCapabilities(capabilities);
        }

```

### ConstantValue
Value `value` is always 'null'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java

        public SplayedEntry() {
            initialize(key, value);
        }

```

## RuleId[ruleID=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/Symbols.java`
#### Snippet
```java
        Objects.requireNonNull("Value to find cannot be null");

        if (symbols == null || symbols.length == 0) {
            return false;
        }
```

## RuleId[ruleID=FieldMayBeStatic]
### FieldMayBeStatic
Field `DECLARE_FUTURE_NAME` may be 'static'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientLocalTransactionContext.java`
#### Snippet
```java
                                                                      Modified.DESCRIPTOR_SYMBOL };

    private final String DECLARE_FUTURE_NAME = "Declare:Future";
    private final String DISCHARGE_FUTURE_NAME = "Discharge:Future";
    private final String START_TRANSACTION_MARKER = "Transaction:Start";
```

### FieldMayBeStatic
Field `START_TRANSACTION_MARKER` may be 'static'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientLocalTransactionContext.java`
#### Snippet
```java
    private final String DECLARE_FUTURE_NAME = "Declare:Future";
    private final String DISCHARGE_FUTURE_NAME = "Discharge:Future";
    private final String START_TRANSACTION_MARKER = "Transaction:Start";

    private final AtomicInteger coordinatorCounter = new AtomicInteger();
```

### FieldMayBeStatic
Field `DISCHARGE_FUTURE_NAME` may be 'static'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientLocalTransactionContext.java`
#### Snippet
```java

    private final String DECLARE_FUTURE_NAME = "Declare:Future";
    private final String DISCHARGE_FUTURE_NAME = "Discharge:Future";
    private final String START_TRANSACTION_MARKER = "Transaction:Start";

```

### FieldMayBeStatic
Field `INVALID_MARK` may be 'static'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamDelivery.java`
#### Snippet
```java
    private class RawDeliveryInputStream extends InputStream {

        private final int INVALID_MARK = -1;

        private final ProtonCompositeBuffer buffer;
```

### FieldMayBeStatic
Field `MIN_IDLE_CHECK_INTERVAL` may be 'static'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEngine.java`
#### Snippet
```java

        // TODO - Pick reasonable values
        private final long MIN_IDLE_CHECK_INTERVAL = 1000;
        private final long MAX_IDLE_CHECK_INTERVAL = 10000;

```

### FieldMayBeStatic
Field `MAX_IDLE_CHECK_INTERVAL` may be 'static'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEngine.java`
#### Snippet
```java
        // TODO - Pick reasonable values
        private final long MIN_IDLE_CHECK_INTERVAL = 1000;
        private final long MAX_IDLE_CHECK_INTERVAL = 10000;

        @Override
```

### FieldMayBeStatic
Field `BUCKET_LOAD_FACTOR_MULTIPLIER` may be 'static'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
    }

    private final double BUCKET_LOAD_FACTOR_MULTIPLIER = 0.30;

    private static final int UNSETTLED_INITIAL_BUCKETS = 2;
```

### FieldMayBeStatic
Field `DEFAULT_ENTRY_POOL_SIZE` may be 'static'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
    protected static final Comparator<UnsignedInteger> REVERSE_COMPARATOR = Collections.reverseOrder(COMPARATOR);

    protected final int DEFAULT_ENTRY_POOL_SIZE = 64;

    protected final RingQueue<SplayedEntry<E>> entryPool = new RingQueue<>(DEFAULT_ENTRY_POOL_SIZE);
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Factory` has only 'static' members, and lacks a 'private' constructor
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/Codec.java`
#### Snippet
```java
public interface Codec {

    public static final class Factory {

        public static Codec create() {
```

### UtilityClassWithoutPrivateConstructor
Class `TypeDecoder` has only 'static' members, and lacks a 'private' constructor
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/TypeDecoder.java`
#### Snippet
```java
import io.netty5.buffer.Buffer;

class TypeDecoder {

    private static final Charset ASCII = Charset.forName("US-ASCII");
```

### UtilityClassWithoutPrivateConstructor
Class `SslSupport` has only 'static' members, and lacks a 'private' constructor
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/SslSupport.java`
#### Snippet
```java
 * Static class that provides various utility methods used by Transport implementations.
 */
public class SslSupport {

    private static final Logger LOG = LoggerFactory.getLogger(SslSupport.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ClientExceptionSupport` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientExceptionSupport.java`
#### Snippet
```java
import org.apache.qpid.protonj2.types.transport.LinkError;

final class ClientExceptionSupport {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ClientConstants` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientConstants.java`
#### Snippet
```java
 * Constants that are used throughout the client implementation.
 */
public class ClientConstants {

    // Symbols used to announce connection error information
```

### UtilityClassWithoutPrivateConstructor
Class `ThreadPoolUtils` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/ThreadPoolUtils.java`
#### Snippet
```java
 * Utility methods for working with thread pools {@link ExecutorService}.
 */
public final class ThreadPoolUtils {

    private static final Logger LOG = LoggerFactory.getLogger(ThreadPoolUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `Netty4Support` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/Netty4Support.java`
#### Snippet
```java
 * Support class used to detect if Netty 4 is available on the class path.
 */
public final class Netty4Support {

    private static final Logger LOG = LoggerFactory.getLogger(Netty4Support.class);
```

### UtilityClassWithoutPrivateConstructor
Class `KQueueSupport` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/KQueueSupport.java`
#### Snippet
```java
import io.netty.channel.kqueue.KQueueSocketChannel;

public final class KQueueSupport {

    private static final Logger LOG = LoggerFactory.getLogger(KQueueSupport.class);
```

### UtilityClassWithoutPrivateConstructor
Class `IOUringSupport` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/IOUringSupport.java`
#### Snippet
```java
import io.netty.incubator.channel.uring.IOUringSocketChannel;

public final class IOUringSupport {

    private static final Logger LOG = LoggerFactory.getLogger(IOUringSupport.class);
```

### UtilityClassWithoutPrivateConstructor
Class `EpollSupport` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/EpollSupport.java`
#### Snippet
```java
import io.netty.channel.epoll.EpollSocketChannel;

public final class EpollSupport {

    private static final Logger LOG = LoggerFactory.getLogger(EpollSupport.class);
```

### UtilityClassWithoutPrivateConstructor
Class `Netty5Support` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/Netty5Support.java`
#### Snippet
```java
 * Support class used to detect if Netty 5 is available on the class path.
 */
public final class Netty5Support {

    private static final Logger LOG = LoggerFactory.getLogger(Netty5Support.class);
```

### UtilityClassWithoutPrivateConstructor
Class `SslSupport` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/SslSupport.java`
#### Snippet
```java
 * Static class that provides various utility methods used by Transport implementations.
 */
public final class SslSupport {

    private static final Logger LOG = LoggerFactory.getLogger(SslSupport.class);
```

### UtilityClassWithoutPrivateConstructor
Class `IOUringSupport` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/IOUringSupport.java`
#### Snippet
```java
import io.netty5.channel.EventLoopGroup;

public class IOUringSupport {

    private static final Logger LOG = LoggerFactory.getLogger(IOUringSupport.class);
```

### UtilityClassWithoutPrivateConstructor
Class `KQueueSupport` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/KQueueSupport.java`
#### Snippet
```java
import io.netty5.channel.kqueue.KQueueSocketChannel;

public final class KQueueSupport {

    private static final Logger LOG = LoggerFactory.getLogger(KQueueSupport.class);
```

### UtilityClassWithoutPrivateConstructor
Class `EpollSupport` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/EpollSupport.java`
#### Snippet
```java
import io.netty5.channel.epoll.EpollSocketChannel;

public final class EpollSupport {

    private static final Logger LOG = LoggerFactory.getLogger(EpollSupport.class);
```

### UtilityClassWithoutPrivateConstructor
Class `TransactedSender` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/TransactedSender.java`
#### Snippet
```java
import org.apache.qpid.protonj2.client.Session;

public class TransactedSender {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `HelloWorld` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/HelloWorld.java`
#### Snippet
```java
import org.apache.qpid.protonj2.client.Sender;

public class HelloWorld {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `TransactedReceiver` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/TransactedReceiver.java`
#### Snippet
```java
import org.apache.qpid.protonj2.client.Session;

public class TransactedReceiver {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `Request` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/Request.java`
#### Snippet
```java
 * Sends a Request to a request Queue and awaits a response.
 */
public class Request {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `LargeMessageSender` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/LargeMessageSender.java`
#### Snippet
```java
import org.apache.qpid.protonj2.client.StreamSenderMessage;

public class LargeMessageSender {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `Respond` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/Respond.java`
#### Snippet
```java
 * Listens for Requests on a request Queue and sends a response.
 */
public class Respond {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `LargeMessageReceiver` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/LargeMessageReceiver.java`
#### Snippet
```java
import org.apache.qpid.protonj2.client.StreamReceiverMessage;

public class LargeMessageReceiver {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `StreamingFileReceiver` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/StreamingFileReceiver.java`
#### Snippet
```java
 * Receives a streamed file and writes it to the path given on the command line.
 */
public class StreamingFileReceiver {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `StreamingFileSender` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/StreamingFileSender.java`
#### Snippet
```java
 * Sends the file given in argument zero to the remote address 'file-transfer'
 */
public class StreamingFileSender {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `Send` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/Send.java`
#### Snippet
```java
import org.apache.qpid.protonj2.client.Tracker;

public class Send {

    private static final int MESSAGE_COUNT = 100;
```

### UtilityClassWithoutPrivateConstructor
Class `SslSupport` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/SslSupport.java`
#### Snippet
```java
 * Static class that provides various utility methods used by Transport implementations.
 */
public final class SslSupport {

    private static final Logger LOG = LoggerFactory.getLogger(SslSupport.class);
```

### UtilityClassWithoutPrivateConstructor
Class `Receive` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/Receive.java`
#### Snippet
```java
import org.apache.qpid.protonj2.client.Receiver;

public class Receive {

    private static final int MESSAGE_COUNT = 100;
```

### UtilityClassWithoutPrivateConstructor
Class `NextReceiver` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/NextReceiver.java`
#### Snippet
```java
import org.apache.qpid.protonj2.client.Message;

public class NextReceiver {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ReconnectSender` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/reconnect/ReconnectSender.java`
#### Snippet
```java
import org.apache.qpid.protonj2.client.Sender;

public class ReconnectSender {

    private static final int MESSAGE_COUNT = 10;
```

### UtilityClassWithoutPrivateConstructor
Class `ReconnectReceiver` has only 'static' members, and lacks a 'private' constructor
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/reconnect/ReconnectReceiver.java`
#### Snippet
```java
import org.apache.qpid.protonj2.client.Receiver;

public class ReconnectReceiver {

    private static final int MESSAGE_COUNT = 10;
```

### UtilityClassWithoutPrivateConstructor
Class `ProtonConstants` has only 'static' members, and lacks a 'private' constructor
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConstants.java`
#### Snippet
```java
 * Constants referenced throughout the proton engine code.
 */
public final class ProtonConstants {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ProtonExceptionSupport` has only 'static' members, and lacks a 'private' constructor
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/exceptions/ProtonExceptionSupport.java`
#### Snippet
```java
package org.apache.qpid.protonj2.engine.exceptions;

public class ProtonExceptionSupport {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `StringUtils` has only 'static' members, and lacks a 'private' constructor
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/StringUtils.java`
#### Snippet
```java
 * Set of {@link String} utilities used in the proton code.
 */
public class StringUtils {

    private static final int DEFAULT_QUOTED_STRING_LIMIT = 64;
```

## RuleId[ruleID=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/sasl/client/SaslMechanismSelector.java`
#### Snippet
```java
    public Mechanism select(Symbol[] serverMechs, SaslCredentialsProvider credentials) {
        Set<Symbol> candidates = new LinkedHashSet<>(serverMechs.length);
        for (Symbol serverMech : serverMechs) {
            candidates.add(serverMech);
        }
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/SslSupport.java`
#### Snippet
```java
    private static KeyStore loadStore(String storePath, final String password, String storeType) throws Exception {
        KeyStore store = KeyStore.getInstance(storeType);
        try (InputStream in = new FileInputStream(new File(storePath));) {
            store.load(in, password != null ? password.toCharArray() : null);
        }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamDelivery.java`
#### Snippet
```java
                    // is located within and close them to ensure any pooled buffers are
                    // returned to the pool and the rest are discarded.
                    buffer.splitComponentsFloor(buffer.getReadOffset()).close();;
                } catch (Exception e) {
                }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/SslSupport.java`
#### Snippet
```java
    private static KeyStore loadStore(String storePath, final String password, String storeType) throws Exception {
        KeyStore store = KeyStore.getInstance(storeType);
        try (InputStream in = new FileInputStream(new File(storePath));) {
            store.load(in, password != null ? password.toCharArray() : null);
        }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/SslSupport.java`
#### Snippet
```java
    private static KeyStore loadStore(String storePath, final String password, String storeType) throws Exception {
        KeyStore store = KeyStore.getInstance(storeType);
        try (InputStream in = new FileInputStream(new File(storePath));) {
            store.load(in, password != null ? password.toCharArray() : null);
        }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/TransactionState.java`
#### Snippet
```java
     * to the {@link Discharge} action.
     */
    DISCHARGE_FAILED;

}
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Method invocation `isOptional` may produce `NullPointerException`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/AMQPTestDriver.java`
#### Snippet
```java
                sasl.invoke(scriptEntry, frameSize, this);
            } catch (UnexpectedPerformativeError e) {
                if (scriptEntry.isOptional()) {
                    handleSaslPerformative(frameSize, sasl, channel, payload);
                } else {
```

### DataFlowIssue
Argument `scriptEntry` might be null
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/AMQPTestDriver.java`
#### Snippet
```java
            }

            processScript(scriptEntry);
        }
    }
```

### DataFlowIssue
Method invocation `isOptional` may produce `NullPointerException`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/AMQPTestDriver.java`
#### Snippet
```java
                header.invoke(scriptEntry, this);
            } catch (Throwable t) {
                if (scriptEntry.isOptional()) {
                    handleHeader(header);
                } else {
```

### DataFlowIssue
Argument `scriptEntry` might be null
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/AMQPTestDriver.java`
#### Snippet
```java
            }

            processScript(scriptEntry);
        }
    }
```

### DataFlowIssue
Method invocation `isOptional` may produce `NullPointerException`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/AMQPTestDriver.java`
#### Snippet
```java
                amqp.invoke(scriptEntry, frameSize, payload, channel, this);
            } catch (UnexpectedPerformativeError e) {
                if (scriptEntry.isOptional()) {
                    handlePerformative(frameSize, amqp, channel, payload);
                } else {
```

### DataFlowIssue
Argument `scriptEntry` might be null
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/AMQPTestDriver.java`
#### Snippet
```java
            }

            processScript(scriptEntry);
        }
    }
```

### DataFlowIssue
Argument `toArray()` might be null
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/transport/AMQPHeader.java`
#### Snippet
```java
    public ByteBuffer toByteBuffer() {
        if (buffer != null) {
            return ByteBuffer.wrap(toArray());
        } else {
            return null;
```

### DataFlowIssue
Method invocation `complete` may produce `NullPointerException`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientNextReceiverSelector.java`
#### Snippet
```java
                delivery.getLink().getSession().getAttachments().set(LAST_RETURNED_STATE_KEY, receiver);

                pending.poll().complete(receiver);
            }
        }
```

### DataFlowIssue
Method invocation `addListener` may produce `NullPointerException`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/TcpTransport.java`
#### Snippet
```java

            if (onComplete != null) {
                writeFuture.addListener(onComplete, TcpTransport::handleWriteComplete);
            }
        }
```

### DataFlowIssue
Switch label `0` is the only reachable in the whole switch
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/messaging/RejectedTypeDecoder.java`
#### Snippet
```java
        for (int index = 0; index < count; ++index) {
            switch (index) {
                case 0:
                    rejected.setError(state.getDecoder().readObject(buffer, state, ErrorCondition.class));
                    break;
```

### DataFlowIssue
Switch label `0` is the only reachable in the whole switch
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/messaging/RejectedTypeDecoder.java`
#### Snippet
```java
        for (int index = 0; index < count; ++index) {
            switch (index) {
                case 0:
                    rejected.setError(state.getDecoder().readObject(stream, state, ErrorCondition.class));
                    break;
```

### DataFlowIssue
Method invocation `getReadableBytes` may produce `NullPointerException`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/messaging/DataTypeEncoder.java`
#### Snippet
```java
        for (Object value : values) {
            final ProtonBuffer binary = ((Data) value).getBuffer();
            buffer.writeInt(binary.getReadableBytes());
            buffer.writeBytes(binary);
        }
```

### DataFlowIssue
Method invocation `getReadableBytes` may produce `NullPointerException`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/BinaryTypeEncoder.java`
#### Snippet
```java
            ProtonBuffer binaryBuffer = binary.asProtonBuffer();

            buffer.ensureWritable(binaryBuffer.getReadableBytes() + Integer.BYTES);
            buffer.writeInt(binaryBuffer.getReadableBytes());
            final int readOffset = binaryBuffer.getReadOffset();
```

### DataFlowIssue
Argument `value.asProtonBuffer()` might be null
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/BinaryTypeEncoder.java`
#### Snippet
```java
    @Override
    public void writeType(ProtonBuffer buffer, EncoderState state, Binary value) {
        writeType(buffer, state, value.asProtonBuffer());
    }

```

### DataFlowIssue
Variable is already assigned to this value
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
            // to reduce fragmentation.
            if (foundFirst) {
                i = removeRange(i, removeStart, removeEnd, foundLast) ? --i : i;
            }
        }
```

## RuleId[ruleID=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
`new String()` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/sasl/client/AbstractScramSHAMechanism.java`
#### Snippet
```java
            }

            byte[] passwordBytes = saslPrep(new String(credentials.password())).getBytes(StandardCharsets.UTF_8);
            byte[] saltedPassword = generateSaltedPassword(passwordBytes);

```

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestConnector.java`
#### Snippet
```java
    public ProtonTestConnector(Consumer<ByteBuffer> frameSink) {
        this.driver = new AMQPTestDriver(getPeerName(), (frame) -> {
            processDriverOutput(frame);
        }, null);

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/NettyClient.java`
#### Snippet
```java

                options.getHttpHeaders().forEach((key, value) -> {
                    headers.set(key, value);
                });

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiver.java`
#### Snippet
```java
                    entries.remove();
                    if (options.creditWindow() > 0) {
                        executor.execute(() -> replenishCreditIfNeeded());
                    }
                }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiver.java`
#### Snippet
```java
                    receive.complete(new ClientStreamDelivery(this, delivery));
                    if (options.creditWindow() > 0) {
                        executor.execute(() -> replenishCreditIfNeeded());
                    }
                }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientReceiver.java`
#### Snippet
```java
                    disposition(delivery.protonDelivery(), Accepted.getInstance(), options.autoSettle());
                } else if (options.creditWindow() > 0) {
                    executor.execute(() -> replenishCreditIfNeeded());
                }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientReceiver.java`
#### Snippet
```java
                delivery.disposition(org.apache.qpid.protonj2.client.DeliveryState.accepted(), options.autoSettle());
            } else if (options.creditWindow() > 0) {
                executor.execute(() -> replenishCreditIfNeeded());
            }
        } else {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
        if (bodySections != null) {
            bodySections.forEach(section -> {
                consumer.accept(section);
            });
        } else {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
        } else {
            final Collection<Section<?>> result = new ArrayList<>();
            forEachBodySection(section -> result.add(section));
            return Collections.unmodifiableCollection(result);
        }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/WebSocketTransport.java`
#### Snippet
```java

            options.webSocketHeaders().forEach((key, value) -> {
                headers.set(key, value);
            });

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/WebSocketTransport.java`
#### Snippet
```java

            options.webSocketHeaders().forEach((key, value) -> {
                headers.set(key, value);
            });

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessageSupport.java`
#### Snippet
```java
        ThreadLocal.withInitial(() -> DEFAULT_ENCODER.newEncoderState());
    private static final ThreadLocal<DecoderState> THREAD_LOCAL_DECODER_STATE =
            ThreadLocal.withInitial(() -> DEFAULT_DECODER.newDecoderState());

    //----- Message Conversion
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessageSupport.java`
#### Snippet
```java

    private static final ThreadLocal<EncoderState> THREAD_LOCAL_ENCODER_STATE =
        ThreadLocal.withInitial(() -> DEFAULT_ENCODER.newEncoderState());
    private static final ThreadLocal<DecoderState> THREAD_LOCAL_DECODER_STATE =
            ThreadLocal.withInitial(() -> DEFAULT_DECODER.newDecoderState());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java

        return getCleaner().register(observed, () -> {
            buffer.close();
        });
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/AMQPPerformativeEnvelopePool.java`
#### Snippet
```java
     */
    public static AMQPPerformativeEnvelopePool<OutgoingAMQPEnvelope> outgoingEnvelopePool(int maxPoolSize) {
        return new AMQPPerformativeEnvelopePool<>((pool) -> new OutgoingAMQPEnvelope(pool), maxPoolSize);
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/AMQPPerformativeEnvelopePool.java`
#### Snippet
```java
     */
    public static AMQPPerformativeEnvelopePool<IncomingAMQPEnvelope> incomingEnvelopePool(int maxPoolSize) {
        return new AMQPPerformativeEnvelopePool<>((pool) -> new IncomingAMQPEnvelope(pool), maxPoolSize);
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/AMQPPerformativeEnvelopePool.java`
#### Snippet
```java
     */
    public static AMQPPerformativeEnvelopePool<OutgoingAMQPEnvelope> outgoingEnvelopePool() {
        return new AMQPPerformativeEnvelopePool<>((pool) -> new OutgoingAMQPEnvelope(pool));
    }
}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/AMQPPerformativeEnvelopePool.java`
#### Snippet
```java
     */
    public static AMQPPerformativeEnvelopePool<IncomingAMQPEnvelope> incomingEnvelopePool() {
        return new AMQPPerformativeEnvelopePool<>((pool) -> new IncomingAMQPEnvelope(pool));
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSender.java`
#### Snippet
```java

        if (!toRemove.isEmpty()) {
            toRemove.forEach(deliveryId -> unsettled.remove(deliveryId));
        }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSession.java`
#### Snippet
```java
        connection.getEngine().fireWrite(localBegin, localChannel);
        localBeginSent = true;
        allLinks().forEach(link -> link.trySyncLocalStateWithRemote());
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java

                    if (resourceSyncNeeded) {
                        allSessions().forEach(session -> session.trySyncLocalStateWithRemote());
                    }
                }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonReceiver.java`
#### Snippet
```java

        if (!toRemove.isEmpty()) {
            toRemove.forEach(deliveryId -> unsettled.remove(deliveryId));
        }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/RingQueue.java`
#### Snippet
```java
        this.backingArray = new Object[collection.size()];

        collection.forEach(value -> offer(value));
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/RingQueue.java`
#### Snippet
```java
        }

        c.forEach(value -> offer(value));

        return !c.isEmpty();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java

        if (root == null) {
            root = entryPool.poll(() -> createEntry()).initialize(key, value);
        } else {
            root = splay(root, key);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
                root.value = value;
            } else {
                final SplayedEntry<E> node = entryPool.poll(() -> createEntry()).initialize(key, value);

                if (compare(key, root.key) < 0) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
    public E putIfAbsent(int key, E value) {
        if (root == null) {
            root = entryPool.poll(() -> createEntry()).initialize(key, value);
        } else {
            root = splay(root, key);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
                return root.value;
            } else {
                final SplayedEntry<E> node = entryPool.poll(() -> createEntry()).initialize(key, value);

                if (compare(key, root.key) < 0) {
```

## RuleId[ruleID=ObviousNullCheck]
### ObviousNullCheck
Redundant null-check: literal is never null
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/Symbols.java`
#### Snippet
```java
     */
    public static boolean contains(Symbol[] symbols, Symbol value) {
        Objects.requireNonNull("Value to find cannot be null");

        if (symbols == null || symbols.length == 0) {
```

## RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reset()` overrides synchronized method
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferInputStream.java`
#### Snippet
```java

    @Override
    public void reset() throws IOException {
        if (readOffsetMark == NOT_SET) {
            throw new IOException("The stream has not been marked or the mark was invalidated");
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `mark()` overrides synchronized method
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferInputStream.java`
#### Snippet
```java

    @Override
    public void mark(int readlimit) {
        readOffsetMark = buffer.getReadOffset();
    }
```

## RuleId[ruleID=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `self()` during object construction
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientDeliverable.java`
#### Snippet
```java
        this.receiver = receiver;
        this.delivery = delivery;
        this.delivery.setLinkedResource(self());
    }

```

### AbstractMethodCallInConstructor
Call to 'abstract' method `validateAndScanNextSection()` during object construction
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
            super(deliveryStream);

            validateAndScanNextSection();
        }

```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'policy' in a Serializable class
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/messaging/TerminusExpiryPolicy.java`
#### Snippet
```java
    NEVER("never");

    private Symbol policy;
    private static final Map<Symbol, TerminusExpiryPolicy> map = new HashMap<>();

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'redirect' in a Serializable class
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/exceptions/ClientLinkRedirectedException.java`
#### Snippet
```java
    private static final long serialVersionUID = 5872211116061710369L;

    private final ClientRedirect redirect;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'redirect' in a Serializable class
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/exceptions/ClientConnectionRedirectedException.java`
#### Snippet
```java
    private static final long serialVersionUID = 5872211116061710369L;

    private final ClientRedirect redirect;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'policy' in a Serializable class
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/messaging/TerminusExpiryPolicy.java`
#### Snippet
```java
    private static final Map<Symbol, TerminusExpiryPolicy> map = new HashMap<>();

    private final Symbol policy;

    TerminusExpiryPolicy(String policy) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'condition' in a Serializable class
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/exceptions/ProtocolViolationException.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private Symbol condition;

    public ProtocolViolationException() {
```

## RuleId[ruleID=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/DescribedTypeRegistry.java`
#### Snippet
```java
                Constructor<? extends DescribedType> constructor = typeClass.getConstructor(Object.class);
                return constructor.newInstance(described);
            } catch (Throwable err){
            }
        }
```

### CatchMayIgnoreException
Empty `catch` block
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/NettyClient.java`
#### Snippet
```java
                    return new URI(options.isSecure() ? "ssl" : "tcp", null, host, port, null, null, null);
                }
            } catch (URISyntaxException e) {
            }
        }
```

### CatchMayIgnoreException
Empty `catch` block
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiver.java`
#### Snippet
```java
                try {
                    delivery.getLinkedResource(ClientStreamDelivery.class).handleReceiverClosed(this);
                } catch (Exception ex) {}
            }
        });
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientInstance.java`
#### Snippet
```java
                    try {
                        connection.closeAsync();
                    } catch (Throwable ignored) {
                        LOG.trace("Error while closing connection, ignoring", ignored);
                    }
```

### CatchMayIgnoreException
Empty `catch` block
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientSender.java`
#### Snippet
```java
            try {
                delivery.getLinkedResource(ClientTrackable.class).settlementFuture().failed(cause);
            } catch (Exception e) {
            }
        });
```

### CatchMayIgnoreException
Empty `catch` block
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamDelivery.java`
#### Snippet
```java
            try {
                receiver.disposition(delivery, null, true);
            } catch (Exception error) {
            }
        }
```

### CatchMayIgnoreException
Empty `catch` block
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamDelivery.java`
#### Snippet
```java
                    // returned to the pool and the rest are discarded.
                    buffer.splitComponentsFloor(buffer.getReadOffset()).close();;
                } catch (Exception e) {
                }
            }
```

### CatchMayIgnoreException
Empty `catch` block
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamDelivery.java`
#### Snippet
```java
                    try {
                        buffer.close();
                    } catch (Exception e) {
                    }
                }
```

### CatchMayIgnoreException
'catch' parameter named `ignore` is used
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientConnection.java`
#### Snippet
```java
            try {
                connection.getEngine().shutdown();
            } catch (Throwable ignore) {
                LOG.debug("Unexpected exception thrown from engine shutdown: ", ignore);
            }
```

### CatchMayIgnoreException
Empty `catch` block
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/WebSocketTransport.java`
#### Snippet
```java
            try {
                return new URI(getScheme(), null, host, port, options.webSocketPath(), null, null);
            } catch (URISyntaxException e) {
            }
        }
```

### CatchMayIgnoreException
Empty `catch` block
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/WebSocketTransport.java`
#### Snippet
```java
            try {
                return new URI(getScheme(), null, host, port, options.webSocketPath(), null, null);
            } catch (URISyntaxException e) {
            }
        }
```

### CatchMayIgnoreException
Empty `catch` block
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
                    try {
                        deliveryStream.close();
                    } catch (IOException e) {
                    }
                }
```

### CatchMayIgnoreException
Empty `catch` block
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/TcpTransport.java`
#### Snippet
```java
            try {
                return new URI(getScheme(), null, host, port, null, null, null);
            } catch (URISyntaxException e) {
            }
        }
```

### CatchMayIgnoreException
Empty `catch` block
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/TcpTransport.java`
#### Snippet
```java
            try {
                return new URI(getScheme(), null, host, port, null, null, null);
            } catch (URISyntaxException e) {
            }
        }
```

### CatchMayIgnoreException
Empty `catch` block
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSender.java`
#### Snippet
```java
            try {
                delivery.getLinkedResource(ClientTrackable.class).settlementFuture().failed(cause);
            } catch (Exception e) {
            }
        });
```

## RuleId[ruleID=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/StreamReceiverOptions.java`
#### Snippet
```java
     * @return the {@link StreamReceiverOptions} instance that was given.
     */
    protected StreamReceiverOptions copyInto(StreamReceiverOptions other) {
        super.copyInto(other);

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/TargetOptions.java`
#### Snippet
```java
     * @return the given {@link TargetOptions} instance with all configuration copied from this instance.
     */
    protected TargetOptions copyInto(TargetOptions other) {
        super.copyInto(other);
        return other;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/SourceOptions.java`
#### Snippet
```java
     * @return this {@link SourceOptions} instance.
     */
    protected SourceOptions copyInto(SourceOptions other) {
        super.copyInto(other);
        other.distributionMode(distributionMode);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientConnection.java`
#### Snippet
```java
    }

    protected void checkClosedOrFailed() throws ClientException {
        if (closed > 0) {
            throw new ClientIllegalStateException("The Connection was explicitly closed", failureCause);
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonLink.java`
#### Snippet
```java
                break;
            case ENGINE_SHUTDOWN:
                throw new EngineShutdownException(failurePrefix + ": " + operability.toString());
            default:
                throw new IllegalStateException(failurePrefix + ": " + operability.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonLink.java`
#### Snippet
```java
                throw new EngineShutdownException(failurePrefix + ": " + operability.toString());
            default:
                throw new IllegalStateException(failurePrefix + ": " + operability.toString());
        }
    }
```

## RuleId[ruleID=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/ProtonEncoderState.java`
#### Snippet
```java
                    // with a 4 octet representation
                    if ((c & 0xD800) == 0xD800 && c < 0xDC00) {
                        i++;
                    }
                }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/ProtonEncoderState.java`
#### Snippet
```java
                int low;

                if ((++i == remaining) || ((low = value.charAt(i)) & 0xDC00) != 0xDC00) {
                    throw new IllegalArgumentException("String contains invalid Unicode code points");
                }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
                    lastReadable--;
                    totalChunks--;
                    i--;
                    continue;
                }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
                        lastReadable--;
                        totalChunks--;
                        i--;
                    } else {
                        chain[i] = buffer.split();
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
                        }

                        i += bufferCount - 1;

                        continue;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
            // to reduce fragmentation.
            if (foundFirst) {
                i = removeRange(i, removeStart, removeEnd, foundLast) ? --i : i;
            }
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
            // to reduce fragmentation.
            if (foundFirst) {
                i = removeRange(i, removeStart, removeEnd, foundLast) ? --i : i;
            }
        }
```

## RuleId[ruleID=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `OutputBufferToBinaryFrameHandler` may be 'static'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/WebSocketTransport.java`
#### Snippet
```java
    //----- Handle connection events -----------------------------------------//

    private class OutputBufferToBinaryFrameHandler extends ChannelHandlerAdapter {

        @Override
```

### InnerClassMayBeStatic
Inner class `Netty5ToProtonBufferIterator` may be 'static'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty5ToProtonBufferAdapter.java`
#### Snippet
```java
        }

        private final class Netty5ToProtonBufferIterator implements ProtonBufferIterator {

            private final ByteCursor cursor;
```

### InnerClassMayBeStatic
Inner class `Netty4ToProtonBufferIterator` may be 'static'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty4ToProtonBufferAdapter.java`
#### Snippet
```java
    }

    private final class Netty4ToProtonBufferIterator implements ProtonBufferIterator {

        private final ByteBuf resource;
```

### InnerClassMayBeStatic
Inner class `Netty4ToProtonBufferReverseIterator` may be 'static'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty4ToProtonBufferAdapter.java`
#### Snippet
```java
    }

    private final class Netty4ToProtonBufferReverseIterator implements ProtonBufferIterator {

        private final ByteBuf resource;
```

### InnerClassMayBeStatic
Inner class `ProtonBufferToNetty5ByteCursor` may be 'static'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
    }

    private final class ProtonBufferToNetty5ByteCursor implements ByteCursor {

        private final ProtonBufferIterator iterator;
```

## RuleId[ruleID=Java9CollectionFactory]
### Java9CollectionFactory
Can be replaced with 'List.of()' call
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestServerOptions.java`
#### Snippet
```java
    public static final boolean DEFAULT_TRUST_ALL = false;
    public static final boolean DEFAULT_VERIFY_HOST = true;
    public static final List<String> DEFAULT_DISABLED_PROTOCOLS = Collections.unmodifiableList(Arrays.asList(new String[]{"SSLv2Hello", "SSLv3"}));
    public static final int DEFAULT_LOCAL_PORT = 0;
    public static final boolean DEFAULT_USE_WEBSOCKETS = false;
```

### Java9CollectionFactory
Can be replaced with 'List.of()' call
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ProtonTestClientOptions.java`
#### Snippet
```java
    public static final boolean DEFAULT_TRUST_ALL = false;
    public static final boolean DEFAULT_VERIFY_HOST = true;
    public static final List<String> DEFAULT_DISABLED_PROTOCOLS = Collections.unmodifiableList(Arrays.asList(new String[]{"SSLv2Hello", "SSLv3"}));
    public static final int DEFAULT_LOCAL_PORT = 0;
    public static final boolean DEFAULT_USE_WEBSOCKETS = false;
```

### Java9CollectionFactory
Can be replaced with 'List.of()' call
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/SslOptions.java`
#### Snippet
```java
    public static final boolean DEFAULT_TRUST_ALL = false;
    public static final boolean DEFAULT_VERIFY_HOST = true;
    public static final List<String> DEFAULT_DISABLED_PROTOCOLS = Collections.unmodifiableList(Arrays.asList(new String[]{"SSLv2Hello", "SSLv3"}));
    public static final int DEFAULT_SSL_PORT = 5671;
    public static final boolean DEFAULT_ALLOW_NATIVE_SSL = false;
```

### Java9CollectionFactory
Can be replaced with 'List.of()' call
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/TransportOptions.java`
#### Snippet
```java
    private static final String[] DEFAULT_NATIVEIO_PREFERENCES_ARRAY = { "EPOLL", "KQUEUE" };
    public static final List<String> DEFAULT_NATIVEIO_PREFERENCES =
        Collections.unmodifiableList(Arrays.asList( DEFAULT_NATIVEIO_PREFERENCES_ARRAY ));

    private int sendBufferSize = DEFAULT_SEND_BUFFER_SIZE;
```

### Java9CollectionFactory
Can be replaced with 'List.of()' call
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/ConnectionOptions.java`
#### Snippet
```java

    public static final List<String> DEFAULT_DESIRED_CAPABILITIES =
        Collections.unmodifiableList(Arrays.asList( DEFAULT_DESIRED_CAPABILITIES_ARRAY ));

    public static final long INFINITE = -1;
```

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `waiting` accessed in synchronized context
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ClientFuture.java`
#### Snippet
```java

            synchronized(this) {
                if (waiting > 0) {
                    notifyAll();
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `waiting` accessed in synchronized context
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ClientFuture.java`
#### Snippet
```java

            synchronized(this) {
                if (waiting > 0) {
                    notifyAll();
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `waiting` accessed in synchronized context
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ClientFuture.java`
#### Snippet
```java

            synchronized(this) {
                if (waiting > 0) {
                    notifyAll();
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `waiting` accessed in synchronized context
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ProgressiveClientFuture.java`
#### Snippet
```java
                            break;
                        } else if (getState() < COMPLETING) {
                            waiting++;
                            try {
                                wait(-diff / 1000000, (int) (-diff % 1000000));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `waiting` accessed in synchronized context
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ProgressiveClientFuture.java`
#### Snippet
```java
                                throw e;
                            } finally {
                                waiting--;
                            }
                        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `waiting` accessed in synchronized context
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ProgressiveClientFuture.java`
#### Snippet
```java
                            break;
                        } else if (getState() < COMPLETING) {
                            waiting++;
                            try {
                                wait();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `waiting` accessed in synchronized context
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ProgressiveClientFuture.java`
#### Snippet
```java
                                throw e;
                            } finally {
                                waiting--;
                            }
                        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `waiting` accessed in synchronized context
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/BalancedClientFuture.java`
#### Snippet
```java
                            break;
                        } else if (getState() < COMPLETING) {
                            waiting++;
                            try {
                                wait(-diff / 1000000, (int) (-diff % 1000000));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `waiting` accessed in synchronized context
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/BalancedClientFuture.java`
#### Snippet
```java
                                throw e;
                            } finally {
                                waiting--;
                            }
                        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `waiting` accessed in synchronized context
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/BalancedClientFuture.java`
#### Snippet
```java
                            break;
                        } else if (getState() < COMPLETING) {
                            waiting++;
                            try {
                                wait();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `waiting` accessed in synchronized context
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/BalancedClientFuture.java`
#### Snippet
```java
                                throw e;
                            } finally {
                                waiting--;
                            }
                        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `waiting` accessed in synchronized context
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ConservativeClientFuture.java`
#### Snippet
```java
                    break;
                } else if (getState() < COMPLETING) {
                    waiting++;
                    try {
                        wait();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `waiting` accessed in synchronized context
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ConservativeClientFuture.java`
#### Snippet
```java
                        throw e;
                    } finally {
                        waiting--;
                    }
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `waiting` accessed in synchronized context
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ConservativeClientFuture.java`
#### Snippet
```java
                        break;
                    } else if (getState() < COMPLETING) {
                        waiting++;
                        try {
                            wait(-diff / 1000000, (int) (-diff % 1000000));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `waiting` accessed in synchronized context
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/futures/ConservativeClientFuture.java`
#### Snippet
```java
                            throw e;
                        } finally {
                            waiting--;
                        }
                    }
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientInstance.java`
#### Snippet
```java
    @SuppressWarnings("resource")
    @Override
    public synchronized Connection connect(String host, int port) throws ClientException {
        checkClosed();
        return addConnection(new ClientConnection(this, host, port, defaultConnectionOptions).connect());
```

### RedundantSuppression
Redundant suppression
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientInstance.java`
#### Snippet
```java
    @SuppressWarnings("resource")
    @Override
    public synchronized Connection connect(String host, int port, ConnectionOptions options) throws ClientException {
        checkClosed();
        return addConnection(new ClientConnection(this, host, port, new ConnectionOptions(options)).connect());
```

### RedundantSuppression
Redundant suppression
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientInstance.java`
#### Snippet
```java
    @SuppressWarnings("resource")
    @Override
    public synchronized Connection connect(String host) throws ClientException {
        checkClosed();
        return addConnection(new ClientConnection(this, host, -1, defaultConnectionOptions).connect());
```

### RedundantSuppression
Redundant suppression
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientInstance.java`
#### Snippet
```java
    @SuppressWarnings("resource")
    @Override
    public synchronized Connection connect(String host, ConnectionOptions options) throws ClientException {
        checkClosed();
        return addConnection(new ClientConnection(this, host, -1, new ConnectionOptions(options)).connect());
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/AttachInjectAction.java`
#### Snippet
```java

        public SourceBuilder withDynamic(boolean dynamic) {
            source.setDynamic(Boolean.valueOf(dynamic));
            return this;
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/AttachInjectAction.java`
#### Snippet
```java

        public TargetBuilder withDynamic(boolean dynamic) {
            target.setDynamic(Boolean.valueOf(dynamic));
            return this;
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
        switch (encodingCode) {
            case EncodingCodes.CHAR:
                return Character.valueOf((char) (ProtonStreamUtils.readInt(stream) & 0xFFFF));
            case EncodingCodes.NULL:
                return null;
```

### UnnecessaryBoxing
Unnecessary boxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
        switch (encodingCode) {
            case EncodingCodes.SMALLLONG:
                return Long.valueOf(ProtonStreamUtils.readByte(stream) & 0xffl);
            case EncodingCodes.LONG:
                return ProtonStreamUtils.readLong(stream);
```

### UnnecessaryBoxing
Unnecessary boxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
        switch (encodingCode) {
            case EncodingCodes.CHAR:
                return Character.valueOf((char) (buffer.readInt() & 0xffff));
            case EncodingCodes.NULL:
                return null;
```

### UnnecessaryBoxing
Unnecessary boxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/ShortTypeDecoder.java`
#### Snippet
```java
    @Override
    public Short readValue(InputStream stream, StreamDecoderState state) throws DecodeException {
        return Short.valueOf(ProtonStreamUtils.readShort(stream));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/Integer8TypeDecoder.java`
#### Snippet
```java
    @Override
    public Integer readValue(InputStream stream, StreamDecoderState state) throws DecodeException {
        return Integer.valueOf(ProtonStreamUtils.readByte(stream));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/TimestampTypeDecoder.java`
#### Snippet
```java
    @Override
    public Long readValue(InputStream stream, StreamDecoderState state) throws DecodeException {
        return Long.valueOf(ProtonStreamUtils.readLong(stream));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/Long8TypeDecoder.java`
#### Snippet
```java
    @Override
    public Long readValue(InputStream stream, StreamDecoderState state) throws DecodeException {
        return Long.valueOf(ProtonStreamUtils.readByte(stream));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/CharacterTypeDecoder.java`
#### Snippet
```java
    @Override
    public Character readValue(InputStream stream, StreamDecoderState state) throws DecodeException {
        return Character.valueOf((char) ProtonStreamUtils.readInt(stream));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/CharacterTypeDecoder.java`
#### Snippet
```java
    @Override
    public Character readValue(ProtonBuffer buffer, DecoderState state) throws DecodeException {
        return Character.valueOf((char) (buffer.readInt() & 0xffff));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/primitives/LongTypeDecoder.java`
#### Snippet
```java
    @Override
    public Long readValue(InputStream stream, StreamDecoderState state) throws DecodeException {
        return Long.valueOf(ProtonStreamUtils.readLong(stream));
    }

```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/HelloWorld.java`
#### Snippet
```java
            Delivery delivery = receiver.receive();
            Message<String> received = delivery.message();
            System.out.println("Received message with body: " + received.body());
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/TransactedReceiver.java`
#### Snippet
```java
            Message<String> message = delivery.message();

            System.out.println("Received message with body: " + message.body());

            session.commitTransaction();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/Request.java`
#### Snippet
```java

            String dynamicAddress = dynamicReceiver.address();
            System.out.println("Waiting for response to requests on address: " + dynamicAddress);

            SenderOptions senderOptions = new SenderOptions();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/Request.java`
#### Snippet
```java
            Delivery response = dynamicReceiver.receive(30, TimeUnit.SECONDS);
            Message<String> received = response.message();
            System.out.println("Received message with body: " + received.body());
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/Respond.java`
#### Snippet
```java
            if (request != null) {
                Message<String> received = request.message();
                System.out.println("Received message with body: " + received.body());

                String replyAddress = received.replyTo();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/Respond.java`
#### Snippet
```java
                }
            } else {
                System.out.println("Failed to read a message during the defined wait interval.");
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/LargeMessageReceiver.java`
#### Snippet
```java

            while (inputStream.read(chunk) != -1) {
                System.out.println(String.format("Read data chunk [%2d]: %s", ++readCount, Arrays.toString(chunk)));
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/StreamingFileReceiver.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Example requires a valid directory where the incoming file should be written");
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/StreamingFileReceiver.java`
#### Snippet
```java
        final File outputPath = new File(args[0]);
        if (!outputPath.isDirectory() || !outputPath.canWrite()) {
            System.out.println("Example requires a valid / writable directory to transfer to");
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/StreamingFileReceiver.java`
#### Snippet
```java
            String filename = (String) message.property(fileNameKey);
            if (filename == null || filename.isBlank()) {
                System.out.println("Remote did not include the source filename in the incoming message");
                System.exit(1);
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/StreamingFileReceiver.java`
#### Snippet
```java
                System.exit(1);
            } else {
                System.out.println("Starting receive of incoming file named: " + filename);
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/StreamingFileReceiver.java`
#### Snippet
```java
            }

            System.out.println("Received file written to: " + new File(outputPath, filename));
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/StreamingFileSender.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Example requires a valid file name to transfer");
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/StreamingFileSender.java`
#### Snippet
```java
        final File inputFile = new File(args[0]);
        if (!inputFile.exists() || !inputFile.canRead()) {
            System.out.println("Example requires a valid / readable file to transfer");
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/Send.java`
#### Snippet
```java
                tracker.awaitSettlement();

                System.out.println(String.format("Sent message to %s: %s", sender.address(), message.body()));
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/Receive.java`
#### Snippet
```java
                Message<String> message = delivery.message();

                System.out.println("Received message with body: " + message.body());
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/NextReceiver.java`
#### Snippet
```java
            final Delivery delivery2 = connection.nextReceiver().receive();

            System.out.println("Received first message with body: " + delivery1.message().body());
            System.out.println("Received second message with body: " + delivery2.message().body());
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/NextReceiver.java`
#### Snippet
```java

            System.out.println("Received first message with body: " + delivery1.message().body());
            System.out.println("Received second message with body: " + delivery2.message().body());
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/reconnect/ReconnectSender.java`
#### Snippet
```java
                    sentCount++;
                } catch (Exception ex) {
                    System.out.println("Caught exception during send, will retry on next connect");
                }
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/reconnect/ReconnectSender.java`
#### Snippet
```java
            }
        } catch (Exception exp) {
            System.out.println("Caught exception, exiting.");
            exp.printStackTrace(System.out);
            System.exit(1);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/reconnect/ReconnectSender.java`
#### Snippet
```java
        } catch (Exception exp) {
            System.out.println("Caught exception, exiting.");
            exp.printStackTrace(System.out);
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/reconnect/ReconnectReceiver.java`
#### Snippet
```java
                Delivery delivery = receiver.receive();
                Message<String> message = delivery.message();
                System.out.println(message.body());
            }
        } catch (Exception exp) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/reconnect/ReconnectReceiver.java`
#### Snippet
```java
            }
        } catch (Exception exp) {
            System.out.println("Caught exception, exiting.");
            exp.printStackTrace(System.out);
            System.exit(1);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/reconnect/ReconnectReceiver.java`
#### Snippet
```java
        } catch (Exception exp) {
            System.out.println("Caught exception, exiting.");
            exp.printStackTrace(System.out);
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonFrameLoggingHandler.java`
#### Snippet
```java
    private static final void trace(String prefix, int connection, int channel, Object performative, ProtonBuffer payload) {
        if (payload == null) {
            System.out.println(String.format("%s:[%d:%d] %s", prefix, connection, channel, performative));
        } else {
            System.out.println(String.format("%s:[%d:%d] %s - %s", prefix, connection, channel, performative, StringUtils.toQuotedString(payload, PAYLOAD_STRING_LIMIT, true)));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonFrameLoggingHandler.java`
#### Snippet
```java
            System.out.println(String.format("%s:[%d:%d] %s", prefix, connection, channel, performative));
        } else {
            System.out.println(String.format("%s:[%d:%d] %s - %s", prefix, connection, channel, performative, StringUtils.toQuotedString(payload, PAYLOAD_STRING_LIMIT, true)));
        }
    }
```

## RuleId[ruleID=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/StringElement.java`
#### Snippet
```java
class StringElement extends AtomicElement<String> {

    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final String value;

```

### CharsetObjectCanBeUsed
StandardCharsets.US_ASCII can be used instead
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/SymbolElement.java`
#### Snippet
```java
class SymbolElement extends AtomicElement<Symbol> {

    private static final Charset ASCII = Charset.forName("US-ASCII");
    private final Symbol value;

```

### CharsetObjectCanBeUsed
StandardCharsets.US_ASCII can be used instead
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/TypeDecoder.java`
#### Snippet
```java
class TypeDecoder {

    private static final Charset ASCII = Charset.forName("US-ASCII");
    private static final Charset UTF_8 = Charset.forName("UTF-8");

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/TypeDecoder.java`
#### Snippet
```java

    private static final Charset ASCII = Charset.forName("US-ASCII");
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    private static final TypeConstructor[] constructors = new TypeConstructor[256];
```

### CharsetObjectCanBeUsed
StandardCharsets.US_ASCII can be used instead
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/sasl/client/CramMD5Mechanism.java`
#### Snippet
```java
        if (!sentResponse && challenge != null && challenge.getReadableBytes() != 0) {
            try {
                SecretKeySpec key = new SecretKeySpec(credentials.password().getBytes(ASCII), HMACMD5);
                Mac mac = Mac.getInstance(HMACMD5);
                mac.init(key);
```

### CharsetObjectCanBeUsed
StandardCharsets.US_ASCII can be used instead
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/sasl/client/CramMD5Mechanism.java`
#### Snippet
```java
                sentResponse = true;

                return ProtonBufferAllocator.defaultAllocator().copy(hash.toString().getBytes(ASCII)).convertToReadOnly();
            } catch (UnsupportedEncodingException e) {
                throw new SaslException("Unable to utilize required encoding", e);
```

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'o == null' covered by subsequent condition '!(o instanceof DescribedType)'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/DescribedTypeImpl.java`
#### Snippet
```java
            return true;
        }
        if (o == null || !(o instanceof DescribedType)) {
            return false;
        }
```

### ConditionCoveredByFurtherCondition
Condition 'handler != null' covered by subsequent condition 'handler instanceof ProtonFrameLoggingHandler'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEngineConfiguration.java`
#### Snippet
```java
        // the setting will have no effect and isTraceFrames will always return false
        EngineHandler handler = engine.pipeline().find(ProtonConstants.FRAME_LOGGING_HANDLER);
        if (handler != null && handler instanceof ProtonFrameLoggingHandler) {
            ((ProtonFrameLoggingHandler) handler).setTraceFrames(traceFrames);
        } else {
```

### ConditionCoveredByFurtherCondition
Condition 'handler != null' covered by subsequent condition 'handler instanceof ProtonFrameLoggingHandler'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEngineConfiguration.java`
#### Snippet
```java
    public boolean isTraceFrames() {
        EngineHandler handler = engine.pipeline().find(ProtonConstants.FRAME_LOGGING_HANDLER);
        if (handler != null && handler instanceof ProtonFrameLoggingHandler) {
            return ((ProtonFrameLoggingHandler) handler).isTraceFrames();
        } else {
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.qpid.protonj2.test.driver.codec` is unnecessary, and can be replaced with an import
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/TransferInjectAction.java`
#### Snippet
```java

    private Buffer encodePayload() {
        org.apache.qpid.protonj2.test.driver.codec.Codec codec =
            org.apache.qpid.protonj2.test.driver.codec.Codec.Factory.create();
        final Buffer buffer = BufferAllocator.onHeapUnpooled().allocate(128);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.qpid.protonj2.test.driver.codec` is unnecessary, and can be replaced with an import
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/TransferInjectAction.java`
#### Snippet
```java
    private Buffer encodePayload() {
        org.apache.qpid.protonj2.test.driver.codec.Codec codec =
            org.apache.qpid.protonj2.test.driver.codec.Codec.Factory.create();
        final Buffer buffer = BufferAllocator.onHeapUnpooled().allocate(128);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.qpid.protonj2.types.messaging` is unnecessary, and can be replaced with an import
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientDeliveryState.java`
#### Snippet
```java
    //----- Create Delivery State from Proton instance

    static DeliveryState fromProtonType(org.apache.qpid.protonj2.types.messaging.Outcome outcome) {
        if (outcome == null) {
            return null;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.qpid.protonj2.client` is unnecessary and can be removed
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientDeliveryState.java`
#### Snippet
```java

    /**
     * Returns the Proton version of the specific {@link org.apache.qpid.protonj2.client.DeliveryState} that
     * this type represents.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.qpid.protonj2.engine` is unnecessary and can be removed
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientReceiverLinkType.java`
#### Snippet
```java

    @Override
    protected org.apache.qpid.protonj2.engine.Receiver protonLink() {
        return protonReceiver;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.qpid.protonj2.engine` is unnecessary and can be removed
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientReceiverLinkType.java`
#### Snippet
```java
    }

    protected void handleReceiverCreditUpdated(org.apache.qpid.protonj2.engine.Receiver receiver) {
        LOG.trace("Receiver credit update by remote: {}", receiver);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.qpid.protonj2.engine` is unnecessary, and can be replaced with an import
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiver.java`
#### Snippet
```java
    private final Map<ClientFuture<StreamDelivery>, Future<?>> receiveRequests = new LinkedHashMap<>();

    ClientStreamReceiver(ClientSession session, StreamReceiverOptions options, String receiverId, org.apache.qpid.protonj2.engine.Receiver receiver) {
        super(session, receiverId, options, receiver);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.qpid.protonj2.client` is unnecessary, and can be replaced with an import
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientReceiver.java`
#### Snippet
```java
        if (delivery != null) {
            if (options.autoAccept()) {
                delivery.disposition(org.apache.qpid.protonj2.client.DeliveryState.accepted(), options.autoSettle());
            } else if (options.creditWindow() > 0) {
                executor.execute(() -> replenishCreditIfNeeded());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.qpid.protonj2.types.messaging` is unnecessary, and can be replaced with an import
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientSenderLinkType.java`
#### Snippet
```java

    final boolean isAnonymous() {
        return protonSender.<org.apache.qpid.protonj2.types.messaging.Target>getTarget().getAddress() == null;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/ThreadPoolUtils.java`
#### Snippet
```java
     * @return list of tasks that never commenced execution
     *
     * @see java.util.concurrent.ExecutorService#shutdownNow()
     */
    public static List<Runnable> shutdownNow(ExecutorService executorService) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/ThreadPoolUtils.java`
#### Snippet
```java
     * Will try to perform an orderly shutdown by giving the running threads time to complete
     * tasks, before going more aggressively by doing a
     * {@link #shutdownNow(java.util.concurrent.ExecutorService)} which forces a shutdown. The
     * parameter <code>shutdownAwaitTermination</code> is used as timeout value waiting for orderly
     * shutdown to complete normally, before going aggressively.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/ThreadPoolUtils.java`
#### Snippet
```java
     * <p>
     * This implementation invokes the
     * {@link #shutdownGraceful(java.util.concurrent.ExecutorService, long)} with a timeout
     * value of {@link #DEFAULT_SHUTDOWN_AWAIT_TERMINATION} millis.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/ThreadPoolUtils.java`
#### Snippet
```java
     *        The ExecutorService that is being shutdown.
     *
     * @see java.util.concurrent.ExecutorService#shutdown()
     */
    public static void shutdown(ExecutorService executorService) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary, and can be replaced with an import
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/Netty4IOContext.java`
#### Snippet
```java

        @Override
        public java.util.concurrent.Future<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
            return group.scheduleAtFixedRate(command, initialDelay, period, unit);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary, and can be replaced with an import
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/Netty4IOContext.java`
#### Snippet
```java

        @Override
        public <V> java.util.concurrent.Future<V> schedule(Callable<V> task, long delay, TimeUnit unit) {
            return group.schedule(task, delay, unit);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary, and can be replaced with an import
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/Netty4IOContext.java`
#### Snippet
```java

        @Override
        public java.util.concurrent.Future<?> schedule(Runnable command, long delay, TimeUnit unit) {
            return group.schedule(command, delay, unit);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary, and can be replaced with an import
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/Netty4IOContext.java`
#### Snippet
```java

        @Override
        public java.util.concurrent.Future<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) {
            return group.scheduleWithFixedDelay(command, initialDelay, delay, unit);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.qpid.protonj2.engine` is unnecessary, and can be replaced with an import
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSender.java`
#### Snippet
```java
    private final Deque<ClientOutgoingEnvelope> blocked = new ArrayDeque<>();

    ClientStreamSender(ClientSession session, StreamSenderOptions options, String senderId, org.apache.qpid.protonj2.engine.Sender protonSender) {
        super(session, senderId, options, protonSender);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.qpid.protonj2.engine` is unnecessary, and can be replaced with an import
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSender.java`
#### Snippet
```java
    //----- Handlers for proton receiver events

    private void handleCreditStateUpdated(org.apache.qpid.protonj2.engine.Sender sender) {
        if (!blocked.isEmpty()) {
            while (sender.isSendable() && !blocked.isEmpty()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.qpid.protonj2.buffer` is unnecessary and can be removed
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/PerformativeEncoder.java`
#### Snippet
```java
 * cache the specific type encoders for various section types and use them
 * directly instead of looking them up via calls to
 * {@link Encoder#writeObject(org.apache.qpid.protonj2.buffer.ProtonBuffer, EncoderState, Object)}
 */
public final class PerformativeEncoder implements PerformativeHandler<Encoder> {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.qpid.protonj2.buffer` is unnecessary and can be removed
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/SectionEncoder.java`
#### Snippet
```java
 * AMQP Section type specific encoder that uses any {@link Encoder} to
 * cache the specific type encoders for various section types and use them
 * directly instead of looking them up via calls to {@link Encoder#writeObject(org.apache.qpid.protonj2.buffer.ProtonBuffer, EncoderState, Object)}
 */
public final class SectionEncoder {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBuffer.java`
#### Snippet
```java
    /**
     * Returns a String created from the buffer's underlying bytes using the specified
     * {@link java.nio.charset.Charset} for the newly created String.
     *
     * @param charset
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBuffer.java`
#### Snippet
```java
     *
     * @param charset
     *      the {@link java.nio.charset.Charset} to use to construct the new string.
     *
     * @return a string created from the buffer's underlying bytes using the given {@link java.nio.charset.Charset}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBuffer.java`
#### Snippet
```java
     *      the {@link java.nio.charset.Charset} to use to construct the new string.
     *
     * @return a string created from the buffer's underlying bytes using the given {@link java.nio.charset.Charset}.
     */
    default String toString(Charset charset) {
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/NettyServer.java`
#### Snippet
```java
            LOG.info("NettyServerHandler: NettyServerHandlerException caught on channel: {}", ctx.channel());
            // Close the connection when an exception is raised.
            cause.printStackTrace();
            ctx.close();
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/Netty4IOContext.java`
#### Snippet
```java
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/Netty5IOContext.java`
#### Snippet
```java
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `protonj2-client-examples/src/main/java/org/apache/qpid/protonj2/client/examples/NextReceiver.java`
#### Snippet
```java
                    connection.send(Message.create("Hello World 2").to(address2));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
```

## RuleId[ruleID=ReplaceNullCheck]
### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElseGet()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiver.java`
#### Snippet
```java
            }

            if (failureCause != null) {
                future.failed(failureCause);
            } else {
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElseGet()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientSender.java`
#### Snippet
```java
    @Override
    protected void linkSpecificCleanupHandler(ClientException failureCause) {
        if (failureCause != null) {
            failPendingUnsettledAndBlockedSends(failureCause);
        } else {
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElseGet()'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSender.java`
#### Snippet
```java
        }

        if (failureCause != null) {
            failPendingUnsettledAndBlockedSends(failureCause);
        } else {
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElseGet()'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/OutgoingAMQPEnvelope.java`
#### Snippet
```java
     */
    public OutgoingAMQPEnvelope setPayloadToLargeHandler(Consumer<Performative> payloadToLargeHandler) {
        if (payloadToLargeHandler != null) {
            this.payloadToLargeHandler = payloadToLargeHandler;
        } else {
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `LinkTracker()` of an abstract class should not be declared 'public'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/LinkTracker.java`
#### Snippet
```java
    private Detach localDetach;

    public LinkTracker(SessionTracker session) {
        this.session = session;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `MapDescribedType()` of an abstract class should not be declared 'public'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/MapDescribedType.java`
#### Snippet
```java
    private final Map<Object, Object> fields;

    public MapDescribedType() {
        fields = new HashMap<>();
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ListDescribedType()` of an abstract class should not be declared 'public'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ListDescribedType.java`
#### Snippet
```java
    }

    public ListDescribedType(int numberOfFields, List<Object> described) {
        if (described.size() > numberOfFields) {
            throw new IllegalArgumentException("List encoded exceeds expected number of elements for this type");
```

### NonProtectedConstructorInAbstractClass
Constructor `ListDescribedType()` of an abstract class should not be declared 'public'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ListDescribedType.java`
#### Snippet
```java
    private final ArrayList<Object> fields;

    public ListDescribedType(int numberOfFields) {
        fields = new ArrayList<>(numberOfFields);

```

### NonProtectedConstructorInAbstractClass
Constructor `ListDescribedType()` of an abstract class should not be declared 'public'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ListDescribedType.java`
#### Snippet
```java
    }

    public ListDescribedType(int numberOfFields, ListDescribedType described) {
        if (described.fields.size() > numberOfFields) {
            throw new IllegalArgumentException("List encoded exceeds expected number of elements for this type");
```

### NonProtectedConstructorInAbstractClass
Constructor `SaslDescribedType()` of an abstract class should not be declared 'public'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/security/SaslDescribedType.java`
#### Snippet
```java
    }

    public SaslDescribedType(int numberOfFields) {
        super(numberOfFields);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SaslDescribedType()` of an abstract class should not be declared 'public'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/security/SaslDescribedType.java`
#### Snippet
```java
    }

    public SaslDescribedType(int numberOfFields, List<Object> described) {
        super(numberOfFields, described);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `PerformativeDescribedType()` of an abstract class should not be declared 'public'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/transport/PerformativeDescribedType.java`
#### Snippet
```java
    }

    public PerformativeDescribedType(int numberOfFields, List<Object> described) {
        super(numberOfFields, described);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `PerformativeDescribedType()` of an abstract class should not be declared 'public'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/transport/PerformativeDescribedType.java`
#### Snippet
```java
    }

    public PerformativeDescribedType(int numberOfFields) {
        super(numberOfFields);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSaslPerformativeInjectAction()` of an abstract class should not be declared 'public'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/AbstractSaslPerformativeInjectAction.java`
#### Snippet
```java
    private int channel = CHANNEL_UNSET;

    public AbstractSaslPerformativeInjectAction(AMQPTestDriver driver) {
        this.driver = driver;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `NettyServer()` of an abstract class should not be declared 'public'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/NettyServer.java`
#### Snippet
```java
    private final AtomicBoolean started = new AtomicBoolean();

    public NettyServer(ProtonTestServerOptions options) {
        this.options = options;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `NettyClient()` of an abstract class should not be declared 'public'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/NettyClient.java`
#### Snippet
```java
    protected final CountDownLatch connectedLatch = new CountDownLatch(1);

    public NettyClient(ProtonTestClientOptions options) {
        this.options = options;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractPerformativeInjectAction()` of an abstract class should not be declared 'public'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/AbstractPerformativeInjectAction.java`
#### Snippet
```java
    private boolean deferred = false;

    public AbstractPerformativeInjectAction(AMQPTestDriver driver) {
        this.driver = driver;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `EncodedAmqpTypeMatcher()` of an abstract class should not be declared 'public'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/matchers/types/EncodedAmqpTypeMatcher.java`
#### Snippet
```java
    }

    public EncodedAmqpTypeMatcher(Symbol symbol, UnsignedLong code, Object expectedValue, boolean permitTrailingBytes) {
        this.descriptorSymbol = symbol;
        this.descriptorCode = code;
```

### NonProtectedConstructorInAbstractClass
Constructor `EncodedAmqpTypeMatcher()` of an abstract class should not be declared 'public'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/matchers/types/EncodedAmqpTypeMatcher.java`
#### Snippet
```java
    private boolean unexpectedTrailingBytes;

    public EncodedAmqpTypeMatcher(Symbol symbol, UnsignedLong code, Object expectedValue) {
        this(symbol, code, expectedValue, false);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ListDescribedTypeMatcher()` of an abstract class should not be declared 'public'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/matchers/ListDescribedTypeMatcher.java`
#### Snippet
```java
    protected final Map<Enum<?>, Matcher<?>> fieldMatchers = new LinkedHashMap<>();

    public ListDescribedTypeMatcher(int numFields, UnsignedLong code, Symbol symbol) {
        this.descriptorCode = code;
        this.descriptorSymbol = symbol;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractMapSectionMatcher()` of an abstract class should not be declared 'public'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/matchers/messaging/AbstractMapSectionMatcher.java`
#### Snippet
```java
public abstract class AbstractMapSectionMatcher extends AbstractMessageSectionMatcher {

    public AbstractMapSectionMatcher(UnsignedLong numericDescriptor, Symbol symbolicDescriptor, Map<Object, Matcher<?>> fieldMatchers, boolean expectTrailingBytes) {
        super(numericDescriptor, symbolicDescriptor, fieldMatchers, expectTrailingBytes);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractListSectionMatcher()` of an abstract class should not be declared 'public'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/matchers/messaging/AbstractListSectionMatcher.java`
#### Snippet
```java
public abstract class AbstractListSectionMatcher extends AbstractMessageSectionMatcher {

    public AbstractListSectionMatcher(UnsignedLong numericDescriptor, Symbol symbolicDescriptor, Map<Object, Matcher<?>> fieldMatchers, boolean expectTrailingBytes) {
        super(numericDescriptor, symbolicDescriptor, fieldMatchers, expectTrailingBytes);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractExpectation()` of an abstract class should not be declared 'public'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/expectations/AbstractExpectation.java`
#### Snippet
```java
    private boolean optional;

    public AbstractExpectation(AMQPTestDriver driver) {
        this.driver = driver;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `LinkOptions()` of an abstract class should not be declared 'public'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/LinkOptions.java`
#### Snippet
```java
     * 		The LinkOptions instance whose settings are to be copied into this one.
     */
    public LinkOptions(LinkOptions<T> options) {
        if (options != null) {
            options.copyInto(this);
```

### NonProtectedConstructorInAbstractClass
Constructor `LinkOptions()` of an abstract class should not be declared 'public'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/LinkOptions.java`
#### Snippet
```java
     * Create a new LinkOptions instance with defaults set for all options.
     */
    public LinkOptions() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `StreamMessageOutputStream()` of an abstract class should not be declared 'public'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java
        protected int bytesWritten;

        public StreamMessageOutputStream(OutputStreamOptions options, ProtonBuffer buffer) {
            this.options = options;
            this.streamBuffer = buffer;
```

### NonProtectedConstructorInAbstractClass
Constructor `NettyDefaultHandler()` of an abstract class should not be declared 'public'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/TcpTransport.java`
#### Snippet
```java
    protected abstract class NettyDefaultHandler<E> extends SimpleChannelInboundHandler<E> {

        public NettyDefaultHandler() {
            super(false); // We will release buffer references manually.
        }
```

### NonProtectedConstructorInAbstractClass
Constructor `NettyDefaultHandler()` of an abstract class should not be declared 'public'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/TcpTransport.java`
#### Snippet
```java
    protected abstract class NettyDefaultHandler<E> extends SimpleChannelInboundHandler<E> {

        public NettyDefaultHandler() {
            super(false); // We will release buffer references manually.
        }
```

### NonProtectedConstructorInAbstractClass
Constructor `ProtonEndpoint()` of an abstract class should not be declared 'public'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEndpoint.java`
#### Snippet
```java
     *      The {@link Engine} that this {@link Endpoint} belongs to.
     */
    public ProtonEndpoint(ProtonEngine engine) {
        this.engine = engine;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `EngineStateException()` of an abstract class should not be declared 'public'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/exceptions/EngineStateException.java`
#### Snippet
```java
    }

    public EngineStateException(String message) {
        super(message);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `EngineStateException()` of an abstract class should not be declared 'public'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/exceptions/EngineStateException.java`
#### Snippet
```java
    }

    public EngineStateException(Throwable cause) {
        super(cause);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `EngineStateException()` of an abstract class should not be declared 'public'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/exceptions/EngineStateException.java`
#### Snippet
```java
    }

    public EngineStateException(String message, Throwable cause) {
        super(message, cause);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `EngineStateException()` of an abstract class should not be declared 'public'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/exceptions/EngineStateException.java`
#### Snippet
```java
    private static final long serialVersionUID = 4191691747006604768L;

    public EngineStateException() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `LinkedSplayMapIterator()` of an abstract class should not be declared 'public'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/LinkedSplayMap.java`
#### Snippet
```java
        private int expectedModCount;

        public LinkedSplayMapIterator(SplayedEntry<E> startAt) {
            this.nextNode = startAt;
            this.expectedModCount = LinkedSplayMap.this.modCount;
```

### NonProtectedConstructorInAbstractClass
Constructor `UnsettledTrackingMapIterator()` of an abstract class should not be declared 'public'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
        protected int expectedModCount;

        public UnsettledTrackingMapIterator(int startAt) {
            this.currentBucket = buckets[startAt].isReadable() ? startAt : -1;
            this.readOffset = buckets[startAt].isReadable() ? buckets[startAt].readOffset : -1;
```

### NonProtectedConstructorInAbstractClass
Constructor `SplayMapIterator()` of an abstract class should not be declared 'public'
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        protected int expectedModCount;

        public SplayMapIterator(SplayedEntry<E> startAt) {
            this.nextNode = startAt;
            this.expectedModCount = SplayMap.this.modCount;
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new FutureListener() can be replaced with lambda
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/NettyServer.java`
#### Snippet
```java
            SslHandler handler = ctx.pipeline().get(SslHandler.class);
            if (handler != null) {
                handler.handshakeFuture().addListener(new FutureListener<Channel>() {
                    @Override
                    public void operationComplete(Future<? extends Channel> future) throws Exception {
```

### Convert2Lambda
Anonymous new FutureListener() can be replaced with lambda
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/NettyClient.java`
#### Snippet
```java
            } else {
                SslHandler sslHandler = context.pipeline().get(SslHandler.class);
                sslHandler.handshakeFuture().addListener(new FutureListener<Channel>() {
                    @Override
                    public void operationComplete(Future<? extends Channel> future) throws Exception {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/TrackableThreadFactory.java`
#### Snippet
```java

        if (threadTracker != null) {
            runner = new Runnable() {

                @Override
```

### Convert2Lambda
Anonymous new UncaughtExceptionHandler() can be replaced with lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/TrackableThreadFactory.java`
#### Snippet
```java
        Thread thread = new Thread(runner, threadName);
        thread.setDaemon(daemon);
        thread.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {

            @Override
```

### Convert2Lambda
Anonymous new FutureListener() can be replaced with lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/WebSocketTransport.java`
#### Snippet
```java
        @Override
        public void channelActive(ChannelHandlerContext context) throws Exception {
            handshaker.handshake(context.channel()).addListener(new FutureListener<Void>() {

                @Override
```

### Convert2Lambda
Anonymous new FutureListener() can be replaced with lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/TcpTransport.java`
#### Snippet
```java
            } else {
                SslHandler sslHandler = context.pipeline().get(SslHandler.class);
                sslHandler.handshakeFuture().addListener(new FutureListener<Channel>() {
                    @Override
                    public void operationComplete(Future<? extends Channel> future) throws Exception {
```

### Convert2Lambda
Anonymous new FutureListener() can be replaced with lambda
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/TcpTransport.java`
#### Snippet
```java
        configureNetty(bootstrap, options);

        bootstrap.connect(getHost(), getPort()).addListener(new FutureListener<Channel>() {

            @Override
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `elt`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/AbstractElement.java`
#### Snippet
```java
    public Element<?> replaceWith(Element<?> elt) {
        if (parent != null) {
            elt = parent.checkChild(elt);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `element`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/CodecImpl.java`
#### Snippet
```java
                if (parent == null) {
                    first = first.replaceWith(element);
                    element = first;
                } else {
                    element = parent.addChild(element);
```

### AssignmentToMethodParameter
Assignment to method parameter `element`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/CodecImpl.java`
#### Snippet
```java
                    element = first;
                } else {
                    element = parent.addChild(element);
                }
            } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `element`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/CodecImpl.java`
#### Snippet
```java
            } else {
                if (parent != null) {
                    element = parent.checkChild(element);
                }
                current.setNext(element);
```

### AssignmentToMethodParameter
Assignment to method parameter `symbolBuffer`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/primitives/Symbol.java`
#### Snippet
```java
                symbolBuffer.get(copy, 0, symbolSize);
                symbolBuffer.position(symbolBuffer.position() - symbolSize);
                symbolBuffer = ByteBuffer.wrap(copy);
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `queryString`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/NettyServer.java`
#### Snippet
```java

        if (queryString != null && queryString.startsWith("?")) {
            queryString = queryString.substring(1);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/TransferInjectAction.java`
#### Snippet
```java

    private static byte[] writeLong(long value, byte[] destination, int offset) {
        destination[offset++] = (byte) (value >>> 56);
        destination[offset++] = (byte) (value >>> 48);
        destination[offset++] = (byte) (value >>> 40);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/TransferInjectAction.java`
#### Snippet
```java
    private static byte[] writeLong(long value, byte[] destination, int offset) {
        destination[offset++] = (byte) (value >>> 56);
        destination[offset++] = (byte) (value >>> 48);
        destination[offset++] = (byte) (value >>> 40);
        destination[offset++] = (byte) (value >>> 32);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/TransferInjectAction.java`
#### Snippet
```java
        destination[offset++] = (byte) (value >>> 56);
        destination[offset++] = (byte) (value >>> 48);
        destination[offset++] = (byte) (value >>> 40);
        destination[offset++] = (byte) (value >>> 32);
        destination[offset++] = (byte) (value >>> 24);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/TransferInjectAction.java`
#### Snippet
```java
        destination[offset++] = (byte) (value >>> 48);
        destination[offset++] = (byte) (value >>> 40);
        destination[offset++] = (byte) (value >>> 32);
        destination[offset++] = (byte) (value >>> 24);
        destination[offset++] = (byte) (value >>> 16);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/TransferInjectAction.java`
#### Snippet
```java
        destination[offset++] = (byte) (value >>> 40);
        destination[offset++] = (byte) (value >>> 32);
        destination[offset++] = (byte) (value >>> 24);
        destination[offset++] = (byte) (value >>> 16);
        destination[offset++] = (byte) (value >>> 8);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/TransferInjectAction.java`
#### Snippet
```java
        destination[offset++] = (byte) (value >>> 32);
        destination[offset++] = (byte) (value >>> 24);
        destination[offset++] = (byte) (value >>> 16);
        destination[offset++] = (byte) (value >>> 8);
        destination[offset++] = (byte) (value >>> 0);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/TransferInjectAction.java`
#### Snippet
```java
        destination[offset++] = (byte) (value >>> 24);
        destination[offset++] = (byte) (value >>> 16);
        destination[offset++] = (byte) (value >>> 8);
        destination[offset++] = (byte) (value >>> 0);

```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/TransferInjectAction.java`
#### Snippet
```java
        destination[offset++] = (byte) (value >>> 16);
        destination[offset++] = (byte) (value >>> 8);
        destination[offset++] = (byte) (value >>> 0);

        return destination;
```

### AssignmentToMethodParameter
Assignment to method parameter `timeout`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/FifoDeliveryQueue.java`
#### Snippet
```java
                        waiters--;
                    }
                    timeout = Math.max(timeout + start - System.currentTimeMillis(), 0);
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `incoming`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java

    private void appendDataToBuffer(ProtonBuffer incoming) throws ClientException {
        incoming = Objects.requireNonNull(incoming, "Appended buffer cannot be null").convertToReadOnly();

        if (buffer == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `uptime`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/TimeUtils.java`
#### Snippet
```java
        NumberFormat fmtD = new DecimalFormat("###,##0.000", new DecimalFormatSymbols(Locale.ENGLISH));

        uptime /= 1000;
        if (uptime < 60) {
            return fmtD.format(uptime) + " seconds";
```

### AssignmentToMethodParameter
Assignment to method parameter `uptime`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/TimeUtils.java`
#### Snippet
```java
            return fmtD.format(uptime) + " seconds";
        }
        uptime /= 60;
        if (uptime < 60) {
            long minutes = (long) uptime;
```

### AssignmentToMethodParameter
Assignment to method parameter `uptime`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/TimeUtils.java`
#### Snippet
```java
            return s;
        }
        uptime /= 60;
        if (uptime < 24) {
            long hours = (long) uptime;
```

### AssignmentToMethodParameter
Assignment to method parameter `uptime`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/TimeUtils.java`
#### Snippet
```java
            return s;
        }
        uptime /= 24;
        long days = (long) uptime;
        long hours = (long) ((uptime - days) * 24);
```

### AssignmentToMethodParameter
Assignment to method parameter `position`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/ProtonEncoderState.java`
#### Snippet
```java
            if ((c & 0xFF80) == 0) {
                // U+0000..U+007F
                buffer.setByte(position++, (byte) c);
            } else if ((c & 0xF800) == 0) {
                // U+0080..U+07FF
```

### AssignmentToMethodParameter
Assignment to method parameter `position`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/ProtonEncoderState.java`
#### Snippet
```java
            } else if ((c & 0xF800) == 0) {
                // U+0080..U+07FF
                buffer.setByte(position++, (byte)(0xC0 | ((c >> 6) & 0x1F)));
                buffer.setByte(position++, (byte)(0x80 | (c & 0x3F)));
            } else if ((c & 0xD800) != 0xD800 || (c > 0xDBFF)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `position`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/ProtonEncoderState.java`
#### Snippet
```java
                // U+0080..U+07FF
                buffer.setByte(position++, (byte)(0xC0 | ((c >> 6) & 0x1F)));
                buffer.setByte(position++, (byte)(0x80 | (c & 0x3F)));
            } else if ((c & 0xD800) != 0xD800 || (c > 0xDBFF)) {
                // U+0800..U+FFFF - excluding surrogate pairs
```

### AssignmentToMethodParameter
Assignment to method parameter `position`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/ProtonEncoderState.java`
#### Snippet
```java
            } else if ((c & 0xD800) != 0xD800 || (c > 0xDBFF)) {
                // U+0800..U+FFFF - excluding surrogate pairs
                buffer.setByte(position++, (byte)(0xE0 | ((c >> 12) & 0x0F)));
                buffer.setByte(position++, (byte)(0x80 | ((c >> 6) & 0x3F)));
                buffer.setByte(position++, (byte)(0x80 | (c & 0x3F)));
```

### AssignmentToMethodParameter
Assignment to method parameter `position`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/ProtonEncoderState.java`
#### Snippet
```java
                // U+0800..U+FFFF - excluding surrogate pairs
                buffer.setByte(position++, (byte)(0xE0 | ((c >> 12) & 0x0F)));
                buffer.setByte(position++, (byte)(0x80 | ((c >> 6) & 0x3F)));
                buffer.setByte(position++, (byte)(0x80 | (c & 0x3F)));
            } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `position`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/ProtonEncoderState.java`
#### Snippet
```java
                buffer.setByte(position++, (byte)(0xE0 | ((c >> 12) & 0x0F)));
                buffer.setByte(position++, (byte)(0x80 | ((c >> 6) & 0x3F)));
                buffer.setByte(position++, (byte)(0x80 | (c & 0x3F)));
            } else {
                int low;
```

### AssignmentToMethodParameter
Assignment to method parameter `position`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/ProtonEncoderState.java`
#### Snippet
```java
                c = 0x010000 + ((c & 0x03FF) << 10) + (low & 0x03FF);

                buffer.setByte(position++, (byte)(0xF0 | ((c >> 18) & 0x07)));
                buffer.setByte(position++, (byte)(0x80 | ((c >> 12) & 0x3F)));
                buffer.setByte(position++, (byte)(0x80 | ((c >> 6) & 0x3F)));
```

### AssignmentToMethodParameter
Assignment to method parameter `position`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/ProtonEncoderState.java`
#### Snippet
```java

                buffer.setByte(position++, (byte)(0xF0 | ((c >> 18) & 0x07)));
                buffer.setByte(position++, (byte)(0x80 | ((c >> 12) & 0x3F)));
                buffer.setByte(position++, (byte)(0x80 | ((c >> 6) & 0x3F)));
                buffer.setByte(position++, (byte)(0x80 | (c & 0x3F)));
```

### AssignmentToMethodParameter
Assignment to method parameter `position`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/ProtonEncoderState.java`
#### Snippet
```java
                buffer.setByte(position++, (byte)(0xF0 | ((c >> 18) & 0x07)));
                buffer.setByte(position++, (byte)(0x80 | ((c >> 12) & 0x3F)));
                buffer.setByte(position++, (byte)(0x80 | ((c >> 6) & 0x3F)));
                buffer.setByte(position++, (byte)(0x80 | (c & 0x3F)));
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `position`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/ProtonEncoderState.java`
#### Snippet
```java
                buffer.setByte(position++, (byte)(0x80 | ((c >> 12) & 0x3F)));
                buffer.setByte(position++, (byte)(0x80 | ((c >> 6) & 0x3F)));
                buffer.setByte(position++, (byte)(0x80 | (c & 0x3F)));
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `symbolBuffer`
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/Symbol.java`
#### Snippet
```java
                ProtonBuffer copy = ProtonBufferAllocator.defaultAllocator().allocate(symbolSize);
                copy.writeBytes(symbolBuffer);
                symbolBuffer = copy.convertToReadOnly();
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
     */
    public static short readShort(byte[] array, int offset) {
        return (short) ((array[offset++] & 0xFF) << 8 |
                        (array[offset++] & 0xFF) << 0);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
    public static short readShort(byte[] array, int offset) {
        return (short) ((array[offset++] & 0xFF) << 8 |
                        (array[offset++] & 0xFF) << 0);
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
     */
    public static byte[] writeShort(short value, byte[] destination, int offset) {
        destination[offset++] = (byte) (value >>> 8);
        destination[offset++] = (byte) (value >>> 0);

```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
    public static byte[] writeShort(short value, byte[] destination, int offset) {
        destination[offset++] = (byte) (value >>> 8);
        destination[offset++] = (byte) (value >>> 0);

        return destination;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
     */
    public static byte[] writeInt(int value, byte[] destination, int offset) {
        destination[offset++] = (byte) (value >>> 24);
        destination[offset++] = (byte) (value >>> 16);
        destination[offset++] = (byte) (value >>> 8);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
    public static byte[] writeInt(int value, byte[] destination, int offset) {
        destination[offset++] = (byte) (value >>> 24);
        destination[offset++] = (byte) (value >>> 16);
        destination[offset++] = (byte) (value >>> 8);
        destination[offset++] = (byte) (value >>> 0);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
        destination[offset++] = (byte) (value >>> 24);
        destination[offset++] = (byte) (value >>> 16);
        destination[offset++] = (byte) (value >>> 8);
        destination[offset++] = (byte) (value >>> 0);

```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
        destination[offset++] = (byte) (value >>> 16);
        destination[offset++] = (byte) (value >>> 8);
        destination[offset++] = (byte) (value >>> 0);

        return destination;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
     */
    public static long readLong(byte[] array, int offset) {
        return (long) (array[offset++] & 0xFF) << 56 |
               (long) (array[offset++] & 0xFF) << 48 |
               (long) (array[offset++] & 0xFF) << 40 |
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
    public static long readLong(byte[] array, int offset) {
        return (long) (array[offset++] & 0xFF) << 56 |
               (long) (array[offset++] & 0xFF) << 48 |
               (long) (array[offset++] & 0xFF) << 40 |
               (long) (array[offset++] & 0xFF) << 32 |
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
        return (long) (array[offset++] & 0xFF) << 56 |
               (long) (array[offset++] & 0xFF) << 48 |
               (long) (array[offset++] & 0xFF) << 40 |
               (long) (array[offset++] & 0xFF) << 32 |
               (long) (array[offset++] & 0xFF) << 24 |
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
               (long) (array[offset++] & 0xFF) << 48 |
               (long) (array[offset++] & 0xFF) << 40 |
               (long) (array[offset++] & 0xFF) << 32 |
               (long) (array[offset++] & 0xFF) << 24 |
               (long) (array[offset++] & 0xFF) << 16 |
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
               (long) (array[offset++] & 0xFF) << 40 |
               (long) (array[offset++] & 0xFF) << 32 |
               (long) (array[offset++] & 0xFF) << 24 |
               (long) (array[offset++] & 0xFF) << 16 |
               (long) (array[offset++] & 0xFF) << 8 |
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
               (long) (array[offset++] & 0xFF) << 32 |
               (long) (array[offset++] & 0xFF) << 24 |
               (long) (array[offset++] & 0xFF) << 16 |
               (long) (array[offset++] & 0xFF) << 8 |
               (long) (array[offset++] & 0xFF) << 0;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
               (long) (array[offset++] & 0xFF) << 24 |
               (long) (array[offset++] & 0xFF) << 16 |
               (long) (array[offset++] & 0xFF) << 8 |
               (long) (array[offset++] & 0xFF) << 0;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
               (long) (array[offset++] & 0xFF) << 16 |
               (long) (array[offset++] & 0xFF) << 8 |
               (long) (array[offset++] & 0xFF) << 0;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
     */
    public static byte[] writeLong(long value, byte[] destination, int offset) {
        destination[offset++] = (byte) (value >>> 56);
        destination[offset++] = (byte) (value >>> 48);
        destination[offset++] = (byte) (value >>> 40);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
    public static byte[] writeLong(long value, byte[] destination, int offset) {
        destination[offset++] = (byte) (value >>> 56);
        destination[offset++] = (byte) (value >>> 48);
        destination[offset++] = (byte) (value >>> 40);
        destination[offset++] = (byte) (value >>> 32);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
        destination[offset++] = (byte) (value >>> 56);
        destination[offset++] = (byte) (value >>> 48);
        destination[offset++] = (byte) (value >>> 40);
        destination[offset++] = (byte) (value >>> 32);
        destination[offset++] = (byte) (value >>> 24);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
        destination[offset++] = (byte) (value >>> 48);
        destination[offset++] = (byte) (value >>> 40);
        destination[offset++] = (byte) (value >>> 32);
        destination[offset++] = (byte) (value >>> 24);
        destination[offset++] = (byte) (value >>> 16);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
        destination[offset++] = (byte) (value >>> 40);
        destination[offset++] = (byte) (value >>> 32);
        destination[offset++] = (byte) (value >>> 24);
        destination[offset++] = (byte) (value >>> 16);
        destination[offset++] = (byte) (value >>> 8);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
        destination[offset++] = (byte) (value >>> 32);
        destination[offset++] = (byte) (value >>> 24);
        destination[offset++] = (byte) (value >>> 16);
        destination[offset++] = (byte) (value >>> 8);
        destination[offset++] = (byte) (value >>> 0);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
        destination[offset++] = (byte) (value >>> 24);
        destination[offset++] = (byte) (value >>> 16);
        destination[offset++] = (byte) (value >>> 8);
        destination[offset++] = (byte) (value >>> 0);

```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
        destination[offset++] = (byte) (value >>> 16);
        destination[offset++] = (byte) (value >>> 8);
        destination[offset++] = (byte) (value >>> 0);

        return destination;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
     */
    public static int readInt(byte[] array, int offset) {
        return (array[offset++] & 0xFF) << 24 |
               (array[offset++] & 0xFF) << 16 |
               (array[offset++] & 0xFF) << 8 |
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
    public static int readInt(byte[] array, int offset) {
        return (array[offset++] & 0xFF) << 24 |
               (array[offset++] & 0xFF) << 16 |
               (array[offset++] & 0xFF) << 8 |
               (array[offset++] & 0xFF) << 0;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
        return (array[offset++] & 0xFF) << 24 |
               (array[offset++] & 0xFF) << 16 |
               (array[offset++] & 0xFF) << 8 |
               (array[offset++] & 0xFF) << 0;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferUtils.java`
#### Snippet
```java
               (array[offset++] & 0xFF) << 16 |
               (array[offset++] & 0xFF) << 8 |
               (array[offset++] & 0xFF) << 0;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferInputStream.java`
#### Snippet
```java
        }

        len = Math.min(available, len);
        buffer.readBytes(b, off, len);
        return len;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonByteArrayBuffer.java`
#### Snippet
```java
            final int stopAfter = offset + (length >>> 3) * Long.BYTES;

            for (; offset < stopAfter; offset += Long.BYTES) {
                final long word = ProtonBufferUtils.readLong(array, offset(offset));

```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonByteArrayBuffer.java`
#### Snippet
```java
        }

        for (; offset < end; offset++) {
            if (array[offset(offset)] == needle) {
                return offset;
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonByteArrayBuffer.java`
#### Snippet
```java
        ProtonBufferUtils.checkIsReadOnly(this);

        length = Math.min(getWritableBytes(), length);

        if (length == 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonByteArrayBuffer.java`
#### Snippet
```java
        ProtonBufferUtils.checkIsReadOnly(this);

        length = Math.min(getWritableBytes(), length);

        if (length == 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty5ToProtonBufferAdapter.java`
#### Snippet
```java

                // Try to reduce bounds-checking by using larger primitives when possible.
                for (; length >= Long.BYTES; length -= Long.BYTES, offset += Long.BYTES, destOffset += Long.BYTES) {
                    destination.setLong(destOffset, getLong(offset));
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty5ToProtonBufferAdapter.java`
#### Snippet
```java

                // Try to reduce bounds-checking by using larger primitives when possible.
                for (; length >= Long.BYTES; length -= Long.BYTES, offset += Long.BYTES, destOffset += Long.BYTES) {
                    destination.setLong(destOffset, getLong(offset));
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `destOffset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty5ToProtonBufferAdapter.java`
#### Snippet
```java

                // Try to reduce bounds-checking by using larger primitives when possible.
                for (; length >= Long.BYTES; length -= Long.BYTES, offset += Long.BYTES, destOffset += Long.BYTES) {
                    destination.setLong(destOffset, getLong(offset));
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty5ToProtonBufferAdapter.java`
#### Snippet
```java
                    destination.setLong(destOffset, getLong(offset));
                }
                for (; length >= Integer.BYTES; length -= Integer.BYTES, offset += Integer.BYTES, destOffset += Integer.BYTES) {
                    destination.setInt(destOffset, getInt(offset));
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty5ToProtonBufferAdapter.java`
#### Snippet
```java
                    destination.setLong(destOffset, getLong(offset));
                }
                for (; length >= Integer.BYTES; length -= Integer.BYTES, offset += Integer.BYTES, destOffset += Integer.BYTES) {
                    destination.setInt(destOffset, getInt(offset));
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `destOffset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty5ToProtonBufferAdapter.java`
#### Snippet
```java
                    destination.setLong(destOffset, getLong(offset));
                }
                for (; length >= Integer.BYTES; length -= Integer.BYTES, offset += Integer.BYTES, destOffset += Integer.BYTES) {
                    destination.setInt(destOffset, getInt(offset));
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty5ToProtonBufferAdapter.java`
#### Snippet
```java
                    destination.setInt(destOffset, getInt(offset));
                }
                for (; length > 0; length--, offset++, destOffset++) {
                    destination.setByte(destOffset, getByte(offset));
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty5ToProtonBufferAdapter.java`
#### Snippet
```java
                    destination.setInt(destOffset, getInt(offset));
                }
                for (; length > 0; length--, offset++, destOffset++) {
                    destination.setByte(destOffset, getByte(offset));
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `destOffset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty5ToProtonBufferAdapter.java`
#### Snippet
```java
                    destination.setInt(destOffset, getInt(offset));
                }
                for (; length > 0; length--, offset++, destOffset++) {
                    destination.setByte(destOffset, getByte(offset));
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty4ToProtonBufferAdapter.java`
#### Snippet
```java
                }

                length -= toWrite;
                offset += toWrite;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty4ToProtonBufferAdapter.java`
#### Snippet
```java

                length -= toWrite;
                offset += toWrite;
            }
        } finally {
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
        try {
            // Try to reduce bounds-checking by using larger primitives when possible.
            for (; length >= Long.BYTES; length -= Long.BYTES, srcPos += Long.BYTES, destPos += Long.BYTES) {
                destination.setLong(destPos, getLong(srcPos));
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `srcPos`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
        try {
            // Try to reduce bounds-checking by using larger primitives when possible.
            for (; length >= Long.BYTES; length -= Long.BYTES, srcPos += Long.BYTES, destPos += Long.BYTES) {
                destination.setLong(destPos, getLong(srcPos));
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `destPos`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
        try {
            // Try to reduce bounds-checking by using larger primitives when possible.
            for (; length >= Long.BYTES; length -= Long.BYTES, srcPos += Long.BYTES, destPos += Long.BYTES) {
                destination.setLong(destPos, getLong(srcPos));
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
                destination.setLong(destPos, getLong(srcPos));
            }
            for (; length >= Integer.BYTES; length -= Integer.BYTES, srcPos += Integer.BYTES, destPos += Integer.BYTES) {
                destination.setInt(destPos, getInt(srcPos));
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `srcPos`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
                destination.setLong(destPos, getLong(srcPos));
            }
            for (; length >= Integer.BYTES; length -= Integer.BYTES, srcPos += Integer.BYTES, destPos += Integer.BYTES) {
                destination.setInt(destPos, getInt(srcPos));
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `destPos`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
                destination.setLong(destPos, getLong(srcPos));
            }
            for (; length >= Integer.BYTES; length -= Integer.BYTES, srcPos += Integer.BYTES, destPos += Integer.BYTES) {
                destination.setInt(destPos, getInt(srcPos));
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
                destination.setInt(destPos, getInt(srcPos));
            }
            for (; length > 0; length--, srcPos++, destPos++) {
                destination.setByte(destPos, getByte(srcPos));
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `srcPos`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
                destination.setInt(destPos, getInt(srcPos));
            }
            for (; length > 0; length--, srcPos++, destPos++) {
                destination.setByte(destPos, getByte(srcPos));
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `destPos`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
                destination.setInt(destPos, getInt(srcPos));
            }
            for (; length > 0; length--, srcPos++, destPos++) {
                destination.setByte(destPos, getByte(srcPos));
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
        @Override
        public ProtonBuffer setLong(int index, long value) {
            index -= parent.startIndices[chunk];

            for (int i = Long.BYTES - 1; i >= 0; --i) {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java

            for (int i = Long.BYTES - 1; i >= 0; --i) {
                parent.buffers[chunk].setByte(index++, (byte) (value >>> (i * Byte.SIZE)));
                if (parent.buffers[chunk].capacity() <= index) {
                    ++chunk;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
                if (parent.buffers[chunk].capacity() <= index) {
                    ++chunk;
                    index = 0;
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
                copy[i] = current.copy(copyPointOffset, available, readOnly);

                index += available;
                length -= available;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java

                index += available;
                length -= available;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
            buffer.copyInto(offset - startIndices[lastAccessedChunk], destination, destOffset, readBytes);

            offset += readBytes;
            length -= readBytes;
            destOffset += readBytes;
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java

            offset += readBytes;
            length -= readBytes;
            destOffset += readBytes;

```

### AssignmentToMethodParameter
Assignment to method parameter `destOffset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
            offset += readBytes;
            length -= readBytes;
            destOffset += readBytes;

            lastAccessedChunk++;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
                buffer.writeBytes(source, offset, writableBytes);

                offset += writableBytes;
                length -= writableBytes;
                writeOffset += writableBytes;
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java

                offset += writableBytes;
                length -= writableBytes;
                writeOffset += writableBytes;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
            buffer.copyInto(offset - startIndices[lastAccessedChunk], destination, destOffset, readBytes);

            offset += readBytes;
            length -= readBytes;
            destOffset += readBytes;
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java

            offset += readBytes;
            length -= readBytes;
            destOffset += readBytes;

```

### AssignmentToMethodParameter
Assignment to method parameter `destOffset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
            offset += readBytes;
            length -= readBytes;
            destOffset += readBytes;

            lastAccessedChunk++;
```

### AssignmentToMethodParameter
Assignment to method parameter `chain`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java

            if (chain.length > totalChunks) {
                chain = Arrays.copyOf(chain, totalChunks);
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java

            bytesRead += buffer.getReadableBytes();
            length -= buffer.getReadableBytes();
            readOffset = 0;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
            int result = 0;

            index -= parent.startIndices[chunk];

            for (int i = Integer.BYTES - 1; i >= 0; --i) {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java

            for (int i = Integer.BYTES - 1; i >= 0; --i) {
                result |= (parent.buffers[chunk].getByte(index++) & 0xFF) << (i * Byte.SIZE);
                if (parent.buffers[chunk].capacity() <= index) {
                    ++chunk;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
                if (parent.buffers[chunk].capacity() <= index) {
                    ++chunk;
                    index = 0;
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `position`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
            writeOffset = Math.addExact(writeOffset, read);
            bytesRead += read;
            position += read;
            lastAccessedChunk++;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java

            for (count = 0; count < composingBuffers.length && length > 0; ++count) {
                if ((length -= composingBuffers[count].remaining()) < 0) {
                    final ByteBuffer buffer = composingBuffers[count];
                    buffer.limit(buffer.limit() + length);
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
        @Override
        public ProtonBuffer setInt(int index, int value) {
            index -= parent.startIndices[chunk];

            for (int i = Integer.BYTES - 1; i >= 0; --i) {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java

            for (int i = Integer.BYTES - 1; i >= 0; --i) {
                parent.buffers[chunk].setByte(index++, (byte) (value >>> (i * Byte.SIZE)));
                if (parent.buffers[chunk].capacity() <= index) {
                    ++chunk;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
                if (parent.buffers[chunk].capacity() <= index) {
                    ++chunk;
                    index = 0;
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
            buffer.copyInto(offset - startIndices[lastAccessedChunk], destination, destOffset, readBytes);

            offset += readBytes;
            length -= readBytes;
            destOffset += readBytes;
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java

            offset += readBytes;
            length -= readBytes;
            destOffset += readBytes;

```

### AssignmentToMethodParameter
Assignment to method parameter `destOffset`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
            offset += readBytes;
            length -= readBytes;
            destOffset += readBytes;

            lastAccessedChunk++;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
            long result = 0;

            index -= parent.startIndices[chunk];

            for (int i = Long.BYTES - 1; i >= 0; --i) {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java

            for (int i = Long.BYTES - 1; i >= 0; --i) {
                result |= (long) (parent.buffers[chunk].getByte(index++) & 0xFF) << (i * Byte.SIZE);
                if (parent.buffers[chunk].capacity() <= index) {
                    ++chunk;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
                if (parent.buffers[chunk].capacity() <= index) {
                    ++chunk;
                    index = 0;
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/exceptions/ProtonExceptionSupport.java`
#### Snippet
```java

        if (message == null || message.isEmpty()) {
            message = cause.getMessage();
            if (message == null || message.length() == 0) {
                message = cause.toString();
```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/exceptions/ProtonExceptionSupport.java`
#### Snippet
```java
            message = cause.getMessage();
            if (message == null || message.length() == 0) {
                message = cause.toString();
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/sasl/client/AbstractScramSHAMechanism.java`
#### Snippet
```java

    private String escapeUsername(String name) {
        name = name.replace("=", "=3D");
        name = name.replace(",", "=2C");
        return name;
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/sasl/client/AbstractScramSHAMechanism.java`
#### Snippet
```java
    private String escapeUsername(String name) {
        name = name.replace("=", "=3D");
        name = name.replace(",", "=2C");
        return name;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/RingQueue.java`
#### Snippet
```java

    private static int advance(int value, int limit) {
        return (++value) % limit;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `bucketEntry`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
            if (nextBucket.getFreeSpace() + prevBucket.getFreeSpace() >= bucket.entries) {
                final int toCopyBackward = Math.min(prevBucket.getFreeSpace(), bucket.entries);
                final int nextEntryOffset = ++bucketEntry - (bucket.readOffset + toCopyBackward);

                if (nextEntryOffset < 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `bucketEntry`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
                // the next element otherwise it is the first element of the next bucket if it
                // non-empty otherwise we reached the end of the elements.
                if (++bucketEntry < bucket.writeOffset) {
                    result = (long) bucketIndex << 32;
                    result |= bucketEntry;
```

### AssignmentToMethodParameter
Assignment to method parameter `root`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
                // and then work from there to see if we can find the key
                if (root.left != null && compare(key, root.left.key) < 0) {
                    root = rightRotate(root);
                }

```

### AssignmentToMethodParameter
Assignment to method parameter `root`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
                }

                root = root.left;
                root.parent = null;
            } else if (compare(key, root.key) > 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `root`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
                // and then work from there to see if we can find the key
                if (root.right != null && compare(key, root.right.key) > 0) {
                    root = leftRotate(root);
                }

```

### AssignmentToMethodParameter
Assignment to method parameter `root`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
                }

                root = root.right;
                root.parent = null;
            } else {
```

## RuleId[ruleID=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
                        i += bufferCount - 1;

                        continue;
                    } else {
                        chain[i] = buffers[i].transfer();
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
                        // Buffer is now fully writable so reset the offsets
                        current.clear();
                        continue;
                    } else {
                        break;
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/ScriptedElement.java`
#### Snippet
```java
     */
    default ScriptedAction performAfterwards() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/LinkTracker.java`
#### Snippet
```java

    public Target getTarget() {
        return localAttach.getTarget() instanceof Target ? (Target) localAttach.getTarget() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/LinkTracker.java`
#### Snippet
```java

    public Target getRemoteTarget() {
        return remoteAttach.getTarget() instanceof Target ? (Target) remoteAttach.getTarget() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/LinkTracker.java`
#### Snippet
```java

    public Coordinator getCoordinator() {
        return localAttach.getTarget() instanceof Coordinator ? (Coordinator) localAttach.getTarget() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/LinkTracker.java`
#### Snippet
```java

    public Coordinator getRemoteCoordinator() {
        return remoteAttach.getTarget() instanceof Coordinator ? (Coordinator) remoteAttach.getTarget() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/SessionTracker.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                        break;
                    default:
                        return null;
                }
                return new IntegerElement(element.parent(), element.prev(), i);
```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                        break;
                    default:
                        return null;
                }
                return new LongElement(element.parent(), element.prev(), l);
```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/ArrayElement.java`
#### Snippet
```java
                break;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/CodecImpl.java`
#### Snippet
```java

        current = prev;
        return prev == null ? null : prev.getDataType();
    }

```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/CodecImpl.java`
#### Snippet
```java
            current = next;
        }
        return next == null ? null : next.getDataType();
    }

```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/CodecImpl.java`
#### Snippet
```java
    @Override
    public DataType type() {
        return current == null ? null : current.getDataType();
    }

```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/CodecImpl.java`
#### Snippet
```java
    @Override
    public Object getObject() {
        return current == null ? null : current.getValue();
    }

```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/transport/HeartBeat.java`
#### Snippet
```java
    @Override
    public Object getDescriptor() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/transport/AMQPHeader.java`
#### Snippet
```java
            return ByteBuffer.wrap(toArray());
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/transport/AMQPHeader.java`
#### Snippet
```java
            return Arrays.copyOf(buffer, buffer.length);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/primitives/Symbol.java`
#### Snippet
```java
    public static Symbol getSymbol(ByteBuffer symbolBuffer, boolean copyOnCreate) {
        if (symbolBuffer == null) {
            return null;
        } else if (!symbolBuffer.hasRemaining()) {
            return EMPTY_SYMBOL;
```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/primitives/Symbol.java`
#### Snippet
```java
    public static Symbol getSymbol(String stringValue) {
        if (stringValue == null) {
            return null;
        } else if (stringValue.isEmpty()) {
            return EMPTY_SYMBOL;
```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/primitives/Binary.java`
#### Snippet
```java

    public ByteBuffer asByteBuffer() {
        return buffer != null ? ByteBuffer.wrap(buffer) : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/NettyServer.java`
#### Snippet
```java
            return sslHandler.engine();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/NettyClient.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/AbstractPerformativeInjectAction.java`
#### Snippet
```java
     */
    public Buffer getPayload() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/SslSupport.java`
#### Snippet
```java
            return factory.getTrustManagers();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/SslSupport.java`
#### Snippet
```java
    private static KeyManager[] loadKeyManagers(ProtonTestServerOptions options) throws Exception {
        if (options.getKeyStoreLocation() == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/SslSupport.java`
#### Snippet
```java

        if (options.getTrustStoreLocation() == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/SslSupport.java`
#### Snippet
```java

        if (options.getTrustStoreLocation() == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/SslSupport.java`
#### Snippet
```java
            return factory.getTrustManagers();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/SslSupport.java`
#### Snippet
```java
    private static KeyManager[] loadKeyManagers(ProtonTestClientOptions options) throws Exception {
        if (options.getKeyStoreLocation() == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/matchers/types/EncodedPartialDataSectionMatcher.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/matchers/types/EncodedCompositingDataSectionMatcher.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/expectations/AbstractExpectation.java`
#### Snippet
```java

    protected Matcher<Buffer> getPayloadMatcher() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientDeliveryState.java`
#### Snippet
```java
    static org.apache.qpid.protonj2.types.transport.DeliveryState asProtonType(DeliveryState state) {
        if (state == null) {
            return null;
        } else if (state instanceof ClientDeliveryState) {
            return ((ClientDeliveryState) state).getProtonDeliveryState();
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientDeliveryState.java`
#### Snippet
```java
    static DeliveryState.Type fromOutcomeSymbol(Symbol outcome) {
        if (outcome == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientDeliveryState.java`
#### Snippet
```java
    static DeliveryState fromProtonType(org.apache.qpid.protonj2.types.messaging.Outcome outcome) {
        if (outcome == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientDeliveryState.java`
#### Snippet
```java
    static DeliveryState fromProtonType(org.apache.qpid.protonj2.types.transport.DeliveryState state) {
        if (state == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientDelivery.java`
#### Snippet
```java
            return StringUtils.toStringKeyedMap(deliveryAnnotations.getValue());
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientReceiver.java`
#### Snippet
```java
            checkClosedOrFailed();

            return null;
        } catch (InterruptedException e) {
            Thread.interrupted();
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientErrorCondition.java`
#### Snippet
```java
    static org.apache.qpid.protonj2.types.transport.ErrorCondition asProtonErrorCondition(ErrorCondition condition) {
        if (condition == null) {
            return null;
        } else if (condition instanceof ClientErrorCondition) {
            return ((ClientErrorCondition) condition).getProtonErrorCondition();
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientLinkType.java`
#### Snippet
```java
                return target.getAddress();
            } else {
                return null;
            }
        } else {
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientLinkType.java`
#### Snippet
```java
                return protonLink().getRemoteSource().getAddress();
            } else {
                return protonLink().getSource() != null ? protonLink().getSource().getAddress() : null;
            }
        }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientNextReceiverSelector.java`
#### Snippet
```java
        Collections.shuffle(candidates, srand);

        return candidates.isEmpty() ? null : candidates.get(0);
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientConversionSupport.java`
#### Snippet
```java
    public static DeliveryState.Type symbolToOutcome(Symbol outcome) {
        if (outcome == null) {
            return null;
        } else if (outcome.equals(Accepted.DESCRIPTOR_SYMBOL)) {
            return DeliveryState.Type.ACCEPTED;
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientConversionSupport.java`
#### Snippet
```java
    public static Symbol outcomeToSymbol(DeliveryState.Type outcome) {
        if (outcome == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/FifoDeliveryQueue.java`
#### Snippet
```java

            if (!isRunning()) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/FifoDeliveryQueue.java`
#### Snippet
```java
        synchronized (queue) {
            if (!isRunning()) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
            return messageAnnotations.getValue().remove(Symbol.valueOf(key));
        } else {
            return null;
        }
     }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
    @Override
    public String to() {
        return properties != null ? properties.getTo() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
    @Override
    public String groupId() {
        return properties != null ? properties.getGroupId() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
    @Override
    public String contentEncoding() {
        return properties != null ? properties.getContentEncoding() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
            return footer.getValue().remove(Symbol.valueOf(key));
        } else {
            return null;
        }
     }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
            return applicationProperties.getValue().remove(key);
        } else {
            return null;
        }
     }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
            return applicationProperties.getValue().get(key);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
    @Override
    public String contentType() {
        return properties != null ? properties.getContentType() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
    @Override
    public Object messageId() {
        return properties != null ? properties.getMessageId() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
    @Override
    public String replyTo() {
        return properties != null ? properties.getReplyTo() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
            return messageAnnotations.getValue().get(Symbol.valueOf(key));
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
    @Override
    public String replyToGroupId() {
        return properties != null ? properties.getReplyToGroupId() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
    @Override
    public Object correlationId() {
        return properties != null ? properties.getCorrelationId() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
        }

        return section != null ? section.getValue() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
    @Override
    public String subject() {
        return properties != null ? properties.getSubject() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessage.java`
#### Snippet
```java
            return footer.getValue().get(Symbol.valueOf(key));
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java
    @Override
    public Object messageId() {
        return properties != null ? properties.getMessageId() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java
    @Override
    public StreamTracker tracker() {
        return completed() ? tracker : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java
            return applicationProperties.getValue().remove(key);
        } else {
            return null;
        }
     }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java
    @Override
    public String groupId() {
        return properties != null ? properties.getGroupId() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java
    @Override
    public String contentType() {
        return properties != null ? properties.getContentType() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java
            return annotations.getValue().remove(Symbol.valueOf(key));
        } else {
            return null;
        }
     }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java
    @Override
    public String contentEncoding() {
        return properties != null ? properties.getContentEncoding() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java
    @Override
    public String subject() {
        return properties != null ? properties.getSubject() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java
    @Override
    public String replyToGroupId() {
        return properties != null ? properties.getReplyToGroupId() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java
    @Override
    public Object correlationId() {
        return properties != null ? properties.getCorrelationId() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java
            return properties.getUserId().asByteArray();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java
    @Override
    public String replyTo() {
        return properties != null ? properties.getReplyTo() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java
            return footer.getValue().remove(Symbol.valueOf(key));
        } else {
            return null;
        }
     }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSenderMessage.java`
#### Snippet
```java
    @Override
    public String to() {
        return properties != null ? properties.getTo() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientSession.java`
#### Snippet
```java
            return serializer.schedule(() -> request.failed(errorSupplier.get()), timeout, TimeUnit.MILLISECONDS);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/WebSocketTransport.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/WebSocketTransport.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
            return applicationProperties.getValue().get(key);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
            return footer;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
            return footer.getValue().get(Symbol.valueOf(key));
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
            return properties().getMessageId();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
            return properties().getReplyTo();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
            return properties().getContentType();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
            return properties().getTo();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
            return properties().getContentEncoding();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/SslSupport.java`
#### Snippet
```java
            return factory.getTrustManagers();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/SslSupport.java`
#### Snippet
```java
    private static KeyManagerFactory loadKeyManagerFactory(SslOptions options, SslProvider provider) throws Exception {
        if (options.keyStoreLocation() == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/SslSupport.java`
#### Snippet
```java
    private static KeyManager[] loadKeyManagers(SslOptions options) throws Exception {
        if (options.keyStoreLocation() == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/SslSupport.java`
#### Snippet
```java

        if (options.trustStoreLocation() == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
            return applicationProperties;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
            return annotations;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
            return annotations.getValue().get(Symbol.valueOf(key));
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
            return properties().getSubject();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
            return copyOfUserId;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
            return properties().getGroupId();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
            return properties().getReplyToGroupId();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamReceiverMessage.java`
#### Snippet
```java
            return properties().getCorrelationId();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/TcpTransport.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/TcpTransport.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/SslSupport.java`
#### Snippet
```java
    private static KeyManagerFactory loadKeyManagerFactory(SslOptions options, SslProvider provider) throws Exception {
        if (options.keyStoreLocation() == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/SslSupport.java`
#### Snippet
```java

        if (options.trustStoreLocation() == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/SslSupport.java`
#### Snippet
```java
    private static KeyManager[] loadKeyManagers(SslOptions options) throws Exception {
        if (options.keyStoreLocation() == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/SslSupport.java`
#### Snippet
```java
            return factory.getTrustManagers();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/UnknownDescribedTypeDecoder.java`
#### Snippet
```java
    @Override
    public final Symbol getDescriptorSymbol() {
        return getDescriptor() instanceof Symbol ? (Symbol) getDescriptor() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/UnknownDescribedTypeDecoder.java`
#### Snippet
```java
    @Override
    public final UnsignedLong getDescriptorCode() {
        return getDescriptor() instanceof UnsignedLong ? (UnsignedLong) getDescriptor() : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientMessageSupport.java`
#### Snippet
```java
    public static <E> Section<E> createSectionFromValue(E body) {
        if (body == null) {
            return null;
        } else if (body instanceof byte[]) {
            return (Section<E>) new Data((byte[]) body);
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return Double.longBitsToDouble(ProtonStreamUtils.readLong(stream));
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Double type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return new Decimal32(ProtonStreamUtils.readInt(stream));
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Decimal32 type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return UnsignedInteger.valueOf(ProtonStreamUtils.readInt(stream));
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Unsigned Integer type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return UnsignedByte.valueOf(ProtonStreamUtils.readByte(stream));
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Unsigned Byte type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return Character.valueOf((char) (ProtonStreamUtils.readInt(stream) & 0xFFFF));
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Character type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return ProtonStreamUtils.readInt(stream);
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Integer type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return new Decimal128(ProtonStreamUtils.readLong(stream), ProtonStreamUtils.readLong(stream));
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Decimal128 type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return string32Decoder.readValue(stream, state);
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected String type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return UnsignedShort.valueOf(ProtonStreamUtils.readShort(stream));
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Unsigned Short type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return ProtonStreamUtils.readByte(stream);
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Byte type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return ProtonStreamUtils.readLong(stream);
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Long type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return new UUID(ProtonStreamUtils.readLong(stream), ProtonStreamUtils.readLong(stream));
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected UUID type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return ProtonStreamUtils.readLong(stream);
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Timestamp type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return (Map<K, V>) map32Decoder.readValue(stream, state);
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Map type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return ProtonStreamUtils.readShort(stream);
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Short type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return UnsignedLong.valueOf(ProtonStreamUtils.readLong(stream));
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Unsigned Long type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return symbol32Decoder.readValue(stream, state);
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Symbol type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return Float.intBitsToFloat(ProtonStreamUtils.readInt(stream));
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Float type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return (List<V>) list32Decoder.readValue(stream, state);
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected List type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return ProtonStreamUtils.readByte(stream) == 0 ? Boolean.FALSE : Boolean.TRUE;
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Boolean type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java

        if (val == null) {
            return null;
        } else if (val.getClass().isArray()) {
            if (clazz.isAssignableFrom(val.getClass().getComponentType())) {
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java

        if (result == null) {
            return null;
        } else if (clazz.isAssignableFrom(result.getClass())) {
            return (T) result;
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return binary32Decoder.readValueAsBuffer(stream, state);
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Binary type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return new DeliveryTag.ProtonDeliveryTag(binary32Decoder.readValueAsArray(stream, state));
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Binary type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return binary32Decoder.readValue(stream, state);
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Binary type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
                return new Decimal64(ProtonStreamUtils.readLong(stream));
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Decimal64 type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return symbol32Decoder.readValue(buffer, state);
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Symbol type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return Character.valueOf((char) (buffer.readInt() & 0xffff));
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Character type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return new Decimal128(buffer.readLong(), buffer.readLong());
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Decimal128 type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return buffer.readShort();
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Short type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return (Map<K, V>) map32Decoder.readValue(buffer, state);
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Map type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return new UUID(buffer.readLong(), buffer.readLong());
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected UUID type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return buffer.readFloat();
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Float type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return buffer.readLong();
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Long type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return UnsignedLong.valueOf((buffer.readLong()));
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Unsigned Long type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java

        if (val == null) {
            return null;
        } else if (val.getClass().isArray()) {
            if (clazz.isAssignableFrom(val.getClass().getComponentType())) {
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return UnsignedInteger.valueOf((buffer.readInt()));
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Unsigned Integer type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return (List<V>) list32Decoder.readValue(buffer, state);
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected List type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return buffer.readByte() == 0 ? Boolean.FALSE : Boolean.TRUE;
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Boolean type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return buffer.readLong();
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Timestamp type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return new DeliveryTag.ProtonDeliveryTag(binary32Decoder.readValueAsArray(buffer, state));
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Binary type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return new Decimal32(buffer.readInt());
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Decimal32 type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return UnsignedByte.valueOf(buffer.readByte());
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Unsigned Byte type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java

        if (result == null) {
            return null;
        } else if (clazz.isAssignableFrom(result.getClass())) {
            return (T) result;
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return string32Decoder.readValue(buffer, state);
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected String type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return binary32Decoder.readValue(buffer, state);
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Binary type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return buffer.readDouble();
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Double type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return new Decimal64(buffer.readLong());
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Decimal64 type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return binary32Decoder.readValueAsBuffer(buffer, state);
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Binary type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return buffer.readByte();
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Byte type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return buffer.readInt();
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Integer type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
                return UnsignedShort.valueOf(buffer.readShort());
            case EncodingCodes.NULL:
                return null;
            default:
                throw new DecodeException("Expected Unsigned Short type but found encoding: " + EncodingCodes.toString(encodingCode));
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/Binary.java`
#### Snippet
```java
     */
    public ProtonBuffer asProtonBuffer() {
        return buffer == null ? null : buffer.copy(true);
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/Symbol.java`
#### Snippet
```java
    public static Symbol getSymbol(ProtonBuffer symbolBuffer, boolean copyOnCreate) {
        if (symbolBuffer == null) {
            return null;
        } else if (symbolBuffer.getReadableBytes() == 0) {
            return EMPTY_SYMBOL;
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/Symbol.java`
#### Snippet
```java
    public static Symbol getSymbol(String stringValue) {
        if (stringValue == null) {
            return null;
        } else if (stringValue.isEmpty()) {
            return EMPTY_SYMBOL;
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/messaging/Data.java`
#### Snippet
```java
     */
    public ProtonBuffer getBuffer() {
        return buffer == null ? null : buffer.copy(true);
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transport/AMQPHeader.java`
#### Snippet
```java
            return copy;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/types/transport/AMQPHeader.java`
#### Snippet
```java
            return ByteBuffer.wrap(copy);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/ProtonBufferInputStream.java`
#### Snippet
```java
        int available = available();
        if (available == 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonByteArrayBuffer.java`
#### Snippet
```java
    @Override
    public ProtonBufferComponent next() {
        return null; // There is never a next.
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty5ToProtonBufferAdapter.java`
#### Snippet
```java
            }

            return current != null ? this : null;
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty5ToProtonBufferAdapter.java`
#### Snippet
```java
    @Override
    public ProtonBufferComponent next() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/Netty4ToProtonBufferAdapter.java`
#### Snippet
```java
    @Override
    public ProtonBufferComponent next() {
        return null; // For now we don't try and expose Netty composites
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
        @Override
        public T first() {
            return (current = accessor.first()) != null ? (T) this : null;
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
            }

            return current != null ? (T) this : null;
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/netty/ProtonBufferToNetty5Adapter.java`
#### Snippet
```java
        try {
            resource.setUnsignedShort(woff, (short)(value & 0x0000FFFF));
            return null;
        } catch (RuntimeException ex) {
            throw translateToNettyException(ex);
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEngineNoOpSaslDriver.java`
#### Snippet
```java
    @Override
    public SaslOutcome getSaslOutcome() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonAttachments.java`
#### Snippet
```java
    @Override
    public <T> T get(String key) {
        return contextMap == null ? null : (T) contextMap.get(key);
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSession.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSession.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSession.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSession.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSession.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSession.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSession.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEnginePipeline.java`
#### Snippet
```java
    @Override
    public EngineHandlerContext lastContext() {
        return tail.previous == head ? null : tail.previous;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEnginePipeline.java`
#### Snippet
```java
    @Override
    public EngineHandler last() {
        return tail.previous == head ? null : tail.previous.handler();
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEnginePipeline.java`
#### Snippet
```java
    @Override
    public EngineHandler first() {
        return head.next == tail ? null : head.next.handler();
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEnginePipeline.java`
#### Snippet
```java
    @Override
    public EngineHandlerContext firstContext() {
        return head.next == tail ? null : head.next;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
    @Override
    public String getRemoteHostname() {
        return remoteOpen == null ? null : remoteOpen.getHostname();
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
    @Override
    public String getRemoteContainerId() {
        return remoteOpen == null ? null : remoteOpen.getContainerId();
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
            }

            return currentComponent == null ? null : this;
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
            }

            return currentComponent == null ? null : this;
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonLink.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonLink.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonLink.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonLink.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonLink.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonLink.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonLink.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonLink.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonLink.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonLink.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonLink.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/sasl/ProtonEngineSaslDriver.java`
#### Snippet
```java
    @Override
    public SaslOutcome getSaslOutcome() {
        return context == null ? null : context.getSaslOutcome();
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/sasl/ProtonSaslContext.java`
#### Snippet
```java
    @Override
    public Symbol[] getServerMechanisms() {
        return serverMechanisms != null ? Arrays.copyOf(serverMechanisms, serverMechanisms.length) : null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/sasl/client/SaslMechanismSelector.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/sasl/client/CramMD5Mechanism.java`
#### Snippet
```java
    @Override
    public ProtonBuffer getInitialResponse(SaslCredentialsProvider credentials) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/DeliveryIdTracker.java`
#### Snippet
```java
     */
    public UnsignedInteger toUnsignedInteger() {
        return empty ? null : UnsignedInteger.valueOf(deliveryId);
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/RingQueue.java`
#### Snippet
```java
    @Override
    public E peek() {
        return isEmpty() ? null : (E) backingArray[read];
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/logging/NoOpProtonLogger.java`
#### Snippet
```java
    @Override
    public String getName() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
    public Delivery get(int deliveryId) {
        if (totalEntries == 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/UnsettledMap.java`
#### Snippet
```java
        modCount++;

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
    public E get(int key) {
        if (root == null) {
            return null;
        } else if (root.key == key) {
            return root.value;
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
                return root.value;
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
    private SplayedEntry<E> findEntry(int key) {
        if (root == null) {
            return null;
        } else if (root.key == key) {
            return root;
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
                return root;
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        public final UnsignedInteger ceilingKey(UnsignedInteger key) {
            SplayedEntry<E> result = getCeilingEntry(key.intValue());
            return result == null ? null : result.getKey();
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
                    root = splay(root, succ.key);
                } else {
                    return null;
                }
            } else {
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java

        public final E get(int key) {
            return !isInRange(key) ? null :  backingMap.get(key);
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
            SplayedEntry<E> e = backingMap.getFloorEntry(key);

            return (e == null || isToLow(e.key)) ? null : e;
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
                startInclusive ? backingMap.getCeilingEntry(startKey) : backingMap.getHigherEntry(startKey);

            return (e == null || isToHigh(e.key)) ? null : e;
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java

        public final E remove(int key) {
            return !isInRange(key) ? null : backingMap.remove(key);
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        public final UnsignedInteger lowerKey(UnsignedInteger key) {
            SplayedEntry<E> result = getLowerEntry(key.intValue());
            return result == null ? null : result.getKey();
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        final SplayedEntry<E> result = splayToHigherEntry(key.intValue());

        return result == null ? null : result.getKey();
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
            SplayedEntry<E> e = backingMap.getCeilingEntry(key);

            return (e == null || isToHigh(e.key)) ? null : e;
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        root = splay(root, key);
        if (root == null || root.key != key || root.value == null) {
            return null;
        } else {
            return root.setValue(value);
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        final SplayedEntry<E> result = splayToCeilingEntry(key.intValue());

        return result == null ? null : result.getKey();
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
    private static <E> SplayedEntry<E> predecessor(SplayedEntry<E> node) {
        if (node == null) {
            return null;
        } else if (node.left != null) {
            // Walk to bottom of tree from this node's left child.
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
            SplayedEntry<E> e = backingMap.getLowerEntry(key);

            return (e == null || isToLow(e.key)) ? null : e;
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
                    root = splay(root, succ.key);
                } else {
                    return null;
                }
            } else {
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
    @Override
    public UnsignedInteger lastKey() {
        return isEmpty() ? null : lastEntry(root).getKey();
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
                endInclusive ? backingMap.getFloorEntry(endKey) : backingMap.getLowerEntry(endKey);

            return (e == null || isToLow(e.key)) ? null : e;
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        E result = get(key);
        if (result == null && root != null && root.key == key) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        final SplayedEntry<E> result = splayToLowerEntry(key.intValue());

        return result == null ? null : result.getKey();
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
                    root = splay(root, pred.key);
                } else {
                    return null;
                }
            } else {
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
    public E remove(int key) {
        if (root == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        root = splay(root, key);
        if (root.key != key) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        public final UnsignedInteger higherKey(UnsignedInteger key) {
            SplayedEntry<E> result = getHigherEntry(key.intValue());
            return result == null ? null : result.getKey();
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
    @Override
    public UnsignedInteger firstKey() {
        return isEmpty() ? null : firstEntry(root).getKey();
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        final SplayedEntry<E> result = splayToFloorEntry(key.intValue());

        return result == null ? null : result.getKey();
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
    private static <E> SplayedEntry<E> successor(SplayedEntry<E> node) {
        if (node == null) {
            return null;
        } else if (node.right != null) {
            // Walk to bottom of tree from this node's right child.
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
            SplayedEntry<E> e = backingMap.getHigherEntry(key);

            return (e == null || isToHigh(e.key)) ? null : e;
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        public final UnsignedInteger floorKey(UnsignedInteger key) {
            SplayedEntry<E> result = getFloorEntry(key.intValue());
            return result == null ? null : result.getKey();
        }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java

    protected static <V> ImmutableSplayMapEntry<V> export(SplayedEntry<V> entry) {
        return entry == null ? null : new ImmutableSplayMapEntry<>(entry);
    }

```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
                    root = splay(root, pred.key);
                } else {
                    return null;
                }
            } else {
```

### ReturnNull
Return of `null`
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/SplayMap.java`
#### Snippet
```java
        modCount++;

        return null;
    }

```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `oldParent` is redundant
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/CodecImpl.java`
#### Snippet
```java
    public boolean exit() {
        if (parent != null) {
            Element<?> oldParent = this.parent;
            current = oldParent;
            parent = current.parent();
```

### UnnecessaryLocalVariable
Local variable `s` is redundant
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/util/TimeUtils.java`
#### Snippet
```java
        if (uptime < 60) {
            long minutes = (long) uptime;
            String s = fmtI.format(minutes) + (minutes > 1 ? " minutes" : " minute");
            return s;
        }
```

### UnnecessaryLocalVariable
Local variable `buffer` is redundant
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientStreamSender.java`
#### Snippet
```java

        final ClientFuture<StreamTracker> operation = session.getFutureFactory().createFuture();
        final ProtonBuffer buffer = payload;
        final ClientOutgoingEnvelope envelope = new ClientOutgoingEnvelope(
            this, context.getProtonDelivery(), messageFormat, buffer, context.completed(), operation);
```

### UnnecessaryLocalVariable
Local variable `describedTypeDecoder` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
    @Override
    public <V> ProtonStreamDecoder registerDescribedTypeDecoder(StreamDescribedTypeDecoder<V> decoder) {
        StreamDescribedTypeDecoder<?> describedTypeDecoder = decoder;

        // Cache AMQP type decoders in the quick lookup array.
```

### UnnecessaryLocalVariable
Local variable `describedTypeDecoder` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
    @Override
    public <V> ProtonDecoder registerDescribedTypeDecoder(DescribedTypeDecoder<V> decoder) {
        DescribedTypeDecoder<?> describedTypeDecoder = decoder;

        // Cache AMQP type decoders in the quick lookup array.
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
                }

                final ProtonBuffer result = chain[next++];

                return result;
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/LinkedSplayMap.java`
#### Snippet
```java
            final int initialModCount = modCount;

            final SplayedEntry<E> root = LinkedSplayMap.this.entries;

            for (SplayedEntry<E> entry = root.linkNext; entry != entries; entry = entry.linkNext) {
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/LinkedSplayMap.java`
#### Snippet
```java
            final int initialModCount = modCount;

            final SplayedEntry<E> root = LinkedSplayMap.this.entries;
            for (SplayedEntry<E> entry = root.linkNext; entry != entries; entry = entry.linkNext) {
                action.accept(entry.getKey());
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/util/LinkedSplayMap.java`
#### Snippet
```java
            final int initialModCount = modCount;

            final SplayedEntry<E> root = LinkedSplayMap.this.entries;
            for (SplayedEntry<E> entry = root.linkNext; entry != entries; entry = entry.linkNext) {
                action.accept(entry.value);
```

## RuleId[ruleID=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy 4 fields
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/StreamSenderOptions.java`
#### Snippet
```java
     *      The options instance to copy all configuration values from.
     */
    public StreamSenderOptions(StreamSenderOptions options) {
        if (options != null) {
            options.copyInto(this);
```

### CopyConstructorMissesField
Copy constructor does not copy fields 'streamSize' and 'completeSendOnClose'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/OutputStreamOptions.java`
#### Snippet
```java
     *      The options instance to copy all configuration values from.
     */
    public OutputStreamOptions(OutputStreamOptions options) {
        if (options != null) {
            options.copyInto(this);
```

### CopyConstructorMissesField
Copy constructor does not copy fields 'drainTimeout', 'autoAccept' and 'creditWindow'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/ReceiverOptions.java`
#### Snippet
```java
     * 		The ReceiverOptions instance whose settings are to be copied into this one.
     */
    public ReceiverOptions(ReceiverOptions options) {
        if (options != null) {
            options.copyInto(this);
```

### CopyConstructorMissesField
Copy constructor does not copy fields 'sendTimeout' and 'tagGeneratorSupplier'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/SenderOptions.java`
#### Snippet
```java
     * 		The SenderOptions instance whose settings are to be copied into this one.
     */
    public SenderOptions(SenderOptions options) {
        if (options != null) {
            options.copyInto(this);
```

### CopyConstructorMissesField
Copy constructor does not copy 4 fields
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/StreamReceiverOptions.java`
#### Snippet
```java
     *      The options instance to copy all configuration values from.
     */
    public StreamReceiverOptions(StreamReceiverOptions options) {
        if (options != null) {
            options.copyInto(this);
```

### CopyConstructorMissesField
Copy constructor does not copy fields 'id' and 'futureType'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/ClientOptions.java`
#### Snippet
```java
     * 		The ClientOptions instance whose settings are to be copied into this one.
     */
    public ClientOptions(ClientOptions options) {
        if (options != null) {
            options.copyInto(this);
```

### CopyConstructorMissesField
Copy constructor does not copy 8 fields
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/ReconnectOptions.java`
#### Snippet
```java
     *      The {@link ReconnectOptions} instance whose configuration should be copied to this one.
     */
    public ReconnectOptions(ReconnectOptions options) {
        if (options != null) {
            options.copyInto(this);
```

### CopyConstructorMissesField
Copy constructor does not copy 9 fields
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/LinkOptions.java`
#### Snippet
```java
     * 		The LinkOptions instance whose settings are to be copied into this one.
     */
    public LinkOptions(LinkOptions<T> options) {
        if (options != null) {
            options.copyInto(this);
```

### CopyConstructorMissesField
Copy constructor does not copy 11 fields
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/SessionOptions.java`
#### Snippet
```java
     * 		The SessionOptions instance whose settings are to be copied into this one.
     */
    public SessionOptions(SessionOptions options) {
        if (options != null) {
            options.copyInto(this);
```

### CopyConstructorMissesField
Copy constructor does not copy 20 fields
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/ConnectionOptions.java`
#### Snippet
```java
     *      The {@link ConnectionOptions} instance whose configuration should be copied to this one.
     */
    public ConnectionOptions(ConnectionOptions options) {
        if (options != null) {
            options.copyInto(this);
```

### CopyConstructorMissesField
Copy constructor does not copy fields 'implicitGrowthLimit' and 'closed'
in `protonj2/src/main/java/org/apache/qpid/protonj2/buffer/impl/ProtonCompositeBufferImpl.java`
#### Snippet
```java
     * 		The other composite buffer we are capturing here.
     */
    private ProtonCompositeBufferImpl(ProtonCompositeBufferImpl other) {
        this.buffers = other.buffers;
        this.startIndices = other.startIndices;
```

## RuleId[ruleID=ThrowableNotThrown]
### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientTransportListener.java`
#### Snippet
```java
        if (!engine.isShutdown()) {
            LOG.debug("Transport failed: {}", error.getMessage());
            engine.engineFailed(ClientExceptionSupport.convertToConnectionClosedException(error));
        }
    }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientTransportListener.java`
#### Snippet
```java
        } catch (EngineStateException e) {
            LOG.warn("Caught problem during incoming data processing: {}", e.getMessage(), e);
            engine.engineFailed(ClientExceptionSupport.createOrPassthroughFatal(e));
        } finally {
            connection.autoFlushOn();
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientConnection.java`
#### Snippet
```java
                    } catch (Throwable ignore) {}

                    connection.getEngine().engineFailed(new ClientOperationTimedOutException(
                        "Connection Open timed out waiting for remote to open"));
                }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientConnection.java`
#### Snippet
```java

            try {
                connection.getEngine().engineFailed(failureCause);
            } catch (Throwable ignore) {
            }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientConnection.java`
#### Snippet
```java
            transport.connect(location.getHost(), location.getPort(), new ClientTransportListener(this, engine));
        } catch (Throwable error) {
            engine.engineFailed(ClientExceptionSupport.createOrPassthroughFatal(error));
        }
    }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonPerformativeHandler.java`
#### Snippet
```java
        // appropriate changes to our engine state.
        if (!engine.isFailed()) {
            engine.engineFailed(failure.getCause());
        }
    }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSessionIncomingWindow.java`
#### Snippet
```java
            int previousId = lastDeliveryid.intValue();
            if (lastDeliveryid.increment().compareTo((int) deliveryId) != 0) {
                session.getConnection().getEngine().engineFailed(
                    new ProtocolViolationException("Expected delivery-id " + previousId + ", got " + deliveryId));
            }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSession.java`
#### Snippet
```java
        final ProtonLink<?> link = remoteLinks.get((int) transfer.getHandle());
        if (link == null) {
            getEngine().engineFailed(new ProtocolViolationException(
                "Received uncorrelated handle on Transfer from remote: " + channel));
        } else if (!link.isRemotelyOpen()) {
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSession.java`
#### Snippet
```java
                "Received uncorrelated handle on Transfer from remote: " + channel));
        } else if (!link.isRemotelyOpen()) {
            getEngine().engineFailed(new ProtocolViolationException("Received Transfer for detached Receiver: " + link));
        } else {
            incomingWindow.handleTransfer(link, transfer, payload);
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSession.java`
#### Snippet
```java
        final ProtonLink<?> link = remoteLinks.remove((int) detach.getHandle());
        if (link == null) {
            getEngine().engineFailed(new ProtocolViolationException(
                "Received uncorrelated handle on Detach from remote: " + channel));
            return;
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonSession.java`
#### Snippet
```java
            final ProtonLink<?> link = remoteLinks.get((int) flow.getHandle());
            if (link == null) {
                getEngine().engineFailed(new ProtocolViolationException(
                    "Received uncorrelated handle on Flow from remote: " + channel));
                return;
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEngine.java`
#### Snippet
```java
                    connection.setCondition(condition);
                    connection.close();
                    engineFailed(new IdleTimeoutException("Remote idle timeout detected"));
                } else {
                    localIdleDeadline = computeDeadline(currentTime, localIdleTimeout);
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEnginePipeline.java`
#### Snippet
```java
            tail.fireRead(header);
        } catch (Throwable error) {
            engine.engineFailed(error);
            throw error;
        }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEnginePipeline.java`
#### Snippet
```java
            head.fireWrite(envelope);
        } catch (Throwable error) {
            engine.engineFailed(error);
            throw error;
        }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEnginePipeline.java`
#### Snippet
```java
                    current.fireEngineStarting();
                } catch (Throwable error) {
                    engine.engineFailed(error);
                    break;
                }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEnginePipeline.java`
#### Snippet
```java
            tail.fireRead(envelope);
        } catch (Throwable error) {
            engine.engineFailed(error);
            throw error;
        }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEnginePipeline.java`
#### Snippet
```java
            tail.fireRead(input);
        } catch (Throwable error) {
            engine.engineFailed(error);
            throw error;
        }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEnginePipeline.java`
#### Snippet
```java
            head.fireWrite(envelope);
        } catch (Throwable error) {
            engine.engineFailed(error);
            throw error;
        }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEnginePipeline.java`
#### Snippet
```java
            head.fireEngineStateChanged();
        } catch (Throwable error) {
            engine.engineFailed(error);
        }
        return this;
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEnginePipeline.java`
#### Snippet
```java
                    removed.handler().handlerRemoved(removed);
                } catch (Throwable e) {
                    engine.engineFailed(e);
                }
            }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEnginePipeline.java`
#### Snippet
```java
            newFirst.handler().handlerAdded(newFirst);
        } catch (Throwable e) {
            engine.engineFailed(e);
        }

```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEnginePipeline.java`
#### Snippet
```java
            tail.fireRead(envelope);
        } catch (Throwable error) {
            engine.engineFailed(error);
            throw error;
        }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEnginePipeline.java`
#### Snippet
```java
                oldLast.handler().handlerRemoved(oldLast);
            } catch (Throwable e) {
                engine.engineFailed(e);
            }
        }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEnginePipeline.java`
#### Snippet
```java
            head.fireWrite(buffer, ioComplete);
        } catch (Throwable error) {
            engine.engineFailed(error);
            throw error;
        }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEnginePipeline.java`
#### Snippet
```java
            newLast.handler().handlerAdded(newLast);
        } catch (Throwable e) {
            engine.engineFailed(e);
        }

```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEnginePipeline.java`
#### Snippet
```java
                oldFirst.handler().handlerRemoved(oldFirst);
            } catch (Throwable e) {
                engine.engineFailed(e);
            }
        }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEnginePipeline.java`
#### Snippet
```java
            head.fireWrite(envelope);
        } catch (Throwable error) {
            engine.engineFailed(error);
            throw error;
        }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonEnginePipeline.java`
#### Snippet
```java
                    removed.handler().handlerRemoved(removed);
                } catch (Throwable e) {
                    engine.engineFailed(e);
                }
            }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
        final ProtonSession session = remoteSessions.get(channel);
        if (session == null) {
            engine.engineFailed(new ProtocolViolationException("Received uncorrelated channel on Detach from remote: " + channel));
        } else {
            session.remoteDetach(detach, channel);
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
            // due to it being cleaned up by GC,
            if (zombieSessions.remove(channel) == null) {
                engine.engineFailed(new ProtocolViolationException("Received uncorrelated channel on End from remote: " + channel));
            }
        } else {
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
    public void handleOpen(Open open, ProtonBuffer payload, int channel, ProtonEngine context) {
        if (remoteOpen != null) {
            context.engineFailed(new ProtocolViolationException("Received second Open for Connection from remote"));
            return;
        }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
            setCondition(new ErrorCondition(ConnectionError.FRAMING_ERROR, "Channel Max Exceeded for session Begin")).close();
        } else if (remoteSessions.containsKey(channel)) {
            context.engineFailed(new ProtocolViolationException("Received second begin for Session from remote"));
        } else {
            // If there is a remote channel then this is an answer to a local open of a session, otherwise
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
                    } else {
                        setCondition(new ErrorCondition(AmqpError.PRECONDITION_FAILED, "No matching session found for remote channel given")).close();
                        engine.engineFailed(new ProtocolViolationException("Received uncorrelated channel on Begin from remote: " + localSessionChannel));
                        return;
                    }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
        final ProtonSession session = remoteSessions.get(channel);
        if (session == null) {
            engine.engineFailed(new ProtocolViolationException("Received uncorrelated channel on Attach from remote: " + channel));
        } else {
            session.remoteAttach(attach, channel);
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
        final ProtonSession session = remoteSessions.get(channel);
        if (session == null) {
            engine.engineFailed(new ProtocolViolationException("Received uncorrelated channel on Disposition from remote: " + channel));
        } else {
            session.remoteDisposition(disposition, channel);
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
        final ProtonSession session = remoteSessions.get(channel);
        if (session == null) {
            engine.engineFailed(new ProtocolViolationException("Received uncorrelated channel on Flow from remote: " + channel));
        } else {
            session.remoteFlow(flow, channel);
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
    @Override
    public void handleSASLHeader(AMQPHeader header, ProtonEngine context) {
        context.engineFailed(new ProtocolViolationException("Received unexpected SASL Header"));
    }

```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonConnection.java`
#### Snippet
```java
        final ProtonSession session = remoteSessions.get(channel);
        if (session == null) {
            engine.engineFailed(new ProtocolViolationException("Received uncorrelated channel on Transfer from remote: " + channel));
        } else {
            session.remoteTransfer(transfer, payload, channel);
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/sasl/ProtonSaslServerContext.java`
#### Snippet
```java
        if (!isDone()) {
            done(org.apache.qpid.protonj2.engine.sasl.SaslOutcome.SASL_PERM);
            saslHandler.engine().engineFailed(failure);
        }
        return this;
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/sasl/ProtonSaslClientContext.java`
#### Snippet
```java
                }
            } else {
                context.engine().engineFailed(saslFailure);
            }
        }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/sasl/ProtonSaslClientContext.java`
#### Snippet
```java
        if (!isDone()) {
            done(org.apache.qpid.protonj2.engine.sasl.SaslOutcome.SASL_PERM);
            saslHandler.engine().engineFailed(failure);
        }

```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonReceiver.java`
#### Snippet
```java
    private void verifyNewDeliveryIdSequence(Transfer transfer, DeliveryIdTracker currentDeliveryId) {
        if (!transfer.hasDeliveryId()) {
            getEngine().engineFailed(
                new ProtocolViolationException("No delivery-id specified on first Transfer of new delivery"));
        }
```

### ThrowableNotThrown
Result of `engineFailed()` not thrown
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/impl/ProtonReceiver.java`
#### Snippet
```java

        if (!currentDeliveryId.isEmpty()) {
            getEngine().engineFailed(
                new ProtocolViolationException("Illegal multiplex of deliveries on same link with delivery-id " +
                                               currentDeliveryId + " and " + transfer.getDeliveryId()));
```

## RuleId[ruleID=RedundantFileCreation]
### RedundantFileCreation
`new File` is redundant
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/netty/SslSupport.java`
#### Snippet
```java
    private static KeyStore loadStore(String storePath, final String password, String storeType) throws Exception {
        KeyStore store = KeyStore.getInstance(storeType);
        try (InputStream in = new FileInputStream(new File(storePath));) {
            store.load(in, password != null ? password.toCharArray() : null);
        }
```

### RedundantFileCreation
`new File` is redundant
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty4/SslSupport.java`
#### Snippet
```java
    private static KeyStore loadStore(String storePath, final String password, String storeType) throws Exception {
        KeyStore store = KeyStore.getInstance(storeType);
        try (InputStream in = new FileInputStream(new File(storePath));) {
            store.load(in, password != null ? password.toCharArray() : null);
        }
```

### RedundantFileCreation
`new File` is redundant
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/transport/netty5/SslSupport.java`
#### Snippet
```java
    private static KeyStore loadStore(String storePath, final String password, String storeType) throws Exception {
        KeyStore store = KeyStore.getInstance(storeType);
        try (InputStream in = new FileInputStream(new File(storePath));) {
            store.load(in, password != null ? password.toCharArray() : null);
        }
```

## RuleId[ruleID=PointlessBooleanExpression]
### PointlessBooleanExpression
`getRole().booleanValue() == true` can be simplified to 'getRole().booleanValue()'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/transport/Attach.java`
#### Snippet
```java

    public boolean isReceiver() {
        return getRole().booleanValue() == true;
    }

```

### PointlessBooleanExpression
`getRole().booleanValue() == false` can be simplified to '!getRole().booleanValue()'
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/codec/transport/Attach.java`
#### Snippet
```java

    public boolean isSender() {
        return getRole().booleanValue() == false;
    }

```

### PointlessBooleanExpression
`value == true` can be simplified to 'value'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/encoders/primitives/BooleanTypeEncoder.java`
#### Snippet
```java
     */
    public void writeType(ProtonBuffer buffer, EncoderState state, boolean value) {
        buffer.writeByte(value == true ? EncodingCodes.BOOLEAN_TRUE : EncodingCodes.BOOLEAN_FALSE);
    }

```

## RuleId[ruleID=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `protonj2-test-driver/src/main/java/org/apache/qpid/protonj2/test/driver/actions/AttachInjectAction.java`
#### Snippet
```java
            Map<Binary, DescribedType> converted = new LinkedHashMap<>();
            for (Entry<Binary, DeliveryState> entry : unsettled.entrySet()) {
                converted.put(entry.getKey(), entry.getValue());
            }

```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `protonj2/src/main/java/org/apache/qpid/protonj2/engine/sasl/client/SaslMechanismSelector.java`
#### Snippet
```java
        Set<Symbol> candidates = new LinkedHashSet<>(serverMechs.length);
        for (Symbol serverMech : serverMechs) {
            candidates.add(serverMech);
        }

```

## RuleId[ruleID=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'info' to 'Map'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientExceptionSupport.java`
#### Snippet
```java
        } else {
            @SuppressWarnings("unchecked")
            ClientRedirect redirect = new ClientRedirect((Map<Symbol, Object>) info);

            try {
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'info' to 'Map'
in `protonj2-client/src/main/java/org/apache/qpid/protonj2/client/impl/ClientExceptionSupport.java`
#### Snippet
```java
        } else {
            @SuppressWarnings("unchecked")
            ClientRedirect redirect = new ClientRedirect((Map<Symbol, Object>) info);

            try {
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'streamTypeDecoder' to 'UnknownDescribedTypeDecoder'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonStreamDecoder.java`
#### Snippet
```java
        };

        describedTypeDecoders.put(descriptor, (UnknownDescribedTypeDecoder) streamTypeDecoder);

        return streamTypeDecoder;
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'typeDecoder' to 'UnknownDescribedTypeDecoder'
in `protonj2/src/main/java/org/apache/qpid/protonj2/codec/decoders/ProtonDecoder.java`
#### Snippet
```java
        };

        describedTypeDecoders.put(descriptor, (UnknownDescribedTypeDecoder) typeDecoder);

        return typeDecoder;
```

